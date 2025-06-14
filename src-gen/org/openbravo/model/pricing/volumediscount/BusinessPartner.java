
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
package org.openbravo.model.pricing.volumediscount;

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
 * Entity class for entity PricingVolumeDiscountBusinessPartner (stored in table M_Rappel_Bpartner).
 * <br>
 * Help: {@literal Contains all the configuration rappels. This rappel only applies to business partners
     *       recorded on this tab.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class BusinessPartner extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Rappel_Bpartner";
    public static final String ENTITY_NAME = "PricingVolumeDiscountBusinessPartner";

    /**
     * Property id stored in column M_Rappel_Bpartner_ID in table M_Rappel_Bpartner<br>
     * Help: {@literal The ID identifies a unique rappel for the partner}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Rappel_Bpartner 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Rappel_Bpartner 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Rappel_Bpartner 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Rappel_Bpartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Rappel_Bpartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Rappel_Bpartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Rappel_Bpartner 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property volumeDiscount stored in column M_Rappel_ID in table M_Rappel_Bpartner<br>
     * Help: {@literal The ID identifies a unique volume discount}
     * 
     */
    public static final String PROPERTY_VOLUMEDISCOUNT = "volumeDiscount";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table M_Rappel_Bpartner<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property salesTransaction stored in column IsSOTrx in table M_Rappel_Bpartner<br>
     * Help: {@literal The Sales Transaction checkbox indicates if this item is a Sales Transaction.}
     * 
     */
    public static final String PROPERTY_SALESTRANSACTION = "salesTransaction";

    /**
     * Property validFromDate stored in column ValidFrom in table M_Rappel_Bpartner<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property validToDate stored in column ValidTo in table M_Rappel_Bpartner<br>
     * Help: {@literal The Valid To date indicates the last day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDTODATE = "validToDate";

    /**
     * Property sequenceNumber stored in column SeqNo in table M_Rappel_Bpartner<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property generateInvoices stored in column GenerateInvoice in table M_Rappel_Bpartner<br>
     * Help: {@literal A button that generates all the invoices as a result of the activity of the business
     *       partner during a period of time}
     * 
     */
    public static final String PROPERTY_GENERATEINVOICES = "generateInvoices";


    public BusinessPartner() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SALESTRANSACTION, true);
        setDefaultValue(PROPERTY_GENERATEINVOICES, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see BusinessPartner#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see BusinessPartner#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see BusinessPartner#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see BusinessPartner#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see BusinessPartner#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see BusinessPartner#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see BusinessPartner#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see BusinessPartner#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see BusinessPartner#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see BusinessPartner#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see BusinessPartner#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see BusinessPartner#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see BusinessPartner#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see BusinessPartner#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see BusinessPartner#PROPERTY_VOLUMEDISCOUNT
     * 
     */
    public VolumeDiscount getVolumeDiscount() {
        return (VolumeDiscount) get(PROPERTY_VOLUMEDISCOUNT);
    }
    /**
     * @see BusinessPartner#PROPERTY_VOLUMEDISCOUNT
     * 
     */
    public void setVolumeDiscount(VolumeDiscount volumeDiscount) {
        set(PROPERTY_VOLUMEDISCOUNT, volumeDiscount);
    }

    /**
     * @see BusinessPartner#PROPERTY_BUSINESSPARTNER
     * 
     */
    public org.openbravo.model.common.businesspartner.BusinessPartner getBusinessPartner() {
        return (org.openbravo.model.common.businesspartner.BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see BusinessPartner#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(org.openbravo.model.common.businesspartner.BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see BusinessPartner#PROPERTY_SALESTRANSACTION
     * 
     */
    public Boolean isSalesTransaction() {
        return (Boolean) get(PROPERTY_SALESTRANSACTION);
    }
    /**
     * @see BusinessPartner#PROPERTY_SALESTRANSACTION
     * 
     */
    public void setSalesTransaction(Boolean salesTransaction) {
        set(PROPERTY_SALESTRANSACTION, salesTransaction);
    }

    /**
     * @see BusinessPartner#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see BusinessPartner#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see BusinessPartner#PROPERTY_VALIDTODATE
     * 
     */
    public Date getValidToDate() {
        return (Date) get(PROPERTY_VALIDTODATE);
    }
    /**
     * @see BusinessPartner#PROPERTY_VALIDTODATE
     * 
     */
    public void setValidToDate(Date validToDate) {
        set(PROPERTY_VALIDTODATE, validToDate);
    }

    /**
     * @see BusinessPartner#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see BusinessPartner#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * @see BusinessPartner#PROPERTY_GENERATEINVOICES
     * 
     */
    public Boolean isGenerateInvoices() {
        return (Boolean) get(PROPERTY_GENERATEINVOICES);
    }
    /**
     * @see BusinessPartner#PROPERTY_GENERATEINVOICES
     * 
     */
    public void setGenerateInvoices(Boolean generateInvoices) {
        set(PROPERTY_GENERATEINVOICES, generateInvoices);
    }

}
