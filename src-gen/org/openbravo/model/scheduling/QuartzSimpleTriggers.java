
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
 * Entity class for entity OBSCHEDSimpleTriggers (stored in table obsched_simple_triggers).
 * <br>
 * Help: {@literal Quartz triggers with basic scheduling options}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzSimpleTriggers extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_simple_triggers";
    public static final String ENTITY_NAME = "OBSCHEDSimpleTriggers";

    /**
     * Property id stored in column Obsched_Simple_Triggers_ID in table obsched_simple_triggers 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_simple_triggers<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property triggerName stored in column Trigger_Name in table obsched_simple_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERNAME = "triggerName";

    /**
     * Property triggerGroup stored in column Trigger_Group in table obsched_simple_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERGROUP = "triggerGroup";

    /**
     * Property repeatCount stored in column Repeat_Count in table obsched_simple_triggers<br>
     * Help: {@literal Number of times a trigger is to be repeated.}
     * 
     */
    public static final String PROPERTY_REPEATCOUNT = "repeatCount";

    /**
     * Property repeatInterval stored in column Repeat_Interval in table obsched_simple_triggers<br>
     * Help: {@literal Time interval to wait between executions of the trigger.}
     * 
     */
    public static final String PROPERTY_REPEATINTERVAL = "repeatInterval";

    /**
     * Property timesTriggered stored in column Times_Triggered in table obsched_simple_triggers<br>
     * Help: {@literal Number of times a trigger has been triggered.}
     * 
     */
    public static final String PROPERTY_TIMESTRIGGERED = "timesTriggered";


    public QuartzSimpleTriggers() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzSimpleTriggers#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzSimpleTriggers#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzSimpleTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzSimpleTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzSimpleTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public String getTriggerName() {
        return (String) get(PROPERTY_TRIGGERNAME);
    }
    /**
     * @see QuartzSimpleTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public void setTriggerName(String triggerName) {
        set(PROPERTY_TRIGGERNAME, triggerName);
    }

    /**
     * @see QuartzSimpleTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public String getTriggerGroup() {
        return (String) get(PROPERTY_TRIGGERGROUP);
    }
    /**
     * @see QuartzSimpleTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public void setTriggerGroup(String triggerGroup) {
        set(PROPERTY_TRIGGERGROUP, triggerGroup);
    }

    /**
     * @see QuartzSimpleTriggers#PROPERTY_REPEATCOUNT
     * 
     */
    public Long getRepeatCount() {
        return (Long) get(PROPERTY_REPEATCOUNT);
    }
    /**
     * @see QuartzSimpleTriggers#PROPERTY_REPEATCOUNT
     * 
     */
    public void setRepeatCount(Long repeatCount) {
        set(PROPERTY_REPEATCOUNT, repeatCount);
    }

    /**
     * @see QuartzSimpleTriggers#PROPERTY_REPEATINTERVAL
     * 
     */
    public Long getRepeatInterval() {
        return (Long) get(PROPERTY_REPEATINTERVAL);
    }
    /**
     * @see QuartzSimpleTriggers#PROPERTY_REPEATINTERVAL
     * 
     */
    public void setRepeatInterval(Long repeatInterval) {
        set(PROPERTY_REPEATINTERVAL, repeatInterval);
    }

    /**
     * @see QuartzSimpleTriggers#PROPERTY_TIMESTRIGGERED
     * 
     */
    public Long getTimesTriggered() {
        return (Long) get(PROPERTY_TIMESTRIGGERED);
    }
    /**
     * @see QuartzSimpleTriggers#PROPERTY_TIMESTRIGGERED
     * 
     */
    public void setTimesTriggered(Long timesTriggered) {
        set(PROPERTY_TIMESTRIGGERED, timesTriggered);
    }

}
