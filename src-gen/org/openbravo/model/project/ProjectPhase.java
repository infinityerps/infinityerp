
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
package org.openbravo.model.project;

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
import org.openbravo.model.common.order.Order;
import org.openbravo.model.common.plm.Product;
/**
 * Entity class for entity ProjectPhase (stored in table C_ProjectPhase).
 * <br>
 * Help: {@literal Actual Phase of the Project with Status information - generated from Phase of Project
     *       Type.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProjectPhase extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ProjectPhase";
    public static final String ENTITY_NAME = "ProjectPhase";

    /**
     * Property project stored in column C_Project_ID in table C_ProjectPhase<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property client stored in column AD_Client_ID in table C_ProjectPhase 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ProjectPhase 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_ProjectPhase 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ProjectPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_ProjectPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ProjectPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_ProjectPhase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table C_ProjectPhase<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property startingDate stored in column StartDate in table C_ProjectPhase<br>
     * Help: {@literal A parameter stating when a specified request will begin.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column EndDate in table C_ProjectPhase<br>
     * Help: {@literal The End Date indicates the last date in this range.}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property complete stored in column IsComplete in table C_ProjectPhase<br>
     * Help: {@literal Indication that this is complete}
     * 
     */
    public static final String PROPERTY_COMPLETE = "complete";

    /**
     * Property product stored in column M_Product_ID in table C_ProjectPhase<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property unitPrice stored in column PriceActual in table C_ProjectPhase<br>
     * Help: {@literal The actual price indicates the price for a product in source currency.}
     * 
     */
    public static final String PROPERTY_UNITPRICE = "unitPrice";

    /**
     * Property generateOrder stored in column GenerateOrder in table C_ProjectPhase<br>
     * Help: {@literal <P>This process lets you to generate a purchase order to this project.</P>}
     * 
     */
    public static final String PROPERTY_GENERATEORDER = "generateOrder";

    /**
     * Property salesOrder stored in column C_Order_ID in table C_ProjectPhase<br>
     * Help: {@literal Unique identifier and a reference to a Sales Order originating from the document sequence
     *       defined for this document type.}
     * 
     */
    public static final String PROPERTY_SALESORDER = "salesOrder";

    /**
     * Property standardPhase stored in column C_Phase_ID in table C_ProjectPhase<br>
     * Help: {@literal Phase of the project with standard performance information with standard work}
     * 
     */
    public static final String PROPERTY_STANDARDPHASE = "standardPhase";

    /**
     * Property id stored in column C_ProjectPhase_ID in table C_ProjectPhase<br>
     * Help: {@literal Identifies a phase for a particular project.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property helpComment stored in column Help in table C_ProjectPhase<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property name stored in column Name in table C_ProjectPhase 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property quantity stored in column Qty in table C_ProjectPhase<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property sequenceNumber stored in column SeqNo in table C_ProjectPhase 
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property contractAmount stored in column CommittedAmt in table C_ProjectPhase<br>
     * Help: {@literal The commitment amount is independent from the planned amount. You would use the planned
     *       amount for your realistic estimation, which might be higher or lower than the commitment amount.}
     * 
     */
    public static final String PROPERTY_CONTRACTAMOUNT = "contractAmount";

    /**
     * Property priceCeiling stored in column IsCommitCeiling in table C_ProjectPhase<br>
     * Help: {@literal The commitment amount and quantity is the maximum amount and quantity to be charged. 
     *       Ignored, if the amount or quantity is zero.}
     * 
     */
    public static final String PROPERTY_PRICECEILING = "priceCeiling";

    /**
     * Property contractDate stored in column Datecontract in table C_ProjectPhase<br>
     * Help: {@literal The planned end date is used to determine when the document becomes effective. This is
     *       usually the contract date.  The planned end date is used in reports and report parameters.}
     * 
     */
    public static final String PROPERTY_CONTRACTDATE = "contractDate";

    /**
     * Property projectList stored in table C_ProjectPhase
     * 
     */
    public static final String PROPERTY_PROJECTLIST = "projectList";

    /**
     * Property projectTaskList stored in table C_ProjectPhase
     * 
     */
    public static final String PROPERTY_PROJECTTASKLIST = "projectTaskList";


    public ProjectPhase() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COMPLETE, false);
        setDefaultValue(PROPERTY_GENERATEORDER, false);
        setDefaultValue(PROPERTY_QUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_PRICECEILING, false);
        setDefaultValue(PROPERTY_PROJECTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTTASKLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProjectPhase#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see ProjectPhase#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see ProjectPhase#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProjectPhase#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProjectPhase#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProjectPhase#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProjectPhase#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProjectPhase#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProjectPhase#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProjectPhase#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProjectPhase#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProjectPhase#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProjectPhase#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProjectPhase#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProjectPhase#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProjectPhase#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProjectPhase#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProjectPhase#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProjectPhase#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see ProjectPhase#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see ProjectPhase#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see ProjectPhase#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see ProjectPhase#PROPERTY_COMPLETE
     * 
     */
    public Boolean isComplete() {
        return (Boolean) get(PROPERTY_COMPLETE);
    }
    /**
     * @see ProjectPhase#PROPERTY_COMPLETE
     * 
     */
    public void setComplete(Boolean complete) {
        set(PROPERTY_COMPLETE, complete);
    }

    /**
     * @see ProjectPhase#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProjectPhase#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProjectPhase#PROPERTY_UNITPRICE
     * 
     */
    public BigDecimal getUnitPrice() {
        return (BigDecimal) get(PROPERTY_UNITPRICE);
    }
    /**
     * @see ProjectPhase#PROPERTY_UNITPRICE
     * 
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        set(PROPERTY_UNITPRICE, unitPrice);
    }

    /**
     * @see ProjectPhase#PROPERTY_GENERATEORDER
     * 
     */
    public Boolean isGenerateOrder() {
        return (Boolean) get(PROPERTY_GENERATEORDER);
    }
    /**
     * @see ProjectPhase#PROPERTY_GENERATEORDER
     * 
     */
    public void setGenerateOrder(Boolean generateOrder) {
        set(PROPERTY_GENERATEORDER, generateOrder);
    }

    /**
     * @see ProjectPhase#PROPERTY_SALESORDER
     * 
     */
    public Order getSalesOrder() {
        return (Order) get(PROPERTY_SALESORDER);
    }
    /**
     * @see ProjectPhase#PROPERTY_SALESORDER
     * 
     */
    public void setSalesOrder(Order salesOrder) {
        set(PROPERTY_SALESORDER, salesOrder);
    }

    /**
     * @see ProjectPhase#PROPERTY_STANDARDPHASE
     * 
     */
    public StandardPhase getStandardPhase() {
        return (StandardPhase) get(PROPERTY_STANDARDPHASE);
    }
    /**
     * @see ProjectPhase#PROPERTY_STANDARDPHASE
     * 
     */
    public void setStandardPhase(StandardPhase standardPhase) {
        set(PROPERTY_STANDARDPHASE, standardPhase);
    }

    /**
     * @see ProjectPhase#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProjectPhase#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProjectPhase#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see ProjectPhase#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see ProjectPhase#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProjectPhase#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProjectPhase#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see ProjectPhase#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see ProjectPhase#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ProjectPhase#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ProjectPhase#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public BigDecimal getContractAmount() {
        return (BigDecimal) get(PROPERTY_CONTRACTAMOUNT);
    }
    /**
     * @see ProjectPhase#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public void setContractAmount(BigDecimal contractAmount) {
        set(PROPERTY_CONTRACTAMOUNT, contractAmount);
    }

    /**
     * @see ProjectPhase#PROPERTY_PRICECEILING
     * 
     */
    public Boolean isPriceCeiling() {
        return (Boolean) get(PROPERTY_PRICECEILING);
    }
    /**
     * @see ProjectPhase#PROPERTY_PRICECEILING
     * 
     */
    public void setPriceCeiling(Boolean priceCeiling) {
        set(PROPERTY_PRICECEILING, priceCeiling);
    }

    /**
     * @see ProjectPhase#PROPERTY_CONTRACTDATE
     * 
     */
    public Date getContractDate() {
        return (Date) get(PROPERTY_CONTRACTDATE);
    }
    /**
     * @see ProjectPhase#PROPERTY_CONTRACTDATE
     * 
     */
    public void setContractDate(Date contractDate) {
        set(PROPERTY_CONTRACTDATE, contractDate);
    }

    /**
     * Help: {@literal Contains the Value, Name and Description for each project.  It also defines and tracks the
     *       amounts assigned to, committed to and used for this project. This tab is used in order to introduce
     *       information regarding a project: Address, status, …}<br>
     * @see Project
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Project> getProjectList() {
      return (List<Project>) get(PROPERTY_PROJECTLIST);
    }

    /**
     * Help: {@literal Contains the Value, Name and Description for each project.  It also defines and tracks the
     *       amounts assigned to, committed to and used for this project. This tab is used in order to introduce
     *       information regarding a project: Address, status, …}<br>
     * @see Project
     * 
     */
    public void setProjectList(List<Project> projectList) {
        set(PROPERTY_PROJECTLIST, projectList);
    }

    /**
     * Help: {@literal A Project Task in a Project Phase represents the actual work.}<br>
     * @see ProjectTask
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectTask> getProjectTaskList() {
      return (List<ProjectTask>) get(PROPERTY_PROJECTTASKLIST);
    }

    /**
     * Help: {@literal A Project Task in a Project Phase represents the actual work.}<br>
     * @see ProjectTask
     * 
     */
    public void setProjectTaskList(List<ProjectTask> projectTaskList) {
        set(PROPERTY_PROJECTTASKLIST, projectTaskList);
    }

}
