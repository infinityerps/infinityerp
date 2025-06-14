
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
package org.openbravo.model.externalbpartner;

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
import org.openbravo.model.ad.ui.Message;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.service.externalsystem.ExternalSystemData;
/**
 * Entity class for entity C_ExtBP_Config_Property (stored in table C_ExtBP_Config_Property).
 * <br>
 * Help: {@literal A property is like a Map which matches an external API key with an Openbravo
     *       AD_Message_ID. It defines the data type and any other related configuration}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExternalBusinessPartnerConfigProperty extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ExtBP_Config_Property";
    public static final String ENTITY_NAME = "C_ExtBP_Config_Property";

    /**
     * Property id stored in column C_Extbp_Config_Property_ID in table C_ExtBP_Config_Property<br>
     * Help: {@literal CRM Connector Property}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ExtBP_Config_Property 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ExtBP_Config_Property 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_ExtBP_Config_Property 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ExtBP_Config_Property 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_ExtBP_Config_Property 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ExtBP_Config_Property 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_ExtBP_Config_Property 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property externalBusinessPartnerIntegrationConfiguration stored in column C_Extbp_Config_ID in table C_ExtBP_Config_Property<br>
     * Help: {@literal Configuration to connect to the CRM system API, and which also defines the properties and
     *       filters used by Openbravo to map with the external system information.}
     * 
     */
    public static final String PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION = "externalBusinessPartnerIntegrationConfiguration";

    /**
     * Property apiKey stored in column ApiKey in table C_ExtBP_Config_Property 
     * 
     */
    public static final String PROPERTY_APIKEY = "apiKey";

    /**
     * Property message stored in column AD_Message_ID in table C_ExtBP_Config_Property<br>
     * Help: {@literal Message with the text to be used when the property or filter is translatable}
     * 
     */
    public static final String PROPERTY_MESSAGE = "message";

    /**
     * Property reference stored in column AD_Reference in table C_ExtBP_Config_Property<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property usedAsRecordIdentifier stored in column IsIdentifier in table C_ExtBP_Config_Property<br>
     * Help: {@literal The Identifier checkbox indicates that this column is part of the identifier or key for
     *       this table}
     * 
     */
    public static final String PROPERTY_USEDASRECORDIDENTIFIER = "usedAsRecordIdentifier";

    /**
     * Property identifierSequenceNumber stored in column Identifier_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal The sequence indicates the order for the properties within the identifier}
     * 
     */
    public static final String PROPERTY_IDENTIFIERSEQUENCENUMBER = "identifierSequenceNumber";

    /**
     * Property displayInDetail stored in column IsDisplayedInDetail in table C_ExtBP_Config_Property<br>
     * Help: {@literal If checked, the property will be shown in the detail view}
     * 
     */
    public static final String PROPERTY_DISPLAYINDETAIL = "displayInDetail";

    /**
     * Property detailSequenceNumber stored in column Detail_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence to display the property in detail view}
     * 
     */
    public static final String PROPERTY_DETAILSEQUENCENUMBER = "detailSequenceNumber";

    /**
     * Property displayInList stored in column IsDisplayedInList in table C_ExtBP_Config_Property<br>
     * Help: {@literal If checked, the property will be shown in the results list view}
     * 
     */
    public static final String PROPERTY_DISPLAYINLIST = "displayInList";

    /**
     * Property listSequenceNumber stored in column List_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence to display the property in the results list view}
     * 
     */
    public static final String PROPERTY_LISTSEQUENCENUMBER = "listSequenceNumber";

    /**
     * Property editable stored in column IsEditable in table C_ExtBP_Config_Property<br>
     * Help: {@literal It checked, the property can be edited}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_EDITABLE = "editable";

    /**
     * Property keyColumn stored in column IsKey in table C_ExtBP_Config_Property<br>
     * Help: {@literal The key column must also be display sequence 0 in the field definition and may be hidden.}
     * 
     */
    public static final String PROPERTY_KEYCOLUMN = "keyColumn";

    /**
     * Property section stored in column Sectionmessage_ID in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_SECTION = "section";

    /**
     * Property mandatory stored in column Ismandatory in table C_ExtBP_Config_Property<br>
     * Help: {@literal The Mandatory checkbox indicates if the field is required for a record to be save to the
     *       database.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_MANDATORY = "mandatory";

    /**
     * Property translatable stored in column Istranslatable in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_TRANSLATABLE = "translatable";

    /**
     * Property text stored in column Text in table C_ExtBP_Config_Property<br>
     * Help: {@literal Text to be used when the property or filter is not translatable}
     * 
     */
    public static final String PROPERTY_TEXT = "text";

    /**
     * Property categoryKey stored in column IsCategoryKey in table C_ExtBP_Config_Property<br>
     * Help: {@literal If checked, the property will be used as category key.}
     * 
     */
    public static final String PROPERTY_CATEGORYKEY = "categoryKey";

    /**
     * Property categoryKeySequenceNumber stored in column CategoryKey_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence in the category key}
     * 
     */
    public static final String PROPERTY_CATEGORYKEYSEQUENCENUMBER = "categoryKeySequenceNumber";

    /**
     * Property isdefaultemail stored in column Isdefaultemail in table C_ExtBP_Config_Property<br>
     * Help: {@literal If enabled, this record will be used to retrieve the default Email of the customer}
     * 
     */
    public static final String PROPERTY_ISDEFAULTEMAIL = "isdefaultemail";

    /**
     * Property detailColspan stored in column Detail_Colspan in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_DETAILCOLSPAN = "detailColspan";

    /**
     * Property listColspan stored in column List_Colspan in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_LISTCOLSPAN = "listColspan";

    /**
     * Property isbirthdaydate stored in column Isbirthdaydate in table C_ExtBP_Config_Property<br>
     * Help: {@literal If enabled, this record will be used as birthday date of the customer}
     * 
     */
    public static final String PROPERTY_ISBIRTHDAYDATE = "isbirthdaydate";

    /**
     * Property displayInCreate stored in column Isdisplayedincreate in table C_ExtBP_Config_Property<br>
     * Help: {@literal If checked, the property will be shown in the create view}
     * 
     */
    public static final String PROPERTY_DISPLAYINCREATE = "displayInCreate";

    /**
     * Property displayInEdit stored in column Isdisplayedinedit in table C_ExtBP_Config_Property<br>
     * Help: {@literal If checked, the property will be shown in the edit view}
     * 
     */
    public static final String PROPERTY_DISPLAYINEDIT = "displayInEdit";

    /**
     * Property createSequenceNumber stored in column Create_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence to display the property in create view}
     * 
     */
    public static final String PROPERTY_CREATESEQUENCENUMBER = "createSequenceNumber";

    /**
     * Property editSequenceNumber stored in column Edit_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence to display the property in edit view}
     * 
     */
    public static final String PROPERTY_EDITSEQUENCENUMBER = "editSequenceNumber";

    /**
     * Property sectionCreate stored in column Sectionmessagecreate_ID in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_SECTIONCREATE = "sectionCreate";

    /**
     * Property sectionEdit stored in column Sectionmessageedit_ID in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_SECTIONEDIT = "sectionEdit";

    /**
     * Property createColspan stored in column Create_Colspan in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_CREATECOLSPAN = "createColspan";

    /**
     * Property editColspan stored in column Edit_Colspan in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_EDITCOLSPAN = "editColspan";

    /**
     * Property isdefaultphone stored in column Isdefaultphone in table C_ExtBP_Config_Property<br>
     * Help: {@literal If checked, this will be used as the default Phone number of the customer when present.}
     * 
     */
    public static final String PROPERTY_ISDEFAULTPHONE = "isdefaultphone";

    /**
     * Property isAddressProperty stored in column IsAddressProperty in table C_ExtBP_Config_Property<br>
     * Help: {@literal Defines if a property is considered for address only flows}
     * 
     */
    public static final String PROPERTY_ISADDRESSPROPERTY = "isAddressProperty";

    /**
     * Property isDisplayedInCustomersWindow stored in column IsDisplayedInCustomersWindow in table C_ExtBP_Config_Property<br>
     * Help: {@literal If checked, the property will be shown in the Customers Window}
     * 
     */
    public static final String PROPERTY_ISDISPLAYEDINCUSTOMERSWINDOW = "isDisplayedInCustomersWindow";

    /**
     * Property customersWindowSeqNo stored in column CustomersWindow_SeqNo in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence to display the property in Customers Window}
     * 
     */
    public static final String PROPERTY_CUSTOMERSWINDOWSEQNO = "customersWindowSeqNo";

    /**
     * Property useAsMarketingConsentForEmail stored in column Isemailmarketingconsent in table C_ExtBP_Config_Property<br>
     * Help: {@literal If enabled, the customer gives his marketing consent}
     * 
     */
    public static final String PROPERTY_USEASMARKETINGCONSENTFOREMAIL = "useAsMarketingConsentForEmail";

    /**
     * Property identifierscanningaction stored in column Identifierscanningaction in table C_ExtBP_Config_Property<br>
     * Help: {@literal Use as identifier for scanning action}
     * 
     */
    public static final String PROPERTY_IDENTIFIERSCANNINGACTION = "identifierscanningaction";

    /**
     * Property crmBusinessProperty stored in column crmBusinessProperty in table C_ExtBP_Config_Property<br>
     * Help: {@literal Semantic field type for the CRM property}
     * 
     */
    public static final String PROPERTY_CRMBUSINESSPROPERTY = "crmBusinessProperty";

    /**
     * Property ismandatoryCreate stored in column Ismandatory_Create in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_ISMANDATORYCREATE = "ismandatoryCreate";

    /**
     * Property ismandatoryEdit stored in column Ismandatory_Edit in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_ISMANDATORYEDIT = "ismandatoryEdit";

    /**
     * Property iseditableCreate stored in column Iseditable_Create in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_ISEDITABLECREATE = "iseditableCreate";

    /**
     * Property iseditableEdit stored in column Iseditable_Edit in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_ISEDITABLEEDIT = "iseditableEdit";

    /**
     * Property isunique stored in column Isunique in table C_ExtBP_Config_Property<br>
     * Help: {@literal Indicates whether duplicate values are not allowed for this field, so there cannot be two
     *       records having the same value for this field}
     * 
     */
    public static final String PROPERTY_ISUNIQUE = "isunique";

    /**
     * Property filterForUnique stored in column C_Extbp_Config_Filter_ID in table C_ExtBP_Config_Property<br>
     * Help: {@literal Filter used to detect duplicate values in this field}
     * 
     */
    public static final String PROPERTY_FILTERFORUNIQUE = "filterForUnique";

    /**
     * Property suggestions stored in column Suggestions in table C_ExtBP_Config_Property<br>
     * Help: {@literal Indicates if this property can receive suggestions and  the type of suggestion}
     * 
     */
    public static final String PROPERTY_SUGGESTIONS = "suggestions";

    /**
     * Property suggestionsExtSystem stored in column Suggestions_Ext_System_ID in table C_ExtBP_Config_Property<br>
     * Help: {@literal The external system used to propose suggestions}
     * 
     */
    public static final String PROPERTY_SUGGESTIONSEXTSYSTEM = "suggestionsExtSystem";

    /**
     * Property suggestionsMinChars stored in column Suggestions_Min_Chars in table C_ExtBP_Config_Property<br>
     * Help: {@literal The minimum number of characters that must be typed to propose suggestions}
     * 
     */
    public static final String PROPERTY_SUGGESTIONSMINCHARS = "suggestionsMinChars";

    /**
     * Property validation stored in column Validation in table C_ExtBP_Config_Property<br>
     * Help: {@literal Validation mode for the data. Possible values:
     *        - No: No validation.
     *        - Informative: Only
     *       shows a notification.
     *        - Required to Save the Record: Data is required to change the value.}
     * 
     */
    public static final String PROPERTY_VALIDATION = "validation";

    /**
     * Property validationtype stored in column Validationtype in table C_ExtBP_Config_Property<br>
     * Help: {@literal Type of validation for the data. Possible values:
     *        - Empty: Checks if the value is empty
     *       or not.
     *        - Regular Expression: Checks if the value is correct due a regular expression.
     *        - DQM:
     *       Checks if the values is correct due an external DQM.}
     * 
     */
    public static final String PROPERTY_VALIDATIONTYPE = "validationtype";

    /**
     * Property selectornotification stored in column Selectornotification in table C_ExtBP_Config_Property<br>
     * Help: {@literal Parameter to show a notificacion icon in Selector Results List. Possible values:
     *        - No:
     *       Nothing will be shown.
     *        - Wrong format: Shows an icon if notification engine determines that value
     *       is not correct.}
     * 
     */
    public static final String PROPERTY_SELECTORNOTIFICATION = "selectornotification";

    /**
     * Property selectornotificationSeqno stored in column Selectornotif_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence number for Notification Icon in Selector Results List}
     * 
     */
    public static final String PROPERTY_SELECTORNOTIFICATIONSEQNO = "selectornotificationSeqno";

    /**
     * Property headernotification stored in column Headernotification in table C_ExtBP_Config_Property<br>
     * Help: {@literal Parameter to show a notificacion icon in Order Header. Possible values:
     *        - No: Nothing
     *       will be shown.
     *        - Wrong format: Shows an icon if notification engine determines that value is not
     *       correct.}
     * 
     */
    public static final String PROPERTY_HEADERNOTIFICATION = "headernotification";

    /**
     * Property headernotificationSeqno stored in column Headernotif_Seqno in table C_ExtBP_Config_Property<br>
     * Help: {@literal Sequence number for Notification Icon in Order Header.}
     * 
     */
    public static final String PROPERTY_HEADERNOTIFICATIONSEQNO = "headernotificationSeqno";

    /**
     * Property validationregexp stored in column Validationregexp in table C_ExtBP_Config_Property<br>
     * Help: {@literal Regular Expression string to validate the validations}
     * 
     */
    public static final String PROPERTY_VALIDATIONREGEXP = "validationregexp";

    /**
     * Property validationExtSystem stored in column Validation_Ext_System_ID in table C_ExtBP_Config_Property<br>
     * Help: {@literal The external system used to validate the field}
     * 
     */
    public static final String PROPERTY_VALIDATIONEXTSYSTEM = "validationExtSystem";

    /**
     * Property extBPConfigPropOptList stored in table C_ExtBP_Config_Property
     * 
     */
    public static final String PROPERTY_EXTBPCONFIGPROPOPTLIST = "extBPConfigPropOptList";


    public ExternalBusinessPartnerConfigProperty() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_USEDASRECORDIDENTIFIER, false);
        setDefaultValue(PROPERTY_DISPLAYINDETAIL, false);
        setDefaultValue(PROPERTY_DISPLAYINLIST, false);
        setDefaultValue(PROPERTY_EDITABLE, true);
        setDefaultValue(PROPERTY_KEYCOLUMN, false);
        setDefaultValue(PROPERTY_MANDATORY, true);
        setDefaultValue(PROPERTY_TRANSLATABLE, true);
        setDefaultValue(PROPERTY_CATEGORYKEY, false);
        setDefaultValue(PROPERTY_ISDEFAULTEMAIL, false);
        setDefaultValue(PROPERTY_DETAILCOLSPAN, (long) 1);
        setDefaultValue(PROPERTY_LISTCOLSPAN, (long) 1);
        setDefaultValue(PROPERTY_ISBIRTHDAYDATE, false);
        setDefaultValue(PROPERTY_DISPLAYINCREATE, false);
        setDefaultValue(PROPERTY_DISPLAYINEDIT, false);
        setDefaultValue(PROPERTY_CREATECOLSPAN, (long) 1);
        setDefaultValue(PROPERTY_EDITCOLSPAN, (long) 1);
        setDefaultValue(PROPERTY_ISDEFAULTPHONE, false);
        setDefaultValue(PROPERTY_ISADDRESSPROPERTY, false);
        setDefaultValue(PROPERTY_ISDISPLAYEDINCUSTOMERSWINDOW, false);
        setDefaultValue(PROPERTY_USEASMARKETINGCONSENTFOREMAIL, false);
        setDefaultValue(PROPERTY_IDENTIFIERSCANNINGACTION, false);
        setDefaultValue(PROPERTY_ISMANDATORYCREATE, false);
        setDefaultValue(PROPERTY_ISMANDATORYEDIT, false);
        setDefaultValue(PROPERTY_ISEDITABLECREATE, false);
        setDefaultValue(PROPERTY_ISEDITABLEEDIT, false);
        setDefaultValue(PROPERTY_ISUNIQUE, false);
        setDefaultValue(PROPERTY_SUGGESTIONS, "NO_SUGGEST");
        setDefaultValue(PROPERTY_SUGGESTIONSMINCHARS, (long) 3);
        setDefaultValue(PROPERTY_VALIDATION, "no");
        setDefaultValue(PROPERTY_VALIDATIONTYPE, "empty");
        setDefaultValue(PROPERTY_SELECTORNOTIFICATION, "no");
        setDefaultValue(PROPERTY_HEADERNOTIFICATION, "no");
        setDefaultValue(PROPERTY_EXTBPCONFIGPROPOPTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION
     * 
     */
    public ExternalBusinessPartnerConfig getExternalBusinessPartnerIntegrationConfiguration() {
        return (ExternalBusinessPartnerConfig) get(PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION
     * 
     */
    public void setExternalBusinessPartnerIntegrationConfiguration(ExternalBusinessPartnerConfig externalBusinessPartnerIntegrationConfiguration) {
        set(PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION, externalBusinessPartnerIntegrationConfiguration);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_APIKEY
     * 
     */
    public String getApiKey() {
        return (String) get(PROPERTY_APIKEY);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_APIKEY
     * 
     */
    public void setApiKey(String apiKey) {
        set(PROPERTY_APIKEY, apiKey);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_MESSAGE
     * 
     */
    public Message getMessage() {
        return (Message) get(PROPERTY_MESSAGE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_MESSAGE
     * 
     */
    public void setMessage(Message message) {
        set(PROPERTY_MESSAGE, message);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_REFERENCE
     * 
     */
    public String getReference() {
        return (String) get(PROPERTY_REFERENCE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_REFERENCE
     * 
     */
    public void setReference(String reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_USEDASRECORDIDENTIFIER
     * 
     */
    public Boolean isUsedAsRecordIdentifier() {
        return (Boolean) get(PROPERTY_USEDASRECORDIDENTIFIER);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_USEDASRECORDIDENTIFIER
     * 
     */
    public void setUsedAsRecordIdentifier(Boolean usedAsRecordIdentifier) {
        set(PROPERTY_USEDASRECORDIDENTIFIER, usedAsRecordIdentifier);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_IDENTIFIERSEQUENCENUMBER
     * 
     */
    public Long getIdentifierSequenceNumber() {
        return (Long) get(PROPERTY_IDENTIFIERSEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_IDENTIFIERSEQUENCENUMBER
     * 
     */
    public void setIdentifierSequenceNumber(Long identifierSequenceNumber) {
        set(PROPERTY_IDENTIFIERSEQUENCENUMBER, identifierSequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINDETAIL
     * 
     */
    public Boolean isDisplayInDetail() {
        return (Boolean) get(PROPERTY_DISPLAYINDETAIL);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINDETAIL
     * 
     */
    public void setDisplayInDetail(Boolean displayInDetail) {
        set(PROPERTY_DISPLAYINDETAIL, displayInDetail);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DETAILSEQUENCENUMBER
     * 
     */
    public Long getDetailSequenceNumber() {
        return (Long) get(PROPERTY_DETAILSEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DETAILSEQUENCENUMBER
     * 
     */
    public void setDetailSequenceNumber(Long detailSequenceNumber) {
        set(PROPERTY_DETAILSEQUENCENUMBER, detailSequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINLIST
     * 
     */
    public Boolean isDisplayInList() {
        return (Boolean) get(PROPERTY_DISPLAYINLIST);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINLIST
     * 
     */
    public void setDisplayInList(Boolean displayInList) {
        set(PROPERTY_DISPLAYINLIST, displayInList);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_LISTSEQUENCENUMBER
     * 
     */
    public Long getListSequenceNumber() {
        return (Long) get(PROPERTY_LISTSEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_LISTSEQUENCENUMBER
     * 
     */
    public void setListSequenceNumber(Long listSequenceNumber) {
        set(PROPERTY_LISTSEQUENCENUMBER, listSequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EDITABLE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isEditable() {
        return (Boolean) get(PROPERTY_EDITABLE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EDITABLE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setEditable(Boolean editable) {
        set(PROPERTY_EDITABLE, editable);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_KEYCOLUMN
     * 
     */
    public Boolean isKeyColumn() {
        return (Boolean) get(PROPERTY_KEYCOLUMN);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_KEYCOLUMN
     * 
     */
    public void setKeyColumn(Boolean keyColumn) {
        set(PROPERTY_KEYCOLUMN, keyColumn);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SECTION
     * 
     */
    public Message getSection() {
        return (Message) get(PROPERTY_SECTION);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SECTION
     * 
     */
    public void setSection(Message section) {
        set(PROPERTY_SECTION, section);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_MANDATORY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isMandatory() {
        return (Boolean) get(PROPERTY_MANDATORY);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_MANDATORY
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setMandatory(Boolean mandatory) {
        set(PROPERTY_MANDATORY, mandatory);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_TRANSLATABLE
     * 
     */
    public Boolean isTranslatable() {
        return (Boolean) get(PROPERTY_TRANSLATABLE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_TRANSLATABLE
     * 
     */
    public void setTranslatable(Boolean translatable) {
        set(PROPERTY_TRANSLATABLE, translatable);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_TEXT
     * 
     */
    public String getText() {
        return (String) get(PROPERTY_TEXT);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_TEXT
     * 
     */
    public void setText(String text) {
        set(PROPERTY_TEXT, text);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CATEGORYKEY
     * 
     */
    public Boolean isCategoryKey() {
        return (Boolean) get(PROPERTY_CATEGORYKEY);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CATEGORYKEY
     * 
     */
    public void setCategoryKey(Boolean categoryKey) {
        set(PROPERTY_CATEGORYKEY, categoryKey);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CATEGORYKEYSEQUENCENUMBER
     * 
     */
    public Long getCategoryKeySequenceNumber() {
        return (Long) get(PROPERTY_CATEGORYKEYSEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CATEGORYKEYSEQUENCENUMBER
     * 
     */
    public void setCategoryKeySequenceNumber(Long categoryKeySequenceNumber) {
        set(PROPERTY_CATEGORYKEYSEQUENCENUMBER, categoryKeySequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISDEFAULTEMAIL
     * 
     */
    public Boolean isDefaultemail() {
        return (Boolean) get(PROPERTY_ISDEFAULTEMAIL);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISDEFAULTEMAIL
     * 
     */
    public void setDefaultemail(Boolean isdefaultemail) {
        set(PROPERTY_ISDEFAULTEMAIL, isdefaultemail);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DETAILCOLSPAN
     * 
     */
    public Long getDetailColspan() {
        return (Long) get(PROPERTY_DETAILCOLSPAN);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DETAILCOLSPAN
     * 
     */
    public void setDetailColspan(Long detailColspan) {
        set(PROPERTY_DETAILCOLSPAN, detailColspan);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_LISTCOLSPAN
     * 
     */
    public Long getListColspan() {
        return (Long) get(PROPERTY_LISTCOLSPAN);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_LISTCOLSPAN
     * 
     */
    public void setListColspan(Long listColspan) {
        set(PROPERTY_LISTCOLSPAN, listColspan);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISBIRTHDAYDATE
     * 
     */
    public Boolean isBirthdaydate() {
        return (Boolean) get(PROPERTY_ISBIRTHDAYDATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISBIRTHDAYDATE
     * 
     */
    public void setBirthdaydate(Boolean isbirthdaydate) {
        set(PROPERTY_ISBIRTHDAYDATE, isbirthdaydate);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINCREATE
     * 
     */
    public Boolean isDisplayInCreate() {
        return (Boolean) get(PROPERTY_DISPLAYINCREATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINCREATE
     * 
     */
    public void setDisplayInCreate(Boolean displayInCreate) {
        set(PROPERTY_DISPLAYINCREATE, displayInCreate);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINEDIT
     * 
     */
    public Boolean isDisplayInEdit() {
        return (Boolean) get(PROPERTY_DISPLAYINEDIT);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_DISPLAYINEDIT
     * 
     */
    public void setDisplayInEdit(Boolean displayInEdit) {
        set(PROPERTY_DISPLAYINEDIT, displayInEdit);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATESEQUENCENUMBER
     * 
     */
    public Long getCreateSequenceNumber() {
        return (Long) get(PROPERTY_CREATESEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATESEQUENCENUMBER
     * 
     */
    public void setCreateSequenceNumber(Long createSequenceNumber) {
        set(PROPERTY_CREATESEQUENCENUMBER, createSequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EDITSEQUENCENUMBER
     * 
     */
    public Long getEditSequenceNumber() {
        return (Long) get(PROPERTY_EDITSEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EDITSEQUENCENUMBER
     * 
     */
    public void setEditSequenceNumber(Long editSequenceNumber) {
        set(PROPERTY_EDITSEQUENCENUMBER, editSequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SECTIONCREATE
     * 
     */
    public Message getSectionCreate() {
        return (Message) get(PROPERTY_SECTIONCREATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SECTIONCREATE
     * 
     */
    public void setSectionCreate(Message sectionCreate) {
        set(PROPERTY_SECTIONCREATE, sectionCreate);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SECTIONEDIT
     * 
     */
    public Message getSectionEdit() {
        return (Message) get(PROPERTY_SECTIONEDIT);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SECTIONEDIT
     * 
     */
    public void setSectionEdit(Message sectionEdit) {
        set(PROPERTY_SECTIONEDIT, sectionEdit);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATECOLSPAN
     * 
     */
    public Long getCreateColspan() {
        return (Long) get(PROPERTY_CREATECOLSPAN);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CREATECOLSPAN
     * 
     */
    public void setCreateColspan(Long createColspan) {
        set(PROPERTY_CREATECOLSPAN, createColspan);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EDITCOLSPAN
     * 
     */
    public Long getEditColspan() {
        return (Long) get(PROPERTY_EDITCOLSPAN);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_EDITCOLSPAN
     * 
     */
    public void setEditColspan(Long editColspan) {
        set(PROPERTY_EDITCOLSPAN, editColspan);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISDEFAULTPHONE
     * 
     */
    public Boolean isDefaultphone() {
        return (Boolean) get(PROPERTY_ISDEFAULTPHONE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISDEFAULTPHONE
     * 
     */
    public void setDefaultphone(Boolean isdefaultphone) {
        set(PROPERTY_ISDEFAULTPHONE, isdefaultphone);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISADDRESSPROPERTY
     * 
     */
    public Boolean isAddressProperty() {
        return (Boolean) get(PROPERTY_ISADDRESSPROPERTY);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISADDRESSPROPERTY
     * 
     */
    public void setAddressProperty(Boolean isAddressProperty) {
        set(PROPERTY_ISADDRESSPROPERTY, isAddressProperty);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISDISPLAYEDINCUSTOMERSWINDOW
     * 
     */
    public Boolean isDisplayedInCustomersWindow() {
        return (Boolean) get(PROPERTY_ISDISPLAYEDINCUSTOMERSWINDOW);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISDISPLAYEDINCUSTOMERSWINDOW
     * 
     */
    public void setDisplayedInCustomersWindow(Boolean isDisplayedInCustomersWindow) {
        set(PROPERTY_ISDISPLAYEDINCUSTOMERSWINDOW, isDisplayedInCustomersWindow);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CUSTOMERSWINDOWSEQNO
     * 
     */
    public Long getCustomersWindowSeqNo() {
        return (Long) get(PROPERTY_CUSTOMERSWINDOWSEQNO);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CUSTOMERSWINDOWSEQNO
     * 
     */
    public void setCustomersWindowSeqNo(Long customersWindowSeqNo) {
        set(PROPERTY_CUSTOMERSWINDOWSEQNO, customersWindowSeqNo);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_USEASMARKETINGCONSENTFOREMAIL
     * 
     */
    public Boolean isUseAsMarketingConsentForEmail() {
        return (Boolean) get(PROPERTY_USEASMARKETINGCONSENTFOREMAIL);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_USEASMARKETINGCONSENTFOREMAIL
     * 
     */
    public void setUseAsMarketingConsentForEmail(Boolean useAsMarketingConsentForEmail) {
        set(PROPERTY_USEASMARKETINGCONSENTFOREMAIL, useAsMarketingConsentForEmail);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_IDENTIFIERSCANNINGACTION
     * 
     */
    public Boolean isIdentifierscanningaction() {
        return (Boolean) get(PROPERTY_IDENTIFIERSCANNINGACTION);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_IDENTIFIERSCANNINGACTION
     * 
     */
    public void setIdentifierscanningaction(Boolean identifierscanningaction) {
        set(PROPERTY_IDENTIFIERSCANNINGACTION, identifierscanningaction);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CRMBUSINESSPROPERTY
     * 
     */
    public String getCrmBusinessProperty() {
        return (String) get(PROPERTY_CRMBUSINESSPROPERTY);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_CRMBUSINESSPROPERTY
     * 
     */
    public void setCrmBusinessProperty(String crmBusinessProperty) {
        set(PROPERTY_CRMBUSINESSPROPERTY, crmBusinessProperty);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISMANDATORYCREATE
     * 
     */
    public Boolean isMandatoryCreate() {
        return (Boolean) get(PROPERTY_ISMANDATORYCREATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISMANDATORYCREATE
     * 
     */
    public void setMandatoryCreate(Boolean ismandatoryCreate) {
        set(PROPERTY_ISMANDATORYCREATE, ismandatoryCreate);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISMANDATORYEDIT
     * 
     */
    public Boolean isMandatoryEdit() {
        return (Boolean) get(PROPERTY_ISMANDATORYEDIT);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISMANDATORYEDIT
     * 
     */
    public void setMandatoryEdit(Boolean ismandatoryEdit) {
        set(PROPERTY_ISMANDATORYEDIT, ismandatoryEdit);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISEDITABLECREATE
     * 
     */
    public Boolean isEditableCreate() {
        return (Boolean) get(PROPERTY_ISEDITABLECREATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISEDITABLECREATE
     * 
     */
    public void setEditableCreate(Boolean iseditableCreate) {
        set(PROPERTY_ISEDITABLECREATE, iseditableCreate);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISEDITABLEEDIT
     * 
     */
    public Boolean isEditableEdit() {
        return (Boolean) get(PROPERTY_ISEDITABLEEDIT);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISEDITABLEEDIT
     * 
     */
    public void setEditableEdit(Boolean iseditableEdit) {
        set(PROPERTY_ISEDITABLEEDIT, iseditableEdit);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISUNIQUE
     * 
     */
    public Boolean isUnique() {
        return (Boolean) get(PROPERTY_ISUNIQUE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_ISUNIQUE
     * 
     */
    public void setUnique(Boolean isunique) {
        set(PROPERTY_ISUNIQUE, isunique);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_FILTERFORUNIQUE
     * 
     */
    public ExternalBusinessPartnerConfigFilter getFilterForUnique() {
        return (ExternalBusinessPartnerConfigFilter) get(PROPERTY_FILTERFORUNIQUE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_FILTERFORUNIQUE
     * 
     */
    public void setFilterForUnique(ExternalBusinessPartnerConfigFilter filterForUnique) {
        set(PROPERTY_FILTERFORUNIQUE, filterForUnique);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SUGGESTIONS
     * 
     */
    public String getSuggestions() {
        return (String) get(PROPERTY_SUGGESTIONS);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SUGGESTIONS
     * 
     */
    public void setSuggestions(String suggestions) {
        set(PROPERTY_SUGGESTIONS, suggestions);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SUGGESTIONSEXTSYSTEM
     * 
     */
    public ExternalSystemData getSuggestionsExtSystem() {
        return (ExternalSystemData) get(PROPERTY_SUGGESTIONSEXTSYSTEM);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SUGGESTIONSEXTSYSTEM
     * 
     */
    public void setSuggestionsExtSystem(ExternalSystemData suggestionsExtSystem) {
        set(PROPERTY_SUGGESTIONSEXTSYSTEM, suggestionsExtSystem);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SUGGESTIONSMINCHARS
     * 
     */
    public Long getSuggestionsMinChars() {
        return (Long) get(PROPERTY_SUGGESTIONSMINCHARS);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SUGGESTIONSMINCHARS
     * 
     */
    public void setSuggestionsMinChars(Long suggestionsMinChars) {
        set(PROPERTY_SUGGESTIONSMINCHARS, suggestionsMinChars);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATION
     * 
     */
    public String getValidation() {
        return (String) get(PROPERTY_VALIDATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATION
     * 
     */
    public void setValidation(String validation) {
        set(PROPERTY_VALIDATION, validation);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATIONTYPE
     * 
     */
    public String getValidationtype() {
        return (String) get(PROPERTY_VALIDATIONTYPE);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATIONTYPE
     * 
     */
    public void setValidationtype(String validationtype) {
        set(PROPERTY_VALIDATIONTYPE, validationtype);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SELECTORNOTIFICATION
     * 
     */
    public String getSelectornotification() {
        return (String) get(PROPERTY_SELECTORNOTIFICATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SELECTORNOTIFICATION
     * 
     */
    public void setSelectornotification(String selectornotification) {
        set(PROPERTY_SELECTORNOTIFICATION, selectornotification);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SELECTORNOTIFICATIONSEQNO
     * 
     */
    public Long getSelectornotificationSeqno() {
        return (Long) get(PROPERTY_SELECTORNOTIFICATIONSEQNO);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_SELECTORNOTIFICATIONSEQNO
     * 
     */
    public void setSelectornotificationSeqno(Long selectornotificationSeqno) {
        set(PROPERTY_SELECTORNOTIFICATIONSEQNO, selectornotificationSeqno);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_HEADERNOTIFICATION
     * 
     */
    public String getHeadernotification() {
        return (String) get(PROPERTY_HEADERNOTIFICATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_HEADERNOTIFICATION
     * 
     */
    public void setHeadernotification(String headernotification) {
        set(PROPERTY_HEADERNOTIFICATION, headernotification);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_HEADERNOTIFICATIONSEQNO
     * 
     */
    public Long getHeadernotificationSeqno() {
        return (Long) get(PROPERTY_HEADERNOTIFICATIONSEQNO);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_HEADERNOTIFICATIONSEQNO
     * 
     */
    public void setHeadernotificationSeqno(Long headernotificationSeqno) {
        set(PROPERTY_HEADERNOTIFICATIONSEQNO, headernotificationSeqno);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATIONREGEXP
     * 
     */
    public String getValidationregexp() {
        return (String) get(PROPERTY_VALIDATIONREGEXP);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATIONREGEXP
     * 
     */
    public void setValidationregexp(String validationregexp) {
        set(PROPERTY_VALIDATIONREGEXP, validationregexp);
    }

    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATIONEXTSYSTEM
     * 
     */
    public ExternalSystemData getValidationExtSystem() {
        return (ExternalSystemData) get(PROPERTY_VALIDATIONEXTSYSTEM);
    }
    /**
     * @see ExternalBusinessPartnerConfigProperty#PROPERTY_VALIDATIONEXTSYSTEM
     * 
     */
    public void setValidationExtSystem(ExternalSystemData validationExtSystem) {
        set(PROPERTY_VALIDATIONEXTSYSTEM, validationExtSystem);
    }

    /**
     * Help: {@literal A property option is a value accepted by a certain property}<br>
     * @see ExternalBusinessPartnerConfigPropertyOption
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ExternalBusinessPartnerConfigPropertyOption> getExtBPConfigPropOptList() {
      return (List<ExternalBusinessPartnerConfigPropertyOption>) get(PROPERTY_EXTBPCONFIGPROPOPTLIST);
    }

    /**
     * Help: {@literal A property option is a value accepted by a certain property}<br>
     * @see ExternalBusinessPartnerConfigPropertyOption
     * 
     */
    public void setExtBPConfigPropOptList(List<ExternalBusinessPartnerConfigPropertyOption> extBPConfigPropOptList) {
        set(PROPERTY_EXTBPCONFIGPROPOPTLIST, extBPConfigPropOptList);
    }

}
