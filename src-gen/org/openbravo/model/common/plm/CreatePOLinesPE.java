
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
import org.openbravo.model.pricing.pricelist.PriceList;
/**
 * Entity class for entity CreatePOLinesPE (stored in table M_CreatePOLines_PE_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CreatePOLinesPE extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_CreatePOLines_PE_V";
    public static final String ENTITY_NAME = "CreatePOLinesPE";

    /**
     * Property id stored in column M_Createpolines_Pe_V_ID in table M_CreatePOLines_PE_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_CreatePOLines_PE_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_CreatePOLines_PE_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_CreatePOLines_PE_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_CreatePOLines_PE_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_CreatePOLines_PE_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_CreatePOLines_PE_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_CreatePOLines_PE_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property obSelected stored in column OB_Selected in table M_CreatePOLines_PE_V
     * 
     */
    public static final String PROPERTY_OBSELECTED = "obSelected";

    /**
     * Property product stored in column M_Product_ID in table M_CreatePOLines_PE_V<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property priceList stored in column M_Pricelist_ID in table M_CreatePOLines_PE_V<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property standardPrice stored in column Pricestd in table M_CreatePOLines_PE_V<br>
     * Help: {@literal The Standard Price indicates the standard or normal price for a product on this price
     *       list}
     * 
     */
    public static final String PROPERTY_STANDARDPRICE = "standardPrice";

    /**
     * Property orderedQuantity stored in column Qtyordered in table M_CreatePOLines_PE_V<br>
     * Help: {@literal The Ordered Quantity indicates the quantity of a product that was ordered.}
     * 
     */
    public static final String PROPERTY_ORDEREDQUANTITY = "orderedQuantity";

    /**
     * Property aum stored in column Aum in table M_CreatePOLines_PE_V
     * 
     */
    public static final String PROPERTY_AUM = "aum";

    /**
     * Property aumQuantity stored in column QtyAum in table M_CreatePOLines_PE_V<br>
     * Help: {@literal The number of a certain item involved in the transaction, according to the defined
     *       Operative UOM.}
     * 
     */
    public static final String PROPERTY_AUMQUANTITY = "aumQuantity";


    public CreatePOLinesPE() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OBSELECTED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_OBSELECTED
     * 
     */
    public Boolean isObSelected() {
        return (Boolean) get(PROPERTY_OBSELECTED);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_OBSELECTED
     * 
     */
    public void setObSelected(Boolean obSelected) {
        set(PROPERTY_OBSELECTED, obSelected);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_STANDARDPRICE
     * 
     */
    public BigDecimal getStandardPrice() {
        return (BigDecimal) get(PROPERTY_STANDARDPRICE);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_STANDARDPRICE
     * 
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        set(PROPERTY_STANDARDPRICE, standardPrice);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public BigDecimal getOrderedQuantity() {
        return (BigDecimal) get(PROPERTY_ORDEREDQUANTITY);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_ORDEREDQUANTITY
     * 
     */
    public void setOrderedQuantity(BigDecimal orderedQuantity) {
        set(PROPERTY_ORDEREDQUANTITY, orderedQuantity);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_AUM
     * 
     */
    public UOM getAum() {
        return (UOM) get(PROPERTY_AUM);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_AUM
     * 
     */
    public void setAum(UOM aum) {
        set(PROPERTY_AUM, aum);
    }

    /**
     * @see CreatePOLinesPE#PROPERTY_AUMQUANTITY
     * 
     */
    public BigDecimal getAumQuantity() {
        return (BigDecimal) get(PROPERTY_AUMQUANTITY);
    }
    /**
     * @see CreatePOLinesPE#PROPERTY_AUMQUANTITY
     * 
     */
    public void setAumQuantity(BigDecimal aumQuantity) {
        set(PROPERTY_AUMQUANTITY, aumQuantity);
    }

}
