
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
package org.openbravo.model.financialmgmt.gl;

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
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.tax.TaxCategory;
import org.openbravo.model.financialmgmt.tax.TaxRate;
import org.openbravo.model.financialmgmt.tax.Withholding;
import org.openbravo.model.materialmgmt.cost.LandedCostType;
/**
 * Entity class for entity FinancialMgmtGLItem (stored in table C_Glitem).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GLItem extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Glitem";
    public static final String ENTITY_NAME = "FinancialMgmtGLItem";

    /**
     * Property id stored in column C_Glitem_ID in table C_Glitem<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Glitem 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Glitem 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Glitem 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Glitem 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Glitem 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Glitem 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Glitem 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Glitem 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Glitem<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property enableInCash stored in column Enableincash in table C_Glitem<br>
     * Help: {@literal If this flag active, this element will be suitable to be included in a cash journal line.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_ENABLEINCASH = "enableInCash";

    /**
     * Property enableInFinancialInvoices stored in column Enableinfininvoices in table C_Glitem<br>
     * Help: {@literal This new flag must be set to "Yes" which means that only those G/L items marked as "Enable
     *       in Financial Invoices" will be shown to be selected by the end-user while booking a Financial
     *       Invoice in the Invoice Line window.}
     * 
     */
    public static final String PROPERTY_ENABLEINFINANCIALINVOICES = "enableInFinancialInvoices";

    /**
     * Property taxCategory stored in column C_Taxcategory_ID in table C_Glitem<br>
     * Help: {@literal The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or
     *       Value Added Tax.}
     * 
     */
    public static final String PROPERTY_TAXCATEGORY = "taxCategory";

    /**
     * Property tax stored in column C_Tax_ID in table C_Glitem<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property withholding stored in column C_Withholding_ID in table C_Glitem<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property fINFinancialAccountEMAprmGlitemDiffList stored in table C_Glitem
     * 
     */
    public static final String PROPERTY_FINFINANCIALACCOUNTEMAPRMGLITEMDIFFLIST = "fINFinancialAccountEMAprmGlitemDiffList";

    /**
     * Property financialMgmtGLItemAccountsList stored in table C_Glitem
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTGLITEMACCOUNTSLIST = "financialMgmtGLItemAccountsList";

    /**
     * Property landedCostTypeAccountList stored in table C_Glitem
     * 
     */
    public static final String PROPERTY_LANDEDCOSTTYPEACCOUNTLIST = "landedCostTypeAccountList";


    public GLItem() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ENABLEINCASH, false);
        setDefaultValue(PROPERTY_ENABLEINFINANCIALINVOICES, false);
        setDefaultValue(PROPERTY_FINFINANCIALACCOUNTEMAPRMGLITEMDIFFLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTGLITEMACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_LANDEDCOSTTYPEACCOUNTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GLItem#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GLItem#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GLItem#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GLItem#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GLItem#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GLItem#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GLItem#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GLItem#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GLItem#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GLItem#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GLItem#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GLItem#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GLItem#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GLItem#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GLItem#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GLItem#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GLItem#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see GLItem#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see GLItem#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see GLItem#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see GLItem#PROPERTY_ENABLEINCASH
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isEnableInCash() {
        return (Boolean) get(PROPERTY_ENABLEINCASH);
    }
    /**
     * @see GLItem#PROPERTY_ENABLEINCASH
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setEnableInCash(Boolean enableInCash) {
        set(PROPERTY_ENABLEINCASH, enableInCash);
    }

    /**
     * @see GLItem#PROPERTY_ENABLEINFINANCIALINVOICES
     * 
     */
    public Boolean isEnableInFinancialInvoices() {
        return (Boolean) get(PROPERTY_ENABLEINFINANCIALINVOICES);
    }
    /**
     * @see GLItem#PROPERTY_ENABLEINFINANCIALINVOICES
     * 
     */
    public void setEnableInFinancialInvoices(Boolean enableInFinancialInvoices) {
        set(PROPERTY_ENABLEINFINANCIALINVOICES, enableInFinancialInvoices);
    }

    /**
     * @see GLItem#PROPERTY_TAXCATEGORY
     * 
     */
    public TaxCategory getTaxCategory() {
        return (TaxCategory) get(PROPERTY_TAXCATEGORY);
    }
    /**
     * @see GLItem#PROPERTY_TAXCATEGORY
     * 
     */
    public void setTaxCategory(TaxCategory taxCategory) {
        set(PROPERTY_TAXCATEGORY, taxCategory);
    }

    /**
     * @see GLItem#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see GLItem#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see GLItem#PROPERTY_WITHHOLDING
     * 
     */
    public Withholding getWithholding() {
        return (Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see GLItem#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
    }

    /**
     * @see FIN_FinancialAccount
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_FinancialAccount> getFINFinancialAccountEMAprmGlitemDiffList() {
      return (List<FIN_FinancialAccount>) get(PROPERTY_FINFINANCIALACCOUNTEMAPRMGLITEMDIFFLIST);
    }

    /**
     * @see FIN_FinancialAccount
     * 
     */
    public void setFINFinancialAccountEMAprmGlitemDiffList(List<FIN_FinancialAccount> fINFinancialAccountEMAprmGlitemDiffList) {
        set(PROPERTY_FINFINANCIALACCOUNTEMAPRMGLITEMDIFFLIST, fINFinancialAccountEMAprmGlitemDiffList);
    }

    /**
     * Help: {@literal Defines the default accounts for this general ledger item.}<br>
     * @see GLItemAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<GLItemAccounts> getFinancialMgmtGLItemAccountsList() {
      return (List<GLItemAccounts>) get(PROPERTY_FINANCIALMGMTGLITEMACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the default accounts for this general ledger item.}<br>
     * @see GLItemAccounts
     * 
     */
    public void setFinancialMgmtGLItemAccountsList(List<GLItemAccounts> financialMgmtGLItemAccountsList) {
        set(PROPERTY_FINANCIALMGMTGLITEMACCOUNTSLIST, financialMgmtGLItemAccountsList);
    }

    /**
     * @see LandedCostType
     * 
     */
    @SuppressWarnings("unchecked")
    public List<LandedCostType> getLandedCostTypeAccountList() {
      return (List<LandedCostType>) get(PROPERTY_LANDEDCOSTTYPEACCOUNTLIST);
    }

    /**
     * @see LandedCostType
     * 
     */
    public void setLandedCostTypeAccountList(List<LandedCostType> landedCostTypeAccountList) {
        set(PROPERTY_LANDEDCOSTTYPEACCOUNTLIST, landedCostTypeAccountList);
    }

}
