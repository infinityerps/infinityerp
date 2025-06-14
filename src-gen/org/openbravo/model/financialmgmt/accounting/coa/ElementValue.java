
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
package org.openbravo.model.financialmgmt.accounting.coa;

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
import org.openbravo.model.common.bank.BankAccount;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtElementValue (stored in table C_ElementValue).
 * <br>
 * Help: {@literal The individual valid values for the Element.  The values must conform to the format
     *       defined.  If the Element is an Account Type then the Account Classification (Asset, Liability etc)
     *       and posting controls are also defined}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ElementValue extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ElementValue";
    public static final String ENTITY_NAME = "FinancialMgmtElementValue";

    /**
     * Property id stored in column C_ElementValue_ID in table C_ElementValue<br>
     * Help: {@literal Account Elements can be natural accounts or user defined values.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ElementValue 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ElementValue 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_ElementValue 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ElementValue 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_ElementValue 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ElementValue 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_ElementValue 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table C_ElementValue 
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table C_ElementValue 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_ElementValue<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property accountType stored in column AccountType in table C_ElementValue<br>
     * Help: {@literal Valid account types are A - Asset, E - Expense, L - Liability, O- Owner Equity, R -Revenue
     *       and M- Memo.  The account type is used to determine what taxes, if any are applicable, validating
     *       payables and receivables for business partners.  Note:  Memo account amounts are ignored when
     *       checking for balancing}
     * 
     */
    public static final String PROPERTY_ACCOUNTTYPE = "accountType";

    /**
     * Property accountSign stored in column AccountSign in table C_ElementValue<br>
     * Help: {@literal Indicates if the expected balance for this account should be a Debit or a Credit.}
     * 
     */
    public static final String PROPERTY_ACCOUNTSIGN = "accountSign";

    /**
     * Property documentControlled stored in column IsDocControlled in table C_ElementValue<br>
     * Help: {@literal Control account - If an account is controlled by a document, you cannot post manually to
     *       it}
     * 
     */
    public static final String PROPERTY_DOCUMENTCONTROLLED = "documentControlled";

    /**
     * Property accountingElement stored in column C_Element_ID in table C_ElementValue<br>
     * Help: {@literal The Account Tree uniquely identifies the Account Tree, also known as Chart of Accounts,
     *       linked to the Accounting Schema.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGELEMENT = "accountingElement";

    /**
     * Property summaryLevel stored in column IsSummary in table C_ElementValue<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property validFromDate stored in column ValidFrom in table C_ElementValue<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property validToDate stored in column ValidTo in table C_ElementValue<br>
     * Help: {@literal The Valid To date indicates the last day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDTODATE = "validToDate";

    /**
     * Property postActual stored in column PostActual in table C_ElementValue<br>
     * Help: {@literal The Post Actual indicates if actual values can be posted to this element value.}
     * 
     */
    public static final String PROPERTY_POSTACTUAL = "postActual";

    /**
     * Property postBudget stored in column PostBudget in table C_ElementValue<br>
     * Help: {@literal The Post Budget indicates if budget values can be posted to this element value.}
     * 
     */
    public static final String PROPERTY_POSTBUDGET = "postBudget";

    /**
     * Property postEncumbrance stored in column PostEncumbrance in table C_ElementValue<br>
     * Help: {@literal Post commitments to this account}
     * 
     */
    public static final String PROPERTY_POSTENCUMBRANCE = "postEncumbrance";

    /**
     * Property postStatistical stored in column PostStatistical in table C_ElementValue<br>
     * Help: {@literal Post statistical quantities to this account?}
     * 
     */
    public static final String PROPERTY_POSTSTATISTICAL = "postStatistical";

    /**
     * Property isBankAccount stored in column IsBankAccount in table C_ElementValue<br>
     * Help: {@literal The Bank Account checkbox indicates if this is account is the bank account.}
     * 
     */
    public static final String PROPERTY_ISBANKACCOUNT = "isBankAccount";

    /**
     * Property bankAccount stored in column C_BankAccount_ID in table C_ElementValue<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property foreignCurrencyAccount stored in column IsForeignCurrency in table C_ElementValue<br>
     * Help: {@literal Balances in foreign currency accounts are held in the nominated currency and translated to
     *       functional currency}
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCYACCOUNT = "foreignCurrencyAccount";

    /**
     * Property currency stored in column C_Currency_ID in table C_ElementValue<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property elementShown stored in column ShowElement in table C_ElementValue<br>
     * Help: {@literal Displays this element.}
     * 
     */
    public static final String PROPERTY_ELEMENTSHOWN = "elementShown";

    /**
     * Property showValueCondition stored in column ShowValueCond in table C_ElementValue<br>
     * Help: {@literal Condition to show value. when algebraic it is always displayed, when positive it is shown
     *       only if the amount is positive and when negative it is shown only if the amount is negative.}
     * 
     */
    public static final String PROPERTY_SHOWVALUECONDITION = "showValueCondition";

    /**
     * Property elementLevel stored in column ElementLevel in table C_ElementValue<br>
     * Help: {@literal Indicates the level of the account (heading, account, breakdown or subaccount).}
     * 
     */
    public static final String PROPERTY_ELEMENTLEVEL = "elementLevel";

    /**
     * Property titleNode stored in column Isalwaysshown in table C_ElementValue<br>
     * Help: {@literal A node flagged as "Title Node", will always be displayed in the report, even if the
     *       balance is 0, and the "Show only accounts with value" is flagged.}
     * 
     */
    public static final String PROPERTY_TITLENODE = "titleNode";

    /**
     * Property financialMgmtAcctSchemaElementList stored in table C_ElementValue
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST = "financialMgmtAcctSchemaElementList";

    /**
     * Property financialMgmtElementValueTrlList stored in table C_ElementValue
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTELEMENTVALUETRLLIST = "financialMgmtElementValueTrlList";


    public ElementValue() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ACCOUNTTYPE, "E");
        setDefaultValue(PROPERTY_ACCOUNTSIGN, "N");
        setDefaultValue(PROPERTY_DOCUMENTCONTROLLED, false);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_POSTACTUAL, true);
        setDefaultValue(PROPERTY_POSTBUDGET, true);
        setDefaultValue(PROPERTY_POSTENCUMBRANCE, true);
        setDefaultValue(PROPERTY_POSTSTATISTICAL, true);
        setDefaultValue(PROPERTY_ISBANKACCOUNT, false);
        setDefaultValue(PROPERTY_FOREIGNCURRENCYACCOUNT, false);
        setDefaultValue(PROPERTY_ELEMENTSHOWN, true);
        setDefaultValue(PROPERTY_SHOWVALUECONDITION, "A");
        setDefaultValue(PROPERTY_ELEMENTLEVEL, "S");
        setDefaultValue(PROPERTY_TITLENODE, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTELEMENTVALUETRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ElementValue#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ElementValue#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ElementValue#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ElementValue#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ElementValue#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ElementValue#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ElementValue#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ElementValue#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ElementValue#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ElementValue#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ElementValue#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ElementValue#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ElementValue#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ElementValue#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ElementValue#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ElementValue#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ElementValue#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ElementValue#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ElementValue#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ElementValue#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ElementValue#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ElementValue#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ElementValue#PROPERTY_ACCOUNTTYPE
     * 
     */
    public String getAccountType() {
        return (String) get(PROPERTY_ACCOUNTTYPE);
    }
    /**
     * @see ElementValue#PROPERTY_ACCOUNTTYPE
     * 
     */
    public void setAccountType(String accountType) {
        set(PROPERTY_ACCOUNTTYPE, accountType);
    }

    /**
     * @see ElementValue#PROPERTY_ACCOUNTSIGN
     * 
     */
    public String getAccountSign() {
        return (String) get(PROPERTY_ACCOUNTSIGN);
    }
    /**
     * @see ElementValue#PROPERTY_ACCOUNTSIGN
     * 
     */
    public void setAccountSign(String accountSign) {
        set(PROPERTY_ACCOUNTSIGN, accountSign);
    }

    /**
     * @see ElementValue#PROPERTY_DOCUMENTCONTROLLED
     * 
     */
    public Boolean isDocumentControlled() {
        return (Boolean) get(PROPERTY_DOCUMENTCONTROLLED);
    }
    /**
     * @see ElementValue#PROPERTY_DOCUMENTCONTROLLED
     * 
     */
    public void setDocumentControlled(Boolean documentControlled) {
        set(PROPERTY_DOCUMENTCONTROLLED, documentControlled);
    }

    /**
     * @see ElementValue#PROPERTY_ACCOUNTINGELEMENT
     * 
     */
    public Element getAccountingElement() {
        return (Element) get(PROPERTY_ACCOUNTINGELEMENT);
    }
    /**
     * @see ElementValue#PROPERTY_ACCOUNTINGELEMENT
     * 
     */
    public void setAccountingElement(Element accountingElement) {
        set(PROPERTY_ACCOUNTINGELEMENT, accountingElement);
    }

    /**
     * @see ElementValue#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see ElementValue#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see ElementValue#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see ElementValue#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see ElementValue#PROPERTY_VALIDTODATE
     * 
     */
    public Date getValidToDate() {
        return (Date) get(PROPERTY_VALIDTODATE);
    }
    /**
     * @see ElementValue#PROPERTY_VALIDTODATE
     * 
     */
    public void setValidToDate(Date validToDate) {
        set(PROPERTY_VALIDTODATE, validToDate);
    }

    /**
     * @see ElementValue#PROPERTY_POSTACTUAL
     * 
     */
    public Boolean isPostActual() {
        return (Boolean) get(PROPERTY_POSTACTUAL);
    }
    /**
     * @see ElementValue#PROPERTY_POSTACTUAL
     * 
     */
    public void setPostActual(Boolean postActual) {
        set(PROPERTY_POSTACTUAL, postActual);
    }

    /**
     * @see ElementValue#PROPERTY_POSTBUDGET
     * 
     */
    public Boolean isPostBudget() {
        return (Boolean) get(PROPERTY_POSTBUDGET);
    }
    /**
     * @see ElementValue#PROPERTY_POSTBUDGET
     * 
     */
    public void setPostBudget(Boolean postBudget) {
        set(PROPERTY_POSTBUDGET, postBudget);
    }

    /**
     * @see ElementValue#PROPERTY_POSTENCUMBRANCE
     * 
     */
    public Boolean isPostEncumbrance() {
        return (Boolean) get(PROPERTY_POSTENCUMBRANCE);
    }
    /**
     * @see ElementValue#PROPERTY_POSTENCUMBRANCE
     * 
     */
    public void setPostEncumbrance(Boolean postEncumbrance) {
        set(PROPERTY_POSTENCUMBRANCE, postEncumbrance);
    }

    /**
     * @see ElementValue#PROPERTY_POSTSTATISTICAL
     * 
     */
    public Boolean isPostStatistical() {
        return (Boolean) get(PROPERTY_POSTSTATISTICAL);
    }
    /**
     * @see ElementValue#PROPERTY_POSTSTATISTICAL
     * 
     */
    public void setPostStatistical(Boolean postStatistical) {
        set(PROPERTY_POSTSTATISTICAL, postStatistical);
    }

    /**
     * @see ElementValue#PROPERTY_ISBANKACCOUNT
     * 
     */
    public Boolean isBankAccount() {
        return (Boolean) get(PROPERTY_ISBANKACCOUNT);
    }
    /**
     * @see ElementValue#PROPERTY_ISBANKACCOUNT
     * 
     */
    public void setBankAccount(Boolean isBankAccount) {
        set(PROPERTY_ISBANKACCOUNT, isBankAccount);
    }

    /**
     * @see ElementValue#PROPERTY_BANKACCOUNT
     * 
     */
    public BankAccount getBankAccount() {
        return (BankAccount) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see ElementValue#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(BankAccount bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see ElementValue#PROPERTY_FOREIGNCURRENCYACCOUNT
     * 
     */
    public Boolean isForeignCurrencyAccount() {
        return (Boolean) get(PROPERTY_FOREIGNCURRENCYACCOUNT);
    }
    /**
     * @see ElementValue#PROPERTY_FOREIGNCURRENCYACCOUNT
     * 
     */
    public void setForeignCurrencyAccount(Boolean foreignCurrencyAccount) {
        set(PROPERTY_FOREIGNCURRENCYACCOUNT, foreignCurrencyAccount);
    }

    /**
     * @see ElementValue#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see ElementValue#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see ElementValue#PROPERTY_ELEMENTSHOWN
     * 
     */
    public Boolean isElementShown() {
        return (Boolean) get(PROPERTY_ELEMENTSHOWN);
    }
    /**
     * @see ElementValue#PROPERTY_ELEMENTSHOWN
     * 
     */
    public void setElementShown(Boolean elementShown) {
        set(PROPERTY_ELEMENTSHOWN, elementShown);
    }

    /**
     * @see ElementValue#PROPERTY_SHOWVALUECONDITION
     * 
     */
    public String getShowValueCondition() {
        return (String) get(PROPERTY_SHOWVALUECONDITION);
    }
    /**
     * @see ElementValue#PROPERTY_SHOWVALUECONDITION
     * 
     */
    public void setShowValueCondition(String showValueCondition) {
        set(PROPERTY_SHOWVALUECONDITION, showValueCondition);
    }

    /**
     * @see ElementValue#PROPERTY_ELEMENTLEVEL
     * 
     */
    public String getElementLevel() {
        return (String) get(PROPERTY_ELEMENTLEVEL);
    }
    /**
     * @see ElementValue#PROPERTY_ELEMENTLEVEL
     * 
     */
    public void setElementLevel(String elementLevel) {
        set(PROPERTY_ELEMENTLEVEL, elementLevel);
    }

    /**
     * @see ElementValue#PROPERTY_TITLENODE
     * 
     */
    public Boolean isTitleNode() {
        return (Boolean) get(PROPERTY_TITLENODE);
    }
    /**
     * @see ElementValue#PROPERTY_TITLENODE
     * 
     */
    public void setTitleNode(Boolean titleNode) {
        set(PROPERTY_TITLENODE, titleNode);
    }

    /**
     * Help: {@literal The Account Schema Element defines the elements that comprise the account key. A name is
     *       defined which will display in documents.  Also the order of the elements and if they are balanced
     *       and mandatory are indicated.}<br>
     * @see AcctSchemaElement
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AcctSchemaElement> getFinancialMgmtAcctSchemaElementList() {
      return (List<AcctSchemaElement>) get(PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST);
    }

    /**
     * Help: {@literal The Account Schema Element defines the elements that comprise the account key. A name is
     *       defined which will display in documents.  Also the order of the elements and if they are balanced
     *       and mandatory are indicated.}<br>
     * @see AcctSchemaElement
     * 
     */
    public void setFinancialMgmtAcctSchemaElementList(List<AcctSchemaElement> financialMgmtAcctSchemaElementList) {
        set(PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST, financialMgmtAcctSchemaElementList);
    }

    /**
     * Help: {@literal Defines the translation of the element value to an alternate language}<br>
     * @see ElementValueTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ElementValueTrl> getFinancialMgmtElementValueTrlList() {
      return (List<ElementValueTrl>) get(PROPERTY_FINANCIALMGMTELEMENTVALUETRLLIST);
    }

    /**
     * Help: {@literal Defines the translation of the element value to an alternate language}<br>
     * @see ElementValueTrl
     * 
     */
    public void setFinancialMgmtElementValueTrlList(List<ElementValueTrl> financialMgmtElementValueTrlList) {
        set(PROPERTY_FINANCIALMGMTELEMENTVALUETRLLIST, financialMgmtElementValueTrlList);
    }

}
