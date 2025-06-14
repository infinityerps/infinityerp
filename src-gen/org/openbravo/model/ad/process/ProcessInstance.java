
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
package org.openbravo.model.ad.process;

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
import org.openbravo.model.ad.ui.Process;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADProcessInstance (stored in table AD_PInstance).
 * <br>
 * Help: {@literal This table is used internally by the application. Whenever a process is called a new line
     *       is added to this table including the process identifier and the record that called the process.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessInstance extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_PInstance";
    public static final String ENTITY_NAME = "ADProcessInstance";

    /**
     * Property id stored in column AD_PInstance_ID in table AD_PInstance<br>
     * Help: {@literal Process Instance identifies the instance of a process. Every time a process is executed a
     *       new instance of it is created.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property process stored in column AD_Process_ID in table AD_PInstance<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property recordID stored in column Record_ID in table AD_PInstance<br>
     * Help: {@literal The Record ID is the internal unique identifier of a record}
     * 
     */
    public static final String PROPERTY_RECORDID = "recordID";

    /**
     * Property processing stored in column IsProcessing in table AD_PInstance<br>
     * Help: {@literal When the process is being accomplished this record has 'Y' value, otherwise it has 'N'.}
     * 
     */
    public static final String PROPERTY_PROCESSING = "processing";

    /**
     * Property creationDate stored in column Created in table AD_PInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property userContact stored in column AD_User_ID in table AD_PInstance<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property updated stored in column Updated in table AD_PInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property result stored in column Result in table AD_PInstance<br>
     * Help: {@literal The Result indicates the result of any action taken on this request.}
     * 
     */
    public static final String PROPERTY_RESULT = "result";

    /**
     * Property errorMsg stored in column ErrorMsg in table AD_PInstance<br>
     * Help: {@literal In this filed is stored the error message in case the process fails.}
     * 
     */
    public static final String PROPERTY_ERRORMSG = "errorMsg";

    /**
     * Property client stored in column AD_Client_ID in table AD_PInstance 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_PInstance 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property createdBy stored in column CreatedBy in table AD_PInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_PInstance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column IsActive in table AD_PInstance 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property aDParameterList stored in table AD_PInstance
     * 
     */
    public static final String PROPERTY_ADPARAMETERLIST = "aDParameterList";


    public ProcessInstance() {
        setDefaultValue(PROPERTY_PROCESSING, false);
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ADPARAMETERLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessInstance#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessInstance#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessInstance#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see ProcessInstance#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see ProcessInstance#PROPERTY_RECORDID
     * 
     */
    public String getRecordID() {
        return (String) get(PROPERTY_RECORDID);
    }
    /**
     * @see ProcessInstance#PROPERTY_RECORDID
     * 
     */
    public void setRecordID(String recordID) {
        set(PROPERTY_RECORDID, recordID);
    }

    /**
     * @see ProcessInstance#PROPERTY_PROCESSING
     * 
     */
    public Boolean isProcessing() {
        return (Boolean) get(PROPERTY_PROCESSING);
    }
    /**
     * @see ProcessInstance#PROPERTY_PROCESSING
     * 
     */
    public void setProcessing(Boolean processing) {
        set(PROPERTY_PROCESSING, processing);
    }

    /**
     * @see ProcessInstance#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessInstance#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessInstance#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see ProcessInstance#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see ProcessInstance#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessInstance#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessInstance#PROPERTY_RESULT
     * 
     */
    public Long getResult() {
        return (Long) get(PROPERTY_RESULT);
    }
    /**
     * @see ProcessInstance#PROPERTY_RESULT
     * 
     */
    public void setResult(Long result) {
        set(PROPERTY_RESULT, result);
    }

    /**
     * @see ProcessInstance#PROPERTY_ERRORMSG
     * 
     */
    public String getErrorMsg() {
        return (String) get(PROPERTY_ERRORMSG);
    }
    /**
     * @see ProcessInstance#PROPERTY_ERRORMSG
     * 
     */
    public void setErrorMsg(String errorMsg) {
        set(PROPERTY_ERRORMSG, errorMsg);
    }

    /**
     * @see ProcessInstance#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessInstance#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessInstance#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessInstance#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessInstance#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessInstance#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessInstance#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessInstance#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessInstance#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessInstance#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * Help: {@literal Process Instance Parameter contains the values of the parameters that are passed to a
     *       process instance.}<br>
     * @see Parameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Parameter> getADParameterList() {
      return (List<Parameter>) get(PROPERTY_ADPARAMETERLIST);
    }

    /**
     * Help: {@literal Process Instance Parameter contains the values of the parameters that are passed to a
     *       process instance.}<br>
     * @see Parameter
     * 
     */
    public void setADParameterList(List<Parameter> aDParameterList) {
        set(PROPERTY_ADPARAMETERLIST, aDParameterList);
    }

}
