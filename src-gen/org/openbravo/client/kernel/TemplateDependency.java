
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
 * Entity class for entity OBCLKER_Template_Dependency (stored in table OBCLKER_TEMPLATE_DEPENDENCY).
 * <br>
 * Help: {@literal Defines a dependency relation between this template and another template. When processing,
     *       templates on which this template depends are loaded first into the template processor.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TemplateDependency extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBCLKER_TEMPLATE_DEPENDENCY";
    public static final String ENTITY_NAME = "OBCLKER_Template_Dependency";

    /**
     * Property id stored in column Obclker_Template_Dependency_ID in table OBCLKER_TEMPLATE_DEPENDENCY 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBCLKER_TEMPLATE_DEPENDENCY 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBCLKER_TEMPLATE_DEPENDENCY 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property obclkerTemplate stored in column Obclker_Template_ID in table OBCLKER_TEMPLATE_DEPENDENCY<br>
     * Help: {@literal Defines the template which is used to generate the (javascript) code to render the
     *       component.}
     * 
     */
    public static final String PROPERTY_OBCLKERTEMPLATE = "obclkerTemplate";

    /**
     * Property dependsOnTemplate stored in column Dependson_Template_ID in table OBCLKER_TEMPLATE_DEPENDENCY<br>
     * Help: {@literal Defines the template on which the current template depends.}
     * 
     */
    public static final String PROPERTY_DEPENDSONTEMPLATE = "dependsOnTemplate";

    /**
     * Property description stored in column Description in table OBCLKER_TEMPLATE_DEPENDENCY<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property active stored in column Isactive in table OBCLKER_TEMPLATE_DEPENDENCY 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBCLKER_TEMPLATE_DEPENDENCY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBCLKER_TEMPLATE_DEPENDENCY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBCLKER_TEMPLATE_DEPENDENCY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBCLKER_TEMPLATE_DEPENDENCY 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";


    public TemplateDependency() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TemplateDependency#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TemplateDependency#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TemplateDependency#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TemplateDependency#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TemplateDependency#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TemplateDependency#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TemplateDependency#PROPERTY_OBCLKERTEMPLATE
     * 
     */
    public Template getObclkerTemplate() {
        return (Template) get(PROPERTY_OBCLKERTEMPLATE);
    }
    /**
     * @see TemplateDependency#PROPERTY_OBCLKERTEMPLATE
     * 
     */
    public void setObclkerTemplate(Template obclkerTemplate) {
        set(PROPERTY_OBCLKERTEMPLATE, obclkerTemplate);
    }

    /**
     * @see TemplateDependency#PROPERTY_DEPENDSONTEMPLATE
     * 
     */
    public Template getDependsOnTemplate() {
        return (Template) get(PROPERTY_DEPENDSONTEMPLATE);
    }
    /**
     * @see TemplateDependency#PROPERTY_DEPENDSONTEMPLATE
     * 
     */
    public void setDependsOnTemplate(Template dependsOnTemplate) {
        set(PROPERTY_DEPENDSONTEMPLATE, dependsOnTemplate);
    }

    /**
     * @see TemplateDependency#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see TemplateDependency#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see TemplateDependency#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TemplateDependency#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TemplateDependency#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TemplateDependency#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TemplateDependency#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TemplateDependency#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TemplateDependency#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TemplateDependency#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TemplateDependency#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TemplateDependency#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

}
