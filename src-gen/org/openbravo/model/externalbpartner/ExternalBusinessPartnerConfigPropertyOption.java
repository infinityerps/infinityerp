
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
 * Entity class for entity C_ExtBP_Config_Prop_Opt (stored in table C_ExtBP_Config_Prop_Opt).
 * <br>
 * Help: {@literal A property option is a value accepted by a certain property}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ExternalBusinessPartnerConfigPropertyOption extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ExtBP_Config_Prop_Opt";
    public static final String ENTITY_NAME = "C_ExtBP_Config_Prop_Opt";

    /**
     * Property id stored in column C_Extbp_Config_Prop_Opt_ID in table C_ExtBP_Config_Prop_Opt 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ExtBP_Config_Prop_Opt 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ExtBP_Config_Prop_Opt 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_ExtBP_Config_Prop_Opt 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ExtBP_Config_Prop_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_ExtBP_Config_Prop_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ExtBP_Config_Prop_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_ExtBP_Config_Prop_Opt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property externalBPIntegrationProperty stored in column C_Extbp_Config_Property_ID in table C_ExtBP_Config_Prop_Opt<br>
     * Help: {@literal CRM Connector Property}
     * 
     */
    public static final String PROPERTY_EXTERNALBPINTEGRATIONPROPERTY = "externalBPIntegrationProperty";

    /**
     * Property text stored in column Text in table C_ExtBP_Config_Prop_Opt 
     * 
     */
    public static final String PROPERTY_TEXT = "text";

    /**
     * Property searchKey stored in column Value in table C_ExtBP_Config_Prop_Opt 
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property istranslatable stored in column Istranslatable in table C_ExtBP_Config_Prop_Opt
     * 
     */
    public static final String PROPERTY_ISTRANSLATABLE = "istranslatable";

    /**
     * Property message stored in column AD_Message_ID in table C_ExtBP_Config_Prop_Opt<br>
     * Help: {@literal When the CRM API property option is translatable then the option text is the translated
     *       text of this AD Message}
     * 
     */
    public static final String PROPERTY_MESSAGE = "message";

    /**
     * Property sequenceNumber stored in column Prop_Opt_Seqno in table C_ExtBP_Config_Prop_Opt<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property default stored in column Isdefault in table C_ExtBP_Config_Prop_Opt<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";


    public ExternalBusinessPartnerConfigPropertyOption() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISTRANSLATABLE, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_EXTERNALBPINTEGRATIONPROPERTY
     * 
     */
    public ExternalBusinessPartnerConfigProperty getExternalBPIntegrationProperty() {
        return (ExternalBusinessPartnerConfigProperty) get(PROPERTY_EXTERNALBPINTEGRATIONPROPERTY);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_EXTERNALBPINTEGRATIONPROPERTY
     * 
     */
    public void setExternalBPIntegrationProperty(ExternalBusinessPartnerConfigProperty externalBPIntegrationProperty) {
        set(PROPERTY_EXTERNALBPINTEGRATIONPROPERTY, externalBPIntegrationProperty);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_TEXT
     * 
     */
    public String getText() {
        return (String) get(PROPERTY_TEXT);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_TEXT
     * 
     */
    public void setText(String text) {
        set(PROPERTY_TEXT, text);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ISTRANSLATABLE
     * 
     */
    public Boolean isTranslatable() {
        return (Boolean) get(PROPERTY_ISTRANSLATABLE);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_ISTRANSLATABLE
     * 
     */
    public void setTranslatable(Boolean istranslatable) {
        set(PROPERTY_ISTRANSLATABLE, istranslatable);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_MESSAGE
     * 
     */
    public Message getMessage() {
        return (Message) get(PROPERTY_MESSAGE);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_MESSAGE
     * 
     */
    public void setMessage(Message message) {
        set(PROPERTY_MESSAGE, message);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see ExternalBusinessPartnerConfigPropertyOption#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

}
