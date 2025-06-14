
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.TableTree;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADReferencedTree (stored in table ad_ref_tree).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReferencedTree extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "ad_ref_tree";
    public static final String ENTITY_NAME = "ADReferencedTree";

    /**
     * Property id stored in column AD_Ref_Tree_ID in table ad_ref_tree
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table ad_ref_tree 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table ad_ref_tree 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table ad_ref_tree 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table ad_ref_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table ad_ref_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table ad_ref_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table ad_ref_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property reference stored in column AD_Reference_ID in table ad_ref_tree<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property table stored in column AD_Table_ID in table ad_ref_tree<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property column stored in column AD_Column_ID in table ad_ref_tree<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property hQLSQLWhereClause stored in column Whereclause in table ad_ref_tree<br>
     * Help: {@literal The Where Clause indicates the HQL (Hibernate Query Language) or SQL WHERE clause used for
     *       filtering data. In releases until and including 2.50 MP11 this field only accepts a HQL where clause
     *       (without the where keyword). In later releases for the AD dataset a SQL clause should be used, other
     *       datasets should use the HQL format.}
     * 
     */
    public static final String PROPERTY_HQLSQLWHERECLAUSE = "hQLSQLWhereClause";

    /**
     * Property valuefield stored in column Valuefield_ID in table ad_ref_tree<br>
     * Help: {@literal The value of this field will be set in the foreign key column. }
     * 
     */
    public static final String PROPERTY_VALUEFIELD = "valuefield";

    /**
     * Property displayfield stored in column Displayfield_ID in table ad_ref_tree<br>
     * Help: {@literal The value of this field will be displayed in the tree reference text input box.}
     * 
     */
    public static final String PROPERTY_DISPLAYFIELD = "displayfield";

    /**
     * Property tableTreeCategory stored in column AD_Table_Tree_ID in table ad_ref_tree<br>
     * Help: {@literal Tree tables can define several tree structures. If a table tree structure is set in this
     *       field, the tab will include a tree view that will allow to browse the data hierarchically.}
     * 
     */
    public static final String PROPERTY_TABLETREECATEGORY = "tableTreeCategory";

    /**
     * Property hQLWhereClauseForRootNodes stored in column Whereclauserootnodes in table ad_ref_tree<br>
     * Help: {@literal By default the root nodes of the tree are those whose parent is null or 0. When the
     *       default case does not apply, a HQL where clause can be set to define which are the root nodes for
     *       this tree reference.}
     * 
     */
    public static final String PROPERTY_HQLWHERECLAUSEFORROOTNODES = "hQLWhereClauseForRootNodes";

    /**
     * Property module stored in column AD_Module_ID in table ad_ref_tree<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property aDReferencedTreeFieldList stored in table ad_ref_tree
     * 
     */
    public static final String PROPERTY_ADREFERENCEDTREEFIELDLIST = "aDReferencedTreeFieldList";


    public ReferencedTree() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ADREFERENCEDTREEFIELDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReferencedTree#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReferencedTree#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReferencedTree#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReferencedTree#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReferencedTree#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReferencedTree#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReferencedTree#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReferencedTree#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReferencedTree#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReferencedTree#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReferencedTree#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReferencedTree#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReferencedTree#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReferencedTree#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReferencedTree#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReferencedTree#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReferencedTree#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see ReferencedTree#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see ReferencedTree#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see ReferencedTree#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see ReferencedTree#PROPERTY_COLUMN
     * 
     */
    public Column getColumn() {
        return (Column) get(PROPERTY_COLUMN);
    }
    /**
     * @see ReferencedTree#PROPERTY_COLUMN
     * 
     */
    public void setColumn(Column column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see ReferencedTree#PROPERTY_HQLSQLWHERECLAUSE
     * 
     */
    public String getHQLSQLWhereClause() {
        return (String) get(PROPERTY_HQLSQLWHERECLAUSE);
    }
    /**
     * @see ReferencedTree#PROPERTY_HQLSQLWHERECLAUSE
     * 
     */
    public void setHQLSQLWhereClause(String hQLSQLWhereClause) {
        set(PROPERTY_HQLSQLWHERECLAUSE, hQLSQLWhereClause);
    }

    /**
     * @see ReferencedTree#PROPERTY_VALUEFIELD
     * 
     */
    public ReferencedTreeField getValuefield() {
        return (ReferencedTreeField) get(PROPERTY_VALUEFIELD);
    }
    /**
     * @see ReferencedTree#PROPERTY_VALUEFIELD
     * 
     */
    public void setValuefield(ReferencedTreeField valuefield) {
        set(PROPERTY_VALUEFIELD, valuefield);
    }

    /**
     * @see ReferencedTree#PROPERTY_DISPLAYFIELD
     * 
     */
    public ReferencedTreeField getDisplayfield() {
        return (ReferencedTreeField) get(PROPERTY_DISPLAYFIELD);
    }
    /**
     * @see ReferencedTree#PROPERTY_DISPLAYFIELD
     * 
     */
    public void setDisplayfield(ReferencedTreeField displayfield) {
        set(PROPERTY_DISPLAYFIELD, displayfield);
    }

    /**
     * @see ReferencedTree#PROPERTY_TABLETREECATEGORY
     * 
     */
    public TableTree getTableTreeCategory() {
        return (TableTree) get(PROPERTY_TABLETREECATEGORY);
    }
    /**
     * @see ReferencedTree#PROPERTY_TABLETREECATEGORY
     * 
     */
    public void setTableTreeCategory(TableTree tableTreeCategory) {
        set(PROPERTY_TABLETREECATEGORY, tableTreeCategory);
    }

    /**
     * @see ReferencedTree#PROPERTY_HQLWHERECLAUSEFORROOTNODES
     * 
     */
    public String getHQLWhereClauseForRootNodes() {
        return (String) get(PROPERTY_HQLWHERECLAUSEFORROOTNODES);
    }
    /**
     * @see ReferencedTree#PROPERTY_HQLWHERECLAUSEFORROOTNODES
     * 
     */
    public void setHQLWhereClauseForRootNodes(String hQLWhereClauseForRootNodes) {
        set(PROPERTY_HQLWHERECLAUSEFORROOTNODES, hQLWhereClauseForRootNodes);
    }

    /**
     * @see ReferencedTree#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ReferencedTree#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ReferencedTreeField
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReferencedTreeField> getADReferencedTreeFieldList() {
      return (List<ReferencedTreeField>) get(PROPERTY_ADREFERENCEDTREEFIELDLIST);
    }

    /**
     * @see ReferencedTreeField
     * 
     */
    public void setADReferencedTreeFieldList(List<ReferencedTreeField> aDReferencedTreeFieldList) {
        set(PROPERTY_ADREFERENCEDTREEFIELDLIST, aDReferencedTreeFieldList);
    }

}
