
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
package org.openbravo.model.pos;

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
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.model.shipping.ShippingCompany;
/**
 * Entity class for entity ExternalPOS (stored in table C_ExternalPOS).
 * <br>
 * Help: {@literal External Point of Sales}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExternalPOS extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ExternalPOS";
    public static final String ENTITY_NAME = "ExternalPOS";

    /**
     * Property id stored in column C_Externalpos_ID in table C_ExternalPOS<br>
     * Help: {@literal External Point of Sales}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ExternalPOS 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ExternalPOS 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_ExternalPOS 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ExternalPOS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_ExternalPOS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ExternalPOS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_ExternalPOS 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table C_ExternalPOS 
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table C_ExternalPOS 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_ExternalPOS<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table C_ExternalPOS<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property documentType stored in column C_DocType_ID in table C_ExternalPOS<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_ExternalPOS<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property priceList stored in column M_PriceList_ID in table C_ExternalPOS<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table C_ExternalPOS<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property shippingCompany stored in column M_Shipper_ID in table C_ExternalPOS<br>
     * Help: {@literal The Shipper is any entity which will provide shipping to or shipping from an
     *       Organization.}
     * 
     */
    public static final String PROPERTY_SHIPPINGCOMPANY = "shippingCompany";

    /**
     * Property includedProduct stored in column Include_Product in table C_ExternalPOS<br>
     * Help: {@literal If it is checked the selected products will be included else they will be excluded.}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCT = "includedProduct";

    /**
     * Property includedProductCategories stored in column Include_Product_Category in table C_ExternalPOS<br>
     * Help: {@literal If it is checked the selected categories will be included else they will be excluded.}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCTCATEGORIES = "includedProductCategories";

    /**
     * Property performPost stored in column Perform_Post in table C_ExternalPOS
     * 
     */
    public static final String PROPERTY_PERFORMPOST = "performPost";

    /**
     * Property externalPOSCategoryList stored in table C_ExternalPOS
     * 
     */
    public static final String PROPERTY_EXTERNALPOSCATEGORYLIST = "externalPOSCategoryList";

    /**
     * Property externalPOSProductList stored in table C_ExternalPOS
     * 
     */
    public static final String PROPERTY_EXTERNALPOSPRODUCTLIST = "externalPOSProductList";


    public ExternalPOS() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_INCLUDEDPRODUCT, "Y");
        setDefaultValue(PROPERTY_INCLUDEDPRODUCTCATEGORIES, "Y");
        setDefaultValue(PROPERTY_PERFORMPOST, false);
        setDefaultValue(PROPERTY_EXTERNALPOSCATEGORYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EXTERNALPOSPRODUCTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExternalPOS#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExternalPOS#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExternalPOS#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExternalPOS#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExternalPOS#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExternalPOS#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExternalPOS#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExternalPOS#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ExternalPOS#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExternalPOS#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExternalPOS#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExternalPOS#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExternalPOS#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExternalPOS#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExternalPOS#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExternalPOS#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExternalPOS#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ExternalPOS#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ExternalPOS#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ExternalPOS#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ExternalPOS#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ExternalPOS#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ExternalPOS#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see ExternalPOS#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see ExternalPOS#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see ExternalPOS#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see ExternalPOS#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ExternalPOS#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ExternalPOS#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see ExternalPOS#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see ExternalPOS#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see ExternalPOS#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see ExternalPOS#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public ShippingCompany getShippingCompany() {
        return (ShippingCompany) get(PROPERTY_SHIPPINGCOMPANY);
    }
    /**
     * @see ExternalPOS#PROPERTY_SHIPPINGCOMPANY
     * 
     */
    public void setShippingCompany(ShippingCompany shippingCompany) {
        set(PROPERTY_SHIPPINGCOMPANY, shippingCompany);
    }

    /**
     * @see ExternalPOS#PROPERTY_INCLUDEDPRODUCT
     * 
     */
    public String getIncludedProduct() {
        return (String) get(PROPERTY_INCLUDEDPRODUCT);
    }
    /**
     * @see ExternalPOS#PROPERTY_INCLUDEDPRODUCT
     * 
     */
    public void setIncludedProduct(String includedProduct) {
        set(PROPERTY_INCLUDEDPRODUCT, includedProduct);
    }

    /**
     * @see ExternalPOS#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public String getIncludedProductCategories() {
        return (String) get(PROPERTY_INCLUDEDPRODUCTCATEGORIES);
    }
    /**
     * @see ExternalPOS#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public void setIncludedProductCategories(String includedProductCategories) {
        set(PROPERTY_INCLUDEDPRODUCTCATEGORIES, includedProductCategories);
    }

    /**
     * @see ExternalPOS#PROPERTY_PERFORMPOST
     * 
     */
    public Boolean isPerformPost() {
        return (Boolean) get(PROPERTY_PERFORMPOST);
    }
    /**
     * @see ExternalPOS#PROPERTY_PERFORMPOST
     * 
     */
    public void setPerformPost(Boolean performPost) {
        set(PROPERTY_PERFORMPOST, performPost);
    }

    /**
     * Help: {@literal Product Categories}<br>
     * @see ExternalPOSCategory
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ExternalPOSCategory> getExternalPOSCategoryList() {
      return (List<ExternalPOSCategory>) get(PROPERTY_EXTERNALPOSCATEGORYLIST);
    }

    /**
     * Help: {@literal Product Categories}<br>
     * @see ExternalPOSCategory
     * 
     */
    public void setExternalPOSCategoryList(List<ExternalPOSCategory> externalPOSCategoryList) {
        set(PROPERTY_EXTERNALPOSCATEGORYLIST, externalPOSCategoryList);
    }

    /**
     * Help: {@literal Products}<br>
     * @see ExternalPOSProduct
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ExternalPOSProduct> getExternalPOSProductList() {
      return (List<ExternalPOSProduct>) get(PROPERTY_EXTERNALPOSPRODUCTLIST);
    }

    /**
     * Help: {@literal Products}<br>
     * @see ExternalPOSProduct
     * 
     */
    public void setExternalPOSProductList(List<ExternalPOSProduct> externalPOSProductList) {
        set(PROPERTY_EXTERNALPOSPRODUCTLIST, externalPOSProductList);
    }

}
