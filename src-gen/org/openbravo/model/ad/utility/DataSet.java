
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
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity DataSet (stored in table AD_Dataset).
 * <br>
 * Help: {@literal Sets of data.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DataSet extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Dataset";
    public static final String ENTITY_NAME = "DataSet";

    /**
     * Property id stored in column AD_Dataset_ID in table AD_Dataset<br>
     * Help: {@literal Indicates the dataset the element forms part of.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Dataset 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Dataset 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Dataset 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Dataset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Dataset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Dataset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Dataset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table AD_Dataset<br>
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
     * Property name stored in column Name in table AD_Dataset 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Dataset<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property module stored in column AD_Module_ID in table AD_Dataset<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property export stored in column Export in table AD_Dataset<br>
     * Help: {@literal Export Reference Data to a XML file}
     * 
     */
    public static final String PROPERTY_EXPORT = "export";

    /**
     * Property dataAccessLevel stored in column Accesslevel in table AD_Dataset<br>
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
     * Property exportAllowed stored in column ExportAllowed in table AD_Dataset<br>
     * Help: {@literal This data set can be exported. There are datasets which are not meant to be exported, such
     *       as the AD dataset (which contains the set of tables which define the Application Dictionary), or the
     *       Client dataset. If the dataset needs to be exported via the Export Dataset functionality, this check
     *       should be marked. If it's going to be used for another purpose, and its data content doesn't need to
     *       be included inside the modules, then it should be unchecked. }
     * 
     */
    public static final String PROPERTY_EXPORTALLOWED = "exportAllowed";

    /**
     * Property checksum stored in column Checksum in table AD_Dataset<br>
     * Help: {@literal The checksum information is used to verify whether the version of the dataset which was
     *       imported in the database is up to date, or needs to be updated.}
     * 
     */
    public static final String PROPERTY_CHECKSUM = "checksum";

    /**
     * Property sequenceNumber stored in column Seqno in table AD_Dataset<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property defaultValuesDataSet stored in column IsDefaultValuesDataSet in table AD_Dataset<br>
     * Help: {@literal Data sets marked as "Default Values Data Set" import data as default values. The owner of
     *       this data once imported is not the data set anymore but the instance. This means that subsequent
     *       data set  updates will not modify this data, though they can add new rows, preserving any change
     *       performed in the instance where they were initially imported.}
     * 
     */
    public static final String PROPERTY_DEFAULTVALUESDATASET = "defaultValuesDataSet";

    /**
     * Property dataSetTableList stored in table AD_Dataset
     * 
     */
    public static final String PROPERTY_DATASETTABLELIST = "dataSetTableList";


    public DataSet() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_EXPORT, false);
        setDefaultValue(PROPERTY_DATAACCESSLEVEL, "4");
        setDefaultValue(PROPERTY_EXPORTALLOWED, true);
        setDefaultValue(PROPERTY_DEFAULTVALUESDATASET, false);
        setDefaultValue(PROPERTY_DATASETTABLELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DataSet#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DataSet#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DataSet#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DataSet#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DataSet#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DataSet#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DataSet#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DataSet#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DataSet#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DataSet#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DataSet#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DataSet#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DataSet#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DataSet#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DataSet#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DataSet#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DataSet#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see DataSet#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see DataSet#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see DataSet#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see DataSet#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DataSet#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DataSet#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see DataSet#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see DataSet#PROPERTY_EXPORT
     * 
     */
    public Boolean isExport() {
        return (Boolean) get(PROPERTY_EXPORT);
    }
    /**
     * @see DataSet#PROPERTY_EXPORT
     * 
     */
    public void setExport(Boolean export) {
        set(PROPERTY_EXPORT, export);
    }

    /**
     * @see DataSet#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public String getDataAccessLevel() {
        return (String) get(PROPERTY_DATAACCESSLEVEL);
    }
    /**
     * @see DataSet#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public void setDataAccessLevel(String dataAccessLevel) {
        set(PROPERTY_DATAACCESSLEVEL, dataAccessLevel);
    }

    /**
     * @see DataSet#PROPERTY_EXPORTALLOWED
     * 
     */
    public Boolean isExportAllowed() {
        return (Boolean) get(PROPERTY_EXPORTALLOWED);
    }
    /**
     * @see DataSet#PROPERTY_EXPORTALLOWED
     * 
     */
    public void setExportAllowed(Boolean exportAllowed) {
        set(PROPERTY_EXPORTALLOWED, exportAllowed);
    }

    /**
     * @see DataSet#PROPERTY_CHECKSUM
     * 
     */
    public String getChecksum() {
        return (String) get(PROPERTY_CHECKSUM);
    }
    /**
     * @see DataSet#PROPERTY_CHECKSUM
     * 
     */
    public void setChecksum(String checksum) {
        set(PROPERTY_CHECKSUM, checksum);
    }

    /**
     * @see DataSet#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see DataSet#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see DataSet#PROPERTY_DEFAULTVALUESDATASET
     * 
     */
    public Boolean isDefaultValuesDataSet() {
        return (Boolean) get(PROPERTY_DEFAULTVALUESDATASET);
    }
    /**
     * @see DataSet#PROPERTY_DEFAULTVALUESDATASET
     * 
     */
    public void setDefaultValuesDataSet(Boolean defaultValuesDataSet) {
        set(PROPERTY_DEFAULTVALUESDATASET, defaultValuesDataSet);
    }

    /**
     * Help: {@literal Tables of a Dataset.}<br>
     * @see DataSetTable
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DataSetTable> getDataSetTableList() {
      return (List<DataSetTable>) get(PROPERTY_DATASETTABLELIST);
    }

    /**
     * Help: {@literal Tables of a Dataset.}<br>
     * @see DataSetTable
     * 
     */
    public void setDataSetTableList(List<DataSetTable> dataSetTableList) {
        set(PROPERTY_DATASETTABLELIST, dataSetTableList);
    }

}
