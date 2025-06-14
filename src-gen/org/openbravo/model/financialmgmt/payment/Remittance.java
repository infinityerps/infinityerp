
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.bank.BankAccount;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtRemittance (stored in table C_Remittance).
 * <br>
 * Help: {@literal Refers to a group of payments sent to the bank.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Remittance extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Remittance";
    public static final String ENTITY_NAME = "FinancialMgmtRemittance";

    /**
     * Property id stored in column C_Remittance_ID in table C_Remittance<br>
     * Help: {@literal Refers to a group of payments sent to the bank.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Remittance 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Remittance 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Remittance 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Remittance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Remittance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Remittance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Remittance 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Remittance 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property createLinesFrom stored in column CreateFrom in table C_Remittance<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example, in case of entering a new Goods Shipment, the
     *       user can copy lines (products) from an existing Sales Order or Sales Invoice.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROM = "createLinesFrom";

    /**
     * Property bankAccount stored in column C_BankAccount_ID in table C_Remittance<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property paymentManagement stored in column C_Dp_Management_ID in table C_Remittance<br>
     * Help: {@literal Debt Payment Management allows to manage the changes of status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_PAYMENTMANAGEMENT = "paymentManagement";

    /**
     * Property remittanceType stored in column C_Remittance_Type_ID in table C_Remittance<br>
     * Help: {@literal The remittance type defines the properties the remittance has.}
     * 
     */
    public static final String PROPERTY_REMITTANCETYPE = "remittanceType";

    /**
     * Property settlement stored in column C_Settlement_ID in table C_Remittance<br>
     * Help: {@literal Termination of a business operation by using its assets to discharge its liabilities.}
     * 
     */
    public static final String PROPERTY_SETTLEMENT = "settlement";

    /**
     * Property transactionDate stored in column DateTrx in table C_Remittance<br>
     * Help: {@literal The Transaction Date indicates the date of the transaction.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property documentNo stored in column DocumentNo in table C_Remittance 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property dueDate stored in column DueDate in table C_Remittance<br>
     * Help: {@literal Date when the payment is due without deductions or discount}
     * 
     */
    public static final String PROPERTY_DUEDATE = "dueDate";

    /**
     * Property getFile stored in column Getfile in table C_Remittance<br>
     * Help: {@literal Creates a File for the ebank. It takes the different parameters (including the docuemnt
     *       type) from the remittance type.}
     * 
     */
    public static final String PROPERTY_GETFILE = "getFile";

    /**
     * Property processed stored in column Processed in table C_Remittance<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property processNow stored in column Processing in table C_Remittance<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";


    public Remittance() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATELINESFROM, false);
        setDefaultValue(PROPERTY_GETFILE, false);
        setDefaultValue(PROPERTY_PROCESSED, "N");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Remittance#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Remittance#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Remittance#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Remittance#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Remittance#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Remittance#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Remittance#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Remittance#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Remittance#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Remittance#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Remittance#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Remittance#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Remittance#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Remittance#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Remittance#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Remittance#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Remittance#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Remittance#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Remittance#PROPERTY_CREATELINESFROM
     * 
     */
    public Boolean isCreateLinesFrom() {
        return (Boolean) get(PROPERTY_CREATELINESFROM);
    }
    /**
     * @see Remittance#PROPERTY_CREATELINESFROM
     * 
     */
    public void setCreateLinesFrom(Boolean createLinesFrom) {
        set(PROPERTY_CREATELINESFROM, createLinesFrom);
    }

    /**
     * @see Remittance#PROPERTY_BANKACCOUNT
     * 
     */
    public BankAccount getBankAccount() {
        return (BankAccount) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see Remittance#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(BankAccount bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see Remittance#PROPERTY_PAYMENTMANAGEMENT
     * 
     */
    public DPManagement getPaymentManagement() {
        return (DPManagement) get(PROPERTY_PAYMENTMANAGEMENT);
    }
    /**
     * @see Remittance#PROPERTY_PAYMENTMANAGEMENT
     * 
     */
    public void setPaymentManagement(DPManagement paymentManagement) {
        set(PROPERTY_PAYMENTMANAGEMENT, paymentManagement);
    }

    /**
     * @see Remittance#PROPERTY_REMITTANCETYPE
     * 
     */
    public RemittanceType getRemittanceType() {
        return (RemittanceType) get(PROPERTY_REMITTANCETYPE);
    }
    /**
     * @see Remittance#PROPERTY_REMITTANCETYPE
     * 
     */
    public void setRemittanceType(RemittanceType remittanceType) {
        set(PROPERTY_REMITTANCETYPE, remittanceType);
    }

    /**
     * @see Remittance#PROPERTY_SETTLEMENT
     * 
     */
    public Settlement getSettlement() {
        return (Settlement) get(PROPERTY_SETTLEMENT);
    }
    /**
     * @see Remittance#PROPERTY_SETTLEMENT
     * 
     */
    public void setSettlement(Settlement settlement) {
        set(PROPERTY_SETTLEMENT, settlement);
    }

    /**
     * @see Remittance#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see Remittance#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see Remittance#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see Remittance#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see Remittance#PROPERTY_DUEDATE
     * 
     */
    public Date getDueDate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see Remittance#PROPERTY_DUEDATE
     * 
     */
    public void setDueDate(Date dueDate) {
        set(PROPERTY_DUEDATE, dueDate);
    }

    /**
     * @see Remittance#PROPERTY_GETFILE
     * 
     */
    public Boolean isGetFile() {
        return (Boolean) get(PROPERTY_GETFILE);
    }
    /**
     * @see Remittance#PROPERTY_GETFILE
     * 
     */
    public void setGetFile(Boolean getFile) {
        set(PROPERTY_GETFILE, getFile);
    }

    /**
     * @see Remittance#PROPERTY_PROCESSED
     * 
     */
    public String getProcessed() {
        return (String) get(PROPERTY_PROCESSED);
    }
    /**
     * @see Remittance#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(String processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see Remittance#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Remittance#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

}
