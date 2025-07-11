
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
 * Entity class for entity FinancialMgmtPaymentRunParameter (stored in table FIN_Payment_Run_Para).
 * <br>
 * Help: {@literal Table with the used values of the Execution Process parameters.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PaymentRunParameter extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Run_Para";
    public static final String ENTITY_NAME = "FinancialMgmtPaymentRunParameter";

    /**
     * Property id stored in column FIN_Payment_Run_Para_ID in table FIN_Payment_Run_Para 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Run_Para 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Run_Para 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Run_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Run_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Run_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Run_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Run_Para 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property paymentRun stored in column FIN_Payment_Run_ID in table FIN_Payment_Run_Para<br>
     * Help: {@literal Identifies each run of an Execution Process}
     * 
     */
    public static final String PROPERTY_PAYMENTRUN = "paymentRun";

    /**
     * Property paymentExecutionProcessParameter stored in column FIN_Pay_Exec_Process_Para_ID in table FIN_Payment_Run_Para<br>
     * Help: {@literal Parameter to use by the Payment Execution Process}
     * 
     */
    public static final String PROPERTY_PAYMENTEXECUTIONPROCESSPARAMETER = "paymentExecutionProcessParameter";

    /**
     * Property valueOfTheCheck stored in column Valuecheck in table FIN_Payment_Run_Para 
     * 
     */
    public static final String PROPERTY_VALUEOFTHECHECK = "valueOfTheCheck";

    /**
     * Property valueOfTheTextParameter stored in column Valuetext in table FIN_Payment_Run_Para 
     * 
     */
    public static final String PROPERTY_VALUEOFTHETEXTPARAMETER = "valueOfTheTextParameter";


    public PaymentRunParameter() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_VALUEOFTHECHECK, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PaymentRunParameter#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_PAYMENTRUN
     * 
     */
    public PaymentRun getPaymentRun() {
        return (PaymentRun) get(PROPERTY_PAYMENTRUN);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_PAYMENTRUN
     * 
     */
    public void setPaymentRun(PaymentRun paymentRun) {
        set(PROPERTY_PAYMENTRUN, paymentRun);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_PAYMENTEXECUTIONPROCESSPARAMETER
     * 
     */
    public PaymentExecutionProcessParameter getPaymentExecutionProcessParameter() {
        return (PaymentExecutionProcessParameter) get(PROPERTY_PAYMENTEXECUTIONPROCESSPARAMETER);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_PAYMENTEXECUTIONPROCESSPARAMETER
     * 
     */
    public void setPaymentExecutionProcessParameter(PaymentExecutionProcessParameter paymentExecutionProcessParameter) {
        set(PROPERTY_PAYMENTEXECUTIONPROCESSPARAMETER, paymentExecutionProcessParameter);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_VALUEOFTHECHECK
     * 
     */
    public Boolean isValueOfTheCheck() {
        return (Boolean) get(PROPERTY_VALUEOFTHECHECK);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_VALUEOFTHECHECK
     * 
     */
    public void setValueOfTheCheck(Boolean valueOfTheCheck) {
        set(PROPERTY_VALUEOFTHECHECK, valueOfTheCheck);
    }

    /**
     * @see PaymentRunParameter#PROPERTY_VALUEOFTHETEXTPARAMETER
     * 
     */
    public String getValueOfTheTextParameter() {
        return (String) get(PROPERTY_VALUEOFTHETEXTPARAMETER);
    }
    /**
     * @see PaymentRunParameter#PROPERTY_VALUEOFTHETEXTPARAMETER
     * 
     */
    public void setValueOfTheTextParameter(String valueOfTheTextParameter) {
        set(PROPERTY_VALUEOFTHETEXTPARAMETER, valueOfTheTextParameter);
    }

}
