
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
package org.openbravo.model.financialmgmt.tax;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Sequence;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.gl.GLItem;
/**
 * Entity class for entity FinancialMgmtTaxRegisterType (stored in table C_TaxRegister_Type).
 * <br>
 * Help: {@literal Type of Tax Register}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TaxRegisterType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_TaxRegister_Type";
    public static final String ENTITY_NAME = "FinancialMgmtTaxRegisterType";

    /**
     * Property client stored in column AD_Client_ID in table C_TaxRegister_Type 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_TaxRegister_Type 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_TaxRegister_Type 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_TaxRegister_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table C_TaxRegister_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_TaxRegister_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table C_TaxRegister_Type 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property id stored in column C_Taxregister_Type_ID in table C_TaxRegister_Type<br>
     * Help: {@literal Type of Tax Register}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property registerName stored in column Registername in table C_TaxRegister_Type 
     * 
     */
    public static final String PROPERTY_REGISTERNAME = "registerName";

    /**
     * Property reportName stored in column Reportname in table C_TaxRegister_Type<br>
     * Help: {@literal Report name}
     * 
     */
    public static final String PROPERTY_REPORTNAME = "reportName";

    /**
     * Property description stored in column Description in table C_TaxRegister_Type<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property sequence stored in column AD_Sequence_ID in table C_TaxRegister_Type<br>
     * Help: {@literal The Sequence defines the numbering sequence to be used for documents.}
     * 
     */
    public static final String PROPERTY_SEQUENCE = "sequence";

    /**
     * Property helpComment stored in column Help in table C_TaxRegister_Type<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property gLItem stored in column C_Glitem_ID in table C_TaxRegister_Type<br>
     * Help: {@literal General ledger item.}
     * 
     */
    public static final String PROPERTY_GLITEM = "gLItem";

    /**
     * Property salesTransaction stored in column Issotrx in table C_TaxRegister_Type<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";


    public TaxRegisterType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_SALESTRANSACTION, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see TaxRegisterType#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see TaxRegisterType#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see TaxRegisterType#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see TaxRegisterType#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see TaxRegisterType#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see TaxRegisterType#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see TaxRegisterType#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see TaxRegisterType#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see TaxRegisterType#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see TaxRegisterType#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see TaxRegisterType#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see TaxRegisterType#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see TaxRegisterType#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see TaxRegisterType#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see TaxRegisterType#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see TaxRegisterType#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see TaxRegisterType#PROPERTY_REGISTERNAME
     * 
     */
    public String getRegisterName() {
        return (String) get(PROPERTY_REGISTERNAME);
    }
    /**
     * @see TaxRegisterType#PROPERTY_REGISTERNAME
     * 
     */
    public void setRegisterName(String registerName) {
        set(PROPERTY_REGISTERNAME, registerName);
    }

    /**
     * @see TaxRegisterType#PROPERTY_REPORTNAME
     * 
     */
    public String getReportName() {
        return (String) get(PROPERTY_REPORTNAME);
    }
    /**
     * @see TaxRegisterType#PROPERTY_REPORTNAME
     * 
     */
    public void setReportName(String reportName) {
        set(PROPERTY_REPORTNAME, reportName);
    }

    /**
     * @see TaxRegisterType#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see TaxRegisterType#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see TaxRegisterType#PROPERTY_SEQUENCE
     * 
     */
    public Sequence getSequence() {
        return (Sequence) get(PROPERTY_SEQUENCE);
    }
    /**
     * @see TaxRegisterType#PROPERTY_SEQUENCE
     * 
     */
    public void setSequence(Sequence sequence) {
        set(PROPERTY_SEQUENCE, sequence);
    }

    /**
     * @see TaxRegisterType#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see TaxRegisterType#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see TaxRegisterType#PROPERTY_GLITEM
     * 
     */
    public GLItem getGLItem() {
        return (GLItem) get(PROPERTY_GLITEM);
    }
    /**
     * @see TaxRegisterType#PROPERTY_GLITEM
     * 
     */
    public void setGLItem(GLItem gLItem) {
        set(PROPERTY_GLITEM, gLItem);
    }

    /**
     * @see TaxRegisterType#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see TaxRegisterType#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

}
