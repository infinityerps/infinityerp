
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
 * Entity class for entity ADClusterServiceSettings (stored in table AD_Cluster_Service_Settings).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ADClusterServiceSettings extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Cluster_Service_Settings";
    public static final String ENTITY_NAME = "ADClusterServiceSettings";

    /**
     * Property id stored in column AD_Cluster_Service_Settings_ID in table AD_Cluster_Service_Settings 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Cluster_Service_Settings 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Cluster_Service_Settings 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Cluster_Service_Settings 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Cluster_Service_Settings 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Cluster_Service_Settings 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Cluster_Service_Settings 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Cluster_Service_Settings 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property service stored in column Service in table AD_Cluster_Service_Settings 
     * 
     */
    public static final String PROPERTY_SERVICE = "service";

    /**
     * Property timeout stored in column Timeout in table AD_Cluster_Service_Settings<br>
     * Help: {@literal The timeout is the frequency (in seconds) which the ping for a cluster service is done,
     *       i.e., it represents the amount of time that should pass for the cluster node in charge of a cluster
     *       service to reaffirm itself as the leader. It is also used as a reference for the rest of the nodes
     *       in the cluster to determine if the leader is no longer alive and therefore if a new node should be
     *       promoted as the leader of the cluster service. Please note that it will be required to restart all
     *       the nodes in the cluster if this value is changed in order to make the new value visible for the
     *       entire cluster.}
     * 
     */
    public static final String PROPERTY_TIMEOUT = "timeout";

    /**
     * Property timeoutThreshold stored in column Timeout_Threshold in table AD_Cluster_Service_Settings<br>
     * Help: {@literal Specifies how much, as a percentage, a timeout can be delayed before another instance
     *       takes charge of a service. For instance, if timeout is 10s:
     *       - A threshold of 10 means that after
     *       10+(10*10/100)=11s with no ping from the instance that owns the service, other instance may take
     *       charge
     *       - A threshold of 50 means that after 10+(10*50/100)=15s with no ping from the instance that
     *       owns the service, other instance may take charge
     *       - A threshold of 200 means that after
     *       10+(10*200/100)=30s with no ping from the instance that owns the service, other instance may take
     *       charge}
     * 
     */
    public static final String PROPERTY_TIMEOUTTHRESHOLD = "timeoutThreshold";


    public ADClusterServiceSettings() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TIMEOUT, (long) 10);
        setDefaultValue(PROPERTY_TIMEOUTTHRESHOLD, (long) 100);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_SERVICE
     * 
     */
    public String getService() {
        return (String) get(PROPERTY_SERVICE);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_SERVICE
     * 
     */
    public void setService(String service) {
        set(PROPERTY_SERVICE, service);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_TIMEOUT
     * 
     */
    public Long getTimeout() {
        return (Long) get(PROPERTY_TIMEOUT);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_TIMEOUT
     * 
     */
    public void setTimeout(Long timeout) {
        set(PROPERTY_TIMEOUT, timeout);
    }

    /**
     * @see ADClusterServiceSettings#PROPERTY_TIMEOUTTHRESHOLD
     * 
     */
    public Long getTimeoutThreshold() {
        return (Long) get(PROPERTY_TIMEOUTTHRESHOLD);
    }
    /**
     * @see ADClusterServiceSettings#PROPERTY_TIMEOUTTHRESHOLD
     * 
     */
    public void setTimeoutThreshold(Long timeoutThreshold) {
        set(PROPERTY_TIMEOUTTHRESHOLD, timeoutThreshold);
    }

}
