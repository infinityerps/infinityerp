
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.materialmgmt.transaction.MaterialTransaction;
/**
 * Entity class for entity CostAdjustmentLine (stored in table M_CostAdjustmentLine).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostAdjustmentLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_CostAdjustmentLine";
    public static final String ENTITY_NAME = "CostAdjustmentLine";

    /**
     * Property id stored in column M_CostAdjustmentLine_ID in table M_CostAdjustmentLine<br>
     * Help: {@literal A Cost Adjustment Line is a Material Transaction whose cost needs to be adjusted by the
     *       amount defined.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_CostAdjustmentLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_CostAdjustmentLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_CostAdjustmentLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_CostAdjustmentLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_CostAdjustmentLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_CostAdjustmentLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_CostAdjustmentLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property costAdjustment stored in column M_Costadjustment_ID in table M_CostAdjustmentLine<br>
     * Help: {@literal Represents a Cost Adjustment header where costs of some transactions are adjusted.}
     * 
     */
    public static final String PROPERTY_COSTADJUSTMENT = "costAdjustment";

    /**
     * Property inventoryTransaction stored in column M_Transaction_ID in table M_CostAdjustmentLine<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_INVENTORYTRANSACTION = "inventoryTransaction";

    /**
     * Property adjustmentAmount stored in column Adjustment_Amount in table M_CostAdjustmentLine 
     * 
     */
    public static final String PROPERTY_ADJUSTMENTAMOUNT = "adjustmentAmount";

    /**
     * Property isSource stored in column IsSource in table M_CostAdjustmentLine<br>
     * Help: {@literal Identifies the transactions that required the adjustment.}
     * 
     */
    public static final String PROPERTY_ISSOURCE = "isSource";

    /**
     * Property needsPosting stored in column NeedsPosting in table M_CostAdjustmentLine<br>
     * Help: {@literal Determines whether the adjustment line amount needs to be posted to the ledger or not.}
     * 
     */
    public static final String PROPERTY_NEEDSPOSTING = "needsPosting";

    /**
     * Property accountingDate stored in column Dateacct in table M_CostAdjustmentLine<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property isRelatedTransactionAdjusted stored in column IsRelatedTrxAdjusted in table M_CostAdjustmentLine<br>
     * Help: {@literal Field used by the Cost Adjustment process to label all the transaction that have been
     *       checked to search related transactions that also needs adjustment.}
     * 
     */
    public static final String PROPERTY_ISRELATEDTRANSACTIONADJUSTED = "isRelatedTransactionAdjusted";

    /**
     * Property parentCostAdjustmentLine stored in column Parent_Costadjustmentline_ID in table M_CostAdjustmentLine<br>
     * Help: {@literal References the cost adjustment line that causes the adjustment on the current
     *       transaction.}
     * 
     */
    public static final String PROPERTY_PARENTCOSTADJUSTMENTLINE = "parentCostAdjustmentLine";

    /**
     * Property lineNo stored in column Line in table M_CostAdjustmentLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property currency stored in column C_Currency_ID in table M_CostAdjustmentLine<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property unitCost stored in column IsUnitCost in table M_CostAdjustmentLine<br>
     * Help: {@literal When checked the cost amount is considered part of the unit cost of the transaction or a
     *       cost added like freight costs or insurance costs.}
     * 
     */
    public static final String PROPERTY_UNITCOST = "unitCost";

    /**
     * Property isBackdatedTrx stored in column Isbackdatedtrx in table M_CostAdjustmentLine
     * 
     */
    public static final String PROPERTY_ISBACKDATEDTRX = "isBackdatedTrx";

    /**
     * Property isNegativeStockCorrection stored in column Isnegativestockcorrection in table M_CostAdjustmentLine
     * 
     */
    public static final String PROPERTY_ISNEGATIVESTOCKCORRECTION = "isNegativeStockCorrection";

    /**
     * Property transactionCostList stored in table M_CostAdjustmentLine
     * 
     */
    public static final String PROPERTY_TRANSACTIONCOSTLIST = "transactionCostList";


    public CostAdjustmentLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ISSOURCE, false);
        setDefaultValue(PROPERTY_NEEDSPOSTING, true);
        setDefaultValue(PROPERTY_ISRELATEDTRANSACTIONADJUSTED, false);
        setDefaultValue(PROPERTY_UNITCOST, true);
        setDefaultValue(PROPERTY_ISBACKDATEDTRX, false);
        setDefaultValue(PROPERTY_ISNEGATIVESTOCKCORRECTION, false);
        setDefaultValue(PROPERTY_TRANSACTIONCOSTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_COSTADJUSTMENT
     * 
     */
    public CostAdjustment getCostAdjustment() {
        return (CostAdjustment) get(PROPERTY_COSTADJUSTMENT);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_COSTADJUSTMENT
     * 
     */
    public void setCostAdjustment(CostAdjustment costAdjustment) {
        set(PROPERTY_COSTADJUSTMENT, costAdjustment);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public MaterialTransaction getInventoryTransaction() {
        return (MaterialTransaction) get(PROPERTY_INVENTORYTRANSACTION);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public void setInventoryTransaction(MaterialTransaction inventoryTransaction) {
        set(PROPERTY_INVENTORYTRANSACTION, inventoryTransaction);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ADJUSTMENTAMOUNT
     * 
     */
    public BigDecimal getAdjustmentAmount() {
        return (BigDecimal) get(PROPERTY_ADJUSTMENTAMOUNT);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ADJUSTMENTAMOUNT
     * 
     */
    public void setAdjustmentAmount(BigDecimal adjustmentAmount) {
        set(PROPERTY_ADJUSTMENTAMOUNT, adjustmentAmount);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ISSOURCE
     * 
     */
    public Boolean isSource() {
        return (Boolean) get(PROPERTY_ISSOURCE);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ISSOURCE
     * 
     */
    public void setSource(Boolean isSource) {
        set(PROPERTY_ISSOURCE, isSource);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_NEEDSPOSTING
     * 
     */
    public Boolean isNeedsPosting() {
        return (Boolean) get(PROPERTY_NEEDSPOSTING);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_NEEDSPOSTING
     * 
     */
    public void setNeedsPosting(Boolean needsPosting) {
        set(PROPERTY_NEEDSPOSTING, needsPosting);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ISRELATEDTRANSACTIONADJUSTED
     * 
     */
    public Boolean isRelatedTransactionAdjusted() {
        return (Boolean) get(PROPERTY_ISRELATEDTRANSACTIONADJUSTED);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ISRELATEDTRANSACTIONADJUSTED
     * 
     */
    public void setRelatedTransactionAdjusted(Boolean isRelatedTransactionAdjusted) {
        set(PROPERTY_ISRELATEDTRANSACTIONADJUSTED, isRelatedTransactionAdjusted);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_PARENTCOSTADJUSTMENTLINE
     * 
     */
    public CostAdjustmentLine getParentCostAdjustmentLine() {
        return (CostAdjustmentLine) get(PROPERTY_PARENTCOSTADJUSTMENTLINE);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_PARENTCOSTADJUSTMENTLINE
     * 
     */
    public void setParentCostAdjustmentLine(CostAdjustmentLine parentCostAdjustmentLine) {
        set(PROPERTY_PARENTCOSTADJUSTMENTLINE, parentCostAdjustmentLine);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_UNITCOST
     * 
     */
    public Boolean isUnitCost() {
        return (Boolean) get(PROPERTY_UNITCOST);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_UNITCOST
     * 
     */
    public void setUnitCost(Boolean unitCost) {
        set(PROPERTY_UNITCOST, unitCost);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ISBACKDATEDTRX
     * 
     */
    public Boolean isBackdatedTrx() {
        return (Boolean) get(PROPERTY_ISBACKDATEDTRX);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ISBACKDATEDTRX
     * 
     */
    public void setBackdatedTrx(Boolean isBackdatedTrx) {
        set(PROPERTY_ISBACKDATEDTRX, isBackdatedTrx);
    }

    /**
     * @see CostAdjustmentLine#PROPERTY_ISNEGATIVESTOCKCORRECTION
     * 
     */
    public Boolean isNegativeStockCorrection() {
        return (Boolean) get(PROPERTY_ISNEGATIVESTOCKCORRECTION);
    }
    /**
     * @see CostAdjustmentLine#PROPERTY_ISNEGATIVESTOCKCORRECTION
     * 
     */
    public void setNegativeStockCorrection(Boolean isNegativeStockCorrection) {
        set(PROPERTY_ISNEGATIVESTOCKCORRECTION, isNegativeStockCorrection);
    }

    /**
     * @see TransactionCost
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TransactionCost> getTransactionCostList() {
      return (List<TransactionCost>) get(PROPERTY_TRANSACTIONCOSTLIST);
    }

    /**
     * @see TransactionCost
     * 
     */
    public void setTransactionCostList(List<TransactionCost> transactionCostList) {
        set(PROPERTY_TRANSACTIONCOSTLIST, transactionCostList);
    }

}
