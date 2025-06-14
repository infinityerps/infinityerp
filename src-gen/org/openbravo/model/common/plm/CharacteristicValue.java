
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
package org.openbravo.model.common.plm;

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
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity CharacteristicValue (stored in table M_Ch_Value).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CharacteristicValue extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Ch_Value";
    public static final String ENTITY_NAME = "CharacteristicValue";

    /**
     * Property id stored in column M_Ch_Value_ID in table M_Ch_Value<br>
     * Help: {@literal Identifies a possible value of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Ch_Value 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Ch_Value 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Ch_Value 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Ch_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Ch_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Ch_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Ch_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property characteristic stored in column M_Characteristic_ID in table M_Ch_Value<br>
     * Help: {@literal Definition of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTIC = "characteristic";

    /**
     * Property name stored in column Name in table M_Ch_Value 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property summaryLevel stored in column IsSummary in table M_Ch_Value<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property code stored in column SKCode in table M_Ch_Value<br>
     * Help: {@literal The code are the characters used to build the Search Key of the variant concatenating them
     *       to the generic product's Search Key}
     * 
     */
    public static final String PROPERTY_CODE = "code";

    /**
     * Property description stored in column Description in table M_Ch_Value<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property addProducts stored in column Add_Products in table M_Ch_Value
     * 
     */
    public static final String PROPERTY_ADDPRODUCTS = "addProducts";

    /**
     * Property characteristicValueTrlList stored in table M_Ch_Value
     * 
     */
    public static final String PROPERTY_CHARACTERISTICVALUETRLLIST = "characteristicValueTrlList";

    /**
     * Property productCharacteristicConfList stored in table M_Ch_Value
     * 
     */
    public static final String PROPERTY_PRODUCTCHARACTERISTICCONFLIST = "productCharacteristicConfList";

    /**
     * Property productCharacteristicValueList stored in table M_Ch_Value
     * 
     */
    public static final String PROPERTY_PRODUCTCHARACTERISTICVALUELIST = "productCharacteristicValueList";


    public CharacteristicValue() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_ADDPRODUCTS, false);
        setDefaultValue(PROPERTY_CHARACTERISTICVALUETRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTCHARACTERISTICCONFLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTCHARACTERISTICVALUELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CharacteristicValue#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CharacteristicValue#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CharacteristicValue#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CharacteristicValue#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CharacteristicValue#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CharacteristicValue#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CharacteristicValue#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CharacteristicValue#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CharacteristicValue#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CharacteristicValue#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CharacteristicValue#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CharacteristicValue#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CharacteristicValue#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CharacteristicValue#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CharacteristicValue#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CharacteristicValue#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CharacteristicValue#PROPERTY_CHARACTERISTIC
     * 
     */
    public Characteristic getCharacteristic() {
        return (Characteristic) get(PROPERTY_CHARACTERISTIC);
    }
    /**
     * @see CharacteristicValue#PROPERTY_CHARACTERISTIC
     * 
     */
    public void setCharacteristic(Characteristic characteristic) {
        set(PROPERTY_CHARACTERISTIC, characteristic);
    }

    /**
     * @see CharacteristicValue#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see CharacteristicValue#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see CharacteristicValue#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see CharacteristicValue#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see CharacteristicValue#PROPERTY_CODE
     * 
     */
    public String getCode() {
        return (String) get(PROPERTY_CODE);
    }
    /**
     * @see CharacteristicValue#PROPERTY_CODE
     * 
     */
    public void setCode(String code) {
        set(PROPERTY_CODE, code);
    }

    /**
     * @see CharacteristicValue#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see CharacteristicValue#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see CharacteristicValue#PROPERTY_ADDPRODUCTS
     * 
     */
    public Boolean isAddProducts() {
        return (Boolean) get(PROPERTY_ADDPRODUCTS);
    }
    /**
     * @see CharacteristicValue#PROPERTY_ADDPRODUCTS
     * 
     */
    public void setAddProducts(Boolean addProducts) {
        set(PROPERTY_ADDPRODUCTS, addProducts);
    }

    /**
     * @see CharacteristicValueTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CharacteristicValueTrl> getCharacteristicValueTrlList() {
      return (List<CharacteristicValueTrl>) get(PROPERTY_CHARACTERISTICVALUETRLLIST);
    }

    /**
     * @see CharacteristicValueTrl
     * 
     */
    public void setCharacteristicValueTrlList(List<CharacteristicValueTrl> characteristicValueTrlList) {
        set(PROPERTY_CHARACTERISTICVALUETRLLIST, characteristicValueTrlList);
    }

    /**
     * @see ProductCharacteristicConf
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCharacteristicConf> getProductCharacteristicConfList() {
      return (List<ProductCharacteristicConf>) get(PROPERTY_PRODUCTCHARACTERISTICCONFLIST);
    }

    /**
     * @see ProductCharacteristicConf
     * 
     */
    public void setProductCharacteristicConfList(List<ProductCharacteristicConf> productCharacteristicConfList) {
        set(PROPERTY_PRODUCTCHARACTERISTICCONFLIST, productCharacteristicConfList);
    }

    /**
     * @see ProductCharacteristicValue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCharacteristicValue> getProductCharacteristicValueList() {
      return (List<ProductCharacteristicValue>) get(PROPERTY_PRODUCTCHARACTERISTICVALUELIST);
    }

    /**
     * @see ProductCharacteristicValue
     * 
     */
    public void setProductCharacteristicValueList(List<ProductCharacteristicValue> productCharacteristicValueList) {
        set(PROPERTY_PRODUCTCHARACTERISTICVALUELIST, productCharacteristicValueList);
    }

}
