
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
 * Entity class for entity OBSCHEDCalendars (stored in table obsched_calendars).
 * <br>
 * Help: {@literal Quartz execution calendar for simple triggers}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzCalendars extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_calendars";
    public static final String ENTITY_NAME = "OBSCHEDCalendars";

    /**
     * Property id stored in column Obsched_Calendars_ID in table obsched_calendars 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_calendars<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property calendarName stored in column Calendar_Name in table obsched_calendars 
     * 
     */
    public static final String PROPERTY_CALENDARNAME = "calendarName";

    /**
     * Property calendar stored in column Calendar in table obsched_calendars
     * 
     */
    public static final String PROPERTY_CALENDAR = "calendar";


    public QuartzCalendars() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzCalendars#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzCalendars#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzCalendars#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzCalendars#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzCalendars#PROPERTY_CALENDARNAME
     * 
     */
    public String getCalendarName() {
        return (String) get(PROPERTY_CALENDARNAME);
    }
    /**
     * @see QuartzCalendars#PROPERTY_CALENDARNAME
     * 
     */
    public void setCalendarName(String calendarName) {
        set(PROPERTY_CALENDARNAME, calendarName);
    }

    /**
     * @see QuartzCalendars#PROPERTY_CALENDAR
     * 
     */
    public byte[] getCalendar() {
        return (byte[]) get(PROPERTY_CALENDAR);
    }
    /**
     * @see QuartzCalendars#PROPERTY_CALENDAR
     * 
     */
    public void setCalendar(byte[] calendar) {
        set(PROPERTY_CALENDAR, calendar);
    }

}
