
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
 * Entity class for entity ManufacturingCheckPoint (stored in table MA_CCP).
 * <br>
 * Help: {@literal This tab contains each of the measures that will be controlled.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CheckPoint extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_CCP";
    public static final String ENTITY_NAME = "ManufacturingCheckPoint";

    /**
     * Property id stored in column MA_Ccp_ID in table MA_CCP<br>
     * Help: {@literal Identifies each measured critical control point.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_CCP 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_CCP 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_CCP 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_CCP 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_CCP 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_CCP 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_CCP 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table MA_CCP 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table MA_CCP<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property critical stored in column Critical in table MA_CCP<br>
     * Help: {@literal Indicates that the point is critical and/or mandatory}
     * 
     */
    public static final String PROPERTY_CRITICAL = "critical";

    /**
     * Property valueType stored in column Valuetype in table MA_CCP<br>
     * Help: {@literal Set the value type expected for the point. Possible options are: Yes/No, String or
     *       Number.}
     * 
     */
    public static final String PROPERTY_VALUETYPE = "valueType";

    /**
     * Property numberOfMeasurements stored in column Valuenumber in table MA_CCP<br>
     * Help: {@literal Set the number of times that the point is measured each gathering.}
     * 
     */
    public static final String PROPERTY_NUMBEROFMEASUREMENTS = "numberOfMeasurements";

    /**
     * Property qualityControlPointSet stored in column MA_CCP_Group_ID in table MA_CCP<br>
     * Help: {@literal Identifies a group of critical control points.}
     * 
     */
    public static final String PROPERTY_QUALITYCONTROLPOINTSET = "qualityControlPointSet";

    /**
     * Property sequenceNumber stored in column SeqNo in table MA_CCP<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";


    public CheckPoint() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CRITICAL, true);
        setDefaultValue(PROPERTY_NUMBEROFMEASUREMENTS, (long) 1);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CheckPoint#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CheckPoint#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CheckPoint#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CheckPoint#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CheckPoint#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CheckPoint#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CheckPoint#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CheckPoint#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CheckPoint#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CheckPoint#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CheckPoint#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CheckPoint#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CheckPoint#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CheckPoint#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CheckPoint#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CheckPoint#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CheckPoint#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see CheckPoint#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see CheckPoint#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see CheckPoint#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see CheckPoint#PROPERTY_CRITICAL
     * 
     */
    public Boolean isCritical() {
        return (Boolean) get(PROPERTY_CRITICAL);
    }
    /**
     * @see CheckPoint#PROPERTY_CRITICAL
     * 
     */
    public void setCritical(Boolean critical) {
        set(PROPERTY_CRITICAL, critical);
    }

    /**
     * @see CheckPoint#PROPERTY_VALUETYPE
     * 
     */
    public String getValueType() {
        return (String) get(PROPERTY_VALUETYPE);
    }
    /**
     * @see CheckPoint#PROPERTY_VALUETYPE
     * 
     */
    public void setValueType(String valueType) {
        set(PROPERTY_VALUETYPE, valueType);
    }

    /**
     * @see CheckPoint#PROPERTY_NUMBEROFMEASUREMENTS
     * 
     */
    public Long getNumberOfMeasurements() {
        return (Long) get(PROPERTY_NUMBEROFMEASUREMENTS);
    }
    /**
     * @see CheckPoint#PROPERTY_NUMBEROFMEASUREMENTS
     * 
     */
    public void setNumberOfMeasurements(Long numberOfMeasurements) {
        set(PROPERTY_NUMBEROFMEASUREMENTS, numberOfMeasurements);
    }

    /**
     * @see CheckPoint#PROPERTY_QUALITYCONTROLPOINTSET
     * 
     */
    public CheckPointSet getQualityControlPointSet() {
        return (CheckPointSet) get(PROPERTY_QUALITYCONTROLPOINTSET);
    }
    /**
     * @see CheckPoint#PROPERTY_QUALITYCONTROLPOINTSET
     * 
     */
    public void setQualityControlPointSet(CheckPointSet qualityControlPointSet) {
        set(PROPERTY_QUALITYCONTROLPOINTSET, qualityControlPointSet);
    }

    /**
     * @see CheckPoint#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see CheckPoint#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

}
