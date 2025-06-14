
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
 * Entity class for entity PriceAdjustmentIncompatibility (stored in table M_Offer_Incompatibility).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PriceAdjustmentIncompatibility extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Offer_Incompatibility";
    public static final String ENTITY_NAME = "PriceAdjustmentIncompatibility";

    /**
     * Property id stored in column M_Offer_Incompatibility_ID in table M_Offer_Incompatibility 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Offer_Incompatibility 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Offer_Incompatibility 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Offer_Incompatibility 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Offer_Incompatibility 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Offer_Incompatibility 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Offer_Incompatibility 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Offer_Incompatibility 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property promotionDiscount stored in column M_Offer_ID in table M_Offer_Incompatibility<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_PROMOTIONDISCOUNT = "promotionDiscount";

    /**
     * Property offerIncmptibilityOffer stored in column M_Offer_Incmptibility_Offer_ID in table M_Offer_Incompatibility
     * 
     */
    public static final String PROPERTY_OFFERINCMPTIBILITYOFFER = "offerIncmptibilityOffer";

    /**
     * Property offerIncmptibilityType stored in column M_Offer_Incmptibility_Type_ID in table M_Offer_Incompatibility
     * 
     */
    public static final String PROPERTY_OFFERINCMPTIBILITYTYPE = "offerIncmptibilityType";


    public PriceAdjustmentIncompatibility() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_PROMOTIONDISCOUNT
     * 
     */
    public PriceAdjustment getPromotionDiscount() {
        return (PriceAdjustment) get(PROPERTY_PROMOTIONDISCOUNT);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_PROMOTIONDISCOUNT
     * 
     */
    public void setPromotionDiscount(PriceAdjustment promotionDiscount) {
        set(PROPERTY_PROMOTIONDISCOUNT, promotionDiscount);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_OFFERINCMPTIBILITYOFFER
     * 
     */
    public PriceAdjustment getOfferIncmptibilityOffer() {
        return (PriceAdjustment) get(PROPERTY_OFFERINCMPTIBILITYOFFER);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_OFFERINCMPTIBILITYOFFER
     * 
     */
    public void setOfferIncmptibilityOffer(PriceAdjustment offerIncmptibilityOffer) {
        set(PROPERTY_OFFERINCMPTIBILITYOFFER, offerIncmptibilityOffer);
    }

    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_OFFERINCMPTIBILITYTYPE
     * 
     */
    public PromotionType getOfferIncmptibilityType() {
        return (PromotionType) get(PROPERTY_OFFERINCMPTIBILITYTYPE);
    }
    /**
     * @see PriceAdjustmentIncompatibility#PROPERTY_OFFERINCMPTIBILITYTYPE
     * 
     */
    public void setOfferIncmptibilityType(PromotionType offerIncmptibilityType) {
        set(PROPERTY_OFFERINCMPTIBILITYTYPE, offerIncmptibilityType);
    }

}
