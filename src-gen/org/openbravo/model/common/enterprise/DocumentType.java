
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
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Sequence;
import org.openbravo.model.financialmgmt.gl.GLCategory;
/**
 * Entity class for entity DocumentType (stored in table C_DocType).
 * <br>
 * Help: {@literal The Document Definition Tab defines the processing parameters and controls for the
     *       document.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DocumentType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_DocType";
    public static final String ENTITY_NAME = "DocumentType";

    /**
     * Property id stored in column C_DocType_ID in table C_DocType<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_DocType 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_DocType 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_DocType 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_DocType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_DocType 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property printText stored in column PrintName in table C_DocType<br>
     * Help: {@literal The Label to be printed indicates the name that will be printed on a document or
     *       correspondence. The max length is 2000 characters.}
     * 
     */
    public static final String PROPERTY_PRINTTEXT = "printText";

    /**
     * Property description stored in column Description in table C_DocType<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property documentCategory stored in column DocBaseType in table C_DocType<br>
     * Help: {@literal The Document Base Type identifies the base or starting point for a document.  Multiple
     *       document types may share a single document base type.}
     * 
     */
    public static final String PROPERTY_DOCUMENTCATEGORY = "documentCategory";

    /**
     * Property salesTransaction stored in column IsSOTrx in table C_DocType<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property sOSubType stored in column DocSubTypeSO in table C_DocType<br>
     * Help: {@literal The SO Sub Type indicates the type of sales order this document refers to.  This field
     *       only appears when the Document Base Type is Sales Order.  The selection made here will determine
     *       which documents will be generated when an order is processed and which documents must be generated
     *       manually or in batches.  <BR>The following outlines this process.<BR>SO Sub Type of <b>Standard
     *       Order</b> will generate just the <b>Order</b> document when the order is processed.  <BR>The
     *       <b>Delivery Note</b>, <b>Invoice</b> and <b>Receipt</b> must be generated via other processes. 
     *       <BR>SO Sub Type of <b>Warehouse Order</b> will generate the <b>Order</b> and <b>Delivery Note</b>.
     *       <BR> The <b>Invoice</b> and <b>Receipt</b> must be generated via other processes.<BR>SO Sub Type of
     *       <b>Credit Order</b> will generate the <b>Order</b>, <b>Delivery Note</b> and <b>Invoice</b>. <BR>
     *       The <b>Reciept</b> must be generated via other processes.<BR>SO Sub Type of <b>POS</b> (Point of
     *       Sale) will generate all document}
     * 
     */
    public static final String PROPERTY_SOSUBTYPE = "sOSubType";

    /**
     * Property documentTypeForShipment stored in column C_DocTypeShipment_ID in table C_DocType<br>
     * Help: {@literal The Document Type for Shipments indicates the document type that will be used when a
     *       shipment is generated from this sales document.  This field will display only when the base document
     *       type is Sales Order.}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPEFORSHIPMENT = "documentTypeForShipment";

    /**
     * Property documentTypeForInvoice stored in column C_DocTypeInvoice_ID in table C_DocType<br>
     * Help: {@literal The Document Type for Invoice indicates the document type that will be used when an
     *       invoice is generated from this sales document.  This field will display only when the base document
     *       type is Sales Order.}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPEFORINVOICE = "documentTypeForInvoice";

    /**
     * Property sequencedDocument stored in column IsDocNoControlled in table C_DocType<br>
     * Help: {@literal The Document Number Controlled checkbox indicates if this document type will have a
     *       sequence number.}
     * 
     */
    public static final String PROPERTY_SEQUENCEDDOCUMENT = "sequencedDocument";

    /**
     * Property documentSequence stored in column DocNoSequence_ID in table C_DocType<br>
     * Help: {@literal The Document Sequence indicates the sequencing rule to use for this document type.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSEQUENCE = "documentSequence";

    /**
     * Property gLCategory stored in column GL_Category_ID in table C_DocType<br>
     * Help: {@literal The General Ledger Category is an optional, user defined method of grouping journal
     *       lines.}
     * 
     */
    public static final String PROPERTY_GLCATEGORY = "gLCategory";

    /**
     * Property comments stored in column DocumentNote in table C_DocType<br>
     * Help: {@literal The Document Note is used for recording any additional information regarding this
     *       product.}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property default stored in column IsDefault in table C_DocType<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property numberOfCopies stored in column DocumentCopies in table C_DocType<br>
     * Help: {@literal The Document Copies indicates the number of copies of each document that will be
     *       generated.}
     * 
     */
    public static final String PROPERTY_NUMBEROFCOPIES = "numberOfCopies";

    /**
     * Property table stored in column AD_Table_ID in table C_DocType<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property filterByOrganization stored in column Orgfiltered in table C_DocType<br>
     * Help: {@literal Filters by organization. This is used to calculate the document number by document type.}
     * 
     */
    public static final String PROPERTY_FILTERBYORGANIZATION = "filterByOrganization";

    /**
     * Property documentCancelled stored in column C_Doctype_Reversed_ID in table C_DocType
     * 
     */
    public static final String PROPERTY_DOCUMENTCANCELLED = "documentCancelled";

    /**
     * Property expense stored in column IsExpense in table C_DocType<br>
     * Help: {@literal Invoices in the Create AP Invoices process will be created preferably with a document type
     *       with this flag activated. This way invoices related to expenses will not appear in the Invoice
     *       Register Book. }
     * 
     */
    public static final String PROPERTY_EXPENSE = "expense";

    /**
     * Property reversal stored in column Isreversal in table C_DocType<br>
     * Help: {@literal Credit Memo checkbox only applies to Invoice document types.
     *       Invoices marked as Credit
     *       Memo will behave as Credit Memos, which implies that:
     *       - "Total gross amount" must always be
     *       positive.
     *       - "Payment Plan" will be negative.
     *       - Accounting will be opposite than Invoice accounting.}
     * 
     */
    public static final String PROPERTY_REVERSAL = "reversal";

    /**
     * Property return stored in column IsReturn in table C_DocType<br>
     * Help: {@literal Return checkbox indicates if the document is of reversal type. Documents with this flag
     *       enables implies to use negative quantities.}
     * 
     */
    public static final String PROPERTY_RETURN = "return";

    /**
     * Property documentTypeForOrder stored in column C_Doctypeorder_ID in table C_DocType
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPEFORORDER = "documentTypeForOrder";

    /**
     * Property doctypesimpinvoice stored in column C_Doctypesimpinvoice_ID in table C_DocType<br>
     * Help: {@literal The Document Type for Simplified Invoice indicates the document type that will be used
     *       when a simplified invoice is generated from this sales document.
     *       This field will display only when
     *       the base document type is Sales Order.}
     * 
     */
    public static final String PROPERTY_DOCTYPESIMPINVOICE = "doctypesimpinvoice";

    /**
     * Property doctypeaggrinvoice stored in column C_Doctypeaggrinvoice_ID in table C_DocType<br>
     * Help: {@literal The Document Type for Aggregated Invoice indicates the document type that will be used
     *       when an aggregated invoice is generated from this sales document.This field will display only when
     *       the base document type is Sales Order.}
     * 
     */
    public static final String PROPERTY_DOCTYPEAGGRINVOICE = "doctypeaggrinvoice";

    /**
     * Property documentTemplateList stored in table C_DocType
     * 
     */
    public static final String PROPERTY_DOCUMENTTEMPLATELIST = "documentTemplateList";

    /**
     * Property documentTypeTrlList stored in table C_DocType
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPETRLLIST = "documentTypeTrlList";


    public DocumentType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SALESTRANSACTION, false);
        setDefaultValue(PROPERTY_SEQUENCEDDOCUMENT, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_NUMBEROFCOPIES, (long) 1);
        setDefaultValue(PROPERTY_FILTERBYORGANIZATION, false);
        setDefaultValue(PROPERTY_EXPENSE, false);
        setDefaultValue(PROPERTY_REVERSAL, false);
        setDefaultValue(PROPERTY_RETURN, false);
        setDefaultValue(PROPERTY_DOCUMENTTEMPLATELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_DOCUMENTTYPETRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DocumentType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DocumentType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DocumentType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DocumentType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DocumentType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DocumentType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DocumentType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DocumentType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DocumentType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DocumentType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DocumentType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DocumentType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DocumentType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DocumentType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DocumentType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DocumentType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DocumentType#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see DocumentType#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see DocumentType#PROPERTY_PRINTTEXT
     * 
     */
    public String getPrintText() {
        return (String) get(PROPERTY_PRINTTEXT);
    }
    /**
     * @see DocumentType#PROPERTY_PRINTTEXT
     * 
     */
    public void setPrintText(String printText) {
        set(PROPERTY_PRINTTEXT, printText);
    }

    /**
     * @see DocumentType#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DocumentType#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DocumentType#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public String getDocumentCategory() {
        return (String) get(PROPERTY_DOCUMENTCATEGORY);
    }
    /**
     * @see DocumentType#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public void setDocumentCategory(String documentCategory) {
        set(PROPERTY_DOCUMENTCATEGORY, documentCategory);
    }

    /**
     * @see DocumentType#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see DocumentType#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see DocumentType#PROPERTY_SOSUBTYPE
     * 
     */
    public String getSOSubType() {
        return (String) get(PROPERTY_SOSUBTYPE);
    }
    /**
     * @see DocumentType#PROPERTY_SOSUBTYPE
     * 
     */
    public void setSOSubType(String sOSubType) {
        set(PROPERTY_SOSUBTYPE, sOSubType);
    }

    /**
     * @see DocumentType#PROPERTY_DOCUMENTTYPEFORSHIPMENT
     * 
     */
    public DocumentType getDocumentTypeForShipment() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPEFORSHIPMENT);
    }
    /**
     * @see DocumentType#PROPERTY_DOCUMENTTYPEFORSHIPMENT
     * 
     */
    public void setDocumentTypeForShipment(DocumentType documentTypeForShipment) {
        set(PROPERTY_DOCUMENTTYPEFORSHIPMENT, documentTypeForShipment);
    }

    /**
     * @see DocumentType#PROPERTY_DOCUMENTTYPEFORINVOICE
     * 
     */
    public DocumentType getDocumentTypeForInvoice() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPEFORINVOICE);
    }
    /**
     * @see DocumentType#PROPERTY_DOCUMENTTYPEFORINVOICE
     * 
     */
    public void setDocumentTypeForInvoice(DocumentType documentTypeForInvoice) {
        set(PROPERTY_DOCUMENTTYPEFORINVOICE, documentTypeForInvoice);
    }

    /**
     * @see DocumentType#PROPERTY_SEQUENCEDDOCUMENT
     * 
     */
    public Boolean isSequencedDocument() {
        return (Boolean) get(PROPERTY_SEQUENCEDDOCUMENT);
    }
    /**
     * @see DocumentType#PROPERTY_SEQUENCEDDOCUMENT
     * 
     */
    public void setSequencedDocument(Boolean sequencedDocument) {
        set(PROPERTY_SEQUENCEDDOCUMENT, sequencedDocument);
    }

    /**
     * @see DocumentType#PROPERTY_DOCUMENTSEQUENCE
     * 
     */
    public Sequence getDocumentSequence() {
        return (Sequence) get(PROPERTY_DOCUMENTSEQUENCE);
    }
    /**
     * @see DocumentType#PROPERTY_DOCUMENTSEQUENCE
     * 
     */
    public void setDocumentSequence(Sequence documentSequence) {
        set(PROPERTY_DOCUMENTSEQUENCE, documentSequence);
    }

    /**
     * @see DocumentType#PROPERTY_GLCATEGORY
     * 
     */
    public GLCategory getGLCategory() {
        return (GLCategory) get(PROPERTY_GLCATEGORY);
    }
    /**
     * @see DocumentType#PROPERTY_GLCATEGORY
     * 
     */
    public void setGLCategory(GLCategory gLCategory) {
        set(PROPERTY_GLCATEGORY, gLCategory);
    }

    /**
     * @see DocumentType#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see DocumentType#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see DocumentType#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see DocumentType#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see DocumentType#PROPERTY_NUMBEROFCOPIES
     * 
     */
    public Long getNumberOfCopies() {
        return (Long) get(PROPERTY_NUMBEROFCOPIES);
    }
    /**
     * @see DocumentType#PROPERTY_NUMBEROFCOPIES
     * 
     */
    public void setNumberOfCopies(Long numberOfCopies) {
        set(PROPERTY_NUMBEROFCOPIES, numberOfCopies);
    }

    /**
     * @see DocumentType#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see DocumentType#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see DocumentType#PROPERTY_FILTERBYORGANIZATION
     * 
     */
    public Boolean isFilterByOrganization() {
        return (Boolean) get(PROPERTY_FILTERBYORGANIZATION);
    }
    /**
     * @see DocumentType#PROPERTY_FILTERBYORGANIZATION
     * 
     */
    public void setFilterByOrganization(Boolean filterByOrganization) {
        set(PROPERTY_FILTERBYORGANIZATION, filterByOrganization);
    }

    /**
     * @see DocumentType#PROPERTY_DOCUMENTCANCELLED
     * 
     */
    public DocumentType getDocumentCancelled() {
        return (DocumentType) get(PROPERTY_DOCUMENTCANCELLED);
    }
    /**
     * @see DocumentType#PROPERTY_DOCUMENTCANCELLED
     * 
     */
    public void setDocumentCancelled(DocumentType documentCancelled) {
        set(PROPERTY_DOCUMENTCANCELLED, documentCancelled);
    }

    /**
     * @see DocumentType#PROPERTY_EXPENSE
     * 
     */
    public Boolean isExpense() {
        return (Boolean) get(PROPERTY_EXPENSE);
    }
    /**
     * @see DocumentType#PROPERTY_EXPENSE
     * 
     */
    public void setExpense(Boolean expense) {
        set(PROPERTY_EXPENSE, expense);
    }

    /**
     * @see DocumentType#PROPERTY_REVERSAL
     * 
     */
    public Boolean isReversal() {
        return (Boolean) get(PROPERTY_REVERSAL);
    }
    /**
     * @see DocumentType#PROPERTY_REVERSAL
     * 
     */
    public void setReversal(Boolean reversal) {
        set(PROPERTY_REVERSAL, reversal);
    }

    /**
     * @see DocumentType#PROPERTY_RETURN
     * 
     */
    public Boolean isReturn() {
        return (Boolean) get(PROPERTY_RETURN);
    }
    /**
     * @see DocumentType#PROPERTY_RETURN
     * 
     */
    public void setReturn(Boolean rturn) {
        set(PROPERTY_RETURN, rturn);
    }

    /**
     * @see DocumentType#PROPERTY_DOCUMENTTYPEFORORDER
     * 
     */
    public DocumentType getDocumentTypeForOrder() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPEFORORDER);
    }
    /**
     * @see DocumentType#PROPERTY_DOCUMENTTYPEFORORDER
     * 
     */
    public void setDocumentTypeForOrder(DocumentType documentTypeForOrder) {
        set(PROPERTY_DOCUMENTTYPEFORORDER, documentTypeForOrder);
    }

    /**
     * @see DocumentType#PROPERTY_DOCTYPESIMPINVOICE
     * 
     */
    public DocumentType getDoctypesimpinvoice() {
        return (DocumentType) get(PROPERTY_DOCTYPESIMPINVOICE);
    }
    /**
     * @see DocumentType#PROPERTY_DOCTYPESIMPINVOICE
     * 
     */
    public void setDoctypesimpinvoice(DocumentType doctypesimpinvoice) {
        set(PROPERTY_DOCTYPESIMPINVOICE, doctypesimpinvoice);
    }

    /**
     * @see DocumentType#PROPERTY_DOCTYPEAGGRINVOICE
     * 
     */
    public DocumentType getDoctypeaggrinvoice() {
        return (DocumentType) get(PROPERTY_DOCTYPEAGGRINVOICE);
    }
    /**
     * @see DocumentType#PROPERTY_DOCTYPEAGGRINVOICE
     * 
     */
    public void setDoctypeaggrinvoice(DocumentType doctypeaggrinvoice) {
        set(PROPERTY_DOCTYPEAGGRINVOICE, doctypeaggrinvoice);
    }

    /**
     * Help: {@literal C_POC_DOCTYPE_TEMPLATE}<br>
     * @see DocumentTemplate
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DocumentTemplate> getDocumentTemplateList() {
      return (List<DocumentTemplate>) get(PROPERTY_DOCUMENTTEMPLATELIST);
    }

    /**
     * Help: {@literal C_POC_DOCTYPE_TEMPLATE}<br>
     * @see DocumentTemplate
     * 
     */
    public void setDocumentTemplateList(List<DocumentTemplate> documentTemplateList) {
        set(PROPERTY_DOCUMENTTEMPLATELIST, documentTemplateList);
    }

    /**
     * Help: {@literal The Translation Tab defines a Document Type in an alternate language.}<br>
     * @see DocumentTypeTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DocumentTypeTrl> getDocumentTypeTrlList() {
      return (List<DocumentTypeTrl>) get(PROPERTY_DOCUMENTTYPETRLLIST);
    }

    /**
     * Help: {@literal The Translation Tab defines a Document Type in an alternate language.}<br>
     * @see DocumentTypeTrl
     * 
     */
    public void setDocumentTypeTrlList(List<DocumentTypeTrl> documentTypeTrlList) {
        set(PROPERTY_DOCUMENTTYPETRLLIST, documentTypeTrlList);
    }

}
