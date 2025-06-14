
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
package org.openbravo.model.financialmgmt.accounting.coa;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtAcctSchemaDefault (stored in table C_AcctSchema_Default).
 * <br>
 * Help: {@literal Defines default accounts for an Accounting Schema.  These values will display when a new
     *       document is opened.  The user can override these defaults within the document.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AcctSchemaDefault extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_AcctSchema_Default";
    public static final String ENTITY_NAME = "FinancialMgmtAcctSchemaDefault";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_AcctSchema_Default<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table C_AcctSchema_Default 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_AcctSchema_Default 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_AcctSchema_Default 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_AcctSchema_Default 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_AcctSchema_Default 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_AcctSchema_Default 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_AcctSchema_Default 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property warehouseInventory stored in column W_Inventory_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Warehouse Inventory Asset Account identifies the account used for recording the value
     *       of your inventory.}
     * 
     */
    public static final String PROPERTY_WAREHOUSEINVENTORY = "warehouseInventory";

    /**
     * Property inventoryAdjustment stored in column W_InvActualAdjust_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal In actual costing systems, this account is used to post Inventory value adjustments. You
     *       could set it to the standard Inventory Asset account.}
     * 
     */
    public static final String PROPERTY_INVENTORYADJUSTMENT = "inventoryAdjustment";

    /**
     * Property warehouseDifferences stored in column W_Differences_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Warehouse Differences Account indicates the account used recording differences
     *       identified during inventory counts.}
     * 
     */
    public static final String PROPERTY_WAREHOUSEDIFFERENCES = "warehouseDifferences";

    /**
     * Property inventoryRevaluation stored in column W_Revaluation_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Inventory Revaluation Account identifies the account used to records changes in
     *       inventory value due to currency revaluation.}
     * 
     */
    public static final String PROPERTY_INVENTORYREVALUATION = "inventoryRevaluation";

    /**
     * Property productRevenue stored in column P_Revenue_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Product Revenue Account indicates the account used for recording sales revenue for
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTREVENUE = "productRevenue";

    /**
     * Property productExpense stored in column P_Expense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Product Expense Account indicates the account used to record expenses associated with
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTEXPENSE = "productExpense";

    /**
     * Property fixedAsset stored in column P_Asset_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Product Asset Account indicates the account used for valuing this a product in
     *       inventory.}
     * 
     */
    public static final String PROPERTY_FIXEDASSET = "fixedAsset";

    /**
     * Property purchasePriceVariance stored in column P_PurchasePriceVariance_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Purchase Price Variance is used in Standard Costing. It reflects the difference
     *       between the Standard Cost and the Purchase Order Price.}
     * 
     */
    public static final String PROPERTY_PURCHASEPRICEVARIANCE = "purchasePriceVariance";

    /**
     * Property invoicePriceVariance stored in column P_InvoicePriceVariance_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Invoice Price Variance is used reflects the difference between the current Costs and
     *       the Invoice Price.}
     * 
     */
    public static final String PROPERTY_INVOICEPRICEVARIANCE = "invoicePriceVariance";

    /**
     * Property tradeDiscountReceived stored in column P_TradeDiscountRec_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Trade Discount Receivables Account indicates the account for received trade discounts
     *       in vendor invoices}
     * 
     */
    public static final String PROPERTY_TRADEDISCOUNTRECEIVED = "tradeDiscountReceived";

    /**
     * Property tradeDiscountGranted stored in column P_TradeDiscountGrant_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Trade Discount Granted Account indicates the account for granted trade discount in
     *       sales invoices}
     * 
     */
    public static final String PROPERTY_TRADEDISCOUNTGRANTED = "tradeDiscountGranted";

    /**
     * Property productCOGS stored in column P_Cogs_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Product COGS Account indicates the account used when recording costs associated with
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTCOGS = "productCOGS";

    /**
     * Property customerReceivablesNo stored in column C_Receivable_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Customer Receivables Accounts indicates the account to be used for recording
     *       transaction for customers receivables.}
     * 
     */
    public static final String PROPERTY_CUSTOMERRECEIVABLESNO = "customerReceivablesNo";

    /**
     * Property customerPrepayment stored in column C_Prepayment_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Customer Prepayment account indicates the account to be used for recording prepayments
     *       from a customer.}
     * 
     */
    public static final String PROPERTY_CUSTOMERPREPAYMENT = "customerPrepayment";

    /**
     * Property vendorLiability stored in column V_Liability_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Vendor Liability account indicates the account used for recording transactions for
     *       vendor liabilities}
     * 
     */
    public static final String PROPERTY_VENDORLIABILITY = "vendorLiability";

    /**
     * Property vendorServiceLiability stored in column V_Liability_Services_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Vendor Service Liability account indicates the account to use for recording service
     *       liabilities.  It is used if you need to distinguish between Liability for products and services}
     * 
     */
    public static final String PROPERTY_VENDORSERVICELIABILITY = "vendorServiceLiability";

    /**
     * Property vendorPrepayment stored in column V_Prepayment_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Vendor Prepayment Account indicates the account used to record prepayments from a
     *       vendor.}
     * 
     */
    public static final String PROPERTY_VENDORPREPAYMENT = "vendorPrepayment";

    /**
     * Property paymentDiscountExpense stored in column PayDiscount_Exp_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Indicates the account to be charged for payment discount expenses.}
     * 
     */
    public static final String PROPERTY_PAYMENTDISCOUNTEXPENSE = "paymentDiscountExpense";

    /**
     * Property writeoff stored in column WriteOff_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Write Off Account identifies the account to book write off transactions to.}
     * 
     */
    public static final String PROPERTY_WRITEOFF = "writeoff";

    /**
     * Property writeoffRevenue stored in column Writeoff_Rev_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Write Off Account identifies the account to book write off transactions to.}
     * 
     */
    public static final String PROPERTY_WRITEOFFREVENUE = "writeoffRevenue";

    /**
     * Property paymentDiscountRevenue stored in column PayDiscount_Rev_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Indicates the account to be charged for payment discount revenues.}
     * 
     */
    public static final String PROPERTY_PAYMENTDISCOUNTREVENUE = "paymentDiscountRevenue";

    /**
     * Property unrealizedGainsAcct stored in column UnrealizedGain_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Unrealized Gain Account indicates the account to be used when recording gains achieved
     *       from currency revaluation that have yet to be realized.}
     * 
     */
    public static final String PROPERTY_UNREALIZEDGAINSACCT = "unrealizedGainsAcct";

    /**
     * Property unrealizedLossesAcct stored in column UnrealizedLoss_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Unrealized Loss Account indicates the account to be used when recording losses
     *       incurred from currency revaluation that have yet to be realized.}
     * 
     */
    public static final String PROPERTY_UNREALIZEDLOSSESACCT = "unrealizedLossesAcct";

    /**
     * Property realizedGainAcct stored in column RealizedGain_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Realized Gain Account indicates the account to be used when recording gains achieved
     *       from currency revaluation that have been realized.}
     * 
     */
    public static final String PROPERTY_REALIZEDGAINACCT = "realizedGainAcct";

    /**
     * Property realizedLossAcct stored in column RealizedLoss_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Realized Loss Account indicates the account to be used when recording losses incurred
     *       from currency revaluation that have yet to be realized.}
     * 
     */
    public static final String PROPERTY_REALIZEDLOSSACCT = "realizedLossAcct";

    /**
     * Property withholdingAccount stored in column Withholding_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Withholding Account indicates the account used to record withholdings.}
     * 
     */
    public static final String PROPERTY_WITHHOLDINGACCOUNT = "withholdingAccount";

    /**
     * Property employeePrepayments stored in column E_Prepayment_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Employee Prepayment Account identifies the account to use for recording expense
     *       advances made to this employee.}
     * 
     */
    public static final String PROPERTY_EMPLOYEEPREPAYMENTS = "employeePrepayments";

    /**
     * Property employeeExpenses stored in column E_Expense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Employee Expense Account identifies the account to use for recording expenses for this
     *       employee.}
     * 
     */
    public static final String PROPERTY_EMPLOYEEEXPENSES = "employeeExpenses";

    /**
     * Property projectAsset stored in column PJ_Asset_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Project Asset account is the account used as the final asset account in capital
     *       projects}
     * 
     */
    public static final String PROPERTY_PROJECTASSET = "projectAsset";

    /**
     * Property workInProgress stored in column PJ_WIP_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Work in Process account is the account used in capital projects until the project is
     *       completed}
     * 
     */
    public static final String PROPERTY_WORKINPROGRESS = "workInProgress";

    /**
     * Property taxExpense stored in column T_Expense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Tax Expense Account indicates the account used to record the taxes that have been paid
     *       that cannot be reclaimed.}
     * 
     */
    public static final String PROPERTY_TAXEXPENSE = "taxExpense";

    /**
     * Property taxLiability stored in column T_Liability_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Tax Liability Account indicates the account used to record your tax liability
     *       declaration.}
     * 
     */
    public static final String PROPERTY_TAXLIABILITY = "taxLiability";

    /**
     * Property taxReceivables stored in column T_Receivables_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Tax Receivables Account indicates the account used to record the tax credit amount
     *       after your tax declaration.}
     * 
     */
    public static final String PROPERTY_TAXRECEIVABLES = "taxReceivables";

    /**
     * Property taxDue stored in column T_Due_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Tax Due Account indicates the account used to record taxes that you are liable to
     *       pay.}
     * 
     */
    public static final String PROPERTY_TAXDUE = "taxDue";

    /**
     * Property dueTransAcct stored in column T_Due_Trans_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Tax Due Transitory Account indicates the account used to record taxes that you are
     *       liable to pay for Cash VAT regime}
     * 
     */
    public static final String PROPERTY_DUETRANSACCT = "dueTransAcct";

    /**
     * Property taxCredit stored in column T_Credit_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Tax Credit Account indicates the account used to record taxes that can be reclaimed}
     * 
     */
    public static final String PROPERTY_TAXCREDIT = "taxCredit";

    /**
     * Property creditTransAcct stored in column T_Credit_Trans_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Tax Credit Transitory Account indicates the account used to record taxes for Cash VAT
     *       regime}
     * 
     */
    public static final String PROPERTY_CREDITTRANSACCT = "creditTransAcct";

    /**
     * Property bankInTransit stored in column B_InTransit_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank in Transit Account identifies the account to be used for funds which are in
     *       transit.}
     * 
     */
    public static final String PROPERTY_BANKINTRANSIT = "bankInTransit";

    /**
     * Property bankAsset stored in column B_Asset_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Asset Account identifies the account to be used for booking changes to the
     *       balance in this bank account}
     * 
     */
    public static final String PROPERTY_BANKASSET = "bankAsset";

    /**
     * Property bankExpense stored in column B_Expense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Expense Account identifies the account to be used for recording charges or fees
     *       incurred from this Bank.}
     * 
     */
    public static final String PROPERTY_BANKEXPENSE = "bankExpense";

    /**
     * Property bankInterestRevenue stored in column B_InterestRev_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Interest Revenue Account identifies the account to be used for recording interest
     *       revenue from this Bank.}
     * 
     */
    public static final String PROPERTY_BANKINTERESTREVENUE = "bankInterestRevenue";

    /**
     * Property bankInterestExpense stored in column B_InterestExp_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Interest Expense Account identifies the account to be used for recording interest
     *       expenses.}
     * 
     */
    public static final String PROPERTY_BANKINTERESTEXPENSE = "bankInterestExpense";

    /**
     * Property bankUnidentifiedReceipts stored in column B_Unidentified_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Unidentified Receipts Account identifies the account to be used when recording
     *       receipts that can not be reconciled at the present time.}
     * 
     */
    public static final String PROPERTY_BANKUNIDENTIFIEDRECEIPTS = "bankUnidentifiedReceipts";

    /**
     * Property unallocatedCash stored in column B_UnallocatedCash_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Receipts not allocated to Invoices}
     * 
     */
    public static final String PROPERTY_UNALLOCATEDCASH = "unallocatedCash";

    /**
     * Property paymentSelection stored in column B_PaymentSelect_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal AP Payment Selection Clearing Account}
     * 
     */
    public static final String PROPERTY_PAYMENTSELECTION = "paymentSelection";

    /**
     * Property bankSettlementGain stored in column B_SettlementGain_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Settlement Gain account identifies the account to be used when recording a
     *       currency gain when the settlement and receipt currency are not the same.}
     * 
     */
    public static final String PROPERTY_BANKSETTLEMENTGAIN = "bankSettlementGain";

    /**
     * Property bankSettlementLoss stored in column B_SettlementLoss_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Settlement loss account identifies the account to be used when recording a
     *       currency loss when the settlement and receipt currency are not the same.}
     * 
     */
    public static final String PROPERTY_BANKSETTLEMENTLOSS = "bankSettlementLoss";

    /**
     * Property bankRevaluationGain stored in column B_RevaluationGain_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Revaluation Gain Account identifies the account to be used for recording gains
     *       that are recognized when converting currencies.}
     * 
     */
    public static final String PROPERTY_BANKREVALUATIONGAIN = "bankRevaluationGain";

    /**
     * Property bankRevaluationLoss stored in column B_RevaluationLoss_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Bank Revaluation Loss Account identifies the account to be used for recording losses
     *       that are recognized when converting currencies.}
     * 
     */
    public static final String PROPERTY_BANKREVALUATIONLOSS = "bankRevaluationLoss";

    /**
     * Property chargeExpense stored in column Ch_Expense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Charge Expense Account identifies the account to use when recording charges paid to
     *       vendors.}
     * 
     */
    public static final String PROPERTY_CHARGEEXPENSE = "chargeExpense";

    /**
     * Property chargeRevenue stored in column Ch_Revenue_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Charge Revenue Account identifies the account to use when recording charges paid by
     *       customers.}
     * 
     */
    public static final String PROPERTY_CHARGEREVENUE = "chargeRevenue";

    /**
     * Property unearnedRevenue stored in column UnEarnedRevenue_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Unearned Revenue indicates the account used for recording invoices sent for products
     *       or services not yet delivered.  It is used in revenue recognition}
     * 
     */
    public static final String PROPERTY_UNEARNEDREVENUE = "unearnedRevenue";

    /**
     * Property nonInvoicedReceivables stored in column NotInvoicedReceivables_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Not Invoiced Receivables account indicates the account used for recording receivables
     *       that have not yet been invoiced.}
     * 
     */
    public static final String PROPERTY_NONINVOICEDRECEIVABLES = "nonInvoicedReceivables";

    /**
     * Property nonInvoicedRevenues stored in column NotInvoicedRevenue_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Not Invoiced Revenue account indicates the account used for recording revenue that has
     *       not yet been invoiced.}
     * 
     */
    public static final String PROPERTY_NONINVOICEDREVENUES = "nonInvoicedRevenues";

    /**
     * Property nonInvoicedReceipts stored in column NotInvoicedReceipts_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Not Invoiced Receipts account indicates the account used for recording receipts for
     *       materials that have not yet been invoiced.}
     * 
     */
    public static final String PROPERTY_NONINVOICEDRECEIPTS = "nonInvoicedReceipts";

    /**
     * Property cashBookAsset stored in column CB_Asset_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Cash Book Asset Account identifies the account to be used for recording payments into
     *       and disbursements from this cash book.}
     * 
     */
    public static final String PROPERTY_CASHBOOKASSET = "cashBookAsset";

    /**
     * Property cashTransfer stored in column CB_CashTransfer_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Account for Invoices paid by cash}
     * 
     */
    public static final String PROPERTY_CASHTRANSFER = "cashTransfer";

    /**
     * Property cashBookDifferences stored in column CB_Differences_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Cash Book Differences Account identifies the account to be used for recording any
     *       differences that affect this cash book}
     * 
     */
    public static final String PROPERTY_CASHBOOKDIFFERENCES = "cashBookDifferences";

    /**
     * Property cashBookExpense stored in column CB_Expense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Cash Book Expense Account identifies the account to be used for general, non itemized
     *       expenses.}
     * 
     */
    public static final String PROPERTY_CASHBOOKEXPENSE = "cashBookExpense";

    /**
     * Property cashBookReceipt stored in column CB_Receipt_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Cash Book Receipt Account identifies the account to be used for general, non itemized
     *       cash book receipts.}
     * 
     */
    public static final String PROPERTY_CASHBOOKRECEIPT = "cashBookReceipt";

    /**
     * Property processNow stored in column Processing in table C_AcctSchema_Default<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property accumulatedDepreciation stored in column A_Accumdepreciation_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Accumulated Depreciation Account}
     * 
     */
    public static final String PROPERTY_ACCUMULATEDDEPRECIATION = "accumulatedDepreciation";

    /**
     * Property depreciation stored in column A_Depreciation_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Depreciation account}
     * 
     */
    public static final String PROPERTY_DEPRECIATION = "depreciation";

    /**
     * Property disposalGain stored in column A_Disposal_Gain in table C_AcctSchema_Default<br>
     * Help: {@literal Disposal Gain account}
     * 
     */
    public static final String PROPERTY_DISPOSALGAIN = "disposalGain";

    /**
     * Property disposalLoss stored in column A_Disposal_Loss in table C_AcctSchema_Default<br>
     * Help: {@literal Disposal Loss account}
     * 
     */
    public static final String PROPERTY_DISPOSALLOSS = "disposalLoss";

    /**
     * Property id stored in column C_Acctschema_Default_ID in table C_AcctSchema_Default 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property productRevenueReturn stored in column P_Revenue_Return_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Product Revenue Return Account indicates the account used for recording returns of
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTREVENUERETURN = "productRevenueReturn";

    /**
     * Property productCOGSReturn stored in column P_Cogs_Return_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal The Product COGS Account indicates the account used when recording returns associated with
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTCOGSRETURN = "productCOGSReturn";

    /**
     * Property productDeferredRevenue stored in column P_Def_Revenue_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Used when revenue is deferred fro a sold product.}
     * 
     */
    public static final String PROPERTY_PRODUCTDEFERREDREVENUE = "productDeferredRevenue";

    /**
     * Property productDeferredExpense stored in column P_Def_Expense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Used when expense is deferred from a purchased product.}
     * 
     */
    public static final String PROPERTY_PRODUCTDEFERREDEXPENSE = "productDeferredExpense";

    /**
     * Property doubtfulDebtAccount stored in column DoubtfulDebt_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Account used to reclassify an account receivable once this has been recognized as a
     *       doubtful debt}
     * 
     */
    public static final String PROPERTY_DOUBTFULDEBTACCOUNT = "doubtfulDebtAccount";

    /**
     * Property badDebtExpenseAccount stored in column Baddebtexpense_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Account used to book the expense related to a recover of a bad debt}
     * 
     */
    public static final String PROPERTY_BADDEBTEXPENSEACCOUNT = "badDebtExpenseAccount";

    /**
     * Property badDebtRevenueAccount stored in column BadDebtRevenue_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Account used to book the revenue related to a recover of a bad debt}
     * 
     */
    public static final String PROPERTY_BADDEBTREVENUEACCOUNT = "badDebtRevenueAccount";

    /**
     * Property allowanceForDoubtfulDebtAccount stored in column Allowancefordoubtful_Acct in table C_AcctSchema_Default<br>
     * Help: {@literal Account used to provision bad debts. This amount will reduce accounts receivable amount in
     *       balance sheet.}
     * 
     */
    public static final String PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT = "allowanceForDoubtfulDebtAccount";


    public AcctSchemaDefault() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_WAREHOUSEINVENTORY
     * 
     */
    public AccountingCombination getWarehouseInventory() {
        return (AccountingCombination) get(PROPERTY_WAREHOUSEINVENTORY);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_WAREHOUSEINVENTORY
     * 
     */
    public void setWarehouseInventory(AccountingCombination warehouseInventory) {
        set(PROPERTY_WAREHOUSEINVENTORY, warehouseInventory);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_INVENTORYADJUSTMENT
     * 
     */
    public AccountingCombination getInventoryAdjustment() {
        return (AccountingCombination) get(PROPERTY_INVENTORYADJUSTMENT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_INVENTORYADJUSTMENT
     * 
     */
    public void setInventoryAdjustment(AccountingCombination inventoryAdjustment) {
        set(PROPERTY_INVENTORYADJUSTMENT, inventoryAdjustment);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_WAREHOUSEDIFFERENCES
     * 
     */
    public AccountingCombination getWarehouseDifferences() {
        return (AccountingCombination) get(PROPERTY_WAREHOUSEDIFFERENCES);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_WAREHOUSEDIFFERENCES
     * 
     */
    public void setWarehouseDifferences(AccountingCombination warehouseDifferences) {
        set(PROPERTY_WAREHOUSEDIFFERENCES, warehouseDifferences);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_INVENTORYREVALUATION
     * 
     */
    public AccountingCombination getInventoryRevaluation() {
        return (AccountingCombination) get(PROPERTY_INVENTORYREVALUATION);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_INVENTORYREVALUATION
     * 
     */
    public void setInventoryRevaluation(AccountingCombination inventoryRevaluation) {
        set(PROPERTY_INVENTORYREVALUATION, inventoryRevaluation);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTREVENUE
     * 
     */
    public AccountingCombination getProductRevenue() {
        return (AccountingCombination) get(PROPERTY_PRODUCTREVENUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTREVENUE
     * 
     */
    public void setProductRevenue(AccountingCombination productRevenue) {
        set(PROPERTY_PRODUCTREVENUE, productRevenue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTEXPENSE
     * 
     */
    public AccountingCombination getProductExpense() {
        return (AccountingCombination) get(PROPERTY_PRODUCTEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTEXPENSE
     * 
     */
    public void setProductExpense(AccountingCombination productExpense) {
        set(PROPERTY_PRODUCTEXPENSE, productExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_FIXEDASSET
     * 
     */
    public AccountingCombination getFixedAsset() {
        return (AccountingCombination) get(PROPERTY_FIXEDASSET);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_FIXEDASSET
     * 
     */
    public void setFixedAsset(AccountingCombination fixedAsset) {
        set(PROPERTY_FIXEDASSET, fixedAsset);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PURCHASEPRICEVARIANCE
     * 
     */
    public AccountingCombination getPurchasePriceVariance() {
        return (AccountingCombination) get(PROPERTY_PURCHASEPRICEVARIANCE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PURCHASEPRICEVARIANCE
     * 
     */
    public void setPurchasePriceVariance(AccountingCombination purchasePriceVariance) {
        set(PROPERTY_PURCHASEPRICEVARIANCE, purchasePriceVariance);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_INVOICEPRICEVARIANCE
     * 
     */
    public AccountingCombination getInvoicePriceVariance() {
        return (AccountingCombination) get(PROPERTY_INVOICEPRICEVARIANCE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_INVOICEPRICEVARIANCE
     * 
     */
    public void setInvoicePriceVariance(AccountingCombination invoicePriceVariance) {
        set(PROPERTY_INVOICEPRICEVARIANCE, invoicePriceVariance);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_TRADEDISCOUNTRECEIVED
     * 
     */
    public AccountingCombination getTradeDiscountReceived() {
        return (AccountingCombination) get(PROPERTY_TRADEDISCOUNTRECEIVED);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_TRADEDISCOUNTRECEIVED
     * 
     */
    public void setTradeDiscountReceived(AccountingCombination tradeDiscountReceived) {
        set(PROPERTY_TRADEDISCOUNTRECEIVED, tradeDiscountReceived);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_TRADEDISCOUNTGRANTED
     * 
     */
    public AccountingCombination getTradeDiscountGranted() {
        return (AccountingCombination) get(PROPERTY_TRADEDISCOUNTGRANTED);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_TRADEDISCOUNTGRANTED
     * 
     */
    public void setTradeDiscountGranted(AccountingCombination tradeDiscountGranted) {
        set(PROPERTY_TRADEDISCOUNTGRANTED, tradeDiscountGranted);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTCOGS
     * 
     */
    public AccountingCombination getProductCOGS() {
        return (AccountingCombination) get(PROPERTY_PRODUCTCOGS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTCOGS
     * 
     */
    public void setProductCOGS(AccountingCombination productCOGS) {
        set(PROPERTY_PRODUCTCOGS, productCOGS);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CUSTOMERRECEIVABLESNO
     * 
     */
    public AccountingCombination getCustomerReceivablesNo() {
        return (AccountingCombination) get(PROPERTY_CUSTOMERRECEIVABLESNO);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CUSTOMERRECEIVABLESNO
     * 
     */
    public void setCustomerReceivablesNo(AccountingCombination customerReceivablesNo) {
        set(PROPERTY_CUSTOMERRECEIVABLESNO, customerReceivablesNo);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CUSTOMERPREPAYMENT
     * 
     */
    public AccountingCombination getCustomerPrepayment() {
        return (AccountingCombination) get(PROPERTY_CUSTOMERPREPAYMENT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CUSTOMERPREPAYMENT
     * 
     */
    public void setCustomerPrepayment(AccountingCombination customerPrepayment) {
        set(PROPERTY_CUSTOMERPREPAYMENT, customerPrepayment);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_VENDORLIABILITY
     * 
     */
    public AccountingCombination getVendorLiability() {
        return (AccountingCombination) get(PROPERTY_VENDORLIABILITY);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_VENDORLIABILITY
     * 
     */
    public void setVendorLiability(AccountingCombination vendorLiability) {
        set(PROPERTY_VENDORLIABILITY, vendorLiability);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_VENDORSERVICELIABILITY
     * 
     */
    public AccountingCombination getVendorServiceLiability() {
        return (AccountingCombination) get(PROPERTY_VENDORSERVICELIABILITY);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_VENDORSERVICELIABILITY
     * 
     */
    public void setVendorServiceLiability(AccountingCombination vendorServiceLiability) {
        set(PROPERTY_VENDORSERVICELIABILITY, vendorServiceLiability);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_VENDORPREPAYMENT
     * 
     */
    public AccountingCombination getVendorPrepayment() {
        return (AccountingCombination) get(PROPERTY_VENDORPREPAYMENT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_VENDORPREPAYMENT
     * 
     */
    public void setVendorPrepayment(AccountingCombination vendorPrepayment) {
        set(PROPERTY_VENDORPREPAYMENT, vendorPrepayment);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PAYMENTDISCOUNTEXPENSE
     * 
     */
    public AccountingCombination getPaymentDiscountExpense() {
        return (AccountingCombination) get(PROPERTY_PAYMENTDISCOUNTEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PAYMENTDISCOUNTEXPENSE
     * 
     */
    public void setPaymentDiscountExpense(AccountingCombination paymentDiscountExpense) {
        set(PROPERTY_PAYMENTDISCOUNTEXPENSE, paymentDiscountExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_WRITEOFF
     * 
     */
    public AccountingCombination getWriteoff() {
        return (AccountingCombination) get(PROPERTY_WRITEOFF);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_WRITEOFF
     * 
     */
    public void setWriteoff(AccountingCombination writeoff) {
        set(PROPERTY_WRITEOFF, writeoff);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_WRITEOFFREVENUE
     * 
     */
    public AccountingCombination getWriteoffRevenue() {
        return (AccountingCombination) get(PROPERTY_WRITEOFFREVENUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_WRITEOFFREVENUE
     * 
     */
    public void setWriteoffRevenue(AccountingCombination writeoffRevenue) {
        set(PROPERTY_WRITEOFFREVENUE, writeoffRevenue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PAYMENTDISCOUNTREVENUE
     * 
     */
    public AccountingCombination getPaymentDiscountRevenue() {
        return (AccountingCombination) get(PROPERTY_PAYMENTDISCOUNTREVENUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PAYMENTDISCOUNTREVENUE
     * 
     */
    public void setPaymentDiscountRevenue(AccountingCombination paymentDiscountRevenue) {
        set(PROPERTY_PAYMENTDISCOUNTREVENUE, paymentDiscountRevenue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_UNREALIZEDGAINSACCT
     * 
     */
    public AccountingCombination getUnrealizedGainsAcct() {
        return (AccountingCombination) get(PROPERTY_UNREALIZEDGAINSACCT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_UNREALIZEDGAINSACCT
     * 
     */
    public void setUnrealizedGainsAcct(AccountingCombination unrealizedGainsAcct) {
        set(PROPERTY_UNREALIZEDGAINSACCT, unrealizedGainsAcct);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_UNREALIZEDLOSSESACCT
     * 
     */
    public AccountingCombination getUnrealizedLossesAcct() {
        return (AccountingCombination) get(PROPERTY_UNREALIZEDLOSSESACCT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_UNREALIZEDLOSSESACCT
     * 
     */
    public void setUnrealizedLossesAcct(AccountingCombination unrealizedLossesAcct) {
        set(PROPERTY_UNREALIZEDLOSSESACCT, unrealizedLossesAcct);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_REALIZEDGAINACCT
     * 
     */
    public AccountingCombination getRealizedGainAcct() {
        return (AccountingCombination) get(PROPERTY_REALIZEDGAINACCT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_REALIZEDGAINACCT
     * 
     */
    public void setRealizedGainAcct(AccountingCombination realizedGainAcct) {
        set(PROPERTY_REALIZEDGAINACCT, realizedGainAcct);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_REALIZEDLOSSACCT
     * 
     */
    public AccountingCombination getRealizedLossAcct() {
        return (AccountingCombination) get(PROPERTY_REALIZEDLOSSACCT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_REALIZEDLOSSACCT
     * 
     */
    public void setRealizedLossAcct(AccountingCombination realizedLossAcct) {
        set(PROPERTY_REALIZEDLOSSACCT, realizedLossAcct);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_WITHHOLDINGACCOUNT
     * 
     */
    public AccountingCombination getWithholdingAccount() {
        return (AccountingCombination) get(PROPERTY_WITHHOLDINGACCOUNT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_WITHHOLDINGACCOUNT
     * 
     */
    public void setWithholdingAccount(AccountingCombination withholdingAccount) {
        set(PROPERTY_WITHHOLDINGACCOUNT, withholdingAccount);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_EMPLOYEEPREPAYMENTS
     * 
     */
    public AccountingCombination getEmployeePrepayments() {
        return (AccountingCombination) get(PROPERTY_EMPLOYEEPREPAYMENTS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_EMPLOYEEPREPAYMENTS
     * 
     */
    public void setEmployeePrepayments(AccountingCombination employeePrepayments) {
        set(PROPERTY_EMPLOYEEPREPAYMENTS, employeePrepayments);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_EMPLOYEEEXPENSES
     * 
     */
    public AccountingCombination getEmployeeExpenses() {
        return (AccountingCombination) get(PROPERTY_EMPLOYEEEXPENSES);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_EMPLOYEEEXPENSES
     * 
     */
    public void setEmployeeExpenses(AccountingCombination employeeExpenses) {
        set(PROPERTY_EMPLOYEEEXPENSES, employeeExpenses);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PROJECTASSET
     * 
     */
    public AccountingCombination getProjectAsset() {
        return (AccountingCombination) get(PROPERTY_PROJECTASSET);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PROJECTASSET
     * 
     */
    public void setProjectAsset(AccountingCombination projectAsset) {
        set(PROPERTY_PROJECTASSET, projectAsset);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_WORKINPROGRESS
     * 
     */
    public AccountingCombination getWorkInProgress() {
        return (AccountingCombination) get(PROPERTY_WORKINPROGRESS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_WORKINPROGRESS
     * 
     */
    public void setWorkInProgress(AccountingCombination workInProgress) {
        set(PROPERTY_WORKINPROGRESS, workInProgress);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_TAXEXPENSE
     * 
     */
    public AccountingCombination getTaxExpense() {
        return (AccountingCombination) get(PROPERTY_TAXEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_TAXEXPENSE
     * 
     */
    public void setTaxExpense(AccountingCombination taxExpense) {
        set(PROPERTY_TAXEXPENSE, taxExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_TAXLIABILITY
     * 
     */
    public AccountingCombination getTaxLiability() {
        return (AccountingCombination) get(PROPERTY_TAXLIABILITY);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_TAXLIABILITY
     * 
     */
    public void setTaxLiability(AccountingCombination taxLiability) {
        set(PROPERTY_TAXLIABILITY, taxLiability);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_TAXRECEIVABLES
     * 
     */
    public AccountingCombination getTaxReceivables() {
        return (AccountingCombination) get(PROPERTY_TAXRECEIVABLES);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_TAXRECEIVABLES
     * 
     */
    public void setTaxReceivables(AccountingCombination taxReceivables) {
        set(PROPERTY_TAXRECEIVABLES, taxReceivables);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_TAXDUE
     * 
     */
    public AccountingCombination getTaxDue() {
        return (AccountingCombination) get(PROPERTY_TAXDUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_TAXDUE
     * 
     */
    public void setTaxDue(AccountingCombination taxDue) {
        set(PROPERTY_TAXDUE, taxDue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_DUETRANSACCT
     * 
     */
    public AccountingCombination getDueTransAcct() {
        return (AccountingCombination) get(PROPERTY_DUETRANSACCT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_DUETRANSACCT
     * 
     */
    public void setDueTransAcct(AccountingCombination dueTransAcct) {
        set(PROPERTY_DUETRANSACCT, dueTransAcct);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_TAXCREDIT
     * 
     */
    public AccountingCombination getTaxCredit() {
        return (AccountingCombination) get(PROPERTY_TAXCREDIT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_TAXCREDIT
     * 
     */
    public void setTaxCredit(AccountingCombination taxCredit) {
        set(PROPERTY_TAXCREDIT, taxCredit);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CREDITTRANSACCT
     * 
     */
    public AccountingCombination getCreditTransAcct() {
        return (AccountingCombination) get(PROPERTY_CREDITTRANSACCT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CREDITTRANSACCT
     * 
     */
    public void setCreditTransAcct(AccountingCombination creditTransAcct) {
        set(PROPERTY_CREDITTRANSACCT, creditTransAcct);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKINTRANSIT
     * 
     */
    public AccountingCombination getBankInTransit() {
        return (AccountingCombination) get(PROPERTY_BANKINTRANSIT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKINTRANSIT
     * 
     */
    public void setBankInTransit(AccountingCombination bankInTransit) {
        set(PROPERTY_BANKINTRANSIT, bankInTransit);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKASSET
     * 
     */
    public AccountingCombination getBankAsset() {
        return (AccountingCombination) get(PROPERTY_BANKASSET);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKASSET
     * 
     */
    public void setBankAsset(AccountingCombination bankAsset) {
        set(PROPERTY_BANKASSET, bankAsset);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKEXPENSE
     * 
     */
    public AccountingCombination getBankExpense() {
        return (AccountingCombination) get(PROPERTY_BANKEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKEXPENSE
     * 
     */
    public void setBankExpense(AccountingCombination bankExpense) {
        set(PROPERTY_BANKEXPENSE, bankExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKINTERESTREVENUE
     * 
     */
    public AccountingCombination getBankInterestRevenue() {
        return (AccountingCombination) get(PROPERTY_BANKINTERESTREVENUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKINTERESTREVENUE
     * 
     */
    public void setBankInterestRevenue(AccountingCombination bankInterestRevenue) {
        set(PROPERTY_BANKINTERESTREVENUE, bankInterestRevenue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKINTERESTEXPENSE
     * 
     */
    public AccountingCombination getBankInterestExpense() {
        return (AccountingCombination) get(PROPERTY_BANKINTERESTEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKINTERESTEXPENSE
     * 
     */
    public void setBankInterestExpense(AccountingCombination bankInterestExpense) {
        set(PROPERTY_BANKINTERESTEXPENSE, bankInterestExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKUNIDENTIFIEDRECEIPTS
     * 
     */
    public AccountingCombination getBankUnidentifiedReceipts() {
        return (AccountingCombination) get(PROPERTY_BANKUNIDENTIFIEDRECEIPTS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKUNIDENTIFIEDRECEIPTS
     * 
     */
    public void setBankUnidentifiedReceipts(AccountingCombination bankUnidentifiedReceipts) {
        set(PROPERTY_BANKUNIDENTIFIEDRECEIPTS, bankUnidentifiedReceipts);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_UNALLOCATEDCASH
     * 
     */
    public AccountingCombination getUnallocatedCash() {
        return (AccountingCombination) get(PROPERTY_UNALLOCATEDCASH);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_UNALLOCATEDCASH
     * 
     */
    public void setUnallocatedCash(AccountingCombination unallocatedCash) {
        set(PROPERTY_UNALLOCATEDCASH, unallocatedCash);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PAYMENTSELECTION
     * 
     */
    public AccountingCombination getPaymentSelection() {
        return (AccountingCombination) get(PROPERTY_PAYMENTSELECTION);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PAYMENTSELECTION
     * 
     */
    public void setPaymentSelection(AccountingCombination paymentSelection) {
        set(PROPERTY_PAYMENTSELECTION, paymentSelection);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKSETTLEMENTGAIN
     * 
     */
    public AccountingCombination getBankSettlementGain() {
        return (AccountingCombination) get(PROPERTY_BANKSETTLEMENTGAIN);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKSETTLEMENTGAIN
     * 
     */
    public void setBankSettlementGain(AccountingCombination bankSettlementGain) {
        set(PROPERTY_BANKSETTLEMENTGAIN, bankSettlementGain);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKSETTLEMENTLOSS
     * 
     */
    public AccountingCombination getBankSettlementLoss() {
        return (AccountingCombination) get(PROPERTY_BANKSETTLEMENTLOSS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKSETTLEMENTLOSS
     * 
     */
    public void setBankSettlementLoss(AccountingCombination bankSettlementLoss) {
        set(PROPERTY_BANKSETTLEMENTLOSS, bankSettlementLoss);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKREVALUATIONGAIN
     * 
     */
    public AccountingCombination getBankRevaluationGain() {
        return (AccountingCombination) get(PROPERTY_BANKREVALUATIONGAIN);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKREVALUATIONGAIN
     * 
     */
    public void setBankRevaluationGain(AccountingCombination bankRevaluationGain) {
        set(PROPERTY_BANKREVALUATIONGAIN, bankRevaluationGain);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BANKREVALUATIONLOSS
     * 
     */
    public AccountingCombination getBankRevaluationLoss() {
        return (AccountingCombination) get(PROPERTY_BANKREVALUATIONLOSS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BANKREVALUATIONLOSS
     * 
     */
    public void setBankRevaluationLoss(AccountingCombination bankRevaluationLoss) {
        set(PROPERTY_BANKREVALUATIONLOSS, bankRevaluationLoss);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CHARGEEXPENSE
     * 
     */
    public AccountingCombination getChargeExpense() {
        return (AccountingCombination) get(PROPERTY_CHARGEEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CHARGEEXPENSE
     * 
     */
    public void setChargeExpense(AccountingCombination chargeExpense) {
        set(PROPERTY_CHARGEEXPENSE, chargeExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CHARGEREVENUE
     * 
     */
    public AccountingCombination getChargeRevenue() {
        return (AccountingCombination) get(PROPERTY_CHARGEREVENUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CHARGEREVENUE
     * 
     */
    public void setChargeRevenue(AccountingCombination chargeRevenue) {
        set(PROPERTY_CHARGEREVENUE, chargeRevenue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_UNEARNEDREVENUE
     * 
     */
    public AccountingCombination getUnearnedRevenue() {
        return (AccountingCombination) get(PROPERTY_UNEARNEDREVENUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_UNEARNEDREVENUE
     * 
     */
    public void setUnearnedRevenue(AccountingCombination unearnedRevenue) {
        set(PROPERTY_UNEARNEDREVENUE, unearnedRevenue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_NONINVOICEDRECEIVABLES
     * 
     */
    public AccountingCombination getNonInvoicedReceivables() {
        return (AccountingCombination) get(PROPERTY_NONINVOICEDRECEIVABLES);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_NONINVOICEDRECEIVABLES
     * 
     */
    public void setNonInvoicedReceivables(AccountingCombination nonInvoicedReceivables) {
        set(PROPERTY_NONINVOICEDRECEIVABLES, nonInvoicedReceivables);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_NONINVOICEDREVENUES
     * 
     */
    public AccountingCombination getNonInvoicedRevenues() {
        return (AccountingCombination) get(PROPERTY_NONINVOICEDREVENUES);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_NONINVOICEDREVENUES
     * 
     */
    public void setNonInvoicedRevenues(AccountingCombination nonInvoicedRevenues) {
        set(PROPERTY_NONINVOICEDREVENUES, nonInvoicedRevenues);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_NONINVOICEDRECEIPTS
     * 
     */
    public AccountingCombination getNonInvoicedReceipts() {
        return (AccountingCombination) get(PROPERTY_NONINVOICEDRECEIPTS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_NONINVOICEDRECEIPTS
     * 
     */
    public void setNonInvoicedReceipts(AccountingCombination nonInvoicedReceipts) {
        set(PROPERTY_NONINVOICEDRECEIPTS, nonInvoicedReceipts);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKASSET
     * 
     */
    public AccountingCombination getCashBookAsset() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKASSET);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKASSET
     * 
     */
    public void setCashBookAsset(AccountingCombination cashBookAsset) {
        set(PROPERTY_CASHBOOKASSET, cashBookAsset);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CASHTRANSFER
     * 
     */
    public AccountingCombination getCashTransfer() {
        return (AccountingCombination) get(PROPERTY_CASHTRANSFER);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CASHTRANSFER
     * 
     */
    public void setCashTransfer(AccountingCombination cashTransfer) {
        set(PROPERTY_CASHTRANSFER, cashTransfer);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKDIFFERENCES
     * 
     */
    public AccountingCombination getCashBookDifferences() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKDIFFERENCES);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKDIFFERENCES
     * 
     */
    public void setCashBookDifferences(AccountingCombination cashBookDifferences) {
        set(PROPERTY_CASHBOOKDIFFERENCES, cashBookDifferences);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKEXPENSE
     * 
     */
    public AccountingCombination getCashBookExpense() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKEXPENSE
     * 
     */
    public void setCashBookExpense(AccountingCombination cashBookExpense) {
        set(PROPERTY_CASHBOOKEXPENSE, cashBookExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKRECEIPT
     * 
     */
    public AccountingCombination getCashBookReceipt() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKRECEIPT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_CASHBOOKRECEIPT
     * 
     */
    public void setCashBookReceipt(AccountingCombination cashBookReceipt) {
        set(PROPERTY_CASHBOOKRECEIPT, cashBookReceipt);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_ACCUMULATEDDEPRECIATION
     * 
     */
    public AccountingCombination getAccumulatedDepreciation() {
        return (AccountingCombination) get(PROPERTY_ACCUMULATEDDEPRECIATION);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_ACCUMULATEDDEPRECIATION
     * 
     */
    public void setAccumulatedDepreciation(AccountingCombination accumulatedDepreciation) {
        set(PROPERTY_ACCUMULATEDDEPRECIATION, accumulatedDepreciation);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_DEPRECIATION
     * 
     */
    public AccountingCombination getDepreciation() {
        return (AccountingCombination) get(PROPERTY_DEPRECIATION);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_DEPRECIATION
     * 
     */
    public void setDepreciation(AccountingCombination depreciation) {
        set(PROPERTY_DEPRECIATION, depreciation);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_DISPOSALGAIN
     * 
     */
    public AccountingCombination getDisposalGain() {
        return (AccountingCombination) get(PROPERTY_DISPOSALGAIN);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_DISPOSALGAIN
     * 
     */
    public void setDisposalGain(AccountingCombination disposalGain) {
        set(PROPERTY_DISPOSALGAIN, disposalGain);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_DISPOSALLOSS
     * 
     */
    public AccountingCombination getDisposalLoss() {
        return (AccountingCombination) get(PROPERTY_DISPOSALLOSS);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_DISPOSALLOSS
     * 
     */
    public void setDisposalLoss(AccountingCombination disposalLoss) {
        set(PROPERTY_DISPOSALLOSS, disposalLoss);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTREVENUERETURN
     * 
     */
    public AccountingCombination getProductRevenueReturn() {
        return (AccountingCombination) get(PROPERTY_PRODUCTREVENUERETURN);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTREVENUERETURN
     * 
     */
    public void setProductRevenueReturn(AccountingCombination productRevenueReturn) {
        set(PROPERTY_PRODUCTREVENUERETURN, productRevenueReturn);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTCOGSRETURN
     * 
     */
    public AccountingCombination getProductCOGSReturn() {
        return (AccountingCombination) get(PROPERTY_PRODUCTCOGSRETURN);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTCOGSRETURN
     * 
     */
    public void setProductCOGSReturn(AccountingCombination productCOGSReturn) {
        set(PROPERTY_PRODUCTCOGSRETURN, productCOGSReturn);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTDEFERREDREVENUE
     * 
     */
    public AccountingCombination getProductDeferredRevenue() {
        return (AccountingCombination) get(PROPERTY_PRODUCTDEFERREDREVENUE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTDEFERREDREVENUE
     * 
     */
    public void setProductDeferredRevenue(AccountingCombination productDeferredRevenue) {
        set(PROPERTY_PRODUCTDEFERREDREVENUE, productDeferredRevenue);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTDEFERREDEXPENSE
     * 
     */
    public AccountingCombination getProductDeferredExpense() {
        return (AccountingCombination) get(PROPERTY_PRODUCTDEFERREDEXPENSE);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_PRODUCTDEFERREDEXPENSE
     * 
     */
    public void setProductDeferredExpense(AccountingCombination productDeferredExpense) {
        set(PROPERTY_PRODUCTDEFERREDEXPENSE, productDeferredExpense);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_DOUBTFULDEBTACCOUNT
     * 
     */
    public AccountingCombination getDoubtfulDebtAccount() {
        return (AccountingCombination) get(PROPERTY_DOUBTFULDEBTACCOUNT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_DOUBTFULDEBTACCOUNT
     * 
     */
    public void setDoubtfulDebtAccount(AccountingCombination doubtfulDebtAccount) {
        set(PROPERTY_DOUBTFULDEBTACCOUNT, doubtfulDebtAccount);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BADDEBTEXPENSEACCOUNT
     * 
     */
    public AccountingCombination getBadDebtExpenseAccount() {
        return (AccountingCombination) get(PROPERTY_BADDEBTEXPENSEACCOUNT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BADDEBTEXPENSEACCOUNT
     * 
     */
    public void setBadDebtExpenseAccount(AccountingCombination badDebtExpenseAccount) {
        set(PROPERTY_BADDEBTEXPENSEACCOUNT, badDebtExpenseAccount);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_BADDEBTREVENUEACCOUNT
     * 
     */
    public AccountingCombination getBadDebtRevenueAccount() {
        return (AccountingCombination) get(PROPERTY_BADDEBTREVENUEACCOUNT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_BADDEBTREVENUEACCOUNT
     * 
     */
    public void setBadDebtRevenueAccount(AccountingCombination badDebtRevenueAccount) {
        set(PROPERTY_BADDEBTREVENUEACCOUNT, badDebtRevenueAccount);
    }

    /**
     * @see AcctSchemaDefault#PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT
     * 
     */
    public AccountingCombination getAllowanceForDoubtfulDebtAccount() {
        return (AccountingCombination) get(PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT);
    }
    /**
     * @see AcctSchemaDefault#PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT
     * 
     */
    public void setAllowanceForDoubtfulDebtAccount(AccountingCombination allowanceForDoubtfulDebtAccount) {
        set(PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT, allowanceForDoubtfulDebtAccount);
    }

}
