
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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
import org.openbravo.model.sales.SalesRegion;
/**
 * Entity class for entity FIN_Finacc_Transaction (stored in table FIN_Finacc_Transaction).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_FinaccTransaction extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Finacc_Transaction";
    public static final String ENTITY_NAME = "FIN_Finacc_Transaction";

    /**
     * Property id stored in column Fin_Finacc_Transaction_ID in table FIN_Finacc_Transaction
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Finacc_Transaction 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Finacc_Transaction 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Finacc_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Finacc_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Finacc_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Finacc_Transaction 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Finacc_Transaction 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property account stored in column Fin_Financial_Account_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property lineNo stored in column Line in table FIN_Finacc_Transaction 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property finPayment stored in column Fin_Payment_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_FINPAYMENT = "finPayment";

    /**
     * Property dateAcct stored in column DateAcct in table FIN_Finacc_Transaction<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_DATEACCT = "dateAcct";

    /**
     * Property gLItem stored in column C_Glitem_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property status stored in column Status in table FIN_Finacc_Transaction<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property paymentAmount stored in column Paymentamt in table FIN_Finacc_Transaction 
     * 
     */
    public static final String PROPERTY_PAYMENTAMOUNT = "paymentAmount";

    /**
     * Property depositAmount stored in column Depositamt in table FIN_Finacc_Transaction
     * 
     */
    public static final String PROPERTY_DEPOSITAMOUNT = "depositAmount";

    /**
     * Property processed stored in column Processed in table FIN_Finacc_Transaction<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property processNow stored in column Processing in table FIN_Finacc_Transaction<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property posted stored in column Posted in table FIN_Finacc_Transaction<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property project stored in column C_Project_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property transactionType stored in column Trxtype in table FIN_Finacc_Transaction<br>
     * Help: {@literal The Transaction Type indicates the type of transaction to be submitted to the Credit Card
     *       Company.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONTYPE = "transactionType";

    /**
     * Property transactionDate stored in column Statementdate in table FIN_Finacc_Transaction<br>
     * Help: {@literal The Statement Date field defines the date of the statement being processed.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property description stored in column Description in table FIN_Finacc_Transaction<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property reconciliation stored in column FIN_Reconciliation_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Reconciliation events related to the financial account}
     * 
     */
    public static final String PROPERTY_RECONCILIATION = "reconciliation";

    /**
     * Property createdByAlgorithm stored in column CreatedByAlgorithm in table FIN_Finacc_Transaction<br>
     * Help: {@literal This column reflects whether the document was created by the matching algorithm or not.}
     * 
     */
    public static final String PROPERTY_CREATEDBYALGORITHM = "createdByAlgorithm";

    /**
     * Property foreignCurrency stored in column Foreign_Currency_ID in table FIN_Finacc_Transaction
     * 
     */
    public static final String PROPERTY_FOREIGNCURRENCY = "foreignCurrency";

    /**
     * Property foreignConversionRate stored in column Foreign_Convert_Rate in table FIN_Finacc_Transaction
     * 
     */
    public static final String PROPERTY_FOREIGNCONVERSIONRATE = "foreignConversionRate";

    /**
     * Property foreignAmount stored in column Foreign_Amount in table FIN_Finacc_Transaction
     * 
     */
    public static final String PROPERTY_FOREIGNAMOUNT = "foreignAmount";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property product stored in column M_Product_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property salesRegion stored in column C_Salesregion_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table FIN_Finacc_Transaction<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property aprmProcessed stored in column EM_Aprm_Processed in table FIN_Finacc_Transaction<br>
     * Help: {@literal Process Button}
     * 
     */
    public static final String PROPERTY_APRMPROCESSED = "aprmProcessed";

    /**
     * Property aprmFinaccTransOrigin stored in column EM_Aprm_Finacc_Trans_Origin in table FIN_Finacc_Transaction<br>
     * Help: {@literal Financial Account from where the funds were transferred}
     * 
     */
    public static final String PROPERTY_APRMFINACCTRANSORIGIN = "aprmFinaccTransOrigin";

    /**
     * Property fINBankStatementLineList stored in table FIN_Finacc_Transaction
     * 
     */
    public static final String PROPERTY_FINBANKSTATEMENTLINELIST = "fINBankStatementLineList";


    public FIN_FinaccTransaction() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_STATUS, "RPAP");
        setDefaultValue(PROPERTY_PAYMENTAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_DEPOSITAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_TRANSACTIONTYPE, "BPD");
        setDefaultValue(PROPERTY_CREATEDBYALGORITHM, false);
        setDefaultValue(PROPERTY_APRMPROCESSED, "P");
        setDefaultValue(PROPERTY_FINBANKSTATEMENTLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_FINPAYMENT
     * 
     */
    public FIN_Payment getFinPayment() {
        return (FIN_Payment) get(PROPERTY_FINPAYMENT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_FINPAYMENT
     * 
     */
    public void setFinPayment(FIN_Payment finPayment) {
        set(PROPERTY_FINPAYMENT, finPayment);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_DATEACCT
     * 
     */
    public Date getDateAcct() {
        return (Date) get(PROPERTY_DATEACCT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_DATEACCT
     * 
     */
    public void setDateAcct(Date dateAcct) {
        set(PROPERTY_DATEACCT, dateAcct);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_PAYMENTAMOUNT
     * 
     */
    public BigDecimal getPaymentAmount() {
        return (BigDecimal) get(PROPERTY_PAYMENTAMOUNT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_PAYMENTAMOUNT
     * 
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        set(PROPERTY_PAYMENTAMOUNT, paymentAmount);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_DEPOSITAMOUNT
     * 
     */
    public BigDecimal getDepositAmount() {
        return (BigDecimal) get(PROPERTY_DEPOSITAMOUNT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_DEPOSITAMOUNT
     * 
     */
    public void setDepositAmount(BigDecimal depositAmount) {
        set(PROPERTY_DEPOSITAMOUNT, depositAmount);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public String getTransactionType() {
        return (String) get(PROPERTY_TRANSACTIONTYPE);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public void setTransactionType(String transactionType) {
        set(PROPERTY_TRANSACTIONTYPE, transactionType);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_RECONCILIATION
     * 
     */
    public FIN_Reconciliation getReconciliation() {
        return (FIN_Reconciliation) get(PROPERTY_RECONCILIATION);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_RECONCILIATION
     * 
     */
    public void setReconciliation(FIN_Reconciliation reconciliation) {
        set(PROPERTY_RECONCILIATION, reconciliation);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_CREATEDBYALGORITHM
     * 
     */
    public Boolean isCreatedByAlgorithm() {
        return (Boolean) get(PROPERTY_CREATEDBYALGORITHM);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_CREATEDBYALGORITHM
     * 
     */
    public void setCreatedByAlgorithm(Boolean createdByAlgorithm) {
        set(PROPERTY_CREATEDBYALGORITHM, createdByAlgorithm);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_FOREIGNCURRENCY
     * 
     */
    public Currency getForeignCurrency() {
        return (Currency) get(PROPERTY_FOREIGNCURRENCY);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_FOREIGNCURRENCY
     * 
     */
    public void setForeignCurrency(Currency foreignCurrency) {
        set(PROPERTY_FOREIGNCURRENCY, foreignCurrency);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_FOREIGNCONVERSIONRATE
     * 
     */
    public BigDecimal getForeignConversionRate() {
        return (BigDecimal) get(PROPERTY_FOREIGNCONVERSIONRATE);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_FOREIGNCONVERSIONRATE
     * 
     */
    public void setForeignConversionRate(BigDecimal foreignConversionRate) {
        set(PROPERTY_FOREIGNCONVERSIONRATE, foreignConversionRate);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_FOREIGNAMOUNT
     * 
     */
    public BigDecimal getForeignAmount() {
        return (BigDecimal) get(PROPERTY_FOREIGNAMOUNT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_FOREIGNAMOUNT
     * 
     */
    public void setForeignAmount(BigDecimal foreignAmount) {
        set(PROPERTY_FOREIGNAMOUNT, foreignAmount);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_APRMPROCESSED
     * 
     */
    public String getAprmProcessed() {
        return (String) get(PROPERTY_APRMPROCESSED);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_APRMPROCESSED
     * 
     */
    public void setAprmProcessed(String aprmProcessed) {
        set(PROPERTY_APRMPROCESSED, aprmProcessed);
    }

    /**
     * @see FIN_FinaccTransaction#PROPERTY_APRMFINACCTRANSORIGIN
     * 
     */
    public FIN_FinaccTransaction getAprmFinaccTransOrigin() {
        return (FIN_FinaccTransaction) get(PROPERTY_APRMFINACCTRANSORIGIN);
    }
    /**
     * @see FIN_FinaccTransaction#PROPERTY_APRMFINACCTRANSORIGIN
     * 
     */
    public void setAprmFinaccTransOrigin(FIN_FinaccTransaction aprmFinaccTransOrigin) {
        set(PROPERTY_APRMFINACCTRANSORIGIN, aprmFinaccTransOrigin);
    }

    /**
     * Help: {@literal Line related to the given Bank Statement}<br>
     * @see FIN_BankStatementLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FIN_BankStatementLine> getFINBankStatementLineList() {
      return (List<FIN_BankStatementLine>) get(PROPERTY_FINBANKSTATEMENTLINELIST);
    }

    /**
     * Help: {@literal Line related to the given Bank Statement}<br>
     * @see FIN_BankStatementLine
     * 
     */
    public void setFINBankStatementLineList(List<FIN_BankStatementLine> fINBankStatementLineList) {
        set(PROPERTY_FINBANKSTATEMENTLINELIST, fINBankStatementLineList);
    }

}
