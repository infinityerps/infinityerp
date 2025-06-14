
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
package org.openbravo.model.materialmgmt.onhandquantity;

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
 * Entity class for entity MaterialMgmtStorageStockProposed (stored in table M_Stock_Proposed).
 * <br>
 * Help: {@literal Contains the available stock prioritized by user defined rules for each transaction in a
     *       determinate moment.
     *       }
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class StockProposed extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Stock_Proposed";
    public static final String ENTITY_NAME = "MaterialMgmtStorageStockProposed";

    /**
     * Property id stored in column M_Stock_Proposed_ID in table M_Stock_Proposed 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Stock_Proposed 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Stock_Proposed 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Stock_Proposed 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Stock_Proposed 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Stock_Proposed 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Stock_Proposed 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Stock_Proposed 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property processInstance stored in column AD_Pinstance_ID in table M_Stock_Proposed<br>
     * Help: {@literal Process Instance identifies the instance of a process. Every time a process is executed a
     *       new instance of it is created.}
     * 
     */
    public static final String PROPERTY_PROCESSINSTANCE = "processInstance";

    /**
     * Property priority stored in column Priority in table M_Stock_Proposed<br>
     * Help: {@literal The Priority indicates the importance of this request.}
     * 
     */
    public static final String PROPERTY_PRIORITY = "priority";

    /**
     * Property quantity stored in column Quantity in table M_Stock_Proposed<br>
     * Help: {@literal Indicates the quantity of product needed to process one time the sequence.}
     * 
     */
    public static final String PROPERTY_QUANTITY = "quantity";

    /**
     * Property storageDetail stored in column M_Storage_Detail_ID in table M_Stock_Proposed<br>
     * Help: {@literal The Storage Detail identifies a stock in the warehouse by quantity, attributes and storage
     *       bin.}
     * 
     */
    public static final String PROPERTY_STORAGEDETAIL = "storageDetail";

    /**
     * Property qtyorder stored in column Qtyorder in table M_Stock_Proposed
     * 
     */
    public static final String PROPERTY_QTYORDER = "qtyorder";

    /**
     * Property final stored in column IsFinal in table M_Stock_Proposed<br>
     * Help: {@literal Identifies a final record}
     * 
     */
    public static final String PROPERTY_FINAL = "final";


    public StockProposed() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FINAL, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see StockProposed#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see StockProposed#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see StockProposed#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see StockProposed#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see StockProposed#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see StockProposed#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see StockProposed#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see StockProposed#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see StockProposed#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see StockProposed#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see StockProposed#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see StockProposed#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see StockProposed#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see StockProposed#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see StockProposed#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see StockProposed#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see StockProposed#PROPERTY_PROCESSINSTANCE
     * 
     */
    public String getProcessInstance() {
        return (String) get(PROPERTY_PROCESSINSTANCE);
    }
    /**
     * @see StockProposed#PROPERTY_PROCESSINSTANCE
     * 
     */
    public void setProcessInstance(String processInstance) {
        set(PROPERTY_PROCESSINSTANCE, processInstance);
    }

    /**
     * @see StockProposed#PROPERTY_PRIORITY
     * 
     */
    public Long getPriority() {
        return (Long) get(PROPERTY_PRIORITY);
    }
    /**
     * @see StockProposed#PROPERTY_PRIORITY
     * 
     */
    public void setPriority(Long priority) {
        set(PROPERTY_PRIORITY, priority);
    }

    /**
     * @see StockProposed#PROPERTY_QUANTITY
     * 
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }
    /**
     * @see StockProposed#PROPERTY_QUANTITY
     * 
     */
    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    /**
     * @see StockProposed#PROPERTY_STORAGEDETAIL
     * 
     */
    public StorageDetail getStorageDetail() {
        return (StorageDetail) get(PROPERTY_STORAGEDETAIL);
    }
    /**
     * @see StockProposed#PROPERTY_STORAGEDETAIL
     * 
     */
    public void setStorageDetail(StorageDetail storageDetail) {
        set(PROPERTY_STORAGEDETAIL, storageDetail);
    }

    /**
     * @see StockProposed#PROPERTY_QTYORDER
     * 
     */
    public BigDecimal getQtyorder() {
        return (BigDecimal) get(PROPERTY_QTYORDER);
    }
    /**
     * @see StockProposed#PROPERTY_QTYORDER
     * 
     */
    public void setQtyorder(BigDecimal qtyorder) {
        set(PROPERTY_QTYORDER, qtyorder);
    }

    /**
     * @see StockProposed#PROPERTY_FINAL
     * 
     */
    public Boolean isFinal() {
        return (Boolean) get(PROPERTY_FINAL);
    }
    /**
     * @see StockProposed#PROPERTY_FINAL
     * 
     */
    public void setFinal(Boolean fnl) {
        set(PROPERTY_FINAL, fnl);
    }

}
