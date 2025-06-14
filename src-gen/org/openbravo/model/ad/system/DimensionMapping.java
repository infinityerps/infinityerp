
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
package org.openbravo.model.ad.system;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADDimensionMapping (stored in table AD_Dimension_Mapping).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DimensionMapping extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Dimension_Mapping";
    public static final String ENTITY_NAME = "ADDimensionMapping";

    /**
     * Property id stored in column AD_Dimension_Mapping_ID in table AD_Dimension_Mapping 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Dimension_Mapping 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Dimension_Mapping 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Dimension_Mapping 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Dimension_Mapping 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Dimension_Mapping 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Dimension_Mapping 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Dimension_Mapping 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property accountingDimension stored in column Dimension in table AD_Dimension_Mapping 
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDIMENSION = "accountingDimension";

    /**
     * Property documentCategory stored in column Docbasetype in table AD_Dimension_Mapping 
     * 
     */
    public static final String PROPERTY_DOCUMENTCATEGORY = "documentCategory";

    /**
     * Property table stored in column AD_Table_ID in table AD_Dimension_Mapping<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property level stored in column documentLevel in table AD_Dimension_Mapping 
     * 
     */
    public static final String PROPERTY_LEVEL = "level";

    /**
     * Property module stored in column AD_Module_ID in table AD_Dimension_Mapping<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property ismandatory stored in column Ismandatory in table AD_Dimension_Mapping<br>
     * Help: {@literal The Mandatory checkbox indicates if the field is required for a record to be save to the
     *       database.}
     * 
     */
    public static final String PROPERTY_ISMANDATORY = "ismandatory";


    public DimensionMapping() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISMANDATORY, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DimensionMapping#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DimensionMapping#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DimensionMapping#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DimensionMapping#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DimensionMapping#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DimensionMapping#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DimensionMapping#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DimensionMapping#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DimensionMapping#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DimensionMapping#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DimensionMapping#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DimensionMapping#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DimensionMapping#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DimensionMapping#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DimensionMapping#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DimensionMapping#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DimensionMapping#PROPERTY_ACCOUNTINGDIMENSION
     * 
     */
    public String getAccountingDimension() {
        return (String) get(PROPERTY_ACCOUNTINGDIMENSION);
    }
    /**
     * @see DimensionMapping#PROPERTY_ACCOUNTINGDIMENSION
     * 
     */
    public void setAccountingDimension(String accountingDimension) {
        set(PROPERTY_ACCOUNTINGDIMENSION, accountingDimension);
    }

    /**
     * @see DimensionMapping#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public String getDocumentCategory() {
        return (String) get(PROPERTY_DOCUMENTCATEGORY);
    }
    /**
     * @see DimensionMapping#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public void setDocumentCategory(String documentCategory) {
        set(PROPERTY_DOCUMENTCATEGORY, documentCategory);
    }

    /**
     * @see DimensionMapping#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see DimensionMapping#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see DimensionMapping#PROPERTY_LEVEL
     * 
     */
    public String getLevel() {
        return (String) get(PROPERTY_LEVEL);
    }
    /**
     * @see DimensionMapping#PROPERTY_LEVEL
     * 
     */
    public void setLevel(String level) {
        set(PROPERTY_LEVEL, level);
    }

    /**
     * @see DimensionMapping#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see DimensionMapping#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see DimensionMapping#PROPERTY_ISMANDATORY
     * 
     */
    public Boolean isMandatory() {
        return (Boolean) get(PROPERTY_ISMANDATORY);
    }
    /**
     * @see DimensionMapping#PROPERTY_ISMANDATORY
     * 
     */
    public void setMandatory(Boolean ismandatory) {
        set(PROPERTY_ISMANDATORY, ismandatory);
    }

}
