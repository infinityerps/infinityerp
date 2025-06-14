
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
package org.openbravo.client.querylist;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.myob.WidgetClass;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.datasource.DataSource;
/**
 * Entity class for entity OBCQL_WidgetQuery (stored in table OBCQL_Widget_Query).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OBCQL_WidgetQuery extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBCQL_Widget_Query";
    public static final String ENTITY_NAME = "OBCQL_WidgetQuery";

    /**
     * Property id stored in column OBCQL_Widget_Query_ID in table OBCQL_Widget_Query<br>
     * Help: {@literal Identifies the HQL Query definitino of a widget class that implements the Query/List
     *       Superclass widget}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBCQL_Widget_Query 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBCQL_Widget_Query 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table OBCQL_Widget_Query 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBCQL_Widget_Query 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBCQL_Widget_Query 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBCQL_Widget_Query 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBCQL_Widget_Query 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property widgetClass stored in column OBKMO_Widget_Class_ID in table OBCQL_Widget_Query<br>
     * Help: {@literal Identifies a widget class definition}
     * 
     */
    public static final String PROPERTY_WIDGETCLASS = "widgetClass";

    /**
     * Property hQL stored in column HQL in table OBCQL_Widget_Query<br>
     * Help: {@literal A query HQL code.}
     * 
     */
    public static final String PROPERTY_HQL = "hQL";

    /**
     * Property type stored in column Type in table OBCQL_Widget_Query<br>
     * Help: {@literal The Type indicates the type of validation that will occur.  This can be SQL, Java Script
     *       or Java Language.}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property datasource stored in column Obserds_Datasource_ID in table OBCQL_Widget_Query<br>
     * Help: {@literal The datasource provides data from the database or from in-memory data.}
     * 
     */
    public static final String PROPERTY_DATASOURCE = "datasource";


    public OBCQL_WidgetQuery() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_TYPE, "HQL");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_WIDGETCLASS
     * 
     */
    public WidgetClass getWidgetClass() {
        return (WidgetClass) get(PROPERTY_WIDGETCLASS);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_WIDGETCLASS
     * 
     */
    public void setWidgetClass(WidgetClass widgetClass) {
        set(PROPERTY_WIDGETCLASS, widgetClass);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_HQL
     * 
     */
    public String getHQL() {
        return (String) get(PROPERTY_HQL);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_HQL
     * 
     */
    public void setHQL(String hQL) {
        set(PROPERTY_HQL, hQL);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see OBCQL_WidgetQuery#PROPERTY_DATASOURCE
     * 
     */
    public DataSource getDatasource() {
        return (DataSource) get(PROPERTY_DATASOURCE);
    }
    /**
     * @see OBCQL_WidgetQuery#PROPERTY_DATASOURCE
     * 
     */
    public void setDatasource(DataSource datasource) {
        set(PROPERTY_DATASOURCE, datasource);
    }

}
