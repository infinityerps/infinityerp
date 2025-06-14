
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
package org.openbravo.model.materialmgmt.cost;

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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.InvoiceLine;
import org.openbravo.model.materialmgmt.transaction.ShipmentInOut;
/**
 * Entity class for entity LandedCostCost (stored in table M_LC_Cost).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class LandedCostCost extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_LC_Cost";
    public static final String ENTITY_NAME = "LandedCostCost";

    /**
     * Property id stored in column M_LC_Cost_ID in table M_LC_Cost<br>
     * Help: {@literal Each Landed Cost amount to be included in the Landed Cost document.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_LC_Cost 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_LC_Cost 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_LC_Cost 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_LC_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_LC_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_LC_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_LC_Cost 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property landedCost stored in column M_Landedcost_ID in table M_LC_Cost<br>
     * Help: {@literal Document that relates Landed Costs like Freights or Custom Taxes to Receipts}
     * 
     */
    public static final String PROPERTY_LANDEDCOST = "landedCost";

    /**
     * Property goodsShipment stored in column M_Inout_ID in table M_LC_Cost<br>
     * Help: {@literal The Shipment ID indicates the unique document for this shipment.}
     * 
     */
    public static final String PROPERTY_GOODSSHIPMENT = "goodsShipment";

    /**
     * Property landedCostType stored in column M_Lc_Type_ID in table M_LC_Cost<br>
     * Help: {@literal Defines a type of Landed Cost Amount that can be assigned to a Receipt}
     * 
     */
    public static final String PROPERTY_LANDEDCOSTTYPE = "landedCostType";

    /**
     * Property invoiceLine stored in column C_Invoiceline_ID in table M_LC_Cost<br>
     * Help: {@literal The Invoice Line uniquely identifies a single line of an Invoice.}
     * 
     */
    public static final String PROPERTY_INVOICELINE = "invoiceLine";

    /**
     * Property amount stored in column Amount in table M_LC_Cost 
     * 
     */
    public static final String PROPERTY_AMOUNT = "amount";

    /**
     * Property landedCostDistributionAlgorithm stored in column M_Lc_Distribution_Alg_ID in table M_LC_Cost<br>
     * Help: {@literal Identifies the Algorithm to be used to distribute the Landed Cost amounts through all the
     *       Receipt Lines.}
     * 
     */
    public static final String PROPERTY_LANDEDCOSTDISTRIBUTIONALGORITHM = "landedCostDistributionAlgorithm";

    /**
     * Property description stored in column Description in table M_LC_Cost<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property currency stored in column C_Currency_ID in table M_LC_Cost<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property matched stored in column IsMatched in table M_LC_Cost<br>
     * Help: {@literal Determines that the Landed Cost Cost is completely matched and processed.}
     * 
     */
    public static final String PROPERTY_MATCHED = "matched";

    /**
     * Property isMatchingAdjusted stored in column IsMatchingAdjusted in table M_LC_Cost<br>
     * Help: {@literal When checked the differences in the Matched documents are processed creating a Cost
     *       Adjustment}
     * 
     */
    public static final String PROPERTY_ISMATCHINGADJUSTED = "isMatchingAdjusted";

    /**
     * Property posted stored in column Posted in table M_LC_Cost<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property processNow stored in column Processing in table M_LC_Cost<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property accountingDate stored in column Dateacct in table M_LC_Cost<br>
     * Help: {@literal The date this transaction is recorded on in the general ledger. This date also indicates
     *       which accounting period within the fiscal year this transaction will be part of.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGDATE = "accountingDate";

    /**
     * Property cancelMatching stored in column Cancel_Matching in table M_LC_Cost<br>
     * Help: {@literal Process that cancels the Matching of the Cost. In case the difference is cost adjusted the
     *       generated Cost Adjustment is canceled.}
     * 
     */
    public static final String PROPERTY_CANCELMATCHING = "cancelMatching";

    /**
     * Property lineNo stored in column Line in table M_LC_Cost<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property documentType stored in column C_Doctype_ID in table M_LC_Cost<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property matchingCostAdjustment stored in column Matching_Costadjustment_ID in table M_LC_Cost
     * 
     */
    public static final String PROPERTY_MATCHINGCOSTADJUSTMENT = "matchingCostAdjustment";

    /**
     * Property processMatching stored in column Process_Matching in table M_LC_Cost
     * 
     */
    public static final String PROPERTY_PROCESSMATCHING = "processMatching";

    /**
     * Property matchingAmount stored in column Matching_Amt in table M_LC_Cost
     * 
     */
    public static final String PROPERTY_MATCHINGAMOUNT = "matchingAmount";

    /**
     * Property processed stored in column Processed in table M_LC_Cost<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property landedCostMatchedList stored in table M_LC_Cost
     * 
     */
    public static final String PROPERTY_LANDEDCOSTMATCHEDLIST = "landedCostMatchedList";

    /**
     * Property landedCostReceiptLineAmtList stored in table M_LC_Cost
     * 
     */
    public static final String PROPERTY_LANDEDCOSTRECEIPTLINEAMTLIST = "landedCostReceiptLineAmtList";


    public LandedCostCost() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_MATCHED, false);
        setDefaultValue(PROPERTY_ISMATCHINGADJUSTED, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_CANCELMATCHING, false);
        setDefaultValue(PROPERTY_PROCESSMATCHING, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_LANDEDCOSTMATCHEDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_LANDEDCOSTRECEIPTLINEAMTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see LandedCostCost#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see LandedCostCost#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see LandedCostCost#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see LandedCostCost#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see LandedCostCost#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see LandedCostCost#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see LandedCostCost#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see LandedCostCost#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see LandedCostCost#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see LandedCostCost#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see LandedCostCost#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see LandedCostCost#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see LandedCostCost#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see LandedCostCost#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see LandedCostCost#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see LandedCostCost#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see LandedCostCost#PROPERTY_LANDEDCOST
     * 
     */
    public LandedCost getLandedCost() {
        return (LandedCost) get(PROPERTY_LANDEDCOST);
    }
    /**
     * @see LandedCostCost#PROPERTY_LANDEDCOST
     * 
     */
    public void setLandedCost(LandedCost landedCost) {
        set(PROPERTY_LANDEDCOST, landedCost);
    }

    /**
     * @see LandedCostCost#PROPERTY_GOODSSHIPMENT
     * 
     */
    public ShipmentInOut getGoodsShipment() {
        return (ShipmentInOut) get(PROPERTY_GOODSSHIPMENT);
    }
    /**
     * @see LandedCostCost#PROPERTY_GOODSSHIPMENT
     * 
     */
    public void setGoodsShipment(ShipmentInOut goodsShipment) {
        set(PROPERTY_GOODSSHIPMENT, goodsShipment);
    }

    /**
     * @see LandedCostCost#PROPERTY_LANDEDCOSTTYPE
     * 
     */
    public LandedCostType getLandedCostType() {
        return (LandedCostType) get(PROPERTY_LANDEDCOSTTYPE);
    }
    /**
     * @see LandedCostCost#PROPERTY_LANDEDCOSTTYPE
     * 
     */
    public void setLandedCostType(LandedCostType landedCostType) {
        set(PROPERTY_LANDEDCOSTTYPE, landedCostType);
    }

    /**
     * @see LandedCostCost#PROPERTY_INVOICELINE
     * 
     */
    public InvoiceLine getInvoiceLine() {
        return (InvoiceLine) get(PROPERTY_INVOICELINE);
    }
    /**
     * @see LandedCostCost#PROPERTY_INVOICELINE
     * 
     */
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        set(PROPERTY_INVOICELINE, invoiceLine);
    }

    /**
     * @see LandedCostCost#PROPERTY_AMOUNT
     * 
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }
    /**
     * @see LandedCostCost#PROPERTY_AMOUNT
     * 
     */
    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    /**
     * @see LandedCostCost#PROPERTY_LANDEDCOSTDISTRIBUTIONALGORITHM
     * 
     */
    public LCDistributionAlgorithm getLandedCostDistributionAlgorithm() {
        return (LCDistributionAlgorithm) get(PROPERTY_LANDEDCOSTDISTRIBUTIONALGORITHM);
    }
    /**
     * @see LandedCostCost#PROPERTY_LANDEDCOSTDISTRIBUTIONALGORITHM
     * 
     */
    public void setLandedCostDistributionAlgorithm(LCDistributionAlgorithm landedCostDistributionAlgorithm) {
        set(PROPERTY_LANDEDCOSTDISTRIBUTIONALGORITHM, landedCostDistributionAlgorithm);
    }

    /**
     * @see LandedCostCost#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see LandedCostCost#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see LandedCostCost#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see LandedCostCost#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see LandedCostCost#PROPERTY_MATCHED
     * 
     */
    public Boolean isMatched() {
        return (Boolean) get(PROPERTY_MATCHED);
    }
    /**
     * @see LandedCostCost#PROPERTY_MATCHED
     * 
     */
    public void setMatched(Boolean matched) {
        set(PROPERTY_MATCHED, matched);
    }

    /**
     * @see LandedCostCost#PROPERTY_ISMATCHINGADJUSTED
     * 
     */
    public Boolean isMatchingAdjusted() {
        return (Boolean) get(PROPERTY_ISMATCHINGADJUSTED);
    }
    /**
     * @see LandedCostCost#PROPERTY_ISMATCHINGADJUSTED
     * 
     */
    public void setMatchingAdjusted(Boolean isMatchingAdjusted) {
        set(PROPERTY_ISMATCHINGADJUSTED, isMatchingAdjusted);
    }

    /**
     * @see LandedCostCost#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see LandedCostCost#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see LandedCostCost#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see LandedCostCost#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see LandedCostCost#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public Date getAccountingDate() {
        return (Date) get(PROPERTY_ACCOUNTINGDATE);
    }
    /**
     * @see LandedCostCost#PROPERTY_ACCOUNTINGDATE
     * 
     */
    public void setAccountingDate(Date accountingDate) {
        set(PROPERTY_ACCOUNTINGDATE, accountingDate);
    }

    /**
     * @see LandedCostCost#PROPERTY_CANCELMATCHING
     * 
     */
    public Boolean isCancelMatching() {
        return (Boolean) get(PROPERTY_CANCELMATCHING);
    }
    /**
     * @see LandedCostCost#PROPERTY_CANCELMATCHING
     * 
     */
    public void setCancelMatching(Boolean cancelMatching) {
        set(PROPERTY_CANCELMATCHING, cancelMatching);
    }

    /**
     * @see LandedCostCost#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see LandedCostCost#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see LandedCostCost#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see LandedCostCost#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see LandedCostCost#PROPERTY_MATCHINGCOSTADJUSTMENT
     * 
     */
    public CostAdjustment getMatchingCostAdjustment() {
        return (CostAdjustment) get(PROPERTY_MATCHINGCOSTADJUSTMENT);
    }
    /**
     * @see LandedCostCost#PROPERTY_MATCHINGCOSTADJUSTMENT
     * 
     */
    public void setMatchingCostAdjustment(CostAdjustment matchingCostAdjustment) {
        set(PROPERTY_MATCHINGCOSTADJUSTMENT, matchingCostAdjustment);
    }

    /**
     * @see LandedCostCost#PROPERTY_PROCESSMATCHING
     * 
     */
    public Boolean isProcessMatching() {
        return (Boolean) get(PROPERTY_PROCESSMATCHING);
    }
    /**
     * @see LandedCostCost#PROPERTY_PROCESSMATCHING
     * 
     */
    public void setProcessMatching(Boolean processMatching) {
        set(PROPERTY_PROCESSMATCHING, processMatching);
    }

    /**
     * @see LandedCostCost#PROPERTY_MATCHINGAMOUNT
     * 
     */
    public BigDecimal getMatchingAmount() {
        return (BigDecimal) get(PROPERTY_MATCHINGAMOUNT);
    }
    /**
     * @see LandedCostCost#PROPERTY_MATCHINGAMOUNT
     * 
     */
    public void setMatchingAmount(BigDecimal matchingAmount) {
        set(PROPERTY_MATCHINGAMOUNT, matchingAmount);
    }

    /**
     * @see LandedCostCost#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see LandedCostCost#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see LCMatched
     * 
     */
    @SuppressWarnings("unchecked")
    public List<LCMatched> getLandedCostMatchedList() {
      return (List<LCMatched>) get(PROPERTY_LANDEDCOSTMATCHEDLIST);
    }

    /**
     * @see LCMatched
     * 
     */
    public void setLandedCostMatchedList(List<LCMatched> landedCostMatchedList) {
        set(PROPERTY_LANDEDCOSTMATCHEDLIST, landedCostMatchedList);
    }

    /**
     * @see LCReceiptLineAmt
     * 
     */
    @SuppressWarnings("unchecked")
    public List<LCReceiptLineAmt> getLandedCostReceiptLineAmtList() {
      return (List<LCReceiptLineAmt>) get(PROPERTY_LANDEDCOSTRECEIPTLINEAMTLIST);
    }

    /**
     * @see LCReceiptLineAmt
     * 
     */
    public void setLandedCostReceiptLineAmtList(List<LCReceiptLineAmt> landedCostReceiptLineAmtList) {
        set(PROPERTY_LANDEDCOSTRECEIPTLINEAMTLIST, landedCostReceiptLineAmtList);
    }

}
