
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

import java.math.BigDecimal;

import org.openbravo.base.structure.BaseOBObject;
/**
 * Entity class for entity OBSCHEDSimpropTriggers (stored in table obsched_simprop_triggers).
 * <br>
 * Help: {@literal Quartz properties of simple triggers}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class QuartzSimpropTriggers extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "obsched_simprop_triggers";
    public static final String ENTITY_NAME = "OBSCHEDSimpropTriggers";

    /**
     * Property id stored in column Obsched_Simprop_Triggers_ID in table obsched_simprop_triggers 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property schedName stored in column Sched_Name in table obsched_simprop_triggers<br>
     * Help: {@literal Quartz scheduler name. In non-clustered environment it's "NON-CLUSTERED".
     *       In a clustered
     *       environment it usually matches the machine.name of the cluster instance.}
     * 
     */
    public static final String PROPERTY_SCHEDNAME = "schedName";

    /**
     * Property triggerName stored in column Trigger_Name in table obsched_simprop_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERNAME = "triggerName";

    /**
     * Property triggerGroup stored in column Trigger_Group in table obsched_simprop_triggers 
     * 
     */
    public static final String PROPERTY_TRIGGERGROUP = "triggerGroup";

    /**
     * Property sTRProp1 stored in column STR_Prop_1 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_STRPROP1 = "sTRProp1";

    /**
     * Property sTRProp2 stored in column STR_Prop_2 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_STRPROP2 = "sTRProp2";

    /**
     * Property sTRProp3 stored in column STR_Prop_3 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_STRPROP3 = "sTRProp3";

    /**
     * Property iNTProp1 stored in column INT_Prop_1 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_INTPROP1 = "iNTProp1";

    /**
     * Property iNTProp2 stored in column INT_Prop_2 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_INTPROP2 = "iNTProp2";

    /**
     * Property longProp1 stored in column Long_Prop_1 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_LONGPROP1 = "longProp1";

    /**
     * Property longProp2 stored in column Long_Prop_2 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_LONGPROP2 = "longProp2";

    /**
     * Property dECProp1 stored in column DEC_Prop_1 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_DECPROP1 = "dECProp1";

    /**
     * Property dECProp2 stored in column DEC_Prop_2 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_DECPROP2 = "dECProp2";

    /**
     * Property boolProp1 stored in column Bool_Prop_1 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_BOOLPROP1 = "boolProp1";

    /**
     * Property boolProp2 stored in column Bool_Prop_2 in table obsched_simprop_triggers
     * 
     */
    public static final String PROPERTY_BOOLPROP2 = "boolProp2";


    public QuartzSimpropTriggers() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public String getSchedName() {
        return (String) get(PROPERTY_SCHEDNAME);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_SCHEDNAME
     * 
     */
    public void setSchedName(String schedName) {
        set(PROPERTY_SCHEDNAME, schedName);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public String getTriggerName() {
        return (String) get(PROPERTY_TRIGGERNAME);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_TRIGGERNAME
     * 
     */
    public void setTriggerName(String triggerName) {
        set(PROPERTY_TRIGGERNAME, triggerName);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public String getTriggerGroup() {
        return (String) get(PROPERTY_TRIGGERGROUP);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_TRIGGERGROUP
     * 
     */
    public void setTriggerGroup(String triggerGroup) {
        set(PROPERTY_TRIGGERGROUP, triggerGroup);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_STRPROP1
     * 
     */
    public String getSTRProp1() {
        return (String) get(PROPERTY_STRPROP1);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_STRPROP1
     * 
     */
    public void setSTRProp1(String sTRProp1) {
        set(PROPERTY_STRPROP1, sTRProp1);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_STRPROP2
     * 
     */
    public String getSTRProp2() {
        return (String) get(PROPERTY_STRPROP2);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_STRPROP2
     * 
     */
    public void setSTRProp2(String sTRProp2) {
        set(PROPERTY_STRPROP2, sTRProp2);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_STRPROP3
     * 
     */
    public String getSTRProp3() {
        return (String) get(PROPERTY_STRPROP3);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_STRPROP3
     * 
     */
    public void setSTRProp3(String sTRProp3) {
        set(PROPERTY_STRPROP3, sTRProp3);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_INTPROP1
     * 
     */
    public Long getINTProp1() {
        return (Long) get(PROPERTY_INTPROP1);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_INTPROP1
     * 
     */
    public void setINTProp1(Long iNTProp1) {
        set(PROPERTY_INTPROP1, iNTProp1);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_INTPROP2
     * 
     */
    public Long getINTProp2() {
        return (Long) get(PROPERTY_INTPROP2);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_INTPROP2
     * 
     */
    public void setINTProp2(Long iNTProp2) {
        set(PROPERTY_INTPROP2, iNTProp2);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_LONGPROP1
     * 
     */
    public Long getLongProp1() {
        return (Long) get(PROPERTY_LONGPROP1);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_LONGPROP1
     * 
     */
    public void setLongProp1(Long longProp1) {
        set(PROPERTY_LONGPROP1, longProp1);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_LONGPROP2
     * 
     */
    public Long getLongProp2() {
        return (Long) get(PROPERTY_LONGPROP2);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_LONGPROP2
     * 
     */
    public void setLongProp2(Long longProp2) {
        set(PROPERTY_LONGPROP2, longProp2);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_DECPROP1
     * 
     */
    public BigDecimal getDECProp1() {
        return (BigDecimal) get(PROPERTY_DECPROP1);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_DECPROP1
     * 
     */
    public void setDECProp1(BigDecimal dECProp1) {
        set(PROPERTY_DECPROP1, dECProp1);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_DECPROP2
     * 
     */
    public BigDecimal getDECProp2() {
        return (BigDecimal) get(PROPERTY_DECPROP2);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_DECPROP2
     * 
     */
    public void setDECProp2(BigDecimal dECProp2) {
        set(PROPERTY_DECPROP2, dECProp2);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_BOOLPROP1
     * 
     */
    public String getBoolProp1() {
        return (String) get(PROPERTY_BOOLPROP1);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_BOOLPROP1
     * 
     */
    public void setBoolProp1(String boolProp1) {
        set(PROPERTY_BOOLPROP1, boolProp1);
    }

    /**
     * @see QuartzSimpropTriggers#PROPERTY_BOOLPROP2
     * 
     */
    public String getBoolProp2() {
        return (String) get(PROPERTY_BOOLPROP2);
    }
    /**
     * @see QuartzSimpropTriggers#PROPERTY_BOOLPROP2
     * 
     */
    public void setBoolProp2(String boolProp2) {
        set(PROPERTY_BOOLPROP2, boolProp2);
    }

}
