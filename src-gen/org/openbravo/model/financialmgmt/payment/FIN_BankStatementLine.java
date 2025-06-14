
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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.gl.GLItem;
/**
 * Entity class for entity FIN_BankStatementLine (stored in table FIN_BankStatementLine).
 * <br>
 * Help: {@literal Line related to the given Bank Statement}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class FIN_BankStatementLine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_BankStatementLine";
    public static final String ENTITY_NAME = "FIN_BankStatementLine";

    /**
     * Property id stored in column FIN_Bankstatementline_ID in table FIN_BankStatementLine<br>
     * Help: {@literal Line related to the bank statement}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_BankStatementLine 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_BankStatementLine 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_BankStatementLine 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_BankStatementLine 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property bankStatement stored in column FIN_Bankstatement_ID in table FIN_BankStatementLine<br>
     * Help: {@literal Bank statements loaded for the given financial account}
     * 
     */
    public static final String PROPERTY_BANKSTATEMENT = "bankStatement";

    /**
     * Property lineNo stored in column Line in table FIN_BankStatementLine 
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";

    /**
     * Property bpartnername stored in column Bpartnername in table FIN_BankStatementLine<br>
     * Help: {@literal Business Partner Name}
     * 
     */
    public static final String PROPERTY_BPARTNERNAME = "bpartnername";

    /**
     * Property businessPartner stored in column C_Bpartner_ID in table FIN_BankStatementLine<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property transactionDate stored in column Datetrx in table FIN_BankStatementLine<br>
     * Help: {@literal The Transaction Date indicates the date of the transaction.}
     * 
     */
    public static final String PROPERTY_TRANSACTIONDATE = "transactionDate";

    /**
     * Property cramount stored in column Cramount in table FIN_BankStatementLine<br>
     * Help: {@literal Amount credited. Reflects amount IN}
     * 
     */
    public static final String PROPERTY_CRAMOUNT = "cramount";

    /**
     * Property dramount stored in column Dramount in table FIN_BankStatementLine<br>
     * Help: {@literal Amount Debited. Reflects the amount OUT}
     * 
     */
    public static final String PROPERTY_DRAMOUNT = "dramount";

    /**
     * Property referenceNo stored in column Referenceno in table FIN_BankStatementLine<br>
     * Help: {@literal The reference number can be printed on orders and invoices to allow your business partner
     *       to faster identify your records.}
     * 
     */
    public static final String PROPERTY_REFERENCENO = "referenceNo";

    /**
     * Property matchingtype stored in column Matchingtype in table FIN_BankStatementLine<br>
     * Help: {@literal Type of matching for the given line}
     * 
     */
    public static final String PROPERTY_MATCHINGTYPE = "matchingtype";

    /**
     * Property financialAccountTransaction stored in column FIN_FinAcc_Transaction_ID in table FIN_BankStatementLine
     * 
     */
    public static final String PROPERTY_FINANCIALACCOUNTTRANSACTION = "financialAccountTransaction";

    /**
     * Property description stored in column Description in table FIN_BankStatementLine<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property gLItem stored in column C_Glitem_ID in table FIN_BankStatementLine<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property matchedDocument stored in column Matched_Document in table FIN_BankStatementLine
     * 
     */
    public static final String PROPERTY_MATCHEDDOCUMENT = "matchedDocument";


    public FIN_BankStatementLine() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CRAMOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_DRAMOUNT, new BigDecimal(0));
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_BANKSTATEMENT
     * 
     */
    public FIN_BankStatement getBankStatement() {
        return (FIN_BankStatement) get(PROPERTY_BANKSTATEMENT);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_BANKSTATEMENT
     * 
     */
    public void setBankStatement(FIN_BankStatement bankStatement) {
        set(PROPERTY_BANKSTATEMENT, bankStatement);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_BPARTNERNAME
     * 
     */
    public String getBpartnername() {
        return (String) get(PROPERTY_BPARTNERNAME);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_BPARTNERNAME
     * 
     */
    public void setBpartnername(String bpartnername) {
        set(PROPERTY_BPARTNERNAME, bpartnername);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_TRANSACTIONDATE
     * 
     */
    public Date getTransactionDate() {
        return (Date) get(PROPERTY_TRANSACTIONDATE);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_TRANSACTIONDATE
     * 
     */
    public void setTransactionDate(Date transactionDate) {
        set(PROPERTY_TRANSACTIONDATE, transactionDate);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_CRAMOUNT
     * 
     */
    public BigDecimal getCramount() {
        return (BigDecimal) get(PROPERTY_CRAMOUNT);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_CRAMOUNT
     * 
     */
    public void setCramount(BigDecimal cramount) {
        set(PROPERTY_CRAMOUNT, cramount);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_DRAMOUNT
     * 
     */
    public BigDecimal getDramount() {
        return (BigDecimal) get(PROPERTY_DRAMOUNT);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_DRAMOUNT
     * 
     */
    public void setDramount(BigDecimal dramount) {
        set(PROPERTY_DRAMOUNT, dramount);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_REFERENCENO
     * 
     */
    public String getReferenceNo() {
        return (String) get(PROPERTY_REFERENCENO);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_REFERENCENO
     * 
     */
    public void setReferenceNo(String referenceNo) {
        set(PROPERTY_REFERENCENO, referenceNo);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_MATCHINGTYPE
     * 
     */
    public String getMatchingtype() {
        return (String) get(PROPERTY_MATCHINGTYPE);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_MATCHINGTYPE
     * 
     */
    public void setMatchingtype(String matchingtype) {
        set(PROPERTY_MATCHINGTYPE, matchingtype);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public FIN_FinaccTransaction getFinancialAccountTransaction() {
        return (FIN_FinaccTransaction) get(PROPERTY_FINANCIALACCOUNTTRANSACTION);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_FINANCIALACCOUNTTRANSACTION
     * 
     */
    public void setFinancialAccountTransaction(FIN_FinaccTransaction financialAccountTransaction) {
        set(PROPERTY_FINANCIALACCOUNTTRANSACTION, financialAccountTransaction);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see FIN_BankStatementLine#PROPERTY_MATCHEDDOCUMENT
     * 
     */
    public String getMatchedDocument() {
        return (String) get(PROPERTY_MATCHEDDOCUMENT);
    }
    /**
     * @see FIN_BankStatementLine#PROPERTY_MATCHEDDOCUMENT
     * 
     */
    public void setMatchedDocument(String matchedDocument) {
        set(PROPERTY_MATCHEDDOCUMENT, matchedDocument);
    }

}
