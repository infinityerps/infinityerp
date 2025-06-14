
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
package org.openbravo.model.manufacturing.quality;

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
 * Entity class for entity ManufacturingValue (stored in table MA_PC_Value).
 * <br>
 * Help: {@literal This tab registers the planned periodic control values.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Value extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_PC_Value";
    public static final String ENTITY_NAME = "ManufacturingValue";

    /**
     * Property id stored in column MA_Pc_Value_ID in table MA_PC_Value 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table MA_PC_Value 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table MA_PC_Value 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table MA_PC_Value 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table MA_PC_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table MA_PC_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table MA_PC_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table MA_PC_Value 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property periodicQualityControlCase stored in column MA_Pc_Case_ID in table MA_PC_Value<br>
     * Help: {@literal Identifies each instance of a periodic control.}
     * 
     */
    public static final String PROPERTY_PERIODICQUALITYCONTROLCASE = "periodicQualityControlCase";

    /**
     * Property periodicQualityControlTest stored in column MA_Pc_Test_ID in table MA_PC_Value<br>
     * Help: {@literal Identifies each test done in a periodic control.}
     * 
     */
    public static final String PROPERTY_PERIODICQUALITYCONTROLTEST = "periodicQualityControlTest";

    /**
     * Property testDate stored in column Datadate in table MA_PC_Value<br>
     * Help: {@literal Date when the data was taken.}
     * 
     */
    public static final String PROPERTY_TESTDATE = "testDate";

    /**
     * Property testResult stored in column TestResult in table MA_PC_Value<br>
     * Help: {@literal Description of the test results.}
     * 
     */
    public static final String PROPERTY_TESTRESULT = "testResult";


    public Value() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Value#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Value#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Value#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Value#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Value#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Value#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Value#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Value#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Value#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Value#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Value#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Value#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Value#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Value#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Value#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Value#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Value#PROPERTY_PERIODICQUALITYCONTROLCASE
     * 
     */
    public Case getPeriodicQualityControlCase() {
        return (Case) get(PROPERTY_PERIODICQUALITYCONTROLCASE);
    }
    /**
     * @see Value#PROPERTY_PERIODICQUALITYCONTROLCASE
     * 
     */
    public void setPeriodicQualityControlCase(Case periodicQualityControlCase) {
        set(PROPERTY_PERIODICQUALITYCONTROLCASE, periodicQualityControlCase);
    }

    /**
     * @see Value#PROPERTY_PERIODICQUALITYCONTROLTEST
     * 
     */
    public Test getPeriodicQualityControlTest() {
        return (Test) get(PROPERTY_PERIODICQUALITYCONTROLTEST);
    }
    /**
     * @see Value#PROPERTY_PERIODICQUALITYCONTROLTEST
     * 
     */
    public void setPeriodicQualityControlTest(Test periodicQualityControlTest) {
        set(PROPERTY_PERIODICQUALITYCONTROLTEST, periodicQualityControlTest);
    }

    /**
     * @see Value#PROPERTY_TESTDATE
     * 
     */
    public Date getTestDate() {
        return (Date) get(PROPERTY_TESTDATE);
    }
    /**
     * @see Value#PROPERTY_TESTDATE
     * 
     */
    public void setTestDate(Date testDate) {
        set(PROPERTY_TESTDATE, testDate);
    }

    /**
     * @see Value#PROPERTY_TESTRESULT
     * 
     */
    public String getTestResult() {
        return (String) get(PROPERTY_TESTRESULT);
    }
    /**
     * @see Value#PROPERTY_TESTRESULT
     * 
     */
    public void setTestResult(String testResult) {
        set(PROPERTY_TESTRESULT, testResult);
    }

}
