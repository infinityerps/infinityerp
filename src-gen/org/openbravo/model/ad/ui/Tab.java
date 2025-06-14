
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
package org.openbravo.model.ad.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.application.GCTab;
import org.openbravo.model.ad.access.TabAccess;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.ad.utility.TableTree;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADTab (stored in table AD_Tab).
 * <br>
 * Help: {@literal The Tab Tab defines each Tab within a Window.  Each Tab contains a discrete selection of
     *       fields.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Tab extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Tab";
    public static final String ENTITY_NAME = "ADTab";

    /**
     * Property id stored in column AD_Tab_ID in table AD_Tab<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Tab 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Tab 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Tab 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Tab 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Tab<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Tab<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property table stored in column AD_Table_ID in table AD_Tab<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property window stored in column AD_Window_ID in table AD_Tab<br>
     * Help: {@literal The Window field identifies a unique Window in the system.}
     * 
     */
    public static final String PROPERTY_WINDOW = "window";

    /**
     * Property sequenceNumber stored in column SeqNo in table AD_Tab<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property tabLevel stored in column TabLevel in table AD_Tab<br>
     * Help: {@literal Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries
     *       are dependent on level 0, etc.}
     * 
     */
    public static final String PROPERTY_TABLEVEL = "tabLevel";

    /**
     * Property defaultEditMode stored in column IsSingleRow in table AD_Tab<br>
     * Help: {@literal The Single Row Layout checkbox indicates if the default display type for this window is a
     *       single row as opposed to multi row.}
     * 
     */
    public static final String PROPERTY_DEFAULTEDITMODE = "defaultEditMode";

    /**
     * Property accountingTab stored in column IsInfoTab in table AD_Tab<br>
     * Help: {@literal The Accounting Tab checkbox indicates if this window contains accounting information.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGTAB = "accountingTab";

    /**
     * Property translationTab stored in column IsTranslationTab in table AD_Tab<br>
     * Help: {@literal The Translation Tab checkbox indicate if a tab contains translation information.}
     * 
     */
    public static final String PROPERTY_TRANSLATIONTAB = "translationTab";

    /**
     * Property readOnly stored in column IsReadOnly in table AD_Tab<br>
     * Help: {@literal The Read Only indicates that this field may only be Read.  It may not be updated.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_READONLY = "readOnly";

    /**
     * Property column stored in column AD_Column_ID in table AD_Tab<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property treeIncluded stored in column HasTree in table AD_Tab<br>
     * Help: {@literal The Has Tree checkbox indicates if this window displays a tree metaphor.}
     * 
     */
    public static final String PROPERTY_TREEINCLUDED = "treeIncluded";

    /**
     * Property sQLWhereClause stored in column WhereClause in table AD_Tab<br>
     * Help: {@literal The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE
     *       clause is added to the query. Fully qualified means "tablename.columnname".}
     * 
     */
    public static final String PROPERTY_SQLWHERECLAUSE = "sQLWhereClause";

    /**
     * Property sQLOrderByClause stored in column OrderByClause in table AD_Tab<br>
     * Help: {@literal The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection}
     * 
     */
    public static final String PROPERTY_SQLORDERBYCLAUSE = "sQLOrderByClause";

    /**
     * Property confirmationMessage stored in column CommitWarning in table AD_Tab<br>
     * Help: {@literal Warning or information displayed when committing the record}
     * 
     */
    public static final String PROPERTY_CONFIRMATIONMESSAGE = "confirmationMessage";

    /**
     * Property process stored in column AD_Process_ID in table AD_Tab<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property processNow stored in column Processing in table AD_Tab<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property image stored in column AD_Image_ID in table AD_Tab<br>
     * Help: {@literal Defines a system image}
     * 
     */
    public static final String PROPERTY_IMAGE = "image";

    /**
     * Property importFields stored in column ImportFields in table AD_Tab<br>
     * Help: {@literal Create Fields from Table Columns, this process will create the fields that don't exists in
     *       the tab but which exist in the correspondent table.}
     * 
     */
    public static final String PROPERTY_IMPORTFIELDS = "importFields";

    /**
     * Property orderColumn stored in column AD_ColumnSortOrder_ID in table AD_Tab<br>
     * Help: {@literal Integer Column of the table determining the order (display, sort, ..). If defined, the
     *       Order By replaces the default Order By clause. It should be fully qualified (i.e.
     *       "tablename.columnname").}
     * 
     */
    public static final String PROPERTY_ORDERCOLUMN = "orderColumn";

    /**
     * Property includedColumn stored in column AD_ColumnSortYesNo_ID in table AD_Tab<br>
     * Help: {@literal If a Included Column is defined, it decides, if a column is active in the ordering -
     *       otherwise it is determined that the Order Column has a value of one or greater}
     * 
     */
    public static final String PROPERTY_INCLUDEDCOLUMN = "includedColumn";

    /**
     * Property sequenceTab stored in column IsSortTab in table AD_Tab<br>
     * Help: {@literal The Tab determines the Order.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_SEQUENCETAB = "sequenceTab";

    /**
     * Property includedTab stored in column Included_Tab_ID in table AD_Tab<br>
     * Help: {@literal You can include a Tab in a Tab. If displayed in single row record, the included tab is
     *       displayed as multi-row table.}
     * 
     */
    public static final String PROPERTY_INCLUDEDTAB = "includedTab";

    /**
     * Property filterClause stored in column FilterClause in table AD_Tab<br>
     * Help: {@literal Filter clause}
     * 
     */
    public static final String PROPERTY_FILTERCLAUSE = "filterClause";

    /**
     * Property masterDetailForm stored in column EditReference in table AD_Tab<br>
     * Help: {@literal The form referenced in the edition command}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_MASTERDETAILFORM = "masterDetailForm";

    /**
     * Property module stored in column AD_Module_ID in table AD_Tab<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property uIPattern stored in column UIPattern in table AD_Tab<br>
     * Help: {@literal Defines the UI Pattern that the object implements.}
     * 
     */
    public static final String PROPERTY_UIPATTERN = "uIPattern";

    /**
     * Property hqlwhereclause stored in column Hqlwhereclause in table AD_Tab<br>
     * Help: {@literal  By using this HQL filter, the user will never be able to see data that does not fit the
     *       criteria. The HQL where clause is added to the query to retrieve the data which is returned by the
     *       datasource}
     * 
     */
    public static final String PROPERTY_HQLWHERECLAUSE = "hqlwhereclause";

    /**
     * Property hqlorderbyclause stored in column Hqlorderbyclause in table AD_Tab
     * 
     */
    public static final String PROPERTY_HQLORDERBYCLAUSE = "hqlorderbyclause";

    /**
     * Property hqlfilterclause stored in column Hqlfilterclause in table AD_Tab<br>
     * Help: {@literal By using this HQL clause, initially the user will not be able to see  data that does not
     *       fit the criteria. Once the user clears the filter, this hql clause will not be applied.}
     * 
     */
    public static final String PROPERTY_HQLFILTERCLAUSE = "hqlfilterclause";

    /**
     * Property filterName stored in column FilterName in table AD_Tab<br>
     * Help: {@literal When there is a default filter for the tab, it can be named so the user can see it in the
     *       UI.}
     * 
     */
    public static final String PROPERTY_FILTERNAME = "filterName";

    /**
     * Property showParentsButtons stored in column ShowParentButtons in table AD_Tab<br>
     * Help: {@literal In case this flag is enabled, buttons defined in parent tab will be shown in current one.}
     * 
     */
    public static final String PROPERTY_SHOWPARENTSBUTTONS = "showParentsButtons";

    /**
     * Property displayLogic stored in column Displaylogic in table AD_Tab<br>
     * Help: {@literal A specification of statements which, when evaluated as false, cause the field to appear
     *       hidden.}
     * 
     */
    public static final String PROPERTY_DISPLAYLOGIC = "displayLogic";

    /**
     * Property tableTree stored in column AD_Table_Tree_ID in table AD_Tab<br>
     * Help: {@literal Tree tables can define several tree structures. If a table tree structure is set in this
     *       field, the tab will include a tree view that will allow to browse the data hierarchically.}
     * 
     */
    public static final String PROPERTY_TABLETREE = "tableTree";

    /**
     * Property hQLWhereClauseForRootNodes stored in column Hqltreewhereclause in table AD_Tab<br>
     * Help: {@literal By default the root nodes of the tree are those whose parent is null or 0. When the
     *       default case does not apply, a HQL where clause can be set to define which are the root nodes for
     *       this tab.}
     * 
     */
    public static final String PROPERTY_HQLWHERECLAUSEFORROOTNODES = "hQLWhereClauseForRootNodes";

    /**
     * Property disableParentKeyProperty stored in column Disable_Parent_Key_Property in table AD_Tab<br>
     * Help: {@literal Flag to check whether parent property needs to be used when computing tab whereclause}
     * 
     */
    public static final String PROPERTY_DISABLEPARENTKEYPROPERTY = "disableParentKeyProperty";

    /**
     * Property readOnlyTree stored in column IsReadOnlyTree in table AD_Tab<br>
     * Help: {@literal It defines if the tree of this tab should behave as read only mode so nodes cannot be
     *       reordered.}
     * 
     */
    public static final String PROPERTY_READONLYTREE = "readOnlyTree";

    /**
     * Property showTreeNodeIcons stored in column IsShowTreeNodeIcons in table AD_Tab<br>
     * Help: {@literal It defines if the tree nodes icons (folder and leaf) should be shown. It only applies if
     *       the tree grid is in read only mode.}
     * 
     */
    public static final String PROPERTY_SHOWTREENODEICONS = "showTreeNodeIcons";

    /**
     * Property defaultTreeViewLogic stored in column DefaultTreeViewLogic in table AD_Tab<br>
     * Help: {@literal It defines a criteria to set by default the visualization of the tree grid view when the
     *       window loads}
     * 
     */
    public static final String PROPERTY_DEFAULTTREEVIEWLOGIC = "defaultTreeViewLogic";

    /**
     * Property oBUIAPPSelection stored in column EM_OBUIAPP_Selection in table AD_Tab<br>
     * Help: {@literal When the user changes the selection (a row gets selected or deselected) the custom
     *       JavaScript function will get executed}
     * 
     */
    public static final String PROPERTY_OBUIAPPSELECTION = "oBUIAPPSelection";

    /**
     * Property obuiappCanAdd stored in column EM_Obuiapp_Can_Add in table AD_Tab<br>
     * Help: {@literal Defines if a user is allowed to add new lines}
     * 
     */
    public static final String PROPERTY_OBUIAPPCANADD = "obuiappCanAdd";

    /**
     * Property obuiappCanDelete stored in column EM_Obuiapp_Can_Delete in table AD_Tab<br>
     * Help: {@literal Defines if a user is allowed to delete lines}
     * 
     */
    public static final String PROPERTY_OBUIAPPCANDELETE = "obuiappCanDelete";

    /**
     * Property obuiappShowSelect stored in column EM_Obuiapp_Show_Select in table AD_Tab<br>
     * Help: {@literal Some use cases requires that the selection column (checkbox column) is hidden}
     * 
     */
    public static final String PROPERTY_OBUIAPPSHOWSELECT = "obuiappShowSelect";

    /**
     * Property oBUIAPPNewFn stored in column EM_Obuiapp_Newfn in table AD_Tab<br>
     * Help: {@literal Defines the function that will called when adding a new row to the grid}
     * 
     */
    public static final String PROPERTY_OBUIAPPNEWFN = "oBUIAPPNewFn";

    /**
     * Property obuiappRemovefn stored in column EM_Obuiapp_Removefn in table AD_Tab<br>
     * Help: {@literal When the grid allows remove rows you can specify a "on remove" function that will get
     *       executed when trying remove a row. If the function returns false, the row will not get removed.}
     * 
     */
    public static final String PROPERTY_OBUIAPPREMOVEFN = "obuiappRemovefn";

    /**
     * Property obuiappSelectionType stored in column EM_Obuiapp_Selection_Type in table AD_Tab<br>
     * Help: {@literal It specifies the selection type that will apply to the grid.
     *       Its value can be:
     *        * "None":
     *       no rows can be selected
     *        * "Single": only one row can be selected
     *        * "Multiple": multiple rows can
     *       be selected}
     * 
     */
    public static final String PROPERTY_OBUIAPPSELECTIONTYPE = "obuiappSelectionType";

    /**
     * Property aDAuxiliaryInputList stored in table AD_Tab
     * 
     */
    public static final String PROPERTY_ADAUXILIARYINPUTLIST = "aDAuxiliaryInputList";

    /**
     * Property aDFieldList stored in table AD_Tab
     * 
     */
    public static final String PROPERTY_ADFIELDLIST = "aDFieldList";

    /**
     * Property aDTabAccessList stored in table AD_Tab
     * 
     */
    public static final String PROPERTY_ADTABACCESSLIST = "aDTabAccessList";

    /**
     * Property aDTabTrlList stored in table AD_Tab
     * 
     */
    public static final String PROPERTY_ADTABTRLLIST = "aDTabTrlList";

    /**
     * Property oBUIAPPGCTabList stored in table AD_Tab
     * 
     */
    public static final String PROPERTY_OBUIAPPGCTABLIST = "oBUIAPPGCTabList";


    public Tab() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULTEDITMODE, false);
        setDefaultValue(PROPERTY_ACCOUNTINGTAB, false);
        setDefaultValue(PROPERTY_TRANSLATIONTAB, false);
        setDefaultValue(PROPERTY_READONLY, false);
        setDefaultValue(PROPERTY_TREEINCLUDED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_IMPORTFIELDS, false);
        setDefaultValue(PROPERTY_SEQUENCETAB, false);
        setDefaultValue(PROPERTY_UIPATTERN, "STD");
        setDefaultValue(PROPERTY_SHOWPARENTSBUTTONS, true);
        setDefaultValue(PROPERTY_DISABLEPARENTKEYPROPERTY, false);
        setDefaultValue(PROPERTY_READONLYTREE, false);
        setDefaultValue(PROPERTY_SHOWTREENODEICONS, true);
        setDefaultValue(PROPERTY_OBUIAPPCANADD, false);
        setDefaultValue(PROPERTY_OBUIAPPCANDELETE, false);
        setDefaultValue(PROPERTY_OBUIAPPSHOWSELECT, true);
        setDefaultValue(PROPERTY_ADAUXILIARYINPUTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADFIELDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADTABACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADTABTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPGCTABLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Tab#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Tab#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Tab#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Tab#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Tab#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Tab#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Tab#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Tab#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Tab#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Tab#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Tab#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Tab#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Tab#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Tab#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Tab#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Tab#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Tab#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Tab#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Tab#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Tab#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Tab#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Tab#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Tab#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see Tab#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see Tab#PROPERTY_WINDOW
     * 
     */
    public Window getWindow() {
        return (Window) get(PROPERTY_WINDOW);
    }
    /**
     * @see Tab#PROPERTY_WINDOW
     * 
     */
    public void setWindow(Window window) {
        set(PROPERTY_WINDOW, window);
    }

    /**
     * @see Tab#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see Tab#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see Tab#PROPERTY_TABLEVEL
     * 
     */
    public Long getTabLevel() {
        return (Long) get(PROPERTY_TABLEVEL);
    }
    /**
     * @see Tab#PROPERTY_TABLEVEL
     * 
     */
    public void setTabLevel(Long tabLevel) {
        set(PROPERTY_TABLEVEL, tabLevel);
    }

    /**
     * @see Tab#PROPERTY_DEFAULTEDITMODE
     * 
     */
    public Boolean isDefaultEditMode() {
        return (Boolean) get(PROPERTY_DEFAULTEDITMODE);
    }
    /**
     * @see Tab#PROPERTY_DEFAULTEDITMODE
     * 
     */
    public void setDefaultEditMode(Boolean defaultEditMode) {
        set(PROPERTY_DEFAULTEDITMODE, defaultEditMode);
    }

    /**
     * @see Tab#PROPERTY_ACCOUNTINGTAB
     * 
     */
    public Boolean isAccountingTab() {
        return (Boolean) get(PROPERTY_ACCOUNTINGTAB);
    }
    /**
     * @see Tab#PROPERTY_ACCOUNTINGTAB
     * 
     */
    public void setAccountingTab(Boolean accountingTab) {
        set(PROPERTY_ACCOUNTINGTAB, accountingTab);
    }

    /**
     * @see Tab#PROPERTY_TRANSLATIONTAB
     * 
     */
    public Boolean isTranslationTab() {
        return (Boolean) get(PROPERTY_TRANSLATIONTAB);
    }
    /**
     * @see Tab#PROPERTY_TRANSLATIONTAB
     * 
     */
    public void setTranslationTab(Boolean translationTab) {
        set(PROPERTY_TRANSLATIONTAB, translationTab);
    }

    /**
     * @see Tab#PROPERTY_READONLY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isReadOnly() {
        return (Boolean) get(PROPERTY_READONLY);
    }
    /**
     * @see Tab#PROPERTY_READONLY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setReadOnly(Boolean readOnly) {
        set(PROPERTY_READONLY, readOnly);
    }

    /**
     * @see Tab#PROPERTY_COLUMN
     * 
     */
    public Column getColumn() {
        return (Column) get(PROPERTY_COLUMN);
    }
    /**
     * @see Tab#PROPERTY_COLUMN
     * 
     */
    public void setColumn(Column column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see Tab#PROPERTY_TREEINCLUDED
     * 
     */
    public Boolean isTreeIncluded() {
        return (Boolean) get(PROPERTY_TREEINCLUDED);
    }
    /**
     * @see Tab#PROPERTY_TREEINCLUDED
     * 
     */
    public void setTreeIncluded(Boolean treeIncluded) {
        set(PROPERTY_TREEINCLUDED, treeIncluded);
    }

    /**
     * @see Tab#PROPERTY_SQLWHERECLAUSE
     * 
     */
    public String getSQLWhereClause() {
        return (String) get(PROPERTY_SQLWHERECLAUSE);
    }
    /**
     * @see Tab#PROPERTY_SQLWHERECLAUSE
     * 
     */
    public void setSQLWhereClause(String sQLWhereClause) {
        set(PROPERTY_SQLWHERECLAUSE, sQLWhereClause);
    }

    /**
     * @see Tab#PROPERTY_SQLORDERBYCLAUSE
     * 
     */
    public String getSQLOrderByClause() {
        return (String) get(PROPERTY_SQLORDERBYCLAUSE);
    }
    /**
     * @see Tab#PROPERTY_SQLORDERBYCLAUSE
     * 
     */
    public void setSQLOrderByClause(String sQLOrderByClause) {
        set(PROPERTY_SQLORDERBYCLAUSE, sQLOrderByClause);
    }

    /**
     * @see Tab#PROPERTY_CONFIRMATIONMESSAGE
     * 
     */
    public String getConfirmationMessage() {
        return (String) get(PROPERTY_CONFIRMATIONMESSAGE);
    }
    /**
     * @see Tab#PROPERTY_CONFIRMATIONMESSAGE
     * 
     */
    public void setConfirmationMessage(String confirmationMessage) {
        set(PROPERTY_CONFIRMATIONMESSAGE, confirmationMessage);
    }

    /**
     * @see Tab#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see Tab#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see Tab#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Tab#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Tab#PROPERTY_IMAGE
     * 
     */
    public Image getImage() {
        return (Image) get(PROPERTY_IMAGE);
    }
    /**
     * @see Tab#PROPERTY_IMAGE
     * 
     */
    public void setImage(Image image) {
        set(PROPERTY_IMAGE, image);
    }

    /**
     * @see Tab#PROPERTY_IMPORTFIELDS
     * 
     */
    public Boolean isImportFields() {
        return (Boolean) get(PROPERTY_IMPORTFIELDS);
    }
    /**
     * @see Tab#PROPERTY_IMPORTFIELDS
     * 
     */
    public void setImportFields(Boolean importFields) {
        set(PROPERTY_IMPORTFIELDS, importFields);
    }

    /**
     * @see Tab#PROPERTY_ORDERCOLUMN
     * 
     */
    public Column getOrderColumn() {
        return (Column) get(PROPERTY_ORDERCOLUMN);
    }
    /**
     * @see Tab#PROPERTY_ORDERCOLUMN
     * 
     */
    public void setOrderColumn(Column orderColumn) {
        set(PROPERTY_ORDERCOLUMN, orderColumn);
    }

    /**
     * @see Tab#PROPERTY_INCLUDEDCOLUMN
     * 
     */
    public Column getIncludedColumn() {
        return (Column) get(PROPERTY_INCLUDEDCOLUMN);
    }
    /**
     * @see Tab#PROPERTY_INCLUDEDCOLUMN
     * 
     */
    public void setIncludedColumn(Column includedColumn) {
        set(PROPERTY_INCLUDEDCOLUMN, includedColumn);
    }

    /**
     * @see Tab#PROPERTY_SEQUENCETAB
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isSequenceTab() {
        return (Boolean) get(PROPERTY_SEQUENCETAB);
    }
    /**
     * @see Tab#PROPERTY_SEQUENCETAB
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setSequenceTab(Boolean sequenceTab) {
        set(PROPERTY_SEQUENCETAB, sequenceTab);
    }

    /**
     * @see Tab#PROPERTY_INCLUDEDTAB
     * 
     */
    public Tab getIncludedTab() {
        return (Tab) get(PROPERTY_INCLUDEDTAB);
    }
    /**
     * @see Tab#PROPERTY_INCLUDEDTAB
     * 
     */
    public void setIncludedTab(Tab includedTab) {
        set(PROPERTY_INCLUDEDTAB, includedTab);
    }

    /**
     * @see Tab#PROPERTY_FILTERCLAUSE
     * 
     */
    public String getFilterClause() {
        return (String) get(PROPERTY_FILTERCLAUSE);
    }
    /**
     * @see Tab#PROPERTY_FILTERCLAUSE
     * 
     */
    public void setFilterClause(String filterClause) {
        set(PROPERTY_FILTERCLAUSE, filterClause);
    }

    /**
     * @see Tab#PROPERTY_MASTERDETAILFORM
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Form getMasterDetailForm() {
        return (Form) get(PROPERTY_MASTERDETAILFORM);
    }
    /**
     * @see Tab#PROPERTY_MASTERDETAILFORM
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setMasterDetailForm(Form masterDetailForm) {
        set(PROPERTY_MASTERDETAILFORM, masterDetailForm);
    }

    /**
     * @see Tab#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Tab#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Tab#PROPERTY_UIPATTERN
     * 
     */
    public String getUIPattern() {
        return (String) get(PROPERTY_UIPATTERN);
    }
    /**
     * @see Tab#PROPERTY_UIPATTERN
     * 
     */
    public void setUIPattern(String uIPattern) {
        set(PROPERTY_UIPATTERN, uIPattern);
    }

    /**
     * @see Tab#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public String getHqlwhereclause() {
        return (String) get(PROPERTY_HQLWHERECLAUSE);
    }
    /**
     * @see Tab#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public void setHqlwhereclause(String hqlwhereclause) {
        set(PROPERTY_HQLWHERECLAUSE, hqlwhereclause);
    }

    /**
     * @see Tab#PROPERTY_HQLORDERBYCLAUSE
     * 
     */
    public String getHqlorderbyclause() {
        return (String) get(PROPERTY_HQLORDERBYCLAUSE);
    }
    /**
     * @see Tab#PROPERTY_HQLORDERBYCLAUSE
     * 
     */
    public void setHqlorderbyclause(String hqlorderbyclause) {
        set(PROPERTY_HQLORDERBYCLAUSE, hqlorderbyclause);
    }

    /**
     * @see Tab#PROPERTY_HQLFILTERCLAUSE
     * 
     */
    public String getHqlfilterclause() {
        return (String) get(PROPERTY_HQLFILTERCLAUSE);
    }
    /**
     * @see Tab#PROPERTY_HQLFILTERCLAUSE
     * 
     */
    public void setHqlfilterclause(String hqlfilterclause) {
        set(PROPERTY_HQLFILTERCLAUSE, hqlfilterclause);
    }

    /**
     * @see Tab#PROPERTY_FILTERNAME
     * 
     */
    public String getFilterName() {
        return (String) get(PROPERTY_FILTERNAME);
    }
    /**
     * @see Tab#PROPERTY_FILTERNAME
     * 
     */
    public void setFilterName(String filterName) {
        set(PROPERTY_FILTERNAME, filterName);
    }

    /**
     * @see Tab#PROPERTY_SHOWPARENTSBUTTONS
     * 
     */
    public Boolean isShowParentsButtons() {
        return (Boolean) get(PROPERTY_SHOWPARENTSBUTTONS);
    }
    /**
     * @see Tab#PROPERTY_SHOWPARENTSBUTTONS
     * 
     */
    public void setShowParentsButtons(Boolean showParentsButtons) {
        set(PROPERTY_SHOWPARENTSBUTTONS, showParentsButtons);
    }

    /**
     * @see Tab#PROPERTY_DISPLAYLOGIC
     * 
     */
    public String getDisplayLogic() {
        return (String) get(PROPERTY_DISPLAYLOGIC);
    }
    /**
     * @see Tab#PROPERTY_DISPLAYLOGIC
     * 
     */
    public void setDisplayLogic(String displayLogic) {
        set(PROPERTY_DISPLAYLOGIC, displayLogic);
    }

    /**
     * @see Tab#PROPERTY_TABLETREE
     * 
     */
    public TableTree getTableTree() {
        return (TableTree) get(PROPERTY_TABLETREE);
    }
    /**
     * @see Tab#PROPERTY_TABLETREE
     * 
     */
    public void setTableTree(TableTree tableTree) {
        set(PROPERTY_TABLETREE, tableTree);
    }

    /**
     * @see Tab#PROPERTY_HQLWHERECLAUSEFORROOTNODES
     * 
     */
    public String getHQLWhereClauseForRootNodes() {
        return (String) get(PROPERTY_HQLWHERECLAUSEFORROOTNODES);
    }
    /**
     * @see Tab#PROPERTY_HQLWHERECLAUSEFORROOTNODES
     * 
     */
    public void setHQLWhereClauseForRootNodes(String hQLWhereClauseForRootNodes) {
        set(PROPERTY_HQLWHERECLAUSEFORROOTNODES, hQLWhereClauseForRootNodes);
    }

    /**
     * @see Tab#PROPERTY_DISABLEPARENTKEYPROPERTY
     * 
     */
    public Boolean isDisableParentKeyProperty() {
        return (Boolean) get(PROPERTY_DISABLEPARENTKEYPROPERTY);
    }
    /**
     * @see Tab#PROPERTY_DISABLEPARENTKEYPROPERTY
     * 
     */
    public void setDisableParentKeyProperty(Boolean disableParentKeyProperty) {
        set(PROPERTY_DISABLEPARENTKEYPROPERTY, disableParentKeyProperty);
    }

    /**
     * @see Tab#PROPERTY_READONLYTREE
     * 
     */
    public Boolean isReadOnlyTree() {
        return (Boolean) get(PROPERTY_READONLYTREE);
    }
    /**
     * @see Tab#PROPERTY_READONLYTREE
     * 
     */
    public void setReadOnlyTree(Boolean readOnlyTree) {
        set(PROPERTY_READONLYTREE, readOnlyTree);
    }

    /**
     * @see Tab#PROPERTY_SHOWTREENODEICONS
     * 
     */
    public Boolean isShowTreeNodeIcons() {
        return (Boolean) get(PROPERTY_SHOWTREENODEICONS);
    }
    /**
     * @see Tab#PROPERTY_SHOWTREENODEICONS
     * 
     */
    public void setShowTreeNodeIcons(Boolean showTreeNodeIcons) {
        set(PROPERTY_SHOWTREENODEICONS, showTreeNodeIcons);
    }

    /**
     * @see Tab#PROPERTY_DEFAULTTREEVIEWLOGIC
     * 
     */
    public String getDefaultTreeViewLogic() {
        return (String) get(PROPERTY_DEFAULTTREEVIEWLOGIC);
    }
    /**
     * @see Tab#PROPERTY_DEFAULTTREEVIEWLOGIC
     * 
     */
    public void setDefaultTreeViewLogic(String defaultTreeViewLogic) {
        set(PROPERTY_DEFAULTTREEVIEWLOGIC, defaultTreeViewLogic);
    }

    /**
     * @see Tab#PROPERTY_OBUIAPPSELECTION
     * 
     */
    public String getOBUIAPPSelection() {
        return (String) get(PROPERTY_OBUIAPPSELECTION);
    }
    /**
     * @see Tab#PROPERTY_OBUIAPPSELECTION
     * 
     */
    public void setOBUIAPPSelection(String oBUIAPPSelection) {
        set(PROPERTY_OBUIAPPSELECTION, oBUIAPPSelection);
    }

    /**
     * @see Tab#PROPERTY_OBUIAPPCANADD
     * 
     */
    public Boolean isObuiappCanAdd() {
        return (Boolean) get(PROPERTY_OBUIAPPCANADD);
    }
    /**
     * @see Tab#PROPERTY_OBUIAPPCANADD
     * 
     */
    public void setObuiappCanAdd(Boolean obuiappCanAdd) {
        set(PROPERTY_OBUIAPPCANADD, obuiappCanAdd);
    }

    /**
     * @see Tab#PROPERTY_OBUIAPPCANDELETE
     * 
     */
    public Boolean isObuiappCanDelete() {
        return (Boolean) get(PROPERTY_OBUIAPPCANDELETE);
    }
    /**
     * @see Tab#PROPERTY_OBUIAPPCANDELETE
     * 
     */
    public void setObuiappCanDelete(Boolean obuiappCanDelete) {
        set(PROPERTY_OBUIAPPCANDELETE, obuiappCanDelete);
    }

    /**
     * @see Tab#PROPERTY_OBUIAPPSHOWSELECT
     * 
     */
    public Boolean isObuiappShowSelect() {
        return (Boolean) get(PROPERTY_OBUIAPPSHOWSELECT);
    }
    /**
     * @see Tab#PROPERTY_OBUIAPPSHOWSELECT
     * 
     */
    public void setObuiappShowSelect(Boolean obuiappShowSelect) {
        set(PROPERTY_OBUIAPPSHOWSELECT, obuiappShowSelect);
    }

    /**
     * @see Tab#PROPERTY_OBUIAPPNEWFN
     * 
     */
    public String getOBUIAPPNewFn() {
        return (String) get(PROPERTY_OBUIAPPNEWFN);
    }
    /**
     * @see Tab#PROPERTY_OBUIAPPNEWFN
     * 
     */
    public void setOBUIAPPNewFn(String oBUIAPPNewFn) {
        set(PROPERTY_OBUIAPPNEWFN, oBUIAPPNewFn);
    }

    /**
     * @see Tab#PROPERTY_OBUIAPPREMOVEFN
     * 
     */
    public String getObuiappRemovefn() {
        return (String) get(PROPERTY_OBUIAPPREMOVEFN);
    }
    /**
     * @see Tab#PROPERTY_OBUIAPPREMOVEFN
     * 
     */
    public void setObuiappRemovefn(String obuiappRemovefn) {
        set(PROPERTY_OBUIAPPREMOVEFN, obuiappRemovefn);
    }

    /**
     * @see Tab#PROPERTY_OBUIAPPSELECTIONTYPE
     * 
     */
    public String getObuiappSelectionType() {
        return (String) get(PROPERTY_OBUIAPPSELECTIONTYPE);
    }
    /**
     * @see Tab#PROPERTY_OBUIAPPSELECTIONTYPE
     * 
     */
    public void setObuiappSelectionType(String obuiappSelectionType) {
        set(PROPERTY_OBUIAPPSELECTIONTYPE, obuiappSelectionType);
    }

    /**
     * Help: {@literal To configure an auxiliary input, you need to select the corresponding tab, name the
     *       auxiliary input and define a validation code. For example, when selecting the payment method, you
     *       can force that all payments are done in cash.}<br>
     * @see AuxiliaryInput
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AuxiliaryInput> getADAuxiliaryInputList() {
      return (List<AuxiliaryInput>) get(PROPERTY_ADAUXILIARYINPUTLIST);
    }

    /**
     * Help: {@literal To configure an auxiliary input, you need to select the corresponding tab, name the
     *       auxiliary input and define a validation code. For example, when selecting the payment method, you
     *       can force that all payments are done in cash.}<br>
     * @see AuxiliaryInput
     * 
     */
    public void setADAuxiliaryInputList(List<AuxiliaryInput> aDAuxiliaryInputList) {
        set(PROPERTY_ADAUXILIARYINPUTLIST, aDAuxiliaryInputList);
    }

    /**
     * Help: {@literal The Field table defines the Fields displayed within a tab. Changes made to the Field Tab
     *       become visible after restart due to caching}<br>
     * @see Field
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Field> getADFieldList() {
      return (List<Field>) get(PROPERTY_ADFIELDLIST);
    }

    /**
     * Help: {@literal The Field table defines the Fields displayed within a tab. Changes made to the Field Tab
     *       become visible after restart due to caching}<br>
     * @see Field
     * 
     */
    public void setADFieldList(List<Field> aDFieldList) {
        set(PROPERTY_ADFIELDLIST, aDFieldList);
    }

    /**
     * @see TabAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TabAccess> getADTabAccessList() {
      return (List<TabAccess>) get(PROPERTY_ADTABACCESSLIST);
    }

    /**
     * @see TabAccess
     * 
     */
    public void setADTabAccessList(List<TabAccess> aDTabAccessList) {
        set(PROPERTY_ADTABACCESSLIST, aDTabAccessList);
    }

    /**
     * Help: {@literal Allows the translation of any tab of the application. After the performing your edits, the
     *       window must be regenerated.}<br>
     * @see TabTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TabTrl> getADTabTrlList() {
      return (List<TabTrl>) get(PROPERTY_ADTABTRLLIST);
    }

    /**
     * Help: {@literal Allows the translation of any tab of the application. After the performing your edits, the
     *       window must be regenerated.}<br>
     * @see TabTrl
     * 
     */
    public void setADTabTrlList(List<TabTrl> aDTabTrlList) {
        set(PROPERTY_ADTABTRLLIST, aDTabTrlList);
    }

    /**
     * Help: {@literal All values set here will be used as the default values for the whole tab. If there is any
     *       exception, it can be set in its child tab.}<br>
     * @see GCTab
     * 
     */
    @SuppressWarnings("unchecked")
    public List<GCTab> getOBUIAPPGCTabList() {
      return (List<GCTab>) get(PROPERTY_OBUIAPPGCTABLIST);
    }

    /**
     * Help: {@literal All values set here will be used as the default values for the whole tab. If there is any
     *       exception, it can be set in its child tab.}<br>
     * @see GCTab
     * 
     */
    public void setOBUIAPPGCTabList(List<GCTab> oBUIAPPGCTabList) {
        set(PROPERTY_OBUIAPPGCTABLIST, oBUIAPPGCTabList);
    }

}
