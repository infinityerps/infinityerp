
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
package org.openbravo.model.ad.system;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADLanguage (stored in table AD_Language).
 * <br>
 * Help: {@literal If you want to add an additional User Interface language, select "System Language".
     *       Otherwise, the system allows you to just translate elements for printing documents.
     *       The Language
     *       needs to be a (verified) System Language}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Language extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Language";
    public static final String ENTITY_NAME = "ADLanguage";

    /**
     * Property id stored in column AD_Language_ID in table AD_Language
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property language stored in column AD_Language in table AD_Language<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property client stored in column AD_Client_ID in table AD_Language 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Language 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Language 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Language 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Language 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Language 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Language 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Language 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property iSOLanguageCode stored in column LanguageISO in table AD_Language<br>
     * Help: {@literal The ISO Language Code indicates the standard ISO code for a language in lower case. 
     *       Information can be found at http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt}
     * 
     */
    public static final String PROPERTY_ISOLANGUAGECODE = "iSOLanguageCode";

    /**
     * Property iSOCountryCode stored in column CountryCode in table AD_Language<br>
     * Help: {@literal For details - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or -
     *       http://www.unece.org/trade/rec/rec03en.htm}
     * 
     */
    public static final String PROPERTY_ISOCOUNTRYCODE = "iSOCountryCode";

    /**
     * Property baseLanguage stored in column IsBaseLanguage in table AD_Language<br>
     * Help: {@literal The system information is maintained in this language}
     * 
     */
    public static final String PROPERTY_BASELANGUAGE = "baseLanguage";

    /**
     * Property systemLanguage stored in column IsSystemLanguage in table AD_Language<br>
     * Help: {@literal Select, if you want to have translated screens available in this language.  Please notify
     *       your system administrator to run the language maintenance scripts to enable the use of this
     *       language.  If the language is not supplied, you can translate the terms yourself.}
     * 
     */
    public static final String PROPERTY_SYSTEMLANGUAGE = "systemLanguage";

    /**
     * Property processNow stored in column Processing in table AD_Language<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property pixelSize stored in column Pixelsize in table AD_Language
     * 
     */
    public static final String PROPERTY_PIXELSIZE = "pixelSize";

    /**
     * Property translatedBy stored in column Translatedby in table AD_Language<br>
     * Help: {@literal This fields shows who has contributed to the translation of this language.}
     * 
     */
    public static final String PROPERTY_TRANSLATEDBY = "translatedBy";

    /**
     * Property rTLLanguage stored in column Isrtl in table AD_Language<br>
     * Help: {@literal Identifies the language as written from right to left.}
     * 
     */
    public static final String PROPERTY_RTLLANGUAGE = "rTLLanguage";


    public Language() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_BASELANGUAGE, false);
        setDefaultValue(PROPERTY_SYSTEMLANGUAGE, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_RTLLANGUAGE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Language#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Language#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Language#PROPERTY_LANGUAGE
     * 
     */
    public String getLanguage() {
        return (String) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see Language#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(String language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see Language#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Language#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Language#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Language#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Language#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Language#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Language#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Language#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Language#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Language#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Language#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Language#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Language#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Language#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Language#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Language#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Language#PROPERTY_ISOLANGUAGECODE
     * 
     */
    public String getISOLanguageCode() {
        return (String) get(PROPERTY_ISOLANGUAGECODE);
    }
    /**
     * @see Language#PROPERTY_ISOLANGUAGECODE
     * 
     */
    public void setISOLanguageCode(String iSOLanguageCode) {
        set(PROPERTY_ISOLANGUAGECODE, iSOLanguageCode);
    }

    /**
     * @see Language#PROPERTY_ISOCOUNTRYCODE
     * 
     */
    public String getISOCountryCode() {
        return (String) get(PROPERTY_ISOCOUNTRYCODE);
    }
    /**
     * @see Language#PROPERTY_ISOCOUNTRYCODE
     * 
     */
    public void setISOCountryCode(String iSOCountryCode) {
        set(PROPERTY_ISOCOUNTRYCODE, iSOCountryCode);
    }

    /**
     * @see Language#PROPERTY_BASELANGUAGE
     * 
     */
    public Boolean isBaseLanguage() {
        return (Boolean) get(PROPERTY_BASELANGUAGE);
    }
    /**
     * @see Language#PROPERTY_BASELANGUAGE
     * 
     */
    public void setBaseLanguage(Boolean baseLanguage) {
        set(PROPERTY_BASELANGUAGE, baseLanguage);
    }

    /**
     * @see Language#PROPERTY_SYSTEMLANGUAGE
     * 
     */
    public Boolean isSystemLanguage() {
        return (Boolean) get(PROPERTY_SYSTEMLANGUAGE);
    }
    /**
     * @see Language#PROPERTY_SYSTEMLANGUAGE
     * 
     */
    public void setSystemLanguage(Boolean systemLanguage) {
        set(PROPERTY_SYSTEMLANGUAGE, systemLanguage);
    }

    /**
     * @see Language#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Language#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Language#PROPERTY_PIXELSIZE
     * 
     */
    public Long getPixelSize() {
        return (Long) get(PROPERTY_PIXELSIZE);
    }
    /**
     * @see Language#PROPERTY_PIXELSIZE
     * 
     */
    public void setPixelSize(Long pixelSize) {
        set(PROPERTY_PIXELSIZE, pixelSize);
    }

    /**
     * @see Language#PROPERTY_TRANSLATEDBY
     * 
     */
    public String getTranslatedBy() {
        return (String) get(PROPERTY_TRANSLATEDBY);
    }
    /**
     * @see Language#PROPERTY_TRANSLATEDBY
     * 
     */
    public void setTranslatedBy(String translatedBy) {
        set(PROPERTY_TRANSLATEDBY, translatedBy);
    }

    /**
     * @see Language#PROPERTY_RTLLANGUAGE
     * 
     */
    public Boolean isRTLLanguage() {
        return (Boolean) get(PROPERTY_RTLLANGUAGE);
    }
    /**
     * @see Language#PROPERTY_RTLLANGUAGE
     * 
     */
    public void setRTLLanguage(Boolean rTLLanguage) {
        set(PROPERTY_RTLLANGUAGE, rTLLanguage);
    }

}
