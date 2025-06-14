
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
import org.openbravo.model.common.plm.Product;
/**
 * Entity class for entity ProjectStandardPhase (stored in table C_Phase).
 * <br>
 * Help: {@literal Standard Phase of the project with performance information}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class StandardPhase extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Phase";
    public static final String ENTITY_NAME = "ProjectStandardPhase";

    /**
     * Property client stored in column AD_Client_ID in table C_Phase 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Phase 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Phase 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Phase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Phase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Phase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Phase 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sequenceNumber stored in column SeqNo in table C_Phase<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property name stored in column Name in table C_Phase 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Phase<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table C_Phase<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property projectType stored in column C_ProjectType_ID in table C_Phase<br>
     * Help: {@literal Project Type is a template of a common project. Standard phases and tasks can be entered
     *       into this template and then quickly reused on new projects.}
     * 
     */
    public static final String PROPERTY_PROJECTTYPE = "projectType";

    /**
     * Property standardQuantity stored in column StandardQty in table C_Phase<br>
     * Help: {@literal Standard Quantity}
     * 
     */
    public static final String PROPERTY_STANDARDQUANTITY = "standardQuantity";

    /**
     * Property id stored in column C_Phase_ID in table C_Phase<br>
     * Help: {@literal Phase of the project with standard performance information with standard work}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property product stored in column M_Product_ID in table C_Phase<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property standardDurationInDays stored in column Stdduration in table C_Phase<br>
     * Help: {@literal Standard Duration in Days is used to schedule projects through Set Project Type process.}
     * 
     */
    public static final String PROPERTY_STANDARDDURATIONINDAYS = "standardDurationInDays";

    /**
     * Property projectStandardTaskList stored in table C_Phase
     * 
     */
    public static final String PROPERTY_PROJECTSTANDARDTASKLIST = "projectStandardTaskList";


    public StandardPhase() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_STANDARDQUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_PROJECTSTANDARDTASKLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see StandardPhase#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see StandardPhase#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see StandardPhase#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see StandardPhase#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see StandardPhase#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see StandardPhase#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see StandardPhase#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see StandardPhase#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see StandardPhase#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see StandardPhase#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see StandardPhase#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see StandardPhase#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see StandardPhase#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see StandardPhase#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see StandardPhase#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see StandardPhase#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see StandardPhase#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see StandardPhase#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see StandardPhase#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see StandardPhase#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see StandardPhase#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see StandardPhase#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see StandardPhase#PROPERTY_PROJECTTYPE
     * 
     */
    public ProjectType getProjectType() {
        return (ProjectType) get(PROPERTY_PROJECTTYPE);
    }
    /**
     * @see StandardPhase#PROPERTY_PROJECTTYPE
     * 
     */
    public void setProjectType(ProjectType projectType) {
        set(PROPERTY_PROJECTTYPE, projectType);
    }

    /**
     * @see StandardPhase#PROPERTY_STANDARDQUANTITY
     * 
     */
    public BigDecimal getStandardQuantity() {
        return (BigDecimal) get(PROPERTY_STANDARDQUANTITY);
    }
    /**
     * @see StandardPhase#PROPERTY_STANDARDQUANTITY
     * 
     */
    public void setStandardQuantity(BigDecimal standardQuantity) {
        set(PROPERTY_STANDARDQUANTITY, standardQuantity);
    }

    /**
     * @see StandardPhase#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see StandardPhase#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see StandardPhase#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see StandardPhase#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see StandardPhase#PROPERTY_STANDARDDURATIONINDAYS
     * 
     */
    public Long getStandardDurationInDays() {
        return (Long) get(PROPERTY_STANDARDDURATIONINDAYS);
    }
    /**
     * @see StandardPhase#PROPERTY_STANDARDDURATIONINDAYS
     * 
     */
    public void setStandardDurationInDays(Long standardDurationInDays) {
        set(PROPERTY_STANDARDDURATIONINDAYS, standardDurationInDays);
    }

    /**
     * Help: {@literal Standard Project Task}<br>
     * @see StandardTask
     * 
     */
    @SuppressWarnings("unchecked")
    public List<StandardTask> getProjectStandardTaskList() {
      return (List<StandardTask>) get(PROPERTY_PROJECTSTANDARDTASKLIST);
    }

    /**
     * Help: {@literal Standard Project Task}<br>
     * @see StandardTask
     * 
     */
    public void setProjectStandardTaskList(List<StandardTask> projectStandardTaskList) {
        set(PROPERTY_PROJECTSTANDARDTASKLIST, projectStandardTaskList);
    }

}
