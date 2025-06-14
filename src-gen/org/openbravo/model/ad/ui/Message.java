
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
package org.openbravo.model.ad.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADMessage (stored in table AD_Message).
 * <br>
 * Help: {@literal The Message Tab displays error message text and menu messages}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Message extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Message";
    public static final String ENTITY_NAME = "ADMessage";

    /**
     * Property id stored in column AD_Message_ID in table AD_Message<br>
     * Help: {@literal Information and Error messages}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Message 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Message 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Message 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Message 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Message 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Message 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Message 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table AD_Message 
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property messageText stored in column MsgText in table AD_Message<br>
     * Help: {@literal The Message Text indicates the message that will display}
     * 
     */
    public static final String PROPERTY_MESSAGETEXT = "messageText";

    /**
     * Property hint stored in column MsgTip in table AD_Message<br>
     * Help: {@literal The Message Tip defines additional help or information about this message.}
     * 
     */
    public static final String PROPERTY_HINT = "hint";

    /**
     * Property messageType stored in column MsgType in table AD_Message<br>
     * Help: {@literal The Message Type indicates the type of message being defined.  Valid message types are
     *       Informational, Menu and Error.}
     * 
     */
    public static final String PROPERTY_MESSAGETYPE = "messageType";

    /**
     * Property module stored in column AD_Module_ID in table AD_Message<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property includeInI18N stored in column IsIncludeInI18N in table AD_Message<br>
     * Help: {@literal The OB.I18N object allows developers to use labels in the client side. By default only
     *       labels that belong to modules other than core are included in this objects. This flag can be used to
     *       force including core labels in OB.I18N}
     * 
     */
    public static final String PROPERTY_INCLUDEINI18N = "includeInI18N";

    /**
     * Property aDMessageTrlList stored in table AD_Message
     * 
     */
    public static final String PROPERTY_ADMESSAGETRLLIST = "aDMessageTrlList";


    public Message() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MESSAGETYPE, "I");
        setDefaultValue(PROPERTY_INCLUDEINI18N, false);
        setDefaultValue(PROPERTY_ADMESSAGETRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Message#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Message#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Message#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Message#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Message#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Message#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Message#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Message#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Message#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Message#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Message#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Message#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Message#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Message#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Message#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Message#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Message#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Message#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Message#PROPERTY_MESSAGETEXT
     * 
     */
    public String getMessageText() {
        return (String) get(PROPERTY_MESSAGETEXT);
    }
    /**
     * @see Message#PROPERTY_MESSAGETEXT
     * 
     */
    public void setMessageText(String messageText) {
        set(PROPERTY_MESSAGETEXT, messageText);
    }

    /**
     * @see Message#PROPERTY_HINT
     * 
     */
    public String getHint() {
        return (String) get(PROPERTY_HINT);
    }
    /**
     * @see Message#PROPERTY_HINT
     * 
     */
    public void setHint(String hint) {
        set(PROPERTY_HINT, hint);
    }

    /**
     * @see Message#PROPERTY_MESSAGETYPE
     * 
     */
    public String getMessageType() {
        return (String) get(PROPERTY_MESSAGETYPE);
    }
    /**
     * @see Message#PROPERTY_MESSAGETYPE
     * 
     */
    public void setMessageType(String messageType) {
        set(PROPERTY_MESSAGETYPE, messageType);
    }

    /**
     * @see Message#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Message#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Message#PROPERTY_INCLUDEINI18N
     * 
     */
    public Boolean isIncludeInI18N() {
        return (Boolean) get(PROPERTY_INCLUDEINI18N);
    }
    /**
     * @see Message#PROPERTY_INCLUDEINI18N
     * 
     */
    public void setIncludeInI18N(Boolean includeInI18N) {
        set(PROPERTY_INCLUDEINI18N, includeInI18N);
    }

    /**
     * Help: {@literal This tab contains the messages translation to different languages.  It is important to
     *       check the translated option.}<br>
     * @see MessageTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MessageTrl> getADMessageTrlList() {
      return (List<MessageTrl>) get(PROPERTY_ADMESSAGETRLLIST);
    }

    /**
     * Help: {@literal This tab contains the messages translation to different languages.  It is important to
     *       check the translated option.}<br>
     * @see MessageTrl
     * 
     */
    public void setADMessageTrlList(List<MessageTrl> aDMessageTrlList) {
        set(PROPERTY_ADMESSAGETRLLIST, aDMessageTrlList);
    }

}
