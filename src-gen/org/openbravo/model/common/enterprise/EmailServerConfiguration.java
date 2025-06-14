
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
import org.openbravo.model.ad.system.Client;
/**
 * Entity class for entity EmailServerConfiguration (stored in table C_POC_CONFIGURATION).
 * <br>
 * Help: {@literal C_POC_CONFIGURATION}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class EmailServerConfiguration extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_POC_CONFIGURATION";
    public static final String ENTITY_NAME = "EmailServerConfiguration";

    /**
     * Property id stored in column C_Poc_Configuration_ID in table C_POC_CONFIGURATION 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_POC_CONFIGURATION<br>
     * Help: {@literal A Client is a company or a legal entity. You cannot share data between Clients.}
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_POC_CONFIGURATION 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_POC_CONFIGURATION 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_POC_CONFIGURATION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_POC_CONFIGURATION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_POC_CONFIGURATION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_POC_CONFIGURATION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property smtpServer stored in column Smtpserver in table C_POC_CONFIGURATION 
     * 
     */
    public static final String PROPERTY_SMTPSERVER = "smtpServer";

    /**
     * Property smtpServerAccount stored in column Smtpserveraccount in table C_POC_CONFIGURATION 
     * 
     */
    public static final String PROPERTY_SMTPSERVERACCOUNT = "smtpServerAccount";

    /**
     * Property smtpServerPassword stored in column Smtpserverpassword in table C_POC_CONFIGURATION
     * 
     */
    public static final String PROPERTY_SMTPSERVERPASSWORD = "smtpServerPassword";

    /**
     * Property sMTPAuthentification stored in column IsSmtpAuthorization in table C_POC_CONFIGURATION<br>
     * Help: {@literal Some email servers require authentification before sending emails.  If yes, users are
     *       required to define their email user name and password.  If authentification is required and no user
     *       name and password is required, delivery will fail.}
     * 
     */
    public static final String PROPERTY_SMTPAUTHENTIFICATION = "sMTPAuthentification";

    /**
     * Property smtpServerSenderAddress stored in column Smtpserversenderaddress in table C_POC_CONFIGURATION<br>
     * Help: {@literal Address used to send the emails}
     * 
     */
    public static final String PROPERTY_SMTPSERVERSENDERADDRESS = "smtpServerSenderAddress";

    /**
     * Property smtpConnectionSecurity stored in column Smtpconnectionsecurity in table C_POC_CONFIGURATION<br>
     * Help: {@literal Connection security needed for the defined smtp server.}
     * 
     */
    public static final String PROPERTY_SMTPCONNECTIONSECURITY = "smtpConnectionSecurity";

    /**
     * Property smtpPort stored in column Smtpport in table C_POC_CONFIGURATION<br>
     * Help: {@literal Port needed for the defined smtp server.}
     * 
     */
    public static final String PROPERTY_SMTPPORT = "smtpPort";

    /**
     * Property smtpConnectionTimeout stored in column SmtpTimeout in table C_POC_CONFIGURATION<br>
     * Help: {@literal SMTP server communication timeout defined in seconds. After this timeout the email send
     *       process will stop.}
     * 
     */
    public static final String PROPERTY_SMTPCONNECTIONTIMEOUT = "smtpConnectionTimeout";


    public EmailServerConfiguration() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SMTPAUTHENTIFICATION, false);
        setDefaultValue(PROPERTY_SMTPPORT, (long) 25);
        setDefaultValue(PROPERTY_SMTPCONNECTIONTIMEOUT, (long) 600);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVER
     * 
     */
    public String getSmtpServer() {
        return (String) get(PROPERTY_SMTPSERVER);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVER
     * 
     */
    public void setSmtpServer(String smtpServer) {
        set(PROPERTY_SMTPSERVER, smtpServer);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVERACCOUNT
     * 
     */
    public String getSmtpServerAccount() {
        return (String) get(PROPERTY_SMTPSERVERACCOUNT);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVERACCOUNT
     * 
     */
    public void setSmtpServerAccount(String smtpServerAccount) {
        set(PROPERTY_SMTPSERVERACCOUNT, smtpServerAccount);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVERPASSWORD
     * 
     */
    public String getSmtpServerPassword() {
        return (String) get(PROPERTY_SMTPSERVERPASSWORD);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVERPASSWORD
     * 
     */
    public void setSmtpServerPassword(String smtpServerPassword) {
        set(PROPERTY_SMTPSERVERPASSWORD, smtpServerPassword);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPAUTHENTIFICATION
     * 
     */
    public Boolean isSMTPAuthentification() {
        return (Boolean) get(PROPERTY_SMTPAUTHENTIFICATION);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPAUTHENTIFICATION
     * 
     */
    public void setSMTPAuthentification(Boolean sMTPAuthentification) {
        set(PROPERTY_SMTPAUTHENTIFICATION, sMTPAuthentification);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVERSENDERADDRESS
     * 
     */
    public String getSmtpServerSenderAddress() {
        return (String) get(PROPERTY_SMTPSERVERSENDERADDRESS);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPSERVERSENDERADDRESS
     * 
     */
    public void setSmtpServerSenderAddress(String smtpServerSenderAddress) {
        set(PROPERTY_SMTPSERVERSENDERADDRESS, smtpServerSenderAddress);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPCONNECTIONSECURITY
     * 
     */
    public String getSmtpConnectionSecurity() {
        return (String) get(PROPERTY_SMTPCONNECTIONSECURITY);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPCONNECTIONSECURITY
     * 
     */
    public void setSmtpConnectionSecurity(String smtpConnectionSecurity) {
        set(PROPERTY_SMTPCONNECTIONSECURITY, smtpConnectionSecurity);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPPORT
     * 
     */
    public Long getSmtpPort() {
        return (Long) get(PROPERTY_SMTPPORT);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPPORT
     * 
     */
    public void setSmtpPort(Long smtpPort) {
        set(PROPERTY_SMTPPORT, smtpPort);
    }

    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPCONNECTIONTIMEOUT
     * 
     */
    public Long getSmtpConnectionTimeout() {
        return (Long) get(PROPERTY_SMTPCONNECTIONTIMEOUT);
    }
    /**
     * @see EmailServerConfiguration#PROPERTY_SMTPCONNECTIONTIMEOUT
     * 
     */
    public void setSmtpConnectionTimeout(Long smtpConnectionTimeout) {
        set(PROPERTY_SMTPCONNECTIONTIMEOUT, smtpConnectionTimeout);
    }

}
