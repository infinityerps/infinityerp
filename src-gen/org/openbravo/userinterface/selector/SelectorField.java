
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
package org.openbravo.userinterface.selector;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.domain.Reference;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.datasource.DatasourceField;
/**
 * Entity class for entity OBUISEL_Selector_Field (stored in table OBUISEL_Selector_Field).
 * <br>
 * Help: {@literal Defines the columns which are shown in the suggestion box and in the popup grid.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class SelectorField extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUISEL_Selector_Field";
    public static final String ENTITY_NAME = "OBUISEL_Selector_Field";

    /**
     * Property id stored in column Obuisel_Selector_Field_ID in table OBUISEL_Selector_Field<br>
     * Help: {@literal Unique identifying key for the selector field record.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property obuiselSelector stored in column Obuisel_Selector_ID in table OBUISEL_Selector_Field<br>
     * Help: {@literal The unique identifying key for the selector.}
     * 
     */
    public static final String PROPERTY_OBUISELSELECTOR = "obuiselSelector";

    /**
     * Property client stored in column AD_Client_ID in table OBUISEL_Selector_Field 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUISEL_Selector_Field 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property module stored in column AD_Module_ID in table OBUISEL_Selector_Field<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property column stored in column AD_Column_ID in table OBUISEL_Selector_Field<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property name stored in column Name in table OBUISEL_Selector_Field 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBUISEL_Selector_Field<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table OBUISEL_Selector_Field<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property property stored in column Property in table OBUISEL_Selector_Field<br>
     * Help: {@literal Path/name of the property to show in the selector}
     * 
     */
    public static final String PROPERTY_PROPERTY = "property";

    /**
     * Property obserdsDatasourceField stored in column Obserds_Datasource_Field_ID in table OBUISEL_Selector_Field<br>
     * Help: {@literal The datasource field is part of the datasource definition.}
     * 
     */
    public static final String PROPERTY_OBSERDSDATASOURCEFIELD = "obserdsDatasourceField";

    /**
     * Property centralMaintenance stored in column Iscentrallymaintained in table OBUISEL_Selector_Field<br>
     * Help: {@literal The Centrally Maintained checkbox indicates if the Name, Description and Help maintained
     *       in 'System Element' table  or 'Window' table.}
     * 
     */
    public static final String PROPERTY_CENTRALMAINTENANCE = "centralMaintenance";

    /**
     * Property sortable stored in column Sort in table OBUISEL_Selector_Field<br>
     * Help: {@literal Allow sorting by this field in the popup grid.}
     * 
     */
    public static final String PROPERTY_SORTABLE = "sortable";

    /**
     * Property filterable stored in column Filter in table OBUISEL_Selector_Field<br>
     * Help: {@literal Make it possible to filter in the grid using this field.}
     * 
     */
    public static final String PROPERTY_FILTERABLE = "filterable";

    /**
     * Property searchinsuggestionbox stored in column Searchinsuggestionbox in table OBUISEL_Selector_Field<br>
     * Help: {@literal Defines if the field is used to search when retrieving values in the suggestion box.}
     * 
     */
    public static final String PROPERTY_SEARCHINSUGGESTIONBOX = "searchinsuggestionbox";

    /**
     * Property showingrid stored in column Showingrid in table OBUISEL_Selector_Field<br>
     * Help: {@literal Defines if the field is shown in the popup grid.}
     * 
     */
    public static final String PROPERTY_SHOWINGRID = "showingrid";

    /**
     * Property sortno stored in column Sortno in table OBUISEL_Selector_Field
     * 
     */
    public static final String PROPERTY_SORTNO = "sortno";

    /**
     * Property active stored in column Isactive in table OBUISEL_Selector_Field 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUISEL_Selector_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUISEL_Selector_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUISEL_Selector_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUISEL_Selector_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property isoutfield stored in column Isoutfield in table OBUISEL_Selector_Field
     * 
     */
    public static final String PROPERTY_ISOUTFIELD = "isoutfield";

    /**
     * Property defaultExpression stored in column Default_Expression in table OBUISEL_Selector_Field<br>
     * Help: {@literal Defines a JavaScript expression that will be evaluated in the server side and used as
     *       default value for the property. You can use any type of variable but it must match the property
     *       type, examples:
     *       
     *       true - the property associated is boolean
     *       "Hello" - the propery associated is
     *       string
     *       5.3 - the property associated is numeric
     *       
     *       You can also access the Openbravo API through the
     *       OB object and do some more complex expressions,
     *       e.g.
     *       
     *       OB.getSession().getAttribute("SESSIONVAR");
     *       
     *       This will retrieve the session variable
     *       SESSIONVAR and use it as default value for the selector field}
     * 
     */
    public static final String PROPERTY_DEFAULTEXPRESSION = "defaultExpression";

    /**
     * Property suffix stored in column Suffix in table OBUISEL_Selector_Field<br>
     * Help: {@literal The Suffix indicates the characters to append to the document number.}
     * 
     */
    public static final String PROPERTY_SUFFIX = "suffix";

    /**
     * Property displayColumnAlias stored in column Display_Expression in table OBUISEL_Selector_Field<br>
     * Help: {@literal Alias of the HQL query column to be shown}
     * 
     */
    public static final String PROPERTY_DISPLAYCOLUMNALIAS = "displayColumnAlias";

    /**
     * Property clauseLeftPart stored in column Clause_Left_Part in table OBUISEL_Selector_Field<br>
     * Help: {@literal Left part of a clause to be used on the where or order by clauses of the HQL.}
     * 
     */
    public static final String PROPERTY_CLAUSELEFTPART = "clauseLeftPart";

    /**
     * Property reference stored in column AD_Reference_ID in table OBUISEL_Selector_Field<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property showInPicklist stored in column Showinpicklist in table OBUISEL_Selector_Field<br>
     * Help: {@literal Sets additional fields to appear on the selectors pick list.}
     * 
     */
    public static final String PROPERTY_SHOWINPICKLIST = "showInPicklist";

    /**
     * Property oBUISELSelectorFieldTrlList stored in table OBUISEL_Selector_Field
     * 
     */
    public static final String PROPERTY_OBUISELSELECTORFIELDTRLLIST = "oBUISELSelectorFieldTrlList";


    public SelectorField() {
        setDefaultValue(PROPERTY_CENTRALMAINTENANCE, true);
        setDefaultValue(PROPERTY_SORTABLE, true);
        setDefaultValue(PROPERTY_FILTERABLE, true);
        setDefaultValue(PROPERTY_SEARCHINSUGGESTIONBOX, false);
        setDefaultValue(PROPERTY_SHOWINGRID, true);
        setDefaultValue(PROPERTY_SORTNO, (long) 0);
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISOUTFIELD, false);
        setDefaultValue(PROPERTY_SHOWINPICKLIST, false);
        setDefaultValue(PROPERTY_OBUISELSELECTORFIELDTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see SelectorField#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see SelectorField#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see SelectorField#PROPERTY_OBUISELSELECTOR
     * 
     */
    public Selector getObuiselSelector() {
        return (Selector) get(PROPERTY_OBUISELSELECTOR);
    }
    /**
     * @see SelectorField#PROPERTY_OBUISELSELECTOR
     * 
     */
    public void setObuiselSelector(Selector obuiselSelector) {
        set(PROPERTY_OBUISELSELECTOR, obuiselSelector);
    }

    /**
     * @see SelectorField#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see SelectorField#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see SelectorField#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see SelectorField#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see SelectorField#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see SelectorField#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see SelectorField#PROPERTY_COLUMN
     * 
     */
    public Column getColumn() {
        return (Column) get(PROPERTY_COLUMN);
    }
    /**
     * @see SelectorField#PROPERTY_COLUMN
     * 
     */
    public void setColumn(Column column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see SelectorField#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see SelectorField#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see SelectorField#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see SelectorField#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see SelectorField#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see SelectorField#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see SelectorField#PROPERTY_PROPERTY
     * 
     */
    public String getProperty() {
        return (String) get(PROPERTY_PROPERTY);
    }
    /**
     * @see SelectorField#PROPERTY_PROPERTY
     * 
     */
    public void setProperty(String property) {
        set(PROPERTY_PROPERTY, property);
    }

    /**
     * @see SelectorField#PROPERTY_OBSERDSDATASOURCEFIELD
     * 
     */
    public DatasourceField getObserdsDatasourceField() {
        return (DatasourceField) get(PROPERTY_OBSERDSDATASOURCEFIELD);
    }
    /**
     * @see SelectorField#PROPERTY_OBSERDSDATASOURCEFIELD
     * 
     */
    public void setObserdsDatasourceField(DatasourceField obserdsDatasourceField) {
        set(PROPERTY_OBSERDSDATASOURCEFIELD, obserdsDatasourceField);
    }

    /**
     * @see SelectorField#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public Boolean isCentralMaintenance() {
        return (Boolean) get(PROPERTY_CENTRALMAINTENANCE);
    }
    /**
     * @see SelectorField#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public void setCentralMaintenance(Boolean centralMaintenance) {
        set(PROPERTY_CENTRALMAINTENANCE, centralMaintenance);
    }

    /**
     * @see SelectorField#PROPERTY_SORTABLE
     * 
     */
    public Boolean isSortable() {
        return (Boolean) get(PROPERTY_SORTABLE);
    }
    /**
     * @see SelectorField#PROPERTY_SORTABLE
     * 
     */
    public void setSortable(Boolean sortable) {
        set(PROPERTY_SORTABLE, sortable);
    }

    /**
     * @see SelectorField#PROPERTY_FILTERABLE
     * 
     */
    public Boolean isFilterable() {
        return (Boolean) get(PROPERTY_FILTERABLE);
    }
    /**
     * @see SelectorField#PROPERTY_FILTERABLE
     * 
     */
    public void setFilterable(Boolean filterable) {
        set(PROPERTY_FILTERABLE, filterable);
    }

    /**
     * @see SelectorField#PROPERTY_SEARCHINSUGGESTIONBOX
     * 
     */
    public Boolean isSearchinsuggestionbox() {
        return (Boolean) get(PROPERTY_SEARCHINSUGGESTIONBOX);
    }
    /**
     * @see SelectorField#PROPERTY_SEARCHINSUGGESTIONBOX
     * 
     */
    public void setSearchinsuggestionbox(Boolean searchinsuggestionbox) {
        set(PROPERTY_SEARCHINSUGGESTIONBOX, searchinsuggestionbox);
    }

    /**
     * @see SelectorField#PROPERTY_SHOWINGRID
     * 
     */
    public Boolean isShowingrid() {
        return (Boolean) get(PROPERTY_SHOWINGRID);
    }
    /**
     * @see SelectorField#PROPERTY_SHOWINGRID
     * 
     */
    public void setShowingrid(Boolean showingrid) {
        set(PROPERTY_SHOWINGRID, showingrid);
    }

    /**
     * @see SelectorField#PROPERTY_SORTNO
     * 
     */
    public Long getSortno() {
        return (Long) get(PROPERTY_SORTNO);
    }
    /**
     * @see SelectorField#PROPERTY_SORTNO
     * 
     */
    public void setSortno(Long sortno) {
        set(PROPERTY_SORTNO, sortno);
    }

    /**
     * @see SelectorField#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see SelectorField#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see SelectorField#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see SelectorField#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see SelectorField#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see SelectorField#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see SelectorField#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see SelectorField#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see SelectorField#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see SelectorField#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see SelectorField#PROPERTY_ISOUTFIELD
     * 
     */
    public Boolean isOutfield() {
        return (Boolean) get(PROPERTY_ISOUTFIELD);
    }
    /**
     * @see SelectorField#PROPERTY_ISOUTFIELD
     * 
     */
    public void setOutfield(Boolean isoutfield) {
        set(PROPERTY_ISOUTFIELD, isoutfield);
    }

    /**
     * @see SelectorField#PROPERTY_DEFAULTEXPRESSION
     * 
     */
    public String getDefaultExpression() {
        return (String) get(PROPERTY_DEFAULTEXPRESSION);
    }
    /**
     * @see SelectorField#PROPERTY_DEFAULTEXPRESSION
     * 
     */
    public void setDefaultExpression(String defaultExpression) {
        set(PROPERTY_DEFAULTEXPRESSION, defaultExpression);
    }

    /**
     * @see SelectorField#PROPERTY_SUFFIX
     * 
     */
    public String getSuffix() {
        return (String) get(PROPERTY_SUFFIX);
    }
    /**
     * @see SelectorField#PROPERTY_SUFFIX
     * 
     */
    public void setSuffix(String suffix) {
        set(PROPERTY_SUFFIX, suffix);
    }

    /**
     * @see SelectorField#PROPERTY_DISPLAYCOLUMNALIAS
     * 
     */
    public String getDisplayColumnAlias() {
        return (String) get(PROPERTY_DISPLAYCOLUMNALIAS);
    }
    /**
     * @see SelectorField#PROPERTY_DISPLAYCOLUMNALIAS
     * 
     */
    public void setDisplayColumnAlias(String displayColumnAlias) {
        set(PROPERTY_DISPLAYCOLUMNALIAS, displayColumnAlias);
    }

    /**
     * @see SelectorField#PROPERTY_CLAUSELEFTPART
     * 
     */
    public String getClauseLeftPart() {
        return (String) get(PROPERTY_CLAUSELEFTPART);
    }
    /**
     * @see SelectorField#PROPERTY_CLAUSELEFTPART
     * 
     */
    public void setClauseLeftPart(String clauseLeftPart) {
        set(PROPERTY_CLAUSELEFTPART, clauseLeftPart);
    }

    /**
     * @see SelectorField#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see SelectorField#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see SelectorField#PROPERTY_SHOWINPICKLIST
     * 
     */
    public Boolean isShowInPicklist() {
        return (Boolean) get(PROPERTY_SHOWINPICKLIST);
    }
    /**
     * @see SelectorField#PROPERTY_SHOWINPICKLIST
     * 
     */
    public void setShowInPicklist(Boolean showInPicklist) {
        set(PROPERTY_SHOWINPICKLIST, showInPicklist);
    }

    /**
     * Help: {@literal Translation table for Selector Field}<br>
     * @see SelectorFieldTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<SelectorFieldTrl> getOBUISELSelectorFieldTrlList() {
      return (List<SelectorFieldTrl>) get(PROPERTY_OBUISELSELECTORFIELDTRLLIST);
    }

    /**
     * Help: {@literal Translation table for Selector Field}<br>
     * @see SelectorFieldTrl
     * 
     */
    public void setOBUISELSelectorFieldTrlList(List<SelectorFieldTrl> oBUISELSelectorFieldTrlList) {
        set(PROPERTY_OBUISELSELECTORFIELDTRLLIST, oBUISELSelectorFieldTrlList);
    }

}
