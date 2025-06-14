
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
import org.openbravo.model.common.hcm.SalaryCategory;
/**
 * Entity class for entity ManufacturingCostcenterEmployee (stored in table MA_Costcenter_Employee).
 * <br>
 * Help: {@literal Salary categories and employee number of each category of the cost center.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostcenterEmployee extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Costcenter_Employee";
    public static final String ENTITY_NAME = "ManufacturingCostcenterEmployee";

    /**
     * Property id stored in column MA_Costcenter_Employee_ID in table MA_Costcenter_Employee 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property creationDate stored in column Created in table MA_Costcenter_Employee 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Costcenter_Employee 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Costcenter_Employee 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Costcenter_Employee 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property client stored in column AD_Client_ID in table MA_Costcenter_Employee 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Costcenter_Employee 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property costCenterVersion stored in column MA_Costcenter_Version_ID in table MA_Costcenter_Employee<br>
     * Help: {@literal Identifies a cost center version valid during a time period.}
     * 
     */
    public static final String PROPERTY_COSTCENTERVERSION = "costCenterVersion";

    /**
     * Property salaryCategory stored in column C_Salary_Category_ID in table MA_Costcenter_Employee<br>
     * Help: {@literal Indicates a salary category}
     * 
     */
    public static final String PROPERTY_SALARYCATEGORY = "salaryCategory";

    /**
     * Property quantity stored in column Quantity in table MA_Costcenter_Employee<br>
     * Help: {@literal Indicates the quantity of product needed to process one time the sequence.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property costUOM stored in column Costuom in table MA_Costcenter_Employee<br>
     * Help: {@literal Unit of Measure for cost}
     * 
     */
    public static final String PROPERTY_COSTUOM = "costUOM";

    /**
     * Property active stored in column IsActive in table MA_Costcenter_Employee 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property split stored in column Split in table MA_Costcenter_Employee<br>
     * Help: {@literal Split}
     * 
     */
    public static final String PROPERTY_SPLIT = "split";


    public CostcenterEmployee() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SPLIT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostcenterEmployee#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_COSTCENTERVERSION
     * 
     */
    public CostcenterVersion getCostCenterVersion() {
        return (CostcenterVersion) get(PROPERTY_COSTCENTERVERSION);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_COSTCENTERVERSION
     * 
     */
    public void setCostCenterVersion(CostcenterVersion costCenterVersion) {
        set(PROPERTY_COSTCENTERVERSION, costCenterVersion);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_SALARYCATEGORY
     * 
     */
    public SalaryCategory getSalaryCategory() {
        return (SalaryCategory) get(PROPERTY_SALARYCATEGORY);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_SALARYCATEGORY
     * 
     */
    public void setSalaryCategory(SalaryCategory salaryCategory) {
        set(PROPERTY_SALARYCATEGORY, salaryCategory);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_COSTUOM
     * 
     */
    public String getCostUOM() {
        return (String) get(PROPERTY_COSTUOM);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_COSTUOM
     * 
     */
    public void setCostUOM(String costUOM) {
        set(PROPERTY_COSTUOM, costUOM);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CostcenterEmployee#PROPERTY_SPLIT
     * 
     */
    public Boolean isSplit() {
        return (Boolean) get(PROPERTY_SPLIT);
    }
    /**
     * @see CostcenterEmployee#PROPERTY_SPLIT
     * 
     */
    public void setSplit(Boolean split) {
        set(PROPERTY_SPLIT, split);
    }

}
