
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
package org.openbravo.model.ad.process;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADExtensionPoints (stored in table AD_Extension_Points).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExtensionPoints extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Extension_Points";
    public static final String ENTITY_NAME = "ADExtensionPoints";

    /**
     * Property id stored in column AD_Extension_Points_ID in table AD_Extension_Points<br>
     * Help: {@literal A point in a stored procedure where it is possible to execute procedures of different
     *       modules}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Extension_Points 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Extension_Points 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table AD_Extension_Points 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Extension_Points 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Extension_Points 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Extension_Points 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Extension_Points 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Extension_Points<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property module stored in column AD_Module_ID in table AD_Extension_Points<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property active stored in column Isactive in table AD_Extension_Points 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";


    public ExtensionPoints() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExtensionPoints#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExtensionPoints#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExtensionPoints#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExtensionPoints#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExtensionPoints#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExtensionPoints#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExtensionPoints#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExtensionPoints#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExtensionPoints#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExtensionPoints#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExtensionPoints#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExtensionPoints#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExtensionPoints#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExtensionPoints#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExtensionPoints#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ExtensionPoints#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ExtensionPoints#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ExtensionPoints#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ExtensionPoints#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ExtensionPoints#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ExtensionPoints#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExtensionPoints#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

}
