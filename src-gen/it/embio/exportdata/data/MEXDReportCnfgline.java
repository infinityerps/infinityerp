
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
 * Entity class for entity emex_Reportcnfgline (stored in table emex_Reportcnfgline).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class MEXDReportCnfgline extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "emex_Reportcnfgline";
    public static final String ENTITY_NAME = "emex_Reportcnfgline";

    /**
     * Property id stored in column Emex_Reportcnfgline_ID in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table emex_Reportcnfgline 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table emex_Reportcnfgline 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table emex_Reportcnfgline 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table emex_Reportcnfgline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table emex_Reportcnfgline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table emex_Reportcnfgline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table emex_Reportcnfgline 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property emexReportconfig stored in column Emex_Reportconfig_ID in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_EMEXREPORTCONFIG = "emexReportconfig";

    /**
     * Property sinpname stored in column Sinpname in table emex_Reportcnfgline 
     * 
     */
    public static final String PROPERTY_SINPNAME = "sinpname";

    /**
     * Property scaption stored in column Scaption in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SCAPTION = "scaption";

    /**
     * Property squery stored in column Squery in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SQUERY = "squery";

    /**
     * Property scontroltype stored in column Scontroltype in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SCONTROLTYPE = "scontroltype";

    /**
     * Property sparavalue stored in column Sparavalue in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SPARAVALUE = "sparavalue";

    /**
     * Property ssize stored in column Ssize in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SSIZE = "ssize";

    /**
     * Property isrequired stored in column Isrequired in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_ISREQUIRED = "isrequired";

    /**
     * Property sdefaultvalue stored in column Sdefaultvalue in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SDEFAULTVALUE = "sdefaultvalue";

    /**
     * Property sdependentfield stored in column Sdependentfield in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SDEPENDENTFIELD = "sdependentfield";

    /**
     * Property sdependentquery stored in column Sdependentquery in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SDEPENDENTQUERY = "sdependentquery";

    /**
     * Property sdependfieldvalue stored in column Sdependfieldvalue in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SDEPENDFIELDVALUE = "sdependfieldvalue";

    /**
     * Property sdependlistfields stored in column Sdependlistfields in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_SDEPENDLISTFIELDS = "sdependlistfields";

    /**
     * Property lineno stored in column Lineno in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_LINENO = "lineno";

    /**
     * Property emexReportcnfglineSdependentfieldList stored in table emex_Reportcnfgline
     * 
     */
    public static final String PROPERTY_EMEXREPORTCNFGLINESDEPENDENTFIELDLIST = "emexReportcnfglineSdependentfieldList";


    public MEXDReportCnfgline() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISREQUIRED, true);
        setDefaultValue(PROPERTY_EMEXREPORTCNFGLINESDEPENDENTFIELDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_EMEXREPORTCONFIG
     * 
     */
    public MEXDReportConfig getEmexReportconfig() {
        return (MEXDReportConfig) get(PROPERTY_EMEXREPORTCONFIG);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_EMEXREPORTCONFIG
     * 
     */
    public void setEmexReportconfig(MEXDReportConfig emexReportconfig) {
        set(PROPERTY_EMEXREPORTCONFIG, emexReportconfig);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SINPNAME
     * 
     */
    public String getSinpname() {
        return (String) get(PROPERTY_SINPNAME);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SINPNAME
     * 
     */
    public void setSinpname(String sinpname) {
        set(PROPERTY_SINPNAME, sinpname);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SCAPTION
     * 
     */
    public String getScaption() {
        return (String) get(PROPERTY_SCAPTION);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SCAPTION
     * 
     */
    public void setScaption(String scaption) {
        set(PROPERTY_SCAPTION, scaption);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SQUERY
     * 
     */
    public String getSquery() {
        return (String) get(PROPERTY_SQUERY);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SQUERY
     * 
     */
    public void setSquery(String squery) {
        set(PROPERTY_SQUERY, squery);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SCONTROLTYPE
     * 
     */
    public String getScontroltype() {
        return (String) get(PROPERTY_SCONTROLTYPE);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SCONTROLTYPE
     * 
     */
    public void setScontroltype(String scontroltype) {
        set(PROPERTY_SCONTROLTYPE, scontroltype);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SPARAVALUE
     * 
     */
    public String getSparavalue() {
        return (String) get(PROPERTY_SPARAVALUE);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SPARAVALUE
     * 
     */
    public void setSparavalue(String sparavalue) {
        set(PROPERTY_SPARAVALUE, sparavalue);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SSIZE
     * 
     */
    public Long getSsize() {
        return (Long) get(PROPERTY_SSIZE);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SSIZE
     * 
     */
    public void setSsize(Long ssize) {
        set(PROPERTY_SSIZE, ssize);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_ISREQUIRED
     * 
     */
    public Boolean isRequired() {
        return (Boolean) get(PROPERTY_ISREQUIRED);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_ISREQUIRED
     * 
     */
    public void setRequired(Boolean isrequired) {
        set(PROPERTY_ISREQUIRED, isrequired);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEFAULTVALUE
     * 
     */
    public String getSdefaultvalue() {
        return (String) get(PROPERTY_SDEFAULTVALUE);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEFAULTVALUE
     * 
     */
    public void setSdefaultvalue(String sdefaultvalue) {
        set(PROPERTY_SDEFAULTVALUE, sdefaultvalue);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDENTFIELD
     * 
     */
    public MEXDReportCnfgline getSdependentfield() {
        return (MEXDReportCnfgline) get(PROPERTY_SDEPENDENTFIELD);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDENTFIELD
     * 
     */
    public void setSdependentfield(MEXDReportCnfgline sdependentfield) {
        set(PROPERTY_SDEPENDENTFIELD, sdependentfield);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDENTQUERY
     * 
     */
    public String getSdependentquery() {
        return (String) get(PROPERTY_SDEPENDENTQUERY);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDENTQUERY
     * 
     */
    public void setSdependentquery(String sdependentquery) {
        set(PROPERTY_SDEPENDENTQUERY, sdependentquery);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDFIELDVALUE
     * 
     */
    public String getSdependfieldvalue() {
        return (String) get(PROPERTY_SDEPENDFIELDVALUE);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDFIELDVALUE
     * 
     */
    public void setSdependfieldvalue(String sdependfieldvalue) {
        set(PROPERTY_SDEPENDFIELDVALUE, sdependfieldvalue);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDLISTFIELDS
     * 
     */
    public String getSdependlistfields() {
        return (String) get(PROPERTY_SDEPENDLISTFIELDS);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_SDEPENDLISTFIELDS
     * 
     */
    public void setSdependlistfields(String sdependlistfields) {
        set(PROPERTY_SDEPENDLISTFIELDS, sdependlistfields);
    }

    /**
     * @see MEXDReportCnfgline#PROPERTY_LINENO
     * 
     */
    public Long getLineno() {
        return (Long) get(PROPERTY_LINENO);
    }
    /**
     * @see MEXDReportCnfgline#PROPERTY_LINENO
     * 
     */
    public void setLineno(Long lineno) {
        set(PROPERTY_LINENO, lineno);
    }

    /**
     * @see MEXDReportCnfgline
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MEXDReportCnfgline> getEmexReportcnfglineSdependentfieldList() {
      return (List<MEXDReportCnfgline>) get(PROPERTY_EMEXREPORTCNFGLINESDEPENDENTFIELDLIST);
    }

    /**
     * @see MEXDReportCnfgline
     * 
     */
    public void setEmexReportcnfglineSdependentfieldList(List<MEXDReportCnfgline> emexReportcnfglineSdependentfieldList) {
        set(PROPERTY_EMEXREPORTCNFGLINESDEPENDENTFIELDLIST, emexReportcnfglineSdependentfieldList);
    }

}
