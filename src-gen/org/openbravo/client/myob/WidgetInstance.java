
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
import org.openbravo.client.application.ParameterValue;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBKMO_WidgetInstance (stored in table OBKMO_Widget_Instance).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WidgetInstance extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBKMO_Widget_Instance";
    public static final String ENTITY_NAME = "OBKMO_WidgetInstance";

    /**
     * Property id stored in column Obkmo_Widget_Instance_ID in table OBKMO_Widget_Instance<br>
     * Help: {@literal Identifies an instance of a Widget Class}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBKMO_Widget_Instance 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBKMO_Widget_Instance 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBKMO_Widget_Instance 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBKMO_Widget_Instance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBKMO_Widget_Instance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBKMO_Widget_Instance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBKMO_Widget_Instance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property widgetClass stored in column Obkmo_Widget_Class_ID in table OBKMO_Widget_Instance<br>
     * Help: {@literal Identifies a widget class definition}
     * 
     */
    public static final String PROPERTY_WIDGETCLASS = "widgetClass";

    /**
     * Property copiedFrom stored in column Copied_From in table OBKMO_Widget_Instance<br>
     * Help: {@literal Original Widget Instance that this instance was copied from.}
     * 
     */
    public static final String PROPERTY_COPIEDFROM = "copiedFrom";

    /**
     * Property columnPosition stored in column Pos_Column in table OBKMO_Widget_Instance 
     * 
     */
    public static final String PROPERTY_COLUMNPOSITION = "columnPosition";

    /**
     * Property sequenceInColumn stored in column POS_Sequence in table OBKMO_Widget_Instance 
     * 
     */
    public static final String PROPERTY_SEQUENCEINCOLUMN = "sequenceInColumn";

    /**
     * Property visibleAtRole stored in column Visibleat_Role_ID in table OBKMO_Widget_Instance<br>
     * Help: {@literal Defines which is the preference's visibility at Role level. If this value is empty the
     *       preference will be visible from all Roles.}
     * 
     */
    public static final String PROPERTY_VISIBLEATROLE = "visibleAtRole";

    /**
     * Property visibleAtUser stored in column Visibleat_User_ID in table OBKMO_Widget_Instance<br>
     * Help: {@literal Defines which is the preference's visibility at User level.}
     * 
     */
    public static final String PROPERTY_VISIBLEATUSER = "visibleAtUser";

    /**
     * Property relativePriority stored in column Priorityno in table OBKMO_Widget_Instance<br>
     * Help: {@literal The Relative Priority indicates the location to pick from first if an product is stored in
     *       more than one location.  (0 = highest priority)}
     * 
     */
    public static final String PROPERTY_RELATIVEPRIORITY = "relativePriority";

    /**
     * Property oBUIAPPParameterValueEMObkmoWidgetInstanceIDList stored in table OBKMO_Widget_Instance
     * 
     */
    public static final String PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST = "oBUIAPPParameterValueEMObkmoWidgetInstanceIDList";


    public WidgetInstance() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_COLUMNPOSITION, (long) 0);
        setDefaultValue(PROPERTY_SEQUENCEINCOLUMN, (long) 1);
        setDefaultValue(PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WidgetInstance#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WidgetInstance#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WidgetInstance#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WidgetInstance#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WidgetInstance#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WidgetInstance#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WidgetInstance#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WidgetInstance#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WidgetInstance#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WidgetInstance#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WidgetInstance#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WidgetInstance#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WidgetInstance#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WidgetInstance#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WidgetInstance#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WidgetInstance#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WidgetInstance#PROPERTY_WIDGETCLASS
     * 
     */
    public WidgetClass getWidgetClass() {
        return (WidgetClass) get(PROPERTY_WIDGETCLASS);
    }
    /**
     * @see WidgetInstance#PROPERTY_WIDGETCLASS
     * 
     */
    public void setWidgetClass(WidgetClass widgetClass) {
        set(PROPERTY_WIDGETCLASS, widgetClass);
    }

    /**
     * @see WidgetInstance#PROPERTY_COPIEDFROM
     * 
     */
    public WidgetInstance getCopiedFrom() {
        return (WidgetInstance) get(PROPERTY_COPIEDFROM);
    }
    /**
     * @see WidgetInstance#PROPERTY_COPIEDFROM
     * 
     */
    public void setCopiedFrom(WidgetInstance copiedFrom) {
        set(PROPERTY_COPIEDFROM, copiedFrom);
    }

    /**
     * @see WidgetInstance#PROPERTY_COLUMNPOSITION
     * 
     */
    public Long getColumnPosition() {
        return (Long) get(PROPERTY_COLUMNPOSITION);
    }
    /**
     * @see WidgetInstance#PROPERTY_COLUMNPOSITION
     * 
     */
    public void setColumnPosition(Long columnPosition) {
        set(PROPERTY_COLUMNPOSITION, columnPosition);
    }

    /**
     * @see WidgetInstance#PROPERTY_SEQUENCEINCOLUMN
     * 
     */
    public Long getSequenceInColumn() {
        return (Long) get(PROPERTY_SEQUENCEINCOLUMN);
    }
    /**
     * @see WidgetInstance#PROPERTY_SEQUENCEINCOLUMN
     * 
     */
    public void setSequenceInColumn(Long sequenceInColumn) {
        set(PROPERTY_SEQUENCEINCOLUMN, sequenceInColumn);
    }

    /**
     * @see WidgetInstance#PROPERTY_VISIBLEATROLE
     * 
     */
    public Role getVisibleAtRole() {
        return (Role) get(PROPERTY_VISIBLEATROLE);
    }
    /**
     * @see WidgetInstance#PROPERTY_VISIBLEATROLE
     * 
     */
    public void setVisibleAtRole(Role visibleAtRole) {
        set(PROPERTY_VISIBLEATROLE, visibleAtRole);
    }

    /**
     * @see WidgetInstance#PROPERTY_VISIBLEATUSER
     * 
     */
    public User getVisibleAtUser() {
        return (User) get(PROPERTY_VISIBLEATUSER);
    }
    /**
     * @see WidgetInstance#PROPERTY_VISIBLEATUSER
     * 
     */
    public void setVisibleAtUser(User visibleAtUser) {
        set(PROPERTY_VISIBLEATUSER, visibleAtUser);
    }

    /**
     * @see WidgetInstance#PROPERTY_RELATIVEPRIORITY
     * 
     */
    public Long getRelativePriority() {
        return (Long) get(PROPERTY_RELATIVEPRIORITY);
    }
    /**
     * @see WidgetInstance#PROPERTY_RELATIVEPRIORITY
     * 
     */
    public void setRelativePriority(Long relativePriority) {
        set(PROPERTY_RELATIVEPRIORITY, relativePriority);
    }

    /**
     * @see ParameterValue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ParameterValue> getOBUIAPPParameterValueEMObkmoWidgetInstanceIDList() {
      return (List<ParameterValue>) get(PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST);
    }

    /**
     * @see ParameterValue
     * 
     */
    public void setOBUIAPPParameterValueEMObkmoWidgetInstanceIDList(List<ParameterValue> oBUIAPPParameterValueEMObkmoWidgetInstanceIDList) {
        set(PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST, oBUIAPPParameterValueEMObkmoWidgetInstanceIDList);
    }

}
