
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
import org.openbravo.client.application.Process;
import org.openbravo.client.kernel.Template;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.domain.Reference;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.datasource.DataSource;
/**
 * Entity class for entity OBUISEL_Selector (stored in table OBUISEL_Selector).
 * <br>
 * Help: {@literal Defines the selector field suggestion box and popup grid.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Selector extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUISEL_Selector";
    public static final String ENTITY_NAME = "OBUISEL_Selector";

    /**
     * Property id stored in column Obuisel_Selector_ID in table OBUISEL_Selector<br>
     * Help: {@literal The unique identifying key for the selector.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUISEL_Selector 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUISEL_Selector 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property module stored in column AD_Module_ID in table OBUISEL_Selector<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property name stored in column Name in table OBUISEL_Selector 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table OBUISEL_Selector<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table OBUISEL_Selector<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property reference stored in column AD_Reference_ID in table OBUISEL_Selector<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property table stored in column AD_Table_ID in table OBUISEL_Selector<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property column stored in column AD_Column_ID in table OBUISEL_Selector<br>
     * Help: {@literal Link to the database column of the table}
     * 
     */
    public static final String PROPERTY_COLUMN = "column";

    /**
     * Property hQLWhereClause stored in column Whereclause in table OBUISEL_Selector<br>
     * Help: {@literal The HQL where clause is added to the query to retrieve the data which is returned by the
     *       datasource. When refering to properties of the entity shown in the selector then use the prefix e.
     *       For example if the selector shows Products then refering to product category works like this:
     *       e.productCategory.name='Ceramics'.}
     * 
     */
    public static final String PROPERTY_HQLWHERECLAUSE = "hQLWhereClause";

    /**
     * Property filterExpression stored in column Filter_Expression in table OBUISEL_Selector<br>
     * Help: {@literal Defines a JavaScript expression evaluated on the server that returns a HQL where clause
     *       string and will be appended in the where clause. HQL where clause is static defined where clause.
     *       The filter expression can use JavaScript to access the Openbravo API evaluate on the fly and return
     *       a HQL dynamically. Note: This expression expression must always return a string value, e.g.
     *       "e.customer = true"}
     * 
     */
    public static final String PROPERTY_FILTEREXPRESSION = "filterExpression";

    /**
     * Property obserdsDatasource stored in column Obserds_Datasource_ID in table OBUISEL_Selector<br>
     * Help: {@literal The datasource provides data from the database or from in-memory data.}
     * 
     */
    public static final String PROPERTY_OBSERDSDATASOURCE = "obserdsDatasource";

    /**
     * Property obclkerTemplate stored in column Obclker_Template_ID in table OBUISEL_Selector<br>
     * Help: {@literal Defines the template which is used to generate the (javascript) code to render the
     *       component.}
     * 
     */
    public static final String PROPERTY_OBCLKERTEMPLATE = "obclkerTemplate";

    /**
     * Property active stored in column Isactive in table OBUISEL_Selector 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUISEL_Selector 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUISEL_Selector 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUISEL_Selector 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUISEL_Selector 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property valuefield stored in column Valuefield_ID in table OBUISEL_Selector<br>
     * Help: {@literal The value of this field will be set in the foreign key column. Normally this field does
     *       not need to be set. If not set then the id of the referenced entity is used.}
     * 
     */
    public static final String PROPERTY_VALUEFIELD = "valuefield";

    /**
     * Property displayfield stored in column Displayfield_ID in table OBUISEL_Selector<br>
     * Help: {@literal The value of this field will be displayed in the selector text input box.}
     * 
     */
    public static final String PROPERTY_DISPLAYFIELD = "displayfield";

    /**
     * Property suggestiontextmatchstyle stored in column Suggestiontextmatchstyle in table OBUISEL_Selector<br>
     * Help: {@literal Defines the text matching logic used in the suggestion box.}
     * 
     */
    public static final String PROPERTY_SUGGESTIONTEXTMATCHSTYLE = "suggestiontextmatchstyle";

    /**
     * Property popuptextmatchstyle stored in column Popuptextmatchstyle in table OBUISEL_Selector<br>
     * Help: {@literal Defines the text matching logic used in the filters in the popup grid.}
     * 
     */
    public static final String PROPERTY_POPUPTEXTMATCHSTYLE = "popuptextmatchstyle";

    /**
     * Property hQL stored in column HQL in table OBUISEL_Selector<br>
     * Help: HQL Query code to populate selector's grid.
     *       
     *       Retrieved columns must have an alias defined, this
     *       alias is used to identify the returned value with a selector field. It is mandatory to set the
     *       "&#64;additional_filters&#64;" String on the main where clause. It is forbidden to include an Order
     *       by clause in the HQL, the order is defined on the Selector fields.
     * 
     */
    public static final String PROPERTY_HQL = "hQL";

    /**
     * Property entityAlias stored in column Entity_Alias in table OBUISEL_Selector<br>
     * Help: In case that the the selector's table has an alias in the HQL it is mandatory to set it on this
     *       field. This alias is used to add some mandatory filters on the Where clause replacing the
     *       &#64;additional_filters&#64; string. Some examples of added filters are: client, organization and
     *       active flag.
     * 
     */
    public static final String PROPERTY_ENTITYALIAS = "entityAlias";

    /**
     * Property customQuery stored in column Custom_Query in table OBUISEL_Selector<br>
     * Help: {@literal Indicates that a custom query is used to fill out the selector's grid.}
     * 
     */
    public static final String PROPERTY_CUSTOMQUERY = "customQuery";

    /**
     * Property processDefintion stored in column Obuiapp_Process_ID in table OBUISEL_Selector<br>
     * Help: {@literal This is the 'Process Definition' that will be opened once the 'Create New' button be
     *       pressed in a selector.
     *       This process should be in charge of the record creation.}
     * 
     */
    public static final String PROPERTY_PROCESSDEFINTION = "processDefintion";

    /**
     * Property sortbyfield stored in column Sortbyfield_ID in table OBUISEL_Selector<br>
     * Help: {@literal The value of this field will be used to order the records in the drop-down of the
     *       selector. If not set, the concatenation of the column record identifier values is used.}
     * 
     */
    public static final String PROPERTY_SORTBYFIELD = "sortbyfield";

    /**
     * Property oBUISELSelectorFieldList stored in table OBUISEL_Selector
     * 
     */
    public static final String PROPERTY_OBUISELSELECTORFIELDLIST = "oBUISELSelectorFieldList";

    /**
     * Property oBUISELSelectorTrlList stored in table OBUISEL_Selector
     * 
     */
    public static final String PROPERTY_OBUISELSELECTORTRLLIST = "oBUISELSelectorTrlList";


    public Selector() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUGGESTIONTEXTMATCHSTYLE, "startsWith");
        setDefaultValue(PROPERTY_POPUPTEXTMATCHSTYLE, "startsWith");
        setDefaultValue(PROPERTY_CUSTOMQUERY, false);
        setDefaultValue(PROPERTY_OBUISELSELECTORFIELDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUISELSELECTORTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Selector#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Selector#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Selector#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Selector#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Selector#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Selector#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Selector#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Selector#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Selector#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Selector#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Selector#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Selector#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Selector#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Selector#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Selector#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see Selector#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see Selector#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see Selector#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see Selector#PROPERTY_COLUMN
     * 
     */
    public Column getColumn() {
        return (Column) get(PROPERTY_COLUMN);
    }
    /**
     * @see Selector#PROPERTY_COLUMN
     * 
     */
    public void setColumn(Column column) {
        set(PROPERTY_COLUMN, column);
    }

    /**
     * @see Selector#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public String getHQLWhereClause() {
        return (String) get(PROPERTY_HQLWHERECLAUSE);
    }
    /**
     * @see Selector#PROPERTY_HQLWHERECLAUSE
     * 
     */
    public void setHQLWhereClause(String hQLWhereClause) {
        set(PROPERTY_HQLWHERECLAUSE, hQLWhereClause);
    }

    /**
     * @see Selector#PROPERTY_FILTEREXPRESSION
     * 
     */
    public String getFilterExpression() {
        return (String) get(PROPERTY_FILTEREXPRESSION);
    }
    /**
     * @see Selector#PROPERTY_FILTEREXPRESSION
     * 
     */
    public void setFilterExpression(String filterExpression) {
        set(PROPERTY_FILTEREXPRESSION, filterExpression);
    }

    /**
     * @see Selector#PROPERTY_OBSERDSDATASOURCE
     * 
     */
    public DataSource getObserdsDatasource() {
        return (DataSource) get(PROPERTY_OBSERDSDATASOURCE);
    }
    /**
     * @see Selector#PROPERTY_OBSERDSDATASOURCE
     * 
     */
    public void setObserdsDatasource(DataSource obserdsDatasource) {
        set(PROPERTY_OBSERDSDATASOURCE, obserdsDatasource);
    }

    /**
     * @see Selector#PROPERTY_OBCLKERTEMPLATE
     * 
     */
    public Template getObclkerTemplate() {
        return (Template) get(PROPERTY_OBCLKERTEMPLATE);
    }
    /**
     * @see Selector#PROPERTY_OBCLKERTEMPLATE
     * 
     */
    public void setObclkerTemplate(Template obclkerTemplate) {
        set(PROPERTY_OBCLKERTEMPLATE, obclkerTemplate);
    }

    /**
     * @see Selector#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Selector#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Selector#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Selector#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Selector#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Selector#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Selector#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Selector#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Selector#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Selector#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Selector#PROPERTY_VALUEFIELD
     * 
     */
    public SelectorField getValuefield() {
        return (SelectorField) get(PROPERTY_VALUEFIELD);
    }
    /**
     * @see Selector#PROPERTY_VALUEFIELD
     * 
     */
    public void setValuefield(SelectorField valuefield) {
        set(PROPERTY_VALUEFIELD, valuefield);
    }

    /**
     * @see Selector#PROPERTY_DISPLAYFIELD
     * 
     */
    public SelectorField getDisplayfield() {
        return (SelectorField) get(PROPERTY_DISPLAYFIELD);
    }
    /**
     * @see Selector#PROPERTY_DISPLAYFIELD
     * 
     */
    public void setDisplayfield(SelectorField displayfield) {
        set(PROPERTY_DISPLAYFIELD, displayfield);
    }

    /**
     * @see Selector#PROPERTY_SUGGESTIONTEXTMATCHSTYLE
     * 
     */
    public String getSuggestiontextmatchstyle() {
        return (String) get(PROPERTY_SUGGESTIONTEXTMATCHSTYLE);
    }
    /**
     * @see Selector#PROPERTY_SUGGESTIONTEXTMATCHSTYLE
     * 
     */
    public void setSuggestiontextmatchstyle(String suggestiontextmatchstyle) {
        set(PROPERTY_SUGGESTIONTEXTMATCHSTYLE, suggestiontextmatchstyle);
    }

    /**
     * @see Selector#PROPERTY_POPUPTEXTMATCHSTYLE
     * 
     */
    public String getPopuptextmatchstyle() {
        return (String) get(PROPERTY_POPUPTEXTMATCHSTYLE);
    }
    /**
     * @see Selector#PROPERTY_POPUPTEXTMATCHSTYLE
     * 
     */
    public void setPopuptextmatchstyle(String popuptextmatchstyle) {
        set(PROPERTY_POPUPTEXTMATCHSTYLE, popuptextmatchstyle);
    }

    /**
     * @see Selector#PROPERTY_HQL
     * 
     */
    public String getHQL() {
        return (String) get(PROPERTY_HQL);
    }
    /**
     * @see Selector#PROPERTY_HQL
     * 
     */
    public void setHQL(String hQL) {
        set(PROPERTY_HQL, hQL);
    }

    /**
     * @see Selector#PROPERTY_ENTITYALIAS
     * 
     */
    public String getEntityAlias() {
        return (String) get(PROPERTY_ENTITYALIAS);
    }
    /**
     * @see Selector#PROPERTY_ENTITYALIAS
     * 
     */
    public void setEntityAlias(String entityAlias) {
        set(PROPERTY_ENTITYALIAS, entityAlias);
    }

    /**
     * @see Selector#PROPERTY_CUSTOMQUERY
     * 
     */
    public Boolean isCustomQuery() {
        return (Boolean) get(PROPERTY_CUSTOMQUERY);
    }
    /**
     * @see Selector#PROPERTY_CUSTOMQUERY
     * 
     */
    public void setCustomQuery(Boolean customQuery) {
        set(PROPERTY_CUSTOMQUERY, customQuery);
    }

    /**
     * @see Selector#PROPERTY_PROCESSDEFINTION
     * 
     */
    public Process getProcessDefintion() {
        return (Process) get(PROPERTY_PROCESSDEFINTION);
    }
    /**
     * @see Selector#PROPERTY_PROCESSDEFINTION
     * 
     */
    public void setProcessDefintion(Process processDefintion) {
        set(PROPERTY_PROCESSDEFINTION, processDefintion);
    }

    /**
     * @see Selector#PROPERTY_SORTBYFIELD
     * 
     */
    public SelectorField getSortbyfield() {
        return (SelectorField) get(PROPERTY_SORTBYFIELD);
    }
    /**
     * @see Selector#PROPERTY_SORTBYFIELD
     * 
     */
    public void setSortbyfield(SelectorField sortbyfield) {
        set(PROPERTY_SORTBYFIELD, sortbyfield);
    }

    /**
     * Help: {@literal Defines the columns which are shown in the suggestion box and in the popup grid.}<br>
     * @see SelectorField
     * 
     */
    @SuppressWarnings("unchecked")
    public List<SelectorField> getOBUISELSelectorFieldList() {
      return (List<SelectorField>) get(PROPERTY_OBUISELSELECTORFIELDLIST);
    }

    /**
     * Help: {@literal Defines the columns which are shown in the suggestion box and in the popup grid.}<br>
     * @see SelectorField
     * 
     */
    public void setOBUISELSelectorFieldList(List<SelectorField> oBUISELSelectorFieldList) {
        set(PROPERTY_OBUISELSELECTORFIELDLIST, oBUISELSelectorFieldList);
    }

    /**
     * Help: {@literal Translation table for selector}<br>
     * @see SelectorTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<SelectorTrl> getOBUISELSelectorTrlList() {
      return (List<SelectorTrl>) get(PROPERTY_OBUISELSELECTORTRLLIST);
    }

    /**
     * Help: {@literal Translation table for selector}<br>
     * @see SelectorTrl
     * 
     */
    public void setOBUISELSelectorTrlList(List<SelectorTrl> oBUISELSelectorTrlList) {
        set(PROPERTY_OBUISELSELECTORTRLLIST, oBUISELSelectorTrlList);
    }

}
