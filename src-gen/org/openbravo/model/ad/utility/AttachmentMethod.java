
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
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity AttachmentMethod (stored in table C_Attachment_Method).
 * <br>
 * Help: {@literal Defines different attachment methods that can be used in order to save attachment files.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AttachmentMethod extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Attachment_Method";
    public static final String ENTITY_NAME = "AttachmentMethod";

    /**
     * Property id stored in column C_Attachment_Method_ID in table C_Attachment_Method<br>
     * Help: {@literal Identifies an Attachment Method available in the System.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Attachment_Method 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Attachment_Method 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Attachment_Method 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Attachment_Method 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Attachment_Method 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Attachment_Method 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Attachment_Method 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property module stored in column AD_Module_ID in table C_Attachment_Method<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property name stored in column Name in table C_Attachment_Method 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property value stored in column Value in table C_Attachment_Method<br>
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
    public static final String PROPERTY_VALUE = "value";

    /**
     * Property supportReprintableDocuments stored in column Support_Reprintable_Doc in table C_Attachment_Method<br>
     * Help: {@literal Indicates whether the attachment method supports storing reprintable documents}
     * 
     */
    public static final String PROPERTY_SUPPORTREPRINTABLEDOCUMENTS = "supportReprintableDocuments";


    public AttachmentMethod() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUPPORTREPRINTABLEDOCUMENTS, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AttachmentMethod#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AttachmentMethod#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AttachmentMethod#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AttachmentMethod#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AttachmentMethod#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AttachmentMethod#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AttachmentMethod#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AttachmentMethod#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AttachmentMethod#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AttachmentMethod#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AttachmentMethod#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AttachmentMethod#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AttachmentMethod#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AttachmentMethod#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AttachmentMethod#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AttachmentMethod#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AttachmentMethod#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see AttachmentMethod#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see AttachmentMethod#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AttachmentMethod#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AttachmentMethod#PROPERTY_VALUE
     * 
     */
    public String getValue() {
        return (String) get(PROPERTY_VALUE);
    }
    /**
     * @see AttachmentMethod#PROPERTY_VALUE
     * 
     */
    public void setValue(String value) {
        set(PROPERTY_VALUE, value);
    }

    /**
     * @see AttachmentMethod#PROPERTY_SUPPORTREPRINTABLEDOCUMENTS
     * 
     */
    public Boolean isSupportReprintableDocuments() {
        return (Boolean) get(PROPERTY_SUPPORTREPRINTABLEDOCUMENTS);
    }
    /**
     * @see AttachmentMethod#PROPERTY_SUPPORTREPRINTABLEDOCUMENTS
     * 
     */
    public void setSupportReprintableDocuments(Boolean supportReprintableDocuments) {
        set(PROPERTY_SUPPORTREPRINTABLEDOCUMENTS, supportReprintableDocuments);
    }

}
