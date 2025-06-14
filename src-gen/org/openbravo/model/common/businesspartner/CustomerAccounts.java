
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
 * Entity class for entity CustomerAccounts (stored in table C_BP_Customer_Acct).
 * <br>
 * Help: {@literal Defines the default accounts to use when this business partner is referenced on an
     *       accounts receivable transaction.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CustomerAccounts extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_BP_Customer_Acct";
    public static final String ENTITY_NAME = "CustomerAccounts";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_BP_Customer_Acct<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property accountingSchema stored in column C_AcctSchema_ID in table C_BP_Customer_Acct<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property client stored in column AD_Client_ID in table C_BP_Customer_Acct 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_BP_Customer_Acct 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_BP_Customer_Acct 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_BP_Customer_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_BP_Customer_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_BP_Customer_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_BP_Customer_Acct 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property customerReceivablesNo stored in column C_Receivable_Acct in table C_BP_Customer_Acct<br>
     * Help: {@literal The Customer Receivables Accounts indicates the account to be used for recording
     *       transaction for customers receivables.}
     * 
     */
    public static final String PROPERTY_CUSTOMERRECEIVABLESNO = "customerReceivablesNo";

    /**
     * Property customerPrepayment stored in column C_Prepayment_Acct in table C_BP_Customer_Acct<br>
     * Help: {@literal The Customer Prepayment account indicates the account to be used for recording prepayments
     *       from a customer.}
     * 
     */
    public static final String PROPERTY_CUSTOMERPREPAYMENT = "customerPrepayment";

    /**
     * Property id stored in column C_Bp_Customer_Acct_ID in table C_BP_Customer_Acct 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property status stored in column Status in table C_BP_Customer_Acct<br>
     * Help: {@literal Status for the debt payment}
     * 
     */
    public static final String PROPERTY_STATUS = "status";


    public CustomerAccounts() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CustomerAccounts#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see CustomerAccounts#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see CustomerAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see CustomerAccounts#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see CustomerAccounts#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CustomerAccounts#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CustomerAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CustomerAccounts#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CustomerAccounts#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CustomerAccounts#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CustomerAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CustomerAccounts#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CustomerAccounts#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CustomerAccounts#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CustomerAccounts#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CustomerAccounts#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CustomerAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CustomerAccounts#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CustomerAccounts#PROPERTY_CUSTOMERRECEIVABLESNO
     * 
     */
    public AccountingCombination getCustomerReceivablesNo() {
        return (AccountingCombination) get(PROPERTY_CUSTOMERRECEIVABLESNO);
    }
    /**
     * @see CustomerAccounts#PROPERTY_CUSTOMERRECEIVABLESNO
     * 
     */
    public void setCustomerReceivablesNo(AccountingCombination customerReceivablesNo) {
        set(PROPERTY_CUSTOMERRECEIVABLESNO, customerReceivablesNo);
    }

    /**
     * @see CustomerAccounts#PROPERTY_CUSTOMERPREPAYMENT
     * 
     */
    public AccountingCombination getCustomerPrepayment() {
        return (AccountingCombination) get(PROPERTY_CUSTOMERPREPAYMENT);
    }
    /**
     * @see CustomerAccounts#PROPERTY_CUSTOMERPREPAYMENT
     * 
     */
    public void setCustomerPrepayment(AccountingCombination customerPrepayment) {
        set(PROPERTY_CUSTOMERPREPAYMENT, customerPrepayment);
    }

    /**
     * @see CustomerAccounts#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CustomerAccounts#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CustomerAccounts#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see CustomerAccounts#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

}
