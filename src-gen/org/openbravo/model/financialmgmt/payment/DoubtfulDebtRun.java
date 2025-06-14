
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
import org.openbravo.model.common.businesspartner.Category;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FIN_Doubtful_Debt_Run (stored in table FIN_Doubtful_Debt_Run).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DoubtfulDebtRun extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Doubtful_Debt_Run";
    public static final String ENTITY_NAME = "FIN_Doubtful_Debt_Run";

    /**
     * Property id stored in column FIN_Doubtful_Debt_Run_ID in table FIN_Doubtful_Debt_Run
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Doubtful_Debt_Run 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Doubtful_Debt_Run 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table FIN_Doubtful_Debt_Run 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table FIN_Doubtful_Debt_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Doubtful_Debt_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Doubtful_Debt_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Doubtful_Debt_Run 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property description stored in column Description in table FIN_Doubtful_Debt_Run<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property rundate stored in column Rundate in table FIN_Doubtful_Debt_Run 
     * 
     */
    public static final String PROPERTY_RUNDATE = "rundate";

    /**
     * Property percentage stored in column Percentage in table FIN_Doubtful_Debt_Run 
     * 
     */
    public static final String PROPERTY_PERCENTAGE = "percentage";

    /**
     * Property daysOverdue stored in column Daysoverdue in table FIN_Doubtful_Debt_Run 
     * 
     */
    public static final String PROPERTY_DAYSOVERDUE = "daysOverdue";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_Doubtful_Debt_Run<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property businessPartnerCategory stored in column C_Bp_Group_ID in table FIN_Doubtful_Debt_Run<br>
     * Help: {@literal A way of grouping business partners together for classification and reporting purposes.
     *       Provides a method of defining certain defaults to be used when opening new business partners.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNERCATEGORY = "businessPartnerCategory";

    /**
     * Property processDebt stored in column Process_Debt in table FIN_Doubtful_Debt_Run
     * 
     */
    public static final String PROPERTY_PROCESSDEBT = "processDebt";

    /**
     * Property processed stored in column Processed in table FIN_Doubtful_Debt_Run<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property doubtfulDebtMethod stored in column FIN_Doubtful_Debt_Method_ID in table FIN_Doubtful_Debt_Run
     * 
     */
    public static final String PROPERTY_DOUBTFULDEBTMETHOD = "doubtfulDebtMethod";

    /**
     * Property aPRMProcess stored in column EM_APRM_Process in table FIN_Doubtful_Debt_Run
     * 
     */
    public static final String PROPERTY_APRMPROCESS = "aPRMProcess";

    /**
     * Property accountingDate stored in column Dateacct in table FIN_Doubtful_Debt_Run<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property fINDoubtfulDebtList stored in table FIN_Doubtful_Debt_Run
     * 
     */
    public static final String PROPERTY_FINDOUBTFULDEBTLIST = "fINDoubtfulDebtList";


    public DoubtfulDebtRun() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PERCENTAGE, (long) 100);
        setDefaultValue(PROPERTY_DAYSOVERDUE, (long) 0);
        setDefaultValue(PROPERTY_PROCESSDEBT, true);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_APRMPROCESS, "P");
        setDefaultValue(PROPERTY_FINDOUBTFULDEBTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_RUNDATE
     * 
     */
    public Date getRundate() {
        return (Date) get(PROPERTY_RUNDATE);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_RUNDATE
     * 
     */
    public void setRundate(Date rundate) {
        set(PROPERTY_RUNDATE, rundate);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_PERCENTAGE
     * 
     */
    public Long getPercentage() {
        return (Long) get(PROPERTY_PERCENTAGE);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_PERCENTAGE
     * 
     */
    public void setPercentage(Long percentage) {
        set(PROPERTY_PERCENTAGE, percentage);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_DAYSOVERDUE
     * 
     */
    public Long getDaysOverdue() {
        return (Long) get(PROPERTY_DAYSOVERDUE);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_DAYSOVERDUE
     * 
     */
    public void setDaysOverdue(Long daysOverdue) {
        set(PROPERTY_DAYSOVERDUE, daysOverdue);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public Category getBusinessPartnerCategory() {
        return (Category) get(PROPERTY_BUSINESSPARTNERCATEGORY);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_BUSINESSPARTNERCATEGORY
     * 
     */
    public void setBusinessPartnerCategory(Category businessPartnerCategory) {
        set(PROPERTY_BUSINESSPARTNERCATEGORY, businessPartnerCategory);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_PROCESSDEBT
     * 
     */
    public Boolean isProcessDebt() {
        return (Boolean) get(PROPERTY_PROCESSDEBT);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_PROCESSDEBT
     * 
     */
    public void setProcessDebt(Boolean processDebt) {
        set(PROPERTY_PROCESSDEBT, processDebt);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_DOUBTFULDEBTMETHOD
     * 
     */
    public DoubtfulDebtMethod getDoubtfulDebtMethod() {
        return (DoubtfulDebtMethod) get(PROPERTY_DOUBTFULDEBTMETHOD);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_DOUBTFULDEBTMETHOD
     * 
     */
    public void setDoubtfulDebtMethod(DoubtfulDebtMethod doubtfulDebtMethod) {
        set(PROPERTY_DOUBTFULDEBTMETHOD, doubtfulDebtMethod);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_APRMPROCESS
     * 
     */
    public String getAPRMProcess() {
        return (String) get(PROPERTY_APRMPROCESS);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_APRMPROCESS
     * 
     */
    public void setAPRMProcess(String aPRMProcess) {
        set(PROPERTY_APRMPROCESS, aPRMProcess);
    }

    /**
     * @see DoubtfulDebtRun#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see DoubtfulDebtRun#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * Help: {@literal The reasons for potential non payment can include disputes over supply, delivery, at the
     *       conditioner of item or the appearance of financial stress within a customer's operations. When such
     *       a dispute occurs it is prudent to add this debt or portion thereof to the doubtful debt reserve.}<br>
     * @see DoubtfulDebt
     * 
     */
    @SuppressWarnings("unchecked")
    public List<DoubtfulDebt> getFINDoubtfulDebtList() {
      return (List<DoubtfulDebt>) get(PROPERTY_FINDOUBTFULDEBTLIST);
    }

    /**
     * Help: {@literal The reasons for potential non payment can include disputes over supply, delivery, at the
     *       conditioner of item or the appearance of financial stress within a customer's operations. When such
     *       a dispute occurs it is prudent to add this debt or portion thereof to the doubtful debt reserve.}<br>
     * @see DoubtfulDebt
     * 
     */
    public void setFINDoubtfulDebtList(List<DoubtfulDebt> fINDoubtfulDebtList) {
        set(PROPERTY_FINDOUBTFULDEBTLIST, fINDoubtfulDebtList);
    }

}
