
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
package org.openbravo.model.financialmgmt.accounting.report;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;
/**
 * Entity class for entity FinancialMgmtAccountingRptElement (stored in table AD_AccountingRpt_Element).
 * <br>
 * Help: {@literal Elements that will compose an accounting report. Allows user to configure his own
     *       accounting report.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AccountingRptElement extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_AccountingRpt_Element";
    public static final String ENTITY_NAME = "FinancialMgmtAccountingRptElement";

    /**
     * Property id stored in column AD_Accountingrpt_Element_ID in table AD_AccountingRpt_Element 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property updated stored in column Updated in table AD_AccountingRpt_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_AccountingRpt_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property creationDate stored in column Created in table AD_AccountingRpt_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_AccountingRpt_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property active stored in column IsActive in table AD_AccountingRpt_Element 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property client stored in column AD_Client_ID in table AD_AccountingRpt_Element 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_AccountingRpt_Element 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property name stored in column Name in table AD_AccountingRpt_Element 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_AccountingRpt_Element<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property summaryLevel stored in column IsSummary in table AD_AccountingRpt_Element<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property shown stored in column Isshown in table AD_AccountingRpt_Element<br>
     * Help: {@literal Element will be displayed.}
     * 
     */
    public static final String PROPERTY_SHOWN = "shown";

    /**
     * Property filteredByOrganization stored in column Filteredbyorganization in table AD_AccountingRpt_Element
     * 
     */
    public static final String PROPERTY_FILTEREDBYORGANIZATION = "filteredByOrganization";

    /**
     * Property reportingInterval stored in column TemporaryFilterType in table AD_AccountingRpt_Element
     * 
     */
    public static final String PROPERTY_REPORTINGINTERVAL = "reportingInterval";

    /**
     * Property account stored in column Account_ID in table AD_AccountingRpt_Element<br>
     * Help: {@literal The (natural) account used}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table AD_AccountingRpt_Element<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property report stored in column IsReport in table AD_AccountingRpt_Element<br>
     * Help: {@literal The Report checkbox indicates that this record is a report as opposed to a process}
     * 
     */
    public static final String PROPERTY_REPORT = "report";

    /**
     * Property reportType stored in column Report_Type in table AD_AccountingRpt_Element<br>
     * Help: {@literal Refers to the way that this report is gong to calculate the amount for this entry.}
     * 
     */
    public static final String PROPERTY_REPORTTYPE = "reportType";

    /**
     * Property yearInitialBalance stored in column Isinitialbalance in table AD_AccountingRpt_Element<br>
     * Help: {@literal If checked the system will automatically calculate the opening balance for the fiscal year
     *       (regardless of whether the period is monthly or quarterly).}
     * 
     */
    public static final String PROPERTY_YEARINITIALBALANCE = "yearInitialBalance";

    /**
     * Property considerZero stored in column Consider_Zero in table AD_AccountingRpt_Element<br>
     * Help: {@literal Condition to use the account Balance or Zero instead.
     *       When Never the Balance is always
     *       used, when Positive the balance is considered Zero if it is Positive and when Negative the balance
     *       is considered Zero if it is Negative.}
     * 
     */
    public static final String PROPERTY_CONSIDERZERO = "considerZero";


    public AccountingRptElement() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, true);
        setDefaultValue(PROPERTY_SHOWN, true);
        setDefaultValue(PROPERTY_FILTEREDBYORGANIZATION, false);
        setDefaultValue(PROPERTY_REPORT, false);
        setDefaultValue(PROPERTY_REPORTTYPE, "dd");
        setDefaultValue(PROPERTY_YEARINITIALBALANCE, false);
        setDefaultValue(PROPERTY_CONSIDERZERO, "NEVER");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AccountingRptElement#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AccountingRptElement#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AccountingRptElement#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AccountingRptElement#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AccountingRptElement#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AccountingRptElement#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AccountingRptElement#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AccountingRptElement#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AccountingRptElement#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AccountingRptElement#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AccountingRptElement#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AccountingRptElement#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AccountingRptElement#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AccountingRptElement#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AccountingRptElement#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AccountingRptElement#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AccountingRptElement#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AccountingRptElement#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AccountingRptElement#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AccountingRptElement#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AccountingRptElement#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see AccountingRptElement#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see AccountingRptElement#PROPERTY_SHOWN
     * 
     */
    public Boolean isShown() {
        return (Boolean) get(PROPERTY_SHOWN);
    }
    /**
     * @see AccountingRptElement#PROPERTY_SHOWN
     * 
     */
    public void setShown(Boolean shown) {
        set(PROPERTY_SHOWN, shown);
    }

    /**
     * @see AccountingRptElement#PROPERTY_FILTEREDBYORGANIZATION
     * 
     */
    public Boolean isFilteredByOrganization() {
        return (Boolean) get(PROPERTY_FILTEREDBYORGANIZATION);
    }
    /**
     * @see AccountingRptElement#PROPERTY_FILTEREDBYORGANIZATION
     * 
     */
    public void setFilteredByOrganization(Boolean filteredByOrganization) {
        set(PROPERTY_FILTEREDBYORGANIZATION, filteredByOrganization);
    }

    /**
     * @see AccountingRptElement#PROPERTY_REPORTINGINTERVAL
     * 
     */
    public String getReportingInterval() {
        return (String) get(PROPERTY_REPORTINGINTERVAL);
    }
    /**
     * @see AccountingRptElement#PROPERTY_REPORTINGINTERVAL
     * 
     */
    public void setReportingInterval(String reportingInterval) {
        set(PROPERTY_REPORTINGINTERVAL, reportingInterval);
    }

    /**
     * @see AccountingRptElement#PROPERTY_ACCOUNT
     * 
     */
    public ElementValue getAccount() {
        return (ElementValue) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see AccountingRptElement#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(ElementValue account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see AccountingRptElement#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AccountingRptElement#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AccountingRptElement#PROPERTY_REPORT
     * 
     */
    public Boolean isReport() {
        return (Boolean) get(PROPERTY_REPORT);
    }
    /**
     * @see AccountingRptElement#PROPERTY_REPORT
     * 
     */
    public void setReport(Boolean report) {
        set(PROPERTY_REPORT, report);
    }

    /**
     * @see AccountingRptElement#PROPERTY_REPORTTYPE
     * 
     */
    public String getReportType() {
        return (String) get(PROPERTY_REPORTTYPE);
    }
    /**
     * @see AccountingRptElement#PROPERTY_REPORTTYPE
     * 
     */
    public void setReportType(String reportType) {
        set(PROPERTY_REPORTTYPE, reportType);
    }

    /**
     * @see AccountingRptElement#PROPERTY_YEARINITIALBALANCE
     * 
     */
    public Boolean isYearInitialBalance() {
        return (Boolean) get(PROPERTY_YEARINITIALBALANCE);
    }
    /**
     * @see AccountingRptElement#PROPERTY_YEARINITIALBALANCE
     * 
     */
    public void setYearInitialBalance(Boolean yearInitialBalance) {
        set(PROPERTY_YEARINITIALBALANCE, yearInitialBalance);
    }

    /**
     * @see AccountingRptElement#PROPERTY_CONSIDERZERO
     * 
     */
    public String getConsiderZero() {
        return (String) get(PROPERTY_CONSIDERZERO);
    }
    /**
     * @see AccountingRptElement#PROPERTY_CONSIDERZERO
     * 
     */
    public void setConsiderZero(String considerZero) {
        set(PROPERTY_CONSIDERZERO, considerZero);
    }

}
