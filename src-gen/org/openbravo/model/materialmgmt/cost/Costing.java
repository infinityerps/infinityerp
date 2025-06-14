
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
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.materialmgmt.transaction.MaterialTransaction;
/**
 * Entity class for entity MaterialMgmtCosting (stored in table M_Costing).
 * <br>
 * Help: {@literal Stores the average costs for purchases and productions}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Costing extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Costing";
    public static final String ENTITY_NAME = "MaterialMgmtCosting";

    /**
     * Property id stored in column M_Costing_ID in table M_Costing<br>
     * Help: {@literal Average costs for purchases and productions}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property creationDate stored in column Created in table M_Costing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Costing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Costing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Costing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property client stored in column AD_Client_ID in table M_Costing 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Costing 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property product stored in column M_Product_ID in table M_Costing<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property startingDate stored in column DateFrom in table M_Costing 
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property endingDate stored in column DateTo in table M_Costing<br>
     * Help: {@literal The Date To indicates the end date of a range (inclusive)}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property manual stored in column IsManual in table M_Costing<br>
     * Help: {@literal The Manual check box indicates if the process will done manually.}
     * 
     */
    public static final String PROPERTY_MANUAL = "manual";

    /**
     * Property invoiceLine stored in column C_InvoiceLine_ID in table M_Costing<br>
     * Help: {@literal The Invoice Line uniquely identifies a single line of an Invoice.}
     * 
     */
    public static final String PROPERTY_INVOICELINE = "invoiceLine";

    /**
     * Property quantity stored in column Qty in table M_Costing<br>
     * Help: {@literal The Quantity indicates the number of a specific product or item for this document.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property price stored in column Price in table M_Costing<br>
     * Help: {@literal The Price indicates the Price for a product or service.}
     * 
     */
    public static final String PROPERTY_PRICE = "price";

    /**
     * Property totalMovementQuantity stored in column Cumstock in table M_Costing<br>
     * Help: {@literal Cumulate quantity.}
     * 
     */
    public static final String PROPERTY_TOTALMOVEMENTQUANTITY = "totalMovementQuantity";

    /**
     * Property costType stored in column Costtype in table M_Costing<br>
     * Help: {@literal Different types of cost.}
     * 
     */
    public static final String PROPERTY_COSTTYPE = "costType";

    /**
     * Property permanent stored in column Ispermanent in table M_Costing
     * 
     */
    public static final String PROPERTY_PERMANENT = "permanent";

    /**
     * Property cost stored in column Cost in table M_Costing<br>
     * Help: {@literal Cost amount.}
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property totalStockValuation stored in column Cumcost in table M_Costing
     * 
     */
    public static final String PROPERTY_TOTALSTOCKVALUATION = "totalStockValuation";

    /**
     * Property production stored in column Isproduction in table M_Costing<br>
     * Help: {@literal Sets the record_id for production.}
     * 
     */
    public static final String PROPERTY_PRODUCTION = "production";

    /**
     * Property active stored in column Isactive in table M_Costing 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table M_Costing<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property inventoryTransaction stored in column M_Transaction_ID in table M_Costing<br>
     * Help: {@literal The ID identifies a unique record}
     * 
     */
    public static final String PROPERTY_INVENTORYTRANSACTION = "inventoryTransaction";

    /**
     * Property currency stored in column C_Currency_ID in table M_Costing<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property originalCost stored in column Originalcost in table M_Costing<br>
     * Help: {@literal It is the cost originally calculated before processing cost adjustments on related
     *       transactions.}
     * 
     */
    public static final String PROPERTY_ORIGINALCOST = "originalCost";


    public Costing() {
        setDefaultValue(PROPERTY_MANUAL, false);
        setDefaultValue(PROPERTY_PERMANENT, false);
        setDefaultValue(PROPERTY_PRODUCTION, false);
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Costing#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Costing#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Costing#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Costing#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Costing#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Costing#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Costing#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Costing#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Costing#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Costing#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Costing#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Costing#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Costing#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Costing#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Costing#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see Costing#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see Costing#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see Costing#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see Costing#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see Costing#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see Costing#PROPERTY_MANUAL
     * 
     */
    public Boolean isManual() {
        return (Boolean) get(PROPERTY_MANUAL);
    }
    /**
     * @see Costing#PROPERTY_MANUAL
     * 
     */
    public void setManual(Boolean manual) {
        set(PROPERTY_MANUAL, manual);
    }

    /**
     * @see Costing#PROPERTY_INVOICELINE
     * 
     */
    public InvoiceLine getInvoiceLine() {
        return (InvoiceLine) get(PROPERTY_INVOICELINE);
    }
    /**
     * @see Costing#PROPERTY_INVOICELINE
     * 
     */
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        set(PROPERTY_INVOICELINE, invoiceLine);
    }

    /**
     * @see Costing#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see Costing#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see Costing#PROPERTY_PRICE
     * 
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(PROPERTY_PRICE);
    }
    /**
     * @see Costing#PROPERTY_PRICE
     * 
     */
    public void setPrice(BigDecimal price) {
        set(PROPERTY_PRICE, price);
    }

    /**
     * @see Costing#PROPERTY_TOTALMOVEMENTQUANTITY
     * 
     */
    public BigDecimal getTotalMovementQuantity() {
        return (BigDecimal) get(PROPERTY_TOTALMOVEMENTQUANTITY);
    }
    /**
     * @see Costing#PROPERTY_TOTALMOVEMENTQUANTITY
     * 
     */
    public void setTotalMovementQuantity(BigDecimal totalMovementQuantity) {
        set(PROPERTY_TOTALMOVEMENTQUANTITY, totalMovementQuantity);
    }

    /**
     * @see Costing#PROPERTY_COSTTYPE
     * 
     */
    public String getCostType() {
        return (String) get(PROPERTY_COSTTYPE);
    }
    /**
     * @see Costing#PROPERTY_COSTTYPE
     * 
     */
    public void setCostType(String costType) {
        set(PROPERTY_COSTTYPE, costType);
    }

    /**
     * @see Costing#PROPERTY_PERMANENT
     * 
     */
    public Boolean isPermanent() {
        return (Boolean) get(PROPERTY_PERMANENT);
    }
    /**
     * @see Costing#PROPERTY_PERMANENT
     * 
     */
    public void setPermanent(Boolean permanent) {
        set(PROPERTY_PERMANENT, permanent);
    }

    /**
     * @see Costing#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see Costing#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see Costing#PROPERTY_TOTALSTOCKVALUATION
     * 
     */
    public BigDecimal getTotalStockValuation() {
        return (BigDecimal) get(PROPERTY_TOTALSTOCKVALUATION);
    }
    /**
     * @see Costing#PROPERTY_TOTALSTOCKVALUATION
     * 
     */
    public void setTotalStockValuation(BigDecimal totalStockValuation) {
        set(PROPERTY_TOTALSTOCKVALUATION, totalStockValuation);
    }

    /**
     * @see Costing#PROPERTY_PRODUCTION
     * 
     */
    public Boolean isProduction() {
        return (Boolean) get(PROPERTY_PRODUCTION);
    }
    /**
     * @see Costing#PROPERTY_PRODUCTION
     * 
     */
    public void setProduction(Boolean production) {
        set(PROPERTY_PRODUCTION, production);
    }

    /**
     * @see Costing#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Costing#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Costing#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see Costing#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see Costing#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public MaterialTransaction getInventoryTransaction() {
        return (MaterialTransaction) get(PROPERTY_INVENTORYTRANSACTION);
    }
    /**
     * @see Costing#PROPERTY_INVENTORYTRANSACTION
     * 
     */
    public void setInventoryTransaction(MaterialTransaction inventoryTransaction) {
        set(PROPERTY_INVENTORYTRANSACTION, inventoryTransaction);
    }

    /**
     * @see Costing#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Costing#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Costing#PROPERTY_ORIGINALCOST
     * 
     */
    public BigDecimal getOriginalCost() {
        return (BigDecimal) get(PROPERTY_ORIGINALCOST);
    }
    /**
     * @see Costing#PROPERTY_ORIGINALCOST
     * 
     */
    public void setOriginalCost(BigDecimal originalCost) {
        set(PROPERTY_ORIGINALCOST, originalCost);
    }

}
