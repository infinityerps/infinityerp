
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
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.common.order.OrderLine;
/**
 * Entity class for entity SalesCommissionDetail (stored in table C_CommissionDetail).
 * <br>
 * Help: {@literal You may alter the amount and quantity of the detail records, but the suggested way is to
     *       add new correcting lines. The amounts are converted from the transaction currency to the Commission
     *       Currency (defined in the Commission window)}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CommissionDetail extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_CommissionDetail";
    public static final String ENTITY_NAME = "SalesCommissionDetail";

    /**
     * Property id stored in column C_CommissionDetail_ID in table C_CommissionDetail 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_CommissionDetail 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_CommissionDetail 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_CommissionDetail 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_CommissionDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_CommissionDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_CommissionDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_CommissionDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property commissionAmount stored in column C_CommissionAmt_ID in table C_CommissionDetail<br>
     * Help: {@literal The Commission Amount indicates the resulting amount from a Commission Run.}
     * 
     */
    public static final String PROPERTY_COMMISSIONAMOUNT = "commissionAmount";

    /**
     * Property reference stored in column Reference in table C_CommissionDetail 
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property salesOrderLine stored in column C_OrderLine_ID in table C_CommissionDetail<br>
     * Help: {@literal A unique identifier and a reference to a sales order line (product).}
     * 
     */
    public static final String PROPERTY_SALESORDERLINE = "salesOrderLine";

    /**
     * Property invoiceLine stored in column C_InvoiceLine_ID in table C_CommissionDetail<br>
     * Help: {@literal The Invoice Line uniquely identifies a single line of an Invoice.}
     * 
     */
    public static final String PROPERTY_INVOICELINE = "invoiceLine";

    /**
     * Property comments stored in column Info in table C_CommissionDetail<br>
     * Help: {@literal The Information displays data from the source document line.}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property currency stored in column C_Currency_ID in table C_CommissionDetail<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property actualAmount stored in column ActualAmt in table C_CommissionDetail<br>
     * Help: {@literal Actual amount indicates the agreed upon amount for a document.}
     * 
     */
    public static final String PROPERTY_ACTUALAMOUNT = "actualAmount";

    /**
     * Property convertedAmount stored in column ConvertedAmt in table C_CommissionDetail<br>
     * Help: {@literal The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate
     *       for this target currency.}
     * 
     */
    public static final String PROPERTY_CONVERTEDAMOUNT = "convertedAmount";

    /**
     * Property actualQuantity stored in column ActualQty in table C_CommissionDetail<br>
     * Help: {@literal The Actual Quantity indicates the quantity as referenced on a document.}
     * 
     */
    public static final String PROPERTY_ACTUALQUANTITY = "actualQuantity";

    /**
     * Property isCostCalculated stored in column Iscostcalculated in table C_CommissionDetail<br>
     * Help: {@literal Determines that the cost amount has been calculated}
     * 
     */
    public static final String PROPERTY_ISCOSTCALCULATED = "isCostCalculated";


    public CommissionDetail() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISCOSTCALCULATED, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CommissionDetail#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CommissionDetail#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CommissionDetail#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CommissionDetail#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CommissionDetail#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CommissionDetail#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CommissionDetail#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CommissionDetail#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CommissionDetail#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CommissionDetail#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CommissionDetail#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CommissionDetail#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CommissionDetail#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CommissionDetail#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CommissionDetail#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CommissionDetail#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CommissionDetail#PROPERTY_COMMISSIONAMOUNT
     * 
     */
    public CommissionAmount getCommissionAmount() {
        return (CommissionAmount) get(PROPERTY_COMMISSIONAMOUNT);
    }
    /**
     * @see CommissionDetail#PROPERTY_COMMISSIONAMOUNT
     * 
     */
    public void setCommissionAmount(CommissionAmount commissionAmount) {
        set(PROPERTY_COMMISSIONAMOUNT, commissionAmount);
    }

    /**
     * @see CommissionDetail#PROPERTY_REFERENCE
     * 
     */
    public String getReference() {
        return (String) get(PROPERTY_REFERENCE);
    }
    /**
     * @see CommissionDetail#PROPERTY_REFERENCE
     * 
     */
    public void setReference(String reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see CommissionDetail#PROPERTY_SALESORDERLINE
     * 
     */
    public OrderLine getSalesOrderLine() {
        return (OrderLine) get(PROPERTY_SALESORDERLINE);
    }
    /**
     * @see CommissionDetail#PROPERTY_SALESORDERLINE
     * 
     */
    public void setSalesOrderLine(OrderLine salesOrderLine) {
        set(PROPERTY_SALESORDERLINE, salesOrderLine);
    }

    /**
     * @see CommissionDetail#PROPERTY_INVOICELINE
     * 
     */
    public InvoiceLine getInvoiceLine() {
        return (InvoiceLine) get(PROPERTY_INVOICELINE);
    }
    /**
     * @see CommissionDetail#PROPERTY_INVOICELINE
     * 
     */
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        set(PROPERTY_INVOICELINE, invoiceLine);
    }

    /**
     * @see CommissionDetail#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see CommissionDetail#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see CommissionDetail#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see CommissionDetail#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see CommissionDetail#PROPERTY_ACTUALAMOUNT
     * 
     */
    public BigDecimal getActualAmount() {
        return (BigDecimal) get(PROPERTY_ACTUALAMOUNT);
    }
    /**
     * @see CommissionDetail#PROPERTY_ACTUALAMOUNT
     * 
     */
    public void setActualAmount(BigDecimal actualAmount) {
        set(PROPERTY_ACTUALAMOUNT, actualAmount);
    }

    /**
     * @see CommissionDetail#PROPERTY_CONVERTEDAMOUNT
     * 
     */
    public BigDecimal getConvertedAmount() {
        return (BigDecimal) get(PROPERTY_CONVERTEDAMOUNT);
    }
    /**
     * @see CommissionDetail#PROPERTY_CONVERTEDAMOUNT
     * 
     */
    public void setConvertedAmount(BigDecimal convertedAmount) {
        set(PROPERTY_CONVERTEDAMOUNT, convertedAmount);
    }

    /**
     * @see CommissionDetail#PROPERTY_ACTUALQUANTITY
     * 
     */
    public BigDecimal getActualQuantity() {
        return (BigDecimal) get(PROPERTY_ACTUALQUANTITY);
    }
    /**
     * @see CommissionDetail#PROPERTY_ACTUALQUANTITY
     * 
     */
    public void setActualQuantity(BigDecimal actualQuantity) {
        set(PROPERTY_ACTUALQUANTITY, actualQuantity);
    }

    /**
     * @see CommissionDetail#PROPERTY_ISCOSTCALCULATED
     * 
     */
    public Boolean isCostCalculated() {
        return (Boolean) get(PROPERTY_ISCOSTCALCULATED);
    }
    /**
     * @see CommissionDetail#PROPERTY_ISCOSTCALCULATED
     * 
     */
    public void setCostCalculated(Boolean isCostCalculated) {
        set(PROPERTY_ISCOSTCALCULATED, isCostCalculated);
    }

}
