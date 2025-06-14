
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
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity Location (stored in table C_Location).
 * <br>
 * Help: {@literal The Location Tab defines the location of an Organization.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Location extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Location";
    public static final String ENTITY_NAME = "Location";

    /**
     * Property id stored in column C_Location_ID in table C_Location<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Location 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Location 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Location 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property addressLine1 stored in column Address1 in table C_Location 
     * 
     */
    public static final String PROPERTY_ADDRESSLINE1 = "addressLine1";

    /**
     * Property addressLine2 stored in column Address2 in table C_Location 
     * 
     */
    public static final String PROPERTY_ADDRESSLINE2 = "addressLine2";

    /**
     * Property cityName stored in column City in table C_Location 
     * 
     */
    public static final String PROPERTY_CITYNAME = "cityName";

    /**
     * Property postalCode stored in column Postal in table C_Location 
     * 
     */
    public static final String PROPERTY_POSTALCODE = "postalCode";

    /**
     * Property postalAdd stored in column Postal_Add in table C_Location<br>
     * Help: {@literal The Additional ZIP or Postal Code identifies, if appropriate, any additional Postal Code
     *       information.}
     * 
     */
    public static final String PROPERTY_POSTALADD = "postalAdd";

    /**
     * Property country stored in column C_Country_ID in table C_Location<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * 
     */
    public static final String PROPERTY_COUNTRY = "country";

    /**
     * Property region stored in column C_Region_ID in table C_Location<br>
     * Help: {@literal The Region identifies a unique Region for this Country.}
     * 
     */
    public static final String PROPERTY_REGION = "region";

    /**
     * Property city stored in column C_City_ID in table C_Location<br>
     * Help: {@literal City in a country}
     * 
     */
    public static final String PROPERTY_CITY = "city";

    /**
     * Property regionName stored in column RegionName in table C_Location<br>
     * Help: {@literal The Region Name defines the name that will print when this region is used in a document.}
     * 
     */
    public static final String PROPERTY_REGIONNAME = "regionName";

    /**
     * Property businessPartnerLocationList stored in table C_Location
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERLOCATIONLIST = "businessPartnerLocationList";


    public Location() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_BUSINESSPARTNERLOCATIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Location#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Location#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Location#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Location#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Location#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Location#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Location#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Location#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Location#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Location#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Location#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Location#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Location#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Location#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Location#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Location#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Location#PROPERTY_ADDRESSLINE1
     * 
     */
    public String getAddressLine1() {
        return (String) get(PROPERTY_ADDRESSLINE1);
    }
    /**
     * @see Location#PROPERTY_ADDRESSLINE1
     * 
     */
    public void setAddressLine1(String addressLine1) {
        set(PROPERTY_ADDRESSLINE1, addressLine1);
    }

    /**
     * @see Location#PROPERTY_ADDRESSLINE2
     * 
     */
    public String getAddressLine2() {
        return (String) get(PROPERTY_ADDRESSLINE2);
    }
    /**
     * @see Location#PROPERTY_ADDRESSLINE2
     * 
     */
    public void setAddressLine2(String addressLine2) {
        set(PROPERTY_ADDRESSLINE2, addressLine2);
    }

    /**
     * @see Location#PROPERTY_CITYNAME
     * 
     */
    public String getCityName() {
        return (String) get(PROPERTY_CITYNAME);
    }
    /**
     * @see Location#PROPERTY_CITYNAME
     * 
     */
    public void setCityName(String cityName) {
        set(PROPERTY_CITYNAME, cityName);
    }

    /**
     * @see Location#PROPERTY_POSTALCODE
     * 
     */
    public String getPostalCode() {
        return (String) get(PROPERTY_POSTALCODE);
    }
    /**
     * @see Location#PROPERTY_POSTALCODE
     * 
     */
    public void setPostalCode(String postalCode) {
        set(PROPERTY_POSTALCODE, postalCode);
    }

    /**
     * @see Location#PROPERTY_POSTALADD
     * 
     */
    public String getPostalAdd() {
        return (String) get(PROPERTY_POSTALADD);
    }
    /**
     * @see Location#PROPERTY_POSTALADD
     * 
     */
    public void setPostalAdd(String postalAdd) {
        set(PROPERTY_POSTALADD, postalAdd);
    }

    /**
     * @see Location#PROPERTY_COUNTRY
     * 
     */
    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }
    /**
     * @see Location#PROPERTY_COUNTRY
     * 
     */
    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

    /**
     * @see Location#PROPERTY_REGION
     * 
     */
    public Region getRegion() {
        return (Region) get(PROPERTY_REGION);
    }
    /**
     * @see Location#PROPERTY_REGION
     * 
     */
    public void setRegion(Region region) {
        set(PROPERTY_REGION, region);
    }

    /**
     * @see Location#PROPERTY_CITY
     * 
     */
    public City getCity() {
        return (City) get(PROPERTY_CITY);
    }
    /**
     * @see Location#PROPERTY_CITY
     * 
     */
    public void setCity(City city) {
        set(PROPERTY_CITY, city);
    }

    /**
     * @see Location#PROPERTY_REGIONNAME
     * 
     */
    public String getRegionName() {
        return (String) get(PROPERTY_REGIONNAME);
    }
    /**
     * @see Location#PROPERTY_REGIONNAME
     * 
     */
    public void setRegionName(String regionName) {
        set(PROPERTY_REGIONNAME, regionName);
    }

    /**
     * Help: {@literal The Location defines the physical location of a business partner.  A business partner may
     *       have multiple location records.}<br>
     * @see org.openbravo.model.common.businesspartner.Location
     * 
     */
    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.common.businesspartner.Location> getBusinessPartnerLocationList() {
      return (List<org.openbravo.model.common.businesspartner.Location>) get(PROPERTY_BUSINESSPARTNERLOCATIONLIST);
    }

    /**
     * Help: {@literal The Location defines the physical location of a business partner.  A business partner may
     *       have multiple location records.}<br>
     * @see org.openbravo.model.common.businesspartner.Location
     * 
     */
    public void setBusinessPartnerLocationList(List<org.openbravo.model.common.businesspartner.Location> businessPartnerLocationList) {
        set(PROPERTY_BUSINESSPARTNERLOCATIONLIST, businessPartnerLocationList);
    }

}
