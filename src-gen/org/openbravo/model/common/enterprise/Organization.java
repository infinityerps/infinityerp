
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
package org.openbravo.model.common.enterprise;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.system.Language;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.externalbpartner.ExternalBusinessPartnerConfig;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.calendar.Calendar;
import org.openbravo.model.financialmgmt.gl.GLItem;
/**
 * Entity class for entity Organization (stored in table AD_Org).
 * <br>
 * Help: {@literal The Organization Tab is used to define an Organization.  Each Organization has a Key and
     *       Name and optionally a Description.  When adding a new organization, you must re-login to be able to
     *       access the new organization.
     *       Please note that you will not be able to create new entities in this
     *       window if you have not set defaults for all mandatory values!}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Organization extends BaseOBObject implements Traceable, ClientEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Org";
    public static final String ENTITY_NAME = "Organization";

    /**
     * Property id stored in column AD_Org_ID in table AD_Org<br>
     * Help: {@literal An organization is a unit of your client or legal entity - examples are store, department.
     *       You can share data between organizations.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Org 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property active stored in column IsActive in table AD_Org 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Org 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table AD_Org<br>
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
     * Property name stored in column Name in table AD_Org 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Org<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property summaryLevel stored in column IsSummary in table AD_Org<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property organizationType stored in column AD_Orgtype_ID in table AD_Org<br>
     * Help: {@literal Each organization belongs to an organization type defined in the system}
     * 
     */
    public static final String PROPERTY_ORGANIZATIONTYPE = "organizationType";

    /**
     * Property allowPeriodControl stored in column IsPeriodControlAllowed in table AD_Org<br>
     * Help: {@literal An organization that is checked as business unit or as a legal entity can open and close a
     *       period control.}
     * 
     */
    public static final String PROPERTY_ALLOWPERIODCONTROL = "allowPeriodControl";

    /**
     * Property calendar stored in column C_Calendar_ID in table AD_Org<br>
     * Help: {@literal The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used. 
     *       For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar
     *       that runs from July 1 to June 30.}
     * 
     */
    public static final String PROPERTY_CALENDAR = "calendar";

    /**
     * Property ready stored in column IsReady in table AD_Org<br>
     * Help: {@literal While the organization is not ready, it can be moved inside the organization's tree. A not
     *       ready organization can not execute transactions.}
     * 
     */
    public static final String PROPERTY_READY = "ready";

    /**
     * Property socialName stored in column Social_Name in table AD_Org<br>
     * Help: {@literal This column refer to the legal name of the organization.}
     * 
     */
    public static final String PROPERTY_SOCIALNAME = "socialName";

    /**
     * Property currency stored in column C_Currency_ID in table AD_Org<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property generalLedger stored in column C_Acctschema_ID in table AD_Org<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_GENERALLEDGER = "generalLedger";

    /**
     * Property periodControlAllowedOrganization stored in column AD_Periodcontrolallowed_Org_ID in table AD_Org<br>
     * Help: {@literal Organizarion that has Period Control Allowed flag true.}
     * 
     */
    public static final String PROPERTY_PERIODCONTROLALLOWEDORGANIZATION = "periodControlAllowedOrganization";

    /**
     * Property calendarOwnerOrganization stored in column AD_Calendarowner_Org_ID in table AD_Org<br>
     * Help: {@literal Organization that owns Calendar.}
     * 
     */
    public static final String PROPERTY_CALENDAROWNERORGANIZATION = "calendarOwnerOrganization";

    /**
     * Property aPRMGlitem stored in column EM_APRM_Glitem_ID in table AD_Org<br>
     * Help: {@literal Default G/L Item used for Funds Transfer Process in Financial Account Window}
     * 
     */
    public static final String PROPERTY_APRMGLITEM = "aPRMGlitem";

    /**
     * Property legalEntityOrganization stored in column AD_Legalentity_Org_ID in table AD_Org<br>
     * Help: {@literal Legal Entity Organization.}
     * 
     */
    public static final String PROPERTY_LEGALENTITYORGANIZATION = "legalEntityOrganization";

    /**
     * Property inheritedCalendar stored in column AD_Inheritedcalendar_ID in table AD_Org<br>
     * Help: {@literal Inerited Calendar from the organization that owns it.}
     * 
     */
    public static final String PROPERTY_INHERITEDCALENDAR = "inheritedCalendar";

    /**
     * Property businessUnitOrganization stored in column AD_Businessunit_Org_ID in table AD_Org<br>
     * Help: {@literal Business Unit Organization.}
     * 
     */
    public static final String PROPERTY_BUSINESSUNITORGANIZATION = "businessUnitOrganization";

    /**
     * Property extbpEnabled stored in column C_Extbp_Enabled in table AD_Org<br>
     * Help: {@literal It allows to configure an integration with an external CRM system}
     * 
     */
    public static final String PROPERTY_EXTBPENABLED = "extbpEnabled";

    /**
     * Property extbpConfig stored in column C_Extbp_Config_ID in table AD_Org<br>
     * Help: {@literal Configuration to connect to the CRM system API, and which also defines the properties and
     *       filters used by Openbravo to map with the external system information.}
     * 
     */
    public static final String PROPERTY_EXTBPCONFIG = "extbpConfig";

    /**
     * Property timezone stored in column Timezone in table AD_Org<br>
     * Help: {@literal Contains the definition of a Time zone according to Java's ZoneId class. This can be used
     *       to determine the time zone that should be used for a Date}
     * 
     */
    public static final String PROPERTY_TIMEZONE = "timezone";

    /**
     * Property reprintDocuments stored in column Reprint_Documents in table AD_Org<br>
     * Help: {@literal Allows to set whether reprintable documents are enabled or disabled for a given
     *       organization. When enabled, it is guaranteed that subsequent reprints at different points in time of
     *       the same document generate the same printable document. If it is not explicitly enabled for a given
     *       organization, then closest configuration in the parent organization tree is applied.}
     * 
     */
    public static final String PROPERTY_REPRINTDOCUMENTS = "reprintDocuments";

    /**
     * Property language stored in column Language in table AD_Org<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property organizationInformationList stored in table AD_Org
     * 
     */
    public static final String PROPERTY_ORGANIZATIONINFORMATIONLIST = "organizationInformationList";

    /**
     * Property organizationWarehouseList stored in table AD_Org
     * 
     */
    public static final String PROPERTY_ORGANIZATIONWAREHOUSELIST = "organizationWarehouseList";


    public Organization() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_ALLOWPERIODCONTROL, false);
        setDefaultValue(PROPERTY_READY, false);
        setDefaultValue(PROPERTY_EXTBPENABLED, false);
        setDefaultValue(PROPERTY_ORGANIZATIONINFORMATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORGANIZATIONWAREHOUSELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Organization#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Organization#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Organization#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Organization#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Organization#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Organization#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Organization#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Organization#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Organization#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Organization#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Organization#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Organization#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Organization#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Organization#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Organization#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Organization#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Organization#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Organization#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Organization#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Organization#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Organization#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see Organization#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see Organization#PROPERTY_ORGANIZATIONTYPE
     * 
     */
    public OrganizationType getOrganizationType() {
        return (OrganizationType) get(PROPERTY_ORGANIZATIONTYPE);
    }
    /**
     * @see Organization#PROPERTY_ORGANIZATIONTYPE
     * 
     */
    public void setOrganizationType(OrganizationType organizationType) {
        set(PROPERTY_ORGANIZATIONTYPE, organizationType);
    }

    /**
     * @see Organization#PROPERTY_ALLOWPERIODCONTROL
     * 
     */
    public Boolean isAllowPeriodControl() {
        return (Boolean) get(PROPERTY_ALLOWPERIODCONTROL);
    }
    /**
     * @see Organization#PROPERTY_ALLOWPERIODCONTROL
     * 
     */
    public void setAllowPeriodControl(Boolean allowPeriodControl) {
        set(PROPERTY_ALLOWPERIODCONTROL, allowPeriodControl);
    }

    /**
     * @see Organization#PROPERTY_CALENDAR
     * 
     */
    public Calendar getCalendar() {
        return (Calendar) get(PROPERTY_CALENDAR);
    }
    /**
     * @see Organization#PROPERTY_CALENDAR
     * 
     */
    public void setCalendar(Calendar calendar) {
        set(PROPERTY_CALENDAR, calendar);
    }

    /**
     * @see Organization#PROPERTY_READY
     * 
     */
    public Boolean isReady() {
        return (Boolean) get(PROPERTY_READY);
    }
    /**
     * @see Organization#PROPERTY_READY
     * 
     */
    public void setReady(Boolean ready) {
        set(PROPERTY_READY, ready);
    }

    /**
     * @see Organization#PROPERTY_SOCIALNAME
     * 
     */
    public String getSocialName() {
        return (String) get(PROPERTY_SOCIALNAME);
    }
    /**
     * @see Organization#PROPERTY_SOCIALNAME
     * 
     */
    public void setSocialName(String socialName) {
        set(PROPERTY_SOCIALNAME, socialName);
    }

    /**
     * @see Organization#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Organization#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Organization#PROPERTY_GENERALLEDGER
     * 
     */
    public AcctSchema getGeneralLedger() {
        return (AcctSchema) get(PROPERTY_GENERALLEDGER);
    }
    /**
     * @see Organization#PROPERTY_GENERALLEDGER
     * 
     */
    public void setGeneralLedger(AcctSchema generalLedger) {
        set(PROPERTY_GENERALLEDGER, generalLedger);
    }

    /**
     * @see Organization#PROPERTY_PERIODCONTROLALLOWEDORGANIZATION
     * 
     */
    public Organization getPeriodControlAllowedOrganization() {
        return (Organization) get(PROPERTY_PERIODCONTROLALLOWEDORGANIZATION);
    }
    /**
     * @see Organization#PROPERTY_PERIODCONTROLALLOWEDORGANIZATION
     * 
     */
    public void setPeriodControlAllowedOrganization(Organization periodControlAllowedOrganization) {
        set(PROPERTY_PERIODCONTROLALLOWEDORGANIZATION, periodControlAllowedOrganization);
    }

    /**
     * @see Organization#PROPERTY_CALENDAROWNERORGANIZATION
     * 
     */
    public Organization getCalendarOwnerOrganization() {
        return (Organization) get(PROPERTY_CALENDAROWNERORGANIZATION);
    }
    /**
     * @see Organization#PROPERTY_CALENDAROWNERORGANIZATION
     * 
     */
    public void setCalendarOwnerOrganization(Organization calendarOwnerOrganization) {
        set(PROPERTY_CALENDAROWNERORGANIZATION, calendarOwnerOrganization);
    }

    /**
     * @see Organization#PROPERTY_APRMGLITEM
     * 
     */
    public GLItem getAPRMGlitem() {
        return (GLItem) get(PROPERTY_APRMGLITEM);
    }
    /**
     * @see Organization#PROPERTY_APRMGLITEM
     * 
     */
    public void setAPRMGlitem(GLItem aPRMGlitem) {
        set(PROPERTY_APRMGLITEM, aPRMGlitem);
    }

    /**
     * @see Organization#PROPERTY_LEGALENTITYORGANIZATION
     * 
     */
    public Organization getLegalEntityOrganization() {
        return (Organization) get(PROPERTY_LEGALENTITYORGANIZATION);
    }
    /**
     * @see Organization#PROPERTY_LEGALENTITYORGANIZATION
     * 
     */
    public void setLegalEntityOrganization(Organization legalEntityOrganization) {
        set(PROPERTY_LEGALENTITYORGANIZATION, legalEntityOrganization);
    }

    /**
     * @see Organization#PROPERTY_INHERITEDCALENDAR
     * 
     */
    public Calendar getInheritedCalendar() {
        return (Calendar) get(PROPERTY_INHERITEDCALENDAR);
    }
    /**
     * @see Organization#PROPERTY_INHERITEDCALENDAR
     * 
     */
    public void setInheritedCalendar(Calendar inheritedCalendar) {
        set(PROPERTY_INHERITEDCALENDAR, inheritedCalendar);
    }

    /**
     * @see Organization#PROPERTY_BUSINESSUNITORGANIZATION
     * 
     */
    public Organization getBusinessUnitOrganization() {
        return (Organization) get(PROPERTY_BUSINESSUNITORGANIZATION);
    }
    /**
     * @see Organization#PROPERTY_BUSINESSUNITORGANIZATION
     * 
     */
    public void setBusinessUnitOrganization(Organization businessUnitOrganization) {
        set(PROPERTY_BUSINESSUNITORGANIZATION, businessUnitOrganization);
    }

    /**
     * @see Organization#PROPERTY_EXTBPENABLED
     * 
     */
    public Boolean isExtbpEnabled() {
        return (Boolean) get(PROPERTY_EXTBPENABLED);
    }
    /**
     * @see Organization#PROPERTY_EXTBPENABLED
     * 
     */
    public void setExtbpEnabled(Boolean extbpEnabled) {
        set(PROPERTY_EXTBPENABLED, extbpEnabled);
    }

    /**
     * @see Organization#PROPERTY_EXTBPCONFIG
     * 
     */
    public ExternalBusinessPartnerConfig getExtbpConfig() {
        return (ExternalBusinessPartnerConfig) get(PROPERTY_EXTBPCONFIG);
    }
    /**
     * @see Organization#PROPERTY_EXTBPCONFIG
     * 
     */
    public void setExtbpConfig(ExternalBusinessPartnerConfig extbpConfig) {
        set(PROPERTY_EXTBPCONFIG, extbpConfig);
    }

    /**
     * @see Organization#PROPERTY_TIMEZONE
     * 
     */
    public String getTimezone() {
        return (String) get(PROPERTY_TIMEZONE);
    }
    /**
     * @see Organization#PROPERTY_TIMEZONE
     * 
     */
    public void setTimezone(String timezone) {
        set(PROPERTY_TIMEZONE, timezone);
    }

    /**
     * @see Organization#PROPERTY_REPRINTDOCUMENTS
     * 
     */
    public String getReprintDocuments() {
        return (String) get(PROPERTY_REPRINTDOCUMENTS);
    }
    /**
     * @see Organization#PROPERTY_REPRINTDOCUMENTS
     * 
     */
    public void setReprintDocuments(String reprintDocuments) {
        set(PROPERTY_REPRINTDOCUMENTS, reprintDocuments);
    }

    /**
     * @see Organization#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see Organization#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * Help: {@literal The Organization Info Tab is used to define an Organization's address, DUNS number and Tax
     *       Identification number}<br>
     * @see OrganizationInformation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrganizationInformation> getOrganizationInformationList() {
      return (List<OrganizationInformation>) get(PROPERTY_ORGANIZATIONINFORMATIONLIST);
    }

    /**
     * Help: {@literal The Organization Info Tab is used to define an Organization's address, DUNS number and Tax
     *       Identification number}<br>
     * @see OrganizationInformation
     * 
     */
    public void setOrganizationInformationList(List<OrganizationInformation> organizationInformationList) {
        set(PROPERTY_ORGANIZATIONINFORMATIONLIST, organizationInformationList);
    }

    /**
     * Help: {@literal Defines the on-hand warehouses of an Organization and its usage priority.}<br>
     * @see OrgWarehouse
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrgWarehouse> getOrganizationWarehouseList() {
      return (List<OrgWarehouse>) get(PROPERTY_ORGANIZATIONWAREHOUSELIST);
    }

    /**
     * Help: {@literal Defines the on-hand warehouses of an Organization and its usage priority.}<br>
     * @see OrgWarehouse
     * 
     */
    public void setOrganizationWarehouseList(List<OrgWarehouse> organizationWarehouseList) {
        set(PROPERTY_ORGANIZATIONWAREHOUSELIST, organizationWarehouseList);
    }

}
