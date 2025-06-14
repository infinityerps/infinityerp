
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
package org.openbravo.model.financialmgmt.tax;

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
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtTaxRegister (stored in table C_TaxRegister).
 * <br>
 * Help: {@literal Tax Register}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TaxRegister extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_TaxRegister";
    public static final String ENTITY_NAME = "FinancialMgmtTaxRegister";

    /**
     * Property client stored in column AD_Client_ID in table C_TaxRegister 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_TaxRegister 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_TaxRegister 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_TaxRegister 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_TaxRegister 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_TaxRegister 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_TaxRegister 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property id stored in column C_Taxregister_ID in table C_TaxRegister<br>
     * Help: {@literal Tax register}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property lastRegisterAmount stored in column Lastregaccumamt in table C_TaxRegister
     * 
     */
    public static final String PROPERTY_LASTREGISTERAMOUNT = "lastRegisterAmount";

    /**
     * Property taxPayment stored in column C_Taxpayment_ID in table C_TaxRegister<br>
     * Help: {@literal Tax payment}
     * 
     */
    public static final String PROPERTY_TAXPAYMENT = "taxPayment";

    /**
     * Property taxTotalAmount stored in column Taxtotalamt in table C_TaxRegister<br>
     * Help: {@literal Tax total amount}
     * 
     */
    public static final String PROPERTY_TAXTOTALAMOUNT = "taxTotalAmount";

    /**
     * Property name stored in column Name in table C_TaxRegister 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property taxRegisterType stored in column C_Taxregister_Type_ID in table C_TaxRegister<br>
     * Help: {@literal Type of Tax Register}
     * 
     */
    public static final String PROPERTY_TAXREGISTERTYPE = "taxRegisterType";

    /**
     * Property pageNo stored in column Pageno in table C_TaxRegister<br>
     * Help: {@literal Page number}
     * 
     */
    public static final String PROPERTY_PAGENO = "pageNo";

    /**
     * Property financialMgmtTaxRegisterlineList stored in table C_TaxRegister
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST = "financialMgmtTaxRegisterlineList";


    public TaxRegister() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TaxRegister#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TaxRegister#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TaxRegister#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TaxRegister#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TaxRegister#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TaxRegister#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TaxRegister#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TaxRegister#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TaxRegister#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TaxRegister#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TaxRegister#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TaxRegister#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TaxRegister#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TaxRegister#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TaxRegister#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TaxRegister#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TaxRegister#PROPERTY_LASTREGISTERAMOUNT
     * 
     */
    public BigDecimal getLastRegisterAmount() {
        return (BigDecimal) get(PROPERTY_LASTREGISTERAMOUNT);
    }
    /**
     * @see TaxRegister#PROPERTY_LASTREGISTERAMOUNT
     * 
     */
    public void setLastRegisterAmount(BigDecimal lastRegisterAmount) {
        set(PROPERTY_LASTREGISTERAMOUNT, lastRegisterAmount);
    }

    /**
     * @see TaxRegister#PROPERTY_TAXPAYMENT
     * 
     */
    public TaxPayment getTaxPayment() {
        return (TaxPayment) get(PROPERTY_TAXPAYMENT);
    }
    /**
     * @see TaxRegister#PROPERTY_TAXPAYMENT
     * 
     */
    public void setTaxPayment(TaxPayment taxPayment) {
        set(PROPERTY_TAXPAYMENT, taxPayment);
    }

    /**
     * @see TaxRegister#PROPERTY_TAXTOTALAMOUNT
     * 
     */
    public BigDecimal getTaxTotalAmount() {
        return (BigDecimal) get(PROPERTY_TAXTOTALAMOUNT);
    }
    /**
     * @see TaxRegister#PROPERTY_TAXTOTALAMOUNT
     * 
     */
    public void setTaxTotalAmount(BigDecimal taxTotalAmount) {
        set(PROPERTY_TAXTOTALAMOUNT, taxTotalAmount);
    }

    /**
     * @see TaxRegister#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see TaxRegister#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see TaxRegister#PROPERTY_TAXREGISTERTYPE
     * 
     */
    public TaxRegisterType getTaxRegisterType() {
        return (TaxRegisterType) get(PROPERTY_TAXREGISTERTYPE);
    }
    /**
     * @see TaxRegister#PROPERTY_TAXREGISTERTYPE
     * 
     */
    public void setTaxRegisterType(TaxRegisterType taxRegisterType) {
        set(PROPERTY_TAXREGISTERTYPE, taxRegisterType);
    }

    /**
     * @see TaxRegister#PROPERTY_PAGENO
     * 
     */
    public Long getPageNo() {
        return (Long) get(PROPERTY_PAGENO);
    }
    /**
     * @see TaxRegister#PROPERTY_PAGENO
     * 
     */
    public void setPageNo(Long pageNo) {
        set(PROPERTY_PAGENO, pageNo);
    }

    /**
     * Help: {@literal Lines of Tax Register}<br>
     * @see TaxRegisterline
     * 
     */
    @SuppressWarnings("unchecked")
    public List<TaxRegisterline> getFinancialMgmtTaxRegisterlineList() {
      return (List<TaxRegisterline>) get(PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST);
    }

    /**
     * Help: {@literal Lines of Tax Register}<br>
     * @see TaxRegisterline
     * 
     */
    public void setFinancialMgmtTaxRegisterlineList(List<TaxRegisterline> financialMgmtTaxRegisterlineList) {
        set(PROPERTY_FINANCIALMGMTTAXREGISTERLINELIST, financialMgmtTaxRegisterlineList);
    }

}
