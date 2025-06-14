
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
package org.openbravo.model.common.enterprise;

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
import org.openbravo.model.ad.utility.Sequence;
import org.openbravo.model.financialmgmt.accounting.OrganizationClosing;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
/**
 * Entity class for entity OrganizationAcctSchema (stored in table AD_Org_AcctSchema).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrganizationAcctSchema extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Org_AcctSchema";
    public static final String ENTITY_NAME = "OrganizationAcctSchema";

    /**
     * Property id stored in column AD_Org_Acctschema_ID in table AD_Org_AcctSchema<br>
     * Help: {@literal An organization can have one or more accounting schemas}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Org_AcctSchema 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Org_AcctSchema 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Org_AcctSchema 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Org_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Org_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Org_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Org_AcctSchema 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property accountingSchema stored in column C_Acctschema_ID in table AD_Org_AcctSchema<br>
     * Help: {@literal The book containing all financial transactions recorded for the legal entity.}
     * 
     */
    public static final String PROPERTY_ACCOUNTINGSCHEMA = "accountingSchema";

    /**
     * Property createNewAccountForBusinessParnter stored in column IsBpNewAccount in table AD_Org_AcctSchema<br>
     * Help: {@literal This flag is used to intimating the system for create the new sub-account for Business
     *       Partner.}
     * 
     */
    public static final String PROPERTY_CREATENEWACCOUNTFORBUSINESSPARNTER = "createNewAccountForBusinessParnter";

    /**
     * Property sequanceForBusinessPartner stored in column AD_Sequence_Bp_ID in table AD_Org_AcctSchema<br>
     * Help: {@literal The sequence will be used to generate number for creating the sub-account for Business
     *       Partner.}
     * 
     */
    public static final String PROPERTY_SEQUANCEFORBUSINESSPARTNER = "sequanceForBusinessPartner";

    /**
     * Property createNewAcountForProduct stored in column IsPrNewAccount in table AD_Org_AcctSchema<br>
     * Help: {@literal This flag is used to intimating the system for create the new sub-account for Product.}
     * 
     */
    public static final String PROPERTY_CREATENEWACOUNTFORPRODUCT = "createNewAcountForProduct";

    /**
     * Property sequenceForProduct stored in column AD_Sequence_Pr_ID in table AD_Org_AcctSchema<br>
     * Help: {@literal The sequence will be used to generate number for creating the sub-account for Product.}
     * 
     */
    public static final String PROPERTY_SEQUENCEFORPRODUCT = "sequenceForProduct";

    /**
     * Property accountLength stored in column Acct_Length in table AD_Org_AcctSchema<br>
     * Help: {@literal This field indicates length of the account number.}
     * 
     */
    public static final String PROPERTY_ACCOUNTLENGTH = "accountLength";

    /**
     * Property subAccountLength stored in column SubAcct_Length in table AD_Org_AcctSchema<br>
     * Help: {@literal This field indicates length of the sub-account number.}
     * 
     */
    public static final String PROPERTY_SUBACCOUNTLENGTH = "subAccountLength";

    /**
     * Property organizationClosingList stored in table AD_Org_AcctSchema
     * 
     */
    public static final String PROPERTY_ORGANIZATIONCLOSINGLIST = "organizationClosingList";


    public OrganizationAcctSchema() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_CREATENEWACCOUNTFORBUSINESSPARNTER, false);
        setDefaultValue(PROPERTY_CREATENEWACOUNTFORPRODUCT, false);
        setDefaultValue(PROPERTY_ORGANIZATIONCLOSINGLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public AcctSchema getAccountingSchema() {
        return (AcctSchema) get(PROPERTY_ACCOUNTINGSCHEMA);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_ACCOUNTINGSCHEMA
     * 
     */
    public void setAccountingSchema(AcctSchema accountingSchema) {
        set(PROPERTY_ACCOUNTINGSCHEMA, accountingSchema);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATENEWACCOUNTFORBUSINESSPARNTER
     * 
     */
    public Boolean isCreateNewAccountForBusinessParnter() {
        return (Boolean) get(PROPERTY_CREATENEWACCOUNTFORBUSINESSPARNTER);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATENEWACCOUNTFORBUSINESSPARNTER
     * 
     */
    public void setCreateNewAccountForBusinessParnter(Boolean createNewAccountForBusinessParnter) {
        set(PROPERTY_CREATENEWACCOUNTFORBUSINESSPARNTER, createNewAccountForBusinessParnter);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_SEQUANCEFORBUSINESSPARTNER
     * 
     */
    public Sequence getSequanceForBusinessPartner() {
        return (Sequence) get(PROPERTY_SEQUANCEFORBUSINESSPARTNER);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_SEQUANCEFORBUSINESSPARTNER
     * 
     */
    public void setSequanceForBusinessPartner(Sequence sequanceForBusinessPartner) {
        set(PROPERTY_SEQUANCEFORBUSINESSPARTNER, sequanceForBusinessPartner);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATENEWACOUNTFORPRODUCT
     * 
     */
    public Boolean isCreateNewAcountForProduct() {
        return (Boolean) get(PROPERTY_CREATENEWACOUNTFORPRODUCT);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_CREATENEWACOUNTFORPRODUCT
     * 
     */
    public void setCreateNewAcountForProduct(Boolean createNewAcountForProduct) {
        set(PROPERTY_CREATENEWACOUNTFORPRODUCT, createNewAcountForProduct);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_SEQUENCEFORPRODUCT
     * 
     */
    public Sequence getSequenceForProduct() {
        return (Sequence) get(PROPERTY_SEQUENCEFORPRODUCT);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_SEQUENCEFORPRODUCT
     * 
     */
    public void setSequenceForProduct(Sequence sequenceForProduct) {
        set(PROPERTY_SEQUENCEFORPRODUCT, sequenceForProduct);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_ACCOUNTLENGTH
     * 
     */
    public Long getAccountLength() {
        return (Long) get(PROPERTY_ACCOUNTLENGTH);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_ACCOUNTLENGTH
     * 
     */
    public void setAccountLength(Long accountLength) {
        set(PROPERTY_ACCOUNTLENGTH, accountLength);
    }

    /**
     * @see OrganizationAcctSchema#PROPERTY_SUBACCOUNTLENGTH
     * 
     */
    public Long getSubAccountLength() {
        return (Long) get(PROPERTY_SUBACCOUNTLENGTH);
    }
    /**
     * @see OrganizationAcctSchema#PROPERTY_SUBACCOUNTLENGTH
     * 
     */
    public void setSubAccountLength(Long subAccountLength) {
        set(PROPERTY_SUBACCOUNTLENGTH, subAccountLength);
    }

    /**
     * @see OrganizationClosing
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrganizationClosing> getOrganizationClosingList() {
      return (List<OrganizationClosing>) get(PROPERTY_ORGANIZATIONCLOSINGLIST);
    }

    /**
     * @see OrganizationClosing
     * 
     */
    public void setOrganizationClosingList(List<OrganizationClosing> organizationClosingList) {
        set(PROPERTY_ORGANIZATIONCLOSINGLIST, organizationClosingList);
    }

}
