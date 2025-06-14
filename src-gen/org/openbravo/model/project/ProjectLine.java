
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
package org.openbravo.model.project;

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
import org.openbravo.model.common.order.Order;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;
import org.openbravo.model.financialmgmt.tax.TaxRate;
/**
 * Entity class for entity ProjectLine (stored in table C_ProjectLine).
 * <br>
 * Help: {@literal Contains the lines (products and/or services) associated with the Project}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProjectLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ProjectLine";
    public static final String ENTITY_NAME = "ProjectLine";

    /**
     * Property id stored in column C_ProjectLine_ID in table C_ProjectLine<br>
     * Help: {@literal The Project Line indicates a unique project line.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ProjectLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ProjectLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_ProjectLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ProjectLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_ProjectLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ProjectLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_ProjectLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property project stored in column C_Project_ID in table C_ProjectLine<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property lineNo stored in column Line in table C_ProjectLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table C_ProjectLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property plannedQuantity stored in column PlannedQty in table C_ProjectLine<br>
     * Help: {@literal The Planned Quantity indicates the anticipated quantity for this project or project line}
     * 
     */
    public static final String PROPERTY_PLANNEDQUANTITY = "plannedQuantity";

    /**
     * Property plannedPrice stored in column PlannedPrice in table C_ProjectLine<br>
     * Help: {@literal The Planned Price indicates the anticipated price for this project line.}
     * 
     */
    public static final String PROPERTY_PLANNEDPRICE = "plannedPrice";

    /**
     * Property plannedAmount stored in column PlannedAmt in table C_ProjectLine<br>
     * Help: {@literal The Planned Amount indicates the anticipated amount for this project or project line.}
     * 
     */
    public static final String PROPERTY_PLANNEDAMOUNT = "plannedAmount";

    /**
     * Property plannedMargin stored in column PlannedMarginAmt in table C_ProjectLine<br>
     * Help: {@literal The Planned Margin Amount indicates the anticipated margin amount for this project or
     *       project line.}
     * 
     */
    public static final String PROPERTY_PLANNEDMARGIN = "plannedMargin";

    /**
     * Property contractAmount stored in column CommittedAmt in table C_ProjectLine<br>
     * Help: {@literal The commitment amount is independent from the planned amount. You would use the planned
     *       amount for your realistic estimation, which might be higher or lower than the commitment amount.}
     * 
     */
    public static final String PROPERTY_CONTRACTAMOUNT = "contractAmount";

    /**
     * Property product stored in column M_Product_ID in table C_ProjectLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table C_ProjectLine<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property invoiceAmount stored in column InvoicedAmt in table C_ProjectLine<br>
     * Help: {@literal The amount invoiced}
     * 
     */
    public static final String PROPERTY_INVOICEAMOUNT = "invoiceAmount";

    /**
     * Property invoiceQuantity stored in column InvoicedQty in table C_ProjectLine<br>
     * Help: {@literal The Quantity Invoiced}
     * 
     */
    public static final String PROPERTY_INVOICEQUANTITY = "invoiceQuantity";

    /**
     * Property contractQuantity stored in column CommittedQty in table C_ProjectLine<br>
     * Help: {@literal The commitment amount is independent from the planned amount. You would use the planned
     *       amount for your realistic estimation, which might be higher or lower than the commitment amount.}
     * 
     */
    public static final String PROPERTY_CONTRACTQUANTITY = "contractQuantity";

    /**
     * Property projectIssue stored in column C_ProjectIssue_ID in table C_ProjectLine<br>
     * Help: {@literal Issues to the project initiated by the "Issue to Project" process. You can issue Receipts,
     *       Time and Expenses, or Stock.}
     * 
     */
    public static final String PROPERTY_PROJECTISSUE = "projectIssue";

    /**
     * Property salesOrder stored in column C_Order_ID in table C_ProjectLine<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property purchaseOrder stored in column C_OrderPO_ID in table C_ProjectLine<br>
     * Help: {@literal Purchase order}
     * 
     */
    public static final String PROPERTY_PURCHASEORDER = "purchaseOrder";

    /**
     * Property print stored in column IsPrinted in table C_ProjectLine<br>
     * Help: {@literal The Printed checkbox indicates if this document or line will included when printing.}
     * 
     */
    public static final String PROPERTY_PRINT = "print";

    /**
     * Property processed stored in column Processed in table C_ProjectLine<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property plannedPurchasePrice stored in column Plannedpoprice in table C_ProjectLine<br>
     * Help: {@literal Indicates the planned price for the purchase order}
     * 
     */
    public static final String PROPERTY_PLANNEDPURCHASEPRICE = "plannedPurchasePrice";

    /**
     * Property tax stored in column C_Tax_ID in table C_ProjectLine<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property productDescription stored in column Product_Description in table C_ProjectLine<br>
     * Help: {@literal Description for the product}
     * 
     */
    public static final String PROPERTY_PRODUCTDESCRIPTION = "productDescription";

    /**
     * Property name stored in column Product_Name in table C_ProjectLine<br>
     * Help: {@literal Name of the product}
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property identifier stored in column Product_Value in table C_ProjectLine<br>
     * Help: {@literal A value specified in many forms.}
     * 
     */
    public static final String PROPERTY_IDENTIFIER = "identifier";


    public ProjectLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PLANNEDQUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_PLANNEDAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_PLANNEDMARGIN, new BigDecimal(0));
        setDefaultValue(PROPERTY_CONTRACTAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_INVOICEAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_INVOICEQUANTITY, new BigDecimal(0));
        setDefaultValue(PROPERTY_CONTRACTQUANTITY, new BigDecimal(0));
        setDefaultValue(PROPERTY_PRINT, true);
        setDefaultValue(PROPERTY_PROCESSED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProjectLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProjectLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProjectLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProjectLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProjectLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProjectLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProjectLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProjectLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProjectLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProjectLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProjectLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProjectLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProjectLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProjectLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProjectLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProjectLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProjectLine#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see ProjectLine#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see ProjectLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see ProjectLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see ProjectLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProjectLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProjectLine#PROPERTY_PLANNEDQUANTITY
     * 
     */
    public BigDecimal getPlannedQuantity() {
        return (BigDecimal) get(PROPERTY_PLANNEDQUANTITY);
    }
    /**
     * @see ProjectLine#PROPERTY_PLANNEDQUANTITY
     * 
     */
    public void setPlannedQuantity(BigDecimal plannedQuantity) {
        set(PROPERTY_PLANNEDQUANTITY, plannedQuantity);
    }

    /**
     * @see ProjectLine#PROPERTY_PLANNEDPRICE
     * 
     */
    public BigDecimal getPlannedPrice() {
        return (BigDecimal) get(PROPERTY_PLANNEDPRICE);
    }
    /**
     * @see ProjectLine#PROPERTY_PLANNEDPRICE
     * 
     */
    public void setPlannedPrice(BigDecimal plannedPrice) {
        set(PROPERTY_PLANNEDPRICE, plannedPrice);
    }

    /**
     * @see ProjectLine#PROPERTY_PLANNEDAMOUNT
     * 
     */
    public BigDecimal getPlannedAmount() {
        return (BigDecimal) get(PROPERTY_PLANNEDAMOUNT);
    }
    /**
     * @see ProjectLine#PROPERTY_PLANNEDAMOUNT
     * 
     */
    public void setPlannedAmount(BigDecimal plannedAmount) {
        set(PROPERTY_PLANNEDAMOUNT, plannedAmount);
    }

    /**
     * @see ProjectLine#PROPERTY_PLANNEDMARGIN
     * 
     */
    public BigDecimal getPlannedMargin() {
        return (BigDecimal) get(PROPERTY_PLANNEDMARGIN);
    }
    /**
     * @see ProjectLine#PROPERTY_PLANNEDMARGIN
     * 
     */
    public void setPlannedMargin(BigDecimal plannedMargin) {
        set(PROPERTY_PLANNEDMARGIN, plannedMargin);
    }

    /**
     * @see ProjectLine#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public BigDecimal getContractAmount() {
        return (BigDecimal) get(PROPERTY_CONTRACTAMOUNT);
    }
    /**
     * @see ProjectLine#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public void setContractAmount(BigDecimal contractAmount) {
        set(PROPERTY_CONTRACTAMOUNT, contractAmount);
    }

    /**
     * @see ProjectLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProjectLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProjectLine#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see ProjectLine#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see ProjectLine#PROPERTY_INVOICEAMOUNT
     * 
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) get(PROPERTY_INVOICEAMOUNT);
    }
    /**
     * @see ProjectLine#PROPERTY_INVOICEAMOUNT
     * 
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        set(PROPERTY_INVOICEAMOUNT, invoiceAmount);
    }

    /**
     * @see ProjectLine#PROPERTY_INVOICEQUANTITY
     * 
     */
    public BigDecimal getInvoiceQuantity() {
        return (BigDecimal) get(PROPERTY_INVOICEQUANTITY);
    }
    /**
     * @see ProjectLine#PROPERTY_INVOICEQUANTITY
     * 
     */
    public void setInvoiceQuantity(BigDecimal invoiceQuantity) {
        set(PROPERTY_INVOICEQUANTITY, invoiceQuantity);
    }

    /**
     * @see ProjectLine#PROPERTY_CONTRACTQUANTITY
     * 
     */
    public BigDecimal getContractQuantity() {
        return (BigDecimal) get(PROPERTY_CONTRACTQUANTITY);
    }
    /**
     * @see ProjectLine#PROPERTY_CONTRACTQUANTITY
     * 
     */
    public void setContractQuantity(BigDecimal contractQuantity) {
        set(PROPERTY_CONTRACTQUANTITY, contractQuantity);
    }

    /**
     * @see ProjectLine#PROPERTY_PROJECTISSUE
     * 
     */
    public ProjectIssue getProjectIssue() {
        return (ProjectIssue) get(PROPERTY_PROJECTISSUE);
    }
    /**
     * @see ProjectLine#PROPERTY_PROJECTISSUE
     * 
     */
    public void setProjectIssue(ProjectIssue projectIssue) {
        set(PROPERTY_PROJECTISSUE, projectIssue);
    }

    /**
     * @see ProjectLine#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see ProjectLine#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see ProjectLine#PROPERTY_PURCHASEORDER
     * 
     */
    public Order getPurchaseOrder() {
        return (Order) get(PROPERTY_PURCHASEORDER);
    }
    /**
     * @see ProjectLine#PROPERTY_PURCHASEORDER
     * 
     */
    public void setPurchaseOrder(Order purchaseOrder) {
        set(PROPERTY_PURCHASEORDER, purchaseOrder);
    }

    /**
     * @see ProjectLine#PROPERTY_PRINT
     * 
     */
    public Boolean isPrint() {
        return (Boolean) get(PROPERTY_PRINT);
    }
    /**
     * @see ProjectLine#PROPERTY_PRINT
     * 
     */
    public void setPrint(Boolean print) {
        set(PROPERTY_PRINT, print);
    }

    /**
     * @see ProjectLine#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see ProjectLine#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see ProjectLine#PROPERTY_PLANNEDPURCHASEPRICE
     * 
     */
    public BigDecimal getPlannedPurchasePrice() {
        return (BigDecimal) get(PROPERTY_PLANNEDPURCHASEPRICE);
    }
    /**
     * @see ProjectLine#PROPERTY_PLANNEDPURCHASEPRICE
     * 
     */
    public void setPlannedPurchasePrice(BigDecimal plannedPurchasePrice) {
        set(PROPERTY_PLANNEDPURCHASEPRICE, plannedPurchasePrice);
    }

    /**
     * @see ProjectLine#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see ProjectLine#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see ProjectLine#PROPERTY_PRODUCTDESCRIPTION
     * 
     */
    public String getProductDescription() {
        return (String) get(PROPERTY_PRODUCTDESCRIPTION);
    }
    /**
     * @see ProjectLine#PROPERTY_PRODUCTDESCRIPTION
     * 
     */
    public void setProductDescription(String productDescription) {
        set(PROPERTY_PRODUCTDESCRIPTION, productDescription);
    }

    /**
     * @see ProjectLine#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProjectLine#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProjectLine#PROPERTY_IDENTIFIER
     * 
     */
    public String getIdentifier() {
        return (String) get(PROPERTY_IDENTIFIER);
    }
    /**
     * @see ProjectLine#PROPERTY_IDENTIFIER
     * 
     */
    public void setIdentifier(String identifier) {
        set(PROPERTY_IDENTIFIER, identifier);
    }

}
