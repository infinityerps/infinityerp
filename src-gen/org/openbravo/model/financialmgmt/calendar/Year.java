
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
 * Entity class for entity FinancialMgmtYear (stored in table C_Year).
 * <br>
 * Help: {@literal The Year Window is used to define each year for the specified calendar.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Year extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Year";
    public static final String ENTITY_NAME = "FinancialMgmtYear";

    /**
     * Property id stored in column C_Year_ID in table C_Year<br>
     * Help: {@literal The Year uniquely identifies an accounting year for a calendar.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Year 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Year 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Year 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Year 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Year 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Year 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Year 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property fiscalYear stored in column Year in table C_Year 
     * 
     */
    public static final String PROPERTY_FISCALYEAR = "fiscalYear";

    /**
     * Property description stored in column Description in table C_Year<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property calendar stored in column C_Calendar_ID in table C_Year<br>
     * Help: {@literal The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used. 
     *       For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar
     *       that runs from July 1 to June 30.}
     * 
     */
    public static final String PROPERTY_CALENDAR = "calendar";

    /**
     * Property processNow stored in column Processing in table C_Year<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property createRegFactAcct stored in column Create_Reg_Fact_Acct in table C_Year<br>
     * Help: {@literal Process to create regularization accounting entry.}
     * 
     */
    public static final String PROPERTY_CREATEREGFACTACCT = "createRegFactAcct";

    /**
     * Property dropRegFactAcct stored in column Drop_Reg_Fact_Acct in table C_Year<br>
     * Help: {@literal Process to drop regularization accounting entry.}
     * 
     */
    public static final String PROPERTY_DROPREGFACTACCT = "dropRegFactAcct";

    /**
     * Property financialMgmtPeriodList stored in table C_Year
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTPERIODLIST = "financialMgmtPeriodList";


    public Year() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_CREATEREGFACTACCT, false);
        setDefaultValue(PROPERTY_DROPREGFACTACCT, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTPERIODLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Year#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Year#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Year#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Year#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Year#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Year#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Year#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Year#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Year#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Year#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Year#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Year#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Year#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Year#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Year#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Year#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Year#PROPERTY_FISCALYEAR
     * 
     */
    public String getFiscalYear() {
        return (String) get(PROPERTY_FISCALYEAR);
    }
    /**
     * @see Year#PROPERTY_FISCALYEAR
     * 
     */
    public void setFiscalYear(String fiscalYear) {
        set(PROPERTY_FISCALYEAR, fiscalYear);
    }

    /**
     * @see Year#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Year#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Year#PROPERTY_CALENDAR
     * 
     */
    public Calendar getCalendar() {
        return (Calendar) get(PROPERTY_CALENDAR);
    }
    /**
     * @see Year#PROPERTY_CALENDAR
     * 
     */
    public void setCalendar(Calendar calendar) {
        set(PROPERTY_CALENDAR, calendar);
    }

    /**
     * @see Year#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Year#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Year#PROPERTY_CREATEREGFACTACCT
     * 
     */
    public Boolean isCreateRegFactAcct() {
        return (Boolean) get(PROPERTY_CREATEREGFACTACCT);
    }
    /**
     * @see Year#PROPERTY_CREATEREGFACTACCT
     * 
     */
    public void setCreateRegFactAcct(Boolean createRegFactAcct) {
        set(PROPERTY_CREATEREGFACTACCT, createRegFactAcct);
    }

    /**
     * @see Year#PROPERTY_DROPREGFACTACCT
     * 
     */
    public Boolean isDropRegFactAcct() {
        return (Boolean) get(PROPERTY_DROPREGFACTACCT);
    }
    /**
     * @see Year#PROPERTY_DROPREGFACTACCT
     * 
     */
    public void setDropRegFactAcct(Boolean dropRegFactAcct) {
        set(PROPERTY_DROPREGFACTACCT, dropRegFactAcct);
    }

    /**
     * Help: {@literal The Period Tab defines a Period No, Name and Start Date for each Calendar Year.  Each
     *       period begins on the defined Start Date and ends one day prior to the next period's Start Date.}<br>
     * @see Period
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Period> getFinancialMgmtPeriodList() {
      return (List<Period>) get(PROPERTY_FINANCIALMGMTPERIODLIST);
    }

    /**
     * Help: {@literal The Period Tab defines a Period No, Name and Start Date for each Calendar Year.  Each
     *       period begins on the defined Start Date and ends one day prior to the next period's Start Date.}<br>
     * @see Period
     * 
     */
    public void setFinancialMgmtPeriodList(List<Period> financialMgmtPeriodList) {
        set(PROPERTY_FINANCIALMGMTPERIODLIST, financialMgmtPeriodList);
    }

}
