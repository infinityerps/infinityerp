
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.common.geography.Region;
/**
 * Entity class for entity FinancialMgmtTaxRate (stored in table C_Tax).
 * <br>
 * Help: {@literal The Tax Rate Window defines the different taxes used for each tax category.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TaxRate extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Tax";
    public static final String ENTITY_NAME = "FinancialMgmtTaxRate";

    /**
     * Property id stored in column C_Tax_ID in table C_Tax<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Tax 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Tax 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Tax 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Tax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Tax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Tax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property name stored in column Name in table C_Tax 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Tax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table C_Tax<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property taxSearchKey stored in column TaxIndicator in table C_Tax<br>
     * Help: {@literal The Tax Indicator identifies the short name that will print on documents referencing this
     *       tax.}
     * 
     */
    public static final String PROPERTY_TAXSEARCHKEY = "taxSearchKey";

    /**
     * Property validFromDate stored in column ValidFrom in table C_Tax<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property summaryLevel stored in column IsSummary in table C_Tax<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property rate stored in column Rate in table C_Tax<br>
     * Help: {@literal The Rate indicates the percentage to be multiplied by the source to arrive at the tax or
     *       exchange amount.}
     * 
     */
    public static final String PROPERTY_RATE = "rate";

    /**
     * Property parentTaxRate stored in column Parent_Tax_ID in table C_Tax<br>
     * Help: {@literal The Parent Tax indicates a tax that is a reference for multiple taxes.  This allows you to
     *       charge multiple taxes on a document by entering the Parent Tax}
     * 
     */
    public static final String PROPERTY_PARENTTAXRATE = "parentTaxRate";

    /**
     * Property country stored in column C_Country_ID in table C_Tax<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * 
     */
    public static final String PROPERTY_COUNTRY = "country";

    /**
     * Property region stored in column C_Region_ID in table C_Tax<br>
     * Help: {@literal The Region identifies a unique Region for this Country.}
     * 
     */
    public static final String PROPERTY_REGION = "region";

    /**
     * Property destinationCountry stored in column To_Country_ID in table C_Tax<br>
     * Help: {@literal The To Country indicates the receiving country on a document}
     * 
     */
    public static final String PROPERTY_DESTINATIONCOUNTRY = "destinationCountry";

    /**
     * Property destinationRegion stored in column To_Region_ID in table C_Tax<br>
     * Help: {@literal The To Region indicates the receiving region on a document}
     * 
     */
    public static final String PROPERTY_DESTINATIONREGION = "destinationRegion";

    /**
     * Property taxCategory stored in column C_TaxCategory_ID in table C_Tax<br>
     * Help: {@literal The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or
     *       Value Added Tax.}
     * 
     */
    public static final String PROPERTY_TAXCATEGORY = "taxCategory";

    /**
     * Property default stored in column IsDefault in table C_Tax<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property taxExempt stored in column IsTaxExempt in table C_Tax<br>
     * Help: {@literal If a business partner is exempt from tax, the exempt tax rate is used. For this, you need
     *       to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is
     *       required for tax reporting, so that you can track tax exempt transactions.}
     * 
     */
    public static final String PROPERTY_TAXEXEMPT = "taxExempt";

    /**
     * Property salesPurchaseType stored in column SOPOType in table C_Tax<br>
     * Help: {@literal Sales Tax: charged when selling - examples: Sales Tax, Output VAT (payable)Purchase Tax:
     *       tax charged when purchasing - examples: Use Tax, Input VAT (receivable)}
     * 
     */
    public static final String PROPERTY_SALESPURCHASETYPE = "salesPurchaseType";

    /**
     * Property cascade stored in column Cascade in table C_Tax<br>
     * Help: {@literal Indicates if it is applied in an accumulative way or if it is applied to the base amount.}
     * 
     */
    public static final String PROPERTY_CASCADE = "cascade";

    /**
     * Property businessPartnerTaxCategory stored in column C_BP_TaxCategory_ID in table C_Tax<br>
     * Help: {@literal Bussines Partner Tax Category is a category defined for applying default taxes to
     *       procurement transactions.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERTAXCATEGORY = "businessPartnerTaxCategory";

    /**
     * Property lineNo stored in column Line in table C_Tax<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property withholdingTax stored in column IsWithholdingTax in table C_Tax<br>
     * Help: {@literal Describe if the tax is included in the Withholding's Calculation.}
     * 
     */
    public static final String PROPERTY_WITHHOLDINGTAX = "withholdingTax";

    /**
     * Property notTaxable stored in column IsNoTaxable in table C_Tax<br>
     * Help: {@literal Check if it is not taxable}
     * 
     */
    public static final String PROPERTY_NOTTAXABLE = "notTaxable";

    /**
     * Property deductableRate stored in column Deducpercent in table C_Tax<br>
     * Help: {@literal It is the deductible percentage}
     * 
     */
    public static final String PROPERTY_DEDUCTABLERATE = "deductableRate";

    /**
     * Property originalRate stored in column Originalrate in table C_Tax<br>
     * Help: {@literal Original Rate}
     * 
     */
    public static final String PROPERTY_ORIGINALRATE = "originalRate";

    /**
     * Property notTaxdeductable stored in column IsTaxUndeductable in table C_Tax<br>
     * Help: {@literal Check it if the tax is not deductible}
     * 
     */
    public static final String PROPERTY_NOTTAXDEDUCTABLE = "notTaxdeductable";

    /**
     * Property istaxdeductable stored in column IsTaxDeductable in table C_Tax<br>
     * Help: {@literal If active, this rate will behave as a tax deductible rate, no matter if the organization
     *       where used is tax deductible or not.}
     * 
     */
    public static final String PROPERTY_ISTAXDEDUCTABLE = "istaxdeductable";

    /**
     * Property noVAT stored in column IsNoVAT in table C_Tax<br>
     * Help: {@literal Is no VAT}
     * 
     */
    public static final String PROPERTY_NOVAT = "noVAT";

    /**
     * Property baseAmount stored in column BaseAmount in table C_Tax<br>
     * Help: {@literal Base Amount to be used as base for the calculation. Line net amount or alternate line net
     *       amount can be selected as base for the tax calculation.}
     * 
     */
    public static final String PROPERTY_BASEAMOUNT = "baseAmount";

    /**
     * Property taxBase stored in column C_TaxBase_ID in table C_Tax<br>
     * Help: {@literal The amount of the tax selected here will be used as tax base amount for the tax
     *       calculation.}
     * 
     */
    public static final String PROPERTY_TAXBASE = "taxBase";

    /**
     * Property docTaxAmount stored in column DocTaxAmount in table C_Tax<br>
     * Help: {@literal Criteria used for the calculation of tax base amount at document level.}
     * 
     */
    public static final String PROPERTY_DOCTAXAMOUNT = "docTaxAmount";

    /**
     * Property isCashVAT stored in column IsCashVAT in table C_Tax<br>
     * Help: {@literal Cash VAT tax rate}
     * 
     */
    public static final String PROPERTY_ISCASHVAT = "isCashVAT";

    /**
     * Property searchKey stored in column Value in table C_Tax<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property financialMgmtTaxRateParentTaxRateList stored in table C_Tax
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXRATEPARENTTAXRATELIST = "financialMgmtTaxRateParentTaxRateList";

    /**
     * Property financialMgmtTaxRateAccountsList stored in table C_Tax
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXRATEACCOUNTSLIST = "financialMgmtTaxRateAccountsList";

    /**
     * Property financialMgmtTaxTrlList stored in table C_Tax
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXTRLLIST = "financialMgmtTaxTrlList";

    /**
     * Property financialMgmtTaxZoneList stored in table C_Tax
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXZONELIST = "financialMgmtTaxZoneList";


    public TaxRate() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_TAXEXEMPT, false);
        setDefaultValue(PROPERTY_SALESPURCHASETYPE, "B");
        setDefaultValue(PROPERTY_CASCADE, false);
        setDefaultValue(PROPERTY_WITHHOLDINGTAX, false);
        setDefaultValue(PROPERTY_NOTTAXABLE, false);
        setDefaultValue(PROPERTY_NOTTAXDEDUCTABLE, false);
        setDefaultValue(PROPERTY_ISTAXDEDUCTABLE, false);
        setDefaultValue(PROPERTY_NOVAT, false);
        setDefaultValue(PROPERTY_BASEAMOUNT, "LNA");
        setDefaultValue(PROPERTY_DOCTAXAMOUNT, "D");
        setDefaultValue(PROPERTY_ISCASHVAT, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXRATEPARENTTAXRATELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXRATEACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXZONELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TaxRate#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TaxRate#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TaxRate#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TaxRate#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TaxRate#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TaxRate#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TaxRate#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TaxRate#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TaxRate#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TaxRate#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TaxRate#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TaxRate#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TaxRate#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TaxRate#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TaxRate#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see TaxRate#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see TaxRate#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TaxRate#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TaxRate#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see TaxRate#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see TaxRate#PROPERTY_TAXSEARCHKEY
     * 
     */
    public String getTaxSearchKey() {
        return (String) get(PROPERTY_TAXSEARCHKEY);
    }
    /**
     * @see TaxRate#PROPERTY_TAXSEARCHKEY
     * 
     */
    public void setTaxSearchKey(String taxSearchKey) {
        set(PROPERTY_TAXSEARCHKEY, taxSearchKey);
    }

    /**
     * @see TaxRate#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see TaxRate#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see TaxRate#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see TaxRate#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see TaxRate#PROPERTY_RATE
     * 
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(PROPERTY_RATE);
    }
    /**
     * @see TaxRate#PROPERTY_RATE
     * 
     */
    public void setRate(BigDecimal rate) {
        set(PROPERTY_RATE, rate);
    }

    /**
     * @see TaxRate#PROPERTY_PARENTTAXRATE
     * 
     */
    public TaxRate getParentTaxRate() {
        return (TaxRate) get(PROPERTY_PARENTTAXRATE);
    }
    /**
     * @see TaxRate#PROPERTY_PARENTTAXRATE
     * 
     */
    public void setParentTaxRate(TaxRate parentTaxRate) {
        set(PROPERTY_PARENTTAXRATE, parentTaxRate);
    }

    /**
     * @see TaxRate#PROPERTY_COUNTRY
     * 
     */
    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }
    /**
     * @see TaxRate#PROPERTY_COUNTRY
     * 
     */
    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

    /**
     * @see TaxRate#PROPERTY_REGION
     * 
     */
    public Region getRegion() {
        return (Region) get(PROPERTY_REGION);
    }
    /**
     * @see TaxRate#PROPERTY_REGION
     * 
     */
    public void setRegion(Region region) {
        set(PROPERTY_REGION, region);
    }

    /**
     * @see TaxRate#PROPERTY_DESTINATIONCOUNTRY
     * 
     */
    public Country getDestinationCountry() {
        return (Country) get(PROPERTY_DESTINATIONCOUNTRY);
    }
    /**
     * @see TaxRate#PROPERTY_DESTINATIONCOUNTRY
     * 
     */
    public void setDestinationCountry(Country destinationCountry) {
        set(PROPERTY_DESTINATIONCOUNTRY, destinationCountry);
    }

    /**
     * @see TaxRate#PROPERTY_DESTINATIONREGION
     * 
     */
    public Region getDestinationRegion() {
        return (Region) get(PROPERTY_DESTINATIONREGION);
    }
    /**
     * @see TaxRate#PROPERTY_DESTINATIONREGION
     * 
     */
    public void setDestinationRegion(Region destinationRegion) {
        set(PROPERTY_DESTINATIONREGION, destinationRegion);
    }

    /**
     * @see TaxRate#PROPERTY_TAXCATEGORY
     * 
     */
    public TaxCategory getTaxCategory() {
        return (TaxCategory) get(PROPERTY_TAXCATEGORY);
    }
    /**
     * @see TaxRate#PROPERTY_TAXCATEGORY
     * 
     */
    public void setTaxCategory(TaxCategory taxCategory) {
        set(PROPERTY_TAXCATEGORY, taxCategory);
    }

    /**
     * @see TaxRate#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see TaxRate#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see TaxRate#PROPERTY_TAXEXEMPT
     * 
     */
    public Boolean isTaxExempt() {
        return (Boolean) get(PROPERTY_TAXEXEMPT);
    }
    /**
     * @see TaxRate#PROPERTY_TAXEXEMPT
     * 
     */
    public void setTaxExempt(Boolean taxExempt) {
        set(PROPERTY_TAXEXEMPT, taxExempt);
    }

    /**
     * @see TaxRate#PROPERTY_SALESPURCHASETYPE
     * 
     */
    public String getSalesPurchaseType() {
        return (String) get(PROPERTY_SALESPURCHASETYPE);
    }
    /**
     * @see TaxRate#PROPERTY_SALESPURCHASETYPE
     * 
     */
    public void setSalesPurchaseType(String salesPurchaseType) {
        set(PROPERTY_SALESPURCHASETYPE, salesPurchaseType);
    }

    /**
     * @see TaxRate#PROPERTY_CASCADE
     * 
     */
    public Boolean isCascade() {
        return (Boolean) get(PROPERTY_CASCADE);
    }
    /**
     * @see TaxRate#PROPERTY_CASCADE
     * 
     */
    public void setCascade(Boolean cascade) {
        set(PROPERTY_CASCADE, cascade);
    }

    /**
     * @see TaxRate#PROPERTY_BUSINESSPARTNERTAXCATEGORY
     * 
     */
    public org.openbravo.model.common.businesspartner.TaxCategory getBusinessPartnerTaxCategory() {
        return (org.openbravo.model.common.businesspartner.TaxCategory) get(PROPERTY_BUSINESSPARTNERTAXCATEGORY);
    }
    /**
     * @see TaxRate#PROPERTY_BUSINESSPARTNERTAXCATEGORY
     * 
     */
    public void setBusinessPartnerTaxCategory(org.openbravo.model.common.businesspartner.TaxCategory businessPartnerTaxCategory) {
        set(PROPERTY_BUSINESSPARTNERTAXCATEGORY, businessPartnerTaxCategory);
    }

    /**
     * @see TaxRate#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see TaxRate#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see TaxRate#PROPERTY_WITHHOLDINGTAX
     * 
     */
    public Boolean isWithholdingTax() {
        return (Boolean) get(PROPERTY_WITHHOLDINGTAX);
    }
    /**
     * @see TaxRate#PROPERTY_WITHHOLDINGTAX
     * 
     */
    public void setWithholdingTax(Boolean withholdingTax) {
        set(PROPERTY_WITHHOLDINGTAX, withholdingTax);
    }

    /**
     * @see TaxRate#PROPERTY_NOTTAXABLE
     * 
     */
    public Boolean isNotTaxable() {
        return (Boolean) get(PROPERTY_NOTTAXABLE);
    }
    /**
     * @see TaxRate#PROPERTY_NOTTAXABLE
     * 
     */
    public void setNotTaxable(Boolean notTaxable) {
        set(PROPERTY_NOTTAXABLE, notTaxable);
    }

    /**
     * @see TaxRate#PROPERTY_DEDUCTABLERATE
     * 
     */
    public BigDecimal getDeductableRate() {
        return (BigDecimal) get(PROPERTY_DEDUCTABLERATE);
    }
    /**
     * @see TaxRate#PROPERTY_DEDUCTABLERATE
     * 
     */
    public void setDeductableRate(BigDecimal deductableRate) {
        set(PROPERTY_DEDUCTABLERATE, deductableRate);
    }

    /**
     * @see TaxRate#PROPERTY_ORIGINALRATE
     * 
     */
    public BigDecimal getOriginalRate() {
        return (BigDecimal) get(PROPERTY_ORIGINALRATE);
    }
    /**
     * @see TaxRate#PROPERTY_ORIGINALRATE
     * 
     */
    public void setOriginalRate(BigDecimal originalRate) {
        set(PROPERTY_ORIGINALRATE, originalRate);
    }

    /**
     * @see TaxRate#PROPERTY_NOTTAXDEDUCTABLE
     * 
     */
    public Boolean isNotTaxdeductable() {
        return (Boolean) get(PROPERTY_NOTTAXDEDUCTABLE);
    }
    /**
     * @see TaxRate#PROPERTY_NOTTAXDEDUCTABLE
     * 
     */
    public void setNotTaxdeductable(Boolean notTaxdeductable) {
        set(PROPERTY_NOTTAXDEDUCTABLE, notTaxdeductable);
    }

    /**
     * @see TaxRate#PROPERTY_ISTAXDEDUCTABLE
     * 
     */
    public Boolean isTaxdeductable() {
        return (Boolean) get(PROPERTY_ISTAXDEDUCTABLE);
    }
    /**
     * @see TaxRate#PROPERTY_ISTAXDEDUCTABLE
     * 
     */
    public void setTaxdeductable(Boolean istaxdeductable) {
        set(PROPERTY_ISTAXDEDUCTABLE, istaxdeductable);
    }

    /**
     * @see TaxRate#PROPERTY_NOVAT
     * 
     */
    public Boolean isNoVAT() {
        return (Boolean) get(PROPERTY_NOVAT);
    }
    /**
     * @see TaxRate#PROPERTY_NOVAT
     * 
     */
    public void setNoVAT(Boolean noVAT) {
        set(PROPERTY_NOVAT, noVAT);
    }

    /**
     * @see TaxRate#PROPERTY_BASEAMOUNT
     * 
     */
    public String getBaseAmount() {
        return (String) get(PROPERTY_BASEAMOUNT);
    }
    /**
     * @see TaxRate#PROPERTY_BASEAMOUNT
     * 
     */
    public void setBaseAmount(String baseAmount) {
        set(PROPERTY_BASEAMOUNT, baseAmount);
    }

    /**
     * @see TaxRate#PROPERTY_TAXBASE
     * 
     */
    public TaxRate getTaxBase() {
        return (TaxRate) get(PROPERTY_TAXBASE);
    }
    /**
     * @see TaxRate#PROPERTY_TAXBASE
     * 
     */
    public void setTaxBase(TaxRate taxBase) {
        set(PROPERTY_TAXBASE, taxBase);
    }

    /**
     * @see TaxRate#PROPERTY_DOCTAXAMOUNT
     * 
     */
    public String getDocTaxAmount() {
        return (String) get(PROPERTY_DOCTAXAMOUNT);
    }
    /**
     * @see TaxRate#PROPERTY_DOCTAXAMOUNT
     * 
     */
    public void setDocTaxAmount(String docTaxAmount) {
        set(PROPERTY_DOCTAXAMOUNT, docTaxAmount);
    }

    /**
     * @see TaxRate#PROPERTY_ISCASHVAT
     * 
     */
    public Boolean isCashVAT() {
        return (Boolean) get(PROPERTY_ISCASHVAT);
    }
    /**
     * @see TaxRate#PROPERTY_ISCASHVAT
     * 
     */
    public void setCashVAT(Boolean isCashVAT) {
        set(PROPERTY_ISCASHVAT, isCashVAT);
    }

    /**
     * @see TaxRate#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see TaxRate#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * Help: {@literal The Tax Rate Window defines the different taxes used for each tax category.}<br>
     * @see TaxRate
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxRate> getFinancialMgmtTaxRateParentTaxRateList() {
      return (List<TaxRate>) get(PROPERTY_FINANCIALMGMTTAXRATEPARENTTAXRATELIST);
    }

    /**
     * Help: {@literal The Tax Rate Window defines the different taxes used for each tax category.}<br>
     * @see TaxRate
     * 
     */
    public void setFinancialMgmtTaxRateParentTaxRateList(List<TaxRate> financialMgmtTaxRateParentTaxRateList) {
        set(PROPERTY_FINANCIALMGMTTAXRATEPARENTTAXRATELIST, financialMgmtTaxRateParentTaxRateList);
    }

    /**
     * Help: {@literal Defines the accounting parameters to be used for transactions referencing this Tax Rate.}<br>
     * @see TaxRateAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxRateAccounts> getFinancialMgmtTaxRateAccountsList() {
      return (List<TaxRateAccounts>) get(PROPERTY_FINANCIALMGMTTAXRATEACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the accounting parameters to be used for transactions referencing this Tax Rate.}<br>
     * @see TaxRateAccounts
     * 
     */
    public void setFinancialMgmtTaxRateAccountsList(List<TaxRateAccounts> financialMgmtTaxRateAccountsList) {
        set(PROPERTY_FINANCIALMGMTTAXRATEACCOUNTSLIST, financialMgmtTaxRateAccountsList);
    }

    /**
     * Help: {@literal Translations for taxes.}<br>
     * @see TaxTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxTrl> getFinancialMgmtTaxTrlList() {
      return (List<TaxTrl>) get(PROPERTY_FINANCIALMGMTTAXTRLLIST);
    }

    /**
     * Help: {@literal Translations for taxes.}<br>
     * @see TaxTrl
     * 
     */
    public void setFinancialMgmtTaxTrlList(List<TaxTrl> financialMgmtTaxTrlList) {
        set(PROPERTY_FINANCIALMGMTTAXTRLLIST, financialMgmtTaxTrlList);
    }

    /**
     * Help: {@literal Defines the zones where the tax is applicable.}<br>
     * @see TaxZone
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxZone> getFinancialMgmtTaxZoneList() {
      return (List<TaxZone>) get(PROPERTY_FINANCIALMGMTTAXZONELIST);
    }

    /**
     * Help: {@literal Defines the zones where the tax is applicable.}<br>
     * @see TaxZone
     * 
     */
    public void setFinancialMgmtTaxZoneList(List<TaxZone> financialMgmtTaxZoneList) {
        set(PROPERTY_FINANCIALMGMTTAXZONELIST, financialMgmtTaxZoneList);
    }

}
