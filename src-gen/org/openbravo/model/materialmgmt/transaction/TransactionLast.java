
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
package org.openbravo.model.materialmgmt.transaction;

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
import org.openbravo.model.common.plm.Product;
/**
 * Entity class for entity TransactionLast (stored in table M_Transaction_Last).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TransactionLast extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Transaction_Last";
    public static final String ENTITY_NAME = "TransactionLast";

    /**
     * Property id stored in column M_Transaction_Last_ID in table M_Transaction_Last 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Transaction_Last 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Transaction_Last 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table M_Transaction_Last 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Transaction_Last 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Transaction_Last 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Transaction_Last 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table M_Transaction_Last 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property inventoryTransaction stored in column M_Transaction_ID in table M_Transaction_Last<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_INVENTORYTRANSACTION = "inventoryTransaction";

    /**
     * Property product stored in column M_Product_ID in table M_Transaction_Last<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Transaction_Last<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";


    public TransactionLast() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TransactionLast#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TransactionLast#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TransactionLast#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TransactionLast#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TransactionLast#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TransactionLast#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TransactionLast#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TransactionLast#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TransactionLast#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TransactionLast#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TransactionLast#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TransactionLast#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TransactionLast#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TransactionLast#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TransactionLast#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TransactionLast#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TransactionLast#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public MaterialTransaction getInventoryTransaction() {
        return (MaterialTransaction) get(PROPERTY_INVENTORYTRANSACTION);
    }
    /**
     * @see TransactionLast#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public void setInventoryTransaction(MaterialTransaction inventoryTransaction) {
        set(PROPERTY_INVENTORYTRANSACTION, inventoryTransaction);
    }

    /**
     * @see TransactionLast#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see TransactionLast#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see TransactionLast#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see TransactionLast#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

}
