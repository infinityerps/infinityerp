
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
package org.openbravo.model.financialmgmt.assetmgmt;

import java.math.BigDecimal;
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
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity AmortizationLineAccountingDimension (stored in table A_Amortline_Acctdimension).
 * <br>
 * Help: {@literal Amortization Line Accounting Dimension}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AmortizationLineAccountingDimension extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "A_Amortline_Acctdimension";
    public static final String ENTITY_NAME = "AmortizationLineAccountingDimension";

    /**
     * Property id stored in column A_Amortline_Acctdimension_ID in table A_Amortline_Acctdimension 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table A_Amortline_Acctdimension 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table A_Amortline_Acctdimension 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table A_Amortline_Acctdimension 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table A_Amortline_Acctdimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table A_Amortline_Acctdimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table A_Amortline_Acctdimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table A_Amortline_Acctdimension 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property amortizationline stored in column A_Amortizationline_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal Depreciation of an asset between two dates}
     * 
     */
    public static final String PROPERTY_AMORTIZATIONLINE = "amortizationline";

    /**
     * Property amount stored in column Amt in table A_Amortline_Acctdimension 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property project stored in column C_Project_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property stDimension stored in column User1_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property activity stored in column C_Activity_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property product stored in column M_Product_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property asset stored in column A_Asset_ID in table A_Amortline_Acctdimension<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";


    public AmortizationLineAccountingDimension() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_AMORTIZATIONLINE
     * 
     */
    public AmortizationLine getAmortizationline() {
        return (AmortizationLine) get(PROPERTY_AMORTIZATIONLINE);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_AMORTIZATIONLINE
     * 
     */
    public void setAmortizationline(AmortizationLine amortizationline) {
        set(PROPERTY_AMORTIZATIONLINE, amortizationline);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see AmortizationLineAccountingDimension#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

}
