
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
package org.openbravo.model.ad.alert;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
/**
 * Entity class for entity ADAlert (stored in table AD_Alert).
 * <br>
 * Help: {@literal This table stores a line per each of the raised alerts.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Alert extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Alert";
    public static final String ENTITY_NAME = "ADAlert";

    /**
     * Property id stored in column AD_Alert_ID in table AD_Alert 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Alert 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Alert 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Alert 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Alert 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Alert 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Alert 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Alert 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table AD_Alert<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property alertRule stored in column AD_AlertRule_ID in table AD_Alert<br>
     * Help: {@literal Definition of the alert element.}
     * 
     */
    public static final String PROPERTY_ALERTRULE = "alertRule";

    /**
     * Property role stored in column AD_Role_ID in table AD_Alert<br>
     * Help: {@literal The Role determines security and access a user who has this Role will have in the System.}
     * 
     */
    public static final String PROPERTY_ROLE = "role";

    /**
     * Property userContact stored in column AD_User_ID in table AD_Alert<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property fixed stored in column Isfixed in table AD_Alert<br>
     * Help: {@literal Is fixed}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_FIXED = "fixed";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table AD_Alert<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property comments stored in column Note in table AD_Alert<br>
     * Help: {@literal The Note field allows for optional entry of user defined information regarding this
     *       record}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property recordID stored in column Record_ID in table AD_Alert 
     * 
     */
    public static final String PROPERTY_RECORDID = "recordID";

    /**
     * Property referenceSearchKey stored in column Referencekey_ID in table AD_Alert<br>
     * Help: {@literal Reference Key identifies the record that raised the alert, in case that this record
     *       belongs to a table with only a key field this should be the value, otherwise it will be necessary to
     *       compose a value from the different keys of the table.}
     * 
     */
    public static final String PROPERTY_REFERENCESEARCHKEY = "referenceSearchKey";

    /**
     * Property alertStatus stored in column Status in table AD_Alert 
     * 
     */
    public static final String PROPERTY_ALERTSTATUS = "alertStatus";


    public Alert() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_FIXED, false);
        setDefaultValue(PROPERTY_ALERTSTATUS, "NEW");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Alert#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Alert#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Alert#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Alert#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Alert#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Alert#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Alert#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Alert#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Alert#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Alert#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Alert#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Alert#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Alert#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Alert#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Alert#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Alert#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Alert#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Alert#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Alert#PROPERTY_ALERTRULE
     * 
     */
    public AlertRule getAlertRule() {
        return (AlertRule) get(PROPERTY_ALERTRULE);
    }
    /**
     * @see Alert#PROPERTY_ALERTRULE
     * 
     */
    public void setAlertRule(AlertRule alertRule) {
        set(PROPERTY_ALERTRULE, alertRule);
    }

    /**
     * @see Alert#PROPERTY_ROLE
     * 
     */
    public Role getRole() {
        return (Role) get(PROPERTY_ROLE);
    }
    /**
     * @see Alert#PROPERTY_ROLE
     * 
     */
    public void setRole(Role role) {
        set(PROPERTY_ROLE, role);
    }

    /**
     * @see Alert#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see Alert#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see Alert#PROPERTY_FIXED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isFixed() {
        return (Boolean) get(PROPERTY_FIXED);
    }
    /**
     * @see Alert#PROPERTY_FIXED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setFixed(Boolean fixed) {
        set(PROPERTY_FIXED, fixed);
    }

    /**
     * @see Alert#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see Alert#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see Alert#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see Alert#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see Alert#PROPERTY_RECORDID
     * 
     */
    public String getRecordID() {
        return (String) get(PROPERTY_RECORDID);
    }
    /**
     * @see Alert#PROPERTY_RECORDID
     * 
     */
    public void setRecordID(String recordID) {
        set(PROPERTY_RECORDID, recordID);
    }

    /**
     * @see Alert#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public String getReferenceSearchKey() {
        return (String) get(PROPERTY_REFERENCESEARCHKEY);
    }
    /**
     * @see Alert#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public void setReferenceSearchKey(String referenceSearchKey) {
        set(PROPERTY_REFERENCESEARCHKEY, referenceSearchKey);
    }

    /**
     * @see Alert#PROPERTY_ALERTSTATUS
     * 
     */
    public String getAlertStatus() {
        return (String) get(PROPERTY_ALERTSTATUS);
    }
    /**
     * @see Alert#PROPERTY_ALERTSTATUS
     * 
     */
    public void setAlertStatus(String alertStatus) {
        set(PROPERTY_ALERTSTATUS, alertStatus);
    }

}
