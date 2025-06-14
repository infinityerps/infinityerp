
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
package org.openbravo.model.financialmgmt.accounting.coa;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.ADCreatefactTemplate;
/**
 * Entity class for entity FinancialMgmtAcctSchemaTable (stored in table C_AcctSchema_Table).
 * <br>
 * Help: {@literal Group of tables that can be posted.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AcctSchemaTable extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_AcctSchema_Table";
    public static final String ENTITY_NAME = "FinancialMgmtAcctSchemaTable";

    /**
     * Property id stored in column C_Acctschema_Table_ID in table C_AcctSchema_Table<br>
     * Help: {@literal Table which has been configured to generate accounting in the ledger.	}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_AcctSchema_Table<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property table stored in column AD_Table_ID in table C_AcctSchema_Table<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property client stored in column AD_Client_ID in table C_AcctSchema_Table 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_AcctSchema_Table 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_AcctSchema_Table 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_AcctSchema_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_AcctSchema_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_AcctSchema_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_AcctSchema_Table 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property createfactTemplate stored in column AD_Createfact_Template_ID in table C_AcctSchema_Table<br>
     * Help: {@literal Accounting Template}
     * 
     */
    public static final String PROPERTY_CREATEFACTTEMPLATE = "createfactTemplate";

    /**
     * Property sQLDescription stored in column Acctdescription in table C_AcctSchema_Table<br>
     * Help: {@literal SQL that will compose the description of the entries for this table when documents are
     *       posted.}
     * 
     */
    public static final String PROPERTY_SQLDESCRIPTION = "sQLDescription";

    /**
     * Property isBackgroundDisabled stored in column IsBackgroundDisabled in table C_AcctSchema_Table<br>
     * Help: {@literal Disables the selected table for accounting in background process}
     * 
     */
    public static final String PROPERTY_ISBACKGROUNDDISABLED = "isBackgroundDisabled";


    public AcctSchemaTable() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISBACKGROUNDDISABLED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AcctSchemaTable#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_CREATEFACTTEMPLATE
     * 
     */
    public ADCreatefactTemplate getCreatefactTemplate() {
        return (ADCreatefactTemplate) get(PROPERTY_CREATEFACTTEMPLATE);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_CREATEFACTTEMPLATE
     * 
     */
    public void setCreatefactTemplate(ADCreatefactTemplate createfactTemplate) {
        set(PROPERTY_CREATEFACTTEMPLATE, createfactTemplate);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_SQLDESCRIPTION
     * 
     */
    public String getSQLDescription() {
        return (String) get(PROPERTY_SQLDESCRIPTION);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_SQLDESCRIPTION
     * 
     */
    public void setSQLDescription(String sQLDescription) {
        set(PROPERTY_SQLDESCRIPTION, sQLDescription);
    }

    /**
     * @see AcctSchemaTable#PROPERTY_ISBACKGROUNDDISABLED
     * 
     */
    public Boolean isBackgroundDisabled() {
        return (Boolean) get(PROPERTY_ISBACKGROUNDDISABLED);
    }
    /**
     * @see AcctSchemaTable#PROPERTY_ISBACKGROUNDDISABLED
     * 
     */
    public void setBackgroundDisabled(Boolean isBackgroundDisabled) {
        set(PROPERTY_ISBACKGROUNDDISABLED, isBackgroundDisabled);
    }

}
