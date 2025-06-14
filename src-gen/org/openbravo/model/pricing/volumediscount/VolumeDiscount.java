
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
package org.openbravo.model.pricing.volumediscount;

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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity PricingVolumeDiscount (stored in table M_Rappel).
 * <br>
 * Help: {@literal Contains all the Volume Discount configurations}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class VolumeDiscount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Rappel";
    public static final String ENTITY_NAME = "PricingVolumeDiscount";

    /**
     * Property id stored in column M_Rappel_ID in table M_Rappel<br>
     * Help: {@literal The ID identifies a unique volume discount}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Rappel 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Rappel 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Rappel 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Rappel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Rappel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Rappel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Rappel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Rappel 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Rappel<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property currency stored in column C_Currency_ID in table M_Rappel<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property includedProduct stored in column Include_Product in table M_Rappel<br>
     * Help: {@literal If it is checked the selected products will be included else they will be excluded.}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCT = "includedProduct";

    /**
     * Property includedProductCategories stored in column Include_Product_Category in table M_Rappel<br>
     * Help: {@literal If it is checked the selected categories will be included else they will be excluded.}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCTCATEGORIES = "includedProductCategories";

    /**
     * Property scaled stored in column Scaled in table M_Rappel<br>
     * Help: {@literal If volume discount is scaled each scale of amount will have a different discount,
     *       otherwise the maximum applicable discount will be applied to every amount.}
     * 
     */
    public static final String PROPERTY_SCALED = "scaled";

    /**
     * Property pricingVolumeDiscountBusinessPartnerList stored in table M_Rappel
     * 
     */
    public static final String PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST = "pricingVolumeDiscountBusinessPartnerList";

    /**
     * Property pricingVolumeDiscountProductList stored in table M_Rappel
     * 
     */
    public static final String PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTLIST = "pricingVolumeDiscountProductList";

    /**
     * Property pricingVolumeDiscountProductCategoryList stored in table M_Rappel
     * 
     */
    public static final String PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTCATEGORYLIST = "pricingVolumeDiscountProductCategoryList";

    /**
     * Property pricingVolumeDiscountScaleList stored in table M_Rappel
     * 
     */
    public static final String PROPERTY_PRICINGVOLUMEDISCOUNTSCALELIST = "pricingVolumeDiscountScaleList";


    public VolumeDiscount() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_INCLUDEDPRODUCT, "N");
        setDefaultValue(PROPERTY_INCLUDEDPRODUCTCATEGORIES, "N");
        setDefaultValue(PROPERTY_SCALED, true);
        setDefaultValue(PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTCATEGORYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGVOLUMEDISCOUNTSCALELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see VolumeDiscount#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see VolumeDiscount#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see VolumeDiscount#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see VolumeDiscount#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see VolumeDiscount#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see VolumeDiscount#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see VolumeDiscount#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see VolumeDiscount#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see VolumeDiscount#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see VolumeDiscount#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see VolumeDiscount#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see VolumeDiscount#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see VolumeDiscount#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see VolumeDiscount#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see VolumeDiscount#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see VolumeDiscount#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see VolumeDiscount#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see VolumeDiscount#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see VolumeDiscount#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see VolumeDiscount#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see VolumeDiscount#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see VolumeDiscount#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see VolumeDiscount#PROPERTY_INCLUDEDPRODUCT
     * 
     */
    public String getIncludedProduct() {
        return (String) get(PROPERTY_INCLUDEDPRODUCT);
    }
    /**
     * @see VolumeDiscount#PROPERTY_INCLUDEDPRODUCT
     * 
     */
    public void setIncludedProduct(String includedProduct) {
        set(PROPERTY_INCLUDEDPRODUCT, includedProduct);
    }

    /**
     * @see VolumeDiscount#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public String getIncludedProductCategories() {
        return (String) get(PROPERTY_INCLUDEDPRODUCTCATEGORIES);
    }
    /**
     * @see VolumeDiscount#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public void setIncludedProductCategories(String includedProductCategories) {
        set(PROPERTY_INCLUDEDPRODUCTCATEGORIES, includedProductCategories);
    }

    /**
     * @see VolumeDiscount#PROPERTY_SCALED
     * 
     */
    public Boolean isScaled() {
        return (Boolean) get(PROPERTY_SCALED);
    }
    /**
     * @see VolumeDiscount#PROPERTY_SCALED
     * 
     */
    public void setScaled(Boolean scaled) {
        set(PROPERTY_SCALED, scaled);
    }

    /**
     * Help: {@literal Contains all the configuration rappels. This rappel only applies to business partners
     *       recorded on this tab.}<br>
     * @see BusinessPartner
     * 
     */
    @SuppressWarnings("unchecked")
    public List<BusinessPartner> getPricingVolumeDiscountBusinessPartnerList() {
      return (List<BusinessPartner>) get(PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST);
    }

    /**
     * Help: {@literal Contains all the configuration rappels. This rappel only applies to business partners
     *       recorded on this tab.}<br>
     * @see BusinessPartner
     * 
     */
    public void setPricingVolumeDiscountBusinessPartnerList(List<BusinessPartner> pricingVolumeDiscountBusinessPartnerList) {
        set(PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST, pricingVolumeDiscountBusinessPartnerList);
    }

    /**
     * Help: {@literal Contains the discount configuration for the product}<br>
     * @see Product
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Product> getPricingVolumeDiscountProductList() {
      return (List<Product>) get(PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTLIST);
    }

    /**
     * Help: {@literal Contains the discount configuration for the product}<br>
     * @see Product
     * 
     */
    public void setPricingVolumeDiscountProductList(List<Product> pricingVolumeDiscountProductList) {
        set(PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTLIST, pricingVolumeDiscountProductList);
    }

    /**
     * Help: {@literal Contains the discount configuration for the product category}<br>
     * @see ProductCategory
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCategory> getPricingVolumeDiscountProductCategoryList() {
      return (List<ProductCategory>) get(PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTCATEGORYLIST);
    }

    /**
     * Help: {@literal Contains the discount configuration for the product category}<br>
     * @see ProductCategory
     * 
     */
    public void setPricingVolumeDiscountProductCategoryList(List<ProductCategory> pricingVolumeDiscountProductCategoryList) {
        set(PROPERTY_PRICINGVOLUMEDISCOUNTPRODUCTCATEGORYLIST, pricingVolumeDiscountProductCategoryList);
    }

    /**
     * Help: {@literal Defines the scales where the discounts will be applied}<br>
     * @see DiscountScale
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DiscountScale> getPricingVolumeDiscountScaleList() {
      return (List<DiscountScale>) get(PROPERTY_PRICINGVOLUMEDISCOUNTSCALELIST);
    }

    /**
     * Help: {@literal Defines the scales where the discounts will be applied}<br>
     * @see DiscountScale
     * 
     */
    public void setPricingVolumeDiscountScaleList(List<DiscountScale> pricingVolumeDiscountScaleList) {
        set(PROPERTY_PRICINGVOLUMEDISCOUNTSCALELIST, pricingVolumeDiscountScaleList);
    }

}
