
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
import org.openbravo.model.manufacturing.floorshop.Machine;
import org.openbravo.model.manufacturing.floorshop.MachineType;
/**
 * Entity class for entity ManufacturingMaintenance (stored in table MA_Maintenance).
 * <br>
 * Help: {@literal Stores maintenances that are done to the machines.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Maintenance extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Maintenance";
    public static final String ENTITY_NAME = "ManufacturingMaintenance";

    /**
     * Property id stored in column MA_Maintenance_ID in table MA_Maintenance<br>
     * Help: {@literal Identifies a maintenance of a machine or machine category.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Maintenance 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Maintenance 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Maintenance 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Maintenance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Maintenance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Maintenance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Maintenance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table MA_Maintenance 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property maintenanceTask stored in column MA_Maint_Operation_ID in table MA_Maintenance<br>
     * Help: {@literal Identifies a maintenance operation.}
     * 
     */
    public static final String PROPERTY_MAINTENANCETASK = "maintenanceTask";

    /**
     * Property maintenanceType stored in column Maintenance_Type in table MA_Maintenance<br>
     * Help: {@literal Sets the maintenance type, available options are corrective, corrective (urgent) and
     *       preventive.}
     * 
     */
    public static final String PROPERTY_MAINTENANCETYPE = "maintenanceType";

    /**
     * Property description stored in column Description in table MA_Maintenance<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property plannedTime stored in column Plannedtime in table MA_Maintenance<br>
     * Help: {@literal Estimated time in hours for the operation.}
     * 
     */
    public static final String PROPERTY_PLANNEDTIME = "plannedTime";

    /**
     * Property machineCategory stored in column MA_Machine_Type_ID in table MA_Maintenance<br>
     * Help: {@literal Identifies a machine category.}
     * 
     */
    public static final String PROPERTY_MACHINECATEGORY = "machineCategory";

    /**
     * Property machine stored in column MA_Machine_ID in table MA_Maintenance<br>
     * Help: {@literal Indicates a machine of the enterprise.}
     * 
     */
    public static final String PROPERTY_MACHINE = "machine";

    /**
     * Property insertInMachines stored in column Explode in table MA_Maintenance<br>
     * Help: {@literal Indicates that the maintenance defined for a machine group is exploded to all its machines
     *       when is scheduled.}
     * 
     */
    public static final String PROPERTY_INSERTINMACHINES = "insertInMachines";


    public Maintenance() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_INSERTINMACHINES, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Maintenance#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Maintenance#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Maintenance#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Maintenance#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Maintenance#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Maintenance#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Maintenance#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Maintenance#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Maintenance#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Maintenance#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Maintenance#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Maintenance#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Maintenance#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Maintenance#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Maintenance#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Maintenance#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Maintenance#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Maintenance#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Maintenance#PROPERTY_MAINTENANCETASK
     * 
     */
    public Task getMaintenanceTask() {
        return (Task) get(PROPERTY_MAINTENANCETASK);
    }
    /**
     * @see Maintenance#PROPERTY_MAINTENANCETASK
     * 
     */
    public void setMaintenanceTask(Task maintenanceTask) {
        set(PROPERTY_MAINTENANCETASK, maintenanceTask);
    }

    /**
     * @see Maintenance#PROPERTY_MAINTENANCETYPE
     * 
     */
    public String getMaintenanceType() {
        return (String) get(PROPERTY_MAINTENANCETYPE);
    }
    /**
     * @see Maintenance#PROPERTY_MAINTENANCETYPE
     * 
     */
    public void setMaintenanceType(String maintenanceType) {
        set(PROPERTY_MAINTENANCETYPE, maintenanceType);
    }

    /**
     * @see Maintenance#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Maintenance#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Maintenance#PROPERTY_PLANNEDTIME
     * 
     */
    public BigDecimal getPlannedTime() {
        return (BigDecimal) get(PROPERTY_PLANNEDTIME);
    }
    /**
     * @see Maintenance#PROPERTY_PLANNEDTIME
     * 
     */
    public void setPlannedTime(BigDecimal plannedTime) {
        set(PROPERTY_PLANNEDTIME, plannedTime);
    }

    /**
     * @see Maintenance#PROPERTY_MACHINECATEGORY
     * 
     */
    public MachineType getMachineCategory() {
        return (MachineType) get(PROPERTY_MACHINECATEGORY);
    }
    /**
     * @see Maintenance#PROPERTY_MACHINECATEGORY
     * 
     */
    public void setMachineCategory(MachineType machineCategory) {
        set(PROPERTY_MACHINECATEGORY, machineCategory);
    }

    /**
     * @see Maintenance#PROPERTY_MACHINE
     * 
     */
    public Machine getMachine() {
        return (Machine) get(PROPERTY_MACHINE);
    }
    /**
     * @see Maintenance#PROPERTY_MACHINE
     * 
     */
    public void setMachine(Machine machine) {
        set(PROPERTY_MACHINE, machine);
    }

    /**
     * @see Maintenance#PROPERTY_INSERTINMACHINES
     * 
     */
    public Boolean isInsertInMachines() {
        return (Boolean) get(PROPERTY_INSERTINMACHINES);
    }
    /**
     * @see Maintenance#PROPERTY_INSERTINMACHINES
     * 
     */
    public void setInsertInMachines(Boolean insertInMachines) {
        set(PROPERTY_INSERTINMACHINES, insertInMachines);
    }

}
