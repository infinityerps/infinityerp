
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
 * Entity class for entity ProductCharacteristic (stored in table M_Product_Ch).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductCharacteristic extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Ch";
    public static final String ENTITY_NAME = "ProductCharacteristic";

    /**
     * Property id stored in column M_Product_Ch_ID in table M_Product_Ch
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_Ch 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_Ch 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Product_Ch 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_Ch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Product_Ch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_Ch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Product_Ch 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property product stored in column M_Product_ID in table M_Product_Ch<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property characteristic stored in column M_Characteristic_ID in table M_Product_Ch<br>
     * Help: {@literal Definition of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTIC = "characteristic";

    /**
     * Property sequenceNumber stored in column Seqno in table M_Product_Ch<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property variant stored in column Isvariant in table M_Product_Ch
     * 
     */
    public static final String PROPERTY_VARIANT = "variant";

    /**
     * Property characteristicSubset stored in column M_Ch_Subset_ID in table M_Product_Ch<br>
     * Help: {@literal Identifies a product characteristic's subset of values.}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICSUBSET = "characteristicSubset";

    /**
     * Property definesPrice stored in column Define_Price in table M_Product_Ch<br>
     * Help: {@literal Values of this characteristic can overwrite generic's price when the variant is created.}
     * 
     */
    public static final String PROPERTY_DEFINESPRICE = "definesPrice";

    /**
     * Property definesImage stored in column Define_Image in table M_Product_Ch<br>
     * Help: {@literal When variants are generated the images attached to the values of this characteristic are
     *       set to the variants.}
     * 
     */
    public static final String PROPERTY_DEFINESIMAGE = "definesImage";

    /**
     * Property priceListType stored in column Pricelist_Type in table M_Product_Ch
     * 
     */
    public static final String PROPERTY_PRICELISTTYPE = "priceListType";

    /**
     * Property explodeConfigurationTab stored in column IsExplodeConf in table M_Product_Ch<br>
     * Help: {@literal Determines if the values of the characteristic needs to be automatically inserted in the
     *       Configuration tab when the characteristic is added to a Generic product as a Variant.}
     * 
     */
    public static final String PROPERTY_EXPLODECONFIGURATIONTAB = "explodeConfigurationTab";

    /**
     * Property productCharacteristicConfList stored in table M_Product_Ch
     * 
     */
    public static final String PROPERTY_PRODUCTCHARACTERISTICCONFLIST = "productCharacteristicConfList";


    public ProductCharacteristic() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_VARIANT, false);
        setDefaultValue(PROPERTY_DEFINESPRICE, false);
        setDefaultValue(PROPERTY_DEFINESIMAGE, false);
        setDefaultValue(PROPERTY_PRICELISTTYPE, "SALES");
        setDefaultValue(PROPERTY_EXPLODECONFIGURATIONTAB, true);
        setDefaultValue(PROPERTY_PRODUCTCHARACTERISTICCONFLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductCharacteristic#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_CHARACTERISTIC
     * 
     */
    public Characteristic getCharacteristic() {
        return (Characteristic) get(PROPERTY_CHARACTERISTIC);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_CHARACTERISTIC
     * 
     */
    public void setCharacteristic(Characteristic characteristic) {
        set(PROPERTY_CHARACTERISTIC, characteristic);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_VARIANT
     * 
     */
    public Boolean isVariant() {
        return (Boolean) get(PROPERTY_VARIANT);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_VARIANT
     * 
     */
    public void setVariant(Boolean variant) {
        set(PROPERTY_VARIANT, variant);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_CHARACTERISTICSUBSET
     * 
     */
    public CharacteristicSubset getCharacteristicSubset() {
        return (CharacteristicSubset) get(PROPERTY_CHARACTERISTICSUBSET);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_CHARACTERISTICSUBSET
     * 
     */
    public void setCharacteristicSubset(CharacteristicSubset characteristicSubset) {
        set(PROPERTY_CHARACTERISTICSUBSET, characteristicSubset);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_DEFINESPRICE
     * 
     */
    public Boolean isDefinesPrice() {
        return (Boolean) get(PROPERTY_DEFINESPRICE);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_DEFINESPRICE
     * 
     */
    public void setDefinesPrice(Boolean definesPrice) {
        set(PROPERTY_DEFINESPRICE, definesPrice);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_DEFINESIMAGE
     * 
     */
    public Boolean isDefinesImage() {
        return (Boolean) get(PROPERTY_DEFINESIMAGE);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_DEFINESIMAGE
     * 
     */
    public void setDefinesImage(Boolean definesImage) {
        set(PROPERTY_DEFINESIMAGE, definesImage);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_PRICELISTTYPE
     * 
     */
    public String getPriceListType() {
        return (String) get(PROPERTY_PRICELISTTYPE);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_PRICELISTTYPE
     * 
     */
    public void setPriceListType(String priceListType) {
        set(PROPERTY_PRICELISTTYPE, priceListType);
    }

    /**
     * @see ProductCharacteristic#PROPERTY_EXPLODECONFIGURATIONTAB
     * 
     */
    public Boolean isExplodeConfigurationTab() {
        return (Boolean) get(PROPERTY_EXPLODECONFIGURATIONTAB);
    }
    /**
     * @see ProductCharacteristic#PROPERTY_EXPLODECONFIGURATIONTAB
     * 
     */
    public void setExplodeConfigurationTab(Boolean explodeConfigurationTab) {
        set(PROPERTY_EXPLODECONFIGURATIONTAB, explodeConfigurationTab);
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

}
