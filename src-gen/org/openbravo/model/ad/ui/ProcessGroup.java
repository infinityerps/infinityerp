
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
package org.openbravo.model.ad.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ProcessGroup (stored in table AD_Process_Group).
 * <br>
 * Help: {@literal Create a Process Group to be executed in serials from the Process Request window}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessGroup extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Process_Group";
    public static final String ENTITY_NAME = "ProcessGroup";

    /**
     * Property id stored in column AD_Process_Group_ID in table AD_Process_Group<br>
     * Help: {@literal Process Group to be executed in serials from the Process Request window}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Process_Group 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Process_Group 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Process_Group 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Process_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Process_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Process_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Process_Group 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Process_Group 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Process_Group<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property preventConcurrentExecutions stored in column Preventconcurrent in table AD_Process_Group<br>
     * Help: {@literal When the process is scheduled as background process and this flag is set, in case there is
     *       another instance of this process already in execution, a new instance is not executed.}
     * 
     */
    public static final String PROPERTY_PREVENTCONCURRENTEXECUTIONS = "preventConcurrentExecutions";

    /**
     * Property stopTheGroupExecutionWhenAProcessFails stored in column Stopwhenfail in table AD_Process_Group<br>
     * Help: {@literal Stop the group execution when a process fails}
     * 
     */
    public static final String PROPERTY_STOPTHEGROUPEXECUTIONWHENAPROCESSFAILS = "stopTheGroupExecutionWhenAProcessFails";

    /**
     * Property module stored in column AD_Module_ID in table AD_Process_Group<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property processGroupListList stored in table AD_Process_Group
     * 
     */
    public static final String PROPERTY_PROCESSGROUPLISTLIST = "processGroupListList";


    public ProcessGroup() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PREVENTCONCURRENTEXECUTIONS, false);
        setDefaultValue(PROPERTY_STOPTHEGROUPEXECUTIONWHENAPROCESSFAILS, false);
        setDefaultValue(PROPERTY_PROCESSGROUPLISTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessGroup#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessGroup#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessGroup#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessGroup#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessGroup#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessGroup#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessGroup#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessGroup#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessGroup#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessGroup#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessGroup#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessGroup#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessGroup#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessGroup#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessGroup#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessGroup#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessGroup#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProcessGroup#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProcessGroup#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProcessGroup#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProcessGroup#PROPERTY_PREVENTCONCURRENTEXECUTIONS
     * 
     */
    public Boolean isPreventConcurrentExecutions() {
        return (Boolean) get(PROPERTY_PREVENTCONCURRENTEXECUTIONS);
    }
    /**
     * @see ProcessGroup#PROPERTY_PREVENTCONCURRENTEXECUTIONS
     * 
     */
    public void setPreventConcurrentExecutions(Boolean preventConcurrentExecutions) {
        set(PROPERTY_PREVENTCONCURRENTEXECUTIONS, preventConcurrentExecutions);
    }

    /**
     * @see ProcessGroup#PROPERTY_STOPTHEGROUPEXECUTIONWHENAPROCESSFAILS
     * 
     */
    public Boolean isStopTheGroupExecutionWhenAProcessFails() {
        return (Boolean) get(PROPERTY_STOPTHEGROUPEXECUTIONWHENAPROCESSFAILS);
    }
    /**
     * @see ProcessGroup#PROPERTY_STOPTHEGROUPEXECUTIONWHENAPROCESSFAILS
     * 
     */
    public void setStopTheGroupExecutionWhenAProcessFails(Boolean stopTheGroupExecutionWhenAProcessFails) {
        set(PROPERTY_STOPTHEGROUPEXECUTIONWHENAPROCESSFAILS, stopTheGroupExecutionWhenAProcessFails);
    }

    /**
     * @see ProcessGroup#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ProcessGroup#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * Help: {@literal Create a Process inside a Process Group with a sequence number}<br>
     * @see ProcessGroupList
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProcessGroupList> getProcessGroupListList() {
      return (List<ProcessGroupList>) get(PROPERTY_PROCESSGROUPLISTLIST);
    }

    /**
     * Help: {@literal Create a Process inside a Process Group with a sequence number}<br>
     * @see ProcessGroupList
     * 
     */
    public void setProcessGroupListList(List<ProcessGroupList> processGroupListList) {
        set(PROPERTY_PROCESSGROUPLISTLIST, processGroupListList);
    }

}
