
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
import org.openbravo.model.materialmgmt.onhandquantity.Reservation;
/**
 * Entity class for entity MaterialMgmtInternalMovementLine (stored in table M_MovementLine).
 * <br>
 * Help: {@literal Contains the products and the quantities moved and the location it is moving from and to}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InternalMovementLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_MovementLine";
    public static final String ENTITY_NAME = "MaterialMgmtInternalMovementLine";

    /**
     * Property id stored in column M_MovementLine_ID in table M_MovementLine<br>
     * Help: {@literal The Movement Line indicates the inventory movement document line (if applicable) for this
     *       transaction}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_MovementLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_MovementLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_MovementLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_MovementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_MovementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_MovementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_MovementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property movement stored in column M_Movement_ID in table M_MovementLine<br>
     * Help: {@literal The Inventory Movement uniquely identifies a group of movement lines.}
     * 
     */
    public static final String PROPERTY_MOVEMENT = "movement";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_MovementLine<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property newStorageBin stored in column M_LocatorTo_ID in table M_MovementLine<br>
     * Help: {@literal The Locator To indicates the location where the inventory is being moved to.}
     * 
     */
    public static final String PROPERTY_NEWSTORAGEBIN = "newStorageBin";

    /**
     * Property product stored in column M_Product_ID in table M_MovementLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property lineNo stored in column Line in table M_MovementLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property movementQuantity stored in column MovementQty in table M_MovementLine 
     * 
     */
    public static final String PROPERTY_MOVEMENTQUANTITY = "movementQuantity";

    /**
     * Property description stored in column Description in table M_MovementLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_MovementLine<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_MovementLine<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property orderQuantity stored in column QuantityOrder in table M_MovementLine<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property uOM stored in column C_UOM_ID in table M_MovementLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property stockReservation stored in column M_Reservation_ID in table M_MovementLine<br>
     * Help: {@literal The Reservation is the definition of a product reservation is set the owner, the quantity
     *       and the desired dimensions.}
     * 
     */
    public static final String PROPERTY_STOCKRESERVATION = "stockReservation";

    /**
     * Property alternativeUOM stored in column C_Aum in table M_MovementLine<br>
     * Help: {@literal The Alternative UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_ALTERNATIVEUOM = "alternativeUOM";

    /**
     * Property operativeQuantity stored in column Aumqty in table M_MovementLine<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_OPERATIVEQUANTITY = "operativeQuantity";

    /**
     * Property attributeSetInstanceTo stored in column M_AttributeSetInstanceTo_ID in table M_MovementLine<br>
     * Help: {@literal The attribute set instance that will be associated to the storage detail when the
     *       transaction is processed}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETINSTANCETO = "attributeSetInstanceTo";

    /**
     * Property materialMgmtMaterialTransactionList stored in table M_MovementLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST = "materialMgmtMaterialTransactionList";


    public InternalMovementLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MOVEMENTQUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InternalMovementLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InternalMovementLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InternalMovementLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InternalMovementLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InternalMovementLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InternalMovementLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InternalMovementLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InternalMovementLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InternalMovementLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InternalMovementLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InternalMovementLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InternalMovementLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InternalMovementLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InternalMovementLine#PROPERTY_MOVEMENT
     * 
     */
    public InternalMovement getMovement() {
        return (InternalMovement) get(PROPERTY_MOVEMENT);
    }
    /**
     * @see InternalMovementLine#PROPERTY_MOVEMENT
     * 
     */
    public void setMovement(InternalMovement movement) {
        set(PROPERTY_MOVEMENT, movement);
    }

    /**
     * @see InternalMovementLine#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see InternalMovementLine#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see InternalMovementLine#PROPERTY_NEWSTORAGEBIN
     * 
     */
    public Locator getNewStorageBin() {
        return (Locator) get(PROPERTY_NEWSTORAGEBIN);
    }
    /**
     * @see InternalMovementLine#PROPERTY_NEWSTORAGEBIN
     * 
     */
    public void setNewStorageBin(Locator newStorageBin) {
        set(PROPERTY_NEWSTORAGEBIN, newStorageBin);
    }

    /**
     * @see InternalMovementLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see InternalMovementLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see InternalMovementLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see InternalMovementLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see InternalMovementLine#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public BigDecimal getMovementQuantity() {
        return (BigDecimal) get(PROPERTY_MOVEMENTQUANTITY);
    }
    /**
     * @see InternalMovementLine#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public void setMovementQuantity(BigDecimal movementQuantity) {
        set(PROPERTY_MOVEMENTQUANTITY, movementQuantity);
    }

    /**
     * @see InternalMovementLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see InternalMovementLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see InternalMovementLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see InternalMovementLine#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see InternalMovementLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see InternalMovementLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see InternalMovementLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see InternalMovementLine#PROPERTY_STOCKRESERVATION
     * 
     */
    public Reservation getStockReservation() {
        return (Reservation) get(PROPERTY_STOCKRESERVATION);
    }
    /**
     * @see InternalMovementLine#PROPERTY_STOCKRESERVATION
     * 
     */
    public void setStockReservation(Reservation stockReservation) {
        set(PROPERTY_STOCKRESERVATION, stockReservation);
    }

    /**
     * @see InternalMovementLine#PROPERTY_ALTERNATIVEUOM
     * 
     */
    public UOM getAlternativeUOM() {
        return (UOM) get(PROPERTY_ALTERNATIVEUOM);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ALTERNATIVEUOM
     * 
     */
    public void setAlternativeUOM(UOM alternativeUOM) {
        set(PROPERTY_ALTERNATIVEUOM, alternativeUOM);
    }

    /**
     * @see InternalMovementLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public BigDecimal getOperativeQuantity() {
        return (BigDecimal) get(PROPERTY_OPERATIVEQUANTITY);
    }
    /**
     * @see InternalMovementLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public void setOperativeQuantity(BigDecimal operativeQuantity) {
        set(PROPERTY_OPERATIVEQUANTITY, operativeQuantity);
    }

    /**
     * @see InternalMovementLine#PROPERTY_ATTRIBUTESETINSTANCETO
     * 
     */
    public AttributeSetInstance getAttributeSetInstanceTo() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETINSTANCETO);
    }
    /**
     * @see InternalMovementLine#PROPERTY_ATTRIBUTESETINSTANCETO
     * 
     */
    public void setAttributeSetInstanceTo(AttributeSetInstance attributeSetInstanceTo) {
        set(PROPERTY_ATTRIBUTESETINSTANCETO, attributeSetInstanceTo);
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
