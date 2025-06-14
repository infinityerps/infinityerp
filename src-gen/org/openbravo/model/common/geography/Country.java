
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
package org.openbravo.model.common.geography;

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
import org.openbravo.model.ad.system.Language;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity Country (stored in table C_Country).
 * <br>
 * Help: {@literal The Country Tab defines any country in which you do business.  Values entered here are
     *       referenced in location records for Business Partners.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Country extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Country";
    public static final String ENTITY_NAME = "Country";

    /**
     * Property id stored in column C_Country_ID in table C_Country<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Country 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Country 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Country 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Country 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Country 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Country 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Country 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Country 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Country<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property iSOCountryCode stored in column CountryCode in table C_Country<br>
     * Help: {@literal For details - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or -
     *       http://www.unece.org/trade/rec/rec03en.htm}
     * 
     */
    public static final String PROPERTY_ISOCOUNTRYCODE = "iSOCountryCode";

    /**
     * Property hasRegions stored in column HasRegion in table C_Country<br>
     * Help: {@literal The Country has Region checkbox is selected if the Country being defined is divided into
     *       regions.  If this checkbox is selected, the Region Tab is accessible.}
     * 
     */
    public static final String PROPERTY_HASREGIONS = "hasRegions";

    /**
     * Property regionName stored in column RegionName in table C_Country<br>
     * Help: {@literal The Region Name defines the name that will print when this region is used in a document.}
     * 
     */
    public static final String PROPERTY_REGIONNAME = "regionName";

    /**
     * Property phoneNoFormat stored in column ExpressionPhone in table C_Country<br>
     * Help: {@literal Phone Format}
     * 
     */
    public static final String PROPERTY_PHONENOFORMAT = "phoneNoFormat";

    /**
     * Property addressPrintFormat stored in column DisplaySequence in table C_Country<br>
     * Help: The Address Print format defines the format to be used when this address prints.  The following
     *       notations are used: &#64;C&#64;=City  &#64;P&#64;=Postal  &#64;A&#64;=PostalAdd  &#64;R&#64;=Region
     * 
     */
    public static final String PROPERTY_ADDRESSPRINTFORMAT = "addressPrintFormat";

    /**
     * Property postalCodeFormat stored in column ExpressionPostal in table C_Country<br>
     * Help: {@literal Postal code Format}
     * 
     */
    public static final String PROPERTY_POSTALCODEFORMAT = "postalCodeFormat";

    /**
     * Property additionalPostalCode stored in column HasPostal_Add in table C_Country<br>
     * Help: {@literal The Additional Postal Code checkbox indicates if this address uses an additional Postal
     *       Code.  If it is selected an additional field displays for entry of the additional Postal Code.}
     * 
     */
    public static final String PROPERTY_ADDITIONALPOSTALCODE = "additionalPostalCode";

    /**
     * Property additionalPostalFormat stored in column ExpressionPostal_Add in table C_Country<br>
     * Help: {@literal Additional Postal Format}
     * 
     */
    public static final String PROPERTY_ADDITIONALPOSTALFORMAT = "additionalPostalFormat";

    /**
     * Property default stored in column IsDefault in table C_Country<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property language stored in column AD_Language in table C_Country<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property currency stored in column C_Currency_ID in table C_Country<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property iBANLength stored in column IBANNoDigits in table C_Country<br>
     * Help: {@literal Then International Bank Account Number structure do not stablish a specific length: it
     *       depends on the country. This field will define the length of the IBAN codes for that country.}
     * 
     */
    public static final String PROPERTY_IBANLENGTH = "iBANLength";

    /**
     * Property iBANCode stored in column IBANCountry in table C_Country<br>
     * Help: {@literal Then International Bank Account Number structure stablish that the first two digits will
     *       belong to the country. This country code is the one associated to a country of the application in
     *       this field.}
     * 
     */
    public static final String PROPERTY_IBANCODE = "iBANCode";

    /**
     * Property decimalseparator stored in column Decimalseparator in table C_Country
     * 
     */
    public static final String PROPERTY_DECIMALSEPARATOR = "decimalseparator";

    /**
     * Property groupingseparator stored in column Groupingseparator in table C_Country
     * 
     */
    public static final String PROPERTY_GROUPINGSEPARATOR = "groupingseparator";

    /**
     * Property numericmask stored in column Numericmask in table C_Country
     * 
     */
    public static final String PROPERTY_NUMERICMASK = "numericmask";

    /**
     * Property dateformat stored in column Dateformat in table C_Country
     * 
     */
    public static final String PROPERTY_DATEFORMAT = "dateformat";

    /**
     * Property datetimeformat stored in column Datetimeformat in table C_Country
     * 
     */
    public static final String PROPERTY_DATETIMEFORMAT = "datetimeformat";

    /**
     * Property countryTrlList stored in table C_Country
     * 
     */
    public static final String PROPERTY_COUNTRYTRLLIST = "countryTrlList";

    /**
     * Property regionList stored in table C_Country
     * 
     */
    public static final String PROPERTY_REGIONLIST = "regionList";


    public Country() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_HASREGIONS, false);
        setDefaultValue(PROPERTY_REGIONNAME, "State");
        setDefaultValue(PROPERTY_ADDITIONALPOSTALCODE, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_COUNTRYTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_REGIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Country#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Country#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Country#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Country#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Country#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Country#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Country#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Country#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Country#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Country#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Country#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Country#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Country#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Country#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Country#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Country#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Country#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Country#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Country#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Country#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Country#PROPERTY_ISOCOUNTRYCODE
     * 
     */
    public String getISOCountryCode() {
        return (String) get(PROPERTY_ISOCOUNTRYCODE);
    }
    /**
     * @see Country#PROPERTY_ISOCOUNTRYCODE
     * 
     */
    public void setISOCountryCode(String iSOCountryCode) {
        set(PROPERTY_ISOCOUNTRYCODE, iSOCountryCode);
    }

    /**
     * @see Country#PROPERTY_HASREGIONS
     * 
     */
    public Boolean isHasRegions() {
        return (Boolean) get(PROPERTY_HASREGIONS);
    }
    /**
     * @see Country#PROPERTY_HASREGIONS
     * 
     */
    public void setHasRegions(Boolean hasRegions) {
        set(PROPERTY_HASREGIONS, hasRegions);
    }

    /**
     * @see Country#PROPERTY_REGIONNAME
     * 
     */
    public String getRegionName() {
        return (String) get(PROPERTY_REGIONNAME);
    }
    /**
     * @see Country#PROPERTY_REGIONNAME
     * 
     */
    public void setRegionName(String regionName) {
        set(PROPERTY_REGIONNAME, regionName);
    }

    /**
     * @see Country#PROPERTY_PHONENOFORMAT
     * 
     */
    public String getPhoneNoFormat() {
        return (String) get(PROPERTY_PHONENOFORMAT);
    }
    /**
     * @see Country#PROPERTY_PHONENOFORMAT
     * 
     */
    public void setPhoneNoFormat(String phoneNoFormat) {
        set(PROPERTY_PHONENOFORMAT, phoneNoFormat);
    }

    /**
     * @see Country#PROPERTY_ADDRESSPRINTFORMAT
     * 
     */
    public String getAddressPrintFormat() {
        return (String) get(PROPERTY_ADDRESSPRINTFORMAT);
    }
    /**
     * @see Country#PROPERTY_ADDRESSPRINTFORMAT
     * 
     */
    public void setAddressPrintFormat(String addressPrintFormat) {
        set(PROPERTY_ADDRESSPRINTFORMAT, addressPrintFormat);
    }

    /**
     * @see Country#PROPERTY_POSTALCODEFORMAT
     * 
     */
    public String getPostalCodeFormat() {
        return (String) get(PROPERTY_POSTALCODEFORMAT);
    }
    /**
     * @see Country#PROPERTY_POSTALCODEFORMAT
     * 
     */
    public void setPostalCodeFormat(String postalCodeFormat) {
        set(PROPERTY_POSTALCODEFORMAT, postalCodeFormat);
    }

    /**
     * @see Country#PROPERTY_ADDITIONALPOSTALCODE
     * 
     */
    public Boolean isAdditionalPostalCode() {
        return (Boolean) get(PROPERTY_ADDITIONALPOSTALCODE);
    }
    /**
     * @see Country#PROPERTY_ADDITIONALPOSTALCODE
     * 
     */
    public void setAdditionalPostalCode(Boolean additionalPostalCode) {
        set(PROPERTY_ADDITIONALPOSTALCODE, additionalPostalCode);
    }

    /**
     * @see Country#PROPERTY_ADDITIONALPOSTALFORMAT
     * 
     */
    public String getAdditionalPostalFormat() {
        return (String) get(PROPERTY_ADDITIONALPOSTALFORMAT);
    }
    /**
     * @see Country#PROPERTY_ADDITIONALPOSTALFORMAT
     * 
     */
    public void setAdditionalPostalFormat(String additionalPostalFormat) {
        set(PROPERTY_ADDITIONALPOSTALFORMAT, additionalPostalFormat);
    }

    /**
     * @see Country#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see Country#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see Country#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see Country#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see Country#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Country#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Country#PROPERTY_IBANLENGTH
     * 
     */
    public Long getIBANLength() {
        return (Long) get(PROPERTY_IBANLENGTH);
    }
    /**
     * @see Country#PROPERTY_IBANLENGTH
     * 
     */
    public void setIBANLength(Long iBANLength) {
        set(PROPERTY_IBANLENGTH, iBANLength);
    }

    /**
     * @see Country#PROPERTY_IBANCODE
     * 
     */
    public String getIBANCode() {
        return (String) get(PROPERTY_IBANCODE);
    }
    /**
     * @see Country#PROPERTY_IBANCODE
     * 
     */
    public void setIBANCode(String iBANCode) {
        set(PROPERTY_IBANCODE, iBANCode);
    }

    /**
     * @see Country#PROPERTY_DECIMALSEPARATOR
     * 
     */
    public String getDecimalseparator() {
        return (String) get(PROPERTY_DECIMALSEPARATOR);
    }
    /**
     * @see Country#PROPERTY_DECIMALSEPARATOR
     * 
     */
    public void setDecimalseparator(String decimalseparator) {
        set(PROPERTY_DECIMALSEPARATOR, decimalseparator);
    }

    /**
     * @see Country#PROPERTY_GROUPINGSEPARATOR
     * 
     */
    public String getGroupingseparator() {
        return (String) get(PROPERTY_GROUPINGSEPARATOR);
    }
    /**
     * @see Country#PROPERTY_GROUPINGSEPARATOR
     * 
     */
    public void setGroupingseparator(String groupingseparator) {
        set(PROPERTY_GROUPINGSEPARATOR, groupingseparator);
    }

    /**
     * @see Country#PROPERTY_NUMERICMASK
     * 
     */
    public String getNumericmask() {
        return (String) get(PROPERTY_NUMERICMASK);
    }
    /**
     * @see Country#PROPERTY_NUMERICMASK
     * 
     */
    public void setNumericmask(String numericmask) {
        set(PROPERTY_NUMERICMASK, numericmask);
    }

    /**
     * @see Country#PROPERTY_DATEFORMAT
     * 
     */
    public String getDateformat() {
        return (String) get(PROPERTY_DATEFORMAT);
    }
    /**
     * @see Country#PROPERTY_DATEFORMAT
     * 
     */
    public void setDateformat(String dateformat) {
        set(PROPERTY_DATEFORMAT, dateformat);
    }

    /**
     * @see Country#PROPERTY_DATETIMEFORMAT
     * 
     */
    public String getDatetimeformat() {
        return (String) get(PROPERTY_DATETIMEFORMAT);
    }
    /**
     * @see Country#PROPERTY_DATETIMEFORMAT
     * 
     */
    public void setDatetimeformat(String datetimeformat) {
        set(PROPERTY_DATETIMEFORMAT, datetimeformat);
    }

    /**
     * Help: {@literal Translation}<br>
     * @see CountryTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CountryTrl> getCountryTrlList() {
      return (List<CountryTrl>) get(PROPERTY_COUNTRYTRLLIST);
    }

    /**
     * Help: {@literal Translation}<br>
     * @see CountryTrl
     * 
     */
    public void setCountryTrlList(List<CountryTrl> countryTrlList) {
        set(PROPERTY_COUNTRYTRLLIST, countryTrlList);
    }

    /**
     * Help: {@literal The Region Tab  defines a Region within a Country.  This tab is enabled only if the Has
     *       Region checkbox is selected for the Country.}<br>
     * @see Region
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Region> getRegionList() {
      return (List<Region>) get(PROPERTY_REGIONLIST);
    }

    /**
     * Help: {@literal The Region Tab  defines a Region within a Country.  This tab is enabled only if the Has
     *       Region checkbox is selected for the Country.}<br>
     * @see Region
     * 
     */
    public void setRegionList(List<Region> regionList) {
        set(PROPERTY_REGIONLIST, regionList);
    }

}
