
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
 * Entity class for entity OBSCHEDFiredTriggers (stored in table obsched_fired_triggers).
 * <br>
 * Help: {@literal Quartz triggers currently executing a job}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzFiredTriggers extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_fired_triggers";
    public static final String ENTITY_NAME = "OBSCHEDFiredTriggers";

    /**
     * Property id stored in column Obsched_Fired_Triggers_ID in table obsched_fired_triggers 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_fired_triggers<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property entry stored in column Entry_ID in table obsched_fired_triggers
     * 
     */
    public static final String PROPERTY_ENTRY = "entry";

    /**
     * Property triggerName stored in column Trigger_Name in table obsched_fired_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERNAME = "triggerName";

    /**
     * Property triggerGroup stored in column Trigger_Group in table obsched_fired_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERGROUP = "triggerGroup";

    /**
     * Property instanceName stored in column Instance_Name in table obsched_fired_triggers
     * 
     */
    public static final String PROPERTY_INSTANCENAME = "instanceName";

    /**
     * Property firedTime stored in column Fired_Time in table obsched_fired_triggers<br>
     * Help: {@literal Timestamp when the trigger was fired.}
     * 
     */
    public static final String PROPERTY_FIREDTIME = "firedTime";

    /**
     * Property schedTime stored in column Sched_Time in table obsched_fired_triggers<br>
     * Help: {@literal Timestamp when the trigger has been scheduled.}
     * 
     */
    public static final String PROPERTY_SCHEDTIME = "schedTime";

    /**
     * Property priority stored in column Priority in table obsched_fired_triggers<br>
     * Help: {@literal The Priority indicates the importance of this request.}
     * 
     */
    public static final String PROPERTY_PRIORITY = "priority";

    /**
     * Property state stored in column State in table obsched_fired_triggers
     * 
     */
    public static final String PROPERTY_STATE = "state";

    /**
     * Property jOBName stored in column JOB_Name in table obsched_fired_triggers<br>
     * Help: {@literal Quartz job name identifier.}
     * 
     */
    public static final String PROPERTY_JOBNAME = "jOBName";

    /**
     * Property jOBGroup stored in column JOB_Group in table obsched_fired_triggers<br>
     * Help: {@literal Quartz job group identifier.}
     * 
     */
    public static final String PROPERTY_JOBGROUP = "jOBGroup";

    /**
     * Property nonconcurrent stored in column IS_Nonconcurrent in table obsched_fired_triggers<br>
     * Help: {@literal Defines if a process/job can be executed concurrently or not.}
     * 
     */
    public static final String PROPERTY_NONCONCURRENT = "nonconcurrent";

    /**
     * Property requestsRecovery stored in column Requests_Recovery in table obsched_fired_triggers
     * 
     */
    public static final String PROPERTY_REQUESTSRECOVERY = "requestsRecovery";


    public QuartzFiredTriggers() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_ENTRY
     * 
     */
    public String getEntry() {
        return (String) get(PROPERTY_ENTRY);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_ENTRY
     * 
     */
    public void setEntry(String entry) {
        set(PROPERTY_ENTRY, entry);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public String getTriggerName() {
        return (String) get(PROPERTY_TRIGGERNAME);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public void setTriggerName(String triggerName) {
        set(PROPERTY_TRIGGERNAME, triggerName);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public String getTriggerGroup() {
        return (String) get(PROPERTY_TRIGGERGROUP);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public void setTriggerGroup(String triggerGroup) {
        set(PROPERTY_TRIGGERGROUP, triggerGroup);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_INSTANCENAME
     * 
     */
    public String getInstanceName() {
        return (String) get(PROPERTY_INSTANCENAME);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_INSTANCENAME
     * 
     */
    public void setInstanceName(String instanceName) {
        set(PROPERTY_INSTANCENAME, instanceName);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_FIREDTIME
     * 
     */
    public Long getFiredTime() {
        return (Long) get(PROPERTY_FIREDTIME);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_FIREDTIME
     * 
     */
    public void setFiredTime(Long firedTime) {
        set(PROPERTY_FIREDTIME, firedTime);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_SCHEDTIME
     * 
     */
    public Long getSchedTime() {
        return (Long) get(PROPERTY_SCHEDTIME);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_SCHEDTIME
     * 
     */
    public void setSchedTime(Long schedTime) {
        set(PROPERTY_SCHEDTIME, schedTime);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_PRIORITY
     * 
     */
    public Long getPriority() {
        return (Long) get(PROPERTY_PRIORITY);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_PRIORITY
     * 
     */
    public void setPriority(Long priority) {
        set(PROPERTY_PRIORITY, priority);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_STATE
     * 
     */
    public String getState() {
        return (String) get(PROPERTY_STATE);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_STATE
     * 
     */
    public void setState(String state) {
        set(PROPERTY_STATE, state);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_JOBNAME
     * 
     */
    public String getJOBName() {
        return (String) get(PROPERTY_JOBNAME);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_JOBNAME
     * 
     */
    public void setJOBName(String jOBName) {
        set(PROPERTY_JOBNAME, jOBName);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_JOBGROUP
     * 
     */
    public String getJOBGroup() {
        return (String) get(PROPERTY_JOBGROUP);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_JOBGROUP
     * 
     */
    public void setJOBGroup(String jOBGroup) {
        set(PROPERTY_JOBGROUP, jOBGroup);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_NONCONCURRENT
     * 
     */
    public String getNonconcurrent() {
        return (String) get(PROPERTY_NONCONCURRENT);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_NONCONCURRENT
     * 
     */
    public void setNonconcurrent(String nonconcurrent) {
        set(PROPERTY_NONCONCURRENT, nonconcurrent);
    }

    /**
     * @see QuartzFiredTriggers#PROPERTY_REQUESTSRECOVERY
     * 
     */
    public String getRequestsRecovery() {
        return (String) get(PROPERTY_REQUESTSRECOVERY);
    }
    /**
     * @see QuartzFiredTriggers#PROPERTY_REQUESTSRECOVERY
     * 
     */
    public void setRequestsRecovery(String requestsRecovery) {
        set(PROPERTY_REQUESTSRECOVERY, requestsRecovery);
    }

}
