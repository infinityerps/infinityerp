
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
/**
 * Entity class for entity MaterialMgmtStoragePending (stored in table M_Storage_Pending).
 * <br>
 * Help: {@literal Contains the reserved quantity and  the ordered quantity}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class StoragePending extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Storage_Pending";
    public static final String ENTITY_NAME = "MaterialMgmtStoragePending";

    /**
     * Property product stored in column M_Product_ID in table M_Storage_Pending<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Storage_Pending<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_Storage_Pending<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property uOM stored in column C_UOM_ID in table M_Storage_Pending<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_Storage_Pending<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property reservedQuantity stored in column QtyReserved in table M_Storage_Pending 
     * 
     */
    public static final String PROPERTY_RESERVEDQUANTITY = "reservedQuantity";

    /**
     * Property reservedQuantityOrder stored in column QtyOrderReserved in table M_Storage_Pending<br>
     * Help: {@literal The Reserved Quantity indicates the quantity of a product that is currently reserved for
     *       other orders in the second uom}
     * 
     */
    public static final String PROPERTY_RESERVEDQUANTITYORDER = "reservedQuantityOrder";

    /**
     * Property orderedQuantity stored in column QtyOrdered in table M_Storage_Pending 
     * 
     */
    public static final String PROPERTY_ORDEREDQUANTITY = "orderedQuantity";

    /**
     * Property orderedQuantityOrder stored in column QtyOrderOrdered in table M_Storage_Pending<br>
     * Help: {@literal The Ordered Quantity indicates the quantity of a product that was ordered in the second
     *       uom}
     * 
     */
    public static final String PROPERTY_ORDEREDQUANTITYORDER = "orderedQuantityOrder";

    /**
     * Property client stored in column AD_Client_ID in table M_Storage_Pending 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Storage_Pending 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Storage_Pending 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Storage_Pending 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Storage_Pending 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Storage_Pending 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Storage_Pending 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property id stored in column M_Storage_Pending_ID in table M_Storage_Pending 
     * 
     */
    public static final String PROPERTY_ID = "id";


    public StoragePending() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see StoragePending#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see StoragePending#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see StoragePending#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see StoragePending#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see StoragePending#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see StoragePending#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see StoragePending#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see StoragePending#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see StoragePending#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see StoragePending#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see StoragePending#PROPERTY_RESERVEDQUANTITY
     * 
     */
    public BigDecimal getReservedQuantity() {
        return (BigDecimal) get(PROPERTY_RESERVEDQUANTITY);
    }
    /**
     * @see StoragePending#PROPERTY_RESERVEDQUANTITY
     * 
     */
    public void setReservedQuantity(BigDecimal reservedQuantity) {
        set(PROPERTY_RESERVEDQUANTITY, reservedQuantity);
    }

    /**
     * @see StoragePending#PROPERTY_RESERVEDQUANTITYORDER
     * 
     */
    public BigDecimal getReservedQuantityOrder() {
        return (BigDecimal) get(PROPERTY_RESERVEDQUANTITYORDER);
    }
    /**
     * @see StoragePending#PROPERTY_RESERVEDQUANTITYORDER
     * 
     */
    public void setReservedQuantityOrder(BigDecimal reservedQuantityOrder) {
        set(PROPERTY_RESERVEDQUANTITYORDER, reservedQuantityOrder);
    }

    /**
     * @see StoragePending#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public BigDecimal getOrderedQuantity() {
        return (BigDecimal) get(PROPERTY_ORDEREDQUANTITY);
    }
    /**
     * @see StoragePending#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public void setOrderedQuantity(BigDecimal orderedQuantity) {
        set(PROPERTY_ORDEREDQUANTITY, orderedQuantity);
    }

    /**
     * @see StoragePending#PROPERTY_ORDEREDQUANTITYORDER
     * 
     */
    public BigDecimal getOrderedQuantityOrder() {
        return (BigDecimal) get(PROPERTY_ORDEREDQUANTITYORDER);
    }
    /**
     * @see StoragePending#PROPERTY_ORDEREDQUANTITYORDER
     * 
     */
    public void setOrderedQuantityOrder(BigDecimal orderedQuantityOrder) {
        set(PROPERTY_ORDEREDQUANTITYORDER, orderedQuantityOrder);
    }

    /**
     * @see StoragePending#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see StoragePending#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see StoragePending#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see StoragePending#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see StoragePending#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see StoragePending#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see StoragePending#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see StoragePending#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see StoragePending#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see StoragePending#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see StoragePending#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see StoragePending#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see StoragePending#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see StoragePending#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see StoragePending#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see StoragePending#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

}
