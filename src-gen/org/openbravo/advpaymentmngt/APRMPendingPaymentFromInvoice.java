
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
import org.openbravo.model.financialmgmt.payment.PaymentExecutionProcess;
/**
 * Entity class for entity APRM_PendingPaymentInvoice (stored in table APRM_Pending_PaymentInvoice).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class APRMPendingPaymentFromInvoice extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "APRM_Pending_PaymentInvoice";
    public static final String ENTITY_NAME = "APRM_PendingPaymentInvoice";

    /**
     * Property id stored in column Aprm_Pending_Paymentinvoice_ID in table APRM_Pending_PaymentInvoice 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table APRM_Pending_PaymentInvoice 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table APRM_Pending_PaymentInvoice 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table APRM_Pending_PaymentInvoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table APRM_Pending_PaymentInvoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table APRM_Pending_PaymentInvoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table APRM_Pending_PaymentInvoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table APRM_Pending_PaymentInvoice 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property payment stored in column FIN_Payment_ID in table APRM_Pending_PaymentInvoice<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property invoice stored in column C_Invoice_ID in table APRM_Pending_PaymentInvoice<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property paymentExecutionProcess stored in column FIN_Pay_Exec_Process_ID in table APRM_Pending_PaymentInvoice<br>
     * Help: {@literal Defines the Process to execute payments.}
     * 
     */
    public static final String PROPERTY_PAYMENTEXECUTIONPROCESS = "paymentExecutionProcess";

    /**
     * Property processNow stored in column Processing in table APRM_Pending_PaymentInvoice<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";


    public APRMPendingPaymentFromInvoice() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_PAYMENTEXECUTIONPROCESS
     * 
     */
    public PaymentExecutionProcess getPaymentExecutionProcess() {
        return (PaymentExecutionProcess) get(PROPERTY_PAYMENTEXECUTIONPROCESS);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_PAYMENTEXECUTIONPROCESS
     * 
     */
    public void setPaymentExecutionProcess(PaymentExecutionProcess paymentExecutionProcess) {
        set(PROPERTY_PAYMENTEXECUTIONPROCESS, paymentExecutionProcess);
    }

    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see APRMPendingPaymentFromInvoice#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

}
