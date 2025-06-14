
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.AccountingCombination;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
/**
 * Entity class for entity VendorAccounts (stored in table C_BP_Vendor_Acct).
 * <br>
 * Help: {@literal Defines the default accounts to use when this business partner is referenced in an
     *       accounts payable transaction.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class VendorAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BP_Vendor_Acct";
    public static final String ENTITY_NAME = "VendorAccounts";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_BP_Vendor_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_BP_Vendor_Acct<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property client stored in column AD_Client_ID in table C_BP_Vendor_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BP_Vendor_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BP_Vendor_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BP_Vendor_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BP_Vendor_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BP_Vendor_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BP_Vendor_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property vendorLiability stored in column V_Liability_Acct in table C_BP_Vendor_Acct<br>
     * Help: {@literal The Vendor Liability account indicates the account used for recording transactions for
     *       vendor liabilities}
     * 
     */
    public static final String PROPERTY_VENDORLIABILITY = "vendorLiability";

    /**
     * Property vendorServiceLiability stored in column V_Liability_Services_Acct in table C_BP_Vendor_Acct<br>
     * Help: {@literal The Vendor Service Liability account indicates the account to use for recording service
     *       liabilities.  It is used if you need to distinguish between Liability for products and services}
     * 
     */
    public static final String PROPERTY_VENDORSERVICELIABILITY = "vendorServiceLiability";

    /**
     * Property vendorPrepayment stored in column V_Prepayment_Acct in table C_BP_Vendor_Acct<br>
     * Help: {@literal The Vendor Prepayment Account indicates the account used to record prepayments from a
     *       vendor.}
     * 
     */
    public static final String PROPERTY_VENDORPREPAYMENT = "vendorPrepayment";

    /**
     * Property id stored in column C_Bp_Vendor_Acct_ID in table C_BP_Vendor_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property status stored in column Status in table C_BP_Vendor_Acct<br>
     * Help: {@literal Status for the debt payment}
     * 
     */
    public static final String PROPERTY_STATUS = "status";


    public VendorAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see VendorAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see VendorAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see VendorAccounts#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see VendorAccounts#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see VendorAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see VendorAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see VendorAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see VendorAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see VendorAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see VendorAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see VendorAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see VendorAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see VendorAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see VendorAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see VendorAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see VendorAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see VendorAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see VendorAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see VendorAccounts#PROPERTY_VENDORLIABILITY
     * 
     */
    public AccountingCombination getVendorLiability() {
        return (AccountingCombination) get(PROPERTY_VENDORLIABILITY);
    }
    /**
     * @see VendorAccounts#PROPERTY_VENDORLIABILITY
     * 
     */
    public void setVendorLiability(AccountingCombination vendorLiability) {
        set(PROPERTY_VENDORLIABILITY, vendorLiability);
    }

    /**
     * @see VendorAccounts#PROPERTY_VENDORSERVICELIABILITY
     * 
     */
    public AccountingCombination getVendorServiceLiability() {
        return (AccountingCombination) get(PROPERTY_VENDORSERVICELIABILITY);
    }
    /**
     * @see VendorAccounts#PROPERTY_VENDORSERVICELIABILITY
     * 
     */
    public void setVendorServiceLiability(AccountingCombination vendorServiceLiability) {
        set(PROPERTY_VENDORSERVICELIABILITY, vendorServiceLiability);
    }

    /**
     * @see VendorAccounts#PROPERTY_VENDORPREPAYMENT
     * 
     */
    public AccountingCombination getVendorPrepayment() {
        return (AccountingCombination) get(PROPERTY_VENDORPREPAYMENT);
    }
    /**
     * @see VendorAccounts#PROPERTY_VENDORPREPAYMENT
     * 
     */
    public void setVendorPrepayment(AccountingCombination vendorPrepayment) {
        set(PROPERTY_VENDORPREPAYMENT, vendorPrepayment);
    }

    /**
     * @see VendorAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see VendorAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see VendorAccounts#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see VendorAccounts#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

}
