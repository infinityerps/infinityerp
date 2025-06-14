
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
 * Entity class for entity ManufacturingCheckPointShift (stored in table MA_CCP_Shift).
 * <br>
 * Help: {@literal Defines the intervals where the control points are measured for each shift.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CheckPointShift extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_CCP_Shift";
    public static final String ENTITY_NAME = "ManufacturingCheckPointShift";

    /**
     * Property id stored in column MA_Ccp_Shift_ID in table MA_CCP_Shift 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_CCP_Shift 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_CCP_Shift 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_CCP_Shift 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_CCP_Shift 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_CCP_Shift 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_CCP_Shift 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_CCP_Shift 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property qualityControlPointSet stored in column MA_CCP_Group_ID in table MA_CCP_Shift<br>
     * Help: {@literal Identifies a group of critical control points.}
     * 
     */
    public static final String PROPERTY_QUALITYCONTROLPOINTSET = "qualityControlPointSet";

    /**
     * Property startingTime stored in column Starttime in table MA_CCP_Shift<br>
     * Help: {@literal Start time in hours.}
     * 
     */
    public static final String PROPERTY_STARTINGTIME = "startingTime";

    /**
     * Property endingTime stored in column Endtime in table MA_CCP_Shift<br>
     * Help: {@literal End time in hours.}
     * 
     */
    public static final String PROPERTY_ENDINGTIME = "endingTime";

    /**
     * Property shift stored in column Shift in table MA_CCP_Shift 
     * 
     */
    public static final String PROPERTY_SHIFT = "shift";


    public CheckPointShift() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CheckPointShift#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CheckPointShift#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CheckPointShift#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CheckPointShift#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CheckPointShift#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CheckPointShift#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CheckPointShift#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CheckPointShift#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CheckPointShift#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CheckPointShift#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CheckPointShift#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CheckPointShift#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CheckPointShift#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CheckPointShift#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CheckPointShift#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CheckPointShift#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CheckPointShift#PROPERTY_QUALITYCONTROLPOINTSET
     * 
     */
    public CheckPointSet getQualityControlPointSet() {
        return (CheckPointSet) get(PROPERTY_QUALITYCONTROLPOINTSET);
    }
    /**
     * @see CheckPointShift#PROPERTY_QUALITYCONTROLPOINTSET
     * 
     */
    public void setQualityControlPointSet(CheckPointSet qualityControlPointSet) {
        set(PROPERTY_QUALITYCONTROLPOINTSET, qualityControlPointSet);
    }

    /**
     * @see CheckPointShift#PROPERTY_STARTINGTIME
     * 
     */
    public Timestamp getStartingTime() {
        return (Timestamp) get(PROPERTY_STARTINGTIME);
    }
    /**
     * @see CheckPointShift#PROPERTY_STARTINGTIME
     * 
     */
    public void setStartingTime(Timestamp startingTime) {
        set(PROPERTY_STARTINGTIME, startingTime);
    }

    /**
     * @see CheckPointShift#PROPERTY_ENDINGTIME
     * 
     */
    public Timestamp getEndingTime() {
        return (Timestamp) get(PROPERTY_ENDINGTIME);
    }
    /**
     * @see CheckPointShift#PROPERTY_ENDINGTIME
     * 
     */
    public void setEndingTime(Timestamp endingTime) {
        set(PROPERTY_ENDINGTIME, endingTime);
    }

    /**
     * @see CheckPointShift#PROPERTY_SHIFT
     * 
     */
    public String getShift() {
        return (String) get(PROPERTY_SHIFT);
    }
    /**
     * @see CheckPointShift#PROPERTY_SHIFT
     * 
     */
    public void setShift(String shift) {
        set(PROPERTY_SHIFT, shift);
    }

}
