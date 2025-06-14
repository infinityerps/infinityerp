
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
package org.openbravo.service.datasource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.kernel.Template;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.TableTree;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBSERDS_Datasource (stored in table OBSERDS_Datasource).
 * <br>
 * Help: {@literal A datasource is used to provide data to user interface components running on the client.
     *       The data can be read from the database or can be computed at runtime in memory. Data consists mostly
     *       of records with fields which are displayed on the client in forms and grids.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DataSource extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBSERDS_Datasource";
    public static final String ENTITY_NAME = "OBSERDS_Datasource";

    /**
     * Property id stored in column Obserds_Datasource_ID in table OBSERDS_Datasource<br>
     * Help: {@literal The datasource provides data from the database or from in-memory data.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBSERDS_Datasource 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBSERDS_Datasource 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property module stored in column AD_Module_ID in table OBSERDS_Datasource<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property name stored in column Name in table OBSERDS_Datasource 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBSERDS_Datasource<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property table stored in column AD_Table_ID in table OBSERDS_Datasource<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property hQLWhereClause stored in column Whereclause in table OBSERDS_Datasource<br>
     * Help: {@literal The HQL where clause is added to the query to retrieve the data which is returned by the
     *       datasource.}
     * 
     */
    public static final String PROPERTY_HQLWHERECLAUSE = "hQLWhereClause";

    /**
     * Property javaClassName stored in column Classname in table OBSERDS_Datasource<br>
     * Help: {@literal Class implementing the functionality in java}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property template stored in column Obclker_template_ID in table OBSERDS_Datasource<br>
     * Help: {@literal The template used to generate the client-side representation (in the browser) of the
     *       datasource.}
     * 
     */
    public static final String PROPERTY_TEMPLATE = "template";

    /**
     * Property active stored in column Isactive in table OBSERDS_Datasource 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBSERDS_Datasource 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBSERDS_Datasource 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBSERDS_Datasource 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBSERDS_Datasource 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property useAsTableDataOrigin stored in column Useastabledataorigin in table OBSERDS_Datasource<br>
     * Help: {@literal A flag indicating whether this datasource is used as a data origin in the Table window. In
     *       that case, the Table and Column subtabs of the Datasource window are hidden, because the columns of
     *       the datasource must be defined in the Columns tab of the Tables and Columns window.}
     * 
     */
    public static final String PROPERTY_USEASTABLEDATAORIGIN = "useAsTableDataOrigin";

    /**
     * Property supportIdFkFiltering stored in column Idfkfiltering in table OBSERDS_Datasource<br>
     * Help: {@literal If this flag is checked, when a foreign key is filtered by selecting a value from the
     *       filter drop down, the foreign key will be filtered using its id. If this flag is not checked, the
     *       foreign key will be filtered using its identifier. }
     * 
     */
    public static final String PROPERTY_SUPPORTIDFKFILTERING = "supportIdFkFiltering";

    /**
     * Property aDTableTreeList stored in table OBSERDS_Datasource
     * 
     */
    public static final String PROPERTY_ADTABLETREELIST = "aDTableTreeList";

    /**
     * Property oBSERDSDatasourceFieldList stored in table OBSERDS_Datasource
     * 
     */
    public static final String PROPERTY_OBSERDSDATASOURCEFIELDLIST = "oBSERDSDatasourceFieldList";


    public DataSource() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_USEASTABLEDATAORIGIN, false);
        setDefaultValue(PROPERTY_SUPPORTIDFKFILTERING, true);
        setDefaultValue(PROPERTY_ADTABLETREELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBSERDSDATASOURCEFIELDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DataSource#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DataSource#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DataSource#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DataSource#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DataSource#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DataSource#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DataSource#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see DataSource#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see DataSource#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see DataSource#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see DataSource#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DataSource#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DataSource#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see DataSource#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see DataSource#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public String getHQLWhereClause() {
        return (String) get(PROPERTY_HQLWHERECLAUSE);
    }
    /**
     * @see DataSource#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public void setHQLWhereClause(String hQLWhereClause) {
        set(PROPERTY_HQLWHERECLAUSE, hQLWhereClause);
    }

    /**
     * @see DataSource#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see DataSource#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see DataSource#PROPERTY_TEMPLATE
     * 
     */
    public Template getTemplate() {
        return (Template) get(PROPERTY_TEMPLATE);
    }
    /**
     * @see DataSource#PROPERTY_TEMPLATE
     * 
     */
    public void setTemplate(Template template) {
        set(PROPERTY_TEMPLATE, template);
    }

    /**
     * @see DataSource#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DataSource#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DataSource#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DataSource#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DataSource#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DataSource#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DataSource#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DataSource#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DataSource#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DataSource#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DataSource#PROPERTY_USEASTABLEDATAORIGIN
     * 
     */
    public Boolean isUseAsTableDataOrigin() {
        return (Boolean) get(PROPERTY_USEASTABLEDATAORIGIN);
    }
    /**
     * @see DataSource#PROPERTY_USEASTABLEDATAORIGIN
     * 
     */
    public void setUseAsTableDataOrigin(Boolean useAsTableDataOrigin) {
        set(PROPERTY_USEASTABLEDATAORIGIN, useAsTableDataOrigin);
    }

    /**
     * @see DataSource#PROPERTY_SUPPORTIDFKFILTERING
     * 
     */
    public Boolean isSupportIdFkFiltering() {
        return (Boolean) get(PROPERTY_SUPPORTIDFKFILTERING);
    }
    /**
     * @see DataSource#PROPERTY_SUPPORTIDFKFILTERING
     * 
     */
    public void setSupportIdFkFiltering(Boolean supportIdFkFiltering) {
        set(PROPERTY_SUPPORTIDFKFILTERING, supportIdFkFiltering);
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
     * Help: {@literal A data source returns records which have field. The fields, their name and type, are
     *       defined in the data source field.}<br>
     * @see DatasourceField
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DatasourceField> getOBSERDSDatasourceFieldList() {
      return (List<DatasourceField>) get(PROPERTY_OBSERDSDATASOURCEFIELDLIST);
    }

    /**
     * Help: {@literal A data source returns records which have field. The fields, their name and type, are
     *       defined in the data source field.}<br>
     * @see DatasourceField
     * 
     */
    public void setOBSERDSDatasourceFieldList(List<DatasourceField> oBSERDSDatasourceFieldList) {
        set(PROPERTY_OBSERDSDATASOURCEFIELDLIST, oBSERDSDatasourceFieldList);
    }

}
