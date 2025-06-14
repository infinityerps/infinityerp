
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
 * Entity class for entity emex_reportcategory (stored in table emex_reportcategory).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MexdReportcategory extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "emex_reportcategory";
    public static final String ENTITY_NAME = "emex_reportcategory";

    /**
     * Property id stored in column Emex_Reportcategory_ID in table emex_reportcategory
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table emex_reportcategory 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table emex_reportcategory 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table emex_reportcategory 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table emex_reportcategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table emex_reportcategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table emex_reportcategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table emex_reportcategory 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sname stored in column Sname in table emex_reportcategory 
     * 
     */
    public static final String PROPERTY_SNAME = "sname";

    /**
     * Property emexReportConfigList stored in table emex_reportcategory
     * 
     */
    public static final String PROPERTY_EMEXREPORTCONFIGLIST = "emexReportConfigList";

    /**
     * Property emexReportaccessList stored in table emex_reportcategory
     * 
     */
    public static final String PROPERTY_EMEXREPORTACCESSLIST = "emexReportaccessList";

    /**
     * Property emexReportcategoryDetList stored in table emex_reportcategory
     * 
     */
    public static final String PROPERTY_EMEXREPORTCATEGORYDETLIST = "emexReportcategoryDetList";


    public MexdReportcategory() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_EMEXREPORTCONFIGLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EMEXREPORTACCESSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EMEXREPORTCATEGORYDETLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MexdReportcategory#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MexdReportcategory#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MexdReportcategory#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MexdReportcategory#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MexdReportcategory#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MexdReportcategory#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MexdReportcategory#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MexdReportcategory#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MexdReportcategory#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MexdReportcategory#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MexdReportcategory#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MexdReportcategory#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MexdReportcategory#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MexdReportcategory#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MexdReportcategory#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MexdReportcategory#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MexdReportcategory#PROPERTY_SNAME
     * 
     */
    public String getSname() {
        return (String) get(PROPERTY_SNAME);
    }
    /**
     * @see MexdReportcategory#PROPERTY_SNAME
     * 
     */
    public void setSname(String sname) {
        set(PROPERTY_SNAME, sname);
    }

    /**
     * @see MEXDReportConfig
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MEXDReportConfig> getEmexReportConfigList() {
      return (List<MEXDReportConfig>) get(PROPERTY_EMEXREPORTCONFIGLIST);
    }

    /**
     * @see MEXDReportConfig
     * 
     */
    public void setEmexReportConfigList(List<MEXDReportConfig> emexReportConfigList) {
        set(PROPERTY_EMEXREPORTCONFIGLIST, emexReportConfigList);
    }

    /**
     * @see MexdReportAccess
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MexdReportAccess> getEmexReportaccessList() {
      return (List<MexdReportAccess>) get(PROPERTY_EMEXREPORTACCESSLIST);
    }

    /**
     * @see MexdReportAccess
     * 
     */
    public void setEmexReportaccessList(List<MexdReportAccess> emexReportaccessList) {
        set(PROPERTY_EMEXREPORTACCESSLIST, emexReportaccessList);
    }

    /**
     * @see MexdReportcategoryDet
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MexdReportcategoryDet> getEmexReportcategoryDetList() {
      return (List<MexdReportcategoryDet>) get(PROPERTY_EMEXREPORTCATEGORYDETLIST);
    }

    /**
     * @see MexdReportcategoryDet
     * 
     */
    public void setEmexReportcategoryDetList(List<MexdReportcategoryDet> emexReportcategoryDetList) {
        set(PROPERTY_EMEXREPORTCATEGORYDETLIST, emexReportcategoryDetList);
    }

}
