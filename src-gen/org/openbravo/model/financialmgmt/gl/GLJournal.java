
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
package org.openbravo.model.financialmgmt.gl;

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
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.calendar.Period;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FinancialMgmtGLJournal (stored in table GL_Journal).
 * <br>
 * Help: {@literal The GL Journal Tab defines the control parameters for a single GL Journal.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GLJournal extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GL_Journal";
    public static final String ENTITY_NAME = "FinancialMgmtGLJournal";

    /**
     * Property id stored in column GL_Journal_ID in table GL_Journal<br>
     * Help: {@literal The General Ledger Journal identifies a group of journal lines which represent a logical
     *       business transaction}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table GL_Journal 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table GL_Journal 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table GL_Journal 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table GL_Journal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table GL_Journal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table GL_Journal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table GL_Journal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property stDimension stored in column User1_ID in table GL_Journal<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table GL_Journal<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table GL_Journal<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table GL_Journal<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table GL_Journal<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property documentType stored in column C_DocType_ID in table GL_Journal<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property documentNo stored in column DocumentNo in table GL_Journal 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property documentStatus stored in column DocStatus in table GL_Journal<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property documentAction stored in column DocAction in table GL_Journal<br>
     * Help: {@literal 
     *       You find the current status in the Document Status field. The options are listed in a
     *       popup}
     * 
     */
    public static final String PROPERTY_DOCUMENTACTION = "documentAction";

    /**
     * Property approved stored in column IsApproved in table GL_Journal<br>
     * Help: {@literal The Approved checkbox indicates if this document requires approval before it can be
     *       processed.}
     * 
     */
    public static final String PROPERTY_APPROVED = "approved";

    /**
     * Property print stored in column IsPrinted in table GL_Journal<br>
     * Help: {@literal The Printed checkbox indicates if this document or line will included when printing.}
     * 
     */
    public static final String PROPERTY_PRINT = "print";

    /**
     * Property description stored in column Description in table GL_Journal<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property postingType stored in column PostingType in table GL_Journal<br>
     * Help: {@literal The Posting Type indicates the type of amount (Actual, Encumbrance, Budget) this journal
     *       updated.}
     * 
     */
    public static final String PROPERTY_POSTINGTYPE = "postingType";

    /**
     * Property gLCategory stored in column GL_Category_ID in table GL_Journal<br>
     * Help: {@literal The General Ledger Category is an optional, user defined method of grouping journal
     *       lines.}
     * 
     */
    public static final String PROPERTY_GLCATEGORY = "gLCategory";

    /**
     * Property documentDate stored in column DateDoc in table GL_Journal<br>
     * Help: {@literal The Document Date indicates the date the document was generated.  It may or may not be the
     *       same as the accounting date.}
     * 
     */
    public static final String PROPERTY_DOCUMENTDATE = "documentDate";

    /**
     * Property accountingDate stored in column DateAcct in table GL_Journal<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property period stored in column C_Period_ID in table GL_Journal<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";

    /**
     * Property currency stored in column C_Currency_ID in table GL_Journal<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property currencyRateType stored in column CurrencyRateType in table GL_Journal<br>
     * Help: {@literal The Conversion Rate Type indicates the type of rate to use when retrieving the conversion
     *       rate.  It allows you to define multiple rates for the same to and from currency.  For example you
     *       may have a set of rates used for daily transactions with a rate type of SPOT and rates for currency
     *       revaluation defined as REVAL.}
     * 
     */
    public static final String PROPERTY_CURRENCYRATETYPE = "currencyRateType";

    /**
     * Property rate stored in column CurrencyRate in table GL_Journal<br>
     * Help: {@literal The Currency Conversion Rate indicates the rate to use when converting the source currency
     *       to the accounting currency}
     * 
     */
    public static final String PROPERTY_RATE = "rate";

    /**
     * Property journalBatch stored in column GL_JournalBatch_ID in table GL_Journal<br>
     * Help: {@literal The General Ledger Journal Batch identifies a group of journals to be processed as a
     *       group.}
     * 
     */
    public static final String PROPERTY_JOURNALBATCH = "journalBatch";

    /**
     * Property totalDebitAmount stored in column TotalDr in table GL_Journal<br>
     * Help: {@literal The Total Debit indicates the total debit amount for a journal or journal batch in the
     *       source currency}
     * 
     */
    public static final String PROPERTY_TOTALDEBITAMOUNT = "totalDebitAmount";

    /**
     * Property totalCreditAmount stored in column TotalCr in table GL_Journal<br>
     * Help: {@literal The Total Credit indicates the total credit amount for a journal or journal batch in the
     *       source currency}
     * 
     */
    public static final String PROPERTY_TOTALCREDITAMOUNT = "totalCreditAmount";

    /**
     * Property controlAmount stored in column ControlAmt in table GL_Journal<br>
     * Help: {@literal If the control amount is zero, no check is performed.Otherwise the total Debit amount must
     *       be equal to the control amount, before the document is processed.}
     * 
     */
    public static final String PROPERTY_CONTROLAMOUNT = "controlAmount";

    /**
     * Property processNow stored in column Processing in table GL_Journal<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table GL_Journal<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table GL_Journal<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property opening stored in column IsOpening in table GL_Journal<br>
     * Help: {@literal A flag indicating this is an opening entry}
     * 
     */
    public static final String PROPERTY_OPENING = "opening";

    /**
     * Property asset stored in column A_Asset_ID in table GL_Journal<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table GL_Journal<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table GL_Journal<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property product stored in column M_Product_ID in table GL_Journal<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property multigeneralLedger stored in column Multi_Gl in table GL_Journal
     * 
     */
    public static final String PROPERTY_MULTIGENERALLEDGER = "multigeneralLedger";

    /**
     * Property financialMgmtGLJournalLineList stored in table GL_Journal
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTGLJOURNALLINELIST = "financialMgmtGLJournalLineList";


    public GLJournal() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DOCUMENTSTATUS, "DR");
        setDefaultValue(PROPERTY_DOCUMENTACTION, "CO");
        setDefaultValue(PROPERTY_APPROVED, true);
        setDefaultValue(PROPERTY_PRINT, false);
        setDefaultValue(PROPERTY_CURRENCYRATETYPE, "S");
        setDefaultValue(PROPERTY_RATE, new BigDecimal(1));
        setDefaultValue(PROPERTY_TOTALDEBITAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_TOTALCREDITAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_OPENING, false);
        setDefaultValue(PROPERTY_MULTIGENERALLEDGER, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTGLJOURNALLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GLJournal#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GLJournal#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GLJournal#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GLJournal#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GLJournal#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GLJournal#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GLJournal#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GLJournal#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GLJournal#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GLJournal#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GLJournal#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GLJournal#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GLJournal#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GLJournal#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GLJournal#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GLJournal#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GLJournal#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see GLJournal#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see GLJournal#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see GLJournal#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see GLJournal#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see GLJournal#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see GLJournal#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see GLJournal#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see GLJournal#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see GLJournal#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see GLJournal#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see GLJournal#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see GLJournal#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see GLJournal#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see GLJournal#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see GLJournal#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see GLJournal#PROPERTY_DOCUMENTACTION
     * 
     */
    public String getDocumentAction() {
        return (String) get(PROPERTY_DOCUMENTACTION);
    }
    /**
     * @see GLJournal#PROPERTY_DOCUMENTACTION
     * 
     */
    public void setDocumentAction(String documentAction) {
        set(PROPERTY_DOCUMENTACTION, documentAction);
    }

    /**
     * @see GLJournal#PROPERTY_APPROVED
     * 
     */
    public Boolean isApproved() {
        return (Boolean) get(PROPERTY_APPROVED);
    }
    /**
     * @see GLJournal#PROPERTY_APPROVED
     * 
     */
    public void setApproved(Boolean approved) {
        set(PROPERTY_APPROVED, approved);
    }

    /**
     * @see GLJournal#PROPERTY_PRINT
     * 
     */
    public Boolean isPrint() {
        return (Boolean) get(PROPERTY_PRINT);
    }
    /**
     * @see GLJournal#PROPERTY_PRINT
     * 
     */
    public void setPrint(Boolean print) {
        set(PROPERTY_PRINT, print);
    }

    /**
     * @see GLJournal#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see GLJournal#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see GLJournal#PROPERTY_POSTINGTYPE
     * 
     */
    public String getPostingType() {
        return (String) get(PROPERTY_POSTINGTYPE);
    }
    /**
     * @see GLJournal#PROPERTY_POSTINGTYPE
     * 
     */
    public void setPostingType(String postingType) {
        set(PROPERTY_POSTINGTYPE, postingType);
    }

    /**
     * @see GLJournal#PROPERTY_GLCATEGORY
     * 
     */
    public GLCategory getGLCategory() {
        return (GLCategory) get(PROPERTY_GLCATEGORY);
    }
    /**
     * @see GLJournal#PROPERTY_GLCATEGORY
     * 
     */
    public void setGLCategory(GLCategory gLCategory) {
        set(PROPERTY_GLCATEGORY, gLCategory);
    }

    /**
     * @see GLJournal#PROPERTY_DOCUMENTDATE
     * 
     */
    public Date getDocumentDate() {
        return (Date) get(PROPERTY_DOCUMENTDATE);
    }
    /**
     * @see GLJournal#PROPERTY_DOCUMENTDATE
     * 
     */
    public void setDocumentDate(Date documentDate) {
        set(PROPERTY_DOCUMENTDATE, documentDate);
    }

    /**
     * @see GLJournal#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see GLJournal#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see GLJournal#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see GLJournal#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    /**
     * @see GLJournal#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see GLJournal#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see GLJournal#PROPERTY_CURRENCYRATETYPE
     * 
     */
    public String getCurrencyRateType() {
        return (String) get(PROPERTY_CURRENCYRATETYPE);
    }
    /**
     * @see GLJournal#PROPERTY_CURRENCYRATETYPE
     * 
     */
    public void setCurrencyRateType(String currencyRateType) {
        set(PROPERTY_CURRENCYRATETYPE, currencyRateType);
    }

    /**
     * @see GLJournal#PROPERTY_RATE
     * 
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(PROPERTY_RATE);
    }
    /**
     * @see GLJournal#PROPERTY_RATE
     * 
     */
    public void setRate(BigDecimal rate) {
        set(PROPERTY_RATE, rate);
    }

    /**
     * @see GLJournal#PROPERTY_JOURNALBATCH
     * 
     */
    public GLBatch getJournalBatch() {
        return (GLBatch) get(PROPERTY_JOURNALBATCH);
    }
    /**
     * @see GLJournal#PROPERTY_JOURNALBATCH
     * 
     */
    public void setJournalBatch(GLBatch journalBatch) {
        set(PROPERTY_JOURNALBATCH, journalBatch);
    }

    /**
     * @see GLJournal#PROPERTY_TOTALDEBITAMOUNT
     * 
     */
    public BigDecimal getTotalDebitAmount() {
        return (BigDecimal) get(PROPERTY_TOTALDEBITAMOUNT);
    }
    /**
     * @see GLJournal#PROPERTY_TOTALDEBITAMOUNT
     * 
     */
    public void setTotalDebitAmount(BigDecimal totalDebitAmount) {
        set(PROPERTY_TOTALDEBITAMOUNT, totalDebitAmount);
    }

    /**
     * @see GLJournal#PROPERTY_TOTALCREDITAMOUNT
     * 
     */
    public BigDecimal getTotalCreditAmount() {
        return (BigDecimal) get(PROPERTY_TOTALCREDITAMOUNT);
    }
    /**
     * @see GLJournal#PROPERTY_TOTALCREDITAMOUNT
     * 
     */
    public void setTotalCreditAmount(BigDecimal totalCreditAmount) {
        set(PROPERTY_TOTALCREDITAMOUNT, totalCreditAmount);
    }

    /**
     * @see GLJournal#PROPERTY_CONTROLAMOUNT
     * 
     */
    public BigDecimal getControlAmount() {
        return (BigDecimal) get(PROPERTY_CONTROLAMOUNT);
    }
    /**
     * @see GLJournal#PROPERTY_CONTROLAMOUNT
     * 
     */
    public void setControlAmount(BigDecimal controlAmount) {
        set(PROPERTY_CONTROLAMOUNT, controlAmount);
    }

    /**
     * @see GLJournal#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see GLJournal#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see GLJournal#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see GLJournal#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see GLJournal#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see GLJournal#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see GLJournal#PROPERTY_OPENING
     * 
     */
    public Boolean isOpening() {
        return (Boolean) get(PROPERTY_OPENING);
    }
    /**
     * @see GLJournal#PROPERTY_OPENING
     * 
     */
    public void setOpening(Boolean opening) {
        set(PROPERTY_OPENING, opening);
    }

    /**
     * @see GLJournal#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see GLJournal#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see GLJournal#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see GLJournal#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see GLJournal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see GLJournal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see GLJournal#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see GLJournal#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see GLJournal#PROPERTY_MULTIGENERALLEDGER
     * 
     */
    public Boolean isMultigeneralLedger() {
        return (Boolean) get(PROPERTY_MULTIGENERALLEDGER);
    }
    /**
     * @see GLJournal#PROPERTY_MULTIGENERALLEDGER
     * 
     */
    public void setMultigeneralLedger(Boolean multigeneralLedger) {
        set(PROPERTY_MULTIGENERALLEDGER, multigeneralLedger);
    }

    /**
     * Help: {@literal The GL Journal Line Tab defines the individual debit and credit transactions that comprise
     *       a journal.}<br>
     * @see GLJournalLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<GLJournalLine> getFinancialMgmtGLJournalLineList() {
      return (List<GLJournalLine>) get(PROPERTY_FINANCIALMGMTGLJOURNALLINELIST);
    }

    /**
     * Help: {@literal The GL Journal Line Tab defines the individual debit and credit transactions that comprise
     *       a journal.}<br>
     * @see GLJournalLine
     * 
     */
    public void setFinancialMgmtGLJournalLineList(List<GLJournalLine> financialMgmtGLJournalLineList) {
        set(PROPERTY_FINANCIALMGMTGLJOURNALLINELIST, financialMgmtGLJournalLineList);
    }

}
