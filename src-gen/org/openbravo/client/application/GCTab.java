
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
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_GC_Tab (stored in table OBUIAPP_GC_Tab).
 * <br>
 * Help: {@literal All values set here will be used as the default values for the whole tab. If there is any
     *       exception, it can be set in its child tab.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GCTab extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_GC_Tab";
    public static final String ENTITY_NAME = "OBUIAPP_GC_Tab";

    /**
     * Property id stored in column Obuiapp_Gc_Tab_ID in table OBUIAPP_GC_Tab
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_GC_Tab 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_GC_Tab 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_GC_Tab 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_GC_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_GC_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_GC_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_GC_Tab 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property tab stored in column AD_Tab_ID in table OBUIAPP_GC_Tab<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property filterable stored in column Filterable in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If it is set, it will overwrite the system defaults.}
     * 
     */
    public static final String PROPERTY_FILTERABLE = "filterable";

    /**
     * Property sortable stored in column Sortable in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If it is set, it will overwrite the system defaults.}
     * 
     */
    public static final String PROPERTY_SORTABLE = "sortable";

    /**
     * Property textFilterBehavior stored in column Text_Filter_Behavior in table OBUIAPP_GC_Tab<br>
     * Help: {@literal Defines the kind of filter (iContains, iStartsWith, etc) that will be applied to this
     *       item. It only works with text fields.}
     * 
     */
    public static final String PROPERTY_TEXTFILTERBEHAVIOR = "textFilterBehavior";

    /**
     * Property thresholdToFilter stored in column Threshold_To_Filter in table OBUIAPP_GC_Tab<br>
     * Help: {@literal Threshold in miliseconds to trigger the filter on text fields}
     * 
     */
    public static final String PROPERTY_THRESHOLDTOFILTER = "thresholdToFilter";

    /**
     * Property isLazyFiltering stored in column IsLazyFiltering in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If it is set, the grid won't perform a filter and/or a sorting action until the 'Apply
     *       Filters' button be pressed. In the same way, the summary functions present in the grid won't be
     *       recalculated until this button be pressed.}
     * 
     */
    public static final String PROPERTY_ISLAZYFILTERING = "isLazyFiltering";

    /**
     * Property filterOnChange stored in column Filteronchange in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If this flag is checked, text columns will trigger a filter each time its content
     *       changes.}
     * 
     */
    public static final String PROPERTY_FILTERONCHANGE = "filterOnChange";

    /**
     * Property allowFilterByIdentifier stored in column Allowfilterbyidentifier in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If this flag is checked, then the user can filter foreign keys either by selecting some
     *       options from the filter drop down or by entering text manually. If this flag is unchecked, then the
     *       foreign keys would only be filterable by selecting some options from the filter drop down, which has
     *       better performance.}
     * 
     */
    public static final String PROPERTY_ALLOWFILTERBYIDENTIFIER = "allowFilterByIdentifier";

    /**
     * Property isFkDropDownUnfiltered stored in column Isfkdropdownunfiltered in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If this flag if checked, the filter drop down will show the rows from the referenced table
     *       unfiltered by specific rows being referenced in the referencing table. The filters entered by the
     *       user in the grid filter editor will be applied.}
     * 
     */
    public static final String PROPERTY_ISFKDROPDOWNUNFILTERED = "isFkDropDownUnfiltered";

    /**
     * Property disableFkCombo stored in column Disablefkcombo in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If this flag is checked, the foreign key combo will be disabled and the column will be
     *       filtered like a standard text column}
     * 
     */
    public static final String PROPERTY_DISABLEFKCOMBO = "disableFkCombo";

    /**
     * Property seqno stored in column Seqno in table OBUIAPP_GC_Tab<br>
     * Help: {@literal The grid configuration which has the highest sequence number will be the one which
     *       applies.}
     * 
     */
    public static final String PROPERTY_SEQNO = "seqno";

    /**
     * Property allowSummaryFunctions stored in column AllowSummaryFunctions in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If this flag is enabled then the user can add summary functions into the grid, by using
     *       the column header context menu. If not enabled, then the summary functions menu will not be
     *       available.}
     * 
     */
    public static final String PROPERTY_ALLOWSUMMARYFUNCTIONS = "allowSummaryFunctions";

    /**
     * Property showstoredates stored in column Showstoredates in table OBUIAPP_GC_Tab<br>
     * Help: {@literal If this flag is enabled, the store local dates of creation and modification will appear as
     *       part of the audit info in the grid and the list views. If not enabled, those field will not appear.}
     * 
     */
    public static final String PROPERTY_SHOWSTOREDATES = "showstoredates";

    /**
     * Property oBUIAPPGCFieldList stored in table OBUIAPP_GC_Tab
     * 
     */
    public static final String PROPERTY_OBUIAPPGCFIELDLIST = "oBUIAPPGCFieldList";


    public GCTab() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FILTERABLE, "D");
        setDefaultValue(PROPERTY_SORTABLE, "D");
        setDefaultValue(PROPERTY_TEXTFILTERBEHAVIOR, "D");
        setDefaultValue(PROPERTY_ISLAZYFILTERING, "D");
        setDefaultValue(PROPERTY_FILTERONCHANGE, "D");
        setDefaultValue(PROPERTY_ALLOWFILTERBYIDENTIFIER, "D");
        setDefaultValue(PROPERTY_ISFKDROPDOWNUNFILTERED, "D");
        setDefaultValue(PROPERTY_DISABLEFKCOMBO, "D");
        setDefaultValue(PROPERTY_SEQNO, (long) 10);
        setDefaultValue(PROPERTY_ALLOWSUMMARYFUNCTIONS, "D");
        setDefaultValue(PROPERTY_SHOWSTOREDATES, "D");
        setDefaultValue(PROPERTY_OBUIAPPGCFIELDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GCTab#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GCTab#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GCTab#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GCTab#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GCTab#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GCTab#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GCTab#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GCTab#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GCTab#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GCTab#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GCTab#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GCTab#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GCTab#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GCTab#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GCTab#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GCTab#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GCTab#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see GCTab#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see GCTab#PROPERTY_FILTERABLE
     * 
     */
    public String getFilterable() {
        return (String) get(PROPERTY_FILTERABLE);
    }
    /**
     * @see GCTab#PROPERTY_FILTERABLE
     * 
     */
    public void setFilterable(String filterable) {
        set(PROPERTY_FILTERABLE, filterable);
    }

    /**
     * @see GCTab#PROPERTY_SORTABLE
     * 
     */
    public String getSortable() {
        return (String) get(PROPERTY_SORTABLE);
    }
    /**
     * @see GCTab#PROPERTY_SORTABLE
     * 
     */
    public void setSortable(String sortable) {
        set(PROPERTY_SORTABLE, sortable);
    }

    /**
     * @see GCTab#PROPERTY_TEXTFILTERBEHAVIOR
     * 
     */
    public String getTextFilterBehavior() {
        return (String) get(PROPERTY_TEXTFILTERBEHAVIOR);
    }
    /**
     * @see GCTab#PROPERTY_TEXTFILTERBEHAVIOR
     * 
     */
    public void setTextFilterBehavior(String textFilterBehavior) {
        set(PROPERTY_TEXTFILTERBEHAVIOR, textFilterBehavior);
    }

    /**
     * @see GCTab#PROPERTY_THRESHOLDTOFILTER
     * 
     */
    public Long getThresholdToFilter() {
        return (Long) get(PROPERTY_THRESHOLDTOFILTER);
    }
    /**
     * @see GCTab#PROPERTY_THRESHOLDTOFILTER
     * 
     */
    public void setThresholdToFilter(Long thresholdToFilter) {
        set(PROPERTY_THRESHOLDTOFILTER, thresholdToFilter);
    }

    /**
     * @see GCTab#PROPERTY_ISLAZYFILTERING
     * 
     */
    public String getIsLazyFiltering() {
        return (String) get(PROPERTY_ISLAZYFILTERING);
    }
    /**
     * @see GCTab#PROPERTY_ISLAZYFILTERING
     * 
     */
    public void setIsLazyFiltering(String isLazyFiltering) {
        set(PROPERTY_ISLAZYFILTERING, isLazyFiltering);
    }

    /**
     * @see GCTab#PROPERTY_FILTERONCHANGE
     * 
     */
    public String getFilterOnChange() {
        return (String) get(PROPERTY_FILTERONCHANGE);
    }
    /**
     * @see GCTab#PROPERTY_FILTERONCHANGE
     * 
     */
    public void setFilterOnChange(String filterOnChange) {
        set(PROPERTY_FILTERONCHANGE, filterOnChange);
    }

    /**
     * @see GCTab#PROPERTY_ALLOWFILTERBYIDENTIFIER
     * 
     */
    public String getAllowFilterByIdentifier() {
        return (String) get(PROPERTY_ALLOWFILTERBYIDENTIFIER);
    }
    /**
     * @see GCTab#PROPERTY_ALLOWFILTERBYIDENTIFIER
     * 
     */
    public void setAllowFilterByIdentifier(String allowFilterByIdentifier) {
        set(PROPERTY_ALLOWFILTERBYIDENTIFIER, allowFilterByIdentifier);
    }

    /**
     * @see GCTab#PROPERTY_ISFKDROPDOWNUNFILTERED
     * 
     */
    public String getIsFkDropDownUnfiltered() {
        return (String) get(PROPERTY_ISFKDROPDOWNUNFILTERED);
    }
    /**
     * @see GCTab#PROPERTY_ISFKDROPDOWNUNFILTERED
     * 
     */
    public void setIsFkDropDownUnfiltered(String isFkDropDownUnfiltered) {
        set(PROPERTY_ISFKDROPDOWNUNFILTERED, isFkDropDownUnfiltered);
    }

    /**
     * @see GCTab#PROPERTY_DISABLEFKCOMBO
     * 
     */
    public String getDisableFkCombo() {
        return (String) get(PROPERTY_DISABLEFKCOMBO);
    }
    /**
     * @see GCTab#PROPERTY_DISABLEFKCOMBO
     * 
     */
    public void setDisableFkCombo(String disableFkCombo) {
        set(PROPERTY_DISABLEFKCOMBO, disableFkCombo);
    }

    /**
     * @see GCTab#PROPERTY_SEQNO
     * 
     */
    public Long getSeqno() {
        return (Long) get(PROPERTY_SEQNO);
    }
    /**
     * @see GCTab#PROPERTY_SEQNO
     * 
     */
    public void setSeqno(Long seqno) {
        set(PROPERTY_SEQNO, seqno);
    }

    /**
     * @see GCTab#PROPERTY_ALLOWSUMMARYFUNCTIONS
     * 
     */
    public String getAllowSummaryFunctions() {
        return (String) get(PROPERTY_ALLOWSUMMARYFUNCTIONS);
    }
    /**
     * @see GCTab#PROPERTY_ALLOWSUMMARYFUNCTIONS
     * 
     */
    public void setAllowSummaryFunctions(String allowSummaryFunctions) {
        set(PROPERTY_ALLOWSUMMARYFUNCTIONS, allowSummaryFunctions);
    }

    /**
     * @see GCTab#PROPERTY_SHOWSTOREDATES
     * 
     */
    public String getShowstoredates() {
        return (String) get(PROPERTY_SHOWSTOREDATES);
    }
    /**
     * @see GCTab#PROPERTY_SHOWSTOREDATES
     * 
     */
    public void setShowstoredates(String showstoredates) {
        set(PROPERTY_SHOWSTOREDATES, showstoredates);
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
