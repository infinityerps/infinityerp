
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FinancialMgmtSettlement (stored in table C_Settlement).
 * <br>
 * Help: {@literal Termination of a business operation by using its assets to discharge its liabilities.
     *       For
     *       example, once the goods have been shipped to the customer, the merchant can key a transaction for
     *       settlement at which time the customer's credit card is charged for the transaction and the proceeds
     *       are deposited into the merchant account.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Settlement extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Settlement";
    public static final String ENTITY_NAME = "FinancialMgmtSettlement";

    /**
     * Property id stored in column C_Settlement_ID in table C_Settlement<br>
     * Help: {@literal Termination of a business operation by using its assets to discharge its liabilities.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Settlement 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Settlement 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Settlement 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Settlement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Settlement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Settlement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Settlement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentNo stored in column DocumentNo in table C_Settlement 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property transactionDate stored in column DateTrx in table C_Settlement 
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property documentType stored in column C_DocType_ID in table C_Settlement<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property processNow stored in column Processing in table C_Settlement<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_Settlement<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table C_Settlement<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property project stored in column C_Project_ID in table C_Settlement<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_Settlement<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table C_Settlement<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table C_Settlement<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table C_Settlement<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property createLinesFrom stored in column CreateFrom in table C_Settlement<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example, in case of entering a new Goods Shipment, the
     *       user can copy lines (products) from an existing Sales Order or Sales Invoice.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROM = "createLinesFrom";

    /**
     * Property currency stored in column C_Currency_ID in table C_Settlement<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property canceledNotCharged stored in column Cancelednotchargeamt in table C_Settlement<br>
     * Help: {@literal Indicates the amount that has been canceled but has generated no charges in the bank
     *       account or cash.}
     * 
     */
    public static final String PROPERTY_CANCELEDNOTCHARGED = "canceledNotCharged";

    /**
     * Property createdAmount stored in column Generatedamt in table C_Settlement<br>
     * Help: {@literal Indicates the total amount of the payments that have been generated in this settlement.}
     * 
     */
    public static final String PROPERTY_CREATEDAMOUNT = "createdAmount";

    /**
     * Property chargedAmount stored in column Chargedamt in table C_Settlement<br>
     * Help: {@literal Indicates the total amount of the payments that have been canceled and charged.}
     * 
     */
    public static final String PROPERTY_CHARGEDAMOUNT = "chargedAmount";

    /**
     * Property description stored in column Description in table C_Settlement<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property createFile stored in column CreateFile in table C_Settlement<br>
     * Help: {@literal Create file}
     * 
     */
    public static final String PROPERTY_CREATEFILE = "createFile";

    /**
     * Property accountingDate stored in column DateAcct in table C_Settlement<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property settlementType stored in column Settlementtype in table C_Settlement<br>
     * Help: {@literal Indicates the type of settlement (settlement or manual settlement)}
     * 
     */
    public static final String PROPERTY_SETTLEMENTTYPE = "settlementType";

    /**
     * Property openSettlement stored in column SettlementOpen in table C_Settlement
     * 
     */
    public static final String PROPERTY_OPENSETTLEMENT = "openSettlement";

    /**
     * Property copyFrom stored in column CopyFrom in table C_Settlement<br>
     * Help: {@literal Copy lines (products) from another document of the same type.}
     * 
     */
    public static final String PROPERTY_COPYFROM = "copyFrom";

    /**
     * Property generated stored in column IsGenerated in table C_Settlement<br>
     * Help: {@literal The Generated checkbox identifies a journal line that was generated from a source
     *       document.  Lines could also be entered manually or imported.}
     * 
     */
    public static final String PROPERTY_GENERATED = "generated";

    /**
     * Property template stored in column IsTemplate in table C_Settlement<br>
     * Help: {@literal Template is checked when the element is used as a template.}
     * 
     */
    public static final String PROPERTY_TEMPLATE = "template";

    /**
     * Property financialMgmtDebtPaymentSettlementCancelledList stored in table C_Settlement
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTDEBTPAYMENTSETTLEMENTCANCELLEDLIST = "financialMgmtDebtPaymentSettlementCancelledList";

    /**
     * Property financialMgmtDebtPaymentCSettlementGenerateIDList stored in table C_Settlement
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTDEBTPAYMENTCSETTLEMENTGENERATEIDLIST = "financialMgmtDebtPaymentCSettlementGenerateIDList";


    public Settlement() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, "N");
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_CREATELINESFROM, false);
        setDefaultValue(PROPERTY_CANCELEDNOTCHARGED, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATEDAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CHARGEDAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATEFILE, false);
        setDefaultValue(PROPERTY_OPENSETTLEMENT, false);
        setDefaultValue(PROPERTY_COPYFROM, false);
        setDefaultValue(PROPERTY_GENERATED, false);
        setDefaultValue(PROPERTY_TEMPLATE, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTDEBTPAYMENTSETTLEMENTCANCELLEDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTDEBTPAYMENTCSETTLEMENTGENERATEIDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Settlement#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Settlement#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Settlement#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Settlement#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Settlement#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Settlement#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Settlement#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Settlement#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Settlement#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Settlement#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Settlement#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Settlement#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Settlement#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Settlement#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Settlement#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Settlement#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Settlement#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see Settlement#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see Settlement#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see Settlement#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see Settlement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see Settlement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see Settlement#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Settlement#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Settlement#PROPERTY_PROCESSED
     * 
     */
    public String getProcessed() {
        return (String) get(PROPERTY_PROCESSED);
    }
    /**
     * @see Settlement#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(String processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see Settlement#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see Settlement#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see Settlement#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see Settlement#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see Settlement#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see Settlement#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see Settlement#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see Settlement#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see Settlement#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see Settlement#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see Settlement#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see Settlement#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see Settlement#PROPERTY_CREATELINESFROM
     * 
     */
    public Boolean isCreateLinesFrom() {
        return (Boolean) get(PROPERTY_CREATELINESFROM);
    }
    /**
     * @see Settlement#PROPERTY_CREATELINESFROM
     * 
     */
    public void setCreateLinesFrom(Boolean createLinesFrom) {
        set(PROPERTY_CREATELINESFROM, createLinesFrom);
    }

    /**
     * @see Settlement#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Settlement#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Settlement#PROPERTY_CANCELEDNOTCHARGED
     * 
     */
    public BigDecimal getCanceledNotCharged() {
        return (BigDecimal) get(PROPERTY_CANCELEDNOTCHARGED);
    }
    /**
     * @see Settlement#PROPERTY_CANCELEDNOTCHARGED
     * 
     */
    public void setCanceledNotCharged(BigDecimal canceledNotCharged) {
        set(PROPERTY_CANCELEDNOTCHARGED, canceledNotCharged);
    }

    /**
     * @see Settlement#PROPERTY_CREATEDAMOUNT
     * 
     */
    public BigDecimal getCreatedAmount() {
        return (BigDecimal) get(PROPERTY_CREATEDAMOUNT);
    }
    /**
     * @see Settlement#PROPERTY_CREATEDAMOUNT
     * 
     */
    public void setCreatedAmount(BigDecimal createdAmount) {
        set(PROPERTY_CREATEDAMOUNT, createdAmount);
    }

    /**
     * @see Settlement#PROPERTY_CHARGEDAMOUNT
     * 
     */
    public BigDecimal getChargedAmount() {
        return (BigDecimal) get(PROPERTY_CHARGEDAMOUNT);
    }
    /**
     * @see Settlement#PROPERTY_CHARGEDAMOUNT
     * 
     */
    public void setChargedAmount(BigDecimal chargedAmount) {
        set(PROPERTY_CHARGEDAMOUNT, chargedAmount);
    }

    /**
     * @see Settlement#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Settlement#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Settlement#PROPERTY_CREATEFILE
     * 
     */
    public Boolean isCreateFile() {
        return (Boolean) get(PROPERTY_CREATEFILE);
    }
    /**
     * @see Settlement#PROPERTY_CREATEFILE
     * 
     */
    public void setCreateFile(Boolean createFile) {
        set(PROPERTY_CREATEFILE, createFile);
    }

    /**
     * @see Settlement#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see Settlement#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see Settlement#PROPERTY_SETTLEMENTTYPE
     * 
     */
    public String getSettlementType() {
        return (String) get(PROPERTY_SETTLEMENTTYPE);
    }
    /**
     * @see Settlement#PROPERTY_SETTLEMENTTYPE
     * 
     */
    public void setSettlementType(String settlementType) {
        set(PROPERTY_SETTLEMENTTYPE, settlementType);
    }

    /**
     * @see Settlement#PROPERTY_OPENSETTLEMENT
     * 
     */
    public Boolean isOpenSettlement() {
        return (Boolean) get(PROPERTY_OPENSETTLEMENT);
    }
    /**
     * @see Settlement#PROPERTY_OPENSETTLEMENT
     * 
     */
    public void setOpenSettlement(Boolean openSettlement) {
        set(PROPERTY_OPENSETTLEMENT, openSettlement);
    }

    /**
     * @see Settlement#PROPERTY_COPYFROM
     * 
     */
    public Boolean isCopyFrom() {
        return (Boolean) get(PROPERTY_COPYFROM);
    }
    /**
     * @see Settlement#PROPERTY_COPYFROM
     * 
     */
    public void setCopyFrom(Boolean copyFrom) {
        set(PROPERTY_COPYFROM, copyFrom);
    }

    /**
     * @see Settlement#PROPERTY_GENERATED
     * 
     */
    public Boolean isGenerated() {
        return (Boolean) get(PROPERTY_GENERATED);
    }
    /**
     * @see Settlement#PROPERTY_GENERATED
     * 
     */
    public void setGenerated(Boolean generated) {
        set(PROPERTY_GENERATED, generated);
    }

    /**
     * @see Settlement#PROPERTY_TEMPLATE
     * 
     */
    public Boolean isTemplate() {
        return (Boolean) get(PROPERTY_TEMPLATE);
    }
    /**
     * @see Settlement#PROPERTY_TEMPLATE
     * 
     */
    public void setTemplate(Boolean template) {
        set(PROPERTY_TEMPLATE, template);
    }

    /**
     * Help: {@literal Refers to the amount of money to be paid or collected.}<br>
     * @see DebtPayment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DebtPayment> getFinancialMgmtDebtPaymentSettlementCancelledList() {
      return (List<DebtPayment>) get(PROPERTY_FINANCIALMGMTDEBTPAYMENTSETTLEMENTCANCELLEDLIST);
    }

    /**
     * Help: {@literal Refers to the amount of money to be paid or collected.}<br>
     * @see DebtPayment
     * 
     */
    public void setFinancialMgmtDebtPaymentSettlementCancelledList(List<DebtPayment> financialMgmtDebtPaymentSettlementCancelledList) {
        set(PROPERTY_FINANCIALMGMTDEBTPAYMENTSETTLEMENTCANCELLEDLIST, financialMgmtDebtPaymentSettlementCancelledList);
    }

    /**
     * Help: {@literal Refers to the amount of money to be paid or collected.}<br>
     * @see DebtPayment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DebtPayment> getFinancialMgmtDebtPaymentCSettlementGenerateIDList() {
      return (List<DebtPayment>) get(PROPERTY_FINANCIALMGMTDEBTPAYMENTCSETTLEMENTGENERATEIDLIST);
    }

    /**
     * Help: {@literal Refers to the amount of money to be paid or collected.}<br>
     * @see DebtPayment
     * 
     */
    public void setFinancialMgmtDebtPaymentCSettlementGenerateIDList(List<DebtPayment> financialMgmtDebtPaymentCSettlementGenerateIDList) {
        set(PROPERTY_FINANCIALMGMTDEBTPAYMENTCSETTLEMENTGENERATEIDLIST, financialMgmtDebtPaymentCSettlementGenerateIDList);
    }

}
