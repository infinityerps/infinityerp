
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

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADHeartbeatLog (stored in table AD_Heartbeat_Log).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class HeartbeatLog extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Heartbeat_Log";
    public static final String ENTITY_NAME = "ADHeartbeatLog";

    /**
     * Property id stored in column AD_Heartbeat_Log_ID in table AD_Heartbeat_Log 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Heartbeat_Log 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Heartbeat_Log 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Heartbeat_Log 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Heartbeat_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Heartbeat_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Heartbeat_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Heartbeat_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property systemIdentifier stored in column System_Identifier in table AD_Heartbeat_Log 
     * 
     */
    public static final String PROPERTY_SYSTEMIDENTIFIER = "systemIdentifier";

    /**
     * Property enableHeartbeat stored in column Isheartbeatactive in table AD_Heartbeat_Log<br>
     * Help: {@literal Disable Heartbeat process}
     * 
     */
    public static final String PROPERTY_ENABLEHEARTBEAT = "enableHeartbeat";

    /**
     * Property proxyRequired stored in column Isproxyrequired in table AD_Heartbeat_Log<br>
     * Help: {@literal Proxy configuration required to access internet.}
     * 
     */
    public static final String PROPERTY_PROXYREQUIRED = "proxyRequired";

    /**
     * Property proxyServer stored in column Proxy_Server in table AD_Heartbeat_Log<br>
     * Help: {@literal Proxy server name.}
     * 
     */
    public static final String PROPERTY_PROXYSERVER = "proxyServer";

    /**
     * Property proxyPort stored in column Proxy_Port in table AD_Heartbeat_Log<br>
     * Help: {@literal Proxy port on the proxy server.}
     * 
     */
    public static final String PROPERTY_PROXYPORT = "proxyPort";

    /**
     * Property activityRate stored in column Activity_Rate in table AD_Heartbeat_Log<br>
     * Help: {@literal The rate of activity within the system.}
     * 
     */
    public static final String PROPERTY_ACTIVITYRATE = "activityRate";

    /**
     * Property complexityRate stored in column Complexity_Rate in table AD_Heartbeat_Log<br>
     * Help: {@literal The rate of complexity within the system.}
     * 
     */
    public static final String PROPERTY_COMPLEXITYRATE = "complexityRate";

    /**
     * Property operatingSystem stored in column Os in table AD_Heartbeat_Log<br>
     * Help: {@literal The type of Operating System.}
     * 
     */
    public static final String PROPERTY_OPERATINGSYSTEM = "operatingSystem";

    /**
     * Property operatingSystemVersion stored in column OS_Version in table AD_Heartbeat_Log<br>
     * Help: {@literal The version of Operating System.}
     * 
     */
    public static final String PROPERTY_OPERATINGSYSTEMVERSION = "operatingSystemVersion";

    /**
     * Property database stored in column Db in table AD_Heartbeat_Log<br>
     * Help: {@literal The database in use by the system.}
     * 
     */
    public static final String PROPERTY_DATABASE = "database";

    /**
     * Property databaseVersion stored in column DB_Version in table AD_Heartbeat_Log<br>
     * Help: {@literal The version of database.}
     * 
     */
    public static final String PROPERTY_DATABASEVERSION = "databaseVersion";

    /**
     * Property servletContainer stored in column Servlet_Container in table AD_Heartbeat_Log<br>
     * Help: {@literal The type of servlet container Openbravo runs in.}
     * 
     */
    public static final String PROPERTY_SERVLETCONTAINER = "servletContainer";

    /**
     * Property servletContainerVersion stored in column Servlet_Container_Version in table AD_Heartbeat_Log<br>
     * Help: {@literal The version of Servlet Container Openbravo runs in.}
     * 
     */
    public static final String PROPERTY_SERVLETCONTAINERVERSION = "servletContainerVersion";

    /**
     * Property webServer stored in column Webserver in table AD_Heartbeat_Log<br>
     * Help: {@literal The Web Server being used by Openbravo}
     * 
     */
    public static final String PROPERTY_WEBSERVER = "webServer";

    /**
     * Property webServerVersion stored in column Webserver_Version in table AD_Heartbeat_Log<br>
     * Help: {@literal The version of Web Server}
     * 
     */
    public static final String PROPERTY_WEBSERVERVERSION = "webServerVersion";

    /**
     * Property javaVersion stored in column Java_Version in table AD_Heartbeat_Log<br>
     * Help: {@literal Java Version}
     * 
     */
    public static final String PROPERTY_JAVAVERSION = "javaVersion";

    /**
     * Property antVersion stored in column ANT_Version in table AD_Heartbeat_Log<br>
     * Help: {@literal The version of Ant used to build the application.}
     * 
     */
    public static final String PROPERTY_ANTVERSION = "antVersion";

    /**
     * Property openbravoVersion stored in column OB_Version in table AD_Heartbeat_Log 
     * 
     */
    public static final String PROPERTY_OPENBRAVOVERSION = "openbravoVersion";

    /**
     * Property openbravoInstallMode stored in column OB_Installmode in table AD_Heartbeat_Log<br>
     * Help: {@literal The method used to install Openbravo.}
     * 
     */
    public static final String PROPERTY_OPENBRAVOINSTALLMODE = "openbravoInstallMode";

    /**
     * Property numberOfRegisteredUsers stored in column NUM_Registered_Users in table AD_Heartbeat_Log<br>
     * Help: {@literal Number of registered users}
     * 
     */
    public static final String PROPERTY_NUMBEROFREGISTEREDUSERS = "numberOfRegisteredUsers";

    /**
     * Property beatType stored in column Beat_Type in table AD_Heartbeat_Log<br>
     * Help: {@literal The different type of beats: enabling heartbeat, disabling heartbeat, scheduled beat,
     *       unknown}
     * 
     */
    public static final String PROPERTY_BEATTYPE = "beatType";

    /**
     * Property databaseIdentifier stored in column DB_Identifier in table AD_Heartbeat_Log<br>
     * Help: {@literal Unique Identifier of the instance's database, calculated based on the identifier provided
     *       by the database itself.}
     * 
     */
    public static final String PROPERTY_DATABASEIDENTIFIER = "databaseIdentifier";

    /**
     * Property macIdentifier stored in column MAC_Identifier in table AD_Heartbeat_Log<br>
     * Help: {@literal Mac Address Identifier of the server hosting the instance.}
     * 
     */
    public static final String PROPERTY_MACIDENTIFIER = "macIdentifier";

    /**
     * Property installedModules stored in column Installed_Modules in table AD_Heartbeat_Log<br>
     * Help: {@literal List of the modules installed in the instance}
     * 
     */
    public static final String PROPERTY_INSTALLEDMODULES = "installedModules";

    /**
     * Property activationKeyIdentifier stored in column Obps_Identifier in table AD_Heartbeat_Log<br>
     * Help: {@literal Activation Key Identifier is a CRC of Activation Key}
     * 
     */
    public static final String PROPERTY_ACTIVATIONKEYIDENTIFIER = "activationKeyIdentifier";

    /**
     * Property firstLogin stored in column First_Login in table AD_Heartbeat_Log<br>
     * Help: {@literal Date of first login in the application}
     * 
     */
    public static final String PROPERTY_FIRSTLOGIN = "firstLogin";

    /**
     * Property lastLogin stored in column Last_Login in table AD_Heartbeat_Log<br>
     * Help: {@literal Date of last login in the application}
     * 
     */
    public static final String PROPERTY_LASTLOGIN = "lastLogin";

    /**
     * Property totalLogins stored in column Total_Logins in table AD_Heartbeat_Log<br>
     * Help: {@literal Total number of logins}
     * 
     */
    public static final String PROPERTY_TOTALLOGINS = "totalLogins";

    /**
     * Property totalLoginsLastMonth stored in column Total_Logins_Month in table AD_Heartbeat_Log<br>
     * Help: {@literal Total number of logins during last 30 days}
     * 
     */
    public static final String PROPERTY_TOTALLOGINSLASTMONTH = "totalLoginsLastMonth";

    /**
     * Property concurrentUsersAverage stored in column Avg_Concurrent_Usr in table AD_Heartbeat_Log<br>
     * Help: {@literal Average number of concurrent users during last 30 days}
     * 
     */
    public static final String PROPERTY_CONCURRENTUSERSAVERAGE = "concurrentUsersAverage";

    /**
     * Property usagePercentage stored in column Usage_Percentage in table AD_Heartbeat_Log<br>
     * Help: {@literal Percentage of time the instance has been in use (at least one session active) during last
     *       30 days.}
     * 
     */
    public static final String PROPERTY_USAGEPERCENTAGE = "usagePercentage";

    /**
     * Property maximumConcurrentUsers stored in column MAX_Concurrent_Users in table AD_Heartbeat_Log<br>
     * Help: {@literal Maximum number of concurrent users during last 30 days}
     * 
     */
    public static final String PROPERTY_MAXIMUMCONCURRENTUSERS = "maximumConcurrentUsers";

    /**
     * Property numberOfClients stored in column Client_Number in table AD_Heartbeat_Log<br>
     * Help: {@literal Total number of clients in the instance.}
     * 
     */
    public static final String PROPERTY_NUMBEROFCLIENTS = "numberOfClients";

    /**
     * Property numberOfOrganizations stored in column Org_Number in table AD_Heartbeat_Log<br>
     * Help: {@literal Total number of organizations in the instance.}
     * 
     */
    public static final String PROPERTY_NUMBEROFORGANIZATIONS = "numberOfOrganizations";

    /**
     * Property usageAuditEnabled stored in column Is_Usage_Audit_Enabled in table AD_Heartbeat_Log<br>
     * Help: {@literal In case Usage Audit is enabled, the beat will send information about how much each of the
     *       installed modules has been used during last 30 days.}
     * 
     */
    public static final String PROPERTY_USAGEAUDITENABLED = "usageAuditEnabled";

    /**
     * Property instancePurpose stored in column Instance_Purpose in table AD_Heartbeat_Log<br>
     * Help: {@literal Determines which is the purpose of the Openbravo instance}
     * 
     */
    public static final String PROPERTY_INSTANCEPURPOSE = "instancePurpose";

    /**
     * Property rejectedLoginsDueConcUsers stored in column Rejected_Logins_Due_Conc_Users in table AD_Heartbeat_Log<br>
     * Help: {@literal Number of rejected logins due to concurrent users limit on the last 30 days}
     * 
     */
    public static final String PROPERTY_REJECTEDLOGINSDUECONCUSERS = "rejectedLoginsDueConcUsers";

    /**
     * Property instanceNumber stored in column InstanceNo in table AD_Heartbeat_Log<br>
     * Help: {@literal Each Professional Edition license can activate multiple instances, this number is an
     *       identifier for each of the instances registered for the current license.}
     * 
     */
    public static final String PROPERTY_INSTANCENUMBER = "instanceNumber";

    /**
     * Property enableCustomQueries stored in column IsCustomQueryEnabled in table AD_Heartbeat_Log<br>
     * Help: {@literal The Custom Queries are queries that can be sent by the Heartbeat server to be executed on
     *       the Openbravo instance. This queries are used the get more extended information about the usage of
     *       the instance.
     *       
     *       By disabling this option standard beats will be sent to HeartBeat server, but not
     *       these Custom Queries.}
     * 
     */
    public static final String PROPERTY_ENABLECUSTOMQUERIES = "enableCustomQueries";

    /**
     * Property wSCallsMaximum stored in column WS_Calls_Max in table AD_Heartbeat_Log<br>
     * Help: {@literal Maximum number of Web Service calls per day in last 30 days}
     * 
     */
    public static final String PROPERTY_WSCALLSMAXIMUM = "wSCallsMaximum";

    /**
     * Property wSCallsAverage stored in column WS_Calls_Avg in table AD_Heartbeat_Log<br>
     * Help: {@literal Average number of Web Service calls per day in last 30 days}
     * 
     */
    public static final String PROPERTY_WSCALLSAVERAGE = "wSCallsAverage";

    /**
     * Property connectorCallsMax stored in column WSC_Calls_Max in table AD_Heartbeat_Log<br>
     * Help: {@literal Maximum number of Connector calls per day in last 30 days}
     * 
     */
    public static final String PROPERTY_CONNECTORCALLSMAX = "connectorCallsMax";

    /**
     * Property connectorCallsAverage stored in column WSC_Calls_Avg in table AD_Heartbeat_Log<br>
     * Help: {@literal Average number of Connector calls per day in last 30 days}
     * 
     */
    public static final String PROPERTY_CONNECTORCALLSAVERAGE = "connectorCallsAverage";

    /**
     * Property wSRejectedMaximum stored in column WS_Rejected_Max in table AD_Heartbeat_Log<br>
     * Help: {@literal Maximum number of Web Service rejected calls per day in last 30 days}
     * 
     */
    public static final String PROPERTY_WSREJECTEDMAXIMUM = "wSRejectedMaximum";

    /**
     * Property wSRejectedAverage stored in column WS_Rejected_Avg in table AD_Heartbeat_Log<br>
     * Help: {@literal Average number of  rejected Web Service calls per day in last 30 days}
     * 
     */
    public static final String PROPERTY_WSREJECTEDAVERAGE = "wSRejectedAverage";


    public HeartbeatLog() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ENABLEHEARTBEAT, false);
        setDefaultValue(PROPERTY_PROXYREQUIRED, false);
        setDefaultValue(PROPERTY_BEATTYPE, "U");
        setDefaultValue(PROPERTY_USAGEAUDITENABLED, false);
        setDefaultValue(PROPERTY_ENABLECUSTOMQUERIES, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see HeartbeatLog#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see HeartbeatLog#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see HeartbeatLog#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see HeartbeatLog#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see HeartbeatLog#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see HeartbeatLog#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see HeartbeatLog#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see HeartbeatLog#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see HeartbeatLog#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see HeartbeatLog#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see HeartbeatLog#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see HeartbeatLog#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see HeartbeatLog#PROPERTY_SYSTEMIDENTIFIER
     * 
     */
    public String getSystemIdentifier() {
        return (String) get(PROPERTY_SYSTEMIDENTIFIER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_SYSTEMIDENTIFIER
     * 
     */
    public void setSystemIdentifier(String systemIdentifier) {
        set(PROPERTY_SYSTEMIDENTIFIER, systemIdentifier);
    }

    /**
     * @see HeartbeatLog#PROPERTY_ENABLEHEARTBEAT
     * 
     */
    public Boolean isEnableHeartbeat() {
        return (Boolean) get(PROPERTY_ENABLEHEARTBEAT);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ENABLEHEARTBEAT
     * 
     */
    public void setEnableHeartbeat(Boolean enableHeartbeat) {
        set(PROPERTY_ENABLEHEARTBEAT, enableHeartbeat);
    }

    /**
     * @see HeartbeatLog#PROPERTY_PROXYREQUIRED
     * 
     */
    public Boolean isProxyRequired() {
        return (Boolean) get(PROPERTY_PROXYREQUIRED);
    }
    /**
     * @see HeartbeatLog#PROPERTY_PROXYREQUIRED
     * 
     */
    public void setProxyRequired(Boolean proxyRequired) {
        set(PROPERTY_PROXYREQUIRED, proxyRequired);
    }

    /**
     * @see HeartbeatLog#PROPERTY_PROXYSERVER
     * 
     */
    public String getProxyServer() {
        return (String) get(PROPERTY_PROXYSERVER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_PROXYSERVER
     * 
     */
    public void setProxyServer(String proxyServer) {
        set(PROPERTY_PROXYSERVER, proxyServer);
    }

    /**
     * @see HeartbeatLog#PROPERTY_PROXYPORT
     * 
     */
    public Long getProxyPort() {
        return (Long) get(PROPERTY_PROXYPORT);
    }
    /**
     * @see HeartbeatLog#PROPERTY_PROXYPORT
     * 
     */
    public void setProxyPort(Long proxyPort) {
        set(PROPERTY_PROXYPORT, proxyPort);
    }

    /**
     * @see HeartbeatLog#PROPERTY_ACTIVITYRATE
     * 
     */
    public BigDecimal getActivityRate() {
        return (BigDecimal) get(PROPERTY_ACTIVITYRATE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ACTIVITYRATE
     * 
     */
    public void setActivityRate(BigDecimal activityRate) {
        set(PROPERTY_ACTIVITYRATE, activityRate);
    }

    /**
     * @see HeartbeatLog#PROPERTY_COMPLEXITYRATE
     * 
     */
    public BigDecimal getComplexityRate() {
        return (BigDecimal) get(PROPERTY_COMPLEXITYRATE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_COMPLEXITYRATE
     * 
     */
    public void setComplexityRate(BigDecimal complexityRate) {
        set(PROPERTY_COMPLEXITYRATE, complexityRate);
    }

    /**
     * @see HeartbeatLog#PROPERTY_OPERATINGSYSTEM
     * 
     */
    public String getOperatingSystem() {
        return (String) get(PROPERTY_OPERATINGSYSTEM);
    }
    /**
     * @see HeartbeatLog#PROPERTY_OPERATINGSYSTEM
     * 
     */
    public void setOperatingSystem(String operatingSystem) {
        set(PROPERTY_OPERATINGSYSTEM, operatingSystem);
    }

    /**
     * @see HeartbeatLog#PROPERTY_OPERATINGSYSTEMVERSION
     * 
     */
    public String getOperatingSystemVersion() {
        return (String) get(PROPERTY_OPERATINGSYSTEMVERSION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_OPERATINGSYSTEMVERSION
     * 
     */
    public void setOperatingSystemVersion(String operatingSystemVersion) {
        set(PROPERTY_OPERATINGSYSTEMVERSION, operatingSystemVersion);
    }

    /**
     * @see HeartbeatLog#PROPERTY_DATABASE
     * 
     */
    public String getDatabase() {
        return (String) get(PROPERTY_DATABASE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_DATABASE
     * 
     */
    public void setDatabase(String database) {
        set(PROPERTY_DATABASE, database);
    }

    /**
     * @see HeartbeatLog#PROPERTY_DATABASEVERSION
     * 
     */
    public String getDatabaseVersion() {
        return (String) get(PROPERTY_DATABASEVERSION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_DATABASEVERSION
     * 
     */
    public void setDatabaseVersion(String databaseVersion) {
        set(PROPERTY_DATABASEVERSION, databaseVersion);
    }

    /**
     * @see HeartbeatLog#PROPERTY_SERVLETCONTAINER
     * 
     */
    public String getServletContainer() {
        return (String) get(PROPERTY_SERVLETCONTAINER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_SERVLETCONTAINER
     * 
     */
    public void setServletContainer(String servletContainer) {
        set(PROPERTY_SERVLETCONTAINER, servletContainer);
    }

    /**
     * @see HeartbeatLog#PROPERTY_SERVLETCONTAINERVERSION
     * 
     */
    public String getServletContainerVersion() {
        return (String) get(PROPERTY_SERVLETCONTAINERVERSION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_SERVLETCONTAINERVERSION
     * 
     */
    public void setServletContainerVersion(String servletContainerVersion) {
        set(PROPERTY_SERVLETCONTAINERVERSION, servletContainerVersion);
    }

    /**
     * @see HeartbeatLog#PROPERTY_WEBSERVER
     * 
     */
    public String getWebServer() {
        return (String) get(PROPERTY_WEBSERVER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_WEBSERVER
     * 
     */
    public void setWebServer(String webServer) {
        set(PROPERTY_WEBSERVER, webServer);
    }

    /**
     * @see HeartbeatLog#PROPERTY_WEBSERVERVERSION
     * 
     */
    public String getWebServerVersion() {
        return (String) get(PROPERTY_WEBSERVERVERSION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_WEBSERVERVERSION
     * 
     */
    public void setWebServerVersion(String webServerVersion) {
        set(PROPERTY_WEBSERVERVERSION, webServerVersion);
    }

    /**
     * @see HeartbeatLog#PROPERTY_JAVAVERSION
     * 
     */
    public String getJavaVersion() {
        return (String) get(PROPERTY_JAVAVERSION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_JAVAVERSION
     * 
     */
    public void setJavaVersion(String javaVersion) {
        set(PROPERTY_JAVAVERSION, javaVersion);
    }

    /**
     * @see HeartbeatLog#PROPERTY_ANTVERSION
     * 
     */
    public String getAntVersion() {
        return (String) get(PROPERTY_ANTVERSION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ANTVERSION
     * 
     */
    public void setAntVersion(String antVersion) {
        set(PROPERTY_ANTVERSION, antVersion);
    }

    /**
     * @see HeartbeatLog#PROPERTY_OPENBRAVOVERSION
     * 
     */
    public String getOpenbravoVersion() {
        return (String) get(PROPERTY_OPENBRAVOVERSION);
    }
    /**
     * @see HeartbeatLog#PROPERTY_OPENBRAVOVERSION
     * 
     */
    public void setOpenbravoVersion(String openbravoVersion) {
        set(PROPERTY_OPENBRAVOVERSION, openbravoVersion);
    }

    /**
     * @see HeartbeatLog#PROPERTY_OPENBRAVOINSTALLMODE
     * 
     */
    public String getOpenbravoInstallMode() {
        return (String) get(PROPERTY_OPENBRAVOINSTALLMODE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_OPENBRAVOINSTALLMODE
     * 
     */
    public void setOpenbravoInstallMode(String openbravoInstallMode) {
        set(PROPERTY_OPENBRAVOINSTALLMODE, openbravoInstallMode);
    }

    /**
     * @see HeartbeatLog#PROPERTY_NUMBEROFREGISTEREDUSERS
     * 
     */
    public Long getNumberOfRegisteredUsers() {
        return (Long) get(PROPERTY_NUMBEROFREGISTEREDUSERS);
    }
    /**
     * @see HeartbeatLog#PROPERTY_NUMBEROFREGISTEREDUSERS
     * 
     */
    public void setNumberOfRegisteredUsers(Long numberOfRegisteredUsers) {
        set(PROPERTY_NUMBEROFREGISTEREDUSERS, numberOfRegisteredUsers);
    }

    /**
     * @see HeartbeatLog#PROPERTY_BEATTYPE
     * 
     */
    public String getBeatType() {
        return (String) get(PROPERTY_BEATTYPE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_BEATTYPE
     * 
     */
    public void setBeatType(String beatType) {
        set(PROPERTY_BEATTYPE, beatType);
    }

    /**
     * @see HeartbeatLog#PROPERTY_DATABASEIDENTIFIER
     * 
     */
    public String getDatabaseIdentifier() {
        return (String) get(PROPERTY_DATABASEIDENTIFIER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_DATABASEIDENTIFIER
     * 
     */
    public void setDatabaseIdentifier(String databaseIdentifier) {
        set(PROPERTY_DATABASEIDENTIFIER, databaseIdentifier);
    }

    /**
     * @see HeartbeatLog#PROPERTY_MACIDENTIFIER
     * 
     */
    public String getMacIdentifier() {
        return (String) get(PROPERTY_MACIDENTIFIER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_MACIDENTIFIER
     * 
     */
    public void setMacIdentifier(String macIdentifier) {
        set(PROPERTY_MACIDENTIFIER, macIdentifier);
    }

    /**
     * @see HeartbeatLog#PROPERTY_INSTALLEDMODULES
     * 
     */
    public String getInstalledModules() {
        return (String) get(PROPERTY_INSTALLEDMODULES);
    }
    /**
     * @see HeartbeatLog#PROPERTY_INSTALLEDMODULES
     * 
     */
    public void setInstalledModules(String installedModules) {
        set(PROPERTY_INSTALLEDMODULES, installedModules);
    }

    /**
     * @see HeartbeatLog#PROPERTY_ACTIVATIONKEYIDENTIFIER
     * 
     */
    public String getActivationKeyIdentifier() {
        return (String) get(PROPERTY_ACTIVATIONKEYIDENTIFIER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ACTIVATIONKEYIDENTIFIER
     * 
     */
    public void setActivationKeyIdentifier(String activationKeyIdentifier) {
        set(PROPERTY_ACTIVATIONKEYIDENTIFIER, activationKeyIdentifier);
    }

    /**
     * @see HeartbeatLog#PROPERTY_FIRSTLOGIN
     * 
     */
    public Date getFirstLogin() {
        return (Date) get(PROPERTY_FIRSTLOGIN);
    }
    /**
     * @see HeartbeatLog#PROPERTY_FIRSTLOGIN
     * 
     */
    public void setFirstLogin(Date firstLogin) {
        set(PROPERTY_FIRSTLOGIN, firstLogin);
    }

    /**
     * @see HeartbeatLog#PROPERTY_LASTLOGIN
     * 
     */
    public Date getLastLogin() {
        return (Date) get(PROPERTY_LASTLOGIN);
    }
    /**
     * @see HeartbeatLog#PROPERTY_LASTLOGIN
     * 
     */
    public void setLastLogin(Date lastLogin) {
        set(PROPERTY_LASTLOGIN, lastLogin);
    }

    /**
     * @see HeartbeatLog#PROPERTY_TOTALLOGINS
     * 
     */
    public Long getTotalLogins() {
        return (Long) get(PROPERTY_TOTALLOGINS);
    }
    /**
     * @see HeartbeatLog#PROPERTY_TOTALLOGINS
     * 
     */
    public void setTotalLogins(Long totalLogins) {
        set(PROPERTY_TOTALLOGINS, totalLogins);
    }

    /**
     * @see HeartbeatLog#PROPERTY_TOTALLOGINSLASTMONTH
     * 
     */
    public Long getTotalLoginsLastMonth() {
        return (Long) get(PROPERTY_TOTALLOGINSLASTMONTH);
    }
    /**
     * @see HeartbeatLog#PROPERTY_TOTALLOGINSLASTMONTH
     * 
     */
    public void setTotalLoginsLastMonth(Long totalLoginsLastMonth) {
        set(PROPERTY_TOTALLOGINSLASTMONTH, totalLoginsLastMonth);
    }

    /**
     * @see HeartbeatLog#PROPERTY_CONCURRENTUSERSAVERAGE
     * 
     */
    public BigDecimal getConcurrentUsersAverage() {
        return (BigDecimal) get(PROPERTY_CONCURRENTUSERSAVERAGE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_CONCURRENTUSERSAVERAGE
     * 
     */
    public void setConcurrentUsersAverage(BigDecimal concurrentUsersAverage) {
        set(PROPERTY_CONCURRENTUSERSAVERAGE, concurrentUsersAverage);
    }

    /**
     * @see HeartbeatLog#PROPERTY_USAGEPERCENTAGE
     * 
     */
    public BigDecimal getUsagePercentage() {
        return (BigDecimal) get(PROPERTY_USAGEPERCENTAGE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_USAGEPERCENTAGE
     * 
     */
    public void setUsagePercentage(BigDecimal usagePercentage) {
        set(PROPERTY_USAGEPERCENTAGE, usagePercentage);
    }

    /**
     * @see HeartbeatLog#PROPERTY_MAXIMUMCONCURRENTUSERS
     * 
     */
    public Long getMaximumConcurrentUsers() {
        return (Long) get(PROPERTY_MAXIMUMCONCURRENTUSERS);
    }
    /**
     * @see HeartbeatLog#PROPERTY_MAXIMUMCONCURRENTUSERS
     * 
     */
    public void setMaximumConcurrentUsers(Long maximumConcurrentUsers) {
        set(PROPERTY_MAXIMUMCONCURRENTUSERS, maximumConcurrentUsers);
    }

    /**
     * @see HeartbeatLog#PROPERTY_NUMBEROFCLIENTS
     * 
     */
    public Long getNumberOfClients() {
        return (Long) get(PROPERTY_NUMBEROFCLIENTS);
    }
    /**
     * @see HeartbeatLog#PROPERTY_NUMBEROFCLIENTS
     * 
     */
    public void setNumberOfClients(Long numberOfClients) {
        set(PROPERTY_NUMBEROFCLIENTS, numberOfClients);
    }

    /**
     * @see HeartbeatLog#PROPERTY_NUMBEROFORGANIZATIONS
     * 
     */
    public Long getNumberOfOrganizations() {
        return (Long) get(PROPERTY_NUMBEROFORGANIZATIONS);
    }
    /**
     * @see HeartbeatLog#PROPERTY_NUMBEROFORGANIZATIONS
     * 
     */
    public void setNumberOfOrganizations(Long numberOfOrganizations) {
        set(PROPERTY_NUMBEROFORGANIZATIONS, numberOfOrganizations);
    }

    /**
     * @see HeartbeatLog#PROPERTY_USAGEAUDITENABLED
     * 
     */
    public Boolean isUsageAuditEnabled() {
        return (Boolean) get(PROPERTY_USAGEAUDITENABLED);
    }
    /**
     * @see HeartbeatLog#PROPERTY_USAGEAUDITENABLED
     * 
     */
    public void setUsageAuditEnabled(Boolean usageAuditEnabled) {
        set(PROPERTY_USAGEAUDITENABLED, usageAuditEnabled);
    }

    /**
     * @see HeartbeatLog#PROPERTY_INSTANCEPURPOSE
     * 
     */
    public String getInstancePurpose() {
        return (String) get(PROPERTY_INSTANCEPURPOSE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_INSTANCEPURPOSE
     * 
     */
    public void setInstancePurpose(String instancePurpose) {
        set(PROPERTY_INSTANCEPURPOSE, instancePurpose);
    }

    /**
     * @see HeartbeatLog#PROPERTY_REJECTEDLOGINSDUECONCUSERS
     * 
     */
    public Long getRejectedLoginsDueConcUsers() {
        return (Long) get(PROPERTY_REJECTEDLOGINSDUECONCUSERS);
    }
    /**
     * @see HeartbeatLog#PROPERTY_REJECTEDLOGINSDUECONCUSERS
     * 
     */
    public void setRejectedLoginsDueConcUsers(Long rejectedLoginsDueConcUsers) {
        set(PROPERTY_REJECTEDLOGINSDUECONCUSERS, rejectedLoginsDueConcUsers);
    }

    /**
     * @see HeartbeatLog#PROPERTY_INSTANCENUMBER
     * 
     */
    public Long getInstanceNumber() {
        return (Long) get(PROPERTY_INSTANCENUMBER);
    }
    /**
     * @see HeartbeatLog#PROPERTY_INSTANCENUMBER
     * 
     */
    public void setInstanceNumber(Long instanceNumber) {
        set(PROPERTY_INSTANCENUMBER, instanceNumber);
    }

    /**
     * @see HeartbeatLog#PROPERTY_ENABLECUSTOMQUERIES
     * 
     */
    public Boolean isEnableCustomQueries() {
        return (Boolean) get(PROPERTY_ENABLECUSTOMQUERIES);
    }
    /**
     * @see HeartbeatLog#PROPERTY_ENABLECUSTOMQUERIES
     * 
     */
    public void setEnableCustomQueries(Boolean enableCustomQueries) {
        set(PROPERTY_ENABLECUSTOMQUERIES, enableCustomQueries);
    }

    /**
     * @see HeartbeatLog#PROPERTY_WSCALLSMAXIMUM
     * 
     */
    public Long getWSCallsMaximum() {
        return (Long) get(PROPERTY_WSCALLSMAXIMUM);
    }
    /**
     * @see HeartbeatLog#PROPERTY_WSCALLSMAXIMUM
     * 
     */
    public void setWSCallsMaximum(Long wSCallsMaximum) {
        set(PROPERTY_WSCALLSMAXIMUM, wSCallsMaximum);
    }

    /**
     * @see HeartbeatLog#PROPERTY_WSCALLSAVERAGE
     * 
     */
    public BigDecimal getWSCallsAverage() {
        return (BigDecimal) get(PROPERTY_WSCALLSAVERAGE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_WSCALLSAVERAGE
     * 
     */
    public void setWSCallsAverage(BigDecimal wSCallsAverage) {
        set(PROPERTY_WSCALLSAVERAGE, wSCallsAverage);
    }

    /**
     * @see HeartbeatLog#PROPERTY_CONNECTORCALLSMAX
     * 
     */
    public Long getConnectorCallsMax() {
        return (Long) get(PROPERTY_CONNECTORCALLSMAX);
    }
    /**
     * @see HeartbeatLog#PROPERTY_CONNECTORCALLSMAX
     * 
     */
    public void setConnectorCallsMax(Long connectorCallsMax) {
        set(PROPERTY_CONNECTORCALLSMAX, connectorCallsMax);
    }

    /**
     * @see HeartbeatLog#PROPERTY_CONNECTORCALLSAVERAGE
     * 
     */
    public BigDecimal getConnectorCallsAverage() {
        return (BigDecimal) get(PROPERTY_CONNECTORCALLSAVERAGE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_CONNECTORCALLSAVERAGE
     * 
     */
    public void setConnectorCallsAverage(BigDecimal connectorCallsAverage) {
        set(PROPERTY_CONNECTORCALLSAVERAGE, connectorCallsAverage);
    }

    /**
     * @see HeartbeatLog#PROPERTY_WSREJECTEDMAXIMUM
     * 
     */
    public Long getWSRejectedMaximum() {
        return (Long) get(PROPERTY_WSREJECTEDMAXIMUM);
    }
    /**
     * @see HeartbeatLog#PROPERTY_WSREJECTEDMAXIMUM
     * 
     */
    public void setWSRejectedMaximum(Long wSRejectedMaximum) {
        set(PROPERTY_WSREJECTEDMAXIMUM, wSRejectedMaximum);
    }

    /**
     * @see HeartbeatLog#PROPERTY_WSREJECTEDAVERAGE
     * 
     */
    public BigDecimal getWSRejectedAverage() {
        return (BigDecimal) get(PROPERTY_WSREJECTEDAVERAGE);
    }
    /**
     * @see HeartbeatLog#PROPERTY_WSREJECTEDAVERAGE
     * 
     */
    public void setWSRejectedAverage(BigDecimal wSRejectedAverage) {
        set(PROPERTY_WSREJECTEDAVERAGE, wSRejectedAverage);
    }

}
