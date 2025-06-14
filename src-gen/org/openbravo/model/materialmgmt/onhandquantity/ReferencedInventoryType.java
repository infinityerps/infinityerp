
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Sequence;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity MaterialMgmtReferencedInventoryType (stored in table M_RefInventory_Type).
 * <br>
 * Help: {@literal Defines different types of containers or boxes, which includes any kind of object that can
     *       contain goods.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReferencedInventoryType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_RefInventory_Type";
    public static final String ENTITY_NAME = "MaterialMgmtReferencedInventoryType";

    /**
     * Property id stored in column M_RefInventory_Type_ID in table M_RefInventory_Type<br>
     * Help: {@literal ID for a Handling Unit Type}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_RefInventory_Type 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_RefInventory_Type 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_RefInventory_Type 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_RefInventory_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_RefInventory_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_RefInventory_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_RefInventory_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_RefInventory_Type 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_RefInventory_Type<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property shared stored in column IsShared in table M_RefInventory_Type<br>
     * Help: {@literal Shared References: Multiple Storage Details can have a Reference number that is shared
     *       with other Storage Details.
     *       Unique References: A Storage Detail can (optionally) have a reference
     *       number, and this reference number is not re-used in other storage details.}
     * 
     */
    public static final String PROPERTY_SHARED = "shared";

    /**
     * Property sequence stored in column AD_Sequence_ID in table M_RefInventory_Type<br>
     * Help: {@literal The Sequence defines the numbering sequence to be used for documents.}
     * 
     */
    public static final String PROPERTY_SEQUENCE = "sequence";

    /**
     * Property sequenceType stored in column SequenceType in table M_RefInventory_Type<br>
     * Help: {@literal Define sequence type options as
     *       1. Global - globally defined Sequence for All
     *       organization/stores,
     *       2. Per Organization - Each organization store will have its own sequence.
     *       3.
     *       None - Default value for existing sequences that might have or not have sequence defined.}
     * 
     */
    public static final String PROPERTY_SEQUENCETYPE = "sequenceType";


    public ReferencedInventoryType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SHARED, true);
        setDefaultValue(PROPERTY_SEQUENCETYPE, "N");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_SHARED
     * 
     */
    public Boolean isShared() {
        return (Boolean) get(PROPERTY_SHARED);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_SHARED
     * 
     */
    public void setShared(Boolean shared) {
        set(PROPERTY_SHARED, shared);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_SEQUENCE
     * 
     */
    public Sequence getSequence() {
        return (Sequence) get(PROPERTY_SEQUENCE);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_SEQUENCE
     * 
     */
    public void setSequence(Sequence sequence) {
        set(PROPERTY_SEQUENCE, sequence);
    }

    /**
     * @see ReferencedInventoryType#PROPERTY_SEQUENCETYPE
     * 
     */
    public String getSequenceType() {
        return (String) get(PROPERTY_SEQUENCETYPE);
    }
    /**
     * @see ReferencedInventoryType#PROPERTY_SEQUENCETYPE
     * 
     */
    public void setSequenceType(String sequenceType) {
        set(PROPERTY_SEQUENCETYPE, sequenceType);
    }

}
