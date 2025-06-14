
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
/**
 * Entity class for entity BankAccount (stored in table C_BankAccount).
 * <br>
 * Help: {@literal Used to define one or more accounts for a Bank.  Each account has a unique Account No and
     *       Currency.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class BankAccount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BankAccount";
    public static final String ENTITY_NAME = "BankAccount";

    /**
     * Property id stored in column C_BankAccount_ID in table C_BankAccount<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_BankAccount 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BankAccount 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BankAccount 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property bank stored in column C_Bank_ID in table C_BankAccount<br>
     * Help: {@literal The Bank is a unique identifier of a Bank for this Organization or for a Business Partner
     *       with whom this Organization transacts.}
     * 
     */
    public static final String PROPERTY_BANK = "bank";

    /**
     * Property currency stored in column C_Currency_ID in table C_BankAccount<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property accountType stored in column BankAccountType in table C_BankAccount<br>
     * Help: {@literal The Bank Account Type field indicates the type of account (savings, checking etc) this
     *       account  is defined as.}
     * 
     */
    public static final String PROPERTY_ACCOUNTTYPE = "accountType";

    /**
     * Property accountNo stored in column AccountNo in table C_BankAccount<br>
     * Help: {@literal The Account Number indicates the Number assigned to this account}
     * 
     */
    public static final String PROPERTY_ACCOUNTNO = "accountNo";

    /**
     * Property currentBalance stored in column CurrentBalance in table C_BankAccount<br>
     * Help: {@literal The Current Balance field indicates the current balance in this account.}
     * 
     */
    public static final String PROPERTY_CURRENTBALANCE = "currentBalance";

    /**
     * Property creditLimit stored in column CreditLimit in table C_BankAccount<br>
     * Help: {@literal The Credit Limit field indicates the credit limit for this account.}
     * 
     */
    public static final String PROPERTY_CREDITLIMIT = "creditLimit";

    /**
     * Property default stored in column IsDefault in table C_BankAccount<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property partialAccountNo stored in column Codeaccount in table C_BankAccount<br>
     * Help: {@literal Last ten numbers of the bank account.}
     * 
     */
    public static final String PROPERTY_PARTIALACCOUNTNO = "partialAccountNo";

    /**
     * Property controlDigit stored in column Digitcontrol in table C_BankAccount<br>
     * Help: {@literal Tenth number of the bank account.}
     * 
     */
    public static final String PROPERTY_CONTROLDIGIT = "controlDigit";

    /**
     * Property iBAN stored in column Iban in table C_BankAccount<br>
     * Help: {@literal Code that identifies uniquely one bank account, no matter the country it belongs to. It
     *       consists of a ISO 3166-1 alpha-2 country code, followed by two check digits, and up to thirty
     *       alphanumeric characters for the domestic bank account number, called the BBAN (Basic Bank Account
     *       Number). It is up to each country's national banking community to decide on the length of the BBAN
     *       for accounts in that country, but its length must be fixed for any given country.}
     * 
     */
    public static final String PROPERTY_IBAN = "iBAN";

    /**
     * Property genericAccount stored in column GenericAccount in table C_BankAccount<br>
     * Help: {@literal Bank account number in a generic format.}
     * 
     */
    public static final String PROPERTY_GENERICACCOUNT = "genericAccount";

    /**
     * Property showGeneric stored in column ShowGeneric in table C_BankAccount<br>
     * Help: {@literal Use the Generic Account Number for generating the Displayed Account Number}
     * 
     */
    public static final String PROPERTY_SHOWGENERIC = "showGeneric";

    /**
     * Property showSpanish stored in column ShowSpanish in table C_BankAccount<br>
     * Help: {@literal Use Spanish Format}
     * 
     */
    public static final String PROPERTY_SHOWSPANISH = "showSpanish";

    /**
     * Property showIBAN stored in column ShowIBAN in table C_BankAccount<br>
     * Help: {@literal Use IBAN for generating the Displayed Account Number}
     * 
     */
    public static final String PROPERTY_SHOWIBAN = "showIBAN";

    /**
     * Property displayedAccount stored in column DisplayedAccount in table C_BankAccount 
     * 
     */
    public static final String PROPERTY_DISPLAYEDACCOUNT = "displayedAccount";


    public BankAccount() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_SHOWGENERIC, false);
        setDefaultValue(PROPERTY_SHOWSPANISH, false);
        setDefaultValue(PROPERTY_SHOWIBAN, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see BankAccount#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see BankAccount#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see BankAccount#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see BankAccount#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see BankAccount#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see BankAccount#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see BankAccount#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see BankAccount#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see BankAccount#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see BankAccount#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see BankAccount#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see BankAccount#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see BankAccount#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see BankAccount#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see BankAccount#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see BankAccount#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see BankAccount#PROPERTY_BANK
     * 
     */
    public Bank getBank() {
        return (Bank) get(PROPERTY_BANK);
    }
    /**
     * @see BankAccount#PROPERTY_BANK
     * 
     */
    public void setBank(Bank bank) {
        set(PROPERTY_BANK, bank);
    }

    /**
     * @see BankAccount#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see BankAccount#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see BankAccount#PROPERTY_ACCOUNTTYPE
     * 
     */
    public String getAccountType() {
        return (String) get(PROPERTY_ACCOUNTTYPE);
    }
    /**
     * @see BankAccount#PROPERTY_ACCOUNTTYPE
     * 
     */
    public void setAccountType(String accountType) {
        set(PROPERTY_ACCOUNTTYPE, accountType);
    }

    /**
     * @see BankAccount#PROPERTY_ACCOUNTNO
     * 
     */
    public String getAccountNo() {
        return (String) get(PROPERTY_ACCOUNTNO);
    }
    /**
     * @see BankAccount#PROPERTY_ACCOUNTNO
     * 
     */
    public void setAccountNo(String accountNo) {
        set(PROPERTY_ACCOUNTNO, accountNo);
    }

    /**
     * @see BankAccount#PROPERTY_CURRENTBALANCE
     * 
     */
    public BigDecimal getCurrentBalance() {
        return (BigDecimal) get(PROPERTY_CURRENTBALANCE);
    }
    /**
     * @see BankAccount#PROPERTY_CURRENTBALANCE
     * 
     */
    public void setCurrentBalance(BigDecimal currentBalance) {
        set(PROPERTY_CURRENTBALANCE, currentBalance);
    }

    /**
     * @see BankAccount#PROPERTY_CREDITLIMIT
     * 
     */
    public BigDecimal getCreditLimit() {
        return (BigDecimal) get(PROPERTY_CREDITLIMIT);
    }
    /**
     * @see BankAccount#PROPERTY_CREDITLIMIT
     * 
     */
    public void setCreditLimit(BigDecimal creditLimit) {
        set(PROPERTY_CREDITLIMIT, creditLimit);
    }

    /**
     * @see BankAccount#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see BankAccount#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see BankAccount#PROPERTY_PARTIALACCOUNTNO
     * 
     */
    public String getPartialAccountNo() {
        return (String) get(PROPERTY_PARTIALACCOUNTNO);
    }
    /**
     * @see BankAccount#PROPERTY_PARTIALACCOUNTNO
     * 
     */
    public void setPartialAccountNo(String partialAccountNo) {
        set(PROPERTY_PARTIALACCOUNTNO, partialAccountNo);
    }

    /**
     * @see BankAccount#PROPERTY_CONTROLDIGIT
     * 
     */
    public String getControlDigit() {
        return (String) get(PROPERTY_CONTROLDIGIT);
    }
    /**
     * @see BankAccount#PROPERTY_CONTROLDIGIT
     * 
     */
    public void setControlDigit(String controlDigit) {
        set(PROPERTY_CONTROLDIGIT, controlDigit);
    }

    /**
     * @see BankAccount#PROPERTY_IBAN
     * 
     */
    public String getIBAN() {
        return (String) get(PROPERTY_IBAN);
    }
    /**
     * @see BankAccount#PROPERTY_IBAN
     * 
     */
    public void setIBAN(String iBAN) {
        set(PROPERTY_IBAN, iBAN);
    }

    /**
     * @see BankAccount#PROPERTY_GENERICACCOUNT
     * 
     */
    public String getGenericAccount() {
        return (String) get(PROPERTY_GENERICACCOUNT);
    }
    /**
     * @see BankAccount#PROPERTY_GENERICACCOUNT
     * 
     */
    public void setGenericAccount(String genericAccount) {
        set(PROPERTY_GENERICACCOUNT, genericAccount);
    }

    /**
     * @see BankAccount#PROPERTY_SHOWGENERIC
     * 
     */
    public Boolean isShowGeneric() {
        return (Boolean) get(PROPERTY_SHOWGENERIC);
    }
    /**
     * @see BankAccount#PROPERTY_SHOWGENERIC
     * 
     */
    public void setShowGeneric(Boolean showGeneric) {
        set(PROPERTY_SHOWGENERIC, showGeneric);
    }

    /**
     * @see BankAccount#PROPERTY_SHOWSPANISH
     * 
     */
    public Boolean isShowSpanish() {
        return (Boolean) get(PROPERTY_SHOWSPANISH);
    }
    /**
     * @see BankAccount#PROPERTY_SHOWSPANISH
     * 
     */
    public void setShowSpanish(Boolean showSpanish) {
        set(PROPERTY_SHOWSPANISH, showSpanish);
    }

    /**
     * @see BankAccount#PROPERTY_SHOWIBAN
     * 
     */
    public Boolean isShowIBAN() {
        return (Boolean) get(PROPERTY_SHOWIBAN);
    }
    /**
     * @see BankAccount#PROPERTY_SHOWIBAN
     * 
     */
    public void setShowIBAN(Boolean showIBAN) {
        set(PROPERTY_SHOWIBAN, showIBAN);
    }

    /**
     * @see BankAccount#PROPERTY_DISPLAYEDACCOUNT
     * 
     */
    public String getDisplayedAccount() {
        return (String) get(PROPERTY_DISPLAYEDACCOUNT);
    }
    /**
     * @see BankAccount#PROPERTY_DISPLAYEDACCOUNT
     * 
     */
    public void setDisplayedAccount(String displayedAccount) {
        set(PROPERTY_DISPLAYEDACCOUNT, displayedAccount);
    }

}
