
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.uom.UOM;
/**
 * Entity class for entity ProductAUM (stored in table M_Product_AUM).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductAUM extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_AUM";
    public static final String ENTITY_NAME = "ProductAUM";

    /**
     * Property id stored in column M_Product_Aum_ID in table M_Product_AUM 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_AUM 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_AUM 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Product_AUM 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property updated stored in column Updated in table M_Product_AUM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Product_AUM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property creationDate stored in column Created in table M_Product_AUM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Product_AUM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property product stored in column M_Product_ID in table M_Product_AUM<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property uOM stored in column C_Uom_ID in table M_Product_AUM<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property conversionRate stored in column Conversionrate in table M_Product_AUM<br>
     * Help: {@literal Defines how many final products each run of a process plan produces. See the following
     *       formula to understand the relation between the three elements:
     *       
     *       Process Quantity = Quantity  x 
     *       Conversion Rate}
     * 
     */
    public static final String PROPERTY_CONVERSIONRATE = "conversionRate";

    /**
     * Property gtin stored in column Gtin in table M_Product_AUM<br>
     * Help: {@literal GTIN describes a family of GS1 (EAN.UCC) global data structures that employ 14 digits and
     *       can be encoded into various types of data carriers.}
     * 
     */
    public static final String PROPERTY_GTIN = "gtin";

    /**
     * Property sales stored in column Sales in table M_Product_AUM<br>
     * Help: {@literal It represents the priority of this AUM to the Sales flows}
     * 
     */
    public static final String PROPERTY_SALES = "sales";

    /**
     * Property purchase stored in column Purchase in table M_Product_AUM<br>
     * Help: {@literal It represents the priority of this AUM to the Purchases flows}
     * 
     */
    public static final String PROPERTY_PURCHASE = "purchase";

    /**
     * Property logistics stored in column Logistics in table M_Product_AUM<br>
     * Help: {@literal It represents the priority of this AUM to the Logistics flows}
     * 
     */
    public static final String PROPERTY_LOGISTICS = "logistics";


    public ProductAUM() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SALES, "S");
        setDefaultValue(PROPERTY_PURCHASE, "S");
        setDefaultValue(PROPERTY_LOGISTICS, "S");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductAUM#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductAUM#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductAUM#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductAUM#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductAUM#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductAUM#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductAUM#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductAUM#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductAUM#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductAUM#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductAUM#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductAUM#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductAUM#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductAUM#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductAUM#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductAUM#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductAUM#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductAUM#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductAUM#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see ProductAUM#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see ProductAUM#PROPERTY_CONVERSIONRATE
     * 
     */
    public BigDecimal getConversionRate() {
        return (BigDecimal) get(PROPERTY_CONVERSIONRATE);
    }
    /**
     * @see ProductAUM#PROPERTY_CONVERSIONRATE
     * 
     */
    public void setConversionRate(BigDecimal conversionRate) {
        set(PROPERTY_CONVERSIONRATE, conversionRate);
    }

    /**
     * @see ProductAUM#PROPERTY_GTIN
     * 
     */
    public String getGtin() {
        return (String) get(PROPERTY_GTIN);
    }
    /**
     * @see ProductAUM#PROPERTY_GTIN
     * 
     */
    public void setGtin(String gtin) {
        set(PROPERTY_GTIN, gtin);
    }

    /**
     * @see ProductAUM#PROPERTY_SALES
     * 
     */
    public String getSales() {
        return (String) get(PROPERTY_SALES);
    }
    /**
     * @see ProductAUM#PROPERTY_SALES
     * 
     */
    public void setSales(String sales) {
        set(PROPERTY_SALES, sales);
    }

    /**
     * @see ProductAUM#PROPERTY_PURCHASE
     * 
     */
    public String getPurchase() {
        return (String) get(PROPERTY_PURCHASE);
    }
    /**
     * @see ProductAUM#PROPERTY_PURCHASE
     * 
     */
    public void setPurchase(String purchase) {
        set(PROPERTY_PURCHASE, purchase);
    }

    /**
     * @see ProductAUM#PROPERTY_LOGISTICS
     * 
     */
    public String getLogistics() {
        return (String) get(PROPERTY_LOGISTICS);
    }
    /**
     * @see ProductAUM#PROPERTY_LOGISTICS
     * 
     */
    public void setLogistics(String logistics) {
        set(PROPERTY_LOGISTICS, logistics);
    }

}
