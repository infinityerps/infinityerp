
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
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.DataSet;
/**
 * Entity class for entity OrganizationModuleV (stored in table AD_OrgModule_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrganizationModuleV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_OrgModule_V";
    public static final String ENTITY_NAME = "OrganizationModuleV";

    /**
     * Property id stored in column AD_OrgModule_V_ID in table AD_OrgModule_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property organization stored in column AD_Org_ID in table AD_OrgModule_V<br>
     * Help: {@literal An organization is a unit of your client or legal entity - examples are store, department.
     *       You can share data between organizations.}
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property client stored in column AD_Client_ID in table AD_OrgModule_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property creationDate stored in column Created in table AD_OrgModule_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property active stored in column Isactive in table AD_OrgModule_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property createdBy stored in column Createdby in table AD_OrgModule_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_OrgModule_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_OrgModule_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property module stored in column AD_Module_ID in table AD_OrgModule_V<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property version stored in column Version in table AD_OrgModule_V<br>
     * Help: {@literal The Version indicates the version of this table definition.}
     * 
     */
    public static final String PROPERTY_VERSION = "version";

    /**
     * Property dataset stored in column AD_Dataset_ID in table AD_OrgModule_V<br>
     * Help: {@literal Indicates the dataset the element forms part of.}
     * 
     */
    public static final String PROPERTY_DATASET = "dataset";

    /**
     * Property description stored in column Description in table AD_OrgModule_V<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property availableUpdate stored in column Update_Available in table AD_OrgModule_V<br>
     * Help: {@literal Indicates whether and which new version is available to update a module}
     * 
     */
    public static final String PROPERTY_AVAILABLEUPDATE = "availableUpdate";


    public OrganizationModuleV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AVAILABLEUPDATE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OrganizationModuleV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_VERSION
     * 
     */
    public String getVersion() {
        return (String) get(PROPERTY_VERSION);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_VERSION
     * 
     */
    public void setVersion(String version) {
        set(PROPERTY_VERSION, version);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_DATASET
     * 
     */
    public DataSet getDataset() {
        return (DataSet) get(PROPERTY_DATASET);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_DATASET
     * 
     */
    public void setDataset(DataSet dataset) {
        set(PROPERTY_DATASET, dataset);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see OrganizationModuleV#PROPERTY_AVAILABLEUPDATE
     * 
     */
    public Boolean isAvailableUpdate() {
        return (Boolean) get(PROPERTY_AVAILABLEUPDATE);
    }
    /**
     * @see OrganizationModuleV#PROPERTY_AVAILABLEUPDATE
     * 
     */
    public void setAvailableUpdate(Boolean availableUpdate) {
        set(PROPERTY_AVAILABLEUPDATE, availableUpdate);
    }

}
