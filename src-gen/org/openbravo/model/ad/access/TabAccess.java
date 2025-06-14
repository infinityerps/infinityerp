
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
package org.openbravo.model.ad.access;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.InheritedAccessEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADTabAccess (stored in table AD_Tab_Access).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TabAccess extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled, InheritedAccessEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Tab_Access";
    public static final String ENTITY_NAME = "ADTabAccess";

    /**
     * Property id stored in column AD_Tab_Access_ID in table AD_Tab_Access
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Tab_Access 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Tab_Access 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Tab_Access 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Tab_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Tab_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Tab_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Tab_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property windowAccess stored in column AD_Window_Access_ID in table AD_Tab_Access
     * 
     */
    public static final String PROPERTY_WINDOWACCESS = "windowAccess";

    /**
     * Property tab stored in column AD_Tab_ID in table AD_Tab_Access<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property editableField stored in column IsReadWrite in table AD_Tab_Access<br>
     * Help: {@literal The Read Write indicates that this field may be read and updated.}
     * 
     */
    public static final String PROPERTY_EDITABLEFIELD = "editableField";

    /**
     * Property inheritedFrom stored in column Inherited_From in table AD_Tab_Access<br>
     * Help: {@literal The role from which a permission has been inherited. If a permission has this field set it
     *       means that this is an inherited permission, an therefore that the role owner of the permission is
     *       able to access it because it inherits from the role defined in this field.}
     * 
     */
    public static final String PROPERTY_INHERITEDFROM = "inheritedFrom";

    /**
     * Property aDFieldAccessList stored in table AD_Tab_Access
     * 
     */
    public static final String PROPERTY_ADFIELDACCESSLIST = "aDFieldAccessList";


    public TabAccess() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_EDITABLEFIELD, true);
        setDefaultValue(PROPERTY_ADFIELDACCESSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TabAccess#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TabAccess#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TabAccess#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TabAccess#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TabAccess#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TabAccess#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TabAccess#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TabAccess#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TabAccess#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TabAccess#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TabAccess#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TabAccess#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TabAccess#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TabAccess#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TabAccess#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TabAccess#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TabAccess#PROPERTY_WINDOWACCESS
     * 
     */
    public WindowAccess getWindowAccess() {
        return (WindowAccess) get(PROPERTY_WINDOWACCESS);
    }
    /**
     * @see TabAccess#PROPERTY_WINDOWACCESS
     * 
     */
    public void setWindowAccess(WindowAccess windowAccess) {
        set(PROPERTY_WINDOWACCESS, windowAccess);
    }

    /**
     * @see TabAccess#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see TabAccess#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see TabAccess#PROPERTY_EDITABLEFIELD
     * 
     */
    public Boolean isEditableField() {
        return (Boolean) get(PROPERTY_EDITABLEFIELD);
    }
    /**
     * @see TabAccess#PROPERTY_EDITABLEFIELD
     * 
     */
    public void setEditableField(Boolean editableField) {
        set(PROPERTY_EDITABLEFIELD, editableField);
    }

    /**
     * @see TabAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public Role getInheritedFrom() {
        return (Role) get(PROPERTY_INHERITEDFROM);
    }
    /**
     * @see TabAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public void setInheritedFrom(Role inheritedFrom) {
        set(PROPERTY_INHERITEDFROM, inheritedFrom);
    }

    /**
     * @see FieldAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FieldAccess> getADFieldAccessList() {
      return (List<FieldAccess>) get(PROPERTY_ADFIELDACCESSLIST);
    }

    /**
     * @see FieldAccess
     * 
     */
    public void setADFieldAccessList(List<FieldAccess> aDFieldAccessList) {
        set(PROPERTY_ADFIELDACCESSLIST, aDFieldAccessList);
    }

}
