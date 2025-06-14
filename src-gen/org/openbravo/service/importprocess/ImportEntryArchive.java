
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
package org.openbravo.service.importprocess;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity C_Import_Entry_Archive (stored in table C_Import_Entry_Archive).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ImportEntryArchive extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Import_Entry_Archive";
    public static final String ENTITY_NAME = "C_Import_Entry_Archive";

    /**
     * Property id stored in column C_Import_Entry_Archive_ID in table C_Import_Entry_Archive 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Import_Entry_Archive 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Import_Entry_Archive 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Import_Entry_Archive 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Import_Entry_Archive 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Import_Entry_Archive 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Import_Entry_Archive 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Import_Entry_Archive 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property imported stored in column Imported in table C_Import_Entry_Archive
     * 
     */
    public static final String PROPERTY_IMPORTED = "imported";

    /**
     * Property jsonInfo stored in column Jsoninfo in table C_Import_Entry_Archive
     * 
     */
    public static final String PROPERTY_JSONINFO = "jsonInfo";

    /**
     * Property importStatus stored in column ImportStatus in table C_Import_Entry_Archive
     * 
     */
    public static final String PROPERTY_IMPORTSTATUS = "importStatus";

    /**
     * Property typeofdata stored in column Typeofdata in table C_Import_Entry_Archive 
     * 
     */
    public static final String PROPERTY_TYPEOFDATA = "typeofdata";

    /**
     * Property errorinfo stored in column Errorinfo in table C_Import_Entry_Archive
     * 
     */
    public static final String PROPERTY_ERRORINFO = "errorinfo";

    /**
     * Property role stored in column AD_Role_ID in table C_Import_Entry_Archive<br>
     * Help: {@literal The Role determines security and access a user who has this Role will have in the System.}
     * 
     */
    public static final String PROPERTY_ROLE = "role";

    /**
     * Property responseinfo stored in column Responseinfo in table C_Import_Entry_Archive
     * 
     */
    public static final String PROPERTY_RESPONSEINFO = "responseinfo";

    /**
     * Property isnonblocking stored in column Isnonblocking in table C_Import_Entry_Archive<br>
     * Help: {@literal Indicates if an import entry is non blocking. This means its processing is done in a
     *       NonBlocking thread, freeing the ImportEntry thread to process other import entries. For example,
     *       when working with requests, it allows freeing the ImportEntry thread until the response is
     *       received.}
     * 
     */
    public static final String PROPERTY_ISNONBLOCKING = "isnonblocking";


    public ImportEntryArchive() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISNONBLOCKING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ImportEntryArchive#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_IMPORTED
     * 
     */
    public Date getImported() {
        return (Date) get(PROPERTY_IMPORTED);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_IMPORTED
     * 
     */
    public void setImported(Date imported) {
        set(PROPERTY_IMPORTED, imported);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_JSONINFO
     * 
     */
    public String getJsonInfo() {
        return (String) get(PROPERTY_JSONINFO);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_JSONINFO
     * 
     */
    public void setJsonInfo(String jsonInfo) {
        set(PROPERTY_JSONINFO, jsonInfo);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_IMPORTSTATUS
     * 
     */
    public String getImportStatus() {
        return (String) get(PROPERTY_IMPORTSTATUS);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_IMPORTSTATUS
     * 
     */
    public void setImportStatus(String importStatus) {
        set(PROPERTY_IMPORTSTATUS, importStatus);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_TYPEOFDATA
     * 
     */
    public String getTypeofdata() {
        return (String) get(PROPERTY_TYPEOFDATA);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_TYPEOFDATA
     * 
     */
    public void setTypeofdata(String typeofdata) {
        set(PROPERTY_TYPEOFDATA, typeofdata);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_ERRORINFO
     * 
     */
    public String getErrorinfo() {
        return (String) get(PROPERTY_ERRORINFO);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_ERRORINFO
     * 
     */
    public void setErrorinfo(String errorinfo) {
        set(PROPERTY_ERRORINFO, errorinfo);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_ROLE
     * 
     */
    public Role getRole() {
        return (Role) get(PROPERTY_ROLE);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_ROLE
     * 
     */
    public void setRole(Role role) {
        set(PROPERTY_ROLE, role);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_RESPONSEINFO
     * 
     */
    public String getResponseinfo() {
        return (String) get(PROPERTY_RESPONSEINFO);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_RESPONSEINFO
     * 
     */
    public void setResponseinfo(String responseinfo) {
        set(PROPERTY_RESPONSEINFO, responseinfo);
    }

    /**
     * @see ImportEntryArchive#PROPERTY_ISNONBLOCKING
     * 
     */
    public Boolean isNonblocking() {
        return (Boolean) get(PROPERTY_ISNONBLOCKING);
    }
    /**
     * @see ImportEntryArchive#PROPERTY_ISNONBLOCKING
     * 
     */
    public void setNonblocking(Boolean isnonblocking) {
        set(PROPERTY_ISNONBLOCKING, isnonblocking);
    }

}
