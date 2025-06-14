
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
package org.openbravo.model.common.invoice;

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
import org.openbravo.model.common.businesspartner.Category;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;
/**
 * Entity class for entity InvoiceLineV2 (stored in table C_InvoiceLine_V2).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceLineV2 extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_InvoiceLine_V2";
    public static final String ENTITY_NAME = "InvoiceLineV2";

    /**
     * Property id stored in column C_Invoiceline_V2_ID in table C_InvoiceLine_V2 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_InvoiceLine_V2 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_InvoiceLine_V2 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_InvoiceLine_V2 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_InvoiceLine_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_InvoiceLine_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_InvoiceLine_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_InvoiceLine_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property invoiceLine stored in column C_InvoiceLine_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal The Invoice Line uniquely identifies a single line of an Invoice.}
     * 
     */
    public static final String PROPERTY_INVOICELINE = "invoiceLine";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property businessPartnerCategory stored in column C_BP_Group_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property product stored in column M_Product_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property invoiceDate stored in column DateInvoiced in table C_InvoiceLine_V2<br>
     * Help: {@literal The Date Invoice indicates the date printed on the invoice.}
     * 
     */
    public static final String PROPERTY_INVOICEDATE = "invoiceDate";

    /**
     * Property accountingDate stored in column DateAcct in table C_InvoiceLine_V2<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property invoicedQuantity stored in column QtyInvoiced in table C_InvoiceLine_V2<br>
     * Help: {@literal The Invoiced Quantity indicates the quantity of a product that have been invoiced.}
     * 
     */
    public static final String PROPERTY_INVOICEDQUANTITY = "invoicedQuantity";

    /**
     * Property listPrice stored in column PriceList in table C_InvoiceLine_V2<br>
     * Help: {@literal The Net List Price is the official price stated by the selected pricelist and the currency
     *       of the document.}
     * 
     */
    public static final String PROPERTY_LISTPRICE = "listPrice";

    /**
     * Property unitPrice stored in column PriceActual in table C_InvoiceLine_V2<br>
     * Help: {@literal The actual price indicates the price for a product in source currency.}
     * 
     */
    public static final String PROPERTY_UNITPRICE = "unitPrice";

    /**
     * Property priceLimit stored in column PriceLimit in table C_InvoiceLine_V2<br>
     * Help: {@literal The Net Price Limit indicates the lowest price for a product stated in the Price List
     *       Currency.}
     * 
     */
    public static final String PROPERTY_PRICELIMIT = "priceLimit";

    /**
     * Property discount stored in column Discount in table C_InvoiceLine_V2<br>
     * Help: {@literal The Discount indicates the discount applied or taken as a percentage.}
     * 
     */
    public static final String PROPERTY_DISCOUNT = "discount";

    /**
     * Property margin stored in column Margin in table C_InvoiceLine_V2<br>
     * Help: {@literal The Margin indicates the margin for this product as a percentage of the limit price and
     *       selling price.}
     * 
     */
    public static final String PROPERTY_MARGIN = "margin";

    /**
     * Property lineNetAmount stored in column LineNetAmt in table C_InvoiceLine_V2<br>
     * Help: {@literal Indicates the line net amount based on the quantity and the actual price.  Any additional
     *       charges or freight are not included.}
     * 
     */
    public static final String PROPERTY_LINENETAMOUNT = "lineNetAmount";

    /**
     * Property lineListAmount stored in column LineListAmt in table C_InvoiceLine_V2
     * 
     */
    public static final String PROPERTY_LINELISTAMOUNT = "lineListAmount";

    /**
     * Property lineLimitAmount stored in column LineLimitAmt in table C_InvoiceLine_V2
     * 
     */
    public static final String PROPERTY_LINELIMITAMOUNT = "lineLimitAmount";

    /**
     * Property lineDiscount stored in column LineDiscountAmt in table C_InvoiceLine_V2<br>
     * Help: {@literal Indicates the discount for this line as an amount.}
     * 
     */
    public static final String PROPERTY_LINEDISCOUNT = "lineDiscount";

    /**
     * Property grossMargin stored in column LineOverLimitAmt in table C_InvoiceLine_V2
     * 
     */
    public static final String PROPERTY_GROSSMARGIN = "grossMargin";

    /**
     * Property account stored in column Account_ID in table C_InvoiceLine_V2<br>
     * Help: {@literal The (natural) account used}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";


    public InvoiceLineV2() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceLineV2#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_INVOICELINE
     * 
     */
    public InvoiceLine getInvoiceLine() {
        return (InvoiceLine) get(PROPERTY_INVOICELINE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_INVOICELINE
     * 
     */
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        set(PROPERTY_INVOICELINE, invoiceLine);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_INVOICEDATE
     * 
     */
    public Date getInvoiceDate() {
        return (Date) get(PROPERTY_INVOICEDATE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_INVOICEDATE
     * 
     */
    public void setInvoiceDate(Date invoiceDate) {
        set(PROPERTY_INVOICEDATE, invoiceDate);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_INVOICEDQUANTITY
     * 
     */
    public BigDecimal getInvoicedQuantity() {
        return (BigDecimal) get(PROPERTY_INVOICEDQUANTITY);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_INVOICEDQUANTITY
     * 
     */
    public void setInvoicedQuantity(BigDecimal invoicedQuantity) {
        set(PROPERTY_INVOICEDQUANTITY, invoicedQuantity);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_LISTPRICE
     * 
     */
    public BigDecimal getListPrice() {
        return (BigDecimal) get(PROPERTY_LISTPRICE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_LISTPRICE
     * 
     */
    public void setListPrice(BigDecimal listPrice) {
        set(PROPERTY_LISTPRICE, listPrice);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_UNITPRICE
     * 
     */
    public BigDecimal getUnitPrice() {
        return (BigDecimal) get(PROPERTY_UNITPRICE);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_UNITPRICE
     * 
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        set(PROPERTY_UNITPRICE, unitPrice);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_PRICELIMIT
     * 
     */
    public BigDecimal getPriceLimit() {
        return (BigDecimal) get(PROPERTY_PRICELIMIT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_PRICELIMIT
     * 
     */
    public void setPriceLimit(BigDecimal priceLimit) {
        set(PROPERTY_PRICELIMIT, priceLimit);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_DISCOUNT
     * 
     */
    public Long getDiscount() {
        return (Long) get(PROPERTY_DISCOUNT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_DISCOUNT
     * 
     */
    public void setDiscount(Long discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_MARGIN
     * 
     */
    public BigDecimal getMargin() {
        return (BigDecimal) get(PROPERTY_MARGIN);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_MARGIN
     * 
     */
    public void setMargin(BigDecimal margin) {
        set(PROPERTY_MARGIN, margin);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_LINENETAMOUNT
     * 
     */
    public BigDecimal getLineNetAmount() {
        return (BigDecimal) get(PROPERTY_LINENETAMOUNT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_LINENETAMOUNT
     * 
     */
    public void setLineNetAmount(BigDecimal lineNetAmount) {
        set(PROPERTY_LINENETAMOUNT, lineNetAmount);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_LINELISTAMOUNT
     * 
     */
    public BigDecimal getLineListAmount() {
        return (BigDecimal) get(PROPERTY_LINELISTAMOUNT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_LINELISTAMOUNT
     * 
     */
    public void setLineListAmount(BigDecimal lineListAmount) {
        set(PROPERTY_LINELISTAMOUNT, lineListAmount);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_LINELIMITAMOUNT
     * 
     */
    public BigDecimal getLineLimitAmount() {
        return (BigDecimal) get(PROPERTY_LINELIMITAMOUNT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_LINELIMITAMOUNT
     * 
     */
    public void setLineLimitAmount(BigDecimal lineLimitAmount) {
        set(PROPERTY_LINELIMITAMOUNT, lineLimitAmount);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_LINEDISCOUNT
     * 
     */
    public BigDecimal getLineDiscount() {
        return (BigDecimal) get(PROPERTY_LINEDISCOUNT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_LINEDISCOUNT
     * 
     */
    public void setLineDiscount(BigDecimal lineDiscount) {
        set(PROPERTY_LINEDISCOUNT, lineDiscount);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_GROSSMARGIN
     * 
     */
    public BigDecimal getGrossMargin() {
        return (BigDecimal) get(PROPERTY_GROSSMARGIN);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_GROSSMARGIN
     * 
     */
    public void setGrossMargin(BigDecimal grossMargin) {
        set(PROPERTY_GROSSMARGIN, grossMargin);
    }

    /**
     * @see InvoiceLineV2#PROPERTY_ACCOUNT
     * 
     */
    public ElementValue getAccount() {
        return (ElementValue) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see InvoiceLineV2#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(ElementValue account) {
        set(PROPERTY_ACCOUNT, account);
    }

}
