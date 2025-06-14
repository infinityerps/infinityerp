
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
package org.openbravo.model.financialmgmt.gl;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.AccountingCombination;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
/**
 * Entity class for entity FinancialMgmtGLChargeAccounts (stored in table C_Charge_Acct).
 * <br>
 * Help: {@literal Defines the accounting parameters used for transactions including a charge or charges.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GLChargeAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Charge_Acct";
    public static final String ENTITY_NAME = "FinancialMgmtGLChargeAccounts";

    /**
     * Property id stored in column C_Charge_Acct_ID in table C_Charge_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property charge stored in column C_Charge_ID in table C_Charge_Acct<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_Charge_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table C_Charge_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Charge_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Charge_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Charge_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Charge_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Charge_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Charge_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property chargeExpense stored in column Ch_Expense_Acct in table C_Charge_Acct<br>
     * Help: {@literal The Charge Expense Account identifies the account to use when recording charges paid to
     *       vendors.}
     * 
     */
    public static final String PROPERTY_CHARGEEXPENSE = "chargeExpense";

    /**
     * Property chargeRevenue stored in column Ch_Revenue_Acct in table C_Charge_Acct<br>
     * Help: {@literal The Charge Revenue Account identifies the account to use when recording charges paid by
     *       customers.}
     * 
     */
    public static final String PROPERTY_CHARGEREVENUE = "chargeRevenue";


    public GLChargeAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GLChargeAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_CHARGEEXPENSE
     * 
     */
    public AccountingCombination getChargeExpense() {
        return (AccountingCombination) get(PROPERTY_CHARGEEXPENSE);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_CHARGEEXPENSE
     * 
     */
    public void setChargeExpense(AccountingCombination chargeExpense) {
        set(PROPERTY_CHARGEEXPENSE, chargeExpense);
    }

    /**
     * @see GLChargeAccounts#PROPERTY_CHARGEREVENUE
     * 
     */
    public AccountingCombination getChargeRevenue() {
        return (AccountingCombination) get(PROPERTY_CHARGEREVENUE);
    }
    /**
     * @see GLChargeAccounts#PROPERTY_CHARGEREVENUE
     * 
     */
    public void setChargeRevenue(AccountingCombination chargeRevenue) {
        set(PROPERTY_CHARGEREVENUE, chargeRevenue);
    }

}
