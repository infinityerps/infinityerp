
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
 * Entity class for entity ADModuleInstall (stored in table AD_Module_Install).
 * <br>
 * Help: {@literal This temporary table is used in the installation and update process for modules. It stores
     *       the information for the upcoming module.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ModuleInstall extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Module_Install";
    public static final String ENTITY_NAME = "ADModuleInstall";

    /**
     * Property id stored in column AD_Module_Install_ID in table AD_Module_Install 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Module_Install 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Module_Install 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Module_Install 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Module_Install 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Module_Install 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Module_Install 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Module_Install 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property module stored in column AD_Module_ID in table AD_Module_Install<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property name stored in column Name in table AD_Module_Install 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property version stored in column Version in table AD_Module_Install 
     * 
     */
    public static final String PROPERTY_VERSION = "version";

    /**
     * Property description stored in column Description in table AD_Module_Install<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Module_Install<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property uRL stored in column Url in table AD_Module_Install<br>
     * Help: {@literal The URL defines an online address for this element.}
     * 
     */
    public static final String PROPERTY_URL = "uRL";

    /**
     * Property type stored in column Type in table AD_Module_Install<br>
     * Help: {@literal The Type indicates the type of validation that will occur.  This can be SQL, Java Script
     *       or Java Language.}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property licenseText stored in column License in table AD_Module_Install<br>
     * Help: {@literal Contains the text of the license the module is release with, this information is
     *       additional to the license type.}
     * 
     */
    public static final String PROPERTY_LICENSETEXT = "licenseText";

    /**
     * Property inDevelopment stored in column Isindevelopment in table AD_Module_Install<br>
     * Help: {@literal Determines wether the module is currently in development process. Only the modules that
     *       currently are being developed will be exported.}
     * 
     */
    public static final String PROPERTY_INDEVELOPMENT = "inDevelopment";

    /**
     * Property default stored in column Isdefault in table AD_Module_Install<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property sequenceNumber stored in column Seqno in table AD_Module_Install<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property javaPackage stored in column Javapackage in table AD_Module_Install<br>
     * Help: {@literal The Java Package is a unique identifier of your module and has to match the Java package
     *       naming rules as described in the Java Naming Conventions (names and package names). Be careful when
     *       setting this value as you are not allowed to change it once your module is registered in the central
     *       repository. If your module includes Java files they have to be packaged within your module's Java
     *       package or in its sub-packages.}
     * 
     */
    public static final String PROPERTY_JAVAPACKAGE = "javaPackage";

    /**
     * Property licenseType stored in column Licensetype in table AD_Module_Install<br>
     * Help: {@literal There is a list of possible licenses to select one of them for the current element.}
     * 
     */
    public static final String PROPERTY_LICENSETYPE = "licenseType";

    /**
     * Property author stored in column Author in table AD_Module_Install<br>
     * Help: {@literal The author of the module is the person or company that created and maintains the module.}
     * 
     */
    public static final String PROPERTY_AUTHOR = "author";

    /**
     * Property status stored in column Status in table AD_Module_Install<br>
     * Help: {@literal Current status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_STATUS = "status";

    /**
     * Property availableUpdate stored in column Update_Available in table AD_Module_Install<br>
     * Help: {@literal Indicates whether and which new version is available to update a module}
     * 
     */
    public static final String PROPERTY_AVAILABLEUPDATE = "availableUpdate";

    /**
     * Property translationRequired stored in column Istranslationrequired in table AD_Module_Install<br>
     * Help: {@literal The current module contains user interface elements that can be translated to different
     *       languages.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_TRANSLATIONREQUIRED = "translationRequired";

    /**
     * Property language stored in column AD_Language in table AD_Module_Install 
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property hasChartOfAccounts stored in column Haschartofaccounts in table AD_Module_Install<br>
     * Help: {@literal The module contains a chart of accounts}
     * 
     */
    public static final String PROPERTY_HASCHARTOFACCOUNTS = "hasChartOfAccounts";

    /**
     * Property isTranslationModule stored in column Istranslationmodule in table AD_Module_Install<br>
     * Help: {@literal This module is a translation module}
     * 
     */
    public static final String PROPERTY_ISTRANSLATIONMODULE = "isTranslationModule";

    /**
     * Property hasReferenceData stored in column Hasreferencedata in table AD_Module_Install<br>
     * Help: {@literal The module contains reference data}
     * 
     */
    public static final String PROPERTY_HASREFERENCEDATA = "hasReferenceData";

    /**
     * Property registerModule stored in column Isregistered in table AD_Module_Install<br>
     * Help: {@literal Indicates whether the module is registered in the Central Repository and in case it is
     *       not, it allows to register it.}
     * 
     */
    public static final String PROPERTY_REGISTERMODULE = "registerModule";

    /**
     * Property updateInformation stored in column Updateinfo in table AD_Module_Install<br>
     * Help: {@literal Information about the update, this information should include what is new for the new
     *       version.}
     * 
     */
    public static final String PROPERTY_UPDATEINFORMATION = "updateInformation";

    /**
     * Property updateVersion stored in column Update_Ver_ID in table AD_Module_Install<br>
     * Help: {@literal Identifier for the Update Version}
     * 
     */
    public static final String PROPERTY_UPDATEVERSION = "updateVersion";

    /**
     * Property referenceDataDescription stored in column Referencedatainfo in table AD_Module_Install<br>
     * Help: {@literal Description for the reference data contained within the module. When a module contains
     *       reference data this field maintains a description of this data and its purpose.}
     * 
     */
    public static final String PROPERTY_REFERENCEDATADESCRIPTION = "referenceDataDescription";

    /**
     * Property versionLabel stored in column Version_Label in table AD_Module_Install<br>
     * Help: {@literal It is a human understandable identifier for the version, it will be used with version
     *       number. Value examples this field can take are: MP1, dev, alpha...}
     * 
     */
    public static final String PROPERTY_VERSIONLABEL = "versionLabel";

    /**
     * Property isCommercial stored in column Iscommercial in table AD_Module_Install<br>
     * Help: {@literal Commercial modules are only available to Professional and Enterprise Edition instances
     *       whereas non commercial ones can be downloaded and installed in Community Edition
     *       Instances.
     *       Commercial modules can have a fee to be payed before they can be installed.}
     * 
     */
    public static final String PROPERTY_ISCOMMERCIAL = "isCommercial";

    /**
     * Property enabled stored in column Enabled in table AD_Module_Install<br>
     * Help: {@literal When a module is not enabled, their artifacts (windows, tabs, forms, reports and
     *       processes) will not be accessible.}
     * 
     */
    public static final String PROPERTY_ENABLED = "enabled";

    /**
     * Property applyConfigurationScript stored in column Isconfigscriptapplied in table AD_Module_Install<br>
     * Help: {@literal This check affects to Template modules. When it is active, the template they contain is
     *       applied to the instance when the application is built. 
     *       
     *       Note that this information is kept only in
     *       the instance but not it is not exported to the module.}
     * 
     */
    public static final String PROPERTY_APPLYCONFIGURATIONSCRIPT = "applyConfigurationScript";

    /**
     * Property freeForTrial stored in column Istrialallowed in table AD_Module_Install
     * 
     */
    public static final String PROPERTY_FREEFORTRIAL = "freeForTrial";


    public ModuleInstall() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_TYPE, "M");
        setDefaultValue(PROPERTY_INDEVELOPMENT, false);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_STATUS, "I");
        setDefaultValue(PROPERTY_TRANSLATIONREQUIRED, false);
        setDefaultValue(PROPERTY_HASCHARTOFACCOUNTS, false);
        setDefaultValue(PROPERTY_ISTRANSLATIONMODULE, false);
        setDefaultValue(PROPERTY_HASREFERENCEDATA, false);
        setDefaultValue(PROPERTY_REGISTERMODULE, false);
        setDefaultValue(PROPERTY_ISCOMMERCIAL, false);
        setDefaultValue(PROPERTY_ENABLED, true);
        setDefaultValue(PROPERTY_APPLYCONFIGURATIONSCRIPT, true);
        setDefaultValue(PROPERTY_FREEFORTRIAL, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ModuleInstall#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ModuleInstall#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ModuleInstall#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ModuleInstall#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ModuleInstall#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ModuleInstall#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ModuleInstall#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ModuleInstall#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ModuleInstall#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ModuleInstall#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ModuleInstall#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ModuleInstall#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ModuleInstall#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ModuleInstall#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ModuleInstall#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ModuleInstall#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ModuleInstall#PROPERTY_MODULE
     * 
     */
    public String getModule() {
        return (String) get(PROPERTY_MODULE);
    }
    /**
     * @see ModuleInstall#PROPERTY_MODULE
     * 
     */
    public void setModule(String module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ModuleInstall#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ModuleInstall#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ModuleInstall#PROPERTY_VERSION
     * 
     */
    public String getVersion() {
        return (String) get(PROPERTY_VERSION);
    }
    /**
     * @see ModuleInstall#PROPERTY_VERSION
     * 
     */
    public void setVersion(String version) {
        set(PROPERTY_VERSION, version);
    }

    /**
     * @see ModuleInstall#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ModuleInstall#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ModuleInstall#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see ModuleInstall#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see ModuleInstall#PROPERTY_URL
     * 
     */
    public String getURL() {
        return (String) get(PROPERTY_URL);
    }
    /**
     * @see ModuleInstall#PROPERTY_URL
     * 
     */
    public void setURL(String uRL) {
        set(PROPERTY_URL, uRL);
    }

    /**
     * @see ModuleInstall#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see ModuleInstall#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see ModuleInstall#PROPERTY_LICENSETEXT
     * 
     */
    public String getLicenseText() {
        return (String) get(PROPERTY_LICENSETEXT);
    }
    /**
     * @see ModuleInstall#PROPERTY_LICENSETEXT
     * 
     */
    public void setLicenseText(String licenseText) {
        set(PROPERTY_LICENSETEXT, licenseText);
    }

    /**
     * @see ModuleInstall#PROPERTY_INDEVELOPMENT
     * 
     */
    public Boolean isInDevelopment() {
        return (Boolean) get(PROPERTY_INDEVELOPMENT);
    }
    /**
     * @see ModuleInstall#PROPERTY_INDEVELOPMENT
     * 
     */
    public void setInDevelopment(Boolean inDevelopment) {
        set(PROPERTY_INDEVELOPMENT, inDevelopment);
    }

    /**
     * @see ModuleInstall#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see ModuleInstall#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see ModuleInstall#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see ModuleInstall#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see ModuleInstall#PROPERTY_JAVAPACKAGE
     * 
     */
    public String getJavaPackage() {
        return (String) get(PROPERTY_JAVAPACKAGE);
    }
    /**
     * @see ModuleInstall#PROPERTY_JAVAPACKAGE
     * 
     */
    public void setJavaPackage(String javaPackage) {
        set(PROPERTY_JAVAPACKAGE, javaPackage);
    }

    /**
     * @see ModuleInstall#PROPERTY_LICENSETYPE
     * 
     */
    public String getLicenseType() {
        return (String) get(PROPERTY_LICENSETYPE);
    }
    /**
     * @see ModuleInstall#PROPERTY_LICENSETYPE
     * 
     */
    public void setLicenseType(String licenseType) {
        set(PROPERTY_LICENSETYPE, licenseType);
    }

    /**
     * @see ModuleInstall#PROPERTY_AUTHOR
     * 
     */
    public String getAuthor() {
        return (String) get(PROPERTY_AUTHOR);
    }
    /**
     * @see ModuleInstall#PROPERTY_AUTHOR
     * 
     */
    public void setAuthor(String author) {
        set(PROPERTY_AUTHOR, author);
    }

    /**
     * @see ModuleInstall#PROPERTY_STATUS
     * 
     */
    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }
    /**
     * @see ModuleInstall#PROPERTY_STATUS
     * 
     */
    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    /**
     * @see ModuleInstall#PROPERTY_AVAILABLEUPDATE
     * 
     */
    public String getAvailableUpdate() {
        return (String) get(PROPERTY_AVAILABLEUPDATE);
    }
    /**
     * @see ModuleInstall#PROPERTY_AVAILABLEUPDATE
     * 
     */
    public void setAvailableUpdate(String availableUpdate) {
        set(PROPERTY_AVAILABLEUPDATE, availableUpdate);
    }

    /**
     * @see ModuleInstall#PROPERTY_TRANSLATIONREQUIRED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isTranslationRequired() {
        return (Boolean) get(PROPERTY_TRANSLATIONREQUIRED);
    }
    /**
     * @see ModuleInstall#PROPERTY_TRANSLATIONREQUIRED
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setTranslationRequired(Boolean translationRequired) {
        set(PROPERTY_TRANSLATIONREQUIRED, translationRequired);
    }

    /**
     * @see ModuleInstall#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see ModuleInstall#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see ModuleInstall#PROPERTY_HASCHARTOFACCOUNTS
     * 
     */
    public Boolean isHasChartOfAccounts() {
        return (Boolean) get(PROPERTY_HASCHARTOFACCOUNTS);
    }
    /**
     * @see ModuleInstall#PROPERTY_HASCHARTOFACCOUNTS
     * 
     */
    public void setHasChartOfAccounts(Boolean hasChartOfAccounts) {
        set(PROPERTY_HASCHARTOFACCOUNTS, hasChartOfAccounts);
    }

    /**
     * @see ModuleInstall#PROPERTY_ISTRANSLATIONMODULE
     * 
     */
    public Boolean isTranslationModule() {
        return (Boolean) get(PROPERTY_ISTRANSLATIONMODULE);
    }
    /**
     * @see ModuleInstall#PROPERTY_ISTRANSLATIONMODULE
     * 
     */
    public void setTranslationModule(Boolean isTranslationModule) {
        set(PROPERTY_ISTRANSLATIONMODULE, isTranslationModule);
    }

    /**
     * @see ModuleInstall#PROPERTY_HASREFERENCEDATA
     * 
     */
    public Boolean isHasReferenceData() {
        return (Boolean) get(PROPERTY_HASREFERENCEDATA);
    }
    /**
     * @see ModuleInstall#PROPERTY_HASREFERENCEDATA
     * 
     */
    public void setHasReferenceData(Boolean hasReferenceData) {
        set(PROPERTY_HASREFERENCEDATA, hasReferenceData);
    }

    /**
     * @see ModuleInstall#PROPERTY_REGISTERMODULE
     * 
     */
    public Boolean isRegisterModule() {
        return (Boolean) get(PROPERTY_REGISTERMODULE);
    }
    /**
     * @see ModuleInstall#PROPERTY_REGISTERMODULE
     * 
     */
    public void setRegisterModule(Boolean registerModule) {
        set(PROPERTY_REGISTERMODULE, registerModule);
    }

    /**
     * @see ModuleInstall#PROPERTY_UPDATEINFORMATION
     * 
     */
    public String getUpdateInformation() {
        return (String) get(PROPERTY_UPDATEINFORMATION);
    }
    /**
     * @see ModuleInstall#PROPERTY_UPDATEINFORMATION
     * 
     */
    public void setUpdateInformation(String updateInformation) {
        set(PROPERTY_UPDATEINFORMATION, updateInformation);
    }

    /**
     * @see ModuleInstall#PROPERTY_UPDATEVERSION
     * 
     */
    public String getUpdateVersion() {
        return (String) get(PROPERTY_UPDATEVERSION);
    }
    /**
     * @see ModuleInstall#PROPERTY_UPDATEVERSION
     * 
     */
    public void setUpdateVersion(String updateVersion) {
        set(PROPERTY_UPDATEVERSION, updateVersion);
    }

    /**
     * @see ModuleInstall#PROPERTY_REFERENCEDATADESCRIPTION
     * 
     */
    public String getReferenceDataDescription() {
        return (String) get(PROPERTY_REFERENCEDATADESCRIPTION);
    }
    /**
     * @see ModuleInstall#PROPERTY_REFERENCEDATADESCRIPTION
     * 
     */
    public void setReferenceDataDescription(String referenceDataDescription) {
        set(PROPERTY_REFERENCEDATADESCRIPTION, referenceDataDescription);
    }

    /**
     * @see ModuleInstall#PROPERTY_VERSIONLABEL
     * 
     */
    public String getVersionLabel() {
        return (String) get(PROPERTY_VERSIONLABEL);
    }
    /**
     * @see ModuleInstall#PROPERTY_VERSIONLABEL
     * 
     */
    public void setVersionLabel(String versionLabel) {
        set(PROPERTY_VERSIONLABEL, versionLabel);
    }

    /**
     * @see ModuleInstall#PROPERTY_ISCOMMERCIAL
     * 
     */
    public Boolean isCommercial() {
        return (Boolean) get(PROPERTY_ISCOMMERCIAL);
    }
    /**
     * @see ModuleInstall#PROPERTY_ISCOMMERCIAL
     * 
     */
    public void setCommercial(Boolean isCommercial) {
        set(PROPERTY_ISCOMMERCIAL, isCommercial);
    }

    /**
     * @see ModuleInstall#PROPERTY_ENABLED
     * 
     */
    public Boolean isEnabled() {
        return (Boolean) get(PROPERTY_ENABLED);
    }
    /**
     * @see ModuleInstall#PROPERTY_ENABLED
     * 
     */
    public void setEnabled(Boolean enabled) {
        set(PROPERTY_ENABLED, enabled);
    }

    /**
     * @see ModuleInstall#PROPERTY_APPLYCONFIGURATIONSCRIPT
     * 
     */
    public Boolean isApplyConfigurationScript() {
        return (Boolean) get(PROPERTY_APPLYCONFIGURATIONSCRIPT);
    }
    /**
     * @see ModuleInstall#PROPERTY_APPLYCONFIGURATIONSCRIPT
     * 
     */
    public void setApplyConfigurationScript(Boolean applyConfigurationScript) {
        set(PROPERTY_APPLYCONFIGURATIONSCRIPT, applyConfigurationScript);
    }

    /**
     * @see ModuleInstall#PROPERTY_FREEFORTRIAL
     * 
     */
    public Boolean isFreeForTrial() {
        return (Boolean) get(PROPERTY_FREEFORTRIAL);
    }
    /**
     * @see ModuleInstall#PROPERTY_FREEFORTRIAL
     * 
     */
    public void setFreeForTrial(Boolean freeForTrial) {
        set(PROPERTY_FREEFORTRIAL, freeForTrial);
    }

}
