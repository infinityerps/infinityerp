
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
package org.openbravo.model.common.businesspartner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.system.Language;
import org.openbravo.model.common.bank.BankAccount;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.common.hcm.SalaryCategory;
import org.openbravo.model.common.invoice.InvoiceSchedule;
import org.openbravo.model.common.plm.ApprovedVendor;
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.Incoterms;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
import org.openbravo.model.pricing.pricelist.PriceList;
/**
 * Entity class for entity BusinessPartner (stored in table C_BPartner).
 * <br>
 * Help: {@literal The Business Partner table defines any entity with whom an organization transacts. The
     *       entity could be a customer or/and a vendor or/and an employee.
     *       Customer defines a Business Partner
     *       who is a customer of this organization.  If the Customer check box is selected then the necessary
     *       fields will display. 
     *       Vendor defines a Business Partner that is a Vendor for this Organization.  If
     *       the Vendor check box is selected the necessary fields will display.
     *       Employee defines a Business
     *       Partner who is an Employee of this organization.  If the Employee is also a Sales Representative
     *       then the check box should be selected.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class BusinessPartner extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BPartner";
    public static final String ENTITY_NAME = "BusinessPartner";

    /**
     * Property id stored in column C_BPartner_ID in table C_BPartner<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_BPartner 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BPartner 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BPartner 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BPartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BPartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BPartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BPartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table C_BPartner<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table C_BPartner 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property name2 stored in column Name2 in table C_BPartner<br>
     * Help: {@literal Fiscal Name of the Business Partner.}
     * 
     */
    public static final String PROPERTY_NAME2 = "name2";

    /**
     * Property description stored in column Description in table C_BPartner<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property summaryLevel stored in column IsSummary in table C_BPartner<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property businessPartnerCategory stored in column C_BP_Group_ID in table C_BPartner<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property oneTimeTransaction stored in column IsOneTime in table C_BPartner
     * 
     */
    public static final String PROPERTY_ONETIMETRANSACTION = "oneTimeTransaction";

    /**
     * Property potentialCustomer stored in column IsProspect in table C_BPartner<br>
     * Help: {@literal The Prospect checkbox indicates an entity that is an active prospect or customer.}
     * 
     */
    public static final String PROPERTY_POTENTIALCUSTOMER = "potentialCustomer";

    /**
     * Property vendor stored in column IsVendor in table C_BPartner<br>
     * Help: {@literal The Vendor checkbox indicates if this Business Partner is a Vendor.  If it is selected,
     *       additional fields will display which further identify this vendor.}
     * 
     */
    public static final String PROPERTY_VENDOR = "vendor";

    /**
     * Property customer stored in column IsCustomer in table C_BPartner<br>
     * Help: {@literal Indicates a business partner that is your customer, ie. that will be making purchases from
     *       you. If selected, additional fields will display further details that need to be entered for a
     *       customer.}
     * 
     */
    public static final String PROPERTY_CUSTOMER = "customer";

    /**
     * Property employee stored in column IsEmployee in table C_BPartner<br>
     * Help: {@literal The Employee checkbox indicates if this Business Partner is an Employee.  If it is
     *       selected, additional fields will display which further identify this employee.}
     * 
     */
    public static final String PROPERTY_EMPLOYEE = "employee";

    /**
     * Property isSalesRepresentative stored in column IsSalesRep in table C_BPartner<br>
     * Help: {@literal The Sales Rep checkbox indicates if this employee is also a sales representative.}
     * 
     */
    public static final String PROPERTY_ISSALESREPRESENTATIVE = "isSalesRepresentative";

    /**
     * Property referenceNo stored in column ReferenceNo in table C_BPartner<br>
     * Help: {@literal The reference number can be printed on orders and invoices to allow your business partner
     *       to faster identify your records.}
     * 
     */
    public static final String PROPERTY_REFERENCENO = "referenceNo";

    /**
     * Property dUNS stored in column DUNS in table C_BPartner<br>
     * Help: {@literal Used for EDI - For details see   www.dnb.com/dunsno/list.htm}
     * 
     */
    public static final String PROPERTY_DUNS = "dUNS";

    /**
     * Property uRL stored in column URL in table C_BPartner<br>
     * Help: {@literal The URL defines an online address for this element.}
     * 
     */
    public static final String PROPERTY_URL = "uRL";

    /**
     * Property language stored in column AD_Language in table C_BPartner<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property taxID stored in column TaxID in table C_BPartner<br>
     * Help: {@literal The Tax ID field identifies the legal Identification number of this Entity.}
     * 
     */
    public static final String PROPERTY_TAXID = "taxID";

    /**
     * Property taxExempt stored in column IsTaxExempt in table C_BPartner<br>
     * Help: {@literal If a business partner is exempt from tax, the exempt tax rate is used. For this, you need
     *       to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is
     *       required for tax reporting, so that you can track tax exempt transactions.}
     * 
     */
    public static final String PROPERTY_TAXEXEMPT = "taxExempt";

    /**
     * Property invoiceSchedule stored in column C_InvoiceSchedule_ID in table C_BPartner<br>
     * Help: {@literal The Invoice Schedule identifies the frequency used when generating invoices.}
     * 
     */
    public static final String PROPERTY_INVOICESCHEDULE = "invoiceSchedule";

    /**
     * Property valuation stored in column Rating in table C_BPartner<br>
     * Help: {@literal The Rating is used to differentiate the importance}
     * 
     */
    public static final String PROPERTY_VALUATION = "valuation";

    /**
     * Property volumeOfSales stored in column SalesVolume in table C_BPartner<br>
     * Help: {@literal The Sales Volume indicates the total volume of sales for a Business Partner.}
     * 
     */
    public static final String PROPERTY_VOLUMEOFSALES = "volumeOfSales";

    /**
     * Property noOfEmployees stored in column NumberEmployees in table C_BPartner<br>
     * Help: {@literal Indicates the number of employees for this Business Partner.  This field displays only for
     *       Prospects.}
     * 
     */
    public static final String PROPERTY_NOOFEMPLOYEES = "noOfEmployees";

    /**
     * Property nAICSSIC stored in column NAICS in table C_BPartner<br>
     * Help: {@literal The NAICS/SIC identifies either of these codes that may be applicable to this Business
     *       Partner.}
     * 
     */
    public static final String PROPERTY_NAICSSIC = "nAICSSIC";

    /**
     * Property dateOfFirstSale stored in column FirstSale in table C_BPartner<br>
     * Help: {@literal The First Sale Date identifies the date of the first sale to this Business Partner}
     * 
     */
    public static final String PROPERTY_DATEOFFIRSTSALE = "dateOfFirstSale";

    /**
     * Property acquisitionCost stored in column AcqusitionCost in table C_BPartner<br>
     * Help: {@literal The Acquisition Cost identifies the cost associated with making this prospect a customer.}
     * 
     */
    public static final String PROPERTY_ACQUISITIONCOST = "acquisitionCost";

    /**
     * Property expectedLifetimeRevenue stored in column PotentialLifeTimeValue in table C_BPartner<br>
     * Help: {@literal The Potential Life Time Value is the anticipated revenue to be generated by this Business
     *       Partner.}
     * 
     */
    public static final String PROPERTY_EXPECTEDLIFETIMEREVENUE = "expectedLifetimeRevenue";

    /**
     * Property lifetimeRevenueToDate stored in column ActualLifeTimeValue in table C_BPartner<br>
     * Help: {@literal The Actual Life Time Value is the recorded revenue to be generated by this Business
     *       Partner.}
     * 
     */
    public static final String PROPERTY_LIFETIMEREVENUETODATE = "lifetimeRevenueToDate";

    /**
     * Property share stored in column ShareOfCustomer in table C_BPartner<br>
     * Help: {@literal The Share indicates the percentage of this Business Partner's volume of the products
     *       supplied.}
     * 
     */
    public static final String PROPERTY_SHARE = "share";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_BPartner<br>
     * Help: {@literal Form of Payment indicates the method of payment used for this transaction (eg. cash, wire
     *       transfer, etc.)}
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property creditLimit stored in column SO_CreditLimit in table C_BPartner<br>
     * Help: {@literal The Credit Line Limit indicates the total amount allowed 'on account'.  If this is
     *       exceeded a warning message will be generated.}
     * 
     */
    public static final String PROPERTY_CREDITLIMIT = "creditLimit";

    /**
     * Property creditUsed stored in column SO_CreditUsed in table C_BPartner<br>
     * Help: {@literal The Customer Balance indicates the total amount of open or unpaid invoices for this
     *       Business Partner.}
     * 
     */
    public static final String PROPERTY_CREDITUSED = "creditUsed";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_BPartner<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property priceList stored in column M_PriceList_ID in table C_BPartner<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property printDiscount stored in column IsDiscountPrinted in table C_BPartner<br>
     * Help: {@literal The Discount Printed Checkbox indicates if the discount will be printed on the document.}
     * 
     */
    public static final String PROPERTY_PRINTDISCOUNT = "printDiscount";

    /**
     * Property orderDescription stored in column SO_Description in table C_BPartner<br>
     * Help: {@literal The Order Description identifies the standard description to use on orders for this
     *       Customer.}
     * 
     */
    public static final String PROPERTY_ORDERDESCRIPTION = "orderDescription";

    /**
     * Property orderReference stored in column POReference in table C_BPartner<br>
     * Help: {@literal This can be used to input a reference for this specific transaction. For example, a
     *       Purchase Order number can be input on a Sales Order for easier reference.}
     * 
     */
    public static final String PROPERTY_ORDERREFERENCE = "orderReference";

    /**
     * Property pOFormOfPayment stored in column PaymentRulePO in table C_BPartner<br>
     * Help: {@literal The Payment Rule indicates the method of purchase payment.}
     * 
     */
    public static final String PROPERTY_POFORMOFPAYMENT = "pOFormOfPayment";

    /**
     * Property purchasePricelist stored in column PO_PriceList_ID in table C_BPartner<br>
     * Help: {@literal Identifies the price list used by a Vendor for products purchased by this organization.}
     * 
     */
    public static final String PROPERTY_PURCHASEPRICELIST = "purchasePricelist";

    /**
     * Property pOPaymentTerms stored in column PO_PaymentTerm_ID in table C_BPartner<br>
     * Help: {@literal The PO Payment Term indicates the payment term that will be used when this purchase order
     *       becomes an invoice.}
     * 
     */
    public static final String PROPERTY_POPAYMENTTERMS = "pOPaymentTerms";

    /**
     * Property numberOfCopies stored in column DocumentCopies in table C_BPartner<br>
     * Help: {@literal The Document Copies indicates the number of copies of each document that will be
     *       generated.}
     * 
     */
    public static final String PROPERTY_NUMBEROFCOPIES = "numberOfCopies";

    /**
     * Property greeting stored in column C_Greeting_ID in table C_BPartner<br>
     * Help: {@literal The Greeting identifies the greeting to print on correspondence.}
     * 
     */
    public static final String PROPERTY_GREETING = "greeting";

    /**
     * Property invoiceTerms stored in column InvoiceRule in table C_BPartner<br>
     * Help: {@literal The Invoice Rule defines how a Business Partner is invoiced and the frequency of
     *       invoicing.}
     * 
     */
    public static final String PROPERTY_INVOICETERMS = "invoiceTerms";

    /**
     * Property deliveryTerms stored in column DeliveryRule in table C_BPartner<br>
     * Help: {@literal The Delivery Rule indicates when an order should be delivered. For example should the
     *       order be delivered when the entire order is complete, when a line is complete or as the products
     *       become available.}
     * 
     */
    public static final String PROPERTY_DELIVERYTERMS = "deliveryTerms";

    /**
     * Property deliveryMethod stored in column DeliveryViaRule in table C_BPartner<br>
     * Help: {@literal The Delivery Via indicates how the products should be delivered. For example, will the
     *       order be picked up or shipped.}
     * 
     */
    public static final String PROPERTY_DELIVERYMETHOD = "deliveryMethod";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table C_BPartner<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property partnerParent stored in column BPartner_Parent_ID in table C_BPartner<br>
     * Help: {@literal The parent (organization) of the Business Partner for reporting purposes.}
     * 
     */
    public static final String PROPERTY_PARTNERPARENT = "partnerParent";

    /**
     * Property creditStatus stored in column SOCreditStatus in table C_BPartner<br>
     * Help: {@literal For Documentation only}
     * 
     */
    public static final String PROPERTY_CREDITSTATUS = "creditStatus";

    /**
     * Property forcedOrg stored in column AD_Forced_Org_ID in table C_BPartner
     * 
     */
    public static final String PROPERTY_FORCEDORG = "forcedOrg";

    /**
     * Property pricesShownInOrder stored in column ShowPriceInOrder in table C_BPartner<br>
     * Help: {@literal When not checked prices are not shown (left blank) in the printed order document}
     * 
     */
    public static final String PROPERTY_PRICESSHOWNINORDER = "pricesShownInOrder";

    /**
     * Property invoiceGrouping stored in column Invoicegrouping in table C_BPartner<br>
     * Help: {@literal For scheduled invoicing, break into different invoices if the related values are
     *       different. The value is used as a binary code with 15 digits:
     *       1.-Order organization
     *       (AD_Org_ID)
     *       2.-Order (C_Order_ID)
     *       3.-Shipment (M_InOut_ID)
     *       4.-Invoice location (BillTo_ID)
     *       5.-Ship
     *       location (C_BPartner_Location_ID)
     *       6.-Sales representative (SalesRep_ID)
     *       7.-Payment rule
     *       (PaymentRule)
     *       8.-Payment term (C_PaymentTerm_ID)
     *       9.-Currency (C_Currency_ID)
     *       10.-Campaign
     *       (C_Campaign_ID)
     *       11.-Project (C_Project_ID)
     *       12.-Activity (C_Activity_ID)
     *       13.-Transaction organization
     *       (AD_OrgTrx_ID)
     *       14.-User defined 1 (User1)
     *       15.-User defined 2 (User2)
     *       
     *       For example, if you want to
     *       create different invoices for each ship location for a customer, use the value "By ship location"
     *       (000010000000000)}
     * 
     */
    public static final String PROPERTY_INVOICEGROUPING = "invoiceGrouping";

    /**
     * Property maturityDate1 stored in column FixMonthDay in table C_BPartner<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE1 = "maturityDate1";

    /**
     * Property maturityDate2 stored in column FixMonthDay2 in table C_BPartner<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE2 = "maturityDate2";

    /**
     * Property maturityDate3 stored in column Fixmonthday3 in table C_BPartner<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE3 = "maturityDate3";

    /**
     * Property operator stored in column Isworker in table C_BPartner
     * 
     */
    public static final String PROPERTY_OPERATOR = "operator";

    /**
     * Property uPCEAN stored in column UPC in table C_BPartner<br>
     * Help: {@literal Use this field to enter the bar code for the product in any of the bar code symbologies
     *       (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN,
     *       ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode)}
     * 
     */
    public static final String PROPERTY_UPCEAN = "uPCEAN";

    /**
     * Property salaryCategory stored in column C_Salary_Category_ID in table C_BPartner<br>
     * Help: {@literal Indicates a salary category}
     * 
     */
    public static final String PROPERTY_SALARYCATEGORY = "salaryCategory";

    /**
     * Property invoicePrintformat stored in column Invoice_Printformat in table C_BPartner<br>
     * Help: {@literal You need to define a Print Format to print the document.}
     * 
     */
    public static final String PROPERTY_INVOICEPRINTFORMAT = "invoicePrintformat";

    /**
     * Property consumptionDays stored in column Last_Days in table C_BPartner<br>
     * Help: {@literal This field is used Copy Lines From in Order tab to specify the consumptions made in the
     *       last n days.}
     * 
     */
    public static final String PROPERTY_CONSUMPTIONDAYS = "consumptionDays";

    /**
     * Property bankAccount stored in column PO_Bankaccount_ID in table C_BPartner<br>
     * Help: {@literal Default Vendor Bank Account}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property taxCategory stored in column PO_BP_TaxCategory_ID in table C_BPartner<br>
     * Help: {@literal PO Bussines Partner Tax Category is a category defined for apply default taxes for
     *       procurement transactions.}
     * 
     */
    public static final String PROPERTY_TAXCATEGORY = "taxCategory";

    /**
     * Property pOMaturityDate1 stored in column PO_Fixmonthday in table C_BPartner<br>
     * Help: {@literal The Fix Month Day for Purchases indicates the day of the month that invoices are due. 
     *       This field only displays if the fixed due date checkbox is selected. 3 different Fix Month Days can
     *       be defined.}
     * 
     */
    public static final String PROPERTY_POMATURITYDATE1 = "pOMaturityDate1";

    /**
     * Property pOMaturityDate2 stored in column PO_Fixmonthday2 in table C_BPartner<br>
     * Help: {@literal The Fix Month Day for Purchases indicates the day of the month that invoices are due. 
     *       This field only displays if the fixed due date checkbox is selected. 3 different Fix Month Days can
     *       be defined.}
     * 
     */
    public static final String PROPERTY_POMATURITYDATE2 = "pOMaturityDate2";

    /**
     * Property pOMaturityDate3 stored in column PO_Fixmonthday3 in table C_BPartner<br>
     * Help: {@literal The Fix Month Day for Purchases indicates the day of the month that invoices are due. 
     *       This field only displays if the fixed due date checkbox is selected. 3 different Fix Month Days can
     *       be defined.}
     * 
     */
    public static final String PROPERTY_POMATURITYDATE3 = "pOMaturityDate3";

    /**
     * Property transactionalBankAccount stored in column SO_Bankaccount_ID in table C_BPartner<br>
     * Help: {@literal Default Customer Bankaccount}
     * 
     */
    public static final String PROPERTY_TRANSACTIONALBANKACCOUNT = "transactionalBankAccount";

    /**
     * Property sOBPTaxCategory stored in column SO_Bp_Taxcategory_ID in table C_BPartner<br>
     * Help: {@literal Bussines Partner Tax Category is a category defined for apply default taxes for sales
     *       transactions.}
     * 
     */
    public static final String PROPERTY_SOBPTAXCATEGORY = "sOBPTaxCategory";

    /**
     * Property fiscalcode stored in column Fiscalcode in table C_BPartner
     * 
     */
    public static final String PROPERTY_FISCALCODE = "fiscalcode";

    /**
     * Property isofiscalcode stored in column Isofiscalcode in table C_BPartner
     * 
     */
    public static final String PROPERTY_ISOFISCALCODE = "isofiscalcode";

    /**
     * Property incotermsPO stored in column PO_C_Incoterms_ID in table C_BPartner
     * 
     */
    public static final String PROPERTY_INCOTERMSPO = "incotermsPO";

    /**
     * Property incotermsSO stored in column SO_C_Incoterms_ID in table C_BPartner
     * 
     */
    public static final String PROPERTY_INCOTERMSSO = "incotermsSO";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table C_BPartner
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property pOPaymentMethod stored in column PO_Paymentmethod_ID in table C_BPartner
     * 
     */
    public static final String PROPERTY_POPAYMENTMETHOD = "pOPaymentMethod";

    /**
     * Property account stored in column FIN_Financial_Account_ID in table C_BPartner<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property pOFinancialAccount stored in column PO_Financial_Account_ID in table C_BPartner<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_POFINANCIALACCOUNT = "pOFinancialAccount";

    /**
     * Property customerBlocking stored in column Customer_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block the customer. By checking it, a new section will be shown called
     *       Business Partner Blocking with the possible blocking options.}
     * 
     */
    public static final String PROPERTY_CUSTOMERBLOCKING = "customerBlocking";

    /**
     * Property vendorBlocking stored in column Vendor_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block the vendor. By checking it, a new section will be shown called
     *       Business Partner Blocking with the possible blocking options.}
     * 
     */
    public static final String PROPERTY_VENDORBLOCKING = "vendorBlocking";

    /**
     * Property paymentIn stored in column SO_Payment_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block payment in in customer.}
     * 
     */
    public static final String PROPERTY_PAYMENTIN = "paymentIn";

    /**
     * Property paymentOut stored in column PO_Payment_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block payment out  in vendor.}
     * 
     */
    public static final String PROPERTY_PAYMENTOUT = "paymentOut";

    /**
     * Property salesInvoice stored in column SO_Invoice_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block sales invoice in customer.}
     * 
     */
    public static final String PROPERTY_SALESINVOICE = "salesInvoice";

    /**
     * Property purchaseInvoice stored in column PO_Invoice_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block purchase invoice in vendor.}
     * 
     */
    public static final String PROPERTY_PURCHASEINVOICE = "purchaseInvoice";

    /**
     * Property salesOrder stored in column SO_Order_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block sales order  in customer.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property purchaseOrder stored in column PO_Order_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block purchase order  in vendor.}
     * 
     */
    public static final String PROPERTY_PURCHASEORDER = "purchaseOrder";

    /**
     * Property goodsShipment stored in column SO_Goods_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block goods shipment out  in customer.}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENT = "goodsShipment";

    /**
     * Property goodsReceipt stored in column PO_Goods_Blocking in table C_BPartner<br>
     * Help: {@literal This flag allows to block goods receipt in vendor.}
     * 
     */
    public static final String PROPERTY_GOODSRECEIPT = "goodsReceipt";

    /**
     * Property cashVAT stored in column Iscashvat in table C_BPartner<br>
     * Help: {@literal Cash VAT tax rate}
     * 
     */
    public static final String PROPERTY_CASHVAT = "cashVAT";

    /**
     * Property setNewCurrency stored in column Update_Currency in table C_BPartner
     * 
     */
    public static final String PROPERTY_SETNEWCURRENCY = "setNewCurrency";

    /**
     * Property currency stored in column BP_Currency_ID in table C_BPartner<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property birthPlace stored in column Birthplace in table C_BPartner
     * 
     */
    public static final String PROPERTY_BIRTHPLACE = "birthPlace";

    /**
     * Property birthDay stored in column Birthday in table C_BPartner<br>
     * Help: {@literal Birthdate or Anniversary day}
     * 
     */
    public static final String PROPERTY_BIRTHDAY = "birthDay";

    /**
     * Property isCustomerConsent stored in column Is_Customer_Consent in table C_BPartner<br>
     * Help: {@literal This check describes if the Customer consents to process their personal information}
     * 
     */
    public static final String PROPERTY_ISCUSTOMERCONSENT = "isCustomerConsent";

    /**
     * Property businessPartnerType stored in column business_partner_type in table C_BPartner<br>
     * Help: {@literal A classification of business partners based on its type, that can either be among others,
     *       either a final consumer, or an organization, or a professional or a public sector institution.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERTYPE = "businessPartnerType";

    /**
     * Property isCustomerConsentPapFormat stored in column Is_Customer_Consent_PapFormat in table C_BPartner<br>
     * Help: {@literal This check describes if the Customer consents to send their information in paper format}
     * 
     */
    public static final String PROPERTY_ISCUSTOMERCONSENTPAPFORMAT = "isCustomerConsentPapFormat";

    /**
     * Property creditminamt stored in column SO_Creditminamt in table C_BPartner<br>
     * Help: {@literal The credit transaction minimum amount is the minimum amount that a customer has to pay in
     *       order to take advantage of his credit sales.}
     * 
     */
    public static final String PROPERTY_CREDITMINAMT = "creditminamt";

    /**
     * Property bpEntityProfile stored in column C_Bp_Entity_Profile_ID in table C_BPartner<br>
     * Help: {@literal id to identify an entity profile}
     * 
     */
    public static final String PROPERTY_BPENTITYPROFILE = "bpEntityProfile";

    /**
     * Property nationality stored in column Nationality in table C_BPartner<br>
     * Help: {@literal A way of selecting the desired nationality for the Business Partner.}
     * 
     */
    public static final String PROPERTY_NATIONALITY = "nationality";

    /**
     * Property aDUserList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_ADUSERLIST = "aDUserList";

    /**
     * Property approvedVendorList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_APPROVEDVENDORLIST = "approvedVendorList";

    /**
     * Property businessPartnerBankAccountList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERBANKACCOUNTLIST = "businessPartnerBankAccountList";

    /**
     * Property businessPartnerDiscountList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERDISCOUNTLIST = "businessPartnerDiscountList";

    /**
     * Property businessPartnerLocationList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERLOCATIONLIST = "businessPartnerLocationList";

    /**
     * Property businessPartnerWithholdingList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERWITHHOLDINGLIST = "businessPartnerWithholdingList";

    /**
     * Property customerAccountsList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_CUSTOMERACCOUNTSLIST = "customerAccountsList";

    /**
     * Property employeeAccountsList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_EMPLOYEEACCOUNTSLIST = "employeeAccountsList";

    /**
     * Property pricingVolumeDiscountBusinessPartnerList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST = "pricingVolumeDiscountBusinessPartnerList";

    /**
     * Property vendorAccountsList stored in table C_BPartner
     * 
     */
    public static final String PROPERTY_VENDORACCOUNTSLIST = "vendorAccountsList";


    public BusinessPartner() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_ONETIMETRANSACTION, false);
        setDefaultValue(PROPERTY_POTENTIALCUSTOMER, false);
        setDefaultValue(PROPERTY_VENDOR, false);
        setDefaultValue(PROPERTY_CUSTOMER, true);
        setDefaultValue(PROPERTY_EMPLOYEE, false);
        setDefaultValue(PROPERTY_ISSALESREPRESENTATIVE, false);
        setDefaultValue(PROPERTY_TAXEXEMPT, false);
        setDefaultValue(PROPERTY_PRINTDISCOUNT, false);
        setDefaultValue(PROPERTY_INVOICETERMS, "I");
        setDefaultValue(PROPERTY_PRICESSHOWNINORDER, true);
        setDefaultValue(PROPERTY_INVOICEGROUPING, "000000000000000");
        setDefaultValue(PROPERTY_OPERATOR, false);
        setDefaultValue(PROPERTY_CONSUMPTIONDAYS, (long) 1000);
        setDefaultValue(PROPERTY_CUSTOMERBLOCKING, false);
        setDefaultValue(PROPERTY_VENDORBLOCKING, false);
        setDefaultValue(PROPERTY_PAYMENTIN, false);
        setDefaultValue(PROPERTY_PAYMENTOUT, true);
        setDefaultValue(PROPERTY_SALESINVOICE, true);
        setDefaultValue(PROPERTY_PURCHASEINVOICE, true);
        setDefaultValue(PROPERTY_SALESORDER, true);
        setDefaultValue(PROPERTY_PURCHASEORDER, true);
        setDefaultValue(PROPERTY_GOODSSHIPMENT, true);
        setDefaultValue(PROPERTY_GOODSRECEIPT, false);
        setDefaultValue(PROPERTY_CASHVAT, false);
        setDefaultValue(PROPERTY_SETNEWCURRENCY, false);
        setDefaultValue(PROPERTY_ISCUSTOMERCONSENT, false);
        setDefaultValue(PROPERTY_ISCUSTOMERCONSENTPAPFORMAT, false);
        setDefaultValue(PROPERTY_ADUSERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_APPROVEDVENDORLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_BUSINESSPARTNERBANKACCOUNTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_BUSINESSPARTNERDISCOUNTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_BUSINESSPARTNERLOCATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_BUSINESSPARTNERWITHHOLDINGLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CUSTOMERACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EMPLOYEEACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_VENDORACCOUNTSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see BusinessPartner#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see BusinessPartner#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see BusinessPartner#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see BusinessPartner#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see BusinessPartner#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see BusinessPartner#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see BusinessPartner#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see BusinessPartner#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see BusinessPartner#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see BusinessPartner#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see BusinessPartner#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see BusinessPartner#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see BusinessPartner#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see BusinessPartner#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see BusinessPartner#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see BusinessPartner#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see BusinessPartner#PROPERTY_NAME2
     * 
     */
    public String getName2() {
        return (String) get(PROPERTY_NAME2);
    }
    /**
     * @see BusinessPartner#PROPERTY_NAME2
     * 
     */
    public void setName2(String name2) {
        set(PROPERTY_NAME2, name2);
    }

    /**
     * @see BusinessPartner#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see BusinessPartner#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see BusinessPartner#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see BusinessPartner#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see BusinessPartner#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see BusinessPartner#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see BusinessPartner#PROPERTY_ONETIMETRANSACTION
     * 
     */
    public Boolean isOneTimeTransaction() {
        return (Boolean) get(PROPERTY_ONETIMETRANSACTION);
    }
    /**
     * @see BusinessPartner#PROPERTY_ONETIMETRANSACTION
     * 
     */
    public void setOneTimeTransaction(Boolean oneTimeTransaction) {
        set(PROPERTY_ONETIMETRANSACTION, oneTimeTransaction);
    }

    /**
     * @see BusinessPartner#PROPERTY_POTENTIALCUSTOMER
     * 
     */
    public Boolean isPotentialCustomer() {
        return (Boolean) get(PROPERTY_POTENTIALCUSTOMER);
    }
    /**
     * @see BusinessPartner#PROPERTY_POTENTIALCUSTOMER
     * 
     */
    public void setPotentialCustomer(Boolean potentialCustomer) {
        set(PROPERTY_POTENTIALCUSTOMER, potentialCustomer);
    }

    /**
     * @see BusinessPartner#PROPERTY_VENDOR
     * 
     */
    public Boolean isVendor() {
        return (Boolean) get(PROPERTY_VENDOR);
    }
    /**
     * @see BusinessPartner#PROPERTY_VENDOR
     * 
     */
    public void setVendor(Boolean vendor) {
        set(PROPERTY_VENDOR, vendor);
    }

    /**
     * @see BusinessPartner#PROPERTY_CUSTOMER
     * 
     */
    public Boolean isCustomer() {
        return (Boolean) get(PROPERTY_CUSTOMER);
    }
    /**
     * @see BusinessPartner#PROPERTY_CUSTOMER
     * 
     */
    public void setCustomer(Boolean customer) {
        set(PROPERTY_CUSTOMER, customer);
    }

    /**
     * @see BusinessPartner#PROPERTY_EMPLOYEE
     * 
     */
    public Boolean isEmployee() {
        return (Boolean) get(PROPERTY_EMPLOYEE);
    }
    /**
     * @see BusinessPartner#PROPERTY_EMPLOYEE
     * 
     */
    public void setEmployee(Boolean employee) {
        set(PROPERTY_EMPLOYEE, employee);
    }

    /**
     * @see BusinessPartner#PROPERTY_ISSALESREPRESENTATIVE
     * 
     */
    public Boolean isSalesRepresentative() {
        return (Boolean) get(PROPERTY_ISSALESREPRESENTATIVE);
    }
    /**
     * @see BusinessPartner#PROPERTY_ISSALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(Boolean isSalesRepresentative) {
        set(PROPERTY_ISSALESREPRESENTATIVE, isSalesRepresentative);
    }

    /**
     * @see BusinessPartner#PROPERTY_REFERENCENO
     * 
     */
    public String getReferenceNo() {
        return (String) get(PROPERTY_REFERENCENO);
    }
    /**
     * @see BusinessPartner#PROPERTY_REFERENCENO
     * 
     */
    public void setReferenceNo(String referenceNo) {
        set(PROPERTY_REFERENCENO, referenceNo);
    }

    /**
     * @see BusinessPartner#PROPERTY_DUNS
     * 
     */
    public String getDUNS() {
        return (String) get(PROPERTY_DUNS);
    }
    /**
     * @see BusinessPartner#PROPERTY_DUNS
     * 
     */
    public void setDUNS(String dUNS) {
        set(PROPERTY_DUNS, dUNS);
    }

    /**
     * @see BusinessPartner#PROPERTY_URL
     * 
     */
    public String getURL() {
        return (String) get(PROPERTY_URL);
    }
    /**
     * @see BusinessPartner#PROPERTY_URL
     * 
     */
    public void setURL(String uRL) {
        set(PROPERTY_URL, uRL);
    }

    /**
     * @see BusinessPartner#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see BusinessPartner#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see BusinessPartner#PROPERTY_TAXID
     * 
     */
    public String getTaxID() {
        return (String) get(PROPERTY_TAXID);
    }
    /**
     * @see BusinessPartner#PROPERTY_TAXID
     * 
     */
    public void setTaxID(String taxID) {
        set(PROPERTY_TAXID, taxID);
    }

    /**
     * @see BusinessPartner#PROPERTY_TAXEXEMPT
     * 
     */
    public Boolean isTaxExempt() {
        return (Boolean) get(PROPERTY_TAXEXEMPT);
    }
    /**
     * @see BusinessPartner#PROPERTY_TAXEXEMPT
     * 
     */
    public void setTaxExempt(Boolean taxExempt) {
        set(PROPERTY_TAXEXEMPT, taxExempt);
    }

    /**
     * @see BusinessPartner#PROPERTY_INVOICESCHEDULE
     * 
     */
    public InvoiceSchedule getInvoiceSchedule() {
        return (InvoiceSchedule) get(PROPERTY_INVOICESCHEDULE);
    }
    /**
     * @see BusinessPartner#PROPERTY_INVOICESCHEDULE
     * 
     */
    public void setInvoiceSchedule(InvoiceSchedule invoiceSchedule) {
        set(PROPERTY_INVOICESCHEDULE, invoiceSchedule);
    }

    /**
     * @see BusinessPartner#PROPERTY_VALUATION
     * 
     */
    public String getValuation() {
        return (String) get(PROPERTY_VALUATION);
    }
    /**
     * @see BusinessPartner#PROPERTY_VALUATION
     * 
     */
    public void setValuation(String valuation) {
        set(PROPERTY_VALUATION, valuation);
    }

    /**
     * @see BusinessPartner#PROPERTY_VOLUMEOFSALES
     * 
     */
    public BigDecimal getVolumeOfSales() {
        return (BigDecimal) get(PROPERTY_VOLUMEOFSALES);
    }
    /**
     * @see BusinessPartner#PROPERTY_VOLUMEOFSALES
     * 
     */
    public void setVolumeOfSales(BigDecimal volumeOfSales) {
        set(PROPERTY_VOLUMEOFSALES, volumeOfSales);
    }

    /**
     * @see BusinessPartner#PROPERTY_NOOFEMPLOYEES
     * 
     */
    public Long getNoOfEmployees() {
        return (Long) get(PROPERTY_NOOFEMPLOYEES);
    }
    /**
     * @see BusinessPartner#PROPERTY_NOOFEMPLOYEES
     * 
     */
    public void setNoOfEmployees(Long noOfEmployees) {
        set(PROPERTY_NOOFEMPLOYEES, noOfEmployees);
    }

    /**
     * @see BusinessPartner#PROPERTY_NAICSSIC
     * 
     */
    public String getNAICSSIC() {
        return (String) get(PROPERTY_NAICSSIC);
    }
    /**
     * @see BusinessPartner#PROPERTY_NAICSSIC
     * 
     */
    public void setNAICSSIC(String nAICSSIC) {
        set(PROPERTY_NAICSSIC, nAICSSIC);
    }

    /**
     * @see BusinessPartner#PROPERTY_DATEOFFIRSTSALE
     * 
     */
    public Date getDateOfFirstSale() {
        return (Date) get(PROPERTY_DATEOFFIRSTSALE);
    }
    /**
     * @see BusinessPartner#PROPERTY_DATEOFFIRSTSALE
     * 
     */
    public void setDateOfFirstSale(Date dateOfFirstSale) {
        set(PROPERTY_DATEOFFIRSTSALE, dateOfFirstSale);
    }

    /**
     * @see BusinessPartner#PROPERTY_ACQUISITIONCOST
     * 
     */
    public BigDecimal getAcquisitionCost() {
        return (BigDecimal) get(PROPERTY_ACQUISITIONCOST);
    }
    /**
     * @see BusinessPartner#PROPERTY_ACQUISITIONCOST
     * 
     */
    public void setAcquisitionCost(BigDecimal acquisitionCost) {
        set(PROPERTY_ACQUISITIONCOST, acquisitionCost);
    }

    /**
     * @see BusinessPartner#PROPERTY_EXPECTEDLIFETIMEREVENUE
     * 
     */
    public BigDecimal getExpectedLifetimeRevenue() {
        return (BigDecimal) get(PROPERTY_EXPECTEDLIFETIMEREVENUE);
    }
    /**
     * @see BusinessPartner#PROPERTY_EXPECTEDLIFETIMEREVENUE
     * 
     */
    public void setExpectedLifetimeRevenue(BigDecimal expectedLifetimeRevenue) {
        set(PROPERTY_EXPECTEDLIFETIMEREVENUE, expectedLifetimeRevenue);
    }

    /**
     * @see BusinessPartner#PROPERTY_LIFETIMEREVENUETODATE
     * 
     */
    public BigDecimal getLifetimeRevenueToDate() {
        return (BigDecimal) get(PROPERTY_LIFETIMEREVENUETODATE);
    }
    /**
     * @see BusinessPartner#PROPERTY_LIFETIMEREVENUETODATE
     * 
     */
    public void setLifetimeRevenueToDate(BigDecimal lifetimeRevenueToDate) {
        set(PROPERTY_LIFETIMEREVENUETODATE, lifetimeRevenueToDate);
    }

    /**
     * @see BusinessPartner#PROPERTY_SHARE
     * 
     */
    public Long getShare() {
        return (Long) get(PROPERTY_SHARE);
    }
    /**
     * @see BusinessPartner#PROPERTY_SHARE
     * 
     */
    public void setShare(Long share) {
        set(PROPERTY_SHARE, share);
    }

    /**
     * @see BusinessPartner#PROPERTY_FORMOFPAYMENT
     * 
     */
    public String getFormOfPayment() {
        return (String) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see BusinessPartner#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(String formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREDITLIMIT
     * 
     */
    public BigDecimal getCreditLimit() {
        return (BigDecimal) get(PROPERTY_CREDITLIMIT);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREDITLIMIT
     * 
     */
    public void setCreditLimit(BigDecimal creditLimit) {
        set(PROPERTY_CREDITLIMIT, creditLimit);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREDITUSED
     * 
     */
    public BigDecimal getCreditUsed() {
        return (BigDecimal) get(PROPERTY_CREDITUSED);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREDITUSED
     * 
     */
    public void setCreditUsed(BigDecimal creditUsed) {
        set(PROPERTY_CREDITUSED, creditUsed);
    }

    /**
     * @see BusinessPartner#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see BusinessPartner#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see BusinessPartner#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see BusinessPartner#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see BusinessPartner#PROPERTY_PRINTDISCOUNT
     * 
     */
    public Boolean isPrintDiscount() {
        return (Boolean) get(PROPERTY_PRINTDISCOUNT);
    }
    /**
     * @see BusinessPartner#PROPERTY_PRINTDISCOUNT
     * 
     */
    public void setPrintDiscount(Boolean printDiscount) {
        set(PROPERTY_PRINTDISCOUNT, printDiscount);
    }

    /**
     * @see BusinessPartner#PROPERTY_ORDERDESCRIPTION
     * 
     */
    public String getOrderDescription() {
        return (String) get(PROPERTY_ORDERDESCRIPTION);
    }
    /**
     * @see BusinessPartner#PROPERTY_ORDERDESCRIPTION
     * 
     */
    public void setOrderDescription(String orderDescription) {
        set(PROPERTY_ORDERDESCRIPTION, orderDescription);
    }

    /**
     * @see BusinessPartner#PROPERTY_ORDERREFERENCE
     * 
     */
    public String getOrderReference() {
        return (String) get(PROPERTY_ORDERREFERENCE);
    }
    /**
     * @see BusinessPartner#PROPERTY_ORDERREFERENCE
     * 
     */
    public void setOrderReference(String orderReference) {
        set(PROPERTY_ORDERREFERENCE, orderReference);
    }

    /**
     * @see BusinessPartner#PROPERTY_POFORMOFPAYMENT
     * 
     */
    public String getPOFormOfPayment() {
        return (String) get(PROPERTY_POFORMOFPAYMENT);
    }
    /**
     * @see BusinessPartner#PROPERTY_POFORMOFPAYMENT
     * 
     */
    public void setPOFormOfPayment(String pOFormOfPayment) {
        set(PROPERTY_POFORMOFPAYMENT, pOFormOfPayment);
    }

    /**
     * @see BusinessPartner#PROPERTY_PURCHASEPRICELIST
     * 
     */
    public PriceList getPurchasePricelist() {
        return (PriceList) get(PROPERTY_PURCHASEPRICELIST);
    }
    /**
     * @see BusinessPartner#PROPERTY_PURCHASEPRICELIST
     * 
     */
    public void setPurchasePricelist(PriceList purchasePricelist) {
        set(PROPERTY_PURCHASEPRICELIST, purchasePricelist);
    }

    /**
     * @see BusinessPartner#PROPERTY_POPAYMENTTERMS
     * 
     */
    public PaymentTerm getPOPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_POPAYMENTTERMS);
    }
    /**
     * @see BusinessPartner#PROPERTY_POPAYMENTTERMS
     * 
     */
    public void setPOPaymentTerms(PaymentTerm pOPaymentTerms) {
        set(PROPERTY_POPAYMENTTERMS, pOPaymentTerms);
    }

    /**
     * @see BusinessPartner#PROPERTY_NUMBEROFCOPIES
     * 
     */
    public Long getNumberOfCopies() {
        return (Long) get(PROPERTY_NUMBEROFCOPIES);
    }
    /**
     * @see BusinessPartner#PROPERTY_NUMBEROFCOPIES
     * 
     */
    public void setNumberOfCopies(Long numberOfCopies) {
        set(PROPERTY_NUMBEROFCOPIES, numberOfCopies);
    }

    /**
     * @see BusinessPartner#PROPERTY_GREETING
     * 
     */
    public Greeting getGreeting() {
        return (Greeting) get(PROPERTY_GREETING);
    }
    /**
     * @see BusinessPartner#PROPERTY_GREETING
     * 
     */
    public void setGreeting(Greeting greeting) {
        set(PROPERTY_GREETING, greeting);
    }

    /**
     * @see BusinessPartner#PROPERTY_INVOICETERMS
     * 
     */
    public String getInvoiceTerms() {
        return (String) get(PROPERTY_INVOICETERMS);
    }
    /**
     * @see BusinessPartner#PROPERTY_INVOICETERMS
     * 
     */
    public void setInvoiceTerms(String invoiceTerms) {
        set(PROPERTY_INVOICETERMS, invoiceTerms);
    }

    /**
     * @see BusinessPartner#PROPERTY_DELIVERYTERMS
     * 
     */
    public String getDeliveryTerms() {
        return (String) get(PROPERTY_DELIVERYTERMS);
    }
    /**
     * @see BusinessPartner#PROPERTY_DELIVERYTERMS
     * 
     */
    public void setDeliveryTerms(String deliveryTerms) {
        set(PROPERTY_DELIVERYTERMS, deliveryTerms);
    }

    /**
     * @see BusinessPartner#PROPERTY_DELIVERYMETHOD
     * 
     */
    public String getDeliveryMethod() {
        return (String) get(PROPERTY_DELIVERYMETHOD);
    }
    /**
     * @see BusinessPartner#PROPERTY_DELIVERYMETHOD
     * 
     */
    public void setDeliveryMethod(String deliveryMethod) {
        set(PROPERTY_DELIVERYMETHOD, deliveryMethod);
    }

    /**
     * @see BusinessPartner#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public BusinessPartner getSalesRepresentative() {
        return (BusinessPartner) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see BusinessPartner#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(BusinessPartner salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see BusinessPartner#PROPERTY_PARTNERPARENT
     * 
     */
    public String getPartnerParent() {
        return (String) get(PROPERTY_PARTNERPARENT);
    }
    /**
     * @see BusinessPartner#PROPERTY_PARTNERPARENT
     * 
     */
    public void setPartnerParent(String partnerParent) {
        set(PROPERTY_PARTNERPARENT, partnerParent);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREDITSTATUS
     * 
     */
    public String getCreditStatus() {
        return (String) get(PROPERTY_CREDITSTATUS);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREDITSTATUS
     * 
     */
    public void setCreditStatus(String creditStatus) {
        set(PROPERTY_CREDITSTATUS, creditStatus);
    }

    /**
     * @see BusinessPartner#PROPERTY_FORCEDORG
     * 
     */
    public Organization getForcedOrg() {
        return (Organization) get(PROPERTY_FORCEDORG);
    }
    /**
     * @see BusinessPartner#PROPERTY_FORCEDORG
     * 
     */
    public void setForcedOrg(Organization forcedOrg) {
        set(PROPERTY_FORCEDORG, forcedOrg);
    }

    /**
     * @see BusinessPartner#PROPERTY_PRICESSHOWNINORDER
     * 
     */
    public Boolean isPricesShownInOrder() {
        return (Boolean) get(PROPERTY_PRICESSHOWNINORDER);
    }
    /**
     * @see BusinessPartner#PROPERTY_PRICESSHOWNINORDER
     * 
     */
    public void setPricesShownInOrder(Boolean pricesShownInOrder) {
        set(PROPERTY_PRICESSHOWNINORDER, pricesShownInOrder);
    }

    /**
     * @see BusinessPartner#PROPERTY_INVOICEGROUPING
     * 
     */
    public String getInvoiceGrouping() {
        return (String) get(PROPERTY_INVOICEGROUPING);
    }
    /**
     * @see BusinessPartner#PROPERTY_INVOICEGROUPING
     * 
     */
    public void setInvoiceGrouping(String invoiceGrouping) {
        set(PROPERTY_INVOICEGROUPING, invoiceGrouping);
    }

    /**
     * @see BusinessPartner#PROPERTY_MATURITYDATE1
     * 
     */
    public Long getMaturityDate1() {
        return (Long) get(PROPERTY_MATURITYDATE1);
    }
    /**
     * @see BusinessPartner#PROPERTY_MATURITYDATE1
     * 
     */
    public void setMaturityDate1(Long maturityDate1) {
        set(PROPERTY_MATURITYDATE1, maturityDate1);
    }

    /**
     * @see BusinessPartner#PROPERTY_MATURITYDATE2
     * 
     */
    public Long getMaturityDate2() {
        return (Long) get(PROPERTY_MATURITYDATE2);
    }
    /**
     * @see BusinessPartner#PROPERTY_MATURITYDATE2
     * 
     */
    public void setMaturityDate2(Long maturityDate2) {
        set(PROPERTY_MATURITYDATE2, maturityDate2);
    }

    /**
     * @see BusinessPartner#PROPERTY_MATURITYDATE3
     * 
     */
    public Long getMaturityDate3() {
        return (Long) get(PROPERTY_MATURITYDATE3);
    }
    /**
     * @see BusinessPartner#PROPERTY_MATURITYDATE3
     * 
     */
    public void setMaturityDate3(Long maturityDate3) {
        set(PROPERTY_MATURITYDATE3, maturityDate3);
    }

    /**
     * @see BusinessPartner#PROPERTY_OPERATOR
     * 
     */
    public Boolean isOperator() {
        return (Boolean) get(PROPERTY_OPERATOR);
    }
    /**
     * @see BusinessPartner#PROPERTY_OPERATOR
     * 
     */
    public void setOperator(Boolean operator) {
        set(PROPERTY_OPERATOR, operator);
    }

    /**
     * @see BusinessPartner#PROPERTY_UPCEAN
     * 
     */
    public String getUPCEAN() {
        return (String) get(PROPERTY_UPCEAN);
    }
    /**
     * @see BusinessPartner#PROPERTY_UPCEAN
     * 
     */
    public void setUPCEAN(String uPCEAN) {
        set(PROPERTY_UPCEAN, uPCEAN);
    }

    /**
     * @see BusinessPartner#PROPERTY_SALARYCATEGORY
     * 
     */
    public SalaryCategory getSalaryCategory() {
        return (SalaryCategory) get(PROPERTY_SALARYCATEGORY);
    }
    /**
     * @see BusinessPartner#PROPERTY_SALARYCATEGORY
     * 
     */
    public void setSalaryCategory(SalaryCategory salaryCategory) {
        set(PROPERTY_SALARYCATEGORY, salaryCategory);
    }

    /**
     * @see BusinessPartner#PROPERTY_INVOICEPRINTFORMAT
     * 
     */
    public String getInvoicePrintformat() {
        return (String) get(PROPERTY_INVOICEPRINTFORMAT);
    }
    /**
     * @see BusinessPartner#PROPERTY_INVOICEPRINTFORMAT
     * 
     */
    public void setInvoicePrintformat(String invoicePrintformat) {
        set(PROPERTY_INVOICEPRINTFORMAT, invoicePrintformat);
    }

    /**
     * @see BusinessPartner#PROPERTY_CONSUMPTIONDAYS
     * 
     */
    public Long getConsumptionDays() {
        return (Long) get(PROPERTY_CONSUMPTIONDAYS);
    }
    /**
     * @see BusinessPartner#PROPERTY_CONSUMPTIONDAYS
     * 
     */
    public void setConsumptionDays(Long consumptionDays) {
        set(PROPERTY_CONSUMPTIONDAYS, consumptionDays);
    }

    /**
     * @see BusinessPartner#PROPERTY_BANKACCOUNT
     * 
     */
    public BankAccount getBankAccount() {
        return (BankAccount) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see BusinessPartner#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(BankAccount bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see BusinessPartner#PROPERTY_TAXCATEGORY
     * 
     */
    public TaxCategory getTaxCategory() {
        return (TaxCategory) get(PROPERTY_TAXCATEGORY);
    }
    /**
     * @see BusinessPartner#PROPERTY_TAXCATEGORY
     * 
     */
    public void setTaxCategory(TaxCategory taxCategory) {
        set(PROPERTY_TAXCATEGORY, taxCategory);
    }

    /**
     * @see BusinessPartner#PROPERTY_POMATURITYDATE1
     * 
     */
    public Long getPOMaturityDate1() {
        return (Long) get(PROPERTY_POMATURITYDATE1);
    }
    /**
     * @see BusinessPartner#PROPERTY_POMATURITYDATE1
     * 
     */
    public void setPOMaturityDate1(Long pOMaturityDate1) {
        set(PROPERTY_POMATURITYDATE1, pOMaturityDate1);
    }

    /**
     * @see BusinessPartner#PROPERTY_POMATURITYDATE2
     * 
     */
    public Long getPOMaturityDate2() {
        return (Long) get(PROPERTY_POMATURITYDATE2);
    }
    /**
     * @see BusinessPartner#PROPERTY_POMATURITYDATE2
     * 
     */
    public void setPOMaturityDate2(Long pOMaturityDate2) {
        set(PROPERTY_POMATURITYDATE2, pOMaturityDate2);
    }

    /**
     * @see BusinessPartner#PROPERTY_POMATURITYDATE3
     * 
     */
    public Long getPOMaturityDate3() {
        return (Long) get(PROPERTY_POMATURITYDATE3);
    }
    /**
     * @see BusinessPartner#PROPERTY_POMATURITYDATE3
     * 
     */
    public void setPOMaturityDate3(Long pOMaturityDate3) {
        set(PROPERTY_POMATURITYDATE3, pOMaturityDate3);
    }

    /**
     * @see BusinessPartner#PROPERTY_TRANSACTIONALBANKACCOUNT
     * 
     */
    public BankAccount getTransactionalBankAccount() {
        return (BankAccount) get(PROPERTY_TRANSACTIONALBANKACCOUNT);
    }
    /**
     * @see BusinessPartner#PROPERTY_TRANSACTIONALBANKACCOUNT
     * 
     */
    public void setTransactionalBankAccount(BankAccount transactionalBankAccount) {
        set(PROPERTY_TRANSACTIONALBANKACCOUNT, transactionalBankAccount);
    }

    /**
     * @see BusinessPartner#PROPERTY_SOBPTAXCATEGORY
     * 
     */
    public TaxCategory getSOBPTaxCategory() {
        return (TaxCategory) get(PROPERTY_SOBPTAXCATEGORY);
    }
    /**
     * @see BusinessPartner#PROPERTY_SOBPTAXCATEGORY
     * 
     */
    public void setSOBPTaxCategory(TaxCategory sOBPTaxCategory) {
        set(PROPERTY_SOBPTAXCATEGORY, sOBPTaxCategory);
    }

    /**
     * @see BusinessPartner#PROPERTY_FISCALCODE
     * 
     */
    public String getFiscalcode() {
        return (String) get(PROPERTY_FISCALCODE);
    }
    /**
     * @see BusinessPartner#PROPERTY_FISCALCODE
     * 
     */
    public void setFiscalcode(String fiscalcode) {
        set(PROPERTY_FISCALCODE, fiscalcode);
    }

    /**
     * @see BusinessPartner#PROPERTY_ISOFISCALCODE
     * 
     */
    public String getIsofiscalcode() {
        return (String) get(PROPERTY_ISOFISCALCODE);
    }
    /**
     * @see BusinessPartner#PROPERTY_ISOFISCALCODE
     * 
     */
    public void setIsofiscalcode(String isofiscalcode) {
        set(PROPERTY_ISOFISCALCODE, isofiscalcode);
    }

    /**
     * @see BusinessPartner#PROPERTY_INCOTERMSPO
     * 
     */
    public Incoterms getIncotermsPO() {
        return (Incoterms) get(PROPERTY_INCOTERMSPO);
    }
    /**
     * @see BusinessPartner#PROPERTY_INCOTERMSPO
     * 
     */
    public void setIncotermsPO(Incoterms incotermsPO) {
        set(PROPERTY_INCOTERMSPO, incotermsPO);
    }

    /**
     * @see BusinessPartner#PROPERTY_INCOTERMSSO
     * 
     */
    public Incoterms getIncotermsSO() {
        return (Incoterms) get(PROPERTY_INCOTERMSSO);
    }
    /**
     * @see BusinessPartner#PROPERTY_INCOTERMSSO
     * 
     */
    public void setIncotermsSO(Incoterms incotermsSO) {
        set(PROPERTY_INCOTERMSSO, incotermsSO);
    }

    /**
     * @see BusinessPartner#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see BusinessPartner#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see BusinessPartner#PROPERTY_POPAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPOPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_POPAYMENTMETHOD);
    }
    /**
     * @see BusinessPartner#PROPERTY_POPAYMENTMETHOD
     * 
     */
    public void setPOPaymentMethod(FIN_PaymentMethod pOPaymentMethod) {
        set(PROPERTY_POPAYMENTMETHOD, pOPaymentMethod);
    }

    /**
     * @see BusinessPartner#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see BusinessPartner#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see BusinessPartner#PROPERTY_POFINANCIALACCOUNT
     * 
     */
    public FIN_FinancialAccount getPOFinancialAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_POFINANCIALACCOUNT);
    }
    /**
     * @see BusinessPartner#PROPERTY_POFINANCIALACCOUNT
     * 
     */
    public void setPOFinancialAccount(FIN_FinancialAccount pOFinancialAccount) {
        set(PROPERTY_POFINANCIALACCOUNT, pOFinancialAccount);
    }

    /**
     * @see BusinessPartner#PROPERTY_CUSTOMERBLOCKING
     * 
     */
    public Boolean isCustomerBlocking() {
        return (Boolean) get(PROPERTY_CUSTOMERBLOCKING);
    }
    /**
     * @see BusinessPartner#PROPERTY_CUSTOMERBLOCKING
     * 
     */
    public void setCustomerBlocking(Boolean customerBlocking) {
        set(PROPERTY_CUSTOMERBLOCKING, customerBlocking);
    }

    /**
     * @see BusinessPartner#PROPERTY_VENDORBLOCKING
     * 
     */
    public Boolean isVendorBlocking() {
        return (Boolean) get(PROPERTY_VENDORBLOCKING);
    }
    /**
     * @see BusinessPartner#PROPERTY_VENDORBLOCKING
     * 
     */
    public void setVendorBlocking(Boolean vendorBlocking) {
        set(PROPERTY_VENDORBLOCKING, vendorBlocking);
    }

    /**
     * @see BusinessPartner#PROPERTY_PAYMENTIN
     * 
     */
    public Boolean isPaymentIn() {
        return (Boolean) get(PROPERTY_PAYMENTIN);
    }
    /**
     * @see BusinessPartner#PROPERTY_PAYMENTIN
     * 
     */
    public void setPaymentIn(Boolean paymentIn) {
        set(PROPERTY_PAYMENTIN, paymentIn);
    }

    /**
     * @see BusinessPartner#PROPERTY_PAYMENTOUT
     * 
     */
    public Boolean isPaymentOut() {
        return (Boolean) get(PROPERTY_PAYMENTOUT);
    }
    /**
     * @see BusinessPartner#PROPERTY_PAYMENTOUT
     * 
     */
    public void setPaymentOut(Boolean paymentOut) {
        set(PROPERTY_PAYMENTOUT, paymentOut);
    }

    /**
     * @see BusinessPartner#PROPERTY_SALESINVOICE
     * 
     */
    public Boolean isSalesInvoice() {
        return (Boolean) get(PROPERTY_SALESINVOICE);
    }
    /**
     * @see BusinessPartner#PROPERTY_SALESINVOICE
     * 
     */
    public void setSalesInvoice(Boolean salesInvoice) {
        set(PROPERTY_SALESINVOICE, salesInvoice);
    }

    /**
     * @see BusinessPartner#PROPERTY_PURCHASEINVOICE
     * 
     */
    public Boolean isPurchaseInvoice() {
        return (Boolean) get(PROPERTY_PURCHASEINVOICE);
    }
    /**
     * @see BusinessPartner#PROPERTY_PURCHASEINVOICE
     * 
     */
    public void setPurchaseInvoice(Boolean purchaseInvoice) {
        set(PROPERTY_PURCHASEINVOICE, purchaseInvoice);
    }

    /**
     * @see BusinessPartner#PROPERTY_SALESORDER
     * 
     */
    public Boolean isSalesOrder() {
        return (Boolean) get(PROPERTY_SALESORDER);
    }
    /**
     * @see BusinessPartner#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Boolean salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see BusinessPartner#PROPERTY_PURCHASEORDER
     * 
     */
    public Boolean isPurchaseOrder() {
        return (Boolean) get(PROPERTY_PURCHASEORDER);
    }
    /**
     * @see BusinessPartner#PROPERTY_PURCHASEORDER
     * 
     */
    public void setPurchaseOrder(Boolean purchaseOrder) {
        set(PROPERTY_PURCHASEORDER, purchaseOrder);
    }

    /**
     * @see BusinessPartner#PROPERTY_GOODSSHIPMENT
     * 
     */
    public Boolean isGoodsShipment() {
        return (Boolean) get(PROPERTY_GOODSSHIPMENT);
    }
    /**
     * @see BusinessPartner#PROPERTY_GOODSSHIPMENT
     * 
     */
    public void setGoodsShipment(Boolean goodsShipment) {
        set(PROPERTY_GOODSSHIPMENT, goodsShipment);
    }

    /**
     * @see BusinessPartner#PROPERTY_GOODSRECEIPT
     * 
     */
    public Boolean isGoodsReceipt() {
        return (Boolean) get(PROPERTY_GOODSRECEIPT);
    }
    /**
     * @see BusinessPartner#PROPERTY_GOODSRECEIPT
     * 
     */
    public void setGoodsReceipt(Boolean goodsReceipt) {
        set(PROPERTY_GOODSRECEIPT, goodsReceipt);
    }

    /**
     * @see BusinessPartner#PROPERTY_CASHVAT
     * 
     */
    public Boolean isCashVAT() {
        return (Boolean) get(PROPERTY_CASHVAT);
    }
    /**
     * @see BusinessPartner#PROPERTY_CASHVAT
     * 
     */
    public void setCashVAT(Boolean cashVAT) {
        set(PROPERTY_CASHVAT, cashVAT);
    }

    /**
     * @see BusinessPartner#PROPERTY_SETNEWCURRENCY
     * 
     */
    public Boolean isSetNewCurrency() {
        return (Boolean) get(PROPERTY_SETNEWCURRENCY);
    }
    /**
     * @see BusinessPartner#PROPERTY_SETNEWCURRENCY
     * 
     */
    public void setSetNewCurrency(Boolean setNewCurrency) {
        set(PROPERTY_SETNEWCURRENCY, setNewCurrency);
    }

    /**
     * @see BusinessPartner#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see BusinessPartner#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see BusinessPartner#PROPERTY_BIRTHPLACE
     * 
     */
    public String getBirthPlace() {
        return (String) get(PROPERTY_BIRTHPLACE);
    }
    /**
     * @see BusinessPartner#PROPERTY_BIRTHPLACE
     * 
     */
    public void setBirthPlace(String birthPlace) {
        set(PROPERTY_BIRTHPLACE, birthPlace);
    }

    /**
     * @see BusinessPartner#PROPERTY_BIRTHDAY
     * 
     */
    public Date getBirthDay() {
        return (Date) get(PROPERTY_BIRTHDAY);
    }
    /**
     * @see BusinessPartner#PROPERTY_BIRTHDAY
     * 
     */
    public void setBirthDay(Date birthDay) {
        set(PROPERTY_BIRTHDAY, birthDay);
    }

    /**
     * @see BusinessPartner#PROPERTY_ISCUSTOMERCONSENT
     * 
     */
    public Boolean isCustomerConsent() {
        return (Boolean) get(PROPERTY_ISCUSTOMERCONSENT);
    }
    /**
     * @see BusinessPartner#PROPERTY_ISCUSTOMERCONSENT
     * 
     */
    public void setCustomerConsent(Boolean isCustomerConsent) {
        set(PROPERTY_ISCUSTOMERCONSENT, isCustomerConsent);
    }

    /**
     * @see BusinessPartner#PROPERTY_BUSINESSPARTNERTYPE
     * 
     */
    public String getBusinessPartnerType() {
        return (String) get(PROPERTY_BUSINESSPARTNERTYPE);
    }
    /**
     * @see BusinessPartner#PROPERTY_BUSINESSPARTNERTYPE
     * 
     */
    public void setBusinessPartnerType(String businessPartnerType) {
        set(PROPERTY_BUSINESSPARTNERTYPE, businessPartnerType);
    }

    /**
     * @see BusinessPartner#PROPERTY_ISCUSTOMERCONSENTPAPFORMAT
     * 
     */
    public Boolean isCustomerConsentPapFormat() {
        return (Boolean) get(PROPERTY_ISCUSTOMERCONSENTPAPFORMAT);
    }
    /**
     * @see BusinessPartner#PROPERTY_ISCUSTOMERCONSENTPAPFORMAT
     * 
     */
    public void setCustomerConsentPapFormat(Boolean isCustomerConsentPapFormat) {
        set(PROPERTY_ISCUSTOMERCONSENTPAPFORMAT, isCustomerConsentPapFormat);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREDITMINAMT
     * 
     */
    public BigDecimal getCreditminamt() {
        return (BigDecimal) get(PROPERTY_CREDITMINAMT);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREDITMINAMT
     * 
     */
    public void setCreditminamt(BigDecimal creditminamt) {
        set(PROPERTY_CREDITMINAMT, creditminamt);
    }

    /**
     * @see BusinessPartner#PROPERTY_BPENTITYPROFILE
     * 
     */
    public EntityProfile getBpEntityProfile() {
        return (EntityProfile) get(PROPERTY_BPENTITYPROFILE);
    }
    /**
     * @see BusinessPartner#PROPERTY_BPENTITYPROFILE
     * 
     */
    public void setBpEntityProfile(EntityProfile bpEntityProfile) {
        set(PROPERTY_BPENTITYPROFILE, bpEntityProfile);
    }

    /**
     * @see BusinessPartner#PROPERTY_NATIONALITY
     * 
     */
    public Country getNationality() {
        return (Country) get(PROPERTY_NATIONALITY);
    }
    /**
     * @see BusinessPartner#PROPERTY_NATIONALITY
     * 
     */
    public void setNationality(Country nationality) {
        set(PROPERTY_NATIONALITY, nationality);
    }

    /**
     * Help: {@literal The User Tab defines the log in for Users who have access to the system.
     *       The User
     *       identifies a unique user in the system. This could be an internal user or a business partner
     *       contact}<br>
     * @see User
     * 
     */
    @SuppressWarnings("unchecked")
    public List<User> getADUserList() {
      return (List<User>) get(PROPERTY_ADUSERLIST);
    }

    /**
     * Help: {@literal The User Tab defines the log in for Users who have access to the system.
     *       The User
     *       identifies a unique user in the system. This could be an internal user or a business partner
     *       contact}<br>
     * @see User
     * 
     */
    public void setADUserList(List<User> aDUserList) {
        set(PROPERTY_ADUSERLIST, aDUserList);
    }

    /**
     * Help: {@literal The Purchasing defines the pricing and rules ( pack quantity, UPC, minimum order quantity)
     *       for each product.
     *       The Product Details allows you to display and maintain all products for a selected
     *       Vendor.}<br>
     * @see ApprovedVendor
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ApprovedVendor> getApprovedVendorList() {
      return (List<ApprovedVendor>) get(PROPERTY_APPROVEDVENDORLIST);
    }

    /**
     * Help: {@literal The Purchasing defines the pricing and rules ( pack quantity, UPC, minimum order quantity)
     *       for each product.
     *       The Product Details allows you to display and maintain all products for a selected
     *       Vendor.}<br>
     * @see ApprovedVendor
     * 
     */
    public void setApprovedVendorList(List<ApprovedVendor> approvedVendorList) {
        set(PROPERTY_APPROVEDVENDORLIST, approvedVendorList);
    }

    /**
     * Help: {@literal The Define Bank Account Tab defines the banking information for this business partner. 
     *       This data is used for processing payments and remittances.}<br>
     * @see org.openbravo.model.common.businesspartner.BankAccount
     * 
     */
    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.common.businesspartner.BankAccount> getBusinessPartnerBankAccountList() {
      return (List<org.openbravo.model.common.businesspartner.BankAccount>) get(PROPERTY_BUSINESSPARTNERBANKACCOUNTLIST);
    }

    /**
     * Help: {@literal The Define Bank Account Tab defines the banking information for this business partner. 
     *       This data is used for processing payments and remittances.}<br>
     * @see org.openbravo.model.common.businesspartner.BankAccount
     * 
     */
    public void setBusinessPartnerBankAccountList(List<org.openbravo.model.common.businesspartner.BankAccount> businessPartnerBankAccountList) {
        set(PROPERTY_BUSINESSPARTNERBANKACCOUNTLIST, businessPartnerBankAccountList);
    }

    /**
     * Help: {@literal Defines the Business Partners the discount can be applied to.}<br>
     * @see Discount
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Discount> getBusinessPartnerDiscountList() {
      return (List<Discount>) get(PROPERTY_BUSINESSPARTNERDISCOUNTLIST);
    }

    /**
     * Help: {@literal Defines the Business Partners the discount can be applied to.}<br>
     * @see Discount
     * 
     */
    public void setBusinessPartnerDiscountList(List<Discount> businessPartnerDiscountList) {
        set(PROPERTY_BUSINESSPARTNERDISCOUNTLIST, businessPartnerDiscountList);
    }

    /**
     * Help: {@literal The Location defines the physical location of a business partner.  A business partner may
     *       have multiple location records.}<br>
     * @see Location
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Location> getBusinessPartnerLocationList() {
      return (List<Location>) get(PROPERTY_BUSINESSPARTNERLOCATIONLIST);
    }

    /**
     * Help: {@literal The Location defines the physical location of a business partner.  A business partner may
     *       have multiple location records.}<br>
     * @see Location
     * 
     */
    public void setBusinessPartnerLocationList(List<Location> businessPartnerLocationList) {
        set(PROPERTY_BUSINESSPARTNERLOCATIONLIST, businessPartnerLocationList);
    }

    /**
     * Help: {@literal The Withholding Tab defines any withholding information for this business partner.}<br>
     * @see Withholding
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Withholding> getBusinessPartnerWithholdingList() {
      return (List<Withholding>) get(PROPERTY_BUSINESSPARTNERWITHHOLDINGLIST);
    }

    /**
     * Help: {@literal The Withholding Tab defines any withholding information for this business partner.}<br>
     * @see Withholding
     * 
     */
    public void setBusinessPartnerWithholdingList(List<Withholding> businessPartnerWithholdingList) {
        set(PROPERTY_BUSINESSPARTNERWITHHOLDINGLIST, businessPartnerWithholdingList);
    }

    /**
     * Help: {@literal Defines the default accounts to use when this business partner is referenced on an
     *       accounts receivable transaction.}<br>
     * @see CustomerAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CustomerAccounts> getCustomerAccountsList() {
      return (List<CustomerAccounts>) get(PROPERTY_CUSTOMERACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the default accounts to use when this business partner is referenced on an
     *       accounts receivable transaction.}<br>
     * @see CustomerAccounts
     * 
     */
    public void setCustomerAccountsList(List<CustomerAccounts> customerAccountsList) {
        set(PROPERTY_CUSTOMERACCOUNTSLIST, customerAccountsList);
    }

    /**
     * Help: {@literal Defines the default accounts to use when this business partner is referenced on a expense
     *       reimbursement.}<br>
     * @see EmployeeAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<EmployeeAccounts> getEmployeeAccountsList() {
      return (List<EmployeeAccounts>) get(PROPERTY_EMPLOYEEACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the default accounts to use when this business partner is referenced on a expense
     *       reimbursement.}<br>
     * @see EmployeeAccounts
     * 
     */
    public void setEmployeeAccountsList(List<EmployeeAccounts> employeeAccountsList) {
        set(PROPERTY_EMPLOYEEACCOUNTSLIST, employeeAccountsList);
    }

    /**
     * Help: {@literal Contains all the configuration rappels. This rappel only applies to business partners
     *       recorded on this tab.}<br>
     * @see org.openbravo.model.pricing.volumediscount.BusinessPartner
     * 
     */
    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.pricing.volumediscount.BusinessPartner> getPricingVolumeDiscountBusinessPartnerList() {
      return (List<org.openbravo.model.pricing.volumediscount.BusinessPartner>) get(PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST);
    }

    /**
     * Help: {@literal Contains all the configuration rappels. This rappel only applies to business partners
     *       recorded on this tab.}<br>
     * @see org.openbravo.model.pricing.volumediscount.BusinessPartner
     * 
     */
    public void setPricingVolumeDiscountBusinessPartnerList(List<org.openbravo.model.pricing.volumediscount.BusinessPartner> pricingVolumeDiscountBusinessPartnerList) {
        set(PROPERTY_PRICINGVOLUMEDISCOUNTBUSINESSPARTNERLIST, pricingVolumeDiscountBusinessPartnerList);
    }

    /**
     * Help: {@literal Defines the default accounts to use when this business partner is referenced in an
     *       accounts payable transaction.}<br>
     * @see VendorAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<VendorAccounts> getVendorAccountsList() {
      return (List<VendorAccounts>) get(PROPERTY_VENDORACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the default accounts to use when this business partner is referenced in an
     *       accounts payable transaction.}<br>
     * @see VendorAccounts
     * 
     */
    public void setVendorAccountsList(List<VendorAccounts> vendorAccountsList) {
        set(PROPERTY_VENDORACCOUNTSLIST, vendorAccountsList);
    }

}
