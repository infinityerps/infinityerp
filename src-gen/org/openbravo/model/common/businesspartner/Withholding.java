
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
package org.openbravo.model.common.businesspartner;

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
import org.openbravo.model.financialmgmt.tax.TaxRate;
/**
 * Entity class for entity BusinessPartnerWithholding (stored in table C_BP_Withholding).
 * <br>
 * Help: {@literal The Withholding Tab defines any withholding information for this business partner.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Withholding extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BP_Withholding";
    public static final String ENTITY_NAME = "BusinessPartnerWithholding";

    /**
     * Property id stored in column C_BP_Withholding_ID in table C_BP_Withholding 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_BP_Withholding<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property withholding stored in column C_Withholding_ID in table C_BP_Withholding<br>
     * Help: {@literal The Withholding indicates the type of withholding to be calculated.}
     * 
     */
    public static final String PROPERTY_WITHHOLDING = "withholding";

    /**
     * Property client stored in column AD_Client_ID in table C_BP_Withholding 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BP_Withholding 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BP_Withholding 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BP_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BP_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BP_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BP_Withholding 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property mandatoryWithholding stored in column IsMandatoryWithholding in table C_BP_Withholding<br>
     * Help: {@literal The Mandatory Withholding checkbox indicates that monies must be withheld from this
     *       employee.}
     * 
     */
    public static final String PROPERTY_MANDATORYWITHHOLDING = "mandatoryWithholding";

    /**
     * Property temporarilyExempt stored in column IsTemporaryExempt in table C_BP_Withholding<br>
     * Help: {@literal The Temporary Exempt checkbox indicates that for a limited time, taxes will not be
     *       withheld for this employee.}
     * 
     */
    public static final String PROPERTY_TEMPORARILYEXEMPT = "temporarilyExempt";

    /**
     * Property exemptReason stored in column ExemptReason in table C_BP_Withholding<br>
     * Help: {@literal The Exempt Reason indicates the reason that monies are not withheld from this employee.}
     * 
     */
    public static final String PROPERTY_EXEMPTREASON = "exemptReason";

    /**
     * Property isPercent stored in column IS_Percent_Wh in table C_BP_Withholding<br>
     * Help: {@literal Is Percent of Base Amount for calculate the Whitholding}
     * 
     */
    public static final String PROPERTY_ISPERCENT = "isPercent";

    /**
     * Property percentOfBaseAmount stored in column WH_Percent in table C_BP_Withholding<br>
     * Help: {@literal Percent of Base Amount for calculate the Whitholding}
     * 
     */
    public static final String PROPERTY_PERCENTOFBASEAMOUNT = "percentOfBaseAmount";

    /**
     * Property includeTax stored in column Include_Tax in table C_BP_Withholding<br>
     * Help: {@literal Include Tax Inps}
     * 
     */
    public static final String PROPERTY_INCLUDETAX = "includeTax";

    /**
     * Property tax stored in column C_Tax_ID in table C_BP_Withholding<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_TAX = "tax";

    /**
     * Property default stored in column Isdefault in table C_BP_Withholding<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";


    public Withholding() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MANDATORYWITHHOLDING, false);
        setDefaultValue(PROPERTY_TEMPORARILYEXEMPT, false);
        setDefaultValue(PROPERTY_ISPERCENT, false);
        setDefaultValue(PROPERTY_INCLUDETAX, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
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
     * @see Withholding#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Withholding#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Withholding#PROPERTY_WITHHOLDING
     * 
     */
    public org.openbravo.model.financialmgmt.tax.Withholding getWithholding() {
        return (org.openbravo.model.financialmgmt.tax.Withholding) get(PROPERTY_WITHHOLDING);
    }
    /**
     * @see Withholding#PROPERTY_WITHHOLDING
     * 
     */
    public void setWithholding(org.openbravo.model.financialmgmt.tax.Withholding withholding) {
        set(PROPERTY_WITHHOLDING, withholding);
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
     * @see Withholding#PROPERTY_MANDATORYWITHHOLDING
     * 
     */
    public Boolean isMandatoryWithholding() {
        return (Boolean) get(PROPERTY_MANDATORYWITHHOLDING);
    }
    /**
     * @see Withholding#PROPERTY_MANDATORYWITHHOLDING
     * 
     */
    public void setMandatoryWithholding(Boolean mandatoryWithholding) {
        set(PROPERTY_MANDATORYWITHHOLDING, mandatoryWithholding);
    }

    /**
     * @see Withholding#PROPERTY_TEMPORARILYEXEMPT
     * 
     */
    public Boolean isTemporarilyExempt() {
        return (Boolean) get(PROPERTY_TEMPORARILYEXEMPT);
    }
    /**
     * @see Withholding#PROPERTY_TEMPORARILYEXEMPT
     * 
     */
    public void setTemporarilyExempt(Boolean temporarilyExempt) {
        set(PROPERTY_TEMPORARILYEXEMPT, temporarilyExempt);
    }

    /**
     * @see Withholding#PROPERTY_EXEMPTREASON
     * 
     */
    public String getExemptReason() {
        return (String) get(PROPERTY_EXEMPTREASON);
    }
    /**
     * @see Withholding#PROPERTY_EXEMPTREASON
     * 
     */
    public void setExemptReason(String exemptReason) {
        set(PROPERTY_EXEMPTREASON, exemptReason);
    }

    /**
     * @see Withholding#PROPERTY_ISPERCENT
     * 
     */
    public Boolean isPercent() {
        return (Boolean) get(PROPERTY_ISPERCENT);
    }
    /**
     * @see Withholding#PROPERTY_ISPERCENT
     * 
     */
    public void setPercent(Boolean isPercent) {
        set(PROPERTY_ISPERCENT, isPercent);
    }

    /**
     * @see Withholding#PROPERTY_PERCENTOFBASEAMOUNT
     * 
     */
    public BigDecimal getPercentOfBaseAmount() {
        return (BigDecimal) get(PROPERTY_PERCENTOFBASEAMOUNT);
    }
    /**
     * @see Withholding#PROPERTY_PERCENTOFBASEAMOUNT
     * 
     */
    public void setPercentOfBaseAmount(BigDecimal percentOfBaseAmount) {
        set(PROPERTY_PERCENTOFBASEAMOUNT, percentOfBaseAmount);
    }

    /**
     * @see Withholding#PROPERTY_INCLUDETAX
     * 
     */
    public Boolean isIncludeTax() {
        return (Boolean) get(PROPERTY_INCLUDETAX);
    }
    /**
     * @see Withholding#PROPERTY_INCLUDETAX
     * 
     */
    public void setIncludeTax(Boolean includeTax) {
        set(PROPERTY_INCLUDETAX, includeTax);
    }

    /**
     * @see Withholding#PROPERTY_TAX
     * 
     */
    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }
    /**
     * @see Withholding#PROPERTY_TAX
     * 
     */
    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    /**
     * @see Withholding#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see Withholding#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

}
