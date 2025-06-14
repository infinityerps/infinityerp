
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
 * Entity class for entity FinancialMgmtRemittanceType (stored in table C_Remittance_Type).
 * <br>
 * Help: {@literal Definition of types of remittances.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class RemittanceType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Remittance_Type";
    public static final String ENTITY_NAME = "FinancialMgmtRemittanceType";

    /**
     * Property id stored in column C_Remittance_Type_ID in table C_Remittance_Type<br>
     * Help: {@literal The remittance type defines the properties the remittance has.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Remittance_Type 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Remittance_Type 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Remittance_Type 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Remittance_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Remittance_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Remittance_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Remittance_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Remittance_Type 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property consolidate stored in column Consolidate in table C_Remittance_Type<br>
     * Help: {@literal When a remittance type is consolidated it will be created a cancel settlement from the
     *       debt/payments in the remittance and another one with the amount being the sum of all debt/payments.}
     * 
     */
    public static final String PROPERTY_CONSOLIDATE = "consolidate";

    /**
     * Property finalStatus stored in column Status_To in table C_Remittance_Type<br>
     * Help: {@literal Is the status that debt payment has taken.}
     * 
     */
    public static final String PROPERTY_FINALSTATUS = "finalStatus";

    /**
     * Property paymentRuleConsolidated stored in column Paymentruleconsolidated in table C_Remittance_Type<br>
     * Help: {@literal Is the payment rule that will be applied for the consolidated debt/payments.}
     * 
     */
    public static final String PROPERTY_PAYMENTRULECONSOLIDATED = "paymentRuleConsolidated";

    /**
     * Property returnedStatus stored in column Status_Returned in table C_Remittance_Type<br>
     * Help: {@literal The returned status is the status that will be taken by the debt/payment when it is
     *       returned.}
     * 
     */
    public static final String PROPERTY_RETURNEDSTATUS = "returnedStatus";

    /**
     * Property receipt stored in column IsReceipt in table C_Remittance_Type<br>
     * Help: {@literal Indicated a sales transaction (Accounts Receivable if Receipt=Y) or a purchase transaction
     *       (Accounts Payable if Receipt=N).}
     * 
     */
    public static final String PROPERTY_RECEIPT = "receipt";


    public RemittanceType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CONSOLIDATE, false);
        setDefaultValue(PROPERTY_RECEIPT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see RemittanceType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see RemittanceType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see RemittanceType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see RemittanceType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see RemittanceType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see RemittanceType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see RemittanceType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see RemittanceType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see RemittanceType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see RemittanceType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see RemittanceType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see RemittanceType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see RemittanceType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see RemittanceType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see RemittanceType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see RemittanceType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see RemittanceType#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see RemittanceType#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see RemittanceType#PROPERTY_CONSOLIDATE
     * 
     */
    public Boolean isConsolidate() {
        return (Boolean) get(PROPERTY_CONSOLIDATE);
    }
    /**
     * @see RemittanceType#PROPERTY_CONSOLIDATE
     * 
     */
    public void setConsolidate(Boolean consolidate) {
        set(PROPERTY_CONSOLIDATE, consolidate);
    }

    /**
     * @see RemittanceType#PROPERTY_FINALSTATUS
     * 
     */
    public String getFinalStatus() {
        return (String) get(PROPERTY_FINALSTATUS);
    }
    /**
     * @see RemittanceType#PROPERTY_FINALSTATUS
     * 
     */
    public void setFinalStatus(String finalStatus) {
        set(PROPERTY_FINALSTATUS, finalStatus);
    }

    /**
     * @see RemittanceType#PROPERTY_PAYMENTRULECONSOLIDATED
     * 
     */
    public String getPaymentRuleConsolidated() {
        return (String) get(PROPERTY_PAYMENTRULECONSOLIDATED);
    }
    /**
     * @see RemittanceType#PROPERTY_PAYMENTRULECONSOLIDATED
     * 
     */
    public void setPaymentRuleConsolidated(String paymentRuleConsolidated) {
        set(PROPERTY_PAYMENTRULECONSOLIDATED, paymentRuleConsolidated);
    }

    /**
     * @see RemittanceType#PROPERTY_RETURNEDSTATUS
     * 
     */
    public String getReturnedStatus() {
        return (String) get(PROPERTY_RETURNEDSTATUS);
    }
    /**
     * @see RemittanceType#PROPERTY_RETURNEDSTATUS
     * 
     */
    public void setReturnedStatus(String returnedStatus) {
        set(PROPERTY_RETURNEDSTATUS, returnedStatus);
    }

    /**
     * @see RemittanceType#PROPERTY_RECEIPT
     * 
     */
    public Boolean isReceipt() {
        return (Boolean) get(PROPERTY_RECEIPT);
    }
    /**
     * @see RemittanceType#PROPERTY_RECEIPT
     * 
     */
    public void setReceipt(Boolean receipt) {
        set(PROPERTY_RECEIPT, receipt);
    }

}
