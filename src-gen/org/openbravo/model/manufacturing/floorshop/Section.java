
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
package org.openbravo.model.manufacturing.floorshop;

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
 * Entity class for entity ManufacturingSection (stored in table MA_Section).
 * <br>
 * Help: {@literal In section table it's defined each section.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Section extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Section";
    public static final String ENTITY_NAME = "ManufacturingSection";

    /**
     * Property id stored in column MA_Section_ID in table MA_Section<br>
     * Help: {@literal Indicates a section of the enterprise.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Section 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Section 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Section 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Section 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Section 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Section 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Section 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table MA_Section 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table MA_Section<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";


    public Section() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Section#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Section#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Section#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Section#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Section#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Section#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Section#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Section#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Section#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Section#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Section#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Section#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Section#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Section#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Section#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Section#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Section#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Section#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Section#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Section#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

}
