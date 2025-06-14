
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
import org.openbravo.model.common.plm.CharacteristicValue;
/**
 * Entity class for entity PricingAdjustmentCharacteristic (stored in table M_Offer_Characteristic).
 * <br>
 * Help: {@literal Used to select the product characteristics related to the Price Adjustment.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Characteristic extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Offer_Characteristic";
    public static final String ENTITY_NAME = "PricingAdjustmentCharacteristic";

    /**
     * Property id stored in column M_Offer_Characteristic_ID in table M_Offer_Characteristic 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Offer_Characteristic 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Offer_Characteristic 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Offer_Characteristic 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Offer_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Offer_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Offer_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Offer_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property offer stored in column M_Offer_ID in table M_Offer_Characteristic<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_OFFER = "offer";

    /**
     * Property characteristic stored in column M_Characteristic_ID in table M_Offer_Characteristic<br>
     * Help: {@literal Definition of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTIC = "characteristic";

    /**
     * Property chValue stored in column M_Ch_Value_ID in table M_Offer_Characteristic<br>
     * Help: {@literal Identifies a possible value of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHVALUE = "chValue";

    /**
     * Property isincludecharacteristics stored in column Isincludecharacteristics in table M_Offer_Characteristic
     * 
     */
    public static final String PROPERTY_ISINCLUDECHARACTERISTICS = "isincludecharacteristics";


    public Characteristic() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Characteristic#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Characteristic#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Characteristic#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Characteristic#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Characteristic#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Characteristic#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Characteristic#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Characteristic#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Characteristic#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Characteristic#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Characteristic#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Characteristic#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Characteristic#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Characteristic#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Characteristic#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Characteristic#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Characteristic#PROPERTY_OFFER
     * 
     */
    public PriceAdjustment getOffer() {
        return (PriceAdjustment) get(PROPERTY_OFFER);
    }
    /**
     * @see Characteristic#PROPERTY_OFFER
     * 
     */
    public void setOffer(PriceAdjustment offer) {
        set(PROPERTY_OFFER, offer);
    }

    /**
     * @see Characteristic#PROPERTY_CHARACTERISTIC
     * 
     */
    public org.openbravo.model.common.plm.Characteristic getCharacteristic() {
        return (org.openbravo.model.common.plm.Characteristic) get(PROPERTY_CHARACTERISTIC);
    }
    /**
     * @see Characteristic#PROPERTY_CHARACTERISTIC
     * 
     */
    public void setCharacteristic(org.openbravo.model.common.plm.Characteristic characteristic) {
        set(PROPERTY_CHARACTERISTIC, characteristic);
    }

    /**
     * @see Characteristic#PROPERTY_CHVALUE
     * 
     */
    public CharacteristicValue getChValue() {
        return (CharacteristicValue) get(PROPERTY_CHVALUE);
    }
    /**
     * @see Characteristic#PROPERTY_CHVALUE
     * 
     */
    public void setChValue(CharacteristicValue chValue) {
        set(PROPERTY_CHVALUE, chValue);
    }

    /**
     * @see Characteristic#PROPERTY_ISINCLUDECHARACTERISTICS
     * 
     */
    public Boolean isIncludecharacteristics() {
        return (Boolean) get(PROPERTY_ISINCLUDECHARACTERISTICS);
    }
    /**
     * @see Characteristic#PROPERTY_ISINCLUDECHARACTERISTICS
     * 
     */
    public void setIncludecharacteristics(Boolean isincludecharacteristics) {
        set(PROPERTY_ISINCLUDECHARACTERISTICS, isincludecharacteristics);
    }

}
