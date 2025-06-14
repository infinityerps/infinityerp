
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

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity AD_Audit_Trail (stored in table AD_Audit_Trail_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AuditTrail extends BaseOBObject implements ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Audit_Trail_V";
    public static final String ENTITY_NAME = "AD_Audit_Trail";

    /**
     * Property id stored in column AD_Audit_Trail_ID in table AD_Audit_Trail_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Audit_Trail_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Audit_Trail_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Audit_Trail_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Audit_Trail_V 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Audit_Trail_V<br>
     * Help: {@literal The Created By field indicates the user who created this record.}
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Audit_Trail_V 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Audit_Trail_V<br>
     * Help: {@literal The Updated By field indicates the user who updated this record.}
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property table stored in column AD_Table_ID in table AD_Audit_Trail_V<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property recordID stored in column Record_ID in table AD_Audit_Trail_V 
     * 
     */
    public static final String PROPERTY_RECORDID = "recordID";

    /**
     * Property recordRevision stored in column Record_Revision in table AD_Audit_Trail_V<br>
     * Help: {@literal It is a consecutive number that identifies a revision of a record. Each edition on a
     *       record in an audited table increases this revision by 1.}
     * 
     */
    public static final String PROPERTY_RECORDREVISION = "recordRevision";

    /**
     * Property userContact stored in column AD_User_ID in table AD_Audit_Trail_V<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property eventTime stored in column Event_Time in table AD_Audit_Trail_V 
     * 
     */
    public static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * Property processtype stored in column Processtype in table AD_Audit_Trail_V<br>
     * Help: {@literal Type of process that triggered the change.}
     * 
     */
    public static final String PROPERTY_PROCESSTYPE = "processtype";

    /**
     * Property process stored in column Process_ID in table AD_Audit_Trail_V<br>
     * Help: {@literal Identifies the process that triggered the change.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property action stored in column Action in table AD_Audit_Trail_V 
     * 
     */
    public static final String PROPERTY_ACTION = "action";

    /**
     * Property column stored in column AD_Column_ID in table AD_Audit_Trail_V<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property oLDChar stored in column OLD_Char in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_OLDCHAR = "oLDChar";

    /**
     * Property nEWChar stored in column NEW_Char in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_NEWCHAR = "nEWChar";

    /**
     * Property oLDNumber stored in column OLD_Number in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_OLDNUMBER = "oLDNumber";

    /**
     * Property nEWNumber stored in column NEW_Number in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_NEWNUMBER = "nEWNumber";

    /**
     * Property oLDDate stored in column OLD_Date in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_OLDDATE = "oLDDate";

    /**
     * Property nEWDate stored in column NEW_Date in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_NEWDATE = "nEWDate";

    /**
     * Property oldText stored in column OLD_Text in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_OLDTEXT = "oldText";

    /**
     * Property newText stored in column NEW_Text in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_NEWTEXT = "newText";

    /**
     * Property processDescription stored in column Process_Desc in table AD_Audit_Trail_V
     * 
     */
    public static final String PROPERTY_PROCESSDESCRIPTION = "processDescription";

    /**
     * Property oldValue stored in column OLD_Value in table AD_Audit_Trail_V<br>
     * Help: {@literal Old data overwritten in the field}
     * 
     */
    public static final String PROPERTY_OLDVALUE = "oldValue";

    /**
     * Property newValue stored in column NEW_Value in table AD_Audit_Trail_V<br>
     * Help: {@literal New data entered in the field}
     * 
     */
    public static final String PROPERTY_NEWVALUE = "newValue";


    public AuditTrail() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_CREATEDBY, "0");
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_UPDATEDBY, "0");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AuditTrail#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AuditTrail#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AuditTrail#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AuditTrail#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AuditTrail#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AuditTrail#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AuditTrail#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AuditTrail#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AuditTrail#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AuditTrail#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AuditTrail#PROPERTY_CREATEDBY
     * 
     */
    public String getCreatedBy() {
        return (String) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AuditTrail#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(String createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AuditTrail#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AuditTrail#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AuditTrail#PROPERTY_UPDATEDBY
     * 
     */
    public String getUpdatedBy() {
        return (String) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AuditTrail#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(String updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AuditTrail#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see AuditTrail#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see AuditTrail#PROPERTY_RECORDID
     * 
     */
    public String getRecordID() {
        return (String) get(PROPERTY_RECORDID);
    }
    /**
     * @see AuditTrail#PROPERTY_RECORDID
     * 
     */
    public void setRecordID(String recordID) {
        set(PROPERTY_RECORDID, recordID);
    }

    /**
     * @see AuditTrail#PROPERTY_RECORDREVISION
     * 
     */
    public Long getRecordRevision() {
        return (Long) get(PROPERTY_RECORDREVISION);
    }
    /**
     * @see AuditTrail#PROPERTY_RECORDREVISION
     * 
     */
    public void setRecordRevision(Long recordRevision) {
        set(PROPERTY_RECORDREVISION, recordRevision);
    }

    /**
     * @see AuditTrail#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see AuditTrail#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see AuditTrail#PROPERTY_EVENTTIME
     * 
     */
    public Date getEventTime() {
        return (Date) get(PROPERTY_EVENTTIME);
    }
    /**
     * @see AuditTrail#PROPERTY_EVENTTIME
     * 
     */
    public void setEventTime(Date eventTime) {
        set(PROPERTY_EVENTTIME, eventTime);
    }

    /**
     * @see AuditTrail#PROPERTY_PROCESSTYPE
     * 
     */
    public String getProcesstype() {
        return (String) get(PROPERTY_PROCESSTYPE);
    }
    /**
     * @see AuditTrail#PROPERTY_PROCESSTYPE
     * 
     */
    public void setProcesstype(String processtype) {
        set(PROPERTY_PROCESSTYPE, processtype);
    }

    /**
     * @see AuditTrail#PROPERTY_PROCESS
     * 
     */
    public String getProcess() {
        return (String) get(PROPERTY_PROCESS);
    }
    /**
     * @see AuditTrail#PROPERTY_PROCESS
     * 
     */
    public void setProcess(String process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see AuditTrail#PROPERTY_ACTION
     * 
     */
    public String getAction() {
        return (String) get(PROPERTY_ACTION);
    }
    /**
     * @see AuditTrail#PROPERTY_ACTION
     * 
     */
    public void setAction(String action) {
        set(PROPERTY_ACTION, action);
    }

    /**
     * @see AuditTrail#PROPERTY_COLUMN
     * 
     */
    public Column getColumn() {
        return (Column) get(PROPERTY_COLUMN);
    }
    /**
     * @see AuditTrail#PROPERTY_COLUMN
     * 
     */
    public void setColumn(Column column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see AuditTrail#PROPERTY_OLDCHAR
     * 
     */
    public String getOLDChar() {
        return (String) get(PROPERTY_OLDCHAR);
    }
    /**
     * @see AuditTrail#PROPERTY_OLDCHAR
     * 
     */
    public void setOLDChar(String oLDChar) {
        set(PROPERTY_OLDCHAR, oLDChar);
    }

    /**
     * @see AuditTrail#PROPERTY_NEWCHAR
     * 
     */
    public String getNEWChar() {
        return (String) get(PROPERTY_NEWCHAR);
    }
    /**
     * @see AuditTrail#PROPERTY_NEWCHAR
     * 
     */
    public void setNEWChar(String nEWChar) {
        set(PROPERTY_NEWCHAR, nEWChar);
    }

    /**
     * @see AuditTrail#PROPERTY_OLDNUMBER
     * 
     */
    public BigDecimal getOLDNumber() {
        return (BigDecimal) get(PROPERTY_OLDNUMBER);
    }
    /**
     * @see AuditTrail#PROPERTY_OLDNUMBER
     * 
     */
    public void setOLDNumber(BigDecimal oLDNumber) {
        set(PROPERTY_OLDNUMBER, oLDNumber);
    }

    /**
     * @see AuditTrail#PROPERTY_NEWNUMBER
     * 
     */
    public BigDecimal getNEWNumber() {
        return (BigDecimal) get(PROPERTY_NEWNUMBER);
    }
    /**
     * @see AuditTrail#PROPERTY_NEWNUMBER
     * 
     */
    public void setNEWNumber(BigDecimal nEWNumber) {
        set(PROPERTY_NEWNUMBER, nEWNumber);
    }

    /**
     * @see AuditTrail#PROPERTY_OLDDATE
     * 
     */
    public Date getOLDDate() {
        return (Date) get(PROPERTY_OLDDATE);
    }
    /**
     * @see AuditTrail#PROPERTY_OLDDATE
     * 
     */
    public void setOLDDate(Date oLDDate) {
        set(PROPERTY_OLDDATE, oLDDate);
    }

    /**
     * @see AuditTrail#PROPERTY_NEWDATE
     * 
     */
    public Date getNEWDate() {
        return (Date) get(PROPERTY_NEWDATE);
    }
    /**
     * @see AuditTrail#PROPERTY_NEWDATE
     * 
     */
    public void setNEWDate(Date nEWDate) {
        set(PROPERTY_NEWDATE, nEWDate);
    }

    /**
     * @see AuditTrail#PROPERTY_OLDTEXT
     * 
     */
    public String getOldText() {
        return (String) get(PROPERTY_OLDTEXT);
    }
    /**
     * @see AuditTrail#PROPERTY_OLDTEXT
     * 
     */
    public void setOldText(String oldText) {
        set(PROPERTY_OLDTEXT, oldText);
    }

    /**
     * @see AuditTrail#PROPERTY_NEWTEXT
     * 
     */
    public String getNewText() {
        return (String) get(PROPERTY_NEWTEXT);
    }
    /**
     * @see AuditTrail#PROPERTY_NEWTEXT
     * 
     */
    public void setNewText(String newText) {
        set(PROPERTY_NEWTEXT, newText);
    }

    /**
     * @see AuditTrail#PROPERTY_PROCESSDESCRIPTION
     * 
     */
    public String getProcessDescription() {
        return (String) get(PROPERTY_PROCESSDESCRIPTION);
    }
    /**
     * @see AuditTrail#PROPERTY_PROCESSDESCRIPTION
     * 
     */
    public void setProcessDescription(String processDescription) {
        set(PROPERTY_PROCESSDESCRIPTION, processDescription);
    }

    /**
     * @see AuditTrail#PROPERTY_OLDVALUE
     * 
     */
    public String getOldValue() {
        return (String) get(PROPERTY_OLDVALUE);
    }
    /**
     * @see AuditTrail#PROPERTY_OLDVALUE
     * 
     */
    public void setOldValue(String oldValue) {
        set(PROPERTY_OLDVALUE, oldValue);
    }

    /**
     * @see AuditTrail#PROPERTY_NEWVALUE
     * 
     */
    public String getNewValue() {
        return (String) get(PROPERTY_NEWVALUE);
    }
    /**
     * @see AuditTrail#PROPERTY_NEWVALUE
     * 
     */
    public void setNewValue(String newValue) {
        set(PROPERTY_NEWVALUE, newValue);
    }

}
