
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
import org.openbravo.model.common.bank.BankAccount;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtPromissoryFormat (stored in table C_PromissoryFormat).
 * <br>
 * Help: {@literal It is necessary a Promissory format to print any Promissory Note with each Bank. Currently
     *       this format is prepared for the Spanish model.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class PromissoryFormat extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_PromissoryFormat";
    public static final String ENTITY_NAME = "FinancialMgmtPromissoryFormat";

    /**
     * Property id stored in column C_Promissoryformat_ID in table C_PromissoryFormat 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_PromissoryFormat 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_PromissoryFormat 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_PromissoryFormat 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_PromissoryFormat 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_PromissoryFormat 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_PromissoryFormat 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_PromissoryFormat 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_PromissoryFormat 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_PromissoryFormat<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property bankAccount stored in column C_BankAccount_ID in table C_PromissoryFormat<br>
     * Help: {@literal The Bank Account identifies an account at this Bank.}
     * 
     */
    public static final String PROPERTY_BANKACCOUNT = "bankAccount";

    /**
     * Property line1Top stored in column Line1top in table C_PromissoryFormat<br>
     * Help: {@literal Distance to the top for the 1st line.}
     * 
     */
    public static final String PROPERTY_LINE1TOP = "line1Top";

    /**
     * Property line1Left stored in column Line1left in table C_PromissoryFormat<br>
     * Help: {@literal Distance from the left side for the 1st line.}
     * 
     */
    public static final String PROPERTY_LINE1LEFT = "line1Left";

    /**
     * Property line2Top stored in column Line2top in table C_PromissoryFormat<br>
     * Help: {@literal Distance to the top for the 2nd line.}
     * 
     */
    public static final String PROPERTY_LINE2TOP = "line2Top";

    /**
     * Property line2Left stored in column Line2left in table C_PromissoryFormat<br>
     * Help: {@literal Distance from the left side for the 2nd line.}
     * 
     */
    public static final String PROPERTY_LINE2LEFT = "line2Left";

    /**
     * Property line3Top stored in column Line3top in table C_PromissoryFormat<br>
     * Help: {@literal Distance to the top for the 3rd line.}
     * 
     */
    public static final String PROPERTY_LINE3TOP = "line3Top";

    /**
     * Property line3Left stored in column Line3left in table C_PromissoryFormat<br>
     * Help: {@literal Distance from the left side for the 3rd line.}
     * 
     */
    public static final String PROPERTY_LINE3LEFT = "line3Left";

    /**
     * Property line4Top stored in column Line4top in table C_PromissoryFormat<br>
     * Help: {@literal Distance to the top for the 4th line.}
     * 
     */
    public static final String PROPERTY_LINE4TOP = "line4Top";

    /**
     * Property line4Left stored in column Line4left in table C_PromissoryFormat<br>
     * Help: {@literal Distance from the left side for the 4th line.}
     * 
     */
    public static final String PROPERTY_LINE4LEFT = "line4Left";

    /**
     * Property param11 stored in column Param11 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 1st parameter of 1st line.}
     * 
     */
    public static final String PROPERTY_PARAM11 = "param11";

    /**
     * Property param12 stored in column Param12 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 2nd parameter of 1st line.}
     * 
     */
    public static final String PROPERTY_PARAM12 = "param12";

    /**
     * Property param13 stored in column Param13 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 3rd parameter of 1st line.}
     * 
     */
    public static final String PROPERTY_PARAM13 = "param13";

    /**
     * Property param31 stored in column Param31 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 1st parameter of 3rd line.}
     * 
     */
    public static final String PROPERTY_PARAM31 = "param31";

    /**
     * Property param32 stored in column Param32 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 2nd parameter of 3rd line.}
     * 
     */
    public static final String PROPERTY_PARAM32 = "param32";

    /**
     * Property param41 stored in column Param41 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 1st parameter of 4th line.}
     * 
     */
    public static final String PROPERTY_PARAM41 = "param41";

    /**
     * Property param42 stored in column Param42 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 2nd parameter of 4th line.}
     * 
     */
    public static final String PROPERTY_PARAM42 = "param42";

    /**
     * Property param43 stored in column Param43 in table C_PromissoryFormat<br>
     * Help: {@literal Position for 3rd parameter of 4th line.}
     * 
     */
    public static final String PROPERTY_PARAM43 = "param43";

    /**
     * Property printBankLocation stored in column Printbankloc in table C_PromissoryFormat<br>
     * Help: {@literal Specifies whether bank location is going to be printed.}
     * 
     */
    public static final String PROPERTY_PRINTBANKLOCATION = "printBankLocation";

    /**
     * Property sourcePlannedDay stored in column Fontdayplanned in table C_PromissoryFormat<br>
     * Help: {@literal Font size for planned day field.}
     * 
     */
    public static final String PROPERTY_SOURCEPLANNEDDAY = "sourcePlannedDay";

    /**
     * Property sourcePlannedMonth stored in column Fontmonthplanned in table C_PromissoryFormat<br>
     * Help: {@literal Font size for planned month field.}
     * 
     */
    public static final String PROPERTY_SOURCEPLANNEDMONTH = "sourcePlannedMonth";

    /**
     * Property sourceLastYear stored in column Fontyearplanned in table C_PromissoryFormat<br>
     * Help: {@literal Font size for planned year field.}
     * 
     */
    public static final String PROPERTY_SOURCELASTYEAR = "sourceLastYear";

    /**
     * Property sourceAmount stored in column Fontamount in table C_PromissoryFormat<br>
     * Help: {@literal Font size for amount field.}
     * 
     */
    public static final String PROPERTY_SOURCEAMOUNT = "sourceAmount";

    /**
     * Property sourceToBusinessPartner stored in column Fontpartnername in table C_PromissoryFormat<br>
     * Help: {@literal Font size for partner name field.}
     * 
     */
    public static final String PROPERTY_SOURCETOBUSINESSPARTNER = "sourceToBusinessPartner";

    /**
     * Property sourceAmountText stored in column Fontamounttext in table C_PromissoryFormat<br>
     * Help: {@literal Font size for amount text field.}
     * 
     */
    public static final String PROPERTY_SOURCEAMOUNTTEXT = "sourceAmountText";

    /**
     * Property sourceDayToday stored in column Fontdaytoday in table C_PromissoryFormat<br>
     * Help: {@literal Font size for day to day field.}
     * 
     */
    public static final String PROPERTY_SOURCEDAYTODAY = "sourceDayToday";

    /**
     * Property sourceMonthToDay stored in column Fontmonthtoday in table C_PromissoryFormat<br>
     * Help: {@literal Font size for month to day field.}
     * 
     */
    public static final String PROPERTY_SOURCEMONTHTODAY = "sourceMonthToDay";

    /**
     * Property sourceYearToDay stored in column Fontyeartoday in table C_PromissoryFormat<br>
     * Help: {@literal Font size for year to day field.}
     * 
     */
    public static final String PROPERTY_SOURCEYEARTODAY = "sourceYearToDay";

    /**
     * Property bankLocationFont stored in column FontBankLocation in table C_PromissoryFormat<br>
     * Help: {@literal Bank location font}
     * 
     */
    public static final String PROPERTY_BANKLOCATIONFONT = "bankLocationFont";


    public PromissoryFormat() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_LINE1TOP, new BigDecimal(1));
        setDefaultValue(PROPERTY_LINE1LEFT, new BigDecimal(1));
        setDefaultValue(PROPERTY_LINE2TOP, new BigDecimal(1));
        setDefaultValue(PROPERTY_LINE2LEFT, new BigDecimal(1));
        setDefaultValue(PROPERTY_LINE3TOP, new BigDecimal(1));
        setDefaultValue(PROPERTY_LINE3LEFT, new BigDecimal(1));
        setDefaultValue(PROPERTY_LINE4TOP, new BigDecimal(1));
        setDefaultValue(PROPERTY_LINE4LEFT, new BigDecimal(1));
        setDefaultValue(PROPERTY_PARAM11, new BigDecimal(0));
        setDefaultValue(PROPERTY_PARAM12, new BigDecimal(0));
        setDefaultValue(PROPERTY_PARAM13, new BigDecimal(0));
        setDefaultValue(PROPERTY_PARAM31, new BigDecimal(0));
        setDefaultValue(PROPERTY_PARAM32, new BigDecimal(0));
        setDefaultValue(PROPERTY_PARAM41, new BigDecimal(0));
        setDefaultValue(PROPERTY_PARAM42, new BigDecimal(0));
        setDefaultValue(PROPERTY_PARAM43, new BigDecimal(0));
        setDefaultValue(PROPERTY_PRINTBANKLOCATION, true);
        setDefaultValue(PROPERTY_SOURCEPLANNEDDAY, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCEPLANNEDMONTH, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCELASTYEAR, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCEAMOUNT, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCETOBUSINESSPARTNER, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCEAMOUNTTEXT, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCEDAYTODAY, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCEMONTHTODAY, new BigDecimal(8));
        setDefaultValue(PROPERTY_SOURCEYEARTODAY, new BigDecimal(8));
        setDefaultValue(PROPERTY_BANKLOCATIONFONT, new BigDecimal(8));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see PromissoryFormat#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see PromissoryFormat#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see PromissoryFormat#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see PromissoryFormat#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see PromissoryFormat#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see PromissoryFormat#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see PromissoryFormat#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see PromissoryFormat#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see PromissoryFormat#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see PromissoryFormat#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see PromissoryFormat#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see PromissoryFormat#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see PromissoryFormat#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see PromissoryFormat#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see PromissoryFormat#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see PromissoryFormat#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see PromissoryFormat#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see PromissoryFormat#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see PromissoryFormat#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see PromissoryFormat#PROPERTY_BANKACCOUNT
     * 
     */
    public BankAccount getBankAccount() {
        return (BankAccount) get(PROPERTY_BANKACCOUNT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_BANKACCOUNT
     * 
     */
    public void setBankAccount(BankAccount bankAccount) {
        set(PROPERTY_BANKACCOUNT, bankAccount);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE1TOP
     * 
     */
    public BigDecimal getLine1Top() {
        return (BigDecimal) get(PROPERTY_LINE1TOP);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE1TOP
     * 
     */
    public void setLine1Top(BigDecimal line1Top) {
        set(PROPERTY_LINE1TOP, line1Top);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE1LEFT
     * 
     */
    public BigDecimal getLine1Left() {
        return (BigDecimal) get(PROPERTY_LINE1LEFT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE1LEFT
     * 
     */
    public void setLine1Left(BigDecimal line1Left) {
        set(PROPERTY_LINE1LEFT, line1Left);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE2TOP
     * 
     */
    public BigDecimal getLine2Top() {
        return (BigDecimal) get(PROPERTY_LINE2TOP);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE2TOP
     * 
     */
    public void setLine2Top(BigDecimal line2Top) {
        set(PROPERTY_LINE2TOP, line2Top);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE2LEFT
     * 
     */
    public BigDecimal getLine2Left() {
        return (BigDecimal) get(PROPERTY_LINE2LEFT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE2LEFT
     * 
     */
    public void setLine2Left(BigDecimal line2Left) {
        set(PROPERTY_LINE2LEFT, line2Left);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE3TOP
     * 
     */
    public BigDecimal getLine3Top() {
        return (BigDecimal) get(PROPERTY_LINE3TOP);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE3TOP
     * 
     */
    public void setLine3Top(BigDecimal line3Top) {
        set(PROPERTY_LINE3TOP, line3Top);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE3LEFT
     * 
     */
    public BigDecimal getLine3Left() {
        return (BigDecimal) get(PROPERTY_LINE3LEFT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE3LEFT
     * 
     */
    public void setLine3Left(BigDecimal line3Left) {
        set(PROPERTY_LINE3LEFT, line3Left);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE4TOP
     * 
     */
    public BigDecimal getLine4Top() {
        return (BigDecimal) get(PROPERTY_LINE4TOP);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE4TOP
     * 
     */
    public void setLine4Top(BigDecimal line4Top) {
        set(PROPERTY_LINE4TOP, line4Top);
    }

    /**
     * @see PromissoryFormat#PROPERTY_LINE4LEFT
     * 
     */
    public BigDecimal getLine4Left() {
        return (BigDecimal) get(PROPERTY_LINE4LEFT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_LINE4LEFT
     * 
     */
    public void setLine4Left(BigDecimal line4Left) {
        set(PROPERTY_LINE4LEFT, line4Left);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM11
     * 
     */
    public BigDecimal getParam11() {
        return (BigDecimal) get(PROPERTY_PARAM11);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM11
     * 
     */
    public void setParam11(BigDecimal param11) {
        set(PROPERTY_PARAM11, param11);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM12
     * 
     */
    public BigDecimal getParam12() {
        return (BigDecimal) get(PROPERTY_PARAM12);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM12
     * 
     */
    public void setParam12(BigDecimal param12) {
        set(PROPERTY_PARAM12, param12);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM13
     * 
     */
    public BigDecimal getParam13() {
        return (BigDecimal) get(PROPERTY_PARAM13);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM13
     * 
     */
    public void setParam13(BigDecimal param13) {
        set(PROPERTY_PARAM13, param13);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM31
     * 
     */
    public BigDecimal getParam31() {
        return (BigDecimal) get(PROPERTY_PARAM31);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM31
     * 
     */
    public void setParam31(BigDecimal param31) {
        set(PROPERTY_PARAM31, param31);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM32
     * 
     */
    public BigDecimal getParam32() {
        return (BigDecimal) get(PROPERTY_PARAM32);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM32
     * 
     */
    public void setParam32(BigDecimal param32) {
        set(PROPERTY_PARAM32, param32);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM41
     * 
     */
    public BigDecimal getParam41() {
        return (BigDecimal) get(PROPERTY_PARAM41);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM41
     * 
     */
    public void setParam41(BigDecimal param41) {
        set(PROPERTY_PARAM41, param41);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM42
     * 
     */
    public BigDecimal getParam42() {
        return (BigDecimal) get(PROPERTY_PARAM42);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM42
     * 
     */
    public void setParam42(BigDecimal param42) {
        set(PROPERTY_PARAM42, param42);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PARAM43
     * 
     */
    public BigDecimal getParam43() {
        return (BigDecimal) get(PROPERTY_PARAM43);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PARAM43
     * 
     */
    public void setParam43(BigDecimal param43) {
        set(PROPERTY_PARAM43, param43);
    }

    /**
     * @see PromissoryFormat#PROPERTY_PRINTBANKLOCATION
     * 
     */
    public Boolean isPrintBankLocation() {
        return (Boolean) get(PROPERTY_PRINTBANKLOCATION);
    }
    /**
     * @see PromissoryFormat#PROPERTY_PRINTBANKLOCATION
     * 
     */
    public void setPrintBankLocation(Boolean printBankLocation) {
        set(PROPERTY_PRINTBANKLOCATION, printBankLocation);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCEPLANNEDDAY
     * 
     */
    public BigDecimal getSourcePlannedDay() {
        return (BigDecimal) get(PROPERTY_SOURCEPLANNEDDAY);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCEPLANNEDDAY
     * 
     */
    public void setSourcePlannedDay(BigDecimal sourcePlannedDay) {
        set(PROPERTY_SOURCEPLANNEDDAY, sourcePlannedDay);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCEPLANNEDMONTH
     * 
     */
    public BigDecimal getSourcePlannedMonth() {
        return (BigDecimal) get(PROPERTY_SOURCEPLANNEDMONTH);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCEPLANNEDMONTH
     * 
     */
    public void setSourcePlannedMonth(BigDecimal sourcePlannedMonth) {
        set(PROPERTY_SOURCEPLANNEDMONTH, sourcePlannedMonth);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCELASTYEAR
     * 
     */
    public BigDecimal getSourceLastYear() {
        return (BigDecimal) get(PROPERTY_SOURCELASTYEAR);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCELASTYEAR
     * 
     */
    public void setSourceLastYear(BigDecimal sourceLastYear) {
        set(PROPERTY_SOURCELASTYEAR, sourceLastYear);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCEAMOUNT
     * 
     */
    public BigDecimal getSourceAmount() {
        return (BigDecimal) get(PROPERTY_SOURCEAMOUNT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCEAMOUNT
     * 
     */
    public void setSourceAmount(BigDecimal sourceAmount) {
        set(PROPERTY_SOURCEAMOUNT, sourceAmount);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCETOBUSINESSPARTNER
     * 
     */
    public BigDecimal getSourceToBusinessPartner() {
        return (BigDecimal) get(PROPERTY_SOURCETOBUSINESSPARTNER);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCETOBUSINESSPARTNER
     * 
     */
    public void setSourceToBusinessPartner(BigDecimal sourceToBusinessPartner) {
        set(PROPERTY_SOURCETOBUSINESSPARTNER, sourceToBusinessPartner);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCEAMOUNTTEXT
     * 
     */
    public BigDecimal getSourceAmountText() {
        return (BigDecimal) get(PROPERTY_SOURCEAMOUNTTEXT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCEAMOUNTTEXT
     * 
     */
    public void setSourceAmountText(BigDecimal sourceAmountText) {
        set(PROPERTY_SOURCEAMOUNTTEXT, sourceAmountText);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCEDAYTODAY
     * 
     */
    public BigDecimal getSourceDayToday() {
        return (BigDecimal) get(PROPERTY_SOURCEDAYTODAY);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCEDAYTODAY
     * 
     */
    public void setSourceDayToday(BigDecimal sourceDayToday) {
        set(PROPERTY_SOURCEDAYTODAY, sourceDayToday);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCEMONTHTODAY
     * 
     */
    public BigDecimal getSourceMonthToDay() {
        return (BigDecimal) get(PROPERTY_SOURCEMONTHTODAY);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCEMONTHTODAY
     * 
     */
    public void setSourceMonthToDay(BigDecimal sourceMonthToDay) {
        set(PROPERTY_SOURCEMONTHTODAY, sourceMonthToDay);
    }

    /**
     * @see PromissoryFormat#PROPERTY_SOURCEYEARTODAY
     * 
     */
    public BigDecimal getSourceYearToDay() {
        return (BigDecimal) get(PROPERTY_SOURCEYEARTODAY);
    }
    /**
     * @see PromissoryFormat#PROPERTY_SOURCEYEARTODAY
     * 
     */
    public void setSourceYearToDay(BigDecimal sourceYearToDay) {
        set(PROPERTY_SOURCEYEARTODAY, sourceYearToDay);
    }

    /**
     * @see PromissoryFormat#PROPERTY_BANKLOCATIONFONT
     * 
     */
    public BigDecimal getBankLocationFont() {
        return (BigDecimal) get(PROPERTY_BANKLOCATIONFONT);
    }
    /**
     * @see PromissoryFormat#PROPERTY_BANKLOCATIONFONT
     * 
     */
    public void setBankLocationFont(BigDecimal bankLocationFont) {
        set(PROPERTY_BANKLOCATIONFONT, bankLocationFont);
    }

}
