
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
package org.openbravo.advpaymentmngt;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Location;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.calendar.Period;
import org.openbravo.model.financialmgmt.gl.GLCategory;
import org.openbravo.model.financialmgmt.payment.FIN_FinaccTransaction;
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.tax.TaxRate;
import org.openbravo.model.financialmgmt.tax.Withholding;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity APRM_FinAcc_Transaction_acct_v (stored in table APRM_FinAcc_Transaction_acct_v).
 * <br>
 * Help: {@literal Accounting entries related to a particular financial account}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FinAccTransactionAccounting extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "APRM_FinAcc_Transaction_acct_v";
    public static final String ENTITY_NAME = "APRM_FinAcc_Transaction_acct_v";

    /**
     * Property id stored in column FIN_Finacc_Transaction_Acct_ID in table APRM_FinAcc_Transaction_acct_v 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table APRM_FinAcc_Transaction_acct_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table APRM_FinAcc_Transaction_acct_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table APRM_FinAcc_Transaction_acct_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table APRM_FinAcc_Transaction_acct_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table APRM_FinAcc_Transaction_acct_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table APRM_FinAcc_Transaction_acct_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table APRM_FinAcc_Transaction_acct_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property accountingSchema stored in column C_Acctschema_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property accountElement stored in column C_Elementvalue_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Account Elements can be natural accounts or user defined values.}
     * 
     */
    public static final String PROPERTY_ACCOUNTELEMENT = "accountElement";

    /**
     * Property transactionDate stored in column Datetrx in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Transaction Date indicates the date of the transaction.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property accountingDate stored in column Dateacct in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property period stored in column C_Period_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";

    /**
     * Property table stored in column AD_Table_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property financialAccountTransaction stored in column FIN_Finacc_Transaction_ID in table APRM_FinAcc_Transaction_acct_v
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNTTRANSACTION = "financialAccountTransaction";

    /**
     * Property financialAccount stored in column FIN_Financial_Account_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNT = "financialAccount";

    /**
     * Property gLCategory stored in column GL_Category_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The General Ledger Category is an optional, user defined method of grouping journal
     *       lines.}
     * 
     */
    public static final String PROPERTY_GLCATEGORY = "gLCategory";

    /**
     * Property tax stored in column C_Tax_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property storageBin stored in column M_Locator_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property postingType stored in column Postingtype in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Posting Type indicates the type of amount (Actual, Encumbrance, Budget) this journal
     *       updated.}
     * 
     */
    public static final String PROPERTY_POSTINGTYPE = "postingType";

    /**
     * Property currency stored in column C_Currency_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property foreignCurrencyDebit stored in column Amtsourcedr in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Source Debit Amount indicates the credit amount for this line in the source currency.}
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCYDEBIT = "foreignCurrencyDebit";

    /**
     * Property foreignCurrencyCredit stored in column Amtsourcecr in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Source Credit Amount indicates the credit amount for this line in the source
     *       currency.}
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCYCREDIT = "foreignCurrencyCredit";

    /**
     * Property debit stored in column Amtacctdr in table APRM_FinAcc_Transaction_acct_v 
     * 
     */
    public static final String PROPERTY_DEBIT = "debit";

    /**
     * Property credit stored in column Amtacctcr in table APRM_FinAcc_Transaction_acct_v 
     * 
     */
    public static final String PROPERTY_CREDIT = "credit";

    /**
     * Property uOM stored in column C_Uom_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property quantity stored in column Qty in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property product stored in column M_Product_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property trxOrganization stored in column AD_Orgtrx_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property locationFromAddress stored in column C_Locfrom_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Location From indicates the location that a product was moved from.}
     * 
     */
    public static final String PROPERTY_LOCATIONFROMADDRESS = "locationFromAddress";

    /**
     * Property locationToAddress stored in column C_Locto_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Location To indicates the location that a product was moved to.}
     * 
     */
    public static final String PROPERTY_LOCATIONTOADDRESS = "locationToAddress";

    /**
     * Property salesRegion stored in column C_Salesregion_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property project stored in column C_Project_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property description stored in column Description in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property asset stored in column A_Asset_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property groupID stored in column Fact_Acct_Group_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Accounting entry group ID. Used to group a set of entries}
     * 
     */
    public static final String PROPERTY_GROUPID = "groupID";

    /**
     * Property sequenceNumber stored in column Seqno in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property type stored in column Factaccttype in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Type of entry (Normal, Closing, Opening, Regularization)}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property documentCategory stored in column Docbasetype in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Document Base Type identifies the base or starting point for a document.  Multiple
     *       document types may share a single document base type.}
     * 
     */
    public static final String PROPERTY_DOCUMENTCATEGORY = "documentCategory";

    /**
     * Property value stored in column Acctvalue in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Value of the account used in the entry.}
     * 
     */
    public static final String PROPERTY_VALUE = "value";

    /**
     * Property accountingEntryDescription stored in column Acctdescription in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Description of the accounting entry}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGENTRYDESCRIPTION = "accountingEntryDescription";

    /**
     * Property withholding stored in column C_Withholding_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property financialAccountTransactionV stored in column Aprm_Finacc_Transaction_V_ID in table APRM_FinAcc_Transaction_acct_v
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNTTRANSACTIONV = "financialAccountTransactionV";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table APRM_FinAcc_Transaction_acct_v<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";


    public FinAccTransactionAccounting() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTELEMENT
     * 
     */
    public ElementValue getAccountElement() {
        return (ElementValue) get(PROPERTY_ACCOUNTELEMENT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTELEMENT
     * 
     */
    public void setAccountElement(ElementValue accountElement) {
        set(PROPERTY_ACCOUNTELEMENT, accountElement);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public FIN_FinaccTransaction getFinancialAccountTransaction() {
        return (FIN_FinaccTransaction) get(PROPERTY_FINANCIALACCOUNTTRANSACTION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public void setFinancialAccountTransaction(FIN_FinaccTransaction financialAccountTransaction) {
        set(PROPERTY_FINANCIALACCOUNTTRANSACTION, financialAccountTransaction);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public FIN_FinancialAccount getFinancialAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_FINANCIALACCOUNT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public void setFinancialAccount(FIN_FinancialAccount financialAccount) {
        set(PROPERTY_FINANCIALACCOUNT, financialAccount);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_GLCATEGORY
     * 
     */
    public GLCategory getGLCategory() {
        return (GLCategory) get(PROPERTY_GLCATEGORY);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_GLCATEGORY
     * 
     */
    public void setGLCategory(GLCategory gLCategory) {
        set(PROPERTY_GLCATEGORY, gLCategory);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_POSTINGTYPE
     * 
     */
    public String getPostingType() {
        return (String) get(PROPERTY_POSTINGTYPE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_POSTINGTYPE
     * 
     */
    public void setPostingType(String postingType) {
        set(PROPERTY_POSTINGTYPE, postingType);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_FOREIGNCURRENCYDEBIT
     * 
     */
    public BigDecimal getForeignCurrencyDebit() {
        return (BigDecimal) get(PROPERTY_FOREIGNCURRENCYDEBIT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_FOREIGNCURRENCYDEBIT
     * 
     */
    public void setForeignCurrencyDebit(BigDecimal foreignCurrencyDebit) {
        set(PROPERTY_FOREIGNCURRENCYDEBIT, foreignCurrencyDebit);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_FOREIGNCURRENCYCREDIT
     * 
     */
    public BigDecimal getForeignCurrencyCredit() {
        return (BigDecimal) get(PROPERTY_FOREIGNCURRENCYCREDIT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_FOREIGNCURRENCYCREDIT
     * 
     */
    public void setForeignCurrencyCredit(BigDecimal foreignCurrencyCredit) {
        set(PROPERTY_FOREIGNCURRENCYCREDIT, foreignCurrencyCredit);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_DEBIT
     * 
     */
    public BigDecimal getDebit() {
        return (BigDecimal) get(PROPERTY_DEBIT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_DEBIT
     * 
     */
    public void setDebit(BigDecimal debit) {
        set(PROPERTY_DEBIT, debit);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_CREDIT
     * 
     */
    public BigDecimal getCredit() {
        return (BigDecimal) get(PROPERTY_CREDIT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_CREDIT
     * 
     */
    public void setCredit(BigDecimal credit) {
        set(PROPERTY_CREDIT, credit);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_LOCATIONFROMADDRESS
     * 
     */
    public Location getLocationFromAddress() {
        return (Location) get(PROPERTY_LOCATIONFROMADDRESS);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_LOCATIONFROMADDRESS
     * 
     */
    public void setLocationFromAddress(Location locationFromAddress) {
        set(PROPERTY_LOCATIONFROMADDRESS, locationFromAddress);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_LOCATIONTOADDRESS
     * 
     */
    public Location getLocationToAddress() {
        return (Location) get(PROPERTY_LOCATIONTOADDRESS);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_LOCATIONTOADDRESS
     * 
     */
    public void setLocationToAddress(Location locationToAddress) {
        set(PROPERTY_LOCATIONTOADDRESS, locationToAddress);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_GROUPID
     * 
     */
    public String getGroupID() {
        return (String) get(PROPERTY_GROUPID);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_GROUPID
     * 
     */
    public void setGroupID(String groupID) {
        set(PROPERTY_GROUPID, groupID);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public String getDocumentCategory() {
        return (String) get(PROPERTY_DOCUMENTCATEGORY);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public void setDocumentCategory(String documentCategory) {
        set(PROPERTY_DOCUMENTCATEGORY, documentCategory);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_VALUE
     * 
     */
    public String getValue() {
        return (String) get(PROPERTY_VALUE);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_VALUE
     * 
     */
    public void setValue(String value) {
        set(PROPERTY_VALUE, value);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTINGENTRYDESCRIPTION
     * 
     */
    public String getAccountingEntryDescription() {
        return (String) get(PROPERTY_ACCOUNTINGENTRYDESCRIPTION);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_ACCOUNTINGENTRYDESCRIPTION
     * 
     */
    public void setAccountingEntryDescription(String accountingEntryDescription) {
        set(PROPERTY_ACCOUNTINGENTRYDESCRIPTION, accountingEntryDescription);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_FINANCIALACCOUNTTRANSACTIONV
     * 
     */
    public APRM_FinaccTransactionV getFinancialAccountTransactionV() {
        return (APRM_FinaccTransactionV) get(PROPERTY_FINANCIALACCOUNTTRANSACTIONV);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_FINANCIALACCOUNTTRANSACTIONV
     * 
     */
    public void setFinancialAccountTransactionV(APRM_FinaccTransactionV financialAccountTransactionV) {
        set(PROPERTY_FINANCIALACCOUNTTRANSACTIONV, financialAccountTransactionV);
    }

    /**
     * @see FinAccTransactionAccounting#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see FinAccTransactionAccounting#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

}
