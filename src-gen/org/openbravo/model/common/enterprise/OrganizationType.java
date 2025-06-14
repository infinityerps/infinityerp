
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
package org.openbravo.model.common.enterprise;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
/**
 * Entity class for entity OrganizationType (stored in table AD_OrgType).
 * <br>
 * Help: {@literal An organization can be a Legal Entity (with and without accounting), a Business Unit or
     *       neither of both.
     *       You can also select if transactions are allowed or not for this organization type.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrganizationType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_OrgType";
    public static final String ENTITY_NAME = "OrganizationType";

    /**
     * Property id stored in column AD_Orgtype_ID in table AD_OrgType<br>
     * Help: {@literal Each organization belongs to an organization type defined in the system}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_OrgType 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_OrgType 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_OrgType 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_OrgType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_OrgType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_OrgType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_OrgType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property default stored in column IsDefault in table AD_OrgType<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property name stored in column Name in table AD_OrgType 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_OrgType<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property legalEntity stored in column IsLegalEntity in table AD_OrgType<br>
     * Help: {@literal An organization which is a legal corporation.}
     * 
     */
    public static final String PROPERTY_LEGALENTITY = "legalEntity";

    /**
     * Property businessUnit stored in column IsBusinessUnit in table AD_OrgType<br>
     * Help: {@literal An organization with its independent accounts. It belongs, with other business units, to a
     *       legal organization.}
     * 
     */
    public static final String PROPERTY_BUSINESSUNIT = "businessUnit";

    /**
     * Property transactionsAllowed stored in column IsTransactionsAllowed in table AD_OrgType<br>
     * Help: {@literal A transaction made by an organization is, for example, an invoice.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONSALLOWED = "transactionsAllowed";

    /**
     * Property legalEntityWithAccounting stored in column IsAcctLegalEntity in table AD_OrgType<br>
     * Help: {@literal A Legal Entity can be defined to have accounting or not. A Legal Entity without accounting
     *       is useful when the installation does not have the accounting configured (i.e., fiscal calendar,
     *       periods, accounting schemas...)}
     * 
     */
    public static final String PROPERTY_LEGALENTITYWITHACCOUNTING = "legalEntityWithAccounting";


    public OrganizationType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_LEGALENTITY, false);
        setDefaultValue(PROPERTY_BUSINESSUNIT, false);
        setDefaultValue(PROPERTY_TRANSACTIONSALLOWED, false);
        setDefaultValue(PROPERTY_LEGALENTITYWITHACCOUNTING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OrganizationType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OrganizationType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OrganizationType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OrganizationType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OrganizationType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OrganizationType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OrganizationType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OrganizationType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OrganizationType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OrganizationType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OrganizationType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OrganizationType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OrganizationType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OrganizationType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OrganizationType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OrganizationType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OrganizationType#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see OrganizationType#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see OrganizationType#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see OrganizationType#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see OrganizationType#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see OrganizationType#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see OrganizationType#PROPERTY_LEGALENTITY
     * 
     */
    public Boolean isLegalEntity() {
        return (Boolean) get(PROPERTY_LEGALENTITY);
    }
    /**
     * @see OrganizationType#PROPERTY_LEGALENTITY
     * 
     */
    public void setLegalEntity(Boolean legalEntity) {
        set(PROPERTY_LEGALENTITY, legalEntity);
    }

    /**
     * @see OrganizationType#PROPERTY_BUSINESSUNIT
     * 
     */
    public Boolean isBusinessUnit() {
        return (Boolean) get(PROPERTY_BUSINESSUNIT);
    }
    /**
     * @see OrganizationType#PROPERTY_BUSINESSUNIT
     * 
     */
    public void setBusinessUnit(Boolean businessUnit) {
        set(PROPERTY_BUSINESSUNIT, businessUnit);
    }

    /**
     * @see OrganizationType#PROPERTY_TRANSACTIONSALLOWED
     * 
     */
    public Boolean isTransactionsAllowed() {
        return (Boolean) get(PROPERTY_TRANSACTIONSALLOWED);
    }
    /**
     * @see OrganizationType#PROPERTY_TRANSACTIONSALLOWED
     * 
     */
    public void setTransactionsAllowed(Boolean transactionsAllowed) {
        set(PROPERTY_TRANSACTIONSALLOWED, transactionsAllowed);
    }

    /**
     * @see OrganizationType#PROPERTY_LEGALENTITYWITHACCOUNTING
     * 
     */
    public Boolean isLegalEntityWithAccounting() {
        return (Boolean) get(PROPERTY_LEGALENTITYWITHACCOUNTING);
    }
    /**
     * @see OrganizationType#PROPERTY_LEGALENTITYWITHACCOUNTING
     * 
     */
    public void setLegalEntityWithAccounting(Boolean legalEntityWithAccounting) {
        set(PROPERTY_LEGALENTITYWITHACCOUNTING, legalEntityWithAccounting);
    }

}
