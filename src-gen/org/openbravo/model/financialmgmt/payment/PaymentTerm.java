
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
/**
 * Entity class for entity FinancialMgmtPaymentTerm (stored in table C_PaymentTerm).
 * <br>
 * Help: {@literal The Payment Term defines the different payments terms that you offer to your Business
     *       Partners when paying invoices and also those terms which your Vendors offer you for payment of your
     *       invoices. On the standard invoice, the Name and the Document Note}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PaymentTerm extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_PaymentTerm";
    public static final String ENTITY_NAME = "FinancialMgmtPaymentTerm";

    /**
     * Property id stored in column C_PaymentTerm_ID in table C_PaymentTerm<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_PaymentTerm 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_PaymentTerm 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_PaymentTerm 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_PaymentTerm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_PaymentTerm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_PaymentTerm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_PaymentTerm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_PaymentTerm 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_PaymentTerm<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property comments stored in column DocumentNote in table C_PaymentTerm<br>
     * Help: {@literal The Document Note is used for recording any additional information regarding this
     *       product.}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property fixedDueDate stored in column IsDueFixed in table C_PaymentTerm<br>
     * Help: {@literal The Fixed Due Date checkbox indicates if invoices using this payment term will be due on a
     *       fixed day of the month.}
     * 
     */
    public static final String PROPERTY_FIXEDDUEDATE = "fixedDueDate";

    /**
     * Property overduePaymentDaysRule stored in column NetDays in table C_PaymentTerm<br>
     * Help: {@literal Indicates the number of days after invoice date that payment is due.}
     * 
     */
    public static final String PROPERTY_OVERDUEPAYMENTDAYSRULE = "overduePaymentDaysRule";

    /**
     * Property maturityDate1 stored in column FixMonthDay in table C_PaymentTerm<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE1 = "maturityDate1";

    /**
     * Property offsetMonthDue stored in column FixMonthOffset in table C_PaymentTerm<br>
     * Help: {@literal The Offset Month Due indicates the number of months from the current month to indicate an
     *       invoice is due.  A 0 indicates the same month, a 1 the following month. }
     * 
     */
    public static final String PROPERTY_OFFSETMONTHDUE = "offsetMonthDue";

    /**
     * Property nextBusinessDay stored in column IsNextBusinessDay in table C_PaymentTerm<br>
     * Help: {@literal The Next Business Day checkbox indicates that payment is due on the next business day
     *       after invoice or delivery.}
     * 
     */
    public static final String PROPERTY_NEXTBUSINESSDAY = "nextBusinessDay";

    /**
     * Property default stored in column IsDefault in table C_PaymentTerm<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property searchKey stored in column Value in table C_PaymentTerm<br>
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
     * Property overduePaymentDayRule stored in column NetDay in table C_PaymentTerm<br>
     * Help: {@literal When defined, overwrites the number of net days with the relative number of days to the
     *       day defined.}
     * 
     */
    public static final String PROPERTY_OVERDUEPAYMENTDAYRULE = "overduePaymentDayRule";

    /**
     * Property valid stored in column IsValid in table C_PaymentTerm<br>
     * Help: {@literal The element passed the validation check}
     * 
     */
    public static final String PROPERTY_VALID = "valid";

    /**
     * Property maturityDate2 stored in column FixMonthDay2 in table C_PaymentTerm<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE2 = "maturityDate2";

    /**
     * Property maturityDate3 stored in column Fixmonthday3 in table C_PaymentTerm<br>
     * Help: {@literal The Fix Month Day indicates the day of the month that invoices are due.  This field is
     *       displayed only when the fixed due date checkbox is selected. 3 different fix month days can be
     *       defined.}
     * 
     */
    public static final String PROPERTY_MATURITYDATE3 = "maturityDate3";

    /**
     * Property financialMgmtPaymentTermLineList stored in table C_PaymentTerm
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTPAYMENTTERMLINELIST = "financialMgmtPaymentTermLineList";

    /**
     * Property financialMgmtPaymentTermTrlList stored in table C_PaymentTerm
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTPAYMENTTERMTRLLIST = "financialMgmtPaymentTermTrlList";


    public PaymentTerm() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FIXEDDUEDATE, false);
        setDefaultValue(PROPERTY_NEXTBUSINESSDAY, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_VALID, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTPAYMENTTERMLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTPAYMENTTERMTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PaymentTerm#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PaymentTerm#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PaymentTerm#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PaymentTerm#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PaymentTerm#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PaymentTerm#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PaymentTerm#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PaymentTerm#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PaymentTerm#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PaymentTerm#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PaymentTerm#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PaymentTerm#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PaymentTerm#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PaymentTerm#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PaymentTerm#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PaymentTerm#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PaymentTerm#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PaymentTerm#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PaymentTerm#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PaymentTerm#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PaymentTerm#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see PaymentTerm#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see PaymentTerm#PROPERTY_FIXEDDUEDATE
     * 
     */
    public Boolean isFixedDueDate() {
        return (Boolean) get(PROPERTY_FIXEDDUEDATE);
    }
    /**
     * @see PaymentTerm#PROPERTY_FIXEDDUEDATE
     * 
     */
    public void setFixedDueDate(Boolean fixedDueDate) {
        set(PROPERTY_FIXEDDUEDATE, fixedDueDate);
    }

    /**
     * @see PaymentTerm#PROPERTY_OVERDUEPAYMENTDAYSRULE
     * 
     */
    public Long getOverduePaymentDaysRule() {
        return (Long) get(PROPERTY_OVERDUEPAYMENTDAYSRULE);
    }
    /**
     * @see PaymentTerm#PROPERTY_OVERDUEPAYMENTDAYSRULE
     * 
     */
    public void setOverduePaymentDaysRule(Long overduePaymentDaysRule) {
        set(PROPERTY_OVERDUEPAYMENTDAYSRULE, overduePaymentDaysRule);
    }

    /**
     * @see PaymentTerm#PROPERTY_MATURITYDATE1
     * 
     */
    public Long getMaturityDate1() {
        return (Long) get(PROPERTY_MATURITYDATE1);
    }
    /**
     * @see PaymentTerm#PROPERTY_MATURITYDATE1
     * 
     */
    public void setMaturityDate1(Long maturityDate1) {
        set(PROPERTY_MATURITYDATE1, maturityDate1);
    }

    /**
     * @see PaymentTerm#PROPERTY_OFFSETMONTHDUE
     * 
     */
    public Long getOffsetMonthDue() {
        return (Long) get(PROPERTY_OFFSETMONTHDUE);
    }
    /**
     * @see PaymentTerm#PROPERTY_OFFSETMONTHDUE
     * 
     */
    public void setOffsetMonthDue(Long offsetMonthDue) {
        set(PROPERTY_OFFSETMONTHDUE, offsetMonthDue);
    }

    /**
     * @see PaymentTerm#PROPERTY_NEXTBUSINESSDAY
     * 
     */
    public Boolean isNextBusinessDay() {
        return (Boolean) get(PROPERTY_NEXTBUSINESSDAY);
    }
    /**
     * @see PaymentTerm#PROPERTY_NEXTBUSINESSDAY
     * 
     */
    public void setNextBusinessDay(Boolean nextBusinessDay) {
        set(PROPERTY_NEXTBUSINESSDAY, nextBusinessDay);
    }

    /**
     * @see PaymentTerm#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see PaymentTerm#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see PaymentTerm#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see PaymentTerm#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see PaymentTerm#PROPERTY_OVERDUEPAYMENTDAYRULE
     * 
     */
    public String getOverduePaymentDayRule() {
        return (String) get(PROPERTY_OVERDUEPAYMENTDAYRULE);
    }
    /**
     * @see PaymentTerm#PROPERTY_OVERDUEPAYMENTDAYRULE
     * 
     */
    public void setOverduePaymentDayRule(String overduePaymentDayRule) {
        set(PROPERTY_OVERDUEPAYMENTDAYRULE, overduePaymentDayRule);
    }

    /**
     * @see PaymentTerm#PROPERTY_VALID
     * 
     */
    public Boolean isValid() {
        return (Boolean) get(PROPERTY_VALID);
    }
    /**
     * @see PaymentTerm#PROPERTY_VALID
     * 
     */
    public void setValid(Boolean valid) {
        set(PROPERTY_VALID, valid);
    }

    /**
     * @see PaymentTerm#PROPERTY_MATURITYDATE2
     * 
     */
    public Long getMaturityDate2() {
        return (Long) get(PROPERTY_MATURITYDATE2);
    }
    /**
     * @see PaymentTerm#PROPERTY_MATURITYDATE2
     * 
     */
    public void setMaturityDate2(Long maturityDate2) {
        set(PROPERTY_MATURITYDATE2, maturityDate2);
    }

    /**
     * @see PaymentTerm#PROPERTY_MATURITYDATE3
     * 
     */
    public Long getMaturityDate3() {
        return (Long) get(PROPERTY_MATURITYDATE3);
    }
    /**
     * @see PaymentTerm#PROPERTY_MATURITYDATE3
     * 
     */
    public void setMaturityDate3(Long maturityDate3) {
        set(PROPERTY_MATURITYDATE3, maturityDate3);
    }

    /**
     * Help: {@literal Line in a Payment Term}<br>
     * @see PaymentTermLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PaymentTermLine> getFinancialMgmtPaymentTermLineList() {
      return (List<PaymentTermLine>) get(PROPERTY_FINANCIALMGMTPAYMENTTERMLINELIST);
    }

    /**
     * Help: {@literal Line in a Payment Term}<br>
     * @see PaymentTermLine
     * 
     */
    public void setFinancialMgmtPaymentTermLineList(List<PaymentTermLine> financialMgmtPaymentTermLineList) {
        set(PROPERTY_FINANCIALMGMTPAYMENTTERMLINELIST, financialMgmtPaymentTermLineList);
    }

    /**
     * Help: {@literal The translation defines the payment terms translations for different languages}<br>
     * @see PaymentTermTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<PaymentTermTrl> getFinancialMgmtPaymentTermTrlList() {
      return (List<PaymentTermTrl>) get(PROPERTY_FINANCIALMGMTPAYMENTTERMTRLLIST);
    }

    /**
     * Help: {@literal The translation defines the payment terms translations for different languages}<br>
     * @see PaymentTermTrl
     * 
     */
    public void setFinancialMgmtPaymentTermTrlList(List<PaymentTermTrl> financialMgmtPaymentTermTrlList) {
        set(PROPERTY_FINANCIALMGMTPAYMENTTERMTRLLIST, financialMgmtPaymentTermTrlList);
    }

}
