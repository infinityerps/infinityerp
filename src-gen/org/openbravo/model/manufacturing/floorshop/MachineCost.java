
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
package org.openbravo.model.manufacturing.floorshop;

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
 * Entity class for entity ManufacturingMachineCost (stored in table MA_Machine_Cost).
 * <br>
 * Help: {@literal Machine costing information during time periods.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MachineCost extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Machine_Cost";
    public static final String ENTITY_NAME = "ManufacturingMachineCost";

    /**
     * Property id stored in column MA_Machine_Cost_ID in table MA_Machine_Cost 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property creationDate stored in column Created in table MA_Machine_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Machine_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Machine_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Machine_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property client stored in column AD_Client_ID in table MA_Machine_Cost 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Machine_Cost 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property machine stored in column MA_Machine_ID in table MA_Machine_Cost<br>
     * Help: {@literal Indicates a machine of the enterprise.}
     * 
     */
    public static final String PROPERTY_MACHINE = "machine";

    /**
     * Property cost stored in column Cost in table MA_Machine_Cost<br>
     * Help: {@literal Cost amount.}
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property active stored in column IsActive in table MA_Machine_Cost 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property validFromDate stored in column ValidFrom in table MA_Machine_Cost 
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property costUOM stored in column Costuom in table MA_Machine_Cost<br>
     * Help: {@literal Unit of Measure for cost}
     * 
     */
    public static final String PROPERTY_COSTUOM = "costUOM";

    /**
     * Property amortization stored in column Amortization in table MA_Machine_Cost<br>
     * Help: {@literal Amortization amount in years.}
     * 
     */
    public static final String PROPERTY_AMORTIZATION = "amortization";

    /**
     * Property consume stored in column Consume in table MA_Machine_Cost
     * 
     */
    public static final String PROPERTY_CONSUME = "consume";

    /**
     * Property uOMAnnualCost stored in column Costuomyear in table MA_Machine_Cost
     * 
     */
    public static final String PROPERTY_UOMANNUALCOST = "uOMAnnualCost";

    /**
     * Property workHoursDay stored in column Dayhours in table MA_Machine_Cost<br>
     * Help: {@literal Working hours per day}
     * 
     */
    public static final String PROPERTY_WORKHOURSDAY = "workHoursDay";

    /**
     * Property workDaysYear stored in column Daysyear in table MA_Machine_Cost<br>
     * Help: {@literal Working days per year.}
     * 
     */
    public static final String PROPERTY_WORKDAYSYEAR = "workDaysYear";

    /**
     * Property idleTimeYear stored in column Improductivehoursyear in table MA_Machine_Cost<br>
     * Help: {@literal Total no productive days per year.}
     * 
     */
    public static final String PROPERTY_IDLETIMEYEAR = "idleTimeYear";

    /**
     * Property purchaseAmount stored in column Purchaseamt in table MA_Machine_Cost<br>
     * Help: {@literal Purchase amount.}
     * 
     */
    public static final String PROPERTY_PURCHASEAMOUNT = "purchaseAmount";

    /**
     * Property toolsetAmount stored in column Toolsetamt in table MA_Machine_Cost<br>
     * Help: {@literal Total amount of the toolsets.}
     * 
     */
    public static final String PROPERTY_TOOLSETAMOUNT = "toolsetAmount";

    /**
     * Property valueYear stored in column Yearvalue in table MA_Machine_Cost
     * 
     */
    public static final String PROPERTY_VALUEYEAR = "valueYear";


    public MachineCost() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MachineCost#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MachineCost#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MachineCost#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MachineCost#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MachineCost#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MachineCost#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MachineCost#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MachineCost#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MachineCost#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MachineCost#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MachineCost#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MachineCost#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MachineCost#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MachineCost#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MachineCost#PROPERTY_MACHINE
     * 
     */
    public Machine getMachine() {
        return (Machine) get(PROPERTY_MACHINE);
    }
    /**
     * @see MachineCost#PROPERTY_MACHINE
     * 
     */
    public void setMachine(Machine machine) {
        set(PROPERTY_MACHINE, machine);
    }

    /**
     * @see MachineCost#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see MachineCost#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see MachineCost#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MachineCost#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MachineCost#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see MachineCost#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see MachineCost#PROPERTY_COSTUOM
     * 
     */
    public String getCostUOM() {
        return (String) get(PROPERTY_COSTUOM);
    }
    /**
     * @see MachineCost#PROPERTY_COSTUOM
     * 
     */
    public void setCostUOM(String costUOM) {
        set(PROPERTY_COSTUOM, costUOM);
    }

    /**
     * @see MachineCost#PROPERTY_AMORTIZATION
     * 
     */
    public Long getAmortization() {
        return (Long) get(PROPERTY_AMORTIZATION);
    }
    /**
     * @see MachineCost#PROPERTY_AMORTIZATION
     * 
     */
    public void setAmortization(Long amortization) {
        set(PROPERTY_AMORTIZATION, amortization);
    }

    /**
     * @see MachineCost#PROPERTY_CONSUME
     * 
     */
    public BigDecimal getConsume() {
        return (BigDecimal) get(PROPERTY_CONSUME);
    }
    /**
     * @see MachineCost#PROPERTY_CONSUME
     * 
     */
    public void setConsume(BigDecimal consume) {
        set(PROPERTY_CONSUME, consume);
    }

    /**
     * @see MachineCost#PROPERTY_UOMANNUALCOST
     * 
     */
    public BigDecimal getUOMAnnualCost() {
        return (BigDecimal) get(PROPERTY_UOMANNUALCOST);
    }
    /**
     * @see MachineCost#PROPERTY_UOMANNUALCOST
     * 
     */
    public void setUOMAnnualCost(BigDecimal uOMAnnualCost) {
        set(PROPERTY_UOMANNUALCOST, uOMAnnualCost);
    }

    /**
     * @see MachineCost#PROPERTY_WORKHOURSDAY
     * 
     */
    public BigDecimal getWorkHoursDay() {
        return (BigDecimal) get(PROPERTY_WORKHOURSDAY);
    }
    /**
     * @see MachineCost#PROPERTY_WORKHOURSDAY
     * 
     */
    public void setWorkHoursDay(BigDecimal workHoursDay) {
        set(PROPERTY_WORKHOURSDAY, workHoursDay);
    }

    /**
     * @see MachineCost#PROPERTY_WORKDAYSYEAR
     * 
     */
    public Long getWorkDaysYear() {
        return (Long) get(PROPERTY_WORKDAYSYEAR);
    }
    /**
     * @see MachineCost#PROPERTY_WORKDAYSYEAR
     * 
     */
    public void setWorkDaysYear(Long workDaysYear) {
        set(PROPERTY_WORKDAYSYEAR, workDaysYear);
    }

    /**
     * @see MachineCost#PROPERTY_IDLETIMEYEAR
     * 
     */
    public BigDecimal getIdleTimeYear() {
        return (BigDecimal) get(PROPERTY_IDLETIMEYEAR);
    }
    /**
     * @see MachineCost#PROPERTY_IDLETIMEYEAR
     * 
     */
    public void setIdleTimeYear(BigDecimal idleTimeYear) {
        set(PROPERTY_IDLETIMEYEAR, idleTimeYear);
    }

    /**
     * @see MachineCost#PROPERTY_PURCHASEAMOUNT
     * 
     */
    public BigDecimal getPurchaseAmount() {
        return (BigDecimal) get(PROPERTY_PURCHASEAMOUNT);
    }
    /**
     * @see MachineCost#PROPERTY_PURCHASEAMOUNT
     * 
     */
    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        set(PROPERTY_PURCHASEAMOUNT, purchaseAmount);
    }

    /**
     * @see MachineCost#PROPERTY_TOOLSETAMOUNT
     * 
     */
    public BigDecimal getToolsetAmount() {
        return (BigDecimal) get(PROPERTY_TOOLSETAMOUNT);
    }
    /**
     * @see MachineCost#PROPERTY_TOOLSETAMOUNT
     * 
     */
    public void setToolsetAmount(BigDecimal toolsetAmount) {
        set(PROPERTY_TOOLSETAMOUNT, toolsetAmount);
    }

    /**
     * @see MachineCost#PROPERTY_VALUEYEAR
     * 
     */
    public BigDecimal getValueYear() {
        return (BigDecimal) get(PROPERTY_VALUEYEAR);
    }
    /**
     * @see MachineCost#PROPERTY_VALUEYEAR
     * 
     */
    public void setValueYear(BigDecimal valueYear) {
        set(PROPERTY_VALUEYEAR, valueYear);
    }

}
