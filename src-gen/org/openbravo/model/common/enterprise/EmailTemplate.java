
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
package org.openbravo.model.common.enterprise;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.system.Language;
/**
 * Entity class for entity EmailTemplate (stored in table C_POC_EMAILDEFINITION).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class EmailTemplate extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_POC_EMAILDEFINITION";
    public static final String ENTITY_NAME = "EmailTemplate";

    /**
     * Property id stored in column C_Poc_Emaildefinition_ID in table C_POC_EMAILDEFINITION 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_POC_EMAILDEFINITION 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_POC_EMAILDEFINITION 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_POC_EMAILDEFINITION 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_POC_EMAILDEFINITION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_POC_EMAILDEFINITION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_POC_EMAILDEFINITION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_POC_EMAILDEFINITION 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property pocDocumentType stored in column C_Poc_Doctype_Template_ID in table C_POC_EMAILDEFINITION<br>
     * Help: {@literal Informs about the document type we are configuring}
     * 
     */
    public static final String PROPERTY_POCDOCUMENTTYPE = "pocDocumentType";

    /**
     * Property subject stored in column Subject in table C_POC_EMAILDEFINITION 
     * 
     */
    public static final String PROPERTY_SUBJECT = "subject";

    /**
     * Property body stored in column Body in table C_POC_EMAILDEFINITION<br>
     * Help: As in the subject some tags are available 
     *       References will be replaced by values:
     *           *
     *       &#64;cus_ref&#64;: The document reference of the customer
     *           * &#64;our_ref&#64;: The reference of
     *       the document
     *           * &#64;cus_nam&#64;: The name of the customer
     *           * &#64;sal_nam&#64;: The name of
     *       the sales rep.
     *           * &#64;bp_nam&#64;: The Business Partner name
     *           * &#64;doc_date&#64;: The
     *       document date
     *           * &#64;doc_desc&#64;: The document description
     *           * &#64;doc_nextduedate&#64;:
     *       The next due date (if document has associated any payment plan)
     *           * &#64;doc_lastduedate&#64;: The
     *       last due date (if document has associated any payment plan)
     * 
     */
    public static final String PROPERTY_BODY = "body";

    /**
     * Property default stored in column Isdefault in table C_POC_EMAILDEFINITION<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_DEFAULT = "default";

    /**
     * Property language stored in column AD_Language in table C_POC_EMAILDEFINITION<br>
     * Help: {@literal The Language identifies the language to use for display}
     * 
     */
    public static final String PROPERTY_LANGUAGE = "language";


    public EmailTemplate() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see EmailTemplate#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see EmailTemplate#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see EmailTemplate#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see EmailTemplate#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see EmailTemplate#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see EmailTemplate#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see EmailTemplate#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see EmailTemplate#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see EmailTemplate#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see EmailTemplate#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see EmailTemplate#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see EmailTemplate#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see EmailTemplate#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see EmailTemplate#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see EmailTemplate#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see EmailTemplate#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see EmailTemplate#PROPERTY_POCDOCUMENTTYPE
     * 
     */
    public DocumentTemplate getPocDocumentType() {
        return (DocumentTemplate) get(PROPERTY_POCDOCUMENTTYPE);
    }
    /**
     * @see EmailTemplate#PROPERTY_POCDOCUMENTTYPE
     * 
     */
    public void setPocDocumentType(DocumentTemplate pocDocumentType) {
        set(PROPERTY_POCDOCUMENTTYPE, pocDocumentType);
    }

    /**
     * @see EmailTemplate#PROPERTY_SUBJECT
     * 
     */
    public String getSubject() {
        return (String) get(PROPERTY_SUBJECT);
    }
    /**
     * @see EmailTemplate#PROPERTY_SUBJECT
     * 
     */
    public void setSubject(String subject) {
        set(PROPERTY_SUBJECT, subject);
    }

    /**
     * @see EmailTemplate#PROPERTY_BODY
     * 
     */
    public String getBody() {
        return (String) get(PROPERTY_BODY);
    }
    /**
     * @see EmailTemplate#PROPERTY_BODY
     * 
     */
    public void setBody(String body) {
        set(PROPERTY_BODY, body);
    }

    /**
     * @see EmailTemplate#PROPERTY_DEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }
    /**
     * @see EmailTemplate#PROPERTY_DEFAULT
     * 
     */
    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
    }

    /**
     * @see EmailTemplate#PROPERTY_LANGUAGE
     * 
     */
    public Language getLanguage() {
        return (Language) get(PROPERTY_LANGUAGE);
    }
    /**
     * @see EmailTemplate#PROPERTY_LANGUAGE
     * 
     */
    public void setLanguage(Language language) {
        set(PROPERTY_LANGUAGE, language);
    }

}
