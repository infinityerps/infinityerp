package it.embio.exportdata.ad_forms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
import org.openbravo.database.ConnectionProvider;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.SQLReturnObject;
import org.openbravo.erpCommon.utility.TableSQLData;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.service.db.DalConnectionProvider;
import org.openbravo.utils.FormatUtilities;
import org.openbravo.xmlEngine.XmlDocument;
import it.embio.exportdata.data.MEXDReportConfig;
import it.embio.exportdata.data.MexdReportconnection;
import it.embio.exportdata.utility.ControlUtility;

public class mexdgriddata extends HttpSecureAppServlet {
	private static final long serialVersionUID = 1L;
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
	    	
	    	//PrintPage(response, vars);
	    } else if (vars.commandIn("STRUCTURE")) {
	        String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
	    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
	    	Connection conn=null;
	    	if(reportconfig.getEmexReportconnection()!=null){
	    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
	    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
		    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
		    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
	    	}
	       String strcontrolquery = vars.getGlobalVariable("mexdgriddata.squery", "mexdgriddata.squery", "");
	       printGridStructure(response, vars,strcontrolquery,conn);
	    } else if (vars.commandIn("DATA")) {    	
	      String action = vars.getStringParameter("action");
	      log4j.debug("command DATA - action: " + action);
	      
	       String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
	    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
	    	Connection conn=null;
	    	if(reportconfig.getEmexReportconnection()!=null){
	    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
	    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
		    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
		    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
	    	}
	       String strcontrolquery = vars.getGlobalVariable("mexdgriddata.squery", "mexdgriddata.squery", "");
	
	      //clear session value	
	      String strNewFilter = vars.getStringParameter("newFilter");
	      String strOffset = vars.getStringParameter("offset");
	      String strPageSize = vars.getStringParameter("page_size");
	      //String strSortCols = vars.getInStringParameter("sort_cols", columnFilter);
	      String strSortDirs = vars.getInStringParameter("sort_dirs", directionFilter);
	      
	      if (action.equalsIgnoreCase("getRows")) { // Asking for data rows
	        printGridData(response, vars, 
	            strSortDirs, strOffset, strPageSize, strNewFilter,ControlUtility.parseQuery(strcontrolquery, vars),conn);
	      } else {
	        throw new ServletException("Unimplemented action in DATA request: " + action);
	      }
	    } else
	      pageError(response);
	    }finally{
	    	OBContext.restorePreviousMode();
	    }
	  }

	  private void PrintPage(HttpServletResponse response, VariablesSecureApp vars) throws IOException, ServletException {
	    if (log4j.isDebugEnabled())
	      log4j.debug("Output: Multiple products seeker Frame Set");
	    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
	        "it/embio/exportdata/ad_forms/mexdgriddata").createXmlDocument();
	    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
	    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
	    xmlDocument.setParameter("alertMsg",
	        "ALERT_MSG=\"" + Utility.messageBD(this, "No data Selected", vars.getLanguage()) + "\";");
	    xmlDocument.setParameter("theme", vars.getTheme());
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println(xmlDocument.print());
	    out.close();
	  }

	  private void printGridStructure(HttpServletResponse response, VariablesSecureApp vars,String strcontrolquery,Connection conn)
	      throws IOException, ServletException {
	    if (log4j.isDebugEnabled())
	      log4j.debug("Output: print page structure");
	    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
	        "org/openbravo/erpCommon/utility/DataGridStructure").createXmlDocument();

	    ConnectionProvider readOnlyCP = new DalConnectionProvider(false);
	    SQLReturnObject[] data = ControlUtility.getHeadergrid(readOnlyCP, strcontrolquery, conn);
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


	  private void printGridData(HttpServletResponse response, VariablesSecureApp vars,
	      String strOrderDirs, String strOffset, String strPageSize, String strNewFilter, String strcontrolquery,Connection conn) throws IOException, ServletException {
	    if (log4j.isDebugEnabled())
	      log4j.debug("Output: print page rows");
	    int page = 0;
	    ConnectionProvider readOnlyCP = new DalConnectionProvider(false);
	    SQLReturnObject[] headers = ControlUtility.getHeadergrid(readOnlyCP, strcontrolquery, conn);
	    SQLReturnObject[] data = null;
	    String type = "Hidden";
	    String title = "";
	    String description = "";
	    String strNumRows = "0";
	    int offset = Integer.valueOf(strOffset).intValue();
	    int pageSize = Integer.valueOf(strPageSize).intValue();

	    if (headers != null) {
	      try {
	        // build sql orderBy clause
	    
	        page = TableSQLData.calcAndGetBackendPage(vars, "mexdgriddata.currentPage");
	        if (vars.getStringParameter("movePage", "").length() > 0) {
	          // on movePage action force executing countRows again
	          strNewFilter = "";
	        }
	        int oldOffset = offset;
	        offset = (page * TableSQLData.maxRowsPerGridPage) + offset;
	        log4j.debug("relativeOffset: " + oldOffset + " absoluteOffset: " + offset);
	        
	        
	      
	        // Filtering result
	        String pgLimit = pageSize + " OFFSET " + offset;   
	        data = ControlUtility.getgriddata(readOnlyCP, strcontrolquery, conn, pgLimit);

	        if (strNewFilter.equals("1") || strNewFilter.equals("")) { // New
	        
	          strNumRows = Combolistdata.selectlistdatacount(this, strcontrolquery,null,null,conn);
	          
	        } 
	        
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

	  public String getServletInfo() {
	    return "Servlet that presents the multiple products seeker";
	  } // end of getServletInfo() method

}
