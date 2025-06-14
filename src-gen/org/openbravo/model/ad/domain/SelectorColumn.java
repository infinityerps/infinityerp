
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
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADSelectorColumn (stored in table AD_Ref_Search_Column).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class SelectorColumn extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Ref_Search_Column";
    public static final String ENTITY_NAME = "ADSelectorColumn";

    /**
     * Property id stored in column AD_Ref_Search_Column_ID in table AD_Ref_Search_Column 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Ref_Search_Column 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Ref_Search_Column 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Ref_Search_Column 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Ref_Search_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Ref_Search_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Ref_Search_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Ref_Search_Column 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property search stored in column AD_Ref_Search_ID in table AD_Ref_Search_Column
     * 
     */
    public static final String PROPERTY_SEARCH = "search";

    /**
     * Property name stored in column Name in table AD_Ref_Search_Column 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property dBColumnName stored in column ColumnName in table AD_Ref_Search_Column<br>
     * Help: {@literal The Column Name indicates the name of a column on a table as defined in the database.}
     * 
     */
    public static final String PROPERTY_DBCOLUMNNAME = "dBColumnName";

    /**
     * Property columnType stored in column Columntype in table AD_Ref_Search_Column
     * 
     */
    public static final String PROPERTY_COLUMNTYPE = "columnType";

    /**
     * Property suffix stored in column Column_Suffix in table AD_Ref_Search_Column<br>
     * Help: {@literal One or many characters which are added at the end of a statement or number.}
     * 
     */
    public static final String PROPERTY_SUFFIX = "suffix";


    public SelectorColumn() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COLUMNTYPE, "I");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see SelectorColumn#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see SelectorColumn#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see SelectorColumn#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see SelectorColumn#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see SelectorColumn#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see SelectorColumn#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see SelectorColumn#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see SelectorColumn#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see SelectorColumn#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see SelectorColumn#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see SelectorColumn#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see SelectorColumn#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see SelectorColumn#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see SelectorColumn#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see SelectorColumn#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see SelectorColumn#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see SelectorColumn#PROPERTY_SEARCH
     * 
     */
    public Selector getSearch() {
        return (Selector) get(PROPERTY_SEARCH);
    }
    /**
     * @see SelectorColumn#PROPERTY_SEARCH
     * 
     */
    public void setSearch(Selector search) {
        set(PROPERTY_SEARCH, search);
    }

    /**
     * @see SelectorColumn#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see SelectorColumn#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see SelectorColumn#PROPERTY_DBCOLUMNNAME
     * 
     */
    public String getDBColumnName() {
        return (String) get(PROPERTY_DBCOLUMNNAME);
    }
    /**
     * @see SelectorColumn#PROPERTY_DBCOLUMNNAME
     * 
     */
    public void setDBColumnName(String dBColumnName) {
        set(PROPERTY_DBCOLUMNNAME, dBColumnName);
    }

    /**
     * @see SelectorColumn#PROPERTY_COLUMNTYPE
     * 
     */
    public String getColumnType() {
        return (String) get(PROPERTY_COLUMNTYPE);
    }
    /**
     * @see SelectorColumn#PROPERTY_COLUMNTYPE
     * 
     */
    public void setColumnType(String columnType) {
        set(PROPERTY_COLUMNTYPE, columnType);
    }

    /**
     * @see SelectorColumn#PROPERTY_SUFFIX
     * 
     */
    public String getSuffix() {
        return (String) get(PROPERTY_SUFFIX);
    }
    /**
     * @see SelectorColumn#PROPERTY_SUFFIX
     * 
     */
    public void setSuffix(String suffix) {
        set(PROPERTY_SUFFIX, suffix);
    }

}
