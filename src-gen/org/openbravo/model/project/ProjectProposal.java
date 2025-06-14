
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
/**
 * Entity class for entity ProjectProposal (stored in table C_ProjectProposal).
 * <br>
 * Help: {@literal Contains the budgets assigned to business partners and a project}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProjectProposal extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_ProjectProposal";
    public static final String ENTITY_NAME = "ProjectProposal";

    /**
     * Property id stored in column C_Projectproposal_ID in table C_ProjectProposal<br>
     * Help: {@literal The ID identifies a unique proposal for the project}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_ProjectProposal 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_ProjectProposal 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_ProjectProposal 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_ProjectProposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_ProjectProposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_ProjectProposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_ProjectProposal 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property project stored in column C_Project_ID in table C_ProjectProposal<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_ProjectProposal<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property dateSent stored in column Datesend in table C_ProjectProposal<br>
     * Help: {@literal The date of the proposal was sent}
     * 
     */
    public static final String PROPERTY_DATESENT = "dateSent";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table C_ProjectProposal<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property userContact stored in column AD_User_ID in table C_ProjectProposal<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property copyFrom stored in column CopyFrom in table C_ProjectProposal<br>
     * Help: {@literal Copy lines (products) from another document of the same type.}
     * 
     */
    public static final String PROPERTY_COPYFROM = "copyFrom";

    /**
     * Property headerNote stored in column HeaderNote in table C_ProjectProposal<br>
     * Help: {@literal Using this field you can write a text that will show on the header of the document when
     *       you print it}
     * 
     */
    public static final String PROPERTY_HEADERNOTE = "headerNote";

    /**
     * Property footer stored in column FootNote in table C_ProjectProposal<br>
     * Help: {@literal Using this field you can write a text that will show on the foot of the document when you
     *       print it}
     * 
     */
    public static final String PROPERTY_FOOTER = "footer";

    /**
     * Property salesTransaction stored in column IsSOTrx in table C_ProjectProposal<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_ProjectProposal<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_ProjectProposal<br>
     * Help: {@literal Form of Payment indicates the method of payment used for this transaction (eg. cash, wire
     *       transfer, etc.)}
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property projectBidWon stored in column Projectwon in table C_ProjectProposal<br>
     * Help: {@literal Award contract to project}
     * 
     */
    public static final String PROPERTY_PROJECTBIDWON = "projectBidWon";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table C_ProjectProposal
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property projectProjectProposalTaskList stored in table C_ProjectProposal
     * 
     */
    public static final String PROPERTY_PROJECTPROJECTPROPOSALTASKLIST = "projectProjectProposalTaskList";

    /**
     * Property projectProposalLineList stored in table C_ProjectProposal
     * 
     */
    public static final String PROPERTY_PROJECTPROPOSALLINELIST = "projectProposalLineList";


    public ProjectProposal() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COPYFROM, false);
        setDefaultValue(PROPERTY_SALESTRANSACTION, true);
        setDefaultValue(PROPERTY_PROJECTBIDWON, false);
        setDefaultValue(PROPERTY_PROJECTPROJECTPROPOSALTASKLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTPROPOSALLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProjectProposal#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProjectProposal#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProjectProposal#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProjectProposal#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProjectProposal#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProjectProposal#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProjectProposal#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProjectProposal#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProjectProposal#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProjectProposal#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProjectProposal#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProjectProposal#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProjectProposal#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProjectProposal#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProjectProposal#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProjectProposal#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProjectProposal#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see ProjectProposal#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see ProjectProposal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see ProjectProposal#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see ProjectProposal#PROPERTY_DATESENT
     * 
     */
    public Date getDateSent() {
        return (Date) get(PROPERTY_DATESENT);
    }
    /**
     * @see ProjectProposal#PROPERTY_DATESENT
     * 
     */
    public void setDateSent(Date dateSent) {
        set(PROPERTY_DATESENT, dateSent);
    }

    /**
     * @see ProjectProposal#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see ProjectProposal#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see ProjectProposal#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see ProjectProposal#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see ProjectProposal#PROPERTY_COPYFROM
     * 
     */
    public Boolean isCopyFrom() {
        return (Boolean) get(PROPERTY_COPYFROM);
    }
    /**
     * @see ProjectProposal#PROPERTY_COPYFROM
     * 
     */
    public void setCopyFrom(Boolean copyFrom) {
        set(PROPERTY_COPYFROM, copyFrom);
    }

    /**
     * @see ProjectProposal#PROPERTY_HEADERNOTE
     * 
     */
    public String getHeaderNote() {
        return (String) get(PROPERTY_HEADERNOTE);
    }
    /**
     * @see ProjectProposal#PROPERTY_HEADERNOTE
     * 
     */
    public void setHeaderNote(String headerNote) {
        set(PROPERTY_HEADERNOTE, headerNote);
    }

    /**
     * @see ProjectProposal#PROPERTY_FOOTER
     * 
     */
    public String getFooter() {
        return (String) get(PROPERTY_FOOTER);
    }
    /**
     * @see ProjectProposal#PROPERTY_FOOTER
     * 
     */
    public void setFooter(String footer) {
        set(PROPERTY_FOOTER, footer);
    }

    /**
     * @see ProjectProposal#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see ProjectProposal#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see ProjectProposal#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see ProjectProposal#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see ProjectProposal#PROPERTY_FORMOFPAYMENT
     * 
     */
    public String getFormOfPayment() {
        return (String) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see ProjectProposal#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(String formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see ProjectProposal#PROPERTY_PROJECTBIDWON
     * 
     */
    public Boolean isProjectBidWon() {
        return (Boolean) get(PROPERTY_PROJECTBIDWON);
    }
    /**
     * @see ProjectProposal#PROPERTY_PROJECTBIDWON
     * 
     */
    public void setProjectBidWon(Boolean projectBidWon) {
        set(PROPERTY_PROJECTBIDWON, projectBidWon);
    }

    /**
     * @see ProjectProposal#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see ProjectProposal#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * Help: {@literal Contains all the tasks that comprise a proposal}<br>
     * @see ProjectProposalTask
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectProposalTask> getProjectProjectProposalTaskList() {
      return (List<ProjectProposalTask>) get(PROPERTY_PROJECTPROJECTPROPOSALTASKLIST);
    }

    /**
     * Help: {@literal Contains all the tasks that comprise a proposal}<br>
     * @see ProjectProposalTask
     * 
     */
    public void setProjectProjectProposalTaskList(List<ProjectProposalTask> projectProjectProposalTaskList) {
        set(PROPERTY_PROJECTPROJECTPROPOSALTASKLIST, projectProjectProposalTaskList);
    }

    /**
     * Help: {@literal Contains all budgeted products to a Business Partner detailing information such as
     *       quantity, price,…}<br>
     * @see ProjectProposalLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectProposalLine> getProjectProposalLineList() {
      return (List<ProjectProposalLine>) get(PROPERTY_PROJECTPROPOSALLINELIST);
    }

    /**
     * Help: {@literal Contains all budgeted products to a Business Partner detailing information such as
     *       quantity, price,…}<br>
     * @see ProjectProposalLine
     * 
     */
    public void setProjectProposalLineList(List<ProjectProposalLine> projectProposalLineList) {
        set(PROPERTY_PROJECTPROPOSALLINELIST, projectProposalLineList);
    }

}
