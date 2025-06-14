
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
import java.sql.Timestamp;
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
/**
 * Entity class for entity PricingAdjustment (stored in table M_Offer).
 * <br>
 * Help: {@literal Defines the Promotion/Discount main caracteristiques such as Discount Type, how it is
     *       filtered and actual discount information based on type.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PriceAdjustment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Offer";
    public static final String ENTITY_NAME = "PricingAdjustment";

    /**
     * Property id stored in column M_Offer_ID in table M_Offer<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Offer 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Offer 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Offer 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Offer 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property priority stored in column Priority in table M_Offer<br>
     * Help: {@literal The Priority indicates the importance of this request.}
     * 
     */
    public static final String PROPERTY_PRIORITY = "priority";

    /**
     * Property discountAmount stored in column Addamt in table M_Offer<br>
     * Help: {@literal Fixed discount amount}
     * 
     */
    public static final String PROPERTY_DISCOUNTAMOUNT = "discountAmount";

    /**
     * Property discount stored in column Discount in table M_Offer<br>
     * Help: {@literal The Discount indicates the discount applied or taken as a percentage.}
     * 
     */
    public static final String PROPERTY_DISCOUNT = "discount";

    /**
     * Property fixedPrice stored in column Fixed in table M_Offer<br>
     * Help: {@literal Fixed price for the promotion. When the promotion is applied, this is the final price the
     *       product will have.}
     * 
     */
    public static final String PROPERTY_FIXEDPRICE = "fixedPrice";

    /**
     * Property startingDate stored in column DateFrom in table M_Offer<br>
     * Help: {@literal The Date From indicates the starting date of a range.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column DateTo in table M_Offer<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property includedBusinessPartners stored in column BPartner_Selection in table M_Offer<br>
     * Help: {@literal Business Partner Selection Mode is the way Business Partners will be selected.}
     * 
     */
    public static final String PROPERTY_INCLUDEDBUSINESSPARTNERS = "includedBusinessPartners";

    /**
     * Property includedBPCategories stored in column BP_Group_Selection in table M_Offer<br>
     * Help: {@literal Defines the way Business Partner Groups will be selected (including or excluding the taken
     *       ones)}
     * 
     */
    public static final String PROPERTY_INCLUDEDBPCATEGORIES = "includedBPCategories";

    /**
     * Property includedProducts stored in column Product_Selection in table M_Offer<br>
     * Help: {@literal Defines the way Products will be selected (including or excluding the taken ones)}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCTS = "includedProducts";

    /**
     * Property includedProductCategories stored in column Prod_Cat_Selection in table M_Offer<br>
     * Help: {@literal Defines the way Product Categories will be selected (including or excluding the taken
     *       ones)}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCTCATEGORIES = "includedProductCategories";

    /**
     * Property description stored in column Description in table M_Offer<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property includePriceLists stored in column Pricelist_Selection in table M_Offer<br>
     * Help: {@literal Defines the way Price Lists will be selected (including or excluding the taken ones)}
     * 
     */
    public static final String PROPERTY_INCLUDEPRICELISTS = "includePriceLists";

    /**
     * Property minQuantity stored in column Qty_From in table M_Offer<br>
     * Help: {@literal Quantity From is the minimum amount that the offer will be applied from.}
     * 
     */
    public static final String PROPERTY_MINQUANTITY = "minQuantity";

    /**
     * Property maxQuantity stored in column Qty_To in table M_Offer<br>
     * Help: {@literal Quantity to is the maximum amount to apply the offer.}
     * 
     */
    public static final String PROPERTY_MAXQUANTITY = "maxQuantity";

    /**
     * Property discountType stored in column M_Offer_Type_ID in table M_Offer<br>
     * Help: {@literal Discounts and Promotions functionality allows to apply different rules to order/invoice
     *       lines to adjust pricing. A type is each of these kinds of rules.}
     * 
     */
    public static final String PROPERTY_DISCOUNTTYPE = "discountType";

    /**
     * Property applyNext stored in column Apply_Next in table M_Offer<br>
     * Help: {@literal In case there are other Promotions and Discounts applicable to this same line with less
     *       priority than this one, this flag decides whether the next one should be applied or not.}
     * 
     */
    public static final String PROPERTY_APPLYNEXT = "applyNext";

    /**
     * Property printName stored in column Print_Name in table M_Offer<br>
     * Help: {@literal Name that will be shown to final user in UI and reports to identify current promotion. In
     *       case it is empty, name will be used instead. In general, name should be used internally, whereas
     *       printed name is intended to be read by user.}
     * 
     */
    public static final String PROPERTY_PRINTNAME = "printName";

    /**
     * Property includedOrganizations stored in column Org_Selection in table M_Offer
     * 
     */
    public static final String PROPERTY_INCLUDEDORGANIZATIONS = "includedOrganizations";

    /**
     * Property ismultiple stored in column Ismultiple in table M_Offer<br>
     * Help: {@literal The discount will be applied only if the quantity ordered fits to the specified package
     *       quantity or a multiple.}
     * 
     */
    public static final String PROPERTY_ISMULTIPLE = "ismultiple";

    /**
     * Property multiple stored in column Multiple in table M_Offer<br>
     * Help: {@literal Units per package}
     * 
     */
    public static final String PROPERTY_MULTIPLE = "multiple";

    /**
     * Property includedCharacteristics stored in column Characteristics_Selection in table M_Offer<br>
     * Help: {@literal If the rule is defined as "All Characteristics", then a product with any characteristics
     *       qualifies to be included for the rule.
     *       If the rule is defined as "All of the values defined", then a
     *       product must have all the characteristics defined here qualifies to be included for the rule.
     *       If the
     *       rule is defined as "Any of the values defined", then a product that has at least one of the
     *       characteristics defined here qualifies to be included for the rule.}
     * 
     */
    public static final String PROPERTY_INCLUDEDCHARACTERISTICS = "includedCharacteristics";

    /**
     * Property setSelection stored in column BP_Set_Selection in table M_Offer<br>
     * Help: {@literal Business Partner Set Selection Mode is the way Business Partners will be selected.}
     * 
     */
    public static final String PROPERTY_SETSELECTION = "setSelection";

    /**
     * Property monday stored in column Monday in table M_Offer<br>
     * Help: {@literal Allows to apply the discount on Monday}
     * 
     */
    public static final String PROPERTY_MONDAY = "monday";

    /**
     * Property tuesday stored in column Tuesday in table M_Offer<br>
     * Help: {@literal Allows to apply the discount on Tuesdays}
     * 
     */
    public static final String PROPERTY_TUESDAY = "tuesday";

    /**
     * Property wednesday stored in column Wednesday in table M_Offer<br>
     * Help: {@literal Allows to apply the discount on Wednesdays}
     * 
     */
    public static final String PROPERTY_WEDNESDAY = "wednesday";

    /**
     * Property thursday stored in column Thursday in table M_Offer<br>
     * Help: {@literal Allows to apply the discount on Thursdays}
     * 
     */
    public static final String PROPERTY_THURSDAY = "thursday";

    /**
     * Property friday stored in column Friday in table M_Offer<br>
     * Help: {@literal Allows to apply the discount on Fridays}
     * 
     */
    public static final String PROPERTY_FRIDAY = "friday";

    /**
     * Property saturday stored in column Saturday in table M_Offer<br>
     * Help: {@literal Allows to apply the discount on Saturdays}
     * 
     */
    public static final String PROPERTY_SATURDAY = "saturday";

    /**
     * Property sunday stored in column Sunday in table M_Offer<br>
     * Help: {@literal Allows to apply the discount on Sundays}
     * 
     */
    public static final String PROPERTY_SUNDAY = "sunday";

    /**
     * Property allweekdays stored in column Allweekdays in table M_Offer<br>
     * Help: {@literal Allows to apply the discount the whole week}
     * 
     */
    public static final String PROPERTY_ALLWEEKDAYS = "allweekdays";

    /**
     * Property startingtime stored in column Startingtime in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIME = "startingtime";

    /**
     * Property endingtime stored in column Endingtime in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIME = "endingtime";

    /**
     * Property startingtimemonday stored in column Startingtimemonday in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIMEMONDAY = "startingtimemonday";

    /**
     * Property startingtimetuesday stored in column Startingtimetuesday in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIMETUESDAY = "startingtimetuesday";

    /**
     * Property startingtimewednesday stored in column Startingtimewednesday in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIMEWEDNESDAY = "startingtimewednesday";

    /**
     * Property startingtimethursday stored in column Startingtimethursday in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIMETHURSDAY = "startingtimethursday";

    /**
     * Property startingtimefriday stored in column Startingtimefriday in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIMEFRIDAY = "startingtimefriday";

    /**
     * Property startingtimesaturday stored in column Startingtimesaturday in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIMESATURDAY = "startingtimesaturday";

    /**
     * Property startingtimesunday stored in column Startingtimesunday in table M_Offer
     * 
     */
    public static final String PROPERTY_STARTINGTIMESUNDAY = "startingtimesunday";

    /**
     * Property endingtimemonday stored in column Endingtimemonday in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIMEMONDAY = "endingtimemonday";

    /**
     * Property endingtimetuesday stored in column Endingtimetuesday in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIMETUESDAY = "endingtimetuesday";

    /**
     * Property endingtimewednesday stored in column Endingtimewednesday in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIMEWEDNESDAY = "endingtimewednesday";

    /**
     * Property endingtimethursday stored in column Endingtimethursday in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIMETHURSDAY = "endingtimethursday";

    /**
     * Property endingtimefriday stored in column Endingtimefriday in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIMEFRIDAY = "endingtimefriday";

    /**
     * Property endingtimesaturday stored in column Endingtimesaturday in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIMESATURDAY = "endingtimesaturday";

    /**
     * Property endingtimesunday stored in column Endingtimesunday in table M_Offer
     * 
     */
    public static final String PROPERTY_ENDINGTIMESUNDAY = "endingtimesunday";

    /**
     * Property conforgprocess stored in column Conforgprocess in table M_Offer
     * 
     */
    public static final String PROPERTY_CONFORGPROCESS = "conforgprocess";

    /**
     * Property confprodcatprocess stored in column Confprodcatprocess in table M_Offer
     * 
     */
    public static final String PROPERTY_CONFPRODCATPROCESS = "confprodcatprocess";

    /**
     * Property confprodprocess stored in column Confprodprocess in table M_Offer
     * 
     */
    public static final String PROPERTY_CONFPRODPROCESS = "confprodprocess";

    /**
     * Property characteristicsExclSelection stored in column Characteristics_Excl_Selection in table M_Offer<br>
     * Help: {@literal If the rule is defined as "All of the values defined", then a product must have all the
     *       characteristics defined here qualifies to be excluded for the rule.
     *       If the rule is defined as "Any
     *       of the values defined", then a product that has at least one of the characteristics defined here
     *       qualifies to be excluded for the rule.}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICSEXCLSELECTION = "characteristicsExclSelection";

    /**
     * Property bpartnerExtrefSelection stored in column Bpartner_Extref_Selection in table M_Offer<br>
     * Help: {@literal External Business Partner Reference Selection Mode is the way External Business Partner
     *       References will be selected.}
     * 
     */
    public static final String PROPERTY_BPARTNEREXTREFSELECTION = "bpartnerExtrefSelection";

    /**
     * Property verifyPriceLimit stored in column Verify_Price_Limit in table M_Offer
     * 
     */
    public static final String PROPERTY_VERIFYPRICELIMIT = "verifyPriceLimit";

    /**
     * Property searchKey stored in column Value in table M_Offer<br>
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
     * Property applyToProductsUpToTheMaxQuantity stored in column Isuptomaxqty in table M_Offer
     * 
     */
    public static final String PROPERTY_APPLYTOPRODUCTSUPTOTHEMAXQUANTITY = "applyToProductsUpToTheMaxQuantity";

    /**
     * Property displayUpsellingmsg stored in column Display_Upsellingmsg in table M_Offer<br>
     * Help: {@literal If checked, a message will be shown in the screen whenever one more product can trigger
     *       the discount for the current ticket}
     * 
     */
    public static final String PROPERTY_DISPLAYUPSELLINGMSG = "displayUpsellingmsg";

    /**
     * Property priceAdjustmentScope stored in column Price_Adjustment_Scope in table M_Offer<br>
     * Help: {@literal This list will decide if the adjustment is applied to all the products or if a different
     *       discount should be applied for each one. Only visible if Discount type is Price adjustment}
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENTSCOPE = "priceAdjustmentScope";

    /**
     * Property priceAdjustmentType stored in column Price_Adjustment_Type in table M_Offer<br>
     * Help: {@literal This list will decide the discount type to apply for all the products. Only visible when
     *       ‘Price Adjustment Level’ is ‘Set the same price adjustment for all products’.
     *       }
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENTTYPE = "priceAdjustmentType";

    /**
     * Property priorityRule stored in column Applicationpriorityrule in table M_Offer<br>
     * Help: {@literal The Priority indicates the importance (high, medium, low) of this document}
     * 
     */
    public static final String PROPERTY_PRIORITYRULE = "priorityRule";

    /**
     * Property priceAdjustmentIncompatibilityList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENTINCOMPATIBILITYLIST = "priceAdjustmentIncompatibilityList";

    /**
     * Property pricingAdjustmentAvailabilityList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTAVAILABILITYLIST = "pricingAdjustmentAvailabilityList";

    /**
     * Property pricingAdjustmentBusinessPartnerList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERLIST = "pricingAdjustmentBusinessPartnerList";

    /**
     * Property pricingAdjustmentBusinessPartnerExtRefList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNEREXTREFLIST = "pricingAdjustmentBusinessPartnerExtRefList";

    /**
     * Property pricingAdjustmentBusinessPartnerGroupList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERGROUPLIST = "pricingAdjustmentBusinessPartnerGroupList";

    /**
     * Property pricingAdjustmentBusinessPartnerSetList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERSETLIST = "pricingAdjustmentBusinessPartnerSetList";

    /**
     * Property pricingAdjustmentCharacteristicList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST = "pricingAdjustmentCharacteristicList";

    /**
     * Property pricingAdjustmentOrganizationList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTORGANIZATIONLIST = "pricingAdjustmentOrganizationList";

    /**
     * Property pricingAdjustmentPriceListList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTPRICELISTLIST = "pricingAdjustmentPriceListList";

    /**
     * Property pricingAdjustmentProductList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTPRODUCTLIST = "pricingAdjustmentProductList";

    /**
     * Property pricingAdjustmentProductCategoryList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTPRODUCTCATEGORYLIST = "pricingAdjustmentProductCategoryList";

    /**
     * Property pricingAdjustmentTrlList stored in table M_Offer
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTTRLLIST = "pricingAdjustmentTrlList";


    public PriceAdjustment() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PRIORITY, (long) 0);
        setDefaultValue(PROPERTY_INCLUDEDBUSINESSPARTNERS, "Y");
        setDefaultValue(PROPERTY_INCLUDEDBPCATEGORIES, "Y");
        setDefaultValue(PROPERTY_INCLUDEDPRODUCTS, "Y");
        setDefaultValue(PROPERTY_INCLUDEDPRODUCTCATEGORIES, "Y");
        setDefaultValue(PROPERTY_INCLUDEPRICELISTS, "Y");
        setDefaultValue(PROPERTY_APPLYNEXT, true);
        setDefaultValue(PROPERTY_INCLUDEDORGANIZATIONS, "Y");
        setDefaultValue(PROPERTY_ISMULTIPLE, false);
        setDefaultValue(PROPERTY_INCLUDEDCHARACTERISTICS, "Y");
        setDefaultValue(PROPERTY_SETSELECTION, "Y");
        setDefaultValue(PROPERTY_MONDAY, false);
        setDefaultValue(PROPERTY_TUESDAY, false);
        setDefaultValue(PROPERTY_WEDNESDAY, false);
        setDefaultValue(PROPERTY_THURSDAY, false);
        setDefaultValue(PROPERTY_FRIDAY, false);
        setDefaultValue(PROPERTY_SATURDAY, false);
        setDefaultValue(PROPERTY_SUNDAY, false);
        setDefaultValue(PROPERTY_ALLWEEKDAYS, true);
        setDefaultValue(PROPERTY_CONFORGPROCESS, false);
        setDefaultValue(PROPERTY_CONFPRODCATPROCESS, false);
        setDefaultValue(PROPERTY_CONFPRODPROCESS, false);
        setDefaultValue(PROPERTY_CHARACTERISTICSEXCLSELECTION, "A");
        setDefaultValue(PROPERTY_BPARTNEREXTREFSELECTION, "Y");
        setDefaultValue(PROPERTY_VERIFYPRICELIMIT, true);
        setDefaultValue(PROPERTY_APPLYTOPRODUCTSUPTOTHEMAXQUANTITY, false);
        setDefaultValue(PROPERTY_DISPLAYUPSELLINGMSG, false);
        setDefaultValue(PROPERTY_PRICEADJUSTMENTSCOPE, "A");
        setDefaultValue(PROPERTY_PRICEADJUSTMENTTYPE, "P");
        setDefaultValue(PROPERTY_PRICEADJUSTMENTINCOMPATIBILITYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTAVAILABILITYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNEREXTREFLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERGROUPLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERSETLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTORGANIZATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTPRICELISTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTPRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTPRODUCTCATEGORYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PriceAdjustment#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PriceAdjustment#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PriceAdjustment#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PriceAdjustment#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PriceAdjustment#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PriceAdjustment#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PriceAdjustment#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PriceAdjustment#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PriceAdjustment#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PriceAdjustment#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PriceAdjustment#PROPERTY_PRIORITY
     * 
     */
    public Long getPriority() {
        return (Long) get(PROPERTY_PRIORITY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_PRIORITY
     * 
     */
    public void setPriority(Long priority) {
        set(PROPERTY_PRIORITY, priority);
    }

    /**
     * @see PriceAdjustment#PROPERTY_DISCOUNTAMOUNT
     * 
     */
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(PROPERTY_DISCOUNTAMOUNT);
    }
    /**
     * @see PriceAdjustment#PROPERTY_DISCOUNTAMOUNT
     * 
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        set(PROPERTY_DISCOUNTAMOUNT, discountAmount);
    }

    /**
     * @see PriceAdjustment#PROPERTY_DISCOUNT
     * 
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) get(PROPERTY_DISCOUNT);
    }
    /**
     * @see PriceAdjustment#PROPERTY_DISCOUNT
     * 
     */
    public void setDiscount(BigDecimal discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    /**
     * @see PriceAdjustment#PROPERTY_FIXEDPRICE
     * 
     */
    public BigDecimal getFixedPrice() {
        return (BigDecimal) get(PROPERTY_FIXEDPRICE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_FIXEDPRICE
     * 
     */
    public void setFixedPrice(BigDecimal fixedPrice) {
        set(PROPERTY_FIXEDPRICE, fixedPrice);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDBUSINESSPARTNERS
     * 
     */
    public String getIncludedBusinessPartners() {
        return (String) get(PROPERTY_INCLUDEDBUSINESSPARTNERS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDBUSINESSPARTNERS
     * 
     */
    public void setIncludedBusinessPartners(String includedBusinessPartners) {
        set(PROPERTY_INCLUDEDBUSINESSPARTNERS, includedBusinessPartners);
    }

    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDBPCATEGORIES
     * 
     */
    public String getIncludedBPCategories() {
        return (String) get(PROPERTY_INCLUDEDBPCATEGORIES);
    }
    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDBPCATEGORIES
     * 
     */
    public void setIncludedBPCategories(String includedBPCategories) {
        set(PROPERTY_INCLUDEDBPCATEGORIES, includedBPCategories);
    }

    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDPRODUCTS
     * 
     */
    public String getIncludedProducts() {
        return (String) get(PROPERTY_INCLUDEDPRODUCTS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDPRODUCTS
     * 
     */
    public void setIncludedProducts(String includedProducts) {
        set(PROPERTY_INCLUDEDPRODUCTS, includedProducts);
    }

    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public String getIncludedProductCategories() {
        return (String) get(PROPERTY_INCLUDEDPRODUCTCATEGORIES);
    }
    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public void setIncludedProductCategories(String includedProductCategories) {
        set(PROPERTY_INCLUDEDPRODUCTCATEGORIES, includedProductCategories);
    }

    /**
     * @see PriceAdjustment#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PriceAdjustment#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEPRICELISTS
     * 
     */
    public String getIncludePriceLists() {
        return (String) get(PROPERTY_INCLUDEPRICELISTS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEPRICELISTS
     * 
     */
    public void setIncludePriceLists(String includePriceLists) {
        set(PROPERTY_INCLUDEPRICELISTS, includePriceLists);
    }

    /**
     * @see PriceAdjustment#PROPERTY_MINQUANTITY
     * 
     */
    public BigDecimal getMinQuantity() {
        return (BigDecimal) get(PROPERTY_MINQUANTITY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_MINQUANTITY
     * 
     */
    public void setMinQuantity(BigDecimal minQuantity) {
        set(PROPERTY_MINQUANTITY, minQuantity);
    }

    /**
     * @see PriceAdjustment#PROPERTY_MAXQUANTITY
     * 
     */
    public BigDecimal getMaxQuantity() {
        return (BigDecimal) get(PROPERTY_MAXQUANTITY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_MAXQUANTITY
     * 
     */
    public void setMaxQuantity(BigDecimal maxQuantity) {
        set(PROPERTY_MAXQUANTITY, maxQuantity);
    }

    /**
     * @see PriceAdjustment#PROPERTY_DISCOUNTTYPE
     * 
     */
    public PromotionType getDiscountType() {
        return (PromotionType) get(PROPERTY_DISCOUNTTYPE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_DISCOUNTTYPE
     * 
     */
    public void setDiscountType(PromotionType discountType) {
        set(PROPERTY_DISCOUNTTYPE, discountType);
    }

    /**
     * @see PriceAdjustment#PROPERTY_APPLYNEXT
     * 
     */
    public Boolean isApplyNext() {
        return (Boolean) get(PROPERTY_APPLYNEXT);
    }
    /**
     * @see PriceAdjustment#PROPERTY_APPLYNEXT
     * 
     */
    public void setApplyNext(Boolean applyNext) {
        set(PROPERTY_APPLYNEXT, applyNext);
    }

    /**
     * @see PriceAdjustment#PROPERTY_PRINTNAME
     * 
     */
    public String getPrintName() {
        return (String) get(PROPERTY_PRINTNAME);
    }
    /**
     * @see PriceAdjustment#PROPERTY_PRINTNAME
     * 
     */
    public void setPrintName(String printName) {
        set(PROPERTY_PRINTNAME, printName);
    }

    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDORGANIZATIONS
     * 
     */
    public String getIncludedOrganizations() {
        return (String) get(PROPERTY_INCLUDEDORGANIZATIONS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDORGANIZATIONS
     * 
     */
    public void setIncludedOrganizations(String includedOrganizations) {
        set(PROPERTY_INCLUDEDORGANIZATIONS, includedOrganizations);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ISMULTIPLE
     * 
     */
    public Boolean isMultiple() {
        return (Boolean) get(PROPERTY_ISMULTIPLE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ISMULTIPLE
     * 
     */
    public void setMultiple(Boolean ismultiple) {
        set(PROPERTY_ISMULTIPLE, ismultiple);
    }

    /**
     * @see PriceAdjustment#PROPERTY_MULTIPLE
     * 
     */
    public BigDecimal getMultiple() {
        return (BigDecimal) get(PROPERTY_MULTIPLE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_MULTIPLE
     * 
     */
    public void setMultiple(BigDecimal multiple) {
        set(PROPERTY_MULTIPLE, multiple);
    }

    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDCHARACTERISTICS
     * 
     */
    public String getIncludedCharacteristics() {
        return (String) get(PROPERTY_INCLUDEDCHARACTERISTICS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_INCLUDEDCHARACTERISTICS
     * 
     */
    public void setIncludedCharacteristics(String includedCharacteristics) {
        set(PROPERTY_INCLUDEDCHARACTERISTICS, includedCharacteristics);
    }

    /**
     * @see PriceAdjustment#PROPERTY_SETSELECTION
     * 
     */
    public String getSetSelection() {
        return (String) get(PROPERTY_SETSELECTION);
    }
    /**
     * @see PriceAdjustment#PROPERTY_SETSELECTION
     * 
     */
    public void setSetSelection(String setSelection) {
        set(PROPERTY_SETSELECTION, setSelection);
    }

    /**
     * @see PriceAdjustment#PROPERTY_MONDAY
     * 
     */
    public Boolean isMonday() {
        return (Boolean) get(PROPERTY_MONDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_MONDAY
     * 
     */
    public void setMonday(Boolean monday) {
        set(PROPERTY_MONDAY, monday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_TUESDAY
     * 
     */
    public Boolean isTuesday() {
        return (Boolean) get(PROPERTY_TUESDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_TUESDAY
     * 
     */
    public void setTuesday(Boolean tuesday) {
        set(PROPERTY_TUESDAY, tuesday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_WEDNESDAY
     * 
     */
    public Boolean isWednesday() {
        return (Boolean) get(PROPERTY_WEDNESDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_WEDNESDAY
     * 
     */
    public void setWednesday(Boolean wednesday) {
        set(PROPERTY_WEDNESDAY, wednesday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_THURSDAY
     * 
     */
    public Boolean isThursday() {
        return (Boolean) get(PROPERTY_THURSDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_THURSDAY
     * 
     */
    public void setThursday(Boolean thursday) {
        set(PROPERTY_THURSDAY, thursday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_FRIDAY
     * 
     */
    public Boolean isFriday() {
        return (Boolean) get(PROPERTY_FRIDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_FRIDAY
     * 
     */
    public void setFriday(Boolean friday) {
        set(PROPERTY_FRIDAY, friday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_SATURDAY
     * 
     */
    public Boolean isSaturday() {
        return (Boolean) get(PROPERTY_SATURDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_SATURDAY
     * 
     */
    public void setSaturday(Boolean saturday) {
        set(PROPERTY_SATURDAY, saturday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_SUNDAY
     * 
     */
    public Boolean isSunday() {
        return (Boolean) get(PROPERTY_SUNDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_SUNDAY
     * 
     */
    public void setSunday(Boolean sunday) {
        set(PROPERTY_SUNDAY, sunday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ALLWEEKDAYS
     * 
     */
    public Boolean isAllweekdays() {
        return (Boolean) get(PROPERTY_ALLWEEKDAYS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ALLWEEKDAYS
     * 
     */
    public void setAllweekdays(Boolean allweekdays) {
        set(PROPERTY_ALLWEEKDAYS, allweekdays);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIME
     * 
     */
    public Timestamp getStartingtime() {
        return (Timestamp) get(PROPERTY_STARTINGTIME);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIME
     * 
     */
    public void setStartingtime(Timestamp startingtime) {
        set(PROPERTY_STARTINGTIME, startingtime);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIME
     * 
     */
    public Timestamp getEndingtime() {
        return (Timestamp) get(PROPERTY_ENDINGTIME);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIME
     * 
     */
    public void setEndingtime(Timestamp endingtime) {
        set(PROPERTY_ENDINGTIME, endingtime);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMEMONDAY
     * 
     */
    public Timestamp getStartingtimemonday() {
        return (Timestamp) get(PROPERTY_STARTINGTIMEMONDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMEMONDAY
     * 
     */
    public void setStartingtimemonday(Timestamp startingtimemonday) {
        set(PROPERTY_STARTINGTIMEMONDAY, startingtimemonday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMETUESDAY
     * 
     */
    public Timestamp getStartingtimetuesday() {
        return (Timestamp) get(PROPERTY_STARTINGTIMETUESDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMETUESDAY
     * 
     */
    public void setStartingtimetuesday(Timestamp startingtimetuesday) {
        set(PROPERTY_STARTINGTIMETUESDAY, startingtimetuesday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMEWEDNESDAY
     * 
     */
    public Timestamp getStartingtimewednesday() {
        return (Timestamp) get(PROPERTY_STARTINGTIMEWEDNESDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMEWEDNESDAY
     * 
     */
    public void setStartingtimewednesday(Timestamp startingtimewednesday) {
        set(PROPERTY_STARTINGTIMEWEDNESDAY, startingtimewednesday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMETHURSDAY
     * 
     */
    public Timestamp getStartingtimethursday() {
        return (Timestamp) get(PROPERTY_STARTINGTIMETHURSDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMETHURSDAY
     * 
     */
    public void setStartingtimethursday(Timestamp startingtimethursday) {
        set(PROPERTY_STARTINGTIMETHURSDAY, startingtimethursday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMEFRIDAY
     * 
     */
    public Timestamp getStartingtimefriday() {
        return (Timestamp) get(PROPERTY_STARTINGTIMEFRIDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMEFRIDAY
     * 
     */
    public void setStartingtimefriday(Timestamp startingtimefriday) {
        set(PROPERTY_STARTINGTIMEFRIDAY, startingtimefriday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMESATURDAY
     * 
     */
    public Timestamp getStartingtimesaturday() {
        return (Timestamp) get(PROPERTY_STARTINGTIMESATURDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMESATURDAY
     * 
     */
    public void setStartingtimesaturday(Timestamp startingtimesaturday) {
        set(PROPERTY_STARTINGTIMESATURDAY, startingtimesaturday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMESUNDAY
     * 
     */
    public Timestamp getStartingtimesunday() {
        return (Timestamp) get(PROPERTY_STARTINGTIMESUNDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_STARTINGTIMESUNDAY
     * 
     */
    public void setStartingtimesunday(Timestamp startingtimesunday) {
        set(PROPERTY_STARTINGTIMESUNDAY, startingtimesunday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMEMONDAY
     * 
     */
    public Timestamp getEndingtimemonday() {
        return (Timestamp) get(PROPERTY_ENDINGTIMEMONDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMEMONDAY
     * 
     */
    public void setEndingtimemonday(Timestamp endingtimemonday) {
        set(PROPERTY_ENDINGTIMEMONDAY, endingtimemonday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMETUESDAY
     * 
     */
    public Timestamp getEndingtimetuesday() {
        return (Timestamp) get(PROPERTY_ENDINGTIMETUESDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMETUESDAY
     * 
     */
    public void setEndingtimetuesday(Timestamp endingtimetuesday) {
        set(PROPERTY_ENDINGTIMETUESDAY, endingtimetuesday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMEWEDNESDAY
     * 
     */
    public Timestamp getEndingtimewednesday() {
        return (Timestamp) get(PROPERTY_ENDINGTIMEWEDNESDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMEWEDNESDAY
     * 
     */
    public void setEndingtimewednesday(Timestamp endingtimewednesday) {
        set(PROPERTY_ENDINGTIMEWEDNESDAY, endingtimewednesday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMETHURSDAY
     * 
     */
    public Timestamp getEndingtimethursday() {
        return (Timestamp) get(PROPERTY_ENDINGTIMETHURSDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMETHURSDAY
     * 
     */
    public void setEndingtimethursday(Timestamp endingtimethursday) {
        set(PROPERTY_ENDINGTIMETHURSDAY, endingtimethursday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMEFRIDAY
     * 
     */
    public Timestamp getEndingtimefriday() {
        return (Timestamp) get(PROPERTY_ENDINGTIMEFRIDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMEFRIDAY
     * 
     */
    public void setEndingtimefriday(Timestamp endingtimefriday) {
        set(PROPERTY_ENDINGTIMEFRIDAY, endingtimefriday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMESATURDAY
     * 
     */
    public Timestamp getEndingtimesaturday() {
        return (Timestamp) get(PROPERTY_ENDINGTIMESATURDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMESATURDAY
     * 
     */
    public void setEndingtimesaturday(Timestamp endingtimesaturday) {
        set(PROPERTY_ENDINGTIMESATURDAY, endingtimesaturday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMESUNDAY
     * 
     */
    public Timestamp getEndingtimesunday() {
        return (Timestamp) get(PROPERTY_ENDINGTIMESUNDAY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_ENDINGTIMESUNDAY
     * 
     */
    public void setEndingtimesunday(Timestamp endingtimesunday) {
        set(PROPERTY_ENDINGTIMESUNDAY, endingtimesunday);
    }

    /**
     * @see PriceAdjustment#PROPERTY_CONFORGPROCESS
     * 
     */
    public Boolean isConforgprocess() {
        return (Boolean) get(PROPERTY_CONFORGPROCESS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_CONFORGPROCESS
     * 
     */
    public void setConforgprocess(Boolean conforgprocess) {
        set(PROPERTY_CONFORGPROCESS, conforgprocess);
    }

    /**
     * @see PriceAdjustment#PROPERTY_CONFPRODCATPROCESS
     * 
     */
    public Boolean isConfprodcatprocess() {
        return (Boolean) get(PROPERTY_CONFPRODCATPROCESS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_CONFPRODCATPROCESS
     * 
     */
    public void setConfprodcatprocess(Boolean confprodcatprocess) {
        set(PROPERTY_CONFPRODCATPROCESS, confprodcatprocess);
    }

    /**
     * @see PriceAdjustment#PROPERTY_CONFPRODPROCESS
     * 
     */
    public Boolean isConfprodprocess() {
        return (Boolean) get(PROPERTY_CONFPRODPROCESS);
    }
    /**
     * @see PriceAdjustment#PROPERTY_CONFPRODPROCESS
     * 
     */
    public void setConfprodprocess(Boolean confprodprocess) {
        set(PROPERTY_CONFPRODPROCESS, confprodprocess);
    }

    /**
     * @see PriceAdjustment#PROPERTY_CHARACTERISTICSEXCLSELECTION
     * 
     */
    public String getCharacteristicsExclSelection() {
        return (String) get(PROPERTY_CHARACTERISTICSEXCLSELECTION);
    }
    /**
     * @see PriceAdjustment#PROPERTY_CHARACTERISTICSEXCLSELECTION
     * 
     */
    public void setCharacteristicsExclSelection(String characteristicsExclSelection) {
        set(PROPERTY_CHARACTERISTICSEXCLSELECTION, characteristicsExclSelection);
    }

    /**
     * @see PriceAdjustment#PROPERTY_BPARTNEREXTREFSELECTION
     * 
     */
    public String getBpartnerExtrefSelection() {
        return (String) get(PROPERTY_BPARTNEREXTREFSELECTION);
    }
    /**
     * @see PriceAdjustment#PROPERTY_BPARTNEREXTREFSELECTION
     * 
     */
    public void setBpartnerExtrefSelection(String bpartnerExtrefSelection) {
        set(PROPERTY_BPARTNEREXTREFSELECTION, bpartnerExtrefSelection);
    }

    /**
     * @see PriceAdjustment#PROPERTY_VERIFYPRICELIMIT
     * 
     */
    public Boolean isVerifyPriceLimit() {
        return (Boolean) get(PROPERTY_VERIFYPRICELIMIT);
    }
    /**
     * @see PriceAdjustment#PROPERTY_VERIFYPRICELIMIT
     * 
     */
    public void setVerifyPriceLimit(Boolean verifyPriceLimit) {
        set(PROPERTY_VERIFYPRICELIMIT, verifyPriceLimit);
    }

    /**
     * @see PriceAdjustment#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see PriceAdjustment#PROPERTY_APPLYTOPRODUCTSUPTOTHEMAXQUANTITY
     * 
     */
    public Boolean isApplyToProductsUpToTheMaxQuantity() {
        return (Boolean) get(PROPERTY_APPLYTOPRODUCTSUPTOTHEMAXQUANTITY);
    }
    /**
     * @see PriceAdjustment#PROPERTY_APPLYTOPRODUCTSUPTOTHEMAXQUANTITY
     * 
     */
    public void setApplyToProductsUpToTheMaxQuantity(Boolean applyToProductsUpToTheMaxQuantity) {
        set(PROPERTY_APPLYTOPRODUCTSUPTOTHEMAXQUANTITY, applyToProductsUpToTheMaxQuantity);
    }

    /**
     * @see PriceAdjustment#PROPERTY_DISPLAYUPSELLINGMSG
     * 
     */
    public Boolean isDisplayUpsellingmsg() {
        return (Boolean) get(PROPERTY_DISPLAYUPSELLINGMSG);
    }
    /**
     * @see PriceAdjustment#PROPERTY_DISPLAYUPSELLINGMSG
     * 
     */
    public void setDisplayUpsellingmsg(Boolean displayUpsellingmsg) {
        set(PROPERTY_DISPLAYUPSELLINGMSG, displayUpsellingmsg);
    }

    /**
     * @see PriceAdjustment#PROPERTY_PRICEADJUSTMENTSCOPE
     * 
     */
    public String getPriceAdjustmentScope() {
        return (String) get(PROPERTY_PRICEADJUSTMENTSCOPE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_PRICEADJUSTMENTSCOPE
     * 
     */
    public void setPriceAdjustmentScope(String priceAdjustmentScope) {
        set(PROPERTY_PRICEADJUSTMENTSCOPE, priceAdjustmentScope);
    }

    /**
     * @see PriceAdjustment#PROPERTY_PRICEADJUSTMENTTYPE
     * 
     */
    public String getPriceAdjustmentType() {
        return (String) get(PROPERTY_PRICEADJUSTMENTTYPE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_PRICEADJUSTMENTTYPE
     * 
     */
    public void setPriceAdjustmentType(String priceAdjustmentType) {
        set(PROPERTY_PRICEADJUSTMENTTYPE, priceAdjustmentType);
    }

    /**
     * @see PriceAdjustment#PROPERTY_PRIORITYRULE
     * 
     */
    public String getPriorityRule() {
        return (String) get(PROPERTY_PRIORITYRULE);
    }
    /**
     * @see PriceAdjustment#PROPERTY_PRIORITYRULE
     * 
     */
    public void setPriorityRule(String priorityRule) {
        set(PROPERTY_PRIORITYRULE, priorityRule);
    }

    /**
     * @see PriceAdjustmentIncompatibility
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PriceAdjustmentIncompatibility> getPriceAdjustmentIncompatibilityList() {
      return (List<PriceAdjustmentIncompatibility>) get(PROPERTY_PRICEADJUSTMENTINCOMPATIBILITYLIST);
    }

    /**
     * @see PriceAdjustmentIncompatibility
     * 
     */
    public void setPriceAdjustmentIncompatibilityList(List<PriceAdjustmentIncompatibility> priceAdjustmentIncompatibilityList) {
        set(PROPERTY_PRICEADJUSTMENTINCOMPATIBILITYLIST, priceAdjustmentIncompatibilityList);
    }

    /**
     * @see PricingAdjustmentAvailability
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PricingAdjustmentAvailability> getPricingAdjustmentAvailabilityList() {
      return (List<PricingAdjustmentAvailability>) get(PROPERTY_PRICINGADJUSTMENTAVAILABILITYLIST);
    }

    /**
     * @see PricingAdjustmentAvailability
     * 
     */
    public void setPricingAdjustmentAvailabilityList(List<PricingAdjustmentAvailability> pricingAdjustmentAvailabilityList) {
        set(PROPERTY_PRICINGADJUSTMENTAVAILABILITYLIST, pricingAdjustmentAvailabilityList);
    }

    /**
     * Help: {@literal Used to select the business partners related to the Price Adjustment.}<br>
     * @see BusinessPartner
     * 
     */
    @SuppressWarnings("unchecked")
    public List<BusinessPartner> getPricingAdjustmentBusinessPartnerList() {
      return (List<BusinessPartner>) get(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERLIST);
    }

    /**
     * Help: {@literal Used to select the business partners related to the Price Adjustment.}<br>
     * @see BusinessPartner
     * 
     */
    public void setPricingAdjustmentBusinessPartnerList(List<BusinessPartner> pricingAdjustmentBusinessPartnerList) {
        set(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERLIST, pricingAdjustmentBusinessPartnerList);
    }

    /**
     * Help: {@literal Used to select the external business partners related to the Price Adjustment.}<br>
     * @see PricingAdjustmentBusinessPartnerExtRef
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PricingAdjustmentBusinessPartnerExtRef> getPricingAdjustmentBusinessPartnerExtRefList() {
      return (List<PricingAdjustmentBusinessPartnerExtRef>) get(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNEREXTREFLIST);
    }

    /**
     * Help: {@literal Used to select the external business partners related to the Price Adjustment.}<br>
     * @see PricingAdjustmentBusinessPartnerExtRef
     * 
     */
    public void setPricingAdjustmentBusinessPartnerExtRefList(List<PricingAdjustmentBusinessPartnerExtRef> pricingAdjustmentBusinessPartnerExtRefList) {
        set(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNEREXTREFLIST, pricingAdjustmentBusinessPartnerExtRefList);
    }

    /**
     * Help: {@literal Used to select the groups of business partners related to the price adjustment.}<br>
     * @see BusinessPartnerGroup
     * 
     */
    @SuppressWarnings("unchecked")
    public List<BusinessPartnerGroup> getPricingAdjustmentBusinessPartnerGroupList() {
      return (List<BusinessPartnerGroup>) get(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERGROUPLIST);
    }

    /**
     * Help: {@literal Used to select the groups of business partners related to the price adjustment.}<br>
     * @see BusinessPartnerGroup
     * 
     */
    public void setPricingAdjustmentBusinessPartnerGroupList(List<BusinessPartnerGroup> pricingAdjustmentBusinessPartnerGroupList) {
        set(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERGROUPLIST, pricingAdjustmentBusinessPartnerGroupList);
    }

    /**
     * Help: {@literal Defines business partner sets by discount}<br>
     * @see DiscountBusinessPartnerSet
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DiscountBusinessPartnerSet> getPricingAdjustmentBusinessPartnerSetList() {
      return (List<DiscountBusinessPartnerSet>) get(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERSETLIST);
    }

    /**
     * Help: {@literal Defines business partner sets by discount}<br>
     * @see DiscountBusinessPartnerSet
     * 
     */
    public void setPricingAdjustmentBusinessPartnerSetList(List<DiscountBusinessPartnerSet> pricingAdjustmentBusinessPartnerSetList) {
        set(PROPERTY_PRICINGADJUSTMENTBUSINESSPARTNERSETLIST, pricingAdjustmentBusinessPartnerSetList);
    }

    /**
     * Help: {@literal Used to select the product characteristics related to the Price Adjustment.}<br>
     * @see Characteristic
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Characteristic> getPricingAdjustmentCharacteristicList() {
      return (List<Characteristic>) get(PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST);
    }

    /**
     * Help: {@literal Used to select the product characteristics related to the Price Adjustment.}<br>
     * @see Characteristic
     * 
     */
    public void setPricingAdjustmentCharacteristicList(List<Characteristic> pricingAdjustmentCharacteristicList) {
        set(PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST, pricingAdjustmentCharacteristicList);
    }

    /**
     * @see OrganizationFilter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrganizationFilter> getPricingAdjustmentOrganizationList() {
      return (List<OrganizationFilter>) get(PROPERTY_PRICINGADJUSTMENTORGANIZATIONLIST);
    }

    /**
     * @see OrganizationFilter
     * 
     */
    public void setPricingAdjustmentOrganizationList(List<OrganizationFilter> pricingAdjustmentOrganizationList) {
        set(PROPERTY_PRICINGADJUSTMENTORGANIZATIONLIST, pricingAdjustmentOrganizationList);
    }

    /**
     * Help: {@literal Used to select Price Lists for a price adjustment.}<br>
     * @see PriceList
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PriceList> getPricingAdjustmentPriceListList() {
      return (List<PriceList>) get(PROPERTY_PRICINGADJUSTMENTPRICELISTLIST);
    }

    /**
     * Help: {@literal Used to select Price Lists for a price adjustment.}<br>
     * @see PriceList
     * 
     */
    public void setPricingAdjustmentPriceListList(List<PriceList> pricingAdjustmentPriceListList) {
        set(PROPERTY_PRICINGADJUSTMENTPRICELISTLIST, pricingAdjustmentPriceListList);
    }

    /**
     * Help: {@literal Used to select the different products related to the Price Adjustment.}<br>
     * @see Product
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Product> getPricingAdjustmentProductList() {
      return (List<Product>) get(PROPERTY_PRICINGADJUSTMENTPRODUCTLIST);
    }

    /**
     * Help: {@literal Used to select the different products related to the Price Adjustment.}<br>
     * @see Product
     * 
     */
    public void setPricingAdjustmentProductList(List<Product> pricingAdjustmentProductList) {
        set(PROPERTY_PRICINGADJUSTMENTPRODUCTLIST, pricingAdjustmentProductList);
    }

    /**
     * Help: {@literal Used to select the different categories of products related to the Price Adjustments.}<br>
     * @see ProductCategory
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCategory> getPricingAdjustmentProductCategoryList() {
      return (List<ProductCategory>) get(PROPERTY_PRICINGADJUSTMENTPRODUCTCATEGORYLIST);
    }

    /**
     * Help: {@literal Used to select the different categories of products related to the Price Adjustments.}<br>
     * @see ProductCategory
     * 
     */
    public void setPricingAdjustmentProductCategoryList(List<ProductCategory> pricingAdjustmentProductCategoryList) {
        set(PROPERTY_PRICINGADJUSTMENTPRODUCTCATEGORYLIST, pricingAdjustmentProductCategoryList);
    }

    /**
     * @see PricingAdjustmentTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PricingAdjustmentTrl> getPricingAdjustmentTrlList() {
      return (List<PricingAdjustmentTrl>) get(PROPERTY_PRICINGADJUSTMENTTRLLIST);
    }

    /**
     * @see PricingAdjustmentTrl
     * 
     */
    public void setPricingAdjustmentTrlList(List<PricingAdjustmentTrl> pricingAdjustmentTrlList) {
        set(PROPERTY_PRICINGADJUSTMENTTRLLIST, pricingAdjustmentTrlList);
    }

}
