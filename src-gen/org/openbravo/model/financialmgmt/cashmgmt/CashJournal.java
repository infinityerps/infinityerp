
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
package org.openbravo.model.financialmgmt.cashmgmt;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FinancialMgmtCashJournal (stored in table C_Cash).
 * <br>
 * Help: {@literal The Cash Journal Tab defines the parameters for this journal.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CashJournal extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Cash";
    public static final String ENTITY_NAME = "FinancialMgmtCashJournal";

    /**
     * Property id stored in column C_Cash_ID in table C_Cash<br>
     * Help: {@literal The Cash Journal uniquely identifies a Cash Journal.  The Cash Journal will record
     *       transactions for the cash bank account}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Cash 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Cash 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Cash 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Cash 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Cash 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Cash 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Cash 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property cashbook stored in column C_CashBook_ID in table C_Cash<br>
     * Help: {@literal The Cash Book identifies a unique cash book.  The cash book is used to record cash
     *       transactions.}
     * 
     */
    public static final String PROPERTY_CASHBOOK = "cashbook";

    /**
     * Property name stored in column Name in table C_Cash 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Cash<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property transactionDate stored in column StatementDate in table C_Cash<br>
     * Help: {@literal The Statement Date field defines the date of the statement being processed.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property accountingDate stored in column DateAcct in table C_Cash<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property beginningBalance stored in column BeginningBalance in table C_Cash<br>
     * Help: {@literal The Beginning Balance is the balance prior to making any adjustments for payments or
     *       disbursements.}
     * 
     */
    public static final String PROPERTY_BEGINNINGBALANCE = "beginningBalance";

    /**
     * Property endingBalance stored in column EndingBalance in table C_Cash<br>
     * Help: {@literal The Ending Balance is the result of adjusting the Beginning Balance by any payments or
     *       disbursements.}
     * 
     */
    public static final String PROPERTY_ENDINGBALANCE = "endingBalance";

    /**
     * Property statementDifference stored in column StatementDifference in table C_Cash<br>
     * Help: {@literal The Statement Difference reflects the difference between the Statement Ending Balance and
     *       the Actual Ending Balance.}
     * 
     */
    public static final String PROPERTY_STATEMENTDIFFERENCE = "statementDifference";

    /**
     * Property processNow stored in column Processing in table C_Cash<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_Cash<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table C_Cash<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property trxOrganization stored in column AD_OrgTrx_ID in table C_Cash<br>
     * Help: {@literal The organization which performs or initiates this transaction (for another organization). 
     *       The owning Organization may not be the transaction organization in a service bureau environment,
     *       with centralized services, and inter-organization transactions.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property project stored in column C_Project_ID in table C_Cash<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_Cash<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table C_Cash<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table C_Cash<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table C_Cash<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";


    public CashJournal() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_POSTED, "N");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CashJournal#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CashJournal#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CashJournal#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CashJournal#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CashJournal#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CashJournal#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CashJournal#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CashJournal#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CashJournal#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CashJournal#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CashJournal#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CashJournal#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CashJournal#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CashJournal#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CashJournal#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CashJournal#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CashJournal#PROPERTY_CASHBOOK
     * 
     */
    public CashBook getCashbook() {
        return (CashBook) get(PROPERTY_CASHBOOK);
    }
    /**
     * @see CashJournal#PROPERTY_CASHBOOK
     * 
     */
    public void setCashbook(CashBook cashbook) {
        set(PROPERTY_CASHBOOK, cashbook);
    }

    /**
     * @see CashJournal#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see CashJournal#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see CashJournal#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see CashJournal#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see CashJournal#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see CashJournal#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see CashJournal#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see CashJournal#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see CashJournal#PROPERTY_BEGINNINGBALANCE
     * 
     */
    public BigDecimal getBeginningBalance() {
        return (BigDecimal) get(PROPERTY_BEGINNINGBALANCE);
    }
    /**
     * @see CashJournal#PROPERTY_BEGINNINGBALANCE
     * 
     */
    public void setBeginningBalance(BigDecimal beginningBalance) {
        set(PROPERTY_BEGINNINGBALANCE, beginningBalance);
    }

    /**
     * @see CashJournal#PROPERTY_ENDINGBALANCE
     * 
     */
    public BigDecimal getEndingBalance() {
        return (BigDecimal) get(PROPERTY_ENDINGBALANCE);
    }
    /**
     * @see CashJournal#PROPERTY_ENDINGBALANCE
     * 
     */
    public void setEndingBalance(BigDecimal endingBalance) {
        set(PROPERTY_ENDINGBALANCE, endingBalance);
    }

    /**
     * @see CashJournal#PROPERTY_STATEMENTDIFFERENCE
     * 
     */
    public BigDecimal getStatementDifference() {
        return (BigDecimal) get(PROPERTY_STATEMENTDIFFERENCE);
    }
    /**
     * @see CashJournal#PROPERTY_STATEMENTDIFFERENCE
     * 
     */
    public void setStatementDifference(BigDecimal statementDifference) {
        set(PROPERTY_STATEMENTDIFFERENCE, statementDifference);
    }

    /**
     * @see CashJournal#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see CashJournal#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see CashJournal#PROPERTY_PROCESSED
     * 
     */
    public String getProcessed() {
        return (String) get(PROPERTY_PROCESSED);
    }
    /**
     * @see CashJournal#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(String processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see CashJournal#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see CashJournal#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see CashJournal#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see CashJournal#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see CashJournal#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see CashJournal#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see CashJournal#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see CashJournal#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see CashJournal#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see CashJournal#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see CashJournal#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see CashJournal#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see CashJournal#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see CashJournal#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

}
