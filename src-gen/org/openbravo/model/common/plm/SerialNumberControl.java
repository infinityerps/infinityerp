
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
package org.openbravo.model.common.plm;

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
 * Entity class for entity SerialNumberControl (stored in table M_SerNoCtl).
 * <br>
 * Help: {@literal Definition to create Serial numbers for Products}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class SerialNumberControl extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_SerNoCtl";
    public static final String ENTITY_NAME = "SerialNumberControl";

    /**
     * Property id stored in column M_SerNoCtl_ID in table M_SerNoCtl<br>
     * Help: {@literal Definition to create Serial numbers for Products}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_SerNoCtl 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_SerNoCtl 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_SerNoCtl 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_SerNoCtl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_SerNoCtl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_SerNoCtl 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_SerNoCtl<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property startingNo stored in column StartNo in table M_SerNoCtl<br>
     * Help: {@literal The Start Number indicates the starting position in the line or field number in the line}
     * 
     */
    public static final String PROPERTY_STARTINGNO = "startingNo";

    /**
     * Property incrementBy stored in column IncrementNo in table M_SerNoCtl<br>
     * Help: {@literal The Increment indicates the number to increment the last document number by to arrive at
     *       the next sequence number}
     * 
     */
    public static final String PROPERTY_INCREMENTBY = "incrementBy";

    /**
     * Property nextAssignedNumber stored in column CurrentNext in table M_SerNoCtl<br>
     * Help: {@literal The Current Next indicates the next number to use for this document}
     * 
     */
    public static final String PROPERTY_NEXTASSIGNEDNUMBER = "nextAssignedNumber";

    /**
     * Property prefix stored in column Prefix in table M_SerNoCtl<br>
     * Help: {@literal The Prefix indicates the characters to print in front of the document number.}
     * 
     */
    public static final String PROPERTY_PREFIX = "prefix";

    /**
     * Property suffix stored in column Suffix in table M_SerNoCtl<br>
     * Help: {@literal The Suffix indicates the characters to append to the document number.}
     * 
     */
    public static final String PROPERTY_SUFFIX = "suffix";

    /**
     * Property createdBy stored in column CreatedBy in table M_SerNoCtl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_SerNoCtl 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";


    public SerialNumberControl() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_STARTINGNO, (long) 100);
        setDefaultValue(PROPERTY_INCREMENTBY, (long) 1);
        setDefaultValue(PROPERTY_NEXTASSIGNEDNUMBER, (long) 100);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see SerialNumberControl#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see SerialNumberControl#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see SerialNumberControl#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see SerialNumberControl#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see SerialNumberControl#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see SerialNumberControl#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see SerialNumberControl#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see SerialNumberControl#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see SerialNumberControl#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see SerialNumberControl#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see SerialNumberControl#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see SerialNumberControl#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see SerialNumberControl#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see SerialNumberControl#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see SerialNumberControl#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see SerialNumberControl#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see SerialNumberControl#PROPERTY_STARTINGNO
     * 
     */
    public Long getStartingNo() {
        return (Long) get(PROPERTY_STARTINGNO);
    }
    /**
     * @see SerialNumberControl#PROPERTY_STARTINGNO
     * 
     */
    public void setStartingNo(Long startingNo) {
        set(PROPERTY_STARTINGNO, startingNo);
    }

    /**
     * @see SerialNumberControl#PROPERTY_INCREMENTBY
     * 
     */
    public Long getIncrementBy() {
        return (Long) get(PROPERTY_INCREMENTBY);
    }
    /**
     * @see SerialNumberControl#PROPERTY_INCREMENTBY
     * 
     */
    public void setIncrementBy(Long incrementBy) {
        set(PROPERTY_INCREMENTBY, incrementBy);
    }

    /**
     * @see SerialNumberControl#PROPERTY_NEXTASSIGNEDNUMBER
     * 
     */
    public Long getNextAssignedNumber() {
        return (Long) get(PROPERTY_NEXTASSIGNEDNUMBER);
    }
    /**
     * @see SerialNumberControl#PROPERTY_NEXTASSIGNEDNUMBER
     * 
     */
    public void setNextAssignedNumber(Long nextAssignedNumber) {
        set(PROPERTY_NEXTASSIGNEDNUMBER, nextAssignedNumber);
    }

    /**
     * @see SerialNumberControl#PROPERTY_PREFIX
     * 
     */
    public String getPrefix() {
        return (String) get(PROPERTY_PREFIX);
    }
    /**
     * @see SerialNumberControl#PROPERTY_PREFIX
     * 
     */
    public void setPrefix(String prefix) {
        set(PROPERTY_PREFIX, prefix);
    }

    /**
     * @see SerialNumberControl#PROPERTY_SUFFIX
     * 
     */
    public String getSuffix() {
        return (String) get(PROPERTY_SUFFIX);
    }
    /**
     * @see SerialNumberControl#PROPERTY_SUFFIX
     * 
     */
    public void setSuffix(String suffix) {
        set(PROPERTY_SUFFIX, suffix);
    }

    /**
     * @see SerialNumberControl#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see SerialNumberControl#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see SerialNumberControl#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see SerialNumberControl#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

}
