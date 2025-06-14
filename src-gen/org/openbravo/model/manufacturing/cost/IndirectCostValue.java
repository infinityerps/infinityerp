
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
/**
 * Entity class for entity ManufacturingIndirectCostValue (stored in table MA_Indirect_Cost_Value).
 * <br>
 * Help: {@literal Cost values of the indirect cost during a time period}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class IndirectCostValue extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Indirect_Cost_Value";
    public static final String ENTITY_NAME = "ManufacturingIndirectCostValue";

    /**
     * Property id stored in column MA_Indirect_Cost_Value_ID in table MA_Indirect_Cost_Value 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Indirect_Cost_Value 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Indirect_Cost_Value 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Indirect_Cost_Value 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Indirect_Cost_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Indirect_Cost_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Indirect_Cost_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Indirect_Cost_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property indirectCost stored in column MA_Indirect_Cost_ID in table MA_Indirect_Cost_Value<br>
     * Help: {@literal Indicates an indirect cost.}
     * 
     */
    public static final String PROPERTY_INDIRECTCOST = "indirectCost";

    /**
     * Property startingDate stored in column DateFrom in table MA_Indirect_Cost_Value 
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column DateTo in table MA_Indirect_Cost_Value 
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property total stored in column Total in table MA_Indirect_Cost_Value<br>
     * Help: {@literal Total amount}
     * 
     */
    public static final String PROPERTY_TOTAL = "total";

    /**
     * Property cost stored in column Cost in table MA_Indirect_Cost_Value 
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property calculate stored in column Calculate in table MA_Indirect_Cost_Value<br>
     * Help: {@literal Process to calculate the cost when the total amount is given.}
     * 
     */
    public static final String PROPERTY_CALCULATE = "calculate";

    /**
     * Property costUOM stored in column Cost_Uom in table MA_Indirect_Cost_Value<br>
     * Help: {@literal Unit of Measure for cost}
     * 
     */
    public static final String PROPERTY_COSTUOM = "costUOM";

    /**
     * Property calculated stored in column Calculated in table MA_Indirect_Cost_Value<br>
     * Help: {@literal Indicates that the record has been calculated.}
     * 
     */
    public static final String PROPERTY_CALCULATED = "calculated";


    public IndirectCostValue() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_CALCULATE, false);
        setDefaultValue(PROPERTY_CALCULATED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see IndirectCostValue#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see IndirectCostValue#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see IndirectCostValue#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see IndirectCostValue#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see IndirectCostValue#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see IndirectCostValue#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see IndirectCostValue#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see IndirectCostValue#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see IndirectCostValue#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see IndirectCostValue#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see IndirectCostValue#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see IndirectCostValue#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see IndirectCostValue#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see IndirectCostValue#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see IndirectCostValue#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see IndirectCostValue#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see IndirectCostValue#PROPERTY_INDIRECTCOST
     * 
     */
    public IndirectCost getIndirectCost() {
        return (IndirectCost) get(PROPERTY_INDIRECTCOST);
    }
    /**
     * @see IndirectCostValue#PROPERTY_INDIRECTCOST
     * 
     */
    public void setIndirectCost(IndirectCost indirectCost) {
        set(PROPERTY_INDIRECTCOST, indirectCost);
    }

    /**
     * @see IndirectCostValue#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see IndirectCostValue#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see IndirectCostValue#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see IndirectCostValue#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see IndirectCostValue#PROPERTY_TOTAL
     * 
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(PROPERTY_TOTAL);
    }
    /**
     * @see IndirectCostValue#PROPERTY_TOTAL
     * 
     */
    public void setTotal(BigDecimal total) {
        set(PROPERTY_TOTAL, total);
    }

    /**
     * @see IndirectCostValue#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see IndirectCostValue#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see IndirectCostValue#PROPERTY_CALCULATE
     * 
     */
    public Boolean isCalculate() {
        return (Boolean) get(PROPERTY_CALCULATE);
    }
    /**
     * @see IndirectCostValue#PROPERTY_CALCULATE
     * 
     */
    public void setCalculate(Boolean calculate) {
        set(PROPERTY_CALCULATE, calculate);
    }

    /**
     * @see IndirectCostValue#PROPERTY_COSTUOM
     * 
     */
    public String getCostUOM() {
        return (String) get(PROPERTY_COSTUOM);
    }
    /**
     * @see IndirectCostValue#PROPERTY_COSTUOM
     * 
     */
    public void setCostUOM(String costUOM) {
        set(PROPERTY_COSTUOM, costUOM);
    }

    /**
     * @see IndirectCostValue#PROPERTY_CALCULATED
     * 
     */
    public Boolean isCalculated() {
        return (Boolean) get(PROPERTY_CALCULATED);
    }
    /**
     * @see IndirectCostValue#PROPERTY_CALCULATED
     * 
     */
    public void setCalculated(Boolean calculated) {
        set(PROPERTY_CALCULATED, calculated);
    }

}
