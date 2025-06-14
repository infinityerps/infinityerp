
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
import org.openbravo.model.financialmgmt.gl.GLItem;
/**
 * Entity class for entity FinancialMgmtDebtPaymentBalReplace (stored in table C_Debt_Payment_Bal_Replace).
 * <br>
 * Help: {@literal GL items used to replace existing ones when the settlement is already processed but not
     *       posted.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DebtPaymentBalReplace extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Debt_Payment_Bal_Replace";
    public static final String ENTITY_NAME = "FinancialMgmtDebtPaymentBalReplace";

    /**
     * Property id stored in column C_Debt_Payment_Bal_Replace_ID in table C_Debt_Payment_Bal_Replace 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Debt_Payment_Bal_Replace 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Debt_Payment_Bal_Replace 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Debt_Payment_Bal_Replace 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Debt_Payment_Bal_Replace 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Debt_Payment_Bal_Replace 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Debt_Payment_Bal_Replace 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Debt_Payment_Bal_Replace 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property payment stored in column C_Debt_Payment_ID in table C_Debt_Payment_Bal_Replace<br>
     * Help: {@literal Refers to the amount of money to be paid or collected.}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property debitAmount stored in column Amountdebit in table C_Debt_Payment_Bal_Replace<br>
     * Help: {@literal Debit amount}
     * 
     */
    public static final String PROPERTY_DEBITAMOUNT = "debitAmount";

    /**
     * Property creditAmount stored in column Amountcredit in table C_Debt_Payment_Bal_Replace<br>
     * Help: {@literal Credit amount}
     * 
     */
    public static final String PROPERTY_CREDITAMOUNT = "creditAmount";

    /**
     * Property gLItem stored in column C_Glitem_ID in table C_Debt_Payment_Bal_Replace<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property replace stored in column Replacing in table C_Debt_Payment_Bal_Replace<br>
     * Help: {@literal Replacing process.}
     * 
     */
    public static final String PROPERTY_REPLACE = "replace";


    public DebtPaymentBalReplace() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEBITAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREDITAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_REPLACE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_PAYMENT
     * 
     */
    public DebtPayment getPayment() {
        return (DebtPayment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(DebtPayment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_DEBITAMOUNT
     * 
     */
    public BigDecimal getDebitAmount() {
        return (BigDecimal) get(PROPERTY_DEBITAMOUNT);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_DEBITAMOUNT
     * 
     */
    public void setDebitAmount(BigDecimal debitAmount) {
        set(PROPERTY_DEBITAMOUNT, debitAmount);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_CREDITAMOUNT
     * 
     */
    public BigDecimal getCreditAmount() {
        return (BigDecimal) get(PROPERTY_CREDITAMOUNT);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_CREDITAMOUNT
     * 
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        set(PROPERTY_CREDITAMOUNT, creditAmount);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see DebtPaymentBalReplace#PROPERTY_REPLACE
     * 
     */
    public Boolean isReplace() {
        return (Boolean) get(PROPERTY_REPLACE);
    }
    /**
     * @see DebtPaymentBalReplace#PROPERTY_REPLACE
     * 
     */
    public void setReplace(Boolean replace) {
        set(PROPERTY_REPLACE, replace);
    }

}
