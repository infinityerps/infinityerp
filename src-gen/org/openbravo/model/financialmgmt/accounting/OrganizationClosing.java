
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
package org.openbravo.model.financialmgmt.accounting;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.OrganizationAcctSchema;
import org.openbravo.model.financialmgmt.calendar.Year;
/**
 * Entity class for entity OrganizationClosing (stored in table AD_Org_Closing).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrganizationClosing extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Org_Closing";
    public static final String ENTITY_NAME = "OrganizationClosing";

    /**
     * Property id stored in column AD_Org_Closing_ID in table AD_Org_Closing 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Org_Closing 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Org_Closing 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Org_Closing 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Org_Closing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Org_Closing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Org_Closing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Org_Closing 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property year stored in column C_Year_ID in table AD_Org_Closing<br>
     * Help: {@literal The Year uniquely identifies an accounting year for a calendar.}
     * 
     */
    public static final String PROPERTY_YEAR = "year";

    /**
     * Property orgAcctschema stored in column AD_Org_Acctschema_ID in table AD_Org_Closing<br>
     * Help: {@literal An organization can have one or more accounting schemas}
     * 
     */
    public static final String PROPERTY_ORGACCTSCHEMA = "orgAcctschema";

    /**
     * Property regularizationFactAcctGroup stored in column Reg_Fact_Acct_Group_ID in table AD_Org_Closing<br>
     * Help: {@literal Refers to the Fact_Acct_Group_ID of the regularization entry}
     * 
     */
    public static final String PROPERTY_REGULARIZATIONFACTACCTGROUP = "regularizationFactAcctGroup";

    /**
     * Property closingFactAcctGroup stored in column Close_Fact_Acct_Group_ID in table AD_Org_Closing<br>
     * Help: {@literal Refers to the Fact_Acct_Group_ID of the closing entry}
     * 
     */
    public static final String PROPERTY_CLOSINGFACTACCTGROUP = "closingFactAcctGroup";

    /**
     * Property divideupFactAcctGroup stored in column Divideup_Fact_Acct_Group_ID in table AD_Org_Closing<br>
     * Help: {@literal Refers to the Fact_Acct_Group_ID of the divide up entry}
     * 
     */
    public static final String PROPERTY_DIVIDEUPFACTACCTGROUP = "divideupFactAcctGroup";

    /**
     * Property openFactAcctGroup stored in column Open_Fact_Acct_Group_ID in table AD_Org_Closing<br>
     * Help: {@literal Refers to the Open_Fact_Acct_Group_ID of the open entry}
     * 
     */
    public static final String PROPERTY_OPENFACTACCTGROUP = "openFactAcctGroup";


    public OrganizationClosing() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OrganizationClosing#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OrganizationClosing#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OrganizationClosing#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OrganizationClosing#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OrganizationClosing#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OrganizationClosing#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see OrganizationClosing#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OrganizationClosing#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OrganizationClosing#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OrganizationClosing#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OrganizationClosing#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OrganizationClosing#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OrganizationClosing#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OrganizationClosing#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OrganizationClosing#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OrganizationClosing#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OrganizationClosing#PROPERTY_YEAR
     * 
     */
    public Year getYear() {
        return (Year) get(PROPERTY_YEAR);
    }
    /**
     * @see OrganizationClosing#PROPERTY_YEAR
     * 
     */
    public void setYear(Year year) {
        set(PROPERTY_YEAR, year);
    }

    /**
     * @see OrganizationClosing#PROPERTY_ORGACCTSCHEMA
     * 
     */
    public OrganizationAcctSchema getOrgAcctschema() {
        return (OrganizationAcctSchema) get(PROPERTY_ORGACCTSCHEMA);
    }
    /**
     * @see OrganizationClosing#PROPERTY_ORGACCTSCHEMA
     * 
     */
    public void setOrgAcctschema(OrganizationAcctSchema orgAcctschema) {
        set(PROPERTY_ORGACCTSCHEMA, orgAcctschema);
    }

    /**
     * @see OrganizationClosing#PROPERTY_REGULARIZATIONFACTACCTGROUP
     * 
     */
    public String getRegularizationFactAcctGroup() {
        return (String) get(PROPERTY_REGULARIZATIONFACTACCTGROUP);
    }
    /**
     * @see OrganizationClosing#PROPERTY_REGULARIZATIONFACTACCTGROUP
     * 
     */
    public void setRegularizationFactAcctGroup(String regularizationFactAcctGroup) {
        set(PROPERTY_REGULARIZATIONFACTACCTGROUP, regularizationFactAcctGroup);
    }

    /**
     * @see OrganizationClosing#PROPERTY_CLOSINGFACTACCTGROUP
     * 
     */
    public String getClosingFactAcctGroup() {
        return (String) get(PROPERTY_CLOSINGFACTACCTGROUP);
    }
    /**
     * @see OrganizationClosing#PROPERTY_CLOSINGFACTACCTGROUP
     * 
     */
    public void setClosingFactAcctGroup(String closingFactAcctGroup) {
        set(PROPERTY_CLOSINGFACTACCTGROUP, closingFactAcctGroup);
    }

    /**
     * @see OrganizationClosing#PROPERTY_DIVIDEUPFACTACCTGROUP
     * 
     */
    public String getDivideupFactAcctGroup() {
        return (String) get(PROPERTY_DIVIDEUPFACTACCTGROUP);
    }
    /**
     * @see OrganizationClosing#PROPERTY_DIVIDEUPFACTACCTGROUP
     * 
     */
    public void setDivideupFactAcctGroup(String divideupFactAcctGroup) {
        set(PROPERTY_DIVIDEUPFACTACCTGROUP, divideupFactAcctGroup);
    }

    /**
     * @see OrganizationClosing#PROPERTY_OPENFACTACCTGROUP
     * 
     */
    public String getOpenFactAcctGroup() {
        return (String) get(PROPERTY_OPENFACTACCTGROUP);
    }
    /**
     * @see OrganizationClosing#PROPERTY_OPENFACTACCTGROUP
     * 
     */
    public void setOpenFactAcctGroup(String openFactAcctGroup) {
        set(PROPERTY_OPENFACTACCTGROUP, openFactAcctGroup);
    }

}
