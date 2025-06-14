
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
package org.openbravo.model.financialmgmt.accounting;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtDimension (stored in table AD_Dimension).
 * <br>
 * Help: {@literal The dimensions are needed for the multidimensional analysis reports}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Dimension extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Dimension";
    public static final String ENTITY_NAME = "FinancialMgmtDimension";

    /**
     * Property id stored in column AD_Dimension_ID in table AD_Dimension 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Dimension 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Dimension 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Dimension 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Dimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Dimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Dimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Dimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property dBColumnName stored in column ColumnName in table AD_Dimension<br>
     * Help: {@literal The Column Name indicates the name of a column on a table as defined in the database.}
     * 
     */
    public static final String PROPERTY_DBCOLUMNNAME = "dBColumnName";

    /**
     * Property lineNo stored in column Line in table AD_Dimension<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table AD_Dimension 
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property joinGroup1 stored in column Join_Group1 in table AD_Dimension
     * 
     */
    public static final String PROPERTY_JOINGROUP1 = "joinGroup1";

    /**
     * Property dBTableName stored in column TableName in table AD_Dimension<br>
     * Help: {@literal The DB Table Name indicates the name of the table in database.}
     * 
     */
    public static final String PROPERTY_DBTABLENAME = "dBTableName";

    /**
     * Property joinGroup2 stored in column Join_Group2 in table AD_Dimension
     * 
     */
    public static final String PROPERTY_JOINGROUP2 = "joinGroup2";


    public Dimension() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Dimension#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Dimension#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Dimension#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Dimension#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Dimension#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Dimension#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Dimension#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Dimension#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Dimension#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Dimension#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Dimension#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Dimension#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Dimension#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Dimension#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Dimension#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Dimension#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Dimension#PROPERTY_DBCOLUMNNAME
     * 
     */
    public String getDBColumnName() {
        return (String) get(PROPERTY_DBCOLUMNNAME);
    }
    /**
     * @see Dimension#PROPERTY_DBCOLUMNNAME
     * 
     */
    public void setDBColumnName(String dBColumnName) {
        set(PROPERTY_DBCOLUMNNAME, dBColumnName);
    }

    /**
     * @see Dimension#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see Dimension#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see Dimension#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Dimension#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Dimension#PROPERTY_JOINGROUP1
     * 
     */
    public String getJoinGroup1() {
        return (String) get(PROPERTY_JOINGROUP1);
    }
    /**
     * @see Dimension#PROPERTY_JOINGROUP1
     * 
     */
    public void setJoinGroup1(String joinGroup1) {
        set(PROPERTY_JOINGROUP1, joinGroup1);
    }

    /**
     * @see Dimension#PROPERTY_DBTABLENAME
     * 
     */
    public String getDBTableName() {
        return (String) get(PROPERTY_DBTABLENAME);
    }
    /**
     * @see Dimension#PROPERTY_DBTABLENAME
     * 
     */
    public void setDBTableName(String dBTableName) {
        set(PROPERTY_DBTABLENAME, dBTableName);
    }

    /**
     * @see Dimension#PROPERTY_JOINGROUP2
     * 
     */
    public String getJoinGroup2() {
        return (String) get(PROPERTY_JOINGROUP2);
    }
    /**
     * @see Dimension#PROPERTY_JOINGROUP2
     * 
     */
    public void setJoinGroup2(String joinGroup2) {
        set(PROPERTY_JOINGROUP2, joinGroup2);
    }

}
