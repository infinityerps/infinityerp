
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.common.order.Order;
/**
 * Entity class for entity FIN_Payment_Sched_Inv_V (stored in table FIN_Payment_Sched_Inv_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentSchedInvV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Sched_Inv_V";
    public static final String ENTITY_NAME = "FIN_Payment_Sched_Inv_V";

    /**
     * Property id stored in column Fin_Payment_Sched_Inv_V_ID in table FIN_Payment_Sched_Inv_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Sched_Inv_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Sched_Inv_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Sched_Inv_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Sched_Inv_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Sched_Inv_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Sched_Inv_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Sched_Inv_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property invoice stored in column C_Invoice_ID in table FIN_Payment_Sched_Inv_V<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property salesOrder stored in column C_Order_ID in table FIN_Payment_Sched_Inv_V<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property dueDate stored in column Duedate in table FIN_Payment_Sched_Inv_V 
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property expectedDate stored in column Expecteddate in table FIN_Payment_Sched_Inv_V<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_EXPECTEDDATE = "expectedDate";

    /**
     * Property paymentMethod stored in column Fin_Paymentmethod_ID in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property expected stored in column Expected in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_EXPECTED = "expected";

    /**
     * Property received stored in column Received in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_RECEIVED = "received";

    /**
     * Property outstanding stored in column Outstanding in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_OUTSTANDING = "outstanding";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Payment_Sched_Inv_V<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property lastPayment stored in column Lastpayment in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_LASTPAYMENT = "lastPayment";

    /**
     * Property numberOfPayments stored in column Numberofpayments in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_NUMBEROFPAYMENTS = "numberOfPayments";

    /**
     * Property fINPaymentPriority stored in column FIN_Payment_Priority_ID in table FIN_Payment_Sched_Inv_V<br>
     * Help: {@literal Sets the priority of the payment plans generated when processing the invoice or order.
     *       The
     *       distribution algorithm will be driven by this priority. The pending payments for order or payments
     *       will be displayed ordered by the payment priority first and then by the due date.}
     * 
     */
    public static final String PROPERTY_FINPAYMENTPRIORITY = "fINPaymentPriority";

    /**
     * Property updatePaymentPlan stored in column Update_Payment_Plan in table FIN_Payment_Sched_Inv_V<br>
     * Help: {@literal Shows a popup where the user can modify some payment plan details.}
     * 
     */
    public static final String PROPERTY_UPDATEPAYMENTPLAN = "updatePaymentPlan";

    /**
     * Property obSelected stored in column OB_Selected in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_OBSELECTED = "obSelected";

    /**
     * Property daysOverdue stored in column Daysoverdue in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_DAYSOVERDUE = "daysOverdue";

    /**
     * Property awaitingExecutionAmount stored in column Awaiting_Execution in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_AWAITINGEXECUTIONAMOUNT = "awaitingExecutionAmount";

    /**
     * Property aPRMModifyPaymentInPlan stored in column EM_Aprm_Modif_Paym_Sched in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_APRMMODIFYPAYMENTINPLAN = "aPRMModifyPaymentInPlan";

    /**
     * Property aPRMModifyPaymentOutPlan stored in column EM_Aprm_Modif_Paym_Out_Sched in table FIN_Payment_Sched_Inv_V
     * 
     */
    public static final String PROPERTY_APRMMODIFYPAYMENTOUTPLAN = "aPRMModifyPaymentOutPlan";


    public FIN_PaymentSchedInvV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_EXPECTED, new BigDecimal(0));
        setDefaultValue(PROPERTY_RECEIVED, new BigDecimal(0));
        setDefaultValue(PROPERTY_UPDATEPAYMENTPLAN, false);
        setDefaultValue(PROPERTY_OBSELECTED, true);
        setDefaultValue(PROPERTY_APRMMODIFYPAYMENTINPLAN, true);
        setDefaultValue(PROPERTY_APRMMODIFYPAYMENTOUTPLAN, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_EXPECTEDDATE
     * 
     */
    public Date getExpectedDate() {
        return (Date) get(PROPERTY_EXPECTEDDATE);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_EXPECTEDDATE
     * 
     */
    public void setExpectedDate(Date expectedDate) {
        set(PROPERTY_EXPECTEDDATE, expectedDate);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_EXPECTED
     * 
     */
    public BigDecimal getExpected() {
        return (BigDecimal) get(PROPERTY_EXPECTED);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_EXPECTED
     * 
     */
    public void setExpected(BigDecimal expected) {
        set(PROPERTY_EXPECTED, expected);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_RECEIVED
     * 
     */
    public BigDecimal getReceived() {
        return (BigDecimal) get(PROPERTY_RECEIVED);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_RECEIVED
     * 
     */
    public void setReceived(BigDecimal received) {
        set(PROPERTY_RECEIVED, received);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_OUTSTANDING
     * 
     */
    public BigDecimal getOutstanding() {
        return (BigDecimal) get(PROPERTY_OUTSTANDING);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_OUTSTANDING
     * 
     */
    public void setOutstanding(BigDecimal outstanding) {
        set(PROPERTY_OUTSTANDING, outstanding);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_LASTPAYMENT
     * 
     */
    public Date getLastPayment() {
        return (Date) get(PROPERTY_LASTPAYMENT);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_LASTPAYMENT
     * 
     */
    public void setLastPayment(Date lastPayment) {
        set(PROPERTY_LASTPAYMENT, lastPayment);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_NUMBEROFPAYMENTS
     * 
     */
    public Long getNumberOfPayments() {
        return (Long) get(PROPERTY_NUMBEROFPAYMENTS);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_NUMBEROFPAYMENTS
     * 
     */
    public void setNumberOfPayments(Long numberOfPayments) {
        set(PROPERTY_NUMBEROFPAYMENTS, numberOfPayments);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public PaymentPriority getFINPaymentPriority() {
        return (PaymentPriority) get(PROPERTY_FINPAYMENTPRIORITY);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public void setFINPaymentPriority(PaymentPriority fINPaymentPriority) {
        set(PROPERTY_FINPAYMENTPRIORITY, fINPaymentPriority);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_UPDATEPAYMENTPLAN
     * 
     */
    public Boolean isUpdatePaymentPlan() {
        return (Boolean) get(PROPERTY_UPDATEPAYMENTPLAN);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_UPDATEPAYMENTPLAN
     * 
     */
    public void setUpdatePaymentPlan(Boolean updatePaymentPlan) {
        set(PROPERTY_UPDATEPAYMENTPLAN, updatePaymentPlan);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_OBSELECTED
     * 
     */
    public Boolean isObSelected() {
        return (Boolean) get(PROPERTY_OBSELECTED);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_OBSELECTED
     * 
     */
    public void setObSelected(Boolean obSelected) {
        set(PROPERTY_OBSELECTED, obSelected);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_DAYSOVERDUE
     * 
     */
    public Long getDaysOverdue() {
        return (Long) get(PROPERTY_DAYSOVERDUE);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_DAYSOVERDUE
     * 
     */
    public void setDaysOverdue(Long daysOverdue) {
        set(PROPERTY_DAYSOVERDUE, daysOverdue);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_AWAITINGEXECUTIONAMOUNT
     * 
     */
    public BigDecimal getAwaitingExecutionAmount() {
        return (BigDecimal) get(PROPERTY_AWAITINGEXECUTIONAMOUNT);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_AWAITINGEXECUTIONAMOUNT
     * 
     */
    public void setAwaitingExecutionAmount(BigDecimal awaitingExecutionAmount) {
        set(PROPERTY_AWAITINGEXECUTIONAMOUNT, awaitingExecutionAmount);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_APRMMODIFYPAYMENTINPLAN
     * 
     */
    public Boolean isAPRMModifyPaymentInPlan() {
        return (Boolean) get(PROPERTY_APRMMODIFYPAYMENTINPLAN);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_APRMMODIFYPAYMENTINPLAN
     * 
     */
    public void setAPRMModifyPaymentInPlan(Boolean aPRMModifyPaymentInPlan) {
        set(PROPERTY_APRMMODIFYPAYMENTINPLAN, aPRMModifyPaymentInPlan);
    }

    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_APRMMODIFYPAYMENTOUTPLAN
     * 
     */
    public Boolean isAPRMModifyPaymentOutPlan() {
        return (Boolean) get(PROPERTY_APRMMODIFYPAYMENTOUTPLAN);
    }
    /**
     * @see FIN_PaymentSchedInvV#PROPERTY_APRMMODIFYPAYMENTOUTPLAN
     * 
     */
    public void setAPRMModifyPaymentOutPlan(Boolean aPRMModifyPaymentOutPlan) {
        set(PROPERTY_APRMMODIFYPAYMENTOUTPLAN, aPRMModifyPaymentOutPlan);
    }

}
