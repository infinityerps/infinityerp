
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
package org.openbravo.model.common.invoice;

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
 * Entity class for entity InvoiceSchedule (stored in table C_InvoiceSchedule).
 * <br>
 * Help: {@literal The Invoice Schedule Tab defines the frequency for which batch invoices will be generated
     *       for a Business Partner.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class InvoiceSchedule extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_InvoiceSchedule";
    public static final String ENTITY_NAME = "InvoiceSchedule";

    /**
     * Property id stored in column C_InvoiceSchedule_ID in table C_InvoiceSchedule<br>
     * Help: {@literal The Invoice Schedule identifies the frequency used when generating invoices.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_InvoiceSchedule 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_InvoiceSchedule 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_InvoiceSchedule 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_InvoiceSchedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_InvoiceSchedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_InvoiceSchedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_InvoiceSchedule 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_InvoiceSchedule 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_InvoiceSchedule<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property limitAmount stored in column IsAmount in table C_InvoiceSchedule<br>
     * Help: {@literal The Amount Limit checkbox indicates if invoices will be sent out if they are below the
     *       entered limit.}
     * 
     */
    public static final String PROPERTY_LIMITAMOUNT = "limitAmount";

    /**
     * Property amount stored in column Amt in table C_InvoiceSchedule<br>
     * Help: {@literal Amount}
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property invoiceFrequency stored in column InvoiceFrequency in table C_InvoiceSchedule<br>
     * Help: {@literal The Invoice Frequency indicates the frequency of invoice generation for a Business
     *       Partner.}
     * 
     */
    public static final String PROPERTY_INVOICEFREQUENCY = "invoiceFrequency";

    /**
     * Property dayOfTheWeek stored in column InvoiceWeekDay in table C_InvoiceSchedule<br>
     * Help: {@literal The Invoice Week Day indicates the day of the week to generate invoices.}
     * 
     */
    public static final String PROPERTY_DAYOFTHEWEEK = "dayOfTheWeek";

    /**
     * Property dayOfTheWeekCutoff stored in column InvoiceWeekDayCutoff in table C_InvoiceSchedule<br>
     * Help: {@literal The Invoice Week Day Cutoff indicates the last day of the week a shipment must be made to
     *       be included in the invoice schedule.}
     * 
     */
    public static final String PROPERTY_DAYOFTHEWEEKCUTOFF = "dayOfTheWeekCutoff";

    /**
     * Property invoiceOnEvenWeeks stored in column EvenInvoiceWeek in table C_InvoiceSchedule<br>
     * Help: {@literal The Invoice on Even Weeks checkbox indicates if biweekly invoices should be sent on even
     *       week numbers.}
     * 
     */
    public static final String PROPERTY_INVOICEONEVENWEEKS = "invoiceOnEvenWeeks";

    /**
     * Property dayOfTheMonth stored in column InvoiceDay in table C_InvoiceSchedule<br>
     * Help: {@literal The Invoice Day indicates the day of invoice generation.  If twice monthly, the second
     *       time is 15 days after this day.}
     * 
     */
    public static final String PROPERTY_DAYOFTHEMONTH = "dayOfTheMonth";

    /**
     * Property invoiceCutOffDay stored in column InvoiceDayCutoff in table C_InvoiceSchedule<br>
     * Help: {@literal The Invoice Day Cut Off indicates the last day for shipments to be included in the current
     *       invoice schedule.  For example, if the invoice schedule is defined for the first day of the month,
     *       the cut off day may be the 25th of the month.  An shipment on the 24th of May would be included in
     *       the invoices sent on June 1st but a shipment on the 26th would be included in the invoices sent on
     *       July 1st.}
     * 
     */
    public static final String PROPERTY_INVOICECUTOFFDAY = "invoiceCutOffDay";

    /**
     * Property default stored in column IsDefault in table C_InvoiceSchedule<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";


    public InvoiceSchedule() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_LIMITAMOUNT, false);
        setDefaultValue(PROPERTY_INVOICEONEVENWEEKS, false);
        setDefaultValue(PROPERTY_DAYOFTHEMONTH, (long) 1);
        setDefaultValue(PROPERTY_DEFAULT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see InvoiceSchedule#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_LIMITAMOUNT
     * 
     */
    public Boolean isLimitAmount() {
        return (Boolean) get(PROPERTY_LIMITAMOUNT);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_LIMITAMOUNT
     * 
     */
    public void setLimitAmount(Boolean limitAmount) {
        set(PROPERTY_LIMITAMOUNT, limitAmount);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_INVOICEFREQUENCY
     * 
     */
    public String getInvoiceFrequency() {
        return (String) get(PROPERTY_INVOICEFREQUENCY);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_INVOICEFREQUENCY
     * 
     */
    public void setInvoiceFrequency(String invoiceFrequency) {
        set(PROPERTY_INVOICEFREQUENCY, invoiceFrequency);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_DAYOFTHEWEEK
     * 
     */
    public String getDayOfTheWeek() {
        return (String) get(PROPERTY_DAYOFTHEWEEK);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_DAYOFTHEWEEK
     * 
     */
    public void setDayOfTheWeek(String dayOfTheWeek) {
        set(PROPERTY_DAYOFTHEWEEK, dayOfTheWeek);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_DAYOFTHEWEEKCUTOFF
     * 
     */
    public String getDayOfTheWeekCutoff() {
        return (String) get(PROPERTY_DAYOFTHEWEEKCUTOFF);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_DAYOFTHEWEEKCUTOFF
     * 
     */
    public void setDayOfTheWeekCutoff(String dayOfTheWeekCutoff) {
        set(PROPERTY_DAYOFTHEWEEKCUTOFF, dayOfTheWeekCutoff);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_INVOICEONEVENWEEKS
     * 
     */
    public Boolean isInvoiceOnEvenWeeks() {
        return (Boolean) get(PROPERTY_INVOICEONEVENWEEKS);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_INVOICEONEVENWEEKS
     * 
     */
    public void setInvoiceOnEvenWeeks(Boolean invoiceOnEvenWeeks) {
        set(PROPERTY_INVOICEONEVENWEEKS, invoiceOnEvenWeeks);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_DAYOFTHEMONTH
     * 
     */
    public Long getDayOfTheMonth() {
        return (Long) get(PROPERTY_DAYOFTHEMONTH);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_DAYOFTHEMONTH
     * 
     */
    public void setDayOfTheMonth(Long dayOfTheMonth) {
        set(PROPERTY_DAYOFTHEMONTH, dayOfTheMonth);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_INVOICECUTOFFDAY
     * 
     */
    public Long getInvoiceCutOffDay() {
        return (Long) get(PROPERTY_INVOICECUTOFFDAY);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_INVOICECUTOFFDAY
     * 
     */
    public void setInvoiceCutOffDay(Long invoiceCutOffDay) {
        set(PROPERTY_INVOICECUTOFFDAY, invoiceCutOffDay);
    }

    /**
     * @see InvoiceSchedule#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see InvoiceSchedule#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

}
