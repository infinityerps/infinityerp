
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
package org.openbravo.model.manufacturing.cost;

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
/**
 * Entity class for entity ManufacturingCostCenterMachine (stored in table MA_CostCenter_Machine).
 * <br>
 * Help: {@literal Machines associated to a cost center.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostCenterMachine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_CostCenter_Machine";
    public static final String ENTITY_NAME = "ManufacturingCostCenterMachine";

    /**
     * Property id stored in column MA_Costcenter_Machine_ID in table MA_CostCenter_Machine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property creationDate stored in column Created in table MA_CostCenter_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_CostCenter_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_CostCenter_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_CostCenter_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property client stored in column AD_Client_ID in table MA_CostCenter_Machine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_CostCenter_Machine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property costCenterVersion stored in column MA_Costcenter_Version_ID in table MA_CostCenter_Machine<br>
     * Help: {@literal Identifies a cost center version valid during a time period.}
     * 
     */
    public static final String PROPERTY_COSTCENTERVERSION = "costCenterVersion";

    /**
     * Property machine stored in column MA_Machine_ID in table MA_CostCenter_Machine<br>
     * Help: {@literal Indicates a machine of the enterprise.}
     * 
     */
    public static final String PROPERTY_MACHINE = "machine";

    /**
     * Property usageCoefficient stored in column Use in table MA_CostCenter_Machine<br>
     * Help: {@literal Indicates the use coefficient.}
     * 
     */
    public static final String PROPERTY_USAGECOEFFICIENT = "usageCoefficient";

    /**
     * Property active stored in column IsActive in table MA_CostCenter_Machine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";


    public CostCenterMachine() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_USAGECOEFFICIENT, new BigDecimal(1));
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostCenterMachine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostCenterMachine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostCenterMachine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostCenterMachine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostCenterMachine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostCenterMachine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostCenterMachine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostCenterMachine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostCenterMachine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostCenterMachine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostCenterMachine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostCenterMachine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostCenterMachine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostCenterMachine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostCenterMachine#PROPERTY_COSTCENTERVERSION
     * 
     */
    public CostcenterVersion getCostCenterVersion() {
        return (CostcenterVersion) get(PROPERTY_COSTCENTERVERSION);
    }
    /**
     * @see CostCenterMachine#PROPERTY_COSTCENTERVERSION
     * 
     */
    public void setCostCenterVersion(CostcenterVersion costCenterVersion) {
        set(PROPERTY_COSTCENTERVERSION, costCenterVersion);
    }

    /**
     * @see CostCenterMachine#PROPERTY_MACHINE
     * 
     */
    public Machine getMachine() {
        return (Machine) get(PROPERTY_MACHINE);
    }
    /**
     * @see CostCenterMachine#PROPERTY_MACHINE
     * 
     */
    public void setMachine(Machine machine) {
        set(PROPERTY_MACHINE, machine);
    }

    /**
     * @see CostCenterMachine#PROPERTY_USAGECOEFFICIENT
     * 
     */
    public BigDecimal getUsageCoefficient() {
        return (BigDecimal) get(PROPERTY_USAGECOEFFICIENT);
    }
    /**
     * @see CostCenterMachine#PROPERTY_USAGECOEFFICIENT
     * 
     */
    public void setUsageCoefficient(BigDecimal usageCoefficient) {
        set(PROPERTY_USAGECOEFFICIENT, usageCoefficient);
    }

    /**
     * @see CostCenterMachine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostCenterMachine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

}
