
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
package org.openbravo.model.financialmgmt.calendar;

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
 * Entity class for entity PeriodControlLog (stored in table C_PeriodControl_Log).
 * <br>
 * Help: {@literal It stores a log about the execution of the open or close period control process.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PeriodControlLog extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_PeriodControl_Log";
    public static final String ENTITY_NAME = "PeriodControlLog";

    /**
     * Property id stored in column C_Periodcontrol_Log_ID in table C_PeriodControl_Log 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_PeriodControl_Log 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_PeriodControl_Log 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_PeriodControl_Log 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_PeriodControl_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_PeriodControl_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_PeriodControl_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_PeriodControl_Log 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table C_PeriodControl_Log<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property processNow stored in column Processing in table C_PeriodControl_Log<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_PeriodControl_Log<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property calendar stored in column C_Calendar_ID in table C_PeriodControl_Log<br>
     * Help: {@literal The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used. 
     *       For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar
     *       that runs from July 1 to June 30.}
     * 
     */
    public static final String PROPERTY_CALENDAR = "calendar";

    /**
     * Property cascade stored in column IsRecursive in table C_PeriodControl_Log<br>
     * Help: {@literal If it is selected, the process will also open or close the documents of all of the
     *       organizations that depend on the selected organization.}
     * 
     */
    public static final String PROPERTY_CASCADE = "cascade";

    /**
     * Property year stored in column C_Year_ID in table C_PeriodControl_Log<br>
     * Help: {@literal The Year uniquely identifies an accounting year for a calendar.}
     * 
     */
    public static final String PROPERTY_YEAR = "year";

    /**
     * Property periodNo stored in column Periodno in table C_PeriodControl_Log<br>
     * Help: {@literal The Period No identifies a specific period for this year. Each period is defined by a
     *       start and end date.  Date ranges for a calendar and year cannot overlap.}
     * 
     */
    public static final String PROPERTY_PERIODNO = "periodNo";

    /**
     * Property documentCategory stored in column Docbasetype in table C_PeriodControl_Log<br>
     * Help: {@literal The Document Base Type identifies the base or starting point for a document.  Multiple
     *       document types may share a single document base type.}
     * 
     */
    public static final String PROPERTY_DOCUMENTCATEGORY = "documentCategory";

    /**
     * Property periodAction stored in column Periodaction in table C_PeriodControl_Log 
     * 
     */
    public static final String PROPERTY_PERIODACTION = "periodAction";

    /**
     * Property period stored in column C_Period_ID in table C_PeriodControl_Log<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";


    public PeriodControlLog() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_CASCADE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PeriodControlLog#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PeriodControlLog#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PeriodControlLog#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PeriodControlLog#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PeriodControlLog#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PeriodControlLog#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PeriodControlLog#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PeriodControlLog#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PeriodControlLog#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PeriodControlLog#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PeriodControlLog#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PeriodControlLog#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PeriodControlLog#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PeriodControlLog#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PeriodControlLog#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PeriodControlLog#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PeriodControlLog#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PeriodControlLog#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PeriodControlLog#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see PeriodControlLog#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see PeriodControlLog#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see PeriodControlLog#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see PeriodControlLog#PROPERTY_CALENDAR
     * 
     */
    public Calendar getCalendar() {
        return (Calendar) get(PROPERTY_CALENDAR);
    }
    /**
     * @see PeriodControlLog#PROPERTY_CALENDAR
     * 
     */
    public void setCalendar(Calendar calendar) {
        set(PROPERTY_CALENDAR, calendar);
    }

    /**
     * @see PeriodControlLog#PROPERTY_CASCADE
     * 
     */
    public Boolean isCascade() {
        return (Boolean) get(PROPERTY_CASCADE);
    }
    /**
     * @see PeriodControlLog#PROPERTY_CASCADE
     * 
     */
    public void setCascade(Boolean cascade) {
        set(PROPERTY_CASCADE, cascade);
    }

    /**
     * @see PeriodControlLog#PROPERTY_YEAR
     * 
     */
    public Year getYear() {
        return (Year) get(PROPERTY_YEAR);
    }
    /**
     * @see PeriodControlLog#PROPERTY_YEAR
     * 
     */
    public void setYear(Year year) {
        set(PROPERTY_YEAR, year);
    }

    /**
     * @see PeriodControlLog#PROPERTY_PERIODNO
     * 
     */
    public Period getPeriodNo() {
        return (Period) get(PROPERTY_PERIODNO);
    }
    /**
     * @see PeriodControlLog#PROPERTY_PERIODNO
     * 
     */
    public void setPeriodNo(Period periodNo) {
        set(PROPERTY_PERIODNO, periodNo);
    }

    /**
     * @see PeriodControlLog#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public String getDocumentCategory() {
        return (String) get(PROPERTY_DOCUMENTCATEGORY);
    }
    /**
     * @see PeriodControlLog#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public void setDocumentCategory(String documentCategory) {
        set(PROPERTY_DOCUMENTCATEGORY, documentCategory);
    }

    /**
     * @see PeriodControlLog#PROPERTY_PERIODACTION
     * 
     */
    public String getPeriodAction() {
        return (String) get(PROPERTY_PERIODACTION);
    }
    /**
     * @see PeriodControlLog#PROPERTY_PERIODACTION
     * 
     */
    public void setPeriodAction(String periodAction) {
        set(PROPERTY_PERIODACTION, periodAction);
    }

    /**
     * @see PeriodControlLog#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see PeriodControlLog#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

}
