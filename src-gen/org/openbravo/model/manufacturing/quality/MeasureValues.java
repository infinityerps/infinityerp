
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

import java.math.BigDecimal;
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
 * Entity class for entity ManufacturingMeasureValues (stored in table MA_Measure_Values).
 * <br>
 * Help: {@literal In this table gathering values are registered.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MeasureValues extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Measure_Values";
    public static final String ENTITY_NAME = "ManufacturingMeasureValues";

    /**
     * Property id stored in column MA_Measure_Values_ID in table MA_Measure_Values 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Measure_Values 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Measure_Values 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Measure_Values 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Measure_Values 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Measure_Values 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Measure_Values 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Measure_Values 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property measurementTime stored in column MA_Measure_Time_ID in table MA_Measure_Values<br>
     * Help: {@literal Identifies the time of the data gathering.}
     * 
     */
    public static final String PROPERTY_MEASUREMENTTIME = "measurementTime";

    /**
     * Property criticalControlPoint stored in column MA_Ccp_ID in table MA_Measure_Values<br>
     * Help: {@literal Identifies each measured critical control point.}
     * 
     */
    public static final String PROPERTY_CRITICALCONTROLPOINT = "criticalControlPoint";

    /**
     * Property valueType stored in column Valuetype in table MA_Measure_Values<br>
     * Help: {@literal Set the value type expected for the point. Possible options are: Yes/No, String or
     *       Number.}
     * 
     */
    public static final String PROPERTY_VALUETYPE = "valueType";

    /**
     * Property text stored in column V_String in table MA_Measure_Values<br>
     * Help: {@literal Result of the measure in text format.}
     * 
     */
    public static final String PROPERTY_TEXT = "text";

    /**
     * Property value stored in column V_Number in table MA_Measure_Values<br>
     * Help: {@literal Result of the measure in numeric format.}
     * 
     */
    public static final String PROPERTY_VALUE = "value";

    /**
     * Property check stored in column V_Char in table MA_Measure_Values<br>
     * Help: {@literal Yes/No result of the measure.}
     * 
     */
    public static final String PROPERTY_CHECK = "check";

    /**
     * Property sequenceNumber stored in column SeqNo in table MA_Measure_Values<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";


    public MeasureValues() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_VALUETYPE, "N");
        setDefaultValue(PROPERTY_CHECK, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MeasureValues#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MeasureValues#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MeasureValues#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MeasureValues#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MeasureValues#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MeasureValues#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MeasureValues#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MeasureValues#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MeasureValues#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MeasureValues#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MeasureValues#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MeasureValues#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MeasureValues#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MeasureValues#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MeasureValues#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MeasureValues#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MeasureValues#PROPERTY_MEASUREMENTTIME
     * 
     */
    public MeasureTime getMeasurementTime() {
        return (MeasureTime) get(PROPERTY_MEASUREMENTTIME);
    }
    /**
     * @see MeasureValues#PROPERTY_MEASUREMENTTIME
     * 
     */
    public void setMeasurementTime(MeasureTime measurementTime) {
        set(PROPERTY_MEASUREMENTTIME, measurementTime);
    }

    /**
     * @see MeasureValues#PROPERTY_CRITICALCONTROLPOINT
     * 
     */
    public CheckPoint getCriticalControlPoint() {
        return (CheckPoint) get(PROPERTY_CRITICALCONTROLPOINT);
    }
    /**
     * @see MeasureValues#PROPERTY_CRITICALCONTROLPOINT
     * 
     */
    public void setCriticalControlPoint(CheckPoint criticalControlPoint) {
        set(PROPERTY_CRITICALCONTROLPOINT, criticalControlPoint);
    }

    /**
     * @see MeasureValues#PROPERTY_VALUETYPE
     * 
     */
    public String getValueType() {
        return (String) get(PROPERTY_VALUETYPE);
    }
    /**
     * @see MeasureValues#PROPERTY_VALUETYPE
     * 
     */
    public void setValueType(String valueType) {
        set(PROPERTY_VALUETYPE, valueType);
    }

    /**
     * @see MeasureValues#PROPERTY_TEXT
     * 
     */
    public String getText() {
        return (String) get(PROPERTY_TEXT);
    }
    /**
     * @see MeasureValues#PROPERTY_TEXT
     * 
     */
    public void setText(String text) {
        set(PROPERTY_TEXT, text);
    }

    /**
     * @see MeasureValues#PROPERTY_VALUE
     * 
     */
    public BigDecimal getValue() {
        return (BigDecimal) get(PROPERTY_VALUE);
    }
    /**
     * @see MeasureValues#PROPERTY_VALUE
     * 
     */
    public void setValue(BigDecimal value) {
        set(PROPERTY_VALUE, value);
    }

    /**
     * @see MeasureValues#PROPERTY_CHECK
     * 
     */
    public Boolean isCheck() {
        return (Boolean) get(PROPERTY_CHECK);
    }
    /**
     * @see MeasureValues#PROPERTY_CHECK
     * 
     */
    public void setCheck(Boolean check) {
        set(PROPERTY_CHECK, check);
    }

    /**
     * @see MeasureValues#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see MeasureValues#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

}
