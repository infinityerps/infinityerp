
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

import java.math.BigDecimal;
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.common.invoice.InvoiceV2;
import org.openbravo.model.common.order.InvoiceCandidateV;
import org.openbravo.model.common.order.Order;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.model.pricing.pricelist.PriceListVersion;
/**
 * Entity class for entity Project (stored in table C_Project).
 * <br>
 * Help: {@literal Contains the Value, Name and Description for each project.  It also defines and tracks the
     *       amounts assigned to, committed to and used for this project. This tab is used in order to introduce
     *       information regarding a project: Address, status, …}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Project extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Project";
    public static final String ENTITY_NAME = "Project";

    /**
     * Property id stored in column C_Project_ID in table C_Project<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Project 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Project 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Project 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Project 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Project 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Project 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Project 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table C_Project 
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table C_Project 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Project<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property comments stored in column Note in table C_Project<br>
     * Help: {@literal The Note field allows for optional entry of user defined information regarding this
     *       record}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property summaryLevel stored in column IsSummary in table C_Project<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property userContact stored in column AD_User_ID in table C_Project<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Project<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property partnerAddress stored in column C_BPartner_Location_ID in table C_Project<br>
     * Help: {@literal The Partner address indicates the location of a Business Partner}
     * 
     */
    public static final String PROPERTY_PARTNERADDRESS = "partnerAddress";

    /**
     * Property orderReference stored in column POReference in table C_Project<br>
     * Help: {@literal This can be used to input a reference for this specific transaction. For example, a
     *       Purchase Order number can be input on a Sales Order for easier reference.}
     * 
     */
    public static final String PROPERTY_ORDERREFERENCE = "orderReference";

    /**
     * Property paymentTerms stored in column C_PaymentTerm_ID in table C_Project<br>
     * Help: {@literal Payment Terms identify the method and timing of payment for this transaction.}
     * 
     */
    public static final String PROPERTY_PAYMENTTERMS = "paymentTerms";

    /**
     * Property currency stored in column C_Currency_ID in table C_Project<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property createTemporaryPriceList stored in column Createtemppricelist in table C_Project<br>
     * Help: {@literal This option permits to indicate if a temporary price list will be created for the current
     *       project when changing its status to 'Order'.}
     * 
     */
    public static final String PROPERTY_CREATETEMPORARYPRICELIST = "createTemporaryPriceList";

    /**
     * Property priceListVersion stored in column M_PriceList_Version_ID in table C_Project<br>
     * Help: {@literal Each Price List can have multiple versions.  The most common use is to indicate the dates
     *       that a Price List is valid for.}
     * 
     */
    public static final String PROPERTY_PRICELISTVERSION = "priceListVersion";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_Project<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property legallyBindingContract stored in column IsCommitment in table C_Project<br>
     * Help: {@literal Commitment indicates if the document is legally binding.}
     * 
     */
    public static final String PROPERTY_LEGALLYBINDINGCONTRACT = "legallyBindingContract";

    /**
     * Property plannedAmount stored in column PlannedAmt in table C_Project<br>
     * Help: {@literal The Planned Amount indicates the anticipated amount for this project or project line.}
     * 
     */
    public static final String PROPERTY_PLANNEDAMOUNT = "plannedAmount";

    /**
     * Property plannedQuantity stored in column PlannedQty in table C_Project<br>
     * Help: {@literal The Planned Quantity indicates the anticipated quantity for this project or project line}
     * 
     */
    public static final String PROPERTY_PLANNEDQUANTITY = "plannedQuantity";

    /**
     * Property plannedMargin stored in column PlannedMarginAmt in table C_Project<br>
     * Help: {@literal The Planned Margin Amount indicates the anticipated margin amount for this project or
     *       project line.}
     * 
     */
    public static final String PROPERTY_PLANNEDMARGIN = "plannedMargin";

    /**
     * Property contractAmount stored in column CommittedAmt in table C_Project<br>
     * Help: {@literal The commitment amount is independent from the planned amount. You would use the planned
     *       amount for your realistic estimation, which might be higher or lower than the commitment amount.}
     * 
     */
    public static final String PROPERTY_CONTRACTAMOUNT = "contractAmount";

    /**
     * Property contractDate stored in column DateContract in table C_Project<br>
     * Help: {@literal The planned end date is used to determine when the document becomes effective. This is
     *       usually the contract date.  The planned end date is used in reports and report parameters.}
     * 
     */
    public static final String PROPERTY_CONTRACTDATE = "contractDate";

    /**
     * Property endingDate stored in column DateFinish in table C_Project<br>
     * Help: {@literal The real end date is used to indicate when the project is expected to be completed or has
     *       been completed.}
     * 
     */
    public static final String PROPERTY_ENDINGDATE = "endingDate";

    /**
     * Property generateTo stored in column GenerateTo in table C_Project<br>
     * Help: {@literal A button that creates documents}
     * 
     */
    public static final String PROPERTY_GENERATETO = "generateTo";

    /**
     * Property processed stored in column Processed in table C_Project<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table C_Project<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property copyFrom stored in column CopyFrom in table C_Project<br>
     * Help: {@literal Copy lines (products) from another document of the same type.}
     * 
     */
    public static final String PROPERTY_COPYFROM = "copyFrom";

    /**
     * Property projectType stored in column C_ProjectType_ID in table C_Project<br>
     * Help: {@literal Project Type is a template of a common project. Standard phases and tasks can be entered
     *       into this template and then quickly reused on new projects.}
     * 
     */
    public static final String PROPERTY_PROJECTTYPE = "projectType";

    /**
     * Property contractQuantity stored in column CommittedQty in table C_Project<br>
     * Help: {@literal The commitment amount is independent from the planned amount. You would use the planned
     *       amount for your realistic estimation, which might be higher or lower than the commitment amount.}
     * 
     */
    public static final String PROPERTY_CONTRACTQUANTITY = "contractQuantity";

    /**
     * Property invoiceAmount stored in column InvoicedAmt in table C_Project<br>
     * Help: {@literal The amount invoiced}
     * 
     */
    public static final String PROPERTY_INVOICEAMOUNT = "invoiceAmount";

    /**
     * Property invoiceQuantity stored in column InvoicedQty in table C_Project<br>
     * Help: {@literal The Quantity Invoiced}
     * 
     */
    public static final String PROPERTY_INVOICEQUANTITY = "invoiceQuantity";

    /**
     * Property projectBalance stored in column ProjectBalanceAmt in table C_Project<br>
     * Help: {@literal The project balance is the sum of all invoices and payments}
     * 
     */
    public static final String PROPERTY_PROJECTBALANCE = "projectBalance";

    /**
     * Property standardPhase stored in column C_Phase_ID in table C_Project<br>
     * Help: {@literal Phase of the project with standard performance information with standard work}
     * 
     */
    public static final String PROPERTY_STANDARDPHASE = "standardPhase";

    /**
     * Property projectPhase stored in column C_ProjectPhase_ID in table C_Project<br>
     * Help: {@literal Identifies a phase for a particular project.}
     * 
     */
    public static final String PROPERTY_PROJECTPHASE = "projectPhase";

    /**
     * Property priceCeiling stored in column IsCommitCeiling in table C_Project<br>
     * Help: {@literal The commitment amount and quantity is the maximum amount and quantity to be charged. 
     *       Ignored, if the amount or quantity is zero.}
     * 
     */
    public static final String PROPERTY_PRICECEILING = "priceCeiling";

    /**
     * Property warehouse stored in column M_Warehouse_ID in table C_Project<br>
     * Help: {@literal The Warehouse identifies a unique Warehouse where products are stored or Services are
     *       provided.}
     * 
     */
    public static final String PROPERTY_WAREHOUSE = "warehouse";

    /**
     * Property projectCategory stored in column ProjectCategory in table C_Project<br>
     * Help: {@literal The Project Category determines the behavior of the project:General - no special
     *       accounting, e.g. for Presales or general trackingService - no special accounting, e.g. for
     *       Service/Charge projectsWork Order - creates Project/Job WIP transactions - abili}
     * 
     */
    public static final String PROPERTY_PROJECTCATEGORY = "projectCategory";

    /**
     * Property processNow stored in column Processing in table C_Project<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property initiativeType stored in column Publicprivate in table C_Project<br>
     * Help: {@literal A public o private enterprise. This are the most tipical intiatives}
     * 
     */
    public static final String PROPERTY_INITIATIVETYPE = "initiativeType";

    /**
     * Property projectStatus stored in column Projectstatus in table C_Project<br>
     * Help: {@literal Indicates the current status of the project. There are normally three:
     *       Open: The budget is
     *       sent. The project has not been won yet.
     *       Order: The project has been won by a partner we have sent a
     *       budget.
     *       Order closed: All the products agreed have been delivered.}
     * 
     */
    public static final String PROPERTY_PROJECTSTATUS = "projectStatus";

    /**
     * Property workType stored in column Projectkind in table C_Project<br>
     * Help: {@literal Indicates the kind of work}
     * 
     */
    public static final String PROPERTY_WORKTYPE = "workType";

    /**
     * Property invoiceAddress stored in column BillTo_ID in table C_Project<br>
     * Help: {@literal An indication of the address to use in the invoice.<br />}
     * 
     */
    public static final String PROPERTY_INVOICEADDRESS = "invoiceAddress";

    /**
     * Property phase stored in column Projectphase in table C_Project<br>
     * Help: {@literal Different phases for a project}
     * 
     */
    public static final String PROPERTY_PHASE = "phase";

    /**
     * Property generateOrder stored in column GenerateOrder in table C_Project<br>
     * Help: {@literal <P>This process lets you to generate a purchase order to this project.</P>}
     * 
     */
    public static final String PROPERTY_GENERATEORDER = "generateOrder";

    /**
     * Property changeProjectStatus stored in column ChangeProjectStatus in table C_Project<br>
     * Help: {@literal This process changes the status of this projecto.}
     * 
     */
    public static final String PROPERTY_CHANGEPROJECTSTATUS = "changeProjectStatus";

    /**
     * Property locationAddress stored in column C_Location_ID in table C_Project<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_LOCATIONADDRESS = "locationAddress";

    /**
     * Property priceList stored in column M_PriceList_ID in table C_Project<br>
     * Help: {@literal 
     *       Price Lists are used to determine the pricing, margin and cost of items purchased or
     *       sold.}
     * 
     */
    public static final String PROPERTY_PRICELIST = "priceList";

    /**
     * Property formOfPayment stored in column PaymentRule in table C_Project<br>
     * Help: {@literal Form of Payment indicates the method of payment used for this transaction (eg. cash, wire
     *       transfer, etc.)}
     * 
     */
    public static final String PROPERTY_FORMOFPAYMENT = "formOfPayment";

    /**
     * Property invoiceToProject stored in column Invoice_ToProject in table C_Project<br>
     * Help: {@literal This option indicates if the invoices has been sent to the winner are "Origen invoices"}
     * 
     */
    public static final String PROPERTY_INVOICETOPROJECT = "invoiceToProject";

    /**
     * Property plannedPoAmount stored in column PlannedPOAmt in table C_Project<br>
     * Help: {@literal Planned amount for the purchase order}
     * 
     */
    public static final String PROPERTY_PLANNEDPOAMOUNT = "plannedPoAmount";

    /**
     * Property lastPlannedProposalDate stored in column LastPlannedProposalDate in table C_Project<br>
     * Help: {@literal Last day of following up the budget for the project}
     * 
     */
    public static final String PROPERTY_LASTPLANNEDPROPOSALDATE = "lastPlannedProposalDate";

    /**
     * Property numberOfCopies stored in column Document_Copies in table C_Project<br>
     * Help: {@literal Number of copies}
     * 
     */
    public static final String PROPERTY_NUMBEROFCOPIES = "numberOfCopies";

    /**
     * Property accountNo stored in column AccountNo in table C_Project<br>
     * Help: {@literal The Account Number indicates the Number assigned to this account}
     * 
     */
    public static final String PROPERTY_ACCOUNTNO = "accountNo";

    /**
     * Property plannedExpenses stored in column Expexpenses in table C_Project<br>
     * Help: {@literal Expected expenses related to this project. Real number will originate from lines of the
     *       expense sheets, marked with Time Sheet=N.}
     * 
     */
    public static final String PROPERTY_PLANNEDEXPENSES = "plannedExpenses";

    /**
     * Property expensesMargin stored in column Expmargin in table C_Project<br>
     * Help: {@literal Expected margin for expenses.}
     * 
     */
    public static final String PROPERTY_EXPENSESMARGIN = "expensesMargin";

    /**
     * Property reinvoicedExpenses stored in column Expreinvoicing in table C_Project<br>
     * Help: {@literal Amount of expenses we plan to invoice back to the client. Real number will originate from
     *       sales invoices for this particular client and project that include products of type "expense" (such
     *       as telephone, electricity, etc)}
     * 
     */
    public static final String PROPERTY_REINVOICEDEXPENSES = "reinvoicedExpenses";

    /**
     * Property personInCharge stored in column Responsible_ID in table C_Project<br>
     * Help: {@literal An employee that is responsible for the project.}
     * 
     */
    public static final String PROPERTY_PERSONINCHARGE = "personInCharge";

    /**
     * Property serviceCost stored in column Servcost in table C_Project<br>
     * Help: {@literal Expected total cost of services provided. The real number will originate from all expense
     *       sheets (lines marked as Time Sheet) related to this project.}
     * 
     */
    public static final String PROPERTY_SERVICECOST = "serviceCost";

    /**
     * Property serviceMargin stored in column Servmargin in table C_Project<br>
     * Help: {@literal Expected service margin. Real number will be calculated from actual service revenue and
     *       costs.}
     * 
     */
    public static final String PROPERTY_SERVICEMARGIN = "serviceMargin";

    /**
     * Property serviceRevenue stored in column Servrevenue in table C_Project<br>
     * Help: {@literal Expected revenue of services provided to the client. Real numbers will originate from
     *       invoices of services (products of type "service") sent out to the client.}
     * 
     */
    public static final String PROPERTY_SERVICEREVENUE = "serviceRevenue";

    /**
     * Property setProjectType stored in column Setprojecttype in table C_Project<br>
     * Help: {@literal A process that copies the selected project type's (template's) phases and tasks into the
     *       current project.}
     * 
     */
    public static final String PROPERTY_SETPROJECTTYPE = "setProjectType";

    /**
     * Property startingDate stored in column Startdate in table C_Project<br>
     * Help: {@literal A parameter stating when a specified request will begin.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property servicesProvidedCost stored in column Servsercost in table C_Project<br>
     * Help: {@literal Expected cost of services provided. The real number will originate from all expense sheets
     *       (lines marked as Time Sheet) related to this project.}
     * 
     */
    public static final String PROPERTY_SERVICESPROVIDEDCOST = "servicesProvidedCost";

    /**
     * Property outsourcedCost stored in column Servoutcost in table C_Project<br>
     * Help: {@literal Expected cost of services outsourced. The real number will originate from all expense
     *       sheets (lines marked as Time Sheet) related to this project.}
     * 
     */
    public static final String PROPERTY_OUTSOURCEDCOST = "outsourcedCost";

    /**
     * Property paymentMethod stored in column FIN_Paymentmethod_ID in table C_Project
     * 
     */
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";

    /**
     * Property invoiceList stored in table C_Project
     * 
     */
    public static final String PROPERTY_INVOICELIST = "invoiceList";

    /**
     * Property invoiceCandidateVList stored in table C_Project
     * 
     */
    public static final String PROPERTY_INVOICECANDIDATEVLIST = "invoiceCandidateVList";

    /**
     * Property invoiceLineList stored in table C_Project
     * 
     */
    public static final String PROPERTY_INVOICELINELIST = "invoiceLineList";

    /**
     * Property invoiceV2List stored in table C_Project
     * 
     */
    public static final String PROPERTY_INVOICEV2LIST = "invoiceV2List";

    /**
     * Property orderList stored in table C_Project
     * 
     */
    public static final String PROPERTY_ORDERLIST = "orderList";

    /**
     * Property orderLineList stored in table C_Project
     * 
     */
    public static final String PROPERTY_ORDERLINELIST = "orderLineList";

    /**
     * Property projectAccountsList stored in table C_Project
     * 
     */
    public static final String PROPERTY_PROJECTACCOUNTSLIST = "projectAccountsList";

    /**
     * Property projectLineList stored in table C_Project
     * 
     */
    public static final String PROPERTY_PROJECTLINELIST = "projectLineList";

    /**
     * Property projectPhaseList stored in table C_Project
     * 
     */
    public static final String PROPERTY_PROJECTPHASELIST = "projectPhaseList";

    /**
     * Property projectProposalList stored in table C_Project
     * 
     */
    public static final String PROPERTY_PROJECTPROPOSALLIST = "projectProposalList";

    /**
     * Property projectVendorList stored in table C_Project
     * 
     */
    public static final String PROPERTY_PROJECTVENDORLIST = "projectVendorList";


    public Project() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_CREATETEMPORARYPRICELIST, true);
        setDefaultValue(PROPERTY_LEGALLYBINDINGCONTRACT, false);
        setDefaultValue(PROPERTY_GENERATETO, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_COPYFROM, false);
        setDefaultValue(PROPERTY_PRICECEILING, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROJECTSTATUS, "OP");
        setDefaultValue(PROPERTY_GENERATEORDER, false);
        setDefaultValue(PROPERTY_INVOICETOPROJECT, false);
        setDefaultValue(PROPERTY_NUMBEROFCOPIES, (long) 1);
        setDefaultValue(PROPERTY_SETPROJECTTYPE, false);
        setDefaultValue(PROPERTY_INVOICELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICECANDIDATEVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICELINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICEV2LIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTPHASELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTPROPOSALLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROJECTVENDORLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Project#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Project#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Project#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Project#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Project#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Project#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Project#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Project#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Project#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Project#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Project#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Project#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Project#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Project#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Project#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Project#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Project#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Project#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Project#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Project#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Project#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Project#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Project#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see Project#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see Project#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see Project#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see Project#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see Project#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see Project#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Project#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Project#PROPERTY_PARTNERADDRESS
     * 
     */
    public Location getPartnerAddress() {
        return (Location) get(PROPERTY_PARTNERADDRESS);
    }
    /**
     * @see Project#PROPERTY_PARTNERADDRESS
     * 
     */
    public void setPartnerAddress(Location partnerAddress) {
        set(PROPERTY_PARTNERADDRESS, partnerAddress);
    }

    /**
     * @see Project#PROPERTY_ORDERREFERENCE
     * 
     */
    public String getOrderReference() {
        return (String) get(PROPERTY_ORDERREFERENCE);
    }
    /**
     * @see Project#PROPERTY_ORDERREFERENCE
     * 
     */
    public void setOrderReference(String orderReference) {
        set(PROPERTY_ORDERREFERENCE, orderReference);
    }

    /**
     * @see Project#PROPERTY_PAYMENTTERMS
     * 
     */
    public PaymentTerm getPaymentTerms() {
        return (PaymentTerm) get(PROPERTY_PAYMENTTERMS);
    }
    /**
     * @see Project#PROPERTY_PAYMENTTERMS
     * 
     */
    public void setPaymentTerms(PaymentTerm paymentTerms) {
        set(PROPERTY_PAYMENTTERMS, paymentTerms);
    }

    /**
     * @see Project#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Project#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Project#PROPERTY_CREATETEMPORARYPRICELIST
     * 
     */
    public Boolean isCreateTemporaryPriceList() {
        return (Boolean) get(PROPERTY_CREATETEMPORARYPRICELIST);
    }
    /**
     * @see Project#PROPERTY_CREATETEMPORARYPRICELIST
     * 
     */
    public void setCreateTemporaryPriceList(Boolean createTemporaryPriceList) {
        set(PROPERTY_CREATETEMPORARYPRICELIST, createTemporaryPriceList);
    }

    /**
     * @see Project#PROPERTY_PRICELISTVERSION
     * 
     */
    public PriceListVersion getPriceListVersion() {
        return (PriceListVersion) get(PROPERTY_PRICELISTVERSION);
    }
    /**
     * @see Project#PROPERTY_PRICELISTVERSION
     * 
     */
    public void setPriceListVersion(PriceListVersion priceListVersion) {
        set(PROPERTY_PRICELISTVERSION, priceListVersion);
    }

    /**
     * @see Project#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see Project#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see Project#PROPERTY_LEGALLYBINDINGCONTRACT
     * 
     */
    public Boolean isLegallyBindingContract() {
        return (Boolean) get(PROPERTY_LEGALLYBINDINGCONTRACT);
    }
    /**
     * @see Project#PROPERTY_LEGALLYBINDINGCONTRACT
     * 
     */
    public void setLegallyBindingContract(Boolean legallyBindingContract) {
        set(PROPERTY_LEGALLYBINDINGCONTRACT, legallyBindingContract);
    }

    /**
     * @see Project#PROPERTY_PLANNEDAMOUNT
     * 
     */
    public BigDecimal getPlannedAmount() {
        return (BigDecimal) get(PROPERTY_PLANNEDAMOUNT);
    }
    /**
     * @see Project#PROPERTY_PLANNEDAMOUNT
     * 
     */
    public void setPlannedAmount(BigDecimal plannedAmount) {
        set(PROPERTY_PLANNEDAMOUNT, plannedAmount);
    }

    /**
     * @see Project#PROPERTY_PLANNEDQUANTITY
     * 
     */
    public BigDecimal getPlannedQuantity() {
        return (BigDecimal) get(PROPERTY_PLANNEDQUANTITY);
    }
    /**
     * @see Project#PROPERTY_PLANNEDQUANTITY
     * 
     */
    public void setPlannedQuantity(BigDecimal plannedQuantity) {
        set(PROPERTY_PLANNEDQUANTITY, plannedQuantity);
    }

    /**
     * @see Project#PROPERTY_PLANNEDMARGIN
     * 
     */
    public BigDecimal getPlannedMargin() {
        return (BigDecimal) get(PROPERTY_PLANNEDMARGIN);
    }
    /**
     * @see Project#PROPERTY_PLANNEDMARGIN
     * 
     */
    public void setPlannedMargin(BigDecimal plannedMargin) {
        set(PROPERTY_PLANNEDMARGIN, plannedMargin);
    }

    /**
     * @see Project#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public BigDecimal getContractAmount() {
        return (BigDecimal) get(PROPERTY_CONTRACTAMOUNT);
    }
    /**
     * @see Project#PROPERTY_CONTRACTAMOUNT
     * 
     */
    public void setContractAmount(BigDecimal contractAmount) {
        set(PROPERTY_CONTRACTAMOUNT, contractAmount);
    }

    /**
     * @see Project#PROPERTY_CONTRACTDATE
     * 
     */
    public Date getContractDate() {
        return (Date) get(PROPERTY_CONTRACTDATE);
    }
    /**
     * @see Project#PROPERTY_CONTRACTDATE
     * 
     */
    public void setContractDate(Date contractDate) {
        set(PROPERTY_CONTRACTDATE, contractDate);
    }

    /**
     * @see Project#PROPERTY_ENDINGDATE
     * 
     */
    public Date getEndingDate() {
        return (Date) get(PROPERTY_ENDINGDATE);
    }
    /**
     * @see Project#PROPERTY_ENDINGDATE
     * 
     */
    public void setEndingDate(Date endingDate) {
        set(PROPERTY_ENDINGDATE, endingDate);
    }

    /**
     * @see Project#PROPERTY_GENERATETO
     * 
     */
    public Boolean isGenerateTo() {
        return (Boolean) get(PROPERTY_GENERATETO);
    }
    /**
     * @see Project#PROPERTY_GENERATETO
     * 
     */
    public void setGenerateTo(Boolean generateTo) {
        set(PROPERTY_GENERATETO, generateTo);
    }

    /**
     * @see Project#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see Project#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see Project#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see Project#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see Project#PROPERTY_COPYFROM
     * 
     */
    public Boolean isCopyFrom() {
        return (Boolean) get(PROPERTY_COPYFROM);
    }
    /**
     * @see Project#PROPERTY_COPYFROM
     * 
     */
    public void setCopyFrom(Boolean copyFrom) {
        set(PROPERTY_COPYFROM, copyFrom);
    }

    /**
     * @see Project#PROPERTY_PROJECTTYPE
     * 
     */
    public ProjectType getProjectType() {
        return (ProjectType) get(PROPERTY_PROJECTTYPE);
    }
    /**
     * @see Project#PROPERTY_PROJECTTYPE
     * 
     */
    public void setProjectType(ProjectType projectType) {
        set(PROPERTY_PROJECTTYPE, projectType);
    }

    /**
     * @see Project#PROPERTY_CONTRACTQUANTITY
     * 
     */
    public BigDecimal getContractQuantity() {
        return (BigDecimal) get(PROPERTY_CONTRACTQUANTITY);
    }
    /**
     * @see Project#PROPERTY_CONTRACTQUANTITY
     * 
     */
    public void setContractQuantity(BigDecimal contractQuantity) {
        set(PROPERTY_CONTRACTQUANTITY, contractQuantity);
    }

    /**
     * @see Project#PROPERTY_INVOICEAMOUNT
     * 
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) get(PROPERTY_INVOICEAMOUNT);
    }
    /**
     * @see Project#PROPERTY_INVOICEAMOUNT
     * 
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        set(PROPERTY_INVOICEAMOUNT, invoiceAmount);
    }

    /**
     * @see Project#PROPERTY_INVOICEQUANTITY
     * 
     */
    public BigDecimal getInvoiceQuantity() {
        return (BigDecimal) get(PROPERTY_INVOICEQUANTITY);
    }
    /**
     * @see Project#PROPERTY_INVOICEQUANTITY
     * 
     */
    public void setInvoiceQuantity(BigDecimal invoiceQuantity) {
        set(PROPERTY_INVOICEQUANTITY, invoiceQuantity);
    }

    /**
     * @see Project#PROPERTY_PROJECTBALANCE
     * 
     */
    public BigDecimal getProjectBalance() {
        return (BigDecimal) get(PROPERTY_PROJECTBALANCE);
    }
    /**
     * @see Project#PROPERTY_PROJECTBALANCE
     * 
     */
    public void setProjectBalance(BigDecimal projectBalance) {
        set(PROPERTY_PROJECTBALANCE, projectBalance);
    }

    /**
     * @see Project#PROPERTY_STANDARDPHASE
     * 
     */
    public StandardPhase getStandardPhase() {
        return (StandardPhase) get(PROPERTY_STANDARDPHASE);
    }
    /**
     * @see Project#PROPERTY_STANDARDPHASE
     * 
     */
    public void setStandardPhase(StandardPhase standardPhase) {
        set(PROPERTY_STANDARDPHASE, standardPhase);
    }

    /**
     * @see Project#PROPERTY_PROJECTPHASE
     * 
     */
    public ProjectPhase getProjectPhase() {
        return (ProjectPhase) get(PROPERTY_PROJECTPHASE);
    }
    /**
     * @see Project#PROPERTY_PROJECTPHASE
     * 
     */
    public void setProjectPhase(ProjectPhase projectPhase) {
        set(PROPERTY_PROJECTPHASE, projectPhase);
    }

    /**
     * @see Project#PROPERTY_PRICECEILING
     * 
     */
    public Boolean isPriceCeiling() {
        return (Boolean) get(PROPERTY_PRICECEILING);
    }
    /**
     * @see Project#PROPERTY_PRICECEILING
     * 
     */
    public void setPriceCeiling(Boolean priceCeiling) {
        set(PROPERTY_PRICECEILING, priceCeiling);
    }

    /**
     * @see Project#PROPERTY_WAREHOUSE
     * 
     */
    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }
    /**
     * @see Project#PROPERTY_WAREHOUSE
     * 
     */
    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    /**
     * @see Project#PROPERTY_PROJECTCATEGORY
     * 
     */
    public String getProjectCategory() {
        return (String) get(PROPERTY_PROJECTCATEGORY);
    }
    /**
     * @see Project#PROPERTY_PROJECTCATEGORY
     * 
     */
    public void setProjectCategory(String projectCategory) {
        set(PROPERTY_PROJECTCATEGORY, projectCategory);
    }

    /**
     * @see Project#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Project#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Project#PROPERTY_INITIATIVETYPE
     * 
     */
    public String getInitiativeType() {
        return (String) get(PROPERTY_INITIATIVETYPE);
    }
    /**
     * @see Project#PROPERTY_INITIATIVETYPE
     * 
     */
    public void setInitiativeType(String initiativeType) {
        set(PROPERTY_INITIATIVETYPE, initiativeType);
    }

    /**
     * @see Project#PROPERTY_PROJECTSTATUS
     * 
     */
    public String getProjectStatus() {
        return (String) get(PROPERTY_PROJECTSTATUS);
    }
    /**
     * @see Project#PROPERTY_PROJECTSTATUS
     * 
     */
    public void setProjectStatus(String projectStatus) {
        set(PROPERTY_PROJECTSTATUS, projectStatus);
    }

    /**
     * @see Project#PROPERTY_WORKTYPE
     * 
     */
    public String getWorkType() {
        return (String) get(PROPERTY_WORKTYPE);
    }
    /**
     * @see Project#PROPERTY_WORKTYPE
     * 
     */
    public void setWorkType(String workType) {
        set(PROPERTY_WORKTYPE, workType);
    }

    /**
     * @see Project#PROPERTY_INVOICEADDRESS
     * 
     */
    public Location getInvoiceAddress() {
        return (Location) get(PROPERTY_INVOICEADDRESS);
    }
    /**
     * @see Project#PROPERTY_INVOICEADDRESS
     * 
     */
    public void setInvoiceAddress(Location invoiceAddress) {
        set(PROPERTY_INVOICEADDRESS, invoiceAddress);
    }

    /**
     * @see Project#PROPERTY_PHASE
     * 
     */
    public String getPhase() {
        return (String) get(PROPERTY_PHASE);
    }
    /**
     * @see Project#PROPERTY_PHASE
     * 
     */
    public void setPhase(String phase) {
        set(PROPERTY_PHASE, phase);
    }

    /**
     * @see Project#PROPERTY_GENERATEORDER
     * 
     */
    public Boolean isGenerateOrder() {
        return (Boolean) get(PROPERTY_GENERATEORDER);
    }
    /**
     * @see Project#PROPERTY_GENERATEORDER
     * 
     */
    public void setGenerateOrder(Boolean generateOrder) {
        set(PROPERTY_GENERATEORDER, generateOrder);
    }

    /**
     * @see Project#PROPERTY_CHANGEPROJECTSTATUS
     * 
     */
    public String getChangeProjectStatus() {
        return (String) get(PROPERTY_CHANGEPROJECTSTATUS);
    }
    /**
     * @see Project#PROPERTY_CHANGEPROJECTSTATUS
     * 
     */
    public void setChangeProjectStatus(String changeProjectStatus) {
        set(PROPERTY_CHANGEPROJECTSTATUS, changeProjectStatus);
    }

    /**
     * @see Project#PROPERTY_LOCATIONADDRESS
     * 
     */
    public org.openbravo.model.common.geography.Location getLocationAddress() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_LOCATIONADDRESS);
    }
    /**
     * @see Project#PROPERTY_LOCATIONADDRESS
     * 
     */
    public void setLocationAddress(org.openbravo.model.common.geography.Location locationAddress) {
        set(PROPERTY_LOCATIONADDRESS, locationAddress);
    }

    /**
     * @see Project#PROPERTY_PRICELIST
     * 
     */
    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }
    /**
     * @see Project#PROPERTY_PRICELIST
     * 
     */
    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    /**
     * @see Project#PROPERTY_FORMOFPAYMENT
     * 
     */
    public String getFormOfPayment() {
        return (String) get(PROPERTY_FORMOFPAYMENT);
    }
    /**
     * @see Project#PROPERTY_FORMOFPAYMENT
     * 
     */
    public void setFormOfPayment(String formOfPayment) {
        set(PROPERTY_FORMOFPAYMENT, formOfPayment);
    }

    /**
     * @see Project#PROPERTY_INVOICETOPROJECT
     * 
     */
    public Boolean isInvoiceToProject() {
        return (Boolean) get(PROPERTY_INVOICETOPROJECT);
    }
    /**
     * @see Project#PROPERTY_INVOICETOPROJECT
     * 
     */
    public void setInvoiceToProject(Boolean invoiceToProject) {
        set(PROPERTY_INVOICETOPROJECT, invoiceToProject);
    }

    /**
     * @see Project#PROPERTY_PLANNEDPOAMOUNT
     * 
     */
    public BigDecimal getPlannedPoAmount() {
        return (BigDecimal) get(PROPERTY_PLANNEDPOAMOUNT);
    }
    /**
     * @see Project#PROPERTY_PLANNEDPOAMOUNT
     * 
     */
    public void setPlannedPoAmount(BigDecimal plannedPoAmount) {
        set(PROPERTY_PLANNEDPOAMOUNT, plannedPoAmount);
    }

    /**
     * @see Project#PROPERTY_LASTPLANNEDPROPOSALDATE
     * 
     */
    public Date getLastPlannedProposalDate() {
        return (Date) get(PROPERTY_LASTPLANNEDPROPOSALDATE);
    }
    /**
     * @see Project#PROPERTY_LASTPLANNEDPROPOSALDATE
     * 
     */
    public void setLastPlannedProposalDate(Date lastPlannedProposalDate) {
        set(PROPERTY_LASTPLANNEDPROPOSALDATE, lastPlannedProposalDate);
    }

    /**
     * @see Project#PROPERTY_NUMBEROFCOPIES
     * 
     */
    public Long getNumberOfCopies() {
        return (Long) get(PROPERTY_NUMBEROFCOPIES);
    }
    /**
     * @see Project#PROPERTY_NUMBEROFCOPIES
     * 
     */
    public void setNumberOfCopies(Long numberOfCopies) {
        set(PROPERTY_NUMBEROFCOPIES, numberOfCopies);
    }

    /**
     * @see Project#PROPERTY_ACCOUNTNO
     * 
     */
    public String getAccountNo() {
        return (String) get(PROPERTY_ACCOUNTNO);
    }
    /**
     * @see Project#PROPERTY_ACCOUNTNO
     * 
     */
    public void setAccountNo(String accountNo) {
        set(PROPERTY_ACCOUNTNO, accountNo);
    }

    /**
     * @see Project#PROPERTY_PLANNEDEXPENSES
     * 
     */
    public BigDecimal getPlannedExpenses() {
        return (BigDecimal) get(PROPERTY_PLANNEDEXPENSES);
    }
    /**
     * @see Project#PROPERTY_PLANNEDEXPENSES
     * 
     */
    public void setPlannedExpenses(BigDecimal plannedExpenses) {
        set(PROPERTY_PLANNEDEXPENSES, plannedExpenses);
    }

    /**
     * @see Project#PROPERTY_EXPENSESMARGIN
     * 
     */
    public BigDecimal getExpensesMargin() {
        return (BigDecimal) get(PROPERTY_EXPENSESMARGIN);
    }
    /**
     * @see Project#PROPERTY_EXPENSESMARGIN
     * 
     */
    public void setExpensesMargin(BigDecimal expensesMargin) {
        set(PROPERTY_EXPENSESMARGIN, expensesMargin);
    }

    /**
     * @see Project#PROPERTY_REINVOICEDEXPENSES
     * 
     */
    public BigDecimal getReinvoicedExpenses() {
        return (BigDecimal) get(PROPERTY_REINVOICEDEXPENSES);
    }
    /**
     * @see Project#PROPERTY_REINVOICEDEXPENSES
     * 
     */
    public void setReinvoicedExpenses(BigDecimal reinvoicedExpenses) {
        set(PROPERTY_REINVOICEDEXPENSES, reinvoicedExpenses);
    }

    /**
     * @see Project#PROPERTY_PERSONINCHARGE
     * 
     */
    public BusinessPartner getPersonInCharge() {
        return (BusinessPartner) get(PROPERTY_PERSONINCHARGE);
    }
    /**
     * @see Project#PROPERTY_PERSONINCHARGE
     * 
     */
    public void setPersonInCharge(BusinessPartner personInCharge) {
        set(PROPERTY_PERSONINCHARGE, personInCharge);
    }

    /**
     * @see Project#PROPERTY_SERVICECOST
     * 
     */
    public BigDecimal getServiceCost() {
        return (BigDecimal) get(PROPERTY_SERVICECOST);
    }
    /**
     * @see Project#PROPERTY_SERVICECOST
     * 
     */
    public void setServiceCost(BigDecimal serviceCost) {
        set(PROPERTY_SERVICECOST, serviceCost);
    }

    /**
     * @see Project#PROPERTY_SERVICEMARGIN
     * 
     */
    public BigDecimal getServiceMargin() {
        return (BigDecimal) get(PROPERTY_SERVICEMARGIN);
    }
    /**
     * @see Project#PROPERTY_SERVICEMARGIN
     * 
     */
    public void setServiceMargin(BigDecimal serviceMargin) {
        set(PROPERTY_SERVICEMARGIN, serviceMargin);
    }

    /**
     * @see Project#PROPERTY_SERVICEREVENUE
     * 
     */
    public BigDecimal getServiceRevenue() {
        return (BigDecimal) get(PROPERTY_SERVICEREVENUE);
    }
    /**
     * @see Project#PROPERTY_SERVICEREVENUE
     * 
     */
    public void setServiceRevenue(BigDecimal serviceRevenue) {
        set(PROPERTY_SERVICEREVENUE, serviceRevenue);
    }

    /**
     * @see Project#PROPERTY_SETPROJECTTYPE
     * 
     */
    public Boolean isSetProjectType() {
        return (Boolean) get(PROPERTY_SETPROJECTTYPE);
    }
    /**
     * @see Project#PROPERTY_SETPROJECTTYPE
     * 
     */
    public void setSetProjectType(Boolean setProjectType) {
        set(PROPERTY_SETPROJECTTYPE, setProjectType);
    }

    /**
     * @see Project#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see Project#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see Project#PROPERTY_SERVICESPROVIDEDCOST
     * 
     */
    public BigDecimal getServicesProvidedCost() {
        return (BigDecimal) get(PROPERTY_SERVICESPROVIDEDCOST);
    }
    /**
     * @see Project#PROPERTY_SERVICESPROVIDEDCOST
     * 
     */
    public void setServicesProvidedCost(BigDecimal servicesProvidedCost) {
        set(PROPERTY_SERVICESPROVIDEDCOST, servicesProvidedCost);
    }

    /**
     * @see Project#PROPERTY_OUTSOURCEDCOST
     * 
     */
    public BigDecimal getOutsourcedCost() {
        return (BigDecimal) get(PROPERTY_OUTSOURCEDCOST);
    }
    /**
     * @see Project#PROPERTY_OUTSOURCEDCOST
     * 
     */
    public void setOutsourcedCost(BigDecimal outsourcedCost) {
        set(PROPERTY_OUTSOURCEDCOST, outsourcedCost);
    }

    /**
     * @see Project#PROPERTY_PAYMENTMETHOD
     * 
     */
    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }
    /**
     * @see Project#PROPERTY_PAYMENTMETHOD
     * 
     */
    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    /**
     * Help: {@literal Contains all the invoices}<br>
     * @see Invoice
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Invoice> getInvoiceList() {
      return (List<Invoice>) get(PROPERTY_INVOICELIST);
    }

    /**
     * Help: {@literal Contains all the invoices}<br>
     * @see Invoice
     * 
     */
    public void setInvoiceList(List<Invoice> invoiceList) {
        set(PROPERTY_INVOICELIST, invoiceList);
    }

    /**
     * @see InvoiceCandidateV
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceCandidateV> getInvoiceCandidateVList() {
      return (List<InvoiceCandidateV>) get(PROPERTY_INVOICECANDIDATEVLIST);
    }

    /**
     * @see InvoiceCandidateV
     * 
     */
    public void setInvoiceCandidateVList(List<InvoiceCandidateV> invoiceCandidateVList) {
        set(PROPERTY_INVOICECANDIDATEVLIST, invoiceCandidateVList);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceLine> getInvoiceLineList() {
      return (List<InvoiceLine>) get(PROPERTY_INVOICELINELIST);
    }

    /**
     * Help: {@literal Contains the  individual items or charges on an Invoice}<br>
     * @see InvoiceLine
     * 
     */
    public void setInvoiceLineList(List<InvoiceLine> invoiceLineList) {
        set(PROPERTY_INVOICELINELIST, invoiceLineList);
    }

    /**
     * @see InvoiceV2
     * 
     */
    @SuppressWarnings("unchecked")
    public List<InvoiceV2> getInvoiceV2List() {
      return (List<InvoiceV2>) get(PROPERTY_INVOICEV2LIST);
    }

    /**
     * @see InvoiceV2
     * 
     */
    public void setInvoiceV2List(List<InvoiceV2> invoiceV2List) {
        set(PROPERTY_INVOICEV2LIST, invoiceV2List);
    }

    /**
     * Help: {@literal Table where there are all the orders. The purchase orders and the sales orders.}<br>
     * @see Order
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Order> getOrderList() {
      return (List<Order>) get(PROPERTY_ORDERLIST);
    }

    /**
     * Help: {@literal Table where there are all the orders. The purchase orders and the sales orders.}<br>
     * @see Order
     * 
     */
    public void setOrderList(List<Order> orderList) {
        set(PROPERTY_ORDERLIST, orderList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineList(List<OrderLine> orderLineList) {
        set(PROPERTY_ORDERLINELIST, orderLineList);
    }

    /**
     * Help: {@literal The Accounting Tab is used to define the Asset Account to use when a project is completed
     *       and the associated asset realized.
     *       The Accounting Tab is used to define the Asset Account to use
     *       when a project is completed and the associated asset realized.}<br>
     * @see ProjectAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectAccounts> getProjectAccountsList() {
      return (List<ProjectAccounts>) get(PROPERTY_PROJECTACCOUNTSLIST);
    }

    /**
     * Help: {@literal The Accounting Tab is used to define the Asset Account to use when a project is completed
     *       and the associated asset realized.
     *       The Accounting Tab is used to define the Asset Account to use
     *       when a project is completed and the associated asset realized.}<br>
     * @see ProjectAccounts
     * 
     */
    public void setProjectAccountsList(List<ProjectAccounts> projectAccountsList) {
        set(PROPERTY_PROJECTACCOUNTSLIST, projectAccountsList);
    }

    /**
     * Help: {@literal Contains the lines (products and/or services) associated with the Project}<br>
     * @see ProjectLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectLine> getProjectLineList() {
      return (List<ProjectLine>) get(PROPERTY_PROJECTLINELIST);
    }

    /**
     * Help: {@literal Contains the lines (products and/or services) associated with the Project}<br>
     * @see ProjectLine
     * 
     */
    public void setProjectLineList(List<ProjectLine> projectLineList) {
        set(PROPERTY_PROJECTLINELIST, projectLineList);
    }

    /**
     * Help: {@literal Actual Phase of the Project with Status information - generated from Phase of Project
     *       Type.}<br>
     * @see ProjectPhase
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectPhase> getProjectPhaseList() {
      return (List<ProjectPhase>) get(PROPERTY_PROJECTPHASELIST);
    }

    /**
     * Help: {@literal Actual Phase of the Project with Status information - generated from Phase of Project
     *       Type.}<br>
     * @see ProjectPhase
     * 
     */
    public void setProjectPhaseList(List<ProjectPhase> projectPhaseList) {
        set(PROPERTY_PROJECTPHASELIST, projectPhaseList);
    }

    /**
     * Help: {@literal Contains the budgets assigned to business partners and a project}<br>
     * @see ProjectProposal
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectProposal> getProjectProposalList() {
      return (List<ProjectProposal>) get(PROPERTY_PROJECTPROPOSALLIST);
    }

    /**
     * Help: {@literal Contains the budgets assigned to business partners and a project}<br>
     * @see ProjectProposal
     * 
     */
    public void setProjectProposalList(List<ProjectProposal> projectProposalList) {
        set(PROPERTY_PROJECTPROPOSALLIST, projectProposalList);
    }

    /**
     * Help: {@literal Contains all the vendors which have participated in the budgeting of a certain project.}<br>
     * @see ProjectVendor
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProjectVendor> getProjectVendorList() {
      return (List<ProjectVendor>) get(PROPERTY_PROJECTVENDORLIST);
    }

    /**
     * Help: {@literal Contains all the vendors which have participated in the budgeting of a certain project.}<br>
     * @see ProjectVendor
     * 
     */
    public void setProjectVendorList(List<ProjectVendor> projectVendorList) {
        set(PROPERTY_PROJECTVENDORLIST, projectVendorList);
    }

}
