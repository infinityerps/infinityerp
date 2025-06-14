
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
import org.openbravo.client.application.RefWindow;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.access.WindowAccess;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADWindow (stored in table AD_Window).
 * <br>
 * Help: {@literal The Window table defines each window in the system.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Window extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Window";
    public static final String ENTITY_NAME = "ADWindow";

    /**
     * Property id stored in column AD_Window_ID in table AD_Window<br>
     * Help: {@literal The Window field identifies a unique Window in the system.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Window 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Window 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Window 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Window 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Window 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Window 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Window 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Window 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Window<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Window<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property windowType stored in column WindowType in table AD_Window<br>
     * Help: {@literal The Window Type indicates the type of window being defined (Maintain, Transaction or
     *       Query)}
     * 
     */
    public static final String PROPERTY_WINDOWTYPE = "windowType";

    /**
     * Property salesTransaction stored in column IsSOTrx in table AD_Window<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property processNow stored in column Processing in table AD_Window<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property image stored in column AD_Image_ID in table AD_Window<br>
     * Help: {@literal Defines a system image}
     * 
     */
    public static final String PROPERTY_IMAGE = "image";

    /**
     * Property default stored in column IsDefault in table AD_Window<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property module stored in column AD_Module_ID in table AD_Window<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property isthreadsafe stored in column Isthreadsafe in table AD_Window<br>
     * Help: {@literal If set, this boolean indicates that the window can be safely opened in more than one tab.
     *       This is true basically when the window doesn't directly (ie. through one column set to 'store in
     *       session') or indirectly (ie. via a callout action) store information in the session.}
     * 
     */
    public static final String PROPERTY_ISTHREADSAFE = "isthreadsafe";

    /**
     * Property advancedFeature stored in column IsAdvancedFeature in table AD_Window<br>
     * Help: {@literal Automatic roles are granted with all non advanced features defined within application
     *       dictionary.
     *       
     *       Advanced features are only granted to the automatic roles defined as advanced.}
     * 
     */
    public static final String PROPERTY_ADVANCEDFEATURE = "advancedFeature";

    /**
     * Property aDTabList stored in table AD_Window
     * 
     */
    public static final String PROPERTY_ADTABLIST = "aDTabList";

    /**
     * Property aDWindowAccessList stored in table AD_Window
     * 
     */
    public static final String PROPERTY_ADWINDOWACCESSLIST = "aDWindowAccessList";

    /**
     * Property aDWindowTrlList stored in table AD_Window
     * 
     */
    public static final String PROPERTY_ADWINDOWTRLLIST = "aDWindowTrlList";

    /**
     * Property oBUIAPPRefWindowList stored in table AD_Window
     * 
     */
    public static final String PROPERTY_OBUIAPPREFWINDOWLIST = "oBUIAPPRefWindowList";


    public Window() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_WINDOWTYPE, "M");
        setDefaultValue(PROPERTY_SALESTRANSACTION, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_ISTHREADSAFE, false);
        setDefaultValue(PROPERTY_ADVANCEDFEATURE, false);
        setDefaultValue(PROPERTY_ADTABLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADWINDOWACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADWINDOWTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPREFWINDOWLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Window#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Window#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Window#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Window#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Window#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Window#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Window#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Window#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Window#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Window#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Window#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Window#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Window#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Window#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Window#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Window#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Window#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Window#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Window#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Window#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Window#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Window#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Window#PROPERTY_WINDOWTYPE
     * 
     */
    public String getWindowType() {
        return (String) get(PROPERTY_WINDOWTYPE);
    }
    /**
     * @see Window#PROPERTY_WINDOWTYPE
     * 
     */
    public void setWindowType(String windowType) {
        set(PROPERTY_WINDOWTYPE, windowType);
    }

    /**
     * @see Window#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see Window#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see Window#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Window#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Window#PROPERTY_IMAGE
     * 
     */
    public Image getImage() {
        return (Image) get(PROPERTY_IMAGE);
    }
    /**
     * @see Window#PROPERTY_IMAGE
     * 
     */
    public void setImage(Image image) {
        set(PROPERTY_IMAGE, image);
    }

    /**
     * @see Window#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see Window#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see Window#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Window#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Window#PROPERTY_ISTHREADSAFE
     * 
     */
    public Boolean isThreadsafe() {
        return (Boolean) get(PROPERTY_ISTHREADSAFE);
    }
    /**
     * @see Window#PROPERTY_ISTHREADSAFE
     * 
     */
    public void setThreadsafe(Boolean isthreadsafe) {
        set(PROPERTY_ISTHREADSAFE, isthreadsafe);
    }

    /**
     * @see Window#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public Boolean isAdvancedFeature() {
        return (Boolean) get(PROPERTY_ADVANCEDFEATURE);
    }
    /**
     * @see Window#PROPERTY_ADVANCEDFEATURE
     * 
     */
    public void setAdvancedFeature(Boolean advancedFeature) {
        set(PROPERTY_ADVANCEDFEATURE, advancedFeature);
    }

    /**
     * Help: {@literal The Tab Tab defines each Tab within a Window.  Each Tab contains a discrete selection of
     *       fields.}<br>
     * @see Tab
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Tab> getADTabList() {
      return (List<Tab>) get(PROPERTY_ADTABLIST);
    }

    /**
     * Help: {@literal The Tab Tab defines each Tab within a Window.  Each Tab contains a discrete selection of
     *       fields.}<br>
     * @see Tab
     * 
     */
    public void setADTabList(List<Tab> aDTabList) {
        set(PROPERTY_ADTABLIST, aDTabList);
    }

    /**
     * Help: {@literal The Window Access Tab defines the Roles which have access to this Window.
     *       The Window
     *       Access Tab defines the Windows and type of access that this Role is granted.}<br>
     * @see WindowAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WindowAccess> getADWindowAccessList() {
      return (List<WindowAccess>) get(PROPERTY_ADWINDOWACCESSLIST);
    }

    /**
     * Help: {@literal The Window Access Tab defines the Roles which have access to this Window.
     *       The Window
     *       Access Tab defines the Windows and type of access that this Role is granted.}<br>
     * @see WindowAccess
     * 
     */
    public void setADWindowAccessList(List<WindowAccess> aDWindowAccessList) {
        set(PROPERTY_ADWINDOWACCESSLIST, aDWindowAccessList);
    }

    /**
     * Help: {@literal This tab contains the windows translation to different languages. It is important to check
     *       the translated option.}<br>
     * @see WindowTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WindowTrl> getADWindowTrlList() {
      return (List<WindowTrl>) get(PROPERTY_ADWINDOWTRLLIST);
    }

    /**
     * Help: {@literal This tab contains the windows translation to different languages. It is important to check
     *       the translated option.}<br>
     * @see WindowTrl
     * 
     */
    public void setADWindowTrlList(List<WindowTrl> aDWindowTrlList) {
        set(PROPERTY_ADWINDOWTRLLIST, aDWindowTrlList);
    }

    /**
     * @see RefWindow
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RefWindow> getOBUIAPPRefWindowList() {
      return (List<RefWindow>) get(PROPERTY_OBUIAPPREFWINDOWLIST);
    }

    /**
     * @see RefWindow
     * 
     */
    public void setOBUIAPPRefWindowList(List<RefWindow> oBUIAPPRefWindowList) {
        set(PROPERTY_OBUIAPPREFWINDOWLIST, oBUIAPPRefWindowList);
    }

}
