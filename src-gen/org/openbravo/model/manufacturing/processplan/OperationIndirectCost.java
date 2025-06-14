
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

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.manufacturing.cost.IndirectCost;
/**
 * Entity class for entity ManufacturingOperationIndirectCost (stored in table MA_Sequence_IC).
 * <br>
 * Help: {@literal Table where is stored each indirect standard cost amount for a sequence.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OperationIndirectCost extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Sequence_IC";
    public static final String ENTITY_NAME = "ManufacturingOperationIndirectCost";

    /**
     * Property id stored in column MA_Sequence_Ic_ID in table MA_Sequence_IC 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Sequence_IC 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Sequence_IC 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Sequence_IC 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Sequence_IC 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Sequence_IC 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Sequence_IC 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Sequence_IC 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property mASequence stored in column MA_Sequence_ID in table MA_Sequence_IC<br>
     * Help: {@literal The sequence relates the operations with the process plan.}
     * 
     */
    public static final String PROPERTY_MASEQUENCE = "mASequence";

    /**
     * Property indirectCost stored in column MA_Indirect_Cost_ID in table MA_Sequence_IC<br>
     * Help: {@literal Indicates an indirect cost.}
     * 
     */
    public static final String PROPERTY_INDIRECTCOST = "indirectCost";

    /**
     * Property estimatedCost stored in column Calccost in table MA_Sequence_IC<br>
     * Help: {@literal Is the calculated cost amount.}
     * 
     */
    public static final String PROPERTY_ESTIMATEDCOST = "estimatedCost";


    public OperationIndirectCost() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OperationIndirectCost#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_MASEQUENCE
     * 
     */
    public Operation getMASequence() {
        return (Operation) get(PROPERTY_MASEQUENCE);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_MASEQUENCE
     * 
     */
    public void setMASequence(Operation mASequence) {
        set(PROPERTY_MASEQUENCE, mASequence);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_INDIRECTCOST
     * 
     */
    public IndirectCost getIndirectCost() {
        return (IndirectCost) get(PROPERTY_INDIRECTCOST);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_INDIRECTCOST
     * 
     */
    public void setIndirectCost(IndirectCost indirectCost) {
        set(PROPERTY_INDIRECTCOST, indirectCost);
    }

    /**
     * @see OperationIndirectCost#PROPERTY_ESTIMATEDCOST
     * 
     */
    public BigDecimal getEstimatedCost() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDCOST);
    }
    /**
     * @see OperationIndirectCost#PROPERTY_ESTIMATEDCOST
     * 
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        set(PROPERTY_ESTIMATEDCOST, estimatedCost);
    }

}
