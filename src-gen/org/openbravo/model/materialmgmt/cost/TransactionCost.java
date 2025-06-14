
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.materialmgmt.transaction.MaterialTransaction;
/**
 * Entity class for entity TransactionCost (stored in table M_Transaction_Cost).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TransactionCost extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Transaction_Cost";
    public static final String ENTITY_NAME = "TransactionCost";

    /**
     * Property id stored in column M_Transaction_Cost_ID in table M_Transaction_Cost 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Transaction_Cost 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Transaction_Cost 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table M_Transaction_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Transaction_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Transaction_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Transaction_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table M_Transaction_Cost 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property inventoryTransaction stored in column M_Transaction_ID in table M_Transaction_Cost<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_INVENTORYTRANSACTION = "inventoryTransaction";

    /**
     * Property cost stored in column Cost in table M_Transaction_Cost 
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property costDate stored in column CostDate in table M_Transaction_Cost 
     * 
     */
    public static final String PROPERTY_COSTDATE = "costDate";

    /**
     * Property currency stored in column C_Currency_ID in table M_Transaction_Cost<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property costAdjustmentLine stored in column M_Costadjustmentline_ID in table M_Transaction_Cost<br>
     * Help: {@literal A Cost Adjustment Line is a Material Transaction whose cost needs to be adjusted by the
     *       amount defined.}
     * 
     */
    public static final String PROPERTY_COSTADJUSTMENTLINE = "costAdjustmentLine";

    /**
     * Property unitCost stored in column IsUnitCost in table M_Transaction_Cost<br>
     * Help: {@literal When checked the cost amount is considered part of the unit cost of the transaction or a
     *       cost added like freight costs or insurance costs.}
     * 
     */
    public static final String PROPERTY_UNITCOST = "unitCost";

    /**
     * Property accountingDate stored in column DateAcct in table M_Transaction_Cost<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";


    public TransactionCost() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_UNITCOST, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TransactionCost#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TransactionCost#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TransactionCost#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TransactionCost#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TransactionCost#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TransactionCost#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TransactionCost#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TransactionCost#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TransactionCost#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TransactionCost#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TransactionCost#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TransactionCost#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TransactionCost#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TransactionCost#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TransactionCost#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TransactionCost#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TransactionCost#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public MaterialTransaction getInventoryTransaction() {
        return (MaterialTransaction) get(PROPERTY_INVENTORYTRANSACTION);
    }
    /**
     * @see TransactionCost#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public void setInventoryTransaction(MaterialTransaction inventoryTransaction) {
        set(PROPERTY_INVENTORYTRANSACTION, inventoryTransaction);
    }

    /**
     * @see TransactionCost#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see TransactionCost#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see TransactionCost#PROPERTY_COSTDATE
     * 
     */
    public Date getCostDate() {
        return (Date) get(PROPERTY_COSTDATE);
    }
    /**
     * @see TransactionCost#PROPERTY_COSTDATE
     * 
     */
    public void setCostDate(Date costDate) {
        set(PROPERTY_COSTDATE, costDate);
    }

    /**
     * @see TransactionCost#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see TransactionCost#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see TransactionCost#PROPERTY_COSTADJUSTMENTLINE
     * 
     */
    public CostAdjustmentLine getCostAdjustmentLine() {
        return (CostAdjustmentLine) get(PROPERTY_COSTADJUSTMENTLINE);
    }
    /**
     * @see TransactionCost#PROPERTY_COSTADJUSTMENTLINE
     * 
     */
    public void setCostAdjustmentLine(CostAdjustmentLine costAdjustmentLine) {
        set(PROPERTY_COSTADJUSTMENTLINE, costAdjustmentLine);
    }

    /**
     * @see TransactionCost#PROPERTY_UNITCOST
     * 
     */
    public Boolean isUnitCost() {
        return (Boolean) get(PROPERTY_UNITCOST);
    }
    /**
     * @see TransactionCost#PROPERTY_UNITCOST
     * 
     */
    public void setUnitCost(Boolean unitCost) {
        set(PROPERTY_UNITCOST, unitCost);
    }

    /**
     * @see TransactionCost#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see TransactionCost#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

}
