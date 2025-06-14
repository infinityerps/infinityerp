package it.embio.exportdata.ad_forms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Vector;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.openbravo.base.filter.RequestFilter;
import org.openbravo.base.filter.ValueListFilter;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBDal;
import org.openbravo.data.FieldProvider;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.SQLReturnObject;
import org.openbravo.erpCommon.utility.TableSQLData;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.utils.FormatUtilities;
import org.openbravo.utils.Replace;
import org.openbravo.xmlEngine.XmlDocument;
import it.embio.exportdata.data.MEXDReportConfig;
import it.embio.exportdata.data.MexdReportconnection;
import it.embio.exportdata.utility.ControlUtility;

public class mexdListSingle extends HttpSecureAppServlet {
	private static final long serialVersionUID = 1L;

	  private static final String[] colNames = { "Value", "Name","id",
	      "RowKey" };
	  private static final RequestFilter columnFilter = new ValueListFilter(colNames);
	  private static final RequestFilter directionFilter = new ValueListFilter("asc", "desc");

	  public void init(ServletConfig config) {
	    super.init(config);
	    boolHist = false;
	  }

	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
	      ServletException {
	    VariablesSecureApp vars = new VariablesSecureApp(request);
	    OBContext.setAdminMode(true);
	    try{
	    if (vars.commandIn("DEFAULT")) {
	      
	      String strKeyValue = vars.getRequestGlobalVariable("inpKey", "mexdListSingle.key");
	      String strNameValue = vars.getRequestGlobalVariable("inpNameValue", "mexdListSingle.name");
	      if (!strNameValue.equals(""))
	          vars.setSessionValue("mexdListSingle.name", strNameValue + "%");
	      if (!strKeyValue.equals(""))
	      vars.getRequestGlobalVariable("inpKey", "mexdListSingle.key");
	      String strcontrolname = vars.getStringParameter("controlname");
	      if (!strcontrolname.equals(""))
	    	  vars.setSessionValue("mexdListSingle.controlname", strcontrolname );  
	     
	      PrintPage(response, vars, strKeyValue, strNameValue);
	    }else if (vars.commandIn("KEY")) {
	    	String strKeyValue = vars.getRequestGlobalVariable("inpKey", "mexdListSingle.key");
		      String strNameValue = vars.getRequestGlobalVariable("inpNameValue", "mexdListSingle.name");
		      
		      if (!strNameValue.equals(""))
		          vars.setSessionValue("mexdListSingle.name", strNameValue + "%");
		      if (!strKeyValue.equals(""))
		      vars.getRequestGlobalVariable("inpKey", "mexdListSingle.key");
		      String strcontrolname = vars.getStringParameter("controlname");
		      if (!strcontrolname.equals(""))
		    	  vars.setSessionValue("mexdListSingle.controlname", strcontrolname );  
		      //String strcontrolname = vars.getGlobalVariable("inpcontrolname", "mexdListSingle.controlname", "");
		      String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
		    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
		    	Connection conn=null;
		    	if(reportconfig.getEmexReportconnection()!=null){
		    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
		    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
			    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
			    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
		    	}
		     String strcontrolquery = vars.getGlobalVariable("mexdListSingle."+strcontrolname+".squery", "mexdListSingle."+strcontrolname+".squery", "");
			      
		      String pgLimit = "2";
		      FieldProvider[] data = null;
		     data = Combolistdata.selectlistdata(this, strcontrolquery,strKeyValue,strNameValue,conn,pgLimit);
	        if (data != null && data.length == 1)
	         printPageKey(response, vars, data);
	        else{
	        	 PrintPage(response, vars, strKeyValue, strNameValue);
	        }
	      }else if (vars.commandIn("STRUCTURE")) {
	      printGridStructure(response, vars);
	    } else if (vars.commandIn("DATA")) {    	
	      String action = vars.getStringParameter("action");
	      log4j.debug("command DATA - action: " + action);
	      
	      String strcontrolname = vars.getGlobalVariable("inpcontrolname", "mexdListSingle.controlname", "");
	      String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
	    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
	    	Connection conn=null;
	    	if(reportconfig.getEmexReportconnection()!=null){
	    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
	    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
		    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
		    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
	    	}
	      if (vars.getStringParameter("clear").equals("true")) {
	        vars.removeSessionValue("mexdListSingle.key");
	        vars.removeSessionValue("mexdListSingle.name");
	       // vars.removeSessionValue("mexdListSingle.controlname");
	      
	      }
	      String strKey = vars.getGlobalVariable("inpKey", "mexdListSingle.key", "");
	      String strName = vars.getGlobalVariable("inpName", "mexdListSingle.name", "");
	    
	      String strcontrolquery = vars.getGlobalVariable("mexdListSingle."+strcontrolname+".squery", "mexdListSingle."+strcontrolname+".squery", "");
	      //strOrg = vars.getOrg();
	     
	      //clear session value	
	      String strNewFilter = vars.getStringParameter("newFilter");
	      String strOffset = vars.getStringParameter("offset");
	      String strPageSize = vars.getStringParameter("page_size");
	      String strSortCols = vars.getInStringParameter("sort_cols", columnFilter);
	      String strSortDirs = vars.getInStringParameter("sort_dirs", directionFilter);
	      
	      if (action.equalsIgnoreCase("getRows")) { // Asking for data rows
	        printGridData(response, vars, strKey, strName, strSortCols,
	            strSortDirs, strOffset, strPageSize, strNewFilter,ControlUtility.parseQuery(strcontrolquery, vars),conn);
	      } else if (action.equalsIgnoreCase("getIdsInRange")) {
	        // asking for selected rows
	        printGridDataSelectedRows(response, vars, strKey, strName,
	            strSortCols, strSortDirs,ControlUtility.parseQuery(strcontrolquery,vars),conn);
	      } else {
	        throw new ServletException("Unimplemented action in DATA request: " + action);
	      }
	    } else
	      pageError(response);
	    }
	    finally{
	    	OBContext.restorePreviousMode();
	    }
	  }
	  private void printPageKey(HttpServletResponse response, VariablesSecureApp vars,
			  FieldProvider[] data) throws IOException,
		      ServletException {
		    if (log4j.isDebugEnabled())
		      log4j.debug("Output: product seeker Frame Set");
		    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
		        "org/openbravo/erpCommon/info/SearchUniqueKeyResponse").createXmlDocument();
		    xmlDocument.setParameter("script", generateResult(data));
		    response.setContentType("text/html; charset=UTF-8");
		    PrintWriter out = response.getWriter();
		    out.println(xmlDocument.print());
		    out.close();
		  }
	  private String generateResult( FieldProvider[] data) throws IOException, ServletException {
		    StringBuffer html = new StringBuffer();

		    html.append("\nfunction validateSelector() {\n");
		    html.append("var key = \"" + data[0].getField("id") + "\";\n");
		    html.append("var text = \"" + Replace.replace(data[0].getField("Name"), "\"", "\\\"") + "\";\n");
		    html.append("var parameter = new Array(\n");
		    html.append(");\n");
		    html.append("var theOpener = parent.opener || getFrame('LayoutMDI');\n");
		    html.append("theOpener.closeSearch(\"SAVE\", key, text, parameter);\n");
		    html.append("}\n");
		    return html.toString();
		  }

	  private void PrintPage(HttpServletResponse response, VariablesSecureApp vars, String strKeyValue,
	      String strNameValue) throws IOException, ServletException {
	    if (log4j.isDebugEnabled())
	      log4j.debug("Output: Multiple products seeker Frame Set");
	    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
	        "it/embio/exportdata/ad_forms/mexdListSingle").createXmlDocument();
	    if (strKeyValue.equals("") && strNameValue.equals("")) {
	      xmlDocument.setParameter("key", "%");
	    } else {
	      xmlDocument.setParameter("key", strKeyValue);
	    }
	    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
	    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
	    xmlDocument.setParameter("alertMsg",
	        "ALERT_MSG=\"" + Utility.messageBD(this, "No data Selected", vars.getLanguage()) + "\";");
	    xmlDocument.setParameter("theme", vars.getTheme());
	    xmlDocument.setParameter("name", strNameValue);
	    xmlDocument.setParameter("grid", "20");
	    xmlDocument.setParameter("grid_Offset", "");
	    xmlDocument.setParameter("grid_SortCols", "1");
	    xmlDocument.setParameter("grid_SortDirs", "ASC");
	    xmlDocument.setParameter("grid_Default", "0");
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println(xmlDocument.print());
	    out.close();
	  }

	  private void printGridStructure(HttpServletResponse response, VariablesSecureApp vars)
	      throws IOException, ServletException {
	    if (log4j.isDebugEnabled())
	      log4j.debug("Output: print page structure");
	    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
	        "org/openbravo/erpCommon/utility/DataGridStructure").createXmlDocument();

	    SQLReturnObject[] data = getHeaders(vars);
	    String type = "Hidden";
	    String title = "";
	    String description = "";

	    xmlDocument.setParameter("type", type);
	    xmlDocument.setParameter("title", title);
	    xmlDocument.setParameter("description", description);
	    xmlDocument.setData("structure1", data);
	    xmlDocument.setParameter("backendPageSize", String.valueOf(TableSQLData.maxRowsPerGridPage));
	    response.setContentType("text/xml; charset=UTF-8");
	    response.setHeader("Cache-Control", "no-cache");
	    PrintWriter out = response.getWriter();
	    if (log4j.isDebugEnabled())
	      log4j.debug(xmlDocument.print());
	    out.println(xmlDocument.print());
	    out.close();
	  }

	  private SQLReturnObject[] getHeaders(VariablesSecureApp vars) {
	    SQLReturnObject[] data = null;
	    Vector<SQLReturnObject> vAux = new Vector<SQLReturnObject>();
	    String[] colWidths = { "225", "225", "0", "0"};
	    for (int i = 0; i < colNames.length; i++) {
	      SQLReturnObject dataAux = new SQLReturnObject();
	      dataAux.setData("columnname", colNames[i]);
	      dataAux.setData("gridcolumnname", colNames[i]);
	      dataAux.setData("adReferenceId", "AD_Reference_ID");
	      dataAux.setData("adReferenceValueId", "AD_ReferenceValue_ID");
	      dataAux.setData("isidentifier", (colNames[i].equals("RowKey") ? "true" : "false"));
	      dataAux.setData("iskey", (colNames[i].equals("RowKey") ? "true" : "false"));
	      dataAux.setData("isvisible",
	          (colNames[i].equals("id") || colNames[i].equalsIgnoreCase("RowKey") ? "false"
	              : "true"));
	      String name = Utility.messageBD(this, "MPS_" + colNames[i].toUpperCase(), vars.getLanguage());
	      dataAux.setData("name", (name.startsWith("MPS_") ? colNames[i] : name));
	      dataAux.setData("type", "string");
	      dataAux.setData("width", colWidths[i]);
	      vAux.addElement(dataAux);
	    }
	    data = new SQLReturnObject[vAux.size()];
	    vAux.copyInto(data);
	    return data;
	  }

	  private void printGridData(HttpServletResponse response, VariablesSecureApp vars, String strKey,
	      String strName,String strOrderCols,
	      String strOrderDirs, String strOffset, String strPageSize, String strNewFilter, String strcontrolquery,Connection conn) throws IOException, ServletException {
	    if (log4j.isDebugEnabled())
	      log4j.debug("Output: print page rows");
	    int page = 0;
	    SQLReturnObject[] headers = getHeaders(vars);
	    FieldProvider[] data = null;
	    String type = "Hidden";
	    String title = "";
	    String description = "";
	    String strNumRows = "0";
	    int offset = Integer.valueOf(strOffset).intValue();
	    int pageSize = Integer.valueOf(strPageSize).intValue();

	    if (headers != null) {
	      try {
	        // build sql orderBy clause
	    
	        page = TableSQLData.calcAndGetBackendPage(vars, "mexdListSingleData.currentPage");
	        if (vars.getStringParameter("movePage", "").length() > 0) {
	          // on movePage action force executing countRows again
	          strNewFilter = "";
	        }
	        int oldOffset = offset;
	        offset = (page * TableSQLData.maxRowsPerGridPage) + offset;
	        log4j.debug("relativeOffset: " + oldOffset + " absoluteOffset: " + offset);
	        
	        
	        if (strNewFilter.equals("1") || strNewFilter.equals("")) { // New
	        
	          strNumRows = Combolistdata.selectlistdatacount(this, strcontrolquery,strKey,strName,conn);
	          
	        } 
	      
	        // Filtering result
	        String pgLimit = pageSize + " OFFSET " + offset;   
	        data = Combolistdata.selectlistdata(this, strcontrolquery,strKey,strName,conn,pgLimit);
	        
	      } catch (ServletException e) {
	        log4j.error("Error in print page data: " + e);
	        e.printStackTrace();
	        OBError myError = Utility.translateError(this, vars, vars.getLanguage(), e.getMessage());
	        if (!myError.isConnectionAvailable()) {
	          bdErrorAjax(response, "Error", "Connection Error", "No database connection");
	          return;
	        } else {
	          type = myError.getType();
	          title = myError.getTitle();
	          if (!myError.getMessage().startsWith("<![CDATA["))
	            description = "<![CDATA[" + myError.getMessage() + "]]>";
	          else
	            description = myError.getMessage();
	        }
	      } catch (Exception e) {
	        if (log4j.isDebugEnabled())
	          log4j.debug("Error obtaining rows data");
	        type = "Error";
	        title = "Error";
	        if (e.getMessage().startsWith("<![CDATA["))
	          description = "<![CDATA[" + e.getMessage() + "]]>";
	        else
	          description = e.getMessage();
	        e.printStackTrace();
	      }
	    }

	    if (!type.startsWith("<![CDATA["))
	      type = "<![CDATA[" + type + "]]>";
	    if (!title.startsWith("<![CDATA["))
	      title = "<![CDATA[" + title + "]]>";
	    if (!description.startsWith("<![CDATA["))
	      description = "<![CDATA[" + description + "]]>";
	    StringBuffer strRowsData = new StringBuffer();
	    strRowsData.append("<xml-data>\n");
	    strRowsData.append("  <status>\n");
	    strRowsData.append("    <type>").append(type).append("</type>\n");
	    strRowsData.append("    <title>").append(title).append("</title>\n");
	    strRowsData.append("    <description>").append(description).append("</description>\n");
	    strRowsData.append("  </status>\n");
	    strRowsData.append("  <rows numRows=\"").append(strNumRows)
	        .append("\" backendPage=\"" + page + "\">\n");
	    if (data != null && data.length > 0) {
	      for (int j = 0; j < data.length; j++) {
	        strRowsData.append("    <tr>\n");
	        for (int k = 0; k < headers.length; k++) {
	          strRowsData.append("      <td><![CDATA[");
	          String columnname = headers[k].getField("columnname");

	          if ((data[j].getField(columnname)) != null) {
	            if (headers[k].getField("adReferenceId").equals("32"))
	              strRowsData.append(strReplaceWith).append("/images/");
	            strRowsData.append(data[j].getField(columnname).replaceAll("<b>", "")
	                .replaceAll("<B>", "").replaceAll("</b>", "").replaceAll("</B>", "")
	                .replaceAll("<i>", "").replaceAll("<I>", "").replaceAll("</i>", "")
	                .replaceAll("</I>", "").replaceAll("<p>", "&nbsp;").replaceAll("<P>", "&nbsp;")
	                .replaceAll("<br>", "&nbsp;").replaceAll("<BR>", "&nbsp;"));
	          } else {
	            if (headers[k].getField("adReferenceId").equals("32")) {
	              strRowsData.append(strReplaceWith).append("/images/blank.gif");
	            } else
	              strRowsData.append("&nbsp;");
	          }
	          strRowsData.append("]]></td>\n");
	        }
	        strRowsData.append("    </tr>\n");
	      }
	    }
	    strRowsData.append("  </rows>\n");
	    strRowsData.append("</xml-data>\n");

	    response.setContentType("text/xml; charset=UTF-8");
	    response.setHeader("Cache-Control", "no-cache");
	    PrintWriter out = response.getWriter();
	    if (log4j.isDebugEnabled())
	      log4j.debug(strRowsData.toString());
	    out.print(strRowsData.toString());
	    out.close();
	  }

	  /**
	   * Prints the response for the getRowsIds action. It returns the rowkey for the identifier column
	   * for the list of selected rows [minOffset..maxOffset]
	   * 
	   */
	  private void printGridDataSelectedRows(HttpServletResponse response, VariablesSecureApp vars,
	      String strKey, String strName, String strOrderCols,
	      String strOrderDirs, String strcontrolquery,Connection conn) throws IOException, ServletException {
	    int minOffset = new Integer(vars.getStringParameter("minOffset")).intValue();
	    int maxOffset = new Integer(vars.getStringParameter("maxOffset")).intValue();
	    log4j.debug("Output: print page ids, minOffset: " + minOffset + ", maxOffset: " + maxOffset);
	    String type = "Hidden";
	    String title = "";
	    String description = "";
	    FieldProvider[] data = null;
	    FieldProvider[] res = null;
	    try {
	      // build sql orderBy clause
	    
	      String strPage = vars.getSessionValue("mexdListSingle|currentPage", "0");
	      int page = Integer.valueOf(strPage);
	      minOffset = (page * TableSQLData.maxRowsPerGridPage) + minOffset;
	      maxOffset = (page * TableSQLData.maxRowsPerGridPage) + maxOffset;
	      // Filtering result
	       int pageSize = maxOffset - minOffset + 1;
	        String pgLimit = pageSize + " OFFSET " + minOffset;
	    
	        data = Combolistdata.selectlistdata(this, strcontrolquery,strKey,strName,conn,pgLimit);

	     
	      // result field has to be named id -> rename by copy the list
	      res = new FieldProvider[data.length];
	      for (int i = 0; i < data.length; i++) {
	        SQLReturnObject sqlReturnObject = new SQLReturnObject();
	        String resValue = "<![CDATA[" + data[i].getField("RowKey") + "]]>";
	        sqlReturnObject.setData("id", resValue);
	        res[i] = sqlReturnObject;
	      }
	    } catch (Exception e) {
	      log4j.error("Error obtaining id-list for getIdsInRange", e);
	      type = "Error";
	      title = "Error";
	      if (!e.getMessage().startsWith("<![CDATA["))
	        description = "<![CDATA[" + e.getMessage() + "]]>";
	    }

	    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
	        "org/openbravo/erpCommon/utility/DataGridID").createXmlDocument();
	    xmlDocument.setParameter("type", type);
	    xmlDocument.setParameter("title", title);
	    xmlDocument.setParameter("description", description);
	    xmlDocument.setData("structure1", res);
	    response.setContentType("text/xml; charset=UTF-8");
	    response.setHeader("Cache-Control", "no-cache");
	    PrintWriter out = response.getWriter();
	    log4j.debug(xmlDocument.print());
	    out.println(xmlDocument.print());
	    out.close();
	  }
	  
	
	  public String getServletInfo() {
	    return "Servlet that presents the multiple products seeker";
	  } // end of getServletInfo() method

}
