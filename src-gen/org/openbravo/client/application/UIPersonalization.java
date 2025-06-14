
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
package org.openbravo.client.application;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.ad.ui.Window;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_UIPersonalization (stored in table OBUIAPP_UIPersonalization).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class UIPersonalization extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_UIPersonalization";
    public static final String ENTITY_NAME = "OBUIAPP_UIPersonalization";

    /**
     * Property id stored in column Obuiapp_Uipersonalization_ID in table OBUIAPP_UIPersonalization 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_UIPersonalization 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_UIPersonalization 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_UIPersonalization 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_UIPersonalization 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_UIPersonalization 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_UIPersonalization 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_UIPersonalization 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property type stored in column Type in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal The Type indicates the type of validation that will occur.  This can be SQL, Java Script
     *       or Java Language.}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property description stored in column Description in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property tab stored in column AD_Tab_ID in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property window stored in column AD_Window_ID in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal The Window field identifies a unique Window in the system.}
     * 
     */
    public static final String PROPERTY_WINDOW = "window";

    /**
     * Property user stored in column AD_User_ID in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USER = "user";

    /**
     * Property value stored in column Value in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal The value for the record.}
     * 
     */
    public static final String PROPERTY_VALUE = "value";

    /**
     * Property visibleAtClient stored in column Visibleat_Client_ID in table OBUIAPP_UIPersonalization 
     * 
     */
    public static final String PROPERTY_VISIBLEATCLIENT = "visibleAtClient";

    /**
     * Property visibleAtOrganization stored in column Visibleat_Org_ID in table OBUIAPP_UIPersonalization 
     * 
     */
    public static final String PROPERTY_VISIBLEATORGANIZATION = "visibleAtOrganization";

    /**
     * Property visibleAtRole stored in column Visibleat_Role_ID in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal Defines which is the preference's visibility at Role level. If this value is empty the
     *       preference will be visible from all Roles.}
     * 
     */
    public static final String PROPERTY_VISIBLEATROLE = "visibleAtRole";

    /**
     * Property module stored in column AD_Module_ID in table OBUIAPP_UIPersonalization<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";


    public UIPersonalization() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see UIPersonalization#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see UIPersonalization#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see UIPersonalization#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see UIPersonalization#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see UIPersonalization#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see UIPersonalization#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see UIPersonalization#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see UIPersonalization#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see UIPersonalization#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see UIPersonalization#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see UIPersonalization#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see UIPersonalization#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see UIPersonalization#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see UIPersonalization#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see UIPersonalization#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see UIPersonalization#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see UIPersonalization#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see UIPersonalization#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see UIPersonalization#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see UIPersonalization#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see UIPersonalization#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see UIPersonalization#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see UIPersonalization#PROPERTY_WINDOW
     * 
     */
    public Window getWindow() {
        return (Window) get(PROPERTY_WINDOW);
    }
    /**
     * @see UIPersonalization#PROPERTY_WINDOW
     * 
     */
    public void setWindow(Window window) {
        set(PROPERTY_WINDOW, window);
    }

    /**
     * @see UIPersonalization#PROPERTY_USER
     * 
     */
    public User getUser() {
        return (User) get(PROPERTY_USER);
    }
    /**
     * @see UIPersonalization#PROPERTY_USER
     * 
     */
    public void setUser(User user) {
        set(PROPERTY_USER, user);
    }

    /**
     * @see UIPersonalization#PROPERTY_VALUE
     * 
     */
    public String getValue() {
        return (String) get(PROPERTY_VALUE);
    }
    /**
     * @see UIPersonalization#PROPERTY_VALUE
     * 
     */
    public void setValue(String value) {
        set(PROPERTY_VALUE, value);
    }

    /**
     * @see UIPersonalization#PROPERTY_VISIBLEATCLIENT
     * 
     */
    public Client getVisibleAtClient() {
        return (Client) get(PROPERTY_VISIBLEATCLIENT);
    }
    /**
     * @see UIPersonalization#PROPERTY_VISIBLEATCLIENT
     * 
     */
    public void setVisibleAtClient(Client visibleAtClient) {
        set(PROPERTY_VISIBLEATCLIENT, visibleAtClient);
    }

    /**
     * @see UIPersonalization#PROPERTY_VISIBLEATORGANIZATION
     * 
     */
    public Organization getVisibleAtOrganization() {
        return (Organization) get(PROPERTY_VISIBLEATORGANIZATION);
    }
    /**
     * @see UIPersonalization#PROPERTY_VISIBLEATORGANIZATION
     * 
     */
    public void setVisibleAtOrganization(Organization visibleAtOrganization) {
        set(PROPERTY_VISIBLEATORGANIZATION, visibleAtOrganization);
    }

    /**
     * @see UIPersonalization#PROPERTY_VISIBLEATROLE
     * 
     */
    public Role getVisibleAtRole() {
        return (Role) get(PROPERTY_VISIBLEATROLE);
    }
    /**
     * @see UIPersonalization#PROPERTY_VISIBLEATROLE
     * 
     */
    public void setVisibleAtRole(Role visibleAtRole) {
        set(PROPERTY_VISIBLEATROLE, visibleAtRole);
    }

    /**
     * @see UIPersonalization#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see UIPersonalization#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

}
