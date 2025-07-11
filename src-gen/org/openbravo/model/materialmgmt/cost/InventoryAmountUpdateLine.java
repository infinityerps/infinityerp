
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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
 * Entity class for entity InventoryAmountUpdateLine (stored in table M_CA_InventoryAmtLine).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InventoryAmountUpdateLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_CA_InventoryAmtLine";
    public static final String ENTITY_NAME = "InventoryAmountUpdateLine";

    /**
     * Property id stored in column M_Ca_Inventoryamtline_ID in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_CA_InventoryAmtLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_CA_InventoryAmtLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_CA_InventoryAmtLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_CA_InventoryAmtLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_CA_InventoryAmtLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_CA_InventoryAmtLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_CA_InventoryAmtLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property referenceDate stored in column Referencedate in table M_CA_InventoryAmtLine<br>
     * Help: {@literal The date used as a Reference for the document}
     * 
     */
    public static final String PROPERTY_REFERENCEDATE = "referenceDate";

    /**
     * Property product stored in column M_Product_ID in table M_CA_InventoryAmtLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_CA_InventoryAmtLine<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property inventoryAmount stored in column Inventory_Amount in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_INVENTORYAMOUNT = "inventoryAmount";

    /**
     * Property currentInventoryAmount stored in column CUR_Inventory_Amount in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_CURRENTINVENTORYAMOUNT = "currentInventoryAmount";

    /**
     * Property onHandQty stored in column Onhandqty in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_ONHANDQTY = "onHandQty";

    /**
     * Property unitCost stored in column Unitcost in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_UNITCOST = "unitCost";

    /**
     * Property currentUnitCost stored in column CUR_Unitcost in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_CURRENTUNITCOST = "currentUnitCost";

    /**
     * Property caInventoryamt stored in column M_Ca_Inventoryamt_ID in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_CAINVENTORYAMT = "caInventoryamt";

    /**
     * Property inventoryAmountUpdateLineInventoriesList stored in table M_CA_InventoryAmtLine
     * 
     */
    public static final String PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESLIST = "inventoryAmountUpdateLineInventoriesList";


    public InventoryAmountUpdateLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ONHANDQTY, new BigDecimal(0));
        setDefaultValue(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_REFERENCEDATE
     * 
     */
    public Date getReferenceDate() {
        return (Date) get(PROPERTY_REFERENCEDATE);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_REFERENCEDATE
     * 
     */
    public void setReferenceDate(Date referenceDate) {
        set(PROPERTY_REFERENCEDATE, referenceDate);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_INVENTORYAMOUNT
     * 
     */
    public BigDecimal getInventoryAmount() {
        return (BigDecimal) get(PROPERTY_INVENTORYAMOUNT);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_INVENTORYAMOUNT
     * 
     */
    public void setInventoryAmount(BigDecimal inventoryAmount) {
        set(PROPERTY_INVENTORYAMOUNT, inventoryAmount);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CURRENTINVENTORYAMOUNT
     * 
     */
    public BigDecimal getCurrentInventoryAmount() {
        return (BigDecimal) get(PROPERTY_CURRENTINVENTORYAMOUNT);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CURRENTINVENTORYAMOUNT
     * 
     */
    public void setCurrentInventoryAmount(BigDecimal currentInventoryAmount) {
        set(PROPERTY_CURRENTINVENTORYAMOUNT, currentInventoryAmount);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ONHANDQTY
     * 
     */
    public BigDecimal getOnHandQty() {
        return (BigDecimal) get(PROPERTY_ONHANDQTY);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_ONHANDQTY
     * 
     */
    public void setOnHandQty(BigDecimal onHandQty) {
        set(PROPERTY_ONHANDQTY, onHandQty);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_UNITCOST
     * 
     */
    public BigDecimal getUnitCost() {
        return (BigDecimal) get(PROPERTY_UNITCOST);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_UNITCOST
     * 
     */
    public void setUnitCost(BigDecimal unitCost) {
        set(PROPERTY_UNITCOST, unitCost);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CURRENTUNITCOST
     * 
     */
    public BigDecimal getCurrentUnitCost() {
        return (BigDecimal) get(PROPERTY_CURRENTUNITCOST);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CURRENTUNITCOST
     * 
     */
    public void setCurrentUnitCost(BigDecimal currentUnitCost) {
        set(PROPERTY_CURRENTUNITCOST, currentUnitCost);
    }

    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CAINVENTORYAMT
     * 
     */
    public InventoryAmountUpdate getCaInventoryamt() {
        return (InventoryAmountUpdate) get(PROPERTY_CAINVENTORYAMT);
    }
    /**
     * @see InventoryAmountUpdateLine#PROPERTY_CAINVENTORYAMT
     * 
     */
    public void setCaInventoryamt(InventoryAmountUpdate caInventoryamt) {
        set(PROPERTY_CAINVENTORYAMT, caInventoryamt);
    }

    /**
     * @see InvAmtUpdLnInventories
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvAmtUpdLnInventories> getInventoryAmountUpdateLineInventoriesList() {
      return (List<InvAmtUpdLnInventories>) get(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESLIST);
    }

    /**
     * @see InvAmtUpdLnInventories
     * 
     */
    public void setInventoryAmountUpdateLineInventoriesList(List<InvAmtUpdLnInventories> inventoryAmountUpdateLineInventoriesList) {
        set(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESLIST, inventoryAmountUpdateLineInventoriesList);
    }

}
