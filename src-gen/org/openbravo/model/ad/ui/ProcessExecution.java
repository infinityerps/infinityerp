
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ProcessExecution (stored in table AD_Process_Execution_V).
 * <br>
 * Help: {@literal View the results of executed Process Requests' and individual Process executions.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessExecution extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Process_Execution_V";
    public static final String ENTITY_NAME = "ProcessExecution";

    /**
     * Property id stored in column AD_Process_Run_ID in table AD_Process_Execution_V<br>
     * Help: {@literal Single execution of a Process.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Process_Execution_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Process_Execution_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Process_Execution_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Process_Execution_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Process_Execution_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Process_Execution_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Process_Execution_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property userContact stored in column AD_User_ID in table AD_Process_Execution_V<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property status stored in column Status in table AD_Process_Execution_V<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property startTime stored in column Start_Time in table AD_Process_Execution_V 
     * 
     */
    public static final String PROPERTY_STARTTIME = "startTime";

    /**
     * Property endTime stored in column End_Time in table AD_Process_Execution_V 
     * 
     */
    public static final String PROPERTY_ENDTIME = "endTime";

    /**
     * Property duration stored in column Runtime in table AD_Process_Execution_V 
     * 
     */
    public static final String PROPERTY_DURATION = "duration";

    /**
     * Property processLog stored in column Log in table AD_Process_Execution_V<br>
     * Help: {@literal The log of the Process execution.}
     * 
     */
    public static final String PROPERTY_PROCESSLOG = "processLog";

    /**
     * Property result stored in column Result in table AD_Process_Execution_V 
     * 
     */
    public static final String PROPERTY_RESULT = "result";

    /**
     * Property params stored in column Params in table AD_Process_Execution_V
     * 
     */
    public static final String PROPERTY_PARAMS = "params";

    /**
     * Property report stored in column Report in table AD_Process_Execution_V
     * 
     */
    public static final String PROPERTY_REPORT = "report";

    /**
     * Property channel stored in column Channel in table AD_Process_Execution_V 
     * 
     */
    public static final String PROPERTY_CHANNEL = "channel";

    /**
     * Property securityBasedOnRole stored in column Isrolesecurity in table AD_Process_Execution_V<br>
     * Help: {@literal A flag indicating whether access to an item should be based on a user's role within the
     *       system.}
     * 
     */
    public static final String PROPERTY_SECURITYBASEDONROLE = "securityBasedOnRole";

    /**
     * Property process stored in column AD_Process_ID in table AD_Process_Execution_V<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property processGroup stored in column AD_Process_Group_ID in table AD_Process_Execution_V<br>
     * Help: {@literal Process Group to be executed in serials from the Process Request window}
     * 
     */
    public static final String PROPERTY_PROCESSGROUP = "processGroup";

    /**
     * Property processRequest stored in column AD_Process_Request_ID in table AD_Process_Execution_V<br>
     * Help: {@literal Request to run a Process, either directly or scheduled for a later date.}
     * 
     */
    public static final String PROPERTY_PROCESSREQUEST = "processRequest";

    /**
     * Property triggeredByGroupExecution stored in column AD_Process_Run_Group_ID in table AD_Process_Execution_V
     * 
     */
    public static final String PROPERTY_TRIGGEREDBYGROUPEXECUTION = "triggeredByGroupExecution";

    /**
     * Property group stored in column Isgroup in table AD_Process_Execution_V
     * 
     */
    public static final String PROPERTY_GROUP = "group";

    /**
     * Property killProcess stored in column Killprocess in table AD_Process_Execution_V<br>
     * Help: {@literal Kill background process if the process implements a kill method.}
     * 
     */
    public static final String PROPERTY_KILLPROCESS = "killProcess";

    /**
     * Property schedulerInstance stored in column Scheduler_Instance in table AD_Process_Execution_V
     * 
     */
    public static final String PROPERTY_SCHEDULERINSTANCE = "schedulerInstance";


    public ProcessExecution() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_RESULT, false);
        setDefaultValue(PROPERTY_SECURITYBASEDONROLE, false);
        setDefaultValue(PROPERTY_GROUP, false);
        setDefaultValue(PROPERTY_KILLPROCESS, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessExecution#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessExecution#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessExecution#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessExecution#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessExecution#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessExecution#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessExecution#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessExecution#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessExecution#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessExecution#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessExecution#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessExecution#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessExecution#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessExecution#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessExecution#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessExecution#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessExecution#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see ProcessExecution#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see ProcessExecution#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see ProcessExecution#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see ProcessExecution#PROPERTY_STARTTIME
     * 
     */
    public Date getStartTime() {
        return (Date) get(PROPERTY_STARTTIME);
    }
    /**
     * @see ProcessExecution#PROPERTY_STARTTIME
     * 
     */
    public void setStartTime(Date startTime) {
        set(PROPERTY_STARTTIME, startTime);
    }

    /**
     * @see ProcessExecution#PROPERTY_ENDTIME
     * 
     */
    public Date getEndTime() {
        return (Date) get(PROPERTY_ENDTIME);
    }
    /**
     * @see ProcessExecution#PROPERTY_ENDTIME
     * 
     */
    public void setEndTime(Date endTime) {
        set(PROPERTY_ENDTIME, endTime);
    }

    /**
     * @see ProcessExecution#PROPERTY_DURATION
     * 
     */
    public String getDuration() {
        return (String) get(PROPERTY_DURATION);
    }
    /**
     * @see ProcessExecution#PROPERTY_DURATION
     * 
     */
    public void setDuration(String duration) {
        set(PROPERTY_DURATION, duration);
    }

    /**
     * @see ProcessExecution#PROPERTY_PROCESSLOG
     * 
     */
    public String getProcessLog() {
        return (String) get(PROPERTY_PROCESSLOG);
    }
    /**
     * @see ProcessExecution#PROPERTY_PROCESSLOG
     * 
     */
    public void setProcessLog(String processLog) {
        set(PROPERTY_PROCESSLOG, processLog);
    }

    /**
     * @see ProcessExecution#PROPERTY_RESULT
     * 
     */
    public Boolean isResult() {
        return (Boolean) get(PROPERTY_RESULT);
    }
    /**
     * @see ProcessExecution#PROPERTY_RESULT
     * 
     */
    public void setResult(Boolean result) {
        set(PROPERTY_RESULT, result);
    }

    /**
     * @see ProcessExecution#PROPERTY_PARAMS
     * 
     */
    public String getParams() {
        return (String) get(PROPERTY_PARAMS);
    }
    /**
     * @see ProcessExecution#PROPERTY_PARAMS
     * 
     */
    public void setParams(String params) {
        set(PROPERTY_PARAMS, params);
    }

    /**
     * @see ProcessExecution#PROPERTY_REPORT
     * 
     */
    public String getReport() {
        return (String) get(PROPERTY_REPORT);
    }
    /**
     * @see ProcessExecution#PROPERTY_REPORT
     * 
     */
    public void setReport(String report) {
        set(PROPERTY_REPORT, report);
    }

    /**
     * @see ProcessExecution#PROPERTY_CHANNEL
     * 
     */
    public String getChannel() {
        return (String) get(PROPERTY_CHANNEL);
    }
    /**
     * @see ProcessExecution#PROPERTY_CHANNEL
     * 
     */
    public void setChannel(String channel) {
        set(PROPERTY_CHANNEL, channel);
    }

    /**
     * @see ProcessExecution#PROPERTY_SECURITYBASEDONROLE
     * 
     */
    public Boolean isSecurityBasedOnRole() {
        return (Boolean) get(PROPERTY_SECURITYBASEDONROLE);
    }
    /**
     * @see ProcessExecution#PROPERTY_SECURITYBASEDONROLE
     * 
     */
    public void setSecurityBasedOnRole(Boolean securityBasedOnRole) {
        set(PROPERTY_SECURITYBASEDONROLE, securityBasedOnRole);
    }

    /**
     * @see ProcessExecution#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see ProcessExecution#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see ProcessExecution#PROPERTY_PROCESSGROUP
     * 
     */
    public ProcessGroup getProcessGroup() {
        return (ProcessGroup) get(PROPERTY_PROCESSGROUP);
    }
    /**
     * @see ProcessExecution#PROPERTY_PROCESSGROUP
     * 
     */
    public void setProcessGroup(ProcessGroup processGroup) {
        set(PROPERTY_PROCESSGROUP, processGroup);
    }

    /**
     * @see ProcessExecution#PROPERTY_PROCESSREQUEST
     * 
     */
    public ProcessRequest getProcessRequest() {
        return (ProcessRequest) get(PROPERTY_PROCESSREQUEST);
    }
    /**
     * @see ProcessExecution#PROPERTY_PROCESSREQUEST
     * 
     */
    public void setProcessRequest(ProcessRequest processRequest) {
        set(PROPERTY_PROCESSREQUEST, processRequest);
    }

    /**
     * @see ProcessExecution#PROPERTY_TRIGGEREDBYGROUPEXECUTION
     * 
     */
    public ProcessExecution getTriggeredByGroupExecution() {
        return (ProcessExecution) get(PROPERTY_TRIGGEREDBYGROUPEXECUTION);
    }
    /**
     * @see ProcessExecution#PROPERTY_TRIGGEREDBYGROUPEXECUTION
     * 
     */
    public void setTriggeredByGroupExecution(ProcessExecution triggeredByGroupExecution) {
        set(PROPERTY_TRIGGEREDBYGROUPEXECUTION, triggeredByGroupExecution);
    }

    /**
     * @see ProcessExecution#PROPERTY_GROUP
     * 
     */
    public Boolean isGroup() {
        return (Boolean) get(PROPERTY_GROUP);
    }
    /**
     * @see ProcessExecution#PROPERTY_GROUP
     * 
     */
    public void setGroup(Boolean group) {
        set(PROPERTY_GROUP, group);
    }

    /**
     * @see ProcessExecution#PROPERTY_KILLPROCESS
     * 
     */
    public Boolean isKillProcess() {
        return (Boolean) get(PROPERTY_KILLPROCESS);
    }
    /**
     * @see ProcessExecution#PROPERTY_KILLPROCESS
     * 
     */
    public void setKillProcess(Boolean killProcess) {
        set(PROPERTY_KILLPROCESS, killProcess);
    }

    /**
     * @see ProcessExecution#PROPERTY_SCHEDULERINSTANCE
     * 
     */
    public String getSchedulerInstance() {
        return (String) get(PROPERTY_SCHEDULERINSTANCE);
    }
    /**
     * @see ProcessExecution#PROPERTY_SCHEDULERINSTANCE
     * 
     */
    public void setSchedulerInstance(String schedulerInstance) {
        set(PROPERTY_SCHEDULERINSTANCE, schedulerInstance);
    }

}
