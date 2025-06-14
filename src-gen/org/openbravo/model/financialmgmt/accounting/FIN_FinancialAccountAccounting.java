
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
package org.openbravo.model.financialmgmt.accounting;

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
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
/**
 * Entity class for entity FIN_Financial_Account_Acct (stored in table FIN_Financial_Account_Acct).
 * <br>
 * Help: {@literal Accounting configuration of financial account}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_FinancialAccountAccounting extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Financial_Account_Acct";
    public static final String ENTITY_NAME = "FIN_Financial_Account_Acct";

    /**
     * Property id stored in column FIN_Financial_Account_Acct_ID in table FIN_Financial_Account_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property account stored in column FIN_Financial_Account_ID in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property accountingSchema stored in column C_Acctschema_ID in table FIN_Financial_Account_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Financial_Account_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Financial_Account_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Financial_Account_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Financial_Account_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Financial_Account_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Financial_Account_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Financial_Account_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property receivePaymentAccount stored in column FIN_Receivepayment_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Receive Payment Account used by financial account}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_RECEIVEPAYMENTACCOUNT = "receivePaymentAccount";

    /**
     * Property makePaymentAccount stored in column FIN_Makepayment_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Make Payment Account used by financial account}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_MAKEPAYMENTACCOUNT = "makePaymentAccount";

    /**
     * Property depositAccount stored in column FIN_Deposit_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Deposit Account used by the financial account}
     * 
     */
    public static final String PROPERTY_DEPOSITACCOUNT = "depositAccount";

    /**
     * Property withdrawalAccount stored in column FIN_Withdrawal_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Withdrawal Account used by the financial account}
     * 
     */
    public static final String PROPERTY_WITHDRAWALACCOUNT = "withdrawalAccount";

    /**
     * Property debitAccount stored in column FIN_Debit_Acct in table FIN_Financial_Account_Acct
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_DEBITACCOUNT = "debitAccount";

    /**
     * Property creditAccount stored in column FIN_Credit_Acct in table FIN_Financial_Account_Acct
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_CREDITACCOUNT = "creditAccount";

    /**
     * Property fINBankfeeAcct stored in column FIN_Bankfee_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Account used for posting Bank Fees}
     * 
     */
    public static final String PROPERTY_FINBANKFEEACCT = "fINBankfeeAcct";

    /**
     * Property fINBankrevaluationgainAcct stored in column FIN_Bankrevaluationgain_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Account used for posting currency revaluation gains}
     * 
     */
    public static final String PROPERTY_FINBANKREVALUATIONGAINACCT = "fINBankrevaluationgainAcct";

    /**
     * Property fINBankrevaluationlossAcct stored in column FIN_Bankrevaluationloss_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Account used for posting currency revaluation losses}
     * 
     */
    public static final String PROPERTY_FINBANKREVALUATIONLOSSACCT = "fINBankrevaluationlossAcct";

    /**
     * Property fINOutIntransitAcct stored in column FIN_Out_Intransit_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Account used for in transit status of outgoing payments}
     * 
     */
    public static final String PROPERTY_FINOUTINTRANSITACCT = "fINOutIntransitAcct";

    /**
     * Property clearedPaymentAccountOUT stored in column FIN_Out_Clear_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Account used for status cleared of outgoing payments}
     * 
     */
    public static final String PROPERTY_CLEAREDPAYMENTACCOUNTOUT = "clearedPaymentAccountOUT";

    /**
     * Property inTransitPaymentAccountIN stored in column FIN_In_Intransit_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Account used for in transit status of incomming payments}
     * 
     */
    public static final String PROPERTY_INTRANSITPAYMENTACCOUNTIN = "inTransitPaymentAccountIN";

    /**
     * Property clearedPaymentAccount stored in column FIN_In_Clear_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Account used for payment IN when clearing }
     * 
     */
    public static final String PROPERTY_CLEAREDPAYMENTACCOUNT = "clearedPaymentAccount";

    /**
     * Property fINAssetAcct stored in column FIN_Asset_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Bank Asset Account used for bank statement accounting}
     * 
     */
    public static final String PROPERTY_FINASSETACCT = "fINAssetAcct";

    /**
     * Property fINTransitoryAcct stored in column FIN_Transitory_Acct in table FIN_Financial_Account_Acct<br>
     * Help: {@literal Bank Transitory Account used for bank statement accounting}
     * 
     */
    public static final String PROPERTY_FINTRANSITORYACCT = "fINTransitoryAcct";

    /**
     * Property enablebankstatement stored in column EnableBankStatement in table FIN_Financial_Account_Acct<br>
     * Help: {@literal This flag enables accounting for Bank Statements. Some accounts will be required for
     *       proper configuration}
     * 
     */
    public static final String PROPERTY_ENABLEBANKSTATEMENT = "enablebankstatement";


    public FIN_FinancialAccountAccounting() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ENABLEBANKSTATEMENT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_RECEIVEPAYMENTACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public AccountingCombination getReceivePaymentAccount() {
        return (AccountingCombination) get(PROPERTY_RECEIVEPAYMENTACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_RECEIVEPAYMENTACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setReceivePaymentAccount(AccountingCombination receivePaymentAccount) {
        set(PROPERTY_RECEIVEPAYMENTACCOUNT, receivePaymentAccount);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_MAKEPAYMENTACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public AccountingCombination getMakePaymentAccount() {
        return (AccountingCombination) get(PROPERTY_MAKEPAYMENTACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_MAKEPAYMENTACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setMakePaymentAccount(AccountingCombination makePaymentAccount) {
        set(PROPERTY_MAKEPAYMENTACCOUNT, makePaymentAccount);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_DEPOSITACCOUNT
     * 
     */
    public AccountingCombination getDepositAccount() {
        return (AccountingCombination) get(PROPERTY_DEPOSITACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_DEPOSITACCOUNT
     * 
     */
    public void setDepositAccount(AccountingCombination depositAccount) {
        set(PROPERTY_DEPOSITACCOUNT, depositAccount);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_WITHDRAWALACCOUNT
     * 
     */
    public AccountingCombination getWithdrawalAccount() {
        return (AccountingCombination) get(PROPERTY_WITHDRAWALACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_WITHDRAWALACCOUNT
     * 
     */
    public void setWithdrawalAccount(AccountingCombination withdrawalAccount) {
        set(PROPERTY_WITHDRAWALACCOUNT, withdrawalAccount);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_DEBITACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public AccountingCombination getDebitAccount() {
        return (AccountingCombination) get(PROPERTY_DEBITACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_DEBITACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setDebitAccount(AccountingCombination debitAccount) {
        set(PROPERTY_DEBITACCOUNT, debitAccount);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CREDITACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public AccountingCombination getCreditAccount() {
        return (AccountingCombination) get(PROPERTY_CREDITACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CREDITACCOUNT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setCreditAccount(AccountingCombination creditAccount) {
        set(PROPERTY_CREDITACCOUNT, creditAccount);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINBANKFEEACCT
     * 
     */
    public AccountingCombination getFINBankfeeAcct() {
        return (AccountingCombination) get(PROPERTY_FINBANKFEEACCT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINBANKFEEACCT
     * 
     */
    public void setFINBankfeeAcct(AccountingCombination fINBankfeeAcct) {
        set(PROPERTY_FINBANKFEEACCT, fINBankfeeAcct);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINBANKREVALUATIONGAINACCT
     * 
     */
    public AccountingCombination getFINBankrevaluationgainAcct() {
        return (AccountingCombination) get(PROPERTY_FINBANKREVALUATIONGAINACCT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINBANKREVALUATIONGAINACCT
     * 
     */
    public void setFINBankrevaluationgainAcct(AccountingCombination fINBankrevaluationgainAcct) {
        set(PROPERTY_FINBANKREVALUATIONGAINACCT, fINBankrevaluationgainAcct);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINBANKREVALUATIONLOSSACCT
     * 
     */
    public AccountingCombination getFINBankrevaluationlossAcct() {
        return (AccountingCombination) get(PROPERTY_FINBANKREVALUATIONLOSSACCT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINBANKREVALUATIONLOSSACCT
     * 
     */
    public void setFINBankrevaluationlossAcct(AccountingCombination fINBankrevaluationlossAcct) {
        set(PROPERTY_FINBANKREVALUATIONLOSSACCT, fINBankrevaluationlossAcct);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINOUTINTRANSITACCT
     * 
     */
    public AccountingCombination getFINOutIntransitAcct() {
        return (AccountingCombination) get(PROPERTY_FINOUTINTRANSITACCT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINOUTINTRANSITACCT
     * 
     */
    public void setFINOutIntransitAcct(AccountingCombination fINOutIntransitAcct) {
        set(PROPERTY_FINOUTINTRANSITACCT, fINOutIntransitAcct);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CLEAREDPAYMENTACCOUNTOUT
     * 
     */
    public AccountingCombination getClearedPaymentAccountOUT() {
        return (AccountingCombination) get(PROPERTY_CLEAREDPAYMENTACCOUNTOUT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CLEAREDPAYMENTACCOUNTOUT
     * 
     */
    public void setClearedPaymentAccountOUT(AccountingCombination clearedPaymentAccountOUT) {
        set(PROPERTY_CLEAREDPAYMENTACCOUNTOUT, clearedPaymentAccountOUT);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_INTRANSITPAYMENTACCOUNTIN
     * 
     */
    public AccountingCombination getInTransitPaymentAccountIN() {
        return (AccountingCombination) get(PROPERTY_INTRANSITPAYMENTACCOUNTIN);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_INTRANSITPAYMENTACCOUNTIN
     * 
     */
    public void setInTransitPaymentAccountIN(AccountingCombination inTransitPaymentAccountIN) {
        set(PROPERTY_INTRANSITPAYMENTACCOUNTIN, inTransitPaymentAccountIN);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CLEAREDPAYMENTACCOUNT
     * 
     */
    public AccountingCombination getClearedPaymentAccount() {
        return (AccountingCombination) get(PROPERTY_CLEAREDPAYMENTACCOUNT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_CLEAREDPAYMENTACCOUNT
     * 
     */
    public void setClearedPaymentAccount(AccountingCombination clearedPaymentAccount) {
        set(PROPERTY_CLEAREDPAYMENTACCOUNT, clearedPaymentAccount);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINASSETACCT
     * 
     */
    public AccountingCombination getFINAssetAcct() {
        return (AccountingCombination) get(PROPERTY_FINASSETACCT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINASSETACCT
     * 
     */
    public void setFINAssetAcct(AccountingCombination fINAssetAcct) {
        set(PROPERTY_FINASSETACCT, fINAssetAcct);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINTRANSITORYACCT
     * 
     */
    public AccountingCombination getFINTransitoryAcct() {
        return (AccountingCombination) get(PROPERTY_FINTRANSITORYACCT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_FINTRANSITORYACCT
     * 
     */
    public void setFINTransitoryAcct(AccountingCombination fINTransitoryAcct) {
        set(PROPERTY_FINTRANSITORYACCT, fINTransitoryAcct);
    }

    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ENABLEBANKSTATEMENT
     * 
     */
    public Boolean isEnablebankstatement() {
        return (Boolean) get(PROPERTY_ENABLEBANKSTATEMENT);
    }
    /**
     * @see FIN_FinancialAccountAccounting#PROPERTY_ENABLEBANKSTATEMENT
     * 
     */
    public void setEnablebankstatement(Boolean enablebankstatement) {
        set(PROPERTY_ENABLEBANKSTATEMENT, enablebankstatement);
    }

}
