
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
package org.openbravo.model.common.plm;

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
import org.openbravo.model.pricing.pricelist.ProductPrice;
/**
 * Entity class for entity ProductByPriceAndWarehouse (stored in table M_Product_Price_Warehouse_v).
 * <br>
 * Help: {@literal View that retrieves the products by price list version and warehouse including prices and
     *       stock information. This view also takes care of BOM type products to calculate the prices and
     *       quantities based on their parts.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductByPriceAndWarehouse extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Price_Warehouse_v";
    public static final String ENTITY_NAME = "ProductByPriceAndWarehouse";

    /**
     * Property id stored in column M_Product_Price_Warehouse_V_ID in table M_Product_Price_Warehouse_v 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_Price_Warehouse_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_Price_Warehouse_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Product_Price_Warehouse_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property updated stored in column Updated in table M_Product_Price_Warehouse_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Product_Price_Warehouse_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property creationDate stored in column Created in table M_Product_Price_Warehouse_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Product_Price_Warehouse_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property product stored in column M_Product_ID in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property productPrice stored in column M_Productprice_ID in table M_Product_Price_Warehouse_v
     * 
     */
    public static final String PROPERTY_PRODUCTPRICE = "productPrice";

    /**
     * Property available stored in column QTY_Available in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal Available quantity of products}
     * 
     */
    public static final String PROPERTY_AVAILABLE = "available";

    /**
     * Property qtyOnHand stored in column QTY_Onhand in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal Quantity of products stored in the warehouse}
     * 
     */
    public static final String PROPERTY_QTYONHAND = "qtyOnHand";

    /**
     * Property qtyReserved stored in column QTY_Reserved in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal Quantity of products pending to deliver}
     * 
     */
    public static final String PROPERTY_QTYRESERVED = "qtyReserved";

    /**
     * Property qtyOrdered stored in column QTY_Ordered in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal Quantity of products awaiting to receipt.}
     * 
     */
    public static final String PROPERTY_QTYORDERED = "qtyOrdered";

    /**
     * Property netListPrice stored in column Pricelist in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal The Net List Price is the official price stated by the selected pricelist and the currency
     *       of the document.}
     * 
     */
    public static final String PROPERTY_NETLISTPRICE = "netListPrice";

    /**
     * Property standardPrice stored in column Pricestd in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal The Standard Price indicates the standard or normal price for a product on this price
     *       list}
     * 
     */
    public static final String PROPERTY_STANDARDPRICE = "standardPrice";

    /**
     * Property priceLimit stored in column Pricelimit in table M_Product_Price_Warehouse_v<br>
     * Help: {@literal The Net Price Limit indicates the lowest price for a product stated in the Price List
     *       Currency.}
     * 
     */
    public static final String PROPERTY_PRICELIMIT = "priceLimit";

    /**
     * Property orgwarehouse stored in column Orgwarehouse in table M_Product_Price_Warehouse_v
     * 
     */
    public static final String PROPERTY_ORGWAREHOUSE = "orgwarehouse";


    public ProductByPriceAndWarehouse() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_PRODUCTPRICE
     * 
     */
    public ProductPrice getProductPrice() {
        return (ProductPrice) get(PROPERTY_PRODUCTPRICE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_PRODUCTPRICE
     * 
     */
    public void setProductPrice(ProductPrice productPrice) {
        set(PROPERTY_PRODUCTPRICE, productPrice);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_AVAILABLE
     * 
     */
    public BigDecimal getAvailable() {
        return (BigDecimal) get(PROPERTY_AVAILABLE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_AVAILABLE
     * 
     */
    public void setAvailable(BigDecimal available) {
        set(PROPERTY_AVAILABLE, available);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_QTYONHAND
     * 
     */
    public BigDecimal getQtyOnHand() {
        return (BigDecimal) get(PROPERTY_QTYONHAND);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_QTYONHAND
     * 
     */
    public void setQtyOnHand(BigDecimal qtyOnHand) {
        set(PROPERTY_QTYONHAND, qtyOnHand);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_QTYRESERVED
     * 
     */
    public BigDecimal getQtyReserved() {
        return (BigDecimal) get(PROPERTY_QTYRESERVED);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_QTYRESERVED
     * 
     */
    public void setQtyReserved(BigDecimal qtyReserved) {
        set(PROPERTY_QTYRESERVED, qtyReserved);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_QTYORDERED
     * 
     */
    public BigDecimal getQtyOrdered() {
        return (BigDecimal) get(PROPERTY_QTYORDERED);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_QTYORDERED
     * 
     */
    public void setQtyOrdered(BigDecimal qtyOrdered) {
        set(PROPERTY_QTYORDERED, qtyOrdered);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_NETLISTPRICE
     * 
     */
    public BigDecimal getNetListPrice() {
        return (BigDecimal) get(PROPERTY_NETLISTPRICE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_NETLISTPRICE
     * 
     */
    public void setNetListPrice(BigDecimal netListPrice) {
        set(PROPERTY_NETLISTPRICE, netListPrice);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_STANDARDPRICE
     * 
     */
    public BigDecimal getStandardPrice() {
        return (BigDecimal) get(PROPERTY_STANDARDPRICE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_STANDARDPRICE
     * 
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        set(PROPERTY_STANDARDPRICE, standardPrice);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_PRICELIMIT
     * 
     */
    public BigDecimal getPriceLimit() {
        return (BigDecimal) get(PROPERTY_PRICELIMIT);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_PRICELIMIT
     * 
     */
    public void setPriceLimit(BigDecimal priceLimit) {
        set(PROPERTY_PRICELIMIT, priceLimit);
    }

    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ORGWAREHOUSE
     * 
     */
    public String getOrgwarehouse() {
        return (String) get(PROPERTY_ORGWAREHOUSE);
    }
    /**
     * @see ProductByPriceAndWarehouse#PROPERTY_ORGWAREHOUSE
     * 
     */
    public void setOrgwarehouse(String orgwarehouse) {
        set(PROPERTY_ORGWAREHOUSE, orgwarehouse);
    }

}
