
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

import java.math.BigDecimal;
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
 * Entity class for entity CurrencyConversionRate (stored in table C_Conversion_Rate).
 * <br>
 * Help: {@literal The Conversion Rate defines the rates to use when converting a source currency to an
     *       accounting or reporting currency.
     *       The Conversion Rates tab is used to define conversion rates to be
     *       used when converting document amounts from one currency to another.  Conversion rates can be defined
     *       for multiple rate types.  They can also be effective for a defined range of dates.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ConversionRate extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Conversion_Rate";
    public static final String ENTITY_NAME = "CurrencyConversionRate";

    /**
     * Property id stored in column C_Conversion_Rate_ID in table C_Conversion_Rate 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Conversion_Rate 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Conversion_Rate 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Conversion_Rate 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Conversion_Rate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Conversion_Rate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Conversion_Rate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Conversion_Rate 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property currency stored in column C_Currency_ID in table C_Conversion_Rate<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property toCurrency stored in column C_Currency_ID_To in table C_Conversion_Rate<br>
     * Help: {@literal The Currency To defines the target currency for this conversion rate.}
     * 
     */
    public static final String PROPERTY_TOCURRENCY = "toCurrency";

    /**
     * Property validFromDate stored in column ValidFrom in table C_Conversion_Rate 
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property validToDate stored in column ValidTo in table C_Conversion_Rate<br>
     * Help: {@literal The Valid To date indicates the last day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDTODATE = "validToDate";

    /**
     * Property conversionRateType stored in column ConversionRateType in table C_Conversion_Rate<br>
     * Help: {@literal The Conversion Rate Type indicates the type of conversion rate.  This allows you to enter
     *       multiple rates for the same currency pair.  For example, one rate may be used for Spot conversions
     *       and a different rate for Revaluations.}
     * 
     */
    public static final String PROPERTY_CONVERSIONRATETYPE = "conversionRateType";

    /**
     * Property multipleRateBy stored in column MultiplyRate in table C_Conversion_Rate<br>
     * Help: {@literal To convert Source number to Target number, the Source is multiplied by the multiply rate. 
     *       If the Multiply Rate is entered, then the Divide Rate will be automatically calculated.}
     * 
     */
    public static final String PROPERTY_MULTIPLERATEBY = "multipleRateBy";

    /**
     * Property divideRateBy stored in column DivideRate in table C_Conversion_Rate<br>
     * Help: {@literal To convert Source number to Target number, the Source is divided by the divide rate.  If
     *       you enter a Divide Rate, the Multiply Rate will be automatically calculated.}
     * 
     */
    public static final String PROPERTY_DIVIDERATEBY = "divideRateBy";


    public ConversionRate() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CONVERSIONRATETYPE, "S");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ConversionRate#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ConversionRate#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ConversionRate#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ConversionRate#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ConversionRate#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ConversionRate#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ConversionRate#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ConversionRate#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ConversionRate#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ConversionRate#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ConversionRate#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ConversionRate#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ConversionRate#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ConversionRate#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ConversionRate#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ConversionRate#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ConversionRate#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see ConversionRate#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see ConversionRate#PROPERTY_TOCURRENCY
     * 
     */
    public Currency getToCurrency() {
        return (Currency) get(PROPERTY_TOCURRENCY);
    }
    /**
     * @see ConversionRate#PROPERTY_TOCURRENCY
     * 
     */
    public void setToCurrency(Currency toCurrency) {
        set(PROPERTY_TOCURRENCY, toCurrency);
    }

    /**
     * @see ConversionRate#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see ConversionRate#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see ConversionRate#PROPERTY_VALIDTODATE
     * 
     */
    public Date getValidToDate() {
        return (Date) get(PROPERTY_VALIDTODATE);
    }
    /**
     * @see ConversionRate#PROPERTY_VALIDTODATE
     * 
     */
    public void setValidToDate(Date validToDate) {
        set(PROPERTY_VALIDTODATE, validToDate);
    }

    /**
     * @see ConversionRate#PROPERTY_CONVERSIONRATETYPE
     * 
     */
    public String getConversionRateType() {
        return (String) get(PROPERTY_CONVERSIONRATETYPE);
    }
    /**
     * @see ConversionRate#PROPERTY_CONVERSIONRATETYPE
     * 
     */
    public void setConversionRateType(String conversionRateType) {
        set(PROPERTY_CONVERSIONRATETYPE, conversionRateType);
    }

    /**
     * @see ConversionRate#PROPERTY_MULTIPLERATEBY
     * 
     */
    public BigDecimal getMultipleRateBy() {
        return (BigDecimal) get(PROPERTY_MULTIPLERATEBY);
    }
    /**
     * @see ConversionRate#PROPERTY_MULTIPLERATEBY
     * 
     */
    public void setMultipleRateBy(BigDecimal multipleRateBy) {
        set(PROPERTY_MULTIPLERATEBY, multipleRateBy);
    }

    /**
     * @see ConversionRate#PROPERTY_DIVIDERATEBY
     * 
     */
    public BigDecimal getDivideRateBy() {
        return (BigDecimal) get(PROPERTY_DIVIDERATEBY);
    }
    /**
     * @see ConversionRate#PROPERTY_DIVIDERATEBY
     * 
     */
    public void setDivideRateBy(BigDecimal divideRateBy) {
        set(PROPERTY_DIVIDERATEBY, divideRateBy);
    }

}
