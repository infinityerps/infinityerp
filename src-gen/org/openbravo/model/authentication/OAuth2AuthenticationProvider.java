
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
package org.openbravo.model.authentication;

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
 * Entity class for entity OAuth2AuthenticationProvider (stored in table C_Auth_Provider_Oauth2).
 * <br>
 * Help: {@literal Configuration of an external authentication provider which makes use of the OAuth 2.0.
     *       protocol}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OAuth2AuthenticationProvider extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Auth_Provider_Oauth2";
    public static final String ENTITY_NAME = "OAuth2AuthenticationProvider";

    /**
     * Property id stored in column C_Auth_Provider_Oauth2_ID in table C_Auth_Provider_Oauth2 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Auth_Provider_Oauth2 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Auth_Provider_Oauth2 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Auth_Provider_Oauth2 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Auth_Provider_Oauth2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Auth_Provider_Oauth2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Auth_Provider_Oauth2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Auth_Provider_Oauth2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property authProvider stored in column C_Auth_Provider_ID in table C_Auth_Provider_Oauth2<br>
     * Help: {@literal References a configuration of an external authentication provider. These providers are
     *       used to externalize the verification of credentials to login in the application.}
     * 
     */
    public static final String PROPERTY_AUTHPROVIDER = "authProvider";

    /**
     * Property clientID stored in column Client_Identifier in table C_Auth_Provider_Oauth2 
     * 
     */
    public static final String PROPERTY_CLIENTID = "clientID";

    /**
     * Property clientSecret stored in column Client_Secret in table C_Auth_Provider_Oauth2<br>
     * Help: {@literal A confidential identifier known only to the client application and the OAuth 2.0
     *       authorization server. It is used to authenticate the client application when making requests to the
     *       authorization server to obtain an access token}
     * 
     */
    public static final String PROPERTY_CLIENTSECRET = "clientSecret";

    /**
     * Property authorizationURL stored in column Auth_Server_Url in table C_Auth_Provider_Oauth2<br>
     * Help: {@literal The URL of the server to request for the authentication}
     * 
     */
    public static final String PROPERTY_AUTHORIZATIONURL = "authorizationURL";

    /**
     * Property accessTokenURL stored in column Access_Token_Url in table C_Auth_Provider_Oauth2<br>
     * Help: {@literal The URL to request the OAuth 2.0 access token}
     * 
     */
    public static final String PROPERTY_ACCESSTOKENURL = "accessTokenURL";

    /**
     * Property certificateURL stored in column Certificate_URL in table C_Auth_Provider_Oauth2<br>
     * Help: {@literal The URL where the certificates required for the ID token verification can be requested.
     *       The supported certificate types that can be retrieved through this URL are:
     *         - X.509 in ASCII PEM
     *       format
     *         - JSON Web Key (JWK)
     *       
     *       In both cases the RSA (key type) algorithm is used to extract the
     *       public keys.}
     * 
     */
    public static final String PROPERTY_CERTIFICATEURL = "certificateURL";


    public OAuth2AuthenticationProvider() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_AUTHPROVIDER
     * 
     */
    public AuthenticationProvider getAuthProvider() {
        return (AuthenticationProvider) get(PROPERTY_AUTHPROVIDER);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_AUTHPROVIDER
     * 
     */
    public void setAuthProvider(AuthenticationProvider authProvider) {
        set(PROPERTY_AUTHPROVIDER, authProvider);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CLIENTID
     * 
     */
    public String getClientID() {
        return (String) get(PROPERTY_CLIENTID);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CLIENTID
     * 
     */
    public void setClientID(String clientID) {
        set(PROPERTY_CLIENTID, clientID);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CLIENTSECRET
     * 
     */
    public String getClientSecret() {
        return (String) get(PROPERTY_CLIENTSECRET);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CLIENTSECRET
     * 
     */
    public void setClientSecret(String clientSecret) {
        set(PROPERTY_CLIENTSECRET, clientSecret);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_AUTHORIZATIONURL
     * 
     */
    public String getAuthorizationURL() {
        return (String) get(PROPERTY_AUTHORIZATIONURL);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_AUTHORIZATIONURL
     * 
     */
    public void setAuthorizationURL(String authorizationURL) {
        set(PROPERTY_AUTHORIZATIONURL, authorizationURL);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ACCESSTOKENURL
     * 
     */
    public String getAccessTokenURL() {
        return (String) get(PROPERTY_ACCESSTOKENURL);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_ACCESSTOKENURL
     * 
     */
    public void setAccessTokenURL(String accessTokenURL) {
        set(PROPERTY_ACCESSTOKENURL, accessTokenURL);
    }

    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CERTIFICATEURL
     * 
     */
    public String getCertificateURL() {
        return (String) get(PROPERTY_CERTIFICATEURL);
    }
    /**
     * @see OAuth2AuthenticationProvider#PROPERTY_CERTIFICATEURL
     * 
     */
    public void setCertificateURL(String certificateURL) {
        set(PROPERTY_CERTIFICATEURL, certificateURL);
    }

}
