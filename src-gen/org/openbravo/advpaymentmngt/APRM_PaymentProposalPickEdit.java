
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
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentProposal;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentScheduleDetail;
import org.openbravo.model.financialmgmt.payment.PaymentPriority;
/**
 * Entity class for entity APRM_PaymentProposalPickEdit (stored in table APRM_Payment_Prop_Pick_Edit).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class APRM_PaymentProposalPickEdit extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "APRM_Payment_Prop_Pick_Edit";
    public static final String ENTITY_NAME = "APRM_PaymentProposalPickEdit";

    /**
     * Property id stored in column Aprm_Payment_Prop_Pick_Edit_ID in table APRM_Payment_Prop_Pick_Edit 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table APRM_Payment_Prop_Pick_Edit 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table APRM_Payment_Prop_Pick_Edit 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table APRM_Payment_Prop_Pick_Edit 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table APRM_Payment_Prop_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property updated stored in column Updated in table APRM_Payment_Prop_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property createdBy stored in column Createdby in table APRM_Payment_Prop_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updatedBy stored in column Updatedby in table APRM_Payment_Prop_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property paymentScheduleDetail stored in column FIN_Payment_Scheduledetail_ID in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_PAYMENTSCHEDULEDETAIL = "paymentScheduleDetail";

    /**
     * Property paymentProposal stored in column FIN_Payment_Proposal_ID in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_PAYMENTPROPOSAL = "paymentProposal";

    /**
     * Property orderDocumentno stored in column Order_Documentno in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_ORDERDOCUMENTNO = "orderDocumentno";

    /**
     * Property invoiceDocumentno stored in column Invoice_Documentno in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_INVOICEDOCUMENTNO = "invoiceDocumentno";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property supplierReference stored in column Supplier_Reference in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal This can be used to input a reference for this specific transaction. For example, a
     *       Purchase Order number can be input on a Sales Order for easier reference.}
     * 
     */
    public static final String PROPERTY_SUPPLIERREFERENCE = "supplierReference";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property dueDate stored in column Duedate in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property expectedDate stored in column ExpectedDate in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_EXPECTEDDATE = "expectedDate";

    /**
     * Property invoiced stored in column Invoiced in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_INVOICED = "invoiced";

    /**
     * Property expectedAmount stored in column Expected in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_EXPECTEDAMOUNT = "expectedAmount";

    /**
     * Property outstanding stored in column Outstanding in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_OUTSTANDING = "outstanding";

    /**
     * Property payment stored in column Payment in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property difference stored in column Difference in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_DIFFERENCE = "difference";

    /**
     * Property writeoff stored in column Writeoff in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFF = "writeoff";

    /**
     * Property obSelected stored in column OB_Selected in table APRM_Payment_Prop_Pick_Edit
     * 
     */
    public static final String PROPERTY_OBSELECTED = "obSelected";

    /**
     * Property paymentPriority stored in column FIN_Payment_Priority_ID in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal Sets the priority of the payment plans generated when processing the invoice or order.
     *       The
     *       distribution algorithm will be driven by this priority. The pending payments for order or payments
     *       will be displayed ordered by the payment priority first and then by the due date.}
     * 
     */
    public static final String PROPERTY_PAYMENTPRIORITY = "paymentPriority";

    /**
     * Property currency stored in column C_Currency_ID in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property salesTransaction stored in column Issotrx in table APRM_Payment_Prop_Pick_Edit<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";


    public APRM_PaymentProposalPickEdit() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_WRITEOFF, false);
        setDefaultValue(PROPERTY_OBSELECTED, false);
        setDefaultValue(PROPERTY_SALESTRANSACTION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTSCHEDULEDETAIL
     * 
     */
    public FIN_PaymentScheduleDetail getPaymentScheduleDetail() {
        return (FIN_PaymentScheduleDetail) get(PROPERTY_PAYMENTSCHEDULEDETAIL);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTSCHEDULEDETAIL
     * 
     */
    public void setPaymentScheduleDetail(FIN_PaymentScheduleDetail paymentScheduleDetail) {
        set(PROPERTY_PAYMENTSCHEDULEDETAIL, paymentScheduleDetail);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTPROPOSAL
     * 
     */
    public FIN_PaymentProposal getPaymentProposal() {
        return (FIN_PaymentProposal) get(PROPERTY_PAYMENTPROPOSAL);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTPROPOSAL
     * 
     */
    public void setPaymentProposal(FIN_PaymentProposal paymentProposal) {
        set(PROPERTY_PAYMENTPROPOSAL, paymentProposal);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ORDERDOCUMENTNO
     * 
     */
    public String getOrderDocumentno() {
        return (String) get(PROPERTY_ORDERDOCUMENTNO);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_ORDERDOCUMENTNO
     * 
     */
    public void setOrderDocumentno(String orderDocumentno) {
        set(PROPERTY_ORDERDOCUMENTNO, orderDocumentno);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_INVOICEDOCUMENTNO
     * 
     */
    public String getInvoiceDocumentno() {
        return (String) get(PROPERTY_INVOICEDOCUMENTNO);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_INVOICEDOCUMENTNO
     * 
     */
    public void setInvoiceDocumentno(String invoiceDocumentno) {
        set(PROPERTY_INVOICEDOCUMENTNO, invoiceDocumentno);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_SUPPLIERREFERENCE
     * 
     */
    public String getSupplierReference() {
        return (String) get(PROPERTY_SUPPLIERREFERENCE);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_SUPPLIERREFERENCE
     * 
     */
    public void setSupplierReference(String supplierReference) {
        set(PROPERTY_SUPPLIERREFERENCE, supplierReference);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_EXPECTEDDATE
     * 
     */
    public Date getExpectedDate() {
        return (Date) get(PROPERTY_EXPECTEDDATE);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_EXPECTEDDATE
     * 
     */
    public void setExpectedDate(Date expectedDate) {
        set(PROPERTY_EXPECTEDDATE, expectedDate);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_INVOICED
     * 
     */
    public BigDecimal getInvoiced() {
        return (BigDecimal) get(PROPERTY_INVOICED);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_INVOICED
     * 
     */
    public void setInvoiced(BigDecimal invoiced) {
        set(PROPERTY_INVOICED, invoiced);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_EXPECTEDAMOUNT
     * 
     */
    public BigDecimal getExpectedAmount() {
        return (BigDecimal) get(PROPERTY_EXPECTEDAMOUNT);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_EXPECTEDAMOUNT
     * 
     */
    public void setExpectedAmount(BigDecimal expectedAmount) {
        set(PROPERTY_EXPECTEDAMOUNT, expectedAmount);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_OUTSTANDING
     * 
     */
    public BigDecimal getOutstanding() {
        return (BigDecimal) get(PROPERTY_OUTSTANDING);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_OUTSTANDING
     * 
     */
    public void setOutstanding(BigDecimal outstanding) {
        set(PROPERTY_OUTSTANDING, outstanding);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENT
     * 
     */
    public BigDecimal getPayment() {
        return (BigDecimal) get(PROPERTY_PAYMENT);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(BigDecimal payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_DIFFERENCE
     * 
     */
    public BigDecimal getDifference() {
        return (BigDecimal) get(PROPERTY_DIFFERENCE);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_DIFFERENCE
     * 
     */
    public void setDifference(BigDecimal difference) {
        set(PROPERTY_DIFFERENCE, difference);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_WRITEOFF
     * 
     */
    public Boolean isWriteoff() {
        return (Boolean) get(PROPERTY_WRITEOFF);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_WRITEOFF
     * 
     */
    public void setWriteoff(Boolean writeoff) {
        set(PROPERTY_WRITEOFF, writeoff);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public Boolean isObSelected() {
        return (Boolean) get(PROPERTY_OBSELECTED);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public void setObSelected(Boolean obSelected) {
        set(PROPERTY_OBSELECTED, obSelected);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTPRIORITY
     * 
     */
    public PaymentPriority getPaymentPriority() {
        return (PaymentPriority) get(PROPERTY_PAYMENTPRIORITY);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_PAYMENTPRIORITY
     * 
     */
    public void setPaymentPriority(PaymentPriority paymentPriority) {
        set(PROPERTY_PAYMENTPRIORITY, paymentPriority);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see APRM_PaymentProposalPickEdit#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

}
