
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
package org.openbravo.model.financialmgmt.payment;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FIN_ReconciliationLine_v (stored in table FIN_ReconciliationLine_v).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_ReconciliationLine_v extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_ReconciliationLine_v";
    public static final String ENTITY_NAME = "FIN_ReconciliationLine_v";

    /**
     * Property id stored in column FIN_Reconciliationline_V_ID in table FIN_ReconciliationLine_v 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property financialAccountTransaction stored in column FIN_Finacc_Transaction_ID in table FIN_ReconciliationLine_v
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNTTRANSACTION = "financialAccountTransaction";

    /**
     * Property client stored in column AD_Client_ID in table FIN_ReconciliationLine_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_ReconciliationLine_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_ReconciliationLine_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_ReconciliationLine_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_ReconciliationLine_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_ReconciliationLine_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_ReconciliationLine_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property payment stored in column FIN_Payment_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property financialAccount stored in column FIN_Financial_Account_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNT = "financialAccount";

    /**
     * Property accountingDate stored in column Dateacct in table FIN_ReconciliationLine_v<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property gLItem stored in column C_Glitem_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property paymentAmount stored in column Paymentamt in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Withdrawal amount}
     * 
     */
    public static final String PROPERTY_PAYMENTAMOUNT = "paymentAmount";

    /**
     * Property depositAmount stored in column Depositamt in table FIN_ReconciliationLine_v
     * 
     */
    public static final String PROPERTY_DEPOSITAMOUNT = "depositAmount";

    /**
     * Property project stored in column C_Project_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property transactionType stored in column Trxtype in table FIN_ReconciliationLine_v<br>
     * Help: {@literal The Transaction Type indicates the type of transaction to be submitted to the Credit Card
     *       Company.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONTYPE = "transactionType";

    /**
     * Property transactionDate stored in column Statementdate in table FIN_ReconciliationLine_v<br>
     * Help: {@literal The Statement Date field defines the date of the statement being processed.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property description stored in column Description in table FIN_ReconciliationLine_v<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property reconciliation stored in column FIN_Reconciliation_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Reconciliation events related to the financial account}
     * 
     */
    public static final String PROPERTY_RECONCILIATION = "reconciliation";

    /**
     * Property bankStatementLine stored in column FIN_Bankstatementline_ID in table FIN_ReconciliationLine_v<br>
     * Help: {@literal Line related to the bank statement}
     * 
     */
    public static final String PROPERTY_BANKSTATEMENTLINE = "bankStatementLine";


    public FIN_ReconciliationLine_v() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public FIN_FinaccTransaction getFinancialAccountTransaction() {
        return (FIN_FinaccTransaction) get(PROPERTY_FINANCIALACCOUNTTRANSACTION);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public void setFinancialAccountTransaction(FIN_FinaccTransaction financialAccountTransaction) {
        set(PROPERTY_FINANCIALACCOUNTTRANSACTION, financialAccountTransaction);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public FIN_FinancialAccount getFinancialAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_FINANCIALACCOUNT);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_FINANCIALACCOUNT
     * 
     */
    public void setFinancialAccount(FIN_FinancialAccount financialAccount) {
        set(PROPERTY_FINANCIALACCOUNT, financialAccount);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_PAYMENTAMOUNT
     * 
     */
    public BigDecimal getPaymentAmount() {
        return (BigDecimal) get(PROPERTY_PAYMENTAMOUNT);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_PAYMENTAMOUNT
     * 
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        set(PROPERTY_PAYMENTAMOUNT, paymentAmount);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_DEPOSITAMOUNT
     * 
     */
    public BigDecimal getDepositAmount() {
        return (BigDecimal) get(PROPERTY_DEPOSITAMOUNT);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_DEPOSITAMOUNT
     * 
     */
    public void setDepositAmount(BigDecimal depositAmount) {
        set(PROPERTY_DEPOSITAMOUNT, depositAmount);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public String getTransactionType() {
        return (String) get(PROPERTY_TRANSACTIONTYPE);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public void setTransactionType(String transactionType) {
        set(PROPERTY_TRANSACTIONTYPE, transactionType);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_RECONCILIATION
     * 
     */
    public FIN_Reconciliation getReconciliation() {
        return (FIN_Reconciliation) get(PROPERTY_RECONCILIATION);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_RECONCILIATION
     * 
     */
    public void setReconciliation(FIN_Reconciliation reconciliation) {
        set(PROPERTY_RECONCILIATION, reconciliation);
    }

    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public FIN_BankStatementLine getBankStatementLine() {
        return (FIN_BankStatementLine) get(PROPERTY_BANKSTATEMENTLINE);
    }
    /**
     * @see FIN_ReconciliationLine_v#PROPERTY_BANKSTATEMENTLINE
     * 
     */
    public void setBankStatementLine(FIN_BankStatementLine bankStatementLine) {
        set(PROPERTY_BANKSTATEMENTLINE, bankStatementLine);
    }

}
