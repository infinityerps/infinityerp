
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

import it.embio.exportdata.data.MexdReportAccess;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.application.ViewRoleAccess;
import org.openbravo.client.myob.WidgetClassAccess;
import org.openbravo.model.ad.alert.AlertRecipient;
import org.openbravo.model.ad.domain.Preference;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Tree;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADRole (stored in table AD_Role).
 * <br>
 * Help: {@literal Define the role and add the client and organizations the role has access to. You can give
     *       users access to this role and modify the access of this role to windows, forms, processes and
     *       reports as well as tasks. <BR>If the Role User Level is Manual, the as
     *       Select Role for with Data
     *       Access Restrictions}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Role extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Role";
    public static final String ENTITY_NAME = "ADRole";

    /**
     * Property id stored in column AD_Role_ID in table AD_Role<br>
     * Help: {@literal The Role determines security and access a user who has this Role will have in the System.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Role 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Role 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Role 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Role 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Role 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Role 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property name stored in column Name in table AD_Role 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Role 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table AD_Role<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property userLevel stored in column UserLevel in table AD_Role<br>
     * Help: {@literal The User Level field determines if users of this Role will have access to System level
     *       data, Organization level data, Client level data or Client and Organization level data.}
     * 
     */
    public static final String PROPERTY_USERLEVEL = "userLevel";

    /**
     * Property currency stored in column C_Currency_ID in table AD_Role<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property approvalAmount stored in column AmtApproval in table AD_Role<br>
     * Help: {@literal The Approval Amount field indicates the amount limit this Role has for approval of
     *       documents.}
     * 
     */
    public static final String PROPERTY_APPROVALAMOUNT = "approvalAmount";

    /**
     * Property primaryTreeMenu stored in column AD_Tree_Menu_ID in table AD_Role<br>
     * Help: {@literal Tree Menu}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEMENU = "primaryTreeMenu";

    /**
     * Property manual stored in column IsManual in table AD_Role<br>
     * Help: {@literal The Manual check box indicates if the process will done manually.}
     * 
     */
    public static final String PROPERTY_MANUAL = "manual";

    /**
     * Property processNow stored in column Processing in table AD_Role<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property clientAdmin stored in column IS_Client_Admin in table AD_Role<br>
     * Help: {@literal Defines the role as an administrator of the client it belongs to.}
     * 
     */
    public static final String PROPERTY_CLIENTADMIN = "clientAdmin";

    /**
     * Property advanced stored in column IsAdvanced in table AD_Role<br>
     * Help: {@literal Automatic (non manual) advanced roles are granted with features checked as advanced.}
     * 
     */
    public static final String PROPERTY_ADVANCED = "advanced";

    /**
     * Property isrestrictbackend stored in column Isrestrictbackend in table AD_Role<br>
     * Help: {@literal If checked, this role will not have access to the backend. It will however have access to
     *       other applications (such as the WebPOS)}
     * 
     */
    public static final String PROPERTY_ISRESTRICTBACKEND = "isrestrictbackend";

    /**
     * Property forPortalUsers stored in column IsPortal in table AD_Role<br>
     * Help: {@literal If checked, this role will have a simplified (portal) interface, where it only has
     *       available the workspace widgets.}
     * 
     */
    public static final String PROPERTY_FORPORTALUSERS = "forPortalUsers";

    /**
     * Property portalAdmin stored in column IsPortalAdmin in table AD_Role<br>
     * Help: {@literal If checked, the Portal Role will have Portal Administrator privileges}
     * 
     */
    public static final String PROPERTY_PORTALADMIN = "portalAdmin";

    /**
     * Property isWebServiceEnabled stored in column IsWebServiceEnabled in table AD_Role<br>
     * Help: {@literal If checked, web services will be able to obtain data for users with this role. It applies
     *       to both JSON REST and XML REST web services}
     * 
     */
    public static final String PROPERTY_ISWEBSERVICEENABLED = "isWebServiceEnabled";

    /**
     * Property template stored in column IsTemplate in table AD_Role<br>
     * Help: {@literal Template is checked when the element is used as a template.}
     * 
     */
    public static final String PROPERTY_TEMPLATE = "template";

    /**
     * Property recalculatePermissions stored in column Recalculatepermissions in table AD_Role<br>
     * Help: {@literal This process recalculates role permissions, based on the role inheritance defined.
     *       Depending on the role type the behavior varies:
     *       - If the role is a template one, the permissions for
     *       the role will be recalculated and also propagated to every role which is currently inheriting from
     *       this template.
     *       - If the role is not marked as template, just the permissions for this role are
     *       recalculated.
     *       For details - http://wiki.openbravo.com/wiki/Role#Permissions_Inheritance}
     * 
     */
    public static final String PROPERTY_RECALCULATEPERMISSIONS = "recalculatePermissions";

    /**
     * Property aDAlertRecipientList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADALERTRECIPIENTLIST = "aDAlertRecipientList";

    /**
     * Property aDFormAccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADFORMACCESSLIST = "aDFormAccessList";

    /**
     * Property aDPreferenceVisibleAtRoleList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADPREFERENCEVISIBLEATROLELIST = "aDPreferenceVisibleAtRoleList";

    /**
     * Property aDProcessAccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADPROCESSACCESSLIST = "aDProcessAccessList";

    /**
     * Property aDRoleInheritanceInheritFromList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADROLEINHERITANCEINHERITFROMLIST = "aDRoleInheritanceInheritFromList";

    /**
     * Property aDRoleInheritanceList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADROLEINHERITANCELIST = "aDRoleInheritanceList";

    /**
     * Property aDRoleOrganizationList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADROLEORGANIZATIONLIST = "aDRoleOrganizationList";

    /**
     * Property aDTableAccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADTABLEACCESSLIST = "aDTableAccessList";

    /**
     * Property aDUserRolesList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADUSERROLESLIST = "aDUserRolesList";

    /**
     * Property aDWindowAccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_ADWINDOWACCESSLIST = "aDWindowAccessList";

    /**
     * Property oBKMOWidgetClassAccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_OBKMOWIDGETCLASSACCESSLIST = "oBKMOWidgetClassAccessList";

    /**
     * Property oBUIAPPProcessAccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_OBUIAPPPROCESSACCESSLIST = "oBUIAPPProcessAccessList";

    /**
     * Property emexReportaccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_EMEXREPORTACCESSLIST = "emexReportaccessList";

    /**
     * Property obuiappViewRoleAccessList stored in table AD_Role
     * 
     */
    public static final String PROPERTY_OBUIAPPVIEWROLEACCESSLIST = "obuiappViewRoleAccessList";


    public Role() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MANUAL, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_CLIENTADMIN, false);
        setDefaultValue(PROPERTY_ADVANCED, false);
        setDefaultValue(PROPERTY_ISRESTRICTBACKEND, false);
        setDefaultValue(PROPERTY_FORPORTALUSERS, false);
        setDefaultValue(PROPERTY_PORTALADMIN, false);
        setDefaultValue(PROPERTY_ISWEBSERVICEENABLED, false);
        setDefaultValue(PROPERTY_TEMPLATE, false);
        setDefaultValue(PROPERTY_RECALCULATEPERMISSIONS, false);
        setDefaultValue(PROPERTY_ADALERTRECIPIENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADFORMACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADPREFERENCEVISIBLEATROLELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADPROCESSACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADROLEINHERITANCEINHERITFROMLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADROLEINHERITANCELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADROLEORGANIZATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADTABLEACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADUSERROLESLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADWINDOWACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBKMOWIDGETCLASSACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPPROCESSACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EMEXREPORTACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPVIEWROLEACCESSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Role#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Role#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Role#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Role#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Role#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Role#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Role#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Role#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Role#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Role#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Role#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Role#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Role#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Role#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Role#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Role#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Role#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Role#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Role#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Role#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Role#PROPERTY_USERLEVEL
     * 
     */
    public String getUserLevel() {
        return (String) get(PROPERTY_USERLEVEL);
    }
    /**
     * @see Role#PROPERTY_USERLEVEL
     * 
     */
    public void setUserLevel(String userLevel) {
        set(PROPERTY_USERLEVEL, userLevel);
    }

    /**
     * @see Role#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Role#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Role#PROPERTY_APPROVALAMOUNT
     * 
     */
    public BigDecimal getApprovalAmount() {
        return (BigDecimal) get(PROPERTY_APPROVALAMOUNT);
    }
    /**
     * @see Role#PROPERTY_APPROVALAMOUNT
     * 
     */
    public void setApprovalAmount(BigDecimal approvalAmount) {
        set(PROPERTY_APPROVALAMOUNT, approvalAmount);
    }

    /**
     * @see Role#PROPERTY_PRIMARYTREEMENU
     * 
     */
    public Tree getPrimaryTreeMenu() {
        return (Tree) get(PROPERTY_PRIMARYTREEMENU);
    }
    /**
     * @see Role#PROPERTY_PRIMARYTREEMENU
     * 
     */
    public void setPrimaryTreeMenu(Tree primaryTreeMenu) {
        set(PROPERTY_PRIMARYTREEMENU, primaryTreeMenu);
    }

    /**
     * @see Role#PROPERTY_MANUAL
     * 
     */
    public Boolean isManual() {
        return (Boolean) get(PROPERTY_MANUAL);
    }
    /**
     * @see Role#PROPERTY_MANUAL
     * 
     */
    public void setManual(Boolean manual) {
        set(PROPERTY_MANUAL, manual);
    }

    /**
     * @see Role#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Role#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Role#PROPERTY_CLIENTADMIN
     * 
     */
    public Boolean isClientAdmin() {
        return (Boolean) get(PROPERTY_CLIENTADMIN);
    }
    /**
     * @see Role#PROPERTY_CLIENTADMIN
     * 
     */
    public void setClientAdmin(Boolean clientAdmin) {
        set(PROPERTY_CLIENTADMIN, clientAdmin);
    }

    /**
     * @see Role#PROPERTY_ADVANCED
     * 
     */
    public Boolean isAdvanced() {
        return (Boolean) get(PROPERTY_ADVANCED);
    }
    /**
     * @see Role#PROPERTY_ADVANCED
     * 
     */
    public void setAdvanced(Boolean advanced) {
        set(PROPERTY_ADVANCED, advanced);
    }

    /**
     * @see Role#PROPERTY_ISRESTRICTBACKEND
     * 
     */
    public Boolean isRestrictbackend() {
        return (Boolean) get(PROPERTY_ISRESTRICTBACKEND);
    }
    /**
     * @see Role#PROPERTY_ISRESTRICTBACKEND
     * 
     */
    public void setRestrictbackend(Boolean isrestrictbackend) {
        set(PROPERTY_ISRESTRICTBACKEND, isrestrictbackend);
    }

    /**
     * @see Role#PROPERTY_FORPORTALUSERS
     * 
     */
    public Boolean isForPortalUsers() {
        return (Boolean) get(PROPERTY_FORPORTALUSERS);
    }
    /**
     * @see Role#PROPERTY_FORPORTALUSERS
     * 
     */
    public void setForPortalUsers(Boolean forPortalUsers) {
        set(PROPERTY_FORPORTALUSERS, forPortalUsers);
    }

    /**
     * @see Role#PROPERTY_PORTALADMIN
     * 
     */
    public Boolean isPortalAdmin() {
        return (Boolean) get(PROPERTY_PORTALADMIN);
    }
    /**
     * @see Role#PROPERTY_PORTALADMIN
     * 
     */
    public void setPortalAdmin(Boolean portalAdmin) {
        set(PROPERTY_PORTALADMIN, portalAdmin);
    }

    /**
     * @see Role#PROPERTY_ISWEBSERVICEENABLED
     * 
     */
    public Boolean isWebServiceEnabled() {
        return (Boolean) get(PROPERTY_ISWEBSERVICEENABLED);
    }
    /**
     * @see Role#PROPERTY_ISWEBSERVICEENABLED
     * 
     */
    public void setWebServiceEnabled(Boolean isWebServiceEnabled) {
        set(PROPERTY_ISWEBSERVICEENABLED, isWebServiceEnabled);
    }

    /**
     * @see Role#PROPERTY_TEMPLATE
     * 
     */
    public Boolean isTemplate() {
        return (Boolean) get(PROPERTY_TEMPLATE);
    }
    /**
     * @see Role#PROPERTY_TEMPLATE
     * 
     */
    public void setTemplate(Boolean template) {
        set(PROPERTY_TEMPLATE, template);
    }

    /**
     * @see Role#PROPERTY_RECALCULATEPERMISSIONS
     * 
     */
    public Boolean isRecalculatePermissions() {
        return (Boolean) get(PROPERTY_RECALCULATEPERMISSIONS);
    }
    /**
     * @see Role#PROPERTY_RECALCULATEPERMISSIONS
     * 
     */
    public void setRecalculatePermissions(Boolean recalculatePermissions) {
        set(PROPERTY_RECALCULATEPERMISSIONS, recalculatePermissions);
    }

    /**
     * Help: {@literal This table contains the recipients of the alert, they can be defined as individual users
     *       or as roles.}<br>
     * @see AlertRecipient
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AlertRecipient> getADAlertRecipientList() {
      return (List<AlertRecipient>) get(PROPERTY_ADALERTRECIPIENTLIST);
    }

    /**
     * Help: {@literal This table contains the recipients of the alert, they can be defined as individual users
     *       or as roles.}<br>
     * @see AlertRecipient
     * 
     */
    public void setADAlertRecipientList(List<AlertRecipient> aDAlertRecipientList) {
        set(PROPERTY_ADALERTRECIPIENTLIST, aDAlertRecipientList);
    }

    /**
     * Help: {@literal The Form Access Tab defines the Forms and type of access that this Role is granted.
     *       The
     *       Forms Access Tab defines the access rules for this form}<br>
     * @see FormAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FormAccess> getADFormAccessList() {
      return (List<FormAccess>) get(PROPERTY_ADFORMACCESSLIST);
    }

    /**
     * Help: {@literal The Form Access Tab defines the Forms and type of access that this Role is granted.
     *       The
     *       Forms Access Tab defines the access rules for this form}<br>
     * @see FormAccess
     * 
     */
    public void setADFormAccessList(List<FormAccess> aDFormAccessList) {
        set(PROPERTY_ADFORMACCESSLIST, aDFormAccessList);
    }

    /**
     * Help: {@literal Defines preferences (default values) for a user.}<br>
     * @see Preference
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Preference> getADPreferenceVisibleAtRoleList() {
      return (List<Preference>) get(PROPERTY_ADPREFERENCEVISIBLEATROLELIST);
    }

    /**
     * Help: {@literal Defines preferences (default values) for a user.}<br>
     * @see Preference
     * 
     */
    public void setADPreferenceVisibleAtRoleList(List<Preference> aDPreferenceVisibleAtRoleList) {
        set(PROPERTY_ADPREFERENCEVISIBLEATROLELIST, aDPreferenceVisibleAtRoleList);
    }

    /**
     * Help: {@literal The Process Access Tab defines the Processes and type of access that this Role is
     *       granted.
     *       The Report Access Tab determines who can access a report or process}<br>
     * @see ProcessAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProcessAccess> getADProcessAccessList() {
      return (List<ProcessAccess>) get(PROPERTY_ADPROCESSACCESSLIST);
    }

    /**
     * Help: {@literal The Process Access Tab defines the Processes and type of access that this Role is
     *       granted.
     *       The Report Access Tab determines who can access a report or process}<br>
     * @see ProcessAccess
     * 
     */
    public void setADProcessAccessList(List<ProcessAccess> aDProcessAccessList) {
        set(PROPERTY_ADPROCESSACCESSLIST, aDProcessAccessList);
    }

    /**
     * Help: {@literal Defines the roles used by a role to define its access to the different application
     *       elements (organizations, windows, processes, reports etc.) retrieved by the inheritance process.}<br>
     * @see RoleInheritance
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RoleInheritance> getADRoleInheritanceInheritFromList() {
      return (List<RoleInheritance>) get(PROPERTY_ADROLEINHERITANCEINHERITFROMLIST);
    }

    /**
     * Help: {@literal Defines the roles used by a role to define its access to the different application
     *       elements (organizations, windows, processes, reports etc.) retrieved by the inheritance process.}<br>
     * @see RoleInheritance
     * 
     */
    public void setADRoleInheritanceInheritFromList(List<RoleInheritance> aDRoleInheritanceInheritFromList) {
        set(PROPERTY_ADROLEINHERITANCEINHERITFROMLIST, aDRoleInheritanceInheritFromList);
    }

    /**
     * Help: {@literal Defines the roles used by a role to define its access to the different application
     *       elements (organizations, windows, processes, reports etc.) retrieved by the inheritance process.}<br>
     * @see RoleInheritance
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RoleInheritance> getADRoleInheritanceList() {
      return (List<RoleInheritance>) get(PROPERTY_ADROLEINHERITANCELIST);
    }

    /**
     * Help: {@literal Defines the roles used by a role to define its access to the different application
     *       elements (organizations, windows, processes, reports etc.) retrieved by the inheritance process.}<br>
     * @see RoleInheritance
     * 
     */
    public void setADRoleInheritanceList(List<RoleInheritance> aDRoleInheritanceList) {
        set(PROPERTY_ADROLEINHERITANCELIST, aDRoleInheritanceList);
    }

    /**
     * Help: {@literal Add the client organizations the user has access to.}<br>
     * @see RoleOrganization
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RoleOrganization> getADRoleOrganizationList() {
      return (List<RoleOrganization>) get(PROPERTY_ADROLEORGANIZATIONLIST);
    }

    /**
     * Help: {@literal Add the client organizations the user has access to.}<br>
     * @see RoleOrganization
     * 
     */
    public void setADRoleOrganizationList(List<RoleOrganization> aDRoleOrganizationList) {
        set(PROPERTY_ADROLEORGANIZATIONLIST, aDRoleOrganizationList);
    }

    /**
     * Help: {@literal If listed here, the Role can(not) access all data of this table, even if the role has
     *       access to the functionality}<br>
     * @see TableAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TableAccess> getADTableAccessList() {
      return (List<TableAccess>) get(PROPERTY_ADTABLEACCESSLIST);
    }

    /**
     * Help: {@literal If listed here, the Role can(not) access all data of this table, even if the role has
     *       access to the functionality}<br>
     * @see TableAccess
     * 
     */
    public void setADTableAccessList(List<TableAccess> aDTableAccessList) {
        set(PROPERTY_ADTABLEACCESSLIST, aDTableAccessList);
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
     * Help: {@literal The Window Access Tab defines the Roles which have access to this Window.
     *       The Window
     *       Access Tab defines the Windows and type of access that this Role is granted.}<br>
     * @see WindowAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WindowAccess> getADWindowAccessList() {
      return (List<WindowAccess>) get(PROPERTY_ADWINDOWACCESSLIST);
    }

    /**
     * Help: {@literal The Window Access Tab defines the Roles which have access to this Window.
     *       The Window
     *       Access Tab defines the Windows and type of access that this Role is granted.}<br>
     * @see WindowAccess
     * 
     */
    public void setADWindowAccessList(List<WindowAccess> aDWindowAccessList) {
        set(PROPERTY_ADWINDOWACCESSLIST, aDWindowAccessList);
    }

    /**
     * @see WidgetClassAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WidgetClassAccess> getOBKMOWidgetClassAccessList() {
      return (List<WidgetClassAccess>) get(PROPERTY_OBKMOWIDGETCLASSACCESSLIST);
    }

    /**
     * @see WidgetClassAccess
     * 
     */
    public void setOBKMOWidgetClassAccessList(List<WidgetClassAccess> oBKMOWidgetClassAccessList) {
        set(PROPERTY_OBKMOWIDGETCLASSACCESSLIST, oBKMOWidgetClassAccessList);
    }

    /**
     * @see org.openbravo.client.application.ProcessAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<org.openbravo.client.application.ProcessAccess> getOBUIAPPProcessAccessList() {
      return (List<org.openbravo.client.application.ProcessAccess>) get(PROPERTY_OBUIAPPPROCESSACCESSLIST);
    }

    /**
     * @see org.openbravo.client.application.ProcessAccess
     * 
     */
    public void setOBUIAPPProcessAccessList(List<org.openbravo.client.application.ProcessAccess> oBUIAPPProcessAccessList) {
        set(PROPERTY_OBUIAPPPROCESSACCESSLIST, oBUIAPPProcessAccessList);
    }

    /**
     * @see MexdReportAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MexdReportAccess> getEmexReportaccessList() {
      return (List<MexdReportAccess>) get(PROPERTY_EMEXREPORTACCESSLIST);
    }

    /**
     * @see MexdReportAccess
     * 
     */
    public void setEmexReportaccessList(List<MexdReportAccess> emexReportaccessList) {
        set(PROPERTY_EMEXREPORTACCESSLIST, emexReportaccessList);
    }

    /**
     * Help: {@literal Defines the access to Openbravo view implementations.}<br>
     * @see ViewRoleAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ViewRoleAccess> getObuiappViewRoleAccessList() {
      return (List<ViewRoleAccess>) get(PROPERTY_OBUIAPPVIEWROLEACCESSLIST);
    }

    /**
     * Help: {@literal Defines the access to Openbravo view implementations.}<br>
     * @see ViewRoleAccess
     * 
     */
    public void setObuiappViewRoleAccessList(List<ViewRoleAccess> obuiappViewRoleAccessList) {
        set(PROPERTY_OBUIAPPVIEWROLEACCESSLIST, obuiappViewRoleAccessList);
    }

}
