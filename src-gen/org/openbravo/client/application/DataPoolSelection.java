
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
package org.openbravo.client.application;

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
 * Entity class for entity OBUIAPP_Data_Pool_Selection (stored in table OBUIAPP_Data_Pool_Sel).
 * <br>
 * Help: {@literal Associates a Report to a data pool.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DataPoolSelection extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_Data_Pool_Sel";
    public static final String ENTITY_NAME = "OBUIAPP_Data_Pool_Selection";

    /**
     * Property id stored in column Obuiapp_Data_Pool_Sel_ID in table OBUIAPP_Data_Pool_Sel 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_Data_Pool_Sel 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_Data_Pool_Sel 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_Data_Pool_Sel 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_Data_Pool_Sel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_Data_Pool_Sel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_Data_Pool_Sel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_Data_Pool_Sel 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property report stored in column Obuiapp_Pool_Report_V_ID in table OBUIAPP_Data_Pool_Sel<br>
     * Help: {@literal References a report regardless the place it is defined}
     * 
     */
    public static final String PROPERTY_REPORT = "report";

    /**
     * Property dataPool stored in column Data_Pool in table OBUIAPP_Data_Pool_Sel<br>
     * Help: {@literal Lists all possible database pools which OBDal can use to retrieve data.}
     * 
     */
    public static final String PROPERTY_DATAPOOL = "dataPool";

    /**
     * Property dataType stored in column Data_Type in table OBUIAPP_Data_Pool_Sel<br>
     * Help: {@literal Lists all possible elements whose data can be retrieved from different database pools.}
     * 
     */
    public static final String PROPERTY_DATATYPE = "dataType";


    public DataPoolSelection() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DATAPOOL, "RO");
        setDefaultValue(PROPERTY_DATATYPE, "REPORT");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DataPoolSelection#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DataPoolSelection#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DataPoolSelection#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DataPoolSelection#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DataPoolSelection#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DataPoolSelection#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DataPoolSelection#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DataPoolSelection#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DataPoolSelection#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DataPoolSelection#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DataPoolSelection#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DataPoolSelection#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DataPoolSelection#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DataPoolSelection#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DataPoolSelection#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DataPoolSelection#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DataPoolSelection#PROPERTY_REPORT
     * 
     */
    public DataPoolReport getReport() {
        return (DataPoolReport) get(PROPERTY_REPORT);
    }
    /**
     * @see DataPoolSelection#PROPERTY_REPORT
     * 
     */
    public void setReport(DataPoolReport report) {
        set(PROPERTY_REPORT, report);
    }

    /**
     * @see DataPoolSelection#PROPERTY_DATAPOOL
     * 
     */
    public String getDataPool() {
        return (String) get(PROPERTY_DATAPOOL);
    }
    /**
     * @see DataPoolSelection#PROPERTY_DATAPOOL
     * 
     */
    public void setDataPool(String dataPool) {
        set(PROPERTY_DATAPOOL, dataPool);
    }

    /**
     * @see DataPoolSelection#PROPERTY_DATATYPE
     * 
     */
    public String getDataType() {
        return (String) get(PROPERTY_DATATYPE);
    }
    /**
     * @see DataPoolSelection#PROPERTY_DATATYPE
     * 
     */
    public void setDataType(String dataType) {
        set(PROPERTY_DATATYPE, dataType);
    }

}
