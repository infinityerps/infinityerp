//Sqlc generated V1.O00-1
package it.embio.exportdata.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;

import java.util.*;

class Combolistdata implements FieldProvider {
static Logger log4j = Logger.getLogger(Combolistdata.class);
  private String InitRecordNumber="0";
  public String id;
  public String name;
  public String valid;
  public String RowKey;
  public String Value;
  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equals("valid"))
        return valid;
    else if (fieldName.equals("RowKey"))
        return RowKey;
    else if (fieldName.equals("Value"))
        return Value;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static Combolistdata[] select(ConnectionProvider connectionProvider,String strSql,Connection conn)    throws ServletException {
    return select(connectionProvider, 0, 0,strSql,conn);
  }

  public static Combolistdata[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters,String strSql,Connection conn)    throws ServletException {
   
    ResultSet result;
    Vector<Combolistdata> vector = new Vector<Combolistdata>(0);
    PreparedStatement st = null;

    try {
    	if(conn!=null){
    		st = connectionProvider.getPreparedStatement(conn,strSql);
    	}
    	else{
    		st = connectionProvider.getPreparedStatement(strSql);
    	}
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
        Combolistdata objectReportConfigListData = new Combolistdata();
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
    Combolistdata objectReportConfigListData[] = new Combolistdata[vector.size()];
    vector.copyInto(objectReportConfigListData);
    return(objectReportConfigListData);
  }
  public static Combolistdata[] selectdependentdata(ConnectionProvider connectionProvider,String strSql,Connection conn)    throws ServletException {
	
	  	int firstRegister=0; int numberRegisters=0;
	    ResultSet result;
	    Vector<Combolistdata> vector = new Vector<Combolistdata>(0);
	    PreparedStatement st = null;

	    try {
	    	if(conn!=null){
	    		st = connectionProvider.getPreparedStatement(conn,strSql);
	    	}
	    	else{
	    		st = connectionProvider.getPreparedStatement(strSql);
	    	}
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
	        Combolistdata objectReportConfigListData = new Combolistdata();
	        objectReportConfigListData.valid = UtilSql.getValue(result, "valid");
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
	    Combolistdata objectReportConfigListData[] = new Combolistdata[vector.size()];
	    vector.copyInto(objectReportConfigListData);
	    return(objectReportConfigListData);
	  }
  public static Combolistdata[] selectlistdata(ConnectionProvider connectionProvider,String strSql,String key, String name,Connection conn,String pgLimit )    throws ServletException {
	      
	  String strSql1 =strSql;
	  strSql1="select * from ("+strSql1+") a where 1=1 ";
	  strSql1 = strSql1 + ((key==null || key.equals("") || key.equals("%") )?"":" AND UPPER(a.Value) LIKE UPPER(?)  ");
	  strSql1 = strSql1 + ((name==null || name.equals("") || name.equals("%") )?"":" AND UPPER(a.Name) LIKE UPPER(?)  ");
	  strSql1 = strSql1 + ((pgLimit==null || pgLimit.equals(""))?"":" LIMIT " + pgLimit);
	  	int firstRegister=0; int numberRegisters=0;
	  	int iParameter = 0;
	    ResultSet result;
	    Vector<Combolistdata> vector = new Vector<Combolistdata>(0);
	    PreparedStatement st = null;

	    try {
	    	if(conn!=null){
	    		st = connectionProvider.getPreparedStatement(conn,strSql1);
	    	}
	    	else{
	    		st = connectionProvider.getPreparedStatement(strSql1);
	    	}
	      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
	      if (key != null && !(key.equals("")) && !(key.equals("%"))) {
	          iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
	        }
	        if (name != null && !(name.equals("")) && !(name.equals("%"))) {
	          iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
	        }
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
	        Combolistdata objectReportConfigListData = new Combolistdata();
	        objectReportConfigListData.Value = UtilSql.getValue(result, "Value");
	        objectReportConfigListData.name = UtilSql.getValue(result, "name");
	        objectReportConfigListData.id = UtilSql.getValue(result, "id");
	        objectReportConfigListData.RowKey = UtilSql.getValue(result, "RowKey");
	        objectReportConfigListData.InitRecordNumber = Integer.toString(firstRegister);
	        vector.addElement(objectReportConfigListData);
	        if (countRecord >= numberRegisters && numberRegisters != 0) {
	          continueResult = false;
	        }
	      }
	      result.close();
	    } catch(SQLException e){
	      if (log4j.isDebugEnabled()) {
	        log4j.error("SQL error in query: " + strSql1, e);
	      } else {
	        log4j.error("SQL error in query: " + strSql1 + " :" + e);
	      }
	      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
	    } catch(Exception ex){
	      if (log4j.isDebugEnabled()) {
	        log4j.error("Exception in query: " + strSql1, ex);
	      } else {
	        log4j.error("Exception in query: " + strSql1 + " :" + ex);
	      }
	      throw new ServletException("@CODE=@" + ex.getMessage());
	    } finally {
	      try {
	        connectionProvider.releasePreparedStatement(st);
	      } catch(Exception e){
	        log4j.error("Error during release*Statement of query: " + strSql1, e);
	      }
	    }
	    Combolistdata objectReportConfigListData[] = new Combolistdata[vector.size()];
	    vector.copyInto(objectReportConfigListData);
	    return(objectReportConfigListData);
	  }
  public static String selectlistdatacount(ConnectionProvider connectionProvider,String strSql,String key, String name,Connection conn)    throws ServletException {
      String strSql1="select count(*) as VALUE from ("+strSql+") a where 1=1 ";
      strSql1 = strSql1 + ((key==null || key.equals("") || key.equals("%") )?"":" AND UPPER(a.Value) LIKE UPPER(?)  ");
	  strSql1 = strSql1 + ((name==null || name.equals("") || name.equals("%") )?"":" AND UPPER(a.Name) LIKE UPPER(?)  ");
	  

	  	int iParameter = 0;
	    ResultSet result;
	    PreparedStatement st = null;
	    String strReturn = null;
	    try {
	    	if(conn!=null){
	    		st = connectionProvider.getPreparedStatement(conn,strSql1);
	    	}
	    	else{
	    		st = connectionProvider.getPreparedStatement(strSql1);
	    	}
	      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
	      if (key != null && !(key.equals("")) && !(key.equals("%"))) {
	          iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
	        }
	        if (name != null && !(name.equals("")) && !(name.equals("%"))) {
	          iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
	        }
	      result = st.executeQuery();
	      if(result.next()) {
	          strReturn = UtilSql.getValue(result, "value");
	        }
	     
	      result.close();
	    } catch(SQLException e){
	      if (log4j.isDebugEnabled()) {
	        log4j.error("SQL error in query: " + strSql1, e);
	      } else {
	        log4j.error("SQL error in query: " + strSql1 + " :" + e);
	      }
	      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
	    } catch(Exception ex){
	      if (log4j.isDebugEnabled()) {
	        log4j.error("Exception in query: " + strSql1, ex);
	      } else {
	        log4j.error("Exception in query: " + strSql1 + " :" + ex);
	      }
	      throw new ServletException("@CODE=@" + ex.getMessage());
	    } finally {
	      try {
	        connectionProvider.releasePreparedStatement(st);
	      } catch(Exception e){
	        log4j.error("Error during release*Statement of query: " + strSql1, e);
	      }
	    }
	
	    return(strReturn);
	  }

}
