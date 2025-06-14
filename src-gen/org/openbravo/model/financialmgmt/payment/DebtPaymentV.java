
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.Order;
import org.openbravo.model.financialmgmt.cashmgmt.BankStatementLine;
import org.openbravo.model.financialmgmt.cashmgmt.CashBook;
import org.openbravo.model.financialmgmt.cashmgmt.CashJournalLine;
import org.openbravo.model.financialmgmt.tax.Withholding;
/**
 * Entity class for entity DebtPaymentV (stored in table C_Debt_Payment_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DebtPaymentV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Debt_Payment_V";
    public static final String ENTITY_NAME = "DebtPaymentV";

    /**
     * Property id stored in column C_Debt_Payment_V_ID in table C_Debt_Payment_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property payment stored in column C_Debt_Payment_ID in table C_Debt_Payment_V 
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property client stored in column AD_Client_ID in table C_Debt_Payment_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Debt_Payment_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Debt_Payment_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Debt_Payment_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Debt_Payment_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Debt_Payment_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Debt_Payment_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property receipt stored in column IsReceipt in table C_Debt_Payment_V<br>
     * Help: {@literal Indicated a sales transaction (Accounts Receivable if Receipt=Y) or a purchase transaction
     *       (Accounts Payable if Receipt=N).}
     * 
     */
    public static final String PROPERTY_RECEIPT = "receipt";

    /**
     * Property settlementCancelled stored in column C_Settlement_Cancel_ID in table C_Debt_Payment_V<br>
     * Help: {@literal Identifier of a settlement in which this Payment has been cancelled.}
     * 
     */
    public static final String PROPERTY_SETTLEMENTCANCELLED = "settlementCancelled";

    /**
     * Property settlementGenerate stored in column C_Settlement_Generate_ID in table C_Debt_Payment_V<br>
     * Help: {@literal Refers to the settlement in which this Debt/Payment has been generated.}
     * 
     */
    public static final String PROPERTY_SETTLEMENTGENERATE = "settlementGenerate";

    /**
     * Property description stored in column Description in table C_Debt_Payment_V<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_Debt_Payment_V<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Debt_Payment_V<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property currency stored in column C_Currency_ID in table C_Debt_Payment_V<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property cashJournalLine stored in column C_CashLine_ID in table C_Debt_Payment_V<br>
     * Help: {@literal The Cash Journal Line indicates a unique line in a cash journal.}
     * 
     */
    public static final String PROPERTY_CASHJOURNALLINE = "cashJournalLine";

    /**
     * Property bankAccount stored in column C_BankAccount_ID in table C_Debt_Payment_V<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property cashbook stored in column C_CashBook_ID in table C_Debt_Payment_V<br>
     * Help: {@literal The Cash Book identifies a unique cash book.  The cash book is used to record cash
     *       transactions.}
     * 
     */
    public static final String PROPERTY_CASHBOOK = "cashbook";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_Debt_Payment_V<br>
     * Help: {@literal Form of Payment indicates the method of payment used for this transaction (eg. cash, wire
     *       transfer, etc.)}
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property paymentComplete stored in column IsPaid in table C_Debt_Payment_V<br>
     * Help: {@literal The document is paid for.}
     * 
     */
    public static final String PROPERTY_PAYMENTCOMPLETE = "paymentComplete";

    /**
     * Property dueDate stored in column Dateplanned in table C_Debt_Payment_V<br>
     * Help: {@literal Refers to a date by which the payment must be completed.}
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property manual stored in column IsManual in table C_Debt_Payment_V<br>
     * Help: {@literal The Manual check box indicates if the process will done manually.}
     * 
     */
    public static final String PROPERTY_MANUAL = "manual";

    /**
     * Property valid stored in column IsValid in table C_Debt_Payment_V<br>
     * Help: {@literal The element passed the validation check}
     * 
     */
    public static final String PROPERTY_VALID = "valid";

    /**
     * Property bankStatementLine stored in column C_BankStatementLine_ID in table C_Debt_Payment_V<br>
     * Help: {@literal The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for
     *       the defined time period at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKSTATEMENTLINE = "bankStatementLine";

    /**
     * Property changeSettlementCancel stored in column ChangeSettlementCancel in table C_Debt_Payment_V
     * 
     */
    public static final String PROPERTY_CHANGESETTLEMENTCANCEL = "changeSettlementCancel";

    /**
     * Property cancelProcessed stored in column Cancel_Processed in table C_Debt_Payment_V<br>
     * Help: {@literal The settlement cancel is processed.}
     * 
     */
    public static final String PROPERTY_CANCELPROCESSED = "cancelProcessed";

    /**
     * Property generateProcessed stored in column Generate_Processed in table C_Debt_Payment_V<br>
     * Help: {@literal The settlement generate is processed.}
     * 
     */
    public static final String PROPERTY_GENERATEPROCESSED = "generateProcessed";

    /**
     * Property withholding stored in column C_Withholding_ID in table C_Debt_Payment_V<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property withholdingamount stored in column Withholdingamount in table C_Debt_Payment_V
     * 
     */
    public static final String PROPERTY_WITHHOLDINGAMOUNT = "withholdingamount";

    /**
     * Property amount stored in column Amount in table C_Debt_Payment_V<br>
     * Help: {@literal The Amount indicates the amount for this document line.}
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property writeoffAmount stored in column WriteOffAmt in table C_Debt_Payment_V<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property multiplierAP stored in column MultiplierAP in table C_Debt_Payment_V<br>
     * Help: {@literal Payables Multiplier}
     * 
     */
    public static final String PROPERTY_MULTIPLIERAP = "multiplierAP";

    /**
     * Property docdate stored in column Docdate in table C_Debt_Payment_V
     * 
     */
    public static final String PROPERTY_DOCDATE = "docdate";

    /**
     * Property balancingAmount stored in column Glitemamt in table C_Debt_Payment_V
     * 
     */
    public static final String PROPERTY_BALANCINGAMOUNT = "balancingAmount";

    /**
     * Property salesOrder stored in column C_Order_ID in table C_Debt_Payment_V<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";


    public DebtPaymentV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RECEIPT, false);
        setDefaultValue(PROPERTY_FORMOFPAYMENT, false);
        setDefaultValue(PROPERTY_PAYMENTCOMPLETE, false);
        setDefaultValue(PROPERTY_MANUAL, false);
        setDefaultValue(PROPERTY_VALID, false);
        setDefaultValue(PROPERTY_CHANGESETTLEMENTCANCEL, false);
        setDefaultValue(PROPERTY_CANCELPROCESSED, false);
        setDefaultValue(PROPERTY_GENERATEPROCESSED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DebtPaymentV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DebtPaymentV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DebtPaymentV#PROPERTY_PAYMENT
     * 
     */
    public String getPayment() {
        return (String) get(PROPERTY_PAYMENT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(String payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DebtPaymentV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DebtPaymentV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DebtPaymentV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DebtPaymentV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DebtPaymentV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DebtPaymentV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DebtPaymentV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DebtPaymentV#PROPERTY_RECEIPT
     * 
     */
    public Boolean isReceipt() {
        return (Boolean) get(PROPERTY_RECEIPT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_RECEIPT
     * 
     */
    public void setReceipt(Boolean receipt) {
        set(PROPERTY_RECEIPT, receipt);
    }

    /**
     * @see DebtPaymentV#PROPERTY_SETTLEMENTCANCELLED
     * 
     */
    public BigDecimal getSettlementCancelled() {
        return (BigDecimal) get(PROPERTY_SETTLEMENTCANCELLED);
    }
    /**
     * @see DebtPaymentV#PROPERTY_SETTLEMENTCANCELLED
     * 
     */
    public void setSettlementCancelled(BigDecimal settlementCancelled) {
        set(PROPERTY_SETTLEMENTCANCELLED, settlementCancelled);
    }

    /**
     * @see DebtPaymentV#PROPERTY_SETTLEMENTGENERATE
     * 
     */
    public BigDecimal getSettlementGenerate() {
        return (BigDecimal) get(PROPERTY_SETTLEMENTGENERATE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_SETTLEMENTGENERATE
     * 
     */
    public void setSettlementGenerate(BigDecimal settlementGenerate) {
        set(PROPERTY_SETTLEMENTGENERATE, settlementGenerate);
    }

    /**
     * @see DebtPaymentV#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DebtPaymentV#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DebtPaymentV#PROPERTY_INVOICE
     * 
     */
    public String getInvoice() {
        return (String) get(PROPERTY_INVOICE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(String invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see DebtPaymentV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public String getBusinessPartner() {
        return (String) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see DebtPaymentV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(String businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CURRENCY
     * 
     */
    public String getCurrency() {
        return (String) get(PROPERTY_CURRENCY);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(String currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CASHJOURNALLINE
     * 
     */
    public CashJournalLine getCashJournalLine() {
        return (CashJournalLine) get(PROPERTY_CASHJOURNALLINE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CASHJOURNALLINE
     * 
     */
    public void setCashJournalLine(CashJournalLine cashJournalLine) {
        set(PROPERTY_CASHJOURNALLINE, cashJournalLine);
    }

    /**
     * @see DebtPaymentV#PROPERTY_BANKACCOUNT
     * 
     */
    public String getBankAccount() {
        return (String) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(String bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CASHBOOK
     * 
     */
    public CashBook getCashbook() {
        return (CashBook) get(PROPERTY_CASHBOOK);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CASHBOOK
     * 
     */
    public void setCashbook(CashBook cashbook) {
        set(PROPERTY_CASHBOOK, cashbook);
    }

    /**
     * @see DebtPaymentV#PROPERTY_FORMOFPAYMENT
     * 
     */
    public Boolean isFormOfPayment() {
        return (Boolean) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(Boolean formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see DebtPaymentV#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public Boolean isPaymentComplete() {
        return (Boolean) get(PROPERTY_PAYMENTCOMPLETE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public void setPaymentComplete(Boolean paymentComplete) {
        set(PROPERTY_PAYMENTCOMPLETE, paymentComplete);
    }

    /**
     * @see DebtPaymentV#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see DebtPaymentV#PROPERTY_MANUAL
     * 
     */
    public Boolean isManual() {
        return (Boolean) get(PROPERTY_MANUAL);
    }
    /**
     * @see DebtPaymentV#PROPERTY_MANUAL
     * 
     */
    public void setManual(Boolean manual) {
        set(PROPERTY_MANUAL, manual);
    }

    /**
     * @see DebtPaymentV#PROPERTY_VALID
     * 
     */
    public Boolean isValid() {
        return (Boolean) get(PROPERTY_VALID);
    }
    /**
     * @see DebtPaymentV#PROPERTY_VALID
     * 
     */
    public void setValid(Boolean valid) {
        set(PROPERTY_VALID, valid);
    }

    /**
     * @see DebtPaymentV#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public BankStatementLine getBankStatementLine() {
        return (BankStatementLine) get(PROPERTY_BANKSTATEMENTLINE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public void setBankStatementLine(BankStatementLine bankStatementLine) {
        set(PROPERTY_BANKSTATEMENTLINE, bankStatementLine);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CHANGESETTLEMENTCANCEL
     * 
     */
    public Boolean isChangeSettlementCancel() {
        return (Boolean) get(PROPERTY_CHANGESETTLEMENTCANCEL);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CHANGESETTLEMENTCANCEL
     * 
     */
    public void setChangeSettlementCancel(Boolean changeSettlementCancel) {
        set(PROPERTY_CHANGESETTLEMENTCANCEL, changeSettlementCancel);
    }

    /**
     * @see DebtPaymentV#PROPERTY_CANCELPROCESSED
     * 
     */
    public Boolean isCancelProcessed() {
        return (Boolean) get(PROPERTY_CANCELPROCESSED);
    }
    /**
     * @see DebtPaymentV#PROPERTY_CANCELPROCESSED
     * 
     */
    public void setCancelProcessed(Boolean cancelProcessed) {
        set(PROPERTY_CANCELPROCESSED, cancelProcessed);
    }

    /**
     * @see DebtPaymentV#PROPERTY_GENERATEPROCESSED
     * 
     */
    public Boolean isGenerateProcessed() {
        return (Boolean) get(PROPERTY_GENERATEPROCESSED);
    }
    /**
     * @see DebtPaymentV#PROPERTY_GENERATEPROCESSED
     * 
     */
    public void setGenerateProcessed(Boolean generateProcessed) {
        set(PROPERTY_GENERATEPROCESSED, generateProcessed);
    }

    /**
     * @see DebtPaymentV#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see DebtPaymentV#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see DebtPaymentV#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public Long getWithholdingamount() {
        return (Long) get(PROPERTY_WITHHOLDINGAMOUNT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public void setWithholdingamount(Long withholdingamount) {
        set(PROPERTY_WITHHOLDINGAMOUNT, withholdingamount);
    }

    /**
     * @see DebtPaymentV#PROPERTY_AMOUNT
     * 
     */
    public Long getAmount() {
        return (Long) get(PROPERTY_AMOUNT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(Long amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see DebtPaymentV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public Long getWriteoffAmount() {
        return (Long) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(Long writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see DebtPaymentV#PROPERTY_MULTIPLIERAP
     * 
     */
    public Long getMultiplierAP() {
        return (Long) get(PROPERTY_MULTIPLIERAP);
    }
    /**
     * @see DebtPaymentV#PROPERTY_MULTIPLIERAP
     * 
     */
    public void setMultiplierAP(Long multiplierAP) {
        set(PROPERTY_MULTIPLIERAP, multiplierAP);
    }

    /**
     * @see DebtPaymentV#PROPERTY_DOCDATE
     * 
     */
    public Date getDocdate() {
        return (Date) get(PROPERTY_DOCDATE);
    }
    /**
     * @see DebtPaymentV#PROPERTY_DOCDATE
     * 
     */
    public void setDocdate(Date docdate) {
        set(PROPERTY_DOCDATE, docdate);
    }

    /**
     * @see DebtPaymentV#PROPERTY_BALANCINGAMOUNT
     * 
     */
    public Long getBalancingAmount() {
        return (Long) get(PROPERTY_BALANCINGAMOUNT);
    }
    /**
     * @see DebtPaymentV#PROPERTY_BALANCINGAMOUNT
     * 
     */
    public void setBalancingAmount(Long balancingAmount) {
        set(PROPERTY_BALANCINGAMOUNT, balancingAmount);
    }

    /**
     * @see DebtPaymentV#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see DebtPaymentV#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

}
