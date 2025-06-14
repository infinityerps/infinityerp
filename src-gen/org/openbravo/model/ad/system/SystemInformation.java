
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADSystemInformation (stored in table AD_System_Info).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class SystemInformation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_System_Info";
    public static final String ENTITY_NAME = "ADSystemInformation";

    /**
     * Property id stored in column AD_System_Info_ID in table AD_System_Info 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_System_Info 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_System_Info 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_System_Info 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_System_Info 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_System_Info 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_System_Info 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_System_Info 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property systemIdentifier stored in column System_Identifier in table AD_System_Info 
     * 
     */
    public static final String PROPERTY_SYSTEMIDENTIFIER = "systemIdentifier";

    /**
     * Property enableHeartbeat stored in column Isheartbeatactive in table AD_System_Info<br>
     * Help: {@literal Disable Heartbeat process}
     * 
     */
    public static final String PROPERTY_ENABLEHEARTBEAT = "enableHeartbeat";

    /**
     * Property postponeDate stored in column Postpone_Date in table AD_System_Info<br>
     * Help: {@literal Date set when user selects 'Later'}
     * 
     */
    public static final String PROPERTY_POSTPONEDATE = "postponeDate";

    /**
     * Property proxyRequired stored in column Isproxyrequired in table AD_System_Info<br>
     * Help: {@literal Proxy configuration required to access internet.}
     * 
     */
    public static final String PROPERTY_PROXYREQUIRED = "proxyRequired";

    /**
     * Property proxyServer stored in column Proxy_Server in table AD_System_Info<br>
     * Help: {@literal Proxy server name.}
     * 
     */
    public static final String PROPERTY_PROXYSERVER = "proxyServer";

    /**
     * Property proxyPort stored in column Proxy_Port in table AD_System_Info<br>
     * Help: {@literal Proxy port on the proxy server.}
     * 
     */
    public static final String PROPERTY_PROXYPORT = "proxyPort";

    /**
     * Property testHeartbeat stored in column Testproxy in table AD_System_Info<br>
     * Help: {@literal Test the current proxy configuration.}
     * 
     */
    public static final String PROPERTY_TESTHEARTBEAT = "testHeartbeat";

    /**
     * Property antVersion stored in column ANT_Version in table AD_System_Info<br>
     * Help: {@literal The version of Ant used to build the application.}
     * 
     */
    public static final String PROPERTY_ANTVERSION = "antVersion";

    /**
     * Property openbravoVersion stored in column OB_Version in table AD_System_Info 
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_OPENBRAVOVERSION = "openbravoVersion";

    /**
     * Property openbravoInstallMode stored in column OB_Installmode in table AD_System_Info<br>
     * Help: {@literal The method used to install Openbravo.}
     * 
     */
    public static final String PROPERTY_OPENBRAVOINSTALLMODE = "openbravoInstallMode";

    /**
     * Property webServer stored in column Webserver in table AD_System_Info<br>
     * Help: {@literal The Web Server being used by Openbravo}
     * 
     */
    public static final String PROPERTY_WEBSERVER = "webServer";

    /**
     * Property webServerVersion stored in column Webserver_Version in table AD_System_Info<br>
     * Help: {@literal The version of Web Server}
     * 
     */
    public static final String PROPERTY_WEBSERVERVERSION = "webServerVersion";

    /**
     * Property customizationAllowed stored in column Customization_Allowed in table AD_System_Info<br>
     * Help: {@literal In order to customize the CORE module, it's necessary to create an industry template.
     *       Checking this field the industry template is auto-generated.}
     * 
     */
    public static final String PROPERTY_CUSTOMIZATIONALLOWED = "customizationAllowed";

    /**
     * Property lastBuild stored in column Last_Build in table AD_System_Info<br>
     * Help: {@literal Indicates the last time the system was built, its purpose is to add the ability of knowing
     *       which are the modifications done since that time in order to determinate the objects that need to be
     *       re-created.}
     * 
     */
    public static final String PROPERTY_LASTBUILD = "lastBuild";

    /**
     * Property lastDBUpdate stored in column Last_DBUpdate in table AD_System_Info<br>
     * Help: {@literal Indicates the last time the database was updated using dbsm its purpose is to add the
     *       ability of knowing which are the modifications done since that time in order to determinate if it is
     *       necessary to export them or not.}
     * 
     */
    public static final String PROPERTY_LASTDBUPDATE = "lastDBUpdate";

    /**
     * Property dBChecksum stored in column DB_Checksum in table AD_System_Info<br>
     * Help: {@literal Database checksum maintains a checksum for the whole database structure, it is used just
     *       in PostgreSQL databases to know if it was modified after the last update from xml files.}
     * 
     */
    public static final String PROPERTY_DBCHECKSUM = "dBChecksum";

    /**
     * Property yourCompanyLoginImage stored in column Your_Company_Login_Image in table AD_System_Info<br>
     * Help: {@literal Default Company Login image}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYLOGINIMAGE = "yourCompanyLoginImage";

    /**
     * Property yourItServiceLoginImage stored in column Your_It_Service_Login_Image in table AD_System_Info
     * 
     */
    public static final String PROPERTY_YOURITSERVICELOGINIMAGE = "yourItServiceLoginImage";

    /**
     * Property yourCompanyMenuImage stored in column Your_Company_Menu_Image in table AD_System_Info
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYMENUIMAGE = "yourCompanyMenuImage";

    /**
     * Property yourCompanyBigImage stored in column Your_Company_Big_Image in table AD_System_Info
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYBIGIMAGE = "yourCompanyBigImage";

    /**
     * Property yourCompanyDocumentImage stored in column Your_Company_Document_Image in table AD_System_Info
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYDOCUMENTIMAGE = "yourCompanyDocumentImage";

    /**
     * Property supportContact stored in column Support_Contact in table AD_System_Info<br>
     * Help: {@literal IT service support contact}
     * 
     */
    public static final String PROPERTY_SUPPORTCONTACT = "supportContact";

    /**
     * Property systemStatus stored in column System_Status in table AD_System_Info<br>
     * Help: {@literal System Status changes on different build, deploy and servlet container events.}
     * 
     */
    public static final String PROPERTY_SYSTEMSTATUS = "systemStatus";

    /**
     * Property maturityUpdate stored in column Maturity_Update in table AD_System_Info<br>
     * Help: {@literal Defines the minimum accepted maturity status of modules when they are scanned for update.}
     * 
     */
    public static final String PROPERTY_MATURITYUPDATE = "maturityUpdate";

    /**
     * Property maturitySearch stored in column Maturity_Search in table AD_System_Info<br>
     * Help: {@literal Defines the minimum accepted maturity status of modules when they are searched for
     *       installation.}
     * 
     */
    public static final String PROPERTY_MATURITYSEARCH = "maturitySearch";

    /**
     * Property requiresProxyAuthentication stored in column IsProxy_Authenticated in table AD_System_Info<br>
     * Help: {@literal Check this field in case the proxy requires authenticated user/password}
     * 
     */
    public static final String PROPERTY_REQUIRESPROXYAUTHENTICATION = "requiresProxyAuthentication";

    /**
     * Property proxyUser stored in column Proxy_User in table AD_System_Info<br>
     * Help: {@literal User for the authenticated proxy}
     * 
     */
    public static final String PROPERTY_PROXYUSER = "proxyUser";

    /**
     * Property proxyPassword stored in column Proxy_Password in table AD_System_Info<br>
     * Help: {@literal Password for the authenticated proxy}
     * 
     */
    public static final String PROPERTY_PROXYPASSWORD = "proxyPassword";

    /**
     * Property instancePurpose stored in column Instance_Purpose in table AD_System_Info<br>
     * Help: {@literal Determines which is the purpose of the Openbravo instance}
     * 
     */
    public static final String PROPERTY_INSTANCEPURPOSE = "instancePurpose";

    /**
     * Property isusageauditenabled stored in column IsUsageAuditEnabled in table AD_System_Info<br>
     * Help: {@literal When the Usage Audit is enabled each request to the backend is stored on the audit table
     *       (AD_Session_Usage_Audit). For each request is stored the object_id, the module_id, the session_id
     *       and the command.
     *       If the Heartbeat is also enabled the number of requests per module on the last 30
     *       days is sent on each beat.}
     * 
     */
    public static final String PROPERTY_ISUSAGEAUDITENABLED = "isusageauditenabled";

    /**
     * Property changeInstancePurpose stored in column Change_Instance_Purpose in table AD_System_Info<br>
     * Help: {@literal Button to change the purpose of Community Edition instances.}
     * 
     */
    public static final String PROPERTY_CHANGEINSTANCEPURPOSE = "changeInstancePurpose";

    /**
     * Property companyLogo stored in column Company_Logo in table AD_System_Info<br>
     * Help: {@literal This logo will be used in the login screen and inside all Openbravo applications}
     * 
     */
    public static final String PROPERTY_COMPANYLOGO = "companyLogo";

    /**
     * Property showCommunityBranding stored in column Show_Community_Branding in table AD_System_Info<br>
     * Help: {@literal Sets whether Openbravo News are shown to all users or only to the System Administrator.}
     * 
     */
    public static final String PROPERTY_SHOWCOMMUNITYBRANDING = "showCommunityBranding";

    /**
     * Property companyLogoDark stored in column Company_Logo_Dark in table AD_System_Info<br>
     * Help: {@literal This logo will be used in the login screen and inside all Openbravo applications when they
     *       use
     *       a Dark theme. Note that this logo should have different colors or more contrast than the
     *       original logo in order to be seen properly in a dark background.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGODARK = "companyLogoDark";

    /**
     * Property productionBannerImage stored in column Production_Banner_Image_ID in table AD_System_Info<br>
     * Help: {@literal Image used to be shown on instances with Production purpose.
     *       
     *       There is an example image on
     *       the Login folder of the Default skin.}
     * 
     */
    public static final String PROPERTY_PRODUCTIONBANNERIMAGE = "productionBannerImage";

    /**
     * Property companyLogoSubmark stored in column Company_Logo_Submark in table AD_System_Info<br>
     * Help: {@literal The submark logo is a simplified version of the Company Logo which is consistent with your
     *       brand and can be used to replace the Company Logo in places where this logo does not fit, such as in
     *       an application in a narrow screen where the Company Logo has no room to be showed properly}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOSUBMARK = "companyLogoSubmark";

    /**
     * Property companyLogoSubmarkDark stored in column Company_Logo_Submark_Dark in table AD_System_Info<br>
     * Help: {@literal The submark logo is a simplified version of the Company Logo which is consistent with your
     *       brand and can be used to replace the Company Logo in places where this logo does not fit, such as in
     *       an application on a narrow screen where the Company Logo has no room to be showed properly. Note
     *       that this logo should have different colors or more contrast than the original logo in order to be
     *       seen properly over a dark background.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOSUBMARKDARK = "companyLogoSubmarkDark";

    /**
     * Property yourCompanyURL stored in column YourCompanyURL in table AD_System_Info<br>
     * Help: {@literal URL of your Comapany. This info is used to make linkable the Comapany logo in the login
     *       page.}
     * 
     */
    public static final String PROPERTY_YOURCOMPANYURL = "yourCompanyURL";

    /**
     * Property companyLogoForDocs stored in column Company_Logo_For_Docs in table AD_System_Info<br>
     * Help: {@literal Company Logo used to be printed in invoices or other documents}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOFORDOCS = "companyLogoForDocs";

    /**
     * Property companyLogoForReceipts stored in column Company_Logo_For_Receipts in table AD_System_Info<br>
     * Help: {@literal Company Logo used to be printed in receipts. Usually those receipts are printed using only
     *       black ink, so this logo should be adapted to be able to print it properly using only one ink.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOFORRECEIPTS = "companyLogoForReceipts";


    public SystemInformation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ENABLEHEARTBEAT, false);
        setDefaultValue(PROPERTY_PROXYREQUIRED, false);
        setDefaultValue(PROPERTY_TESTHEARTBEAT, "N");
        setDefaultValue(PROPERTY_CUSTOMIZATIONALLOWED, false);
        setDefaultValue(PROPERTY_LASTBUILD, new Date());
        setDefaultValue(PROPERTY_LASTDBUPDATE, new Date());
        setDefaultValue(PROPERTY_MATURITYUPDATE, "500");
        setDefaultValue(PROPERTY_MATURITYSEARCH, "500");
        setDefaultValue(PROPERTY_REQUIRESPROXYAUTHENTICATION, false);
        setDefaultValue(PROPERTY_ISUSAGEAUDITENABLED, true);
        setDefaultValue(PROPERTY_CHANGEINSTANCEPURPOSE, true);
        setDefaultValue(PROPERTY_SHOWCOMMUNITYBRANDING, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see SystemInformation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see SystemInformation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see SystemInformation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see SystemInformation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see SystemInformation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see SystemInformation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see SystemInformation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see SystemInformation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see SystemInformation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see SystemInformation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see SystemInformation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see SystemInformation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see SystemInformation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see SystemInformation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see SystemInformation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see SystemInformation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see SystemInformation#PROPERTY_SYSTEMIDENTIFIER
     * 
     */
    public String getSystemIdentifier() {
        return (String) get(PROPERTY_SYSTEMIDENTIFIER);
    }
    /**
     * @see SystemInformation#PROPERTY_SYSTEMIDENTIFIER
     * 
     */
    public void setSystemIdentifier(String systemIdentifier) {
        set(PROPERTY_SYSTEMIDENTIFIER, systemIdentifier);
    }

    /**
     * @see SystemInformation#PROPERTY_ENABLEHEARTBEAT
     * 
     */
    public Boolean isEnableHeartbeat() {
        return (Boolean) get(PROPERTY_ENABLEHEARTBEAT);
    }
    /**
     * @see SystemInformation#PROPERTY_ENABLEHEARTBEAT
     * 
     */
    public void setEnableHeartbeat(Boolean enableHeartbeat) {
        set(PROPERTY_ENABLEHEARTBEAT, enableHeartbeat);
    }

    /**
     * @see SystemInformation#PROPERTY_POSTPONEDATE
     * 
     */
    public Date getPostponeDate() {
        return (Date) get(PROPERTY_POSTPONEDATE);
    }
    /**
     * @see SystemInformation#PROPERTY_POSTPONEDATE
     * 
     */
    public void setPostponeDate(Date postponeDate) {
        set(PROPERTY_POSTPONEDATE, postponeDate);
    }

    /**
     * @see SystemInformation#PROPERTY_PROXYREQUIRED
     * 
     */
    public Boolean isProxyRequired() {
        return (Boolean) get(PROPERTY_PROXYREQUIRED);
    }
    /**
     * @see SystemInformation#PROPERTY_PROXYREQUIRED
     * 
     */
    public void setProxyRequired(Boolean proxyRequired) {
        set(PROPERTY_PROXYREQUIRED, proxyRequired);
    }

    /**
     * @see SystemInformation#PROPERTY_PROXYSERVER
     * 
     */
    public String getProxyServer() {
        return (String) get(PROPERTY_PROXYSERVER);
    }
    /**
     * @see SystemInformation#PROPERTY_PROXYSERVER
     * 
     */
    public void setProxyServer(String proxyServer) {
        set(PROPERTY_PROXYSERVER, proxyServer);
    }

    /**
     * @see SystemInformation#PROPERTY_PROXYPORT
     * 
     */
    public Long getProxyPort() {
        return (Long) get(PROPERTY_PROXYPORT);
    }
    /**
     * @see SystemInformation#PROPERTY_PROXYPORT
     * 
     */
    public void setProxyPort(Long proxyPort) {
        set(PROPERTY_PROXYPORT, proxyPort);
    }

    /**
     * @see SystemInformation#PROPERTY_TESTHEARTBEAT
     * 
     */
    public String getTestHeartbeat() {
        return (String) get(PROPERTY_TESTHEARTBEAT);
    }
    /**
     * @see SystemInformation#PROPERTY_TESTHEARTBEAT
     * 
     */
    public void setTestHeartbeat(String testHeartbeat) {
        set(PROPERTY_TESTHEARTBEAT, testHeartbeat);
    }

    /**
     * @see SystemInformation#PROPERTY_ANTVERSION
     * 
     */
    public String getAntVersion() {
        return (String) get(PROPERTY_ANTVERSION);
    }
    /**
     * @see SystemInformation#PROPERTY_ANTVERSION
     * 
     */
    public void setAntVersion(String antVersion) {
        set(PROPERTY_ANTVERSION, antVersion);
    }

    /**
     * @see SystemInformation#PROPERTY_OPENBRAVOVERSION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getOpenbravoVersion() {
        return (String) get(PROPERTY_OPENBRAVOVERSION);
    }
    /**
     * @see SystemInformation#PROPERTY_OPENBRAVOVERSION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setOpenbravoVersion(String openbravoVersion) {
        set(PROPERTY_OPENBRAVOVERSION, openbravoVersion);
    }

    /**
     * @see SystemInformation#PROPERTY_OPENBRAVOINSTALLMODE
     * 
     */
    public String getOpenbravoInstallMode() {
        return (String) get(PROPERTY_OPENBRAVOINSTALLMODE);
    }
    /**
     * @see SystemInformation#PROPERTY_OPENBRAVOINSTALLMODE
     * 
     */
    public void setOpenbravoInstallMode(String openbravoInstallMode) {
        set(PROPERTY_OPENBRAVOINSTALLMODE, openbravoInstallMode);
    }

    /**
     * @see SystemInformation#PROPERTY_WEBSERVER
     * 
     */
    public String getWebServer() {
        return (String) get(PROPERTY_WEBSERVER);
    }
    /**
     * @see SystemInformation#PROPERTY_WEBSERVER
     * 
     */
    public void setWebServer(String webServer) {
        set(PROPERTY_WEBSERVER, webServer);
    }

    /**
     * @see SystemInformation#PROPERTY_WEBSERVERVERSION
     * 
     */
    public String getWebServerVersion() {
        return (String) get(PROPERTY_WEBSERVERVERSION);
    }
    /**
     * @see SystemInformation#PROPERTY_WEBSERVERVERSION
     * 
     */
    public void setWebServerVersion(String webServerVersion) {
        set(PROPERTY_WEBSERVERVERSION, webServerVersion);
    }

    /**
     * @see SystemInformation#PROPERTY_CUSTOMIZATIONALLOWED
     * 
     */
    public Boolean isCustomizationAllowed() {
        return (Boolean) get(PROPERTY_CUSTOMIZATIONALLOWED);
    }
    /**
     * @see SystemInformation#PROPERTY_CUSTOMIZATIONALLOWED
     * 
     */
    public void setCustomizationAllowed(Boolean customizationAllowed) {
        set(PROPERTY_CUSTOMIZATIONALLOWED, customizationAllowed);
    }

    /**
     * @see SystemInformation#PROPERTY_LASTBUILD
     * 
     */
    public Date getLastBuild() {
        return (Date) get(PROPERTY_LASTBUILD);
    }
    /**
     * @see SystemInformation#PROPERTY_LASTBUILD
     * 
     */
    public void setLastBuild(Date lastBuild) {
        set(PROPERTY_LASTBUILD, lastBuild);
    }

    /**
     * @see SystemInformation#PROPERTY_LASTDBUPDATE
     * 
     */
    public Date getLastDBUpdate() {
        return (Date) get(PROPERTY_LASTDBUPDATE);
    }
    /**
     * @see SystemInformation#PROPERTY_LASTDBUPDATE
     * 
     */
    public void setLastDBUpdate(Date lastDBUpdate) {
        set(PROPERTY_LASTDBUPDATE, lastDBUpdate);
    }

    /**
     * @see SystemInformation#PROPERTY_DBCHECKSUM
     * 
     */
    public String getDBChecksum() {
        return (String) get(PROPERTY_DBCHECKSUM);
    }
    /**
     * @see SystemInformation#PROPERTY_DBCHECKSUM
     * 
     */
    public void setDBChecksum(String dBChecksum) {
        set(PROPERTY_DBCHECKSUM, dBChecksum);
    }

    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYLOGINIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyLoginImage() {
        return (Image) get(PROPERTY_YOURCOMPANYLOGINIMAGE);
    }
    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYLOGINIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyLoginImage(Image yourCompanyLoginImage) {
        set(PROPERTY_YOURCOMPANYLOGINIMAGE, yourCompanyLoginImage);
    }

    /**
     * @see SystemInformation#PROPERTY_YOURITSERVICELOGINIMAGE
     * 
     */
    public Image getYourItServiceLoginImage() {
        return (Image) get(PROPERTY_YOURITSERVICELOGINIMAGE);
    }
    /**
     * @see SystemInformation#PROPERTY_YOURITSERVICELOGINIMAGE
     * 
     */
    public void setYourItServiceLoginImage(Image yourItServiceLoginImage) {
        set(PROPERTY_YOURITSERVICELOGINIMAGE, yourItServiceLoginImage);
    }

    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYMENUIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyMenuImage() {
        return (Image) get(PROPERTY_YOURCOMPANYMENUIMAGE);
    }
    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYMENUIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyMenuImage(Image yourCompanyMenuImage) {
        set(PROPERTY_YOURCOMPANYMENUIMAGE, yourCompanyMenuImage);
    }

    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYBIGIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyBigImage() {
        return (Image) get(PROPERTY_YOURCOMPANYBIGIMAGE);
    }
    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYBIGIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyBigImage(Image yourCompanyBigImage) {
        set(PROPERTY_YOURCOMPANYBIGIMAGE, yourCompanyBigImage);
    }

    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYDOCUMENTIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyDocumentImage() {
        return (Image) get(PROPERTY_YOURCOMPANYDOCUMENTIMAGE);
    }
    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYDOCUMENTIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyDocumentImage(Image yourCompanyDocumentImage) {
        set(PROPERTY_YOURCOMPANYDOCUMENTIMAGE, yourCompanyDocumentImage);
    }

    /**
     * @see SystemInformation#PROPERTY_SUPPORTCONTACT
     * 
     */
    public String getSupportContact() {
        return (String) get(PROPERTY_SUPPORTCONTACT);
    }
    /**
     * @see SystemInformation#PROPERTY_SUPPORTCONTACT
     * 
     */
    public void setSupportContact(String supportContact) {
        set(PROPERTY_SUPPORTCONTACT, supportContact);
    }

    /**
     * @see SystemInformation#PROPERTY_SYSTEMSTATUS
     * 
     */
    public String getSystemStatus() {
        return (String) get(PROPERTY_SYSTEMSTATUS);
    }
    /**
     * @see SystemInformation#PROPERTY_SYSTEMSTATUS
     * 
     */
    public void setSystemStatus(String systemStatus) {
        set(PROPERTY_SYSTEMSTATUS, systemStatus);
    }

    /**
     * @see SystemInformation#PROPERTY_MATURITYUPDATE
     * 
     */
    public String getMaturityUpdate() {
        return (String) get(PROPERTY_MATURITYUPDATE);
    }
    /**
     * @see SystemInformation#PROPERTY_MATURITYUPDATE
     * 
     */
    public void setMaturityUpdate(String maturityUpdate) {
        set(PROPERTY_MATURITYUPDATE, maturityUpdate);
    }

    /**
     * @see SystemInformation#PROPERTY_MATURITYSEARCH
     * 
     */
    public String getMaturitySearch() {
        return (String) get(PROPERTY_MATURITYSEARCH);
    }
    /**
     * @see SystemInformation#PROPERTY_MATURITYSEARCH
     * 
     */
    public void setMaturitySearch(String maturitySearch) {
        set(PROPERTY_MATURITYSEARCH, maturitySearch);
    }

    /**
     * @see SystemInformation#PROPERTY_REQUIRESPROXYAUTHENTICATION
     * 
     */
    public Boolean isRequiresProxyAuthentication() {
        return (Boolean) get(PROPERTY_REQUIRESPROXYAUTHENTICATION);
    }
    /**
     * @see SystemInformation#PROPERTY_REQUIRESPROXYAUTHENTICATION
     * 
     */
    public void setRequiresProxyAuthentication(Boolean requiresProxyAuthentication) {
        set(PROPERTY_REQUIRESPROXYAUTHENTICATION, requiresProxyAuthentication);
    }

    /**
     * @see SystemInformation#PROPERTY_PROXYUSER
     * 
     */
    public String getProxyUser() {
        return (String) get(PROPERTY_PROXYUSER);
    }
    /**
     * @see SystemInformation#PROPERTY_PROXYUSER
     * 
     */
    public void setProxyUser(String proxyUser) {
        set(PROPERTY_PROXYUSER, proxyUser);
    }

    /**
     * @see SystemInformation#PROPERTY_PROXYPASSWORD
     * 
     */
    public String getProxyPassword() {
        return (String) get(PROPERTY_PROXYPASSWORD);
    }
    /**
     * @see SystemInformation#PROPERTY_PROXYPASSWORD
     * 
     */
    public void setProxyPassword(String proxyPassword) {
        set(PROPERTY_PROXYPASSWORD, proxyPassword);
    }

    /**
     * @see SystemInformation#PROPERTY_INSTANCEPURPOSE
     * 
     */
    public String getInstancePurpose() {
        return (String) get(PROPERTY_INSTANCEPURPOSE);
    }
    /**
     * @see SystemInformation#PROPERTY_INSTANCEPURPOSE
     * 
     */
    public void setInstancePurpose(String instancePurpose) {
        set(PROPERTY_INSTANCEPURPOSE, instancePurpose);
    }

    /**
     * @see SystemInformation#PROPERTY_ISUSAGEAUDITENABLED
     * 
     */
    public Boolean isUsageauditenabled() {
        return (Boolean) get(PROPERTY_ISUSAGEAUDITENABLED);
    }
    /**
     * @see SystemInformation#PROPERTY_ISUSAGEAUDITENABLED
     * 
     */
    public void setUsageauditenabled(Boolean isusageauditenabled) {
        set(PROPERTY_ISUSAGEAUDITENABLED, isusageauditenabled);
    }

    /**
     * @see SystemInformation#PROPERTY_CHANGEINSTANCEPURPOSE
     * 
     */
    public Boolean isChangeInstancePurpose() {
        return (Boolean) get(PROPERTY_CHANGEINSTANCEPURPOSE);
    }
    /**
     * @see SystemInformation#PROPERTY_CHANGEINSTANCEPURPOSE
     * 
     */
    public void setChangeInstancePurpose(Boolean changeInstancePurpose) {
        set(PROPERTY_CHANGEINSTANCEPURPOSE, changeInstancePurpose);
    }

    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGO
     * 
     */
    public Image getCompanyLogo() {
        return (Image) get(PROPERTY_COMPANYLOGO);
    }
    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGO
     * 
     */
    public void setCompanyLogo(Image companyLogo) {
        set(PROPERTY_COMPANYLOGO, companyLogo);
    }

    /**
     * @see SystemInformation#PROPERTY_SHOWCOMMUNITYBRANDING
     * 
     */
    public Boolean isShowCommunityBranding() {
        return (Boolean) get(PROPERTY_SHOWCOMMUNITYBRANDING);
    }
    /**
     * @see SystemInformation#PROPERTY_SHOWCOMMUNITYBRANDING
     * 
     */
    public void setShowCommunityBranding(Boolean showCommunityBranding) {
        set(PROPERTY_SHOWCOMMUNITYBRANDING, showCommunityBranding);
    }

    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGODARK
     * 
     */
    public Image getCompanyLogoDark() {
        return (Image) get(PROPERTY_COMPANYLOGODARK);
    }
    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGODARK
     * 
     */
    public void setCompanyLogoDark(Image companyLogoDark) {
        set(PROPERTY_COMPANYLOGODARK, companyLogoDark);
    }

    /**
     * @see SystemInformation#PROPERTY_PRODUCTIONBANNERIMAGE
     * 
     */
    public Image getProductionBannerImage() {
        return (Image) get(PROPERTY_PRODUCTIONBANNERIMAGE);
    }
    /**
     * @see SystemInformation#PROPERTY_PRODUCTIONBANNERIMAGE
     * 
     */
    public void setProductionBannerImage(Image productionBannerImage) {
        set(PROPERTY_PRODUCTIONBANNERIMAGE, productionBannerImage);
    }

    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOSUBMARK
     * 
     */
    public Image getCompanyLogoSubmark() {
        return (Image) get(PROPERTY_COMPANYLOGOSUBMARK);
    }
    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOSUBMARK
     * 
     */
    public void setCompanyLogoSubmark(Image companyLogoSubmark) {
        set(PROPERTY_COMPANYLOGOSUBMARK, companyLogoSubmark);
    }

    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOSUBMARKDARK
     * 
     */
    public Image getCompanyLogoSubmarkDark() {
        return (Image) get(PROPERTY_COMPANYLOGOSUBMARKDARK);
    }
    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOSUBMARKDARK
     * 
     */
    public void setCompanyLogoSubmarkDark(Image companyLogoSubmarkDark) {
        set(PROPERTY_COMPANYLOGOSUBMARKDARK, companyLogoSubmarkDark);
    }

    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYURL
     * 
     */
    public String getYourCompanyURL() {
        return (String) get(PROPERTY_YOURCOMPANYURL);
    }
    /**
     * @see SystemInformation#PROPERTY_YOURCOMPANYURL
     * 
     */
    public void setYourCompanyURL(String yourCompanyURL) {
        set(PROPERTY_YOURCOMPANYURL, yourCompanyURL);
    }

    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOFORDOCS
     * 
     */
    public Image getCompanyLogoForDocs() {
        return (Image) get(PROPERTY_COMPANYLOGOFORDOCS);
    }
    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOFORDOCS
     * 
     */
    public void setCompanyLogoForDocs(Image companyLogoForDocs) {
        set(PROPERTY_COMPANYLOGOFORDOCS, companyLogoForDocs);
    }

    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOFORRECEIPTS
     * 
     */
    public Image getCompanyLogoForReceipts() {
        return (Image) get(PROPERTY_COMPANYLOGOFORRECEIPTS);
    }
    /**
     * @see SystemInformation#PROPERTY_COMPANYLOGOFORRECEIPTS
     * 
     */
    public void setCompanyLogoForReceipts(Image companyLogoForReceipts) {
        set(PROPERTY_COMPANYLOGOFORRECEIPTS, companyLogoForReceipts);
    }

}
