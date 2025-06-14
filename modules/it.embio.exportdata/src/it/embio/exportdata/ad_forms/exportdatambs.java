package it.embio.exportdata.ad_forms;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.criterion.Restrictions;
import org.openbravo.base.exception.OBException;
import org.openbravo.base.filter.IsIDFilter;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.client.application.report.ReportingUtils;
import org.openbravo.client.application.report.ReportingUtils.ExportType;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBCriteria;
import org.openbravo.dal.service.OBDal;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.email.EmailUtils;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.erpCommon.utility.LeftTabsBar;
import org.openbravo.erpCommon.utility.NavigationBar;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.PrintJRData;
import org.openbravo.erpCommon.utility.SQLReturnObject;
import org.openbravo.erpCommon.utility.ToolBar;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.erpCommon.utility.poc.EmailManager;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.common.enterprise.EmailServerConfiguration;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.db.DalConnectionProvider;
import org.openbravo.utils.FileUtility;
import org.openbravo.utils.FormatUtilities;
import org.openbravo.utils.Replace;
import org.openbravo.xmlEngine.XmlDocument;
import it.embio.exportdata.data.MEXDReportCnfgline;
import it.embio.exportdata.data.MEXDReportConfig;
import it.embio.exportdata.data.MexdReportconnection;
import it.embio.exportdata.utility.ControlUtility;
import it.embio.exportdata.utility.MEXDConnectionProvider;
import net.sf.jasperreports.engine.JRDataSource;
public class exportdatambs extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;


