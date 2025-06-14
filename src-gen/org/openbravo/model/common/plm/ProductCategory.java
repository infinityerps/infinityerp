
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
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.assetmgmt.AssetGroup;
/**
 * Entity class for entity ProductCategory (stored in table M_Product_Category).
 * <br>
 * Help: {@literal The Product Category defines unique groupings of products.  Product categories can be used
     *       in building price lists.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductCategory extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Category";
    public static final String ENTITY_NAME = "ProductCategory";

    /**
     * Property id stored in column M_Product_Category_ID in table M_Product_Category<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_Category 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_Category 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Product_Category 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_Category 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Product_Category 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_Category 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Product_Category 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table M_Product_Category<br>
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
     * Property name stored in column Name in table M_Product_Category 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Product_Category<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property default stored in column IsDefault in table M_Product_Category<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property plannedMargin stored in column PlannedMargin in table M_Product_Category<br>
     * Help: {@literal The Planned Margin Percentage indicates the anticipated margin percentage for this project
     *       or project line}
     * 
     */
    public static final String PROPERTY_PLANNEDMARGIN = "plannedMargin";

    /**
     * Property assetCategory stored in column A_Asset_Group_ID in table M_Product_Category<br>
     * Help: {@literal The group of assets determines default accounts.  If an asset group is selected in the
     *       product category, assets are created when delivering the asset.}
     * 
     */
    public static final String PROPERTY_ASSETCATEGORY = "assetCategory";

    /**
     * Property image stored in column AD_Image_ID in table M_Product_Category<br>
     * Help: {@literal Defines a system image}
     * 
     */
    public static final String PROPERTY_IMAGE = "image";

    /**
     * Property summaryLevel stored in column Issummary in table M_Product_Category<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property productList stored in table M_Product_Category
     * 
     */
    public static final String PROPERTY_PRODUCTLIST = "productList";

    /**
     * Property productCategoryAccountsList stored in table M_Product_Category
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORYACCOUNTSLIST = "productCategoryAccountsList";

    /**
     * Property productCategoryTrlList stored in table M_Product_Category
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORYTRLLIST = "productCategoryTrlList";


    public ProductCategory() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_PRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTCATEGORYACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTCATEGORYTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductCategory#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductCategory#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductCategory#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductCategory#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductCategory#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductCategory#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductCategory#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductCategory#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductCategory#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductCategory#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductCategory#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductCategory#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductCategory#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductCategory#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductCategory#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductCategory#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductCategory#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ProductCategory#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ProductCategory#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProductCategory#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProductCategory#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProductCategory#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProductCategory#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see ProductCategory#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see ProductCategory#PROPERTY_PLANNEDMARGIN
     * 
     */
    public BigDecimal getPlannedMargin() {
        return (BigDecimal) get(PROPERTY_PLANNEDMARGIN);
    }
    /**
     * @see ProductCategory#PROPERTY_PLANNEDMARGIN
     * 
     */
    public void setPlannedMargin(BigDecimal plannedMargin) {
        set(PROPERTY_PLANNEDMARGIN, plannedMargin);
    }

    /**
     * @see ProductCategory#PROPERTY_ASSETCATEGORY
     * 
     */
    public AssetGroup getAssetCategory() {
        return (AssetGroup) get(PROPERTY_ASSETCATEGORY);
    }
    /**
     * @see ProductCategory#PROPERTY_ASSETCATEGORY
     * 
     */
    public void setAssetCategory(AssetGroup assetCategory) {
        set(PROPERTY_ASSETCATEGORY, assetCategory);
    }

    /**
     * @see ProductCategory#PROPERTY_IMAGE
     * 
     */
    public Image getImage() {
        return (Image) get(PROPERTY_IMAGE);
    }
    /**
     * @see ProductCategory#PROPERTY_IMAGE
     * 
     */
    public void setImage(Image image) {
        set(PROPERTY_IMAGE, image);
    }

    /**
     * @see ProductCategory#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see ProductCategory#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Product> getProductList() {
      return (List<Product>) get(PROPERTY_PRODUCTLIST);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    public void setProductList(List<Product> productList) {
        set(PROPERTY_PRODUCTLIST, productList);
    }

    /**
     * Help: {@literal Defines default accounting parameters.  Any product that uses a product category can
     *       inherit its default accounting parameters.}<br>
     * @see CategoryAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CategoryAccounts> getProductCategoryAccountsList() {
      return (List<CategoryAccounts>) get(PROPERTY_PRODUCTCATEGORYACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines default accounting parameters.  Any product that uses a product category can
     *       inherit its default accounting parameters.}<br>
     * @see CategoryAccounts
     * 
     */
    public void setProductCategoryAccountsList(List<CategoryAccounts> productCategoryAccountsList) {
        set(PROPERTY_PRODUCTCATEGORYACCOUNTSLIST, productCategoryAccountsList);
    }

    /**
     * Help: {@literal The translation defines the product category name and description for different languages}<br>
     * @see ProductCategoryTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCategoryTrl> getProductCategoryTrlList() {
      return (List<ProductCategoryTrl>) get(PROPERTY_PRODUCTCATEGORYTRLLIST);
    }

    /**
     * Help: {@literal The translation defines the product category name and description for different languages}<br>
     * @see ProductCategoryTrl
     * 
     */
    public void setProductCategoryTrlList(List<ProductCategoryTrl> productCategoryTrlList) {
        set(PROPERTY_PRODUCTCATEGORYTRLLIST, productCategoryTrlList);
    }

}
