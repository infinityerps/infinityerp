
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.common.geography.Location;
import org.openbravo.model.financialmgmt.accounting.FIN_FinancialAccountAccounting;
import org.openbravo.model.financialmgmt.gl.GLItem;
/**
 * Entity class for entity FIN_Financial_Account (stored in table FIN_Financial_Account).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_FinancialAccount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Financial_Account";
    public static final String ENTITY_NAME = "FIN_Financial_Account";

    /**
     * Property id stored in column Fin_Financial_Account_ID in table FIN_Financial_Account<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Financial_Account 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Financial_Account 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Financial_Account 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Financial_Account 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Financial_Account 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Financial_Account 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Financial_Account 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Financial_Account<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property name stored in column Name in table FIN_Financial_Account 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table FIN_Financial_Account<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property type stored in column Type in table FIN_Financial_Account<br>
     * Help: {@literal The Type indicates the type of validation that will occur.  This can be SQL, Java Script
     *       or Java Language.}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Financial_Account<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property locationAddress stored in column C_Location_ID in table FIN_Financial_Account<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_LOCATIONADDRESS = "locationAddress";

    /**
     * Property routingNo stored in column Routingno in table FIN_Financial_Account<br>
     * Help: {@literal The Bank Routing Number (ABA Number) identifies a legal Bank.  It is used in routing
     *       checks and electronic transactions.}
     * 
     */
    public static final String PROPERTY_ROUTINGNO = "routingNo";

    /**
     * Property swiftCode stored in column Swiftcode in table FIN_Financial_Account<br>
     * Help: {@literal The SWIFT Code is an identifier of a Bank}
     * 
     */
    public static final String PROPERTY_SWIFTCODE = "swiftCode";

    /**
     * Property bankCode stored in column Codebank in table FIN_Financial_Account<br>
     * Help: {@literal First four numbers of the bank account number which identifies the bank uniquely.}
     * 
     */
    public static final String PROPERTY_BANKCODE = "bankCode";

    /**
     * Property branchCode stored in column Codebranch in table FIN_Financial_Account<br>
     * Help: {@literal Second group of four numbers of the bank account which identifies the branch uniquely.}
     * 
     */
    public static final String PROPERTY_BRANCHCODE = "branchCode";

    /**
     * Property bankDigitcontrol stored in column Bank_Digitcontrol in table FIN_Financial_Account<br>
     * Help: {@literal Tenth number of the bank account.}
     * 
     */
    public static final String PROPERTY_BANKDIGITCONTROL = "bankDigitcontrol";

    /**
     * Property iNENo stored in column INE_Number in table FIN_Financial_Account<br>
     * Help: {@literal Number provided by the bank to configurate remittances.}
     * 
     */
    public static final String PROPERTY_INENO = "iNENo";

    /**
     * Property accountDigitcontrol stored in column Account_Digitcontrol in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_ACCOUNTDIGITCONTROL = "accountDigitcontrol";

    /**
     * Property partialAccountNo stored in column Codeaccount in table FIN_Financial_Account<br>
     * Help: {@literal Last ten numbers of the bank account.}
     * 
     */
    public static final String PROPERTY_PARTIALACCOUNTNO = "partialAccountNo";

    /**
     * Property accountNo stored in column Accountno in table FIN_Financial_Account<br>
     * Help: {@literal Text that will identify this bank account}
     * 
     */
    public static final String PROPERTY_ACCOUNTNO = "accountNo";

    /**
     * Property currentBalance stored in column Currentbalance in table FIN_Financial_Account<br>
     * Help: {@literal The Current Balance field indicates the current balance in this account.}
     * 
     */
    public static final String PROPERTY_CURRENTBALANCE = "currentBalance";

    /**
     * Property initialBalance stored in column InitialBalance in table FIN_Financial_Account<br>
     * Help: {@literal Amount of the account at the time of registering the financial account. This amount is
     *       used to initialize financial account and will be used as last reconciliation amount for first
     *       reconciliation in OB for the given financial account.}
     * 
     */
    public static final String PROPERTY_INITIALBALANCE = "initialBalance";

    /**
     * Property creditLimit stored in column Creditlimit in table FIN_Financial_Account<br>
     * Help: {@literal The Credit Limit field indicates the credit limit for this account.}
     * 
     */
    public static final String PROPERTY_CREDITLIMIT = "creditLimit";

    /**
     * Property iBAN stored in column Iban in table FIN_Financial_Account<br>
     * Help: {@literal Code that identifies uniquely one bank account, no matter the country it belongs to. It
     *       consists of a ISO 3166-1 alpha-2 country code, followed by two check digits, and up to thirty
     *       alphanumeric characters for the domestic bank account number, called the BBAN (Basic Bank Account
     *       Number). It is up to each country's national banking community to decide on the length of the BBAN
     *       for accounts in that country, but its length must be fixed for any given country.}
     * 
     */
    public static final String PROPERTY_IBAN = "iBAN";

    /**
     * Property default stored in column Isdefault in table FIN_Financial_Account<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property matchingAlgorithm stored in column FIN_Matching_Algorithm_ID in table FIN_Financial_Account<br>
     * Help: {@literal Identifies the algorithm used to match the imported bank statement lines}
     * 
     */
    public static final String PROPERTY_MATCHINGALGORITHM = "matchingAlgorithm";

    /**
     * Property typewriteoff stored in column Typewriteoff in table FIN_Financial_Account<br>
     * Help: {@literal It allows to define different type of write-off limit for a financial account. This field
     *       is displayed when write-off limit preference value is set to "Y". }
     * 
     */
    public static final String PROPERTY_TYPEWRITEOFF = "typewriteoff";

    /**
     * Property writeofflimit stored in column Writeofflimit in table FIN_Financial_Account<br>
     * Help: {@literal Value for the Write-off limit in a payment. When type selected is Amount, the value holds
     *       the amount on financial account currency.  This field is displayed when write-off limit preference
     *       value is set to "Y".}
     * 
     */
    public static final String PROPERTY_WRITEOFFLIMIT = "writeofflimit";

    /**
     * Property genericAccountNo stored in column GenericAccountNo in table FIN_Financial_Account<br>
     * Help: {@literal Bank account number in a generic format.}
     * 
     */
    public static final String PROPERTY_GENERICACCOUNTNO = "genericAccountNo";

    /**
     * Property country stored in column C_Country_ID in table FIN_Financial_Account<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * 
     */
    public static final String PROPERTY_COUNTRY = "country";

    /**
     * Property bankFormat stored in column BankFormat in table FIN_Financial_Account<br>
     * Help: {@literal Bank Account Format used for generating the Displayed Account Number}
     * 
     */
    public static final String PROPERTY_BANKFORMAT = "bankFormat";

    /**
     * Property aPRMImportBankFile stored in column EM_APRM_ImportBankFile in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_APRMIMPORTBANKFILE = "aPRMImportBankFile";

    /**
     * Property aPRMMatchTransactions stored in column EM_APRM_MatchTransactions in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_APRMMATCHTRANSACTIONS = "aPRMMatchTransactions";

    /**
     * Property aPRMReconcile stored in column EM_APRM_Reconcile in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_APRMRECONCILE = "aPRMReconcile";

    /**
     * Property aPRMMatchTransactionsForce stored in column EM_APRM_MatchTrans_Force in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_APRMMATCHTRANSACTIONSFORCE = "aPRMMatchTransactionsForce";

    /**
     * Property aprmAddtransactionpd stored in column EM_Aprm_Addtransactionpd in table FIN_Financial_Account<br>
     * Help: {@literal Add transaction process definition}
     * 
     */
    public static final String PROPERTY_APRMADDTRANSACTIONPD = "aprmAddtransactionpd";

    /**
     * Property aprmFindtransactionspd stored in column EM_Aprm_Findtransactionspd in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_APRMFINDTRANSACTIONSPD = "aprmFindtransactionspd";

    /**
     * Property aprmAddMultiplePayments stored in column EM_Aprm_AddMultiplePayments in table FIN_Financial_Account<br>
     * Help: {@literal User can select multiple payments at the same time. The system will create a separate
     *       transaction per selected payment}
     * 
     */
    public static final String PROPERTY_APRMADDMULTIPLEPAYMENTS = "aprmAddMultiplePayments";

    /**
     * Property aprmFundsTrans stored in column EM_Aprm_Funds_Trans in table FIN_Financial_Account<br>
     * Help: {@literal Transfer funds between Financial Accounts}
     * 
     */
    public static final String PROPERTY_APRMFUNDSTRANS = "aprmFundsTrans";

    /**
     * Property aprmIsfundstransEnabled stored in column EM_Aprm_Isfundstrans_Enabled in table FIN_Financial_Account<br>
     * Help: {@literal Funds Transfer Enabled flag is used to show/hide funds transfer button process and to
     *       show/hide Financial Accounts in Funds Transfer Process}
     * 
     */
    public static final String PROPERTY_APRMISFUNDSTRANSENABLED = "aprmIsfundstransEnabled";

    /**
     * Property aprmGlitemDiff stored in column EM_Aprm_Glitem_Diff in table FIN_Financial_Account<br>
     * Help: {@literal GL Item Difference}
     * 
     */
    public static final String PROPERTY_APRMGLITEMDIFF = "aprmGlitemDiff";



    /**
     * Property _computedColumns stored in column _computedColumns in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property fINBankStatementList stored in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_FINBANKSTATEMENTLIST = "fINBankStatementList";

    /**
     * Property fINFinaccTransactionList stored in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_FINFINACCTRANSACTIONLIST = "fINFinaccTransactionList";

    /**
     * Property fINFinancialAccountAcctList stored in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_FINFINANCIALACCOUNTACCTLIST = "fINFinancialAccountAcctList";

    /**
     * Property financialMgmtFinAccPaymentMethodList stored in table FIN_Financial_Account
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTFINACCPAYMENTMETHODLIST = "financialMgmtFinAccPaymentMethodList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property lastreconbalance<br>
     * <br>
     * Computed from: <br>
     * {@code (select max(rec.endingbalance) 
       from fin_reconciliation rec
       where rec.fin_financial_account_id =
       fin_financial_account_id
       and exists (select 1
                   from fin_reconciliation fr
                  
       where fr.processed='Y'
                         and fr.fin_financial_account_id=fin_financial_account_id
         
                      having rec.dateto = max(fr.dateto)))}
     */
    public static final String COMPUTED_COLUMN_LASTRECONBALANCE = "lastreconbalance";

    /**
     * Computed column for property lastreconciliation<br>
     * <br>
     * Computed from: <br>
     * {@code (select max(fr.dateto) from fin_financial_account ff , fin_reconciliation fr
       where
       ff.fin_financial_account_id=fr.fin_financial_account_id
       and
       ff.fin_financial_account_id=fin_financial_account_id)}
     */
    public static final String COMPUTED_COLUMN_LASTRECONCILIATION = "lastreconciliation";

    public FIN_FinancialAccount() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TYPE, "B");
        setDefaultValue(PROPERTY_CURRENTBALANCE, new BigDecimal(0));
        setDefaultValue(PROPERTY_INITIALBALANCE, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREDITLIMIT, new BigDecimal(0));
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_APRMIMPORTBANKFILE, false);
        setDefaultValue(PROPERTY_APRMMATCHTRANSACTIONS, false);
        setDefaultValue(PROPERTY_APRMRECONCILE, false);
        setDefaultValue(PROPERTY_APRMMATCHTRANSACTIONSFORCE, false);
        setDefaultValue(PROPERTY_APRMADDTRANSACTIONPD, false);
        setDefaultValue(PROPERTY_APRMFINDTRANSACTIONSPD, false);
        setDefaultValue(PROPERTY_APRMADDMULTIPLEPAYMENTS, false);
        setDefaultValue(PROPERTY_APRMFUNDSTRANS, false);
        setDefaultValue(PROPERTY_APRMISFUNDSTRANSENABLED, true);
        setDefaultValue(PROPERTY_FINBANKSTATEMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINFINACCTRANSACTIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINFINANCIALACCOUNTACCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTFINACCPAYMENTMETHODLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_LOCATIONADDRESS
     * 
     */
    public Location getLocationAddress() {
        return (Location) get(PROPERTY_LOCATIONADDRESS);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_LOCATIONADDRESS
     * 
     */
    public void setLocationAddress(Location locationAddress) {
        set(PROPERTY_LOCATIONADDRESS, locationAddress);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_ROUTINGNO
     * 
     */
    public String getRoutingNo() {
        return (String) get(PROPERTY_ROUTINGNO);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_ROUTINGNO
     * 
     */
    public void setRoutingNo(String routingNo) {
        set(PROPERTY_ROUTINGNO, routingNo);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_SWIFTCODE
     * 
     */
    public String getSwiftCode() {
        return (String) get(PROPERTY_SWIFTCODE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_SWIFTCODE
     * 
     */
    public void setSwiftCode(String swiftCode) {
        set(PROPERTY_SWIFTCODE, swiftCode);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_BANKCODE
     * 
     */
    public String getBankCode() {
        return (String) get(PROPERTY_BANKCODE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_BANKCODE
     * 
     */
    public void setBankCode(String bankCode) {
        set(PROPERTY_BANKCODE, bankCode);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_BRANCHCODE
     * 
     */
    public String getBranchCode() {
        return (String) get(PROPERTY_BRANCHCODE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_BRANCHCODE
     * 
     */
    public void setBranchCode(String branchCode) {
        set(PROPERTY_BRANCHCODE, branchCode);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_BANKDIGITCONTROL
     * 
     */
    public String getBankDigitcontrol() {
        return (String) get(PROPERTY_BANKDIGITCONTROL);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_BANKDIGITCONTROL
     * 
     */
    public void setBankDigitcontrol(String bankDigitcontrol) {
        set(PROPERTY_BANKDIGITCONTROL, bankDigitcontrol);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_INENO
     * 
     */
    public String getINENo() {
        return (String) get(PROPERTY_INENO);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_INENO
     * 
     */
    public void setINENo(String iNENo) {
        set(PROPERTY_INENO, iNENo);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_ACCOUNTDIGITCONTROL
     * 
     */
    public String getAccountDigitcontrol() {
        return (String) get(PROPERTY_ACCOUNTDIGITCONTROL);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_ACCOUNTDIGITCONTROL
     * 
     */
    public void setAccountDigitcontrol(String accountDigitcontrol) {
        set(PROPERTY_ACCOUNTDIGITCONTROL, accountDigitcontrol);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_PARTIALACCOUNTNO
     * 
     */
    public String getPartialAccountNo() {
        return (String) get(PROPERTY_PARTIALACCOUNTNO);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_PARTIALACCOUNTNO
     * 
     */
    public void setPartialAccountNo(String partialAccountNo) {
        set(PROPERTY_PARTIALACCOUNTNO, partialAccountNo);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_ACCOUNTNO
     * 
     */
    public String getAccountNo() {
        return (String) get(PROPERTY_ACCOUNTNO);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_ACCOUNTNO
     * 
     */
    public void setAccountNo(String accountNo) {
        set(PROPERTY_ACCOUNTNO, accountNo);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_CURRENTBALANCE
     * 
     */
    public BigDecimal getCurrentBalance() {
        return (BigDecimal) get(PROPERTY_CURRENTBALANCE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_CURRENTBALANCE
     * 
     */
    public void setCurrentBalance(BigDecimal currentBalance) {
        set(PROPERTY_CURRENTBALANCE, currentBalance);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_INITIALBALANCE
     * 
     */
    public BigDecimal getInitialBalance() {
        return (BigDecimal) get(PROPERTY_INITIALBALANCE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_INITIALBALANCE
     * 
     */
    public void setInitialBalance(BigDecimal initialBalance) {
        set(PROPERTY_INITIALBALANCE, initialBalance);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_CREDITLIMIT
     * 
     */
    public BigDecimal getCreditLimit() {
        return (BigDecimal) get(PROPERTY_CREDITLIMIT);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_CREDITLIMIT
     * 
     */
    public void setCreditLimit(BigDecimal creditLimit) {
        set(PROPERTY_CREDITLIMIT, creditLimit);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_IBAN
     * 
     */
    public String getIBAN() {
        return (String) get(PROPERTY_IBAN);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_IBAN
     * 
     */
    public void setIBAN(String iBAN) {
        set(PROPERTY_IBAN, iBAN);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_MATCHINGALGORITHM
     * 
     */
    public MatchingAlgorithm getMatchingAlgorithm() {
        return (MatchingAlgorithm) get(PROPERTY_MATCHINGALGORITHM);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_MATCHINGALGORITHM
     * 
     */
    public void setMatchingAlgorithm(MatchingAlgorithm matchingAlgorithm) {
        set(PROPERTY_MATCHINGALGORITHM, matchingAlgorithm);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_TYPEWRITEOFF
     * 
     */
    public String getTypewriteoff() {
        return (String) get(PROPERTY_TYPEWRITEOFF);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_TYPEWRITEOFF
     * 
     */
    public void setTypewriteoff(String typewriteoff) {
        set(PROPERTY_TYPEWRITEOFF, typewriteoff);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_WRITEOFFLIMIT
     * 
     */
    public BigDecimal getWriteofflimit() {
        return (BigDecimal) get(PROPERTY_WRITEOFFLIMIT);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_WRITEOFFLIMIT
     * 
     */
    public void setWriteofflimit(BigDecimal writeofflimit) {
        set(PROPERTY_WRITEOFFLIMIT, writeofflimit);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_GENERICACCOUNTNO
     * 
     */
    public String getGenericAccountNo() {
        return (String) get(PROPERTY_GENERICACCOUNTNO);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_GENERICACCOUNTNO
     * 
     */
    public void setGenericAccountNo(String genericAccountNo) {
        set(PROPERTY_GENERICACCOUNTNO, genericAccountNo);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_COUNTRY
     * 
     */
    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_COUNTRY
     * 
     */
    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_BANKFORMAT
     * 
     */
    public String getBankFormat() {
        return (String) get(PROPERTY_BANKFORMAT);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_BANKFORMAT
     * 
     */
    public void setBankFormat(String bankFormat) {
        set(PROPERTY_BANKFORMAT, bankFormat);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMIMPORTBANKFILE
     * 
     */
    public Boolean isAPRMImportBankFile() {
        return (Boolean) get(PROPERTY_APRMIMPORTBANKFILE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMIMPORTBANKFILE
     * 
     */
    public void setAPRMImportBankFile(Boolean aPRMImportBankFile) {
        set(PROPERTY_APRMIMPORTBANKFILE, aPRMImportBankFile);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMMATCHTRANSACTIONS
     * 
     */
    public Boolean isAPRMMatchTransactions() {
        return (Boolean) get(PROPERTY_APRMMATCHTRANSACTIONS);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMMATCHTRANSACTIONS
     * 
     */
    public void setAPRMMatchTransactions(Boolean aPRMMatchTransactions) {
        set(PROPERTY_APRMMATCHTRANSACTIONS, aPRMMatchTransactions);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMRECONCILE
     * 
     */
    public Boolean isAPRMReconcile() {
        return (Boolean) get(PROPERTY_APRMRECONCILE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMRECONCILE
     * 
     */
    public void setAPRMReconcile(Boolean aPRMReconcile) {
        set(PROPERTY_APRMRECONCILE, aPRMReconcile);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMMATCHTRANSACTIONSFORCE
     * 
     */
    public Boolean isAPRMMatchTransactionsForce() {
        return (Boolean) get(PROPERTY_APRMMATCHTRANSACTIONSFORCE);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMMATCHTRANSACTIONSFORCE
     * 
     */
    public void setAPRMMatchTransactionsForce(Boolean aPRMMatchTransactionsForce) {
        set(PROPERTY_APRMMATCHTRANSACTIONSFORCE, aPRMMatchTransactionsForce);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMADDTRANSACTIONPD
     * 
     */
    public Boolean isAprmAddtransactionpd() {
        return (Boolean) get(PROPERTY_APRMADDTRANSACTIONPD);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMADDTRANSACTIONPD
     * 
     */
    public void setAprmAddtransactionpd(Boolean aprmAddtransactionpd) {
        set(PROPERTY_APRMADDTRANSACTIONPD, aprmAddtransactionpd);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMFINDTRANSACTIONSPD
     * 
     */
    public Boolean isAprmFindtransactionspd() {
        return (Boolean) get(PROPERTY_APRMFINDTRANSACTIONSPD);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMFINDTRANSACTIONSPD
     * 
     */
    public void setAprmFindtransactionspd(Boolean aprmFindtransactionspd) {
        set(PROPERTY_APRMFINDTRANSACTIONSPD, aprmFindtransactionspd);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMADDMULTIPLEPAYMENTS
     * 
     */
    public Boolean isAprmAddMultiplePayments() {
        return (Boolean) get(PROPERTY_APRMADDMULTIPLEPAYMENTS);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMADDMULTIPLEPAYMENTS
     * 
     */
    public void setAprmAddMultiplePayments(Boolean aprmAddMultiplePayments) {
        set(PROPERTY_APRMADDMULTIPLEPAYMENTS, aprmAddMultiplePayments);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMFUNDSTRANS
     * 
     */
    public Boolean isAprmFundsTrans() {
        return (Boolean) get(PROPERTY_APRMFUNDSTRANS);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMFUNDSTRANS
     * 
     */
    public void setAprmFundsTrans(Boolean aprmFundsTrans) {
        set(PROPERTY_APRMFUNDSTRANS, aprmFundsTrans);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMISFUNDSTRANSENABLED
     * 
     */
    public Boolean isAprmIsfundstransEnabled() {
        return (Boolean) get(PROPERTY_APRMISFUNDSTRANSENABLED);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMISFUNDSTRANSENABLED
     * 
     */
    public void setAprmIsfundstransEnabled(Boolean aprmIsfundstransEnabled) {
        set(PROPERTY_APRMISFUNDSTRANSENABLED, aprmIsfundstransEnabled);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMGLITEMDIFF
     * 
     */
    public GLItem getAprmGlitemDiff() {
        return (GLItem) get(PROPERTY_APRMGLITEMDIFF);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY_APRMGLITEMDIFF
     * 
     */
    public void setAprmGlitemDiff(GLItem aprmGlitemDiff) {
        set(PROPERTY_APRMGLITEMDIFF, aprmGlitemDiff);
    }

    /**
     * @see FIN_FinancialAccount#COMPUTED_COLUMN_LASTRECONBALANCE
     * 
     */
    public BigDecimal getLastreconbalance() {
        return (BigDecimal) get(COMPUTED_COLUMN_LASTRECONBALANCE);
    }
    /**
     * @see FIN_FinancialAccount#COMPUTED_COLUMN_LASTRECONBALANCE
     * 
     */
    public void setLastreconbalance(BigDecimal lastreconbalance) {
        set(COMPUTED_COLUMN_LASTRECONBALANCE, lastreconbalance);
    }

    /**
     * @see FIN_FinancialAccount#COMPUTED_COLUMN_LASTRECONCILIATION
     * 
     */
    public Date getLastreconciliation() {
        return (Date) get(COMPUTED_COLUMN_LASTRECONCILIATION);
    }
    /**
     * @see FIN_FinancialAccount#COMPUTED_COLUMN_LASTRECONCILIATION
     * 
     */
    public void setLastreconciliation(Date lastreconciliation) {
        set(COMPUTED_COLUMN_LASTRECONCILIATION, lastreconciliation);
    }

    /**
     * @see FIN_FinancialAccount#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public FIN_FinancialAccount_ComputedColumns get_computedColumns() {
        return (FIN_FinancialAccount_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see FIN_FinancialAccount#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(FIN_FinancialAccount_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * Help: {@literal Bank statements loaded for the given financial account}<br>
     * @see FIN_BankStatement
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_BankStatement> getFINBankStatementList() {
      return (List<FIN_BankStatement>) get(PROPERTY_FINBANKSTATEMENTLIST);
    }

    /**
     * Help: {@literal Bank statements loaded for the given financial account}<br>
     * @see FIN_BankStatement
     * 
     */
    public void setFINBankStatementList(List<FIN_BankStatement> fINBankStatementList) {
        set(PROPERTY_FINBANKSTATEMENTLIST, fINBankStatementList);
    }

    /**
     * @see FIN_FinaccTransaction
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_FinaccTransaction> getFINFinaccTransactionList() {
      return (List<FIN_FinaccTransaction>) get(PROPERTY_FINFINACCTRANSACTIONLIST);
    }

    /**
     * @see FIN_FinaccTransaction
     * 
     */
    public void setFINFinaccTransactionList(List<FIN_FinaccTransaction> fINFinaccTransactionList) {
        set(PROPERTY_FINFINACCTRANSACTIONLIST, fINFinaccTransactionList);
    }

    /**
     * Help: {@literal Accounting configuration of financial account}<br>
     * @see FIN_FinancialAccountAccounting
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_FinancialAccountAccounting> getFINFinancialAccountAcctList() {
      return (List<FIN_FinancialAccountAccounting>) get(PROPERTY_FINFINANCIALACCOUNTACCTLIST);
    }

    /**
     * Help: {@literal Accounting configuration of financial account}<br>
     * @see FIN_FinancialAccountAccounting
     * 
     */
    public void setFINFinancialAccountAcctList(List<FIN_FinancialAccountAccounting> fINFinancialAccountAcctList) {
        set(PROPERTY_FINFINANCIALACCOUNTACCTLIST, fINFinancialAccountAcctList);
    }

    /**
     * @see FinAccPaymentMethod
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FinAccPaymentMethod> getFinancialMgmtFinAccPaymentMethodList() {
      return (List<FinAccPaymentMethod>) get(PROPERTY_FINANCIALMGMTFINACCPAYMENTMETHODLIST);
    }

    /**
     * @see FinAccPaymentMethod
     * 
     */
    public void setFinancialMgmtFinAccPaymentMethodList(List<FinAccPaymentMethod> financialMgmtFinAccPaymentMethodList) {
        set(PROPERTY_FINANCIALMGMTFINACCPAYMENTMETHODLIST, financialMgmtFinAccPaymentMethodList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_LASTRECONBALANCE.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getLastreconbalance();
      }
      if (COMPUTED_COLUMN_LASTRECONCILIATION.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getLastreconciliation();
      }

      return super.get(propName);
    }
}
