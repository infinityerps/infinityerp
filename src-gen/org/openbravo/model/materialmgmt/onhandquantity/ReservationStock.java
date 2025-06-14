
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
 * Entity class for entity MaterialMgmtReservationStock (stored in table M_Reservation_Stock).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReservationStock extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Reservation_Stock";
    public static final String ENTITY_NAME = "MaterialMgmtReservationStock";

    /**
     * Property id stored in column M_Reservation_Stock_ID in table M_Reservation_Stock<br>
     * Help: {@literal The Reservation Stock is each existing stock or purchased stock to fulfill the
     *       Reservation.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Reservation_Stock 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Reservation_Stock 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Reservation_Stock 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Reservation_Stock 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Reservation_Stock 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Reservation_Stock 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Reservation_Stock 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property reservation stored in column M_Reservation_ID in table M_Reservation_Stock<br>
     * Help: {@literal The Reservation is the definition of a product reservation is set the owner, the quantity
     *       and the desired dimensions.}
     * 
     */
    public static final String PROPERTY_RESERVATION = "reservation";

    /**
     * Property salesOrderLine stored in column C_Orderline_ID in table M_Reservation_Stock<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property quantity stored in column Quantity in table M_Reservation_Stock 
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property allocated stored in column IsAllocated in table M_Reservation_Stock 
     * 
     */
    public static final String PROPERTY_ALLOCATED = "allocated";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_Reservation_Stock<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property attributeSetValue stored in column M_Attributesetinstance_ID in table M_Reservation_Stock<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property released stored in column ReleasedQty in table M_Reservation_Stock<br>
     * Help: {@literal Quantity released from the reservation. For example once it has been shipped to the
     *       customer.}
     * 
     */
    public static final String PROPERTY_RELEASED = "released";


    public ReservationStock() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ALLOCATED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReservationStock#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReservationStock#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReservationStock#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReservationStock#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReservationStock#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReservationStock#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReservationStock#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReservationStock#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReservationStock#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReservationStock#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReservationStock#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReservationStock#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReservationStock#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReservationStock#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReservationStock#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReservationStock#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReservationStock#PROPERTY_RESERVATION
     * 
     */
    public Reservation getReservation() {
        return (Reservation) get(PROPERTY_RESERVATION);
    }
    /**
     * @see ReservationStock#PROPERTY_RESERVATION
     * 
     */
    public void setReservation(Reservation reservation) {
        set(PROPERTY_RESERVATION, reservation);
    }

    /**
     * @see ReservationStock#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see ReservationStock#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see ReservationStock#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see ReservationStock#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see ReservationStock#PROPERTY_ALLOCATED
     * 
     */
    public Boolean isAllocated() {
        return (Boolean) get(PROPERTY_ALLOCATED);
    }
    /**
     * @see ReservationStock#PROPERTY_ALLOCATED
     * 
     */
    public void setAllocated(Boolean allocated) {
        set(PROPERTY_ALLOCATED, allocated);
    }

    /**
     * @see ReservationStock#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ReservationStock#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ReservationStock#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see ReservationStock#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see ReservationStock#PROPERTY_RELEASED
     * 
     */
    public BigDecimal getReleased() {
        return (BigDecimal) get(PROPERTY_RELEASED);
    }
    /**
     * @see ReservationStock#PROPERTY_RELEASED
     * 
     */
    public void setReleased(BigDecimal released) {
        set(PROPERTY_RELEASED, released);
    }

}
