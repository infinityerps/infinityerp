
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
package org.openbravo.model.project;

import java.util.Date;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ActiveProposalV (stored in table C_Projectproposal_V).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ActiveProposal extends BaseOBObject implements ClientEnabled, OrganizationEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Projectproposal_V";
    public static final String ENTITY_NAME = "ActiveProposalV";

    /**
     * Property from stored in column Fromdatesend in table C_Projectproposal_V
     * 
     */
    public static final String PROPERTY_FROM = "from";

    /**
     * Property until stored in column Todatesend in table C_Projectproposal_V
     * 
     */
    public static final String PROPERTY_UNTIL = "until";

    /**
     * Property client stored in column AD_Client_ID in table C_Projectproposal_V 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Projectproposal_V 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property userContact stored in column AD_User_ID in table C_Projectproposal_V<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Projectproposal_V<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table C_Projectproposal_V<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property project stored in column C_Project_ID in table C_Projectproposal_V<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property id stored in column C_Projectproposal_ID in table C_Projectproposal_V 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property salesTransaction stored in column IsSOTrx in table C_Projectproposal_V<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property firstName stored in column Firstname in table C_Projectproposal_V 
     * 
     */
    public static final String PROPERTY_FIRSTNAME = "firstName";

    /**
     * Property lastName stored in column Lastname in table C_Projectproposal_V 
     * 
     */
    public static final String PROPERTY_LASTNAME = "lastName";

    /**
     * Property dateSent stored in column Datesend in table C_Projectproposal_V<br>
     * Help: {@literal The date of the proposal was sent}
     * 
     */
    public static final String PROPERTY_DATESENT = "dateSent";


    public ActiveProposal() {
        setDefaultValue(PROPERTY_SALESTRANSACTION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ActiveProposal#PROPERTY_FROM
     * 
     */
    public Date getFrom() {
        return (Date) get(PROPERTY_FROM);
    }
    /**
     * @see ActiveProposal#PROPERTY_FROM
     * 
     */
    public void setFrom(Date from) {
        set(PROPERTY_FROM, from);
    }

    /**
     * @see ActiveProposal#PROPERTY_UNTIL
     * 
     */
    public Date getUntil() {
        return (Date) get(PROPERTY_UNTIL);
    }
    /**
     * @see ActiveProposal#PROPERTY_UNTIL
     * 
     */
    public void setUntil(Date until) {
        set(PROPERTY_UNTIL, until);
    }

    /**
     * @see ActiveProposal#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ActiveProposal#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ActiveProposal#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ActiveProposal#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ActiveProposal#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see ActiveProposal#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see ActiveProposal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ActiveProposal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ActiveProposal#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see ActiveProposal#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see ActiveProposal#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see ActiveProposal#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see ActiveProposal#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ActiveProposal#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ActiveProposal#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see ActiveProposal#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see ActiveProposal#PROPERTY_FIRSTNAME
     * 
     */
    public String getFirstName() {
        return (String) get(PROPERTY_FIRSTNAME);
    }
    /**
     * @see ActiveProposal#PROPERTY_FIRSTNAME
     * 
     */
    public void setFirstName(String firstName) {
        set(PROPERTY_FIRSTNAME, firstName);
    }

    /**
     * @see ActiveProposal#PROPERTY_LASTNAME
     * 
     */
    public String getLastName() {
        return (String) get(PROPERTY_LASTNAME);
    }
    /**
     * @see ActiveProposal#PROPERTY_LASTNAME
     * 
     */
    public void setLastName(String lastName) {
        set(PROPERTY_LASTNAME, lastName);
    }

    /**
     * @see ActiveProposal#PROPERTY_DATESENT
     * 
     */
    public Date getDateSent() {
        return (Date) get(PROPERTY_DATESENT);
    }
    /**
     * @see ActiveProposal#PROPERTY_DATESENT
     * 
     */
    public void setDateSent(Date dateSent) {
        set(PROPERTY_DATESENT, dateSent);
    }

}
