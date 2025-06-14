
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
package org.openbravo.model.materialmgmt.transaction;

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
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.manufacturing.cost.CostcenterVersion;
import org.openbravo.model.manufacturing.transaction.ProductionRunInvoiceLine;
import org.openbravo.model.manufacturing.transaction.WorkRequirementOperation;
/**
 * Entity class for entity MaterialMgmtProductionPlan (stored in table M_ProductionPlan).
 * <br>
 * Help: {@literal Contains the items used and generated in a production}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductionPlan extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_ProductionPlan";
    public static final String ENTITY_NAME = "MaterialMgmtProductionPlan";

    /**
     * Property id stored in column M_ProductionPlan_ID in table M_ProductionPlan<br>
     * Help: {@literal The Production Plan identifies the items and steps in generating a product.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_ProductionPlan 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_ProductionPlan 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_ProductionPlan 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_ProductionPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_ProductionPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_ProductionPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_ProductionPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property production stored in column M_Production_ID in table M_ProductionPlan<br>
     * Help: {@literal The Production uniquely identifies a Production Plan}
     * 
     */
    public static final String PROPERTY_PRODUCTION = "production";

    /**
     * Property lineNo stored in column Line in table M_ProductionPlan 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property product stored in column M_Product_ID in table M_ProductionPlan<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property productionQuantity stored in column ProductionQty in table M_ProductionPlan<br>
     * Help: {@literal The Production Quantity identifies the number of products to produce}
     * 
     */
    public static final String PROPERTY_PRODUCTIONQUANTITY = "productionQuantity";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_ProductionPlan<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property description stored in column Description in table M_ProductionPlan<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property conversionRate stored in column Conversionrate in table M_ProductionPlan<br>
     * Help: {@literal Defines how many final products each run of a process plan produces. See the following
     *       formula to understand the relation between the three elements:
     *       
     *       Process Quantity = Quantity  x 
     *       Conversion Rate}
     * 
     */
    public static final String PROPERTY_CONVERSIONRATE = "conversionRate";

    /**
     * Property costCenterUse stored in column MA_Costcenteruse in table M_ProductionPlan<br>
     * Help: {@literal Use of the cost center.}
     * 
     */
    public static final String PROPERTY_COSTCENTERUSE = "costCenterUse";

    /**
     * Property wRPhase stored in column MA_Wrphase_ID in table M_ProductionPlan<br>
     * Help: {@literal Indicates a Work Requirement Phase.}
     * 
     */
    public static final String PROPERTY_WRPHASE = "wRPhase";

    /**
     * Property requiredQuantity stored in column Neededquantity in table M_ProductionPlan<br>
     * Help: {@literal How many times it is necessary to complete a phase before closing it.}
     * 
     */
    public static final String PROPERTY_REQUIREDQUANTITY = "requiredQuantity";

    /**
     * Property processed stored in column Processed in table M_ProductionPlan<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property rejectedQuantity stored in column Rejectedquantity in table M_ProductionPlan<br>
     * Help: {@literal How many products have been rejected.}
     * 
     */
    public static final String PROPERTY_REJECTEDQUANTITY = "rejectedQuantity";

    /**
     * Property processQuantity stored in column Secondaryqty in table M_ProductionPlan<br>
     * Help: {@literal The number of Process Units required to be produced. Usually when it comes to production,
     *       our requirements are specified by a number of final products (Process Units). To avoid the need for
     *       calculating the number of process plan runs, the system allows for entering this number and then
     *       automatically calculating the required process plan runs.}
     * 
     */
    public static final String PROPERTY_PROCESSQUANTITY = "processQuantity";

    /**
     * Property processUnit stored in column Secondaryunit in table M_ProductionPlan<br>
     * Help: {@literal The name of the main final product obtained by executing a process plan.}
     * 
     */
    public static final String PROPERTY_PROCESSUNIT = "processUnit";

    /**
     * Property createStandards stored in column Usedmaterial in table M_ProductionPlan<br>
     * Help: {@literal Process to generate standards on production run.}
     * 
     */
    public static final String PROPERTY_CREATESTANDARDS = "createStandards";

    /**
     * Property estimatedCost stored in column Calccost in table M_ProductionPlan<br>
     * Help: {@literal Is the calculated cost amount.}
     * 
     */
    public static final String PROPERTY_ESTIMATEDCOST = "estimatedCost";

    /**
     * Property costCenterVersion stored in column MA_Costcenter_Version_ID in table M_ProductionPlan<br>
     * Help: {@literal Identifies a cost center version valid during a time period.}
     * 
     */
    public static final String PROPERTY_COSTCENTERVERSION = "costCenterVersion";

    /**
     * Property outsourced stored in column Outsourced in table M_ProductionPlan<br>
     * Help: {@literal Indicates that the correspondent process is being outsourced for the sequence, work
     *       requirement phase or production run.}
     * 
     */
    public static final String PROPERTY_OUTSOURCED = "outsourced";

    /**
     * Property startingTime stored in column Starttime in table M_ProductionPlan<br>
     * Help: {@literal Start time in hours.}
     * 
     */
    public static final String PROPERTY_STARTINGTIME = "startingTime";

    /**
     * Property endingTime stored in column Endtime in table M_ProductionPlan<br>
     * Help: {@literal End time in hours.}
     * 
     */
    public static final String PROPERTY_ENDINGTIME = "endingTime";

    /**
     * Property estimatedTime stored in column Estimatedtime in table M_ProductionPlan<br>
     * Help: {@literal Estimated time for the operation}
     * 
     */
    public static final String PROPERTY_ESTIMATEDTIME = "estimatedTime";

    /**
     * Property runTime stored in column Runtime in table M_ProductionPlan<br>
     * Help: {@literal Operation run time}
     * 
     */
    public static final String PROPERTY_RUNTIME = "runTime";

    /**
     * Property closephase stored in column Closephase in table M_ProductionPlan<br>
     * Help: {@literal If is checked the work requirement phase will be closed when the work effort is validated
     *       }
     * 
     */
    public static final String PROPERTY_CLOSEPHASE = "closephase";

    /**
     * Property validateWorkEffort stored in column Validating in table M_ProductionPlan<br>
     * Help: {@literal Process to validate the work effort.}
     * 
     */
    public static final String PROPERTY_VALIDATEWORKEFFORT = "validateWorkEffort";

    /**
     * Property productionplandate stored in column Productionplandate in table M_ProductionPlan
     * 
     */
    public static final String PROPERTY_PRODUCTIONPLANDATE = "productionplandate";

    /**
     * Property manufacturingProductionLineList stored in table M_ProductionPlan
     * 
     */
    public static final String PROPERTY_MANUFACTURINGPRODUCTIONLINELIST = "manufacturingProductionLineList";

    /**
     * Property manufacturingProductionRunInvoiceLineList stored in table M_ProductionPlan
     * 
     */
    public static final String PROPERTY_MANUFACTURINGPRODUCTIONRUNINVOICELINELIST = "manufacturingProductionRunInvoiceLineList";


    public ProductionPlan() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_CREATESTANDARDS, false);
        setDefaultValue(PROPERTY_OUTSOURCED, false);
        setDefaultValue(PROPERTY_ESTIMATEDTIME, new BigDecimal(0));
        setDefaultValue(PROPERTY_RUNTIME, (long) 0);
        setDefaultValue(PROPERTY_CLOSEPHASE, false);
        setDefaultValue(PROPERTY_VALIDATEWORKEFFORT, false);
        setDefaultValue(PROPERTY_MANUFACTURINGPRODUCTIONLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGPRODUCTIONRUNINVOICELINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductionPlan#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductionPlan#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductionPlan#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductionPlan#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductionPlan#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductionPlan#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductionPlan#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductionPlan#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductionPlan#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductionPlan#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductionPlan#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductionPlan#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductionPlan#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductionPlan#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductionPlan#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductionPlan#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductionPlan#PROPERTY_PRODUCTION
     * 
     */
    public ProductionTransaction getProduction() {
        return (ProductionTransaction) get(PROPERTY_PRODUCTION);
    }
    /**
     * @see ProductionPlan#PROPERTY_PRODUCTION
     * 
     */
    public void setProduction(ProductionTransaction production) {
        set(PROPERTY_PRODUCTION, production);
    }

    /**
     * @see ProductionPlan#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see ProductionPlan#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see ProductionPlan#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductionPlan#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductionPlan#PROPERTY_PRODUCTIONQUANTITY
     * 
     */
    public BigDecimal getProductionQuantity() {
        return (BigDecimal) get(PROPERTY_PRODUCTIONQUANTITY);
    }
    /**
     * @see ProductionPlan#PROPERTY_PRODUCTIONQUANTITY
     * 
     */
    public void setProductionQuantity(BigDecimal productionQuantity) {
        set(PROPERTY_PRODUCTIONQUANTITY, productionQuantity);
    }

    /**
     * @see ProductionPlan#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ProductionPlan#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ProductionPlan#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProductionPlan#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProductionPlan#PROPERTY_CONVERSIONRATE
     * 
     */
    public BigDecimal getConversionRate() {
        return (BigDecimal) get(PROPERTY_CONVERSIONRATE);
    }
    /**
     * @see ProductionPlan#PROPERTY_CONVERSIONRATE
     * 
     */
    public void setConversionRate(BigDecimal conversionRate) {
        set(PROPERTY_CONVERSIONRATE, conversionRate);
    }

    /**
     * @see ProductionPlan#PROPERTY_COSTCENTERUSE
     * 
     */
    public BigDecimal getCostCenterUse() {
        return (BigDecimal) get(PROPERTY_COSTCENTERUSE);
    }
    /**
     * @see ProductionPlan#PROPERTY_COSTCENTERUSE
     * 
     */
    public void setCostCenterUse(BigDecimal costCenterUse) {
        set(PROPERTY_COSTCENTERUSE, costCenterUse);
    }

    /**
     * @see ProductionPlan#PROPERTY_WRPHASE
     * 
     */
    public WorkRequirementOperation getWRPhase() {
        return (WorkRequirementOperation) get(PROPERTY_WRPHASE);
    }
    /**
     * @see ProductionPlan#PROPERTY_WRPHASE
     * 
     */
    public void setWRPhase(WorkRequirementOperation wRPhase) {
        set(PROPERTY_WRPHASE, wRPhase);
    }

    /**
     * @see ProductionPlan#PROPERTY_REQUIREDQUANTITY
     * 
     */
    public BigDecimal getRequiredQuantity() {
        return (BigDecimal) get(PROPERTY_REQUIREDQUANTITY);
    }
    /**
     * @see ProductionPlan#PROPERTY_REQUIREDQUANTITY
     * 
     */
    public void setRequiredQuantity(BigDecimal requiredQuantity) {
        set(PROPERTY_REQUIREDQUANTITY, requiredQuantity);
    }

    /**
     * @see ProductionPlan#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see ProductionPlan#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see ProductionPlan#PROPERTY_REJECTEDQUANTITY
     * 
     */
    public BigDecimal getRejectedQuantity() {
        return (BigDecimal) get(PROPERTY_REJECTEDQUANTITY);
    }
    /**
     * @see ProductionPlan#PROPERTY_REJECTEDQUANTITY
     * 
     */
    public void setRejectedQuantity(BigDecimal rejectedQuantity) {
        set(PROPERTY_REJECTEDQUANTITY, rejectedQuantity);
    }

    /**
     * @see ProductionPlan#PROPERTY_PROCESSQUANTITY
     * 
     */
    public BigDecimal getProcessQuantity() {
        return (BigDecimal) get(PROPERTY_PROCESSQUANTITY);
    }
    /**
     * @see ProductionPlan#PROPERTY_PROCESSQUANTITY
     * 
     */
    public void setProcessQuantity(BigDecimal processQuantity) {
        set(PROPERTY_PROCESSQUANTITY, processQuantity);
    }

    /**
     * @see ProductionPlan#PROPERTY_PROCESSUNIT
     * 
     */
    public String getProcessUnit() {
        return (String) get(PROPERTY_PROCESSUNIT);
    }
    /**
     * @see ProductionPlan#PROPERTY_PROCESSUNIT
     * 
     */
    public void setProcessUnit(String processUnit) {
        set(PROPERTY_PROCESSUNIT, processUnit);
    }

    /**
     * @see ProductionPlan#PROPERTY_CREATESTANDARDS
     * 
     */
    public Boolean isCreateStandards() {
        return (Boolean) get(PROPERTY_CREATESTANDARDS);
    }
    /**
     * @see ProductionPlan#PROPERTY_CREATESTANDARDS
     * 
     */
    public void setCreateStandards(Boolean createStandards) {
        set(PROPERTY_CREATESTANDARDS, createStandards);
    }

    /**
     * @see ProductionPlan#PROPERTY_ESTIMATEDCOST
     * 
     */
    public BigDecimal getEstimatedCost() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDCOST);
    }
    /**
     * @see ProductionPlan#PROPERTY_ESTIMATEDCOST
     * 
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        set(PROPERTY_ESTIMATEDCOST, estimatedCost);
    }

    /**
     * @see ProductionPlan#PROPERTY_COSTCENTERVERSION
     * 
     */
    public CostcenterVersion getCostCenterVersion() {
        return (CostcenterVersion) get(PROPERTY_COSTCENTERVERSION);
    }
    /**
     * @see ProductionPlan#PROPERTY_COSTCENTERVERSION
     * 
     */
    public void setCostCenterVersion(CostcenterVersion costCenterVersion) {
        set(PROPERTY_COSTCENTERVERSION, costCenterVersion);
    }

    /**
     * @see ProductionPlan#PROPERTY_OUTSOURCED
     * 
     */
    public Boolean isOutsourced() {
        return (Boolean) get(PROPERTY_OUTSOURCED);
    }
    /**
     * @see ProductionPlan#PROPERTY_OUTSOURCED
     * 
     */
    public void setOutsourced(Boolean outsourced) {
        set(PROPERTY_OUTSOURCED, outsourced);
    }

    /**
     * @see ProductionPlan#PROPERTY_STARTINGTIME
     * 
     */
    public Date getStartingTime() {
        return (Date) get(PROPERTY_STARTINGTIME);
    }
    /**
     * @see ProductionPlan#PROPERTY_STARTINGTIME
     * 
     */
    public void setStartingTime(Date startingTime) {
        set(PROPERTY_STARTINGTIME, startingTime);
    }

    /**
     * @see ProductionPlan#PROPERTY_ENDINGTIME
     * 
     */
    public Date getEndingTime() {
        return (Date) get(PROPERTY_ENDINGTIME);
    }
    /**
     * @see ProductionPlan#PROPERTY_ENDINGTIME
     * 
     */
    public void setEndingTime(Date endingTime) {
        set(PROPERTY_ENDINGTIME, endingTime);
    }

    /**
     * @see ProductionPlan#PROPERTY_ESTIMATEDTIME
     * 
     */
    public BigDecimal getEstimatedTime() {
        return (BigDecimal) get(PROPERTY_ESTIMATEDTIME);
    }
    /**
     * @see ProductionPlan#PROPERTY_ESTIMATEDTIME
     * 
     */
    public void setEstimatedTime(BigDecimal estimatedTime) {
        set(PROPERTY_ESTIMATEDTIME, estimatedTime);
    }

    /**
     * @see ProductionPlan#PROPERTY_RUNTIME
     * 
     */
    public Long getRunTime() {
        return (Long) get(PROPERTY_RUNTIME);
    }
    /**
     * @see ProductionPlan#PROPERTY_RUNTIME
     * 
     */
    public void setRunTime(Long runTime) {
        set(PROPERTY_RUNTIME, runTime);
    }

    /**
     * @see ProductionPlan#PROPERTY_CLOSEPHASE
     * 
     */
    public Boolean isClosephase() {
        return (Boolean) get(PROPERTY_CLOSEPHASE);
    }
    /**
     * @see ProductionPlan#PROPERTY_CLOSEPHASE
     * 
     */
    public void setClosephase(Boolean closephase) {
        set(PROPERTY_CLOSEPHASE, closephase);
    }

    /**
     * @see ProductionPlan#PROPERTY_VALIDATEWORKEFFORT
     * 
     */
    public Boolean isValidateWorkEffort() {
        return (Boolean) get(PROPERTY_VALIDATEWORKEFFORT);
    }
    /**
     * @see ProductionPlan#PROPERTY_VALIDATEWORKEFFORT
     * 
     */
    public void setValidateWorkEffort(Boolean validateWorkEffort) {
        set(PROPERTY_VALIDATEWORKEFFORT, validateWorkEffort);
    }

    /**
     * @see ProductionPlan#PROPERTY_PRODUCTIONPLANDATE
     * 
     */
    public Date getProductionplandate() {
        return (Date) get(PROPERTY_PRODUCTIONPLANDATE);
    }
    /**
     * @see ProductionPlan#PROPERTY_PRODUCTIONPLANDATE
     * 
     */
    public void setProductionplandate(Date productionplandate) {
        set(PROPERTY_PRODUCTIONPLANDATE, productionplandate);
    }

    /**
     * Help: {@literal Contains all the products that have been used or created in the production run and the
     *       related quantities}<br>
     * @see ProductionLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductionLine> getManufacturingProductionLineList() {
      return (List<ProductionLine>) get(PROPERTY_MANUFACTURINGPRODUCTIONLINELIST);
    }

    /**
     * Help: {@literal Contains all the products that have been used or created in the production run and the
     *       related quantities}<br>
     * @see ProductionLine
     * 
     */
    public void setManufacturingProductionLineList(List<ProductionLine> manufacturingProductionLineList) {
        set(PROPERTY_MANUFACTURINGPRODUCTIONLINELIST, manufacturingProductionLineList);
    }

    /**
     * Help: {@literal In this table are stored the invoice lines involved on each production run.}<br>
     * @see ProductionRunInvoiceLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductionRunInvoiceLine> getManufacturingProductionRunInvoiceLineList() {
      return (List<ProductionRunInvoiceLine>) get(PROPERTY_MANUFACTURINGPRODUCTIONRUNINVOICELINELIST);
    }

    /**
     * Help: {@literal In this table are stored the invoice lines involved on each production run.}<br>
     * @see ProductionRunInvoiceLine
     * 
     */
    public void setManufacturingProductionRunInvoiceLineList(List<ProductionRunInvoiceLine> manufacturingProductionRunInvoiceLineList) {
        set(PROPERTY_MANUFACTURINGPRODUCTIONRUNINVOICELINELIST, manufacturingProductionRunInvoiceLineList);
    }

}
