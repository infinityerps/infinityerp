
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
package org.openbravo.model.externalbpartner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.externalsystem.ExternalSystemData;
/**
 * Entity class for entity C_ExtBP_Config (stored in table C_ExtBP_Config).
 * <br>
 * Help: {@literal The concrete CRM Connector must add a configuration in this window to allow to connect to
     *       the external CRM system and to define the properties and filters used by Openbravo to map with the
     *       external system information.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExternalBusinessPartnerConfig extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ExtBP_Config";
    public static final String ENTITY_NAME = "C_ExtBP_Config";

    /**
     * Property id stored in column C_Extbp_Config_ID in table C_ExtBP_Config<br>
     * Help: {@literal Configuration to connect to the CRM system API, and which also defines the properties and
     *       filters used by Openbravo to map with the external system information.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ExtBP_Config 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ExtBP_Config 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_ExtBP_Config 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ExtBP_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_ExtBP_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ExtBP_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_ExtBP_Config 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_ExtBP_Config 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_ExtBP_Config<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property uRL stored in column Url in table C_ExtBP_Config<br>
     * Help: {@literal The URL defines an online address for this element.}
     * 
     */
    public static final String PROPERTY_URL = "uRL";

    /**
     * Property username stored in column Username in table C_ExtBP_Config<br>
     * Help: {@literal Name that identifies the user in the System}
     * 
     */
    public static final String PROPERTY_USERNAME = "username";

    /**
     * Property password stored in column Password in table C_ExtBP_Config<br>
     * Help: {@literal The Password indicates the Password for this User Id.  Passwords are required to identify
     *       authorized users.}
     * 
     */
    public static final String PROPERTY_PASSWORD = "password";

    /**
     * Property timeout stored in column Timeout in table C_ExtBP_Config<br>
     * Help: {@literal Timeout is the value in seconds set by the user for the request to the defined service.}
     * 
     */
    public static final String PROPERTY_TIMEOUT = "timeout";

    /**
     * Property columnsdetailview stored in column Columnsdetailview in table C_ExtBP_Config
     * 
     */
    public static final String PROPERTY_COLUMNSDETAILVIEW = "columnsdetailview";

    /**
     * Property connectivityType stored in column Connectivity_Type in table C_ExtBP_Config<br>
     * Help: {@literal Indicates whether a CRM connector configuration supports working just online or if it
     *       supports working both online and offline}
     * 
     */
    public static final String PROPERTY_CONNECTIVITYTYPE = "connectivityType";

    /**
     * Property externalSystem stored in column C_External_System_ID in table C_ExtBP_Config<br>
     * Help: {@literal Keeps the configuration data that is required to communicate with an external system}
     * 
     */
    public static final String PROPERTY_EXTERNALSYSTEM = "externalSystem";

    /**
     * Property typeOfIntegration stored in column Type_Of_Integration in table C_ExtBP_Config
     * 
     */
    public static final String PROPERTY_TYPEOFINTEGRATION = "typeOfIntegration";

    /**
     * Property showcustomeridentifier stored in column Showcustomeridentifier in table C_ExtBP_Config<br>
     * Help: {@literal If TRUE, the properties configured in the API Property for Customers tab will be used as
     *       the customer identifier when displaying the external customer and it will be necessary to call the
     *       CRM Connector to get this information.
     *       If FALSE, no call will be made to the CRM Connector to get
     *       the customer information, and the external customer reference will be shown as identifier if it
     *       exists.}
     * 
     */
    public static final String PROPERTY_SHOWCUSTOMERIDENTIFIER = "showcustomeridentifier";

    /**
     * Property extBPConfigFilterList stored in table C_ExtBP_Config
     * 
     */
    public static final String PROPERTY_EXTBPCONFIGFILTERLIST = "extBPConfigFilterList";

    /**
     * Property extBPConfigPropertyList stored in table C_ExtBP_Config
     * 
     */
    public static final String PROPERTY_EXTBPCONFIGPROPERTYLIST = "extBPConfigPropertyList";


    public ExternalBusinessPartnerConfig() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COLUMNSDETAILVIEW, (long) 3);
        setDefaultValue(PROPERTY_CONNECTIVITYTYPE, "ON");
        setDefaultValue(PROPERTY_SHOWCUSTOMERIDENTIFIER, true);
        setDefaultValue(PROPERTY_EXTBPCONFIGFILTERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EXTBPCONFIGPROPERTYLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_URL
     * 
     */
    public String getURL() {
        return (String) get(PROPERTY_URL);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_URL
     * 
     */
    public void setURL(String uRL) {
        set(PROPERTY_URL, uRL);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_USERNAME
     * 
     */
    public String getUsername() {
        return (String) get(PROPERTY_USERNAME);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_USERNAME
     * 
     */
    public void setUsername(String username) {
        set(PROPERTY_USERNAME, username);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_PASSWORD
     * 
     */
    public String getPassword() {
        return (String) get(PROPERTY_PASSWORD);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_PASSWORD
     * 
     */
    public void setPassword(String password) {
        set(PROPERTY_PASSWORD, password);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_TIMEOUT
     * 
     */
    public Long getTimeout() {
        return (Long) get(PROPERTY_TIMEOUT);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_TIMEOUT
     * 
     */
    public void setTimeout(Long timeout) {
        set(PROPERTY_TIMEOUT, timeout);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_COLUMNSDETAILVIEW
     * 
     */
    public Long getColumnsdetailview() {
        return (Long) get(PROPERTY_COLUMNSDETAILVIEW);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_COLUMNSDETAILVIEW
     * 
     */
    public void setColumnsdetailview(Long columnsdetailview) {
        set(PROPERTY_COLUMNSDETAILVIEW, columnsdetailview);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CONNECTIVITYTYPE
     * 
     */
    public String getConnectivityType() {
        return (String) get(PROPERTY_CONNECTIVITYTYPE);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_CONNECTIVITYTYPE
     * 
     */
    public void setConnectivityType(String connectivityType) {
        set(PROPERTY_CONNECTIVITYTYPE, connectivityType);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_EXTERNALSYSTEM
     * 
     */
    public ExternalSystemData getExternalSystem() {
        return (ExternalSystemData) get(PROPERTY_EXTERNALSYSTEM);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_EXTERNALSYSTEM
     * 
     */
    public void setExternalSystem(ExternalSystemData externalSystem) {
        set(PROPERTY_EXTERNALSYSTEM, externalSystem);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_TYPEOFINTEGRATION
     * 
     */
    public String getTypeOfIntegration() {
        return (String) get(PROPERTY_TYPEOFINTEGRATION);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_TYPEOFINTEGRATION
     * 
     */
    public void setTypeOfIntegration(String typeOfIntegration) {
        set(PROPERTY_TYPEOFINTEGRATION, typeOfIntegration);
    }

    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_SHOWCUSTOMERIDENTIFIER
     * 
     */
    public Boolean isShowcustomeridentifier() {
        return (Boolean) get(PROPERTY_SHOWCUSTOMERIDENTIFIER);
    }
    /**
     * @see ExternalBusinessPartnerConfig#PROPERTY_SHOWCUSTOMERIDENTIFIER
     * 
     */
    public void setShowcustomeridentifier(Boolean showcustomeridentifier) {
        set(PROPERTY_SHOWCUSTOMERIDENTIFIER, showcustomeridentifier);
    }

    /**
     * Help: {@literal Filters for CRM Connectors. The filter has a defined type and it's linked to one or many
     *       properties}<br>
     * @see ExternalBusinessPartnerConfigFilter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ExternalBusinessPartnerConfigFilter> getExtBPConfigFilterList() {
      return (List<ExternalBusinessPartnerConfigFilter>) get(PROPERTY_EXTBPCONFIGFILTERLIST);
    }

    /**
     * Help: {@literal Filters for CRM Connectors. The filter has a defined type and it's linked to one or many
     *       properties}<br>
     * @see ExternalBusinessPartnerConfigFilter
     * 
     */
    public void setExtBPConfigFilterList(List<ExternalBusinessPartnerConfigFilter> extBPConfigFilterList) {
        set(PROPERTY_EXTBPCONFIGFILTERLIST, extBPConfigFilterList);
    }

    /**
     * Help: {@literal A property is like a Map which matches an external API key with an Openbravo
     *       AD_Message_ID. It defines the data type and any other related configuration}<br>
     * @see ExternalBusinessPartnerConfigProperty
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ExternalBusinessPartnerConfigProperty> getExtBPConfigPropertyList() {
      return (List<ExternalBusinessPartnerConfigProperty>) get(PROPERTY_EXTBPCONFIGPROPERTYLIST);
    }

    /**
     * Help: {@literal A property is like a Map which matches an external API key with an Openbravo
     *       AD_Message_ID. It defines the data type and any other related configuration}<br>
     * @see ExternalBusinessPartnerConfigProperty
     * 
     */
    public void setExtBPConfigPropertyList(List<ExternalBusinessPartnerConfigProperty> extBPConfigPropertyList) {
        set(PROPERTY_EXTBPCONFIGPROPERTYLIST, extBPConfigPropertyList);
    }

}
