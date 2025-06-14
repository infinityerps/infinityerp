
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
package org.openbravo.model.financialmgmt.assetmgmt;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.Costcenter;
import org.openbravo.model.financialmgmt.accounting.UserDimension1;
import org.openbravo.model.financialmgmt.accounting.UserDimension2;
import org.openbravo.model.project.Project;
/**
 * Entity class for entity FinancialMgmtAmortizationLine (stored in table A_Amortizationline).
 * <br>
 * Help: {@literal Depreciation of an asset between two dates}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AmortizationLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "A_Amortizationline";
    public static final String ENTITY_NAME = "FinancialMgmtAmortizationLine";

    /**
     * Property id stored in column A_Amortizationline_ID in table A_Amortizationline<br>
     * Help: {@literal Depreciation of an asset between two dates}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table A_Amortizationline 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table A_Amortizationline 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table A_Amortizationline 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table A_Amortizationline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table A_Amortizationline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table A_Amortizationline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table A_Amortizationline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property amortization stored in column A_Amortization_ID in table A_Amortizationline<br>
     * Help: {@literal Refers to all the depreciations ocurred btween two dates}
     * 
     */
    public static final String PROPERTY_AMORTIZATION = "amortization";

    /**
     * Property lineNo stored in column Line in table A_Amortizationline<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property sEQNoAsset stored in column SEQ_No_Asset in table A_Amortizationline<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_SEQNOASSET = "sEQNoAsset";

    /**
     * Property asset stored in column A_Asset_ID in table A_Amortizationline<br>
     * Help: {@literal Any item of economic value owned by the corporation, especially that which could be
     *       converted to cash.}
     * 
     */
    public static final String PROPERTY_ASSET = "asset";

    /**
     * Property amortizationPercentage stored in column Amortization_Percentage in table A_Amortizationline<br>
     * Help: {@literal Amortization Percentage}
     * 
     */
    public static final String PROPERTY_AMORTIZATIONPERCENTAGE = "amortizationPercentage";

    /**
     * Property amortizationAmount stored in column Amortizationamt in table A_Amortizationline 
     * 
     */
    public static final String PROPERTY_AMORTIZATIONAMOUNT = "amortizationAmount";

    /**
     * Property currency stored in column C_Currency_ID in table A_Amortizationline<br>
     * Help: {@literal Indicates the currency to be used when processing this document.}
     * 
     */
    public static final String PROPERTY_CURRENCY = "currency";

    /**
     * Property project stored in column C_Project_ID in table A_Amortizationline<br>
     * Help: {@literal Identifier of a project defined within the Project & Service Management module.}
     * 
     */
    public static final String PROPERTY_PROJECT = "project";

    /**
     * Property costcenter stored in column C_Costcenter_ID in table A_Amortizationline<br>
     * Help: {@literal Division that adds to the cost of an organization. Internal structure for cost
     *       allocation.}
     * 
     */
    public static final String PROPERTY_COSTCENTER = "costcenter";

    /**
     * Property stDimension stored in column User1_ID in table A_Amortizationline<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_STDIMENSION = "stDimension";

    /**
     * Property ndDimension stored in column User2_ID in table A_Amortizationline<br>
     * Help: {@literal The user defined element displays the optional elements that have been defined for this
     *       account combination.}
     * 
     */
    public static final String PROPERTY_NDDIMENSION = "ndDimension";


    public AmortizationLine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AmortizationLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AmortizationLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AmortizationLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AmortizationLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AmortizationLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AmortizationLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AmortizationLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AmortizationLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AmortizationLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AmortizationLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AmortizationLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AmortizationLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AmortizationLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AmortizationLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AmortizationLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AmortizationLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AmortizationLine#PROPERTY_AMORTIZATION
     * 
     */
    public Amortization getAmortization() {
        return (Amortization) get(PROPERTY_AMORTIZATION);
    }
    /**
     * @see AmortizationLine#PROPERTY_AMORTIZATION
     * 
     */
    public void setAmortization(Amortization amortization) {
        set(PROPERTY_AMORTIZATION, amortization);
    }

    /**
     * @see AmortizationLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see AmortizationLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see AmortizationLine#PROPERTY_SEQNOASSET
     * 
     */
    public Long getSEQNoAsset() {
        return (Long) get(PROPERTY_SEQNOASSET);
    }
    /**
     * @see AmortizationLine#PROPERTY_SEQNOASSET
     * 
     */
    public void setSEQNoAsset(Long sEQNoAsset) {
        set(PROPERTY_SEQNOASSET, sEQNoAsset);
    }

    /**
     * @see AmortizationLine#PROPERTY_ASSET
     * 
     */
    public Asset getAsset() {
        return (Asset) get(PROPERTY_ASSET);
    }
    /**
     * @see AmortizationLine#PROPERTY_ASSET
     * 
     */
    public void setAsset(Asset asset) {
        set(PROPERTY_ASSET, asset);
    }

    /**
     * @see AmortizationLine#PROPERTY_AMORTIZATIONPERCENTAGE
     * 
     */
    public BigDecimal getAmortizationPercentage() {
        return (BigDecimal) get(PROPERTY_AMORTIZATIONPERCENTAGE);
    }
    /**
     * @see AmortizationLine#PROPERTY_AMORTIZATIONPERCENTAGE
     * 
     */
    public void setAmortizationPercentage(BigDecimal amortizationPercentage) {
        set(PROPERTY_AMORTIZATIONPERCENTAGE, amortizationPercentage);
    }

    /**
     * @see AmortizationLine#PROPERTY_AMORTIZATIONAMOUNT
     * 
     */
    public BigDecimal getAmortizationAmount() {
        return (BigDecimal) get(PROPERTY_AMORTIZATIONAMOUNT);
    }
    /**
     * @see AmortizationLine#PROPERTY_AMORTIZATIONAMOUNT
     * 
     */
    public void setAmortizationAmount(BigDecimal amortizationAmount) {
        set(PROPERTY_AMORTIZATIONAMOUNT, amortizationAmount);
    }

    /**
     * @see AmortizationLine#PROPERTY_CURRENCY
     * 
     */
    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }
    /**
     * @see AmortizationLine#PROPERTY_CURRENCY
     * 
     */
    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    /**
     * @see AmortizationLine#PROPERTY_PROJECT
     * 
     */
    public Project getProject() {
        return (Project) get(PROPERTY_PROJECT);
    }
    /**
     * @see AmortizationLine#PROPERTY_PROJECT
     * 
     */
    public void setProject(Project project) {
        set(PROPERTY_PROJECT, project);
    }

    /**
     * @see AmortizationLine#PROPERTY_COSTCENTER
     * 
     */
    public Costcenter getCostcenter() {
        return (Costcenter) get(PROPERTY_COSTCENTER);
    }
    /**
     * @see AmortizationLine#PROPERTY_COSTCENTER
     * 
     */
    public void setCostcenter(Costcenter costcenter) {
        set(PROPERTY_COSTCENTER, costcenter);
    }

    /**
     * @see AmortizationLine#PROPERTY_STDIMENSION
     * 
     */
    public UserDimension1 getStDimension() {
        return (UserDimension1) get(PROPERTY_STDIMENSION);
    }
    /**
     * @see AmortizationLine#PROPERTY_STDIMENSION
     * 
     */
    public void setStDimension(UserDimension1 stDimension) {
        set(PROPERTY_STDIMENSION, stDimension);
    }

    /**
     * @see AmortizationLine#PROPERTY_NDDIMENSION
     * 
     */
    public UserDimension2 getNdDimension() {
        return (UserDimension2) get(PROPERTY_NDDIMENSION);
    }
    /**
     * @see AmortizationLine#PROPERTY_NDDIMENSION
     * 
     */
    public void setNdDimension(UserDimension2 ndDimension) {
        set(PROPERTY_NDDIMENSION, ndDimension);
    }

}
