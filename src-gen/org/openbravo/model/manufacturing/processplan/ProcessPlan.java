
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
package org.openbravo.model.manufacturing.processplan;

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
 * Entity class for entity ManufacturingProcessPlan (stored in table MA_ProcessPlan).
 * <br>
 * Help: {@literal In this table is defined the header of the process plan.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessPlan extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_ProcessPlan";
    public static final String ENTITY_NAME = "ManufacturingProcessPlan";

    /**
     * Property id stored in column MA_Processplan_ID in table MA_ProcessPlan<br>
     * Help: {@literal Indicates a process plan.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_ProcessPlan 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_ProcessPlan 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_ProcessPlan 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_ProcessPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_ProcessPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_ProcessPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_ProcessPlan 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table MA_ProcessPlan<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table MA_ProcessPlan 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table MA_ProcessPlan<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property includePhasesWhenInserting stored in column Explodephases in table MA_ProcessPlan<br>
     * Help: {@literal Indicates if the work requirement operations will be generated automatically.}
     * 
     */
    public static final String PROPERTY_INCLUDEPHASESWHENINSERTING = "includePhasesWhenInserting";

    /**
     * Property processUnit stored in column Secondaryunit in table MA_ProcessPlan<br>
     * Help: {@literal The name of the main final product obtained by executing a process plan.}
     * 
     */
    public static final String PROPERTY_PROCESSUNIT = "processUnit";

    /**
     * Property conversionRate stored in column Conversionrate in table MA_ProcessPlan<br>
     * Help: {@literal Defines how many final products each run of a process plan produces. See the following
     *       formula to understand the relation between the three elements:
     *       
     *       Process Quantity = Quantity  x 
     *       Conversion Rate}
     * 
     */
    public static final String PROPERTY_CONVERSIONRATE = "conversionRate";

    /**
     * Property copyVersion stored in column Copyversion in table MA_ProcessPlan<br>
     * Help: {@literal A process that copies a selected reference version a new one and changing the
     *       corresponding time periods at the same time.}
     * 
     */
    public static final String PROPERTY_COPYVERSION = "copyVersion";

    /**
     * Property manufacturingVersionList stored in table MA_ProcessPlan
     * 
     */
    public static final String PROPERTY_MANUFACTURINGVERSIONLIST = "manufacturingVersionList";


    public ProcessPlan() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_INCLUDEPHASESWHENINSERTING, true);
        setDefaultValue(PROPERTY_COPYVERSION, false);
        setDefaultValue(PROPERTY_MANUFACTURINGVERSIONLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessPlan#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessPlan#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessPlan#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessPlan#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessPlan#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessPlan#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessPlan#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessPlan#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessPlan#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessPlan#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessPlan#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessPlan#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessPlan#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessPlan#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessPlan#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessPlan#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessPlan#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ProcessPlan#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ProcessPlan#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProcessPlan#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProcessPlan#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProcessPlan#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProcessPlan#PROPERTY_INCLUDEPHASESWHENINSERTING
     * 
     */
    public Boolean isIncludePhasesWhenInserting() {
        return (Boolean) get(PROPERTY_INCLUDEPHASESWHENINSERTING);
    }
    /**
     * @see ProcessPlan#PROPERTY_INCLUDEPHASESWHENINSERTING
     * 
     */
    public void setIncludePhasesWhenInserting(Boolean includePhasesWhenInserting) {
        set(PROPERTY_INCLUDEPHASESWHENINSERTING, includePhasesWhenInserting);
    }

    /**
     * @see ProcessPlan#PROPERTY_PROCESSUNIT
     * 
     */
    public String getProcessUnit() {
        return (String) get(PROPERTY_PROCESSUNIT);
    }
    /**
     * @see ProcessPlan#PROPERTY_PROCESSUNIT
     * 
     */
    public void setProcessUnit(String processUnit) {
        set(PROPERTY_PROCESSUNIT, processUnit);
    }

    /**
     * @see ProcessPlan#PROPERTY_CONVERSIONRATE
     * 
     */
    public BigDecimal getConversionRate() {
        return (BigDecimal) get(PROPERTY_CONVERSIONRATE);
    }
    /**
     * @see ProcessPlan#PROPERTY_CONVERSIONRATE
     * 
     */
    public void setConversionRate(BigDecimal conversionRate) {
        set(PROPERTY_CONVERSIONRATE, conversionRate);
    }

    /**
     * @see ProcessPlan#PROPERTY_COPYVERSION
     * 
     */
    public Boolean isCopyVersion() {
        return (Boolean) get(PROPERTY_COPYVERSION);
    }
    /**
     * @see ProcessPlan#PROPERTY_COPYVERSION
     * 
     */
    public void setCopyVersion(Boolean copyVersion) {
        set(PROPERTY_COPYVERSION, copyVersion);
    }

    /**
     * Help: {@literal This table allows different production plan versions}<br>
     * @see Version
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Version> getManufacturingVersionList() {
      return (List<Version>) get(PROPERTY_MANUFACTURINGVERSIONLIST);
    }

    /**
     * Help: {@literal This table allows different production plan versions}<br>
     * @see Version
     * 
     */
    public void setManufacturingVersionList(List<Version> manufacturingVersionList) {
        set(PROPERTY_MANUFACTURINGVERSIONLIST, manufacturingVersionList);
    }

}
