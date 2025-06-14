
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
package org.openbravo.model.pricing.priceadjustment;

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
/**
 * Entity class for entity PricingAdjustmentProduct (stored in table M_Offer_Product).
 * <br>
 * Help: {@literal Used to select the different products related to the Price Adjustment.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Product extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Offer_Product";
    public static final String ENTITY_NAME = "PricingAdjustmentProduct";

    /**
     * Property id stored in column M_Offer_Product_ID in table M_Offer_Product 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Offer_Product 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Offer_Product 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Offer_Product 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Offer_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Offer_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Offer_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Offer_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property priceAdjustment stored in column M_Offer_ID in table M_Offer_Product<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENT = "priceAdjustment";

    /**
     * Property product stored in column M_Product_ID in table M_Offer_Product<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property discount stored in column Discount in table M_Offer_Product<br>
     * Help: {@literal The Discount indicates the discount applied or taken as a percentage.}
     * 
     */
    public static final String PROPERTY_DISCOUNT = "discount";

    /**
     * Property discountAmount stored in column Addamt in table M_Offer_Product<br>
     * Help: {@literal Fixed discount amount}
     * 
     */
    public static final String PROPERTY_DISCOUNTAMOUNT = "discountAmount";

    /**
     * Property fixedPrice stored in column Fixed in table M_Offer_Product<br>
     * Help: {@literal Fixed price for the promotion. When the promotion is applied, this is the final price the
     *       product will have.}
     * 
     */
    public static final String PROPERTY_FIXEDPRICE = "fixedPrice";

    /**
     * Property startingDate stored in column Datefrom in table M_Offer_Product<br>
     * Help: {@literal The Date From indicates the starting date of a range.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column Dateto in table M_Offer_Product<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property priceAdjustmentType stored in column Price_Adjustment_Type in table M_Offer_Product<br>
     * Help: {@literal This list will decide the discount type to apply for all the products. Only visible when
     *       ‘Price Adjustment Level’ is ‘Set the same price adjustment for all products’.
     *       }
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENTTYPE = "priceAdjustmentType";


    public Product() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PRICEADJUSTMENTTYPE, "P");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Product#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Product#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Product#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Product#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Product#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Product#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Product#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Product#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Product#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Product#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Product#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Product#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Product#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Product#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Product#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Product#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Product#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public PriceAdjustment getPriceAdjustment() {
        return (PriceAdjustment) get(PROPERTY_PRICEADJUSTMENT);
    }
    /**
     * @see Product#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
        set(PROPERTY_PRICEADJUSTMENT, priceAdjustment);
    }

    /**
     * @see Product#PROPERTY_PRODUCT
     * 
     */
    public org.openbravo.model.common.plm.Product getProduct() {
        return (org.openbravo.model.common.plm.Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see Product#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(org.openbravo.model.common.plm.Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see Product#PROPERTY_DISCOUNT
     * 
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) get(PROPERTY_DISCOUNT);
    }
    /**
     * @see Product#PROPERTY_DISCOUNT
     * 
     */
    public void setDiscount(BigDecimal discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    /**
     * @see Product#PROPERTY_DISCOUNTAMOUNT
     * 
     */
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(PROPERTY_DISCOUNTAMOUNT);
    }
    /**
     * @see Product#PROPERTY_DISCOUNTAMOUNT
     * 
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        set(PROPERTY_DISCOUNTAMOUNT, discountAmount);
    }

    /**
     * @see Product#PROPERTY_FIXEDPRICE
     * 
     */
    public BigDecimal getFixedPrice() {
        return (BigDecimal) get(PROPERTY_FIXEDPRICE);
    }
    /**
     * @see Product#PROPERTY_FIXEDPRICE
     * 
     */
    public void setFixedPrice(BigDecimal fixedPrice) {
        set(PROPERTY_FIXEDPRICE, fixedPrice);
    }

    /**
     * @see Product#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see Product#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see Product#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see Product#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see Product#PROPERTY_PRICEADJUSTMENTTYPE
     * 
     */
    public String getPriceAdjustmentType() {
        return (String) get(PROPERTY_PRICEADJUSTMENTTYPE);
    }
    /**
     * @see Product#PROPERTY_PRICEADJUSTMENTTYPE
     * 
     */
    public void setPriceAdjustmentType(String priceAdjustmentType) {
        set(PROPERTY_PRICEADJUSTMENTTYPE, priceAdjustmentType);
    }

}
