
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
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentDetail;
/**
 * Entity class for entity InvoiceTaxCashVAT (stored in table C_InvoiceTax_CashVAT).
 * <br>
 * Help: {@literal Cash VAT management for invoices}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceTaxCashVAT extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_InvoiceTax_CashVAT";
    public static final String ENTITY_NAME = "InvoiceTaxCashVAT";

    /**
     * Property id stored in column C_Invoicetax_CashVAT_ID in table C_InvoiceTax_CashVAT 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_InvoiceTax_CashVAT 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_InvoiceTax_CashVAT 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_InvoiceTax_CashVAT 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_InvoiceTax_CashVAT 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_InvoiceTax_CashVAT 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_InvoiceTax_CashVAT 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_InvoiceTax_CashVAT 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property invoiceTax stored in column C_Invoicetax_ID in table C_InvoiceTax_CashVAT
     * 
     */
    public static final String PROPERTY_INVOICETAX = "invoiceTax";

    /**
     * Property percentage stored in column Percentage in table C_InvoiceTax_CashVAT 
     * 
     */
    public static final String PROPERTY_PERCENTAGE = "percentage";

    /**
     * Property taxAmount stored in column Taxamt in table C_InvoiceTax_CashVAT<br>
     * Help: {@literal The Tax Amount displays the total tax amount for a document.}
     * 
     */
    public static final String PROPERTY_TAXAMOUNT = "taxAmount";

    /**
     * Property taxableAmount stored in column Taxbaseamt in table C_InvoiceTax_CashVAT<br>
     * Help: {@literal The Tax Base Amount indicates the base amount used for calculating the tax amount.}
     * 
     */
    public static final String PROPERTY_TAXABLEAMOUNT = "taxableAmount";

    /**
     * Property fINPaymentDetail stored in column FIN_Payment_Detail_ID in table C_InvoiceTax_CashVAT
     * 
     */
    public static final String PROPERTY_FINPAYMENTDETAIL = "fINPaymentDetail";

    /**
     * Property isManualSettlement stored in column IsManualSettlement in table C_InvoiceTax_CashVAT<br>
     * Help: {@literal Indicates whether this line has been created from a Manual Cash VAT Settlement}
     * 
     */
    public static final String PROPERTY_ISMANUALSETTLEMENT = "isManualSettlement";


    public InvoiceTaxCashVAT() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISMANUALSETTLEMENT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_INVOICETAX
     * 
     */
    public InvoiceTax getInvoiceTax() {
        return (InvoiceTax) get(PROPERTY_INVOICETAX);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_INVOICETAX
     * 
     */
    public void setInvoiceTax(InvoiceTax invoiceTax) {
        set(PROPERTY_INVOICETAX, invoiceTax);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_PERCENTAGE
     * 
     */
    public BigDecimal getPercentage() {
        return (BigDecimal) get(PROPERTY_PERCENTAGE);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_PERCENTAGE
     * 
     */
    public void setPercentage(BigDecimal percentage) {
        set(PROPERTY_PERCENTAGE, percentage);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_TAXAMOUNT
     * 
     */
    public BigDecimal getTaxAmount() {
        return (BigDecimal) get(PROPERTY_TAXAMOUNT);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_TAXAMOUNT
     * 
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        set(PROPERTY_TAXAMOUNT, taxAmount);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public BigDecimal getTaxableAmount() {
        return (BigDecimal) get(PROPERTY_TAXABLEAMOUNT);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_TAXABLEAMOUNT
     * 
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        set(PROPERTY_TAXABLEAMOUNT, taxableAmount);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_FINPAYMENTDETAIL
     * 
     */
    public FIN_PaymentDetail getFINPaymentDetail() {
        return (FIN_PaymentDetail) get(PROPERTY_FINPAYMENTDETAIL);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_FINPAYMENTDETAIL
     * 
     */
    public void setFINPaymentDetail(FIN_PaymentDetail fINPaymentDetail) {
        set(PROPERTY_FINPAYMENTDETAIL, fINPaymentDetail);
    }

    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ISMANUALSETTLEMENT
     * 
     */
    public Boolean isManualSettlement() {
        return (Boolean) get(PROPERTY_ISMANUALSETTLEMENT);
    }
    /**
     * @see InvoiceTaxCashVAT#PROPERTY_ISMANUALSETTLEMENT
     * 
     */
    public void setManualSettlement(Boolean isManualSettlement) {
        set(PROPERTY_ISMANUALSETTLEMENT, isManualSettlement);
    }

}
