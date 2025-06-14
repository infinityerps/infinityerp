
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
package org.openbravo.model.financialmgmt.accounting.coa;

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
import org.openbravo.model.ad.utility.Tree;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtElement (stored in table C_Element).
 * <br>
 * Help: {@literal The Element defines the Name, Description and Format for an Element.  Additionally, a Type
     *       of Account or User Defined is selected. Each Account Schema must have an Account Element type.  The
     *       User Defined Elements are optional.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Element extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Element";
    public static final String ENTITY_NAME = "FinancialMgmtElement";

    /**
     * Property id stored in column C_Element_ID in table C_Element<br>
     * Help: {@literal The Account Tree uniquely identifies the Account Tree, also known as Chart of Accounts,
     *       linked to the Accounting Schema.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_Element 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_Element 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_Element 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_Element 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table C_Element 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table C_Element<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property valueFormat stored in column VFormat in table C_Element<br>
     * Help: {@literal Value Format is the format the value will be displayed with.}
     * 
     */
    public static final String PROPERTY_VALUEFORMAT = "valueFormat";

    /**
     * Property type stored in column ElementType in table C_Element<br>
     * Help: {@literal The Element Type indicates if this element is the Account element or is a User Defined
     *       element.}
     * 
     */
    public static final String PROPERTY_TYPE = "type";

    /**
     * Property balancing stored in column IsBalancing in table C_Element<br>
     * Help: {@literal The Balancing checkbox indicates the this element must balance in each journal
     *       transaction.  For example, if cost centers have been defined as an element which is balance then the
     *       debits and credits for each unique cost center must net to 0.00.  This is commonly used to define
     *       parts of an organization which report as their own entity.  Balancing is not an option for the
     *       Account element.}
     * 
     */
    public static final String PROPERTY_BALANCING = "balancing";

    /**
     * Property naturalAccount stored in column IsNaturalAccount in table C_Element<br>
     * Help: {@literal The natural account is often based on (industry specific) chart of accounts}
     * 
     */
    public static final String PROPERTY_NATURALACCOUNT = "naturalAccount";

    /**
     * Property tree stored in column AD_Tree_ID in table C_Element<br>
     * Help: {@literal The Tree field identifies a unique Tree in the system. Trees define roll ups or summary
     *       levels of information.  They are used in reports for defining report points and summarization
     *       levels.}
     * 
     */
    public static final String PROPERTY_TREE = "tree";

    /**
     * Property additionalTree2 stored in column Add2Tree_ID in table C_Element<br>
     * Help: {@literal The Additional Tree is used to define alternate roll ups which can be used in reporting. 
     *       For example, you may have a Business Partner Tree which rolls up based on geographic location and an
     *       additional tree which rolls up based on industry.}
     * 
     */
    public static final String PROPERTY_ADDITIONALTREE2 = "additionalTree2";

    /**
     * Property additionalTree1 stored in column Add1Tree_ID in table C_Element<br>
     * Help: {@literal The Additional Tree is used to define alternate roll ups which can be used in reporting. 
     *       For example, you may have a Business Partner Tree which rolls up based on geographic location and an
     *       additional tree which rolls up based on industry.}
     * 
     */
    public static final String PROPERTY_ADDITIONALTREE1 = "additionalTree1";

    /**
     * Property financialMgmtAcctSchemaElementList stored in table C_Element
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST = "financialMgmtAcctSchemaElementList";

    /**
     * Property financialMgmtElementValueList stored in table C_Element
     * 
     */
    public static final String PROPERTY_FINANCIALMGMTELEMENTVALUELIST = "financialMgmtElementValueList";


    public Element() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_TYPE, "A");
        setDefaultValue(PROPERTY_BALANCING, false);
        setDefaultValue(PROPERTY_NATURALACCOUNT, false);
        setDefaultValue(PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTELEMENTVALUELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Element#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Element#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Element#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Element#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Element#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Element#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Element#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Element#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Element#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Element#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Element#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Element#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Element#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Element#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Element#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Element#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Element#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Element#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Element#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Element#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Element#PROPERTY_VALUEFORMAT
     * 
     */
    public String getValueFormat() {
        return (String) get(PROPERTY_VALUEFORMAT);
    }
    /**
     * @see Element#PROPERTY_VALUEFORMAT
     * 
     */
    public void setValueFormat(String valueFormat) {
        set(PROPERTY_VALUEFORMAT, valueFormat);
    }

    /**
     * @see Element#PROPERTY_TYPE
     * 
     */
    public String getType() {
        return (String) get(PROPERTY_TYPE);
    }
    /**
     * @see Element#PROPERTY_TYPE
     * 
     */
    public void setType(String type) {
        set(PROPERTY_TYPE, type);
    }

    /**
     * @see Element#PROPERTY_BALANCING
     * 
     */
    public Boolean isBalancing() {
        return (Boolean) get(PROPERTY_BALANCING);
    }
    /**
     * @see Element#PROPERTY_BALANCING
     * 
     */
    public void setBalancing(Boolean balancing) {
        set(PROPERTY_BALANCING, balancing);
    }

    /**
     * @see Element#PROPERTY_NATURALACCOUNT
     * 
     */
    public Boolean isNaturalAccount() {
        return (Boolean) get(PROPERTY_NATURALACCOUNT);
    }
    /**
     * @see Element#PROPERTY_NATURALACCOUNT
     * 
     */
    public void setNaturalAccount(Boolean naturalAccount) {
        set(PROPERTY_NATURALACCOUNT, naturalAccount);
    }

    /**
     * @see Element#PROPERTY_TREE
     * 
     */
    public Tree getTree() {
        return (Tree) get(PROPERTY_TREE);
    }
    /**
     * @see Element#PROPERTY_TREE
     * 
     */
    public void setTree(Tree tree) {
        set(PROPERTY_TREE, tree);
    }

    /**
     * @see Element#PROPERTY_ADDITIONALTREE2
     * 
     */
    public Tree getAdditionalTree2() {
        return (Tree) get(PROPERTY_ADDITIONALTREE2);
    }
    /**
     * @see Element#PROPERTY_ADDITIONALTREE2
     * 
     */
    public void setAdditionalTree2(Tree additionalTree2) {
        set(PROPERTY_ADDITIONALTREE2, additionalTree2);
    }

    /**
     * @see Element#PROPERTY_ADDITIONALTREE1
     * 
     */
    public Tree getAdditionalTree1() {
        return (Tree) get(PROPERTY_ADDITIONALTREE1);
    }
    /**
     * @see Element#PROPERTY_ADDITIONALTREE1
     * 
     */
    public void setAdditionalTree1(Tree additionalTree1) {
        set(PROPERTY_ADDITIONALTREE1, additionalTree1);
    }

    /**
     * Help: {@literal The Account Schema Element defines the elements that comprise the account key. A name is
     *       defined which will display in documents.  Also the order of the elements and if they are balanced
     *       and mandatory are indicated.}<br>
     * @see AcctSchemaElement
     * 
     */
    @SuppressWarnings("unchecked")
    public List<AcctSchemaElement> getFinancialMgmtAcctSchemaElementList() {
      return (List<AcctSchemaElement>) get(PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST);
    }

    /**
     * Help: {@literal The Account Schema Element defines the elements that comprise the account key. A name is
     *       defined which will display in documents.  Also the order of the elements and if they are balanced
     *       and mandatory are indicated.}<br>
     * @see AcctSchemaElement
     * 
     */
    public void setFinancialMgmtAcctSchemaElementList(List<AcctSchemaElement> financialMgmtAcctSchemaElementList) {
        set(PROPERTY_FINANCIALMGMTACCTSCHEMAELEMENTLIST, financialMgmtAcctSchemaElementList);
    }

    /**
     * Help: {@literal The individual valid values for the Element.  The values must conform to the format
     *       defined.  If the Element is an Account Type then the Account Classification (Asset, Liability etc)
     *       and posting controls are also defined}<br>
     * @see ElementValue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ElementValue> getFinancialMgmtElementValueList() {
      return (List<ElementValue>) get(PROPERTY_FINANCIALMGMTELEMENTVALUELIST);
    }

    /**
     * Help: {@literal The individual valid values for the Element.  The values must conform to the format
     *       defined.  If the Element is an Account Type then the Account Classification (Asset, Liability etc)
     *       and posting controls are also defined}<br>
     * @see ElementValue
     * 
     */
    public void setFinancialMgmtElementValueList(List<ElementValue> financialMgmtElementValueList) {
        set(PROPERTY_FINANCIALMGMTELEMENTVALUELIST, financialMgmtElementValueList);
    }

}
