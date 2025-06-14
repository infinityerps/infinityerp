
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
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADAuxiliaryInput (stored in table AD_AuxiliarInput).
 * <br>
 * Help: {@literal To configure an auxiliary input, you need to select the corresponding tab, name the
     *       auxiliary input and define a validation code. For example, when selecting the payment method, you
     *       can force that all payments are done in cash.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AuxiliaryInput extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_AuxiliarInput";
    public static final String ENTITY_NAME = "ADAuxiliaryInput";

    /**
     * Property id stored in column Ad_Auxiliarinput_Id in table AD_AuxiliarInput 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_AuxiliarInput 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_AuxiliarInput 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_AuxiliarInput 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_AuxiliarInput 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_AuxiliarInput 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_AuxiliarInput 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_AuxiliarInput 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property tab stored in column AD_Tab_ID in table AD_AuxiliarInput<br>
     * Help: {@literal The Tab indicates a tab that displays within a window.}
     * 
     */
    public static final String PROPERTY_TAB = "tab";

    /**
     * Property name stored in column Name in table AD_AuxiliarInput 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property validationCode stored in column Code in table AD_AuxiliarInput<br>
     * Help: {@literal The Validation Code is the code that will be executed to determine the rule.}
     * 
     */
    public static final String PROPERTY_VALIDATIONCODE = "validationCode";

    /**
     * Property module stored in column AD_Module_ID in table AD_AuxiliarInput<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";


    public AuxiliaryInput() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AuxiliaryInput#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_TAB
     * 
     */
    public Tab getTab() {
        return (Tab) get(PROPERTY_TAB);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_TAB
     * 
     */
    public void setTab(Tab tab) {
        set(PROPERTY_TAB, tab);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_VALIDATIONCODE
     * 
     */
    public String getValidationCode() {
        return (String) get(PROPERTY_VALIDATIONCODE);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_VALIDATIONCODE
     * 
     */
    public void setValidationCode(String validationCode) {
        set(PROPERTY_VALIDATIONCODE, validationCode);
    }

    /**
     * @see AuxiliaryInput#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see AuxiliaryInput#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

}
