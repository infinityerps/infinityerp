
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

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity FinancialMgmtMatchingAlgorithm (stored in table FIN_Matching_Algorithm).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MatchingAlgorithm extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "FIN_Matching_Algorithm";
    public static final String ENTITY_NAME = "FinancialMgmtMatchingAlgorithm";

    /**
     * Property id stored in column FIN_Matching_Algorithm_ID in table FIN_Matching_Algorithm<br>
     * Help: {@literal Identifies the algorithm used to match the imported bank statement lines}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table FIN_Matching_Algorithm 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table FIN_Matching_Algorithm 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property creationDate stored in column Created in table FIN_Matching_Algorithm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table FIN_Matching_Algorithm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table FIN_Matching_Algorithm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table FIN_Matching_Algorithm 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property active stored in column Isactive in table FIN_Matching_Algorithm 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property name stored in column Name in table FIN_Matching_Algorithm 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table FIN_Matching_Algorithm<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property javaClassName stored in column Classname in table FIN_Matching_Algorithm<br>
     * Help: {@literal The classname is used when generating a representation of the table in java (the entity or
     *       business object). The classname is the simplename of the class (so without the package name). Often
     *       the AD_Table.name can be used here. The combination of classname and package needs to be unique.}
     * 
     */
    public static final String PROPERTY_JAVACLASSNAME = "javaClassName";

    /**
     * Property matchbpname stored in column Matchbpname in table FIN_Matching_Algorithm<br>
     * Help: {@literal The algorithm will try to match using busines partner name.}
     * 
     */
    public static final String PROPERTY_MATCHBPNAME = "matchbpname";

    /**
     * Property matchreference stored in column Matchreference in table FIN_Matching_Algorithm<br>
     * Help: {@literal The algorithm will try to match using reference.}
     * 
     */
    public static final String PROPERTY_MATCHREFERENCE = "matchreference";

    /**
     * Property matchtransactiondate stored in column Matchtransactiondate in table FIN_Matching_Algorithm<br>
     * Help: {@literal The algorithm will try to match using transaction date.}
     * 
     */
    public static final String PROPERTY_MATCHTRANSACTIONDATE = "matchtransactiondate";


    public MatchingAlgorithm() {
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MATCHBPNAME, true);
        setDefaultValue(PROPERTY_MATCHREFERENCE, true);
        setDefaultValue(PROPERTY_MATCHTRANSACTIONDATE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_JAVACLASSNAME
     * 
     */
    public String getJavaClassName() {
        return (String) get(PROPERTY_JAVACLASSNAME);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_JAVACLASSNAME
     * 
     */
    public void setJavaClassName(String javaClassName) {
        set(PROPERTY_JAVACLASSNAME, javaClassName);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_MATCHBPNAME
     * 
     */
    public Boolean isMatchbpname() {
        return (Boolean) get(PROPERTY_MATCHBPNAME);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_MATCHBPNAME
     * 
     */
    public void setMatchbpname(Boolean matchbpname) {
        set(PROPERTY_MATCHBPNAME, matchbpname);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_MATCHREFERENCE
     * 
     */
    public Boolean isMatchreference() {
        return (Boolean) get(PROPERTY_MATCHREFERENCE);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_MATCHREFERENCE
     * 
     */
    public void setMatchreference(Boolean matchreference) {
        set(PROPERTY_MATCHREFERENCE, matchreference);
    }

    /**
     * @see MatchingAlgorithm#PROPERTY_MATCHTRANSACTIONDATE
     * 
     */
    public Boolean isMatchtransactiondate() {
        return (Boolean) get(PROPERTY_MATCHTRANSACTIONDATE);
    }
    /**
     * @see MatchingAlgorithm#PROPERTY_MATCHTRANSACTIONDATE
     * 
     */
    public void setMatchtransactiondate(Boolean matchtransactiondate) {
        set(PROPERTY_MATCHTRANSACTIONDATE, matchtransactiondate);
    }

}
