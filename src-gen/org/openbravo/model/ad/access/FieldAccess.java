
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.InheritedAccessEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Field;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADFieldAccess (stored in table AD_Field_Access).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FieldAccess extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled, InheritedAccessEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Field_Access";
    public static final String ENTITY_NAME = "ADFieldAccess";

    /**
     * Property id stored in column AD_Field_Access_ID in table AD_Field_Access 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Field_Access 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Field_Access 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Field_Access 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Field_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Field_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Field_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Field_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property tabAccess stored in column AD_Tab_Access_ID in table AD_Field_Access
     * 
     */
    public static final String PROPERTY_TABACCESS = "tabAccess";

    /**
     * Property field stored in column AD_Field_ID in table AD_Field_Access<br>
     * Help: {@literal The Field identifies a field on a database table.}
     * 
     */
    public static final String PROPERTY_FIELD = "field";

    /**
     * Property editableField stored in column IsreadWrite in table AD_Field_Access<br>
     * Help: {@literal The Read Write indicates that this field may be read and updated.}
     * 
     */
    public static final String PROPERTY_EDITABLEFIELD = "editableField";

    /**
     * Property ischeckonsave stored in column Ischeckonsave in table AD_Field_Access<br>
     * Help: {@literal Fields that are marked as "Check On Save" and are read only for the role, when they are
     *       modified in that tab, backend raises an error.
     *       In case they are not "Check On Save", this
     *       verification is skipped. The purpose is to allow fields to be read only  for a concrete role to be
     *       modified through callouts.}
     * 
     */
    public static final String PROPERTY_ISCHECKONSAVE = "ischeckonsave";

    /**
     * Property inheritedFrom stored in column Inherited_From in table AD_Field_Access<br>
     * Help: {@literal The role from which a permission has been inherited. If a permission has this field set it
     *       means that this is an inherited permission, an therefore that the role owner of the permission is
     *       able to access it because it inherits from the role defined in this field.}
     * 
     */
    public static final String PROPERTY_INHERITEDFROM = "inheritedFrom";


    public FieldAccess() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_EDITABLEFIELD, true);
        setDefaultValue(PROPERTY_ISCHECKONSAVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FieldAccess#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FieldAccess#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FieldAccess#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FieldAccess#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FieldAccess#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FieldAccess#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FieldAccess#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FieldAccess#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FieldAccess#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FieldAccess#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FieldAccess#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FieldAccess#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FieldAccess#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FieldAccess#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FieldAccess#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FieldAccess#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FieldAccess#PROPERTY_TABACCESS
     * 
     */
    public TabAccess getTabAccess() {
        return (TabAccess) get(PROPERTY_TABACCESS);
    }
    /**
     * @see FieldAccess#PROPERTY_TABACCESS
     * 
     */
    public void setTabAccess(TabAccess tabAccess) {
        set(PROPERTY_TABACCESS, tabAccess);
    }

    /**
     * @see FieldAccess#PROPERTY_FIELD
     * 
     */
    public Field getField() {
        return (Field) get(PROPERTY_FIELD);
    }
    /**
     * @see FieldAccess#PROPERTY_FIELD
     * 
     */
    public void setField(Field field) {
        set(PROPERTY_FIELD, field);
    }

    /**
     * @see FieldAccess#PROPERTY_EDITABLEFIELD
     * 
     */
    public Boolean isEditableField() {
        return (Boolean) get(PROPERTY_EDITABLEFIELD);
    }
    /**
     * @see FieldAccess#PROPERTY_EDITABLEFIELD
     * 
     */
    public void setEditableField(Boolean editableField) {
        set(PROPERTY_EDITABLEFIELD, editableField);
    }

    /**
     * @see FieldAccess#PROPERTY_ISCHECKONSAVE
     * 
     */
    public Boolean isCheckonsave() {
        return (Boolean) get(PROPERTY_ISCHECKONSAVE);
    }
    /**
     * @see FieldAccess#PROPERTY_ISCHECKONSAVE
     * 
     */
    public void setCheckonsave(Boolean ischeckonsave) {
        set(PROPERTY_ISCHECKONSAVE, ischeckonsave);
    }

    /**
     * @see FieldAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public Role getInheritedFrom() {
        return (Role) get(PROPERTY_INHERITEDFROM);
    }
    /**
     * @see FieldAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public void setInheritedFrom(Role inheritedFrom) {
        set(PROPERTY_INHERITEDFROM, inheritedFrom);
    }

}
