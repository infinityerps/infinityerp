
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
package org.openbravo.model.timeandexpense;

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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.project.ProjectPhase;
import org.openbravo.model.project.ProjectTask;
/**
 * Entity class for entity TimeAndExpenseSheetLine (stored in table S_TimeExpenseLine).
 * <br>
 * Help: {@literal Contains all the expense items and billable or non-billable hours}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class SheetLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "S_TimeExpenseLine";
    public static final String ENTITY_NAME = "TimeAndExpenseSheetLine";

    /**
     * Property id stored in column S_TimeExpenseLine_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table S_TimeExpenseLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table S_TimeExpenseLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table S_TimeExpenseLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table S_TimeExpenseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table S_TimeExpenseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table S_TimeExpenseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table S_TimeExpenseLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property expenseSheet stored in column S_TimeExpense_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The ID identifies a unique record for the expense report}
     * 
     */
    public static final String PROPERTY_EXPENSESHEET = "expenseSheet";

    /**
     * Property lineNo stored in column Line in table S_TimeExpenseLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property timeSheet stored in column IsTimeReport in table S_TimeExpenseLine<br>
     * Help: {@literal The line contains only time information}
     * 
     */
    public static final String PROPERTY_TIMESHEET = "timeSheet";

    /**
     * Property expenseDate stored in column DateExpense in table S_TimeExpenseLine<br>
     * Help: {@literal Date of expense}
     * 
     */
    public static final String PROPERTY_EXPENSEDATE = "expenseDate";

    /**
     * Property product stored in column M_Product_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property quantity stored in column Qty in table S_TimeExpenseLine<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property expenseAmount stored in column ExpenseAmt in table S_TimeExpenseLine<br>
     * Help: {@literal Expense amount in currency}
     * 
     */
    public static final String PROPERTY_EXPENSEAMOUNT = "expenseAmount";

    /**
     * Property currency stored in column C_Currency_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property convertedAmount stored in column ConvertedAmt in table S_TimeExpenseLine<br>
     * Help: {@literal The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate
     *       for this target currency.}
     * 
     */
    public static final String PROPERTY_CONVERTEDAMOUNT = "convertedAmount";

    /**
     * Property resourceAssignment stored in column S_ResourceAssignment_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_RESOURCEASSIGNMENT = "resourceAssignment";

    /**
     * Property description stored in column Description in table S_TimeExpenseLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property comments stored in column Note in table S_TimeExpenseLine<br>
     * Help: {@literal The Note field allows for optional entry of user defined information regarding this
     *       record}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property reinvoice stored in column IsInvoiced in table S_TimeExpenseLine<br>
     * Help: {@literal Indicator if invoiced}
     * 
     */
    public static final String PROPERTY_REINVOICE = "reinvoice";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table S_TimeExpenseLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property project stored in column C_Project_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property activity stored in column C_Activity_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property invoiceLine stored in column C_InvoiceLine_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The Invoice Line uniquely identifies a single line of an Invoice.}
     * 
     */
    public static final String PROPERTY_INVOICELINE = "invoiceLine";

    /**
     * Property invoicePrice stored in column InvoicePrice in table S_TimeExpenseLine<br>
     * Help: {@literal Unit Price in the currency of the business partner!  If it is 0, the standard price of the
     *       sales price list of the business partner (customer) is used.}
     * 
     */
    public static final String PROPERTY_INVOICEPRICE = "invoicePrice";

    /**
     * Property uOM stored in column C_UOM_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property salesOrderLine stored in column C_OrderLine_ID in table S_TimeExpenseLine<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property projectPhase stored in column C_ProjectPhase_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Identifies a phase for a particular project.}
     * 
     */
    public static final String PROPERTY_PROJECTPHASE = "projectPhase";

    /**
     * Property projectTask stored in column C_ProjectTask_ID in table S_TimeExpenseLine<br>
     * Help: {@literal A Project Task in a Project Phase represents the actual work.}
     * 
     */
    public static final String PROPERTY_PROJECTTASK = "projectTask";

    /**
     * Property timeType stored in column S_TimeType_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Differentiate time types for reporting purposes (In parallel to Activities)}
     * 
     */
    public static final String PROPERTY_TIMETYPE = "timeType";

    /**
     * Property stDimension stored in column User1_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table S_TimeExpenseLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property asset stored in column A_Asset_ID in table S_TimeExpenseLine<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";


    public SheetLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TIMESHEET, false);
        setDefaultValue(PROPERTY_QUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_REINVOICE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see SheetLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see SheetLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see SheetLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see SheetLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see SheetLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see SheetLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see SheetLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see SheetLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see SheetLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see SheetLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see SheetLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see SheetLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see SheetLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see SheetLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see SheetLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see SheetLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see SheetLine#PROPERTY_EXPENSESHEET
     * 
     */
    public Sheet getExpenseSheet() {
        return (Sheet) get(PROPERTY_EXPENSESHEET);
    }
    /**
     * @see SheetLine#PROPERTY_EXPENSESHEET
     * 
     */
    public void setExpenseSheet(Sheet expenseSheet) {
        set(PROPERTY_EXPENSESHEET, expenseSheet);
    }

    /**
     * @see SheetLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see SheetLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see SheetLine#PROPERTY_TIMESHEET
     * 
     */
    public Boolean isTimeSheet() {
        return (Boolean) get(PROPERTY_TIMESHEET);
    }
    /**
     * @see SheetLine#PROPERTY_TIMESHEET
     * 
     */
    public void setTimeSheet(Boolean timeSheet) {
        set(PROPERTY_TIMESHEET, timeSheet);
    }

    /**
     * @see SheetLine#PROPERTY_EXPENSEDATE
     * 
     */
    public Date getExpenseDate() {
        return (Date) get(PROPERTY_EXPENSEDATE);
    }
    /**
     * @see SheetLine#PROPERTY_EXPENSEDATE
     * 
     */
    public void setExpenseDate(Date expenseDate) {
        set(PROPERTY_EXPENSEDATE, expenseDate);
    }

    /**
     * @see SheetLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see SheetLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see SheetLine#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see SheetLine#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see SheetLine#PROPERTY_EXPENSEAMOUNT
     * 
     */
    public BigDecimal getExpenseAmount() {
        return (BigDecimal) get(PROPERTY_EXPENSEAMOUNT);
    }
    /**
     * @see SheetLine#PROPERTY_EXPENSEAMOUNT
     * 
     */
    public void setExpenseAmount(BigDecimal expenseAmount) {
        set(PROPERTY_EXPENSEAMOUNT, expenseAmount);
    }

    /**
     * @see SheetLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see SheetLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see SheetLine#PROPERTY_CONVERTEDAMOUNT
     * 
     */
    public BigDecimal getConvertedAmount() {
        return (BigDecimal) get(PROPERTY_CONVERTEDAMOUNT);
    }
    /**
     * @see SheetLine#PROPERTY_CONVERTEDAMOUNT
     * 
     */
    public void setConvertedAmount(BigDecimal convertedAmount) {
        set(PROPERTY_CONVERTEDAMOUNT, convertedAmount);
    }

    /**
     * @see SheetLine#PROPERTY_RESOURCEASSIGNMENT
     * 
     */
    public ResourceAssignment getResourceAssignment() {
        return (ResourceAssignment) get(PROPERTY_RESOURCEASSIGNMENT);
    }
    /**
     * @see SheetLine#PROPERTY_RESOURCEASSIGNMENT
     * 
     */
    public void setResourceAssignment(ResourceAssignment resourceAssignment) {
        set(PROPERTY_RESOURCEASSIGNMENT, resourceAssignment);
    }

    /**
     * @see SheetLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see SheetLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see SheetLine#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see SheetLine#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see SheetLine#PROPERTY_REINVOICE
     * 
     */
    public Boolean isReinvoice() {
        return (Boolean) get(PROPERTY_REINVOICE);
    }
    /**
     * @see SheetLine#PROPERTY_REINVOICE
     * 
     */
    public void setReinvoice(Boolean reinvoice) {
        set(PROPERTY_REINVOICE, reinvoice);
    }

    /**
     * @see SheetLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see SheetLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see SheetLine#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see SheetLine#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see SheetLine#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see SheetLine#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see SheetLine#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see SheetLine#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see SheetLine#PROPERTY_INVOICELINE
     * 
     */
    public InvoiceLine getInvoiceLine() {
        return (InvoiceLine) get(PROPERTY_INVOICELINE);
    }
    /**
     * @see SheetLine#PROPERTY_INVOICELINE
     * 
     */
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        set(PROPERTY_INVOICELINE, invoiceLine);
    }

    /**
     * @see SheetLine#PROPERTY_INVOICEPRICE
     * 
     */
    public BigDecimal getInvoicePrice() {
        return (BigDecimal) get(PROPERTY_INVOICEPRICE);
    }
    /**
     * @see SheetLine#PROPERTY_INVOICEPRICE
     * 
     */
    public void setInvoicePrice(BigDecimal invoicePrice) {
        set(PROPERTY_INVOICEPRICE, invoicePrice);
    }

    /**
     * @see SheetLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see SheetLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see SheetLine#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see SheetLine#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see SheetLine#PROPERTY_PROJECTPHASE
     * 
     */
    public ProjectPhase getProjectPhase() {
        return (ProjectPhase) get(PROPERTY_PROJECTPHASE);
    }
    /**
     * @see SheetLine#PROPERTY_PROJECTPHASE
     * 
     */
    public void setProjectPhase(ProjectPhase projectPhase) {
        set(PROPERTY_PROJECTPHASE, projectPhase);
    }

    /**
     * @see SheetLine#PROPERTY_PROJECTTASK
     * 
     */
    public ProjectTask getProjectTask() {
        return (ProjectTask) get(PROPERTY_PROJECTTASK);
    }
    /**
     * @see SheetLine#PROPERTY_PROJECTTASK
     * 
     */
    public void setProjectTask(ProjectTask projectTask) {
        set(PROPERTY_PROJECTTASK, projectTask);
    }

    /**
     * @see SheetLine#PROPERTY_TIMETYPE
     * 
     */
    public TimeType getTimeType() {
        return (TimeType) get(PROPERTY_TIMETYPE);
    }
    /**
     * @see SheetLine#PROPERTY_TIMETYPE
     * 
     */
    public void setTimeType(TimeType timeType) {
        set(PROPERTY_TIMETYPE, timeType);
    }

    /**
     * @see SheetLine#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see SheetLine#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see SheetLine#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see SheetLine#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see SheetLine#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see SheetLine#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see SheetLine#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see SheetLine#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

}
