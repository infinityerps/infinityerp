
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
package org.openbravo.model.mrp;

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
 * Entity class for entity MRPPlanningMethodLine (stored in table MRP_PlanningMethodLine).
 * <br>
 * Help: {@literal The planning method line sets the filter options for the input types of the planning
     *       methods.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PlanningMethodLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MRP_PlanningMethodLine";
    public static final String ENTITY_NAME = "MRPPlanningMethodLine";

    /**
     * Property id stored in column MRP_Planningmethodline_ID in table MRP_PlanningMethodLine 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MRP_PlanningMethodLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MRP_PlanningMethodLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MRP_PlanningMethodLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MRP_PlanningMethodLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MRP_PlanningMethodLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MRP_PlanningMethodLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MRP_PlanningMethodLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property planningMethod stored in column MRP_Planningmethod_ID in table MRP_PlanningMethodLine<br>
     * Help: {@literal Identifies a method for filtering the input for planning processes.}
     * 
     */
    public static final String PROPERTY_PLANNINGMETHOD = "planningMethod";

    /**
     * Property lineNo stored in column Line in table MRP_PlanningMethodLine<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property transactionType stored in column Inouttrxtype in table MRP_PlanningMethodLine 
     * 
     */
    public static final String PROPERTY_TRANSACTIONTYPE = "transactionType";

    /**
     * Property weighting stored in column Weighting in table MRP_PlanningMethodLine<br>
     * Help: {@literal Percentage of the transaction that is used. in so much per one.}
     * 
     */
    public static final String PROPERTY_WEIGHTING = "weighting";

    /**
     * Property daysFromStart stored in column Daysfrom in table MRP_PlanningMethodLine 
     * 
     */
    public static final String PROPERTY_DAYSFROMSTART = "daysFromStart";

    /**
     * Property daysToEnd stored in column Daysto in table MRP_PlanningMethodLine 
     * 
     */
    public static final String PROPERTY_DAYSTOEND = "daysToEnd";


    public PlanningMethodLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_WEIGHTING, new BigDecimal(1));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PlanningMethodLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_PLANNINGMETHOD
     * 
     */
    public PlanningMethod getPlanningMethod() {
        return (PlanningMethod) get(PROPERTY_PLANNINGMETHOD);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_PLANNINGMETHOD
     * 
     */
    public void setPlanningMethod(PlanningMethod planningMethod) {
        set(PROPERTY_PLANNINGMETHOD, planningMethod);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public String getTransactionType() {
        return (String) get(PROPERTY_TRANSACTIONTYPE);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_TRANSACTIONTYPE
     * 
     */
    public void setTransactionType(String transactionType) {
        set(PROPERTY_TRANSACTIONTYPE, transactionType);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_WEIGHTING
     * 
     */
    public BigDecimal getWeighting() {
        return (BigDecimal) get(PROPERTY_WEIGHTING);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_WEIGHTING
     * 
     */
    public void setWeighting(BigDecimal weighting) {
        set(PROPERTY_WEIGHTING, weighting);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_DAYSFROMSTART
     * 
     */
    public Long getDaysFromStart() {
        return (Long) get(PROPERTY_DAYSFROMSTART);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_DAYSFROMSTART
     * 
     */
    public void setDaysFromStart(Long daysFromStart) {
        set(PROPERTY_DAYSFROMSTART, daysFromStart);
    }

    /**
     * @see PlanningMethodLine#PROPERTY_DAYSTOEND
     * 
     */
    public Long getDaysToEnd() {
        return (Long) get(PROPERTY_DAYSTOEND);
    }
    /**
     * @see PlanningMethodLine#PROPERTY_DAYSTOEND
     * 
     */
    public void setDaysToEnd(Long daysToEnd) {
        set(PROPERTY_DAYSTOEND, daysToEnd);
    }

}
