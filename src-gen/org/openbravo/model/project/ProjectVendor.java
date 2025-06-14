
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
package org.openbravo.model.project;

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
import org.openbravo.model.financialmgmt.payment.Incoterms;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.model.pricing.pricelist.PriceListVersion;
/**
 * Entity class for entity ProjectVendor (stored in table C_Project_Vendor).
 * <br>
 * Help: {@literal Contains all the vendors which have participated in the budgeting of a certain project.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProjectVendor extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Project_Vendor";
    public static final String ENTITY_NAME = "ProjectVendor";

    /**
     * Property id stored in column C_Project_Vendor_ID in table C_Project_Vendor 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Project_Vendor 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Project_Vendor 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Project_Vendor 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Project_Vendor 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Project_Vendor 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Project_Vendor 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Project_Vendor 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property project stored in column C_Project_ID in table C_Project_Vendor<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Project_Vendor<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property comments stored in column Note in table C_Project_Vendor<br>
     * Help: {@literal The Note field allows for optional entry of user defined information regarding this
     *       record}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property priceListVersion stored in column M_PriceList_Version_ID in table C_Project_Vendor<br>
     * Help: {@literal Each Price List can have multiple versions.  The most common use is to indicate the dates
     *       that a Price List is valid for.}
     * 
     */
    public static final String PROPERTY_PRICELISTVERSION = "priceListVersion";

    /**
     * Property incoterms stored in column C_Incoterms_ID in table C_Project_Vendor<br>
     * Help: {@literal The ID identifies a unique Incoterm}
     * 
     */
    public static final String PROPERTY_INCOTERMS = "incoterms";

    /**
     * Property iNCOTERMDescription stored in column Incoterms_Description in table C_Project_Vendor
     * 
     */
    public static final String PROPERTY_INCOTERMDESCRIPTION = "iNCOTERMDescription";

    /**
     * Property priceList stored in column M_PriceList_ID in table C_Project_Vendor<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property generateOrder stored in column GenerateOrder in table C_Project_Vendor<br>
     * Help: {@literal <P>This process lets you to generate a purchase order to this project.</P>}
     * 
     */
    public static final String PROPERTY_GENERATEORDER = "generateOrder";


    public ProjectVendor() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_GENERATEORDER, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProjectVendor#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProjectVendor#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProjectVendor#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProjectVendor#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProjectVendor#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProjectVendor#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProjectVendor#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProjectVendor#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProjectVendor#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProjectVendor#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProjectVendor#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProjectVendor#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProjectVendor#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProjectVendor#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProjectVendor#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProjectVendor#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProjectVendor#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see ProjectVendor#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see ProjectVendor#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ProjectVendor#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ProjectVendor#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see ProjectVendor#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see ProjectVendor#PROPERTY_PRICELISTVERSION
     * 
     */
    public PriceListVersion getPriceListVersion() {
        return (PriceListVersion) get(PROPERTY_PRICELISTVERSION);
    }
    /**
     * @see ProjectVendor#PROPERTY_PRICELISTVERSION
     * 
     */
    public void setPriceListVersion(PriceListVersion priceListVersion) {
        set(PROPERTY_PRICELISTVERSION, priceListVersion);
    }

    /**
     * @see ProjectVendor#PROPERTY_INCOTERMS
     * 
     */
    public Incoterms getIncoterms() {
        return (Incoterms) get(PROPERTY_INCOTERMS);
    }
    /**
     * @see ProjectVendor#PROPERTY_INCOTERMS
     * 
     */
    public void setIncoterms(Incoterms incoterms) {
        set(PROPERTY_INCOTERMS, incoterms);
    }

    /**
     * @see ProjectVendor#PROPERTY_INCOTERMDESCRIPTION
     * 
     */
    public String getINCOTERMDescription() {
        return (String) get(PROPERTY_INCOTERMDESCRIPTION);
    }
    /**
     * @see ProjectVendor#PROPERTY_INCOTERMDESCRIPTION
     * 
     */
    public void setINCOTERMDescription(String iNCOTERMDescription) {
        set(PROPERTY_INCOTERMDESCRIPTION, iNCOTERMDescription);
    }

    /**
     * @see ProjectVendor#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see ProjectVendor#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see ProjectVendor#PROPERTY_GENERATEORDER
     * 
     */
    public Boolean isGenerateOrder() {
        return (Boolean) get(PROPERTY_GENERATEORDER);
    }
    /**
     * @see ProjectVendor#PROPERTY_GENERATEORDER
     * 
     */
    public void setGenerateOrder(Boolean generateOrder) {
        set(PROPERTY_GENERATEORDER, generateOrder);
    }

}
