
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
package org.openbravo.model.materialmgmt.cost;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.materialmgmt.transaction.InventoryCount;
/**
 * Entity class for entity CostingRuleInit (stored in table M_Costing_Rule_Init).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostingRuleInit extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Costing_Rule_Init";
    public static final String ENTITY_NAME = "CostingRuleInit";

    /**
     * Property id stored in column M_Costing_Rule_Init_ID in table M_Costing_Rule_Init 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Costing_Rule_Init 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Costing_Rule_Init 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table M_Costing_Rule_Init 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Costing_Rule_Init 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Costing_Rule_Init 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Costing_Rule_Init 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table M_Costing_Rule_Init 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property costingRule stored in column M_Costing_Rule_ID in table M_Costing_Rule_Init<br>
     * Help: {@literal Identifies a costing rule for cost calculation. The costing rule defines the algorithm to
     *       be used, the date is valid from and if warehouses are used as a cost dimension.}
     * 
     */
    public static final String PROPERTY_COSTINGRULE = "costingRule";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Costing_Rule_Init<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property closeInventory stored in column Close_Inventory_ID in table M_Costing_Rule_Init<br>
     * Help: {@literal Physical Inventory to close the previous costing rule of the product.}
     * 
     */
    public static final String PROPERTY_CLOSEINVENTORY = "closeInventory";

    /**
     * Property initInventory stored in column Init_Inventory_ID in table M_Costing_Rule_Init<br>
     * Help: {@literal Physical Inventory to initialize the product costs using the new costing rule. The cost
     *       amounts are based on the close inventory.}
     * 
     */
    public static final String PROPERTY_INITINVENTORY = "initInventory";


    public CostingRuleInit() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostingRuleInit#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostingRuleInit#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostingRuleInit#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostingRuleInit#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostingRuleInit#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostingRuleInit#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostingRuleInit#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostingRuleInit#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostingRuleInit#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostingRuleInit#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostingRuleInit#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostingRuleInit#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostingRuleInit#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostingRuleInit#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostingRuleInit#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostingRuleInit#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CostingRuleInit#PROPERTY_COSTINGRULE
     * 
     */
    public CostingRule getCostingRule() {
        return (CostingRule) get(PROPERTY_COSTINGRULE);
    }
    /**
     * @see CostingRuleInit#PROPERTY_COSTINGRULE
     * 
     */
    public void setCostingRule(CostingRule costingRule) {
        set(PROPERTY_COSTINGRULE, costingRule);
    }

    /**
     * @see CostingRuleInit#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see CostingRuleInit#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see CostingRuleInit#PROPERTY_CLOSEINVENTORY
     * 
     */
    public InventoryCount getCloseInventory() {
        return (InventoryCount) get(PROPERTY_CLOSEINVENTORY);
    }
    /**
     * @see CostingRuleInit#PROPERTY_CLOSEINVENTORY
     * 
     */
    public void setCloseInventory(InventoryCount closeInventory) {
        set(PROPERTY_CLOSEINVENTORY, closeInventory);
    }

    /**
     * @see CostingRuleInit#PROPERTY_INITINVENTORY
     * 
     */
    public InventoryCount getInitInventory() {
        return (InventoryCount) get(PROPERTY_INITINVENTORY);
    }
    /**
     * @see CostingRuleInit#PROPERTY_INITINVENTORY
     * 
     */
    public void setInitInventory(InventoryCount initInventory) {
        set(PROPERTY_INITINVENTORY, initInventory);
    }

}
