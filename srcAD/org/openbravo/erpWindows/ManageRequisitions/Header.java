
package org.openbravo.erpWindows.ManageRequisitions;


import org.openbravo.erpCommon.reference.*;


import org.openbravo.erpCommon.ad_actionButton.*;


import org.openbravo.erpCommon.utility.*;
import org.openbravo.data.FieldProvider;
import org.openbravo.utils.FormatUtilities;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.base.exception.OBException;
import org.openbravo.scheduling.ProcessBundle;
import org.openbravo.scheduling.ProcessRunner;
import org.openbravo.xmlEngine.XmlDocument;
import org.openbravo.database.SessionInfo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

// Generated old code, not worth to make i.e. java imports perfect
@SuppressWarnings("unused")
public class Header extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  
  private static final String windowId = "1004400000";
  private static final String tabId = "1004400001";
  private static final int accesslevel = 1;
  private static final String moduleId = "0";
  
  @Override
  public void init(ServletConfig config) {
    setClassInfo("W", tabId, moduleId);
    super.init(config);
  }
  
  
  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    String command = vars.getCommand();
    
    boolean securedProcess = false;
    if (command.contains("BUTTON")) {
     List<String> explicitAccess = Arrays.asList( "");
    
     SessionInfo.setUserId(vars.getSessionValue("#AD_User_ID"));
     SessionInfo.setSessionId(vars.getSessionValue("#AD_Session_ID"));
     SessionInfo.setQueryProfile("manualProcess");
     
      if (command.contains("EF591985C486468F9B97B605D15A1633")) {
        SessionInfo.setProcessType("P");
        SessionInfo.setProcessId("EF591985C486468F9B97B605D15A1633");
        SessionInfo.setModuleId("0");
      }
     
      try {
        securedProcess = "Y".equals(org.openbravo.erpCommon.businessUtility.Preferences
            .getPreferenceValue("SecuredProcess", true, vars.getClient(), vars.getOrg(), vars
                .getUser(), vars.getRole(), windowId));
      } catch (PropertyException e) {
      }
     
      if (command.contains("1004400000")) {
        SessionInfo.setProcessType("P");
        SessionInfo.setProcessId("1004400000");
        SessionInfo.setModuleId("0");
        if (securedProcess || explicitAccess.contains("1004400000")) {
          classInfo.type = "P";
          classInfo.id = "1004400000";
        }
      }
     

     
      if (explicitAccess.contains("EF591985C486468F9B97B605D15A1633") || (securedProcess && command.contains("EF591985C486468F9B97B605D15A1633"))) {
        classInfo.type = "P";
        classInfo.id = "EF591985C486468F9B97B605D15A1633";
      }
     
    }
    if (!securedProcess) {
      setClassInfo("W", tabId, moduleId);
    }
    super.service(request, response);
  }
  

  public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    Boolean saveRequest = (Boolean) request.getAttribute("autosave");
    
    if(saveRequest != null && saveRequest){
      throw new OBException("2.50 style request.autosave is no longer supported: " + vars.getCommand());
    }
    
    if (vars.commandIn("DEFAULT", "DIRECT", "TAB", "SEARCH", "RELATION", "NEW", "EDIT", "NEXT",
        "PREVIOUS", "FIRST_RELATION", "PREVIOUS_RELATION", "NEXT_RELATION", "LAST_RELATION",
        "LAST", "SAVE_NEW_RELATION", "SAVE_NEW_NEW", "SAVE_NEW_EDIT", "SAVE_EDIT_RELATION",
        "SAVE_EDIT_NEW", "SAVE_EDIT_EDIT", "SAVE_EDIT_NEXT", "DELETE", "SAVE_XHR")) {
      throw new OBException("2.50 style command is no longer supported: " + vars.getCommand());

     } else if (vars.commandIn("BUTTONCreatepo1004400000")) {
        vars.setSessionValue("button1004400000.strcreatepo", vars.getStringParameter("inpcreatepo"));
        vars.setSessionValue("button1004400000.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("button1004400000.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("button1004400000.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        p.put("AD_Org_ID", vars.getStringParameter("inpadOrgId"));

        
        //Save in session needed params for combos if needed
        vars.setSessionObject("button1004400000.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "1004400000", request.getServletPath());    
     } else if (vars.commandIn("BUTTON1004400000")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
        String strcreatepo = vars.getSessionValue("button1004400000.strcreatepo");
        String strProcessing = vars.getSessionValue("button1004400000.strProcessing");
        String strOrg = vars.getSessionValue("button1004400000.strOrg");
        String strClient = vars.getSessionValue("button1004400000.strClient");
        
        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonCreatepo1004400000(response, vars, strM_Requisition_ID, strcreatepo, strProcessing);
        }

    } else if (vars.commandIn("BUTTONProcess_RequisitionEF591985C486468F9B97B605D15A1633")) {
        vars.setSessionValue("buttonEF591985C486468F9B97B605D15A1633.strprocessRequisition", vars.getStringParameter("inpprocessRequisition"));
        vars.setSessionValue("buttonEF591985C486468F9B97B605D15A1633.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("buttonEF591985C486468F9B97B605D15A1633.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("buttonEF591985C486468F9B97B605D15A1633.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        p.put("DocStatus", vars.getStringParameter("inpdocstatus"));

        
        //Save in session needed params for combos if needed
        vars.setSessionObject("buttonEF591985C486468F9B97B605D15A1633.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "EF591985C486468F9B97B605D15A1633", request.getServletPath());
      } else if (vars.commandIn("BUTTONEF591985C486468F9B97B605D15A1633")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
        String strprocessRequisition = vars.getSessionValue("buttonEF591985C486468F9B97B605D15A1633.strprocessRequisition");
        String strProcessing = vars.getSessionValue("buttonEF591985C486468F9B97B605D15A1633.strProcessing");
        String strOrg = vars.getSessionValue("buttonEF591985C486468F9B97B605D15A1633.strOrg");
        String strClient = vars.getSessionValue("buttonEF591985C486468F9B97B605D15A1633.strClient");

        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonProcess_RequisitionEF591985C486468F9B97B605D15A1633(response, vars, strM_Requisition_ID, strprocessRequisition, strProcessing);
        }

    } else if (vars.commandIn("SAVE_BUTTONCreatepo1004400000")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Requisition_ID", "");
        String strcreatepo = vars.getStringParameter("inpcreatepo");
        String strProcessing = vars.getStringParameter("inpprocessing");
        OBError myMessage = null;
        try {
          String pinstance = SequenceIdData.getUUID();
          PInstanceProcessData.insertPInstance(this, pinstance, "1004400000", (("M_Requisition_ID".equalsIgnoreCase("AD_Language"))?"0":strM_Requisition_ID), strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
          String strdateordered = vars.getStringParameter("inpdateordered");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "10", "DateOrdered", strdateordered, vars.getClient(), vars.getOrg(), vars.getUser());
String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "11", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strmWarehouseId = vars.getStringParameter("inpmWarehouseId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "12", "M_Warehouse_ID", strmWarehouseId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcBpartnerId = vars.getStringParameter("inpcBpartnerId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "C_BPartner_ID", strcBpartnerId, vars.getClient(), vars.getOrg(), vars.getUser());
String strmPricelistId = vars.getStringParameter("inpmPricelistId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "M_PriceList_ID", strmPricelistId, vars.getClient(), vars.getOrg(), vars.getUser());

          
          ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
          new ProcessRunner(bundle).execute(this);
          
          PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
          myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
        } catch (ServletException ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);

    } else if (vars.commandIn("SAVE_BUTTONProcess_RequisitionEF591985C486468F9B97B605D15A1633")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Requisition_ID", "");
        
        ProcessBundle pb = new ProcessBundle("EF591985C486468F9B97B605D15A1633", vars).init(this);
        HashMap<String, Object> params= new HashMap<String, Object>();
       
        params.put("M_Requisition_ID", strM_Requisition_ID);
        params.put("adOrgId", vars.getStringParameter("inpadOrgId"));
        params.put("adClientId", vars.getStringParameter("inpadClientId"));
        params.put("tabId", tabId);
        
        String straction = vars.getStringParameter("inpaction");
params.put("action", straction);

        
        pb.setParams(params);
        OBError myMessage = null;
        try {
          new ProcessRunner(pb).execute(this);
          myMessage = (OBError) pb.getResult();
          myMessage.setMessage(Utility.parseTranslation(this, vars, vars.getLanguage(), myMessage.getMessage()));
          myMessage.setTitle(Utility.parseTranslation(this, vars, vars.getLanguage(), myMessage.getTitle()));
        } catch (Exception ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          log4j.error(ex);
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);



    } else if (vars.getCommand().toUpperCase().startsWith("BUTTON") || vars.getCommand().toUpperCase().startsWith("SAVE_BUTTON")) {
      pageErrorPopUp(response);
    } else pageError(response);
  }

  private void printPageButtonFS(HttpServletResponse response, VariablesSecureApp vars, String strProcessId, String path) throws IOException, ServletException {
    log4j.debug("Output: Frames action button");
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
        "org/openbravo/erpCommon/ad_actionButton/ActionButtonDefaultFrames").createXmlDocument();
    xmlDocument.ignoreTranslation = true;
    xmlDocument.setParameter("processId", strProcessId);
    xmlDocument.setParameter("trlFormType", "PROCESS");
    xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
    xmlDocument.setParameter("type", strDireccion + path);
    out.println(xmlDocument.print());
    out.close();
  }

    private void printPageButtonCreatepo1004400000(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, String strcreatepo, String strProcessing)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 1004400000");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/Createpo1004400000", discard).createXmlDocument();
      xmlDocument.setParameter("key", strM_Requisition_ID);
      xmlDocument.setParameter("processing", strProcessing);
      xmlDocument.setParameter("form", "Header_Edition.html");
      xmlDocument.setParameter("window", windowId);
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("processId", "1004400000");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      
      {
        OBError myMessage = vars.getMessage("1004400000");
        vars.removeMessage("1004400000");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DateOrdered", DateTimeData.today(this));
    xmlDocument.setParameter("DateOrdered_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("AD_Org_ID", Utility.getContext(this, vars, "AD_Org_ID", "1004400000"));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "FDC45D1AE2404B8384D14DB6DED90DCF", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, (FieldProvider) vars.getSessionObject("button1004400000.originalParams"), comboTableData, windowId, Utility.getContext(this, vars, "AD_Org_ID", "1004400000"));
    xmlDocument.setData("reportAD_Org_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("M_Warehouse_ID", Utility.getContext(this, vars, "#M_WAREHOUSE_ID", windowId));
    comboTableData = new ComboTableData(vars, this, "19", "M_Warehouse_ID", "", "A3DCDE5EDD4A4403AC205B131F10F84D", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, (FieldProvider) vars.getSessionObject("button1004400000.originalParams"), comboTableData, windowId, Utility.getContext(this, vars, "#M_WAREHOUSE_ID", windowId));
    xmlDocument.setData("reportM_Warehouse_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_BPartner_ID", HeaderData.selectActP1004400000_C_BPartner_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000")));
    xmlDocument.setParameter("C_BPartner_IDR", HeaderData.selectActDefC_BPartner_ID(this, HeaderData.selectActP1004400000_C_BPartner_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000"))));
    xmlDocument.setParameter("M_PriceList_ID", HeaderData.selectActP1004400000_M_PriceList_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000")));
    comboTableData = new ComboTableData(vars, this, "19", "M_PriceList_ID", "", "1004400001", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, (FieldProvider) vars.getSessionObject("button1004400000.originalParams"), comboTableData, windowId, HeaderData.selectActP1004400000_M_PriceList_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000")));
    xmlDocument.setData("reportM_PriceList_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      
      out.println(xmlDocument.print());
      out.close();
    }


    void printPageButtonProcess_RequisitionEF591985C486468F9B97B605D15A1633(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, String strprocessRequisition, String strProcessing)
    throws IOException, ServletException {
      log4j.debug("Output: Button process EF591985C486468F9B97B605D15A1633");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/Process_RequisitionEF591985C486468F9B97B605D15A1633", discard).createXmlDocument();
      xmlDocument.setParameter("key", strM_Requisition_ID);
      xmlDocument.setParameter("processing", strProcessing);
      xmlDocument.setParameter("form", "Header_Edition.html");
      xmlDocument.setParameter("window", windowId);
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("processId", "EF591985C486468F9B97B605D15A1633");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      
      {
        OBError myMessage = vars.getMessage("EF591985C486468F9B97B605D15A1633");
        vars.removeMessage("EF591985C486468F9B97B605D15A1633");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("action", "");
    comboTableData = new ComboTableData(vars, this, "17", "action", "135", "535C7E50397B4CC28AD2B6C228E0DBF0", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, (FieldProvider) vars.getSessionObject("buttonEF591985C486468F9B97B605D15A1633.originalParams"), comboTableData, windowId, "");
    xmlDocument.setData("reportaction", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      
      out.println(xmlDocument.print());
      out.close();
    }

}
