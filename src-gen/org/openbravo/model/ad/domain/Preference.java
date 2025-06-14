
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
package org.openbravo.model.ad.domain;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.InheritedAccessEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Window;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADPreference (stored in table AD_Preference).
 * <br>
 * Help: {@literal Defines preferences (default values) for a user.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Preference extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled, InheritedAccessEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Preference";
    public static final String ENTITY_NAME = "ADPreference";

    /**
     * Property id stored in column AD_Preference_ID in table AD_Preference 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Preference 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Preference 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Preference 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Preference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Preference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Preference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Preference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property window stored in column AD_Window_ID in table AD_Preference<br>
     * Help: {@literal The Window field identifies a unique Window in the system.}
     * 
     */
    public static final String PROPERTY_WINDOW = "window";

    /**
     * Property userContact stored in column AD_User_ID in table AD_Preference<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property attribute stored in column Attribute in table AD_Preference 
     * 
     */
    public static final String PROPERTY_ATTRIBUTE = "attribute";

    /**
     * Property searchKey stored in column Value in table AD_Preference<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property property stored in column Property in table AD_Preference 
     * 
     */
    public static final String PROPERTY_PROPERTY = "property";

    /**
     * Property propertyList stored in column IsPropertyList in table AD_Preference<br>
     * Help: {@literal When this field is checked, the preference is defined by Property which is a selectable
     *       value from a drop down list. Properties are defined by modules.
     *       
     *       In case the field is not checked,
     *       the preference is defined by Attribute, which is a free text name.}
     * 
     */
    public static final String PROPERTY_PROPERTYLIST = "propertyList";

    /**
     * Property visibleAtClient stored in column VisibleAt_Client_ID in table AD_Preference<br>
     * Help: {@literal Defines which is the preference's visibility at client level. If this value is empty the
     *       preference will be visible from all Clients.}
     * 
     */
    public static final String PROPERTY_VISIBLEATCLIENT = "visibleAtClient";

    /**
     * Property visibleAtOrganization stored in column VisibleAt_Org_ID in table AD_Preference<br>
     * Help: {@literal Defines which is the preference's visibility at Organization level. The preference will be
     *       visible from all organizations in the tree bellow this one. If this value is empty the preference
     *       will be visible from all Organizations.}
     * 
     */
    public static final String PROPERTY_VISIBLEATORGANIZATION = "visibleAtOrganization";

    /**
     * Property visibleAtRole stored in column VisibleAt_Role_ID in table AD_Preference<br>
     * Help: {@literal Defines which is the preference's visibility at Role level. If this value is empty the
     *       preference will be visible from all Roles.}
     * 
     */
    public static final String PROPERTY_VISIBLEATROLE = "visibleAtRole";

    /**
     * Property selected stored in column Selected in table AD_Preference<br>
     * Help: {@literal In case of conflict (multiple values for a single property), this field must be checked
     *       for one of them in order to pick this one over the rest.}
     * 
     */
    public static final String PROPERTY_SELECTED = "selected";

    /**
     * Property module stored in column AD_Module_ID in table AD_Preference<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property inheritedFrom stored in column Inherited_From in table AD_Preference<br>
     * Help: {@literal The role from which a permission has been inherited. If a permission has this field set it
     *       means that this is an inherited permission, an therefore that the role owner of the permission is
     *       able to access it because it inherits from the role defined in this field.}
     * 
     */
    public static final String PROPERTY_INHERITEDFROM = "inheritedFrom";


    public Preference() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROPERTYLIST, true);
        setDefaultValue(PROPERTY_SELECTED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Preference#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Preference#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Preference#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Preference#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Preference#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Preference#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Preference#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Preference#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Preference#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Preference#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Preference#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Preference#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Preference#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Preference#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Preference#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Preference#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Preference#PROPERTY_WINDOW
     * 
     */
    public Window getWindow() {
        return (Window) get(PROPERTY_WINDOW);
    }
    /**
     * @see Preference#PROPERTY_WINDOW
     * 
     */
    public void setWindow(Window window) {
        set(PROPERTY_WINDOW, window);
    }

    /**
     * @see Preference#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see Preference#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see Preference#PROPERTY_ATTRIBUTE
     * 
     */
    public String getAttribute() {
        return (String) get(PROPERTY_ATTRIBUTE);
    }
    /**
     * @see Preference#PROPERTY_ATTRIBUTE
     * 
     */
    public void setAttribute(String attribute) {
        set(PROPERTY_ATTRIBUTE, attribute);
    }

    /**
     * @see Preference#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Preference#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Preference#PROPERTY_PROPERTY
     * 
     */
    public String getProperty() {
        return (String) get(PROPERTY_PROPERTY);
    }
    /**
     * @see Preference#PROPERTY_PROPERTY
     * 
     */
    public void setProperty(String property) {
        set(PROPERTY_PROPERTY, property);
    }

    /**
     * @see Preference#PROPERTY_PROPERTYLIST
     * 
     */
    public Boolean isPropertyList() {
        return (Boolean) get(PROPERTY_PROPERTYLIST);
    }
    /**
     * @see Preference#PROPERTY_PROPERTYLIST
     * 
     */
    public void setPropertyList(Boolean propertyList) {
        set(PROPERTY_PROPERTYLIST, propertyList);
    }

    /**
     * @see Preference#PROPERTY_VISIBLEATCLIENT
     * 
     */
    public Client getVisibleAtClient() {
        return (Client) get(PROPERTY_VISIBLEATCLIENT);
    }
    /**
     * @see Preference#PROPERTY_VISIBLEATCLIENT
     * 
     */
    public void setVisibleAtClient(Client visibleAtClient) {
        set(PROPERTY_VISIBLEATCLIENT, visibleAtClient);
    }

    /**
     * @see Preference#PROPERTY_VISIBLEATORGANIZATION
     * 
     */
    public Organization getVisibleAtOrganization() {
        return (Organization) get(PROPERTY_VISIBLEATORGANIZATION);
    }
    /**
     * @see Preference#PROPERTY_VISIBLEATORGANIZATION
     * 
     */
    public void setVisibleAtOrganization(Organization visibleAtOrganization) {
        set(PROPERTY_VISIBLEATORGANIZATION, visibleAtOrganization);
    }

    /**
     * @see Preference#PROPERTY_VISIBLEATROLE
     * 
     */
    public Role getVisibleAtRole() {
        return (Role) get(PROPERTY_VISIBLEATROLE);
    }
    /**
     * @see Preference#PROPERTY_VISIBLEATROLE
     * 
     */
    public void setVisibleAtRole(Role visibleAtRole) {
        set(PROPERTY_VISIBLEATROLE, visibleAtRole);
    }

    /**
     * @see Preference#PROPERTY_SELECTED
     * 
     */
    public Boolean isSelected() {
        return (Boolean) get(PROPERTY_SELECTED);
    }
    /**
     * @see Preference#PROPERTY_SELECTED
     * 
     */
    public void setSelected(Boolean selected) {
        set(PROPERTY_SELECTED, selected);
    }

    /**
     * @see Preference#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Preference#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Preference#PROPERTY_INHERITEDFROM
     * 
     */
    public Role getInheritedFrom() {
        return (Role) get(PROPERTY_INHERITEDFROM);
    }
    /**
     * @see Preference#PROPERTY_INHERITEDFROM
     * 
     */
    public void setInheritedFrom(Role inheritedFrom) {
        set(PROPERTY_INHERITEDFROM, inheritedFrom);
    }

}
