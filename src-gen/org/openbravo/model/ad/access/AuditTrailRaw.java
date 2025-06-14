
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
package org.openbravo.model.ad.access;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity AD_Audit_Trail_Raw (stored in table AD_Audit_Trail).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AuditTrailRaw extends BaseOBObject implements ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Audit_Trail";
    public static final String ENTITY_NAME = "AD_Audit_Trail_Raw";

    /**
     * Property id stored in column AD_Audit_Trail_ID in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Audit_Trail 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Audit_Trail 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Audit_Trail 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Audit_Trail<br>
     * Help: {@literal The Created By field indicates the user who created this record.}
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Audit_Trail<br>
     * Help: {@literal The Updated By field indicates the user who updated this record.}
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property table stored in column AD_Table_ID in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property recordID stored in column Record_ID in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_RECORDID = "recordID";

    /**
     * Property recordRevision stored in column Record_Revision in table AD_Audit_Trail<br>
     * Help: {@literal It is a consecutive number that identifies a revision of a record. Each edition on a
     *       record in an audited table increases this revision by 1.}
     * 
     */
    public static final String PROPERTY_RECORDREVISION = "recordRevision";

    /**
     * Property userContact stored in column AD_User_ID in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property eventTime stored in column Event_Time in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * Property processType stored in column Processtype in table AD_Audit_Trail<br>
     * Help: {@literal Type of process that triggered the change.}
     * 
     */
    public static final String PROPERTY_PROCESSTYPE = "processType";

    /**
     * Property process stored in column Process_ID in table AD_Audit_Trail<br>
     * Help: {@literal Identifies the process that triggered the change.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property action stored in column Action in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_ACTION = "action";

    /**
     * Property column stored in column AD_Column_ID in table AD_Audit_Trail 
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property oldChar stored in column OLD_Char in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_OLDCHAR = "oldChar";

    /**
     * Property newChar stored in column NEW_Char in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_NEWCHAR = "newChar";

    /**
     * Property oldNumber stored in column OLD_Number in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_OLDNUMBER = "oldNumber";

    /**
     * Property newNumber stored in column NEW_Number in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_NEWNUMBER = "newNumber";

    /**
     * Property oldDate stored in column OLD_Date in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_OLDDATE = "oldDate";

    /**
     * Property newDate stored in column NEW_Date in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_NEWDATE = "newDate";

    /**
     * Property oldText stored in column OLD_Text in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_OLDTEXT = "oldText";

    /**
     * Property newText stored in column NEW_Text in table AD_Audit_Trail
     * 
     */
    public static final String PROPERTY_NEWTEXT = "newText";


    public AuditTrailRaw() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATEDBY, "0");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AuditTrailRaw#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_CREATEDBY
     * 
     */
    public String getCreatedBy() {
        return (String) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(String createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_UPDATEDBY
     * 
     */
    public String getUpdatedBy() {
        return (String) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(String updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_TABLE
     * 
     */
    public String getTable() {
        return (String) get(PROPERTY_TABLE);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_TABLE
     * 
     */
    public void setTable(String table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_RECORDID
     * 
     */
    public String getRecordID() {
        return (String) get(PROPERTY_RECORDID);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_RECORDID
     * 
     */
    public void setRecordID(String recordID) {
        set(PROPERTY_RECORDID, recordID);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_RECORDREVISION
     * 
     */
    public Long getRecordRevision() {
        return (Long) get(PROPERTY_RECORDREVISION);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_RECORDREVISION
     * 
     */
    public void setRecordRevision(Long recordRevision) {
        set(PROPERTY_RECORDREVISION, recordRevision);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_USERCONTACT
     * 
     */
    public String getUserContact() {
        return (String) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(String userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_EVENTTIME
     * 
     */
    public Date getEventTime() {
        return (Date) get(PROPERTY_EVENTTIME);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_EVENTTIME
     * 
     */
    public void setEventTime(Date eventTime) {
        set(PROPERTY_EVENTTIME, eventTime);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_PROCESSTYPE
     * 
     */
    public String getProcessType() {
        return (String) get(PROPERTY_PROCESSTYPE);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_PROCESSTYPE
     * 
     */
    public void setProcessType(String processType) {
        set(PROPERTY_PROCESSTYPE, processType);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_PROCESS
     * 
     */
    public String getProcess() {
        return (String) get(PROPERTY_PROCESS);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_PROCESS
     * 
     */
    public void setProcess(String process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_ACTION
     * 
     */
    public String getAction() {
        return (String) get(PROPERTY_ACTION);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_ACTION
     * 
     */
    public void setAction(String action) {
        set(PROPERTY_ACTION, action);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_COLUMN
     * 
     */
    public String getColumn() {
        return (String) get(PROPERTY_COLUMN);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_COLUMN
     * 
     */
    public void setColumn(String column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_OLDCHAR
     * 
     */
    public String getOldChar() {
        return (String) get(PROPERTY_OLDCHAR);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_OLDCHAR
     * 
     */
    public void setOldChar(String oldChar) {
        set(PROPERTY_OLDCHAR, oldChar);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_NEWCHAR
     * 
     */
    public String getNewChar() {
        return (String) get(PROPERTY_NEWCHAR);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_NEWCHAR
     * 
     */
    public void setNewChar(String newChar) {
        set(PROPERTY_NEWCHAR, newChar);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_OLDNUMBER
     * 
     */
    public BigDecimal getOldNumber() {
        return (BigDecimal) get(PROPERTY_OLDNUMBER);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_OLDNUMBER
     * 
     */
    public void setOldNumber(BigDecimal oldNumber) {
        set(PROPERTY_OLDNUMBER, oldNumber);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_NEWNUMBER
     * 
     */
    public BigDecimal getNewNumber() {
        return (BigDecimal) get(PROPERTY_NEWNUMBER);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_NEWNUMBER
     * 
     */
    public void setNewNumber(BigDecimal newNumber) {
        set(PROPERTY_NEWNUMBER, newNumber);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_OLDDATE
     * 
     */
    public Date getOldDate() {
        return (Date) get(PROPERTY_OLDDATE);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_OLDDATE
     * 
     */
    public void setOldDate(Date oldDate) {
        set(PROPERTY_OLDDATE, oldDate);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_NEWDATE
     * 
     */
    public Date getNewDate() {
        return (Date) get(PROPERTY_NEWDATE);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_NEWDATE
     * 
     */
    public void setNewDate(Date newDate) {
        set(PROPERTY_NEWDATE, newDate);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_OLDTEXT
     * 
     */
    public String getOldText() {
        return (String) get(PROPERTY_OLDTEXT);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_OLDTEXT
     * 
     */
    public void setOldText(String oldText) {
        set(PROPERTY_OLDTEXT, oldText);
    }

    /**
     * @see AuditTrailRaw#PROPERTY_NEWTEXT
     * 
     */
    public String getNewText() {
        return (String) get(PROPERTY_NEWTEXT);
    }
    /**
     * @see AuditTrailRaw#PROPERTY_NEWTEXT
     * 
     */
    public void setNewText(String newText) {
        set(PROPERTY_NEWTEXT, newText);
    }

}
