
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
package org.openbravo.model.materialmgmt.onhandquantity;

import java.math.BigDecimal;
import java.util.Date;

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
 * Entity class for entity MaterialMgmtStorageDetail (stored in table M_Storage_Detail).
 * <br>
 * Help: {@literal Containts the  current stock for every product}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class StorageDetail extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Storage_Detail";
    public static final String ENTITY_NAME = "MaterialMgmtStorageDetail";

    /**
     * Property product stored in column M_Product_ID in table M_Storage_Detail<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_Storage_Detail<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_Storage_Detail<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property uOM stored in column C_UOM_ID in table M_Storage_Detail<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_Storage_Detail<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property quantityOnHand stored in column QtyOnHand in table M_Storage_Detail<br>
     * Help: {@literal The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.}
     * 
     */
    public static final String PROPERTY_QUANTITYONHAND = "quantityOnHand";

    /**
     * Property onHandOrderQuanity stored in column QtyOrderOnHand in table M_Storage_Detail<br>
     * Help: {@literal The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse in
     *       the second uom}
     * 
     */
    public static final String PROPERTY_ONHANDORDERQUANITY = "onHandOrderQuanity";

    /**
     * Property lastInventoryCountDate stored in column DateLastInventory in table M_Storage_Detail<br>
     * Help: {@literal The Date Last Inventory Count indicates the last time an Inventory count was done.}
     * 
     */
    public static final String PROPERTY_LASTINVENTORYCOUNTDATE = "lastInventoryCountDate";

    /**
     * Property quantityInDraftTransactions stored in column PreQtyOnHand in table M_Storage_Detail<br>
     * Help: {@literal The quantity that we have already purchased but are not still in the warehouse}
     * 
     */
    public static final String PROPERTY_QUANTITYINDRAFTTRANSACTIONS = "quantityInDraftTransactions";

    /**
     * Property quantityOrderInDraftTransactions stored in column PreQtyOrderOnHand in table M_Storage_Detail<br>
     * Help: {@literal The quantity that we have already purchased but are not still in the warehouse in the
     *       second uom}
     * 
     */
    public static final String PROPERTY_QUANTITYORDERINDRAFTTRANSACTIONS = "quantityOrderInDraftTransactions";

    /**
     * Property client stored in column AD_Client_ID in table M_Storage_Detail 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Storage_Detail 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Storage_Detail 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Storage_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Storage_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Storage_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Storage_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property id stored in column M_Storage_Detail_ID in table M_Storage_Detail<br>
     * Help: {@literal The Storage Detail identifies a stock in the warehouse by quantity, attributes and storage
     *       bin.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property reservedQty stored in column ReservedQty in table M_Storage_Detail<br>
     * Help: {@literal Represents the total quantity reserved to fulfill the reservation. It cannot be higher
     *       than the pending quantity.}
     * 
     */
    public static final String PROPERTY_RESERVEDQTY = "reservedQty";

    /**
     * Property allocatedQuantity stored in column AllocatedQty in table M_Storage_Detail<br>
     * Help: {@literal From a Reservation, the quantity that it is already allocated, which means that the
     *       Reserved Stock already has an
     *        Storage Bin and an Attribute values assigned to it}
     * 
     */
    public static final String PROPERTY_ALLOCATEDQUANTITY = "allocatedQuantity";

    /**
     * Property referencedInventory stored in column M_RefInventory_ID in table M_Storage_Detail<br>
     * Help: {@literal ID for a Handling Unit}
     * 
     */
    public static final String PROPERTY_REFERENCEDINVENTORY = "referencedInventory";


    public StorageDetail() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RESERVEDQTY, new BigDecimal(0));
        setDefaultValue(PROPERTY_ALLOCATEDQUANTITY, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see StorageDetail#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see StorageDetail#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see StorageDetail#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see StorageDetail#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see StorageDetail#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see StorageDetail#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see StorageDetail#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see StorageDetail#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see StorageDetail#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see StorageDetail#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see StorageDetail#PROPERTY_QUANTITYONHAND
     * 
     */
    public BigDecimal getQuantityOnHand() {
        return (BigDecimal) get(PROPERTY_QUANTITYONHAND);
    }
    /**
     * @see StorageDetail#PROPERTY_QUANTITYONHAND
     * 
     */
    public void setQuantityOnHand(BigDecimal quantityOnHand) {
        set(PROPERTY_QUANTITYONHAND, quantityOnHand);
    }

    /**
     * @see StorageDetail#PROPERTY_ONHANDORDERQUANITY
     * 
     */
    public BigDecimal getOnHandOrderQuanity() {
        return (BigDecimal) get(PROPERTY_ONHANDORDERQUANITY);
    }
    /**
     * @see StorageDetail#PROPERTY_ONHANDORDERQUANITY
     * 
     */
    public void setOnHandOrderQuanity(BigDecimal onHandOrderQuanity) {
        set(PROPERTY_ONHANDORDERQUANITY, onHandOrderQuanity);
    }

    /**
     * @see StorageDetail#PROPERTY_LASTINVENTORYCOUNTDATE
     * 
     */
    public Date getLastInventoryCountDate() {
        return (Date) get(PROPERTY_LASTINVENTORYCOUNTDATE);
    }
    /**
     * @see StorageDetail#PROPERTY_LASTINVENTORYCOUNTDATE
     * 
     */
    public void setLastInventoryCountDate(Date lastInventoryCountDate) {
        set(PROPERTY_LASTINVENTORYCOUNTDATE, lastInventoryCountDate);
    }

    /**
     * @see StorageDetail#PROPERTY_QUANTITYINDRAFTTRANSACTIONS
     * 
     */
    public BigDecimal getQuantityInDraftTransactions() {
        return (BigDecimal) get(PROPERTY_QUANTITYINDRAFTTRANSACTIONS);
    }
    /**
     * @see StorageDetail#PROPERTY_QUANTITYINDRAFTTRANSACTIONS
     * 
     */
    public void setQuantityInDraftTransactions(BigDecimal quantityInDraftTransactions) {
        set(PROPERTY_QUANTITYINDRAFTTRANSACTIONS, quantityInDraftTransactions);
    }

    /**
     * @see StorageDetail#PROPERTY_QUANTITYORDERINDRAFTTRANSACTIONS
     * 
     */
    public BigDecimal getQuantityOrderInDraftTransactions() {
        return (BigDecimal) get(PROPERTY_QUANTITYORDERINDRAFTTRANSACTIONS);
    }
    /**
     * @see StorageDetail#PROPERTY_QUANTITYORDERINDRAFTTRANSACTIONS
     * 
     */
    public void setQuantityOrderInDraftTransactions(BigDecimal quantityOrderInDraftTransactions) {
        set(PROPERTY_QUANTITYORDERINDRAFTTRANSACTIONS, quantityOrderInDraftTransactions);
    }

    /**
     * @see StorageDetail#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see StorageDetail#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see StorageDetail#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see StorageDetail#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see StorageDetail#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see StorageDetail#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see StorageDetail#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see StorageDetail#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see StorageDetail#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see StorageDetail#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see StorageDetail#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see StorageDetail#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see StorageDetail#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see StorageDetail#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see StorageDetail#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see StorageDetail#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see StorageDetail#PROPERTY_RESERVEDQTY
     * 
     */
    public BigDecimal getReservedQty() {
        return (BigDecimal) get(PROPERTY_RESERVEDQTY);
    }
    /**
     * @see StorageDetail#PROPERTY_RESERVEDQTY
     * 
     */
    public void setReservedQty(BigDecimal reservedQty) {
        set(PROPERTY_RESERVEDQTY, reservedQty);
    }

    /**
     * @see StorageDetail#PROPERTY_ALLOCATEDQUANTITY
     * 
     */
    public BigDecimal getAllocatedQuantity() {
        return (BigDecimal) get(PROPERTY_ALLOCATEDQUANTITY);
    }
    /**
     * @see StorageDetail#PROPERTY_ALLOCATEDQUANTITY
     * 
     */
    public void setAllocatedQuantity(BigDecimal allocatedQuantity) {
        set(PROPERTY_ALLOCATEDQUANTITY, allocatedQuantity);
    }

    /**
     * @see StorageDetail#PROPERTY_REFERENCEDINVENTORY
     * 
     */
    public ReferencedInventory getReferencedInventory() {
        return (ReferencedInventory) get(PROPERTY_REFERENCEDINVENTORY);
    }
    /**
     * @see StorageDetail#PROPERTY_REFERENCEDINVENTORY
     * 
     */
    public void setReferencedInventory(ReferencedInventory referencedInventory) {
        set(PROPERTY_REFERENCEDINVENTORY, referencedInventory);
    }

}
