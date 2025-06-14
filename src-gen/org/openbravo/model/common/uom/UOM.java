
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
import org.openbravo.model.common.order.OrderLine;
/**
 * Entity class for entity UOM (stored in table C_UOM).
 * <br>
 * Help: {@literal Unit of Measure defines a non monetary Unit of Measure.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class UOM extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_UOM";
    public static final String ENTITY_NAME = "UOM";

    /**
     * Property id stored in column C_UOM_ID in table C_UOM<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_UOM 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_UOM 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_UOM 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_UOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property updated stored in column Updated in table C_UOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property createdBy stored in column CreatedBy in table C_UOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_UOM 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property eDICode stored in column X12DE355 in table C_UOM<br>
     * Help: {@literal The Unit of Measure Code indicates the EDI X12 Code Data Element 355 (Unit or Basis for
     *       Measurement)}
     * 
     */
    public static final String PROPERTY_EDICODE = "eDICode";

    /**
     * Property symbol stored in column UOMSymbol in table C_UOM<br>
     * Help: {@literal The Symbol identifies the Symbol to be displayed and printed for a Unit of Measure}
     * 
     */
    public static final String PROPERTY_SYMBOL = "symbol";

    /**
     * Property name stored in column Name in table C_UOM 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_UOM<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property standardPrecision stored in column StdPrecision in table C_UOM<br>
     * Help: {@literal The Standard Precision defines the number of decimal places that amounts will be rounded
     *       to for accounting transactions and documents.}
     * 
     */
    public static final String PROPERTY_STANDARDPRECISION = "standardPrecision";

    /**
     * Property costingPrecision stored in column CostingPrecision in table C_UOM<br>
     * Help: {@literal The Costing Precision defines the number of decimal places that amounts will be rounded to
     *       when performing costing calculations.}
     * 
     */
    public static final String PROPERTY_COSTINGPRECISION = "costingPrecision";

    /**
     * Property default stored in column IsDefault in table C_UOM<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property breakdown stored in column Breakdown in table C_UOM<br>
     * Help: {@literal Indicates if the line order in that unit of mesaure has to be breaken down on the shipment
     *       document. E.g. If you order 8 rolls, the shipment document must show eight lines of 1 roll}
     * 
     */
    public static final String PROPERTY_BREAKDOWN = "breakdown";

    /**
     * Property uOMType stored in column UOM_Type in table C_UOM
     * 
     */
    public static final String PROPERTY_UOMTYPE = "uOMType";

    /**
     * Property useinproduction stored in column Useinproduction in table C_UOM<br>
     * Help: {@literal Flag for standard precision to be used in production run process.}
     * 
     */
    public static final String PROPERTY_USEINPRODUCTION = "useinproduction";

    /**
     * Property orderLineList stored in table C_UOM
     * 
     */
    public static final String PROPERTY_ORDERLINELIST = "orderLineList";

    /**
     * Property uOMConversionList stored in table C_UOM
     * 
     */
    public static final String PROPERTY_UOMCONVERSIONLIST = "uOMConversionList";

    /**
     * Property uOMTrlList stored in table C_UOM
     * 
     */
    public static final String PROPERTY_UOMTRLLIST = "uOMTrlList";


    public UOM() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_BREAKDOWN, false);
        setDefaultValue(PROPERTY_USEINPRODUCTION, false);
        setDefaultValue(PROPERTY_ORDERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_UOMCONVERSIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_UOMTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see UOM#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see UOM#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see UOM#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see UOM#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see UOM#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see UOM#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see UOM#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see UOM#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see UOM#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see UOM#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see UOM#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see UOM#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see UOM#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see UOM#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see UOM#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see UOM#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see UOM#PROPERTY_EDICODE
     * 
     */
    public String getEDICode() {
        return (String) get(PROPERTY_EDICODE);
    }
    /**
     * @see UOM#PROPERTY_EDICODE
     * 
     */
    public void setEDICode(String eDICode) {
        set(PROPERTY_EDICODE, eDICode);
    }

    /**
     * @see UOM#PROPERTY_SYMBOL
     * 
     */
    public String getSymbol() {
        return (String) get(PROPERTY_SYMBOL);
    }
    /**
     * @see UOM#PROPERTY_SYMBOL
     * 
     */
    public void setSymbol(String symbol) {
        set(PROPERTY_SYMBOL, symbol);
    }

    /**
     * @see UOM#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see UOM#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see UOM#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see UOM#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see UOM#PROPERTY_STANDARDPRECISION
     * 
     */
    public Long getStandardPrecision() {
        return (Long) get(PROPERTY_STANDARDPRECISION);
    }
    /**
     * @see UOM#PROPERTY_STANDARDPRECISION
     * 
     */
    public void setStandardPrecision(Long standardPrecision) {
        set(PROPERTY_STANDARDPRECISION, standardPrecision);
    }

    /**
     * @see UOM#PROPERTY_COSTINGPRECISION
     * 
     */
    public Long getCostingPrecision() {
        return (Long) get(PROPERTY_COSTINGPRECISION);
    }
    /**
     * @see UOM#PROPERTY_COSTINGPRECISION
     * 
     */
    public void setCostingPrecision(Long costingPrecision) {
        set(PROPERTY_COSTINGPRECISION, costingPrecision);
    }

    /**
     * @see UOM#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see UOM#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see UOM#PROPERTY_BREAKDOWN
     * 
     */
    public Boolean isBreakdown() {
        return (Boolean) get(PROPERTY_BREAKDOWN);
    }
    /**
     * @see UOM#PROPERTY_BREAKDOWN
     * 
     */
    public void setBreakdown(Boolean breakdown) {
        set(PROPERTY_BREAKDOWN, breakdown);
    }

    /**
     * @see UOM#PROPERTY_UOMTYPE
     * 
     */
    public String getUOMType() {
        return (String) get(PROPERTY_UOMTYPE);
    }
    /**
     * @see UOM#PROPERTY_UOMTYPE
     * 
     */
    public void setUOMType(String uOMType) {
        set(PROPERTY_UOMTYPE, uOMType);
    }

    /**
     * @see UOM#PROPERTY_USEINPRODUCTION
     * 
     */
    public Boolean isUseinproduction() {
        return (Boolean) get(PROPERTY_USEINPRODUCTION);
    }
    /**
     * @see UOM#PROPERTY_USEINPRODUCTION
     * 
     */
    public void setUseinproduction(Boolean useinproduction) {
        set(PROPERTY_USEINPRODUCTION, useinproduction);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineList(List<OrderLine> orderLineList) {
        set(PROPERTY_ORDERLINELIST, orderLineList);
    }

    /**
     * Help: {@literal The Conversion defines the rates for converting a Unit of Measure. The system provides
     *       some automatic conversions between units of measures (e.g. minute, hour, day, working day, etc.) if
     *       they are not explicitly defined here. Conversions need to be dir}<br>
     * @see UOMConversion
     * 
     */
    @SuppressWarnings("unchecked")
    public List<UOMConversion> getUOMConversionList() {
      return (List<UOMConversion>) get(PROPERTY_UOMCONVERSIONLIST);
    }

    /**
     * Help: {@literal The Conversion defines the rates for converting a Unit of Measure. The system provides
     *       some automatic conversions between units of measures (e.g. minute, hour, day, working day, etc.) if
     *       they are not explicitly defined here. Conversions need to be dir}<br>
     * @see UOMConversion
     * 
     */
    public void setUOMConversionList(List<UOMConversion> uOMConversionList) {
        set(PROPERTY_UOMCONVERSIONLIST, uOMConversionList);
    }

    /**
     * Help: {@literal Unit of Measure translations to different languages}<br>
     * @see UOMTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<UOMTrl> getUOMTrlList() {
      return (List<UOMTrl>) get(PROPERTY_UOMTRLLIST);
    }

    /**
     * Help: {@literal Unit of Measure translations to different languages}<br>
     * @see UOMTrl
     * 
     */
    public void setUOMTrlList(List<UOMTrl> uOMTrlList) {
        set(PROPERTY_UOMTRLLIST, uOMTrlList);
    }

}
