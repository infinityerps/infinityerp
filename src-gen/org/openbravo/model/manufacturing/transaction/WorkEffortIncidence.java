
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
package org.openbravo.model.manufacturing.transaction;

import java.sql.Timestamp;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.materialmgmt.transaction.ProductionPlan;
import org.openbravo.model.materialmgmt.transaction.ProductionTransaction;
/**
 * Entity class for entity ManufacturingWorkEffortIncidence (stored in table MA_WEIncidence).
 * <br>
 * Help: {@literal In this table are all the incidences that may have happened.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WorkEffortIncidence extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_WEIncidence";
    public static final String ENTITY_NAME = "ManufacturingWorkEffortIncidence";

    /**
     * Property id stored in column MA_Weincidence_ID in table MA_WEIncidence 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_WEIncidence 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_WEIncidence 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_WEIncidence 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_WEIncidence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_WEIncidence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_WEIncidence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_WEIncidence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property production stored in column M_Production_ID in table MA_WEIncidence<br>
     * Help: {@literal The Production uniquely identifies a Production Plan}
     * 
     */
    public static final String PROPERTY_PRODUCTION = "production";

    /**
     * Property incidence stored in column MA_Incidence_ID in table MA_WEIncidence<br>
     * Help: {@literal Unique identifier for incidence}
     * 
     */
    public static final String PROPERTY_INCIDENCE = "incidence";

    /**
     * Property startingTime stored in column Starttime in table MA_WEIncidence<br>
     * Help: {@literal Start time in hours.}
     * 
     */
    public static final String PROPERTY_STARTINGTIME = "startingTime";

    /**
     * Property endingTime stored in column Endtime in table MA_WEIncidence<br>
     * Help: {@literal End time in hours.}
     * 
     */
    public static final String PROPERTY_ENDINGTIME = "endingTime";

    /**
     * Property description stored in column Description in table MA_WEIncidence<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property productionPlan stored in column M_Productionplan_ID in table MA_WEIncidence<br>
     * Help: {@literal The Production Plan identifies the items and steps in generating a product.}
     * 
     */
    public static final String PROPERTY_PRODUCTIONPLAN = "productionPlan";


    public WorkEffortIncidence() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_PRODUCTION
     * 
     */
    public ProductionTransaction getProduction() {
        return (ProductionTransaction) get(PROPERTY_PRODUCTION);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_PRODUCTION
     * 
     */
    public void setProduction(ProductionTransaction production) {
        set(PROPERTY_PRODUCTION, production);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_INCIDENCE
     * 
     */
    public Incidence getIncidence() {
        return (Incidence) get(PROPERTY_INCIDENCE);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_INCIDENCE
     * 
     */
    public void setIncidence(Incidence incidence) {
        set(PROPERTY_INCIDENCE, incidence);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_STARTINGTIME
     * 
     */
    public Timestamp getStartingTime() {
        return (Timestamp) get(PROPERTY_STARTINGTIME);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_STARTINGTIME
     * 
     */
    public void setStartingTime(Timestamp startingTime) {
        set(PROPERTY_STARTINGTIME, startingTime);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_ENDINGTIME
     * 
     */
    public Timestamp getEndingTime() {
        return (Timestamp) get(PROPERTY_ENDINGTIME);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_ENDINGTIME
     * 
     */
    public void setEndingTime(Timestamp endingTime) {
        set(PROPERTY_ENDINGTIME, endingTime);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see WorkEffortIncidence#PROPERTY_PRODUCTIONPLAN
     * 
     */
    public ProductionPlan getProductionPlan() {
        return (ProductionPlan) get(PROPERTY_PRODUCTIONPLAN);
    }
    /**
     * @see WorkEffortIncidence#PROPERTY_PRODUCTIONPLAN
     * 
     */
    public void setProductionPlan(ProductionPlan productionPlan) {
        set(PROPERTY_PRODUCTIONPLAN, productionPlan);
    }

}
