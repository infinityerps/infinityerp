
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.system.Language;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Greeting;
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.pos.ExternalPOS;
import org.openbravo.service.integration.openid.OBSOIDUserIdentifier;
/**
 * Entity class for entity ADUser (stored in table AD_User).
 * <br>
 * Help: {@literal The User Tab defines the log in for Users who have access to the system.
     *       The User
     *       identifies a unique user in the system. This could be an internal user or a business partner
     *       contact}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class User extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_User";
    public static final String ENTITY_NAME = "ADUser";

    /**
     * Property id stored in column AD_User_ID in table AD_User<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_User 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_User 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_User 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_User 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_User 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_User 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_User 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_User 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_User<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property password stored in column Password in table AD_User<br>
     * Help: {@literal The Password indicates the Password for this User Id.  Passwords are required to identify
     *       authorized users.}
     * 
     */
    public static final String PROPERTY_PASSWORD = "password";

    /**
     * Property email stored in column Email in table AD_User<br>
     * Help: The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g.
     *       joe.smith&#64;company.com).
     * 
     */
    public static final String PROPERTY_EMAIL = "email";

    /**
     * Property supervisor stored in column Supervisor_ID in table AD_User<br>
     * Help: {@literal The Supervisor indicates who will be used for forwarding and escalating issues for this
     *       user.}
     * 
     */
    public static final String PROPERTY_SUPERVISOR = "supervisor";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table AD_User<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property processNow stored in column Processing in table AD_User<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property emailServerUsername stored in column EmailUser in table AD_User<br>
     * Help: The user name in the mail system is usually the string before the &#64; of your email address. 
     *       Required if the mail server requires authentification to send emails.
     * 
     */
    public static final String PROPERTY_EMAILSERVERUSERNAME = "emailServerUsername";

    /**
     * Property emailServerPassword stored in column EmailUserPW in table AD_User<br>
     * Help: {@literal Required if the mail server requires authentification to send emails.}
     * 
     */
    public static final String PROPERTY_EMAILSERVERPASSWORD = "emailServerPassword";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table AD_User<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property greeting stored in column C_Greeting_ID in table AD_User<br>
     * Help: {@literal The Greeting identifies the greeting to print on correspondence.}
     * 
     */
    public static final String PROPERTY_GREETING = "greeting";

    /**
     * Property position stored in column Title in table AD_User<br>
     * Help: {@literal The Title indicates the name that an entity is referred to as.}
     * 
     */
    public static final String PROPERTY_POSITION = "position";

    /**
     * Property comments stored in column Comments in table AD_User<br>
     * Help: {@literal The Comments field allows for free form entry of additional information.}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property phone stored in column Phone in table AD_User<br>
     * Help: {@literal The Phone field identifies a telephone number}
     * 
     */
    public static final String PROPERTY_PHONE = "phone";

    /**
     * Property alternativePhone stored in column Phone2 in table AD_User<br>
     * Help: {@literal The 2nd Phone field identifies an alternate telephone number.}
     * 
     */
    public static final String PROPERTY_ALTERNATIVEPHONE = "alternativePhone";

    /**
     * Property fax stored in column Fax in table AD_User<br>
     * Help: {@literal The Fax identifies a facsimile number for this Business Partner or  Location}
     * 
     */
    public static final String PROPERTY_FAX = "fax";

    /**
     * Property lastContactDate stored in column LastContact in table AD_User<br>
     * Help: {@literal The Last Contact indicates the date that this Business Partner Contact was last
     *       contacted.}
     * 
     */
    public static final String PROPERTY_LASTCONTACTDATE = "lastContactDate";

    /**
     * Property lastContactResult stored in column LastResult in table AD_User<br>
     * Help: {@literal The Last Result identifies the result of the last contact made.}
     * 
     */
    public static final String PROPERTY_LASTCONTACTRESULT = "lastContactResult";

    /**
     * Property birthday stored in column Birthday in table AD_User<br>
     * Help: {@literal Birthdate or Anniversary day}
     * 
     */
    public static final String PROPERTY_BIRTHDAY = "birthday";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table AD_User<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property firstName stored in column Firstname in table AD_User<br>
     * Help: {@literal First Name of the contact}
     * 
     */
    public static final String PROPERTY_FIRSTNAME = "firstName";

    /**
     * Property lastName stored in column Lastname in table AD_User<br>
     * Help: {@literal Last name of the contact}
     * 
     */
    public static final String PROPERTY_LASTNAME = "lastName";

    /**
     * Property username stored in column UserName in table AD_User<br>
     * Help: {@literal Name that identifies the user in the System}
     * 
     */
    public static final String PROPERTY_USERNAME = "username";

    /**
     * Property defaultClient stored in column Default_Ad_Client_ID in table AD_User<br>
     * Help: {@literal Client that user will use by default when is logged}
     * 
     */
    public static final String PROPERTY_DEFAULTCLIENT = "defaultClient";

    /**
     * Property defaultLanguage stored in column Default_Ad_Language in table AD_User<br>
     * Help: {@literal Default language of the user interface upon log in of the current user.}
     * 
     */
    public static final String PROPERTY_DEFAULTLANGUAGE = "defaultLanguage";

    /**
     * Property defaultOrganization stored in column Default_Ad_Org_ID in table AD_User<br>
     * Help: {@literal Default organization that will be used when entering new transactions (eg. creating a new
     *       sales order).}
     * 
     */
    public static final String PROPERTY_DEFAULTORGANIZATION = "defaultOrganization";

    /**
     * Property defaultRole stored in column Default_Ad_Role_ID in table AD_User<br>
     * Help: {@literal Default role applied when this user logs in (only the ones applicable to the user are
     *       shown).}
     * 
     */
    public static final String PROPERTY_DEFAULTROLE = "defaultRole";

    /**
     * Property defaultWarehouse stored in column Default_M_Warehouse_ID in table AD_User<br>
     * Help: {@literal Default warehouse that will be used within transactions that require warehouse movements.}
     * 
     */
    public static final String PROPERTY_DEFAULTWAREHOUSE = "defaultWarehouse";

    /**
     * Property locked stored in column IsLocked in table AD_User<br>
     * Help: {@literal The user is locked and cannot log in the application. This field can be manually set or
     *       automatically if login.trial.user.lock property is configured in Openbravo.properties file and there
     *       has been that number of failed log in attempts.}
     * 
     */
    public static final String PROPERTY_LOCKED = "locked";

    /**
     * Property image stored in column AD_Image_ID in table AD_User<br>
     * Help: {@literal Defines a system image}
     * 
     */
    public static final String PROPERTY_IMAGE = "image";

    /**
     * Property grantPortalAccess stored in column Grant_Portal_Access in table AD_User<br>
     * Help: {@literal Grants to this user access to one of the available portal roles and resets the password
     *       for this user.}
     * 
     */
    public static final String PROPERTY_GRANTPORTALACCESS = "grantPortalAccess";

    /**
     * Property lastPasswordUpdate stored in column LastPasswordUpdate in table AD_User<br>
     * Help: {@literal Latest date of user password change}
     * 
     */
    public static final String PROPERTY_LASTPASSWORDUPDATE = "lastPasswordUpdate";

    /**
     * Property isPasswordExpired stored in column Isexpiredpassword in table AD_User<br>
     * Help: {@literal If checked, the user will have to change his password. By default, this checkbox is
     *       unchecked.}
     * 
     */
    public static final String PROPERTY_ISPASSWORDEXPIRED = "isPasswordExpired";

    /**
     * Property commercialauth stored in column Commercialauth in table AD_User<br>
     * Help: {@literal This field show whether customer wants or does not want to receive commercial information
     *       from the organization}
     * 
     */
    public static final String PROPERTY_COMMERCIALAUTH = "commercialauth";

    /**
     * Property viasms stored in column Viasms in table AD_User<br>
     * Help: {@literal This field defines the default value for the Via SMS check in Web POS Customer Creation}
     * 
     */
    public static final String PROPERTY_VIASMS = "viasms";

    /**
     * Property viaemail stored in column Viaemail in table AD_User<br>
     * Help: {@literal This field defines the default value for the Via Mail check in Web POS Customer Creation}
     * 
     */
    public static final String PROPERTY_VIAEMAIL = "viaemail";

    /**
     * Property updatePassword stored in column Update_Password in table AD_User
     * 
     */
    public static final String PROPERTY_UPDATEPASSWORD = "updatePassword";

    /**
     * Property isSalesRepresentative stored in column Issalesrep in table AD_User<br>
     * Help: {@literal The Sales Rep checkbox indicates if this employee is also a sales representative.}
     * 
     */
    public static final String PROPERTY_ISSALESREPRESENTATIVE = "isSalesRepresentative";

    /**
     * Property isssoonly stored in column Isssoonly in table AD_User<br>
     * Help: {@literal If this field is checked, the user will only be able to be authorized by using SSO}
     * 
     */
    public static final String PROPERTY_ISSSOONLY = "isssoonly";

    /**
     * Property aDUserRolesList stored in table AD_User
     * 
     */
    public static final String PROPERTY_ADUSERROLESLIST = "aDUserRolesList";

    /**
     * Property externalPOSSalesRepresentativeList stored in table AD_User
     * 
     */
    public static final String PROPERTY_EXTERNALPOSSALESREPRESENTATIVELIST = "externalPOSSalesRepresentativeList";

    /**
     * Property oBSOIDUserIdentifierList stored in table AD_User
     * 
     */
    public static final String PROPERTY_OBSOIDUSERIDENTIFIERLIST = "oBSOIDUserIdentifierList";


    public User() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_LOCKED, false);
        setDefaultValue(PROPERTY_GRANTPORTALACCESS, false);
        setDefaultValue(PROPERTY_ISPASSWORDEXPIRED, false);
        setDefaultValue(PROPERTY_COMMERCIALAUTH, false);
        setDefaultValue(PROPERTY_VIASMS, false);
        setDefaultValue(PROPERTY_VIAEMAIL, false);
        setDefaultValue(PROPERTY_UPDATEPASSWORD, false);
        setDefaultValue(PROPERTY_ISSALESREPRESENTATIVE, false);
        setDefaultValue(PROPERTY_ISSSOONLY, false);
        setDefaultValue(PROPERTY_ADUSERROLESLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EXTERNALPOSSALESREPRESENTATIVELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBSOIDUSERIDENTIFIERLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see User#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see User#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see User#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see User#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see User#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see User#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see User#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see User#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see User#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see User#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see User#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see User#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see User#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see User#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see User#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see User#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see User#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see User#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see User#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see User#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see User#PROPERTY_PASSWORD
     * 
     */
    public String getPassword() {
        return (String) get(PROPERTY_PASSWORD);
    }
    /**
     * @see User#PROPERTY_PASSWORD
     * 
     */
    public void setPassword(String password) {
        set(PROPERTY_PASSWORD, password);
    }

    /**
     * @see User#PROPERTY_EMAIL
     * 
     */
    public String getEmail() {
        return (String) get(PROPERTY_EMAIL);
    }
    /**
     * @see User#PROPERTY_EMAIL
     * 
     */
    public void setEmail(String email) {
        set(PROPERTY_EMAIL, email);
    }

    /**
     * @see User#PROPERTY_SUPERVISOR
     * 
     */
    public User getSupervisor() {
        return (User) get(PROPERTY_SUPERVISOR);
    }
    /**
     * @see User#PROPERTY_SUPERVISOR
     * 
     */
    public void setSupervisor(User supervisor) {
        set(PROPERTY_SUPERVISOR, supervisor);
    }

    /**
     * @see User#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see User#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see User#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see User#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see User#PROPERTY_EMAILSERVERUSERNAME
     * 
     */
    public String getEmailServerUsername() {
        return (String) get(PROPERTY_EMAILSERVERUSERNAME);
    }
    /**
     * @see User#PROPERTY_EMAILSERVERUSERNAME
     * 
     */
    public void setEmailServerUsername(String emailServerUsername) {
        set(PROPERTY_EMAILSERVERUSERNAME, emailServerUsername);
    }

    /**
     * @see User#PROPERTY_EMAILSERVERPASSWORD
     * 
     */
    public String getEmailServerPassword() {
        return (String) get(PROPERTY_EMAILSERVERPASSWORD);
    }
    /**
     * @see User#PROPERTY_EMAILSERVERPASSWORD
     * 
     */
    public void setEmailServerPassword(String emailServerPassword) {
        set(PROPERTY_EMAILSERVERPASSWORD, emailServerPassword);
    }

    /**
     * @see User#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see User#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see User#PROPERTY_GREETING
     * 
     */
    public Greeting getGreeting() {
        return (Greeting) get(PROPERTY_GREETING);
    }
    /**
     * @see User#PROPERTY_GREETING
     * 
     */
    public void setGreeting(Greeting greeting) {
        set(PROPERTY_GREETING, greeting);
    }

    /**
     * @see User#PROPERTY_POSITION
     * 
     */
    public String getPosition() {
        return (String) get(PROPERTY_POSITION);
    }
    /**
     * @see User#PROPERTY_POSITION
     * 
     */
    public void setPosition(String position) {
        set(PROPERTY_POSITION, position);
    }

    /**
     * @see User#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see User#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see User#PROPERTY_PHONE
     * 
     */
    public String getPhone() {
        return (String) get(PROPERTY_PHONE);
    }
    /**
     * @see User#PROPERTY_PHONE
     * 
     */
    public void setPhone(String phone) {
        set(PROPERTY_PHONE, phone);
    }

    /**
     * @see User#PROPERTY_ALTERNATIVEPHONE
     * 
     */
    public String getAlternativePhone() {
        return (String) get(PROPERTY_ALTERNATIVEPHONE);
    }
    /**
     * @see User#PROPERTY_ALTERNATIVEPHONE
     * 
     */
    public void setAlternativePhone(String alternativePhone) {
        set(PROPERTY_ALTERNATIVEPHONE, alternativePhone);
    }

    /**
     * @see User#PROPERTY_FAX
     * 
     */
    public String getFax() {
        return (String) get(PROPERTY_FAX);
    }
    /**
     * @see User#PROPERTY_FAX
     * 
     */
    public void setFax(String fax) {
        set(PROPERTY_FAX, fax);
    }

    /**
     * @see User#PROPERTY_LASTCONTACTDATE
     * 
     */
    public Date getLastContactDate() {
        return (Date) get(PROPERTY_LASTCONTACTDATE);
    }
    /**
     * @see User#PROPERTY_LASTCONTACTDATE
     * 
     */
    public void setLastContactDate(Date lastContactDate) {
        set(PROPERTY_LASTCONTACTDATE, lastContactDate);
    }

    /**
     * @see User#PROPERTY_LASTCONTACTRESULT
     * 
     */
    public String getLastContactResult() {
        return (String) get(PROPERTY_LASTCONTACTRESULT);
    }
    /**
     * @see User#PROPERTY_LASTCONTACTRESULT
     * 
     */
    public void setLastContactResult(String lastContactResult) {
        set(PROPERTY_LASTCONTACTRESULT, lastContactResult);
    }

    /**
     * @see User#PROPERTY_BIRTHDAY
     * 
     */
    public Date getBirthday() {
        return (Date) get(PROPERTY_BIRTHDAY);
    }
    /**
     * @see User#PROPERTY_BIRTHDAY
     * 
     */
    public void setBirthday(Date birthday) {
        set(PROPERTY_BIRTHDAY, birthday);
    }

    /**
     * @see User#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see User#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see User#PROPERTY_FIRSTNAME
     * 
     */
    public String getFirstName() {
        return (String) get(PROPERTY_FIRSTNAME);
    }
    /**
     * @see User#PROPERTY_FIRSTNAME
     * 
     */
    public void setFirstName(String firstName) {
        set(PROPERTY_FIRSTNAME, firstName);
    }

    /**
     * @see User#PROPERTY_LASTNAME
     * 
     */
    public String getLastName() {
        return (String) get(PROPERTY_LASTNAME);
    }
    /**
     * @see User#PROPERTY_LASTNAME
     * 
     */
    public void setLastName(String lastName) {
        set(PROPERTY_LASTNAME, lastName);
    }

    /**
     * @see User#PROPERTY_USERNAME
     * 
     */
    public String getUsername() {
        return (String) get(PROPERTY_USERNAME);
    }
    /**
     * @see User#PROPERTY_USERNAME
     * 
     */
    public void setUsername(String username) {
        set(PROPERTY_USERNAME, username);
    }

    /**
     * @see User#PROPERTY_DEFAULTCLIENT
     * 
     */
    public Client getDefaultClient() {
        return (Client) get(PROPERTY_DEFAULTCLIENT);
    }
    /**
     * @see User#PROPERTY_DEFAULTCLIENT
     * 
     */
    public void setDefaultClient(Client defaultClient) {
        set(PROPERTY_DEFAULTCLIENT, defaultClient);
    }

    /**
     * @see User#PROPERTY_DEFAULTLANGUAGE
     * 
     */
    public Language getDefaultLanguage() {
        return (Language) get(PROPERTY_DEFAULTLANGUAGE);
    }
    /**
     * @see User#PROPERTY_DEFAULTLANGUAGE
     * 
     */
    public void setDefaultLanguage(Language defaultLanguage) {
        set(PROPERTY_DEFAULTLANGUAGE, defaultLanguage);
    }

    /**
     * @see User#PROPERTY_DEFAULTORGANIZATION
     * 
     */
    public Organization getDefaultOrganization() {
        return (Organization) get(PROPERTY_DEFAULTORGANIZATION);
    }
    /**
     * @see User#PROPERTY_DEFAULTORGANIZATION
     * 
     */
    public void setDefaultOrganization(Organization defaultOrganization) {
        set(PROPERTY_DEFAULTORGANIZATION, defaultOrganization);
    }

    /**
     * @see User#PROPERTY_DEFAULTROLE
     * 
     */
    public Role getDefaultRole() {
        return (Role) get(PROPERTY_DEFAULTROLE);
    }
    /**
     * @see User#PROPERTY_DEFAULTROLE
     * 
     */
    public void setDefaultRole(Role defaultRole) {
        set(PROPERTY_DEFAULTROLE, defaultRole);
    }

    /**
     * @see User#PROPERTY_DEFAULTWAREHOUSE
     * 
     */
    public Warehouse getDefaultWarehouse() {
        return (Warehouse) get(PROPERTY_DEFAULTWAREHOUSE);
    }
    /**
     * @see User#PROPERTY_DEFAULTWAREHOUSE
     * 
     */
    public void setDefaultWarehouse(Warehouse defaultWarehouse) {
        set(PROPERTY_DEFAULTWAREHOUSE, defaultWarehouse);
    }

    /**
     * @see User#PROPERTY_LOCKED
     * 
     */
    public Boolean isLocked() {
        return (Boolean) get(PROPERTY_LOCKED);
    }
    /**
     * @see User#PROPERTY_LOCKED
     * 
     */
    public void setLocked(Boolean locked) {
        set(PROPERTY_LOCKED, locked);
    }

    /**
     * @see User#PROPERTY_IMAGE
     * 
     */
    public Image getImage() {
        return (Image) get(PROPERTY_IMAGE);
    }
    /**
     * @see User#PROPERTY_IMAGE
     * 
     */
    public void setImage(Image image) {
        set(PROPERTY_IMAGE, image);
    }

    /**
     * @see User#PROPERTY_GRANTPORTALACCESS
     * 
     */
    public Boolean isGrantPortalAccess() {
        return (Boolean) get(PROPERTY_GRANTPORTALACCESS);
    }
    /**
     * @see User#PROPERTY_GRANTPORTALACCESS
     * 
     */
    public void setGrantPortalAccess(Boolean grantPortalAccess) {
        set(PROPERTY_GRANTPORTALACCESS, grantPortalAccess);
    }

    /**
     * @see User#PROPERTY_LASTPASSWORDUPDATE
     * 
     */
    public Date getLastPasswordUpdate() {
        return (Date) get(PROPERTY_LASTPASSWORDUPDATE);
    }
    /**
     * @see User#PROPERTY_LASTPASSWORDUPDATE
     * 
     */
    public void setLastPasswordUpdate(Date lastPasswordUpdate) {
        set(PROPERTY_LASTPASSWORDUPDATE, lastPasswordUpdate);
    }

    /**
     * @see User#PROPERTY_ISPASSWORDEXPIRED
     * 
     */
    public Boolean isPasswordExpired() {
        return (Boolean) get(PROPERTY_ISPASSWORDEXPIRED);
    }
    /**
     * @see User#PROPERTY_ISPASSWORDEXPIRED
     * 
     */
    public void setPasswordExpired(Boolean isPasswordExpired) {
        set(PROPERTY_ISPASSWORDEXPIRED, isPasswordExpired);
    }

    /**
     * @see User#PROPERTY_COMMERCIALAUTH
     * 
     */
    public Boolean isCommercialauth() {
        return (Boolean) get(PROPERTY_COMMERCIALAUTH);
    }
    /**
     * @see User#PROPERTY_COMMERCIALAUTH
     * 
     */
    public void setCommercialauth(Boolean commercialauth) {
        set(PROPERTY_COMMERCIALAUTH, commercialauth);
    }

    /**
     * @see User#PROPERTY_VIASMS
     * 
     */
    public Boolean isViasms() {
        return (Boolean) get(PROPERTY_VIASMS);
    }
    /**
     * @see User#PROPERTY_VIASMS
     * 
     */
    public void setViasms(Boolean viasms) {
        set(PROPERTY_VIASMS, viasms);
    }

    /**
     * @see User#PROPERTY_VIAEMAIL
     * 
     */
    public Boolean isViaemail() {
        return (Boolean) get(PROPERTY_VIAEMAIL);
    }
    /**
     * @see User#PROPERTY_VIAEMAIL
     * 
     */
    public void setViaemail(Boolean viaemail) {
        set(PROPERTY_VIAEMAIL, viaemail);
    }

    /**
     * @see User#PROPERTY_UPDATEPASSWORD
     * 
     */
    public Boolean isUpdatePassword() {
        return (Boolean) get(PROPERTY_UPDATEPASSWORD);
    }
    /**
     * @see User#PROPERTY_UPDATEPASSWORD
     * 
     */
    public void setUpdatePassword(Boolean updatePassword) {
        set(PROPERTY_UPDATEPASSWORD, updatePassword);
    }

    /**
     * @see User#PROPERTY_ISSALESREPRESENTATIVE
     * 
     */
    public Boolean isSalesRepresentative() {
        return (Boolean) get(PROPERTY_ISSALESREPRESENTATIVE);
    }
    /**
     * @see User#PROPERTY_ISSALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(Boolean isSalesRepresentative) {
        set(PROPERTY_ISSALESREPRESENTATIVE, isSalesRepresentative);
    }

    /**
     * @see User#PROPERTY_ISSSOONLY
     * 
     */
    public Boolean isSsoonly() {
        return (Boolean) get(PROPERTY_ISSSOONLY);
    }
    /**
     * @see User#PROPERTY_ISSSOONLY
     * 
     */
    public void setSsoonly(Boolean isssoonly) {
        set(PROPERTY_ISSSOONLY, isssoonly);
    }

    /**
     * Help: {@literal The User Roles Tab define the Roles each user may have.  The Roles will determine what
     *       windows, tasks, processes and workflows that a User has access to.
     *       The User Assignment Tab displays
     *       Users who have been defined for this Role.}<br>
     * @see UserRoles
     * 
     */
    @SuppressWarnings("unchecked")
    public List<UserRoles> getADUserRolesList() {
      return (List<UserRoles>) get(PROPERTY_ADUSERROLESLIST);
    }

    /**
     * Help: {@literal The User Roles Tab define the Roles each user may have.  The Roles will determine what
     *       windows, tasks, processes and workflows that a User has access to.
     *       The User Assignment Tab displays
     *       Users who have been defined for this Role.}<br>
     * @see UserRoles
     * 
     */
    public void setADUserRolesList(List<UserRoles> aDUserRolesList) {
        set(PROPERTY_ADUSERROLESLIST, aDUserRolesList);
    }

    /**
     * Help: {@literal External Point of Sales}<br>
     * @see ExternalPOS
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ExternalPOS> getExternalPOSSalesRepresentativeList() {
      return (List<ExternalPOS>) get(PROPERTY_EXTERNALPOSSALESREPRESENTATIVELIST);
    }

    /**
     * Help: {@literal External Point of Sales}<br>
     * @see ExternalPOS
     * 
     */
    public void setExternalPOSSalesRepresentativeList(List<ExternalPOS> externalPOSSalesRepresentativeList) {
        set(PROPERTY_EXTERNALPOSSALESREPRESENTATIVELIST, externalPOSSalesRepresentativeList);
    }

    /**
     * @see OBSOIDUserIdentifier
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OBSOIDUserIdentifier> getOBSOIDUserIdentifierList() {
      return (List<OBSOIDUserIdentifier>) get(PROPERTY_OBSOIDUSERIDENTIFIERLIST);
    }

    /**
     * @see OBSOIDUserIdentifier
     * 
     */
    public void setOBSOIDUserIdentifierList(List<OBSOIDUserIdentifier> oBSOIDUserIdentifierList) {
        set(PROPERTY_OBSOIDUSERIDENTIFIERLIST, oBSOIDUserIdentifierList);
    }

}
