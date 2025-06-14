
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
package org.openbravo.model.ad.access;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADSessionUsageAudit (stored in table AD_Session_Usage_Audit).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class SessionUsageAudit extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Session_Usage_Audit";
    public static final String ENTITY_NAME = "ADSessionUsageAudit";

    /**
     * Property id stored in column AD_Session_Usage_Audit_ID in table AD_Session_Usage_Audit 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Session_Usage_Audit 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Session_Usage_Audit 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Session_Usage_Audit 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Session_Usage_Audit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Session_Usage_Audit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Session_Usage_Audit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Session_Usage_Audit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property session stored in column AD_Session_ID in table AD_Session_Usage_Audit<br>
     * Help: {@literal Online or Web Session Information}
     * 
     */
    public static final String PROPERTY_SESSION = "session";

    /**
     * Property object stored in column Object_ID in table AD_Session_Usage_Audit<br>
     * Help: {@literal Id of the object that has been requested.}
     * 
     */
    public static final String PROPERTY_OBJECT = "object";

    /**
     * Property module stored in column AD_Module_ID in table AD_Session_Usage_Audit 
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property command stored in column Command in table AD_Session_Usage_Audit<br>
     * Help: {@literal Value of the Command parameter of the request}
     * 
     */
    public static final String PROPERTY_COMMAND = "command";

    /**
     * Property javaClassName stored in column Classname in table AD_Session_Usage_Audit 
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property objectType stored in column Object_Type in table AD_Session_Usage_Audit
     * 
     */
    public static final String PROPERTY_OBJECTTYPE = "objectType";

    /**
     * Property processTime stored in column Process_Time in table AD_Session_Usage_Audit<br>
     * Help: {@literal Amount of time in milliseconds the process took to execute.}
     * 
     */
    public static final String PROPERTY_PROCESSTIME = "processTime";


    public SessionUsageAudit() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see SessionUsageAudit#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_SESSION
     * 
     */
    public Session getSession() {
        return (Session) get(PROPERTY_SESSION);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_SESSION
     * 
     */
    public void setSession(Session session) {
        set(PROPERTY_SESSION, session);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_OBJECT
     * 
     */
    public String getObject() {
        return (String) get(PROPERTY_OBJECT);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_OBJECT
     * 
     */
    public void setObject(String object) {
        set(PROPERTY_OBJECT, object);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_COMMAND
     * 
     */
    public String getCommand() {
        return (String) get(PROPERTY_COMMAND);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_COMMAND
     * 
     */
    public void setCommand(String command) {
        set(PROPERTY_COMMAND, command);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_OBJECTTYPE
     * 
     */
    public String getObjectType() {
        return (String) get(PROPERTY_OBJECTTYPE);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_OBJECTTYPE
     * 
     */
    public void setObjectType(String objectType) {
        set(PROPERTY_OBJECTTYPE, objectType);
    }

    /**
     * @see SessionUsageAudit#PROPERTY_PROCESSTIME
     * 
     */
    public Long getProcessTime() {
        return (Long) get(PROPERTY_PROCESSTIME);
    }
    /**
     * @see SessionUsageAudit#PROPERTY_PROCESSTIME
     * 
     */
    public void setProcessTime(Long processTime) {
        set(PROPERTY_PROCESSTIME, processTime);
    }

}
