
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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Category;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FIN_Doubtful_Debt_V (stored in table FIN_Doubtful_Debt_V).
 * <br>
 * Help: {@literal Doubtful debts are those debts which a business or individual is unlikely to be able to
     *       collect. The reasons for potential non payment can include disputes over supply, delivery, at the
     *       conditioner of item or the appearance of financial stress within a customer's operations. When such
     *       a dispute occurs it is prudent to add this debt or portion thereof to the doubtful debt reserve.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DoubtfulDebtV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Doubtful_Debt_V";
    public static final String ENTITY_NAME = "FIN_Doubtful_Debt_V";

    /**
     * Property id stored in column FIN_Doubtful_Debt_V_ID in table FIN_Doubtful_Debt_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property finPaymentSchedule stored in column FIN_Payment_Schedule_ID in table FIN_Doubtful_Debt_V
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULE = "finPaymentSchedule";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Doubtful_Debt_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Doubtful_Debt_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Doubtful_Debt_V 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Doubtful_Debt_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Doubtful_Debt_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Doubtful_Debt_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Doubtful_Debt_V 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentno stored in column Documentno in table FIN_Doubtful_Debt_V 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentno";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Doubtful_Debt_V<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property businessPartnerCategory stored in column C_Bp_Group_ID in table FIN_Doubtful_Debt_V<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property dateinvoiced stored in column Dateinvoiced in table FIN_Doubtful_Debt_V<br>
     * Help: {@literal The Date Invoice indicates the date printed on the invoice.}
     * 
     */
    public static final String PROPERTY_DATEINVOICED = "dateinvoiced";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table FIN_Doubtful_Debt_V
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Doubtful_Debt_V<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property duedate stored in column Duedate in table FIN_Doubtful_Debt_V 
     * 
     */
    public static final String PROPERTY_DUEDATE = "duedate";

    /**
     * Property rundate stored in column Rundate in table FIN_Doubtful_Debt_V<br>
     * Help: {@literal Date on which process was run}
     * 
     */
    public static final String PROPERTY_RUNDATE = "rundate";

    /**
     * Property amount stored in column Amount in table FIN_Doubtful_Debt_V
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property outstandingamt stored in column Outstandingamt in table FIN_Doubtful_Debt_V<br>
     * Help: {@literal Outstanding Amount. Amount pending to be paid}
     * 
     */
    public static final String PROPERTY_OUTSTANDINGAMT = "outstandingamt";

    /**
     * Property doubtfulDebtAmount stored in column Doubtfuldebt_Amount in table FIN_Doubtful_Debt_V<br>
     * Help: {@literal Doubtful Debt Amount}
     * 
     */
    public static final String PROPERTY_DOUBTFULDEBTAMOUNT = "doubtfulDebtAmount";

    /**
     * Property daysOverdue stored in column Daysoverdue in table FIN_Doubtful_Debt_V
     * 
     */
    public static final String PROPERTY_DAYSOVERDUE = "daysOverdue";

    /**
     * Property fINDoubtfulDebtRun stored in column FIN_Doubtful_Debt_Run_ID in table FIN_Doubtful_Debt_V
     * 
     */
    public static final String PROPERTY_FINDOUBTFULDEBTRUN = "fINDoubtfulDebtRun";

    /**
     * Property fINDoubtfulDebt stored in column FIN_Doubtful_Debt_ID in table FIN_Doubtful_Debt_V
     * 
     */
    public static final String PROPERTY_FINDOUBTFULDEBT = "fINDoubtfulDebt";

    /**
     * Property obSelected stored in column OB_Selected in table FIN_Doubtful_Debt_V
     * 
     */
    public static final String PROPERTY_OBSELECTED = "obSelected";


    public DoubtfulDebtV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_OBSELECTED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_FINPAYMENTSCHEDULE
     * 
     */
    public FIN_PaymentSchedule getFinPaymentSchedule() {
        return (FIN_PaymentSchedule) get(PROPERTY_FINPAYMENTSCHEDULE);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_FINPAYMENTSCHEDULE
     * 
     */
    public void setFinPaymentSchedule(FIN_PaymentSchedule finPaymentSchedule) {
        set(PROPERTY_FINPAYMENTSCHEDULE, finPaymentSchedule);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentno() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentno(String documentno) {
        set(PROPERTY_DOCUMENTNO, documentno);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_DATEINVOICED
     * 
     */
    public Date getDateinvoiced() {
        return (Date) get(PROPERTY_DATEINVOICED);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_DATEINVOICED
     * 
     */
    public void setDateinvoiced(Date dateinvoiced) {
        set(PROPERTY_DATEINVOICED, dateinvoiced);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_DUEDATE
     * 
     */
    public Date getDuedate() {
        return (Date) get(PROPERTY_DUEDATE);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_DUEDATE
     * 
     */
    public void setDuedate(Date duedate) {
        set(PROPERTY_DUEDATE, duedate);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_RUNDATE
     * 
     */
    public Date getRundate() {
        return (Date) get(PROPERTY_RUNDATE);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_RUNDATE
     * 
     */
    public void setRundate(Date rundate) {
        set(PROPERTY_RUNDATE, rundate);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_OUTSTANDINGAMT
     * 
     */
    public BigDecimal getOutstandingamt() {
        return (BigDecimal) get(PROPERTY_OUTSTANDINGAMT);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_OUTSTANDINGAMT
     * 
     */
    public void setOutstandingamt(BigDecimal outstandingamt) {
        set(PROPERTY_OUTSTANDINGAMT, outstandingamt);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_DOUBTFULDEBTAMOUNT
     * 
     */
    public BigDecimal getDoubtfulDebtAmount() {
        return (BigDecimal) get(PROPERTY_DOUBTFULDEBTAMOUNT);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_DOUBTFULDEBTAMOUNT
     * 
     */
    public void setDoubtfulDebtAmount(BigDecimal doubtfulDebtAmount) {
        set(PROPERTY_DOUBTFULDEBTAMOUNT, doubtfulDebtAmount);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_DAYSOVERDUE
     * 
     */
    public Long getDaysOverdue() {
        return (Long) get(PROPERTY_DAYSOVERDUE);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_DAYSOVERDUE
     * 
     */
    public void setDaysOverdue(Long daysOverdue) {
        set(PROPERTY_DAYSOVERDUE, daysOverdue);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_FINDOUBTFULDEBTRUN
     * 
     */
    public DoubtfulDebtRun getFINDoubtfulDebtRun() {
        return (DoubtfulDebtRun) get(PROPERTY_FINDOUBTFULDEBTRUN);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_FINDOUBTFULDEBTRUN
     * 
     */
    public void setFINDoubtfulDebtRun(DoubtfulDebtRun fINDoubtfulDebtRun) {
        set(PROPERTY_FINDOUBTFULDEBTRUN, fINDoubtfulDebtRun);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_FINDOUBTFULDEBT
     * 
     */
    public DoubtfulDebt getFINDoubtfulDebt() {
        return (DoubtfulDebt) get(PROPERTY_FINDOUBTFULDEBT);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_FINDOUBTFULDEBT
     * 
     */
    public void setFINDoubtfulDebt(DoubtfulDebt fINDoubtfulDebt) {
        set(PROPERTY_FINDOUBTFULDEBT, fINDoubtfulDebt);
    }

    /**
     * @see DoubtfulDebtV#PROPERTY_OBSELECTED
     * 
     */
    public Boolean isObSelected() {
        return (Boolean) get(PROPERTY_OBSELECTED);
    }
    /**
     * @see DoubtfulDebtV#PROPERTY_OBSELECTED
     * 
     */
    public void setObSelected(Boolean obSelected) {
        set(PROPERTY_OBSELECTED, obSelected);
    }

}
