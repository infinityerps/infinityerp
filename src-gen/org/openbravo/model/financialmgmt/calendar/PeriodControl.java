
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtPeriodControl (stored in table C_PeriodControl).
 * <br>
 * Help: {@literal The Period Control records the status of a Period (Never Opened, Opened, Closed) for each
     *       of the DocBaseTypes.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PeriodControl extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_PeriodControl";
    public static final String ENTITY_NAME = "FinancialMgmtPeriodControl";

    /**
     * Property id stored in column C_PeriodControl_ID in table C_PeriodControl 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_PeriodControl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_PeriodControl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_PeriodControl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_PeriodControl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_PeriodControl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_PeriodControl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_PeriodControl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property period stored in column C_Period_ID in table C_PeriodControl<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";

    /**
     * Property documentCategory stored in column DocBaseType in table C_PeriodControl<br>
     * Help: {@literal The Document Base Type identifies the base or starting point for a document.  Multiple
     *       document types may share a single document base type.}
     * 
     */
    public static final String PROPERTY_DOCUMENTCATEGORY = "documentCategory";

    /**
     * Property periodStatus stored in column PeriodStatus in table C_PeriodControl<br>
     * Help: {@literal The Period Status indicates the current status for this period.  For example 'Closed',
     *       'Open', 'Never Opened'.}
     * 
     */
    public static final String PROPERTY_PERIODSTATUS = "periodStatus";

    /**
     * Property periodAction stored in column PeriodAction in table C_PeriodControl<br>
     * Help: {@literal The Period Action indicates the action to be taken for this period.  For example 'Close
     *       Period' or 'Open Period'.}
     * 
     */
    public static final String PROPERTY_PERIODACTION = "periodAction";

    /**
     * Property processNow stored in column Processing in table C_PeriodControl<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property openClose stored in column OpenClose in table C_PeriodControl
     * 
     */
    public static final String PROPERTY_OPENCLOSE = "openClose";


    public PeriodControl() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PERIODSTATUS, "N");
        setDefaultValue(PROPERTY_PERIODACTION, "N");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_OPENCLOSE, "O");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PeriodControl#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PeriodControl#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PeriodControl#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PeriodControl#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PeriodControl#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PeriodControl#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PeriodControl#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PeriodControl#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PeriodControl#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PeriodControl#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PeriodControl#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PeriodControl#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PeriodControl#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PeriodControl#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PeriodControl#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PeriodControl#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PeriodControl#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see PeriodControl#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    /**
     * @see PeriodControl#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public String getDocumentCategory() {
        return (String) get(PROPERTY_DOCUMENTCATEGORY);
    }
    /**
     * @see PeriodControl#PROPERTY_DOCUMENTCATEGORY
     * 
     */
    public void setDocumentCategory(String documentCategory) {
        set(PROPERTY_DOCUMENTCATEGORY, documentCategory);
    }

    /**
     * @see PeriodControl#PROPERTY_PERIODSTATUS
     * 
     */
    public String getPeriodStatus() {
        return (String) get(PROPERTY_PERIODSTATUS);
    }
    /**
     * @see PeriodControl#PROPERTY_PERIODSTATUS
     * 
     */
    public void setPeriodStatus(String periodStatus) {
        set(PROPERTY_PERIODSTATUS, periodStatus);
    }

    /**
     * @see PeriodControl#PROPERTY_PERIODACTION
     * 
     */
    public String getPeriodAction() {
        return (String) get(PROPERTY_PERIODACTION);
    }
    /**
     * @see PeriodControl#PROPERTY_PERIODACTION
     * 
     */
    public void setPeriodAction(String periodAction) {
        set(PROPERTY_PERIODACTION, periodAction);
    }

    /**
     * @see PeriodControl#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see PeriodControl#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see PeriodControl#PROPERTY_OPENCLOSE
     * 
     */
    public String getOpenClose() {
        return (String) get(PROPERTY_OPENCLOSE);
    }
    /**
     * @see PeriodControl#PROPERTY_OPENCLOSE
     * 
     */
    public void setOpenClose(String openClose) {
        set(PROPERTY_OPENCLOSE, openClose);
    }

}
