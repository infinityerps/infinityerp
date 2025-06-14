
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
package org.openbravo.model.scheduling;

import org.openbravo.base.structure.BaseOBObject;
/**
 * Entity class for entity OBSCHEDTriggers (stored in table obsched_triggers).
 * <br>
 * Help: {@literal Quartz execution schedule of existent jobs}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzTriggers extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_triggers";
    public static final String ENTITY_NAME = "OBSCHEDTriggers";

    /**
     * Property id stored in column Obsched_Triggers_ID in table obsched_triggers 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_triggers<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property triggerName stored in column Trigger_Name in table obsched_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERNAME = "triggerName";

    /**
     * Property triggerGroup stored in column Trigger_Group in table obsched_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERGROUP = "triggerGroup";

    /**
     * Property jOBName stored in column JOB_Name in table obsched_triggers<br>
     * Help: {@literal Quartz job name identifier.}
     * 
     */
    public static final String PROPERTY_JOBNAME = "jOBName";

    /**
     * Property jOBGroup stored in column JOB_Group in table obsched_triggers<br>
     * Help: {@literal Quartz job group identifier.}
     * 
     */
    public static final String PROPERTY_JOBGROUP = "jOBGroup";

    /**
     * Property description stored in column Description in table obsched_triggers<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property nextExecution stored in column Next_Fire_Time in table obsched_triggers<br>
     * Help: {@literal The next time a process will execute.}
     * 
     */
    public static final String PROPERTY_NEXTEXECUTION = "nextExecution";

    /**
     * Property prevFireTime stored in column Prev_Fire_Time in table obsched_triggers<br>
     * Help: {@literal Last time the trigger has been fired.}
     * 
     */
    public static final String PROPERTY_PREVFIRETIME = "prevFireTime";

    /**
     * Property priority stored in column Priority in table obsched_triggers<br>
     * Help: {@literal The Priority indicates the importance of this request.}
     * 
     */
    public static final String PROPERTY_PRIORITY = "priority";

    /**
     * Property triggerState stored in column Trigger_State in table obsched_triggers<br>
     * Help: {@literal State of a quartz trigger.}
     * 
     */
    public static final String PROPERTY_TRIGGERSTATE = "triggerState";

    /**
     * Property triggerType stored in column Trigger_Type in table obsched_triggers<br>
     * Help: {@literal Type of trigger. Possible values: Blob, Calendar, Simprop, Simple, Cron}
     * 
     */
    public static final String PROPERTY_TRIGGERTYPE = "triggerType";

    /**
     * Property startTime stored in column Start_Time in table obsched_triggers<br>
     * Help: {@literal The time at which an item is due to, or did, start.}
     * 
     */
    public static final String PROPERTY_STARTTIME = "startTime";

    /**
     * Property endTime stored in column END_Time in table obsched_triggers<br>
     * Help: {@literal The time the process execution finished.}
     * 
     */
    public static final String PROPERTY_ENDTIME = "endTime";

    /**
     * Property calendarName stored in column Calendar_Name in table obsched_triggers<br>
     * Help: {@literal Calendar name identifier.}
     * 
     */
    public static final String PROPERTY_CALENDARNAME = "calendarName";

    /**
     * Property misfireInstr stored in column Misfire_Instr in table obsched_triggers<br>
     * Help: {@literal Misfire instruction policy. By default smart policy is used and quartz takes care of
     *       choosing the correct policy.}
     * 
     */
    public static final String PROPERTY_MISFIREINSTR = "misfireInstr";

    /**
     * Property jOBData stored in column JOB_Data in table obsched_triggers<br>
     * Help: {@literal Serialized job data for process execution.}
     * 
     */
    public static final String PROPERTY_JOBDATA = "jOBData";


    public QuartzTriggers() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzTriggers#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzTriggers#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public String getTriggerName() {
        return (String) get(PROPERTY_TRIGGERNAME);
    }
    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public void setTriggerName(String triggerName) {
        set(PROPERTY_TRIGGERNAME, triggerName);
    }

    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public String getTriggerGroup() {
        return (String) get(PROPERTY_TRIGGERGROUP);
    }
    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public void setTriggerGroup(String triggerGroup) {
        set(PROPERTY_TRIGGERGROUP, triggerGroup);
    }

    /**
     * @see QuartzTriggers#PROPERTY_JOBNAME
     * 
     */
    public String getJOBName() {
        return (String) get(PROPERTY_JOBNAME);
    }
    /**
     * @see QuartzTriggers#PROPERTY_JOBNAME
     * 
     */
    public void setJOBName(String jOBName) {
        set(PROPERTY_JOBNAME, jOBName);
    }

    /**
     * @see QuartzTriggers#PROPERTY_JOBGROUP
     * 
     */
    public String getJOBGroup() {
        return (String) get(PROPERTY_JOBGROUP);
    }
    /**
     * @see QuartzTriggers#PROPERTY_JOBGROUP
     * 
     */
    public void setJOBGroup(String jOBGroup) {
        set(PROPERTY_JOBGROUP, jOBGroup);
    }

    /**
     * @see QuartzTriggers#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see QuartzTriggers#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see QuartzTriggers#PROPERTY_NEXTEXECUTION
     * 
     */
    public Long getNextExecution() {
        return (Long) get(PROPERTY_NEXTEXECUTION);
    }
    /**
     * @see QuartzTriggers#PROPERTY_NEXTEXECUTION
     * 
     */
    public void setNextExecution(Long nextExecution) {
        set(PROPERTY_NEXTEXECUTION, nextExecution);
    }

    /**
     * @see QuartzTriggers#PROPERTY_PREVFIRETIME
     * 
     */
    public Long getPrevFireTime() {
        return (Long) get(PROPERTY_PREVFIRETIME);
    }
    /**
     * @see QuartzTriggers#PROPERTY_PREVFIRETIME
     * 
     */
    public void setPrevFireTime(Long prevFireTime) {
        set(PROPERTY_PREVFIRETIME, prevFireTime);
    }

    /**
     * @see QuartzTriggers#PROPERTY_PRIORITY
     * 
     */
    public Long getPriority() {
        return (Long) get(PROPERTY_PRIORITY);
    }
    /**
     * @see QuartzTriggers#PROPERTY_PRIORITY
     * 
     */
    public void setPriority(Long priority) {
        set(PROPERTY_PRIORITY, priority);
    }

    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERSTATE
     * 
     */
    public String getTriggerState() {
        return (String) get(PROPERTY_TRIGGERSTATE);
    }
    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERSTATE
     * 
     */
    public void setTriggerState(String triggerState) {
        set(PROPERTY_TRIGGERSTATE, triggerState);
    }

    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERTYPE
     * 
     */
    public String getTriggerType() {
        return (String) get(PROPERTY_TRIGGERTYPE);
    }
    /**
     * @see QuartzTriggers#PROPERTY_TRIGGERTYPE
     * 
     */
    public void setTriggerType(String triggerType) {
        set(PROPERTY_TRIGGERTYPE, triggerType);
    }

    /**
     * @see QuartzTriggers#PROPERTY_STARTTIME
     * 
     */
    public Long getStartTime() {
        return (Long) get(PROPERTY_STARTTIME);
    }
    /**
     * @see QuartzTriggers#PROPERTY_STARTTIME
     * 
     */
    public void setStartTime(Long startTime) {
        set(PROPERTY_STARTTIME, startTime);
    }

    /**
     * @see QuartzTriggers#PROPERTY_ENDTIME
     * 
     */
    public Long getEndTime() {
        return (Long) get(PROPERTY_ENDTIME);
    }
    /**
     * @see QuartzTriggers#PROPERTY_ENDTIME
     * 
     */
    public void setEndTime(Long endTime) {
        set(PROPERTY_ENDTIME, endTime);
    }

    /**
     * @see QuartzTriggers#PROPERTY_CALENDARNAME
     * 
     */
    public String getCalendarName() {
        return (String) get(PROPERTY_CALENDARNAME);
    }
    /**
     * @see QuartzTriggers#PROPERTY_CALENDARNAME
     * 
     */
    public void setCalendarName(String calendarName) {
        set(PROPERTY_CALENDARNAME, calendarName);
    }

    /**
     * @see QuartzTriggers#PROPERTY_MISFIREINSTR
     * 
     */
    public Long getMisfireInstr() {
        return (Long) get(PROPERTY_MISFIREINSTR);
    }
    /**
     * @see QuartzTriggers#PROPERTY_MISFIREINSTR
     * 
     */
    public void setMisfireInstr(Long misfireInstr) {
        set(PROPERTY_MISFIREINSTR, misfireInstr);
    }

    /**
     * @see QuartzTriggers#PROPERTY_JOBDATA
     * 
     */
    public byte[] getJOBData() {
        return (byte[]) get(PROPERTY_JOBDATA);
    }
    /**
     * @see QuartzTriggers#PROPERTY_JOBDATA
     * 
     */
    public void setJOBData(byte[] jOBData) {
        set(PROPERTY_JOBDATA, jOBData);
    }

}
