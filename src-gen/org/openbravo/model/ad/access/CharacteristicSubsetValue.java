
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
package org.openbravo.model.ad.access;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.CharacteristicSubset;
import org.openbravo.model.common.plm.CharacteristicValue;
/**
 * Entity class for entity CharacteristicSubsetValue (stored in table M_Ch_Subset_Value).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CharacteristicSubsetValue extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Ch_Subset_Value";
    public static final String ENTITY_NAME = "CharacteristicSubsetValue";

    /**
     * Property id stored in column M_Ch_Subset_Value_ID in table M_Ch_Subset_Value 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Ch_Subset_Value 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Ch_Subset_Value 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Ch_Subset_Value 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Ch_Subset_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Ch_Subset_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Ch_Subset_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Ch_Subset_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property characteristicSubset stored in column M_Ch_Subset_ID in table M_Ch_Subset_Value<br>
     * Help: {@literal Identifies a product characteristic's subset of values.}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICSUBSET = "characteristicSubset";

    /**
     * Property characteristicValue stored in column M_Ch_Value_ID in table M_Ch_Subset_Value<br>
     * Help: {@literal Identifies a possible value of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICVALUE = "characteristicValue";

    /**
     * Property sequenceNumber stored in column Seqno in table M_Ch_Subset_Value<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property code stored in column SKCode in table M_Ch_Subset_Value<br>
     * Help: {@literal The code are the characters used to build the Search Key of the variant concatenating them
     *       to the generic product's Search Key}
     * 
     */
    public static final String PROPERTY_CODE = "code";


    public CharacteristicSubsetValue() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_CHARACTERISTICSUBSET
     * 
     */
    public CharacteristicSubset getCharacteristicSubset() {
        return (CharacteristicSubset) get(PROPERTY_CHARACTERISTICSUBSET);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_CHARACTERISTICSUBSET
     * 
     */
    public void setCharacteristicSubset(CharacteristicSubset characteristicSubset) {
        set(PROPERTY_CHARACTERISTICSUBSET, characteristicSubset);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_CHARACTERISTICVALUE
     * 
     */
    public CharacteristicValue getCharacteristicValue() {
        return (CharacteristicValue) get(PROPERTY_CHARACTERISTICVALUE);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_CHARACTERISTICVALUE
     * 
     */
    public void setCharacteristicValue(CharacteristicValue characteristicValue) {
        set(PROPERTY_CHARACTERISTICVALUE, characteristicValue);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see CharacteristicSubsetValue#PROPERTY_CODE
     * 
     */
    public String getCode() {
        return (String) get(PROPERTY_CODE);
    }
    /**
     * @see CharacteristicSubsetValue#PROPERTY_CODE
     * 
     */
    public void setCode(String code) {
        set(PROPERTY_CODE, code);
    }

}
