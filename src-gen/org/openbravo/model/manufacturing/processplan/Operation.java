
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
import org.openbravo.model.manufacturing.transaction.Activity;
/**
 * Entity class for entity ManufacturingOperation (stored in table MA_Sequence).
 * <br>
 * Help: {@literal In the Sequence table there are defined all the processes that belongs to the selected
     *       process plan.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Operation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Sequence";
    public static final String ENTITY_NAME = "ManufacturingOperation";

    /**
     * Property id stored in column MA_Sequence_ID in table MA_Sequence<br>
     * Help: {@literal The sequence relates the operations with the process plan.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Sequence 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Sequence 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Sequence 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property processPlanVersion stored in column MA_Processplan_Version_ID in table MA_Sequence<br>
     * Help: {@literal Indicates a process plan version.}
     * 
     */
    public static final String PROPERTY_PROCESSPLANVERSION = "processPlanVersion";

    /**
     * Property activity stored in column MA_Process_ID in table MA_Sequence<br>
     * Help: {@literal Indicates a manufacturing process of the enterprise.}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property searchKey stored in column Value in table MA_Sequence<br>
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
     * Property name stored in column Name in table MA_Sequence 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table MA_Sequence<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property costCenterUseTime stored in column CostCenterUse in table MA_Sequence<br>
     * Help: {@literal <p>The duration of this sequence in hours.</p>}
     * 
     */
    public static final String PROPERTY_COSTCENTERUSETIME = "costCenterUseTime";

    /**
     * Property preparationTime stored in column Preptime in table MA_Sequence<br>
     * Help: {@literal Preparation time needed in hours.}
     * 
     */
    public static final String PROPERTY_PREPARATIONTIME = "preparationTime";

    /**
     * Property multiplier stored in column Multiplier in table MA_Sequence<br>
     * Help: {@literal <p>Number of times needed to run this&nbsp;sequence in order to satisfy the complete
     *       process plan.</p>}
     * 
     */
    public static final String PROPERTY_MULTIPLIER = "multiplier";

    /**
     * Property sequenceNumber stored in column SeqNo in table MA_Sequence<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property emptyCellsAreZero stored in column Noqty in table MA_Sequence<br>
     * Help: {@literal <p>When&nbsp;creating a production run,&nbsp;by running the &quot;generating
     *       standards&quot; process required input and output product quantities&nbsp;are automatically filled
     *       in&nbsp;as specified in&nbsp;the work requirement phases.</p>
     *         <p>If this is checked, the
     *       quantities will not be filled in and will be set to zero.</p>}
     * 
     */
    public static final String PROPERTY_EMPTYCELLSAREZERO = "emptyCellsAreZero";

    /**
     * Property globalUse stored in column Groupuse in table MA_Sequence<br>
     * Help: {@literal Each work effort can have several production runs. You can use (consume)&nbsp;the same
     *       product in several ones. If you prefer having the total&nbsp;usage products (grouoped by
     *       product)&nbsp;for all production runs in Global Use tab, check this box.}
     * 
     */
    public static final String PROPERTY_GLOBALUSE = "globalUse";

    /**
     * Property calculated stored in column Calculated in table MA_Sequence<br>
     * Help: {@literal Indicates that the record has been calculated.}
     * 
     */
    public static final String PROPERTY_CALCULATED = "calculated";

    /**
     * Property costCenterCost stored in column Costcentercost in table MA_Sequence<br>
     * Help: {@literal Standard cost amount of the cost center version.}
     * 
     */
    public static final String PROPERTY_COSTCENTERCOST = "costCenterCost";

    /**
     * Property outsourced stored in column Outsourced in table MA_Sequence<br>
     * Help: {@literal Indicates that the correspondent process is being outsourced for the sequence, work
     *       requirement phase or production run.}
     * 
     */
    public static final String PROPERTY_OUTSOURCED = "outsourced";

    /**
     * Property outsourcingCost stored in column Outsourcingcost in table MA_Sequence<br>
     * Help: {@literal <p>If the sequence of a Process Plan is outsourced, you need to input the standard
     *       outsourcing cost here.</p>}
     * 
     */
    public static final String PROPERTY_OUTSOURCINGCOST = "outsourcingCost";

    /**
     * Property default stored in column Isdefault in table MA_Sequence<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property estimatedTime stored in column Estimatedtime in table MA_Sequence<br>
     * Help: {@literal Estimated time for the operation}
     * 
     */
    public static final String PROPERTY_ESTIMATEDTIME = "estimatedTime";

    /**
     * Property createStandards stored in column Usedmaterial in table MA_Sequence<br>
     * Help: {@literal Process to generate standards on production run.}
     * 
     */
    public static final String PROPERTY_CREATESTANDARDS = "createStandards";

    /**
     * Property manufacturingOperationProductList stored in table MA_Sequence
     * 
     */
    public static final String PROPERTY_MANUFACTURINGOPERATIONPRODUCTLIST = "manufacturingOperationProductList";


    public Operation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MULTIPLIER, new BigDecimal(1));
        setDefaultValue(PROPERTY_EMPTYCELLSAREZERO, false);
        setDefaultValue(PROPERTY_GLOBALUSE, false);
        setDefaultValue(PROPERTY_CALCULATED, false);
        setDefaultValue(PROPERTY_OUTSOURCED, false);
        setDefaultValue(PROPERTY_DEFAULT, true);
        setDefaultValue(PROPERTY_ESTIMATEDTIME, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATESTANDARDS, false);
        setDefaultValue(PROPERTY_MANUFACTURINGOPERATIONPRODUCTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Operation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Operation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Operation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Operation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Operation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Operation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Operation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Operation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Operation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Operation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Operation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Operation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Operation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Operation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Operation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Operation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Operation#PROPERTY_PROCESSPLANVERSION
     * 
     */
    public Version getProcessPlanVersion() {
        return (Version) get(PROPERTY_PROCESSPLANVERSION);
    }
    /**
     * @see Operation#PROPERTY_PROCESSPLANVERSION
     * 
     */
    public void setProcessPlanVersion(Version processPlanVersion) {
        set(PROPERTY_PROCESSPLANVERSION, processPlanVersion);
    }

    /**
     * @see Operation#PROPERTY_ACTIVITY
     * 
     */
    public Activity getActivity() {
        return (Activity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see Operation#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(Activity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see Operation#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Operation#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Operation#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Operation#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Operation#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Operation#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Operation#PROPERTY_COSTCENTERUSETIME
     * 
     */
    public BigDecimal getCostCenterUseTime() {
        return (BigDecimal) get(PROPERTY_COSTCENTERUSETIME);
    }
    /**
     * @see Operation#PROPERTY_COSTCENTERUSETIME
     * 
     */
    public void setCostCenterUseTime(BigDecimal costCenterUseTime) {
        set(PROPERTY_COSTCENTERUSETIME, costCenterUseTime);
    }

    /**
     * @see Operation#PROPERTY_PREPARATIONTIME
     * 
     */
    public BigDecimal getPreparationTime() {
        return (BigDecimal) get(PROPERTY_PREPARATIONTIME);
    }
    /**
     * @see Operation#PROPERTY_PREPARATIONTIME
     * 
     */
    public void setPreparationTime(BigDecimal preparationTime) {
        set(PROPERTY_PREPARATIONTIME, preparationTime);
    }

    /**
     * @see Operation#PROPERTY_MULTIPLIER
     * 
     */
    public BigDecimal getMultiplier() {
        return (BigDecimal) get(PROPERTY_MULTIPLIER);
    }
    /**
     * @see Operation#PROPERTY_MULTIPLIER
     * 
     */
    public void setMultiplier(BigDecimal multiplier) {
        set(PROPERTY_MULTIPLIER, multiplier);
    }

    /**
     * @see Operation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see Operation#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see Operation#PROPERTY_EMPTYCELLSAREZERO
     * 
     */
    public Boolean isEmptyCellsAreZero() {
        return (Boolean) get(PROPERTY_EMPTYCELLSAREZERO);
    }
    /**
     * @see Operation#PROPERTY_EMPTYCELLSAREZERO
     * 
     */
    public void setEmptyCellsAreZero(Boolean emptyCellsAreZero) {
        set(PROPERTY_EMPTYCELLSAREZERO, emptyCellsAreZero);
    }

    /**
     * @see Operation#PROPERTY_GLOBALUSE
     * 
     */
    public Boolean isGlobalUse() {
        return (Boolean) get(PROPERTY_GLOBALUSE);
    }
    /**
     * @see Operation#PROPERTY_GLOBALUSE
     * 
     */
    public void setGlobalUse(Boolean globalUse) {
        set(PROPERTY_GLOBALUSE, globalUse);
    }

    /**
     * @see Operation#PROPERTY_CALCULATED
     * 
     */
    public Boolean isCalculated() {
        return (Boolean) get(PROPERTY_CALCULATED);
    }
    /**
     * @see Operation#PROPERTY_CALCULATED
     * 
     */
    public void setCalculated(Boolean calculated) {
        set(PROPERTY_CALCULATED, calculated);
    }

    /**
     * @see Operation#PROPERTY_COSTCENTERCOST
     * 
     */
    public BigDecimal getCostCenterCost() {
        return (BigDecimal) get(PROPERTY_COSTCENTERCOST);
    }
    /**
     * @see Operation#PROPERTY_COSTCENTERCOST
     * 
     */
    public void setCostCenterCost(BigDecimal costCenterCost) {
        set(PROPERTY_COSTCENTERCOST, costCenterCost);
    }

    /**
     * @see Operation#PROPERTY_OUTSOURCED
     * 
     */
    public Boolean isOutsourced() {
        return (Boolean) get(PROPERTY_OUTSOURCED);
    }
    /**
     * @see Operation#PROPERTY_OUTSOURCED
     * 
     */
    public void setOutsourced(Boolean outsourced) {
        set(PROPERTY_OUTSOURCED, outsourced);
    }

    /**
     * @see Operation#PROPERTY_OUTSOURCINGCOST
     * 
     */
    public BigDecimal getOutsourcingCost() {
        return (BigDecimal) get(PROPERTY_OUTSOURCINGCOST);
    }
    /**
     * @see Operation#PROPERTY_OUTSOURCINGCOST
     * 
     */
    public void setOutsourcingCost(BigDecimal outsourcingCost) {
        set(PROPERTY_OUTSOURCINGCOST, outsourcingCost);
    }

    /**
     * @see Operation#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see Operation#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see Operation#PROPERTY_ESTIMATEDTIME
     * 
     */
    public BigDecimal getEstimatedTime() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDTIME);
    }
    /**
     * @see Operation#PROPERTY_ESTIMATEDTIME
     * 
     */
    public void setEstimatedTime(BigDecimal estimatedTime) {
        set(PROPERTY_ESTIMATEDTIME, estimatedTime);
    }

    /**
     * @see Operation#PROPERTY_CREATESTANDARDS
     * 
     */
    public Boolean isCreateStandards() {
        return (Boolean) get(PROPERTY_CREATESTANDARDS);
    }
    /**
     * @see Operation#PROPERTY_CREATESTANDARDS
     * 
     */
    public void setCreateStandards(Boolean createStandards) {
        set(PROPERTY_CREATESTANDARDS, createStandards);
    }

    /**
     * Help: {@literal In this table there are defined all the products involved in the sequence. There must be
     *       defined both the raw materials and the generated products.}<br>
     * @see OperationProduct
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OperationProduct> getManufacturingOperationProductList() {
      return (List<OperationProduct>) get(PROPERTY_MANUFACTURINGOPERATIONPRODUCTLIST);
    }

    /**
     * Help: {@literal In this table there are defined all the products involved in the sequence. There must be
     *       defined both the raw materials and the generated products.}<br>
     * @see OperationProduct
     * 
     */
    public void setManufacturingOperationProductList(List<OperationProduct> manufacturingOperationProductList) {
        set(PROPERTY_MANUFACTURINGOPERATIONPRODUCTLIST, manufacturingOperationProductList);
    }

}
