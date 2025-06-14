
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
package org.openbravo.model.common.invoice;

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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.tax.TaxRate;
import org.openbravo.model.financialmgmt.tax.TaxRegisterline;
/**
 * Entity class for entity InvoiceTax (stored in table C_InvoiceTax).
 * <br>
 * Help: {@literal Contains the total tax due based on the Invoice Lines}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceTax extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_InvoiceTax";
    public static final String ENTITY_NAME = "InvoiceTax";

    /**
     * Property tax stored in column C_Tax_ID in table C_InvoiceTax<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_InvoiceTax<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";

    /**
     * Property client stored in column AD_Client_ID in table C_InvoiceTax 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_InvoiceTax 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_InvoiceTax 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_InvoiceTax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_InvoiceTax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_InvoiceTax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_InvoiceTax 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property taxableAmount stored in column TaxBaseAmt in table C_InvoiceTax<br>
     * Help: {@literal The Tax Base Amount indicates the base amount used for calculating the tax amount.}
     * 
     */
    public static final String PROPERTY_TAXABLEAMOUNT = "taxableAmount";

    /**
     * Property taxAmount stored in column TaxAmt in table C_InvoiceTax<br>
     * Help: {@literal The Tax Amount displays the total tax amount for a document.}
     * 
     */
    public static final String PROPERTY_TAXAMOUNT = "taxAmount";

    /**
     * Property lineNo stored in column Line in table C_InvoiceTax<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property id stored in column C_InvoiceTax_ID in table C_InvoiceTax
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property recalculate stored in column Recalculate in table C_InvoiceTax<br>
     * Help: {@literal Recalculate tax when Order or Invoice is processed. Usually taxes are recalculated when
     *       the document they are associated to is processed, so if the amounts are manually edited it has any
     *       effect. If tax is checked as no recalculate, manually edited amounts will be directly applied.}
     * 
     */
    public static final String PROPERTY_RECALCULATE = "recalculate";

    /**
     * Property invoiceTaxCashVATVList stored in table C_InvoiceTax
     * 
     */
    public static final String PROPERTY_INVOICETAXCASHVATVLIST = "invoiceTaxCashVATVList";

    /**
     * Property financialMgmtTaxRegisterlineList stored in table C_InvoiceTax
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST = "financialMgmtTaxRegisterlineList";

    /**
     * Property invoiceTaxCashVATList stored in table C_InvoiceTax
     * 
     */
    public static final String PROPERTY_INVOICETAXCASHVATLIST = "invoiceTaxCashVATList";


    public InvoiceTax() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RECALCULATE, false);
        setDefaultValue(PROPERTY_INVOICETAXCASHVATVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICETAXCASHVATLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceTax#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see InvoiceTax#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see InvoiceTax#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see InvoiceTax#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

    /**
     * @see InvoiceTax#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceTax#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceTax#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceTax#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceTax#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceTax#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceTax#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceTax#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceTax#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceTax#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceTax#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceTax#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceTax#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceTax#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceTax#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public BigDecimal getTaxableAmount() {
        return (BigDecimal) get(PROPERTY_TAXABLEAMOUNT);
    }
    /**
     * @see InvoiceTax#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        set(PROPERTY_TAXABLEAMOUNT, taxableAmount);
    }

    /**
     * @see InvoiceTax#PROPERTY_TAXAMOUNT
     * 
     */
    public BigDecimal getTaxAmount() {
        return (BigDecimal) get(PROPERTY_TAXAMOUNT);
    }
    /**
     * @see InvoiceTax#PROPERTY_TAXAMOUNT
     * 
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        set(PROPERTY_TAXAMOUNT, taxAmount);
    }

    /**
     * @see InvoiceTax#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see InvoiceTax#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see InvoiceTax#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceTax#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceTax#PROPERTY_RECALCULATE
     * 
     */
    public Boolean isRecalculate() {
        return (Boolean) get(PROPERTY_RECALCULATE);
    }
    /**
     * @see InvoiceTax#PROPERTY_RECALCULATE
     * 
     */
    public void setRecalculate(Boolean recalculate) {
        set(PROPERTY_RECALCULATE, recalculate);
    }

    /**
     * Help: {@literal Invoice Cash VAT View that sums the percentage, tax amount and taxable amount per payment
     *       detail.}<br>
     * @see InvoiceTaxCashVAT_V
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceTaxCashVAT_V> getInvoiceTaxCashVATVList() {
      return (List<InvoiceTaxCashVAT_V>) get(PROPERTY_INVOICETAXCASHVATVLIST);
    }

    /**
     * Help: {@literal Invoice Cash VAT View that sums the percentage, tax amount and taxable amount per payment
     *       detail.}<br>
     * @see InvoiceTaxCashVAT_V
     * 
     */
    public void setInvoiceTaxCashVATVList(List<InvoiceTaxCashVAT_V> invoiceTaxCashVATVList) {
        set(PROPERTY_INVOICETAXCASHVATVLIST, invoiceTaxCashVATVList);
    }

    /**
     * Help: {@literal Lines of Tax Register}<br>
     * @see TaxRegisterline
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxRegisterline> getFinancialMgmtTaxRegisterlineList() {
      return (List<TaxRegisterline>) get(PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST);
    }

    /**
     * Help: {@literal Lines of Tax Register}<br>
     * @see TaxRegisterline
     * 
     */
    public void setFinancialMgmtTaxRegisterlineList(List<TaxRegisterline> financialMgmtTaxRegisterlineList) {
        set(PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST, financialMgmtTaxRegisterlineList);
    }

    /**
     * Help: {@literal Cash VAT management for invoices}<br>
     * @see InvoiceTaxCashVAT
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceTaxCashVAT> getInvoiceTaxCashVATList() {
      return (List<InvoiceTaxCashVAT>) get(PROPERTY_INVOICETAXCASHVATLIST);
    }

    /**
     * Help: {@literal Cash VAT management for invoices}<br>
     * @see InvoiceTaxCashVAT
     * 
     */
    public void setInvoiceTaxCashVATList(List<InvoiceTaxCashVAT> invoiceTaxCashVATList) {
        set(PROPERTY_INVOICETAXCASHVATLIST, invoiceTaxCashVATList);
    }

}
