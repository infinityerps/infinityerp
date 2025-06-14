
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Application;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity AuthenticationProvider (stored in table C_Auth_Provider).
 * <br>
 * Help: {@literal Configuration of an external authentication provider. These providers are used to
     *       externalize the verification of credentials to login in the application.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AuthenticationProvider extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Auth_Provider";
    public static final String ENTITY_NAME = "AuthenticationProvider";

    /**
     * Property id stored in column C_Auth_Provider_ID in table C_Auth_Provider<br>
     * Help: {@literal References a configuration of an external authentication provider. These providers are
     *       used to externalize the verification of credentials to login in the application.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Auth_Provider 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Auth_Provider 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Auth_Provider 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Auth_Provider 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Auth_Provider 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Auth_Provider 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Auth_Provider 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Auth_Provider 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property type stored in column Type in table C_Auth_Provider<br>
     * Help: {@literal The Type indicates the type of validation that will occur.  This can be SQL, Java Script
     *       or Java Language.}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property description stored in column Description in table C_Auth_Provider<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property icon stored in column AD_Image_ID in table C_Auth_Provider<br>
     * Help: {@literal A visual picture used to describe an item}
     * 
     */
    public static final String PROPERTY_ICON = "icon";

    /**
     * Property sequenceNumber stored in column Seqno in table C_Auth_Provider<br>
     * Help: {@literal The grid configuration which has the highest sequence number will be the one which
     *       applies.}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property application stored in column AD_Application_ID in table C_Auth_Provider<br>
     * Help: {@literal An entity which represents an application which use Openbravo as a base}
     * 
     */
    public static final String PROPERTY_APPLICATION = "application";

    /**
     * Property flow stored in column Flow in table C_Auth_Provider<br>
     * Help: {@literal Defines the flow where an authentication provider can be used}
     * 
     */
    public static final String PROPERTY_FLOW = "flow";

    /**
     * Property oAuth2AuthenticationProviderList stored in table C_Auth_Provider
     * 
     */
    public static final String PROPERTY_OAUTH2AUTHENTICATIONPROVIDERLIST = "oAuth2AuthenticationProviderList";


    public AuthenticationProvider() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FLOW, "LOGIN");
        setDefaultValue(PROPERTY_OAUTH2AUTHENTICATIONPROVIDERLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AuthenticationProvider#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_ICON
     * 
     */
    public Image getIcon() {
        return (Image) get(PROPERTY_ICON);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_ICON
     * 
     */
    public void setIcon(Image icon) {
        set(PROPERTY_ICON, icon);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_APPLICATION
     * 
     */
    public Application getApplication() {
        return (Application) get(PROPERTY_APPLICATION);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_APPLICATION
     * 
     */
    public void setApplication(Application application) {
        set(PROPERTY_APPLICATION, application);
    }

    /**
     * @see AuthenticationProvider#PROPERTY_FLOW
     * 
     */
    public String getFlow() {
        return (String) get(PROPERTY_FLOW);
    }
    /**
     * @see AuthenticationProvider#PROPERTY_FLOW
     * 
     */
    public void setFlow(String flow) {
        set(PROPERTY_FLOW, flow);
    }

    /**
     * Help: {@literal Configuration of an external authentication provider which makes use of the OAuth 2.0.
     *       protocol}<br>
     * @see OAuth2AuthenticationProvider
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OAuth2AuthenticationProvider> getOAuth2AuthenticationProviderList() {
      return (List<OAuth2AuthenticationProvider>) get(PROPERTY_OAUTH2AUTHENTICATIONPROVIDERLIST);
    }

    /**
     * Help: {@literal Configuration of an external authentication provider which makes use of the OAuth 2.0.
     *       protocol}<br>
     * @see OAuth2AuthenticationProvider
     * 
     */
    public void setOAuth2AuthenticationProviderList(List<OAuth2AuthenticationProvider> oAuth2AuthenticationProviderList) {
        set(PROPERTY_OAUTH2AUTHENTICATIONPROVIDERLIST, oAuth2AuthenticationProviderList);
    }

}
