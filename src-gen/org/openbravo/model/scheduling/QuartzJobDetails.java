
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
package org.openbravo.model.scheduling;

import org.openbravo.base.structure.BaseOBObject;
/**
 * Entity class for entity OBSCHEDJobDetails (stored in table obsched_job_details).
 * <br>
 * Help: {@literal Quartz serialized parameters for existing jobs}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzJobDetails extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_job_details";
    public static final String ENTITY_NAME = "OBSCHEDJobDetails";

    /**
     * Property id stored in column Obsched_Job_Details_ID in table obsched_job_details 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_job_details<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property jOBName stored in column JOB_Name in table obsched_job_details 
     * 
     */
    public static final String PROPERTY_JOBNAME = "jOBName";

    /**
     * Property jOBGroup stored in column JOB_Group in table obsched_job_details 
     * 
     */
    public static final String PROPERTY_JOBGROUP = "jOBGroup";

    /**
     * Property description stored in column Description in table obsched_job_details<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property jOBClassName stored in column JOB_Class_Name in table obsched_job_details
     * 
     */
    public static final String PROPERTY_JOBCLASSNAME = "jOBClassName";

    /**
     * Property durable stored in column IS_Durable in table obsched_job_details
     * 
     */
    public static final String PROPERTY_DURABLE = "durable";

    /**
     * Property nonconcurrent stored in column IS_Nonconcurrent in table obsched_job_details<br>
     * Help: {@literal Defines if a process/job can be executed concurrently or not.}
     * 
     */
    public static final String PROPERTY_NONCONCURRENT = "nonconcurrent";

    /**
     * Property updateData stored in column IS_Update_Data in table obsched_job_details
     * 
     */
    public static final String PROPERTY_UPDATEDATA = "updateData";

    /**
     * Property requestsRecovery stored in column Requests_Recovery in table obsched_job_details
     * 
     */
    public static final String PROPERTY_REQUESTSRECOVERY = "requestsRecovery";

    /**
     * Property jOBData stored in column JOB_Data in table obsched_job_details<br>
     * Help: {@literal Serialized job data for process execution.}
     * 
     */
    public static final String PROPERTY_JOBDATA = "jOBData";


    public QuartzJobDetails() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzJobDetails#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_JOBNAME
     * 
     */
    public String getJOBName() {
        return (String) get(PROPERTY_JOBNAME);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_JOBNAME
     * 
     */
    public void setJOBName(String jOBName) {
        set(PROPERTY_JOBNAME, jOBName);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_JOBGROUP
     * 
     */
    public String getJOBGroup() {
        return (String) get(PROPERTY_JOBGROUP);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_JOBGROUP
     * 
     */
    public void setJOBGroup(String jOBGroup) {
        set(PROPERTY_JOBGROUP, jOBGroup);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_JOBCLASSNAME
     * 
     */
    public String getJOBClassName() {
        return (String) get(PROPERTY_JOBCLASSNAME);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_JOBCLASSNAME
     * 
     */
    public void setJOBClassName(String jOBClassName) {
        set(PROPERTY_JOBCLASSNAME, jOBClassName);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_DURABLE
     * 
     */
    public String getDurable() {
        return (String) get(PROPERTY_DURABLE);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_DURABLE
     * 
     */
    public void setDurable(String durable) {
        set(PROPERTY_DURABLE, durable);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_NONCONCURRENT
     * 
     */
    public String getNonconcurrent() {
        return (String) get(PROPERTY_NONCONCURRENT);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_NONCONCURRENT
     * 
     */
    public void setNonconcurrent(String nonconcurrent) {
        set(PROPERTY_NONCONCURRENT, nonconcurrent);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_UPDATEDATA
     * 
     */
    public String getUpdateData() {
        return (String) get(PROPERTY_UPDATEDATA);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_UPDATEDATA
     * 
     */
    public void setUpdateData(String updateData) {
        set(PROPERTY_UPDATEDATA, updateData);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_REQUESTSRECOVERY
     * 
     */
    public String getRequestsRecovery() {
        return (String) get(PROPERTY_REQUESTSRECOVERY);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_REQUESTSRECOVERY
     * 
     */
    public void setRequestsRecovery(String requestsRecovery) {
        set(PROPERTY_REQUESTSRECOVERY, requestsRecovery);
    }

    /**
     * @see QuartzJobDetails#PROPERTY_JOBDATA
     * 
     */
    public byte[] getJOBData() {
        return (byte[]) get(PROPERTY_JOBDATA);
    }
    /**
     * @see QuartzJobDetails#PROPERTY_JOBDATA
     * 
     */
    public void setJOBData(byte[] jOBData) {
        set(PROPERTY_JOBDATA, jOBData);
    }

}
