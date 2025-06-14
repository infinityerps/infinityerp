
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
 * Entity class for entity c_year_close_v (stored in table c_year_close_v).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class YearClose extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "c_year_close_v";
    public static final String ENTITY_NAME = "c_year_close_v";

    /**
     * Property id stored in column C_Year_Close_V_ID in table c_year_close_v
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table c_year_close_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table c_year_close_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table c_year_close_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table c_year_close_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table c_year_close_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table c_year_close_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table c_year_close_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property calendar stored in column C_Calendar_ID in table c_year_close_v<br>
     * Help: {@literal The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used. 
     *       For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar
     *       that runs from July 1 to June 30.}
     * 
     */
    public static final String PROPERTY_CALENDAR = "calendar";

    /**
     * Property year stored in column C_Year_ID in table c_year_close_v<br>
     * Help: {@literal The Year uniquely identifies an accounting year for a calendar.}
     * 
     */
    public static final String PROPERTY_YEAR = "year";

    /**
     * Property status stored in column Status in table c_year_close_v<br>
     * Help: {@literal Identifies the Status of the document}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property processed stored in column Processed in table c_year_close_v<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";


    public YearClose() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see YearClose#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see YearClose#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see YearClose#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see YearClose#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see YearClose#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see YearClose#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see YearClose#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see YearClose#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see YearClose#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see YearClose#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see YearClose#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see YearClose#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see YearClose#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see YearClose#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see YearClose#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see YearClose#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see YearClose#PROPERTY_CALENDAR
     * 
     */
    public Calendar getCalendar() {
        return (Calendar) get(PROPERTY_CALENDAR);
    }
    /**
     * @see YearClose#PROPERTY_CALENDAR
     * 
     */
    public void setCalendar(Calendar calendar) {
        set(PROPERTY_CALENDAR, calendar);
    }

    /**
     * @see YearClose#PROPERTY_YEAR
     * 
     */
    public Year getYear() {
        return (Year) get(PROPERTY_YEAR);
    }
    /**
     * @see YearClose#PROPERTY_YEAR
     * 
     */
    public void setYear(Year year) {
        set(PROPERTY_YEAR, year);
    }

    /**
     * @see YearClose#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see YearClose#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see YearClose#PROPERTY_PROCESSED
     * 
     */
    public String getProcessed() {
        return (String) get(PROPERTY_PROCESSED);
    }
    /**
     * @see YearClose#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(String processed) {
        set(PROPERTY_PROCESSED, processed);
    }

}
