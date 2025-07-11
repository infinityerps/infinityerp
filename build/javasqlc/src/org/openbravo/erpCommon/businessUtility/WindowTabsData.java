//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

@SuppressWarnings("serial")
public class WindowTabsData implements FieldProvider {
static Logger log4j = LogManager.getLogger();
  private String InitRecordNumber="0";
  public String adTabId;
  public String name;
  public String tabname;
  public String id;
  public String action;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_tab_id") || fieldName.equals("adTabId"))
      return adTabId;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("tabname"))
      return tabname;
    else if (fieldName.equals("id"))
      return id;
    else if (fieldName.equals("action"))
      return action;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static WindowTabsData[] selectManual(ConnectionProvider connectionProvider, String adTabId, String adLanguage, String adMenuId)    throws ServletException {
    return selectManual(connectionProvider, adTabId, adLanguage, adMenuId, 0, 0);
  }

  public static WindowTabsData[] selectManual(ConnectionProvider connectionProvider, String adTabId, String adLanguage, String adMenuId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select ? AS AD_Tab_ID, m.Name, coalesce(m_trl.name, m.name) as tabname" +
      "        from ad_menu m left join ad_menu_trl m_trl on m.ad_menu_id = m_trl.ad_menu_id" +
      "                              and m_trl.ad_language = ?" +
      "        where m.isactive = 'Y'" +
      "        and m.ad_menu_id = ?";

    ResultSet result;
    Vector<WindowTabsData> vector = new Vector<WindowTabsData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adMenuId);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.adTabId = UtilSql.getValue(result, "ad_tab_id");
        objectWindowTabsData.name = UtilSql.getValue(result, "name");
        objectWindowTabsData.tabname = UtilSql.getValue(result, "tabname");
        objectWindowTabsData.id = "";
        objectWindowTabsData.action = "";
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      if (log4j.isDebugEnabled()) {
        log4j.error("SQL error in query: " + strSql, e);
      } else {
        log4j.error("SQL error in query: " + strSql + " :" + e);
      }
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      if (log4j.isDebugEnabled()) {
        log4j.error("Exception in query: " + strSql, ex);
      } else {
        log4j.error("Exception in query: " + strSql + " :" + ex);
      }
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception e){
        log4j.error("Error during release*Statement of query: " + strSql, e);
      }
    }
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static String selectMenuManual(ConnectionProvider connectionProvider, String adLanguage, String adMenuId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select AD_Parent_Menu_Element(m.AD_Menu_ID, m.AD_Client_ID, ?) AS NAME" +
      "        from ad_menu m " +
      "        where m.ad_menu_id = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adMenuId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
      }
      result.close();
    } catch(SQLException e){
      if (log4j.isDebugEnabled()) {
        log4j.error("SQL error in query: " + strSql, e);
      } else {
        log4j.error("SQL error in query: " + strSql + " :" + e);
      }
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      if (log4j.isDebugEnabled()) {
        log4j.error("Exception in query: " + strSql, ex);
      } else {
        log4j.error("Exception in query: " + strSql + " :" + ex);
      }
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception e){
        log4j.error("Error during release*Statement of query: " + strSql, e);
      }
    }
    return(strReturn);
  }

  public static WindowTabsData[] selectMenuInfo(ConnectionProvider connectionProvider, String adLanguage, String action, String adTabId)    throws ServletException {
    return selectMenuInfo(connectionProvider, adLanguage, action, adTabId, 0, 0);
  }

  public static WindowTabsData[] selectMenuInfo(ConnectionProvider connectionProvider, String adLanguage, String action, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select m.AD_Menu_ID AS ID, coalesce(mt.name, m.name) as name " +
      "        from AD_Menu m left join ad_menu_trl mt on m.ad_menu_id = mt.ad_menu_id " +
      "                                                  and mt.ad_language = ?" +
      "        where (CASE m.action WHEN 'R' THEN 'P' " +
      "                                  ELSE m.action END) = (CASE ? WHEN 'R' THEN 'P' ELSE ? END) " +
      "        and (m.ad_window_ID = ? " +
      "        or m.ad_process_ID = ? " +
      "        or m.ad_form_ID = ? " +
      "        )";

    ResultSet result;
    Vector<WindowTabsData> vector = new Vector<WindowTabsData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, action);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, action);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.id = UtilSql.getValue(result, "id");
        objectWindowTabsData.name = UtilSql.getValue(result, "name");
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      if (log4j.isDebugEnabled()) {
        log4j.error("SQL error in query: " + strSql, e);
      } else {
        log4j.error("SQL error in query: " + strSql + " :" + e);
      }
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      if (log4j.isDebugEnabled()) {
        log4j.error("Exception in query: " + strSql, ex);
      } else {
        log4j.error("Exception in query: " + strSql + " :" + ex);
      }
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception e){
        log4j.error("Error during release*Statement of query: " + strSql, e);
      }
    }
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static WindowTabsData[] selectJavaInfo(ConnectionProvider connectionProvider, String className)    throws ServletException {
    return selectJavaInfo(connectionProvider, className, 0, 0);
  }

  public static WindowTabsData[] selectJavaInfo(ConnectionProvider connectionProvider, String className, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select (CASE mo.Action" +
      "                   WHEN 'X' THEN mo.AD_Form_ID" +
      "                   WHEN 'P' THEN mo.AD_Process_ID" +
      "                   WHEN 'R' THEN mo.AD_Process_ID" +
      "                   WHEN 'C' THEN mo.AD_CallOut_ID" +
      "                   WHEN 'S' THEN mo.AD_Reference_ID" +
      "                   ELSE mo.AD_Tab_ID END) AS AD_Tab_ID, " +
      "        mo.action" +
      "        from ad_model_object mo, ad_model_object_mapping mom" +
      "        where mo.ad_model_object_id = mom.ad_model_object_id" +
      "        and mo.isActive = 'Y'" +
      "        and mom.isActive = 'Y' " +
      "        and mom.isDefault = 'Y'" +
      "        and UPPER(mo.CLASSNAME) = UPPER(?)";

    ResultSet result;
    Vector<WindowTabsData> vector = new Vector<WindowTabsData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, className);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.adTabId = UtilSql.getValue(result, "ad_tab_id");
        objectWindowTabsData.action = UtilSql.getValue(result, "action");
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      if (log4j.isDebugEnabled()) {
        log4j.error("SQL error in query: " + strSql, e);
      } else {
        log4j.error("SQL error in query: " + strSql + " :" + e);
      }
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      if (log4j.isDebugEnabled()) {
        log4j.error("Exception in query: " + strSql, ex);
      } else {
        log4j.error("Exception in query: " + strSql + " :" + ex);
      }
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception e){
        log4j.error("Error during release*Statement of query: " + strSql, e);
      }
    }
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static String selectWindowInfo(ConnectionProvider connectionProvider, String adLanguage, String adWindowId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select coalesce(mt.name, m.name) as name " +
      "        from ad_menu m left join ad_menu_trl mt on m.ad_menu_id = mt.ad_menu_id " +
      "                                                and mt.ad_language = ?" +
      "        where m.ad_window_id = ? " +
      "        and m.action = 'W' ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
      }
      result.close();
    } catch(SQLException e){
      if (log4j.isDebugEnabled()) {
        log4j.error("SQL error in query: " + strSql, e);
      } else {
        log4j.error("SQL error in query: " + strSql + " :" + e);
      }
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      if (log4j.isDebugEnabled()) {
        log4j.error("Exception in query: " + strSql, ex);
      } else {
        log4j.error("Exception in query: " + strSql + " :" + ex);
      }
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception e){
        log4j.error("Error during release*Statement of query: " + strSql, e);
      }
    }
    return(strReturn);
  }
}
