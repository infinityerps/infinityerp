
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

import java.util.Date;

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
 * Entity class for entity FinancialMgmtTaxZone (stored in table C_Tax_Zone).
 * <br>
 * Help: {@literal Defines the zones where the tax is applicable.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TaxZone extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Tax_Zone";
    public static final String ENTITY_NAME = "FinancialMgmtTaxZone";

    /**
     * Property id stored in column C_Tax_Zone_ID in table C_Tax_Zone 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Tax_Zone 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Tax_Zone 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Tax_Zone 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Tax_Zone 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Tax_Zone 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Tax_Zone 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Tax_Zone 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property tax stored in column C_Tax_ID in table C_Tax_Zone<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property fromCountry stored in column From_Country_ID in table C_Tax_Zone
     * 
     */
    public static final String PROPERTY_FROMCOUNTRY = "fromCountry";

    /**
     * Property fromRegion stored in column From_Region_ID in table C_Tax_Zone
     * 
     */
    public static final String PROPERTY_FROMREGION = "fromRegion";

    /**
     * Property destinationCountry stored in column To_Country_ID in table C_Tax_Zone<br>
     * Help: {@literal The To Country indicates the receiving country on a document}
     * 
     */
    public static final String PROPERTY_DESTINATIONCOUNTRY = "destinationCountry";

    /**
     * Property destinationRegion stored in column To_Region_ID in table C_Tax_Zone<br>
     * Help: {@literal The To Region indicates the receiving region on a document}
     * 
     */
    public static final String PROPERTY_DESTINATIONREGION = "destinationRegion";


    public TaxZone() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TaxZone#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TaxZone#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TaxZone#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TaxZone#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TaxZone#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TaxZone#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TaxZone#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TaxZone#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TaxZone#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TaxZone#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TaxZone#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TaxZone#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TaxZone#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TaxZone#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TaxZone#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TaxZone#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TaxZone#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see TaxZone#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see TaxZone#PROPERTY_FROMCOUNTRY
     * 
     */
    public Country getFromCountry() {
        return (Country) get(PROPERTY_FROMCOUNTRY);
    }
    /**
     * @see TaxZone#PROPERTY_FROMCOUNTRY
     * 
     */
    public void setFromCountry(Country fromCountry) {
        set(PROPERTY_FROMCOUNTRY, fromCountry);
    }

    /**
     * @see TaxZone#PROPERTY_FROMREGION
     * 
     */
    public Region getFromRegion() {
        return (Region) get(PROPERTY_FROMREGION);
    }
    /**
     * @see TaxZone#PROPERTY_FROMREGION
     * 
     */
    public void setFromRegion(Region fromRegion) {
        set(PROPERTY_FROMREGION, fromRegion);
    }

    /**
     * @see TaxZone#PROPERTY_DESTINATIONCOUNTRY
     * 
     */
    public Country getDestinationCountry() {
        return (Country) get(PROPERTY_DESTINATIONCOUNTRY);
    }
    /**
     * @see TaxZone#PROPERTY_DESTINATIONCOUNTRY
     * 
     */
    public void setDestinationCountry(Country destinationCountry) {
        set(PROPERTY_DESTINATIONCOUNTRY, destinationCountry);
    }

    /**
     * @see TaxZone#PROPERTY_DESTINATIONREGION
     * 
     */
    public Region getDestinationRegion() {
        return (Region) get(PROPERTY_DESTINATIONREGION);
    }
    /**
     * @see TaxZone#PROPERTY_DESTINATIONREGION
     * 
     */
    public void setDestinationRegion(Region destinationRegion) {
        set(PROPERTY_DESTINATIONREGION, destinationRegion);
    }

}
