
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
package org.openbravo.model.ad.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.ProcessAccess;
import org.openbravo.model.ad.access.ProcessClusterInstanceAccess;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.domain.ModelImplementation;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADProcess (stored in table AD_Process).
 * <br>
 * Help: {@literal The Report and Process Tab defines each report and process run in the system.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Process extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Process";
    public static final String ENTITY_NAME = "ADProcess";

    /**
     * Property id stored in column AD_Process_ID in table AD_Process<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Process 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Process 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Process 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table AD_Process<br>
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
     * Property name stored in column Name in table AD_Process 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Process<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Process<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property dataAccessLevel stored in column AccessLevel in table AD_Process<br>
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
     * Property userCanStartProcess stored in column IsUserStartable in table AD_Process<br>
     * Help: {@literal The User can start Process checkbox indicates that this process can be initiated by the
     *       user (as opposed to system initiated)}
     * 
     */
    public static final String PROPERTY_USERCANSTARTPROCESS = "userCanStartProcess";

    /**
     * Property procedure stored in column ProcedureName in table AD_Process<br>
     * Help: {@literal The Procedure indicates the name of the database procedure called by this report or
     *       process.}
     * 
     */
    public static final String PROPERTY_PROCEDURE = "procedure";

    /**
     * Property report stored in column IsReport in table AD_Process<br>
     * Help: {@literal The Report checkbox indicates that this record is a report as opposed to a process}
     * 
     */
    public static final String PROPERTY_REPORT = "report";

    /**
     * Property directPrint stored in column IsDirectPrint in table AD_Process<br>
     * Help: {@literal The Direct Print checkbox indicates that this report will print without a print dialog box
     *       being displayed.}
     * 
     */
    public static final String PROPERTY_DIRECTPRINT = "directPrint";

    /**
     * Property javaClassName stored in column Classname in table AD_Process<br>
     * Help: {@literal The classname is used when generating a representation of the table in java (the entity or
     *       business object). The classname is the simplename of the class (so without the package name). Often
     *       the AD_Table.name can be used here. The combination of classname and package needs to be unique.}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property background stored in column IsBackground in table AD_Process<br>
     * Help: {@literal This identifies a background process that will be run without any user interaction and
     *       needs to be scheduled properly before it will be run using the "Process Scheduling" window.}
     * 
     */
    public static final String PROPERTY_BACKGROUND = "background";

    /**
     * Property jasperReport stored in column IsJasper in table AD_Process<br>
     * Help: {@literal Defines that the report is a jasper report.}
     * 
     */
    public static final String PROPERTY_JASPERREPORT = "jasperReport";

    /**
     * Property jRTemplateName stored in column Jrname in table AD_Process<br>
     * Help: {@literal Defines the name (including the extension) of the main tamplate (jrxml file) of the Jasper
     *       Report.}
     * 
     */
    public static final String PROPERTY_JRTEMPLATENAME = "jRTemplateName";

    /**
     * Property externalService stored in column Isexternalservice in table AD_Process<br>
     * Help: {@literal Sets the process as a external service that is loadable from the application menu.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_EXTERNALSERVICE = "externalService";

    /**
     * Property module stored in column AD_Module_ID in table AD_Process<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property uIPattern stored in column UIPattern in table AD_Process<br>
     * Help: {@literal Defines the UI Pattern that the object implements.}
     * 
     */
    public static final String PROPERTY_UIPATTERN = "uIPattern";

    /**
     * Property advancedFeature stored in column IsAdvancedFeature in table AD_Process<br>
     * Help: {@literal Automatic roles are granted with all non advanced features defined within application
     *       dictionary.
     *       
     *       Advanced features are only granted to the automatic roles defined as advanced.}
     * 
     */
    public static final String PROPERTY_ADVANCEDFEATURE = "advancedFeature";

    /**
     * Property preventConcurrentExecutions stored in column PreventConcurrent in table AD_Process<br>
     * Help: {@literal When the process is scheduled as background process and this flag is set, in case there is
     *       another instance of this process already in execution, a new instance is not executed.}
     * 
     */
    public static final String PROPERTY_PREVENTCONCURRENTEXECUTIONS = "preventConcurrentExecutions";

    /**
     * Property requiresExplicitAccessPermission stored in column Is_Explicit_Access in table AD_Process<br>
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
     * Property killable stored in column Iskillable in table AD_Process<br>
     * Help: {@literal Define if a background process is killable}
     * 
     */
    public static final String PROPERTY_KILLABLE = "killable";

    /**
     * Property aDModelImplementationList stored in table AD_Process
     * 
     */
    public static final String PROPERTY_ADMODELIMPLEMENTATIONLIST = "aDModelImplementationList";

    /**
     * Property aDProcessAccessList stored in table AD_Process
     * 
     */
    public static final String PROPERTY_ADPROCESSACCESSLIST = "aDProcessAccessList";

    /**
     * Property aDProcessParameterList stored in table AD_Process
     * 
     */
    public static final String PROPERTY_ADPROCESSPARAMETERLIST = "aDProcessParameterList";

    /**
     * Property aDProcessTrlList stored in table AD_Process
     * 
     */
    public static final String PROPERTY_ADPROCESSTRLLIST = "aDProcessTrlList";

    /**
     * Property processClusterInstList stored in table AD_Process
     * 
     */
    public static final String PROPERTY_PROCESSCLUSTERINSTLIST = "processClusterInstList";


    public Process() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_USERCANSTARTPROCESS, false);
        setDefaultValue(PROPERTY_REPORT, false);
        setDefaultValue(PROPERTY_DIRECTPRINT, false);
        setDefaultValue(PROPERTY_BACKGROUND, false);
        setDefaultValue(PROPERTY_JASPERREPORT, false);
        setDefaultValue(PROPERTY_EXTERNALSERVICE, false);
        setDefaultValue(PROPERTY_UIPATTERN, "S");
        setDefaultValue(PROPERTY_ADVANCEDFEATURE, false);
        setDefaultValue(PROPERTY_PREVENTCONCURRENTEXECUTIONS, false);
        setDefaultValue(PROPERTY_REQUIRESEXPLICITACCESSPERMISSION, false);
        setDefaultValue(PROPERTY_KILLABLE, false);
        setDefaultValue(PROPERTY_ADMODELIMPLEMENTATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADPROCESSACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADPROCESSPARAMETERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADPROCESSTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCESSCLUSTERINSTLIST, new ArrayList<Object>());
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
     * @see Process#PROPERTY_USERCANSTARTPROCESS
     * 
     */
    public Boolean isUserCanStartProcess() {
        return (Boolean) get(PROPERTY_USERCANSTARTPROCESS);
    }
    /**
     * @see Process#PROPERTY_USERCANSTARTPROCESS
     * 
     */
    public void setUserCanStartProcess(Boolean userCanStartProcess) {
        set(PROPERTY_USERCANSTARTPROCESS, userCanStartProcess);
    }

    /**
     * @see Process#PROPERTY_PROCEDURE
     * 
     */
    public String getProcedure() {
        return (String) get(PROPERTY_PROCEDURE);
    }
    /**
     * @see Process#PROPERTY_PROCEDURE
     * 
     */
    public void setProcedure(String procedure) {
        set(PROPERTY_PROCEDURE, procedure);
    }

    /**
     * @see Process#PROPERTY_REPORT
     * 
     */
    public Boolean isReport() {
        return (Boolean) get(PROPERTY_REPORT);
    }
    /**
     * @see Process#PROPERTY_REPORT
     * 
     */
    public void setReport(Boolean report) {
        set(PROPERTY_REPORT, report);
    }

    /**
     * @see Process#PROPERTY_DIRECTPRINT
     * 
     */
    public Boolean isDirectPrint() {
        return (Boolean) get(PROPERTY_DIRECTPRINT);
    }
    /**
     * @see Process#PROPERTY_DIRECTPRINT
     * 
     */
    public void setDirectPrint(Boolean directPrint) {
        set(PROPERTY_DIRECTPRINT, directPrint);
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
     * @see Process#PROPERTY_JASPERREPORT
     * 
     */
    public Boolean isJasperReport() {
        return (Boolean) get(PROPERTY_JASPERREPORT);
    }
    /**
     * @see Process#PROPERTY_JASPERREPORT
     * 
     */
    public void setJasperReport(Boolean jasperReport) {
        set(PROPERTY_JASPERREPORT, jasperReport);
    }

    /**
     * @see Process#PROPERTY_JRTEMPLATENAME
     * 
     */
    public String getJRTemplateName() {
        return (String) get(PROPERTY_JRTEMPLATENAME);
    }
    /**
     * @see Process#PROPERTY_JRTEMPLATENAME
     * 
     */
    public void setJRTemplateName(String jRTemplateName) {
        set(PROPERTY_JRTEMPLATENAME, jRTemplateName);
    }

    /**
     * @see Process#PROPERTY_EXTERNALSERVICE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isExternalService() {
        return (Boolean) get(PROPERTY_EXTERNALSERVICE);
    }
    /**
     * @see Process#PROPERTY_EXTERNALSERVICE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setExternalService(Boolean externalService) {
        set(PROPERTY_EXTERNALSERVICE, externalService);
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
     * @see Process#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public Boolean isAdvancedFeature() {
        return (Boolean) get(PROPERTY_ADVANCEDFEATURE);
    }
    /**
     * @see Process#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public void setAdvancedFeature(Boolean advancedFeature) {
        set(PROPERTY_ADVANCEDFEATURE, advancedFeature);
    }

    /**
     * @see Process#PROPERTY_PREVENTCONCURRENTEXECUTIONS
     * 
     */
    public Boolean isPreventConcurrentExecutions() {
        return (Boolean) get(PROPERTY_PREVENTCONCURRENTEXECUTIONS);
    }
    /**
     * @see Process#PROPERTY_PREVENTCONCURRENTEXECUTIONS
     * 
     */
    public void setPreventConcurrentExecutions(Boolean preventConcurrentExecutions) {
        set(PROPERTY_PREVENTCONCURRENTEXECUTIONS, preventConcurrentExecutions);
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
     * @see Process#PROPERTY_KILLABLE
     * 
     */
    public Boolean isKillable() {
        return (Boolean) get(PROPERTY_KILLABLE);
    }
    /**
     * @see Process#PROPERTY_KILLABLE
     * 
     */
    public void setKillable(Boolean killable) {
        set(PROPERTY_KILLABLE, killable);
    }

    /**
     * @see ModelImplementation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ModelImplementation> getADModelImplementationList() {
      return (List<ModelImplementation>) get(PROPERTY_ADMODELIMPLEMENTATIONLIST);
    }

    /**
     * @see ModelImplementation
     * 
     */
    public void setADModelImplementationList(List<ModelImplementation> aDModelImplementationList) {
        set(PROPERTY_ADMODELIMPLEMENTATIONLIST, aDModelImplementationList);
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
     * Help: {@literal The Report Parameter table defines any parameters required to execute a report or
     *       process.}<br>
     * @see ProcessParameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProcessParameter> getADProcessParameterList() {
      return (List<ProcessParameter>) get(PROPERTY_ADPROCESSPARAMETERLIST);
    }

    /**
     * Help: {@literal The Report Parameter table defines any parameters required to execute a report or
     *       process.}<br>
     * @see ProcessParameter
     * 
     */
    public void setADProcessParameterList(List<ProcessParameter> aDProcessParameterList) {
        set(PROPERTY_ADPROCESSPARAMETERLIST, aDProcessParameterList);
    }

    /**
     * Help: {@literal Shows report tab translation for several languages
     *       This tab contains the process
     *       translation to different languages. It is important to check the translated option.}<br>
     * @see ProcessTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProcessTrl> getADProcessTrlList() {
      return (List<ProcessTrl>) get(PROPERTY_ADPROCESSTRLLIST);
    }

    /**
     * Help: {@literal Shows report tab translation for several languages
     *       This tab contains the process
     *       translation to different languages. It is important to check the translated option.}<br>
     * @see ProcessTrl
     * 
     */
    public void setADProcessTrlList(List<ProcessTrl> aDProcessTrlList) {
        set(PROPERTY_ADPROCESSTRLLIST, aDProcessTrlList);
    }

    /**
     * Help: {@literal Cluster instances assigned to a background process to only be executed on them. If empty,
     *       process will be able to execute in any instance of the cluster.}<br>
     * @see ProcessClusterInstanceAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProcessClusterInstanceAccess> getProcessClusterInstList() {
      return (List<ProcessClusterInstanceAccess>) get(PROPERTY_PROCESSCLUSTERINSTLIST);
    }

    /**
     * Help: {@literal Cluster instances assigned to a background process to only be executed on them. If empty,
     *       process will be able to execute in any instance of the cluster.}<br>
     * @see ProcessClusterInstanceAccess
     * 
     */
    public void setProcessClusterInstList(List<ProcessClusterInstanceAccess> processClusterInstList) {
        set(PROPERTY_PROCESSCLUSTERINSTLIST, processClusterInstList);
    }

}
