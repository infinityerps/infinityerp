
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
package org.openbravo.model.materialmgmt.cost;

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
import org.openbravo.model.materialmgmt.transaction.ShipmentInOutLine;
/**
 * Entity class for entity LandedCostReceiptLineAmt (stored in table M_LC_ReceiptLine_Amt).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class LCReceiptLineAmt extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_LC_ReceiptLine_Amt";
    public static final String ENTITY_NAME = "LandedCostReceiptLineAmt";

    /**
     * Property id stored in column M_Lc_Receiptline_Amt_ID in table M_LC_ReceiptLine_Amt 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_LC_ReceiptLine_Amt 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_LC_ReceiptLine_Amt 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_LC_ReceiptLine_Amt 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_LC_ReceiptLine_Amt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_LC_ReceiptLine_Amt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_LC_ReceiptLine_Amt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_LC_ReceiptLine_Amt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property landedCostCost stored in column M_Lc_Cost_ID in table M_LC_ReceiptLine_Amt<br>
     * Help: {@literal Each Landed Cost amount to be included in the Landed Cost document.}
     * 
     */
    public static final String PROPERTY_LANDEDCOSTCOST = "landedCostCost";

    /**
     * Property landedCostReceipt stored in column M_Lc_Receipt_ID in table M_LC_ReceiptLine_Amt<br>
     * Help: {@literal Identifies each Receipt assigned to the Landed Cost Document with the corresponding
     *       amount.}
     * 
     */
    public static final String PROPERTY_LANDEDCOSTRECEIPT = "landedCostReceipt";

    /**
     * Property amount stored in column Amount in table M_LC_ReceiptLine_Amt 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property goodsShipmentLine stored in column M_Inoutline_ID in table M_LC_ReceiptLine_Amt<br>
     * Help: {@literal The Goods Shipment Line indicates a unique line in a Shipment document}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENTLINE = "goodsShipmentLine";

    /**
     * Property isMatchingAdjustment stored in column Ismatchadjustment in table M_LC_ReceiptLine_Amt<br>
     * Help: {@literal Flag to determine the amounts added to the receipt after matching the original amount with
     *       the relevant invoices or matching document. }
     * 
     */
    public static final String PROPERTY_ISMATCHINGADJUSTMENT = "isMatchingAdjustment";


    public LCReceiptLineAmt() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ISMATCHINGADJUSTMENT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_LANDEDCOSTCOST
     * 
     */
    public LandedCostCost getLandedCostCost() {
        return (LandedCostCost) get(PROPERTY_LANDEDCOSTCOST);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_LANDEDCOSTCOST
     * 
     */
    public void setLandedCostCost(LandedCostCost landedCostCost) {
        set(PROPERTY_LANDEDCOSTCOST, landedCostCost);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_LANDEDCOSTRECEIPT
     * 
     */
    public LCReceipt getLandedCostReceipt() {
        return (LCReceipt) get(PROPERTY_LANDEDCOSTRECEIPT);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_LANDEDCOSTRECEIPT
     * 
     */
    public void setLandedCostReceipt(LCReceipt landedCostReceipt) {
        set(PROPERTY_LANDEDCOSTRECEIPT, landedCostReceipt);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public ShipmentInOutLine getGoodsShipmentLine() {
        return (ShipmentInOutLine) get(PROPERTY_GOODSSHIPMENTLINE);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_GOODSSHIPMENTLINE
     * 
     */
    public void setGoodsShipmentLine(ShipmentInOutLine goodsShipmentLine) {
        set(PROPERTY_GOODSSHIPMENTLINE, goodsShipmentLine);
    }

    /**
     * @see LCReceiptLineAmt#PROPERTY_ISMATCHINGADJUSTMENT
     * 
     */
    public Boolean isMatchingAdjustment() {
        return (Boolean) get(PROPERTY_ISMATCHINGADJUSTMENT);
    }
    /**
     * @see LCReceiptLineAmt#PROPERTY_ISMATCHINGADJUSTMENT
     * 
     */
    public void setMatchingAdjustment(Boolean isMatchingAdjustment) {
        set(PROPERTY_ISMATCHINGADJUSTMENT, isMatchingAdjustment);
    }

}
