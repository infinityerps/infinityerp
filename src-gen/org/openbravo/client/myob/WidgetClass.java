
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
package org.openbravo.client.myob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.application.Parameter;
import org.openbravo.client.querylist.OBCQL_WidgetQuery;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBKMO_WidgetClass (stored in table OBKMO_Widget_Class).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WidgetClass extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBKMO_Widget_Class";
    public static final String ENTITY_NAME = "OBKMO_WidgetClass";

    /**
     * Property id stored in column OBKMO_Widget_Class_ID in table OBKMO_Widget_Class<br>
     * Help: {@literal Identifies a widget class definition}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBKMO_Widget_Class 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBKMO_Widget_Class 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBKMO_Widget_Class 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBKMO_Widget_Class 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBKMO_Widget_Class 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBKMO_Widget_Class 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBKMO_Widget_Class 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property module stored in column AD_Module_ID in table OBKMO_Widget_Class<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property widgetTitle stored in column Title in table OBKMO_Widget_Class 
     * 
     */
    public static final String PROPERTY_WIDGETTITLE = "widgetTitle";

    /**
     * Property javaClass stored in column Javaclass in table OBKMO_Widget_Class<br>
     * Help: {@literal Java Class implementing the widget}
     * 
     */
    public static final String PROPERTY_JAVACLASS = "javaClass";

    /**
     * Property height stored in column Height in table OBKMO_Widget_Class<br>
     * Help: {@literal Height in pixels the widget will be represented with.}
     * 
     */
    public static final String PROPERTY_HEIGHT = "height";

    /**
     * Property description stored in column Description in table OBKMO_Widget_Class<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property allowAnonymousAccess stored in column Allow_Anonymous_Access in table OBKMO_Widget_Class<br>
     * Help: {@literal Determines that the widget class will be available to all users regardless of the roles
     *       with access to this class.}
     * 
     */
    public static final String PROPERTY_ALLOWANONYMOUSACCESS = "allowAnonymousAccess";

    /**
     * Property superclass stored in column IsSuperclass in table OBKMO_Widget_Class<br>
     * Help: {@literal A Superclass widget is an implementation that can be used by other widget classes so it is
     *       not necessary to develop the java class.}
     * 
     */
    public static final String PROPERTY_SUPERCLASS = "superclass";

    /**
     * Property widgetSuperclass stored in column Widget_Superclass_ID in table OBKMO_Widget_Class<br>
     * Help: {@literal Identifies the Superclass widget used by this widget class.}
     * 
     */
    public static final String PROPERTY_WIDGETSUPERCLASS = "widgetSuperclass";

    /**
     * Property canMaximize stored in column CAN_Maximize in table OBKMO_Widget_Class<br>
     * Help: {@literal When is true, the maximize button appears in the widget's header toolbar, next to the menu
     *       options}
     * 
     */
    public static final String PROPERTY_CANMAXIMIZE = "canMaximize";

    /**
     * Property dataAccessLevel stored in column Accesslevel in table OBKMO_Widget_Class<br>
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
     * Property authorMsg stored in column Author_Msg in table OBKMO_Widget_Class<br>
     * Help: {@literal It is a message the widget author can define. It will be shown in the widget about
     *       information.}
     * 
     */
    public static final String PROPERTY_AUTHORMSG = "authorMsg";

    /**
     * Property authorUrl stored in column Author_Url in table OBKMO_Widget_Class<br>
     * Help: {@literal It is the widget author URL which will be shown in the widget about information box.}
     * 
     */
    public static final String PROPERTY_AUTHORURL = "authorUrl";

    /**
     * Property availableInWorkspace stored in column Available_In_Workspace in table OBKMO_Widget_Class<br>
     * Help: {@literal When this field is checked, the widget will be available in the "Add Widget" drop down
     *       menu to include it in the workspace.}
     * 
     */
    public static final String PROPERTY_AVAILABLEINWORKSPACE = "availableInWorkspace";

    /**
     * Property oBCQLWidgetQueryList stored in table OBKMO_Widget_Class
     * 
     */
    public static final String PROPERTY_OBCQLWIDGETQUERYLIST = "oBCQLWidgetQueryList";

    /**
     * Property oBKMOWidgetClassAccessList stored in table OBKMO_Widget_Class
     * 
     */
    public static final String PROPERTY_OBKMOWIDGETCLASSACCESSLIST = "oBKMOWidgetClassAccessList";

    /**
     * Property oBKMOWidgetClassTrlList stored in table OBKMO_Widget_Class
     * 
     */
    public static final String PROPERTY_OBKMOWIDGETCLASSTRLLIST = "oBKMOWidgetClassTrlList";

    /**
     * Property oBKMOWidgetURLList stored in table OBKMO_Widget_Class
     * 
     */
    public static final String PROPERTY_OBKMOWIDGETURLLIST = "oBKMOWidgetURLList";

    /**
     * Property oBUIAPPParameterEMObkmoWidgetClassIDList stored in table OBKMO_Widget_Class
     * 
     */
    public static final String PROPERTY_OBUIAPPPARAMETEREMOBKMOWIDGETCLASSIDLIST = "oBUIAPPParameterEMObkmoWidgetClassIDList";


    public WidgetClass() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_HEIGHT, (long) 300);
        setDefaultValue(PROPERTY_ALLOWANONYMOUSACCESS, false);
        setDefaultValue(PROPERTY_SUPERCLASS, false);
        setDefaultValue(PROPERTY_CANMAXIMIZE, false);
        setDefaultValue(PROPERTY_DATAACCESSLEVEL, "3");
        setDefaultValue(PROPERTY_AVAILABLEINWORKSPACE, true);
        setDefaultValue(PROPERTY_OBCQLWIDGETQUERYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBKMOWIDGETCLASSACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBKMOWIDGETCLASSTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBKMOWIDGETURLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPPARAMETEREMOBKMOWIDGETCLASSIDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WidgetClass#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WidgetClass#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WidgetClass#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WidgetClass#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WidgetClass#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WidgetClass#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WidgetClass#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WidgetClass#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WidgetClass#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WidgetClass#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WidgetClass#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WidgetClass#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WidgetClass#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WidgetClass#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WidgetClass#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WidgetClass#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WidgetClass#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see WidgetClass#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see WidgetClass#PROPERTY_WIDGETTITLE
     * 
     */
    public String getWidgetTitle() {
        return (String) get(PROPERTY_WIDGETTITLE);
    }
    /**
     * @see WidgetClass#PROPERTY_WIDGETTITLE
     * 
     */
    public void setWidgetTitle(String widgetTitle) {
        set(PROPERTY_WIDGETTITLE, widgetTitle);
    }

    /**
     * @see WidgetClass#PROPERTY_JAVACLASS
     * 
     */
    public String getJavaClass() {
        return (String) get(PROPERTY_JAVACLASS);
    }
    /**
     * @see WidgetClass#PROPERTY_JAVACLASS
     * 
     */
    public void setJavaClass(String javaClass) {
        set(PROPERTY_JAVACLASS, javaClass);
    }

    /**
     * @see WidgetClass#PROPERTY_HEIGHT
     * 
     */
    public Long getHeight() {
        return (Long) get(PROPERTY_HEIGHT);
    }
    /**
     * @see WidgetClass#PROPERTY_HEIGHT
     * 
     */
    public void setHeight(Long height) {
        set(PROPERTY_HEIGHT, height);
    }

    /**
     * @see WidgetClass#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see WidgetClass#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see WidgetClass#PROPERTY_ALLOWANONYMOUSACCESS
     * 
     */
    public Boolean isAllowAnonymousAccess() {
        return (Boolean) get(PROPERTY_ALLOWANONYMOUSACCESS);
    }
    /**
     * @see WidgetClass#PROPERTY_ALLOWANONYMOUSACCESS
     * 
     */
    public void setAllowAnonymousAccess(Boolean allowAnonymousAccess) {
        set(PROPERTY_ALLOWANONYMOUSACCESS, allowAnonymousAccess);
    }

    /**
     * @see WidgetClass#PROPERTY_SUPERCLASS
     * 
     */
    public Boolean isSuperclass() {
        return (Boolean) get(PROPERTY_SUPERCLASS);
    }
    /**
     * @see WidgetClass#PROPERTY_SUPERCLASS
     * 
     */
    public void setSuperclass(Boolean superclass) {
        set(PROPERTY_SUPERCLASS, superclass);
    }

    /**
     * @see WidgetClass#PROPERTY_WIDGETSUPERCLASS
     * 
     */
    public WidgetClass getWidgetSuperclass() {
        return (WidgetClass) get(PROPERTY_WIDGETSUPERCLASS);
    }
    /**
     * @see WidgetClass#PROPERTY_WIDGETSUPERCLASS
     * 
     */
    public void setWidgetSuperclass(WidgetClass widgetSuperclass) {
        set(PROPERTY_WIDGETSUPERCLASS, widgetSuperclass);
    }

    /**
     * @see WidgetClass#PROPERTY_CANMAXIMIZE
     * 
     */
    public Boolean isCanMaximize() {
        return (Boolean) get(PROPERTY_CANMAXIMIZE);
    }
    /**
     * @see WidgetClass#PROPERTY_CANMAXIMIZE
     * 
     */
    public void setCanMaximize(Boolean canMaximize) {
        set(PROPERTY_CANMAXIMIZE, canMaximize);
    }

    /**
     * @see WidgetClass#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public String getDataAccessLevel() {
        return (String) get(PROPERTY_DATAACCESSLEVEL);
    }
    /**
     * @see WidgetClass#PROPERTY_DATAACCESSLEVEL
     * 
     */
    public void setDataAccessLevel(String dataAccessLevel) {
        set(PROPERTY_DATAACCESSLEVEL, dataAccessLevel);
    }

    /**
     * @see WidgetClass#PROPERTY_AUTHORMSG
     * 
     */
    public String getAuthorMsg() {
        return (String) get(PROPERTY_AUTHORMSG);
    }
    /**
     * @see WidgetClass#PROPERTY_AUTHORMSG
     * 
     */
    public void setAuthorMsg(String authorMsg) {
        set(PROPERTY_AUTHORMSG, authorMsg);
    }

    /**
     * @see WidgetClass#PROPERTY_AUTHORURL
     * 
     */
    public String getAuthorUrl() {
        return (String) get(PROPERTY_AUTHORURL);
    }
    /**
     * @see WidgetClass#PROPERTY_AUTHORURL
     * 
     */
    public void setAuthorUrl(String authorUrl) {
        set(PROPERTY_AUTHORURL, authorUrl);
    }

    /**
     * @see WidgetClass#PROPERTY_AVAILABLEINWORKSPACE
     * 
     */
    public Boolean isAvailableInWorkspace() {
        return (Boolean) get(PROPERTY_AVAILABLEINWORKSPACE);
    }
    /**
     * @see WidgetClass#PROPERTY_AVAILABLEINWORKSPACE
     * 
     */
    public void setAvailableInWorkspace(Boolean availableInWorkspace) {
        set(PROPERTY_AVAILABLEINWORKSPACE, availableInWorkspace);
    }

    /**
     * @see OBCQL_WidgetQuery
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OBCQL_WidgetQuery> getOBCQLWidgetQueryList() {
      return (List<OBCQL_WidgetQuery>) get(PROPERTY_OBCQLWIDGETQUERYLIST);
    }

    /**
     * @see OBCQL_WidgetQuery
     * 
     */
    public void setOBCQLWidgetQueryList(List<OBCQL_WidgetQuery> oBCQLWidgetQueryList) {
        set(PROPERTY_OBCQLWIDGETQUERYLIST, oBCQLWidgetQueryList);
    }

    /**
     * @see WidgetClassAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WidgetClassAccess> getOBKMOWidgetClassAccessList() {
      return (List<WidgetClassAccess>) get(PROPERTY_OBKMOWIDGETCLASSACCESSLIST);
    }

    /**
     * @see WidgetClassAccess
     * 
     */
    public void setOBKMOWidgetClassAccessList(List<WidgetClassAccess> oBKMOWidgetClassAccessList) {
        set(PROPERTY_OBKMOWIDGETCLASSACCESSLIST, oBKMOWidgetClassAccessList);
    }

    /**
     * @see WidgetClassTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WidgetClassTrl> getOBKMOWidgetClassTrlList() {
      return (List<WidgetClassTrl>) get(PROPERTY_OBKMOWIDGETCLASSTRLLIST);
    }

    /**
     * @see WidgetClassTrl
     * 
     */
    public void setOBKMOWidgetClassTrlList(List<WidgetClassTrl> oBKMOWidgetClassTrlList) {
        set(PROPERTY_OBKMOWIDGETCLASSTRLLIST, oBKMOWidgetClassTrlList);
    }

    /**
     * @see WidgetURL
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WidgetURL> getOBKMOWidgetURLList() {
      return (List<WidgetURL>) get(PROPERTY_OBKMOWIDGETURLLIST);
    }

    /**
     * @see WidgetURL
     * 
     */
    public void setOBKMOWidgetURLList(List<WidgetURL> oBKMOWidgetURLList) {
        set(PROPERTY_OBKMOWIDGETURLLIST, oBKMOWidgetURLList);
    }

    /**
     * @see Parameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Parameter> getOBUIAPPParameterEMObkmoWidgetClassIDList() {
      return (List<Parameter>) get(PROPERTY_OBUIAPPPARAMETEREMOBKMOWIDGETCLASSIDLIST);
    }

    /**
     * @see Parameter
     * 
     */
    public void setOBUIAPPParameterEMObkmoWidgetClassIDList(List<Parameter> oBUIAPPParameterEMObkmoWidgetClassIDList) {
        set(PROPERTY_OBUIAPPPARAMETEREMOBKMOWIDGETCLASSIDLIST, oBUIAPPParameterEMObkmoWidgetClassIDList);
    }

}
