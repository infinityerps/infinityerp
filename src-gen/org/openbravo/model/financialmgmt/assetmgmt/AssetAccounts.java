
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.AccountingCombination;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
/**
 * Entity class for entity FinancialMgmtAssetAccounts (stored in table A_Asset_Acct).
 * <br>
 * Help: {@literal Defines the default accounts for this asset.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AssetAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "A_Asset_Acct";
    public static final String ENTITY_NAME = "FinancialMgmtAssetAccounts";

    /**
     * Property id stored in column A_Asset_Acct_ID in table A_Asset_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property asset stored in column A_Asset_ID in table A_Asset_Acct<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table A_Asset_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table A_Asset_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table A_Asset_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table A_Asset_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table A_Asset_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table A_Asset_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table A_Asset_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table A_Asset_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property depreciation stored in column A_Depreciation_Acct in table A_Asset_Acct<br>
     * Help: {@literal Depreciation account}
     * 
     */
    public static final String PROPERTY_DEPRECIATION = "depreciation";

    /**
     * Property accumulatedDepreciation stored in column A_Accumdepreciation_Acct in table A_Asset_Acct<br>
     * Help: {@literal Accumulated Depreciation Account}
     * 
     */
    public static final String PROPERTY_ACCUMULATEDDEPRECIATION = "accumulatedDepreciation";

    /**
     * Property disposalLoss stored in column A_Disposal_Loss in table A_Asset_Acct<br>
     * Help: {@literal Disposal Loss account}
     * 
     */
    public static final String PROPERTY_DISPOSALLOSS = "disposalLoss";

    /**
     * Property disposalGain stored in column A_Disposal_Gain in table A_Asset_Acct<br>
     * Help: {@literal Disposal Gain account}
     * 
     */
    public static final String PROPERTY_DISPOSALGAIN = "disposalGain";


    public AssetAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AssetAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AssetAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AssetAccounts#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see AssetAccounts#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see AssetAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AssetAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AssetAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AssetAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AssetAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AssetAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AssetAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AssetAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AssetAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AssetAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AssetAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AssetAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AssetAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AssetAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AssetAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AssetAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AssetAccounts#PROPERTY_DEPRECIATION
     * 
     */
    public AccountingCombination getDepreciation() {
        return (AccountingCombination) get(PROPERTY_DEPRECIATION);
    }
    /**
     * @see AssetAccounts#PROPERTY_DEPRECIATION
     * 
     */
    public void setDepreciation(AccountingCombination depreciation) {
        set(PROPERTY_DEPRECIATION, depreciation);
    }

    /**
     * @see AssetAccounts#PROPERTY_ACCUMULATEDDEPRECIATION
     * 
     */
    public AccountingCombination getAccumulatedDepreciation() {
        return (AccountingCombination) get(PROPERTY_ACCUMULATEDDEPRECIATION);
    }
    /**
     * @see AssetAccounts#PROPERTY_ACCUMULATEDDEPRECIATION
     * 
     */
    public void setAccumulatedDepreciation(AccountingCombination accumulatedDepreciation) {
        set(PROPERTY_ACCUMULATEDDEPRECIATION, accumulatedDepreciation);
    }

    /**
     * @see AssetAccounts#PROPERTY_DISPOSALLOSS
     * 
     */
    public AccountingCombination getDisposalLoss() {
        return (AccountingCombination) get(PROPERTY_DISPOSALLOSS);
    }
    /**
     * @see AssetAccounts#PROPERTY_DISPOSALLOSS
     * 
     */
    public void setDisposalLoss(AccountingCombination disposalLoss) {
        set(PROPERTY_DISPOSALLOSS, disposalLoss);
    }

    /**
     * @see AssetAccounts#PROPERTY_DISPOSALGAIN
     * 
     */
    public AccountingCombination getDisposalGain() {
        return (AccountingCombination) get(PROPERTY_DISPOSALGAIN);
    }
    /**
     * @see AssetAccounts#PROPERTY_DISPOSALGAIN
     * 
     */
    public void setDisposalGain(AccountingCombination disposalGain) {
        set(PROPERTY_DISPOSALGAIN, disposalGain);
    }

}
