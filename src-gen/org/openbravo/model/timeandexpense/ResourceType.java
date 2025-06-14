
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
package org.openbravo.model.timeandexpense;

import java.math.BigDecimal;
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
import org.openbravo.model.common.plm.ProductCategory;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.tax.TaxCategory;
/**
 * Entity class for entity ResourceType (stored in table S_ResourceType).
 * <br>
 * Help: {@literal Maintain Resource types and their principal availability.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ResourceType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "S_ResourceType";
    public static final String ENTITY_NAME = "ResourceType";

    /**
     * Property id stored in column S_ResourceType_ID in table S_ResourceType
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table S_ResourceType 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table S_ResourceType 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table S_ResourceType 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table S_ResourceType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table S_ResourceType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table S_ResourceType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table S_ResourceType 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table S_ResourceType<br>
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
     * Property name stored in column Name in table S_ResourceType 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table S_ResourceType<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property singleAssignmentOnly stored in column IsSingleAssignment in table S_ResourceType<br>
     * Help: {@literal If selected, you can only have one assignment for the resource at a single point in time. 
     *        It is also  not possible to have overlapping assignments.}
     * 
     */
    public static final String PROPERTY_SINGLEASSIGNMENTONLY = "singleAssignmentOnly";

    /**
     * Property uOM stored in column C_UOM_ID in table S_ResourceType<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property allowUoMFractions stored in column AllowUoMFractions in table S_ResourceType<br>
     * Help: {@literal If allowed, you can enter UoM Fractions}
     * 
     */
    public static final String PROPERTY_ALLOWUOMFRACTIONS = "allowUoMFractions";

    /**
     * Property slotStart stored in column TimeSlotStart in table S_ResourceType<br>
     * Help: {@literal Starting time for time slots}
     * 
     */
    public static final String PROPERTY_SLOTSTART = "slotStart";

    /**
     * Property slotEnd stored in column TimeSlotEnd in table S_ResourceType<br>
     * Help: {@literal Ending time for time slots}
     * 
     */
    public static final String PROPERTY_SLOTEND = "slotEnd";

    /**
     * Property timeSlot stored in column IsTimeSlot in table S_ResourceType<br>
     * Help: {@literal Resource is only available at certain times}
     * 
     */
    public static final String PROPERTY_TIMESLOT = "timeSlot";

    /**
     * Property daySlot stored in column IsDateSlot in table S_ResourceType<br>
     * Help: {@literal Resource is only available on certain days}
     * 
     */
    public static final String PROPERTY_DAYSLOT = "daySlot";

    /**
     * Property sunday stored in column OnSunday in table S_ResourceType<br>
     * Help: {@literal Available on Sundays}
     * 
     */
    public static final String PROPERTY_SUNDAY = "sunday";

    /**
     * Property monday stored in column OnMonday in table S_ResourceType<br>
     * Help: {@literal Available on Mondays}
     * 
     */
    public static final String PROPERTY_MONDAY = "monday";

    /**
     * Property tuesday stored in column OnTuesday in table S_ResourceType<br>
     * Help: {@literal Available on Tuesdays}
     * 
     */
    public static final String PROPERTY_TUESDAY = "tuesday";

    /**
     * Property wednesday stored in column OnWednesday in table S_ResourceType<br>
     * Help: {@literal Available on Wednesdays}
     * 
     */
    public static final String PROPERTY_WEDNESDAY = "wednesday";

    /**
     * Property thursday stored in column OnThursday in table S_ResourceType<br>
     * Help: {@literal Available on Thursdays}
     * 
     */
    public static final String PROPERTY_THURSDAY = "thursday";

    /**
     * Property friday stored in column OnFriday in table S_ResourceType<br>
     * Help: {@literal Available on Fridays}
     * 
     */
    public static final String PROPERTY_FRIDAY = "friday";

    /**
     * Property saturday stored in column OnSaturday in table S_ResourceType<br>
     * Help: {@literal Available on Saturday}
     * 
     */
    public static final String PROPERTY_SATURDAY = "saturday";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table S_ResourceType<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property taxCategory stored in column C_TaxCategory_ID in table S_ResourceType<br>
     * Help: {@literal The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or
     *       Value Added Tax.}
     * 
     */
    public static final String PROPERTY_TAXCATEGORY = "taxCategory";

    /**
     * Property chargeableQuantity stored in column ChargeableQty in table S_ResourceType
     * 
     */
    public static final String PROPERTY_CHARGEABLEQUANTITY = "chargeableQuantity";


    public ResourceType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SINGLEASSIGNMENTONLY, false);
        setDefaultValue(PROPERTY_ALLOWUOMFRACTIONS, false);
        setDefaultValue(PROPERTY_TIMESLOT, false);
        setDefaultValue(PROPERTY_DAYSLOT, false);
        setDefaultValue(PROPERTY_SUNDAY, false);
        setDefaultValue(PROPERTY_MONDAY, true);
        setDefaultValue(PROPERTY_TUESDAY, true);
        setDefaultValue(PROPERTY_WEDNESDAY, true);
        setDefaultValue(PROPERTY_THURSDAY, true);
        setDefaultValue(PROPERTY_FRIDAY, true);
        setDefaultValue(PROPERTY_SATURDAY, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ResourceType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ResourceType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ResourceType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ResourceType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ResourceType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ResourceType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ResourceType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ResourceType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ResourceType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ResourceType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ResourceType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ResourceType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ResourceType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ResourceType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ResourceType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ResourceType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ResourceType#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ResourceType#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ResourceType#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ResourceType#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ResourceType#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ResourceType#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ResourceType#PROPERTY_SINGLEASSIGNMENTONLY
     * 
     */
    public Boolean isSingleAssignmentOnly() {
        return (Boolean) get(PROPERTY_SINGLEASSIGNMENTONLY);
    }
    /**
     * @see ResourceType#PROPERTY_SINGLEASSIGNMENTONLY
     * 
     */
    public void setSingleAssignmentOnly(Boolean singleAssignmentOnly) {
        set(PROPERTY_SINGLEASSIGNMENTONLY, singleAssignmentOnly);
    }

    /**
     * @see ResourceType#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see ResourceType#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see ResourceType#PROPERTY_ALLOWUOMFRACTIONS
     * 
     */
    public Boolean isAllowUoMFractions() {
        return (Boolean) get(PROPERTY_ALLOWUOMFRACTIONS);
    }
    /**
     * @see ResourceType#PROPERTY_ALLOWUOMFRACTIONS
     * 
     */
    public void setAllowUoMFractions(Boolean allowUoMFractions) {
        set(PROPERTY_ALLOWUOMFRACTIONS, allowUoMFractions);
    }

    /**
     * @see ResourceType#PROPERTY_SLOTSTART
     * 
     */
    public Timestamp getSlotStart() {
        return (Timestamp) get(PROPERTY_SLOTSTART);
    }
    /**
     * @see ResourceType#PROPERTY_SLOTSTART
     * 
     */
    public void setSlotStart(Timestamp slotStart) {
        set(PROPERTY_SLOTSTART, slotStart);
    }

    /**
     * @see ResourceType#PROPERTY_SLOTEND
     * 
     */
    public Timestamp getSlotEnd() {
        return (Timestamp) get(PROPERTY_SLOTEND);
    }
    /**
     * @see ResourceType#PROPERTY_SLOTEND
     * 
     */
    public void setSlotEnd(Timestamp slotEnd) {
        set(PROPERTY_SLOTEND, slotEnd);
    }

    /**
     * @see ResourceType#PROPERTY_TIMESLOT
     * 
     */
    public Boolean isTimeSlot() {
        return (Boolean) get(PROPERTY_TIMESLOT);
    }
    /**
     * @see ResourceType#PROPERTY_TIMESLOT
     * 
     */
    public void setTimeSlot(Boolean timeSlot) {
        set(PROPERTY_TIMESLOT, timeSlot);
    }

    /**
     * @see ResourceType#PROPERTY_DAYSLOT
     * 
     */
    public Boolean isDaySlot() {
        return (Boolean) get(PROPERTY_DAYSLOT);
    }
    /**
     * @see ResourceType#PROPERTY_DAYSLOT
     * 
     */
    public void setDaySlot(Boolean daySlot) {
        set(PROPERTY_DAYSLOT, daySlot);
    }

    /**
     * @see ResourceType#PROPERTY_SUNDAY
     * 
     */
    public Boolean isSunday() {
        return (Boolean) get(PROPERTY_SUNDAY);
    }
    /**
     * @see ResourceType#PROPERTY_SUNDAY
     * 
     */
    public void setSunday(Boolean sunday) {
        set(PROPERTY_SUNDAY, sunday);
    }

    /**
     * @see ResourceType#PROPERTY_MONDAY
     * 
     */
    public Boolean isMonday() {
        return (Boolean) get(PROPERTY_MONDAY);
    }
    /**
     * @see ResourceType#PROPERTY_MONDAY
     * 
     */
    public void setMonday(Boolean monday) {
        set(PROPERTY_MONDAY, monday);
    }

    /**
     * @see ResourceType#PROPERTY_TUESDAY
     * 
     */
    public Boolean isTuesday() {
        return (Boolean) get(PROPERTY_TUESDAY);
    }
    /**
     * @see ResourceType#PROPERTY_TUESDAY
     * 
     */
    public void setTuesday(Boolean tuesday) {
        set(PROPERTY_TUESDAY, tuesday);
    }

    /**
     * @see ResourceType#PROPERTY_WEDNESDAY
     * 
     */
    public Boolean isWednesday() {
        return (Boolean) get(PROPERTY_WEDNESDAY);
    }
    /**
     * @see ResourceType#PROPERTY_WEDNESDAY
     * 
     */
    public void setWednesday(Boolean wednesday) {
        set(PROPERTY_WEDNESDAY, wednesday);
    }

    /**
     * @see ResourceType#PROPERTY_THURSDAY
     * 
     */
    public Boolean isThursday() {
        return (Boolean) get(PROPERTY_THURSDAY);
    }
    /**
     * @see ResourceType#PROPERTY_THURSDAY
     * 
     */
    public void setThursday(Boolean thursday) {
        set(PROPERTY_THURSDAY, thursday);
    }

    /**
     * @see ResourceType#PROPERTY_FRIDAY
     * 
     */
    public Boolean isFriday() {
        return (Boolean) get(PROPERTY_FRIDAY);
    }
    /**
     * @see ResourceType#PROPERTY_FRIDAY
     * 
     */
    public void setFriday(Boolean friday) {
        set(PROPERTY_FRIDAY, friday);
    }

    /**
     * @see ResourceType#PROPERTY_SATURDAY
     * 
     */
    public Boolean isSaturday() {
        return (Boolean) get(PROPERTY_SATURDAY);
    }
    /**
     * @see ResourceType#PROPERTY_SATURDAY
     * 
     */
    public void setSaturday(Boolean saturday) {
        set(PROPERTY_SATURDAY, saturday);
    }

    /**
     * @see ResourceType#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see ResourceType#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see ResourceType#PROPERTY_TAXCATEGORY
     * 
     */
    public TaxCategory getTaxCategory() {
        return (TaxCategory) get(PROPERTY_TAXCATEGORY);
    }
    /**
     * @see ResourceType#PROPERTY_TAXCATEGORY
     * 
     */
    public void setTaxCategory(TaxCategory taxCategory) {
        set(PROPERTY_TAXCATEGORY, taxCategory);
    }

    /**
     * @see ResourceType#PROPERTY_CHARGEABLEQUANTITY
     * 
     */
    public BigDecimal getChargeableQuantity() {
        return (BigDecimal) get(PROPERTY_CHARGEABLEQUANTITY);
    }
    /**
     * @see ResourceType#PROPERTY_CHARGEABLEQUANTITY
     * 
     */
    public void setChargeableQuantity(BigDecimal chargeableQuantity) {
        set(PROPERTY_CHARGEABLEQUANTITY, chargeableQuantity);
    }

}
