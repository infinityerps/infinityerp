
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
 * Entity class for entity ServicePriceRuleRange (stored in table M_ServicePriceRule_Range).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ServicePriceRuleRange extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_ServicePriceRule_Range";
    public static final String ENTITY_NAME = "ServicePriceRuleRange";

    /**
     * Property id stored in column M_Servicepricerule_Range_ID in table M_ServicePriceRule_Range 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_ServicePriceRule_Range 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_ServicePriceRule_Range 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_ServicePriceRule_Range 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_ServicePriceRule_Range 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_ServicePriceRule_Range 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_ServicePriceRule_Range 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_ServicePriceRule_Range 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property servicepricerule stored in column M_Servicepricerule_ID in table M_ServicePriceRule_Range
     * 
     */
    public static final String PROPERTY_SERVICEPRICERULE = "servicepricerule";

    /**
     * Property priceList stored in column M_Pricelist_ID in table M_ServicePriceRule_Range<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property amountUpTo stored in column Amountupto in table M_ServicePriceRule_Range
     * 
     */
    public static final String PROPERTY_AMOUNTUPTO = "amountUpTo";

    /**
     * Property ruleType stored in column Ruletype in table M_ServicePriceRule_Range
     * 
     */
    public static final String PROPERTY_RULETYPE = "ruleType";

    /**
     * Property percentage stored in column Percentage in table M_ServicePriceRule_Range
     * 
     */
    public static final String PROPERTY_PERCENTAGE = "percentage";

    /**
     * Property afterDiscounts stored in column Afterdiscounts in table M_ServicePriceRule_Range
     * 
     */
    public static final String PROPERTY_AFTERDISCOUNTS = "afterDiscounts";


    public ServicePriceRuleRange() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RULETYPE, "P");
        setDefaultValue(PROPERTY_PERCENTAGE, (long) 0);
        setDefaultValue(PROPERTY_AFTERDISCOUNTS, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_SERVICEPRICERULE
     * 
     */
    public ServicePriceRule getServicepricerule() {
        return (ServicePriceRule) get(PROPERTY_SERVICEPRICERULE);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_SERVICEPRICERULE
     * 
     */
    public void setServicepricerule(ServicePriceRule servicepricerule) {
        set(PROPERTY_SERVICEPRICERULE, servicepricerule);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_AMOUNTUPTO
     * 
     */
    public BigDecimal getAmountUpTo() {
        return (BigDecimal) get(PROPERTY_AMOUNTUPTO);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_AMOUNTUPTO
     * 
     */
    public void setAmountUpTo(BigDecimal amountUpTo) {
        set(PROPERTY_AMOUNTUPTO, amountUpTo);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_RULETYPE
     * 
     */
    public String getRuleType() {
        return (String) get(PROPERTY_RULETYPE);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_RULETYPE
     * 
     */
    public void setRuleType(String ruleType) {
        set(PROPERTY_RULETYPE, ruleType);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_PERCENTAGE
     * 
     */
    public Long getPercentage() {
        return (Long) get(PROPERTY_PERCENTAGE);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_PERCENTAGE
     * 
     */
    public void setPercentage(Long percentage) {
        set(PROPERTY_PERCENTAGE, percentage);
    }

    /**
     * @see ServicePriceRuleRange#PROPERTY_AFTERDISCOUNTS
     * 
     */
    public Boolean isAfterDiscounts() {
        return (Boolean) get(PROPERTY_AFTERDISCOUNTS);
    }
    /**
     * @see ServicePriceRuleRange#PROPERTY_AFTERDISCOUNTS
     * 
     */
    public void setAfterDiscounts(Boolean afterDiscounts) {
        set(PROPERTY_AFTERDISCOUNTS, afterDiscounts);
    }

}
