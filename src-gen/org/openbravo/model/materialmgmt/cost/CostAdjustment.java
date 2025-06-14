
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
package org.openbravo.model.materialmgmt.cost;

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
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity CostAdjustment (stored in table M_CostAdjustment).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CostAdjustment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_CostAdjustment";
    public static final String ENTITY_NAME = "CostAdjustment";

    /**
     * Property id stored in column M_CostAdjustment_ID in table M_CostAdjustment<br>
     * Help: {@literal Represents a Cost Adjustment header where costs of some transactions are adjusted.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_CostAdjustment 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_CostAdjustment 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_CostAdjustment 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_CostAdjustment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_CostAdjustment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_CostAdjustment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_CostAdjustment 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property documentType stored in column C_Doctype_ID in table M_CostAdjustment<br>
     * Help: {@literal The Document Type determines document sequence and processing rules}
     * 
     */
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";

    /**
     * Property documentNo stored in column Documentno in table M_CostAdjustment 
     * 
     */
    public static final String PROPERTY_DOCUMENTNO = "documentNo";

    /**
     * Property referenceDate stored in column ReferenceDate in table M_CostAdjustment 
     * 
     */
    public static final String PROPERTY_REFERENCEDATE = "referenceDate";

    /**
     * Property sourceProcess stored in column Source_Process in table M_CostAdjustment<br>
     * Help: {@literal Identifies the Process type that generated the Cost Adjustment}
     * 
     */
    public static final String PROPERTY_SOURCEPROCESS = "sourceProcess";

    /**
     * Property processed stored in column Processed in table M_CostAdjustment<br>
     * Help: {@literal The Processed checkbox indicates that a document has been processed.}
     * 
     */
    public static final String PROPERTY_PROCESSED = "processed";

    /**
     * Property process stored in column Process in table M_CostAdjustment
     * 
     */
    public static final String PROPERTY_PROCESS = "process";

    /**
     * Property documentStatus stored in column Docstatus in table M_CostAdjustment<br>
     * Help: {@literal The Document Status indicates the status of a document at this time.  To change the status
     *       of a document, use one of the buttons usually located at the bottom of the document window.}
     * 
     */
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";

    /**
     * Property cancelProcess stored in column Cancel in table M_CostAdjustment<br>
     * Help: {@literal Cancel Cost Adjustment}
     * 
     */
    public static final String PROPERTY_CANCELPROCESS = "cancelProcess";

    /**
     * Property costAdjustmentCancel stored in column M_Costadjustment_Cancel in table M_CostAdjustment<br>
     * Help: {@literal Identifies the Cost Adjustment created to cancel this Cost Adjustment}
     * 
     */
    public static final String PROPERTY_COSTADJUSTMENTCANCEL = "costAdjustmentCancel";

    /**
     * Property posted stored in column Posted in table M_CostAdjustment<br>
     * Help: {@literal An accounting status button that indicates if the transaction has already been posted to
     *       the general ledger or not. When doing the accounting manually this button can be used to post or
     *       unpost the transaction from the general ledger by hand.}
     * 
     */
    public static final String PROPERTY_POSTED = "posted";

    /**
     * Property processNow stored in column Processing in table M_CostAdjustment<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property costAdjustmentLineList stored in table M_CostAdjustment
     * 
     */
    public static final String PROPERTY_COSTADJUSTMENTLINELIST = "costAdjustmentLineList";


    public CostAdjustment() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PROCESS, false);
        setDefaultValue(PROPERTY_DOCUMENTSTATUS, "DR");
        setDefaultValue(PROPERTY_CANCELPROCESS, false);
        setDefaultValue(PROPERTY_POSTED, "N");
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_COSTADJUSTMENTLINELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see CostAdjustment#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see CostAdjustment#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see CostAdjustment#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see CostAdjustment#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see CostAdjustment#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see CostAdjustment#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see CostAdjustment#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see CostAdjustment#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see CostAdjustment#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see CostAdjustment#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see CostAdjustment#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see CostAdjustment#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see CostAdjustment#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see CostAdjustment#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see CostAdjustment#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see CostAdjustment#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see CostAdjustment#PROPERTY_DOCUMENTTYPE
     * 
     */
    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }
    /**
     * @see CostAdjustment#PROPERTY_DOCUMENTTYPE
     * 
     */
    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    /**
     * @see CostAdjustment#PROPERTY_DOCUMENTNO
     * 
     */
    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }
    /**
     * @see CostAdjustment#PROPERTY_DOCUMENTNO
     * 
     */
    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    /**
     * @see CostAdjustment#PROPERTY_REFERENCEDATE
     * 
     */
    public Date getReferenceDate() {
        return (Date) get(PROPERTY_REFERENCEDATE);
    }
    /**
     * @see CostAdjustment#PROPERTY_REFERENCEDATE
     * 
     */
    public void setReferenceDate(Date referenceDate) {
        set(PROPERTY_REFERENCEDATE, referenceDate);
    }

    /**
     * @see CostAdjustment#PROPERTY_SOURCEPROCESS
     * 
     */
    public String getSourceProcess() {
        return (String) get(PROPERTY_SOURCEPROCESS);
    }
    /**
     * @see CostAdjustment#PROPERTY_SOURCEPROCESS
     * 
     */
    public void setSourceProcess(String sourceProcess) {
        set(PROPERTY_SOURCEPROCESS, sourceProcess);
    }

    /**
     * @see CostAdjustment#PROPERTY_PROCESSED
     * 
     */
    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }
    /**
     * @see CostAdjustment#PROPERTY_PROCESSED
     * 
     */
    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    /**
     * @see CostAdjustment#PROPERTY_PROCESS
     * 
     */
    public Boolean isProcess() {
        return (Boolean) get(PROPERTY_PROCESS);
    }
    /**
     * @see CostAdjustment#PROPERTY_PROCESS
     * 
     */
    public void setProcess(Boolean process) {
        set(PROPERTY_PROCESS, process);
    }

    /**
     * @see CostAdjustment#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }
    /**
     * @see CostAdjustment#PROPERTY_DOCUMENTSTATUS
     * 
     */
    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    /**
     * @see CostAdjustment#PROPERTY_CANCELPROCESS
     * 
     */
    public Boolean isCancelProcess() {
        return (Boolean) get(PROPERTY_CANCELPROCESS);
    }
    /**
     * @see CostAdjustment#PROPERTY_CANCELPROCESS
     * 
     */
    public void setCancelProcess(Boolean cancelProcess) {
        set(PROPERTY_CANCELPROCESS, cancelProcess);
    }

    /**
     * @see CostAdjustment#PROPERTY_COSTADJUSTMENTCANCEL
     * 
     */
    public CostAdjustment getCostAdjustmentCancel() {
        return (CostAdjustment) get(PROPERTY_COSTADJUSTMENTCANCEL);
    }
    /**
     * @see CostAdjustment#PROPERTY_COSTADJUSTMENTCANCEL
     * 
     */
    public void setCostAdjustmentCancel(CostAdjustment costAdjustmentCancel) {
        set(PROPERTY_COSTADJUSTMENTCANCEL, costAdjustmentCancel);
    }

    /**
     * @see CostAdjustment#PROPERTY_POSTED
     * 
     */
    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }
    /**
     * @see CostAdjustment#PROPERTY_POSTED
     * 
     */
    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    /**
     * @see CostAdjustment#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see CostAdjustment#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see CostAdjustmentLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CostAdjustmentLine> getCostAdjustmentLineList() {
      return (List<CostAdjustmentLine>) get(PROPERTY_COSTADJUSTMENTLINELIST);
    }

    /**
     * @see CostAdjustmentLine
     * 
     */
    public void setCostAdjustmentLineList(List<CostAdjustmentLine> costAdjustmentLineList) {
        set(PROPERTY_COSTADJUSTMENTLINELIST, costAdjustmentLineList);
    }

}
