
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
package org.openbravo.model.timeandexpense;

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
 * Entity class for entity ResourceAssignment (stored in table S_ResourceAssignment).
 * <br>
 * Help: {@literal History of Assignments}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ResourceAssignment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "S_ResourceAssignment";
    public static final String ENTITY_NAME = "ResourceAssignment";

    /**
     * Property id stored in column S_ResourceAssignment_ID in table S_ResourceAssignment<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table S_ResourceAssignment 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table S_ResourceAssignment 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table S_ResourceAssignment 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table S_ResourceAssignment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table S_ResourceAssignment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table S_ResourceAssignment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table S_ResourceAssignment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property resource stored in column S_Resource_ID in table S_ResourceAssignment<br>
     * Help: {@literal The ID identifies a unique resource}
     * 
     */
    public static final String PROPERTY_RESOURCE = "resource";

    /**
     * Property name stored in column Name in table S_ResourceAssignment 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table S_ResourceAssignment<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property assignFrom stored in column AssignDateFrom in table S_ResourceAssignment 
     * 
     */
    public static final String PROPERTY_ASSIGNFROM = "assignFrom";

    /**
     * Property assignTo stored in column AssignDateTo in table S_ResourceAssignment<br>
     * Help: {@literal Assignment end}
     * 
     */
    public static final String PROPERTY_ASSIGNTO = "assignTo";

    /**
     * Property quantity stored in column Qty in table S_ResourceAssignment<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property confirmed stored in column IsConfirmed in table S_ResourceAssignment<br>
     * Help: {@literal Resource assignment is confirmed}
     * 
     */
    public static final String PROPERTY_CONFIRMED = "confirmed";


    public ResourceAssignment() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CONFIRMED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ResourceAssignment#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ResourceAssignment#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ResourceAssignment#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ResourceAssignment#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ResourceAssignment#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ResourceAssignment#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ResourceAssignment#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ResourceAssignment#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ResourceAssignment#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ResourceAssignment#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ResourceAssignment#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ResourceAssignment#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ResourceAssignment#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ResourceAssignment#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ResourceAssignment#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ResourceAssignment#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ResourceAssignment#PROPERTY_RESOURCE
     * 
     */
    public Resource getResource() {
        return (Resource) get(PROPERTY_RESOURCE);
    }
    /**
     * @see ResourceAssignment#PROPERTY_RESOURCE
     * 
     */
    public void setResource(Resource resource) {
        set(PROPERTY_RESOURCE, resource);
    }

    /**
     * @see ResourceAssignment#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ResourceAssignment#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ResourceAssignment#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ResourceAssignment#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ResourceAssignment#PROPERTY_ASSIGNFROM
     * 
     */
    public Date getAssignFrom() {
        return (Date) get(PROPERTY_ASSIGNFROM);
    }
    /**
     * @see ResourceAssignment#PROPERTY_ASSIGNFROM
     * 
     */
    public void setAssignFrom(Date assignFrom) {
        set(PROPERTY_ASSIGNFROM, assignFrom);
    }

    /**
     * @see ResourceAssignment#PROPERTY_ASSIGNTO
     * 
     */
    public Date getAssignTo() {
        return (Date) get(PROPERTY_ASSIGNTO);
    }
    /**
     * @see ResourceAssignment#PROPERTY_ASSIGNTO
     * 
     */
    public void setAssignTo(Date assignTo) {
        set(PROPERTY_ASSIGNTO, assignTo);
    }

    /**
     * @see ResourceAssignment#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see ResourceAssignment#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see ResourceAssignment#PROPERTY_CONFIRMED
     * 
     */
    public Boolean isConfirmed() {
        return (Boolean) get(PROPERTY_CONFIRMED);
    }
    /**
     * @see ResourceAssignment#PROPERTY_CONFIRMED
     * 
     */
    public void setConfirmed(Boolean confirmed) {
        set(PROPERTY_CONFIRMED, confirmed);
    }

}
