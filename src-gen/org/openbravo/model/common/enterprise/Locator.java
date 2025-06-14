
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
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.materialmgmt.onhandquantity.InventoryStatus;
import org.openbravo.model.materialmgmt.onhandquantity.StorageDetail;
/**
 * Entity class for entity Locator (stored in table M_Locator).
 * <br>
 * Help: {@literal The Locator defines any Locators for that Warehouse.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Locator extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Locator";
    public static final String ENTITY_NAME = "Locator";

    /**
     * Property id stored in column M_Locator_ID in table M_Locator<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Locator 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Locator 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Locator 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Locator 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Locator 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Locator 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Locator 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table M_Locator 
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Locator<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property relativePriority stored in column PriorityNo in table M_Locator<br>
     * Help: {@literal The Relative Priority indicates the location to pick from first if an product is stored in
     *       more than one location.  (0 = highest priority)}
     * 
     */
    public static final String PROPERTY_RELATIVEPRIORITY = "relativePriority";

    /**
     * Property default stored in column IsDefault in table M_Locator<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property rowX stored in column X in table M_Locator<br>
     * Help: {@literal The X dimension indicates the Aisle a product is located in.}
     * 
     */
    public static final String PROPERTY_ROWX = "rowX";

    /**
     * Property stackY stored in column Y in table M_Locator<br>
     * Help: {@literal The Y dimension indicates the Bin a product is located in}
     * 
     */
    public static final String PROPERTY_STACKY = "stackY";

    /**
     * Property levelZ stored in column Z in table M_Locator<br>
     * Help: {@literal The Z dimension indicates the Level a product is located in.}
     * 
     */
    public static final String PROPERTY_LEVELZ = "levelZ";

    /**
     * Property barcode stored in column Barcode in table M_Locator<br>
     * Help: {@literal Barcode to identify this item.}
     * 
     */
    public static final String PROPERTY_BARCODE = "barcode";

    /**
     * Property inventoryStatus stored in column M_InventoryStatus_ID in table M_Locator<br>
     * Help: {@literal The inventory status refers to the condition of a specific inventory (such as AVAILABLE,
     *       RETURN, DEFECT, TRANSIT) that is stored in a specific organization, warehouse and bin and for a
     *       product with a specific lot/serial and quantity. The inventory status can allow or disallow certain
     *       business processes.}
     * 
     */
    public static final String PROPERTY_INVENTORYSTATUS = "inventoryStatus";

    /**
     * Property changeStatus stored in column Change_Status in table M_Locator
     * 
     */
    public static final String PROPERTY_CHANGESTATUS = "changeStatus";

    /**
     * Property isvirtual stored in column Isvirtual in table M_Locator
     * 
     */
    public static final String PROPERTY_ISVIRTUAL = "isvirtual";

    /**
     * Property parentLocator stored in column Parent_Locator_ID in table M_Locator
     * 
     */
    public static final String PROPERTY_PARENTLOCATOR = "parentLocator";

    /**
     * Property materialMgmtStorageDetailList stored in table M_Locator
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSTORAGEDETAILLIST = "materialMgmtStorageDetailList";

    /**
     * Property productList stored in table M_Locator
     * 
     */
    public static final String PROPERTY_PRODUCTLIST = "productList";


    public Locator() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RELATIVEPRIORITY, (long) 50);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_CHANGESTATUS, false);
        setDefaultValue(PROPERTY_ISVIRTUAL, false);
        setDefaultValue(PROPERTY_MATERIALMGMTSTORAGEDETAILLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Locator#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Locator#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Locator#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Locator#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Locator#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Locator#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Locator#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Locator#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Locator#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Locator#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Locator#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Locator#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Locator#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Locator#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Locator#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Locator#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Locator#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Locator#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Locator#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see Locator#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see Locator#PROPERTY_RELATIVEPRIORITY
     * 
     */
    public Long getRelativePriority() {
        return (Long) get(PROPERTY_RELATIVEPRIORITY);
    }
    /**
     * @see Locator#PROPERTY_RELATIVEPRIORITY
     * 
     */
    public void setRelativePriority(Long relativePriority) {
        set(PROPERTY_RELATIVEPRIORITY, relativePriority);
    }

    /**
     * @see Locator#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see Locator#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see Locator#PROPERTY_ROWX
     * 
     */
    public String getRowX() {
        return (String) get(PROPERTY_ROWX);
    }
    /**
     * @see Locator#PROPERTY_ROWX
     * 
     */
    public void setRowX(String rowX) {
        set(PROPERTY_ROWX, rowX);
    }

    /**
     * @see Locator#PROPERTY_STACKY
     * 
     */
    public String getStackY() {
        return (String) get(PROPERTY_STACKY);
    }
    /**
     * @see Locator#PROPERTY_STACKY
     * 
     */
    public void setStackY(String stackY) {
        set(PROPERTY_STACKY, stackY);
    }

    /**
     * @see Locator#PROPERTY_LEVELZ
     * 
     */
    public String getLevelZ() {
        return (String) get(PROPERTY_LEVELZ);
    }
    /**
     * @see Locator#PROPERTY_LEVELZ
     * 
     */
    public void setLevelZ(String levelZ) {
        set(PROPERTY_LEVELZ, levelZ);
    }

    /**
     * @see Locator#PROPERTY_BARCODE
     * 
     */
    public String getBarcode() {
        return (String) get(PROPERTY_BARCODE);
    }
    /**
     * @see Locator#PROPERTY_BARCODE
     * 
     */
    public void setBarcode(String barcode) {
        set(PROPERTY_BARCODE, barcode);
    }

    /**
     * @see Locator#PROPERTY_INVENTORYSTATUS
     * 
     */
    public InventoryStatus getInventoryStatus() {
        return (InventoryStatus) get(PROPERTY_INVENTORYSTATUS);
    }
    /**
     * @see Locator#PROPERTY_INVENTORYSTATUS
     * 
     */
    public void setInventoryStatus(InventoryStatus inventoryStatus) {
        set(PROPERTY_INVENTORYSTATUS, inventoryStatus);
    }

    /**
     * @see Locator#PROPERTY_CHANGESTATUS
     * 
     */
    public Boolean isChangeStatus() {
        return (Boolean) get(PROPERTY_CHANGESTATUS);
    }
    /**
     * @see Locator#PROPERTY_CHANGESTATUS
     * 
     */
    public void setChangeStatus(Boolean changeStatus) {
        set(PROPERTY_CHANGESTATUS, changeStatus);
    }

    /**
     * @see Locator#PROPERTY_ISVIRTUAL
     * 
     */
    public Boolean isVirtual() {
        return (Boolean) get(PROPERTY_ISVIRTUAL);
    }
    /**
     * @see Locator#PROPERTY_ISVIRTUAL
     * 
     */
    public void setVirtual(Boolean isvirtual) {
        set(PROPERTY_ISVIRTUAL, isvirtual);
    }

    /**
     * @see Locator#PROPERTY_PARENTLOCATOR
     * 
     */
    public Locator getParentLocator() {
        return (Locator) get(PROPERTY_PARENTLOCATOR);
    }
    /**
     * @see Locator#PROPERTY_PARENTLOCATOR
     * 
     */
    public void setParentLocator(Locator parentLocator) {
        set(PROPERTY_PARENTLOCATOR, parentLocator);
    }

    /**
     * Help: {@literal Containts the  current stock for every product}<br>
     * @see StorageDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<StorageDetail> getMaterialMgmtStorageDetailList() {
      return (List<StorageDetail>) get(PROPERTY_MATERIALMGMTSTORAGEDETAILLIST);
    }

    /**
     * Help: {@literal Containts the  current stock for every product}<br>
     * @see StorageDetail
     * 
     */
    public void setMaterialMgmtStorageDetailList(List<StorageDetail> materialMgmtStorageDetailList) {
        set(PROPERTY_MATERIALMGMTSTORAGEDETAILLIST, materialMgmtStorageDetailList);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Product> getProductList() {
      return (List<Product>) get(PROPERTY_PRODUCTLIST);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    public void setProductList(List<Product> productList) {
        set(PROPERTY_PRODUCTLIST, productList);
    }

}
