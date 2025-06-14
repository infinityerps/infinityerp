
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
package org.openbravo.model.sales;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
/**
 * Entity class for entity SalesCommissionRun (stored in table C_CommissionRun).
 * <br>
 * Help: {@literal Contains all the commission run for a period}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CommissionRun extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_CommissionRun";
    public static final String ENTITY_NAME = "SalesCommissionRun";

    /**
     * Property id stored in column C_CommissionRun_ID in table C_CommissionRun<br>
     * Help: {@literal The Commission Run is a unique system defined identifier of a specific run of commission. 
     *       When a Commission is processed on the Commission Screen, the Commission Run ID will display.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table C_CommissionRun 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table C_CommissionRun 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table C_CommissionRun 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table C_CommissionRun 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table C_CommissionRun 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table C_CommissionRun 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table C_CommissionRun 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentNo stored in column DocumentNo in table C_CommissionRun 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property description stored in column Description in table C_CommissionRun<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property commission stored in column C_Commission_ID in table C_CommissionRun<br>
     * Help: {@literal The Commission ID is a unique identifier of a set of commission rules.}
     * 
     */
    public static final String PROPERTY_COMMISSION = "commission";

    /**
     * Property startingDate stored in column StartDate in table C_CommissionRun<br>
     * Help: {@literal A parameter stating when a specified request will begin.}
     * 
     */
    public static final String PROPERTY_STARTINGDATE = "startingDate";

    /**
     * Property grandTotalAmount stored in column GrandTotal in table C_CommissionRun<br>
     * Help: {@literal The Total Amount indicates the total document amount.}
     * 
     */
    public static final String PROPERTY_GRANDTOTALAMOUNT = "grandTotalAmount";

    /**
     * Property processNow stored in column Processing in table C_CommissionRun<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property processed stored in column Processed in table C_CommissionRun<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property invoice stored in column C_Invoice_ID in table C_CommissionRun<br>
     * Help: {@literal The Invoice ID uniquely identifies an Invoice Document.}
     * 
     */
    public static final String PROPERTY_INVOICE = "invoice";


    public CommissionRun() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PROCESSED, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CommissionRun#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CommissionRun#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CommissionRun#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CommissionRun#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CommissionRun#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CommissionRun#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CommissionRun#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CommissionRun#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CommissionRun#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CommissionRun#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CommissionRun#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CommissionRun#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CommissionRun#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CommissionRun#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CommissionRun#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CommissionRun#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CommissionRun#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see CommissionRun#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see CommissionRun#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see CommissionRun#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see CommissionRun#PROPERTY_COMMISSION
     * 
     */
    public Commission getCommission() {
        return (Commission) get(PROPERTY_COMMISSION);
    }
    /**
     * @see CommissionRun#PROPERTY_COMMISSION
     * 
     */
    public void setCommission(Commission commission) {
        set(PROPERTY_COMMISSION, commission);
    }

    /**
     * @see CommissionRun#PROPERTY_STARTINGDATE
     * 
     */
    public Date getStartingDate() {
        return (Date) get(PROPERTY_STARTINGDATE);
    }
    /**
     * @see CommissionRun#PROPERTY_STARTINGDATE
     * 
     */
    public void setStartingDate(Date startingDate) {
        set(PROPERTY_STARTINGDATE, startingDate);
    }

    /**
     * @see CommissionRun#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public BigDecimal getGrandTotalAmount() {
        return (BigDecimal) get(PROPERTY_GRANDTOTALAMOUNT);
    }
    /**
     * @see CommissionRun#PROPERTY_GRANDTOTALAMOUNT
     * 
     */
    public void setGrandTotalAmount(BigDecimal grandTotalAmount) {
        set(PROPERTY_GRANDTOTALAMOUNT, grandTotalAmount);
    }

    /**
     * @see CommissionRun#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see CommissionRun#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see CommissionRun#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see CommissionRun#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see CommissionRun#PROPERTY_INVOICE
     * 
     */
    public Invoice getInvoice() {
        return (Invoice) get(PROPERTY_INVOICE);
    }
    /**
     * @see CommissionRun#PROPERTY_INVOICE
     * 
     */
    public void setInvoice(Invoice invoice) {
        set(PROPERTY_INVOICE, invoice);
    }

}
