
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
package org.openbravo.model.ad.domain;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Field;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity TableNavigation (stored in table AD_Table_Navigation).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TableNavigation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Table_Navigation";
    public static final String ENTITY_NAME = "TableNavigation";

    /**
     * Property id stored in column AD_Table_Navigation_ID in table AD_Table_Navigation 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Table_Navigation 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Table_Navigation 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Table_Navigation 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Table_Navigation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Table_Navigation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Table_Navigation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Table_Navigation 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sequenceNumber stored in column Seqno in table AD_Table_Navigation<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property tab stored in column AD_Tab_ID in table AD_Table_Navigation<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property table stored in column AD_Table_ID in table AD_Table_Navigation<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property module stored in column AD_Module_ID in table AD_Table_Navigation<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property field stored in column AD_Field_ID in table AD_Table_Navigation<br>
     * Help: {@literal The Field identifies a field on a database table.}
     * 
     */
    public static final String PROPERTY_FIELD = "field";

    /**
     * Property hQLLogic stored in column HqlLogic in table AD_Table_Navigation<br>
     * Help: {@literal HQL where clause that the destination row has to meet in order to open the specified tab
     *       of the rule}
     * 
     */
    public static final String PROPERTY_HQLLOGIC = "hQLLogic";

    /**
     * Property directNavigation stored in column DirectNavigation in table AD_Table_Navigation<br>
     * Help: {@literal Direct Navigation indicates if a navigation rule does not need to comply an HQL Logic to
     *       be applied}
     * 
     */
    public static final String PROPERTY_DIRECTNAVIGATION = "directNavigation";


    public TableNavigation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DIRECTNAVIGATION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TableNavigation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TableNavigation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TableNavigation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TableNavigation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TableNavigation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TableNavigation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TableNavigation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TableNavigation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TableNavigation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TableNavigation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TableNavigation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TableNavigation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TableNavigation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TableNavigation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TableNavigation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TableNavigation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TableNavigation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see TableNavigation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see TableNavigation#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see TableNavigation#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see TableNavigation#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see TableNavigation#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see TableNavigation#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see TableNavigation#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see TableNavigation#PROPERTY_FIELD
     * 
     */
    public Field getField() {
        return (Field) get(PROPERTY_FIELD);
    }
    /**
     * @see TableNavigation#PROPERTY_FIELD
     * 
     */
    public void setField(Field field) {
        set(PROPERTY_FIELD, field);
    }

    /**
     * @see TableNavigation#PROPERTY_HQLLOGIC
     * 
     */
    public String getHQLLogic() {
        return (String) get(PROPERTY_HQLLOGIC);
    }
    /**
     * @see TableNavigation#PROPERTY_HQLLOGIC
     * 
     */
    public void setHQLLogic(String hQLLogic) {
        set(PROPERTY_HQLLOGIC, hQLLogic);
    }

    /**
     * @see TableNavigation#PROPERTY_DIRECTNAVIGATION
     * 
     */
    public Boolean isDirectNavigation() {
        return (Boolean) get(PROPERTY_DIRECTNAVIGATION);
    }
    /**
     * @see TableNavigation#PROPERTY_DIRECTNAVIGATION
     * 
     */
    public void setDirectNavigation(Boolean directNavigation) {
        set(PROPERTY_DIRECTNAVIGATION, directNavigation);
    }

}
