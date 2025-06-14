
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
package org.openbravo.model.manufacturing.processplan;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.AttributeUse;
/**
 * Entity class for entity ManufacturingOperationProductAttribute (stored in table MA_SequenceProductAtt).
 * <br>
 * Help: {@literal In this table there are defined how attributes are copied from P- to P+ during the
     *       execution of the process plan.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OperationProductAttribute extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_SequenceProductAtt";
    public static final String ENTITY_NAME = "ManufacturingOperationProductAttribute";

    /**
     * Property id stored in column MA_Sequenceproductatt_ID in table MA_SequenceProductAtt 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_SequenceProductAtt 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_SequenceProductAtt 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table MA_SequenceProductAtt 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_SequenceProductAtt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_SequenceProductAtt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_SequenceProductAtt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_SequenceProductAtt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sequenceproduct stored in column MA_Sequenceproduct_ID in table MA_SequenceProductAtt<br>
     * Help: {@literal Indicates each product involved on a sequence.}
     * 
     */
    public static final String PROPERTY_SEQUENCEPRODUCT = "sequenceproduct";

    /**
     * Property attributeuseto stored in column M_Attributeuseto_ID in table MA_SequenceProductAtt<br>
     * Help: {@literal Product Attribute}
     * 
     */
    public static final String PROPERTY_ATTRIBUTEUSETO = "attributeuseto";

    /**
     * Property attributeUse stored in column M_Attributeuse_ID in table MA_SequenceProductAtt
     * 
     */
    public static final String PROPERTY_ATTRIBUTEUSE = "attributeUse";

    /**
     * Property isspecialatt stored in column Isspecialatt in table MA_SequenceProductAtt<br>
     * Help: {@literal Is special attribute}
     * 
     */
    public static final String PROPERTY_ISSPECIALATT = "isspecialatt";

    /**
     * Property specialatt stored in column Specialatt in table MA_SequenceProductAtt<br>
     * Help: {@literal Special Attribute}
     * 
     */
    public static final String PROPERTY_SPECIALATT = "specialatt";

    /**
     * Property productFrom stored in column MA_SequenceProductFrom_ID in table MA_SequenceProductAtt
     * 
     */
    public static final String PROPERTY_PRODUCTFROM = "productFrom";

    /**
     * Property copySpecialIntoNormal stored in column Copy_Special_Into_Normal in table MA_SequenceProductAtt
     * 
     */
    public static final String PROPERTY_COPYSPECIALINTONORMAL = "copySpecialIntoNormal";


    public OperationProductAttribute() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISSPECIALATT, false);
        setDefaultValue(PROPERTY_COPYSPECIALINTONORMAL, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OperationProductAttribute#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_SEQUENCEPRODUCT
     * 
     */
    public OperationProduct getSequenceproduct() {
        return (OperationProduct) get(PROPERTY_SEQUENCEPRODUCT);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_SEQUENCEPRODUCT
     * 
     */
    public void setSequenceproduct(OperationProduct sequenceproduct) {
        set(PROPERTY_SEQUENCEPRODUCT, sequenceproduct);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_ATTRIBUTEUSETO
     * 
     */
    public AttributeUse getAttributeuseto() {
        return (AttributeUse) get(PROPERTY_ATTRIBUTEUSETO);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_ATTRIBUTEUSETO
     * 
     */
    public void setAttributeuseto(AttributeUse attributeuseto) {
        set(PROPERTY_ATTRIBUTEUSETO, attributeuseto);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_ATTRIBUTEUSE
     * 
     */
    public AttributeUse getAttributeUse() {
        return (AttributeUse) get(PROPERTY_ATTRIBUTEUSE);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_ATTRIBUTEUSE
     * 
     */
    public void setAttributeUse(AttributeUse attributeUse) {
        set(PROPERTY_ATTRIBUTEUSE, attributeUse);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_ISSPECIALATT
     * 
     */
    public Boolean isSpecialatt() {
        return (Boolean) get(PROPERTY_ISSPECIALATT);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_ISSPECIALATT
     * 
     */
    public void setSpecialatt(Boolean isspecialatt) {
        set(PROPERTY_ISSPECIALATT, isspecialatt);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_SPECIALATT
     * 
     */
    public String getSpecialatt() {
        return (String) get(PROPERTY_SPECIALATT);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_SPECIALATT
     * 
     */
    public void setSpecialatt(String specialatt) {
        set(PROPERTY_SPECIALATT, specialatt);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_PRODUCTFROM
     * 
     */
    public OperationProduct getProductFrom() {
        return (OperationProduct) get(PROPERTY_PRODUCTFROM);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_PRODUCTFROM
     * 
     */
    public void setProductFrom(OperationProduct productFrom) {
        set(PROPERTY_PRODUCTFROM, productFrom);
    }

    /**
     * @see OperationProductAttribute#PROPERTY_COPYSPECIALINTONORMAL
     * 
     */
    public Boolean isCopySpecialIntoNormal() {
        return (Boolean) get(PROPERTY_COPYSPECIALINTONORMAL);
    }
    /**
     * @see OperationProductAttribute#PROPERTY_COPYSPECIALINTONORMAL
     * 
     */
    public void setCopySpecialIntoNormal(Boolean copySpecialIntoNormal) {
        set(PROPERTY_COPYSPECIALINTONORMAL, copySpecialIntoNormal);
    }

}
