
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
package org.openbravo.model.manufacturing.quality;

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
 * Entity class for entity ManufacturingMeasureTime (stored in table MA_Measure_Time).
 * <br>
 * Help: {@literal This tab defines the time of the gathering.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MeasureTime extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Measure_Time";
    public static final String ENTITY_NAME = "ManufacturingMeasureTime";

    /**
     * Property id stored in column MA_Measure_Time_ID in table MA_Measure_Time<br>
     * Help: {@literal Identifies the time of the data gathering.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Measure_Time 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Measure_Time 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Measure_Time 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Measure_Time 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Measure_Time 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Measure_Time 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Measure_Time 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property measurementSet stored in column MA_Measure_Group_ID in table MA_Measure_Time<br>
     * Help: {@literal Indicates the groups that are measured in the measure shift.}
     * 
     */
    public static final String PROPERTY_MEASUREMENTSET = "measurementSet";

    /**
     * Property measurementHour stored in column Measurehour in table MA_Measure_Time<br>
     * Help: {@literal Time when the gathering was made.}
     * 
     */
    public static final String PROPERTY_MEASUREMENTHOUR = "measurementHour";

    /**
     * Property insertValues stored in column Explode in table MA_Measure_Time<br>
     * Help: {@literal Process to insert all the necessary measure values of the measured group.}
     * 
     */
    public static final String PROPERTY_INSERTVALUES = "insertValues";

    /**
     * Property processed stored in column Processed in table MA_Measure_Time<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";


    public MeasureTime() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_INSERTVALUES, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MeasureTime#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MeasureTime#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MeasureTime#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MeasureTime#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MeasureTime#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MeasureTime#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MeasureTime#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MeasureTime#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MeasureTime#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MeasureTime#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MeasureTime#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MeasureTime#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MeasureTime#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MeasureTime#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MeasureTime#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MeasureTime#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MeasureTime#PROPERTY_MEASUREMENTSET
     * 
     */
    public MeasureGroup getMeasurementSet() {
        return (MeasureGroup) get(PROPERTY_MEASUREMENTSET);
    }
    /**
     * @see MeasureTime#PROPERTY_MEASUREMENTSET
     * 
     */
    public void setMeasurementSet(MeasureGroup measurementSet) {
        set(PROPERTY_MEASUREMENTSET, measurementSet);
    }

    /**
     * @see MeasureTime#PROPERTY_MEASUREMENTHOUR
     * 
     */
    public Timestamp getMeasurementHour() {
        return (Timestamp) get(PROPERTY_MEASUREMENTHOUR);
    }
    /**
     * @see MeasureTime#PROPERTY_MEASUREMENTHOUR
     * 
     */
    public void setMeasurementHour(Timestamp measurementHour) {
        set(PROPERTY_MEASUREMENTHOUR, measurementHour);
    }

    /**
     * @see MeasureTime#PROPERTY_INSERTVALUES
     * 
     */
    public Boolean isInsertValues() {
        return (Boolean) get(PROPERTY_INSERTVALUES);
    }
    /**
     * @see MeasureTime#PROPERTY_INSERTVALUES
     * 
     */
    public void setInsertValues(Boolean insertValues) {
        set(PROPERTY_INSERTVALUES, insertValues);
    }

    /**
     * @see MeasureTime#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see MeasureTime#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

}
