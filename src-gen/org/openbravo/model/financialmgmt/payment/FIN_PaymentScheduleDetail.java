
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity FIN_Payment_ScheduleDetail (stored in table FIN_Payment_ScheduleDetail).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentScheduleDetail extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_ScheduleDetail";
    public static final String ENTITY_NAME = "FIN_Payment_ScheduleDetail";

    /**
     * Property id stored in column FIN_Payment_Scheduledetail_ID in table FIN_Payment_ScheduleDetail
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_ScheduleDetail 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_ScheduleDetail 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_ScheduleDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_ScheduleDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_ScheduleDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_ScheduleDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property paymentDetails stored in column FIN_Payment_Detail_ID in table FIN_Payment_ScheduleDetail
     * 
     */
    public static final String PROPERTY_PAYMENTDETAILS = "paymentDetails";

    /**
     * Property orderPaymentSchedule stored in column FIN_Payment_Schedule_Order in table FIN_Payment_ScheduleDetail
     * 
     */
    public static final String PROPERTY_ORDERPAYMENTSCHEDULE = "orderPaymentSchedule";

    /**
     * Property invoicePaymentSchedule stored in column FIN_Payment_Schedule_Invoice in table FIN_Payment_ScheduleDetail
     * 
     */
    public static final String PROPERTY_INVOICEPAYMENTSCHEDULE = "invoicePaymentSchedule";

    /**
     * Property amount stored in column Amount in table FIN_Payment_ScheduleDetail 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property active stored in column Isactive in table FIN_Payment_ScheduleDetail 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property canceled stored in column Iscanceled in table FIN_Payment_ScheduleDetail
     * 
     */
    public static final String PROPERTY_CANCELED = "canceled";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property activity stored in column C_Activity_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property product stored in column M_Product_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesRegion stored in column C_Salesregion_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property stDimension stored in column User1_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property doubtfulDebtAmount stored in column DoubtfulDebt_Amount in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal Doubtful Debt Amount}
     * 
     */
    public static final String PROPERTY_DOUBTFULDEBTAMOUNT = "doubtfulDebtAmount";

    /**
     * Property invoicePaid stored in column Isinvoicepaid in table FIN_Payment_ScheduleDetail<br>
     * Help: {@literal A flag indicating whether this document type is consider paid or not.}
     * 
     */
    public static final String PROPERTY_INVOICEPAID = "invoicePaid";






    /**
     * Property _computedColumns stored in column _computedColumns in table FIN_Payment_ScheduleDetail
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property fINPaymentPropDetailList stored in table FIN_Payment_ScheduleDetail
     * 
     */
    public static final String PROPERTY_FINPAYMENTPROPDETAILLIST = "fINPaymentPropDetailList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property dueDate<br>
     * 
     * Help: {@literal Date when the payment is due without deductions or discount}<br>
     * Computed from: <br>
     * {@code (select ps.duedate from FIN_Payment_ScheduleDetail psd, FIN_Payment_Schedule ps where
       ps.FIN_Payment_Schedule_ID = coalesce(psd.fin_payment_schedule_invoice,
       psd.fin_payment_schedule_order) and psd.FIN_Payment_ScheduleDetail_ID =
       fin_payment_scheduledetail_id)}
     */
    public static final String COMPUTED_COLUMN_DUEDATE = "dueDate";

    /**
     * Computed column for property aPRMFinancialAccount<br>
     * 
     * Help: {@literal Financial Account in sales invoice details}<br>
     * Computed from: <br>
     * {@code (select
          case p.amount
            when 0 then null
            else p.fin_financial_account_id
          end
        from
       fin_payment_detail pd
          join fin_payment p on p.fin_payment_id=pd.fin_payment_id
        where
       pd.fin_payment_detail_id=fin_payment_detail_id)}
     */
    public static final String COMPUTED_COLUMN_APRMFINANCIALACCOUNT = "aPRMFinancialAccount";

    /**
     * Computed column for property aPRMPaymentMethod<br>
     * 
     * Help: {@literal Payment Method in Sales Invoice}<br>
     * Computed from: <br>
     * {@code (select
          case p.amount
            when 0 then null
            else p.fin_paymentmethod_id
          end
        from
       fin_payment_detail pd
          join fin_payment p on p.fin_payment_id = pd.fin_payment_id
        where
       pd.fin_payment_detail_id = fin_payment_detail_id)}
     */
    public static final String COMPUTED_COLUMN_APRMPAYMENTMETHOD = "aPRMPaymentMethod";

    /**
     * Computed column for property expected<br>
     * <br>
     * Computed from: <br>
     * {@code (select ps.amount from FIN_Payment_ScheduleDetail psd, FIN_Payment_Schedule ps where
       ps.FIN_Payment_Schedule_ID = coalesce(psd.fin_payment_schedule_invoice,
       psd.fin_payment_schedule_order) and psd.FIN_Payment_ScheduleDetail_ID =
       fin_payment_scheduledetail_id)}
     */
    public static final String COMPUTED_COLUMN_EXPECTED = "expected";

    /**
     * Computed column for property invoiceAmount<br>
     * <br>
     * Computed from: <br>
     * {@code (select coalesce(c_invoice.grandtotal, c_order.grandtotal) from FIN_Payment_ScheduleDetail psd,
       FIN_Payment_Schedule ps left join c_invoice on c_invoice.c_invoice_id = ps.c_invoice_id left join
       c_order on c_order.c_order_id = ps.c_order_id where ps.FIN_Payment_Schedule_ID =
       coalesce(psd.fin_payment_schedule_invoice, psd.fin_payment_schedule_order) and
       psd.FIN_Payment_ScheduleDetail_ID = fin_payment_scheduledetail_id)}
     */
    public static final String COMPUTED_COLUMN_INVOICEAMOUNT = "invoiceAmount";

    public FIN_PaymentScheduleDetail() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_WRITEOFFAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CANCELED, false);
        setDefaultValue(PROPERTY_DOUBTFULDEBTAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_INVOICEPAID, false);
        setDefaultValue(PROPERTY_FINPAYMENTPROPDETAILLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_PAYMENTDETAILS
     * 
     */
    public FIN_PaymentDetail getPaymentDetails() {
        return (FIN_PaymentDetail) get(PROPERTY_PAYMENTDETAILS);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_PAYMENTDETAILS
     * 
     */
    public void setPaymentDetails(FIN_PaymentDetail paymentDetails) {
        set(PROPERTY_PAYMENTDETAILS, paymentDetails);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ORDERPAYMENTSCHEDULE
     * 
     */
    public FIN_PaymentSchedule getOrderPaymentSchedule() {
        return (FIN_PaymentSchedule) get(PROPERTY_ORDERPAYMENTSCHEDULE);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ORDERPAYMENTSCHEDULE
     * 
     */
    public void setOrderPaymentSchedule(FIN_PaymentSchedule orderPaymentSchedule) {
        set(PROPERTY_ORDERPAYMENTSCHEDULE, orderPaymentSchedule);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_INVOICEPAYMENTSCHEDULE
     * 
     */
    public FIN_PaymentSchedule getInvoicePaymentSchedule() {
        return (FIN_PaymentSchedule) get(PROPERTY_INVOICEPAYMENTSCHEDULE);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_INVOICEPAYMENTSCHEDULE
     * 
     */
    public void setInvoicePaymentSchedule(FIN_PaymentSchedule invoicePaymentSchedule) {
        set(PROPERTY_INVOICEPAYMENTSCHEDULE, invoicePaymentSchedule);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CANCELED
     * 
     */
    public Boolean isCanceled() {
        return (Boolean) get(PROPERTY_CANCELED);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_CANCELED
     * 
     */
    public void setCanceled(Boolean canceled) {
        set(PROPERTY_CANCELED, canceled);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_DOUBTFULDEBTAMOUNT
     * 
     */
    public BigDecimal getDoubtfulDebtAmount() {
        return (BigDecimal) get(PROPERTY_DOUBTFULDEBTAMOUNT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_DOUBTFULDEBTAMOUNT
     * 
     */
    public void setDoubtfulDebtAmount(BigDecimal doubtfulDebtAmount) {
        set(PROPERTY_DOUBTFULDEBTAMOUNT, doubtfulDebtAmount);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_INVOICEPAID
     * 
     */
    public Boolean isInvoicePaid() {
        return (Boolean) get(PROPERTY_INVOICEPAID);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY_INVOICEPAID
     * 
     */
    public void setInvoicePaid(Boolean invoicePaid) {
        set(PROPERTY_INVOICEPAID, invoicePaid);
    }

    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(COMPUTED_COLUMN_DUEDATE);
    }
    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(COMPUTED_COLUMN_DUEDATE, dueDate);
    }

    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_APRMFINANCIALACCOUNT
     * 
     */
    public FIN_FinancialAccount getAPRMFinancialAccount() {
        return (FIN_FinancialAccount) get(COMPUTED_COLUMN_APRMFINANCIALACCOUNT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_APRMFINANCIALACCOUNT
     * 
     */
    public void setAPRMFinancialAccount(FIN_FinancialAccount aPRMFinancialAccount) {
        set(COMPUTED_COLUMN_APRMFINANCIALACCOUNT, aPRMFinancialAccount);
    }

    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_APRMPAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getAPRMPaymentMethod() {
        return (FIN_PaymentMethod) get(COMPUTED_COLUMN_APRMPAYMENTMETHOD);
    }
    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_APRMPAYMENTMETHOD
     * 
     */
    public void setAPRMPaymentMethod(FIN_PaymentMethod aPRMPaymentMethod) {
        set(COMPUTED_COLUMN_APRMPAYMENTMETHOD, aPRMPaymentMethod);
    }

    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_EXPECTED
     * 
     */
    public BigDecimal getExpected() {
        return (BigDecimal) get(COMPUTED_COLUMN_EXPECTED);
    }
    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_EXPECTED
     * 
     */
    public void setExpected(BigDecimal expected) {
        set(COMPUTED_COLUMN_EXPECTED, expected);
    }

    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_INVOICEAMOUNT
     * 
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) get(COMPUTED_COLUMN_INVOICEAMOUNT);
    }
    /**
     * @see FIN_PaymentScheduleDetail#COMPUTED_COLUMN_INVOICEAMOUNT
     * 
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        set(COMPUTED_COLUMN_INVOICEAMOUNT, invoiceAmount);
    }

    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public FIN_PaymentScheduleDetail_ComputedColumns get_computedColumns() {
        return (FIN_PaymentScheduleDetail_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see FIN_PaymentScheduleDetail#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(FIN_PaymentScheduleDetail_ComputedColumns _computedColumns) {
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
      if (COMPUTED_COLUMN_DUEDATE.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getDueDate();
      }
      if (COMPUTED_COLUMN_APRMFINANCIALACCOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMFinancialAccount();
      }
      if (COMPUTED_COLUMN_APRMPAYMENTMETHOD.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getAPRMPaymentMethod();
      }
      if (COMPUTED_COLUMN_EXPECTED.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getExpected();
      }
      if (COMPUTED_COLUMN_INVOICEAMOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getInvoiceAmount();
      }

      return super.get(propName);
    }
}
