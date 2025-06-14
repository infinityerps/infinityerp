
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
package org.openbravo.model.financialmgmt.calendar;

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
 * Entity class for entity FinancialMgmtCalendar (stored in table C_Calendar).
 * <br>
 * Help: {@literal The Calendar Tab defines each calendar that will be used by an Organization.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Calendar extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Calendar";
    public static final String ENTITY_NAME = "FinancialMgmtCalendar";

    /**
     * Property id stored in column C_Calendar_ID in table C_Calendar<br>
     * Help: {@literal The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used. 
     *       For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar
     *       that runs from July 1 to June 30.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Calendar 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Calendar 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Calendar 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Calendar 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Calendar 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Calendar 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Calendar 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Calendar 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Calendar<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property financialMgmtNonBusinessDayList stored in table C_Calendar
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTNONBUSINESSDAYLIST = "financialMgmtNonBusinessDayList";

    /**
     * Property financialMgmtYearList stored in table C_Calendar
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTYEARLIST = "financialMgmtYearList";


    public Calendar() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FINANCIALMGMTNONBUSINESSDAYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTYEARLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Calendar#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Calendar#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Calendar#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Calendar#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Calendar#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Calendar#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Calendar#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Calendar#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Calendar#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Calendar#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Calendar#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Calendar#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Calendar#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Calendar#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Calendar#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Calendar#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Calendar#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Calendar#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Calendar#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Calendar#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * Help: {@literal The Non Business Days Tab defines those days to exclude when calculating the due date for
     *       given payment terms.  For example, if an invoice terms was Net 10 days and the Invoice Date was
     *       2/17/2000 the due date would be 2/27/2000.  If 2/27/2000 was defined}<br>
     * @see NonBusinessDay
     * 
     */
    @SuppressWarnings("unchecked")
    public List<NonBusinessDay> getFinancialMgmtNonBusinessDayList() {
      return (List<NonBusinessDay>) get(PROPERTY_FINANCIALMGMTNONBUSINESSDAYLIST);
    }

    /**
     * Help: {@literal The Non Business Days Tab defines those days to exclude when calculating the due date for
     *       given payment terms.  For example, if an invoice terms was Net 10 days and the Invoice Date was
     *       2/17/2000 the due date would be 2/27/2000.  If 2/27/2000 was defined}<br>
     * @see NonBusinessDay
     * 
     */
    public void setFinancialMgmtNonBusinessDayList(List<NonBusinessDay> financialMgmtNonBusinessDayList) {
        set(PROPERTY_FINANCIALMGMTNONBUSINESSDAYLIST, financialMgmtNonBusinessDayList);
    }

    /**
     * Help: {@literal The Year Window is used to define each year for the specified calendar.}<br>
     * @see Year
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Year> getFinancialMgmtYearList() {
      return (List<Year>) get(PROPERTY_FINANCIALMGMTYEARLIST);
    }

    /**
     * Help: {@literal The Year Window is used to define each year for the specified calendar.}<br>
     * @see Year
     * 
     */
    public void setFinancialMgmtYearList(List<Year> financialMgmtYearList) {
        set(PROPERTY_FINANCIALMGMTYEARLIST, financialMgmtYearList);
    }

}
