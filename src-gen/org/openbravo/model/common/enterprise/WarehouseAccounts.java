
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
package org.openbravo.model.common.enterprise;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.financialmgmt.accounting.coa.AccountingCombination;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
/**
 * Entity class for entity WarehouseAccounts (stored in table M_Warehouse_Acct).
 * <br>
 * Help: {@literal Defines the Accounting parameters to be used for inventory in that Warehouse.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WarehouseAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Warehouse_Acct";
    public static final String ENTITY_NAME = "WarehouseAccounts";

    /**
     * Property id stored in column M_Warehouse_Acct_ID in table M_Warehouse_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Warehouse_Acct<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table M_Warehouse_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table M_Warehouse_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Warehouse_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Warehouse_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Warehouse_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Warehouse_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Warehouse_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Warehouse_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property warehouseInventory stored in column W_Inventory_Acct in table M_Warehouse_Acct<br>
     * Help: {@literal The Warehouse Inventory Asset Account identifies the account used for recording the value
     *       of your inventory.}
     * 
     */
    public static final String PROPERTY_WAREHOUSEINVENTORY = "warehouseInventory";

    /**
     * Property inventoryAdjustment stored in column W_InvActualAdjust_Acct in table M_Warehouse_Acct<br>
     * Help: {@literal In actual costing systems, this account is used to post Inventory value adjustments. You
     *       could set it to the standard Inventory Asset account.}
     * 
     */
    public static final String PROPERTY_INVENTORYADJUSTMENT = "inventoryAdjustment";

    /**
     * Property warehouseDifferences stored in column W_Differences_Acct in table M_Warehouse_Acct<br>
     * Help: {@literal The Warehouse Differences Account indicates the account used recording differences
     *       identified during inventory counts.}
     * 
     */
    public static final String PROPERTY_WAREHOUSEDIFFERENCES = "warehouseDifferences";

    /**
     * Property inventoryRevaluation stored in column W_Revaluation_Acct in table M_Warehouse_Acct<br>
     * Help: {@literal The Inventory Revaluation Account identifies the account used to records changes in
     *       inventory value due to currency revaluation.}
     * 
     */
    public static final String PROPERTY_INVENTORYREVALUATION = "inventoryRevaluation";


    public WarehouseAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WarehouseAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_WAREHOUSEINVENTORY
     * 
     */
    public AccountingCombination getWarehouseInventory() {
        return (AccountingCombination) get(PROPERTY_WAREHOUSEINVENTORY);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_WAREHOUSEINVENTORY
     * 
     */
    public void setWarehouseInventory(AccountingCombination warehouseInventory) {
        set(PROPERTY_WAREHOUSEINVENTORY, warehouseInventory);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_INVENTORYADJUSTMENT
     * 
     */
    public AccountingCombination getInventoryAdjustment() {
        return (AccountingCombination) get(PROPERTY_INVENTORYADJUSTMENT);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_INVENTORYADJUSTMENT
     * 
     */
    public void setInventoryAdjustment(AccountingCombination inventoryAdjustment) {
        set(PROPERTY_INVENTORYADJUSTMENT, inventoryAdjustment);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_WAREHOUSEDIFFERENCES
     * 
     */
    public AccountingCombination getWarehouseDifferences() {
        return (AccountingCombination) get(PROPERTY_WAREHOUSEDIFFERENCES);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_WAREHOUSEDIFFERENCES
     * 
     */
    public void setWarehouseDifferences(AccountingCombination warehouseDifferences) {
        set(PROPERTY_WAREHOUSEDIFFERENCES, warehouseDifferences);
    }

    /**
     * @see WarehouseAccounts#PROPERTY_INVENTORYREVALUATION
     * 
     */
    public AccountingCombination getInventoryRevaluation() {
        return (AccountingCombination) get(PROPERTY_INVENTORYREVALUATION);
    }
    /**
     * @see WarehouseAccounts#PROPERTY_INVENTORYREVALUATION
     * 
     */
    public void setInventoryRevaluation(AccountingCombination inventoryRevaluation) {
        set(PROPERTY_INVENTORYREVALUATION, inventoryRevaluation);
    }

}
