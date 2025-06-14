
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
package org.openbravo.model.financialmgmt.payment;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.bank.BankAccount;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.financialmgmt.cashmgmt.BankStatementLine;
import org.openbravo.model.financialmgmt.cashmgmt.CashBook;
import org.openbravo.model.financialmgmt.cashmgmt.CashJournalLine;
import org.openbravo.model.financialmgmt.tax.Withholding;
/**
 * Entity class for entity FinancialMgmtDebtPaymentCancelV (stored in table C_Debt_Payment_Cancel).
 * <br>
 * Help: {@literal Canceled debt payment tab allows the debt payment transformation into a generated debt
     *       payment. If you want to add new records in this tab, you must use the Create from button on the
     *       settlement tab. Once you have a cancelled debt payment, the only way to ed}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DebtPaymentCancelV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Debt_Payment_Cancel";
    public static final String ENTITY_NAME = "FinancialMgmtDebtPaymentCancelV";

    /**
     * Property id stored in column C_Debt_Payment_ID in table C_Debt_Payment_Cancel 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Debt_Payment_Cancel 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Debt_Payment_Cancel 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Debt_Payment_Cancel 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Debt_Payment_Cancel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Debt_Payment_Cancel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Debt_Payment_Cancel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Debt_Payment_Cancel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property receipt stored in column IsReceipt in table C_Debt_Payment_Cancel 
     * 
     */
    public static final String PROPERTY_RECEIPT = "receipt";

    /**
     * Property settlement stored in column C_Settlement_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal Termination of a business operation by using its assets to discharge its liabilities.}
     * 
     */
    public static final String PROPERTY_SETTLEMENT = "settlement";

    /**
     * Property description stored in column Description in table C_Debt_Payment_Cancel<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property currency stored in column C_Currency_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property cashJournalLine stored in column C_CashLine_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Cash Journal Line indicates a unique line in a cash journal.}
     * 
     */
    public static final String PROPERTY_CASHJOURNALLINE = "cashJournalLine";

    /**
     * Property bankStatementLine stored in column C_BankStatementLine_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for
     *       the defined time period at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKSTATEMENTLINE = "bankStatementLine";

    /**
     * Property bankAccount stored in column C_BankAccount_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property cashbook stored in column C_CashBook_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Cash Book identifies a unique cash book.  The cash book is used to record cash
     *       transactions.}
     * 
     */
    public static final String PROPERTY_CASHBOOK = "cashbook";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_Debt_Payment_Cancel 
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property paymentComplete stored in column IsPaid in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The document is paid for.}
     * 
     */
    public static final String PROPERTY_PAYMENTCOMPLETE = "paymentComplete";

    /**
     * Property amount stored in column Amount in table C_Debt_Payment_Cancel 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property writeoffAmount stored in column WriteOffAmt in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property dueDate stored in column Dateplanned in table C_Debt_Payment_Cancel 
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property manual stored in column IsManual in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Manual check box indicates if the process will done manually.}
     * 
     */
    public static final String PROPERTY_MANUAL = "manual";

    /**
     * Property valid stored in column IsValid in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The element passed the validation check}
     * 
     */
    public static final String PROPERTY_VALID = "valid";

    /**
     * Property changeSettlementCancel stored in column ChangeSettlementCancel in table C_Debt_Payment_Cancel
     * 
     */
    public static final String PROPERTY_CHANGESETTLEMENTCANCEL = "changeSettlementCancel";

    /**
     * Property cancelProcessed stored in column Cancel_Processed in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The settlement cancel is processed.}
     * 
     */
    public static final String PROPERTY_CANCELPROCESSED = "cancelProcessed";

    /**
     * Property settlementGenerate stored in column C_Settlement_Generate_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal Refers to the settlement in which this Debt/Payment has been generated.}
     * 
     */
    public static final String PROPERTY_SETTLEMENTGENERATE = "settlementGenerate";

    /**
     * Property status stored in column Status in table C_Debt_Payment_Cancel<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property withholding stored in column C_Withholding_ID in table C_Debt_Payment_Cancel<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property withholdingamount stored in column Withholdingamount in table C_Debt_Payment_Cancel
     * 
     */
    public static final String PROPERTY_WITHHOLDINGAMOUNT = "withholdingamount";


    public DebtPaymentCancelV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RECEIPT, false);
        setDefaultValue(PROPERTY_PAYMENTCOMPLETE, false);
        setDefaultValue(PROPERTY_MANUAL, false);
        setDefaultValue(PROPERTY_VALID, false);
        setDefaultValue(PROPERTY_CHANGESETTLEMENTCANCEL, false);
        setDefaultValue(PROPERTY_CANCELPROCESSED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_RECEIPT
     * 
     */
    public Boolean isReceipt() {
        return (Boolean) get(PROPERTY_RECEIPT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_RECEIPT
     * 
     */
    public void setReceipt(Boolean receipt) {
        set(PROPERTY_RECEIPT, receipt);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_SETTLEMENT
     * 
     */
    public Settlement getSettlement() {
        return (Settlement) get(PROPERTY_SETTLEMENT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_SETTLEMENT
     * 
     */
    public void setSettlement(Settlement settlement) {
        set(PROPERTY_SETTLEMENT, settlement);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CASHJOURNALLINE
     * 
     */
    public CashJournalLine getCashJournalLine() {
        return (CashJournalLine) get(PROPERTY_CASHJOURNALLINE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CASHJOURNALLINE
     * 
     */
    public void setCashJournalLine(CashJournalLine cashJournalLine) {
        set(PROPERTY_CASHJOURNALLINE, cashJournalLine);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public BankStatementLine getBankStatementLine() {
        return (BankStatementLine) get(PROPERTY_BANKSTATEMENTLINE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public void setBankStatementLine(BankStatementLine bankStatementLine) {
        set(PROPERTY_BANKSTATEMENTLINE, bankStatementLine);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_BANKACCOUNT
     * 
     */
    public BankAccount getBankAccount() {
        return (BankAccount) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(BankAccount bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CASHBOOK
     * 
     */
    public CashBook getCashbook() {
        return (CashBook) get(PROPERTY_CASHBOOK);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CASHBOOK
     * 
     */
    public void setCashbook(CashBook cashbook) {
        set(PROPERTY_CASHBOOK, cashbook);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_FORMOFPAYMENT
     * 
     */
    public String getFormOfPayment() {
        return (String) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(String formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public Boolean isPaymentComplete() {
        return (Boolean) get(PROPERTY_PAYMENTCOMPLETE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public void setPaymentComplete(Boolean paymentComplete) {
        set(PROPERTY_PAYMENTCOMPLETE, paymentComplete);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_MANUAL
     * 
     */
    public Boolean isManual() {
        return (Boolean) get(PROPERTY_MANUAL);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_MANUAL
     * 
     */
    public void setManual(Boolean manual) {
        set(PROPERTY_MANUAL, manual);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_VALID
     * 
     */
    public Boolean isValid() {
        return (Boolean) get(PROPERTY_VALID);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_VALID
     * 
     */
    public void setValid(Boolean valid) {
        set(PROPERTY_VALID, valid);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CHANGESETTLEMENTCANCEL
     * 
     */
    public Boolean isChangeSettlementCancel() {
        return (Boolean) get(PROPERTY_CHANGESETTLEMENTCANCEL);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CHANGESETTLEMENTCANCEL
     * 
     */
    public void setChangeSettlementCancel(Boolean changeSettlementCancel) {
        set(PROPERTY_CHANGESETTLEMENTCANCEL, changeSettlementCancel);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_CANCELPROCESSED
     * 
     */
    public Boolean isCancelProcessed() {
        return (Boolean) get(PROPERTY_CANCELPROCESSED);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_CANCELPROCESSED
     * 
     */
    public void setCancelProcessed(Boolean cancelProcessed) {
        set(PROPERTY_CANCELPROCESSED, cancelProcessed);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_SETTLEMENTGENERATE
     * 
     */
    public Settlement getSettlementGenerate() {
        return (Settlement) get(PROPERTY_SETTLEMENTGENERATE);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_SETTLEMENTGENERATE
     * 
     */
    public void setSettlementGenerate(Settlement settlementGenerate) {
        set(PROPERTY_SETTLEMENTGENERATE, settlementGenerate);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see DebtPaymentCancelV#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public BigDecimal getWithholdingamount() {
        return (BigDecimal) get(PROPERTY_WITHHOLDINGAMOUNT);
    }
    /**
     * @see DebtPaymentCancelV#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public void setWithholdingamount(BigDecimal withholdingamount) {
        set(PROPERTY_WITHHOLDINGAMOUNT, withholdingamount);
    }

}
