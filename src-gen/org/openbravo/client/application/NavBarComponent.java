
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
 * Entity class for entity OBUIAPP_NavigationBarComponent (stored in table OBUIAPP_Navbar_Component).
 * <br>
 * Help: {@literal Defines a component which is shown in the navigation bar in the main layout of the
     *       Openbravo user interface.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class NavBarComponent extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_Navbar_Component";
    public static final String ENTITY_NAME = "OBUIAPP_NavigationBarComponent";

    /**
     * Property id stored in column Obuiapp_Navbar_Component_ID in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal A navigation bar component is a component which is shown in the navigation bar in the top
     *       of the user interface. For example a quick create or an application menu.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_Navbar_Component 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_Navbar_Component 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property module stored in column AD_Module_ID in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property template stored in column Obclker_Template_ID in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal Defines the template which is used to generate the (javascript) code to render the
     *       component.}
     * 
     */
    public static final String PROPERTY_TEMPLATE = "template";

    /**
     * Property name stored in column Name in table OBUIAPP_Navbar_Component 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property javaClassName stored in column Classname in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal The java class name of the navigation bar component. The java class must extend the
     *       org.openbravo.client.kernel.BaseTemplateComponent.}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property allroles stored in column Allroles in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal Defines that this navigation bar component is available to all roles or that role access
     *       is defined specifically by role through the navigation bar role access table.}
     * 
     */
    public static final String PROPERTY_ALLROLES = "allroles";

    /**
     * Property recordSortNo stored in column Sortno in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal The Record Sort No indicates the ascending sort sequence of the records}
     * 
     */
    public static final String PROPERTY_RECORDSORTNO = "recordSortNo";

    /**
     * Property active stored in column Isactive in table OBUIAPP_Navbar_Component 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_Navbar_Component 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_Navbar_Component 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_Navbar_Component 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_Navbar_Component 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property isstaticcomponent stored in column Isstaticcomponent in table OBUIAPP_Navbar_Component<br>
     * Help: {@literal Defines whether a navigation bar component is static or not. Static components are
     *       generated in the same request of the session dynamic resources. Non static components requires an
     *       extra request call to generate its content.}
     * 
     */
    public static final String PROPERTY_ISSTATICCOMPONENT = "isstaticcomponent";

    /**
     * Property oBUIAPPNavbarRoleaccessList stored in table OBUIAPP_Navbar_Component
     * 
     */
    public static final String PROPERTY_OBUIAPPNAVBARROLEACCESSLIST = "oBUIAPPNavbarRoleaccessList";


    public NavBarComponent() {
        setDefaultValue(PROPERTY_ALLROLES, true);
        setDefaultValue(PROPERTY_RECORDSORTNO, (long) 0);
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISSTATICCOMPONENT, false);
        setDefaultValue(PROPERTY_OBUIAPPNAVBARROLEACCESSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see NavBarComponent#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see NavBarComponent#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see NavBarComponent#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see NavBarComponent#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see NavBarComponent#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see NavBarComponent#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see NavBarComponent#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see NavBarComponent#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see NavBarComponent#PROPERTY_TEMPLATE
     * 
     */
    public Template getTemplate() {
        return (Template) get(PROPERTY_TEMPLATE);
    }
    /**
     * @see NavBarComponent#PROPERTY_TEMPLATE
     * 
     */
    public void setTemplate(Template template) {
        set(PROPERTY_TEMPLATE, template);
    }

    /**
     * @see NavBarComponent#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see NavBarComponent#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see NavBarComponent#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see NavBarComponent#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see NavBarComponent#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see NavBarComponent#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see NavBarComponent#PROPERTY_ALLROLES
     * 
     */
    public Boolean isAllroles() {
        return (Boolean) get(PROPERTY_ALLROLES);
    }
    /**
     * @see NavBarComponent#PROPERTY_ALLROLES
     * 
     */
    public void setAllroles(Boolean allroles) {
        set(PROPERTY_ALLROLES, allroles);
    }

    /**
     * @see NavBarComponent#PROPERTY_RECORDSORTNO
     * 
     */
    public Long getRecordSortNo() {
        return (Long) get(PROPERTY_RECORDSORTNO);
    }
    /**
     * @see NavBarComponent#PROPERTY_RECORDSORTNO
     * 
     */
    public void setRecordSortNo(Long recordSortNo) {
        set(PROPERTY_RECORDSORTNO, recordSortNo);
    }

    /**
     * @see NavBarComponent#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see NavBarComponent#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see NavBarComponent#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see NavBarComponent#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see NavBarComponent#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see NavBarComponent#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see NavBarComponent#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see NavBarComponent#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see NavBarComponent#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see NavBarComponent#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see NavBarComponent#PROPERTY_ISSTATICCOMPONENT
     * 
     */
    public Boolean isStaticcomponent() {
        return (Boolean) get(PROPERTY_ISSTATICCOMPONENT);
    }
    /**
     * @see NavBarComponent#PROPERTY_ISSTATICCOMPONENT
     * 
     */
    public void setStaticcomponent(Boolean isstaticcomponent) {
        set(PROPERTY_ISSTATICCOMPONENT, isstaticcomponent);
    }

    /**
     * Help: {@literal Defines the roles which have access to specific navigation bar components.}<br>
     * @see NavbarRoleaccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<NavbarRoleaccess> getOBUIAPPNavbarRoleaccessList() {
      return (List<NavbarRoleaccess>) get(PROPERTY_OBUIAPPNAVBARROLEACCESSLIST);
    }

    /**
     * Help: {@literal Defines the roles which have access to specific navigation bar components.}<br>
     * @see NavbarRoleaccess
     * 
     */
    public void setOBUIAPPNavbarRoleaccessList(List<NavbarRoleaccess> oBUIAPPNavbarRoleaccessList) {
        set(PROPERTY_OBUIAPPNAVBARROLEACCESSLIST, oBUIAPPNavbarRoleaccessList);
    }

}
