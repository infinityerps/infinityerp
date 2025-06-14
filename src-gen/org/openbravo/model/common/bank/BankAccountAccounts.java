
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
package org.openbravo.model.common.bank;

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
 * Entity class for entity BankAccountAccounts (stored in table C_BankAccount_Acct).
 * <br>
 * Help: {@literal Defines the accounts used for transactions with this Bank.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class BankAccountAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BankAccount_Acct";
    public static final String ENTITY_NAME = "BankAccountAccounts";

    /**
     * Property id stored in column C_BankAccount_Acct_ID in table C_BankAccount_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property bankAccount stored in column C_BankAccount_ID in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_BankAccount_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table C_BankAccount_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BankAccount_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BankAccount_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BankAccount_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BankAccount_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BankAccount_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BankAccount_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property bankInTransit stored in column B_InTransit_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank in Transit Account identifies the account to be used for funds which are in
     *       transit.}
     * 
     */
    public static final String PROPERTY_BANKINTRANSIT = "bankInTransit";

    /**
     * Property bankAsset stored in column B_Asset_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Asset Account identifies the account to be used for booking changes to the
     *       balance in this bank account}
     * 
     */
    public static final String PROPERTY_BANKASSET = "bankAsset";

    /**
     * Property bankExpense stored in column B_Expense_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Expense Account identifies the account to be used for recording charges or fees
     *       incurred from this Bank.}
     * 
     */
    public static final String PROPERTY_BANKEXPENSE = "bankExpense";

    /**
     * Property bankInterestRevenue stored in column B_InterestRev_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Interest Revenue Account identifies the account to be used for recording interest
     *       revenue from this Bank.}
     * 
     */
    public static final String PROPERTY_BANKINTERESTREVENUE = "bankInterestRevenue";

    /**
     * Property bankInterestExpense stored in column B_InterestExp_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Interest Expense Account identifies the account to be used for recording interest
     *       expenses.}
     * 
     */
    public static final String PROPERTY_BANKINTERESTEXPENSE = "bankInterestExpense";

    /**
     * Property bankUnidentifiedReceipts stored in column B_Unidentified_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Unidentified Receipts Account identifies the account to be used when recording
     *       receipts that can not be reconciled at the present time.}
     * 
     */
    public static final String PROPERTY_BANKUNIDENTIFIEDRECEIPTS = "bankUnidentifiedReceipts";

    /**
     * Property unallocatedCash stored in column B_UnallocatedCash_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal Receipts not allocated to Invoices}
     * 
     */
    public static final String PROPERTY_UNALLOCATEDCASH = "unallocatedCash";

    /**
     * Property paymentSelection stored in column B_PaymentSelect_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal AP Payment Selection Clearing Account}
     * 
     */
    public static final String PROPERTY_PAYMENTSELECTION = "paymentSelection";

    /**
     * Property bankSettlementGain stored in column B_SettlementGain_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Settlement Gain account identifies the account to be used when recording a
     *       currency gain when the settlement and receipt currency are not the same.}
     * 
     */
    public static final String PROPERTY_BANKSETTLEMENTGAIN = "bankSettlementGain";

    /**
     * Property bankSettlementLoss stored in column B_SettlementLoss_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Settlement loss account identifies the account to be used when recording a
     *       currency loss when the settlement and receipt currency are not the same.}
     * 
     */
    public static final String PROPERTY_BANKSETTLEMENTLOSS = "bankSettlementLoss";

    /**
     * Property bankRevaluationGain stored in column B_RevaluationGain_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Revaluation Gain Account identifies the account to be used for recording gains
     *       that are recognized when converting currencies.}
     * 
     */
    public static final String PROPERTY_BANKREVALUATIONGAIN = "bankRevaluationGain";

    /**
     * Property bankRevaluationLoss stored in column B_RevaluationLoss_Acct in table C_BankAccount_Acct<br>
     * Help: {@literal The Bank Revaluation Loss Account identifies the account to be used for recording losses
     *       that are recognized when converting currencies.}
     * 
     */
    public static final String PROPERTY_BANKREVALUATIONLOSS = "bankRevaluationLoss";


    public BankAccountAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see BankAccountAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKACCOUNT
     * 
     */
    public BankAccount getBankAccount() {
        return (BankAccount) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(BankAccount bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKINTRANSIT
     * 
     */
    public AccountingCombination getBankInTransit() {
        return (AccountingCombination) get(PROPERTY_BANKINTRANSIT);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKINTRANSIT
     * 
     */
    public void setBankInTransit(AccountingCombination bankInTransit) {
        set(PROPERTY_BANKINTRANSIT, bankInTransit);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKASSET
     * 
     */
    public AccountingCombination getBankAsset() {
        return (AccountingCombination) get(PROPERTY_BANKASSET);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKASSET
     * 
     */
    public void setBankAsset(AccountingCombination bankAsset) {
        set(PROPERTY_BANKASSET, bankAsset);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKEXPENSE
     * 
     */
    public AccountingCombination getBankExpense() {
        return (AccountingCombination) get(PROPERTY_BANKEXPENSE);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKEXPENSE
     * 
     */
    public void setBankExpense(AccountingCombination bankExpense) {
        set(PROPERTY_BANKEXPENSE, bankExpense);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKINTERESTREVENUE
     * 
     */
    public AccountingCombination getBankInterestRevenue() {
        return (AccountingCombination) get(PROPERTY_BANKINTERESTREVENUE);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKINTERESTREVENUE
     * 
     */
    public void setBankInterestRevenue(AccountingCombination bankInterestRevenue) {
        set(PROPERTY_BANKINTERESTREVENUE, bankInterestRevenue);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKINTERESTEXPENSE
     * 
     */
    public AccountingCombination getBankInterestExpense() {
        return (AccountingCombination) get(PROPERTY_BANKINTERESTEXPENSE);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKINTERESTEXPENSE
     * 
     */
    public void setBankInterestExpense(AccountingCombination bankInterestExpense) {
        set(PROPERTY_BANKINTERESTEXPENSE, bankInterestExpense);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKUNIDENTIFIEDRECEIPTS
     * 
     */
    public AccountingCombination getBankUnidentifiedReceipts() {
        return (AccountingCombination) get(PROPERTY_BANKUNIDENTIFIEDRECEIPTS);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKUNIDENTIFIEDRECEIPTS
     * 
     */
    public void setBankUnidentifiedReceipts(AccountingCombination bankUnidentifiedReceipts) {
        set(PROPERTY_BANKUNIDENTIFIEDRECEIPTS, bankUnidentifiedReceipts);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_UNALLOCATEDCASH
     * 
     */
    public AccountingCombination getUnallocatedCash() {
        return (AccountingCombination) get(PROPERTY_UNALLOCATEDCASH);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_UNALLOCATEDCASH
     * 
     */
    public void setUnallocatedCash(AccountingCombination unallocatedCash) {
        set(PROPERTY_UNALLOCATEDCASH, unallocatedCash);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_PAYMENTSELECTION
     * 
     */
    public AccountingCombination getPaymentSelection() {
        return (AccountingCombination) get(PROPERTY_PAYMENTSELECTION);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_PAYMENTSELECTION
     * 
     */
    public void setPaymentSelection(AccountingCombination paymentSelection) {
        set(PROPERTY_PAYMENTSELECTION, paymentSelection);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKSETTLEMENTGAIN
     * 
     */
    public AccountingCombination getBankSettlementGain() {
        return (AccountingCombination) get(PROPERTY_BANKSETTLEMENTGAIN);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKSETTLEMENTGAIN
     * 
     */
    public void setBankSettlementGain(AccountingCombination bankSettlementGain) {
        set(PROPERTY_BANKSETTLEMENTGAIN, bankSettlementGain);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKSETTLEMENTLOSS
     * 
     */
    public AccountingCombination getBankSettlementLoss() {
        return (AccountingCombination) get(PROPERTY_BANKSETTLEMENTLOSS);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKSETTLEMENTLOSS
     * 
     */
    public void setBankSettlementLoss(AccountingCombination bankSettlementLoss) {
        set(PROPERTY_BANKSETTLEMENTLOSS, bankSettlementLoss);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKREVALUATIONGAIN
     * 
     */
    public AccountingCombination getBankRevaluationGain() {
        return (AccountingCombination) get(PROPERTY_BANKREVALUATIONGAIN);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKREVALUATIONGAIN
     * 
     */
    public void setBankRevaluationGain(AccountingCombination bankRevaluationGain) {
        set(PROPERTY_BANKREVALUATIONGAIN, bankRevaluationGain);
    }

    /**
     * @see BankAccountAccounts#PROPERTY_BANKREVALUATIONLOSS
     * 
     */
    public AccountingCombination getBankRevaluationLoss() {
        return (AccountingCombination) get(PROPERTY_BANKREVALUATIONLOSS);
    }
    /**
     * @see BankAccountAccounts#PROPERTY_BANKREVALUATIONLOSS
     * 
     */
    public void setBankRevaluationLoss(AccountingCombination bankRevaluationLoss) {
        set(PROPERTY_BANKREVALUATIONLOSS, bankRevaluationLoss);
    }

}
