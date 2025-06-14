
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtPaymentRunPayment (stored in table FIN_Payment_Run_Payment).
 * <br>
 * Help: {@literal Table to store the Payments included on each Payment Run.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PaymentRunPayment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Run_Payment";
    public static final String ENTITY_NAME = "FinancialMgmtPaymentRunPayment";

    /**
     * Property id stored in column FIN_Payment_Run_Payment_ID in table FIN_Payment_Run_Payment 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Run_Payment 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Run_Payment 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Run_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Run_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Run_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Run_Payment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Run_Payment 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property paymentRun stored in column FIN_Payment_Run_ID in table FIN_Payment_Run_Payment<br>
     * Help: {@literal Identifies each run of an Execution Process}
     * 
     */
    public static final String PROPERTY_PAYMENTRUN = "paymentRun";

    /**
     * Property payment stored in column FIN_Payment_ID in table FIN_Payment_Run_Payment<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property result stored in column Result in table FIN_Payment_Run_Payment 
     * 
     */
    public static final String PROPERTY_RESULT = "result";

    /**
     * Property message stored in column Message in table FIN_Payment_Run_Payment<br>
     * Help: {@literal Output message}
     * 
     */
    public static final String PROPERTY_MESSAGE = "message";


    public PaymentRunPayment() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PaymentRunPayment#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_PAYMENTRUN
     * 
     */
    public PaymentRun getPaymentRun() {
        return (PaymentRun) get(PROPERTY_PAYMENTRUN);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_PAYMENTRUN
     * 
     */
    public void setPaymentRun(PaymentRun paymentRun) {
        set(PROPERTY_PAYMENTRUN, paymentRun);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_RESULT
     * 
     */
    public String getResult() {
        return (String) get(PROPERTY_RESULT);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_RESULT
     * 
     */
    public void setResult(String result) {
        set(PROPERTY_RESULT, result);
    }

    /**
     * @see PaymentRunPayment#PROPERTY_MESSAGE
     * 
     */
    public String getMessage() {
        return (String) get(PROPERTY_MESSAGE);
    }
    /**
     * @see PaymentRunPayment#PROPERTY_MESSAGE
     * 
     */
    public void setMessage(String message) {
        set(PROPERTY_MESSAGE, message);
    }

}
