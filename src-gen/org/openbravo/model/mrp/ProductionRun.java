
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
package org.openbravo.model.mrp;

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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Category;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;
/**
 * Entity class for entity MRPProductionRun (stored in table MRP_Run_Production).
 * <br>
 * Help: {@literal Headers of the production planning processes.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductionRun extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MRP_Run_Production";
    public static final String ENTITY_NAME = "MRPProductionRun";

    /**
     * Property id stored in column MRP_Run_Production_ID in table MRP_Run_Production<br>
     * Help: {@literal Headers of the production planning processes.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MRP_Run_Production 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MRP_Run_Production 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MRP_Run_Production 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MRP_Run_Production 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MRP_Run_Production 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MRP_Run_Production 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MRP_Run_Production 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table MRP_Run_Production 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table MRP_Run_Production<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property documentDate stored in column DateDoc in table MRP_Run_Production<br>
     * Help: {@literal The Document Date indicates the date the document was generated.  It may or may not be the
     *       same as the accounting date.}
     * 
     */
    public static final String PROPERTY_DOCUMENTDATE = "documentDate";

    /**
     * Property planner stored in column MRP_Planner_ID in table MRP_Run_Production<br>
     * Help: {@literal Identifies a planner of the MRP.}
     * 
     */
    public static final String PROPERTY_PLANNER = "planner";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table MRP_Run_Production<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property product stored in column M_Product_ID in table MRP_Run_Production<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartnerCategory stored in column C_BP_Group_ID in table MRP_Run_Production<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table MRP_Run_Production<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property timeHorizon stored in column Timehorizon in table MRP_Run_Production<br>
     * Help: {@literal Time horizon in number of days for the planning process.}
     * 
     */
    public static final String PROPERTY_TIMEHORIZON = "timeHorizon";

    /**
     * Property safetyLeadTime stored in column Securitymargin in table MRP_Run_Production<br>
     * Help: {@literal Safety margin in days for the production of ordered goods and availability of raw
     *       materials. For example, if there is a sales order for product A to be delivered on date X, MRP will
     *       plan to have the product A produced by date X minus the Lead Time number of days. In a similar way,
     *       MRP will make sure that the raw materials required for making product X will be available Lead Time
     *       number of days before the production must commence.}
     * 
     */
    public static final String PROPERTY_SAFETYLEADTIME = "safetyLeadTime";

    /**
     * Property simulate stored in column Simulate in table MRP_Run_Production<br>
     * Help: {@literal Process to run the production planning process.}
     * 
     */
    public static final String PROPERTY_SIMULATE = "simulate";

    /**
     * Property createWorkRequirements stored in column Launchwr in table MRP_Run_Production<br>
     * Help: {@literal Process to generate work requirements.}
     * 
     */
    public static final String PROPERTY_CREATEWORKREQUIREMENTS = "createWorkRequirements";

    /**
     * Property createMaterialsRequirements stored in column Launchmr in table MRP_Run_Production<br>
     * Help: {@literal Process to generate material requirements.}
     * 
     */
    public static final String PROPERTY_CREATEMATERIALSREQUIREMENTS = "createMaterialsRequirements";

    /**
     * Property recalculateStock stored in column Recalculatestock in table MRP_Run_Production<br>
     * Help: {@literal Process to recalculate the product quantities of the lines.}
     * 
     */
    public static final String PROPERTY_RECALCULATESTOCK = "recalculateStock";

    /**
     * Property mRPProductionRunLineList stored in table MRP_Run_Production
     * 
     */
    public static final String PROPERTY_MRPPRODUCTIONRUNLINELIST = "mRPProductionRunLineList";


    public ProductionRun() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_SIMULATE, false);
        setDefaultValue(PROPERTY_CREATEWORKREQUIREMENTS, false);
        setDefaultValue(PROPERTY_CREATEMATERIALSREQUIREMENTS, false);
        setDefaultValue(PROPERTY_RECALCULATESTOCK, false);
        setDefaultValue(PROPERTY_MRPPRODUCTIONRUNLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductionRun#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductionRun#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductionRun#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductionRun#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductionRun#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductionRun#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductionRun#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductionRun#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductionRun#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductionRun#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductionRun#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductionRun#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductionRun#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductionRun#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductionRun#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductionRun#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductionRun#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProductionRun#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProductionRun#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProductionRun#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProductionRun#PROPERTY_DOCUMENTDATE
     * 
     */
    public Date getDocumentDate() {
        return (Date) get(PROPERTY_DOCUMENTDATE);
    }
    /**
     * @see ProductionRun#PROPERTY_DOCUMENTDATE
     * 
     */
    public void setDocumentDate(Date documentDate) {
        set(PROPERTY_DOCUMENTDATE, documentDate);
    }

    /**
     * @see ProductionRun#PROPERTY_PLANNER
     * 
     */
    public Planner getPlanner() {
        return (Planner) get(PROPERTY_PLANNER);
    }
    /**
     * @see ProductionRun#PROPERTY_PLANNER
     * 
     */
    public void setPlanner(Planner planner) {
        set(PROPERTY_PLANNER, planner);
    }

    /**
     * @see ProductionRun#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see ProductionRun#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see ProductionRun#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductionRun#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductionRun#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see ProductionRun#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see ProductionRun#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ProductionRun#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ProductionRun#PROPERTY_TIMEHORIZON
     * 
     */
    public Long getTimeHorizon() {
        return (Long) get(PROPERTY_TIMEHORIZON);
    }
    /**
     * @see ProductionRun#PROPERTY_TIMEHORIZON
     * 
     */
    public void setTimeHorizon(Long timeHorizon) {
        set(PROPERTY_TIMEHORIZON, timeHorizon);
    }

    /**
     * @see ProductionRun#PROPERTY_SAFETYLEADTIME
     * 
     */
    public Long getSafetyLeadTime() {
        return (Long) get(PROPERTY_SAFETYLEADTIME);
    }
    /**
     * @see ProductionRun#PROPERTY_SAFETYLEADTIME
     * 
     */
    public void setSafetyLeadTime(Long safetyLeadTime) {
        set(PROPERTY_SAFETYLEADTIME, safetyLeadTime);
    }

    /**
     * @see ProductionRun#PROPERTY_SIMULATE
     * 
     */
    public Boolean isSimulate() {
        return (Boolean) get(PROPERTY_SIMULATE);
    }
    /**
     * @see ProductionRun#PROPERTY_SIMULATE
     * 
     */
    public void setSimulate(Boolean simulate) {
        set(PROPERTY_SIMULATE, simulate);
    }

    /**
     * @see ProductionRun#PROPERTY_CREATEWORKREQUIREMENTS
     * 
     */
    public Boolean isCreateWorkRequirements() {
        return (Boolean) get(PROPERTY_CREATEWORKREQUIREMENTS);
    }
    /**
     * @see ProductionRun#PROPERTY_CREATEWORKREQUIREMENTS
     * 
     */
    public void setCreateWorkRequirements(Boolean createWorkRequirements) {
        set(PROPERTY_CREATEWORKREQUIREMENTS, createWorkRequirements);
    }

    /**
     * @see ProductionRun#PROPERTY_CREATEMATERIALSREQUIREMENTS
     * 
     */
    public Boolean isCreateMaterialsRequirements() {
        return (Boolean) get(PROPERTY_CREATEMATERIALSREQUIREMENTS);
    }
    /**
     * @see ProductionRun#PROPERTY_CREATEMATERIALSREQUIREMENTS
     * 
     */
    public void setCreateMaterialsRequirements(Boolean createMaterialsRequirements) {
        set(PROPERTY_CREATEMATERIALSREQUIREMENTS, createMaterialsRequirements);
    }

    /**
     * @see ProductionRun#PROPERTY_RECALCULATESTOCK
     * 
     */
    public Boolean isRecalculateStock() {
        return (Boolean) get(PROPERTY_RECALCULATESTOCK);
    }
    /**
     * @see ProductionRun#PROPERTY_RECALCULATESTOCK
     * 
     */
    public void setRecalculateStock(Boolean recalculateStock) {
        set(PROPERTY_RECALCULATESTOCK, recalculateStock);
    }

    /**
     * Help: {@literal Lines of the production planning processes.}<br>
     * @see ProductionRunLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductionRunLine> getMRPProductionRunLineList() {
      return (List<ProductionRunLine>) get(PROPERTY_MRPPRODUCTIONRUNLINELIST);
    }

    /**
     * Help: {@literal Lines of the production planning processes.}<br>
     * @see ProductionRunLine
     * 
     */
    public void setMRPProductionRunLineList(List<ProductionRunLine> mRPProductionRunLineList) {
        set(PROPERTY_MRPPRODUCTIONRUNLINELIST, mRPProductionRunLineList);
    }

}
