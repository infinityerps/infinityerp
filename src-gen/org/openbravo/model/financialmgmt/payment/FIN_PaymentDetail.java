
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.InvoiceTaxCashVAT;
import org.openbravo.model.financialmgmt.gl.GLItem;
/**
 * Entity class for entity FIN_Payment_Detail (stored in table FIN_Payment_Detail).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentDetail extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Detail";
    public static final String ENTITY_NAME = "FIN_Payment_Detail";

    /**
     * Property id stored in column Fin_Payment_Detail_ID in table FIN_Payment_Detail
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Detail 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Detail 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property finPayment stored in column Fin_Payment_ID in table FIN_Payment_Detail<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_FINPAYMENT = "finPayment";

    /**
     * Property amount stored in column Amount in table FIN_Payment_Detail
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property refund stored in column Refund in table FIN_Payment_Detail
     * 
     */
    public static final String PROPERTY_REFUND = "refund";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Detail 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Payment_Detail<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property gLItem stored in column C_Glitem_ID in table FIN_Payment_Detail<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property isprepayment stored in column Isprepayment in table FIN_Payment_Detail<br>
     * Help: {@literal When the payment is created against order it is considered to be a prepayment}
     * 
     */
    public static final String PROPERTY_ISPREPAYMENT = "isprepayment";

    /**
     * Property isPaidAtInvoicing stored in column IsPaidAtInvoicing in table FIN_Payment_Detail<br>
     * Help: {@literal If checked represents that this payment detail has been created at invoicing. It is
     *       usually checked in the POS when the business partners pays exactly when the invoice is being
     *       created. The flag is mainly used by the Cash VAT engine.}
     * 
     */
    public static final String PROPERTY_ISPAIDATINVOICING = "isPaidAtInvoicing";

    /**
     * Property lineNo stored in column Line_No in table FIN_Payment_Detail
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property fINPaymentScheduleDetailList stored in table FIN_Payment_Detail
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULEDETAILLIST = "fINPaymentScheduleDetailList";

    /**
     * Property invoiceTaxCashVATList stored in table FIN_Payment_Detail
     * 
     */
    public static final String PROPERTY_INVOICETAXCASHVATLIST = "invoiceTaxCashVATList";


    public FIN_PaymentDetail() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_REFUND, true);
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_WRITEOFFAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_ISPREPAYMENT, false);
        setDefaultValue(PROPERTY_ISPAIDATINVOICING, false);
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDULEDETAILLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICETAXCASHVATLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_FINPAYMENT
     * 
     */
    public FIN_Payment getFinPayment() {
        return (FIN_Payment) get(PROPERTY_FINPAYMENT);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_FINPAYMENT
     * 
     */
    public void setFinPayment(FIN_Payment finPayment) {
        set(PROPERTY_FINPAYMENT, finPayment);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_REFUND
     * 
     */
    public Boolean isRefund() {
        return (Boolean) get(PROPERTY_REFUND);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_REFUND
     * 
     */
    public void setRefund(Boolean refund) {
        set(PROPERTY_REFUND, refund);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_ISPREPAYMENT
     * 
     */
    public Boolean isPrepayment() {
        return (Boolean) get(PROPERTY_ISPREPAYMENT);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_ISPREPAYMENT
     * 
     */
    public void setPrepayment(Boolean isprepayment) {
        set(PROPERTY_ISPREPAYMENT, isprepayment);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_ISPAIDATINVOICING
     * 
     */
    public Boolean isPaidAtInvoicing() {
        return (Boolean) get(PROPERTY_ISPAIDATINVOICING);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_ISPAIDATINVOICING
     * 
     */
    public void setPaidAtInvoicing(Boolean isPaidAtInvoicing) {
        set(PROPERTY_ISPAIDATINVOICING, isPaidAtInvoicing);
    }

    /**
     * @see FIN_PaymentDetail#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see FIN_PaymentDetail#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see FIN_PaymentScheduleDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentScheduleDetail> getFINPaymentScheduleDetailList() {
      return (List<FIN_PaymentScheduleDetail>) get(PROPERTY_FINPAYMENTSCHEDULEDETAILLIST);
    }

    /**
     * @see FIN_PaymentScheduleDetail
     * 
     */
    public void setFINPaymentScheduleDetailList(List<FIN_PaymentScheduleDetail> fINPaymentScheduleDetailList) {
        set(PROPERTY_FINPAYMENTSCHEDULEDETAILLIST, fINPaymentScheduleDetailList);
    }

    /**
     * Help: {@literal Cash VAT management for invoices}<br>
     * @see InvoiceTaxCashVAT
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceTaxCashVAT> getInvoiceTaxCashVATList() {
      return (List<InvoiceTaxCashVAT>) get(PROPERTY_INVOICETAXCASHVATLIST);
    }

    /**
     * Help: {@literal Cash VAT management for invoices}<br>
     * @see InvoiceTaxCashVAT
     * 
     */
    public void setInvoiceTaxCashVATList(List<InvoiceTaxCashVAT> invoiceTaxCashVATList) {
        set(PROPERTY_INVOICETAXCASHVATLIST, invoiceTaxCashVATList);
    }

}
