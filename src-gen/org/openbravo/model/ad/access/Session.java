
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
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADSession (stored in table AD_Session).
 * <br>
 * Help: {@literal History of Online or Web Sessions}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Session extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Session";
    public static final String ENTITY_NAME = "ADSession";

    /**
     * Property id stored in column AD_Session_ID in table AD_Session<br>
     * Help: {@literal Online or Web Session Information}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Session 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Session 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Session 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Session 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Session 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Session 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Session 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property webSession stored in column WebSession in table AD_Session<br>
     * Help: {@literal Identifier assigned to the session by the Servlet Container (Tomcat).}
     * 
     */
    public static final String PROPERTY_WEBSESSION = "webSession";

    /**
     * Property remoteAddress stored in column Remote_Addr in table AD_Session<br>
     * Help: {@literal The Remote Address indicates an alternative or external address.}
     * 
     */
    public static final String PROPERTY_REMOTEADDRESS = "remoteAddress";

    /**
     * Property remoteHost stored in column Remote_Host in table AD_Session<br>
     * Help: {@literal Remote Host}
     * 
     */
    public static final String PROPERTY_REMOTEHOST = "remoteHost";

    /**
     * Property processed stored in column Processed in table AD_Session<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property sessionActive stored in column Session_Active in table AD_Session<br>
     * Help: {@literal Session Active indicates whether the session is currently active or not.}
     * 
     */
    public static final String PROPERTY_SESSIONACTIVE = "sessionActive";

    /**
     * Property serverUrl stored in column Server_Url in table AD_Session<br>
     * Help: {@literal URL for the context the session is in}
     * 
     */
    public static final String PROPERTY_SERVERURL = "serverUrl";

    /**
     * Property lastPing stored in column Last_Session_Ping in table AD_Session<br>
     * Help: {@literal Stores the last time the session made ping through the UI. In this way it is possible to
     *       determine whether the browser was closed without doing log out.}
     * 
     */
    public static final String PROPERTY_LASTPING = "lastPing";

    /**
     * Property username stored in column Username in table AD_Session<br>
     * Help: {@literal Name that identifies the user in the System}
     * 
     */
    public static final String PROPERTY_USERNAME = "username";

    /**
     * Property loginStatus stored in column Login_Status in table AD_Session<br>
     * Help: {@literal Maintains the status for the log in. It determines whether there was any error in the log
     *       in.}
     * 
     */
    public static final String PROPERTY_LOGINSTATUS = "loginStatus";


    public Session() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_SESSIONACTIVE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Session#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Session#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Session#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Session#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Session#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Session#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Session#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Session#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Session#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Session#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Session#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Session#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Session#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Session#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Session#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Session#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Session#PROPERTY_WEBSESSION
     * 
     */
    public String getWebSession() {
        return (String) get(PROPERTY_WEBSESSION);
    }
    /**
     * @see Session#PROPERTY_WEBSESSION
     * 
     */
    public void setWebSession(String webSession) {
        set(PROPERTY_WEBSESSION, webSession);
    }

    /**
     * @see Session#PROPERTY_REMOTEADDRESS
     * 
     */
    public String getRemoteAddress() {
        return (String) get(PROPERTY_REMOTEADDRESS);
    }
    /**
     * @see Session#PROPERTY_REMOTEADDRESS
     * 
     */
    public void setRemoteAddress(String remoteAddress) {
        set(PROPERTY_REMOTEADDRESS, remoteAddress);
    }

    /**
     * @see Session#PROPERTY_REMOTEHOST
     * 
     */
    public String getRemoteHost() {
        return (String) get(PROPERTY_REMOTEHOST);
    }
    /**
     * @see Session#PROPERTY_REMOTEHOST
     * 
     */
    public void setRemoteHost(String remoteHost) {
        set(PROPERTY_REMOTEHOST, remoteHost);
    }

    /**
     * @see Session#PROPERTY_PROCESSED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see Session#PROPERTY_PROCESSED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see Session#PROPERTY_SESSIONACTIVE
     * 
     */
    public Boolean isSessionActive() {
        return (Boolean) get(PROPERTY_SESSIONACTIVE);
    }
    /**
     * @see Session#PROPERTY_SESSIONACTIVE
     * 
     */
    public void setSessionActive(Boolean sessionActive) {
        set(PROPERTY_SESSIONACTIVE, sessionActive);
    }

    /**
     * @see Session#PROPERTY_SERVERURL
     * 
     */
    public String getServerUrl() {
        return (String) get(PROPERTY_SERVERURL);
    }
    /**
     * @see Session#PROPERTY_SERVERURL
     * 
     */
    public void setServerUrl(String serverUrl) {
        set(PROPERTY_SERVERURL, serverUrl);
    }

    /**
     * @see Session#PROPERTY_LASTPING
     * 
     */
    public Date getLastPing() {
        return (Date) get(PROPERTY_LASTPING);
    }
    /**
     * @see Session#PROPERTY_LASTPING
     * 
     */
    public void setLastPing(Date lastPing) {
        set(PROPERTY_LASTPING, lastPing);
    }

    /**
     * @see Session#PROPERTY_USERNAME
     * 
     */
    public String getUsername() {
        return (String) get(PROPERTY_USERNAME);
    }
    /**
     * @see Session#PROPERTY_USERNAME
     * 
     */
    public void setUsername(String username) {
        set(PROPERTY_USERNAME, username);
    }

    /**
     * @see Session#PROPERTY_LOGINSTATUS
     * 
     */
    public String getLoginStatus() {
        return (String) get(PROPERTY_LOGINSTATUS);
    }
    /**
     * @see Session#PROPERTY_LOGINSTATUS
     * 
     */
    public void setLoginStatus(String loginStatus) {
        set(PROPERTY_LOGINSTATUS, loginStatus);
    }

}
