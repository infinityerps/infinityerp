
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
import org.openbravo.model.ad.ui.Field;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_GC_Field (stored in table OBUIAPP_GC_Field).
 * <br>
 * Help: {@literal All values set here will be used for the current field.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GCField extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_GC_Field";
    public static final String ENTITY_NAME = "OBUIAPP_GC_Field";

    /**
     * Property id stored in column Obuiapp_Gc_Field_ID in table OBUIAPP_GC_Field 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_GC_Field 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_GC_Field 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_GC_Field 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_GC_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_GC_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_GC_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_GC_Field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property obuiappGcTab stored in column Obuiapp_Gc_Tab_ID in table OBUIAPP_GC_Field
     * 
     */
    public static final String PROPERTY_OBUIAPPGCTAB = "obuiappGcTab";

    /**
     * Property field stored in column AD_Field_ID in table OBUIAPP_GC_Field<br>
     * Help: {@literal The Field identifies a field on a database table.}
     * 
     */
    public static final String PROPERTY_FIELD = "field";

    /**
     * Property filterable stored in column Filterable in table OBUIAPP_GC_Field<br>
     * Help: {@literal If it is set, it will overwrite the system defaults.}
     * 
     */
    public static final String PROPERTY_FILTERABLE = "filterable";

    /**
     * Property sortable stored in column Sortable in table OBUIAPP_GC_Field<br>
     * Help: {@literal If it is set, it will overwrite the system defaults.}
     * 
     */
    public static final String PROPERTY_SORTABLE = "sortable";

    /**
     * Property textFilterBehavior stored in column Text_Filter_Behavior in table OBUIAPP_GC_Field<br>
     * Help: {@literal Defines the kind of filter (iContains, iStartsWith, etc) that will be applied to this
     *       item. It only works with text fields.}
     * 
     */
    public static final String PROPERTY_TEXTFILTERBEHAVIOR = "textFilterBehavior";

    /**
     * Property filterOnChange stored in column Filteronchange in table OBUIAPP_GC_Field<br>
     * Help: {@literal If this flag is checked, text columns will trigger a filter each time its content
     *       changes.}
     * 
     */
    public static final String PROPERTY_FILTERONCHANGE = "filterOnChange";

    /**
     * Property thresholdToFilter stored in column Threshold_To_Filter in table OBUIAPP_GC_Field<br>
     * Help: {@literal Threshold in miliseconds to trigger the filter on text fields}
     * 
     */
    public static final String PROPERTY_THRESHOLDTOFILTER = "thresholdToFilter";

    /**
     * Property allowFilterByIdentifier stored in column Allowfilterbyidentifier in table OBUIAPP_GC_Field<br>
     * Help: {@literal If this flag is checked, then the user can filter foreign keys either by selecting some
     *       options from the filter drop down or by entering text manually. If this flag is unchecked, then the
     *       foreign keys would only be filterable by selecting some options from the filter drop down, which has
     *       better performance.}
     * 
     */
    public static final String PROPERTY_ALLOWFILTERBYIDENTIFIER = "allowFilterByIdentifier";

    /**
     * Property isFkDropdownUnfiltered stored in column Isfkdropdownunfiltered in table OBUIAPP_GC_Field<br>
     * Help: {@literal If this flag if checked, the filter drop down will show the rows from the referenced table
     *       unfiltered by specific rows being referenced in the referencing table. The filters entered by the
     *       user in the grid filter editor will be applied.}
     * 
     */
    public static final String PROPERTY_ISFKDROPDOWNUNFILTERED = "isFkDropdownUnfiltered";

    /**
     * Property disableFkCombo stored in column Disablefkcombo in table OBUIAPP_GC_Field<br>
     * Help: {@literal If this flag is checked, the foreign key combo will be disabled and the column will be
     *       filtered like a standard text column}
     * 
     */
    public static final String PROPERTY_DISABLEFKCOMBO = "disableFkCombo";


    public GCField() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FILTERABLE, "D");
        setDefaultValue(PROPERTY_SORTABLE, "D");
        setDefaultValue(PROPERTY_TEXTFILTERBEHAVIOR, "D");
        setDefaultValue(PROPERTY_FILTERONCHANGE, "D");
        setDefaultValue(PROPERTY_ALLOWFILTERBYIDENTIFIER, "D");
        setDefaultValue(PROPERTY_ISFKDROPDOWNUNFILTERED, "D");
        setDefaultValue(PROPERTY_DISABLEFKCOMBO, "D");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see GCField#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see GCField#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see GCField#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see GCField#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see GCField#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see GCField#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see GCField#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see GCField#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see GCField#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see GCField#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see GCField#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see GCField#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see GCField#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see GCField#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see GCField#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see GCField#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see GCField#PROPERTY_OBUIAPPGCTAB
     * 
     */
    public GCTab getObuiappGcTab() {
        return (GCTab) get(PROPERTY_OBUIAPPGCTAB);
    }
    /**
     * @see GCField#PROPERTY_OBUIAPPGCTAB
     * 
     */
    public void setObuiappGcTab(GCTab obuiappGcTab) {
        set(PROPERTY_OBUIAPPGCTAB, obuiappGcTab);
    }

    /**
     * @see GCField#PROPERTY_FIELD
     * 
     */
    public Field getField() {
        return (Field) get(PROPERTY_FIELD);
    }
    /**
     * @see GCField#PROPERTY_FIELD
     * 
     */
    public void setField(Field field) {
        set(PROPERTY_FIELD, field);
    }

    /**
     * @see GCField#PROPERTY_FILTERABLE
     * 
     */
    public String getFilterable() {
        return (String) get(PROPERTY_FILTERABLE);
    }
    /**
     * @see GCField#PROPERTY_FILTERABLE
     * 
     */
    public void setFilterable(String filterable) {
        set(PROPERTY_FILTERABLE, filterable);
    }

    /**
     * @see GCField#PROPERTY_SORTABLE
     * 
     */
    public String getSortable() {
        return (String) get(PROPERTY_SORTABLE);
    }
    /**
     * @see GCField#PROPERTY_SORTABLE
     * 
     */
    public void setSortable(String sortable) {
        set(PROPERTY_SORTABLE, sortable);
    }

    /**
     * @see GCField#PROPERTY_TEXTFILTERBEHAVIOR
     * 
     */
    public String getTextFilterBehavior() {
        return (String) get(PROPERTY_TEXTFILTERBEHAVIOR);
    }
    /**
     * @see GCField#PROPERTY_TEXTFILTERBEHAVIOR
     * 
     */
    public void setTextFilterBehavior(String textFilterBehavior) {
        set(PROPERTY_TEXTFILTERBEHAVIOR, textFilterBehavior);
    }

    /**
     * @see GCField#PROPERTY_FILTERONCHANGE
     * 
     */
    public String getFilterOnChange() {
        return (String) get(PROPERTY_FILTERONCHANGE);
    }
    /**
     * @see GCField#PROPERTY_FILTERONCHANGE
     * 
     */
    public void setFilterOnChange(String filterOnChange) {
        set(PROPERTY_FILTERONCHANGE, filterOnChange);
    }

    /**
     * @see GCField#PROPERTY_THRESHOLDTOFILTER
     * 
     */
    public Long getThresholdToFilter() {
        return (Long) get(PROPERTY_THRESHOLDTOFILTER);
    }
    /**
     * @see GCField#PROPERTY_THRESHOLDTOFILTER
     * 
     */
    public void setThresholdToFilter(Long thresholdToFilter) {
        set(PROPERTY_THRESHOLDTOFILTER, thresholdToFilter);
    }

    /**
     * @see GCField#PROPERTY_ALLOWFILTERBYIDENTIFIER
     * 
     */
    public String getAllowFilterByIdentifier() {
        return (String) get(PROPERTY_ALLOWFILTERBYIDENTIFIER);
    }
    /**
     * @see GCField#PROPERTY_ALLOWFILTERBYIDENTIFIER
     * 
     */
    public void setAllowFilterByIdentifier(String allowFilterByIdentifier) {
        set(PROPERTY_ALLOWFILTERBYIDENTIFIER, allowFilterByIdentifier);
    }

    /**
     * @see GCField#PROPERTY_ISFKDROPDOWNUNFILTERED
     * 
     */
    public String getIsFkDropdownUnfiltered() {
        return (String) get(PROPERTY_ISFKDROPDOWNUNFILTERED);
    }
    /**
     * @see GCField#PROPERTY_ISFKDROPDOWNUNFILTERED
     * 
     */
    public void setIsFkDropdownUnfiltered(String isFkDropdownUnfiltered) {
        set(PROPERTY_ISFKDROPDOWNUNFILTERED, isFkDropdownUnfiltered);
    }

    /**
     * @see GCField#PROPERTY_DISABLEFKCOMBO
     * 
     */
    public String getDisableFkCombo() {
        return (String) get(PROPERTY_DISABLEFKCOMBO);
    }
    /**
     * @see GCField#PROPERTY_DISABLEFKCOMBO
     * 
     */
    public void setDisableFkCombo(String disableFkCombo) {
        set(PROPERTY_DISABLEFKCOMBO, disableFkCombo);
    }

}
