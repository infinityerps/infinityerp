
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
package org.openbravo.model.common.enterprise;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
/**
 * Entity class for entity DocumentTemplate (stored in table C_POC_DOCTYPE_TEMPLATE).
 * <br>
 * Help: {@literal C_POC_DOCTYPE_TEMPLATE}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class DocumentTemplate extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_POC_DOCTYPE_TEMPLATE";
    public static final String ENTITY_NAME = "DocumentTemplate";

    /**
     * Property id stored in column C_Poc_Doctype_Template_ID in table C_POC_DOCTYPE_TEMPLATE<br>
     * Help: {@literal Informs about the document type we are configuring}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_POC_DOCTYPE_TEMPLATE 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_POC_DOCTYPE_TEMPLATE 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table C_POC_DOCTYPE_TEMPLATE 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_POC_DOCTYPE_TEMPLATE 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_POC_DOCTYPE_TEMPLATE 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_POC_DOCTYPE_TEMPLATE 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_POC_DOCTYPE_TEMPLATE 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentType stored in column C_Doctype_ID in table C_POC_DOCTYPE_TEMPLATE<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property name stored in column Name in table C_POC_DOCTYPE_TEMPLATE 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property templateLocation stored in column Templatelocation in table C_POC_DOCTYPE_TEMPLATE<br>
     * Help: {@literal Set up the location of the jasper template in your system}
     * 
     */
    public static final String PROPERTY_TEMPLATELOCATION = "templateLocation";

    /**
     * Property reportFilename stored in column Reportfilename in table C_POC_DOCTYPE_TEMPLATE<br>
     * Help: {@literal Configure the name of the generated name. Set up a pattern and each time that this jasper
     *       template is used the patter will be used to generate the file name}
     * 
     */
    public static final String PROPERTY_REPORTFILENAME = "reportFilename";

    /**
     * Property templateFilename stored in column Templatefilename in table C_POC_DOCTYPE_TEMPLATE<br>
     * Help: {@literal Configure the name of the Jasper JRXML template}
     * 
     */
    public static final String PROPERTY_TEMPLATEFILENAME = "templateFilename";

    /**
     * Property showcompanydata stored in column Showcompanydata in table C_POC_DOCTYPE_TEMPLATE
     * 
     */
    public static final String PROPERTY_SHOWCOMPANYDATA = "showcompanydata";

    /**
     * Property showlogo stored in column Showlogo in table C_POC_DOCTYPE_TEMPLATE
     * 
     */
    public static final String PROPERTY_SHOWLOGO = "showlogo";

    /**
     * Property headermargin stored in column Headermargin in table C_POC_DOCTYPE_TEMPLATE
     * 
     */
    public static final String PROPERTY_HEADERMARGIN = "headermargin";

    /**
     * Property isdefault stored in column Isdefault in table C_POC_DOCTYPE_TEMPLATE<br>
     * Help: {@literal The Default Checkbox indicates if this record will be used as a default value.}
     * 
     */
    public static final String PROPERTY_ISDEFAULT = "isdefault";


    public DocumentTemplate() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SHOWCOMPANYDATA, true);
        setDefaultValue(PROPERTY_SHOWLOGO, true);
        setDefaultValue(PROPERTY_ISDEFAULT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see DocumentTemplate#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see DocumentTemplate#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see DocumentTemplate#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see DocumentTemplate#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see DocumentTemplate#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see DocumentTemplate#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see DocumentTemplate#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see DocumentTemplate#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see DocumentTemplate#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see DocumentTemplate#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see DocumentTemplate#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see DocumentTemplate#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see DocumentTemplate#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see DocumentTemplate#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see DocumentTemplate#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see DocumentTemplate#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see DocumentTemplate#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see DocumentTemplate#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see DocumentTemplate#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see DocumentTemplate#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see DocumentTemplate#PROPERTY_TEMPLATELOCATION
     * 
     */
    public String getTemplateLocation() {
        return (String) get(PROPERTY_TEMPLATELOCATION);
    }
    /**
     * @see DocumentTemplate#PROPERTY_TEMPLATELOCATION
     * 
     */
    public void setTemplateLocation(String templateLocation) {
        set(PROPERTY_TEMPLATELOCATION, templateLocation);
    }

    /**
     * @see DocumentTemplate#PROPERTY_REPORTFILENAME
     * 
     */
    public String getReportFilename() {
        return (String) get(PROPERTY_REPORTFILENAME);
    }
    /**
     * @see DocumentTemplate#PROPERTY_REPORTFILENAME
     * 
     */
    public void setReportFilename(String reportFilename) {
        set(PROPERTY_REPORTFILENAME, reportFilename);
    }

    /**
     * @see DocumentTemplate#PROPERTY_TEMPLATEFILENAME
     * 
     */
    public String getTemplateFilename() {
        return (String) get(PROPERTY_TEMPLATEFILENAME);
    }
    /**
     * @see DocumentTemplate#PROPERTY_TEMPLATEFILENAME
     * 
     */
    public void setTemplateFilename(String templateFilename) {
        set(PROPERTY_TEMPLATEFILENAME, templateFilename);
    }

    /**
     * @see DocumentTemplate#PROPERTY_SHOWCOMPANYDATA
     * 
     */
    public Boolean isShowcompanydata() {
        return (Boolean) get(PROPERTY_SHOWCOMPANYDATA);
    }
    /**
     * @see DocumentTemplate#PROPERTY_SHOWCOMPANYDATA
     * 
     */
    public void setShowcompanydata(Boolean showcompanydata) {
        set(PROPERTY_SHOWCOMPANYDATA, showcompanydata);
    }

    /**
     * @see DocumentTemplate#PROPERTY_SHOWLOGO
     * 
     */
    public Boolean isShowlogo() {
        return (Boolean) get(PROPERTY_SHOWLOGO);
    }
    /**
     * @see DocumentTemplate#PROPERTY_SHOWLOGO
     * 
     */
    public void setShowlogo(Boolean showlogo) {
        set(PROPERTY_SHOWLOGO, showlogo);
    }

    /**
     * @see DocumentTemplate#PROPERTY_HEADERMARGIN
     * 
     */
    public String getHeadermargin() {
        return (String) get(PROPERTY_HEADERMARGIN);
    }
    /**
     * @see DocumentTemplate#PROPERTY_HEADERMARGIN
     * 
     */
    public void setHeadermargin(String headermargin) {
        set(PROPERTY_HEADERMARGIN, headermargin);
    }

    /**
     * @see DocumentTemplate#PROPERTY_ISDEFAULT
     * 
     */
    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_ISDEFAULT);
    }
    /**
     * @see DocumentTemplate#PROPERTY_ISDEFAULT
     * 
     */
    public void setDefault(Boolean isdefault) {
        set(PROPERTY_ISDEFAULT, isdefault);
    }

}
