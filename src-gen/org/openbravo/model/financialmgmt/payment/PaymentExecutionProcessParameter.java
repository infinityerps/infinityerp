
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
 * Entity class for entity FinancialMgmtPaymentExecutionProcessParameter (stored in table FIN_Pay_Exec_Process_Para).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PaymentExecutionProcessParameter extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Pay_Exec_Process_Para";
    public static final String ENTITY_NAME = "FinancialMgmtPaymentExecutionProcessParameter";

    /**
     * Property id stored in column FIN_Pay_Exec_Process_Para_ID in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal Parameter to use by the Payment Execution Process}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Pay_Exec_Process_Para 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Pay_Exec_Process_Para 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Pay_Exec_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Pay_Exec_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Pay_Exec_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Pay_Exec_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Pay_Exec_Process_Para 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property paymentExecutionProcess stored in column FIN_Pay_Exec_Process_ID in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal Defines the Process to execute payments.}
     * 
     */
    public static final String PROPERTY_PAYMENTEXECUTIONPROCESS = "paymentExecutionProcess";

    /**
     * Property name stored in column Name in table FIN_Pay_Exec_Process_Para 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property sequenceNumber stored in column Seqno in table FIN_Pay_Exec_Process_Para 
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property inputType stored in column Inputtype in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal Defines the Input type of the In type parameter.}
     * 
     */
    public static final String PROPERTY_INPUTTYPE = "inputType";

    /**
     * Property mandatory stored in column Ismandatory in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal The Mandatory checkbox indicates if the field is required for a record to be save to the
     *       database.}
     * 
     */
    public static final String PROPERTY_MANDATORY = "mandatory";

    /**
     * Property defaultValueForFlag stored in column Defaultcheck in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal Checkbox type parameters will be checked by default when this flag is checked.}
     * 
     */
    public static final String PROPERTY_DEFAULTVALUEFORFLAG = "defaultValueForFlag";

    /**
     * Property defaultTextValue stored in column Defaulttext in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal String that will be shown by default for Text type parameters.}
     * 
     */
    public static final String PROPERTY_DEFAULTTEXTVALUE = "defaultTextValue";

    /**
     * Property description stored in column Description in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property parameterType stored in column Parametertype in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal Defines the Execution Process Parameter type.}
     * 
     */
    public static final String PROPERTY_PARAMETERTYPE = "parameterType";

    /**
     * Property searchKey stored in column Value in table FIN_Pay_Exec_Process_Para<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";


    public PaymentExecutionProcessParameter() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_INPUTTYPE, "TEXT");
        setDefaultValue(PROPERTY_MANDATORY, false);
        setDefaultValue(PROPERTY_PARAMETERTYPE, "IN");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_PAYMENTEXECUTIONPROCESS
     * 
     */
    public PaymentExecutionProcess getPaymentExecutionProcess() {
        return (PaymentExecutionProcess) get(PROPERTY_PAYMENTEXECUTIONPROCESS);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_PAYMENTEXECUTIONPROCESS
     * 
     */
    public void setPaymentExecutionProcess(PaymentExecutionProcess paymentExecutionProcess) {
        set(PROPERTY_PAYMENTEXECUTIONPROCESS, paymentExecutionProcess);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_INPUTTYPE
     * 
     */
    public String getInputType() {
        return (String) get(PROPERTY_INPUTTYPE);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_INPUTTYPE
     * 
     */
    public void setInputType(String inputType) {
        set(PROPERTY_INPUTTYPE, inputType);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_MANDATORY
     * 
     */
    public Boolean isMandatory() {
        return (Boolean) get(PROPERTY_MANDATORY);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_MANDATORY
     * 
     */
    public void setMandatory(Boolean mandatory) {
        set(PROPERTY_MANDATORY, mandatory);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_DEFAULTVALUEFORFLAG
     * 
     */
    public String getDefaultValueForFlag() {
        return (String) get(PROPERTY_DEFAULTVALUEFORFLAG);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_DEFAULTVALUEFORFLAG
     * 
     */
    public void setDefaultValueForFlag(String defaultValueForFlag) {
        set(PROPERTY_DEFAULTVALUEFORFLAG, defaultValueForFlag);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_DEFAULTTEXTVALUE
     * 
     */
    public String getDefaultTextValue() {
        return (String) get(PROPERTY_DEFAULTTEXTVALUE);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_DEFAULTTEXTVALUE
     * 
     */
    public void setDefaultTextValue(String defaultTextValue) {
        set(PROPERTY_DEFAULTTEXTVALUE, defaultTextValue);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_PARAMETERTYPE
     * 
     */
    public String getParameterType() {
        return (String) get(PROPERTY_PARAMETERTYPE);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_PARAMETERTYPE
     * 
     */
    public void setParameterType(String parameterType) {
        set(PROPERTY_PARAMETERTYPE, parameterType);
    }

    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see PaymentExecutionProcessParameter#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

}
