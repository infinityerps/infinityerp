
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
import org.openbravo.model.common.geography.Country;
/**
 * Entity class for entity BusinessPartnerBankAccount (stored in table C_BP_BankAccount).
 * <br>
 * Help: {@literal The Define Bank Account Tab defines the banking information for this business partner. 
     *       This data is used for processing payments and remittances.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class BankAccount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BP_BankAccount";
    public static final String ENTITY_NAME = "BusinessPartnerBankAccount";

    /**
     * Property id stored in column C_BP_BankAccount_ID in table C_BP_BankAccount 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_BP_BankAccount 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BP_BankAccount 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table C_BP_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property updated stored in column Updated in table C_BP_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property active stored in column IsActive in table C_BP_BankAccount 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property createdBy stored in column CreatedBy in table C_BP_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BP_BankAccount 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_BP_BankAccount<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property accountType stored in column BankAccountType in table C_BP_BankAccount<br>
     * Help: {@literal The Bank Account Type field indicates the type of account (savings, checking etc) this
     *       account  is defined as.}
     * 
     */
    public static final String PROPERTY_ACCOUNTTYPE = "accountType";

    /**
     * Property routingNo stored in column RoutingNo in table C_BP_BankAccount<br>
     * Help: {@literal The Bank Routing Number (ABA Number) identifies a legal Bank.  It is used in routing
     *       checks and electronic transactions.}
     * 
     */
    public static final String PROPERTY_ROUTINGNO = "routingNo";

    /**
     * Property accountNo stored in column AccountNo in table C_BP_BankAccount<br>
     * Help: {@literal Bank account number in a generic format.}
     * 
     */
    public static final String PROPERTY_ACCOUNTNO = "accountNo";

    /**
     * Property cCType stored in column CreditCardType in table C_BP_BankAccount<br>
     * Help: {@literal The Credit Card drop down list box is used for selecting the type of Credit Card presented
     *       for payment.}
     * 
     */
    public static final String PROPERTY_CCTYPE = "cCType";

    /**
     * Property creditCardNo stored in column CreditCardNumber in table C_BP_BankAccount<br>
     * Help: {@literal The Credit Card number indicates the number on the credit card, without blanks or spaces.}
     * 
     */
    public static final String PROPERTY_CREDITCARDNO = "creditCardNo";

    /**
     * Property expiryMonth stored in column CreditCardExpMM in table C_BP_BankAccount<br>
     * Help: {@literal The Expiry Month indicates the expiry month for this credit card.}
     * 
     */
    public static final String PROPERTY_EXPIRYMONTH = "expiryMonth";

    /**
     * Property expiryYear stored in column CreditCardExpYY in table C_BP_BankAccount<br>
     * Help: {@literal The Expiry Year indicates the expiry year for this credit card.}
     * 
     */
    public static final String PROPERTY_EXPIRYYEAR = "expiryYear";

    /**
     * Property name stored in column A_Name in table C_BP_BankAccount<br>
     * Help: {@literal The Name of the Credit Card or Account holder.}
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property street stored in column A_Street in table C_BP_BankAccount<br>
     * Help: {@literal The Street Address of the Credit Card or Account holder.}
     * 
     */
    public static final String PROPERTY_STREET = "street";

    /**
     * Property city stored in column A_City in table C_BP_BankAccount<br>
     * Help: {@literal The Account City indicates the City of the Credit Card or Account holder}
     * 
     */
    public static final String PROPERTY_CITY = "city";

    /**
     * Property state stored in column A_State in table C_BP_BankAccount<br>
     * Help: {@literal The State of the Credit Card or Account holder}
     * 
     */
    public static final String PROPERTY_STATE = "state";

    /**
     * Property postalCode stored in column A_Zip in table C_BP_BankAccount<br>
     * Help: {@literal The Zip Code of the Credit Card or Account Holder.}
     * 
     */
    public static final String PROPERTY_POSTALCODE = "postalCode";

    /**
     * Property driversLicenseNo stored in column A_Ident_DL in table C_BP_BankAccount<br>
     * Help: {@literal The Driver's License being used as identification.}
     * 
     */
    public static final String PROPERTY_DRIVERSLICENSENO = "driversLicenseNo";

    /**
     * Property email stored in column A_EMail in table C_BP_BankAccount<br>
     * Help: {@literal The EMail Address indicates the EMail address off the Credit Card or Account holder.}
     * 
     */
    public static final String PROPERTY_EMAIL = "email";

    /**
     * Property socialSecurityNo stored in column A_Ident_SSN in table C_BP_BankAccount<br>
     * Help: {@literal The Social Security number being used as identification.}
     * 
     */
    public static final String PROPERTY_SOCIALSECURITYNO = "socialSecurityNo";

    /**
     * Property zipVerified stored in column R_AvsZip in table C_BP_BankAccount<br>
     * Help: {@literal The Zip Verified indicates if the zip code has been verified by the Credit Card Company.}
     * 
     */
    public static final String PROPERTY_ZIPVERIFIED = "zipVerified";

    /**
     * Property countryName stored in column A_Country in table C_BP_BankAccount<br>
     * Help: {@literal Account Country Name}
     * 
     */
    public static final String PROPERTY_COUNTRYNAME = "countryName";

    /**
     * Property userContact stored in column AD_User_ID in table C_BP_BankAccount<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property bankName stored in column Bank_Name in table C_BP_BankAccount<br>
     * Help: {@literal Name of the bank}
     * 
     */
    public static final String PROPERTY_BANKNAME = "bankName";

    /**
     * Property iBAN stored in column Iban in table C_BP_BankAccount<br>
     * Help: {@literal Code that identifies uniquely one bank account, no matter the country it belongs to. It
     *       consists of a ISO 3166-1 alpha-2 country code, followed by two check digits, and up to thirty
     *       alphanumeric characters for the domestic bank account number, called the BBAN (Basic Bank Account
     *       Number). It is up to each country's national banking community to decide on the length of the BBAN
     *       for accounts in that country, but its length must be fixed for any given country.}
     * 
     */
    public static final String PROPERTY_IBAN = "iBAN";

    /**
     * Property displayedAccount stored in column Displayedaccount in table C_BP_BankAccount 
     * 
     */
    public static final String PROPERTY_DISPLAYEDACCOUNT = "displayedAccount";

    /**
     * Property country stored in column C_Country_ID in table C_BP_BankAccount<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * 
     */
    public static final String PROPERTY_COUNTRY = "country";

    /**
     * Property swiftCode stored in column SwiftCode in table C_BP_BankAccount<br>
     * Help: {@literal The SWIFT Code is an identifier of a Bank}
     * 
     */
    public static final String PROPERTY_SWIFTCODE = "swiftCode";

    /**
     * Property bankFormat stored in column BankFormat in table C_BP_BankAccount<br>
     * Help: {@literal Bank Account Format used for generating the Displayed Account Number}
     * 
     */
    public static final String PROPERTY_BANKFORMAT = "bankFormat";


    public BankAccount() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_EXPIRYYEAR, (long) 2000);
        setDefaultValue(PROPERTY_BANKFORMAT, "GENERIC");
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
     * @see BankAccount#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see BankAccount#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
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
     * @see BankAccount#PROPERTY_ROUTINGNO
     * 
     */
    public String getRoutingNo() {
        return (String) get(PROPERTY_ROUTINGNO);
    }
    /**
     * @see BankAccount#PROPERTY_ROUTINGNO
     * 
     */
    public void setRoutingNo(String routingNo) {
        set(PROPERTY_ROUTINGNO, routingNo);
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
     * @see BankAccount#PROPERTY_CCTYPE
     * 
     */
    public String getCCType() {
        return (String) get(PROPERTY_CCTYPE);
    }
    /**
     * @see BankAccount#PROPERTY_CCTYPE
     * 
     */
    public void setCCType(String cCType) {
        set(PROPERTY_CCTYPE, cCType);
    }

    /**
     * @see BankAccount#PROPERTY_CREDITCARDNO
     * 
     */
    public String getCreditCardNo() {
        return (String) get(PROPERTY_CREDITCARDNO);
    }
    /**
     * @see BankAccount#PROPERTY_CREDITCARDNO
     * 
     */
    public void setCreditCardNo(String creditCardNo) {
        set(PROPERTY_CREDITCARDNO, creditCardNo);
    }

    /**
     * @see BankAccount#PROPERTY_EXPIRYMONTH
     * 
     */
    public Long getExpiryMonth() {
        return (Long) get(PROPERTY_EXPIRYMONTH);
    }
    /**
     * @see BankAccount#PROPERTY_EXPIRYMONTH
     * 
     */
    public void setExpiryMonth(Long expiryMonth) {
        set(PROPERTY_EXPIRYMONTH, expiryMonth);
    }

    /**
     * @see BankAccount#PROPERTY_EXPIRYYEAR
     * 
     */
    public Long getExpiryYear() {
        return (Long) get(PROPERTY_EXPIRYYEAR);
    }
    /**
     * @see BankAccount#PROPERTY_EXPIRYYEAR
     * 
     */
    public void setExpiryYear(Long expiryYear) {
        set(PROPERTY_EXPIRYYEAR, expiryYear);
    }

    /**
     * @see BankAccount#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see BankAccount#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see BankAccount#PROPERTY_STREET
     * 
     */
    public String getStreet() {
        return (String) get(PROPERTY_STREET);
    }
    /**
     * @see BankAccount#PROPERTY_STREET
     * 
     */
    public void setStreet(String street) {
        set(PROPERTY_STREET, street);
    }

    /**
     * @see BankAccount#PROPERTY_CITY
     * 
     */
    public String getCity() {
        return (String) get(PROPERTY_CITY);
    }
    /**
     * @see BankAccount#PROPERTY_CITY
     * 
     */
    public void setCity(String city) {
        set(PROPERTY_CITY, city);
    }

    /**
     * @see BankAccount#PROPERTY_STATE
     * 
     */
    public String getState() {
        return (String) get(PROPERTY_STATE);
    }
    /**
     * @see BankAccount#PROPERTY_STATE
     * 
     */
    public void setState(String state) {
        set(PROPERTY_STATE, state);
    }

    /**
     * @see BankAccount#PROPERTY_POSTALCODE
     * 
     */
    public String getPostalCode() {
        return (String) get(PROPERTY_POSTALCODE);
    }
    /**
     * @see BankAccount#PROPERTY_POSTALCODE
     * 
     */
    public void setPostalCode(String postalCode) {
        set(PROPERTY_POSTALCODE, postalCode);
    }

    /**
     * @see BankAccount#PROPERTY_DRIVERSLICENSENO
     * 
     */
    public String getDriversLicenseNo() {
        return (String) get(PROPERTY_DRIVERSLICENSENO);
    }
    /**
     * @see BankAccount#PROPERTY_DRIVERSLICENSENO
     * 
     */
    public void setDriversLicenseNo(String driversLicenseNo) {
        set(PROPERTY_DRIVERSLICENSENO, driversLicenseNo);
    }

    /**
     * @see BankAccount#PROPERTY_EMAIL
     * 
     */
    public String getEmail() {
        return (String) get(PROPERTY_EMAIL);
    }
    /**
     * @see BankAccount#PROPERTY_EMAIL
     * 
     */
    public void setEmail(String email) {
        set(PROPERTY_EMAIL, email);
    }

    /**
     * @see BankAccount#PROPERTY_SOCIALSECURITYNO
     * 
     */
    public String getSocialSecurityNo() {
        return (String) get(PROPERTY_SOCIALSECURITYNO);
    }
    /**
     * @see BankAccount#PROPERTY_SOCIALSECURITYNO
     * 
     */
    public void setSocialSecurityNo(String socialSecurityNo) {
        set(PROPERTY_SOCIALSECURITYNO, socialSecurityNo);
    }

    /**
     * @see BankAccount#PROPERTY_ZIPVERIFIED
     * 
     */
    public String getZipVerified() {
        return (String) get(PROPERTY_ZIPVERIFIED);
    }
    /**
     * @see BankAccount#PROPERTY_ZIPVERIFIED
     * 
     */
    public void setZipVerified(String zipVerified) {
        set(PROPERTY_ZIPVERIFIED, zipVerified);
    }

    /**
     * @see BankAccount#PROPERTY_COUNTRYNAME
     * 
     */
    public String getCountryName() {
        return (String) get(PROPERTY_COUNTRYNAME);
    }
    /**
     * @see BankAccount#PROPERTY_COUNTRYNAME
     * 
     */
    public void setCountryName(String countryName) {
        set(PROPERTY_COUNTRYNAME, countryName);
    }

    /**
     * @see BankAccount#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see BankAccount#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see BankAccount#PROPERTY_BANKNAME
     * 
     */
    public String getBankName() {
        return (String) get(PROPERTY_BANKNAME);
    }
    /**
     * @see BankAccount#PROPERTY_BANKNAME
     * 
     */
    public void setBankName(String bankName) {
        set(PROPERTY_BANKNAME, bankName);
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

    /**
     * @see BankAccount#PROPERTY_COUNTRY
     * 
     */
    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }
    /**
     * @see BankAccount#PROPERTY_COUNTRY
     * 
     */
    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

    /**
     * @see BankAccount#PROPERTY_SWIFTCODE
     * 
     */
    public String getSwiftCode() {
        return (String) get(PROPERTY_SWIFTCODE);
    }
    /**
     * @see BankAccount#PROPERTY_SWIFTCODE
     * 
     */
    public void setSwiftCode(String swiftCode) {
        set(PROPERTY_SWIFTCODE, swiftCode);
    }

    /**
     * @see BankAccount#PROPERTY_BANKFORMAT
     * 
     */
    public String getBankFormat() {
        return (String) get(PROPERTY_BANKFORMAT);
    }
    /**
     * @see BankAccount#PROPERTY_BANKFORMAT
     * 
     */
    public void setBankFormat(String bankFormat) {
        set(PROPERTY_BANKFORMAT, bankFormat);
    }

}
