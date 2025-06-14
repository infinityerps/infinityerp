
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
 * Entity class for entity ProductWithCharacteristics (stored in table m_prodchview_v).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductCharacteristics extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "m_prodchview_v";
    public static final String ENTITY_NAME = "ProductWithCharacteristics";

    /**
     * Property product stored in column M_Product_ID in table m_prodchview_v<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property client stored in column AD_Client_ID in table m_prodchview_v 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table m_prodchview_v 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table m_prodchview_v 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table m_prodchview_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table m_prodchview_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table m_prodchview_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table m_prodchview_v 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table m_prodchview_v<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table m_prodchview_v 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property characteristicDescription stored in column Characteristic_Desc in table m_prodchview_v<br>
     * Help: {@literal Text with the concatenation of the characteristics and its values assigned to the
     *       product.}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICDESCRIPTION = "characteristicDescription";

    /**
     * Property genericProduct stored in column Generic_Product_ID in table m_prodchview_v<br>
     * Help: {@literal Generic product related to this product. The product will inherit all the properties
     *       defined in the generic product. Such as taxes or price.}
     * 
     */
    public static final String PROPERTY_GENERICPRODUCT = "genericProduct";

    /**
     * Property id stored in column M_Prodchview_V_ID in table m_prodchview_v 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property characteristic stored in column M_Characteristic_ID in table m_prodchview_v<br>
     * Help: {@literal Definition of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTIC = "characteristic";

    /**
     * Property charName stored in column Char_Name in table m_prodchview_v
     * 
     */
    public static final String PROPERTY_CHARNAME = "charName";

    /**
     * Property characteristicValue stored in column M_Ch_Value_ID in table m_prodchview_v<br>
     * Help: {@literal Identifies a possible value of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICVALUE = "characteristicValue";

    /**
     * Property productChValue stored in column M_Product_Ch_Value_ID in table m_prodchview_v
     * 
     */
    public static final String PROPERTY_PRODUCTCHVALUE = "productChValue";

    /**
     * Property isGeneric stored in column Isgeneric in table m_prodchview_v<br>
     * Help: {@literal Identifies a generic product. A generic product cannot be purchased or sold.}
     * 
     */
    public static final String PROPERTY_ISGENERIC = "isGeneric";


    public ProductCharacteristics() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISGENERIC, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductCharacteristics#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_CHARACTERISTICDESCRIPTION
     * 
     */
    public String getCharacteristicDescription() {
        return (String) get(PROPERTY_CHARACTERISTICDESCRIPTION);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_CHARACTERISTICDESCRIPTION
     * 
     */
    public void setCharacteristicDescription(String characteristicDescription) {
        set(PROPERTY_CHARACTERISTICDESCRIPTION, characteristicDescription);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_GENERICPRODUCT
     * 
     */
    public Product getGenericProduct() {
        return (Product) get(PROPERTY_GENERICPRODUCT);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_GENERICPRODUCT
     * 
     */
    public void setGenericProduct(Product genericProduct) {
        set(PROPERTY_GENERICPRODUCT, genericProduct);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_CHARACTERISTIC
     * 
     */
    public Characteristic getCharacteristic() {
        return (Characteristic) get(PROPERTY_CHARACTERISTIC);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_CHARACTERISTIC
     * 
     */
    public void setCharacteristic(Characteristic characteristic) {
        set(PROPERTY_CHARACTERISTIC, characteristic);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_CHARNAME
     * 
     */
    public String getCharName() {
        return (String) get(PROPERTY_CHARNAME);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_CHARNAME
     * 
     */
    public void setCharName(String charName) {
        set(PROPERTY_CHARNAME, charName);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_CHARACTERISTICVALUE
     * 
     */
    public CharacteristicValue getCharacteristicValue() {
        return (CharacteristicValue) get(PROPERTY_CHARACTERISTICVALUE);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_CHARACTERISTICVALUE
     * 
     */
    public void setCharacteristicValue(CharacteristicValue characteristicValue) {
        set(PROPERTY_CHARACTERISTICVALUE, characteristicValue);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_PRODUCTCHVALUE
     * 
     */
    public ProductCharacteristicValue getProductChValue() {
        return (ProductCharacteristicValue) get(PROPERTY_PRODUCTCHVALUE);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_PRODUCTCHVALUE
     * 
     */
    public void setProductChValue(ProductCharacteristicValue productChValue) {
        set(PROPERTY_PRODUCTCHVALUE, productChValue);
    }

    /**
     * @see ProductCharacteristics#PROPERTY_ISGENERIC
     * 
     */
    public Boolean isGeneric() {
        return (Boolean) get(PROPERTY_ISGENERIC);
    }
    /**
     * @see ProductCharacteristics#PROPERTY_ISGENERIC
     * 
     */
    public void setGeneric(Boolean isGeneric) {
        set(PROPERTY_ISGENERIC, isGeneric);
    }

}
