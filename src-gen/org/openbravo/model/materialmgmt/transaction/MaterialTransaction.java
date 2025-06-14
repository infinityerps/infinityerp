
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.materialmgmt.cost.CostAdjustmentLine;
import org.openbravo.model.materialmgmt.cost.Costing;
import org.openbravo.model.materialmgmt.cost.CostingAlgorithm;
import org.openbravo.model.materialmgmt.cost.TransactionCost;
import org.openbravo.model.project.ProjectIssue;
/**
 * Entity class for entity MaterialMgmtMaterialTransaction (stored in table M_Transaction).
 * <br>
 * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MaterialTransaction extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Transaction";
    public static final String ENTITY_NAME = "MaterialMgmtMaterialTransaction";

    /**
     * Property id stored in column M_Transaction_ID in table M_Transaction<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Transaction 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Transaction 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Transaction 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property movementType stored in column MovementType in table M_Transaction 
     * 
     */
    public static final String PROPERTY_MOVEMENTTYPE = "movementType";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_Transaction<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property product stored in column M_Product_ID in table M_Transaction<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property movementDate stored in column MovementDate in table M_Transaction 
     * 
     */
    public static final String PROPERTY_MOVEMENTDATE = "movementDate";

    /**
     * Property movementQuantity stored in column MovementQty in table M_Transaction 
     * 
     */
    public static final String PROPERTY_MOVEMENTQUANTITY = "movementQuantity";

    /**
     * Property physicalInventoryLine stored in column M_InventoryLine_ID in table M_Transaction<br>
     * Help: {@literal The Physical Inventory Line indicates the inventory document line (if applicable) for this
     *       transaction}
     * 
     */
    public static final String PROPERTY_PHYSICALINVENTORYLINE = "physicalInventoryLine";

    /**
     * Property movementLine stored in column M_MovementLine_ID in table M_Transaction<br>
     * Help: {@literal The Movement Line indicates the inventory movement document line (if applicable) for this
     *       transaction}
     * 
     */
    public static final String PROPERTY_MOVEMENTLINE = "movementLine";

    /**
     * Property goodsShipmentLine stored in column M_InOutLine_ID in table M_Transaction<br>
     * Help: {@literal The Goods Shipment Line indicates a unique line in a Shipment document}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENTLINE = "goodsShipmentLine";

    /**
     * Property productionLine stored in column M_ProductionLine_ID in table M_Transaction<br>
     * Help: {@literal The Production Line indicates the production document line (if applicable) for this
     *       transaction}
     * 
     */
    public static final String PROPERTY_PRODUCTIONLINE = "productionLine";

    /**
     * Property projectIssue stored in column C_ProjectIssue_ID in table M_Transaction<br>
     * Help: {@literal Issues to the project initiated by the "Issue to Project" process. You can issue Receipts,
     *       Time and Expenses, or Stock.}
     * 
     */
    public static final String PROPERTY_PROJECTISSUE = "projectIssue";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_Transaction<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_Transaction<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property orderQuantity stored in column QuantityOrder in table M_Transaction<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property uOM stored in column C_UOM_ID in table M_Transaction<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property internalConsumptionLine stored in column M_Internal_Consumptionline_ID in table M_Transaction<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_INTERNALCONSUMPTIONLINE = "internalConsumptionLine";

    /**
     * Property transactionCost stored in column TransactionCost in table M_Transaction<br>
     * Help: {@literal Total amount of the transaction based on product cost.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONCOST = "transactionCost";

    /**
     * Property transactionProcessDate stored in column TrxProcessDate in table M_Transaction<br>
     * Help: {@literal Indicates the date and time when the transaction was processed.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONPROCESSDATE = "transactionProcessDate";

    /**
     * Property costingAlgorithm stored in column M_Costing_Algorithm_ID in table M_Transaction<br>
     * Help: {@literal Identifies a Costing Algorithm. Core distribution includes Average and Standard costing
     *       methods. Additional methods can be added using Extension Modules.}
     * 
     */
    public static final String PROPERTY_COSTINGALGORITHM = "costingAlgorithm";

    /**
     * Property isCostCalculated stored in column IsCostCalculated in table M_Transaction<br>
     * Help: {@literal Determines that the cost amount has been calculated}
     * 
     */
    public static final String PROPERTY_ISCOSTCALCULATED = "isCostCalculated";

    /**
     * Property currency stored in column C_Currency_ID in table M_Transaction<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property costingStatus stored in column Costing_Status in table M_Transaction<br>
     * Help: {@literal Costing Calculation Status}
     * 
     */
    public static final String PROPERTY_COSTINGSTATUS = "costingStatus";

    /**
     * Property checkReservedQuantity stored in column Checkreservedqty in table M_Transaction<br>
     * Help: {@literal This field is use to check reserved stock quantity during Initial costing Rule
     *       validation.}
     * 
     */
    public static final String PROPERTY_CHECKRESERVEDQUANTITY = "checkReservedQuantity";

    /**
     * Property isProcessed stored in column Isprocessed in table M_Transaction
     * 
     */
    public static final String PROPERTY_ISPROCESSED = "isProcessed";

    /**
     * Property checkpricedifference stored in column Checkpricedifference in table M_Transaction<br>
     * Help: {@literal This flag will be enabled when the transaction has price differences}
     * 
     */
    public static final String PROPERTY_CHECKPRICEDIFFERENCE = "checkpricedifference";

    /**
     * Property manualcostadjustment stored in column Manualcostadjustment in table M_Transaction<br>
     * Help: {@literal Process to manually set a new cost to this transaction.}
     * 
     */
    public static final String PROPERTY_MANUALCOSTADJUSTMENT = "manualcostadjustment";

    /**
     * Property isCostPermanent stored in column IsCostPermanent in table M_Transaction<br>
     * Help: {@literal Determines whether the cost is permanently adjusted or not.  }
     * 
     */
    public static final String PROPERTY_ISCOSTPERMANENT = "isCostPermanent";



    /**
     * Property _computedColumns stored in column _computedColumns in table M_Transaction
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property costAdjustmentLineList stored in table M_Transaction
     * 
     */
    public static final String PROPERTY_COSTADJUSTMENTLINELIST = "costAdjustmentLineList";

    /**
     * Property materialMgmtCostingList stored in table M_Transaction
     * 
     */
    public static final String PROPERTY_MATERIALMGMTCOSTINGLIST = "materialMgmtCostingList";

    /**
     * Property transactionCostList stored in table M_Transaction
     * 
     */
    public static final String PROPERTY_TRANSACTIONCOSTLIST = "transactionCostList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property totalCost<br>
     * 
     * Help: {@literal Represents the total Cost of the Transaction including all the Cost Adjustments}<br>
     * Computed from: <br>
     * {@code SELECT sum(tc.cost) FROM m_transaction_cost tc WHERE tc.m_transaction_id = m_transaction_id}
     */
    public static final String COMPUTED_COLUMN_TOTALCOST = "totalCost";

    /**
     * Computed column for property unitCost<br>
     * <br>
     * Computed from: <br>
     * {@code SELECT sum(tc.cost) FROM m_transaction_cost tc WHERE tc.m_transaction_id = m_transaction_id and
       tc.isunitcost = 'Y'}
     */
    public static final String COMPUTED_COLUMN_UNITCOST = "unitCost";

    public MaterialTransaction() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TRANSACTIONPROCESSDATE, new Date());
        setDefaultValue(PROPERTY_ISCOSTCALCULATED, false);
        setDefaultValue(PROPERTY_COSTINGSTATUS, "NC");
        setDefaultValue(PROPERTY_CHECKRESERVEDQUANTITY, true);
        setDefaultValue(PROPERTY_ISPROCESSED, false);
        setDefaultValue(PROPERTY_CHECKPRICEDIFFERENCE, false);
        setDefaultValue(PROPERTY_MANUALCOSTADJUSTMENT, false);
        setDefaultValue(PROPERTY_ISCOSTPERMANENT, false);
        setDefaultValue(PROPERTY_COSTADJUSTMENTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTCOSTINGLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_TRANSACTIONCOSTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MaterialTransaction#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MaterialTransaction#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MaterialTransaction#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MaterialTransaction#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MaterialTransaction#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MaterialTransaction#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MaterialTransaction#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MaterialTransaction#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MaterialTransaction#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MaterialTransaction#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTTYPE
     * 
     */
    public String getMovementType() {
        return (String) get(PROPERTY_MOVEMENTTYPE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTTYPE
     * 
     */
    public void setMovementType(String movementType) {
        set(PROPERTY_MOVEMENTTYPE, movementType);
    }

    /**
     * @see MaterialTransaction#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see MaterialTransaction#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see MaterialTransaction#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see MaterialTransaction#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTDATE
     * 
     */
    public Date getMovementDate() {
        return (Date) get(PROPERTY_MOVEMENTDATE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTDATE
     * 
     */
    public void setMovementDate(Date movementDate) {
        set(PROPERTY_MOVEMENTDATE, movementDate);
    }

    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public BigDecimal getMovementQuantity() {
        return (BigDecimal) get(PROPERTY_MOVEMENTQUANTITY);
    }
    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public void setMovementQuantity(BigDecimal movementQuantity) {
        set(PROPERTY_MOVEMENTQUANTITY, movementQuantity);
    }

    /**
     * @see MaterialTransaction#PROPERTY_PHYSICALINVENTORYLINE
     * 
     */
    public InventoryCountLine getPhysicalInventoryLine() {
        return (InventoryCountLine) get(PROPERTY_PHYSICALINVENTORYLINE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_PHYSICALINVENTORYLINE
     * 
     */
    public void setPhysicalInventoryLine(InventoryCountLine physicalInventoryLine) {
        set(PROPERTY_PHYSICALINVENTORYLINE, physicalInventoryLine);
    }

    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTLINE
     * 
     */
    public InternalMovementLine getMovementLine() {
        return (InternalMovementLine) get(PROPERTY_MOVEMENTLINE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_MOVEMENTLINE
     * 
     */
    public void setMovementLine(InternalMovementLine movementLine) {
        set(PROPERTY_MOVEMENTLINE, movementLine);
    }

    /**
     * @see MaterialTransaction#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public ShipmentInOutLine getGoodsShipmentLine() {
        return (ShipmentInOutLine) get(PROPERTY_GOODSSHIPMENTLINE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public void setGoodsShipmentLine(ShipmentInOutLine goodsShipmentLine) {
        set(PROPERTY_GOODSSHIPMENTLINE, goodsShipmentLine);
    }

    /**
     * @see MaterialTransaction#PROPERTY_PRODUCTIONLINE
     * 
     */
    public ProductionLine getProductionLine() {
        return (ProductionLine) get(PROPERTY_PRODUCTIONLINE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_PRODUCTIONLINE
     * 
     */
    public void setProductionLine(ProductionLine productionLine) {
        set(PROPERTY_PRODUCTIONLINE, productionLine);
    }

    /**
     * @see MaterialTransaction#PROPERTY_PROJECTISSUE
     * 
     */
    public ProjectIssue getProjectIssue() {
        return (ProjectIssue) get(PROPERTY_PROJECTISSUE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_PROJECTISSUE
     * 
     */
    public void setProjectIssue(ProjectIssue projectIssue) {
        set(PROPERTY_PROJECTISSUE, projectIssue);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see MaterialTransaction#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see MaterialTransaction#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see MaterialTransaction#PROPERTY_INTERNALCONSUMPTIONLINE
     * 
     */
    public InternalConsumptionLine getInternalConsumptionLine() {
        return (InternalConsumptionLine) get(PROPERTY_INTERNALCONSUMPTIONLINE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_INTERNALCONSUMPTIONLINE
     * 
     */
    public void setInternalConsumptionLine(InternalConsumptionLine internalConsumptionLine) {
        set(PROPERTY_INTERNALCONSUMPTIONLINE, internalConsumptionLine);
    }

    /**
     * @see MaterialTransaction#PROPERTY_TRANSACTIONCOST
     * 
     */
    public BigDecimal getTransactionCost() {
        return (BigDecimal) get(PROPERTY_TRANSACTIONCOST);
    }
    /**
     * @see MaterialTransaction#PROPERTY_TRANSACTIONCOST
     * 
     */
    public void setTransactionCost(BigDecimal transactionCost) {
        set(PROPERTY_TRANSACTIONCOST, transactionCost);
    }

    /**
     * @see MaterialTransaction#PROPERTY_TRANSACTIONPROCESSDATE
     * 
     */
    public Date getTransactionProcessDate() {
        return (Date) get(PROPERTY_TRANSACTIONPROCESSDATE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_TRANSACTIONPROCESSDATE
     * 
     */
    public void setTransactionProcessDate(Date transactionProcessDate) {
        set(PROPERTY_TRANSACTIONPROCESSDATE, transactionProcessDate);
    }

    /**
     * @see MaterialTransaction#PROPERTY_COSTINGALGORITHM
     * 
     */
    public CostingAlgorithm getCostingAlgorithm() {
        return (CostingAlgorithm) get(PROPERTY_COSTINGALGORITHM);
    }
    /**
     * @see MaterialTransaction#PROPERTY_COSTINGALGORITHM
     * 
     */
    public void setCostingAlgorithm(CostingAlgorithm costingAlgorithm) {
        set(PROPERTY_COSTINGALGORITHM, costingAlgorithm);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ISCOSTCALCULATED
     * 
     */
    public Boolean isCostCalculated() {
        return (Boolean) get(PROPERTY_ISCOSTCALCULATED);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ISCOSTCALCULATED
     * 
     */
    public void setCostCalculated(Boolean isCostCalculated) {
        set(PROPERTY_ISCOSTCALCULATED, isCostCalculated);
    }

    /**
     * @see MaterialTransaction#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see MaterialTransaction#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see MaterialTransaction#PROPERTY_COSTINGSTATUS
     * 
     */
    public String getCostingStatus() {
        return (String) get(PROPERTY_COSTINGSTATUS);
    }
    /**
     * @see MaterialTransaction#PROPERTY_COSTINGSTATUS
     * 
     */
    public void setCostingStatus(String costingStatus) {
        set(PROPERTY_COSTINGSTATUS, costingStatus);
    }

    /**
     * @see MaterialTransaction#PROPERTY_CHECKRESERVEDQUANTITY
     * 
     */
    public Boolean isCheckReservedQuantity() {
        return (Boolean) get(PROPERTY_CHECKRESERVEDQUANTITY);
    }
    /**
     * @see MaterialTransaction#PROPERTY_CHECKRESERVEDQUANTITY
     * 
     */
    public void setCheckReservedQuantity(Boolean checkReservedQuantity) {
        set(PROPERTY_CHECKRESERVEDQUANTITY, checkReservedQuantity);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ISPROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_ISPROCESSED);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ISPROCESSED
     * 
     */
    public void setProcessed(Boolean isProcessed) {
        set(PROPERTY_ISPROCESSED, isProcessed);
    }

    /**
     * @see MaterialTransaction#PROPERTY_CHECKPRICEDIFFERENCE
     * 
     */
    public Boolean isCheckpricedifference() {
        return (Boolean) get(PROPERTY_CHECKPRICEDIFFERENCE);
    }
    /**
     * @see MaterialTransaction#PROPERTY_CHECKPRICEDIFFERENCE
     * 
     */
    public void setCheckpricedifference(Boolean checkpricedifference) {
        set(PROPERTY_CHECKPRICEDIFFERENCE, checkpricedifference);
    }

    /**
     * @see MaterialTransaction#PROPERTY_MANUALCOSTADJUSTMENT
     * 
     */
    public Boolean isManualcostadjustment() {
        return (Boolean) get(PROPERTY_MANUALCOSTADJUSTMENT);
    }
    /**
     * @see MaterialTransaction#PROPERTY_MANUALCOSTADJUSTMENT
     * 
     */
    public void setManualcostadjustment(Boolean manualcostadjustment) {
        set(PROPERTY_MANUALCOSTADJUSTMENT, manualcostadjustment);
    }

    /**
     * @see MaterialTransaction#PROPERTY_ISCOSTPERMANENT
     * 
     */
    public Boolean isCostPermanent() {
        return (Boolean) get(PROPERTY_ISCOSTPERMANENT);
    }
    /**
     * @see MaterialTransaction#PROPERTY_ISCOSTPERMANENT
     * 
     */
    public void setCostPermanent(Boolean isCostPermanent) {
        set(PROPERTY_ISCOSTPERMANENT, isCostPermanent);
    }

    /**
     * @see MaterialTransaction#COMPUTED_COLUMN_TOTALCOST
     * 
     */
    public BigDecimal getTotalCost() {
        return (BigDecimal) get(COMPUTED_COLUMN_TOTALCOST);
    }
    /**
     * @see MaterialTransaction#COMPUTED_COLUMN_TOTALCOST
     * 
     */
    public void setTotalCost(BigDecimal totalCost) {
        set(COMPUTED_COLUMN_TOTALCOST, totalCost);
    }

    /**
     * @see MaterialTransaction#COMPUTED_COLUMN_UNITCOST
     * 
     */
    public BigDecimal getUnitCost() {
        return (BigDecimal) get(COMPUTED_COLUMN_UNITCOST);
    }
    /**
     * @see MaterialTransaction#COMPUTED_COLUMN_UNITCOST
     * 
     */
    public void setUnitCost(BigDecimal unitCost) {
        set(COMPUTED_COLUMN_UNITCOST, unitCost);
    }

    /**
     * @see MaterialTransaction#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public MaterialTransaction_ComputedColumns get_computedColumns() {
        return (MaterialTransaction_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see MaterialTransaction#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(MaterialTransaction_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * @see CostAdjustmentLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CostAdjustmentLine> getCostAdjustmentLineList() {
      return (List<CostAdjustmentLine>) get(PROPERTY_COSTADJUSTMENTLINELIST);
    }

    /**
     * @see CostAdjustmentLine
     * 
     */
    public void setCostAdjustmentLineList(List<CostAdjustmentLine> costAdjustmentLineList) {
        set(PROPERTY_COSTADJUSTMENTLINELIST, costAdjustmentLineList);
    }

    /**
     * Help: {@literal Stores the average costs for purchases and productions}<br>
     * @see Costing
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Costing> getMaterialMgmtCostingList() {
      return (List<Costing>) get(PROPERTY_MATERIALMGMTCOSTINGLIST);
    }

    /**
     * Help: {@literal Stores the average costs for purchases and productions}<br>
     * @see Costing
     * 
     */
    public void setMaterialMgmtCostingList(List<Costing> materialMgmtCostingList) {
        set(PROPERTY_MATERIALMGMTCOSTINGLIST, materialMgmtCostingList);
    }

    /**
     * @see TransactionCost
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TransactionCost> getTransactionCostList() {
      return (List<TransactionCost>) get(PROPERTY_TRANSACTIONCOSTLIST);
    }

    /**
     * @see TransactionCost
     * 
     */
    public void setTransactionCostList(List<TransactionCost> transactionCostList) {
        set(PROPERTY_TRANSACTIONCOSTLIST, transactionCostList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_TOTALCOST.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getTotalCost();
      }
      if (COMPUTED_COLUMN_UNITCOST.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getUnitCost();
      }

      return super.get(propName);
    }
}
