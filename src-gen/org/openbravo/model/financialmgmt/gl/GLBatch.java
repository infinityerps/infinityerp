
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.calendar.Period;
/**
 * Entity class for entity FinancialMgmtGLBatch (stored in table GL_JournalBatch).
 * <br>
 * Help: {@literal The GL Journal Batch Tab defines the control parameters for a Journal Batch.  A Batch can
     *       consist of multiple Journals.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GLBatch extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GL_JournalBatch";
    public static final String ENTITY_NAME = "FinancialMgmtGLBatch";

    /**
     * Property id stored in column GL_JournalBatch_ID in table GL_JournalBatch<br>
     * Help: {@literal The General Ledger Journal Batch identifies a group of journals to be processed as a
     *       group.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table GL_JournalBatch 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table GL_JournalBatch 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table GL_JournalBatch 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table GL_JournalBatch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table GL_JournalBatch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table GL_JournalBatch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table GL_JournalBatch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentNo stored in column DocumentNo in table GL_JournalBatch 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property description stored in column Description in table GL_JournalBatch<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property postingType stored in column PostingType in table GL_JournalBatch<br>
     * Help: {@literal The Posting Type indicates the type of amount (Actual, Encumbrance, Budget) this journal
     *       updated.}
     * 
     */
    public static final String PROPERTY_POSTINGTYPE = "postingType";

    /**
     * Property gLCategory stored in column GL_Category_ID in table GL_JournalBatch<br>
     * Help: {@literal The General Ledger Category is an optional, user defined method of grouping journal
     *       lines.}
     * 
     */
    public static final String PROPERTY_GLCATEGORY = "gLCategory";

    /**
     * Property documentDate stored in column DateDoc in table GL_JournalBatch<br>
     * Help: {@literal The Document Date indicates the date the document was generated.  It may or may not be the
     *       same as the accounting date.}
     * 
     */
    public static final String PROPERTY_DOCUMENTDATE = "documentDate";

    /**
     * Property accountingDate stored in column DateAcct in table GL_JournalBatch<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property period stored in column C_Period_ID in table GL_JournalBatch<br>
     * Help: {@literal The Period indicates an exclusive range of dates for a calendar.}
     * 
     */
    public static final String PROPERTY_PERIOD = "period";

    /**
     * Property currency stored in column C_Currency_ID in table GL_JournalBatch<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property totalDebitAmount stored in column TotalDr in table GL_JournalBatch<br>
     * Help: {@literal The Total Debit indicates the total debit amount for a journal or journal batch in the
     *       source currency}
     * 
     */
    public static final String PROPERTY_TOTALDEBITAMOUNT = "totalDebitAmount";

    /**
     * Property totalCreditAmount stored in column TotalCr in table GL_JournalBatch<br>
     * Help: {@literal The Total Credit indicates the total credit amount for a journal or journal batch in the
     *       source currency}
     * 
     */
    public static final String PROPERTY_TOTALCREDITAMOUNT = "totalCreditAmount";

    /**
     * Property controlAmount stored in column ControlAmt in table GL_JournalBatch<br>
     * Help: {@literal If the control amount is zero, no check is performed.Otherwise the total Debit amount must
     *       be equal to the control amount, before the document is processed.}
     * 
     */
    public static final String PROPERTY_CONTROLAMOUNT = "controlAmount";

    /**
     * Property processNow stored in column Processing in table GL_JournalBatch<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table GL_JournalBatch<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property copyFrom stored in column CopyFrom in table GL_JournalBatch<br>
     * Help: {@literal Copy lines (products) from another document of the same type.}
     * 
     */
    public static final String PROPERTY_COPYFROM = "copyFrom";

    /**
     * Property template stored in column IsTemplate in table GL_JournalBatch<br>
     * Help: {@literal Template is checked when the element is used as a template.}
     * 
     */
    public static final String PROPERTY_TEMPLATE = "template";

    /**
     * Property financialMgmtGLJournalList stored in table GL_JournalBatch
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTGLJOURNALLIST = "financialMgmtGLJournalList";


    public GLBatch() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_POSTINGTYPE, "A");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_COPYFROM, false);
        setDefaultValue(PROPERTY_TEMPLATE, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTGLJOURNALLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GLBatch#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GLBatch#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GLBatch#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GLBatch#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GLBatch#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GLBatch#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GLBatch#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GLBatch#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GLBatch#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GLBatch#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GLBatch#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GLBatch#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GLBatch#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GLBatch#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GLBatch#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GLBatch#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GLBatch#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see GLBatch#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see GLBatch#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see GLBatch#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see GLBatch#PROPERTY_POSTINGTYPE
     * 
     */
    public String getPostingType() {
        return (String) get(PROPERTY_POSTINGTYPE);
    }
    /**
     * @see GLBatch#PROPERTY_POSTINGTYPE
     * 
     */
    public void setPostingType(String postingType) {
        set(PROPERTY_POSTINGTYPE, postingType);
    }

    /**
     * @see GLBatch#PROPERTY_GLCATEGORY
     * 
     */
    public GLCategory getGLCategory() {
        return (GLCategory) get(PROPERTY_GLCATEGORY);
    }
    /**
     * @see GLBatch#PROPERTY_GLCATEGORY
     * 
     */
    public void setGLCategory(GLCategory gLCategory) {
        set(PROPERTY_GLCATEGORY, gLCategory);
    }

    /**
     * @see GLBatch#PROPERTY_DOCUMENTDATE
     * 
     */
    public Date getDocumentDate() {
        return (Date) get(PROPERTY_DOCUMENTDATE);
    }
    /**
     * @see GLBatch#PROPERTY_DOCUMENTDATE
     * 
     */
    public void setDocumentDate(Date documentDate) {
        set(PROPERTY_DOCUMENTDATE, documentDate);
    }

    /**
     * @see GLBatch#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see GLBatch#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see GLBatch#PROPERTY_PERIOD
     * 
     */
    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }
    /**
     * @see GLBatch#PROPERTY_PERIOD
     * 
     */
    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    /**
     * @see GLBatch#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see GLBatch#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see GLBatch#PROPERTY_TOTALDEBITAMOUNT
     * 
     */
    public BigDecimal getTotalDebitAmount() {
        return (BigDecimal) get(PROPERTY_TOTALDEBITAMOUNT);
    }
    /**
     * @see GLBatch#PROPERTY_TOTALDEBITAMOUNT
     * 
     */
    public void setTotalDebitAmount(BigDecimal totalDebitAmount) {
        set(PROPERTY_TOTALDEBITAMOUNT, totalDebitAmount);
    }

    /**
     * @see GLBatch#PROPERTY_TOTALCREDITAMOUNT
     * 
     */
    public BigDecimal getTotalCreditAmount() {
        return (BigDecimal) get(PROPERTY_TOTALCREDITAMOUNT);
    }
    /**
     * @see GLBatch#PROPERTY_TOTALCREDITAMOUNT
     * 
     */
    public void setTotalCreditAmount(BigDecimal totalCreditAmount) {
        set(PROPERTY_TOTALCREDITAMOUNT, totalCreditAmount);
    }

    /**
     * @see GLBatch#PROPERTY_CONTROLAMOUNT
     * 
     */
    public BigDecimal getControlAmount() {
        return (BigDecimal) get(PROPERTY_CONTROLAMOUNT);
    }
    /**
     * @see GLBatch#PROPERTY_CONTROLAMOUNT
     * 
     */
    public void setControlAmount(BigDecimal controlAmount) {
        set(PROPERTY_CONTROLAMOUNT, controlAmount);
    }

    /**
     * @see GLBatch#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see GLBatch#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see GLBatch#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see GLBatch#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see GLBatch#PROPERTY_COPYFROM
     * 
     */
    public Boolean isCopyFrom() {
        return (Boolean) get(PROPERTY_COPYFROM);
    }
    /**
     * @see GLBatch#PROPERTY_COPYFROM
     * 
     */
    public void setCopyFrom(Boolean copyFrom) {
        set(PROPERTY_COPYFROM, copyFrom);
    }

    /**
     * @see GLBatch#PROPERTY_TEMPLATE
     * 
     */
    public Boolean isTemplate() {
        return (Boolean) get(PROPERTY_TEMPLATE);
    }
    /**
     * @see GLBatch#PROPERTY_TEMPLATE
     * 
     */
    public void setTemplate(Boolean template) {
        set(PROPERTY_TEMPLATE, template);
    }

    /**
     * Help: {@literal The GL Journal Tab defines the control parameters for a single GL Journal.}<br>
     * @see GLJournal
     * 
     */
    @SuppressWarnings("unchecked")
    public List<GLJournal> getFinancialMgmtGLJournalList() {
      return (List<GLJournal>) get(PROPERTY_FINANCIALMGMTGLJOURNALLIST);
    }

    /**
     * Help: {@literal The GL Journal Tab defines the control parameters for a single GL Journal.}<br>
     * @see GLJournal
     * 
     */
    public void setFinancialMgmtGLJournalList(List<GLJournal> financialMgmtGLJournalList) {
        set(PROPERTY_FINANCIALMGMTGLJOURNALLIST, financialMgmtGLJournalList);
    }

}
