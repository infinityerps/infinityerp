
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
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedInvV;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedOrdV;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedule;
import org.openbravo.model.financialmgmt.payment.Incoterms;
import org.openbravo.model.financialmgmt.payment.PaymentPriority;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.materialmgmt.transaction.ShipmentInOut;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.model.project.Project;
import org.openbravo.model.project.ProjectLine;
import org.openbravo.model.project.ProjectPhase;
import org.openbravo.model.shipping.ShippingCompany;
/**
 * Entity class for entity Order (stored in table C_Order).
 * <br>
 * Help: {@literal Table where there are all the orders. The purchase orders and the sales orders.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Order extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Order";
    public static final String ENTITY_NAME = "Order";

    /**
     * Property id stored in column C_Order_ID in table C_Order<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Order 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Order 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Order 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Order 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Order 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Order 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Order 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property salesTransaction stored in column IsSOTrx in table C_Order<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property documentNo stored in column DocumentNo in table C_Order 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property documentStatus stored in column DocStatus in table C_Order<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property documentAction stored in column DocAction in table C_Order<br>
     * Help: {@literal 
     *       You find the current status in the Document Status field. The options are listed in a
     *       popup}
     * 
     */
    public static final String PROPERTY_DOCUMENTACTION = "documentAction";

    /**
     * Property processNow stored in column Processing in table C_Order<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_Order<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property documentType stored in column C_DocType_ID in table C_Order<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property transactionDocument stored in column C_DocTypeTarget_ID in table C_Order<br>
     * Help: {@literal Specifies document subtype (eg. POS Order, Return Material, etc.) that each document (such
     *       as Sales Invoice, Purchase Order, etc.). Various document subtypes usually differ on the
     *       consequences they have. You can convert document types (e.g. from Offer to Order).  The conversion
     *       is then reflected in the current type.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDOCUMENT = "transactionDocument";

    /**
     * Property description stored in column Description in table C_Order<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property delivered stored in column IsDelivered in table C_Order
     * 
     */
    public static final String PROPERTY_DELIVERED = "delivered";

    /**
     * Property reinvoice stored in column IsInvoiced in table C_Order<br>
     * Help: {@literal Indicator if invoiced}
     * 
     */
    public static final String PROPERTY_REINVOICE = "reinvoice";

    /**
     * Property print stored in column IsPrinted in table C_Order<br>
     * Help: {@literal The Printed checkbox indicates if this document or line will included when printing.}
     * 
     */
    public static final String PROPERTY_PRINT = "print";

    /**
     * Property selected stored in column IsSelected in table C_Order
     * 
     */
    public static final String PROPERTY_SELECTED = "selected";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table C_Order<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property orderDate stored in column DateOrdered in table C_Order 
     * 
     */
    public static final String PROPERTY_ORDERDATE = "orderDate";

    /**
     * Property scheduledDeliveryDate stored in column DatePromised in table C_Order<br>
     * Help: {@literal Scheduled Delivery Date indicates the date, if any, that an order was promised by.}
     * 
     */
    public static final String PROPERTY_SCHEDULEDDELIVERYDATE = "scheduledDeliveryDate";

    /**
     * Property datePrinted stored in column DatePrinted in table C_Order<br>
     * Help: {@literal Indicates the Date that a document was printed.}
     * 
     */
    public static final String PROPERTY_DATEPRINTED = "datePrinted";

    /**
     * Property accountingDate stored in column DateAcct in table C_Order<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Order<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property invoiceAddress stored in column BillTo_ID in table C_Order<br>
     * Help: {@literal An indication of the address to use in the invoice.<br />}
     * 
     */
    public static final String PROPERTY_INVOICEADDRESS = "invoiceAddress";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table C_Order<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property orderReference stored in column POReference in table C_Order<br>
     * Help: {@literal This can be used to input a reference for this specific transaction. For example, a
     *       Purchase Order number can be input on a Sales Order for easier reference.}
     * 
     */
    public static final String PROPERTY_ORDERREFERENCE = "orderReference";

    /**
     * Property printDiscount stored in column IsDiscountPrinted in table C_Order<br>
     * Help: {@literal The Discount Printed Checkbox indicates if the discount will be printed on the document.}
     * 
     */
    public static final String PROPERTY_PRINTDISCOUNT = "printDiscount";

    /**
     * Property currency stored in column C_Currency_ID in table C_Order<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_Order<br>
     * Help: {@literal Form of Payment indicates the method of payment used for this transaction (eg. cash, wire
     *       transfer, etc.)}
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_Order<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property invoiceTerms stored in column InvoiceRule in table C_Order<br>
     * Help: {@literal The Invoice Rule defines how a Business Partner is invoiced and the frequency of
     *       invoicing.}
     * 
     */
    public static final String PROPERTY_INVOICETERMS = "invoiceTerms";

    /**
     * Property deliveryTerms stored in column DeliveryRule in table C_Order<br>
     * Help: {@literal The Delivery Rule indicates when an order should be delivered. For example should the
     *       order be delivered when the entire order is complete, when a line is complete or as the products
     *       become available.}
     * 
     */
    public static final String PROPERTY_DELIVERYTERMS = "deliveryTerms";

    /**
     * Property freightCostRule stored in column FreightCostRule in table C_Order<br>
     * Help: {@literal The Freight Cost Rule indicates the method used when charging for freight.}
     * 
     */
    public static final String PROPERTY_FREIGHTCOSTRULE = "freightCostRule";

    /**
     * Property freightAmount stored in column FreightAmt in table C_Order<br>
     * Help: {@literal The Freight Amount indicates the amount charged for Freight in the document currency.}
     * 
     */
    public static final String PROPERTY_FREIGHTAMOUNT = "freightAmount";

    /**
     * Property deliveryMethod stored in column DeliveryViaRule in table C_Order<br>
     * Help: {@literal The Delivery Via indicates how the products should be delivered. For example, will the
     *       order be picked up or shipped.}
     * 
     */
    public static final String PROPERTY_DELIVERYMETHOD = "deliveryMethod";

    /**
     * Property shippingCompany stored in column M_Shipper_ID in table C_Order<br>
     * Help: {@literal The Shipper is any entity which will provide shipping to or shipping from an
     *       Organization.}
     * 
     */
    public static final String PROPERTY_SHIPPINGCOMPANY = "shippingCompany";

    /**
     * Property charge stored in column C_Charge_ID in table C_Order<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property chargeAmount stored in column ChargeAmt in table C_Order<br>
     * Help: {@literal The Charge Amount indicates the amount for an additional charge.}
     * 
     */
    public static final String PROPERTY_CHARGEAMOUNT = "chargeAmount";

    /**
     * Property priority stored in column PriorityRule in table C_Order<br>
     * Help: {@literal The Priority indicates the importance (high, medium, low) of this document}
     * 
     */
    public static final String PROPERTY_PRIORITY = "priority";

    /**
     * Property summedLineAmount stored in column TotalLines in table C_Order<br>
     * Help: {@literal The Total amount displays the total of all lines in document currency}
     * 
     */
    public static final String PROPERTY_SUMMEDLINEAMOUNT = "summedLineAmount";

    /**
     * Property grandTotalAmount stored in column GrandTotal in table C_Order 
     * 
     */
    public static final String PROPERTY_GRANDTOTALAMOUNT = "grandTotalAmount";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table C_Order<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property priceList stored in column M_PriceList_ID in table C_Order<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property priceIncludesTax stored in column IsTaxIncluded in table C_Order<br>
     * Help: {@literal The Tax Included checkbox indicates if the prices include tax.  This is also known as the
     *       gross price.}
     * 
     */
    public static final String PROPERTY_PRICEINCLUDESTAX = "priceIncludesTax";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_Order<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table C_Order<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property activity stored in column C_Activity_ID in table C_Order<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property posted stored in column Posted in table C_Order<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property userContact stored in column AD_User_ID in table C_Order<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property copyFrom stored in column CopyFrom in table C_Order<br>
     * Help: {@literal Copy lines (products) from another document of the same type.}
     * 
     */
    public static final String PROPERTY_COPYFROM = "copyFrom";

    /**
     * Property dropShipPartner stored in column DropShip_BPartner_ID in table C_Order<br>
     * Help: {@literal Business Partner for Drop Shipment}
     * 
     */
    public static final String PROPERTY_DROPSHIPPARTNER = "dropShipPartner";

    /**
     * Property dropShipLocation stored in column DropShip_Location_ID in table C_Order<br>
     * Help: {@literal Business Partner Shipment Location for Drop Shipment}
     * 
     */
    public static final String PROPERTY_DROPSHIPLOCATION = "dropShipLocation";

    /**
     * Property dropShipContact stored in column DropShip_User_ID in table C_Order<br>
     * Help: {@literal Business Partner Contact for Drop Shipment}
     * 
     */
    public static final String PROPERTY_DROPSHIPCONTACT = "dropShipContact";

    /**
     * Property selfService stored in column IsSelfService in table C_Order<br>
     * Help: {@literal Self-Service allows users to enter data or update their data.  The flag indicates, that
     *       this record was entered or created via Self-Service or that the user can change it via the
     *       Self-Service functionality.}
     * 
     */
    public static final String PROPERTY_SELFSERVICE = "selfService";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table C_Order<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property stDimension stored in column User1_ID in table C_Order<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table C_Order<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property deliveryNotes stored in column Deliverynotes in table C_Order<br>
     * Help: {@literal Notes for the delivery}
     * 
     */
    public static final String PROPERTY_DELIVERYNOTES = "deliveryNotes";

    /**
     * Property incoterms stored in column C_Incoterms_ID in table C_Order<br>
     * Help: {@literal The ID identifies a unique Incoterm}
     * 
     */
    public static final String PROPERTY_INCOTERMS = "incoterms";

    /**
     * Property iNCOTERMSDescription stored in column Incotermsdescription in table C_Order<br>
     * Help: {@literal Description of the incoterm}
     * 
     */
    public static final String PROPERTY_INCOTERMSDESCRIPTION = "iNCOTERMSDescription";

    /**
     * Property generateTemplate stored in column Generatetemplate in table C_Order<br>
     * Help: {@literal A button that copies the products that are defined as template in the business partner
     *       window}
     * 
     */
    public static final String PROPERTY_GENERATETEMPLATE = "generateTemplate";

    /**
     * Property deliveryLocation stored in column Delivery_Location_ID in table C_Order<br>
     * Help: {@literal Location where the product will be delivered to}
     * 
     */
    public static final String PROPERTY_DELIVERYLOCATION = "deliveryLocation";

    /**
     * Property copyFromPO stored in column CopyFromPO in table C_Order<br>
     * Help: {@literal Copy lines from orders}
     * 
     */
    public static final String PROPERTY_COPYFROMPO = "copyFromPO";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table C_Order
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property fINPaymentPriority stored in column FIN_Payment_Priority_ID in table C_Order<br>
     * Help: {@literal Sets the priority of the payment plans generated when processing the invoice or order.
     *       The
     *       distribution algorithm will be driven by this priority. The pending payments for order or payments
     *       will be displayed ordered by the payment priority first and then by the due date.}
     * 
     */
    public static final String PROPERTY_FINPAYMENTPRIORITY = "fINPaymentPriority";

    /**
     * Property pickFromShipment stored in column RM_PickFromShipment in table C_Order
     * 
     */
    public static final String PROPERTY_PICKFROMSHIPMENT = "pickFromShipment";

    /**
     * Property receiveMaterials stored in column RM_ReceiveMaterials in table C_Order
     * 
     */
    public static final String PROPERTY_RECEIVEMATERIALS = "receiveMaterials";

    /**
     * Property createInvoice stored in column RM_CreateInvoice in table C_Order
     * 
     */
    public static final String PROPERTY_CREATEINVOICE = "createInvoice";

    /**
     * Property returnReason stored in column C_Return_Reason_ID in table C_Order
     * 
     */
    public static final String PROPERTY_RETURNREASON = "returnReason";

    /**
     * Property addOrphanLine stored in column RM_AddOrphanLine in table C_Order
     * 
     */
    public static final String PROPERTY_ADDORPHANLINE = "addOrphanLine";

    /**
     * Property asset stored in column A_Asset_ID in table C_Order<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property calculatePromotions stored in column Calculate_Promotions in table C_Order
     * 
     */
    public static final String PROPERTY_CALCULATEPROMOTIONS = "calculatePromotions";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table C_Order<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property createOrder stored in column Convertquotation in table C_Order
     * 
     */
    public static final String PROPERTY_CREATEORDER = "createOrder";

    /**
     * Property rejectReason stored in column C_Reject_Reason_ID in table C_Order
     * 
     */
    public static final String PROPERTY_REJECTREASON = "rejectReason";

    /**
     * Property validUntil stored in column validuntil in table C_Order
     * 
     */
    public static final String PROPERTY_VALIDUNTIL = "validUntil";

    /**
     * Property quotation stored in column Quotation_ID in table C_Order
     * 
     */
    public static final String PROPERTY_QUOTATION = "quotation";

    /**
     * Property reservationStatus stored in column SO_Res_Status in table C_Order<br>
     * Help: {@literal Identifies if the Sales Order is completely or partially reserved}
     * 
     */
    public static final String PROPERTY_RESERVATIONSTATUS = "reservationStatus";

    /**
     * Property createPOLines stored in column Create_POLines in table C_Order
     * 
     */
    public static final String PROPERTY_CREATEPOLINES = "createPOLines";

    /**
     * Property cashVAT stored in column Iscashvat in table C_Order<br>
     * Help: {@literal Cash VAT tax rate}
     * 
     */
    public static final String PROPERTY_CASHVAT = "cashVAT";

    /**
     * Property pickfromreceipt stored in column RM_Pickfromreceipt in table C_Order
     * 
     */
    public static final String PROPERTY_PICKFROMRECEIPT = "pickfromreceipt";

    /**
     * Property cancelandreplace stored in column Cancelandreplace in table C_Order<br>
     * Help: {@literal Button that creates a temporal duplicated order}
     * 
     */
    public static final String PROPERTY_CANCELANDREPLACE = "cancelandreplace";

    /**
     * Property aPRMAddPayment stored in column EM_APRM_AddPayment in table C_Order<br>
     * Help: {@literal Launches a process to add a payment to the selected invoice.}
     * 
     */
    public static final String PROPERTY_APRMADDPAYMENT = "aPRMAddPayment";

    /**
     * Property confirmcancelandreplace stored in column Confirmcancelandreplace in table C_Order<br>
     * Help: {@literal Button that confirms the temporal Order by closing it and creates a canceled order}
     * 
     */
    public static final String PROPERTY_CONFIRMCANCELANDREPLACE = "confirmcancelandreplace";

    /**
     * Property cancelledorder stored in column Cancelledorder_id in table C_Order<br>
     * Help: {@literal Link to the order that has been canceled}
     * 
     */
    public static final String PROPERTY_CANCELLEDORDER = "cancelledorder";

    /**
     * Property replacedorder stored in column Replacedorder_id in table C_Order<br>
     * Help: {@literal Link to the order that has been replaced}
     * 
     */
    public static final String PROPERTY_REPLACEDORDER = "replacedorder";

    /**
     * Property iscancelled stored in column Iscancelled in table C_Order<br>
     * Help: {@literal The Sales Order has been canceled and canceled and replaced. A new Cancellation Sales
     *       Order has been created in Closed Status and if it is replaced also a new Sales Order in Book Status
     *       has been created replacing the original one.}
     * 
     */
    public static final String PROPERTY_ISCANCELLED = "iscancelled";

    /**
     * Property replacementorder stored in column Replacementorder_ID in table C_Order<br>
     * Help: {@literal Link to the replacement order. This order is the order that has replaced the current
     *       Cancelled order.}
     * 
     */
    public static final String PROPERTY_REPLACEMENTORDER = "replacementorder";

    /**
     * Property externalBusinessPartnerReference stored in column BPartner_ExtRef in table C_Order<br>
     * Help: {@literal This field stores the business partner reference to an external CRM system. This is useful
     *       only when the business partner management is done outside Openbravo. In this case Openbravo will
     *       internally use the anonymous customer but it will track the real customer in the external system
     *       through this field.}
     * 
     */
    public static final String PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE = "externalBusinessPartnerReference";

    /**
     * Property alternateLocation stored in column C_Alternate_Location_ID in table C_Order<br>
     * Help: {@literal Different delivery location where to deliver the order. This location does not have to be
     *       part of business partner locations. Used just once, so no need to store it as part of the business
     *       partner locations.}
     * 
     */
    public static final String PROPERTY_ALTERNATELOCATION = "alternateLocation";

    /**
     * Property invoiceAlternateLoc stored in column C_Invoice_Alternate_Loc_ID in table C_Order<br>
     * Help: {@literal Different invoice location where the order will be invoiced}
     * 
     */
    public static final String PROPERTY_INVOICEALTERNATELOC = "invoiceAlternateLoc";




    /**
     * Property _computedColumns stored in column _computedColumns in table C_Order
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property fINPaymentSchedInvVList stored in table C_Order
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDINVVLIST = "fINPaymentSchedInvVList";

    /**
     * Property fINPaymentSchedOrdVList stored in table C_Order
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDORDVLIST = "fINPaymentSchedOrdVList";

    /**
     * Property fINPaymentScheduleList stored in table C_Order
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULELIST = "fINPaymentScheduleList";

    /**
     * Property invoiceList stored in table C_Order
     * 
     */
    public static final String PROPERTY_INVOICELIST = "invoiceList";

    /**
     * Property materialMgmtShipmentInOutList stored in table C_Order
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSHIPMENTINOUTLIST = "materialMgmtShipmentInOutList";

    /**
     * Property orderQuotationList stored in table C_Order
     * 
     */
    public static final String PROPERTY_ORDERQUOTATIONLIST = "orderQuotationList";

    /**
     * Property orderCancelledorderList stored in table C_Order
     * 
     */
    public static final String PROPERTY_ORDERCANCELLEDORDERLIST = "orderCancelledorderList";

    /**
     * Property orderDiscountList stored in table C_Order
     * 
     */
    public static final String PROPERTY_ORDERDISCOUNTLIST = "orderDiscountList";

    /**
     * Property orderLineList stored in table C_Order
     * 
     */
    public static final String PROPERTY_ORDERLINELIST = "orderLineList";

    /**
     * Property orderLineTaxList stored in table C_Order
     * 
     */
    public static final String PROPERTY_ORDERLINETAXLIST = "orderLineTaxList";

    /**
     * Property orderTaxList stored in table C_Order
     * 
     */
    public static final String PROPERTY_ORDERTAXLIST = "orderTaxList";

    /**
     * Property projectLineList stored in table C_Order
     * 
     */
    public static final String PROPERTY_PROJECTLINELIST = "projectLineList";

    /**
     * Property projectLinePurchaseOrderList stored in table C_Order
     * 
     */
    public static final String PROPERTY_PROJECTLINEPURCHASEORDERLIST = "projectLinePurchaseOrderList";

    /**
     * Property projectPhaseList stored in table C_Order
     * 
     */
    public static final String PROPERTY_PROJECTPHASELIST = "projectPhaseList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property deliveryStatus<br>
     * <br>
     * Computed from: <br>
     * {@code (coalesce((select case when sum(abs(ol.qtyordered)) = 0 or iscancelled = 'Y' or cancelledorder_id is
       not null then 0 else 
       round(coalesce(sum(abs(ol.qtydelivered)), 0)/sum(abs(ol.qtyordered)) * 100, 0)
       end 
       from c_orderline ol where ol.c_order_id=c_order_id and ol.c_order_discount_id is null),0))}
     */
    public static final String COMPUTED_COLUMN_DELIVERYSTATUS = "deliveryStatus";

    /**
     * Computed column for property invoiceStatus<br>
     * <br>
     * Computed from: <br>
     * {@code (coalesce((select case when sum(abs(ol.qtyordered)) = 0 or iscancelled = 'Y' or cancelledorder_id is
       not null then 0 else 
       round(coalesce(sum(abs(ol.qtyinvoiced)), 0)/sum(abs(ol.qtyordered)) * 100, 0) 
       end 
       from c_orderline ol   where ol.c_order_id=c_order_id and  ol.c_order_discount_id is null), 0))}
     */
    public static final String COMPUTED_COLUMN_INVOICESTATUS = "invoiceStatus";

    /**
     * Computed column for property paymentStatus<br>
     * 
     * Help: {@literal Percent paid of the order}<br>
     * Computed from: <br>
     * {@code (coalesce((select case
        when sum(fps.amount) = 0 then 0
        else round(sum(fps.paidamt)/sum(fps.amount)
       * 100, 0) end
       from FIN_Payment_Schedule fps where fps.c_order_id=c_order_id),0))}
     */
    public static final String COMPUTED_COLUMN_PAYMENTSTATUS = "paymentStatus";

    public Order() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DOCUMENTSTATUS, "DR");
        setDefaultValue(PROPERTY_DOCUMENTACTION, "CO");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_DELIVERED, false);
        setDefaultValue(PROPERTY_REINVOICE, false);
        setDefaultValue(PROPERTY_PRINT, false);
        setDefaultValue(PROPERTY_SELECTED, false);
        setDefaultValue(PROPERTY_PRINTDISCOUNT, false);
        setDefaultValue(PROPERTY_FORMOFPAYMENT, "B");
        setDefaultValue(PROPERTY_INVOICETERMS, "D");
        setDefaultValue(PROPERTY_DELIVERYTERMS, "A");
        setDefaultValue(PROPERTY_FREIGHTCOSTRULE, "I");
        setDefaultValue(PROPERTY_DELIVERYMETHOD, "P");
        setDefaultValue(PROPERTY_CHARGEAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_PRIORITY, "5");
        setDefaultValue(PROPERTY_PRICEINCLUDESTAX, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_COPYFROM, false);
        setDefaultValue(PROPERTY_SELFSERVICE, false);
        setDefaultValue(PROPERTY_GENERATETEMPLATE, false);
        setDefaultValue(PROPERTY_COPYFROMPO, false);
        setDefaultValue(PROPERTY_PICKFROMSHIPMENT, false);
        setDefaultValue(PROPERTY_RECEIVEMATERIALS, false);
        setDefaultValue(PROPERTY_CREATEINVOICE, false);
        setDefaultValue(PROPERTY_ADDORPHANLINE, false);
        setDefaultValue(PROPERTY_CALCULATEPROMOTIONS, false);
        setDefaultValue(PROPERTY_CREATEORDER, false);
        setDefaultValue(PROPERTY_CREATEPOLINES, false);
        setDefaultValue(PROPERTY_CASHVAT, false);
        setDefaultValue(PROPERTY_PICKFROMRECEIPT, false);
        setDefaultValue(PROPERTY_CANCELANDREPLACE, false);
        setDefaultValue(PROPERTY_APRMADDPAYMENT, false);
        setDefaultValue(PROPERTY_CONFIRMCANCELANDREPLACE, false);
        setDefaultValue(PROPERTY_ISCANCELLED, false);
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDINVVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDORDVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDULELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSHIPMENTINOUTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERQUOTATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERCANCELLEDORDERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERDISCOUNTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINETAXLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERTAXLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTLINEPURCHASEORDERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTPHASELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Order#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Order#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Order#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Order#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Order#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Order#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Order#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Order#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Order#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Order#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Order#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Order#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Order#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Order#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Order#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Order#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Order#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see Order#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see Order#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see Order#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see Order#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see Order#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see Order#PROPERTY_DOCUMENTACTION
     * 
     */
    public String getDocumentAction() {
        return (String) get(PROPERTY_DOCUMENTACTION);
    }
    /**
     * @see Order#PROPERTY_DOCUMENTACTION
     * 
     */
    public void setDocumentAction(String documentAction) {
        set(PROPERTY_DOCUMENTACTION, documentAction);
    }

    /**
     * @see Order#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Order#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Order#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see Order#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see Order#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see Order#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see Order#PROPERTY_TRANSACTIONDOCUMENT
     * 
     */
    public DocumentType getTransactionDocument() {
        return (DocumentType) get(PROPERTY_TRANSACTIONDOCUMENT);
    }
    /**
     * @see Order#PROPERTY_TRANSACTIONDOCUMENT
     * 
     */
    public void setTransactionDocument(DocumentType transactionDocument) {
        set(PROPERTY_TRANSACTIONDOCUMENT, transactionDocument);
    }

    /**
     * @see Order#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Order#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Order#PROPERTY_DELIVERED
     * 
     */
    public Boolean isDelivered() {
        return (Boolean) get(PROPERTY_DELIVERED);
    }
    /**
     * @see Order#PROPERTY_DELIVERED
     * 
     */
    public void setDelivered(Boolean delivered) {
        set(PROPERTY_DELIVERED, delivered);
    }

    /**
     * @see Order#PROPERTY_REINVOICE
     * 
     */
    public Boolean isReinvoice() {
        return (Boolean) get(PROPERTY_REINVOICE);
    }
    /**
     * @see Order#PROPERTY_REINVOICE
     * 
     */
    public void setReinvoice(Boolean reinvoice) {
        set(PROPERTY_REINVOICE, reinvoice);
    }

    /**
     * @see Order#PROPERTY_PRINT
     * 
     */
    public Boolean isPrint() {
        return (Boolean) get(PROPERTY_PRINT);
    }
    /**
     * @see Order#PROPERTY_PRINT
     * 
     */
    public void setPrint(Boolean print) {
        set(PROPERTY_PRINT, print);
    }

    /**
     * @see Order#PROPERTY_SELECTED
     * 
     */
    public Boolean isSelected() {
        return (Boolean) get(PROPERTY_SELECTED);
    }
    /**
     * @see Order#PROPERTY_SELECTED
     * 
     */
    public void setSelected(Boolean selected) {
        set(PROPERTY_SELECTED, selected);
    }

    /**
     * @see Order#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see Order#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see Order#PROPERTY_ORDERDATE
     * 
     */
    public Date getOrderDate() {
        return (Date) get(PROPERTY_ORDERDATE);
    }
    /**
     * @see Order#PROPERTY_ORDERDATE
     * 
     */
    public void setOrderDate(Date orderDate) {
        set(PROPERTY_ORDERDATE, orderDate);
    }

    /**
     * @see Order#PROPERTY_SCHEDULEDDELIVERYDATE
     * 
     */
    public Date getScheduledDeliveryDate() {
        return (Date) get(PROPERTY_SCHEDULEDDELIVERYDATE);
    }
    /**
     * @see Order#PROPERTY_SCHEDULEDDELIVERYDATE
     * 
     */
    public void setScheduledDeliveryDate(Date scheduledDeliveryDate) {
        set(PROPERTY_SCHEDULEDDELIVERYDATE, scheduledDeliveryDate);
    }

    /**
     * @see Order#PROPERTY_DATEPRINTED
     * 
     */
    public Date getDatePrinted() {
        return (Date) get(PROPERTY_DATEPRINTED);
    }
    /**
     * @see Order#PROPERTY_DATEPRINTED
     * 
     */
    public void setDatePrinted(Date datePrinted) {
        set(PROPERTY_DATEPRINTED, datePrinted);
    }

    /**
     * @see Order#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see Order#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see Order#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Order#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Order#PROPERTY_INVOICEADDRESS
     * 
     */
    public Location getInvoiceAddress() {
        return (Location) get(PROPERTY_INVOICEADDRESS);
    }
    /**
     * @see Order#PROPERTY_INVOICEADDRESS
     * 
     */
    public void setInvoiceAddress(Location invoiceAddress) {
        set(PROPERTY_INVOICEADDRESS, invoiceAddress);
    }

    /**
     * @see Order#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see Order#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see Order#PROPERTY_ORDERREFERENCE
     * 
     */
    public String getOrderReference() {
        return (String) get(PROPERTY_ORDERREFERENCE);
    }
    /**
     * @see Order#PROPERTY_ORDERREFERENCE
     * 
     */
    public void setOrderReference(String orderReference) {
        set(PROPERTY_ORDERREFERENCE, orderReference);
    }

    /**
     * @see Order#PROPERTY_PRINTDISCOUNT
     * 
     */
    public Boolean isPrintDiscount() {
        return (Boolean) get(PROPERTY_PRINTDISCOUNT);
    }
    /**
     * @see Order#PROPERTY_PRINTDISCOUNT
     * 
     */
    public void setPrintDiscount(Boolean printDiscount) {
        set(PROPERTY_PRINTDISCOUNT, printDiscount);
    }

    /**
     * @see Order#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Order#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Order#PROPERTY_FORMOFPAYMENT
     * 
     */
    public String getFormOfPayment() {
        return (String) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see Order#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(String formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see Order#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see Order#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see Order#PROPERTY_INVOICETERMS
     * 
     */
    public String getInvoiceTerms() {
        return (String) get(PROPERTY_INVOICETERMS);
    }
    /**
     * @see Order#PROPERTY_INVOICETERMS
     * 
     */
    public void setInvoiceTerms(String invoiceTerms) {
        set(PROPERTY_INVOICETERMS, invoiceTerms);
    }

    /**
     * @see Order#PROPERTY_DELIVERYTERMS
     * 
     */
    public String getDeliveryTerms() {
        return (String) get(PROPERTY_DELIVERYTERMS);
    }
    /**
     * @see Order#PROPERTY_DELIVERYTERMS
     * 
     */
    public void setDeliveryTerms(String deliveryTerms) {
        set(PROPERTY_DELIVERYTERMS, deliveryTerms);
    }

    /**
     * @see Order#PROPERTY_FREIGHTCOSTRULE
     * 
     */
    public String getFreightCostRule() {
        return (String) get(PROPERTY_FREIGHTCOSTRULE);
    }
    /**
     * @see Order#PROPERTY_FREIGHTCOSTRULE
     * 
     */
    public void setFreightCostRule(String freightCostRule) {
        set(PROPERTY_FREIGHTCOSTRULE, freightCostRule);
    }

    /**
     * @see Order#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public BigDecimal getFreightAmount() {
        return (BigDecimal) get(PROPERTY_FREIGHTAMOUNT);
    }
    /**
     * @see Order#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        set(PROPERTY_FREIGHTAMOUNT, freightAmount);
    }

    /**
     * @see Order#PROPERTY_DELIVERYMETHOD
     * 
     */
    public String getDeliveryMethod() {
        return (String) get(PROPERTY_DELIVERYMETHOD);
    }
    /**
     * @see Order#PROPERTY_DELIVERYMETHOD
     * 
     */
    public void setDeliveryMethod(String deliveryMethod) {
        set(PROPERTY_DELIVERYMETHOD, deliveryMethod);
    }

    /**
     * @see Order#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public ShippingCompany getShippingCompany() {
        return (ShippingCompany) get(PROPERTY_SHIPPINGCOMPANY);
    }
    /**
     * @see Order#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public void setShippingCompany(ShippingCompany shippingCompany) {
        set(PROPERTY_SHIPPINGCOMPANY, shippingCompany);
    }

    /**
     * @see Order#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see Order#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see Order#PROPERTY_CHARGEAMOUNT
     * 
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEAMOUNT);
    }
    /**
     * @see Order#PROPERTY_CHARGEAMOUNT
     * 
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        set(PROPERTY_CHARGEAMOUNT, chargeAmount);
    }

    /**
     * @see Order#PROPERTY_PRIORITY
     * 
     */
    public String getPriority() {
        return (String) get(PROPERTY_PRIORITY);
    }
    /**
     * @see Order#PROPERTY_PRIORITY
     * 
     */
    public void setPriority(String priority) {
        set(PROPERTY_PRIORITY, priority);
    }

    /**
     * @see Order#PROPERTY_SUMMEDLINEAMOUNT
     * 
     */
    public BigDecimal getSummedLineAmount() {
        return (BigDecimal) get(PROPERTY_SUMMEDLINEAMOUNT);
    }
    /**
     * @see Order#PROPERTY_SUMMEDLINEAMOUNT
     * 
     */
    public void setSummedLineAmount(BigDecimal summedLineAmount) {
        set(PROPERTY_SUMMEDLINEAMOUNT, summedLineAmount);
    }

    /**
     * @see Order#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public BigDecimal getGrandTotalAmount() {
        return (BigDecimal) get(PROPERTY_GRANDTOTALAMOUNT);
    }
    /**
     * @see Order#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public void setGrandTotalAmount(BigDecimal grandTotalAmount) {
        set(PROPERTY_GRANDTOTALAMOUNT, grandTotalAmount);
    }

    /**
     * @see Order#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see Order#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see Order#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see Order#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see Order#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public Boolean isPriceIncludesTax() {
        return (Boolean) get(PROPERTY_PRICEINCLUDESTAX);
    }
    /**
     * @see Order#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public void setPriceIncludesTax(Boolean priceIncludesTax) {
        set(PROPERTY_PRICEINCLUDESTAX, priceIncludesTax);
    }

    /**
     * @see Order#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see Order#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see Order#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see Order#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see Order#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see Order#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see Order#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see Order#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see Order#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see Order#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see Order#PROPERTY_COPYFROM
     * 
     */
    public Boolean isCopyFrom() {
        return (Boolean) get(PROPERTY_COPYFROM);
    }
    /**
     * @see Order#PROPERTY_COPYFROM
     * 
     */
    public void setCopyFrom(Boolean copyFrom) {
        set(PROPERTY_COPYFROM, copyFrom);
    }

    /**
     * @see Order#PROPERTY_DROPSHIPPARTNER
     * 
     */
    public BusinessPartner getDropShipPartner() {
        return (BusinessPartner) get(PROPERTY_DROPSHIPPARTNER);
    }
    /**
     * @see Order#PROPERTY_DROPSHIPPARTNER
     * 
     */
    public void setDropShipPartner(BusinessPartner dropShipPartner) {
        set(PROPERTY_DROPSHIPPARTNER, dropShipPartner);
    }

    /**
     * @see Order#PROPERTY_DROPSHIPLOCATION
     * 
     */
    public Location getDropShipLocation() {
        return (Location) get(PROPERTY_DROPSHIPLOCATION);
    }
    /**
     * @see Order#PROPERTY_DROPSHIPLOCATION
     * 
     */
    public void setDropShipLocation(Location dropShipLocation) {
        set(PROPERTY_DROPSHIPLOCATION, dropShipLocation);
    }

    /**
     * @see Order#PROPERTY_DROPSHIPCONTACT
     * 
     */
    public User getDropShipContact() {
        return (User) get(PROPERTY_DROPSHIPCONTACT);
    }
    /**
     * @see Order#PROPERTY_DROPSHIPCONTACT
     * 
     */
    public void setDropShipContact(User dropShipContact) {
        set(PROPERTY_DROPSHIPCONTACT, dropShipContact);
    }

    /**
     * @see Order#PROPERTY_SELFSERVICE
     * 
     */
    public Boolean isSelfService() {
        return (Boolean) get(PROPERTY_SELFSERVICE);
    }
    /**
     * @see Order#PROPERTY_SELFSERVICE
     * 
     */
    public void setSelfService(Boolean selfService) {
        set(PROPERTY_SELFSERVICE, selfService);
    }

    /**
     * @see Order#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see Order#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see Order#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see Order#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see Order#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see Order#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see Order#PROPERTY_DELIVERYNOTES
     * 
     */
    public String getDeliveryNotes() {
        return (String) get(PROPERTY_DELIVERYNOTES);
    }
    /**
     * @see Order#PROPERTY_DELIVERYNOTES
     * 
     */
    public void setDeliveryNotes(String deliveryNotes) {
        set(PROPERTY_DELIVERYNOTES, deliveryNotes);
    }

    /**
     * @see Order#PROPERTY_INCOTERMS
     * 
     */
    public Incoterms getIncoterms() {
        return (Incoterms) get(PROPERTY_INCOTERMS);
    }
    /**
     * @see Order#PROPERTY_INCOTERMS
     * 
     */
    public void setIncoterms(Incoterms incoterms) {
        set(PROPERTY_INCOTERMS, incoterms);
    }

    /**
     * @see Order#PROPERTY_INCOTERMSDESCRIPTION
     * 
     */
    public String getINCOTERMSDescription() {
        return (String) get(PROPERTY_INCOTERMSDESCRIPTION);
    }
    /**
     * @see Order#PROPERTY_INCOTERMSDESCRIPTION
     * 
     */
    public void setINCOTERMSDescription(String iNCOTERMSDescription) {
        set(PROPERTY_INCOTERMSDESCRIPTION, iNCOTERMSDescription);
    }

    /**
     * @see Order#PROPERTY_GENERATETEMPLATE
     * 
     */
    public Boolean isGenerateTemplate() {
        return (Boolean) get(PROPERTY_GENERATETEMPLATE);
    }
    /**
     * @see Order#PROPERTY_GENERATETEMPLATE
     * 
     */
    public void setGenerateTemplate(Boolean generateTemplate) {
        set(PROPERTY_GENERATETEMPLATE, generateTemplate);
    }

    /**
     * @see Order#PROPERTY_DELIVERYLOCATION
     * 
     */
    public Location getDeliveryLocation() {
        return (Location) get(PROPERTY_DELIVERYLOCATION);
    }
    /**
     * @see Order#PROPERTY_DELIVERYLOCATION
     * 
     */
    public void setDeliveryLocation(Location deliveryLocation) {
        set(PROPERTY_DELIVERYLOCATION, deliveryLocation);
    }

    /**
     * @see Order#PROPERTY_COPYFROMPO
     * 
     */
    public Boolean isCopyFromPO() {
        return (Boolean) get(PROPERTY_COPYFROMPO);
    }
    /**
     * @see Order#PROPERTY_COPYFROMPO
     * 
     */
    public void setCopyFromPO(Boolean copyFromPO) {
        set(PROPERTY_COPYFROMPO, copyFromPO);
    }

    /**
     * @see Order#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see Order#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see Order#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public PaymentPriority getFINPaymentPriority() {
        return (PaymentPriority) get(PROPERTY_FINPAYMENTPRIORITY);
    }
    /**
     * @see Order#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public void setFINPaymentPriority(PaymentPriority fINPaymentPriority) {
        set(PROPERTY_FINPAYMENTPRIORITY, fINPaymentPriority);
    }

    /**
     * @see Order#PROPERTY_PICKFROMSHIPMENT
     * 
     */
    public Boolean isPickFromShipment() {
        return (Boolean) get(PROPERTY_PICKFROMSHIPMENT);
    }
    /**
     * @see Order#PROPERTY_PICKFROMSHIPMENT
     * 
     */
    public void setPickFromShipment(Boolean pickFromShipment) {
        set(PROPERTY_PICKFROMSHIPMENT, pickFromShipment);
    }

    /**
     * @see Order#PROPERTY_RECEIVEMATERIALS
     * 
     */
    public Boolean isReceiveMaterials() {
        return (Boolean) get(PROPERTY_RECEIVEMATERIALS);
    }
    /**
     * @see Order#PROPERTY_RECEIVEMATERIALS
     * 
     */
    public void setReceiveMaterials(Boolean receiveMaterials) {
        set(PROPERTY_RECEIVEMATERIALS, receiveMaterials);
    }

    /**
     * @see Order#PROPERTY_CREATEINVOICE
     * 
     */
    public Boolean isCreateInvoice() {
        return (Boolean) get(PROPERTY_CREATEINVOICE);
    }
    /**
     * @see Order#PROPERTY_CREATEINVOICE
     * 
     */
    public void setCreateInvoice(Boolean createInvoice) {
        set(PROPERTY_CREATEINVOICE, createInvoice);
    }

    /**
     * @see Order#PROPERTY_RETURNREASON
     * 
     */
    public ReturnReason getReturnReason() {
        return (ReturnReason) get(PROPERTY_RETURNREASON);
    }
    /**
     * @see Order#PROPERTY_RETURNREASON
     * 
     */
    public void setReturnReason(ReturnReason returnReason) {
        set(PROPERTY_RETURNREASON, returnReason);
    }

    /**
     * @see Order#PROPERTY_ADDORPHANLINE
     * 
     */
    public Boolean isAddOrphanLine() {
        return (Boolean) get(PROPERTY_ADDORPHANLINE);
    }
    /**
     * @see Order#PROPERTY_ADDORPHANLINE
     * 
     */
    public void setAddOrphanLine(Boolean addOrphanLine) {
        set(PROPERTY_ADDORPHANLINE, addOrphanLine);
    }

    /**
     * @see Order#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see Order#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see Order#PROPERTY_CALCULATEPROMOTIONS
     * 
     */
    public Boolean isCalculatePromotions() {
        return (Boolean) get(PROPERTY_CALCULATEPROMOTIONS);
    }
    /**
     * @see Order#PROPERTY_CALCULATEPROMOTIONS
     * 
     */
    public void setCalculatePromotions(Boolean calculatePromotions) {
        set(PROPERTY_CALCULATEPROMOTIONS, calculatePromotions);
    }

    /**
     * @see Order#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see Order#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see Order#PROPERTY_CREATEORDER
     * 
     */
    public Boolean isCreateOrder() {
        return (Boolean) get(PROPERTY_CREATEORDER);
    }
    /**
     * @see Order#PROPERTY_CREATEORDER
     * 
     */
    public void setCreateOrder(Boolean createOrder) {
        set(PROPERTY_CREATEORDER, createOrder);
    }

    /**
     * @see Order#PROPERTY_REJECTREASON
     * 
     */
    public RejectReason getRejectReason() {
        return (RejectReason) get(PROPERTY_REJECTREASON);
    }
    /**
     * @see Order#PROPERTY_REJECTREASON
     * 
     */
    public void setRejectReason(RejectReason rejectReason) {
        set(PROPERTY_REJECTREASON, rejectReason);
    }

    /**
     * @see Order#PROPERTY_VALIDUNTIL
     * 
     */
    public Date getValidUntil() {
        return (Date) get(PROPERTY_VALIDUNTIL);
    }
    /**
     * @see Order#PROPERTY_VALIDUNTIL
     * 
     */
    public void setValidUntil(Date validUntil) {
        set(PROPERTY_VALIDUNTIL, validUntil);
    }

    /**
     * @see Order#PROPERTY_QUOTATION
     * 
     */
    public Order getQuotation() {
        return (Order) get(PROPERTY_QUOTATION);
    }
    /**
     * @see Order#PROPERTY_QUOTATION
     * 
     */
    public void setQuotation(Order quotation) {
        set(PROPERTY_QUOTATION, quotation);
    }

    /**
     * @see Order#PROPERTY_RESERVATIONSTATUS
     * 
     */
    public String getReservationStatus() {
        return (String) get(PROPERTY_RESERVATIONSTATUS);
    }
    /**
     * @see Order#PROPERTY_RESERVATIONSTATUS
     * 
     */
    public void setReservationStatus(String reservationStatus) {
        set(PROPERTY_RESERVATIONSTATUS, reservationStatus);
    }

    /**
     * @see Order#PROPERTY_CREATEPOLINES
     * 
     */
    public Boolean isCreatePOLines() {
        return (Boolean) get(PROPERTY_CREATEPOLINES);
    }
    /**
     * @see Order#PROPERTY_CREATEPOLINES
     * 
     */
    public void setCreatePOLines(Boolean createPOLines) {
        set(PROPERTY_CREATEPOLINES, createPOLines);
    }

    /**
     * @see Order#PROPERTY_CASHVAT
     * 
     */
    public Boolean isCashVAT() {
        return (Boolean) get(PROPERTY_CASHVAT);
    }
    /**
     * @see Order#PROPERTY_CASHVAT
     * 
     */
    public void setCashVAT(Boolean cashVAT) {
        set(PROPERTY_CASHVAT, cashVAT);
    }

    /**
     * @see Order#PROPERTY_PICKFROMRECEIPT
     * 
     */
    public Boolean isPickfromreceipt() {
        return (Boolean) get(PROPERTY_PICKFROMRECEIPT);
    }
    /**
     * @see Order#PROPERTY_PICKFROMRECEIPT
     * 
     */
    public void setPickfromreceipt(Boolean pickfromreceipt) {
        set(PROPERTY_PICKFROMRECEIPT, pickfromreceipt);
    }

    /**
     * @see Order#PROPERTY_CANCELANDREPLACE
     * 
     */
    public Boolean isCancelandreplace() {
        return (Boolean) get(PROPERTY_CANCELANDREPLACE);
    }
    /**
     * @see Order#PROPERTY_CANCELANDREPLACE
     * 
     */
    public void setCancelandreplace(Boolean cancelandreplace) {
        set(PROPERTY_CANCELANDREPLACE, cancelandreplace);
    }

    /**
     * @see Order#PROPERTY_APRMADDPAYMENT
     * 
     */
    public Boolean isAPRMAddPayment() {
        return (Boolean) get(PROPERTY_APRMADDPAYMENT);
    }
    /**
     * @see Order#PROPERTY_APRMADDPAYMENT
     * 
     */
    public void setAPRMAddPayment(Boolean aPRMAddPayment) {
        set(PROPERTY_APRMADDPAYMENT, aPRMAddPayment);
    }

    /**
     * @see Order#PROPERTY_CONFIRMCANCELANDREPLACE
     * 
     */
    public Boolean isConfirmcancelandreplace() {
        return (Boolean) get(PROPERTY_CONFIRMCANCELANDREPLACE);
    }
    /**
     * @see Order#PROPERTY_CONFIRMCANCELANDREPLACE
     * 
     */
    public void setConfirmcancelandreplace(Boolean confirmcancelandreplace) {
        set(PROPERTY_CONFIRMCANCELANDREPLACE, confirmcancelandreplace);
    }

    /**
     * @see Order#PROPERTY_CANCELLEDORDER
     * 
     */
    public Order getCancelledorder() {
        return (Order) get(PROPERTY_CANCELLEDORDER);
    }
    /**
     * @see Order#PROPERTY_CANCELLEDORDER
     * 
     */
    public void setCancelledorder(Order cancelledorder) {
        set(PROPERTY_CANCELLEDORDER, cancelledorder);
    }

    /**
     * @see Order#PROPERTY_REPLACEDORDER
     * 
     */
    public Order getReplacedorder() {
        return (Order) get(PROPERTY_REPLACEDORDER);
    }
    /**
     * @see Order#PROPERTY_REPLACEDORDER
     * 
     */
    public void setReplacedorder(Order replacedorder) {
        set(PROPERTY_REPLACEDORDER, replacedorder);
    }

    /**
     * @see Order#PROPERTY_ISCANCELLED
     * 
     */
    public Boolean isCancelled() {
        return (Boolean) get(PROPERTY_ISCANCELLED);
    }
    /**
     * @see Order#PROPERTY_ISCANCELLED
     * 
     */
    public void setCancelled(Boolean iscancelled) {
        set(PROPERTY_ISCANCELLED, iscancelled);
    }

    /**
     * @see Order#PROPERTY_REPLACEMENTORDER
     * 
     */
    public Order getReplacementorder() {
        return (Order) get(PROPERTY_REPLACEMENTORDER);
    }
    /**
     * @see Order#PROPERTY_REPLACEMENTORDER
     * 
     */
    public void setReplacementorder(Order replacementorder) {
        set(PROPERTY_REPLACEMENTORDER, replacementorder);
    }

    /**
     * @see Order#PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE
     * 
     */
    public String getExternalBusinessPartnerReference() {
        return (String) get(PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE);
    }
    /**
     * @see Order#PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE
     * 
     */
    public void setExternalBusinessPartnerReference(String externalBusinessPartnerReference) {
        set(PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE, externalBusinessPartnerReference);
    }

    /**
     * @see Order#PROPERTY_ALTERNATELOCATION
     * 
     */
    public org.openbravo.model.common.geography.Location getAlternateLocation() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_ALTERNATELOCATION);
    }
    /**
     * @see Order#PROPERTY_ALTERNATELOCATION
     * 
     */
    public void setAlternateLocation(org.openbravo.model.common.geography.Location alternateLocation) {
        set(PROPERTY_ALTERNATELOCATION, alternateLocation);
    }

    /**
     * @see Order#PROPERTY_INVOICEALTERNATELOC
     * 
     */
    public org.openbravo.model.common.geography.Location getInvoiceAlternateLoc() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_INVOICEALTERNATELOC);
    }
    /**
     * @see Order#PROPERTY_INVOICEALTERNATELOC
     * 
     */
    public void setInvoiceAlternateLoc(org.openbravo.model.common.geography.Location invoiceAlternateLoc) {
        set(PROPERTY_INVOICEALTERNATELOC, invoiceAlternateLoc);
    }

    /**
     * @see Order#COMPUTED_COLUMN_DELIVERYSTATUS
     * 
     */
    public Long getDeliveryStatus() {
        return (Long) get(COMPUTED_COLUMN_DELIVERYSTATUS);
    }
    /**
     * @see Order#COMPUTED_COLUMN_DELIVERYSTATUS
     * 
     */
    public void setDeliveryStatus(Long deliveryStatus) {
        set(COMPUTED_COLUMN_DELIVERYSTATUS, deliveryStatus);
    }

    /**
     * @see Order#COMPUTED_COLUMN_INVOICESTATUS
     * 
     */
    public Long getInvoiceStatus() {
        return (Long) get(COMPUTED_COLUMN_INVOICESTATUS);
    }
    /**
     * @see Order#COMPUTED_COLUMN_INVOICESTATUS
     * 
     */
    public void setInvoiceStatus(Long invoiceStatus) {
        set(COMPUTED_COLUMN_INVOICESTATUS, invoiceStatus);
    }

    /**
     * @see Order#COMPUTED_COLUMN_PAYMENTSTATUS
     * 
     */
    public Long getPaymentStatus() {
        return (Long) get(COMPUTED_COLUMN_PAYMENTSTATUS);
    }
    /**
     * @see Order#COMPUTED_COLUMN_PAYMENTSTATUS
     * 
     */
    public void setPaymentStatus(Long paymentStatus) {
        set(COMPUTED_COLUMN_PAYMENTSTATUS, paymentStatus);
    }

    /**
     * @see Order#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public Order_ComputedColumns get_computedColumns() {
        return (Order_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see Order#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(Order_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * @see FIN_PaymentSchedInvV
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentSchedInvV> getFINPaymentSchedInvVList() {
      return (List<FIN_PaymentSchedInvV>) get(PROPERTY_FINPAYMENTSCHEDINVVLIST);
    }

    /**
     * @see FIN_PaymentSchedInvV
     * 
     */
    public void setFINPaymentSchedInvVList(List<FIN_PaymentSchedInvV> fINPaymentSchedInvVList) {
        set(PROPERTY_FINPAYMENTSCHEDINVVLIST, fINPaymentSchedInvVList);
    }

    /**
     * @see FIN_PaymentSchedOrdV
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentSchedOrdV> getFINPaymentSchedOrdVList() {
      return (List<FIN_PaymentSchedOrdV>) get(PROPERTY_FINPAYMENTSCHEDORDVLIST);
    }

    /**
     * @see FIN_PaymentSchedOrdV
     * 
     */
    public void setFINPaymentSchedOrdVList(List<FIN_PaymentSchedOrdV> fINPaymentSchedOrdVList) {
        set(PROPERTY_FINPAYMENTSCHEDORDVLIST, fINPaymentSchedOrdVList);
    }

    /**
     * @see FIN_PaymentSchedule
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_PaymentSchedule> getFINPaymentScheduleList() {
      return (List<FIN_PaymentSchedule>) get(PROPERTY_FINPAYMENTSCHEDULELIST);
    }

    /**
     * @see FIN_PaymentSchedule
     * 
     */
    public void setFINPaymentScheduleList(List<FIN_PaymentSchedule> fINPaymentScheduleList) {
        set(PROPERTY_FINPAYMENTSCHEDULELIST, fINPaymentScheduleList);
    }

    /**
     * Help: {@literal Contains all the invoices}<br>
     * @see Invoice
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Invoice> getInvoiceList() {
      return (List<Invoice>) get(PROPERTY_INVOICELIST);
    }

    /**
     * Help: {@literal Contains all the invoices}<br>
     * @see Invoice
     * 
     */
    public void setInvoiceList(List<Invoice> invoiceList) {
        set(PROPERTY_INVOICELIST, invoiceList);
    }

    /**
     * Help: {@literal Contains all the material transaction due to business partner shipments}<br>
     * @see ShipmentInOut
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ShipmentInOut> getMaterialMgmtShipmentInOutList() {
      return (List<ShipmentInOut>) get(PROPERTY_MATERIALMGMTSHIPMENTINOUTLIST);
    }

    /**
     * Help: {@literal Contains all the material transaction due to business partner shipments}<br>
     * @see ShipmentInOut
     * 
     */
    public void setMaterialMgmtShipmentInOutList(List<ShipmentInOut> materialMgmtShipmentInOutList) {
        set(PROPERTY_MATERIALMGMTSHIPMENTINOUTLIST, materialMgmtShipmentInOutList);
    }

    /**
     * Help: {@literal Table where there are all the orders. The purchase orders and the sales orders.}<br>
     * @see Order
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Order> getOrderQuotationList() {
      return (List<Order>) get(PROPERTY_ORDERQUOTATIONLIST);
    }

    /**
     * Help: {@literal Table where there are all the orders. The purchase orders and the sales orders.}<br>
     * @see Order
     * 
     */
    public void setOrderQuotationList(List<Order> orderQuotationList) {
        set(PROPERTY_ORDERQUOTATIONLIST, orderQuotationList);
    }

    /**
     * Help: {@literal Table where there are all the orders. The purchase orders and the sales orders.}<br>
     * @see Order
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Order> getOrderCancelledorderList() {
      return (List<Order>) get(PROPERTY_ORDERCANCELLEDORDERLIST);
    }

    /**
     * Help: {@literal Table where there are all the orders. The purchase orders and the sales orders.}<br>
     * @see Order
     * 
     */
    public void setOrderCancelledorderList(List<Order> orderCancelledorderList) {
        set(PROPERTY_ORDERCANCELLEDORDERLIST, orderCancelledorderList);
    }

    /**
     * @see OrderDiscount
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderDiscount> getOrderDiscountList() {
      return (List<OrderDiscount>) get(PROPERTY_ORDERDISCOUNTLIST);
    }

    /**
     * @see OrderDiscount
     * 
     */
    public void setOrderDiscountList(List<OrderDiscount> orderDiscountList) {
        set(PROPERTY_ORDERDISCOUNTLIST, orderDiscountList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineList(List<OrderLine> orderLineList) {
        set(PROPERTY_ORDERLINELIST, orderLineList);
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
     * Help: {@literal The table constains the tax amount for an Order based on the lines entered.}<br>
     * @see OrderTax
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderTax> getOrderTaxList() {
      return (List<OrderTax>) get(PROPERTY_ORDERTAXLIST);
    }

    /**
     * Help: {@literal The table constains the tax amount for an Order based on the lines entered.}<br>
     * @see OrderTax
     * 
     */
    public void setOrderTaxList(List<OrderTax> orderTaxList) {
        set(PROPERTY_ORDERTAXLIST, orderTaxList);
    }

    /**
     * Help: {@literal Contains the lines (products and/or services) associated with the Project}<br>
     * @see ProjectLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectLine> getProjectLineList() {
      return (List<ProjectLine>) get(PROPERTY_PROJECTLINELIST);
    }

    /**
     * Help: {@literal Contains the lines (products and/or services) associated with the Project}<br>
     * @see ProjectLine
     * 
     */
    public void setProjectLineList(List<ProjectLine> projectLineList) {
        set(PROPERTY_PROJECTLINELIST, projectLineList);
    }

    /**
     * Help: {@literal Contains the lines (products and/or services) associated with the Project}<br>
     * @see ProjectLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectLine> getProjectLinePurchaseOrderList() {
      return (List<ProjectLine>) get(PROPERTY_PROJECTLINEPURCHASEORDERLIST);
    }

    /**
     * Help: {@literal Contains the lines (products and/or services) associated with the Project}<br>
     * @see ProjectLine
     * 
     */
    public void setProjectLinePurchaseOrderList(List<ProjectLine> projectLinePurchaseOrderList) {
        set(PROPERTY_PROJECTLINEPURCHASEORDERLIST, projectLinePurchaseOrderList);
    }

    /**
     * Help: {@literal Actual Phase of the Project with Status information - generated from Phase of Project
     *       Type.}<br>
     * @see ProjectPhase
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectPhase> getProjectPhaseList() {
      return (List<ProjectPhase>) get(PROPERTY_PROJECTPHASELIST);
    }

    /**
     * Help: {@literal Actual Phase of the Project with Status information - generated from Phase of Project
     *       Type.}<br>
     * @see ProjectPhase
     * 
     */
    public void setProjectPhaseList(List<ProjectPhase> projectPhaseList) {
        set(PROPERTY_PROJECTPHASELIST, projectPhaseList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_DELIVERYSTATUS.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getDeliveryStatus();
      }
      if (COMPUTED_COLUMN_INVOICESTATUS.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getInvoiceStatus();
      }
      if (COMPUTED_COLUMN_PAYMENTSTATUS.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getPaymentStatus();
      }

      return super.get(propName);
    }
}
