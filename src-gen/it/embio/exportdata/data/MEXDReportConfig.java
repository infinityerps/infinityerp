
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
 * Entity class for entity emex_ReportConfig (stored in table emex_ReportConfig).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MEXDReportConfig extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "emex_ReportConfig";
    public static final String ENTITY_NAME = "emex_ReportConfig";

    /**
     * Property id stored in column Emex_Reportconfig_ID in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table emex_ReportConfig 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table emex_ReportConfig 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table emex_ReportConfig 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table emex_ReportConfig 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table emex_ReportConfig 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table emex_ReportConfig 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table emex_ReportConfig 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sname stored in column Sname in table emex_ReportConfig 
     * 
     */
    public static final String PROPERTY_SNAME = "sname";

    /**
     * Property squery stored in column Squery in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_SQUERY = "squery";

    /**
     * Property emexReportcategory stored in column Emex_Reportcategory_ID in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_EMEXREPORTCATEGORY = "emexReportcategory";

    /**
     * Property emexReportcategoryDet stored in column Emex_Reportcategory_Det_ID in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_EMEXREPORTCATEGORYDET = "emexReportcategoryDet";

    /**
     * Property emexReportconnection stored in column Emex_Reportconnection_ID in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_EMEXREPORTCONNECTION = "emexReportconnection";

    /**
     * Property isjasper stored in column Isjasper in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_ISJASPER = "isjasper";

    /**
     * Property jrname stored in column Jrname in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_JRNAME = "jrname";

    /**
     * Property emexReportcnfglineList stored in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_EMEXREPORTCNFGLINELIST = "emexReportcnfglineList";

    /**
     * Property emexReportaccessList stored in table emex_ReportConfig
     * 
     */
    public static final String PROPERTY_EMEXREPORTACCESSLIST = "emexReportaccessList";


    public MEXDReportConfig() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISJASPER, false);
        setDefaultValue(PROPERTY_EMEXREPORTCNFGLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_EMEXREPORTACCESSLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MEXDReportConfig#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_SNAME
     * 
     */
    public String getSname() {
        return (String) get(PROPERTY_SNAME);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_SNAME
     * 
     */
    public void setSname(String sname) {
        set(PROPERTY_SNAME, sname);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_SQUERY
     * 
     */
    public String getSquery() {
        return (String) get(PROPERTY_SQUERY);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_SQUERY
     * 
     */
    public void setSquery(String squery) {
        set(PROPERTY_SQUERY, squery);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_EMEXREPORTCATEGORY
     * 
     */
    public MexdReportcategory getEmexReportcategory() {
        return (MexdReportcategory) get(PROPERTY_EMEXREPORTCATEGORY);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_EMEXREPORTCATEGORY
     * 
     */
    public void setEmexReportcategory(MexdReportcategory emexReportcategory) {
        set(PROPERTY_EMEXREPORTCATEGORY, emexReportcategory);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_EMEXREPORTCATEGORYDET
     * 
     */
    public MexdReportcategoryDet getEmexReportcategoryDet() {
        return (MexdReportcategoryDet) get(PROPERTY_EMEXREPORTCATEGORYDET);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_EMEXREPORTCATEGORYDET
     * 
     */
    public void setEmexReportcategoryDet(MexdReportcategoryDet emexReportcategoryDet) {
        set(PROPERTY_EMEXREPORTCATEGORYDET, emexReportcategoryDet);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_EMEXREPORTCONNECTION
     * 
     */
    public MexdReportconnection getEmexReportconnection() {
        return (MexdReportconnection) get(PROPERTY_EMEXREPORTCONNECTION);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_EMEXREPORTCONNECTION
     * 
     */
    public void setEmexReportconnection(MexdReportconnection emexReportconnection) {
        set(PROPERTY_EMEXREPORTCONNECTION, emexReportconnection);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_ISJASPER
     * 
     */
    public Boolean isJasper() {
        return (Boolean) get(PROPERTY_ISJASPER);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_ISJASPER
     * 
     */
    public void setJasper(Boolean isjasper) {
        set(PROPERTY_ISJASPER, isjasper);
    }

    /**
     * @see MEXDReportConfig#PROPERTY_JRNAME
     * 
     */
    public String getJrname() {
        return (String) get(PROPERTY_JRNAME);
    }
    /**
     * @see MEXDReportConfig#PROPERTY_JRNAME
     * 
     */
    public void setJrname(String jrname) {
        set(PROPERTY_JRNAME, jrname);
    }

    /**
     * @see MEXDReportCnfgline
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MEXDReportCnfgline> getEmexReportcnfglineList() {
      return (List<MEXDReportCnfgline>) get(PROPERTY_EMEXREPORTCNFGLINELIST);
    }

    /**
     * @see MEXDReportCnfgline
     * 
     */
    public void setEmexReportcnfglineList(List<MEXDReportCnfgline> emexReportcnfglineList) {
        set(PROPERTY_EMEXREPORTCNFGLINELIST, emexReportcnfglineList);
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

}
