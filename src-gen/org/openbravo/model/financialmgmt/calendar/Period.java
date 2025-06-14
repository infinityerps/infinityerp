
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
 * Entity class for entity FinancialMgmtPeriod (stored in table C_Period).
 * <br>
 * Help: {@literal The Period Tab defines a Period No, Name and Start Date for each Calendar Year.  Each
     *       period begins on the defined Start Date and ends one day prior to the next period's Start Date.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Period extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Period";
    public static final String ENTITY_NAME = "FinancialMgmtPeriod";

    /**
     * Property id stored in column C_Period_ID in table C_Period<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Period 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Period 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Period 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Period 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Period 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Period 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Period 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Period 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property periodNo stored in column PeriodNo in table C_Period<br>
     * Help: {@literal The Period No identifies a specific period for this year. Each period is defined by a
     *       start and end date.  Date ranges for a calendar and year cannot overlap.}
     * 
     */
    public static final String PROPERTY_PERIODNO = "periodNo";

    /**
     * Property year stored in column C_Year_ID in table C_Period<br>
     * Help: {@literal The Year uniquely identifies an accounting year for a calendar.}
     * 
     */
    public static final String PROPERTY_YEAR = "year";

    /**
     * Property startingDate stored in column StartDate in table C_Period<br>
     * Help: {@literal A parameter stating when a specified request will begin.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column EndDate in table C_Period<br>
     * Help: {@literal The End Date indicates the last date in this range.}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property periodType stored in column PeriodType in table C_Period<br>
     * Help: {@literal The Period Type indicates the type (Standard or Adjustment) of period.}
     * 
     */
    public static final String PROPERTY_PERIODTYPE = "periodType";

    /**
     * Property processNow stored in column Processing in table C_Period<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property closingFactAcctGroup stored in column Close_Fact_Acct_Group_ID in table C_Period<br>
     * Help: {@literal Refers to the Fact_Acct_Group_ID of the closing entry}
     * 
     */
    public static final String PROPERTY_CLOSINGFACTACCTGROUP = "closingFactAcctGroup";

    /**
     * Property regularizationFactAcctGroup stored in column Reg_Fact_Acct_Group_ID in table C_Period<br>
     * Help: {@literal Refers to the Fact_Acct_Group_ID of the regularization entry}
     * 
     */
    public static final String PROPERTY_REGULARIZATIONFACTACCTGROUP = "regularizationFactAcctGroup";

    /**
     * Property divideupFactAcctGroup stored in column Divideup_Fact_Acct_Group_ID in table C_Period<br>
     * Help: {@literal Refers to the Fact_Acct_Group_ID of the divide up entry}
     * 
     */
    public static final String PROPERTY_DIVIDEUPFACTACCTGROUP = "divideupFactAcctGroup";

    /**
     * Property openFactAcctGroup stored in column Open_Fact_Acct_Group_ID in table C_Period<br>
     * Help: {@literal Refers to the Open_Fact_Acct_Group_ID of the open entry}
     * 
     */
    public static final String PROPERTY_OPENFACTACCTGROUP = "openFactAcctGroup";

    /**
     * Property openClose stored in column OpenClose in table C_Period
     * 
     */
    public static final String PROPERTY_OPENCLOSE = "openClose";


    /**
     * Property _computedColumns stored in column _computedColumns in table C_Period
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property financialMgmtPeriodControlList stored in table C_Period
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTPERIODCONTROLLIST = "financialMgmtPeriodControlList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property status<br>
     * 
     * Help: {@literal Status for the debt payment}<br>
     * Computed from: <br>
     * {@code (SELECT CASE
                WHEN (max(pc.periodstatus) = min(pc.periodstatus) AND min(pc.periodstatus) =
       'O') THEN 'O'
                WHEN (max(pc.periodstatus) = min(pc.periodstatus) AND min(pc.periodstatus)
       ='C') THEN 'C'
                WHEN (max(pc.periodstatus) = min(pc.periodstatus) AND min(pc.periodstatus)
       ='P') THEN 'P'
                WHEN (max(pc.periodstatus) = min(pc.periodstatus) AND min(pc.periodstatus) =
       'N') THEN 'N'
                ELSE 'M'
              END
       FROM c_periodcontrol pc
       WHERE pc.c_period_id =
       c_period_id)}
     */
    public static final String COMPUTED_COLUMN_STATUS = "status";

    public Period() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PERIODTYPE, "S");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_OPENCLOSE, "O");
        setDefaultValue(PROPERTY_FINANCIALMGMTPERIODCONTROLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Period#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Period#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Period#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Period#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Period#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Period#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Period#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Period#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Period#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Period#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Period#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Period#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Period#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Period#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Period#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Period#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Period#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Period#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Period#PROPERTY_PERIODNO
     * 
     */
    public Long getPeriodNo() {
        return (Long) get(PROPERTY_PERIODNO);
    }
    /**
     * @see Period#PROPERTY_PERIODNO
     * 
     */
    public void setPeriodNo(Long periodNo) {
        set(PROPERTY_PERIODNO, periodNo);
    }

    /**
     * @see Period#PROPERTY_YEAR
     * 
     */
    public Year getYear() {
        return (Year) get(PROPERTY_YEAR);
    }
    /**
     * @see Period#PROPERTY_YEAR
     * 
     */
    public void setYear(Year year) {
        set(PROPERTY_YEAR, year);
    }

    /**
     * @see Period#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see Period#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see Period#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see Period#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see Period#PROPERTY_PERIODTYPE
     * 
     */
    public String getPeriodType() {
        return (String) get(PROPERTY_PERIODTYPE);
    }
    /**
     * @see Period#PROPERTY_PERIODTYPE
     * 
     */
    public void setPeriodType(String periodType) {
        set(PROPERTY_PERIODTYPE, periodType);
    }

    /**
     * @see Period#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Period#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Period#PROPERTY_CLOSINGFACTACCTGROUP
     * 
     */
    public String getClosingFactAcctGroup() {
        return (String) get(PROPERTY_CLOSINGFACTACCTGROUP);
    }
    /**
     * @see Period#PROPERTY_CLOSINGFACTACCTGROUP
     * 
     */
    public void setClosingFactAcctGroup(String closingFactAcctGroup) {
        set(PROPERTY_CLOSINGFACTACCTGROUP, closingFactAcctGroup);
    }

    /**
     * @see Period#PROPERTY_REGULARIZATIONFACTACCTGROUP
     * 
     */
    public String getRegularizationFactAcctGroup() {
        return (String) get(PROPERTY_REGULARIZATIONFACTACCTGROUP);
    }
    /**
     * @see Period#PROPERTY_REGULARIZATIONFACTACCTGROUP
     * 
     */
    public void setRegularizationFactAcctGroup(String regularizationFactAcctGroup) {
        set(PROPERTY_REGULARIZATIONFACTACCTGROUP, regularizationFactAcctGroup);
    }

    /**
     * @see Period#PROPERTY_DIVIDEUPFACTACCTGROUP
     * 
     */
    public String getDivideupFactAcctGroup() {
        return (String) get(PROPERTY_DIVIDEUPFACTACCTGROUP);
    }
    /**
     * @see Period#PROPERTY_DIVIDEUPFACTACCTGROUP
     * 
     */
    public void setDivideupFactAcctGroup(String divideupFactAcctGroup) {
        set(PROPERTY_DIVIDEUPFACTACCTGROUP, divideupFactAcctGroup);
    }

    /**
     * @see Period#PROPERTY_OPENFACTACCTGROUP
     * 
     */
    public String getOpenFactAcctGroup() {
        return (String) get(PROPERTY_OPENFACTACCTGROUP);
    }
    /**
     * @see Period#PROPERTY_OPENFACTACCTGROUP
     * 
     */
    public void setOpenFactAcctGroup(String openFactAcctGroup) {
        set(PROPERTY_OPENFACTACCTGROUP, openFactAcctGroup);
    }

    /**
     * @see Period#PROPERTY_OPENCLOSE
     * 
     */
    public String getOpenClose() {
        return (String) get(PROPERTY_OPENCLOSE);
    }
    /**
     * @see Period#PROPERTY_OPENCLOSE
     * 
     */
    public void setOpenClose(String openClose) {
        set(PROPERTY_OPENCLOSE, openClose);
    }

    /**
     * @see Period#COMPUTED_COLUMN_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(COMPUTED_COLUMN_STATUS);
    }
    /**
     * @see Period#COMPUTED_COLUMN_STATUS
     * 
     */
    public void setStatus(String status) {
        set(COMPUTED_COLUMN_STATUS, status);
    }

    /**
     * @see Period#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public Period_ComputedColumns get_computedColumns() {
        return (Period_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see Period#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(Period_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * Help: {@literal The Period Control records the status of a Period (Never Opened, Opened, Closed) for each
     *       of the DocBaseTypes.}<br>
     * @see PeriodControl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PeriodControl> getFinancialMgmtPeriodControlList() {
      return (List<PeriodControl>) get(PROPERTY_FINANCIALMGMTPERIODCONTROLLIST);
    }

    /**
     * Help: {@literal The Period Control records the status of a Period (Never Opened, Opened, Closed) for each
     *       of the DocBaseTypes.}<br>
     * @see PeriodControl
     * 
     */
    public void setFinancialMgmtPeriodControlList(List<PeriodControl> financialMgmtPeriodControlList) {
        set(PROPERTY_FINANCIALMGMTPERIODCONTROLLIST, financialMgmtPeriodControlList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_STATUS.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getStatus();
      }

      return super.get(propName);
    }
}
