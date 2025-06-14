
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
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.manufacturing.processplan.ProcessPlan;
/**
 * Entity class for entity ManufacturingWorkRequirement (stored in table MA_WorkRequirement).
 * <br>
 * Help: {@literal In this table it's defined the header of the requirement. here it's indicated for example
     *       the process plan.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WorkRequirement extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_WorkRequirement";
    public static final String ENTITY_NAME = "ManufacturingWorkRequirement";

    /**
     * Property id stored in column MA_Workrequirement_ID in table MA_WorkRequirement<br>
     * Help: {@literal Indicates a work requirement.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_WorkRequirement 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_WorkRequirement 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_WorkRequirement 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_WorkRequirement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_WorkRequirement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_WorkRequirement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_WorkRequirement 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table MA_WorkRequirement<br>
     * Help: {@literal A more descriptive identifier (that does need to be unique) of a record/document that is
     *       used as a default search option along with the search key (that is unique and mostly shorter). It is
     *       up to 60 characters in length.}
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property processPlan stored in column MA_Processplan_ID in table MA_WorkRequirement<br>
     * Help: {@literal Indicates a process plan.}
     * 
     */
    public static final String PROPERTY_PROCESSPLAN = "processPlan";

    /**
     * Property quantity stored in column Quantity in table MA_WorkRequirement<br>
     * Help: {@literal Indicates the quantity of product needed to process one time the sequence.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property wRCreationDate stored in column Launchdate in table MA_WorkRequirement<br>
     * Help: {@literal Indicates the date that the work requirement came in.}
     * 
     */
    public static final String PROPERTY_WRCREATIONDATE = "wRCreationDate";

    /**
     * Property startingDate stored in column StartDate in table MA_WorkRequirement 
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column EndDate in table MA_WorkRequirement<br>
     * Help: {@literal The End Date indicates the last date in this range.}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property closed stored in column Closed in table MA_WorkRequirement<br>
     * Help: {@literal Indicates if the work requirement phase has been completely done.}
     * 
     */
    public static final String PROPERTY_CLOSED = "closed";

    /**
     * Property insertProductsAndorPhases stored in column Explote in table MA_WorkRequirement<br>
     * Help: {@literal Process to explode the phases and/or insert the correspondent products to them.}
     * 
     */
    public static final String PROPERTY_INSERTPRODUCTSANDORPHASES = "insertProductsAndorPhases";

    /**
     * Property processed stored in column Processed in table MA_WorkRequirement<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property documentNo stored in column DocumentNo in table MA_WorkRequirement 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property includePhasesWhenInserting stored in column Explodephases in table MA_WorkRequirement<br>
     * Help: {@literal Indicates if the work requirement operations will be generated automatically.}
     * 
     */
    public static final String PROPERTY_INCLUDEPHASESWHENINSERTING = "includePhasesWhenInserting";

    /**
     * Property processQuantity stored in column Secondaryqty in table MA_WorkRequirement<br>
     * Help: {@literal The number of Process Units required to be produced. Usually when it comes to production,
     *       our requirements are specified by a number of final products (Process Units). To avoid the need for
     *       calculating the number of process plan runs, the system allows for entering this number and then
     *       automatically calculating the required process plan runs.}
     * 
     */
    public static final String PROPERTY_PROCESSQUANTITY = "processQuantity";

    /**
     * Property processUnit stored in column Secondaryunit in table MA_WorkRequirement<br>
     * Help: {@literal The name of the main final product obtained by executing a process plan.}
     * 
     */
    public static final String PROPERTY_PROCESSUNIT = "processUnit";

    /**
     * Property conversionRate stored in column Conversionrate in table MA_WorkRequirement<br>
     * Help: {@literal Defines how many final products each run of a process plan produces. See the following
     *       formula to understand the relation between the three elements:
     *       
     *       Process Quantity = Quantity  x 
     *       Conversion Rate}
     * 
     */
    public static final String PROPERTY_CONVERSIONRATE = "conversionRate";

    /**
     * Property estimatedTime stored in column Estimatedtime in table MA_WorkRequirement<br>
     * Help: {@literal Estimated time for the operation}
     * 
     */
    public static final String PROPERTY_ESTIMATEDTIME = "estimatedTime";

    /**
     * Property runTime stored in column Runtime in table MA_WorkRequirement<br>
     * Help: {@literal Operation run time}
     * 
     */
    public static final String PROPERTY_RUNTIME = "runTime";

    /**
     * Property documentType stored in column C_Doctype_ID in table MA_WorkRequirement<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property createworkrequirement stored in column Createworkrequirement in table MA_WorkRequirement<br>
     * Help: {@literal Create all Work Effort for a specific day}
     * 
     */
    public static final String PROPERTY_CREATEWORKREQUIREMENT = "createworkrequirement";


    /**
     * Property _computedColumns stored in column _computedColumns in table MA_WorkRequirement
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";

    /**
     * Property manufacturingWorkRequirementOperationList stored in table MA_WorkRequirement
     * 
     */
    public static final String PROPERTY_MANUFACTURINGWORKREQUIREMENTOPERATIONLIST = "manufacturingWorkRequirementOperationList";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property closedStat<br>
     * <br>
     * Computed from: <br>
     * {@code select closed from dual}
     */
    public static final String COMPUTED_COLUMN_CLOSEDSTAT = "closedStat";

    public WorkRequirement() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CLOSED, false);
        setDefaultValue(PROPERTY_INSERTPRODUCTSANDORPHASES, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_INCLUDEPHASESWHENINSERTING, true);
        setDefaultValue(PROPERTY_ESTIMATEDTIME, new BigDecimal(0));
        setDefaultValue(PROPERTY_RUNTIME, new BigDecimal(0));
        setDefaultValue(PROPERTY_CREATEWORKREQUIREMENT, false);
        setDefaultValue(PROPERTY_MANUFACTURINGWORKREQUIREMENTOPERATIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WorkRequirement#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WorkRequirement#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WorkRequirement#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WorkRequirement#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WorkRequirement#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WorkRequirement#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WorkRequirement#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WorkRequirement#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WorkRequirement#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WorkRequirement#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WorkRequirement#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WorkRequirement#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WorkRequirement#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WorkRequirement#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WorkRequirement#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WorkRequirement#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WorkRequirement#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see WorkRequirement#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see WorkRequirement#PROPERTY_PROCESSPLAN
     * 
     */
    public ProcessPlan getProcessPlan() {
        return (ProcessPlan) get(PROPERTY_PROCESSPLAN);
    }
    /**
     * @see WorkRequirement#PROPERTY_PROCESSPLAN
     * 
     */
    public void setProcessPlan(ProcessPlan processPlan) {
        set(PROPERTY_PROCESSPLAN, processPlan);
    }

    /**
     * @see WorkRequirement#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see WorkRequirement#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see WorkRequirement#PROPERTY_WRCREATIONDATE
     * 
     */
    public Date getWRCreationDate() {
        return (Date) get(PROPERTY_WRCREATIONDATE);
    }
    /**
     * @see WorkRequirement#PROPERTY_WRCREATIONDATE
     * 
     */
    public void setWRCreationDate(Date wRCreationDate) {
        set(PROPERTY_WRCREATIONDATE, wRCreationDate);
    }

    /**
     * @see WorkRequirement#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see WorkRequirement#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see WorkRequirement#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see WorkRequirement#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see WorkRequirement#PROPERTY_CLOSED
     * 
     */
    public Boolean isClosed() {
        return (Boolean) get(PROPERTY_CLOSED);
    }
    /**
     * @see WorkRequirement#PROPERTY_CLOSED
     * 
     */
    public void setClosed(Boolean closed) {
        set(PROPERTY_CLOSED, closed);
    }

    /**
     * @see WorkRequirement#PROPERTY_INSERTPRODUCTSANDORPHASES
     * 
     */
    public Boolean isInsertProductsAndorPhases() {
        return (Boolean) get(PROPERTY_INSERTPRODUCTSANDORPHASES);
    }
    /**
     * @see WorkRequirement#PROPERTY_INSERTPRODUCTSANDORPHASES
     * 
     */
    public void setInsertProductsAndorPhases(Boolean insertProductsAndorPhases) {
        set(PROPERTY_INSERTPRODUCTSANDORPHASES, insertProductsAndorPhases);
    }

    /**
     * @see WorkRequirement#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see WorkRequirement#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see WorkRequirement#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see WorkRequirement#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see WorkRequirement#PROPERTY_INCLUDEPHASESWHENINSERTING
     * 
     */
    public Boolean isIncludePhasesWhenInserting() {
        return (Boolean) get(PROPERTY_INCLUDEPHASESWHENINSERTING);
    }
    /**
     * @see WorkRequirement#PROPERTY_INCLUDEPHASESWHENINSERTING
     * 
     */
    public void setIncludePhasesWhenInserting(Boolean includePhasesWhenInserting) {
        set(PROPERTY_INCLUDEPHASESWHENINSERTING, includePhasesWhenInserting);
    }

    /**
     * @see WorkRequirement#PROPERTY_PROCESSQUANTITY
     * 
     */
    public BigDecimal getProcessQuantity() {
        return (BigDecimal) get(PROPERTY_PROCESSQUANTITY);
    }
    /**
     * @see WorkRequirement#PROPERTY_PROCESSQUANTITY
     * 
     */
    public void setProcessQuantity(BigDecimal processQuantity) {
        set(PROPERTY_PROCESSQUANTITY, processQuantity);
    }

    /**
     * @see WorkRequirement#PROPERTY_PROCESSUNIT
     * 
     */
    public String getProcessUnit() {
        return (String) get(PROPERTY_PROCESSUNIT);
    }
    /**
     * @see WorkRequirement#PROPERTY_PROCESSUNIT
     * 
     */
    public void setProcessUnit(String processUnit) {
        set(PROPERTY_PROCESSUNIT, processUnit);
    }

    /**
     * @see WorkRequirement#PROPERTY_CONVERSIONRATE
     * 
     */
    public BigDecimal getConversionRate() {
        return (BigDecimal) get(PROPERTY_CONVERSIONRATE);
    }
    /**
     * @see WorkRequirement#PROPERTY_CONVERSIONRATE
     * 
     */
    public void setConversionRate(BigDecimal conversionRate) {
        set(PROPERTY_CONVERSIONRATE, conversionRate);
    }

    /**
     * @see WorkRequirement#PROPERTY_ESTIMATEDTIME
     * 
     */
    public BigDecimal getEstimatedTime() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDTIME);
    }
    /**
     * @see WorkRequirement#PROPERTY_ESTIMATEDTIME
     * 
     */
    public void setEstimatedTime(BigDecimal estimatedTime) {
        set(PROPERTY_ESTIMATEDTIME, estimatedTime);
    }

    /**
     * @see WorkRequirement#PROPERTY_RUNTIME
     * 
     */
    public BigDecimal getRunTime() {
        return (BigDecimal) get(PROPERTY_RUNTIME);
    }
    /**
     * @see WorkRequirement#PROPERTY_RUNTIME
     * 
     */
    public void setRunTime(BigDecimal runTime) {
        set(PROPERTY_RUNTIME, runTime);
    }

    /**
     * @see WorkRequirement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see WorkRequirement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see WorkRequirement#PROPERTY_CREATEWORKREQUIREMENT
     * 
     */
    public Boolean isCreateworkrequirement() {
        return (Boolean) get(PROPERTY_CREATEWORKREQUIREMENT);
    }
    /**
     * @see WorkRequirement#PROPERTY_CREATEWORKREQUIREMENT
     * 
     */
    public void setCreateworkrequirement(Boolean createworkrequirement) {
        set(PROPERTY_CREATEWORKREQUIREMENT, createworkrequirement);
    }

    /**
     * @see WorkRequirement#COMPUTED_COLUMN_CLOSEDSTAT
     * 
     */
    public Boolean isClosedStat() {
        return (Boolean) get(COMPUTED_COLUMN_CLOSEDSTAT);
    }
    /**
     * @see WorkRequirement#COMPUTED_COLUMN_CLOSEDSTAT
     * 
     */
    public void setClosedStat(Boolean closedStat) {
        set(COMPUTED_COLUMN_CLOSEDSTAT, closedStat);
    }

    /**
     * @see WorkRequirement#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public WorkRequirement_ComputedColumns get_computedColumns() {
        return (WorkRequirement_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see WorkRequirement#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(WorkRequirement_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }

    /**
     * Help: {@literal In this table there are defined the different phases of the work requirement. Each phase
     *       corresponds to a sequence of the selected&nbsp;process plan.}<br>
     * @see WorkRequirementOperation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<WorkRequirementOperation> getManufacturingWorkRequirementOperationList() {
      return (List<WorkRequirementOperation>) get(PROPERTY_MANUFACTURINGWORKREQUIREMENTOPERATIONLIST);
    }

    /**
     * Help: {@literal In this table there are defined the different phases of the work requirement. Each phase
     *       corresponds to a sequence of the selected&nbsp;process plan.}<br>
     * @see WorkRequirementOperation
     * 
     */
    public void setManufacturingWorkRequirementOperationList(List<WorkRequirementOperation> manufacturingWorkRequirementOperationList) {
        set(PROPERTY_MANUFACTURINGWORKREQUIREMENTOPERATIONLIST, manufacturingWorkRequirementOperationList);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_CLOSEDSTAT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().isClosedStat();
      }

      return super.get(propName);
    }
}
