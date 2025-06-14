
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
package org.openbravo.model.financialmgmt.payment;

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
 * Entity class for entity FIN_Orig_Payment_ScheduleDetail (stored in table FIN_Orig_Paym_SchedDetail).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 * @deprecated Table entity has been marked as deprecated on Development Status field.
 */
@Deprecated
public class FIN_OrigPaymentScheduleDetail extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Orig_Paym_SchedDetail";
    public static final String ENTITY_NAME = "FIN_Orig_Payment_ScheduleDetail";

    /**
     * Property id stored in column FIN_Orig_Paym_Scheddetail_ID in table FIN_Orig_Paym_SchedDetail 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Orig_Paym_SchedDetail 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Orig_Paym_SchedDetail 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Orig_Paym_SchedDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Orig_Paym_SchedDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Orig_Paym_SchedDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Orig_Paym_SchedDetail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property archivedPaymentPlan stored in column FIN_Orig_Payment_Schedule_ID in table FIN_Orig_Paym_SchedDetail
     * @deprecated Target entity {@link Fin_OrigPaymentSchedule} is deprecated.

     */
    @Deprecated
    public static final String PROPERTY_ARCHIVEDPAYMENTPLAN = "archivedPaymentPlan";

    /**
     * Property paymentScheduleDetail stored in column FIN_Payment_Scheduledetail_ID in table FIN_Orig_Paym_SchedDetail
     * 
     */
    public static final String PROPERTY_PAYMENTSCHEDULEDETAIL = "paymentScheduleDetail";

    /**
     * Property amount stored in column Amount in table FIN_Orig_Paym_SchedDetail 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property active stored in column Isactive in table FIN_Orig_Paym_SchedDetail 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Orig_Paym_SchedDetail<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property canceled stored in column Iscanceled in table FIN_Orig_Paym_SchedDetail
     * 
     */
    public static final String PROPERTY_CANCELED = "canceled";


    public FIN_OrigPaymentScheduleDetail() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_WRITEOFFAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_CANCELED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ARCHIVEDPAYMENTPLAN
     * @deprecated Target entity {@link Fin_OrigPaymentSchedule} is deprecated.

     */
    @Deprecated
    public Fin_OrigPaymentSchedule getArchivedPaymentPlan() {
        return (Fin_OrigPaymentSchedule) get(PROPERTY_ARCHIVEDPAYMENTPLAN);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ARCHIVEDPAYMENTPLAN
     * @deprecated Target entity {@link Fin_OrigPaymentSchedule} is deprecated.

     */
    @Deprecated
    public void setArchivedPaymentPlan(Fin_OrigPaymentSchedule archivedPaymentPlan) {
        set(PROPERTY_ARCHIVEDPAYMENTPLAN, archivedPaymentPlan);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_PAYMENTSCHEDULEDETAIL
     * 
     */
    public FIN_PaymentScheduleDetail getPaymentScheduleDetail() {
        return (FIN_PaymentScheduleDetail) get(PROPERTY_PAYMENTSCHEDULEDETAIL);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_PAYMENTSCHEDULEDETAIL
     * 
     */
    public void setPaymentScheduleDetail(FIN_PaymentScheduleDetail paymentScheduleDetail) {
        set(PROPERTY_PAYMENTSCHEDULEDETAIL, paymentScheduleDetail);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CANCELED
     * 
     */
    public Boolean isCanceled() {
        return (Boolean) get(PROPERTY_CANCELED);
    }
    /**
     * @see FIN_OrigPaymentScheduleDetail#PROPERTY_CANCELED
     * 
     */
    public void setCanceled(Boolean canceled) {
        set(PROPERTY_CANCELED, canceled);
    }

}
