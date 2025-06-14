
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity DataSetTable (stored in table AD_Dataset_Table).
 * <br>
 * Help: {@literal Tables of a Dataset.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DataSetTable extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Dataset_Table";
    public static final String ENTITY_NAME = "DataSetTable";

    /**
     * Property id stored in column AD_Dataset_Table_ID in table AD_Dataset_Table<br>
     * Help: {@literal Indicates the dataset table the element forms part of.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Dataset_Table 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Dataset_Table 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Dataset_Table 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Dataset_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Dataset_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Dataset_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Dataset_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property dataset stored in column AD_Dataset_ID in table AD_Dataset_Table<br>
     * Help: {@literal Indicates the dataset the element forms part of.}
     * 
     */
    public static final String PROPERTY_DATASET = "dataset";

    /**
     * Property table stored in column AD_Table_ID in table AD_Dataset_Table<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property includeAllColumns stored in column IncludeAllColumns in table AD_Dataset_Table<br>
     * Help: {@literal Include all columns from the table in the dataset}
     * 
     */
    public static final String PROPERTY_INCLUDEALLCOLUMNS = "includeAllColumns";

    /**
     * Property sQLWhereClause stored in column WhereClause in table AD_Dataset_Table<br>
     * Help: {@literal The Where Clause indicates the HQL (Hibernate Query Language) or SQL WHERE clause used for
     *       filtering data. In releases until and including 2.50 MP11 this field only accepts a HQL where clause
     *       (without the where keyword). In later releases for the AD dataset a SQL clause should be used, other
     *       datasets should use the HQL format.}
     * 
     */
    public static final String PROPERTY_SQLWHERECLAUSE = "sQLWhereClause";

    /**
     * Property excludeAuditInfo stored in column excludeAuditInfo in table AD_Dataset_Table<br>
     * Help: {@literal Mark if the dataset table should exclude the audit info when comparing data}
     * 
     */
    public static final String PROPERTY_EXCLUDEAUDITINFO = "excludeAuditInfo";

    /**
     * Property isBusinessObject stored in column IsBusinessObject in table AD_Dataset_Table<br>
     * Help: {@literal Include Business Object determines whether the whole object is going to be taken into
     *       account.}
     * 
     */
    public static final String PROPERTY_ISBUSINESSOBJECT = "isBusinessObject";

    /**
     * Property module stored in column AD_Module_ID in table AD_Dataset_Table<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property secondarywhereclause stored in column Secondarywhereclause in table AD_Dataset_Table<br>
     * Help: {@literal This is a secondary SQL where clause used by dbsourcemanager to filter data inside a
     *       table. This secondary whereclause needs to be written in SQL, and only applies for the dataset AD.
     *       When export.database is executed, this whereclause will be applied for the data inside the table,
     *       and only the records complying with it will be exported. The rest of the records (the ones which do
     *       not comply with the whereclause) will be ignored both in export.database and update.database.
     *       The
     *       main purpose of this whereclause is to select which of the records in a particular table are part of
     *       sourcedata, and which ones are part of client data.}
     * 
     */
    public static final String PROPERTY_SECONDARYWHERECLAUSE = "secondarywhereclause";

    /**
     * Property dataSetColumnList stored in table AD_Dataset_Table
     * 
     */
    public static final String PROPERTY_DATASETCOLUMNLIST = "dataSetColumnList";


    public DataSetTable() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_INCLUDEALLCOLUMNS, true);
        setDefaultValue(PROPERTY_EXCLUDEAUDITINFO, false);
        setDefaultValue(PROPERTY_ISBUSINESSOBJECT, false);
        setDefaultValue(PROPERTY_DATASETCOLUMNLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DataSetTable#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DataSetTable#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DataSetTable#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DataSetTable#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DataSetTable#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DataSetTable#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DataSetTable#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DataSetTable#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DataSetTable#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DataSetTable#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DataSetTable#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DataSetTable#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DataSetTable#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DataSetTable#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DataSetTable#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DataSetTable#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DataSetTable#PROPERTY_DATASET
     * 
     */
    public DataSet getDataset() {
        return (DataSet) get(PROPERTY_DATASET);
    }
    /**
     * @see DataSetTable#PROPERTY_DATASET
     * 
     */
    public void setDataset(DataSet dataset) {
        set(PROPERTY_DATASET, dataset);
    }

    /**
     * @see DataSetTable#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see DataSetTable#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see DataSetTable#PROPERTY_INCLUDEALLCOLUMNS
     * 
     */
    public Boolean isIncludeAllColumns() {
        return (Boolean) get(PROPERTY_INCLUDEALLCOLUMNS);
    }
    /**
     * @see DataSetTable#PROPERTY_INCLUDEALLCOLUMNS
     * 
     */
    public void setIncludeAllColumns(Boolean includeAllColumns) {
        set(PROPERTY_INCLUDEALLCOLUMNS, includeAllColumns);
    }

    /**
     * @see DataSetTable#PROPERTY_SQLWHERECLAUSE
     * 
     */
    public String getSQLWhereClause() {
        return (String) get(PROPERTY_SQLWHERECLAUSE);
    }
    /**
     * @see DataSetTable#PROPERTY_SQLWHERECLAUSE
     * 
     */
    public void setSQLWhereClause(String sQLWhereClause) {
        set(PROPERTY_SQLWHERECLAUSE, sQLWhereClause);
    }

    /**
     * @see DataSetTable#PROPERTY_EXCLUDEAUDITINFO
     * 
     */
    public Boolean isExcludeAuditInfo() {
        return (Boolean) get(PROPERTY_EXCLUDEAUDITINFO);
    }
    /**
     * @see DataSetTable#PROPERTY_EXCLUDEAUDITINFO
     * 
     */
    public void setExcludeAuditInfo(Boolean excludeAuditInfo) {
        set(PROPERTY_EXCLUDEAUDITINFO, excludeAuditInfo);
    }

    /**
     * @see DataSetTable#PROPERTY_ISBUSINESSOBJECT
     * 
     */
    public Boolean isBusinessObject() {
        return (Boolean) get(PROPERTY_ISBUSINESSOBJECT);
    }
    /**
     * @see DataSetTable#PROPERTY_ISBUSINESSOBJECT
     * 
     */
    public void setBusinessObject(Boolean isBusinessObject) {
        set(PROPERTY_ISBUSINESSOBJECT, isBusinessObject);
    }

    /**
     * @see DataSetTable#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see DataSetTable#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see DataSetTable#PROPERTY_SECONDARYWHERECLAUSE
     * 
     */
    public String getSecondarywhereclause() {
        return (String) get(PROPERTY_SECONDARYWHERECLAUSE);
    }
    /**
     * @see DataSetTable#PROPERTY_SECONDARYWHERECLAUSE
     * 
     */
    public void setSecondarywhereclause(String secondarywhereclause) {
        set(PROPERTY_SECONDARYWHERECLAUSE, secondarywhereclause);
    }

    /**
     * Help: {@literal Columns of a table from a Dataset.}<br>
     * @see DataSetColumn
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DataSetColumn> getDataSetColumnList() {
      return (List<DataSetColumn>) get(PROPERTY_DATASETCOLUMNLIST);
    }

    /**
     * Help: {@literal Columns of a table from a Dataset.}<br>
     * @see DataSetColumn
     * 
     */
    public void setDataSetColumnList(List<DataSetColumn> dataSetColumnList) {
        set(PROPERTY_DATASETCOLUMNLIST, dataSetColumnList);
    }

}
