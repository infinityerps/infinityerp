
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
package org.openbravo.model.ad.utility;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.common.order.Order;
/**
 * Entity class for entity ReprintableDocument (stored in table C_Reprintable_Document).
 * <br>
 * Help: {@literal Keeps the required information to support document reprinting, i.e., immutable printable
     *       documents. These are documents that guarantee that subsequent reprints at different points in time
     *       generate the same printable document.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReprintableDocument extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Reprintable_Document";
    public static final String ENTITY_NAME = "ReprintableDocument";

    /**
     * Property id stored in column C_Reprintable_Document_ID in table C_Reprintable_Document 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Reprintable_Document 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Reprintable_Document 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Reprintable_Document 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Reprintable_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Reprintable_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Reprintable_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Reprintable_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Reprintable_Document 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property attachmentConfiguration stored in column C_Attachment_Conf_ID in table C_Reprintable_Document<br>
     * Help: {@literal Unique Identifier for Attachment Configuration used.}
     * 
     */
    public static final String PROPERTY_ATTACHMENTCONFIGURATION = "attachmentConfiguration";

    /**
     * Property format stored in column Document_Format in table C_Reprintable_Document<br>
     * Help: {@literal Supported formats for reprintable documents. The accepted values are:
     *       - PDF: PDF format
     *       -
     *       XML Thermal: XML document which can only be reprinted from the applications that provide support for
     *       it}
     * 
     */
    public static final String PROPERTY_FORMAT = "format";

    /**
     * Property order stored in column C_Order_ID in table C_Reprintable_Document<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_ORDER = "order";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_Reprintable_Document<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";


    public ReprintableDocument() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReprintableDocument#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReprintableDocument#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReprintableDocument#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReprintableDocument#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReprintableDocument#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReprintableDocument#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReprintableDocument#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReprintableDocument#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReprintableDocument#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReprintableDocument#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReprintableDocument#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReprintableDocument#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReprintableDocument#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReprintableDocument#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReprintableDocument#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReprintableDocument#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReprintableDocument#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ReprintableDocument#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ReprintableDocument#PROPERTY_ATTACHMENTCONFIGURATION
     * 
     */
    public AttachmentConfig getAttachmentConfiguration() {
        return (AttachmentConfig) get(PROPERTY_ATTACHMENTCONFIGURATION);
    }
    /**
     * @see ReprintableDocument#PROPERTY_ATTACHMENTCONFIGURATION
     * 
     */
    public void setAttachmentConfiguration(AttachmentConfig attachmentConfiguration) {
        set(PROPERTY_ATTACHMENTCONFIGURATION, attachmentConfiguration);
    }

    /**
     * @see ReprintableDocument#PROPERTY_FORMAT
     * 
     */
    public String getFormat() {
        return (String) get(PROPERTY_FORMAT);
    }
    /**
     * @see ReprintableDocument#PROPERTY_FORMAT
     * 
     */
    public void setFormat(String format) {
        set(PROPERTY_FORMAT, format);
    }

    /**
     * @see ReprintableDocument#PROPERTY_ORDER
     * 
     */
    public Order getOrder() {
        return (Order) get(PROPERTY_ORDER);
    }
    /**
     * @see ReprintableDocument#PROPERTY_ORDER
     * 
     */
    public void setOrder(Order order) {
        set(PROPERTY_ORDER, order);
    }

    /**
     * @see ReprintableDocument#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see ReprintableDocument#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

}
