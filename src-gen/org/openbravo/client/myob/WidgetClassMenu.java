
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
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBKMO_WidgetClassMenu (stored in table OBKMO_Widget_Class_Menu).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WidgetClassMenu extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBKMO_Widget_Class_Menu";
    public static final String ENTITY_NAME = "OBKMO_WidgetClassMenu";

    /**
     * Property id stored in column Obkmo_Widget_Class_Menu_ID in table OBKMO_Widget_Class_Menu<br>
     * Help: {@literal Unique identifier for the menu option}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBKMO_Widget_Class_Menu 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBKMO_Widget_Class_Menu 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBKMO_Widget_Class_Menu 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBKMO_Widget_Class_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBKMO_Widget_Class_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBKMO_Widget_Class_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBKMO_Widget_Class_Menu 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property widgetClass stored in column Obkmo_Widget_Class_ID in table OBKMO_Widget_Class_Menu<br>
     * Help: {@literal Identifies a widget class definition}
     * 
     */
    public static final String PROPERTY_WIDGETCLASS = "widgetClass";

    /**
     * Property isSeparator stored in column Isseparator in table OBKMO_Widget_Class_Menu<br>
     * Help: {@literal Renders the menu option as separator, there no need for title nor action}
     * 
     */
    public static final String PROPERTY_ISSEPARATOR = "isSeparator";

    /**
     * Property title stored in column Title in table OBKMO_Widget_Class_Menu 
     * 
     */
    public static final String PROPERTY_TITLE = "title";

    /**
     * Property action stored in column Action in table OBKMO_Widget_Class_Menu<br>
     * Help: {@literal The Action field indicates the Action to be performed for this element.}
     * 
     */
    public static final String PROPERTY_ACTION = "action";

    /**
     * Property sequence stored in column Sequence in table OBKMO_Widget_Class_Menu<br>
     * Help: {@literal A number number used to sort the menu options}
     * 
     */
    public static final String PROPERTY_SEQUENCE = "sequence";

    /**
     * Property oBKMOWidgetClassMenuTrlList stored in table OBKMO_Widget_Class_Menu
     * 
     */
    public static final String PROPERTY_OBKMOWIDGETCLASSMENUTRLLIST = "oBKMOWidgetClassMenuTrlList";


    public WidgetClassMenu() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISSEPARATOR, false);
        setDefaultValue(PROPERTY_SEQUENCE, (long) 0);
        setDefaultValue(PROPERTY_OBKMOWIDGETCLASSMENUTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WidgetClassMenu#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_WIDGETCLASS
     * 
     */
    public WidgetClass getWidgetClass() {
        return (WidgetClass) get(PROPERTY_WIDGETCLASS);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_WIDGETCLASS
     * 
     */
    public void setWidgetClass(WidgetClass widgetClass) {
        set(PROPERTY_WIDGETCLASS, widgetClass);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_ISSEPARATOR
     * 
     */
    public Boolean isSeparator() {
        return (Boolean) get(PROPERTY_ISSEPARATOR);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_ISSEPARATOR
     * 
     */
    public void setSeparator(Boolean isSeparator) {
        set(PROPERTY_ISSEPARATOR, isSeparator);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_TITLE
     * 
     */
    public String getTitle() {
        return (String) get(PROPERTY_TITLE);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_TITLE
     * 
     */
    public void setTitle(String title) {
        set(PROPERTY_TITLE, title);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_ACTION
     * 
     */
    public String getAction() {
        return (String) get(PROPERTY_ACTION);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_ACTION
     * 
     */
    public void setAction(String action) {
        set(PROPERTY_ACTION, action);
    }

    /**
     * @see WidgetClassMenu#PROPERTY_SEQUENCE
     * 
     */
    public Long getSequence() {
        return (Long) get(PROPERTY_SEQUENCE);
    }
    /**
     * @see WidgetClassMenu#PROPERTY_SEQUENCE
     * 
     */
    public void setSequence(Long sequence) {
        set(PROPERTY_SEQUENCE, sequence);
    }

    /**
     * @see WidgetClassMenuTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WidgetClassMenuTrl> getOBKMOWidgetClassMenuTrlList() {
      return (List<WidgetClassMenuTrl>) get(PROPERTY_OBKMOWIDGETCLASSMENUTRLLIST);
    }

    /**
     * @see WidgetClassMenuTrl
     * 
     */
    public void setOBKMOWidgetClassMenuTrlList(List<WidgetClassMenuTrl> oBKMOWidgetClassMenuTrlList) {
        set(PROPERTY_OBKMOWIDGETCLASSMENUTRLLIST, oBKMOWidgetClassMenuTrlList);
    }

}
