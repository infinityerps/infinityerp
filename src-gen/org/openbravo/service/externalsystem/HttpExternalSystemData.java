
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
package org.openbravo.service.externalsystem;

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
 * Entity class for entity C_External_System_Http (stored in table C_External_System_Http).
 * <br>
 * Help: {@literal Allows to define the configuration of a HTTP or HTTPS connection with an external system}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class HttpExternalSystemData extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_External_System_Http";
    public static final String ENTITY_NAME = "C_External_System_Http";

    /**
     * Property id stored in column C_External_System_Http_ID in table C_External_System_Http 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_External_System_Http 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_External_System_Http 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_External_System_Http 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_External_System_Http 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_External_System_Http 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_External_System_Http 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_External_System_Http 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property externalSystem stored in column C_External_System_ID in table C_External_System_Http<br>
     * Help: {@literal Keeps the configuration data that is required to communicate with an external system}
     * 
     */
    public static final String PROPERTY_EXTERNALSYSTEM = "externalSystem";

    /**
     * Property uRL stored in column Url in table C_External_System_Http 
     * 
     */
    public static final String PROPERTY_URL = "uRL";

    /**
     * Property authorizationType stored in column Authorization_Type in table C_External_System_Http<br>
     * Help: {@literal Determine the credentials that must be set in order to access to an HTTP external system
     *       in a secure way}
     * 
     */
    public static final String PROPERTY_AUTHORIZATIONTYPE = "authorizationType";

    /**
     * Property username stored in column Username in table C_External_System_Http<br>
     * Help: {@literal Name that identifies the user in the System}
     * 
     */
    public static final String PROPERTY_USERNAME = "username";

    /**
     * Property password stored in column Password in table C_External_System_Http<br>
     * Help: {@literal The Password indicates the Password for this User Id.  Passwords are required to identify
     *       authorized users.}
     * 
     */
    public static final String PROPERTY_PASSWORD = "password";

    /**
     * Property requestMethod stored in column Request_Method in table C_External_System_Http<br>
     * Help: {@literal The HTTP method used to indicate the desired action to be performed on an external system
     *       resource. Note that this method can be overwritten in the programmatic API used to communicate with
     *       the external system in order to use a different method.}
     * 
     */
    public static final String PROPERTY_REQUESTMETHOD = "requestMethod";

    /**
     * Property timeout stored in column Timeout in table C_External_System_Http<br>
     * Help: {@literal The maximum time in seconds allowed to complete an HTTP request, including the time for
     *       processing the HTTP response.}
     * 
     */
    public static final String PROPERTY_TIMEOUT = "timeout";

    /**
     * Property oauth2ClientIdentifier stored in column Oauth2_Client_Identifier in table C_External_System_Http<br>
     * Help: {@literal This is a unique identifier for the client application that is requesting the access
     *       token. The client ID is typically issued by the OAuth2 service provider when the client application
     *       is registered.}
     * 
     */
    public static final String PROPERTY_OAUTH2CLIENTIDENTIFIER = "oauth2ClientIdentifier";

    /**
     * Property oauth2ClientSecret stored in column Oauth2_Client_Secret in table C_External_System_Http<br>
     * Help: {@literal This is a secret value that is known only to the client application and the OAuth2 service
     *       provider. It is used to authenticate the client application and ensure that only authorized clients
     *       can request access tokens.}
     * 
     */
    public static final String PROPERTY_OAUTH2CLIENTSECRET = "oauth2ClientSecret";

    /**
     * Property oauth2AuthServerUrl stored in column Oauth2_Auth_Server_Url in table C_External_System_Http<br>
     * Help: {@literal This is the URL used in the OAuth 2.0 standard to ask for a new access token. In order to
     *       request this access token, it is mandatory to send the correct Cliend ID and Client Secret values.}
     * 
     */
    public static final String PROPERTY_OAUTH2AUTHSERVERURL = "oauth2AuthServerUrl";


    public HttpExternalSystemData() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_REQUESTMETHOD, "POST");
        setDefaultValue(PROPERTY_TIMEOUT, (long) 10);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_EXTERNALSYSTEM
     * 
     */
    public ExternalSystemData getExternalSystem() {
        return (ExternalSystemData) get(PROPERTY_EXTERNALSYSTEM);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_EXTERNALSYSTEM
     * 
     */
    public void setExternalSystem(ExternalSystemData externalSystem) {
        set(PROPERTY_EXTERNALSYSTEM, externalSystem);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_URL
     * 
     */
    public String getURL() {
        return (String) get(PROPERTY_URL);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_URL
     * 
     */
    public void setURL(String uRL) {
        set(PROPERTY_URL, uRL);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_AUTHORIZATIONTYPE
     * 
     */
    public String getAuthorizationType() {
        return (String) get(PROPERTY_AUTHORIZATIONTYPE);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_AUTHORIZATIONTYPE
     * 
     */
    public void setAuthorizationType(String authorizationType) {
        set(PROPERTY_AUTHORIZATIONTYPE, authorizationType);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_USERNAME
     * 
     */
    public String getUsername() {
        return (String) get(PROPERTY_USERNAME);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_USERNAME
     * 
     */
    public void setUsername(String username) {
        set(PROPERTY_USERNAME, username);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_PASSWORD
     * 
     */
    public String getPassword() {
        return (String) get(PROPERTY_PASSWORD);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_PASSWORD
     * 
     */
    public void setPassword(String password) {
        set(PROPERTY_PASSWORD, password);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_REQUESTMETHOD
     * 
     */
    public String getRequestMethod() {
        return (String) get(PROPERTY_REQUESTMETHOD);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_REQUESTMETHOD
     * 
     */
    public void setRequestMethod(String requestMethod) {
        set(PROPERTY_REQUESTMETHOD, requestMethod);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_TIMEOUT
     * 
     */
    public Long getTimeout() {
        return (Long) get(PROPERTY_TIMEOUT);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_TIMEOUT
     * 
     */
    public void setTimeout(Long timeout) {
        set(PROPERTY_TIMEOUT, timeout);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_OAUTH2CLIENTIDENTIFIER
     * 
     */
    public String getOauth2ClientIdentifier() {
        return (String) get(PROPERTY_OAUTH2CLIENTIDENTIFIER);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_OAUTH2CLIENTIDENTIFIER
     * 
     */
    public void setOauth2ClientIdentifier(String oauth2ClientIdentifier) {
        set(PROPERTY_OAUTH2CLIENTIDENTIFIER, oauth2ClientIdentifier);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_OAUTH2CLIENTSECRET
     * 
     */
    public String getOauth2ClientSecret() {
        return (String) get(PROPERTY_OAUTH2CLIENTSECRET);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_OAUTH2CLIENTSECRET
     * 
     */
    public void setOauth2ClientSecret(String oauth2ClientSecret) {
        set(PROPERTY_OAUTH2CLIENTSECRET, oauth2ClientSecret);
    }

    /**
     * @see HttpExternalSystemData#PROPERTY_OAUTH2AUTHSERVERURL
     * 
     */
    public String getOauth2AuthServerUrl() {
        return (String) get(PROPERTY_OAUTH2AUTHSERVERURL);
    }
    /**
     * @see HttpExternalSystemData#PROPERTY_OAUTH2AUTHSERVERURL
     * 
     */
    public void setOauth2AuthServerUrl(String oauth2AuthServerUrl) {
        set(PROPERTY_OAUTH2AUTHSERVERURL, oauth2AuthServerUrl);
    }

}
