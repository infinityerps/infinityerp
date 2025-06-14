
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
 * Entity class for entity InventoryAmountUpdateLineInventories (stored in table M_CA_InventoryAmtLine_Inv).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvAmtUpdLnInventories extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_CA_InventoryAmtLine_Inv";
    public static final String ENTITY_NAME = "InventoryAmountUpdateLineInventories";

    /**
     * Property id stored in column M_Ca_Inventoryamtline_Inv_ID in table M_CA_InventoryAmtLine_Inv 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_CA_InventoryAmtLine_Inv 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_CA_InventoryAmtLine_Inv 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table M_CA_InventoryAmtLine_Inv 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_CA_InventoryAmtLine_Inv 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_CA_InventoryAmtLine_Inv 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_CA_InventoryAmtLine_Inv 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table M_CA_InventoryAmtLine_Inv 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property caInventoryamtline stored in column M_Ca_Inventoryamtline_ID in table M_CA_InventoryAmtLine_Inv
     * 
     */
    public static final String PROPERTY_CAINVENTORYAMTLINE = "caInventoryamtline";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_CA_InventoryAmtLine_Inv<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property closeInventory stored in column Close_Inventory_ID in table M_CA_InventoryAmtLine_Inv<br>
     * Help: {@literal Physical Inventory to close the previous costing rule of the product.}
     * 
     */
    public static final String PROPERTY_CLOSEINVENTORY = "closeInventory";

    /**
     * Property initInventory stored in column Init_Inventory_ID in table M_CA_InventoryAmtLine_Inv<br>
     * Help: {@literal Physical Inventory to initialize the product costs using the new costing rule. The cost
     *       amounts are based on the close inventory.}
     * 
     */
    public static final String PROPERTY_INITINVENTORY = "initInventory";


    public InvAmtUpdLnInventories() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CAINVENTORYAMTLINE
     * 
     */
    public InventoryAmountUpdateLine getCaInventoryamtline() {
        return (InventoryAmountUpdateLine) get(PROPERTY_CAINVENTORYAMTLINE);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CAINVENTORYAMTLINE
     * 
     */
    public void setCaInventoryamtline(InventoryAmountUpdateLine caInventoryamtline) {
        set(PROPERTY_CAINVENTORYAMTLINE, caInventoryamtline);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CLOSEINVENTORY
     * 
     */
    public InventoryCount getCloseInventory() {
        return (InventoryCount) get(PROPERTY_CLOSEINVENTORY);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_CLOSEINVENTORY
     * 
     */
    public void setCloseInventory(InventoryCount closeInventory) {
        set(PROPERTY_CLOSEINVENTORY, closeInventory);
    }

    /**
     * @see InvAmtUpdLnInventories#PROPERTY_INITINVENTORY
     * 
     */
    public InventoryCount getInitInventory() {
        return (InventoryCount) get(PROPERTY_INITINVENTORY);
    }
    /**
     * @see InvAmtUpdLnInventories#PROPERTY_INITINVENTORY
     * 
     */
    public void setInitInventory(InventoryCount initInventory) {
        set(PROPERTY_INITINVENTORY, initInventory);
    }

}
