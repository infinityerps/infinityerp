
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
package org.openbravo.model.financialmgmt.tax;

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
 * Entity class for entity FinancialMgmtTaxRateAccounts (stored in table C_Tax_Acct).
 * <br>
 * Help: {@literal Defines the accounting parameters to be used for transactions referencing this Tax Rate.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TaxRateAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Tax_Acct";
    public static final String ENTITY_NAME = "FinancialMgmtTaxRateAccounts";

    /**
     * Property id stored in column C_Tax_Acct_ID in table C_Tax_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property tax stored in column C_Tax_ID in table C_Tax_Acct<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_Tax_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table C_Tax_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Tax_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Tax_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Tax_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Tax_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Tax_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Tax_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property taxDue stored in column T_Due_Acct in table C_Tax_Acct<br>
     * Help: {@literal The Tax Due Account indicates the account used to record taxes that you are liable to
     *       pay.}
     * 
     */
    public static final String PROPERTY_TAXDUE = "taxDue";

    /**
     * Property taxLiability stored in column T_Liability_Acct in table C_Tax_Acct<br>
     * Help: {@literal The Tax Liability Account indicates the account used to record your tax liability
     *       declaration.}
     * 
     */
    public static final String PROPERTY_TAXLIABILITY = "taxLiability";

    /**
     * Property taxCredit stored in column T_Credit_Acct in table C_Tax_Acct<br>
     * Help: {@literal The Tax Credit Account indicates the account used to record taxes that can be reclaimed}
     * 
     */
    public static final String PROPERTY_TAXCREDIT = "taxCredit";

    /**
     * Property taxReceivables stored in column T_Receivables_Acct in table C_Tax_Acct<br>
     * Help: {@literal The Tax Receivables Account indicates the account used to record the tax credit amount
     *       after your tax declaration.}
     * 
     */
    public static final String PROPERTY_TAXRECEIVABLES = "taxReceivables";

    /**
     * Property taxExpense stored in column T_Expense_Acct in table C_Tax_Acct<br>
     * Help: {@literal The Tax Expense Account indicates the account used to record the taxes that have been paid
     *       that cannot be reclaimed.}
     * 
     */
    public static final String PROPERTY_TAXEXPENSE = "taxExpense";

    /**
     * Property taxDueTransitory stored in column T_Due_Trans_Acct in table C_Tax_Acct<br>
     * Help: {@literal The Tax Due Transitory Account indicates the account used to record taxes that you are
     *       liable to pay for Cash VAT regime}
     * 
     */
    public static final String PROPERTY_TAXDUETRANSITORY = "taxDueTransitory";

    /**
     * Property taxCreditTransitory stored in column T_Credit_Trans_Acct in table C_Tax_Acct<br>
     * Help: {@literal The Tax Credit Transitory Account indicates the account used to record taxes for Cash VAT
     *       regime}
     * 
     */
    public static final String PROPERTY_TAXCREDITTRANSITORY = "taxCreditTransitory";


    public TaxRateAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TaxRateAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAXDUE
     * 
     */
    public AccountingCombination getTaxDue() {
        return (AccountingCombination) get(PROPERTY_TAXDUE);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAXDUE
     * 
     */
    public void setTaxDue(AccountingCombination taxDue) {
        set(PROPERTY_TAXDUE, taxDue);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAXLIABILITY
     * 
     */
    public AccountingCombination getTaxLiability() {
        return (AccountingCombination) get(PROPERTY_TAXLIABILITY);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAXLIABILITY
     * 
     */
    public void setTaxLiability(AccountingCombination taxLiability) {
        set(PROPERTY_TAXLIABILITY, taxLiability);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAXCREDIT
     * 
     */
    public AccountingCombination getTaxCredit() {
        return (AccountingCombination) get(PROPERTY_TAXCREDIT);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAXCREDIT
     * 
     */
    public void setTaxCredit(AccountingCombination taxCredit) {
        set(PROPERTY_TAXCREDIT, taxCredit);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAXRECEIVABLES
     * 
     */
    public AccountingCombination getTaxReceivables() {
        return (AccountingCombination) get(PROPERTY_TAXRECEIVABLES);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAXRECEIVABLES
     * 
     */
    public void setTaxReceivables(AccountingCombination taxReceivables) {
        set(PROPERTY_TAXRECEIVABLES, taxReceivables);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAXEXPENSE
     * 
     */
    public AccountingCombination getTaxExpense() {
        return (AccountingCombination) get(PROPERTY_TAXEXPENSE);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAXEXPENSE
     * 
     */
    public void setTaxExpense(AccountingCombination taxExpense) {
        set(PROPERTY_TAXEXPENSE, taxExpense);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAXDUETRANSITORY
     * 
     */
    public AccountingCombination getTaxDueTransitory() {
        return (AccountingCombination) get(PROPERTY_TAXDUETRANSITORY);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAXDUETRANSITORY
     * 
     */
    public void setTaxDueTransitory(AccountingCombination taxDueTransitory) {
        set(PROPERTY_TAXDUETRANSITORY, taxDueTransitory);
    }

    /**
     * @see TaxRateAccounts#PROPERTY_TAXCREDITTRANSITORY
     * 
     */
    public AccountingCombination getTaxCreditTransitory() {
        return (AccountingCombination) get(PROPERTY_TAXCREDITTRANSITORY);
    }
    /**
     * @see TaxRateAccounts#PROPERTY_TAXCREDITTRANSITORY
     * 
     */
    public void setTaxCreditTransitory(AccountingCombination taxCreditTransitory) {
        set(PROPERTY_TAXCREDITTRANSITORY, taxCreditTransitory);
    }

}
