
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
package org.openbravo.client.kernel;

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
 * Entity class for entity OBCLKER_Template (stored in table OBCLKER_Template).
 * <br>
 * Help: {@literal A template is used for generating Openbravo user interface widgets which are displayed on
     *       the client. Typically a template is called when a request for a user interface component is
     *       received. A user interface component can be the complete page, a menu or a drop down for example.
     *       The template is called and uses information from the database (for example the available menu items)
     *       to generate the user interface component (often javascript).}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Template extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBCLKER_Template";
    public static final String ENTITY_NAME = "OBCLKER_Template";

    /**
     * Property id stored in column Obclker_Template_ID in table OBCLKER_Template<br>
     * Help: {@literal Defines the template which is used to generate the (javascript) code to render the
     *       component.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBCLKER_Template 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBCLKER_Template 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property module stored in column AD_Module_ID in table OBCLKER_Template<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property name stored in column Name in table OBCLKER_Template 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBCLKER_Template<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property overridesTemplate stored in column Overrides_Template_ID in table OBCLKER_Template<br>
     * Help: {@literal Defines that this template overrides the template which is defined in this field. When
     *       processing a user interface component request from the browser, the system searches for the template
     *       to handle the request. The 'overrides template' field plays an important role in this process. When
     *       a template is selected then the system checks if the template is overridden, if this is the case
     *       then the overriding template is used. This search step are done multi-level (so if the overriding
     *       template is again overridden then the deepest/last overriding template is used).}
     * 
     */
    public static final String PROPERTY_OVERRIDESTEMPLATE = "overridesTemplate";

    /**
     * Property template stored in column Template in table OBCLKER_Template<br>
     * Help: {@literal The source code of the template. This code gets executed when the template is processed.
     *       The language of the source code (freemarker or another) is defined by the template language field.
     *       Note that instead of this field it is also possible to use the template class path location field to
     *       point to a file containing the source cod}
     * 
     */
    public static final String PROPERTY_TEMPLATE = "template";

    /**
     * Property templateClasspathLocation stored in column TemplateClasspathLocation in table OBCLKER_Template<br>
     * Help: {@literal Defines the location in the classpath of the template file. The template is loaded using
     *       the classloader. The path must be an absolute path (so start with a /).}
     * 
     */
    public static final String PROPERTY_TEMPLATECLASSPATHLOCATION = "templateClasspathLocation";

    /**
     * Property templateLanguage stored in column Template_Language in table OBCLKER_Template<br>
     * Help: {@literal Defines the template language used to process this template.}
     * 
     */
    public static final String PROPERTY_TEMPLATELANGUAGE = "templateLanguage";

    /**
     * Property componentType stored in column Component_Type in table OBCLKER_Template<br>
     * Help: {@literal A type of component for which the template operates.}
     * 
     */
    public static final String PROPERTY_COMPONENTTYPE = "componentType";

    /**
     * Property active stored in column Isactive in table OBCLKER_Template 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBCLKER_Template 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBCLKER_Template 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBCLKER_Template 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBCLKER_Template 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property oBCLKERTemplateDependencyList stored in table OBCLKER_Template
     * 
     */
    public static final String PROPERTY_OBCLKERTEMPLATEDEPENDENCYLIST = "oBCLKERTemplateDependencyList";


    public Template() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OBCLKERTEMPLATEDEPENDENCYLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Template#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Template#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Template#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Template#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Template#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Template#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Template#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Template#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Template#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Template#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Template#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Template#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Template#PROPERTY_OVERRIDESTEMPLATE
     * 
     */
    public Template getOverridesTemplate() {
        return (Template) get(PROPERTY_OVERRIDESTEMPLATE);
    }
    /**
     * @see Template#PROPERTY_OVERRIDESTEMPLATE
     * 
     */
    public void setOverridesTemplate(Template overridesTemplate) {
        set(PROPERTY_OVERRIDESTEMPLATE, overridesTemplate);
    }

    /**
     * @see Template#PROPERTY_TEMPLATE
     * 
     */
    public String getTemplate() {
        return (String) get(PROPERTY_TEMPLATE);
    }
    /**
     * @see Template#PROPERTY_TEMPLATE
     * 
     */
    public void setTemplate(String template) {
        set(PROPERTY_TEMPLATE, template);
    }

    /**
     * @see Template#PROPERTY_TEMPLATECLASSPATHLOCATION
     * 
     */
    public String getTemplateClasspathLocation() {
        return (String) get(PROPERTY_TEMPLATECLASSPATHLOCATION);
    }
    /**
     * @see Template#PROPERTY_TEMPLATECLASSPATHLOCATION
     * 
     */
    public void setTemplateClasspathLocation(String templateClasspathLocation) {
        set(PROPERTY_TEMPLATECLASSPATHLOCATION, templateClasspathLocation);
    }

    /**
     * @see Template#PROPERTY_TEMPLATELANGUAGE
     * 
     */
    public String getTemplateLanguage() {
        return (String) get(PROPERTY_TEMPLATELANGUAGE);
    }
    /**
     * @see Template#PROPERTY_TEMPLATELANGUAGE
     * 
     */
    public void setTemplateLanguage(String templateLanguage) {
        set(PROPERTY_TEMPLATELANGUAGE, templateLanguage);
    }

    /**
     * @see Template#PROPERTY_COMPONENTTYPE
     * 
     */
    public String getComponentType() {
        return (String) get(PROPERTY_COMPONENTTYPE);
    }
    /**
     * @see Template#PROPERTY_COMPONENTTYPE
     * 
     */
    public void setComponentType(String componentType) {
        set(PROPERTY_COMPONENTTYPE, componentType);
    }

    /**
     * @see Template#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Template#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Template#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Template#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Template#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Template#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Template#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Template#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Template#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Template#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * Help: {@literal Defines a dependency relation between this template and another template. When processing,
     *       templates on which this template depends are loaded first into the template processor.}<br>
     * @see TemplateDependency
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TemplateDependency> getOBCLKERTemplateDependencyList() {
      return (List<TemplateDependency>) get(PROPERTY_OBCLKERTEMPLATEDEPENDENCYLIST);
    }

    /**
     * Help: {@literal Defines a dependency relation between this template and another template. When processing,
     *       templates on which this template depends are loaded first into the template processor.}<br>
     * @see TemplateDependency
     * 
     */
    public void setOBCLKERTemplateDependencyList(List<TemplateDependency> oBCLKERTemplateDependencyList) {
        set(PROPERTY_OBCLKERTEMPLATEDEPENDENCYLIST, oBCLKERTemplateDependencyList);
    }

}
