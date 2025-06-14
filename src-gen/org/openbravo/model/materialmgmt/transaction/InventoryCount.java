
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.materialmgmt.cost.CostingRuleInit;
import org.openbravo.model.materialmgmt.cost.InvAmtUpdLnInventories;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity MaterialMgmtInventoryCount (stored in table M_Inventory).
 * <br>
 * Help: {@literal Contains all the material transactions due to inventory}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InventoryCount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Inventory";
    public static final String ENTITY_NAME = "MaterialMgmtInventoryCount";

    /**
     * Property id stored in column M_Inventory_ID in table M_Inventory<br>
     * Help: {@literal The Physical Inventory indicates a unique parameters for a physical inventory.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Inventory 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Inventory 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Inventory 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Inventory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Inventory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Inventory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Inventory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Inventory 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Inventory<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Inventory<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property movementDate stored in column MovementDate in table M_Inventory<br>
     * Help: {@literal The Movement Date indicates the date that a product moved in or out of inventory.  This is
     *       the result of a shipment, receipt or inventory movement.}
     * 
     */
    public static final String PROPERTY_MOVEMENTDATE = "movementDate";

    /**
     * Property posted stored in column Posted in table M_Inventory<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property processed stored in column Processed in table M_Inventory<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property processNow stored in column Processing in table M_Inventory<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property updateQuantities stored in column UpdateQty in table M_Inventory<br>
     * Help: {@literal Update the quantities that has been changed into the original quantities. This only can do
     *       it before you process the inventory}
     * 
     */
    public static final String PROPERTY_UPDATEQUANTITIES = "updateQuantities";

    /**
     * Property generateList stored in column GenerateList in table M_Inventory<br>
     * Help: {@literal A button that generates a list to make an inventory of items}
     * 
     */
    public static final String PROPERTY_GENERATELIST = "generateList";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table M_Inventory<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property project stored in column C_Project_ID in table M_Inventory<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table M_Inventory<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table M_Inventory<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table M_Inventory<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table M_Inventory<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table M_Inventory<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property asset stored in column A_Asset_ID in table M_Inventory<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property inventoryType stored in column Inventory_Type in table M_Inventory<br>
     * Help: {@literal Defines the type of inventory being performed.}
     * 
     */
    public static final String PROPERTY_INVENTORYTYPE = "inventoryType";

    /**
     * Property documentNo stored in column DocumentNo in table M_Inventory 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property exportCsv stored in column ExportCsv in table M_Inventory<br>
     * Help: {@literal Physical inventory lines are exported to a CSV file in order to help with the counting
     *       process. The CSV file can be imported afterwards with the updated quantities.}
     * 
     */
    public static final String PROPERTY_EXPORTCSV = "exportCsv";

    /**
     * Property exportedCsvDate stored in column ExportedCsvDate in table M_Inventory<br>
     * Help: {@literal Date when the physical inventory csv was exported}
     * 
     */
    public static final String PROPERTY_EXPORTEDCSVDATE = "exportedCsvDate";

    /**
     * Property processDate stored in column ProcessDate in table M_Inventory<br>
     * Help: {@literal Date when the physical inventory was processed}
     * 
     */
    public static final String PROPERTY_PROCESSDATE = "processDate";

    /**
     * Property costingRuleInitCloseInventoryList stored in table M_Inventory
     * 
     */
    public static final String PROPERTY_COSTINGRULEINITCLOSEINVENTORYLIST = "costingRuleInitCloseInventoryList";

    /**
     * Property costingRuleInitInitInventoryList stored in table M_Inventory
     * 
     */
    public static final String PROPERTY_COSTINGRULEINITINITINVENTORYLIST = "costingRuleInitInitInventoryList";

    /**
     * Property inventoryAmountUpdateLineInventoriesCloseInventoryList stored in table M_Inventory
     * 
     */
    public static final String PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESCLOSEINVENTORYLIST = "inventoryAmountUpdateLineInventoriesCloseInventoryList";

    /**
     * Property inventoryAmountUpdateLineInventoriesInitInventoryList stored in table M_Inventory
     * 
     */
    public static final String PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESINITINVENTORYLIST = "inventoryAmountUpdateLineInventoriesInitInventoryList";

    /**
     * Property materialMgmtInventoryCountLineList stored in table M_Inventory
     * 
     */
    public static final String PROPERTY_MATERIALMGMTINVENTORYCOUNTLINELIST = "materialMgmtInventoryCountLineList";


    public InventoryCount() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_UPDATEQUANTITIES, false);
        setDefaultValue(PROPERTY_GENERATELIST, false);
        setDefaultValue(PROPERTY_INVENTORYTYPE, "N");
        setDefaultValue(PROPERTY_EXPORTCSV, false);
        setDefaultValue(PROPERTY_COSTINGRULEINITCLOSEINVENTORYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_COSTINGRULEINITINITINVENTORYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESCLOSEINVENTORYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESINITINVENTORYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTINVENTORYCOUNTLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InventoryCount#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InventoryCount#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InventoryCount#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InventoryCount#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InventoryCount#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InventoryCount#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InventoryCount#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InventoryCount#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InventoryCount#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InventoryCount#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InventoryCount#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InventoryCount#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InventoryCount#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InventoryCount#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InventoryCount#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InventoryCount#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InventoryCount#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see InventoryCount#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see InventoryCount#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see InventoryCount#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see InventoryCount#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see InventoryCount#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see InventoryCount#PROPERTY_MOVEMENTDATE
     * 
     */
    public Date getMovementDate() {
        return (Date) get(PROPERTY_MOVEMENTDATE);
    }
    /**
     * @see InventoryCount#PROPERTY_MOVEMENTDATE
     * 
     */
    public void setMovementDate(Date movementDate) {
        set(PROPERTY_MOVEMENTDATE, movementDate);
    }

    /**
     * @see InventoryCount#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see InventoryCount#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see InventoryCount#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see InventoryCount#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see InventoryCount#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see InventoryCount#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see InventoryCount#PROPERTY_UPDATEQUANTITIES
     * 
     */
    public Boolean isUpdateQuantities() {
        return (Boolean) get(PROPERTY_UPDATEQUANTITIES);
    }
    /**
     * @see InventoryCount#PROPERTY_UPDATEQUANTITIES
     * 
     */
    public void setUpdateQuantities(Boolean updateQuantities) {
        set(PROPERTY_UPDATEQUANTITIES, updateQuantities);
    }

    /**
     * @see InventoryCount#PROPERTY_GENERATELIST
     * 
     */
    public Boolean isGenerateList() {
        return (Boolean) get(PROPERTY_GENERATELIST);
    }
    /**
     * @see InventoryCount#PROPERTY_GENERATELIST
     * 
     */
    public void setGenerateList(Boolean generateList) {
        set(PROPERTY_GENERATELIST, generateList);
    }

    /**
     * @see InventoryCount#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see InventoryCount#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see InventoryCount#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see InventoryCount#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see InventoryCount#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see InventoryCount#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see InventoryCount#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see InventoryCount#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see InventoryCount#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see InventoryCount#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see InventoryCount#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see InventoryCount#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see InventoryCount#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see InventoryCount#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see InventoryCount#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see InventoryCount#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see InventoryCount#PROPERTY_INVENTORYTYPE
     * 
     */
    public String getInventoryType() {
        return (String) get(PROPERTY_INVENTORYTYPE);
    }
    /**
     * @see InventoryCount#PROPERTY_INVENTORYTYPE
     * 
     */
    public void setInventoryType(String inventoryType) {
        set(PROPERTY_INVENTORYTYPE, inventoryType);
    }

    /**
     * @see InventoryCount#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see InventoryCount#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see InventoryCount#PROPERTY_EXPORTCSV
     * 
     */
    public Boolean isExportCsv() {
        return (Boolean) get(PROPERTY_EXPORTCSV);
    }
    /**
     * @see InventoryCount#PROPERTY_EXPORTCSV
     * 
     */
    public void setExportCsv(Boolean exportCsv) {
        set(PROPERTY_EXPORTCSV, exportCsv);
    }

    /**
     * @see InventoryCount#PROPERTY_EXPORTEDCSVDATE
     * 
     */
    public Date getExportedCsvDate() {
        return (Date) get(PROPERTY_EXPORTEDCSVDATE);
    }
    /**
     * @see InventoryCount#PROPERTY_EXPORTEDCSVDATE
     * 
     */
    public void setExportedCsvDate(Date exportedCsvDate) {
        set(PROPERTY_EXPORTEDCSVDATE, exportedCsvDate);
    }

    /**
     * @see InventoryCount#PROPERTY_PROCESSDATE
     * 
     */
    public Date getProcessDate() {
        return (Date) get(PROPERTY_PROCESSDATE);
    }
    /**
     * @see InventoryCount#PROPERTY_PROCESSDATE
     * 
     */
    public void setProcessDate(Date processDate) {
        set(PROPERTY_PROCESSDATE, processDate);
    }

    /**
     * @see CostingRuleInit
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CostingRuleInit> getCostingRuleInitCloseInventoryList() {
      return (List<CostingRuleInit>) get(PROPERTY_COSTINGRULEINITCLOSEINVENTORYLIST);
    }

    /**
     * @see CostingRuleInit
     * 
     */
    public void setCostingRuleInitCloseInventoryList(List<CostingRuleInit> costingRuleInitCloseInventoryList) {
        set(PROPERTY_COSTINGRULEINITCLOSEINVENTORYLIST, costingRuleInitCloseInventoryList);
    }

    /**
     * @see CostingRuleInit
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CostingRuleInit> getCostingRuleInitInitInventoryList() {
      return (List<CostingRuleInit>) get(PROPERTY_COSTINGRULEINITINITINVENTORYLIST);
    }

    /**
     * @see CostingRuleInit
     * 
     */
    public void setCostingRuleInitInitInventoryList(List<CostingRuleInit> costingRuleInitInitInventoryList) {
        set(PROPERTY_COSTINGRULEINITINITINVENTORYLIST, costingRuleInitInitInventoryList);
    }

    /**
     * @see InvAmtUpdLnInventories
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvAmtUpdLnInventories> getInventoryAmountUpdateLineInventoriesCloseInventoryList() {
      return (List<InvAmtUpdLnInventories>) get(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESCLOSEINVENTORYLIST);
    }

    /**
     * @see InvAmtUpdLnInventories
     * 
     */
    public void setInventoryAmountUpdateLineInventoriesCloseInventoryList(List<InvAmtUpdLnInventories> inventoryAmountUpdateLineInventoriesCloseInventoryList) {
        set(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESCLOSEINVENTORYLIST, inventoryAmountUpdateLineInventoriesCloseInventoryList);
    }

    /**
     * @see InvAmtUpdLnInventories
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvAmtUpdLnInventories> getInventoryAmountUpdateLineInventoriesInitInventoryList() {
      return (List<InvAmtUpdLnInventories>) get(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESINITINVENTORYLIST);
    }

    /**
     * @see InvAmtUpdLnInventories
     * 
     */
    public void setInventoryAmountUpdateLineInventoriesInitInventoryList(List<InvAmtUpdLnInventories> inventoryAmountUpdateLineInventoriesInitInventoryList) {
        set(PROPERTY_INVENTORYAMOUNTUPDATELINEINVENTORIESINITINVENTORYLIST, inventoryAmountUpdateLineInventoriesInitInventoryList);
    }

    /**
     * Help: {@literal Contains the counts of the individual products in inventory}<br>
     * @see InventoryCountLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InventoryCountLine> getMaterialMgmtInventoryCountLineList() {
      return (List<InventoryCountLine>) get(PROPERTY_MATERIALMGMTINVENTORYCOUNTLINELIST);
    }

    /**
     * Help: {@literal Contains the counts of the individual products in inventory}<br>
     * @see InventoryCountLine
     * 
     */
    public void setMaterialMgmtInventoryCountLineList(List<InventoryCountLine> materialMgmtInventoryCountLineList) {
        set(PROPERTY_MATERIALMGMTINVENTORYCOUNTLINELIST, materialMgmtInventoryCountLineList);
    }

}
