
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
package org.openbravo.model.common.invoice;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentDetail;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.tax.TaxRate;
/**
 * Entity class for entity C_InvoiceTax_CashVAT_V (stored in table C_InvoiceTax_CashVAT_V).
 * <br>
 * Help: {@literal Invoice Cash VAT View that sums the percentage, tax amount and taxable amount per payment
     *       detail.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceTaxCashVAT_V extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_InvoiceTax_CashVAT_V";
    public static final String ENTITY_NAME = "C_InvoiceTax_CashVAT_V";

    /**
     * Property id stored in column C_Invoicetax_Cashvat_V_ID in table C_InvoiceTax_CashVAT_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_InvoiceTax_CashVAT_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_InvoiceTax_CashVAT_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table C_InvoiceTax_CashVAT_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_InvoiceTax_CashVAT_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_InvoiceTax_CashVAT_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_InvoiceTax_CashVAT_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table C_InvoiceTax_CashVAT_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property paymentDate stored in column Paymentdate in table C_InvoiceTax_CashVAT_V
     * 
     */
    public static final String PROPERTY_PAYMENTDATE = "paymentDate";

    /**
     * Property percentage stored in column Percentage in table C_InvoiceTax_CashVAT_V 
     * 
     */
    public static final String PROPERTY_PERCENTAGE = "percentage";

    /**
     * Property taxAmount stored in column Taxamt in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal The Tax Amount displays the total tax amount for a document.}
     * 
     */
    public static final String PROPERTY_TAXAMOUNT = "taxAmount";

    /**
     * Property taxableAmount stored in column Taxbaseamt in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal The Tax Base Amount indicates the base amount used for calculating the tax amount.}
     * 
     */
    public static final String PROPERTY_TAXABLEAMOUNT = "taxableAmount";

    /**
     * Property canceled stored in column Iscanceled in table C_InvoiceTax_CashVAT_V
     * 
     */
    public static final String PROPERTY_CANCELED = "canceled";

    /**
     * Property payment stored in column FIN_Payment_ID in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property paymentDetails stored in column FIN_Payment_Detail_ID in table C_InvoiceTax_CashVAT_V
     * 
     */
    public static final String PROPERTY_PAYMENTDETAILS = "paymentDetails";

    /**
     * Property receipt stored in column Isreceipt in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal Indicated a sales transaction (Accounts Receivable if Receipt=Y) or a purchase transaction
     *       (Accounts Payable if Receipt=N).}
     * 
     */
    public static final String PROPERTY_RECEIPT = "receipt";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table C_InvoiceTax_CashVAT_V
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property status stored in column Status in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal Identifies the Status of the document}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property amount stored in column Amount in table C_InvoiceTax_CashVAT_V
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property currency stored in column C_Currency_ID in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property invoiceTax stored in column C_Invoicetax_ID in table C_InvoiceTax_CashVAT_V
     * 
     */
    public static final String PROPERTY_INVOICETAX = "invoiceTax";

    /**
     * Property isManualSettlement stored in column IsManualSettlement in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal Indicates whether this line has been created from a Manual Cash VAT Settlement}
     * 
     */
    public static final String PROPERTY_ISMANUALSETTLEMENT = "isManualSettlement";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property tax stored in column C_Tax_ID in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property isPrepayment stored in column Isprepayment in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal When the payment is created against order it is considered to be a prepayment}
     * 
     */
    public static final String PROPERTY_ISPREPAYMENT = "isPrepayment";

    /**
     * Property isPaidAtInvoicing stored in column IsPaidAtInvoicing in table C_InvoiceTax_CashVAT_V<br>
     * Help: {@literal If checked represents that this payment detail has been created at invoicing. It is
     *       usually checked in the POS when the business partners pays exactly when the invoice is being
     *       created. The flag is mainly used by the Cash VAT engine.}
     * 
     */
    public static final String PROPERTY_ISPAIDATINVOICING = "isPaidAtInvoicing";


    public InvoiceTaxCashVAT_V() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CANCELED, false);
        setDefaultValue(PROPERTY_RECEIPT, false);
        setDefaultValue(PROPERTY_ISMANUALSETTLEMENT, false);
        setDefaultValue(PROPERTY_ISPREPAYMENT, false);
        setDefaultValue(PROPERTY_ISPAIDATINVOICING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENTDATE
     * 
     */
    public Date getPaymentDate() {
        return (Date) get(PROPERTY_PAYMENTDATE);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENTDATE
     * 
     */
    public void setPaymentDate(Date paymentDate) {
        set(PROPERTY_PAYMENTDATE, paymentDate);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PERCENTAGE
     * 
     */
    public BigDecimal getPercentage() {
        return (BigDecimal) get(PROPERTY_PERCENTAGE);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PERCENTAGE
     * 
     */
    public void setPercentage(BigDecimal percentage) {
        set(PROPERTY_PERCENTAGE, percentage);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_TAXAMOUNT
     * 
     */
    public BigDecimal getTaxAmount() {
        return (BigDecimal) get(PROPERTY_TAXAMOUNT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_TAXAMOUNT
     * 
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        set(PROPERTY_TAXAMOUNT, taxAmount);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public BigDecimal getTaxableAmount() {
        return (BigDecimal) get(PROPERTY_TAXABLEAMOUNT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        set(PROPERTY_TAXABLEAMOUNT, taxableAmount);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CANCELED
     * 
     */
    public Boolean isCanceled() {
        return (Boolean) get(PROPERTY_CANCELED);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CANCELED
     * 
     */
    public void setCanceled(Boolean canceled) {
        set(PROPERTY_CANCELED, canceled);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENTDETAILS
     * 
     */
    public FIN_PaymentDetail getPaymentDetails() {
        return (FIN_PaymentDetail) get(PROPERTY_PAYMENTDETAILS);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENTDETAILS
     * 
     */
    public void setPaymentDetails(FIN_PaymentDetail paymentDetails) {
        set(PROPERTY_PAYMENTDETAILS, paymentDetails);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_RECEIPT
     * 
     */
    public Boolean isReceipt() {
        return (Boolean) get(PROPERTY_RECEIPT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_RECEIPT
     * 
     */
    public void setReceipt(Boolean receipt) {
        set(PROPERTY_RECEIPT, receipt);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_INVOICETAX
     * 
     */
    public InvoiceTax getInvoiceTax() {
        return (InvoiceTax) get(PROPERTY_INVOICETAX);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_INVOICETAX
     * 
     */
    public void setInvoiceTax(InvoiceTax invoiceTax) {
        set(PROPERTY_INVOICETAX, invoiceTax);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ISMANUALSETTLEMENT
     * 
     */
    public Boolean isManualSettlement() {
        return (Boolean) get(PROPERTY_ISMANUALSETTLEMENT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ISMANUALSETTLEMENT
     * 
     */
    public void setManualSettlement(Boolean isManualSettlement) {
        set(PROPERTY_ISMANUALSETTLEMENT, isManualSettlement);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ISPREPAYMENT
     * 
     */
    public Boolean isPrepayment() {
        return (Boolean) get(PROPERTY_ISPREPAYMENT);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ISPREPAYMENT
     * 
     */
    public void setPrepayment(Boolean isPrepayment) {
        set(PROPERTY_ISPREPAYMENT, isPrepayment);
    }

    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ISPAIDATINVOICING
     * 
     */
    public Boolean isPaidAtInvoicing() {
        return (Boolean) get(PROPERTY_ISPAIDATINVOICING);
    }
    /**
     * @see InvoiceTaxCashVAT_V#PROPERTY_ISPAIDATINVOICING
     * 
     */
    public void setPaidAtInvoicing(Boolean isPaidAtInvoicing) {
        set(PROPERTY_ISPAIDATINVOICING, isPaidAtInvoicing);
    }

}
