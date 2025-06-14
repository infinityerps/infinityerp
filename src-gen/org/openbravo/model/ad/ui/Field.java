
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
import org.openbravo.client.application.GCField;
import org.openbravo.model.ad.access.FieldAccess;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.userinterface.selector.SelectorField;
/**
 * Entity class for entity ADField (stored in table AD_Field).
 * <br>
 * Help: {@literal The Field table defines the Fields displayed within a tab. Changes made to the Field Tab
     *       become visible after restart due to caching}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Field extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Field";
    public static final String ENTITY_NAME = "ADField";

    /**
     * Property id stored in column AD_Field_ID in table AD_Field<br>
     * Help: {@literal The Field identifies a field on a database table.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Field 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Field 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Field 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Field 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Field<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Field<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property centralMaintenance stored in column IsCentrallyMaintained in table AD_Field<br>
     * Help: {@literal The Centrally Maintained checkbox indicates if the Name, Description and Help maintained
     *       in 'System Element' table  or 'Window' table.}
     * 
     */
    public static final String PROPERTY_CENTRALMAINTENANCE = "centralMaintenance";

    /**
     * Property tab stored in column AD_Tab_ID in table AD_Field<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property column stored in column AD_Column_ID in table AD_Field<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property property stored in column Property in table AD_Field<br>
     * Help: {@literal It is the "Configuration Property" this record sets value to. 
     *       
     *       Configuration Properties
     *       are defined by modules with the purpose other modules are capable to assign them values.}
     * 
     */
    public static final String PROPERTY_PROPERTY = "property";

    /**
     * Property ignoreInWad stored in column Ignoreinwad in table AD_Field
     * 
     */
    public static final String PROPERTY_IGNOREINWAD = "ignoreInWad";

    /**
     * Property fieldGroup stored in column AD_FieldGroup_ID in table AD_Field<br>
     * Help: {@literal The Field Group indicates the logical group that this field belongs to (History, Amounts,
     *       Quantities)}
     * 
     */
    public static final String PROPERTY_FIELDGROUP = "fieldGroup";

    /**
     * Property displayed stored in column IsDisplayed in table AD_Field<br>
     * Help: {@literal If the field is displayed, the field Display Logic will determine at runtime, if it is
     *       actually displayed}
     * 
     */
    public static final String PROPERTY_DISPLAYED = "displayed";

    /**
     * Property displayLogic stored in column DisplayLogic in table AD_Field<br>
     * Help: {@literal A specification of statements which, when evaluated as false, cause the field to appear
     *       hidden.}
     * 
     */
    public static final String PROPERTY_DISPLAYLOGIC = "displayLogic";

    /**
     * Property displayedLength stored in column DisplayLength in table AD_Field<br>
     * Help: {@literal Display length is the size that will be appear for the field, it can be different that the
     *       actual size of the column (note that if it is bigger than the column the data will be truncated to
     *       the column size).}
     * 
     */
    public static final String PROPERTY_DISPLAYEDLENGTH = "displayedLength";

    /**
     * Property readOnly stored in column IsReadOnly in table AD_Field<br>
     * Help: {@literal The Read Only indicates that this field may only be Read.  It may not be updated.}
     * 
     */
    public static final String PROPERTY_READONLY = "readOnly";

    /**
     * Property sequenceNumber stored in column SeqNo in table AD_Field<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property recordSortNo stored in column SortNo in table AD_Field<br>
     * Help: {@literal The Record Sort No indicates the ascending sort sequence of the records}
     * 
     */
    public static final String PROPERTY_RECORDSORTNO = "recordSortNo";

    /**
     * Property displayOnSameLine stored in column IsSameLine in table AD_Field<br>
     * Help: {@literal An indication that the field will display on the same line as the previous one.}
     * 
     */
    public static final String PROPERTY_DISPLAYONSAMELINE = "displayOnSameLine";

    /**
     * Property displayFieldOnly stored in column IsFieldOnly in table AD_Field<br>
     * Help: {@literal The Field Only checkbox indicates that the column will display without a label.}
     * 
     */
    public static final String PROPERTY_DISPLAYFIELDONLY = "displayFieldOnly";

    /**
     * Property displayEncription stored in column IsEncrypted in table AD_Field<br>
     * Help: {@literal This option is deprecated. One of the new references "Password (decryptable)" or "Password
     *       (not-decryptable)" should be used instead.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_DISPLAYENCRIPTION = "displayEncription";

    /**
     * Property showInGridView stored in column ShowInRelation in table AD_Field<br>
     * Help: {@literal When this field is set as 'Y' the field will be shown in the grid view (as well as in the
     *       form view), otherwise it only will be displayed in the form view.}
     * 
     */
    public static final String PROPERTY_SHOWINGRIDVIEW = "showInGridView";

    /**
     * Property isFirstFocusedField stored in column Isfirstfocusedfield in table AD_Field<br>
     * Help: {@literal 
     *       When it is active this field will be focused by default when the tab is opened.}
     * 
     */
    public static final String PROPERTY_ISFIRSTFOCUSEDFIELD = "isFirstFocusedField";

    /**
     * Property module stored in column AD_Module_ID in table AD_Field<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property gridPosition stored in column Grid_Seqno in table AD_Field<br>
     * Help: {@literal Position of the column in grid view. If there are fields shown in grid with this property
     *       set, they will be placed at first in grid ordered by this value, after them, the rest of fields
     *       ordered by their seqNo value.}
     * 
     */
    public static final String PROPERTY_GRIDPOSITION = "gridPosition";

    /**
     * Property startinoddcolumn stored in column Startinoddcolumn in table AD_Field
     * 
     */
    public static final String PROPERTY_STARTINODDCOLUMN = "startinoddcolumn";

    /**
     * Property startnewline stored in column Startnewline in table AD_Field
     * 
     */
    public static final String PROPERTY_STARTNEWLINE = "startnewline";

    /**
     * Property shownInStatusBar stored in column isShownInStatusBar in table AD_Field<br>
     * Help: {@literal Defines if the field is shown in the status bar.}
     * 
     */
    public static final String PROPERTY_SHOWNINSTATUSBAR = "shownInStatusBar";

    /**
     * Property onChangeFunction stored in column Onchangefunction in table AD_Field<br>
     * Help: {@literal This function needs to be the global id of a javascript function which is called on the
     *       client whenever the value of the field changes.}
     * 
     */
    public static final String PROPERTY_ONCHANGEFUNCTION = "onChangeFunction";

    /**
     * Property clientclass stored in column Clientclass in table AD_Field
     * 
     */
    public static final String PROPERTY_CLIENTCLASS = "clientclass";

    /**
     * Property displaylogicgrid stored in column Displaylogicgrid in table AD_Field
     * 
     */
    public static final String PROPERTY_DISPLAYLOGICGRID = "displaylogicgrid";

    /**
     * Property obuiappColspan stored in column EM_Obuiapp_Colspan in table AD_Field<br>
     * Help: {@literal This value can be used to define, multi-columns fields. So fields occupying more then one
     *       column. If this value is not set the normal calculation takes place.}
     * 
     */
    public static final String PROPERTY_OBUIAPPCOLSPAN = "obuiappColspan";

    /**
     * Property obuiappRowspan stored in column EM_Obuiapp_Rowspan in table AD_Field<br>
     * Help: {@literal This value can be used to define, multi-row fields. So fields occupying more then one row.
     *       If this value is not set the normal calculation takes place.}
     * 
     */
    public static final String PROPERTY_OBUIAPPROWSPAN = "obuiappRowspan";

    /**
     * Property obuiappValidator stored in column EM_Obuiapp_Validator in table AD_Field<br>
     * Help: {@literal By default a field have a set of validation functions, isNumber, isBoolean, etc. The
     *       developer can define a custom validator function to check the value entered by a the user.}
     * 
     */
    public static final String PROPERTY_OBUIAPPVALIDATOR = "obuiappValidator";

    /**
     * Property oBUIAPPShowSummary stored in column EM_Obuiapp_Showsummary in table AD_Field<br>
     * Help: {@literal Defines if the Field should show a summary function at the end of the grid}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_OBUIAPPSHOWSUMMARY = "oBUIAPPShowSummary";

    /**
     * Property obuiappSummaryfn stored in column EM_Obuiapp_Summaryfn in table AD_Field<br>
     * Help: {@literal Defines the summary function to use, valid values: sum, avg, max, min, count}
     * 
     */
    public static final String PROPERTY_OBUIAPPSUMMARYFN = "obuiappSummaryfn";

    /**
     * Property obuiselOutfield stored in column EM_Obuisel_Outfield_ID in table AD_Field<br>
     * Help: {@literal The new selector can define a field as 'Out Field'. If a column from a tab is using a
     *       selector with an out field it will get listed. A field from the tab can receive the value of an
     *       Selector Out Field when the user picks a record in the selector. This fields establishes the
     *       connection between a selector out field and a field in the tab.}
     * 
     */
    public static final String PROPERTY_OBUISELOUTFIELD = "obuiselOutfield";

    /**
     * Property obuiappDefaultExpression stored in column EM_Obuiapp_Default_Expression in table AD_Field<br>
     * Help: {@literal Defines a JavaScript expression that will be evaluated in the server side and used as
     *       default value for the property. You can use any type of variable but it must match the property
     *       type, examples:
     *       
     *       true - the property associated is a  boolean
     *       "Hello" - the property associated is a
     *       string
     *       5.3 - the property associated is a number
     *       
     *       You can also access the Openbravo API through the
     *       OB object and do some more complex expressions,
     *       e.g.
     *       
     *       OB.getSession().getAttribute("SESSIONVAR");
     *       
     *       This will retrieve the session variable
     *       SESSIONVAR and use it as default value for the filter of this field.}
     * 
     */
    public static final String PROPERTY_OBUIAPPDEFAULTEXPRESSION = "obuiappDefaultExpression";

    /**
     * Property displayLogicEvaluatedInTheServer stored in column Displaylogic_Server in table AD_Field<br>
     * Help: {@literal A specification of statements which, when evaluated as false in the Server, cause the
     *       field to not appear at all in the Window generated.}
     * 
     */
    public static final String PROPERTY_DISPLAYLOGICEVALUATEDINTHESERVER = "displayLogicEvaluatedInTheServer";

    /**
     * Property aDFieldAccessList stored in table AD_Field
     * 
     */
    public static final String PROPERTY_ADFIELDACCESSLIST = "aDFieldAccessList";

    /**
     * Property aDFieldTrlList stored in table AD_Field
     * 
     */
    public static final String PROPERTY_ADFIELDTRLLIST = "aDFieldTrlList";

    /**
     * Property oBUIAPPGCFieldList stored in table AD_Field
     * 
     */
    public static final String PROPERTY_OBUIAPPGCFIELDLIST = "oBUIAPPGCFieldList";


    public Field() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CENTRALMAINTENANCE, true);
        setDefaultValue(PROPERTY_IGNOREINWAD, false);
        setDefaultValue(PROPERTY_DISPLAYED, true);
        setDefaultValue(PROPERTY_DISPLAYEDLENGTH, (long) 0);
        setDefaultValue(PROPERTY_READONLY, false);
        setDefaultValue(PROPERTY_DISPLAYONSAMELINE, false);
        setDefaultValue(PROPERTY_DISPLAYFIELDONLY, false);
        setDefaultValue(PROPERTY_DISPLAYENCRIPTION, false);
        setDefaultValue(PROPERTY_SHOWINGRIDVIEW, false);
        setDefaultValue(PROPERTY_ISFIRSTFOCUSEDFIELD, false);
        setDefaultValue(PROPERTY_STARTINODDCOLUMN, false);
        setDefaultValue(PROPERTY_STARTNEWLINE, false);
        setDefaultValue(PROPERTY_SHOWNINSTATUSBAR, false);
        setDefaultValue(PROPERTY_OBUIAPPSHOWSUMMARY, false);
        setDefaultValue(PROPERTY_ADFIELDACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADFIELDTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPGCFIELDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Field#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Field#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Field#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Field#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Field#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Field#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Field#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Field#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Field#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Field#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Field#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Field#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Field#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Field#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Field#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Field#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Field#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Field#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Field#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Field#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Field#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Field#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Field#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public Boolean isCentralMaintenance() {
        return (Boolean) get(PROPERTY_CENTRALMAINTENANCE);
    }
    /**
     * @see Field#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public void setCentralMaintenance(Boolean centralMaintenance) {
        set(PROPERTY_CENTRALMAINTENANCE, centralMaintenance);
    }

    /**
     * @see Field#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see Field#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see Field#PROPERTY_COLUMN
     * 
     */
    public Column getColumn() {
        return (Column) get(PROPERTY_COLUMN);
    }
    /**
     * @see Field#PROPERTY_COLUMN
     * 
     */
    public void setColumn(Column column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see Field#PROPERTY_PROPERTY
     * 
     */
    public String getProperty() {
        return (String) get(PROPERTY_PROPERTY);
    }
    /**
     * @see Field#PROPERTY_PROPERTY
     * 
     */
    public void setProperty(String property) {
        set(PROPERTY_PROPERTY, property);
    }

    /**
     * @see Field#PROPERTY_IGNOREINWAD
     * 
     */
    public Boolean isIgnoreInWad() {
        return (Boolean) get(PROPERTY_IGNOREINWAD);
    }
    /**
     * @see Field#PROPERTY_IGNOREINWAD
     * 
     */
    public void setIgnoreInWad(Boolean ignoreInWad) {
        set(PROPERTY_IGNOREINWAD, ignoreInWad);
    }

    /**
     * @see Field#PROPERTY_FIELDGROUP
     * 
     */
    public FieldGroup getFieldGroup() {
        return (FieldGroup) get(PROPERTY_FIELDGROUP);
    }
    /**
     * @see Field#PROPERTY_FIELDGROUP
     * 
     */
    public void setFieldGroup(FieldGroup fieldGroup) {
        set(PROPERTY_FIELDGROUP, fieldGroup);
    }

    /**
     * @see Field#PROPERTY_DISPLAYED
     * 
     */
    public Boolean isDisplayed() {
        return (Boolean) get(PROPERTY_DISPLAYED);
    }
    /**
     * @see Field#PROPERTY_DISPLAYED
     * 
     */
    public void setDisplayed(Boolean displayed) {
        set(PROPERTY_DISPLAYED, displayed);
    }

    /**
     * @see Field#PROPERTY_DISPLAYLOGIC
     * 
     */
    public String getDisplayLogic() {
        return (String) get(PROPERTY_DISPLAYLOGIC);
    }
    /**
     * @see Field#PROPERTY_DISPLAYLOGIC
     * 
     */
    public void setDisplayLogic(String displayLogic) {
        set(PROPERTY_DISPLAYLOGIC, displayLogic);
    }

    /**
     * @see Field#PROPERTY_DISPLAYEDLENGTH
     * 
     */
    public Long getDisplayedLength() {
        return (Long) get(PROPERTY_DISPLAYEDLENGTH);
    }
    /**
     * @see Field#PROPERTY_DISPLAYEDLENGTH
     * 
     */
    public void setDisplayedLength(Long displayedLength) {
        set(PROPERTY_DISPLAYEDLENGTH, displayedLength);
    }

    /**
     * @see Field#PROPERTY_READONLY
     * 
     */
    public Boolean isReadOnly() {
        return (Boolean) get(PROPERTY_READONLY);
    }
    /**
     * @see Field#PROPERTY_READONLY
     * 
     */
    public void setReadOnly(Boolean readOnly) {
        set(PROPERTY_READONLY, readOnly);
    }

    /**
     * @see Field#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see Field#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see Field#PROPERTY_RECORDSORTNO
     * 
     */
    public Long getRecordSortNo() {
        return (Long) get(PROPERTY_RECORDSORTNO);
    }
    /**
     * @see Field#PROPERTY_RECORDSORTNO
     * 
     */
    public void setRecordSortNo(Long recordSortNo) {
        set(PROPERTY_RECORDSORTNO, recordSortNo);
    }

    /**
     * @see Field#PROPERTY_DISPLAYONSAMELINE
     * 
     */
    public Boolean isDisplayOnSameLine() {
        return (Boolean) get(PROPERTY_DISPLAYONSAMELINE);
    }
    /**
     * @see Field#PROPERTY_DISPLAYONSAMELINE
     * 
     */
    public void setDisplayOnSameLine(Boolean displayOnSameLine) {
        set(PROPERTY_DISPLAYONSAMELINE, displayOnSameLine);
    }

    /**
     * @see Field#PROPERTY_DISPLAYFIELDONLY
     * 
     */
    public Boolean isDisplayFieldOnly() {
        return (Boolean) get(PROPERTY_DISPLAYFIELDONLY);
    }
    /**
     * @see Field#PROPERTY_DISPLAYFIELDONLY
     * 
     */
    public void setDisplayFieldOnly(Boolean displayFieldOnly) {
        set(PROPERTY_DISPLAYFIELDONLY, displayFieldOnly);
    }

    /**
     * @see Field#PROPERTY_DISPLAYENCRIPTION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isDisplayEncription() {
        return (Boolean) get(PROPERTY_DISPLAYENCRIPTION);
    }
    /**
     * @see Field#PROPERTY_DISPLAYENCRIPTION
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setDisplayEncription(Boolean displayEncription) {
        set(PROPERTY_DISPLAYENCRIPTION, displayEncription);
    }

    /**
     * @see Field#PROPERTY_SHOWINGRIDVIEW
     * 
     */
    public Boolean isShowInGridView() {
        return (Boolean) get(PROPERTY_SHOWINGRIDVIEW);
    }
    /**
     * @see Field#PROPERTY_SHOWINGRIDVIEW
     * 
     */
    public void setShowInGridView(Boolean showInGridView) {
        set(PROPERTY_SHOWINGRIDVIEW, showInGridView);
    }

    /**
     * @see Field#PROPERTY_ISFIRSTFOCUSEDFIELD
     * 
     */
    public Boolean isFirstFocusedField() {
        return (Boolean) get(PROPERTY_ISFIRSTFOCUSEDFIELD);
    }
    /**
     * @see Field#PROPERTY_ISFIRSTFOCUSEDFIELD
     * 
     */
    public void setFirstFocusedField(Boolean isFirstFocusedField) {
        set(PROPERTY_ISFIRSTFOCUSEDFIELD, isFirstFocusedField);
    }

    /**
     * @see Field#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Field#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Field#PROPERTY_GRIDPOSITION
     * 
     */
    public Long getGridPosition() {
        return (Long) get(PROPERTY_GRIDPOSITION);
    }
    /**
     * @see Field#PROPERTY_GRIDPOSITION
     * 
     */
    public void setGridPosition(Long gridPosition) {
        set(PROPERTY_GRIDPOSITION, gridPosition);
    }

    /**
     * @see Field#PROPERTY_STARTINODDCOLUMN
     * 
     */
    public Boolean isStartinoddcolumn() {
        return (Boolean) get(PROPERTY_STARTINODDCOLUMN);
    }
    /**
     * @see Field#PROPERTY_STARTINODDCOLUMN
     * 
     */
    public void setStartinoddcolumn(Boolean startinoddcolumn) {
        set(PROPERTY_STARTINODDCOLUMN, startinoddcolumn);
    }

    /**
     * @see Field#PROPERTY_STARTNEWLINE
     * 
     */
    public Boolean isStartnewline() {
        return (Boolean) get(PROPERTY_STARTNEWLINE);
    }
    /**
     * @see Field#PROPERTY_STARTNEWLINE
     * 
     */
    public void setStartnewline(Boolean startnewline) {
        set(PROPERTY_STARTNEWLINE, startnewline);
    }

    /**
     * @see Field#PROPERTY_SHOWNINSTATUSBAR
     * 
     */
    public Boolean isShownInStatusBar() {
        return (Boolean) get(PROPERTY_SHOWNINSTATUSBAR);
    }
    /**
     * @see Field#PROPERTY_SHOWNINSTATUSBAR
     * 
     */
    public void setShownInStatusBar(Boolean shownInStatusBar) {
        set(PROPERTY_SHOWNINSTATUSBAR, shownInStatusBar);
    }

    /**
     * @see Field#PROPERTY_ONCHANGEFUNCTION
     * 
     */
    public String getOnChangeFunction() {
        return (String) get(PROPERTY_ONCHANGEFUNCTION);
    }
    /**
     * @see Field#PROPERTY_ONCHANGEFUNCTION
     * 
     */
    public void setOnChangeFunction(String onChangeFunction) {
        set(PROPERTY_ONCHANGEFUNCTION, onChangeFunction);
    }

    /**
     * @see Field#PROPERTY_CLIENTCLASS
     * 
     */
    public String getClientclass() {
        return (String) get(PROPERTY_CLIENTCLASS);
    }
    /**
     * @see Field#PROPERTY_CLIENTCLASS
     * 
     */
    public void setClientclass(String clientclass) {
        set(PROPERTY_CLIENTCLASS, clientclass);
    }

    /**
     * @see Field#PROPERTY_DISPLAYLOGICGRID
     * 
     */
    public String getDisplaylogicgrid() {
        return (String) get(PROPERTY_DISPLAYLOGICGRID);
    }
    /**
     * @see Field#PROPERTY_DISPLAYLOGICGRID
     * 
     */
    public void setDisplaylogicgrid(String displaylogicgrid) {
        set(PROPERTY_DISPLAYLOGICGRID, displaylogicgrid);
    }

    /**
     * @see Field#PROPERTY_OBUIAPPCOLSPAN
     * 
     */
    public Long getObuiappColspan() {
        return (Long) get(PROPERTY_OBUIAPPCOLSPAN);
    }
    /**
     * @see Field#PROPERTY_OBUIAPPCOLSPAN
     * 
     */
    public void setObuiappColspan(Long obuiappColspan) {
        set(PROPERTY_OBUIAPPCOLSPAN, obuiappColspan);
    }

    /**
     * @see Field#PROPERTY_OBUIAPPROWSPAN
     * 
     */
    public Long getObuiappRowspan() {
        return (Long) get(PROPERTY_OBUIAPPROWSPAN);
    }
    /**
     * @see Field#PROPERTY_OBUIAPPROWSPAN
     * 
     */
    public void setObuiappRowspan(Long obuiappRowspan) {
        set(PROPERTY_OBUIAPPROWSPAN, obuiappRowspan);
    }

    /**
     * @see Field#PROPERTY_OBUIAPPVALIDATOR
     * 
     */
    public String getObuiappValidator() {
        return (String) get(PROPERTY_OBUIAPPVALIDATOR);
    }
    /**
     * @see Field#PROPERTY_OBUIAPPVALIDATOR
     * 
     */
    public void setObuiappValidator(String obuiappValidator) {
        set(PROPERTY_OBUIAPPVALIDATOR, obuiappValidator);
    }

    /**
     * @see Field#PROPERTY_OBUIAPPSHOWSUMMARY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isOBUIAPPShowSummary() {
        return (Boolean) get(PROPERTY_OBUIAPPSHOWSUMMARY);
    }
    /**
     * @see Field#PROPERTY_OBUIAPPSHOWSUMMARY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setOBUIAPPShowSummary(Boolean oBUIAPPShowSummary) {
        set(PROPERTY_OBUIAPPSHOWSUMMARY, oBUIAPPShowSummary);
    }

    /**
     * @see Field#PROPERTY_OBUIAPPSUMMARYFN
     * 
     */
    public String getObuiappSummaryfn() {
        return (String) get(PROPERTY_OBUIAPPSUMMARYFN);
    }
    /**
     * @see Field#PROPERTY_OBUIAPPSUMMARYFN
     * 
     */
    public void setObuiappSummaryfn(String obuiappSummaryfn) {
        set(PROPERTY_OBUIAPPSUMMARYFN, obuiappSummaryfn);
    }

    /**
     * @see Field#PROPERTY_OBUISELOUTFIELD
     * 
     */
    public SelectorField getObuiselOutfield() {
        return (SelectorField) get(PROPERTY_OBUISELOUTFIELD);
    }
    /**
     * @see Field#PROPERTY_OBUISELOUTFIELD
     * 
     */
    public void setObuiselOutfield(SelectorField obuiselOutfield) {
        set(PROPERTY_OBUISELOUTFIELD, obuiselOutfield);
    }

    /**
     * @see Field#PROPERTY_OBUIAPPDEFAULTEXPRESSION
     * 
     */
    public String getObuiappDefaultExpression() {
        return (String) get(PROPERTY_OBUIAPPDEFAULTEXPRESSION);
    }
    /**
     * @see Field#PROPERTY_OBUIAPPDEFAULTEXPRESSION
     * 
     */
    public void setObuiappDefaultExpression(String obuiappDefaultExpression) {
        set(PROPERTY_OBUIAPPDEFAULTEXPRESSION, obuiappDefaultExpression);
    }

    /**
     * @see Field#PROPERTY_DISPLAYLOGICEVALUATEDINTHESERVER
     * 
     */
    public String getDisplayLogicEvaluatedInTheServer() {
        return (String) get(PROPERTY_DISPLAYLOGICEVALUATEDINTHESERVER);
    }
    /**
     * @see Field#PROPERTY_DISPLAYLOGICEVALUATEDINTHESERVER
     * 
     */
    public void setDisplayLogicEvaluatedInTheServer(String displayLogicEvaluatedInTheServer) {
        set(PROPERTY_DISPLAYLOGICEVALUATEDINTHESERVER, displayLogicEvaluatedInTheServer);
    }

    /**
     * @see FieldAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FieldAccess> getADFieldAccessList() {
      return (List<FieldAccess>) get(PROPERTY_ADFIELDACCESSLIST);
    }

    /**
     * @see FieldAccess
     * 
     */
    public void setADFieldAccessList(List<FieldAccess> aDFieldAccessList) {
        set(PROPERTY_ADFIELDACCESSLIST, aDFieldAccessList);
    }

    /**
     * Help: {@literal Fields are automatically translated, if centrally maintained.  You only need to translate
     *       not centrally maintained Fields.
     *       Allows the translation of any field of the application. After
     *       performing any edits, the window must be regenerated.}<br>
     * @see FieldTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<FieldTrl> getADFieldTrlList() {
      return (List<FieldTrl>) get(PROPERTY_ADFIELDTRLLIST);
    }

    /**
     * Help: {@literal Fields are automatically translated, if centrally maintained.  You only need to translate
     *       not centrally maintained Fields.
     *       Allows the translation of any field of the application. After
     *       performing any edits, the window must be regenerated.}<br>
     * @see FieldTrl
     * 
     */
    public void setADFieldTrlList(List<FieldTrl> aDFieldTrlList) {
        set(PROPERTY_ADFIELDTRLLIST, aDFieldTrlList);
    }

    /**
     * Help: {@literal All values set here will be used for the current field.}<br>
     * @see GCField
     * 
     */
    @SuppressWarnings("unchecked")
    public List<GCField> getOBUIAPPGCFieldList() {
      return (List<GCField>) get(PROPERTY_OBUIAPPGCFIELDLIST);
    }

    /**
     * Help: {@literal All values set here will be used for the current field.}<br>
     * @see GCField
     * 
     */
    public void setOBUIAPPGCFieldList(List<GCField> oBUIAPPGCFieldList) {
        set(PROPERTY_OBUIAPPGCFIELDLIST, oBUIAPPGCFieldList);
    }

}
