
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
/**
 * Entity class for entity ProductBOM (stored in table M_Product_BOM).
 * <br>
 * Help: {@literal The Bill of Materials defines those products that are generated from other products.  A
     *       Bill of Material (BOM) is one or more Products or BOMs.
     *       
     *       
     *       Available Quantity:
     *       
     *       - Stored BOMs have to
     *       be created via "Production"
     *       
     *       - The available quantity of a no}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductBOM extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_BOM";
    public static final String ENTITY_NAME = "ProductBOM";

    /**
     * Property id stored in column M_Product_BOM_ID in table M_Product_BOM 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_BOM 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_BOM 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Product_BOM 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_BOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Product_BOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_BOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Product_BOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property lineNo stored in column Line in table M_Product_BOM 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property product stored in column M_Product_ID in table M_Product_BOM<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property bOMProduct stored in column M_ProductBOM_ID in table M_Product_BOM<br>
     * Help: {@literal The BOM Product identifies an element that is part of this Bill of Materials.}
     * 
     */
    public static final String PROPERTY_BOMPRODUCT = "bOMProduct";

    /**
     * Property bOMQuantity stored in column BOMQty in table M_Product_BOM<br>
     * Help: {@literal The BOM Quantity indicates the quantity of the product in its Unit of Measure
     *       (multiplication)}
     * 
     */
    public static final String PROPERTY_BOMQUANTITY = "bOMQuantity";

    /**
     * Property description stored in column Description in table M_Product_BOM<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property bOMType stored in column BOMType in table M_Product_BOM<br>
     * Help: {@literal Type of Bill of Materials}
     * 
     */
    public static final String PROPERTY_BOMTYPE = "bOMType";

    /**
     * Property bomprice stored in column Bomprice in table M_Product_BOM<br>
     * Help: {@literal Bill of Materials weighted price}
     * 
     */
    public static final String PROPERTY_BOMPRICE = "bomprice";


    public ProductBOM() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_BOMQUANTITY, new BigDecimal(1));
        setDefaultValue(PROPERTY_BOMTYPE, "P");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductBOM#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductBOM#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductBOM#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductBOM#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductBOM#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductBOM#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductBOM#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductBOM#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductBOM#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductBOM#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductBOM#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductBOM#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductBOM#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductBOM#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductBOM#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductBOM#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductBOM#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see ProductBOM#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see ProductBOM#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ProductBOM#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ProductBOM#PROPERTY_BOMPRODUCT
     * 
     */
    public Product getBOMProduct() {
        return (Product) get(PROPERTY_BOMPRODUCT);
    }
    /**
     * @see ProductBOM#PROPERTY_BOMPRODUCT
     * 
     */
    public void setBOMProduct(Product bOMProduct) {
        set(PROPERTY_BOMPRODUCT, bOMProduct);
    }

    /**
     * @see ProductBOM#PROPERTY_BOMQUANTITY
     * 
     */
    public BigDecimal getBOMQuantity() {
        return (BigDecimal) get(PROPERTY_BOMQUANTITY);
    }
    /**
     * @see ProductBOM#PROPERTY_BOMQUANTITY
     * 
     */
    public void setBOMQuantity(BigDecimal bOMQuantity) {
        set(PROPERTY_BOMQUANTITY, bOMQuantity);
    }

    /**
     * @see ProductBOM#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProductBOM#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProductBOM#PROPERTY_BOMTYPE
     * 
     */
    public String getBOMType() {
        return (String) get(PROPERTY_BOMTYPE);
    }
    /**
     * @see ProductBOM#PROPERTY_BOMTYPE
     * 
     */
    public void setBOMType(String bOMType) {
        set(PROPERTY_BOMTYPE, bOMType);
    }

    /**
     * @see ProductBOM#PROPERTY_BOMPRICE
     * 
     */
    public BigDecimal getBomprice() {
        return (BigDecimal) get(PROPERTY_BOMPRICE);
    }
    /**
     * @see ProductBOM#PROPERTY_BOMPRICE
     * 
     */
    public void setBomprice(BigDecimal bomprice) {
        set(PROPERTY_BOMPRICE, bomprice);
    }

}
