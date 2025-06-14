//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility;

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
public class WindowTreeData implements FieldProvider {
static Logger log4j = LogManager.getLogger();
  private String InitRecordNumber="0";
  public String nodeId;
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("node_id") || fieldName.equals("nodeId"))
      return nodeId;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static WindowTreeData[] selectTreeID(ConnectionProvider connectionProvider, String adClientId, String treetype)    throws ServletException {
    return selectTreeID(connectionProvider, adClientId, treetype, 0, 0);
  }

  public static WindowTreeData[] selectTreeID(ConnectionProvider connectionProvider, String adClientId, String treetype, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NODE_ID, ID, NAME " +
      "        FROM (" +
      "         SELECT AD_Client_ID as Node_ID, AD_Tree_ID AS ID, NAME, 1 AS SEQNO" +
      "        FROM AD_Tree t1" +
      "        WHERE t1.AD_Client_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ")  " +
      "        AND AD_Client_ID != '0'" +
      "        AND TreeType = ? " +
      "        AND IsActive = 'Y'" +
      "      UNION" +
      "       SELECT AD_Client_ID as Node_ID, AD_Tree_ID AS ID, NAME, 2 AS SEQNO" +
      "        FROM AD_Tree t2" +
      "        WHERE t2.AD_Client_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ") " +
      "        AND AD_Client_id = '0'" +
      "        AND TreeType = ?" +
      "        AND IsActive = 'Y') f" +
      "        ORDER BY SEQNO";

    ResultSet result;
    Vector<WindowTreeData> vector = new Vector<WindowTreeData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, treetype);
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, treetype);

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
        WindowTreeData objectWindowTreeData = new WindowTreeData();
        objectWindowTreeData.nodeId = UtilSql.getValue(result, "node_id");
        objectWindowTreeData.id = UtilSql.getValue(result, "id");
        objectWindowTreeData.name = UtilSql.getValue(result, "name");
        objectWindowTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTreeData);
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
    WindowTreeData objectWindowTreeData[] = new WindowTreeData[vector.size()];
    vector.copyInto(objectWindowTreeData);
    return(objectWindowTreeData);
  }

  public static WindowTreeData[] selectTreeIDWithTableId(ConnectionProvider connectionProvider, String adClientId, String ad_table_id)    throws ServletException {
    return selectTreeIDWithTableId(connectionProvider, adClientId, ad_table_id, 0, 0);
  }

  public static WindowTreeData[] selectTreeIDWithTableId(ConnectionProvider connectionProvider, String adClientId, String ad_table_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NODE_ID, ID, NAME " +
      "        FROM (" +
      "         SELECT AD_Client_ID as Node_ID, AD_Tree_ID AS ID, NAME, 1 AS SEQNO" +
      "        FROM AD_Tree t1" +
      "        WHERE t1.AD_Client_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ")  " +
      "        AND AD_Client_ID != '0'" +
      "        AND ad_table_id = ? " +
      "        AND IsActive = 'Y'" +
      "      UNION" +
      "       SELECT AD_Client_ID as Node_ID, AD_Tree_ID AS ID, NAME, 2 AS SEQNO" +
      "        FROM AD_Tree t2" +
      "        WHERE t2.AD_Client_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ") " +
      "        AND AD_Client_id = '0'" +
      "        AND ad_table_id = ?" +
      "        AND IsActive = 'Y') f" +
      "        ORDER BY SEQNO";

    ResultSet result;
    Vector<WindowTreeData> vector = new Vector<WindowTreeData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_table_id);
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_table_id);

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
        WindowTreeData objectWindowTreeData = new WindowTreeData();
        objectWindowTreeData.nodeId = UtilSql.getValue(result, "node_id");
        objectWindowTreeData.id = UtilSql.getValue(result, "id");
        objectWindowTreeData.name = UtilSql.getValue(result, "name");
        objectWindowTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTreeData);
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
    WindowTreeData objectWindowTreeData[] = new WindowTreeData[vector.size()];
    vector.copyInto(objectWindowTreeData);
    return(objectWindowTreeData);
  }
}
