
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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.financialmgmt.payment.FIN_FinaccTransaction;
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
import org.openbravo.model.financialmgmt.payment.FIN_Reconciliation;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity APRM_Finacc_Transaction_v (stored in table APRM_Finacc_Transaction_v).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class APRM_FinaccTransactionV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "APRM_Finacc_Transaction_v";
    public static final String ENTITY_NAME = "APRM_Finacc_Transaction_v";

    /**
     * Property id stored in column Aprm_Finacc_Transaction_V_ID in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property financialAccountTransaction stored in column FIN_Finacc_Transaction_ID in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNTTRANSACTION = "financialAccountTransaction";

    /**
     * Property client stored in column AD_Client_ID in table APRM_Finacc_Transaction_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table APRM_Finacc_Transaction_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table APRM_Finacc_Transaction_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table APRM_Finacc_Transaction_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table APRM_Finacc_Transaction_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table APRM_Finacc_Transaction_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table APRM_Finacc_Transaction_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property financialAccount stored in column FIN_Financial_Account_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNT = "financialAccount";

    /**
     * Property lineNo stored in column Line in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property transactionDate stored in column Statementdate in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The Statement Date field defines the date of the statement being processed.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property transactionType stored in column Trxtype in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The Transaction Type indicates the type of transaction to be submitted to the Credit Card
     *       Company.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONTYPE = "transactionType";

    /**
     * Property payment stored in column FIN_Payment_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property gLItem stored in column C_Glitem_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property depositAmount stored in column Depositamt in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_DEPOSITAMOUNT = "depositAmount";

    /**
     * Property withdrawalAmount stored in column Paymentamt in table APRM_Finacc_Transaction_v 
     * 
     */
    public static final String PROPERTY_WITHDRAWALAMOUNT = "withdrawalAmount";

    /**
     * Property currency stored in column C_Currency_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property reconciliation stored in column FIN_Reconciliation_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Reconciliation events related to the financial account}
     * 
     */
    public static final String PROPERTY_RECONCILIATION = "reconciliation";

    /**
     * Property status stored in column Status in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property createdByAlgorithm stored in column Createdbyalgorithm in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal This column reflects whether the document was created by the matching algorithm or not.}
     * 
     */
    public static final String PROPERTY_CREATEDBYALGORITHM = "createdByAlgorithm";

    /**
     * Property posted stored in column Posted in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property accountingDate stored in column DateAcct in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property processed stored in column Processed in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property processNow stored in column Processing in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property stDimension stored in column User1_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property activity stored in column C_Activity_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property foreignCurrency stored in column Foreign_Currency_ID in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCY = "foreignCurrency";

    /**
     * Property foreignAmount stored in column Foreign_Amount in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_FOREIGNAMOUNT = "foreignAmount";

    /**
     * Property foreignConvertRate stored in column Foreign_Convert_Rate in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_FOREIGNCONVERTRATE = "foreignConvertRate";

    /**
     * Property cleared stored in column Cleared in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_CLEARED = "cleared";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property product stored in column M_Product_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property salesRegion stored in column C_Salesregion_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property paymentDocNo stored in column PaymentDocNo in table APRM_Finacc_Transaction_v
     * 
     */
    public static final String PROPERTY_PAYMENTDOCNO = "paymentDocNo";

    /**
     * Property reconciled stored in column Reconciled in table APRM_Finacc_Transaction_v
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_RECONCILED = "reconciled";

    /**
     * Property forcedTable stored in column Forced_Table_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Hidden column to set the source table id in views. It is needed when creating a tab from a
     *       view which will trigger accounting. In that case the original AD_Table_ID is loaded through
     *       Forced_Table_ID.}
     * 
     */
    public static final String PROPERTY_FORCEDTABLE = "forcedTable";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table APRM_Finacc_Transaction_v<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";


    public APRM_FinaccTransactionV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATEDBYALGORITHM, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_CLEARED, false);
        setDefaultValue(PROPERTY_RECONCILED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public FIN_FinaccTransaction getFinancialAccountTransaction() {
        return (FIN_FinaccTransaction) get(PROPERTY_FINANCIALACCOUNTTRANSACTION);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public void setFinancialAccountTransaction(FIN_FinaccTransaction financialAccountTransaction) {
        set(PROPERTY_FINANCIALACCOUNTTRANSACTION, financialAccountTransaction);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public FIN_FinancialAccount getFinancialAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_FINANCIALACCOUNT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public void setFinancialAccount(FIN_FinancialAccount financialAccount) {
        set(PROPERTY_FINANCIALACCOUNT, financialAccount);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public String getTransactionType() {
        return (String) get(PROPERTY_TRANSACTIONTYPE);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public void setTransactionType(String transactionType) {
        set(PROPERTY_TRANSACTIONTYPE, transactionType);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_DEPOSITAMOUNT
     * 
     */
    public BigDecimal getDepositAmount() {
        return (BigDecimal) get(PROPERTY_DEPOSITAMOUNT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_DEPOSITAMOUNT
     * 
     */
    public void setDepositAmount(BigDecimal depositAmount) {
        set(PROPERTY_DEPOSITAMOUNT, depositAmount);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_WITHDRAWALAMOUNT
     * 
     */
    public BigDecimal getWithdrawalAmount() {
        return (BigDecimal) get(PROPERTY_WITHDRAWALAMOUNT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_WITHDRAWALAMOUNT
     * 
     */
    public void setWithdrawalAmount(BigDecimal withdrawalAmount) {
        set(PROPERTY_WITHDRAWALAMOUNT, withdrawalAmount);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_RECONCILIATION
     * 
     */
    public FIN_Reconciliation getReconciliation() {
        return (FIN_Reconciliation) get(PROPERTY_RECONCILIATION);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_RECONCILIATION
     * 
     */
    public void setReconciliation(FIN_Reconciliation reconciliation) {
        set(PROPERTY_RECONCILIATION, reconciliation);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CREATEDBYALGORITHM
     * 
     */
    public Boolean isCreatedByAlgorithm() {
        return (Boolean) get(PROPERTY_CREATEDBYALGORITHM);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CREATEDBYALGORITHM
     * 
     */
    public void setCreatedByAlgorithm(Boolean createdByAlgorithm) {
        set(PROPERTY_CREATEDBYALGORITHM, createdByAlgorithm);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FOREIGNCURRENCY
     * 
     */
    public Currency getForeignCurrency() {
        return (Currency) get(PROPERTY_FOREIGNCURRENCY);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FOREIGNCURRENCY
     * 
     */
    public void setForeignCurrency(Currency foreignCurrency) {
        set(PROPERTY_FOREIGNCURRENCY, foreignCurrency);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FOREIGNAMOUNT
     * 
     */
    public BigDecimal getForeignAmount() {
        return (BigDecimal) get(PROPERTY_FOREIGNAMOUNT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FOREIGNAMOUNT
     * 
     */
    public void setForeignAmount(BigDecimal foreignAmount) {
        set(PROPERTY_FOREIGNAMOUNT, foreignAmount);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FOREIGNCONVERTRATE
     * 
     */
    public BigDecimal getForeignConvertRate() {
        return (BigDecimal) get(PROPERTY_FOREIGNCONVERTRATE);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FOREIGNCONVERTRATE
     * 
     */
    public void setForeignConvertRate(BigDecimal foreignConvertRate) {
        set(PROPERTY_FOREIGNCONVERTRATE, foreignConvertRate);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CLEARED
     * 
     */
    public Boolean isCleared() {
        return (Boolean) get(PROPERTY_CLEARED);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_CLEARED
     * 
     */
    public void setCleared(Boolean cleared) {
        set(PROPERTY_CLEARED, cleared);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PAYMENTDOCNO
     * 
     */
    public String getPaymentDocNo() {
        return (String) get(PROPERTY_PAYMENTDOCNO);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_PAYMENTDOCNO
     * 
     */
    public void setPaymentDocNo(String paymentDocNo) {
        set(PROPERTY_PAYMENTDOCNO, paymentDocNo);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_RECONCILED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isReconciled() {
        return (Boolean) get(PROPERTY_RECONCILED);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_RECONCILED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setReconciled(Boolean reconciled) {
        set(PROPERTY_RECONCILED, reconciled);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FORCEDTABLE
     * 
     */
    public Table getForcedTable() {
        return (Table) get(PROPERTY_FORCEDTABLE);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_FORCEDTABLE
     * 
     */
    public void setForcedTable(Table forcedTable) {
        set(PROPERTY_FORCEDTABLE, forcedTable);
    }

    /**
     * @see APRM_FinaccTransactionV#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see APRM_FinaccTransactionV#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

}
