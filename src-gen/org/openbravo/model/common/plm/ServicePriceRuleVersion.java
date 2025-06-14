
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.ServiceProduct;
import org.openbravo.model.ad.access.ServiceProductCategory;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.pricing.pricelist.ServicePriceRule;
/**
 * Entity class for entity ServicePriceRuleVersion (stored in table M_ServicePriceRule_Version).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ServicePriceRuleVersion extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_ServicePriceRule_Version";
    public static final String ENTITY_NAME = "ServicePriceRuleVersion";

    /**
     * Property id stored in column M_Servicepricerule_Version_ID in table M_ServicePriceRule_Version 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_ServicePriceRule_Version 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_ServicePriceRule_Version 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_ServicePriceRule_Version 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_ServicePriceRule_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_ServicePriceRule_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_ServicePriceRule_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_ServicePriceRule_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property servicePriceRule stored in column M_Servicepricerule_ID in table M_ServicePriceRule_Version
     * 
     */
    public static final String PROPERTY_SERVICEPRICERULE = "servicePriceRule";

    /**
     * Property product stored in column M_Product_ID in table M_ServicePriceRule_Version<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property validFromDate stored in column Validfrom in table M_ServicePriceRule_Version 
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property relatedProduct stored in column M_Relatedproduct_ID in table M_ServicePriceRule_Version
     * 
     */
    public static final String PROPERTY_RELATEDPRODUCT = "relatedProduct";

    /**
     * Property relatedProductCategory stored in column M_Relatedproductcategory_ID in table M_ServicePriceRule_Version
     * 
     */
    public static final String PROPERTY_RELATEDPRODUCTCATEGORY = "relatedProductCategory";


    public ServicePriceRuleVersion() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_SERVICEPRICERULE
     * 
     */
    public ServicePriceRule getServicePriceRule() {
        return (ServicePriceRule) get(PROPERTY_SERVICEPRICERULE);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_SERVICEPRICERULE
     * 
     */
    public void setServicePriceRule(ServicePriceRule servicePriceRule) {
        set(PROPERTY_SERVICEPRICERULE, servicePriceRule);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_RELATEDPRODUCT
     * 
     */
    public ServiceProduct getRelatedProduct() {
        return (ServiceProduct) get(PROPERTY_RELATEDPRODUCT);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_RELATEDPRODUCT
     * 
     */
    public void setRelatedProduct(ServiceProduct relatedProduct) {
        set(PROPERTY_RELATEDPRODUCT, relatedProduct);
    }

    /**
     * @see ServicePriceRuleVersion#PROPERTY_RELATEDPRODUCTCATEGORY
     * 
     */
    public ServiceProductCategory getRelatedProductCategory() {
        return (ServiceProductCategory) get(PROPERTY_RELATEDPRODUCTCATEGORY);
    }
    /**
     * @see ServicePriceRuleVersion#PROPERTY_RELATEDPRODUCTCATEGORY
     * 
     */
    public void setRelatedProductCategory(ServiceProductCategory relatedProductCategory) {
        set(PROPERTY_RELATEDPRODUCTCATEGORY, relatedProductCategory);
    }

}
