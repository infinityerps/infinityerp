
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
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;
/**
 * Entity class for entity PricingPriceListSchemeLine (stored in table M_DiscountSchemaLine).
 * <br>
 * Help: {@literal Pricelists are created based on Product Purchase and Category Discounts. The parameters
     *       listed here allow to copy and calculate pricelists.<BR>The calculation:<UL><LI>Copy and convert
     *       price from referenced price list<LI>result plus Surcharge Amount<L}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PriceListSchemeLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_DiscountSchemaLine";
    public static final String ENTITY_NAME = "PricingPriceListSchemeLine";

    /**
     * Property id stored in column M_DiscountSchemaLine_ID in table M_DiscountSchemaLine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_DiscountSchemaLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_DiscountSchemaLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_DiscountSchemaLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_DiscountSchemaLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_DiscountSchemaLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_DiscountSchemaLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_DiscountSchemaLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property priceListSchema stored in column M_DiscountSchema_ID in table M_DiscountSchemaLine<br>
     * Help: {@literal After calculation of the (standard) price, the trade discount percentage is calculated and
     *       applied resulting in the final price.}
     * 
     */
    public static final String PROPERTY_PRICELISTSCHEMA = "priceListSchema";

    /**
     * Property sequenceNumber stored in column SeqNo in table M_DiscountSchemaLine 
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table M_DiscountSchemaLine<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table M_DiscountSchemaLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property product stored in column M_Product_ID in table M_DiscountSchemaLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property conversionRateType stored in column ConversionRateType in table M_DiscountSchemaLine<br>
     * Help: {@literal The Conversion Rate Type indicates the type of conversion rate.  This allows you to enter
     *       multiple rates for the same currency pair.  For example, one rate may be used for Spot conversions
     *       and a different rate for Revaluations.}
     * 
     */
    public static final String PROPERTY_CONVERSIONRATETYPE = "conversionRateType";

    /**
     * Property conversionDate stored in column ConversionDate in table M_DiscountSchemaLine<br>
     * Help: {@literal The Conversion Date identifies the date used for currency conversion. The conversion rate
     *       chosen must include this date in it's date range}
     * 
     */
    public static final String PROPERTY_CONVERSIONDATE = "conversionDate";

    /**
     * Property baseListPrice stored in column List_Base in table M_DiscountSchemaLine<br>
     * Help: {@literal The List Price Base indicates the price to use as the basis for the calculation of a new
     *       price list.}
     * 
     */
    public static final String PROPERTY_BASELISTPRICE = "baseListPrice";

    /**
     * Property surchargeListPriceAmount stored in column List_AddAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal The List Price Surcharge Amount indicates the amount to be added to the price prior to
     *       multiplication.}
     * 
     */
    public static final String PROPERTY_SURCHARGELISTPRICEAMOUNT = "surchargeListPriceAmount";

    /**
     * Property listPriceDiscount stored in column List_Discount in table M_DiscountSchemaLine<br>
     * Help: {@literal The List Price Discount Percentage indicates the percentage discount which will be
     *       subtracted from the base price.  A negative amount indicates the percentage which will be added to
     *       the base price.}
     * 
     */
    public static final String PROPERTY_LISTPRICEDISCOUNT = "listPriceDiscount";

    /**
     * Property listPriceRounding stored in column List_Rounding in table M_DiscountSchemaLine<br>
     * Help: {@literal The List Price Rounding indicates how the final list price will be rounded.}
     * 
     */
    public static final String PROPERTY_LISTPRICEROUNDING = "listPriceRounding";

    /**
     * Property minListPriceMargin stored in column List_MinAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal The List Price Min Margin indicates the minimum margin for a product.  The margin is
     *       calculated by subtracting the original list price from the newly calculated price.  If this field
     *       contains 0.00 then it is ignored.}
     * 
     */
    public static final String PROPERTY_MINLISTPRICEMARGIN = "minListPriceMargin";

    /**
     * Property maxListPriceMargin stored in column List_MaxAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal The List Price Max Margin indicates the maximum margin for a product.  The margin is
     *       calculated by subtracting the original list price from the newly calculated price.  If this field
     *       contains 0.00 then it is ignored.}
     * 
     */
    public static final String PROPERTY_MAXLISTPRICEMARGIN = "maxListPriceMargin";

    /**
     * Property fixedListPrice stored in column List_Fixed in table M_DiscountSchemaLine<br>
     * Help: {@literal Fixes List Price (not calculated)}
     * 
     */
    public static final String PROPERTY_FIXEDLISTPRICE = "fixedListPrice";

    /**
     * Property standardBasePrice stored in column Std_Base in table M_DiscountSchemaLine<br>
     * Help: {@literal Net unit price before applying this promotion. In case multiple promotions are applied in
     *       cascade, this price is the one after applying all promotions with more priority than current
     *       one.
     *       
     *       This field is populated in case the used price list does not include taxes.}
     * 
     */
    public static final String PROPERTY_STANDARDBASEPRICE = "standardBasePrice";

    /**
     * Property surchargeStandardPriceAmount stored in column Std_AddAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal The Standard Price Surcharge Amount indicates the amount to be added to the price prior to
     *       multiplication.}
     * 
     */
    public static final String PROPERTY_SURCHARGESTANDARDPRICEAMOUNT = "surchargeStandardPriceAmount";

    /**
     * Property standardPriceDiscount stored in column Std_Discount in table M_DiscountSchemaLine<br>
     * Help: {@literal The Standard Price Discount Percentage indicates the percentage discount which will be
     *       subtracted from the base price.  A negative amount indicates the percentage which will be added to
     *       the base price.}
     * 
     */
    public static final String PROPERTY_STANDARDPRICEDISCOUNT = "standardPriceDiscount";

    /**
     * Property standardPriceRounding stored in column Std_Rounding in table M_DiscountSchemaLine<br>
     * Help: {@literal The Standard Price Rounding indicates how the final Standard price will be rounded.}
     * 
     */
    public static final String PROPERTY_STANDARDPRICEROUNDING = "standardPriceRounding";

    /**
     * Property minStandardPriceMargin stored in column Std_MinAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal The Standard Price Min Margin indicates the minimum margin for a product.  The margin is
     *       calculated by subtracting the original Standard price from the newly calculated price.  If this
     *       field contains 0.00 then it is ignored.}
     * 
     */
    public static final String PROPERTY_MINSTANDARDPRICEMARGIN = "minStandardPriceMargin";

    /**
     * Property maxStandardMargin stored in column Std_MaxAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal The Standard Price Max Margin indicates the maximum margin for a product.  The margin is
     *       calculated by subtracting the original Standard price from the newly calculated price.  If this
     *       field contains 0.00 then it is ignored.}
     * 
     */
    public static final String PROPERTY_MAXSTANDARDMARGIN = "maxStandardMargin";

    /**
     * Property fixedStandardPrice stored in column Std_Fixed in table M_DiscountSchemaLine<br>
     * Help: {@literal Fixed Standard Price (not calculated)}
     * 
     */
    public static final String PROPERTY_FIXEDSTANDARDPRICE = "fixedStandardPrice";

    /**
     * Property baseLimitPrice stored in column Limit_Base in table M_DiscountSchemaLine<br>
     * Help: {@literal Identifies the price to be used as the base for calculating a new price list.}
     * 
     */
    public static final String PROPERTY_BASELIMITPRICE = "baseLimitPrice";

    /**
     * Property surchargePriceLimitAmount stored in column Limit_AddAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal Indicates the amount to be added to the Limit price prior to multiplication.}
     * 
     */
    public static final String PROPERTY_SURCHARGEPRICELIMITAMOUNT = "surchargePriceLimitAmount";

    /**
     * Property priceLimitDiscount stored in column Limit_Discount in table M_DiscountSchemaLine<br>
     * Help: {@literal Indicates the discount in percent to be subtracted from base, if negative it will be added
     *       to base price}
     * 
     */
    public static final String PROPERTY_PRICELIMITDISCOUNT = "priceLimitDiscount";

    /**
     * Property priceLimitRounding stored in column Limit_Rounding in table M_DiscountSchemaLine<br>
     * Help: {@literal A drop down list box which indicates the rounding (if any) will apply to the final prices
     *       in this price list.}
     * 
     */
    public static final String PROPERTY_PRICELIMITROUNDING = "priceLimitRounding";

    /**
     * Property limitPriceMinMargin stored in column Limit_MinAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal Indicates the minimum margin for a product.  The margin is calculated by subtracting the
     *       original limit price from the newly calculated price.  If this field contains 0.00 then it is
     *       ignored.}
     * 
     */
    public static final String PROPERTY_LIMITPRICEMINMARGIN = "limitPriceMinMargin";

    /**
     * Property maxPriceLimitMargin stored in column Limit_MaxAmt in table M_DiscountSchemaLine<br>
     * Help: {@literal Indicates the maximum margin for a product.  The margin is calculated by subtracting the
     *       original limit price from the newly calculated price.  If this field contains 0.00 then it is
     *       ignored.}
     * 
     */
    public static final String PROPERTY_MAXPRICELIMITMARGIN = "maxPriceLimitMargin";

    /**
     * Property fixedLimitPrice stored in column Limit_Fixed in table M_DiscountSchemaLine<br>
     * Help: {@literal Fixed Limit Price (not calculated)}
     * 
     */
    public static final String PROPERTY_FIXEDLIMITPRICE = "fixedLimitPrice";

    /**
     * Property listPriceMargin stored in column List_Margin in table M_DiscountSchemaLine
     * 
     */
    public static final String PROPERTY_LISTPRICEMARGIN = "listPriceMargin";

    /**
     * Property unitPriceMargin stored in column STD_Margin in table M_DiscountSchemaLine
     * 
     */
    public static final String PROPERTY_UNITPRICEMARGIN = "unitPriceMargin";

    /**
     * Property limitPriceMargin stored in column Limit_Margin in table M_DiscountSchemaLine
     * 
     */
    public static final String PROPERTY_LIMITPRICEMARGIN = "limitPriceMargin";


    public PriceListSchemeLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CONVERSIONRATETYPE, "S");
        setDefaultValue(PROPERTY_BASELISTPRICE, "L");
        setDefaultValue(PROPERTY_LISTPRICEROUNDING, "C");
        setDefaultValue(PROPERTY_STANDARDBASEPRICE, "S");
        setDefaultValue(PROPERTY_STANDARDPRICEROUNDING, "C");
        setDefaultValue(PROPERTY_BASELIMITPRICE, "X");
        setDefaultValue(PROPERTY_PRICELIMITROUNDING, "C");
        setDefaultValue(PROPERTY_LISTPRICEMARGIN, new BigDecimal(0));
        setDefaultValue(PROPERTY_UNITPRICEMARGIN, new BigDecimal(0));
        setDefaultValue(PROPERTY_LIMITPRICEMARGIN, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_PRICELISTSCHEMA
     * 
     */
    public PriceListSchema getPriceListSchema() {
        return (PriceListSchema) get(PROPERTY_PRICELISTSCHEMA);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_PRICELISTSCHEMA
     * 
     */
    public void setPriceListSchema(PriceListSchema priceListSchema) {
        set(PROPERTY_PRICELISTSCHEMA, priceListSchema);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_CONVERSIONRATETYPE
     * 
     */
    public String getConversionRateType() {
        return (String) get(PROPERTY_CONVERSIONRATETYPE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_CONVERSIONRATETYPE
     * 
     */
    public void setConversionRateType(String conversionRateType) {
        set(PROPERTY_CONVERSIONRATETYPE, conversionRateType);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_CONVERSIONDATE
     * 
     */
    public Date getConversionDate() {
        return (Date) get(PROPERTY_CONVERSIONDATE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_CONVERSIONDATE
     * 
     */
    public void setConversionDate(Date conversionDate) {
        set(PROPERTY_CONVERSIONDATE, conversionDate);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_BASELISTPRICE
     * 
     */
    public String getBaseListPrice() {
        return (String) get(PROPERTY_BASELISTPRICE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_BASELISTPRICE
     * 
     */
    public void setBaseListPrice(String baseListPrice) {
        set(PROPERTY_BASELISTPRICE, baseListPrice);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_SURCHARGELISTPRICEAMOUNT
     * 
     */
    public BigDecimal getSurchargeListPriceAmount() {
        return (BigDecimal) get(PROPERTY_SURCHARGELISTPRICEAMOUNT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_SURCHARGELISTPRICEAMOUNT
     * 
     */
    public void setSurchargeListPriceAmount(BigDecimal surchargeListPriceAmount) {
        set(PROPERTY_SURCHARGELISTPRICEAMOUNT, surchargeListPriceAmount);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_LISTPRICEDISCOUNT
     * 
     */
    public BigDecimal getListPriceDiscount() {
        return (BigDecimal) get(PROPERTY_LISTPRICEDISCOUNT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_LISTPRICEDISCOUNT
     * 
     */
    public void setListPriceDiscount(BigDecimal listPriceDiscount) {
        set(PROPERTY_LISTPRICEDISCOUNT, listPriceDiscount);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_LISTPRICEROUNDING
     * 
     */
    public String getListPriceRounding() {
        return (String) get(PROPERTY_LISTPRICEROUNDING);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_LISTPRICEROUNDING
     * 
     */
    public void setListPriceRounding(String listPriceRounding) {
        set(PROPERTY_LISTPRICEROUNDING, listPriceRounding);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_MINLISTPRICEMARGIN
     * 
     */
    public BigDecimal getMinListPriceMargin() {
        return (BigDecimal) get(PROPERTY_MINLISTPRICEMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_MINLISTPRICEMARGIN
     * 
     */
    public void setMinListPriceMargin(BigDecimal minListPriceMargin) {
        set(PROPERTY_MINLISTPRICEMARGIN, minListPriceMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_MAXLISTPRICEMARGIN
     * 
     */
    public BigDecimal getMaxListPriceMargin() {
        return (BigDecimal) get(PROPERTY_MAXLISTPRICEMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_MAXLISTPRICEMARGIN
     * 
     */
    public void setMaxListPriceMargin(BigDecimal maxListPriceMargin) {
        set(PROPERTY_MAXLISTPRICEMARGIN, maxListPriceMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_FIXEDLISTPRICE
     * 
     */
    public BigDecimal getFixedListPrice() {
        return (BigDecimal) get(PROPERTY_FIXEDLISTPRICE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_FIXEDLISTPRICE
     * 
     */
    public void setFixedListPrice(BigDecimal fixedListPrice) {
        set(PROPERTY_FIXEDLISTPRICE, fixedListPrice);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_STANDARDBASEPRICE
     * 
     */
    public String getStandardBasePrice() {
        return (String) get(PROPERTY_STANDARDBASEPRICE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_STANDARDBASEPRICE
     * 
     */
    public void setStandardBasePrice(String standardBasePrice) {
        set(PROPERTY_STANDARDBASEPRICE, standardBasePrice);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_SURCHARGESTANDARDPRICEAMOUNT
     * 
     */
    public BigDecimal getSurchargeStandardPriceAmount() {
        return (BigDecimal) get(PROPERTY_SURCHARGESTANDARDPRICEAMOUNT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_SURCHARGESTANDARDPRICEAMOUNT
     * 
     */
    public void setSurchargeStandardPriceAmount(BigDecimal surchargeStandardPriceAmount) {
        set(PROPERTY_SURCHARGESTANDARDPRICEAMOUNT, surchargeStandardPriceAmount);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_STANDARDPRICEDISCOUNT
     * 
     */
    public BigDecimal getStandardPriceDiscount() {
        return (BigDecimal) get(PROPERTY_STANDARDPRICEDISCOUNT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_STANDARDPRICEDISCOUNT
     * 
     */
    public void setStandardPriceDiscount(BigDecimal standardPriceDiscount) {
        set(PROPERTY_STANDARDPRICEDISCOUNT, standardPriceDiscount);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_STANDARDPRICEROUNDING
     * 
     */
    public String getStandardPriceRounding() {
        return (String) get(PROPERTY_STANDARDPRICEROUNDING);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_STANDARDPRICEROUNDING
     * 
     */
    public void setStandardPriceRounding(String standardPriceRounding) {
        set(PROPERTY_STANDARDPRICEROUNDING, standardPriceRounding);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_MINSTANDARDPRICEMARGIN
     * 
     */
    public BigDecimal getMinStandardPriceMargin() {
        return (BigDecimal) get(PROPERTY_MINSTANDARDPRICEMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_MINSTANDARDPRICEMARGIN
     * 
     */
    public void setMinStandardPriceMargin(BigDecimal minStandardPriceMargin) {
        set(PROPERTY_MINSTANDARDPRICEMARGIN, minStandardPriceMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_MAXSTANDARDMARGIN
     * 
     */
    public BigDecimal getMaxStandardMargin() {
        return (BigDecimal) get(PROPERTY_MAXSTANDARDMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_MAXSTANDARDMARGIN
     * 
     */
    public void setMaxStandardMargin(BigDecimal maxStandardMargin) {
        set(PROPERTY_MAXSTANDARDMARGIN, maxStandardMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_FIXEDSTANDARDPRICE
     * 
     */
    public BigDecimal getFixedStandardPrice() {
        return (BigDecimal) get(PROPERTY_FIXEDSTANDARDPRICE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_FIXEDSTANDARDPRICE
     * 
     */
    public void setFixedStandardPrice(BigDecimal fixedStandardPrice) {
        set(PROPERTY_FIXEDSTANDARDPRICE, fixedStandardPrice);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_BASELIMITPRICE
     * 
     */
    public String getBaseLimitPrice() {
        return (String) get(PROPERTY_BASELIMITPRICE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_BASELIMITPRICE
     * 
     */
    public void setBaseLimitPrice(String baseLimitPrice) {
        set(PROPERTY_BASELIMITPRICE, baseLimitPrice);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_SURCHARGEPRICELIMITAMOUNT
     * 
     */
    public BigDecimal getSurchargePriceLimitAmount() {
        return (BigDecimal) get(PROPERTY_SURCHARGEPRICELIMITAMOUNT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_SURCHARGEPRICELIMITAMOUNT
     * 
     */
    public void setSurchargePriceLimitAmount(BigDecimal surchargePriceLimitAmount) {
        set(PROPERTY_SURCHARGEPRICELIMITAMOUNT, surchargePriceLimitAmount);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_PRICELIMITDISCOUNT
     * 
     */
    public BigDecimal getPriceLimitDiscount() {
        return (BigDecimal) get(PROPERTY_PRICELIMITDISCOUNT);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_PRICELIMITDISCOUNT
     * 
     */
    public void setPriceLimitDiscount(BigDecimal priceLimitDiscount) {
        set(PROPERTY_PRICELIMITDISCOUNT, priceLimitDiscount);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_PRICELIMITROUNDING
     * 
     */
    public String getPriceLimitRounding() {
        return (String) get(PROPERTY_PRICELIMITROUNDING);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_PRICELIMITROUNDING
     * 
     */
    public void setPriceLimitRounding(String priceLimitRounding) {
        set(PROPERTY_PRICELIMITROUNDING, priceLimitRounding);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_LIMITPRICEMINMARGIN
     * 
     */
    public BigDecimal getLimitPriceMinMargin() {
        return (BigDecimal) get(PROPERTY_LIMITPRICEMINMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_LIMITPRICEMINMARGIN
     * 
     */
    public void setLimitPriceMinMargin(BigDecimal limitPriceMinMargin) {
        set(PROPERTY_LIMITPRICEMINMARGIN, limitPriceMinMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_MAXPRICELIMITMARGIN
     * 
     */
    public BigDecimal getMaxPriceLimitMargin() {
        return (BigDecimal) get(PROPERTY_MAXPRICELIMITMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_MAXPRICELIMITMARGIN
     * 
     */
    public void setMaxPriceLimitMargin(BigDecimal maxPriceLimitMargin) {
        set(PROPERTY_MAXPRICELIMITMARGIN, maxPriceLimitMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_FIXEDLIMITPRICE
     * 
     */
    public BigDecimal getFixedLimitPrice() {
        return (BigDecimal) get(PROPERTY_FIXEDLIMITPRICE);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_FIXEDLIMITPRICE
     * 
     */
    public void setFixedLimitPrice(BigDecimal fixedLimitPrice) {
        set(PROPERTY_FIXEDLIMITPRICE, fixedLimitPrice);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_LISTPRICEMARGIN
     * 
     */
    public BigDecimal getListPriceMargin() {
        return (BigDecimal) get(PROPERTY_LISTPRICEMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_LISTPRICEMARGIN
     * 
     */
    public void setListPriceMargin(BigDecimal listPriceMargin) {
        set(PROPERTY_LISTPRICEMARGIN, listPriceMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_UNITPRICEMARGIN
     * 
     */
    public BigDecimal getUnitPriceMargin() {
        return (BigDecimal) get(PROPERTY_UNITPRICEMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_UNITPRICEMARGIN
     * 
     */
    public void setUnitPriceMargin(BigDecimal unitPriceMargin) {
        set(PROPERTY_UNITPRICEMARGIN, unitPriceMargin);
    }

    /**
     * @see PriceListSchemeLine#PROPERTY_LIMITPRICEMARGIN
     * 
     */
    public BigDecimal getLimitPriceMargin() {
        return (BigDecimal) get(PROPERTY_LIMITPRICEMARGIN);
    }
    /**
     * @see PriceListSchemeLine#PROPERTY_LIMITPRICEMARGIN
     * 
     */
    public void setLimitPriceMargin(BigDecimal limitPriceMargin) {
        set(PROPERTY_LIMITPRICEMARGIN, limitPriceMargin);
    }

}
