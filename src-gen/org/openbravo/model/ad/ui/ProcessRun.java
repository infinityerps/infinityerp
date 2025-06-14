
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
 * Entity class for entity ProcessRun (stored in table AD_Process_Run).
 * <br>
 * Help: {@literal View the results of executed Process Requests' and individual Process executions.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessRun extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Process_Run";
    public static final String ENTITY_NAME = "ProcessRun";

    /**
     * Property id stored in column AD_Process_Run_ID in table AD_Process_Run<br>
     * Help: {@literal Single execution of a Process.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Process_Run 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Process_Run 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Process_Run 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Process_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Process_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Process_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Process_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property status stored in column Status in table AD_Process_Run 
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property startTime stored in column Start_Time in table AD_Process_Run 
     * 
     */
    public static final String PROPERTY_STARTTIME = "startTime";

    /**
     * Property duration stored in column Runtime in table AD_Process_Run 
     * 
     */
    public static final String PROPERTY_DURATION = "duration";

    /**
     * Property result stored in column Result in table AD_Process_Run<br>
     * Help: {@literal The Result indicates the result of any action taken on this request.}
     * 
     */
    public static final String PROPERTY_RESULT = "result";

    /**
     * Property processRequest stored in column AD_Process_Request_ID in table AD_Process_Run<br>
     * Help: {@literal Request to run a Process, either directly or scheduled for a later date.}
     * 
     */
    public static final String PROPERTY_PROCESSREQUEST = "processRequest";

    /**
     * Property report stored in column Report in table AD_Process_Run
     * 
     */
    public static final String PROPERTY_REPORT = "report";

    /**
     * Property endTime stored in column END_Time in table AD_Process_Run 
     * 
     */
    public static final String PROPERTY_ENDTIME = "endTime";

    /**
     * Property log stored in column Log in table AD_Process_Run<br>
     * Help: {@literal Text with all the logging information}
     * 
     */
    public static final String PROPERTY_LOG = "log";

    /**
     * Property triggeredByGroupExecution stored in column AD_Process_Run_Group_ID in table AD_Process_Run
     * 
     */
    public static final String PROPERTY_TRIGGEREDBYGROUPEXECUTION = "triggeredByGroupExecution";

    /**
     * Property schedulerInstance stored in column Scheduler_Instance in table AD_Process_Run
     * 
     */
    public static final String PROPERTY_SCHEDULERINSTANCE = "schedulerInstance";

    /**
     * Property shouldBeKilled stored in column Should_Be_Killed in table AD_Process_Run<br>
     * Help: {@literal Determines if a process should be killed, checked regularly on running processes to kill
     *       pending processes.}
     * 
     */
    public static final String PROPERTY_SHOULDBEKILLED = "shouldBeKilled";


    public ProcessRun() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_RESULT, false);
        setDefaultValue(PROPERTY_SHOULDBEKILLED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessRun#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessRun#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessRun#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessRun#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessRun#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessRun#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessRun#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessRun#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessRun#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessRun#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessRun#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessRun#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessRun#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessRun#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessRun#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessRun#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessRun#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see ProcessRun#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see ProcessRun#PROPERTY_STARTTIME
     * 
     */
    public Date getStartTime() {
        return (Date) get(PROPERTY_STARTTIME);
    }
    /**
     * @see ProcessRun#PROPERTY_STARTTIME
     * 
     */
    public void setStartTime(Date startTime) {
        set(PROPERTY_STARTTIME, startTime);
    }

    /**
     * @see ProcessRun#PROPERTY_DURATION
     * 
     */
    public String getDuration() {
        return (String) get(PROPERTY_DURATION);
    }
    /**
     * @see ProcessRun#PROPERTY_DURATION
     * 
     */
    public void setDuration(String duration) {
        set(PROPERTY_DURATION, duration);
    }

    /**
     * @see ProcessRun#PROPERTY_RESULT
     * 
     */
    public Boolean isResult() {
        return (Boolean) get(PROPERTY_RESULT);
    }
    /**
     * @see ProcessRun#PROPERTY_RESULT
     * 
     */
    public void setResult(Boolean result) {
        set(PROPERTY_RESULT, result);
    }

    /**
     * @see ProcessRun#PROPERTY_PROCESSREQUEST
     * 
     */
    public ProcessRequest getProcessRequest() {
        return (ProcessRequest) get(PROPERTY_PROCESSREQUEST);
    }
    /**
     * @see ProcessRun#PROPERTY_PROCESSREQUEST
     * 
     */
    public void setProcessRequest(ProcessRequest processRequest) {
        set(PROPERTY_PROCESSREQUEST, processRequest);
    }

    /**
     * @see ProcessRun#PROPERTY_REPORT
     * 
     */
    public String getReport() {
        return (String) get(PROPERTY_REPORT);
    }
    /**
     * @see ProcessRun#PROPERTY_REPORT
     * 
     */
    public void setReport(String report) {
        set(PROPERTY_REPORT, report);
    }

    /**
     * @see ProcessRun#PROPERTY_ENDTIME
     * 
     */
    public Date getEndTime() {
        return (Date) get(PROPERTY_ENDTIME);
    }
    /**
     * @see ProcessRun#PROPERTY_ENDTIME
     * 
     */
    public void setEndTime(Date endTime) {
        set(PROPERTY_ENDTIME, endTime);
    }

    /**
     * @see ProcessRun#PROPERTY_LOG
     * 
     */
    public String getLog() {
        return (String) get(PROPERTY_LOG);
    }
    /**
     * @see ProcessRun#PROPERTY_LOG
     * 
     */
    public void setLog(String log) {
        set(PROPERTY_LOG, log);
    }

    /**
     * @see ProcessRun#PROPERTY_TRIGGEREDBYGROUPEXECUTION
     * 
     */
    public ProcessExecution getTriggeredByGroupExecution() {
        return (ProcessExecution) get(PROPERTY_TRIGGEREDBYGROUPEXECUTION);
    }
    /**
     * @see ProcessRun#PROPERTY_TRIGGEREDBYGROUPEXECUTION
     * 
     */
    public void setTriggeredByGroupExecution(ProcessExecution triggeredByGroupExecution) {
        set(PROPERTY_TRIGGEREDBYGROUPEXECUTION, triggeredByGroupExecution);
    }

    /**
     * @see ProcessRun#PROPERTY_SCHEDULERINSTANCE
     * 
     */
    public String getSchedulerInstance() {
        return (String) get(PROPERTY_SCHEDULERINSTANCE);
    }
    /**
     * @see ProcessRun#PROPERTY_SCHEDULERINSTANCE
     * 
     */
    public void setSchedulerInstance(String schedulerInstance) {
        set(PROPERTY_SCHEDULERINSTANCE, schedulerInstance);
    }

    /**
     * @see ProcessRun#PROPERTY_SHOULDBEKILLED
     * 
     */
    public Boolean isShouldBeKilled() {
        return (Boolean) get(PROPERTY_SHOULDBEKILLED);
    }
    /**
     * @see ProcessRun#PROPERTY_SHOULDBEKILLED
     * 
     */
    public void setShouldBeKilled(Boolean shouldBeKilled) {
        set(PROPERTY_SHOULDBEKILLED, shouldBeKilled);
    }

}
