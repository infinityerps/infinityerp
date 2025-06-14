
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
 * Entity class for entity FinancialMgmtDPManagementLine (stored in table C_DP_ManagementLine).
 * <br>
 * Help: {@literal Indicates the status change of a Debt Payment.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DPManagementLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_DP_ManagementLine";
    public static final String ENTITY_NAME = "FinancialMgmtDPManagementLine";

    /**
     * Property id stored in column C_Dp_Managementline_ID in table C_DP_ManagementLine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_DP_ManagementLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_DP_ManagementLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_DP_ManagementLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_DP_ManagementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_DP_ManagementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_DP_ManagementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_DP_ManagementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property paymentManagement stored in column C_Dp_Management_ID in table C_DP_ManagementLine<br>
     * Help: {@literal Debt Payment Management allows to manage the changes of status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_PAYMENTMANAGEMENT = "paymentManagement";

    /**
     * Property currentStatus stored in column Status_From in table C_DP_ManagementLine<br>
     * Help: {@literal Initial status of the debt payment.}
     * 
     */
    public static final String PROPERTY_CURRENTSTATUS = "currentStatus";

    /**
     * Property finalStatus stored in column Status_To in table C_DP_ManagementLine<br>
     * Help: {@literal Is the status that debt payment has taken.}
     * 
     */
    public static final String PROPERTY_FINALSTATUS = "finalStatus";

    /**
     * Property payment stored in column C_Debt_Payment_ID in table C_DP_ManagementLine<br>
     * Help: {@literal Refers to the amount of money to be paid or collected.}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property lineNo stored in column Line in table C_DP_ManagementLine<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";


    public DPManagementLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DPManagementLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DPManagementLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DPManagementLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DPManagementLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DPManagementLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DPManagementLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DPManagementLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DPManagementLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DPManagementLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DPManagementLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DPManagementLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DPManagementLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DPManagementLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DPManagementLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DPManagementLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DPManagementLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DPManagementLine#PROPERTY_PAYMENTMANAGEMENT
     * 
     */
    public DPManagement getPaymentManagement() {
        return (DPManagement) get(PROPERTY_PAYMENTMANAGEMENT);
    }
    /**
     * @see DPManagementLine#PROPERTY_PAYMENTMANAGEMENT
     * 
     */
    public void setPaymentManagement(DPManagement paymentManagement) {
        set(PROPERTY_PAYMENTMANAGEMENT, paymentManagement);
    }

    /**
     * @see DPManagementLine#PROPERTY_CURRENTSTATUS
     * 
     */
    public String getCurrentStatus() {
        return (String) get(PROPERTY_CURRENTSTATUS);
    }
    /**
     * @see DPManagementLine#PROPERTY_CURRENTSTATUS
     * 
     */
    public void setCurrentStatus(String currentStatus) {
        set(PROPERTY_CURRENTSTATUS, currentStatus);
    }

    /**
     * @see DPManagementLine#PROPERTY_FINALSTATUS
     * 
     */
    public String getFinalStatus() {
        return (String) get(PROPERTY_FINALSTATUS);
    }
    /**
     * @see DPManagementLine#PROPERTY_FINALSTATUS
     * 
     */
    public void setFinalStatus(String finalStatus) {
        set(PROPERTY_FINALSTATUS, finalStatus);
    }

    /**
     * @see DPManagementLine#PROPERTY_PAYMENT
     * 
     */
    public DebtPayment getPayment() {
        return (DebtPayment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see DPManagementLine#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(DebtPayment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see DPManagementLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see DPManagementLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

}
