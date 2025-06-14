
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
import org.openbravo.model.ad.system.Language;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity PricingAdjustmentTrl (stored in table M_Offer_Trl).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PricingAdjustmentTrl extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Offer_Trl";
    public static final String ENTITY_NAME = "PricingAdjustmentTrl";

    /**
     * Property id stored in column M_Offer_Trl_ID in table M_Offer_Trl 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property promotionDiscount stored in column M_Offer_ID in table M_Offer_Trl<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_PROMOTIONDISCOUNT = "promotionDiscount";

    /**
     * Property language stored in column AD_Language in table M_Offer_Trl<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property client stored in column AD_Client_ID in table M_Offer_Trl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Offer_Trl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Offer_Trl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Offer_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Offer_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Offer_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Offer_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Offer_Trl 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property printedName stored in column Print_Name in table M_Offer_Trl<br>
     * Help: {@literal Name that will be shown to final user in UI and reports to identify current promotion. In
     *       case it is empty, name will be used instead. In general, name should be used internally, whereas
     *       printed name is intended to be read by user.}
     * 
     */
    public static final String PROPERTY_PRINTEDNAME = "printedName";

    /**
     * Property translation stored in column Istranslated in table M_Offer_Trl<br>
     * Help: {@literal The Translated checkbox indicates if this column is translated.}
     * 
     */
    public static final String PROPERTY_TRANSLATION = "translation";


    public PricingAdjustmentTrl() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TRANSLATION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_PROMOTIONDISCOUNT
     * 
     */
    public PriceAdjustment getPromotionDiscount() {
        return (PriceAdjustment) get(PROPERTY_PROMOTIONDISCOUNT);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_PROMOTIONDISCOUNT
     * 
     */
    public void setPromotionDiscount(PriceAdjustment promotionDiscount) {
        set(PROPERTY_PROMOTIONDISCOUNT, promotionDiscount);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_PRINTEDNAME
     * 
     */
    public String getPrintedName() {
        return (String) get(PROPERTY_PRINTEDNAME);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_PRINTEDNAME
     * 
     */
    public void setPrintedName(String printedName) {
        set(PROPERTY_PRINTEDNAME, printedName);
    }

    /**
     * @see PricingAdjustmentTrl#PROPERTY_TRANSLATION
     * 
     */
    public Boolean isTranslation() {
        return (Boolean) get(PROPERTY_TRANSLATION);
    }
    /**
     * @see PricingAdjustmentTrl#PROPERTY_TRANSLATION
     * 
     */
    public void setTranslation(Boolean translation) {
        set(PROPERTY_TRANSLATION, translation);
    }

}
