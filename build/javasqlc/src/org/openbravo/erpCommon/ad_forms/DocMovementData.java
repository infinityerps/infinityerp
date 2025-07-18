//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

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
class DocMovementData implements FieldProvider {
static Logger log4j = LogManager.getLogger();
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String adOrgtrxId;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String cCostcenterId;
  public String name;
  public String posted;
  public String movementdate;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_orgtrx_id") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("movementdate"))
      return movementdate;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocMovementData[] select(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return select(connectionProvider, client, id, 0, 0);
  }

  public static DocMovementData[] select(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M.AD_CLIENT_ID, M.AD_ORG_ID, M.AD_ORGTRX_ID, M.C_PROJECT_ID, M.C_CAMPAIGN_ID," +
      "        M.C_ACTIVITY_ID, M.USER1_ID, M.USER2_ID, M.C_Costcenter_ID, M.NAME, M.POSTED, M.MOVEMENTDATE" +
      "        FROM M_MOVEMENT M" +
      "        WHERE AD_CLIENT_ID=? " +
      "        AND M_MOVEMENT_ID=?";

    ResultSet result;
    Vector<DocMovementData> vector = new Vector<DocMovementData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DocMovementData objectDocMovementData = new DocMovementData();
        objectDocMovementData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectDocMovementData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectDocMovementData.adOrgtrxId = UtilSql.getValue(result, "ad_orgtrx_id");
        objectDocMovementData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectDocMovementData.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectDocMovementData.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectDocMovementData.user1Id = UtilSql.getValue(result, "user1_id");
        objectDocMovementData.user2Id = UtilSql.getValue(result, "user2_id");
        objectDocMovementData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectDocMovementData.name = UtilSql.getValue(result, "name");
        objectDocMovementData.posted = UtilSql.getValue(result, "posted");
        objectDocMovementData.movementdate = UtilSql.getDateValue(result, "movementdate", "dd-MM-yyyy");
        objectDocMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMovementData);
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
    DocMovementData objectDocMovementData[] = new DocMovementData[vector.size()];
    vector.copyInto(objectDocMovementData);
    return(objectDocMovementData);
  }
}
