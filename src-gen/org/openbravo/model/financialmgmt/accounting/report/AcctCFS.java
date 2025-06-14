
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
package org.openbravo.model.financialmgmt.accounting.report;

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
import org.openbravo.model.financialmgmt.accounting.AccountingFact;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;
/**
 * Entity class for entity FinancialMgmtAcctCFS (stored in table Fact_Acct_CFS).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AcctCFS extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "Fact_Acct_CFS";
    public static final String ENTITY_NAME = "FinancialMgmtAcctCFS";

    /**
     * Property id stored in column Fact_Acct_Cfs_ID in table Fact_Acct_CFS 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property accountingFact stored in column Fact_Acct_ID in table Fact_Acct_CFS
     * 
     */
    public static final String PROPERTY_ACCOUNTINGFACT = "accountingFact";

    /**
     * Property client stored in column AD_Client_ID in table Fact_Acct_CFS 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table Fact_Acct_CFS 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table Fact_Acct_CFS 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table Fact_Acct_CFS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table Fact_Acct_CFS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table Fact_Acct_CFS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table Fact_Acct_CFS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property account stored in column Account_ID in table Fact_Acct_CFS<br>
     * Help: {@literal The (natural) account used}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property amount stored in column Amount in table Fact_Acct_CFS<br>
     * Help: {@literal The Amount indicates the amount for this document line.}
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property accountingFactReference stored in column Fact_Acct_Ref_ID in table Fact_Acct_CFS
     * 
     */
    public static final String PROPERTY_ACCOUNTINGFACTREFERENCE = "accountingFactReference";


    public AcctCFS() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AcctCFS#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AcctCFS#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AcctCFS#PROPERTY_ACCOUNTINGFACT
     * 
     */
    public AccountingFact getAccountingFact() {
        return (AccountingFact) get(PROPERTY_ACCOUNTINGFACT);
    }
    /**
     * @see AcctCFS#PROPERTY_ACCOUNTINGFACT
     * 
     */
    public void setAccountingFact(AccountingFact accountingFact) {
        set(PROPERTY_ACCOUNTINGFACT, accountingFact);
    }

    /**
     * @see AcctCFS#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AcctCFS#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AcctCFS#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AcctCFS#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AcctCFS#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AcctCFS#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AcctCFS#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AcctCFS#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AcctCFS#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AcctCFS#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AcctCFS#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AcctCFS#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AcctCFS#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AcctCFS#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AcctCFS#PROPERTY_ACCOUNT
     * 
     */
    public ElementValue getAccount() {
        return (ElementValue) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see AcctCFS#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(ElementValue account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see AcctCFS#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see AcctCFS#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see AcctCFS#PROPERTY_ACCOUNTINGFACTREFERENCE
     * 
     */
    public AccountingFact getAccountingFactReference() {
        return (AccountingFact) get(PROPERTY_ACCOUNTINGFACTREFERENCE);
    }
    /**
     * @see AcctCFS#PROPERTY_ACCOUNTINGFACTREFERENCE
     * 
     */
    public void setAccountingFactReference(AccountingFact accountingFactReference) {
        set(PROPERTY_ACCOUNTINGFACTREFERENCE, accountingFactReference);
    }

}
