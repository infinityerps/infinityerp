
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
package org.openbravo.model.pricing.priceadjustment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity PromotionType (stored in table M_Offer_Type).
 * <br>
 * Help: {@literal Types define how Discounts and Promotions  behave. Modules can add new types by providing
     *       implementation for them.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PromotionType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Offer_Type";
    public static final String ENTITY_NAME = "PromotionType";

    /**
     * Property id stored in column M_Offer_Type_ID in table M_Offer_Type<br>
     * Help: {@literal Discounts and Promotions functionality allows to apply different rules to order/invoice
     *       lines to adjust pricing. A type is each of these kinds of rules.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Offer_Type 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Offer_Type 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Offer_Type 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Offer_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Offer_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Offer_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Offer_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property module stored in column AD_Module_ID in table M_Offer_Type<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property commercialName stored in column Name in table M_Offer_Type 
     * 
     */
    public static final String PROPERTY_COMMERCIALNAME = "commercialName";

    /**
     * Property description stored in column Description in table M_Offer_Type<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property orderPLSQLImplementor stored in column PL_Order_Implementor in table M_Offer_Type<br>
     * Help: {@literal PL/SQL function that implements the logic for this kind of rule. This function will be
     *       invoked when applying the rule for an order or invoice line.}
     * 
     */
    public static final String PROPERTY_ORDERPLSQLIMPLEMENTOR = "orderPLSQLImplementor";

    /**
     * Property searchKey stored in column Value in table M_Offer_Type<br>
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
     * Property isdiscretionary stored in column Isdiscretionary in table M_Offer_Type
     * 
     */
    public static final String PROPERTY_ISDISCRETIONARY = "isdiscretionary";

    /**
     * Property pricingAdjustmentList stored in table M_Offer_Type
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTLIST = "pricingAdjustmentList";

    /**
     * Property promotionTypeTrlList stored in table M_Offer_Type
     * 
     */
    public static final String PROPERTY_PROMOTIONTYPETRLLIST = "promotionTypeTrlList";


    public PromotionType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISDISCRETIONARY, false);
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROMOTIONTYPETRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PromotionType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PromotionType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PromotionType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PromotionType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PromotionType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PromotionType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PromotionType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PromotionType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PromotionType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PromotionType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PromotionType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PromotionType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PromotionType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PromotionType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PromotionType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PromotionType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PromotionType#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see PromotionType#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see PromotionType#PROPERTY_COMMERCIALNAME
     * 
     */
    public String getCommercialName() {
        return (String) get(PROPERTY_COMMERCIALNAME);
    }
    /**
     * @see PromotionType#PROPERTY_COMMERCIALNAME
     * 
     */
    public void setCommercialName(String commercialName) {
        set(PROPERTY_COMMERCIALNAME, commercialName);
    }

    /**
     * @see PromotionType#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PromotionType#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PromotionType#PROPERTY_ORDERPLSQLIMPLEMENTOR
     * 
     */
    public String getOrderPLSQLImplementor() {
        return (String) get(PROPERTY_ORDERPLSQLIMPLEMENTOR);
    }
    /**
     * @see PromotionType#PROPERTY_ORDERPLSQLIMPLEMENTOR
     * 
     */
    public void setOrderPLSQLImplementor(String orderPLSQLImplementor) {
        set(PROPERTY_ORDERPLSQLIMPLEMENTOR, orderPLSQLImplementor);
    }

    /**
     * @see PromotionType#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see PromotionType#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see PromotionType#PROPERTY_ISDISCRETIONARY
     * 
     */
    public Boolean isDiscretionary() {
        return (Boolean) get(PROPERTY_ISDISCRETIONARY);
    }
    /**
     * @see PromotionType#PROPERTY_ISDISCRETIONARY
     * 
     */
    public void setDiscretionary(Boolean isdiscretionary) {
        set(PROPERTY_ISDISCRETIONARY, isdiscretionary);
    }

    /**
     * Help: {@literal Defines the Promotion/Discount main caracteristiques such as Discount Type, how it is
     *       filtered and actual discount information based on type.}<br>
     * @see PriceAdjustment
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PriceAdjustment> getPricingAdjustmentList() {
      return (List<PriceAdjustment>) get(PROPERTY_PRICINGADJUSTMENTLIST);
    }

    /**
     * Help: {@literal Defines the Promotion/Discount main caracteristiques such as Discount Type, how it is
     *       filtered and actual discount information based on type.}<br>
     * @see PriceAdjustment
     * 
     */
    public void setPricingAdjustmentList(List<PriceAdjustment> pricingAdjustmentList) {
        set(PROPERTY_PRICINGADJUSTMENTLIST, pricingAdjustmentList);
    }

    /**
     * @see PromotionTypeTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PromotionTypeTrl> getPromotionTypeTrlList() {
      return (List<PromotionTypeTrl>) get(PROPERTY_PROMOTIONTYPETRLLIST);
    }

    /**
     * @see PromotionTypeTrl
     * 
     */
    public void setPromotionTypeTrlList(List<PromotionTypeTrl> promotionTypeTrlList) {
        set(PROPERTY_PROMOTIONTYPETRLLIST, promotionTypeTrlList);
    }

}
