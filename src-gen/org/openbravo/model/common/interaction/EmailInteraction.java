
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
package org.openbravo.model.common.interaction;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Table;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity EmailInteraction (stored in table C_POC_EMAIL).
 * <br>
 * Help: {@literal C_POC_EMAIL}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class EmailInteraction extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_POC_EMAIL";
    public static final String ENTITY_NAME = "EmailInteraction";

    /**
     * Property id stored in column C_Poc_Email_ID in table C_POC_EMAIL
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_POC_EMAIL 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_POC_EMAIL 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_POC_EMAIL 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_POC_EMAIL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_POC_EMAIL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_POC_EMAIL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_POC_EMAIL 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property addressFrom stored in column Address_From in table C_POC_EMAIL
     * 
     */
    public static final String PROPERTY_ADDRESSFROM = "addressFrom";

    /**
     * Property addressTo stored in column Address_To in table C_POC_EMAIL
     * 
     */
    public static final String PROPERTY_ADDRESSTO = "addressTo";

    /**
     * Property addressCc stored in column Address_Cc in table C_POC_EMAIL
     * 
     */
    public static final String PROPERTY_ADDRESSCC = "addressCc";

    /**
     * Property addressBcc stored in column Address_Bcc in table C_POC_EMAIL
     * 
     */
    public static final String PROPERTY_ADDRESSBCC = "addressBcc";

    /**
     * Property dateofemail stored in column Dateofemail in table C_POC_EMAIL 
     * 
     */
    public static final String PROPERTY_DATEOFEMAIL = "dateofemail";

    /**
     * Property subject stored in column Subject in table C_POC_EMAIL 
     * 
     */
    public static final String PROPERTY_SUBJECT = "subject";

    /**
     * Property body stored in column Body in table C_POC_EMAIL<br>
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
     * Property businessPartner stored in column C_Bpartner_ID in table C_POC_EMAIL<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property emailType stored in column Email_Type in table C_POC_EMAIL
     * 
     */
    public static final String PROPERTY_EMAILTYPE = "emailType";

    /**
     * Property table stored in column AD_Table_ID in table C_POC_EMAIL<br>
     * Help: {@literal The Table indicates the table in which a field or fields reside.}
     * 
     */
    public static final String PROPERTY_TABLE = "table";

    /**
     * Property document stored in column Document_ID in table C_POC_EMAIL<br>
     * Help: {@literal The document id that has sent the email.}
     * 
     */
    public static final String PROPERTY_DOCUMENT = "document";


    public EmailInteraction() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see EmailInteraction#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see EmailInteraction#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see EmailInteraction#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see EmailInteraction#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see EmailInteraction#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see EmailInteraction#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see EmailInteraction#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see EmailInteraction#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see EmailInteraction#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see EmailInteraction#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see EmailInteraction#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see EmailInteraction#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see EmailInteraction#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see EmailInteraction#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see EmailInteraction#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see EmailInteraction#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see EmailInteraction#PROPERTY_ADDRESSFROM
     * 
     */
    public String getAddressFrom() {
        return (String) get(PROPERTY_ADDRESSFROM);
    }
    /**
     * @see EmailInteraction#PROPERTY_ADDRESSFROM
     * 
     */
    public void setAddressFrom(String addressFrom) {
        set(PROPERTY_ADDRESSFROM, addressFrom);
    }

    /**
     * @see EmailInteraction#PROPERTY_ADDRESSTO
     * 
     */
    public String getAddressTo() {
        return (String) get(PROPERTY_ADDRESSTO);
    }
    /**
     * @see EmailInteraction#PROPERTY_ADDRESSTO
     * 
     */
    public void setAddressTo(String addressTo) {
        set(PROPERTY_ADDRESSTO, addressTo);
    }

    /**
     * @see EmailInteraction#PROPERTY_ADDRESSCC
     * 
     */
    public String getAddressCc() {
        return (String) get(PROPERTY_ADDRESSCC);
    }
    /**
     * @see EmailInteraction#PROPERTY_ADDRESSCC
     * 
     */
    public void setAddressCc(String addressCc) {
        set(PROPERTY_ADDRESSCC, addressCc);
    }

    /**
     * @see EmailInteraction#PROPERTY_ADDRESSBCC
     * 
     */
    public String getAddressBcc() {
        return (String) get(PROPERTY_ADDRESSBCC);
    }
    /**
     * @see EmailInteraction#PROPERTY_ADDRESSBCC
     * 
     */
    public void setAddressBcc(String addressBcc) {
        set(PROPERTY_ADDRESSBCC, addressBcc);
    }

    /**
     * @see EmailInteraction#PROPERTY_DATEOFEMAIL
     * 
     */
    public Date getDateofemail() {
        return (Date) get(PROPERTY_DATEOFEMAIL);
    }
    /**
     * @see EmailInteraction#PROPERTY_DATEOFEMAIL
     * 
     */
    public void setDateofemail(Date dateofemail) {
        set(PROPERTY_DATEOFEMAIL, dateofemail);
    }

    /**
     * @see EmailInteraction#PROPERTY_SUBJECT
     * 
     */
    public String getSubject() {
        return (String) get(PROPERTY_SUBJECT);
    }
    /**
     * @see EmailInteraction#PROPERTY_SUBJECT
     * 
     */
    public void setSubject(String subject) {
        set(PROPERTY_SUBJECT, subject);
    }

    /**
     * @see EmailInteraction#PROPERTY_BODY
     * 
     */
    public String getBody() {
        return (String) get(PROPERTY_BODY);
    }
    /**
     * @see EmailInteraction#PROPERTY_BODY
     * 
     */
    public void setBody(String body) {
        set(PROPERTY_BODY, body);
    }

    /**
     * @see EmailInteraction#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see EmailInteraction#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see EmailInteraction#PROPERTY_EMAILTYPE
     * 
     */
    public String getEmailType() {
        return (String) get(PROPERTY_EMAILTYPE);
    }
    /**
     * @see EmailInteraction#PROPERTY_EMAILTYPE
     * 
     */
    public void setEmailType(String emailType) {
        set(PROPERTY_EMAILTYPE, emailType);
    }

    /**
     * @see EmailInteraction#PROPERTY_TABLE
     * 
     */
    public Table getTable() {
        return (Table) get(PROPERTY_TABLE);
    }
    /**
     * @see EmailInteraction#PROPERTY_TABLE
     * 
     */
    public void setTable(Table table) {
        set(PROPERTY_TABLE, table);
    }

    /**
     * @see EmailInteraction#PROPERTY_DOCUMENT
     * 
     */
    public String getDocument() {
        return (String) get(PROPERTY_DOCUMENT);
    }
    /**
     * @see EmailInteraction#PROPERTY_DOCUMENT
     * 
     */
    public void setDocument(String document) {
        set(PROPERTY_DOCUMENT, document);
    }

}
