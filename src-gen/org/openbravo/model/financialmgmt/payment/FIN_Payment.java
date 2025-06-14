
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

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.ConversionRateDoc;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.InvoiceTaxCashVAT_V;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.gl.GLJournalLine;
import org.openbravo.model.financialmgmt.tax.TaxPayment;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FIN_Payment (stored in table FIN_Payment).
 * <br>
 * Help: {@literal Payment events}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_Payment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment";
    public static final String ENTITY_NAME = "FIN_Payment";

    /**
     * Property id stored in column Fin_Payment_ID in table FIN_Payment<br>
     * Help: {@literal Payment In event}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Payment 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property receipt stored in column Isreceipt in table FIN_Payment<br>
     * Help: {@literal Indicated a sales transaction (Accounts Receivable if Receipt=Y) or a purchase transaction
     *       (Accounts Payable if Receipt=N).}
     * 
     */
    public static final String PROPERTY_RECEIPT = "receipt";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Payment<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property paymentDate stored in column Paymentdate in table FIN_Payment 
     * 
     */
    public static final String PROPERTY_PAYMENTDATE = "paymentDate";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Payment<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property amount stored in column Amount in table FIN_Payment 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Payment<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property paymentMethod stored in column Fin_Paymentmethod_ID in table FIN_Payment
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property documentNo stored in column DocumentNo in table FIN_Payment 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property referenceNo stored in column Referenceno in table FIN_Payment<br>
     * Help: {@literal The reference number can be printed on orders and invoices to allow your business partner
     *       to faster identify your records.}
     * 
     */
    public static final String PROPERTY_REFERENCENO = "referenceNo";

    /**
     * Property status stored in column Status in table FIN_Payment<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property processed stored in column Processed in table FIN_Payment<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property processNow stored in column Processing in table FIN_Payment<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property posted stored in column Posted in table FIN_Payment<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property description stored in column Description in table FIN_Payment<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property account stored in column Fin_Financial_Account_ID in table FIN_Payment<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property documentType stored in column C_DocType_ID in table FIN_Payment<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property project stored in column C_Project_ID in table FIN_Payment<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table FIN_Payment<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table FIN_Payment<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table FIN_Payment<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table FIN_Payment<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property generatedCredit stored in column Generated_Credit in table FIN_Payment<br>
     * Help: {@literal Amount left as credit on the payment.}
     * 
     */
    public static final String PROPERTY_GENERATEDCREDIT = "generatedCredit";

    /**
     * Property usedCredit stored in column Used_Credit in table FIN_Payment<br>
     * Help: {@literal If the payment has some generated credit is the amount already used on other payments.
     *       If
     *       the payment does not have a generated credit amount is the amount of credit used on the payment.}
     * 
     */
    public static final String PROPERTY_USEDCREDIT = "usedCredit";

    /**
     * Property createdByAlgorithm stored in column CreatedByAlgorithm in table FIN_Payment<br>
     * Help: {@literal This column reflects whether the document was created by the matching algorithm or not.}
     * 
     */
    public static final String PROPERTY_CREATEDBYALGORITHM = "createdByAlgorithm";

    /**
     * Property financialTransactionConvertRate stored in column Finacc_Txn_Convert_Rate in table FIN_Payment<br>
     * Help: {@literal The exchange rate used to convert the payment amount to the financial account amount}
     * 
     */
    public static final String PROPERTY_FINANCIALTRANSACTIONCONVERTRATE = "financialTransactionConvertRate";

    /**
     * Property financialTransactionAmount stored in column Finacc_Txn_Amount in table FIN_Payment<br>
     * Help: {@literal The total amount of the payment, converted to the currency of the financial account.}
     * 
     */
    public static final String PROPERTY_FINANCIALTRANSACTIONAMOUNT = "financialTransactionAmount";

    /**
     * Property aPRMProcessPayment stored in column EM_APRM_Process_Payment in table FIN_Payment
     * 
     */
    public static final String PROPERTY_APRMPROCESSPAYMENT = "aPRMProcessPayment";

    /**
     * Property reversedPayment stored in column FIN_Rev_Payment_ID in table FIN_Payment<br>
     * Help: {@literal Payment which reverses current payment}
     * 
     */
    public static final String PROPERTY_REVERSEDPAYMENT = "reversedPayment";

    /**
     * Property aPRMReconcilePayment stored in column EM_APRM_Reconcile_Payment in table FIN_Payment
     * 
     */
    public static final String PROPERTY_APRMRECONCILEPAYMENT = "aPRMReconcilePayment";

    /**
     * Property aPRMAddScheduledpayments stored in column EM_Aprm_Add_Scheduledpayments in table FIN_Payment<br>
     * Help: {@literal Select pending payments from Orders or Invoices, or create Payment Details related to GL
     *       Items.}
     * 
     */
    public static final String PROPERTY_APRMADDSCHEDULEDPAYMENTS = "aPRMAddScheduledpayments";

    /**
     * Property aprmExecutepayment stored in column EM_Aprm_Executepayment in table FIN_Payment
     * 
     */
    public static final String PROPERTY_APRMEXECUTEPAYMENT = "aprmExecutepayment";

    /**
     * Property aPRMReversePayment stored in column EM_APRM_ReversePayment in table FIN_Payment<br>
     * Help: {@literal Create an opposite payment which reverts selected.}
     * 
     */
    public static final String PROPERTY_APRMREVERSEPAYMENT = "aPRMReversePayment";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table FIN_Payment<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property invoiceTaxCashVATVList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_INVOICETAXCASHVATVLIST = "invoiceTaxCashVATVList";

    /**
     * Property currencyConversionRateDocList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_CURRENCYCONVERSIONRATEDOCLIST = "currencyConversionRateDocList";

    /**
     * Property fINFinaccTransactionList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINFINACCTRANSACTIONLIST = "fINFinaccTransactionList";

    /**
     * Property fINPaymentReversedPaymentList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINPAYMENTREVERSEDPAYMENTLIST = "fINPaymentReversedPaymentList";

    /**
     * Property fINPaymentCreditList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINPAYMENTCREDITLIST = "fINPaymentCreditList";

    /**
     * Property fINPaymentDetailList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINPAYMENTDETAILLIST = "fINPaymentDetailList";

    /**
     * Property fINPaymentDetailVList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINPAYMENTDETAILVLIST = "fINPaymentDetailVList";

    /**
     * Property fINReconciliationLineVList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINRECONCILIATIONLINEVLIST = "fINReconciliationLineVList";

    /**
     * Property financialMgmtGLJournalLineList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTGLJOURNALLINELIST = "financialMgmtGLJournalLineList";

    /**
     * Property financialMgmtPaymentRunPaymentList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST = "financialMgmtPaymentRunPaymentList";

    /**
     * Property financialMgmtTaxPaymentList stored in table FIN_Payment
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXPAYMENTLIST = "financialMgmtTaxPaymentList";


    public FIN_Payment() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_WRITEOFFAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_STATUS, "RPAP");
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_GENERATEDCREDIT, new BigDecimal(0));
        setDefaultValue(PROPERTY_USEDCREDIT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATEDBYALGORITHM, false);
        setDefaultValue(PROPERTY_FINANCIALTRANSACTIONCONVERTRATE, new BigDecimal(1.0));
        setDefaultValue(PROPERTY_APRMPROCESSPAYMENT, "P");
        setDefaultValue(PROPERTY_APRMRECONCILEPAYMENT, false);
        setDefaultValue(PROPERTY_APRMADDSCHEDULEDPAYMENTS, false);
        setDefaultValue(PROPERTY_APRMEXECUTEPAYMENT, false);
        setDefaultValue(PROPERTY_APRMREVERSEPAYMENT, false);
        setDefaultValue(PROPERTY_INVOICETAXCASHVATVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CURRENCYCONVERSIONRATEDOCLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINFINACCTRANSACTIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTREVERSEDPAYMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTCREDITLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTDETAILLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTDETAILVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINRECONCILIATIONLINEVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTGLJOURNALLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXPAYMENTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_Payment#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_Payment#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_Payment#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_Payment#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_Payment#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_Payment#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_Payment#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_Payment#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_Payment#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_Payment#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_Payment#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_Payment#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_Payment#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_Payment#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_Payment#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_Payment#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_Payment#PROPERTY_RECEIPT
     * 
     */
    public Boolean isReceipt() {
        return (Boolean) get(PROPERTY_RECEIPT);
    }
    /**
     * @see FIN_Payment#PROPERTY_RECEIPT
     * 
     */
    public void setReceipt(Boolean receipt) {
        set(PROPERTY_RECEIPT, receipt);
    }

    /**
     * @see FIN_Payment#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_Payment#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_Payment#PROPERTY_PAYMENTDATE
     * 
     */
    public Date getPaymentDate() {
        return (Date) get(PROPERTY_PAYMENTDATE);
    }
    /**
     * @see FIN_Payment#PROPERTY_PAYMENTDATE
     * 
     */
    public void setPaymentDate(Date paymentDate) {
        set(PROPERTY_PAYMENTDATE, paymentDate);
    }

    /**
     * @see FIN_Payment#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_Payment#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_Payment#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see FIN_Payment#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see FIN_Payment#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_Payment#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see FIN_Payment#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see FIN_Payment#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see FIN_Payment#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see FIN_Payment#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see FIN_Payment#PROPERTY_REFERENCENO
     * 
     */
    public String getReferenceNo() {
        return (String) get(PROPERTY_REFERENCENO);
    }
    /**
     * @see FIN_Payment#PROPERTY_REFERENCENO
     * 
     */
    public void setReferenceNo(String referenceNo) {
        set(PROPERTY_REFERENCENO, referenceNo);
    }

    /**
     * @see FIN_Payment#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see FIN_Payment#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see FIN_Payment#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see FIN_Payment#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see FIN_Payment#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see FIN_Payment#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see FIN_Payment#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see FIN_Payment#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see FIN_Payment#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FIN_Payment#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FIN_Payment#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see FIN_Payment#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see FIN_Payment#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see FIN_Payment#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see FIN_Payment#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see FIN_Payment#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see FIN_Payment#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see FIN_Payment#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see FIN_Payment#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see FIN_Payment#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see FIN_Payment#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see FIN_Payment#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see FIN_Payment#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see FIN_Payment#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see FIN_Payment#PROPERTY_GENERATEDCREDIT
     * 
     */
    public BigDecimal getGeneratedCredit() {
        return (BigDecimal) get(PROPERTY_GENERATEDCREDIT);
    }
    /**
     * @see FIN_Payment#PROPERTY_GENERATEDCREDIT
     * 
     */
    public void setGeneratedCredit(BigDecimal generatedCredit) {
        set(PROPERTY_GENERATEDCREDIT, generatedCredit);
    }

    /**
     * @see FIN_Payment#PROPERTY_USEDCREDIT
     * 
     */
    public BigDecimal getUsedCredit() {
        return (BigDecimal) get(PROPERTY_USEDCREDIT);
    }
    /**
     * @see FIN_Payment#PROPERTY_USEDCREDIT
     * 
     */
    public void setUsedCredit(BigDecimal usedCredit) {
        set(PROPERTY_USEDCREDIT, usedCredit);
    }

    /**
     * @see FIN_Payment#PROPERTY_CREATEDBYALGORITHM
     * 
     */
    public Boolean isCreatedByAlgorithm() {
        return (Boolean) get(PROPERTY_CREATEDBYALGORITHM);
    }
    /**
     * @see FIN_Payment#PROPERTY_CREATEDBYALGORITHM
     * 
     */
    public void setCreatedByAlgorithm(Boolean createdByAlgorithm) {
        set(PROPERTY_CREATEDBYALGORITHM, createdByAlgorithm);
    }

    /**
     * @see FIN_Payment#PROPERTY_FINANCIALTRANSACTIONCONVERTRATE
     * 
     */
    public BigDecimal getFinancialTransactionConvertRate() {
        return (BigDecimal) get(PROPERTY_FINANCIALTRANSACTIONCONVERTRATE);
    }
    /**
     * @see FIN_Payment#PROPERTY_FINANCIALTRANSACTIONCONVERTRATE
     * 
     */
    public void setFinancialTransactionConvertRate(BigDecimal financialTransactionConvertRate) {
        set(PROPERTY_FINANCIALTRANSACTIONCONVERTRATE, financialTransactionConvertRate);
    }

    /**
     * @see FIN_Payment#PROPERTY_FINANCIALTRANSACTIONAMOUNT
     * 
     */
    public BigDecimal getFinancialTransactionAmount() {
        return (BigDecimal) get(PROPERTY_FINANCIALTRANSACTIONAMOUNT);
    }
    /**
     * @see FIN_Payment#PROPERTY_FINANCIALTRANSACTIONAMOUNT
     * 
     */
    public void setFinancialTransactionAmount(BigDecimal financialTransactionAmount) {
        set(PROPERTY_FINANCIALTRANSACTIONAMOUNT, financialTransactionAmount);
    }

    /**
     * @see FIN_Payment#PROPERTY_APRMPROCESSPAYMENT
     * 
     */
    public String getAPRMProcessPayment() {
        return (String) get(PROPERTY_APRMPROCESSPAYMENT);
    }
    /**
     * @see FIN_Payment#PROPERTY_APRMPROCESSPAYMENT
     * 
     */
    public void setAPRMProcessPayment(String aPRMProcessPayment) {
        set(PROPERTY_APRMPROCESSPAYMENT, aPRMProcessPayment);
    }

    /**
     * @see FIN_Payment#PROPERTY_REVERSEDPAYMENT
     * 
     */
    public FIN_Payment getReversedPayment() {
        return (FIN_Payment) get(PROPERTY_REVERSEDPAYMENT);
    }
    /**
     * @see FIN_Payment#PROPERTY_REVERSEDPAYMENT
     * 
     */
    public void setReversedPayment(FIN_Payment reversedPayment) {
        set(PROPERTY_REVERSEDPAYMENT, reversedPayment);
    }

    /**
     * @see FIN_Payment#PROPERTY_APRMRECONCILEPAYMENT
     * 
     */
    public Boolean isAPRMReconcilePayment() {
        return (Boolean) get(PROPERTY_APRMRECONCILEPAYMENT);
    }
    /**
     * @see FIN_Payment#PROPERTY_APRMRECONCILEPAYMENT
     * 
     */
    public void setAPRMReconcilePayment(Boolean aPRMReconcilePayment) {
        set(PROPERTY_APRMRECONCILEPAYMENT, aPRMReconcilePayment);
    }

    /**
     * @see FIN_Payment#PROPERTY_APRMADDSCHEDULEDPAYMENTS
     * 
     */
    public Boolean isAPRMAddScheduledpayments() {
        return (Boolean) get(PROPERTY_APRMADDSCHEDULEDPAYMENTS);
    }
    /**
     * @see FIN_Payment#PROPERTY_APRMADDSCHEDULEDPAYMENTS
     * 
     */
    public void setAPRMAddScheduledpayments(Boolean aPRMAddScheduledpayments) {
        set(PROPERTY_APRMADDSCHEDULEDPAYMENTS, aPRMAddScheduledpayments);
    }

    /**
     * @see FIN_Payment#PROPERTY_APRMEXECUTEPAYMENT
     * 
     */
    public Boolean isAprmExecutepayment() {
        return (Boolean) get(PROPERTY_APRMEXECUTEPAYMENT);
    }
    /**
     * @see FIN_Payment#PROPERTY_APRMEXECUTEPAYMENT
     * 
     */
    public void setAprmExecutepayment(Boolean aprmExecutepayment) {
        set(PROPERTY_APRMEXECUTEPAYMENT, aprmExecutepayment);
    }

    /**
     * @see FIN_Payment#PROPERTY_APRMREVERSEPAYMENT
     * 
     */
    public Boolean isAPRMReversePayment() {
        return (Boolean) get(PROPERTY_APRMREVERSEPAYMENT);
    }
    /**
     * @see FIN_Payment#PROPERTY_APRMREVERSEPAYMENT
     * 
     */
    public void setAPRMReversePayment(Boolean aPRMReversePayment) {
        set(PROPERTY_APRMREVERSEPAYMENT, aPRMReversePayment);
    }

    /**
     * @see FIN_Payment#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see FIN_Payment#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * Help: {@literal Invoice Cash VAT View that sums the percentage, tax amount and taxable amount per payment
     *       detail.}<br>
     * @see InvoiceTaxCashVAT_V
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceTaxCashVAT_V> getInvoiceTaxCashVATVList() {
      return (List<InvoiceTaxCashVAT_V>) get(PROPERTY_INVOICETAXCASHVATVLIST);
    }

    /**
     * Help: {@literal Invoice Cash VAT View that sums the percentage, tax amount and taxable amount per payment
     *       detail.}<br>
     * @see InvoiceTaxCashVAT_V
     * 
     */
    public void setInvoiceTaxCashVATVList(List<InvoiceTaxCashVAT_V> invoiceTaxCashVATVList) {
        set(PROPERTY_INVOICETAXCASHVATVLIST, invoiceTaxCashVATVList);
    }

    /**
     * Help: {@literal Define another currency conversion rate for this document different than Openbravo systema
     *       exchange rate.}<br>
     * @see ConversionRateDoc
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ConversionRateDoc> getCurrencyConversionRateDocList() {
      return (List<ConversionRateDoc>) get(PROPERTY_CURRENCYCONVERSIONRATEDOCLIST);
    }

    /**
     * Help: {@literal Define another currency conversion rate for this document different than Openbravo systema
     *       exchange rate.}<br>
     * @see ConversionRateDoc
     * 
     */
    public void setCurrencyConversionRateDocList(List<ConversionRateDoc> currencyConversionRateDocList) {
        set(PROPERTY_CURRENCYCONVERSIONRATEDOCLIST, currencyConversionRateDocList);
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
     * Help: {@literal Payment events}<br>
     * @see FIN_Payment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_Payment> getFINPaymentReversedPaymentList() {
      return (List<FIN_Payment>) get(PROPERTY_FINPAYMENTREVERSEDPAYMENTLIST);
    }

    /**
     * Help: {@literal Payment events}<br>
     * @see FIN_Payment
     * 
     */
    public void setFINPaymentReversedPaymentList(List<FIN_Payment> fINPaymentReversedPaymentList) {
        set(PROPERTY_FINPAYMENTREVERSEDPAYMENTLIST, fINPaymentReversedPaymentList);
    }

    /**
     * Help: {@literal A credit payment can be used in several payments. This table tracks the places where the
     *       credit has been used}<br>
     * @see FIN_Payment_Credit
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_Payment_Credit> getFINPaymentCreditList() {
      return (List<FIN_Payment_Credit>) get(PROPERTY_FINPAYMENTCREDITLIST);
    }

    /**
     * Help: {@literal A credit payment can be used in several payments. This table tracks the places where the
     *       credit has been used}<br>
     * @see FIN_Payment_Credit
     * 
     */
    public void setFINPaymentCreditList(List<FIN_Payment_Credit> fINPaymentCreditList) {
        set(PROPERTY_FINPAYMENTCREDITLIST, fINPaymentCreditList);
    }

    /**
     * @see FIN_PaymentDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentDetail> getFINPaymentDetailList() {
      return (List<FIN_PaymentDetail>) get(PROPERTY_FINPAYMENTDETAILLIST);
    }

    /**
     * @see FIN_PaymentDetail
     * 
     */
    public void setFINPaymentDetailList(List<FIN_PaymentDetail> fINPaymentDetailList) {
        set(PROPERTY_FINPAYMENTDETAILLIST, fINPaymentDetailList);
    }

    /**
     * @see FIN_PaymentDetailV
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentDetailV> getFINPaymentDetailVList() {
      return (List<FIN_PaymentDetailV>) get(PROPERTY_FINPAYMENTDETAILVLIST);
    }

    /**
     * @see FIN_PaymentDetailV
     * 
     */
    public void setFINPaymentDetailVList(List<FIN_PaymentDetailV> fINPaymentDetailVList) {
        set(PROPERTY_FINPAYMENTDETAILVLIST, fINPaymentDetailVList);
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

    /**
     * Help: {@literal The GL Journal Line Tab defines the individual debit and credit transactions that comprise
     *       a journal.}<br>
     * @see GLJournalLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<GLJournalLine> getFinancialMgmtGLJournalLineList() {
      return (List<GLJournalLine>) get(PROPERTY_FINANCIALMGMTGLJOURNALLINELIST);
    }

    /**
     * Help: {@literal The GL Journal Line Tab defines the individual debit and credit transactions that comprise
     *       a journal.}<br>
     * @see GLJournalLine
     * 
     */
    public void setFinancialMgmtGLJournalLineList(List<GLJournalLine> financialMgmtGLJournalLineList) {
        set(PROPERTY_FINANCIALMGMTGLJOURNALLINELIST, financialMgmtGLJournalLineList);
    }

    /**
     * Help: {@literal Table to store the Payments included on each Payment Run.}<br>
     * @see PaymentRunPayment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PaymentRunPayment> getFinancialMgmtPaymentRunPaymentList() {
      return (List<PaymentRunPayment>) get(PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST);
    }

    /**
     * Help: {@literal Table to store the Payments included on each Payment Run.}<br>
     * @see PaymentRunPayment
     * 
     */
    public void setFinancialMgmtPaymentRunPaymentList(List<PaymentRunPayment> financialMgmtPaymentRunPaymentList) {
        set(PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST, financialMgmtPaymentRunPaymentList);
    }

    /**
     * Help: {@literal Tax Payment}<br>
     * @see TaxPayment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxPayment> getFinancialMgmtTaxPaymentList() {
      return (List<TaxPayment>) get(PROPERTY_FINANCIALMGMTTAXPAYMENTLIST);
    }

    /**
     * Help: {@literal Tax Payment}<br>
     * @see TaxPayment
     * 
     */
    public void setFinancialMgmtTaxPaymentList(List<TaxPayment> financialMgmtTaxPaymentList) {
        set(PROPERTY_FINANCIALMGMTTAXPAYMENTLIST, financialMgmtTaxPaymentList);
    }

}
