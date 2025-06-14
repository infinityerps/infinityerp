
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.InvoiceLineTax;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.calendar.Period;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.financialmgmt.tax.TaxRate;
import org.openbravo.model.materialmgmt.cost.LCMatched;
import org.openbravo.model.materialmgmt.cost.LandedCostCost;
import org.openbravo.model.materialmgmt.transaction.ShipmentInOutLine;
import org.openbravo.model.pricing.priceadjustment.PriceAdjustment;
import org.openbravo.model.procurement.POInvoiceMatch;
import org.openbravo.model.procurement.ReceiptInvoiceMatch;
import org.openbravo.model.project.Project;
import org.openbravo.model.project.ProjectLine;
import org.openbravo.model.sales.CommissionDetail;
import org.openbravo.model.timeandexpense.ResourceAssignment;
/**
 * Entity class for entity InvoiceLine (stored in table C_InvoiceLine).
 * <br>
 * Help: {@literal Contains the  individual items or charges on an Invoice}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_InvoiceLine";
    public static final String ENTITY_NAME = "InvoiceLine";

    /**
     * Property id stored in column C_InvoiceLine_ID in table C_InvoiceLine<br>
     * Help: {@literal The Invoice Line uniquely identifies a single line of an Invoice.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_InvoiceLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_InvoiceLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_InvoiceLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_InvoiceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_InvoiceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_InvoiceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_InvoiceLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_InvoiceLine<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property salesOrderLine stored in column C_OrderLine_ID in table C_InvoiceLine<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property goodsShipmentLine stored in column M_InOutLine_ID in table C_InvoiceLine<br>
     * Help: {@literal The Goods Shipment Line indicates a unique line in a Shipment document}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENTLINE = "goodsShipmentLine";

    /**
     * Property lineNo stored in column Line in table C_InvoiceLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table C_InvoiceLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property financialInvoiceLine stored in column Financial_Invoice_Line in table C_InvoiceLine<br>
     * Help: {@literal This flag will decide whether we are going to book the invoice line on directly general
     *       ledger or not.}
     * 
     */
    public static final String PROPERTY_FINANCIALINVOICELINE = "financialInvoiceLine";

    /**
     * Property account stored in column Account_ID in table C_InvoiceLine<br>
     * Help: {@literal The (natural) account used}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property product stored in column M_Product_ID in table C_InvoiceLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property invoicedQuantity stored in column QtyInvoiced in table C_InvoiceLine<br>
     * Help: {@literal The Invoiced Quantity indicates the quantity of a product that have been invoiced.}
     * 
     */
    public static final String PROPERTY_INVOICEDQUANTITY = "invoicedQuantity";

    /**
     * Property listPrice stored in column PriceList in table C_InvoiceLine<br>
     * Help: {@literal The Net List Price is the official price stated by the selected pricelist and the currency
     *       of the document.}
     * 
     */
    public static final String PROPERTY_LISTPRICE = "listPrice";

    /**
     * Property unitPrice stored in column PriceActual in table C_InvoiceLine<br>
     * Help: {@literal The actual price indicates the price for a product in source currency.}
     * 
     */
    public static final String PROPERTY_UNITPRICE = "unitPrice";

    /**
     * Property priceLimit stored in column PriceLimit in table C_InvoiceLine<br>
     * Help: {@literal The Net Price Limit indicates the lowest price for a product stated in the Price List
     *       Currency.}
     * 
     */
    public static final String PROPERTY_PRICELIMIT = "priceLimit";

    /**
     * Property lineNetAmount stored in column LineNetAmt in table C_InvoiceLine 
     * 
     */
    public static final String PROPERTY_LINENETAMOUNT = "lineNetAmount";

    /**
     * Property charge stored in column C_Charge_ID in table C_InvoiceLine<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property chargeAmount stored in column ChargeAmt in table C_InvoiceLine<br>
     * Help: {@literal The Charge Amount indicates the amount for an additional charge.}
     * 
     */
    public static final String PROPERTY_CHARGEAMOUNT = "chargeAmount";

    /**
     * Property uOM stored in column C_UOM_ID in table C_InvoiceLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property tax stored in column C_Tax_ID in table C_InvoiceLine<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property resourceAssignment stored in column S_ResourceAssignment_ID in table C_InvoiceLine<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_RESOURCEASSIGNMENT = "resourceAssignment";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table C_InvoiceLine<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property descriptionOnly stored in column IsDescription in table C_InvoiceLine<br>
     * Help: {@literal If a line is Description Only, e.g. Product Inventory is not corrected. No accounting
     *       transactions are created and the amount or totals are not included in the document.  This for
     *       including descriptional detail lines, e.g. for an Work Order.}
     * 
     */
    public static final String PROPERTY_DESCRIPTIONONLY = "descriptionOnly";

    /**
     * Property orderQuantity stored in column QuantityOrder in table C_InvoiceLine<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table C_InvoiceLine<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property invoiceDiscount stored in column C_Invoice_Discount_ID in table C_InvoiceLine<br>
     * Help: {@literal The ID identifies a unique discount for the invoice}
     * 
     */
    public static final String PROPERTY_INVOICEDISCOUNT = "invoiceDiscount";

    /**
     * Property projectLine stored in column C_Projectline_ID in table C_InvoiceLine<br>
     * Help: {@literal The Project Line indicates a unique project line.}
     * 
     */
    public static final String PROPERTY_PROJECTLINE = "projectLine";

    /**
     * Property priceAdjustment stored in column M_Offer_ID in table C_InvoiceLine<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENT = "priceAdjustment";

    /**
     * Property standardPrice stored in column PriceStd in table C_InvoiceLine<br>
     * Help: {@literal Net unit price before applying this promotion. In case multiple promotions are applied in
     *       cascade, this price is the one after applying all promotions with more priority than current
     *       one.
     *       
     *       This field is populated in case the used price list does not include taxes.}
     * 
     */
    public static final String PROPERTY_STANDARDPRICE = "standardPrice";

    /**
     * Property excludeforwithholding stored in column Excludeforwithholding in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_EXCLUDEFORWITHHOLDING = "excludeforwithholding";

    /**
     * Property editLineAmount stored in column Iseditlinenetamt in table C_InvoiceLine<br>
     * Help: {@literal A flag used to allow the end-user to edit Line Net Amount field.}
     * 
     */
    public static final String PROPERTY_EDITLINEAMOUNT = "editLineAmount";

    /**
     * Property taxableAmount stored in column Taxbaseamt in table C_InvoiceLine<br>
     * Help: {@literal The Tax Base Amount indicates the base amount used for calculating the tax amount.}
     * 
     */
    public static final String PROPERTY_TAXABLEAMOUNT = "taxableAmount";

    /**
     * Property grossAmount stored in column Line_Gross_Amount in table C_InvoiceLine<br>
     * Help: {@literal This is the total amount against a line ( i.e product price * quantity + taxes ) }
     * 
     */
    public static final String PROPERTY_GROSSAMOUNT = "grossAmount";

    /**
     * Property grossUnitPrice stored in column Gross_Unit_Price in table C_InvoiceLine<br>
     * Help: {@literal This is the price that is provided when the price is inclusive of taxes. }
     * 
     */
    public static final String PROPERTY_GROSSUNITPRICE = "grossUnitPrice";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table C_InvoiceLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property periodNumber stored in column Periodnumber in table C_InvoiceLine<br>
     * Help: {@literal Set here the number of periods to be used when deferring the revenue}
     * 
     */
    public static final String PROPERTY_PERIODNUMBER = "periodNumber";

    /**
     * Property baseGrossUnitPrice stored in column grosspricestd in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_BASEGROSSUNITPRICE = "baseGrossUnitPrice";

    /**
     * Property asset stored in column A_Asset_ID in table C_InvoiceLine<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property deferredPlanType stored in column DefPlanType in table C_InvoiceLine<br>
     * Help: {@literal Set the type of plan to be used when deferring revenue}
     * 
     */
    public static final String PROPERTY_DEFERREDPLANTYPE = "deferredPlanType";

    /**
     * Property grossListPrice stored in column Grosspricelist in table C_InvoiceLine<br>
     * Help: {@literal The Gross List Price is the official price stated by the selected tax included pricelist
     *       and the currency of the document.}
     * 
     */
    public static final String PROPERTY_GROSSLISTPRICE = "grossListPrice";

    /**
     * Property project stored in column C_Project_ID in table C_InvoiceLine<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property deferred stored in column IsDeferred in table C_InvoiceLine<br>
     * Help: {@literal When flagged revenue of the product will be deferred using the plan and the number of
     *       periods}
     * 
     */
    public static final String PROPERTY_DEFERRED = "deferred";

    /**
     * Property period stored in column C_Period_ID in table C_InvoiceLine<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table C_InvoiceLine<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property stDimension stored in column User1_ID in table C_InvoiceLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table C_InvoiceLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property explode stored in column Explode in table C_InvoiceLine<br>
     * Help: {@literal Explode the BOM product}
     * 
     */
    public static final String PROPERTY_EXPLODE = "explode";

    /**
     * Property bOMParent stored in column BOM_Parent_ID in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_BOMPARENT = "bOMParent";

    /**
     * Property matchLCCosts stored in column Match_Lccosts in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_MATCHLCCOSTS = "matchLCCosts";

    /**
     * Property operativeUOM stored in column C_Aum in table C_InvoiceLine<br>
     * Help: {@literal The Alternative UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_OPERATIVEUOM = "operativeUOM";

    /**
     * Property operativeQuantity stored in column Aumqty in table C_InvoiceLine<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_OPERATIVEQUANTITY = "operativeQuantity";

    /**
     * Property salesRepresentative stored in column Salesrep_ID in table C_InvoiceLine<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property invoiceLineBOMParentIDList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_INVOICELINEBOMPARENTIDLIST = "invoiceLineBOMParentIDList";

    /**
     * Property invoiceLineAccountingDimensionList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_INVOICELINEACCOUNTINGDIMENSIONLIST = "invoiceLineAccountingDimensionList";

    /**
     * Property invoiceLineOfferList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_INVOICELINEOFFERLIST = "invoiceLineOfferList";

    /**
     * Property invoiceLineTaxList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_INVOICELINETAXLIST = "invoiceLineTaxList";

    /**
     * Property landedCostCostList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_LANDEDCOSTCOSTLIST = "landedCostCostList";

    /**
     * Property landedCostMatchedList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_LANDEDCOSTMATCHEDLIST = "landedCostMatchedList";

    /**
     * Property procurementPOInvoiceMatchList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_PROCUREMENTPOINVOICEMATCHLIST = "procurementPOInvoiceMatchList";

    /**
     * Property procurementReceiptInvoiceMatchList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST = "procurementReceiptInvoiceMatchList";

    /**
     * Property salesCommissionDetailList stored in table C_InvoiceLine
     * 
     */
    public static final String PROPERTY_SALESCOMMISSIONDETAILLIST = "salesCommissionDetailList";


    public InvoiceLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FINANCIALINVOICELINE, false);
        setDefaultValue(PROPERTY_INVOICEDQUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_DESCRIPTIONONLY, false);
        setDefaultValue(PROPERTY_STANDARDPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_EXCLUDEFORWITHHOLDING, false);
        setDefaultValue(PROPERTY_EDITLINEAMOUNT, false);
        setDefaultValue(PROPERTY_GROSSAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_GROSSUNITPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_BASEGROSSUNITPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_DEFERRED, false);
        setDefaultValue(PROPERTY_EXPLODE, false);
        setDefaultValue(PROPERTY_MATCHLCCOSTS, false);
        setDefaultValue(PROPERTY_INVOICELINEBOMPARENTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINEACCOUNTINGDIMENSIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINEOFFERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINETAXLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_LANDEDCOSTCOSTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_LANDEDCOSTMATCHEDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTPOINVOICEMATCHLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_SALESCOMMISSIONDETAILLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceLine#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see InvoiceLine#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see InvoiceLine#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see InvoiceLine#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see InvoiceLine#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public ShipmentInOutLine getGoodsShipmentLine() {
        return (ShipmentInOutLine) get(PROPERTY_GOODSSHIPMENTLINE);
    }
    /**
     * @see InvoiceLine#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public void setGoodsShipmentLine(ShipmentInOutLine goodsShipmentLine) {
        set(PROPERTY_GOODSSHIPMENTLINE, goodsShipmentLine);
    }

    /**
     * @see InvoiceLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see InvoiceLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see InvoiceLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see InvoiceLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see InvoiceLine#PROPERTY_FINANCIALINVOICELINE
     * 
     */
    public Boolean isFinancialInvoiceLine() {
        return (Boolean) get(PROPERTY_FINANCIALINVOICELINE);
    }
    /**
     * @see InvoiceLine#PROPERTY_FINANCIALINVOICELINE
     * 
     */
    public void setFinancialInvoiceLine(Boolean financialInvoiceLine) {
        set(PROPERTY_FINANCIALINVOICELINE, financialInvoiceLine);
    }

    /**
     * @see InvoiceLine#PROPERTY_ACCOUNT
     * 
     */
    public GLItem getAccount() {
        return (GLItem) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see InvoiceLine#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(GLItem account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see InvoiceLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see InvoiceLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see InvoiceLine#PROPERTY_INVOICEDQUANTITY
     * 
     */
    public BigDecimal getInvoicedQuantity() {
        return (BigDecimal) get(PROPERTY_INVOICEDQUANTITY);
    }
    /**
     * @see InvoiceLine#PROPERTY_INVOICEDQUANTITY
     * 
     */
    public void setInvoicedQuantity(BigDecimal invoicedQuantity) {
        set(PROPERTY_INVOICEDQUANTITY, invoicedQuantity);
    }

    /**
     * @see InvoiceLine#PROPERTY_LISTPRICE
     * 
     */
    public BigDecimal getListPrice() {
        return (BigDecimal) get(PROPERTY_LISTPRICE);
    }
    /**
     * @see InvoiceLine#PROPERTY_LISTPRICE
     * 
     */
    public void setListPrice(BigDecimal listPrice) {
        set(PROPERTY_LISTPRICE, listPrice);
    }

    /**
     * @see InvoiceLine#PROPERTY_UNITPRICE
     * 
     */
    public BigDecimal getUnitPrice() {
        return (BigDecimal) get(PROPERTY_UNITPRICE);
    }
    /**
     * @see InvoiceLine#PROPERTY_UNITPRICE
     * 
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        set(PROPERTY_UNITPRICE, unitPrice);
    }

    /**
     * @see InvoiceLine#PROPERTY_PRICELIMIT
     * 
     */
    public BigDecimal getPriceLimit() {
        return (BigDecimal) get(PROPERTY_PRICELIMIT);
    }
    /**
     * @see InvoiceLine#PROPERTY_PRICELIMIT
     * 
     */
    public void setPriceLimit(BigDecimal priceLimit) {
        set(PROPERTY_PRICELIMIT, priceLimit);
    }

    /**
     * @see InvoiceLine#PROPERTY_LINENETAMOUNT
     * 
     */
    public BigDecimal getLineNetAmount() {
        return (BigDecimal) get(PROPERTY_LINENETAMOUNT);
    }
    /**
     * @see InvoiceLine#PROPERTY_LINENETAMOUNT
     * 
     */
    public void setLineNetAmount(BigDecimal lineNetAmount) {
        set(PROPERTY_LINENETAMOUNT, lineNetAmount);
    }

    /**
     * @see InvoiceLine#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see InvoiceLine#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see InvoiceLine#PROPERTY_CHARGEAMOUNT
     * 
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEAMOUNT);
    }
    /**
     * @see InvoiceLine#PROPERTY_CHARGEAMOUNT
     * 
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        set(PROPERTY_CHARGEAMOUNT, chargeAmount);
    }

    /**
     * @see InvoiceLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see InvoiceLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see InvoiceLine#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see InvoiceLine#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see InvoiceLine#PROPERTY_RESOURCEASSIGNMENT
     * 
     */
    public ResourceAssignment getResourceAssignment() {
        return (ResourceAssignment) get(PROPERTY_RESOURCEASSIGNMENT);
    }
    /**
     * @see InvoiceLine#PROPERTY_RESOURCEASSIGNMENT
     * 
     */
    public void setResourceAssignment(ResourceAssignment resourceAssignment) {
        set(PROPERTY_RESOURCEASSIGNMENT, resourceAssignment);
    }

    /**
     * @see InvoiceLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see InvoiceLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see InvoiceLine#PROPERTY_DESCRIPTIONONLY
     * 
     */
    public Boolean isDescriptionOnly() {
        return (Boolean) get(PROPERTY_DESCRIPTIONONLY);
    }
    /**
     * @see InvoiceLine#PROPERTY_DESCRIPTIONONLY
     * 
     */
    public void setDescriptionOnly(Boolean descriptionOnly) {
        set(PROPERTY_DESCRIPTIONONLY, descriptionOnly);
    }

    /**
     * @see InvoiceLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see InvoiceLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see InvoiceLine#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see InvoiceLine#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see InvoiceLine#PROPERTY_INVOICEDISCOUNT
     * 
     */
    public InvoiceDiscount getInvoiceDiscount() {
        return (InvoiceDiscount) get(PROPERTY_INVOICEDISCOUNT);
    }
    /**
     * @see InvoiceLine#PROPERTY_INVOICEDISCOUNT
     * 
     */
    public void setInvoiceDiscount(InvoiceDiscount invoiceDiscount) {
        set(PROPERTY_INVOICEDISCOUNT, invoiceDiscount);
    }

    /**
     * @see InvoiceLine#PROPERTY_PROJECTLINE
     * 
     */
    public ProjectLine getProjectLine() {
        return (ProjectLine) get(PROPERTY_PROJECTLINE);
    }
    /**
     * @see InvoiceLine#PROPERTY_PROJECTLINE
     * 
     */
    public void setProjectLine(ProjectLine projectLine) {
        set(PROPERTY_PROJECTLINE, projectLine);
    }

    /**
     * @see InvoiceLine#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public PriceAdjustment getPriceAdjustment() {
        return (PriceAdjustment) get(PROPERTY_PRICEADJUSTMENT);
    }
    /**
     * @see InvoiceLine#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
        set(PROPERTY_PRICEADJUSTMENT, priceAdjustment);
    }

    /**
     * @see InvoiceLine#PROPERTY_STANDARDPRICE
     * 
     */
    public BigDecimal getStandardPrice() {
        return (BigDecimal) get(PROPERTY_STANDARDPRICE);
    }
    /**
     * @see InvoiceLine#PROPERTY_STANDARDPRICE
     * 
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        set(PROPERTY_STANDARDPRICE, standardPrice);
    }

    /**
     * @see InvoiceLine#PROPERTY_EXCLUDEFORWITHHOLDING
     * 
     */
    public Boolean isExcludeforwithholding() {
        return (Boolean) get(PROPERTY_EXCLUDEFORWITHHOLDING);
    }
    /**
     * @see InvoiceLine#PROPERTY_EXCLUDEFORWITHHOLDING
     * 
     */
    public void setExcludeforwithholding(Boolean excludeforwithholding) {
        set(PROPERTY_EXCLUDEFORWITHHOLDING, excludeforwithholding);
    }

    /**
     * @see InvoiceLine#PROPERTY_EDITLINEAMOUNT
     * 
     */
    public Boolean isEditLineAmount() {
        return (Boolean) get(PROPERTY_EDITLINEAMOUNT);
    }
    /**
     * @see InvoiceLine#PROPERTY_EDITLINEAMOUNT
     * 
     */
    public void setEditLineAmount(Boolean editLineAmount) {
        set(PROPERTY_EDITLINEAMOUNT, editLineAmount);
    }

    /**
     * @see InvoiceLine#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public BigDecimal getTaxableAmount() {
        return (BigDecimal) get(PROPERTY_TAXABLEAMOUNT);
    }
    /**
     * @see InvoiceLine#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        set(PROPERTY_TAXABLEAMOUNT, taxableAmount);
    }

    /**
     * @see InvoiceLine#PROPERTY_GROSSAMOUNT
     * 
     */
    public BigDecimal getGrossAmount() {
        return (BigDecimal) get(PROPERTY_GROSSAMOUNT);
    }
    /**
     * @see InvoiceLine#PROPERTY_GROSSAMOUNT
     * 
     */
    public void setGrossAmount(BigDecimal grossAmount) {
        set(PROPERTY_GROSSAMOUNT, grossAmount);
    }

    /**
     * @see InvoiceLine#PROPERTY_GROSSUNITPRICE
     * 
     */
    public BigDecimal getGrossUnitPrice() {
        return (BigDecimal) get(PROPERTY_GROSSUNITPRICE);
    }
    /**
     * @see InvoiceLine#PROPERTY_GROSSUNITPRICE
     * 
     */
    public void setGrossUnitPrice(BigDecimal grossUnitPrice) {
        set(PROPERTY_GROSSUNITPRICE, grossUnitPrice);
    }

    /**
     * @see InvoiceLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see InvoiceLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see InvoiceLine#PROPERTY_PERIODNUMBER
     * 
     */
    public Long getPeriodNumber() {
        return (Long) get(PROPERTY_PERIODNUMBER);
    }
    /**
     * @see InvoiceLine#PROPERTY_PERIODNUMBER
     * 
     */
    public void setPeriodNumber(Long periodNumber) {
        set(PROPERTY_PERIODNUMBER, periodNumber);
    }

    /**
     * @see InvoiceLine#PROPERTY_BASEGROSSUNITPRICE
     * 
     */
    public BigDecimal getBaseGrossUnitPrice() {
        return (BigDecimal) get(PROPERTY_BASEGROSSUNITPRICE);
    }
    /**
     * @see InvoiceLine#PROPERTY_BASEGROSSUNITPRICE
     * 
     */
    public void setBaseGrossUnitPrice(BigDecimal baseGrossUnitPrice) {
        set(PROPERTY_BASEGROSSUNITPRICE, baseGrossUnitPrice);
    }

    /**
     * @see InvoiceLine#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see InvoiceLine#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see InvoiceLine#PROPERTY_DEFERREDPLANTYPE
     * 
     */
    public String getDeferredPlanType() {
        return (String) get(PROPERTY_DEFERREDPLANTYPE);
    }
    /**
     * @see InvoiceLine#PROPERTY_DEFERREDPLANTYPE
     * 
     */
    public void setDeferredPlanType(String deferredPlanType) {
        set(PROPERTY_DEFERREDPLANTYPE, deferredPlanType);
    }

    /**
     * @see InvoiceLine#PROPERTY_GROSSLISTPRICE
     * 
     */
    public BigDecimal getGrossListPrice() {
        return (BigDecimal) get(PROPERTY_GROSSLISTPRICE);
    }
    /**
     * @see InvoiceLine#PROPERTY_GROSSLISTPRICE
     * 
     */
    public void setGrossListPrice(BigDecimal grossListPrice) {
        set(PROPERTY_GROSSLISTPRICE, grossListPrice);
    }

    /**
     * @see InvoiceLine#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see InvoiceLine#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see InvoiceLine#PROPERTY_DEFERRED
     * 
     */
    public Boolean isDeferred() {
        return (Boolean) get(PROPERTY_DEFERRED);
    }
    /**
     * @see InvoiceLine#PROPERTY_DEFERRED
     * 
     */
    public void setDeferred(Boolean deferred) {
        set(PROPERTY_DEFERRED, deferred);
    }

    /**
     * @see InvoiceLine#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see InvoiceLine#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    /**
     * @see InvoiceLine#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see InvoiceLine#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see InvoiceLine#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see InvoiceLine#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see InvoiceLine#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see InvoiceLine#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see InvoiceLine#PROPERTY_EXPLODE
     * 
     */
    public Boolean isExplode() {
        return (Boolean) get(PROPERTY_EXPLODE);
    }
    /**
     * @see InvoiceLine#PROPERTY_EXPLODE
     * 
     */
    public void setExplode(Boolean explode) {
        set(PROPERTY_EXPLODE, explode);
    }

    /**
     * @see InvoiceLine#PROPERTY_BOMPARENT
     * 
     */
    public InvoiceLine getBOMParent() {
        return (InvoiceLine) get(PROPERTY_BOMPARENT);
    }
    /**
     * @see InvoiceLine#PROPERTY_BOMPARENT
     * 
     */
    public void setBOMParent(InvoiceLine bOMParent) {
        set(PROPERTY_BOMPARENT, bOMParent);
    }

    /**
     * @see InvoiceLine#PROPERTY_MATCHLCCOSTS
     * 
     */
    public Boolean isMatchLCCosts() {
        return (Boolean) get(PROPERTY_MATCHLCCOSTS);
    }
    /**
     * @see InvoiceLine#PROPERTY_MATCHLCCOSTS
     * 
     */
    public void setMatchLCCosts(Boolean matchLCCosts) {
        set(PROPERTY_MATCHLCCOSTS, matchLCCosts);
    }

    /**
     * @see InvoiceLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public UOM getOperativeUOM() {
        return (UOM) get(PROPERTY_OPERATIVEUOM);
    }
    /**
     * @see InvoiceLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public void setOperativeUOM(UOM operativeUOM) {
        set(PROPERTY_OPERATIVEUOM, operativeUOM);
    }

    /**
     * @see InvoiceLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public BigDecimal getOperativeQuantity() {
        return (BigDecimal) get(PROPERTY_OPERATIVEQUANTITY);
    }
    /**
     * @see InvoiceLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public void setOperativeQuantity(BigDecimal operativeQuantity) {
        set(PROPERTY_OPERATIVEQUANTITY, operativeQuantity);
    }

    /**
     * @see InvoiceLine#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see InvoiceLine#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceLine> getInvoiceLineBOMParentIDList() {
      return (List<InvoiceLine>) get(PROPERTY_INVOICELINEBOMPARENTIDLIST);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    public void setInvoiceLineBOMParentIDList(List<InvoiceLine> invoiceLineBOMParentIDList) {
        set(PROPERTY_INVOICELINEBOMPARENTIDLIST, invoiceLineBOMParentIDList);
    }

    /**
     * Help: {@literal Accounting dimension}<br>
     * @see InvoiceLineAccountingDimension
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceLineAccountingDimension> getInvoiceLineAccountingDimensionList() {
      return (List<InvoiceLineAccountingDimension>) get(PROPERTY_INVOICELINEACCOUNTINGDIMENSIONLIST);
    }

    /**
     * Help: {@literal Accounting dimension}<br>
     * @see InvoiceLineAccountingDimension
     * 
     */
    public void setInvoiceLineAccountingDimensionList(List<InvoiceLineAccountingDimension> invoiceLineAccountingDimensionList) {
        set(PROPERTY_INVOICELINEACCOUNTINGDIMENSIONLIST, invoiceLineAccountingDimensionList);
    }

    /**
     * Help: {@literal Contains all the offers applies to an invoice line.}<br>
     * @see InvoiceLineOffer
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceLineOffer> getInvoiceLineOfferList() {
      return (List<InvoiceLineOffer>) get(PROPERTY_INVOICELINEOFFERLIST);
    }

    /**
     * Help: {@literal Contains all the offers applies to an invoice line.}<br>
     * @see InvoiceLineOffer
     * 
     */
    public void setInvoiceLineOfferList(List<InvoiceLineOffer> invoiceLineOfferList) {
        set(PROPERTY_INVOICELINEOFFERLIST, invoiceLineOfferList);
    }

    /**
     * Help: {@literal Contains the taxes related to the invoice line.}<br>
     * @see InvoiceLineTax
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceLineTax> getInvoiceLineTaxList() {
      return (List<InvoiceLineTax>) get(PROPERTY_INVOICELINETAXLIST);
    }

    /**
     * Help: {@literal Contains the taxes related to the invoice line.}<br>
     * @see InvoiceLineTax
     * 
     */
    public void setInvoiceLineTaxList(List<InvoiceLineTax> invoiceLineTaxList) {
        set(PROPERTY_INVOICELINETAXLIST, invoiceLineTaxList);
    }

    /**
     * @see LandedCostCost
     * 
     */
    @SuppressWarnings("unchecked")
    public List<LandedCostCost> getLandedCostCostList() {
      return (List<LandedCostCost>) get(PROPERTY_LANDEDCOSTCOSTLIST);
    }

    /**
     * @see LandedCostCost
     * 
     */
    public void setLandedCostCostList(List<LandedCostCost> landedCostCostList) {
        set(PROPERTY_LANDEDCOSTCOSTLIST, landedCostCostList);
    }

    /**
     * @see LCMatched
     * 
     */
    @SuppressWarnings("unchecked")
    public List<LCMatched> getLandedCostMatchedList() {
      return (List<LCMatched>) get(PROPERTY_LANDEDCOSTMATCHEDLIST);
    }

    /**
     * @see LCMatched
     * 
     */
    public void setLandedCostMatchedList(List<LCMatched> landedCostMatchedList) {
        set(PROPERTY_LANDEDCOSTMATCHEDLIST, landedCostMatchedList);
    }

    /**
     * Help: {@literal This table contains all the matches between the order lines and:
     *       1. With the material
     *       receipt lines. For each order line we can have one or more materials receipt lines. The result of
     *       the sum of all the material receipt lines have to match with their own order line in order to be
     *       able to say that the order line has been already receipt.
     *       2. With the invoice line. For each order
     *       line we can have one or more invoices lines. The result of the sum of all the invoices lines have to
     *       much with their own order line in order to be able to say that the order line has been already
     *       invoiced}<br>
     * @see POInvoiceMatch
     * 
     */
    @SuppressWarnings("unchecked")
    public List<POInvoiceMatch> getProcurementPOInvoiceMatchList() {
      return (List<POInvoiceMatch>) get(PROPERTY_PROCUREMENTPOINVOICEMATCHLIST);
    }

    /**
     * Help: {@literal This table contains all the matches between the order lines and:
     *       1. With the material
     *       receipt lines. For each order line we can have one or more materials receipt lines. The result of
     *       the sum of all the material receipt lines have to match with their own order line in order to be
     *       able to say that the order line has been already receipt.
     *       2. With the invoice line. For each order
     *       line we can have one or more invoices lines. The result of the sum of all the invoices lines have to
     *       much with their own order line in order to be able to say that the order line has been already
     *       invoiced}<br>
     * @see POInvoiceMatch
     * 
     */
    public void setProcurementPOInvoiceMatchList(List<POInvoiceMatch> procurementPOInvoiceMatchList) {
        set(PROPERTY_PROCUREMENTPOINVOICEMATCHLIST, procurementPOInvoiceMatchList);
    }

    /**
     * Help: {@literal This table contains all the matches between the material receipt lines and the invoice
     *       lines. It is used only for the purchase transactions. For each material receipt line we can have one
     *       or more invoice lines, so the sum of the invoice lines has to match with the amount on the material
     *       receipt line. When everything matches it means the material receipt line is already invoiced}<br>
     * @see ReceiptInvoiceMatch
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReceiptInvoiceMatch> getProcurementReceiptInvoiceMatchList() {
      return (List<ReceiptInvoiceMatch>) get(PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST);
    }

    /**
     * Help: {@literal This table contains all the matches between the material receipt lines and the invoice
     *       lines. It is used only for the purchase transactions. For each material receipt line we can have one
     *       or more invoice lines, so the sum of the invoice lines has to match with the amount on the material
     *       receipt line. When everything matches it means the material receipt line is already invoiced}<br>
     * @see ReceiptInvoiceMatch
     * 
     */
    public void setProcurementReceiptInvoiceMatchList(List<ReceiptInvoiceMatch> procurementReceiptInvoiceMatchList) {
        set(PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST, procurementReceiptInvoiceMatchList);
    }

    /**
     * Help: {@literal You may alter the amount and quantity of the detail records, but the suggested way is to
     *       add new correcting lines. The amounts are converted from the transaction currency to the Commission
     *       Currency (defined in the Commission window)}<br>
     * @see CommissionDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CommissionDetail> getSalesCommissionDetailList() {
      return (List<CommissionDetail>) get(PROPERTY_SALESCOMMISSIONDETAILLIST);
    }

    /**
     * Help: {@literal You may alter the amount and quantity of the detail records, but the suggested way is to
     *       add new correcting lines. The amounts are converted from the transaction currency to the Commission
     *       Currency (defined in the Commission window)}<br>
     * @see CommissionDetail
     * 
     */
    public void setSalesCommissionDetailList(List<CommissionDetail> salesCommissionDetailList) {
        set(PROPERTY_SALESCOMMISSIONDETAILLIST, salesCommissionDetailList);
    }

}
