
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
package org.openbravo.model.common.uom;

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
 * Entity class for entity UOMConversion (stored in table C_UOM_Conversion).
 * <br>
 * Help: {@literal The Conversion defines the rates for converting a Unit of Measure. The system provides
     *       some automatic conversions between units of measures (e.g. minute, hour, day, working day, etc.) if
     *       they are not explicitly defined here. Conversions need to be dir}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class UOMConversion extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_UOM_Conversion";
    public static final String ENTITY_NAME = "UOMConversion";

    /**
     * Property id stored in column C_UOM_Conversion_ID in table C_UOM_Conversion 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_UOM_Conversion 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_UOM_Conversion 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_UOM_Conversion 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_UOM_Conversion 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_UOM_Conversion 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_UOM_Conversion 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_UOM_Conversion 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property uOM stored in column C_UOM_ID in table C_UOM_Conversion<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property toUOM stored in column C_UOM_To_ID in table C_UOM_Conversion<br>
     * Help: {@literal The UOM To indicates the destination UOM for a UOM Conversion pair.}
     * 
     */
    public static final String PROPERTY_TOUOM = "toUOM";

    /**
     * Property multipleRateBy stored in column MultiplyRate in table C_UOM_Conversion<br>
     * Help: {@literal To convert Source number to Target number, the Source is multiplied by the multiply rate. 
     *       If the Multiply Rate is entered, then the Divide Rate will be automatically calculated.}
     * 
     */
    public static final String PROPERTY_MULTIPLERATEBY = "multipleRateBy";

    /**
     * Property divideRateBy stored in column DivideRate in table C_UOM_Conversion<br>
     * Help: {@literal To convert Source number to Target number, the Source is divided by the divide rate.  If
     *       you enter a Divide Rate, the Multiply Rate will be automatically calculated.}
     * 
     */
    public static final String PROPERTY_DIVIDERATEBY = "divideRateBy";


    public UOMConversion() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see UOMConversion#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see UOMConversion#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see UOMConversion#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see UOMConversion#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see UOMConversion#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see UOMConversion#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see UOMConversion#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see UOMConversion#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see UOMConversion#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see UOMConversion#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see UOMConversion#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see UOMConversion#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see UOMConversion#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see UOMConversion#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see UOMConversion#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see UOMConversion#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see UOMConversion#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see UOMConversion#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see UOMConversion#PROPERTY_TOUOM
     * 
     */
    public UOM getToUOM() {
        return (UOM) get(PROPERTY_TOUOM);
    }
    /**
     * @see UOMConversion#PROPERTY_TOUOM
     * 
     */
    public void setToUOM(UOM toUOM) {
        set(PROPERTY_TOUOM, toUOM);
    }

    /**
     * @see UOMConversion#PROPERTY_MULTIPLERATEBY
     * 
     */
    public BigDecimal getMultipleRateBy() {
        return (BigDecimal) get(PROPERTY_MULTIPLERATEBY);
    }
    /**
     * @see UOMConversion#PROPERTY_MULTIPLERATEBY
     * 
     */
    public void setMultipleRateBy(BigDecimal multipleRateBy) {
        set(PROPERTY_MULTIPLERATEBY, multipleRateBy);
    }

    /**
     * @see UOMConversion#PROPERTY_DIVIDERATEBY
     * 
     */
    public BigDecimal getDivideRateBy() {
        return (BigDecimal) get(PROPERTY_DIVIDERATEBY);
    }
    /**
     * @see UOMConversion#PROPERTY_DIVIDERATEBY
     * 
     */
    public void setDivideRateBy(BigDecimal divideRateBy) {
        set(PROPERTY_DIVIDERATEBY, divideRateBy);
    }

}
