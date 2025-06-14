
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
 * Entity class for entity PricingPriceList (stored in table M_PriceList).
 * <br>
 * Help: {@literal Price lists determine currency of the document as well as tax treatment.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PriceList extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_PriceList";
    public static final String ENTITY_NAME = "PricingPriceList";

    /**
     * Property id stored in column M_PriceList_ID in table M_PriceList<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_PriceList 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_PriceList 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_PriceList 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_PriceList 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_PriceList 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_PriceList 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_PriceList 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_PriceList 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_PriceList<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property basePricelist stored in column BasePriceList_ID in table M_PriceList<br>
     * Help: {@literal The Base Price List identifies the default price list to be used if a product is not found
     *       on the selected price list}
     * 
     */
    public static final String PROPERTY_BASEPRICELIST = "basePricelist";

    /**
     * Property priceIncludesTax stored in column IsTaxIncluded in table M_PriceList<br>
     * Help: {@literal The Tax Included checkbox indicates if the prices include tax.  This is also known as the
     *       gross price.}
     * 
     */
    public static final String PROPERTY_PRICEINCLUDESTAX = "priceIncludesTax";

    /**
     * Property salesPriceList stored in column IsSOPriceList in table M_PriceList<br>
     * Help: {@literal The Sales Price List check box indicates if this price list is used for sales
     *       transactions.}
     * 
     */
    public static final String PROPERTY_SALESPRICELIST = "salesPriceList";

    /**
     * Property default stored in column IsDefault in table M_PriceList<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property currency stored in column C_Currency_ID in table M_PriceList<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property enforcePriceLimit stored in column EnforcePriceLimit in table M_PriceList<br>
     * Help: {@literal The Enforce Price Limit check box indicates that prices cannot be below the limit price in
     *       Orders. Invoices are not checked.}
     * 
     */
    public static final String PROPERTY_ENFORCEPRICELIMIT = "enforcePriceLimit";

    /**
     * Property costBasedPriceList stored in column Costbased in table M_PriceList
     * 
     */
    public static final String PROPERTY_COSTBASEDPRICELIST = "costBasedPriceList";

    /**
     * Property pricingPriceListVersionList stored in table M_PriceList
     * 
     */
    public static final String PROPERTY_PRICINGPRICELISTVERSIONLIST = "pricingPriceListVersionList";

    /**
     * Property servicePriceRuleRangeList stored in table M_PriceList
     * 
     */
    public static final String PROPERTY_SERVICEPRICERULERANGELIST = "servicePriceRuleRangeList";


    public PriceList() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PRICEINCLUDESTAX, false);
        setDefaultValue(PROPERTY_SALESPRICELIST, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_ENFORCEPRICELIMIT, false);
        setDefaultValue(PROPERTY_COSTBASEDPRICELIST, false);
        setDefaultValue(PROPERTY_PRICINGPRICELISTVERSIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_SERVICEPRICERULERANGELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PriceList#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PriceList#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PriceList#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PriceList#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PriceList#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PriceList#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PriceList#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PriceList#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PriceList#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PriceList#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PriceList#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PriceList#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PriceList#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PriceList#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PriceList#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PriceList#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PriceList#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PriceList#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PriceList#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PriceList#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PriceList#PROPERTY_BASEPRICELIST
     * 
     */
    public PriceList getBasePricelist() {
        return (PriceList) get(PROPERTY_BASEPRICELIST);
    }
    /**
     * @see PriceList#PROPERTY_BASEPRICELIST
     * 
     */
    public void setBasePricelist(PriceList basePricelist) {
        set(PROPERTY_BASEPRICELIST, basePricelist);
    }

    /**
     * @see PriceList#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public Boolean isPriceIncludesTax() {
        return (Boolean) get(PROPERTY_PRICEINCLUDESTAX);
    }
    /**
     * @see PriceList#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public void setPriceIncludesTax(Boolean priceIncludesTax) {
        set(PROPERTY_PRICEINCLUDESTAX, priceIncludesTax);
    }

    /**
     * @see PriceList#PROPERTY_SALESPRICELIST
     * 
     */
    public Boolean isSalesPriceList() {
        return (Boolean) get(PROPERTY_SALESPRICELIST);
    }
    /**
     * @see PriceList#PROPERTY_SALESPRICELIST
     * 
     */
    public void setSalesPriceList(Boolean salesPriceList) {
        set(PROPERTY_SALESPRICELIST, salesPriceList);
    }

    /**
     * @see PriceList#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see PriceList#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see PriceList#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see PriceList#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see PriceList#PROPERTY_ENFORCEPRICELIMIT
     * 
     */
    public Boolean isEnforcePriceLimit() {
        return (Boolean) get(PROPERTY_ENFORCEPRICELIMIT);
    }
    /**
     * @see PriceList#PROPERTY_ENFORCEPRICELIMIT
     * 
     */
    public void setEnforcePriceLimit(Boolean enforcePriceLimit) {
        set(PROPERTY_ENFORCEPRICELIMIT, enforcePriceLimit);
    }

    /**
     * @see PriceList#PROPERTY_COSTBASEDPRICELIST
     * 
     */
    public Boolean isCostBasedPriceList() {
        return (Boolean) get(PROPERTY_COSTBASEDPRICELIST);
    }
    /**
     * @see PriceList#PROPERTY_COSTBASEDPRICELIST
     * 
     */
    public void setCostBasedPriceList(Boolean costBasedPriceList) {
        set(PROPERTY_COSTBASEDPRICELIST, costBasedPriceList);
    }

    /**
     * Help: {@literal Price lists are automatically created based on Product Purchasing Information and the
     *       Vendor Category Discount. The other alternative is to copy them from existing pricelists and then
     *       re-calculate them. You can also re-calculate the pricelist by referencin}<br>
     * @see PriceListVersion
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PriceListVersion> getPricingPriceListVersionList() {
      return (List<PriceListVersion>) get(PROPERTY_PRICINGPRICELISTVERSIONLIST);
    }

    /**
     * Help: {@literal Price lists are automatically created based on Product Purchasing Information and the
     *       Vendor Category Discount. The other alternative is to copy them from existing pricelists and then
     *       re-calculate them. You can also re-calculate the pricelist by referencin}<br>
     * @see PriceListVersion
     * 
     */
    public void setPricingPriceListVersionList(List<PriceListVersion> pricingPriceListVersionList) {
        set(PROPERTY_PRICINGPRICELISTVERSIONLIST, pricingPriceListVersionList);
    }

    /**
     * @see ServicePriceRuleRange
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ServicePriceRuleRange> getServicePriceRuleRangeList() {
      return (List<ServicePriceRuleRange>) get(PROPERTY_SERVICEPRICERULERANGELIST);
    }

    /**
     * @see ServicePriceRuleRange
     * 
     */
    public void setServicePriceRuleRangeList(List<ServicePriceRuleRange> servicePriceRuleRangeList) {
        set(PROPERTY_SERVICEPRICERULERANGELIST, servicePriceRuleRangeList);
    }

}
