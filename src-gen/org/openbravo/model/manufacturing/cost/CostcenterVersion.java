
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
package org.openbravo.model.manufacturing.cost;

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
 * Entity class for entity ManufacturingCostcenterVersion (stored in table MA_Costcenter_Version).
 * <br>
 * Help: {@literal Cost center version valid during a time period.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostcenterVersion extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Costcenter_Version";
    public static final String ENTITY_NAME = "ManufacturingCostcenterVersion";

    /**
     * Property id stored in column MA_Costcenter_Version_ID in table MA_Costcenter_Version<br>
     * Help: {@literal Identifies a cost center version valid during a time period.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_Costcenter_Version 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_Costcenter_Version 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_Costcenter_Version 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_Costcenter_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_Costcenter_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_Costcenter_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_Costcenter_Version 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentNo stored in column DocumentNo in table MA_Costcenter_Version 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property cost stored in column Cost in table MA_Costcenter_Version<br>
     * Help: {@literal Cost amount.}
     * 
     */
    public static final String PROPERTY_COST = "cost";

    /**
     * Property costCenter stored in column MA_Costcenter_ID in table MA_Costcenter_Version<br>
     * Help: {@literal Identifies a cost center.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property costUOM stored in column Costuom in table MA_Costcenter_Version<br>
     * Help: {@literal Unit of Measure for cost}
     * 
     */
    public static final String PROPERTY_COSTUOM = "costUOM";

    /**
     * Property validFromDate stored in column ValidFrom in table MA_Costcenter_Version 
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";


    public CostcenterVersion() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostcenterVersion#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostcenterVersion#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostcenterVersion#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostcenterVersion#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostcenterVersion#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostcenterVersion#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostcenterVersion#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostcenterVersion#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CostcenterVersion#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostcenterVersion#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostcenterVersion#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostcenterVersion#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostcenterVersion#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostcenterVersion#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostcenterVersion#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostcenterVersion#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostcenterVersion#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see CostcenterVersion#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see CostcenterVersion#PROPERTY_COST
     * 
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(PROPERTY_COST);
    }
    /**
     * @see CostcenterVersion#PROPERTY_COST
     * 
     */
    public void setCost(BigDecimal cost) {
        set(PROPERTY_COST, cost);
    }

    /**
     * @see CostcenterVersion#PROPERTY_COSTCENTER
     * 
     */
    public CostCenter getCostCenter() {
        return (CostCenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see CostcenterVersion#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(CostCenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see CostcenterVersion#PROPERTY_COSTUOM
     * 
     */
    public String getCostUOM() {
        return (String) get(PROPERTY_COSTUOM);
    }
    /**
     * @see CostcenterVersion#PROPERTY_COSTUOM
     * 
     */
    public void setCostUOM(String costUOM) {
        set(PROPERTY_COSTUOM, costUOM);
    }

    /**
     * @see CostcenterVersion#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see CostcenterVersion#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

}
