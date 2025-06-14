
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
package org.openbravo.model.manufacturing.transaction;

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
import org.openbravo.model.manufacturing.processplan.Operation;
/**
 * Entity class for entity ManufacturingWorkRequirementOperation (stored in table MA_WRPhase).
 * <br>
 * Help: {@literal In this table there are defined the different phases of the work requirement. Each phase
     *       corresponds to a sequence of the selected&nbsp;process plan.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WorkRequirementOperation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_WRPhase";
    public static final String ENTITY_NAME = "ManufacturingWorkRequirementOperation";

    /**
     * Property id stored in column MA_Wrphase_ID in table MA_WRPhase<br>
     * Help: {@literal Indicates a Work Requirement Phase.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_WRPhase 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_WRPhase 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_WRPhase 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_WRPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_WRPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_WRPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_WRPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property workRequirement stored in column MA_Workrequirement_ID in table MA_WRPhase<br>
     * Help: {@literal Indicates a work requirement.}
     * 
     */
    public static final String PROPERTY_WORKREQUIREMENT = "workRequirement";

    /**
     * Property activity stored in column MA_Process_ID in table MA_WRPhase<br>
     * Help: {@literal Indicates a manufacturing process of the enterprise.}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property quantity stored in column Quantity in table MA_WRPhase<br>
     * Help: {@literal Indicates the quantity of product needed to process one time the sequence.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property completedQuantity stored in column Donequantity in table MA_WRPhase<br>
     * Help: {@literal Indicates the number of times that the work requirement phase has been allready
     *       processed.}
     * 
     */
    public static final String PROPERTY_COMPLETEDQUANTITY = "completedQuantity";

    /**
     * Property costCenterUseTime stored in column CostCenterUse in table MA_WRPhase<br>
     * Help: {@literal <p>The duration of this sequence in hours.</p>}
     * 
     */
    public static final String PROPERTY_COSTCENTERUSETIME = "costCenterUseTime";

    /**
     * Property preparationTime stored in column Preptime in table MA_WRPhase<br>
     * Help: {@literal Preparation time needed in hours.}
     * 
     */
    public static final String PROPERTY_PREPARATIONTIME = "preparationTime";

    /**
     * Property closed stored in column Closed in table MA_WRPhase<br>
     * Help: {@literal Indicates if the work requirement phase has been completely done.}
     * 
     */
    public static final String PROPERTY_CLOSED = "closed";

    /**
     * Property sequenceNumber stored in column SeqNo in table MA_WRPhase 
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property emptyCellsAreZero stored in column Noqty in table MA_WRPhase<br>
     * Help: {@literal <p>When&nbsp;creating a production run,&nbsp;by running the &quot;generating
     *       standards&quot; process required input and output product quantities&nbsp;are automatically filled
     *       in&nbsp;as specified in&nbsp;the work requirement phases.</p>
     *         <p>If this is checked, the
     *       quantities will not be filled in and will be set to zero.</p>}
     * 
     */
    public static final String PROPERTY_EMPTYCELLSAREZERO = "emptyCellsAreZero";

    /**
     * Property globalUse stored in column Groupuse in table MA_WRPhase<br>
     * Help: {@literal Each work effort can have several production runs. You can use (consume)&nbsp;the same
     *       product in several ones. If you prefer having the total&nbsp;usage products (grouoped by
     *       product)&nbsp;for all production runs in Global Use tab, check this box.}
     * 
     */
    public static final String PROPERTY_GLOBALUSE = "globalUse";

    /**
     * Property mASequence stored in column MA_Sequence_ID in table MA_WRPhase<br>
     * Help: {@literal The sequence relates the operations with the process plan.}
     * 
     */
    public static final String PROPERTY_MASEQUENCE = "mASequence";

    /**
     * Property name stored in column Name in table MA_WRPhase<br>
     * Help: {@literal A more descriptive identifier (that does need to be unique) of a record/document that is
     *       used as a default search option along with the search key (that is unique and mostly shorter). It is
     *       up to 60 characters in length.}
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table MA_WRPhase<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property outsourced stored in column Outsourced in table MA_WRPhase<br>
     * Help: {@literal Indicates that the correspondent process is being outsourced for the sequence, work
     *       requirement phase or production run.}
     * 
     */
    public static final String PROPERTY_OUTSOURCED = "outsourced";

    /**
     * Property startingDate stored in column Startdate in table MA_WRPhase<br>
     * Help: {@literal A parameter stating when a specified request will begin.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column Enddate in table MA_WRPhase<br>
     * Help: {@literal The End Date indicates the last date in this range.}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property estimatedTime stored in column Estimatedtime in table MA_WRPhase<br>
     * Help: {@literal Estimated time for the operation}
     * 
     */
    public static final String PROPERTY_ESTIMATEDTIME = "estimatedTime";

    /**
     * Property runTime stored in column Runtime in table MA_WRPhase<br>
     * Help: {@literal Operation run time}
     * 
     */
    public static final String PROPERTY_RUNTIME = "runTime";

    /**
     * Property createStandards stored in column Usedmaterial in table MA_WRPhase<br>
     * Help: {@literal Process to generate standards on production run.}
     * 
     */
    public static final String PROPERTY_CREATESTANDARDS = "createStandards";


    public WorkRequirementOperation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CLOSED, false);
        setDefaultValue(PROPERTY_EMPTYCELLSAREZERO, false);
        setDefaultValue(PROPERTY_GLOBALUSE, false);
        setDefaultValue(PROPERTY_OUTSOURCED, false);
        setDefaultValue(PROPERTY_ESTIMATEDTIME, new BigDecimal(0));
        setDefaultValue(PROPERTY_RUNTIME, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATESTANDARDS, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_WORKREQUIREMENT
     * 
     */
    public WorkRequirement getWorkRequirement() {
        return (WorkRequirement) get(PROPERTY_WORKREQUIREMENT);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_WORKREQUIREMENT
     * 
     */
    public void setWorkRequirement(WorkRequirement workRequirement) {
        set(PROPERTY_WORKREQUIREMENT, workRequirement);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_ACTIVITY
     * 
     */
    public Activity getActivity() {
        return (Activity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(Activity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_COMPLETEDQUANTITY
     * 
     */
    public BigDecimal getCompletedQuantity() {
        return (BigDecimal) get(PROPERTY_COMPLETEDQUANTITY);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_COMPLETEDQUANTITY
     * 
     */
    public void setCompletedQuantity(BigDecimal completedQuantity) {
        set(PROPERTY_COMPLETEDQUANTITY, completedQuantity);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_COSTCENTERUSETIME
     * 
     */
    public BigDecimal getCostCenterUseTime() {
        return (BigDecimal) get(PROPERTY_COSTCENTERUSETIME);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_COSTCENTERUSETIME
     * 
     */
    public void setCostCenterUseTime(BigDecimal costCenterUseTime) {
        set(PROPERTY_COSTCENTERUSETIME, costCenterUseTime);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_PREPARATIONTIME
     * 
     */
    public BigDecimal getPreparationTime() {
        return (BigDecimal) get(PROPERTY_PREPARATIONTIME);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_PREPARATIONTIME
     * 
     */
    public void setPreparationTime(BigDecimal preparationTime) {
        set(PROPERTY_PREPARATIONTIME, preparationTime);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_CLOSED
     * 
     */
    public Boolean isClosed() {
        return (Boolean) get(PROPERTY_CLOSED);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_CLOSED
     * 
     */
    public void setClosed(Boolean closed) {
        set(PROPERTY_CLOSED, closed);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_EMPTYCELLSAREZERO
     * 
     */
    public Boolean isEmptyCellsAreZero() {
        return (Boolean) get(PROPERTY_EMPTYCELLSAREZERO);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_EMPTYCELLSAREZERO
     * 
     */
    public void setEmptyCellsAreZero(Boolean emptyCellsAreZero) {
        set(PROPERTY_EMPTYCELLSAREZERO, emptyCellsAreZero);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_GLOBALUSE
     * 
     */
    public Boolean isGlobalUse() {
        return (Boolean) get(PROPERTY_GLOBALUSE);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_GLOBALUSE
     * 
     */
    public void setGlobalUse(Boolean globalUse) {
        set(PROPERTY_GLOBALUSE, globalUse);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_MASEQUENCE
     * 
     */
    public Operation getMASequence() {
        return (Operation) get(PROPERTY_MASEQUENCE);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_MASEQUENCE
     * 
     */
    public void setMASequence(Operation mASequence) {
        set(PROPERTY_MASEQUENCE, mASequence);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_OUTSOURCED
     * 
     */
    public Boolean isOutsourced() {
        return (Boolean) get(PROPERTY_OUTSOURCED);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_OUTSOURCED
     * 
     */
    public void setOutsourced(Boolean outsourced) {
        set(PROPERTY_OUTSOURCED, outsourced);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_ESTIMATEDTIME
     * 
     */
    public BigDecimal getEstimatedTime() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDTIME);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_ESTIMATEDTIME
     * 
     */
    public void setEstimatedTime(BigDecimal estimatedTime) {
        set(PROPERTY_ESTIMATEDTIME, estimatedTime);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_RUNTIME
     * 
     */
    public BigDecimal getRunTime() {
        return (BigDecimal) get(PROPERTY_RUNTIME);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_RUNTIME
     * 
     */
    public void setRunTime(BigDecimal runTime) {
        set(PROPERTY_RUNTIME, runTime);
    }

    /**
     * @see WorkRequirementOperation#PROPERTY_CREATESTANDARDS
     * 
     */
    public Boolean isCreateStandards() {
        return (Boolean) get(PROPERTY_CREATESTANDARDS);
    }
    /**
     * @see WorkRequirementOperation#PROPERTY_CREATESTANDARDS
     * 
     */
    public void setCreateStandards(Boolean createStandards) {
        set(PROPERTY_CREATESTANDARDS, createStandards);
    }

}
