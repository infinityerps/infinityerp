
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.manufacturing.cost.CostCenter;
import org.openbravo.model.manufacturing.floorshop.WorkCenter;
import org.openbravo.model.manufacturing.processplan.Operation;
/**
 * Entity class for entity ManufacturingActivity (stored in table MA_Process).
 * <br>
 * Help: {@literal In this table are described the different processes that are done in the work station.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Activity extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Process";
    public static final String ENTITY_NAME = "ManufacturingActivity";

    /**
     * Property id stored in column MA_Process_ID in table MA_Process<br>
     * Help: {@literal Indicates a manufacturing process of the enterprise.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Process 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Process 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Process 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Process 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table MA_Process 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property searchKey stored in column Value in table MA_Process<br>
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
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property workCenter stored in column MA_Workstation_ID in table MA_Process<br>
     * Help: {@literal Indicates a Work Station of the enterprise.}
     * 
     */
    public static final String PROPERTY_WORKCENTER = "workCenter";

    /**
     * Property description stored in column Description in table MA_Process<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property costCenter stored in column MA_Costcenter_ID in table MA_Process<br>
     * Help: {@literal Identifies a cost center.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property manufacturingActivityToolsetList stored in table MA_Process
     * 
     */
    public static final String PROPERTY_MANUFACTURINGACTIVITYTOOLSETLIST = "manufacturingActivityToolsetList";

    /**
     * Property manufacturingOperationList stored in table MA_Process
     * 
     */
    public static final String PROPERTY_MANUFACTURINGOPERATIONLIST = "manufacturingOperationList";


    public Activity() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MANUFACTURINGACTIVITYTOOLSETLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGOPERATIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Activity#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Activity#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Activity#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Activity#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Activity#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Activity#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Activity#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Activity#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Activity#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Activity#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Activity#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Activity#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Activity#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Activity#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Activity#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Activity#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Activity#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Activity#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Activity#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Activity#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Activity#PROPERTY_WORKCENTER
     * 
     */
    public WorkCenter getWorkCenter() {
        return (WorkCenter) get(PROPERTY_WORKCENTER);
    }
    /**
     * @see Activity#PROPERTY_WORKCENTER
     * 
     */
    public void setWorkCenter(WorkCenter workCenter) {
        set(PROPERTY_WORKCENTER, workCenter);
    }

    /**
     * @see Activity#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Activity#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Activity#PROPERTY_COSTCENTER
     * 
     */
    public CostCenter getCostCenter() {
        return (CostCenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see Activity#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(CostCenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * Help: {@literal This tab is used to indicate the different toolsets used in the selected process.
     *       This tab
     *       is used to indicate the different toolsets used in the selected process.}<br>
     * @see ActivityToolset
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ActivityToolset> getManufacturingActivityToolsetList() {
      return (List<ActivityToolset>) get(PROPERTY_MANUFACTURINGACTIVITYTOOLSETLIST);
    }

    /**
     * Help: {@literal This tab is used to indicate the different toolsets used in the selected process.
     *       This tab
     *       is used to indicate the different toolsets used in the selected process.}<br>
     * @see ActivityToolset
     * 
     */
    public void setManufacturingActivityToolsetList(List<ActivityToolset> manufacturingActivityToolsetList) {
        set(PROPERTY_MANUFACTURINGACTIVITYTOOLSETLIST, manufacturingActivityToolsetList);
    }

    /**
     * Help: {@literal In the Sequence table there are defined all the processes that belongs to the selected
     *       process plan.}<br>
     * @see Operation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Operation> getManufacturingOperationList() {
      return (List<Operation>) get(PROPERTY_MANUFACTURINGOPERATIONLIST);
    }

    /**
     * Help: {@literal In the Sequence table there are defined all the processes that belongs to the selected
     *       process plan.}<br>
     * @see Operation
     * 
     */
    public void setManufacturingOperationList(List<Operation> manufacturingOperationList) {
        set(PROPERTY_MANUFACTURINGOPERATIONLIST, manufacturingOperationList);
    }

}
