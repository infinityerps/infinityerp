
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
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADAttachment (stored in table C_File).
 * <br>
 * Help: {@literal In this table are stored the files (using the name field) attached to different windows.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Attachment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_File";
    public static final String ENTITY_NAME = "ADAttachment";

    /**
     * Property id stored in column C_File_ID in table C_File<br>
     * Help: {@literal Attached file}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_File 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_File 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_File 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_File 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_File 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_File 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_File 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_File 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property dataType stored in column C_Datatype_ID in table C_File<br>
     * Help: {@literal Defines what kind of file is (txt, pdf, xls...).}
     * 
     */
    public static final String PROPERTY_DATATYPE = "dataType";

    /**
     * Property sequenceNumber stored in column SeqNo in table C_File<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property text stored in column Text in table C_File<br>
     * Help: {@literal The Text field stores the user entered information.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_TEXT = "text";

    /**
     * Property table stored in column AD_Table_ID in table C_File<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property record stored in column AD_Record_ID in table C_File<br>
     * Help: {@literal Record contains the key of the record the file is attached to. This key may belong to any
     *       table that's why this column is generic and not specific for any table.}
     * 
     */
    public static final String PROPERTY_RECORD = "record";

    /**
     * Property path stored in column Path in table C_File<br>
     * Help: {@literal Location of the file relative to the attachments folder}
     * 
     */
    public static final String PROPERTY_PATH = "path";

    /**
     * Property attachmentConf stored in column C_Attachment_Conf_ID in table C_File<br>
     * Help: {@literal Unique Identifier for Attachment Configuration used.}
     * 
     */
    public static final String PROPERTY_ATTACHMENTCONF = "attachmentConf";


    public Attachment() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Attachment#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Attachment#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Attachment#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Attachment#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Attachment#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Attachment#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Attachment#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Attachment#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Attachment#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Attachment#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Attachment#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Attachment#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Attachment#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Attachment#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Attachment#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Attachment#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Attachment#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Attachment#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Attachment#PROPERTY_DATATYPE
     * 
     */
    public String getDataType() {
        return (String) get(PROPERTY_DATATYPE);
    }
    /**
     * @see Attachment#PROPERTY_DATATYPE
     * 
     */
    public void setDataType(String dataType) {
        set(PROPERTY_DATATYPE, dataType);
    }

    /**
     * @see Attachment#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see Attachment#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see Attachment#PROPERTY_TEXT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getText() {
        return (String) get(PROPERTY_TEXT);
    }
    /**
     * @see Attachment#PROPERTY_TEXT
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setText(String text) {
        set(PROPERTY_TEXT, text);
    }

    /**
     * @see Attachment#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see Attachment#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see Attachment#PROPERTY_RECORD
     * 
     */
    public String getRecord() {
        return (String) get(PROPERTY_RECORD);
    }
    /**
     * @see Attachment#PROPERTY_RECORD
     * 
     */
    public void setRecord(String record) {
        set(PROPERTY_RECORD, record);
    }

    /**
     * @see Attachment#PROPERTY_PATH
     * 
     */
    public String getPath() {
        return (String) get(PROPERTY_PATH);
    }
    /**
     * @see Attachment#PROPERTY_PATH
     * 
     */
    public void setPath(String path) {
        set(PROPERTY_PATH, path);
    }

    /**
     * @see Attachment#PROPERTY_ATTACHMENTCONF
     * 
     */
    public AttachmentConfig getAttachmentConf() {
        return (AttachmentConfig) get(PROPERTY_ATTACHMENTCONF);
    }
    /**
     * @see Attachment#PROPERTY_ATTACHMENTCONF
     * 
     */
    public void setAttachmentConf(AttachmentConfig attachmentConf) {
        set(PROPERTY_ATTACHMENTCONF, attachmentConf);
    }

}
