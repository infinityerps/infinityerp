
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

import org.openbravo.base.structure.BaseOBObject;
/**
 * Entity class for entity ProcessPlanTotalized (stored in table MA_ProcessPlan_Tot_Aux).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessPlanTotalizedAux extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_ProcessPlan_Tot_Aux";
    public static final String ENTITY_NAME = "ProcessPlanTotalized";

    /**
     * Property processPlan stored in column MA_Processplan_ID in table MA_ProcessPlan_Tot_Aux<br>
     * Help: {@literal Indicates a process plan.}
     * 
     */
    public static final String PROPERTY_PROCESSPLAN = "processPlan";

    /**
     * Property processPlanVersion stored in column MA_Processplan_Version_ID in table MA_ProcessPlan_Tot_Aux<br>
     * Help: {@literal Indicates a process plan version.}
     * 
     */
    public static final String PROPERTY_PROCESSPLANVERSION = "processPlanVersion";

    /**
     * Property produced stored in column Produced in table MA_ProcessPlan_Tot_Aux 
     * 
     */
    public static final String PROPERTY_PRODUCED = "produced";

    /**
     * Property proqty stored in column Proqty in table MA_ProcessPlan_Tot_Aux 
     * 
     */
    public static final String PROPERTY_PROQTY = "proqty";

    /**
     * Property dependantproduct stored in column Dependantproduct in table MA_ProcessPlan_Tot_Aux 
     * 
     */
    public static final String PROPERTY_DEPENDANTPRODUCT = "dependantproduct";

    /**
     * Property depqty stored in column Depqty in table MA_ProcessPlan_Tot_Aux 
     * 
     */
    public static final String PROPERTY_DEPQTY = "depqty";

    /**
     * Property id stored in column MA_Processplan_Tot_Aux_ID in table MA_ProcessPlan_Tot_Aux 
     * 
     */
    public static final String PROPERTY_ID = "id";


    public ProcessPlanTotalizedAux() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PROCESSPLAN
     * 
     */
    public ProcessPlan getProcessPlan() {
        return (ProcessPlan) get(PROPERTY_PROCESSPLAN);
    }
    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PROCESSPLAN
     * 
     */
    public void setProcessPlan(ProcessPlan processPlan) {
        set(PROPERTY_PROCESSPLAN, processPlan);
    }

    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PROCESSPLANVERSION
     * 
     */
    public Version getProcessPlanVersion() {
        return (Version) get(PROPERTY_PROCESSPLANVERSION);
    }
    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PROCESSPLANVERSION
     * 
     */
    public void setProcessPlanVersion(Version processPlanVersion) {
        set(PROPERTY_PROCESSPLANVERSION, processPlanVersion);
    }

    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PRODUCED
     * 
     */
    public String getProduced() {
        return (String) get(PROPERTY_PRODUCED);
    }
    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PRODUCED
     * 
     */
    public void setProduced(String produced) {
        set(PROPERTY_PRODUCED, produced);
    }

    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PROQTY
     * 
     */
    public BigDecimal getProqty() {
        return (BigDecimal) get(PROPERTY_PROQTY);
    }
    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_PROQTY
     * 
     */
    public void setProqty(BigDecimal proqty) {
        set(PROPERTY_PROQTY, proqty);
    }

    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_DEPENDANTPRODUCT
     * 
     */
    public String getDependantproduct() {
        return (String) get(PROPERTY_DEPENDANTPRODUCT);
    }
    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_DEPENDANTPRODUCT
     * 
     */
    public void setDependantproduct(String dependantproduct) {
        set(PROPERTY_DEPENDANTPRODUCT, dependantproduct);
    }

    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_DEPQTY
     * 
     */
    public BigDecimal getDepqty() {
        return (BigDecimal) get(PROPERTY_DEPQTY);
    }
    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_DEPQTY
     * 
     */
    public void setDepqty(BigDecimal depqty) {
        set(PROPERTY_DEPQTY, depqty);
    }

    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessPlanTotalizedAux#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

}