public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
  OBContext.setAdminMode(true);
    ConnectionProvider readOnlyCP = new  DalConnectionProvider(false);
    try{
    if (vars.commandIn("DEFAULT")) {
    	String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
    	if(strReportId!=""){
    		MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
        	for(MEXDReportCnfgline paraline:reportconfig.getEmexReportcnfglineList()){
        		vars.removeSessionValue("exportdatambs|"+paraline.getSparavalue()+"");
        		if(paraline.getScontroltype().equals("LST")){
        			vars.removeSessionValue("MexdlistMultiple."+paraline.getSinpname()+".squery");
        		}
        	}
        	vars.removeSessionValue("mexdgriddata.squery");
    	}
        printPageDataSheet(response, vars,"DEFAULT");
      }
    else if(vars.commandIn("PRINT_PARA")){
    	String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
    	String strReportcatId = vars.getGlobalVariable("inpemexReportcatId", "exportdatambs|inpemexReportcatId", "");
    	String strReportsubcatId = vars.getGlobalVariable("inpemexReportsubcatId", "exportdatambs|inpemexReportsubcatId", "");
    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
    	Connection conn=null;
    	if(reportconfig.getEmexReportconnection()!=null){
    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
	    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
	    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
    	}
    	response.setContentType("text/html; charset=UTF-8");
    	
        PrintWriter out = response.getWriter();
        XmlDocument xmlDocument = null;
        xmlDocument = xmlEngine.readXmlTemplate("it/embio/exportdata/ad_forms/exportdatambs")
            .createXmlDocument();
        ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "exportdatambs", false, "", "", "",
                false, "ad_forms", strReplaceWith, false, true);
            toolbar.prepareSimpleToolBarTemplate();
            xmlDocument.setParameter("toolbar", toolbar.toString());
            try {
                WindowTabs tabs = new WindowTabs(this, vars,
                    "it.embio.exportdata.ad_forms.exportdatambs");
                xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
                xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
                xmlDocument.setParameter("childTabContainer", tabs.childTabs());
                xmlDocument.setParameter("theme", vars.getTheme());
                NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "exportdatambs.html",
                    classInfo.id, classInfo.type, strReplaceWith, tabs.breadcrumb());
                xmlDocument.setParameter("navigationBar", nav.toString());
                LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "exportdatambs.html",
                    strReplaceWith);
                xmlDocument.setParameter("leftTabs", lBar.manualTemplate());
                
              } catch (Exception ex) {
                throw new ServletException(ex);
              }
            OBError myMessage = vars.getMessage("exportdatambs");
            vars.removeMessage("exportdatambs");
            if (myMessage != null) {
              xmlDocument.setParameter("messageType", myMessage.getType());
              xmlDocument.setParameter("messageTitle", myMessage.getTitle());
              xmlDocument.setParameter("messageMessage", myMessage.getMessage());
            }
           
            xmlDocument.setParameter("calendar", vars.getLanguage().substring(0, 2));
            xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
            xmlDocument.setParameter("paramLanguage", "defaultLang=\"" + vars.getLanguage() + "\";");
            Role role =OBDal.getInstance().get(Role.class, vars.getRole());
            xmlDocument.setData(
                    "reportMEXD_Reportcat",
                    "liststructure",
                    (role.isClientAdmin()?ReportConfigListData.selectreportcatadmin(this):ReportConfigListData.selectreportcat(this,vars.getRole())));
            String strSqladmin = "";
            strSqladmin = strSqladmin + 
              "      SELECT a.emex_reportcategory_det_id AS id, a.sName AS name" +
              "      FROM emex_reportcategory_det a"+
              "		 where a.emex_reportcategory_id='"+strReportcatId+"'";
            String strSql = "";
            strSql = strSql + 
              "      SELECT distinct a.emex_reportcategory_det_id AS id, a.sName AS name" +
              "      FROM emex_reportcategory_det a" +
              "      INNER JOIN emex_reportaccess b on b.emex_reportcategory_det_id=a.emex_reportcategory_det_id" +
              "      where b.AD_Role_ID='"+vars.getRole()+"'"+
              "		 and a.emex_reportcategory_id='"+strReportcatId+"'";
            xmlDocument.setData(
                    "reportMEXD_Reportsubcat",
                    "liststructure",
                    (role.isClientAdmin()?Combolistdata.select(this, strSqladmin, null):Combolistdata.select(this, strSql, null)));
            
            String strSqladminrpt = "";
            strSqladminrpt = strSqladminrpt + 
    		  "      SELECT a.emex_ReportConfig_id AS id, a.sName AS name" +
    	      "      FROM emex_ReportConfig a"+
              "		 where a.emex_reportcategory_det_id='"+strReportsubcatId+"'";
            String strSqlrpt = "";
            strSqlrpt = strSqlrpt + 
    		  "      SELECT distinct a.emex_ReportConfig_id AS id, a.sName AS name" +
    	      "      FROM emex_ReportConfig a" +
    	      "      INNER JOIN emex_reportaccess b on b.emex_ReportConfig_id=a.emex_ReportConfig_id" +
              "      where b.AD_Role_ID='"+vars.getRole()+"'"+
              "		 AND a.emex_reportcategory_det_id='"+strReportsubcatId+"'";
            xmlDocument.setData(
                    "reportMEXD_ReportConfig",
                    "liststructure",
                    (role.isClientAdmin()?Combolistdata.select(this, strSqladminrpt, null):Combolistdata.select(this, strSqlrpt, null)));

            xmlDocument.setParameter(
                    "paramreportsubcatarray",
                    Utility.arrayDobleEntrada("paramreportsubcatarray",
                    		(role.isClientAdmin()?ReportConfigListData.selectreportsubcatadmin(this):ReportConfigListData.selectreportsubcat(this,vars.getRole()))));
            
            xmlDocument.setParameter(
                    "paramreportarray",
                    Utility.arrayDobleEntrada("paramreportarray",
                    		(role.isClientAdmin()?ReportConfigListData.selectadmin(this):ReportConfigListData.select(this,vars.getRole()))));
            
            xmlDocument.setParameter("inpemexReportcatId", strReportcatId);
            xmlDocument.setParameter("inpemexReportsubcatId", strReportsubcatId);
            xmlDocument.setParameter("MEXDReportConfig", strReportId);
           
            StringBuffer Strcontrolform = new StringBuffer();
            Strcontrolform.append("");
        String Strcontrolbutton="<tr>";
        List<MEXDReportCnfgline> sortedreportpara = reportconfig.getEmexReportcnfglineList();
        Collections.sort(sortedreportpara, new Comparator<MEXDReportCnfgline>() {
			  @Override
			  public int compare(MEXDReportCnfgline u1, MEXDReportCnfgline u2) {
			    return u1.getLineno().compareTo(u2.getLineno());
			  }
        	});
        		
    	for(MEXDReportCnfgline paraline:sortedreportpara){
    		String sdefaultvalue="";
			if(paraline.getSdefaultvalue()!=null){
				  if(paraline.getSdefaultvalue().contains("defaultvalue")){
					sdefaultvalue=ControlUtility.getdefaultresult(readOnlyCP, getdependqueryvalue(paraline.getSdefaultvalue(), vars, request),conn);
				  }else{
					sdefaultvalue=paraline.getSdefaultvalue();
				  }
				
			}
    		if(paraline.getScontroltype().equals("DT")){
    			String strvalue=vars.getGlobalVariable(paraline.getSinpname(), "exportdatambs|"+paraline.getSparavalue(),"");
    			if(strvalue!=""){
    				 
    				sdefaultvalue=strvalue;
    			}
    			Strcontrolform.append(ControlUtility.datecontrolformat(paraline.getSparavalue(),paraline.getScaption(),paraline.getSinpname(),10,paraline.isRequired(),sdefaultvalue));
    		   }
    		if(paraline.getScontroltype().equals("CMB")){
    			StringBuffer Stroptiondata = new StringBuffer(); 
    			Stroptiondata.append("");
    			if(paraline.getSquery()!=null){
    				String strSqlquery=getdependqueryvalue(paraline.getSquery(), vars, request);
	    			Combolistdata[] cmblist=Combolistdata.select(this,strSqlquery,conn);
	    			//getting already set value
	    			String strcontrolvalue="";
					strcontrolvalue = vars.getGlobalVariable(paraline.getSinpname(), "exportdatambs|"+paraline.getSparavalue(),"");
					
	    	    	for(Combolistdata cmb:cmblist){
	    	    		
	    	    		if(cmb.getField("id").equals(strcontrolvalue)){
	    	    			Stroptiondata.append("<option value=\""+cmb.getField("id")+"\"selected >"+cmb.getField("name")+"</option>");
	    	    		}else{
	    	    			Stroptiondata.append("<option value=\""+cmb.getField("id")+"\">"+cmb.getField("name")+"</option>");
	    	    		}
	    	    		
	    	    	}
    			}
    	    	String strfunction="";
    	    	if(!paraline.getEmexReportcnfglineSdependentfieldList().isEmpty()){
    	    		strfunction="submitCommandForm('PRINT_PARA', false, null, 'exportdatambs.html', '_self', null, false);return false;";
    	    	}
    	    	if(!paraline.getEmexReportcnfglineSdependentfieldList().isEmpty()){
    	    		Strcontrolform.append(ControlUtility.comboboxcontrolformat(paraline.getScaption(), paraline.getSparavalue(), paraline.getSinpname(),Stroptiondata.toString(),strfunction));
    	    	}else{
    	    		Strcontrolform.append(ControlUtility.comboboxcontrolformat(paraline.getScaption(), paraline.getSparavalue(), paraline.getSinpname(),Stroptiondata.toString(),""));
    	    	}
    		}
    		if(paraline.getScontroltype().equals("TXT")){
    			String strvalue=vars.getGlobalVariable(paraline.getSinpname(), "exportdatambs|"+paraline.getSparavalue(),"");
    			if(strvalue!=""){
    				 
    				sdefaultvalue=strvalue;
    			}
    			Strcontrolform.append(ControlUtility.textboxcontrolformat(paraline.getScaption(),  paraline.getSparavalue(), paraline.getSinpname(), sdefaultvalue));
    		}
    		if(paraline.getScontroltype().equals("CHK")){
    			String svalue=request.getParameter(paraline.getSinpname());
				 
				 if(svalue!=null){
					 sdefaultvalue="checked";
				 }
				 Strcontrolform.append(ControlUtility.checkboxcontrolformat(paraline.getScaption(),  paraline.getSparavalue(), paraline.getSinpname(), sdefaultvalue));
	    			vars.getGlobalVariable(paraline.getSinpname(), "exportdatambs|"+paraline.getSparavalue(),sdefaultvalue);
    		}
    		if(paraline.getScontroltype().equals("BTNXL")){
    			Strcontrolbutton+= ControlUtility.buttonControlformat(paraline.getScaption(), paraline.getSparavalue(), "PRINT_EXCEL");
    		
    		}
    		if(paraline.getScontroltype().equals("BTNZIP")){
    			Strcontrolbutton+= ControlUtility.buttonControlformat(paraline.getScaption(), paraline.getSparavalue(), "PRINT_ZIP");
    		
    		}
    		if(paraline.getScontroltype().equals("BTNVIEW")){
    			Strcontrolbutton+= ControlUtility.buttonControlformat(paraline.getScaption(), paraline.getSparavalue(), "PRINT_GRID");
    		
    		}
    		if(paraline.getScontroltype().equals("BTNMAIL")){
    			Strcontrolbutton+= ControlUtility.buttonControlformat(paraline.getScaption(), paraline.getSparavalue(), "EMAIL");
    		
    		}
    		if(paraline.getScontroltype().equals("BTNPDF")){
    			Strcontrolbutton+= ControlUtility.buttonControlformat(paraline.getScaption(), paraline.getSparavalue(), "PRINT_PDF");
    		}
    		if(paraline.getScontroltype().equals("SLS")){
    			String strvalue=vars.getGlobalVariable(paraline.getSinpname(), "exportdatambs|"+paraline.getSparavalue(),"");
    			String strSqlDefault="";
    			String sdefaulttext="";
    			if(strvalue!=""){
    				
    				strSqlDefault="select * from ("+getdependqueryvalue(paraline.getSquery(), vars, request)+" ) alist where alist.id = '"+strvalue+"'";
    			}else{
    				strSqlDefault=sdefaultvalue!=null?sdefaultvalue:"";
    			}
    			if(strSqlDefault!=""){
    				 SQLReturnObject[] data = ControlUtility.getgriddata(readOnlyCP, strSqlDefault, conn, null);
    				 sdefaultvalue=data[0].getField("id");
    				 sdefaulttext=data[0].getField("name");
    			}
    			String strfunction="";
    	    	if(!paraline.getEmexReportcnfglineSdependentfieldList().isEmpty()){
    	    		strfunction="submitCommandForm('PRINT_PARA', false, null, 'exportdatambs.html', '_self', null, false);return false;";
    	    	}
    			String sdynamicpara=",'controlname','"+paraline.getSinpname()+"'";
    			Strcontrolform.append(ControlUtility.singleselectgrid(paraline.getSinpname(), paraline.getScaption(), paraline.getSparavalue(),sdynamicpara,sdefaultvalue,sdefaulttext,strfunction));
    			//parsing query data with value data
    			String strSqlquery=getdependqueryvalue(paraline.getSquery(), vars, request);
				//end--all value in query got it.
    		
    			vars.setSessionValue("mexdListSingle."+paraline.getSinpname()+".squery", strSqlquery);
    		}
    		if(paraline.getScontroltype().equals("LST")){
    			String sdynamicpara=",'controlname','"+paraline.getSinpname()+"'";
    			StringBuffer stroption = new StringBuffer();
    			stroption.append("");
    			String strvalue=vars.getInGlobalVariable(paraline.getSinpname(), "exportdatambs|"+paraline.getSparavalue(),"",IsIDFilter.instance);
    			String strSqlDefault="";
    			if(strvalue!=""){
    				strSqlDefault="select * from ("+getdependqueryvalue(paraline.getSquery(), vars, request)+" ) alist where alist.id in "+strvalue;
    			}else{
    				strSqlDefault=sdefaultvalue!=null?sdefaultvalue:"";
    			}
    			// check for strSqlDefault
    			if(strSqlDefault!=""){
   				 SQLReturnObject[] data = ControlUtility.getgriddata(readOnlyCP, strSqlDefault, conn, null);
	   				for (int j = 0; j < data.length; j++) {
	   					String skey=data[j].getField("id");
	   					String svalue=data[j].getField("name");
	   					stroption.append("<option value=\""+skey+"\">"+svalue+"</option>");
	   				}
    			}
    			
    				Strcontrolform.append(ControlUtility.listControlformat(paraline.getSinpname(), paraline.getScaption(), paraline.getSparavalue(),sdynamicpara,stroption.toString()));
    			//parsing query data with value data
    			String strSqlquery=getdependqueryvalue(paraline.getSquery(), vars, request);
				//end--all value in query got it.
    		
    			vars.setSessionValue("MexdlistMultiple."+paraline.getSinpname()+".squery", strSqlquery);
    		}
    		
    	}
    	
    	
    	Strcontrolbutton+="</tr>";	
    	xmlDocument.setParameter("mexdDynamicpara", Strcontrolform.toString());
    	String strreportname="";
    	strreportname+=reportconfig.getEmexReportcategory().getSname()+"-->";
    	strreportname+=reportconfig.getEmexReportcategoryDet().getSname()+"-->";
    	strreportname+=reportconfig.getSname();
    	xmlDocument.setParameter("mexdReportName", ControlUtility.reportname(strreportname));
    	xmlDocument.setParameter("MexdDynamicbuttonheading", ControlUtility.generatedbuttonheading("Export Data"));
    	xmlDocument.setParameter("mexdDynamicbutton",Strcontrolbutton);
    	
    	out.println(xmlDocument.print());
        out.close();
    	//System.out.println("Inside para view");
     
    	}
    else if (vars.commandIn("PRINT_EXCEL")){
    	   
   String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
    	Connection conn=null;
    	if(reportconfig.getEmexReportconnection()!=null){
    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
	    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
	    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
    	}
    	String strmainQuery=reportconfig.getSquery();
    	for(MEXDReportCnfgline paraline:reportconfig.getEmexReportcnfglineList()){
    		
    		strmainQuery=ControlUtility.parseQuery(strmainQuery, vars);
    		try {
				strmainQuery=ControlUtility.parsemainQuery(strmainQuery, vars, paraline.getSparavalue(), paraline.getSinpname(),paraline.getScontroltype(),request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	printPageDataExcel(response, vars, strmainQuery, reportconfig.getSname(),conn);
    	
      }
    else if (vars.commandIn("PRINT_ZIP")){
 	   
    	   String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
    	    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
    	    	Connection conn=null;
    	    	if(reportconfig.getEmexReportconnection()!=null){
    	    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
    	    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
    		    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
    		    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
    	    	}
    	    	String strmainQuery=reportconfig.getSquery();
    	    	for(MEXDReportCnfgline paraline:reportconfig.getEmexReportcnfglineList()){
    	    		
    	    		strmainQuery=ControlUtility.parseQuery(strmainQuery, vars);
    	    		try {
    					strmainQuery=ControlUtility.parsemainQuery(strmainQuery, vars, paraline.getSparavalue(), paraline.getSinpname(),paraline.getScontroltype(),request);
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    	    	}
    	    	printPageDataZip(response, vars, strmainQuery, reportconfig.getSname(),conn);
    	    	
    	    }
    else if (vars.commandIn("PRINT_GRID")){
	   String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
    	Connection conn=null;
    	if(reportconfig.getEmexReportconnection()!=null){
    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
	    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
	    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
    	}
    	String strmainQuery=reportconfig.getSquery();
    	for(MEXDReportCnfgline paraline:reportconfig.getEmexReportcnfglineList()){
    		
    		strmainQuery=ControlUtility.parseQuery(strmainQuery, vars);
    		try {
				strmainQuery=ControlUtility.parsemainQuery(strmainQuery, vars, paraline.getSparavalue(), paraline.getSinpname(),paraline.getScontroltype(),request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	vars.setSessionValue("mexdgriddata.squery", strmainQuery);
        //printPageDatagrid(response, vars, strmainQuery, reportconfig.getSname(),conn);
    	 XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
    		        "it/embio/exportdata/ad_forms/mexdgriddata").createXmlDocument();
    		    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
    		    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    		    xmlDocument.setParameter("alertMsg",
    		        "ALERT_MSG=\"" + Utility.messageBD(this, "No data Selected", vars.getLanguage()) + "\";");
    		    xmlDocument.setParameter("theme", vars.getTheme());
    		    String strreportname="";
    	    	strreportname+=reportconfig.getEmexReportcategory().getSname()+"-->";
    	    	strreportname+=reportconfig.getEmexReportcategoryDet().getSname()+"-->";
    	    	strreportname+=reportconfig.getSname();
    	    	xmlDocument.setParameter("mexdReportNamegrid", ControlUtility.reportname(strreportname));
    		    response.setContentType("text/html; charset=UTF-8");
    		    PrintWriter out = response.getWriter();
    		    out.println(xmlDocument.print());
    		    out.close();
    	
      }
    else if (vars.commandIn("PRINT_PDF")){
    	String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
    	Connection conn=null;
    	if(reportconfig.getEmexReportconnection()!=null){
    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
	    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
	    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
    	}
    	String strdefaultpara="";
    	String strinppara="";
    	HashMap<String, Object> parameters = new HashMap<>();
		strdefaultpara=ControlUtility.parseQuery("@#ad_org_id@", vars);
		parameters.put("#ad_org_id", strdefaultpara.substring(1, strdefaultpara.length()-1));
		strdefaultpara=ControlUtility.parseQuery("@#ad_user_id@", vars);
		parameters.put("#ad_user_id", strdefaultpara.substring(1, strdefaultpara.length()-1));
		strdefaultpara=ControlUtility.parseQuery("@#ad_role_id@", vars);
		parameters.put("#ad_role_id", strdefaultpara.substring(1, strdefaultpara.length()-1));
		strdefaultpara=ControlUtility.parseQuery("@#ad_client_id@", vars);
		parameters.put("#ad_client_id", strdefaultpara.substring(1, strdefaultpara.length()-1));
		strdefaultpara=ControlUtility.parseQuery("@#m_warehouse_id@", vars);
		parameters.put("#m_warehouse_id", strdefaultpara.substring(1, strdefaultpara.length()-1));
    	for(MEXDReportCnfgline paraline:reportconfig.getEmexReportcnfglineList()){
    		try {
    			strinppara=ControlUtility.parsemainQuery("@"+paraline.getSinpname()+"@", vars, paraline.getSparavalue(), paraline.getSinpname(),paraline.getScontroltype(),request);
    			if(paraline.getScontroltype().equals("LST")){
    				parameters.put(paraline.getSinpname(), strinppara);
    			}else{
    				parameters.put(paraline.getSinpname(), strinppara.substring(1, strinppara.length()-1));
    			}
    		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	renderJRXml(vars, response, reportconfig.getJrname(),reportconfig.getSname(), "pdf", parameters,(JRDataSource) null, null, true,conn,new DalConnectionProvider(false));
        
    }else if (vars.commandIn("EMAIL")){
    	
    	 OBContext.setAdminMode();
    	 response.setContentType("text/html; charset=UTF-8");
    	    try {
    	    	String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
    	    	MEXDReportConfig reportconfig=OBDal.getInstance().get(MEXDReportConfig.class, strReportId);
    	    	Connection conn=null;
    	    	if(reportconfig.getEmexReportconnection()!=null){
    	    		MexdReportconnection mexdrpt=reportconfig.getEmexReportconnection();
    	    		conn=ControlUtility.getConnection(mexdrpt.getShost(), mexdrpt.getPort().toString(), 
    		    				mexdrpt.getSdbname(), mexdrpt.getSdrivername(), mexdrpt.getSusername(),  
    		    				FormatUtilities.encryptDecrypt(mexdrpt.getSpassword(), false));
    	    	}
    	    	String strmainQuery=reportconfig.getSquery();
    	    	for(MEXDReportCnfgline paraline:reportconfig.getEmexReportcnfglineList()){
    	    		
    	    		strmainQuery=ControlUtility.parseQuery(strmainQuery, vars);
    	    		try {
    					strmainQuery=ControlUtility.parsemainQuery(strmainQuery, vars, paraline.getSparavalue(), paraline.getSinpname(),paraline.getScontroltype(),request);
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    	    	}
    	    	Organization currenctOrg = OBContext.getOBContext()
    	    	          .getCurrentOrganization();
    	    	      final EmailServerConfiguration mailConfig = EmailUtils.getEmailConfiguration(currenctOrg);
    	    	      User u = OBContext.getOBContext().getUser();
    	    	      final String host = mailConfig.getSmtpServer();
                      final Boolean auth = mailConfig.isSMTPAuthentification();
                      final String username = mailConfig.getSmtpServerAccount();
                      final String password = FormatUtilities.encryptDecrypt(
                          mailConfig.getSmtpServerPassword(), false);
                      final String connSecurity = mailConfig.getSmtpConnectionSecurity();
                      final int port = mailConfig.getSmtpPort().intValue();
                      final String senderAddress = mailConfig.getSmtpServerSenderAddress();
                      final String recipientTO =u.getEmail();
                      final String recipientCC = null;
                      final String recipientBCC = null;
                      final String replyTo = null;
                      final String subject = reportconfig.getSname();
                      String strreportname="";
                  	  strreportname+=reportconfig.getEmexReportcategory().getSname()+" --> ";
                  	  strreportname+=reportconfig.getEmexReportcategoryDet().getSname()+" --> ";
                  	  strreportname+=reportconfig.getSname();
                      final String content = "<h4>Hi,"+u.getUsername()+ "</h4> <p>Here is attachment of Report :"+ strreportname+".</p>";
                      final String contentType = "text/html;";
                      final List<File> attachments = new ArrayList<File>();
                      attachments.add(ControlUtility.getresultsetdatainFile(new DalConnectionProvider(false), strmainQuery,response,reportconfig.getSname(),conn));
                      final Date sentDate = new Date();
                      final List<String> headerExtras = null;
                      final Object[] emailToSend = { host, auth, username, password, connSecurity, port,
                              senderAddress, recipientTO, recipientCC, recipientBCC, replyTo, subject,
                              content, contentType, attachments, sentDate, headerExtras };
                      EmailManager.sendEmail((String) emailToSend[0],
                              ((Boolean) emailToSend[1]).booleanValue(), (String) emailToSend[2],
                              (String) emailToSend[3], (String) emailToSend[4],
                              ((Number) emailToSend[5]).intValue(), (String) emailToSend[6],
                              (String) emailToSend[7], (String) emailToSend[8], (String) emailToSend[9],
                              (String) emailToSend[10], (String) emailToSend[11], (String) emailToSend[12],
                              (String) emailToSend[13], (List<File>) emailToSend[14], (Date) emailToSend[15],
                              (List<String>) emailToSend[16]);
                      
                      printPageDataSheet(response, vars,"EMAIL");         
    	    	      
    	    }catch(Exception e){
    	    	final String exceptionClass = e.getClass().toString().replace("class ", "");
                String exceptionString = "Problems while sending the email" + e;
                exceptionString = exceptionString.replace(exceptionClass, "");
                throw new ServletException(exceptionString);
    	    }
    	    finally{
    	    	OBContext.restorePreviousMode();
    	    }
    }
   
    }
    finally{
    	OBContext.restorePreviousMode();
    }
    
  }
public static String getdependqueryvalue(String strSQl,VariablesSecureApp vars,HttpServletRequest request){
	String strSqlquery=ControlUtility.parseQuery(strSQl,vars);
	String regexString = Pattern.quote("@") + "(.*?)" + Pattern.quote("@");
	Pattern pattern = Pattern.compile(regexString);
	Matcher matcher = pattern.matcher(strSqlquery);

	while (matcher.find()) {
	  String inpparameter = matcher.group(1); // Since (.*?) is capturing group 1
	  if(!inpparameter.equals("_##_")){
		
	
	  // You can insert match into a List/Collection here
	  MEXDReportCnfgline rptcnfgline=getMEXDReportCnfgline(inpparameter);
		  try {
			  strSqlquery=ControlUtility.parsemainQuery(strSqlquery, vars, rptcnfgline.getSparavalue(), inpparameter, rptcnfgline.getScontroltype(), request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
	return strSqlquery;
}
public static MEXDReportCnfgline getMEXDReportCnfgline(String sinpname) {
    final OBCriteria<MEXDReportCnfgline> rptcnfglncrt = OBDal.getInstance()
        .createCriteria(MEXDReportCnfgline.class);
    rptcnfglncrt.add(Restrictions.eq(MEXDReportCnfgline.PROPERTY_SINPNAME, sinpname));

    MEXDReportCnfgline rptcnfgln = rptcnfglncrt.list().get(0);
    return rptcnfgln;
  }
  private void printPageDataExcel(HttpServletResponse response, VariablesSecureApp vars,
      String strmainQuery,String sname,Connection conn)
      throws IOException, ServletException {
	 // OBContext.setAdminMode(true);
     
    ControlUtility.getresultsetdata(new DalConnectionProvider(false), strmainQuery,response,sname,conn);
   
	
  }
  private void printPageDataZip(HttpServletResponse response, VariablesSecureApp vars,
	      String strmainQuery,String sname,Connection conn)
	      throws IOException, ServletException {
		 // OBContext.setAdminMode(true);
	     
	    ControlUtility.getresultsetdatainzip(new DalConnectionProvider(false), strmainQuery,response,sname,conn);
	   
		
	  }
  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, String strCommand ) throws IOException,
      ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    String strReportId="";
    String strReportcatId="";
    String strReportsubcatId="";
    if(!strCommand.equals("DEFAULT")){
     strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
     strReportcatId = vars.getGlobalVariable("inpemexReportcatId", "exportdatambs|inpemexReportcatId", "");
     strReportsubcatId = vars.getGlobalVariable("inpemexReportsubcatId", "exportdatambs|inpemexReportsubcatId", "");
    }
    XmlDocument xmlDocument = null;
    xmlDocument = xmlEngine.readXmlTemplate("it/embio/exportdata/ad_forms/exportdatambs")
        .createXmlDocument();
    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "exportdatambs", false, "", "", "",
            false, "ad_forms", strReplaceWith, false, true);
        toolbar.prepareSimpleToolBarTemplate();
        xmlDocument.setParameter("toolbar", toolbar.toString());
        try {
            WindowTabs tabs = new WindowTabs(this, vars,
                "it.embio.exportdata.ad_forms.exportdatambs");
            xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
            xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
            xmlDocument.setParameter("childTabContainer", tabs.childTabs());
            xmlDocument.setParameter("theme", vars.getTheme());
            NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "exportdatambs.html",
                classInfo.id, classInfo.type, strReplaceWith, tabs.breadcrumb());
            xmlDocument.setParameter("navigationBar", nav.toString());
            LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "exportdatambs.html",
                strReplaceWith);
            xmlDocument.setParameter("leftTabs", lBar.manualTemplate());
            xmlDocument.setParameter("calendar", vars.getLanguage().substring(0, 2));
          } catch (Exception ex) {
            throw new ServletException(ex);
          }
        OBError myMessage = vars.getMessage("exportdatambs");
        vars.removeMessage("exportdatambs");
        if (myMessage != null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
        Role role =OBDal.getInstance().get(Role.class, vars.getRole());
   
    xmlDocument.setData(
            "reportMEXD_Reportcat",
            "liststructure",
            (role.isClientAdmin()?ReportConfigListData.selectreportcatadmin(this):ReportConfigListData.selectreportcat(this,vars.getRole())));
  
	    String strSqladmin = "";
	    strSqladmin = strSqladmin + 
	      "      SELECT a.emex_reportcategory_det_id AS id, a.sName AS name" +
	      "      FROM emex_reportcategory_det a"+
	      "		 where a.emex_reportcategory_id='"+strReportcatId+"'";
	    String strSql = "";
	    strSql = strSql + 
	      "      SELECT a.emex_reportcategory_det_id AS id, a.sName AS name" +
	      "      FROM emex_reportcategory_det a" +
	      "      INNER JOIN emex_reportaccess b on b.emex_reportcategory_det_id=a.emex_reportcategory_det_id" +
	      "      where b.AD_Role_ID='"+vars.getRole()+"'"+
	      "		 And a.emex_reportcategory_id='"+strReportcatId+"'";
	    xmlDocument.setData(
	            "reportMEXD_Reportsubcat",
	            "liststructure",
	            (role.isClientAdmin()?Combolistdata.select(this, strSqladmin, null):Combolistdata.select(this, strSql, null)));
	    
	    String strSqladminrpt = "";
	    strSqladminrpt = strSqladminrpt + 
		  "      SELECT a.emex_ReportConfig_id AS id, a.sName AS name" +
	      "      FROM emex_ReportConfig a"+
	      "		 where a.emex_reportcategory_det_id='"+strReportsubcatId+"'";
	    String strSqlrpt = "";
	    strSqlrpt = strSqlrpt + 
		  "      SELECT a.emex_ReportConfig_id AS id, a.sName AS name" +
	      "      FROM emex_ReportConfig a" +
	      "      INNER JOIN emex_reportaccess b on b.emex_ReportConfig_id=a.emex_ReportConfig_id" +
	      "      where b.AD_Role_ID='"+vars.getRole()+"'"+
	      "		 AND a.emex_reportcategory_det_id='"+strReportsubcatId+"'";
	    xmlDocument.setData(
	            "reportMEXD_ReportConfig",
	            "liststructure",
	            (role.isClientAdmin()?Combolistdata.select(this, strSqladminrpt, null):Combolistdata.select(this, strSqlrpt, null)));
	    
    xmlDocument.setParameter(
            "paramreportsubcatarray",
            Utility.arrayDobleEntrada("paramreportsubcatarray",
            		(role.isClientAdmin()?ReportConfigListData.selectreportsubcatadmin(this):ReportConfigListData.selectreportsubcat(this,vars.getRole()))));
    
    xmlDocument.setParameter(
            "paramreportarray",
            Utility.arrayDobleEntrada("paramreportarray",
            		(role.isClientAdmin()?ReportConfigListData.selectadmin(this):ReportConfigListData.select(this,vars.getRole()))));
    if(!strCommand.equals("DEFAULT")){
	    xmlDocument.setParameter("inpemexReportcatId", strReportcatId);
	    xmlDocument.setParameter("inpemexReportsubcatId", strReportsubcatId);
	    xmlDocument.setParameter("MEXDReportConfig", strReportId);
    }
    
    out.println(xmlDocument.print());
    out.close();
  }
  private void printPageDatagrid(HttpServletResponse response, VariablesSecureApp vars,String strmainQuery,String sname,Connection conn) throws IOException,
  ServletException {
if (log4j.isDebugEnabled())
  log4j.debug("Output: dataSheet");
response.setContentType("text/html; charset=UTF-8");
PrintWriter out = response.getWriter();
String strReportId = vars.getGlobalVariable("inpemexReportConfigId", "exportdatambs|inpemexReportConfigId", "");
String strReportcatId = vars.getGlobalVariable("inpemexReportcatId", "exportdatambs|inpemexReportcatId", "");
String strReportsubcatId = vars.getGlobalVariable("inpemexReportsubcatId", "exportdatambs|inpemexReportsubcatId", "");


XmlDocument xmlDocument = null;
xmlDocument = xmlEngine.readXmlTemplate("in/mbs/exportdata/ad_forms/exportdatambs")
    .createXmlDocument();
ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "exportdatambs", false, "", "", "",
        false, "ad_forms", strReplaceWith, false, true);
    toolbar.prepareSimpleToolBarTemplate();
    xmlDocument.setParameter("toolbar", toolbar.toString());
    try {
        WindowTabs tabs = new WindowTabs(this, vars,
            "it.embio.exportdata.ad_forms.exportdatambs");
        xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
        xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
        xmlDocument.setParameter("childTabContainer", tabs.childTabs());
        xmlDocument.setParameter("theme", vars.getTheme());
        NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "exportdatambs.html",
            classInfo.id, classInfo.type, strReplaceWith, tabs.breadcrumb());
        xmlDocument.setParameter("navigationBar", nav.toString());
        LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "exportdatambs.html",
            strReplaceWith);
        xmlDocument.setParameter("leftTabs", lBar.manualTemplate());
        xmlDocument.setParameter("calendar", vars.getLanguage().substring(0, 2));
      } catch (Exception ex) {
        throw new ServletException(ex);
      }
    OBError myMessage = vars.getMessage("exportdatambs");
    vars.removeMessage("exportdatambs");
    if (myMessage != null) {
      xmlDocument.setParameter("messageType", myMessage.getType());
      xmlDocument.setParameter("messageTitle", myMessage.getTitle());
      xmlDocument.setParameter("messageMessage", myMessage.getMessage());
    }
    Role role =OBDal.getInstance().get(Role.class, vars.getRole());
    xmlDocument.setData(
            "reportMEXD_Reportcat",
            "liststructure",
            (role.isClientAdmin()?ReportConfigListData.selectreportcatadmin(this):ReportConfigListData.selectreportcat(this,vars.getRole())));
    String strSqladmin = "";
    strSqladmin = strSqladmin + 
      "      SELECT a.emex_reportcategory_det_id AS id, a.sName AS name" +
      "      FROM emex_reportcategory_det a"+
      "		 where a.emex_reportcategory_id='"+strReportcatId+"'";
    String strSql = "";
    strSql = strSql + 
      "      SELECT a.emex_reportcategory_det_id AS id, a.sName AS name" +
      "      FROM emex_reportcategory_det a" +
      "      INNER JOIN emex_reportaccess b on b.emex_reportcategory_det_id=a.emex_reportcategory_det_id" +
      "      where b.AD_Role_ID='"+vars.getRole()+"'"+
      "		 And a.emex_reportcategory_id='"+strReportcatId+"'";
    xmlDocument.setData(
            "reportMEXD_Reportsubcat",
            "liststructure",
            (role.isClientAdmin()?Combolistdata.select(this, strSqladmin, null):Combolistdata.select(this, strSql, null)));
    
    String strSqladminrpt = "";
    strSqladminrpt = strSqladminrpt + 
	  "      SELECT a.emex_ReportConfig_id AS id, a.sName AS name" +
      "      FROM emex_ReportConfig a"+
      "		 where a.emex_reportcategory_det_id='"+strReportsubcatId+"'";
    String strSqlrpt = "";
    strSqlrpt = strSqlrpt + 
	  "      SELECT a.emex_ReportConfig_id AS id, a.sName AS name" +
      "      FROM emex_ReportConfig a" +
      "      INNER JOIN emex_reportaccess b on b.emex_ReportConfig_id=a.emex_ReportConfig_id" +
      "      where b.AD_Role_ID='"+vars.getRole()+"'"+
      "		 And a.emex_reportcategory_det_id='"+strReportsubcatId+"'";
    xmlDocument.setData(
            "reportMEXD_ReportConfig",
            "liststructure",
            (role.isClientAdmin()?Combolistdata.select(this, strSqladminrpt, null):Combolistdata.select(this, strSqlrpt, null)));

     
    xmlDocument.setParameter(
            "paramreportsubcatarray",
            Utility.arrayDobleEntrada("paramreportsubcatarray",
            		(role.isClientAdmin()?ReportConfigListData.selectreportsubcatadmin(this):ReportConfigListData.selectreportsubcat(this,vars.getRole()))));
    
    xmlDocument.setParameter(
            "paramreportarray",
            Utility.arrayDobleEntrada("paramreportarray",
            		(role.isClientAdmin()?ReportConfigListData.selectadmin(this):ReportConfigListData.select(this,vars.getRole()))));
    xmlDocument.setParameter("inpemexReportcatId", strReportcatId);
    xmlDocument.setParameter("inpemexReportsubcatId", strReportsubcatId);
    xmlDocument.setParameter("MEXDReportConfig", strReportId);
    xmlDocument.setParameter("mexdReportName", ControlUtility.reportname(sname));
    xmlDocument.setParameter("mexdDynamicgrid", ControlUtility.gridcontrolformat(sname,ControlUtility.getresultgriddata(new DalConnectionProvider(false), strmainQuery,conn)));
   	out.println(xmlDocument.print());
	out.close();
}
  private void renderJRXml(VariablesSecureApp variables, HttpServletResponse response,
	      String strReportName, String strFileName, String strOutputType,
	      HashMap<String, Object> designParameters, JRDataSource data,
	      Map<Object, Object> exportParameters, boolean forceRefresh,Connection conn,ConnectionProvider connectionProvider) throws ServletException {
	    String localStrReportName = strReportName;
	    String localStrOutputType = getExportFormat(strOutputType);
	    String localStrFileName = strFileName;
	    Map<Object, Object> localExportParameters = exportParameters;
	    HashMap<String, Object> localDesignParameters = designParameters;
	   
	    final String strAttach = globalParameters.strFTPDirectory + "/284-" + classInfo.id;

	    final String strLanguage = variables.getLanguage();
	    final Locale locLocale = new Locale(strLanguage.substring(0, 2), strLanguage.substring(3, 5));

	    final String strBaseDesign = getBaseDesignPath(strLanguage);

	    localStrReportName = Replace.replace(
	        Replace.replace(localStrReportName, "@basedesign@", strBaseDesign), "@attach@", strAttach);
	    if (localStrFileName == null) {
	      localStrFileName = localStrReportName.substring(localStrReportName.lastIndexOf("/") + 1);
	    }

	    ServletOutputStream os = null;
	    UUID reportId = null;
	    try {
	      if (localDesignParameters == null)
	        localDesignParameters = new HashMap<String, Object>();

	      localDesignParameters.put("BASE_WEB", strReplaceWithFull);
	      localDesignParameters.put("BASE_DESIGN", strBaseDesign);
	      localDesignParameters.put("ATTACH", strAttach);
	      localDesignParameters.put("USER_CLIENT",
	          Utility.getContext(this, variables, "#User_Client", ""));
	      localDesignParameters.put("USER_ORG", Utility.getContext(this, variables, "#User_Org", ""));
	      localDesignParameters.put("LANGUAGE", strLanguage);
	      localDesignParameters.put("LOCALE", locLocale);
	      localDesignParameters.put("REPORT_TITLE",
	          PrintJRData.getReportTitle(this, variables.getLanguage(), classInfo.id));

	      final DecimalFormatSymbols dfs = new DecimalFormatSymbols();
	      dfs.setDecimalSeparator(variables.getSessionValue("#AD_ReportDecimalSeparator").charAt(0));
	      dfs.setGroupingSeparator(variables.getSessionValue("#AD_ReportGroupingSeparator").charAt(0));
	      final DecimalFormat numberFormat = new DecimalFormat(
	          variables.getSessionValue("#AD_ReportNumberFormat"), dfs);
	      localDesignParameters.put("NUMBERFORMAT", numberFormat);

	      os = response.getOutputStream();
	      if (localExportParameters == null)
	        localExportParameters = new HashMap<Object, Object>();
	      final ExportType expType = ExportType.getExportType(localStrOutputType);
	      ConnectionProvider connprovider=null;
	      if(conn!=null){
	    	  	MEXDConnectionProvider connprovider1 =new MEXDConnectionProvider();
	    	  	connprovider1.setConnection(conn);
	    	  	connprovider=connprovider1;
	      }else{
	    	  connprovider=connectionProvider;
	    	  
	      }
	     if (expType != ExportType.XML) {
	        reportId = UUID.randomUUID();
	        File outputFile = new File(globalParameters.strFTPDirectory + "/" + localStrFileName + "-"
	            + (reportId) + "." + localStrOutputType);
	        ReportingUtils.exportJR(localStrReportName, expType, localDesignParameters, outputFile,
	            false, connprovider, data, localExportParameters);
	        response.setContentType("text/html;charset=UTF-8");
	        response.setHeader("Content-disposition", "inline" + "; filename=" + localStrFileName + "-"
	            + (reportId)+ "." + localStrOutputType);
	       
	        downloadReport(variables,response,localStrFileName + "-"+ (reportId) + "." + localStrOutputType);
	       
	        connprovider.destroy();
	        
	      }

	    } catch (IOException ioe) {
	      try {
	        FileUtility f = new FileUtility(globalParameters.strFTPDirectory, localStrFileName + "-"
	            + (reportId) + "." + localStrOutputType, false, true);
	        if (f.exists())
	          f.deleteFile();
	      } catch (IOException ioex) {
	        log4j.error("Error trying to delete temporary report file " + localStrFileName + "-"
	            + (reportId) + "." + localStrOutputType + " : " + ioex.getMessage());
	      }
	    } catch (final Exception e) {
	      throw new ServletException(e.getMessage(), e);
	    } finally {
	      try {
	    	  
	    	  os.close();
	      } catch (final Exception e) {
	      }
	    }
	  }
  private void downloadReport(VariablesSecureApp vars, HttpServletResponse response, String report)
	      throws IOException, ServletException {

	    if (report.contains("..") || report.contains(File.separator))
	      throw new ServletException("Invalid report name");

	    FileUtility f = new FileUtility(globalParameters.strFTPDirectory, report, false, true);
	    if (!f.exists())
	      return;
	    int pos = report.indexOf("-");
	    String filename = report.substring(0, pos);
	    pos = report.lastIndexOf(".");
	    String extension = report.substring(pos);
	    try {
	      ExportType exportType = ExportType.getExportType(extension.substring(1));
	      response.setContentType(exportType.getContentType());
	    } catch (OBException ignore) {
	      // unsupported export type, use application/x-download content type
	      response.setContentType("application/x-download");
	    }
	    response.setHeader("Content-Disposition", "attachment; filename=" + filename + extension);
	    f.dumpFile(response.getOutputStream());
	    response.getOutputStream().flush();
	    response.getOutputStream().close();
	    if (!f.deleteFile())
	      log4j.error("Download report could not delete the file :" + report);
	  }

	  private String getExportFormat(String outputType) {
	    if (outputType == null || outputType.equals("")) {
	      return ExportType.HTML.getExtension();
	    }
	    if (ExportType.XLS.hasExtension(outputType)) {
	      return ReportingUtils.getExcelExportType().getExtension();
	    }
	    return outputType;
	  }

  public String getServletInfo() {
    return "Servlet exportdatambs.";
  } // end of getServletInfo() method
  
}
