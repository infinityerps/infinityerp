
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
package org.openbravo.model.materialmgmt.onhandquantity;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.AttributeSetInstance;
/**
 * Entity class for entity reservedgoodmnt_pick_edit (stored in table m_reservedgoodmnt_pick_edit).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReservedGoodMovementPickEdit extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "m_reservedgoodmnt_pick_edit";
    public static final String ENTITY_NAME = "reservedgoodmnt_pick_edit";

    /**
     * Property id stored in column M_Reservedgoodmnt_Pick_Edit_ID in table m_reservedgoodmnt_pick_edit 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property stockReservation stored in column M_Reservation_ID in table m_reservedgoodmnt_pick_edit<br>
     * Help: {@literal The Reservation is the definition of a product reservation is set the owner, the quantity
     *       and the desired dimensions.}
     * 
     */
    public static final String PROPERTY_STOCKRESERVATION = "stockReservation";

    /**
     * Property client stored in column AD_Client_ID in table m_reservedgoodmnt_pick_edit 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table m_reservedgoodmnt_pick_edit 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table m_reservedgoodmnt_pick_edit 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property updated stored in column Updated in table m_reservedgoodmnt_pick_edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table m_reservedgoodmnt_pick_edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property creationDate stored in column Created in table m_reservedgoodmnt_pick_edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table m_reservedgoodmnt_pick_edit 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property obSelected stored in column OB_Selected in table m_reservedgoodmnt_pick_edit
     * 
     */
    public static final String PROPERTY_OBSELECTED = "obSelected";

    /**
     * Property storageBin stored in column M_Locator_ID in table m_reservedgoodmnt_pick_edit<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property salesOrderLine stored in column C_Orderline_ID in table m_reservedgoodmnt_pick_edit<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property quantity stored in column Quantity in table m_reservedgoodmnt_pick_edit 
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property released stored in column Releasedqty in table m_reservedgoodmnt_pick_edit<br>
     * Help: {@literal Quantity released from the reservation. For example once it has been shipped to the
     *       customer.}
     * 
     */
    public static final String PROPERTY_RELEASED = "released";

    /**
     * Property newStorageBin stored in column M_Locatorto_ID in table m_reservedgoodmnt_pick_edit<br>
     * Help: {@literal The Locator To indicates the location where the inventory is being moved to.}
     * 
     */
    public static final String PROPERTY_NEWSTORAGEBIN = "newStorageBin";

    /**
     * Property movementQuantity stored in column Movementqty in table m_reservedgoodmnt_pick_edit<br>
     * Help: {@literal The Movement Quantity indicates the quantity of a product that has been moved.}
     * 
     */
    public static final String PROPERTY_MOVEMENTQUANTITY = "movementQuantity";

    /**
     * Property attributeSetValue stored in column M_Attributesetinstance_ID in table m_reservedgoodmnt_pick_edit<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";


    public ReservedGoodMovementPickEdit() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OBSELECTED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_STOCKRESERVATION
     * 
     */
    public Reservation getStockReservation() {
        return (Reservation) get(PROPERTY_STOCKRESERVATION);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_STOCKRESERVATION
     * 
     */
    public void setStockReservation(Reservation stockReservation) {
        set(PROPERTY_STOCKRESERVATION, stockReservation);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public Boolean isObSelected() {
        return (Boolean) get(PROPERTY_OBSELECTED);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_OBSELECTED
     * 
     */
    public void setObSelected(Boolean obSelected) {
        set(PROPERTY_OBSELECTED, obSelected);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_RELEASED
     * 
     */
    public Long getReleased() {
        return (Long) get(PROPERTY_RELEASED);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_RELEASED
     * 
     */
    public void setReleased(Long released) {
        set(PROPERTY_RELEASED, released);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_NEWSTORAGEBIN
     * 
     */
    public Locator getNewStorageBin() {
        return (Locator) get(PROPERTY_NEWSTORAGEBIN);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_NEWSTORAGEBIN
     * 
     */
    public void setNewStorageBin(Locator newStorageBin) {
        set(PROPERTY_NEWSTORAGEBIN, newStorageBin);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public BigDecimal getMovementQuantity() {
        return (BigDecimal) get(PROPERTY_MOVEMENTQUANTITY);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_MOVEMENTQUANTITY
     * 
     */
    public void setMovementQuantity(BigDecimal movementQuantity) {
        set(PROPERTY_MOVEMENTQUANTITY, movementQuantity);
    }

    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see ReservedGoodMovementPickEdit#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

}
