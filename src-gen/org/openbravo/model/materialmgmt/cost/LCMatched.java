
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
package org.openbravo.model.materialmgmt.cost;

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
import org.openbravo.model.common.invoice.InvoiceLine;
/**
 * Entity class for entity LandedCostMatched (stored in table M_LC_Matched).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class LCMatched extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_LC_Matched";
    public static final String ENTITY_NAME = "LandedCostMatched";

    /**
     * Property id stored in column M_Lc_Matched_ID in table M_LC_Matched 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_LC_Matched 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_LC_Matched 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_LC_Matched 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_LC_Matched 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_LC_Matched 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_LC_Matched 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_LC_Matched 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property landedCostCost stored in column M_Lc_Cost_ID in table M_LC_Matched<br>
     * Help: {@literal Each Landed Cost amount to be included in the Landed Cost document.}
     * 
     */
    public static final String PROPERTY_LANDEDCOSTCOST = "landedCostCost";

    /**
     * Property invoiceLine stored in column C_Invoiceline_ID in table M_LC_Matched<br>
     * Help: {@literal The Invoice Line uniquely identifies a single line of an Invoice.}
     * 
     */
    public static final String PROPERTY_INVOICELINE = "invoiceLine";

    /**
     * Property amount stored in column Amount in table M_LC_Matched 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property amountInInvoiceCurrency stored in column AMT_Invoice_Currency in table M_LC_Matched
     * 
     */
    public static final String PROPERTY_AMOUNTININVOICECURRENCY = "amountInInvoiceCurrency";

    /**
     * Property isconversionmatching stored in column Isconversionmatching in table M_LC_Matched
     * 
     */
    public static final String PROPERTY_ISCONVERSIONMATCHING = "isconversionmatching";


    public LCMatched() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ISCONVERSIONMATCHING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see LCMatched#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see LCMatched#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see LCMatched#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see LCMatched#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see LCMatched#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see LCMatched#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see LCMatched#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see LCMatched#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see LCMatched#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see LCMatched#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see LCMatched#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see LCMatched#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see LCMatched#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see LCMatched#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see LCMatched#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see LCMatched#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see LCMatched#PROPERTY_LANDEDCOSTCOST
     * 
     */
    public LandedCostCost getLandedCostCost() {
        return (LandedCostCost) get(PROPERTY_LANDEDCOSTCOST);
    }
    /**
     * @see LCMatched#PROPERTY_LANDEDCOSTCOST
     * 
     */
    public void setLandedCostCost(LandedCostCost landedCostCost) {
        set(PROPERTY_LANDEDCOSTCOST, landedCostCost);
    }

    /**
     * @see LCMatched#PROPERTY_INVOICELINE
     * 
     */
    public InvoiceLine getInvoiceLine() {
        return (InvoiceLine) get(PROPERTY_INVOICELINE);
    }
    /**
     * @see LCMatched#PROPERTY_INVOICELINE
     * 
     */
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        set(PROPERTY_INVOICELINE, invoiceLine);
    }

    /**
     * @see LCMatched#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see LCMatched#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see LCMatched#PROPERTY_AMOUNTININVOICECURRENCY
     * 
     */
    public BigDecimal getAmountInInvoiceCurrency() {
        return (BigDecimal) get(PROPERTY_AMOUNTININVOICECURRENCY);
    }
    /**
     * @see LCMatched#PROPERTY_AMOUNTININVOICECURRENCY
     * 
     */
    public void setAmountInInvoiceCurrency(BigDecimal amountInInvoiceCurrency) {
        set(PROPERTY_AMOUNTININVOICECURRENCY, amountInInvoiceCurrency);
    }

    /**
     * @see LCMatched#PROPERTY_ISCONVERSIONMATCHING
     * 
     */
    public Boolean isConversionmatching() {
        return (Boolean) get(PROPERTY_ISCONVERSIONMATCHING);
    }
    /**
     * @see LCMatched#PROPERTY_ISCONVERSIONMATCHING
     * 
     */
    public void setConversionmatching(Boolean isconversionmatching) {
        set(PROPERTY_ISCONVERSIONMATCHING, isconversionmatching);
    }

}
