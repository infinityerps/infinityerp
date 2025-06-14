
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
package org.openbravo.client.widgets;

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
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;
/**
 * Entity class for entity OBWCL_StockByWarehouseView (stored in table OBWCL_Stock_By_Warehouse_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OBWCL_StockByWarehouseView extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBWCL_Stock_By_Warehouse_V";
    public static final String ENTITY_NAME = "OBWCL_StockByWarehouseView";

    /**
     * Property orgname stored in column Orgname in table OBWCL_Stock_By_Warehouse_V
     * 
     */
    public static final String PROPERTY_ORGNAME = "orgname";

    /**
     * Property warehouseName stored in column Warehousename in table OBWCL_Stock_By_Warehouse_V
     * 
     */
    public static final String PROPERTY_WAREHOUSENAME = "warehouseName";

    /**
     * Property organization stored in column AD_Org_ID in table OBWCL_Stock_By_Warehouse_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property searchKey stored in column Value in table OBWCL_Stock_By_Warehouse_V<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property productName stored in column Productname in table OBWCL_Stock_By_Warehouse_V
     * 
     */
    public static final String PROPERTY_PRODUCTNAME = "productName";

    /**
     * Property product stored in column M_Product_ID in table OBWCL_Stock_By_Warehouse_V<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property productCategoryName stored in column Categoryname in table OBWCL_Stock_By_Warehouse_V
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORYNAME = "productCategoryName";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table OBWCL_Stock_By_Warehouse_V<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property uOMName stored in column Uomname in table OBWCL_Stock_By_Warehouse_V
     * 
     */
    public static final String PROPERTY_UOMNAME = "uOMName";

    /**
     * Property quantityOnHand stored in column Qtyonhand in table OBWCL_Stock_By_Warehouse_V<br>
     * Help: {@literal The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.}
     * 
     */
    public static final String PROPERTY_QUANTITYONHAND = "quantityOnHand";

    /**
     * Property description stored in column Description in table OBWCL_Stock_By_Warehouse_V<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table OBWCL_Stock_By_Warehouse_V<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property client stored in column AD_Client_ID in table OBWCL_Stock_By_Warehouse_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property active stored in column Isactive in table OBWCL_Stock_By_Warehouse_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBWCL_Stock_By_Warehouse_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBWCL_Stock_By_Warehouse_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBWCL_Stock_By_Warehouse_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBWCL_Stock_By_Warehouse_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property id stored in column Obwcl_Stock_By_Warehouse_V_ID in table OBWCL_Stock_By_Warehouse_V 
     * 
     */
    public static final String PROPERTY_ID = "id";


    public OBWCL_StockByWarehouseView() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ORGNAME
     * 
     */
    public String getOrgname() {
        return (String) get(PROPERTY_ORGNAME);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ORGNAME
     * 
     */
    public void setOrgname(String orgname) {
        set(PROPERTY_ORGNAME, orgname);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_WAREHOUSENAME
     * 
     */
    public String getWarehouseName() {
        return (String) get(PROPERTY_WAREHOUSENAME);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_WAREHOUSENAME
     * 
     */
    public void setWarehouseName(String warehouseName) {
        set(PROPERTY_WAREHOUSENAME, warehouseName);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCTNAME
     * 
     */
    public String getProductName() {
        return (String) get(PROPERTY_PRODUCTNAME);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCTNAME
     * 
     */
    public void setProductName(String productName) {
        set(PROPERTY_PRODUCTNAME, productName);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCTCATEGORYNAME
     * 
     */
    public String getProductCategoryName() {
        return (String) get(PROPERTY_PRODUCTCATEGORYNAME);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCTCATEGORYNAME
     * 
     */
    public void setProductCategoryName(String productCategoryName) {
        set(PROPERTY_PRODUCTCATEGORYNAME, productCategoryName);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_UOMNAME
     * 
     */
    public String getUOMName() {
        return (String) get(PROPERTY_UOMNAME);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_UOMNAME
     * 
     */
    public void setUOMName(String uOMName) {
        set(PROPERTY_UOMNAME, uOMName);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_QUANTITYONHAND
     * 
     */
    public BigDecimal getQuantityOnHand() {
        return (BigDecimal) get(PROPERTY_QUANTITYONHAND);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_QUANTITYONHAND
     * 
     */
    public void setQuantityOnHand(BigDecimal quantityOnHand) {
        set(PROPERTY_QUANTITYONHAND, quantityOnHand);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OBWCL_StockByWarehouseView#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

}
