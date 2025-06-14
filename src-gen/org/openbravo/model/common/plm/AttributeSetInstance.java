
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
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.manufacturing.quality.Case;
import org.openbravo.model.manufacturing.transaction.GlobalUse;
import org.openbravo.model.materialmgmt.onhandquantity.ProductStockView;
import org.openbravo.model.materialmgmt.onhandquantity.ReferencedInventory;
import org.openbravo.model.materialmgmt.onhandquantity.Reservation;
import org.openbravo.model.materialmgmt.onhandquantity.ReservationStock;
import org.openbravo.model.materialmgmt.onhandquantity.StorageDetail;
import org.openbravo.model.materialmgmt.onhandquantity.StoragePending;
import org.openbravo.model.materialmgmt.transaction.InternalConsumptionLine;
import org.openbravo.model.materialmgmt.transaction.InternalMovementLine;
import org.openbravo.model.materialmgmt.transaction.InventoryCountLine;
import org.openbravo.model.materialmgmt.transaction.MaterialTransaction;
import org.openbravo.model.materialmgmt.transaction.ProductionLine;
import org.openbravo.model.materialmgmt.transaction.ShipmentInOutLine;
import org.openbravo.model.procurement.RequisitionLine;
import org.openbravo.model.project.ProjectIssue;
/**
 * Entity class for entity AttributeSetInstance (stored in table M_AttributeSetInstance).
 * <br>
 * Help: {@literal Values for a individual instance of attributes}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AttributeSetInstance extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_AttributeSetInstance";
    public static final String ENTITY_NAME = "AttributeSetInstance";

    /**
     * Property id stored in column M_AttributeSetInstance_ID in table M_AttributeSetInstance<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_AttributeSetInstance 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_AttributeSetInstance 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_AttributeSetInstance 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_AttributeSetInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_AttributeSetInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_AttributeSetInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_AttributeSetInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property attributeSet stored in column M_AttributeSet_ID in table M_AttributeSetInstance<br>
     * Help: {@literal Define Product Attribute Sets to add additional attributes and values to the product. You
     *       need to define a Attribute Set if you want to enable Serial and Lot Number tracking.}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESET = "attributeSet";

    /**
     * Property serialNo stored in column SerNo in table M_AttributeSetInstance<br>
     * Help: {@literal The Serial Number identifies a tracked, warranted product.  It can only be used when the
     *       quantity is 1.}
     * 
     */
    public static final String PROPERTY_SERIALNO = "serialNo";

    /**
     * Property lotName stored in column Lot in table M_AttributeSetInstance<br>
     * Help: {@literal The Lot Number indicates the specific lot that a product was part of.}
     * 
     */
    public static final String PROPERTY_LOTNAME = "lotName";

    /**
     * Property expirationDate stored in column GuaranteeDate in table M_AttributeSetInstance<br>
     * Help: {@literal Date when the normal guarantee or availability expires}
     * 
     */
    public static final String PROPERTY_EXPIRATIONDATE = "expirationDate";

    /**
     * Property description stored in column Description in table M_AttributeSetInstance 
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property lot stored in column M_Lot_ID in table M_AttributeSetInstance<br>
     * Help: {@literal The individual Lot of a Product}
     * 
     */
    public static final String PROPERTY_LOT = "lot";

    /**
     * Property islocked stored in column Islocked in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_ISLOCKED = "islocked";

    /**
     * Property lockDescription stored in column Lock_Description in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_LOCKDESCRIPTION = "lockDescription";

    /**
     * Property referencedInventory stored in column M_RefInventory_ID in table M_AttributeSetInstance<br>
     * Help: {@literal ID for a Handling Unit}
     * 
     */
    public static final String PROPERTY_REFERENCEDINVENTORY = "referencedInventory";

    /**
     * Property parentAttributeSetInstance stored in column Parent_AttributeSetInstance_ID in table M_AttributeSetInstance<br>
     * Help: {@literal Attribute Set Instance from which this attribute set instance has been created from}
     * 
     */
    public static final String PROPERTY_PARENTATTRIBUTESETINSTANCE = "parentAttributeSetInstance";

    /**
     * Property attributeInstanceList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_ATTRIBUTEINSTANCELIST = "attributeInstanceList";

    /**
     * Property attributeSetInstanceParentAttributeSetInstanceIDList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETINSTANCEPARENTATTRIBUTESETINSTANCEIDLIST = "attributeSetInstanceParentAttributeSetInstanceIDList";

    /**
     * Property financialMgmtAssetList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTASSETLIST = "financialMgmtAssetList";

    /**
     * Property invoiceLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_INVOICELINELIST = "invoiceLineList";

    /**
     * Property manufacturingCaseList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MANUFACTURINGCASELIST = "manufacturingCaseList";

    /**
     * Property manufacturingGlobalUseList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MANUFACTURINGGLOBALUSELIST = "manufacturingGlobalUseList";

    /**
     * Property manufacturingProductionLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MANUFACTURINGPRODUCTIONLINELIST = "manufacturingProductionLineList";

    /**
     * Property materialMgmtInternalConsumptionLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTINTERNALCONSUMPTIONLINELIST = "materialMgmtInternalConsumptionLineList";

    /**
     * Property materialMgmtInternalMovementLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINELIST = "materialMgmtInternalMovementLineList";

    /**
     * Property materialMgmtInternalMovementLineMAttributeSetInstanceToIDList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINEMATTRIBUTESETINSTANCETOIDLIST = "materialMgmtInternalMovementLineMAttributeSetInstanceToIDList";

    /**
     * Property materialMgmtInventoryCountLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTINVENTORYCOUNTLINELIST = "materialMgmtInventoryCountLineList";

    /**
     * Property materialMgmtMaterialTransactionList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST = "materialMgmtMaterialTransactionList";

    /**
     * Property materialMgmtReservationList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTRESERVATIONLIST = "materialMgmtReservationList";

    /**
     * Property materialMgmtReservationStockList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST = "materialMgmtReservationStockList";

    /**
     * Property materialMgmtShipmentInOutLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST = "materialMgmtShipmentInOutLineList";

    /**
     * Property materialMgmtStorageDetailList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSTORAGEDETAILLIST = "materialMgmtStorageDetailList";

    /**
     * Property materialMgmtStoragePendingList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSTORAGEPENDINGLIST = "materialMgmtStoragePendingList";

    /**
     * Property orderLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_ORDERLINELIST = "orderLineList";

    /**
     * Property procurementRequisitionLineList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_PROCUREMENTREQUISITIONLINELIST = "procurementRequisitionLineList";

    /**
     * Property productList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_PRODUCTLIST = "productList";

    /**
     * Property productStockViewList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_PRODUCTSTOCKVIEWLIST = "productStockViewList";

    /**
     * Property projectIssueList stored in table M_AttributeSetInstance
     * 
     */
    public static final String PROPERTY_PROJECTISSUELIST = "projectIssueList";


    public AttributeSetInstance() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISLOCKED, false);
        setDefaultValue(PROPERTY_ATTRIBUTEINSTANCELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ATTRIBUTESETINSTANCEPARENTATTRIBUTESETINSTANCEIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTASSETLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGCASELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGGLOBALUSELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGPRODUCTIONLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTINTERNALCONSUMPTIONLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINEMATTRIBUTESETINSTANCETOIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTINVENTORYCOUNTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTRESERVATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTRESERVATIONSTOCKLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSTORAGEDETAILLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSTORAGEPENDINGLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTSTOCKVIEWLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTISSUELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AttributeSetInstance#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_ATTRIBUTESET
     * 
     */
    public AttributeSet getAttributeSet() {
        return (AttributeSet) get(PROPERTY_ATTRIBUTESET);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_ATTRIBUTESET
     * 
     */
    public void setAttributeSet(AttributeSet attributeSet) {
        set(PROPERTY_ATTRIBUTESET, attributeSet);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_SERIALNO
     * 
     */
    public String getSerialNo() {
        return (String) get(PROPERTY_SERIALNO);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_SERIALNO
     * 
     */
    public void setSerialNo(String serialNo) {
        set(PROPERTY_SERIALNO, serialNo);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_LOTNAME
     * 
     */
    public String getLotName() {
        return (String) get(PROPERTY_LOTNAME);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_LOTNAME
     * 
     */
    public void setLotName(String lotName) {
        set(PROPERTY_LOTNAME, lotName);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_EXPIRATIONDATE
     * 
     */
    public Date getExpirationDate() {
        return (Date) get(PROPERTY_EXPIRATIONDATE);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_EXPIRATIONDATE
     * 
     */
    public void setExpirationDate(Date expirationDate) {
        set(PROPERTY_EXPIRATIONDATE, expirationDate);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_LOT
     * 
     */
    public Lot getLot() {
        return (Lot) get(PROPERTY_LOT);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_LOT
     * 
     */
    public void setLot(Lot lot) {
        set(PROPERTY_LOT, lot);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_ISLOCKED
     * 
     */
    public Boolean isLocked() {
        return (Boolean) get(PROPERTY_ISLOCKED);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_ISLOCKED
     * 
     */
    public void setLocked(Boolean islocked) {
        set(PROPERTY_ISLOCKED, islocked);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_LOCKDESCRIPTION
     * 
     */
    public String getLockDescription() {
        return (String) get(PROPERTY_LOCKDESCRIPTION);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_LOCKDESCRIPTION
     * 
     */
    public void setLockDescription(String lockDescription) {
        set(PROPERTY_LOCKDESCRIPTION, lockDescription);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_REFERENCEDINVENTORY
     * 
     */
    public ReferencedInventory getReferencedInventory() {
        return (ReferencedInventory) get(PROPERTY_REFERENCEDINVENTORY);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_REFERENCEDINVENTORY
     * 
     */
    public void setReferencedInventory(ReferencedInventory referencedInventory) {
        set(PROPERTY_REFERENCEDINVENTORY, referencedInventory);
    }

    /**
     * @see AttributeSetInstance#PROPERTY_PARENTATTRIBUTESETINSTANCE
     * 
     */
    public AttributeSetInstance getParentAttributeSetInstance() {
        return (AttributeSetInstance) get(PROPERTY_PARENTATTRIBUTESETINSTANCE);
    }
    /**
     * @see AttributeSetInstance#PROPERTY_PARENTATTRIBUTESETINSTANCE
     * 
     */
    public void setParentAttributeSetInstance(AttributeSetInstance parentAttributeSetInstance) {
        set(PROPERTY_PARENTATTRIBUTESETINSTANCE, parentAttributeSetInstance);
    }

    /**
     * Help: {@literal Each of the values that an attribute has been set to.}<br>
     * @see AttributeInstance
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AttributeInstance> getAttributeInstanceList() {
      return (List<AttributeInstance>) get(PROPERTY_ATTRIBUTEINSTANCELIST);
    }

    /**
     * Help: {@literal Each of the values that an attribute has been set to.}<br>
     * @see AttributeInstance
     * 
     */
    public void setAttributeInstanceList(List<AttributeInstance> attributeInstanceList) {
        set(PROPERTY_ATTRIBUTEINSTANCELIST, attributeInstanceList);
    }

    /**
     * Help: {@literal Values for a individual instance of attributes}<br>
     * @see AttributeSetInstance
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AttributeSetInstance> getAttributeSetInstanceParentAttributeSetInstanceIDList() {
      return (List<AttributeSetInstance>) get(PROPERTY_ATTRIBUTESETINSTANCEPARENTATTRIBUTESETINSTANCEIDLIST);
    }

    /**
     * Help: {@literal Values for a individual instance of attributes}<br>
     * @see AttributeSetInstance
     * 
     */
    public void setAttributeSetInstanceParentAttributeSetInstanceIDList(List<AttributeSetInstance> attributeSetInstanceParentAttributeSetInstanceIDList) {
        set(PROPERTY_ATTRIBUTESETINSTANCEPARENTATTRIBUTESETINSTANCEIDLIST, attributeSetInstanceParentAttributeSetInstanceIDList);
    }

    /**
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}<br>
     * @see Asset
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Asset> getFinancialMgmtAssetList() {
      return (List<Asset>) get(PROPERTY_FINANCIALMGMTASSETLIST);
    }

    /**
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}<br>
     * @see Asset
     * 
     */
    public void setFinancialMgmtAssetList(List<Asset> financialMgmtAssetList) {
        set(PROPERTY_FINANCIALMGMTASSETLIST, financialMgmtAssetList);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceLine> getInvoiceLineList() {
      return (List<InvoiceLine>) get(PROPERTY_INVOICELINELIST);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    public void setInvoiceLineList(List<InvoiceLine> invoiceLineList) {
        set(PROPERTY_INVOICELINELIST, invoiceLineList);
    }

    /**
     * Help: {@literal This tab contains each periodic control realized.}<br>
     * @see Case
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Case> getManufacturingCaseList() {
      return (List<Case>) get(PROPERTY_MANUFACTURINGCASELIST);
    }

    /**
     * Help: {@literal This tab contains each periodic control realized.}<br>
     * @see Case
     * 
     */
    public void setManufacturingCaseList(List<Case> manufacturingCaseList) {
        set(PROPERTY_MANUFACTURINGCASELIST, manufacturingCaseList);
    }

    /**
     * Help: {@literal This tabs contains global consume products. When the work effort is processed the global
     *       use products are distributed proportionally.}<br>
     * @see GlobalUse
     * 
     */
    @SuppressWarnings("unchecked")
    public List<GlobalUse> getManufacturingGlobalUseList() {
      return (List<GlobalUse>) get(PROPERTY_MANUFACTURINGGLOBALUSELIST);
    }

    /**
     * Help: {@literal This tabs contains global consume products. When the work effort is processed the global
     *       use products are distributed proportionally.}<br>
     * @see GlobalUse
     * 
     */
    public void setManufacturingGlobalUseList(List<GlobalUse> manufacturingGlobalUseList) {
        set(PROPERTY_MANUFACTURINGGLOBALUSELIST, manufacturingGlobalUseList);
    }

    /**
     * Help: {@literal Contains all the products that have been used or created in the production run and the
     *       related quantities}<br>
     * @see ProductionLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductionLine> getManufacturingProductionLineList() {
      return (List<ProductionLine>) get(PROPERTY_MANUFACTURINGPRODUCTIONLINELIST);
    }

    /**
     * Help: {@literal Contains all the products that have been used or created in the production run and the
     *       related quantities}<br>
     * @see ProductionLine
     * 
     */
    public void setManufacturingProductionLineList(List<ProductionLine> manufacturingProductionLineList) {
        set(PROPERTY_MANUFACTURINGPRODUCTIONLINELIST, manufacturingProductionLineList);
    }

    /**
     * Help: {@literal The table defines the individual product that comprise an internal consumption line}<br>
     * @see InternalConsumptionLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InternalConsumptionLine> getMaterialMgmtInternalConsumptionLineList() {
      return (List<InternalConsumptionLine>) get(PROPERTY_MATERIALMGMTINTERNALCONSUMPTIONLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual product that comprise an internal consumption line}<br>
     * @see InternalConsumptionLine
     * 
     */
    public void setMaterialMgmtInternalConsumptionLineList(List<InternalConsumptionLine> materialMgmtInternalConsumptionLineList) {
        set(PROPERTY_MATERIALMGMTINTERNALCONSUMPTIONLINELIST, materialMgmtInternalConsumptionLineList);
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
     * Help: {@literal Contains the products and the quantities moved and the location it is moving from and to}<br>
     * @see InternalMovementLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InternalMovementLine> getMaterialMgmtInternalMovementLineMAttributeSetInstanceToIDList() {
      return (List<InternalMovementLine>) get(PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINEMATTRIBUTESETINSTANCETOIDLIST);
    }

    /**
     * Help: {@literal Contains the products and the quantities moved and the location it is moving from and to}<br>
     * @see InternalMovementLine
     * 
     */
    public void setMaterialMgmtInternalMovementLineMAttributeSetInstanceToIDList(List<InternalMovementLine> materialMgmtInternalMovementLineMAttributeSetInstanceToIDList) {
        set(PROPERTY_MATERIALMGMTINTERNALMOVEMENTLINEMATTRIBUTESETINSTANCETOIDLIST, materialMgmtInternalMovementLineMAttributeSetInstanceToIDList);
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

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MaterialTransaction> getMaterialMgmtMaterialTransactionList() {
      return (List<MaterialTransaction>) get(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST);
    }

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    public void setMaterialMgmtMaterialTransactionList(List<MaterialTransaction> materialMgmtMaterialTransactionList) {
        set(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, materialMgmtMaterialTransactionList);
    }

    /**
     * @see Reservation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Reservation> getMaterialMgmtReservationList() {
      return (List<Reservation>) get(PROPERTY_MATERIALMGMTRESERVATIONLIST);
    }

    /**
     * @see Reservation
     * 
     */
    public void setMaterialMgmtReservationList(List<Reservation> materialMgmtReservationList) {
        set(PROPERTY_MATERIALMGMTRESERVATIONLIST, materialMgmtReservationList);
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

    /**
     * Help: {@literal The table defines the individual line that comprise shipment line}<br>
     * @see ShipmentInOutLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ShipmentInOutLine> getMaterialMgmtShipmentInOutLineList() {
      return (List<ShipmentInOutLine>) get(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line that comprise shipment line}<br>
     * @see ShipmentInOutLine
     * 
     */
    public void setMaterialMgmtShipmentInOutLineList(List<ShipmentInOutLine> materialMgmtShipmentInOutLineList) {
        set(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST, materialMgmtShipmentInOutLineList);
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
     * Help: {@literal Contains the reserved quantity and  the ordered quantity}<br>
     * @see StoragePending
     * 
     */
    @SuppressWarnings("unchecked")
    public List<StoragePending> getMaterialMgmtStoragePendingList() {
      return (List<StoragePending>) get(PROPERTY_MATERIALMGMTSTORAGEPENDINGLIST);
    }

    /**
     * Help: {@literal Contains the reserved quantity and  the ordered quantity}<br>
     * @see StoragePending
     * 
     */
    public void setMaterialMgmtStoragePendingList(List<StoragePending> materialMgmtStoragePendingList) {
        set(PROPERTY_MATERIALMGMTSTORAGEPENDINGLIST, materialMgmtStoragePendingList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineList(List<OrderLine> orderLineList) {
        set(PROPERTY_ORDERLINELIST, orderLineList);
    }

    /**
     * Help: {@literal This table contains each product demand of a requisition. The demand is defined by a
     *       product, the date when is needed to have and the quantity. It is also possible to define a preferred
     *       vendor, price list and the correspondent prices. The demands are locked when are being used to
     *       generate the purchase orders so there are not created duplicate purchase orders for the same
     *       demand.}<br>
     * @see RequisitionLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RequisitionLine> getProcurementRequisitionLineList() {
      return (List<RequisitionLine>) get(PROPERTY_PROCUREMENTREQUISITIONLINELIST);
    }

    /**
     * Help: {@literal This table contains each product demand of a requisition. The demand is defined by a
     *       product, the date when is needed to have and the quantity. It is also possible to define a preferred
     *       vendor, price list and the correspondent prices. The demands are locked when are being used to
     *       generate the purchase orders so there are not created duplicate purchase orders for the same
     *       demand.}<br>
     * @see RequisitionLine
     * 
     */
    public void setProcurementRequisitionLineList(List<RequisitionLine> procurementRequisitionLineList) {
        set(PROPERTY_PROCUREMENTREQUISITIONLINELIST, procurementRequisitionLineList);
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

    /**
     * Help: {@literal Contains the available stock including an extra line for each product without stock
     *       information.}<br>
     * @see ProductStockView
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductStockView> getProductStockViewList() {
      return (List<ProductStockView>) get(PROPERTY_PRODUCTSTOCKVIEWLIST);
    }

    /**
     * Help: {@literal Contains the available stock including an extra line for each product without stock
     *       information.}<br>
     * @see ProductStockView
     * 
     */
    public void setProductStockViewList(List<ProductStockView> productStockViewList) {
        set(PROPERTY_PRODUCTSTOCKVIEWLIST, productStockViewList);
    }

    /**
     * Help: {@literal The lab lists the Issues to the project initiated by the "Issue to Project" process. You
     *       can issue Receipts, Time and Expenses, or Stock.}<br>
     * @see ProjectIssue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectIssue> getProjectIssueList() {
      return (List<ProjectIssue>) get(PROPERTY_PROJECTISSUELIST);
    }

    /**
     * Help: {@literal The lab lists the Issues to the project initiated by the "Issue to Project" process. You
     *       can issue Receipts, Time and Expenses, or Stock.}<br>
     * @see ProjectIssue
     * 
     */
    public void setProjectIssueList(List<ProjectIssue> projectIssueList) {
        set(PROPERTY_PROJECTISSUELIST, projectIssueList);
    }

}
