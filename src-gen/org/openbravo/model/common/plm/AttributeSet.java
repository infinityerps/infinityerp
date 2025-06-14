
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
 * Entity class for entity AttributeSet (stored in table M_AttributeSet).
 * <br>
 * Help: {@literal Define Product Attribute Sets to add additional attributes and values to the product. You
     *       need to define a Attribute Set if you want to enable Serial and Lot Number tracking.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AttributeSet extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_AttributeSet";
    public static final String ENTITY_NAME = "AttributeSet";

    /**
     * Property id stored in column M_AttributeSet_ID in table M_AttributeSet<br>
     * Help: {@literal Define Product Attribute Sets to add additional attributes and values to the product. You
     *       need to define a Attribute Set if you want to enable Serial and Lot Number tracking.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_AttributeSet 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_AttributeSet 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_AttributeSet 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_AttributeSet 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_AttributeSet 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_AttributeSet 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_AttributeSet 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_AttributeSet 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_AttributeSet<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property serialNo stored in column IsSerNo in table M_AttributeSet<br>
     * Help: {@literal For individual products, you can define Serial Numbers}
     * 
     */
    public static final String PROPERTY_SERIALNO = "serialNo";

    /**
     * Property serialNoControl stored in column M_SerNoCtl_ID in table M_AttributeSet<br>
     * Help: {@literal Definition to create Serial numbers for Products}
     * 
     */
    public static final String PROPERTY_SERIALNOCONTROL = "serialNoControl";

    /**
     * Property lot stored in column IsLot in table M_AttributeSet<br>
     * Help: {@literal For individual products, you can define Lot Numbers}
     * 
     */
    public static final String PROPERTY_LOT = "lot";

    /**
     * Property lotControl stored in column M_LotCtl_ID in table M_AttributeSet<br>
     * Help: {@literal Definition to create Lot numbers for Products}
     * 
     */
    public static final String PROPERTY_LOTCONTROL = "lotControl";

    /**
     * Property expirationDate stored in column IsGuaranteeDate in table M_AttributeSet<br>
     * Help: {@literal For individual products, you can define a guarantee or expiry date}
     * 
     */
    public static final String PROPERTY_EXPIRATIONDATE = "expirationDate";

    /**
     * Property guaranteedDays stored in column GuaranteeDays in table M_AttributeSet<br>
     * Help: {@literal If the value is 0, there is no limit to the availability or guarantee, otherwise the
     *       guarantee date is calculated by adding the days to the delivery date.}
     * 
     */
    public static final String PROPERTY_GUARANTEEDDAYS = "guaranteedDays";

    /**
     * Property lockedInWarehouse stored in column IsLockable in table M_AttributeSet<br>
     * Help: {@literal This check indicates that the product is locked in the warehouse and it cannot be taken
     *       out of it.}
     * 
     */
    public static final String PROPERTY_LOCKEDINWAREHOUSE = "lockedInWarehouse";

    /**
     * Property requireAtLeastOneValue stored in column Isoneattrsetvalrequired in table M_AttributeSet<br>
     * Help: {@literal At least one attribute set value will be required in transactions.}
     * 
     */
    public static final String PROPERTY_REQUIREATLEASTONEVALUE = "requireAtLeastOneValue";

    /**
     * Property attributeUseList stored in table M_AttributeSet
     * 
     */
    public static final String PROPERTY_ATTRIBUTEUSELIST = "attributeUseList";

    /**
     * Property productList stored in table M_AttributeSet
     * 
     */
    public static final String PROPERTY_PRODUCTLIST = "productList";


    public AttributeSet() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SERIALNO, false);
        setDefaultValue(PROPERTY_LOT, false);
        setDefaultValue(PROPERTY_EXPIRATIONDATE, false);
        setDefaultValue(PROPERTY_LOCKEDINWAREHOUSE, false);
        setDefaultValue(PROPERTY_REQUIREATLEASTONEVALUE, true);
        setDefaultValue(PROPERTY_ATTRIBUTEUSELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AttributeSet#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AttributeSet#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AttributeSet#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AttributeSet#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AttributeSet#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AttributeSet#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AttributeSet#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AttributeSet#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AttributeSet#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AttributeSet#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AttributeSet#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AttributeSet#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AttributeSet#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AttributeSet#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AttributeSet#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AttributeSet#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AttributeSet#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AttributeSet#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AttributeSet#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AttributeSet#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AttributeSet#PROPERTY_SERIALNO
     * 
     */
    public Boolean isSerialNo() {
        return (Boolean) get(PROPERTY_SERIALNO);
    }
    /**
     * @see AttributeSet#PROPERTY_SERIALNO
     * 
     */
    public void setSerialNo(Boolean serialNo) {
        set(PROPERTY_SERIALNO, serialNo);
    }

    /**
     * @see AttributeSet#PROPERTY_SERIALNOCONTROL
     * 
     */
    public SerialNumberControl getSerialNoControl() {
        return (SerialNumberControl) get(PROPERTY_SERIALNOCONTROL);
    }
    /**
     * @see AttributeSet#PROPERTY_SERIALNOCONTROL
     * 
     */
    public void setSerialNoControl(SerialNumberControl serialNoControl) {
        set(PROPERTY_SERIALNOCONTROL, serialNoControl);
    }

    /**
     * @see AttributeSet#PROPERTY_LOT
     * 
     */
    public Boolean isLot() {
        return (Boolean) get(PROPERTY_LOT);
    }
    /**
     * @see AttributeSet#PROPERTY_LOT
     * 
     */
    public void setLot(Boolean lot) {
        set(PROPERTY_LOT, lot);
    }

    /**
     * @see AttributeSet#PROPERTY_LOTCONTROL
     * 
     */
    public LotControl getLotControl() {
        return (LotControl) get(PROPERTY_LOTCONTROL);
    }
    /**
     * @see AttributeSet#PROPERTY_LOTCONTROL
     * 
     */
    public void setLotControl(LotControl lotControl) {
        set(PROPERTY_LOTCONTROL, lotControl);
    }

    /**
     * @see AttributeSet#PROPERTY_EXPIRATIONDATE
     * 
     */
    public Boolean isExpirationDate() {
        return (Boolean) get(PROPERTY_EXPIRATIONDATE);
    }
    /**
     * @see AttributeSet#PROPERTY_EXPIRATIONDATE
     * 
     */
    public void setExpirationDate(Boolean expirationDate) {
        set(PROPERTY_EXPIRATIONDATE, expirationDate);
    }

    /**
     * @see AttributeSet#PROPERTY_GUARANTEEDDAYS
     * 
     */
    public Long getGuaranteedDays() {
        return (Long) get(PROPERTY_GUARANTEEDDAYS);
    }
    /**
     * @see AttributeSet#PROPERTY_GUARANTEEDDAYS
     * 
     */
    public void setGuaranteedDays(Long guaranteedDays) {
        set(PROPERTY_GUARANTEEDDAYS, guaranteedDays);
    }

    /**
     * @see AttributeSet#PROPERTY_LOCKEDINWAREHOUSE
     * 
     */
    public Boolean isLockedInWarehouse() {
        return (Boolean) get(PROPERTY_LOCKEDINWAREHOUSE);
    }
    /**
     * @see AttributeSet#PROPERTY_LOCKEDINWAREHOUSE
     * 
     */
    public void setLockedInWarehouse(Boolean lockedInWarehouse) {
        set(PROPERTY_LOCKEDINWAREHOUSE, lockedInWarehouse);
    }

    /**
     * @see AttributeSet#PROPERTY_REQUIREATLEASTONEVALUE
     * 
     */
    public Boolean isRequireAtLeastOneValue() {
        return (Boolean) get(PROPERTY_REQUIREATLEASTONEVALUE);
    }
    /**
     * @see AttributeSet#PROPERTY_REQUIREATLEASTONEVALUE
     * 
     */
    public void setRequireAtLeastOneValue(Boolean requireAtLeastOneValue) {
        set(PROPERTY_REQUIREATLEASTONEVALUE, requireAtLeastOneValue);
    }

    /**
     * Help: {@literal Attributes and Attribute Values used for the product}<br>
     * @see AttributeUse
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AttributeUse> getAttributeUseList() {
      return (List<AttributeUse>) get(PROPERTY_ATTRIBUTEUSELIST);
    }

    /**
     * Help: {@literal Attributes and Attribute Values used for the product}<br>
     * @see AttributeUse
     * 
     */
    public void setAttributeUseList(List<AttributeUse> attributeUseList) {
        set(PROPERTY_ATTRIBUTEUSELIST, attributeUseList);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Product> getProductList() {
      return (List<Product>) get(PROPERTY_PRODUCTLIST);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    public void setProductList(List<Product> productList) {
        set(PROPERTY_PRODUCTLIST, productList);
    }

}
