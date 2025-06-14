
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
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity PricingPriceListVersion (stored in table M_PriceList_Version).
 * <br>
 * Help: {@literal Price lists are automatically created based on Product Purchasing Information and the
     *       Vendor Category Discount. The other alternative is to copy them from existing pricelists and then
     *       re-calculate them. You can also re-calculate the pricelist by referencin}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PriceListVersion extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_PriceList_Version";
    public static final String ENTITY_NAME = "PricingPriceListVersion";

    /**
     * Property id stored in column M_PriceList_Version_ID in table M_PriceList_Version<br>
     * Help: {@literal Each Price List can have multiple versions.  The most common use is to indicate the dates
     *       that a Price List is valid for.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_PriceList_Version 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_PriceList_Version 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_PriceList_Version 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_PriceList_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_PriceList_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_PriceList_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_PriceList_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_PriceList_Version 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_PriceList_Version<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property priceList stored in column M_PriceList_ID in table M_PriceList_Version<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property priceListSchema stored in column M_DiscountSchema_ID in table M_PriceList_Version<br>
     * Help: {@literal After calculation of the (standard) price, the trade discount percentage is calculated and
     *       applied resulting in the final price.}
     * 
     */
    public static final String PROPERTY_PRICELISTSCHEMA = "priceListSchema";

    /**
     * Property validFromDate stored in column ValidFrom in table M_PriceList_Version<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property create stored in column ProcCreate in table M_PriceList_Version
     * 
     */
    public static final String PROPERTY_CREATE = "create";

    /**
     * Property basePriceListVersion stored in column M_Pricelist_Version_Base_ID in table M_PriceList_Version<br>
     * Help: {@literal The Base Price List identifies the Base Pricelist used for calculating prices (the
     *       source)}
     * 
     */
    public static final String PROPERTY_BASEPRICELISTVERSION = "basePriceListVersion";

    /**
     * Property generatePriceListVersion stored in column M_Pricelist_Version_Generate in table M_PriceList_Version
     * 
     */
    public static final String PROPERTY_GENERATEPRICELISTVERSION = "generatePriceListVersion";

    /**
     * Property pricingProductPriceList stored in table M_PriceList_Version
     * 
     */
    public static final String PROPERTY_PRICINGPRODUCTPRICELIST = "pricingProductPriceList";


    public PriceListVersion() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATE, false);
        setDefaultValue(PROPERTY_GENERATEPRICELISTVERSION, false);
        setDefaultValue(PROPERTY_PRICINGPRODUCTPRICELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PriceListVersion#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PriceListVersion#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PriceListVersion#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PriceListVersion#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PriceListVersion#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PriceListVersion#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PriceListVersion#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PriceListVersion#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PriceListVersion#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PriceListVersion#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PriceListVersion#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PriceListVersion#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PriceListVersion#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PriceListVersion#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PriceListVersion#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PriceListVersion#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PriceListVersion#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PriceListVersion#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PriceListVersion#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PriceListVersion#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PriceListVersion#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see PriceListVersion#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see PriceListVersion#PROPERTY_PRICELISTSCHEMA
     * 
     */
    public PriceListSchema getPriceListSchema() {
        return (PriceListSchema) get(PROPERTY_PRICELISTSCHEMA);
    }
    /**
     * @see PriceListVersion#PROPERTY_PRICELISTSCHEMA
     * 
     */
    public void setPriceListSchema(PriceListSchema priceListSchema) {
        set(PROPERTY_PRICELISTSCHEMA, priceListSchema);
    }

    /**
     * @see PriceListVersion#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see PriceListVersion#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see PriceListVersion#PROPERTY_CREATE
     * 
     */
    public Boolean isCreate() {
        return (Boolean) get(PROPERTY_CREATE);
    }
    /**
     * @see PriceListVersion#PROPERTY_CREATE
     * 
     */
    public void setCreate(Boolean create) {
        set(PROPERTY_CREATE, create);
    }

    /**
     * @see PriceListVersion#PROPERTY_BASEPRICELISTVERSION
     * 
     */
    public PriceListVersion getBasePriceListVersion() {
        return (PriceListVersion) get(PROPERTY_BASEPRICELISTVERSION);
    }
    /**
     * @see PriceListVersion#PROPERTY_BASEPRICELISTVERSION
     * 
     */
    public void setBasePriceListVersion(PriceListVersion basePriceListVersion) {
        set(PROPERTY_BASEPRICELISTVERSION, basePriceListVersion);
    }

    /**
     * @see PriceListVersion#PROPERTY_GENERATEPRICELISTVERSION
     * 
     */
    public Boolean isGeneratePriceListVersion() {
        return (Boolean) get(PROPERTY_GENERATEPRICELISTVERSION);
    }
    /**
     * @see PriceListVersion#PROPERTY_GENERATEPRICELISTVERSION
     * 
     */
    public void setGeneratePriceListVersion(Boolean generatePriceListVersion) {
        set(PROPERTY_GENERATEPRICELISTVERSION, generatePriceListVersion);
    }

    /**
     * Help: {@literal The Pricing displays the List, Standard and Limit prices for each price list a product is
     *       contained in.
     *       The Price List displays the prices for a product based on the selected price list.
     *       The
     *       Pricing Tab displays the List, Standard and Limit prices for each price list a product is contained
     *       in.}<br>
     * @see ProductPrice
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductPrice> getPricingProductPriceList() {
      return (List<ProductPrice>) get(PROPERTY_PRICINGPRODUCTPRICELIST);
    }

    /**
     * Help: {@literal The Pricing displays the List, Standard and Limit prices for each price list a product is
     *       contained in.
     *       The Price List displays the prices for a product based on the selected price list.
     *       The
     *       Pricing Tab displays the List, Standard and Limit prices for each price list a product is contained
     *       in.}<br>
     * @see ProductPrice
     * 
     */
    public void setPricingProductPriceList(List<ProductPrice> pricingProductPriceList) {
        set(PROPERTY_PRICINGPRODUCTPRICELIST, pricingProductPriceList);
    }

}
