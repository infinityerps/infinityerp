
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
package org.openbravo.model.ad.system;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADSystem (stored in table AD_System).
 * <br>
 * Help: {@literal Common System Definition. Do NOT create additional records!!}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class System extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_System";
    public static final String ENTITY_NAME = "ADSystem";

    /**
     * Property id stored in column AD_System_ID in table AD_System 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_System 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_System 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_System 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_System 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property comments stored in column Info in table AD_System<br>
     * Help: {@literal The Information displays data from the source document line.}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property version stored in column Version in table AD_System<br>
     * Help: {@literal The Version indicates the version of this table definition.}
     * 
     */
    public static final String PROPERTY_VERSION = "version";

    /**
     * Property releaseNo stored in column ReleaseNo in table AD_System<br>
     * Help: {@literal Internal Release Number}
     * 
     */
    public static final String PROPERTY_RELEASENO = "releaseNo";

    /**
     * Property tADRecordrange stored in column TAD_Recordrange in table AD_System
     * 
     */
    public static final String PROPERTY_TADRECORDRANGE = "tADRecordrange";

    /**
     * Property tADTransactionalrange stored in column TAD_Transactionalrange in table AD_System
     * 
     */
    public static final String PROPERTY_TADTRANSACTIONALRANGE = "tADTransactionalrange";

    /**
     * Property tADTheme stored in column TAD_Theme in table AD_System
     * 
     */
    public static final String PROPERTY_TADTHEME = "tADTheme";

    /**
     * Property instanceKey stored in column Instance_Key in table AD_System
     * 
     */
    public static final String PROPERTY_INSTANCEKEY = "instanceKey";

    /**
     * Property activationKey stored in column Activation_Key in table AD_System
     * 
     */
    public static final String PROPERTY_ACTIVATIONKEY = "activationKey";


    public System() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TADRECORDRANGE, (long) 500);
        setDefaultValue(PROPERTY_TADTRANSACTIONALRANGE, (long) 1);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see System#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see System#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see System#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see System#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see System#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see System#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see System#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see System#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see System#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see System#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see System#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see System#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see System#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see System#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see System#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see System#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see System#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see System#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see System#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see System#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see System#PROPERTY_VERSION
     * 
     */
    public String getVersion() {
        return (String) get(PROPERTY_VERSION);
    }
    /**
     * @see System#PROPERTY_VERSION
     * 
     */
    public void setVersion(String version) {
        set(PROPERTY_VERSION, version);
    }

    /**
     * @see System#PROPERTY_RELEASENO
     * 
     */
    public String getReleaseNo() {
        return (String) get(PROPERTY_RELEASENO);
    }
    /**
     * @see System#PROPERTY_RELEASENO
     * 
     */
    public void setReleaseNo(String releaseNo) {
        set(PROPERTY_RELEASENO, releaseNo);
    }

    /**
     * @see System#PROPERTY_TADRECORDRANGE
     * 
     */
    public Long getTADRecordrange() {
        return (Long) get(PROPERTY_TADRECORDRANGE);
    }
    /**
     * @see System#PROPERTY_TADRECORDRANGE
     * 
     */
    public void setTADRecordrange(Long tADRecordrange) {
        set(PROPERTY_TADRECORDRANGE, tADRecordrange);
    }

    /**
     * @see System#PROPERTY_TADTRANSACTIONALRANGE
     * 
     */
    public Long getTADTransactionalrange() {
        return (Long) get(PROPERTY_TADTRANSACTIONALRANGE);
    }
    /**
     * @see System#PROPERTY_TADTRANSACTIONALRANGE
     * 
     */
    public void setTADTransactionalrange(Long tADTransactionalrange) {
        set(PROPERTY_TADTRANSACTIONALRANGE, tADTransactionalrange);
    }

    /**
     * @see System#PROPERTY_TADTHEME
     * 
     */
    public String getTADTheme() {
        return (String) get(PROPERTY_TADTHEME);
    }
    /**
     * @see System#PROPERTY_TADTHEME
     * 
     */
    public void setTADTheme(String tADTheme) {
        set(PROPERTY_TADTHEME, tADTheme);
    }

    /**
     * @see System#PROPERTY_INSTANCEKEY
     * 
     */
    public String getInstanceKey() {
        return (String) get(PROPERTY_INSTANCEKEY);
    }
    /**
     * @see System#PROPERTY_INSTANCEKEY
     * 
     */
    public void setInstanceKey(String instanceKey) {
        set(PROPERTY_INSTANCEKEY, instanceKey);
    }

    /**
     * @see System#PROPERTY_ACTIVATIONKEY
     * 
     */
    public String getActivationKey() {
        return (String) get(PROPERTY_ACTIVATIONKEY);
    }
    /**
     * @see System#PROPERTY_ACTIVATIONKEY
     * 
     */
    public void setActivationKey(String activationKey) {
        set(PROPERTY_ACTIVATIONKEY, activationKey);
    }

}
