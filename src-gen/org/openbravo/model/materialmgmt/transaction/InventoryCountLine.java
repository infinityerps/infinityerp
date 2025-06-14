
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
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
/**
 * Entity class for entity MaterialMgmtInventoryCountLine (stored in table M_InventoryLine).
 * <br>
 * Help: {@literal Contains the counts of the individual products in inventory}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InventoryCountLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_InventoryLine";
    public static final String ENTITY_NAME = "MaterialMgmtInventoryCountLine";

    /**
     * Property id stored in column M_InventoryLine_ID in table M_InventoryLine<br>
     * Help: {@literal The Physical Inventory Line indicates the inventory document line (if applicable) for this
     *       transaction}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_InventoryLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_InventoryLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_InventoryLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_InventoryLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_InventoryLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_InventoryLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_InventoryLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property physInventory stored in column M_Inventory_ID in table M_InventoryLine<br>
     * Help: {@literal The Physical Inventory indicates a unique parameters for a physical inventory.}
     * 
     */
    public static final String PROPERTY_PHYSINVENTORY = "physInventory";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_InventoryLine<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property product stored in column M_Product_ID in table M_InventoryLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property lineNo stored in column Line in table M_InventoryLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property bookQuantity stored in column QtyBook in table M_InventoryLine<br>
     * Help: {@literal The Quantity Book indicates the line count stored in the system for a product in
     *       inventory}
     * 
     */
    public static final String PROPERTY_BOOKQUANTITY = "bookQuantity";

    /**
     * Property quantityCount stored in column QtyCount in table M_InventoryLine 
     * 
     */
    public static final String PROPERTY_QUANTITYCOUNT = "quantityCount";

    /**
     * Property description stored in column Description in table M_InventoryLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_InventoryLine<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_InventoryLine<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property orderQuantity stored in column QuantityOrder in table M_InventoryLine<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property uOM stored in column C_UOM_ID in table M_InventoryLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property quantityOrderBook stored in column QuantityOrderBook in table M_InventoryLine<br>
     * Help: {@literal Quantity order book}
     * 
     */
    public static final String PROPERTY_QUANTITYORDERBOOK = "quantityOrderBook";

    /**
     * Property cost stored in column Cost in table M_InventoryLine<br>
     * Help: {@literal Cost amount.}
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property relatedInventory stored in column Relatedinventorylineid in table M_InventoryLine
     * 
     */
    public static final String PROPERTY_RELATEDINVENTORY = "relatedInventory";

    /**
     * Property iscsvimported stored in column Iscsvimported in table M_InventoryLine<br>
     * Help: {@literal A flag indicating whether this record is imported by csv.}
     * 
     */
    public static final String PROPERTY_ISCSVIMPORTED = "iscsvimported";

    /**
     * Property gapbookqty stored in column Gapbookqty in table M_InventoryLine<br>
     * Help: {@literal Booked quantity exported less than booked quantity when imported}
     * 
     */
    public static final String PROPERTY_GAPBOOKQTY = "gapbookqty";

    /**
     * Property materialMgmtMaterialTransactionList stored in table M_InventoryLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST = "materialMgmtMaterialTransactionList";


    public InventoryCountLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_QUANTITYORDERBOOK, new BigDecimal(0));
        setDefaultValue(PROPERTY_ISCSVIMPORTED, false);
        setDefaultValue(PROPERTY_GAPBOOKQTY, new BigDecimal(0));
        setDefaultValue(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InventoryCountLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InventoryCountLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InventoryCountLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InventoryCountLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InventoryCountLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InventoryCountLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InventoryCountLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InventoryCountLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InventoryCountLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InventoryCountLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InventoryCountLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InventoryCountLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InventoryCountLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InventoryCountLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InventoryCountLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InventoryCountLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InventoryCountLine#PROPERTY_PHYSINVENTORY
     * 
     */
    public InventoryCount getPhysInventory() {
        return (InventoryCount) get(PROPERTY_PHYSINVENTORY);
    }
    /**
     * @see InventoryCountLine#PROPERTY_PHYSINVENTORY
     * 
     */
    public void setPhysInventory(InventoryCount physInventory) {
        set(PROPERTY_PHYSINVENTORY, physInventory);
    }

    /**
     * @see InventoryCountLine#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see InventoryCountLine#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see InventoryCountLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see InventoryCountLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see InventoryCountLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see InventoryCountLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see InventoryCountLine#PROPERTY_BOOKQUANTITY
     * 
     */
    public BigDecimal getBookQuantity() {
        return (BigDecimal) get(PROPERTY_BOOKQUANTITY);
    }
    /**
     * @see InventoryCountLine#PROPERTY_BOOKQUANTITY
     * 
     */
    public void setBookQuantity(BigDecimal bookQuantity) {
        set(PROPERTY_BOOKQUANTITY, bookQuantity);
    }

    /**
     * @see InventoryCountLine#PROPERTY_QUANTITYCOUNT
     * 
     */
    public BigDecimal getQuantityCount() {
        return (BigDecimal) get(PROPERTY_QUANTITYCOUNT);
    }
    /**
     * @see InventoryCountLine#PROPERTY_QUANTITYCOUNT
     * 
     */
    public void setQuantityCount(BigDecimal quantityCount) {
        set(PROPERTY_QUANTITYCOUNT, quantityCount);
    }

    /**
     * @see InventoryCountLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see InventoryCountLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see InventoryCountLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see InventoryCountLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see InventoryCountLine#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see InventoryCountLine#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see InventoryCountLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see InventoryCountLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see InventoryCountLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see InventoryCountLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see InventoryCountLine#PROPERTY_QUANTITYORDERBOOK
     * 
     */
    public BigDecimal getQuantityOrderBook() {
        return (BigDecimal) get(PROPERTY_QUANTITYORDERBOOK);
    }
    /**
     * @see InventoryCountLine#PROPERTY_QUANTITYORDERBOOK
     * 
     */
    public void setQuantityOrderBook(BigDecimal quantityOrderBook) {
        set(PROPERTY_QUANTITYORDERBOOK, quantityOrderBook);
    }

    /**
     * @see InventoryCountLine#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see InventoryCountLine#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see InventoryCountLine#PROPERTY_RELATEDINVENTORY
     * 
     */
    public InventoryCountLine getRelatedInventory() {
        return (InventoryCountLine) get(PROPERTY_RELATEDINVENTORY);
    }
    /**
     * @see InventoryCountLine#PROPERTY_RELATEDINVENTORY
     * 
     */
    public void setRelatedInventory(InventoryCountLine relatedInventory) {
        set(PROPERTY_RELATEDINVENTORY, relatedInventory);
    }

    /**
     * @see InventoryCountLine#PROPERTY_ISCSVIMPORTED
     * 
     */
    public Boolean isCsvimported() {
        return (Boolean) get(PROPERTY_ISCSVIMPORTED);
    }
    /**
     * @see InventoryCountLine#PROPERTY_ISCSVIMPORTED
     * 
     */
    public void setCsvimported(Boolean iscsvimported) {
        set(PROPERTY_ISCSVIMPORTED, iscsvimported);
    }

    /**
     * @see InventoryCountLine#PROPERTY_GAPBOOKQTY
     * 
     */
    public BigDecimal getGapbookqty() {
        return (BigDecimal) get(PROPERTY_GAPBOOKQTY);
    }
    /**
     * @see InventoryCountLine#PROPERTY_GAPBOOKQTY
     * 
     */
    public void setGapbookqty(BigDecimal gapbookqty) {
        set(PROPERTY_GAPBOOKQTY, gapbookqty);
    }

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MaterialTransaction> getMaterialMgmtMaterialTransactionList() {
      return (List<MaterialTransaction>) get(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST);
    }

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    public void setMaterialMgmtMaterialTransactionList(List<MaterialTransaction> materialMgmtMaterialTransactionList) {
        set(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, materialMgmtMaterialTransactionList);
    }

}
