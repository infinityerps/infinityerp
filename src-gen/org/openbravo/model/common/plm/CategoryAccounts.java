
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
package org.openbravo.model.common.plm;

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
 * Entity class for entity ProductCategoryAccounts (stored in table M_Product_Category_Acct).
 * <br>
 * Help: {@literal Defines default accounting parameters.  Any product that uses a product category can
     *       inherit its default accounting parameters.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CategoryAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Category_Acct";
    public static final String ENTITY_NAME = "ProductCategoryAccounts";

    /**
     * Property id stored in column M_Product_Category_Acct_ID in table M_Product_Category_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table M_Product_Category_Acct<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table M_Product_Category_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_Category_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_Category_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Product_Category_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_Category_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Product_Category_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_Category_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Product_Category_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property productRevenue stored in column P_Revenue_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Product Revenue Account indicates the account used for recording sales revenue for
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTREVENUE = "productRevenue";

    /**
     * Property productExpense stored in column P_Expense_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Product Expense Account indicates the account used to record expenses associated with
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTEXPENSE = "productExpense";

    /**
     * Property fixedAsset stored in column P_Asset_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Product Asset Account indicates the account used for valuing this a product in
     *       inventory.}
     * 
     */
    public static final String PROPERTY_FIXEDASSET = "fixedAsset";

    /**
     * Property productCOGS stored in column P_Cogs_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Product COGS Account indicates the account used when recording costs associated with
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTCOGS = "productCOGS";

    /**
     * Property purchasePriceVariance stored in column P_PurchasePriceVariance_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Purchase Price Variance is used in Standard Costing. It reflects the difference
     *       between the Standard Cost and the Purchase Order Price.}
     * 
     */
    public static final String PROPERTY_PURCHASEPRICEVARIANCE = "purchasePriceVariance";

    /**
     * Property invoicePriceVariance stored in column P_InvoicePriceVariance_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Invoice Price Variance is used reflects the difference between the current Costs and
     *       the Invoice Price.}
     * 
     */
    public static final String PROPERTY_INVOICEPRICEVARIANCE = "invoicePriceVariance";

    /**
     * Property tradeDiscountReceived stored in column P_TradeDiscountRec_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Trade Discount Receivables Account indicates the account for received trade discounts
     *       in vendor invoices}
     * 
     */
    public static final String PROPERTY_TRADEDISCOUNTRECEIVED = "tradeDiscountReceived";

    /**
     * Property tradeDiscountGranted stored in column P_TradeDiscountGrant_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Trade Discount Granted Account indicates the account for granted trade discount in
     *       sales invoices}
     * 
     */
    public static final String PROPERTY_TRADEDISCOUNTGRANTED = "tradeDiscountGranted";

    /**
     * Property processNow stored in column Processing in table M_Product_Category_Acct<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property productCOGSReturn stored in column P_Cogs_Return_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Product COGS Account indicates the account used when recording returns associated with
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTCOGSRETURN = "productCOGSReturn";

    /**
     * Property productRevenueReturn stored in column P_Revenue_Return_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal The Product Revenue Return Account indicates the account used for recording returns of
     *       this product.}
     * 
     */
    public static final String PROPERTY_PRODUCTREVENUERETURN = "productRevenueReturn";

    /**
     * Property productDeferredRevenue stored in column P_Def_Revenue_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal Used when revenue is deferred fro a sold product.}
     * 
     */
    public static final String PROPERTY_PRODUCTDEFERREDREVENUE = "productDeferredRevenue";

    /**
     * Property defExpenseAcct stored in column P_Def_Expense_Acct in table M_Product_Category_Acct<br>
     * Help: {@literal Used when expense is deferred from a purchased product.}
     * 
     */
    public static final String PROPERTY_DEFEXPENSEACCT = "defExpenseAcct";


    public CategoryAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CategoryAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see CategoryAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CategoryAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CategoryAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CategoryAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CategoryAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CategoryAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CategoryAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CategoryAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTREVENUE
     * 
     */
    public AccountingCombination getProductRevenue() {
        return (AccountingCombination) get(PROPERTY_PRODUCTREVENUE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTREVENUE
     * 
     */
    public void setProductRevenue(AccountingCombination productRevenue) {
        set(PROPERTY_PRODUCTREVENUE, productRevenue);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTEXPENSE
     * 
     */
    public AccountingCombination getProductExpense() {
        return (AccountingCombination) get(PROPERTY_PRODUCTEXPENSE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTEXPENSE
     * 
     */
    public void setProductExpense(AccountingCombination productExpense) {
        set(PROPERTY_PRODUCTEXPENSE, productExpense);
    }

    /**
     * @see CategoryAccounts#PROPERTY_FIXEDASSET
     * 
     */
    public AccountingCombination getFixedAsset() {
        return (AccountingCombination) get(PROPERTY_FIXEDASSET);
    }
    /**
     * @see CategoryAccounts#PROPERTY_FIXEDASSET
     * 
     */
    public void setFixedAsset(AccountingCombination fixedAsset) {
        set(PROPERTY_FIXEDASSET, fixedAsset);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTCOGS
     * 
     */
    public AccountingCombination getProductCOGS() {
        return (AccountingCombination) get(PROPERTY_PRODUCTCOGS);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTCOGS
     * 
     */
    public void setProductCOGS(AccountingCombination productCOGS) {
        set(PROPERTY_PRODUCTCOGS, productCOGS);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PURCHASEPRICEVARIANCE
     * 
     */
    public AccountingCombination getPurchasePriceVariance() {
        return (AccountingCombination) get(PROPERTY_PURCHASEPRICEVARIANCE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PURCHASEPRICEVARIANCE
     * 
     */
    public void setPurchasePriceVariance(AccountingCombination purchasePriceVariance) {
        set(PROPERTY_PURCHASEPRICEVARIANCE, purchasePriceVariance);
    }

    /**
     * @see CategoryAccounts#PROPERTY_INVOICEPRICEVARIANCE
     * 
     */
    public AccountingCombination getInvoicePriceVariance() {
        return (AccountingCombination) get(PROPERTY_INVOICEPRICEVARIANCE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_INVOICEPRICEVARIANCE
     * 
     */
    public void setInvoicePriceVariance(AccountingCombination invoicePriceVariance) {
        set(PROPERTY_INVOICEPRICEVARIANCE, invoicePriceVariance);
    }

    /**
     * @see CategoryAccounts#PROPERTY_TRADEDISCOUNTRECEIVED
     * 
     */
    public AccountingCombination getTradeDiscountReceived() {
        return (AccountingCombination) get(PROPERTY_TRADEDISCOUNTRECEIVED);
    }
    /**
     * @see CategoryAccounts#PROPERTY_TRADEDISCOUNTRECEIVED
     * 
     */
    public void setTradeDiscountReceived(AccountingCombination tradeDiscountReceived) {
        set(PROPERTY_TRADEDISCOUNTRECEIVED, tradeDiscountReceived);
    }

    /**
     * @see CategoryAccounts#PROPERTY_TRADEDISCOUNTGRANTED
     * 
     */
    public AccountingCombination getTradeDiscountGranted() {
        return (AccountingCombination) get(PROPERTY_TRADEDISCOUNTGRANTED);
    }
    /**
     * @see CategoryAccounts#PROPERTY_TRADEDISCOUNTGRANTED
     * 
     */
    public void setTradeDiscountGranted(AccountingCombination tradeDiscountGranted) {
        set(PROPERTY_TRADEDISCOUNTGRANTED, tradeDiscountGranted);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTCOGSRETURN
     * 
     */
    public AccountingCombination getProductCOGSReturn() {
        return (AccountingCombination) get(PROPERTY_PRODUCTCOGSRETURN);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTCOGSRETURN
     * 
     */
    public void setProductCOGSReturn(AccountingCombination productCOGSReturn) {
        set(PROPERTY_PRODUCTCOGSRETURN, productCOGSReturn);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTREVENUERETURN
     * 
     */
    public AccountingCombination getProductRevenueReturn() {
        return (AccountingCombination) get(PROPERTY_PRODUCTREVENUERETURN);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTREVENUERETURN
     * 
     */
    public void setProductRevenueReturn(AccountingCombination productRevenueReturn) {
        set(PROPERTY_PRODUCTREVENUERETURN, productRevenueReturn);
    }

    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTDEFERREDREVENUE
     * 
     */
    public AccountingCombination getProductDeferredRevenue() {
        return (AccountingCombination) get(PROPERTY_PRODUCTDEFERREDREVENUE);
    }
    /**
     * @see CategoryAccounts#PROPERTY_PRODUCTDEFERREDREVENUE
     * 
     */
    public void setProductDeferredRevenue(AccountingCombination productDeferredRevenue) {
        set(PROPERTY_PRODUCTDEFERREDREVENUE, productDeferredRevenue);
    }

    /**
     * @see CategoryAccounts#PROPERTY_DEFEXPENSEACCT
     * 
     */
    public AccountingCombination getDefExpenseAcct() {
        return (AccountingCombination) get(PROPERTY_DEFEXPENSEACCT);
    }
    /**
     * @see CategoryAccounts#PROPERTY_DEFEXPENSEACCT
     * 
     */
    public void setDefExpenseAcct(AccountingCombination defExpenseAcct) {
        set(PROPERTY_DEFEXPENSEACCT, defExpenseAcct);
    }

}
