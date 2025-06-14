
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
package org.openbravo.model.procurement;

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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductUOM;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.pricing.pricelist.PriceList;
/**
 * Entity class for entity ProcurementRequisitionLine (stored in table M_RequisitionLine).
 * <br>
 * Help: {@literal This table contains each product demand of a requisition. The demand is defined by a
     *       product, the date when is needed to have and the quantity. It is also possible to define a preferred
     *       vendor, price list and the correspondent prices. The demands are locked when are being used to
     *       generate the purchase orders so there are not created duplicate purchase orders for the same
     *       demand.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class RequisitionLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_RequisitionLine";
    public static final String ENTITY_NAME = "ProcurementRequisitionLine";

    /**
     * Property id stored in column M_Requisitionline_ID in table M_RequisitionLine<br>
     * Help: {@literal Identifies each product demand of a requisition.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_RequisitionLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_RequisitionLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_RequisitionLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_RequisitionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_RequisitionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_RequisitionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_RequisitionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property requisition stored in column M_Requisition_ID in table M_RequisitionLine<br>
     * Help: {@literal The ID identifies a unique requisition}
     * 
     */
    public static final String PROPERTY_REQUISITION = "requisition";

    /**
     * Property product stored in column M_Product_ID in table M_RequisitionLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property quantity stored in column Qty in table M_RequisitionLine 
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property listPrice stored in column PriceList in table M_RequisitionLine<br>
     * Help: {@literal The Net List Price is the official price stated by the selected pricelist and the currency
     *       of the document.}
     * 
     */
    public static final String PROPERTY_LISTPRICE = "listPrice";

    /**
     * Property lineNetAmount stored in column LineNetAmt in table M_RequisitionLine<br>
     * Help: {@literal Indicates the line net amount based on the quantity and the actual price.  Any additional
     *       charges or freight are not included.}
     * 
     */
    public static final String PROPERTY_LINENETAMOUNT = "lineNetAmount";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table M_RequisitionLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property uOM stored in column C_UOM_ID in table M_RequisitionLine<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property orderUOM stored in column M_Product_Uom_Id in table M_RequisitionLine<br>
     * Help: {@literal Alternative order UOM for the product.}
     * 
     */
    public static final String PROPERTY_ORDERUOM = "orderUOM";

    /**
     * Property orderQuantity stored in column QuantityOrder in table M_RequisitionLine<br>
     * Help: {@literal 
     *       Product quantity in the order uom.}
     * 
     */
    public static final String PROPERTY_ORDERQUANTITY = "orderQuantity";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_RequisitionLine<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property requisitionLineStatus stored in column Reqstatus in table M_RequisitionLine<br>
     * Help: {@literal Each product demand has its own status different than the status of the requisition. The
     *       statuses of the demands are:
     *       Open: The demand hasn't been yet fulfilled.
     *       Closed: Has been ordered
     *       enough products.
     *       Cancelled: The demand has been closed without ordering any product.
     *       Planned: The
     *       demand has been included in a Purchase Plan of the MRP module.}
     * 
     */
    public static final String PROPERTY_REQUISITIONLINESTATUS = "requisitionLineStatus";

    /**
     * Property matchedPOQty stored in column Orderedqty in table M_RequisitionLine<br>
     * Help: {@literal Indicates the already ordered quantity to fulfill the demand.}
     * 
     */
    public static final String PROPERTY_MATCHEDPOQTY = "matchedPOQty";

    /**
     * Property description stored in column Description in table M_RequisitionLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property changeStatus stored in column Changestatus in table M_RequisitionLine<br>
     * Help: {@literal Button to change the status of the record.}
     * 
     */
    public static final String PROPERTY_CHANGESTATUS = "changeStatus";

    /**
     * Property internalNotes stored in column Internalnotes in table M_RequisitionLine<br>
     * Help: {@literal Notes that can be set with the aim to be seen only by users with access to the record.}
     * 
     */
    public static final String PROPERTY_INTERNALNOTES = "internalNotes";

    /**
     * Property notesForSupplier stored in column Suppliernotes in table M_RequisitionLine<br>
     * Help: {@literal Notes set to include in the Purchase Orders with indications to the vendor.}
     * 
     */
    public static final String PROPERTY_NOTESFORSUPPLIER = "notesForSupplier";

    /**
     * Property plannedDate stored in column Dateplanned in table M_RequisitionLine<br>
     * Help: {@literal Expected date of the transaction.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_PLANNEDDATE = "plannedDate";

    /**
     * Property needByDate stored in column Needbydate in table M_RequisitionLine 
     * 
     */
    public static final String PROPERTY_NEEDBYDATE = "needByDate";

    /**
     * Property unitPrice stored in column PriceActual in table M_RequisitionLine<br>
     * Help: {@literal The actual price indicates the price for a product in source currency.}
     * 
     */
    public static final String PROPERTY_UNITPRICE = "unitPrice";

    /**
     * Property discount stored in column Discount in table M_RequisitionLine<br>
     * Help: {@literal The Discount indicates the discount applied or taken as a percentage.}
     * 
     */
    public static final String PROPERTY_DISCOUNT = "discount";

    /**
     * Property currency stored in column C_Currency_ID in table M_RequisitionLine<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property lockedBy stored in column Lockedby in table M_RequisitionLine<br>
     * Help: {@literal Indicates the user that is locking the record.}
     * 
     */
    public static final String PROPERTY_LOCKEDBY = "lockedBy";

    /**
     * Property lockQty stored in column Lockqty in table M_RequisitionLine<br>
     * Help: {@literal 
     *       Quantity set to be used when the record is processed.}
     * 
     */
    public static final String PROPERTY_LOCKQTY = "lockQty";

    /**
     * Property lockPrice stored in column Lockprice in table M_RequisitionLine<br>
     * Help: {@literal 
     *       Price set to be used when the record is processed.}
     * 
     */
    public static final String PROPERTY_LOCKPRICE = "lockPrice";

    /**
     * Property priceList stored in column M_PriceList_ID in table M_RequisitionLine<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property lockDate stored in column Lockdate in table M_RequisitionLine<br>
     * Help: {@literal Indicates the date when the record was locked. Id the lock it is more than 3 days old it
     *       is considered as unlocked.}
     * 
     */
    public static final String PROPERTY_LOCKDATE = "lockDate";

    /**
     * Property lockCause stored in column Lockcause in table M_RequisitionLine<br>
     * Help: {@literal Indicate the reason to be locked the requisition line. The demands are locked when are
     *       being used in processes that will generate Purchase Orders to fulfill the demand. The lock is
     *       removed when those processes finish or if the lock is 3 days old.
     *       The causes are The Requisition to
     *       Order window or the inclusion of the demand in a MRP process. }
     * 
     */
    public static final String PROPERTY_LOCKCAUSE = "lockCause";

    /**
     * Property lineNo stored in column Line in table M_RequisitionLine<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property grossUnitPrice stored in column Gross_Unit_Price in table M_RequisitionLine<br>
     * Help: {@literal This is the price that is provided when the price is inclusive of taxes. }
     * 
     */
    public static final String PROPERTY_GROSSUNITPRICE = "grossUnitPrice";

    /**
     * Property grossAmount stored in column Gross_Amt in table M_RequisitionLine
     * 
     */
    public static final String PROPERTY_GROSSAMOUNT = "grossAmount";

    /**
     * Property operativeUOM stored in column C_Aum in table M_RequisitionLine<br>
     * Help: {@literal The Alternative UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_OPERATIVEUOM = "operativeUOM";

    /**
     * Property operativeQuantity stored in column Aumqty in table M_RequisitionLine<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_OPERATIVEQUANTITY = "operativeQuantity";

    /**
     * Property lockAumQty stored in column Lockaumqty in table M_RequisitionLine
     * 
     */
    public static final String PROPERTY_LOCKAUMQTY = "lockAumQty";

    /**
     * Property procurementRequisitionPOMatchList stored in table M_RequisitionLine
     * 
     */
    public static final String PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST = "procurementRequisitionPOMatchList";


    public RequisitionLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_QUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_REQUISITIONLINESTATUS, "O");
        setDefaultValue(PROPERTY_MATCHEDPOQTY, new BigDecimal(0));
        setDefaultValue(PROPERTY_CHANGESTATUS, false);
        setDefaultValue(PROPERTY_GROSSUNITPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_GROSSAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see RequisitionLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see RequisitionLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see RequisitionLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see RequisitionLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see RequisitionLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see RequisitionLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see RequisitionLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see RequisitionLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see RequisitionLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see RequisitionLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see RequisitionLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see RequisitionLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see RequisitionLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see RequisitionLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see RequisitionLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see RequisitionLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see RequisitionLine#PROPERTY_REQUISITION
     * 
     */
    public Requisition getRequisition() {
        return (Requisition) get(PROPERTY_REQUISITION);
    }
    /**
     * @see RequisitionLine#PROPERTY_REQUISITION
     * 
     */
    public void setRequisition(Requisition requisition) {
        set(PROPERTY_REQUISITION, requisition);
    }

    /**
     * @see RequisitionLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see RequisitionLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see RequisitionLine#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see RequisitionLine#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see RequisitionLine#PROPERTY_LISTPRICE
     * 
     */
    public BigDecimal getListPrice() {
        return (BigDecimal) get(PROPERTY_LISTPRICE);
    }
    /**
     * @see RequisitionLine#PROPERTY_LISTPRICE
     * 
     */
    public void setListPrice(BigDecimal listPrice) {
        set(PROPERTY_LISTPRICE, listPrice);
    }

    /**
     * @see RequisitionLine#PROPERTY_LINENETAMOUNT
     * 
     */
    public BigDecimal getLineNetAmount() {
        return (BigDecimal) get(PROPERTY_LINENETAMOUNT);
    }
    /**
     * @see RequisitionLine#PROPERTY_LINENETAMOUNT
     * 
     */
    public void setLineNetAmount(BigDecimal lineNetAmount) {
        set(PROPERTY_LINENETAMOUNT, lineNetAmount);
    }

    /**
     * @see RequisitionLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see RequisitionLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see RequisitionLine#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see RequisitionLine#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see RequisitionLine#PROPERTY_ORDERUOM
     * 
     */
    public ProductUOM getOrderUOM() {
        return (ProductUOM) get(PROPERTY_ORDERUOM);
    }
    /**
     * @see RequisitionLine#PROPERTY_ORDERUOM
     * 
     */
    public void setOrderUOM(ProductUOM orderUOM) {
        set(PROPERTY_ORDERUOM, orderUOM);
    }

    /**
     * @see RequisitionLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public BigDecimal getOrderQuantity() {
        return (BigDecimal) get(PROPERTY_ORDERQUANTITY);
    }
    /**
     * @see RequisitionLine#PROPERTY_ORDERQUANTITY
     * 
     */
    public void setOrderQuantity(BigDecimal orderQuantity) {
        set(PROPERTY_ORDERQUANTITY, orderQuantity);
    }

    /**
     * @see RequisitionLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see RequisitionLine#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see RequisitionLine#PROPERTY_REQUISITIONLINESTATUS
     * 
     */
    public String getRequisitionLineStatus() {
        return (String) get(PROPERTY_REQUISITIONLINESTATUS);
    }
    /**
     * @see RequisitionLine#PROPERTY_REQUISITIONLINESTATUS
     * 
     */
    public void setRequisitionLineStatus(String requisitionLineStatus) {
        set(PROPERTY_REQUISITIONLINESTATUS, requisitionLineStatus);
    }

    /**
     * @see RequisitionLine#PROPERTY_MATCHEDPOQTY
     * 
     */
    public BigDecimal getMatchedPOQty() {
        return (BigDecimal) get(PROPERTY_MATCHEDPOQTY);
    }
    /**
     * @see RequisitionLine#PROPERTY_MATCHEDPOQTY
     * 
     */
    public void setMatchedPOQty(BigDecimal matchedPOQty) {
        set(PROPERTY_MATCHEDPOQTY, matchedPOQty);
    }

    /**
     * @see RequisitionLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see RequisitionLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see RequisitionLine#PROPERTY_CHANGESTATUS
     * 
     */
    public Boolean isChangeStatus() {
        return (Boolean) get(PROPERTY_CHANGESTATUS);
    }
    /**
     * @see RequisitionLine#PROPERTY_CHANGESTATUS
     * 
     */
    public void setChangeStatus(Boolean changeStatus) {
        set(PROPERTY_CHANGESTATUS, changeStatus);
    }

    /**
     * @see RequisitionLine#PROPERTY_INTERNALNOTES
     * 
     */
    public String getInternalNotes() {
        return (String) get(PROPERTY_INTERNALNOTES);
    }
    /**
     * @see RequisitionLine#PROPERTY_INTERNALNOTES
     * 
     */
    public void setInternalNotes(String internalNotes) {
        set(PROPERTY_INTERNALNOTES, internalNotes);
    }

    /**
     * @see RequisitionLine#PROPERTY_NOTESFORSUPPLIER
     * 
     */
    public String getNotesForSupplier() {
        return (String) get(PROPERTY_NOTESFORSUPPLIER);
    }
    /**
     * @see RequisitionLine#PROPERTY_NOTESFORSUPPLIER
     * 
     */
    public void setNotesForSupplier(String notesForSupplier) {
        set(PROPERTY_NOTESFORSUPPLIER, notesForSupplier);
    }

    /**
     * @see RequisitionLine#PROPERTY_PLANNEDDATE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Date getPlannedDate() {
        return (Date) get(PROPERTY_PLANNEDDATE);
    }
    /**
     * @see RequisitionLine#PROPERTY_PLANNEDDATE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setPlannedDate(Date plannedDate) {
        set(PROPERTY_PLANNEDDATE, plannedDate);
    }

    /**
     * @see RequisitionLine#PROPERTY_NEEDBYDATE
     * 
     */
    public Date getNeedByDate() {
        return (Date) get(PROPERTY_NEEDBYDATE);
    }
    /**
     * @see RequisitionLine#PROPERTY_NEEDBYDATE
     * 
     */
    public void setNeedByDate(Date needByDate) {
        set(PROPERTY_NEEDBYDATE, needByDate);
    }

    /**
     * @see RequisitionLine#PROPERTY_UNITPRICE
     * 
     */
    public BigDecimal getUnitPrice() {
        return (BigDecimal) get(PROPERTY_UNITPRICE);
    }
    /**
     * @see RequisitionLine#PROPERTY_UNITPRICE
     * 
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        set(PROPERTY_UNITPRICE, unitPrice);
    }

    /**
     * @see RequisitionLine#PROPERTY_DISCOUNT
     * 
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) get(PROPERTY_DISCOUNT);
    }
    /**
     * @see RequisitionLine#PROPERTY_DISCOUNT
     * 
     */
    public void setDiscount(BigDecimal discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    /**
     * @see RequisitionLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see RequisitionLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see RequisitionLine#PROPERTY_LOCKEDBY
     * 
     */
    public User getLockedBy() {
        return (User) get(PROPERTY_LOCKEDBY);
    }
    /**
     * @see RequisitionLine#PROPERTY_LOCKEDBY
     * 
     */
    public void setLockedBy(User lockedBy) {
        set(PROPERTY_LOCKEDBY, lockedBy);
    }

    /**
     * @see RequisitionLine#PROPERTY_LOCKQTY
     * 
     */
    public BigDecimal getLockQty() {
        return (BigDecimal) get(PROPERTY_LOCKQTY);
    }
    /**
     * @see RequisitionLine#PROPERTY_LOCKQTY
     * 
     */
    public void setLockQty(BigDecimal lockQty) {
        set(PROPERTY_LOCKQTY, lockQty);
    }

    /**
     * @see RequisitionLine#PROPERTY_LOCKPRICE
     * 
     */
    public BigDecimal getLockPrice() {
        return (BigDecimal) get(PROPERTY_LOCKPRICE);
    }
    /**
     * @see RequisitionLine#PROPERTY_LOCKPRICE
     * 
     */
    public void setLockPrice(BigDecimal lockPrice) {
        set(PROPERTY_LOCKPRICE, lockPrice);
    }

    /**
     * @see RequisitionLine#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see RequisitionLine#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see RequisitionLine#PROPERTY_LOCKDATE
     * 
     */
    public Date getLockDate() {
        return (Date) get(PROPERTY_LOCKDATE);
    }
    /**
     * @see RequisitionLine#PROPERTY_LOCKDATE
     * 
     */
    public void setLockDate(Date lockDate) {
        set(PROPERTY_LOCKDATE, lockDate);
    }

    /**
     * @see RequisitionLine#PROPERTY_LOCKCAUSE
     * 
     */
    public String getLockCause() {
        return (String) get(PROPERTY_LOCKCAUSE);
    }
    /**
     * @see RequisitionLine#PROPERTY_LOCKCAUSE
     * 
     */
    public void setLockCause(String lockCause) {
        set(PROPERTY_LOCKCAUSE, lockCause);
    }

    /**
     * @see RequisitionLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see RequisitionLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see RequisitionLine#PROPERTY_GROSSUNITPRICE
     * 
     */
    public BigDecimal getGrossUnitPrice() {
        return (BigDecimal) get(PROPERTY_GROSSUNITPRICE);
    }
    /**
     * @see RequisitionLine#PROPERTY_GROSSUNITPRICE
     * 
     */
    public void setGrossUnitPrice(BigDecimal grossUnitPrice) {
        set(PROPERTY_GROSSUNITPRICE, grossUnitPrice);
    }

    /**
     * @see RequisitionLine#PROPERTY_GROSSAMOUNT
     * 
     */
    public BigDecimal getGrossAmount() {
        return (BigDecimal) get(PROPERTY_GROSSAMOUNT);
    }
    /**
     * @see RequisitionLine#PROPERTY_GROSSAMOUNT
     * 
     */
    public void setGrossAmount(BigDecimal grossAmount) {
        set(PROPERTY_GROSSAMOUNT, grossAmount);
    }

    /**
     * @see RequisitionLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public UOM getOperativeUOM() {
        return (UOM) get(PROPERTY_OPERATIVEUOM);
    }
    /**
     * @see RequisitionLine#PROPERTY_OPERATIVEUOM
     * 
     */
    public void setOperativeUOM(UOM operativeUOM) {
        set(PROPERTY_OPERATIVEUOM, operativeUOM);
    }

    /**
     * @see RequisitionLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public BigDecimal getOperativeQuantity() {
        return (BigDecimal) get(PROPERTY_OPERATIVEQUANTITY);
    }
    /**
     * @see RequisitionLine#PROPERTY_OPERATIVEQUANTITY
     * 
     */
    public void setOperativeQuantity(BigDecimal operativeQuantity) {
        set(PROPERTY_OPERATIVEQUANTITY, operativeQuantity);
    }

    /**
     * @see RequisitionLine#PROPERTY_LOCKAUMQTY
     * 
     */
    public BigDecimal getLockAumQty() {
        return (BigDecimal) get(PROPERTY_LOCKAUMQTY);
    }
    /**
     * @see RequisitionLine#PROPERTY_LOCKAUMQTY
     * 
     */
    public void setLockAumQty(BigDecimal lockAumQty) {
        set(PROPERTY_LOCKAUMQTY, lockAumQty);
    }

    /**
     * Help: {@literal This table matches the Requisition lines with the Purchase Orders that satisfy them.}<br>
     * @see RequisitionPOMatch
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RequisitionPOMatch> getProcurementRequisitionPOMatchList() {
      return (List<RequisitionPOMatch>) get(PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST);
    }

    /**
     * Help: {@literal This table matches the Requisition lines with the Purchase Orders that satisfy them.}<br>
     * @see RequisitionPOMatch
     * 
     */
    public void setProcurementRequisitionPOMatchList(List<RequisitionPOMatch> procurementRequisitionPOMatchList) {
        set(PROPERTY_PROCUREMENTREQUISITIONPOMATCHLIST, procurementRequisitionPOMatchList);
    }

}
