
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
package org.openbravo.client.application;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.myob.WidgetInstance;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Attachment;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_ParameterValue (stored in table OBUIAPP_Parameter_Value).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ParameterValue extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_Parameter_Value";
    public static final String ENTITY_NAME = "OBUIAPP_ParameterValue";

    /**
     * Property id stored in column Obuiapp_Parameter_Value_ID in table OBUIAPP_Parameter_Value 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_Parameter_Value 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_Parameter_Value 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_Parameter_Value 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_Parameter_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_Parameter_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_Parameter_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_Parameter_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property parameter stored in column Obuiapp_Parameter_ID in table OBUIAPP_Parameter_Value
     * 
     */
    public static final String PROPERTY_PARAMETER = "parameter";

    /**
     * Property valueString stored in column Value_String in table OBUIAPP_Parameter_Value 
     * 
     */
    public static final String PROPERTY_VALUESTRING = "valueString";

    /**
     * Property valueNumber stored in column Value_Number in table OBUIAPP_Parameter_Value 
     * 
     */
    public static final String PROPERTY_VALUENUMBER = "valueNumber";

    /**
     * Property valueDate stored in column Value_Date in table OBUIAPP_Parameter_Value 
     * 
     */
    public static final String PROPERTY_VALUEDATE = "valueDate";

    /**
     * Property obkmoWidgetInstance stored in column EM_Obkmo_Widget_Instance_ID in table OBUIAPP_Parameter_Value<br>
     * Help: {@literal Defines an instance of a widget class.}
     * 
     */
    public static final String PROPERTY_OBKMOWIDGETINSTANCE = "obkmoWidgetInstance";

    /**
     * Property file stored in column C_File_ID in table OBUIAPP_Parameter_Value<br>
     * Help: {@literal Attached file}
     * 
     */
    public static final String PROPERTY_FILE = "file";

    /**
     * Property valueKey stored in column ATT_Value_Key in table OBUIAPP_Parameter_Value<br>
     * Help: {@literal Column to store ID values of Foreign Key parameters and Search Key of List parameters.}
     * 
     */
    public static final String PROPERTY_VALUEKEY = "valueKey";


    public ParameterValue() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ParameterValue#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ParameterValue#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ParameterValue#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ParameterValue#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ParameterValue#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ParameterValue#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ParameterValue#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ParameterValue#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ParameterValue#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ParameterValue#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ParameterValue#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ParameterValue#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ParameterValue#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ParameterValue#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ParameterValue#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ParameterValue#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ParameterValue#PROPERTY_PARAMETER
     * 
     */
    public Parameter getParameter() {
        return (Parameter) get(PROPERTY_PARAMETER);
    }
    /**
     * @see ParameterValue#PROPERTY_PARAMETER
     * 
     */
    public void setParameter(Parameter parameter) {
        set(PROPERTY_PARAMETER, parameter);
    }

    /**
     * @see ParameterValue#PROPERTY_VALUESTRING
     * 
     */
    public String getValueString() {
        return (String) get(PROPERTY_VALUESTRING);
    }
    /**
     * @see ParameterValue#PROPERTY_VALUESTRING
     * 
     */
    public void setValueString(String valueString) {
        set(PROPERTY_VALUESTRING, valueString);
    }

    /**
     * @see ParameterValue#PROPERTY_VALUENUMBER
     * 
     */
    public BigDecimal getValueNumber() {
        return (BigDecimal) get(PROPERTY_VALUENUMBER);
    }
    /**
     * @see ParameterValue#PROPERTY_VALUENUMBER
     * 
     */
    public void setValueNumber(BigDecimal valueNumber) {
        set(PROPERTY_VALUENUMBER, valueNumber);
    }

    /**
     * @see ParameterValue#PROPERTY_VALUEDATE
     * 
     */
    public Date getValueDate() {
        return (Date) get(PROPERTY_VALUEDATE);
    }
    /**
     * @see ParameterValue#PROPERTY_VALUEDATE
     * 
     */
    public void setValueDate(Date valueDate) {
        set(PROPERTY_VALUEDATE, valueDate);
    }

    /**
     * @see ParameterValue#PROPERTY_OBKMOWIDGETINSTANCE
     * 
     */
    public WidgetInstance getObkmoWidgetInstance() {
        return (WidgetInstance) get(PROPERTY_OBKMOWIDGETINSTANCE);
    }
    /**
     * @see ParameterValue#PROPERTY_OBKMOWIDGETINSTANCE
     * 
     */
    public void setObkmoWidgetInstance(WidgetInstance obkmoWidgetInstance) {
        set(PROPERTY_OBKMOWIDGETINSTANCE, obkmoWidgetInstance);
    }

    /**
     * @see ParameterValue#PROPERTY_FILE
     * 
     */
    public Attachment getFile() {
        return (Attachment) get(PROPERTY_FILE);
    }
    /**
     * @see ParameterValue#PROPERTY_FILE
     * 
     */
    public void setFile(Attachment file) {
        set(PROPERTY_FILE, file);
    }

    /**
     * @see ParameterValue#PROPERTY_VALUEKEY
     * 
     */
    public String getValueKey() {
        return (String) get(PROPERTY_VALUEKEY);
    }
    /**
     * @see ParameterValue#PROPERTY_VALUEKEY
     * 
     */
    public void setValueKey(String valueKey) {
        set(PROPERTY_VALUEKEY, valueKey);
    }

}
