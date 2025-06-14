
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
package org.openbravo.model.financialmgmt.tax;

import java.util.Date;

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
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.gl.GLJournal;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
import org.openbravo.model.financialmgmt.payment.Settlement;
/**
 * Entity class for entity FinancialMgmtTaxPayment (stored in table C_TaxPayment).
 * <br>
 * Help: {@literal Tax Payment}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TaxPayment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_TaxPayment";
    public static final String ENTITY_NAME = "FinancialMgmtTaxPayment";

    /**
     * Property client stored in column AD_Client_ID in table C_TaxPayment 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_TaxPayment 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_TaxPayment 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_TaxPayment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_TaxPayment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_TaxPayment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_TaxPayment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property id stored in column C_Taxpayment_ID in table C_TaxPayment<br>
     * Help: {@literal Tax payment}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property startingDate stored in column Datefrom in table C_TaxPayment<br>
     * Help: {@literal The Date From indicates the starting date of a range.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column Dateto in table C_TaxPayment<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property generatePayment stored in column Generatepayment in table C_TaxPayment<br>
     * Help: {@literal Generate payment}
     * 
     */
    public static final String PROPERTY_GENERATEPAYMENT = "generatePayment";

    /**
     * Property processNow stored in column Processing in table C_TaxPayment<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_TaxPayment<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property settlement stored in column C_Settlement_ID in table C_TaxPayment<br>
     * Help: {@literal Termination of a business operation by using its assets to discharge its liabilities.}
     * 
     */
    public static final String PROPERTY_SETTLEMENT = "settlement";

    /**
     * Property journalEntry stored in column GL_Journal_ID in table C_TaxPayment<br>
     * Help: {@literal The General Ledger Journal identifies a group of journal lines which represent a logical
     *       business transaction}
     * 
     */
    public static final String PROPERTY_JOURNALENTRY = "journalEntry";

    /**
     * Property name stored in column Name in table C_TaxPayment 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property createLinesFrom stored in column CreateFrom in table C_TaxPayment<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example, in case of entering a new Goods Shipment, the
     *       user can copy lines (products) from an existing Sales Order or Sales Invoice.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROM = "createLinesFrom";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_TaxPayment<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property currency stored in column C_Currency_ID in table C_TaxPayment<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_TaxPayment<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property payment stored in column FIN_Payment_ID in table C_TaxPayment<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";


    public TaxPayment() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_GENERATEPAYMENT, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_CREATELINESFROM, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TaxPayment#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TaxPayment#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TaxPayment#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TaxPayment#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TaxPayment#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TaxPayment#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TaxPayment#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TaxPayment#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TaxPayment#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TaxPayment#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TaxPayment#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TaxPayment#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TaxPayment#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TaxPayment#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TaxPayment#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TaxPayment#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TaxPayment#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see TaxPayment#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see TaxPayment#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see TaxPayment#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see TaxPayment#PROPERTY_GENERATEPAYMENT
     * 
     */
    public Boolean isGeneratePayment() {
        return (Boolean) get(PROPERTY_GENERATEPAYMENT);
    }
    /**
     * @see TaxPayment#PROPERTY_GENERATEPAYMENT
     * 
     */
    public void setGeneratePayment(Boolean generatePayment) {
        set(PROPERTY_GENERATEPAYMENT, generatePayment);
    }

    /**
     * @see TaxPayment#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see TaxPayment#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see TaxPayment#PROPERTY_PROCESSED
     * 
     */
    public String getProcessed() {
        return (String) get(PROPERTY_PROCESSED);
    }
    /**
     * @see TaxPayment#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(String processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see TaxPayment#PROPERTY_SETTLEMENT
     * 
     */
    public Settlement getSettlement() {
        return (Settlement) get(PROPERTY_SETTLEMENT);
    }
    /**
     * @see TaxPayment#PROPERTY_SETTLEMENT
     * 
     */
    public void setSettlement(Settlement settlement) {
        set(PROPERTY_SETTLEMENT, settlement);
    }

    /**
     * @see TaxPayment#PROPERTY_JOURNALENTRY
     * 
     */
    public GLJournal getJournalEntry() {
        return (GLJournal) get(PROPERTY_JOURNALENTRY);
    }
    /**
     * @see TaxPayment#PROPERTY_JOURNALENTRY
     * 
     */
    public void setJournalEntry(GLJournal journalEntry) {
        set(PROPERTY_JOURNALENTRY, journalEntry);
    }

    /**
     * @see TaxPayment#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see TaxPayment#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see TaxPayment#PROPERTY_CREATELINESFROM
     * 
     */
    public Boolean isCreateLinesFrom() {
        return (Boolean) get(PROPERTY_CREATELINESFROM);
    }
    /**
     * @see TaxPayment#PROPERTY_CREATELINESFROM
     * 
     */
    public void setCreateLinesFrom(Boolean createLinesFrom) {
        set(PROPERTY_CREATELINESFROM, createLinesFrom);
    }

    /**
     * @see TaxPayment#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see TaxPayment#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see TaxPayment#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see TaxPayment#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see TaxPayment#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see TaxPayment#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see TaxPayment#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see TaxPayment#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

}
