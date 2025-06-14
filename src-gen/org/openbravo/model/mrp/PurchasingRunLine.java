
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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.manufacturing.transaction.WorkRequirement;
import org.openbravo.model.procurement.RequisitionLine;
/**
 * Entity class for entity MRPPurchasingRunLine (stored in table MRP_Run_PurchaseLine).
 * <br>
 * Help: {@literal Lines of the purchase planning processes.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PurchasingRunLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MRP_Run_PurchaseLine";
    public static final String ENTITY_NAME = "MRPPurchasingRunLine";

    /**
     * Property id stored in column MRP_Run_Purchaseline_ID in table MRP_Run_PurchaseLine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MRP_Run_PurchaseLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MRP_Run_PurchaseLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MRP_Run_PurchaseLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MRP_Run_PurchaseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MRP_Run_PurchaseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MRP_Run_PurchaseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MRP_Run_PurchaseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property purchasingPlan stored in column MRP_Run_Purchase_ID in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Identifies a header of the purchase planning processes.}
     * 
     */
    public static final String PROPERTY_PURCHASINGPLAN = "purchasingPlan";

    /**
     * Property product stored in column M_Product_ID in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property quantity stored in column Qty in table MRP_Run_PurchaseLine<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property requiredQuantity stored in column Neededqty in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Quantity needed}
     * 
     */
    public static final String PROPERTY_REQUIREDQUANTITY = "requiredQuantity";

    /**
     * Property plannedDate stored in column Planneddate in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Planned date of the transaction.}
     * 
     */
    public static final String PROPERTY_PLANNEDDATE = "plannedDate";

    /**
     * Property transactionType stored in column Inouttrxtype in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Transaction types available for the MRP.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONTYPE = "transactionType";

    /**
     * Property fixed stored in column Isfixed in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Is fixed}
     * 
     */
    public static final String PROPERTY_FIXED = "fixed";

    /**
     * Property salesOrderLine stored in column C_OrderLine_ID in table MRP_Run_PurchaseLine<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property workRequirement stored in column MA_Workrequirement_ID in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Indicates a work requirement.}
     * 
     */
    public static final String PROPERTY_WORKREQUIREMENT = "workRequirement";

    /**
     * Property salesForecastLine stored in column MRP_Salesforecastline_ID in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Identifies an expected sale line.}
     * 
     */
    public static final String PROPERTY_SALESFORECASTLINE = "salesForecastLine";

    /**
     * Property requisitionLine stored in column M_Requisitionline_ID in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Identifies each product demand of a requisition.}
     * 
     */
    public static final String PROPERTY_REQUISITIONLINE = "requisitionLine";

    /**
     * Property completed stored in column Iscompleted in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Line completed}
     * 
     */
    public static final String PROPERTY_COMPLETED = "completed";

    /**
     * Property plannedOrderDate stored in column Plannedorderdate in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Planned date to order the transaction.}
     * 
     */
    public static final String PROPERTY_PLANNEDORDERDATE = "plannedOrderDate";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table MRP_Run_PurchaseLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property totalMovementQuantity stored in column Cumqty in table MRP_Run_PurchaseLine<br>
     * Help: {@literal Cumulate quantity.}
     * 
     */
    public static final String PROPERTY_TOTALMOVEMENTQUANTITY = "totalMovementQuantity";


    public PurchasingRunLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_FIXED, false);
        setDefaultValue(PROPERTY_COMPLETED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PurchasingRunLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_PURCHASINGPLAN
     * 
     */
    public PurchasingRun getPurchasingPlan() {
        return (PurchasingRun) get(PROPERTY_PURCHASINGPLAN);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_PURCHASINGPLAN
     * 
     */
    public void setPurchasingPlan(PurchasingRun purchasingPlan) {
        set(PROPERTY_PURCHASINGPLAN, purchasingPlan);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_REQUIREDQUANTITY
     * 
     */
    public BigDecimal getRequiredQuantity() {
        return (BigDecimal) get(PROPERTY_REQUIREDQUANTITY);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_REQUIREDQUANTITY
     * 
     */
    public void setRequiredQuantity(BigDecimal requiredQuantity) {
        set(PROPERTY_REQUIREDQUANTITY, requiredQuantity);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_PLANNEDDATE
     * 
     */
    public Date getPlannedDate() {
        return (Date) get(PROPERTY_PLANNEDDATE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_PLANNEDDATE
     * 
     */
    public void setPlannedDate(Date plannedDate) {
        set(PROPERTY_PLANNEDDATE, plannedDate);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public String getTransactionType() {
        return (String) get(PROPERTY_TRANSACTIONTYPE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public void setTransactionType(String transactionType) {
        set(PROPERTY_TRANSACTIONTYPE, transactionType);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_FIXED
     * 
     */
    public Boolean isFixed() {
        return (Boolean) get(PROPERTY_FIXED);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_FIXED
     * 
     */
    public void setFixed(Boolean fixed) {
        set(PROPERTY_FIXED, fixed);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_WORKREQUIREMENT
     * 
     */
    public WorkRequirement getWorkRequirement() {
        return (WorkRequirement) get(PROPERTY_WORKREQUIREMENT);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_WORKREQUIREMENT
     * 
     */
    public void setWorkRequirement(WorkRequirement workRequirement) {
        set(PROPERTY_WORKREQUIREMENT, workRequirement);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_SALESFORECASTLINE
     * 
     */
    public SalesForecastLine getSalesForecastLine() {
        return (SalesForecastLine) get(PROPERTY_SALESFORECASTLINE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_SALESFORECASTLINE
     * 
     */
    public void setSalesForecastLine(SalesForecastLine salesForecastLine) {
        set(PROPERTY_SALESFORECASTLINE, salesForecastLine);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_REQUISITIONLINE
     * 
     */
    public RequisitionLine getRequisitionLine() {
        return (RequisitionLine) get(PROPERTY_REQUISITIONLINE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_REQUISITIONLINE
     * 
     */
    public void setRequisitionLine(RequisitionLine requisitionLine) {
        set(PROPERTY_REQUISITIONLINE, requisitionLine);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_COMPLETED
     * 
     */
    public Boolean isCompleted() {
        return (Boolean) get(PROPERTY_COMPLETED);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_COMPLETED
     * 
     */
    public void setCompleted(Boolean completed) {
        set(PROPERTY_COMPLETED, completed);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_PLANNEDORDERDATE
     * 
     */
    public Date getPlannedOrderDate() {
        return (Date) get(PROPERTY_PLANNEDORDERDATE);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_PLANNEDORDERDATE
     * 
     */
    public void setPlannedOrderDate(Date plannedOrderDate) {
        set(PROPERTY_PLANNEDORDERDATE, plannedOrderDate);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see PurchasingRunLine#PROPERTY_TOTALMOVEMENTQUANTITY
     * 
     */
    public BigDecimal getTotalMovementQuantity() {
        return (BigDecimal) get(PROPERTY_TOTALMOVEMENTQUANTITY);
    }
    /**
     * @see PurchasingRunLine#PROPERTY_TOTALMOVEMENTQUANTITY
     * 
     */
    public void setTotalMovementQuantity(BigDecimal totalMovementQuantity) {
        set(PROPERTY_TOTALMOVEMENTQUANTITY, totalMovementQuantity);
    }

}
