
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
package org.openbravo.model.materialmgmt.cost;

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
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;
/**
 * Entity class for entity CostingRule (stored in table M_Costing_Rule).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostingRule extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Costing_Rule";
    public static final String ENTITY_NAME = "CostingRule";

    /**
     * Property id stored in column M_Costing_Rule_ID in table M_Costing_Rule<br>
     * Help: {@literal Identifies a costing rule for cost calculation. The costing rule defines the algorithm to
     *       be used, the date is valid from and if warehouses are used as a cost dimension.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Costing_Rule 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Costing_Rule 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table M_Costing_Rule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Costing_Rule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Costing_Rule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Costing_Rule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table M_Costing_Rule 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property costingAlgorithm stored in column M_Costing_Algorithm_ID in table M_Costing_Rule<br>
     * Help: {@literal Identifies a Costing Algorithm. Core distribution includes Average and Standard costing
     *       methods. Additional methods can be added using Extension Modules.}
     * 
     */
    public static final String PROPERTY_COSTINGALGORITHM = "costingAlgorithm";

    /**
     * Property organizationDimension stored in column ORG_Dimension in table M_Costing_Rule<br>
     * Help: {@literal If checked the costs have to be calculated by the legal entity of the transaction.}
     * 
     */
    public static final String PROPERTY_ORGANIZATIONDIMENSION = "organizationDimension";

    /**
     * Property warehouseDimension stored in column Warehouse_Dimension in table M_Costing_Rule<br>
     * Help: {@literal If checked the cost is calculated by the warehouse of the transaction}
     * 
     */
    public static final String PROPERTY_WAREHOUSEDIMENSION = "warehouseDimension";

    /**
     * Property product stored in column M_Product_ID in table M_Costing_Rule<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property endingDate stored in column Dateto in table M_Costing_Rule<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table M_Costing_Rule<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property validated stored in column IsValidated in table M_Costing_Rule<br>
     * Help: {@literal Flag to determine that the record has been validated.}
     * 
     */
    public static final String PROPERTY_VALIDATED = "validated";

    /**
     * Property processRule stored in column Process_Rule in table M_Costing_Rule<br>
     * Help: {@literal Validate and initialize the Costing Rule. It automatically creates and process the Close
     *       and Opening Physical inventories to overwrite an existing Costing Rule. If the instance is using the
     *       legacy engine costs it is mandatory to run the Cost Migration Process in advance with System
     *       Administrator role.}
     * 
     */
    public static final String PROPERTY_PROCESSRULE = "processRule";

    /**
     * Property startingDate stored in column Datefrom in table M_Costing_Rule 
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property backdatedTransactionsFixed stored in column Backdatedtrxsfixed in table M_Costing_Rule<br>
     * Help: {@literal If checked Fix Backdated Transactions has been executed for the Costing Rule.}
     * 
     */
    public static final String PROPERTY_BACKDATEDTRANSACTIONSFIXED = "backdatedTransactionsFixed";

    /**
     * Property fixBackdatedTransactions stored in column Backdatedtrxsfixedprocess in table M_Costing_Rule<br>
     * Help: {@literal Process that recalculates costs of backdated transactions until the given date. 
     *       Run
     *       process from Costing Rules window.}
     * 
     */
    public static final String PROPERTY_FIXBACKDATEDTRANSACTIONS = "fixBackdatedTransactions";

    /**
     * Property fixbackdatedfrom stored in column Fixbackdatedfrom in table M_Costing_Rule<br>
     * Help: {@literal Starting date in the costing rule to fix backdated transactions}
     * 
     */
    public static final String PROPERTY_FIXBACKDATEDFROM = "fixbackdatedfrom";

    /**
     * Property costingRuleInitList stored in table M_Costing_Rule
     * 
     */
    public static final String PROPERTY_COSTINGRULEINITLIST = "costingRuleInitList";


    public CostingRule() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ORGANIZATIONDIMENSION, false);
        setDefaultValue(PROPERTY_WAREHOUSEDIMENSION, false);
        setDefaultValue(PROPERTY_VALIDATED, false);
        setDefaultValue(PROPERTY_PROCESSRULE, false);
        setDefaultValue(PROPERTY_BACKDATEDTRANSACTIONSFIXED, false);
        setDefaultValue(PROPERTY_FIXBACKDATEDTRANSACTIONS, false);
        setDefaultValue(PROPERTY_COSTINGRULEINITLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostingRule#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostingRule#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostingRule#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostingRule#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostingRule#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostingRule#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostingRule#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostingRule#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostingRule#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostingRule#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostingRule#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostingRule#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostingRule#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostingRule#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostingRule#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostingRule#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CostingRule#PROPERTY_COSTINGALGORITHM
     * 
     */
    public CostingAlgorithm getCostingAlgorithm() {
        return (CostingAlgorithm) get(PROPERTY_COSTINGALGORITHM);
    }
    /**
     * @see CostingRule#PROPERTY_COSTINGALGORITHM
     * 
     */
    public void setCostingAlgorithm(CostingAlgorithm costingAlgorithm) {
        set(PROPERTY_COSTINGALGORITHM, costingAlgorithm);
    }

    /**
     * @see CostingRule#PROPERTY_ORGANIZATIONDIMENSION
     * 
     */
    public Boolean isOrganizationDimension() {
        return (Boolean) get(PROPERTY_ORGANIZATIONDIMENSION);
    }
    /**
     * @see CostingRule#PROPERTY_ORGANIZATIONDIMENSION
     * 
     */
    public void setOrganizationDimension(Boolean organizationDimension) {
        set(PROPERTY_ORGANIZATIONDIMENSION, organizationDimension);
    }

    /**
     * @see CostingRule#PROPERTY_WAREHOUSEDIMENSION
     * 
     */
    public Boolean isWarehouseDimension() {
        return (Boolean) get(PROPERTY_WAREHOUSEDIMENSION);
    }
    /**
     * @see CostingRule#PROPERTY_WAREHOUSEDIMENSION
     * 
     */
    public void setWarehouseDimension(Boolean warehouseDimension) {
        set(PROPERTY_WAREHOUSEDIMENSION, warehouseDimension);
    }

    /**
     * @see CostingRule#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see CostingRule#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see CostingRule#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see CostingRule#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see CostingRule#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see CostingRule#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see CostingRule#PROPERTY_VALIDATED
     * 
     */
    public Boolean isValidated() {
        return (Boolean) get(PROPERTY_VALIDATED);
    }
    /**
     * @see CostingRule#PROPERTY_VALIDATED
     * 
     */
    public void setValidated(Boolean validated) {
        set(PROPERTY_VALIDATED, validated);
    }

    /**
     * @see CostingRule#PROPERTY_PROCESSRULE
     * 
     */
    public Boolean isProcessRule() {
        return (Boolean) get(PROPERTY_PROCESSRULE);
    }
    /**
     * @see CostingRule#PROPERTY_PROCESSRULE
     * 
     */
    public void setProcessRule(Boolean processRule) {
        set(PROPERTY_PROCESSRULE, processRule);
    }

    /**
     * @see CostingRule#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see CostingRule#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see CostingRule#PROPERTY_BACKDATEDTRANSACTIONSFIXED
     * 
     */
    public Boolean isBackdatedTransactionsFixed() {
        return (Boolean) get(PROPERTY_BACKDATEDTRANSACTIONSFIXED);
    }
    /**
     * @see CostingRule#PROPERTY_BACKDATEDTRANSACTIONSFIXED
     * 
     */
    public void setBackdatedTransactionsFixed(Boolean backdatedTransactionsFixed) {
        set(PROPERTY_BACKDATEDTRANSACTIONSFIXED, backdatedTransactionsFixed);
    }

    /**
     * @see CostingRule#PROPERTY_FIXBACKDATEDTRANSACTIONS
     * 
     */
    public Boolean isFixBackdatedTransactions() {
        return (Boolean) get(PROPERTY_FIXBACKDATEDTRANSACTIONS);
    }
    /**
     * @see CostingRule#PROPERTY_FIXBACKDATEDTRANSACTIONS
     * 
     */
    public void setFixBackdatedTransactions(Boolean fixBackdatedTransactions) {
        set(PROPERTY_FIXBACKDATEDTRANSACTIONS, fixBackdatedTransactions);
    }

    /**
     * @see CostingRule#PROPERTY_FIXBACKDATEDFROM
     * 
     */
    public Date getFixbackdatedfrom() {
        return (Date) get(PROPERTY_FIXBACKDATEDFROM);
    }
    /**
     * @see CostingRule#PROPERTY_FIXBACKDATEDFROM
     * 
     */
    public void setFixbackdatedfrom(Date fixbackdatedfrom) {
        set(PROPERTY_FIXBACKDATEDFROM, fixbackdatedfrom);
    }

    /**
     * @see CostingRuleInit
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CostingRuleInit> getCostingRuleInitList() {
      return (List<CostingRuleInit>) get(PROPERTY_COSTINGRULEINITLIST);
    }

    /**
     * @see CostingRuleInit
     * 
     */
    public void setCostingRuleInitList(List<CostingRuleInit> costingRuleInitList) {
        set(PROPERTY_COSTINGRULEINITLIST, costingRuleInitList);
    }

}
