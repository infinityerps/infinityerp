
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
package org.openbravo.client.application;

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
 * Entity class for entity OBUIAPP_Report (stored in table OBUIAPP_Report).
 * <br>
 * Help: {@literal Contains the information to build a Report using JR Templates.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ReportDefinition extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_Report";
    public static final String ENTITY_NAME = "OBUIAPP_Report";

    /**
     * Property id stored in column Obuiapp_Report_ID in table OBUIAPP_Report 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table OBUIAPP_Report 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table OBUIAPP_Report 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table OBUIAPP_Report 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table OBUIAPP_Report 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table OBUIAPP_Report 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table OBUIAPP_Report 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table OBUIAPP_Report 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property processDefintion stored in column Obuiapp_Process_ID in table OBUIAPP_Report<br>
     * Help: {@literal Process Defintion is a re implementation of Process with 3.0 infrastructure.}
     * 
     */
    public static final String PROPERTY_PROCESSDEFINTION = "processDefintion";

    /**
     * Property pDFTemplate stored in column PDF_Template in table OBUIAPP_Report 
     * 
     */
    public static final String PROPERTY_PDFTEMPLATE = "pDFTemplate";

    /**
     * Property xLSTemplate stored in column XLS_Template in table OBUIAPP_Report<br>
     * Help: {@literal JRXML template to export to Excel the report when a specific template is required for
     *       excel}
     * 
     */
    public static final String PROPERTY_XLSTEMPLATE = "xLSTemplate";

    /**
     * Property usePDFAsXLSTemplate stored in column USE_Pdf_As_Xls_Template in table OBUIAPP_Report<br>
     * Help: {@literal Determines whether the PDF Template needs to be used to generate the Excel report instead
     *       of defining a specific template for it.}
     * 
     */
    public static final String PROPERTY_USEPDFASXLSTEMPLATE = "usePDFAsXLSTemplate";

    /**
     * Property hTMLTemplate stored in column HTML_Template in table OBUIAPP_Report<br>
     * Help: {@literal JRXML template to use for exporting the report to HTML format}
     * 
     */
    public static final String PROPERTY_HTMLTEMPLATE = "hTMLTemplate";

    /**
     * Property usePDFAsHTMLTemplate stored in column USE_Pdf_As_Html_Template in table OBUIAPP_Report<br>
     * Help: {@literal Determines whether the PDF Template needs to be used to generate the HTML report instead
     *       of defining a specific template for it.}
     * 
     */
    public static final String PROPERTY_USEPDFASHTMLTEMPLATE = "usePDFAsHTMLTemplate";


    public ReportDefinition() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_USEPDFASXLSTEMPLATE, false);
        setDefaultValue(PROPERTY_USEPDFASHTMLTEMPLATE, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ReportDefinition#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ReportDefinition#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ReportDefinition#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ReportDefinition#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ReportDefinition#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ReportDefinition#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ReportDefinition#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ReportDefinition#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ReportDefinition#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ReportDefinition#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ReportDefinition#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ReportDefinition#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ReportDefinition#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ReportDefinition#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ReportDefinition#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ReportDefinition#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ReportDefinition#PROPERTY_PROCESSDEFINTION
     * 
     */
    public Process getProcessDefintion() {
        return (Process) get(PROPERTY_PROCESSDEFINTION);
    }
    /**
     * @see ReportDefinition#PROPERTY_PROCESSDEFINTION
     * 
     */
    public void setProcessDefintion(Process processDefintion) {
        set(PROPERTY_PROCESSDEFINTION, processDefintion);
    }

    /**
     * @see ReportDefinition#PROPERTY_PDFTEMPLATE
     * 
     */
    public String getPDFTemplate() {
        return (String) get(PROPERTY_PDFTEMPLATE);
    }
    /**
     * @see ReportDefinition#PROPERTY_PDFTEMPLATE
     * 
     */
    public void setPDFTemplate(String pDFTemplate) {
        set(PROPERTY_PDFTEMPLATE, pDFTemplate);
    }

    /**
     * @see ReportDefinition#PROPERTY_XLSTEMPLATE
     * 
     */
    public String getXLSTemplate() {
        return (String) get(PROPERTY_XLSTEMPLATE);
    }
    /**
     * @see ReportDefinition#PROPERTY_XLSTEMPLATE
     * 
     */
    public void setXLSTemplate(String xLSTemplate) {
        set(PROPERTY_XLSTEMPLATE, xLSTemplate);
    }

    /**
     * @see ReportDefinition#PROPERTY_USEPDFASXLSTEMPLATE
     * 
     */
    public Boolean isUsePDFAsXLSTemplate() {
        return (Boolean) get(PROPERTY_USEPDFASXLSTEMPLATE);
    }
    /**
     * @see ReportDefinition#PROPERTY_USEPDFASXLSTEMPLATE
     * 
     */
    public void setUsePDFAsXLSTemplate(Boolean usePDFAsXLSTemplate) {
        set(PROPERTY_USEPDFASXLSTEMPLATE, usePDFAsXLSTemplate);
    }

    /**
     * @see ReportDefinition#PROPERTY_HTMLTEMPLATE
     * 
     */
    public String getHTMLTemplate() {
        return (String) get(PROPERTY_HTMLTEMPLATE);
    }
    /**
     * @see ReportDefinition#PROPERTY_HTMLTEMPLATE
     * 
     */
    public void setHTMLTemplate(String hTMLTemplate) {
        set(PROPERTY_HTMLTEMPLATE, hTMLTemplate);
    }

    /**
     * @see ReportDefinition#PROPERTY_USEPDFASHTMLTEMPLATE
     * 
     */
    public Boolean isUsePDFAsHTMLTemplate() {
        return (Boolean) get(PROPERTY_USEPDFASHTMLTEMPLATE);
    }
    /**
     * @see ReportDefinition#PROPERTY_USEPDFASHTMLTEMPLATE
     * 
     */
    public void setUsePDFAsHTMLTemplate(Boolean usePDFAsHTMLTemplate) {
        set(PROPERTY_USEPDFASHTMLTEMPLATE, usePDFAsHTMLTemplate);
    }

}
