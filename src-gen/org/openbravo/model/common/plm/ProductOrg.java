
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
package org.openbravo.model.common.plm;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.mrp.Planner;
import org.openbravo.model.mrp.PlanningMethod;
/**
 * Entity class for entity ProductOrg (stored in table M_Product_Org).
 * <br>
 * Help: {@literal Defines details for a product in different organizations.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductOrg extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Org";
    public static final String ENTITY_NAME = "ProductOrg";

    /**
     * Property id stored in column M_Product_Org_ID in table M_Product_Org 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_Org 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_Org 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Product_Org 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Product_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Product_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property product stored in column M_Product_ID in table M_Product_Org<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_Product_Org<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property capacity stored in column Capacity in table M_Product_Org<br>
     * Help: {@literal Capacity per day}
     * 
     */
    public static final String PROPERTY_CAPACITY = "capacity";

    /**
     * Property minimumLeadTime stored in column Delaymin in table M_Product_Org<br>
     * Help: {@literal Minimum number of days to complete the transaction}
     * 
     */
    public static final String PROPERTY_MINIMUMLEADTIME = "minimumLeadTime";

    /**
     * Property planner stored in column MRP_Planner_ID in table M_Product_Org<br>
     * Help: {@literal Identifies a planner of the MRP.}
     * 
     */
    public static final String PROPERTY_PLANNER = "planner";

    /**
     * Property planningMethod stored in column MRP_Planningmethod_ID in table M_Product_Org<br>
     * Help: {@literal Identifies a method for filtering the input for planning processes.}
     * 
     */
    public static final String PROPERTY_PLANNINGMETHOD = "planningMethod";

    /**
     * Property maxQuantity stored in column Qtymax in table M_Product_Org<br>
     * Help: {@literal Maximum Quantity}
     * 
     */
    public static final String PROPERTY_MAXQUANTITY = "maxQuantity";

    /**
     * Property minQuantity stored in column Qtymin in table M_Product_Org<br>
     * Help: {@literal Minumun Quantity.}
     * 
     */
    public static final String PROPERTY_MINQUANTITY = "minQuantity";

    /**
     * Property standardQuantity stored in column Qtystd in table M_Product_Org<br>
     * Help: {@literal Quantity Standard}
     * 
     */
    public static final String PROPERTY_STANDARDQUANTITY = "standardQuantity";

    /**
     * Property quantityType stored in column Qtytype in table M_Product_Org<br>
     * Help: {@literal Quantity Type}
     * 
     */
    public static final String PROPERTY_QUANTITYTYPE = "quantityType";

    /**
     * Property safetyStock stored in column Stockmin in table M_Product_Org<br>
     * Help: {@literal Safety Stock}
     * 
     */
    public static final String PROPERTY_SAFETYSTOCK = "safetyStock";

    /**
     * Property abc stored in column Abc in table M_Product_Org<br>
     * Help: {@literal ABC classification according to a Pareto distribution}
     * 
     */
    public static final String PROPERTY_ABC = "abc";

    /**
     * Property preferredVendor stored in column M_Product_Po_ID in table M_Product_Org<br>
     * Help: {@literal Identifies a product preferred vendor.}
     * 
     */
    public static final String PROPERTY_PREFERREDVENDOR = "preferredVendor";

    /**
     * Property maximumqty stored in column Maximumqty in table M_Product_Org<br>
     * Help: {@literal Max Qty of the product in stock, not reserved. When running purchasing plan to suggest
     *       needed purchase orders to fullfill the pending sales orders and safety stock, it will buy enough to
     *       leave as well the stock in this Max Qty.}
     * 
     */
    public static final String PROPERTY_MAXIMUMQTY = "maximumqty";


    public ProductOrg() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductOrg#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductOrg#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductOrg#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductOrg#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductOrg#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductOrg#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductOrg#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductOrg#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductOrg#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductOrg#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductOrg#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductOrg#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductOrg#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductOrg#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductOrg#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductOrg#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductOrg#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductOrg#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductOrg#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see ProductOrg#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see ProductOrg#PROPERTY_CAPACITY
     * 
     */
    public BigDecimal getCapacity() {
        return (BigDecimal) get(PROPERTY_CAPACITY);
    }
    /**
     * @see ProductOrg#PROPERTY_CAPACITY
     * 
     */
    public void setCapacity(BigDecimal capacity) {
        set(PROPERTY_CAPACITY, capacity);
    }

    /**
     * @see ProductOrg#PROPERTY_MINIMUMLEADTIME
     * 
     */
    public Long getMinimumLeadTime() {
        return (Long) get(PROPERTY_MINIMUMLEADTIME);
    }
    /**
     * @see ProductOrg#PROPERTY_MINIMUMLEADTIME
     * 
     */
    public void setMinimumLeadTime(Long minimumLeadTime) {
        set(PROPERTY_MINIMUMLEADTIME, minimumLeadTime);
    }

    /**
     * @see ProductOrg#PROPERTY_PLANNER
     * 
     */
    public Planner getPlanner() {
        return (Planner) get(PROPERTY_PLANNER);
    }
    /**
     * @see ProductOrg#PROPERTY_PLANNER
     * 
     */
    public void setPlanner(Planner planner) {
        set(PROPERTY_PLANNER, planner);
    }

    /**
     * @see ProductOrg#PROPERTY_PLANNINGMETHOD
     * 
     */
    public PlanningMethod getPlanningMethod() {
        return (PlanningMethod) get(PROPERTY_PLANNINGMETHOD);
    }
    /**
     * @see ProductOrg#PROPERTY_PLANNINGMETHOD
     * 
     */
    public void setPlanningMethod(PlanningMethod planningMethod) {
        set(PROPERTY_PLANNINGMETHOD, planningMethod);
    }

    /**
     * @see ProductOrg#PROPERTY_MAXQUANTITY
     * 
     */
    public BigDecimal getMaxQuantity() {
        return (BigDecimal) get(PROPERTY_MAXQUANTITY);
    }
    /**
     * @see ProductOrg#PROPERTY_MAXQUANTITY
     * 
     */
    public void setMaxQuantity(BigDecimal maxQuantity) {
        set(PROPERTY_MAXQUANTITY, maxQuantity);
    }

    /**
     * @see ProductOrg#PROPERTY_MINQUANTITY
     * 
     */
    public BigDecimal getMinQuantity() {
        return (BigDecimal) get(PROPERTY_MINQUANTITY);
    }
    /**
     * @see ProductOrg#PROPERTY_MINQUANTITY
     * 
     */
    public void setMinQuantity(BigDecimal minQuantity) {
        set(PROPERTY_MINQUANTITY, minQuantity);
    }

    /**
     * @see ProductOrg#PROPERTY_STANDARDQUANTITY
     * 
     */
    public BigDecimal getStandardQuantity() {
        return (BigDecimal) get(PROPERTY_STANDARDQUANTITY);
    }
    /**
     * @see ProductOrg#PROPERTY_STANDARDQUANTITY
     * 
     */
    public void setStandardQuantity(BigDecimal standardQuantity) {
        set(PROPERTY_STANDARDQUANTITY, standardQuantity);
    }

    /**
     * @see ProductOrg#PROPERTY_QUANTITYTYPE
     * 
     */
    public String getQuantityType() {
        return (String) get(PROPERTY_QUANTITYTYPE);
    }
    /**
     * @see ProductOrg#PROPERTY_QUANTITYTYPE
     * 
     */
    public void setQuantityType(String quantityType) {
        set(PROPERTY_QUANTITYTYPE, quantityType);
    }

    /**
     * @see ProductOrg#PROPERTY_SAFETYSTOCK
     * 
     */
    public BigDecimal getSafetyStock() {
        return (BigDecimal) get(PROPERTY_SAFETYSTOCK);
    }
    /**
     * @see ProductOrg#PROPERTY_SAFETYSTOCK
     * 
     */
    public void setSafetyStock(BigDecimal safetyStock) {
        set(PROPERTY_SAFETYSTOCK, safetyStock);
    }

    /**
     * @see ProductOrg#PROPERTY_ABC
     * 
     */
    public String getAbc() {
        return (String) get(PROPERTY_ABC);
    }
    /**
     * @see ProductOrg#PROPERTY_ABC
     * 
     */
    public void setAbc(String abc) {
        set(PROPERTY_ABC, abc);
    }

    /**
     * @see ProductOrg#PROPERTY_PREFERREDVENDOR
     * 
     */
    public ApprovedVendor getPreferredVendor() {
        return (ApprovedVendor) get(PROPERTY_PREFERREDVENDOR);
    }
    /**
     * @see ProductOrg#PROPERTY_PREFERREDVENDOR
     * 
     */
    public void setPreferredVendor(ApprovedVendor preferredVendor) {
        set(PROPERTY_PREFERREDVENDOR, preferredVendor);
    }

    /**
     * @see ProductOrg#PROPERTY_MAXIMUMQTY
     * 
     */
    public BigDecimal getMaximumqty() {
        return (BigDecimal) get(PROPERTY_MAXIMUMQTY);
    }
    /**
     * @see ProductOrg#PROPERTY_MAXIMUMQTY
     * 
     */
    public void setMaximumqty(BigDecimal maximumqty) {
        set(PROPERTY_MAXIMUMQTY, maximumqty);
    }

}
