
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
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.currency.ConversionRateDoc;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.Order;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.financialmgmt.payment.DebtPayment;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedInvV;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedOrdV;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedule;
import org.openbravo.model.financialmgmt.payment.PaymentPriority;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
import org.openbravo.model.financialmgmt.tax.Withholding;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.materialmgmt.transaction.ShipmentInOut;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.model.pricing.volumediscount.DiscountInvoice;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity Invoice (stored in table C_Invoice).
 * <br>
 * Help: {@literal Contains all the invoices}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Invoice extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Invoice";
    public static final String ENTITY_NAME = "Invoice";

    /**
     * Property id stored in column C_Invoice_ID in table C_Invoice<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Invoice 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Invoice 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Invoice 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Invoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Invoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Invoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Invoice 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property salesTransaction stored in column IsSOTrx in table C_Invoice<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property documentNo stored in column DocumentNo in table C_Invoice 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property documentStatus stored in column DocStatus in table C_Invoice<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property documentAction stored in column DocAction in table C_Invoice<br>
     * Help: {@literal 
     *       You find the current status in the Document Status field. The options are listed in a
     *       popup}
     * 
     */
    public static final String PROPERTY_DOCUMENTACTION = "documentAction";

    /**
     * Property processNow stored in column Processing in table C_Invoice<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_Invoice<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table C_Invoice<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property documentType stored in column C_DocType_ID in table C_Invoice<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property transactionDocument stored in column C_DocTypeTarget_ID in table C_Invoice<br>
     * Help: {@literal Specifies document subtype (eg. POS Order, Return Material, etc.) that each document (such
     *       as Sales Invoice, Purchase Order, etc.). Various document subtypes usually differ on the
     *       consequences they have. You can convert document types (e.g. from Offer to Order).  The conversion
     *       is then reflected in the current type.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDOCUMENT = "transactionDocument";

    /**
     * Property salesOrder stored in column C_Order_ID in table C_Invoice<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property description stored in column Description in table C_Invoice<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property print stored in column IsPrinted in table C_Invoice<br>
     * Help: {@literal The Printed checkbox indicates if this document or line will included when printing.}
     * 
     */
    public static final String PROPERTY_PRINT = "print";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table C_Invoice<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property invoiceDate stored in column DateInvoiced in table C_Invoice 
     * 
     */
    public static final String PROPERTY_INVOICEDATE = "invoiceDate";

    /**
     * Property datePrinted stored in column DatePrinted in table C_Invoice<br>
     * Help: {@literal Indicates the Date that a document was printed.}
     * 
     */
    public static final String PROPERTY_DATEPRINTED = "datePrinted";

    /**
     * Property accountingDate stored in column DateAcct in table C_Invoice<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Invoice<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table C_Invoice<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property orderReference stored in column POReference in table C_Invoice<br>
     * Help: {@literal This can be used to input a reference for this specific transaction. For example, a
     *       Purchase Order number can be input on a Sales Order for easier reference.}
     * 
     */
    public static final String PROPERTY_ORDERREFERENCE = "orderReference";

    /**
     * Property printDiscount stored in column IsDiscountPrinted in table C_Invoice<br>
     * Help: {@literal The Discount Printed Checkbox indicates if the discount will be printed on the document.}
     * 
     */
    public static final String PROPERTY_PRINTDISCOUNT = "printDiscount";

    /**
     * Property orderDate stored in column DateOrdered in table C_Invoice<br>
     * Help: {@literal Indicates the Date an item was ordered.}
     * 
     */
    public static final String PROPERTY_ORDERDATE = "orderDate";

    /**
     * Property currency stored in column C_Currency_ID in table C_Invoice<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_Invoice<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property charge stored in column C_Charge_ID in table C_Invoice<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property chargeAmount stored in column ChargeAmt in table C_Invoice<br>
     * Help: {@literal The Charge Amount indicates the amount for an additional charge.}
     * 
     */
    public static final String PROPERTY_CHARGEAMOUNT = "chargeAmount";

    /**
     * Property summedLineAmount stored in column TotalLines in table C_Invoice<br>
     * Help: {@literal The Total amount displays the total of all lines in document currency}
     * 
     */
    public static final String PROPERTY_SUMMEDLINEAMOUNT = "summedLineAmount";

    /**
     * Property grandTotalAmount stored in column GrandTotal in table C_Invoice 
     * 
     */
    public static final String PROPERTY_GRANDTOTALAMOUNT = "grandTotalAmount";

    /**
     * Property priceList stored in column M_PriceList_ID in table C_Invoice<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property priceIncludesTax stored in column IsTaxIncluded in table C_Invoice<br>
     * Help: {@literal The Tax Included checkbox indicates if the prices include tax.  This is also known as the
     *       gross price.}
     * 
     */
    public static final String PROPERTY_PRICEINCLUDESTAX = "priceIncludesTax";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_Invoice<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table C_Invoice<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property activity stored in column C_Activity_ID in table C_Invoice<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property createLinesFrom stored in column CreateFrom in table C_Invoice<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example, in case of entering a new Goods Shipment, the
     *       user can copy lines (products) from an existing Sales Order or Sales Invoice.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROM = "createLinesFrom";

    /**
     * Property generateTo stored in column GenerateTo in table C_Invoice<br>
     * Help: {@literal A button that creates documents}
     * 
     */
    public static final String PROPERTY_GENERATETO = "generateTo";

    /**
     * Property userContact stored in column AD_User_ID in table C_Invoice<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property copyFrom stored in column CopyFrom in table C_Invoice<br>
     * Help: {@literal Copy lines (products) from another document of the same type.}
     * 
     */
    public static final String PROPERTY_COPYFROM = "copyFrom";

    /**
     * Property selfService stored in column IsSelfService in table C_Invoice<br>
     * Help: {@literal Self-Service allows users to enter data or update their data.  The flag indicates, that
     *       this record was entered or created via Self-Service or that the user can change it via the
     *       Self-Service functionality.}
     * 
     */
    public static final String PROPERTY_SELFSERVICE = "selfService";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table C_Invoice<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property stDimension stored in column User1_ID in table C_Invoice<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table C_Invoice<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property withholdingamount stored in column Withholdingamount in table C_Invoice
     * 
     */
    public static final String PROPERTY_WITHHOLDINGAMOUNT = "withholdingamount";

    /**
     * Property taxDate stored in column Taxdate in table C_Invoice<br>
     * Help: {@literal Tax Date}
     * 
     */
    public static final String PROPERTY_TAXDATE = "taxDate";

    /**
     * Property withholding stored in column C_Withholding_ID in table C_Invoice<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property paymentComplete stored in column Ispaid in table C_Invoice<br>
     * Help: {@literal The document is paid for.}
     * 
     */
    public static final String PROPERTY_PAYMENTCOMPLETE = "paymentComplete";

    /**
     * Property totalPaid stored in column Totalpaid in table C_Invoice<br>
     * Help: {@literal Total amount paid.}
     * 
     */
    public static final String PROPERTY_TOTALPAID = "totalPaid";

    /**
     * Property outstandingAmount stored in column OutstandingAmt in table C_Invoice<br>
     * Help: {@literal Outstanding Amount. Amount pending to be paid}
     * 
     */
    public static final String PROPERTY_OUTSTANDINGAMOUNT = "outstandingAmount";

    /**
     * Property daysTillDue stored in column DaysTillDue in table C_Invoice<br>
     * Help: {@literal Number of days left for the next due date}
     * 
     */
    public static final String PROPERTY_DAYSTILLDUE = "daysTillDue";

    /**
     * Property dueAmount stored in column DueAmt in table C_Invoice<br>
     * Help: {@literal Total amount due}
     * 
     */
    public static final String PROPERTY_DUEAMOUNT = "dueAmount";

    /**
     * Property lastCalculatedOnDate stored in column LastCalculatedOnDate in table C_Invoice<br>
     * Help: {@literal Last Calculated On Date for payment monitor}
     * 
     */
    public static final String PROPERTY_LASTCALCULATEDONDATE = "lastCalculatedOnDate";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table C_Invoice
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property fINPaymentPriority stored in column FIN_Payment_Priority_ID in table C_Invoice<br>
     * Help: {@literal Sets the priority of the payment plans generated when processing the invoice or order.
     *       The
     *       distribution algorithm will be driven by this priority. The pending payments for order or payments
     *       will be displayed ordered by the payment priority first and then by the due date.}
     * 
     */
    public static final String PROPERTY_FINPAYMENTPRIORITY = "fINPaymentPriority";

    /**
     * Property finalSettlementDate stored in column Finalsettlement in table C_Invoice
     * 
     */
    public static final String PROPERTY_FINALSETTLEMENTDATE = "finalSettlementDate";

    /**
     * Property daysSalesOutstanding stored in column Daysoutstanding in table C_Invoice
     * 
     */
    public static final String PROPERTY_DAYSSALESOUTSTANDING = "daysSalesOutstanding";

    /**
     * Property percentageOverdue stored in column Percentageoverdue in table C_Invoice
     * 
     */
    public static final String PROPERTY_PERCENTAGEOVERDUE = "percentageOverdue";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table C_Invoice<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property calculatePromotions stored in column Calculate_Promotions in table C_Invoice
     * 
     */
    public static final String PROPERTY_CALCULATEPROMOTIONS = "calculatePromotions";

    /**
     * Property asset stored in column A_Asset_ID in table C_Invoice<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property aPRMAddpayment stored in column EM_APRM_Addpayment in table C_Invoice<br>
     * Help: {@literal Launches a process to add a payment to the selected invoice.}
     * 
     */
    public static final String PROPERTY_APRMADDPAYMENT = "aPRMAddpayment";

    /**
     * Property cashVAT stored in column Iscashvat in table C_Invoice<br>
     * Help: {@literal Cash VAT tax rate}
     * 
     */
    public static final String PROPERTY_CASHVAT = "cashVAT";

    /**
     * Property aPRMProcessinvoice stored in column EM_APRM_Processinvoice in table C_Invoice
     * 
     */
    public static final String PROPERTY_APRMPROCESSINVOICE = "aPRMProcessinvoice";

    /**
     * Property prepaymentamt stored in column Prepaymentamt in table C_Invoice
     * 
     */
    public static final String PROPERTY_PREPAYMENTAMT = "prepaymentamt";

    /**
     * Property createLinesFromOrder stored in column Createfromorders in table C_Invoice<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example,the user can copy lines (products) from an
     *       existing Sales Order or Purchase Order.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROMORDER = "createLinesFromOrder";

    /**
     * Property createLinesFromShipment stored in column Createfrominouts in table C_Invoice<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example,the user can copy lines (products) from an
     *       existing Goods Shipment/Receipt.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROMSHIPMENT = "createLinesFromShipment";

    /**
     * Property paidAmountAtInvoicing stored in column Paidamtatinvoicing in table C_Invoice
     * 
     */
    public static final String PROPERTY_PAIDAMOUNTATINVOICING = "paidAmountAtInvoicing";

    /**
     * Property externalBusinessPartnerReference stored in column BPartner_ExtRef in table C_Invoice<br>
     * Help: {@literal This field stores the business partner reference to an external CRM system. This is useful
     *       only when the business partner management is done outside Openbravo. In this case Openbravo will
     *       internally use the anonymous customer but it will track the real customer in the external system
     *       through this field.}
     * 
     */
    public static final String PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE = "externalBusinessPartnerReference";

    /**
     * Property alternateLocation stored in column C_Alternate_Location_ID in table C_Invoice<br>
     * Help: {@literal Different invoice location where the order will be invoiced}
     * 
     */
    public static final String PROPERTY_ALTERNATELOCATION = "alternateLocation";

    /**
     * Property einvoiceStatus stored in column Einvoice_Status in table C_Invoice<br>
     * Help: {@literal The status of the e-invoice generation}
     * 
     */
    public static final String PROPERTY_EINVOICESTATUS = "einvoiceStatus";

    /**
     * Property einvoiceGenerated stored in column Einvoice_Generated in table C_Invoice<br>
     * Help: {@literal When the e-invoice document was generated}
     * 
     */
    public static final String PROPERTY_EINVOICEGENERATED = "einvoiceGenerated";

    /**
     * Property einvoiceExternalID stored in column Einvoice_ExternalID in table C_Invoice<br>
     * Help: {@literal Reference to the e-invoice document in an external system}
     * 
     */
    public static final String PROPERTY_EINVOICEEXTERNALID = "einvoiceExternalID";

    /**
     * Property einvoiceSendStatus stored in column Einvoice_Send_Status in table C_Invoice
     * 
     */
    public static final String PROPERTY_EINVOICESENDSTATUS = "einvoiceSendStatus";

    /**
     * Property einvoiceSent stored in column Einvoice_Sent in table C_Invoice<br>
     * Help: {@literal Date when the e-invoice document was sent to an external system}
     * 
     */
    public static final String PROPERTY_EINVOICESENT = "einvoiceSent";

    /**
     * Property invoiceTaxCashVATVList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_INVOICETAXCASHVATVLIST = "invoiceTaxCashVATVList";

    /**
     * Property currencyConversionRateDocList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_CURRENCYCONVERSIONRATEDOCLIST = "currencyConversionRateDocList";

    /**
     * Property fINPaymentSchedInvVList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDINVVLIST = "fINPaymentSchedInvVList";

    /**
     * Property fINPaymentSchedOrdVList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDORDVLIST = "fINPaymentSchedOrdVList";

    /**
     * Property fINPaymentScheduleList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULELIST = "fINPaymentScheduleList";

    /**
     * Property financialMgmtDebtPaymentList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTDEBTPAYMENTLIST = "financialMgmtDebtPaymentList";

    /**
     * Property invoiceDiscountList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_INVOICEDISCOUNTLIST = "invoiceDiscountList";

    /**
     * Property invoiceLineList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_INVOICELINELIST = "invoiceLineList";

    /**
     * Property invoiceLineTaxList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_INVOICELINETAXLIST = "invoiceLineTaxList";

    /**
     * Property invoiceTaxList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_INVOICETAXLIST = "invoiceTaxList";

    /**
     * Property materialMgmtShipmentInOutList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSHIPMENTINOUTLIST = "materialMgmtShipmentInOutList";

    /**
     * Property pricingVolumeDiscountInvoiceList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_PRICINGVOLUMEDISCOUNTINVOICELIST = "pricingVolumeDiscountInvoiceList";

    /**
     * Property reversedInvoicesList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_REVERSEDINVOICESLIST = "reversedInvoicesList";

    /**
     * Property reversedInvoicesReversedInvoiceList stored in table C_Invoice
     * 
     */
    public static final String PROPERTY_REVERSEDINVOICESREVERSEDINVOICELIST = "reversedInvoicesReversedInvoiceList";


    public Invoice() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DOCUMENTSTATUS, "DR");
        setDefaultValue(PROPERTY_DOCUMENTACTION, "CO");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_PRINT, false);
        setDefaultValue(PROPERTY_PRINTDISCOUNT, false);
        setDefaultValue(PROPERTY_PRICEINCLUDESTAX, false);
        setDefaultValue(PROPERTY_CREATELINESFROM, false);
        setDefaultValue(PROPERTY_GENERATETO, false);
        setDefaultValue(PROPERTY_COPYFROM, false);
        setDefaultValue(PROPERTY_SELFSERVICE, false);
        setDefaultValue(PROPERTY_PAYMENTCOMPLETE, false);
        setDefaultValue(PROPERTY_TOTALPAID, new BigDecimal(0));
        setDefaultValue(PROPERTY_OUTSTANDINGAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_DAYSTILLDUE, (long) 0);
        setDefaultValue(PROPERTY_DUEAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CALCULATEPROMOTIONS, false);
        setDefaultValue(PROPERTY_APRMADDPAYMENT, true);
        setDefaultValue(PROPERTY_CASHVAT, false);
        setDefaultValue(PROPERTY_APRMPROCESSINVOICE, "CO");
        setDefaultValue(PROPERTY_PREPAYMENTAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATELINESFROMORDER, false);
        setDefaultValue(PROPERTY_CREATELINESFROMSHIPMENT, false);
        setDefaultValue(PROPERTY_PAIDAMOUNTATINVOICING, new BigDecimal(0));
        setDefaultValue(PROPERTY_INVOICETAXCASHVATVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CURRENCYCONVERSIONRATEDOCLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDINVVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDORDVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINPAYMENTSCHEDULELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTDEBTPAYMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICEDISCOUNTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINETAXLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICETAXLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSHIPMENTINOUTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGVOLUMEDISCOUNTINVOICELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_REVERSEDINVOICESLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_REVERSEDINVOICESREVERSEDINVOICELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Invoice#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Invoice#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Invoice#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Invoice#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Invoice#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Invoice#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Invoice#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Invoice#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Invoice#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Invoice#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Invoice#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Invoice#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Invoice#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Invoice#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Invoice#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Invoice#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Invoice#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see Invoice#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see Invoice#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see Invoice#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see Invoice#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see Invoice#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see Invoice#PROPERTY_DOCUMENTACTION
     * 
     */
    public String getDocumentAction() {
        return (String) get(PROPERTY_DOCUMENTACTION);
    }
    /**
     * @see Invoice#PROPERTY_DOCUMENTACTION
     * 
     */
    public void setDocumentAction(String documentAction) {
        set(PROPERTY_DOCUMENTACTION, documentAction);
    }

    /**
     * @see Invoice#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Invoice#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Invoice#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see Invoice#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see Invoice#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see Invoice#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see Invoice#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see Invoice#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see Invoice#PROPERTY_TRANSACTIONDOCUMENT
     * 
     */
    public DocumentType getTransactionDocument() {
        return (DocumentType) get(PROPERTY_TRANSACTIONDOCUMENT);
    }
    /**
     * @see Invoice#PROPERTY_TRANSACTIONDOCUMENT
     * 
     */
    public void setTransactionDocument(DocumentType transactionDocument) {
        set(PROPERTY_TRANSACTIONDOCUMENT, transactionDocument);
    }

    /**
     * @see Invoice#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see Invoice#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see Invoice#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Invoice#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Invoice#PROPERTY_PRINT
     * 
     */
    public Boolean isPrint() {
        return (Boolean) get(PROPERTY_PRINT);
    }
    /**
     * @see Invoice#PROPERTY_PRINT
     * 
     */
    public void setPrint(Boolean print) {
        set(PROPERTY_PRINT, print);
    }

    /**
     * @see Invoice#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see Invoice#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see Invoice#PROPERTY_INVOICEDATE
     * 
     */
    public Date getInvoiceDate() {
        return (Date) get(PROPERTY_INVOICEDATE);
    }
    /**
     * @see Invoice#PROPERTY_INVOICEDATE
     * 
     */
    public void setInvoiceDate(Date invoiceDate) {
        set(PROPERTY_INVOICEDATE, invoiceDate);
    }

    /**
     * @see Invoice#PROPERTY_DATEPRINTED
     * 
     */
    public Date getDatePrinted() {
        return (Date) get(PROPERTY_DATEPRINTED);
    }
    /**
     * @see Invoice#PROPERTY_DATEPRINTED
     * 
     */
    public void setDatePrinted(Date datePrinted) {
        set(PROPERTY_DATEPRINTED, datePrinted);
    }

    /**
     * @see Invoice#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see Invoice#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see Invoice#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Invoice#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Invoice#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see Invoice#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see Invoice#PROPERTY_ORDERREFERENCE
     * 
     */
    public String getOrderReference() {
        return (String) get(PROPERTY_ORDERREFERENCE);
    }
    /**
     * @see Invoice#PROPERTY_ORDERREFERENCE
     * 
     */
    public void setOrderReference(String orderReference) {
        set(PROPERTY_ORDERREFERENCE, orderReference);
    }

    /**
     * @see Invoice#PROPERTY_PRINTDISCOUNT
     * 
     */
    public Boolean isPrintDiscount() {
        return (Boolean) get(PROPERTY_PRINTDISCOUNT);
    }
    /**
     * @see Invoice#PROPERTY_PRINTDISCOUNT
     * 
     */
    public void setPrintDiscount(Boolean printDiscount) {
        set(PROPERTY_PRINTDISCOUNT, printDiscount);
    }

    /**
     * @see Invoice#PROPERTY_ORDERDATE
     * 
     */
    public Date getOrderDate() {
        return (Date) get(PROPERTY_ORDERDATE);
    }
    /**
     * @see Invoice#PROPERTY_ORDERDATE
     * 
     */
    public void setOrderDate(Date orderDate) {
        set(PROPERTY_ORDERDATE, orderDate);
    }

    /**
     * @see Invoice#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Invoice#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Invoice#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see Invoice#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see Invoice#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see Invoice#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see Invoice#PROPERTY_CHARGEAMOUNT
     * 
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEAMOUNT);
    }
    /**
     * @see Invoice#PROPERTY_CHARGEAMOUNT
     * 
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        set(PROPERTY_CHARGEAMOUNT, chargeAmount);
    }

    /**
     * @see Invoice#PROPERTY_SUMMEDLINEAMOUNT
     * 
     */
    public BigDecimal getSummedLineAmount() {
        return (BigDecimal) get(PROPERTY_SUMMEDLINEAMOUNT);
    }
    /**
     * @see Invoice#PROPERTY_SUMMEDLINEAMOUNT
     * 
     */
    public void setSummedLineAmount(BigDecimal summedLineAmount) {
        set(PROPERTY_SUMMEDLINEAMOUNT, summedLineAmount);
    }

    /**
     * @see Invoice#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public BigDecimal getGrandTotalAmount() {
        return (BigDecimal) get(PROPERTY_GRANDTOTALAMOUNT);
    }
    /**
     * @see Invoice#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public void setGrandTotalAmount(BigDecimal grandTotalAmount) {
        set(PROPERTY_GRANDTOTALAMOUNT, grandTotalAmount);
    }

    /**
     * @see Invoice#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see Invoice#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see Invoice#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public Boolean isPriceIncludesTax() {
        return (Boolean) get(PROPERTY_PRICEINCLUDESTAX);
    }
    /**
     * @see Invoice#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public void setPriceIncludesTax(Boolean priceIncludesTax) {
        set(PROPERTY_PRICEINCLUDESTAX, priceIncludesTax);
    }

    /**
     * @see Invoice#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see Invoice#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see Invoice#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see Invoice#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see Invoice#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see Invoice#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see Invoice#PROPERTY_CREATELINESFROM
     * 
     */
    public Boolean isCreateLinesFrom() {
        return (Boolean) get(PROPERTY_CREATELINESFROM);
    }
    /**
     * @see Invoice#PROPERTY_CREATELINESFROM
     * 
     */
    public void setCreateLinesFrom(Boolean createLinesFrom) {
        set(PROPERTY_CREATELINESFROM, createLinesFrom);
    }

    /**
     * @see Invoice#PROPERTY_GENERATETO
     * 
     */
    public Boolean isGenerateTo() {
        return (Boolean) get(PROPERTY_GENERATETO);
    }
    /**
     * @see Invoice#PROPERTY_GENERATETO
     * 
     */
    public void setGenerateTo(Boolean generateTo) {
        set(PROPERTY_GENERATETO, generateTo);
    }

    /**
     * @see Invoice#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see Invoice#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see Invoice#PROPERTY_COPYFROM
     * 
     */
    public Boolean isCopyFrom() {
        return (Boolean) get(PROPERTY_COPYFROM);
    }
    /**
     * @see Invoice#PROPERTY_COPYFROM
     * 
     */
    public void setCopyFrom(Boolean copyFrom) {
        set(PROPERTY_COPYFROM, copyFrom);
    }

    /**
     * @see Invoice#PROPERTY_SELFSERVICE
     * 
     */
    public Boolean isSelfService() {
        return (Boolean) get(PROPERTY_SELFSERVICE);
    }
    /**
     * @see Invoice#PROPERTY_SELFSERVICE
     * 
     */
    public void setSelfService(Boolean selfService) {
        set(PROPERTY_SELFSERVICE, selfService);
    }

    /**
     * @see Invoice#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see Invoice#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see Invoice#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see Invoice#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see Invoice#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see Invoice#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see Invoice#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public BigDecimal getWithholdingamount() {
        return (BigDecimal) get(PROPERTY_WITHHOLDINGAMOUNT);
    }
    /**
     * @see Invoice#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public void setWithholdingamount(BigDecimal withholdingamount) {
        set(PROPERTY_WITHHOLDINGAMOUNT, withholdingamount);
    }

    /**
     * @see Invoice#PROPERTY_TAXDATE
     * 
     */
    public Date getTaxDate() {
        return (Date) get(PROPERTY_TAXDATE);
    }
    /**
     * @see Invoice#PROPERTY_TAXDATE
     * 
     */
    public void setTaxDate(Date taxDate) {
        set(PROPERTY_TAXDATE, taxDate);
    }

    /**
     * @see Invoice#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see Invoice#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see Invoice#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public Boolean isPaymentComplete() {
        return (Boolean) get(PROPERTY_PAYMENTCOMPLETE);
    }
    /**
     * @see Invoice#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public void setPaymentComplete(Boolean paymentComplete) {
        set(PROPERTY_PAYMENTCOMPLETE, paymentComplete);
    }

    /**
     * @see Invoice#PROPERTY_TOTALPAID
     * 
     */
    public BigDecimal getTotalPaid() {
        return (BigDecimal) get(PROPERTY_TOTALPAID);
    }
    /**
     * @see Invoice#PROPERTY_TOTALPAID
     * 
     */
    public void setTotalPaid(BigDecimal totalPaid) {
        set(PROPERTY_TOTALPAID, totalPaid);
    }

    /**
     * @see Invoice#PROPERTY_OUTSTANDINGAMOUNT
     * 
     */
    public BigDecimal getOutstandingAmount() {
        return (BigDecimal) get(PROPERTY_OUTSTANDINGAMOUNT);
    }
    /**
     * @see Invoice#PROPERTY_OUTSTANDINGAMOUNT
     * 
     */
    public void setOutstandingAmount(BigDecimal outstandingAmount) {
        set(PROPERTY_OUTSTANDINGAMOUNT, outstandingAmount);
    }

    /**
     * @see Invoice#PROPERTY_DAYSTILLDUE
     * 
     */
    public Long getDaysTillDue() {
        return (Long) get(PROPERTY_DAYSTILLDUE);
    }
    /**
     * @see Invoice#PROPERTY_DAYSTILLDUE
     * 
     */
    public void setDaysTillDue(Long daysTillDue) {
        set(PROPERTY_DAYSTILLDUE, daysTillDue);
    }

    /**
     * @see Invoice#PROPERTY_DUEAMOUNT
     * 
     */
    public BigDecimal getDueAmount() {
        return (BigDecimal) get(PROPERTY_DUEAMOUNT);
    }
    /**
     * @see Invoice#PROPERTY_DUEAMOUNT
     * 
     */
    public void setDueAmount(BigDecimal dueAmount) {
        set(PROPERTY_DUEAMOUNT, dueAmount);
    }

    /**
     * @see Invoice#PROPERTY_LASTCALCULATEDONDATE
     * 
     */
    public Date getLastCalculatedOnDate() {
        return (Date) get(PROPERTY_LASTCALCULATEDONDATE);
    }
    /**
     * @see Invoice#PROPERTY_LASTCALCULATEDONDATE
     * 
     */
    public void setLastCalculatedOnDate(Date lastCalculatedOnDate) {
        set(PROPERTY_LASTCALCULATEDONDATE, lastCalculatedOnDate);
    }

    /**
     * @see Invoice#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see Invoice#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see Invoice#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public PaymentPriority getFINPaymentPriority() {
        return (PaymentPriority) get(PROPERTY_FINPAYMENTPRIORITY);
    }
    /**
     * @see Invoice#PROPERTY_FINPAYMENTPRIORITY
     * 
     */
    public void setFINPaymentPriority(PaymentPriority fINPaymentPriority) {
        set(PROPERTY_FINPAYMENTPRIORITY, fINPaymentPriority);
    }

    /**
     * @see Invoice#PROPERTY_FINALSETTLEMENTDATE
     * 
     */
    public Date getFinalSettlementDate() {
        return (Date) get(PROPERTY_FINALSETTLEMENTDATE);
    }
    /**
     * @see Invoice#PROPERTY_FINALSETTLEMENTDATE
     * 
     */
    public void setFinalSettlementDate(Date finalSettlementDate) {
        set(PROPERTY_FINALSETTLEMENTDATE, finalSettlementDate);
    }

    /**
     * @see Invoice#PROPERTY_DAYSSALESOUTSTANDING
     * 
     */
    public Long getDaysSalesOutstanding() {
        return (Long) get(PROPERTY_DAYSSALESOUTSTANDING);
    }
    /**
     * @see Invoice#PROPERTY_DAYSSALESOUTSTANDING
     * 
     */
    public void setDaysSalesOutstanding(Long daysSalesOutstanding) {
        set(PROPERTY_DAYSSALESOUTSTANDING, daysSalesOutstanding);
    }

    /**
     * @see Invoice#PROPERTY_PERCENTAGEOVERDUE
     * 
     */
    public Long getPercentageOverdue() {
        return (Long) get(PROPERTY_PERCENTAGEOVERDUE);
    }
    /**
     * @see Invoice#PROPERTY_PERCENTAGEOVERDUE
     * 
     */
    public void setPercentageOverdue(Long percentageOverdue) {
        set(PROPERTY_PERCENTAGEOVERDUE, percentageOverdue);
    }

    /**
     * @see Invoice#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see Invoice#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see Invoice#PROPERTY_CALCULATEPROMOTIONS
     * 
     */
    public Boolean isCalculatePromotions() {
        return (Boolean) get(PROPERTY_CALCULATEPROMOTIONS);
    }
    /**
     * @see Invoice#PROPERTY_CALCULATEPROMOTIONS
     * 
     */
    public void setCalculatePromotions(Boolean calculatePromotions) {
        set(PROPERTY_CALCULATEPROMOTIONS, calculatePromotions);
    }

    /**
     * @see Invoice#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see Invoice#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see Invoice#PROPERTY_APRMADDPAYMENT
     * 
     */
    public Boolean isAPRMAddpayment() {
        return (Boolean) get(PROPERTY_APRMADDPAYMENT);
    }
    /**
     * @see Invoice#PROPERTY_APRMADDPAYMENT
     * 
     */
    public void setAPRMAddpayment(Boolean aPRMAddpayment) {
        set(PROPERTY_APRMADDPAYMENT, aPRMAddpayment);
    }

    /**
     * @see Invoice#PROPERTY_CASHVAT
     * 
     */
    public Boolean isCashVAT() {
        return (Boolean) get(PROPERTY_CASHVAT);
    }
    /**
     * @see Invoice#PROPERTY_CASHVAT
     * 
     */
    public void setCashVAT(Boolean cashVAT) {
        set(PROPERTY_CASHVAT, cashVAT);
    }

    /**
     * @see Invoice#PROPERTY_APRMPROCESSINVOICE
     * 
     */
    public String getAPRMProcessinvoice() {
        return (String) get(PROPERTY_APRMPROCESSINVOICE);
    }
    /**
     * @see Invoice#PROPERTY_APRMPROCESSINVOICE
     * 
     */
    public void setAPRMProcessinvoice(String aPRMProcessinvoice) {
        set(PROPERTY_APRMPROCESSINVOICE, aPRMProcessinvoice);
    }

    /**
     * @see Invoice#PROPERTY_PREPAYMENTAMT
     * 
     */
    public BigDecimal getPrepaymentamt() {
        return (BigDecimal) get(PROPERTY_PREPAYMENTAMT);
    }
    /**
     * @see Invoice#PROPERTY_PREPAYMENTAMT
     * 
     */
    public void setPrepaymentamt(BigDecimal prepaymentamt) {
        set(PROPERTY_PREPAYMENTAMT, prepaymentamt);
    }

    /**
     * @see Invoice#PROPERTY_CREATELINESFROMORDER
     * 
     */
    public Boolean isCreateLinesFromOrder() {
        return (Boolean) get(PROPERTY_CREATELINESFROMORDER);
    }
    /**
     * @see Invoice#PROPERTY_CREATELINESFROMORDER
     * 
     */
    public void setCreateLinesFromOrder(Boolean createLinesFromOrder) {
        set(PROPERTY_CREATELINESFROMORDER, createLinesFromOrder);
    }

    /**
     * @see Invoice#PROPERTY_CREATELINESFROMSHIPMENT
     * 
     */
    public Boolean isCreateLinesFromShipment() {
        return (Boolean) get(PROPERTY_CREATELINESFROMSHIPMENT);
    }
    /**
     * @see Invoice#PROPERTY_CREATELINESFROMSHIPMENT
     * 
     */
    public void setCreateLinesFromShipment(Boolean createLinesFromShipment) {
        set(PROPERTY_CREATELINESFROMSHIPMENT, createLinesFromShipment);
    }

    /**
     * @see Invoice#PROPERTY_PAIDAMOUNTATINVOICING
     * 
     */
    public BigDecimal getPaidAmountAtInvoicing() {
        return (BigDecimal) get(PROPERTY_PAIDAMOUNTATINVOICING);
    }
    /**
     * @see Invoice#PROPERTY_PAIDAMOUNTATINVOICING
     * 
     */
    public void setPaidAmountAtInvoicing(BigDecimal paidAmountAtInvoicing) {
        set(PROPERTY_PAIDAMOUNTATINVOICING, paidAmountAtInvoicing);
    }

    /**
     * @see Invoice#PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE
     * 
     */
    public String getExternalBusinessPartnerReference() {
        return (String) get(PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE);
    }
    /**
     * @see Invoice#PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE
     * 
     */
    public void setExternalBusinessPartnerReference(String externalBusinessPartnerReference) {
        set(PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE, externalBusinessPartnerReference);
    }

    /**
     * @see Invoice#PROPERTY_ALTERNATELOCATION
     * 
     */
    public org.openbravo.model.common.geography.Location getAlternateLocation() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_ALTERNATELOCATION);
    }
    /**
     * @see Invoice#PROPERTY_ALTERNATELOCATION
     * 
     */
    public void setAlternateLocation(org.openbravo.model.common.geography.Location alternateLocation) {
        set(PROPERTY_ALTERNATELOCATION, alternateLocation);
    }

    /**
     * @see Invoice#PROPERTY_EINVOICESTATUS
     * 
     */
    public String getEinvoiceStatus() {
        return (String) get(PROPERTY_EINVOICESTATUS);
    }
    /**
     * @see Invoice#PROPERTY_EINVOICESTATUS
     * 
     */
    public void setEinvoiceStatus(String einvoiceStatus) {
        set(PROPERTY_EINVOICESTATUS, einvoiceStatus);
    }

    /**
     * @see Invoice#PROPERTY_EINVOICEGENERATED
     * 
     */
    public Date getEinvoiceGenerated() {
        return (Date) get(PROPERTY_EINVOICEGENERATED);
    }
    /**
     * @see Invoice#PROPERTY_EINVOICEGENERATED
     * 
     */
    public void setEinvoiceGenerated(Date einvoiceGenerated) {
        set(PROPERTY_EINVOICEGENERATED, einvoiceGenerated);
    }

    /**
     * @see Invoice#PROPERTY_EINVOICEEXTERNALID
     * 
     */
    public String getEinvoiceExternalID() {
        return (String) get(PROPERTY_EINVOICEEXTERNALID);
    }
    /**
     * @see Invoice#PROPERTY_EINVOICEEXTERNALID
     * 
     */
    public void setEinvoiceExternalID(String einvoiceExternalID) {
        set(PROPERTY_EINVOICEEXTERNALID, einvoiceExternalID);
    }

    /**
     * @see Invoice#PROPERTY_EINVOICESENDSTATUS
     * 
     */
    public String getEinvoiceSendStatus() {
        return (String) get(PROPERTY_EINVOICESENDSTATUS);
    }
    /**
     * @see Invoice#PROPERTY_EINVOICESENDSTATUS
     * 
     */
    public void setEinvoiceSendStatus(String einvoiceSendStatus) {
        set(PROPERTY_EINVOICESENDSTATUS, einvoiceSendStatus);
    }

    /**
     * @see Invoice#PROPERTY_EINVOICESENT
     * 
     */
    public Date getEinvoiceSent() {
        return (Date) get(PROPERTY_EINVOICESENT);
    }
    /**
     * @see Invoice#PROPERTY_EINVOICESENT
     * 
     */
    public void setEinvoiceSent(Date einvoiceSent) {
        set(PROPERTY_EINVOICESENT, einvoiceSent);
    }

    /**
     * Help: {@literal Invoice Cash VAT View that sums the percentage, tax amount and taxable amount per payment
     *       detail.}<br>
     * @see InvoiceTaxCashVAT_V
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceTaxCashVAT_V> getInvoiceTaxCashVATVList() {
      return (List<InvoiceTaxCashVAT_V>) get(PROPERTY_INVOICETAXCASHVATVLIST);
    }

    /**
     * Help: {@literal Invoice Cash VAT View that sums the percentage, tax amount and taxable amount per payment
     *       detail.}<br>
     * @see InvoiceTaxCashVAT_V
     * 
     */
    public void setInvoiceTaxCashVATVList(List<InvoiceTaxCashVAT_V> invoiceTaxCashVATVList) {
        set(PROPERTY_INVOICETAXCASHVATVLIST, invoiceTaxCashVATVList);
    }

    /**
     * Help: {@literal Define another currency conversion rate for this document different than Openbravo systema
     *       exchange rate.}<br>
     * @see ConversionRateDoc
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ConversionRateDoc> getCurrencyConversionRateDocList() {
      return (List<ConversionRateDoc>) get(PROPERTY_CURRENCYCONVERSIONRATEDOCLIST);
    }

    /**
     * Help: {@literal Define another currency conversion rate for this document different than Openbravo systema
     *       exchange rate.}<br>
     * @see ConversionRateDoc
     * 
     */
    public void setCurrencyConversionRateDocList(List<ConversionRateDoc> currencyConversionRateDocList) {
        set(PROPERTY_CURRENCYCONVERSIONRATEDOCLIST, currencyConversionRateDocList);
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
     * Help: {@literal Refers to the amount of money to be paid or collected.}<br>
     * @see DebtPayment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DebtPayment> getFinancialMgmtDebtPaymentList() {
      return (List<DebtPayment>) get(PROPERTY_FINANCIALMGMTDEBTPAYMENTLIST);
    }

    /**
     * Help: {@literal Refers to the amount of money to be paid or collected.}<br>
     * @see DebtPayment
     * 
     */
    public void setFinancialMgmtDebtPaymentList(List<DebtPayment> financialMgmtDebtPaymentList) {
        set(PROPERTY_FINANCIALMGMTDEBTPAYMENTLIST, financialMgmtDebtPaymentList);
    }

    /**
     * Help: {@literal Contains the discounts apply to the whole invoice}<br>
     * @see InvoiceDiscount
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceDiscount> getInvoiceDiscountList() {
      return (List<InvoiceDiscount>) get(PROPERTY_INVOICEDISCOUNTLIST);
    }

    /**
     * Help: {@literal Contains the discounts apply to the whole invoice}<br>
     * @see InvoiceDiscount
     * 
     */
    public void setInvoiceDiscountList(List<InvoiceDiscount> invoiceDiscountList) {
        set(PROPERTY_INVOICEDISCOUNTLIST, invoiceDiscountList);
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
     * Help: {@literal Contains the total tax due based on the Invoice Lines}<br>
     * @see InvoiceTax
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceTax> getInvoiceTaxList() {
      return (List<InvoiceTax>) get(PROPERTY_INVOICETAXLIST);
    }

    /**
     * Help: {@literal Contains the total tax due based on the Invoice Lines}<br>
     * @see InvoiceTax
     * 
     */
    public void setInvoiceTaxList(List<InvoiceTax> invoiceTaxList) {
        set(PROPERTY_INVOICETAXLIST, invoiceTaxList);
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
     * Help: {@literal Contains all the invoices generated due to rappels conditions}<br>
     * @see DiscountInvoice
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DiscountInvoice> getPricingVolumeDiscountInvoiceList() {
      return (List<DiscountInvoice>) get(PROPERTY_PRICINGVOLUMEDISCOUNTINVOICELIST);
    }

    /**
     * Help: {@literal Contains all the invoices generated due to rappels conditions}<br>
     * @see DiscountInvoice
     * 
     */
    public void setPricingVolumeDiscountInvoiceList(List<DiscountInvoice> pricingVolumeDiscountInvoiceList) {
        set(PROPERTY_PRICINGVOLUMEDISCOUNTINVOICELIST, pricingVolumeDiscountInvoiceList);
    }

    /**
     * Help: {@literal It stores the reversed invoices associated with an invoice}<br>
     * @see ReversedInvoice
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReversedInvoice> getReversedInvoicesList() {
      return (List<ReversedInvoice>) get(PROPERTY_REVERSEDINVOICESLIST);
    }

    /**
     * Help: {@literal It stores the reversed invoices associated with an invoice}<br>
     * @see ReversedInvoice
     * 
     */
    public void setReversedInvoicesList(List<ReversedInvoice> reversedInvoicesList) {
        set(PROPERTY_REVERSEDINVOICESLIST, reversedInvoicesList);
    }

    /**
     * Help: {@literal It stores the reversed invoices associated with an invoice}<br>
     * @see ReversedInvoice
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReversedInvoice> getReversedInvoicesReversedInvoiceList() {
      return (List<ReversedInvoice>) get(PROPERTY_REVERSEDINVOICESREVERSEDINVOICELIST);
    }

    /**
     * Help: {@literal It stores the reversed invoices associated with an invoice}<br>
     * @see ReversedInvoice
     * 
     */
    public void setReversedInvoicesReversedInvoiceList(List<ReversedInvoice> reversedInvoicesReversedInvoiceList) {
        set(PROPERTY_REVERSEDINVOICESREVERSEDINVOICELIST, reversedInvoicesReversedInvoiceList);
    }

}
