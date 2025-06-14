
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.myob.WidgetClass;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.domain.Reference;
import org.openbravo.model.ad.domain.Validation;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Element;
import org.openbravo.model.ad.ui.FieldGroup;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.ad.utility.AttachmentMethod;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_Parameter (stored in table OBUIAPP_Parameter).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Parameter extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_Parameter";
    public static final String ENTITY_NAME = "OBUIAPP_Parameter";

    /**
     * Property id stored in column Obuiapp_Parameter_ID in table OBUIAPP_Parameter
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_Parameter 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_Parameter 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_Parameter 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_Parameter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_Parameter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_Parameter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_Parameter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property module stored in column AD_Module_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property name stored in column Name in table OBUIAPP_Parameter 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBUIAPP_Parameter<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table OBUIAPP_Parameter<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property sequenceNumber stored in column Seqno in table OBUIAPP_Parameter<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property reference stored in column AD_Reference_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property referenceSearchKey stored in column AD_Reference_Value_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal The Reference Value indicates where the reference values are stored.  It must be specified
     *       if the data type is Table or List.}
     * 
     */
    public static final String PROPERTY_REFERENCESEARCHKEY = "referenceSearchKey";

    /**
     * Property dBColumnName stored in column Columnname in table OBUIAPP_Parameter<br>
     * Help: {@literal The Column Name indicates the name of a column on a table as defined in the database.}
     * 
     */
    public static final String PROPERTY_DBCOLUMNNAME = "dBColumnName";

    /**
     * Property centralMaintenance stored in column Iscentrallymaintained in table OBUIAPP_Parameter<br>
     * Help: {@literal The Centrally Maintained checkbox indicates if the Name, Description and Help maintained
     *       in 'System Element' table  or 'Window' table.}
     * 
     */
    public static final String PROPERTY_CENTRALMAINTENANCE = "centralMaintenance";

    /**
     * Property length stored in column Fieldlength in table OBUIAPP_Parameter<br>
     * Help: {@literal The Length indicates the length of a column as defined in the database.}
     * 
     */
    public static final String PROPERTY_LENGTH = "length";

    /**
     * Property mandatory stored in column Ismandatory in table OBUIAPP_Parameter<br>
     * Help: {@literal The Mandatory checkbox indicates if the field is required for a record to be save to the
     *       database.}
     * 
     */
    public static final String PROPERTY_MANDATORY = "mandatory";

    /**
     * Property defaultValue stored in column Defaultvalue in table OBUIAPP_Parameter<br>
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
     * Property applicationElement stored in column AD_Element_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal The System Element allows for the central maintenance of help, descriptions and
     *       terminology for a database column.}
     * 
     */
    public static final String PROPERTY_APPLICATIONELEMENT = "applicationElement";

    /**
     * Property fixed stored in column Isfixed in table OBUIAPP_Parameter<br>
     * Help: {@literal Is fixed}
     * 
     */
    public static final String PROPERTY_FIXED = "fixed";

    /**
     * Property fixedValue stored in column Fixedvalue in table OBUIAPP_Parameter
     * 
     */
    public static final String PROPERTY_FIXEDVALUE = "fixedValue";

    /**
     * Property obkmoWidgetClass stored in column EM_Obkmo_Widget_Class_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal Identifies a Widget Class definition}
     * 
     */
    public static final String PROPERTY_OBKMOWIDGETCLASS = "obkmoWidgetClass";

    /**
     * Property evaluateFixedValue stored in column EvaluateFixedValue in table OBUIAPP_Parameter<br>
     * Help: {@literal When the flag is enabled the Fixed Value is evaluated as a JS expression.}
     * 
     */
    public static final String PROPERTY_EVALUATEFIXEDVALUE = "evaluateFixedValue";

    /**
     * Property obuiappProcess stored in column Obuiapp_Process_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal Process Defintion is a re implementation of Process with 3.0 infrastructure.}
     * 
     */
    public static final String PROPERTY_OBUIAPPPROCESS = "obuiappProcess";

    /**
     * Property startinnewline stored in column Startinnewline in table OBUIAPP_Parameter
     * 
     */
    public static final String PROPERTY_STARTINNEWLINE = "startinnewline";

    /**
     * Property displayLogic stored in column Displaylogic in table OBUIAPP_Parameter<br>
     * Help: {@literal A specification of statements which, when evaluated as false, cause the field to appear
     *       hidden.}
     * 
     */
    public static final String PROPERTY_DISPLAYLOGIC = "displayLogic";

    /**
     * Property validation stored in column AD_Val_Rule_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal The Validation Rule indicates a unique validation rule.  These rules define how an entry
     *       is determined to valid or invalid.}
     * 
     */
    public static final String PROPERTY_VALIDATION = "validation";

    /**
     * Property fieldGroup stored in column AD_Fieldgroup_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal The Field Group indicates the logical group that this field belongs to (History, Amounts,
     *       Quantities)}
     * 
     */
    public static final String PROPERTY_FIELDGROUP = "fieldGroup";

    /**
     * Property readOnlyLogic stored in column Readonlylogic in table OBUIAPP_Parameter<br>
     * Help: {@literal Logic to determine if field is read only (applies only when field is read-write)}
     * 
     */
    public static final String PROPERTY_READONLYLOGIC = "readOnlyLogic";

    /**
     * Property attachmentMethod stored in column C_Attachment_Method_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal Identifies an Attachment Method available in the System.}
     * 
     */
    public static final String PROPERTY_ATTACHMENTMETHOD = "attachmentMethod";

    /**
     * Property numColumn stored in column NumColumn in table OBUIAPP_Parameter<br>
     * Help: {@literal Column number in which the current field is set (allowed values ​​between 1 and 4)
     *       }
     * 
     */
    public static final String PROPERTY_NUMCOLUMN = "numColumn";

    /**
     * Property onChangeFunction stored in column Onchangefunction in table OBUIAPP_Parameter<br>
     * Help: {@literal This function needs to be the global id of a javascript function which is called on the
     *       client whenever the value of the field changes.}
     * 
     */
    public static final String PROPERTY_ONCHANGEFUNCTION = "onChangeFunction";

    /**
     * Property tab stored in column AD_Tab_ID in table OBUIAPP_Parameter<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property displayedRows stored in column displayedRows in table OBUIAPP_Parameter<br>
     * Help: {@literal The height of the grid will be adjusted to display the number of rows specified in this
     *       field.}
     * 
     */
    public static final String PROPERTY_DISPLAYEDROWS = "displayedRows";

    /**
     * Property showInDescription stored in column ATT_Showindescription in table OBUIAPP_Parameter<br>
     * Help: {@literal Defines if this parameter is relevant in Text column on C_File table.}
     * 
     */
    public static final String PROPERTY_SHOWINDESCRIPTION = "showInDescription";

    /**
     * Property displayTitle stored in column displayTitle in table OBUIAPP_Parameter<br>
     * Help: {@literal This field allows to specify whether the title of a grid form item should be displayed}
     * 
     */
    public static final String PROPERTY_DISPLAYTITLE = "displayTitle";

    /**
     * Property propertyPath stored in column ATT_Propertypath in table OBUIAPP_Parameter<br>
     * Help: {@literal Defines the property path taken for this parameter.}
     * 
     */
    public static final String PROPERTY_PROPERTYPATH = "propertyPath";

    /**
     * Property onGridLoadFunction stored in column Ongridloadfunction in table OBUIAPP_Parameter<br>
     * Help: {@literal This function is invoked when the grid parameter is loaded for the first time.}
     * 
     */
    public static final String PROPERTY_ONGRIDLOADFUNCTION = "onGridLoadFunction";

    /**
     * Property oBUIAPPParameterTrlList stored in table OBUIAPP_Parameter
     * 
     */
    public static final String PROPERTY_OBUIAPPPARAMETERTRLLIST = "oBUIAPPParameterTrlList";


    public Parameter() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_CENTRALMAINTENANCE, true);
        setDefaultValue(PROPERTY_MANDATORY, false);
        setDefaultValue(PROPERTY_FIXED, false);
        setDefaultValue(PROPERTY_EVALUATEFIXEDVALUE, false);
        setDefaultValue(PROPERTY_STARTINNEWLINE, false);
        setDefaultValue(PROPERTY_DISPLAYEDROWS, (long) 5);
        setDefaultValue(PROPERTY_SHOWINDESCRIPTION, false);
        setDefaultValue(PROPERTY_DISPLAYTITLE, true);
        setDefaultValue(PROPERTY_OBUIAPPPARAMETERTRLLIST, new ArrayList<Object>());
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
     * @see Parameter#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Parameter#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Parameter#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Parameter#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Parameter#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Parameter#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Parameter#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Parameter#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Parameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see Parameter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see Parameter#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see Parameter#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see Parameter#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public Reference getReferenceSearchKey() {
        return (Reference) get(PROPERTY_REFERENCESEARCHKEY);
    }
    /**
     * @see Parameter#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public void setReferenceSearchKey(Reference referenceSearchKey) {
        set(PROPERTY_REFERENCESEARCHKEY, referenceSearchKey);
    }

    /**
     * @see Parameter#PROPERTY_DBCOLUMNNAME
     * 
     */
    public String getDBColumnName() {
        return (String) get(PROPERTY_DBCOLUMNNAME);
    }
    /**
     * @see Parameter#PROPERTY_DBCOLUMNNAME
     * 
     */
    public void setDBColumnName(String dBColumnName) {
        set(PROPERTY_DBCOLUMNNAME, dBColumnName);
    }

    /**
     * @see Parameter#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public Boolean isCentralMaintenance() {
        return (Boolean) get(PROPERTY_CENTRALMAINTENANCE);
    }
    /**
     * @see Parameter#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public void setCentralMaintenance(Boolean centralMaintenance) {
        set(PROPERTY_CENTRALMAINTENANCE, centralMaintenance);
    }

    /**
     * @see Parameter#PROPERTY_LENGTH
     * 
     */
    public Long getLength() {
        return (Long) get(PROPERTY_LENGTH);
    }
    /**
     * @see Parameter#PROPERTY_LENGTH
     * 
     */
    public void setLength(Long length) {
        set(PROPERTY_LENGTH, length);
    }

    /**
     * @see Parameter#PROPERTY_MANDATORY
     * 
     */
    public Boolean isMandatory() {
        return (Boolean) get(PROPERTY_MANDATORY);
    }
    /**
     * @see Parameter#PROPERTY_MANDATORY
     * 
     */
    public void setMandatory(Boolean mandatory) {
        set(PROPERTY_MANDATORY, mandatory);
    }

    /**
     * @see Parameter#PROPERTY_DEFAULTVALUE
     * 
     */
    public String getDefaultValue() {
        return (String) get(PROPERTY_DEFAULTVALUE);
    }
    /**
     * @see Parameter#PROPERTY_DEFAULTVALUE
     * 
     */
    public void setDefaultValue(String defaultValue) {
        set(PROPERTY_DEFAULTVALUE, defaultValue);
    }

    /**
     * @see Parameter#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public Element getApplicationElement() {
        return (Element) get(PROPERTY_APPLICATIONELEMENT);
    }
    /**
     * @see Parameter#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public void setApplicationElement(Element applicationElement) {
        set(PROPERTY_APPLICATIONELEMENT, applicationElement);
    }

    /**
     * @see Parameter#PROPERTY_FIXED
     * 
     */
    public Boolean isFixed() {
        return (Boolean) get(PROPERTY_FIXED);
    }
    /**
     * @see Parameter#PROPERTY_FIXED
     * 
     */
    public void setFixed(Boolean fixed) {
        set(PROPERTY_FIXED, fixed);
    }

    /**
     * @see Parameter#PROPERTY_FIXEDVALUE
     * 
     */
    public String getFixedValue() {
        return (String) get(PROPERTY_FIXEDVALUE);
    }
    /**
     * @see Parameter#PROPERTY_FIXEDVALUE
     * 
     */
    public void setFixedValue(String fixedValue) {
        set(PROPERTY_FIXEDVALUE, fixedValue);
    }

    /**
     * @see Parameter#PROPERTY_OBKMOWIDGETCLASS
     * 
     */
    public WidgetClass getObkmoWidgetClass() {
        return (WidgetClass) get(PROPERTY_OBKMOWIDGETCLASS);
    }
    /**
     * @see Parameter#PROPERTY_OBKMOWIDGETCLASS
     * 
     */
    public void setObkmoWidgetClass(WidgetClass obkmoWidgetClass) {
        set(PROPERTY_OBKMOWIDGETCLASS, obkmoWidgetClass);
    }

    /**
     * @see Parameter#PROPERTY_EVALUATEFIXEDVALUE
     * 
     */
    public Boolean isEvaluateFixedValue() {
        return (Boolean) get(PROPERTY_EVALUATEFIXEDVALUE);
    }
    /**
     * @see Parameter#PROPERTY_EVALUATEFIXEDVALUE
     * 
     */
    public void setEvaluateFixedValue(Boolean evaluateFixedValue) {
        set(PROPERTY_EVALUATEFIXEDVALUE, evaluateFixedValue);
    }

    /**
     * @see Parameter#PROPERTY_OBUIAPPPROCESS
     * 
     */
    public Process getObuiappProcess() {
        return (Process) get(PROPERTY_OBUIAPPPROCESS);
    }
    /**
     * @see Parameter#PROPERTY_OBUIAPPPROCESS
     * 
     */
    public void setObuiappProcess(Process obuiappProcess) {
        set(PROPERTY_OBUIAPPPROCESS, obuiappProcess);
    }

    /**
     * @see Parameter#PROPERTY_STARTINNEWLINE
     * 
     */
    public Boolean isStartinnewline() {
        return (Boolean) get(PROPERTY_STARTINNEWLINE);
    }
    /**
     * @see Parameter#PROPERTY_STARTINNEWLINE
     * 
     */
    public void setStartinnewline(Boolean startinnewline) {
        set(PROPERTY_STARTINNEWLINE, startinnewline);
    }

    /**
     * @see Parameter#PROPERTY_DISPLAYLOGIC
     * 
     */
    public String getDisplayLogic() {
        return (String) get(PROPERTY_DISPLAYLOGIC);
    }
    /**
     * @see Parameter#PROPERTY_DISPLAYLOGIC
     * 
     */
    public void setDisplayLogic(String displayLogic) {
        set(PROPERTY_DISPLAYLOGIC, displayLogic);
    }

    /**
     * @see Parameter#PROPERTY_VALIDATION
     * 
     */
    public Validation getValidation() {
        return (Validation) get(PROPERTY_VALIDATION);
    }
    /**
     * @see Parameter#PROPERTY_VALIDATION
     * 
     */
    public void setValidation(Validation validation) {
        set(PROPERTY_VALIDATION, validation);
    }

    /**
     * @see Parameter#PROPERTY_FIELDGROUP
     * 
     */
    public FieldGroup getFieldGroup() {
        return (FieldGroup) get(PROPERTY_FIELDGROUP);
    }
    /**
     * @see Parameter#PROPERTY_FIELDGROUP
     * 
     */
    public void setFieldGroup(FieldGroup fieldGroup) {
        set(PROPERTY_FIELDGROUP, fieldGroup);
    }

    /**
     * @see Parameter#PROPERTY_READONLYLOGIC
     * 
     */
    public String getReadOnlyLogic() {
        return (String) get(PROPERTY_READONLYLOGIC);
    }
    /**
     * @see Parameter#PROPERTY_READONLYLOGIC
     * 
     */
    public void setReadOnlyLogic(String readOnlyLogic) {
        set(PROPERTY_READONLYLOGIC, readOnlyLogic);
    }

    /**
     * @see Parameter#PROPERTY_ATTACHMENTMETHOD
     * 
     */
    public AttachmentMethod getAttachmentMethod() {
        return (AttachmentMethod) get(PROPERTY_ATTACHMENTMETHOD);
    }
    /**
     * @see Parameter#PROPERTY_ATTACHMENTMETHOD
     * 
     */
    public void setAttachmentMethod(AttachmentMethod attachmentMethod) {
        set(PROPERTY_ATTACHMENTMETHOD, attachmentMethod);
    }

    /**
     * @see Parameter#PROPERTY_NUMCOLUMN
     * 
     */
    public Long getNumColumn() {
        return (Long) get(PROPERTY_NUMCOLUMN);
    }
    /**
     * @see Parameter#PROPERTY_NUMCOLUMN
     * 
     */
    public void setNumColumn(Long numColumn) {
        set(PROPERTY_NUMCOLUMN, numColumn);
    }

    /**
     * @see Parameter#PROPERTY_ONCHANGEFUNCTION
     * 
     */
    public String getOnChangeFunction() {
        return (String) get(PROPERTY_ONCHANGEFUNCTION);
    }
    /**
     * @see Parameter#PROPERTY_ONCHANGEFUNCTION
     * 
     */
    public void setOnChangeFunction(String onChangeFunction) {
        set(PROPERTY_ONCHANGEFUNCTION, onChangeFunction);
    }

    /**
     * @see Parameter#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see Parameter#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see Parameter#PROPERTY_DISPLAYEDROWS
     * 
     */
    public Long getDisplayedRows() {
        return (Long) get(PROPERTY_DISPLAYEDROWS);
    }
    /**
     * @see Parameter#PROPERTY_DISPLAYEDROWS
     * 
     */
    public void setDisplayedRows(Long displayedRows) {
        set(PROPERTY_DISPLAYEDROWS, displayedRows);
    }

    /**
     * @see Parameter#PROPERTY_SHOWINDESCRIPTION
     * 
     */
    public Boolean isShowInDescription() {
        return (Boolean) get(PROPERTY_SHOWINDESCRIPTION);
    }
    /**
     * @see Parameter#PROPERTY_SHOWINDESCRIPTION
     * 
     */
    public void setShowInDescription(Boolean showInDescription) {
        set(PROPERTY_SHOWINDESCRIPTION, showInDescription);
    }

    /**
     * @see Parameter#PROPERTY_DISPLAYTITLE
     * 
     */
    public Boolean isDisplayTitle() {
        return (Boolean) get(PROPERTY_DISPLAYTITLE);
    }
    /**
     * @see Parameter#PROPERTY_DISPLAYTITLE
     * 
     */
    public void setDisplayTitle(Boolean displayTitle) {
        set(PROPERTY_DISPLAYTITLE, displayTitle);
    }

    /**
     * @see Parameter#PROPERTY_PROPERTYPATH
     * 
     */
    public String getPropertyPath() {
        return (String) get(PROPERTY_PROPERTYPATH);
    }
    /**
     * @see Parameter#PROPERTY_PROPERTYPATH
     * 
     */
    public void setPropertyPath(String propertyPath) {
        set(PROPERTY_PROPERTYPATH, propertyPath);
    }

    /**
     * @see Parameter#PROPERTY_ONGRIDLOADFUNCTION
     * 
     */
    public String getOnGridLoadFunction() {
        return (String) get(PROPERTY_ONGRIDLOADFUNCTION);
    }
    /**
     * @see Parameter#PROPERTY_ONGRIDLOADFUNCTION
     * 
     */
    public void setOnGridLoadFunction(String onGridLoadFunction) {
        set(PROPERTY_ONGRIDLOADFUNCTION, onGridLoadFunction);
    }

    /**
     * @see ParameterTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ParameterTrl> getOBUIAPPParameterTrlList() {
      return (List<ParameterTrl>) get(PROPERTY_OBUIAPPPARAMETERTRLLIST);
    }

    /**
     * @see ParameterTrl
     * 
     */
    public void setOBUIAPPParameterTrlList(List<ParameterTrl> oBUIAPPParameterTrlList) {
        set(PROPERTY_OBUIAPPPARAMETERTRLLIST, oBUIAPPParameterTrlList);
    }

}
