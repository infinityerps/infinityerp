
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
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Location;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.calendar.Period;
import org.openbravo.model.financialmgmt.gl.GLCategory;
import org.openbravo.model.financialmgmt.tax.TaxRate;
import org.openbravo.model.financialmgmt.tax.Withholding;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity FinancialMgmtAccountingFact (stored in table Fact_Acct).
 * <br>
 * Help: {@literal Records accounting entries of all accounting schemas.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AccountingFact extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "Fact_Acct";
    public static final String ENTITY_NAME = "FinancialMgmtAccountingFact";

    /**
     * Property id stored in column Fact_Acct_ID in table Fact_Acct
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table Fact_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table Fact_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table Fact_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table Fact_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table Fact_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table Fact_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table Fact_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table Fact_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property account stored in column Account_ID in table Fact_Acct<br>
     * Help: {@literal The (natural) account used}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property transactionDate stored in column DateTrx in table Fact_Acct<br>
     * Help: {@literal The Transaction Date indicates the date of the transaction.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property accountingDate stored in column DateAcct in table Fact_Acct<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property period stored in column C_Period_ID in table Fact_Acct<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";

    /**
     * Property table stored in column AD_Table_ID in table Fact_Acct<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property recordID stored in column Record_ID in table Fact_Acct<br>
     * Help: {@literal The Record ID is the internal unique identifier of a record}
     * 
     */
    public static final String PROPERTY_RECORDID = "recordID";

    /**
     * Property lineID stored in column Line_ID in table Fact_Acct<br>
     * Help: {@literal Internal link}
     * 
     */
    public static final String PROPERTY_LINEID = "lineID";

    /**
     * Property gLCategory stored in column GL_Category_ID in table Fact_Acct<br>
     * Help: {@literal The General Ledger Category is an optional, user defined method of grouping journal
     *       lines.}
     * 
     */
    public static final String PROPERTY_GLCATEGORY = "gLCategory";

    /**
     * Property tax stored in column C_Tax_ID in table Fact_Acct<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property storageBin stored in column M_Locator_ID in table Fact_Acct<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property postingType stored in column PostingType in table Fact_Acct<br>
     * Help: {@literal The Posting Type indicates the type of amount (Actual, Encumbrance, Budget) this journal
     *       updated.}
     * 
     */
    public static final String PROPERTY_POSTINGTYPE = "postingType";

    /**
     * Property currency stored in column C_Currency_ID in table Fact_Acct<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property foreignCurrencyDebit stored in column AmtSourceDr in table Fact_Acct<br>
     * Help: {@literal The Source Debit Amount indicates the credit amount for this line in the source currency.}
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCYDEBIT = "foreignCurrencyDebit";

    /**
     * Property foreignCurrencyCredit stored in column AmtSourceCr in table Fact_Acct<br>
     * Help: {@literal The Source Credit Amount indicates the credit amount for this line in the source
     *       currency.}
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCYCREDIT = "foreignCurrencyCredit";

    /**
     * Property debit stored in column AmtAcctDr in table Fact_Acct<br>
     * Help: {@literal The Account Debit Amount indicates the transaction amount converted to this organization's
     *       accounting currency}
     * 
     */
    public static final String PROPERTY_DEBIT = "debit";

    /**
     * Property credit stored in column AmtAcctCr in table Fact_Acct<br>
     * Help: {@literal The Account Credit Amount indicates the transaction amount converted to this
     *       organization's accounting currency}
     * 
     */
    public static final String PROPERTY_CREDIT = "credit";

    /**
     * Property uOM stored in column C_UOM_ID in table Fact_Acct<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property quantity stored in column Qty in table Fact_Acct<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property product stored in column M_Product_ID in table Fact_Acct<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table Fact_Acct<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table Fact_Acct<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property locationFromAddress stored in column C_LocFrom_ID in table Fact_Acct<br>
     * Help: {@literal The Location From indicates the location that a product was moved from.}
     * 
     */
    public static final String PROPERTY_LOCATIONFROMADDRESS = "locationFromAddress";

    /**
     * Property locationToAddress stored in column C_LocTo_ID in table Fact_Acct<br>
     * Help: {@literal The Location To indicates the location that a product was moved to.}
     * 
     */
    public static final String PROPERTY_LOCATIONTOADDRESS = "locationToAddress";

    /**
     * Property salesRegion stored in column C_SalesRegion_ID in table Fact_Acct<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property project stored in column C_Project_ID in table Fact_Acct<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table Fact_Acct<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table Fact_Acct<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table Fact_Acct<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table Fact_Acct<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property description stored in column Description in table Fact_Acct 
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property asset stored in column A_Asset_ID in table Fact_Acct<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property groupID stored in column Fact_Acct_Group_ID in table Fact_Acct<br>
     * Help: {@literal Accounting entry group ID. Used to group a set of entries}
     * 
     */
    public static final String PROPERTY_GROUPID = "groupID";

    /**
     * Property sequenceNumber stored in column SeqNo in table Fact_Acct<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property type stored in column FactAcctType in table Fact_Acct<br>
     * Help: {@literal Type of entry (Normal, Closing, Opening, Regularization)}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property documentCategory stored in column DocBaseType in table Fact_Acct<br>
     * Help: {@literal The Document Base Type identifies the base or starting point for a document.  Multiple
     *       document types may share a single document base type.}
     * 
     */
    public static final String PROPERTY_DOCUMENTCATEGORY = "documentCategory";

    /**
     * Property value stored in column AcctValue in table Fact_Acct<br>
     * Help: {@literal Value of the account used in the entry.}
     * 
     */
    public static final String PROPERTY_VALUE = "value";

    /**
     * Property accountingEntryDescription stored in column AcctDescription in table Fact_Acct<br>
     * Help: {@literal Description of the accounting entry}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGENTRYDESCRIPTION = "accountingEntryDescription";

    /**
     * Property recordID2 stored in column Record_ID2 in table Fact_Acct<br>
     * Help: {@literal Payment the fact refers to.}
     * 
     */
    public static final String PROPERTY_RECORDID2 = "recordID2";

    /**
     * Property withholding stored in column C_Withholding_ID in table Fact_Acct<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property documentType stored in column C_Doctype_ID in table Fact_Acct<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table Fact_Acct<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property modify stored in column Ismodify in table Fact_Acct
     * 
     */
    public static final String PROPERTY_MODIFY = "modify";

    /**
     * Property dateBalanced stored in column Datebalanced in table Fact_Acct<br>
     * Help: {@literal Used for certain accounts to set the date on which the account gets balance equal zero.
     *       This is used to exclude entries which are no longer open items. Useful to reduce number of entries
     *       to be reviewed}
     * 
     */
    public static final String PROPERTY_DATEBALANCED = "dateBalanced";


    public AccountingFact() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TYPE, "N");
        setDefaultValue(PROPERTY_MODIFY, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AccountingFact#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AccountingFact#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AccountingFact#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AccountingFact#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AccountingFact#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AccountingFact#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AccountingFact#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AccountingFact#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AccountingFact#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AccountingFact#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AccountingFact#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AccountingFact#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AccountingFact#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AccountingFact#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AccountingFact#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AccountingFact#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AccountingFact#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AccountingFact#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AccountingFact#PROPERTY_ACCOUNT
     * 
     */
    public ElementValue getAccount() {
        return (ElementValue) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see AccountingFact#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(ElementValue account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see AccountingFact#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see AccountingFact#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see AccountingFact#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see AccountingFact#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see AccountingFact#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see AccountingFact#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    /**
     * @see AccountingFact#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see AccountingFact#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see AccountingFact#PROPERTY_RECORDID
     * 
     */
    public String getRecordID() {
        return (String) get(PROPERTY_RECORDID);
    }
    /**
     * @see AccountingFact#PROPERTY_RECORDID
     * 
     */
    public void setRecordID(String recordID) {
        set(PROPERTY_RECORDID, recordID);
    }

    /**
     * @see AccountingFact#PROPERTY_LINEID
     * 
     */
    public String getLineID() {
        return (String) get(PROPERTY_LINEID);
    }
    /**
     * @see AccountingFact#PROPERTY_LINEID
     * 
     */
    public void setLineID(String lineID) {
        set(PROPERTY_LINEID, lineID);
    }

    /**
     * @see AccountingFact#PROPERTY_GLCATEGORY
     * 
     */
    public GLCategory getGLCategory() {
        return (GLCategory) get(PROPERTY_GLCATEGORY);
    }
    /**
     * @see AccountingFact#PROPERTY_GLCATEGORY
     * 
     */
    public void setGLCategory(GLCategory gLCategory) {
        set(PROPERTY_GLCATEGORY, gLCategory);
    }

    /**
     * @see AccountingFact#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see AccountingFact#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see AccountingFact#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see AccountingFact#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see AccountingFact#PROPERTY_POSTINGTYPE
     * 
     */
    public String getPostingType() {
        return (String) get(PROPERTY_POSTINGTYPE);
    }
    /**
     * @see AccountingFact#PROPERTY_POSTINGTYPE
     * 
     */
    public void setPostingType(String postingType) {
        set(PROPERTY_POSTINGTYPE, postingType);
    }

    /**
     * @see AccountingFact#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see AccountingFact#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see AccountingFact#PROPERTY_FOREIGNCURRENCYDEBIT
     * 
     */
    public BigDecimal getForeignCurrencyDebit() {
        return (BigDecimal) get(PROPERTY_FOREIGNCURRENCYDEBIT);
    }
    /**
     * @see AccountingFact#PROPERTY_FOREIGNCURRENCYDEBIT
     * 
     */
    public void setForeignCurrencyDebit(BigDecimal foreignCurrencyDebit) {
        set(PROPERTY_FOREIGNCURRENCYDEBIT, foreignCurrencyDebit);
    }

    /**
     * @see AccountingFact#PROPERTY_FOREIGNCURRENCYCREDIT
     * 
     */
    public BigDecimal getForeignCurrencyCredit() {
        return (BigDecimal) get(PROPERTY_FOREIGNCURRENCYCREDIT);
    }
    /**
     * @see AccountingFact#PROPERTY_FOREIGNCURRENCYCREDIT
     * 
     */
    public void setForeignCurrencyCredit(BigDecimal foreignCurrencyCredit) {
        set(PROPERTY_FOREIGNCURRENCYCREDIT, foreignCurrencyCredit);
    }

    /**
     * @see AccountingFact#PROPERTY_DEBIT
     * 
     */
    public BigDecimal getDebit() {
        return (BigDecimal) get(PROPERTY_DEBIT);
    }
    /**
     * @see AccountingFact#PROPERTY_DEBIT
     * 
     */
    public void setDebit(BigDecimal debit) {
        set(PROPERTY_DEBIT, debit);
    }

    /**
     * @see AccountingFact#PROPERTY_CREDIT
     * 
     */
    public BigDecimal getCredit() {
        return (BigDecimal) get(PROPERTY_CREDIT);
    }
    /**
     * @see AccountingFact#PROPERTY_CREDIT
     * 
     */
    public void setCredit(BigDecimal credit) {
        set(PROPERTY_CREDIT, credit);
    }

    /**
     * @see AccountingFact#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see AccountingFact#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see AccountingFact#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see AccountingFact#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see AccountingFact#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see AccountingFact#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see AccountingFact#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see AccountingFact#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see AccountingFact#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see AccountingFact#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see AccountingFact#PROPERTY_LOCATIONFROMADDRESS
     * 
     */
    public Location getLocationFromAddress() {
        return (Location) get(PROPERTY_LOCATIONFROMADDRESS);
    }
    /**
     * @see AccountingFact#PROPERTY_LOCATIONFROMADDRESS
     * 
     */
    public void setLocationFromAddress(Location locationFromAddress) {
        set(PROPERTY_LOCATIONFROMADDRESS, locationFromAddress);
    }

    /**
     * @see AccountingFact#PROPERTY_LOCATIONTOADDRESS
     * 
     */
    public Location getLocationToAddress() {
        return (Location) get(PROPERTY_LOCATIONTOADDRESS);
    }
    /**
     * @see AccountingFact#PROPERTY_LOCATIONTOADDRESS
     * 
     */
    public void setLocationToAddress(Location locationToAddress) {
        set(PROPERTY_LOCATIONTOADDRESS, locationToAddress);
    }

    /**
     * @see AccountingFact#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see AccountingFact#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see AccountingFact#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see AccountingFact#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see AccountingFact#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see AccountingFact#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see AccountingFact#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see AccountingFact#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see AccountingFact#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see AccountingFact#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see AccountingFact#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see AccountingFact#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see AccountingFact#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AccountingFact#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AccountingFact#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see AccountingFact#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see AccountingFact#PROPERTY_GROUPID
     * 
     */
    public String getGroupID() {
        return (String) get(PROPERTY_GROUPID);
    }
    /**
     * @see AccountingFact#PROPERTY_GROUPID
     * 
     */
    public void setGroupID(String groupID) {
        set(PROPERTY_GROUPID, groupID);
    }

    /**
     * @see AccountingFact#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see AccountingFact#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see AccountingFact#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see AccountingFact#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see AccountingFact#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public String getDocumentCategory() {
        return (String) get(PROPERTY_DOCUMENTCATEGORY);
    }
    /**
     * @see AccountingFact#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public void setDocumentCategory(String documentCategory) {
        set(PROPERTY_DOCUMENTCATEGORY, documentCategory);
    }

    /**
     * @see AccountingFact#PROPERTY_VALUE
     * 
     */
    public String getValue() {
        return (String) get(PROPERTY_VALUE);
    }
    /**
     * @see AccountingFact#PROPERTY_VALUE
     * 
     */
    public void setValue(String value) {
        set(PROPERTY_VALUE, value);
    }

    /**
     * @see AccountingFact#PROPERTY_ACCOUNTINGENTRYDESCRIPTION
     * 
     */
    public String getAccountingEntryDescription() {
        return (String) get(PROPERTY_ACCOUNTINGENTRYDESCRIPTION);
    }
    /**
     * @see AccountingFact#PROPERTY_ACCOUNTINGENTRYDESCRIPTION
     * 
     */
    public void setAccountingEntryDescription(String accountingEntryDescription) {
        set(PROPERTY_ACCOUNTINGENTRYDESCRIPTION, accountingEntryDescription);
    }

    /**
     * @see AccountingFact#PROPERTY_RECORDID2
     * 
     */
    public String getRecordID2() {
        return (String) get(PROPERTY_RECORDID2);
    }
    /**
     * @see AccountingFact#PROPERTY_RECORDID2
     * 
     */
    public void setRecordID2(String recordID2) {
        set(PROPERTY_RECORDID2, recordID2);
    }

    /**
     * @see AccountingFact#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see AccountingFact#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see AccountingFact#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see AccountingFact#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see AccountingFact#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see AccountingFact#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see AccountingFact#PROPERTY_MODIFY
     * 
     */
    public Boolean isModify() {
        return (Boolean) get(PROPERTY_MODIFY);
    }
    /**
     * @see AccountingFact#PROPERTY_MODIFY
     * 
     */
    public void setModify(Boolean modify) {
        set(PROPERTY_MODIFY, modify);
    }

    /**
     * @see AccountingFact#PROPERTY_DATEBALANCED
     * 
     */
    public Date getDateBalanced() {
        return (Date) get(PROPERTY_DATEBALANCED);
    }
    /**
     * @see AccountingFact#PROPERTY_DATEBALANCED
     * 
     */
    public void setDateBalanced(Date dateBalanced) {
        set(PROPERTY_DATEBALANCED, dateBalanced);
    }

}
