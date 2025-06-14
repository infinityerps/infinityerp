
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
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity FIN_Payment_Detail_V (stored in table FIN_Payment_Detail_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentDetailV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Detail_V";
    public static final String ENTITY_NAME = "FIN_Payment_Detail_V";

    /**
     * Property id stored in column Fin_Payment_Detail_V_ID in table FIN_Payment_Detail_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Detail_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Detail_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Detail_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property orderPaymentPlan stored in column Fin_Payment_Sched_Ord_V_Id in table FIN_Payment_Detail_V<br>
     * Help: {@literal Set of payments in planned to be collected/paid for an order}
     * 
     */
    public static final String PROPERTY_ORDERPAYMENTPLAN = "orderPaymentPlan";

    /**
     * Property paymentPlanInvoice stored in column FIN_Payment_Sched_Inv_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Set of payments in planned to be collected/paid for an invoice}
     * 
     */
    public static final String PROPERTY_PAYMENTPLANINVOICE = "paymentPlanInvoice";

    /**
     * Property paymentPlanOrder stored in column FIN_Payment_Sched_Ord_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Set of payments in planned to be collected/paid for an order}
     * 
     */
    public static final String PROPERTY_PAYMENTPLANORDER = "paymentPlanOrder";

    /**
     * Property invoiceno stored in column Invoiceno in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_INVOICENO = "invoiceno";

    /**
     * Property orderno stored in column Orderno in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_ORDERNO = "orderno";

    /**
     * Property paymentno stored in column Paymentno in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_PAYMENTNO = "paymentno";

    /**
     * Property payment stored in column FIN_Payment_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Payment In event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property dueDate stored in column Duedate in table FIN_Payment_Detail_V<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property invoiceAmount stored in column Invoicedamt in table FIN_Payment_Detail_V<br>
     * Help: {@literal The amount invoiced}
     * 
     */
    public static final String PROPERTY_INVOICEAMOUNT = "invoiceAmount";

    /**
     * Property expected stored in column Expected in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_EXPECTED = "expected";

    /**
     * Property paidAmount stored in column Paidamt in table FIN_Payment_Detail_V 
     * 
     */
    public static final String PROPERTY_PAIDAMOUNT = "paidAmount";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property paymentMethod stored in column Fin_Paymentmethod_ID in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property finFinancialAccount stored in column Fin_Financial_Account_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_FINFINANCIALACCOUNT = "finFinancialAccount";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property paymentDate stored in column Paymentdate in table FIN_Payment_Detail_V 
     * 
     */
    public static final String PROPERTY_PAYMENTDATE = "paymentDate";

    /**
     * Property glitemname stored in column Glitemname in table FIN_Payment_Detail_V 
     * 
     */
    public static final String PROPERTY_GLITEMNAME = "glitemname";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Payment_Detail_V<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property finaccCurrency stored in column Finacc_Currency_ID in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_FINACCCURRENCY = "finaccCurrency";

    /**
     * Property finaccTxnConvertRate stored in column Finacc_Txn_Convert_Rate in table FIN_Payment_Detail_V<br>
     * Help: {@literal The exchange rate used to convert the payment amount to the financial account amount}
     * 
     */
    public static final String PROPERTY_FINACCTXNCONVERTRATE = "finaccTxnConvertRate";

    /**
     * Property paidConverted stored in column PaidConverted in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_PAIDCONVERTED = "paidConverted";

    /**
     * Property expectedConverted stored in column ExpectedConverted in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_EXPECTEDCONVERTED = "expectedConverted";

    /**
     * Property canceled stored in column Iscanceled in table FIN_Payment_Detail_V
     * 
     */
    public static final String PROPERTY_CANCELED = "canceled";

    /**
     * Property businessPartnerdim stored in column C_Bpartner_Id_Dim in table FIN_Payment_Detail_V<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERDIM = "businessPartnerdim";

    /**
     * Property activity stored in column C_Activity_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property product stored in column M_Product_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesRegion stored in column C_Salesregion_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property status stored in column Status in table FIN_Payment_Detail_V<br>
     * Help: {@literal Status for the debt payment}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property aPRMDisplayedPaymmeth stored in column EM_APRM_Displayed_Paymmeth_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Displayed Payment Method field in Sales Order Payment Schedule Details tab. For netting
     *       payments the value displayed will be empty.}
     * 
     */
    public static final String PROPERTY_APRMDISPLAYEDPAYMMETH = "aPRMDisplayedPaymmeth";

    /**
     * Property aPRMDisplayedAcc stored in column EM_APRM_Displayed_Acc_ID in table FIN_Payment_Detail_V<br>
     * Help: {@literal Displayed Financial Account field in Sales Order Payment Schedule Details tab. For netting
     *       payments the value displayed will be empty.}
     * 
     */
    public static final String PROPERTY_APRMDISPLAYEDACC = "aPRMDisplayedAcc";


    public FIN_PaymentDetailV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CANCELED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_ORDERPAYMENTPLAN
     * 
     */
    public FIN_PaymentSchedOrdV getOrderPaymentPlan() {
        return (FIN_PaymentSchedOrdV) get(PROPERTY_ORDERPAYMENTPLAN);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_ORDERPAYMENTPLAN
     * 
     */
    public void setOrderPaymentPlan(FIN_PaymentSchedOrdV orderPaymentPlan) {
        set(PROPERTY_ORDERPAYMENTPLAN, orderPaymentPlan);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTPLANINVOICE
     * 
     */
    public FIN_PaymentSchedule getPaymentPlanInvoice() {
        return (FIN_PaymentSchedule) get(PROPERTY_PAYMENTPLANINVOICE);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTPLANINVOICE
     * 
     */
    public void setPaymentPlanInvoice(FIN_PaymentSchedule paymentPlanInvoice) {
        set(PROPERTY_PAYMENTPLANINVOICE, paymentPlanInvoice);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTPLANORDER
     * 
     */
    public FIN_PaymentSchedule getPaymentPlanOrder() {
        return (FIN_PaymentSchedule) get(PROPERTY_PAYMENTPLANORDER);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTPLANORDER
     * 
     */
    public void setPaymentPlanOrder(FIN_PaymentSchedule paymentPlanOrder) {
        set(PROPERTY_PAYMENTPLANORDER, paymentPlanOrder);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_INVOICENO
     * 
     */
    public String getInvoiceno() {
        return (String) get(PROPERTY_INVOICENO);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_INVOICENO
     * 
     */
    public void setInvoiceno(String invoiceno) {
        set(PROPERTY_INVOICENO, invoiceno);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_ORDERNO
     * 
     */
    public String getOrderno() {
        return (String) get(PROPERTY_ORDERNO);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_ORDERNO
     * 
     */
    public void setOrderno(String orderno) {
        set(PROPERTY_ORDERNO, orderno);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTNO
     * 
     */
    public String getPaymentno() {
        return (String) get(PROPERTY_PAYMENTNO);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTNO
     * 
     */
    public void setPaymentno(String paymentno) {
        set(PROPERTY_PAYMENTNO, paymentno);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_INVOICEAMOUNT
     * 
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) get(PROPERTY_INVOICEAMOUNT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_INVOICEAMOUNT
     * 
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        set(PROPERTY_INVOICEAMOUNT, invoiceAmount);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_EXPECTED
     * 
     */
    public BigDecimal getExpected() {
        return (BigDecimal) get(PROPERTY_EXPECTED);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_EXPECTED
     * 
     */
    public void setExpected(BigDecimal expected) {
        set(PROPERTY_EXPECTED, expected);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAIDAMOUNT
     * 
     */
    public BigDecimal getPaidAmount() {
        return (BigDecimal) get(PROPERTY_PAIDAMOUNT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAIDAMOUNT
     * 
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        set(PROPERTY_PAIDAMOUNT, paidAmount);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_FINFINANCIALACCOUNT
     * 
     */
    public FIN_FinancialAccount getFinFinancialAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_FINFINANCIALACCOUNT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_FINFINANCIALACCOUNT
     * 
     */
    public void setFinFinancialAccount(FIN_FinancialAccount finFinancialAccount) {
        set(PROPERTY_FINFINANCIALACCOUNT, finFinancialAccount);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTDATE
     * 
     */
    public Date getPaymentDate() {
        return (Date) get(PROPERTY_PAYMENTDATE);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAYMENTDATE
     * 
     */
    public void setPaymentDate(Date paymentDate) {
        set(PROPERTY_PAYMENTDATE, paymentDate);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_GLITEMNAME
     * 
     */
    public String getGlitemname() {
        return (String) get(PROPERTY_GLITEMNAME);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_GLITEMNAME
     * 
     */
    public void setGlitemname(String glitemname) {
        set(PROPERTY_GLITEMNAME, glitemname);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_FINACCCURRENCY
     * 
     */
    public Currency getFinaccCurrency() {
        return (Currency) get(PROPERTY_FINACCCURRENCY);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_FINACCCURRENCY
     * 
     */
    public void setFinaccCurrency(Currency finaccCurrency) {
        set(PROPERTY_FINACCCURRENCY, finaccCurrency);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_FINACCTXNCONVERTRATE
     * 
     */
    public BigDecimal getFinaccTxnConvertRate() {
        return (BigDecimal) get(PROPERTY_FINACCTXNCONVERTRATE);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_FINACCTXNCONVERTRATE
     * 
     */
    public void setFinaccTxnConvertRate(BigDecimal finaccTxnConvertRate) {
        set(PROPERTY_FINACCTXNCONVERTRATE, finaccTxnConvertRate);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAIDCONVERTED
     * 
     */
    public BigDecimal getPaidConverted() {
        return (BigDecimal) get(PROPERTY_PAIDCONVERTED);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PAIDCONVERTED
     * 
     */
    public void setPaidConverted(BigDecimal paidConverted) {
        set(PROPERTY_PAIDCONVERTED, paidConverted);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_EXPECTEDCONVERTED
     * 
     */
    public BigDecimal getExpectedConverted() {
        return (BigDecimal) get(PROPERTY_EXPECTEDCONVERTED);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_EXPECTEDCONVERTED
     * 
     */
    public void setExpectedConverted(BigDecimal expectedConverted) {
        set(PROPERTY_EXPECTEDCONVERTED, expectedConverted);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_CANCELED
     * 
     */
    public Boolean isCanceled() {
        return (Boolean) get(PROPERTY_CANCELED);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_CANCELED
     * 
     */
    public void setCanceled(Boolean canceled) {
        set(PROPERTY_CANCELED, canceled);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_BUSINESSPARTNERDIM
     * 
     */
    public BusinessPartner getBusinessPartnerdim() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNERDIM);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_BUSINESSPARTNERDIM
     * 
     */
    public void setBusinessPartnerdim(BusinessPartner businessPartnerdim) {
        set(PROPERTY_BUSINESSPARTNERDIM, businessPartnerdim);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_APRMDISPLAYEDPAYMMETH
     * 
     */
    public FIN_PaymentMethod getAPRMDisplayedPaymmeth() {
        return (FIN_PaymentMethod) get(PROPERTY_APRMDISPLAYEDPAYMMETH);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_APRMDISPLAYEDPAYMMETH
     * 
     */
    public void setAPRMDisplayedPaymmeth(FIN_PaymentMethod aPRMDisplayedPaymmeth) {
        set(PROPERTY_APRMDISPLAYEDPAYMMETH, aPRMDisplayedPaymmeth);
    }

    /**
     * @see FIN_PaymentDetailV#PROPERTY_APRMDISPLAYEDACC
     * 
     */
    public FIN_FinancialAccount getAPRMDisplayedAcc() {
        return (FIN_FinancialAccount) get(PROPERTY_APRMDISPLAYEDACC);
    }
    /**
     * @see FIN_PaymentDetailV#PROPERTY_APRMDISPLAYEDACC
     * 
     */
    public void setAPRMDisplayedAcc(FIN_FinancialAccount aPRMDisplayedAcc) {
        set(PROPERTY_APRMDISPLAYEDACC, aPRMDisplayedAcc);
    }

}
