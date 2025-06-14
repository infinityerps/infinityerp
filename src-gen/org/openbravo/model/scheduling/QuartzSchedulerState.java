
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
 * Entity class for entity OBSCHEDSchedulerState (stored in table obsched_scheduler_state).
 * <br>
 * Help: {@literal Quartz instances of the scheduling cluster}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzSchedulerState extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_scheduler_state";
    public static final String ENTITY_NAME = "OBSCHEDSchedulerState";

    /**
     * Property id stored in column Obsched_Scheduler_State_ID in table obsched_scheduler_state 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_scheduler_state<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property instanceName stored in column Instance_Name in table obsched_scheduler_state 
     * 
     */
    public static final String PROPERTY_INSTANCENAME = "instanceName";

    /**
     * Property lastCheckinTime stored in column Last_Checkin_Time in table obsched_scheduler_state<br>
     * Help: {@literal Timestamp of the last time the scheduler has checked in to the database.}
     * 
     */
    public static final String PROPERTY_LASTCHECKINTIME = "lastCheckinTime";

    /**
     * Property checkinInterval stored in column Checkin_Interval in table obsched_scheduler_state<br>
     * Help: {@literal Time in milliseconds when a scheduler will check if the rest of schedulers are still alive
     *       in a clustered environment. It will also mark itself as still alive.}
     * 
     */
    public static final String PROPERTY_CHECKININTERVAL = "checkinInterval";

    /**
     * Property status stored in column Status in table obsched_scheduler_state<br>
     * Help: {@literal Status of the scheduler instance:
     *       STANDBY: The scheduler is not executing jobs
     *       STARTED:
     *       The scheduler is active and executing jobs}
     * 
     */
    public static final String PROPERTY_STATUS = "status";


    public QuartzSchedulerState() {
        setDefaultValue(PROPERTY_STATUS, "STANDBY");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzSchedulerState#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzSchedulerState#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzSchedulerState#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzSchedulerState#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzSchedulerState#PROPERTY_INSTANCENAME
     * 
     */
    public String getInstanceName() {
        return (String) get(PROPERTY_INSTANCENAME);
    }
    /**
     * @see QuartzSchedulerState#PROPERTY_INSTANCENAME
     * 
     */
    public void setInstanceName(String instanceName) {
        set(PROPERTY_INSTANCENAME, instanceName);
    }

    /**
     * @see QuartzSchedulerState#PROPERTY_LASTCHECKINTIME
     * 
     */
    public Long getLastCheckinTime() {
        return (Long) get(PROPERTY_LASTCHECKINTIME);
    }
    /**
     * @see QuartzSchedulerState#PROPERTY_LASTCHECKINTIME
     * 
     */
    public void setLastCheckinTime(Long lastCheckinTime) {
        set(PROPERTY_LASTCHECKINTIME, lastCheckinTime);
    }

    /**
     * @see QuartzSchedulerState#PROPERTY_CHECKININTERVAL
     * 
     */
    public Long getCheckinInterval() {
        return (Long) get(PROPERTY_CHECKININTERVAL);
    }
    /**
     * @see QuartzSchedulerState#PROPERTY_CHECKININTERVAL
     * 
     */
    public void setCheckinInterval(Long checkinInterval) {
        set(PROPERTY_CHECKININTERVAL, checkinInterval);
    }

    /**
     * @see QuartzSchedulerState#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see QuartzSchedulerState#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

}
