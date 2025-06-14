
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.domain.Reference;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBKMO_WidgetReference (stored in table OBKMO_Widget_Reference).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WidgetReference extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBKMO_Widget_Reference";
    public static final String ENTITY_NAME = "OBKMO_WidgetReference";

    /**
     * Property id stored in column AD_Reference_ID in table OBKMO_Widget_Reference 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBKMO_Widget_Reference 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBKMO_Widget_Reference 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBKMO_Widget_Reference 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBKMO_Widget_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBKMO_Widget_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBKMO_Widget_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBKMO_Widget_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property widgetClass stored in column Obkmo_Widget_Class_ID in table OBKMO_Widget_Reference<br>
     * Help: {@literal Identifies a widget class definition}
     * 
     */
    public static final String PROPERTY_WIDGETCLASS = "widgetClass";

    /**
     * Property showFieldTitle stored in column Showfieldtitle in table OBKMO_Widget_Reference<br>
     * Help: {@literal This column defines if the a label with the field name should be shown on top of the
     *       widget like it is for other fields or if this label should be hidden and the extra space be used for
     *       the widget itself. Default is to show the title as for other fields.}
     * 
     */
    public static final String PROPERTY_SHOWFIELDTITLE = "showFieldTitle";

    /**
     * Property reference stored in column AD_Reference_ID in table OBKMO_Widget_Reference<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";


    public WidgetReference() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SHOWFIELDTITLE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WidgetReference#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WidgetReference#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WidgetReference#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WidgetReference#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WidgetReference#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WidgetReference#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WidgetReference#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WidgetReference#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WidgetReference#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WidgetReference#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WidgetReference#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WidgetReference#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WidgetReference#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WidgetReference#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WidgetReference#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WidgetReference#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WidgetReference#PROPERTY_WIDGETCLASS
     * 
     */
    public WidgetClass getWidgetClass() {
        return (WidgetClass) get(PROPERTY_WIDGETCLASS);
    }
    /**
     * @see WidgetReference#PROPERTY_WIDGETCLASS
     * 
     */
    public void setWidgetClass(WidgetClass widgetClass) {
        set(PROPERTY_WIDGETCLASS, widgetClass);
    }

    /**
     * @see WidgetReference#PROPERTY_SHOWFIELDTITLE
     * 
     */
    public Boolean isShowFieldTitle() {
        return (Boolean) get(PROPERTY_SHOWFIELDTITLE);
    }
    /**
     * @see WidgetReference#PROPERTY_SHOWFIELDTITLE
     * 
     */
    public void setShowFieldTitle(Boolean showFieldTitle) {
        set(PROPERTY_SHOWFIELDTITLE, showFieldTitle);
    }

    /**
     * @see WidgetReference#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see WidgetReference#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

}
