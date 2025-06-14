
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
 * Entity class for entity ADReferencedTable (stored in table AD_Ref_Table).
 * <br>
 * Help: {@literal The Table Validation Tab defines tables to validate data}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReferencedTable extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Ref_Table";
    public static final String ENTITY_NAME = "ADReferencedTable";

    /**
     * Property id stored in column AD_Reference_ID in table AD_Ref_Table 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Ref_Table 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Ref_Table 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Ref_Table 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Ref_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Ref_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Ref_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Ref_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property table stored in column AD_Table_ID in table AD_Ref_Table<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property keyColumn stored in column AD_Key in table AD_Ref_Table<br>
     * Help: {@literal The Key Column indicates that this the unique identifier of a record on this table.}
     * 
     */
    public static final String PROPERTY_KEYCOLUMN = "keyColumn";

    /**
     * Property displayedColumn stored in column AD_Display in table AD_Ref_Table<br>
     * Help: {@literal The Display Column indicates the column that will display.}
     * 
     */
    public static final String PROPERTY_DISPLAYEDCOLUMN = "displayedColumn";

    /**
     * Property displayedValue stored in column IsValueDisplayed in table AD_Ref_Table<br>
     * Help: {@literal The Display Value checkbox indicates if the value column will display with the display
     *       column.}
     * 
     */
    public static final String PROPERTY_DISPLAYEDVALUE = "displayedValue";

    /**
     * Property sQLWhereClause stored in column WhereClause in table AD_Ref_Table<br>
     * Help: {@literal The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE
     *       clause is added to the query. Fully qualified means "tablename.columnname".}
     * 
     */
    public static final String PROPERTY_SQLWHERECLAUSE = "sQLWhereClause";

    /**
     * Property sQLOrderByClause stored in column OrderByClause in table AD_Ref_Table<br>
     * Help: {@literal The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection}
     * 
     */
    public static final String PROPERTY_SQLORDERBYCLAUSE = "sQLOrderByClause";

    /**
     * Property hqlwhereclause stored in column Hqlwhereclause in table AD_Ref_Table<br>
     * Help: {@literal  By using this HQL filter, the user will never be able to see data that does not fit the
     *       criteria. The HQL where clause is added to the query to retrieve the data which is returned by the
     *       datasource}
     * 
     */
    public static final String PROPERTY_HQLWHERECLAUSE = "hqlwhereclause";

    /**
     * Property hqlorderbyclause stored in column Hqlorderbyclause in table AD_Ref_Table
     * 
     */
    public static final String PROPERTY_HQLORDERBYCLAUSE = "hqlorderbyclause";

    /**
     * Property reference stored in column AD_Reference_ID in table AD_Ref_Table<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";


    public ReferencedTable() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DISPLAYEDVALUE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReferencedTable#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReferencedTable#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReferencedTable#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReferencedTable#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReferencedTable#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReferencedTable#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReferencedTable#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReferencedTable#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReferencedTable#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReferencedTable#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReferencedTable#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReferencedTable#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReferencedTable#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReferencedTable#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReferencedTable#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReferencedTable#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReferencedTable#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see ReferencedTable#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see ReferencedTable#PROPERTY_KEYCOLUMN
     * 
     */
    public Column getKeyColumn() {
        return (Column) get(PROPERTY_KEYCOLUMN);
    }
    /**
     * @see ReferencedTable#PROPERTY_KEYCOLUMN
     * 
     */
    public void setKeyColumn(Column keyColumn) {
        set(PROPERTY_KEYCOLUMN, keyColumn);
    }

    /**
     * @see ReferencedTable#PROPERTY_DISPLAYEDCOLUMN
     * 
     */
    public Column getDisplayedColumn() {
        return (Column) get(PROPERTY_DISPLAYEDCOLUMN);
    }
    /**
     * @see ReferencedTable#PROPERTY_DISPLAYEDCOLUMN
     * 
     */
    public void setDisplayedColumn(Column displayedColumn) {
        set(PROPERTY_DISPLAYEDCOLUMN, displayedColumn);
    }

    /**
     * @see ReferencedTable#PROPERTY_DISPLAYEDVALUE
     * 
     */
    public Boolean isDisplayedValue() {
        return (Boolean) get(PROPERTY_DISPLAYEDVALUE);
    }
    /**
     * @see ReferencedTable#PROPERTY_DISPLAYEDVALUE
     * 
     */
    public void setDisplayedValue(Boolean displayedValue) {
        set(PROPERTY_DISPLAYEDVALUE, displayedValue);
    }

    /**
     * @see ReferencedTable#PROPERTY_SQLWHERECLAUSE
     * 
     */
    public String getSQLWhereClause() {
        return (String) get(PROPERTY_SQLWHERECLAUSE);
    }
    /**
     * @see ReferencedTable#PROPERTY_SQLWHERECLAUSE
     * 
     */
    public void setSQLWhereClause(String sQLWhereClause) {
        set(PROPERTY_SQLWHERECLAUSE, sQLWhereClause);
    }

    /**
     * @see ReferencedTable#PROPERTY_SQLORDERBYCLAUSE
     * 
     */
    public String getSQLOrderByClause() {
        return (String) get(PROPERTY_SQLORDERBYCLAUSE);
    }
    /**
     * @see ReferencedTable#PROPERTY_SQLORDERBYCLAUSE
     * 
     */
    public void setSQLOrderByClause(String sQLOrderByClause) {
        set(PROPERTY_SQLORDERBYCLAUSE, sQLOrderByClause);
    }

    /**
     * @see ReferencedTable#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public String getHqlwhereclause() {
        return (String) get(PROPERTY_HQLWHERECLAUSE);
    }
    /**
     * @see ReferencedTable#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public void setHqlwhereclause(String hqlwhereclause) {
        set(PROPERTY_HQLWHERECLAUSE, hqlwhereclause);
    }

    /**
     * @see ReferencedTable#PROPERTY_HQLORDERBYCLAUSE
     * 
     */
    public String getHqlorderbyclause() {
        return (String) get(PROPERTY_HQLORDERBYCLAUSE);
    }
    /**
     * @see ReferencedTable#PROPERTY_HQLORDERBYCLAUSE
     * 
     */
    public void setHqlorderbyclause(String hqlorderbyclause) {
        set(PROPERTY_HQLORDERBYCLAUSE, hqlorderbyclause);
    }

    /**
     * @see ReferencedTable#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see ReferencedTable#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

}
