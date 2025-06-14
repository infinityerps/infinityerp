
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
 * Entity class for entity Attribute (stored in table M_Attribute).
 * <br>
 * Help: {@literal Product Attribute like Color, Size, etc.  If it is an Instance Attribute, all products
     *       have the same value.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Attribute extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Attribute";
    public static final String ENTITY_NAME = "Attribute";

    /**
     * Property id stored in column M_Attribute_ID in table M_Attribute<br>
     * Help: {@literal A defined characteristic of a specific product such as color, size, etc.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Attribute 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Attribute 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Attribute 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Attribute 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Attribute 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Attribute 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Attribute 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Attribute 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Attribute<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property mandatory stored in column IsMandatory in table M_Attribute<br>
     * Help: {@literal The Mandatory checkbox indicates if the field is required for a record to be save to the
     *       database.}
     * 
     */
    public static final String PROPERTY_MANDATORY = "mandatory";

    /**
     * Property instanceAttribute stored in column IsInstanceAttribute in table M_Attribute<br>
     * Help: {@literal If selected, the individual instance of the product has this attribute - like the
     *       individual Serial or Lot Numbers or  Guarantee Date of a product instance.  If not selected, all
     *       instances of the product share the attribute (e.g. color=green).}
     * 
     */
    public static final String PROPERTY_INSTANCEATTRIBUTE = "instanceAttribute";

    /**
     * Property list stored in column IsList in table M_Attribute<br>
     * Help: {@literal If the attribute has a predefined list of values, you can select it by choosing one of the
     *       valid values. Otherwise you can enter the attribute value manually.}
     * 
     */
    public static final String PROPERTY_LIST = "list";

    /**
     * Property attributeUseList stored in table M_Attribute
     * 
     */
    public static final String PROPERTY_ATTRIBUTEUSELIST = "attributeUseList";

    /**
     * Property attributeValueList stored in table M_Attribute
     * 
     */
    public static final String PROPERTY_ATTRIBUTEVALUELIST = "attributeValueList";


    public Attribute() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MANDATORY, false);
        setDefaultValue(PROPERTY_INSTANCEATTRIBUTE, false);
        setDefaultValue(PROPERTY_LIST, true);
        setDefaultValue(PROPERTY_ATTRIBUTEUSELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ATTRIBUTEVALUELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Attribute#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Attribute#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Attribute#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Attribute#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Attribute#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Attribute#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Attribute#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Attribute#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Attribute#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Attribute#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Attribute#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Attribute#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Attribute#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Attribute#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Attribute#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Attribute#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Attribute#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Attribute#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Attribute#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Attribute#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Attribute#PROPERTY_MANDATORY
     * 
     */
    public Boolean isMandatory() {
        return (Boolean) get(PROPERTY_MANDATORY);
    }
    /**
     * @see Attribute#PROPERTY_MANDATORY
     * 
     */
    public void setMandatory(Boolean mandatory) {
        set(PROPERTY_MANDATORY, mandatory);
    }

    /**
     * @see Attribute#PROPERTY_INSTANCEATTRIBUTE
     * 
     */
    public Boolean isInstanceAttribute() {
        return (Boolean) get(PROPERTY_INSTANCEATTRIBUTE);
    }
    /**
     * @see Attribute#PROPERTY_INSTANCEATTRIBUTE
     * 
     */
    public void setInstanceAttribute(Boolean instanceAttribute) {
        set(PROPERTY_INSTANCEATTRIBUTE, instanceAttribute);
    }

    /**
     * @see Attribute#PROPERTY_LIST
     * 
     */
    public Boolean isList() {
        return (Boolean) get(PROPERTY_LIST);
    }
    /**
     * @see Attribute#PROPERTY_LIST
     * 
     */
    public void setList(Boolean list) {
        set(PROPERTY_LIST, list);
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
     * Help: {@literal Individual value of a product attribute (e.g. green, large, ..)}<br>
     * @see AttributeValue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AttributeValue> getAttributeValueList() {
      return (List<AttributeValue>) get(PROPERTY_ATTRIBUTEVALUELIST);
    }

    /**
     * Help: {@literal Individual value of a product attribute (e.g. green, large, ..)}<br>
     * @see AttributeValue
     * 
     */
    public void setAttributeValueList(List<AttributeValue> attributeValueList) {
        set(PROPERTY_ATTRIBUTEVALUELIST, attributeValueList);
    }

}
