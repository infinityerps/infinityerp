
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
package org.openbravo.model.common.plm;

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
 * Entity class for entity CharacteristicTrl (stored in table M_Characteristic_Trl).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CharacteristicTrl extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Characteristic_Trl";
    public static final String ENTITY_NAME = "CharacteristicTrl";

    /**
     * Property id stored in column M_Characteristic_Trl_ID in table M_Characteristic_Trl 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property characteristic stored in column M_Characteristic_ID in table M_Characteristic_Trl<br>
     * Help: {@literal Definition of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_CHARACTERISTIC = "characteristic";

    /**
     * Property language stored in column AD_Language in table M_Characteristic_Trl<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property client stored in column AD_Client_ID in table M_Characteristic_Trl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Characteristic_Trl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Characteristic_Trl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Characteristic_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Characteristic_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Characteristic_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Characteristic_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Characteristic_Trl 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property documentNote stored in column Documentnote in table M_Characteristic_Trl<br>
     * Help: {@literal The Document Note is used for recording any additional information regarding this
     *       product.}
     * 
     */
    public static final String PROPERTY_DOCUMENTNOTE = "documentNote";

    /**
     * Property translation stored in column Istranslated in table M_Characteristic_Trl<br>
     * Help: {@literal The Translated checkbox indicates if this column is translated.}
     * 
     */
    public static final String PROPERTY_TRANSLATION = "translation";


    public CharacteristicTrl() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TRANSLATION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CharacteristicTrl#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_CHARACTERISTIC
     * 
     */
    public Characteristic getCharacteristic() {
        return (Characteristic) get(PROPERTY_CHARACTERISTIC);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_CHARACTERISTIC
     * 
     */
    public void setCharacteristic(Characteristic characteristic) {
        set(PROPERTY_CHARACTERISTIC, characteristic);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_DOCUMENTNOTE
     * 
     */
    public String getDocumentNote() {
        return (String) get(PROPERTY_DOCUMENTNOTE);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_DOCUMENTNOTE
     * 
     */
    public void setDocumentNote(String documentNote) {
        set(PROPERTY_DOCUMENTNOTE, documentNote);
    }

    /**
     * @see CharacteristicTrl#PROPERTY_TRANSLATION
     * 
     */
    public Boolean isTranslation() {
        return (Boolean) get(PROPERTY_TRANSLATION);
    }
    /**
     * @see CharacteristicTrl#PROPERTY_TRANSLATION
     * 
     */
    public void setTranslation(Boolean translation) {
        set(PROPERTY_TRANSLATION, translation);
    }

}
