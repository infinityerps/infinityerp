
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
 * Entity class for entity OBSCHEDBlobTriggers (stored in table obsched_blob_triggers).
 * <br>
 * Help: {@literal Quartz serialized data available to triggers}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzBlobTriggers extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_blob_triggers";
    public static final String ENTITY_NAME = "OBSCHEDBlobTriggers";

    /**
     * Property id stored in column Obsched_Blob_Triggers_ID in table obsched_blob_triggers 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_blob_triggers<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property triggerName stored in column Trigger_Name in table obsched_blob_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERNAME = "triggerName";

    /**
     * Property triggerGroup stored in column Trigger_Group in table obsched_blob_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERGROUP = "triggerGroup";

    /**
     * Property blobData stored in column Blob_Data in table obsched_blob_triggers<br>
     * Help: {@literal Serialized blob data for background job/process execution.}
     * 
     */
    public static final String PROPERTY_BLOBDATA = "blobData";


    public QuartzBlobTriggers() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzBlobTriggers#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzBlobTriggers#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzBlobTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzBlobTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzBlobTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public String getTriggerName() {
        return (String) get(PROPERTY_TRIGGERNAME);
    }
    /**
     * @see QuartzBlobTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public void setTriggerName(String triggerName) {
        set(PROPERTY_TRIGGERNAME, triggerName);
    }

    /**
     * @see QuartzBlobTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public String getTriggerGroup() {
        return (String) get(PROPERTY_TRIGGERGROUP);
    }
    /**
     * @see QuartzBlobTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public void setTriggerGroup(String triggerGroup) {
        set(PROPERTY_TRIGGERGROUP, triggerGroup);
    }

    /**
     * @see QuartzBlobTriggers#PROPERTY_BLOBDATA
     * 
     */
    public byte[] getBlobData() {
        return (byte[]) get(PROPERTY_BLOBDATA);
    }
    /**
     * @see QuartzBlobTriggers#PROPERTY_BLOBDATA
     * 
     */
    public void setBlobData(byte[] blobData) {
        set(PROPERTY_BLOBDATA, blobData);
    }

}
