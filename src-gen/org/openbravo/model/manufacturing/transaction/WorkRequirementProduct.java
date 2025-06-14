
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
package org.openbravo.model.manufacturing.transaction;

import java.math.BigDecimal;
import java.util.Date;

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
import org.openbravo.model.manufacturing.processplan.OperationProduct;
/**
 * Entity class for entity ManufacturingWorkRequirementProduct (stored in table MA_WRPhaseProduct).
 * <br>
 * Help: {@literal In this tab there are defined all the products involved in the work requirement phase.
     *       There must be defined both the raw materials and the generated products.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WorkRequirementProduct extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_WRPhaseProduct";
    public static final String ENTITY_NAME = "ManufacturingWorkRequirementProduct";

    /**
     * Property id stored in column MA_Wrphaseproduct_ID in table MA_WRPhaseProduct<br>
     * Help: {@literal Indicates each product involved in the work requirement phase.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_WRPhaseProduct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_WRPhaseProduct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_WRPhaseProduct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_WRPhaseProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_WRPhaseProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_WRPhaseProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_WRPhaseProduct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table MA_WRPhaseProduct 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property wRPhase stored in column MA_Wrphase_ID in table MA_WRPhaseProduct<br>
     * Help: {@literal Indicates a Work Requirement Phase.}
     * 
     */
    public static final String PROPERTY_WRPHASE = "wRPhase";

    /**
     * Property product stored in column M_Product_ID in table MA_WRPhaseProduct<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property movementQuantity stored in column MovementQty in table MA_WRPhaseProduct<br>
     * Help: {@literal The Movement Quantity indicates the quantity of a product that has been moved.}
     * 
     */
    public static final String PROPERTY_MOVEMENTQUANTITY = "movementQuantity";

    /**
     * Property productionType stored in column Productiontype in table MA_WRPhaseProduct 
     * 
     */
    public static final String PROPERTY_PRODUCTIONTYPE = "productionType";

    /**
     * Property uOM stored in column C_UOM_ID in table MA_WRPhaseProduct<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property orderQuantity stored in column QuantityOrder in table MA_WRPhaseProduct<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table MA_WRPhaseProduct<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property componentCost stored in column Componentcost in table MA_WRPhaseProduct<br>
     * Help: {@literal Cost per component}
     * 
     */
    public static final String PROPERTY_COMPONENTCOST = "componentCost";

    /**
     * Property sequenceProduct stored in column MA_Sequenceproduct_ID in table MA_WRPhaseProduct<br>
     * Help: {@literal Indicates each product involved on a sequence.}
     * 
     */
    public static final String PROPERTY_SEQUENCEPRODUCT = "sequenceProduct";

    /**
     * Property warehouseRule stored in column M_Warehouse_Rule_ID in table MA_WRPhaseProduct<br>
     * Help: {@literal Definition of a Warehouse Rule to be applied when getting stock from the warehouse.}
     * 
     */
    public static final String PROPERTY_WAREHOUSERULE = "warehouseRule";


    public WorkRequirementProduct() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COMPONENTCOST, new BigDecimal(1));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_WRPHASE
     * 
     */
    public WorkRequirementOperation getWRPhase() {
        return (WorkRequirementOperation) get(PROPERTY_WRPHASE);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_WRPHASE
     * 
     */
    public void setWRPhase(WorkRequirementOperation wRPhase) {
        set(PROPERTY_WRPHASE, wRPhase);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public BigDecimal getMovementQuantity() {
        return (BigDecimal) get(PROPERTY_MOVEMENTQUANTITY);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public void setMovementQuantity(BigDecimal movementQuantity) {
        set(PROPERTY_MOVEMENTQUANTITY, movementQuantity);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_PRODUCTIONTYPE
     * 
     */
    public String getProductionType() {
        return (String) get(PROPERTY_PRODUCTIONTYPE);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_PRODUCTIONTYPE
     * 
     */
    public void setProductionType(String productionType) {
        set(PROPERTY_PRODUCTIONTYPE, productionType);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_COMPONENTCOST
     * 
     */
    public BigDecimal getComponentCost() {
        return (BigDecimal) get(PROPERTY_COMPONENTCOST);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_COMPONENTCOST
     * 
     */
    public void setComponentCost(BigDecimal componentCost) {
        set(PROPERTY_COMPONENTCOST, componentCost);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_SEQUENCEPRODUCT
     * 
     */
    public OperationProduct getSequenceProduct() {
        return (OperationProduct) get(PROPERTY_SEQUENCEPRODUCT);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_SEQUENCEPRODUCT
     * 
     */
    public void setSequenceProduct(OperationProduct sequenceProduct) {
        set(PROPERTY_SEQUENCEPRODUCT, sequenceProduct);
    }

    /**
     * @see WorkRequirementProduct#PROPERTY_WAREHOUSERULE
     * 
     */
    public WarehouseRule getWarehouseRule() {
        return (WarehouseRule) get(PROPERTY_WAREHOUSERULE);
    }
    /**
     * @see WorkRequirementProduct#PROPERTY_WAREHOUSERULE
     * 
     */
    public void setWarehouseRule(WarehouseRule warehouseRule) {
        set(PROPERTY_WAREHOUSERULE, warehouseRule);
    }

}
