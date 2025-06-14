
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
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
/**
 * Entity class for entity FinancialMgmtAccountingReport (stored in table C_Acct_Rpt).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AccountingReport extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Acct_Rpt";
    public static final String ENTITY_NAME = "FinancialMgmtAccountingReport";

    /**
     * Property id stored in column C_Acct_Rpt_ID in table C_Acct_Rpt<br>
     * Help: {@literal General Accounting Report defines general reports for accounting.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Acct_Rpt 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Acct_Rpt 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Acct_Rpt 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Acct_Rpt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Acct_Rpt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Acct_Rpt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Acct_Rpt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Acct_Rpt 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Acct_Rpt<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property accountingSchema stored in column C_Acctschema_ID in table C_Acct_Rpt<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property balanced stored in column IsOrgBalanced in table C_Acct_Rpt<br>
     * Help: {@literal A balanced report is only possible for a business unit or a legal entity.}
     * 
     */
    public static final String PROPERTY_BALANCED = "balanced";

    /**
     * Property reportType stored in column ReportType in table C_Acct_Rpt<br>
     * Help: {@literal Indicates whether the report is a "Point in Time" or a "Periodic" report.<br>A Point in
     *       Time report is obtained as of a given date, taking into account the whole historical financial
     *       movements; an example of point in time report is the Balance Sheet.<br>A periodic report is executed
     *       for a date range and it does not carry forward the balance of accounting movements previous to the
     *       range; an example of periodic report is the Income Statement.}
     * 
     */
    public static final String PROPERTY_REPORTTYPE = "reportType";

    /**
     * Property financialMgmtAcctRptGroupList stored in table C_Acct_Rpt
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTACCTRPTGROUPLIST = "financialMgmtAcctRptGroupList";


    public AccountingReport() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_BALANCED, false);
        setDefaultValue(PROPERTY_REPORTTYPE, "N");
        setDefaultValue(PROPERTY_FINANCIALMGMTACCTRPTGROUPLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AccountingReport#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AccountingReport#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AccountingReport#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AccountingReport#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AccountingReport#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AccountingReport#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AccountingReport#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AccountingReport#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AccountingReport#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AccountingReport#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AccountingReport#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AccountingReport#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AccountingReport#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AccountingReport#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AccountingReport#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AccountingReport#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AccountingReport#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AccountingReport#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AccountingReport#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AccountingReport#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AccountingReport#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see AccountingReport#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see AccountingReport#PROPERTY_BALANCED
     * 
     */
    public Boolean isBalanced() {
        return (Boolean) get(PROPERTY_BALANCED);
    }
    /**
     * @see AccountingReport#PROPERTY_BALANCED
     * 
     */
    public void setBalanced(Boolean balanced) {
        set(PROPERTY_BALANCED, balanced);
    }

    /**
     * @see AccountingReport#PROPERTY_REPORTTYPE
     * 
     */
    public String getReportType() {
        return (String) get(PROPERTY_REPORTTYPE);
    }
    /**
     * @see AccountingReport#PROPERTY_REPORTTYPE
     * 
     */
    public void setReportType(String reportType) {
        set(PROPERTY_REPORTTYPE, reportType);
    }

    /**
     * @see AcctRptGroup
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AcctRptGroup> getFinancialMgmtAcctRptGroupList() {
      return (List<AcctRptGroup>) get(PROPERTY_FINANCIALMGMTACCTRPTGROUPLIST);
    }

    /**
     * @see AcctRptGroup
     * 
     */
    public void setFinancialMgmtAcctRptGroupList(List<AcctRptGroup> financialMgmtAcctRptGroupList) {
        set(PROPERTY_FINANCIALMGMTACCTRPTGROUPLIST, financialMgmtAcctRptGroupList);
    }

}
