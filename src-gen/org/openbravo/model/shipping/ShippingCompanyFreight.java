
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
package org.openbravo.model.shipping;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.common.geography.Region;
/**
 * Entity class for entity ShippingShippingCompanyFreight (stored in table M_Freight).
 * <br>
 * Help: {@literal Freight Rates for Shipper}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ShippingCompanyFreight extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Freight";
    public static final String ENTITY_NAME = "ShippingShippingCompanyFreight";

    /**
     * Property id stored in column M_Freight_ID in table M_Freight 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Freight 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Freight 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Freight 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Freight 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Freight 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Freight 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Freight 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property shippingCompany stored in column M_Shipper_ID in table M_Freight<br>
     * Help: {@literal The Shipper is any entity which will provide shipping to or shipping from an
     *       Organization.}
     * 
     */
    public static final String PROPERTY_SHIPPINGCOMPANY = "shippingCompany";

    /**
     * Property freightCategory stored in column M_FreightCategory_ID in table M_Freight<br>
     * Help: {@literal Freight Categories are used to calculate the Freight for the Shipper selected}
     * 
     */
    public static final String PROPERTY_FREIGHTCATEGORY = "freightCategory";

    /**
     * Property validFromDate stored in column ValidFrom in table M_Freight<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property country stored in column C_Country_ID in table M_Freight<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * 
     */
    public static final String PROPERTY_COUNTRY = "country";

    /**
     * Property destinationCountry stored in column To_Country_ID in table M_Freight<br>
     * Help: {@literal The To Country indicates the receiving country on a document}
     * 
     */
    public static final String PROPERTY_DESTINATIONCOUNTRY = "destinationCountry";

    /**
     * Property region stored in column C_Region_ID in table M_Freight<br>
     * Help: {@literal The Region identifies a unique Region for this Country.}
     * 
     */
    public static final String PROPERTY_REGION = "region";

    /**
     * Property destinationRegion stored in column To_Region_ID in table M_Freight<br>
     * Help: {@literal The To Region indicates the receiving region on a document}
     * 
     */
    public static final String PROPERTY_DESTINATIONREGION = "destinationRegion";

    /**
     * Property currency stored in column C_Currency_ID in table M_Freight<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property freightAmount stored in column FreightAmt in table M_Freight<br>
     * Help: {@literal The Freight Amount indicates the amount charged for Freight in the document currency.}
     * 
     */
    public static final String PROPERTY_FREIGHTAMOUNT = "freightAmount";

    /**
     * Property freightUOM stored in column Freight_Unit in table M_Freight<br>
     * Help: {@literal It is the unit how the quantity is given.}
     * 
     */
    public static final String PROPERTY_FREIGHTUOM = "freightUOM";

    /**
     * Property price stored in column Isprice in table M_Freight<br>
     * Help: {@literal This field indicates if it is a fixed price or it is per unit.}
     * 
     */
    public static final String PROPERTY_PRICE = "price";

    /**
     * Property roundLine stored in column Line_Round in table M_Freight<br>
     * Help: {@literal How units are rounded for each of the in-out lines.}
     * 
     */
    public static final String PROPERTY_ROUNDLINE = "roundLine";

    /**
     * Property minQuantity stored in column Qtyfrom in table M_Freight<br>
     * Help: {@literal Lowest quantity}
     * 
     */
    public static final String PROPERTY_MINQUANTITY = "minQuantity";

    /**
     * Property maxQuanity stored in column Qtyto in table M_Freight<br>
     * Help: {@literal Highest quantity}
     * 
     */
    public static final String PROPERTY_MAXQUANITY = "maxQuanity";

    /**
     * Property roundTotal stored in column Total_Round in table M_Freight<br>
     * Help: {@literal How units are rounded for the whole in-out.}
     * 
     */
    public static final String PROPERTY_ROUNDTOTAL = "roundTotal";


    public ShippingCompanyFreight() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PRICE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public ShippingCompany getShippingCompany() {
        return (ShippingCompany) get(PROPERTY_SHIPPINGCOMPANY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public void setShippingCompany(ShippingCompany shippingCompany) {
        set(PROPERTY_SHIPPINGCOMPANY, shippingCompany);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_FREIGHTCATEGORY
     * 
     */
    public FreightCategory getFreightCategory() {
        return (FreightCategory) get(PROPERTY_FREIGHTCATEGORY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_FREIGHTCATEGORY
     * 
     */
    public void setFreightCategory(FreightCategory freightCategory) {
        set(PROPERTY_FREIGHTCATEGORY, freightCategory);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_COUNTRY
     * 
     */
    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_COUNTRY
     * 
     */
    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_DESTINATIONCOUNTRY
     * 
     */
    public Country getDestinationCountry() {
        return (Country) get(PROPERTY_DESTINATIONCOUNTRY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_DESTINATIONCOUNTRY
     * 
     */
    public void setDestinationCountry(Country destinationCountry) {
        set(PROPERTY_DESTINATIONCOUNTRY, destinationCountry);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_REGION
     * 
     */
    public Region getRegion() {
        return (Region) get(PROPERTY_REGION);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_REGION
     * 
     */
    public void setRegion(Region region) {
        set(PROPERTY_REGION, region);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_DESTINATIONREGION
     * 
     */
    public Region getDestinationRegion() {
        return (Region) get(PROPERTY_DESTINATIONREGION);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_DESTINATIONREGION
     * 
     */
    public void setDestinationRegion(Region destinationRegion) {
        set(PROPERTY_DESTINATIONREGION, destinationRegion);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public BigDecimal getFreightAmount() {
        return (BigDecimal) get(PROPERTY_FREIGHTAMOUNT);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        set(PROPERTY_FREIGHTAMOUNT, freightAmount);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_FREIGHTUOM
     * 
     */
    public String getFreightUOM() {
        return (String) get(PROPERTY_FREIGHTUOM);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_FREIGHTUOM
     * 
     */
    public void setFreightUOM(String freightUOM) {
        set(PROPERTY_FREIGHTUOM, freightUOM);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_PRICE
     * 
     */
    public Boolean isPrice() {
        return (Boolean) get(PROPERTY_PRICE);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_PRICE
     * 
     */
    public void setPrice(Boolean price) {
        set(PROPERTY_PRICE, price);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_ROUNDLINE
     * 
     */
    public String getRoundLine() {
        return (String) get(PROPERTY_ROUNDLINE);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_ROUNDLINE
     * 
     */
    public void setRoundLine(String roundLine) {
        set(PROPERTY_ROUNDLINE, roundLine);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_MINQUANTITY
     * 
     */
    public BigDecimal getMinQuantity() {
        return (BigDecimal) get(PROPERTY_MINQUANTITY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_MINQUANTITY
     * 
     */
    public void setMinQuantity(BigDecimal minQuantity) {
        set(PROPERTY_MINQUANTITY, minQuantity);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_MAXQUANITY
     * 
     */
    public BigDecimal getMaxQuanity() {
        return (BigDecimal) get(PROPERTY_MAXQUANITY);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_MAXQUANITY
     * 
     */
    public void setMaxQuanity(BigDecimal maxQuanity) {
        set(PROPERTY_MAXQUANITY, maxQuanity);
    }

    /**
     * @see ShippingCompanyFreight#PROPERTY_ROUNDTOTAL
     * 
     */
    public String getRoundTotal() {
        return (String) get(PROPERTY_ROUNDTOTAL);
    }
    /**
     * @see ShippingCompanyFreight#PROPERTY_ROUNDTOTAL
     * 
     */
    public void setRoundTotal(String roundTotal) {
        set(PROPERTY_ROUNDTOTAL, roundTotal);
    }

}
