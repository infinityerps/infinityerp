
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
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.Order;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity InvoiceV2 (stored in table C_Invoice_V2).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceV2 extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Invoice_V2";
    public static final String ENTITY_NAME = "InvoiceV2";

    /**
     * Property id stored in column C_Invoice_V2_ID in table C_Invoice_V2 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_Invoice_V2<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property client stored in column AD_Client_ID in table C_Invoice_V2 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Invoice_V2 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Invoice_V2 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Invoice_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Invoice_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Invoice_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Invoice_V2 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property salesTransaction stored in column IsSOTrx in table C_Invoice_V2<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property documentNo stored in column DocumentNo in table C_Invoice_V2 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property documentStatus stored in column DocStatus in table C_Invoice_V2<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property documentAction stored in column DocAction in table C_Invoice_V2<br>
     * Help: {@literal 
     *       You find the current status in the Document Status field. The options are listed in a
     *       popup}
     * 
     */
    public static final String PROPERTY_DOCUMENTACTION = "documentAction";

    /**
     * Property print stored in column IsPrinted in table C_Invoice_V2<br>
     * Help: {@literal The Printed checkbox indicates if this document or line will included when printing.}
     * 
     */
    public static final String PROPERTY_PRINT = "print";

    /**
     * Property printDiscount stored in column IsDiscountPrinted in table C_Invoice_V2<br>
     * Help: {@literal The Discount Printed Checkbox indicates if the discount will be printed on the document.}
     * 
     */
    public static final String PROPERTY_PRINTDISCOUNT = "printDiscount";

    /**
     * Property processNow stored in column Processing in table C_Invoice_V2<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_Invoice_V2<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property documentType stored in column C_DocType_ID in table C_Invoice_V2<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property transactionDocument stored in column C_DocTypeTarget_ID in table C_Invoice_V2<br>
     * Help: {@literal Specifies document subtype (eg. POS Order, Return Material, etc.) that each document (such
     *       as Sales Invoice, Purchase Order, etc.). Various document subtypes usually differ on the
     *       consequences they have. You can convert document types (e.g. from Offer to Order).  The conversion
     *       is then reflected in the current type.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDOCUMENT = "transactionDocument";

    /**
     * Property salesOrder stored in column C_Order_ID in table C_Invoice_V2<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property description stored in column Description in table C_Invoice_V2<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table C_Invoice_V2<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property invoiceDate stored in column DateInvoiced in table C_Invoice_V2<br>
     * Help: {@literal The Date Invoice indicates the date printed on the invoice.}
     * 
     */
    public static final String PROPERTY_INVOICEDATE = "invoiceDate";

    /**
     * Property datePrinted stored in column DatePrinted in table C_Invoice_V2<br>
     * Help: {@literal Indicates the Date that a document was printed.}
     * 
     */
    public static final String PROPERTY_DATEPRINTED = "datePrinted";

    /**
     * Property accountingDate stored in column DateAcct in table C_Invoice_V2<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Invoice_V2<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table C_Invoice_V2<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property userContact stored in column AD_User_ID in table C_Invoice_V2<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property businessPartnerCategory stored in column C_BP_Group_ID in table C_Invoice_V2<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property orderReference stored in column POReference in table C_Invoice_V2<br>
     * Help: {@literal This can be used to input a reference for this specific transaction. For example, a
     *       Purchase Order number can be input on a Sales Order for easier reference.}
     * 
     */
    public static final String PROPERTY_ORDERREFERENCE = "orderReference";

    /**
     * Property orderDate stored in column DateOrdered in table C_Invoice_V2<br>
     * Help: {@literal Indicates the Date an item was ordered.}
     * 
     */
    public static final String PROPERTY_ORDERDATE = "orderDate";

    /**
     * Property currency stored in column C_Currency_ID in table C_Invoice_V2<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_Invoice_V2<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property priceList stored in column M_PriceList_ID in table C_Invoice_V2<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_Invoice_V2<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table C_Invoice_V2<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property activity stored in column C_Activity_ID in table C_Invoice_V2<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property charge stored in column C_Charge_ID in table C_Invoice_V2<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property chargeAmount stored in column ChargeAmt in table C_Invoice_V2<br>
     * Help: {@literal The Charge Amount indicates the amount for an additional charge.}
     * 
     */
    public static final String PROPERTY_CHARGEAMOUNT = "chargeAmount";

    /**
     * Property summedLineAmount stored in column TotalLines in table C_Invoice_V2<br>
     * Help: {@literal The Total amount displays the total of all lines in document currency}
     * 
     */
    public static final String PROPERTY_SUMMEDLINEAMOUNT = "summedLineAmount";

    /**
     * Property grandTotalAmount stored in column GrandTotal in table C_Invoice_V2<br>
     * Help: {@literal The Grand Total displays the total amount including Tax and Freight in document currency}
     * 
     */
    public static final String PROPERTY_GRANDTOTALAMOUNT = "grandTotalAmount";

    /**
     * Property multiplier stored in column Multiplier in table C_Invoice_V2<br>
     * Help: {@literal <p>Number of times needed to run this&nbsp;sequence in order to satisfy the complete
     *       process plan.</p>}
     * 
     */
    public static final String PROPERTY_MULTIPLIER = "multiplier";


    public InvoiceV2() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SALESTRANSACTION, false);
        setDefaultValue(PROPERTY_PRINT, false);
        setDefaultValue(PROPERTY_PRINTDISCOUNT, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceV2#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceV2#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceV2#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see InvoiceV2#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see InvoiceV2#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceV2#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceV2#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceV2#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceV2#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceV2#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceV2#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceV2#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceV2#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceV2#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceV2#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceV2#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceV2#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceV2#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceV2#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see InvoiceV2#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTACTION
     * 
     */
    public String getDocumentAction() {
        return (String) get(PROPERTY_DOCUMENTACTION);
    }
    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTACTION
     * 
     */
    public void setDocumentAction(String documentAction) {
        set(PROPERTY_DOCUMENTACTION, documentAction);
    }

    /**
     * @see InvoiceV2#PROPERTY_PRINT
     * 
     */
    public Boolean isPrint() {
        return (Boolean) get(PROPERTY_PRINT);
    }
    /**
     * @see InvoiceV2#PROPERTY_PRINT
     * 
     */
    public void setPrint(Boolean print) {
        set(PROPERTY_PRINT, print);
    }

    /**
     * @see InvoiceV2#PROPERTY_PRINTDISCOUNT
     * 
     */
    public Boolean isPrintDiscount() {
        return (Boolean) get(PROPERTY_PRINTDISCOUNT);
    }
    /**
     * @see InvoiceV2#PROPERTY_PRINTDISCOUNT
     * 
     */
    public void setPrintDiscount(Boolean printDiscount) {
        set(PROPERTY_PRINTDISCOUNT, printDiscount);
    }

    /**
     * @see InvoiceV2#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see InvoiceV2#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see InvoiceV2#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see InvoiceV2#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see InvoiceV2#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see InvoiceV2#PROPERTY_TRANSACTIONDOCUMENT
     * 
     */
    public DocumentType getTransactionDocument() {
        return (DocumentType) get(PROPERTY_TRANSACTIONDOCUMENT);
    }
    /**
     * @see InvoiceV2#PROPERTY_TRANSACTIONDOCUMENT
     * 
     */
    public void setTransactionDocument(DocumentType transactionDocument) {
        set(PROPERTY_TRANSACTIONDOCUMENT, transactionDocument);
    }

    /**
     * @see InvoiceV2#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see InvoiceV2#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see InvoiceV2#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see InvoiceV2#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see InvoiceV2#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see InvoiceV2#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see InvoiceV2#PROPERTY_INVOICEDATE
     * 
     */
    public Date getInvoiceDate() {
        return (Date) get(PROPERTY_INVOICEDATE);
    }
    /**
     * @see InvoiceV2#PROPERTY_INVOICEDATE
     * 
     */
    public void setInvoiceDate(Date invoiceDate) {
        set(PROPERTY_INVOICEDATE, invoiceDate);
    }

    /**
     * @see InvoiceV2#PROPERTY_DATEPRINTED
     * 
     */
    public Date getDatePrinted() {
        return (Date) get(PROPERTY_DATEPRINTED);
    }
    /**
     * @see InvoiceV2#PROPERTY_DATEPRINTED
     * 
     */
    public void setDatePrinted(Date datePrinted) {
        set(PROPERTY_DATEPRINTED, datePrinted);
    }

    /**
     * @see InvoiceV2#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see InvoiceV2#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see InvoiceV2#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see InvoiceV2#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see InvoiceV2#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see InvoiceV2#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see InvoiceV2#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see InvoiceV2#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see InvoiceV2#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see InvoiceV2#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see InvoiceV2#PROPERTY_ORDERREFERENCE
     * 
     */
    public String getOrderReference() {
        return (String) get(PROPERTY_ORDERREFERENCE);
    }
    /**
     * @see InvoiceV2#PROPERTY_ORDERREFERENCE
     * 
     */
    public void setOrderReference(String orderReference) {
        set(PROPERTY_ORDERREFERENCE, orderReference);
    }

    /**
     * @see InvoiceV2#PROPERTY_ORDERDATE
     * 
     */
    public Date getOrderDate() {
        return (Date) get(PROPERTY_ORDERDATE);
    }
    /**
     * @see InvoiceV2#PROPERTY_ORDERDATE
     * 
     */
    public void setOrderDate(Date orderDate) {
        set(PROPERTY_ORDERDATE, orderDate);
    }

    /**
     * @see InvoiceV2#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see InvoiceV2#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see InvoiceV2#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see InvoiceV2#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see InvoiceV2#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see InvoiceV2#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see InvoiceV2#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see InvoiceV2#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see InvoiceV2#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see InvoiceV2#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see InvoiceV2#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see InvoiceV2#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see InvoiceV2#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see InvoiceV2#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see InvoiceV2#PROPERTY_CHARGEAMOUNT
     * 
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEAMOUNT);
    }
    /**
     * @see InvoiceV2#PROPERTY_CHARGEAMOUNT
     * 
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        set(PROPERTY_CHARGEAMOUNT, chargeAmount);
    }

    /**
     * @see InvoiceV2#PROPERTY_SUMMEDLINEAMOUNT
     * 
     */
    public BigDecimal getSummedLineAmount() {
        return (BigDecimal) get(PROPERTY_SUMMEDLINEAMOUNT);
    }
    /**
     * @see InvoiceV2#PROPERTY_SUMMEDLINEAMOUNT
     * 
     */
    public void setSummedLineAmount(BigDecimal summedLineAmount) {
        set(PROPERTY_SUMMEDLINEAMOUNT, summedLineAmount);
    }

    /**
     * @see InvoiceV2#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public BigDecimal getGrandTotalAmount() {
        return (BigDecimal) get(PROPERTY_GRANDTOTALAMOUNT);
    }
    /**
     * @see InvoiceV2#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public void setGrandTotalAmount(BigDecimal grandTotalAmount) {
        set(PROPERTY_GRANDTOTALAMOUNT, grandTotalAmount);
    }

    /**
     * @see InvoiceV2#PROPERTY_MULTIPLIER
     * 
     */
    public BigDecimal getMultiplier() {
        return (BigDecimal) get(PROPERTY_MULTIPLIER);
    }
    /**
     * @see InvoiceV2#PROPERTY_MULTIPLIER
     * 
     */
    public void setMultiplier(BigDecimal multiplier) {
        set(PROPERTY_MULTIPLIER, multiplier);
    }

}
