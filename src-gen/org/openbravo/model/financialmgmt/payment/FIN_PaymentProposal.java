
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FIN_Payment_Proposal (stored in table FIN_Payment_Proposal).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentProposal extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Proposal";
    public static final String ENTITY_NAME = "FIN_Payment_Proposal";

    /**
     * Property id stored in column Fin_Payment_Proposal_ID in table FIN_Payment_Proposal
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Proposal 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Proposal 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Proposal 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Proposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Proposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Proposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Proposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property receipt stored in column Isreceipt in table FIN_Payment_Proposal<br>
     * Help: {@literal Indicated a sales transaction (Accounts Receivable if Receipt=Y) or a purchase transaction
     *       (Accounts Payable if Receipt=N).}
     * 
     */
    public static final String PROPERTY_RECEIPT = "receipt";

    /**
     * Property description stored in column Description in table FIN_Payment_Proposal<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Payment_Proposal<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property account stored in column Fin_Financial_Account_ID in table FIN_Payment_Proposal<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property paymentDate stored in column Paymentdate in table FIN_Payment_Proposal 
     * 
     */
    public static final String PROPERTY_PAYMENTDATE = "paymentDate";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Payment_Proposal<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property amount stored in column Amount in table FIN_Payment_Proposal 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Payment_Proposal 
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property paymentMethod stored in column Fin_Paymentmethod_ID in table FIN_Payment_Proposal
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property documentNo stored in column DocumentNo in table FIN_Payment_Proposal 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property referenceNo stored in column Referenceno in table FIN_Payment_Proposal<br>
     * Help: {@literal The reference number can be printed on orders and invoices to allow your business partner
     *       to faster identify your records.}
     * 
     */
    public static final String PROPERTY_REFERENCENO = "referenceNo";

    /**
     * Property status stored in column Status in table FIN_Payment_Proposal<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property processed stored in column Processed in table FIN_Payment_Proposal<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property processNow stored in column Processing in table FIN_Payment_Proposal<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property documentType stored in column C_Doctype_ID in table FIN_Payment_Proposal<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property duedate stored in column Duedate in table FIN_Payment_Proposal<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_DUEDATE = "duedate";

    /**
     * Property aPRMProcessProposal stored in column EM_APRM_Process_Proposal in table FIN_Payment_Proposal
     * 
     */
    public static final String PROPERTY_APRMPROCESSPROPOSAL = "aPRMProcessProposal";

    /**
     * Property aPRMSelExpectedPayments stored in column EM_APRM_SelExpectedPayments in table FIN_Payment_Proposal
     * 
     */
    public static final String PROPERTY_APRMSELEXPECTEDPAYMENTS = "aPRMSelExpectedPayments";

    /**
     * Property aPRMExecutePayment stored in column EM_Aprm_Executepayment in table FIN_Payment_Proposal
     * 
     */
    public static final String PROPERTY_APRMEXECUTEPAYMENT = "aPRMExecutePayment";

    /**
     * Property financialTransactionConvertRate stored in column Finacc_Txn_Convert_Rate in table FIN_Payment_Proposal<br>
     * Help: {@literal The exchange rate used to convert the payment amount to the financial account amount}
     * 
     */
    public static final String PROPERTY_FINANCIALTRANSACTIONCONVERTRATE = "financialTransactionConvertRate";

    /**
     * Property financialTransactionAmount stored in column Finacc_Txn_Amount in table FIN_Payment_Proposal<br>
     * Help: {@literal The total amount of the payment, converted to the currency of the financial account.}
     * 
     */
    public static final String PROPERTY_FINANCIALTRANSACTIONAMOUNT = "financialTransactionAmount";


    /**
     * Property _computedColumns stored in column _computedColumns in table FIN_Payment_Proposal
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property fINPaymentPropDetailList stored in table FIN_Payment_Proposal
     * 
     */
    public static final String PROPERTY_FINPAYMENTPROPDETAILLIST = "fINPaymentPropDetailList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property limitwriteoff<br>
     * <br>
     * Computed from: <br>
     * {@code (select ff.writeofflimit  from fin_financial_account ff where
       ff.fin_financial_account_id=fin_financial_account_id)
       }
     */
    public static final String COMPUTED_COLUMN_LIMITWRITEOFF = "limitwriteoff";

    public FIN_PaymentProposal() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_WRITEOFFAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_STATUS, "RPAP");
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_APRMPROCESSPROPOSAL, "G");
        setDefaultValue(PROPERTY_APRMSELEXPECTEDPAYMENTS, true);
        setDefaultValue(PROPERTY_APRMEXECUTEPAYMENT, false);
        setDefaultValue(PROPERTY_FINANCIALTRANSACTIONCONVERTRATE, new BigDecimal(1));
        setDefaultValue(PROPERTY_FINANCIALTRANSACTIONAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_FINPAYMENTPROPDETAILLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_RECEIPT
     * 
     */
    public Boolean isReceipt() {
        return (Boolean) get(PROPERTY_RECEIPT);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_RECEIPT
     * 
     */
    public void setReceipt(Boolean receipt) {
        set(PROPERTY_RECEIPT, receipt);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_PAYMENTDATE
     * 
     */
    public Date getPaymentDate() {
        return (Date) get(PROPERTY_PAYMENTDATE);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_PAYMENTDATE
     * 
     */
    public void setPaymentDate(Date paymentDate) {
        set(PROPERTY_PAYMENTDATE, paymentDate);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_REFERENCENO
     * 
     */
    public String getReferenceNo() {
        return (String) get(PROPERTY_REFERENCENO);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_REFERENCENO
     * 
     */
    public void setReferenceNo(String referenceNo) {
        set(PROPERTY_REFERENCENO, referenceNo);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_DUEDATE
     * 
     */
    public Date getDuedate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_DUEDATE
     * 
     */
    public void setDuedate(Date duedate) {
        set(PROPERTY_DUEDATE, duedate);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_APRMPROCESSPROPOSAL
     * 
     */
    public String getAPRMProcessProposal() {
        return (String) get(PROPERTY_APRMPROCESSPROPOSAL);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_APRMPROCESSPROPOSAL
     * 
     */
    public void setAPRMProcessProposal(String aPRMProcessProposal) {
        set(PROPERTY_APRMPROCESSPROPOSAL, aPRMProcessProposal);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_APRMSELEXPECTEDPAYMENTS
     * 
     */
    public Boolean isAPRMSelExpectedPayments() {
        return (Boolean) get(PROPERTY_APRMSELEXPECTEDPAYMENTS);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_APRMSELEXPECTEDPAYMENTS
     * 
     */
    public void setAPRMSelExpectedPayments(Boolean aPRMSelExpectedPayments) {
        set(PROPERTY_APRMSELEXPECTEDPAYMENTS, aPRMSelExpectedPayments);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_APRMEXECUTEPAYMENT
     * 
     */
    public Boolean isAPRMExecutePayment() {
        return (Boolean) get(PROPERTY_APRMEXECUTEPAYMENT);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_APRMEXECUTEPAYMENT
     * 
     */
    public void setAPRMExecutePayment(Boolean aPRMExecutePayment) {
        set(PROPERTY_APRMEXECUTEPAYMENT, aPRMExecutePayment);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_FINANCIALTRANSACTIONCONVERTRATE
     * 
     */
    public BigDecimal getFinancialTransactionConvertRate() {
        return (BigDecimal) get(PROPERTY_FINANCIALTRANSACTIONCONVERTRATE);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_FINANCIALTRANSACTIONCONVERTRATE
     * 
     */
    public void setFinancialTransactionConvertRate(BigDecimal financialTransactionConvertRate) {
        set(PROPERTY_FINANCIALTRANSACTIONCONVERTRATE, financialTransactionConvertRate);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY_FINANCIALTRANSACTIONAMOUNT
     * 
     */
    public BigDecimal getFinancialTransactionAmount() {
        return (BigDecimal) get(PROPERTY_FINANCIALTRANSACTIONAMOUNT);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY_FINANCIALTRANSACTIONAMOUNT
     * 
     */
    public void setFinancialTransactionAmount(BigDecimal financialTransactionAmount) {
        set(PROPERTY_FINANCIALTRANSACTIONAMOUNT, financialTransactionAmount);
    }

    /**
     * @see FIN_PaymentProposal#COMPUTED_COLUMN_LIMITWRITEOFF
     * 
     */
    public BigDecimal getLimitwriteoff() {
        return (BigDecimal) get(COMPUTED_COLUMN_LIMITWRITEOFF);
    }
    /**
     * @see FIN_PaymentProposal#COMPUTED_COLUMN_LIMITWRITEOFF
     * 
     */
    public void setLimitwriteoff(BigDecimal limitwriteoff) {
        set(COMPUTED_COLUMN_LIMITWRITEOFF, limitwriteoff);
    }

    /**
     * @see FIN_PaymentProposal#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public FIN_PaymentProposal_ComputedColumns get_computedColumns() {
        return (FIN_PaymentProposal_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see FIN_PaymentProposal#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(FIN_PaymentProposal_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * @see FIN_PaymentPropDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentPropDetail> getFINPaymentPropDetailList() {
      return (List<FIN_PaymentPropDetail>) get(PROPERTY_FINPAYMENTPROPDETAILLIST);
    }

    /**
     * @see FIN_PaymentPropDetail
     * 
     */
    public void setFINPaymentPropDetailList(List<FIN_PaymentPropDetail> fINPaymentPropDetailList) {
        set(PROPERTY_FINPAYMENTPROPDETAILLIST, fINPaymentPropDetailList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_LIMITWRITEOFF.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getLimitwriteoff();
      }

      return super.get(propName);
    }
}
