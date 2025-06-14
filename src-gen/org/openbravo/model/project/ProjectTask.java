
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
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
/**
 * Entity class for entity ProjectTask (stored in table C_ProjectTask).
 * <br>
 * Help: {@literal A Project Task in a Project Phase represents the actual work.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProjectTask extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ProjectTask";
    public static final String ENTITY_NAME = "ProjectTask";

    /**
     * Property id stored in column C_ProjectTask_ID in table C_ProjectTask<br>
     * Help: {@literal A Project Task in a Project Phase represents the actual work.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property standardTask stored in column C_Task_ID in table C_ProjectTask<br>
     * Help: {@literal Standard Project Task in a Project Phase with standard effort}
     * 
     */
    public static final String PROPERTY_STANDARDTASK = "standardTask";

    /**
     * Property client stored in column AD_Client_ID in table C_ProjectTask 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ProjectTask 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_ProjectTask 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ProjectTask 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_ProjectTask 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ProjectTask 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_ProjectTask 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sequenceNumber stored in column SeqNo in table C_ProjectTask 
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property name stored in column Name in table C_ProjectTask 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_ProjectTask<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table C_ProjectTask<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property product stored in column M_Product_ID in table C_ProjectTask<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property projectPhase stored in column C_ProjectPhase_ID in table C_ProjectTask<br>
     * Help: {@literal Identifies a phase for a particular project.}
     * 
     */
    public static final String PROPERTY_PROJECTPHASE = "projectPhase";

    /**
     * Property quantity stored in column Qty in table C_ProjectTask<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property startingDate stored in column StartDate in table C_ProjectTask<br>
     * Help: {@literal A parameter stating when a specified request will begin.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column Enddate in table C_ProjectTask<br>
     * Help: {@literal The End Date indicates the last date in this range.}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property complete stored in column Iscomplete in table C_ProjectTask<br>
     * Help: {@literal Indication that this is complete}
     * 
     */
    public static final String PROPERTY_COMPLETE = "complete";

    /**
     * Property unitPrice stored in column PriceActual in table C_ProjectTask<br>
     * Help: {@literal The actual price indicates the price for a product in source currency.}
     * 
     */
    public static final String PROPERTY_UNITPRICE = "unitPrice";

    /**
     * Property contractAmount stored in column Committedamt in table C_ProjectTask<br>
     * Help: {@literal The commitment amount is independent from the planned amount. You would use the planned
     *       amount for your realistic estimation, which might be higher or lower than the commitment amount.}
     * 
     */
    public static final String PROPERTY_CONTRACTAMOUNT = "contractAmount";

    /**
     * Property priceCeiling stored in column Iscommitceiling in table C_ProjectTask<br>
     * Help: {@literal The commitment amount and quantity is the maximum amount and quantity to be charged. 
     *       Ignored, if the amount or quantity is zero.}
     * 
     */
    public static final String PROPERTY_PRICECEILING = "priceCeiling";

    /**
     * Property contractDate stored in column Datecontract in table C_ProjectTask<br>
     * Help: {@literal The planned end date is used to determine when the document becomes effective. This is
     *       usually the contract date.  The planned end date is used in reports and report parameters.}
     * 
     */
    public static final String PROPERTY_CONTRACTDATE = "contractDate";


    public ProjectTask() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_QUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_COMPLETE, false);
        setDefaultValue(PROPERTY_PRICECEILING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProjectTask#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProjectTask#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProjectTask#PROPERTY_STANDARDTASK
     * 
     */
    public StandardTask getStandardTask() {
        return (StandardTask) get(PROPERTY_STANDARDTASK);
    }
    /**
     * @see ProjectTask#PROPERTY_STANDARDTASK
     * 
     */
    public void setStandardTask(StandardTask standardTask) {
        set(PROPERTY_STANDARDTASK, standardTask);
    }

    /**
     * @see ProjectTask#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProjectTask#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProjectTask#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProjectTask#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProjectTask#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProjectTask#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProjectTask#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProjectTask#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProjectTask#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProjectTask#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProjectTask#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProjectTask#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProjectTask#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProjectTask#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProjectTask#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ProjectTask#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ProjectTask#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProjectTask#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProjectTask#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProjectTask#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProjectTask#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see ProjectTask#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see ProjectTask#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProjectTask#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProjectTask#PROPERTY_PROJECTPHASE
     * 
     */
    public ProjectPhase getProjectPhase() {
        return (ProjectPhase) get(PROPERTY_PROJECTPHASE);
    }
    /**
     * @see ProjectTask#PROPERTY_PROJECTPHASE
     * 
     */
    public void setProjectPhase(ProjectPhase projectPhase) {
        set(PROPERTY_PROJECTPHASE, projectPhase);
    }

    /**
     * @see ProjectTask#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see ProjectTask#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see ProjectTask#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see ProjectTask#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see ProjectTask#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see ProjectTask#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see ProjectTask#PROPERTY_COMPLETE
     * 
     */
    public Boolean isComplete() {
        return (Boolean) get(PROPERTY_COMPLETE);
    }
    /**
     * @see ProjectTask#PROPERTY_COMPLETE
     * 
     */
    public void setComplete(Boolean complete) {
        set(PROPERTY_COMPLETE, complete);
    }

    /**
     * @see ProjectTask#PROPERTY_UNITPRICE
     * 
     */
    public BigDecimal getUnitPrice() {
        return (BigDecimal) get(PROPERTY_UNITPRICE);
    }
    /**
     * @see ProjectTask#PROPERTY_UNITPRICE
     * 
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        set(PROPERTY_UNITPRICE, unitPrice);
    }

    /**
     * @see ProjectTask#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public BigDecimal getContractAmount() {
        return (BigDecimal) get(PROPERTY_CONTRACTAMOUNT);
    }
    /**
     * @see ProjectTask#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public void setContractAmount(BigDecimal contractAmount) {
        set(PROPERTY_CONTRACTAMOUNT, contractAmount);
    }

    /**
     * @see ProjectTask#PROPERTY_PRICECEILING
     * 
     */
    public Boolean isPriceCeiling() {
        return (Boolean) get(PROPERTY_PRICECEILING);
    }
    /**
     * @see ProjectTask#PROPERTY_PRICECEILING
     * 
     */
    public void setPriceCeiling(Boolean priceCeiling) {
        set(PROPERTY_PRICECEILING, priceCeiling);
    }

    /**
     * @see ProjectTask#PROPERTY_CONTRACTDATE
     * 
     */
    public Date getContractDate() {
        return (Date) get(PROPERTY_CONTRACTDATE);
    }
    /**
     * @see ProjectTask#PROPERTY_CONTRACTDATE
     * 
     */
    public void setContractDate(Date contractDate) {
        set(PROPERTY_CONTRACTDATE, contractDate);
    }

}
