
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

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.marketing.Campaign;
import org.openbravo.model.materialmgmt.cost.ABCActivity;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FIN_Doubtful_Debt (stored in table FIN_Doubtful_Debt).
 * <br>
 * Help: {@literal The reasons for potential non payment can include disputes over supply, delivery, at the
     *       conditioner of item or the appearance of financial stress within a customer's operations. When such
     *       a dispute occurs it is prudent to add this debt or portion thereof to the doubtful debt reserve.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DoubtfulDebt extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Doubtful_Debt";
    public static final String ENTITY_NAME = "FIN_Doubtful_Debt";

    /**
     * Property id stored in column FIN_Doubtful_Debt_ID in table FIN_Doubtful_Debt
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Doubtful_Debt 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Doubtful_Debt 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Doubtful_Debt 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Doubtful_Debt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Doubtful_Debt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Doubtful_Debt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Doubtful_Debt 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentType stored in column C_Doctype_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property documentNo stored in column DocumentNo in table FIN_Doubtful_Debt 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property currency stored in column C_Currency_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property fINPaymentSchedule stored in column FIN_Payment_Schedule_ID in table FIN_Doubtful_Debt
     * 
     */
    public static final String PROPERTY_FINPAYMENTSCHEDULE = "fINPaymentSchedule";

    /**
     * Property description stored in column Description in table FIN_Doubtful_Debt<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property amount stored in column Amount in table FIN_Doubtful_Debt 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property posted stored in column Posted in table FIN_Doubtful_Debt<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property processNow stored in column Processing in table FIN_Doubtful_Debt<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table FIN_Doubtful_Debt<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property fINDoubtfulDebtRun stored in column FIN_Doubtful_Debt_Run_ID in table FIN_Doubtful_Debt
     * 
     */
    public static final String PROPERTY_FINDOUBTFULDEBTRUN = "fINDoubtfulDebtRun";

    /**
     * Property product stored in column M_Product_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property activity stored in column C_Activity_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal Activities indicate tasks that are performed and used to utilize Activity based Costing}
     * 
     */
    public static final String PROPERTY_ACTIVITY = "activity";

    /**
     * Property salesCampaign stored in column C_Campaign_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal The Campaign defines a unique marketing program.  Projects can be associated with a pre
     *       defined Marketing Campaign.  You can then report based on a specific Campaign.}
     * 
     */
    public static final String PROPERTY_SALESCAMPAIGN = "salesCampaign";

    /**
     * Property project stored in column C_Project_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property costCenter stored in column C_Costcenter_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costCenter";

    /**
     * Property stDimension stored in column User1_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";

    /**
     * Property aPRMProcess stored in column EM_APRM_Process in table FIN_Doubtful_Debt
     * 
     */
    public static final String PROPERTY_APRMPROCESS = "aPRMProcess";

    /**
     * Property accountingDate stored in column DateAcct in table FIN_Doubtful_Debt<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property asset stored in column A_Asset_ID in table FIN_Doubtful_Debt<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";


    /**
     * Property _computedColumns stored in column _computedColumns in table FIN_Doubtful_Debt
     * 
     */
    public static final String PROPERTY__COMPUTEDCOLUMNS = "_computedColumns";



    /**
     * Computed columns properties, these properties cannot be directly accessed, they need
     * to be read through _computedColumns proxy. They cannot be directly used in HQL, OBQuery
     * nor OBCriteria.
     */

    /**
     * Computed column for property outstandingDoubtfulDebtAmount<br>
     * 
     * Help: {@literal Doubtful Debt Amount which remains pending}<br>
     * Computed from: <br>
     * {@code SELECT coalesce(sum(psd.doubtfuldebt_amount),0) FROM fin_payment_scheduledetail psd left join
       fin_payment_detail pd on psd.fin_payment_detail_id = pd.fin_payment_detail_id left join fin_payment
       p on pd.fin_payment_id = p.fin_payment_id WHERE psd.fin_payment_schedule_invoice =
       fin_payment_schedule_id and psd.isinvoicepaid = 'N'}
     */
    public static final String COMPUTED_COLUMN_OUTSTANDINGDOUBTFULDEBTAMOUNT = "outstandingDoubtfulDebtAmount";

    public DoubtfulDebt() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_APRMPROCESS, "P");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DoubtfulDebt#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_FINPAYMENTSCHEDULE
     * 
     */
    public FIN_PaymentSchedule getFINPaymentSchedule() {
        return (FIN_PaymentSchedule) get(PROPERTY_FINPAYMENTSCHEDULE);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_FINPAYMENTSCHEDULE
     * 
     */
    public void setFINPaymentSchedule(FIN_PaymentSchedule fINPaymentSchedule) {
        set(PROPERTY_FINPAYMENTSCHEDULE, fINPaymentSchedule);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_FINDOUBTFULDEBTRUN
     * 
     */
    public DoubtfulDebtRun getFINDoubtfulDebtRun() {
        return (DoubtfulDebtRun) get(PROPERTY_FINDOUBTFULDEBTRUN);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_FINDOUBTFULDEBTRUN
     * 
     */
    public void setFINDoubtfulDebtRun(DoubtfulDebtRun fINDoubtfulDebtRun) {
        set(PROPERTY_FINDOUBTFULDEBTRUN, fINDoubtfulDebtRun);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_ACTIVITY
     * 
     */
    public ABCActivity getActivity() {
        return (ABCActivity) get(PROPERTY_ACTIVITY);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_ACTIVITY
     * 
     */
    public void setActivity(ABCActivity activity) {
        set(PROPERTY_ACTIVITY, activity);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_SALESCAMPAIGN
     * 
     */
    public Campaign getSalesCampaign() {
        return (Campaign) get(PROPERTY_SALESCAMPAIGN);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_SALESCAMPAIGN
     * 
     */
    public void setSalesCampaign(Campaign salesCampaign) {
        set(PROPERTY_SALESCAMPAIGN, salesCampaign);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostCenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_COSTCENTER
     * 
     */
    public void setCostCenter(Costcenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_APRMPROCESS
     * 
     */
    public String getAPRMProcess() {
        return (String) get(PROPERTY_APRMPROCESS);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_APRMPROCESS
     * 
     */
    public void setAPRMProcess(String aPRMProcess) {
        set(PROPERTY_APRMPROCESS, aPRMProcess);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see DoubtfulDebt#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see DoubtfulDebt#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see DoubtfulDebt#COMPUTED_COLUMN_OUTSTANDINGDOUBTFULDEBTAMOUNT
     * 
     */
    public BigDecimal getOutstandingDoubtfulDebtAmount() {
        return (BigDecimal) get(COMPUTED_COLUMN_OUTSTANDINGDOUBTFULDEBTAMOUNT);
    }
    /**
     * @see DoubtfulDebt#COMPUTED_COLUMN_OUTSTANDINGDOUBTFULDEBTAMOUNT
     * 
     */
    public void setOutstandingDoubtfulDebtAmount(BigDecimal outstandingDoubtfulDebtAmount) {
        set(COMPUTED_COLUMN_OUTSTANDINGDOUBTFULDEBTAMOUNT, outstandingDoubtfulDebtAmount);
    }

    /**
     * @see DoubtfulDebt#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public DoubtfulDebt_ComputedColumns get_computedColumns() {
        return (DoubtfulDebt_ComputedColumns) get(PROPERTY__COMPUTEDCOLUMNS);
    }
    /**
     * @see DoubtfulDebt#PROPERTY__COMPUTEDCOLUMNS
     * 
     */
    public void set_computedColumns(DoubtfulDebt_ComputedColumns _computedColumns) {
        set(PROPERTY__COMPUTEDCOLUMNS, _computedColumns);
    }


    @Override
    public Object get(String propName) {
      if (COMPUTED_COLUMN_OUTSTANDINGDOUBTFULDEBTAMOUNT.equals(propName)) {
        if (get_computedColumns() == null) {
          return null;
        }
        return get_computedColumns().getOutstandingDoubtfulDebtAmount();
      }

      return super.get(propName);
    }
}
