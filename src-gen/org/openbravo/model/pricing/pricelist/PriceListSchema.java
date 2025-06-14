
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
/**
 * Entity class for entity PricingPriceListSchema (stored in table M_DiscountSchema).
 * <br>
 * Help: {@literal Trade discount schema calculates the trade discount percentage}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PriceListSchema extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_DiscountSchema";
    public static final String ENTITY_NAME = "PricingPriceListSchema";

    /**
     * Property id stored in column M_DiscountSchema_ID in table M_DiscountSchema<br>
     * Help: {@literal After calculation of the (standard) price, the trade discount percentage is calculated and
     *       applied resulting in the final price.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_DiscountSchema 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_DiscountSchema 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_DiscountSchema 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_DiscountSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_DiscountSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_DiscountSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_DiscountSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_DiscountSchema 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_DiscountSchema<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property validFromDate stored in column ValidFrom in table M_DiscountSchema<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property discountType stored in column DiscountType in table M_DiscountSchema<br>
     * Help: {@literal Type of procedure used to calculate the trade discount percentage}
     * 
     */
    public static final String PROPERTY_DISCOUNTTYPE = "discountType";

    /**
     * Property script stored in column Script in table M_DiscountSchema<br>
     * Help: {@literal Use Java language constructs to define the result of the calculation}
     * 
     */
    public static final String PROPERTY_SCRIPT = "script";

    /**
     * Property flatDiscount stored in column FlatDiscount in table M_DiscountSchema<br>
     * Help: {@literal Flat discount percentage}
     * 
     */
    public static final String PROPERTY_FLATDISCOUNT = "flatDiscount";

    /**
     * Property quantityBased stored in column IsQuantityBased in table M_DiscountSchema<br>
     * Help: {@literal The calculation of the trade discount level is based on the quantity of the order and not
     *       the value amount of the order}
     * 
     */
    public static final String PROPERTY_QUANTITYBASED = "quantityBased";

    /**
     * Property cumulativeLevel stored in column CumulativeLevel in table M_DiscountSchema<br>
     * Help: {@literal Level for cumulative calculations}
     * 
     */
    public static final String PROPERTY_CUMULATIVELEVEL = "cumulativeLevel";

    /**
     * Property processNow stored in column Processing in table M_DiscountSchema<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property pricingPriceListSchemeLineList stored in table M_DiscountSchema
     * 
     */
    public static final String PROPERTY_PRICINGPRICELISTSCHEMELINELIST = "pricingPriceListSchemeLineList";

    /**
     * Property pricingPriceListVersionList stored in table M_DiscountSchema
     * 
     */
    public static final String PROPERTY_PRICINGPRICELISTVERSIONLIST = "pricingPriceListVersionList";


    public PriceListSchema() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DISCOUNTTYPE, "P");
        setDefaultValue(PROPERTY_QUANTITYBASED, true);
        setDefaultValue(PROPERTY_CUMULATIVELEVEL, "L");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PRICINGPRICELISTSCHEMELINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGPRICELISTVERSIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PriceListSchema#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PriceListSchema#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PriceListSchema#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PriceListSchema#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PriceListSchema#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PriceListSchema#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PriceListSchema#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PriceListSchema#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PriceListSchema#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PriceListSchema#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PriceListSchema#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PriceListSchema#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PriceListSchema#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PriceListSchema#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PriceListSchema#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PriceListSchema#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PriceListSchema#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PriceListSchema#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PriceListSchema#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PriceListSchema#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PriceListSchema#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see PriceListSchema#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see PriceListSchema#PROPERTY_DISCOUNTTYPE
     * 
     */
    public String getDiscountType() {
        return (String) get(PROPERTY_DISCOUNTTYPE);
    }
    /**
     * @see PriceListSchema#PROPERTY_DISCOUNTTYPE
     * 
     */
    public void setDiscountType(String discountType) {
        set(PROPERTY_DISCOUNTTYPE, discountType);
    }

    /**
     * @see PriceListSchema#PROPERTY_SCRIPT
     * 
     */
    public String getScript() {
        return (String) get(PROPERTY_SCRIPT);
    }
    /**
     * @see PriceListSchema#PROPERTY_SCRIPT
     * 
     */
    public void setScript(String script) {
        set(PROPERTY_SCRIPT, script);
    }

    /**
     * @see PriceListSchema#PROPERTY_FLATDISCOUNT
     * 
     */
    public BigDecimal getFlatDiscount() {
        return (BigDecimal) get(PROPERTY_FLATDISCOUNT);
    }
    /**
     * @see PriceListSchema#PROPERTY_FLATDISCOUNT
     * 
     */
    public void setFlatDiscount(BigDecimal flatDiscount) {
        set(PROPERTY_FLATDISCOUNT, flatDiscount);
    }

    /**
     * @see PriceListSchema#PROPERTY_QUANTITYBASED
     * 
     */
    public Boolean isQuantityBased() {
        return (Boolean) get(PROPERTY_QUANTITYBASED);
    }
    /**
     * @see PriceListSchema#PROPERTY_QUANTITYBASED
     * 
     */
    public void setQuantityBased(Boolean quantityBased) {
        set(PROPERTY_QUANTITYBASED, quantityBased);
    }

    /**
     * @see PriceListSchema#PROPERTY_CUMULATIVELEVEL
     * 
     */
    public String getCumulativeLevel() {
        return (String) get(PROPERTY_CUMULATIVELEVEL);
    }
    /**
     * @see PriceListSchema#PROPERTY_CUMULATIVELEVEL
     * 
     */
    public void setCumulativeLevel(String cumulativeLevel) {
        set(PROPERTY_CUMULATIVELEVEL, cumulativeLevel);
    }

    /**
     * @see PriceListSchema#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see PriceListSchema#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * Help: {@literal Pricelists are created based on Product Purchase and Category Discounts. The parameters
     *       listed here allow to copy and calculate pricelists.<BR>The calculation:<UL><LI>Copy and convert
     *       price from referenced price list<LI>result plus Surcharge Amount<L}<br>
     * @see PriceListSchemeLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PriceListSchemeLine> getPricingPriceListSchemeLineList() {
      return (List<PriceListSchemeLine>) get(PROPERTY_PRICINGPRICELISTSCHEMELINELIST);
    }

    /**
     * Help: {@literal Pricelists are created based on Product Purchase and Category Discounts. The parameters
     *       listed here allow to copy and calculate pricelists.<BR>The calculation:<UL><LI>Copy and convert
     *       price from referenced price list<LI>result plus Surcharge Amount<L}<br>
     * @see PriceListSchemeLine
     * 
     */
    public void setPricingPriceListSchemeLineList(List<PriceListSchemeLine> pricingPriceListSchemeLineList) {
        set(PROPERTY_PRICINGPRICELISTSCHEMELINELIST, pricingPriceListSchemeLineList);
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

}
