
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
package org.openbravo.model.ad.system;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.ad.utility.Tree;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.externalbpartner.ExternalBusinessPartnerConfig;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.calendar.Calendar;
import org.openbravo.model.pricing.pricelist.PriceList;
/**
 * Entity class for entity ClientInformation (stored in table AD_ClientInfo).
 * <br>
 * Help: {@literal The Client Info Tab defines the details for each client.  The accounting rules and high
     *       level defaults are defined here. The Calendar is used to determine if a period is open or closed.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ClientInformation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_ClientInfo";
    public static final String ENTITY_NAME = "ClientInformation";

    /**
     * Property id stored in column AD_Client_ID in table AD_ClientInfo 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property organization stored in column AD_Org_ID in table AD_ClientInfo 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_ClientInfo 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_ClientInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_ClientInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_ClientInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_ClientInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property discountCalculatedFromLineAmounts stored in column IsDiscountLineAmt in table AD_ClientInfo<br>
     * Help: {@literal If the payment discount is calculated from line amounts only, the tax and charge amounts
     *       are not included. This is e.g. business practice in the US.  If not selected the total invoice
     *       amount is used to calculate the payment discount.}
     * 
     */
    public static final String PROPERTY_DISCOUNTCALCULATEDFROMLINEAMOUNTS = "discountCalculatedFromLineAmounts";

    /**
     * Property calendar stored in column C_Calendar_ID in table AD_ClientInfo<br>
     * Help: {@literal The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used. 
     *       For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar
     *       that runs from July 1 to June 30.}
     * 
     */
    public static final String PROPERTY_CALENDAR = "calendar";

    /**
     * Property primaryAccountingSchema stored in column C_AcctSchema1_ID in table AD_ClientInfo<br>
     * Help: {@literal An Accounting  Schema defines the rules used accounting such as costing method, currency
     *       and calendar.}
     * 
     */
    public static final String PROPERTY_PRIMARYACCOUNTINGSCHEMA = "primaryAccountingSchema";

    /**
     * Property enableSecondAccountingSchema stored in column Acct2_Active in table AD_ClientInfo<br>
     * Help: {@literal The Second Accounting Schema indicates an alternate set of rules to use for generating
     *       reports.}
     * 
     */
    public static final String PROPERTY_ENABLESECONDACCOUNTINGSCHEMA = "enableSecondAccountingSchema";

    /**
     * Property secondAccountingSchema stored in column C_AcctSchema2_ID in table AD_ClientInfo<br>
     * Help: {@literal An Accounting Schema defines the rules used in accounting such as costing method, currency
     *       and calendar.}
     * 
     */
    public static final String PROPERTY_SECONDACCOUNTINGSCHEMA = "secondAccountingSchema";

    /**
     * Property enableThirdAccountingSchema stored in column Acct3_Active in table AD_ClientInfo<br>
     * Help: {@literal The Third Accounting Schema indicates an alternate set of rules to use for generating
     *       reports.}
     * 
     */
    public static final String PROPERTY_ENABLETHIRDACCOUNTINGSCHEMA = "enableThirdAccountingSchema";

    /**
     * Property thirdAccountingSchema stored in column C_AcctSchema3_ID in table AD_ClientInfo<br>
     * Help: {@literal An Accounting Schema defines the rules used in accounting such as costing method, currency
     *       and calendar}
     * 
     */
    public static final String PROPERTY_THIRDACCOUNTINGSCHEMA = "thirdAccountingSchema";

    /**
     * Property uOMForVolume stored in column C_UOM_Volume_ID in table AD_ClientInfo<br>
     * Help: {@literal The Standard UOM for Volume indicates the UOM to use for products referenced by volume in
     *       a document.}
     * 
     */
    public static final String PROPERTY_UOMFORVOLUME = "uOMForVolume";

    /**
     * Property uOMForWeight stored in column C_UOM_Weight_ID in table AD_ClientInfo<br>
     * Help: {@literal The Standard UOM for Weight indicates the UOM to use for products referenced by weight in
     *       a document.}
     * 
     */
    public static final String PROPERTY_UOMFORWEIGHT = "uOMForWeight";

    /**
     * Property uOMForLength stored in column C_UOM_Length_ID in table AD_ClientInfo<br>
     * Help: {@literal The Standard UOM for Length indicates the UOM to use for products referenced by length in
     *       a document.}
     * 
     */
    public static final String PROPERTY_UOMFORLENGTH = "uOMForLength";

    /**
     * Property uOMForTime stored in column C_UOM_Time_ID in table AD_ClientInfo<br>
     * Help: {@literal The Standard UOM for Time indicates the UOM to use for products referenced by time in a
     *       document.}
     * 
     */
    public static final String PROPERTY_UOMFORTIME = "uOMForTime";

    /**
     * Property primaryTreeMenu stored in column AD_Tree_Menu_ID in table AD_ClientInfo<br>
     * Help: {@literal Tree Menu}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEMENU = "primaryTreeMenu";

    /**
     * Property primaryTreeOrganization stored in column AD_Tree_Org_ID in table AD_ClientInfo<br>
     * Help: {@literal Organization Tree}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEORGANIZATION = "primaryTreeOrganization";

    /**
     * Property primaryTreeBPartner stored in column AD_Tree_BPartner_ID in table AD_ClientInfo<br>
     * Help: {@literal Business Partner Tree}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEBPARTNER = "primaryTreeBPartner";

    /**
     * Property primaryTreeProject stored in column AD_Tree_Project_ID in table AD_ClientInfo<br>
     * Help: {@literal Project Tree}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEPROJECT = "primaryTreeProject";

    /**
     * Property primaryTreeSalesRegion stored in column AD_Tree_SalesRegion_ID in table AD_ClientInfo
     * 
     */
    public static final String PROPERTY_PRIMARYTREESALESREGION = "primaryTreeSalesRegion";

    /**
     * Property primaryTreeProduct stored in column AD_Tree_Product_ID in table AD_ClientInfo<br>
     * Help: {@literal Product Tree}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEPRODUCT = "primaryTreeProduct";

    /**
     * Property productForFreight stored in column M_ProductFreight_ID in table AD_ClientInfo
     * 
     */
    public static final String PROPERTY_PRODUCTFORFREIGHT = "productForFreight";

    /**
     * Property templateBPartner stored in column C_BPartnerCashTrx_ID in table AD_ClientInfo<br>
     * Help: {@literal When creating a new Business Partner from the Business Partner Search Field (right-click:
     *       Create), the selected business partner is used as a template, e.g. to define price list, payment
     *       terms, etc.}
     * 
     */
    public static final String PROPERTY_TEMPLATEBPARTNER = "templateBPartner";

    /**
     * Property priceList stored in column M_PriceList_ID in table AD_ClientInfo<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property allowNegativeStock stored in column AllowNegativeStock in table AD_ClientInfo<br>
     * Help: {@literal Allow negative stock}
     * 
     */
    public static final String PROPERTY_ALLOWNEGATIVESTOCK = "allowNegativeStock";

    /**
     * Property checkOrderOrganization stored in column Checkorderorg in table AD_ClientInfo<br>
     * Help: {@literal The checkorderorg identifies the order organization and the business partner organization
     *       and makes sure both are the same.}
     * 
     */
    public static final String PROPERTY_CHECKORDERORGANIZATION = "checkOrderOrganization";

    /**
     * Property checkShipmentOrganization stored in column Checkinoutorg in table AD_ClientInfo<br>
     * Help: {@literal The Checkinoutorg identifies the shipment organization and the business partner
     *       organization and makes sure both are the same}
     * 
     */
    public static final String PROPERTY_CHECKSHIPMENTORGANIZATION = "checkShipmentOrganization";

    /**
     * Property groupInvoiceLinesInAccounting stored in column Groupacctinvlines in table AD_ClientInfo<br>
     * Help: {@literal Group Accounting Invoice Lines}
     * 
     */
    public static final String PROPERTY_GROUPINVOICELINESINACCOUNTING = "groupInvoiceLinesInAccounting";

    /**
     * Property yourCompanyMenuImage stored in column Your_Company_Menu_Image in table AD_ClientInfo
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYMENUIMAGE = "yourCompanyMenuImage";

    /**
     * Property yourCompanyBigImage stored in column Your_Company_Big_Image in table AD_ClientInfo
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYBIGIMAGE = "yourCompanyBigImage";

    /**
     * Property yourCompanyDocumentImage stored in column Your_Company_Document_Image in table AD_ClientInfo
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYDOCUMENTIMAGE = "yourCompanyDocumentImage";

    /**
     * Property treeCampaign stored in column AD_Tree_Campaign_ID in table AD_ClientInfo
     * 
     */
    public static final String PROPERTY_TREECAMPAIGN = "treeCampaign";

    /**
     * Property primaryTreeAsset stored in column AD_Tree_Asset_ID in table AD_ClientInfo<br>
     * Help: {@literal Asset Tree}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEASSET = "primaryTreeAsset";

    /**
     * Property primaryTreeProductCategory stored in column AD_Tree_Product_Category_ID in table AD_ClientInfo<br>
     * Help: {@literal Product Category Tree}
     * 
     */
    public static final String PROPERTY_PRIMARYTREEPRODUCTCATEGORY = "primaryTreeProductCategory";

    /**
     * Property primaryTreeCostCenter stored in column AD_Tree_Costcenter_ID in table AD_ClientInfo
     * 
     */
    public static final String PROPERTY_PRIMARYTREECOSTCENTER = "primaryTreeCostCenter";

    /**
     * Property primaryTreeResourceCategory stored in column AD_Tree_Obre_Resource_Category in table AD_ClientInfo
     * 
     */
    public static final String PROPERTY_PRIMARYTREERESOURCECATEGORY = "primaryTreeResourceCategory";

    /**
     * Property primaryUserDimension1 stored in column AD_Tree_User1_ID in table AD_ClientInfo<br>
     * Help: {@literal Primary User Dimension 1}
     * 
     */
    public static final String PROPERTY_PRIMARYUSERDIMENSION1 = "primaryUserDimension1";

    /**
     * Property primaryUserDimension2 stored in column AD_Tree_User2_ID in table AD_ClientInfo<br>
     * Help: {@literal Primary User Dimension 2}
     * 
     */
    public static final String PROPERTY_PRIMARYUSERDIMENSION2 = "primaryUserDimension2";

    /**
     * Property extbpEnabled stored in column C_Extbp_Enabled in table AD_ClientInfo<br>
     * Help: {@literal It allows to configure an integration with an external CRM system}
     * 
     */
    public static final String PROPERTY_EXTBPENABLED = "extbpEnabled";

    /**
     * Property extbpConfig stored in column C_Extbp_Config_ID in table AD_ClientInfo<br>
     * Help: {@literal Configuration to connect to the CRM system API, and which also defines the properties and
     *       filters used by Openbravo to map with the external system information.}
     * 
     */
    public static final String PROPERTY_EXTBPCONFIG = "extbpConfig";

    /**
     * Property companyLogo stored in column Company_Logo in table AD_ClientInfo<br>
     * Help: {@literal This logo will be used in the login screen and inside all Openbravo applications}
     * 
     */
    public static final String PROPERTY_COMPANYLOGO = "companyLogo";

    /**
     * Property companyLogoDark stored in column Company_Logo_Dark in table AD_ClientInfo<br>
     * Help: {@literal This logo will be used in the login screen and inside all Openbravo applications when they
     *       use
     *       a Dark theme. Note that this logo should have different colors or more contrast than the
     *       original logo in order to be seen properly in a dark background.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGODARK = "companyLogoDark";

    /**
     * Property companyLogoSubmark stored in column Company_Logo_Submark in table AD_ClientInfo<br>
     * Help: {@literal The submark logo is a simplified version of the Company Logo which is consistent with your
     *       brand and can be used to replace the Company Logo in places where this logo does not fit, such as in
     *       an application in a narrow screen where the Company Logo has no room to be showed properly}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOSUBMARK = "companyLogoSubmark";

    /**
     * Property companyLogoSubmarkDark stored in column Company_Logo_Submark_Dark in table AD_ClientInfo<br>
     * Help: {@literal The submark logo is a simplified version of the Company Logo which is consistent with your
     *       brand and can be used to replace the Company Logo in places where this logo does not fit, such as in
     *       an application on a narrow screen where the Company Logo has no room to be showed properly. Note
     *       that this logo should have different colors or more contrast than the original logo in order to be
     *       seen properly over a dark background.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOSUBMARKDARK = "companyLogoSubmarkDark";

    /**
     * Property companyLogoForDocs stored in column Company_Logo_For_Docs in table AD_ClientInfo<br>
     * Help: {@literal Company Logo used to be printed in invoices or other documents}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOFORDOCS = "companyLogoForDocs";

    /**
     * Property companyLogoForReceipts stored in column Company_Logo_For_Receipts in table AD_ClientInfo<br>
     * Help: {@literal Company Logo used to be printed in receipts. Usually those receipts are printed using only
     *       black ink, so this logo should be adapted to be able to print it properly using only one ink.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOFORRECEIPTS = "companyLogoForReceipts";

    /**
     * Property client stored in column AD_Client_ID in table AD_ClientInfo<br>
     * Help: {@literal A Client is a company or a legal entity. You cannot share data between Clients.}
     * 
     */
    public static final String PROPERTY_CLIENT = "client";


    public ClientInformation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DISCOUNTCALCULATEDFROMLINEAMOUNTS, false);
        setDefaultValue(PROPERTY_ENABLESECONDACCOUNTINGSCHEMA, false);
        setDefaultValue(PROPERTY_ENABLETHIRDACCOUNTINGSCHEMA, false);
        setDefaultValue(PROPERTY_ALLOWNEGATIVESTOCK, false);
        setDefaultValue(PROPERTY_CHECKORDERORGANIZATION, true);
        setDefaultValue(PROPERTY_CHECKSHIPMENTORGANIZATION, true);
        setDefaultValue(PROPERTY_GROUPINVOICELINESINACCOUNTING, false);
        setDefaultValue(PROPERTY_EXTBPENABLED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ClientInformation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ClientInformation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ClientInformation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ClientInformation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ClientInformation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ClientInformation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ClientInformation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ClientInformation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ClientInformation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ClientInformation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ClientInformation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ClientInformation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ClientInformation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ClientInformation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ClientInformation#PROPERTY_DISCOUNTCALCULATEDFROMLINEAMOUNTS
     * 
     */
    public Boolean isDiscountCalculatedFromLineAmounts() {
        return (Boolean) get(PROPERTY_DISCOUNTCALCULATEDFROMLINEAMOUNTS);
    }
    /**
     * @see ClientInformation#PROPERTY_DISCOUNTCALCULATEDFROMLINEAMOUNTS
     * 
     */
    public void setDiscountCalculatedFromLineAmounts(Boolean discountCalculatedFromLineAmounts) {
        set(PROPERTY_DISCOUNTCALCULATEDFROMLINEAMOUNTS, discountCalculatedFromLineAmounts);
    }

    /**
     * @see ClientInformation#PROPERTY_CALENDAR
     * 
     */
    public Calendar getCalendar() {
        return (Calendar) get(PROPERTY_CALENDAR);
    }
    /**
     * @see ClientInformation#PROPERTY_CALENDAR
     * 
     */
    public void setCalendar(Calendar calendar) {
        set(PROPERTY_CALENDAR, calendar);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getPrimaryAccountingSchema() {
        return (AcctSchema) get(PROPERTY_PRIMARYACCOUNTINGSCHEMA);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYACCOUNTINGSCHEMA
     * 
     */
    public void setPrimaryAccountingSchema(AcctSchema primaryAccountingSchema) {
        set(PROPERTY_PRIMARYACCOUNTINGSCHEMA, primaryAccountingSchema);
    }

    /**
     * @see ClientInformation#PROPERTY_ENABLESECONDACCOUNTINGSCHEMA
     * 
     */
    public Boolean isEnableSecondAccountingSchema() {
        return (Boolean) get(PROPERTY_ENABLESECONDACCOUNTINGSCHEMA);
    }
    /**
     * @see ClientInformation#PROPERTY_ENABLESECONDACCOUNTINGSCHEMA
     * 
     */
    public void setEnableSecondAccountingSchema(Boolean enableSecondAccountingSchema) {
        set(PROPERTY_ENABLESECONDACCOUNTINGSCHEMA, enableSecondAccountingSchema);
    }

    /**
     * @see ClientInformation#PROPERTY_SECONDACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getSecondAccountingSchema() {
        return (AcctSchema) get(PROPERTY_SECONDACCOUNTINGSCHEMA);
    }
    /**
     * @see ClientInformation#PROPERTY_SECONDACCOUNTINGSCHEMA
     * 
     */
    public void setSecondAccountingSchema(AcctSchema secondAccountingSchema) {
        set(PROPERTY_SECONDACCOUNTINGSCHEMA, secondAccountingSchema);
    }

    /**
     * @see ClientInformation#PROPERTY_ENABLETHIRDACCOUNTINGSCHEMA
     * 
     */
    public Boolean isEnableThirdAccountingSchema() {
        return (Boolean) get(PROPERTY_ENABLETHIRDACCOUNTINGSCHEMA);
    }
    /**
     * @see ClientInformation#PROPERTY_ENABLETHIRDACCOUNTINGSCHEMA
     * 
     */
    public void setEnableThirdAccountingSchema(Boolean enableThirdAccountingSchema) {
        set(PROPERTY_ENABLETHIRDACCOUNTINGSCHEMA, enableThirdAccountingSchema);
    }

    /**
     * @see ClientInformation#PROPERTY_THIRDACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getThirdAccountingSchema() {
        return (AcctSchema) get(PROPERTY_THIRDACCOUNTINGSCHEMA);
    }
    /**
     * @see ClientInformation#PROPERTY_THIRDACCOUNTINGSCHEMA
     * 
     */
    public void setThirdAccountingSchema(AcctSchema thirdAccountingSchema) {
        set(PROPERTY_THIRDACCOUNTINGSCHEMA, thirdAccountingSchema);
    }

    /**
     * @see ClientInformation#PROPERTY_UOMFORVOLUME
     * 
     */
    public UOM getUOMForVolume() {
        return (UOM) get(PROPERTY_UOMFORVOLUME);
    }
    /**
     * @see ClientInformation#PROPERTY_UOMFORVOLUME
     * 
     */
    public void setUOMForVolume(UOM uOMForVolume) {
        set(PROPERTY_UOMFORVOLUME, uOMForVolume);
    }

    /**
     * @see ClientInformation#PROPERTY_UOMFORWEIGHT
     * 
     */
    public UOM getUOMForWeight() {
        return (UOM) get(PROPERTY_UOMFORWEIGHT);
    }
    /**
     * @see ClientInformation#PROPERTY_UOMFORWEIGHT
     * 
     */
    public void setUOMForWeight(UOM uOMForWeight) {
        set(PROPERTY_UOMFORWEIGHT, uOMForWeight);
    }

    /**
     * @see ClientInformation#PROPERTY_UOMFORLENGTH
     * 
     */
    public UOM getUOMForLength() {
        return (UOM) get(PROPERTY_UOMFORLENGTH);
    }
    /**
     * @see ClientInformation#PROPERTY_UOMFORLENGTH
     * 
     */
    public void setUOMForLength(UOM uOMForLength) {
        set(PROPERTY_UOMFORLENGTH, uOMForLength);
    }

    /**
     * @see ClientInformation#PROPERTY_UOMFORTIME
     * 
     */
    public UOM getUOMForTime() {
        return (UOM) get(PROPERTY_UOMFORTIME);
    }
    /**
     * @see ClientInformation#PROPERTY_UOMFORTIME
     * 
     */
    public void setUOMForTime(UOM uOMForTime) {
        set(PROPERTY_UOMFORTIME, uOMForTime);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEMENU
     * 
     */
    public Tree getPrimaryTreeMenu() {
        return (Tree) get(PROPERTY_PRIMARYTREEMENU);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEMENU
     * 
     */
    public void setPrimaryTreeMenu(Tree primaryTreeMenu) {
        set(PROPERTY_PRIMARYTREEMENU, primaryTreeMenu);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEORGANIZATION
     * 
     */
    public Tree getPrimaryTreeOrganization() {
        return (Tree) get(PROPERTY_PRIMARYTREEORGANIZATION);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEORGANIZATION
     * 
     */
    public void setPrimaryTreeOrganization(Tree primaryTreeOrganization) {
        set(PROPERTY_PRIMARYTREEORGANIZATION, primaryTreeOrganization);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEBPARTNER
     * 
     */
    public Tree getPrimaryTreeBPartner() {
        return (Tree) get(PROPERTY_PRIMARYTREEBPARTNER);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEBPARTNER
     * 
     */
    public void setPrimaryTreeBPartner(Tree primaryTreeBPartner) {
        set(PROPERTY_PRIMARYTREEBPARTNER, primaryTreeBPartner);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEPROJECT
     * 
     */
    public Tree getPrimaryTreeProject() {
        return (Tree) get(PROPERTY_PRIMARYTREEPROJECT);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEPROJECT
     * 
     */
    public void setPrimaryTreeProject(Tree primaryTreeProject) {
        set(PROPERTY_PRIMARYTREEPROJECT, primaryTreeProject);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREESALESREGION
     * 
     */
    public Tree getPrimaryTreeSalesRegion() {
        return (Tree) get(PROPERTY_PRIMARYTREESALESREGION);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREESALESREGION
     * 
     */
    public void setPrimaryTreeSalesRegion(Tree primaryTreeSalesRegion) {
        set(PROPERTY_PRIMARYTREESALESREGION, primaryTreeSalesRegion);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEPRODUCT
     * 
     */
    public Tree getPrimaryTreeProduct() {
        return (Tree) get(PROPERTY_PRIMARYTREEPRODUCT);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEPRODUCT
     * 
     */
    public void setPrimaryTreeProduct(Tree primaryTreeProduct) {
        set(PROPERTY_PRIMARYTREEPRODUCT, primaryTreeProduct);
    }

    /**
     * @see ClientInformation#PROPERTY_PRODUCTFORFREIGHT
     * 
     */
    public Product getProductForFreight() {
        return (Product) get(PROPERTY_PRODUCTFORFREIGHT);
    }
    /**
     * @see ClientInformation#PROPERTY_PRODUCTFORFREIGHT
     * 
     */
    public void setProductForFreight(Product productForFreight) {
        set(PROPERTY_PRODUCTFORFREIGHT, productForFreight);
    }

    /**
     * @see ClientInformation#PROPERTY_TEMPLATEBPARTNER
     * 
     */
    public BusinessPartner getTemplateBPartner() {
        return (BusinessPartner) get(PROPERTY_TEMPLATEBPARTNER);
    }
    /**
     * @see ClientInformation#PROPERTY_TEMPLATEBPARTNER
     * 
     */
    public void setTemplateBPartner(BusinessPartner templateBPartner) {
        set(PROPERTY_TEMPLATEBPARTNER, templateBPartner);
    }

    /**
     * @see ClientInformation#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see ClientInformation#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see ClientInformation#PROPERTY_ALLOWNEGATIVESTOCK
     * 
     */
    public Boolean isAllowNegativeStock() {
        return (Boolean) get(PROPERTY_ALLOWNEGATIVESTOCK);
    }
    /**
     * @see ClientInformation#PROPERTY_ALLOWNEGATIVESTOCK
     * 
     */
    public void setAllowNegativeStock(Boolean allowNegativeStock) {
        set(PROPERTY_ALLOWNEGATIVESTOCK, allowNegativeStock);
    }

    /**
     * @see ClientInformation#PROPERTY_CHECKORDERORGANIZATION
     * 
     */
    public Boolean isCheckOrderOrganization() {
        return (Boolean) get(PROPERTY_CHECKORDERORGANIZATION);
    }
    /**
     * @see ClientInformation#PROPERTY_CHECKORDERORGANIZATION
     * 
     */
    public void setCheckOrderOrganization(Boolean checkOrderOrganization) {
        set(PROPERTY_CHECKORDERORGANIZATION, checkOrderOrganization);
    }

    /**
     * @see ClientInformation#PROPERTY_CHECKSHIPMENTORGANIZATION
     * 
     */
    public Boolean isCheckShipmentOrganization() {
        return (Boolean) get(PROPERTY_CHECKSHIPMENTORGANIZATION);
    }
    /**
     * @see ClientInformation#PROPERTY_CHECKSHIPMENTORGANIZATION
     * 
     */
    public void setCheckShipmentOrganization(Boolean checkShipmentOrganization) {
        set(PROPERTY_CHECKSHIPMENTORGANIZATION, checkShipmentOrganization);
    }

    /**
     * @see ClientInformation#PROPERTY_GROUPINVOICELINESINACCOUNTING
     * 
     */
    public Boolean isGroupInvoiceLinesInAccounting() {
        return (Boolean) get(PROPERTY_GROUPINVOICELINESINACCOUNTING);
    }
    /**
     * @see ClientInformation#PROPERTY_GROUPINVOICELINESINACCOUNTING
     * 
     */
    public void setGroupInvoiceLinesInAccounting(Boolean groupInvoiceLinesInAccounting) {
        set(PROPERTY_GROUPINVOICELINESINACCOUNTING, groupInvoiceLinesInAccounting);
    }

    /**
     * @see ClientInformation#PROPERTY_YOURCOMPANYMENUIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyMenuImage() {
        return (Image) get(PROPERTY_YOURCOMPANYMENUIMAGE);
    }
    /**
     * @see ClientInformation#PROPERTY_YOURCOMPANYMENUIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyMenuImage(Image yourCompanyMenuImage) {
        set(PROPERTY_YOURCOMPANYMENUIMAGE, yourCompanyMenuImage);
    }

    /**
     * @see ClientInformation#PROPERTY_YOURCOMPANYBIGIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyBigImage() {
        return (Image) get(PROPERTY_YOURCOMPANYBIGIMAGE);
    }
    /**
     * @see ClientInformation#PROPERTY_YOURCOMPANYBIGIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyBigImage(Image yourCompanyBigImage) {
        set(PROPERTY_YOURCOMPANYBIGIMAGE, yourCompanyBigImage);
    }

    /**
     * @see ClientInformation#PROPERTY_YOURCOMPANYDOCUMENTIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyDocumentImage() {
        return (Image) get(PROPERTY_YOURCOMPANYDOCUMENTIMAGE);
    }
    /**
     * @see ClientInformation#PROPERTY_YOURCOMPANYDOCUMENTIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyDocumentImage(Image yourCompanyDocumentImage) {
        set(PROPERTY_YOURCOMPANYDOCUMENTIMAGE, yourCompanyDocumentImage);
    }

    /**
     * @see ClientInformation#PROPERTY_TREECAMPAIGN
     * 
     */
    public Tree getTreeCampaign() {
        return (Tree) get(PROPERTY_TREECAMPAIGN);
    }
    /**
     * @see ClientInformation#PROPERTY_TREECAMPAIGN
     * 
     */
    public void setTreeCampaign(Tree treeCampaign) {
        set(PROPERTY_TREECAMPAIGN, treeCampaign);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEASSET
     * 
     */
    public Tree getPrimaryTreeAsset() {
        return (Tree) get(PROPERTY_PRIMARYTREEASSET);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEASSET
     * 
     */
    public void setPrimaryTreeAsset(Tree primaryTreeAsset) {
        set(PROPERTY_PRIMARYTREEASSET, primaryTreeAsset);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEPRODUCTCATEGORY
     * 
     */
    public Tree getPrimaryTreeProductCategory() {
        return (Tree) get(PROPERTY_PRIMARYTREEPRODUCTCATEGORY);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREEPRODUCTCATEGORY
     * 
     */
    public void setPrimaryTreeProductCategory(Tree primaryTreeProductCategory) {
        set(PROPERTY_PRIMARYTREEPRODUCTCATEGORY, primaryTreeProductCategory);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREECOSTCENTER
     * 
     */
    public Tree getPrimaryTreeCostCenter() {
        return (Tree) get(PROPERTY_PRIMARYTREECOSTCENTER);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREECOSTCENTER
     * 
     */
    public void setPrimaryTreeCostCenter(Tree primaryTreeCostCenter) {
        set(PROPERTY_PRIMARYTREECOSTCENTER, primaryTreeCostCenter);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREERESOURCECATEGORY
     * 
     */
    public Tree getPrimaryTreeResourceCategory() {
        return (Tree) get(PROPERTY_PRIMARYTREERESOURCECATEGORY);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYTREERESOURCECATEGORY
     * 
     */
    public void setPrimaryTreeResourceCategory(Tree primaryTreeResourceCategory) {
        set(PROPERTY_PRIMARYTREERESOURCECATEGORY, primaryTreeResourceCategory);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYUSERDIMENSION1
     * 
     */
    public Tree getPrimaryUserDimension1() {
        return (Tree) get(PROPERTY_PRIMARYUSERDIMENSION1);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYUSERDIMENSION1
     * 
     */
    public void setPrimaryUserDimension1(Tree primaryUserDimension1) {
        set(PROPERTY_PRIMARYUSERDIMENSION1, primaryUserDimension1);
    }

    /**
     * @see ClientInformation#PROPERTY_PRIMARYUSERDIMENSION2
     * 
     */
    public Tree getPrimaryUserDimension2() {
        return (Tree) get(PROPERTY_PRIMARYUSERDIMENSION2);
    }
    /**
     * @see ClientInformation#PROPERTY_PRIMARYUSERDIMENSION2
     * 
     */
    public void setPrimaryUserDimension2(Tree primaryUserDimension2) {
        set(PROPERTY_PRIMARYUSERDIMENSION2, primaryUserDimension2);
    }

    /**
     * @see ClientInformation#PROPERTY_EXTBPENABLED
     * 
     */
    public Boolean isExtbpEnabled() {
        return (Boolean) get(PROPERTY_EXTBPENABLED);
    }
    /**
     * @see ClientInformation#PROPERTY_EXTBPENABLED
     * 
     */
    public void setExtbpEnabled(Boolean extbpEnabled) {
        set(PROPERTY_EXTBPENABLED, extbpEnabled);
    }

    /**
     * @see ClientInformation#PROPERTY_EXTBPCONFIG
     * 
     */
    public ExternalBusinessPartnerConfig getExtbpConfig() {
        return (ExternalBusinessPartnerConfig) get(PROPERTY_EXTBPCONFIG);
    }
    /**
     * @see ClientInformation#PROPERTY_EXTBPCONFIG
     * 
     */
    public void setExtbpConfig(ExternalBusinessPartnerConfig extbpConfig) {
        set(PROPERTY_EXTBPCONFIG, extbpConfig);
    }

    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGO
     * 
     */
    public Image getCompanyLogo() {
        return (Image) get(PROPERTY_COMPANYLOGO);
    }
    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGO
     * 
     */
    public void setCompanyLogo(Image companyLogo) {
        set(PROPERTY_COMPANYLOGO, companyLogo);
    }

    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGODARK
     * 
     */
    public Image getCompanyLogoDark() {
        return (Image) get(PROPERTY_COMPANYLOGODARK);
    }
    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGODARK
     * 
     */
    public void setCompanyLogoDark(Image companyLogoDark) {
        set(PROPERTY_COMPANYLOGODARK, companyLogoDark);
    }

    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOSUBMARK
     * 
     */
    public Image getCompanyLogoSubmark() {
        return (Image) get(PROPERTY_COMPANYLOGOSUBMARK);
    }
    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOSUBMARK
     * 
     */
    public void setCompanyLogoSubmark(Image companyLogoSubmark) {
        set(PROPERTY_COMPANYLOGOSUBMARK, companyLogoSubmark);
    }

    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOSUBMARKDARK
     * 
     */
    public Image getCompanyLogoSubmarkDark() {
        return (Image) get(PROPERTY_COMPANYLOGOSUBMARKDARK);
    }
    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOSUBMARKDARK
     * 
     */
    public void setCompanyLogoSubmarkDark(Image companyLogoSubmarkDark) {
        set(PROPERTY_COMPANYLOGOSUBMARKDARK, companyLogoSubmarkDark);
    }

    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOFORDOCS
     * 
     */
    public Image getCompanyLogoForDocs() {
        return (Image) get(PROPERTY_COMPANYLOGOFORDOCS);
    }
    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOFORDOCS
     * 
     */
    public void setCompanyLogoForDocs(Image companyLogoForDocs) {
        set(PROPERTY_COMPANYLOGOFORDOCS, companyLogoForDocs);
    }

    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOFORRECEIPTS
     * 
     */
    public Image getCompanyLogoForReceipts() {
        return (Image) get(PROPERTY_COMPANYLOGOFORRECEIPTS);
    }
    /**
     * @see ClientInformation#PROPERTY_COMPANYLOGOFORRECEIPTS
     * 
     */
    public void setCompanyLogoForReceipts(Image companyLogoForReceipts) {
        set(PROPERTY_COMPANYLOGOFORRECEIPTS, companyLogoForReceipts);
    }

    /**
     * @see ClientInformation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ClientInformation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

}
