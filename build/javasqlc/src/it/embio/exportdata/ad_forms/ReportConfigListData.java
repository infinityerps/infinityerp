//Sqlc generated V1.O00-1
package it.embio.exportdata.ad_forms;

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
class ReportConfigListData implements FieldProvider {
static Logger log4j = LogManager.getLogger();
  private String InitRecordNumber="0";
  public String id;
  public String name;
  public String padre;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equals("padre"))
      return padre;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportConfigListData[] selectreportcat(ConnectionProvider connectionProvider, String AD_Role_ID)    throws ServletException {
    return selectreportcat(connectionProvider, AD_Role_ID, 0, 0);
  }

  public static ReportConfigListData[] selectreportcat(ConnectionProvider connectionProvider, String AD_Role_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT distinct a.emex_reportcategory_id AS ID, a.sName AS name" +
      "      FROM emex_reportcategory a" +
      "      INNER JOIN emex_reportaccess b on b.emex_reportcategory_id=a.emex_reportcategory_id" +
      "      where b.AD_Role_ID=?    ";

    ResultSet result;
    Vector<ReportConfigListData> vector = new Vector<ReportConfigListData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Role_ID);

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
        ReportConfigListData objectReportConfigListData = new ReportConfigListData();
        objectReportConfigListData.id = UtilSql.getValue(result, "id");
        objectReportConfigListData.name = UtilSql.getValue(result, "name");
        objectReportConfigListData.padre = "";
        objectReportConfigListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportConfigListData);
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
    ReportConfigListData objectReportConfigListData[] = new ReportConfigListData[vector.size()];
    vector.copyInto(objectReportConfigListData);
    return(objectReportConfigListData);
  }

  public static ReportConfigListData[] selectreportcatadmin(ConnectionProvider connectionProvider)    throws ServletException {
    return selectreportcatadmin(connectionProvider, 0, 0);
  }

  public static ReportConfigListData[] selectreportcatadmin(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT a.emex_reportcategory_id AS ID, a.sName AS name" +
      "      FROM emex_reportcategory a";

    ResultSet result;
    Vector<ReportConfigListData> vector = new Vector<ReportConfigListData>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        ReportConfigListData objectReportConfigListData = new ReportConfigListData();
        objectReportConfigListData.id = UtilSql.getValue(result, "id");
        objectReportConfigListData.name = UtilSql.getValue(result, "name");
        objectReportConfigListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportConfigListData);
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
    ReportConfigListData objectReportConfigListData[] = new ReportConfigListData[vector.size()];
    vector.copyInto(objectReportConfigListData);
    return(objectReportConfigListData);
  }

  public static ReportConfigListData[] select(ConnectionProvider connectionProvider, String AD_Role_ID)    throws ServletException {
    return select(connectionProvider, AD_Role_ID, 0, 0);
  }

  public static ReportConfigListData[] select(ConnectionProvider connectionProvider, String AD_Role_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT distinct a.emex_reportcategory_det_id as padre,a.emex_ReportConfig_id AS ID, a.sName AS name" +
      "      FROM emex_ReportConfig a" +
      "      INNER JOIN emex_reportaccess b on b.emex_ReportConfig_id=a.emex_ReportConfig_id" +
      "      where b.AD_Role_ID=?";

    ResultSet result;
    Vector<ReportConfigListData> vector = new Vector<ReportConfigListData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Role_ID);

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
        ReportConfigListData objectReportConfigListData = new ReportConfigListData();
        objectReportConfigListData.padre = UtilSql.getValue(result, "padre");
        objectReportConfigListData.id = UtilSql.getValue(result, "id");
        objectReportConfigListData.name = UtilSql.getValue(result, "name");
        objectReportConfigListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportConfigListData);
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
    ReportConfigListData objectReportConfigListData[] = new ReportConfigListData[vector.size()];
    vector.copyInto(objectReportConfigListData);
    return(objectReportConfigListData);
  }

  public static ReportConfigListData[] selectadmin(ConnectionProvider connectionProvider)    throws ServletException {
    return selectadmin(connectionProvider, 0, 0);
  }

  public static ReportConfigListData[] selectadmin(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT a.emex_reportcategory_det_id as padre,a.emex_ReportConfig_id AS ID, a.sName AS name" +
      "      FROM emex_ReportConfig a";

    ResultSet result;
    Vector<ReportConfigListData> vector = new Vector<ReportConfigListData>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        ReportConfigListData objectReportConfigListData = new ReportConfigListData();
        objectReportConfigListData.padre = UtilSql.getValue(result, "padre");
        objectReportConfigListData.id = UtilSql.getValue(result, "id");
        objectReportConfigListData.name = UtilSql.getValue(result, "name");
        objectReportConfigListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportConfigListData);
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
    ReportConfigListData objectReportConfigListData[] = new ReportConfigListData[vector.size()];
    vector.copyInto(objectReportConfigListData);
    return(objectReportConfigListData);
  }

  public static ReportConfigListData[] selectreportsubcat(ConnectionProvider connectionProvider, String AD_Role_ID)    throws ServletException {
    return selectreportsubcat(connectionProvider, AD_Role_ID, 0, 0);
  }

  public static ReportConfigListData[] selectreportsubcat(ConnectionProvider connectionProvider, String AD_Role_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT distinct a.emex_reportcategory_id as padre,a.emex_reportcategory_det_id AS id, a.sName AS name" +
      "      FROM emex_reportcategory_det a" +
      "      INNER JOIN emex_reportaccess b on b.emex_reportcategory_det_id=a.emex_reportcategory_det_id" +
      "      where b.AD_Role_ID=?";

    ResultSet result;
    Vector<ReportConfigListData> vector = new Vector<ReportConfigListData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Role_ID);

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
        ReportConfigListData objectReportConfigListData = new ReportConfigListData();
        objectReportConfigListData.padre = UtilSql.getValue(result, "padre");
        objectReportConfigListData.id = UtilSql.getValue(result, "id");
        objectReportConfigListData.name = UtilSql.getValue(result, "name");
        objectReportConfigListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportConfigListData);
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
    ReportConfigListData objectReportConfigListData[] = new ReportConfigListData[vector.size()];
    vector.copyInto(objectReportConfigListData);
    return(objectReportConfigListData);
  }

  public static ReportConfigListData[] selectreportsubcatadmin(ConnectionProvider connectionProvider)    throws ServletException {
    return selectreportsubcatadmin(connectionProvider, 0, 0);
  }

  public static ReportConfigListData[] selectreportsubcatadmin(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT a.emex_reportcategory_id as padre,a.emex_reportcategory_det_id AS id, a.sName AS name" +
      "      FROM emex_reportcategory_det a";

    ResultSet result;
    Vector<ReportConfigListData> vector = new Vector<ReportConfigListData>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        ReportConfigListData objectReportConfigListData = new ReportConfigListData();
        objectReportConfigListData.padre = UtilSql.getValue(result, "padre");
        objectReportConfigListData.id = UtilSql.getValue(result, "id");
        objectReportConfigListData.name = UtilSql.getValue(result, "name");
        objectReportConfigListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportConfigListData);
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
    ReportConfigListData objectReportConfigListData[] = new ReportConfigListData[vector.size()];
    vector.copyInto(objectReportConfigListData);
    return(objectReportConfigListData);
  }
}
