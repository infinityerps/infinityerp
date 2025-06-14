
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
 * Entity class for entity ADElementTrl (stored in table AD_Element_Trl).
 * <br>
 * Help: {@literal This tab contains the elements translation to different languages. It is important to
     *       check the translated option.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ElementTrl extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Element_Trl";
    public static final String ENTITY_NAME = "ADElementTrl";

    /**
     * Property id stored in column AD_Element_Trl_ID in table AD_Element_Trl 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property applicationElement stored in column AD_Element_ID in table AD_Element_Trl<br>
     * Help: {@literal The System Element allows for the central maintenance of help, descriptions and
     *       terminology for a database column.}
     * 
     */
    public static final String PROPERTY_APPLICATIONELEMENT = "applicationElement";

    /**
     * Property language stored in column AD_Language in table AD_Element_Trl<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";

    /**
     * Property client stored in column AD_Client_ID in table AD_Element_Trl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Element_Trl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Element_Trl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Element_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Element_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Element_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Element_Trl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Element_Trl 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property printText stored in column PrintName in table AD_Element_Trl<br>
     * Help: {@literal The Label to be printed indicates the name that will be printed on a document or
     *       correspondence. The max length is 2000 characters.}
     * 
     */
    public static final String PROPERTY_PRINTTEXT = "printText";

    /**
     * Property description stored in column Description in table AD_Element_Trl<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Element_Trl<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property purchaseOrderName stored in column PO_Name in table AD_Element_Trl<br>
     * Help: {@literal Name in Purchase Windows}
     * 
     */
    public static final String PROPERTY_PURCHASEORDERNAME = "purchaseOrderName";

    /**
     * Property printNameOnPurchaseOrder stored in column PO_PrintName in table AD_Element_Trl<br>
     * Help: {@literal Print name on Purchase Screens/Reports}
     * 
     */
    public static final String PROPERTY_PRINTNAMEONPURCHASEORDER = "printNameOnPurchaseOrder";

    /**
     * Property purchaseOrderDescription stored in column PO_Description in table AD_Element_Trl<br>
     * Help: {@literal Description in Purchase Windows}
     * 
     */
    public static final String PROPERTY_PURCHASEORDERDESCRIPTION = "purchaseOrderDescription";

    /**
     * Property purchaseOrderHelp stored in column PO_Help in table AD_Element_Trl<br>
     * Help: {@literal Help in Purchase Windows}
     * 
     */
    public static final String PROPERTY_PURCHASEORDERHELP = "purchaseOrderHelp";

    /**
     * Property translation stored in column IsTranslated in table AD_Element_Trl<br>
     * Help: {@literal The Translated checkbox indicates if this column is translated.}
     * 
     */
    public static final String PROPERTY_TRANSLATION = "translation";


    public ElementTrl() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TRANSLATION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ElementTrl#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ElementTrl#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ElementTrl#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public Element getApplicationElement() {
        return (Element) get(PROPERTY_APPLICATIONELEMENT);
    }
    /**
     * @see ElementTrl#PROPERTY_APPLICATIONELEMENT
     * 
     */
    public void setApplicationElement(Element applicationElement) {
        set(PROPERTY_APPLICATIONELEMENT, applicationElement);
    }

    /**
     * @see ElementTrl#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see ElementTrl#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

    /**
     * @see ElementTrl#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ElementTrl#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ElementTrl#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ElementTrl#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ElementTrl#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ElementTrl#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ElementTrl#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ElementTrl#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ElementTrl#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ElementTrl#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ElementTrl#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ElementTrl#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ElementTrl#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ElementTrl#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ElementTrl#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ElementTrl#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ElementTrl#PROPERTY_PRINTTEXT
     * 
     */
    public String getPrintText() {
        return (String) get(PROPERTY_PRINTTEXT);
    }
    /**
     * @see ElementTrl#PROPERTY_PRINTTEXT
     * 
     */
    public void setPrintText(String printText) {
        set(PROPERTY_PRINTTEXT, printText);
    }

    /**
     * @see ElementTrl#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ElementTrl#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ElementTrl#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see ElementTrl#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see ElementTrl#PROPERTY_PURCHASEORDERNAME
     * 
     */
    public String getPurchaseOrderName() {
        return (String) get(PROPERTY_PURCHASEORDERNAME);
    }
    /**
     * @see ElementTrl#PROPERTY_PURCHASEORDERNAME
     * 
     */
    public void setPurchaseOrderName(String purchaseOrderName) {
        set(PROPERTY_PURCHASEORDERNAME, purchaseOrderName);
    }

    /**
     * @see ElementTrl#PROPERTY_PRINTNAMEONPURCHASEORDER
     * 
     */
    public String getPrintNameOnPurchaseOrder() {
        return (String) get(PROPERTY_PRINTNAMEONPURCHASEORDER);
    }
    /**
     * @see ElementTrl#PROPERTY_PRINTNAMEONPURCHASEORDER
     * 
     */
    public void setPrintNameOnPurchaseOrder(String printNameOnPurchaseOrder) {
        set(PROPERTY_PRINTNAMEONPURCHASEORDER, printNameOnPurchaseOrder);
    }

    /**
     * @see ElementTrl#PROPERTY_PURCHASEORDERDESCRIPTION
     * 
     */
    public String getPurchaseOrderDescription() {
        return (String) get(PROPERTY_PURCHASEORDERDESCRIPTION);
    }
    /**
     * @see ElementTrl#PROPERTY_PURCHASEORDERDESCRIPTION
     * 
     */
    public void setPurchaseOrderDescription(String purchaseOrderDescription) {
        set(PROPERTY_PURCHASEORDERDESCRIPTION, purchaseOrderDescription);
    }

    /**
     * @see ElementTrl#PROPERTY_PURCHASEORDERHELP
     * 
     */
    public String getPurchaseOrderHelp() {
        return (String) get(PROPERTY_PURCHASEORDERHELP);
    }
    /**
     * @see ElementTrl#PROPERTY_PURCHASEORDERHELP
     * 
     */
    public void setPurchaseOrderHelp(String purchaseOrderHelp) {
        set(PROPERTY_PURCHASEORDERHELP, purchaseOrderHelp);
    }

    /**
     * @see ElementTrl#PROPERTY_TRANSLATION
     * 
     */
    public Boolean isTranslation() {
        return (Boolean) get(PROPERTY_TRANSLATION);
    }
    /**
     * @see ElementTrl#PROPERTY_TRANSLATION
     * 
     */
    public void setTranslation(Boolean translation) {
        set(PROPERTY_TRANSLATION, translation);
    }

}
