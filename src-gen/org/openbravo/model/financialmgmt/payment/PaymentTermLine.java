
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
 * Entity class for entity FinancialMgmtPaymentTermLine (stored in table C_Paymenttermline).
 * <br>
 * Help: {@literal Line in a Payment Term}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PaymentTermLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Paymenttermline";
    public static final String ENTITY_NAME = "FinancialMgmtPaymentTermLine";

    /**
     * Property id stored in column C_Paymenttermline_ID in table C_Paymenttermline 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Paymenttermline 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Paymenttermline 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Paymenttermline 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Paymenttermline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Paymenttermline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Paymenttermline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Paymenttermline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_Paymenttermline<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property lineNo stored in column Line in table C_Paymenttermline 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property percentageDue stored in column Percentage in table C_Paymenttermline<br>
     * Help: {@literal Percentage of an amount (up to 100)}
     * 
     */
    public static final String PROPERTY_PERCENTAGEDUE = "percentageDue";

    /**
     * Property rest stored in column Onremainder in table C_Paymenttermline
     * 
     */
    public static final String PROPERTY_REST = "rest";

    /**
     * Property excludeTax stored in column Excludetax in table C_Paymenttermline
     * 
     */
    public static final String PROPERTY_EXCLUDETAX = "excludeTax";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_Paymenttermline 
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property fixedDueDate stored in column IsDueFixed in table C_Paymenttermline<br>
     * Help: {@literal The Fixed Due Date checkbox indicates if invoices using this payment term will be due on a
     *       fixed day of the month.}
     * 
     */
    public static final String PROPERTY_FIXEDDUEDATE = "fixedDueDate";

    /**
     * Property overduePaymentDaysRule stored in column NetDays in table C_Paymenttermline<br>
     * Help: {@literal Indicates the number of days after invoice date that payment is due.}
     * 
     */
    public static final String PROPERTY_OVERDUEPAYMENTDAYSRULE = "overduePaymentDaysRule";

    /**
     * Property lastDayCutoff stored in column FixMonthCutoff in table C_Paymenttermline<br>
     * Help: {@literal The Last Day Cut-off indicates the last day invoices can have to be included in the
     *       current due date.}
     * 
     */
    public static final String PROPERTY_LASTDAYCUTOFF = "lastDayCutoff";

    /**
     * Property maturityDate1 stored in column FixMonthDay in table C_Paymenttermline<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE1 = "maturityDate1";

    /**
     * Property maturityDate2 stored in column FixMonthDay2 in table C_Paymenttermline<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE2 = "maturityDate2";

    /**
     * Property maturityDate3 stored in column Fixmonthday3 in table C_Paymenttermline<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE3 = "maturityDate3";

    /**
     * Property offsetMonthDue stored in column FixMonthOffset in table C_Paymenttermline<br>
     * Help: {@literal The Offset Month Due indicates the number of months from the current month to indicate an
     *       invoice is due.  A 0 indicates the same month, a 1 the following month. }
     * 
     */
    public static final String PROPERTY_OFFSETMONTHDUE = "offsetMonthDue";

    /**
     * Property nextBusinessDay stored in column IsNextBusinessDay in table C_Paymenttermline<br>
     * Help: {@literal The Next Business Day checkbox indicates that payment is due on the next business day
     *       after invoice or delivery.}
     * 
     */
    public static final String PROPERTY_NEXTBUSINESSDAY = "nextBusinessDay";

    /**
     * Property overduePaymentDayRule stored in column NetDay in table C_Paymenttermline<br>
     * Help: {@literal When defined, overwrites the number of net days with the relative number of days to the
     *       day defined.}
     * 
     */
    public static final String PROPERTY_OVERDUEPAYMENTDAYRULE = "overduePaymentDayRule";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table C_Paymenttermline
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";


    public PaymentTermLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PERCENTAGEDUE, new BigDecimal(100));
        setDefaultValue(PROPERTY_REST, true);
        setDefaultValue(PROPERTY_EXCLUDETAX, false);
        setDefaultValue(PROPERTY_FIXEDDUEDATE, false);
        setDefaultValue(PROPERTY_NEXTBUSINESSDAY, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PaymentTermLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PaymentTermLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PaymentTermLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PaymentTermLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PaymentTermLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PaymentTermLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PaymentTermLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PaymentTermLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PaymentTermLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PaymentTermLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PaymentTermLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PaymentTermLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PaymentTermLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PaymentTermLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PaymentTermLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PaymentTermLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PaymentTermLine#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see PaymentTermLine#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see PaymentTermLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see PaymentTermLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see PaymentTermLine#PROPERTY_PERCENTAGEDUE
     * 
     */
    public BigDecimal getPercentageDue() {
        return (BigDecimal) get(PROPERTY_PERCENTAGEDUE);
    }
    /**
     * @see PaymentTermLine#PROPERTY_PERCENTAGEDUE
     * 
     */
    public void setPercentageDue(BigDecimal percentageDue) {
        set(PROPERTY_PERCENTAGEDUE, percentageDue);
    }

    /**
     * @see PaymentTermLine#PROPERTY_REST
     * 
     */
    public Boolean isRest() {
        return (Boolean) get(PROPERTY_REST);
    }
    /**
     * @see PaymentTermLine#PROPERTY_REST
     * 
     */
    public void setRest(Boolean rest) {
        set(PROPERTY_REST, rest);
    }

    /**
     * @see PaymentTermLine#PROPERTY_EXCLUDETAX
     * 
     */
    public Boolean isExcludeTax() {
        return (Boolean) get(PROPERTY_EXCLUDETAX);
    }
    /**
     * @see PaymentTermLine#PROPERTY_EXCLUDETAX
     * 
     */
    public void setExcludeTax(Boolean excludeTax) {
        set(PROPERTY_EXCLUDETAX, excludeTax);
    }

    /**
     * @see PaymentTermLine#PROPERTY_FORMOFPAYMENT
     * 
     */
    public String getFormOfPayment() {
        return (String) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see PaymentTermLine#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(String formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see PaymentTermLine#PROPERTY_FIXEDDUEDATE
     * 
     */
    public Boolean isFixedDueDate() {
        return (Boolean) get(PROPERTY_FIXEDDUEDATE);
    }
    /**
     * @see PaymentTermLine#PROPERTY_FIXEDDUEDATE
     * 
     */
    public void setFixedDueDate(Boolean fixedDueDate) {
        set(PROPERTY_FIXEDDUEDATE, fixedDueDate);
    }

    /**
     * @see PaymentTermLine#PROPERTY_OVERDUEPAYMENTDAYSRULE
     * 
     */
    public Long getOverduePaymentDaysRule() {
        return (Long) get(PROPERTY_OVERDUEPAYMENTDAYSRULE);
    }
    /**
     * @see PaymentTermLine#PROPERTY_OVERDUEPAYMENTDAYSRULE
     * 
     */
    public void setOverduePaymentDaysRule(Long overduePaymentDaysRule) {
        set(PROPERTY_OVERDUEPAYMENTDAYSRULE, overduePaymentDaysRule);
    }

    /**
     * @see PaymentTermLine#PROPERTY_LASTDAYCUTOFF
     * 
     */
    public Long getLastDayCutoff() {
        return (Long) get(PROPERTY_LASTDAYCUTOFF);
    }
    /**
     * @see PaymentTermLine#PROPERTY_LASTDAYCUTOFF
     * 
     */
    public void setLastDayCutoff(Long lastDayCutoff) {
        set(PROPERTY_LASTDAYCUTOFF, lastDayCutoff);
    }

    /**
     * @see PaymentTermLine#PROPERTY_MATURITYDATE1
     * 
     */
    public Long getMaturityDate1() {
        return (Long) get(PROPERTY_MATURITYDATE1);
    }
    /**
     * @see PaymentTermLine#PROPERTY_MATURITYDATE1
     * 
     */
    public void setMaturityDate1(Long maturityDate1) {
        set(PROPERTY_MATURITYDATE1, maturityDate1);
    }

    /**
     * @see PaymentTermLine#PROPERTY_MATURITYDATE2
     * 
     */
    public Long getMaturityDate2() {
        return (Long) get(PROPERTY_MATURITYDATE2);
    }
    /**
     * @see PaymentTermLine#PROPERTY_MATURITYDATE2
     * 
     */
    public void setMaturityDate2(Long maturityDate2) {
        set(PROPERTY_MATURITYDATE2, maturityDate2);
    }

    /**
     * @see PaymentTermLine#PROPERTY_MATURITYDATE3
     * 
     */
    public Long getMaturityDate3() {
        return (Long) get(PROPERTY_MATURITYDATE3);
    }
    /**
     * @see PaymentTermLine#PROPERTY_MATURITYDATE3
     * 
     */
    public void setMaturityDate3(Long maturityDate3) {
        set(PROPERTY_MATURITYDATE3, maturityDate3);
    }

    /**
     * @see PaymentTermLine#PROPERTY_OFFSETMONTHDUE
     * 
     */
    public Long getOffsetMonthDue() {
        return (Long) get(PROPERTY_OFFSETMONTHDUE);
    }
    /**
     * @see PaymentTermLine#PROPERTY_OFFSETMONTHDUE
     * 
     */
    public void setOffsetMonthDue(Long offsetMonthDue) {
        set(PROPERTY_OFFSETMONTHDUE, offsetMonthDue);
    }

    /**
     * @see PaymentTermLine#PROPERTY_NEXTBUSINESSDAY
     * 
     */
    public Boolean isNextBusinessDay() {
        return (Boolean) get(PROPERTY_NEXTBUSINESSDAY);
    }
    /**
     * @see PaymentTermLine#PROPERTY_NEXTBUSINESSDAY
     * 
     */
    public void setNextBusinessDay(Boolean nextBusinessDay) {
        set(PROPERTY_NEXTBUSINESSDAY, nextBusinessDay);
    }

    /**
     * @see PaymentTermLine#PROPERTY_OVERDUEPAYMENTDAYRULE
     * 
     */
    public String getOverduePaymentDayRule() {
        return (String) get(PROPERTY_OVERDUEPAYMENTDAYRULE);
    }
    /**
     * @see PaymentTermLine#PROPERTY_OVERDUEPAYMENTDAYRULE
     * 
     */
    public void setOverduePaymentDayRule(String overduePaymentDayRule) {
        set(PROPERTY_OVERDUEPAYMENTDAYRULE, overduePaymentDayRule);
    }

    /**
     * @see PaymentTermLine#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see PaymentTermLine#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

}
