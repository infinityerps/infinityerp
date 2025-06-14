
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
/**
 * Entity class for entity FinancialMgmtWithholding (stored in table C_Withholding).
 * <br>
 * Help: {@literal The Withholding Rules Tab define the rules governing the withholding of amounts.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Withholding extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Withholding";
    public static final String ENTITY_NAME = "FinancialMgmtWithholding";

    /**
     * Property id stored in column C_Withholding_ID in table C_Withholding<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Withholding 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Withholding 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Withholding 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Withholding 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Withholding<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_Withholding<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property taxWithholding stored in column IsTaxWithholding in table C_Withholding<br>
     * Help: {@literal The Tax Withholding checkbox indicates if this withholding is tax related.}
     * 
     */
    public static final String PROPERTY_TAXWITHHOLDING = "taxWithholding";

    /**
     * Property prorateTax stored in column IsTaxProrated in table C_Withholding<br>
     * Help: {@literal The Prorate Tax checkbox indicates if this tax is prorated.}
     * 
     */
    public static final String PROPERTY_PRORATETAX = "prorateTax";

    /**
     * Property paymentToExternalParty stored in column IsPaidTo3Party in table C_Withholding<br>
     * Help: {@literal The Paid to Third Party checkbox indicates that the amounts are paid to someone other than
     *       the Business Partner.}
     * 
     */
    public static final String PROPERTY_PAYMENTTOEXTERNALPARTY = "paymentToExternalParty";

    /**
     * Property beneficiary stored in column Beneficiary in table C_Withholding<br>
     * Help: {@literal The Beneficiary indicates the Business Partner to whom payment will be made.  This field
     *       is only displayed if the Paid to Third Party checkbox is selected.}
     * 
     */
    public static final String PROPERTY_BENEFICIARY = "beneficiary";

    /**
     * Property withholdingPercentage stored in column IsPercentWithholding in table C_Withholding<br>
     * Help: {@literal The Percent Withholding checkbox indicates if the withholding amount is a percentage of
     *       the invoice amount.}
     * 
     */
    public static final String PROPERTY_WITHHOLDINGPERCENTAGE = "withholdingPercentage";

    /**
     * Property percent stored in column Percent in table C_Withholding<br>
     * Help: {@literal The Percent indicates the percentage used for withholding.}
     * 
     */
    public static final String PROPERTY_PERCENT = "percent";

    /**
     * Property fixAmount stored in column FixAmt in table C_Withholding<br>
     * Help: {@literal The Fixed Amount indicates a fixed amount to be levied or paid.}
     * 
     */
    public static final String PROPERTY_FIXAMOUNT = "fixAmount";

    /**
     * Property thresholdMin stored in column Thresholdmin in table C_Withholding<br>
     * Help: {@literal The Threshold Minimum indicates the minimum gross amount to be used in the withholding
     *       calculation.}
     * 
     */
    public static final String PROPERTY_THRESHOLDMIN = "thresholdMin";

    /**
     * Property thresholdMax stored in column ThresholdMax in table C_Withholding<br>
     * Help: {@literal The Threshold maximum indicates the maximum gross amount to be used in the withholding
     *       calculation .  A value of 0 indicates there is no limit.}
     * 
     */
    public static final String PROPERTY_THRESHOLDMAX = "thresholdMax";

    /**
     * Property minAmount stored in column MinAmt in table C_Withholding<br>
     * Help: {@literal The Minimum amount indicates the minimum amount as stated in the currency of the invoice.}
     * 
     */
    public static final String PROPERTY_MINAMOUNT = "minAmount";

    /**
     * Property maxAmount stored in column MaxAmt in table C_Withholding<br>
     * Help: {@literal The Maximum Amount indicates the maximum amount in invoice currency.}
     * 
     */
    public static final String PROPERTY_MAXAMOUNT = "maxAmount";

    /**
     * Property rate stored in column Rate in table C_Withholding<br>
     * Help: {@literal The Rate indicates the percentage to be multiplied by the source to arrive at the tax or
     *       exchange amount.}
     * 
     */
    public static final String PROPERTY_RATE = "rate";

    /**
     * Property financialMgmtWithholdingAccountsList stored in table C_Withholding
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTWITHHOLDINGACCOUNTSLIST = "financialMgmtWithholdingAccountsList";


    public Withholding() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TAXWITHHOLDING, false);
        setDefaultValue(PROPERTY_PRORATETAX, false);
        setDefaultValue(PROPERTY_PAYMENTTOEXTERNALPARTY, false);
        setDefaultValue(PROPERTY_WITHHOLDINGPERCENTAGE, false);
        setDefaultValue(PROPERTY_RATE, new BigDecimal(0));
        setDefaultValue(PROPERTY_FINANCIALMGMTWITHHOLDINGACCOUNTSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Withholding#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Withholding#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Withholding#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Withholding#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Withholding#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Withholding#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Withholding#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Withholding#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Withholding#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Withholding#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Withholding#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Withholding#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Withholding#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Withholding#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Withholding#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Withholding#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Withholding#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Withholding#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Withholding#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Withholding#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Withholding#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see Withholding#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see Withholding#PROPERTY_TAXWITHHOLDING
     * 
     */
    public Boolean isTaxWithholding() {
        return (Boolean) get(PROPERTY_TAXWITHHOLDING);
    }
    /**
     * @see Withholding#PROPERTY_TAXWITHHOLDING
     * 
     */
    public void setTaxWithholding(Boolean taxWithholding) {
        set(PROPERTY_TAXWITHHOLDING, taxWithholding);
    }

    /**
     * @see Withholding#PROPERTY_PRORATETAX
     * 
     */
    public Boolean isProrateTax() {
        return (Boolean) get(PROPERTY_PRORATETAX);
    }
    /**
     * @see Withholding#PROPERTY_PRORATETAX
     * 
     */
    public void setProrateTax(Boolean prorateTax) {
        set(PROPERTY_PRORATETAX, prorateTax);
    }

    /**
     * @see Withholding#PROPERTY_PAYMENTTOEXTERNALPARTY
     * 
     */
    public Boolean isPaymentToExternalParty() {
        return (Boolean) get(PROPERTY_PAYMENTTOEXTERNALPARTY);
    }
    /**
     * @see Withholding#PROPERTY_PAYMENTTOEXTERNALPARTY
     * 
     */
    public void setPaymentToExternalParty(Boolean paymentToExternalParty) {
        set(PROPERTY_PAYMENTTOEXTERNALPARTY, paymentToExternalParty);
    }

    /**
     * @see Withholding#PROPERTY_BENEFICIARY
     * 
     */
    public BusinessPartner getBeneficiary() {
        return (BusinessPartner) get(PROPERTY_BENEFICIARY);
    }
    /**
     * @see Withholding#PROPERTY_BENEFICIARY
     * 
     */
    public void setBeneficiary(BusinessPartner beneficiary) {
        set(PROPERTY_BENEFICIARY, beneficiary);
    }

    /**
     * @see Withholding#PROPERTY_WITHHOLDINGPERCENTAGE
     * 
     */
    public Boolean isWithholdingPercentage() {
        return (Boolean) get(PROPERTY_WITHHOLDINGPERCENTAGE);
    }
    /**
     * @see Withholding#PROPERTY_WITHHOLDINGPERCENTAGE
     * 
     */
    public void setWithholdingPercentage(Boolean withholdingPercentage) {
        set(PROPERTY_WITHHOLDINGPERCENTAGE, withholdingPercentage);
    }

    /**
     * @see Withholding#PROPERTY_PERCENT
     * 
     */
    public BigDecimal getPercent() {
        return (BigDecimal) get(PROPERTY_PERCENT);
    }
    /**
     * @see Withholding#PROPERTY_PERCENT
     * 
     */
    public void setPercent(BigDecimal percent) {
        set(PROPERTY_PERCENT, percent);
    }

    /**
     * @see Withholding#PROPERTY_FIXAMOUNT
     * 
     */
    public BigDecimal getFixAmount() {
        return (BigDecimal) get(PROPERTY_FIXAMOUNT);
    }
    /**
     * @see Withholding#PROPERTY_FIXAMOUNT
     * 
     */
    public void setFixAmount(BigDecimal fixAmount) {
        set(PROPERTY_FIXAMOUNT, fixAmount);
    }

    /**
     * @see Withholding#PROPERTY_THRESHOLDMIN
     * 
     */
    public BigDecimal getThresholdMin() {
        return (BigDecimal) get(PROPERTY_THRESHOLDMIN);
    }
    /**
     * @see Withholding#PROPERTY_THRESHOLDMIN
     * 
     */
    public void setThresholdMin(BigDecimal thresholdMin) {
        set(PROPERTY_THRESHOLDMIN, thresholdMin);
    }

    /**
     * @see Withholding#PROPERTY_THRESHOLDMAX
     * 
     */
    public BigDecimal getThresholdMax() {
        return (BigDecimal) get(PROPERTY_THRESHOLDMAX);
    }
    /**
     * @see Withholding#PROPERTY_THRESHOLDMAX
     * 
     */
    public void setThresholdMax(BigDecimal thresholdMax) {
        set(PROPERTY_THRESHOLDMAX, thresholdMax);
    }

    /**
     * @see Withholding#PROPERTY_MINAMOUNT
     * 
     */
    public BigDecimal getMinAmount() {
        return (BigDecimal) get(PROPERTY_MINAMOUNT);
    }
    /**
     * @see Withholding#PROPERTY_MINAMOUNT
     * 
     */
    public void setMinAmount(BigDecimal minAmount) {
        set(PROPERTY_MINAMOUNT, minAmount);
    }

    /**
     * @see Withholding#PROPERTY_MAXAMOUNT
     * 
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) get(PROPERTY_MAXAMOUNT);
    }
    /**
     * @see Withholding#PROPERTY_MAXAMOUNT
     * 
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        set(PROPERTY_MAXAMOUNT, maxAmount);
    }

    /**
     * @see Withholding#PROPERTY_RATE
     * 
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(PROPERTY_RATE);
    }
    /**
     * @see Withholding#PROPERTY_RATE
     * 
     */
    public void setRate(BigDecimal rate) {
        set(PROPERTY_RATE, rate);
    }

    /**
     * Help: {@literal The Withholding Accounting Tab defines the accounting parameters for Withholding.}<br>
     * @see WithholdingAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WithholdingAccounts> getFinancialMgmtWithholdingAccountsList() {
      return (List<WithholdingAccounts>) get(PROPERTY_FINANCIALMGMTWITHHOLDINGACCOUNTSLIST);
    }

    /**
     * Help: {@literal The Withholding Accounting Tab defines the accounting parameters for Withholding.}<br>
     * @see WithholdingAccounts
     * 
     */
    public void setFinancialMgmtWithholdingAccountsList(List<WithholdingAccounts> financialMgmtWithholdingAccountsList) {
        set(PROPERTY_FINANCIALMGMTWITHHOLDINGACCOUNTSLIST, financialMgmtWithholdingAccountsList);
    }

}
