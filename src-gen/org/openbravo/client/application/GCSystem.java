
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
 * Entity class for entity OBUIAPP_GC_System (stored in table OBUIAPP_GC_System).
 * <br>
 * Help: {@literal All values set here will be used as the default values for the whole application. If there
     *       is any exception, it can be set in "Grid Configuration at Window/Tab/Field Level" window}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GCSystem extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_GC_System";
    public static final String ENTITY_NAME = "OBUIAPP_GC_System";

    /**
     * Property id stored in column Obuiapp_GC_System_ID in table OBUIAPP_GC_System 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_GC_System 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_GC_System 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_GC_System 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_GC_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_GC_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_GC_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_GC_System 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property filterable stored in column IsFilterable in table OBUIAPP_GC_System<br>
     * Help: {@literal It defines it the filter is allowed. If it is set, all the elements within the system will
     *       take this value as the default one.}
     * 
     */
    public static final String PROPERTY_FILTERABLE = "filterable";

    /**
     * Property sortable stored in column IsSortable in table OBUIAPP_GC_System<br>
     * Help: {@literal It defines it the sort is allowed. If it is set, all the elements within the system will
     *       take this value as the default one.}
     * 
     */
    public static final String PROPERTY_SORTABLE = "sortable";

    /**
     * Property textFilterBehavior stored in column Text_Filter_Behavior in table OBUIAPP_GC_System<br>
     * Help: {@literal Defines the kind of filter (iContains, iStartsWith, etc) that will be applied to this
     *       item. It only works with text fields.}
     * 
     */
    public static final String PROPERTY_TEXTFILTERBEHAVIOR = "textFilterBehavior";

    /**
     * Property thresholdToFilter stored in column Threshold_To_Filter in table OBUIAPP_GC_System<br>
     * Help: {@literal Threshold in miliseconds to trigger the filter on text fields}
     * 
     */
    public static final String PROPERTY_THRESHOLDTOFILTER = "thresholdToFilter";

    /**
     * Property isLazyFiltering stored in column IsLazyFiltering in table OBUIAPP_GC_System<br>
     * Help: {@literal If it is set, the grid won't perform a filter and/or a sorting action until the 'Apply
     *       Filters' button be pressed. In the same way, the summary functions present in the grid won't be
     *       recalculated until this button be pressed.}
     * 
     */
    public static final String PROPERTY_ISLAZYFILTERING = "isLazyFiltering";

    /**
     * Property filterOnChange stored in column Filteronchange in table OBUIAPP_GC_System<br>
     * Help: {@literal If this flag is checked, text columns will trigger a filter each time its content
     *       changes.}
     * 
     */
    public static final String PROPERTY_FILTERONCHANGE = "filterOnChange";

    /**
     * Property allowFilterByIdentifier stored in column Allowfilterbyidentifier in table OBUIAPP_GC_System<br>
     * Help: {@literal If this flag is checked, then the user can filter foreign keys either by selecting some
     *       options from the filter drop down or by entering text manually. If this flag is unchecked, then the
     *       foreign keys would only be filterable by selecting some options from the filter drop down, which has
     *       better performance.}
     * 
     */
    public static final String PROPERTY_ALLOWFILTERBYIDENTIFIER = "allowFilterByIdentifier";

    /**
     * Property isFkDropDownUnfiltered stored in column Isfkdropdownunfiltered in table OBUIAPP_GC_System<br>
     * Help: {@literal If this flag if checked, the filter drop down will show the rows from the referenced table
     *       unfiltered by specific rows being referenced in the referencing table. The filters entered by the
     *       user in the grid filter editor will be applied.}
     * 
     */
    public static final String PROPERTY_ISFKDROPDOWNUNFILTERED = "isFkDropDownUnfiltered";

    /**
     * Property disableFkCombo stored in column Disablefkcombo in table OBUIAPP_GC_System<br>
     * Help: {@literal If this flag is checked, the foreign key combo will be disabled and the column will be
     *       filtered like a standard text column}
     * 
     */
    public static final String PROPERTY_DISABLEFKCOMBO = "disableFkCombo";

    /**
     * Property seqno stored in column Seqno in table OBUIAPP_GC_System<br>
     * Help: {@literal The grid configuration which has the highest sequence number will be the one which
     *       applies.}
     * 
     */
    public static final String PROPERTY_SEQNO = "seqno";

    /**
     * Property allowSummaryFunctions stored in column AllowSummaryFunctions in table OBUIAPP_GC_System<br>
     * Help: {@literal If this flag is enabled then the user can add summary functions into the grid, by using
     *       the column header context menu. If not enabled, then the summary functions menu will not be
     *       available.}
     * 
     */
    public static final String PROPERTY_ALLOWSUMMARYFUNCTIONS = "allowSummaryFunctions";

    /**
     * Property allowTransactionalFilters stored in column AllowTransactionalFilters in table OBUIAPP_GC_System<br>
     * Help: {@literal If this flag is enabled then the transactional filters will be enabled. A transactional
     *       filter is the filter that is applied by default when a transactional window is accessed. It filters
     *       all the documents with status Draft or which date is in the defined "Transaction Range". If not
     *       enabled. then all the transactional filters will be disabled.}
     * 
     */
    public static final String PROPERTY_ALLOWTRANSACTIONALFILTERS = "allowTransactionalFilters";

    /**
     * Property showstoredates stored in column Showstoredates in table OBUIAPP_GC_System<br>
     * Help: {@literal If this flag is enabled, the store local dates of creation and modification will appear as
     *       part of the audit info in the grid and the list views. If not enabled, those field will not appear.}
     * 
     */
    public static final String PROPERTY_SHOWSTOREDATES = "showstoredates";


    public GCSystem() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FILTERABLE, true);
        setDefaultValue(PROPERTY_SORTABLE, true);
        setDefaultValue(PROPERTY_TEXTFILTERBEHAVIOR, "IC");
        setDefaultValue(PROPERTY_THRESHOLDTOFILTER, (long) 500);
        setDefaultValue(PROPERTY_ISLAZYFILTERING, false);
        setDefaultValue(PROPERTY_FILTERONCHANGE, true);
        setDefaultValue(PROPERTY_ALLOWFILTERBYIDENTIFIER, true);
        setDefaultValue(PROPERTY_ISFKDROPDOWNUNFILTERED, false);
        setDefaultValue(PROPERTY_DISABLEFKCOMBO, false);
        setDefaultValue(PROPERTY_ALLOWSUMMARYFUNCTIONS, true);
        setDefaultValue(PROPERTY_ALLOWTRANSACTIONALFILTERS, true);
        setDefaultValue(PROPERTY_SHOWSTOREDATES, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GCSystem#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GCSystem#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GCSystem#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GCSystem#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GCSystem#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GCSystem#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GCSystem#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GCSystem#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GCSystem#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GCSystem#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GCSystem#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GCSystem#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GCSystem#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GCSystem#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GCSystem#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GCSystem#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GCSystem#PROPERTY_FILTERABLE
     * 
     */
    public Boolean isFilterable() {
        return (Boolean) get(PROPERTY_FILTERABLE);
    }
    /**
     * @see GCSystem#PROPERTY_FILTERABLE
     * 
     */
    public void setFilterable(Boolean filterable) {
        set(PROPERTY_FILTERABLE, filterable);
    }

    /**
     * @see GCSystem#PROPERTY_SORTABLE
     * 
     */
    public Boolean isSortable() {
        return (Boolean) get(PROPERTY_SORTABLE);
    }
    /**
     * @see GCSystem#PROPERTY_SORTABLE
     * 
     */
    public void setSortable(Boolean sortable) {
        set(PROPERTY_SORTABLE, sortable);
    }

    /**
     * @see GCSystem#PROPERTY_TEXTFILTERBEHAVIOR
     * 
     */
    public String getTextFilterBehavior() {
        return (String) get(PROPERTY_TEXTFILTERBEHAVIOR);
    }
    /**
     * @see GCSystem#PROPERTY_TEXTFILTERBEHAVIOR
     * 
     */
    public void setTextFilterBehavior(String textFilterBehavior) {
        set(PROPERTY_TEXTFILTERBEHAVIOR, textFilterBehavior);
    }

    /**
     * @see GCSystem#PROPERTY_THRESHOLDTOFILTER
     * 
     */
    public Long getThresholdToFilter() {
        return (Long) get(PROPERTY_THRESHOLDTOFILTER);
    }
    /**
     * @see GCSystem#PROPERTY_THRESHOLDTOFILTER
     * 
     */
    public void setThresholdToFilter(Long thresholdToFilter) {
        set(PROPERTY_THRESHOLDTOFILTER, thresholdToFilter);
    }

    /**
     * @see GCSystem#PROPERTY_ISLAZYFILTERING
     * 
     */
    public Boolean isLazyFiltering() {
        return (Boolean) get(PROPERTY_ISLAZYFILTERING);
    }
    /**
     * @see GCSystem#PROPERTY_ISLAZYFILTERING
     * 
     */
    public void setLazyFiltering(Boolean isLazyFiltering) {
        set(PROPERTY_ISLAZYFILTERING, isLazyFiltering);
    }

    /**
     * @see GCSystem#PROPERTY_FILTERONCHANGE
     * 
     */
    public Boolean isFilterOnChange() {
        return (Boolean) get(PROPERTY_FILTERONCHANGE);
    }
    /**
     * @see GCSystem#PROPERTY_FILTERONCHANGE
     * 
     */
    public void setFilterOnChange(Boolean filterOnChange) {
        set(PROPERTY_FILTERONCHANGE, filterOnChange);
    }

    /**
     * @see GCSystem#PROPERTY_ALLOWFILTERBYIDENTIFIER
     * 
     */
    public Boolean isAllowFilterByIdentifier() {
        return (Boolean) get(PROPERTY_ALLOWFILTERBYIDENTIFIER);
    }
    /**
     * @see GCSystem#PROPERTY_ALLOWFILTERBYIDENTIFIER
     * 
     */
    public void setAllowFilterByIdentifier(Boolean allowFilterByIdentifier) {
        set(PROPERTY_ALLOWFILTERBYIDENTIFIER, allowFilterByIdentifier);
    }

    /**
     * @see GCSystem#PROPERTY_ISFKDROPDOWNUNFILTERED
     * 
     */
    public Boolean isFkDropDownUnfiltered() {
        return (Boolean) get(PROPERTY_ISFKDROPDOWNUNFILTERED);
    }
    /**
     * @see GCSystem#PROPERTY_ISFKDROPDOWNUNFILTERED
     * 
     */
    public void setFkDropDownUnfiltered(Boolean isFkDropDownUnfiltered) {
        set(PROPERTY_ISFKDROPDOWNUNFILTERED, isFkDropDownUnfiltered);
    }

    /**
     * @see GCSystem#PROPERTY_DISABLEFKCOMBO
     * 
     */
    public Boolean isDisableFkCombo() {
        return (Boolean) get(PROPERTY_DISABLEFKCOMBO);
    }
    /**
     * @see GCSystem#PROPERTY_DISABLEFKCOMBO
     * 
     */
    public void setDisableFkCombo(Boolean disableFkCombo) {
        set(PROPERTY_DISABLEFKCOMBO, disableFkCombo);
    }

    /**
     * @see GCSystem#PROPERTY_SEQNO
     * 
     */
    public Long getSeqno() {
        return (Long) get(PROPERTY_SEQNO);
    }
    /**
     * @see GCSystem#PROPERTY_SEQNO
     * 
     */
    public void setSeqno(Long seqno) {
        set(PROPERTY_SEQNO, seqno);
    }

    /**
     * @see GCSystem#PROPERTY_ALLOWSUMMARYFUNCTIONS
     * 
     */
    public Boolean isAllowSummaryFunctions() {
        return (Boolean) get(PROPERTY_ALLOWSUMMARYFUNCTIONS);
    }
    /**
     * @see GCSystem#PROPERTY_ALLOWSUMMARYFUNCTIONS
     * 
     */
    public void setAllowSummaryFunctions(Boolean allowSummaryFunctions) {
        set(PROPERTY_ALLOWSUMMARYFUNCTIONS, allowSummaryFunctions);
    }

    /**
     * @see GCSystem#PROPERTY_ALLOWTRANSACTIONALFILTERS
     * 
     */
    public Boolean isAllowTransactionalFilters() {
        return (Boolean) get(PROPERTY_ALLOWTRANSACTIONALFILTERS);
    }
    /**
     * @see GCSystem#PROPERTY_ALLOWTRANSACTIONALFILTERS
     * 
     */
    public void setAllowTransactionalFilters(Boolean allowTransactionalFilters) {
        set(PROPERTY_ALLOWTRANSACTIONALFILTERS, allowTransactionalFilters);
    }

    /**
     * @see GCSystem#PROPERTY_SHOWSTOREDATES
     * 
     */
    public Boolean isShowstoredates() {
        return (Boolean) get(PROPERTY_SHOWSTOREDATES);
    }
    /**
     * @see GCSystem#PROPERTY_SHOWSTOREDATES
     * 
     */
    public void setShowstoredates(Boolean showstoredates) {
        set(PROPERTY_SHOWSTOREDATES, showstoredates);
    }

}
