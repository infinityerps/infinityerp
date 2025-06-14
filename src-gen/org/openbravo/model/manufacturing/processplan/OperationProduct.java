
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
package org.openbravo.model.manufacturing.processplan;

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
import org.openbravo.model.common.enterprise.WarehouseRule;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
/**
 * Entity class for entity ManufacturingOperationProduct (stored in table MA_SequenceProduct).
 * <br>
 * Help: {@literal In this table there are defined all the products involved in the sequence. There must be
     *       defined both the raw materials and the generated products.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OperationProduct extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_SequenceProduct";
    public static final String ENTITY_NAME = "ManufacturingOperationProduct";

    /**
     * Property id stored in column MA_Sequenceproduct_ID in table MA_SequenceProduct<br>
     * Help: {@literal Indicates each product involved on a sequence.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_SequenceProduct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_SequenceProduct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_SequenceProduct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_SequenceProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_SequenceProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_SequenceProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_SequenceProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property mASequence stored in column MA_Sequence_ID in table MA_SequenceProduct<br>
     * Help: {@literal The sequence relates the operations with the process plan.}
     * 
     */
    public static final String PROPERTY_MASEQUENCE = "mASequence";

    /**
     * Property product stored in column M_Product_ID in table MA_SequenceProduct<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property quantity stored in column Quantity in table MA_SequenceProduct<br>
     * Help: {@literal Indicates the quantity of product needed to process one time the sequence.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property productionType stored in column Productiontype in table MA_SequenceProduct<br>
     * Help: {@literal Indicates if the product is used in the sequence or is generated. A positive production
     *       means that is an output product. So&nbsp;a negative productions refers to an input product.}
     * 
     */
    public static final String PROPERTY_PRODUCTIONTYPE = "productionType";

    /**
     * Property uOM stored in column C_UOM_ID in table MA_SequenceProduct<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property orderQuantity stored in column QuantityOrder in table MA_SequenceProduct<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table MA_SequenceProduct<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property componentCost stored in column Componentcost in table MA_SequenceProduct<br>
     * Help: {@literal Cost per component}
     * 
     */
    public static final String PROPERTY_COMPONENTCOST = "componentCost";

    /**
     * Property decrease stored in column Decrease in table MA_SequenceProduct<br>
     * Help: {@literal Percentage of decrease.}
     * 
     */
    public static final String PROPERTY_DECREASE = "decrease";

    /**
     * Property rejected stored in column Rejected in table MA_SequenceProduct<br>
     * Help: {@literal Percentage of parts rejected}
     * 
     */
    public static final String PROPERTY_REJECTED = "rejected";

    /**
     * Property cost stored in column Cost in table MA_SequenceProduct<br>
     * Help: {@literal Cost amount.}
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property uniqueattconsum stored in column Uniqueattconsum in table MA_SequenceProduct<br>
     * Help: {@literal Indicates if the product must be consumed from an unique attribute set}
     * 
     */
    public static final String PROPERTY_UNIQUEATTCONSUM = "uniqueattconsum";

    /**
     * Property copyproduct stored in column Copyproduct in table MA_SequenceProduct<br>
     * Help: {@literal Create a product copied from the P - and insert a new line in the sequence using this new
     *       product created}
     * 
     */
    public static final String PROPERTY_COPYPRODUCT = "copyproduct";

    /**
     * Property divisionGroupQuantity stored in column Divisiongroupqty in table MA_SequenceProduct<br>
     * Help: {@literal Indicates the quantity in which P+ products will be grouped}
     * 
     */
    public static final String PROPERTY_DIVISIONGROUPQUANTITY = "divisionGroupQuantity";

    /**
     * Property lineNo stored in column Line in table MA_SequenceProduct<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property warehouseRule stored in column M_Warehouse_Rule_ID in table MA_SequenceProduct<br>
     * Help: {@literal Definition of a Warehouse Rule to be applied when getting stock from the warehouse.}
     * 
     */
    public static final String PROPERTY_WAREHOUSERULE = "warehouseRule";

    /**
     * Property manufacturingOperationProductAttributeList stored in table MA_SequenceProduct
     * 
     */
    public static final String PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST = "manufacturingOperationProductAttributeList";


    public OperationProduct() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COMPONENTCOST, new BigDecimal(1));
        setDefaultValue(PROPERTY_DECREASE, new BigDecimal(1));
        setDefaultValue(PROPERTY_REJECTED, new BigDecimal(1));
        setDefaultValue(PROPERTY_UNIQUEATTCONSUM, false);
        setDefaultValue(PROPERTY_COPYPRODUCT, false);
        setDefaultValue(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OperationProduct#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OperationProduct#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OperationProduct#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OperationProduct#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OperationProduct#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OperationProduct#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OperationProduct#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OperationProduct#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OperationProduct#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OperationProduct#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OperationProduct#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OperationProduct#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OperationProduct#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OperationProduct#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OperationProduct#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OperationProduct#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OperationProduct#PROPERTY_MASEQUENCE
     * 
     */
    public Operation getMASequence() {
        return (Operation) get(PROPERTY_MASEQUENCE);
    }
    /**
     * @see OperationProduct#PROPERTY_MASEQUENCE
     * 
     */
    public void setMASequence(Operation mASequence) {
        set(PROPERTY_MASEQUENCE, mASequence);
    }

    /**
     * @see OperationProduct#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see OperationProduct#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see OperationProduct#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see OperationProduct#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see OperationProduct#PROPERTY_PRODUCTIONTYPE
     * 
     */
    public String getProductionType() {
        return (String) get(PROPERTY_PRODUCTIONTYPE);
    }
    /**
     * @see OperationProduct#PROPERTY_PRODUCTIONTYPE
     * 
     */
    public void setProductionType(String productionType) {
        set(PROPERTY_PRODUCTIONTYPE, productionType);
    }

    /**
     * @see OperationProduct#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see OperationProduct#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see OperationProduct#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see OperationProduct#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see OperationProduct#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see OperationProduct#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see OperationProduct#PROPERTY_COMPONENTCOST
     * 
     */
    public BigDecimal getComponentCost() {
        return (BigDecimal) get(PROPERTY_COMPONENTCOST);
    }
    /**
     * @see OperationProduct#PROPERTY_COMPONENTCOST
     * 
     */
    public void setComponentCost(BigDecimal componentCost) {
        set(PROPERTY_COMPONENTCOST, componentCost);
    }

    /**
     * @see OperationProduct#PROPERTY_DECREASE
     * 
     */
    public BigDecimal getDecrease() {
        return (BigDecimal) get(PROPERTY_DECREASE);
    }
    /**
     * @see OperationProduct#PROPERTY_DECREASE
     * 
     */
    public void setDecrease(BigDecimal decrease) {
        set(PROPERTY_DECREASE, decrease);
    }

    /**
     * @see OperationProduct#PROPERTY_REJECTED
     * 
     */
    public BigDecimal getRejected() {
        return (BigDecimal) get(PROPERTY_REJECTED);
    }
    /**
     * @see OperationProduct#PROPERTY_REJECTED
     * 
     */
    public void setRejected(BigDecimal rejected) {
        set(PROPERTY_REJECTED, rejected);
    }

    /**
     * @see OperationProduct#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see OperationProduct#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see OperationProduct#PROPERTY_UNIQUEATTCONSUM
     * 
     */
    public Boolean isUniqueattconsum() {
        return (Boolean) get(PROPERTY_UNIQUEATTCONSUM);
    }
    /**
     * @see OperationProduct#PROPERTY_UNIQUEATTCONSUM
     * 
     */
    public void setUniqueattconsum(Boolean uniqueattconsum) {
        set(PROPERTY_UNIQUEATTCONSUM, uniqueattconsum);
    }

    /**
     * @see OperationProduct#PROPERTY_COPYPRODUCT
     * 
     */
    public Boolean isCopyproduct() {
        return (Boolean) get(PROPERTY_COPYPRODUCT);
    }
    /**
     * @see OperationProduct#PROPERTY_COPYPRODUCT
     * 
     */
    public void setCopyproduct(Boolean copyproduct) {
        set(PROPERTY_COPYPRODUCT, copyproduct);
    }

    /**
     * @see OperationProduct#PROPERTY_DIVISIONGROUPQUANTITY
     * 
     */
    public Long getDivisionGroupQuantity() {
        return (Long) get(PROPERTY_DIVISIONGROUPQUANTITY);
    }
    /**
     * @see OperationProduct#PROPERTY_DIVISIONGROUPQUANTITY
     * 
     */
    public void setDivisionGroupQuantity(Long divisionGroupQuantity) {
        set(PROPERTY_DIVISIONGROUPQUANTITY, divisionGroupQuantity);
    }

    /**
     * @see OperationProduct#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see OperationProduct#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see OperationProduct#PROPERTY_WAREHOUSERULE
     * 
     */
    public WarehouseRule getWarehouseRule() {
        return (WarehouseRule) get(PROPERTY_WAREHOUSERULE);
    }
    /**
     * @see OperationProduct#PROPERTY_WAREHOUSERULE
     * 
     */
    public void setWarehouseRule(WarehouseRule warehouseRule) {
        set(PROPERTY_WAREHOUSERULE, warehouseRule);
    }

    /**
     * Help: {@literal In this table there are defined how attributes are copied from P- to P+ during the
     *       execution of the process plan.}<br>
     * @see OperationProductAttribute
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OperationProductAttribute> getManufacturingOperationProductAttributeList() {
      return (List<OperationProductAttribute>) get(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST);
    }

    /**
     * Help: {@literal In this table there are defined how attributes are copied from P- to P+ during the
     *       execution of the process plan.}<br>
     * @see OperationProductAttribute
     * 
     */
    public void setManufacturingOperationProductAttributeList(List<OperationProductAttribute> manufacturingOperationProductAttributeList) {
        set(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST, manufacturingOperationProductAttributeList);
    }

}
