
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
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtAssetGroup (stored in table A_Asset_Group).
 * <br>
 * Help: {@literal The group of assets determines default accounts.  If a asset group is selected in the
     *       product category, assets are created when delivering the asset.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AssetGroup extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "A_Asset_Group";
    public static final String ENTITY_NAME = "FinancialMgmtAssetGroup";

    /**
     * Property id stored in column A_Asset_Group_ID in table A_Asset_Group<br>
     * Help: {@literal The group of assets determines default accounts.  If an asset group is selected in the
     *       product category, assets are created when delivering the asset.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table A_Asset_Group 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table A_Asset_Group 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table A_Asset_Group 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table A_Asset_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table A_Asset_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table A_Asset_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table A_Asset_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table A_Asset_Group 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table A_Asset_Group<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table A_Asset_Group<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property owned stored in column Isowned in table A_Asset_Group<br>
     * Help: {@literal The asset may not be in possession, but the asset is legally owned by the organization}
     * 
     */
    public static final String PROPERTY_OWNED = "owned";

    /**
     * Property depreciate stored in column IsDepreciated in table A_Asset_Group<br>
     * Help: {@literal The asset is used internally and will be depreciated}
     * 
     */
    public static final String PROPERTY_DEPRECIATE = "depreciate";

    /**
     * Property depreciationType stored in column Amortizationtype in table A_Asset_Group<br>
     * Help: {@literal Indicates the method used to depreciate this asset.}
     * 
     */
    public static final String PROPERTY_DEPRECIATIONTYPE = "depreciationType";

    /**
     * Property calculateType stored in column Amortizationcalctype in table A_Asset_Group<br>
     * Help: {@literal This field indicates how depreciation will be calculated: choosing the time or the
     *       percentage.}
     * 
     */
    public static final String PROPERTY_CALCULATETYPE = "calculateType";

    /**
     * Property annualDepreciation stored in column Annualamortizationpercentage in table A_Asset_Group<br>
     * Help: {@literal Anual percentage used to depreciate this asset.}
     * 
     */
    public static final String PROPERTY_ANNUALDEPRECIATION = "annualDepreciation";

    /**
     * Property amortize stored in column Assetschedule in table A_Asset_Group<br>
     * Help: {@literal Refers to the periods chosen between depreciation entries (monthly, yearly...).}
     * 
     */
    public static final String PROPERTY_AMORTIZE = "amortize";

    /**
     * Property usableLifeYears stored in column UseLifeYears in table A_Asset_Group<br>
     * Help: {@literal Years of the usable life of the asset}
     * 
     */
    public static final String PROPERTY_USABLELIFEYEARS = "usableLifeYears";

    /**
     * Property usableLifeMonths stored in column UseLifeMonths in table A_Asset_Group<br>
     * Help: {@literal Months of the usable life of the asset}
     * 
     */
    public static final String PROPERTY_USABLELIFEMONTHS = "usableLifeMonths";

    /**
     * Property everyMonthIs30Days stored in column Is30DayMonth in table A_Asset_Group<br>
     * Help: {@literal When calculating the amortization plan every month will be considered as a 30 day month.}
     * 
     */
    public static final String PROPERTY_EVERYMONTHIS30DAYS = "everyMonthIs30Days";

    /**
     * Property financialMgmtAssetGroupAcctList stored in table A_Asset_Group
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTASSETGROUPACCTLIST = "financialMgmtAssetGroupAcctList";


    public AssetGroup() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OWNED, true);
        setDefaultValue(PROPERTY_DEPRECIATE, false);
        setDefaultValue(PROPERTY_EVERYMONTHIS30DAYS, true);
        setDefaultValue(PROPERTY_FINANCIALMGMTASSETGROUPACCTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AssetGroup#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AssetGroup#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AssetGroup#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AssetGroup#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AssetGroup#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AssetGroup#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AssetGroup#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AssetGroup#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AssetGroup#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AssetGroup#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AssetGroup#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AssetGroup#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AssetGroup#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AssetGroup#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AssetGroup#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AssetGroup#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AssetGroup#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AssetGroup#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AssetGroup#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AssetGroup#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AssetGroup#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see AssetGroup#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see AssetGroup#PROPERTY_OWNED
     * 
     */
    public Boolean isOwned() {
        return (Boolean) get(PROPERTY_OWNED);
    }
    /**
     * @see AssetGroup#PROPERTY_OWNED
     * 
     */
    public void setOwned(Boolean owned) {
        set(PROPERTY_OWNED, owned);
    }

    /**
     * @see AssetGroup#PROPERTY_DEPRECIATE
     * 
     */
    public Boolean isDepreciate() {
        return (Boolean) get(PROPERTY_DEPRECIATE);
    }
    /**
     * @see AssetGroup#PROPERTY_DEPRECIATE
     * 
     */
    public void setDepreciate(Boolean depreciate) {
        set(PROPERTY_DEPRECIATE, depreciate);
    }

    /**
     * @see AssetGroup#PROPERTY_DEPRECIATIONTYPE
     * 
     */
    public String getDepreciationType() {
        return (String) get(PROPERTY_DEPRECIATIONTYPE);
    }
    /**
     * @see AssetGroup#PROPERTY_DEPRECIATIONTYPE
     * 
     */
    public void setDepreciationType(String depreciationType) {
        set(PROPERTY_DEPRECIATIONTYPE, depreciationType);
    }

    /**
     * @see AssetGroup#PROPERTY_CALCULATETYPE
     * 
     */
    public String getCalculateType() {
        return (String) get(PROPERTY_CALCULATETYPE);
    }
    /**
     * @see AssetGroup#PROPERTY_CALCULATETYPE
     * 
     */
    public void setCalculateType(String calculateType) {
        set(PROPERTY_CALCULATETYPE, calculateType);
    }

    /**
     * @see AssetGroup#PROPERTY_ANNUALDEPRECIATION
     * 
     */
    public BigDecimal getAnnualDepreciation() {
        return (BigDecimal) get(PROPERTY_ANNUALDEPRECIATION);
    }
    /**
     * @see AssetGroup#PROPERTY_ANNUALDEPRECIATION
     * 
     */
    public void setAnnualDepreciation(BigDecimal annualDepreciation) {
        set(PROPERTY_ANNUALDEPRECIATION, annualDepreciation);
    }

    /**
     * @see AssetGroup#PROPERTY_AMORTIZE
     * 
     */
    public String getAmortize() {
        return (String) get(PROPERTY_AMORTIZE);
    }
    /**
     * @see AssetGroup#PROPERTY_AMORTIZE
     * 
     */
    public void setAmortize(String amortize) {
        set(PROPERTY_AMORTIZE, amortize);
    }

    /**
     * @see AssetGroup#PROPERTY_USABLELIFEYEARS
     * 
     */
    public Long getUsableLifeYears() {
        return (Long) get(PROPERTY_USABLELIFEYEARS);
    }
    /**
     * @see AssetGroup#PROPERTY_USABLELIFEYEARS
     * 
     */
    public void setUsableLifeYears(Long usableLifeYears) {
        set(PROPERTY_USABLELIFEYEARS, usableLifeYears);
    }

    /**
     * @see AssetGroup#PROPERTY_USABLELIFEMONTHS
     * 
     */
    public Long getUsableLifeMonths() {
        return (Long) get(PROPERTY_USABLELIFEMONTHS);
    }
    /**
     * @see AssetGroup#PROPERTY_USABLELIFEMONTHS
     * 
     */
    public void setUsableLifeMonths(Long usableLifeMonths) {
        set(PROPERTY_USABLELIFEMONTHS, usableLifeMonths);
    }

    /**
     * @see AssetGroup#PROPERTY_EVERYMONTHIS30DAYS
     * 
     */
    public Boolean isEveryMonthIs30Days() {
        return (Boolean) get(PROPERTY_EVERYMONTHIS30DAYS);
    }
    /**
     * @see AssetGroup#PROPERTY_EVERYMONTHIS30DAYS
     * 
     */
    public void setEveryMonthIs30Days(Boolean everyMonthIs30Days) {
        set(PROPERTY_EVERYMONTHIS30DAYS, everyMonthIs30Days);
    }

    /**
     * Help: {@literal Defines the default accounts for any asset that references this group.}<br>
     * @see AssetGroupAcct
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AssetGroupAcct> getFinancialMgmtAssetGroupAcctList() {
      return (List<AssetGroupAcct>) get(PROPERTY_FINANCIALMGMTASSETGROUPACCTLIST);
    }

    /**
     * Help: {@literal Defines the default accounts for any asset that references this group.}<br>
     * @see AssetGroupAcct
     * 
     */
    public void setFinancialMgmtAssetGroupAcctList(List<AssetGroupAcct> financialMgmtAssetGroupAcctList) {
        set(PROPERTY_FINANCIALMGMTASSETGROUPACCTLIST, financialMgmtAssetGroupAcctList);
    }

}
