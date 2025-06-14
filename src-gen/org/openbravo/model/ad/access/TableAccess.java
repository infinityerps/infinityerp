
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
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADTableAccess (stored in table AD_Table_Access).
 * <br>
 * Help: {@literal If listed here, the Role can(not) access all data of this table, even if the role has
     *       access to the functionality}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TableAccess extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled, InheritedAccessEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Table_Access";
    public static final String ENTITY_NAME = "ADTableAccess";

    /**
     * Property id stored in column AD_Table_Access_ID in table AD_Table_Access 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property role stored in column AD_Role_ID in table AD_Table_Access<br>
     * Help: {@literal The Role determines security and access a user who has this Role will have in the System.}
     * 
     */
    public static final String PROPERTY_ROLE = "role";

    /**
     * Property table stored in column AD_Table_ID in table AD_Table_Access<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property client stored in column AD_Client_ID in table AD_Table_Access 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Table_Access 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Table_Access 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Table_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Table_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Table_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property updated stored in column Updated in table AD_Table_Access 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property readOnly stored in column IsReadOnly in table AD_Table_Access<br>
     * Help: {@literal The Read Only indicates that this field may only be Read.  It may not be updated.}
     * 
     */
    public static final String PROPERTY_READONLY = "readOnly";

    /**
     * Property exclude stored in column IsExclude in table AD_Table_Access<br>
     * Help: {@literal If selected, the role cannot access the data specified.  If not selected, the role can
     *       ONLY access the data specified}
     * 
     */
    public static final String PROPERTY_EXCLUDE = "exclude";

    /**
     * Property inheritedFrom stored in column Inherited_From in table AD_Table_Access<br>
     * Help: {@literal The role from which a permission has been inherited. If a permission has this field set it
     *       means that this is an inherited permission, an therefore that the role owner of the permission is
     *       able to access it because it inherits from the role defined in this field.}
     * 
     */
    public static final String PROPERTY_INHERITEDFROM = "inheritedFrom";


    public TableAccess() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_READONLY, false);
        setDefaultValue(PROPERTY_EXCLUDE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TableAccess#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TableAccess#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TableAccess#PROPERTY_ROLE
     * 
     */
    public Role getRole() {
        return (Role) get(PROPERTY_ROLE);
    }
    /**
     * @see TableAccess#PROPERTY_ROLE
     * 
     */
    public void setRole(Role role) {
        set(PROPERTY_ROLE, role);
    }

    /**
     * @see TableAccess#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see TableAccess#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see TableAccess#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TableAccess#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TableAccess#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TableAccess#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TableAccess#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TableAccess#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TableAccess#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TableAccess#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TableAccess#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TableAccess#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TableAccess#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TableAccess#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TableAccess#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TableAccess#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TableAccess#PROPERTY_READONLY
     * 
     */
    public Boolean isReadOnly() {
        return (Boolean) get(PROPERTY_READONLY);
    }
    /**
     * @see TableAccess#PROPERTY_READONLY
     * 
     */
    public void setReadOnly(Boolean readOnly) {
        set(PROPERTY_READONLY, readOnly);
    }

    /**
     * @see TableAccess#PROPERTY_EXCLUDE
     * 
     */
    public Boolean isExclude() {
        return (Boolean) get(PROPERTY_EXCLUDE);
    }
    /**
     * @see TableAccess#PROPERTY_EXCLUDE
     * 
     */
    public void setExclude(Boolean exclude) {
        set(PROPERTY_EXCLUDE, exclude);
    }

    /**
     * @see TableAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public Role getInheritedFrom() {
        return (Role) get(PROPERTY_INHERITEDFROM);
    }
    /**
     * @see TableAccess#PROPERTY_INHERITEDFROM
     * 
     */
    public void setInheritedFrom(Role inheritedFrom) {
        set(PROPERTY_INHERITEDFROM, inheritedFrom);
    }

}
