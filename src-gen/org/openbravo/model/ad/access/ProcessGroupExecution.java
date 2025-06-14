
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Process;
import org.openbravo.model.ad.ui.ProcessRequest;
import org.openbravo.model.ad.ui.ProcessRun;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ProcessGroupExecution (stored in table AD_Progroupexe_V).
 * <br>
 * Help: {@literal View the results of executed Process Requests' and individual Process executions.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessGroupExecution extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Progroupexe_V";
    public static final String ENTITY_NAME = "ProcessGroupExecution";

    /**
     * Property id stored in column AD_Progroupexe_V_ID in table AD_Progroupexe_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Progroupexe_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Progroupexe_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Progroupexe_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Progroupexe_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Progroupexe_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Progroupexe_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Progroupexe_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property userContact stored in column AD_User_ID in table AD_Progroupexe_V<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property status stored in column Status in table AD_Progroupexe_V<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property startTime stored in column Start_Time in table AD_Progroupexe_V<br>
     * Help: {@literal The time at which an item is due to, or did, start.}
     * 
     */
    public static final String PROPERTY_STARTTIME = "startTime";

    /**
     * Property endTime stored in column END_Time in table AD_Progroupexe_V<br>
     * Help: {@literal The time the process execution finished.}
     * 
     */
    public static final String PROPERTY_ENDTIME = "endTime";

    /**
     * Property duration stored in column Runtime in table AD_Progroupexe_V<br>
     * Help: {@literal Elapsed time from when the Process began to when the Process finished its execution. The
     *       result is displayed in an hours, minutes, seconds and milliseconds format (HH:MM:SS:sss).}
     * 
     */
    public static final String PROPERTY_DURATION = "duration";

    /**
     * Property processLog stored in column Log in table AD_Progroupexe_V<br>
     * Help: {@literal The log of the Process execution.}
     * 
     */
    public static final String PROPERTY_PROCESSLOG = "processLog";

    /**
     * Property channel stored in column Channel in table AD_Progroupexe_V<br>
     * Help: {@literal The method by which this Process request was executed/scheduled (Direct, Scheduled,
     *       Webservice)}
     * 
     */
    public static final String PROPERTY_CHANNEL = "channel";

    /**
     * Property process stored in column AD_Process_ID in table AD_Progroupexe_V<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property processRequest stored in column AD_Process_Request_ID in table AD_Progroupexe_V<br>
     * Help: {@literal Request to run a Process, either directly or scheduled for a later date.}
     * 
     */
    public static final String PROPERTY_PROCESSREQUEST = "processRequest";

    /**
     * Property processRun stored in column AD_Process_Run_ID in table AD_Progroupexe_V<br>
     * Help: {@literal Single execution of a Process.}
     * 
     */
    public static final String PROPERTY_PROCESSRUN = "processRun";


    public ProcessGroupExecution() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_STARTTIME
     * 
     */
    public Date getStartTime() {
        return (Date) get(PROPERTY_STARTTIME);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_STARTTIME
     * 
     */
    public void setStartTime(Date startTime) {
        set(PROPERTY_STARTTIME, startTime);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_ENDTIME
     * 
     */
    public Date getEndTime() {
        return (Date) get(PROPERTY_ENDTIME);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_ENDTIME
     * 
     */
    public void setEndTime(Date endTime) {
        set(PROPERTY_ENDTIME, endTime);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_DURATION
     * 
     */
    public String getDuration() {
        return (String) get(PROPERTY_DURATION);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_DURATION
     * 
     */
    public void setDuration(String duration) {
        set(PROPERTY_DURATION, duration);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESSLOG
     * 
     */
    public String getProcessLog() {
        return (String) get(PROPERTY_PROCESSLOG);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESSLOG
     * 
     */
    public void setProcessLog(String processLog) {
        set(PROPERTY_PROCESSLOG, processLog);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_CHANNEL
     * 
     */
    public String getChannel() {
        return (String) get(PROPERTY_CHANNEL);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_CHANNEL
     * 
     */
    public void setChannel(String channel) {
        set(PROPERTY_CHANNEL, channel);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESSREQUEST
     * 
     */
    public ProcessRequest getProcessRequest() {
        return (ProcessRequest) get(PROPERTY_PROCESSREQUEST);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESSREQUEST
     * 
     */
    public void setProcessRequest(ProcessRequest processRequest) {
        set(PROPERTY_PROCESSREQUEST, processRequest);
    }

    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESSRUN
     * 
     */
    public ProcessRun getProcessRun() {
        return (ProcessRun) get(PROPERTY_PROCESSRUN);
    }
    /**
     * @see ProcessGroupExecution#PROPERTY_PROCESSRUN
     * 
     */
    public void setProcessRun(ProcessRun processRun) {
        set(PROPERTY_PROCESSRUN, processRun);
    }

}
