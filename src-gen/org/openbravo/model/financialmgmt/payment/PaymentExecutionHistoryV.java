
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
 * Entity class for entity FinancialMgmtPaymentExecutionHistoryV (stored in table FIN_Payment_Exec_History_V).
 * <br>
 * Help: {@literal Shows information about all the execution attempts of the selected payments.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PaymentExecutionHistoryV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Exec_History_V";
    public static final String ENTITY_NAME = "FinancialMgmtPaymentExecutionHistoryV";

    /**
     * Property id stored in column FIN_Payment_Exec_History_V_ID in table FIN_Payment_Exec_History_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property payment stored in column FIN_Payment_ID in table FIN_Payment_Exec_History_V<br>
     * Help: {@literal Payment In event}
     * 
     */
    public static final String PROPERTY_PAYMENT = "payment";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Exec_History_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Exec_History_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Exec_History_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Exec_History_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Exec_History_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Exec_History_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Exec_History_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property executionDate stored in column Executiondate in table FIN_Payment_Exec_History_V
     * 
     */
    public static final String PROPERTY_EXECUTIONDATE = "executionDate";

    /**
     * Property paymentRun stored in column FIN_Payment_Run_ID in table FIN_Payment_Exec_History_V<br>
     * Help: {@literal Identifies each run of an Execution Process}
     * 
     */
    public static final String PROPERTY_PAYMENTRUN = "paymentRun";

    /**
     * Property paymentRunMessage stored in column Prun_Message in table FIN_Payment_Exec_History_V
     * 
     */
    public static final String PROPERTY_PAYMENTRUNMESSAGE = "paymentRunMessage";

    /**
     * Property paymentRunStatus stored in column Prun_Status in table FIN_Payment_Exec_History_V
     * 
     */
    public static final String PROPERTY_PAYMENTRUNSTATUS = "paymentRunStatus";

    /**
     * Property sourceOfTheExecution stored in column Prun_Source in table FIN_Payment_Exec_History_V<br>
     * Help: {@literal Defines the source that has caused the Execution Process run.}
     * 
     */
    public static final String PROPERTY_SOURCEOFTHEEXECUTION = "sourceOfTheExecution";

    /**
     * Property paymentExecutionResult stored in column Paymentexec_Result in table FIN_Payment_Exec_History_V
     * 
     */
    public static final String PROPERTY_PAYMENTEXECUTIONRESULT = "paymentExecutionResult";

    /**
     * Property paymentExecutionMessage stored in column Paymentexec_Message in table FIN_Payment_Exec_History_V
     * 
     */
    public static final String PROPERTY_PAYMENTEXECUTIONMESSAGE = "paymentExecutionMessage";


    public PaymentExecutionHistoryV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENT
     * 
     */
    public FIN_Payment getPayment() {
        return (FIN_Payment) get(PROPERTY_PAYMENT);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENT
     * 
     */
    public void setPayment(FIN_Payment payment) {
        set(PROPERTY_PAYMENT, payment);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_EXECUTIONDATE
     * 
     */
    public Date getExecutionDate() {
        return (Date) get(PROPERTY_EXECUTIONDATE);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_EXECUTIONDATE
     * 
     */
    public void setExecutionDate(Date executionDate) {
        set(PROPERTY_EXECUTIONDATE, executionDate);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTRUN
     * 
     */
    public PaymentRun getPaymentRun() {
        return (PaymentRun) get(PROPERTY_PAYMENTRUN);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTRUN
     * 
     */
    public void setPaymentRun(PaymentRun paymentRun) {
        set(PROPERTY_PAYMENTRUN, paymentRun);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTRUNMESSAGE
     * 
     */
    public String getPaymentRunMessage() {
        return (String) get(PROPERTY_PAYMENTRUNMESSAGE);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTRUNMESSAGE
     * 
     */
    public void setPaymentRunMessage(String paymentRunMessage) {
        set(PROPERTY_PAYMENTRUNMESSAGE, paymentRunMessage);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTRUNSTATUS
     * 
     */
    public String getPaymentRunStatus() {
        return (String) get(PROPERTY_PAYMENTRUNSTATUS);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTRUNSTATUS
     * 
     */
    public void setPaymentRunStatus(String paymentRunStatus) {
        set(PROPERTY_PAYMENTRUNSTATUS, paymentRunStatus);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_SOURCEOFTHEEXECUTION
     * 
     */
    public String getSourceOfTheExecution() {
        return (String) get(PROPERTY_SOURCEOFTHEEXECUTION);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_SOURCEOFTHEEXECUTION
     * 
     */
    public void setSourceOfTheExecution(String sourceOfTheExecution) {
        set(PROPERTY_SOURCEOFTHEEXECUTION, sourceOfTheExecution);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTEXECUTIONRESULT
     * 
     */
    public String getPaymentExecutionResult() {
        return (String) get(PROPERTY_PAYMENTEXECUTIONRESULT);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTEXECUTIONRESULT
     * 
     */
    public void setPaymentExecutionResult(String paymentExecutionResult) {
        set(PROPERTY_PAYMENTEXECUTIONRESULT, paymentExecutionResult);
    }

    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTEXECUTIONMESSAGE
     * 
     */
    public String getPaymentExecutionMessage() {
        return (String) get(PROPERTY_PAYMENTEXECUTIONMESSAGE);
    }
    /**
     * @see PaymentExecutionHistoryV#PROPERTY_PAYMENTEXECUTIONMESSAGE
     * 
     */
    public void setPaymentExecutionMessage(String paymentExecutionMessage) {
        set(PROPERTY_PAYMENTEXECUTIONMESSAGE, paymentExecutionMessage);
    }

}
