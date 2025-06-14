
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
package org.openbravo.model.common.bank;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.common.geography.Location;
/**
 * Entity class for entity Bank (stored in table C_Bank).
 * <br>
 * Help: {@literal Defines a bank that is used by an organization or business partner.  Each Bank is given an
     *       identifying Name, Address, Routing No and Swift Code}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Bank extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Bank";
    public static final String ENTITY_NAME = "Bank";

    /**
     * Property id stored in column C_Bank_ID in table C_Bank<br>
     * Help: {@literal The Bank is a unique identifier of a Bank for this Organization or for a Business Partner
     *       with whom this Organization transacts.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Bank 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Bank 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Bank 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Bank 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Bank 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Bank 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Bank 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Bank 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property routingNo stored in column RoutingNo in table C_Bank<br>
     * Help: {@literal The Bank Routing Number (ABA Number) identifies a legal Bank.  It is used in routing
     *       checks and electronic transactions.}
     * 
     */
    public static final String PROPERTY_ROUTINGNO = "routingNo";

    /**
     * Property locationAddress stored in column C_Location_ID in table C_Bank<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_LOCATIONADDRESS = "locationAddress";

    /**
     * Property swiftCode stored in column SwiftCode in table C_Bank<br>
     * Help: {@literal The SWIFT Code is an identifier of a Bank}
     * 
     */
    public static final String PROPERTY_SWIFTCODE = "swiftCode";

    /**
     * Property ownBank stored in column IsOwnBank in table C_Bank<br>
     * Help: {@literal The Own Bank field indicates if this bank is for this Organization as opposed to a Bank
     *       for a Business Partner.}
     * 
     */
    public static final String PROPERTY_OWNBANK = "ownBank";

    /**
     * Property bankCode stored in column Codebank in table C_Bank<br>
     * Help: {@literal First four numbers of the bank account number which identifies the bank uniquely.}
     * 
     */
    public static final String PROPERTY_BANKCODE = "bankCode";

    /**
     * Property branchCode stored in column Codebranch in table C_Bank<br>
     * Help: {@literal Second group of four numbers of the bank account which identifies the branch uniquely.}
     * 
     */
    public static final String PROPERTY_BRANCHCODE = "branchCode";

    /**
     * Property controlDigit stored in column Digitcontrol in table C_Bank<br>
     * Help: {@literal Tenth number of the bank account.}
     * 
     */
    public static final String PROPERTY_CONTROLDIGIT = "controlDigit";

    /**
     * Property iNENo stored in column INE_Number in table C_Bank<br>
     * Help: {@literal Number provided by the bank to configurate remittances.}
     * 
     */
    public static final String PROPERTY_INENO = "iNENo";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Bank<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property country stored in column C_Country_ID in table C_Bank<br>
     * Help: {@literal The Country defines a Country.  Each Country must be defined before it can be used in any
     *       document.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_COUNTRY = "country";


    public Bank() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OWNBANK, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Bank#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Bank#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Bank#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Bank#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Bank#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Bank#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Bank#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Bank#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Bank#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Bank#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Bank#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Bank#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Bank#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Bank#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Bank#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Bank#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Bank#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Bank#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Bank#PROPERTY_ROUTINGNO
     * 
     */
    public String getRoutingNo() {
        return (String) get(PROPERTY_ROUTINGNO);
    }
    /**
     * @see Bank#PROPERTY_ROUTINGNO
     * 
     */
    public void setRoutingNo(String routingNo) {
        set(PROPERTY_ROUTINGNO, routingNo);
    }

    /**
     * @see Bank#PROPERTY_LOCATIONADDRESS
     * 
     */
    public Location getLocationAddress() {
        return (Location) get(PROPERTY_LOCATIONADDRESS);
    }
    /**
     * @see Bank#PROPERTY_LOCATIONADDRESS
     * 
     */
    public void setLocationAddress(Location locationAddress) {
        set(PROPERTY_LOCATIONADDRESS, locationAddress);
    }

    /**
     * @see Bank#PROPERTY_SWIFTCODE
     * 
     */
    public String getSwiftCode() {
        return (String) get(PROPERTY_SWIFTCODE);
    }
    /**
     * @see Bank#PROPERTY_SWIFTCODE
     * 
     */
    public void setSwiftCode(String swiftCode) {
        set(PROPERTY_SWIFTCODE, swiftCode);
    }

    /**
     * @see Bank#PROPERTY_OWNBANK
     * 
     */
    public Boolean isOwnBank() {
        return (Boolean) get(PROPERTY_OWNBANK);
    }
    /**
     * @see Bank#PROPERTY_OWNBANK
     * 
     */
    public void setOwnBank(Boolean ownBank) {
        set(PROPERTY_OWNBANK, ownBank);
    }

    /**
     * @see Bank#PROPERTY_BANKCODE
     * 
     */
    public String getBankCode() {
        return (String) get(PROPERTY_BANKCODE);
    }
    /**
     * @see Bank#PROPERTY_BANKCODE
     * 
     */
    public void setBankCode(String bankCode) {
        set(PROPERTY_BANKCODE, bankCode);
    }

    /**
     * @see Bank#PROPERTY_BRANCHCODE
     * 
     */
    public String getBranchCode() {
        return (String) get(PROPERTY_BRANCHCODE);
    }
    /**
     * @see Bank#PROPERTY_BRANCHCODE
     * 
     */
    public void setBranchCode(String branchCode) {
        set(PROPERTY_BRANCHCODE, branchCode);
    }

    /**
     * @see Bank#PROPERTY_CONTROLDIGIT
     * 
     */
    public String getControlDigit() {
        return (String) get(PROPERTY_CONTROLDIGIT);
    }
    /**
     * @see Bank#PROPERTY_CONTROLDIGIT
     * 
     */
    public void setControlDigit(String controlDigit) {
        set(PROPERTY_CONTROLDIGIT, controlDigit);
    }

    /**
     * @see Bank#PROPERTY_INENO
     * 
     */
    public String getINENo() {
        return (String) get(PROPERTY_INENO);
    }
    /**
     * @see Bank#PROPERTY_INENO
     * 
     */
    public void setINENo(String iNENo) {
        set(PROPERTY_INENO, iNENo);
    }

    /**
     * @see Bank#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Bank#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Bank#PROPERTY_COUNTRY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }
    /**
     * @see Bank#PROPERTY_COUNTRY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

}
