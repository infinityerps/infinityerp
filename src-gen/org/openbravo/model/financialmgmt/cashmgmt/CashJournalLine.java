
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
import org.openbravo.model.common.order.Order;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.financialmgmt.payment.DebtPayment;
/**
 * Entity class for entity FinancialMgmtJournalLine (stored in table C_CashLine).
 * <br>
 * Help: {@literal The Cash Line Tab defines the individual lines for this journal.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CashJournalLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_CashLine";
    public static final String ENTITY_NAME = "FinancialMgmtJournalLine";

    /**
     * Property id stored in column C_CashLine_ID in table C_CashLine<br>
     * Help: {@literal The Cash Journal Line indicates a unique line in a cash journal.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_CashLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_CashLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_CashLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_CashLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_CashLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_CashLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_CashLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property cashJournal stored in column C_Cash_ID in table C_CashLine<br>
     * Help: {@literal The Cash Journal uniquely identifies a Cash Journal.  The Cash Journal will record
     *       transactions for the cash bank account}
     * 
     */
    public static final String PROPERTY_CASHJOURNAL = "cashJournal";

    /**
     * Property lineNo stored in column Line in table C_CashLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table C_CashLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property cashType stored in column CashType in table C_CashLine<br>
     * Help: {@literal The Cash Type indicates the source for this Cash Journal Line.}
     * 
     */
    public static final String PROPERTY_CASHTYPE = "cashType";

    /**
     * Property charge stored in column C_Charge_ID in table C_CashLine<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property currency stored in column C_Currency_ID in table C_CashLine<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property amount stored in column Amount in table C_CashLine 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property discountAmount stored in column DiscountAmt in table C_CashLine<br>
     * Help: {@literal The Discount Amount indicates the discount amount for a document or line.}
     * 
     */
    public static final String PROPERTY_DISCOUNTAMOUNT = "discountAmount";

    /**
     * Property writeoffAmount stored in column WriteOffAmt in table C_CashLine<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property generated stored in column IsGenerated in table C_CashLine<br>
     * Help: {@literal The Generated checkbox identifies a journal line that was generated from a source
     *       document.  Lines could also be entered manually or imported.}
     * 
     */
    public static final String PROPERTY_GENERATED = "generated";

    /**
     * Property salesOrder stored in column C_Order_ID in table C_CashLine<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property payment stored in column C_Debt_Payment_ID in table C_CashLine<br>
     * Help: {@literal Refers to the amount of money to be paid or collected.}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property gLItem stored in column C_Glitem_ID in table C_CashLine<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property createAPaymentInAdvance stored in column PayInAdvance in table C_CashLine<br>
     * Help: {@literal Create a payment in advance}
     * 
     */
    public static final String PROPERTY_CREATEAPAYMENTINADVANCE = "createAPaymentInAdvance";


    public CashJournalLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CASHTYPE, "E");
        setDefaultValue(PROPERTY_GENERATED, false);
        setDefaultValue(PROPERTY_CREATEAPAYMENTINADVANCE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CashJournalLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CashJournalLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CashJournalLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CashJournalLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CashJournalLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CashJournalLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CashJournalLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CashJournalLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CashJournalLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CashJournalLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CashJournalLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CashJournalLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CashJournalLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CashJournalLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CashJournalLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CashJournalLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CashJournalLine#PROPERTY_CASHJOURNAL
     * 
     */
    public CashJournal getCashJournal() {
        return (CashJournal) get(PROPERTY_CASHJOURNAL);
    }
    /**
     * @see CashJournalLine#PROPERTY_CASHJOURNAL
     * 
     */
    public void setCashJournal(CashJournal cashJournal) {
        set(PROPERTY_CASHJOURNAL, cashJournal);
    }

    /**
     * @see CashJournalLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see CashJournalLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see CashJournalLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see CashJournalLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see CashJournalLine#PROPERTY_CASHTYPE
     * 
     */
    public String getCashType() {
        return (String) get(PROPERTY_CASHTYPE);
    }
    /**
     * @see CashJournalLine#PROPERTY_CASHTYPE
     * 
     */
    public void setCashType(String cashType) {
        set(PROPERTY_CASHTYPE, cashType);
    }

    /**
     * @see CashJournalLine#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see CashJournalLine#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see CashJournalLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see CashJournalLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see CashJournalLine#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see CashJournalLine#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see CashJournalLine#PROPERTY_DISCOUNTAMOUNT
     * 
     */
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(PROPERTY_DISCOUNTAMOUNT);
    }
    /**
     * @see CashJournalLine#PROPERTY_DISCOUNTAMOUNT
     * 
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        set(PROPERTY_DISCOUNTAMOUNT, discountAmount);
    }

    /**
     * @see CashJournalLine#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see CashJournalLine#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see CashJournalLine#PROPERTY_GENERATED
     * 
     */
    public Boolean isGenerated() {
        return (Boolean) get(PROPERTY_GENERATED);
    }
    /**
     * @see CashJournalLine#PROPERTY_GENERATED
     * 
     */
    public void setGenerated(Boolean generated) {
        set(PROPERTY_GENERATED, generated);
    }

    /**
     * @see CashJournalLine#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see CashJournalLine#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see CashJournalLine#PROPERTY_PAYMENT
     * 
     */
    public DebtPayment getPayment() {
        return (DebtPayment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see CashJournalLine#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(DebtPayment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see CashJournalLine#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see CashJournalLine#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see CashJournalLine#PROPERTY_CREATEAPAYMENTINADVANCE
     * 
     */
    public Boolean isCreateAPaymentInAdvance() {
        return (Boolean) get(PROPERTY_CREATEAPAYMENTINADVANCE);
    }
    /**
     * @see CashJournalLine#PROPERTY_CREATEAPAYMENTINADVANCE
     * 
     */
    public void setCreateAPaymentInAdvance(Boolean createAPaymentInAdvance) {
        set(PROPERTY_CREATEAPAYMENTINADVANCE, createAPaymentInAdvance);
    }

}
