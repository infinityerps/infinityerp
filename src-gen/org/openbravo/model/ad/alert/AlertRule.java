
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
package org.openbravo.model.ad.alert;

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
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADAlertRule (stored in table AD_AlertRule).
 * <br>
 * Help: {@literal Alert Rule defines the condition that will raise alerts.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AlertRule extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_AlertRule";
    public static final String ENTITY_NAME = "ADAlertRule";

    /**
     * Property id stored in column AD_AlertRule_ID in table AD_AlertRule<br>
     * Help: {@literal Definition of the alert element.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_AlertRule 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_AlertRule 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_AlertRule 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_AlertRule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_AlertRule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_AlertRule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_AlertRule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_AlertRule 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property tab stored in column AD_Tab_ID in table AD_AlertRule<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property filterClause stored in column FilterClause in table AD_AlertRule<br>
     * Help: {@literal Filter clause}
     * 
     */
    public static final String PROPERTY_FILTERCLAUSE = "filterClause";

    /**
     * Property sql stored in column Sql in table AD_AlertRule<br>
     * Help: {@literal SQL clause to be executed}
     * 
     */
    public static final String PROPERTY_SQL = "sql";

    /**
     * Property type stored in column Type in table AD_AlertRule<br>
     * Help: {@literal The Type indicates the type of validation that will occur.  This can be SQL, Java Script
     *       or Java Language.}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property aDAlertList stored in table AD_AlertRule
     * 
     */
    public static final String PROPERTY_ADALERTLIST = "aDAlertList";

    /**
     * Property aDAlertRecipientList stored in table AD_AlertRule
     * 
     */
    public static final String PROPERTY_ADALERTRECIPIENTLIST = "aDAlertRecipientList";

    /**
     * Property aDAlertRuleTrlList stored in table AD_AlertRule
     * 
     */
    public static final String PROPERTY_ADALERTRULETRLLIST = "aDAlertRuleTrlList";


    public AlertRule() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_TYPE, "D");
        setDefaultValue(PROPERTY_ADALERTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADALERTRECIPIENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADALERTRULETRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AlertRule#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AlertRule#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AlertRule#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AlertRule#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AlertRule#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AlertRule#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AlertRule#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AlertRule#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AlertRule#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AlertRule#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AlertRule#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AlertRule#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AlertRule#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AlertRule#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AlertRule#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AlertRule#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AlertRule#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AlertRule#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AlertRule#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see AlertRule#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see AlertRule#PROPERTY_FILTERCLAUSE
     * 
     */
    public String getFilterClause() {
        return (String) get(PROPERTY_FILTERCLAUSE);
    }
    /**
     * @see AlertRule#PROPERTY_FILTERCLAUSE
     * 
     */
    public void setFilterClause(String filterClause) {
        set(PROPERTY_FILTERCLAUSE, filterClause);
    }

    /**
     * @see AlertRule#PROPERTY_SQL
     * 
     */
    public String getSql() {
        return (String) get(PROPERTY_SQL);
    }
    /**
     * @see AlertRule#PROPERTY_SQL
     * 
     */
    public void setSql(String sql) {
        set(PROPERTY_SQL, sql);
    }

    /**
     * @see AlertRule#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see AlertRule#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * Help: {@literal This table stores a line per each of the raised alerts.}<br>
     * @see Alert
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Alert> getADAlertList() {
      return (List<Alert>) get(PROPERTY_ADALERTLIST);
    }

    /**
     * Help: {@literal This table stores a line per each of the raised alerts.}<br>
     * @see Alert
     * 
     */
    public void setADAlertList(List<Alert> aDAlertList) {
        set(PROPERTY_ADALERTLIST, aDAlertList);
    }

    /**
     * Help: {@literal This table contains the recipients of the alert, they can be defined as individual users
     *       or as roles.}<br>
     * @see AlertRecipient
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AlertRecipient> getADAlertRecipientList() {
      return (List<AlertRecipient>) get(PROPERTY_ADALERTRECIPIENTLIST);
    }

    /**
     * Help: {@literal This table contains the recipients of the alert, they can be defined as individual users
     *       or as roles.}<br>
     * @see AlertRecipient
     * 
     */
    public void setADAlertRecipientList(List<AlertRecipient> aDAlertRecipientList) {
        set(PROPERTY_ADALERTRECIPIENTLIST, aDAlertRecipientList);
    }

    /**
     * Help: {@literal Translations for alert rules.}<br>
     * @see AlertRuleTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AlertRuleTrl> getADAlertRuleTrlList() {
      return (List<AlertRuleTrl>) get(PROPERTY_ADALERTRULETRLLIST);
    }

    /**
     * Help: {@literal Translations for alert rules.}<br>
     * @see AlertRuleTrl
     * 
     */
    public void setADAlertRuleTrlList(List<AlertRuleTrl> aDAlertRuleTrlList) {
        set(PROPERTY_ADALERTRULETRLLIST, aDAlertRuleTrlList);
    }

}
