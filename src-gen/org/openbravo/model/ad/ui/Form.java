
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
import org.openbravo.model.ad.access.FormAccess;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.domain.ModelImplementation;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADForm (stored in table AD_Form).
 * <br>
 * Help: {@literal The Forms Tab defines any window which is not automatically generated.  For System Admin
     *       use only.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Form extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Form";
    public static final String ENTITY_NAME = "ADForm";

    /**
     * Property id stored in column AD_Form_ID in table AD_Form<br>
     * Help: {@literal The Special Form field identifies a unique Special Form in the system.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Form 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Form 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Form 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Form 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Form 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Form 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Form 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Form 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Form<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Form<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property dataAccessLevel stored in column AccessLevel in table AD_Form<br>
     * Help: {@literal Indicates what type of data (in terms of AD_CLIENT and AD_ORG data columns) can be entered
     *       or viewed. We can classify data in 4 major categories:
     *       - System (AD_CLIENT_ID=0, AD_ORG_ID=0) -
     *       system data (such as metadata for window, tab and field definition)
     *       - Organization (AD_CLIENT<>0,
     *       AD_ORG_ID<>0) - data particular to an organization (such as sales orders)
     *       - Client/Organization
     *       (AD_CLIENT<>0, AD_ORG_ID=anything) - data particular to an organization or shared among all
     *       organizations within one client
     *       - Client (AD_CLIENT<>0, AD_ORG_ID=0) - data that is specific to a
     *       client but can be used by all organizations within that client
     *       
     *       or All (AD_CLIENT=anything,
     *       AD_ORG_ID=anything)}
     * 
     */
    public static final String PROPERTY_DATAACCESSLEVEL = "dataAccessLevel";

    /**
     * Property javaClassName stored in column Classname in table AD_Form<br>
     * Help: {@literal The classname is used when generating a representation of the table in java (the entity or
     *       business object). The classname is the simplename of the class (so without the package name). Often
     *       the AD_Table.name can be used here. The combination of classname and package needs to be unique.}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property module stored in column AD_Module_ID in table AD_Form<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property advancedFeature stored in column IsAdvancedFeature in table AD_Form<br>
     * Help: {@literal Automatic roles are granted with all non advanced features defined within application
     *       dictionary.
     *       
     *       Advanced features are only granted to the automatic roles defined as advanced.}
     * 
     */
    public static final String PROPERTY_ADVANCEDFEATURE = "advancedFeature";

    /**
     * Property aDFormAccessList stored in table AD_Form
     * 
     */
    public static final String PROPERTY_ADFORMACCESSLIST = "aDFormAccessList";

    /**
     * Property aDFormTrlList stored in table AD_Form
     * 
     */
    public static final String PROPERTY_ADFORMTRLLIST = "aDFormTrlList";

    /**
     * Property aDMenuList stored in table AD_Form
     * 
     */
    public static final String PROPERTY_ADMENULIST = "aDMenuList";

    /**
     * Property aDModelImplementationList stored in table AD_Form
     * 
     */
    public static final String PROPERTY_ADMODELIMPLEMENTATIONLIST = "aDModelImplementationList";


    public Form() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ADVANCEDFEATURE, false);
        setDefaultValue(PROPERTY_ADFORMACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADFORMTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADMENULIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADMODELIMPLEMENTATIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Form#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Form#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Form#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Form#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Form#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Form#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Form#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Form#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Form#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Form#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Form#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Form#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Form#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Form#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Form#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Form#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Form#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Form#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Form#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Form#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Form#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Form#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Form#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public String getDataAccessLevel() {
        return (String) get(PROPERTY_DATAACCESSLEVEL);
    }
    /**
     * @see Form#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public void setDataAccessLevel(String dataAccessLevel) {
        set(PROPERTY_DATAACCESSLEVEL, dataAccessLevel);
    }

    /**
     * @see Form#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see Form#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see Form#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Form#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Form#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public Boolean isAdvancedFeature() {
        return (Boolean) get(PROPERTY_ADVANCEDFEATURE);
    }
    /**
     * @see Form#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public void setAdvancedFeature(Boolean advancedFeature) {
        set(PROPERTY_ADVANCEDFEATURE, advancedFeature);
    }

    /**
     * Help: {@literal The Form Access Tab defines the Forms and type of access that this Role is granted.
     *       The
     *       Forms Access Tab defines the access rules for this form}<br>
     * @see FormAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FormAccess> getADFormAccessList() {
      return (List<FormAccess>) get(PROPERTY_ADFORMACCESSLIST);
    }

    /**
     * Help: {@literal The Form Access Tab defines the Forms and type of access that this Role is granted.
     *       The
     *       Forms Access Tab defines the access rules for this form}<br>
     * @see FormAccess
     * 
     */
    public void setADFormAccessList(List<FormAccess> aDFormAccessList) {
        set(PROPERTY_ADFORMACCESSLIST, aDFormAccessList);
    }

    /**
     * Help: {@literal This tab contains form tab data translation to different languages
     *       Allows the translation
     *       of any form of the application. After performing any edits, the window must be regenerated.}<br>
     * @see FormTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FormTrl> getADFormTrlList() {
      return (List<FormTrl>) get(PROPERTY_ADFORMTRLLIST);
    }

    /**
     * Help: {@literal This tab contains form tab data translation to different languages
     *       Allows the translation
     *       of any form of the application. After performing any edits, the window must be regenerated.}<br>
     * @see FormTrl
     * 
     */
    public void setADFormTrlList(List<FormTrl> aDFormTrlList) {
        set(PROPERTY_ADFORMTRLLIST, aDFormTrlList);
    }

    /**
     * Help: {@literal The Menu Tab defines the tree structured menu which will be used for the selected
     *       Organization.}<br>
     * @see Menu
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Menu> getADMenuList() {
      return (List<Menu>) get(PROPERTY_ADMENULIST);
    }

    /**
     * Help: {@literal The Menu Tab defines the tree structured menu which will be used for the selected
     *       Organization.}<br>
     * @see Menu
     * 
     */
    public void setADMenuList(List<Menu> aDMenuList) {
        set(PROPERTY_ADMENULIST, aDMenuList);
    }

    /**
     * @see ModelImplementation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ModelImplementation> getADModelImplementationList() {
      return (List<ModelImplementation>) get(PROPERTY_ADMODELIMPLEMENTATIONLIST);
    }

    /**
     * @see ModelImplementation
     * 
     */
    public void setADModelImplementationList(List<ModelImplementation> aDModelImplementationList) {
        set(PROPERTY_ADMODELIMPLEMENTATIONLIST, aDModelImplementationList);
    }

}
