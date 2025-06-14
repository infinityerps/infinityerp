//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

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
class CreateFromInvoiceData implements FieldProvider {
static Logger log4j = LogManager.getLogger();
  private String InitRecordNumber="0";
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CreateFromInvoiceData[] selectFromPOCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId)    throws ServletException {
    return selectFromPOCombo(connectionProvider, language, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, currencyId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?)) AS NAME " +
      "        FROM C_ORDER o JOIN m_pricelist pl ON o.m_pricelist_id = pl.m_pricelist_id" +
      "        WHERE o.IsSOTrx='N' " +
      "        AND o.DocStatus IN ('CL','CO') " +
      "        AND o.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND o.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "        AND o.C_BPartner_ID = ?" +
      "        AND pl.istaxincluded = ?" +
      "        AND o.c_currency_id = ?" +
      "        AND o.InvoiceRule <> 'N'" +
      "        AND EXISTS (SELECT 1 " +
      "                     FROM C_ORDERLINE l left join M_MATCHPO m on  l.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                              and m.C_InvoiceLine_ID IS NOT NULL  " +
      "                    WHERE l.C_ORDER_ID = o.C_ORDER_ID  " +
      "                    GROUP BY l.QtyOrdered,l.C_OrderLine_ID " +
      "                    HAVING (l.QtyOrdered-SUM(COALESCE(m.Qty,0))) <> 0)" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<CreateFromInvoiceData> vector = new Vector<CreateFromInvoiceData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOSOTrxCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId)    throws ServletException {
    return selectFromPOSOTrxCombo(connectionProvider, language, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, currencyId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOSOTrxCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?)) AS NAME " +
      "        FROM C_INVOICE_CANDIDATE_V ic," +
      "             C_ORDER o JOIN m_pricelist pl ON o.m_pricelist_id = pl.m_pricelist_id" +
      "        WHERE o.C_ORDER_ID = ic.C_ORDER_ID " +
      "        AND ic.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ic.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND ic.C_BPartner_ID = ?" +
      "        AND pl.istaxincluded = ? " +
      "        AND o.c_currency_id = ?" +
      "        AND o.C_Order_Id = ic.C_Order_Id" +
      "        AND ((ic.term IN ('D', 'S') AND ic.qtydelivered <> 0) OR (ic.term = 'I' AND exists (SELECT 1 FROM C_ORDERLINE ol WHERE ol.C_ORDER_ID = o.C_ORDER_ID group by ol.c_orderline_id having SUM(ol.QTYORDERED) - SUM(ol.QTYINVOICED) <> 0)) OR (ic.term = 'O' AND (ic.qtyordered = ic.qtydelivered)))" +
      "        GROUP BY o.C_ORDER_ID, o.DocumentNo, o.DateOrdered, o.GrandTotal " +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<CreateFromInvoiceData> vector = new Vector<CreateFromInvoiceData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId)    throws ServletException {
    return selectFromShipmentCombo(connectionProvider, adLanguage, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, currencyId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME " +
      "        FROM M_INOUT s " +
      "        WHERE s.IsSOTrx='N' " +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.ISLOGISTIC <> 'Y'" +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND s.C_BPartner_ID = ? " +
      "        AND EXISTS (SELECT 1 " +
      "                     FROM M_INOUTLINE l" +
      "                           left join M_MATCHINV mi on l.M_InOutLine_ID=mi.M_InOutLine_ID" +
      "                           left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "                           left join c_order o on ol.c_order_id = o.c_order_id AND o.InvoiceRule <> 'N'" +
      "                           left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id" +
      "                      WHERE l.M_INOUT_ID = s.M_INOUT_ID " +
      "                        AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "                        AND (l.c_orderline_id is null OR o.c_currency_id = ?)" +
      "                      GROUP BY l.MovementQty, l.M_InOutLine_ID " +
      "                      HAVING  (l.MovementQty-SUM(COALESCE(mi.Qty,0))) <> 0)" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<CreateFromInvoiceData> vector = new Vector<CreateFromInvoiceData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentSOTrxCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId)    throws ServletException {
    return selectFromShipmentSOTrxCombo(connectionProvider, adLanguage, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, currencyId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentSOTrxCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, String currencyId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME " +
      "        FROM M_INOUT s " +
      "        WHERE s.IsSOTrx='Y' " +
      "        AND s.ISLOGISTIC <> 'Y'" +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "        AND s.C_BPartner_ID = ?  " +
      "        AND s.IsCompletelyInvoiced = 'N'" +
      "        AND EXISTS (SELECT 1 FROM M_INOUTLINE l " +
      "                           left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "                           left join c_order o on ol.c_order_id = o.c_order_id" +
      "                           left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id" +
      "                           left join c_invoiceline il on l.m_inoutline_id = il.m_inoutline_id" +
      "                           left join c_invoice i on il.c_invoice_id = i.c_invoice_id" +
      "                    WHERE l.M_INOUT_ID = s.M_INOUT_ID" +
      "                    AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "                    AND (l.c_orderline_id is null OR o.c_currency_id = ?)" +
      "                    GROUP BY l.m_inoutline_id, l.movementqty" +
      "                    HAVING ( l.movementqty >= 0 AND l.movementqty > Sum(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)) )" +
      "                      OR ( l.movementqty < 0 AND l.movementqty < Sum(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)) )" +
      "                    )" +
      "        AND NOT EXISTS (SELECT 1" +
      "        FROM C_ORDER o" +
      "        WHERE o.C_ORDER_ID = s.C_ORDER_ID" +
      "        AND ((o.INVOICERULE = 'O' AND o.isdelivered = 'N') OR o.invoicerule = 'N'))" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<CreateFromInvoiceData> vector = new Vector<CreateFromInvoiceData>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }
}
