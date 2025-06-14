
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
package org.openbravo.model.financialmgmt.accounting;

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
import org.openbravo.model.financialmgmt.calendar.Year;
/**
 * Entity class for entity FinancialMgmtBudget (stored in table C_Budget).
 * <br>
 * Help: {@literal The Budgets are used to define the anticipated costs of doing business.  They are used in
     *       reporting as a comparison to actual amounts.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Budget extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Budget";
    public static final String ENTITY_NAME = "FinancialMgmtBudget";

    /**
     * Property id stored in column C_Budget_ID in table C_Budget<br>
     * Help: {@literal Used to define the anticipated costs of doing business}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Budget 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Budget 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Budget 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Budget 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Budget 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Budget 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Budget 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Budget 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Budget<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property year stored in column C_Year_ID in table C_Budget<br>
     * Help: {@literal The Year uniquely identifies an accounting year for a calendar.}
     * 
     */
    public static final String PROPERTY_YEAR = "year";

    /**
     * Property copyBudget stored in column Copybudget in table C_Budget<br>
     * Help: {@literal Process to copy a budget.}
     * 
     */
    public static final String PROPERTY_COPYBUDGET = "copyBudget";

    /**
     * Property budgetType stored in column Budget_Type in table C_Budget<br>
     * Help: {@literal Clasifies budgets. They can be financial, sales or purchase budgets.}
     * 
     */
    public static final String PROPERTY_BUDGETTYPE = "budgetType";

    /**
     * Property exportToExcel stored in column Exportexcel in table C_Budget<br>
     * Help: {@literal Process to export budget to excel file.}
     * 
     */
    public static final String PROPERTY_EXPORTTOEXCEL = "exportToExcel";

    /**
     * Property exportActualData stored in column ExportActual in table C_Budget<br>
     * Help: {@literal When exporting the budgeted data, this flag indicates whether to include or not the actual
     *       data.}
     * 
     */
    public static final String PROPERTY_EXPORTACTUALDATA = "exportActualData";

    /**
     * Property process stored in column Process in table C_Budget
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property financialMgmtBudgetLineList stored in table C_Budget
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTBUDGETLINELIST = "financialMgmtBudgetLineList";


    public Budget() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COPYBUDGET, false);
        setDefaultValue(PROPERTY_BUDGETTYPE, "F");
        setDefaultValue(PROPERTY_EXPORTTOEXCEL, false);
        setDefaultValue(PROPERTY_EXPORTACTUALDATA, false);
        setDefaultValue(PROPERTY_PROCESS, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTBUDGETLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Budget#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Budget#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Budget#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Budget#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Budget#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Budget#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Budget#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Budget#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Budget#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Budget#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Budget#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Budget#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Budget#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Budget#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Budget#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Budget#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Budget#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Budget#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Budget#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Budget#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Budget#PROPERTY_YEAR
     * 
     */
    public Year getYear() {
        return (Year) get(PROPERTY_YEAR);
    }
    /**
     * @see Budget#PROPERTY_YEAR
     * 
     */
    public void setYear(Year year) {
        set(PROPERTY_YEAR, year);
    }

    /**
     * @see Budget#PROPERTY_COPYBUDGET
     * 
     */
    public Boolean isCopyBudget() {
        return (Boolean) get(PROPERTY_COPYBUDGET);
    }
    /**
     * @see Budget#PROPERTY_COPYBUDGET
     * 
     */
    public void setCopyBudget(Boolean copyBudget) {
        set(PROPERTY_COPYBUDGET, copyBudget);
    }

    /**
     * @see Budget#PROPERTY_BUDGETTYPE
     * 
     */
    public String getBudgetType() {
        return (String) get(PROPERTY_BUDGETTYPE);
    }
    /**
     * @see Budget#PROPERTY_BUDGETTYPE
     * 
     */
    public void setBudgetType(String budgetType) {
        set(PROPERTY_BUDGETTYPE, budgetType);
    }

    /**
     * @see Budget#PROPERTY_EXPORTTOEXCEL
     * 
     */
    public Boolean isExportToExcel() {
        return (Boolean) get(PROPERTY_EXPORTTOEXCEL);
    }
    /**
     * @see Budget#PROPERTY_EXPORTTOEXCEL
     * 
     */
    public void setExportToExcel(Boolean exportToExcel) {
        set(PROPERTY_EXPORTTOEXCEL, exportToExcel);
    }

    /**
     * @see Budget#PROPERTY_EXPORTACTUALDATA
     * 
     */
    public Boolean isExportActualData() {
        return (Boolean) get(PROPERTY_EXPORTACTUALDATA);
    }
    /**
     * @see Budget#PROPERTY_EXPORTACTUALDATA
     * 
     */
    public void setExportActualData(Boolean exportActualData) {
        set(PROPERTY_EXPORTACTUALDATA, exportActualData);
    }

    /**
     * @see Budget#PROPERTY_PROCESS
     * 
     */
    public Boolean isProcess() {
        return (Boolean) get(PROPERTY_PROCESS);
    }
    /**
     * @see Budget#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Boolean process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * Help: {@literal Refers to the lines associated to a budget.}<br>
     * @see BudgetLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<BudgetLine> getFinancialMgmtBudgetLineList() {
      return (List<BudgetLine>) get(PROPERTY_FINANCIALMGMTBUDGETLINELIST);
    }

    /**
     * Help: {@literal Refers to the lines associated to a budget.}<br>
     * @see BudgetLine
     * 
     */
    public void setFinancialMgmtBudgetLineList(List<BudgetLine> financialMgmtBudgetLineList) {
        set(PROPERTY_FINANCIALMGMTBUDGETLINELIST, financialMgmtBudgetLineList);
    }

}
