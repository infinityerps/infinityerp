
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtAcctSchemaGL (stored in table C_AcctSchema_GL).
 * <br>
 * Help: {@literal The General Ledger defines error and balance handling to use as well as  the necessary
     *       accounts for posting to General Ledger.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AcctSchemaGL extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_AcctSchema_GL";
    public static final String ENTITY_NAME = "FinancialMgmtAcctSchemaGL";

    /**
     * Property id stored in column C_Acctschema_Gl_ID in table C_AcctSchema_GL 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_AcctSchema_GL<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table C_AcctSchema_GL 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_AcctSchema_GL 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_AcctSchema_GL 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_AcctSchema_GL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_AcctSchema_GL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_AcctSchema_GL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_AcctSchema_GL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property suspenseBalancingUse stored in column UseSuspenseBalancing in table C_AcctSchema_GL<br>
     * Help: {@literal Use Suspense Balancing}
     * 
     */
    public static final String PROPERTY_SUSPENSEBALANCINGUSE = "suspenseBalancingUse";

    /**
     * Property suspenseBalancing stored in column SuspenseBalancing_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal Account used for suspense balancing}
     * 
     */
    public static final String PROPERTY_SUSPENSEBALANCING = "suspenseBalancing";

    /**
     * Property suspenseErrorUse stored in column UseSuspenseError in table C_AcctSchema_GL<br>
     * Help: {@literal Use Suspense Error}
     * 
     */
    public static final String PROPERTY_SUSPENSEERRORUSE = "suspenseErrorUse";

    /**
     * Property suspenseError stored in column SuspenseError_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal Accout used for suspense error}
     * 
     */
    public static final String PROPERTY_SUSPENSEERROR = "suspenseError";

    /**
     * Property currencyBalancingUse stored in column UseCurrencyBalancing in table C_AcctSchema_GL<br>
     * Help: {@literal Use Currency Balancing}
     * 
     */
    public static final String PROPERTY_CURRENCYBALANCINGUSE = "currencyBalancingUse";

    /**
     * Property currencyBalancingAcct stored in column CurrencyBalancing_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal The Currency Balancing Account indicates the account to used when a currency is out of
     *       balance (generally due to rounding)}
     * 
     */
    public static final String PROPERTY_CURRENCYBALANCINGACCT = "currencyBalancingAcct";

    /**
     * Property retainedEarning stored in column RetainedEarning_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal Account used for retained earning}
     * 
     */
    public static final String PROPERTY_RETAINEDEARNING = "retainedEarning";

    /**
     * Property incomeSummary stored in column IncomeSummary_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal Account used for income summary}
     * 
     */
    public static final String PROPERTY_INCOMESUMMARY = "incomeSummary";

    /**
     * Property dueToIntercompany stored in column IntercompanyDueTo_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal The Intercompany Due To Account indicates the account that represents money owed to other
     *       organizations.}
     * 
     */
    public static final String PROPERTY_DUETOINTERCOMPANY = "dueToIntercompany";

    /**
     * Property dueFromIntercompany stored in column IntercompanyDueFrom_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal The Intercompany Due From account indicates the account that represents money owed to this
     *       organization from other organizations.}
     * 
     */
    public static final String PROPERTY_DUEFROMINTERCOMPANY = "dueFromIntercompany";

    /**
     * Property pPVOffset stored in column PPVOffset_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal Offset account for standard costing purchase price variances. The counter account is
     *       Product PPV.}
     * 
     */
    public static final String PROPERTY_PPVOFFSET = "pPVOffset";

    /**
     * Property cFSOrderAccount stored in column CFS_Order_Acct in table C_AcctSchema_GL<br>
     * Help: {@literal Account used in cash flow statement for entries related to orders, which have no entries
     *       in accounting.}
     * 
     */
    public static final String PROPERTY_CFSORDERACCOUNT = "cFSOrderAccount";

    /**
     * Property createClosing stored in column CreateClosing in table C_AcctSchema_GL<br>
     * Help: {@literal When launching end year closing entry, include an entry to reverse permanent account
     *       balances}
     * 
     */
    public static final String PROPERTY_CREATECLOSING = "createClosing";


    public AcctSchemaGL() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUSPENSEBALANCINGUSE, false);
        setDefaultValue(PROPERTY_SUSPENSEERRORUSE, false);
        setDefaultValue(PROPERTY_CURRENCYBALANCINGUSE, false);
        setDefaultValue(PROPERTY_CREATECLOSING, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AcctSchemaGL#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEBALANCINGUSE
     * 
     */
    public Boolean isSuspenseBalancingUse() {
        return (Boolean) get(PROPERTY_SUSPENSEBALANCINGUSE);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEBALANCINGUSE
     * 
     */
    public void setSuspenseBalancingUse(Boolean suspenseBalancingUse) {
        set(PROPERTY_SUSPENSEBALANCINGUSE, suspenseBalancingUse);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEBALANCING
     * 
     */
    public AccountingCombination getSuspenseBalancing() {
        return (AccountingCombination) get(PROPERTY_SUSPENSEBALANCING);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEBALANCING
     * 
     */
    public void setSuspenseBalancing(AccountingCombination suspenseBalancing) {
        set(PROPERTY_SUSPENSEBALANCING, suspenseBalancing);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEERRORUSE
     * 
     */
    public Boolean isSuspenseErrorUse() {
        return (Boolean) get(PROPERTY_SUSPENSEERRORUSE);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEERRORUSE
     * 
     */
    public void setSuspenseErrorUse(Boolean suspenseErrorUse) {
        set(PROPERTY_SUSPENSEERRORUSE, suspenseErrorUse);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEERROR
     * 
     */
    public AccountingCombination getSuspenseError() {
        return (AccountingCombination) get(PROPERTY_SUSPENSEERROR);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_SUSPENSEERROR
     * 
     */
    public void setSuspenseError(AccountingCombination suspenseError) {
        set(PROPERTY_SUSPENSEERROR, suspenseError);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_CURRENCYBALANCINGUSE
     * 
     */
    public Boolean isCurrencyBalancingUse() {
        return (Boolean) get(PROPERTY_CURRENCYBALANCINGUSE);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_CURRENCYBALANCINGUSE
     * 
     */
    public void setCurrencyBalancingUse(Boolean currencyBalancingUse) {
        set(PROPERTY_CURRENCYBALANCINGUSE, currencyBalancingUse);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_CURRENCYBALANCINGACCT
     * 
     */
    public AccountingCombination getCurrencyBalancingAcct() {
        return (AccountingCombination) get(PROPERTY_CURRENCYBALANCINGACCT);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_CURRENCYBALANCINGACCT
     * 
     */
    public void setCurrencyBalancingAcct(AccountingCombination currencyBalancingAcct) {
        set(PROPERTY_CURRENCYBALANCINGACCT, currencyBalancingAcct);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_RETAINEDEARNING
     * 
     */
    public AccountingCombination getRetainedEarning() {
        return (AccountingCombination) get(PROPERTY_RETAINEDEARNING);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_RETAINEDEARNING
     * 
     */
    public void setRetainedEarning(AccountingCombination retainedEarning) {
        set(PROPERTY_RETAINEDEARNING, retainedEarning);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_INCOMESUMMARY
     * 
     */
    public AccountingCombination getIncomeSummary() {
        return (AccountingCombination) get(PROPERTY_INCOMESUMMARY);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_INCOMESUMMARY
     * 
     */
    public void setIncomeSummary(AccountingCombination incomeSummary) {
        set(PROPERTY_INCOMESUMMARY, incomeSummary);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_DUETOINTERCOMPANY
     * 
     */
    public AccountingCombination getDueToIntercompany() {
        return (AccountingCombination) get(PROPERTY_DUETOINTERCOMPANY);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_DUETOINTERCOMPANY
     * 
     */
    public void setDueToIntercompany(AccountingCombination dueToIntercompany) {
        set(PROPERTY_DUETOINTERCOMPANY, dueToIntercompany);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_DUEFROMINTERCOMPANY
     * 
     */
    public AccountingCombination getDueFromIntercompany() {
        return (AccountingCombination) get(PROPERTY_DUEFROMINTERCOMPANY);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_DUEFROMINTERCOMPANY
     * 
     */
    public void setDueFromIntercompany(AccountingCombination dueFromIntercompany) {
        set(PROPERTY_DUEFROMINTERCOMPANY, dueFromIntercompany);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_PPVOFFSET
     * 
     */
    public AccountingCombination getPPVOffset() {
        return (AccountingCombination) get(PROPERTY_PPVOFFSET);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_PPVOFFSET
     * 
     */
    public void setPPVOffset(AccountingCombination pPVOffset) {
        set(PROPERTY_PPVOFFSET, pPVOffset);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_CFSORDERACCOUNT
     * 
     */
    public AccountingCombination getCFSOrderAccount() {
        return (AccountingCombination) get(PROPERTY_CFSORDERACCOUNT);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_CFSORDERACCOUNT
     * 
     */
    public void setCFSOrderAccount(AccountingCombination cFSOrderAccount) {
        set(PROPERTY_CFSORDERACCOUNT, cFSOrderAccount);
    }

    /**
     * @see AcctSchemaGL#PROPERTY_CREATECLOSING
     * 
     */
    public Boolean isCreateClosing() {
        return (Boolean) get(PROPERTY_CREATECLOSING);
    }
    /**
     * @see AcctSchemaGL#PROPERTY_CREATECLOSING
     * 
     */
    public void setCreateClosing(Boolean createClosing) {
        set(PROPERTY_CREATECLOSING, createClosing);
    }

}
