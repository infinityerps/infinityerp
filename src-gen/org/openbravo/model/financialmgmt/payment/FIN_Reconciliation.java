
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
package org.openbravo.model.financialmgmt.payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.advpaymentmngt.APRM_FinaccTransactionV;
import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FIN_Reconciliation (stored in table FIN_Reconciliation).
 * <br>
 * Help: {@literal Reconciliation event of the financial account}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_Reconciliation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Reconciliation";
    public static final String ENTITY_NAME = "FIN_Reconciliation";

    /**
     * Property id stored in column FIN_Reconciliation_ID in table FIN_Reconciliation<br>
     * Help: {@literal Reconciliation events related to the financial account}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Reconciliation 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Reconciliation 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Reconciliation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Reconciliation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Reconciliation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Reconciliation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Reconciliation 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property account stored in column FIN_Financial_Account_ID in table FIN_Reconciliation<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property documentNo stored in column DocumentNo in table FIN_Reconciliation 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property documentType stored in column C_Doctype_ID in table FIN_Reconciliation<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property endingDate stored in column Dateto in table FIN_Reconciliation<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property transactionDate stored in column Statementdate in table FIN_Reconciliation 
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property endingBalance stored in column Endingbalance in table FIN_Reconciliation<br>
     * Help: {@literal The Ending Balance is the result of adjusting the Beginning Balance by any payments or
     *       disbursements.}
     * 
     */
    public static final String PROPERTY_ENDINGBALANCE = "endingBalance";

    /**
     * Property startingbalance stored in column Startingbalance in table FIN_Reconciliation<br>
     * Help: {@literal Starting Balance}
     * 
     */
    public static final String PROPERTY_STARTINGBALANCE = "startingbalance";

    /**
     * Property documentStatus stored in column Docstatus in table FIN_Reconciliation<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property processNow stored in column Processing in table FIN_Reconciliation<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table FIN_Reconciliation<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table FIN_Reconciliation<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property printdetailed stored in column Printdetailed in table FIN_Reconciliation<br>
     * Help: {@literal Print Detailed}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_PRINTDETAILED = "printdetailed";

    /**
     * Property printsummary stored in column Printsummary in table FIN_Reconciliation<br>
     * Help: {@literal Print Summary}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_PRINTSUMMARY = "printsummary";

    /**
     * Property aPRMProcessReconciliation stored in column EM_APRM_Process_Reconciliation in table FIN_Reconciliation<br>
     * Help: {@literal Used to process and reactivate reconciliation documents}
     * 
     */
    public static final String PROPERTY_APRMPROCESSRECONCILIATION = "aPRMProcessReconciliation";

    /**
     * Property aPRMPrintDetailed stored in column EM_APRM_PrintDetailed in table FIN_Reconciliation<br>
     * Help: {@literal Print Detailed reconciliation report}
     * 
     */
    public static final String PROPERTY_APRMPRINTDETAILED = "aPRMPrintDetailed";

    /**
     * Property aPRMPrintSummary stored in column EM_APRM_PrintSummary in table FIN_Reconciliation<br>
     * Help: {@literal Print Summary reconciliation report}
     * 
     */
    public static final String PROPERTY_APRMPRINTSUMMARY = "aPRMPrintSummary";

    /**
     * Property aprmProcessRec stored in column EM_Aprm_Process_Rec in table FIN_Reconciliation<br>
     * Help: {@literal Used to process and reactivate reconciliation documents}
     * 
     */
    public static final String PROPERTY_APRMPROCESSREC = "aprmProcessRec";

    /**
     * Property aPRMProcessReconciliationForce stored in column EM_APRM_Process_Rec_Force in table FIN_Reconciliation
     * 
     */
    public static final String PROPERTY_APRMPROCESSRECONCILIATIONFORCE = "aPRMProcessReconciliationForce";









    /**
     * Property _computedColumns stored in column _computedColumns in table FIN_Reconciliation
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property aPRMFinaccTransactionVList stored in table FIN_Reconciliation
     * 
     */
    public static final String PROPERTY_APRMFINACCTRANSACTIONVLIST = "aPRMFinaccTransactionVList";

    /**
     * Property fINFinaccTransactionList stored in table FIN_Reconciliation
     * 
     */
    public static final String PROPERTY_FINFINACCTRANSACTIONLIST = "fINFinaccTransactionList";

    /**
     * Property fINReconciliationLineVList stored in table FIN_Reconciliation
     * 
     */
    public static final String PROPERTY_FINRECONCILIATIONLINEVLIST = "fINReconciliationLineVList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property aPRMOutstandingDepositItemsAmount<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT COALESCE(sum(t.depositamt), 0) FROM fin_finacc_transaction t,  fin_reconciliation rec WHERE
       (t.fin_reconciliation_id IS NULL OR (EXISTS ( SELECT 1 FROM fin_reconciliation r WHERE r.dateto >
       rec.dateto AND t.fin_reconciliation_id  = r.fin_reconciliation_id ))) AND t.statementdate <=
       rec.dateto AND t.depositamt <> 0 AND t.fin_financial_account_id  = rec.fin_financial_account_id AND
       rec.fin_reconciliation_id = fin_reconciliation_id)}
     */
    public static final String COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITITEMSAMOUNT = "aPRMOutstandingDepositItemsAmount";

    /**
     * Computed column for property aPRMOutstandingDepositsItemNo<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT count(*) FROM fin_finacc_transaction t,  fin_reconciliation rec WHERE
       (t.fin_reconciliation_id IS NULL OR (EXISTS ( SELECT 1 FROM fin_reconciliation r WHERE r.dateto >
       rec.dateto AND t.fin_reconciliation_id  = r.fin_reconciliation_id ))) AND t.statementdate <=
       rec.dateto AND t.depositamt <> 0 AND t.fin_financial_account_id  = rec.fin_financial_account_id AND
       rec.fin_reconciliation_id = fin_reconciliation_id) }
     */
    public static final String COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITSITEMNO = "aPRMOutstandingDepositsItemNo";

    /**
     * Computed column for property aPRMOutstandingPaymentsItemNo<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT count(*) FROM fin_finacc_transaction t,  fin_reconciliation rec WHERE
       (t.fin_reconciliation_id IS NULL OR (EXISTS ( SELECT 1 FROM fin_reconciliation r WHERE r.dateto >
       rec.dateto AND t.fin_reconciliation_id  = r.fin_reconciliation_id ))) AND t.statementdate <=
       rec.dateto AND t.paymentamt <> 0 AND t.fin_financial_account_id  = rec.fin_financial_account_id AND
       rec.fin_reconciliation_id = fin_reconciliation_id) }
     */
    public static final String COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMNO = "aPRMOutstandingPaymentsItemNo";

    /**
     * Computed column for property aPRMOutstandingPaymentsItemsAmount<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT COALESCE(sum(t.paymentamt), 0) FROM fin_finacc_transaction t,  fin_reconciliation rec WHERE
       (t.fin_reconciliation_id IS NULL OR (EXISTS ( SELECT 1 FROM fin_reconciliation r WHERE r.dateto >
       rec.dateto AND t.fin_reconciliation_id  = r.fin_reconciliation_id ))) AND t.statementdate <=
       rec.dateto AND t.paymentamt <> 0 AND t.fin_financial_account_id  = rec.fin_financial_account_id AND
       rec.fin_reconciliation_id = fin_reconciliation_id)}
     */
    public static final String COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMSAMOUNT = "aPRMOutstandingPaymentsItemsAmount";

    /**
     * Computed column for property aPRMReconciledItemAmount<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT COALESCE(sum(fin_finacc_transaction.depositamt - fin_finacc_transaction.paymentamt), 0) FROM
       fin_finacc_transaction WHERE fin_finacc_transaction.fin_reconciliation_id = fin_reconciliation_id)}
     */
    public static final String COMPUTED_COLUMN_APRMRECONCILEDITEMAMOUNT = "aPRMReconciledItemAmount";

    /**
     * Computed column for property aPRMReconciledItemNo<br>
     * <br>
     * Computed from: <br>
     * {@code ( SELECT count(*) FROM fin_finacc_transaction WHERE fin_finacc_transaction.fin_reconciliation_id =
       fin_reconciliation_id)}
     */
    public static final String COMPUTED_COLUMN_APRMRECONCILEDITEMNO = "aPRMReconciledItemNo";

    /**
     * Computed column for property aPRMUnReconciledItemAmount<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT COALESCE(sum(bl.cramount - bl.dramount), 0) FROM fin_bankstatementline bl, fin_bankstatement
       b, fin_reconciliation r WHERE (bl.fin_finacc_transaction_id IS NULL OR (EXISTS ( SELECT 1 FROM
       fin_finacc_transaction t, fin_reconciliation rec WHERE t.fin_reconciliation_id  =
       rec.fin_reconciliation_id AND bl.fin_finacc_transaction_id  = t.fin_finacc_transaction_id  AND
       t.fin_financial_account_id  = b.fin_financial_account_id  AND rec.created > r.created))) AND
       bl.datetrx <= r.dateto AND b.fin_bankstatement_id  = bl.fin_bankstatement_id AND
       b.fin_financial_account_id  = r.fin_financial_account_id and r.fin_reconciliation_id =
       fin_reconciliation_id)}
     */
    public static final String COMPUTED_COLUMN_APRMUNRECONCILEDITEMAMOUNT = "aPRMUnReconciledItemAmount";

    /**
     * Computed column for property aPRMUnReconciledItemNo<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT count(*) FROM fin_bankstatementline bl, fin_bankstatement b, fin_reconciliation r WHERE
       (bl.fin_finacc_transaction_id IS NULL OR (EXISTS ( SELECT 1 FROM fin_finacc_transaction t,
       fin_reconciliation rec WHERE t.fin_reconciliation_id  = rec.fin_reconciliation_id AND
       bl.fin_finacc_transaction_id  = t.fin_finacc_transaction_id  AND t.fin_financial_account_id  =
       b.fin_financial_account_id  AND rec.created > r.created))) AND bl.datetrx <= r.dateto AND
       b.fin_bankstatement_id  = bl.fin_bankstatement_id AND b.fin_financial_account_id  =
       r.fin_financial_account_id and r.fin_reconciliation_id = fin_reconciliation_id)}
     */
    public static final String COMPUTED_COLUMN_APRMUNRECONCILEDITEMNO = "aPRMUnReconciledItemNo";

    public FIN_Reconciliation() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ENDINGBALANCE, new BigDecimal(0));
        setDefaultValue(PROPERTY_STARTINGBALANCE, new BigDecimal(0));
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_PRINTDETAILED, false);
        setDefaultValue(PROPERTY_PRINTSUMMARY, false);
        setDefaultValue(PROPERTY_APRMPROCESSRECONCILIATION, "P");
        setDefaultValue(PROPERTY_APRMPRINTDETAILED, false);
        setDefaultValue(PROPERTY_APRMPRINTSUMMARY, false);
        setDefaultValue(PROPERTY_APRMPROCESSREC, "P");
        setDefaultValue(PROPERTY_APRMPROCESSRECONCILIATIONFORCE, "P");
        setDefaultValue(PROPERTY_APRMFINACCTRANSACTIONVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINFINACCTRANSACTIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINRECONCILIATIONLINEVLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_ENDINGBALANCE
     * 
     */
    public BigDecimal getEndingBalance() {
        return (BigDecimal) get(PROPERTY_ENDINGBALANCE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_ENDINGBALANCE
     * 
     */
    public void setEndingBalance(BigDecimal endingBalance) {
        set(PROPERTY_ENDINGBALANCE, endingBalance);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_STARTINGBALANCE
     * 
     */
    public BigDecimal getStartingbalance() {
        return (BigDecimal) get(PROPERTY_STARTINGBALANCE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_STARTINGBALANCE
     * 
     */
    public void setStartingbalance(BigDecimal startingbalance) {
        set(PROPERTY_STARTINGBALANCE, startingbalance);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_PRINTDETAILED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isPrintdetailed() {
        return (Boolean) get(PROPERTY_PRINTDETAILED);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_PRINTDETAILED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setPrintdetailed(Boolean printdetailed) {
        set(PROPERTY_PRINTDETAILED, printdetailed);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_PRINTSUMMARY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isPrintsummary() {
        return (Boolean) get(PROPERTY_PRINTSUMMARY);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_PRINTSUMMARY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setPrintsummary(Boolean printsummary) {
        set(PROPERTY_PRINTSUMMARY, printsummary);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPROCESSRECONCILIATION
     * 
     */
    public String getAPRMProcessReconciliation() {
        return (String) get(PROPERTY_APRMPROCESSRECONCILIATION);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPROCESSRECONCILIATION
     * 
     */
    public void setAPRMProcessReconciliation(String aPRMProcessReconciliation) {
        set(PROPERTY_APRMPROCESSRECONCILIATION, aPRMProcessReconciliation);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPRINTDETAILED
     * 
     */
    public Boolean isAPRMPrintDetailed() {
        return (Boolean) get(PROPERTY_APRMPRINTDETAILED);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPRINTDETAILED
     * 
     */
    public void setAPRMPrintDetailed(Boolean aPRMPrintDetailed) {
        set(PROPERTY_APRMPRINTDETAILED, aPRMPrintDetailed);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPRINTSUMMARY
     * 
     */
    public Boolean isAPRMPrintSummary() {
        return (Boolean) get(PROPERTY_APRMPRINTSUMMARY);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPRINTSUMMARY
     * 
     */
    public void setAPRMPrintSummary(Boolean aPRMPrintSummary) {
        set(PROPERTY_APRMPRINTSUMMARY, aPRMPrintSummary);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPROCESSREC
     * 
     */
    public String getAprmProcessRec() {
        return (String) get(PROPERTY_APRMPROCESSREC);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPROCESSREC
     * 
     */
    public void setAprmProcessRec(String aprmProcessRec) {
        set(PROPERTY_APRMPROCESSREC, aprmProcessRec);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPROCESSRECONCILIATIONFORCE
     * 
     */
    public String getAPRMProcessReconciliationForce() {
        return (String) get(PROPERTY_APRMPROCESSRECONCILIATIONFORCE);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY_APRMPROCESSRECONCILIATIONFORCE
     * 
     */
    public void setAPRMProcessReconciliationForce(String aPRMProcessReconciliationForce) {
        set(PROPERTY_APRMPROCESSRECONCILIATIONFORCE, aPRMProcessReconciliationForce);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITITEMSAMOUNT
     * 
     */
    public BigDecimal getAPRMOutstandingDepositItemsAmount() {
        return (BigDecimal) get(COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITITEMSAMOUNT);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITITEMSAMOUNT
     * 
     */
    public void setAPRMOutstandingDepositItemsAmount(BigDecimal aPRMOutstandingDepositItemsAmount) {
        set(COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITITEMSAMOUNT, aPRMOutstandingDepositItemsAmount);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITSITEMNO
     * 
     */
    public Long getAPRMOutstandingDepositsItemNo() {
        return (Long) get(COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITSITEMNO);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITSITEMNO
     * 
     */
    public void setAPRMOutstandingDepositsItemNo(Long aPRMOutstandingDepositsItemNo) {
        set(COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITSITEMNO, aPRMOutstandingDepositsItemNo);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMNO
     * 
     */
    public Long getAPRMOutstandingPaymentsItemNo() {
        return (Long) get(COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMNO);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMNO
     * 
     */
    public void setAPRMOutstandingPaymentsItemNo(Long aPRMOutstandingPaymentsItemNo) {
        set(COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMNO, aPRMOutstandingPaymentsItemNo);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMSAMOUNT
     * 
     */
    public BigDecimal getAPRMOutstandingPaymentsItemsAmount() {
        return (BigDecimal) get(COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMSAMOUNT);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMSAMOUNT
     * 
     */
    public void setAPRMOutstandingPaymentsItemsAmount(BigDecimal aPRMOutstandingPaymentsItemsAmount) {
        set(COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMSAMOUNT, aPRMOutstandingPaymentsItemsAmount);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMRECONCILEDITEMAMOUNT
     * 
     */
    public BigDecimal getAPRMReconciledItemAmount() {
        return (BigDecimal) get(COMPUTED_COLUMN_APRMRECONCILEDITEMAMOUNT);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMRECONCILEDITEMAMOUNT
     * 
     */
    public void setAPRMReconciledItemAmount(BigDecimal aPRMReconciledItemAmount) {
        set(COMPUTED_COLUMN_APRMRECONCILEDITEMAMOUNT, aPRMReconciledItemAmount);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMRECONCILEDITEMNO
     * 
     */
    public Long getAPRMReconciledItemNo() {
        return (Long) get(COMPUTED_COLUMN_APRMRECONCILEDITEMNO);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMRECONCILEDITEMNO
     * 
     */
    public void setAPRMReconciledItemNo(Long aPRMReconciledItemNo) {
        set(COMPUTED_COLUMN_APRMRECONCILEDITEMNO, aPRMReconciledItemNo);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMUNRECONCILEDITEMAMOUNT
     * 
     */
    public BigDecimal getAPRMUnReconciledItemAmount() {
        return (BigDecimal) get(COMPUTED_COLUMN_APRMUNRECONCILEDITEMAMOUNT);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMUNRECONCILEDITEMAMOUNT
     * 
     */
    public void setAPRMUnReconciledItemAmount(BigDecimal aPRMUnReconciledItemAmount) {
        set(COMPUTED_COLUMN_APRMUNRECONCILEDITEMAMOUNT, aPRMUnReconciledItemAmount);
    }

    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMUNRECONCILEDITEMNO
     * 
     */
    public Long getAPRMUnReconciledItemNo() {
        return (Long) get(COMPUTED_COLUMN_APRMUNRECONCILEDITEMNO);
    }
    /**
     * @see FIN_Reconciliation#COMPUTED_COLUMN_APRMUNRECONCILEDITEMNO
     * 
     */
    public void setAPRMUnReconciledItemNo(Long aPRMUnReconciledItemNo) {
        set(COMPUTED_COLUMN_APRMUNRECONCILEDITEMNO, aPRMUnReconciledItemNo);
    }

    /**
     * @see FIN_Reconciliation#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public FIN_Reconciliation_ComputedColumns get_computedColumns() {
        return (FIN_Reconciliation_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see FIN_Reconciliation#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(FIN_Reconciliation_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * @see APRM_FinaccTransactionV
     * 
     */
    @SuppressWarnings("unchecked")
    public List<APRM_FinaccTransactionV> getAPRMFinaccTransactionVList() {
      return (List<APRM_FinaccTransactionV>) get(PROPERTY_APRMFINACCTRANSACTIONVLIST);
    }

    /**
     * @see APRM_FinaccTransactionV
     * 
     */
    public void setAPRMFinaccTransactionVList(List<APRM_FinaccTransactionV> aPRMFinaccTransactionVList) {
        set(PROPERTY_APRMFINACCTRANSACTIONVLIST, aPRMFinaccTransactionVList);
    }

    /**
     * @see FIN_FinaccTransaction
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_FinaccTransaction> getFINFinaccTransactionList() {
      return (List<FIN_FinaccTransaction>) get(PROPERTY_FINFINACCTRANSACTIONLIST);
    }

    /**
     * @see FIN_FinaccTransaction
     * 
     */
    public void setFINFinaccTransactionList(List<FIN_FinaccTransaction> fINFinaccTransactionList) {
        set(PROPERTY_FINFINACCTRANSACTIONLIST, fINFinaccTransactionList);
    }

    /**
     * @see FIN_ReconciliationLine_v
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_ReconciliationLine_v> getFINReconciliationLineVList() {
      return (List<FIN_ReconciliationLine_v>) get(PROPERTY_FINRECONCILIATIONLINEVLIST);
    }

    /**
     * @see FIN_ReconciliationLine_v
     * 
     */
    public void setFINReconciliationLineVList(List<FIN_ReconciliationLine_v> fINReconciliationLineVList) {
        set(PROPERTY_FINRECONCILIATIONLINEVLIST, fINReconciliationLineVList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITITEMSAMOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMOutstandingDepositItemsAmount();
      }
      if (COMPUTED_COLUMN_APRMOUTSTANDINGDEPOSITSITEMNO.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMOutstandingDepositsItemNo();
      }
      if (COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMNO.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMOutstandingPaymentsItemNo();
      }
      if (COMPUTED_COLUMN_APRMOUTSTANDINGPAYMENTSITEMSAMOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMOutstandingPaymentsItemsAmount();
      }
      if (COMPUTED_COLUMN_APRMRECONCILEDITEMAMOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMReconciledItemAmount();
      }
      if (COMPUTED_COLUMN_APRMRECONCILEDITEMNO.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMReconciledItemNo();
      }
      if (COMPUTED_COLUMN_APRMUNRECONCILEDITEMAMOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMUnReconciledItemAmount();
      }
      if (COMPUTED_COLUMN_APRMUNRECONCILEDITEMNO.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMUnReconciledItemNo();
      }

      return super.get(propName);
    }
}
