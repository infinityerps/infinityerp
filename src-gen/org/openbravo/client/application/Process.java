
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
package org.openbravo.client.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_Process (stored in table OBUIAPP_Process).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Process extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_Process";
    public static final String ENTITY_NAME = "OBUIAPP_Process";

    /**
     * Property id stored in column Obuiapp_Process_ID in table OBUIAPP_Process<br>
     * Help: {@literal Process Defintion is a re implementation of Process with 3.0 infrastructure.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_Process 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_Process 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_Process 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table OBUIAPP_Process<br>
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
     * Property name stored in column Name in table OBUIAPP_Process 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBUIAPP_Process<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table OBUIAPP_Process<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property dataAccessLevel stored in column Accesslevel in table OBUIAPP_Process<br>
     * Help: {@literal Indicates what type of data (in terms of AD_CLIENT and AD_ORG data columns) can be entered
     *       or viewed. We can classify data in 4 major categories:
     *       - System (AD_CLIENT_ID=0, AD_ORG_ID=0) -
     *       system data (such as metadata for window, tab and field definition)
     *       - Organization (AD_CLIENT<>0,
     *       AD_ORG_ID<>0) - data particular to an organization (such as sales orders)
     *       - Client/Organization
     *       (AD_CLIENT<>0, AD_ORG_ID=anything) - data particular to an organization or shared among all
     *       organizations within one client
     *       - Client (AD_CLIENT<>0, AD_ORG_ID=0) - data that is specific to a
     *       client but can be used by all organizations within that client
     *       
     *       or All (AD_CLIENT=anything,
     *       AD_ORG_ID=anything)}
     * 
     */
    public static final String PROPERTY_DATAACCESSLEVEL = "dataAccessLevel";

    /**
     * Property javaClassName stored in column Classname in table OBUIAPP_Process<br>
     * Help: {@literal The classname is used when generating a representation of the table in java (the entity or
     *       business object). The classname is the simplename of the class (so without the package name). Often
     *       the AD_Table.name can be used here. The combination of classname and package needs to be unique.}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property background stored in column Isbackground in table OBUIAPP_Process<br>
     * Help: {@literal This identifies a background process that will be run without any user interaction and
     *       needs to be scheduled properly before it will be run using the "Process Scheduling" window.}
     * 
     */
    public static final String PROPERTY_BACKGROUND = "background";

    /**
     * Property module stored in column AD_Module_ID in table OBUIAPP_Process<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property uIPattern stored in column Uipattern in table OBUIAPP_Process<br>
     * Help: {@literal Defines the UI Pattern that the object implements.}
     * 
     */
    public static final String PROPERTY_UIPATTERN = "uIPattern";

    /**
     * Property isMultiRecord stored in column IsMultiRecord in table OBUIAPP_Process<br>
     * Help: {@literal Multi Record allows to execute the process in multiple records at the same time. When this
     *       flag is set, multiple records can be selected in grid mode and the process can be executed in all of
     *       them at the same time.}
     * 
     */
    public static final String PROPERTY_ISMULTIRECORD = "isMultiRecord";

    /**
     * Property requiresExplicitAccessPermission stored in column Is_Explicit_Access in table OBUIAPP_Process<br>
     * Help: {@literal When processes are executed from a button in a window, by default, they inherit
     *       permissions granted to the window. So if the window is accessible it can be executed without the
     *       need of explicitly granting access for that role to the process.
     *       
     *       This behavior can be overwritten
     *       by the "Secured Process" preference.
     *       
     *       Processes with "Requires Explicit Access Permission" flag set
     *       to true, do not inherit permissions from the window but they always require the role to be
     *       explicitly granted to this process.}
     * 
     */
    public static final String PROPERTY_REQUIRESEXPLICITACCESSPERMISSION = "requiresExplicitAccessPermission";

    /**
     * Property clientSideValidation stored in column Clientsidevalidation in table OBUIAPP_Process<br>
     * Help: {@literal JavaScript function to be executed before invoking the backend Handler.
     *       This function
     *       (manually coded), can:
     *        - Perform validations on the parameters, being possible to prevent execution
     *       in case these validations are not satisfied.
     *        - Request for additional info to complete the
     *       parameter values.}
     * 
     */
    public static final String PROPERTY_CLIENTSIDEVALIDATION = "clientSideValidation";

    /**
     * Property isgridlegacy stored in column Isgridlegacy in table OBUIAPP_Process<br>
     * Help: {@literal This flags is used to specify if this process should be compatible with the legacy
     *       parameter windows.
     *       
     *       The legacy parameter windows could only contain one grid, so the _selection and
     *       _allRows properties of the grid were directly accessible in the handler from the params object.
     *       I.e:
     *       
     *       JSONArray gridRows = jsonparams.getJSONArray(ApplicationConstants.ALL_ROWS_PARAM);
     *       
     *       New
     *       process definitions should access these value like this:
     *       JSONObject myGridItem =
     *       jsonparams.getJSONObject("myGridItemName");
     *       JSONArray myGridSelectedRows =
     *       myGridItem.getJSONArray("_selection");
     *       
     *       The 'Compatibility with Legacy Grids' flag should only be
     *       checked if its handler retrieves the grid values in the old way.
     *       }
     * 
     */
    public static final String PROPERTY_ISGRIDLEGACY = "isgridlegacy";

    /**
     * Property loadFunction stored in column ON_Load_Function in table OBUIAPP_Process<br>
     * Help: {@literal In this field a javascript function can be defined. This function will be executed when
     *       the parameter window is loaded, just after the default values are set.}
     * 
     */
    public static final String PROPERTY_LOADFUNCTION = "loadFunction";

    /**
     * Property canAddRecordsToASelector stored in column IsCanAddRecordsToSelector in table OBUIAPP_Process<br>
     * Help: {@literal By selecting this flag, the process will be available in the 'Defined Selector'
     *       window.
     *       This process has to be capable of adding records to a selector.}
     * 
     */
    public static final String PROPERTY_CANADDRECORDSTOASELECTOR = "canAddRecordsToASelector";

    /**
     * Property refreshFunction stored in column ON_Refresh_Function in table OBUIAPP_Process<br>
     * Help: {@literal In this field a javascript function can be defined. This function will be executed when
     *       the parameter window refresh action be invoked. For example, if the process has a child-process,
     *       once the child-process finishes, it will invoke a refresh of the parent process.
     *       
     *       Since each process
     *       has its particularities, a custom refresh function should be defined in case the process be
     *       susceptible of being refreshed/reloaded.}
     * 
     */
    public static final String PROPERTY_REFRESHFUNCTION = "refreshFunction";

    /**
     * Property oBUIAPPParameterList stored in table OBUIAPP_Process
     * 
     */
    public static final String PROPERTY_OBUIAPPPARAMETERLIST = "oBUIAPPParameterList";

    /**
     * Property oBUIAPPProcessTrlList stored in table OBUIAPP_Process
     * 
     */
    public static final String PROPERTY_OBUIAPPPROCESSTRLLIST = "oBUIAPPProcessTrlList";

    /**
     * Property oBUIAPPProcessAccessList stored in table OBUIAPP_Process
     * 
     */
    public static final String PROPERTY_OBUIAPPPROCESSACCESSLIST = "oBUIAPPProcessAccessList";

    /**
     * Property oBUIAPPReportList stored in table OBUIAPP_Process
     * 
     */
    public static final String PROPERTY_OBUIAPPREPORTLIST = "oBUIAPPReportList";


    public Process() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_BACKGROUND, false);
        setDefaultValue(PROPERTY_UIPATTERN, "S");
        setDefaultValue(PROPERTY_ISMULTIRECORD, false);
        setDefaultValue(PROPERTY_REQUIRESEXPLICITACCESSPERMISSION, false);
        setDefaultValue(PROPERTY_ISGRIDLEGACY, false);
        setDefaultValue(PROPERTY_CANADDRECORDSTOASELECTOR, false);
        setDefaultValue(PROPERTY_OBUIAPPPARAMETERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPPROCESSTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPPROCESSACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPREPORTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Process#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Process#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Process#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Process#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Process#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Process#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Process#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Process#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Process#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Process#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Process#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Process#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Process#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Process#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Process#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Process#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Process#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Process#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Process#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Process#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Process#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Process#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Process#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Process#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Process#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public String getDataAccessLevel() {
        return (String) get(PROPERTY_DATAACCESSLEVEL);
    }
    /**
     * @see Process#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public void setDataAccessLevel(String dataAccessLevel) {
        set(PROPERTY_DATAACCESSLEVEL, dataAccessLevel);
    }

    /**
     * @see Process#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see Process#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see Process#PROPERTY_BACKGROUND
     * 
     */
    public Boolean isBackground() {
        return (Boolean) get(PROPERTY_BACKGROUND);
    }
    /**
     * @see Process#PROPERTY_BACKGROUND
     * 
     */
    public void setBackground(Boolean background) {
        set(PROPERTY_BACKGROUND, background);
    }

    /**
     * @see Process#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Process#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Process#PROPERTY_UIPATTERN
     * 
     */
    public String getUIPattern() {
        return (String) get(PROPERTY_UIPATTERN);
    }
    /**
     * @see Process#PROPERTY_UIPATTERN
     * 
     */
    public void setUIPattern(String uIPattern) {
        set(PROPERTY_UIPATTERN, uIPattern);
    }

    /**
     * @see Process#PROPERTY_ISMULTIRECORD
     * 
     */
    public Boolean isMultiRecord() {
        return (Boolean) get(PROPERTY_ISMULTIRECORD);
    }
    /**
     * @see Process#PROPERTY_ISMULTIRECORD
     * 
     */
    public void setMultiRecord(Boolean isMultiRecord) {
        set(PROPERTY_ISMULTIRECORD, isMultiRecord);
    }

    /**
     * @see Process#PROPERTY_REQUIRESEXPLICITACCESSPERMISSION
     * 
     */
    public Boolean isRequiresExplicitAccessPermission() {
        return (Boolean) get(PROPERTY_REQUIRESEXPLICITACCESSPERMISSION);
    }
    /**
     * @see Process#PROPERTY_REQUIRESEXPLICITACCESSPERMISSION
     * 
     */
    public void setRequiresExplicitAccessPermission(Boolean requiresExplicitAccessPermission) {
        set(PROPERTY_REQUIRESEXPLICITACCESSPERMISSION, requiresExplicitAccessPermission);
    }

    /**
     * @see Process#PROPERTY_CLIENTSIDEVALIDATION
     * 
     */
    public String getClientSideValidation() {
        return (String) get(PROPERTY_CLIENTSIDEVALIDATION);
    }
    /**
     * @see Process#PROPERTY_CLIENTSIDEVALIDATION
     * 
     */
    public void setClientSideValidation(String clientSideValidation) {
        set(PROPERTY_CLIENTSIDEVALIDATION, clientSideValidation);
    }

    /**
     * @see Process#PROPERTY_ISGRIDLEGACY
     * 
     */
    public Boolean isGridlegacy() {
        return (Boolean) get(PROPERTY_ISGRIDLEGACY);
    }
    /**
     * @see Process#PROPERTY_ISGRIDLEGACY
     * 
     */
    public void setGridlegacy(Boolean isgridlegacy) {
        set(PROPERTY_ISGRIDLEGACY, isgridlegacy);
    }

    /**
     * @see Process#PROPERTY_LOADFUNCTION
     * 
     */
    public String getLoadFunction() {
        return (String) get(PROPERTY_LOADFUNCTION);
    }
    /**
     * @see Process#PROPERTY_LOADFUNCTION
     * 
     */
    public void setLoadFunction(String loadFunction) {
        set(PROPERTY_LOADFUNCTION, loadFunction);
    }

    /**
     * @see Process#PROPERTY_CANADDRECORDSTOASELECTOR
     * 
     */
    public Boolean isCanAddRecordsToASelector() {
        return (Boolean) get(PROPERTY_CANADDRECORDSTOASELECTOR);
    }
    /**
     * @see Process#PROPERTY_CANADDRECORDSTOASELECTOR
     * 
     */
    public void setCanAddRecordsToASelector(Boolean canAddRecordsToASelector) {
        set(PROPERTY_CANADDRECORDSTOASELECTOR, canAddRecordsToASelector);
    }

    /**
     * @see Process#PROPERTY_REFRESHFUNCTION
     * 
     */
    public String getRefreshFunction() {
        return (String) get(PROPERTY_REFRESHFUNCTION);
    }
    /**
     * @see Process#PROPERTY_REFRESHFUNCTION
     * 
     */
    public void setRefreshFunction(String refreshFunction) {
        set(PROPERTY_REFRESHFUNCTION, refreshFunction);
    }

    /**
     * @see Parameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Parameter> getOBUIAPPParameterList() {
      return (List<Parameter>) get(PROPERTY_OBUIAPPPARAMETERLIST);
    }

    /**
     * @see Parameter
     * 
     */
    public void setOBUIAPPParameterList(List<Parameter> oBUIAPPParameterList) {
        set(PROPERTY_OBUIAPPPARAMETERLIST, oBUIAPPParameterList);
    }

    /**
     * Help: {@literal The translation defines the process definition name, Help/Comment and description for
     *       different languages}<br>
     * @see OBUIAPP_ProcessTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OBUIAPP_ProcessTrl> getOBUIAPPProcessTrlList() {
      return (List<OBUIAPP_ProcessTrl>) get(PROPERTY_OBUIAPPPROCESSTRLLIST);
    }

    /**
     * Help: {@literal The translation defines the process definition name, Help/Comment and description for
     *       different languages}<br>
     * @see OBUIAPP_ProcessTrl
     * 
     */
    public void setOBUIAPPProcessTrlList(List<OBUIAPP_ProcessTrl> oBUIAPPProcessTrlList) {
        set(PROPERTY_OBUIAPPPROCESSTRLLIST, oBUIAPPProcessTrlList);
    }

    /**
     * @see ProcessAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProcessAccess> getOBUIAPPProcessAccessList() {
      return (List<ProcessAccess>) get(PROPERTY_OBUIAPPPROCESSACCESSLIST);
    }

    /**
     * @see ProcessAccess
     * 
     */
    public void setOBUIAPPProcessAccessList(List<ProcessAccess> oBUIAPPProcessAccessList) {
        set(PROPERTY_OBUIAPPPROCESSACCESSLIST, oBUIAPPProcessAccessList);
    }

    /**
     * Help: {@literal Contains the information to build a Report using JR Templates.}<br>
     * @see ReportDefinition
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReportDefinition> getOBUIAPPReportList() {
      return (List<ReportDefinition>) get(PROPERTY_OBUIAPPREPORTLIST);
    }

    /**
     * Help: {@literal Contains the information to build a Report using JR Templates.}<br>
     * @see ReportDefinition
     * 
     */
    public void setOBUIAPPReportList(List<ReportDefinition> oBUIAPPReportList) {
        set(PROPERTY_OBUIAPPREPORTLIST, oBUIAPPReportList);
    }

}
