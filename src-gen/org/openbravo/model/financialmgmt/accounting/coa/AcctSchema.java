
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.calendar.Period;
/**
 * Entity class for entity FinancialMgmtAcctSchema (stored in table C_AcctSchema).
 * <br>
 * Help: {@literal The Accounting Schema Tab defines the controls used for accounting.  Each Organization
     *       will select an Accounting Schema to use.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AcctSchema extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_AcctSchema";
    public static final String ENTITY_NAME = "FinancialMgmtAcctSchema";

    /**
     * Property id stored in column C_AcctSchema_ID in table C_AcctSchema<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_AcctSchema 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_AcctSchema 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_AcctSchema 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_AcctSchema 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_AcctSchema<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property gAAP stored in column GAAP in table C_AcctSchema<br>
     * Help: {@literal The Accounting Standard identifies the account principles that this accounting schema will
     *       adhere to.}
     * 
     */
    public static final String PROPERTY_GAAP = "gAAP";

    /**
     * Property accrual stored in column IsAccrual in table C_AcctSchema<br>
     * Help: {@literal The Accrual checkbox indicates if this accounting schema will use accrual based account or
     *       cash based accounting.  The Accrual method recognizes revenue when the product or service is
     *       delivered.  Cash based method recognizes income when then payment is received.}
     * 
     */
    public static final String PROPERTY_ACCRUAL = "accrual";

    /**
     * Property costingMethod stored in column CostingMethod in table C_AcctSchema<br>
     * Help: {@literal Indicates how costs will be calculated (Standard, Average) for valuation and accounting
     *       purposes.}
     * 
     */
    public static final String PROPERTY_COSTINGMETHOD = "costingMethod";

    /**
     * Property currency stored in column C_Currency_ID in table C_AcctSchema<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property automaticPeriodControl stored in column AutoPeriodControl in table C_AcctSchema<br>
     * Help: {@literal In the Automatic Period Control, periods are opened and closed based on the current date. 
     *       If the Manual alternative is activated, you have to open and close periods explicitly.}
     * 
     */
    public static final String PROPERTY_AUTOMATICPERIODCONTROL = "automaticPeriodControl";

    /**
     * Property period stored in column C_Period_ID in table C_AcctSchema<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";

    /**
     * Property historyDays stored in column Period_OpenHistory in table C_AcctSchema<br>
     * Help: {@literal If Automatic Period Control is enabled, the current period is calculated based on the
     *       system date and you can always post to all days in the current period.  History Days enable to post
     *       to previous periods.  E.g. today is May 15th and History Days is set to 30, you can post back to
     *       April 15th}
     * 
     */
    public static final String PROPERTY_HISTORYDAYS = "historyDays";

    /**
     * Property futureDays stored in column Period_OpenFuture in table C_AcctSchema<br>
     * Help: {@literal If Automatic Period Control is enabled, the current period is calculated based on the
     *       system date and you can always post to all days in the current period.  Future Days enable to post
     *       to future periods. E.g. today is Apr 15th and Future Days is set to 30, you can post up to May 15th}
     * 
     */
    public static final String PROPERTY_FUTUREDAYS = "futureDays";

    /**
     * Property storageBinSeparator stored in column Separator in table C_AcctSchema<br>
     * Help: {@literal The Element Separator defines the delimiter printed between elements of the structure}
     * 
     */
    public static final String PROPERTY_STORAGEBINSEPARATOR = "storageBinSeparator";

    /**
     * Property useAccountAlias stored in column HasAlias in table C_AcctSchema<br>
     * Help: {@literal The Alias checkbox indicates that account combination can be selected using a user defined
     *       alias or short key.}
     * 
     */
    public static final String PROPERTY_USEACCOUNTALIAS = "useAccountAlias";

    /**
     * Property useAccountCombinationControl stored in column HasCombination in table C_AcctSchema<br>
     * Help: {@literal The Combination Control checkbox indicates if the combination of account elements will be
     *       verified against the defined acceptable combination.}
     * 
     */
    public static final String PROPERTY_USEACCOUNTCOMBINATIONCONTROL = "useAccountCombinationControl";

    /**
     * Property postTradeDiscount stored in column IsTradeDiscountPosted in table C_AcctSchema<br>
     * Help: {@literal If the invoice is based on an item with a list price, the amount based on the list price
     *       and the discount is posted instead of the net amount.Example: Quantity 10 - List Price: 20 - Actual
     *       Price: 17If selected for a sales invoice 200 is posted to Produc}
     * 
     */
    public static final String PROPERTY_POSTTRADEDISCOUNT = "postTradeDiscount";

    /**
     * Property correctTaxForDiscountsCharges stored in column IsDiscountCorrectsTax in table C_AcctSchema<br>
     * Help: {@literal Payment discounts may require to correct the tax.  This primarily applicable in VAT
     *       systems.  If the original invoice had tax records, the payment discount, write-off, etc. is
     *       corrected by the tax. The calculation of the tax is prorated based on the invoice.}
     * 
     */
    public static final String PROPERTY_CORRECTTAXFORDISCOUNTSCHARGES = "correctTaxForDiscountsCharges";

    /**
     * Property allowNegative stored in column Allownegative in table C_AcctSchema<br>
     * Help: {@literal Allow negative entries in credit and debit}
     * 
     */
    public static final String PROPERTY_ALLOWNEGATIVE = "allowNegative";

    /**
     * Property centralMaintenance stored in column Iscentrallymaintained in table C_AcctSchema<br>
     * Help: {@literal The Centrally Maintained checkbox indicates if the Name, Description and Help maintained
     *       in 'System Element' table  or 'Window' table.}
     * 
     */
    public static final String PROPERTY_CENTRALMAINTENANCE = "centralMaintenance";

    /**
     * Property assetPositive stored in column IsAssetPositive in table C_AcctSchema<br>
     * Help: {@literal Display assets as positive amounts}
     * 
     */
    public static final String PROPERTY_ASSETPOSITIVE = "assetPositive";

    /**
     * Property liabilityPositive stored in column IsLiabilityPositive in table C_AcctSchema<br>
     * Help: {@literal Display liabilities as positive amounts.}
     * 
     */
    public static final String PROPERTY_LIABILITYPOSITIVE = "liabilityPositive";

    /**
     * Property equityPositive stored in column IsEquityPositive in table C_AcctSchema<br>
     * Help: {@literal Display owner's equity as positive amounts.}
     * 
     */
    public static final String PROPERTY_EQUITYPOSITIVE = "equityPositive";

    /**
     * Property revenuePositive stored in column IsRevenuePositive in table C_AcctSchema<br>
     * Help: {@literal Display revenues as positive amounts.}
     * 
     */
    public static final String PROPERTY_REVENUEPOSITIVE = "revenuePositive";

    /**
     * Property expensePositive stored in column IsExpensePositive in table C_AcctSchema<br>
     * Help: {@literal Display expenses as positive amounts.}
     * 
     */
    public static final String PROPERTY_EXPENSEPOSITIVE = "expensePositive";

    /**
     * Property financialMgmtAcctSchemaDefaultList stored in table C_AcctSchema
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTACCTSCHEMADEFAULTLIST = "financialMgmtAcctSchemaDefaultList";

    /**
     * Property financialMgmtAcctSchemaElementList stored in table C_AcctSchema
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST = "financialMgmtAcctSchemaElementList";

    /**
     * Property financialMgmtAcctSchemaGLList stored in table C_AcctSchema
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTACCTSCHEMAGLLIST = "financialMgmtAcctSchemaGLList";


    public AcctSchema() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_GAAP, "OT");
        setDefaultValue(PROPERTY_ACCRUAL, true);
        setDefaultValue(PROPERTY_AUTOMATICPERIODCONTROL, false);
        setDefaultValue(PROPERTY_STORAGEBINSEPARATOR, "-");
        setDefaultValue(PROPERTY_USEACCOUNTALIAS, false);
        setDefaultValue(PROPERTY_USEACCOUNTCOMBINATIONCONTROL, false);
        setDefaultValue(PROPERTY_POSTTRADEDISCOUNT, false);
        setDefaultValue(PROPERTY_CORRECTTAXFORDISCOUNTSCHARGES, false);
        setDefaultValue(PROPERTY_ALLOWNEGATIVE, false);
        setDefaultValue(PROPERTY_CENTRALMAINTENANCE, true);
        setDefaultValue(PROPERTY_ASSETPOSITIVE, true);
        setDefaultValue(PROPERTY_LIABILITYPOSITIVE, true);
        setDefaultValue(PROPERTY_EQUITYPOSITIVE, true);
        setDefaultValue(PROPERTY_REVENUEPOSITIVE, true);
        setDefaultValue(PROPERTY_EXPENSEPOSITIVE, true);
        setDefaultValue(PROPERTY_FINANCIALMGMTACCTSCHEMADEFAULTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTACCTSCHEMAGLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AcctSchema#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AcctSchema#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AcctSchema#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AcctSchema#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AcctSchema#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AcctSchema#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AcctSchema#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AcctSchema#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AcctSchema#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AcctSchema#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AcctSchema#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AcctSchema#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AcctSchema#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AcctSchema#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AcctSchema#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AcctSchema#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AcctSchema#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AcctSchema#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AcctSchema#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AcctSchema#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AcctSchema#PROPERTY_GAAP
     * 
     */
    public String getGAAP() {
        return (String) get(PROPERTY_GAAP);
    }
    /**
     * @see AcctSchema#PROPERTY_GAAP
     * 
     */
    public void setGAAP(String gAAP) {
        set(PROPERTY_GAAP, gAAP);
    }

    /**
     * @see AcctSchema#PROPERTY_ACCRUAL
     * 
     */
    public Boolean isAccrual() {
        return (Boolean) get(PROPERTY_ACCRUAL);
    }
    /**
     * @see AcctSchema#PROPERTY_ACCRUAL
     * 
     */
    public void setAccrual(Boolean accrual) {
        set(PROPERTY_ACCRUAL, accrual);
    }

    /**
     * @see AcctSchema#PROPERTY_COSTINGMETHOD
     * 
     */
    public String getCostingMethod() {
        return (String) get(PROPERTY_COSTINGMETHOD);
    }
    /**
     * @see AcctSchema#PROPERTY_COSTINGMETHOD
     * 
     */
    public void setCostingMethod(String costingMethod) {
        set(PROPERTY_COSTINGMETHOD, costingMethod);
    }

    /**
     * @see AcctSchema#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see AcctSchema#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see AcctSchema#PROPERTY_AUTOMATICPERIODCONTROL
     * 
     */
    public Boolean isAutomaticPeriodControl() {
        return (Boolean) get(PROPERTY_AUTOMATICPERIODCONTROL);
    }
    /**
     * @see AcctSchema#PROPERTY_AUTOMATICPERIODCONTROL
     * 
     */
    public void setAutomaticPeriodControl(Boolean automaticPeriodControl) {
        set(PROPERTY_AUTOMATICPERIODCONTROL, automaticPeriodControl);
    }

    /**
     * @see AcctSchema#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see AcctSchema#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    /**
     * @see AcctSchema#PROPERTY_HISTORYDAYS
     * 
     */
    public Long getHistoryDays() {
        return (Long) get(PROPERTY_HISTORYDAYS);
    }
    /**
     * @see AcctSchema#PROPERTY_HISTORYDAYS
     * 
     */
    public void setHistoryDays(Long historyDays) {
        set(PROPERTY_HISTORYDAYS, historyDays);
    }

    /**
     * @see AcctSchema#PROPERTY_FUTUREDAYS
     * 
     */
    public Long getFutureDays() {
        return (Long) get(PROPERTY_FUTUREDAYS);
    }
    /**
     * @see AcctSchema#PROPERTY_FUTUREDAYS
     * 
     */
    public void setFutureDays(Long futureDays) {
        set(PROPERTY_FUTUREDAYS, futureDays);
    }

    /**
     * @see AcctSchema#PROPERTY_STORAGEBINSEPARATOR
     * 
     */
    public String getStorageBinSeparator() {
        return (String) get(PROPERTY_STORAGEBINSEPARATOR);
    }
    /**
     * @see AcctSchema#PROPERTY_STORAGEBINSEPARATOR
     * 
     */
    public void setStorageBinSeparator(String storageBinSeparator) {
        set(PROPERTY_STORAGEBINSEPARATOR, storageBinSeparator);
    }

    /**
     * @see AcctSchema#PROPERTY_USEACCOUNTALIAS
     * 
     */
    public Boolean isUseAccountAlias() {
        return (Boolean) get(PROPERTY_USEACCOUNTALIAS);
    }
    /**
     * @see AcctSchema#PROPERTY_USEACCOUNTALIAS
     * 
     */
    public void setUseAccountAlias(Boolean useAccountAlias) {
        set(PROPERTY_USEACCOUNTALIAS, useAccountAlias);
    }

    /**
     * @see AcctSchema#PROPERTY_USEACCOUNTCOMBINATIONCONTROL
     * 
     */
    public Boolean isUseAccountCombinationControl() {
        return (Boolean) get(PROPERTY_USEACCOUNTCOMBINATIONCONTROL);
    }
    /**
     * @see AcctSchema#PROPERTY_USEACCOUNTCOMBINATIONCONTROL
     * 
     */
    public void setUseAccountCombinationControl(Boolean useAccountCombinationControl) {
        set(PROPERTY_USEACCOUNTCOMBINATIONCONTROL, useAccountCombinationControl);
    }

    /**
     * @see AcctSchema#PROPERTY_POSTTRADEDISCOUNT
     * 
     */
    public Boolean isPostTradeDiscount() {
        return (Boolean) get(PROPERTY_POSTTRADEDISCOUNT);
    }
    /**
     * @see AcctSchema#PROPERTY_POSTTRADEDISCOUNT
     * 
     */
    public void setPostTradeDiscount(Boolean postTradeDiscount) {
        set(PROPERTY_POSTTRADEDISCOUNT, postTradeDiscount);
    }

    /**
     * @see AcctSchema#PROPERTY_CORRECTTAXFORDISCOUNTSCHARGES
     * 
     */
    public Boolean isCorrectTaxForDiscountsCharges() {
        return (Boolean) get(PROPERTY_CORRECTTAXFORDISCOUNTSCHARGES);
    }
    /**
     * @see AcctSchema#PROPERTY_CORRECTTAXFORDISCOUNTSCHARGES
     * 
     */
    public void setCorrectTaxForDiscountsCharges(Boolean correctTaxForDiscountsCharges) {
        set(PROPERTY_CORRECTTAXFORDISCOUNTSCHARGES, correctTaxForDiscountsCharges);
    }

    /**
     * @see AcctSchema#PROPERTY_ALLOWNEGATIVE
     * 
     */
    public Boolean isAllowNegative() {
        return (Boolean) get(PROPERTY_ALLOWNEGATIVE);
    }
    /**
     * @see AcctSchema#PROPERTY_ALLOWNEGATIVE
     * 
     */
    public void setAllowNegative(Boolean allowNegative) {
        set(PROPERTY_ALLOWNEGATIVE, allowNegative);
    }

    /**
     * @see AcctSchema#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public Boolean isCentralMaintenance() {
        return (Boolean) get(PROPERTY_CENTRALMAINTENANCE);
    }
    /**
     * @see AcctSchema#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public void setCentralMaintenance(Boolean centralMaintenance) {
        set(PROPERTY_CENTRALMAINTENANCE, centralMaintenance);
    }

    /**
     * @see AcctSchema#PROPERTY_ASSETPOSITIVE
     * 
     */
    public Boolean isAssetPositive() {
        return (Boolean) get(PROPERTY_ASSETPOSITIVE);
    }
    /**
     * @see AcctSchema#PROPERTY_ASSETPOSITIVE
     * 
     */
    public void setAssetPositive(Boolean assetPositive) {
        set(PROPERTY_ASSETPOSITIVE, assetPositive);
    }

    /**
     * @see AcctSchema#PROPERTY_LIABILITYPOSITIVE
     * 
     */
    public Boolean isLiabilityPositive() {
        return (Boolean) get(PROPERTY_LIABILITYPOSITIVE);
    }
    /**
     * @see AcctSchema#PROPERTY_LIABILITYPOSITIVE
     * 
     */
    public void setLiabilityPositive(Boolean liabilityPositive) {
        set(PROPERTY_LIABILITYPOSITIVE, liabilityPositive);
    }

    /**
     * @see AcctSchema#PROPERTY_EQUITYPOSITIVE
     * 
     */
    public Boolean isEquityPositive() {
        return (Boolean) get(PROPERTY_EQUITYPOSITIVE);
    }
    /**
     * @see AcctSchema#PROPERTY_EQUITYPOSITIVE
     * 
     */
    public void setEquityPositive(Boolean equityPositive) {
        set(PROPERTY_EQUITYPOSITIVE, equityPositive);
    }

    /**
     * @see AcctSchema#PROPERTY_REVENUEPOSITIVE
     * 
     */
    public Boolean isRevenuePositive() {
        return (Boolean) get(PROPERTY_REVENUEPOSITIVE);
    }
    /**
     * @see AcctSchema#PROPERTY_REVENUEPOSITIVE
     * 
     */
    public void setRevenuePositive(Boolean revenuePositive) {
        set(PROPERTY_REVENUEPOSITIVE, revenuePositive);
    }

    /**
     * @see AcctSchema#PROPERTY_EXPENSEPOSITIVE
     * 
     */
    public Boolean isExpensePositive() {
        return (Boolean) get(PROPERTY_EXPENSEPOSITIVE);
    }
    /**
     * @see AcctSchema#PROPERTY_EXPENSEPOSITIVE
     * 
     */
    public void setExpensePositive(Boolean expensePositive) {
        set(PROPERTY_EXPENSEPOSITIVE, expensePositive);
    }

    /**
     * Help: {@literal Defines default accounts for an Accounting Schema.  These values will display when a new
     *       document is opened.  The user can override these defaults within the document.}<br>
     * @see AcctSchemaDefault
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AcctSchemaDefault> getFinancialMgmtAcctSchemaDefaultList() {
      return (List<AcctSchemaDefault>) get(PROPERTY_FINANCIALMGMTACCTSCHEMADEFAULTLIST);
    }

    /**
     * Help: {@literal Defines default accounts for an Accounting Schema.  These values will display when a new
     *       document is opened.  The user can override these defaults within the document.}<br>
     * @see AcctSchemaDefault
     * 
     */
    public void setFinancialMgmtAcctSchemaDefaultList(List<AcctSchemaDefault> financialMgmtAcctSchemaDefaultList) {
        set(PROPERTY_FINANCIALMGMTACCTSCHEMADEFAULTLIST, financialMgmtAcctSchemaDefaultList);
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
     * Help: {@literal The General Ledger defines error and balance handling to use as well as  the necessary
     *       accounts for posting to General Ledger.}<br>
     * @see AcctSchemaGL
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AcctSchemaGL> getFinancialMgmtAcctSchemaGLList() {
      return (List<AcctSchemaGL>) get(PROPERTY_FINANCIALMGMTACCTSCHEMAGLLIST);
    }

    /**
     * Help: {@literal The General Ledger defines error and balance handling to use as well as  the necessary
     *       accounts for posting to General Ledger.}<br>
     * @see AcctSchemaGL
     * 
     */
    public void setFinancialMgmtAcctSchemaGLList(List<AcctSchemaGL> financialMgmtAcctSchemaGLList) {
        set(PROPERTY_FINANCIALMGMTACCTSCHEMAGLLIST, financialMgmtAcctSchemaGLList);
    }

}
