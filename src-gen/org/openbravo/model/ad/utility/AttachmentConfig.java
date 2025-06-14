
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
/**
 * Entity class for entity AttachmentConfig (stored in table C_Attachment_Conf).
 * <br>
 * Help: {@literal Shows all data related to the attachment method used to save attachments (if applies):
     *       server URL, user, password and language.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AttachmentConfig extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Attachment_Conf";
    public static final String ENTITY_NAME = "AttachmentConfig";

    /**
     * Property id stored in column C_Attachment_Conf_ID in table C_Attachment_Conf<br>
     * Help: {@literal Unique Identifier for Attachment Configuration used.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Attachment_Conf 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Attachment_Conf 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Attachment_Conf 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Attachment_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Attachment_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Attachment_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Attachment_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property attachmentMethod stored in column C_Attachment_Method_ID in table C_Attachment_Conf<br>
     * Help: {@literal Identifies an Attachment Method available in the System.}
     * 
     */
    public static final String PROPERTY_ATTACHMENTMETHOD = "attachmentMethod";

    /**
     * Property attachmentType stored in column Attachment_Type in table C_Attachment_Conf<br>
     * Help: {@literal The type of attachments that can be stored with the attachment configuration. Two values
     *       are accepted:
     *        - “Standard Attachment” (SA): standard attachments linked to Openbravo records
     *        -
     *       “Reprintable Documents” (RD): reprintable documents stored as attachments. This option can only be
     *       used if the attachment method supports storing reprintable documents.}
     * 
     */
    public static final String PROPERTY_ATTACHMENTTYPE = "attachmentType";


    public AttachmentConfig() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ATTACHMENTTYPE, "SA");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AttachmentConfig#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AttachmentConfig#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AttachmentConfig#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AttachmentConfig#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AttachmentConfig#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AttachmentConfig#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AttachmentConfig#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AttachmentConfig#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AttachmentConfig#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AttachmentConfig#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AttachmentConfig#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AttachmentConfig#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AttachmentConfig#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AttachmentConfig#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AttachmentConfig#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AttachmentConfig#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AttachmentConfig#PROPERTY_ATTACHMENTMETHOD
     * 
     */
    public AttachmentMethod getAttachmentMethod() {
        return (AttachmentMethod) get(PROPERTY_ATTACHMENTMETHOD);
    }
    /**
     * @see AttachmentConfig#PROPERTY_ATTACHMENTMETHOD
     * 
     */
    public void setAttachmentMethod(AttachmentMethod attachmentMethod) {
        set(PROPERTY_ATTACHMENTMETHOD, attachmentMethod);
    }

    /**
     * @see AttachmentConfig#PROPERTY_ATTACHMENTTYPE
     * 
     */
    public String getAttachmentType() {
        return (String) get(PROPERTY_ATTACHMENTTYPE);
    }
    /**
     * @see AttachmentConfig#PROPERTY_ATTACHMENTTYPE
     * 
     */
    public void setAttachmentType(String attachmentType) {
        set(PROPERTY_ATTACHMENTTYPE, attachmentType);
    }

}
