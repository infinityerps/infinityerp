
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
package org.openbravo.model.common.businesspartner;

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
 * Entity class for entity BusinessPartnerDiscount (stored in table C_BPartner_Discount).
 * <br>
 * Help: {@literal Defines the Business Partners the discount can be applied to.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Discount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BPartner_Discount";
    public static final String ENTITY_NAME = "BusinessPartnerDiscount";

    /**
     * Property id stored in column C_Bpartner_Discount_ID in table C_BPartner_Discount 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_BPartner_Discount 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BPartner_Discount 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BPartner_Discount 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BPartner_Discount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_BPartner_Discount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BPartner_Discount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_BPartner_Discount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_BPartner_Discount<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property discount stored in column C_Discount_ID in table C_BPartner_Discount<br>
     * Help: {@literal Discount applicable to prices.}
     * 
     */
    public static final String PROPERTY_DISCOUNT = "discount";

    /**
     * Property lineNo stored in column Line in table C_BPartner_Discount<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property cascade stored in column Cascade in table C_BPartner_Discount<br>
     * Help: {@literal Indicates if it is applied in an accumulative way or if it is applied to the base amount.}
     * 
     */
    public static final String PROPERTY_CASCADE = "cascade";

    /**
     * Property applyInOrder stored in column Applyinorder in table C_BPartner_Discount<br>
     * Help: {@literal Apply the discount also to the Order}
     * 
     */
    public static final String PROPERTY_APPLYINORDER = "applyInOrder";

    /**
     * Property customer stored in column IsCustomer in table C_BPartner_Discount<br>
     * Help: {@literal Indicates a business partner that is your customer, ie. that will be making purchases from
     *       you. If selected, additional fields will display further details that need to be entered for a
     *       customer.}
     * 
     */
    public static final String PROPERTY_CUSTOMER = "customer";

    /**
     * Property vendor stored in column IsVendor in table C_BPartner_Discount<br>
     * Help: {@literal The Vendor checkbox indicates if this Business Partner is a Vendor.  If it is selected,
     *       additional fields will display which further identify this vendor.}
     * 
     */
    public static final String PROPERTY_VENDOR = "vendor";


    public Discount() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CASCADE, false);
        setDefaultValue(PROPERTY_APPLYINORDER, false);
        setDefaultValue(PROPERTY_CUSTOMER, true);
        setDefaultValue(PROPERTY_VENDOR, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Discount#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Discount#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Discount#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Discount#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Discount#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Discount#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Discount#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Discount#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Discount#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Discount#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Discount#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Discount#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Discount#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Discount#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Discount#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Discount#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Discount#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Discount#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Discount#PROPERTY_DISCOUNT
     * 
     */
    public org.openbravo.model.pricing.discount.Discount getDiscount() {
        return (org.openbravo.model.pricing.discount.Discount) get(PROPERTY_DISCOUNT);
    }
    /**
     * @see Discount#PROPERTY_DISCOUNT
     * 
     */
    public void setDiscount(org.openbravo.model.pricing.discount.Discount discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    /**
     * @see Discount#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see Discount#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see Discount#PROPERTY_CASCADE
     * 
     */
    public Boolean isCascade() {
        return (Boolean) get(PROPERTY_CASCADE);
    }
    /**
     * @see Discount#PROPERTY_CASCADE
     * 
     */
    public void setCascade(Boolean cascade) {
        set(PROPERTY_CASCADE, cascade);
    }

    /**
     * @see Discount#PROPERTY_APPLYINORDER
     * 
     */
    public Boolean isApplyInOrder() {
        return (Boolean) get(PROPERTY_APPLYINORDER);
    }
    /**
     * @see Discount#PROPERTY_APPLYINORDER
     * 
     */
    public void setApplyInOrder(Boolean applyInOrder) {
        set(PROPERTY_APPLYINORDER, applyInOrder);
    }

    /**
     * @see Discount#PROPERTY_CUSTOMER
     * 
     */
    public Boolean isCustomer() {
        return (Boolean) get(PROPERTY_CUSTOMER);
    }
    /**
     * @see Discount#PROPERTY_CUSTOMER
     * 
     */
    public void setCustomer(Boolean customer) {
        set(PROPERTY_CUSTOMER, customer);
    }

    /**
     * @see Discount#PROPERTY_VENDOR
     * 
     */
    public Boolean isVendor() {
        return (Boolean) get(PROPERTY_VENDOR);
    }
    /**
     * @see Discount#PROPERTY_VENDOR
     * 
     */
    public void setVendor(Boolean vendor) {
        set(PROPERTY_VENDOR, vendor);
    }

}
