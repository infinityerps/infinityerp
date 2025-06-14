
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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.AccountingFact;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FinancialMgmtAsset (stored in table A_Asset).
 * <br>
 * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Asset extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "A_Asset";
    public static final String ENTITY_NAME = "FinancialMgmtAsset";

    /**
     * Property id stored in column A_Asset_ID in table A_Asset<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table A_Asset 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table A_Asset 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table A_Asset 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table A_Asset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table A_Asset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table A_Asset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table A_Asset 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table A_Asset<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table A_Asset 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table A_Asset<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table A_Asset<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property assetCategory stored in column A_Asset_Group_ID in table A_Asset<br>
     * Help: {@literal The group of assets determines default accounts.  If an asset group is selected in the
     *       product category, assets are created when delivering the asset.}
     * 
     */
    public static final String PROPERTY_ASSETCATEGORY = "assetCategory";

    /**
     * Property product stored in column M_Product_ID in table A_Asset<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property serialNo stored in column SerNo in table A_Asset<br>
     * Help: {@literal The Serial Number identifies a tracked, warranted product.  It can only be used when the
     *       quantity is 1.}
     * 
     */
    public static final String PROPERTY_SERIALNO = "serialNo";

    /**
     * Property lotName stored in column Lot in table A_Asset<br>
     * Help: {@literal The Lot Number indicates the specific lot that a product was part of.}
     * 
     */
    public static final String PROPERTY_LOTNAME = "lotName";

    /**
     * Property versionNo stored in column VersionNo in table A_Asset<br>
     * Help: {@literal Version Number}
     * 
     */
    public static final String PROPERTY_VERSIONNO = "versionNo";

    /**
     * Property expirationDate stored in column GuaranteeDate in table A_Asset<br>
     * Help: {@literal Date when the normal guarantee or availability expires}
     * 
     */
    public static final String PROPERTY_EXPIRATIONDATE = "expirationDate";

    /**
     * Property inServiceDate stored in column AssetServiceDate in table A_Asset<br>
     * Help: {@literal The date when the asset was put into service - usually used as start date for
     *       depreciation.}
     * 
     */
    public static final String PROPERTY_INSERVICEDATE = "inServiceDate";

    /**
     * Property owned stored in column IsOwned in table A_Asset<br>
     * Help: {@literal The asset may not be in possession, but the asset is legally owned by the organization}
     * 
     */
    public static final String PROPERTY_OWNED = "owned";

    /**
     * Property assetDepreciationDate stored in column AssetDepreciationDate in table A_Asset<br>
     * Help: {@literal Date of the last deprecation, if the asset is used internally and depreciated.}
     * 
     */
    public static final String PROPERTY_ASSETDEPRECIATIONDATE = "assetDepreciationDate";

    /**
     * Property usableLifeYears stored in column UseLifeYears in table A_Asset<br>
     * Help: {@literal Years of the usable life of the asset}
     * 
     */
    public static final String PROPERTY_USABLELIFEYEARS = "usableLifeYears";

    /**
     * Property usableLifeMonths stored in column UseLifeMonths in table A_Asset<br>
     * Help: {@literal Months of the usable life of the asset}
     * 
     */
    public static final String PROPERTY_USABLELIFEMONTHS = "usableLifeMonths";

    /**
     * Property lifeUse stored in column LifeUseUnits in table A_Asset<br>
     * Help: {@literal Life use and the actual use may be used to calculate the depreciation}
     * 
     */
    public static final String PROPERTY_LIFEUSE = "lifeUse";

    /**
     * Property useUnits stored in column UseUnits in table A_Asset<br>
     * Help: {@literal Currently used units of the assets}
     * 
     */
    public static final String PROPERTY_USEUNITS = "useUnits";

    /**
     * Property disposed stored in column IsDisposed in table A_Asset<br>
     * Help: {@literal The asset is no longer used and disposed}
     * 
     */
    public static final String PROPERTY_DISPOSED = "disposed";

    /**
     * Property assetDisposalDate stored in column AssetDisposalDate in table A_Asset<br>
     * Help: {@literal Date when the asset is/was disposed}
     * 
     */
    public static final String PROPERTY_ASSETDISPOSALDATE = "assetDisposalDate";

    /**
     * Property inPossession stored in column IsInPosession in table A_Asset<br>
     * Help: {@literal Assets which are not in possession are e.g. at Customer site and may or may not be owned
     *       by the company.}
     * 
     */
    public static final String PROPERTY_INPOSSESSION = "inPossession";

    /**
     * Property locationComment stored in column LocationComment in table A_Asset<br>
     * Help: {@literal Additional comments or remarks concerning the location}
     * 
     */
    public static final String PROPERTY_LOCATIONCOMMENT = "locationComment";

    /**
     * Property storageBin stored in column M_Locator_ID in table A_Asset<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table A_Asset<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table A_Asset<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property locationAddress stored in column C_Location_ID in table A_Asset<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_LOCATIONADDRESS = "locationAddress";

    /**
     * Property processNow stored in column Processing in table A_Asset<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property depreciate stored in column IsDepreciated in table A_Asset<br>
     * Help: {@literal The asset is used internally and will be depreciated}
     * 
     */
    public static final String PROPERTY_DEPRECIATE = "depreciate";

    /**
     * Property fullyDepreciated stored in column IsFullyDepreciated in table A_Asset<br>
     * Help: {@literal The asset costs are fully amortized.}
     * 
     */
    public static final String PROPERTY_FULLYDEPRECIATED = "fullyDepreciated";

    /**
     * Property userContact stored in column AD_User_ID in table A_Asset<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property depreciationEndDate stored in column Amortizationenddate in table A_Asset<br>
     * Help: {@literal Date in which this asset ends depreciating}
     * 
     */
    public static final String PROPERTY_DEPRECIATIONENDDATE = "depreciationEndDate";

    /**
     * Property depreciationStartDate stored in column Amortizationstartdate in table A_Asset<br>
     * Help: {@literal Date in which this asset starts depreciating}
     * 
     */
    public static final String PROPERTY_DEPRECIATIONSTARTDATE = "depreciationStartDate";

    /**
     * Property annualDepreciation stored in column Annualamortizationpercentage in table A_Asset<br>
     * Help: {@literal Anual percentage used to depreciate this asset.}
     * 
     */
    public static final String PROPERTY_ANNUALDEPRECIATION = "annualDepreciation";

    /**
     * Property assetValue stored in column AssetValueAmt in table A_Asset<br>
     * Help: {@literal Book Value of the asset}
     * 
     */
    public static final String PROPERTY_ASSETVALUE = "assetValue";

    /**
     * Property currency stored in column C_Currency_ID in table A_Asset<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property cancellationDate stored in column Datecancelled in table A_Asset<br>
     * Help: {@literal Cancellation date}
     * 
     */
    public static final String PROPERTY_CANCELLATIONDATE = "cancellationDate";

    /**
     * Property purchaseDate stored in column Datepurchased in table A_Asset<br>
     * Help: {@literal Date when this good was bougth.}
     * 
     */
    public static final String PROPERTY_PURCHASEDATE = "purchaseDate";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table A_Asset<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property residualAssetValue stored in column Residualassetvalueamt in table A_Asset<br>
     * Help: {@literal Value of the asset once it has been totally depreciated.}
     * 
     */
    public static final String PROPERTY_RESIDUALASSETVALUE = "residualAssetValue";

    /**
     * Property acctvalueamt stored in column Acctvalueamt in table A_Asset<br>
     * Help: {@literal Accounting value amount}
     * 
     */
    public static final String PROPERTY_ACCTVALUEAMT = "acctvalueamt";

    /**
     * Property depreciationType stored in column Amortizationtype in table A_Asset<br>
     * Help: {@literal Indicates the method used to depreciate this asset.}
     * 
     */
    public static final String PROPERTY_DEPRECIATIONTYPE = "depreciationType";

    /**
     * Property depreciationAmt stored in column Amortizationvalueamt in table A_Asset<br>
     * Help: {@literal Accumulate depreciation amount}
     * 
     */
    public static final String PROPERTY_DEPRECIATIONAMT = "depreciationAmt";

    /**
     * Property amortize stored in column Assetschedule in table A_Asset<br>
     * Help: {@literal Refers to the periods chosen between depreciation entries (monthly, yearly...).}
     * 
     */
    public static final String PROPERTY_AMORTIZE = "amortize";

    /**
     * Property documentNo stored in column DocumentNo in table A_Asset<br>
     * Help: {@literal The document number is usually automatically generated by the system and determined by the
     *       document type of the document. If the document is not saved, the preliminary number is displayed in
     *       "<>". If the document type of your document has no automatic document sequence defined, the field
     *       will be empty when creating a new document. This is for documents which usually have an external
     *       number (like vendor invoice).  If you leave the field empty, the system will generate a document
     *       number for you. The document sequence used for this fallback number is defined in the "Document
     *       Sequence" window with the name "DocumentNo_<TableName>", where TableName is the actual name of the
     *       table inside the database (e.g. C_Order).}
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property processed stored in column Processed in table A_Asset<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property profit stored in column Profit in table A_Asset
     * 
     */
    public static final String PROPERTY_PROFIT = "profit";

    /**
     * Property quantity stored in column Qty in table A_Asset<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property calculateType stored in column Amortizationcalctype in table A_Asset<br>
     * Help: {@literal This field indicates how depreciation will be calculated: choosing the time or the
     *       percentage.}
     * 
     */
    public static final String PROPERTY_CALCULATETYPE = "calculateType";

    /**
     * Property depreciatedPlan stored in column Depreciatedplan in table A_Asset<br>
     * Help: {@literal Value that is planned to be depreciated.}
     * 
     */
    public static final String PROPERTY_DEPRECIATEDPLAN = "depreciatedPlan";

    /**
     * Property previouslyDepreciatedAmt stored in column Depreciatedpreviousamt in table A_Asset
     * 
     */
    public static final String PROPERTY_PREVIOUSLYDEPRECIATEDAMT = "previouslyDepreciatedAmt";

    /**
     * Property depreciatedValue stored in column Depreciatedvalue in table A_Asset<br>
     * Help: {@literal Is the value depreciated from processed amortizations.}
     * 
     */
    public static final String PROPERTY_DEPRECIATEDVALUE = "depreciatedValue";

    /**
     * Property summaryLevel stored in column Issummary in table A_Asset<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property project stored in column C_Project_ID in table A_Asset<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property static stored in column IsStatic in table A_Asset<br>
     * Help: {@literal Prevents from moving the record into the tree}
     * 
     */
    public static final String PROPERTY_STATIC = "static";

    /**
     * Property everyMonthIs30Days stored in column Is30DayMonth in table A_Asset<br>
     * Help: {@literal When calculating the amortization plan every month will be considered as a 30 day month.}
     * 
     */
    public static final String PROPERTY_EVERYMONTHIS30DAYS = "everyMonthIs30Days";

    /**
     * Property processAsset stored in column Process_Asset in table A_Asset<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSASSET = "processAsset";

    /**
     * Property financialMgmtAccountingFactList stored in table A_Asset
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTACCOUNTINGFACTLIST = "financialMgmtAccountingFactList";

    /**
     * Property financialMgmtAmortizationLineList stored in table A_Asset
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTAMORTIZATIONLINELIST = "financialMgmtAmortizationLineList";

    /**
     * Property financialMgmtAssetAccountsList stored in table A_Asset
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTASSETACCOUNTSLIST = "financialMgmtAssetAccountsList";


    public Asset() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OWNED, false);
        setDefaultValue(PROPERTY_DISPOSED, false);
        setDefaultValue(PROPERTY_INPOSSESSION, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_DEPRECIATE, false);
        setDefaultValue(PROPERTY_FULLYDEPRECIATED, false);
        setDefaultValue(PROPERTY_PROCESSED, "N");
        setDefaultValue(PROPERTY_DEPRECIATEDPLAN, new BigDecimal(0));
        setDefaultValue(PROPERTY_PREVIOUSLYDEPRECIATEDAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_DEPRECIATEDVALUE, new BigDecimal(0));
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_STATIC, false);
        setDefaultValue(PROPERTY_EVERYMONTHIS30DAYS, true);
        setDefaultValue(PROPERTY_PROCESSASSET, "N");
        setDefaultValue(PROPERTY_FINANCIALMGMTACCOUNTINGFACTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTAMORTIZATIONLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTASSETACCOUNTSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Asset#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Asset#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Asset#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Asset#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Asset#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Asset#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Asset#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Asset#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Asset#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Asset#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Asset#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Asset#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Asset#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Asset#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Asset#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Asset#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Asset#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Asset#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Asset#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Asset#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Asset#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Asset#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Asset#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Asset#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Asset#PROPERTY_ASSETCATEGORY
     * 
     */
    public AssetGroup getAssetCategory() {
        return (AssetGroup) get(PROPERTY_ASSETCATEGORY);
    }
    /**
     * @see Asset#PROPERTY_ASSETCATEGORY
     * 
     */
    public void setAssetCategory(AssetGroup assetCategory) {
        set(PROPERTY_ASSETCATEGORY, assetCategory);
    }

    /**
     * @see Asset#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see Asset#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see Asset#PROPERTY_SERIALNO
     * 
     */
    public String getSerialNo() {
        return (String) get(PROPERTY_SERIALNO);
    }
    /**
     * @see Asset#PROPERTY_SERIALNO
     * 
     */
    public void setSerialNo(String serialNo) {
        set(PROPERTY_SERIALNO, serialNo);
    }

    /**
     * @see Asset#PROPERTY_LOTNAME
     * 
     */
    public String getLotName() {
        return (String) get(PROPERTY_LOTNAME);
    }
    /**
     * @see Asset#PROPERTY_LOTNAME
     * 
     */
    public void setLotName(String lotName) {
        set(PROPERTY_LOTNAME, lotName);
    }

    /**
     * @see Asset#PROPERTY_VERSIONNO
     * 
     */
    public String getVersionNo() {
        return (String) get(PROPERTY_VERSIONNO);
    }
    /**
     * @see Asset#PROPERTY_VERSIONNO
     * 
     */
    public void setVersionNo(String versionNo) {
        set(PROPERTY_VERSIONNO, versionNo);
    }

    /**
     * @see Asset#PROPERTY_EXPIRATIONDATE
     * 
     */
    public Date getExpirationDate() {
        return (Date) get(PROPERTY_EXPIRATIONDATE);
    }
    /**
     * @see Asset#PROPERTY_EXPIRATIONDATE
     * 
     */
    public void setExpirationDate(Date expirationDate) {
        set(PROPERTY_EXPIRATIONDATE, expirationDate);
    }

    /**
     * @see Asset#PROPERTY_INSERVICEDATE
     * 
     */
    public Date getInServiceDate() {
        return (Date) get(PROPERTY_INSERVICEDATE);
    }
    /**
     * @see Asset#PROPERTY_INSERVICEDATE
     * 
     */
    public void setInServiceDate(Date inServiceDate) {
        set(PROPERTY_INSERVICEDATE, inServiceDate);
    }

    /**
     * @see Asset#PROPERTY_OWNED
     * 
     */
    public Boolean isOwned() {
        return (Boolean) get(PROPERTY_OWNED);
    }
    /**
     * @see Asset#PROPERTY_OWNED
     * 
     */
    public void setOwned(Boolean owned) {
        set(PROPERTY_OWNED, owned);
    }

    /**
     * @see Asset#PROPERTY_ASSETDEPRECIATIONDATE
     * 
     */
    public Date getAssetDepreciationDate() {
        return (Date) get(PROPERTY_ASSETDEPRECIATIONDATE);
    }
    /**
     * @see Asset#PROPERTY_ASSETDEPRECIATIONDATE
     * 
     */
    public void setAssetDepreciationDate(Date assetDepreciationDate) {
        set(PROPERTY_ASSETDEPRECIATIONDATE, assetDepreciationDate);
    }

    /**
     * @see Asset#PROPERTY_USABLELIFEYEARS
     * 
     */
    public Long getUsableLifeYears() {
        return (Long) get(PROPERTY_USABLELIFEYEARS);
    }
    /**
     * @see Asset#PROPERTY_USABLELIFEYEARS
     * 
     */
    public void setUsableLifeYears(Long usableLifeYears) {
        set(PROPERTY_USABLELIFEYEARS, usableLifeYears);
    }

    /**
     * @see Asset#PROPERTY_USABLELIFEMONTHS
     * 
     */
    public Long getUsableLifeMonths() {
        return (Long) get(PROPERTY_USABLELIFEMONTHS);
    }
    /**
     * @see Asset#PROPERTY_USABLELIFEMONTHS
     * 
     */
    public void setUsableLifeMonths(Long usableLifeMonths) {
        set(PROPERTY_USABLELIFEMONTHS, usableLifeMonths);
    }

    /**
     * @see Asset#PROPERTY_LIFEUSE
     * 
     */
    public Long getLifeUse() {
        return (Long) get(PROPERTY_LIFEUSE);
    }
    /**
     * @see Asset#PROPERTY_LIFEUSE
     * 
     */
    public void setLifeUse(Long lifeUse) {
        set(PROPERTY_LIFEUSE, lifeUse);
    }

    /**
     * @see Asset#PROPERTY_USEUNITS
     * 
     */
    public Long getUseUnits() {
        return (Long) get(PROPERTY_USEUNITS);
    }
    /**
     * @see Asset#PROPERTY_USEUNITS
     * 
     */
    public void setUseUnits(Long useUnits) {
        set(PROPERTY_USEUNITS, useUnits);
    }

    /**
     * @see Asset#PROPERTY_DISPOSED
     * 
     */
    public Boolean isDisposed() {
        return (Boolean) get(PROPERTY_DISPOSED);
    }
    /**
     * @see Asset#PROPERTY_DISPOSED
     * 
     */
    public void setDisposed(Boolean disposed) {
        set(PROPERTY_DISPOSED, disposed);
    }

    /**
     * @see Asset#PROPERTY_ASSETDISPOSALDATE
     * 
     */
    public Date getAssetDisposalDate() {
        return (Date) get(PROPERTY_ASSETDISPOSALDATE);
    }
    /**
     * @see Asset#PROPERTY_ASSETDISPOSALDATE
     * 
     */
    public void setAssetDisposalDate(Date assetDisposalDate) {
        set(PROPERTY_ASSETDISPOSALDATE, assetDisposalDate);
    }

    /**
     * @see Asset#PROPERTY_INPOSSESSION
     * 
     */
    public Boolean isInPossession() {
        return (Boolean) get(PROPERTY_INPOSSESSION);
    }
    /**
     * @see Asset#PROPERTY_INPOSSESSION
     * 
     */
    public void setInPossession(Boolean inPossession) {
        set(PROPERTY_INPOSSESSION, inPossession);
    }

    /**
     * @see Asset#PROPERTY_LOCATIONCOMMENT
     * 
     */
    public String getLocationComment() {
        return (String) get(PROPERTY_LOCATIONCOMMENT);
    }
    /**
     * @see Asset#PROPERTY_LOCATIONCOMMENT
     * 
     */
    public void setLocationComment(String locationComment) {
        set(PROPERTY_LOCATIONCOMMENT, locationComment);
    }

    /**
     * @see Asset#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see Asset#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see Asset#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Asset#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Asset#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see Asset#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see Asset#PROPERTY_LOCATIONADDRESS
     * 
     */
    public org.openbravo.model.common.geography.Location getLocationAddress() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_LOCATIONADDRESS);
    }
    /**
     * @see Asset#PROPERTY_LOCATIONADDRESS
     * 
     */
    public void setLocationAddress(org.openbravo.model.common.geography.Location locationAddress) {
        set(PROPERTY_LOCATIONADDRESS, locationAddress);
    }

    /**
     * @see Asset#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Asset#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Asset#PROPERTY_DEPRECIATE
     * 
     */
    public Boolean isDepreciate() {
        return (Boolean) get(PROPERTY_DEPRECIATE);
    }
    /**
     * @see Asset#PROPERTY_DEPRECIATE
     * 
     */
    public void setDepreciate(Boolean depreciate) {
        set(PROPERTY_DEPRECIATE, depreciate);
    }

    /**
     * @see Asset#PROPERTY_FULLYDEPRECIATED
     * 
     */
    public Boolean isFullyDepreciated() {
        return (Boolean) get(PROPERTY_FULLYDEPRECIATED);
    }
    /**
     * @see Asset#PROPERTY_FULLYDEPRECIATED
     * 
     */
    public void setFullyDepreciated(Boolean fullyDepreciated) {
        set(PROPERTY_FULLYDEPRECIATED, fullyDepreciated);
    }

    /**
     * @see Asset#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see Asset#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see Asset#PROPERTY_DEPRECIATIONENDDATE
     * 
     */
    public Date getDepreciationEndDate() {
        return (Date) get(PROPERTY_DEPRECIATIONENDDATE);
    }
    /**
     * @see Asset#PROPERTY_DEPRECIATIONENDDATE
     * 
     */
    public void setDepreciationEndDate(Date depreciationEndDate) {
        set(PROPERTY_DEPRECIATIONENDDATE, depreciationEndDate);
    }

    /**
     * @see Asset#PROPERTY_DEPRECIATIONSTARTDATE
     * 
     */
    public Date getDepreciationStartDate() {
        return (Date) get(PROPERTY_DEPRECIATIONSTARTDATE);
    }
    /**
     * @see Asset#PROPERTY_DEPRECIATIONSTARTDATE
     * 
     */
    public void setDepreciationStartDate(Date depreciationStartDate) {
        set(PROPERTY_DEPRECIATIONSTARTDATE, depreciationStartDate);
    }

    /**
     * @see Asset#PROPERTY_ANNUALDEPRECIATION
     * 
     */
    public BigDecimal getAnnualDepreciation() {
        return (BigDecimal) get(PROPERTY_ANNUALDEPRECIATION);
    }
    /**
     * @see Asset#PROPERTY_ANNUALDEPRECIATION
     * 
     */
    public void setAnnualDepreciation(BigDecimal annualDepreciation) {
        set(PROPERTY_ANNUALDEPRECIATION, annualDepreciation);
    }

    /**
     * @see Asset#PROPERTY_ASSETVALUE
     * 
     */
    public BigDecimal getAssetValue() {
        return (BigDecimal) get(PROPERTY_ASSETVALUE);
    }
    /**
     * @see Asset#PROPERTY_ASSETVALUE
     * 
     */
    public void setAssetValue(BigDecimal assetValue) {
        set(PROPERTY_ASSETVALUE, assetValue);
    }

    /**
     * @see Asset#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Asset#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Asset#PROPERTY_CANCELLATIONDATE
     * 
     */
    public Date getCancellationDate() {
        return (Date) get(PROPERTY_CANCELLATIONDATE);
    }
    /**
     * @see Asset#PROPERTY_CANCELLATIONDATE
     * 
     */
    public void setCancellationDate(Date cancellationDate) {
        set(PROPERTY_CANCELLATIONDATE, cancellationDate);
    }

    /**
     * @see Asset#PROPERTY_PURCHASEDATE
     * 
     */
    public Date getPurchaseDate() {
        return (Date) get(PROPERTY_PURCHASEDATE);
    }
    /**
     * @see Asset#PROPERTY_PURCHASEDATE
     * 
     */
    public void setPurchaseDate(Date purchaseDate) {
        set(PROPERTY_PURCHASEDATE, purchaseDate);
    }

    /**
     * @see Asset#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see Asset#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see Asset#PROPERTY_RESIDUALASSETVALUE
     * 
     */
    public BigDecimal getResidualAssetValue() {
        return (BigDecimal) get(PROPERTY_RESIDUALASSETVALUE);
    }
    /**
     * @see Asset#PROPERTY_RESIDUALASSETVALUE
     * 
     */
    public void setResidualAssetValue(BigDecimal residualAssetValue) {
        set(PROPERTY_RESIDUALASSETVALUE, residualAssetValue);
    }

    /**
     * @see Asset#PROPERTY_ACCTVALUEAMT
     * 
     */
    public BigDecimal getAcctvalueamt() {
        return (BigDecimal) get(PROPERTY_ACCTVALUEAMT);
    }
    /**
     * @see Asset#PROPERTY_ACCTVALUEAMT
     * 
     */
    public void setAcctvalueamt(BigDecimal acctvalueamt) {
        set(PROPERTY_ACCTVALUEAMT, acctvalueamt);
    }

    /**
     * @see Asset#PROPERTY_DEPRECIATIONTYPE
     * 
     */
    public String getDepreciationType() {
        return (String) get(PROPERTY_DEPRECIATIONTYPE);
    }
    /**
     * @see Asset#PROPERTY_DEPRECIATIONTYPE
     * 
     */
    public void setDepreciationType(String depreciationType) {
        set(PROPERTY_DEPRECIATIONTYPE, depreciationType);
    }

    /**
     * @see Asset#PROPERTY_DEPRECIATIONAMT
     * 
     */
    public BigDecimal getDepreciationAmt() {
        return (BigDecimal) get(PROPERTY_DEPRECIATIONAMT);
    }
    /**
     * @see Asset#PROPERTY_DEPRECIATIONAMT
     * 
     */
    public void setDepreciationAmt(BigDecimal depreciationAmt) {
        set(PROPERTY_DEPRECIATIONAMT, depreciationAmt);
    }

    /**
     * @see Asset#PROPERTY_AMORTIZE
     * 
     */
    public String getAmortize() {
        return (String) get(PROPERTY_AMORTIZE);
    }
    /**
     * @see Asset#PROPERTY_AMORTIZE
     * 
     */
    public void setAmortize(String amortize) {
        set(PROPERTY_AMORTIZE, amortize);
    }

    /**
     * @see Asset#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see Asset#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see Asset#PROPERTY_PROCESSED
     * 
     */
    public String getProcessed() {
        return (String) get(PROPERTY_PROCESSED);
    }
    /**
     * @see Asset#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(String processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see Asset#PROPERTY_PROFIT
     * 
     */
    public BigDecimal getProfit() {
        return (BigDecimal) get(PROPERTY_PROFIT);
    }
    /**
     * @see Asset#PROPERTY_PROFIT
     * 
     */
    public void setProfit(BigDecimal profit) {
        set(PROPERTY_PROFIT, profit);
    }

    /**
     * @see Asset#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see Asset#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see Asset#PROPERTY_CALCULATETYPE
     * 
     */
    public String getCalculateType() {
        return (String) get(PROPERTY_CALCULATETYPE);
    }
    /**
     * @see Asset#PROPERTY_CALCULATETYPE
     * 
     */
    public void setCalculateType(String calculateType) {
        set(PROPERTY_CALCULATETYPE, calculateType);
    }

    /**
     * @see Asset#PROPERTY_DEPRECIATEDPLAN
     * 
     */
    public BigDecimal getDepreciatedPlan() {
        return (BigDecimal) get(PROPERTY_DEPRECIATEDPLAN);
    }
    /**
     * @see Asset#PROPERTY_DEPRECIATEDPLAN
     * 
     */
    public void setDepreciatedPlan(BigDecimal depreciatedPlan) {
        set(PROPERTY_DEPRECIATEDPLAN, depreciatedPlan);
    }

    /**
     * @see Asset#PROPERTY_PREVIOUSLYDEPRECIATEDAMT
     * 
     */
    public BigDecimal getPreviouslyDepreciatedAmt() {
        return (BigDecimal) get(PROPERTY_PREVIOUSLYDEPRECIATEDAMT);
    }
    /**
     * @see Asset#PROPERTY_PREVIOUSLYDEPRECIATEDAMT
     * 
     */
    public void setPreviouslyDepreciatedAmt(BigDecimal previouslyDepreciatedAmt) {
        set(PROPERTY_PREVIOUSLYDEPRECIATEDAMT, previouslyDepreciatedAmt);
    }

    /**
     * @see Asset#PROPERTY_DEPRECIATEDVALUE
     * 
     */
    public BigDecimal getDepreciatedValue() {
        return (BigDecimal) get(PROPERTY_DEPRECIATEDVALUE);
    }
    /**
     * @see Asset#PROPERTY_DEPRECIATEDVALUE
     * 
     */
    public void setDepreciatedValue(BigDecimal depreciatedValue) {
        set(PROPERTY_DEPRECIATEDVALUE, depreciatedValue);
    }

    /**
     * @see Asset#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see Asset#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see Asset#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see Asset#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see Asset#PROPERTY_STATIC
     * 
     */
    public Boolean isStatic() {
        return (Boolean) get(PROPERTY_STATIC);
    }
    /**
     * @see Asset#PROPERTY_STATIC
     * 
     */
    public void setStatic(Boolean statc) {
        set(PROPERTY_STATIC, statc);
    }

    /**
     * @see Asset#PROPERTY_EVERYMONTHIS30DAYS
     * 
     */
    public Boolean isEveryMonthIs30Days() {
        return (Boolean) get(PROPERTY_EVERYMONTHIS30DAYS);
    }
    /**
     * @see Asset#PROPERTY_EVERYMONTHIS30DAYS
     * 
     */
    public void setEveryMonthIs30Days(Boolean everyMonthIs30Days) {
        set(PROPERTY_EVERYMONTHIS30DAYS, everyMonthIs30Days);
    }

    /**
     * @see Asset#PROPERTY_PROCESSASSET
     * 
     */
    public String getProcessAsset() {
        return (String) get(PROPERTY_PROCESSASSET);
    }
    /**
     * @see Asset#PROPERTY_PROCESSASSET
     * 
     */
    public void setProcessAsset(String processAsset) {
        set(PROPERTY_PROCESSASSET, processAsset);
    }

    /**
     * Help: {@literal Records accounting entries of all accounting schemas.}<br>
     * @see AccountingFact
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AccountingFact> getFinancialMgmtAccountingFactList() {
      return (List<AccountingFact>) get(PROPERTY_FINANCIALMGMTACCOUNTINGFACTLIST);
    }

    /**
     * Help: {@literal Records accounting entries of all accounting schemas.}<br>
     * @see AccountingFact
     * 
     */
    public void setFinancialMgmtAccountingFactList(List<AccountingFact> financialMgmtAccountingFactList) {
        set(PROPERTY_FINANCIALMGMTACCOUNTINGFACTLIST, financialMgmtAccountingFactList);
    }

    /**
     * Help: {@literal Depreciation of an asset between two dates}<br>
     * @see AmortizationLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AmortizationLine> getFinancialMgmtAmortizationLineList() {
      return (List<AmortizationLine>) get(PROPERTY_FINANCIALMGMTAMORTIZATIONLINELIST);
    }

    /**
     * Help: {@literal Depreciation of an asset between two dates}<br>
     * @see AmortizationLine
     * 
     */
    public void setFinancialMgmtAmortizationLineList(List<AmortizationLine> financialMgmtAmortizationLineList) {
        set(PROPERTY_FINANCIALMGMTAMORTIZATIONLINELIST, financialMgmtAmortizationLineList);
    }

    /**
     * Help: {@literal Defines the default accounts for this asset.}<br>
     * @see AssetAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AssetAccounts> getFinancialMgmtAssetAccountsList() {
      return (List<AssetAccounts>) get(PROPERTY_FINANCIALMGMTASSETACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the default accounts for this asset.}<br>
     * @see AssetAccounts
     * 
     */
    public void setFinancialMgmtAssetAccountsList(List<AssetAccounts> financialMgmtAssetAccountsList) {
        set(PROPERTY_FINANCIALMGMTASSETACCOUNTSLIST, financialMgmtAssetAccountsList);
    }

}
