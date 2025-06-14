
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
package org.openbravo.model.ad.process;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.BaseOBObject;
/**
 * Entity class for entity ADEPInstancePara (stored in table AD_EP_Instance_Para).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ADEPInstancePara extends BaseOBObject  {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_EP_Instance_Para";
    public static final String ENTITY_NAME = "ADEPInstancePara";

    /**
     * Property epInstance stored in column AD_Ep_Instance_ID in table AD_EP_Instance_Para 
     * 
     */
    public static final String PROPERTY_EPINSTANCE = "epInstance";

    /**
     * Property extensionPoints stored in column AD_Extension_Points_ID in table AD_EP_Instance_Para<br>
     * Help: {@literal A point in a stored procedure where it is possible to execute procedures of different
     *       modules}
     * 
     */
    public static final String PROPERTY_EXTENSIONPOINTS = "extensionPoints";

    /**
     * Property parameterName stored in column Parametername in table AD_EP_Instance_Para 
     * 
     */
    public static final String PROPERTY_PARAMETERNAME = "parameterName";

    /**
     * Property string stored in column P_String in table AD_EP_Instance_Para<br>
     * Help: {@literal String passed as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_STRING = "string";

    /**
     * Property stringTo stored in column P_String_To in table AD_EP_Instance_Para<br>
     * Help: {@literal String passed as maximum string range to a process instance.}
     * 
     */
    public static final String PROPERTY_STRINGTO = "stringTo";

    /**
     * Property processNumber stored in column P_Number in table AD_EP_Instance_Para<br>
     * Help: {@literal Number passed as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSNUMBER = "processNumber";

    /**
     * Property processNumberTo stored in column P_Number_To in table AD_EP_Instance_Para<br>
     * Help: {@literal Number passed as maximum range as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSNUMBERTO = "processNumberTo";

    /**
     * Property processDate stored in column P_Date in table AD_EP_Instance_Para<br>
     * Help: {@literal Date passed as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSDATE = "processDate";

    /**
     * Property processDateTo stored in column P_Date_To in table AD_EP_Instance_Para<br>
     * Help: {@literal Date passed as maximum date as parameter to a process instance.}
     * 
     */
    public static final String PROPERTY_PROCESSDATETO = "processDateTo";

    /**
     * Property text stored in column P_Text in table AD_EP_Instance_Para
     * 
     */
    public static final String PROPERTY_TEXT = "text";

    /**
     * Property id stored in column AD_Ep_Instance_Para_ID in table AD_EP_Instance_Para 
     * 
     */
    public static final String PROPERTY_ID = "id";


    public ADEPInstancePara() {
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ADEPInstancePara#PROPERTY_EPINSTANCE
     * 
     */
    public String getEpInstance() {
        return (String) get(PROPERTY_EPINSTANCE);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_EPINSTANCE
     * 
     */
    public void setEpInstance(String epInstance) {
        set(PROPERTY_EPINSTANCE, epInstance);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_EXTENSIONPOINTS
     * 
     */
    public ExtensionPoints getExtensionPoints() {
        return (ExtensionPoints) get(PROPERTY_EXTENSIONPOINTS);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_EXTENSIONPOINTS
     * 
     */
    public void setExtensionPoints(ExtensionPoints extensionPoints) {
        set(PROPERTY_EXTENSIONPOINTS, extensionPoints);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_PARAMETERNAME
     * 
     */
    public String getParameterName() {
        return (String) get(PROPERTY_PARAMETERNAME);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_PARAMETERNAME
     * 
     */
    public void setParameterName(String parameterName) {
        set(PROPERTY_PARAMETERNAME, parameterName);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_STRING
     * 
     */
    public String getString() {
        return (String) get(PROPERTY_STRING);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_STRING
     * 
     */
    public void setString(String string) {
        set(PROPERTY_STRING, string);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_STRINGTO
     * 
     */
    public String getStringTo() {
        return (String) get(PROPERTY_STRINGTO);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_STRINGTO
     * 
     */
    public void setStringTo(String stringTo) {
        set(PROPERTY_STRINGTO, stringTo);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSNUMBER
     * 
     */
    public BigDecimal getProcessNumber() {
        return (BigDecimal) get(PROPERTY_PROCESSNUMBER);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSNUMBER
     * 
     */
    public void setProcessNumber(BigDecimal processNumber) {
        set(PROPERTY_PROCESSNUMBER, processNumber);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSNUMBERTO
     * 
     */
    public BigDecimal getProcessNumberTo() {
        return (BigDecimal) get(PROPERTY_PROCESSNUMBERTO);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSNUMBERTO
     * 
     */
    public void setProcessNumberTo(BigDecimal processNumberTo) {
        set(PROPERTY_PROCESSNUMBERTO, processNumberTo);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSDATE
     * 
     */
    public Date getProcessDate() {
        return (Date) get(PROPERTY_PROCESSDATE);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSDATE
     * 
     */
    public void setProcessDate(Date processDate) {
        set(PROPERTY_PROCESSDATE, processDate);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSDATETO
     * 
     */
    public Date getProcessDateTo() {
        return (Date) get(PROPERTY_PROCESSDATETO);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_PROCESSDATETO
     * 
     */
    public void setProcessDateTo(Date processDateTo) {
        set(PROPERTY_PROCESSDATETO, processDateTo);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_TEXT
     * 
     */
    public String getText() {
        return (String) get(PROPERTY_TEXT);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_TEXT
     * 
     */
    public void setText(String text) {
        set(PROPERTY_TEXT, text);
    }

    /**
     * @see ADEPInstancePara#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ADEPInstancePara#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

}
