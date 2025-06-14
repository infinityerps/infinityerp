
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
package org.openbravo.model.materialmgmt.onhandquantity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
 * Entity class for entity MaterialMgmtInventoryStatus (stored in table M_InventoryStatus).
 * <br>
 * Help: {@literal The inventory status refers to the condition of a specific inventory (such as AVAILABLE,
     *       RETURN, DEFECT, TRANSIT) that is stored in a specific organization, warehouse and bin and for a
     *       product with a specific lot/serial and quantity. The inventory status can allow or disallow certain
     *       business processes.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InventoryStatus extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_InventoryStatus";
    public static final String ENTITY_NAME = "MaterialMgmtInventoryStatus";

    /**
     * Property id stored in column M_Inventorystatus_ID in table M_InventoryStatus<br>
     * Help: {@literal The inventory status refers to the condition of a specific inventory (such as AVAILABLE,
     *       RETURN, DEFECT, TRANSIT) that is stored in a specific organization, warehouse and bin and for a
     *       product with a specific lot/serial and quantity. The inventory status can allow or disallow certain
     *       business processes.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_InventoryStatus 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_InventoryStatus 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_InventoryStatus 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_InventoryStatus 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_InventoryStatus 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_InventoryStatus 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_InventoryStatus 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_InventoryStatus 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_InventoryStatus<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property available stored in column Available in table M_InventoryStatus
     * 
     */
    public static final String PROPERTY_AVAILABLE = "available";

    /**
     * Property nettable stored in column Nettable in table M_InventoryStatus
     * 
     */
    public static final String PROPERTY_NETTABLE = "nettable";

    /**
     * Property overissue stored in column Overissue in table M_InventoryStatus
     * 
     */
    public static final String PROPERTY_OVERISSUE = "overissue";

    /**
     * Property module stored in column AD_Module_ID in table M_InventoryStatus<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property materialMgmtInventoryStatusTrlList stored in table M_InventoryStatus
     * 
     */
    public static final String PROPERTY_MATERIALMGMTINVENTORYSTATUSTRLLIST = "materialMgmtInventoryStatusTrlList";


    public InventoryStatus() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AVAILABLE, true);
        setDefaultValue(PROPERTY_NETTABLE, true);
        setDefaultValue(PROPERTY_OVERISSUE, true);
        setDefaultValue(PROPERTY_MATERIALMGMTINVENTORYSTATUSTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InventoryStatus#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InventoryStatus#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InventoryStatus#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InventoryStatus#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InventoryStatus#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InventoryStatus#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InventoryStatus#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InventoryStatus#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InventoryStatus#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InventoryStatus#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InventoryStatus#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InventoryStatus#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InventoryStatus#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InventoryStatus#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InventoryStatus#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InventoryStatus#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InventoryStatus#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see InventoryStatus#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see InventoryStatus#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see InventoryStatus#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see InventoryStatus#PROPERTY_AVAILABLE
     * 
     */
    public Boolean isAvailable() {
        return (Boolean) get(PROPERTY_AVAILABLE);
    }
    /**
     * @see InventoryStatus#PROPERTY_AVAILABLE
     * 
     */
    public void setAvailable(Boolean available) {
        set(PROPERTY_AVAILABLE, available);
    }

    /**
     * @see InventoryStatus#PROPERTY_NETTABLE
     * 
     */
    public Boolean isNettable() {
        return (Boolean) get(PROPERTY_NETTABLE);
    }
    /**
     * @see InventoryStatus#PROPERTY_NETTABLE
     * 
     */
    public void setNettable(Boolean nettable) {
        set(PROPERTY_NETTABLE, nettable);
    }

    /**
     * @see InventoryStatus#PROPERTY_OVERISSUE
     * 
     */
    public Boolean isOverissue() {
        return (Boolean) get(PROPERTY_OVERISSUE);
    }
    /**
     * @see InventoryStatus#PROPERTY_OVERISSUE
     * 
     */
    public void setOverissue(Boolean overissue) {
        set(PROPERTY_OVERISSUE, overissue);
    }

    /**
     * @see InventoryStatus#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see InventoryStatus#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * Help: {@literal Manage the inventory status definitions translations}<br>
     * @see InventoryStatusTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InventoryStatusTrl> getMaterialMgmtInventoryStatusTrlList() {
      return (List<InventoryStatusTrl>) get(PROPERTY_MATERIALMGMTINVENTORYSTATUSTRLLIST);
    }

    /**
     * Help: {@literal Manage the inventory status definitions translations}<br>
     * @see InventoryStatusTrl
     * 
     */
    public void setMaterialMgmtInventoryStatusTrlList(List<InventoryStatusTrl> materialMgmtInventoryStatusTrlList) {
        set(PROPERTY_MATERIALMGMTINVENTORYSTATUSTRLLIST, materialMgmtInventoryStatusTrlList);
    }

}
