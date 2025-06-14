
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.AccountingCombination;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
/**
 * Entity class for entity BusinessPartnerCategoryAccount (stored in table C_BP_Group_Acct).
 * <br>
 * Help: {@literal Defines the default accounts for any business partner that references this group.  These
     *       default values can be modified for each business partner if required.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CategoryAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BP_Group_Acct";
    public static final String ENTITY_NAME = "BusinessPartnerCategoryAccount";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_BP_Group_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property businessPartnerCategory stored in column C_BP_Group_ID in table C_BP_Group_Acct<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property client stored in column AD_Client_ID in table C_BP_Group_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BP_Group_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BP_Group_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BP_Group_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BP_Group_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BP_Group_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BP_Group_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property customerReceivablesNo stored in column C_Receivable_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Customer Receivables Accounts indicates the account to be used for recording
     *       transaction for customers receivables.}
     * 
     */
    public static final String PROPERTY_CUSTOMERRECEIVABLESNO = "customerReceivablesNo";

    /**
     * Property customerPrepayment stored in column C_Prepayment_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Customer Prepayment account indicates the account to be used for recording prepayments
     *       from a customer.}
     * 
     */
    public static final String PROPERTY_CUSTOMERPREPAYMENT = "customerPrepayment";

    /**
     * Property vendorLiability stored in column V_Liability_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Vendor Liability account indicates the account used for recording transactions for
     *       vendor liabilities}
     * 
     */
    public static final String PROPERTY_VENDORLIABILITY = "vendorLiability";

    /**
     * Property vendorServiceLiability stored in column V_Liability_Services_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Vendor Service Liability account indicates the account to use for recording service
     *       liabilities.  It is used if you need to distinguish between Liability for products and services}
     * 
     */
    public static final String PROPERTY_VENDORSERVICELIABILITY = "vendorServiceLiability";

    /**
     * Property vendorPrepayment stored in column V_Prepayment_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Vendor Prepayment Account indicates the account used to record prepayments from a
     *       vendor.}
     * 
     */
    public static final String PROPERTY_VENDORPREPAYMENT = "vendorPrepayment";

    /**
     * Property paymentDiscountExpense stored in column PayDiscount_Exp_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal Indicates the account to be charged for payment discount expenses.}
     * 
     */
    public static final String PROPERTY_PAYMENTDISCOUNTEXPENSE = "paymentDiscountExpense";

    /**
     * Property paymentDiscountRevenue stored in column PayDiscount_Rev_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal Indicates the account to be charged for payment discount revenues.}
     * 
     */
    public static final String PROPERTY_PAYMENTDISCOUNTREVENUE = "paymentDiscountRevenue";

    /**
     * Property writeoff stored in column WriteOff_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Write Off Account identifies the account to book write off transactions to.}
     * 
     */
    public static final String PROPERTY_WRITEOFF = "writeoff";

    /**
     * Property unrealizedGainsAcct stored in column UnrealizedGain_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Unrealized Gain Account indicates the account to be used when recording gains achieved
     *       from currency revaluation that have yet to be realized.}
     * 
     */
    public static final String PROPERTY_UNREALIZEDGAINSACCT = "unrealizedGainsAcct";

    /**
     * Property unrealizedLossesAcct stored in column UnrealizedLoss_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Unrealized Loss Account indicates the account to be used when recording losses
     *       incurred from currency revaluation that have yet to be realized.}
     * 
     */
    public static final String PROPERTY_UNREALIZEDLOSSESACCT = "unrealizedLossesAcct";

    /**
     * Property realizedGainAcct stored in column RealizedGain_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Realized Gain Account indicates the account to be used when recording gains achieved
     *       from currency revaluation that have been realized.}
     * 
     */
    public static final String PROPERTY_REALIZEDGAINACCT = "realizedGainAcct";

    /**
     * Property realizedLossAcct stored in column RealizedLoss_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Realized Loss Account indicates the account to be used when recording losses incurred
     *       from currency revaluation that have yet to be realized.}
     * 
     */
    public static final String PROPERTY_REALIZEDLOSSACCT = "realizedLossAcct";

    /**
     * Property nonInvoicedReceipts stored in column NotInvoicedReceipts_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Not Invoiced Receipts account indicates the account used for recording receipts for
     *       materials that have not yet been invoiced.}
     * 
     */
    public static final String PROPERTY_NONINVOICEDRECEIPTS = "nonInvoicedReceipts";

    /**
     * Property unearnedRevenue stored in column UnEarnedRevenue_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Unearned Revenue indicates the account used for recording invoices sent for products
     *       or services not yet delivered.  It is used in revenue recognition}
     * 
     */
    public static final String PROPERTY_UNEARNEDREVENUE = "unearnedRevenue";

    /**
     * Property nonInvoicedRevenues stored in column NotInvoicedRevenue_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Not Invoiced Revenue account indicates the account used for recording revenue that has
     *       not yet been invoiced.}
     * 
     */
    public static final String PROPERTY_NONINVOICEDREVENUES = "nonInvoicedRevenues";

    /**
     * Property nonInvoicedReceivables stored in column NotInvoicedReceivables_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Not Invoiced Receivables account indicates the account used for recording receivables
     *       that have not yet been invoiced.}
     * 
     */
    public static final String PROPERTY_NONINVOICEDRECEIVABLES = "nonInvoicedReceivables";

    /**
     * Property processNow stored in column Processing in table C_BP_Group_Acct<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property id stored in column C_Bp_Group_Acct_ID in table C_BP_Group_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property status stored in column Status in table C_BP_Group_Acct<br>
     * Help: {@literal Status for the debt payment}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property writeoffRevAcct stored in column Writeoff_Rev_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal The Write Off Account identifies the account to book write off transactions to.}
     * 
     */
    public static final String PROPERTY_WRITEOFFREVACCT = "writeoffRevAcct";

    /**
     * Property doubtfulDebtAccount stored in column Doubtfuldebt_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal Account used to reclassify an account receivable once this has been recognized as a
     *       doubtful debt}
     * 
     */
    public static final String PROPERTY_DOUBTFULDEBTACCOUNT = "doubtfulDebtAccount";

    /**
     * Property badDebtExpenseAccount stored in column BadDebtExpense_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal Account used to book the expense related to a recover of a bad debt}
     * 
     */
    public static final String PROPERTY_BADDEBTEXPENSEACCOUNT = "badDebtExpenseAccount";

    /**
     * Property badDebtRevenueAccount stored in column Baddebtrevenue_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal Account used to book the revenue related to a recover of a bad debt}
     * 
     */
    public static final String PROPERTY_BADDEBTREVENUEACCOUNT = "badDebtRevenueAccount";

    /**
     * Property allowanceForDoubtfulDebtAccount stored in column AllowanceForDoubtful_Acct in table C_BP_Group_Acct<br>
     * Help: {@literal Account used to provision bad debts. This amount will reduce accounts receivable amount in
     *       balance sheet.}
     * 
     */
    public static final String PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT = "allowanceForDoubtfulDebtAccount";


    public CategoryAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CategoryAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see CategoryAccounts#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CategoryAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CategoryAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CategoryAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CategoryAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CategoryAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CUSTOMERRECEIVABLESNO
     * 
     */
    public AccountingCombination getCustomerReceivablesNo() {
        return (AccountingCombination) get(PROPERTY_CUSTOMERRECEIVABLESNO);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CUSTOMERRECEIVABLESNO
     * 
     */
    public void setCustomerReceivablesNo(AccountingCombination customerReceivablesNo) {
        set(PROPERTY_CUSTOMERRECEIVABLESNO, customerReceivablesNo);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CUSTOMERPREPAYMENT
     * 
     */
    public AccountingCombination getCustomerPrepayment() {
        return (AccountingCombination) get(PROPERTY_CUSTOMERPREPAYMENT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CUSTOMERPREPAYMENT
     * 
     */
    public void setCustomerPrepayment(AccountingCombination customerPrepayment) {
        set(PROPERTY_CUSTOMERPREPAYMENT, customerPrepayment);
    }

    /**
     * @see CategoryAccounts#PROPERTY_VENDORLIABILITY
     * 
     */
    public AccountingCombination getVendorLiability() {
        return (AccountingCombination) get(PROPERTY_VENDORLIABILITY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_VENDORLIABILITY
     * 
     */
    public void setVendorLiability(AccountingCombination vendorLiability) {
        set(PROPERTY_VENDORLIABILITY, vendorLiability);
    }

    /**
     * @see CategoryAccounts#PROPERTY_VENDORSERVICELIABILITY
     * 
     */
    public AccountingCombination getVendorServiceLiability() {
        return (AccountingCombination) get(PROPERTY_VENDORSERVICELIABILITY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_VENDORSERVICELIABILITY
     * 
     */
    public void setVendorServiceLiability(AccountingCombination vendorServiceLiability) {
        set(PROPERTY_VENDORSERVICELIABILITY, vendorServiceLiability);
    }

    /**
     * @see CategoryAccounts#PROPERTY_VENDORPREPAYMENT
     * 
     */
    public AccountingCombination getVendorPrepayment() {
        return (AccountingCombination) get(PROPERTY_VENDORPREPAYMENT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_VENDORPREPAYMENT
     * 
     */
    public void setVendorPrepayment(AccountingCombination vendorPrepayment) {
        set(PROPERTY_VENDORPREPAYMENT, vendorPrepayment);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PAYMENTDISCOUNTEXPENSE
     * 
     */
    public AccountingCombination getPaymentDiscountExpense() {
        return (AccountingCombination) get(PROPERTY_PAYMENTDISCOUNTEXPENSE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PAYMENTDISCOUNTEXPENSE
     * 
     */
    public void setPaymentDiscountExpense(AccountingCombination paymentDiscountExpense) {
        set(PROPERTY_PAYMENTDISCOUNTEXPENSE, paymentDiscountExpense);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PAYMENTDISCOUNTREVENUE
     * 
     */
    public AccountingCombination getPaymentDiscountRevenue() {
        return (AccountingCombination) get(PROPERTY_PAYMENTDISCOUNTREVENUE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PAYMENTDISCOUNTREVENUE
     * 
     */
    public void setPaymentDiscountRevenue(AccountingCombination paymentDiscountRevenue) {
        set(PROPERTY_PAYMENTDISCOUNTREVENUE, paymentDiscountRevenue);
    }

    /**
     * @see CategoryAccounts#PROPERTY_WRITEOFF
     * 
     */
    public AccountingCombination getWriteoff() {
        return (AccountingCombination) get(PROPERTY_WRITEOFF);
    }
    /**
     * @see CategoryAccounts#PROPERTY_WRITEOFF
     * 
     */
    public void setWriteoff(AccountingCombination writeoff) {
        set(PROPERTY_WRITEOFF, writeoff);
    }

    /**
     * @see CategoryAccounts#PROPERTY_UNREALIZEDGAINSACCT
     * 
     */
    public AccountingCombination getUnrealizedGainsAcct() {
        return (AccountingCombination) get(PROPERTY_UNREALIZEDGAINSACCT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_UNREALIZEDGAINSACCT
     * 
     */
    public void setUnrealizedGainsAcct(AccountingCombination unrealizedGainsAcct) {
        set(PROPERTY_UNREALIZEDGAINSACCT, unrealizedGainsAcct);
    }

    /**
     * @see CategoryAccounts#PROPERTY_UNREALIZEDLOSSESACCT
     * 
     */
    public AccountingCombination getUnrealizedLossesAcct() {
        return (AccountingCombination) get(PROPERTY_UNREALIZEDLOSSESACCT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_UNREALIZEDLOSSESACCT
     * 
     */
    public void setUnrealizedLossesAcct(AccountingCombination unrealizedLossesAcct) {
        set(PROPERTY_UNREALIZEDLOSSESACCT, unrealizedLossesAcct);
    }

    /**
     * @see CategoryAccounts#PROPERTY_REALIZEDGAINACCT
     * 
     */
    public AccountingCombination getRealizedGainAcct() {
        return (AccountingCombination) get(PROPERTY_REALIZEDGAINACCT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_REALIZEDGAINACCT
     * 
     */
    public void setRealizedGainAcct(AccountingCombination realizedGainAcct) {
        set(PROPERTY_REALIZEDGAINACCT, realizedGainAcct);
    }

    /**
     * @see CategoryAccounts#PROPERTY_REALIZEDLOSSACCT
     * 
     */
    public AccountingCombination getRealizedLossAcct() {
        return (AccountingCombination) get(PROPERTY_REALIZEDLOSSACCT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_REALIZEDLOSSACCT
     * 
     */
    public void setRealizedLossAcct(AccountingCombination realizedLossAcct) {
        set(PROPERTY_REALIZEDLOSSACCT, realizedLossAcct);
    }

    /**
     * @see CategoryAccounts#PROPERTY_NONINVOICEDRECEIPTS
     * 
     */
    public AccountingCombination getNonInvoicedReceipts() {
        return (AccountingCombination) get(PROPERTY_NONINVOICEDRECEIPTS);
    }
    /**
     * @see CategoryAccounts#PROPERTY_NONINVOICEDRECEIPTS
     * 
     */
    public void setNonInvoicedReceipts(AccountingCombination nonInvoicedReceipts) {
        set(PROPERTY_NONINVOICEDRECEIPTS, nonInvoicedReceipts);
    }

    /**
     * @see CategoryAccounts#PROPERTY_UNEARNEDREVENUE
     * 
     */
    public AccountingCombination getUnearnedRevenue() {
        return (AccountingCombination) get(PROPERTY_UNEARNEDREVENUE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_UNEARNEDREVENUE
     * 
     */
    public void setUnearnedRevenue(AccountingCombination unearnedRevenue) {
        set(PROPERTY_UNEARNEDREVENUE, unearnedRevenue);
    }

    /**
     * @see CategoryAccounts#PROPERTY_NONINVOICEDREVENUES
     * 
     */
    public AccountingCombination getNonInvoicedRevenues() {
        return (AccountingCombination) get(PROPERTY_NONINVOICEDREVENUES);
    }
    /**
     * @see CategoryAccounts#PROPERTY_NONINVOICEDREVENUES
     * 
     */
    public void setNonInvoicedRevenues(AccountingCombination nonInvoicedRevenues) {
        set(PROPERTY_NONINVOICEDREVENUES, nonInvoicedRevenues);
    }

    /**
     * @see CategoryAccounts#PROPERTY_NONINVOICEDRECEIVABLES
     * 
     */
    public AccountingCombination getNonInvoicedReceivables() {
        return (AccountingCombination) get(PROPERTY_NONINVOICEDRECEIVABLES);
    }
    /**
     * @see CategoryAccounts#PROPERTY_NONINVOICEDRECEIVABLES
     * 
     */
    public void setNonInvoicedReceivables(AccountingCombination nonInvoicedReceivables) {
        set(PROPERTY_NONINVOICEDRECEIVABLES, nonInvoicedReceivables);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see CategoryAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CategoryAccounts#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see CategoryAccounts#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see CategoryAccounts#PROPERTY_WRITEOFFREVACCT
     * 
     */
    public AccountingCombination getWriteoffRevAcct() {
        return (AccountingCombination) get(PROPERTY_WRITEOFFREVACCT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_WRITEOFFREVACCT
     * 
     */
    public void setWriteoffRevAcct(AccountingCombination writeoffRevAcct) {
        set(PROPERTY_WRITEOFFREVACCT, writeoffRevAcct);
    }

    /**
     * @see CategoryAccounts#PROPERTY_DOUBTFULDEBTACCOUNT
     * 
     */
    public AccountingCombination getDoubtfulDebtAccount() {
        return (AccountingCombination) get(PROPERTY_DOUBTFULDEBTACCOUNT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_DOUBTFULDEBTACCOUNT
     * 
     */
    public void setDoubtfulDebtAccount(AccountingCombination doubtfulDebtAccount) {
        set(PROPERTY_DOUBTFULDEBTACCOUNT, doubtfulDebtAccount);
    }

    /**
     * @see CategoryAccounts#PROPERTY_BADDEBTEXPENSEACCOUNT
     * 
     */
    public AccountingCombination getBadDebtExpenseAccount() {
        return (AccountingCombination) get(PROPERTY_BADDEBTEXPENSEACCOUNT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_BADDEBTEXPENSEACCOUNT
     * 
     */
    public void setBadDebtExpenseAccount(AccountingCombination badDebtExpenseAccount) {
        set(PROPERTY_BADDEBTEXPENSEACCOUNT, badDebtExpenseAccount);
    }

    /**
     * @see CategoryAccounts#PROPERTY_BADDEBTREVENUEACCOUNT
     * 
     */
    public AccountingCombination getBadDebtRevenueAccount() {
        return (AccountingCombination) get(PROPERTY_BADDEBTREVENUEACCOUNT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_BADDEBTREVENUEACCOUNT
     * 
     */
    public void setBadDebtRevenueAccount(AccountingCombination badDebtRevenueAccount) {
        set(PROPERTY_BADDEBTREVENUEACCOUNT, badDebtRevenueAccount);
    }

    /**
     * @see CategoryAccounts#PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT
     * 
     */
    public AccountingCombination getAllowanceForDoubtfulDebtAccount() {
        return (AccountingCombination) get(PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT
     * 
     */
    public void setAllowanceForDoubtfulDebtAccount(AccountingCombination allowanceForDoubtfulDebtAccount) {
        set(PROPERTY_ALLOWANCEFORDOUBTFULDEBTACCOUNT, allowanceForDoubtfulDebtAccount);
    }

}
