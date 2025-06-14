
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
package org.openbravo.utility.cleanup.log;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBULOG_Config (stored in table OBULOG_Config).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class LogCleanUpConfig extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBULOG_Config";
    public static final String ENTITY_NAME = "OBULOG_Config";

    /**
     * Property id stored in column Obulog_Config_ID in table OBULOG_Config 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBULOG_Config 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBULOG_Config 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBULOG_Config 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBULOG_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBULOG_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBULOG_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBULOG_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property table stored in column AD_Table_ID in table OBULOG_Config<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property olderThan stored in column Older_Than in table OBULOG_Config<br>
     * Help: {@literal When the clean up process is executed, records older than this number of days will be
     *       removed. If this value is 0, all records will be removed.}
     * 
     */
    public static final String PROPERTY_OLDERTHAN = "olderThan";

    /**
     * Property column stored in column AD_Column_ID in table OBULOG_Config<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property hQLWhereClause stored in column Hqlwhereclause in table OBULOG_Config<br>
     * Help: {@literal  By using this HQL filter, the user will never be able to see data that does not fit the
     *       criteria. The HQL where clause is added to the query to retrieve the data which is returned by the
     *       datasource}
     * 
     */
    public static final String PROPERTY_HQLWHERECLAUSE = "hQLWhereClause";

    /**
     * Property truncateTable stored in column IsTruncate in table OBULOG_Config<br>
     * Help: {@literal Truncate all data in the table (technically truncate table DB statement). When flagged,
     *       all data in the table will be completely removed not being possible to define any other
     *       restriction.
     *       
     *       It is only possible to truncate a table in case there is no any other table in the
     *       system having a foreign key pointing to this one.
     *       
     *       Truncating a table results performs better in
     *       terms of time/resources consumption.}
     * 
     */
    public static final String PROPERTY_TRUNCATETABLE = "truncateTable";

    /**
     * Property entityAlias stored in column Entity_Alias in table OBULOG_Config<br>
     * Help: {@literal Defines the main entity alias in the HQL Where Clause so it can be used in subqueries. If
     *       left empty there'll be no alias on the main entity.}
     * 
     */
    public static final String PROPERTY_ENTITYALIAS = "entityAlias";


    public LogCleanUpConfig() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OLDERTHAN, (long) 7);
        setDefaultValue(PROPERTY_TRUNCATETABLE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_OLDERTHAN
     * 
     */
    public Long getOlderThan() {
        return (Long) get(PROPERTY_OLDERTHAN);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_OLDERTHAN
     * 
     */
    public void setOlderThan(Long olderThan) {
        set(PROPERTY_OLDERTHAN, olderThan);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_COLUMN
     * 
     */
    public Column getColumn() {
        return (Column) get(PROPERTY_COLUMN);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_COLUMN
     * 
     */
    public void setColumn(Column column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public String getHQLWhereClause() {
        return (String) get(PROPERTY_HQLWHERECLAUSE);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public void setHQLWhereClause(String hQLWhereClause) {
        set(PROPERTY_HQLWHERECLAUSE, hQLWhereClause);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_TRUNCATETABLE
     * 
     */
    public Boolean isTruncateTable() {
        return (Boolean) get(PROPERTY_TRUNCATETABLE);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_TRUNCATETABLE
     * 
     */
    public void setTruncateTable(Boolean truncateTable) {
        set(PROPERTY_TRUNCATETABLE, truncateTable);
    }

    /**
     * @see LogCleanUpConfig#PROPERTY_ENTITYALIAS
     * 
     */
    public String getEntityAlias() {
        return (String) get(PROPERTY_ENTITYALIAS);
    }
    /**
     * @see LogCleanUpConfig#PROPERTY_ENTITYALIAS
     * 
     */
    public void setEntityAlias(String entityAlias) {
        set(PROPERTY_ENTITYALIAS, entityAlias);
    }

}
