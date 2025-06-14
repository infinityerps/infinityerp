
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
package org.openbravo.model.common.businesspartner;

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
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity BusinessPartnerLocation (stored in table C_BPartner_Location).
 * <br>
 * Help: {@literal The Location defines the physical location of a business partner.  A business partner may
     *       have multiple location records.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Location extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BPartner_Location";
    public static final String ENTITY_NAME = "BusinessPartnerLocation";

    /**
     * Property id stored in column C_BPartner_Location_ID in table C_BPartner_Location<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_BPartner_Location 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BPartner_Location 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BPartner_Location 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BPartner_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BPartner_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BPartner_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BPartner_Location 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_BPartner_Location 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property invoiceToAddress stored in column IsBillTo in table C_BPartner_Location<br>
     * Help: {@literal The Invoicing Address checkbox indicates if this location is the Invoicing Address for
     *       this Business Partner}
     * 
     */
    public static final String PROPERTY_INVOICETOADDRESS = "invoiceToAddress";

    /**
     * Property shipToAddress stored in column IsShipTo in table C_BPartner_Location<br>
     * Help: {@literal The Shipping Address checkbox indicates if this location is the address to use when
     *       shipping orders to this Business Partner.}
     * 
     */
    public static final String PROPERTY_SHIPTOADDRESS = "shipToAddress";

    /**
     * Property payFromAddress stored in column IsPayFrom in table C_BPartner_Location<br>
     * Help: {@literal The Pay From Address checkbox indicates if this location is the address the Business
     *       Partner pays from.}
     * 
     */
    public static final String PROPERTY_PAYFROMADDRESS = "payFromAddress";

    /**
     * Property remitToAddress stored in column IsRemitTo in table C_BPartner_Location<br>
     * Help: {@literal The Remit to Address checkbox indicates if this location is the address to which we should
     *       send payments to this Business Partner.}
     * 
     */
    public static final String PROPERTY_REMITTOADDRESS = "remitToAddress";

    /**
     * Property phone stored in column Phone in table C_BPartner_Location<br>
     * Help: {@literal The Phone field identifies a telephone number}
     * 
     */
    public static final String PROPERTY_PHONE = "phone";

    /**
     * Property alternativePhone stored in column Phone2 in table C_BPartner_Location<br>
     * Help: {@literal The 2nd Phone field identifies an alternate telephone number.}
     * 
     */
    public static final String PROPERTY_ALTERNATIVEPHONE = "alternativePhone";

    /**
     * Property fax stored in column Fax in table C_BPartner_Location<br>
     * Help: {@literal The Fax identifies a facsimile number for this Business Partner or  Location}
     * 
     */
    public static final String PROPERTY_FAX = "fax";

    /**
     * Property salesRegion stored in column C_SalesRegion_ID in table C_BPartner_Location<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_BPartner_Location<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property locationAddress stored in column C_Location_ID in table C_BPartner_Location<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_LOCATIONADDRESS = "locationAddress";

    /**
     * Property taxLocation stored in column IsTaxLocation in table C_BPartner_Location<br>
     * Help: {@literal This fieldindicates that this location is a fiscal address. Fiscal addresses are shown in
     *       all documents.}
     * 
     */
    public static final String PROPERTY_TAXLOCATION = "taxLocation";

    /**
     * Property uPCEAN stored in column UPC in table C_BPartner_Location<br>
     * Help: {@literal Use this field to enter the bar code for the product in any of the bar code symbologies
     *       (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN,
     *       ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode)}
     * 
     */
    public static final String PROPERTY_UPCEAN = "uPCEAN";

    /**
     * Property defaultShipToAddress stored in column Isdefault_Shipto in table C_BPartner_Location<br>
     * Help: {@literal The Default Shipping Address checkbox indicates if this location is the default address to
     *       use when shipping orders to this Business Partner.}
     * 
     */
    public static final String PROPERTY_DEFAULTSHIPTOADDRESS = "defaultShipToAddress";

    /**
     * Property defaultInvoiceToAddress stored in column Isdefault_Billto in table C_BPartner_Location<br>
     * Help: {@literal The Default Invoicing Address checkbox indicates if this location is the default Invoicing
     *       Address for this Business Partner}
     * 
     */
    public static final String PROPERTY_DEFAULTINVOICETOADDRESS = "defaultInvoiceToAddress";

    /**
     * Property aDUserList stored in table C_BPartner_Location
     * 
     */
    public static final String PROPERTY_ADUSERLIST = "aDUserList";


    public Location() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_NAME, ".");
        setDefaultValue(PROPERTY_INVOICETOADDRESS, true);
        setDefaultValue(PROPERTY_SHIPTOADDRESS, true);
        setDefaultValue(PROPERTY_PAYFROMADDRESS, true);
        setDefaultValue(PROPERTY_REMITTOADDRESS, true);
        setDefaultValue(PROPERTY_TAXLOCATION, false);
        setDefaultValue(PROPERTY_DEFAULTSHIPTOADDRESS, false);
        setDefaultValue(PROPERTY_DEFAULTINVOICETOADDRESS, false);
        setDefaultValue(PROPERTY_ADUSERLIST, new ArrayList<Object>());
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
     * @see Location#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Location#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Location#PROPERTY_INVOICETOADDRESS
     * 
     */
    public Boolean isInvoiceToAddress() {
        return (Boolean) get(PROPERTY_INVOICETOADDRESS);
    }
    /**
     * @see Location#PROPERTY_INVOICETOADDRESS
     * 
     */
    public void setInvoiceToAddress(Boolean invoiceToAddress) {
        set(PROPERTY_INVOICETOADDRESS, invoiceToAddress);
    }

    /**
     * @see Location#PROPERTY_SHIPTOADDRESS
     * 
     */
    public Boolean isShipToAddress() {
        return (Boolean) get(PROPERTY_SHIPTOADDRESS);
    }
    /**
     * @see Location#PROPERTY_SHIPTOADDRESS
     * 
     */
    public void setShipToAddress(Boolean shipToAddress) {
        set(PROPERTY_SHIPTOADDRESS, shipToAddress);
    }

    /**
     * @see Location#PROPERTY_PAYFROMADDRESS
     * 
     */
    public Boolean isPayFromAddress() {
        return (Boolean) get(PROPERTY_PAYFROMADDRESS);
    }
    /**
     * @see Location#PROPERTY_PAYFROMADDRESS
     * 
     */
    public void setPayFromAddress(Boolean payFromAddress) {
        set(PROPERTY_PAYFROMADDRESS, payFromAddress);
    }

    /**
     * @see Location#PROPERTY_REMITTOADDRESS
     * 
     */
    public Boolean isRemitToAddress() {
        return (Boolean) get(PROPERTY_REMITTOADDRESS);
    }
    /**
     * @see Location#PROPERTY_REMITTOADDRESS
     * 
     */
    public void setRemitToAddress(Boolean remitToAddress) {
        set(PROPERTY_REMITTOADDRESS, remitToAddress);
    }

    /**
     * @see Location#PROPERTY_PHONE
     * 
     */
    public String getPhone() {
        return (String) get(PROPERTY_PHONE);
    }
    /**
     * @see Location#PROPERTY_PHONE
     * 
     */
    public void setPhone(String phone) {
        set(PROPERTY_PHONE, phone);
    }

    /**
     * @see Location#PROPERTY_ALTERNATIVEPHONE
     * 
     */
    public String getAlternativePhone() {
        return (String) get(PROPERTY_ALTERNATIVEPHONE);
    }
    /**
     * @see Location#PROPERTY_ALTERNATIVEPHONE
     * 
     */
    public void setAlternativePhone(String alternativePhone) {
        set(PROPERTY_ALTERNATIVEPHONE, alternativePhone);
    }

    /**
     * @see Location#PROPERTY_FAX
     * 
     */
    public String getFax() {
        return (String) get(PROPERTY_FAX);
    }
    /**
     * @see Location#PROPERTY_FAX
     * 
     */
    public void setFax(String fax) {
        set(PROPERTY_FAX, fax);
    }

    /**
     * @see Location#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see Location#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see Location#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Location#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Location#PROPERTY_LOCATIONADDRESS
     * 
     */
    public org.openbravo.model.common.geography.Location getLocationAddress() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_LOCATIONADDRESS);
    }
    /**
     * @see Location#PROPERTY_LOCATIONADDRESS
     * 
     */
    public void setLocationAddress(org.openbravo.model.common.geography.Location locationAddress) {
        set(PROPERTY_LOCATIONADDRESS, locationAddress);
    }

    /**
     * @see Location#PROPERTY_TAXLOCATION
     * 
     */
    public Boolean isTaxLocation() {
        return (Boolean) get(PROPERTY_TAXLOCATION);
    }
    /**
     * @see Location#PROPERTY_TAXLOCATION
     * 
     */
    public void setTaxLocation(Boolean taxLocation) {
        set(PROPERTY_TAXLOCATION, taxLocation);
    }

    /**
     * @see Location#PROPERTY_UPCEAN
     * 
     */
    public String getUPCEAN() {
        return (String) get(PROPERTY_UPCEAN);
    }
    /**
     * @see Location#PROPERTY_UPCEAN
     * 
     */
    public void setUPCEAN(String uPCEAN) {
        set(PROPERTY_UPCEAN, uPCEAN);
    }

    /**
     * @see Location#PROPERTY_DEFAULTSHIPTOADDRESS
     * 
     */
    public Boolean isDefaultShipToAddress() {
        return (Boolean) get(PROPERTY_DEFAULTSHIPTOADDRESS);
    }
    /**
     * @see Location#PROPERTY_DEFAULTSHIPTOADDRESS
     * 
     */
    public void setDefaultShipToAddress(Boolean defaultShipToAddress) {
        set(PROPERTY_DEFAULTSHIPTOADDRESS, defaultShipToAddress);
    }

    /**
     * @see Location#PROPERTY_DEFAULTINVOICETOADDRESS
     * 
     */
    public Boolean isDefaultInvoiceToAddress() {
        return (Boolean) get(PROPERTY_DEFAULTINVOICETOADDRESS);
    }
    /**
     * @see Location#PROPERTY_DEFAULTINVOICETOADDRESS
     * 
     */
    public void setDefaultInvoiceToAddress(Boolean defaultInvoiceToAddress) {
        set(PROPERTY_DEFAULTINVOICETOADDRESS, defaultInvoiceToAddress);
    }

    /**
     * Help: {@literal The User Tab defines the log in for Users who have access to the system.
     *       The User
     *       identifies a unique user in the system. This could be an internal user or a business partner
     *       contact}<br>
     * @see User
     * 
     */
    @SuppressWarnings("unchecked")
    public List<User> getADUserList() {
      return (List<User>) get(PROPERTY_ADUSERLIST);
    }

    /**
     * Help: {@literal The User Tab defines the log in for Users who have access to the system.
     *       The User
     *       identifies a unique user in the system. This could be an internal user or a business partner
     *       contact}<br>
     * @see User
     * 
     */
    public void setADUserList(List<User> aDUserList) {
        set(PROPERTY_ADUSERLIST, aDUserList);
    }

}
