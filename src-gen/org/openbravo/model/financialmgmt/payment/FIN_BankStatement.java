
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
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FIN_BankStatement (stored in table FIN_BankStatement).
 * <br>
 * Help: {@literal Bank statements loaded for the given financial account}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_BankStatement extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_BankStatement";
    public static final String ENTITY_NAME = "FIN_BankStatement";

    /**
     * Property id stored in column FIN_Bankstatement_ID in table FIN_BankStatement<br>
     * Help: {@literal Bank statements loaded for the given financial account}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_BankStatement 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_BankStatement 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_BankStatement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_BankStatement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_BankStatement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_BankStatement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_BankStatement 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property account stored in column FIN_Financial_Account_ID in table FIN_BankStatement<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property documentNo stored in column DocumentNo in table FIN_BankStatement 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property name stored in column Name in table FIN_BankStatement 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property notes stored in column Notes in table FIN_BankStatement
     * 
     */
    public static final String PROPERTY_NOTES = "notes";

    /**
     * Property documentType stored in column C_Doctype_ID in table FIN_BankStatement<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property fileName stored in column Filename in table FIN_BankStatement
     * 
     */
    public static final String PROPERTY_FILENAME = "fileName";

    /**
     * Property importdate stored in column Importdate in table FIN_BankStatement<br>
     * Help: {@literal Import date of the bank file}
     * 
     */
    public static final String PROPERTY_IMPORTDATE = "importdate";

    /**
     * Property transactionDate stored in column Statementdate in table FIN_BankStatement<br>
     * Help: {@literal The Statement Date field defines the date of the statement being processed.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property fINReconciliation stored in column FIN_Reconciliation_ID in table FIN_BankStatement<br>
     * Help: {@literal Reconciliation events related to the financial account}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_FINRECONCILIATION = "fINReconciliation";

    /**
     * Property processNow stored in column Processing in table FIN_BankStatement<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table FIN_BankStatement<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table FIN_BankStatement<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property aPRMProcessBankStatement stored in column EM_APRM_Process_BS in table FIN_BankStatement
     * 
     */
    public static final String PROPERTY_APRMPROCESSBANKSTATEMENT = "aPRMProcessBankStatement";

    /**
     * Property aPRMProcessBankStatementForce stored in column EM_APRM_Process_BS_Force in table FIN_BankStatement
     * 
     */
    public static final String PROPERTY_APRMPROCESSBANKSTATEMENTFORCE = "aPRMProcessBankStatementForce";

    /**
     * Property fINBankStatementLineList stored in table FIN_BankStatement
     * 
     */
    public static final String PROPERTY_FINBANKSTATEMENTLINELIST = "fINBankStatementLineList";


    public FIN_BankStatement() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_APRMPROCESSBANKSTATEMENT, "P");
        setDefaultValue(PROPERTY_APRMPROCESSBANKSTATEMENTFORCE, "P");
        setDefaultValue(PROPERTY_FINBANKSTATEMENTLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_BankStatement#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_NOTES
     * 
     */
    public String getNotes() {
        return (String) get(PROPERTY_NOTES);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_NOTES
     * 
     */
    public void setNotes(String notes) {
        set(PROPERTY_NOTES, notes);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_FILENAME
     * 
     */
    public String getFileName() {
        return (String) get(PROPERTY_FILENAME);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_FILENAME
     * 
     */
    public void setFileName(String fileName) {
        set(PROPERTY_FILENAME, fileName);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_IMPORTDATE
     * 
     */
    public Date getImportdate() {
        return (Date) get(PROPERTY_IMPORTDATE);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_IMPORTDATE
     * 
     */
    public void setImportdate(Date importdate) {
        set(PROPERTY_IMPORTDATE, importdate);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_FINRECONCILIATION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public FIN_Reconciliation getFINReconciliation() {
        return (FIN_Reconciliation) get(PROPERTY_FINRECONCILIATION);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_FINRECONCILIATION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setFINReconciliation(FIN_Reconciliation fINReconciliation) {
        set(PROPERTY_FINRECONCILIATION, fINReconciliation);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_APRMPROCESSBANKSTATEMENT
     * 
     */
    public String getAPRMProcessBankStatement() {
        return (String) get(PROPERTY_APRMPROCESSBANKSTATEMENT);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_APRMPROCESSBANKSTATEMENT
     * 
     */
    public void setAPRMProcessBankStatement(String aPRMProcessBankStatement) {
        set(PROPERTY_APRMPROCESSBANKSTATEMENT, aPRMProcessBankStatement);
    }

    /**
     * @see FIN_BankStatement#PROPERTY_APRMPROCESSBANKSTATEMENTFORCE
     * 
     */
    public String getAPRMProcessBankStatementForce() {
        return (String) get(PROPERTY_APRMPROCESSBANKSTATEMENTFORCE);
    }
    /**
     * @see FIN_BankStatement#PROPERTY_APRMPROCESSBANKSTATEMENTFORCE
     * 
     */
    public void setAPRMProcessBankStatementForce(String aPRMProcessBankStatementForce) {
        set(PROPERTY_APRMPROCESSBANKSTATEMENTFORCE, aPRMProcessBankStatementForce);
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
