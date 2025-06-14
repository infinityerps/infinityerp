
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
 * Entity class for entity FinancialMgmtRemittanceLine (stored in table C_RemittanceLine).
 * <br>
 * Help: {@literal Refers to a payment sent to the bank.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class RemittanceLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_RemittanceLine";
    public static final String ENTITY_NAME = "FinancialMgmtRemittanceLine";

    /**
     * Property id stored in column C_Remittanceline_ID in table C_RemittanceLine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_RemittanceLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_RemittanceLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_RemittanceLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_RemittanceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_RemittanceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_RemittanceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_RemittanceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property remittance stored in column C_Remittance_ID in table C_RemittanceLine<br>
     * Help: {@literal Refers to a group of payments sent to the bank.}
     * 
     */
    public static final String PROPERTY_REMITTANCE = "remittance";

    /**
     * Property lineNo stored in column Line in table C_RemittanceLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property payment stored in column C_Debt_Payment_ID in table C_RemittanceLine<br>
     * Help: {@literal Refers to the amount of money to be paid or collected.}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property paymentCancelled stored in column C_Debt_Payment_Cancelled in table C_RemittanceLine<br>
     * Help: {@literal Generated debt payment that will cancel remittance line payment.}
     * 
     */
    public static final String PROPERTY_PAYMENTCANCELLED = "paymentCancelled";

    /**
     * Property returned stored in column Returned in table C_RemittanceLine<br>
     * Help: {@literal If it is checked means that the debt/payment has been returned by the bank.}
     * 
     */
    public static final String PROPERTY_RETURNED = "returned";


    public RemittanceLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RETURNED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see RemittanceLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see RemittanceLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see RemittanceLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see RemittanceLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see RemittanceLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see RemittanceLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see RemittanceLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see RemittanceLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see RemittanceLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see RemittanceLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see RemittanceLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see RemittanceLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see RemittanceLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see RemittanceLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see RemittanceLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see RemittanceLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see RemittanceLine#PROPERTY_REMITTANCE
     * 
     */
    public Remittance getRemittance() {
        return (Remittance) get(PROPERTY_REMITTANCE);
    }
    /**
     * @see RemittanceLine#PROPERTY_REMITTANCE
     * 
     */
    public void setRemittance(Remittance remittance) {
        set(PROPERTY_REMITTANCE, remittance);
    }

    /**
     * @see RemittanceLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see RemittanceLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see RemittanceLine#PROPERTY_PAYMENT
     * 
     */
    public DebtPayment getPayment() {
        return (DebtPayment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see RemittanceLine#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(DebtPayment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see RemittanceLine#PROPERTY_PAYMENTCANCELLED
     * 
     */
    public DebtPayment getPaymentCancelled() {
        return (DebtPayment) get(PROPERTY_PAYMENTCANCELLED);
    }
    /**
     * @see RemittanceLine#PROPERTY_PAYMENTCANCELLED
     * 
     */
    public void setPaymentCancelled(DebtPayment paymentCancelled) {
        set(PROPERTY_PAYMENTCANCELLED, paymentCancelled);
    }

    /**
     * @see RemittanceLine#PROPERTY_RETURNED
     * 
     */
    public Boolean isReturned() {
        return (Boolean) get(PROPERTY_RETURNED);
    }
    /**
     * @see RemittanceLine#PROPERTY_RETURNED
     * 
     */
    public void setReturned(Boolean returned) {
        set(PROPERTY_RETURNED, returned);
    }

}
