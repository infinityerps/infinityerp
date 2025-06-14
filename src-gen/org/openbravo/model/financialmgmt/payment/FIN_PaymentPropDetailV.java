
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
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FIN_Payment_Prop_Detail_V (stored in table FIN_Payment_Prop_Detail_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentPropDetailV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Prop_Detail_V";
    public static final String ENTITY_NAME = "FIN_Payment_Prop_Detail_V";

    /**
     * Property id stored in column FIN_Payment_Prop_Detail_V_ID in table FIN_Payment_Prop_Detail_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Prop_Detail_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Prop_Detail_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Prop_Detail_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Prop_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Prop_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Prop_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Prop_Detail_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property paymentScheduleDetail stored in column FIN_Payment_Scheduledetail_ID in table FIN_Payment_Prop_Detail_V
     * 
     */
    public static final String PROPERTY_PAYMENTSCHEDULEDETAIL = "paymentScheduleDetail";

    /**
     * Property paymentProposal stored in column FIN_Payment_Proposal_ID in table FIN_Payment_Prop_Detail_V
     * 
     */
    public static final String PROPERTY_PAYMENTPROPOSAL = "paymentProposal";

    /**
     * Property invoiceNo stored in column Invoiceno in table FIN_Payment_Prop_Detail_V
     * 
     */
    public static final String PROPERTY_INVOICENO = "invoiceNo";

    /**
     * Property orderNo stored in column Orderno in table FIN_Payment_Prop_Detail_V
     * 
     */
    public static final String PROPERTY_ORDERNO = "orderNo";

    /**
     * Property paymentNo stored in column Paymentno in table FIN_Payment_Prop_Detail_V
     * 
     */
    public static final String PROPERTY_PAYMENTNO = "paymentNo";

    /**
     * Property payment stored in column FIN_Payment_ID in table FIN_Payment_Prop_Detail_V<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property dueDate stored in column Duedate in table FIN_Payment_Prop_Detail_V<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property expectedDate stored in column ExpectedDate in table FIN_Payment_Prop_Detail_V<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_EXPECTEDDATE = "expectedDate";

    /**
     * Property invoiceAmount stored in column Invoicedamt in table FIN_Payment_Prop_Detail_V<br>
     * Help: {@literal The amount invoiced}
     * 
     */
    public static final String PROPERTY_INVOICEAMOUNT = "invoiceAmount";

    /**
     * Property expected stored in column Expected in table FIN_Payment_Prop_Detail_V
     * 
     */
    public static final String PROPERTY_EXPECTED = "expected";

    /**
     * Property paidAmount stored in column Paidamt in table FIN_Payment_Prop_Detail_V 
     * 
     */
    public static final String PROPERTY_PAIDAMOUNT = "paidAmount";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Payment_Prop_Detail_V<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Payment_Prop_Detail_V<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";


    public FIN_PaymentPropDetailV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENTSCHEDULEDETAIL
     * 
     */
    public FIN_PaymentScheduleDetail getPaymentScheduleDetail() {
        return (FIN_PaymentScheduleDetail) get(PROPERTY_PAYMENTSCHEDULEDETAIL);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENTSCHEDULEDETAIL
     * 
     */
    public void setPaymentScheduleDetail(FIN_PaymentScheduleDetail paymentScheduleDetail) {
        set(PROPERTY_PAYMENTSCHEDULEDETAIL, paymentScheduleDetail);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENTPROPOSAL
     * 
     */
    public FIN_PaymentProposal getPaymentProposal() {
        return (FIN_PaymentProposal) get(PROPERTY_PAYMENTPROPOSAL);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENTPROPOSAL
     * 
     */
    public void setPaymentProposal(FIN_PaymentProposal paymentProposal) {
        set(PROPERTY_PAYMENTPROPOSAL, paymentProposal);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_INVOICENO
     * 
     */
    public String getInvoiceNo() {
        return (String) get(PROPERTY_INVOICENO);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_INVOICENO
     * 
     */
    public void setInvoiceNo(String invoiceNo) {
        set(PROPERTY_INVOICENO, invoiceNo);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ORDERNO
     * 
     */
    public String getOrderNo() {
        return (String) get(PROPERTY_ORDERNO);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_ORDERNO
     * 
     */
    public void setOrderNo(String orderNo) {
        set(PROPERTY_ORDERNO, orderNo);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENTNO
     * 
     */
    public String getPaymentNo() {
        return (String) get(PROPERTY_PAYMENTNO);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENTNO
     * 
     */
    public void setPaymentNo(String paymentNo) {
        set(PROPERTY_PAYMENTNO, paymentNo);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_EXPECTEDDATE
     * 
     */
    public Date getExpectedDate() {
        return (Date) get(PROPERTY_EXPECTEDDATE);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_EXPECTEDDATE
     * 
     */
    public void setExpectedDate(Date expectedDate) {
        set(PROPERTY_EXPECTEDDATE, expectedDate);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_INVOICEAMOUNT
     * 
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) get(PROPERTY_INVOICEAMOUNT);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_INVOICEAMOUNT
     * 
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        set(PROPERTY_INVOICEAMOUNT, invoiceAmount);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_EXPECTED
     * 
     */
    public BigDecimal getExpected() {
        return (BigDecimal) get(PROPERTY_EXPECTED);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_EXPECTED
     * 
     */
    public void setExpected(BigDecimal expected) {
        set(PROPERTY_EXPECTED, expected);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAIDAMOUNT
     * 
     */
    public BigDecimal getPaidAmount() {
        return (BigDecimal) get(PROPERTY_PAIDAMOUNT);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_PAIDAMOUNT
     * 
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        set(PROPERTY_PAIDAMOUNT, paidAmount);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_PaymentPropDetailV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

}
