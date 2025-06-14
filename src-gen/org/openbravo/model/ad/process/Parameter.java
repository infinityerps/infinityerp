
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
package org.openbravo.model.ad.process;

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
/**
 * Entity class for entity ADParameter (stored in table AD_PInstance_Para).
 * <br>
 * Help: {@literal Process Instance Parameter contains the values of the parameters that are passed to a
     *       process instance.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Parameter extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_PInstance_Para";
    public static final String ENTITY_NAME = "ADParameter";

    /**
     * Property id stored in column AD_PInstance_Para_ID in table AD_PInstance_Para 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property processInstance stored in column AD_PInstance_ID in table AD_PInstance_Para<br>
     * Help: {@literal Process Instance identifies the instance of a process. Every time a process is executed a
     *       new instance of it is created.}
     * 
     */
    public static final String PROPERTY_PROCESSINSTANCE = "processInstance";

    /**
     * Property sequenceNumber stored in column SeqNo in table AD_PInstance_Para<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property parameterName stored in column ParameterName in table AD_PInstance_Para 
     * 
     */
    public static final String PROPERTY_PARAMETERNAME = "parameterName";

    /**
     * Property string stored in column P_String in table AD_PInstance_Para<br>
     * Help: {@literal String passed as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_STRING = "string";

    /**
     * Property stringTo stored in column P_String_To in table AD_PInstance_Para<br>
     * Help: {@literal String passed as maximum string range to a process instance.}
     * 
     */
    public static final String PROPERTY_STRINGTO = "stringTo";

    /**
     * Property processNumber stored in column P_Number in table AD_PInstance_Para<br>
     * Help: {@literal Number passed as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSNUMBER = "processNumber";

    /**
     * Property processNumberTo stored in column P_Number_To in table AD_PInstance_Para<br>
     * Help: {@literal Number passed as maximum range as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSNUMBERTO = "processNumberTo";

    /**
     * Property processDate stored in column P_Date in table AD_PInstance_Para<br>
     * Help: {@literal Date passed as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSDATE = "processDate";

    /**
     * Property processDateTo stored in column P_Date_To in table AD_PInstance_Para<br>
     * Help: {@literal Date passed as maximum date as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSDATETO = "processDateTo";

    /**
     * Property comments stored in column Info in table AD_PInstance_Para<br>
     * Help: {@literal The Information displays data from the source document line.}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property infoTo stored in column Info_To in table AD_PInstance_Para<br>
     * Help: {@literal The Information displays data from the source document line.}
     * 
     */
    public static final String PROPERTY_INFOTO = "infoTo";

    /**
     * Property client stored in column AD_Client_ID in table AD_PInstance_Para 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_PInstance_Para 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table AD_PInstance_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_PInstance_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_PInstance_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_PInstance_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column IsActive in table AD_PInstance_Para 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";


    public Parameter() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Parameter#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Parameter#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Parameter#PROPERTY_PROCESSINSTANCE
     * 
     */
    public ProcessInstance getProcessInstance() {
        return (ProcessInstance) get(PROPERTY_PROCESSINSTANCE);
    }
    /**
     * @see Parameter#PROPERTY_PROCESSINSTANCE
     * 
     */
    public void setProcessInstance(ProcessInstance processInstance) {
        set(PROPERTY_PROCESSINSTANCE, processInstance);
    }

    /**
     * @see Parameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public String getSequenceNumber() {
        return (String) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see Parameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(String sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see Parameter#PROPERTY_PARAMETERNAME
     * 
     */
    public String getParameterName() {
        return (String) get(PROPERTY_PARAMETERNAME);
    }
    /**
     * @see Parameter#PROPERTY_PARAMETERNAME
     * 
     */
    public void setParameterName(String parameterName) {
        set(PROPERTY_PARAMETERNAME, parameterName);
    }

    /**
     * @see Parameter#PROPERTY_STRING
     * 
     */
    public String getString() {
        return (String) get(PROPERTY_STRING);
    }
    /**
     * @see Parameter#PROPERTY_STRING
     * 
     */
    public void setString(String string) {
        set(PROPERTY_STRING, string);
    }

    /**
     * @see Parameter#PROPERTY_STRINGTO
     * 
     */
    public String getStringTo() {
        return (String) get(PROPERTY_STRINGTO);
    }
    /**
     * @see Parameter#PROPERTY_STRINGTO
     * 
     */
    public void setStringTo(String stringTo) {
        set(PROPERTY_STRINGTO, stringTo);
    }

    /**
     * @see Parameter#PROPERTY_PROCESSNUMBER
     * 
     */
    public BigDecimal getProcessNumber() {
        return (BigDecimal) get(PROPERTY_PROCESSNUMBER);
    }
    /**
     * @see Parameter#PROPERTY_PROCESSNUMBER
     * 
     */
    public void setProcessNumber(BigDecimal processNumber) {
        set(PROPERTY_PROCESSNUMBER, processNumber);
    }

    /**
     * @see Parameter#PROPERTY_PROCESSNUMBERTO
     * 
     */
    public BigDecimal getProcessNumberTo() {
        return (BigDecimal) get(PROPERTY_PROCESSNUMBERTO);
    }
    /**
     * @see Parameter#PROPERTY_PROCESSNUMBERTO
     * 
     */
    public void setProcessNumberTo(BigDecimal processNumberTo) {
        set(PROPERTY_PROCESSNUMBERTO, processNumberTo);
    }

    /**
     * @see Parameter#PROPERTY_PROCESSDATE
     * 
     */
    public Date getProcessDate() {
        return (Date) get(PROPERTY_PROCESSDATE);
    }
    /**
     * @see Parameter#PROPERTY_PROCESSDATE
     * 
     */
    public void setProcessDate(Date processDate) {
        set(PROPERTY_PROCESSDATE, processDate);
    }

    /**
     * @see Parameter#PROPERTY_PROCESSDATETO
     * 
     */
    public Date getProcessDateTo() {
        return (Date) get(PROPERTY_PROCESSDATETO);
    }
    /**
     * @see Parameter#PROPERTY_PROCESSDATETO
     * 
     */
    public void setProcessDateTo(Date processDateTo) {
        set(PROPERTY_PROCESSDATETO, processDateTo);
    }

    /**
     * @see Parameter#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see Parameter#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see Parameter#PROPERTY_INFOTO
     * 
     */
    public String getInfoTo() {
        return (String) get(PROPERTY_INFOTO);
    }
    /**
     * @see Parameter#PROPERTY_INFOTO
     * 
     */
    public void setInfoTo(String infoTo) {
        set(PROPERTY_INFOTO, infoTo);
    }

    /**
     * @see Parameter#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Parameter#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Parameter#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Parameter#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Parameter#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Parameter#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Parameter#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Parameter#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Parameter#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Parameter#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Parameter#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Parameter#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Parameter#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Parameter#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

}
