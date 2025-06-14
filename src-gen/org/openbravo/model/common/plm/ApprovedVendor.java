
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
package org.openbravo.model.common.plm;

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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.uom.UOM;
/**
 * Entity class for entity ApprovedVendor (stored in table M_Product_PO).
 * <br>
 * Help: {@literal The Purchasing defines the pricing and rules ( pack quantity, UPC, minimum order quantity)
     *       for each product.
     *       The Product Details allows you to display and maintain all products for a selected
     *       Vendor.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ApprovedVendor extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_PO";
    public static final String ENTITY_NAME = "ApprovedVendor";

    /**
     * Property id stored in column M_Product_PO_ID in table M_Product_PO
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property product stored in column M_Product_ID in table M_Product_PO<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table M_Product_PO<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_PO 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_PO 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Product_PO 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_PO 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Product_PO 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_PO 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Product_PO 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property currentVendor stored in column IsCurrentVendor in table M_Product_PO<br>
     * Help: {@literal The Current Vendor indicates if prices are used and Product is reordered from this vendor}
     * 
     */
    public static final String PROPERTY_CURRENTVENDOR = "currentVendor";

    /**
     * Property uOM stored in column C_UOM_ID in table M_Product_PO<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property currency stored in column C_Currency_ID in table M_Product_PO<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property listPrice stored in column PriceList in table M_Product_PO<br>
     * Help: {@literal The Net List Price is the official price stated by the selected pricelist and the currency
     *       of the document.}
     * 
     */
    public static final String PROPERTY_LISTPRICE = "listPrice";

    /**
     * Property purchaseOrderPrice stored in column PricePO in table M_Product_PO<br>
     * Help: {@literal The PO Price indicates the price for a product per the purchase order.}
     * 
     */
    public static final String PROPERTY_PURCHASEORDERPRICE = "purchaseOrderPrice";

    /**
     * Property priceEffectiveFrom stored in column PriceEffective in table M_Product_PO<br>
     * Help: {@literal The Price Effective indicates the date this price is for. This allows you to enter future
     *       prices for products which will become effective when appropriate.}
     * 
     */
    public static final String PROPERTY_PRICEEFFECTIVEFROM = "priceEffectiveFrom";

    /**
     * Property lastPurchasePrice stored in column PriceLastPO in table M_Product_PO<br>
     * Help: {@literal The Last PO Price indicates the last price paid (per the purchase order) for this
     *       product.}
     * 
     */
    public static final String PROPERTY_LASTPURCHASEPRICE = "lastPurchasePrice";

    /**
     * Property lastInvoicePrice stored in column PriceLastInv in table M_Product_PO<br>
     * Help: {@literal The Last Invoice Price indicates the last price paid (per the invoice) for this product.}
     * 
     */
    public static final String PROPERTY_LASTINVOICEPRICE = "lastInvoicePrice";

    /**
     * Property vendorProductNo stored in column VendorProductNo in table M_Product_PO<br>
     * Help: {@literal The Vendor Product Number identifies the number used by the vendor for this product.}
     * 
     */
    public static final String PROPERTY_VENDORPRODUCTNO = "vendorProductNo";

    /**
     * Property uPCEAN stored in column UPC in table M_Product_PO<br>
     * Help: {@literal Use this field to enter the bar code for the product in any of the bar code symbologies
     *       (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN,
     *       ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode)}
     * 
     */
    public static final String PROPERTY_UPCEAN = "uPCEAN";

    /**
     * Property vendorCategory stored in column VendorCategory in table M_Product_PO<br>
     * Help: {@literal The Vendor Category identifies the category used by the vendor for this product.}
     * 
     */
    public static final String PROPERTY_VENDORCATEGORY = "vendorCategory";

    /**
     * Property discontinued stored in column Discontinued in table M_Product_PO<br>
     * Help: {@literal The Discontinued check box indicates a product that has been discontinued.}
     * 
     */
    public static final String PROPERTY_DISCONTINUED = "discontinued";

    /**
     * Property discontinuedBy stored in column DiscontinuedBy in table M_Product_PO<br>
     * Help: {@literal The Discontinued By indicates the individual who discontinued this product}
     * 
     */
    public static final String PROPERTY_DISCONTINUEDBY = "discontinuedBy";

    /**
     * Property minimumOrderQty stored in column Order_Min in table M_Product_PO<br>
     * Help: {@literal The Minimum Order Quantity indicates the smallest quantity of this product which can be
     *       ordered.}
     * 
     */
    public static final String PROPERTY_MINIMUMORDERQTY = "minimumOrderQty";

    /**
     * Property quantityPerPackage stored in column Order_Pack in table M_Product_PO<br>
     * Help: {@literal The Order Pack Quantity indicates the number of units in each pack of this product.}
     * 
     */
    public static final String PROPERTY_QUANTITYPERPACKAGE = "quantityPerPackage";

    /**
     * Property fixedCostPerOrder stored in column CostPerOrder in table M_Product_PO<br>
     * Help: {@literal The Cost Per Order indicates the fixed charge levied when an order for this product is
     *       placed.}
     * 
     */
    public static final String PROPERTY_FIXEDCOSTPERORDER = "fixedCostPerOrder";

    /**
     * Property purchasingLeadTime stored in column DeliveryTime_Promised in table M_Product_PO<br>
     * Help: {@literal Indicates the number of days between placing an order and the actual delivery as promised
     *       by the vendor.}
     * 
     */
    public static final String PROPERTY_PURCHASINGLEADTIME = "purchasingLeadTime";

    /**
     * Property actualDeliveryDays stored in column DeliveryTime_Actual in table M_Product_PO<br>
     * Help: {@literal The Actual Delivery Time indicates the number of days elapsed between placing an order and
     *       the delivery of the order}
     * 
     */
    public static final String PROPERTY_ACTUALDELIVERYDAYS = "actualDeliveryDays";

    /**
     * Property qualityRating stored in column QualityRating in table M_Product_PO<br>
     * Help: {@literal The Quality Rating indicates how a vendor is rated (higher number = higher quality)}
     * 
     */
    public static final String PROPERTY_QUALITYRATING = "qualityRating";

    /**
     * Property royaltyAmount stored in column RoyaltyAmt in table M_Product_PO<br>
     * Help: {@literal (Included) Amount for copyright, etc.}
     * 
     */
    public static final String PROPERTY_ROYALTYAMOUNT = "royaltyAmount";

    /**
     * Property manufacturer stored in column Manufacturer in table M_Product_PO<br>
     * Help: {@literal Manufacturer}
     * 
     */
    public static final String PROPERTY_MANUFACTURER = "manufacturer";

    /**
     * Property capacity stored in column Capacity in table M_Product_PO<br>
     * Help: {@literal Capacity per day}
     * 
     */
    public static final String PROPERTY_CAPACITY = "capacity";

    /**
     * Property standardQuantity stored in column Qtystd in table M_Product_PO<br>
     * Help: {@literal Quantity Standard}
     * 
     */
    public static final String PROPERTY_STANDARDQUANTITY = "standardQuantity";

    /**
     * Property quantityType stored in column Qtytype in table M_Product_PO<br>
     * Help: {@literal Quantity Type}
     * 
     */
    public static final String PROPERTY_QUANTITYTYPE = "quantityType";


    public ApprovedVendor() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CURRENTVENDOR, true);
        setDefaultValue(PROPERTY_DISCONTINUED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ApprovedVendor#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ApprovedVendor#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ApprovedVendor#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ApprovedVendor#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ApprovedVendor#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ApprovedVendor#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ApprovedVendor#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ApprovedVendor#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ApprovedVendor#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ApprovedVendor#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ApprovedVendor#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ApprovedVendor#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ApprovedVendor#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ApprovedVendor#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ApprovedVendor#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ApprovedVendor#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ApprovedVendor#PROPERTY_CURRENTVENDOR
     * 
     */
    public Boolean isCurrentVendor() {
        return (Boolean) get(PROPERTY_CURRENTVENDOR);
    }
    /**
     * @see ApprovedVendor#PROPERTY_CURRENTVENDOR
     * 
     */
    public void setCurrentVendor(Boolean currentVendor) {
        set(PROPERTY_CURRENTVENDOR, currentVendor);
    }

    /**
     * @see ApprovedVendor#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see ApprovedVendor#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see ApprovedVendor#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see ApprovedVendor#PROPERTY_LISTPRICE
     * 
     */
    public BigDecimal getListPrice() {
        return (BigDecimal) get(PROPERTY_LISTPRICE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_LISTPRICE
     * 
     */
    public void setListPrice(BigDecimal listPrice) {
        set(PROPERTY_LISTPRICE, listPrice);
    }

    /**
     * @see ApprovedVendor#PROPERTY_PURCHASEORDERPRICE
     * 
     */
    public BigDecimal getPurchaseOrderPrice() {
        return (BigDecimal) get(PROPERTY_PURCHASEORDERPRICE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_PURCHASEORDERPRICE
     * 
     */
    public void setPurchaseOrderPrice(BigDecimal purchaseOrderPrice) {
        set(PROPERTY_PURCHASEORDERPRICE, purchaseOrderPrice);
    }

    /**
     * @see ApprovedVendor#PROPERTY_PRICEEFFECTIVEFROM
     * 
     */
    public Date getPriceEffectiveFrom() {
        return (Date) get(PROPERTY_PRICEEFFECTIVEFROM);
    }
    /**
     * @see ApprovedVendor#PROPERTY_PRICEEFFECTIVEFROM
     * 
     */
    public void setPriceEffectiveFrom(Date priceEffectiveFrom) {
        set(PROPERTY_PRICEEFFECTIVEFROM, priceEffectiveFrom);
    }

    /**
     * @see ApprovedVendor#PROPERTY_LASTPURCHASEPRICE
     * 
     */
    public BigDecimal getLastPurchasePrice() {
        return (BigDecimal) get(PROPERTY_LASTPURCHASEPRICE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_LASTPURCHASEPRICE
     * 
     */
    public void setLastPurchasePrice(BigDecimal lastPurchasePrice) {
        set(PROPERTY_LASTPURCHASEPRICE, lastPurchasePrice);
    }

    /**
     * @see ApprovedVendor#PROPERTY_LASTINVOICEPRICE
     * 
     */
    public BigDecimal getLastInvoicePrice() {
        return (BigDecimal) get(PROPERTY_LASTINVOICEPRICE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_LASTINVOICEPRICE
     * 
     */
    public void setLastInvoicePrice(BigDecimal lastInvoicePrice) {
        set(PROPERTY_LASTINVOICEPRICE, lastInvoicePrice);
    }

    /**
     * @see ApprovedVendor#PROPERTY_VENDORPRODUCTNO
     * 
     */
    public String getVendorProductNo() {
        return (String) get(PROPERTY_VENDORPRODUCTNO);
    }
    /**
     * @see ApprovedVendor#PROPERTY_VENDORPRODUCTNO
     * 
     */
    public void setVendorProductNo(String vendorProductNo) {
        set(PROPERTY_VENDORPRODUCTNO, vendorProductNo);
    }

    /**
     * @see ApprovedVendor#PROPERTY_UPCEAN
     * 
     */
    public String getUPCEAN() {
        return (String) get(PROPERTY_UPCEAN);
    }
    /**
     * @see ApprovedVendor#PROPERTY_UPCEAN
     * 
     */
    public void setUPCEAN(String uPCEAN) {
        set(PROPERTY_UPCEAN, uPCEAN);
    }

    /**
     * @see ApprovedVendor#PROPERTY_VENDORCATEGORY
     * 
     */
    public String getVendorCategory() {
        return (String) get(PROPERTY_VENDORCATEGORY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_VENDORCATEGORY
     * 
     */
    public void setVendorCategory(String vendorCategory) {
        set(PROPERTY_VENDORCATEGORY, vendorCategory);
    }

    /**
     * @see ApprovedVendor#PROPERTY_DISCONTINUED
     * 
     */
    public Boolean isDiscontinued() {
        return (Boolean) get(PROPERTY_DISCONTINUED);
    }
    /**
     * @see ApprovedVendor#PROPERTY_DISCONTINUED
     * 
     */
    public void setDiscontinued(Boolean discontinued) {
        set(PROPERTY_DISCONTINUED, discontinued);
    }

    /**
     * @see ApprovedVendor#PROPERTY_DISCONTINUEDBY
     * 
     */
    public Date getDiscontinuedBy() {
        return (Date) get(PROPERTY_DISCONTINUEDBY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_DISCONTINUEDBY
     * 
     */
    public void setDiscontinuedBy(Date discontinuedBy) {
        set(PROPERTY_DISCONTINUEDBY, discontinuedBy);
    }

    /**
     * @see ApprovedVendor#PROPERTY_MINIMUMORDERQTY
     * 
     */
    public BigDecimal getMinimumOrderQty() {
        return (BigDecimal) get(PROPERTY_MINIMUMORDERQTY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_MINIMUMORDERQTY
     * 
     */
    public void setMinimumOrderQty(BigDecimal minimumOrderQty) {
        set(PROPERTY_MINIMUMORDERQTY, minimumOrderQty);
    }

    /**
     * @see ApprovedVendor#PROPERTY_QUANTITYPERPACKAGE
     * 
     */
    public BigDecimal getQuantityPerPackage() {
        return (BigDecimal) get(PROPERTY_QUANTITYPERPACKAGE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_QUANTITYPERPACKAGE
     * 
     */
    public void setQuantityPerPackage(BigDecimal quantityPerPackage) {
        set(PROPERTY_QUANTITYPERPACKAGE, quantityPerPackage);
    }

    /**
     * @see ApprovedVendor#PROPERTY_FIXEDCOSTPERORDER
     * 
     */
    public BigDecimal getFixedCostPerOrder() {
        return (BigDecimal) get(PROPERTY_FIXEDCOSTPERORDER);
    }
    /**
     * @see ApprovedVendor#PROPERTY_FIXEDCOSTPERORDER
     * 
     */
    public void setFixedCostPerOrder(BigDecimal fixedCostPerOrder) {
        set(PROPERTY_FIXEDCOSTPERORDER, fixedCostPerOrder);
    }

    /**
     * @see ApprovedVendor#PROPERTY_PURCHASINGLEADTIME
     * 
     */
    public Long getPurchasingLeadTime() {
        return (Long) get(PROPERTY_PURCHASINGLEADTIME);
    }
    /**
     * @see ApprovedVendor#PROPERTY_PURCHASINGLEADTIME
     * 
     */
    public void setPurchasingLeadTime(Long purchasingLeadTime) {
        set(PROPERTY_PURCHASINGLEADTIME, purchasingLeadTime);
    }

    /**
     * @see ApprovedVendor#PROPERTY_ACTUALDELIVERYDAYS
     * 
     */
    public Long getActualDeliveryDays() {
        return (Long) get(PROPERTY_ACTUALDELIVERYDAYS);
    }
    /**
     * @see ApprovedVendor#PROPERTY_ACTUALDELIVERYDAYS
     * 
     */
    public void setActualDeliveryDays(Long actualDeliveryDays) {
        set(PROPERTY_ACTUALDELIVERYDAYS, actualDeliveryDays);
    }

    /**
     * @see ApprovedVendor#PROPERTY_QUALITYRATING
     * 
     */
    public Long getQualityRating() {
        return (Long) get(PROPERTY_QUALITYRATING);
    }
    /**
     * @see ApprovedVendor#PROPERTY_QUALITYRATING
     * 
     */
    public void setQualityRating(Long qualityRating) {
        set(PROPERTY_QUALITYRATING, qualityRating);
    }

    /**
     * @see ApprovedVendor#PROPERTY_ROYALTYAMOUNT
     * 
     */
    public BigDecimal getRoyaltyAmount() {
        return (BigDecimal) get(PROPERTY_ROYALTYAMOUNT);
    }
    /**
     * @see ApprovedVendor#PROPERTY_ROYALTYAMOUNT
     * 
     */
    public void setRoyaltyAmount(BigDecimal royaltyAmount) {
        set(PROPERTY_ROYALTYAMOUNT, royaltyAmount);
    }

    /**
     * @see ApprovedVendor#PROPERTY_MANUFACTURER
     * 
     */
    public String getManufacturer() {
        return (String) get(PROPERTY_MANUFACTURER);
    }
    /**
     * @see ApprovedVendor#PROPERTY_MANUFACTURER
     * 
     */
    public void setManufacturer(String manufacturer) {
        set(PROPERTY_MANUFACTURER, manufacturer);
    }

    /**
     * @see ApprovedVendor#PROPERTY_CAPACITY
     * 
     */
    public BigDecimal getCapacity() {
        return (BigDecimal) get(PROPERTY_CAPACITY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_CAPACITY
     * 
     */
    public void setCapacity(BigDecimal capacity) {
        set(PROPERTY_CAPACITY, capacity);
    }

    /**
     * @see ApprovedVendor#PROPERTY_STANDARDQUANTITY
     * 
     */
    public BigDecimal getStandardQuantity() {
        return (BigDecimal) get(PROPERTY_STANDARDQUANTITY);
    }
    /**
     * @see ApprovedVendor#PROPERTY_STANDARDQUANTITY
     * 
     */
    public void setStandardQuantity(BigDecimal standardQuantity) {
        set(PROPERTY_STANDARDQUANTITY, standardQuantity);
    }

    /**
     * @see ApprovedVendor#PROPERTY_QUANTITYTYPE
     * 
     */
    public String getQuantityType() {
        return (String) get(PROPERTY_QUANTITYTYPE);
    }
    /**
     * @see ApprovedVendor#PROPERTY_QUANTITYTYPE
     * 
     */
    public void setQuantityType(String quantityType) {
        set(PROPERTY_QUANTITYTYPE, quantityType);
    }

}
