
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

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ProductCharacteristicConf (stored in table M_Product_Ch_Conf).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductCharacteristicConf extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Ch_Conf";
    public static final String ENTITY_NAME = "ProductCharacteristicConf";

    /**
     * Property id stored in column M_Product_Ch_Conf_ID in table M_Product_Ch_Conf 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_Ch_Conf 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_Ch_Conf 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Product_Ch_Conf 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_Ch_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Product_Ch_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_Ch_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Product_Ch_Conf 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property characteristicOfProduct stored in column M_Product_Ch_ID in table M_Product_Ch_Conf
     * 
     */
    public static final String PROPERTY_CHARACTERISTICOFPRODUCT = "characteristicOfProduct";

    /**
     * Property characteristicValue stored in column M_Ch_Value_ID in table M_Product_Ch_Conf<br>
     * Help: {@literal Identifies a possible value of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICVALUE = "characteristicValue";

    /**
     * Property code stored in column SKCode in table M_Product_Ch_Conf<br>
     * Help: {@literal The code are the characters used to build the Search Key of the variant concatenating them
     *       to the generic product's Search Key}
     * 
     */
    public static final String PROPERTY_CODE = "code";

    /**
     * Property netUnitPrice stored in column Price in table M_Product_Ch_Conf<br>
     * Help: {@literal The Price indicates the Price for a product or service.}
     * 
     */
    public static final String PROPERTY_NETUNITPRICE = "netUnitPrice";

    /**
     * Property image stored in column AD_Image_ID in table M_Product_Ch_Conf<br>
     * Help: {@literal Defines a system image}
     * 
     */
    public static final String PROPERTY_IMAGE = "image";


    public ProductCharacteristicConf() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_CHARACTERISTICOFPRODUCT
     * 
     */
    public ProductCharacteristic getCharacteristicOfProduct() {
        return (ProductCharacteristic) get(PROPERTY_CHARACTERISTICOFPRODUCT);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_CHARACTERISTICOFPRODUCT
     * 
     */
    public void setCharacteristicOfProduct(ProductCharacteristic characteristicOfProduct) {
        set(PROPERTY_CHARACTERISTICOFPRODUCT, characteristicOfProduct);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_CHARACTERISTICVALUE
     * 
     */
    public CharacteristicValue getCharacteristicValue() {
        return (CharacteristicValue) get(PROPERTY_CHARACTERISTICVALUE);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_CHARACTERISTICVALUE
     * 
     */
    public void setCharacteristicValue(CharacteristicValue characteristicValue) {
        set(PROPERTY_CHARACTERISTICVALUE, characteristicValue);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_CODE
     * 
     */
    public String getCode() {
        return (String) get(PROPERTY_CODE);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_CODE
     * 
     */
    public void setCode(String code) {
        set(PROPERTY_CODE, code);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_NETUNITPRICE
     * 
     */
    public BigDecimal getNetUnitPrice() {
        return (BigDecimal) get(PROPERTY_NETUNITPRICE);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_NETUNITPRICE
     * 
     */
    public void setNetUnitPrice(BigDecimal netUnitPrice) {
        set(PROPERTY_NETUNITPRICE, netUnitPrice);
    }

    /**
     * @see ProductCharacteristicConf#PROPERTY_IMAGE
     * 
     */
    public Image getImage() {
        return (Image) get(PROPERTY_IMAGE);
    }
    /**
     * @see ProductCharacteristicConf#PROPERTY_IMAGE
     * 
     */
    public void setImage(Image image) {
        set(PROPERTY_IMAGE, image);
    }

}
