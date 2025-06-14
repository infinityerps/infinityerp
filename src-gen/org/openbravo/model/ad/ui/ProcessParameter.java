
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
package org.openbravo.model.ad.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.domain.Reference;
import org.openbravo.model.ad.domain.Validation;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADProcessParameter (stored in table AD_Process_Para).
 * <br>
 * Help: {@literal The Report Parameter table defines any parameters required to execute a report or
     *       process.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessParameter extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Process_Para";
    public static final String ENTITY_NAME = "ADProcessParameter";

    /**
     * Property id stored in column AD_Process_Para_ID in table AD_Process_Para<br>
     * Help: {@literal Process Parameter identifies the parameters of a process or report.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Process_Para 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Process_Para 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Process_Para 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Process_Para 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Process_Para 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Process_Para<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Process_Para<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property process stored in column AD_Process_ID in table AD_Process_Para<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property sequenceNumber stored in column SeqNo in table AD_Process_Para<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property reference stored in column AD_Reference_ID in table AD_Process_Para<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property referenceSearchKey stored in column AD_Reference_Value_ID in table AD_Process_Para<br>
     * Help: {@literal The Reference Value indicates where the reference values are stored.  It must be specified
     *       if the data type is Table or List.}
     * 
     */
    public static final String PROPERTY_REFERENCESEARCHKEY = "referenceSearchKey";

    /**
     * Property validation stored in column AD_Val_Rule_ID in table AD_Process_Para<br>
     * Help: {@literal The Validation Rule indicates a unique validation rule.  These rules define how an entry
     *       is determined to valid or invalid.}
     * 
     */
    public static final String PROPERTY_VALIDATION = "validation";

    /**
     * Property dBColumnName stored in column ColumnName in table AD_Process_Para<br>
     * Help: {@literal The Column Name indicates the name of a column on a table as defined in the database.}
     * 
     */
    public static final String PROPERTY_DBCOLUMNNAME = "dBColumnName";

    /**
     * Property centralMaintenance stored in column IsCentrallyMaintained in table AD_Process_Para<br>
     * Help: {@literal The Centrally Maintained checkbox indicates if the Name, Description and Help maintained
     *       in 'System Element' table  or 'Window' table.}
     * 
     */
    public static final String PROPERTY_CENTRALMAINTENANCE = "centralMaintenance";

    /**
     * Property length stored in column FieldLength in table AD_Process_Para<br>
     * Help: {@literal The Length indicates the length of a column as defined in the database.}
     * 
     */
    public static final String PROPERTY_LENGTH = "length";

    /**
     * Property mandatory stored in column IsMandatory in table AD_Process_Para<br>
     * Help: {@literal The Mandatory checkbox indicates if the field is required for a record to be save to the
     *       database.}
     * 
     */
    public static final String PROPERTY_MANDATORY = "mandatory";

    /**
     * Property range stored in column IsRange in table AD_Process_Para<br>
     * Help: {@literal The Range checkbox indicates that this parameter is a range of values.}
     * 
     */
    public static final String PROPERTY_RANGE = "range";

    /**
     * Property defaultValue stored in column DefaultValue in table AD_Process_Para<br>
     * Help: The defaults are evaluated in the order of definition, the first not null value becomes the default
     *       value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b)
     *       Variables - in format &#64;Variable&#64; - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting
     *       Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values
     *       (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag:
     *       &#64;SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There
     *       can be no other value other than the SQL statement. The default is only evaluated, if no user
     *       preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as
     *       well as Buttons.
     * 
     */
    public static final String PROPERTY_DEFAULTVALUE = "defaultValue";

    /**
     * Property defaultLogic2 stored in column DefaultValue2 in table AD_Process_Para<br>
     * Help: The defaults are evaluated in the order of definition, the first not null value becomes the default
     *       value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b)
     *       Variables - in format &#64;Variable&#64; - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting
     *       Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values
     *       (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag:
     *       &#64;SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There
     *       can be no other value other than the SQL statement. The default is only evaluated, if no user
     *       preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as
     *       well as Buttons.
     * 
     */
    public static final String PROPERTY_DEFAULTLOGIC2 = "defaultLogic2";

    /**
     * Property valueFormat stored in column VFormat in table AD_Process_Para<br>
     * Help: {@literal Value Format is the format the value will be displayed with.}
     * 
     */
    public static final String PROPERTY_VALUEFORMAT = "valueFormat";

    /**
     * Property minValue stored in column ValueMin in table AD_Process_Para<br>
     * Help: {@literal The Minimum Value indicates the lowest  allowable value for a field.}
     * 
     */
    public static final String PROPERTY_MINVALUE = "minValue";

    /**
     * Property maxValue stored in column ValueMax in table AD_Process_Para<br>
     * Help: {@literal The Maximum Value indicates the highest allowable value for a field}
     * 
     */
    public static final String PROPERTY_MAXVALUE = "maxValue";

    /**
     * Property applicationElement stored in column AD_Element_ID in table AD_Process_Para<br>
     * Help: {@literal The System Element allows for the central maintenance of help, descriptions and
     *       terminology for a database column.}
     * 
     */
    public static final String PROPERTY_APPLICATIONELEMENT = "applicationElement";

    /**
     * Property aDProcessParameterTrlList stored in table AD_Process_Para
     * 
     */
    public static final String PROPERTY_ADPROCESSPARAMETERTRLLIST = "aDProcessParameterTrlList";


    public ProcessParameter() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CENTRALMAINTENANCE, true);
        setDefaultValue(PROPERTY_MANDATORY, false);
        setDefaultValue(PROPERTY_RANGE, false);
        setDefaultValue(PROPERTY_ADPROCESSPARAMETERTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessParameter#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessParameter#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessParameter#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessParameter#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessParameter#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessParameter#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessParameter#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessParameter#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessParameter#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessParameter#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessParameter#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessParameter#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessParameter#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessParameter#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessParameter#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessParameter#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessParameter#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProcessParameter#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProcessParameter#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProcessParameter#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProcessParameter#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see ProcessParameter#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see ProcessParameter#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see ProcessParameter#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see ProcessParameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ProcessParameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ProcessParameter#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see ProcessParameter#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see ProcessParameter#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public Reference getReferenceSearchKey() {
        return (Reference) get(PROPERTY_REFERENCESEARCHKEY);
    }
    /**
     * @see ProcessParameter#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public void setReferenceSearchKey(Reference referenceSearchKey) {
        set(PROPERTY_REFERENCESEARCHKEY, referenceSearchKey);
    }

    /**
     * @see ProcessParameter#PROPERTY_VALIDATION
     * 
     */
    public Validation getValidation() {
        return (Validation) get(PROPERTY_VALIDATION);
    }
    /**
     * @see ProcessParameter#PROPERTY_VALIDATION
     * 
     */
    public void setValidation(Validation validation) {
        set(PROPERTY_VALIDATION, validation);
    }

    /**
     * @see ProcessParameter#PROPERTY_DBCOLUMNNAME
     * 
     */
    public String getDBColumnName() {
        return (String) get(PROPERTY_DBCOLUMNNAME);
    }
    /**
     * @see ProcessParameter#PROPERTY_DBCOLUMNNAME
     * 
     */
    public void setDBColumnName(String dBColumnName) {
        set(PROPERTY_DBCOLUMNNAME, dBColumnName);
    }

    /**
     * @see ProcessParameter#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public Boolean isCentralMaintenance() {
        return (Boolean) get(PROPERTY_CENTRALMAINTENANCE);
    }
    /**
     * @see ProcessParameter#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public void setCentralMaintenance(Boolean centralMaintenance) {
        set(PROPERTY_CENTRALMAINTENANCE, centralMaintenance);
    }

    /**
     * @see ProcessParameter#PROPERTY_LENGTH
     * 
     */
    public Long getLength() {
        return (Long) get(PROPERTY_LENGTH);
    }
    /**
     * @see ProcessParameter#PROPERTY_LENGTH
     * 
     */
    public void setLength(Long length) {
        set(PROPERTY_LENGTH, length);
    }

    /**
     * @see ProcessParameter#PROPERTY_MANDATORY
     * 
     */
    public Boolean isMandatory() {
        return (Boolean) get(PROPERTY_MANDATORY);
    }
    /**
     * @see ProcessParameter#PROPERTY_MANDATORY
     * 
     */
    public void setMandatory(Boolean mandatory) {
        set(PROPERTY_MANDATORY, mandatory);
    }

    /**
     * @see ProcessParameter#PROPERTY_RANGE
     * 
     */
    public Boolean isRange() {
        return (Boolean) get(PROPERTY_RANGE);
    }
    /**
     * @see ProcessParameter#PROPERTY_RANGE
     * 
     */
    public void setRange(Boolean range) {
        set(PROPERTY_RANGE, range);
    }

    /**
     * @see ProcessParameter#PROPERTY_DEFAULTVALUE
     * 
     */
    public String getDefaultValue() {
        return (String) get(PROPERTY_DEFAULTVALUE);
    }
    /**
     * @see ProcessParameter#PROPERTY_DEFAULTVALUE
     * 
     */
    public void setDefaultValue(String defaultValue) {
        set(PROPERTY_DEFAULTVALUE, defaultValue);
    }

    /**
     * @see ProcessParameter#PROPERTY_DEFAULTLOGIC2
     * 
     */
    public String getDefaultLogic2() {
        return (String) get(PROPERTY_DEFAULTLOGIC2);
    }
    /**
     * @see ProcessParameter#PROPERTY_DEFAULTLOGIC2
     * 
     */
    public void setDefaultLogic2(String defaultLogic2) {
        set(PROPERTY_DEFAULTLOGIC2, defaultLogic2);
    }

    /**
     * @see ProcessParameter#PROPERTY_VALUEFORMAT
     * 
     */
    public String getValueFormat() {
        return (String) get(PROPERTY_VALUEFORMAT);
    }
    /**
     * @see ProcessParameter#PROPERTY_VALUEFORMAT
     * 
     */
    public void setValueFormat(String valueFormat) {
        set(PROPERTY_VALUEFORMAT, valueFormat);
    }

    /**
     * @see ProcessParameter#PROPERTY_MINVALUE
     * 
     */
    public String getMinValue() {
        return (String) get(PROPERTY_MINVALUE);
    }
    /**
     * @see ProcessParameter#PROPERTY_MINVALUE
     * 
     */
    public void setMinValue(String minValue) {
        set(PROPERTY_MINVALUE, minValue);
    }

    /**
     * @see ProcessParameter#PROPERTY_MAXVALUE
     * 
     */
    public String getMaxValue() {
        return (String) get(PROPERTY_MAXVALUE);
    }
    /**
     * @see ProcessParameter#PROPERTY_MAXVALUE
     * 
     */
    public void setMaxValue(String maxValue) {
        set(PROPERTY_MAXVALUE, maxValue);
    }

    /**
     * @see ProcessParameter#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public Element getApplicationElement() {
        return (Element) get(PROPERTY_APPLICATIONELEMENT);
    }
    /**
     * @see ProcessParameter#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public void setApplicationElement(Element applicationElement) {
        set(PROPERTY_APPLICATIONELEMENT, applicationElement);
    }

    /**
     * Help: {@literal Shows parameter tab translation for several languages}<br>
     * @see ProcessParameterTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProcessParameterTrl> getADProcessParameterTrlList() {
      return (List<ProcessParameterTrl>) get(PROPERTY_ADPROCESSPARAMETERTRLLIST);
    }

    /**
     * Help: {@literal Shows parameter tab translation for several languages}<br>
     * @see ProcessParameterTrl
     * 
     */
    public void setADProcessParameterTrlList(List<ProcessParameterTrl> aDProcessParameterTrlList) {
        set(PROPERTY_ADPROCESSPARAMETERTRLLIST, aDProcessParameterTrlList);
    }

}
