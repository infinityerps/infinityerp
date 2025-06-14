
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
package org.openbravo.model.manufacturing.transaction;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.manufacturing.floorshop.ToolsetType;
/**
 * Entity class for entity ManufacturingActivityToolset (stored in table MA_ToolsetProcess).
 * <br>
 * Help: {@literal This tab is used to indicate the different toolsets used in the selected process.
     *       This tab
     *       is used to indicate the different toolsets used in the selected process.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ActivityToolset extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_ToolsetProcess";
    public static final String ENTITY_NAME = "ManufacturingActivityToolset";

    /**
     * Property id stored in column MA_Toolsetprocess_ID in table MA_ToolsetProcess 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_ToolsetProcess 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_ToolsetProcess 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_ToolsetProcess 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_ToolsetProcess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_ToolsetProcess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_ToolsetProcess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_ToolsetProcess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property toolsetType stored in column MA_Toolset_Type_ID in table MA_ToolsetProcess<br>
     * Help: {@literal Indicates a Toolset Type of the enterprise.}
     * 
     */
    public static final String PROPERTY_TOOLSETTYPE = "toolsetType";

    /**
     * Property activity stored in column MA_Process_ID in table MA_ToolsetProcess<br>
     * Help: {@literal Indicates a manufacturing process of the enterprise.}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property utilizationCoefficient stored in column Usecoef in table MA_ToolsetProcess<br>
     * Help: {@literal Coefficient of use that indicates the number of time that the toolset is used while the
     *       work requirement phase is processed once.}
     * 
     */
    public static final String PROPERTY_UTILIZATIONCOEFFICIENT = "utilizationCoefficient";


    public ActivityToolset() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ActivityToolset#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ActivityToolset#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ActivityToolset#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ActivityToolset#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ActivityToolset#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ActivityToolset#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ActivityToolset#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ActivityToolset#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ActivityToolset#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ActivityToolset#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ActivityToolset#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ActivityToolset#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ActivityToolset#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ActivityToolset#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ActivityToolset#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ActivityToolset#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ActivityToolset#PROPERTY_TOOLSETTYPE
     * 
     */
    public ToolsetType getToolsetType() {
        return (ToolsetType) get(PROPERTY_TOOLSETTYPE);
    }
    /**
     * @see ActivityToolset#PROPERTY_TOOLSETTYPE
     * 
     */
    public void setToolsetType(ToolsetType toolsetType) {
        set(PROPERTY_TOOLSETTYPE, toolsetType);
    }

    /**
     * @see ActivityToolset#PROPERTY_ACTIVITY
     * 
     */
    public Activity getActivity() {
        return (Activity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see ActivityToolset#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(Activity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see ActivityToolset#PROPERTY_UTILIZATIONCOEFFICIENT
     * 
     */
    public Long getUtilizationCoefficient() {
        return (Long) get(PROPERTY_UTILIZATIONCOEFFICIENT);
    }
    /**
     * @see ActivityToolset#PROPERTY_UTILIZATIONCOEFFICIENT
     * 
     */
    public void setUtilizationCoefficient(Long utilizationCoefficient) {
        set(PROPERTY_UTILIZATIONCOEFFICIENT, utilizationCoefficient);
    }

}
