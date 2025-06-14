
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
package org.openbravo.client.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.kernel.Template;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_View_Implementation (stored in table OBUIAPP_View_Impl).
 * <br>
 * Help: {@literal A view is shown in the user interface as a tab in the multi-tab interface or as a popup.
     *       The view can be anything from a grid, form or a popup window. When the view is shown in the
     *       multi-tab interface then it must be a Smartclient canvas.
     *       
     *       The view implementation defines the
     *       component which is capable of generating the client side javascript to be shown in the browser. A
     *       view implementation is a java class which extends the
     *       org.openbravo.client.kernel.BaseTemplateComponent class.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OBUIAPPViewImplementation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_View_Impl";
    public static final String ENTITY_NAME = "OBUIAPP_View_Implementation";

    /**
     * Property id stored in column Obuiapp_View_Impl_ID in table OBUIAPP_View_Impl<br>
     * Help: {@literal A view is displayed inside a tab in the multi document interface.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_View_Impl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_View_Impl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property module stored in column AD_Module_ID in table OBUIAPP_View_Impl<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property template stored in column Obclker_Template_ID in table OBUIAPP_View_Impl<br>
     * Help: {@literal Defines the template which is used to generate the (javascript) code to render the
     *       component.}
     * 
     */
    public static final String PROPERTY_TEMPLATE = "template";

    /**
     * Property name stored in column Name in table OBUIAPP_View_Impl 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBUIAPP_View_Impl<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property javaClassName stored in column Classname in table OBUIAPP_View_Impl<br>
     * Help: {@literal The java class name of the view implementation. The java class must extend the
     *       org.openbravo.client.kernel.BaseTemplateComponent.}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property active stored in column Isactive in table OBUIAPP_View_Impl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_View_Impl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_View_Impl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_View_Impl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_View_Impl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property advancedFeature stored in column IsAdvancedFeature in table OBUIAPP_View_Impl<br>
     * Help: {@literal Automatic roles are granted with all non advanced features defined within application
     *       dictionary.
     *       
     *       Advanced features are only granted to the automatic roles defined as advanced.}
     * 
     */
    public static final String PROPERTY_ADVANCEDFEATURE = "advancedFeature";

    /**
     * Property obuiappViewRoleAccessList stored in table OBUIAPP_View_Impl
     * 
     */
    public static final String PROPERTY_OBUIAPPVIEWROLEACCESSLIST = "obuiappViewRoleAccessList";


    public OBUIAPPViewImplementation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ADVANCEDFEATURE, false);
        setDefaultValue(PROPERTY_OBUIAPPVIEWROLEACCESSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_TEMPLATE
     * 
     */
    public Template getTemplate() {
        return (Template) get(PROPERTY_TEMPLATE);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_TEMPLATE
     * 
     */
    public void setTemplate(Template template) {
        set(PROPERTY_TEMPLATE, template);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public Boolean isAdvancedFeature() {
        return (Boolean) get(PROPERTY_ADVANCEDFEATURE);
    }
    /**
     * @see OBUIAPPViewImplementation#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public void setAdvancedFeature(Boolean advancedFeature) {
        set(PROPERTY_ADVANCEDFEATURE, advancedFeature);
    }

    /**
     * Help: {@literal Defines the access to Openbravo view implementations.}<br>
     * @see ViewRoleAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ViewRoleAccess> getObuiappViewRoleAccessList() {
      return (List<ViewRoleAccess>) get(PROPERTY_OBUIAPPVIEWROLEACCESSLIST);
    }

    /**
     * Help: {@literal Defines the access to Openbravo view implementations.}<br>
     * @see ViewRoleAccess
     * 
     */
    public void setObuiappViewRoleAccessList(List<ViewRoleAccess> obuiappViewRoleAccessList) {
        set(PROPERTY_OBUIAPPVIEWROLEACCESSLIST, obuiappViewRoleAccessList);
    }

}
