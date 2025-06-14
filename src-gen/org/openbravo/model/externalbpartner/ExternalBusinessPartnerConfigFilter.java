
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Message;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity C_ExtBP_Config_Filter (stored in table C_ExtBP_Config_Filter).
 * <br>
 * Help: {@literal Filters for CRM Connectors. The filter has a defined type and it's linked to one or many
     *       properties}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExternalBusinessPartnerConfigFilter extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ExtBP_Config_Filter";
    public static final String ENTITY_NAME = "C_ExtBP_Config_Filter";

    /**
     * Property id stored in column C_Extbp_Config_Filter_ID in table C_ExtBP_Config_Filter<br>
     * Help: {@literal Filters for CRM Connector. The filter has a defined type and it's linked to one or many
     *       properties}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ExtBP_Config_Filter 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ExtBP_Config_Filter 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_ExtBP_Config_Filter 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ExtBP_Config_Filter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_ExtBP_Config_Filter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ExtBP_Config_Filter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_ExtBP_Config_Filter 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property externalBusinessPartnerIntegrationConfiguration stored in column C_Extbp_Config_ID in table C_ExtBP_Config_Filter<br>
     * Help: {@literal Configuration to connect to the CRM system API, and which also defines the properties and
     *       filters used by Openbravo to map with the external system information.}
     * 
     */
    public static final String PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION = "externalBusinessPartnerIntegrationConfiguration";

    /**
     * Property name stored in column Name in table C_ExtBP_Config_Filter 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property reference stored in column AD_Reference in table C_ExtBP_Config_Filter<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property message stored in column AD_Message_ID in table C_ExtBP_Config_Filter<br>
     * Help: {@literal Message with the text to be used when the property or filter is translatable}
     * 
     */
    public static final String PROPERTY_MESSAGE = "message";

    /**
     * Property default stored in column Isdefault in table C_ExtBP_Config_Filter<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property sequenceNumber stored in column Seqno in table C_ExtBP_Config_Filter<br>
     * Help: {@literal The grid configuration which has the highest sequence number will be the one which applies
     *       to the main filter.}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property isAdvancedFilter stored in column IsAdvancedFilter in table C_ExtBP_Config_Filter
     * 
     */
    public static final String PROPERTY_ISADVANCEDFILTER = "isAdvancedFilter";

    /**
     * Property advancedFilterSeqno stored in column AdvancedFilterSeqno in table C_ExtBP_Config_Filter
     * 
     */
    public static final String PROPERTY_ADVANCEDFILTERSEQNO = "advancedFilterSeqno";

    /**
     * Property allowSorting stored in column Allowsorting in table C_ExtBP_Config_Filter<br>
     * Help: {@literal If checked, the column will be sortable. By default every column is sortable. If it is
     *       unchecked, the column will not be sortable.}
     * 
     */
    public static final String PROPERTY_ALLOWSORTING = "allowSorting";

    /**
     * Property isMainFilter stored in column IsMainFilter in table C_ExtBP_Config_Filter<br>
     * Help: {@literal This field indicates if an external business partner filter is shown in the main window}
     * 
     */
    public static final String PROPERTY_ISMAINFILTER = "isMainFilter";

    /**
     * Property translatable stored in column Istranslatable in table C_ExtBP_Config_Filter
     * 
     */
    public static final String PROPERTY_TRANSLATABLE = "translatable";

    /**
     * Property text stored in column Text in table C_ExtBP_Config_Filter<br>
     * Help: {@literal Text to be used when the property or filter is not translatable}
     * 
     */
    public static final String PROPERTY_TEXT = "text";

    /**
     * Property isselectorfilter stored in column Isselectorfilter in table C_ExtBP_Config_Filter
     * 
     */
    public static final String PROPERTY_ISSELECTORFILTER = "isselectorfilter";

    /**
     * Property filtericon stored in column Filtericon in table C_ExtBP_Config_Filter<br>
     * Help: {@literal Optional CSS icon class that will be displayed near the element.}
     * 
     */
    public static final String PROPERTY_FILTERICON = "filtericon";

    /**
     * Property isScanIdentifier stored in column IsScanIdentifier in table C_ExtBP_Config_Filter<br>
     * Help: {@literal When an scanning is executed this filter will be used by CRM connector}
     * 
     */
    public static final String PROPERTY_ISSCANIDENTIFIER = "isScanIdentifier";

    /**
     * Property mincharacters stored in column Mincharacters in table C_ExtBP_Config_Filter
     * 
     */
    public static final String PROPERTY_MINCHARACTERS = "mincharacters";

    /**
     * Property filterImplementation stored in column Filter_Impl in table C_ExtBP_Config_Filter<br>
     * Help: {@literal Selector to choose filter implementation}
     * 
     */
    public static final String PROPERTY_FILTERIMPLEMENTATION = "filterImplementation";

    /**
     * Property selectorfilterseqno stored in column Selectorfilterseqno in table C_ExtBP_Config_Filter<br>
     * Help: {@literal The grid configuration which has the highest sequence number will be the one which applies
     *       to the selector filter.}
     * 
     */
    public static final String PROPERTY_SELECTORFILTERSEQNO = "selectorfilterseqno";


    public ExternalBusinessPartnerConfigFilter() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_ISADVANCEDFILTER, false);
        setDefaultValue(PROPERTY_ALLOWSORTING, false);
        setDefaultValue(PROPERTY_ISMAINFILTER, false);
        setDefaultValue(PROPERTY_TRANSLATABLE, true);
        setDefaultValue(PROPERTY_ISSELECTORFILTER, false);
        setDefaultValue(PROPERTY_ISSCANIDENTIFIER, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION
     * 
     */
    public ExternalBusinessPartnerConfig getExternalBusinessPartnerIntegrationConfiguration() {
        return (ExternalBusinessPartnerConfig) get(PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION
     * 
     */
    public void setExternalBusinessPartnerIntegrationConfiguration(ExternalBusinessPartnerConfig externalBusinessPartnerIntegrationConfiguration) {
        set(PROPERTY_EXTERNALBUSINESSPARTNERINTEGRATIONCONFIGURATION, externalBusinessPartnerIntegrationConfiguration);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_REFERENCE
     * 
     */
    public String getReference() {
        return (String) get(PROPERTY_REFERENCE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_REFERENCE
     * 
     */
    public void setReference(String reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_MESSAGE
     * 
     */
    public Message getMessage() {
        return (Message) get(PROPERTY_MESSAGE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_MESSAGE
     * 
     */
    public void setMessage(Message message) {
        set(PROPERTY_MESSAGE, message);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISADVANCEDFILTER
     * 
     */
    public Boolean isAdvancedFilter() {
        return (Boolean) get(PROPERTY_ISADVANCEDFILTER);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISADVANCEDFILTER
     * 
     */
    public void setAdvancedFilter(Boolean isAdvancedFilter) {
        set(PROPERTY_ISADVANCEDFILTER, isAdvancedFilter);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ADVANCEDFILTERSEQNO
     * 
     */
    public Long getAdvancedFilterSeqno() {
        return (Long) get(PROPERTY_ADVANCEDFILTERSEQNO);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ADVANCEDFILTERSEQNO
     * 
     */
    public void setAdvancedFilterSeqno(Long advancedFilterSeqno) {
        set(PROPERTY_ADVANCEDFILTERSEQNO, advancedFilterSeqno);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ALLOWSORTING
     * 
     */
    public Boolean isAllowSorting() {
        return (Boolean) get(PROPERTY_ALLOWSORTING);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ALLOWSORTING
     * 
     */
    public void setAllowSorting(Boolean allowSorting) {
        set(PROPERTY_ALLOWSORTING, allowSorting);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISMAINFILTER
     * 
     */
    public Boolean isMainFilter() {
        return (Boolean) get(PROPERTY_ISMAINFILTER);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISMAINFILTER
     * 
     */
    public void setMainFilter(Boolean isMainFilter) {
        set(PROPERTY_ISMAINFILTER, isMainFilter);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_TRANSLATABLE
     * 
     */
    public Boolean isTranslatable() {
        return (Boolean) get(PROPERTY_TRANSLATABLE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_TRANSLATABLE
     * 
     */
    public void setTranslatable(Boolean translatable) {
        set(PROPERTY_TRANSLATABLE, translatable);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_TEXT
     * 
     */
    public String getText() {
        return (String) get(PROPERTY_TEXT);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_TEXT
     * 
     */
    public void setText(String text) {
        set(PROPERTY_TEXT, text);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISSELECTORFILTER
     * 
     */
    public Boolean isSelectorfilter() {
        return (Boolean) get(PROPERTY_ISSELECTORFILTER);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISSELECTORFILTER
     * 
     */
    public void setSelectorfilter(Boolean isselectorfilter) {
        set(PROPERTY_ISSELECTORFILTER, isselectorfilter);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_FILTERICON
     * 
     */
    public String getFiltericon() {
        return (String) get(PROPERTY_FILTERICON);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_FILTERICON
     * 
     */
    public void setFiltericon(String filtericon) {
        set(PROPERTY_FILTERICON, filtericon);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISSCANIDENTIFIER
     * 
     */
    public Boolean isScanIdentifier() {
        return (Boolean) get(PROPERTY_ISSCANIDENTIFIER);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_ISSCANIDENTIFIER
     * 
     */
    public void setScanIdentifier(Boolean isScanIdentifier) {
        set(PROPERTY_ISSCANIDENTIFIER, isScanIdentifier);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_MINCHARACTERS
     * 
     */
    public Long getMincharacters() {
        return (Long) get(PROPERTY_MINCHARACTERS);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_MINCHARACTERS
     * 
     */
    public void setMincharacters(Long mincharacters) {
        set(PROPERTY_MINCHARACTERS, mincharacters);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_FILTERIMPLEMENTATION
     * 
     */
    public String getFilterImplementation() {
        return (String) get(PROPERTY_FILTERIMPLEMENTATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_FILTERIMPLEMENTATION
     * 
     */
    public void setFilterImplementation(String filterImplementation) {
        set(PROPERTY_FILTERIMPLEMENTATION, filterImplementation);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_SELECTORFILTERSEQNO
     * 
     */
    public Long getSelectorfilterseqno() {
        return (Long) get(PROPERTY_SELECTORFILTERSEQNO);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilter#PROPERTY_SELECTORFILTERSEQNO
     * 
     */
    public void setSelectorfilterseqno(Long selectorfilterseqno) {
        set(PROPERTY_SELECTORFILTERSEQNO, selectorfilterseqno);
    }

}
