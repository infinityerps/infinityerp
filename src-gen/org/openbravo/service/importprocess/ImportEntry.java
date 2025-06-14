
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
 * Entity class for entity C_IMPORT_ENTRY (stored in table C_IMPORT_ENTRY).
 * <br>
 * Help: {@literal The queue for data which needs to be imported}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ImportEntry extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_IMPORT_ENTRY";
    public static final String ENTITY_NAME = "C_IMPORT_ENTRY";

    /**
     * Property id stored in column C_IMPORT_ENTRY_ID in table C_IMPORT_ENTRY 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_IMPORT_ENTRY 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_IMPORT_ENTRY 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_IMPORT_ENTRY 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_IMPORT_ENTRY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_IMPORT_ENTRY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_IMPORT_ENTRY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_IMPORT_ENTRY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property imported stored in column Imported in table C_IMPORT_ENTRY
     * 
     */
    public static final String PROPERTY_IMPORTED = "imported";

    /**
     * Property jsonInfo stored in column Jsoninfo in table C_IMPORT_ENTRY
     * 
     */
    public static final String PROPERTY_JSONINFO = "jsonInfo";

    /**
     * Property importStatus stored in column ImportStatus in table C_IMPORT_ENTRY
     * 
     */
    public static final String PROPERTY_IMPORTSTATUS = "importStatus";

    /**
     * Property typeofdata stored in column Typeofdata in table C_IMPORT_ENTRY 
     * 
     */
    public static final String PROPERTY_TYPEOFDATA = "typeofdata";

    /**
     * Property errorinfo stored in column Errorinfo in table C_IMPORT_ENTRY
     * 
     */
    public static final String PROPERTY_ERRORINFO = "errorinfo";

    /**
     * Property role stored in column AD_Role_ID in table C_IMPORT_ENTRY<br>
     * Help: {@literal The Role determines security and access a user who has this Role will have in the System.}
     * 
     */
    public static final String PROPERTY_ROLE = "role";

    /**
     * Property createdtimestamp stored in column Createdtimestamp in table C_IMPORT_ENTRY
     * 
     */
    public static final String PROPERTY_CREATEDTIMESTAMP = "createdtimestamp";

    /**
     * Property responseinfo stored in column Responseinfo in table C_IMPORT_ENTRY
     * 
     */
    public static final String PROPERTY_RESPONSEINFO = "responseinfo";

    /**
     * Property isnonblocking stored in column Isnonblocking in table C_IMPORT_ENTRY<br>
     * Help: {@literal Indicates if an import entry is non blocking. This means its processing is done in a
     *       NonBlocking thread, freeing the ImportEntry thread to process other import entries. For example,
     *       when working with requests, it allows freeing the ImportEntry thread until the response is
     *       received.}
     * 
     */
    public static final String PROPERTY_ISNONBLOCKING = "isnonblocking";


    public ImportEntry() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISNONBLOCKING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ImportEntry#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ImportEntry#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ImportEntry#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ImportEntry#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ImportEntry#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ImportEntry#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ImportEntry#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ImportEntry#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ImportEntry#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ImportEntry#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ImportEntry#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ImportEntry#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ImportEntry#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ImportEntry#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ImportEntry#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ImportEntry#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ImportEntry#PROPERTY_IMPORTED
     * 
     */
    public Date getImported() {
        return (Date) get(PROPERTY_IMPORTED);
    }
    /**
     * @see ImportEntry#PROPERTY_IMPORTED
     * 
     */
    public void setImported(Date imported) {
        set(PROPERTY_IMPORTED, imported);
    }

    /**
     * @see ImportEntry#PROPERTY_JSONINFO
     * 
     */
    public String getJsonInfo() {
        return (String) get(PROPERTY_JSONINFO);
    }
    /**
     * @see ImportEntry#PROPERTY_JSONINFO
     * 
     */
    public void setJsonInfo(String jsonInfo) {
        set(PROPERTY_JSONINFO, jsonInfo);
    }

    /**
     * @see ImportEntry#PROPERTY_IMPORTSTATUS
     * 
     */
    public String getImportStatus() {
        return (String) get(PROPERTY_IMPORTSTATUS);
    }
    /**
     * @see ImportEntry#PROPERTY_IMPORTSTATUS
     * 
     */
    public void setImportStatus(String importStatus) {
        set(PROPERTY_IMPORTSTATUS, importStatus);
    }

    /**
     * @see ImportEntry#PROPERTY_TYPEOFDATA
     * 
     */
    public String getTypeofdata() {
        return (String) get(PROPERTY_TYPEOFDATA);
    }
    /**
     * @see ImportEntry#PROPERTY_TYPEOFDATA
     * 
     */
    public void setTypeofdata(String typeofdata) {
        set(PROPERTY_TYPEOFDATA, typeofdata);
    }

    /**
     * @see ImportEntry#PROPERTY_ERRORINFO
     * 
     */
    public String getErrorinfo() {
        return (String) get(PROPERTY_ERRORINFO);
    }
    /**
     * @see ImportEntry#PROPERTY_ERRORINFO
     * 
     */
    public void setErrorinfo(String errorinfo) {
        set(PROPERTY_ERRORINFO, errorinfo);
    }

    /**
     * @see ImportEntry#PROPERTY_ROLE
     * 
     */
    public Role getRole() {
        return (Role) get(PROPERTY_ROLE);
    }
    /**
     * @see ImportEntry#PROPERTY_ROLE
     * 
     */
    public void setRole(Role role) {
        set(PROPERTY_ROLE, role);
    }

    /**
     * @see ImportEntry#PROPERTY_CREATEDTIMESTAMP
     * 
     */
    public Long getCreatedtimestamp() {
        return (Long) get(PROPERTY_CREATEDTIMESTAMP);
    }
    /**
     * @see ImportEntry#PROPERTY_CREATEDTIMESTAMP
     * 
     */
    public void setCreatedtimestamp(Long createdtimestamp) {
        set(PROPERTY_CREATEDTIMESTAMP, createdtimestamp);
    }

    /**
     * @see ImportEntry#PROPERTY_RESPONSEINFO
     * 
     */
    public String getResponseinfo() {
        return (String) get(PROPERTY_RESPONSEINFO);
    }
    /**
     * @see ImportEntry#PROPERTY_RESPONSEINFO
     * 
     */
    public void setResponseinfo(String responseinfo) {
        set(PROPERTY_RESPONSEINFO, responseinfo);
    }

    /**
     * @see ImportEntry#PROPERTY_ISNONBLOCKING
     * 
     */
    public Boolean isNonblocking() {
        return (Boolean) get(PROPERTY_ISNONBLOCKING);
    }
    /**
     * @see ImportEntry#PROPERTY_ISNONBLOCKING
     * 
     */
    public void setNonblocking(Boolean isnonblocking) {
        set(PROPERTY_ISNONBLOCKING, isnonblocking);
    }

}
