
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
package org.openbravo.model.financialmgmt.gl;

import java.math.BigDecimal;
import java.util.Date;

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
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.accounting.coa.AccountingCombination;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.payment.DebtPayment;
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.tax.TaxRate;
import org.openbravo.model.financialmgmt.tax.Withholding;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity FinancialMgmtGLJournalLine (stored in table GL_JournalLine).
 * <br>
 * Help: {@literal The GL Journal Line Tab defines the individual debit and credit transactions that comprise
     *       a journal.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GLJournalLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GL_JournalLine";
    public static final String ENTITY_NAME = "FinancialMgmtGLJournalLine";

    /**
     * Property id stored in column GL_JournalLine_ID in table GL_JournalLine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table GL_JournalLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table GL_JournalLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table GL_JournalLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table GL_JournalLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table GL_JournalLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table GL_JournalLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table GL_JournalLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property journalEntry stored in column GL_Journal_ID in table GL_JournalLine<br>
     * Help: {@literal The General Ledger Journal identifies a group of journal lines which represent a logical
     *       business transaction}
     * 
     */
    public static final String PROPERTY_JOURNALENTRY = "journalEntry";

    /**
     * Property lineNo stored in column Line in table GL_JournalLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property generated stored in column IsGenerated in table GL_JournalLine<br>
     * Help: {@literal The Generated checkbox identifies a journal line that was generated from a source
     *       document.  Lines could also be entered manually or imported.}
     * 
     */
    public static final String PROPERTY_GENERATED = "generated";

    /**
     * Property description stored in column Description in table GL_JournalLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property foreignCurrencyDebit stored in column AmtSourceDr in table GL_JournalLine<br>
     * Help: {@literal The Source Debit Amount indicates the credit amount for this line in the source currency.}
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCYDEBIT = "foreignCurrencyDebit";

    /**
     * Property foreignCurrencyCredit stored in column AmtSourceCr in table GL_JournalLine<br>
     * Help: {@literal The Source Credit Amount indicates the credit amount for this line in the source
     *       currency.}
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCYCREDIT = "foreignCurrencyCredit";

    /**
     * Property currency stored in column C_Currency_ID in table GL_JournalLine<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property currencyRateType stored in column CurrencyRateType in table GL_JournalLine<br>
     * Help: {@literal The Conversion Rate Type indicates the type of rate to use when retrieving the conversion
     *       rate.  It allows you to define multiple rates for the same to and from currency.  For example you
     *       may have a set of rates used for daily transactions with a rate type of SPOT and rates for currency
     *       revaluation defined as REVAL.}
     * 
     */
    public static final String PROPERTY_CURRENCYRATETYPE = "currencyRateType";

    /**
     * Property rate stored in column CurrencyRate in table GL_JournalLine<br>
     * Help: {@literal The Currency Conversion Rate indicates the rate to use when converting the source currency
     *       to the accounting currency}
     * 
     */
    public static final String PROPERTY_RATE = "rate";

    /**
     * Property debit stored in column AmtAcctDr in table GL_JournalLine<br>
     * Help: {@literal The Account Debit Amount indicates the transaction amount converted to this organization's
     *       accounting currency}
     * 
     */
    public static final String PROPERTY_DEBIT = "debit";

    /**
     * Property credit stored in column AmtAcctCr in table GL_JournalLine<br>
     * Help: {@literal The Account Credit Amount indicates the transaction amount converted to this
     *       organization's accounting currency}
     * 
     */
    public static final String PROPERTY_CREDIT = "credit";

    /**
     * Property uOM stored in column C_UOM_ID in table GL_JournalLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property quantity stored in column Qty in table GL_JournalLine<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property accountingCombination stored in column C_ValidCombination_ID in table GL_JournalLine<br>
     * Help: {@literal The Combination identifies a valid combination of element which represent a GL account.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGCOMBINATION = "accountingCombination";

    /**
     * Property payment stored in column C_Debt_Payment_ID in table GL_JournalLine<br>
     * Help: {@literal Refers to the amount of money to be paid or collected.}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property withholding stored in column C_Withholding_ID in table GL_JournalLine<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property tax stored in column C_Tax_ID in table GL_JournalLine<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property stDimension stored in column User1_ID in table GL_JournalLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table GL_JournalLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table GL_JournalLine<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table GL_JournalLine<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property activity stored in column C_Activity_ID in table GL_JournalLine<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property salesRegion stored in column C_Salesregion_ID in table GL_JournalLine<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property product stored in column M_Product_ID in table GL_JournalLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table GL_JournalLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property asset stored in column A_Asset_ID in table GL_JournalLine<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table GL_JournalLine<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property relatedPayment stored in column FIN_Payment_ID in table GL_JournalLine<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_RELATEDPAYMENT = "relatedPayment";

    /**
     * Property financialAccount stored in column FIN_Financial_Account_ID in table GL_JournalLine<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNT = "financialAccount";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table GL_JournalLine
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property openItems stored in column Open_Items in table GL_JournalLine
     * 
     */
    public static final String PROPERTY_OPENITEMS = "openItems";

    /**
     * Property gLItem stored in column C_Glitem_ID in table GL_JournalLine<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property aPRMAddPayment stored in column EM_Aprm_Addpayment in table GL_JournalLine<br>
     * Help: {@literal Launches a process to add a payment to the selected invoice.}
     * 
     */
    public static final String PROPERTY_APRMADDPAYMENT = "aPRMAddPayment";

    /**
     * Property paymentDate stored in column Paymentdate in table GL_JournalLine
     * 
     */
    public static final String PROPERTY_PAYMENTDATE = "paymentDate";

    /**
     * Property gLItems stored in column Account_ID in table GL_JournalLine
     * 
     */
    public static final String PROPERTY_GLITEMS = "gLItems";


    public GLJournalLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_GENERATED, false);
        setDefaultValue(PROPERTY_CURRENCYRATETYPE, "S");
        setDefaultValue(PROPERTY_RATE, new BigDecimal(1));
        setDefaultValue(PROPERTY_OPENITEMS, false);
        setDefaultValue(PROPERTY_APRMADDPAYMENT, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GLJournalLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GLJournalLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GLJournalLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GLJournalLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GLJournalLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GLJournalLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GLJournalLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GLJournalLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GLJournalLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GLJournalLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GLJournalLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GLJournalLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GLJournalLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GLJournalLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GLJournalLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GLJournalLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GLJournalLine#PROPERTY_JOURNALENTRY
     * 
     */
    public GLJournal getJournalEntry() {
        return (GLJournal) get(PROPERTY_JOURNALENTRY);
    }
    /**
     * @see GLJournalLine#PROPERTY_JOURNALENTRY
     * 
     */
    public void setJournalEntry(GLJournal journalEntry) {
        set(PROPERTY_JOURNALENTRY, journalEntry);
    }

    /**
     * @see GLJournalLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see GLJournalLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see GLJournalLine#PROPERTY_GENERATED
     * 
     */
    public Boolean isGenerated() {
        return (Boolean) get(PROPERTY_GENERATED);
    }
    /**
     * @see GLJournalLine#PROPERTY_GENERATED
     * 
     */
    public void setGenerated(Boolean generated) {
        set(PROPERTY_GENERATED, generated);
    }

    /**
     * @see GLJournalLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see GLJournalLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see GLJournalLine#PROPERTY_FOREIGNCURRENCYDEBIT
     * 
     */
    public BigDecimal getForeignCurrencyDebit() {
        return (BigDecimal) get(PROPERTY_FOREIGNCURRENCYDEBIT);
    }
    /**
     * @see GLJournalLine#PROPERTY_FOREIGNCURRENCYDEBIT
     * 
     */
    public void setForeignCurrencyDebit(BigDecimal foreignCurrencyDebit) {
        set(PROPERTY_FOREIGNCURRENCYDEBIT, foreignCurrencyDebit);
    }

    /**
     * @see GLJournalLine#PROPERTY_FOREIGNCURRENCYCREDIT
     * 
     */
    public BigDecimal getForeignCurrencyCredit() {
        return (BigDecimal) get(PROPERTY_FOREIGNCURRENCYCREDIT);
    }
    /**
     * @see GLJournalLine#PROPERTY_FOREIGNCURRENCYCREDIT
     * 
     */
    public void setForeignCurrencyCredit(BigDecimal foreignCurrencyCredit) {
        set(PROPERTY_FOREIGNCURRENCYCREDIT, foreignCurrencyCredit);
    }

    /**
     * @see GLJournalLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see GLJournalLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see GLJournalLine#PROPERTY_CURRENCYRATETYPE
     * 
     */
    public String getCurrencyRateType() {
        return (String) get(PROPERTY_CURRENCYRATETYPE);
    }
    /**
     * @see GLJournalLine#PROPERTY_CURRENCYRATETYPE
     * 
     */
    public void setCurrencyRateType(String currencyRateType) {
        set(PROPERTY_CURRENCYRATETYPE, currencyRateType);
    }

    /**
     * @see GLJournalLine#PROPERTY_RATE
     * 
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(PROPERTY_RATE);
    }
    /**
     * @see GLJournalLine#PROPERTY_RATE
     * 
     */
    public void setRate(BigDecimal rate) {
        set(PROPERTY_RATE, rate);
    }

    /**
     * @see GLJournalLine#PROPERTY_DEBIT
     * 
     */
    public BigDecimal getDebit() {
        return (BigDecimal) get(PROPERTY_DEBIT);
    }
    /**
     * @see GLJournalLine#PROPERTY_DEBIT
     * 
     */
    public void setDebit(BigDecimal debit) {
        set(PROPERTY_DEBIT, debit);
    }

    /**
     * @see GLJournalLine#PROPERTY_CREDIT
     * 
     */
    public BigDecimal getCredit() {
        return (BigDecimal) get(PROPERTY_CREDIT);
    }
    /**
     * @see GLJournalLine#PROPERTY_CREDIT
     * 
     */
    public void setCredit(BigDecimal credit) {
        set(PROPERTY_CREDIT, credit);
    }

    /**
     * @see GLJournalLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see GLJournalLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see GLJournalLine#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see GLJournalLine#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see GLJournalLine#PROPERTY_ACCOUNTINGCOMBINATION
     * 
     */
    public AccountingCombination getAccountingCombination() {
        return (AccountingCombination) get(PROPERTY_ACCOUNTINGCOMBINATION);
    }
    /**
     * @see GLJournalLine#PROPERTY_ACCOUNTINGCOMBINATION
     * 
     */
    public void setAccountingCombination(AccountingCombination accountingCombination) {
        set(PROPERTY_ACCOUNTINGCOMBINATION, accountingCombination);
    }

    /**
     * @see GLJournalLine#PROPERTY_PAYMENT
     * 
     */
    public DebtPayment getPayment() {
        return (DebtPayment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see GLJournalLine#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(DebtPayment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see GLJournalLine#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see GLJournalLine#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see GLJournalLine#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see GLJournalLine#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see GLJournalLine#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see GLJournalLine#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see GLJournalLine#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see GLJournalLine#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see GLJournalLine#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see GLJournalLine#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see GLJournalLine#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see GLJournalLine#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see GLJournalLine#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see GLJournalLine#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see GLJournalLine#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see GLJournalLine#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see GLJournalLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see GLJournalLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see GLJournalLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see GLJournalLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see GLJournalLine#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see GLJournalLine#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see GLJournalLine#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see GLJournalLine#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see GLJournalLine#PROPERTY_RELATEDPAYMENT
     * 
     */
    public FIN_Payment getRelatedPayment() {
        return (FIN_Payment) get(PROPERTY_RELATEDPAYMENT);
    }
    /**
     * @see GLJournalLine#PROPERTY_RELATEDPAYMENT
     * 
     */
    public void setRelatedPayment(FIN_Payment relatedPayment) {
        set(PROPERTY_RELATEDPAYMENT, relatedPayment);
    }

    /**
     * @see GLJournalLine#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public FIN_FinancialAccount getFinancialAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_FINANCIALACCOUNT);
    }
    /**
     * @see GLJournalLine#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public void setFinancialAccount(FIN_FinancialAccount financialAccount) {
        set(PROPERTY_FINANCIALACCOUNT, financialAccount);
    }

    /**
     * @see GLJournalLine#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see GLJournalLine#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see GLJournalLine#PROPERTY_OPENITEMS
     * 
     */
    public Boolean isOpenItems() {
        return (Boolean) get(PROPERTY_OPENITEMS);
    }
    /**
     * @see GLJournalLine#PROPERTY_OPENITEMS
     * 
     */
    public void setOpenItems(Boolean openItems) {
        set(PROPERTY_OPENITEMS, openItems);
    }

    /**
     * @see GLJournalLine#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see GLJournalLine#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see GLJournalLine#PROPERTY_APRMADDPAYMENT
     * 
     */
    public Boolean isAPRMAddPayment() {
        return (Boolean) get(PROPERTY_APRMADDPAYMENT);
    }
    /**
     * @see GLJournalLine#PROPERTY_APRMADDPAYMENT
     * 
     */
    public void setAPRMAddPayment(Boolean aPRMAddPayment) {
        set(PROPERTY_APRMADDPAYMENT, aPRMAddPayment);
    }

    /**
     * @see GLJournalLine#PROPERTY_PAYMENTDATE
     * 
     */
    public Date getPaymentDate() {
        return (Date) get(PROPERTY_PAYMENTDATE);
    }
    /**
     * @see GLJournalLine#PROPERTY_PAYMENTDATE
     * 
     */
    public void setPaymentDate(Date paymentDate) {
        set(PROPERTY_PAYMENTDATE, paymentDate);
    }

    /**
     * @see GLJournalLine#PROPERTY_GLITEMS
     * 
     */
    public GLItem getGLItems() {
        return (GLItem) get(PROPERTY_GLITEMS);
    }
    /**
     * @see GLJournalLine#PROPERTY_GLITEMS
     * 
     */
    public void setGLItems(GLItem gLItems) {
        set(PROPERTY_GLITEMS, gLItems);
    }

}
