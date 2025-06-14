
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
package org.openbravo.model.manufacturing.maintenance;

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
 * Entity class for entity ManufacturingMaintenancePeriodicity (stored in table MA_Maint_Periodicity).
 * <br>
 * Help: {@literal Periodicities of the maintenances defined for machines and machine categories.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Periodicity extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Maint_Periodicity";
    public static final String ENTITY_NAME = "ManufacturingMaintenancePeriodicity";

    /**
     * Property id stored in column MA_Maint_Periodicity_ID in table MA_Maint_Periodicity 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Maint_Periodicity 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Maint_Periodicity 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Maint_Periodicity 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Maint_Periodicity 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Maint_Periodicity 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Maint_Periodicity 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Maint_Periodicity 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property periodicityType stored in column Periodicity_Type in table MA_Maint_Periodicity 
     * 
     */
    public static final String PROPERTY_PERIODICITYTYPE = "periodicityType";

    /**
     * Property maintenance stored in column MA_Maintenance_ID in table MA_Maint_Periodicity<br>
     * Help: {@literal Identifies a maintenance of a machine or machine category.}
     * 
     */
    public static final String PROPERTY_MAINTENANCE = "maintenance";

    /**
     * Property weekday stored in column WeekDay in table MA_Maint_Periodicity<br>
     * Help: {@literal Day of the week}
     * 
     */
    public static final String PROPERTY_WEEKDAY = "weekday";

    /**
     * Property dayOfTheMonth stored in column Monthday in table MA_Maint_Periodicity<br>
     * Help: {@literal Day of the month}
     * 
     */
    public static final String PROPERTY_DAYOFTHEMONTH = "dayOfTheMonth";

    /**
     * Property shift stored in column Shift in table MA_Maint_Periodicity<br>
     * Help: {@literal Indicates the shift when the group is going to be measured. Available options are morning
     *       and swing shift}
     * 
     */
    public static final String PROPERTY_SHIFT = "shift";

    /**
     * Property startingDay stored in column Initdate in table MA_Maint_Periodicity<br>
     * Help: {@literal Initial date.}
     * 
     */
    public static final String PROPERTY_STARTINGDAY = "startingDay";

    /**
     * Property excludeWeekends stored in column Excludeweekend in table MA_Maint_Periodicity<br>
     * Help: {@literal Exclude weekends from the calculation results.}
     * 
     */
    public static final String PROPERTY_EXCLUDEWEEKENDS = "excludeWeekends";


    public Periodicity() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_EXCLUDEWEEKENDS, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Periodicity#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Periodicity#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Periodicity#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Periodicity#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Periodicity#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Periodicity#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Periodicity#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Periodicity#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Periodicity#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Periodicity#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Periodicity#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Periodicity#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Periodicity#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Periodicity#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Periodicity#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Periodicity#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Periodicity#PROPERTY_PERIODICITYTYPE
     * 
     */
    public String getPeriodicityType() {
        return (String) get(PROPERTY_PERIODICITYTYPE);
    }
    /**
     * @see Periodicity#PROPERTY_PERIODICITYTYPE
     * 
     */
    public void setPeriodicityType(String periodicityType) {
        set(PROPERTY_PERIODICITYTYPE, periodicityType);
    }

    /**
     * @see Periodicity#PROPERTY_MAINTENANCE
     * 
     */
    public Maintenance getMaintenance() {
        return (Maintenance) get(PROPERTY_MAINTENANCE);
    }
    /**
     * @see Periodicity#PROPERTY_MAINTENANCE
     * 
     */
    public void setMaintenance(Maintenance maintenance) {
        set(PROPERTY_MAINTENANCE, maintenance);
    }

    /**
     * @see Periodicity#PROPERTY_WEEKDAY
     * 
     */
    public String getWeekday() {
        return (String) get(PROPERTY_WEEKDAY);
    }
    /**
     * @see Periodicity#PROPERTY_WEEKDAY
     * 
     */
    public void setWeekday(String weekday) {
        set(PROPERTY_WEEKDAY, weekday);
    }

    /**
     * @see Periodicity#PROPERTY_DAYOFTHEMONTH
     * 
     */
    public Long getDayOfTheMonth() {
        return (Long) get(PROPERTY_DAYOFTHEMONTH);
    }
    /**
     * @see Periodicity#PROPERTY_DAYOFTHEMONTH
     * 
     */
    public void setDayOfTheMonth(Long dayOfTheMonth) {
        set(PROPERTY_DAYOFTHEMONTH, dayOfTheMonth);
    }

    /**
     * @see Periodicity#PROPERTY_SHIFT
     * 
     */
    public String getShift() {
        return (String) get(PROPERTY_SHIFT);
    }
    /**
     * @see Periodicity#PROPERTY_SHIFT
     * 
     */
    public void setShift(String shift) {
        set(PROPERTY_SHIFT, shift);
    }

    /**
     * @see Periodicity#PROPERTY_STARTINGDAY
     * 
     */
    public Date getStartingDay() {
        return (Date) get(PROPERTY_STARTINGDAY);
    }
    /**
     * @see Periodicity#PROPERTY_STARTINGDAY
     * 
     */
    public void setStartingDay(Date startingDay) {
        set(PROPERTY_STARTINGDAY, startingDay);
    }

    /**
     * @see Periodicity#PROPERTY_EXCLUDEWEEKENDS
     * 
     */
    public Boolean isExcludeWeekends() {
        return (Boolean) get(PROPERTY_EXCLUDEWEEKENDS);
    }
    /**
     * @see Periodicity#PROPERTY_EXCLUDEWEEKENDS
     * 
     */
    public void setExcludeWeekends(Boolean excludeWeekends) {
        set(PROPERTY_EXCLUDEWEEKENDS, excludeWeekends);
    }

}
