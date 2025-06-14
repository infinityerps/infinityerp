
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
 * Entity class for entity PricingVolumeDiscountScale (stored in table M_Rappel_Scale).
 * <br>
 * Help: {@literal Defines the scales where the discounts will be applied}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DiscountScale extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Rappel_Scale";
    public static final String ENTITY_NAME = "PricingVolumeDiscountScale";

    /**
     * Property id stored in column M_Rappel_Scale_ID in table M_Rappel_Scale 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Rappel_Scale 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Rappel_Scale 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Rappel_Scale 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Rappel_Scale 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Rappel_Scale 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Rappel_Scale 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Rappel_Scale 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property volumeDiscount stored in column M_Rappel_ID in table M_Rappel_Scale<br>
     * Help: {@literal The ID identifies a unique volume discount}
     * 
     */
    public static final String PROPERTY_VOLUMEDISCOUNT = "volumeDiscount";

    /**
     * Property discount stored in column Discount in table M_Rappel_Scale 
     * 
     */
    public static final String PROPERTY_DISCOUNT = "discount";

    /**
     * Property minAmount stored in column Amnt_From in table M_Rappel_Scale 
     * 
     */
    public static final String PROPERTY_MINAMOUNT = "minAmount";

    /**
     * Property maxAmount stored in column Amnt_To in table M_Rappel_Scale<br>
     * Help: {@literal The maximum amount the discount is applied to.}
     * 
     */
    public static final String PROPERTY_MAXAMOUNT = "maxAmount";


    public DiscountScale() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DiscountScale#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DiscountScale#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DiscountScale#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DiscountScale#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DiscountScale#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DiscountScale#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DiscountScale#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DiscountScale#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DiscountScale#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DiscountScale#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DiscountScale#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DiscountScale#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DiscountScale#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DiscountScale#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DiscountScale#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DiscountScale#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DiscountScale#PROPERTY_VOLUMEDISCOUNT
     * 
     */
    public VolumeDiscount getVolumeDiscount() {
        return (VolumeDiscount) get(PROPERTY_VOLUMEDISCOUNT);
    }
    /**
     * @see DiscountScale#PROPERTY_VOLUMEDISCOUNT
     * 
     */
    public void setVolumeDiscount(VolumeDiscount volumeDiscount) {
        set(PROPERTY_VOLUMEDISCOUNT, volumeDiscount);
    }

    /**
     * @see DiscountScale#PROPERTY_DISCOUNT
     * 
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) get(PROPERTY_DISCOUNT);
    }
    /**
     * @see DiscountScale#PROPERTY_DISCOUNT
     * 
     */
    public void setDiscount(BigDecimal discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    /**
     * @see DiscountScale#PROPERTY_MINAMOUNT
     * 
     */
    public BigDecimal getMinAmount() {
        return (BigDecimal) get(PROPERTY_MINAMOUNT);
    }
    /**
     * @see DiscountScale#PROPERTY_MINAMOUNT
     * 
     */
    public void setMinAmount(BigDecimal minAmount) {
        set(PROPERTY_MINAMOUNT, minAmount);
    }

    /**
     * @see DiscountScale#PROPERTY_MAXAMOUNT
     * 
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) get(PROPERTY_MAXAMOUNT);
    }
    /**
     * @see DiscountScale#PROPERTY_MAXAMOUNT
     * 
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        set(PROPERTY_MAXAMOUNT, maxAmount);
    }

}
