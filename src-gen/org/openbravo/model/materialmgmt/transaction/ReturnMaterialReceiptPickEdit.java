
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
import org.openbravo.model.sales.ConditionGoods;
/**
 * Entity class for entity ReturnMaterialReceiptPickEdit (stored in table M_RM_Receipt_Pick_Edit).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReturnMaterialReceiptPickEdit extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_RM_Receipt_Pick_Edit";
    public static final String ENTITY_NAME = "ReturnMaterialReceiptPickEdit";

    /**
     * Property id stored in column M_Rm_Receipt_Pick_Edit_ID in table M_RM_Receipt_Pick_Edit 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_RM_Receipt_Pick_Edit 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_RM_Receipt_Pick_Edit 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_RM_Receipt_Pick_Edit 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_RM_Receipt_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_RM_Receipt_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_RM_Receipt_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_RM_Receipt_Pick_Edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property goodsShipment stored in column M_Inout_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The Shipment ID indicates the unique document for this shipment.}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENT = "goodsShipment";

    /**
     * Property obSelected stored in column OB_Selected in table M_RM_Receipt_Pick_Edit
     * 
     */
    public static final String PROPERTY_OBSELECTED = "obSelected";

    /**
     * Property orderLine stored in column C_Orderline_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_ORDERLINE = "orderLine";

    /**
     * Property product stored in column M_Product_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property uOM stored in column C_Uom_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property attributeSetValue stored in column M_Attributesetinstance_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property returned stored in column Returned in table M_RM_Receipt_Pick_Edit 
     * 
     */
    public static final String PROPERTY_RETURNED = "returned";

    /**
     * Property pending stored in column PendingQty in table M_RM_Receipt_Pick_Edit
     * 
     */
    public static final String PROPERTY_PENDING = "pending";

    /**
     * Property receiving stored in column ReceivingQty in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal Receiving quantity}
     * 
     */
    public static final String PROPERTY_RECEIVING = "receiving";

    /**
     * Property conditionGoods stored in column M_Condition_Goods_ID in table M_RM_Receipt_Pick_Edit
     * 
     */
    public static final String PROPERTY_CONDITIONGOODS = "conditionGoods";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property rMOrderNo stored in column ReturnOrderNo in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal Document number of the Return Material Order}
     * 
     */
    public static final String PROPERTY_RMORDERNO = "rMOrderNo";

    /**
     * Property salesTransaction stored in column Issotrx in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property lineNo stored in column Line in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property goodsShipmentLine stored in column M_Inoutline_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The Goods Shipment Line indicates a unique line in a Shipment document}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENTLINE = "goodsShipmentLine";

    /**
     * Property alternativeUOM stored in column C_Aum in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The Alternative UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_ALTERNATIVEUOM = "alternativeUOM";

    /**
     * Property quantityInAlternativeUOM stored in column Aumqty in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_QUANTITYINALTERNATIVEUOM = "quantityInAlternativeUOM";

    /**
     * Property pendingQtyInAUM stored in column Pendingaumqty in table M_RM_Receipt_Pick_Edit
     * 
     */
    public static final String PROPERTY_PENDINGQTYINAUM = "pendingQtyInAUM";

    /**
     * Property returnedUOM stored in column Returneduom in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal Returned UOM}
     * 
     */
    public static final String PROPERTY_RETURNEDUOM = "returnedUOM";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table M_RM_Receipt_Pick_Edit<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";


    public ReturnMaterialReceiptPickEdit() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OBSELECTED, false);
        setDefaultValue(PROPERTY_SALESTRANSACTION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_GOODSSHIPMENT
     * 
     */
    public ShipmentInOut getGoodsShipment() {
        return (ShipmentInOut) get(PROPERTY_GOODSSHIPMENT);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_GOODSSHIPMENT
     * 
     */
    public void setGoodsShipment(ShipmentInOut goodsShipment) {
        set(PROPERTY_GOODSSHIPMENT, goodsShipment);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public Boolean isObSelected() {
        return (Boolean) get(PROPERTY_OBSELECTED);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public void setObSelected(Boolean obSelected) {
        set(PROPERTY_OBSELECTED, obSelected);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ORDERLINE
     * 
     */
    public OrderLine getOrderLine() {
        return (OrderLine) get(PROPERTY_ORDERLINE);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ORDERLINE
     * 
     */
    public void setOrderLine(OrderLine orderLine) {
        set(PROPERTY_ORDERLINE, orderLine);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RETURNED
     * 
     */
    public BigDecimal getReturned() {
        return (BigDecimal) get(PROPERTY_RETURNED);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RETURNED
     * 
     */
    public void setReturned(BigDecimal returned) {
        set(PROPERTY_RETURNED, returned);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_PENDING
     * 
     */
    public BigDecimal getPending() {
        return (BigDecimal) get(PROPERTY_PENDING);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_PENDING
     * 
     */
    public void setPending(BigDecimal pending) {
        set(PROPERTY_PENDING, pending);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RECEIVING
     * 
     */
    public BigDecimal getReceiving() {
        return (BigDecimal) get(PROPERTY_RECEIVING);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RECEIVING
     * 
     */
    public void setReceiving(BigDecimal receiving) {
        set(PROPERTY_RECEIVING, receiving);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CONDITIONGOODS
     * 
     */
    public ConditionGoods getConditionGoods() {
        return (ConditionGoods) get(PROPERTY_CONDITIONGOODS);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_CONDITIONGOODS
     * 
     */
    public void setConditionGoods(ConditionGoods conditionGoods) {
        set(PROPERTY_CONDITIONGOODS, conditionGoods);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RMORDERNO
     * 
     */
    public String getRMOrderNo() {
        return (String) get(PROPERTY_RMORDERNO);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RMORDERNO
     * 
     */
    public void setRMOrderNo(String rMOrderNo) {
        set(PROPERTY_RMORDERNO, rMOrderNo);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public ShipmentInOutLine getGoodsShipmentLine() {
        return (ShipmentInOutLine) get(PROPERTY_GOODSSHIPMENTLINE);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public void setGoodsShipmentLine(ShipmentInOutLine goodsShipmentLine) {
        set(PROPERTY_GOODSSHIPMENTLINE, goodsShipmentLine);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ALTERNATIVEUOM
     * 
     */
    public UOM getAlternativeUOM() {
        return (UOM) get(PROPERTY_ALTERNATIVEUOM);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_ALTERNATIVEUOM
     * 
     */
    public void setAlternativeUOM(UOM alternativeUOM) {
        set(PROPERTY_ALTERNATIVEUOM, alternativeUOM);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_QUANTITYINALTERNATIVEUOM
     * 
     */
    public BigDecimal getQuantityInAlternativeUOM() {
        return (BigDecimal) get(PROPERTY_QUANTITYINALTERNATIVEUOM);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_QUANTITYINALTERNATIVEUOM
     * 
     */
    public void setQuantityInAlternativeUOM(BigDecimal quantityInAlternativeUOM) {
        set(PROPERTY_QUANTITYINALTERNATIVEUOM, quantityInAlternativeUOM);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_PENDINGQTYINAUM
     * 
     */
    public BigDecimal getPendingQtyInAUM() {
        return (BigDecimal) get(PROPERTY_PENDINGQTYINAUM);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_PENDINGQTYINAUM
     * 
     */
    public void setPendingQtyInAUM(BigDecimal pendingQtyInAUM) {
        set(PROPERTY_PENDINGQTYINAUM, pendingQtyInAUM);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RETURNEDUOM
     * 
     */
    public UOM getReturnedUOM() {
        return (UOM) get(PROPERTY_RETURNEDUOM);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_RETURNEDUOM
     * 
     */
    public void setReturnedUOM(UOM returnedUOM) {
        set(PROPERTY_RETURNEDUOM, returnedUOM);
    }

    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ReturnMaterialReceiptPickEdit#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

}
