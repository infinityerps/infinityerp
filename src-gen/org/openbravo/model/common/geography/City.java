
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
 * Entity class for entity City (stored in table C_City).
 * <br>
 * Help: {@literal The Cities Tab defines Cities within a Country or Region.  Cities entered here are not
     *       referenced when entering the address.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class City extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_City";
    public static final String ENTITY_NAME = "City";

    /**
     * Property id stored in column C_City_ID in table C_City<br>
     * Help: {@literal City in a country}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_City 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_City 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_City 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_City 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_City 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_City 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_City 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_City 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property abbreviation stored in column Locode in table C_City<br>
     * Help: {@literal UN/Locode is a combination of a 2-character country code and a 3-character location code,
     *       e.g. BEANR is known as the city of Antwerp (ANR) which is located in Belgium (BE).<p>See:
     *       http://www.unece.org/cefact/locode/service/main.htm}
     * 
     */
    public static final String PROPERTY_ABBREVIATION = "abbreviation";

    /**
     * Property coordinates stored in column Coordinates in table C_City<br>
     * Help: {@literal This column contains the geographical coordinates (latitude/longitude) of the
     *       location.<p>In order to avoid unnecessary use of non-standard characters and space, the following
     *       standard presentation is used:<BR>0000N 00000W 0000S 00000E <BR>where the tw}
     * 
     */
    public static final String PROPERTY_COORDINATES = "coordinates";

    /**
     * Property postalCode stored in column Postal in table C_City<br>
     * Help: {@literal The Postal Code field identifies the postal code for this entity's address.}
     * 
     */
    public static final String PROPERTY_POSTALCODE = "postalCode";

    /**
     * Property areaCode stored in column AreaCode in table C_City<br>
     * Help: {@literal Phone Area Code}
     * 
     */
    public static final String PROPERTY_AREACODE = "areaCode";

    /**
     * Property country stored in column C_Country_ID in table C_City<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * 
     */
    public static final String PROPERTY_COUNTRY = "country";

    /**
     * Property region stored in column C_Region_ID in table C_City<br>
     * Help: {@literal The Region identifies a unique Region for this Country.}
     * 
     */
    public static final String PROPERTY_REGION = "region";


    public City() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see City#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see City#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see City#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see City#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see City#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see City#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see City#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see City#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see City#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see City#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see City#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see City#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see City#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see City#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see City#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see City#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see City#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see City#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see City#PROPERTY_ABBREVIATION
     * 
     */
    public String getAbbreviation() {
        return (String) get(PROPERTY_ABBREVIATION);
    }
    /**
     * @see City#PROPERTY_ABBREVIATION
     * 
     */
    public void setAbbreviation(String abbreviation) {
        set(PROPERTY_ABBREVIATION, abbreviation);
    }

    /**
     * @see City#PROPERTY_COORDINATES
     * 
     */
    public String getCoordinates() {
        return (String) get(PROPERTY_COORDINATES);
    }
    /**
     * @see City#PROPERTY_COORDINATES
     * 
     */
    public void setCoordinates(String coordinates) {
        set(PROPERTY_COORDINATES, coordinates);
    }

    /**
     * @see City#PROPERTY_POSTALCODE
     * 
     */
    public String getPostalCode() {
        return (String) get(PROPERTY_POSTALCODE);
    }
    /**
     * @see City#PROPERTY_POSTALCODE
     * 
     */
    public void setPostalCode(String postalCode) {
        set(PROPERTY_POSTALCODE, postalCode);
    }

    /**
     * @see City#PROPERTY_AREACODE
     * 
     */
    public String getAreaCode() {
        return (String) get(PROPERTY_AREACODE);
    }
    /**
     * @see City#PROPERTY_AREACODE
     * 
     */
    public void setAreaCode(String areaCode) {
        set(PROPERTY_AREACODE, areaCode);
    }

    /**
     * @see City#PROPERTY_COUNTRY
     * 
     */
    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }
    /**
     * @see City#PROPERTY_COUNTRY
     * 
     */
    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

    /**
     * @see City#PROPERTY_REGION
     * 
     */
    public Region getRegion() {
        return (Region) get(PROPERTY_REGION);
    }
    /**
     * @see City#PROPERTY_REGION
     * 
     */
    public void setRegion(Region region) {
        set(PROPERTY_REGION, region);
    }

}
