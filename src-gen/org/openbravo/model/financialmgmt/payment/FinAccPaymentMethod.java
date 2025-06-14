
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtFinAccPaymentMethod (stored in table FIN_FinAcc_PaymentMethod).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FinAccPaymentMethod extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_FinAcc_PaymentMethod";
    public static final String ENTITY_NAME = "FinancialMgmtFinAccPaymentMethod";

    /**
     * Property id stored in column FIN_Finacc_Paymentmethod_ID in table FIN_FinAcc_PaymentMethod 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_FinAcc_PaymentMethod 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_FinAcc_PaymentMethod 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_FinAcc_PaymentMethod 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_FinAcc_PaymentMethod 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_FinAcc_PaymentMethod 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_FinAcc_PaymentMethod 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_FinAcc_PaymentMethod 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table FIN_FinAcc_PaymentMethod
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property account stored in column FIN_Financial_Account_ID in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Financial account used to deposit / withdrawal money such as bank accounts or petty cash}
     * 
     */
    public static final String PROPERTY_ACCOUNT = "account";

    /**
     * Property automaticReceipt stored in column Automatic_Receipt in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Automatically create the receipt when the invoice is completed.}
     * 
     */
    public static final String PROPERTY_AUTOMATICRECEIPT = "automaticReceipt";

    /**
     * Property automaticPayment stored in column Automatic_Payment in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Automatically create the payment when the invoice is completed.}
     * 
     */
    public static final String PROPERTY_AUTOMATICPAYMENT = "automaticPayment";

    /**
     * Property automaticDeposit stored in column Automatic_Deposit in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Automatically deposit the payment when it is processed.}
     * 
     */
    public static final String PROPERTY_AUTOMATICDEPOSIT = "automaticDeposit";

    /**
     * Property automaticWithdrawn stored in column Automatic_Withdrawn in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Automatically withdrawn the payment when it is processed.}
     * 
     */
    public static final String PROPERTY_AUTOMATICWITHDRAWN = "automaticWithdrawn";

    /**
     * Property payinAllow stored in column Payin_Allow in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Sets that Payment Ins are allowed.}
     * 
     */
    public static final String PROPERTY_PAYINALLOW = "payinAllow";

    /**
     * Property payoutAllow stored in column Payout_Allow in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Sets that Payment Ins are allowed.}
     * 
     */
    public static final String PROPERTY_PAYOUTALLOW = "payoutAllow";

    /**
     * Property payinExecutionType stored in column Payin_Execution_Type in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Type of Payment Execution for Payment In flow.}
     * 
     */
    public static final String PROPERTY_PAYINEXECUTIONTYPE = "payinExecutionType";

    /**
     * Property payoutExecutionType stored in column Payout_Execution_Type in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Type of Payment Execution for Payment Out flow.}
     * 
     */
    public static final String PROPERTY_PAYOUTEXECUTIONTYPE = "payoutExecutionType";

    /**
     * Property payinExecutionProcess stored in column Payin_Execution_Process_ID in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Execution process to be used in the Payment In flow}
     * 
     */
    public static final String PROPERTY_PAYINEXECUTIONPROCESS = "payinExecutionProcess";

    /**
     * Property payoutExecutionProcess stored in column Payout_Execution_Process_ID in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Execution process to be used in the Payment Out flow}
     * 
     */
    public static final String PROPERTY_PAYOUTEXECUTIONPROCESS = "payoutExecutionProcess";

    /**
     * Property payinDeferred stored in column Payin_Deferred in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Sets that the Execution Process is deferred in the Payment In flow.}
     * 
     */
    public static final String PROPERTY_PAYINDEFERRED = "payinDeferred";

    /**
     * Property payoutDeferred stored in column Payout_Deferred in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Sets that the Executiion Process is deferred in the Payment In flow.}
     * 
     */
    public static final String PROPERTY_PAYOUTDEFERRED = "payoutDeferred";

    /**
     * Property uponReceiptUse stored in column Uponreceiptuse in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Account used upon receipt}
     * 
     */
    public static final String PROPERTY_UPONRECEIPTUSE = "uponReceiptUse";

    /**
     * Property uponDepositUse stored in column Upondeposituse in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Account used upon deposit}
     * 
     */
    public static final String PROPERTY_UPONDEPOSITUSE = "uponDepositUse";

    /**
     * Property iNUponClearingUse stored in column Inuponclearinguse in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Account used upon clearing}
     * 
     */
    public static final String PROPERTY_INUPONCLEARINGUSE = "iNUponClearingUse";

    /**
     * Property uponPaymentUse stored in column Uponpaymentuse in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Account used upon payment}
     * 
     */
    public static final String PROPERTY_UPONPAYMENTUSE = "uponPaymentUse";

    /**
     * Property uponWithdrawalUse stored in column Uponwithdrawaluse in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Account used upon withdrawal}
     * 
     */
    public static final String PROPERTY_UPONWITHDRAWALUSE = "uponWithdrawalUse";

    /**
     * Property oUTUponClearingUse stored in column Outuponclearinguse in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Account to be used upon clearing}
     * 
     */
    public static final String PROPERTY_OUTUPONCLEARINGUSE = "oUTUponClearingUse";

    /**
     * Property payinIsMulticurrency stored in column Payin_IsMulticurrency in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Allow Receipt of Payments in Multiple Currencies}
     * 
     */
    public static final String PROPERTY_PAYINISMULTICURRENCY = "payinIsMulticurrency";

    /**
     * Property payoutIsMulticurrency stored in column Payout_IsMulticurrency in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal Allow withdrawl of Payments in Multiple Currencies}
     * 
     */
    public static final String PROPERTY_PAYOUTISMULTICURRENCY = "payoutIsMulticurrency";

    /**
     * Property default stored in column Isdefault in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property payinInvoicepaidstatus stored in column Payin_Invoicepaidstatus in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal State in which a invoice is considered paid. This state can be configured for each payment
     *       method and financial account.}
     * 
     */
    public static final String PROPERTY_PAYININVOICEPAIDSTATUS = "payinInvoicepaidstatus";

    /**
     * Property payoutInvoicepaidstatus stored in column Payout_Invoicepaidstatus in table FIN_FinAcc_PaymentMethod<br>
     * Help: {@literal State in which a invoice is considered paid. This state can be configured for each payment
     *       method and financial account.}
     * 
     */
    public static final String PROPERTY_PAYOUTINVOICEPAIDSTATUS = "payoutInvoicepaidstatus";


    public FinAccPaymentMethod() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AUTOMATICRECEIPT, false);
        setDefaultValue(PROPERTY_AUTOMATICPAYMENT, false);
        setDefaultValue(PROPERTY_AUTOMATICDEPOSIT, false);
        setDefaultValue(PROPERTY_AUTOMATICWITHDRAWN, false);
        setDefaultValue(PROPERTY_PAYINALLOW, true);
        setDefaultValue(PROPERTY_PAYOUTALLOW, true);
        setDefaultValue(PROPERTY_PAYINEXECUTIONTYPE, "M");
        setDefaultValue(PROPERTY_PAYOUTEXECUTIONTYPE, "M");
        setDefaultValue(PROPERTY_PAYINDEFERRED, false);
        setDefaultValue(PROPERTY_PAYOUTDEFERRED, false);
        setDefaultValue(PROPERTY_PAYINISMULTICURRENCY, false);
        setDefaultValue(PROPERTY_PAYOUTISMULTICURRENCY, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_PAYININVOICEPAIDSTATUS, "RPR");
        setDefaultValue(PROPERTY_PAYOUTINVOICEPAIDSTATUS, "PPM");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_ACCOUNT
     * 
     */
    public FIN_FinancialAccount getAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_ACCOUNT);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_ACCOUNT
     * 
     */
    public void setAccount(FIN_FinancialAccount account) {
        set(PROPERTY_ACCOUNT, account);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICRECEIPT
     * 
     */
    public Boolean isAutomaticReceipt() {
        return (Boolean) get(PROPERTY_AUTOMATICRECEIPT);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICRECEIPT
     * 
     */
    public void setAutomaticReceipt(Boolean automaticReceipt) {
        set(PROPERTY_AUTOMATICRECEIPT, automaticReceipt);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICPAYMENT
     * 
     */
    public Boolean isAutomaticPayment() {
        return (Boolean) get(PROPERTY_AUTOMATICPAYMENT);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICPAYMENT
     * 
     */
    public void setAutomaticPayment(Boolean automaticPayment) {
        set(PROPERTY_AUTOMATICPAYMENT, automaticPayment);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICDEPOSIT
     * 
     */
    public Boolean isAutomaticDeposit() {
        return (Boolean) get(PROPERTY_AUTOMATICDEPOSIT);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICDEPOSIT
     * 
     */
    public void setAutomaticDeposit(Boolean automaticDeposit) {
        set(PROPERTY_AUTOMATICDEPOSIT, automaticDeposit);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICWITHDRAWN
     * 
     */
    public Boolean isAutomaticWithdrawn() {
        return (Boolean) get(PROPERTY_AUTOMATICWITHDRAWN);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_AUTOMATICWITHDRAWN
     * 
     */
    public void setAutomaticWithdrawn(Boolean automaticWithdrawn) {
        set(PROPERTY_AUTOMATICWITHDRAWN, automaticWithdrawn);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINALLOW
     * 
     */
    public Boolean isPayinAllow() {
        return (Boolean) get(PROPERTY_PAYINALLOW);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINALLOW
     * 
     */
    public void setPayinAllow(Boolean payinAllow) {
        set(PROPERTY_PAYINALLOW, payinAllow);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTALLOW
     * 
     */
    public Boolean isPayoutAllow() {
        return (Boolean) get(PROPERTY_PAYOUTALLOW);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTALLOW
     * 
     */
    public void setPayoutAllow(Boolean payoutAllow) {
        set(PROPERTY_PAYOUTALLOW, payoutAllow);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINEXECUTIONTYPE
     * 
     */
    public String getPayinExecutionType() {
        return (String) get(PROPERTY_PAYINEXECUTIONTYPE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINEXECUTIONTYPE
     * 
     */
    public void setPayinExecutionType(String payinExecutionType) {
        set(PROPERTY_PAYINEXECUTIONTYPE, payinExecutionType);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTEXECUTIONTYPE
     * 
     */
    public String getPayoutExecutionType() {
        return (String) get(PROPERTY_PAYOUTEXECUTIONTYPE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTEXECUTIONTYPE
     * 
     */
    public void setPayoutExecutionType(String payoutExecutionType) {
        set(PROPERTY_PAYOUTEXECUTIONTYPE, payoutExecutionType);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINEXECUTIONPROCESS
     * 
     */
    public PaymentExecutionProcess getPayinExecutionProcess() {
        return (PaymentExecutionProcess) get(PROPERTY_PAYINEXECUTIONPROCESS);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINEXECUTIONPROCESS
     * 
     */
    public void setPayinExecutionProcess(PaymentExecutionProcess payinExecutionProcess) {
        set(PROPERTY_PAYINEXECUTIONPROCESS, payinExecutionProcess);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTEXECUTIONPROCESS
     * 
     */
    public PaymentExecutionProcess getPayoutExecutionProcess() {
        return (PaymentExecutionProcess) get(PROPERTY_PAYOUTEXECUTIONPROCESS);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTEXECUTIONPROCESS
     * 
     */
    public void setPayoutExecutionProcess(PaymentExecutionProcess payoutExecutionProcess) {
        set(PROPERTY_PAYOUTEXECUTIONPROCESS, payoutExecutionProcess);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINDEFERRED
     * 
     */
    public Boolean isPayinDeferred() {
        return (Boolean) get(PROPERTY_PAYINDEFERRED);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINDEFERRED
     * 
     */
    public void setPayinDeferred(Boolean payinDeferred) {
        set(PROPERTY_PAYINDEFERRED, payinDeferred);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTDEFERRED
     * 
     */
    public Boolean isPayoutDeferred() {
        return (Boolean) get(PROPERTY_PAYOUTDEFERRED);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTDEFERRED
     * 
     */
    public void setPayoutDeferred(Boolean payoutDeferred) {
        set(PROPERTY_PAYOUTDEFERRED, payoutDeferred);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONRECEIPTUSE
     * 
     */
    public String getUponReceiptUse() {
        return (String) get(PROPERTY_UPONRECEIPTUSE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONRECEIPTUSE
     * 
     */
    public void setUponReceiptUse(String uponReceiptUse) {
        set(PROPERTY_UPONRECEIPTUSE, uponReceiptUse);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONDEPOSITUSE
     * 
     */
    public String getUponDepositUse() {
        return (String) get(PROPERTY_UPONDEPOSITUSE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONDEPOSITUSE
     * 
     */
    public void setUponDepositUse(String uponDepositUse) {
        set(PROPERTY_UPONDEPOSITUSE, uponDepositUse);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_INUPONCLEARINGUSE
     * 
     */
    public String getINUponClearingUse() {
        return (String) get(PROPERTY_INUPONCLEARINGUSE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_INUPONCLEARINGUSE
     * 
     */
    public void setINUponClearingUse(String iNUponClearingUse) {
        set(PROPERTY_INUPONCLEARINGUSE, iNUponClearingUse);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONPAYMENTUSE
     * 
     */
    public String getUponPaymentUse() {
        return (String) get(PROPERTY_UPONPAYMENTUSE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONPAYMENTUSE
     * 
     */
    public void setUponPaymentUse(String uponPaymentUse) {
        set(PROPERTY_UPONPAYMENTUSE, uponPaymentUse);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONWITHDRAWALUSE
     * 
     */
    public String getUponWithdrawalUse() {
        return (String) get(PROPERTY_UPONWITHDRAWALUSE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_UPONWITHDRAWALUSE
     * 
     */
    public void setUponWithdrawalUse(String uponWithdrawalUse) {
        set(PROPERTY_UPONWITHDRAWALUSE, uponWithdrawalUse);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_OUTUPONCLEARINGUSE
     * 
     */
    public String getOUTUponClearingUse() {
        return (String) get(PROPERTY_OUTUPONCLEARINGUSE);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_OUTUPONCLEARINGUSE
     * 
     */
    public void setOUTUponClearingUse(String oUTUponClearingUse) {
        set(PROPERTY_OUTUPONCLEARINGUSE, oUTUponClearingUse);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINISMULTICURRENCY
     * 
     */
    public Boolean isPayinIsMulticurrency() {
        return (Boolean) get(PROPERTY_PAYINISMULTICURRENCY);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYINISMULTICURRENCY
     * 
     */
    public void setPayinIsMulticurrency(Boolean payinIsMulticurrency) {
        set(PROPERTY_PAYINISMULTICURRENCY, payinIsMulticurrency);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTISMULTICURRENCY
     * 
     */
    public Boolean isPayoutIsMulticurrency() {
        return (Boolean) get(PROPERTY_PAYOUTISMULTICURRENCY);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTISMULTICURRENCY
     * 
     */
    public void setPayoutIsMulticurrency(Boolean payoutIsMulticurrency) {
        set(PROPERTY_PAYOUTISMULTICURRENCY, payoutIsMulticurrency);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYININVOICEPAIDSTATUS
     * 
     */
    public String getPayinInvoicepaidstatus() {
        return (String) get(PROPERTY_PAYININVOICEPAIDSTATUS);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYININVOICEPAIDSTATUS
     * 
     */
    public void setPayinInvoicepaidstatus(String payinInvoicepaidstatus) {
        set(PROPERTY_PAYININVOICEPAIDSTATUS, payinInvoicepaidstatus);
    }

    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTINVOICEPAIDSTATUS
     * 
     */
    public String getPayoutInvoicepaidstatus() {
        return (String) get(PROPERTY_PAYOUTINVOICEPAIDSTATUS);
    }
    /**
     * @see FinAccPaymentMethod#PROPERTY_PAYOUTINVOICEPAIDSTATUS
     * 
     */
    public void setPayoutInvoicepaidstatus(String payoutInvoicepaidstatus) {
        set(PROPERTY_PAYOUTINVOICEPAIDSTATUS, payoutInvoicepaidstatus);
    }

}
