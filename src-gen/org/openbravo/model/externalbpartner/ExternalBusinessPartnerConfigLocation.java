
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
package org.openbravo.model.externalbpartner;

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
 * Entity class for entity C_Extbp_Config_Loc (stored in table C_Extbp_Config_Loc).
 * <br>
 * Help: {@literal This table describes how existing properties in external business partner integration map
     *       with fileds to compose an address}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExternalBusinessPartnerConfigLocation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Extbp_Config_Loc";
    public static final String ENTITY_NAME = "C_Extbp_Config_Loc";

    /**
     * Property id stored in column C_Extbp_Config_Loc_ID in table C_Extbp_Config_Loc 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Extbp_Config_Loc 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Extbp_Config_Loc 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Extbp_Config_Loc 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Extbp_Config_Loc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Extbp_Config_Loc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Extbp_Config_Loc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Extbp_Config_Loc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property cRMConnectorConfiguration stored in column C_Extbp_Config_ID in table C_Extbp_Config_Loc<br>
     * Help: {@literal Configuration to connect to the CRM system API, and which also defines the properties and
     *       filters used by Openbravo to map with the external system information.}
     * 
     */
    public static final String PROPERTY_CRMCONNECTORCONFIGURATION = "cRMConnectorConfiguration";

    /**
     * Property name stored in column Name in table C_Extbp_Config_Loc 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property addressLine1 stored in column Address1 in table C_Extbp_Config_Loc<br>
     * Help: {@literal The Address 1 identifies the address for an entity's location}
     * 
     */
    public static final String PROPERTY_ADDRESSLINE1 = "addressLine1";

    /**
     * Property addressLine2 stored in column Address2 in table C_Extbp_Config_Loc<br>
     * Help: {@literal The Address 2 provides additional address information for an entity.  It can be used for
     *       building location, apartment number or similar information.}
     * 
     */
    public static final String PROPERTY_ADDRESSLINE2 = "addressLine2";

    /**
     * Property cityName stored in column City in table C_Extbp_Config_Loc<br>
     * Help: {@literal The City identifies a unique City for this Country or Region.}
     * 
     */
    public static final String PROPERTY_CITYNAME = "cityName";

    /**
     * Property postalCode stored in column Postal in table C_Extbp_Config_Loc<br>
     * Help: {@literal The Postal Code field identifies the postal code for this entity's address.}
     * 
     */
    public static final String PROPERTY_POSTALCODE = "postalCode";

    /**
     * Property country stored in column Country in table C_Extbp_Config_Loc
     * 
     */
    public static final String PROPERTY_COUNTRY = "country";

    /**
     * Property region stored in column Region in table C_Extbp_Config_Loc
     * 
     */
    public static final String PROPERTY_REGION = "region";

    /**
     * Property invoicingAddress stored in column Isbillto in table C_Extbp_Config_Loc<br>
     * Help: {@literal The Invoicing Address checkbox indicates if this location is the Invoicing Address for
     *       this Business Partner}
     * 
     */
    public static final String PROPERTY_INVOICINGADDRESS = "invoicingAddress";

    /**
     * Property shippingAddress stored in column Isshipto in table C_Extbp_Config_Loc<br>
     * Help: {@literal The Shipping Address checkbox indicates if this location is the address to use when
     *       shipping orders to this Business Partner.}
     * 
     */
    public static final String PROPERTY_SHIPPINGADDRESS = "shippingAddress";

    /**
     * Property isshippingAddress stored in column Isshipping_Address in table C_Extbp_Config_Loc
     * 
     */
    public static final String PROPERTY_ISSHIPPINGADDRESS = "isshippingAddress";

    /**
     * Property isinvoiceAddress stored in column Isinvoice_Address in table C_Extbp_Config_Loc
     * 
     */
    public static final String PROPERTY_ISINVOICEADDRESS = "isinvoiceAddress";

    /**
     * Property isdefaultShippingAddress stored in column Isdefault_Shipping_Address in table C_Extbp_Config_Loc
     * 
     */
    public static final String PROPERTY_ISDEFAULTSHIPPINGADDRESS = "isdefaultShippingAddress";

    /**
     * Property isdefaultInvoiceAddress stored in column Isdefault_Invoice_Address in table C_Extbp_Config_Loc
     * 
     */
    public static final String PROPERTY_ISDEFAULTINVOICEADDRESS = "isdefaultInvoiceAddress";


    public ExternalBusinessPartnerConfigLocation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_INVOICINGADDRESS, true);
        setDefaultValue(PROPERTY_SHIPPINGADDRESS, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CRMCONNECTORCONFIGURATION
     * 
     */
    public ExternalBusinessPartnerConfig getCRMConnectorConfiguration() {
        return (ExternalBusinessPartnerConfig) get(PROPERTY_CRMCONNECTORCONFIGURATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CRMCONNECTORCONFIGURATION
     * 
     */
    public void setCRMConnectorConfiguration(ExternalBusinessPartnerConfig cRMConnectorConfiguration) {
        set(PROPERTY_CRMCONNECTORCONFIGURATION, cRMConnectorConfiguration);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ADDRESSLINE1
     * 
     */
    public ExternalBusinessPartnerConfigProperty getAddressLine1() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_ADDRESSLINE1);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ADDRESSLINE1
     * 
     */
    public void setAddressLine1(ExternalBusinessPartnerConfigProperty addressLine1) {
        set(PROPERTY_ADDRESSLINE1, addressLine1);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ADDRESSLINE2
     * 
     */
    public ExternalBusinessPartnerConfigProperty getAddressLine2() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_ADDRESSLINE2);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ADDRESSLINE2
     * 
     */
    public void setAddressLine2(ExternalBusinessPartnerConfigProperty addressLine2) {
        set(PROPERTY_ADDRESSLINE2, addressLine2);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CITYNAME
     * 
     */
    public ExternalBusinessPartnerConfigProperty getCityName() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_CITYNAME);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_CITYNAME
     * 
     */
    public void setCityName(ExternalBusinessPartnerConfigProperty cityName) {
        set(PROPERTY_CITYNAME, cityName);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_POSTALCODE
     * 
     */
    public ExternalBusinessPartnerConfigProperty getPostalCode() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_POSTALCODE);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_POSTALCODE
     * 
     */
    public void setPostalCode(ExternalBusinessPartnerConfigProperty postalCode) {
        set(PROPERTY_POSTALCODE, postalCode);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_COUNTRY
     * 
     */
    public ExternalBusinessPartnerConfigProperty getCountry() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_COUNTRY);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_COUNTRY
     * 
     */
    public void setCountry(ExternalBusinessPartnerConfigProperty country) {
        set(PROPERTY_COUNTRY, country);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_REGION
     * 
     */
    public ExternalBusinessPartnerConfigProperty getRegion() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_REGION);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_REGION
     * 
     */
    public void setRegion(ExternalBusinessPartnerConfigProperty region) {
        set(PROPERTY_REGION, region);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_INVOICINGADDRESS
     * 
     */
    public Boolean isInvoicingAddress() {
        return (Boolean) get(PROPERTY_INVOICINGADDRESS);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_INVOICINGADDRESS
     * 
     */
    public void setInvoicingAddress(Boolean invoicingAddress) {
        set(PROPERTY_INVOICINGADDRESS, invoicingAddress);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_SHIPPINGADDRESS
     * 
     */
    public Boolean isShippingAddress() {
        return (Boolean) get(PROPERTY_SHIPPINGADDRESS);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_SHIPPINGADDRESS
     * 
     */
    public void setShippingAddress(Boolean shippingAddress) {
        set(PROPERTY_SHIPPINGADDRESS, shippingAddress);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISSHIPPINGADDRESS
     * 
     */
    public ExternalBusinessPartnerConfigProperty getIsshippingAddress() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_ISSHIPPINGADDRESS);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISSHIPPINGADDRESS
     * 
     */
    public void setIsshippingAddress(ExternalBusinessPartnerConfigProperty isshippingAddress) {
        set(PROPERTY_ISSHIPPINGADDRESS, isshippingAddress);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISINVOICEADDRESS
     * 
     */
    public ExternalBusinessPartnerConfigProperty getIsinvoiceAddress() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_ISINVOICEADDRESS);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISINVOICEADDRESS
     * 
     */
    public void setIsinvoiceAddress(ExternalBusinessPartnerConfigProperty isinvoiceAddress) {
        set(PROPERTY_ISINVOICEADDRESS, isinvoiceAddress);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISDEFAULTSHIPPINGADDRESS
     * 
     */
    public ExternalBusinessPartnerConfigProperty getIsdefaultShippingAddress() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_ISDEFAULTSHIPPINGADDRESS);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISDEFAULTSHIPPINGADDRESS
     * 
     */
    public void setIsdefaultShippingAddress(ExternalBusinessPartnerConfigProperty isdefaultShippingAddress) {
        set(PROPERTY_ISDEFAULTSHIPPINGADDRESS, isdefaultShippingAddress);
    }

    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISDEFAULTINVOICEADDRESS
     * 
     */
    public ExternalBusinessPartnerConfigProperty getIsdefaultInvoiceAddress() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_ISDEFAULTINVOICEADDRESS);
    }
    /**
     * @see ExternalBusinessPartnerConfigLocation#PROPERTY_ISDEFAULTINVOICEADDRESS
     * 
     */
    public void setIsdefaultInvoiceAddress(ExternalBusinessPartnerConfigProperty isdefaultInvoiceAddress) {
        set(PROPERTY_ISDEFAULTINVOICEADDRESS, isdefaultInvoiceAddress);
    }

}
