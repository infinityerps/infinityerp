
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

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.geography.Location;
import org.openbravo.model.financialmgmt.tax.TaxRate;
/**
 * Entity class for entity OrganizationInformation (stored in table AD_OrgInfo).
 * <br>
 * Help: {@literal The Organization Info Tab is used to define an Organization's address, DUNS number and Tax
     *       Identification number}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrganizationInformation extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_OrgInfo";
    public static final String ENTITY_NAME = "OrganizationInformation";

    /**
     * Property id stored in column AD_Org_ID in table AD_OrgInfo 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_OrgInfo 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property active stored in column IsActive in table AD_OrgInfo 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_OrgInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_OrgInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_OrgInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_OrgInfo 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property locationAddress stored in column C_Location_ID in table AD_OrgInfo<br>
     * Help: {@literal The Location / Address field defines the location of an entity.}
     * 
     */
    public static final String PROPERTY_LOCATIONADDRESS = "locationAddress";

    /**
     * Property dUNS stored in column DUNS in table AD_OrgInfo<br>
     * Help: {@literal Used for EDI - For details see   www.dnb.com/dunsno/list.htm}
     * 
     */
    public static final String PROPERTY_DUNS = "dUNS";

    /**
     * Property taxID stored in column TaxID in table AD_OrgInfo<br>
     * Help: {@literal The Tax ID field identifies the legal Identification number of this Entity.}
     * 
     */
    public static final String PROPERTY_TAXID = "taxID";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table AD_OrgInfo<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property notTaxDeductable stored in column Istaxundeductable in table AD_OrgInfo<br>
     * Help: {@literal Check it if the tax is not deductible}
     * 
     */
    public static final String PROPERTY_NOTTAXDEDUCTABLE = "notTaxDeductable";

    /**
     * Property salesTaxExemptRate stored in column C_Tax_ID in table AD_OrgInfo<br>
     * Help: {@literal The Tax indicates the type of tax for this document line.}
     * 
     */
    public static final String PROPERTY_SALESTAXEXEMPTRATE = "salesTaxExemptRate";

    /**
     * Property logo stored in column Logo in table AD_OrgInfo
     * 
     */
    public static final String PROPERTY_LOGO = "logo";

    /**
     * Property referenceOrder stored in column Reference_Order in table AD_OrgInfo<br>
     * Help: {@literal Uses Order document number as inout number}
     * 
     */
    public static final String PROPERTY_REFERENCEORDER = "referenceOrder";

    /**
     * Property yourCompanyDocumentImage stored in column Your_Company_Document_Image in table AD_OrgInfo
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_YOURCOMPANYDOCUMENTIMAGE = "yourCompanyDocumentImage";

    /**
     * Property automaticWriteoffAmt stored in column Automatic_Writeoff_Amt in table AD_OrgInfo<br>
     * Help: {@literal Outstanding amounts lower than this are automatically proposed to be written off.}
     * 
     */
    public static final String PROPERTY_AUTOMATICWRITEOFFAMT = "automaticWriteoffAmt";

    /**
     * Property userContact stored in column AD_User_ID in table AD_OrgInfo<br>
     * Help: {@literal The User identifies a unique user in the system. This could be an internal user or a
     *       business partner contact}
     * 
     */
    public static final String PROPERTY_USERCONTACT = "userContact";

    /**
     * Property cashVAT stored in column Iscashvat in table AD_OrgInfo<br>
     * Help: {@literal Cash VAT tax rate}
     * 
     */
    public static final String PROPERTY_CASHVAT = "cashVAT";

    /**
     * Property companyLogo stored in column Company_Logo in table AD_OrgInfo<br>
     * Help: {@literal This logo will be used in the login screen and inside all Openbravo applications}
     * 
     */
    public static final String PROPERTY_COMPANYLOGO = "companyLogo";

    /**
     * Property isDoubleCash stored in column IsDoubleCash in table AD_OrgInfo<br>
     * Help: {@literal Organization is subscribed to the Double Cash criteria. If both the Cash VAT and the
     *       Double Cash Criteria flags are set to Yes, the Cash VAT regime will be automatically applied for the
     *       purchase flow too.}
     * 
     */
    public static final String PROPERTY_ISDOUBLECASH = "isDoubleCash";

    /**
     * Property companyLogoDark stored in column Company_Logo_Dark in table AD_OrgInfo<br>
     * Help: {@literal This logo will be used in the login screen and inside all Openbravo applications when they
     *       use
     *       a Dark theme. Note that this logo should have different colors or more contrast than the
     *       original logo in order to be seen properly in a dark background.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGODARK = "companyLogoDark";

    /**
     * Property companyLogoSubmark stored in column Company_Logo_Submark in table AD_OrgInfo<br>
     * Help: {@literal The submark logo is a simplified version of the Company Logo which is consistent with your
     *       brand and can be used to replace the Company Logo in places where this logo does not fit, such as in
     *       an application in a narrow screen where the Company Logo has no room to be showed properly}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOSUBMARK = "companyLogoSubmark";

    /**
     * Property companyLogoSubmarkDark stored in column Company_Logo_Submark_Dark in table AD_OrgInfo<br>
     * Help: {@literal The submark logo is a simplified version of the Company Logo which is consistent with your
     *       brand and can be used to replace the Company Logo in places where this logo does not fit, such as in
     *       an application on a narrow screen where the Company Logo has no room to be showed properly. Note
     *       that this logo should have different colors or more contrast than the original logo in order to be
     *       seen properly over a dark background.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOSUBMARKDARK = "companyLogoSubmarkDark";

    /**
     * Property aPRMPaymentDescription stored in column EM_Aprm_Payment_Desc in table AD_OrgInfo<br>
     * Help: {@literal Purchase Invoice's reference to be automatically included into the payment description.
     *       Possible values are:
     *       - Invoice document number (default).
     *       - Supplier reference, which is defined in
     *       the invoice's header.}
     * 
     */
    public static final String PROPERTY_APRMPAYMENTDESCRIPTION = "aPRMPaymentDescription";

    /**
     * Property companyLogoForDocs stored in column Company_Logo_For_Docs in table AD_OrgInfo<br>
     * Help: {@literal Company Logo used to be printed in invoices or other documents}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOFORDOCS = "companyLogoForDocs";

    /**
     * Property companyLogoForReceipts stored in column Company_Logo_For_Receipts in table AD_OrgInfo<br>
     * Help: {@literal Company Logo used to be printed in receipts. Usually those receipts are printed using only
     *       black ink, so this logo should be adapted to be able to print it properly using only one ink.}
     * 
     */
    public static final String PROPERTY_COMPANYLOGOFORRECEIPTS = "companyLogoForReceipts";

    /**
     * Property organization stored in column AD_Org_ID in table AD_OrgInfo<br>
     * Help: {@literal An organization is a unit of your client or legal entity - examples are store, department.
     *       You can share data between organizations.}
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";


    public OrganizationInformation() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_NOTTAXDEDUCTABLE, false);
        setDefaultValue(PROPERTY_REFERENCEORDER, false);
        setDefaultValue(PROPERTY_CASHVAT, false);
        setDefaultValue(PROPERTY_ISDOUBLECASH, false);
        setDefaultValue(PROPERTY_APRMPAYMENTDESCRIPTION, "Invoice Document Number");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see OrganizationInformation#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see OrganizationInformation#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see OrganizationInformation#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see OrganizationInformation#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see OrganizationInformation#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see OrganizationInformation#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see OrganizationInformation#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see OrganizationInformation#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see OrganizationInformation#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see OrganizationInformation#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see OrganizationInformation#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see OrganizationInformation#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see OrganizationInformation#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see OrganizationInformation#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see OrganizationInformation#PROPERTY_LOCATIONADDRESS
     * 
     */
    public Location getLocationAddress() {
        return (Location) get(PROPERTY_LOCATIONADDRESS);
    }
    /**
     * @see OrganizationInformation#PROPERTY_LOCATIONADDRESS
     * 
     */
    public void setLocationAddress(Location locationAddress) {
        set(PROPERTY_LOCATIONADDRESS, locationAddress);
    }

    /**
     * @see OrganizationInformation#PROPERTY_DUNS
     * 
     */
    public String getDUNS() {
        return (String) get(PROPERTY_DUNS);
    }
    /**
     * @see OrganizationInformation#PROPERTY_DUNS
     * 
     */
    public void setDUNS(String dUNS) {
        set(PROPERTY_DUNS, dUNS);
    }

    /**
     * @see OrganizationInformation#PROPERTY_TAXID
     * 
     */
    public String getTaxID() {
        return (String) get(PROPERTY_TAXID);
    }
    /**
     * @see OrganizationInformation#PROPERTY_TAXID
     * 
     */
    public void setTaxID(String taxID) {
        set(PROPERTY_TAXID, taxID);
    }

    /**
     * @see OrganizationInformation#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see OrganizationInformation#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see OrganizationInformation#PROPERTY_NOTTAXDEDUCTABLE
     * 
     */
    public Boolean isNotTaxDeductable() {
        return (Boolean) get(PROPERTY_NOTTAXDEDUCTABLE);
    }
    /**
     * @see OrganizationInformation#PROPERTY_NOTTAXDEDUCTABLE
     * 
     */
    public void setNotTaxDeductable(Boolean notTaxDeductable) {
        set(PROPERTY_NOTTAXDEDUCTABLE, notTaxDeductable);
    }

    /**
     * @see OrganizationInformation#PROPERTY_SALESTAXEXEMPTRATE
     * 
     */
    public TaxRate getSalesTaxExemptRate() {
        return (TaxRate) get(PROPERTY_SALESTAXEXEMPTRATE);
    }
    /**
     * @see OrganizationInformation#PROPERTY_SALESTAXEXEMPTRATE
     * 
     */
    public void setSalesTaxExemptRate(TaxRate salesTaxExemptRate) {
        set(PROPERTY_SALESTAXEXEMPTRATE, salesTaxExemptRate);
    }

    /**
     * @see OrganizationInformation#PROPERTY_LOGO
     * 
     */
    public String getLogo() {
        return (String) get(PROPERTY_LOGO);
    }
    /**
     * @see OrganizationInformation#PROPERTY_LOGO
     * 
     */
    public void setLogo(String logo) {
        set(PROPERTY_LOGO, logo);
    }

    /**
     * @see OrganizationInformation#PROPERTY_REFERENCEORDER
     * 
     */
    public Boolean isReferenceOrder() {
        return (Boolean) get(PROPERTY_REFERENCEORDER);
    }
    /**
     * @see OrganizationInformation#PROPERTY_REFERENCEORDER
     * 
     */
    public void setReferenceOrder(Boolean referenceOrder) {
        set(PROPERTY_REFERENCEORDER, referenceOrder);
    }

    /**
     * @see OrganizationInformation#PROPERTY_YOURCOMPANYDOCUMENTIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Image getYourCompanyDocumentImage() {
        return (Image) get(PROPERTY_YOURCOMPANYDOCUMENTIMAGE);
    }
    /**
     * @see OrganizationInformation#PROPERTY_YOURCOMPANYDOCUMENTIMAGE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setYourCompanyDocumentImage(Image yourCompanyDocumentImage) {
        set(PROPERTY_YOURCOMPANYDOCUMENTIMAGE, yourCompanyDocumentImage);
    }

    /**
     * @see OrganizationInformation#PROPERTY_AUTOMATICWRITEOFFAMT
     * 
     */
    public BigDecimal getAutomaticWriteoffAmt() {
        return (BigDecimal) get(PROPERTY_AUTOMATICWRITEOFFAMT);
    }
    /**
     * @see OrganizationInformation#PROPERTY_AUTOMATICWRITEOFFAMT
     * 
     */
    public void setAutomaticWriteoffAmt(BigDecimal automaticWriteoffAmt) {
        set(PROPERTY_AUTOMATICWRITEOFFAMT, automaticWriteoffAmt);
    }

    /**
     * @see OrganizationInformation#PROPERTY_USERCONTACT
     * 
     */
    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }
    /**
     * @see OrganizationInformation#PROPERTY_USERCONTACT
     * 
     */
    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    /**
     * @see OrganizationInformation#PROPERTY_CASHVAT
     * 
     */
    public Boolean isCashVAT() {
        return (Boolean) get(PROPERTY_CASHVAT);
    }
    /**
     * @see OrganizationInformation#PROPERTY_CASHVAT
     * 
     */
    public void setCashVAT(Boolean cashVAT) {
        set(PROPERTY_CASHVAT, cashVAT);
    }

    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGO
     * 
     */
    public Image getCompanyLogo() {
        return (Image) get(PROPERTY_COMPANYLOGO);
    }
    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGO
     * 
     */
    public void setCompanyLogo(Image companyLogo) {
        set(PROPERTY_COMPANYLOGO, companyLogo);
    }

    /**
     * @see OrganizationInformation#PROPERTY_ISDOUBLECASH
     * 
     */
    public Boolean isDoubleCash() {
        return (Boolean) get(PROPERTY_ISDOUBLECASH);
    }
    /**
     * @see OrganizationInformation#PROPERTY_ISDOUBLECASH
     * 
     */
    public void setDoubleCash(Boolean isDoubleCash) {
        set(PROPERTY_ISDOUBLECASH, isDoubleCash);
    }

    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGODARK
     * 
     */
    public Image getCompanyLogoDark() {
        return (Image) get(PROPERTY_COMPANYLOGODARK);
    }
    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGODARK
     * 
     */
    public void setCompanyLogoDark(Image companyLogoDark) {
        set(PROPERTY_COMPANYLOGODARK, companyLogoDark);
    }

    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOSUBMARK
     * 
     */
    public Image getCompanyLogoSubmark() {
        return (Image) get(PROPERTY_COMPANYLOGOSUBMARK);
    }
    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOSUBMARK
     * 
     */
    public void setCompanyLogoSubmark(Image companyLogoSubmark) {
        set(PROPERTY_COMPANYLOGOSUBMARK, companyLogoSubmark);
    }

    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOSUBMARKDARK
     * 
     */
    public Image getCompanyLogoSubmarkDark() {
        return (Image) get(PROPERTY_COMPANYLOGOSUBMARKDARK);
    }
    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOSUBMARKDARK
     * 
     */
    public void setCompanyLogoSubmarkDark(Image companyLogoSubmarkDark) {
        set(PROPERTY_COMPANYLOGOSUBMARKDARK, companyLogoSubmarkDark);
    }

    /**
     * @see OrganizationInformation#PROPERTY_APRMPAYMENTDESCRIPTION
     * 
     */
    public String getAPRMPaymentDescription() {
        return (String) get(PROPERTY_APRMPAYMENTDESCRIPTION);
    }
    /**
     * @see OrganizationInformation#PROPERTY_APRMPAYMENTDESCRIPTION
     * 
     */
    public void setAPRMPaymentDescription(String aPRMPaymentDescription) {
        set(PROPERTY_APRMPAYMENTDESCRIPTION, aPRMPaymentDescription);
    }

    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOFORDOCS
     * 
     */
    public Image getCompanyLogoForDocs() {
        return (Image) get(PROPERTY_COMPANYLOGOFORDOCS);
    }
    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOFORDOCS
     * 
     */
    public void setCompanyLogoForDocs(Image companyLogoForDocs) {
        set(PROPERTY_COMPANYLOGOFORDOCS, companyLogoForDocs);
    }

    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOFORRECEIPTS
     * 
     */
    public Image getCompanyLogoForReceipts() {
        return (Image) get(PROPERTY_COMPANYLOGOFORRECEIPTS);
    }
    /**
     * @see OrganizationInformation#PROPERTY_COMPANYLOGOFORRECEIPTS
     * 
     */
    public void setCompanyLogoForReceipts(Image companyLogoForReceipts) {
        set(PROPERTY_COMPANYLOGOFORRECEIPTS, companyLogoForReceipts);
    }

    /**
     * @see OrganizationInformation#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see OrganizationInformation#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

}
