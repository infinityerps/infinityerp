
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
package org.openbravo.model.ad.datamodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.TableAccess;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.DataPackage;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.ad.ui.Window;
import org.openbravo.model.ad.utility.TableTree;
import org.openbravo.model.ad.utility.Tree;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.datasource.DataSource;
/**
 * Entity class for entity ADTable (stored in table AD_Table).
 * <br>
 * Help: {@literal In Table table are stored all the tables used in the application. This data should be the
     *       same as the defined physically in the DB.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Table extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Table";
    public static final String ENTITY_NAME = "ADTable";

    /**
     * Property id stored in column AD_Table_ID in table AD_Table<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Table 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Table 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Table 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Table<br>
     * Help: {@literal A more descriptive identifier (that does need to be unique) of a record/document that is
     *       used as a default search option along with the search key (that is unique and mostly shorter). It is
     *       up to 60 characters in length.}
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Table<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Table<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property dBTableName stored in column TableName in table AD_Table 
     * 
     */
    public static final String PROPERTY_DBTABLENAME = "dBTableName";

    /**
     * Property javaClassName stored in column Classname in table AD_Table<br>
     * Help: {@literal The classname is used when generating a representation of the table in java (the entity or
     *       business object). The classname is the simplename of the class (so without the package name). Often
     *       the AD_Table.name can be used here. The combination of classname and package needs to be unique.}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property view stored in column IsView in table AD_Table<br>
     * Help: {@literal This is a view rather than a table.  A view is always treated as read only in the system.}
     * 
     */
    public static final String PROPERTY_VIEW = "view";

    /**
     * Property dataAccessLevel stored in column AccessLevel in table AD_Table<br>
     * Help: {@literal Indicates what type of data (in terms of AD_CLIENT and AD_ORG data columns) can be entered
     *       or viewed. We can classify data in 4 major categories:
     *       - System (AD_CLIENT_ID=0, AD_ORG_ID=0) -
     *       system data (such as metadata for window, tab and field definition)
     *       - Organization (AD_CLIENT<>0,
     *       AD_ORG_ID<>0) - data particular to an organization (such as sales orders)
     *       - Client/Organization
     *       (AD_CLIENT<>0, AD_ORG_ID=anything) - data particular to an organization or shared among all
     *       organizations within one client
     *       - Client (AD_CLIENT<>0, AD_ORG_ID=0) - data that is specific to a
     *       client but can be used by all organizations within that client
     *       
     *       or All (AD_CLIENT=anything,
     *       AD_ORG_ID=anything)}
     * 
     */
    public static final String PROPERTY_DATAACCESSLEVEL = "dataAccessLevel";

    /**
     * Property window stored in column AD_Window_ID in table AD_Table<br>
     * Help: {@literal The Window field identifies a unique Window in the system.}
     * 
     */
    public static final String PROPERTY_WINDOW = "window";

    /**
     * Property securityEnabled stored in column IsSecurityEnabled in table AD_Table<br>
     * Help: {@literal The Security Enabled checkbox indicates that user access to the data in this table can be
     *       restricted using Roles.}
     * 
     */
    public static final String PROPERTY_SECURITYENABLED = "securityEnabled";

    /**
     * Property deletableRecords stored in column IsDeleteable in table AD_Table<br>
     * Help: {@literal The Deleteable Records checkbox indicates if a record can be deleted from the database. 
     *       If records cannot be deleted, you can only deselect the Active flag}
     * 
     */
    public static final String PROPERTY_DELETABLERECORDS = "deletableRecords";

    /**
     * Property highVolume stored in column IsHighVolume in table AD_Table<br>
     * Help: {@literal If a table is defined as High Volume, it means that it has or may have a large number of
     *       rows.}
     * 
     */
    public static final String PROPERTY_HIGHVOLUME = "highVolume";

    /**
     * Property importTable stored in column ImportTable in table AD_Table<br>
     * Help: {@literal Import Table Columns from Database, this process will create in the application dictionary
     *       those columns defined in the table (in DB) but non-existing in the column table (of the application
     *       dictionary).}
     * 
     */
    public static final String PROPERTY_IMPORTTABLE = "importTable";

    /**
     * Property maintainChangeLog stored in column IsChangeLog in table AD_Table<br>
     * Help: {@literal If selected, a log of all changes is maintained.}
     * 
     */
    public static final String PROPERTY_MAINTAINCHANGELOG = "maintainChangeLog";

    /**
     * Property pOWindow stored in column PO_Window_ID in table AD_Table<br>
     * Help: {@literal Window for Purchase Order (AP) Zooms}
     * 
     */
    public static final String PROPERTY_POWINDOW = "pOWindow";

    /**
     * Property defaultAccount stored in column IsDefaultAcct in table AD_Table<br>
     * Help: {@literal Is default account}
     * 
     */
    public static final String PROPERTY_DEFAULTACCOUNT = "defaultAccount";

    /**
     * Property sQLRecordIdentifier stored in column SQL_Record_Identifier in table AD_Table<br>
     * Help: {@literal SQL_Record_Identifier}
     * 
     */
    public static final String PROPERTY_SQLRECORDIDENTIFIER = "sQLRecordIdentifier";

    /**
     * Property developmentStatus stored in column Developmentstatus in table AD_Table<br>
     * Help: {@literal Development Status defines the status of a table or a column. Ready means that this object
     *       is in use, Not Implemented Yet indicates that currently it is not in use but it is planned to be
     *       implemented and Deprecated are the objects that are going to be removed from the application in
     *       future versions.}
     * 
     */
    public static final String PROPERTY_DEVELOPMENTSTATUS = "developmentStatus";

    /**
     * Property dataPackage stored in column AD_Package_ID in table AD_Table<br>
     * Help: {@literal An AD_Table record has a mandatory relation to a package (the AD_Package). Choose a
     *       sensible package fitting to the functional area to which the table applies (so not the Core
     *       package). If no such package exist then create a new one. The relation to the module is maintained
     *       through the AD_Package, so an AD_Table has an AD_Package which belongs to a module. When developing
     *       for a module then first a package needs to be defined in AD_Package, linked to the module. Then the
     *       records in AD_Table (for that module) can be linked to that package.}
     * 
     */
    public static final String PROPERTY_DATAPACKAGE = "dataPackage";

    /**
     * Property treeType stored in column Treetype in table AD_Table<br>
     * Help: {@literal The Tree Type / Area field determines the type of tree this is.  For example, you may
     *       define one tree for your Products and another tree for your Business Partners.}
     * 
     */
    public static final String PROPERTY_TREETYPE = "treeType";

    /**
     * Property acctdateColumn stored in column Acctdate_Column_ID in table AD_Table<br>
     * Help: {@literal Date reference column where is stored the accounting date}
     * 
     */
    public static final String PROPERTY_ACCTDATECOLUMN = "acctdateColumn";

    /**
     * Property acctclassname stored in column Acctclassname in table AD_Table<br>
     * Help: {@literal Java class name where the posting of table is developed}
     * 
     */
    public static final String PROPERTY_ACCTCLASSNAME = "acctclassname";

    /**
     * Property isFullyAudited stored in column IsFullyAudited in table AD_Table<br>
     * Help: {@literal If audit trail is maintained for a table, each modification performed to any record in
     *       this table will be tracked.
     *       
     *       Do not forget to generate Audit infrastructure after selecting or
     *       deselecting a table to be audited.}
     * 
     */
    public static final String PROPERTY_ISFULLYAUDITED = "isFullyAudited";

    /**
     * Property isAuditInserts stored in column IsAuditInserts in table AD_Table<br>
     * Help: {@literal If this flag is checked,  if when a record is inserted in an audited table the initial
     *       value of all its columns will be saved in the audit table. Usually there is no need to save all
     *       columns, because the original column values of the record can be recreated based on their current
     *       value and on their modification history.}
     * 
     */
    public static final String PROPERTY_ISAUDITINSERTS = "isAuditInserts";

    /**
     * Property dataOriginType stored in column DataOriginType in table AD_Table<br>
     * Help: {@literal Field to specify the type of data origin: physical table/view or datasource}
     * 
     */
    public static final String PROPERTY_DATAORIGINTYPE = "dataOriginType";

    /**
     * Property obserdsDatasource stored in column Obserds_Datasource_ID in table AD_Table<br>
     * Help: {@literal Datasource used to feed the table}
     * 
     */
    public static final String PROPERTY_OBSERDSDATASOURCE = "obserdsDatasource";

    /**
     * Property istree stored in column Istree in table AD_Table<br>
     * Help: {@literal If a table is defined as a tree, then the Table Tree Category tab is shown in this window.
     *       In that tab, tree categories can be assigned to this table. Once a tree table has defined a table
     *       tree category, it can be used in tree referenced and the tree view will be available when the table
     *       is displayed in a tab.}
     * 
     */
    public static final String PROPERTY_ISTREE = "istree";

    /**
     * Property hqlQuery stored in column HqlQuery in table AD_Table<br>
     * Help: {@literal HQL query used to populate the table}
     * 
     */
    public static final String PROPERTY_HQLQUERY = "hqlQuery";

    /**
     * Property entityAlias stored in column Entity_Alias in table AD_Table<br>
     * Help: In case that the the selector's table has an alias in the HQL it is mandatory to set it on this
     *       field. This alias is used to add some mandatory filters on the Where clause replacing the
     *       &#64;additional_filters&#64; string. Some examples of added filters are: client, organization and
     *       active flag.
     * 
     */
    public static final String PROPERTY_ENTITYALIAS = "entityAlias";

    /**
     * Property aDColumnList stored in table AD_Table
     * 
     */
    public static final String PROPERTY_ADCOLUMNLIST = "aDColumnList";

    /**
     * Property aDTabList stored in table AD_Table
     * 
     */
    public static final String PROPERTY_ADTABLIST = "aDTabList";

    /**
     * Property aDTableAccessList stored in table AD_Table
     * 
     */
    public static final String PROPERTY_ADTABLEACCESSLIST = "aDTableAccessList";

    /**
     * Property aDTableTreeList stored in table AD_Table
     * 
     */
    public static final String PROPERTY_ADTABLETREELIST = "aDTableTreeList";

    /**
     * Property aDTreeList stored in table AD_Table
     * 
     */
    public static final String PROPERTY_ADTREELIST = "aDTreeList";


    public Table() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_VIEW, false);
        setDefaultValue(PROPERTY_DATAACCESSLEVEL, "4");
        setDefaultValue(PROPERTY_SECURITYENABLED, false);
        setDefaultValue(PROPERTY_DELETABLERECORDS, true);
        setDefaultValue(PROPERTY_HIGHVOLUME, false);
        setDefaultValue(PROPERTY_IMPORTTABLE, false);
        setDefaultValue(PROPERTY_MAINTAINCHANGELOG, false);
        setDefaultValue(PROPERTY_DEFAULTACCOUNT, false);
        setDefaultValue(PROPERTY_DEVELOPMENTSTATUS, "RE");
        setDefaultValue(PROPERTY_ISFULLYAUDITED, false);
        setDefaultValue(PROPERTY_ISAUDITINSERTS, true);
        setDefaultValue(PROPERTY_DATAORIGINTYPE, "Table");
        setDefaultValue(PROPERTY_ISTREE, false);
        setDefaultValue(PROPERTY_ADCOLUMNLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADTABLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADTABLEACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADTABLETREELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADTREELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Table#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Table#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Table#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Table#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Table#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Table#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Table#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Table#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Table#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Table#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Table#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Table#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Table#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Table#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Table#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Table#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Table#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Table#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Table#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Table#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Table#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Table#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Table#PROPERTY_DBTABLENAME
     * 
     */
    public String getDBTableName() {
        return (String) get(PROPERTY_DBTABLENAME);
    }
    /**
     * @see Table#PROPERTY_DBTABLENAME
     * 
     */
    public void setDBTableName(String dBTableName) {
        set(PROPERTY_DBTABLENAME, dBTableName);
    }

    /**
     * @see Table#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see Table#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see Table#PROPERTY_VIEW
     * 
     */
    public Boolean isView() {
        return (Boolean) get(PROPERTY_VIEW);
    }
    /**
     * @see Table#PROPERTY_VIEW
     * 
     */
    public void setView(Boolean view) {
        set(PROPERTY_VIEW, view);
    }

    /**
     * @see Table#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public String getDataAccessLevel() {
        return (String) get(PROPERTY_DATAACCESSLEVEL);
    }
    /**
     * @see Table#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public void setDataAccessLevel(String dataAccessLevel) {
        set(PROPERTY_DATAACCESSLEVEL, dataAccessLevel);
    }

    /**
     * @see Table#PROPERTY_WINDOW
     * 
     */
    public Window getWindow() {
        return (Window) get(PROPERTY_WINDOW);
    }
    /**
     * @see Table#PROPERTY_WINDOW
     * 
     */
    public void setWindow(Window window) {
        set(PROPERTY_WINDOW, window);
    }

    /**
     * @see Table#PROPERTY_SECURITYENABLED
     * 
     */
    public Boolean isSecurityEnabled() {
        return (Boolean) get(PROPERTY_SECURITYENABLED);
    }
    /**
     * @see Table#PROPERTY_SECURITYENABLED
     * 
     */
    public void setSecurityEnabled(Boolean securityEnabled) {
        set(PROPERTY_SECURITYENABLED, securityEnabled);
    }

    /**
     * @see Table#PROPERTY_DELETABLERECORDS
     * 
     */
    public Boolean isDeletableRecords() {
        return (Boolean) get(PROPERTY_DELETABLERECORDS);
    }
    /**
     * @see Table#PROPERTY_DELETABLERECORDS
     * 
     */
    public void setDeletableRecords(Boolean deletableRecords) {
        set(PROPERTY_DELETABLERECORDS, deletableRecords);
    }

    /**
     * @see Table#PROPERTY_HIGHVOLUME
     * 
     */
    public Boolean isHighVolume() {
        return (Boolean) get(PROPERTY_HIGHVOLUME);
    }
    /**
     * @see Table#PROPERTY_HIGHVOLUME
     * 
     */
    public void setHighVolume(Boolean highVolume) {
        set(PROPERTY_HIGHVOLUME, highVolume);
    }

    /**
     * @see Table#PROPERTY_IMPORTTABLE
     * 
     */
    public Boolean isImportTable() {
        return (Boolean) get(PROPERTY_IMPORTTABLE);
    }
    /**
     * @see Table#PROPERTY_IMPORTTABLE
     * 
     */
    public void setImportTable(Boolean importTable) {
        set(PROPERTY_IMPORTTABLE, importTable);
    }

    /**
     * @see Table#PROPERTY_MAINTAINCHANGELOG
     * 
     */
    public Boolean isMaintainChangeLog() {
        return (Boolean) get(PROPERTY_MAINTAINCHANGELOG);
    }
    /**
     * @see Table#PROPERTY_MAINTAINCHANGELOG
     * 
     */
    public void setMaintainChangeLog(Boolean maintainChangeLog) {
        set(PROPERTY_MAINTAINCHANGELOG, maintainChangeLog);
    }

    /**
     * @see Table#PROPERTY_POWINDOW
     * 
     */
    public Window getPOWindow() {
        return (Window) get(PROPERTY_POWINDOW);
    }
    /**
     * @see Table#PROPERTY_POWINDOW
     * 
     */
    public void setPOWindow(Window pOWindow) {
        set(PROPERTY_POWINDOW, pOWindow);
    }

    /**
     * @see Table#PROPERTY_DEFAULTACCOUNT
     * 
     */
    public Boolean isDefaultAccount() {
        return (Boolean) get(PROPERTY_DEFAULTACCOUNT);
    }
    /**
     * @see Table#PROPERTY_DEFAULTACCOUNT
     * 
     */
    public void setDefaultAccount(Boolean defaultAccount) {
        set(PROPERTY_DEFAULTACCOUNT, defaultAccount);
    }

    /**
     * @see Table#PROPERTY_SQLRECORDIDENTIFIER
     * 
     */
    public String getSQLRecordIdentifier() {
        return (String) get(PROPERTY_SQLRECORDIDENTIFIER);
    }
    /**
     * @see Table#PROPERTY_SQLRECORDIDENTIFIER
     * 
     */
    public void setSQLRecordIdentifier(String sQLRecordIdentifier) {
        set(PROPERTY_SQLRECORDIDENTIFIER, sQLRecordIdentifier);
    }

    /**
     * @see Table#PROPERTY_DEVELOPMENTSTATUS
     * 
     */
    public String getDevelopmentStatus() {
        return (String) get(PROPERTY_DEVELOPMENTSTATUS);
    }
    /**
     * @see Table#PROPERTY_DEVELOPMENTSTATUS
     * 
     */
    public void setDevelopmentStatus(String developmentStatus) {
        set(PROPERTY_DEVELOPMENTSTATUS, developmentStatus);
    }

    /**
     * @see Table#PROPERTY_DATAPACKAGE
     * 
     */
    public DataPackage getDataPackage() {
        return (DataPackage) get(PROPERTY_DATAPACKAGE);
    }
    /**
     * @see Table#PROPERTY_DATAPACKAGE
     * 
     */
    public void setDataPackage(DataPackage dataPackage) {
        set(PROPERTY_DATAPACKAGE, dataPackage);
    }

    /**
     * @see Table#PROPERTY_TREETYPE
     * 
     */
    public String getTreeType() {
        return (String) get(PROPERTY_TREETYPE);
    }
    /**
     * @see Table#PROPERTY_TREETYPE
     * 
     */
    public void setTreeType(String treeType) {
        set(PROPERTY_TREETYPE, treeType);
    }

    /**
     * @see Table#PROPERTY_ACCTDATECOLUMN
     * 
     */
    public Column getAcctdateColumn() {
        return (Column) get(PROPERTY_ACCTDATECOLUMN);
    }
    /**
     * @see Table#PROPERTY_ACCTDATECOLUMN
     * 
     */
    public void setAcctdateColumn(Column acctdateColumn) {
        set(PROPERTY_ACCTDATECOLUMN, acctdateColumn);
    }

    /**
     * @see Table#PROPERTY_ACCTCLASSNAME
     * 
     */
    public String getAcctclassname() {
        return (String) get(PROPERTY_ACCTCLASSNAME);
    }
    /**
     * @see Table#PROPERTY_ACCTCLASSNAME
     * 
     */
    public void setAcctclassname(String acctclassname) {
        set(PROPERTY_ACCTCLASSNAME, acctclassname);
    }

    /**
     * @see Table#PROPERTY_ISFULLYAUDITED
     * 
     */
    public Boolean isFullyAudited() {
        return (Boolean) get(PROPERTY_ISFULLYAUDITED);
    }
    /**
     * @see Table#PROPERTY_ISFULLYAUDITED
     * 
     */
    public void setFullyAudited(Boolean isFullyAudited) {
        set(PROPERTY_ISFULLYAUDITED, isFullyAudited);
    }

    /**
     * @see Table#PROPERTY_ISAUDITINSERTS
     * 
     */
    public Boolean isAuditInserts() {
        return (Boolean) get(PROPERTY_ISAUDITINSERTS);
    }
    /**
     * @see Table#PROPERTY_ISAUDITINSERTS
     * 
     */
    public void setAuditInserts(Boolean isAuditInserts) {
        set(PROPERTY_ISAUDITINSERTS, isAuditInserts);
    }

    /**
     * @see Table#PROPERTY_DATAORIGINTYPE
     * 
     */
    public String getDataOriginType() {
        return (String) get(PROPERTY_DATAORIGINTYPE);
    }
    /**
     * @see Table#PROPERTY_DATAORIGINTYPE
     * 
     */
    public void setDataOriginType(String dataOriginType) {
        set(PROPERTY_DATAORIGINTYPE, dataOriginType);
    }

    /**
     * @see Table#PROPERTY_OBSERDSDATASOURCE
     * 
     */
    public DataSource getObserdsDatasource() {
        return (DataSource) get(PROPERTY_OBSERDSDATASOURCE);
    }
    /**
     * @see Table#PROPERTY_OBSERDSDATASOURCE
     * 
     */
    public void setObserdsDatasource(DataSource obserdsDatasource) {
        set(PROPERTY_OBSERDSDATASOURCE, obserdsDatasource);
    }

    /**
     * @see Table#PROPERTY_ISTREE
     * 
     */
    public Boolean isTree() {
        return (Boolean) get(PROPERTY_ISTREE);
    }
    /**
     * @see Table#PROPERTY_ISTREE
     * 
     */
    public void setTree(Boolean istree) {
        set(PROPERTY_ISTREE, istree);
    }

    /**
     * @see Table#PROPERTY_HQLQUERY
     * 
     */
    public String getHqlQuery() {
        return (String) get(PROPERTY_HQLQUERY);
    }
    /**
     * @see Table#PROPERTY_HQLQUERY
     * 
     */
    public void setHqlQuery(String hqlQuery) {
        set(PROPERTY_HQLQUERY, hqlQuery);
    }

    /**
     * @see Table#PROPERTY_ENTITYALIAS
     * 
     */
    public String getEntityAlias() {
        return (String) get(PROPERTY_ENTITYALIAS);
    }
    /**
     * @see Table#PROPERTY_ENTITYALIAS
     * 
     */
    public void setEntityAlias(String entityAlias) {
        set(PROPERTY_ENTITYALIAS, entityAlias);
    }

    /**
     * Help: {@literal Defines the columns of a table
     *       The Used in Column Tab defines the table and column this
     *       element resides in.}<br>
     * @see Column
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Column> getADColumnList() {
      return (List<Column>) get(PROPERTY_ADCOLUMNLIST);
    }

    /**
     * Help: {@literal Defines the columns of a table
     *       The Used in Column Tab defines the table and column this
     *       element resides in.}<br>
     * @see Column
     * 
     */
    public void setADColumnList(List<Column> aDColumnList) {
        set(PROPERTY_ADCOLUMNLIST, aDColumnList);
    }

    /**
     * Help: {@literal The Tab Tab defines each Tab within a Window.  Each Tab contains a discrete selection of
     *       fields.}<br>
     * @see Tab
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Tab> getADTabList() {
      return (List<Tab>) get(PROPERTY_ADTABLIST);
    }

    /**
     * Help: {@literal The Tab Tab defines each Tab within a Window.  Each Tab contains a discrete selection of
     *       fields.}<br>
     * @see Tab
     * 
     */
    public void setADTabList(List<Tab> aDTabList) {
        set(PROPERTY_ADTABLIST, aDTabList);
    }

    /**
     * Help: {@literal If listed here, the Role can(not) access all data of this table, even if the role has
     *       access to the functionality}<br>
     * @see TableAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TableAccess> getADTableAccessList() {
      return (List<TableAccess>) get(PROPERTY_ADTABLEACCESSLIST);
    }

    /**
     * Help: {@literal If listed here, the Role can(not) access all data of this table, even if the role has
     *       access to the functionality}<br>
     * @see TableAccess
     * 
     */
    public void setADTableAccessList(List<TableAccess> aDTableAccessList) {
        set(PROPERTY_ADTABLEACCESSLIST, aDTableAccessList);
    }

    /**
     * @see TableTree
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TableTree> getADTableTreeList() {
      return (List<TableTree>) get(PROPERTY_ADTABLETREELIST);
    }

    /**
     * @see TableTree
     * 
     */
    public void setADTableTreeList(List<TableTree> aDTableTreeList) {
        set(PROPERTY_ADTABLETREELIST, aDTableTreeList);
    }

    /**
     * Help: {@literal The Tree table defines all the trees that will be used in the application.}<br>
     * @see Tree
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Tree> getADTreeList() {
      return (List<Tree>) get(PROPERTY_ADTREELIST);
    }

    /**
     * Help: {@literal The Tree table defines all the trees that will be used in the application.}<br>
     * @see Tree
     * 
     */
    public void setADTreeList(List<Tree> aDTreeList) {
        set(PROPERTY_ADTREELIST, aDTreeList);
    }

}
