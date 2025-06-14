
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
package org.openbravo.model.ad.domain;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADReferencedTreeField (stored in table ad_ref_tree_field).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReferencedTreeField extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "ad_ref_tree_field";
    public static final String ENTITY_NAME = "ADReferencedTreeField";

    /**
     * Property id stored in column AD_Ref_Tree_Field_ID in table ad_ref_tree_field
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property refTree stored in column AD_Ref_Tree_ID in table ad_ref_tree_field
     * 
     */
    public static final String PROPERTY_REFTREE = "refTree";

    /**
     * Property client stored in column AD_Client_ID in table ad_ref_tree_field 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table ad_ref_tree_field 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property module stored in column AD_Module_ID in table ad_ref_tree_field<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property name stored in column Name in table ad_ref_tree_field 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property property stored in column Property in table ad_ref_tree_field<br>
     * Help: {@literal It is the "Configuration Property" this record sets value to. 
     *       
     *       Configuration Properties
     *       are defined by modules with the purpose other modules are capable to assign them values.}
     * 
     */
    public static final String PROPERTY_PROPERTY = "property";

    /**
     * Property centralMaintenance stored in column Iscentrallymaintained in table ad_ref_tree_field<br>
     * Help: {@literal The Centrally Maintained checkbox indicates if the Name, Description and Help maintained
     *       in 'System Element' table  or 'Window' table.}
     * 
     */
    public static final String PROPERTY_CENTRALMAINTENANCE = "centralMaintenance";

    /**
     * Property sort stored in column Sort in table ad_ref_tree_field<br>
     * Help: {@literal Defines if this field can be sorted in the popup}
     * 
     */
    public static final String PROPERTY_SORT = "sort";

    /**
     * Property filter stored in column Filter in table ad_ref_tree_field<br>
     * Help: {@literal Defines if this field can be filtered in the popup}
     * 
     */
    public static final String PROPERTY_FILTER = "filter";

    /**
     * Property searchinsuggestionbox stored in column Searchinsuggestionbox in table ad_ref_tree_field<br>
     * Help: {@literal Defines if this field should be searched when text is entered in the suggestion box}
     * 
     */
    public static final String PROPERTY_SEARCHINSUGGESTIONBOX = "searchinsuggestionbox";

    /**
     * Property showingrid stored in column Showingrid in table ad_ref_tree_field<br>
     * Help: {@literal Defines if this field should be shown in the popup}
     * 
     */
    public static final String PROPERTY_SHOWINGRID = "showingrid";

    /**
     * Property recordSortNo stored in column Sortno in table ad_ref_tree_field<br>
     * Help: {@literal The Record Sort No indicates the ascending sort sequence of the records}
     * 
     */
    public static final String PROPERTY_RECORDSORTNO = "recordSortNo";

    /**
     * Property active stored in column Isactive in table ad_ref_tree_field 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table ad_ref_tree_field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table ad_ref_tree_field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table ad_ref_tree_field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table ad_ref_tree_field 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property showinpicklist stored in column Showinpicklist in table ad_ref_tree_field<br>
     * Help: {@literal Defines if this field should be shown in the pick list}
     * 
     */
    public static final String PROPERTY_SHOWINPICKLIST = "showinpicklist";


    public ReferencedTreeField() {
        setDefaultValue(PROPERTY_CENTRALMAINTENANCE, true);
        setDefaultValue(PROPERTY_SORT, false);
        setDefaultValue(PROPERTY_FILTER, false);
        setDefaultValue(PROPERTY_SEARCHINSUGGESTIONBOX, false);
        setDefaultValue(PROPERTY_SHOWINGRID, false);
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SHOWINPICKLIST, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReferencedTreeField#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_REFTREE
     * 
     */
    public ReferencedTree getRefTree() {
        return (ReferencedTree) get(PROPERTY_REFTREE);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_REFTREE
     * 
     */
    public void setRefTree(ReferencedTree refTree) {
        set(PROPERTY_REFTREE, refTree);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_PROPERTY
     * 
     */
    public String getProperty() {
        return (String) get(PROPERTY_PROPERTY);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_PROPERTY
     * 
     */
    public void setProperty(String property) {
        set(PROPERTY_PROPERTY, property);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public Boolean isCentralMaintenance() {
        return (Boolean) get(PROPERTY_CENTRALMAINTENANCE);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_CENTRALMAINTENANCE
     * 
     */
    public void setCentralMaintenance(Boolean centralMaintenance) {
        set(PROPERTY_CENTRALMAINTENANCE, centralMaintenance);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_SORT
     * 
     */
    public Boolean isSort() {
        return (Boolean) get(PROPERTY_SORT);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_SORT
     * 
     */
    public void setSort(Boolean sort) {
        set(PROPERTY_SORT, sort);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_FILTER
     * 
     */
    public Boolean isFilter() {
        return (Boolean) get(PROPERTY_FILTER);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_FILTER
     * 
     */
    public void setFilter(Boolean filter) {
        set(PROPERTY_FILTER, filter);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_SEARCHINSUGGESTIONBOX
     * 
     */
    public Boolean isSearchinsuggestionbox() {
        return (Boolean) get(PROPERTY_SEARCHINSUGGESTIONBOX);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_SEARCHINSUGGESTIONBOX
     * 
     */
    public void setSearchinsuggestionbox(Boolean searchinsuggestionbox) {
        set(PROPERTY_SEARCHINSUGGESTIONBOX, searchinsuggestionbox);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_SHOWINGRID
     * 
     */
    public Boolean isShowingrid() {
        return (Boolean) get(PROPERTY_SHOWINGRID);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_SHOWINGRID
     * 
     */
    public void setShowingrid(Boolean showingrid) {
        set(PROPERTY_SHOWINGRID, showingrid);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_RECORDSORTNO
     * 
     */
    public Long getRecordSortNo() {
        return (Long) get(PROPERTY_RECORDSORTNO);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_RECORDSORTNO
     * 
     */
    public void setRecordSortNo(Long recordSortNo) {
        set(PROPERTY_RECORDSORTNO, recordSortNo);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReferencedTreeField#PROPERTY_SHOWINPICKLIST
     * 
     */
    public Boolean isShowinpicklist() {
        return (Boolean) get(PROPERTY_SHOWINPICKLIST);
    }
    /**
     * @see ReferencedTreeField#PROPERTY_SHOWINPICKLIST
     * 
     */
    public void setShowinpicklist(Boolean showinpicklist) {
        set(PROPERTY_SHOWINPICKLIST, showinpicklist);
    }

}
