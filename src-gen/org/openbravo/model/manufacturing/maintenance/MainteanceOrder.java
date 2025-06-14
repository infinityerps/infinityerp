
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
package org.openbravo.model.manufacturing.maintenance;

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
 * Entity class for entity ManufacturingMainteanceOrder (stored in table MA_Maint_Part).
 * <br>
 * Help: {@literal In this table are stored all the maintenance parts.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MainteanceOrder extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Maint_Part";
    public static final String ENTITY_NAME = "ManufacturingMainteanceOrder";

    /**
     * Property id stored in column MA_Maint_Part_ID in table MA_Maint_Part<br>
     * Help: {@literal Identifies a maintenance part.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Maint_Part 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Maint_Part 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Maint_Part 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Maint_Part 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Maint_Part 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Maint_Part 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Maint_Part 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentNo stored in column DocumentNo in table MA_Maint_Part 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property maintenanceOrderDate stored in column Partdate in table MA_Maint_Part<br>
     * Help: {@literal Date of the part.}
     * 
     */
    public static final String PROPERTY_MAINTENANCEORDERDATE = "maintenanceOrderDate";

    /**
     * Property shift stored in column Shift in table MA_Maint_Part<br>
     * Help: {@literal Indicates the shift when the group is going to be measured. Available options are morning
     *       and swing shift}
     * 
     */
    public static final String PROPERTY_SHIFT = "shift";

    /**
     * Property createScheduledMaintenances stored in column CreateMaint in table MA_Maint_Part<br>
     * Help: {@literal Process to insert in the part the scheduled maintenances.}
     * 
     */
    public static final String PROPERTY_CREATESCHEDULEDMAINTENANCES = "createScheduledMaintenances";


    public MainteanceOrder() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATESCHEDULEDMAINTENANCES, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MainteanceOrder#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MainteanceOrder#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MainteanceOrder#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MainteanceOrder#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MainteanceOrder#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MainteanceOrder#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MainteanceOrder#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MainteanceOrder#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MainteanceOrder#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MainteanceOrder#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MainteanceOrder#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MainteanceOrder#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MainteanceOrder#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MainteanceOrder#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MainteanceOrder#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MainteanceOrder#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MainteanceOrder#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see MainteanceOrder#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see MainteanceOrder#PROPERTY_MAINTENANCEORDERDATE
     * 
     */
    public Date getMaintenanceOrderDate() {
        return (Date) get(PROPERTY_MAINTENANCEORDERDATE);
    }
    /**
     * @see MainteanceOrder#PROPERTY_MAINTENANCEORDERDATE
     * 
     */
    public void setMaintenanceOrderDate(Date maintenanceOrderDate) {
        set(PROPERTY_MAINTENANCEORDERDATE, maintenanceOrderDate);
    }

    /**
     * @see MainteanceOrder#PROPERTY_SHIFT
     * 
     */
    public String getShift() {
        return (String) get(PROPERTY_SHIFT);
    }
    /**
     * @see MainteanceOrder#PROPERTY_SHIFT
     * 
     */
    public void setShift(String shift) {
        set(PROPERTY_SHIFT, shift);
    }

    /**
     * @see MainteanceOrder#PROPERTY_CREATESCHEDULEDMAINTENANCES
     * 
     */
    public Boolean isCreateScheduledMaintenances() {
        return (Boolean) get(PROPERTY_CREATESCHEDULEDMAINTENANCES);
    }
    /**
     * @see MainteanceOrder#PROPERTY_CREATESCHEDULEDMAINTENANCES
     * 
     */
    public void setCreateScheduledMaintenances(Boolean createScheduledMaintenances) {
        set(PROPERTY_CREATESCHEDULEDMAINTENANCES, createScheduledMaintenances);
    }

}
