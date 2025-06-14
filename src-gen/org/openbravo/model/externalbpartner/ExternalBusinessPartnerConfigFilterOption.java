
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
 * Entity class for entity C_ExtBP_Config_Filter_Opt (stored in table C_ExtBP_Config_Filter_Opt).
 * <br>
 * Help: {@literal A filter option is a value accepted by a certain filter}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExternalBusinessPartnerConfigFilterOption extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ExtBP_Config_Filter_Opt";
    public static final String ENTITY_NAME = "C_ExtBP_Config_Filter_Opt";

    /**
     * Property id stored in column C_Extbp_Config_Filter_Opt_ID in table C_ExtBP_Config_Filter_Opt 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ExtBP_Config_Filter_Opt 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ExtBP_Config_Filter_Opt 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_ExtBP_Config_Filter_Opt 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ExtBP_Config_Filter_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_ExtBP_Config_Filter_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ExtBP_Config_Filter_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_ExtBP_Config_Filter_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property cRMConnectorFilter stored in column C_Extbp_Config_Filter_ID in table C_ExtBP_Config_Filter_Opt<br>
     * Help: {@literal Filters for CRM Connector. The filter has a defined type and it's linked to one or many
     *       properties}
     * 
     */
    public static final String PROPERTY_CRMCONNECTORFILTER = "cRMConnectorFilter";

    /**
     * Property text stored in column Text in table C_ExtBP_Config_Filter_Opt<br>
     * Help: {@literal Text to be used when the property or filter is not translatable}
     * 
     */
    public static final String PROPERTY_TEXT = "text";

    /**
     * Property searchKey stored in column Value in table C_ExtBP_Config_Filter_Opt<br>
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
     * Property translatable stored in column Istranslatable in table C_ExtBP_Config_Filter_Opt
     * 
     */
    public static final String PROPERTY_TRANSLATABLE = "translatable";

    /**
     * Property message stored in column AD_Message_ID in table C_ExtBP_Config_Filter_Opt<br>
     * Help: {@literal Message with the text to be used when the property or filter is translatable}
     * 
     */
    public static final String PROPERTY_MESSAGE = "message";

    /**
     * Property filterOptSeqno stored in column Filter_Opt_Seqno in table C_ExtBP_Config_Filter_Opt<br>
     * Help: {@literal Filter Option sequence Number}
     * 
     */
    public static final String PROPERTY_FILTEROPTSEQNO = "filterOptSeqno";

    /**
     * Property default stored in column Isdefault in table C_ExtBP_Config_Filter_Opt<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";


    public ExternalBusinessPartnerConfigFilterOption() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TRANSLATABLE, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CRMCONNECTORFILTER
     * 
     */
    public ExternalBusinessPartnerConfigFilter getCRMConnectorFilter() {
        return (ExternalBusinessPartnerConfigFilter) get(PROPERTY_CRMCONNECTORFILTER);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_CRMCONNECTORFILTER
     * 
     */
    public void setCRMConnectorFilter(ExternalBusinessPartnerConfigFilter cRMConnectorFilter) {
        set(PROPERTY_CRMCONNECTORFILTER, cRMConnectorFilter);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_TEXT
     * 
     */
    public String getText() {
        return (String) get(PROPERTY_TEXT);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_TEXT
     * 
     */
    public void setText(String text) {
        set(PROPERTY_TEXT, text);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_TRANSLATABLE
     * 
     */
    public Boolean isTranslatable() {
        return (Boolean) get(PROPERTY_TRANSLATABLE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_TRANSLATABLE
     * 
     */
    public void setTranslatable(Boolean translatable) {
        set(PROPERTY_TRANSLATABLE, translatable);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_MESSAGE
     * 
     */
    public Message getMessage() {
        return (Message) get(PROPERTY_MESSAGE);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_MESSAGE
     * 
     */
    public void setMessage(Message message) {
        set(PROPERTY_MESSAGE, message);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_FILTEROPTSEQNO
     * 
     */
    public Long getFilterOptSeqno() {
        return (Long) get(PROPERTY_FILTEROPTSEQNO);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_FILTEROPTSEQNO
     * 
     */
    public void setFilterOptSeqno(Long filterOptSeqno) {
        set(PROPERTY_FILTEROPTSEQNO, filterOptSeqno);
    }

    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see ExternalBusinessPartnerConfigFilterOption#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

}
