
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
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.financialmgmt.tax.Withholding;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FinancialMgmtDebtPaymentGenerateV (stored in table C_Debt_Payment_Generate).
 * <br>
 * Help: {@literal Using this tab we can generate new debt payments. The cancelled ones and the generated
     *       ones must have the same amount. Otherwise it is not possible to process it.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DebtPaymentGenerateV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Debt_Payment_Generate";
    public static final String ENTITY_NAME = "FinancialMgmtDebtPaymentGenerateV";

    /**
     * Property id stored in column C_Debt_Payment_ID in table C_Debt_Payment_Generate 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Debt_Payment_Generate 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Debt_Payment_Generate 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Debt_Payment_Generate 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Debt_Payment_Generate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Debt_Payment_Generate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Debt_Payment_Generate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Debt_Payment_Generate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property receipt stored in column IsReceipt in table C_Debt_Payment_Generate 
     * 
     */
    public static final String PROPERTY_RECEIPT = "receipt";

    /**
     * Property settlement stored in column C_Settlement_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal Termination of a business operation by using its assets to discharge its liabilities.}
     * 
     */
    public static final String PROPERTY_SETTLEMENT = "settlement";

    /**
     * Property description stored in column Description in table C_Debt_Payment_Generate<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property currency stored in column C_Currency_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property cashJournalLine stored in column C_CashLine_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Cash Journal Line indicates a unique line in a cash journal.}
     * 
     */
    public static final String PROPERTY_CASHJOURNALLINE = "cashJournalLine";

    /**
     * Property bankStatementLine stored in column C_BankStatementLine_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for
     *       the defined time period at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKSTATEMENTLINE = "bankStatementLine";

    /**
     * Property bankAccount stored in column C_BankAccount_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property cashbook stored in column C_CashBook_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Cash Book identifies a unique cash book.  The cash book is used to record cash
     *       transactions.}
     * 
     */
    public static final String PROPERTY_CASHBOOK = "cashbook";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_Debt_Payment_Generate 
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property paymentComplete stored in column IsPaid in table C_Debt_Payment_Generate<br>
     * Help: {@literal The document is paid for.}
     * 
     */
    public static final String PROPERTY_PAYMENTCOMPLETE = "paymentComplete";

    /**
     * Property amount stored in column Amount in table C_Debt_Payment_Generate 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property writeoffAmount stored in column WriteOffAmt in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property dueDate stored in column Dateplanned in table C_Debt_Payment_Generate 
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property manual stored in column IsManual in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Manual check box indicates if the process will done manually.}
     * 
     */
    public static final String PROPERTY_MANUAL = "manual";

    /**
     * Property valid stored in column IsValid in table C_Debt_Payment_Generate<br>
     * Help: {@literal The element passed the validation check}
     * 
     */
    public static final String PROPERTY_VALID = "valid";

    /**
     * Property generateProcessed stored in column Generate_Processed in table C_Debt_Payment_Generate<br>
     * Help: {@literal The settlement generate is processed.}
     * 
     */
    public static final String PROPERTY_GENERATEPROCESSED = "generateProcessed";

    /**
     * Property balancingAmount stored in column GLItemAmt in table C_Debt_Payment_Generate
     * 
     */
    public static final String PROPERTY_BALANCINGAMOUNT = "balancingAmount";

    /**
     * Property settlementCancelled stored in column C_Settlement_Cancel_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal Identifier of a settlement in which this Payment has been cancelled.}
     * 
     */
    public static final String PROPERTY_SETTLEMENTCANCELLED = "settlementCancelled";

    /**
     * Property gLItem stored in column C_Glitem_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property directPosting stored in column Isdirectposting in table C_Debt_Payment_Generate<br>
     * Help: {@literal Direct Posting}
     * 
     */
    public static final String PROPERTY_DIRECTPOSTING = "directPosting";

    /**
     * Property status stored in column Status in table C_Debt_Payment_Generate<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property project stored in column C_Project_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property withholding stored in column C_Withholding_ID in table C_Debt_Payment_Generate<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property withholdingamount stored in column Withholdingamount in table C_Debt_Payment_Generate
     * 
     */
    public static final String PROPERTY_WITHHOLDINGAMOUNT = "withholdingamount";


    public DebtPaymentGenerateV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RECEIPT, true);
        setDefaultValue(PROPERTY_PAYMENTCOMPLETE, false);
        setDefaultValue(PROPERTY_WRITEOFFAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_VALID, false);
        setDefaultValue(PROPERTY_GENERATEPROCESSED, false);
        setDefaultValue(PROPERTY_DIRECTPOSTING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_RECEIPT
     * 
     */
    public Boolean isReceipt() {
        return (Boolean) get(PROPERTY_RECEIPT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_RECEIPT
     * 
     */
    public void setReceipt(Boolean receipt) {
        set(PROPERTY_RECEIPT, receipt);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_SETTLEMENT
     * 
     */
    public Settlement getSettlement() {
        return (Settlement) get(PROPERTY_SETTLEMENT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_SETTLEMENT
     * 
     */
    public void setSettlement(Settlement settlement) {
        set(PROPERTY_SETTLEMENT, settlement);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_CASHJOURNALLINE
     * 
     */
    public CashJournalLine getCashJournalLine() {
        return (CashJournalLine) get(PROPERTY_CASHJOURNALLINE);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_CASHJOURNALLINE
     * 
     */
    public void setCashJournalLine(CashJournalLine cashJournalLine) {
        set(PROPERTY_CASHJOURNALLINE, cashJournalLine);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public BankStatementLine getBankStatementLine() {
        return (BankStatementLine) get(PROPERTY_BANKSTATEMENTLINE);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public void setBankStatementLine(BankStatementLine bankStatementLine) {
        set(PROPERTY_BANKSTATEMENTLINE, bankStatementLine);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_BANKACCOUNT
     * 
     */
    public BankAccount getBankAccount() {
        return (BankAccount) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(BankAccount bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_CASHBOOK
     * 
     */
    public CashBook getCashbook() {
        return (CashBook) get(PROPERTY_CASHBOOK);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_CASHBOOK
     * 
     */
    public void setCashbook(CashBook cashbook) {
        set(PROPERTY_CASHBOOK, cashbook);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_FORMOFPAYMENT
     * 
     */
    public String getFormOfPayment() {
        return (String) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(String formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public Boolean isPaymentComplete() {
        return (Boolean) get(PROPERTY_PAYMENTCOMPLETE);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_PAYMENTCOMPLETE
     * 
     */
    public void setPaymentComplete(Boolean paymentComplete) {
        set(PROPERTY_PAYMENTCOMPLETE, paymentComplete);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_MANUAL
     * 
     */
    public Boolean isManual() {
        return (Boolean) get(PROPERTY_MANUAL);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_MANUAL
     * 
     */
    public void setManual(Boolean manual) {
        set(PROPERTY_MANUAL, manual);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_VALID
     * 
     */
    public Boolean isValid() {
        return (Boolean) get(PROPERTY_VALID);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_VALID
     * 
     */
    public void setValid(Boolean valid) {
        set(PROPERTY_VALID, valid);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_GENERATEPROCESSED
     * 
     */
    public Boolean isGenerateProcessed() {
        return (Boolean) get(PROPERTY_GENERATEPROCESSED);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_GENERATEPROCESSED
     * 
     */
    public void setGenerateProcessed(Boolean generateProcessed) {
        set(PROPERTY_GENERATEPROCESSED, generateProcessed);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_BALANCINGAMOUNT
     * 
     */
    public BigDecimal getBalancingAmount() {
        return (BigDecimal) get(PROPERTY_BALANCINGAMOUNT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_BALANCINGAMOUNT
     * 
     */
    public void setBalancingAmount(BigDecimal balancingAmount) {
        set(PROPERTY_BALANCINGAMOUNT, balancingAmount);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_SETTLEMENTCANCELLED
     * 
     */
    public Settlement getSettlementCancelled() {
        return (Settlement) get(PROPERTY_SETTLEMENTCANCELLED);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_SETTLEMENTCANCELLED
     * 
     */
    public void setSettlementCancelled(Settlement settlementCancelled) {
        set(PROPERTY_SETTLEMENTCANCELLED, settlementCancelled);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_DIRECTPOSTING
     * 
     */
    public Boolean isDirectPosting() {
        return (Boolean) get(PROPERTY_DIRECTPOSTING);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_DIRECTPOSTING
     * 
     */
    public void setDirectPosting(Boolean directPosting) {
        set(PROPERTY_DIRECTPOSTING, directPosting);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see DebtPaymentGenerateV#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public BigDecimal getWithholdingamount() {
        return (BigDecimal) get(PROPERTY_WITHHOLDINGAMOUNT);
    }
    /**
     * @see DebtPaymentGenerateV#PROPERTY_WITHHOLDINGAMOUNT
     * 
     */
    public void setWithholdingamount(BigDecimal withholdingamount) {
        set(PROPERTY_WITHHOLDINGAMOUNT, withholdingamount);
    }

}
