
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
package org.openbravo.model.ad.module;

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
 * Entity class for entity ModuleTrl (stored in table AD_Module_Trl).
 * <br>
 * Help: {@literal Translations for modules}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ModuleTrl extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Module_Trl";
    public static final String ENTITY_NAME = "ModuleTrl";

    /**
     * Property id stored in column AD_Module_Trl_ID in table AD_Module_Trl 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property module stored in column AD_Module_ID in table AD_Module_Trl<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property language stored in column AD_Language in table AD_Module_Trl 
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property client stored in column AD_Client_ID in table AD_Module_Trl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Module_Trl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Module_Trl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Module_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Module_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Module_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Module_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table AD_Module_Trl<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Module_Trl<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property licenseText stored in column License in table AD_Module_Trl<br>
     * Help: {@literal Contains the text of the license the module is release with, this information is
     *       additional to the license type.}
     * 
     */
    public static final String PROPERTY_LICENSETEXT = "licenseText";

    /**
     * Property translation stored in column IsTranslated in table AD_Module_Trl<br>
     * Help: {@literal The Translated checkbox indicates if this column is translated.}
     * 
     */
    public static final String PROPERTY_TRANSLATION = "translation";

    /**
     * Property updateInformation stored in column Updateinfo in table AD_Module_Trl<br>
     * Help: {@literal Information about the update, this information should include what is new for the new
     *       version.}
     * 
     */
    public static final String PROPERTY_UPDATEINFORMATION = "updateInformation";

    /**
     * Property referenceDataDescription stored in column Referencedatainfo in table AD_Module_Trl<br>
     * Help: {@literal Description for the reference data contained within the module. When a module contains
     *       reference data this field maintains a description of this data and its purpose.}
     * 
     */
    public static final String PROPERTY_REFERENCEDATADESCRIPTION = "referenceDataDescription";


    public ModuleTrl() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_TRANSLATION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ModuleTrl#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ModuleTrl#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ModuleTrl#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ModuleTrl#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ModuleTrl#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see ModuleTrl#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see ModuleTrl#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ModuleTrl#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ModuleTrl#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ModuleTrl#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ModuleTrl#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ModuleTrl#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ModuleTrl#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ModuleTrl#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ModuleTrl#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ModuleTrl#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ModuleTrl#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ModuleTrl#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ModuleTrl#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ModuleTrl#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ModuleTrl#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ModuleTrl#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ModuleTrl#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see ModuleTrl#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see ModuleTrl#PROPERTY_LICENSETEXT
     * 
     */
    public String getLicenseText() {
        return (String) get(PROPERTY_LICENSETEXT);
    }
    /**
     * @see ModuleTrl#PROPERTY_LICENSETEXT
     * 
     */
    public void setLicenseText(String licenseText) {
        set(PROPERTY_LICENSETEXT, licenseText);
    }

    /**
     * @see ModuleTrl#PROPERTY_TRANSLATION
     * 
     */
    public Boolean isTranslation() {
        return (Boolean) get(PROPERTY_TRANSLATION);
    }
    /**
     * @see ModuleTrl#PROPERTY_TRANSLATION
     * 
     */
    public void setTranslation(Boolean translation) {
        set(PROPERTY_TRANSLATION, translation);
    }

    /**
     * @see ModuleTrl#PROPERTY_UPDATEINFORMATION
     * 
     */
    public String getUpdateInformation() {
        return (String) get(PROPERTY_UPDATEINFORMATION);
    }
    /**
     * @see ModuleTrl#PROPERTY_UPDATEINFORMATION
     * 
     */
    public void setUpdateInformation(String updateInformation) {
        set(PROPERTY_UPDATEINFORMATION, updateInformation);
    }

    /**
     * @see ModuleTrl#PROPERTY_REFERENCEDATADESCRIPTION
     * 
     */
    public String getReferenceDataDescription() {
        return (String) get(PROPERTY_REFERENCEDATADESCRIPTION);
    }
    /**
     * @see ModuleTrl#PROPERTY_REFERENCEDATADESCRIPTION
     * 
     */
    public void setReferenceDataDescription(String referenceDataDescription) {
        set(PROPERTY_REFERENCEDATADESCRIPTION, referenceDataDescription);
    }

}
