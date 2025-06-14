
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
package org.openbravo.model.common.currency;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.advpaymentmngt.APRM_FinaccTransactionV;
import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.financialmgmt.gl.GLJournal;
import org.openbravo.model.financialmgmt.payment.FIN_FinaccTransaction;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
/**
 * Entity class for entity CurrencyConversionRateDoc (stored in table C_Conversion_Rate_Document).
 * <br>
 * Help: {@literal Define another currency conversion rate for this document different than Openbravo systema
     *       exchange rate.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ConversionRateDoc extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Conversion_Rate_Document";
    public static final String ENTITY_NAME = "CurrencyConversionRateDoc";

    /**
     * Property id stored in column C_Conversion_Rate_Document_ID in table C_Conversion_Rate_Document 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Conversion_Rate_Document 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Conversion_Rate_Document 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_Conversion_Rate_Document 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Conversion_Rate_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Conversion_Rate_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Conversion_Rate_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Conversion_Rate_Document 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property currency stored in column C_Currency_ID in table C_Conversion_Rate_Document<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property toCurrency stored in column C_Currency_Id_To in table C_Conversion_Rate_Document<br>
     * Help: {@literal The Currency To defines the target currency for this conversion rate.}
     * 
     */
    public static final String PROPERTY_TOCURRENCY = "toCurrency";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_Conversion_Rate_Document<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property payment stored in column FIN_Payment_ID in table C_Conversion_Rate_Document<br>
     * Help: {@literal Payment event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property financialAccountTransaction stored in column aprm_finacc_transaction_v_id in table C_Conversion_Rate_Document
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNTTRANSACTION = "financialAccountTransaction";

    /**
     * Property rate stored in column Rate in table C_Conversion_Rate_Document<br>
     * Help: {@literal The Rate indicates the percentage to be multiplied by the source to arrive at the tax or
     *       exchange amount.}
     * 
     */
    public static final String PROPERTY_RATE = "rate";

    /**
     * Property foreignAmount stored in column Foreign_Amount in table C_Conversion_Rate_Document
     * 
     */
    public static final String PROPERTY_FOREIGNAMOUNT = "foreignAmount";

    /**
     * Property fINFinancialAccountTransaction stored in column FIN_Finacc_Transaction_ID in table C_Conversion_Rate_Document
     * 
     */
    public static final String PROPERTY_FINFINANCIALACCOUNTTRANSACTION = "fINFinancialAccountTransaction";

    /**
     * Property journalEntry stored in column GL_Journal_ID in table C_Conversion_Rate_Document<br>
     * Help: {@literal The General Ledger Journal identifies a group of journal lines which represent a logical
     *       business transaction}
     * 
     */
    public static final String PROPERTY_JOURNALENTRY = "journalEntry";


    public ConversionRateDoc() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FOREIGNAMOUNT, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ConversionRateDoc#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_TOCURRENCY
     * 
     */
    public Currency getToCurrency() {
        return (Currency) get(PROPERTY_TOCURRENCY);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_TOCURRENCY
     * 
     */
    public void setToCurrency(Currency toCurrency) {
        set(PROPERTY_TOCURRENCY, toCurrency);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public APRM_FinaccTransactionV getFinancialAccountTransaction() {
        return (APRM_FinaccTransactionV) get(PROPERTY_FINANCIALACCOUNTTRANSACTION);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public void setFinancialAccountTransaction(APRM_FinaccTransactionV financialAccountTransaction) {
        set(PROPERTY_FINANCIALACCOUNTTRANSACTION, financialAccountTransaction);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_RATE
     * 
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(PROPERTY_RATE);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_RATE
     * 
     */
    public void setRate(BigDecimal rate) {
        set(PROPERTY_RATE, rate);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_FOREIGNAMOUNT
     * 
     */
    public BigDecimal getForeignAmount() {
        return (BigDecimal) get(PROPERTY_FOREIGNAMOUNT);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_FOREIGNAMOUNT
     * 
     */
    public void setForeignAmount(BigDecimal foreignAmount) {
        set(PROPERTY_FOREIGNAMOUNT, foreignAmount);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_FINFINANCIALACCOUNTTRANSACTION
     * 
     */
    public FIN_FinaccTransaction getFINFinancialAccountTransaction() {
        return (FIN_FinaccTransaction) get(PROPERTY_FINFINANCIALACCOUNTTRANSACTION);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_FINFINANCIALACCOUNTTRANSACTION
     * 
     */
    public void setFINFinancialAccountTransaction(FIN_FinaccTransaction fINFinancialAccountTransaction) {
        set(PROPERTY_FINFINANCIALACCOUNTTRANSACTION, fINFinancialAccountTransaction);
    }

    /**
     * @see ConversionRateDoc#PROPERTY_JOURNALENTRY
     * 
     */
    public GLJournal getJournalEntry() {
        return (GLJournal) get(PROPERTY_JOURNALENTRY);
    }
    /**
     * @see ConversionRateDoc#PROPERTY_JOURNALENTRY
     * 
     */
    public void setJournalEntry(GLJournal journalEntry) {
        set(PROPERTY_JOURNALENTRY, journalEntry);
    }

}
