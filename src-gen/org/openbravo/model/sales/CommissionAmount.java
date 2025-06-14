
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
package org.openbravo.model.sales;

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
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity SalesCommissionAmount (stored in table C_CommissionAmt).
 * <br>
 * Help: {@literal Contains all the commission lines amounts}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CommissionAmount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_CommissionAmt";
    public static final String ENTITY_NAME = "SalesCommissionAmount";

    /**
     * Property id stored in column C_CommissionAmt_ID in table C_CommissionAmt<br>
     * Help: {@literal The Commission Amount indicates the resulting amount from a Commission Run.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_CommissionAmt 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_CommissionAmt 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_CommissionAmt 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_CommissionAmt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_CommissionAmt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_CommissionAmt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_CommissionAmt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property commissionRun stored in column C_CommissionRun_ID in table C_CommissionAmt<br>
     * Help: {@literal The Commission Run is a unique system defined identifier of a specific run of commission. 
     *       When a Commission is processed on the Commission Screen, the Commission Run ID will display.}
     * 
     */
    public static final String PROPERTY_COMMISSIONRUN = "commissionRun";

    /**
     * Property commissionLine stored in column C_CommissionLine_ID in table C_CommissionAmt<br>
     * Help: {@literal The Commission Line is a unique instance of a Commission Run.  If the commission run was
     *       done in summary mode then there will be a single line representing the selected documents totals. 
     *       If the commission run was done in detail mode then each document that was included in the run will
     *       have its own commission line.}
     * 
     */
    public static final String PROPERTY_COMMISSIONLINE = "commissionLine";

    /**
     * Property convertedAmount stored in column ConvertedAmt in table C_CommissionAmt<br>
     * Help: {@literal The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate
     *       for this target currency.}
     * 
     */
    public static final String PROPERTY_CONVERTEDAMOUNT = "convertedAmount";

    /**
     * Property actualQuantity stored in column ActualQty in table C_CommissionAmt<br>
     * Help: {@literal The Actual Quantity indicates the quantity as referenced on a document.}
     * 
     */
    public static final String PROPERTY_ACTUALQUANTITY = "actualQuantity";

    /**
     * Property amount stored in column CommissionAmt in table C_CommissionAmt<br>
     * Help: {@literal The Commission Amount is the total calculated commission.  It is based on the parameters
     *       as defined for this Commission Run.}
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property salesCommissionDetailList stored in table C_CommissionAmt
     * 
     */
    public static final String PROPERTY_SALESCOMMISSIONDETAILLIST = "salesCommissionDetailList";


    public CommissionAmount() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SALESCOMMISSIONDETAILLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CommissionAmount#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CommissionAmount#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CommissionAmount#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CommissionAmount#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CommissionAmount#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CommissionAmount#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CommissionAmount#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CommissionAmount#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CommissionAmount#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CommissionAmount#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CommissionAmount#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CommissionAmount#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CommissionAmount#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CommissionAmount#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CommissionAmount#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CommissionAmount#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CommissionAmount#PROPERTY_COMMISSIONRUN
     * 
     */
    public CommissionRun getCommissionRun() {
        return (CommissionRun) get(PROPERTY_COMMISSIONRUN);
    }
    /**
     * @see CommissionAmount#PROPERTY_COMMISSIONRUN
     * 
     */
    public void setCommissionRun(CommissionRun commissionRun) {
        set(PROPERTY_COMMISSIONRUN, commissionRun);
    }

    /**
     * @see CommissionAmount#PROPERTY_COMMISSIONLINE
     * 
     */
    public CommissionLine getCommissionLine() {
        return (CommissionLine) get(PROPERTY_COMMISSIONLINE);
    }
    /**
     * @see CommissionAmount#PROPERTY_COMMISSIONLINE
     * 
     */
    public void setCommissionLine(CommissionLine commissionLine) {
        set(PROPERTY_COMMISSIONLINE, commissionLine);
    }

    /**
     * @see CommissionAmount#PROPERTY_CONVERTEDAMOUNT
     * 
     */
    public BigDecimal getConvertedAmount() {
        return (BigDecimal) get(PROPERTY_CONVERTEDAMOUNT);
    }
    /**
     * @see CommissionAmount#PROPERTY_CONVERTEDAMOUNT
     * 
     */
    public void setConvertedAmount(BigDecimal convertedAmount) {
        set(PROPERTY_CONVERTEDAMOUNT, convertedAmount);
    }

    /**
     * @see CommissionAmount#PROPERTY_ACTUALQUANTITY
     * 
     */
    public BigDecimal getActualQuantity() {
        return (BigDecimal) get(PROPERTY_ACTUALQUANTITY);
    }
    /**
     * @see CommissionAmount#PROPERTY_ACTUALQUANTITY
     * 
     */
    public void setActualQuantity(BigDecimal actualQuantity) {
        set(PROPERTY_ACTUALQUANTITY, actualQuantity);
    }

    /**
     * @see CommissionAmount#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see CommissionAmount#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * Help: {@literal You may alter the amount and quantity of the detail records, but the suggested way is to
     *       add new correcting lines. The amounts are converted from the transaction currency to the Commission
     *       Currency (defined in the Commission window)}<br>
     * @see CommissionDetail
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CommissionDetail> getSalesCommissionDetailList() {
      return (List<CommissionDetail>) get(PROPERTY_SALESCOMMISSIONDETAILLIST);
    }

    /**
     * Help: {@literal You may alter the amount and quantity of the detail records, but the suggested way is to
     *       add new correcting lines. The amounts are converted from the transaction currency to the Commission
     *       Currency (defined in the Commission window)}<br>
     * @see CommissionDetail
     * 
     */
    public void setSalesCommissionDetailList(List<CommissionDetail> salesCommissionDetailList) {
        set(PROPERTY_SALESCOMMISSIONDETAILLIST, salesCommissionDetailList);
    }

}
