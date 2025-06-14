
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
package org.openbravo.model.ad.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.ADClientAcctDimension;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.EmailServerConfiguration;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADClient (stored in table AD_Client).
 * <br>
 * Help: {@literal The Client Definition Tab defines a unique client. Do not create a new client in this
     *       window, but use "Initial Client Setup" (System Administrator Role) to set up the required security
     *       and access rules. If you create a new client here, you will not be abl}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Client extends BaseOBObject implements Traceable, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Client";
    public static final String ENTITY_NAME = "ADClient";

    /**
     * Property id stored in column AD_Client_ID in table AD_Client<br>
     * Help: {@literal A Client is a company or a legal entity. You cannot share data between Clients.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Client 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Client 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Client 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Client 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Client 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Client 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table AD_Client<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table AD_Client 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Client<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property mailHost stored in column SMTPHost in table AD_Client<br>
     * Help: {@literal The host name of the Mail Server for this client with SMTP services to send mail, and IMAP
     *       to process incoming mail.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_MAILHOST = "mailHost";

    /**
     * Property requestEmail stored in column RequestEMail in table AD_Client<br>
     * Help: EMails for requests, alerts and escalation are sent from this email address as well as delivery
     *       information if the sales rep does not have an email account. The address must be filly qualified
     *       (e.g. joe.smith&#64;company.com) and should be a valid address.
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_REQUESTEMAIL = "requestEmail";

    /**
     * Property requestUser stored in column RequestUser in table AD_Client<br>
     * Help: {@literal EMail user name for requests, alerts and escalation are sent from this email address as
     *       well as delivery information if the sales rep does not have an email account. Required, if your mail
     *       server requires authentification as well as for processing incoming mails.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_REQUESTUSER = "requestUser";

    /**
     * Property requestUserPassword stored in column RequestUserPW in table AD_Client<br>
     * Help: {@literal Password of the user name (ID) for mail processing}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_REQUESTUSERPASSWORD = "requestUserPassword";

    /**
     * Property requestFolder stored in column RequestFolder in table AD_Client<br>
     * Help: {@literal Email folder used to read emails to process as requests, If left empty the default mailbox
     *       (INBOX) will be used. Requires IMAP services.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_REQUESTFOLDER = "requestFolder";

    /**
     * Property language stored in column AD_Language in table AD_Client<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property multilingualDocuments stored in column IsMultiLingualDocument in table AD_Client<br>
     * Help: {@literal If selected, you enable multi lingual documents and need to maintain translations for
     *       entities used in documents (examples: Products, Payment Terms, ...).<BR>Please note, that the base
     *       language is always English.}
     * 
     */
    public static final String PROPERTY_MULTILINGUALDOCUMENTS = "multilingualDocuments";

    /**
     * Property sMTPAuthentification stored in column IsSmtpAuthorization in table AD_Client<br>
     * Help: {@literal Some email servers require authentification before sending emails.  If yes, users are
     *       required to define their email user name and password.  If authentification is required and no user
     *       name and password is required, delivery will fail.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_SMTPAUTHENTIFICATION = "sMTPAuthentification";

    /**
     * Property currency stored in column C_Currency_ID in table AD_Client<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property acctdimCentrallyMaintained stored in column Acctdim_Centrally_Maintained in table AD_Client<br>
     * Help: {@literal The Centrally Maintained checkbox indicates if the Name, Description and Help maintained
     *       in 'System Element' table  or 'Window' table.}
     * 
     */
    public static final String PROPERTY_ACCTDIMCENTRALLYMAINTAINED = "acctdimCentrallyMaintained";

    /**
     * Property projectAcctdimIsenable stored in column Project_Acctdim_Isenable in table AD_Client<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECTACCTDIMISENABLE = "projectAcctdimIsenable";

    /**
     * Property projectAcctdimHeader stored in column Project_Acctdim_Header in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document header tab.}
     * 
     */
    public static final String PROPERTY_PROJECTACCTDIMHEADER = "projectAcctdimHeader";

    /**
     * Property projectAcctdimLines stored in column Project_Acctdim_Lines in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document lines tab.}
     * 
     */
    public static final String PROPERTY_PROJECTACCTDIMLINES = "projectAcctdimLines";

    /**
     * Property projectAcctdimBreakdown stored in column Project_Acctdim_Breakdown in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document break down
     *       tab.}
     * 
     */
    public static final String PROPERTY_PROJECTACCTDIMBREAKDOWN = "projectAcctdimBreakdown";

    /**
     * Property bpartnerAcctdimIsenable stored in column Bpartner_Acctdim_Isenable in table AD_Client<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BPARTNERACCTDIMISENABLE = "bpartnerAcctdimIsenable";

    /**
     * Property bpartnerAcctdimHeader stored in column Bpartner_Acctdim_Header in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document header tab.}
     * 
     */
    public static final String PROPERTY_BPARTNERACCTDIMHEADER = "bpartnerAcctdimHeader";

    /**
     * Property bpartnerAcctdimLines stored in column Bpartner_Acctdim_Lines in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document lines tab.}
     * 
     */
    public static final String PROPERTY_BPARTNERACCTDIMLINES = "bpartnerAcctdimLines";

    /**
     * Property bpartnerAcctdimBreakdown stored in column Bpartner_Acctdim_Breakdown in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document break down
     *       tab.}
     * 
     */
    public static final String PROPERTY_BPARTNERACCTDIMBREAKDOWN = "bpartnerAcctdimBreakdown";

    /**
     * Property productAcctdimIsenable stored in column Product_Acctdim_Isenable in table AD_Client<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCTACCTDIMISENABLE = "productAcctdimIsenable";

    /**
     * Property productAcctdimHeader stored in column Product_Acctdim_Header in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document header tab.}
     * 
     */
    public static final String PROPERTY_PRODUCTACCTDIMHEADER = "productAcctdimHeader";

    /**
     * Property productAcctdimLines stored in column Product_Acctdim_Lines in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document lines tab.}
     * 
     */
    public static final String PROPERTY_PRODUCTACCTDIMLINES = "productAcctdimLines";

    /**
     * Property productAcctdimBreakdown stored in column Product_Acctdim_Breakdown in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document break down
     *       tab.}
     * 
     */
    public static final String PROPERTY_PRODUCTACCTDIMBREAKDOWN = "productAcctdimBreakdown";

    /**
     * Property costcenterAcctdimHeader stored in column Costcenter_Acctdim_Header in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document header tab.}
     * 
     */
    public static final String PROPERTY_COSTCENTERACCTDIMHEADER = "costcenterAcctdimHeader";

    /**
     * Property costcenterAcctdimLines stored in column Costcenter_Acctdim_Lines in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document lines tab.}
     * 
     */
    public static final String PROPERTY_COSTCENTERACCTDIMLINES = "costcenterAcctdimLines";

    /**
     * Property costcenterAcctdimBreakdown stored in column Costcenter_Acctdim_Breakdown in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document break down
     *       tab.}
     * 
     */
    public static final String PROPERTY_COSTCENTERACCTDIMBREAKDOWN = "costcenterAcctdimBreakdown";

    /**
     * Property user1AcctdimIsenable stored in column User1_Acctdim_Isenable in table AD_Client<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_USER1ACCTDIMISENABLE = "user1AcctdimIsenable";

    /**
     * Property user1AcctdimHeader stored in column User1_Acctdim_Header in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document header tab.}
     * 
     */
    public static final String PROPERTY_USER1ACCTDIMHEADER = "user1AcctdimHeader";

    /**
     * Property user1AcctdimLines stored in column User1_Acctdim_Lines in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document lines tab.}
     * 
     */
    public static final String PROPERTY_USER1ACCTDIMLINES = "user1AcctdimLines";

    /**
     * Property user1AcctdimBreakdown stored in column User1_Acctdim_Breakdown in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document break down
     *       tab.}
     * 
     */
    public static final String PROPERTY_USER1ACCTDIMBREAKDOWN = "user1AcctdimBreakdown";

    /**
     * Property user2AcctdimIsenable stored in column User2_Acctdim_Isenable in table AD_Client<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_USER2ACCTDIMISENABLE = "user2AcctdimIsenable";

    /**
     * Property user2AcctdimHeader stored in column User2_Acctdim_Header in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document header tab.}
     * 
     */
    public static final String PROPERTY_USER2ACCTDIMHEADER = "user2AcctdimHeader";

    /**
     * Property user2AcctdimLines stored in column User2_Acctdim_Lines in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document lines tab.}
     * 
     */
    public static final String PROPERTY_USER2ACCTDIMLINES = "user2AcctdimLines";

    /**
     * Property user2AcctdimBreakdown stored in column User2_Acctdim_Breakdown in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document break down
     *       tab.}
     * 
     */
    public static final String PROPERTY_USER2ACCTDIMBREAKDOWN = "user2AcctdimBreakdown";

    /**
     * Property costcenterAcctdimIsenable stored in column Costcenter_Acctdim_Isenable in table AD_Client<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTERACCTDIMISENABLE = "costcenterAcctdimIsenable";

    /**
     * Property orgAcctdimIsenable stored in column Org_Acctdim_Isenable in table AD_Client
     * 
     */
    public static final String PROPERTY_ORGACCTDIMISENABLE = "orgAcctdimIsenable";

    /**
     * Property orgAcctdimHeader stored in column Org_Acctdim_Header in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document header tab.}
     * 
     */
    public static final String PROPERTY_ORGACCTDIMHEADER = "orgAcctdimHeader";

    /**
     * Property orgAcctdimLines stored in column Org_Acctdim_Lines in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document lines tab.}
     * 
     */
    public static final String PROPERTY_ORGACCTDIMLINES = "orgAcctdimLines";

    /**
     * Property orgAcctdimBreakdown stored in column Org_Acctdim_Breakdown in table AD_Client<br>
     * Help: {@literal This flag indicates whether the accounting dimension is displayed on document break down
     *       tab.}
     * 
     */
    public static final String PROPERTY_ORGACCTDIMBREAKDOWN = "orgAcctdimBreakdown";

    /**
     * Property daysToPasswordExpiration stored in column DaysToPasswordExpiration in table AD_Client<br>
     * Help: {@literal Define the days that user password must be valid from previous password change, if value
     *       is set to 0 no update will be required, for value greater than 0, password must be updated when the
     *       last password update date of the user plus the days defined here achieves. It will affect to all
     *       users depending the client.}
     * 
     */
    public static final String PROPERTY_DAYSTOPASSWORDEXPIRATION = "daysToPasswordExpiration";

    /**
     * Property aDClientAcctDimensionList stored in table AD_Client
     * 
     */
    public static final String PROPERTY_ADCLIENTACCTDIMENSIONLIST = "aDClientAcctDimensionList";

    /**
     * Property clientInformationList stored in table AD_Client
     * 
     */
    public static final String PROPERTY_CLIENTINFORMATIONLIST = "clientInformationList";

    /**
     * Property emailServerConfigurationList stored in table AD_Client
     * 
     */
    public static final String PROPERTY_EMAILSERVERCONFIGURATIONLIST = "emailServerConfigurationList";


    public Client() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MULTILINGUALDOCUMENTS, false);
        setDefaultValue(PROPERTY_SMTPAUTHENTIFICATION, false);
        setDefaultValue(PROPERTY_ACCTDIMCENTRALLYMAINTAINED, false);
        setDefaultValue(PROPERTY_PROJECTACCTDIMISENABLE, false);
        setDefaultValue(PROPERTY_PROJECTACCTDIMHEADER, false);
        setDefaultValue(PROPERTY_PROJECTACCTDIMLINES, false);
        setDefaultValue(PROPERTY_PROJECTACCTDIMBREAKDOWN, false);
        setDefaultValue(PROPERTY_BPARTNERACCTDIMISENABLE, false);
        setDefaultValue(PROPERTY_BPARTNERACCTDIMHEADER, false);
        setDefaultValue(PROPERTY_BPARTNERACCTDIMLINES, false);
        setDefaultValue(PROPERTY_BPARTNERACCTDIMBREAKDOWN, false);
        setDefaultValue(PROPERTY_PRODUCTACCTDIMISENABLE, false);
        setDefaultValue(PROPERTY_PRODUCTACCTDIMHEADER, false);
        setDefaultValue(PROPERTY_PRODUCTACCTDIMLINES, false);
        setDefaultValue(PROPERTY_PRODUCTACCTDIMBREAKDOWN, false);
        setDefaultValue(PROPERTY_COSTCENTERACCTDIMHEADER, false);
        setDefaultValue(PROPERTY_COSTCENTERACCTDIMLINES, false);
        setDefaultValue(PROPERTY_COSTCENTERACCTDIMBREAKDOWN, false);
        setDefaultValue(PROPERTY_USER1ACCTDIMISENABLE, false);
        setDefaultValue(PROPERTY_USER1ACCTDIMHEADER, false);
        setDefaultValue(PROPERTY_USER1ACCTDIMLINES, false);
        setDefaultValue(PROPERTY_USER1ACCTDIMBREAKDOWN, false);
        setDefaultValue(PROPERTY_USER2ACCTDIMISENABLE, false);
        setDefaultValue(PROPERTY_USER2ACCTDIMHEADER, false);
        setDefaultValue(PROPERTY_USER2ACCTDIMLINES, false);
        setDefaultValue(PROPERTY_USER2ACCTDIMBREAKDOWN, false);
        setDefaultValue(PROPERTY_COSTCENTERACCTDIMISENABLE, false);
        setDefaultValue(PROPERTY_ORGACCTDIMISENABLE, false);
        setDefaultValue(PROPERTY_ORGACCTDIMHEADER, false);
        setDefaultValue(PROPERTY_ORGACCTDIMLINES, false);
        setDefaultValue(PROPERTY_ORGACCTDIMBREAKDOWN, false);
        setDefaultValue(PROPERTY_DAYSTOPASSWORDEXPIRATION, (long) 0);
        setDefaultValue(PROPERTY_ADCLIENTACCTDIMENSIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CLIENTINFORMATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EMAILSERVERCONFIGURATIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Client#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Client#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Client#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Client#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Client#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Client#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Client#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Client#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Client#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Client#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Client#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Client#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Client#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Client#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Client#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Client#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Client#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Client#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Client#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Client#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Client#PROPERTY_MAILHOST
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getMailHost() {
        return (String) get(PROPERTY_MAILHOST);
    }
    /**
     * @see Client#PROPERTY_MAILHOST
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setMailHost(String mailHost) {
        set(PROPERTY_MAILHOST, mailHost);
    }

    /**
     * @see Client#PROPERTY_REQUESTEMAIL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getRequestEmail() {
        return (String) get(PROPERTY_REQUESTEMAIL);
    }
    /**
     * @see Client#PROPERTY_REQUESTEMAIL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setRequestEmail(String requestEmail) {
        set(PROPERTY_REQUESTEMAIL, requestEmail);
    }

    /**
     * @see Client#PROPERTY_REQUESTUSER
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getRequestUser() {
        return (String) get(PROPERTY_REQUESTUSER);
    }
    /**
     * @see Client#PROPERTY_REQUESTUSER
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setRequestUser(String requestUser) {
        set(PROPERTY_REQUESTUSER, requestUser);
    }

    /**
     * @see Client#PROPERTY_REQUESTUSERPASSWORD
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getRequestUserPassword() {
        return (String) get(PROPERTY_REQUESTUSERPASSWORD);
    }
    /**
     * @see Client#PROPERTY_REQUESTUSERPASSWORD
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setRequestUserPassword(String requestUserPassword) {
        set(PROPERTY_REQUESTUSERPASSWORD, requestUserPassword);
    }

    /**
     * @see Client#PROPERTY_REQUESTFOLDER
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getRequestFolder() {
        return (String) get(PROPERTY_REQUESTFOLDER);
    }
    /**
     * @see Client#PROPERTY_REQUESTFOLDER
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setRequestFolder(String requestFolder) {
        set(PROPERTY_REQUESTFOLDER, requestFolder);
    }

    /**
     * @see Client#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see Client#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see Client#PROPERTY_MULTILINGUALDOCUMENTS
     * 
     */
    public Boolean isMultilingualDocuments() {
        return (Boolean) get(PROPERTY_MULTILINGUALDOCUMENTS);
    }
    /**
     * @see Client#PROPERTY_MULTILINGUALDOCUMENTS
     * 
     */
    public void setMultilingualDocuments(Boolean multilingualDocuments) {
        set(PROPERTY_MULTILINGUALDOCUMENTS, multilingualDocuments);
    }

    /**
     * @see Client#PROPERTY_SMTPAUTHENTIFICATION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isSMTPAuthentification() {
        return (Boolean) get(PROPERTY_SMTPAUTHENTIFICATION);
    }
    /**
     * @see Client#PROPERTY_SMTPAUTHENTIFICATION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setSMTPAuthentification(Boolean sMTPAuthentification) {
        set(PROPERTY_SMTPAUTHENTIFICATION, sMTPAuthentification);
    }

    /**
     * @see Client#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Client#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Client#PROPERTY_ACCTDIMCENTRALLYMAINTAINED
     * 
     */
    public Boolean isAcctdimCentrallyMaintained() {
        return (Boolean) get(PROPERTY_ACCTDIMCENTRALLYMAINTAINED);
    }
    /**
     * @see Client#PROPERTY_ACCTDIMCENTRALLYMAINTAINED
     * 
     */
    public void setAcctdimCentrallyMaintained(Boolean acctdimCentrallyMaintained) {
        set(PROPERTY_ACCTDIMCENTRALLYMAINTAINED, acctdimCentrallyMaintained);
    }

    /**
     * @see Client#PROPERTY_PROJECTACCTDIMISENABLE
     * 
     */
    public Boolean isProjectAcctdimIsenable() {
        return (Boolean) get(PROPERTY_PROJECTACCTDIMISENABLE);
    }
    /**
     * @see Client#PROPERTY_PROJECTACCTDIMISENABLE
     * 
     */
    public void setProjectAcctdimIsenable(Boolean projectAcctdimIsenable) {
        set(PROPERTY_PROJECTACCTDIMISENABLE, projectAcctdimIsenable);
    }

    /**
     * @see Client#PROPERTY_PROJECTACCTDIMHEADER
     * 
     */
    public Boolean isProjectAcctdimHeader() {
        return (Boolean) get(PROPERTY_PROJECTACCTDIMHEADER);
    }
    /**
     * @see Client#PROPERTY_PROJECTACCTDIMHEADER
     * 
     */
    public void setProjectAcctdimHeader(Boolean projectAcctdimHeader) {
        set(PROPERTY_PROJECTACCTDIMHEADER, projectAcctdimHeader);
    }

    /**
     * @see Client#PROPERTY_PROJECTACCTDIMLINES
     * 
     */
    public Boolean isProjectAcctdimLines() {
        return (Boolean) get(PROPERTY_PROJECTACCTDIMLINES);
    }
    /**
     * @see Client#PROPERTY_PROJECTACCTDIMLINES
     * 
     */
    public void setProjectAcctdimLines(Boolean projectAcctdimLines) {
        set(PROPERTY_PROJECTACCTDIMLINES, projectAcctdimLines);
    }

    /**
     * @see Client#PROPERTY_PROJECTACCTDIMBREAKDOWN
     * 
     */
    public Boolean isProjectAcctdimBreakdown() {
        return (Boolean) get(PROPERTY_PROJECTACCTDIMBREAKDOWN);
    }
    /**
     * @see Client#PROPERTY_PROJECTACCTDIMBREAKDOWN
     * 
     */
    public void setProjectAcctdimBreakdown(Boolean projectAcctdimBreakdown) {
        set(PROPERTY_PROJECTACCTDIMBREAKDOWN, projectAcctdimBreakdown);
    }

    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMISENABLE
     * 
     */
    public Boolean isBpartnerAcctdimIsenable() {
        return (Boolean) get(PROPERTY_BPARTNERACCTDIMISENABLE);
    }
    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMISENABLE
     * 
     */
    public void setBpartnerAcctdimIsenable(Boolean bpartnerAcctdimIsenable) {
        set(PROPERTY_BPARTNERACCTDIMISENABLE, bpartnerAcctdimIsenable);
    }

    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMHEADER
     * 
     */
    public Boolean isBpartnerAcctdimHeader() {
        return (Boolean) get(PROPERTY_BPARTNERACCTDIMHEADER);
    }
    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMHEADER
     * 
     */
    public void setBpartnerAcctdimHeader(Boolean bpartnerAcctdimHeader) {
        set(PROPERTY_BPARTNERACCTDIMHEADER, bpartnerAcctdimHeader);
    }

    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMLINES
     * 
     */
    public Boolean isBpartnerAcctdimLines() {
        return (Boolean) get(PROPERTY_BPARTNERACCTDIMLINES);
    }
    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMLINES
     * 
     */
    public void setBpartnerAcctdimLines(Boolean bpartnerAcctdimLines) {
        set(PROPERTY_BPARTNERACCTDIMLINES, bpartnerAcctdimLines);
    }

    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMBREAKDOWN
     * 
     */
    public Boolean isBpartnerAcctdimBreakdown() {
        return (Boolean) get(PROPERTY_BPARTNERACCTDIMBREAKDOWN);
    }
    /**
     * @see Client#PROPERTY_BPARTNERACCTDIMBREAKDOWN
     * 
     */
    public void setBpartnerAcctdimBreakdown(Boolean bpartnerAcctdimBreakdown) {
        set(PROPERTY_BPARTNERACCTDIMBREAKDOWN, bpartnerAcctdimBreakdown);
    }

    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMISENABLE
     * 
     */
    public Boolean isProductAcctdimIsenable() {
        return (Boolean) get(PROPERTY_PRODUCTACCTDIMISENABLE);
    }
    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMISENABLE
     * 
     */
    public void setProductAcctdimIsenable(Boolean productAcctdimIsenable) {
        set(PROPERTY_PRODUCTACCTDIMISENABLE, productAcctdimIsenable);
    }

    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMHEADER
     * 
     */
    public Boolean isProductAcctdimHeader() {
        return (Boolean) get(PROPERTY_PRODUCTACCTDIMHEADER);
    }
    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMHEADER
     * 
     */
    public void setProductAcctdimHeader(Boolean productAcctdimHeader) {
        set(PROPERTY_PRODUCTACCTDIMHEADER, productAcctdimHeader);
    }

    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMLINES
     * 
     */
    public Boolean isProductAcctdimLines() {
        return (Boolean) get(PROPERTY_PRODUCTACCTDIMLINES);
    }
    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMLINES
     * 
     */
    public void setProductAcctdimLines(Boolean productAcctdimLines) {
        set(PROPERTY_PRODUCTACCTDIMLINES, productAcctdimLines);
    }

    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMBREAKDOWN
     * 
     */
    public Boolean isProductAcctdimBreakdown() {
        return (Boolean) get(PROPERTY_PRODUCTACCTDIMBREAKDOWN);
    }
    /**
     * @see Client#PROPERTY_PRODUCTACCTDIMBREAKDOWN
     * 
     */
    public void setProductAcctdimBreakdown(Boolean productAcctdimBreakdown) {
        set(PROPERTY_PRODUCTACCTDIMBREAKDOWN, productAcctdimBreakdown);
    }

    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMHEADER
     * 
     */
    public Boolean isCostcenterAcctdimHeader() {
        return (Boolean) get(PROPERTY_COSTCENTERACCTDIMHEADER);
    }
    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMHEADER
     * 
     */
    public void setCostcenterAcctdimHeader(Boolean costcenterAcctdimHeader) {
        set(PROPERTY_COSTCENTERACCTDIMHEADER, costcenterAcctdimHeader);
    }

    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMLINES
     * 
     */
    public Boolean isCostcenterAcctdimLines() {
        return (Boolean) get(PROPERTY_COSTCENTERACCTDIMLINES);
    }
    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMLINES
     * 
     */
    public void setCostcenterAcctdimLines(Boolean costcenterAcctdimLines) {
        set(PROPERTY_COSTCENTERACCTDIMLINES, costcenterAcctdimLines);
    }

    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMBREAKDOWN
     * 
     */
    public Boolean isCostcenterAcctdimBreakdown() {
        return (Boolean) get(PROPERTY_COSTCENTERACCTDIMBREAKDOWN);
    }
    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMBREAKDOWN
     * 
     */
    public void setCostcenterAcctdimBreakdown(Boolean costcenterAcctdimBreakdown) {
        set(PROPERTY_COSTCENTERACCTDIMBREAKDOWN, costcenterAcctdimBreakdown);
    }

    /**
     * @see Client#PROPERTY_USER1ACCTDIMISENABLE
     * 
     */
    public Boolean isUser1AcctdimIsenable() {
        return (Boolean) get(PROPERTY_USER1ACCTDIMISENABLE);
    }
    /**
     * @see Client#PROPERTY_USER1ACCTDIMISENABLE
     * 
     */
    public void setUser1AcctdimIsenable(Boolean user1AcctdimIsenable) {
        set(PROPERTY_USER1ACCTDIMISENABLE, user1AcctdimIsenable);
    }

    /**
     * @see Client#PROPERTY_USER1ACCTDIMHEADER
     * 
     */
    public Boolean isUser1AcctdimHeader() {
        return (Boolean) get(PROPERTY_USER1ACCTDIMHEADER);
    }
    /**
     * @see Client#PROPERTY_USER1ACCTDIMHEADER
     * 
     */
    public void setUser1AcctdimHeader(Boolean user1AcctdimHeader) {
        set(PROPERTY_USER1ACCTDIMHEADER, user1AcctdimHeader);
    }

    /**
     * @see Client#PROPERTY_USER1ACCTDIMLINES
     * 
     */
    public Boolean isUser1AcctdimLines() {
        return (Boolean) get(PROPERTY_USER1ACCTDIMLINES);
    }
    /**
     * @see Client#PROPERTY_USER1ACCTDIMLINES
     * 
     */
    public void setUser1AcctdimLines(Boolean user1AcctdimLines) {
        set(PROPERTY_USER1ACCTDIMLINES, user1AcctdimLines);
    }

    /**
     * @see Client#PROPERTY_USER1ACCTDIMBREAKDOWN
     * 
     */
    public Boolean isUser1AcctdimBreakdown() {
        return (Boolean) get(PROPERTY_USER1ACCTDIMBREAKDOWN);
    }
    /**
     * @see Client#PROPERTY_USER1ACCTDIMBREAKDOWN
     * 
     */
    public void setUser1AcctdimBreakdown(Boolean user1AcctdimBreakdown) {
        set(PROPERTY_USER1ACCTDIMBREAKDOWN, user1AcctdimBreakdown);
    }

    /**
     * @see Client#PROPERTY_USER2ACCTDIMISENABLE
     * 
     */
    public Boolean isUser2AcctdimIsenable() {
        return (Boolean) get(PROPERTY_USER2ACCTDIMISENABLE);
    }
    /**
     * @see Client#PROPERTY_USER2ACCTDIMISENABLE
     * 
     */
    public void setUser2AcctdimIsenable(Boolean user2AcctdimIsenable) {
        set(PROPERTY_USER2ACCTDIMISENABLE, user2AcctdimIsenable);
    }

    /**
     * @see Client#PROPERTY_USER2ACCTDIMHEADER
     * 
     */
    public Boolean isUser2AcctdimHeader() {
        return (Boolean) get(PROPERTY_USER2ACCTDIMHEADER);
    }
    /**
     * @see Client#PROPERTY_USER2ACCTDIMHEADER
     * 
     */
    public void setUser2AcctdimHeader(Boolean user2AcctdimHeader) {
        set(PROPERTY_USER2ACCTDIMHEADER, user2AcctdimHeader);
    }

    /**
     * @see Client#PROPERTY_USER2ACCTDIMLINES
     * 
     */
    public Boolean isUser2AcctdimLines() {
        return (Boolean) get(PROPERTY_USER2ACCTDIMLINES);
    }
    /**
     * @see Client#PROPERTY_USER2ACCTDIMLINES
     * 
     */
    public void setUser2AcctdimLines(Boolean user2AcctdimLines) {
        set(PROPERTY_USER2ACCTDIMLINES, user2AcctdimLines);
    }

    /**
     * @see Client#PROPERTY_USER2ACCTDIMBREAKDOWN
     * 
     */
    public Boolean isUser2AcctdimBreakdown() {
        return (Boolean) get(PROPERTY_USER2ACCTDIMBREAKDOWN);
    }
    /**
     * @see Client#PROPERTY_USER2ACCTDIMBREAKDOWN
     * 
     */
    public void setUser2AcctdimBreakdown(Boolean user2AcctdimBreakdown) {
        set(PROPERTY_USER2ACCTDIMBREAKDOWN, user2AcctdimBreakdown);
    }

    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMISENABLE
     * 
     */
    public Boolean isCostcenterAcctdimIsenable() {
        return (Boolean) get(PROPERTY_COSTCENTERACCTDIMISENABLE);
    }
    /**
     * @see Client#PROPERTY_COSTCENTERACCTDIMISENABLE
     * 
     */
    public void setCostcenterAcctdimIsenable(Boolean costcenterAcctdimIsenable) {
        set(PROPERTY_COSTCENTERACCTDIMISENABLE, costcenterAcctdimIsenable);
    }

    /**
     * @see Client#PROPERTY_ORGACCTDIMISENABLE
     * 
     */
    public Boolean isOrgAcctdimIsenable() {
        return (Boolean) get(PROPERTY_ORGACCTDIMISENABLE);
    }
    /**
     * @see Client#PROPERTY_ORGACCTDIMISENABLE
     * 
     */
    public void setOrgAcctdimIsenable(Boolean orgAcctdimIsenable) {
        set(PROPERTY_ORGACCTDIMISENABLE, orgAcctdimIsenable);
    }

    /**
     * @see Client#PROPERTY_ORGACCTDIMHEADER
     * 
     */
    public Boolean isOrgAcctdimHeader() {
        return (Boolean) get(PROPERTY_ORGACCTDIMHEADER);
    }
    /**
     * @see Client#PROPERTY_ORGACCTDIMHEADER
     * 
     */
    public void setOrgAcctdimHeader(Boolean orgAcctdimHeader) {
        set(PROPERTY_ORGACCTDIMHEADER, orgAcctdimHeader);
    }

    /**
     * @see Client#PROPERTY_ORGACCTDIMLINES
     * 
     */
    public Boolean isOrgAcctdimLines() {
        return (Boolean) get(PROPERTY_ORGACCTDIMLINES);
    }
    /**
     * @see Client#PROPERTY_ORGACCTDIMLINES
     * 
     */
    public void setOrgAcctdimLines(Boolean orgAcctdimLines) {
        set(PROPERTY_ORGACCTDIMLINES, orgAcctdimLines);
    }

    /**
     * @see Client#PROPERTY_ORGACCTDIMBREAKDOWN
     * 
     */
    public Boolean isOrgAcctdimBreakdown() {
        return (Boolean) get(PROPERTY_ORGACCTDIMBREAKDOWN);
    }
    /**
     * @see Client#PROPERTY_ORGACCTDIMBREAKDOWN
     * 
     */
    public void setOrgAcctdimBreakdown(Boolean orgAcctdimBreakdown) {
        set(PROPERTY_ORGACCTDIMBREAKDOWN, orgAcctdimBreakdown);
    }

    /**
     * @see Client#PROPERTY_DAYSTOPASSWORDEXPIRATION
     * 
     */
    public Long getDaysToPasswordExpiration() {
        return (Long) get(PROPERTY_DAYSTOPASSWORDEXPIRATION);
    }
    /**
     * @see Client#PROPERTY_DAYSTOPASSWORDEXPIRATION
     * 
     */
    public void setDaysToPasswordExpiration(Long daysToPasswordExpiration) {
        set(PROPERTY_DAYSTOPASSWORDEXPIRATION, daysToPasswordExpiration);
    }

    /**
     * @see ADClientAcctDimension
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ADClientAcctDimension> getADClientAcctDimensionList() {
      return (List<ADClientAcctDimension>) get(PROPERTY_ADCLIENTACCTDIMENSIONLIST);
    }

    /**
     * @see ADClientAcctDimension
     * 
     */
    public void setADClientAcctDimensionList(List<ADClientAcctDimension> aDClientAcctDimensionList) {
        set(PROPERTY_ADCLIENTACCTDIMENSIONLIST, aDClientAcctDimensionList);
    }

    /**
     * Help: {@literal The Client Info Tab defines the details for each client.  The accounting rules and high
     *       level defaults are defined here. The Calendar is used to determine if a period is open or closed.}<br>
     * @see ClientInformation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ClientInformation> getClientInformationList() {
      return (List<ClientInformation>) get(PROPERTY_CLIENTINFORMATIONLIST);
    }

    /**
     * Help: {@literal The Client Info Tab defines the details for each client.  The accounting rules and high
     *       level defaults are defined here. The Calendar is used to determine if a period is open or closed.}<br>
     * @see ClientInformation
     * 
     */
    public void setClientInformationList(List<ClientInformation> clientInformationList) {
        set(PROPERTY_CLIENTINFORMATIONLIST, clientInformationList);
    }

    /**
     * Help: {@literal C_POC_CONFIGURATION}<br>
     * @see EmailServerConfiguration
     * 
     */
    @SuppressWarnings("unchecked")
    public List<EmailServerConfiguration> getEmailServerConfigurationList() {
      return (List<EmailServerConfiguration>) get(PROPERTY_EMAILSERVERCONFIGURATIONLIST);
    }

    /**
     * Help: {@literal C_POC_CONFIGURATION}<br>
     * @see EmailServerConfiguration
     * 
     */
    public void setEmailServerConfigurationList(List<EmailServerConfiguration> emailServerConfigurationList) {
        set(PROPERTY_EMAILSERVERCONFIGURATIONLIST, emailServerConfigurationList);
    }

}
