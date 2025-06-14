
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
package org.openbravo.model.manufacturing.transaction;

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
import org.openbravo.model.materialmgmt.transaction.ProductionPlan;
/**
 * Entity class for entity ManufacturingProductionRunMachine (stored in table MA_PL_Machine).
 * <br>
 * Help: {@literal In this table are stored the machine costs involved on each production run.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductionRunMachine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_PL_Machine";
    public static final String ENTITY_NAME = "ManufacturingProductionRunMachine";

    /**
     * Property id stored in column MA_Pl_Machine_ID in table MA_PL_Machine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property creationDate stored in column Created in table MA_PL_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_PL_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_PL_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_PL_Machine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property client stored in column AD_Client_ID in table MA_PL_Machine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_PL_Machine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property productionPlan stored in column M_ProductionPlan_ID in table MA_PL_Machine<br>
     * Help: {@literal The Production Plan identifies the items and steps in generating a product.}
     * 
     */
    public static final String PROPERTY_PRODUCTIONPLAN = "productionPlan";

    /**
     * Property machine stored in column MA_Machine_ID in table MA_PL_Machine<br>
     * Help: {@literal Indicates a machine of the enterprise.}
     * 
     */
    public static final String PROPERTY_MACHINE = "machine";

    /**
     * Property usageCoefficient stored in column Use in table MA_PL_Machine<br>
     * Help: {@literal Indicates the use coefficient.}
     * 
     */
    public static final String PROPERTY_USAGECOEFFICIENT = "usageCoefficient";

    /**
     * Property active stored in column IsActive in table MA_PL_Machine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property estimatedCost stored in column Calccost in table MA_PL_Machine<br>
     * Help: {@literal Is the calculated cost amount.}
     * 
     */
    public static final String PROPERTY_ESTIMATEDCOST = "estimatedCost";


    public ProductionRunMachine() {
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
     * @see ProductionRunMachine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_PRODUCTIONPLAN
     * 
     */
    public ProductionPlan getProductionPlan() {
        return (ProductionPlan) get(PROPERTY_PRODUCTIONPLAN);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_PRODUCTIONPLAN
     * 
     */
    public void setProductionPlan(ProductionPlan productionPlan) {
        set(PROPERTY_PRODUCTIONPLAN, productionPlan);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_MACHINE
     * 
     */
    public Machine getMachine() {
        return (Machine) get(PROPERTY_MACHINE);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_MACHINE
     * 
     */
    public void setMachine(Machine machine) {
        set(PROPERTY_MACHINE, machine);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_USAGECOEFFICIENT
     * 
     */
    public BigDecimal getUsageCoefficient() {
        return (BigDecimal) get(PROPERTY_USAGECOEFFICIENT);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_USAGECOEFFICIENT
     * 
     */
    public void setUsageCoefficient(BigDecimal usageCoefficient) {
        set(PROPERTY_USAGECOEFFICIENT, usageCoefficient);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductionRunMachine#PROPERTY_ESTIMATEDCOST
     * 
     */
    public BigDecimal getEstimatedCost() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDCOST);
    }
    /**
     * @see ProductionRunMachine#PROPERTY_ESTIMATEDCOST
     * 
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        set(PROPERTY_ESTIMATEDCOST, estimatedCost);
    }

}
