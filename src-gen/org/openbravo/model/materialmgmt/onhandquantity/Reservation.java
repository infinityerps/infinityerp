
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
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.AttributeSetInstance;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.materialmgmt.transaction.InternalMovementLine;
/**
 * Entity class for entity MaterialMgmtReservation (stored in table M_Reservation).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Reservation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Reservation";
    public static final String ENTITY_NAME = "MaterialMgmtReservation";

    /**
     * Property id stored in column M_Reservation_ID in table M_Reservation<br>
     * Help: {@literal The Reservation is the definition of a product reservation is set the owner, the quantity
     *       and the desired dimensions.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Reservation 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Reservation 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Reservation 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Reservation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Reservation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Reservation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Reservation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property product stored in column M_Product_ID in table M_Reservation<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property quantity stored in column Quantity in table M_Reservation 
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property uOM stored in column C_Uom_ID in table M_Reservation<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property salesOrderLine stored in column C_Orderline_ID in table M_Reservation<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property userContact stored in column AD_User_ID in table M_Reservation<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table M_Reservation<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Reservation<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property attributeSetValue stored in column M_Attributesetinstance_ID in table M_Reservation<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_Reservation<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property reservedQty stored in column Reservedqty in table M_Reservation<br>
     * Help: {@literal Represents the total quantity reserved to fulfill the reservation. It cannot be higher
     *       than the pending quantity.}
     * 
     */
    public static final String PROPERTY_RESERVEDQTY = "reservedQty";

    /**
     * Property released stored in column ReleasedQty in table M_Reservation<br>
     * Help: {@literal Quantity released from the reservation. For example once it has been shipped to the
     *       customer.}
     * 
     */
    public static final String PROPERTY_RELEASED = "released";

    /**
     * Property rESStatus stored in column RES_Status in table M_Reservation<br>
     * Help: {@literal Status of the reservation}
     * 
     */
    public static final String PROPERTY_RESSTATUS = "rESStatus";

    /**
     * Property rESProcess stored in column RES_Process in table M_Reservation<br>
     * Help: {@literal Button to process reservation}
     * 
     */
    public static final String PROPERTY_RESPROCESS = "rESProcess";

    /**
     * Property manageStock stored in column Managereservation_Pe in table M_Reservation<br>
     * Help: {@literal Manage Stock}
     * 
     */
    public static final String PROPERTY_MANAGESTOCK = "manageStock";

    /**
     * Property reservedgoodmntPe stored in column Reservedgoodmnt_Pe in table M_Reservation
     * 
     */
    public static final String PROPERTY_RESERVEDGOODMNTPE = "reservedgoodmntPe";

    /**
     * Property materialMgmtInternalMovementLineList stored in table M_Reservation
     * 
     */
    public static final String PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINELIST = "materialMgmtInternalMovementLineList";

    /**
     * Property materialMgmtReservationStockList stored in table M_Reservation
     * 
     */
    public static final String PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST = "materialMgmtReservationStockList";


    public Reservation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_RESSTATUS, "DR");
        setDefaultValue(PROPERTY_RESPROCESS, "PR");
        setDefaultValue(PROPERTY_MANAGESTOCK, false);
        setDefaultValue(PROPERTY_RESERVEDGOODMNTPE, false);
        setDefaultValue(PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Reservation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Reservation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Reservation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Reservation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Reservation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Reservation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Reservation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Reservation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Reservation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Reservation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Reservation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Reservation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Reservation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Reservation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Reservation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Reservation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Reservation#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see Reservation#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see Reservation#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see Reservation#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see Reservation#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see Reservation#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see Reservation#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see Reservation#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see Reservation#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see Reservation#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see Reservation#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Reservation#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Reservation#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see Reservation#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see Reservation#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see Reservation#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see Reservation#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see Reservation#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see Reservation#PROPERTY_RESERVEDQTY
     * 
     */
    public BigDecimal getReservedQty() {
        return (BigDecimal) get(PROPERTY_RESERVEDQTY);
    }
    /**
     * @see Reservation#PROPERTY_RESERVEDQTY
     * 
     */
    public void setReservedQty(BigDecimal reservedQty) {
        set(PROPERTY_RESERVEDQTY, reservedQty);
    }

    /**
     * @see Reservation#PROPERTY_RELEASED
     * 
     */
    public BigDecimal getReleased() {
        return (BigDecimal) get(PROPERTY_RELEASED);
    }
    /**
     * @see Reservation#PROPERTY_RELEASED
     * 
     */
    public void setReleased(BigDecimal released) {
        set(PROPERTY_RELEASED, released);
    }

    /**
     * @see Reservation#PROPERTY_RESSTATUS
     * 
     */
    public String getRESStatus() {
        return (String) get(PROPERTY_RESSTATUS);
    }
    /**
     * @see Reservation#PROPERTY_RESSTATUS
     * 
     */
    public void setRESStatus(String rESStatus) {
        set(PROPERTY_RESSTATUS, rESStatus);
    }

    /**
     * @see Reservation#PROPERTY_RESPROCESS
     * 
     */
    public String getRESProcess() {
        return (String) get(PROPERTY_RESPROCESS);
    }
    /**
     * @see Reservation#PROPERTY_RESPROCESS
     * 
     */
    public void setRESProcess(String rESProcess) {
        set(PROPERTY_RESPROCESS, rESProcess);
    }

    /**
     * @see Reservation#PROPERTY_MANAGESTOCK
     * 
     */
    public Boolean isManageStock() {
        return (Boolean) get(PROPERTY_MANAGESTOCK);
    }
    /**
     * @see Reservation#PROPERTY_MANAGESTOCK
     * 
     */
    public void setManageStock(Boolean manageStock) {
        set(PROPERTY_MANAGESTOCK, manageStock);
    }

    /**
     * @see Reservation#PROPERTY_RESERVEDGOODMNTPE
     * 
     */
    public Boolean isReservedgoodmntPe() {
        return (Boolean) get(PROPERTY_RESERVEDGOODMNTPE);
    }
    /**
     * @see Reservation#PROPERTY_RESERVEDGOODMNTPE
     * 
     */
    public void setReservedgoodmntPe(Boolean reservedgoodmntPe) {
        set(PROPERTY_RESERVEDGOODMNTPE, reservedgoodmntPe);
    }

    /**
     * Help: {@literal Contains the products and the quantities moved and the location it is moving from and to}<br>
     * @see InternalMovementLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InternalMovementLine> getMaterialMgmtInternalMovementLineList() {
      return (List<InternalMovementLine>) get(PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINELIST);
    }

    /**
     * Help: {@literal Contains the products and the quantities moved and the location it is moving from and to}<br>
     * @see InternalMovementLine
     * 
     */
    public void setMaterialMgmtInternalMovementLineList(List<InternalMovementLine> materialMgmtInternalMovementLineList) {
        set(PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINELIST, materialMgmtInternalMovementLineList);
    }

    /**
     * @see ReservationStock
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReservationStock> getMaterialMgmtReservationStockList() {
      return (List<ReservationStock>) get(PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST);
    }

    /**
     * @see ReservationStock
     * 
     */
    public void setMaterialMgmtReservationStockList(List<ReservationStock> materialMgmtReservationStockList) {
        set(PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST, materialMgmtReservationStockList);
    }

}
