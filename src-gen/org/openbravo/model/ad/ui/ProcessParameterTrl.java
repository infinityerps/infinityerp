
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.system.Language;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADProcessParameterTrl (stored in table AD_Process_Para_Trl).
 * <br>
 * Help: {@literal Shows parameter tab translation for several languages}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProcessParameterTrl extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Process_Para_Trl";
    public static final String ENTITY_NAME = "ADProcessParameterTrl";

    /**
     * Property id stored in column AD_Process_Para_Trl_ID in table AD_Process_Para_Trl 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property processParameter stored in column AD_Process_Para_ID in table AD_Process_Para_Trl<br>
     * Help: {@literal Process Parameter identifies the parameters of a process or report.}
     * 
     */
    public static final String PROPERTY_PROCESSPARAMETER = "processParameter";

    /**
     * Property language stored in column AD_Language in table AD_Process_Para_Trl<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property client stored in column AD_Client_ID in table AD_Process_Para_Trl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Process_Para_Trl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Process_Para_Trl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Process_Para_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Process_Para_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Process_Para_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Process_Para_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Process_Para_Trl 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Process_Para_Trl<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Process_Para_Trl<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property translation stored in column IsTranslated in table AD_Process_Para_Trl<br>
     * Help: {@literal The Translated checkbox indicates if this column is translated.}
     * 
     */
    public static final String PROPERTY_TRANSLATION = "translation";


    public ProcessParameterTrl() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TRANSLATION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_PROCESSPARAMETER
     * 
     */
    public ProcessParameter getProcessParameter() {
        return (ProcessParameter) get(PROPERTY_PROCESSPARAMETER);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_PROCESSPARAMETER
     * 
     */
    public void setProcessParameter(ProcessParameter processParameter) {
        set(PROPERTY_PROCESSPARAMETER, processParameter);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see ProcessParameterTrl#PROPERTY_TRANSLATION
     * 
     */
    public Boolean isTranslation() {
        return (Boolean) get(PROPERTY_TRANSLATION);
    }
    /**
     * @see ProcessParameterTrl#PROPERTY_TRANSLATION
     * 
     */
    public void setTranslation(Boolean translation) {
        set(PROPERTY_TRANSLATION, translation);
    }

}
