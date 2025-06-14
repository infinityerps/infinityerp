
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
package it.embio.exportdata.data;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity emex_reportaccess (stored in table emex_reportaccess).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MexdReportAccess extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "emex_reportaccess";
    public static final String ENTITY_NAME = "emex_reportaccess";

    /**
     * Property id stored in column Emex_Reportaccess_ID in table emex_reportaccess 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table emex_reportaccess 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table emex_reportaccess 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table emex_reportaccess 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table emex_reportaccess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table emex_reportaccess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table emex_reportaccess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table emex_reportaccess 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property emexReportconfig stored in column Emex_Reportconfig_ID in table emex_reportaccess
     * 
     */
    public static final String PROPERTY_EMEXREPORTCONFIG = "emexReportconfig";

    /**
     * Property role stored in column AD_Role_ID in table emex_reportaccess
     * 
     */
    public static final String PROPERTY_ROLE = "role";

    /**
     * Property emexReportcategory stored in column Emex_Reportcategory_ID in table emex_reportaccess
     * 
     */
    public static final String PROPERTY_EMEXREPORTCATEGORY = "emexReportcategory";

    /**
     * Property emexReportcategoryDet stored in column Emex_Reportcategory_Det_ID in table emex_reportaccess
     * 
     */
    public static final String PROPERTY_EMEXREPORTCATEGORYDET = "emexReportcategoryDet";


    public MexdReportAccess() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MexdReportAccess#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MexdReportAccess#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MexdReportAccess#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MexdReportAccess#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MexdReportAccess#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MexdReportAccess#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MexdReportAccess#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MexdReportAccess#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MexdReportAccess#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MexdReportAccess#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MexdReportAccess#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MexdReportAccess#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MexdReportAccess#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MexdReportAccess#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MexdReportAccess#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MexdReportAccess#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MexdReportAccess#PROPERTY_EMEXREPORTCONFIG
     * 
     */
    public MEXDReportConfig getEmexReportconfig() {
        return (MEXDReportConfig) get(PROPERTY_EMEXREPORTCONFIG);
    }
    /**
     * @see MexdReportAccess#PROPERTY_EMEXREPORTCONFIG
     * 
     */
    public void setEmexReportconfig(MEXDReportConfig emexReportconfig) {
        set(PROPERTY_EMEXREPORTCONFIG, emexReportconfig);
    }

    /**
     * @see MexdReportAccess#PROPERTY_ROLE
     * 
     */
    public Role getRole() {
        return (Role) get(PROPERTY_ROLE);
    }
    /**
     * @see MexdReportAccess#PROPERTY_ROLE
     * 
     */
    public void setRole(Role role) {
        set(PROPERTY_ROLE, role);
    }

    /**
     * @see MexdReportAccess#PROPERTY_EMEXREPORTCATEGORY
     * 
     */
    public MexdReportcategory getEmexReportcategory() {
        return (MexdReportcategory) get(PROPERTY_EMEXREPORTCATEGORY);
    }
    /**
     * @see MexdReportAccess#PROPERTY_EMEXREPORTCATEGORY
     * 
     */
    public void setEmexReportcategory(MexdReportcategory emexReportcategory) {
        set(PROPERTY_EMEXREPORTCATEGORY, emexReportcategory);
    }

    /**
     * @see MexdReportAccess#PROPERTY_EMEXREPORTCATEGORYDET
     * 
     */
    public MexdReportcategoryDet getEmexReportcategoryDet() {
        return (MexdReportcategoryDet) get(PROPERTY_EMEXREPORTCATEGORYDET);
    }
    /**
     * @see MexdReportAccess#PROPERTY_EMEXREPORTCATEGORYDET
     * 
     */
    public void setEmexReportcategoryDet(MexdReportcategoryDet emexReportcategoryDet) {
        set(PROPERTY_EMEXREPORTCATEGORYDET, emexReportcategoryDet);
    }

}
