
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
package org.openbravo.model.mrp;

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
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.manufacturing.processplan.ProcessPlan;
import org.openbravo.model.manufacturing.transaction.WorkRequirement;
import org.openbravo.model.procurement.RequisitionLine;
/**
 * Entity class for entity MRPProductionRunLine (stored in table MRP_Run_ProductionLine).
 * <br>
 * Help: {@literal Lines of the production planning processes.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductionRunLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MRP_Run_ProductionLine";
    public static final String ENTITY_NAME = "MRPProductionRunLine";

    /**
     * Property id stored in column MRP_Run_Productionline_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal Identifies a line of the production planning processes.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MRP_Run_ProductionLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MRP_Run_ProductionLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MRP_Run_ProductionLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MRP_Run_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MRP_Run_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MRP_Run_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MRP_Run_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property manufacturingPlan stored in column MRP_Run_Production_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal Headers of the production planning processes.}
     * 
     */
    public static final String PROPERTY_MANUFACTURINGPLAN = "manufacturingPlan";

    /**
     * Property product stored in column M_Product_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property quantity stored in column Qty in table MRP_Run_ProductionLine<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property requiredQuantity stored in column Neededqty in table MRP_Run_ProductionLine<br>
     * Help: {@literal Quantity needed}
     * 
     */
    public static final String PROPERTY_REQUIREDQUANTITY = "requiredQuantity";

    /**
     * Property plannedDate stored in column Planneddate in table MRP_Run_ProductionLine<br>
     * Help: {@literal Planned date of the transaction.}
     * 
     */
    public static final String PROPERTY_PLANNEDDATE = "plannedDate";

    /**
     * Property reportSet stored in column Parent_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal The Parent indicates the value used to represent a summary level or report to level for a
     *       record}
     * 
     */
    public static final String PROPERTY_REPORTSET = "reportSet";

    /**
     * Property transactionType stored in column Inouttrxtype in table MRP_Run_ProductionLine<br>
     * Help: {@literal Transaction types available for the MRP.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONTYPE = "transactionType";

    /**
     * Property fixed stored in column Isfixed in table MRP_Run_ProductionLine<br>
     * Help: {@literal Is fixed}
     * 
     */
    public static final String PROPERTY_FIXED = "fixed";

    /**
     * Property salesOrderLine stored in column C_OrderLine_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property workRequirement stored in column MA_Workrequirement_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal Indicates a work requirement.}
     * 
     */
    public static final String PROPERTY_WORKREQUIREMENT = "workRequirement";

    /**
     * Property salesForecastLine stored in column MRP_Salesforecastline_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal Identifies an expected sale line.}
     * 
     */
    public static final String PROPERTY_SALESFORECASTLINE = "salesForecastLine";

    /**
     * Property requisitionLine stored in column M_Requisitionline_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal Identifies each product demand of a requisition.}
     * 
     */
    public static final String PROPERTY_REQUISITIONLINE = "requisitionLine";

    /**
     * Property processPlan stored in column MA_Processplan_ID in table MRP_Run_ProductionLine<br>
     * Help: {@literal Indicates a process plan.}
     * 
     */
    public static final String PROPERTY_PROCESSPLAN = "processPlan";

    /**
     * Property inserted stored in column Isexploded in table MRP_Run_ProductionLine<br>
     * Help: {@literal The line has been exploded.}
     * 
     */
    public static final String PROPERTY_INSERTED = "inserted";

    /**
     * Property plannedOrderDate stored in column Plannedorderdate in table MRP_Run_ProductionLine<br>
     * Help: {@literal Planned date to order the transaction.}
     * 
     */
    public static final String PROPERTY_PLANNEDORDERDATE = "plannedOrderDate";

    /**
     * Property planned stored in column Isplanned in table MRP_Run_ProductionLine<br>
     * Help: {@literal Is planned.}
     * 
     */
    public static final String PROPERTY_PLANNED = "planned";

    /**
     * Property totalMovementQuantity stored in column Cumqty in table MRP_Run_ProductionLine<br>
     * Help: {@literal Cumulate quantity.}
     * 
     */
    public static final String PROPERTY_TOTALMOVEMENTQUANTITY = "totalMovementQuantity";

    /**
     * Property recalculateStock stored in column Recalculatestock in table MRP_Run_ProductionLine<br>
     * Help: {@literal Process to recalculate the product quantities of the lines.}
     * 
     */
    public static final String PROPERTY_RECALCULATESTOCK = "recalculateStock";


    public ProductionRunLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_FIXED, false);
        setDefaultValue(PROPERTY_INSERTED, false);
        setDefaultValue(PROPERTY_PLANNED, false);
        setDefaultValue(PROPERTY_RECALCULATESTOCK, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductionRunLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductionRunLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductionRunLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductionRunLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductionRunLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductionRunLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductionRunLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductionRunLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductionRunLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductionRunLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductionRunLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductionRunLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductionRunLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductionRunLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductionRunLine#PROPERTY_MANUFACTURINGPLAN
     * 
     */
    public ProductionRun getManufacturingPlan() {
        return (ProductionRun) get(PROPERTY_MANUFACTURINGPLAN);
    }
    /**
     * @see ProductionRunLine#PROPERTY_MANUFACTURINGPLAN
     * 
     */
    public void setManufacturingPlan(ProductionRun manufacturingPlan) {
        set(PROPERTY_MANUFACTURINGPLAN, manufacturingPlan);
    }

    /**
     * @see ProductionRunLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductionRunLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductionRunLine#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see ProductionRunLine#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see ProductionRunLine#PROPERTY_REQUIREDQUANTITY
     * 
     */
    public BigDecimal getRequiredQuantity() {
        return (BigDecimal) get(PROPERTY_REQUIREDQUANTITY);
    }
    /**
     * @see ProductionRunLine#PROPERTY_REQUIREDQUANTITY
     * 
     */
    public void setRequiredQuantity(BigDecimal requiredQuantity) {
        set(PROPERTY_REQUIREDQUANTITY, requiredQuantity);
    }

    /**
     * @see ProductionRunLine#PROPERTY_PLANNEDDATE
     * 
     */
    public Date getPlannedDate() {
        return (Date) get(PROPERTY_PLANNEDDATE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_PLANNEDDATE
     * 
     */
    public void setPlannedDate(Date plannedDate) {
        set(PROPERTY_PLANNEDDATE, plannedDate);
    }

    /**
     * @see ProductionRunLine#PROPERTY_REPORTSET
     * 
     */
    public ProductionRunLine getReportSet() {
        return (ProductionRunLine) get(PROPERTY_REPORTSET);
    }
    /**
     * @see ProductionRunLine#PROPERTY_REPORTSET
     * 
     */
    public void setReportSet(ProductionRunLine reportSet) {
        set(PROPERTY_REPORTSET, reportSet);
    }

    /**
     * @see ProductionRunLine#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public String getTransactionType() {
        return (String) get(PROPERTY_TRANSACTIONTYPE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public void setTransactionType(String transactionType) {
        set(PROPERTY_TRANSACTIONTYPE, transactionType);
    }

    /**
     * @see ProductionRunLine#PROPERTY_FIXED
     * 
     */
    public Boolean isFixed() {
        return (Boolean) get(PROPERTY_FIXED);
    }
    /**
     * @see ProductionRunLine#PROPERTY_FIXED
     * 
     */
    public void setFixed(Boolean fixed) {
        set(PROPERTY_FIXED, fixed);
    }

    /**
     * @see ProductionRunLine#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see ProductionRunLine#PROPERTY_WORKREQUIREMENT
     * 
     */
    public WorkRequirement getWorkRequirement() {
        return (WorkRequirement) get(PROPERTY_WORKREQUIREMENT);
    }
    /**
     * @see ProductionRunLine#PROPERTY_WORKREQUIREMENT
     * 
     */
    public void setWorkRequirement(WorkRequirement workRequirement) {
        set(PROPERTY_WORKREQUIREMENT, workRequirement);
    }

    /**
     * @see ProductionRunLine#PROPERTY_SALESFORECASTLINE
     * 
     */
    public SalesForecastLine getSalesForecastLine() {
        return (SalesForecastLine) get(PROPERTY_SALESFORECASTLINE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_SALESFORECASTLINE
     * 
     */
    public void setSalesForecastLine(SalesForecastLine salesForecastLine) {
        set(PROPERTY_SALESFORECASTLINE, salesForecastLine);
    }

    /**
     * @see ProductionRunLine#PROPERTY_REQUISITIONLINE
     * 
     */
    public RequisitionLine getRequisitionLine() {
        return (RequisitionLine) get(PROPERTY_REQUISITIONLINE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_REQUISITIONLINE
     * 
     */
    public void setRequisitionLine(RequisitionLine requisitionLine) {
        set(PROPERTY_REQUISITIONLINE, requisitionLine);
    }

    /**
     * @see ProductionRunLine#PROPERTY_PROCESSPLAN
     * 
     */
    public ProcessPlan getProcessPlan() {
        return (ProcessPlan) get(PROPERTY_PROCESSPLAN);
    }
    /**
     * @see ProductionRunLine#PROPERTY_PROCESSPLAN
     * 
     */
    public void setProcessPlan(ProcessPlan processPlan) {
        set(PROPERTY_PROCESSPLAN, processPlan);
    }

    /**
     * @see ProductionRunLine#PROPERTY_INSERTED
     * 
     */
    public Boolean isInserted() {
        return (Boolean) get(PROPERTY_INSERTED);
    }
    /**
     * @see ProductionRunLine#PROPERTY_INSERTED
     * 
     */
    public void setInserted(Boolean inserted) {
        set(PROPERTY_INSERTED, inserted);
    }

    /**
     * @see ProductionRunLine#PROPERTY_PLANNEDORDERDATE
     * 
     */
    public Date getPlannedOrderDate() {
        return (Date) get(PROPERTY_PLANNEDORDERDATE);
    }
    /**
     * @see ProductionRunLine#PROPERTY_PLANNEDORDERDATE
     * 
     */
    public void setPlannedOrderDate(Date plannedOrderDate) {
        set(PROPERTY_PLANNEDORDERDATE, plannedOrderDate);
    }

    /**
     * @see ProductionRunLine#PROPERTY_PLANNED
     * 
     */
    public Boolean isPlanned() {
        return (Boolean) get(PROPERTY_PLANNED);
    }
    /**
     * @see ProductionRunLine#PROPERTY_PLANNED
     * 
     */
    public void setPlanned(Boolean planned) {
        set(PROPERTY_PLANNED, planned);
    }

    /**
     * @see ProductionRunLine#PROPERTY_TOTALMOVEMENTQUANTITY
     * 
     */
    public BigDecimal getTotalMovementQuantity() {
        return (BigDecimal) get(PROPERTY_TOTALMOVEMENTQUANTITY);
    }
    /**
     * @see ProductionRunLine#PROPERTY_TOTALMOVEMENTQUANTITY
     * 
     */
    public void setTotalMovementQuantity(BigDecimal totalMovementQuantity) {
        set(PROPERTY_TOTALMOVEMENTQUANTITY, totalMovementQuantity);
    }

    /**
     * @see ProductionRunLine#PROPERTY_RECALCULATESTOCK
     * 
     */
    public Boolean isRecalculateStock() {
        return (Boolean) get(PROPERTY_RECALCULATESTOCK);
    }
    /**
     * @see ProductionRunLine#PROPERTY_RECALCULATESTOCK
     * 
     */
    public void setRecalculateStock(Boolean recalculateStock) {
        set(PROPERTY_RECALCULATESTOCK, recalculateStock);
    }

}
