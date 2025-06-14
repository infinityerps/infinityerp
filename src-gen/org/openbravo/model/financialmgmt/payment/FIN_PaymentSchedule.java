
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.common.order.Order;
/**
 * Entity class for entity FIN_Payment_Schedule (stored in table FIN_Payment_Schedule).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentSchedule extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Schedule";
    public static final String ENTITY_NAME = "FIN_Payment_Schedule";

    /**
     * Property id stored in column Fin_Payment_Schedule_ID in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Schedule 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Schedule 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Schedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Schedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Schedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Schedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property invoice stored in column C_Invoice_ID in table FIN_Payment_Schedule<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property order stored in column C_Order_ID in table FIN_Payment_Schedule<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_ORDER = "order";

    /**
     * Property dueDate stored in column Duedate in table FIN_Payment_Schedule 
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property finPaymentmethod stored in column Fin_Paymentmethod_ID in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_FINPAYMENTMETHOD = "finPaymentmethod";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Payment_Schedule<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property amount stored in column Amount in table FIN_Payment_Schedule 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property paidAmount stored in column Paidamt in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_PAIDAMOUNT = "paidAmount";

    /**
     * Property outstandingAmount stored in column Outstandingamt in table FIN_Payment_Schedule<br>
     * Help: {@literal Outstanding Amount. Amount pending to be paid}
     * 
     */
    public static final String PROPERTY_OUTSTANDINGAMOUNT = "outstandingAmount";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Schedule 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property fINPaymentPriority stored in column FIN_Payment_Priority_ID in table FIN_Payment_Schedule<br>
     * Help: {@literal Sets the priority of the payment plans generated when processing the invoice or order.
     *       The
     *       distribution algorithm will be driven by this priority. The pending payments for order or payments
     *       will be displayed ordered by the payment priority first and then by the due date.}
     * 
     */
    public static final String PROPERTY_FINPAYMENTPRIORITY = "fINPaymentPriority";

    /**
     * Property updatePaymentPlan stored in column Update_Payment_Plan in table FIN_Payment_Schedule<br>
     * Help: {@literal Shows a popup where the user can modify some payment plan details.}
     * 
     */
    public static final String PROPERTY_UPDATEPAYMENTPLAN = "updatePaymentPlan";

    /**
     * Property origDueDate stored in column OrigDueDate in table FIN_Payment_Schedule<br>
     * Help: {@literal Due date for the payment plan as per contract}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_ORIGDUEDATE = "origDueDate";

    /**
     * Property description stored in column Description in table FIN_Payment_Schedule<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property aprmModifPaymentINPlan stored in column EM_Aprm_Modif_Paym_Sched in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_APRMMODIFPAYMENTINPLAN = "aprmModifPaymentINPlan";

    /**
     * Property aprmModifPaymentOUTPlan stored in column EM_Aprm_Modif_Paym_Out_Sched in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_APRMMODIFPAYMENTOUTPLAN = "aprmModifPaymentOUTPlan";

    /**
     * Property expectedDate stored in column ExpectedDate in table FIN_Payment_Schedule<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_EXPECTEDDATE = "expectedDate";





    /**
     * Property _computedColumns stored in column _computedColumns in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property fINDoubtfulDebtList stored in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_FINDOUBTFULDEBTLIST = "fINDoubtfulDebtList";

    /**
     * Property fINPaymentScheduleDetailOrderPaymentScheduleList stored in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULEDETAILORDERPAYMENTSCHEDULELIST = "fINPaymentScheduleDetailOrderPaymentScheduleList";

    /**
     * Property fINPaymentScheduleDetailInvoicePaymentScheduleList stored in table FIN_Payment_Schedule
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULEDETAILINVOICEPAYMENTSCHEDULELIST = "fINPaymentScheduleDetailInvoicePaymentScheduleList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property daysOverdue<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT CASE WHEN to_number(trunc((case when max(ps.outstandingamt) = 0 then max(p.paymentdate) else
       now() end)) -trunc(min(ps.expecteddate))) > 0 THEN to_number(trunc((case when max(ps.outstandingamt)
       = 0 then max(p.paymentdate) else now() end)) -trunc(min(ps.expecteddate)))ELSE 0 END AS "case" FROM
       fin_payment_schedule ps LEFT JOIN fin_payment_scheduledetail psd ON ps.fin_payment_schedule_id = 
       psd.fin_payment_schedule_invoice LEFT JOIN fin_payment_detail pd ON pd.fin_payment_detail_id =
       psd.fin_payment_detail_id LEFT JOIN fin_payment p ON p.fin_payment_id = pd.fin_payment_id WHERE
       ps.fin_payment_schedule_id = fin_payment_schedule_id)}
     */
    public static final String COMPUTED_COLUMN_DAYSOVERDUE = "daysOverdue";

    /**
     * Computed column for property lastPaymentDate<br>
     * <br>
     * Computed from: <br>
     * {@code SELECT max(p.paymentdate) FROM fin_payment p, fin_payment_detail pd, fin_payment_scheduledetail psd,
       fin_payment_schedule ps WHERE p.fin_payment_id = pd.fin_payment_id AND   pd.fin_payment_detail_id =
       psd.fin_payment_detail_id AND   psd.fin_payment_schedule_invoice = ps.fin_payment_schedule_id AND  
       ps.c_invoice_id IS NOT NULL AND   ps.fin_payment_schedule_id = fin_payment_schedule_id}
     */
    public static final String COMPUTED_COLUMN_LASTPAYMENTDATE = "lastPaymentDate";

    /**
     * Computed column for property numberOfPayments<br>
     * <br>
     * Computed from: <br>
     * {@code (SELECT count(distinct pd.fin_payment_id) FROM fin_payment_detail pd, fin_payment_scheduledetail
       psd, fin_payment_schedule ps WHERE pd.fin_payment_detail_id = psd.fin_payment_detail_id AND
       psd.fin_payment_schedule_invoice = ps.fin_payment_schedule_id AND ps.c_invoice_id IS NOT NULL  AND
       ps.fin_payment_schedule_id = fin_payment_schedule_id)}
     */
    public static final String COMPUTED_COLUMN_NUMBEROFPAYMENTS = "numberOfPayments";

    /**
     * Computed column for property totalDebtAmount<br>
     * 
     * Help: {@literal Doubtful Debt Amount}<br>
     * Computed from: <br>
     * {@code SELECT coalesce(sum(psd.doubtfuldebt_amount),0) FROM fin_payment_scheduledetail psd left join
       fin_payment_detail pd on psd.fin_payment_detail_id = pd.fin_payment_detail_id left join fin_payment
       p on pd.fin_payment_id = p.fin_payment_id WHERE psd.fin_payment_schedule_invoice =
       fin_payment_schedule_id and psd.isinvoicepaid = 'N'}
     */
    public static final String COMPUTED_COLUMN_TOTALDEBTAMOUNT = "totalDebtAmount";

    public FIN_PaymentSchedule() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_PAIDAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_OUTSTANDINGAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_UPDATEPAYMENTPLAN, true);
        setDefaultValue(PROPERTY_APRMMODIFPAYMENTINPLAN, false);
        setDefaultValue(PROPERTY_APRMMODIFPAYMENTOUTPLAN, false);
        setDefaultValue(PROPERTY_FINDOUBTFULDEBTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDULEDETAILORDERPAYMENTSCHEDULELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDULEDETAILINVOICEPAYMENTSCHEDULELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_ORDER
     * 
     */
    public Order getOrder() {
        return (Order) get(PROPERTY_ORDER);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_ORDER
     * 
     */
    public void setOrder(Order order) {
        set(PROPERTY_ORDER, order);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_FINPAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getFinPaymentmethod() {
        return (FIN_PaymentMethod) get(PROPERTY_FINPAYMENTMETHOD);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_FINPAYMENTMETHOD
     * 
     */
    public void setFinPaymentmethod(FIN_PaymentMethod finPaymentmethod) {
        set(PROPERTY_FINPAYMENTMETHOD, finPaymentmethod);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_PAIDAMOUNT
     * 
     */
    public BigDecimal getPaidAmount() {
        return (BigDecimal) get(PROPERTY_PAIDAMOUNT);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_PAIDAMOUNT
     * 
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        set(PROPERTY_PAIDAMOUNT, paidAmount);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_OUTSTANDINGAMOUNT
     * 
     */
    public BigDecimal getOutstandingAmount() {
        return (BigDecimal) get(PROPERTY_OUTSTANDINGAMOUNT);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_OUTSTANDINGAMOUNT
     * 
     */
    public void setOutstandingAmount(BigDecimal outstandingAmount) {
        set(PROPERTY_OUTSTANDINGAMOUNT, outstandingAmount);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public PaymentPriority getFINPaymentPriority() {
        return (PaymentPriority) get(PROPERTY_FINPAYMENTPRIORITY);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public void setFINPaymentPriority(PaymentPriority fINPaymentPriority) {
        set(PROPERTY_FINPAYMENTPRIORITY, fINPaymentPriority);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_UPDATEPAYMENTPLAN
     * 
     */
    public Boolean isUpdatePaymentPlan() {
        return (Boolean) get(PROPERTY_UPDATEPAYMENTPLAN);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_UPDATEPAYMENTPLAN
     * 
     */
    public void setUpdatePaymentPlan(Boolean updatePaymentPlan) {
        set(PROPERTY_UPDATEPAYMENTPLAN, updatePaymentPlan);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_ORIGDUEDATE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Date getOrigDueDate() {
        return (Date) get(PROPERTY_ORIGDUEDATE);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_ORIGDUEDATE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setOrigDueDate(Date origDueDate) {
        set(PROPERTY_ORIGDUEDATE, origDueDate);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_APRMMODIFPAYMENTINPLAN
     * 
     */
    public Boolean isAprmModifPaymentINPlan() {
        return (Boolean) get(PROPERTY_APRMMODIFPAYMENTINPLAN);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_APRMMODIFPAYMENTINPLAN
     * 
     */
    public void setAprmModifPaymentINPlan(Boolean aprmModifPaymentINPlan) {
        set(PROPERTY_APRMMODIFPAYMENTINPLAN, aprmModifPaymentINPlan);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_APRMMODIFPAYMENTOUTPLAN
     * 
     */
    public Boolean isAprmModifPaymentOUTPlan() {
        return (Boolean) get(PROPERTY_APRMMODIFPAYMENTOUTPLAN);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_APRMMODIFPAYMENTOUTPLAN
     * 
     */
    public void setAprmModifPaymentOUTPlan(Boolean aprmModifPaymentOUTPlan) {
        set(PROPERTY_APRMMODIFPAYMENTOUTPLAN, aprmModifPaymentOUTPlan);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY_EXPECTEDDATE
     * 
     */
    public Date getExpectedDate() {
        return (Date) get(PROPERTY_EXPECTEDDATE);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY_EXPECTEDDATE
     * 
     */
    public void setExpectedDate(Date expectedDate) {
        set(PROPERTY_EXPECTEDDATE, expectedDate);
    }

    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_DAYSOVERDUE
     * 
     */
    public Long getDaysOverdue() {
        return (Long) get(COMPUTED_COLUMN_DAYSOVERDUE);
    }
    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_DAYSOVERDUE
     * 
     */
    public void setDaysOverdue(Long daysOverdue) {
        set(COMPUTED_COLUMN_DAYSOVERDUE, daysOverdue);
    }

    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_LASTPAYMENTDATE
     * 
     */
    public Date getLastPaymentDate() {
        return (Date) get(COMPUTED_COLUMN_LASTPAYMENTDATE);
    }
    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_LASTPAYMENTDATE
     * 
     */
    public void setLastPaymentDate(Date lastPaymentDate) {
        set(COMPUTED_COLUMN_LASTPAYMENTDATE, lastPaymentDate);
    }

    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_NUMBEROFPAYMENTS
     * 
     */
    public Long getNumberOfPayments() {
        return (Long) get(COMPUTED_COLUMN_NUMBEROFPAYMENTS);
    }
    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_NUMBEROFPAYMENTS
     * 
     */
    public void setNumberOfPayments(Long numberOfPayments) {
        set(COMPUTED_COLUMN_NUMBEROFPAYMENTS, numberOfPayments);
    }

    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_TOTALDEBTAMOUNT
     * 
     */
    public BigDecimal getTotalDebtAmount() {
        return (BigDecimal) get(COMPUTED_COLUMN_TOTALDEBTAMOUNT);
    }
    /**
     * @see FIN_PaymentSchedule#COMPUTED_COLUMN_TOTALDEBTAMOUNT
     * 
     */
    public void setTotalDebtAmount(BigDecimal totalDebtAmount) {
        set(COMPUTED_COLUMN_TOTALDEBTAMOUNT, totalDebtAmount);
    }

    /**
     * @see FIN_PaymentSchedule#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public FIN_PaymentSchedule_ComputedColumns get_computedColumns() {
        return (FIN_PaymentSchedule_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see FIN_PaymentSchedule#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(FIN_PaymentSchedule_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * Help: {@literal The reasons for potential non payment can include disputes over supply, delivery, at the
     *       conditioner of item or the appearance of financial stress within a customer's operations. When such
     *       a dispute occurs it is prudent to add this debt or portion thereof to the doubtful debt reserve.}<br>
     * @see DoubtfulDebt
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DoubtfulDebt> getFINDoubtfulDebtList() {
      return (List<DoubtfulDebt>) get(PROPERTY_FINDOUBTFULDEBTLIST);
    }

    /**
     * Help: {@literal The reasons for potential non payment can include disputes over supply, delivery, at the
     *       conditioner of item or the appearance of financial stress within a customer's operations. When such
     *       a dispute occurs it is prudent to add this debt or portion thereof to the doubtful debt reserve.}<br>
     * @see DoubtfulDebt
     * 
     */
    public void setFINDoubtfulDebtList(List<DoubtfulDebt> fINDoubtfulDebtList) {
        set(PROPERTY_FINDOUBTFULDEBTLIST, fINDoubtfulDebtList);
    }

    /**
     * @see FIN_PaymentScheduleDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentScheduleDetail> getFINPaymentScheduleDetailOrderPaymentScheduleList() {
      return (List<FIN_PaymentScheduleDetail>) get(PROPERTY_FINPAYMENTSCHEDULEDETAILORDERPAYMENTSCHEDULELIST);
    }

    /**
     * @see FIN_PaymentScheduleDetail
     * 
     */
    public void setFINPaymentScheduleDetailOrderPaymentScheduleList(List<FIN_PaymentScheduleDetail> fINPaymentScheduleDetailOrderPaymentScheduleList) {
        set(PROPERTY_FINPAYMENTSCHEDULEDETAILORDERPAYMENTSCHEDULELIST, fINPaymentScheduleDetailOrderPaymentScheduleList);
    }

    /**
     * @see FIN_PaymentScheduleDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentScheduleDetail> getFINPaymentScheduleDetailInvoicePaymentScheduleList() {
      return (List<FIN_PaymentScheduleDetail>) get(PROPERTY_FINPAYMENTSCHEDULEDETAILINVOICEPAYMENTSCHEDULELIST);
    }

    /**
     * @see FIN_PaymentScheduleDetail
     * 
     */
    public void setFINPaymentScheduleDetailInvoicePaymentScheduleList(List<FIN_PaymentScheduleDetail> fINPaymentScheduleDetailInvoicePaymentScheduleList) {
        set(PROPERTY_FINPAYMENTSCHEDULEDETAILINVOICEPAYMENTSCHEDULELIST, fINPaymentScheduleDetailInvoicePaymentScheduleList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_DAYSOVERDUE.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getDaysOverdue();
      }
      if (COMPUTED_COLUMN_LASTPAYMENTDATE.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getLastPaymentDate();
      }
      if (COMPUTED_COLUMN_NUMBEROFPAYMENTS.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getNumberOfPayments();
      }
      if (COMPUTED_COLUMN_TOTALDEBTAMOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getTotalDebtAmount();
      }

      return super.get(propName);
    }
}
