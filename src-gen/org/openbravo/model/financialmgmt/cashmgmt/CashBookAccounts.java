
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
 * Entity class for entity FinancialMgmtCashBookAccounts (stored in table C_CashBook_Acct).
 * <br>
 * Help: {@literal Defines the accounting parameters for transaction involving a cashbook.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CashBookAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_CashBook_Acct";
    public static final String ENTITY_NAME = "FinancialMgmtCashBookAccounts";

    /**
     * Property id stored in column C_CashBook_Acct_ID in table C_CashBook_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property cashbook stored in column C_CashBook_ID in table C_CashBook_Acct<br>
     * Help: {@literal The Cash Book identifies a unique cash book.  The cash book is used to record cash
     *       transactions.}
     * 
     */
    public static final String PROPERTY_CASHBOOK = "cashbook";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_CashBook_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table C_CashBook_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_CashBook_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_CashBook_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_CashBook_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_CashBook_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_CashBook_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_CashBook_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property cashBookAsset stored in column CB_Asset_Acct in table C_CashBook_Acct<br>
     * Help: {@literal The Cash Book Asset Account identifies the account to be used for recording payments into
     *       and disbursements from this cash book.}
     * 
     */
    public static final String PROPERTY_CASHBOOKASSET = "cashBookAsset";

    /**
     * Property cashTransfer stored in column CB_CashTransfer_Acct in table C_CashBook_Acct<br>
     * Help: {@literal Account for Invoices paid by cash}
     * 
     */
    public static final String PROPERTY_CASHTRANSFER = "cashTransfer";

    /**
     * Property cashBookDifferences stored in column CB_Differences_Acct in table C_CashBook_Acct<br>
     * Help: {@literal The Cash Book Differences Account identifies the account to be used for recording any
     *       differences that affect this cash book}
     * 
     */
    public static final String PROPERTY_CASHBOOKDIFFERENCES = "cashBookDifferences";

    /**
     * Property cashBookExpense stored in column CB_Expense_Acct in table C_CashBook_Acct<br>
     * Help: {@literal The Cash Book Expense Account identifies the account to be used for general, non itemized
     *       expenses.}
     * 
     */
    public static final String PROPERTY_CASHBOOKEXPENSE = "cashBookExpense";

    /**
     * Property cashBookReceipt stored in column CB_Receipt_Acct in table C_CashBook_Acct<br>
     * Help: {@literal The Cash Book Receipt Account identifies the account to be used for general, non itemized
     *       cash book receipts.}
     * 
     */
    public static final String PROPERTY_CASHBOOKRECEIPT = "cashBookReceipt";


    public CashBookAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CashBookAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CashBookAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOK
     * 
     */
    public CashBook getCashbook() {
        return (CashBook) get(PROPERTY_CASHBOOK);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOK
     * 
     */
    public void setCashbook(CashBook cashbook) {
        set(PROPERTY_CASHBOOK, cashbook);
    }

    /**
     * @see CashBookAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see CashBookAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CashBookAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CashBookAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CashBookAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CashBookAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CashBookAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CashBookAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CashBookAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CashBookAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKASSET
     * 
     */
    public AccountingCombination getCashBookAsset() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKASSET);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKASSET
     * 
     */
    public void setCashBookAsset(AccountingCombination cashBookAsset) {
        set(PROPERTY_CASHBOOKASSET, cashBookAsset);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CASHTRANSFER
     * 
     */
    public AccountingCombination getCashTransfer() {
        return (AccountingCombination) get(PROPERTY_CASHTRANSFER);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CASHTRANSFER
     * 
     */
    public void setCashTransfer(AccountingCombination cashTransfer) {
        set(PROPERTY_CASHTRANSFER, cashTransfer);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKDIFFERENCES
     * 
     */
    public AccountingCombination getCashBookDifferences() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKDIFFERENCES);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKDIFFERENCES
     * 
     */
    public void setCashBookDifferences(AccountingCombination cashBookDifferences) {
        set(PROPERTY_CASHBOOKDIFFERENCES, cashBookDifferences);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKEXPENSE
     * 
     */
    public AccountingCombination getCashBookExpense() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKEXPENSE);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKEXPENSE
     * 
     */
    public void setCashBookExpense(AccountingCombination cashBookExpense) {
        set(PROPERTY_CASHBOOKEXPENSE, cashBookExpense);
    }

    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKRECEIPT
     * 
     */
    public AccountingCombination getCashBookReceipt() {
        return (AccountingCombination) get(PROPERTY_CASHBOOKRECEIPT);
    }
    /**
     * @see CashBookAccounts#PROPERTY_CASHBOOKRECEIPT
     * 
     */
    public void setCashBookReceipt(AccountingCombination cashBookReceipt) {
        set(PROPERTY_CASHBOOKRECEIPT, cashBookReceipt);
    }

}
