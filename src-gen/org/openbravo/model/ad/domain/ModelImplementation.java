
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
package org.openbravo.model.ad.domain;

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
import org.openbravo.model.ad.ui.Form;
import org.openbravo.model.ad.ui.Process;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADModelImplementation (stored in table AD_Model_Object).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ModelImplementation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Model_Object";
    public static final String ENTITY_NAME = "ADModelImplementation";

    /**
     * Property id stored in column AD_Model_Object_ID in table AD_Model_Object<br>
     * Help: {@literal Identifies an object of the dictionary.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Model_Object 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Model_Object 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Model_Object 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Model_Object 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Model_Object 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Model_Object 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Model_Object 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property action stored in column Action in table AD_Model_Object<br>
     * Help: {@literal The Action field indicates the Action to be performed for this element.}
     * 
     */
    public static final String PROPERTY_ACTION = "action";

    /**
     * Property tab stored in column AD_Tab_ID in table AD_Model_Object<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property javaClassName stored in column Classname in table AD_Model_Object 
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property default stored in column IsDefault in table AD_Model_Object<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property process stored in column AD_Process_ID in table AD_Model_Object<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property specialForm stored in column AD_Form_ID in table AD_Model_Object<br>
     * Help: {@literal The Special Form field identifies a unique Special Form in the system.}
     * 
     */
    public static final String PROPERTY_SPECIALFORM = "specialForm";

    /**
     * Property reference stored in column AD_Reference_ID in table AD_Model_Object<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property callout stored in column AD_Callout_ID in table AD_Model_Object<br>
     * Help: {@literal The callout that will be fired when the content of a is modified.}
     * 
     */
    public static final String PROPERTY_CALLOUT = "callout";

    /**
     * Property module stored in column AD_Module_ID in table AD_Model_Object<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property objectType stored in column Object_Type in table AD_Model_Object<br>
     * Help: {@literal Type of the requested model object.}
     * 
     */
    public static final String PROPERTY_OBJECTTYPE = "objectType";

    /**
     * Property loadOnStartUp stored in column Loadonstartup in table AD_Model_Object
     * 
     */
    public static final String PROPERTY_LOADONSTARTUP = "loadOnStartUp";

    /**
     * Property sequenceNumber stored in column Seqno in table AD_Model_Object<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property name stored in column Name in table AD_Model_Object 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property aDModelImplementationMappingList stored in table AD_Model_Object
     * 
     */
    public static final String PROPERTY_ADMODELIMPLEMENTATIONMAPPINGLIST = "aDModelImplementationMappingList";

    /**
     * Property modelImplementationParameterList stored in table AD_Model_Object
     * 
     */
    public static final String PROPERTY_MODELIMPLEMENTATIONPARAMETERLIST = "modelImplementationParameterList";


    public ModelImplementation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_OBJECTTYPE, "S");
        setDefaultValue(PROPERTY_ADMODELIMPLEMENTATIONMAPPINGLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MODELIMPLEMENTATIONPARAMETERLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ModelImplementation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ModelImplementation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ModelImplementation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ModelImplementation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ModelImplementation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ModelImplementation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ModelImplementation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ModelImplementation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ModelImplementation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ModelImplementation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ModelImplementation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ModelImplementation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ModelImplementation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ModelImplementation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ModelImplementation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ModelImplementation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ModelImplementation#PROPERTY_ACTION
     * 
     */
    public String getAction() {
        return (String) get(PROPERTY_ACTION);
    }
    /**
     * @see ModelImplementation#PROPERTY_ACTION
     * 
     */
    public void setAction(String action) {
        set(PROPERTY_ACTION, action);
    }

    /**
     * @see ModelImplementation#PROPERTY_TAB
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see ModelImplementation#PROPERTY_TAB
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see ModelImplementation#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see ModelImplementation#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see ModelImplementation#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see ModelImplementation#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see ModelImplementation#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see ModelImplementation#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see ModelImplementation#PROPERTY_SPECIALFORM
     * 
     */
    public Form getSpecialForm() {
        return (Form) get(PROPERTY_SPECIALFORM);
    }
    /**
     * @see ModelImplementation#PROPERTY_SPECIALFORM
     * 
     */
    public void setSpecialForm(Form specialForm) {
        set(PROPERTY_SPECIALFORM, specialForm);
    }

    /**
     * @see ModelImplementation#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see ModelImplementation#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see ModelImplementation#PROPERTY_CALLOUT
     * 
     */
    public Callout getCallout() {
        return (Callout) get(PROPERTY_CALLOUT);
    }
    /**
     * @see ModelImplementation#PROPERTY_CALLOUT
     * 
     */
    public void setCallout(Callout callout) {
        set(PROPERTY_CALLOUT, callout);
    }

    /**
     * @see ModelImplementation#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ModelImplementation#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ModelImplementation#PROPERTY_OBJECTTYPE
     * 
     */
    public String getObjectType() {
        return (String) get(PROPERTY_OBJECTTYPE);
    }
    /**
     * @see ModelImplementation#PROPERTY_OBJECTTYPE
     * 
     */
    public void setObjectType(String objectType) {
        set(PROPERTY_OBJECTTYPE, objectType);
    }

    /**
     * @see ModelImplementation#PROPERTY_LOADONSTARTUP
     * 
     */
    public Long getLoadOnStartUp() {
        return (Long) get(PROPERTY_LOADONSTARTUP);
    }
    /**
     * @see ModelImplementation#PROPERTY_LOADONSTARTUP
     * 
     */
    public void setLoadOnStartUp(Long loadOnStartUp) {
        set(PROPERTY_LOADONSTARTUP, loadOnStartUp);
    }

    /**
     * @see ModelImplementation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ModelImplementation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ModelImplementation#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ModelImplementation#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * Help: {@literal This table contains the mappings (how the classes are accessed) for the objects of the
     *       dictionary.}<br>
     * @see ModelImplementationMapping
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ModelImplementationMapping> getADModelImplementationMappingList() {
      return (List<ModelImplementationMapping>) get(PROPERTY_ADMODELIMPLEMENTATIONMAPPINGLIST);
    }

    /**
     * Help: {@literal This table contains the mappings (how the classes are accessed) for the objects of the
     *       dictionary.}<br>
     * @see ModelImplementationMapping
     * 
     */
    public void setADModelImplementationMappingList(List<ModelImplementationMapping> aDModelImplementationMappingList) {
        set(PROPERTY_ADMODELIMPLEMENTATIONMAPPINGLIST, aDModelImplementationMappingList);
    }

    /**
     * @see ModelImplementationParameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ModelImplementationParameter> getModelImplementationParameterList() {
      return (List<ModelImplementationParameter>) get(PROPERTY_MODELIMPLEMENTATIONPARAMETERLIST);
    }

    /**
     * @see ModelImplementationParameter
     * 
     */
    public void setModelImplementationParameterList(List<ModelImplementationParameter> modelImplementationParameterList) {
        set(PROPERTY_MODELIMPLEMENTATIONPARAMETERLIST, modelImplementationParameterList);
    }

}
