
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
package org.openbravo.model.common.enterprise;

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
import org.openbravo.model.common.geography.Location;
/**
 * Entity class for entity Warehouse (stored in table M_Warehouse).
 * <br>
 * Help: {@literal Warehouse defines each Warehouse that is used to store products.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Warehouse extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Warehouse";
    public static final String ENTITY_NAME = "Warehouse";

    /**
     * Property id stored in column M_Warehouse_ID in table M_Warehouse<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Warehouse 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Warehouse 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Warehouse 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Warehouse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Warehouse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Warehouse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Warehouse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table M_Warehouse<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table M_Warehouse 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Warehouse<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property locationAddress stored in column C_Location_ID in table M_Warehouse<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_LOCATIONADDRESS = "locationAddress";

    /**
     * Property storageBinSeparator stored in column Separator in table M_Warehouse<br>
     * Help: {@literal The Element Separator defines the delimiter printed between elements of the structure}
     * 
     */
    public static final String PROPERTY_STORAGEBINSEPARATOR = "storageBinSeparator";

    /**
     * Property shipmentVehicle stored in column IsShipper in table M_Warehouse<br>
     * Help: {@literal This check indicates if the warehouse is a van that can receive and serve orders.}
     * 
     */
    public static final String PROPERTY_SHIPMENTVEHICLE = "shipmentVehicle";

    /**
     * Property shipperCode stored in column Shippercode in table M_Warehouse<br>
     * Help: {@literal If warehouse is shipper type this code identifies the terminal in the van.}
     * 
     */
    public static final String PROPERTY_SHIPPERCODE = "shipperCode";

    /**
     * Property fromDocumentNo stored in column FromDocumentNo in table M_Warehouse<br>
     * Help: {@literal If warehouse is shipper type this field is the lowest range for the document numbers used
     *       by the terminal.}
     * 
     */
    public static final String PROPERTY_FROMDOCUMENTNO = "fromDocumentNo";

    /**
     * Property toDocumentNo stored in column ToDocumentNo in table M_Warehouse<br>
     * Help: {@literal If warehouse is shipper type this field is the highest range for the document numbers used
     *       by the terminal.}
     * 
     */
    public static final String PROPERTY_TODOCUMENTNO = "toDocumentNo";

    /**
     * Property returnlocator stored in column M_Returnlocator_ID in table M_Warehouse<br>
     * Help: {@literal Bin designated for returns.}
     * 
     */
    public static final String PROPERTY_RETURNLOCATOR = "returnlocator";

    /**
     * Property warehouseRule stored in column M_Warehouse_Rule_ID in table M_Warehouse<br>
     * Help: {@literal Definition of a Warehouse Rule to be applied when getting stock from the warehouse.}
     * 
     */
    public static final String PROPERTY_WAREHOUSERULE = "warehouseRule";

    /**
     * Property allocated stored in column Isallocated in table M_Warehouse<br>
     * Help: {@literal An Allocated Reservation Stock means that the referenced stock and quantity can only be
     *       used to fulfill this Reservation.}
     * 
     */
    public static final String PROPERTY_ALLOCATED = "allocated";

    /**
     * Property aDUserDefaultWarehouseList stored in table M_Warehouse
     * 
     */
    public static final String PROPERTY_ADUSERDEFAULTWAREHOUSELIST = "aDUserDefaultWarehouseList";

    /**
     * Property locatorList stored in table M_Warehouse
     * 
     */
    public static final String PROPERTY_LOCATORLIST = "locatorList";

    /**
     * Property organizationWarehouseList stored in table M_Warehouse
     * 
     */
    public static final String PROPERTY_ORGANIZATIONWAREHOUSELIST = "organizationWarehouseList";

    /**
     * Property warehouseAccountsList stored in table M_Warehouse
     * 
     */
    public static final String PROPERTY_WAREHOUSEACCOUNTSLIST = "warehouseAccountsList";

    /**
     * Property warehouseShipperList stored in table M_Warehouse
     * 
     */
    public static final String PROPERTY_WAREHOUSESHIPPERLIST = "warehouseShipperList";


    public Warehouse() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_STORAGEBINSEPARATOR, "*");
        setDefaultValue(PROPERTY_SHIPMENTVEHICLE, false);
        setDefaultValue(PROPERTY_ALLOCATED, false);
        setDefaultValue(PROPERTY_ADUSERDEFAULTWAREHOUSELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_LOCATORLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORGANIZATIONWAREHOUSELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_WAREHOUSEACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_WAREHOUSESHIPPERLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Warehouse#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Warehouse#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Warehouse#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Warehouse#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Warehouse#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Warehouse#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Warehouse#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Warehouse#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Warehouse#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Warehouse#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Warehouse#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Warehouse#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Warehouse#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Warehouse#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Warehouse#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Warehouse#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Warehouse#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Warehouse#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Warehouse#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Warehouse#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Warehouse#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Warehouse#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Warehouse#PROPERTY_LOCATIONADDRESS
     * 
     */
    public Location getLocationAddress() {
        return (Location) get(PROPERTY_LOCATIONADDRESS);
    }
    /**
     * @see Warehouse#PROPERTY_LOCATIONADDRESS
     * 
     */
    public void setLocationAddress(Location locationAddress) {
        set(PROPERTY_LOCATIONADDRESS, locationAddress);
    }

    /**
     * @see Warehouse#PROPERTY_STORAGEBINSEPARATOR
     * 
     */
    public String getStorageBinSeparator() {
        return (String) get(PROPERTY_STORAGEBINSEPARATOR);
    }
    /**
     * @see Warehouse#PROPERTY_STORAGEBINSEPARATOR
     * 
     */
    public void setStorageBinSeparator(String storageBinSeparator) {
        set(PROPERTY_STORAGEBINSEPARATOR, storageBinSeparator);
    }

    /**
     * @see Warehouse#PROPERTY_SHIPMENTVEHICLE
     * 
     */
    public Boolean isShipmentVehicle() {
        return (Boolean) get(PROPERTY_SHIPMENTVEHICLE);
    }
    /**
     * @see Warehouse#PROPERTY_SHIPMENTVEHICLE
     * 
     */
    public void setShipmentVehicle(Boolean shipmentVehicle) {
        set(PROPERTY_SHIPMENTVEHICLE, shipmentVehicle);
    }

    /**
     * @see Warehouse#PROPERTY_SHIPPERCODE
     * 
     */
    public String getShipperCode() {
        return (String) get(PROPERTY_SHIPPERCODE);
    }
    /**
     * @see Warehouse#PROPERTY_SHIPPERCODE
     * 
     */
    public void setShipperCode(String shipperCode) {
        set(PROPERTY_SHIPPERCODE, shipperCode);
    }

    /**
     * @see Warehouse#PROPERTY_FROMDOCUMENTNO
     * 
     */
    public Long getFromDocumentNo() {
        return (Long) get(PROPERTY_FROMDOCUMENTNO);
    }
    /**
     * @see Warehouse#PROPERTY_FROMDOCUMENTNO
     * 
     */
    public void setFromDocumentNo(Long fromDocumentNo) {
        set(PROPERTY_FROMDOCUMENTNO, fromDocumentNo);
    }

    /**
     * @see Warehouse#PROPERTY_TODOCUMENTNO
     * 
     */
    public Long getToDocumentNo() {
        return (Long) get(PROPERTY_TODOCUMENTNO);
    }
    /**
     * @see Warehouse#PROPERTY_TODOCUMENTNO
     * 
     */
    public void setToDocumentNo(Long toDocumentNo) {
        set(PROPERTY_TODOCUMENTNO, toDocumentNo);
    }

    /**
     * @see Warehouse#PROPERTY_RETURNLOCATOR
     * 
     */
    public Locator getReturnlocator() {
        return (Locator) get(PROPERTY_RETURNLOCATOR);
    }
    /**
     * @see Warehouse#PROPERTY_RETURNLOCATOR
     * 
     */
    public void setReturnlocator(Locator returnlocator) {
        set(PROPERTY_RETURNLOCATOR, returnlocator);
    }

    /**
     * @see Warehouse#PROPERTY_WAREHOUSERULE
     * 
     */
    public WarehouseRule getWarehouseRule() {
        return (WarehouseRule) get(PROPERTY_WAREHOUSERULE);
    }
    /**
     * @see Warehouse#PROPERTY_WAREHOUSERULE
     * 
     */
    public void setWarehouseRule(WarehouseRule warehouseRule) {
        set(PROPERTY_WAREHOUSERULE, warehouseRule);
    }

    /**
     * @see Warehouse#PROPERTY_ALLOCATED
     * 
     */
    public Boolean isAllocated() {
        return (Boolean) get(PROPERTY_ALLOCATED);
    }
    /**
     * @see Warehouse#PROPERTY_ALLOCATED
     * 
     */
    public void setAllocated(Boolean allocated) {
        set(PROPERTY_ALLOCATED, allocated);
    }

    /**
     * Help: {@literal The User Tab defines the log in for Users who have access to the system.
     *       The User
     *       identifies a unique user in the system. This could be an internal user or a business partner
     *       contact}<br>
     * @see User
     * 
     */
    @SuppressWarnings("unchecked")
    public List<User> getADUserDefaultWarehouseList() {
      return (List<User>) get(PROPERTY_ADUSERDEFAULTWAREHOUSELIST);
    }

    /**
     * Help: {@literal The User Tab defines the log in for Users who have access to the system.
     *       The User
     *       identifies a unique user in the system. This could be an internal user or a business partner
     *       contact}<br>
     * @see User
     * 
     */
    public void setADUserDefaultWarehouseList(List<User> aDUserDefaultWarehouseList) {
        set(PROPERTY_ADUSERDEFAULTWAREHOUSELIST, aDUserDefaultWarehouseList);
    }

    /**
     * Help: {@literal The Locator defines any Locators for that Warehouse.}<br>
     * @see Locator
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Locator> getLocatorList() {
      return (List<Locator>) get(PROPERTY_LOCATORLIST);
    }

    /**
     * Help: {@literal The Locator defines any Locators for that Warehouse.}<br>
     * @see Locator
     * 
     */
    public void setLocatorList(List<Locator> locatorList) {
        set(PROPERTY_LOCATORLIST, locatorList);
    }

    /**
     * Help: {@literal Defines the on-hand warehouses of an Organization and its usage priority.}<br>
     * @see OrgWarehouse
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrgWarehouse> getOrganizationWarehouseList() {
      return (List<OrgWarehouse>) get(PROPERTY_ORGANIZATIONWAREHOUSELIST);
    }

    /**
     * Help: {@literal Defines the on-hand warehouses of an Organization and its usage priority.}<br>
     * @see OrgWarehouse
     * 
     */
    public void setOrganizationWarehouseList(List<OrgWarehouse> organizationWarehouseList) {
        set(PROPERTY_ORGANIZATIONWAREHOUSELIST, organizationWarehouseList);
    }

    /**
     * Help: {@literal Defines the Accounting parameters to be used for inventory in that Warehouse.}<br>
     * @see WarehouseAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WarehouseAccounts> getWarehouseAccountsList() {
      return (List<WarehouseAccounts>) get(PROPERTY_WAREHOUSEACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the Accounting parameters to be used for inventory in that Warehouse.}<br>
     * @see WarehouseAccounts
     * 
     */
    public void setWarehouseAccountsList(List<WarehouseAccounts> warehouseAccountsList) {
        set(PROPERTY_WAREHOUSEACCOUNTSLIST, warehouseAccountsList);
    }

    /**
     * Help: {@literal This table defines shipper path tracks. Each mobile warehouse has a particular track.}<br>
     * @see WarehouseShipper
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WarehouseShipper> getWarehouseShipperList() {
      return (List<WarehouseShipper>) get(PROPERTY_WAREHOUSESHIPPERLIST);
    }

    /**
     * Help: {@literal This table defines shipper path tracks. Each mobile warehouse has a particular track.}<br>
     * @see WarehouseShipper
     * 
     */
    public void setWarehouseShipperList(List<WarehouseShipper> warehouseShipperList) {
        set(PROPERTY_WAREHOUSESHIPPERLIST, warehouseShipperList);
    }

}
