
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
package org.openbravo.model.financialmgmt.accounting.report;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;
/**
 * Entity class for entity FinancialMgmtAcctRptNode (stored in table C_Acct_Rpt_Node).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class AcctRptNode extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Acct_Rpt_Node";
    public static final String ENTITY_NAME = "FinancialMgmtAcctRptNode";

    /**
     * Property id stored in column C_Acct_Rpt_Node_ID in table C_Acct_Rpt_Node 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property group stored in column C_Acct_Rpt_Group_ID in table C_Acct_Rpt_Node<br>
     * Help: {@literal Accounting Report Group defines groups gro general accounting reports.}
     * 
     */
    public static final String PROPERTY_GROUP = "group";

    /**
     * Property client stored in column AD_Client_ID in table C_Acct_Rpt_Node 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Acct_Rpt_Node 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Acct_Rpt_Node 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Acct_Rpt_Node 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_Acct_Rpt_Node 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Acct_Rpt_Node 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_Acct_Rpt_Node 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Acct_Rpt_Node 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Acct_Rpt_Node<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property accountElement stored in column C_ElementValue_ID in table C_Acct_Rpt_Node<br>
     * Help: {@literal Account Elements can be natural accounts or user defined values.}
     * 
     */
    public static final String PROPERTY_ACCOUNTELEMENT = "accountElement";

    /**
     * Property lineNo stored in column Line in table C_Acct_Rpt_Node<br>
     * Help: {@literal Indicates the unique line for a document.  It will also control the display order of the
     *       lines within a document.}
     * 
     */
    public static final String PROPERTY_LINENO = "lineNo";


    public AcctRptNode() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see AcctRptNode#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see AcctRptNode#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see AcctRptNode#PROPERTY_GROUP
     * 
     */
    public AcctRptGroup getGroup() {
        return (AcctRptGroup) get(PROPERTY_GROUP);
    }
    /**
     * @see AcctRptNode#PROPERTY_GROUP
     * 
     */
    public void setGroup(AcctRptGroup group) {
        set(PROPERTY_GROUP, group);
    }

    /**
     * @see AcctRptNode#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see AcctRptNode#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see AcctRptNode#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see AcctRptNode#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see AcctRptNode#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see AcctRptNode#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see AcctRptNode#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see AcctRptNode#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see AcctRptNode#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see AcctRptNode#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see AcctRptNode#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see AcctRptNode#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see AcctRptNode#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see AcctRptNode#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see AcctRptNode#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see AcctRptNode#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see AcctRptNode#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see AcctRptNode#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see AcctRptNode#PROPERTY_ACCOUNTELEMENT
     * 
     */
    public ElementValue getAccountElement() {
        return (ElementValue) get(PROPERTY_ACCOUNTELEMENT);
    }
    /**
     * @see AcctRptNode#PROPERTY_ACCOUNTELEMENT
     * 
     */
    public void setAccountElement(ElementValue accountElement) {
        set(PROPERTY_ACCOUNTELEMENT, accountElement);
    }

    /**
     * @see AcctRptNode#PROPERTY_LINENO
     * 
     */
    public Long getLineNo() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see AcctRptNode#PROPERTY_LINENO
     * 
     */
    public void setLineNo(Long lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

}
