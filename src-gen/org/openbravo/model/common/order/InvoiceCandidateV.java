
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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity InvoiceCandidateV (stored in table c_invoice_candidate_v).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceCandidateV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "c_invoice_candidate_v";
    public static final String ENTITY_NAME = "InvoiceCandidateV";

    /**
     * Property id stored in column C_Invoice_Candidate_V_ID in table c_invoice_candidate_v 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property active stored in column Isactive in table c_invoice_candidate_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table c_invoice_candidate_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table c_invoice_candidate_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table c_invoice_candidate_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table c_invoice_candidate_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property client stored in column AD_Client_ID in table c_invoice_candidate_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table c_invoice_candidate_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table c_invoice_candidate_v<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property salesOrder stored in column C_Order_ID in table c_invoice_candidate_v<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property documentNo stored in column Documentno in table c_invoice_candidate_v<br>
     * Help: {@literal The document number is usually automatically generated by the system and determined by the
     *       document type of the document. If the document is not saved, the preliminary number is displayed in
     *       "<>". If the document type of your document has no automatic document sequence defined, the field
     *       will be empty when creating a new document. This is for documents which usually have an external
     *       number (like vendor invoice).  If you leave the field empty, the system will generate a document
     *       number for you. The document sequence used for this fallback number is defined in the "Document
     *       Sequence" window with the name "DocumentNo_<TableName>", where TableName is the actual name of the
     *       table inside the database (e.g. C_Order).}
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property orderDate stored in column Dateordered in table c_invoice_candidate_v<br>
     * Help: {@literal Indicates the Date an item was ordered.}
     * 
     */
    public static final String PROPERTY_ORDERDATE = "orderDate";

    /**
     * Property documentType stored in column C_Doctype_ID in table c_invoice_candidate_v<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property amountlines stored in column Amountlines in table c_invoice_candidate_v
     * 
     */
    public static final String PROPERTY_AMOUNTLINES = "amountlines";

    /**
     * Property amountlinesgross stored in column Amountlinesgross in table c_invoice_candidate_v
     * 
     */
    public static final String PROPERTY_AMOUNTLINESGROSS = "amountlinesgross";

    /**
     * Property notinvoicedlines stored in column Notinvoicedlines in table c_invoice_candidate_v
     * 
     */
    public static final String PROPERTY_NOTINVOICEDLINES = "notinvoicedlines";

    /**
     * Property notinvoicedlinesgross stored in column Notinvoicedlinesgross in table c_invoice_candidate_v
     * 
     */
    public static final String PROPERTY_NOTINVOICEDLINESGROSS = "notinvoicedlinesgross";

    /**
     * Property term stored in column Term in table c_invoice_candidate_v
     * 
     */
    public static final String PROPERTY_TERM = "term";

    /**
     * Property pendinglines stored in column Pendinglines in table c_invoice_candidate_v
     * 
     */
    public static final String PROPERTY_PENDINGLINES = "pendinglines";

    /**
     * Property pendinglinesgross stored in column Pendinglinesgross in table c_invoice_candidate_v
     * 
     */
    public static final String PROPERTY_PENDINGLINESGROSS = "pendinglinesgross";

    /**
     * Property orderedQuantity stored in column Qtyordered in table c_invoice_candidate_v<br>
     * Help: {@literal The Ordered Quantity indicates the quantity of a product that was ordered.}
     * 
     */
    public static final String PROPERTY_ORDEREDQUANTITY = "orderedQuantity";

    /**
     * Property deliveredQuantity stored in column Qtydelivered in table c_invoice_candidate_v<br>
     * Help: {@literal The Delivered Quantity indicates the quantity of a product that has already been
     *       delivered.}
     * 
     */
    public static final String PROPERTY_DELIVEREDQUANTITY = "deliveredQuantity";

    /**
     * Property salesTransaction stored in column Issotrx in table c_invoice_candidate_v<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property priceIncludesTax stored in column Istaxincluded in table c_invoice_candidate_v<br>
     * Help: {@literal The Tax Included checkbox indicates if the prices include tax.  This is also known as the
     *       gross price.}
     * 
     */
    public static final String PROPERTY_PRICEINCLUDESTAX = "priceIncludesTax";

    /**
     * Property currency stored in column C_Currency_ID in table c_invoice_candidate_v<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property scheduledDeliveryDate stored in column Datepromised in table c_invoice_candidate_v<br>
     * Help: {@literal Scheduled Delivery Date indicates the date, if any, that an order was promised by.}
     * 
     */
    public static final String PROPERTY_SCHEDULEDDELIVERYDATE = "scheduledDeliveryDate";

    /**
     * Property asset stored in column A_Asset_ID in table c_invoice_candidate_v<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property project stored in column C_Project_ID in table c_invoice_candidate_v<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table c_invoice_candidate_v<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property stDimension stored in column User1_ID in table c_invoice_candidate_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table c_invoice_candidate_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table c_invoice_candidate_v<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property grandTotalAmount stored in column Grandtotal in table c_invoice_candidate_v<br>
     * Help: {@literal The Grand Total displays the total amount including Tax and Freight in document currency}
     * 
     */
    public static final String PROPERTY_GRANDTOTALAMOUNT = "grandTotalAmount";


    public InvoiceCandidateV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SALESTRANSACTION, false);
        setDefaultValue(PROPERTY_PRICEINCLUDESTAX, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_ORDERDATE
     * 
     */
    public Date getOrderDate() {
        return (Date) get(PROPERTY_ORDERDATE);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_ORDERDATE
     * 
     */
    public void setOrderDate(Date orderDate) {
        set(PROPERTY_ORDERDATE, orderDate);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_AMOUNTLINES
     * 
     */
    public Long getAmountlines() {
        return (Long) get(PROPERTY_AMOUNTLINES);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_AMOUNTLINES
     * 
     */
    public void setAmountlines(Long amountlines) {
        set(PROPERTY_AMOUNTLINES, amountlines);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_AMOUNTLINESGROSS
     * 
     */
    public Long getAmountlinesgross() {
        return (Long) get(PROPERTY_AMOUNTLINESGROSS);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_AMOUNTLINESGROSS
     * 
     */
    public void setAmountlinesgross(Long amountlinesgross) {
        set(PROPERTY_AMOUNTLINESGROSS, amountlinesgross);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_NOTINVOICEDLINES
     * 
     */
    public Long getNotinvoicedlines() {
        return (Long) get(PROPERTY_NOTINVOICEDLINES);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_NOTINVOICEDLINES
     * 
     */
    public void setNotinvoicedlines(Long notinvoicedlines) {
        set(PROPERTY_NOTINVOICEDLINES, notinvoicedlines);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_NOTINVOICEDLINESGROSS
     * 
     */
    public Long getNotinvoicedlinesgross() {
        return (Long) get(PROPERTY_NOTINVOICEDLINESGROSS);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_NOTINVOICEDLINESGROSS
     * 
     */
    public void setNotinvoicedlinesgross(Long notinvoicedlinesgross) {
        set(PROPERTY_NOTINVOICEDLINESGROSS, notinvoicedlinesgross);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_TERM
     * 
     */
    public String getTerm() {
        return (String) get(PROPERTY_TERM);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_TERM
     * 
     */
    public void setTerm(String term) {
        set(PROPERTY_TERM, term);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_PENDINGLINES
     * 
     */
    public Long getPendinglines() {
        return (Long) get(PROPERTY_PENDINGLINES);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_PENDINGLINES
     * 
     */
    public void setPendinglines(Long pendinglines) {
        set(PROPERTY_PENDINGLINES, pendinglines);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_PENDINGLINESGROSS
     * 
     */
    public Long getPendinglinesgross() {
        return (Long) get(PROPERTY_PENDINGLINESGROSS);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_PENDINGLINESGROSS
     * 
     */
    public void setPendinglinesgross(Long pendinglinesgross) {
        set(PROPERTY_PENDINGLINESGROSS, pendinglinesgross);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public Long getOrderedQuantity() {
        return (Long) get(PROPERTY_ORDEREDQUANTITY);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public void setOrderedQuantity(Long orderedQuantity) {
        set(PROPERTY_ORDEREDQUANTITY, orderedQuantity);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_DELIVEREDQUANTITY
     * 
     */
    public Long getDeliveredQuantity() {
        return (Long) get(PROPERTY_DELIVEREDQUANTITY);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_DELIVEREDQUANTITY
     * 
     */
    public void setDeliveredQuantity(Long deliveredQuantity) {
        set(PROPERTY_DELIVEREDQUANTITY, deliveredQuantity);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public Boolean isPriceIncludesTax() {
        return (Boolean) get(PROPERTY_PRICEINCLUDESTAX);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_PRICEINCLUDESTAX
     * 
     */
    public void setPriceIncludesTax(Boolean priceIncludesTax) {
        set(PROPERTY_PRICEINCLUDESTAX, priceIncludesTax);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_SCHEDULEDDELIVERYDATE
     * 
     */
    public Date getScheduledDeliveryDate() {
        return (Date) get(PROPERTY_SCHEDULEDDELIVERYDATE);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_SCHEDULEDDELIVERYDATE
     * 
     */
    public void setScheduledDeliveryDate(Date scheduledDeliveryDate) {
        set(PROPERTY_SCHEDULEDDELIVERYDATE, scheduledDeliveryDate);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see InvoiceCandidateV#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public BigDecimal getGrandTotalAmount() {
        return (BigDecimal) get(PROPERTY_GRANDTOTALAMOUNT);
    }
    /**
     * @see InvoiceCandidateV#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public void setGrandTotalAmount(BigDecimal grandTotalAmount) {
        set(PROPERTY_GRANDTOTALAMOUNT, grandTotalAmount);
    }

}
