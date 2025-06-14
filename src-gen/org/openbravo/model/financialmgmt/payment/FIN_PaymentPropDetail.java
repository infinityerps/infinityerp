
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
import org.openbravo.model.financialmgmt.gl.GLItem;
/**
 * Entity class for entity FIN_Payment_Prop_Detail (stored in table FIN_Payment_Prop_Detail).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_PaymentPropDetail extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Payment_Prop_Detail";
    public static final String ENTITY_NAME = "FIN_Payment_Prop_Detail";

    /**
     * Property id stored in column Fin_Payment_Prop_Detail_ID in table FIN_Payment_Prop_Detail 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Payment_Prop_Detail 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Payment_Prop_Detail 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Payment_Prop_Detail 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Payment_Prop_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Payment_Prop_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Payment_Prop_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Payment_Prop_Detail 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property finPaymentProposal stored in column Fin_Payment_Proposal_ID in table FIN_Payment_Prop_Detail
     * 
     */
    public static final String PROPERTY_FINPAYMENTPROPOSAL = "finPaymentProposal";

    /**
     * Property fINPaymentScheduledetail stored in column FIN_Payment_Scheduledetail_ID in table FIN_Payment_Prop_Detail
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULEDETAIL = "fINPaymentScheduledetail";

    /**
     * Property amount stored in column Amount in table FIN_Payment_Prop_Detail 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property writeoffAmount stored in column Writeoffamt in table FIN_Payment_Prop_Detail<br>
     * Help: {@literal The Write Off Amount indicates the amount to be written off as uncollectible.}
     * 
     */
    public static final String PROPERTY_WRITEOFFAMOUNT = "writeoffAmount";

    /**
     * Property gLItem stored in column C_Glitem_ID in table FIN_Payment_Prop_Detail<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";


    public FIN_PaymentPropDetail() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_WRITEOFFAMOUNT, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_FINPAYMENTPROPOSAL
     * 
     */
    public FIN_PaymentProposal getFinPaymentProposal() {
        return (FIN_PaymentProposal) get(PROPERTY_FINPAYMENTPROPOSAL);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_FINPAYMENTPROPOSAL
     * 
     */
    public void setFinPaymentProposal(FIN_PaymentProposal finPaymentProposal) {
        set(PROPERTY_FINPAYMENTPROPOSAL, finPaymentProposal);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_FINPAYMENTSCHEDULEDETAIL
     * 
     */
    public FIN_PaymentScheduleDetail getFINPaymentScheduledetail() {
        return (FIN_PaymentScheduleDetail) get(PROPERTY_FINPAYMENTSCHEDULEDETAIL);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_FINPAYMENTSCHEDULEDETAIL
     * 
     */
    public void setFINPaymentScheduledetail(FIN_PaymentScheduleDetail fINPaymentScheduledetail) {
        set(PROPERTY_FINPAYMENTSCHEDULEDETAIL, fINPaymentScheduledetail);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public BigDecimal getWriteoffAmount() {
        return (BigDecimal) get(PROPERTY_WRITEOFFAMOUNT);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_WRITEOFFAMOUNT
     * 
     */
    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        set(PROPERTY_WRITEOFFAMOUNT, writeoffAmount);
    }

    /**
     * @see FIN_PaymentPropDetail#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see FIN_PaymentPropDetail#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

}
