
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

import java.util.Date;

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
 * Entity class for entity CostingRuleProductV (stored in table M_Costing_Rule_Product_V).
 * <br>
 * Help: {@literal List of costing rules that apply for each product.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostingRuleProductV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Costing_Rule_Product_V";
    public static final String ENTITY_NAME = "CostingRuleProductV";

    /**
     * Property id stored in column M_Costing_Rule_Product_V_ID in table M_Costing_Rule_Product_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Costing_Rule_Product_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Costing_Rule_Product_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Costing_Rule_Product_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Costing_Rule_Product_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Costing_Rule_Product_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Costing_Rule_Product_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Costing_Rule_Product_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property costingRule stored in column M_Costing_Rule_ID in table M_Costing_Rule_Product_V<br>
     * Help: {@literal Identifies a costing rule for cost calculation. The costing rule defines the algorithm to
     *       be used, the date is valid from and if warehouses are used as a cost dimension.}
     * 
     */
    public static final String PROPERTY_COSTINGRULE = "costingRule";

    /**
     * Property applyProduct stored in column Apply_Product_ID in table M_Costing_Rule_Product_V<br>
     * Help: {@literal Product the costing rule applies to}
     * 
     */
    public static final String PROPERTY_APPLYPRODUCT = "applyProduct";

    /**
     * Property costingAlgorithm stored in column M_Costing_Algorithm_ID in table M_Costing_Rule_Product_V<br>
     * Help: {@literal Identifies a Costing Algorithm. Core distribution includes Average and Standard costing
     *       methods. Additional methods can be added using Extension Modules.}
     * 
     */
    public static final String PROPERTY_COSTINGALGORITHM = "costingAlgorithm";

    /**
     * Property product stored in column M_Product_ID in table M_Costing_Rule_Product_V<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table M_Costing_Rule_Product_V<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property startingDate stored in column Datefrom in table M_Costing_Rule_Product_V<br>
     * Help: {@literal The Date From indicates the starting date of a range.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column Dateto in table M_Costing_Rule_Product_V<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property organizationDimension stored in column ORG_Dimension in table M_Costing_Rule_Product_V<br>
     * Help: {@literal If checked the costs have to be calculated by the legal entity of the transaction.}
     * 
     */
    public static final String PROPERTY_ORGANIZATIONDIMENSION = "organizationDimension";

    /**
     * Property warehouseDimension stored in column Warehouse_Dimension in table M_Costing_Rule_Product_V<br>
     * Help: {@literal If checked the cost is calculated by the warehouse of the transaction}
     * 
     */
    public static final String PROPERTY_WAREHOUSEDIMENSION = "warehouseDimension";

    /**
     * Property validated stored in column Isvalidated in table M_Costing_Rule_Product_V 
     * 
     */
    public static final String PROPERTY_VALIDATED = "validated";


    public CostingRuleProductV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ORGANIZATIONDIMENSION, false);
        setDefaultValue(PROPERTY_WAREHOUSEDIMENSION, false);
        setDefaultValue(PROPERTY_VALIDATED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostingRuleProductV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_COSTINGRULE
     * 
     */
    public CostingRule getCostingRule() {
        return (CostingRule) get(PROPERTY_COSTINGRULE);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_COSTINGRULE
     * 
     */
    public void setCostingRule(CostingRule costingRule) {
        set(PROPERTY_COSTINGRULE, costingRule);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_APPLYPRODUCT
     * 
     */
    public Product getApplyProduct() {
        return (Product) get(PROPERTY_APPLYPRODUCT);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_APPLYPRODUCT
     * 
     */
    public void setApplyProduct(Product applyProduct) {
        set(PROPERTY_APPLYPRODUCT, applyProduct);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_COSTINGALGORITHM
     * 
     */
    public CostingAlgorithm getCostingAlgorithm() {
        return (CostingAlgorithm) get(PROPERTY_COSTINGALGORITHM);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_COSTINGALGORITHM
     * 
     */
    public void setCostingAlgorithm(CostingAlgorithm costingAlgorithm) {
        set(PROPERTY_COSTINGALGORITHM, costingAlgorithm);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_ORGANIZATIONDIMENSION
     * 
     */
    public Boolean isOrganizationDimension() {
        return (Boolean) get(PROPERTY_ORGANIZATIONDIMENSION);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_ORGANIZATIONDIMENSION
     * 
     */
    public void setOrganizationDimension(Boolean organizationDimension) {
        set(PROPERTY_ORGANIZATIONDIMENSION, organizationDimension);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_WAREHOUSEDIMENSION
     * 
     */
    public Boolean isWarehouseDimension() {
        return (Boolean) get(PROPERTY_WAREHOUSEDIMENSION);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_WAREHOUSEDIMENSION
     * 
     */
    public void setWarehouseDimension(Boolean warehouseDimension) {
        set(PROPERTY_WAREHOUSEDIMENSION, warehouseDimension);
    }

    /**
     * @see CostingRuleProductV#PROPERTY_VALIDATED
     * 
     */
    public Boolean isValidated() {
        return (Boolean) get(PROPERTY_VALIDATED);
    }
    /**
     * @see CostingRuleProductV#PROPERTY_VALIDATED
     * 
     */
    public void setValidated(Boolean validated) {
        set(PROPERTY_VALIDATED, validated);
    }

}
