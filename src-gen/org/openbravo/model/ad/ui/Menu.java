
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
import org.openbravo.client.application.MenuParameter;
import org.openbravo.client.application.OBUIAPPViewImplementation;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADMenu (stored in table AD_Menu).
 * <br>
 * Help: {@literal The Menu Tab defines the tree structured menu which will be used for the selected
     *       Organization.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Menu extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Menu";
    public static final String ENTITY_NAME = "ADMenu";

    /**
     * Property id stored in column AD_Menu_ID in table AD_Menu<br>
     * Help: {@literal The Menu identifies a unique Menu.  Menus are used to control the display of those screens
     *       a user has access to.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Menu 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Menu 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Menu 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property name stored in column Name in table AD_Menu 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table AD_Menu<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property summaryLevel stored in column IsSummary in table AD_Menu<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property action stored in column Action in table AD_Menu<br>
     * Help: {@literal The Action field indicates the Action to be performed for this element.}
     * 
     */
    public static final String PROPERTY_ACTION = "action";

    /**
     * Property window stored in column AD_Window_ID in table AD_Menu<br>
     * Help: {@literal The Window field identifies a unique Window in the system.}
     * 
     */
    public static final String PROPERTY_WINDOW = "window";

    /**
     * Property process stored in column AD_Process_ID in table AD_Menu<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property specialForm stored in column AD_Form_ID in table AD_Menu<br>
     * Help: {@literal The Special Form field identifies a unique Special Form in the system.}
     * 
     */
    public static final String PROPERTY_SPECIALFORM = "specialForm";

    /**
     * Property uRL stored in column URL in table AD_Menu<br>
     * Help: {@literal The URL defines an online address for this element.}
     * 
     */
    public static final String PROPERTY_URL = "uRL";

    /**
     * Property module stored in column AD_Module_ID in table AD_Menu<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property obuiappView stored in column EM_OBUIAPP_VIEW_IMPL_ID in table AD_Menu<br>
     * Help: {@literal The view implementation which is shown in the tab of a multi-document-interface. }
     * 
     */
    public static final String PROPERTY_OBUIAPPVIEW = "obuiappView";

    /**
     * Property openlinkinbrowser stored in column Openlinkinbrowser in table AD_Menu<br>
     * Help: {@literal A flag to indicate if the link has to be opened in a browser's tab.}
     * 
     */
    public static final String PROPERTY_OPENLINKINBROWSER = "openlinkinbrowser";

    /**
     * Property oBUIAPPProcessDefinition stored in column EM_Obuiapp_Process_ID in table AD_Menu<br>
     * Help: {@literal Process to be executed by the button. There are 2 kinds of processes:
     *       *"Process":
     *       Implements the 2.50 style processes with a Servlet.
     *       *"Process Definition": Implements 3.0 processes
     *       with a pure SmartClient UI.}
     * 
     */
    public static final String PROPERTY_OBUIAPPPROCESSDEFINITION = "oBUIAPPProcessDefinition";

    /**
     * Property translationStrategy stored in column Translation_Strategy in table AD_Menu<br>
     * Help: {@literal When exporting the translation it is possible to export the full translation or to export
     *       a reduced version. If the value is set as Exclude From Reduced Translation, all the windows,
     *       processes, etc related to the functionality that is linked to this Menu entry will not be proposed
     *       into the reduced translation.}
     * 
     */
    public static final String PROPERTY_TRANSLATIONSTRATEGY = "translationStrategy";

    /**
     * Property aDMenuTrlList stored in table AD_Menu
     * 
     */
    public static final String PROPERTY_ADMENUTRLLIST = "aDMenuTrlList";

    /**
     * Property oBUIAPPMenuParametersList stored in table AD_Menu
     * 
     */
    public static final String PROPERTY_OBUIAPPMENUPARAMETERSLIST = "oBUIAPPMenuParametersList";


    public Menu() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_OPENLINKINBROWSER, false);
        setDefaultValue(PROPERTY_ADMENUTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPMENUPARAMETERSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Menu#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Menu#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Menu#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Menu#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Menu#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Menu#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Menu#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Menu#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Menu#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Menu#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Menu#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Menu#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Menu#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Menu#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Menu#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Menu#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Menu#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Menu#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Menu#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Menu#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Menu#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see Menu#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see Menu#PROPERTY_ACTION
     * 
     */
    public String getAction() {
        return (String) get(PROPERTY_ACTION);
    }
    /**
     * @see Menu#PROPERTY_ACTION
     * 
     */
    public void setAction(String action) {
        set(PROPERTY_ACTION, action);
    }

    /**
     * @see Menu#PROPERTY_WINDOW
     * 
     */
    public Window getWindow() {
        return (Window) get(PROPERTY_WINDOW);
    }
    /**
     * @see Menu#PROPERTY_WINDOW
     * 
     */
    public void setWindow(Window window) {
        set(PROPERTY_WINDOW, window);
    }

    /**
     * @see Menu#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see Menu#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see Menu#PROPERTY_SPECIALFORM
     * 
     */
    public Form getSpecialForm() {
        return (Form) get(PROPERTY_SPECIALFORM);
    }
    /**
     * @see Menu#PROPERTY_SPECIALFORM
     * 
     */
    public void setSpecialForm(Form specialForm) {
        set(PROPERTY_SPECIALFORM, specialForm);
    }

    /**
     * @see Menu#PROPERTY_URL
     * 
     */
    public String getURL() {
        return (String) get(PROPERTY_URL);
    }
    /**
     * @see Menu#PROPERTY_URL
     * 
     */
    public void setURL(String uRL) {
        set(PROPERTY_URL, uRL);
    }

    /**
     * @see Menu#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Menu#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Menu#PROPERTY_OBUIAPPVIEW
     * 
     */
    public OBUIAPPViewImplementation getObuiappView() {
        return (OBUIAPPViewImplementation) get(PROPERTY_OBUIAPPVIEW);
    }
    /**
     * @see Menu#PROPERTY_OBUIAPPVIEW
     * 
     */
    public void setObuiappView(OBUIAPPViewImplementation obuiappView) {
        set(PROPERTY_OBUIAPPVIEW, obuiappView);
    }

    /**
     * @see Menu#PROPERTY_OPENLINKINBROWSER
     * 
     */
    public Boolean isOpenlinkinbrowser() {
        return (Boolean) get(PROPERTY_OPENLINKINBROWSER);
    }
    /**
     * @see Menu#PROPERTY_OPENLINKINBROWSER
     * 
     */
    public void setOpenlinkinbrowser(Boolean openlinkinbrowser) {
        set(PROPERTY_OPENLINKINBROWSER, openlinkinbrowser);
    }

    /**
     * @see Menu#PROPERTY_OBUIAPPPROCESSDEFINITION
     * 
     */
    public org.openbravo.client.application.Process getOBUIAPPProcessDefinition() {
        return (org.openbravo.client.application.Process) get(PROPERTY_OBUIAPPPROCESSDEFINITION);
    }
    /**
     * @see Menu#PROPERTY_OBUIAPPPROCESSDEFINITION
     * 
     */
    public void setOBUIAPPProcessDefinition(org.openbravo.client.application.Process oBUIAPPProcessDefinition) {
        set(PROPERTY_OBUIAPPPROCESSDEFINITION, oBUIAPPProcessDefinition);
    }

    /**
     * @see Menu#PROPERTY_TRANSLATIONSTRATEGY
     * 
     */
    public String getTranslationStrategy() {
        return (String) get(PROPERTY_TRANSLATIONSTRATEGY);
    }
    /**
     * @see Menu#PROPERTY_TRANSLATIONSTRATEGY
     * 
     */
    public void setTranslationStrategy(String translationStrategy) {
        set(PROPERTY_TRANSLATIONSTRATEGY, translationStrategy);
    }

    /**
     * Help: {@literal Menu translations are derived from Window,  Process, etc. You only need to translate
     *       Summary level items.
     *       Run Synchronize Terminology to update menu translation.}<br>
     * @see MenuTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MenuTrl> getADMenuTrlList() {
      return (List<MenuTrl>) get(PROPERTY_ADMENUTRLLIST);
    }

    /**
     * Help: {@literal Menu translations are derived from Window,  Process, etc. You only need to translate
     *       Summary level items.
     *       Run Synchronize Terminology to update menu translation.}<br>
     * @see MenuTrl
     * 
     */
    public void setADMenuTrlList(List<MenuTrl> aDMenuTrlList) {
        set(PROPERTY_ADMENUTRLLIST, aDMenuTrlList);
    }

    /**
     * Help: {@literal Menu parameters passed in when a view is instantiated.}<br>
     * @see MenuParameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MenuParameter> getOBUIAPPMenuParametersList() {
      return (List<MenuParameter>) get(PROPERTY_OBUIAPPMENUPARAMETERSLIST);
    }

    /**
     * Help: {@literal Menu parameters passed in when a view is instantiated.}<br>
     * @see MenuParameter
     * 
     */
    public void setOBUIAPPMenuParametersList(List<MenuParameter> oBUIAPPMenuParametersList) {
        set(PROPERTY_OBUIAPPMENUPARAMETERSLIST, oBUIAPPMenuParametersList);
    }

}
