
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
package org.openbravo.model.common.enterprise;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.financialmgmt.accounting.ADCreatefactTemplate;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchemaTable;
/**
 * Entity class for entity AcctSchemaTableDocType (stored in table C_AcctSchema_Table_DocType).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AcctSchemaTableDocType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_AcctSchema_Table_DocType";
    public static final String ENTITY_NAME = "AcctSchemaTableDocType";

    /**
     * Property id stored in column C_Acctschema_Table_Doctype_ID in table C_AcctSchema_Table_DocType 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property acctschemaTable stored in column C_Acctschema_Table_ID in table C_AcctSchema_Table_DocType<br>
     * Help: {@literal Table which has been configured to generate accounting in the ledger.	}
     * 
     */
    public static final String PROPERTY_ACCTSCHEMATABLE = "acctschemaTable";

    /**
     * Property client stored in column AD_Client_ID in table C_AcctSchema_Table_DocType 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_AcctSchema_Table_DocType 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_AcctSchema_Table_DocType 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_AcctSchema_Table_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_AcctSchema_Table_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_AcctSchema_Table_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_AcctSchema_Table_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property allowNegative stored in column AllowNegative in table C_AcctSchema_Table_DocType 
     * 
     */
    public static final String PROPERTY_ALLOWNEGATIVE = "allowNegative";

    /**
     * Property documentCategory stored in column Docbasetype in table C_AcctSchema_Table_DocType 
     * 
     */
    public static final String PROPERTY_DOCUMENTCATEGORY = "documentCategory";

    /**
     * Property createfactTemplate stored in column AD_Createfact_Template_ID in table C_AcctSchema_Table_DocType<br>
     * Help: {@literal Accounting Template}
     * 
     */
    public static final String PROPERTY_CREATEFACTTEMPLATE = "createfactTemplate";


    public AcctSchemaTableDocType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ALLOWNEGATIVE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_ACCTSCHEMATABLE
     * 
     */
    public AcctSchemaTable getAcctschemaTable() {
        return (AcctSchemaTable) get(PROPERTY_ACCTSCHEMATABLE);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_ACCTSCHEMATABLE
     * 
     */
    public void setAcctschemaTable(AcctSchemaTable acctschemaTable) {
        set(PROPERTY_ACCTSCHEMATABLE, acctschemaTable);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_ALLOWNEGATIVE
     * 
     */
    public Boolean isAllowNegative() {
        return (Boolean) get(PROPERTY_ALLOWNEGATIVE);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_ALLOWNEGATIVE
     * 
     */
    public void setAllowNegative(Boolean allowNegative) {
        set(PROPERTY_ALLOWNEGATIVE, allowNegative);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public String getDocumentCategory() {
        return (String) get(PROPERTY_DOCUMENTCATEGORY);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public void setDocumentCategory(String documentCategory) {
        set(PROPERTY_DOCUMENTCATEGORY, documentCategory);
    }

    /**
     * @see AcctSchemaTableDocType#PROPERTY_CREATEFACTTEMPLATE
     * 
     */
    public ADCreatefactTemplate getCreatefactTemplate() {
        return (ADCreatefactTemplate) get(PROPERTY_CREATEFACTTEMPLATE);
    }
    /**
     * @see AcctSchemaTableDocType#PROPERTY_CREATEFACTTEMPLATE
     * 
     */
    public void setCreatefactTemplate(ADCreatefactTemplate createfactTemplate) {
        set(PROPERTY_CREATEFACTTEMPLATE, createfactTemplate);
    }

}
