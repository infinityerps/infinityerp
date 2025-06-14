
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
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.common.order.Order;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.gl.GLCharge;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.materialmgmt.cost.LandedCostCost;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.ConditionGoods;
import org.openbravo.model.shipping.FreightCategory;
import org.openbravo.model.shipping.ShippingCompany;
/**
 * Entity class for entity MaterialMgmtShipmentInOut (stored in table M_InOut).
 * <br>
 * Help: {@literal Contains all the material transaction due to business partner shipments}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ShipmentInOut extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_InOut";
    public static final String ENTITY_NAME = "MaterialMgmtShipmentInOut";

    /**
     * Property id stored in column M_InOut_ID in table M_InOut<br>
     * Help: {@literal The Shipment ID indicates the unique document for this shipment.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_InOut 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_InOut 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_InOut 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_InOut 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_InOut 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_InOut 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_InOut 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property salesTransaction stored in column IsSOTrx in table M_InOut<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property documentNo stored in column DocumentNo in table M_InOut 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property documentAction stored in column DocAction in table M_InOut<br>
     * Help: {@literal 
     *       You find the current status in the Document Status field. The options are listed in a
     *       popup}
     * 
     */
    public static final String PROPERTY_DOCUMENTACTION = "documentAction";

    /**
     * Property documentStatus stored in column DocStatus in table M_InOut<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property posted stored in column Posted in table M_InOut<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property processNow stored in column Processing in table M_InOut<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table M_InOut<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property documentType stored in column C_DocType_ID in table M_InOut<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property description stored in column Description in table M_InOut<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property salesOrder stored in column C_Order_ID in table M_InOut<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property orderDate stored in column DateOrdered in table M_InOut<br>
     * Help: {@literal Indicates the Date an item was ordered.}
     * 
     */
    public static final String PROPERTY_ORDERDATE = "orderDate";

    /**
     * Property print stored in column IsPrinted in table M_InOut<br>
     * Help: {@literal The Printed checkbox indicates if this document or line will included when printing.}
     * 
     */
    public static final String PROPERTY_PRINT = "print";

    /**
     * Property movementType stored in column MovementType in table M_InOut<br>
     * Help: {@literal The Movement Type indicates the type of movement (in, out, to production, etc)}
     * 
     */
    public static final String PROPERTY_MOVEMENTTYPE = "movementType";

    /**
     * Property movementDate stored in column MovementDate in table M_InOut 
     * 
     */
    public static final String PROPERTY_MOVEMENTDATE = "movementDate";

    /**
     * Property accountingDate stored in column DateAcct in table M_InOut<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table M_InOut<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table M_InOut<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_InOut<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property orderReference stored in column POReference in table M_InOut<br>
     * Help: {@literal This can be used to input a reference for this specific transaction. For example, a
     *       Purchase Order number can be input on a Sales Order for easier reference.}
     * 
     */
    public static final String PROPERTY_ORDERREFERENCE = "orderReference";

    /**
     * Property deliveryTerms stored in column DeliveryRule in table M_InOut<br>
     * Help: {@literal The Delivery Rule indicates when an order should be delivered. For example should the
     *       order be delivered when the entire order is complete, when a line is complete or as the products
     *       become available.}
     * 
     */
    public static final String PROPERTY_DELIVERYTERMS = "deliveryTerms";

    /**
     * Property freightCostRule stored in column FreightCostRule in table M_InOut<br>
     * Help: {@literal The Freight Cost Rule indicates the method used when charging for freight.}
     * 
     */
    public static final String PROPERTY_FREIGHTCOSTRULE = "freightCostRule";

    /**
     * Property freightAmount stored in column FreightAmt in table M_InOut<br>
     * Help: {@literal The Freight Amount indicates the amount charged for Freight in the document currency.}
     * 
     */
    public static final String PROPERTY_FREIGHTAMOUNT = "freightAmount";

    /**
     * Property deliveryMethod stored in column DeliveryViaRule in table M_InOut<br>
     * Help: {@literal The Delivery Via indicates how the products should be delivered. For example, will the
     *       order be picked up or shipped.}
     * 
     */
    public static final String PROPERTY_DELIVERYMETHOD = "deliveryMethod";

    /**
     * Property shippingCompany stored in column M_Shipper_ID in table M_InOut<br>
     * Help: {@literal The Shipper is any entity which will provide shipping to or shipping from an
     *       Organization.}
     * 
     */
    public static final String PROPERTY_SHIPPINGCOMPANY = "shippingCompany";

    /**
     * Property charge stored in column C_Charge_ID in table M_InOut<br>
     * Help: {@literal The Charge indicates a type of Charge (Handling, Shipping, Restocking)}
     * 
     */
    public static final String PROPERTY_CHARGE = "charge";

    /**
     * Property chargeAmount stored in column ChargeAmt in table M_InOut<br>
     * Help: {@literal The Charge Amount indicates the amount for an additional charge.}
     * 
     */
    public static final String PROPERTY_CHARGEAMOUNT = "chargeAmount";

    /**
     * Property priority stored in column PriorityRule in table M_InOut<br>
     * Help: {@literal The Priority indicates the importance (high, medium, low) of this document}
     * 
     */
    public static final String PROPERTY_PRIORITY = "priority";

    /**
     * Property datePrinted stored in column DatePrinted in table M_InOut<br>
     * Help: {@literal Indicates the Date that a document was printed.}
     * 
     */
    public static final String PROPERTY_DATEPRINTED = "datePrinted";

    /**
     * Property invoice stored in column C_Invoice_ID in table M_InOut<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property createLinesFrom stored in column CreateFrom in table M_InOut<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example, in case of entering a new Goods Shipment, the
     *       user can copy lines (products) from an existing Sales Order or Sales Invoice.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROM = "createLinesFrom";

    /**
     * Property generateTo stored in column GenerateTo in table M_InOut<br>
     * Help: {@literal A button that creates documents}
     * 
     */
    public static final String PROPERTY_GENERATETO = "generateTo";

    /**
     * Property userContact stored in column AD_User_ID in table M_InOut<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table M_InOut<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property numberOfPackages stored in column NoPackages in table M_InOut<br>
     * Help: {@literal The number of packages being shipped.}
     * 
     */
    public static final String PROPERTY_NUMBEROFPACKAGES = "numberOfPackages";

    /**
     * Property pickDate stored in column PickDate in table M_InOut<br>
     * Help: {@literal Date/Time when picked for Shipment}
     * 
     */
    public static final String PROPERTY_PICKDATE = "pickDate";

    /**
     * Property shipDate stored in column ShipDate in table M_InOut<br>
     * Help: {@literal Actual Date/Time of Shipment (pick up)}
     * 
     */
    public static final String PROPERTY_SHIPDATE = "shipDate";

    /**
     * Property trackingNo stored in column TrackingNo in table M_InOut<br>
     * Help: {@literal Number to track the shipment}
     * 
     */
    public static final String PROPERTY_TRACKINGNO = "trackingNo";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table M_InOut<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property project stored in column C_Project_ID in table M_InOut<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table M_InOut<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table M_InOut<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table M_InOut<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table M_InOut<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property updateLines stored in column UpdateLines in table M_InOut<br>
     * Help: {@literal Update attribute lines from shipment}
     * 
     */
    public static final String PROPERTY_UPDATELINES = "updateLines";

    /**
     * Property logistic stored in column Islogistic in table M_InOut<br>
     * Help: {@literal If is logistic it won't be invoiced. It uses for companies that rent locators or incoming
     *       materials that we don't want to invoice}
     * 
     */
    public static final String PROPERTY_LOGISTIC = "logistic";

    /**
     * Property calculateFreight stored in column Calculate_Freight in table M_InOut<br>
     * Help: {@literal Calculate freight cost}
     * 
     */
    public static final String PROPERTY_CALCULATEFREIGHT = "calculateFreight";

    /**
     * Property deliveryLocation stored in column Delivery_Location_ID in table M_InOut<br>
     * Help: {@literal Location where the product will be delivered to}
     * 
     */
    public static final String PROPERTY_DELIVERYLOCATION = "deliveryLocation";

    /**
     * Property freightCategory stored in column M_FreightCategory_ID in table M_InOut<br>
     * Help: {@literal Freight Categories are used to calculate the Freight for the Shipper selected}
     * 
     */
    public static final String PROPERTY_FREIGHTCATEGORY = "freightCategory";

    /**
     * Property freightCurrency stored in column Freight_Currency_ID in table M_InOut<br>
     * Help: {@literal Indicates the currency of the freight amount when it is calculated.}
     * 
     */
    public static final String PROPERTY_FREIGHTCURRENCY = "freightCurrency";

    /**
     * Property receiveMaterials stored in column RM_Receipt_PickEdit in table M_InOut
     * 
     */
    public static final String PROPERTY_RECEIVEMATERIALS = "receiveMaterials";

    /**
     * Property sendMaterials stored in column RM_Shipment_Pickedit in table M_InOut
     * 
     */
    public static final String PROPERTY_SENDMATERIALS = "sendMaterials";

    /**
     * Property conditionGoods stored in column M_Condition_Goods_ID in table M_InOut
     * 
     */
    public static final String PROPERTY_CONDITIONGOODS = "conditionGoods";

    /**
     * Property asset stored in column A_Asset_ID in table M_InOut<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table M_InOut<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property processGoodsJava stored in column Process_Goods_Java in table M_InOut<br>
     * Help: {@literal 
     *       You find the current status in the Document Status field. The options are listed in a
     *       popup}
     * 
     */
    public static final String PROPERTY_PROCESSGOODSJAVA = "processGoodsJava";

    /**
     * Property isnettingshipment stored in column Isnettingshipment in table M_InOut<br>
     * Help: {@literal Field that says if the shipment is a netting shipment}
     * 
     */
    public static final String PROPERTY_ISNETTINGSHIPMENT = "isnettingshipment";

    /**
     * Property completelyInvoiced stored in column Iscompletelyinvoiced in table M_InOut<br>
     * Help: {@literal The IsCompletelyInvoiced checkbox indicates if this document is completely invoiced or
     *       not. This flag is used only in sales flow and shown in the Goods Shipment Header.}
     * 
     */
    public static final String PROPERTY_COMPLETELYINVOICED = "completelyInvoiced";

    /**
     * Property invoicefromshipment stored in column Invoicefromshipment in table M_InOut<br>
     * Help: {@literal Generate Invoice from Shipment considering invoice terms of orders linked to shipment
     *       lines.}
     * 
     */
    public static final String PROPERTY_INVOICEFROMSHIPMENT = "invoicefromshipment";

    /**
     * Property externalBusinessPartnerReference stored in column Bpartner_Extref in table M_InOut<br>
     * Help: {@literal This field stores the business partner reference to an external CRM system. This is useful
     *       only when the business partner management is done outside Openbravo. In this case Openbravo will
     *       internally use the anonymous customer but it will track the real customer in the external system
     *       through this field.}
     * 
     */
    public static final String PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE = "externalBusinessPartnerReference";

    /**
     * Property alternateLocation stored in column C_Alternate_Location_ID in table M_InOut<br>
     * Help: {@literal Different delivery location where to deliver the order. This location does not have to be
     *       part of business partner locations. Used just once, so no need to store it as part of the business
     *       partner locations.}
     * 
     */
    public static final String PROPERTY_ALTERNATELOCATION = "alternateLocation";


    /**
     * Property _computedColumns stored in column _computedColumns in table M_InOut
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property landedCostCostList stored in table M_InOut
     * 
     */
    public static final String PROPERTY_LANDEDCOSTCOSTLIST = "landedCostCostList";

    /**
     * Property materialMgmtShipmentInOutLineList stored in table M_InOut
     * 
     */
    public static final String PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST = "materialMgmtShipmentInOutLineList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property invoiceStatus<br>
     * <br>
     * Computed from: <br>
     * {@code (select C_GETINVOICESTATUSFROMSHIPMENT(m_inout_id) from dual)}
     */
    public static final String COMPUTED_COLUMN_INVOICESTATUS = "invoiceStatus";

    public ShipmentInOut() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DOCUMENTACTION, "CO");
        setDefaultValue(PROPERTY_DOCUMENTSTATUS, "DR");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PRINT, false);
        setDefaultValue(PROPERTY_DELIVERYTERMS, "A");
        setDefaultValue(PROPERTY_FREIGHTCOSTRULE, "I");
        setDefaultValue(PROPERTY_FREIGHTAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_DELIVERYMETHOD, "P");
        setDefaultValue(PROPERTY_CHARGEAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_PRIORITY, "5");
        setDefaultValue(PROPERTY_CREATELINESFROM, false);
        setDefaultValue(PROPERTY_GENERATETO, false);
        setDefaultValue(PROPERTY_UPDATELINES, false);
        setDefaultValue(PROPERTY_CALCULATEFREIGHT, false);
        setDefaultValue(PROPERTY_RECEIVEMATERIALS, false);
        setDefaultValue(PROPERTY_SENDMATERIALS, false);
        setDefaultValue(PROPERTY_PROCESSGOODSJAVA, "CO");
        setDefaultValue(PROPERTY_ISNETTINGSHIPMENT, false);
        setDefaultValue(PROPERTY_COMPLETELYINVOICED, false);
        setDefaultValue(PROPERTY_INVOICEFROMSHIPMENT, false);
        setDefaultValue(PROPERTY_LANDEDCOSTCOSTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTSHIPMENTINOUTLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ShipmentInOut#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ShipmentInOut#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ShipmentInOut#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ShipmentInOut#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ShipmentInOut#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ShipmentInOut#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTACTION
     * 
     */
    public String getDocumentAction() {
        return (String) get(PROPERTY_DOCUMENTACTION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTACTION
     * 
     */
    public void setDocumentAction(String documentAction) {
        set(PROPERTY_DOCUMENTACTION, documentAction);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see ShipmentInOut#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see ShipmentInOut#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ShipmentInOut#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see ShipmentInOut#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ORDERDATE
     * 
     */
    public Date getOrderDate() {
        return (Date) get(PROPERTY_ORDERDATE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ORDERDATE
     * 
     */
    public void setOrderDate(Date orderDate) {
        set(PROPERTY_ORDERDATE, orderDate);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PRINT
     * 
     */
    public Boolean isPrint() {
        return (Boolean) get(PROPERTY_PRINT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PRINT
     * 
     */
    public void setPrint(Boolean print) {
        set(PROPERTY_PRINT, print);
    }

    /**
     * @see ShipmentInOut#PROPERTY_MOVEMENTTYPE
     * 
     */
    public String getMovementType() {
        return (String) get(PROPERTY_MOVEMENTTYPE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_MOVEMENTTYPE
     * 
     */
    public void setMovementType(String movementType) {
        set(PROPERTY_MOVEMENTTYPE, movementType);
    }

    /**
     * @see ShipmentInOut#PROPERTY_MOVEMENTDATE
     * 
     */
    public Date getMovementDate() {
        return (Date) get(PROPERTY_MOVEMENTDATE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_MOVEMENTDATE
     * 
     */
    public void setMovementDate(Date movementDate) {
        set(PROPERTY_MOVEMENTDATE, movementDate);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see ShipmentInOut#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ShipmentInOut#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see ShipmentInOut#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ORDERREFERENCE
     * 
     */
    public String getOrderReference() {
        return (String) get(PROPERTY_ORDERREFERENCE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ORDERREFERENCE
     * 
     */
    public void setOrderReference(String orderReference) {
        set(PROPERTY_ORDERREFERENCE, orderReference);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DELIVERYTERMS
     * 
     */
    public String getDeliveryTerms() {
        return (String) get(PROPERTY_DELIVERYTERMS);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DELIVERYTERMS
     * 
     */
    public void setDeliveryTerms(String deliveryTerms) {
        set(PROPERTY_DELIVERYTERMS, deliveryTerms);
    }

    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTCOSTRULE
     * 
     */
    public String getFreightCostRule() {
        return (String) get(PROPERTY_FREIGHTCOSTRULE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTCOSTRULE
     * 
     */
    public void setFreightCostRule(String freightCostRule) {
        set(PROPERTY_FREIGHTCOSTRULE, freightCostRule);
    }

    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public BigDecimal getFreightAmount() {
        return (BigDecimal) get(PROPERTY_FREIGHTAMOUNT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTAMOUNT
     * 
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        set(PROPERTY_FREIGHTAMOUNT, freightAmount);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DELIVERYMETHOD
     * 
     */
    public String getDeliveryMethod() {
        return (String) get(PROPERTY_DELIVERYMETHOD);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DELIVERYMETHOD
     * 
     */
    public void setDeliveryMethod(String deliveryMethod) {
        set(PROPERTY_DELIVERYMETHOD, deliveryMethod);
    }

    /**
     * @see ShipmentInOut#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public ShippingCompany getShippingCompany() {
        return (ShippingCompany) get(PROPERTY_SHIPPINGCOMPANY);
    }
    /**
     * @see ShipmentInOut#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public void setShippingCompany(ShippingCompany shippingCompany) {
        set(PROPERTY_SHIPPINGCOMPANY, shippingCompany);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CHARGE
     * 
     */
    public GLCharge getCharge() {
        return (GLCharge) get(PROPERTY_CHARGE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CHARGE
     * 
     */
    public void setCharge(GLCharge charge) {
        set(PROPERTY_CHARGE, charge);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CHARGEAMOUNT
     * 
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEAMOUNT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CHARGEAMOUNT
     * 
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        set(PROPERTY_CHARGEAMOUNT, chargeAmount);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PRIORITY
     * 
     */
    public String getPriority() {
        return (String) get(PROPERTY_PRIORITY);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PRIORITY
     * 
     */
    public void setPriority(String priority) {
        set(PROPERTY_PRIORITY, priority);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DATEPRINTED
     * 
     */
    public Date getDatePrinted() {
        return (Date) get(PROPERTY_DATEPRINTED);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DATEPRINTED
     * 
     */
    public void setDatePrinted(Date datePrinted) {
        set(PROPERTY_DATEPRINTED, datePrinted);
    }

    /**
     * @see ShipmentInOut#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CREATELINESFROM
     * 
     */
    public Boolean isCreateLinesFrom() {
        return (Boolean) get(PROPERTY_CREATELINESFROM);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CREATELINESFROM
     * 
     */
    public void setCreateLinesFrom(Boolean createLinesFrom) {
        set(PROPERTY_CREATELINESFROM, createLinesFrom);
    }

    /**
     * @see ShipmentInOut#PROPERTY_GENERATETO
     * 
     */
    public Boolean isGenerateTo() {
        return (Boolean) get(PROPERTY_GENERATETO);
    }
    /**
     * @see ShipmentInOut#PROPERTY_GENERATETO
     * 
     */
    public void setGenerateTo(Boolean generateTo) {
        set(PROPERTY_GENERATETO, generateTo);
    }

    /**
     * @see ShipmentInOut#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see ShipmentInOut#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see ShipmentInOut#PROPERTY_NUMBEROFPACKAGES
     * 
     */
    public Long getNumberOfPackages() {
        return (Long) get(PROPERTY_NUMBEROFPACKAGES);
    }
    /**
     * @see ShipmentInOut#PROPERTY_NUMBEROFPACKAGES
     * 
     */
    public void setNumberOfPackages(Long numberOfPackages) {
        set(PROPERTY_NUMBEROFPACKAGES, numberOfPackages);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PICKDATE
     * 
     */
    public Date getPickDate() {
        return (Date) get(PROPERTY_PICKDATE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PICKDATE
     * 
     */
    public void setPickDate(Date pickDate) {
        set(PROPERTY_PICKDATE, pickDate);
    }

    /**
     * @see ShipmentInOut#PROPERTY_SHIPDATE
     * 
     */
    public Date getShipDate() {
        return (Date) get(PROPERTY_SHIPDATE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_SHIPDATE
     * 
     */
    public void setShipDate(Date shipDate) {
        set(PROPERTY_SHIPDATE, shipDate);
    }

    /**
     * @see ShipmentInOut#PROPERTY_TRACKINGNO
     * 
     */
    public String getTrackingNo() {
        return (String) get(PROPERTY_TRACKINGNO);
    }
    /**
     * @see ShipmentInOut#PROPERTY_TRACKINGNO
     * 
     */
    public void setTrackingNo(String trackingNo) {
        set(PROPERTY_TRACKINGNO, trackingNo);
    }

    /**
     * @see ShipmentInOut#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see ShipmentInOut#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see ShipmentInOut#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see ShipmentInOut#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see ShipmentInOut#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see ShipmentInOut#PROPERTY_UPDATELINES
     * 
     */
    public Boolean isUpdateLines() {
        return (Boolean) get(PROPERTY_UPDATELINES);
    }
    /**
     * @see ShipmentInOut#PROPERTY_UPDATELINES
     * 
     */
    public void setUpdateLines(Boolean updateLines) {
        set(PROPERTY_UPDATELINES, updateLines);
    }

    /**
     * @see ShipmentInOut#PROPERTY_LOGISTIC
     * 
     */
    public Boolean isLogistic() {
        return (Boolean) get(PROPERTY_LOGISTIC);
    }
    /**
     * @see ShipmentInOut#PROPERTY_LOGISTIC
     * 
     */
    public void setLogistic(Boolean logistic) {
        set(PROPERTY_LOGISTIC, logistic);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CALCULATEFREIGHT
     * 
     */
    public Boolean isCalculateFreight() {
        return (Boolean) get(PROPERTY_CALCULATEFREIGHT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CALCULATEFREIGHT
     * 
     */
    public void setCalculateFreight(Boolean calculateFreight) {
        set(PROPERTY_CALCULATEFREIGHT, calculateFreight);
    }

    /**
     * @see ShipmentInOut#PROPERTY_DELIVERYLOCATION
     * 
     */
    public Location getDeliveryLocation() {
        return (Location) get(PROPERTY_DELIVERYLOCATION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_DELIVERYLOCATION
     * 
     */
    public void setDeliveryLocation(Location deliveryLocation) {
        set(PROPERTY_DELIVERYLOCATION, deliveryLocation);
    }

    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTCATEGORY
     * 
     */
    public FreightCategory getFreightCategory() {
        return (FreightCategory) get(PROPERTY_FREIGHTCATEGORY);
    }
    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTCATEGORY
     * 
     */
    public void setFreightCategory(FreightCategory freightCategory) {
        set(PROPERTY_FREIGHTCATEGORY, freightCategory);
    }

    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTCURRENCY
     * 
     */
    public Currency getFreightCurrency() {
        return (Currency) get(PROPERTY_FREIGHTCURRENCY);
    }
    /**
     * @see ShipmentInOut#PROPERTY_FREIGHTCURRENCY
     * 
     */
    public void setFreightCurrency(Currency freightCurrency) {
        set(PROPERTY_FREIGHTCURRENCY, freightCurrency);
    }

    /**
     * @see ShipmentInOut#PROPERTY_RECEIVEMATERIALS
     * 
     */
    public Boolean isReceiveMaterials() {
        return (Boolean) get(PROPERTY_RECEIVEMATERIALS);
    }
    /**
     * @see ShipmentInOut#PROPERTY_RECEIVEMATERIALS
     * 
     */
    public void setReceiveMaterials(Boolean receiveMaterials) {
        set(PROPERTY_RECEIVEMATERIALS, receiveMaterials);
    }

    /**
     * @see ShipmentInOut#PROPERTY_SENDMATERIALS
     * 
     */
    public Boolean isSendMaterials() {
        return (Boolean) get(PROPERTY_SENDMATERIALS);
    }
    /**
     * @see ShipmentInOut#PROPERTY_SENDMATERIALS
     * 
     */
    public void setSendMaterials(Boolean sendMaterials) {
        set(PROPERTY_SENDMATERIALS, sendMaterials);
    }

    /**
     * @see ShipmentInOut#PROPERTY_CONDITIONGOODS
     * 
     */
    public ConditionGoods getConditionGoods() {
        return (ConditionGoods) get(PROPERTY_CONDITIONGOODS);
    }
    /**
     * @see ShipmentInOut#PROPERTY_CONDITIONGOODS
     * 
     */
    public void setConditionGoods(ConditionGoods conditionGoods) {
        set(PROPERTY_CONDITIONGOODS, conditionGoods);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see ShipmentInOut#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see ShipmentInOut#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see ShipmentInOut#PROPERTY_PROCESSGOODSJAVA
     * 
     */
    public String getProcessGoodsJava() {
        return (String) get(PROPERTY_PROCESSGOODSJAVA);
    }
    /**
     * @see ShipmentInOut#PROPERTY_PROCESSGOODSJAVA
     * 
     */
    public void setProcessGoodsJava(String processGoodsJava) {
        set(PROPERTY_PROCESSGOODSJAVA, processGoodsJava);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ISNETTINGSHIPMENT
     * 
     */
    public Boolean isNettingshipment() {
        return (Boolean) get(PROPERTY_ISNETTINGSHIPMENT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ISNETTINGSHIPMENT
     * 
     */
    public void setNettingshipment(Boolean isnettingshipment) {
        set(PROPERTY_ISNETTINGSHIPMENT, isnettingshipment);
    }

    /**
     * @see ShipmentInOut#PROPERTY_COMPLETELYINVOICED
     * 
     */
    public Boolean isCompletelyInvoiced() {
        return (Boolean) get(PROPERTY_COMPLETELYINVOICED);
    }
    /**
     * @see ShipmentInOut#PROPERTY_COMPLETELYINVOICED
     * 
     */
    public void setCompletelyInvoiced(Boolean completelyInvoiced) {
        set(PROPERTY_COMPLETELYINVOICED, completelyInvoiced);
    }

    /**
     * @see ShipmentInOut#PROPERTY_INVOICEFROMSHIPMENT
     * 
     */
    public Boolean isInvoicefromshipment() {
        return (Boolean) get(PROPERTY_INVOICEFROMSHIPMENT);
    }
    /**
     * @see ShipmentInOut#PROPERTY_INVOICEFROMSHIPMENT
     * 
     */
    public void setInvoicefromshipment(Boolean invoicefromshipment) {
        set(PROPERTY_INVOICEFROMSHIPMENT, invoicefromshipment);
    }

    /**
     * @see ShipmentInOut#PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE
     * 
     */
    public String getExternalBusinessPartnerReference() {
        return (String) get(PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE);
    }
    /**
     * @see ShipmentInOut#PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE
     * 
     */
    public void setExternalBusinessPartnerReference(String externalBusinessPartnerReference) {
        set(PROPERTY_EXTERNALBUSINESSPARTNERREFERENCE, externalBusinessPartnerReference);
    }

    /**
     * @see ShipmentInOut#PROPERTY_ALTERNATELOCATION
     * 
     */
    public org.openbravo.model.common.geography.Location getAlternateLocation() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_ALTERNATELOCATION);
    }
    /**
     * @see ShipmentInOut#PROPERTY_ALTERNATELOCATION
     * 
     */
    public void setAlternateLocation(org.openbravo.model.common.geography.Location alternateLocation) {
        set(PROPERTY_ALTERNATELOCATION, alternateLocation);
    }

    /**
     * @see ShipmentInOut#COMPUTED_COLUMN_INVOICESTATUS
     * 
     */
    public Long getInvoiceStatus() {
        return (Long) get(COMPUTED_COLUMN_INVOICESTATUS);
    }
    /**
     * @see ShipmentInOut#COMPUTED_COLUMN_INVOICESTATUS
     * 
     */
    public void setInvoiceStatus(Long invoiceStatus) {
        set(COMPUTED_COLUMN_INVOICESTATUS, invoiceStatus);
    }

    /**
     * @see ShipmentInOut#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public ShipmentInOut_ComputedColumns get_computedColumns() {
        return (ShipmentInOut_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see ShipmentInOut#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(ShipmentInOut_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * @see LandedCostCost
     * 
     */
    @SuppressWarnings("unchecked")
    public List<LandedCostCost> getLandedCostCostList() {
      return (List<LandedCostCost>) get(PROPERTY_LANDEDCOSTCOSTLIST);
    }

    /**
     * @see LandedCostCost
     * 
     */
    public void setLandedCostCostList(List<LandedCostCost> landedCostCostList) {
        set(PROPERTY_LANDEDCOSTCOSTLIST, landedCostCostList);
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


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_INVOICESTATUS.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getInvoiceStatus();
      }

      return super.get(propName);
    }
}
