
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
package org.openbravo.model.sales;

import java.math.BigDecimal;
import java.util.Date;

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
 * Entity class for entity SalesCommissionLine (stored in table C_CommissionLine).
 * <br>
 * Help: {@literal Define the selection criteria for paying the commission. If you do not enter restricting
     *       parameters (e.g. for specific Business Partner (Groups) or Product (Categories), etc. all
     *       transactions for the period will be used to calculate the commission.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CommissionLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_CommissionLine";
    public static final String ENTITY_NAME = "SalesCommissionLine";

    /**
     * Property id stored in column C_CommissionLine_ID in table C_CommissionLine<br>
     * Help: {@literal The Commission Line is a unique instance of a Commission Run.  If the commission run was
     *       done in summary mode then there will be a single line representing the selected documents totals. 
     *       If the commission run was done in detail mode then each document that was included in the run will
     *       have its own commission line.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_CommissionLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_CommissionLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_CommissionLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_CommissionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_CommissionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_CommissionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_CommissionLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property commission stored in column C_Commission_ID in table C_CommissionLine<br>
     * Help: {@literal The Commission ID is a unique identifier of a set of commission rules.}
     * 
     */
    public static final String PROPERTY_COMMISSION = "commission";

    /**
     * Property lineNo stored in column Line in table C_CommissionLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property description stored in column Description in table C_CommissionLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property subtractAmount stored in column AmtSubtract in table C_CommissionLine<br>
     * Help: {@literal The Subtract Amount indicates the amount to subtract from the total amount prior to
     *       multiplication.}
     * 
     */
    public static final String PROPERTY_SUBTRACTAMOUNT = "subtractAmount";

    /**
     * Property multiplierAmount stored in column AmtMultiplier in table C_CommissionLine<br>
     * Help: {@literal The Multiplier Amount indicates the amount to multiply the total amount generated by this
     *       commission run by.}
     * 
     */
    public static final String PROPERTY_MULTIPLIERAMOUNT = "multiplierAmount";

    /**
     * Property subtractQuantity stored in column QtySubtract in table C_CommissionLine<br>
     * Help: {@literal The Quantity Subtract identifies the quantity to be subtracted before multiplication}
     * 
     */
    public static final String PROPERTY_SUBTRACTQUANTITY = "subtractQuantity";

    /**
     * Property multiplierQuantity stored in column QtyMultiplier in table C_CommissionLine<br>
     * Help: {@literal The Multiplier Quantity field indicates the amount to multiply the quantities accumulated
     *       for this commission run.}
     * 
     */
    public static final String PROPERTY_MULTIPLIERQUANTITY = "multiplierQuantity";

    /**
     * Property positiveOnly stored in column IsPositiveOnly in table C_CommissionLine<br>
     * Help: {@literal The Positive Only check box indicates that if the result of the subtraction is negative,
     *       it is ignored.  This would mean that negative commissions would not be generated.}
     * 
     */
    public static final String PROPERTY_POSITIVEONLY = "positiveOnly";

    /**
     * Property commissionOnlySpecifiedOrders stored in column CommissionOrders in table C_CommissionLine<br>
     * Help: {@literal Sales Reps are entered in Orders and Invoices. If selected, only Orders and Invoices for
     *       this Sales Reps are included in the calculation of the commission.}
     * 
     */
    public static final String PROPERTY_COMMISSIONONLYSPECIFIEDORDERS = "commissionOnlySpecifiedOrders";

    /**
     * Property trxOrganization stored in column Org_ID in table C_CommissionLine<br>
     * Help: {@literal An organization is a unit of your client or legal entity - examples are store,
     *       department.}
     * 
     */
    public static final String PROPERTY_TRXORGANIZATION = "trxOrganization";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table C_CommissionLine<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property product stored in column M_Product_ID in table C_CommissionLine<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartnerCategory stored in column C_BP_Group_ID in table C_CommissionLine<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_CommissionLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property salesRegion stored in column C_SalesRegion_ID in table C_CommissionLine<br>
     * Help: {@literal The Sales Region indicates a specific area of sales coverage.}
     * 
     */
    public static final String PROPERTY_SALESREGION = "salesRegion";

    /**
     * Property exclude stored in column Exclude in table C_CommissionLine<br>
     * Help: {@literal If exclude is checked, the lines that satisfied the conditions specified in the current
     *       line will be excluded in commission calculation. The check box Cascade must be checked for being
     *       able to exclude lines.}
     * 
     */
    public static final String PROPERTY_EXCLUDE = "exclude";


    public CommissionLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_POSITIVEONLY, false);
        setDefaultValue(PROPERTY_COMMISSIONONLYSPECIFIEDORDERS, false);
        setDefaultValue(PROPERTY_EXCLUDE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CommissionLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CommissionLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CommissionLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CommissionLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CommissionLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CommissionLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CommissionLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CommissionLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CommissionLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CommissionLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CommissionLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CommissionLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CommissionLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CommissionLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CommissionLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CommissionLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CommissionLine#PROPERTY_COMMISSION
     * 
     */
    public Commission getCommission() {
        return (Commission) get(PROPERTY_COMMISSION);
    }
    /**
     * @see CommissionLine#PROPERTY_COMMISSION
     * 
     */
    public void setCommission(Commission commission) {
        set(PROPERTY_COMMISSION, commission);
    }

    /**
     * @see CommissionLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see CommissionLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see CommissionLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see CommissionLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see CommissionLine#PROPERTY_SUBTRACTAMOUNT
     * 
     */
    public BigDecimal getSubtractAmount() {
        return (BigDecimal) get(PROPERTY_SUBTRACTAMOUNT);
    }
    /**
     * @see CommissionLine#PROPERTY_SUBTRACTAMOUNT
     * 
     */
    public void setSubtractAmount(BigDecimal subtractAmount) {
        set(PROPERTY_SUBTRACTAMOUNT, subtractAmount);
    }

    /**
     * @see CommissionLine#PROPERTY_MULTIPLIERAMOUNT
     * 
     */
    public BigDecimal getMultiplierAmount() {
        return (BigDecimal) get(PROPERTY_MULTIPLIERAMOUNT);
    }
    /**
     * @see CommissionLine#PROPERTY_MULTIPLIERAMOUNT
     * 
     */
    public void setMultiplierAmount(BigDecimal multiplierAmount) {
        set(PROPERTY_MULTIPLIERAMOUNT, multiplierAmount);
    }

    /**
     * @see CommissionLine#PROPERTY_SUBTRACTQUANTITY
     * 
     */
    public BigDecimal getSubtractQuantity() {
        return (BigDecimal) get(PROPERTY_SUBTRACTQUANTITY);
    }
    /**
     * @see CommissionLine#PROPERTY_SUBTRACTQUANTITY
     * 
     */
    public void setSubtractQuantity(BigDecimal subtractQuantity) {
        set(PROPERTY_SUBTRACTQUANTITY, subtractQuantity);
    }

    /**
     * @see CommissionLine#PROPERTY_MULTIPLIERQUANTITY
     * 
     */
    public BigDecimal getMultiplierQuantity() {
        return (BigDecimal) get(PROPERTY_MULTIPLIERQUANTITY);
    }
    /**
     * @see CommissionLine#PROPERTY_MULTIPLIERQUANTITY
     * 
     */
    public void setMultiplierQuantity(BigDecimal multiplierQuantity) {
        set(PROPERTY_MULTIPLIERQUANTITY, multiplierQuantity);
    }

    /**
     * @see CommissionLine#PROPERTY_POSITIVEONLY
     * 
     */
    public Boolean isPositiveOnly() {
        return (Boolean) get(PROPERTY_POSITIVEONLY);
    }
    /**
     * @see CommissionLine#PROPERTY_POSITIVEONLY
     * 
     */
    public void setPositiveOnly(Boolean positiveOnly) {
        set(PROPERTY_POSITIVEONLY, positiveOnly);
    }

    /**
     * @see CommissionLine#PROPERTY_COMMISSIONONLYSPECIFIEDORDERS
     * 
     */
    public Boolean isCommissionOnlySpecifiedOrders() {
        return (Boolean) get(PROPERTY_COMMISSIONONLYSPECIFIEDORDERS);
    }
    /**
     * @see CommissionLine#PROPERTY_COMMISSIONONLYSPECIFIEDORDERS
     * 
     */
    public void setCommissionOnlySpecifiedOrders(Boolean commissionOnlySpecifiedOrders) {
        set(PROPERTY_COMMISSIONONLYSPECIFIEDORDERS, commissionOnlySpecifiedOrders);
    }

    /**
     * @see CommissionLine#PROPERTY_TRXORGANIZATION
     * 
     */
    public Organization getTrxOrganization() {
        return (Organization) get(PROPERTY_TRXORGANIZATION);
    }
    /**
     * @see CommissionLine#PROPERTY_TRXORGANIZATION
     * 
     */
    public void setTrxOrganization(Organization trxOrganization) {
        set(PROPERTY_TRXORGANIZATION, trxOrganization);
    }

    /**
     * @see CommissionLine#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see CommissionLine#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see CommissionLine#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see CommissionLine#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see CommissionLine#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see CommissionLine#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see CommissionLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see CommissionLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see CommissionLine#PROPERTY_SALESREGION
     * 
     */
    public SalesRegion getSalesRegion() {
        return (SalesRegion) get(PROPERTY_SALESREGION);
    }
    /**
     * @see CommissionLine#PROPERTY_SALESREGION
     * 
     */
    public void setSalesRegion(SalesRegion salesRegion) {
        set(PROPERTY_SALESREGION, salesRegion);
    }

    /**
     * @see CommissionLine#PROPERTY_EXCLUDE
     * 
     */
    public Boolean isExclude() {
        return (Boolean) get(PROPERTY_EXCLUDE);
    }
    /**
     * @see CommissionLine#PROPERTY_EXCLUDE
     * 
     */
    public void setExclude(Boolean exclude) {
        set(PROPERTY_EXCLUDE, exclude);
    }

}
