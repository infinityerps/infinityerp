
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
package org.openbravo.model.pricing.pricelist;

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
import org.openbravo.model.common.plm.Product;
/**
 * Entity class for entity PricingProductPrice (stored in table M_ProductPrice).
 * <br>
 * Help: {@literal The Pricing displays the List, Standard and Limit prices for each price list a product is
     *       contained in.
     *       The Price List displays the prices for a product based on the selected price list.
     *       The
     *       Pricing Tab displays the List, Standard and Limit prices for each price list a product is contained
     *       in.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductPrice extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_ProductPrice";
    public static final String ENTITY_NAME = "PricingProductPrice";

    /**
     * Property id stored in column M_ProductPrice_ID in table M_ProductPrice
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property priceListVersion stored in column M_PriceList_Version_ID in table M_ProductPrice<br>
     * Help: {@literal Each Price List can have multiple versions.  The most common use is to indicate the dates
     *       that a Price List is valid for.}
     * 
     */
    public static final String PROPERTY_PRICELISTVERSION = "priceListVersion";

    /**
     * Property product stored in column M_Product_ID in table M_ProductPrice<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property client stored in column AD_Client_ID in table M_ProductPrice 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_ProductPrice 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_ProductPrice 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_ProductPrice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_ProductPrice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_ProductPrice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_ProductPrice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property listPrice stored in column PriceList in table M_ProductPrice<br>
     * Help: {@literal The Net List Price is the official price stated by the selected pricelist and the currency
     *       of the document.}
     * 
     */
    public static final String PROPERTY_LISTPRICE = "listPrice";

    /**
     * Property standardPrice stored in column PriceStd in table M_ProductPrice<br>
     * Help: {@literal The Standard Price indicates the standard or normal price for a product on this price
     *       list. This price might be net or gross depending on its price list configuration.}
     * 
     */
    public static final String PROPERTY_STANDARDPRICE = "standardPrice";

    /**
     * Property priceLimit stored in column PriceLimit in table M_ProductPrice<br>
     * Help: {@literal The Net Price Limit indicates the lowest price for a product stated in the Price List
     *       Currency.}
     * 
     */
    public static final String PROPERTY_PRICELIMIT = "priceLimit";

    /**
     * Property cost stored in column Cost in table M_ProductPrice<br>
     * Help: {@literal Cost amount.}
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property algorithm stored in column Algorithm in table M_ProductPrice
     * 
     */
    public static final String PROPERTY_ALGORITHM = "algorithm";

    /**
     * Property pricingProductPriceExceptionList stored in table M_ProductPrice
     * 
     */
    public static final String PROPERTY_PRICINGPRODUCTPRICEEXCEPTIONLIST = "pricingProductPriceExceptionList";


    public ProductPrice() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COST, new BigDecimal(0));
        setDefaultValue(PROPERTY_ALGORITHM, "S");
        setDefaultValue(PROPERTY_PRICINGPRODUCTPRICEEXCEPTIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductPrice#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductPrice#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductPrice#PROPERTY_PRICELISTVERSION
     * 
     */
    public PriceListVersion getPriceListVersion() {
        return (PriceListVersion) get(PROPERTY_PRICELISTVERSION);
    }
    /**
     * @see ProductPrice#PROPERTY_PRICELISTVERSION
     * 
     */
    public void setPriceListVersion(PriceListVersion priceListVersion) {
        set(PROPERTY_PRICELISTVERSION, priceListVersion);
    }

    /**
     * @see ProductPrice#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductPrice#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductPrice#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductPrice#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductPrice#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductPrice#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductPrice#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductPrice#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductPrice#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductPrice#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductPrice#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductPrice#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductPrice#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductPrice#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductPrice#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductPrice#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductPrice#PROPERTY_LISTPRICE
     * 
     */
    public BigDecimal getListPrice() {
        return (BigDecimal) get(PROPERTY_LISTPRICE);
    }
    /**
     * @see ProductPrice#PROPERTY_LISTPRICE
     * 
     */
    public void setListPrice(BigDecimal listPrice) {
        set(PROPERTY_LISTPRICE, listPrice);
    }

    /**
     * @see ProductPrice#PROPERTY_STANDARDPRICE
     * 
     */
    public BigDecimal getStandardPrice() {
        return (BigDecimal) get(PROPERTY_STANDARDPRICE);
    }
    /**
     * @see ProductPrice#PROPERTY_STANDARDPRICE
     * 
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        set(PROPERTY_STANDARDPRICE, standardPrice);
    }

    /**
     * @see ProductPrice#PROPERTY_PRICELIMIT
     * 
     */
    public BigDecimal getPriceLimit() {
        return (BigDecimal) get(PROPERTY_PRICELIMIT);
    }
    /**
     * @see ProductPrice#PROPERTY_PRICELIMIT
     * 
     */
    public void setPriceLimit(BigDecimal priceLimit) {
        set(PROPERTY_PRICELIMIT, priceLimit);
    }

    /**
     * @see ProductPrice#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see ProductPrice#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see ProductPrice#PROPERTY_ALGORITHM
     * 
     */
    public String getAlgorithm() {
        return (String) get(PROPERTY_ALGORITHM);
    }
    /**
     * @see ProductPrice#PROPERTY_ALGORITHM
     * 
     */
    public void setAlgorithm(String algorithm) {
        set(PROPERTY_ALGORITHM, algorithm);
    }

    /**
     * Help: {@literal The product Price with Exceptions tab allows setting a different unit price for the
     *       selected product in a price list version. The new price can be established to be applicable for a
     *       date range and a specific organization. This new price will be used instead of the unit price coming
     *       from the price list version (product price tab) for the selected organization or any of its children
     *       when fulfilling the date criteria. If there are two exceptions valid for a given organization, that
     *       one with an organization closer to it in the tree structure will be the one chosen to be applied.}<br>
     * @see ProductPriceException
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductPriceException> getPricingProductPriceExceptionList() {
      return (List<ProductPriceException>) get(PROPERTY_PRICINGPRODUCTPRICEEXCEPTIONLIST);
    }

    /**
     * Help: {@literal The product Price with Exceptions tab allows setting a different unit price for the
     *       selected product in a price list version. The new price can be established to be applicable for a
     *       date range and a specific organization. This new price will be used instead of the unit price coming
     *       from the price list version (product price tab) for the selected organization or any of its children
     *       when fulfilling the date criteria. If there are two exceptions valid for a given organization, that
     *       one with an organization closer to it in the tree structure will be the one chosen to be applied.}<br>
     * @see ProductPriceException
     * 
     */
    public void setPricingProductPriceExceptionList(List<ProductPriceException> pricingProductPriceExceptionList) {
        set(PROPERTY_PRICINGPRODUCTPRICEEXCEPTIONLIST, pricingProductPriceExceptionList);
    }

}
