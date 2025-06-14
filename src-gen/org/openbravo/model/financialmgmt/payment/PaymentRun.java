
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
/**
 * Entity class for entity FinancialMgmtPaymentRun (stored in table FIN_Payment_Run).
 * <br>
 * Help: {@literal Table where are stored of the executions of the Execution Process.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PaymentRun extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Run";
    public static final String ENTITY_NAME = "FinancialMgmtPaymentRun";

    /**
     * Property id stored in column FIN_Payment_Run_ID in table FIN_Payment_Run<br>
     * Help: {@literal Identifies each run of an Execution Process}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Run 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Run 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Run 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property status stored in column Status in table FIN_Payment_Run 
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property sourceOfTheExecution stored in column Run_Source in table FIN_Payment_Run<br>
     * Help: {@literal Defines the source that has caused the Execution Process run.}
     * 
     */
    public static final String PROPERTY_SOURCEOFTHEEXECUTION = "sourceOfTheExecution";

    /**
     * Property message stored in column Message in table FIN_Payment_Run<br>
     * Help: {@literal Output message}
     * 
     */
    public static final String PROPERTY_MESSAGE = "message";

    /**
     * Property paymentExecutionProcess stored in column FIN_Pay_Exec_Process_ID in table FIN_Payment_Run<br>
     * Help: {@literal Defines the Process to execute payments.}
     * 
     */
    public static final String PROPERTY_PAYMENTEXECUTIONPROCESS = "paymentExecutionProcess";

    /**
     * Property financialMgmtPaymentRunParameterList stored in table FIN_Payment_Run
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTPAYMENTRUNPARAMETERLIST = "financialMgmtPaymentRunParameterList";

    /**
     * Property financialMgmtPaymentRunPaymentList stored in table FIN_Payment_Run
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST = "financialMgmtPaymentRunPaymentList";


    public PaymentRun() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SOURCEOFTHEEXECUTION, "OTHER");
        setDefaultValue(PROPERTY_FINANCIALMGMTPAYMENTRUNPARAMETERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PaymentRun#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PaymentRun#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PaymentRun#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PaymentRun#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PaymentRun#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PaymentRun#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PaymentRun#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PaymentRun#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PaymentRun#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PaymentRun#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PaymentRun#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PaymentRun#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PaymentRun#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PaymentRun#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PaymentRun#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PaymentRun#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PaymentRun#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see PaymentRun#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see PaymentRun#PROPERTY_SOURCEOFTHEEXECUTION
     * 
     */
    public String getSourceOfTheExecution() {
        return (String) get(PROPERTY_SOURCEOFTHEEXECUTION);
    }
    /**
     * @see PaymentRun#PROPERTY_SOURCEOFTHEEXECUTION
     * 
     */
    public void setSourceOfTheExecution(String sourceOfTheExecution) {
        set(PROPERTY_SOURCEOFTHEEXECUTION, sourceOfTheExecution);
    }

    /**
     * @see PaymentRun#PROPERTY_MESSAGE
     * 
     */
    public String getMessage() {
        return (String) get(PROPERTY_MESSAGE);
    }
    /**
     * @see PaymentRun#PROPERTY_MESSAGE
     * 
     */
    public void setMessage(String message) {
        set(PROPERTY_MESSAGE, message);
    }

    /**
     * @see PaymentRun#PROPERTY_PAYMENTEXECUTIONPROCESS
     * 
     */
    public PaymentExecutionProcess getPaymentExecutionProcess() {
        return (PaymentExecutionProcess) get(PROPERTY_PAYMENTEXECUTIONPROCESS);
    }
    /**
     * @see PaymentRun#PROPERTY_PAYMENTEXECUTIONPROCESS
     * 
     */
    public void setPaymentExecutionProcess(PaymentExecutionProcess paymentExecutionProcess) {
        set(PROPERTY_PAYMENTEXECUTIONPROCESS, paymentExecutionProcess);
    }

    /**
     * Help: {@literal Table with the used values of the Execution Process parameters.}<br>
     * @see PaymentRunParameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PaymentRunParameter> getFinancialMgmtPaymentRunParameterList() {
      return (List<PaymentRunParameter>) get(PROPERTY_FINANCIALMGMTPAYMENTRUNPARAMETERLIST);
    }

    /**
     * Help: {@literal Table with the used values of the Execution Process parameters.}<br>
     * @see PaymentRunParameter
     * 
     */
    public void setFinancialMgmtPaymentRunParameterList(List<PaymentRunParameter> financialMgmtPaymentRunParameterList) {
        set(PROPERTY_FINANCIALMGMTPAYMENTRUNPARAMETERLIST, financialMgmtPaymentRunParameterList);
    }

    /**
     * Help: {@literal Table to store the Payments included on each Payment Run.}<br>
     * @see PaymentRunPayment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PaymentRunPayment> getFinancialMgmtPaymentRunPaymentList() {
      return (List<PaymentRunPayment>) get(PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST);
    }

    /**
     * Help: {@literal Table to store the Payments included on each Payment Run.}<br>
     * @see PaymentRunPayment
     * 
     */
    public void setFinancialMgmtPaymentRunPaymentList(List<PaymentRunPayment> financialMgmtPaymentRunPaymentList) {
        set(PROPERTY_FINANCIALMGMTPAYMENTRUNPAYMENTLIST, financialMgmtPaymentRunPaymentList);
    }

}
