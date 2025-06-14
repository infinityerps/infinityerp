
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
package org.openbravo.model.common.plm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ProductStatus (stored in table M_Product_Status).
 * <br>
 * Help: {@literal Product Lifecycle Management Status table}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ProductStatus extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Status";
    public static final String ENTITY_NAME = "ProductStatus";

    /**
     * Property id stored in column M_Product_Status_ID in table M_Product_Status<br>
     * Help: {@literal Product Lifecycle Management Status}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product_Status 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product_Status 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Product_Status 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product_Status 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Product_Status 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product_Status 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Product_Status 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Product_Status 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Product_Status<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property restrictsalefrombackend stored in column Restrictsalefrombackend in table M_Product_Status<br>
     * Help: {@literal Indicates if a product is allowed to be sold in Back-End}
     * 
     */
    public static final String PROPERTY_RESTRICTSALEFROMBACKEND = "restrictsalefrombackend";

    /**
     * Property restrictsaleoutofstock stored in column Restrictsaleoutofstock in table M_Product_Status<br>
     * Help: {@literal Indicates if a product is able to be sold when there's no available stock for this
     *       product}
     * 
     */
    public static final String PROPERTY_RESTRICTSALEOUTOFSTOCK = "restrictsaleoutofstock";

    /**
     * Property restrictdistriborderissue stored in column Restrictdistriborderissue in table M_Product_Status<br>
     * Help: {@literal Indicates if a product is restricted for a distribution order issue}
     * 
     */
    public static final String PROPERTY_RESTRICTDISTRIBORDERISSUE = "restrictdistriborderissue";

    /**
     * Property restrictpurchase stored in column Restrictpurchase in table M_Product_Status<br>
     * Help: {@literal Indicates if is possible to purchase a product}
     * 
     */
    public static final String PROPERTY_RESTRICTPURCHASE = "restrictpurchase";

    /**
     * Property restrictmanufacture stored in column Restrictmanufacture in table M_Product_Status<br>
     * Help: {@literal Indicates if a product is allowed to be manufactured}
     * 
     */
    public static final String PROPERTY_RESTRICTMANUFACTURE = "restrictmanufacture";

    /**
     * Property restrictdistriborderreceipt stored in column Restrictdistriborderreceipt in table M_Product_Status<br>
     * Help: {@literal Indicates if a product is restricted for a distribution order receipt}
     * 
     */
    public static final String PROPERTY_RESTRICTDISTRIBORDERRECEIPT = "restrictdistriborderreceipt";

    /**
     * Property restrictsalefrompos stored in column Restrictsalefrompos in table M_Product_Status<br>
     * Help: {@literal Indicates if a product is available to be sold in Web POS}
     * 
     */
    public static final String PROPERTY_RESTRICTSALEFROMPOS = "restrictsalefrompos";

    /**
     * Property module stored in column AD_Module_ID in table M_Product_Status<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property seqno stored in column Seqno in table M_Product_Status<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQNO = "seqno";

    /**
     * Property productStatusTrlList stored in table M_Product_Status
     * 
     */
    public static final String PROPERTY_PRODUCTSTATUSTRLLIST = "productStatusTrlList";


    public ProductStatus() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_RESTRICTSALEFROMBACKEND, false);
        setDefaultValue(PROPERTY_RESTRICTSALEOUTOFSTOCK, false);
        setDefaultValue(PROPERTY_RESTRICTDISTRIBORDERISSUE, false);
        setDefaultValue(PROPERTY_RESTRICTPURCHASE, false);
        setDefaultValue(PROPERTY_RESTRICTMANUFACTURE, false);
        setDefaultValue(PROPERTY_RESTRICTDISTRIBORDERRECEIPT, false);
        setDefaultValue(PROPERTY_RESTRICTSALEFROMPOS, false);
        setDefaultValue(PROPERTY_PRODUCTSTATUSTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ProductStatus#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ProductStatus#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ProductStatus#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ProductStatus#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ProductStatus#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ProductStatus#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ProductStatus#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ProductStatus#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ProductStatus#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ProductStatus#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ProductStatus#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ProductStatus#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ProductStatus#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ProductStatus#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ProductStatus#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ProductStatus#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ProductStatus#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see ProductStatus#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see ProductStatus#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see ProductStatus#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see ProductStatus#PROPERTY_RESTRICTSALEFROMBACKEND
     * 
     */
    public Boolean isRestrictsalefrombackend() {
        return (Boolean) get(PROPERTY_RESTRICTSALEFROMBACKEND);
    }
    /**
     * @see ProductStatus#PROPERTY_RESTRICTSALEFROMBACKEND
     * 
     */
    public void setRestrictsalefrombackend(Boolean restrictsalefrombackend) {
        set(PROPERTY_RESTRICTSALEFROMBACKEND, restrictsalefrombackend);
    }

    /**
     * @see ProductStatus#PROPERTY_RESTRICTSALEOUTOFSTOCK
     * 
     */
    public Boolean isRestrictsaleoutofstock() {
        return (Boolean) get(PROPERTY_RESTRICTSALEOUTOFSTOCK);
    }
    /**
     * @see ProductStatus#PROPERTY_RESTRICTSALEOUTOFSTOCK
     * 
     */
    public void setRestrictsaleoutofstock(Boolean restrictsaleoutofstock) {
        set(PROPERTY_RESTRICTSALEOUTOFSTOCK, restrictsaleoutofstock);
    }

    /**
     * @see ProductStatus#PROPERTY_RESTRICTDISTRIBORDERISSUE
     * 
     */
    public Boolean isRestrictdistriborderissue() {
        return (Boolean) get(PROPERTY_RESTRICTDISTRIBORDERISSUE);
    }
    /**
     * @see ProductStatus#PROPERTY_RESTRICTDISTRIBORDERISSUE
     * 
     */
    public void setRestrictdistriborderissue(Boolean restrictdistriborderissue) {
        set(PROPERTY_RESTRICTDISTRIBORDERISSUE, restrictdistriborderissue);
    }

    /**
     * @see ProductStatus#PROPERTY_RESTRICTPURCHASE
     * 
     */
    public Boolean isRestrictpurchase() {
        return (Boolean) get(PROPERTY_RESTRICTPURCHASE);
    }
    /**
     * @see ProductStatus#PROPERTY_RESTRICTPURCHASE
     * 
     */
    public void setRestrictpurchase(Boolean restrictpurchase) {
        set(PROPERTY_RESTRICTPURCHASE, restrictpurchase);
    }

    /**
     * @see ProductStatus#PROPERTY_RESTRICTMANUFACTURE
     * 
     */
    public Boolean isRestrictmanufacture() {
        return (Boolean) get(PROPERTY_RESTRICTMANUFACTURE);
    }
    /**
     * @see ProductStatus#PROPERTY_RESTRICTMANUFACTURE
     * 
     */
    public void setRestrictmanufacture(Boolean restrictmanufacture) {
        set(PROPERTY_RESTRICTMANUFACTURE, restrictmanufacture);
    }

    /**
     * @see ProductStatus#PROPERTY_RESTRICTDISTRIBORDERRECEIPT
     * 
     */
    public Boolean isRestrictdistriborderreceipt() {
        return (Boolean) get(PROPERTY_RESTRICTDISTRIBORDERRECEIPT);
    }
    /**
     * @see ProductStatus#PROPERTY_RESTRICTDISTRIBORDERRECEIPT
     * 
     */
    public void setRestrictdistriborderreceipt(Boolean restrictdistriborderreceipt) {
        set(PROPERTY_RESTRICTDISTRIBORDERRECEIPT, restrictdistriborderreceipt);
    }

    /**
     * @see ProductStatus#PROPERTY_RESTRICTSALEFROMPOS
     * 
     */
    public Boolean isRestrictsalefrompos() {
        return (Boolean) get(PROPERTY_RESTRICTSALEFROMPOS);
    }
    /**
     * @see ProductStatus#PROPERTY_RESTRICTSALEFROMPOS
     * 
     */
    public void setRestrictsalefrompos(Boolean restrictsalefrompos) {
        set(PROPERTY_RESTRICTSALEFROMPOS, restrictsalefrompos);
    }

    /**
     * @see ProductStatus#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ProductStatus#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ProductStatus#PROPERTY_SEQNO
     * 
     */
    public Long getSeqno() {
        return (Long) get(PROPERTY_SEQNO);
    }
    /**
     * @see ProductStatus#PROPERTY_SEQNO
     * 
     */
    public void setSeqno(Long seqno) {
        set(PROPERTY_SEQNO, seqno);
    }

    /**
     * Help: {@literal Translation for the ProductStatus table}<br>
     * @see ProductStatusTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductStatusTrl> getProductStatusTrlList() {
      return (List<ProductStatusTrl>) get(PROPERTY_PRODUCTSTATUSTRLLIST);
    }

    /**
     * Help: {@literal Translation for the ProductStatus table}<br>
     * @see ProductStatusTrl
     * 
     */
    public void setProductStatusTrlList(List<ProductStatusTrl> productStatusTrlList) {
        set(PROPERTY_PRODUCTSTATUSTRLLIST, productStatusTrlList);
    }

}
