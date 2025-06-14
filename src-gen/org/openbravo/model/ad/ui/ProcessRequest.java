
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

import java.sql.Timestamp;
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
 * Entity class for entity ProcessRequest (stored in table AD_Process_Request).
 * <br>
 * Help: {@literal Create a new Process Request to be executed immediately, at a later date or on a recurring
     *       basis.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessRequest extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Process_Request";
    public static final String ENTITY_NAME = "ProcessRequest";

    /**
     * Property id stored in column AD_Process_Request_ID in table AD_Process_Request<br>
     * Help: {@literal Request to run a Process, either directly or scheduled for a later date.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Process_Request 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Process_Request 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Process_Request 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Process_Request 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Process_Request 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Process_Request 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Process_Request 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property process stored in column AD_Process_ID in table AD_Process_Request<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property description stored in column Description in table AD_Process_Request<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property userContact stored in column AD_User_ID in table AD_Process_Request<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property securityBasedOnRole stored in column Isrolesecurity in table AD_Process_Request<br>
     * Help: {@literal A flag indicating whether access to an item should be based on a user's role within the
     *       system.}
     * 
     */
    public static final String PROPERTY_SECURITYBASEDONROLE = "securityBasedOnRole";

    /**
     * Property openbravoContext stored in column OB_Context in table AD_Process_Request<br>
     * Help: {@literal The context in which a Process Request was scheduled or executed. The context contains
     *       information such as user, client, organization, language, date format etc.}
     * 
     */
    public static final String PROPERTY_OPENBRAVOCONTEXT = "openbravoContext";

    /**
     * Property status stored in column Status in table AD_Process_Request<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property nextExecution stored in column Next_Fire_Time in table AD_Process_Request<br>
     * Help: {@literal The next time a process will execute.}
     * 
     */
    public static final String PROPERTY_NEXTEXECUTION = "nextExecution";

    /**
     * Property previousExecution stored in column Previous_Fire_Time in table AD_Process_Request<br>
     * Help: {@literal The last time this Process Request was executed.}
     * 
     */
    public static final String PROPERTY_PREVIOUSEXECUTION = "previousExecution";

    /**
     * Property finish stored in column Scheduled_Finish in table AD_Process_Request<br>
     * Help: {@literal The date and time a Process Request is due to finish (repeating).}
     * 
     */
    public static final String PROPERTY_FINISH = "finish";

    /**
     * Property channel stored in column Channel in table AD_Process_Request<br>
     * Help: {@literal The method by which this Process request was executed/scheduled (Direct, Scheduled,
     *       Webservice)}
     * 
     */
    public static final String PROPERTY_CHANNEL = "channel";

    /**
     * Property timing stored in column Timing_Option in table AD_Process_Request<br>
     * Help: {@literal When to run a Process Request - either immediately, at a later date or on a recurring
     *       basis.}
     * 
     */
    public static final String PROPERTY_TIMING = "timing";

    /**
     * Property startTime stored in column Start_Time in table AD_Process_Request<br>
     * Help: {@literal The time at which an item is due to, or did, start.}
     * 
     */
    public static final String PROPERTY_STARTTIME = "startTime";

    /**
     * Property startDate stored in column Start_Date in table AD_Process_Request<br>
     * Help: {@literal The date on which an item is due to start.}
     * 
     */
    public static final String PROPERTY_STARTDATE = "startDate";

    /**
     * Property frequency stored in column Frequency in table AD_Process_Request<br>
     * Help: {@literal The frequency is used in conjunction with the frequency type in determining an event.
     *       Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks.}
     * 
     */
    public static final String PROPERTY_FREQUENCY = "frequency";

    /**
     * Property intervalInSeconds stored in column Secondly_Interval in table AD_Process_Request<br>
     * Help: {@literal Interval in hours between an event (such as a process execution).}
     * 
     */
    public static final String PROPERTY_INTERVALINSECONDS = "intervalInSeconds";

    /**
     * Property intervalInMinutes stored in column Minutely_Interval in table AD_Process_Request<br>
     * Help: {@literal Interval in minutes between an event (such as a process execution).}
     * 
     */
    public static final String PROPERTY_INTERVALINMINUTES = "intervalInMinutes";

    /**
     * Property hourlyInterval stored in column Hourly_Interval in table AD_Process_Request<br>
     * Help: {@literal Interval in hours between an event (such as a process execution).}
     * 
     */
    public static final String PROPERTY_HOURLYINTERVAL = "hourlyInterval";

    /**
     * Property dailyInterval stored in column Daily_Interval in table AD_Process_Request<br>
     * Help: {@literal The daily interval between executions of a process.}
     * 
     */
    public static final String PROPERTY_DAILYINTERVAL = "dailyInterval";

    /**
     * Property repetitions stored in column Secondly_Repetitions in table AD_Process_Request<br>
     * Help: {@literal The number of times a process request will repeat after its first execution. Note that 10
     *       repeats will give a total of 11 process executions.}
     * 
     */
    public static final String PROPERTY_REPETITIONS = "repetitions";

    /**
     * Property numRepetitions stored in column Minutely_Repetitions in table AD_Process_Request<br>
     * Help: {@literal The number of times a process request will repeat after its first execution. Note that 10
     *       repeats will give a total of 11 process executions.}
     * 
     */
    public static final String PROPERTY_NUMREPETITIONS = "numRepetitions";

    /**
     * Property numberOfRepetitions stored in column Hourly_Repetitions in table AD_Process_Request<br>
     * Help: {@literal The number of times a process request will repeat after its first execution. Note that 10
     *       repeats will give a total of 11 process executions.}
     * 
     */
    public static final String PROPERTY_NUMBEROFREPETITIONS = "numberOfRepetitions";

    /**
     * Property monday stored in column DAY_Mon in table AD_Process_Request<br>
     * Help: {@literal The day of the week Monday.}
     * 
     */
    public static final String PROPERTY_MONDAY = "monday";

    /**
     * Property tuesday stored in column DAY_Tue in table AD_Process_Request<br>
     * Help: {@literal The day of the week Tuesday.}
     * 
     */
    public static final String PROPERTY_TUESDAY = "tuesday";

    /**
     * Property wednesday stored in column DAY_Wed in table AD_Process_Request<br>
     * Help: {@literal The day of the week Wednesday.}
     * 
     */
    public static final String PROPERTY_WEDNESDAY = "wednesday";

    /**
     * Property thursday stored in column DAY_Thu in table AD_Process_Request<br>
     * Help: {@literal The day of the week Thursday.}
     * 
     */
    public static final String PROPERTY_THURSDAY = "thursday";

    /**
     * Property friday stored in column DAY_Fri in table AD_Process_Request<br>
     * Help: {@literal The day of the week Friday.}
     * 
     */
    public static final String PROPERTY_FRIDAY = "friday";

    /**
     * Property saturday stored in column DAY_Sat in table AD_Process_Request<br>
     * Help: {@literal The day of the week Saturday.}
     * 
     */
    public static final String PROPERTY_SATURDAY = "saturday";

    /**
     * Property sunday stored in column DAY_Sun in table AD_Process_Request<br>
     * Help: {@literal The day of the week Sunday.}
     * 
     */
    public static final String PROPERTY_SUNDAY = "sunday";

    /**
     * Property monthlyOption stored in column Monthly_Option in table AD_Process_Request<br>
     * Help: {@literal An option by which to schedule a Process in a monthly manner. The option can be a specific
     *       date within each month, the last day of each month, or the Nth selected day within each month, such
     *       as the first Wednesday of each month.}
     * 
     */
    public static final String PROPERTY_MONTHLYOPTION = "monthlyOption";

    /**
     * Property dayInMonth stored in column Monthly_Specific_Day in table AD_Process_Request<br>
     * Help: {@literal The specific date within each month. For example, specifying 15 will signify the 15th of
     *       each month.}
     * 
     */
    public static final String PROPERTY_DAYINMONTH = "dayInMonth";

    /**
     * Property dayOfTheWeek stored in column Monthly_Day_Of_Week in table AD_Process_Request<br>
     * Help: {@literal A day within a week.}
     * 
     */
    public static final String PROPERTY_DAYOFTHEWEEK = "dayOfTheWeek";

    /**
     * Property finishes stored in column Finishes in table AD_Process_Request<br>
     * Help: {@literal Specifiy that this item should finish.}
     * 
     */
    public static final String PROPERTY_FINISHES = "finishes";

    /**
     * Property finishTime stored in column Finishes_Time in table AD_Process_Request<br>
     * Help: {@literal The time that this item will finish.}
     * 
     */
    public static final String PROPERTY_FINISHTIME = "finishTime";

    /**
     * Property finishDate stored in column Finishes_Date in table AD_Process_Request<br>
     * Help: {@literal The date that this item will finish.}
     * 
     */
    public static final String PROPERTY_FINISHDATE = "finishDate";

    /**
     * Property dailyOption stored in column Daily_Option in table AD_Process_Request<br>
     * Help: {@literal Option to run a Process Request on a daily basis.}
     * 
     */
    public static final String PROPERTY_DAILYOPTION = "dailyOption";

    /**
     * Property cronExpression stored in column Cron in table AD_Process_Request<br>
     * Help: {@literal A Quartz cron expression to schedule this Process Request. More information on Quartz cron
     *       expression can be found at http://quartz.sourceforge.net/javadoc/org/quartz/CronTrigger.html and }
     * 
     */
    public static final String PROPERTY_CRONEXPRESSION = "cronExpression";

    /**
     * Property processSet stored in column AD_Process_Set_ID in table AD_Process_Request<br>
     * Help: {@literal Unique identifier for a Process Set (a collection of Process Requests).}
     * 
     */
    public static final String PROPERTY_PROCESSSET = "processSet";

    /**
     * Property scheduleProcess stored in column Schedule in table AD_Process_Request<br>
     * Help: {@literal Schedule a Process to be executed, either immediately, at a later date or on a recurring
     *       basis.}
     * 
     */
    public static final String PROPERTY_SCHEDULEPROCESS = "scheduleProcess";

    /**
     * Property rescheduleProcess stored in column Reschedule in table AD_Process_Request<br>
     * Help: {@literal Reschedule a previoulsy (or currently) scheduled Process Request.}
     * 
     */
    public static final String PROPERTY_RESCHEDULEPROCESS = "rescheduleProcess";

    /**
     * Property unscheduleProcess stored in column Unschedule in table AD_Process_Request<br>
     * Help: {@literal Unschedule the Process.}
     * 
     */
    public static final String PROPERTY_UNSCHEDULEPROCESS = "unscheduleProcess";

    /**
     * Property params stored in column Params in table AD_Process_Request
     * 
     */
    public static final String PROPERTY_PARAMS = "params";

    /**
     * Property processGroup stored in column AD_Process_Group_ID in table AD_Process_Request<br>
     * Help: {@literal Process Group to be executed in serials from the Process Request window}
     * 
     */
    public static final String PROPERTY_PROCESSGROUP = "processGroup";

    /**
     * Property isgroup stored in column Isgroup in table AD_Process_Request
     * 
     */
    public static final String PROPERTY_ISGROUP = "isgroup";

    /**
     * Property triggeredByGroup stored in column AD_Process_Request_Group_ID in table AD_Process_Request
     * 
     */
    public static final String PROPERTY_TRIGGEREDBYGROUP = "triggeredByGroup";


    public ProcessRequest() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_SECURITYBASEDONROLE, true);
        setDefaultValue(PROPERTY_CHANNEL, "Process Scheduler");
        setDefaultValue(PROPERTY_TIMING, "I");
        setDefaultValue(PROPERTY_FREQUENCY, "4");
        setDefaultValue(PROPERTY_DAILYINTERVAL, (long) 1);
        setDefaultValue(PROPERTY_MONDAY, false);
        setDefaultValue(PROPERTY_TUESDAY, false);
        setDefaultValue(PROPERTY_WEDNESDAY, false);
        setDefaultValue(PROPERTY_THURSDAY, false);
        setDefaultValue(PROPERTY_FRIDAY, false);
        setDefaultValue(PROPERTY_SATURDAY, false);
        setDefaultValue(PROPERTY_SUNDAY, false);
        setDefaultValue(PROPERTY_MONTHLYOPTION, "S");
        setDefaultValue(PROPERTY_FINISHES, false);
        setDefaultValue(PROPERTY_DAILYOPTION, "N");
        setDefaultValue(PROPERTY_SCHEDULEPROCESS, false);
        setDefaultValue(PROPERTY_RESCHEDULEPROCESS, false);
        setDefaultValue(PROPERTY_UNSCHEDULEPROCESS, false);
        setDefaultValue(PROPERTY_ISGROUP, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessRequest#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessRequest#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessRequest#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessRequest#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessRequest#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessRequest#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessRequest#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessRequest#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessRequest#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessRequest#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessRequest#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessRequest#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessRequest#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessRequest#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessRequest#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessRequest#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessRequest#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see ProcessRequest#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see ProcessRequest#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProcessRequest#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProcessRequest#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see ProcessRequest#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see ProcessRequest#PROPERTY_SECURITYBASEDONROLE
     * 
     */
    public Boolean isSecurityBasedOnRole() {
        return (Boolean) get(PROPERTY_SECURITYBASEDONROLE);
    }
    /**
     * @see ProcessRequest#PROPERTY_SECURITYBASEDONROLE
     * 
     */
    public void setSecurityBasedOnRole(Boolean securityBasedOnRole) {
        set(PROPERTY_SECURITYBASEDONROLE, securityBasedOnRole);
    }

    /**
     * @see ProcessRequest#PROPERTY_OPENBRAVOCONTEXT
     * 
     */
    public String getOpenbravoContext() {
        return (String) get(PROPERTY_OPENBRAVOCONTEXT);
    }
    /**
     * @see ProcessRequest#PROPERTY_OPENBRAVOCONTEXT
     * 
     */
    public void setOpenbravoContext(String openbravoContext) {
        set(PROPERTY_OPENBRAVOCONTEXT, openbravoContext);
    }

    /**
     * @see ProcessRequest#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see ProcessRequest#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see ProcessRequest#PROPERTY_NEXTEXECUTION
     * 
     */
    public Date getNextExecution() {
        return (Date) get(PROPERTY_NEXTEXECUTION);
    }
    /**
     * @see ProcessRequest#PROPERTY_NEXTEXECUTION
     * 
     */
    public void setNextExecution(Date nextExecution) {
        set(PROPERTY_NEXTEXECUTION, nextExecution);
    }

    /**
     * @see ProcessRequest#PROPERTY_PREVIOUSEXECUTION
     * 
     */
    public Date getPreviousExecution() {
        return (Date) get(PROPERTY_PREVIOUSEXECUTION);
    }
    /**
     * @see ProcessRequest#PROPERTY_PREVIOUSEXECUTION
     * 
     */
    public void setPreviousExecution(Date previousExecution) {
        set(PROPERTY_PREVIOUSEXECUTION, previousExecution);
    }

    /**
     * @see ProcessRequest#PROPERTY_FINISH
     * 
     */
    public Date getFinish() {
        return (Date) get(PROPERTY_FINISH);
    }
    /**
     * @see ProcessRequest#PROPERTY_FINISH
     * 
     */
    public void setFinish(Date finish) {
        set(PROPERTY_FINISH, finish);
    }

    /**
     * @see ProcessRequest#PROPERTY_CHANNEL
     * 
     */
    public String getChannel() {
        return (String) get(PROPERTY_CHANNEL);
    }
    /**
     * @see ProcessRequest#PROPERTY_CHANNEL
     * 
     */
    public void setChannel(String channel) {
        set(PROPERTY_CHANNEL, channel);
    }

    /**
     * @see ProcessRequest#PROPERTY_TIMING
     * 
     */
    public String getTiming() {
        return (String) get(PROPERTY_TIMING);
    }
    /**
     * @see ProcessRequest#PROPERTY_TIMING
     * 
     */
    public void setTiming(String timing) {
        set(PROPERTY_TIMING, timing);
    }

    /**
     * @see ProcessRequest#PROPERTY_STARTTIME
     * 
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(PROPERTY_STARTTIME);
    }
    /**
     * @see ProcessRequest#PROPERTY_STARTTIME
     * 
     */
    public void setStartTime(Timestamp startTime) {
        set(PROPERTY_STARTTIME, startTime);
    }

    /**
     * @see ProcessRequest#PROPERTY_STARTDATE
     * 
     */
    public Date getStartDate() {
        return (Date) get(PROPERTY_STARTDATE);
    }
    /**
     * @see ProcessRequest#PROPERTY_STARTDATE
     * 
     */
    public void setStartDate(Date startDate) {
        set(PROPERTY_STARTDATE, startDate);
    }

    /**
     * @see ProcessRequest#PROPERTY_FREQUENCY
     * 
     */
    public String getFrequency() {
        return (String) get(PROPERTY_FREQUENCY);
    }
    /**
     * @see ProcessRequest#PROPERTY_FREQUENCY
     * 
     */
    public void setFrequency(String frequency) {
        set(PROPERTY_FREQUENCY, frequency);
    }

    /**
     * @see ProcessRequest#PROPERTY_INTERVALINSECONDS
     * 
     */
    public Long getIntervalInSeconds() {
        return (Long) get(PROPERTY_INTERVALINSECONDS);
    }
    /**
     * @see ProcessRequest#PROPERTY_INTERVALINSECONDS
     * 
     */
    public void setIntervalInSeconds(Long intervalInSeconds) {
        set(PROPERTY_INTERVALINSECONDS, intervalInSeconds);
    }

    /**
     * @see ProcessRequest#PROPERTY_INTERVALINMINUTES
     * 
     */
    public Long getIntervalInMinutes() {
        return (Long) get(PROPERTY_INTERVALINMINUTES);
    }
    /**
     * @see ProcessRequest#PROPERTY_INTERVALINMINUTES
     * 
     */
    public void setIntervalInMinutes(Long intervalInMinutes) {
        set(PROPERTY_INTERVALINMINUTES, intervalInMinutes);
    }

    /**
     * @see ProcessRequest#PROPERTY_HOURLYINTERVAL
     * 
     */
    public Long getHourlyInterval() {
        return (Long) get(PROPERTY_HOURLYINTERVAL);
    }
    /**
     * @see ProcessRequest#PROPERTY_HOURLYINTERVAL
     * 
     */
    public void setHourlyInterval(Long hourlyInterval) {
        set(PROPERTY_HOURLYINTERVAL, hourlyInterval);
    }

    /**
     * @see ProcessRequest#PROPERTY_DAILYINTERVAL
     * 
     */
    public Long getDailyInterval() {
        return (Long) get(PROPERTY_DAILYINTERVAL);
    }
    /**
     * @see ProcessRequest#PROPERTY_DAILYINTERVAL
     * 
     */
    public void setDailyInterval(Long dailyInterval) {
        set(PROPERTY_DAILYINTERVAL, dailyInterval);
    }

    /**
     * @see ProcessRequest#PROPERTY_REPETITIONS
     * 
     */
    public Long getRepetitions() {
        return (Long) get(PROPERTY_REPETITIONS);
    }
    /**
     * @see ProcessRequest#PROPERTY_REPETITIONS
     * 
     */
    public void setRepetitions(Long repetitions) {
        set(PROPERTY_REPETITIONS, repetitions);
    }

    /**
     * @see ProcessRequest#PROPERTY_NUMREPETITIONS
     * 
     */
    public Long getNumRepetitions() {
        return (Long) get(PROPERTY_NUMREPETITIONS);
    }
    /**
     * @see ProcessRequest#PROPERTY_NUMREPETITIONS
     * 
     */
    public void setNumRepetitions(Long numRepetitions) {
        set(PROPERTY_NUMREPETITIONS, numRepetitions);
    }

    /**
     * @see ProcessRequest#PROPERTY_NUMBEROFREPETITIONS
     * 
     */
    public Long getNumberOfRepetitions() {
        return (Long) get(PROPERTY_NUMBEROFREPETITIONS);
    }
    /**
     * @see ProcessRequest#PROPERTY_NUMBEROFREPETITIONS
     * 
     */
    public void setNumberOfRepetitions(Long numberOfRepetitions) {
        set(PROPERTY_NUMBEROFREPETITIONS, numberOfRepetitions);
    }

    /**
     * @see ProcessRequest#PROPERTY_MONDAY
     * 
     */
    public Boolean isMonday() {
        return (Boolean) get(PROPERTY_MONDAY);
    }
    /**
     * @see ProcessRequest#PROPERTY_MONDAY
     * 
     */
    public void setMonday(Boolean monday) {
        set(PROPERTY_MONDAY, monday);
    }

    /**
     * @see ProcessRequest#PROPERTY_TUESDAY
     * 
     */
    public Boolean isTuesday() {
        return (Boolean) get(PROPERTY_TUESDAY);
    }
    /**
     * @see ProcessRequest#PROPERTY_TUESDAY
     * 
     */
    public void setTuesday(Boolean tuesday) {
        set(PROPERTY_TUESDAY, tuesday);
    }

    /**
     * @see ProcessRequest#PROPERTY_WEDNESDAY
     * 
     */
    public Boolean isWednesday() {
        return (Boolean) get(PROPERTY_WEDNESDAY);
    }
    /**
     * @see ProcessRequest#PROPERTY_WEDNESDAY
     * 
     */
    public void setWednesday(Boolean wednesday) {
        set(PROPERTY_WEDNESDAY, wednesday);
    }

    /**
     * @see ProcessRequest#PROPERTY_THURSDAY
     * 
     */
    public Boolean isThursday() {
        return (Boolean) get(PROPERTY_THURSDAY);
    }
    /**
     * @see ProcessRequest#PROPERTY_THURSDAY
     * 
     */
    public void setThursday(Boolean thursday) {
        set(PROPERTY_THURSDAY, thursday);
    }

    /**
     * @see ProcessRequest#PROPERTY_FRIDAY
     * 
     */
    public Boolean isFriday() {
        return (Boolean) get(PROPERTY_FRIDAY);
    }
    /**
     * @see ProcessRequest#PROPERTY_FRIDAY
     * 
     */
    public void setFriday(Boolean friday) {
        set(PROPERTY_FRIDAY, friday);
    }

    /**
     * @see ProcessRequest#PROPERTY_SATURDAY
     * 
     */
    public Boolean isSaturday() {
        return (Boolean) get(PROPERTY_SATURDAY);
    }
    /**
     * @see ProcessRequest#PROPERTY_SATURDAY
     * 
     */
    public void setSaturday(Boolean saturday) {
        set(PROPERTY_SATURDAY, saturday);
    }

    /**
     * @see ProcessRequest#PROPERTY_SUNDAY
     * 
     */
    public Boolean isSunday() {
        return (Boolean) get(PROPERTY_SUNDAY);
    }
    /**
     * @see ProcessRequest#PROPERTY_SUNDAY
     * 
     */
    public void setSunday(Boolean sunday) {
        set(PROPERTY_SUNDAY, sunday);
    }

    /**
     * @see ProcessRequest#PROPERTY_MONTHLYOPTION
     * 
     */
    public String getMonthlyOption() {
        return (String) get(PROPERTY_MONTHLYOPTION);
    }
    /**
     * @see ProcessRequest#PROPERTY_MONTHLYOPTION
     * 
     */
    public void setMonthlyOption(String monthlyOption) {
        set(PROPERTY_MONTHLYOPTION, monthlyOption);
    }

    /**
     * @see ProcessRequest#PROPERTY_DAYINMONTH
     * 
     */
    public Long getDayInMonth() {
        return (Long) get(PROPERTY_DAYINMONTH);
    }
    /**
     * @see ProcessRequest#PROPERTY_DAYINMONTH
     * 
     */
    public void setDayInMonth(Long dayInMonth) {
        set(PROPERTY_DAYINMONTH, dayInMonth);
    }

    /**
     * @see ProcessRequest#PROPERTY_DAYOFTHEWEEK
     * 
     */
    public String getDayOfTheWeek() {
        return (String) get(PROPERTY_DAYOFTHEWEEK);
    }
    /**
     * @see ProcessRequest#PROPERTY_DAYOFTHEWEEK
     * 
     */
    public void setDayOfTheWeek(String dayOfTheWeek) {
        set(PROPERTY_DAYOFTHEWEEK, dayOfTheWeek);
    }

    /**
     * @see ProcessRequest#PROPERTY_FINISHES
     * 
     */
    public Boolean isFinishes() {
        return (Boolean) get(PROPERTY_FINISHES);
    }
    /**
     * @see ProcessRequest#PROPERTY_FINISHES
     * 
     */
    public void setFinishes(Boolean finishes) {
        set(PROPERTY_FINISHES, finishes);
    }

    /**
     * @see ProcessRequest#PROPERTY_FINISHTIME
     * 
     */
    public Timestamp getFinishTime() {
        return (Timestamp) get(PROPERTY_FINISHTIME);
    }
    /**
     * @see ProcessRequest#PROPERTY_FINISHTIME
     * 
     */
    public void setFinishTime(Timestamp finishTime) {
        set(PROPERTY_FINISHTIME, finishTime);
    }

    /**
     * @see ProcessRequest#PROPERTY_FINISHDATE
     * 
     */
    public Date getFinishDate() {
        return (Date) get(PROPERTY_FINISHDATE);
    }
    /**
     * @see ProcessRequest#PROPERTY_FINISHDATE
     * 
     */
    public void setFinishDate(Date finishDate) {
        set(PROPERTY_FINISHDATE, finishDate);
    }

    /**
     * @see ProcessRequest#PROPERTY_DAILYOPTION
     * 
     */
    public String getDailyOption() {
        return (String) get(PROPERTY_DAILYOPTION);
    }
    /**
     * @see ProcessRequest#PROPERTY_DAILYOPTION
     * 
     */
    public void setDailyOption(String dailyOption) {
        set(PROPERTY_DAILYOPTION, dailyOption);
    }

    /**
     * @see ProcessRequest#PROPERTY_CRONEXPRESSION
     * 
     */
    public String getCronExpression() {
        return (String) get(PROPERTY_CRONEXPRESSION);
    }
    /**
     * @see ProcessRequest#PROPERTY_CRONEXPRESSION
     * 
     */
    public void setCronExpression(String cronExpression) {
        set(PROPERTY_CRONEXPRESSION, cronExpression);
    }

    /**
     * @see ProcessRequest#PROPERTY_PROCESSSET
     * 
     */
    public String getProcessSet() {
        return (String) get(PROPERTY_PROCESSSET);
    }
    /**
     * @see ProcessRequest#PROPERTY_PROCESSSET
     * 
     */
    public void setProcessSet(String processSet) {
        set(PROPERTY_PROCESSSET, processSet);
    }

    /**
     * @see ProcessRequest#PROPERTY_SCHEDULEPROCESS
     * 
     */
    public Boolean isScheduleProcess() {
        return (Boolean) get(PROPERTY_SCHEDULEPROCESS);
    }
    /**
     * @see ProcessRequest#PROPERTY_SCHEDULEPROCESS
     * 
     */
    public void setScheduleProcess(Boolean scheduleProcess) {
        set(PROPERTY_SCHEDULEPROCESS, scheduleProcess);
    }

    /**
     * @see ProcessRequest#PROPERTY_RESCHEDULEPROCESS
     * 
     */
    public Boolean isRescheduleProcess() {
        return (Boolean) get(PROPERTY_RESCHEDULEPROCESS);
    }
    /**
     * @see ProcessRequest#PROPERTY_RESCHEDULEPROCESS
     * 
     */
    public void setRescheduleProcess(Boolean rescheduleProcess) {
        set(PROPERTY_RESCHEDULEPROCESS, rescheduleProcess);
    }

    /**
     * @see ProcessRequest#PROPERTY_UNSCHEDULEPROCESS
     * 
     */
    public Boolean isUnscheduleProcess() {
        return (Boolean) get(PROPERTY_UNSCHEDULEPROCESS);
    }
    /**
     * @see ProcessRequest#PROPERTY_UNSCHEDULEPROCESS
     * 
     */
    public void setUnscheduleProcess(Boolean unscheduleProcess) {
        set(PROPERTY_UNSCHEDULEPROCESS, unscheduleProcess);
    }

    /**
     * @see ProcessRequest#PROPERTY_PARAMS
     * 
     */
    public String getParams() {
        return (String) get(PROPERTY_PARAMS);
    }
    /**
     * @see ProcessRequest#PROPERTY_PARAMS
     * 
     */
    public void setParams(String params) {
        set(PROPERTY_PARAMS, params);
    }

    /**
     * @see ProcessRequest#PROPERTY_PROCESSGROUP
     * 
     */
    public ProcessGroup getProcessGroup() {
        return (ProcessGroup) get(PROPERTY_PROCESSGROUP);
    }
    /**
     * @see ProcessRequest#PROPERTY_PROCESSGROUP
     * 
     */
    public void setProcessGroup(ProcessGroup processGroup) {
        set(PROPERTY_PROCESSGROUP, processGroup);
    }

    /**
     * @see ProcessRequest#PROPERTY_ISGROUP
     * 
     */
    public Boolean isGroup() {
        return (Boolean) get(PROPERTY_ISGROUP);
    }
    /**
     * @see ProcessRequest#PROPERTY_ISGROUP
     * 
     */
    public void setGroup(Boolean isgroup) {
        set(PROPERTY_ISGROUP, isgroup);
    }

    /**
     * @see ProcessRequest#PROPERTY_TRIGGEREDBYGROUP
     * 
     */
    public ProcessRequest getTriggeredByGroup() {
        return (ProcessRequest) get(PROPERTY_TRIGGEREDBYGROUP);
    }
    /**
     * @see ProcessRequest#PROPERTY_TRIGGEREDBYGROUP
     * 
     */
    public void setTriggeredByGroup(ProcessRequest triggeredByGroup) {
        set(PROPERTY_TRIGGEREDBYGROUP, triggeredByGroup);
    }

}
