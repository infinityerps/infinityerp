
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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.procurement.POInvoiceMatch;
import org.openbravo.model.procurement.ReceiptInvoiceMatch;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.ConditionGoods;
/**
 * Entity class for entity MaterialMgmtShipmentInOutLine (stored in table M_InOutLine).
 * <br>
 * Help: {@literal The table defines the individual line that comprise shipment line}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ShipmentInOutLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_InOutLine";
    public static final String ENTITY_NAME = "MaterialMgmtShipmentInOutLine";

    /**
     * Property id stored in column M_InOutLine_ID in table M_InOutLine<br>
     * Help: {@literal The Goods Shipment Line indicates a unique line in a Shipment document}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_InOutLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_InOutLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_InOutLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_InOutLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_InOutLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_InOutLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_InOutLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property lineNo stored in column Line in table M_InOutLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table M_InOutLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property shipmentReceipt stored in column M_InOut_ID in table M_InOutLine<br>
     * Help: {@literal The Shipment ID indicates the unique document for this shipment.}
     * 
     */
    public static final String PROPERTY_SHIPMENTRECEIPT = "shipmentReceipt";

    /**
     * Property salesOrderLine stored in column C_OrderLine_ID in table M_InOutLine<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_InOutLine<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property product stored in column M_Product_ID in table M_InOutLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property uOM stored in column C_UOM_ID in table M_InOutLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property movementQuantity stored in column MovementQty in table M_InOutLine 
     * 
     */
    public static final String PROPERTY_MOVEMENTQUANTITY = "movementQuantity";

    /**
     * Property reinvoice stored in column IsInvoiced in table M_InOutLine<br>
     * Help: {@literal Indicator if invoiced}
     * 
     */
    public static final String PROPERTY_REINVOICE = "reinvoice";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_InOutLine<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property descriptionOnly stored in column IsDescription in table M_InOutLine<br>
     * Help: {@literal If a line is Description Only, e.g. Product Inventory is not corrected. No accounting
     *       transactions are created and the amount or totals are not included in the document.  This for
     *       including descriptional detail lines, e.g. for an Work Order.}
     * 
     */
    public static final String PROPERTY_DESCRIPTIONONLY = "descriptionOnly";

    /**
     * Property orderQuantity stored in column QuantityOrder in table M_InOutLine<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_InOutLine<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property conditionGoods stored in column M_Condition_Goods_ID in table M_InOutLine
     * 
     */
    public static final String PROPERTY_CONDITIONGOODS = "conditionGoods";

    /**
     * Property canceledInoutLine stored in column Canceled_Inoutline_ID in table M_InOutLine<br>
     * Help: {@literal Shipment/Receipt line that it is canceled by this line}
     * 
     */
    public static final String PROPERTY_CANCELEDINOUTLINE = "canceledInoutLine";

    /**
     * Property asset stored in column A_Asset_ID in table M_InOutLine<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property managePrereservation stored in column Manage_Prereservation in table M_InOutLine
     * 
     */
    public static final String PROPERTY_MANAGEPRERESERVATION = "managePrereservation";

    /**
     * Property stDimension stored in column User1_ID in table M_InOutLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table M_InOutLine<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property project stored in column C_Project_ID in table M_InOutLine<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table M_InOutLine<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table M_InOutLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property explode stored in column Explode in table M_InOutLine<br>
     * Help: {@literal Explode the BOM product}
     * 
     */
    public static final String PROPERTY_EXPLODE = "explode";

    /**
     * Property bOMParent stored in column BOM_Parent_ID in table M_InOutLine
     * 
     */
    public static final String PROPERTY_BOMPARENT = "bOMParent";

    /**
     * Property operativeUOM stored in column C_Aum in table M_InOutLine<br>
     * Help: {@literal The Alternative UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_OPERATIVEUOM = "operativeUOM";

    /**
     * Property operativeQuantity stored in column Aumqty in table M_InOutLine<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_OPERATIVEQUANTITY = "operativeQuantity";

    /**
     * Property salesRepresentative stored in column Salesrep_ID in table M_InOutLine<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property inOutLineAccountingDimensionList stored in table M_InOutLine
     * 
     */
    public static final String PROPERTY_INOUTLINEACCOUNTINGDIMENSIONLIST = "inOutLineAccountingDimensionList";

    /**
     * Property invoiceLineList stored in table M_InOutLine
     * 
     */
    public static final String PROPERTY_INVOICELINELIST = "invoiceLineList";

    /**
     * Property materialMgmtMaterialTransactionList stored in table M_InOutLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST = "materialMgmtMaterialTransactionList";

    /**
     * Property materialMgmtShipmentInOutLineCanceledInoutLineList stored in table M_InOutLine
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSHIPMENTINOUTLINECANCELEDINOUTLINELIST = "materialMgmtShipmentInOutLineCanceledInoutLineList";

    /**
     * Property orderLineList stored in table M_InOutLine
     * 
     */
    public static final String PROPERTY_ORDERLINELIST = "orderLineList";

    /**
     * Property procurementPOInvoiceMatchList stored in table M_InOutLine
     * 
     */
    public static final String PROPERTY_PROCUREMENTPOINVOICEMATCHLIST = "procurementPOInvoiceMatchList";

    /**
     * Property procurementReceiptInvoiceMatchList stored in table M_InOutLine
     * 
     */
    public static final String PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST = "procurementReceiptInvoiceMatchList";


    public ShipmentInOutLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MOVEMENTQUANTITY, new BigDecimal(0));
        setDefaultValue(PROPERTY_REINVOICE, false);
        setDefaultValue(PROPERTY_DESCRIPTIONONLY, false);
        setDefaultValue(PROPERTY_MANAGEPRERESERVATION, false);
        setDefaultValue(PROPERTY_EXPLODE, false);
        setDefaultValue(PROPERTY_INOUTLINEACCOUNTINGDIMENSIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINECANCELEDINOUTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTPOINVOICEMATCHLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_SHIPMENTRECEIPT
     * 
     */
    public ShipmentInOut getShipmentReceipt() {
        return (ShipmentInOut) get(PROPERTY_SHIPMENTRECEIPT);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_SHIPMENTRECEIPT
     * 
     */
    public void setShipmentReceipt(ShipmentInOut shipmentReceipt) {
        set(PROPERTY_SHIPMENTRECEIPT, shipmentReceipt);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public BigDecimal getMovementQuantity() {
        return (BigDecimal) get(PROPERTY_MOVEMENTQUANTITY);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public void setMovementQuantity(BigDecimal movementQuantity) {
        set(PROPERTY_MOVEMENTQUANTITY, movementQuantity);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_REINVOICE
     * 
     */
    public Boolean isReinvoice() {
        return (Boolean) get(PROPERTY_REINVOICE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_REINVOICE
     * 
     */
    public void setReinvoice(Boolean reinvoice) {
        set(PROPERTY_REINVOICE, reinvoice);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_DESCRIPTIONONLY
     * 
     */
    public Boolean isDescriptionOnly() {
        return (Boolean) get(PROPERTY_DESCRIPTIONONLY);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_DESCRIPTIONONLY
     * 
     */
    public void setDescriptionOnly(Boolean descriptionOnly) {
        set(PROPERTY_DESCRIPTIONONLY, descriptionOnly);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_CONDITIONGOODS
     * 
     */
    public ConditionGoods getConditionGoods() {
        return (ConditionGoods) get(PROPERTY_CONDITIONGOODS);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_CONDITIONGOODS
     * 
     */
    public void setConditionGoods(ConditionGoods conditionGoods) {
        set(PROPERTY_CONDITIONGOODS, conditionGoods);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_CANCELEDINOUTLINE
     * 
     */
    public ShipmentInOutLine getCanceledInoutLine() {
        return (ShipmentInOutLine) get(PROPERTY_CANCELEDINOUTLINE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_CANCELEDINOUTLINE
     * 
     */
    public void setCanceledInoutLine(ShipmentInOutLine canceledInoutLine) {
        set(PROPERTY_CANCELEDINOUTLINE, canceledInoutLine);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_MANAGEPRERESERVATION
     * 
     */
    public Boolean isManagePrereservation() {
        return (Boolean) get(PROPERTY_MANAGEPRERESERVATION);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_MANAGEPRERESERVATION
     * 
     */
    public void setManagePrereservation(Boolean managePrereservation) {
        set(PROPERTY_MANAGEPRERESERVATION, managePrereservation);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_EXPLODE
     * 
     */
    public Boolean isExplode() {
        return (Boolean) get(PROPERTY_EXPLODE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_EXPLODE
     * 
     */
    public void setExplode(Boolean explode) {
        set(PROPERTY_EXPLODE, explode);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_BOMPARENT
     * 
     */
    public ShipmentInOutLine getBOMParent() {
        return (ShipmentInOutLine) get(PROPERTY_BOMPARENT);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_BOMPARENT
     * 
     */
    public void setBOMParent(ShipmentInOutLine bOMParent) {
        set(PROPERTY_BOMPARENT, bOMParent);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public UOM getOperativeUOM() {
        return (UOM) get(PROPERTY_OPERATIVEUOM);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public void setOperativeUOM(UOM operativeUOM) {
        set(PROPERTY_OPERATIVEUOM, operativeUOM);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public BigDecimal getOperativeQuantity() {
        return (BigDecimal) get(PROPERTY_OPERATIVEQUANTITY);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public void setOperativeQuantity(BigDecimal operativeQuantity) {
        set(PROPERTY_OPERATIVEQUANTITY, operativeQuantity);
    }

    /**
     * @see ShipmentInOutLine#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see ShipmentInOutLine#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * Help: {@literal Accounting Dimension}<br>
     * @see InOutLineAccountingDimension
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InOutLineAccountingDimension> getInOutLineAccountingDimensionList() {
      return (List<InOutLineAccountingDimension>) get(PROPERTY_INOUTLINEACCOUNTINGDIMENSIONLIST);
    }

    /**
     * Help: {@literal Accounting Dimension}<br>
     * @see InOutLineAccountingDimension
     * 
     */
    public void setInOutLineAccountingDimensionList(List<InOutLineAccountingDimension> inOutLineAccountingDimensionList) {
        set(PROPERTY_INOUTLINEACCOUNTINGDIMENSIONLIST, inOutLineAccountingDimensionList);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceLine> getInvoiceLineList() {
      return (List<InvoiceLine>) get(PROPERTY_INVOICELINELIST);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    public void setInvoiceLineList(List<InvoiceLine> invoiceLineList) {
        set(PROPERTY_INVOICELINELIST, invoiceLineList);
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

    /**
     * Help: {@literal The table defines the individual line that comprise shipment line}<br>
     * @see ShipmentInOutLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ShipmentInOutLine> getMaterialMgmtShipmentInOutLineCanceledInoutLineList() {
      return (List<ShipmentInOutLine>) get(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINECANCELEDINOUTLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line that comprise shipment line}<br>
     * @see ShipmentInOutLine
     * 
     */
    public void setMaterialMgmtShipmentInOutLineCanceledInoutLineList(List<ShipmentInOutLine> materialMgmtShipmentInOutLineCanceledInoutLineList) {
        set(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINECANCELEDINOUTLINELIST, materialMgmtShipmentInOutLineCanceledInoutLineList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineList(List<OrderLine> orderLineList) {
        set(PROPERTY_ORDERLINELIST, orderLineList);
    }

    /**
     * Help: {@literal This table contains all the matches between the order lines and:
     *       1. With the material
     *       receipt lines. For each order line we can have one or more materials receipt lines. The result of
     *       the sum of all the material receipt lines have to match with their own order line in order to be
     *       able to say that the order line has been already receipt.
     *       2. With the invoice line. For each order
     *       line we can have one or more invoices lines. The result of the sum of all the invoices lines have to
     *       much with their own order line in order to be able to say that the order line has been already
     *       invoiced}<br>
     * @see POInvoiceMatch
     * 
     */
    @SuppressWarnings("unchecked")
    public List<POInvoiceMatch> getProcurementPOInvoiceMatchList() {
      return (List<POInvoiceMatch>) get(PROPERTY_PROCUREMENTPOINVOICEMATCHLIST);
    }

    /**
     * Help: {@literal This table contains all the matches between the order lines and:
     *       1. With the material
     *       receipt lines. For each order line we can have one or more materials receipt lines. The result of
     *       the sum of all the material receipt lines have to match with their own order line in order to be
     *       able to say that the order line has been already receipt.
     *       2. With the invoice line. For each order
     *       line we can have one or more invoices lines. The result of the sum of all the invoices lines have to
     *       much with their own order line in order to be able to say that the order line has been already
     *       invoiced}<br>
     * @see POInvoiceMatch
     * 
     */
    public void setProcurementPOInvoiceMatchList(List<POInvoiceMatch> procurementPOInvoiceMatchList) {
        set(PROPERTY_PROCUREMENTPOINVOICEMATCHLIST, procurementPOInvoiceMatchList);
    }

    /**
     * Help: {@literal This table contains all the matches between the material receipt lines and the invoice
     *       lines. It is used only for the purchase transactions. For each material receipt line we can have one
     *       or more invoice lines, so the sum of the invoice lines has to match with the amount on the material
     *       receipt line. When everything matches it means the material receipt line is already invoiced}<br>
     * @see ReceiptInvoiceMatch
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReceiptInvoiceMatch> getProcurementReceiptInvoiceMatchList() {
      return (List<ReceiptInvoiceMatch>) get(PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST);
    }

    /**
     * Help: {@literal This table contains all the matches between the material receipt lines and the invoice
     *       lines. It is used only for the purchase transactions. For each material receipt line we can have one
     *       or more invoice lines, so the sum of the invoice lines has to match with the amount on the material
     *       receipt line. When everything matches it means the material receipt line is already invoiced}<br>
     * @see ReceiptInvoiceMatch
     * 
     */
    public void setProcurementReceiptInvoiceMatchList(List<ReceiptInvoiceMatch> procurementReceiptInvoiceMatchList) {
        set(PROPERTY_PROCUREMENTRECEIPTINVOICEMATCHLIST, procurementReceiptInvoiceMatchList);
    }

}
