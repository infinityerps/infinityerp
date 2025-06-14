
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
package org.openbravo.client.myob;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.InheritedAccessEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBKMO_WidgetClassAccess (stored in table OBKMO_Widget_Class_Access).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WidgetClassAccess extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled, InheritedAccessEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBKMO_Widget_Class_Access";
    public static final String ENTITY_NAME = "OBKMO_WidgetClassAccess";

    /**
     * Property id stored in column Obkmo_Widget_Class_Access_ID in table OBKMO_Widget_Class_Access 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBKMO_Widget_Class_Access 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBKMO_Widget_Class_Access 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBKMO_Widget_Class_Access 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBKMO_Widget_Class_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBKMO_Widget_Class_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBKMO_Widget_Class_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBKMO_Widget_Class_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property widgetClass stored in column Obkmo_Widget_Class_ID in table OBKMO_Widget_Class_Access<br>
     * Help: {@literal Identifies a widget class definition}
     * 
     */
    public static final String PROPERTY_WIDGETCLASS = "widgetClass";

    /**
     * Property role stored in column AD_Role_ID in table OBKMO_Widget_Class_Access<br>
     * Help: {@literal The Role determines security and access a user who has this Role will have in the System.}
     * 
     */
    public static final String PROPERTY_ROLE = "role";

    /**
     * Property inheritedFrom stored in column Inherited_From in table OBKMO_Widget_Class_Access<br>
     * Help: {@literal The role from which a permission has been inherited. If a permission has this field set it
     *       means that this is an inherited permission, an therefore that the role owner of the permission is
     *       able to access it because it inherits from the role defined in this field.}
     * 
     */
    public static final String PROPERTY_INHERITEDFROM = "inheritedFrom";


    public WidgetClassAccess() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WidgetClassAccess#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_WIDGETCLASS
     * 
     */
    public WidgetClass getWidgetClass() {
        return (WidgetClass) get(PROPERTY_WIDGETCLASS);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_WIDGETCLASS
     * 
     */
    public void setWidgetClass(WidgetClass widgetClass) {
        set(PROPERTY_WIDGETCLASS, widgetClass);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_ROLE
     * 
     */
    public Role getRole() {
        return (Role) get(PROPERTY_ROLE);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_ROLE
     * 
     */
    public void setRole(Role role) {
        set(PROPERTY_ROLE, role);
    }

    /**
     * @see WidgetClassAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public Role getInheritedFrom() {
        return (Role) get(PROPERTY_INHERITEDFROM);
    }
    /**
     * @see WidgetClassAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public void setInheritedFrom(Role inheritedFrom) {
        set(PROPERTY_INHERITEDFROM, inheritedFrom);
    }

}
