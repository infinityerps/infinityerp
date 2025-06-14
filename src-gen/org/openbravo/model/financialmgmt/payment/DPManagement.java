
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
package org.openbravo.model.financialmgmt.payment;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FinancialMgmtDPManagement (stored in table C_DP_Management).
 * <br>
 * Help: {@literal Document in which status of a debt/payment can be modified.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DPManagement extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_DP_Management";
    public static final String ENTITY_NAME = "FinancialMgmtDPManagement";

    /**
     * Property id stored in column C_Dp_Management_ID in table C_DP_Management<br>
     * Help: {@literal Debt Payment Management allows to manage the changes of status of a debt/payment.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_DP_Management 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_DP_Management 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_DP_Management 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_DP_Management 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_DP_Management 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_DP_Management 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_DP_Management 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentNo stored in column DocumentNo in table C_DP_Management 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property transactionDate stored in column DateTrx in table C_DP_Management 
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property documentType stored in column C_DocType_ID in table C_DP_Management<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property processNow stored in column Processing in table C_DP_Management<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_DP_Management<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property posted stored in column Posted in table C_DP_Management<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property project stored in column C_Project_ID in table C_DP_Management<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table C_DP_Management<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property activity stored in column C_Activity_ID in table C_DP_Management<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property stDimension stored in column User1_ID in table C_DP_Management<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table C_DP_Management<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property createLinesFrom stored in column CreateFrom in table C_DP_Management<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example, in case of entering a new Goods Shipment, the
     *       user can copy lines (products) from an existing Sales Order or Sales Invoice.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROM = "createLinesFrom";

    /**
     * Property description stored in column Description in table C_DP_Management<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property accountingDate stored in column DateAcct in table C_DP_Management<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property currency stored in column C_Currency_ID in table C_DP_Management<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";


    public DPManagement() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, "N");
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_CREATELINESFROM, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DPManagement#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DPManagement#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DPManagement#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DPManagement#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DPManagement#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DPManagement#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DPManagement#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DPManagement#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DPManagement#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DPManagement#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DPManagement#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DPManagement#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DPManagement#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DPManagement#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DPManagement#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DPManagement#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DPManagement#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see DPManagement#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see DPManagement#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see DPManagement#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see DPManagement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see DPManagement#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see DPManagement#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see DPManagement#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see DPManagement#PROPERTY_PROCESSED
     * 
     */
    public String getProcessed() {
        return (String) get(PROPERTY_PROCESSED);
    }
    /**
     * @see DPManagement#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(String processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see DPManagement#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see DPManagement#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see DPManagement#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see DPManagement#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see DPManagement#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see DPManagement#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see DPManagement#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see DPManagement#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see DPManagement#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see DPManagement#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see DPManagement#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see DPManagement#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see DPManagement#PROPERTY_CREATELINESFROM
     * 
     */
    public Boolean isCreateLinesFrom() {
        return (Boolean) get(PROPERTY_CREATELINESFROM);
    }
    /**
     * @see DPManagement#PROPERTY_CREATELINESFROM
     * 
     */
    public void setCreateLinesFrom(Boolean createLinesFrom) {
        set(PROPERTY_CREATELINESFROM, createLinesFrom);
    }

    /**
     * @see DPManagement#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DPManagement#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DPManagement#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see DPManagement#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see DPManagement#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see DPManagement#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

}
