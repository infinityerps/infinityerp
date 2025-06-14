
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
package org.openbravo.model.common.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.OrderLineTax;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.enterprise.WarehouseRule;
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.financialmgmt.tax.TaxRate;
import org.openbravo.model.materialmgmt.onhandquantity.Reservation;
import org.openbravo.model.materialmgmt.onhandquantity.ReservationStock;
import org.openbravo.model.materialmgmt.transaction.ShipmentInOutLine;
import org.openbravo.model.mrp.ProductionRunLine;
import org.openbravo.model.mrp.PurchasingRunLine;
import org.openbravo.model.pricing.priceadjustment.PriceAdjustment;
import org.openbravo.model.procurement.POInvoiceMatch;
import org.openbravo.model.procurement.RequisitionPOMatch;
import org.openbravo.model.project.Project;
import org.openbravo.model.shipping.ShippingCompany;
import org.openbravo.model.timeandexpense.ResourceAssignment;
/**
 * Entity class for entity OrderLine (stored in table C_OrderLine).
 * <br>
 * Help: {@literal The table defines the individual line items that comprise an Order}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrderLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_OrderLine";
    public static final String ENTITY_NAME = "OrderLine";

    /**
     * Property id stored in column C_OrderLine_ID in table C_OrderLine<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_OrderLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_OrderLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_OrderLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_OrderLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_OrderLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_OrderLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_OrderLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property salesOrder stored in column C_Order_ID in table C_OrderLine<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property lineNo stored in column Line in table C_OrderLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_OrderLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table C_OrderLine<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property orderDate stored in column DateOrdered in table C_OrderLine<br>
     * Help: {@literal Indicates the Date an item was ordered.}
     * 
     */
    public static final String PROPERTY_ORDERDATE = "orderDate";

    /**
     * Property scheduledDeliveryDate stored in column DatePromised in table C_OrderLine<br>
     * Help: {@literal Scheduled Delivery Date indicates the date, if any, that an order was promised by.}
     * 
     */
    public static final String PROPERTY_SCHEDULEDDELIVERYDATE = "scheduledDeliveryDate";

    /**
     * Property dateDelivered stored in column DateDelivered in table C_OrderLine<br>
     * Help: {@literal Date when the product was delivered}
     * 
     */
    public static final String PROPERTY_DATEDELIVERED = "dateDelivered";

    /**
     * Property invoiceDate stored in column DateInvoiced in table C_OrderLine<br>
     * Help: {@literal The Date Invoice indicates the date printed on the invoice.}
     * 
     */
    public static final String PROPERTY_INVOICEDATE = "invoiceDate";

    /**
     * Property description stored in column Description in table C_OrderLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property product stored in column M_Product_ID in table C_OrderLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table C_OrderLine<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property directShipment stored in column DirectShip in table C_OrderLine<br>
     * Help: {@literal Direct Shipment indicates if this line will ship directly from the vendor to the customer}
     * 
     */
    public static final String PROPERTY_DIRECTSHIPMENT = "directShipment";

    /**
     * Property uOM stored in column C_UOM_ID in table C_OrderLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property orderedQuantity stored in column QtyOrdered in table C_OrderLine<br>
     * Help: {@literal The Ordered Quantity indicates the quantity of a product that was ordered.}
     * 
     */
    public static final String PROPERTY_ORDEREDQUANTITY = "orderedQuantity";

    /**
     * Property reservedQuantity stored in column QtyReserved in table C_OrderLine<br>
     * Help: {@literal The Reserved Quantity indicates the quantity of a product that is currently reserved for
     *       this order.}
     * 
     */
    public static final String PROPERTY_RESERVEDQUANTITY = "reservedQuantity";

    /**
     * Property deliveredQuantity stored in column QtyDelivered in table C_OrderLine<br>
     * Help: {@literal The Delivered Quantity indicates the quantity of a product that has already been
     *       delivered.}
     * 
     */
    public static final String PROPERTY_DELIVEREDQUANTITY = "deliveredQuantity";

    /**
     * Property invoicedQuantity stored in column QtyInvoiced in table C_OrderLine<br>
     * Help: {@literal The Invoiced Quantity indicates the quantity of a product that have been invoiced.}
     * 
     */
    public static final String PROPERTY_INVOICEDQUANTITY = "invoicedQuantity";

    /**
     * Property shippingCompany stored in column M_Shipper_ID in table C_OrderLine<br>
     * Help: {@literal The Shipper is any entity which will provide shipping to or shipping from an
     *       Organization.}
     * 
     */
    public static final String PROPERTY_SHIPPINGCOMPANY = "shippingCompany";

    /**
     * Property currency stored in column C_Currency_ID in table C_OrderLine<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property listPrice stored in column PriceList in table C_OrderLine<br>
     * Help: {@literal The Net List Price is the official price stated by the selected pricelist and the currency
     *       of the document.}
     * 
     */
    public static final String PROPERTY_LISTPRICE = "listPrice";

    /**
     * Property unitPrice stored in column PriceActual in table C_OrderLine<br>
     * Help: {@literal The actual price indicates the price for a product in source currency.}
     * 
     */
    public static final String PROPERTY_UNITPRICE = "unitPrice";

    /**
     * Property priceLimit stored in column PriceLimit in table C_OrderLine<br>
     * Help: {@literal The Net Price Limit indicates the lowest price for a product stated in the Price List
     *       Currency.}
     * 
     */
    public static final String PROPERTY_PRICELIMIT = "priceLimit";

    /**
     * Property lineNetAmount stored in column LineNetAmt in table C_OrderLine 
     * 
     */
    public static final String PROPERTY_LINENETAMOUNT = "lineNetAmount";

    /**
     * Property discount stored in column Discount in table C_OrderLine<br>
     * Help: {@literal The Discount indicates the discount applied or taken as a percentage.}
     * 
     */
    public static final String PROPERTY_DISCOUNT = "discount";

    /**
     * Property freightAmount stored in column FreightAmt in table C_OrderLine<br>
     * Help: {@literal The Freight Amount indicates the amount charged for Freight in the document currency.}
     * 
     */
    public static final String PROPERTY_FREIGHTAMOUNT = "freightAmount";

    /**
     * Property charge stored in column C_Charge_ID in table C_OrderLine<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property chargeAmount stored in column ChargeAmt in table C_OrderLine<br>
     * Help: {@literal The Charge Amount indicates the amount for an additional charge.}
     * 
     */
    public static final String PROPERTY_CHARGEAMOUNT = "chargeAmount";

    /**
     * Property tax stored in column C_Tax_ID in table C_OrderLine<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property resourceAssignment stored in column S_ResourceAssignment_ID in table C_OrderLine<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_RESOURCEASSIGNMENT = "resourceAssignment";

    /**
     * Property sOPOReference stored in column Ref_OrderLine_ID in table C_OrderLine<br>
     * Help: {@literal Reference of the Sales Order Line to the corresponding Purchase Order Line or vice versa.}
     * 
     */
    public static final String PROPERTY_SOPOREFERENCE = "sOPOReference";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table C_OrderLine<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property descriptionOnly stored in column IsDescription in table C_OrderLine<br>
     * Help: {@literal If a line is Description Only, e.g. Product Inventory is not corrected. No accounting
     *       transactions are created and the amount or totals are not included in the document.  This for
     *       including descriptional detail lines, e.g. for an Work Order.}
     * 
     */
    public static final String PROPERTY_DESCRIPTIONONLY = "descriptionOnly";

    /**
     * Property orderQuantity stored in column QuantityOrder in table C_OrderLine<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table C_OrderLine<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property priceAdjustment stored in column M_Offer_ID in table C_OrderLine<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENT = "priceAdjustment";

    /**
     * Property standardPrice stored in column PriceStd in table C_OrderLine<br>
     * Help: {@literal Net unit price before applying this promotion. In case multiple promotions are applied in
     *       cascade, this price is the one after applying all promotions with more priority than current
     *       one.
     *       
     *       This field is populated in case the used price list does not include taxes.}
     * 
     */
    public static final String PROPERTY_STANDARDPRICE = "standardPrice";

    /**
     * Property cancelPriceAdjustment stored in column CANCELPRICEAD in table C_OrderLine<br>
     * Help: {@literal If the user wants not to apply promotions to a specific line, he should use this check to
     *       achieve it}
     * 
     */
    public static final String PROPERTY_CANCELPRICEADJUSTMENT = "cancelPriceAdjustment";

    /**
     * Property orderDiscount stored in column C_Order_Discount_ID in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERDISCOUNT = "orderDiscount";

    /**
     * Property editLineAmount stored in column Iseditlinenetamt in table C_OrderLine<br>
     * Help: {@literal A flag used to allow the end-user to edit Line Net Amount field.}
     * 
     */
    public static final String PROPERTY_EDITLINEAMOUNT = "editLineAmount";

    /**
     * Property taxableAmount stored in column Taxbaseamt in table C_OrderLine<br>
     * Help: {@literal The Tax Base Amount indicates the base amount used for calculating the tax amount.}
     * 
     */
    public static final String PROPERTY_TAXABLEAMOUNT = "taxableAmount";

    /**
     * Property goodsShipmentLine stored in column M_Inoutline_ID in table C_OrderLine<br>
     * Help: {@literal The Goods Shipment Line indicates a unique line in a Shipment document}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENTLINE = "goodsShipmentLine";

    /**
     * Property returnReason stored in column C_Return_Reason_ID in table C_OrderLine
     * 
     */
    public static final String PROPERTY_RETURNREASON = "returnReason";

    /**
     * Property grossUnitPrice stored in column Gross_Unit_Price in table C_OrderLine<br>
     * Help: {@literal This is the price that is provided when the price is inclusive of taxes. }
     * 
     */
    public static final String PROPERTY_GROSSUNITPRICE = "grossUnitPrice";

    /**
     * Property lineGrossAmount stored in column Line_Gross_Amount in table C_OrderLine<br>
     * Help: {@literal This is the total amount against a line ( i.e product price * quantity + taxes ) }
     * 
     */
    public static final String PROPERTY_LINEGROSSAMOUNT = "lineGrossAmount";

    /**
     * Property grossListPrice stored in column GrossPriceList in table C_OrderLine<br>
     * Help: {@literal The Gross List Price is the official price stated by the selected tax included pricelist
     *       and the currency of the document.}
     * 
     */
    public static final String PROPERTY_GROSSLISTPRICE = "grossListPrice";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table C_OrderLine<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property baseGrossUnitPrice stored in column grosspricestd in table C_OrderLine
     * 
     */
    public static final String PROPERTY_BASEGROSSUNITPRICE = "baseGrossUnitPrice";

    /**
     * Property asset stored in column A_Asset_ID in table C_OrderLine<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property warehouseRule stored in column M_Warehouse_Rule_ID in table C_OrderLine<br>
     * Help: {@literal Definition of a Warehouse Rule to be applied when getting stock from the warehouse.}
     * 
     */
    public static final String PROPERTY_WAREHOUSERULE = "warehouseRule";

    /**
     * Property stDimension stored in column User1_ID in table C_OrderLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property quotationLine stored in column Quotationline_ID in table C_OrderLine
     * 
     */
    public static final String PROPERTY_QUOTATIONLINE = "quotationLine";

    /**
     * Property ndDimension stored in column User2_ID in table C_OrderLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property createReservation stored in column Create_Reservation in table C_OrderLine<br>
     * Help: {@literal Determines if a reservation must be done when the sales order is processed.}
     * 
     */
    public static final String PROPERTY_CREATERESERVATION = "createReservation";

    /**
     * Property project stored in column C_Project_ID in table C_OrderLine<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property reservationStatus stored in column SO_Res_Status in table C_OrderLine<br>
     * Help: {@literal Identifies if the Sales Order is completely or partially reserved}
     * 
     */
    public static final String PROPERTY_RESERVATIONSTATUS = "reservationStatus";

    /**
     * Property manageReservation stored in column Manage_Reservation in table C_OrderLine
     * 
     */
    public static final String PROPERTY_MANAGERESERVATION = "manageReservation";

    /**
     * Property managePrereservation stored in column Manage_Prereservation in table C_OrderLine
     * 
     */
    public static final String PROPERTY_MANAGEPRERESERVATION = "managePrereservation";

    /**
     * Property explode stored in column Explode in table C_OrderLine<br>
     * Help: {@literal Explode the BOM product}
     * 
     */
    public static final String PROPERTY_EXPLODE = "explode";

    /**
     * Property bOMParent stored in column BOM_Parent_ID in table C_OrderLine
     * 
     */
    public static final String PROPERTY_BOMPARENT = "bOMParent";

    /**
     * Property printDescription stored in column Print_Description in table C_OrderLine<br>
     * Help: {@literal If selected, the ticket footer printing should add the description of the Service}
     * 
     */
    public static final String PROPERTY_PRINTDESCRIPTION = "printDescription";

    /**
     * Property overdueReturnDays stored in column Overdue_Return_Days in table C_OrderLine<br>
     * Help: {@literal Indicates if a Service is Returnable how many days has the customer to return it after
     *       buying}
     * 
     */
    public static final String PROPERTY_OVERDUERETURNDAYS = "overdueReturnDays";

    /**
     * Property selectOrderLine stored in column Relate_Orderline in table C_OrderLine
     * 
     */
    public static final String PROPERTY_SELECTORDERLINE = "selectOrderLine";

    /**
     * Property replacedorderline stored in column Replacedorderline_id in table C_OrderLine<br>
     * Help: {@literal Link to the Order that has been replaced}
     * 
     */
    public static final String PROPERTY_REPLACEDORDERLINE = "replacedorderline";

    /**
     * Property operativeUOM stored in column C_Aum in table C_OrderLine<br>
     * Help: {@literal The Alternative UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_OPERATIVEUOM = "operativeUOM";

    /**
     * Property operativeQuantity stored in column Aumqty in table C_OrderLine<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_OPERATIVEQUANTITY = "operativeQuantity";

    /**
     * Property returnline stored in column Returnline in table C_OrderLine<br>
     * Help: {@literal Identifies a return order line}
     * 
     */
    public static final String PROPERTY_RETURNLINE = "returnline";

    /**
     * Property salesRepresentative stored in column Salesrep_ID in table C_OrderLine<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property invoiceLineList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_INVOICELINELIST = "invoiceLineList";

    /**
     * Property mRPProductionRunLineList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_MRPPRODUCTIONRUNLINELIST = "mRPProductionRunLineList";

    /**
     * Property mRPPurchasingRunLineList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_MRPPURCHASINGRUNLINELIST = "mRPPurchasingRunLineList";

    /**
     * Property materialMgmtReservationList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTRESERVATIONLIST = "materialMgmtReservationList";

    /**
     * Property materialMgmtReservationStockList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST = "materialMgmtReservationStockList";

    /**
     * Property materialMgmtShipmentInOutLineList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST = "materialMgmtShipmentInOutLineList";

    /**
     * Property orderLineSOPOReferenceList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINESOPOREFERENCELIST = "orderLineSOPOReferenceList";

    /**
     * Property orderLineQuotationLineList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINEQUOTATIONLINELIST = "orderLineQuotationLineList";

    /**
     * Property orderLineBOMParentIDList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINEBOMPARENTIDLIST = "orderLineBOMParentIDList";

    /**
     * Property orderLineReplacedorderlineList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINEREPLACEDORDERLINELIST = "orderLineReplacedorderlineList";

    /**
     * Property orderLineAccountingDimensionList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST = "orderLineAccountingDimensionList";

    /**
     * Property orderLineOfferList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINEOFFERLIST = "orderLineOfferList";

    /**
     * Property orderLineTaxList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINETAXLIST = "orderLineTaxList";

    /**
     * Property orderlineServiceRelationList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINESERVICERELATIONLIST = "orderlineServiceRelationList";

    /**
     * Property orderlineServiceRelationCOrderlineRelatedIDList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_ORDERLINESERVICERELATIONCORDERLINERELATEDIDLIST = "orderlineServiceRelationCOrderlineRelatedIDList";

    /**
     * Property procurementPOInvoiceMatchList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_PROCUREMENTPOINVOICEMATCHLIST = "procurementPOInvoiceMatchList";

    /**
     * Property procurementRequisitionPOMatchList stored in table C_OrderLine
     * 
     */
    public static final String PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST = "procurementRequisitionPOMatchList";


    public OrderLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DIRECTSHIPMENT, false);
        setDefaultValue(PROPERTY_ORDEREDQUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_DISCOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CHARGEAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_DESCRIPTIONONLY, false);
        setDefaultValue(PROPERTY_STANDARDPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_CANCELPRICEADJUSTMENT, false);
        setDefaultValue(PROPERTY_EDITLINEAMOUNT, false);
        setDefaultValue(PROPERTY_GROSSUNITPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_LINEGROSSAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_BASEGROSSUNITPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_MANAGERESERVATION, false);
        setDefaultValue(PROPERTY_MANAGEPRERESERVATION, false);
        setDefaultValue(PROPERTY_EXPLODE, false);
        setDefaultValue(PROPERTY_PRINTDESCRIPTION, false);
        setDefaultValue(PROPERTY_SELECTORDERLINE, false);
        setDefaultValue(PROPERTY_INVOICELINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MRPPRODUCTIONRUNLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MRPPURCHASINGRUNLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTRESERVATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINESOPOREFERENCELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINEQUOTATIONLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINEBOMPARENTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINEREPLACEDORDERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINEOFFERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINETAXLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINESERVICERELATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINESERVICERELATIONCORDERLINERELATEDIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTPOINVOICEMATCHLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OrderLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OrderLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OrderLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OrderLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OrderLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OrderLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OrderLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OrderLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OrderLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OrderLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OrderLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OrderLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OrderLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OrderLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OrderLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OrderLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OrderLine#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see OrderLine#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see OrderLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see OrderLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see OrderLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see OrderLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see OrderLine#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see OrderLine#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see OrderLine#PROPERTY_ORDERDATE
     * 
     */
    public Date getOrderDate() {
        return (Date) get(PROPERTY_ORDERDATE);
    }
    /**
     * @see OrderLine#PROPERTY_ORDERDATE
     * 
     */
    public void setOrderDate(Date orderDate) {
        set(PROPERTY_ORDERDATE, orderDate);
    }

    /**
     * @see OrderLine#PROPERTY_SCHEDULEDDELIVERYDATE
     * 
     */
    public Date getScheduledDeliveryDate() {
        return (Date) get(PROPERTY_SCHEDULEDDELIVERYDATE);
    }
    /**
     * @see OrderLine#PROPERTY_SCHEDULEDDELIVERYDATE
     * 
     */
    public void setScheduledDeliveryDate(Date scheduledDeliveryDate) {
        set(PROPERTY_SCHEDULEDDELIVERYDATE, scheduledDeliveryDate);
    }

    /**
     * @see OrderLine#PROPERTY_DATEDELIVERED
     * 
     */
    public Date getDateDelivered() {
        return (Date) get(PROPERTY_DATEDELIVERED);
    }
    /**
     * @see OrderLine#PROPERTY_DATEDELIVERED
     * 
     */
    public void setDateDelivered(Date dateDelivered) {
        set(PROPERTY_DATEDELIVERED, dateDelivered);
    }

    /**
     * @see OrderLine#PROPERTY_INVOICEDATE
     * 
     */
    public Date getInvoiceDate() {
        return (Date) get(PROPERTY_INVOICEDATE);
    }
    /**
     * @see OrderLine#PROPERTY_INVOICEDATE
     * 
     */
    public void setInvoiceDate(Date invoiceDate) {
        set(PROPERTY_INVOICEDATE, invoiceDate);
    }

    /**
     * @see OrderLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see OrderLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see OrderLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see OrderLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see OrderLine#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see OrderLine#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see OrderLine#PROPERTY_DIRECTSHIPMENT
     * 
     */
    public Boolean isDirectShipment() {
        return (Boolean) get(PROPERTY_DIRECTSHIPMENT);
    }
    /**
     * @see OrderLine#PROPERTY_DIRECTSHIPMENT
     * 
     */
    public void setDirectShipment(Boolean directShipment) {
        set(PROPERTY_DIRECTSHIPMENT, directShipment);
    }

    /**
     * @see OrderLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see OrderLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see OrderLine#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public BigDecimal getOrderedQuantity() {
        return (BigDecimal) get(PROPERTY_ORDEREDQUANTITY);
    }
    /**
     * @see OrderLine#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public void setOrderedQuantity(BigDecimal orderedQuantity) {
        set(PROPERTY_ORDEREDQUANTITY, orderedQuantity);
    }

    /**
     * @see OrderLine#PROPERTY_RESERVEDQUANTITY
     * 
     */
    public BigDecimal getReservedQuantity() {
        return (BigDecimal) get(PROPERTY_RESERVEDQUANTITY);
    }
    /**
     * @see OrderLine#PROPERTY_RESERVEDQUANTITY
     * 
     */
    public void setReservedQuantity(BigDecimal reservedQuantity) {
        set(PROPERTY_RESERVEDQUANTITY, reservedQuantity);
    }

    /**
     * @see OrderLine#PROPERTY_DELIVEREDQUANTITY
     * 
     */
    public BigDecimal getDeliveredQuantity() {
        return (BigDecimal) get(PROPERTY_DELIVEREDQUANTITY);
    }
    /**
     * @see OrderLine#PROPERTY_DELIVEREDQUANTITY
     * 
     */
    public void setDeliveredQuantity(BigDecimal deliveredQuantity) {
        set(PROPERTY_DELIVEREDQUANTITY, deliveredQuantity);
    }

    /**
     * @see OrderLine#PROPERTY_INVOICEDQUANTITY
     * 
     */
    public BigDecimal getInvoicedQuantity() {
        return (BigDecimal) get(PROPERTY_INVOICEDQUANTITY);
    }
    /**
     * @see OrderLine#PROPERTY_INVOICEDQUANTITY
     * 
     */
    public void setInvoicedQuantity(BigDecimal invoicedQuantity) {
        set(PROPERTY_INVOICEDQUANTITY, invoicedQuantity);
    }

    /**
     * @see OrderLine#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public ShippingCompany getShippingCompany() {
        return (ShippingCompany) get(PROPERTY_SHIPPINGCOMPANY);
    }
    /**
     * @see OrderLine#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public void setShippingCompany(ShippingCompany shippingCompany) {
        set(PROPERTY_SHIPPINGCOMPANY, shippingCompany);
    }

    /**
     * @see OrderLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see OrderLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see OrderLine#PROPERTY_LISTPRICE
     * 
     */
    public BigDecimal getListPrice() {
        return (BigDecimal) get(PROPERTY_LISTPRICE);
    }
    /**
     * @see OrderLine#PROPERTY_LISTPRICE
     * 
     */
    public void setListPrice(BigDecimal listPrice) {
        set(PROPERTY_LISTPRICE, listPrice);
    }

    /**
     * @see OrderLine#PROPERTY_UNITPRICE
     * 
     */
    public BigDecimal getUnitPrice() {
        return (BigDecimal) get(PROPERTY_UNITPRICE);
    }
    /**
     * @see OrderLine#PROPERTY_UNITPRICE
     * 
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        set(PROPERTY_UNITPRICE, unitPrice);
    }

    /**
     * @see OrderLine#PROPERTY_PRICELIMIT
     * 
     */
    public BigDecimal getPriceLimit() {
        return (BigDecimal) get(PROPERTY_PRICELIMIT);
    }
    /**
     * @see OrderLine#PROPERTY_PRICELIMIT
     * 
     */
    public void setPriceLimit(BigDecimal priceLimit) {
        set(PROPERTY_PRICELIMIT, priceLimit);
    }

    /**
     * @see OrderLine#PROPERTY_LINENETAMOUNT
     * 
     */
    public BigDecimal getLineNetAmount() {
        return (BigDecimal) get(PROPERTY_LINENETAMOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_LINENETAMOUNT
     * 
     */
    public void setLineNetAmount(BigDecimal lineNetAmount) {
        set(PROPERTY_LINENETAMOUNT, lineNetAmount);
    }

    /**
     * @see OrderLine#PROPERTY_DISCOUNT
     * 
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) get(PROPERTY_DISCOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_DISCOUNT
     * 
     */
    public void setDiscount(BigDecimal discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    /**
     * @see OrderLine#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public BigDecimal getFreightAmount() {
        return (BigDecimal) get(PROPERTY_FREIGHTAMOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        set(PROPERTY_FREIGHTAMOUNT, freightAmount);
    }

    /**
     * @see OrderLine#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see OrderLine#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see OrderLine#PROPERTY_CHARGEAMOUNT
     * 
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEAMOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_CHARGEAMOUNT
     * 
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        set(PROPERTY_CHARGEAMOUNT, chargeAmount);
    }

    /**
     * @see OrderLine#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see OrderLine#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see OrderLine#PROPERTY_RESOURCEASSIGNMENT
     * 
     */
    public ResourceAssignment getResourceAssignment() {
        return (ResourceAssignment) get(PROPERTY_RESOURCEASSIGNMENT);
    }
    /**
     * @see OrderLine#PROPERTY_RESOURCEASSIGNMENT
     * 
     */
    public void setResourceAssignment(ResourceAssignment resourceAssignment) {
        set(PROPERTY_RESOURCEASSIGNMENT, resourceAssignment);
    }

    /**
     * @see OrderLine#PROPERTY_SOPOREFERENCE
     * 
     */
    public OrderLine getSOPOReference() {
        return (OrderLine) get(PROPERTY_SOPOREFERENCE);
    }
    /**
     * @see OrderLine#PROPERTY_SOPOREFERENCE
     * 
     */
    public void setSOPOReference(OrderLine sOPOReference) {
        set(PROPERTY_SOPOREFERENCE, sOPOReference);
    }

    /**
     * @see OrderLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see OrderLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see OrderLine#PROPERTY_DESCRIPTIONONLY
     * 
     */
    public Boolean isDescriptionOnly() {
        return (Boolean) get(PROPERTY_DESCRIPTIONONLY);
    }
    /**
     * @see OrderLine#PROPERTY_DESCRIPTIONONLY
     * 
     */
    public void setDescriptionOnly(Boolean descriptionOnly) {
        set(PROPERTY_DESCRIPTIONONLY, descriptionOnly);
    }

    /**
     * @see OrderLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see OrderLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see OrderLine#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see OrderLine#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see OrderLine#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public PriceAdjustment getPriceAdjustment() {
        return (PriceAdjustment) get(PROPERTY_PRICEADJUSTMENT);
    }
    /**
     * @see OrderLine#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
        set(PROPERTY_PRICEADJUSTMENT, priceAdjustment);
    }

    /**
     * @see OrderLine#PROPERTY_STANDARDPRICE
     * 
     */
    public BigDecimal getStandardPrice() {
        return (BigDecimal) get(PROPERTY_STANDARDPRICE);
    }
    /**
     * @see OrderLine#PROPERTY_STANDARDPRICE
     * 
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        set(PROPERTY_STANDARDPRICE, standardPrice);
    }

    /**
     * @see OrderLine#PROPERTY_CANCELPRICEADJUSTMENT
     * 
     */
    public Boolean isCancelPriceAdjustment() {
        return (Boolean) get(PROPERTY_CANCELPRICEADJUSTMENT);
    }
    /**
     * @see OrderLine#PROPERTY_CANCELPRICEADJUSTMENT
     * 
     */
    public void setCancelPriceAdjustment(Boolean cancelPriceAdjustment) {
        set(PROPERTY_CANCELPRICEADJUSTMENT, cancelPriceAdjustment);
    }

    /**
     * @see OrderLine#PROPERTY_ORDERDISCOUNT
     * 
     */
    public OrderDiscount getOrderDiscount() {
        return (OrderDiscount) get(PROPERTY_ORDERDISCOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_ORDERDISCOUNT
     * 
     */
    public void setOrderDiscount(OrderDiscount orderDiscount) {
        set(PROPERTY_ORDERDISCOUNT, orderDiscount);
    }

    /**
     * @see OrderLine#PROPERTY_EDITLINEAMOUNT
     * 
     */
    public Boolean isEditLineAmount() {
        return (Boolean) get(PROPERTY_EDITLINEAMOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_EDITLINEAMOUNT
     * 
     */
    public void setEditLineAmount(Boolean editLineAmount) {
        set(PROPERTY_EDITLINEAMOUNT, editLineAmount);
    }

    /**
     * @see OrderLine#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public BigDecimal getTaxableAmount() {
        return (BigDecimal) get(PROPERTY_TAXABLEAMOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        set(PROPERTY_TAXABLEAMOUNT, taxableAmount);
    }

    /**
     * @see OrderLine#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public ShipmentInOutLine getGoodsShipmentLine() {
        return (ShipmentInOutLine) get(PROPERTY_GOODSSHIPMENTLINE);
    }
    /**
     * @see OrderLine#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public void setGoodsShipmentLine(ShipmentInOutLine goodsShipmentLine) {
        set(PROPERTY_GOODSSHIPMENTLINE, goodsShipmentLine);
    }

    /**
     * @see OrderLine#PROPERTY_RETURNREASON
     * 
     */
    public ReturnReason getReturnReason() {
        return (ReturnReason) get(PROPERTY_RETURNREASON);
    }
    /**
     * @see OrderLine#PROPERTY_RETURNREASON
     * 
     */
    public void setReturnReason(ReturnReason returnReason) {
        set(PROPERTY_RETURNREASON, returnReason);
    }

    /**
     * @see OrderLine#PROPERTY_GROSSUNITPRICE
     * 
     */
    public BigDecimal getGrossUnitPrice() {
        return (BigDecimal) get(PROPERTY_GROSSUNITPRICE);
    }
    /**
     * @see OrderLine#PROPERTY_GROSSUNITPRICE
     * 
     */
    public void setGrossUnitPrice(BigDecimal grossUnitPrice) {
        set(PROPERTY_GROSSUNITPRICE, grossUnitPrice);
    }

    /**
     * @see OrderLine#PROPERTY_LINEGROSSAMOUNT
     * 
     */
    public BigDecimal getLineGrossAmount() {
        return (BigDecimal) get(PROPERTY_LINEGROSSAMOUNT);
    }
    /**
     * @see OrderLine#PROPERTY_LINEGROSSAMOUNT
     * 
     */
    public void setLineGrossAmount(BigDecimal lineGrossAmount) {
        set(PROPERTY_LINEGROSSAMOUNT, lineGrossAmount);
    }

    /**
     * @see OrderLine#PROPERTY_GROSSLISTPRICE
     * 
     */
    public BigDecimal getGrossListPrice() {
        return (BigDecimal) get(PROPERTY_GROSSLISTPRICE);
    }
    /**
     * @see OrderLine#PROPERTY_GROSSLISTPRICE
     * 
     */
    public void setGrossListPrice(BigDecimal grossListPrice) {
        set(PROPERTY_GROSSLISTPRICE, grossListPrice);
    }

    /**
     * @see OrderLine#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see OrderLine#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see OrderLine#PROPERTY_BASEGROSSUNITPRICE
     * 
     */
    public BigDecimal getBaseGrossUnitPrice() {
        return (BigDecimal) get(PROPERTY_BASEGROSSUNITPRICE);
    }
    /**
     * @see OrderLine#PROPERTY_BASEGROSSUNITPRICE
     * 
     */
    public void setBaseGrossUnitPrice(BigDecimal baseGrossUnitPrice) {
        set(PROPERTY_BASEGROSSUNITPRICE, baseGrossUnitPrice);
    }

    /**
     * @see OrderLine#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see OrderLine#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see OrderLine#PROPERTY_WAREHOUSERULE
     * 
     */
    public WarehouseRule getWarehouseRule() {
        return (WarehouseRule) get(PROPERTY_WAREHOUSERULE);
    }
    /**
     * @see OrderLine#PROPERTY_WAREHOUSERULE
     * 
     */
    public void setWarehouseRule(WarehouseRule warehouseRule) {
        set(PROPERTY_WAREHOUSERULE, warehouseRule);
    }

    /**
     * @see OrderLine#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see OrderLine#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see OrderLine#PROPERTY_QUOTATIONLINE
     * 
     */
    public OrderLine getQuotationLine() {
        return (OrderLine) get(PROPERTY_QUOTATIONLINE);
    }
    /**
     * @see OrderLine#PROPERTY_QUOTATIONLINE
     * 
     */
    public void setQuotationLine(OrderLine quotationLine) {
        set(PROPERTY_QUOTATIONLINE, quotationLine);
    }

    /**
     * @see OrderLine#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see OrderLine#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see OrderLine#PROPERTY_CREATERESERVATION
     * 
     */
    public String getCreateReservation() {
        return (String) get(PROPERTY_CREATERESERVATION);
    }
    /**
     * @see OrderLine#PROPERTY_CREATERESERVATION
     * 
     */
    public void setCreateReservation(String createReservation) {
        set(PROPERTY_CREATERESERVATION, createReservation);
    }

    /**
     * @see OrderLine#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see OrderLine#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see OrderLine#PROPERTY_RESERVATIONSTATUS
     * 
     */
    public String getReservationStatus() {
        return (String) get(PROPERTY_RESERVATIONSTATUS);
    }
    /**
     * @see OrderLine#PROPERTY_RESERVATIONSTATUS
     * 
     */
    public void setReservationStatus(String reservationStatus) {
        set(PROPERTY_RESERVATIONSTATUS, reservationStatus);
    }

    /**
     * @see OrderLine#PROPERTY_MANAGERESERVATION
     * 
     */
    public Boolean isManageReservation() {
        return (Boolean) get(PROPERTY_MANAGERESERVATION);
    }
    /**
     * @see OrderLine#PROPERTY_MANAGERESERVATION
     * 
     */
    public void setManageReservation(Boolean manageReservation) {
        set(PROPERTY_MANAGERESERVATION, manageReservation);
    }

    /**
     * @see OrderLine#PROPERTY_MANAGEPRERESERVATION
     * 
     */
    public Boolean isManagePrereservation() {
        return (Boolean) get(PROPERTY_MANAGEPRERESERVATION);
    }
    /**
     * @see OrderLine#PROPERTY_MANAGEPRERESERVATION
     * 
     */
    public void setManagePrereservation(Boolean managePrereservation) {
        set(PROPERTY_MANAGEPRERESERVATION, managePrereservation);
    }

    /**
     * @see OrderLine#PROPERTY_EXPLODE
     * 
     */
    public Boolean isExplode() {
        return (Boolean) get(PROPERTY_EXPLODE);
    }
    /**
     * @see OrderLine#PROPERTY_EXPLODE
     * 
     */
    public void setExplode(Boolean explode) {
        set(PROPERTY_EXPLODE, explode);
    }

    /**
     * @see OrderLine#PROPERTY_BOMPARENT
     * 
     */
    public OrderLine getBOMParent() {
        return (OrderLine) get(PROPERTY_BOMPARENT);
    }
    /**
     * @see OrderLine#PROPERTY_BOMPARENT
     * 
     */
    public void setBOMParent(OrderLine bOMParent) {
        set(PROPERTY_BOMPARENT, bOMParent);
    }

    /**
     * @see OrderLine#PROPERTY_PRINTDESCRIPTION
     * 
     */
    public Boolean isPrintDescription() {
        return (Boolean) get(PROPERTY_PRINTDESCRIPTION);
    }
    /**
     * @see OrderLine#PROPERTY_PRINTDESCRIPTION
     * 
     */
    public void setPrintDescription(Boolean printDescription) {
        set(PROPERTY_PRINTDESCRIPTION, printDescription);
    }

    /**
     * @see OrderLine#PROPERTY_OVERDUERETURNDAYS
     * 
     */
    public Long getOverdueReturnDays() {
        return (Long) get(PROPERTY_OVERDUERETURNDAYS);
    }
    /**
     * @see OrderLine#PROPERTY_OVERDUERETURNDAYS
     * 
     */
    public void setOverdueReturnDays(Long overdueReturnDays) {
        set(PROPERTY_OVERDUERETURNDAYS, overdueReturnDays);
    }

    /**
     * @see OrderLine#PROPERTY_SELECTORDERLINE
     * 
     */
    public Boolean isSelectOrderLine() {
        return (Boolean) get(PROPERTY_SELECTORDERLINE);
    }
    /**
     * @see OrderLine#PROPERTY_SELECTORDERLINE
     * 
     */
    public void setSelectOrderLine(Boolean selectOrderLine) {
        set(PROPERTY_SELECTORDERLINE, selectOrderLine);
    }

    /**
     * @see OrderLine#PROPERTY_REPLACEDORDERLINE
     * 
     */
    public OrderLine getReplacedorderline() {
        return (OrderLine) get(PROPERTY_REPLACEDORDERLINE);
    }
    /**
     * @see OrderLine#PROPERTY_REPLACEDORDERLINE
     * 
     */
    public void setReplacedorderline(OrderLine replacedorderline) {
        set(PROPERTY_REPLACEDORDERLINE, replacedorderline);
    }

    /**
     * @see OrderLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public UOM getOperativeUOM() {
        return (UOM) get(PROPERTY_OPERATIVEUOM);
    }
    /**
     * @see OrderLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public void setOperativeUOM(UOM operativeUOM) {
        set(PROPERTY_OPERATIVEUOM, operativeUOM);
    }

    /**
     * @see OrderLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public BigDecimal getOperativeQuantity() {
        return (BigDecimal) get(PROPERTY_OPERATIVEQUANTITY);
    }
    /**
     * @see OrderLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public void setOperativeQuantity(BigDecimal operativeQuantity) {
        set(PROPERTY_OPERATIVEQUANTITY, operativeQuantity);
    }

    /**
     * @see OrderLine#PROPERTY_RETURNLINE
     * 
     */
    public String getReturnline() {
        return (String) get(PROPERTY_RETURNLINE);
    }
    /**
     * @see OrderLine#PROPERTY_RETURNLINE
     * 
     */
    public void setReturnline(String returnline) {
        set(PROPERTY_RETURNLINE, returnline);
    }

    /**
     * @see OrderLine#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see OrderLine#PROPERTY_SALESREPRESENTATIVE
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
    public List<InvoiceLine> getInvoiceLineList() {
      return (List<InvoiceLine>) get(PROPERTY_INVOICELINELIST);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    public void setInvoiceLineList(List<InvoiceLine> invoiceLineList) {
        set(PROPERTY_INVOICELINELIST, invoiceLineList);
    }

    /**
     * Help: {@literal Lines of the production planning processes.}<br>
     * @see ProductionRunLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductionRunLine> getMRPProductionRunLineList() {
      return (List<ProductionRunLine>) get(PROPERTY_MRPPRODUCTIONRUNLINELIST);
    }

    /**
     * Help: {@literal Lines of the production planning processes.}<br>
     * @see ProductionRunLine
     * 
     */
    public void setMRPProductionRunLineList(List<ProductionRunLine> mRPProductionRunLineList) {
        set(PROPERTY_MRPPRODUCTIONRUNLINELIST, mRPProductionRunLineList);
    }

    /**
     * Help: {@literal Lines of the purchase planning processes.}<br>
     * @see PurchasingRunLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PurchasingRunLine> getMRPPurchasingRunLineList() {
      return (List<PurchasingRunLine>) get(PROPERTY_MRPPURCHASINGRUNLINELIST);
    }

    /**
     * Help: {@literal Lines of the purchase planning processes.}<br>
     * @see PurchasingRunLine
     * 
     */
    public void setMRPPurchasingRunLineList(List<PurchasingRunLine> mRPPurchasingRunLineList) {
        set(PROPERTY_MRPPURCHASINGRUNLINELIST, mRPPurchasingRunLineList);
    }

    /**
     * @see Reservation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Reservation> getMaterialMgmtReservationList() {
      return (List<Reservation>) get(PROPERTY_MATERIALMGMTRESERVATIONLIST);
    }

    /**
     * @see Reservation
     * 
     */
    public void setMaterialMgmtReservationList(List<Reservation> materialMgmtReservationList) {
        set(PROPERTY_MATERIALMGMTRESERVATIONLIST, materialMgmtReservationList);
    }

    /**
     * @see ReservationStock
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReservationStock> getMaterialMgmtReservationStockList() {
      return (List<ReservationStock>) get(PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST);
    }

    /**
     * @see ReservationStock
     * 
     */
    public void setMaterialMgmtReservationStockList(List<ReservationStock> materialMgmtReservationStockList) {
        set(PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST, materialMgmtReservationStockList);
    }

    /**
     * Help: {@literal The table defines the individual line that comprise shipment line}<br>
     * @see ShipmentInOutLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ShipmentInOutLine> getMaterialMgmtShipmentInOutLineList() {
      return (List<ShipmentInOutLine>) get(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line that comprise shipment line}<br>
     * @see ShipmentInOutLine
     * 
     */
    public void setMaterialMgmtShipmentInOutLineList(List<ShipmentInOutLine> materialMgmtShipmentInOutLineList) {
        set(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST, materialMgmtShipmentInOutLineList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineSOPOReferenceList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINESOPOREFERENCELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineSOPOReferenceList(List<OrderLine> orderLineSOPOReferenceList) {
        set(PROPERTY_ORDERLINESOPOREFERENCELIST, orderLineSOPOReferenceList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineQuotationLineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINEQUOTATIONLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineQuotationLineList(List<OrderLine> orderLineQuotationLineList) {
        set(PROPERTY_ORDERLINEQUOTATIONLINELIST, orderLineQuotationLineList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineBOMParentIDList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINEBOMPARENTIDLIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineBOMParentIDList(List<OrderLine> orderLineBOMParentIDList) {
        set(PROPERTY_ORDERLINEBOMPARENTIDLIST, orderLineBOMParentIDList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineReplacedorderlineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINEREPLACEDORDERLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineReplacedorderlineList(List<OrderLine> orderLineReplacedorderlineList) {
        set(PROPERTY_ORDERLINEREPLACEDORDERLINELIST, orderLineReplacedorderlineList);
    }

    /**
     * Help: {@literal Accounting dimension}<br>
     * @see OrderLineAccountingDimension
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLineAccountingDimension> getOrderLineAccountingDimensionList() {
      return (List<OrderLineAccountingDimension>) get(PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST);
    }

    /**
     * Help: {@literal Accounting dimension}<br>
     * @see OrderLineAccountingDimension
     * 
     */
    public void setOrderLineAccountingDimensionList(List<OrderLineAccountingDimension> orderLineAccountingDimensionList) {
        set(PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST, orderLineAccountingDimensionList);
    }

    /**
     * @see OrderLineOffer
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLineOffer> getOrderLineOfferList() {
      return (List<OrderLineOffer>) get(PROPERTY_ORDERLINEOFFERLIST);
    }

    /**
     * @see OrderLineOffer
     * 
     */
    public void setOrderLineOfferList(List<OrderLineOffer> orderLineOfferList) {
        set(PROPERTY_ORDERLINEOFFERLIST, orderLineOfferList);
    }

    /**
     * Help: {@literal The table contains the tax amount for an Order line.}<br>
     * @see OrderLineTax
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLineTax> getOrderLineTaxList() {
      return (List<OrderLineTax>) get(PROPERTY_ORDERLINETAXLIST);
    }

    /**
     * Help: {@literal The table contains the tax amount for an Order line.}<br>
     * @see OrderLineTax
     * 
     */
    public void setOrderLineTaxList(List<OrderLineTax> orderLineTaxList) {
        set(PROPERTY_ORDERLINETAXLIST, orderLineTaxList);
    }

    /**
     * Help: {@literal In this table the Order Lines related to an Order Line of 'Service' type are added}<br>
     * @see OrderlineServiceRelation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderlineServiceRelation> getOrderlineServiceRelationList() {
      return (List<OrderlineServiceRelation>) get(PROPERTY_ORDERLINESERVICERELATIONLIST);
    }

    /**
     * Help: {@literal In this table the Order Lines related to an Order Line of 'Service' type are added}<br>
     * @see OrderlineServiceRelation
     * 
     */
    public void setOrderlineServiceRelationList(List<OrderlineServiceRelation> orderlineServiceRelationList) {
        set(PROPERTY_ORDERLINESERVICERELATIONLIST, orderlineServiceRelationList);
    }

    /**
     * Help: {@literal In this table the Order Lines related to an Order Line of 'Service' type are added}<br>
     * @see OrderlineServiceRelation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderlineServiceRelation> getOrderlineServiceRelationCOrderlineRelatedIDList() {
      return (List<OrderlineServiceRelation>) get(PROPERTY_ORDERLINESERVICERELATIONCORDERLINERELATEDIDLIST);
    }

    /**
     * Help: {@literal In this table the Order Lines related to an Order Line of 'Service' type are added}<br>
     * @see OrderlineServiceRelation
     * 
     */
    public void setOrderlineServiceRelationCOrderlineRelatedIDList(List<OrderlineServiceRelation> orderlineServiceRelationCOrderlineRelatedIDList) {
        set(PROPERTY_ORDERLINESERVICERELATIONCORDERLINERELATEDIDLIST, orderlineServiceRelationCOrderlineRelatedIDList);
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
     * Help: {@literal This table matches the Requisition lines with the Purchase Orders that satisfy them.}<br>
     * @see RequisitionPOMatch
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RequisitionPOMatch> getProcurementRequisitionPOMatchList() {
      return (List<RequisitionPOMatch>) get(PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST);
    }

    /**
     * Help: {@literal This table matches the Requisition lines with the Purchase Orders that satisfy them.}<br>
     * @see RequisitionPOMatch
     * 
     */
    public void setProcurementRequisitionPOMatchList(List<RequisitionPOMatch> procurementRequisitionPOMatchList) {
        set(PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST, procurementRequisitionPOMatchList);
    }

}
