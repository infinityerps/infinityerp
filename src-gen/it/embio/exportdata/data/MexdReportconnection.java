
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
 * Entity class for entity emex_reportconnection (stored in table emex_reportconnection).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MexdReportconnection extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "emex_reportconnection";
    public static final String ENTITY_NAME = "emex_reportconnection";

    /**
     * Property id stored in column Emex_Reportconnection_ID in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table emex_reportconnection 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table emex_reportconnection 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table emex_reportconnection 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table emex_reportconnection 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table emex_reportconnection 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table emex_reportconnection 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table emex_reportconnection 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property sname stored in column Sname in table emex_reportconnection 
     * 
     */
    public static final String PROPERTY_SNAME = "sname";

    /**
     * Property shost stored in column Shost in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_SHOST = "shost";

    /**
     * Property port stored in column Port in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_PORT = "port";

    /**
     * Property sdbname stored in column Sdbname in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_SDBNAME = "sdbname";

    /**
     * Property sdrivername stored in column Sdrivername in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_SDRIVERNAME = "sdrivername";

    /**
     * Property susername stored in column Susername in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_SUSERNAME = "susername";

    /**
     * Property spassword stored in column Spassword in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_SPASSWORD = "spassword";

    /**
     * Property emexReportConfigList stored in table emex_reportconnection
     * 
     */
    public static final String PROPERTY_EMEXREPORTCONFIGLIST = "emexReportConfigList";


    public MexdReportconnection() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SDRIVERNAME, "org.postgresql.Driver");
        setDefaultValue(PROPERTY_EMEXREPORTCONFIGLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MexdReportconnection#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MexdReportconnection#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MexdReportconnection#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MexdReportconnection#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MexdReportconnection#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MexdReportconnection#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MexdReportconnection#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MexdReportconnection#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MexdReportconnection#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MexdReportconnection#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MexdReportconnection#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MexdReportconnection#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MexdReportconnection#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MexdReportconnection#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MexdReportconnection#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MexdReportconnection#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MexdReportconnection#PROPERTY_SNAME
     * 
     */
    public String getSname() {
        return (String) get(PROPERTY_SNAME);
    }
    /**
     * @see MexdReportconnection#PROPERTY_SNAME
     * 
     */
    public void setSname(String sname) {
        set(PROPERTY_SNAME, sname);
    }

    /**
     * @see MexdReportconnection#PROPERTY_SHOST
     * 
     */
    public String getShost() {
        return (String) get(PROPERTY_SHOST);
    }
    /**
     * @see MexdReportconnection#PROPERTY_SHOST
     * 
     */
    public void setShost(String shost) {
        set(PROPERTY_SHOST, shost);
    }

    /**
     * @see MexdReportconnection#PROPERTY_PORT
     * 
     */
    public Long getPort() {
        return (Long) get(PROPERTY_PORT);
    }
    /**
     * @see MexdReportconnection#PROPERTY_PORT
     * 
     */
    public void setPort(Long port) {
        set(PROPERTY_PORT, port);
    }

    /**
     * @see MexdReportconnection#PROPERTY_SDBNAME
     * 
     */
    public String getSdbname() {
        return (String) get(PROPERTY_SDBNAME);
    }
    /**
     * @see MexdReportconnection#PROPERTY_SDBNAME
     * 
     */
    public void setSdbname(String sdbname) {
        set(PROPERTY_SDBNAME, sdbname);
    }

    /**
     * @see MexdReportconnection#PROPERTY_SDRIVERNAME
     * 
     */
    public String getSdrivername() {
        return (String) get(PROPERTY_SDRIVERNAME);
    }
    /**
     * @see MexdReportconnection#PROPERTY_SDRIVERNAME
     * 
     */
    public void setSdrivername(String sdrivername) {
        set(PROPERTY_SDRIVERNAME, sdrivername);
    }

    /**
     * @see MexdReportconnection#PROPERTY_SUSERNAME
     * 
     */
    public String getSusername() {
        return (String) get(PROPERTY_SUSERNAME);
    }
    /**
     * @see MexdReportconnection#PROPERTY_SUSERNAME
     * 
     */
    public void setSusername(String susername) {
        set(PROPERTY_SUSERNAME, susername);
    }

    /**
     * @see MexdReportconnection#PROPERTY_SPASSWORD
     * 
     */
    public String getSpassword() {
        return (String) get(PROPERTY_SPASSWORD);
    }
    /**
     * @see MexdReportconnection#PROPERTY_SPASSWORD
     * 
     */
    public void setSpassword(String spassword) {
        set(PROPERTY_SPASSWORD, spassword);
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

}
