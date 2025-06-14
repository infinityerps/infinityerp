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
class ErrorTextParserData implements FieldProvider {
static Logger log4j = LogManager.getLogger();
  private String InitRecordNumber="0";
  public String constraintName;
  public String constraintType;
  public String tableName;
  public String searchCondition;
  public String columnname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("constraint_name") || fieldName.equals("constraintName"))
      return constraintName;
    else if (fieldName.equalsIgnoreCase("constraint_type") || fieldName.equals("constraintType"))
      return constraintType;
    else if (fieldName.equalsIgnoreCase("table_name") || fieldName.equals("tableName"))
      return tableName;
    else if (fieldName.equalsIgnoreCase("search_condition") || fieldName.equals("searchCondition"))
      return searchCondition;
    else if (fieldName.equals("columnname"))
      return columnname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ErrorTextParserData[] select(ConnectionProvider connectionProvider, String constraintName)    throws ServletException {
    return select(connectionProvider, constraintName, 0, 0);
  }

  public static ErrorTextParserData[] select(ConnectionProvider connectionProvider, String constraintName, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select constraint_name, constraint_type, table_name, " +
      "      AD_DBA_USER_CONST_SEARCHCOND(constraint_name) AS search_condition " +
      "      from user_constraints " +
      "      where UPPER(constraint_name) = UPPER(?)";

    ResultSet result;
    Vector<ErrorTextParserData> vector = new Vector<ErrorTextParserData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, constraintName);

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
        ErrorTextParserData objectErrorTextParserData = new ErrorTextParserData();
        objectErrorTextParserData.constraintName = UtilSql.getValue(result, "constraint_name");
        objectErrorTextParserData.constraintType = UtilSql.getValue(result, "constraint_type");
        objectErrorTextParserData.tableName = UtilSql.getValue(result, "table_name");
        objectErrorTextParserData.searchCondition = UtilSql.getValue(result, "search_condition");
        objectErrorTextParserData.columnname = "";
        objectErrorTextParserData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectErrorTextParserData);
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
    ErrorTextParserData objectErrorTextParserData[] = new ErrorTextParserData[vector.size()];
    vector.copyInto(objectErrorTextParserData);
    return(objectErrorTextParserData);
  }

  public static String selectColumnName(ConnectionProvider connectionProvider, String language, String tableName, String columnName)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select coalesce(et.name, e.name, c.name) as column_name" +
      "          from ad_table t," +
      "               ad_column c" +
      "                left join ad_element e" +
      "                       on c.ad_element_id = e.ad_element_id" +
      "                left join ad_element_trl et" +
      "                       on e.ad_element_id = et.ad_element_id" +
      "                      and et.ad_language = ?" +
      "         where t.ad_table_id = c.ad_table_id" +
      "           and upper(t.tableName) = upper(?)" +
      "           and upper(c.columnName) = upper(?)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tableName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnName);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "column_name");
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

  public static ErrorTextParserData[] selectColumnNamesForConstraint(ConnectionProvider connectionProvider, String sql, String columnname)    throws ServletException {
    return selectColumnNamesForConstraint(connectionProvider, sql, columnname, 0, 0);
  }

  public static ErrorTextParserData[] selectColumnNamesForConstraint(ConnectionProvider connectionProvider, String sql, String columnname, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select ";
    strSql = strSql + ((sql==null || sql.equals(""))?"":sql);

    ResultSet result;
    Vector<ErrorTextParserData> vector = new Vector<ErrorTextParserData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (sql != null && !(sql.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);

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
        ErrorTextParserData objectErrorTextParserData = new ErrorTextParserData();
        objectErrorTextParserData.columnname = UtilSql.getValue(result, "columnname");
        objectErrorTextParserData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectErrorTextParserData);
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
    ErrorTextParserData objectErrorTextParserData[] = new ErrorTextParserData[vector.size()];
    vector.copyInto(objectErrorTextParserData);
    return(objectErrorTextParserData);
  }
}
