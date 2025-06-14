
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
package org.openbravo.model.materialmgmt.transaction;

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
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.manufacturing.transaction.WorkRequirementProduct;
/**
 * Entity class for entity ManufacturingProductionLine (stored in table M_ProductionLine).
 * <br>
 * Help: {@literal Contains all the products that have been used or created in the production run and the
     *       related quantities}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductionLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_ProductionLine";
    public static final String ENTITY_NAME = "ManufacturingProductionLine";

    /**
     * Property id stored in column M_ProductionLine_ID in table M_ProductionLine<br>
     * Help: {@literal The Production Line indicates the production document line (if applicable) for this
     *       transaction}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_ProductionLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_ProductionLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_ProductionLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_ProductionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property productionPlan stored in column M_ProductionPlan_ID in table M_ProductionLine<br>
     * Help: {@literal The Production Plan identifies the items and steps in generating a product.}
     * 
     */
    public static final String PROPERTY_PRODUCTIONPLAN = "productionPlan";

    /**
     * Property lineNo stored in column Line in table M_ProductionLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property product stored in column M_Product_ID in table M_ProductionLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property movementQuantity stored in column MovementQty in table M_ProductionLine 
     * 
     */
    public static final String PROPERTY_MOVEMENTQUANTITY = "movementQuantity";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_ProductionLine<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property description stored in column Description in table M_ProductionLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_ProductionLine<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_ProductionLine<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property orderQuantity stored in column QuantityOrder in table M_ProductionLine<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property uOM stored in column C_UOM_ID in table M_ProductionLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property calculated stored in column Calculated in table M_ProductionLine<br>
     * Help: {@literal Indicates that the record has been calculated.}
     * 
     */
    public static final String PROPERTY_CALCULATED = "calculated";

    /**
     * Property productionType stored in column Productiontype in table M_ProductionLine<br>
     * Help: {@literal Indicates if the product is used in the sequence or is generated. A positive production
     *       means that is an output product. So&nbsp;a negative productions refers to an input product.}
     * 
     */
    public static final String PROPERTY_PRODUCTIONTYPE = "productionType";

    /**
     * Property rejectedQuantity stored in column Rejectedquantity in table M_ProductionLine<br>
     * Help: {@literal How many products have been rejected.}
     * 
     */
    public static final String PROPERTY_REJECTEDQUANTITY = "rejectedQuantity";

    /**
     * Property estimatedCost stored in column Calccost in table M_ProductionLine<br>
     * Help: {@literal Is the calculated cost amount.}
     * 
     */
    public static final String PROPERTY_ESTIMATEDCOST = "estimatedCost";

    /**
     * Property componentCost stored in column Componentcost in table M_ProductionLine<br>
     * Help: {@literal Cost per component}
     * 
     */
    public static final String PROPERTY_COMPONENTCOST = "componentCost";

    /**
     * Property wRProductPhase stored in column MA_Wrphaseproduct_ID in table M_ProductionLine<br>
     * Help: {@literal Indicates each product involved in the work requirement phase.}
     * 
     */
    public static final String PROPERTY_WRPRODUCTPHASE = "wRProductPhase";

    /**
     * Property divisionGroupQuantity stored in column Divisiongroupqty in table M_ProductionLine<br>
     * Help: {@literal Indicates the quantity in which P+ products will be grouped}
     * 
     */
    public static final String PROPERTY_DIVISIONGROUPQUANTITY = "divisionGroupQuantity";

    /**
     * Property materialMgmtMaterialTransactionList stored in table M_ProductionLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST = "materialMgmtMaterialTransactionList";


    public ProductionLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CALCULATED, false);
        setDefaultValue(PROPERTY_REJECTEDQUANTITY, new BigDecimal(0));
        setDefaultValue(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductionLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductionLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductionLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductionLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductionLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductionLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductionLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductionLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductionLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductionLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductionLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductionLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductionLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductionLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductionLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductionLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductionLine#PROPERTY_PRODUCTIONPLAN
     * 
     */
    public ProductionPlan getProductionPlan() {
        return (ProductionPlan) get(PROPERTY_PRODUCTIONPLAN);
    }
    /**
     * @see ProductionLine#PROPERTY_PRODUCTIONPLAN
     * 
     */
    public void setProductionPlan(ProductionPlan productionPlan) {
        set(PROPERTY_PRODUCTIONPLAN, productionPlan);
    }

    /**
     * @see ProductionLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see ProductionLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see ProductionLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductionLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductionLine#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public BigDecimal getMovementQuantity() {
        return (BigDecimal) get(PROPERTY_MOVEMENTQUANTITY);
    }
    /**
     * @see ProductionLine#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public void setMovementQuantity(BigDecimal movementQuantity) {
        set(PROPERTY_MOVEMENTQUANTITY, movementQuantity);
    }

    /**
     * @see ProductionLine#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ProductionLine#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ProductionLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProductionLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProductionLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see ProductionLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see ProductionLine#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see ProductionLine#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see ProductionLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see ProductionLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see ProductionLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see ProductionLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see ProductionLine#PROPERTY_CALCULATED
     * 
     */
    public Boolean isCalculated() {
        return (Boolean) get(PROPERTY_CALCULATED);
    }
    /**
     * @see ProductionLine#PROPERTY_CALCULATED
     * 
     */
    public void setCalculated(Boolean calculated) {
        set(PROPERTY_CALCULATED, calculated);
    }

    /**
     * @see ProductionLine#PROPERTY_PRODUCTIONTYPE
     * 
     */
    public String getProductionType() {
        return (String) get(PROPERTY_PRODUCTIONTYPE);
    }
    /**
     * @see ProductionLine#PROPERTY_PRODUCTIONTYPE
     * 
     */
    public void setProductionType(String productionType) {
        set(PROPERTY_PRODUCTIONTYPE, productionType);
    }

    /**
     * @see ProductionLine#PROPERTY_REJECTEDQUANTITY
     * 
     */
    public BigDecimal getRejectedQuantity() {
        return (BigDecimal) get(PROPERTY_REJECTEDQUANTITY);
    }
    /**
     * @see ProductionLine#PROPERTY_REJECTEDQUANTITY
     * 
     */
    public void setRejectedQuantity(BigDecimal rejectedQuantity) {
        set(PROPERTY_REJECTEDQUANTITY, rejectedQuantity);
    }

    /**
     * @see ProductionLine#PROPERTY_ESTIMATEDCOST
     * 
     */
    public BigDecimal getEstimatedCost() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDCOST);
    }
    /**
     * @see ProductionLine#PROPERTY_ESTIMATEDCOST
     * 
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        set(PROPERTY_ESTIMATEDCOST, estimatedCost);
    }

    /**
     * @see ProductionLine#PROPERTY_COMPONENTCOST
     * 
     */
    public BigDecimal getComponentCost() {
        return (BigDecimal) get(PROPERTY_COMPONENTCOST);
    }
    /**
     * @see ProductionLine#PROPERTY_COMPONENTCOST
     * 
     */
    public void setComponentCost(BigDecimal componentCost) {
        set(PROPERTY_COMPONENTCOST, componentCost);
    }

    /**
     * @see ProductionLine#PROPERTY_WRPRODUCTPHASE
     * 
     */
    public WorkRequirementProduct getWRProductPhase() {
        return (WorkRequirementProduct) get(PROPERTY_WRPRODUCTPHASE);
    }
    /**
     * @see ProductionLine#PROPERTY_WRPRODUCTPHASE
     * 
     */
    public void setWRProductPhase(WorkRequirementProduct wRProductPhase) {
        set(PROPERTY_WRPRODUCTPHASE, wRProductPhase);
    }

    /**
     * @see ProductionLine#PROPERTY_DIVISIONGROUPQUANTITY
     * 
     */
    public Long getDivisionGroupQuantity() {
        return (Long) get(PROPERTY_DIVISIONGROUPQUANTITY);
    }
    /**
     * @see ProductionLine#PROPERTY_DIVISIONGROUPQUANTITY
     * 
     */
    public void setDivisionGroupQuantity(Long divisionGroupQuantity) {
        set(PROPERTY_DIVISIONGROUPQUANTITY, divisionGroupQuantity);
    }

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MaterialTransaction> getMaterialMgmtMaterialTransactionList() {
      return (List<MaterialTransaction>) get(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST);
    }

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    public void setMaterialMgmtMaterialTransactionList(List<MaterialTransaction> materialMgmtMaterialTransactionList) {
        set(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, materialMgmtMaterialTransactionList);
    }

}
