
/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2008-2020 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
*/
package org.openbravo.advpaymentmngt;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.payment.FIN_Reconciliation;
/**
 * Entity class for entity APRM_Reconciliation (stored in table APRM_Reconciliation_v).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class APRM_Reconciliation_v extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "APRM_Reconciliation_v";
    public static final String ENTITY_NAME = "APRM_Reconciliation";

    /**
     * Property id stored in column Aprm_Reconciliation_V_ID in table APRM_Reconciliation_v 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property reconciliation stored in column FIN_Reconciliation_ID in table APRM_Reconciliation_v<br>
     * Help: {@literal Reconciliation events related to the financial account}
     * 
     */
    public static final String PROPERTY_RECONCILIATION = "reconciliation";

    /**
     * Property client stored in column AD_Client_ID in table APRM_Reconciliation_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table APRM_Reconciliation_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table APRM_Reconciliation_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table APRM_Reconciliation_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table APRM_Reconciliation_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table APRM_Reconciliation_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table APRM_Reconciliation_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property account stored in column FIN_Financial_Account_ID in table APRM_Reconciliation_v<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property documentNo stored in column DocumentNo in table APRM_Reconciliation_v 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property documentType stored in column C_Doctype_ID in table APRM_Reconciliation_v<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property endingDate stored in column Dateto in table APRM_Reconciliation_v<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property transactionDate stored in column Statementdate in table APRM_Reconciliation_v 
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property endingBalance stored in column Endingbalance in table APRM_Reconciliation_v<br>
     * Help: {@literal The Ending Balance is the result of adjusting the Beginning Balance by any payments or
     *       disbursements.}
     * 
     */
    public static final String PROPERTY_ENDINGBALANCE = "endingBalance";

    /**
     * Property startingBalance stored in column Startingbalance in table APRM_Reconciliation_v<br>
     * Help: {@literal Starting Balance}
     * 
     */
    public static final String PROPERTY_STARTINGBALANCE = "startingBalance";

    /**
     * Property documentStatus stored in column Docstatus in table APRM_Reconciliation_v<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property processNow stored in column Processing in table APRM_Reconciliation_v<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table APRM_Reconciliation_v<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table APRM_Reconciliation_v<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property printDetailed stored in column Printdetailed in table APRM_Reconciliation_v<br>
     * Help: {@literal Print Detailed}
     * 
     */
    public static final String PROPERTY_PRINTDETAILED = "printDetailed";

    /**
     * Property printSummary stored in column Printsummary in table APRM_Reconciliation_v<br>
     * Help: {@literal Print Summary}
     * 
     */
    public static final String PROPERTY_PRINTSUMMARY = "printSummary";

    /**
     * Property processReconciliation stored in column Process_Reconciliation in table APRM_Reconciliation_v<br>
     * Help: {@literal Used to process and reactivate reconciliation documents}
     * 
     */
    public static final String PROPERTY_PROCESSRECONCILIATION = "processReconciliation";

    /**
     * Property itemNo stored in column Item_No in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_ITEMNO = "itemNo";

    /**
     * Property itemAmt stored in column Item_Amt in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_ITEMAMT = "itemAmt";

    /**
     * Property unrecNo stored in column Unrec_No in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_UNRECNO = "unrecNo";

    /**
     * Property unrecAmt stored in column Unrec_Amt in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_UNRECAMT = "unrecAmt";

    /**
     * Property paymentNo stored in column Payment_No in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_PAYMENTNO = "paymentNo";

    /**
     * Property paymentAmt stored in column Payment_Amt in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_PAYMENTAMT = "paymentAmt";

    /**
     * Property depositNo stored in column Deposit_No in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_DEPOSITNO = "depositNo";

    /**
     * Property depositAmt stored in column Deposit_Amt in table APRM_Reconciliation_v
     * 
     */
    public static final String PROPERTY_DEPOSITAMT = "depositAmt";

    /**
     * Property forcedTable stored in column Forced_Table_ID in table APRM_Reconciliation_v<br>
     * Help: {@literal Hidden column to set the source table id in views. It is needed when creating a tab from a
     *       view which will trigger accounting. In that case the original AD_Table_ID is loaded through
     *       Forced_Table_ID.}
     * 
     */
    public static final String PROPERTY_FORCEDTABLE = "forcedTable";


    public APRM_Reconciliation_v() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PRINTDETAILED, false);
        setDefaultValue(PROPERTY_PRINTSUMMARY, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_RECONCILIATION
     * 
     */
    public FIN_Reconciliation getReconciliation() {
        return (FIN_Reconciliation) get(PROPERTY_RECONCILIATION);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_RECONCILIATION
     * 
     */
    public void setReconciliation(FIN_Reconciliation reconciliation) {
        set(PROPERTY_RECONCILIATION, reconciliation);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ENDINGBALANCE
     * 
     */
    public BigDecimal getEndingBalance() {
        return (BigDecimal) get(PROPERTY_ENDINGBALANCE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ENDINGBALANCE
     * 
     */
    public void setEndingBalance(BigDecimal endingBalance) {
        set(PROPERTY_ENDINGBALANCE, endingBalance);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_STARTINGBALANCE
     * 
     */
    public BigDecimal getStartingBalance() {
        return (BigDecimal) get(PROPERTY_STARTINGBALANCE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_STARTINGBALANCE
     * 
     */
    public void setStartingBalance(BigDecimal startingBalance) {
        set(PROPERTY_STARTINGBALANCE, startingBalance);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_PRINTDETAILED
     * 
     */
    public Boolean isPrintDetailed() {
        return (Boolean) get(PROPERTY_PRINTDETAILED);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_PRINTDETAILED
     * 
     */
    public void setPrintDetailed(Boolean printDetailed) {
        set(PROPERTY_PRINTDETAILED, printDetailed);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_PRINTSUMMARY
     * 
     */
    public Boolean isPrintSummary() {
        return (Boolean) get(PROPERTY_PRINTSUMMARY);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_PRINTSUMMARY
     * 
     */
    public void setPrintSummary(Boolean printSummary) {
        set(PROPERTY_PRINTSUMMARY, printSummary);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_PROCESSRECONCILIATION
     * 
     */
    public String getProcessReconciliation() {
        return (String) get(PROPERTY_PROCESSRECONCILIATION);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_PROCESSRECONCILIATION
     * 
     */
    public void setProcessReconciliation(String processReconciliation) {
        set(PROPERTY_PROCESSRECONCILIATION, processReconciliation);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ITEMNO
     * 
     */
    public Long getItemNo() {
        return (Long) get(PROPERTY_ITEMNO);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ITEMNO
     * 
     */
    public void setItemNo(Long itemNo) {
        set(PROPERTY_ITEMNO, itemNo);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_ITEMAMT
     * 
     */
    public BigDecimal getItemAmt() {
        return (BigDecimal) get(PROPERTY_ITEMAMT);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_ITEMAMT
     * 
     */
    public void setItemAmt(BigDecimal itemAmt) {
        set(PROPERTY_ITEMAMT, itemAmt);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_UNRECNO
     * 
     */
    public Long getUnrecNo() {
        return (Long) get(PROPERTY_UNRECNO);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_UNRECNO
     * 
     */
    public void setUnrecNo(Long unrecNo) {
        set(PROPERTY_UNRECNO, unrecNo);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_UNRECAMT
     * 
     */
    public BigDecimal getUnrecAmt() {
        return (BigDecimal) get(PROPERTY_UNRECAMT);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_UNRECAMT
     * 
     */
    public void setUnrecAmt(BigDecimal unrecAmt) {
        set(PROPERTY_UNRECAMT, unrecAmt);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_PAYMENTNO
     * 
     */
    public Long getPaymentNo() {
        return (Long) get(PROPERTY_PAYMENTNO);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_PAYMENTNO
     * 
     */
    public void setPaymentNo(Long paymentNo) {
        set(PROPERTY_PAYMENTNO, paymentNo);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_PAYMENTAMT
     * 
     */
    public BigDecimal getPaymentAmt() {
        return (BigDecimal) get(PROPERTY_PAYMENTAMT);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_PAYMENTAMT
     * 
     */
    public void setPaymentAmt(BigDecimal paymentAmt) {
        set(PROPERTY_PAYMENTAMT, paymentAmt);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_DEPOSITNO
     * 
     */
    public Long getDepositNo() {
        return (Long) get(PROPERTY_DEPOSITNO);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_DEPOSITNO
     * 
     */
    public void setDepositNo(Long depositNo) {
        set(PROPERTY_DEPOSITNO, depositNo);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_DEPOSITAMT
     * 
     */
    public BigDecimal getDepositAmt() {
        return (BigDecimal) get(PROPERTY_DEPOSITAMT);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_DEPOSITAMT
     * 
     */
    public void setDepositAmt(BigDecimal depositAmt) {
        set(PROPERTY_DEPOSITAMT, depositAmt);
    }

    /**
     * @see APRM_Reconciliation_v#PROPERTY_FORCEDTABLE
     * 
     */
    public Table getForcedTable() {
        return (Table) get(PROPERTY_FORCEDTABLE);
    }
    /**
     * @see APRM_Reconciliation_v#PROPERTY_FORCEDTABLE
     * 
     */
    public void setForcedTable(Table forcedTable) {
        set(PROPERTY_FORCEDTABLE, forcedTable);
    }

}
