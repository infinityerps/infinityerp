
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
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.uom.UOM;
/**
 * Entity class for entity ReturnMaterialShipmentPickEdit (stored in table M_RM_Shipment_Pick_Edit).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReturnMaterialShipmentPickEdit extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_RM_Shipment_Pick_Edit";
    public static final String ENTITY_NAME = "ReturnMaterialShipmentPickEdit";

    /**
     * Property id stored in column M_Rm_Shipment_Pick_Edit_ID in table M_RM_Shipment_Pick_Edit 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_RM_Shipment_Pick_Edit 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_RM_Shipment_Pick_Edit 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_RM_Shipment_Pick_Edit 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property createdBy stored in column Createdby in table M_RM_Shipment_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property creationDate stored in column Created in table M_RM_Shipment_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property updatedBy stored in column Updatedby in table M_RM_Shipment_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property updated stored in column Updated in table M_RM_Shipment_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property rMOrderNo stored in column Returnorderno in table M_RM_Shipment_Pick_Edit 
     * 
     */
    public static final String PROPERTY_RMORDERNO = "rMOrderNo";

    /**
     * Property product stored in column M_Product_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property attributeSetValue stored in column M_Attributesetinstance_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property uOM stored in column C_Uom_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property returned stored in column Returned in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal If it is checked means that the debt/payment has been returned by the bank.}
     * 
     */
    public static final String PROPERTY_RETURNED = "returned";

    /**
     * Property movementQuantity stored in column Movementqty in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The Movement Quantity indicates the quantity of a product that has been moved.}
     * 
     */
    public static final String PROPERTY_MOVEMENTQUANTITY = "movementQuantity";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property availableQty stored in column Availableqty in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal Quantity available of the product in the storage bin}
     * 
     */
    public static final String PROPERTY_AVAILABLEQTY = "availableQty";

    /**
     * Property pending stored in column Pendingqty in table M_RM_Shipment_Pick_Edit
     * 
     */
    public static final String PROPERTY_PENDING = "pending";

    /**
     * Property goodsShipment stored in column M_Inout_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The Shipment ID indicates the unique document for this shipment.}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENT = "goodsShipment";

    /**
     * Property obSelected stored in column OB_Selected in table M_RM_Shipment_Pick_Edit
     * 
     */
    public static final String PROPERTY_OBSELECTED = "obSelected";

    /**
     * Property orderLine stored in column C_Orderline_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_ORDERLINE = "orderLine";

    /**
     * Property lineNo stored in column Line in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property goodsShipmentLine stored in column M_Inoutline_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The Goods Shipment Line indicates a unique line in a Shipment document}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENTLINE = "goodsShipmentLine";

    /**
     * Property stocked stored in column IsStocked in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The Stocked check box indicates if this product is stocked by this Organization.}
     * 
     */
    public static final String PROPERTY_STOCKED = "stocked";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property alternativeUOM stored in column C_Aum in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The Alternative UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_ALTERNATIVEUOM = "alternativeUOM";

    /**
     * Property locatorOrg stored in column LocatorOrg in table M_RM_Shipment_Pick_Edit
     * 
     */
    public static final String PROPERTY_LOCATORORG = "locatorOrg";

    /**
     * Property quantityInAlternativeUOM stored in column Aumqty in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_QUANTITYINALTERNATIVEUOM = "quantityInAlternativeUOM";

    /**
     * Property returnedUOM stored in column Returneduom in table M_RM_Shipment_Pick_Edit
     * 
     */
    public static final String PROPERTY_RETURNEDUOM = "returnedUOM";

    /**
     * Property pendingQtyInAUM stored in column Pendingaumqty in table M_RM_Shipment_Pick_Edit
     * 
     */
    public static final String PROPERTY_PENDINGQTYINAUM = "pendingQtyInAUM";

    /**
     * Property availableQtyInAUM stored in column Availableaumqty in table M_RM_Shipment_Pick_Edit
     * 
     */
    public static final String PROPERTY_AVAILABLEQTYINAUM = "availableQtyInAUM";

    /**
     * Property rate stored in column Rate in table M_RM_Shipment_Pick_Edit<br>
     * Help: {@literal The Rate indicates the percentage to be multiplied by the source to arrive at the tax or
     *       exchange amount.}
     * 
     */
    public static final String PROPERTY_RATE = "rate";


    public ReturnMaterialShipmentPickEdit() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OBSELECTED, false);
        setDefaultValue(PROPERTY_STOCKED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RMORDERNO
     * 
     */
    public String getRMOrderNo() {
        return (String) get(PROPERTY_RMORDERNO);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RMORDERNO
     * 
     */
    public void setRMOrderNo(String rMOrderNo) {
        set(PROPERTY_RMORDERNO, rMOrderNo);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RETURNED
     * 
     */
    public BigDecimal getReturned() {
        return (BigDecimal) get(PROPERTY_RETURNED);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RETURNED
     * 
     */
    public void setReturned(BigDecimal returned) {
        set(PROPERTY_RETURNED, returned);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public BigDecimal getMovementQuantity() {
        return (BigDecimal) get(PROPERTY_MOVEMENTQUANTITY);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public void setMovementQuantity(BigDecimal movementQuantity) {
        set(PROPERTY_MOVEMENTQUANTITY, movementQuantity);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_AVAILABLEQTY
     * 
     */
    public BigDecimal getAvailableQty() {
        return (BigDecimal) get(PROPERTY_AVAILABLEQTY);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_AVAILABLEQTY
     * 
     */
    public void setAvailableQty(BigDecimal availableQty) {
        set(PROPERTY_AVAILABLEQTY, availableQty);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_PENDING
     * 
     */
    public BigDecimal getPending() {
        return (BigDecimal) get(PROPERTY_PENDING);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_PENDING
     * 
     */
    public void setPending(BigDecimal pending) {
        set(PROPERTY_PENDING, pending);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_GOODSSHIPMENT
     * 
     */
    public ShipmentInOut getGoodsShipment() {
        return (ShipmentInOut) get(PROPERTY_GOODSSHIPMENT);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_GOODSSHIPMENT
     * 
     */
    public void setGoodsShipment(ShipmentInOut goodsShipment) {
        set(PROPERTY_GOODSSHIPMENT, goodsShipment);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public Boolean isObSelected() {
        return (Boolean) get(PROPERTY_OBSELECTED);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public void setObSelected(Boolean obSelected) {
        set(PROPERTY_OBSELECTED, obSelected);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ORDERLINE
     * 
     */
    public OrderLine getOrderLine() {
        return (OrderLine) get(PROPERTY_ORDERLINE);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ORDERLINE
     * 
     */
    public void setOrderLine(OrderLine orderLine) {
        set(PROPERTY_ORDERLINE, orderLine);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public ShipmentInOutLine getGoodsShipmentLine() {
        return (ShipmentInOutLine) get(PROPERTY_GOODSSHIPMENTLINE);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public void setGoodsShipmentLine(ShipmentInOutLine goodsShipmentLine) {
        set(PROPERTY_GOODSSHIPMENTLINE, goodsShipmentLine);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_STOCKED
     * 
     */
    public Boolean isStocked() {
        return (Boolean) get(PROPERTY_STOCKED);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_STOCKED
     * 
     */
    public void setStocked(Boolean stocked) {
        set(PROPERTY_STOCKED, stocked);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ALTERNATIVEUOM
     * 
     */
    public UOM getAlternativeUOM() {
        return (UOM) get(PROPERTY_ALTERNATIVEUOM);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_ALTERNATIVEUOM
     * 
     */
    public void setAlternativeUOM(UOM alternativeUOM) {
        set(PROPERTY_ALTERNATIVEUOM, alternativeUOM);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_LOCATORORG
     * 
     */
    public Organization getLocatorOrg() {
        return (Organization) get(PROPERTY_LOCATORORG);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_LOCATORORG
     * 
     */
    public void setLocatorOrg(Organization locatorOrg) {
        set(PROPERTY_LOCATORORG, locatorOrg);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_QUANTITYINALTERNATIVEUOM
     * 
     */
    public BigDecimal getQuantityInAlternativeUOM() {
        return (BigDecimal) get(PROPERTY_QUANTITYINALTERNATIVEUOM);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_QUANTITYINALTERNATIVEUOM
     * 
     */
    public void setQuantityInAlternativeUOM(BigDecimal quantityInAlternativeUOM) {
        set(PROPERTY_QUANTITYINALTERNATIVEUOM, quantityInAlternativeUOM);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RETURNEDUOM
     * 
     */
    public UOM getReturnedUOM() {
        return (UOM) get(PROPERTY_RETURNEDUOM);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RETURNEDUOM
     * 
     */
    public void setReturnedUOM(UOM returnedUOM) {
        set(PROPERTY_RETURNEDUOM, returnedUOM);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_PENDINGQTYINAUM
     * 
     */
    public BigDecimal getPendingQtyInAUM() {
        return (BigDecimal) get(PROPERTY_PENDINGQTYINAUM);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_PENDINGQTYINAUM
     * 
     */
    public void setPendingQtyInAUM(BigDecimal pendingQtyInAUM) {
        set(PROPERTY_PENDINGQTYINAUM, pendingQtyInAUM);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_AVAILABLEQTYINAUM
     * 
     */
    public BigDecimal getAvailableQtyInAUM() {
        return (BigDecimal) get(PROPERTY_AVAILABLEQTYINAUM);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_AVAILABLEQTYINAUM
     * 
     */
    public void setAvailableQtyInAUM(BigDecimal availableQtyInAUM) {
        set(PROPERTY_AVAILABLEQTYINAUM, availableQtyInAUM);
    }

    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RATE
     * 
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(PROPERTY_RATE);
    }
    /**
     * @see ReturnMaterialShipmentPickEdit#PROPERTY_RATE
     * 
     */
    public void setRate(BigDecimal rate) {
        set(PROPERTY_RATE, rate);
    }

}
