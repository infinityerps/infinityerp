
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
package org.openbravo.model.financialmgmt.accounting.coa;

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
import org.openbravo.model.common.geography.Location;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity FinancialMgmtAccountingCombination (stored in table C_ValidCombination).
 * <br>
 * Help: {@literal The Account Combination Tab defines and displays valid account combination.  An Alias can
     *       be defined to facilitate document entry.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AccountingCombination extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ValidCombination";
    public static final String ENTITY_NAME = "FinancialMgmtAccountingCombination";

    /**
     * Property id stored in column C_ValidCombination_ID in table C_ValidCombination<br>
     * Help: {@literal The Combination identifies a valid combination of element which represent a GL account.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ValidCombination 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ValidCombination 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_ValidCombination 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ValidCombination 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_ValidCombination 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ValidCombination 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_ValidCombination 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property alias stored in column Alias in table C_ValidCombination<br>
     * Help: {@literal The Alias field allows you to define a alternate method for referring to a full account
     *       combination.  For example, the Account Receivable Account for Garden World may be aliased as GW_AR.}
     * 
     */
    public static final String PROPERTY_ALIAS = "alias";

    /**
     * Property combination stored in column Combination in table C_ValidCombination<br>
     * Help: {@literal The Combination field defines the unique combination of element values which comprise this
     *       account.}
     * 
     */
    public static final String PROPERTY_COMBINATION = "combination";

    /**
     * Property description stored in column Description in table C_ValidCombination<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property fullyQualified stored in column IsFullyQualified in table C_ValidCombination<br>
     * Help: {@literal The Fully Qualified check box indicates that all required elements for an account
     *       combination are present.}
     * 
     */
    public static final String PROPERTY_FULLYQUALIFIED = "fullyQualified";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_ValidCombination<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property account stored in column Account_ID in table C_ValidCombination<br>
     * Help: {@literal The (natural) account used}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property product stored in column M_Product_ID in table C_ValidCombination<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_ValidCombination<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table C_ValidCombination<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property locationFromAddress stored in column C_LocFrom_ID in table C_ValidCombination<br>
     * Help: {@literal The Location From indicates the location that a product was moved from.}
     * 
     */
    public static final String PROPERTY_LOCATIONFROMADDRESS = "locationFromAddress";

    /**
     * Property locationToAddress stored in column C_LocTo_ID in table C_ValidCombination<br>
     * Help: {@literal The Location To indicates the location that a product was moved to.}
     * 
     */
    public static final String PROPERTY_LOCATIONTOADDRESS = "locationToAddress";

    /**
     * Property salesRegion stored in column C_SalesRegion_ID in table C_ValidCombination<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property project stored in column C_Project_ID in table C_ValidCombination<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_ValidCombination<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table C_ValidCombination<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table C_ValidCombination<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table C_ValidCombination<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";


    public AccountingCombination() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FULLYQUALIFIED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AccountingCombination#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AccountingCombination#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AccountingCombination#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AccountingCombination#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AccountingCombination#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AccountingCombination#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AccountingCombination#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AccountingCombination#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AccountingCombination#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AccountingCombination#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AccountingCombination#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AccountingCombination#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AccountingCombination#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AccountingCombination#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AccountingCombination#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AccountingCombination#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AccountingCombination#PROPERTY_ALIAS
     * 
     */
    public String getAlias() {
        return (String) get(PROPERTY_ALIAS);
    }
    /**
     * @see AccountingCombination#PROPERTY_ALIAS
     * 
     */
    public void setAlias(String alias) {
        set(PROPERTY_ALIAS, alias);
    }

    /**
     * @see AccountingCombination#PROPERTY_COMBINATION
     * 
     */
    public String getCombination() {
        return (String) get(PROPERTY_COMBINATION);
    }
    /**
     * @see AccountingCombination#PROPERTY_COMBINATION
     * 
     */
    public void setCombination(String combination) {
        set(PROPERTY_COMBINATION, combination);
    }

    /**
     * @see AccountingCombination#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AccountingCombination#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AccountingCombination#PROPERTY_FULLYQUALIFIED
     * 
     */
    public Boolean isFullyQualified() {
        return (Boolean) get(PROPERTY_FULLYQUALIFIED);
    }
    /**
     * @see AccountingCombination#PROPERTY_FULLYQUALIFIED
     * 
     */
    public void setFullyQualified(Boolean fullyQualified) {
        set(PROPERTY_FULLYQUALIFIED, fullyQualified);
    }

    /**
     * @see AccountingCombination#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AccountingCombination#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AccountingCombination#PROPERTY_ACCOUNT
     * 
     */
    public ElementValue getAccount() {
        return (ElementValue) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see AccountingCombination#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(ElementValue account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see AccountingCombination#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see AccountingCombination#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see AccountingCombination#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see AccountingCombination#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see AccountingCombination#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see AccountingCombination#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see AccountingCombination#PROPERTY_LOCATIONFROMADDRESS
     * 
     */
    public Location getLocationFromAddress() {
        return (Location) get(PROPERTY_LOCATIONFROMADDRESS);
    }
    /**
     * @see AccountingCombination#PROPERTY_LOCATIONFROMADDRESS
     * 
     */
    public void setLocationFromAddress(Location locationFromAddress) {
        set(PROPERTY_LOCATIONFROMADDRESS, locationFromAddress);
    }

    /**
     * @see AccountingCombination#PROPERTY_LOCATIONTOADDRESS
     * 
     */
    public Location getLocationToAddress() {
        return (Location) get(PROPERTY_LOCATIONTOADDRESS);
    }
    /**
     * @see AccountingCombination#PROPERTY_LOCATIONTOADDRESS
     * 
     */
    public void setLocationToAddress(Location locationToAddress) {
        set(PROPERTY_LOCATIONTOADDRESS, locationToAddress);
    }

    /**
     * @see AccountingCombination#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see AccountingCombination#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see AccountingCombination#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see AccountingCombination#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see AccountingCombination#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see AccountingCombination#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see AccountingCombination#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see AccountingCombination#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see AccountingCombination#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see AccountingCombination#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see AccountingCombination#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see AccountingCombination#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

}
