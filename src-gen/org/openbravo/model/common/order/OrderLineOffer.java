
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
package org.openbravo.model.common.order;

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
import org.openbravo.model.pricing.priceadjustment.PriceAdjustment;
/**
 * Entity class for entity OrderLineOffer (stored in table C_OrderLine_Offer).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrderLineOffer extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_OrderLine_Offer";
    public static final String ENTITY_NAME = "OrderLineOffer";

    /**
     * Property id stored in column C_Orderline_Offer_ID in table C_OrderLine_Offer 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_OrderLine_Offer 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_OrderLine_Offer 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_OrderLine_Offer 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_OrderLine_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_OrderLine_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_OrderLine_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_OrderLine_Offer 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property salesOrderLine stored in column C_OrderLine_ID in table C_OrderLine_Offer<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property lineNo stored in column Line in table C_OrderLine_Offer 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property priceAdjustment stored in column M_Offer_ID in table C_OrderLine_Offer<br>
     * Help: {@literal Promotion or Discount applied to a particular line (product) automatically by the system.}
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENT = "priceAdjustment";

    /**
     * Property adjustedPrice stored in column Priceoffer in table C_OrderLine_Offer<br>
     * Help: {@literal Net unit price before applying this promotion. In case multiple promotions are applied in
     *       cascade, this price is the one after applying all promotions with more priority than current
     *       one.
     *       
     *       This field is populated in case the used price list does not include taxes.}
     * 
     */
    public static final String PROPERTY_ADJUSTEDPRICE = "adjustedPrice";

    /**
     * Property priceAdjustmentAmt stored in column Amtoffer in table C_OrderLine_Offer 
     * 
     */
    public static final String PROPERTY_PRICEADJUSTMENTAMT = "priceAdjustmentAmt";

    /**
     * Property baseGrossUnitPrice stored in column Priceoffergross in table C_OrderLine_Offer<br>
     * Help: {@literal Gross unit price before applying this promotion. In case multiple promotions are applied
     *       in cascade, this price is the one after applying all promotions with more priority than current
     *       one.
     *       
     *       This field is populated in case the used price list includes taxes.}
     * 
     */
    public static final String PROPERTY_BASEGROSSUNITPRICE = "baseGrossUnitPrice";

    /**
     * Property totalAmount stored in column TotalAmt in table C_OrderLine_Offer<br>
     * Help: {@literal The Total Amount indicates the total document amount.}
     * 
     */
    public static final String PROPERTY_TOTALAMOUNT = "totalAmount";

    /**
     * Property displayedTotalAmount stored in column DisplayedTotalAmt in table C_OrderLine_Offer<br>
     * Help: {@literal This field represents the total amount this promotion discounts from the line. It is the
     *       value that is displayed to user rather than the actual one used internally which might be different
     *       depending on the Promotion Type.}
     * 
     */
    public static final String PROPERTY_DISPLAYEDTOTALAMOUNT = "displayedTotalAmount";


    public OrderLineOffer() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ADJUSTEDPRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_PRICEADJUSTMENTAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_BASEGROSSUNITPRICE, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OrderLineOffer#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OrderLineOffer#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OrderLineOffer#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OrderLineOffer#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OrderLineOffer#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OrderLineOffer#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OrderLineOffer#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OrderLineOffer#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OrderLineOffer#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OrderLineOffer#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OrderLineOffer#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OrderLineOffer#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OrderLineOffer#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OrderLineOffer#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OrderLineOffer#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OrderLineOffer#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OrderLineOffer#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see OrderLineOffer#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see OrderLineOffer#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see OrderLineOffer#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see OrderLineOffer#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public PriceAdjustment getPriceAdjustment() {
        return (PriceAdjustment) get(PROPERTY_PRICEADJUSTMENT);
    }
    /**
     * @see OrderLineOffer#PROPERTY_PRICEADJUSTMENT
     * 
     */
    public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
        set(PROPERTY_PRICEADJUSTMENT, priceAdjustment);
    }

    /**
     * @see OrderLineOffer#PROPERTY_ADJUSTEDPRICE
     * 
     */
    public BigDecimal getAdjustedPrice() {
        return (BigDecimal) get(PROPERTY_ADJUSTEDPRICE);
    }
    /**
     * @see OrderLineOffer#PROPERTY_ADJUSTEDPRICE
     * 
     */
    public void setAdjustedPrice(BigDecimal adjustedPrice) {
        set(PROPERTY_ADJUSTEDPRICE, adjustedPrice);
    }

    /**
     * @see OrderLineOffer#PROPERTY_PRICEADJUSTMENTAMT
     * 
     */
    public BigDecimal getPriceAdjustmentAmt() {
        return (BigDecimal) get(PROPERTY_PRICEADJUSTMENTAMT);
    }
    /**
     * @see OrderLineOffer#PROPERTY_PRICEADJUSTMENTAMT
     * 
     */
    public void setPriceAdjustmentAmt(BigDecimal priceAdjustmentAmt) {
        set(PROPERTY_PRICEADJUSTMENTAMT, priceAdjustmentAmt);
    }

    /**
     * @see OrderLineOffer#PROPERTY_BASEGROSSUNITPRICE
     * 
     */
    public BigDecimal getBaseGrossUnitPrice() {
        return (BigDecimal) get(PROPERTY_BASEGROSSUNITPRICE);
    }
    /**
     * @see OrderLineOffer#PROPERTY_BASEGROSSUNITPRICE
     * 
     */
    public void setBaseGrossUnitPrice(BigDecimal baseGrossUnitPrice) {
        set(PROPERTY_BASEGROSSUNITPRICE, baseGrossUnitPrice);
    }

    /**
     * @see OrderLineOffer#PROPERTY_TOTALAMOUNT
     * 
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) get(PROPERTY_TOTALAMOUNT);
    }
    /**
     * @see OrderLineOffer#PROPERTY_TOTALAMOUNT
     * 
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        set(PROPERTY_TOTALAMOUNT, totalAmount);
    }

    /**
     * @see OrderLineOffer#PROPERTY_DISPLAYEDTOTALAMOUNT
     * 
     */
    public BigDecimal getDisplayedTotalAmount() {
        return (BigDecimal) get(PROPERTY_DISPLAYEDTOTALAMOUNT);
    }
    /**
     * @see OrderLineOffer#PROPERTY_DISPLAYEDTOTALAMOUNT
     * 
     */
    public void setDisplayedTotalAmount(BigDecimal displayedTotalAmount) {
        set(PROPERTY_DISPLAYEDTOTALAMOUNT, displayedTotalAmount);
    }

}
