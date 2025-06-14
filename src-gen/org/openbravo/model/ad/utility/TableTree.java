
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
package org.openbravo.model.ad.utility;

import java.util.Date;

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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.datasource.DataSource;
/**
 * Entity class for entity ADTableTree (stored in table ad_table_tree).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TableTree extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "ad_table_tree";
    public static final String ENTITY_NAME = "ADTableTree";

    /**
     * Property id stored in column AD_Table_Tree_ID in table ad_table_tree<br>
     * Help: {@literal Tree tables can define several tree structures. If a table tree structure is set in this
     *       field, the tab will include a tree view that will allow to browse the data hierarchically.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table ad_table_tree 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table ad_table_tree 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table ad_table_tree 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table ad_table_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table ad_table_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table ad_table_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table ad_table_tree 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property table stored in column AD_Table_ID in table ad_table_tree<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property linkToParentColumn stored in column Linktoparentcolumn in table ad_table_tree<br>
     * Help: {@literal This field is only used in Link To Parent tables. This field represents the column that
     *       points to the node id of the row that represents the parent of a node}
     * 
     */
    public static final String PROPERTY_LINKTOPARENTCOLUMN = "linkToParentColumn";

    /**
     * Property nodeIdColumn stored in column Nodeidcolumn in table ad_table_tree<br>
     * Help: {@literal For Link to Parent tables: column that represents the id of the node. Usually the id
     *       column should be used.}
     * 
     */
    public static final String PROPERTY_NODEIDCOLUMN = "nodeIdColumn";

    /**
     * Property hasMultiparentNodes stored in column Hasmultiparentnodes in table ad_table_tree<br>
     * Help: {@literal If the data of the table cannot be strictly represented as a tree because each node can
     *       have several parents, this checkbox must be flagged.}
     * 
     */
    public static final String PROPERTY_HASMULTIPARENTNODES = "hasMultiparentNodes";

    /**
     * Property module stored in column AD_Module_ID in table ad_table_tree<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property applyWhereClauseToChildNodes stored in column Applywhereclausetochildnodes in table ad_table_tree<br>
     * Help: {@literal By default, the HQL where clause of the tab is applied to all nodes. If this checkbox is
     *       unset, then this where clause will be applied only to root nodes.}
     * 
     */
    public static final String PROPERTY_APPLYWHERECLAUSETOCHILDNODES = "applyWhereClauseToChildNodes";

    /**
     * Property name stored in column Name in table ad_table_tree 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property isParentSelectionAllowed stored in column Isparentselectionallowed in table ad_table_tree<br>
     * Help: {@literal This property is used to define if non-leaf nodes are allowed to be selected in a tree
     *       reference.}
     * 
     */
    public static final String PROPERTY_ISPARENTSELECTIONALLOWED = "isParentSelectionAllowed";

    /**
     * Property isOrdered stored in column Isordered in table ad_table_tree<br>
     * Help: {@literal The trees that use the ADTreeNode structure can be defined as ordered. In that case, the
     *       position of a node among its brothers is defined by a sequence number. }
     * 
     */
    public static final String PROPERTY_ISORDERED = "isOrdered";

    /**
     * Property treeStructure stored in column Treestructure in table ad_table_tree<br>
     * Help: {@literal Three different tree structures are available:
     *       - AD Tree Node: The information regarding
     *       the hierarchy of the data is stored in the ADTree and ADTreeNode tables.
     *       - Link to Parent in Table:
     *       This structure can be used when the informartion regarding the hierarchy of the data can be fetched
     *       from the own table. In this case, there has to be a column in the table that points to the row that
     *       represents the parent node of the record.
     *       - Custom: For other tree tables, a manual datasource can
     *       be defined}
     * 
     */
    public static final String PROPERTY_TREESTRUCTURE = "treeStructure";

    /**
     * Property datasource stored in column Obserds_Datasource_ID in table ad_table_tree<br>
     * Help: {@literal Datasource used to feed the table}
     * 
     */
    public static final String PROPERTY_DATASOURCE = "datasource";

    /**
     * Property handleNodesManually stored in column Ishandlenodesmanually in table ad_table_tree<br>
     * Help: {@literal Tree node creation and deletion can be handled:
     *       - Automatically: With an Openbravo handler
     *       that creates the tree node when a record is created, and deletes the tree node when the record is
     *       deleted.
     *       - Manually: With a custom trigger, event handler, etc.
     *       If this flag is checked the creation
     *       and deletion of tree nodes will be handled manually.}
     * 
     */
    public static final String PROPERTY_HANDLENODESMANUALLY = "handleNodesManually";

    /**
     * Property isMainTree stored in column Ismaintree in table ad_table_tree<br>
     * Help: {@literal A table can define several trees, but only one of them can be the main tree. The main tree
     *       is used when a node is added to the tree or removed from it. The add or remove methods of the
     *       datasource of the main tree will be executed when the node is created or deleted. 
     *       
     *       If one of the
     *       trees of a table uses the ADTree tree structure, that must be the main tree.}
     * 
     */
    public static final String PROPERTY_ISMAINTREE = "isMainTree";

    /**
     * Property nodeDeletionPolicy stored in column NodeDeletionPolicy in table ad_table_tree<br>
     * Help: {@literal It defines the behavior when a node item is deleted}
     * 
     */
    public static final String PROPERTY_NODEDELETIONPOLICY = "nodeDeletionPolicy";


    public TableTree() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_HASMULTIPARENTNODES, false);
        setDefaultValue(PROPERTY_APPLYWHERECLAUSETOCHILDNODES, true);
        setDefaultValue(PROPERTY_ISPARENTSELECTIONALLOWED, true);
        setDefaultValue(PROPERTY_ISORDERED, false);
        setDefaultValue(PROPERTY_HANDLENODESMANUALLY, false);
        setDefaultValue(PROPERTY_ISMAINTREE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TableTree#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TableTree#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TableTree#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TableTree#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TableTree#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TableTree#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TableTree#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TableTree#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TableTree#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TableTree#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TableTree#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TableTree#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TableTree#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TableTree#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TableTree#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TableTree#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TableTree#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see TableTree#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see TableTree#PROPERTY_LINKTOPARENTCOLUMN
     * 
     */
    public Column getLinkToParentColumn() {
        return (Column) get(PROPERTY_LINKTOPARENTCOLUMN);
    }
    /**
     * @see TableTree#PROPERTY_LINKTOPARENTCOLUMN
     * 
     */
    public void setLinkToParentColumn(Column linkToParentColumn) {
        set(PROPERTY_LINKTOPARENTCOLUMN, linkToParentColumn);
    }

    /**
     * @see TableTree#PROPERTY_NODEIDCOLUMN
     * 
     */
    public Column getNodeIdColumn() {
        return (Column) get(PROPERTY_NODEIDCOLUMN);
    }
    /**
     * @see TableTree#PROPERTY_NODEIDCOLUMN
     * 
     */
    public void setNodeIdColumn(Column nodeIdColumn) {
        set(PROPERTY_NODEIDCOLUMN, nodeIdColumn);
    }

    /**
     * @see TableTree#PROPERTY_HASMULTIPARENTNODES
     * 
     */
    public Boolean isHasMultiparentNodes() {
        return (Boolean) get(PROPERTY_HASMULTIPARENTNODES);
    }
    /**
     * @see TableTree#PROPERTY_HASMULTIPARENTNODES
     * 
     */
    public void setHasMultiparentNodes(Boolean hasMultiparentNodes) {
        set(PROPERTY_HASMULTIPARENTNODES, hasMultiparentNodes);
    }

    /**
     * @see TableTree#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see TableTree#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see TableTree#PROPERTY_APPLYWHERECLAUSETOCHILDNODES
     * 
     */
    public Boolean isApplyWhereClauseToChildNodes() {
        return (Boolean) get(PROPERTY_APPLYWHERECLAUSETOCHILDNODES);
    }
    /**
     * @see TableTree#PROPERTY_APPLYWHERECLAUSETOCHILDNODES
     * 
     */
    public void setApplyWhereClauseToChildNodes(Boolean applyWhereClauseToChildNodes) {
        set(PROPERTY_APPLYWHERECLAUSETOCHILDNODES, applyWhereClauseToChildNodes);
    }

    /**
     * @see TableTree#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see TableTree#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see TableTree#PROPERTY_ISPARENTSELECTIONALLOWED
     * 
     */
    public Boolean isParentSelectionAllowed() {
        return (Boolean) get(PROPERTY_ISPARENTSELECTIONALLOWED);
    }
    /**
     * @see TableTree#PROPERTY_ISPARENTSELECTIONALLOWED
     * 
     */
    public void setParentSelectionAllowed(Boolean isParentSelectionAllowed) {
        set(PROPERTY_ISPARENTSELECTIONALLOWED, isParentSelectionAllowed);
    }

    /**
     * @see TableTree#PROPERTY_ISORDERED
     * 
     */
    public Boolean isOrdered() {
        return (Boolean) get(PROPERTY_ISORDERED);
    }
    /**
     * @see TableTree#PROPERTY_ISORDERED
     * 
     */
    public void setOrdered(Boolean isOrdered) {
        set(PROPERTY_ISORDERED, isOrdered);
    }

    /**
     * @see TableTree#PROPERTY_TREESTRUCTURE
     * 
     */
    public String getTreeStructure() {
        return (String) get(PROPERTY_TREESTRUCTURE);
    }
    /**
     * @see TableTree#PROPERTY_TREESTRUCTURE
     * 
     */
    public void setTreeStructure(String treeStructure) {
        set(PROPERTY_TREESTRUCTURE, treeStructure);
    }

    /**
     * @see TableTree#PROPERTY_DATASOURCE
     * 
     */
    public DataSource getDatasource() {
        return (DataSource) get(PROPERTY_DATASOURCE);
    }
    /**
     * @see TableTree#PROPERTY_DATASOURCE
     * 
     */
    public void setDatasource(DataSource datasource) {
        set(PROPERTY_DATASOURCE, datasource);
    }

    /**
     * @see TableTree#PROPERTY_HANDLENODESMANUALLY
     * 
     */
    public Boolean isHandleNodesManually() {
        return (Boolean) get(PROPERTY_HANDLENODESMANUALLY);
    }
    /**
     * @see TableTree#PROPERTY_HANDLENODESMANUALLY
     * 
     */
    public void setHandleNodesManually(Boolean handleNodesManually) {
        set(PROPERTY_HANDLENODESMANUALLY, handleNodesManually);
    }

    /**
     * @see TableTree#PROPERTY_ISMAINTREE
     * 
     */
    public Boolean isMainTree() {
        return (Boolean) get(PROPERTY_ISMAINTREE);
    }
    /**
     * @see TableTree#PROPERTY_ISMAINTREE
     * 
     */
    public void setMainTree(Boolean isMainTree) {
        set(PROPERTY_ISMAINTREE, isMainTree);
    }

    /**
     * @see TableTree#PROPERTY_NODEDELETIONPOLICY
     * 
     */
    public String getNodeDeletionPolicy() {
        return (String) get(PROPERTY_NODEDELETIONPOLICY);
    }
    /**
     * @see TableTree#PROPERTY_NODEDELETIONPOLICY
     * 
     */
    public void setNodeDeletionPolicy(String nodeDeletionPolicy) {
        set(PROPERTY_NODEDELETIONPOLICY, nodeDeletionPolicy);
    }

}
