
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
import org.openbravo.model.manufacturing.processplan.OperationProductAttribute;
/**
 * Entity class for entity AttributeUse (stored in table M_AttributeUse).
 * <br>
 * Help: {@literal Attributes and Attribute Values used for the product}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AttributeUse extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_AttributeUse";
    public static final String ENTITY_NAME = "AttributeUse";

    /**
     * Property id stored in column M_AttributeUse_ID in table M_AttributeUse
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property attribute stored in column M_Attribute_ID in table M_AttributeUse<br>
     * Help: {@literal A defined characteristic of a specific product such as color, size, etc.}
     * 
     */
    public static final String PROPERTY_ATTRIBUTE = "attribute";

    /**
     * Property attributeSet stored in column M_AttributeSet_ID in table M_AttributeUse<br>
     * Help: {@literal Define Product Attribute Sets to add additional attributes and values to the product. You
     *       need to define a Attribute Set if you want to enable Serial and Lot Number tracking.}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESET = "attributeSet";

    /**
     * Property client stored in column AD_Client_ID in table M_AttributeUse 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_AttributeUse 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_AttributeUse 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_AttributeUse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_AttributeUse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_AttributeUse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_AttributeUse 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sequenceNumber stored in column SeqNo in table M_AttributeUse<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property manufacturingOperationProductAttributeMAttributeusetoIDList stored in table M_AttributeUse
     * 
     */
    public static final String PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTEMATTRIBUTEUSETOIDLIST = "manufacturingOperationProductAttributeMAttributeusetoIDList";

    /**
     * Property manufacturingOperationProductAttributeList stored in table M_AttributeUse
     * 
     */
    public static final String PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST = "manufacturingOperationProductAttributeList";


    public AttributeUse() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTEMATTRIBUTEUSETOIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AttributeUse#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AttributeUse#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AttributeUse#PROPERTY_ATTRIBUTE
     * 
     */
    public Attribute getAttribute() {
        return (Attribute) get(PROPERTY_ATTRIBUTE);
    }
    /**
     * @see AttributeUse#PROPERTY_ATTRIBUTE
     * 
     */
    public void setAttribute(Attribute attribute) {
        set(PROPERTY_ATTRIBUTE, attribute);
    }

    /**
     * @see AttributeUse#PROPERTY_ATTRIBUTESET
     * 
     */
    public AttributeSet getAttributeSet() {
        return (AttributeSet) get(PROPERTY_ATTRIBUTESET);
    }
    /**
     * @see AttributeUse#PROPERTY_ATTRIBUTESET
     * 
     */
    public void setAttributeSet(AttributeSet attributeSet) {
        set(PROPERTY_ATTRIBUTESET, attributeSet);
    }

    /**
     * @see AttributeUse#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AttributeUse#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AttributeUse#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AttributeUse#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AttributeUse#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AttributeUse#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AttributeUse#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AttributeUse#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AttributeUse#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AttributeUse#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AttributeUse#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AttributeUse#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AttributeUse#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AttributeUse#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AttributeUse#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see AttributeUse#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * Help: {@literal In this table there are defined how attributes are copied from P- to P+ during the
     *       execution of the process plan.}<br>
     * @see OperationProductAttribute
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OperationProductAttribute> getManufacturingOperationProductAttributeMAttributeusetoIDList() {
      return (List<OperationProductAttribute>) get(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTEMATTRIBUTEUSETOIDLIST);
    }

    /**
     * Help: {@literal In this table there are defined how attributes are copied from P- to P+ during the
     *       execution of the process plan.}<br>
     * @see OperationProductAttribute
     * 
     */
    public void setManufacturingOperationProductAttributeMAttributeusetoIDList(List<OperationProductAttribute> manufacturingOperationProductAttributeMAttributeusetoIDList) {
        set(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTEMATTRIBUTEUSETOIDLIST, manufacturingOperationProductAttributeMAttributeusetoIDList);
    }

    /**
     * Help: {@literal In this table there are defined how attributes are copied from P- to P+ during the
     *       execution of the process plan.}<br>
     * @see OperationProductAttribute
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OperationProductAttribute> getManufacturingOperationProductAttributeList() {
      return (List<OperationProductAttribute>) get(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST);
    }

    /**
     * Help: {@literal In this table there are defined how attributes are copied from P- to P+ during the
     *       execution of the process plan.}<br>
     * @see OperationProductAttribute
     * 
     */
    public void setManufacturingOperationProductAttributeList(List<OperationProductAttribute> manufacturingOperationProductAttributeList) {
        set(PROPERTY_MANUFACTURINGOPERATIONPRODUCTATTRIBUTELIST, manufacturingOperationProductAttributeList);
    }

}
