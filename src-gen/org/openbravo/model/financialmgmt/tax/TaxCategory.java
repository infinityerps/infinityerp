
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
package org.openbravo.model.financialmgmt.tax;

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
 * Entity class for entity FinancialMgmtTaxCategory (stored in table C_TaxCategory).
 * <br>
 * Help: {@literal The Tax Category is used to define and maintain Tax Categories.  Each Product is
     *       associated with a Tax Category.  This facilitates adapting to changes in taxation.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TaxCategory extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_TaxCategory";
    public static final String ENTITY_NAME = "FinancialMgmtTaxCategory";

    /**
     * Property id stored in column C_TaxCategory_ID in table C_TaxCategory<br>
     * Help: {@literal The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or
     *       Value Added Tax.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_TaxCategory 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_TaxCategory 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_TaxCategory 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_TaxCategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_TaxCategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_TaxCategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_TaxCategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_TaxCategory 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_TaxCategory<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property default stored in column IsDefault in table C_TaxCategory<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property asbom stored in column Asbom in table C_TaxCategory<br>
     * Help: {@literal Virtual Tax Category that indicates that taxes are defined by the Bill of Materials
     *       products}
     * 
     */
    public static final String PROPERTY_ASBOM = "asbom";

    /**
     * Property financialMgmtTaxCategoryTrlList stored in table C_TaxCategory
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXCATEGORYTRLLIST = "financialMgmtTaxCategoryTrlList";

    /**
     * Property financialMgmtTaxRateList stored in table C_TaxCategory
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXRATELIST = "financialMgmtTaxRateList";


    public TaxCategory() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_ASBOM, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXCATEGORYTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXRATELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TaxCategory#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TaxCategory#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TaxCategory#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TaxCategory#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TaxCategory#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TaxCategory#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TaxCategory#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TaxCategory#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TaxCategory#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TaxCategory#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TaxCategory#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TaxCategory#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TaxCategory#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TaxCategory#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TaxCategory#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TaxCategory#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TaxCategory#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see TaxCategory#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see TaxCategory#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see TaxCategory#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see TaxCategory#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see TaxCategory#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see TaxCategory#PROPERTY_ASBOM
     * 
     */
    public Boolean isAsbom() {
        return (Boolean) get(PROPERTY_ASBOM);
    }
    /**
     * @see TaxCategory#PROPERTY_ASBOM
     * 
     */
    public void setAsbom(Boolean asbom) {
        set(PROPERTY_ASBOM, asbom);
    }

    /**
     * Help: {@literal Translation for Tax Categories}<br>
     * @see TaxCategoryTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxCategoryTrl> getFinancialMgmtTaxCategoryTrlList() {
      return (List<TaxCategoryTrl>) get(PROPERTY_FINANCIALMGMTTAXCATEGORYTRLLIST);
    }

    /**
     * Help: {@literal Translation for Tax Categories}<br>
     * @see TaxCategoryTrl
     * 
     */
    public void setFinancialMgmtTaxCategoryTrlList(List<TaxCategoryTrl> financialMgmtTaxCategoryTrlList) {
        set(PROPERTY_FINANCIALMGMTTAXCATEGORYTRLLIST, financialMgmtTaxCategoryTrlList);
    }

    /**
     * Help: {@literal The Tax Rate Window defines the different taxes used for each tax category.}<br>
     * @see TaxRate
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxRate> getFinancialMgmtTaxRateList() {
      return (List<TaxRate>) get(PROPERTY_FINANCIALMGMTTAXRATELIST);
    }

    /**
     * Help: {@literal The Tax Rate Window defines the different taxes used for each tax category.}<br>
     * @see TaxRate
     * 
     */
    public void setFinancialMgmtTaxRateList(List<TaxRate> financialMgmtTaxRateList) {
        set(PROPERTY_FINANCIALMGMTTAXRATELIST, financialMgmtTaxRateList);
    }

}
