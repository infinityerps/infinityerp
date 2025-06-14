
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
package org.openbravo.model.financialmgmt.cashmgmt;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.financialmgmt.payment.DPManagement;
import org.openbravo.model.financialmgmt.payment.DebtPayment;
/**
 * Entity class for entity FinancialMgmtBankStatementLine (stored in table C_BankStatementLine).
 * <br>
 * Help: {@literal The Statement Line Tab defines the individual line items on the Bank Statement.  They can
     *       be entered manually or generated from payments entered.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class BankStatementLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BankStatementLine";
    public static final String ENTITY_NAME = "FinancialMgmtBankStatementLine";

    /**
     * Property id stored in column C_BankStatementLine_ID in table C_BankStatementLine<br>
     * Help: {@literal The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for
     *       the defined time period at this Bank.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_BankStatementLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BankStatementLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BankStatementLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property bankStatement stored in column C_BankStatement_ID in table C_BankStatementLine<br>
     * Help: {@literal The Bank Statement identifies a unique Bank Statement for a defined time period.  The
     *       statement defines all transactions that occurred}
     * 
     */
    public static final String PROPERTY_BANKSTATEMENT = "bankStatement";

    /**
     * Property lineNo stored in column Line in table C_BankStatementLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table C_BankStatementLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property effectiveDate stored in column ValutaDate in table C_BankStatementLine<br>
     * Help: {@literal The Effective Date indicates the date that money is available from the bank.}
     * 
     */
    public static final String PROPERTY_EFFECTIVEDATE = "effectiveDate";

    /**
     * Property accountingDate stored in column DateAcct in table C_BankStatementLine<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property currency stored in column C_Currency_ID in table C_BankStatementLine<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property transactionAmount stored in column TrxAmt in table C_BankStatementLine<br>
     * Help: {@literal The Transaction Amount indicates the amount for a single transaction.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONAMOUNT = "transactionAmount";

    /**
     * Property statementAmount stored in column StmtAmt in table C_BankStatementLine 
     * 
     */
    public static final String PROPERTY_STATEMENTAMOUNT = "statementAmount";

    /**
     * Property charge stored in column C_Charge_ID in table C_BankStatementLine<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property chargeAmount stored in column ChargeAmt in table C_BankStatementLine<br>
     * Help: {@literal The Charge Amount indicates the amount for an additional charge.}
     * 
     */
    public static final String PROPERTY_CHARGEAMOUNT = "chargeAmount";

    /**
     * Property memo stored in column Memo in table C_BankStatementLine<br>
     * Help: {@literal Memo Text}
     * 
     */
    public static final String PROPERTY_MEMO = "memo";

    /**
     * Property referenceNo stored in column ReferenceNo in table C_BankStatementLine<br>
     * Help: {@literal The reference number can be printed on orders and invoices to allow your business partner
     *       to faster identify your records.}
     * 
     */
    public static final String PROPERTY_REFERENCENO = "referenceNo";

    /**
     * Property payment stored in column C_Debt_Payment_ID in table C_BankStatementLine<br>
     * Help: {@literal Refers to the amount of money to be paid or collected.}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property convertChargeAmount stored in column ConvertChargeAmt in table C_BankStatementLine<br>
     * Help: {@literal The Convert Charge Amount indicates the amount for an additional charge due to currency
     *       conversions.}
     * 
     */
    public static final String PROPERTY_CONVERTCHARGEAMOUNT = "convertChargeAmount";

    /**
     * Property createdDebtPayment stored in column C_Debt_Payment_Create in table C_BankStatementLine<br>
     * Help: {@literal Process to create a debt/payment.}
     * 
     */
    public static final String PROPERTY_CREATEDDEBTPAYMENT = "createdDebtPayment";

    /**
     * Property paymentManagement stored in column C_Dp_Management_ID in table C_BankStatementLine<br>
     * Help: {@literal Debt Payment Management allows to manage the changes of status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_PAYMENTMANAGEMENT = "paymentManagement";

    /**
     * Property gLItem stored in column C_Glitem_ID in table C_BankStatementLine<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";


    public BankStatementLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CONVERTCHARGEAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATEDDEBTPAYMENT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see BankStatementLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see BankStatementLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see BankStatementLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see BankStatementLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see BankStatementLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see BankStatementLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see BankStatementLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see BankStatementLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see BankStatementLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see BankStatementLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see BankStatementLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see BankStatementLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see BankStatementLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see BankStatementLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see BankStatementLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see BankStatementLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see BankStatementLine#PROPERTY_BANKSTATEMENT
     * 
     */
    public BankStatement getBankStatement() {
        return (BankStatement) get(PROPERTY_BANKSTATEMENT);
    }
    /**
     * @see BankStatementLine#PROPERTY_BANKSTATEMENT
     * 
     */
    public void setBankStatement(BankStatement bankStatement) {
        set(PROPERTY_BANKSTATEMENT, bankStatement);
    }

    /**
     * @see BankStatementLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see BankStatementLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see BankStatementLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see BankStatementLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see BankStatementLine#PROPERTY_EFFECTIVEDATE
     * 
     */
    public Date getEffectiveDate() {
        return (Date) get(PROPERTY_EFFECTIVEDATE);
    }
    /**
     * @see BankStatementLine#PROPERTY_EFFECTIVEDATE
     * 
     */
    public void setEffectiveDate(Date effectiveDate) {
        set(PROPERTY_EFFECTIVEDATE, effectiveDate);
    }

    /**
     * @see BankStatementLine#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see BankStatementLine#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see BankStatementLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see BankStatementLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see BankStatementLine#PROPERTY_TRANSACTIONAMOUNT
     * 
     */
    public BigDecimal getTransactionAmount() {
        return (BigDecimal) get(PROPERTY_TRANSACTIONAMOUNT);
    }
    /**
     * @see BankStatementLine#PROPERTY_TRANSACTIONAMOUNT
     * 
     */
    public void setTransactionAmount(BigDecimal transactionAmount) {
        set(PROPERTY_TRANSACTIONAMOUNT, transactionAmount);
    }

    /**
     * @see BankStatementLine#PROPERTY_STATEMENTAMOUNT
     * 
     */
    public BigDecimal getStatementAmount() {
        return (BigDecimal) get(PROPERTY_STATEMENTAMOUNT);
    }
    /**
     * @see BankStatementLine#PROPERTY_STATEMENTAMOUNT
     * 
     */
    public void setStatementAmount(BigDecimal statementAmount) {
        set(PROPERTY_STATEMENTAMOUNT, statementAmount);
    }

    /**
     * @see BankStatementLine#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see BankStatementLine#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see BankStatementLine#PROPERTY_CHARGEAMOUNT
     * 
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEAMOUNT);
    }
    /**
     * @see BankStatementLine#PROPERTY_CHARGEAMOUNT
     * 
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        set(PROPERTY_CHARGEAMOUNT, chargeAmount);
    }

    /**
     * @see BankStatementLine#PROPERTY_MEMO
     * 
     */
    public String getMemo() {
        return (String) get(PROPERTY_MEMO);
    }
    /**
     * @see BankStatementLine#PROPERTY_MEMO
     * 
     */
    public void setMemo(String memo) {
        set(PROPERTY_MEMO, memo);
    }

    /**
     * @see BankStatementLine#PROPERTY_REFERENCENO
     * 
     */
    public String getReferenceNo() {
        return (String) get(PROPERTY_REFERENCENO);
    }
    /**
     * @see BankStatementLine#PROPERTY_REFERENCENO
     * 
     */
    public void setReferenceNo(String referenceNo) {
        set(PROPERTY_REFERENCENO, referenceNo);
    }

    /**
     * @see BankStatementLine#PROPERTY_PAYMENT
     * 
     */
    public DebtPayment getPayment() {
        return (DebtPayment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see BankStatementLine#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(DebtPayment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see BankStatementLine#PROPERTY_CONVERTCHARGEAMOUNT
     * 
     */
    public BigDecimal getConvertChargeAmount() {
        return (BigDecimal) get(PROPERTY_CONVERTCHARGEAMOUNT);
    }
    /**
     * @see BankStatementLine#PROPERTY_CONVERTCHARGEAMOUNT
     * 
     */
    public void setConvertChargeAmount(BigDecimal convertChargeAmount) {
        set(PROPERTY_CONVERTCHARGEAMOUNT, convertChargeAmount);
    }

    /**
     * @see BankStatementLine#PROPERTY_CREATEDDEBTPAYMENT
     * 
     */
    public Boolean isCreatedDebtPayment() {
        return (Boolean) get(PROPERTY_CREATEDDEBTPAYMENT);
    }
    /**
     * @see BankStatementLine#PROPERTY_CREATEDDEBTPAYMENT
     * 
     */
    public void setCreatedDebtPayment(Boolean createdDebtPayment) {
        set(PROPERTY_CREATEDDEBTPAYMENT, createdDebtPayment);
    }

    /**
     * @see BankStatementLine#PROPERTY_PAYMENTMANAGEMENT
     * 
     */
    public DPManagement getPaymentManagement() {
        return (DPManagement) get(PROPERTY_PAYMENTMANAGEMENT);
    }
    /**
     * @see BankStatementLine#PROPERTY_PAYMENTMANAGEMENT
     * 
     */
    public void setPaymentManagement(DPManagement paymentManagement) {
        set(PROPERTY_PAYMENTMANAGEMENT, paymentManagement);
    }

    /**
     * @see BankStatementLine#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see BankStatementLine#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

}
