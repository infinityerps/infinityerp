
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
package org.openbravo.client.querylist;

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
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBCQL_QueryColumn (stored in table OBCQL_Query_Column).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OBCQL_QueryColumn extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBCQL_Query_Column";
    public static final String ENTITY_NAME = "OBCQL_QueryColumn";

    /**
     * Property id stored in column OBCQL_Query_Column_ID in table OBCQL_Query_Column<br>
     * Help: {@literal Column of the defined query that it is desired to be shown or exported}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBCQL_Query_Column 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBCQL_Query_Column 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBCQL_Query_Column 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBCQL_Query_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBCQL_Query_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBCQL_Query_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBCQL_Query_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property widgetQuery stored in column OBCQL_Widget_Query_ID in table OBCQL_Query_Column<br>
     * Help: {@literal Identifies the HQL Query definitino of a widget class that implements the Query/List
     *       Superclass widget}
     * 
     */
    public static final String PROPERTY_WIDGETQUERY = "widgetQuery";

    /**
     * Property displayExpression stored in column Display_Expression in table OBCQL_Query_Column<br>
     * Help: {@literal Alias of HQL query column to be shown}
     * 
     */
    public static final String PROPERTY_DISPLAYEXPRESSION = "displayExpression";

    /**
     * Property name stored in column Name in table OBCQL_Query_Column 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property summarizeType stored in column Summarize_Type in table OBCQL_Query_Column<br>
     * Help: {@literal Select the desired summarize option in case the column is numeric and it is desired to
     *       have the sum, average,..}
     * 
     */
    public static final String PROPERTY_SUMMARIZETYPE = "summarizeType";

    /**
     * Property width stored in column Width in table OBCQL_Query_Column<br>
     * Help: {@literal Width of the column in percentage. If the sum of the widths is higher than 100 the grid
     *       will adapt the values. For example, 3 columns with 100 width will take 33% of the grid width each.}
     * 
     */
    public static final String PROPERTY_WIDTH = "width";

    /**
     * Property linkExpression stored in column Link_Expression in table OBCQL_Query_Column<br>
     * Help: {@literal Alias of the HQL Query column with the id required to built the link}
     * 
     */
    public static final String PROPERTY_LINKEXPRESSION = "linkExpression";

    /**
     * Property sequenceNumber stored in column Seqno in table OBCQL_Query_Column<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property reference stored in column AD_Reference_ID in table OBCQL_Query_Column<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property referenceSearchKey stored in column AD_Reference_Value_ID in table OBCQL_Query_Column<br>
     * Help: {@literal The Reference Value indicates where the reference values are stored.  It must be specified
     *       if the data type is Table or List.}
     * 
     */
    public static final String PROPERTY_REFERENCESEARCHKEY = "referenceSearchKey";

    /**
     * Property includeIn stored in column Include_In in table OBCQL_Query_Column<br>
     * Help: {@literal Sets the visibility of the column:
     *       - Widget view, column is shown on all cases.
     *       -
     *       Maximized view, column is shown only in maximized view and included in the exported file.
     *       - Exported
     *       file, column is only included in the exported file.}
     * 
     */
    public static final String PROPERTY_INCLUDEIN = "includeIn";

    /**
     * Property hasLink stored in column Has_Link in table OBCQL_Query_Column<br>
     * Help: {@literal Flag to set that the field of the grid will have a link}
     * 
     */
    public static final String PROPERTY_HASLINK = "hasLink";

    /**
     * Property tab stored in column AD_Tab_ID in table OBCQL_Query_Column<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property canBeFiltered stored in column Can_Be_Filtered in table OBCQL_Query_Column<br>
     * Help: This flag sets whether it is possible to filter the grid by this column or not on maximized view. To
     *       be able to filter it is also needed to set on the HQL Code where clause the display expression
     *       between &#64; symbols that will be replaced on execution by the filter clause in case it is being
     *       filtered or "1=1" when it is not.
     *       
     *       For example: having the following HQL "select product.name as
     *       prodcutName from product". To be able to filter by product name it is needed to include a  "where
     *       &#64;productName&#64;" in the where clause: "select product.name as prodcutName from product where
     *       &#64;productName&#64;"
     * 
     */
    public static final String PROPERTY_CANBEFILTERED = "canBeFiltered";

    /**
     * Property whereClauseLeftPart stored in column Whereclause_Left_Part in table OBCQL_Query_Column<br>
     * Help: {@literal Left part of the where clause needed to filter by a value of this column on the maximized
     *       view.}
     * 
     */
    public static final String PROPERTY_WHERECLAUSELEFTPART = "whereClauseLeftPart";

    /**
     * Property clientClass stored in column Clientclass in table OBCQL_Query_Column
     * 
     */
    public static final String PROPERTY_CLIENTCLASS = "clientClass";

    /**
     * Property oBCQLQueryColumnTrlList stored in table OBCQL_Query_Column
     * 
     */
    public static final String PROPERTY_OBCQLQUERYCOLUMNTRLLIST = "oBCQLQueryColumnTrlList";


    public OBCQL_QueryColumn() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_INCLUDEIN, "W");
        setDefaultValue(PROPERTY_HASLINK, false);
        setDefaultValue(PROPERTY_CANBEFILTERED, false);
        setDefaultValue(PROPERTY_OBCQLQUERYCOLUMNTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_WIDGETQUERY
     * 
     */
    public OBCQL_WidgetQuery getWidgetQuery() {
        return (OBCQL_WidgetQuery) get(PROPERTY_WIDGETQUERY);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_WIDGETQUERY
     * 
     */
    public void setWidgetQuery(OBCQL_WidgetQuery widgetQuery) {
        set(PROPERTY_WIDGETQUERY, widgetQuery);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_DISPLAYEXPRESSION
     * 
     */
    public String getDisplayExpression() {
        return (String) get(PROPERTY_DISPLAYEXPRESSION);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_DISPLAYEXPRESSION
     * 
     */
    public void setDisplayExpression(String displayExpression) {
        set(PROPERTY_DISPLAYEXPRESSION, displayExpression);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_SUMMARIZETYPE
     * 
     */
    public String getSummarizeType() {
        return (String) get(PROPERTY_SUMMARIZETYPE);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_SUMMARIZETYPE
     * 
     */
    public void setSummarizeType(String summarizeType) {
        set(PROPERTY_SUMMARIZETYPE, summarizeType);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_WIDTH
     * 
     */
    public Long getWidth() {
        return (Long) get(PROPERTY_WIDTH);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_WIDTH
     * 
     */
    public void setWidth(Long width) {
        set(PROPERTY_WIDTH, width);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_LINKEXPRESSION
     * 
     */
    public String getLinkExpression() {
        return (String) get(PROPERTY_LINKEXPRESSION);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_LINKEXPRESSION
     * 
     */
    public void setLinkExpression(String linkExpression) {
        set(PROPERTY_LINKEXPRESSION, linkExpression);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public Reference getReferenceSearchKey() {
        return (Reference) get(PROPERTY_REFERENCESEARCHKEY);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_REFERENCESEARCHKEY
     * 
     */
    public void setReferenceSearchKey(Reference referenceSearchKey) {
        set(PROPERTY_REFERENCESEARCHKEY, referenceSearchKey);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_INCLUDEIN
     * 
     */
    public String getIncludeIn() {
        return (String) get(PROPERTY_INCLUDEIN);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_INCLUDEIN
     * 
     */
    public void setIncludeIn(String includeIn) {
        set(PROPERTY_INCLUDEIN, includeIn);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_HASLINK
     * 
     */
    public Boolean isHasLink() {
        return (Boolean) get(PROPERTY_HASLINK);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_HASLINK
     * 
     */
    public void setHasLink(Boolean hasLink) {
        set(PROPERTY_HASLINK, hasLink);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_CANBEFILTERED
     * 
     */
    public Boolean isCanBeFiltered() {
        return (Boolean) get(PROPERTY_CANBEFILTERED);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_CANBEFILTERED
     * 
     */
    public void setCanBeFiltered(Boolean canBeFiltered) {
        set(PROPERTY_CANBEFILTERED, canBeFiltered);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_WHERECLAUSELEFTPART
     * 
     */
    public String getWhereClauseLeftPart() {
        return (String) get(PROPERTY_WHERECLAUSELEFTPART);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_WHERECLAUSELEFTPART
     * 
     */
    public void setWhereClauseLeftPart(String whereClauseLeftPart) {
        set(PROPERTY_WHERECLAUSELEFTPART, whereClauseLeftPart);
    }

    /**
     * @see OBCQL_QueryColumn#PROPERTY_CLIENTCLASS
     * 
     */
    public String getClientClass() {
        return (String) get(PROPERTY_CLIENTCLASS);
    }
    /**
     * @see OBCQL_QueryColumn#PROPERTY_CLIENTCLASS
     * 
     */
    public void setClientClass(String clientClass) {
        set(PROPERTY_CLIENTCLASS, clientClass);
    }

    /**
     * @see QueryColumnTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<QueryColumnTrl> getOBCQLQueryColumnTrlList() {
      return (List<QueryColumnTrl>) get(PROPERTY_OBCQLQUERYCOLUMNTRLLIST);
    }

    /**
     * @see QueryColumnTrl
     * 
     */
    public void setOBCQLQueryColumnTrlList(List<QueryColumnTrl> oBCQLQueryColumnTrlList) {
        set(PROPERTY_OBCQLQUERYCOLUMNTRLLIST, oBCQLQueryColumnTrlList);
    }

}
