
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
package org.openbravo.model.ad.datamodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.domain.Callout;
import org.openbravo.model.ad.domain.Reference;
import org.openbravo.model.ad.domain.Validation;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Element;
import org.openbravo.model.ad.ui.Field;
import org.openbravo.model.ad.ui.Process;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADColumn (stored in table AD_Column).
 * <br>
 * Help: {@literal Defines the columns of a table
     *       The Used in Column Tab defines the table and column this
     *       element resides in.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Column extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Column";
    public static final String ENTITY_NAME = "ADColumn";

    /**
     * Property id stored in column AD_Column_ID in table AD_Column<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Column 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Column 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Column 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property updated stored in column Updated in table AD_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Column<br>
     * Help: {@literal A more descriptive identifier (that does need to be unique) of a record/document that is
     *       used as a default search option along with the search key (that is unique and mostly shorter). It is
     *       up to 60 characters in length.}
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Column<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Column<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property dBColumnName stored in column ColumnName in table AD_Column 
     * 
     */
    public static final String PROPERTY_DBCOLUMNNAME = "dBColumnName";

    /**
     * Property table stored in column AD_Table_ID in table AD_Column<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property reference stored in column AD_Reference_ID in table AD_Column<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property referenceSearchKey stored in column AD_Reference_Value_ID in table AD_Column<br>
     * Help: {@literal The Reference Value indicates where the reference values are stored.  It must be specified
     *       if the data type is Table or List.}
     * 
     */
    public static final String PROPERTY_REFERENCESEARCHKEY = "referenceSearchKey";

    /**
     * Property validation stored in column AD_Val_Rule_ID in table AD_Column<br>
     * Help: {@literal The Validation Rule indicates a unique validation rule.  These rules define how an entry
     *       is determined to valid or invalid.}
     * 
     */
    public static final String PROPERTY_VALIDATION = "validation";

    /**
     * Property length stored in column FieldLength in table AD_Column<br>
     * Help: {@literal The Length indicates the length of a column as defined in the database.}
     * 
     */
    public static final String PROPERTY_LENGTH = "length";

    /**
     * Property defaultValue stored in column DefaultValue in table AD_Column<br>
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
     * Property keyColumn stored in column IsKey in table AD_Column<br>
     * Help: {@literal The key column must also be display sequence 0 in the field definition and may be hidden.}
     * 
     */
    public static final String PROPERTY_KEYCOLUMN = "keyColumn";

    /**
     * Property linkToParentColumn stored in column IsParent in table AD_Column<br>
     * Help: {@literal The Parent checkbox indicates if this column is a link to the parent table.}
     * 
     */
    public static final String PROPERTY_LINKTOPARENTCOLUMN = "linkToParentColumn";

    /**
     * Property mandatory stored in column IsMandatory in table AD_Column<br>
     * Help: {@literal The Mandatory checkbox indicates if the field is required for a record to be save to the
     *       database.}
     * 
     */
    public static final String PROPERTY_MANDATORY = "mandatory";

    /**
     * Property updatable stored in column IsUpdateable in table AD_Column<br>
     * Help: {@literal The Updateable checkbox indicates if a field can be updated by the user.}
     * 
     */
    public static final String PROPERTY_UPDATABLE = "updatable";

    /**
     * Property readOnlyLogic stored in column ReadOnlyLogic in table AD_Column<br>
     * Help: {@literal Logic to determine if field is read only (applies only when field is read-write)}
     * 
     */
    public static final String PROPERTY_READONLYLOGIC = "readOnlyLogic";

    /**
     * Property identifier stored in column IsIdentifier in table AD_Column<br>
     * Help: {@literal The Identifier checkbox indicates that this column is part of the identifier or key for
     *       this table}
     * 
     */
    public static final String PROPERTY_IDENTIFIER = "identifier";

    /**
     * Property sequenceNumber stored in column SeqNo in table AD_Column<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property translation stored in column IsTranslated in table AD_Column<br>
     * Help: {@literal The Translated checkbox indicates if this column is translated.}
     * 
     */
    public static final String PROPERTY_TRANSLATION = "translation";

    /**
     * Property displayEncription stored in column IsEncrypted in table AD_Column<br>
     * Help: {@literal This option is deprecated. One of the new references "Password (decryptable)" or "Password
     *       (not-decryptable)" should be used instead.}
     * 
     */
    public static final String PROPERTY_DISPLAYENCRIPTION = "displayEncription";

    /**
     * Property calloutFunction stored in column Callout in table AD_Column<br>
     * Help: {@literal Function Calls separated by semicolons; SE_/SL_/UE_/UL_ - 1st: System/User; 2nd:
     *       Enter/Leave; 3rd: _ Underscore, - then Function Name}
     * 
     */
    public static final String PROPERTY_CALLOUTFUNCTION = "calloutFunction";

    /**
     * Property valueFormat stored in column VFormat in table AD_Column<br>
     * Help: {@literal Value Format is the format the value will be displayed with.}
     * 
     */
    public static final String PROPERTY_VALUEFORMAT = "valueFormat";

    /**
     * Property minValue stored in column ValueMin in table AD_Column<br>
     * Help: {@literal The Minimum Value indicates the lowest  allowable value for a field.}
     * 
     */
    public static final String PROPERTY_MINVALUE = "minValue";

    /**
     * Property maxValue stored in column ValueMax in table AD_Column<br>
     * Help: {@literal The Maximum Value indicates the highest allowable value for a field}
     * 
     */
    public static final String PROPERTY_MAXVALUE = "maxValue";

    /**
     * Property filterColumn stored in column IsSelectionColumn in table AD_Column<br>
     * Help: {@literal 
     *       If selected, this column will be used in the Search Window as an available filter
     *       criteria.}
     * 
     */
    public static final String PROPERTY_FILTERCOLUMN = "filterColumn";

    /**
     * Property applicationElement stored in column AD_Element_ID in table AD_Column<br>
     * Help: {@literal The System Element allows for the central maintenance of help, descriptions and
     *       terminology for a database column.}
     * 
     */
    public static final String PROPERTY_APPLICATIONELEMENT = "applicationElement";

    /**
     * Property process stored in column AD_Process_ID in table AD_Column<br>
     * Help: {@literal The Process field identifies a unique Process or Report in the system.}
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property storedInSession stored in column IsSessionAttr in table AD_Column<br>
     * Help: {@literal Checking this field the data for this column will be stored as session attribute so its
     *       content will be accessible from other tab.}
     * 
     */
    public static final String PROPERTY_STOREDINSESSION = "storedInSession";

    /**
     * Property secondaryKey stored in column IsSecondaryKey in table AD_Column<br>
     * Help: {@literal Is secondary key}
     * 
     */
    public static final String PROPERTY_SECONDARYKEY = "secondaryKey";

    /**
     * Property deencryptable stored in column IsDesencryptable in table AD_Column<br>
     * Help: {@literal This option is deprecated. Instead one of the new references "Password (decryptable)" or
     *       "Password (not-decryptable)" should be used instead.}
     * 
     */
    public static final String PROPERTY_DEENCRYPTABLE = "deencryptable";

    /**
     * Property callout stored in column AD_Callout_ID in table AD_Column<br>
     * Help: {@literal The callout that will be fired when the content of a is modified.}
     * 
     */
    public static final String PROPERTY_CALLOUT = "callout";

    /**
     * Property developmentStatus stored in column Developmentstatus in table AD_Column<br>
     * Help: {@literal Development Status defines the status of a table or a column. Ready means that this object
     *       is in use, Not Implemented Yet indicates that currently it is not in use but it is planned to be
     *       implemented and Deprecated are the objects that are going to be removed from the application in
     *       future versions.}
     * 
     */
    public static final String PROPERTY_DEVELOPMENTSTATUS = "developmentStatus";

    /**
     * Property module stored in column AD_Module_ID in table AD_Column<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property position stored in column Position in table AD_Column<br>
     * Help: {@literal Determines the physical column position in database. It is a mandatory field which value
     *       is unique for all the columns within the same table.}
     * 
     */
    public static final String PROPERTY_POSITION = "position";

    /**
     * Property transient stored in column IsTransient in table AD_Column<br>
     * Help: {@literal Mark if a column is transient and will be ignored when comparing data}
     * 
     */
    public static final String PROPERTY_TRANSIENT = "transient";

    /**
     * Property transientCondition stored in column isTransientCondition in table AD_Column<br>
     * Help: {@literal Java expression that will be evaluated and if the result is false, the column will be
     *       marked as transient}
     * 
     */
    public static final String PROPERTY_TRANSIENTCONDITION = "transientCondition";

    /**
     * Property isautosave stored in column Isautosave in table AD_Column<br>
     * Help: {@literal If the value is 'Y' the autosave flag will be put in the form and the Autosave process
     *       will be triggered}
     * 
     */
    public static final String PROPERTY_ISAUTOSAVE = "isautosave";

    /**
     * Property validateOnNew stored in column ValidateOnNew in table AD_Column<br>
     * Help: {@literal Indicates whether validations and callouts are executed when a new record is created. In
     *       general is should be set to Y. It makes sense to disable only in case there are callouts or
     *       validations associated to this column and it is known that when a new record is created they do not
     *       change any value; in this case this check allows to bypass their execution improving performance.}
     * 
     */
    public static final String PROPERTY_VALIDATEONNEW = "validateOnNew";

    /**
     * Property excludeAudit stored in column IsExcludeAudit in table AD_Column<br>
     * Help: {@literal If the value is 'Y' ,then this column is excluded from audit.}
     * 
     */
    public static final String PROPERTY_EXCLUDEAUDIT = "excludeAudit";

    /**
     * Property imageSizeValuesAction stored in column Imagesizevaluesaction in table AD_Column<br>
     * Help: {@literal Action or restriction that will be performed in the uploaded image size using "Image
     *       Width" and "Image Height" values.
     *       It does not apply to scalable vector graphics (svg).}
     * 
     */
    public static final String PROPERTY_IMAGESIZEVALUESACTION = "imageSizeValuesAction";

    /**
     * Property imageWidth stored in column Imagewidth in table AD_Column<br>
     * Help: {@literal Width used in the "Image Size Values Action" field. If it is empty, it will not be taked
     *       into account.}
     * 
     */
    public static final String PROPERTY_IMAGEWIDTH = "imageWidth";

    /**
     * Property imageHeight stored in column Imageheight in table AD_Column<br>
     * Help: {@literal Height used in the "Image Size Values Action" field. If it is empty, it will not be taked
     *       into account.}
     * 
     */
    public static final String PROPERTY_IMAGEHEIGHT = "imageHeight";

    /**
     * Property useAutomaticSequence stored in column IsUsedSequence in table AD_Column<br>
     * Help: {@literal Column which DB column name is "Value", can use automatic sequence numbers, to do so this
     *       check needs to be marked. When a "Value" column uses automatic sequence works in a similar way
     *       document number columns work: when user creates a new record the default value is based in the next
     *       available sequence number (based on the sequence for the table).}
     * 
     */
    public static final String PROPERTY_USEAUTOMATICSEQUENCE = "useAutomaticSequence";

    /**
     * Property sqllogic stored in column Sqllogic in table AD_Column<br>
     * Help: {@literal This field is used to define a computed column. A computed column is a column of a table
     *       which is computed using a sql expression and which does not exist explicitly in the database schema.
     *       More information can be found at http://wiki.openbravo.com/wiki/How_to_create_a_Computed_Column}
     * 
     */
    public static final String PROPERTY_SQLLOGIC = "sqllogic";

    /**
     * Property entityAlias stored in column Entity_Alias in table AD_Column<br>
     * Help: {@literal The left part definition of a column in an HQL query.}
     * 
     */
    public static final String PROPERTY_ENTITYALIAS = "entityAlias";

    /**
     * Property allowSorting stored in column AllowSorting in table AD_Column<br>
     * Help: {@literal If checked, the column will be sortable. By default every column is sortable. If it is
     *       unchecked, the column will not be sortable.}
     * 
     */
    public static final String PROPERTY_ALLOWSORTING = "allowSorting";

    /**
     * Property oBUIAPPProcess stored in column EM_OBUIAPP_Process_ID in table AD_Column<br>
     * Help: {@literal Process to be executed by the button. There are 2 kinds of processes:
     *       *"Process":
     *       Implements the 2.50 style processes with a Servlet.
     *       *"Process Definition": Implements 3.0 processes
     *       with a pure SmartClient UI.}
     * 
     */
    public static final String PROPERTY_OBUIAPPPROCESS = "oBUIAPPProcess";

    /**
     * Property allowFiltering stored in column AllowFiltering in table AD_Column<br>
     * Help: {@literal If checked, the column will be filterable. By default every column is filterable. If it is
     *       unchecked, the column will not be filterable.}
     * 
     */
    public static final String PROPERTY_ALLOWFILTERING = "allowFiltering";

    /**
     * Property allowedCrossOrganizationReference stored in column Allowed_Cross_Org_Link in table AD_Column<br>
     * Help: {@literal By default references to other objects are only allowed in case the referenced object's
     *       Organization is in the referencing object's Organization's natural tree than the object.
     *       
     *       When this
     *       flag is enabled, this default behavior can be overridden allowing to reference objects outside
     *       current's natural tree. Note this does not change the objects that can be referred from GUI, this
     *       constraint can only be programatically bypassed.}
     * 
     */
    public static final String PROPERTY_ALLOWEDCROSSORGANIZATIONREFERENCE = "allowedCrossOrganizationReference";

    /**
     * Property childPropertyInParentEntity stored in column Is_Child_Property_In_Parent in table AD_Column<br>
     * Help: {@literal In case of one to many references (foreing keys) this flag indicates whether a property
     *       will be created in the parent (target) entity. For example in OrderLine.order property, if this
     *       field is flagged, an Order.orderLineList property would be created.}
     * 
     */
    public static final String PROPERTY_CHILDPROPERTYINPARENTENTITY = "childPropertyInParentEntity";

    /**
     * Property aDFieldList stored in table AD_Column
     * 
     */
    public static final String PROPERTY_ADFIELDLIST = "aDFieldList";


    public Column() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_KEYCOLUMN, false);
        setDefaultValue(PROPERTY_LINKTOPARENTCOLUMN, false);
        setDefaultValue(PROPERTY_MANDATORY, false);
        setDefaultValue(PROPERTY_UPDATABLE, true);
        setDefaultValue(PROPERTY_IDENTIFIER, false);
        setDefaultValue(PROPERTY_TRANSLATION, false);
        setDefaultValue(PROPERTY_DISPLAYENCRIPTION, false);
        setDefaultValue(PROPERTY_FILTERCOLUMN, false);
        setDefaultValue(PROPERTY_STOREDINSESSION, false);
        setDefaultValue(PROPERTY_SECONDARYKEY, false);
        setDefaultValue(PROPERTY_DEENCRYPTABLE, false);
        setDefaultValue(PROPERTY_DEVELOPMENTSTATUS, "RE");
        setDefaultValue(PROPERTY_TRANSIENT, false);
        setDefaultValue(PROPERTY_ISAUTOSAVE, true);
        setDefaultValue(PROPERTY_VALIDATEONNEW, true);
        setDefaultValue(PROPERTY_EXCLUDEAUDIT, false);
        setDefaultValue(PROPERTY_USEAUTOMATICSEQUENCE, false);
        setDefaultValue(PROPERTY_ALLOWSORTING, true);
        setDefaultValue(PROPERTY_ALLOWFILTERING, true);
        setDefaultValue(PROPERTY_ALLOWEDCROSSORGANIZATIONREFERENCE, false);
        setDefaultValue(PROPERTY_CHILDPROPERTYINPARENTENTITY, false);
        setDefaultValue(PROPERTY_ADFIELDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Column#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Column#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Column#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Column#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Column#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Column#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Column#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Column#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Column#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Column#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Column#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Column#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Column#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Column#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Column#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Column#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Column#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Column#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Column#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Column#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Column#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Column#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Column#PROPERTY_DBCOLUMNNAME
     * 
     */
    public String getDBColumnName() {
        return (String) get(PROPERTY_DBCOLUMNNAME);
    }
    /**
     * @see Column#PROPERTY_DBCOLUMNNAME
     * 
     */
    public void setDBColumnName(String dBColumnName) {
        set(PROPERTY_DBCOLUMNNAME, dBColumnName);
    }

    /**
     * @see Column#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see Column#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see Column#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see Column#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see Column#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public Reference getReferenceSearchKey() {
        return (Reference) get(PROPERTY_REFERENCESEARCHKEY);
    }
    /**
     * @see Column#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public void setReferenceSearchKey(Reference referenceSearchKey) {
        set(PROPERTY_REFERENCESEARCHKEY, referenceSearchKey);
    }

    /**
     * @see Column#PROPERTY_VALIDATION
     * 
     */
    public Validation getValidation() {
        return (Validation) get(PROPERTY_VALIDATION);
    }
    /**
     * @see Column#PROPERTY_VALIDATION
     * 
     */
    public void setValidation(Validation validation) {
        set(PROPERTY_VALIDATION, validation);
    }

    /**
     * @see Column#PROPERTY_LENGTH
     * 
     */
    public Long getLength() {
        return (Long) get(PROPERTY_LENGTH);
    }
    /**
     * @see Column#PROPERTY_LENGTH
     * 
     */
    public void setLength(Long length) {
        set(PROPERTY_LENGTH, length);
    }

    /**
     * @see Column#PROPERTY_DEFAULTVALUE
     * 
     */
    public String getDefaultValue() {
        return (String) get(PROPERTY_DEFAULTVALUE);
    }
    /**
     * @see Column#PROPERTY_DEFAULTVALUE
     * 
     */
    public void setDefaultValue(String defaultValue) {
        set(PROPERTY_DEFAULTVALUE, defaultValue);
    }

    /**
     * @see Column#PROPERTY_KEYCOLUMN
     * 
     */
    public Boolean isKeyColumn() {
        return (Boolean) get(PROPERTY_KEYCOLUMN);
    }
    /**
     * @see Column#PROPERTY_KEYCOLUMN
     * 
     */
    public void setKeyColumn(Boolean keyColumn) {
        set(PROPERTY_KEYCOLUMN, keyColumn);
    }

    /**
     * @see Column#PROPERTY_LINKTOPARENTCOLUMN
     * 
     */
    public Boolean isLinkToParentColumn() {
        return (Boolean) get(PROPERTY_LINKTOPARENTCOLUMN);
    }
    /**
     * @see Column#PROPERTY_LINKTOPARENTCOLUMN
     * 
     */
    public void setLinkToParentColumn(Boolean linkToParentColumn) {
        set(PROPERTY_LINKTOPARENTCOLUMN, linkToParentColumn);
    }

    /**
     * @see Column#PROPERTY_MANDATORY
     * 
     */
    public Boolean isMandatory() {
        return (Boolean) get(PROPERTY_MANDATORY);
    }
    /**
     * @see Column#PROPERTY_MANDATORY
     * 
     */
    public void setMandatory(Boolean mandatory) {
        set(PROPERTY_MANDATORY, mandatory);
    }

    /**
     * @see Column#PROPERTY_UPDATABLE
     * 
     */
    public Boolean isUpdatable() {
        return (Boolean) get(PROPERTY_UPDATABLE);
    }
    /**
     * @see Column#PROPERTY_UPDATABLE
     * 
     */
    public void setUpdatable(Boolean updatable) {
        set(PROPERTY_UPDATABLE, updatable);
    }

    /**
     * @see Column#PROPERTY_READONLYLOGIC
     * 
     */
    public String getReadOnlyLogic() {
        return (String) get(PROPERTY_READONLYLOGIC);
    }
    /**
     * @see Column#PROPERTY_READONLYLOGIC
     * 
     */
    public void setReadOnlyLogic(String readOnlyLogic) {
        set(PROPERTY_READONLYLOGIC, readOnlyLogic);
    }

    /**
     * @see Column#PROPERTY_IDENTIFIER
     * 
     */
    public Boolean isIdentifier() {
        return (Boolean) get(PROPERTY_IDENTIFIER);
    }
    /**
     * @see Column#PROPERTY_IDENTIFIER
     * 
     */
    public void setIdentifier(Boolean identifier) {
        set(PROPERTY_IDENTIFIER, identifier);
    }

    /**
     * @see Column#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see Column#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see Column#PROPERTY_TRANSLATION
     * 
     */
    public Boolean isTranslation() {
        return (Boolean) get(PROPERTY_TRANSLATION);
    }
    /**
     * @see Column#PROPERTY_TRANSLATION
     * 
     */
    public void setTranslation(Boolean translation) {
        set(PROPERTY_TRANSLATION, translation);
    }

    /**
     * @see Column#PROPERTY_DISPLAYENCRIPTION
     * 
     */
    public Boolean isDisplayEncription() {
        return (Boolean) get(PROPERTY_DISPLAYENCRIPTION);
    }
    /**
     * @see Column#PROPERTY_DISPLAYENCRIPTION
     * 
     */
    public void setDisplayEncription(Boolean displayEncription) {
        set(PROPERTY_DISPLAYENCRIPTION, displayEncription);
    }

    /**
     * @see Column#PROPERTY_CALLOUTFUNCTION
     * 
     */
    public String getCalloutFunction() {
        return (String) get(PROPERTY_CALLOUTFUNCTION);
    }
    /**
     * @see Column#PROPERTY_CALLOUTFUNCTION
     * 
     */
    public void setCalloutFunction(String calloutFunction) {
        set(PROPERTY_CALLOUTFUNCTION, calloutFunction);
    }

    /**
     * @see Column#PROPERTY_VALUEFORMAT
     * 
     */
    public String getValueFormat() {
        return (String) get(PROPERTY_VALUEFORMAT);
    }
    /**
     * @see Column#PROPERTY_VALUEFORMAT
     * 
     */
    public void setValueFormat(String valueFormat) {
        set(PROPERTY_VALUEFORMAT, valueFormat);
    }

    /**
     * @see Column#PROPERTY_MINVALUE
     * 
     */
    public String getMinValue() {
        return (String) get(PROPERTY_MINVALUE);
    }
    /**
     * @see Column#PROPERTY_MINVALUE
     * 
     */
    public void setMinValue(String minValue) {
        set(PROPERTY_MINVALUE, minValue);
    }

    /**
     * @see Column#PROPERTY_MAXVALUE
     * 
     */
    public String getMaxValue() {
        return (String) get(PROPERTY_MAXVALUE);
    }
    /**
     * @see Column#PROPERTY_MAXVALUE
     * 
     */
    public void setMaxValue(String maxValue) {
        set(PROPERTY_MAXVALUE, maxValue);
    }

    /**
     * @see Column#PROPERTY_FILTERCOLUMN
     * 
     */
    public Boolean isFilterColumn() {
        return (Boolean) get(PROPERTY_FILTERCOLUMN);
    }
    /**
     * @see Column#PROPERTY_FILTERCOLUMN
     * 
     */
    public void setFilterColumn(Boolean filterColumn) {
        set(PROPERTY_FILTERCOLUMN, filterColumn);
    }

    /**
     * @see Column#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public Element getApplicationElement() {
        return (Element) get(PROPERTY_APPLICATIONELEMENT);
    }
    /**
     * @see Column#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public void setApplicationElement(Element applicationElement) {
        set(PROPERTY_APPLICATIONELEMENT, applicationElement);
    }

    /**
     * @see Column#PROPERTY_PROCESS
     * 
     */
    public Process getProcess() {
        return (Process) get(PROPERTY_PROCESS);
    }
    /**
     * @see Column#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Process process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see Column#PROPERTY_STOREDINSESSION
     * 
     */
    public Boolean isStoredInSession() {
        return (Boolean) get(PROPERTY_STOREDINSESSION);
    }
    /**
     * @see Column#PROPERTY_STOREDINSESSION
     * 
     */
    public void setStoredInSession(Boolean storedInSession) {
        set(PROPERTY_STOREDINSESSION, storedInSession);
    }

    /**
     * @see Column#PROPERTY_SECONDARYKEY
     * 
     */
    public Boolean isSecondaryKey() {
        return (Boolean) get(PROPERTY_SECONDARYKEY);
    }
    /**
     * @see Column#PROPERTY_SECONDARYKEY
     * 
     */
    public void setSecondaryKey(Boolean secondaryKey) {
        set(PROPERTY_SECONDARYKEY, secondaryKey);
    }

    /**
     * @see Column#PROPERTY_DEENCRYPTABLE
     * 
     */
    public Boolean isDeencryptable() {
        return (Boolean) get(PROPERTY_DEENCRYPTABLE);
    }
    /**
     * @see Column#PROPERTY_DEENCRYPTABLE
     * 
     */
    public void setDeencryptable(Boolean deencryptable) {
        set(PROPERTY_DEENCRYPTABLE, deencryptable);
    }

    /**
     * @see Column#PROPERTY_CALLOUT
     * 
     */
    public Callout getCallout() {
        return (Callout) get(PROPERTY_CALLOUT);
    }
    /**
     * @see Column#PROPERTY_CALLOUT
     * 
     */
    public void setCallout(Callout callout) {
        set(PROPERTY_CALLOUT, callout);
    }

    /**
     * @see Column#PROPERTY_DEVELOPMENTSTATUS
     * 
     */
    public String getDevelopmentStatus() {
        return (String) get(PROPERTY_DEVELOPMENTSTATUS);
    }
    /**
     * @see Column#PROPERTY_DEVELOPMENTSTATUS
     * 
     */
    public void setDevelopmentStatus(String developmentStatus) {
        set(PROPERTY_DEVELOPMENTSTATUS, developmentStatus);
    }

    /**
     * @see Column#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Column#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Column#PROPERTY_POSITION
     * 
     */
    public Long getPosition() {
        return (Long) get(PROPERTY_POSITION);
    }
    /**
     * @see Column#PROPERTY_POSITION
     * 
     */
    public void setPosition(Long position) {
        set(PROPERTY_POSITION, position);
    }

    /**
     * @see Column#PROPERTY_TRANSIENT
     * 
     */
    public Boolean isTransient() {
        return (Boolean) get(PROPERTY_TRANSIENT);
    }
    /**
     * @see Column#PROPERTY_TRANSIENT
     * 
     */
    public void setTransient(Boolean trnsnt) {
        set(PROPERTY_TRANSIENT, trnsnt);
    }

    /**
     * @see Column#PROPERTY_TRANSIENTCONDITION
     * 
     */
    public String getTransientCondition() {
        return (String) get(PROPERTY_TRANSIENTCONDITION);
    }
    /**
     * @see Column#PROPERTY_TRANSIENTCONDITION
     * 
     */
    public void setTransientCondition(String transientCondition) {
        set(PROPERTY_TRANSIENTCONDITION, transientCondition);
    }

    /**
     * @see Column#PROPERTY_ISAUTOSAVE
     * 
     */
    public Boolean isAutosave() {
        return (Boolean) get(PROPERTY_ISAUTOSAVE);
    }
    /**
     * @see Column#PROPERTY_ISAUTOSAVE
     * 
     */
    public void setAutosave(Boolean isautosave) {
        set(PROPERTY_ISAUTOSAVE, isautosave);
    }

    /**
     * @see Column#PROPERTY_VALIDATEONNEW
     * 
     */
    public Boolean isValidateOnNew() {
        return (Boolean) get(PROPERTY_VALIDATEONNEW);
    }
    /**
     * @see Column#PROPERTY_VALIDATEONNEW
     * 
     */
    public void setValidateOnNew(Boolean validateOnNew) {
        set(PROPERTY_VALIDATEONNEW, validateOnNew);
    }

    /**
     * @see Column#PROPERTY_EXCLUDEAUDIT
     * 
     */
    public Boolean isExcludeAudit() {
        return (Boolean) get(PROPERTY_EXCLUDEAUDIT);
    }
    /**
     * @see Column#PROPERTY_EXCLUDEAUDIT
     * 
     */
    public void setExcludeAudit(Boolean excludeAudit) {
        set(PROPERTY_EXCLUDEAUDIT, excludeAudit);
    }

    /**
     * @see Column#PROPERTY_IMAGESIZEVALUESACTION
     * 
     */
    public String getImageSizeValuesAction() {
        return (String) get(PROPERTY_IMAGESIZEVALUESACTION);
    }
    /**
     * @see Column#PROPERTY_IMAGESIZEVALUESACTION
     * 
     */
    public void setImageSizeValuesAction(String imageSizeValuesAction) {
        set(PROPERTY_IMAGESIZEVALUESACTION, imageSizeValuesAction);
    }

    /**
     * @see Column#PROPERTY_IMAGEWIDTH
     * 
     */
    public Long getImageWidth() {
        return (Long) get(PROPERTY_IMAGEWIDTH);
    }
    /**
     * @see Column#PROPERTY_IMAGEWIDTH
     * 
     */
    public void setImageWidth(Long imageWidth) {
        set(PROPERTY_IMAGEWIDTH, imageWidth);
    }

    /**
     * @see Column#PROPERTY_IMAGEHEIGHT
     * 
     */
    public Long getImageHeight() {
        return (Long) get(PROPERTY_IMAGEHEIGHT);
    }
    /**
     * @see Column#PROPERTY_IMAGEHEIGHT
     * 
     */
    public void setImageHeight(Long imageHeight) {
        set(PROPERTY_IMAGEHEIGHT, imageHeight);
    }

    /**
     * @see Column#PROPERTY_USEAUTOMATICSEQUENCE
     * 
     */
    public Boolean isUseAutomaticSequence() {
        return (Boolean) get(PROPERTY_USEAUTOMATICSEQUENCE);
    }
    /**
     * @see Column#PROPERTY_USEAUTOMATICSEQUENCE
     * 
     */
    public void setUseAutomaticSequence(Boolean useAutomaticSequence) {
        set(PROPERTY_USEAUTOMATICSEQUENCE, useAutomaticSequence);
    }

    /**
     * @see Column#PROPERTY_SQLLOGIC
     * 
     */
    public String getSqllogic() {
        return (String) get(PROPERTY_SQLLOGIC);
    }
    /**
     * @see Column#PROPERTY_SQLLOGIC
     * 
     */
    public void setSqllogic(String sqllogic) {
        set(PROPERTY_SQLLOGIC, sqllogic);
    }

    /**
     * @see Column#PROPERTY_ENTITYALIAS
     * 
     */
    public String getEntityAlias() {
        return (String) get(PROPERTY_ENTITYALIAS);
    }
    /**
     * @see Column#PROPERTY_ENTITYALIAS
     * 
     */
    public void setEntityAlias(String entityAlias) {
        set(PROPERTY_ENTITYALIAS, entityAlias);
    }

    /**
     * @see Column#PROPERTY_ALLOWSORTING
     * 
     */
    public Boolean isAllowSorting() {
        return (Boolean) get(PROPERTY_ALLOWSORTING);
    }
    /**
     * @see Column#PROPERTY_ALLOWSORTING
     * 
     */
    public void setAllowSorting(Boolean allowSorting) {
        set(PROPERTY_ALLOWSORTING, allowSorting);
    }

    /**
     * @see Column#PROPERTY_OBUIAPPPROCESS
     * 
     */
    public org.openbravo.client.application.Process getOBUIAPPProcess() {
        return (org.openbravo.client.application.Process) get(PROPERTY_OBUIAPPPROCESS);
    }
    /**
     * @see Column#PROPERTY_OBUIAPPPROCESS
     * 
     */
    public void setOBUIAPPProcess(org.openbravo.client.application.Process oBUIAPPProcess) {
        set(PROPERTY_OBUIAPPPROCESS, oBUIAPPProcess);
    }

    /**
     * @see Column#PROPERTY_ALLOWFILTERING
     * 
     */
    public Boolean isAllowFiltering() {
        return (Boolean) get(PROPERTY_ALLOWFILTERING);
    }
    /**
     * @see Column#PROPERTY_ALLOWFILTERING
     * 
     */
    public void setAllowFiltering(Boolean allowFiltering) {
        set(PROPERTY_ALLOWFILTERING, allowFiltering);
    }

    /**
     * @see Column#PROPERTY_ALLOWEDCROSSORGANIZATIONREFERENCE
     * 
     */
    public Boolean isAllowedCrossOrganizationReference() {
        return (Boolean) get(PROPERTY_ALLOWEDCROSSORGANIZATIONREFERENCE);
    }
    /**
     * @see Column#PROPERTY_ALLOWEDCROSSORGANIZATIONREFERENCE
     * 
     */
    public void setAllowedCrossOrganizationReference(Boolean allowedCrossOrganizationReference) {
        set(PROPERTY_ALLOWEDCROSSORGANIZATIONREFERENCE, allowedCrossOrganizationReference);
    }

    /**
     * @see Column#PROPERTY_CHILDPROPERTYINPARENTENTITY
     * 
     */
    public Boolean isChildPropertyInParentEntity() {
        return (Boolean) get(PROPERTY_CHILDPROPERTYINPARENTENTITY);
    }
    /**
     * @see Column#PROPERTY_CHILDPROPERTYINPARENTENTITY
     * 
     */
    public void setChildPropertyInParentEntity(Boolean childPropertyInParentEntity) {
        set(PROPERTY_CHILDPROPERTYINPARENTENTITY, childPropertyInParentEntity);
    }

    /**
     * Help: {@literal The Field table defines the Fields displayed within a tab. Changes made to the Field Tab
     *       become visible after restart due to caching}<br>
     * @see Field
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Field> getADFieldList() {
      return (List<Field>) get(PROPERTY_ADFIELDLIST);
    }

    /**
     * Help: {@literal The Field table defines the Fields displayed within a tab. Changes made to the Field Tab
     *       become visible after restart due to caching}<br>
     * @see Field
     * 
     */
    public void setADFieldList(List<Field> aDFieldList) {
        set(PROPERTY_ADFIELDLIST, aDFieldList);
    }

}
