
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
package org.openbravo.model.common.currency;

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
/**
 * Entity class for entity Currency (stored in table C_Currency).
 * <br>
 * Help: {@literal The Currency defines any currency you will transact with or report in.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Currency extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Currency";
    public static final String ENTITY_NAME = "Currency";

    /**
     * Property id stored in column C_Currency_ID in table C_Currency<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Currency 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Currency 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Currency 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Currency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Currency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Currency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Currency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property iSOCode stored in column ISO_Code in table C_Currency 
     * 
     */
    public static final String PROPERTY_ISOCODE = "iSOCode";

    /**
     * Property symbol stored in column CurSymbol in table C_Currency<br>
     * Help: {@literal The Currency Symbol defines the symbol that will print when this currency is used.}
     * 
     */
    public static final String PROPERTY_SYMBOL = "symbol";

    /**
     * Property description stored in column Description in table C_Currency<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property standardPrecision stored in column StdPrecision in table C_Currency<br>
     * Help: {@literal The Standard Precision defines the number of decimal places that amounts will be rounded
     *       to for accounting transactions and documents.}
     * 
     */
    public static final String PROPERTY_STANDARDPRECISION = "standardPrecision";

    /**
     * Property costingPrecision stored in column CostingPrecision in table C_Currency<br>
     * Help: {@literal The Costing Precision defines the number of decimal places that amounts will be rounded to
     *       when performing costing calculations.}
     * 
     */
    public static final String PROPERTY_COSTINGPRECISION = "costingPrecision";

    /**
     * Property pricePrecision stored in column PricePrecision in table C_Currency<br>
     * Help: {@literal Defines the number of decimal positions that the prices are displayed with.}
     * 
     */
    public static final String PROPERTY_PRICEPRECISION = "pricePrecision";

    /**
     * Property currencySymbolAtTheRight stored in column Issymbolrightside in table C_Currency<br>
     * Help: {@literal A mean to indicate if the currency symbol ($, €, ¥, ...) is placed at the right side of
     *       the amount or not. Its default value is 'No'.}
     * 
     */
    public static final String PROPERTY_CURRENCYSYMBOLATTHERIGHT = "currencySymbolAtTheRight";

    /**
     * Property countryList stored in table C_Currency
     * 
     */
    public static final String PROPERTY_COUNTRYLIST = "countryList";

    /**
     * Property currencyConversionRateList stored in table C_Currency
     * 
     */
    public static final String PROPERTY_CURRENCYCONVERSIONRATELIST = "currencyConversionRateList";

    /**
     * Property currencyTrlList stored in table C_Currency
     * 
     */
    public static final String PROPERTY_CURRENCYTRLLIST = "currencyTrlList";


    public Currency() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_STANDARDPRECISION, (long) 2);
        setDefaultValue(PROPERTY_COSTINGPRECISION, (long) 4);
        setDefaultValue(PROPERTY_PRICEPRECISION, (long) 0);
        setDefaultValue(PROPERTY_CURRENCYSYMBOLATTHERIGHT, false);
        setDefaultValue(PROPERTY_COUNTRYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CURRENCYCONVERSIONRATELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CURRENCYTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Currency#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Currency#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Currency#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Currency#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Currency#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Currency#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Currency#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Currency#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Currency#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Currency#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Currency#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Currency#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Currency#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Currency#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Currency#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Currency#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Currency#PROPERTY_ISOCODE
     * 
     */
    public String getISOCode() {
        return (String) get(PROPERTY_ISOCODE);
    }
    /**
     * @see Currency#PROPERTY_ISOCODE
     * 
     */
    public void setISOCode(String iSOCode) {
        set(PROPERTY_ISOCODE, iSOCode);
    }

    /**
     * @see Currency#PROPERTY_SYMBOL
     * 
     */
    public String getSymbol() {
        return (String) get(PROPERTY_SYMBOL);
    }
    /**
     * @see Currency#PROPERTY_SYMBOL
     * 
     */
    public void setSymbol(String symbol) {
        set(PROPERTY_SYMBOL, symbol);
    }

    /**
     * @see Currency#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Currency#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Currency#PROPERTY_STANDARDPRECISION
     * 
     */
    public Long getStandardPrecision() {
        return (Long) get(PROPERTY_STANDARDPRECISION);
    }
    /**
     * @see Currency#PROPERTY_STANDARDPRECISION
     * 
     */
    public void setStandardPrecision(Long standardPrecision) {
        set(PROPERTY_STANDARDPRECISION, standardPrecision);
    }

    /**
     * @see Currency#PROPERTY_COSTINGPRECISION
     * 
     */
    public Long getCostingPrecision() {
        return (Long) get(PROPERTY_COSTINGPRECISION);
    }
    /**
     * @see Currency#PROPERTY_COSTINGPRECISION
     * 
     */
    public void setCostingPrecision(Long costingPrecision) {
        set(PROPERTY_COSTINGPRECISION, costingPrecision);
    }

    /**
     * @see Currency#PROPERTY_PRICEPRECISION
     * 
     */
    public Long getPricePrecision() {
        return (Long) get(PROPERTY_PRICEPRECISION);
    }
    /**
     * @see Currency#PROPERTY_PRICEPRECISION
     * 
     */
    public void setPricePrecision(Long pricePrecision) {
        set(PROPERTY_PRICEPRECISION, pricePrecision);
    }

    /**
     * @see Currency#PROPERTY_CURRENCYSYMBOLATTHERIGHT
     * 
     */
    public Boolean isCurrencySymbolAtTheRight() {
        return (Boolean) get(PROPERTY_CURRENCYSYMBOLATTHERIGHT);
    }
    /**
     * @see Currency#PROPERTY_CURRENCYSYMBOLATTHERIGHT
     * 
     */
    public void setCurrencySymbolAtTheRight(Boolean currencySymbolAtTheRight) {
        set(PROPERTY_CURRENCYSYMBOLATTHERIGHT, currencySymbolAtTheRight);
    }

    /**
     * Help: {@literal The Country Tab defines any country in which you do business.  Values entered here are
     *       referenced in location records for Business Partners.}<br>
     * @see Country
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Country> getCountryList() {
      return (List<Country>) get(PROPERTY_COUNTRYLIST);
    }

    /**
     * Help: {@literal The Country Tab defines any country in which you do business.  Values entered here are
     *       referenced in location records for Business Partners.}<br>
     * @see Country
     * 
     */
    public void setCountryList(List<Country> countryList) {
        set(PROPERTY_COUNTRYLIST, countryList);
    }

    /**
     * Help: {@literal The Conversion Rate defines the rates to use when converting a source currency to an
     *       accounting or reporting currency.
     *       The Conversion Rates tab is used to define conversion rates to be
     *       used when converting document amounts from one currency to another.  Conversion rates can be defined
     *       for multiple rate types.  They can also be effective for a defined range of dates.}<br>
     * @see ConversionRate
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ConversionRate> getCurrencyConversionRateList() {
      return (List<ConversionRate>) get(PROPERTY_CURRENCYCONVERSIONRATELIST);
    }

    /**
     * Help: {@literal The Conversion Rate defines the rates to use when converting a source currency to an
     *       accounting or reporting currency.
     *       The Conversion Rates tab is used to define conversion rates to be
     *       used when converting document amounts from one currency to another.  Conversion rates can be defined
     *       for multiple rate types.  They can also be effective for a defined range of dates.}<br>
     * @see ConversionRate
     * 
     */
    public void setCurrencyConversionRateList(List<ConversionRate> currencyConversionRateList) {
        set(PROPERTY_CURRENCYCONVERSIONRATELIST, currencyConversionRateList);
    }

    /**
     * Help: {@literal Translations for currencies}<br>
     * @see CurrencyTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CurrencyTrl> getCurrencyTrlList() {
      return (List<CurrencyTrl>) get(PROPERTY_CURRENCYTRLLIST);
    }

    /**
     * Help: {@literal Translations for currencies}<br>
     * @see CurrencyTrl
     * 
     */
    public void setCurrencyTrlList(List<CurrencyTrl> currencyTrlList) {
        set(PROPERTY_CURRENCYTRLLIST, currencyTrlList);
    }

}
