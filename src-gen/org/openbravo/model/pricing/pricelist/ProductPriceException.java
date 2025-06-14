
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
package org.openbravo.model.pricing.pricelist;

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
 * Entity class for entity PricingProductPriceException (stored in table M_ProductPrice_Exc).
 * <br>
 * Help: {@literal The product Price with Exceptions tab allows setting a different unit price for the
     *       selected product in a price list version. The new price can be established to be applicable for a
     *       date range and a specific organization. This new price will be used instead of the unit price coming
     *       from the price list version (product price tab) for the selected organization or any of its children
     *       when fulfilling the date criteria. If there are two exceptions valid for a given organization, that
     *       one with an organization closer to it in the tree structure will be the one chosen to be applied.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductPriceException extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_ProductPrice_Exc";
    public static final String ENTITY_NAME = "PricingProductPriceException";

    /**
     * Property id stored in column M_Productprice_Exc_ID in table M_ProductPrice_Exc 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property productPrice stored in column M_Productprice_ID in table M_ProductPrice_Exc
     * 
     */
    public static final String PROPERTY_PRODUCTPRICE = "productPrice";

    /**
     * Property client stored in column AD_Client_ID in table M_ProductPrice_Exc 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_ProductPrice_Exc 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_ProductPrice_Exc 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_ProductPrice_Exc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_ProductPrice_Exc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_ProductPrice_Exc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_ProductPrice_Exc 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property validFromDate stored in column Validfrom in table M_ProductPrice_Exc<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property validToDate stored in column Validto in table M_ProductPrice_Exc<br>
     * Help: {@literal The Valid To date indicates the last day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDTODATE = "validToDate";

    /**
     * Property standardPrice stored in column PriceStd in table M_ProductPrice_Exc<br>
     * Help: {@literal The Standard Price indicates the standard or normal price for a product on this price
     *       list. This price might be net or gross depending on its price list configuration.}
     * 
     */
    public static final String PROPERTY_STANDARDPRICE = "standardPrice";

    /**
     * Property orgdepth stored in column Orgdepth in table M_ProductPrice_Exc
     * 
     */
    public static final String PROPERTY_ORGDEPTH = "orgdepth";

    /**
     * Property listPrice stored in column Pricelist in table M_ProductPrice_Exc<br>
     * Help: {@literal The List Price is the official price stated by the selected pricelist and the currency of
     *       the document.}
     * 
     */
    public static final String PROPERTY_LISTPRICE = "listPrice";


    public ProductPriceException() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ORGDEPTH, (long) 0);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductPriceException#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductPriceException#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductPriceException#PROPERTY_PRODUCTPRICE
     * 
     */
    public ProductPrice getProductPrice() {
        return (ProductPrice) get(PROPERTY_PRODUCTPRICE);
    }
    /**
     * @see ProductPriceException#PROPERTY_PRODUCTPRICE
     * 
     */
    public void setProductPrice(ProductPrice productPrice) {
        set(PROPERTY_PRODUCTPRICE, productPrice);
    }

    /**
     * @see ProductPriceException#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductPriceException#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductPriceException#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductPriceException#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductPriceException#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductPriceException#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductPriceException#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductPriceException#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductPriceException#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductPriceException#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductPriceException#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductPriceException#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductPriceException#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductPriceException#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductPriceException#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see ProductPriceException#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see ProductPriceException#PROPERTY_VALIDTODATE
     * 
     */
    public Date getValidToDate() {
        return (Date) get(PROPERTY_VALIDTODATE);
    }
    /**
     * @see ProductPriceException#PROPERTY_VALIDTODATE
     * 
     */
    public void setValidToDate(Date validToDate) {
        set(PROPERTY_VALIDTODATE, validToDate);
    }

    /**
     * @see ProductPriceException#PROPERTY_STANDARDPRICE
     * 
     */
    public BigDecimal getStandardPrice() {
        return (BigDecimal) get(PROPERTY_STANDARDPRICE);
    }
    /**
     * @see ProductPriceException#PROPERTY_STANDARDPRICE
     * 
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        set(PROPERTY_STANDARDPRICE, standardPrice);
    }

    /**
     * @see ProductPriceException#PROPERTY_ORGDEPTH
     * 
     */
    public Long getOrgdepth() {
        return (Long) get(PROPERTY_ORGDEPTH);
    }
    /**
     * @see ProductPriceException#PROPERTY_ORGDEPTH
     * 
     */
    public void setOrgdepth(Long orgdepth) {
        set(PROPERTY_ORGDEPTH, orgdepth);
    }

    /**
     * @see ProductPriceException#PROPERTY_LISTPRICE
     * 
     */
    public BigDecimal getListPrice() {
        return (BigDecimal) get(PROPERTY_LISTPRICE);
    }
    /**
     * @see ProductPriceException#PROPERTY_LISTPRICE
     * 
     */
    public void setListPrice(BigDecimal listPrice) {
        set(PROPERTY_LISTPRICE, listPrice);
    }

}
