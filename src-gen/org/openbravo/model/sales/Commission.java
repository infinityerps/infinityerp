
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
package org.openbravo.model.sales;

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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
/**
 * Entity class for entity SalesCommission (stored in table C_Commission).
 * <br>
 * Help: {@literal Contains all the commissions and  when to pay a commission to whom.  For each period, you
     *       start the calculation of the commission after the transaction for that period are completed or
     *       closed.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Commission extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Commission";
    public static final String ENTITY_NAME = "SalesCommission";

    /**
     * Property id stored in column C_Commission_ID in table C_Commission<br>
     * Help: {@literal The Commission ID is a unique identifier of a set of commission rules.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Commission 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Commission 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Commission 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Commission 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Commission 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Commission 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Commission 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Commission 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Commission<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table C_Commission<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property currency stored in column C_Currency_ID in table C_Commission<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property frequencyType stored in column FrequencyType in table C_Commission<br>
     * Help: {@literal The frequency type is used for calculating the date of the next event.}
     * 
     */
    public static final String PROPERTY_FREQUENCYTYPE = "frequencyType";

    /**
     * Property calculationBasis stored in column DocBasisType in table C_Commission<br>
     * Help: {@literal The Basis Document indicates the basis to be used for the commission calculation.}
     * 
     */
    public static final String PROPERTY_CALCULATIONBASIS = "calculationBasis";

    /**
     * Property listDetails stored in column ListDetails in table C_Commission<br>
     * Help: {@literal The List Details checkbox indicates that the details for each document line will be
     *       displayed.}
     * 
     */
    public static final String PROPERTY_LISTDETAILS = "listDetails";

    /**
     * Property lastRunDate stored in column DateLastRun in table C_Commission<br>
     * Help: {@literal The Date Last Run indicates the last time that a process was run.}
     * 
     */
    public static final String PROPERTY_LASTRUNDATE = "lastRunDate";

    /**
     * Property createLinesFrom stored in column CreateFrom in table C_Commission<br>
     * Help: {@literal A process that allows the user to copy lines (products) from an existing document
     *       different from the one being copied into. For example, in case of entering a new Goods Shipment, the
     *       user can copy lines (products) from an existing Sales Order or Sales Invoice.}
     * 
     */
    public static final String PROPERTY_CREATELINESFROM = "createLinesFrom";

    /**
     * Property processNow stored in column Processing in table C_Commission<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property product stored in column M_Product_ID in table C_Commission<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_PRODUCT = "product";

    /**
     * Property basisstatus stored in column Basisstatus in table C_Commission<br>
     * Help: {@literal The documents that will take into account to calculate the commission:  all documents or
     *       fully paid documents)}
     * 
     */
    public static final String PROPERTY_BASISSTATUS = "basisstatus";

    /**
     * Property basisamt stored in column Basisamt in table C_Commission<br>
     * Help: {@literal The amount  that will take into account to calculate the commission: net amount or margin.
     *       
     *        If margin is selected, only the invoices that have shipments will take into account.}
     * 
     */
    public static final String PROPERTY_BASISAMT = "basisamt";

    /**
     * Property cascade stored in column iscascade in table C_Commission<br>
     * Help: {@literal If it is checked the commission will be calculated in cascade}
     * 
     */
    public static final String PROPERTY_CASCADE = "cascade";

    /**
     * Property salesCommissionLineList stored in table C_Commission
     * 
     */
    public static final String PROPERTY_SALESCOMMISSIONLINELIST = "salesCommissionLineList";


    public Commission() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FREQUENCYTYPE, "M");
        setDefaultValue(PROPERTY_CALCULATIONBASIS, "I");
        setDefaultValue(PROPERTY_LISTDETAILS, true);
        setDefaultValue(PROPERTY_CREATELINESFROM, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_CASCADE, false);
        setDefaultValue(PROPERTY_SALESCOMMISSIONLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Commission#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Commission#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Commission#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Commission#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Commission#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Commission#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Commission#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Commission#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Commission#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Commission#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Commission#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Commission#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Commission#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Commission#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Commission#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Commission#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Commission#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Commission#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Commission#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Commission#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Commission#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Commission#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Commission#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see Commission#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see Commission#PROPERTY_FREQUENCYTYPE
     * 
     */
    public String getFrequencyType() {
        return (String) get(PROPERTY_FREQUENCYTYPE);
    }
    /**
     * @see Commission#PROPERTY_FREQUENCYTYPE
     * 
     */
    public void setFrequencyType(String frequencyType) {
        set(PROPERTY_FREQUENCYTYPE, frequencyType);
    }

    /**
     * @see Commission#PROPERTY_CALCULATIONBASIS
     * 
     */
    public String getCalculationBasis() {
        return (String) get(PROPERTY_CALCULATIONBASIS);
    }
    /**
     * @see Commission#PROPERTY_CALCULATIONBASIS
     * 
     */
    public void setCalculationBasis(String calculationBasis) {
        set(PROPERTY_CALCULATIONBASIS, calculationBasis);
    }

    /**
     * @see Commission#PROPERTY_LISTDETAILS
     * 
     */
    public Boolean isListDetails() {
        return (Boolean) get(PROPERTY_LISTDETAILS);
    }
    /**
     * @see Commission#PROPERTY_LISTDETAILS
     * 
     */
    public void setListDetails(Boolean listDetails) {
        set(PROPERTY_LISTDETAILS, listDetails);
    }

    /**
     * @see Commission#PROPERTY_LASTRUNDATE
     * 
     */
    public Date getLastRunDate() {
        return (Date) get(PROPERTY_LASTRUNDATE);
    }
    /**
     * @see Commission#PROPERTY_LASTRUNDATE
     * 
     */
    public void setLastRunDate(Date lastRunDate) {
        set(PROPERTY_LASTRUNDATE, lastRunDate);
    }

    /**
     * @see Commission#PROPERTY_CREATELINESFROM
     * 
     */
    public Boolean isCreateLinesFrom() {
        return (Boolean) get(PROPERTY_CREATELINESFROM);
    }
    /**
     * @see Commission#PROPERTY_CREATELINESFROM
     * 
     */
    public void setCreateLinesFrom(Boolean createLinesFrom) {
        set(PROPERTY_CREATELINESFROM, createLinesFrom);
    }

    /**
     * @see Commission#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Commission#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Commission#PROPERTY_PRODUCT
     * 
     */
    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }
    /**
     * @see Commission#PROPERTY_PRODUCT
     * 
     */
    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    /**
     * @see Commission#PROPERTY_BASISSTATUS
     * 
     */
    public String getBasisstatus() {
        return (String) get(PROPERTY_BASISSTATUS);
    }
    /**
     * @see Commission#PROPERTY_BASISSTATUS
     * 
     */
    public void setBasisstatus(String basisstatus) {
        set(PROPERTY_BASISSTATUS, basisstatus);
    }

    /**
     * @see Commission#PROPERTY_BASISAMT
     * 
     */
    public String getBasisamt() {
        return (String) get(PROPERTY_BASISAMT);
    }
    /**
     * @see Commission#PROPERTY_BASISAMT
     * 
     */
    public void setBasisamt(String basisamt) {
        set(PROPERTY_BASISAMT, basisamt);
    }

    /**
     * @see Commission#PROPERTY_CASCADE
     * 
     */
    public Boolean isCascade() {
        return (Boolean) get(PROPERTY_CASCADE);
    }
    /**
     * @see Commission#PROPERTY_CASCADE
     * 
     */
    public void setCascade(Boolean cascade) {
        set(PROPERTY_CASCADE, cascade);
    }

    /**
     * Help: {@literal Define the selection criteria for paying the commission. If you do not enter restricting
     *       parameters (e.g. for specific Business Partner (Groups) or Product (Categories), etc. all
     *       transactions for the period will be used to calculate the commission.}<br>
     * @see CommissionLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CommissionLine> getSalesCommissionLineList() {
      return (List<CommissionLine>) get(PROPERTY_SALESCOMMISSIONLINELIST);
    }

    /**
     * Help: {@literal Define the selection criteria for paying the commission. If you do not enter restricting
     *       parameters (e.g. for specific Business Partner (Groups) or Product (Categories), etc. all
     *       transactions for the period will be used to calculate the commission.}<br>
     * @see CommissionLine
     * 
     */
    public void setSalesCommissionLineList(List<CommissionLine> salesCommissionLineList) {
        set(PROPERTY_SALESCOMMISSIONLINELIST, salesCommissionLineList);
    }

}
