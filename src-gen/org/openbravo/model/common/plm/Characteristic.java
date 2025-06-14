
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
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Tree;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity Characteristic (stored in table M_Characteristic).
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Characteristic extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Characteristic";
    public static final String ENTITY_NAME = "Characteristic";

    /**
     * Property id stored in column M_Characteristic_ID in table M_Characteristic<br>
     * Help: {@literal Definition of a Product Characteristic}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Characteristic 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Characteristic 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table M_Characteristic 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table M_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table M_Characteristic 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table M_Characteristic 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Characteristic<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property tree stored in column AD_Tree_ID in table M_Characteristic<br>
     * Help: {@literal The Tree field identifies a unique Tree in the system. Trees define roll ups or summary
     *       levels of information.  They are used in reports for defining report points and summarization
     *       levels.}
     * 
     */
    public static final String PROPERTY_TREE = "tree";

    /**
     * Property variant stored in column Isvariant in table M_Characteristic
     * 
     */
    public static final String PROPERTY_VARIANT = "variant";

    /**
     * Property explodeConfigurationTab stored in column IsExplodeConf in table M_Characteristic<br>
     * Help: {@literal Determines if the values of the characteristic needs to be automatically inserted in the
     *       Configuration tab when the characteristic is added to a Generic product as a Variant.}
     * 
     */
    public static final String PROPERTY_EXPLODECONFIGURATIONTAB = "explodeConfigurationTab";

    /**
     * Property characteristicType stored in column M_Characteristic_Type in table M_Characteristic<br>
     * Help: {@literal It allows the possibility to define types of product characteristics that might be
     *       interesting for a concrete business. For example, in restaurants a product characteristic type might
     *       be defined as "Allergens". This definition might allow to develop advanced features.
     *       By default the
     *       type is empty (null), which means the product characteristic doesn't belong to a concrete type.}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICTYPE = "characteristicType";

    /**
     * Property relevantCharacteristic stored in column Relevant_Characteristic in table M_Characteristic<br>
     * Help: {@literal The relevant characteristic linked to the characteristic. A relevant characteristic is
     *       linked to one and only one characteristic whose values will be displayed in those property fields
     *       pointing to the relevant characteristic.}
     * 
     */
    public static final String PROPERTY_RELEVANTCHARACTERISTIC = "relevantCharacteristic";

    /**
     * Property characteristicSubsetList stored in table M_Characteristic
     * 
     */
    public static final String PROPERTY_CHARACTERISTICSUBSETLIST = "characteristicSubsetList";

    /**
     * Property characteristicTrlList stored in table M_Characteristic
     * 
     */
    public static final String PROPERTY_CHARACTERISTICTRLLIST = "characteristicTrlList";

    /**
     * Property characteristicValueList stored in table M_Characteristic
     * 
     */
    public static final String PROPERTY_CHARACTERISTICVALUELIST = "characteristicValueList";

    /**
     * Property pricingAdjustmentCharacteristicList stored in table M_Characteristic
     * 
     */
    public static final String PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST = "pricingAdjustmentCharacteristicList";

    /**
     * Property productCharacteristicValueList stored in table M_Characteristic
     * 
     */
    public static final String PROPERTY_PRODUCTCHARACTERISTICVALUELIST = "productCharacteristicValueList";


    public Characteristic() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_VARIANT, false);
        setDefaultValue(PROPERTY_EXPLODECONFIGURATIONTAB, true);
        setDefaultValue(PROPERTY_CHARACTERISTICSUBSETLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CHARACTERISTICTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CHARACTERISTICVALUELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTCHARACTERISTICVALUELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Characteristic#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Characteristic#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Characteristic#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Characteristic#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Characteristic#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Characteristic#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Characteristic#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Characteristic#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Characteristic#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Characteristic#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Characteristic#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Characteristic#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Characteristic#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Characteristic#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Characteristic#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Characteristic#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Characteristic#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Characteristic#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Characteristic#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Characteristic#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Characteristic#PROPERTY_TREE
     * 
     */
    public Tree getTree() {
        return (Tree) get(PROPERTY_TREE);
    }
    /**
     * @see Characteristic#PROPERTY_TREE
     * 
     */
    public void setTree(Tree tree) {
        set(PROPERTY_TREE, tree);
    }

    /**
     * @see Characteristic#PROPERTY_VARIANT
     * 
     */
    public Boolean isVariant() {
        return (Boolean) get(PROPERTY_VARIANT);
    }
    /**
     * @see Characteristic#PROPERTY_VARIANT
     * 
     */
    public void setVariant(Boolean variant) {
        set(PROPERTY_VARIANT, variant);
    }

    /**
     * @see Characteristic#PROPERTY_EXPLODECONFIGURATIONTAB
     * 
     */
    public Boolean isExplodeConfigurationTab() {
        return (Boolean) get(PROPERTY_EXPLODECONFIGURATIONTAB);
    }
    /**
     * @see Characteristic#PROPERTY_EXPLODECONFIGURATIONTAB
     * 
     */
    public void setExplodeConfigurationTab(Boolean explodeConfigurationTab) {
        set(PROPERTY_EXPLODECONFIGURATIONTAB, explodeConfigurationTab);
    }

    /**
     * @see Characteristic#PROPERTY_CHARACTERISTICTYPE
     * 
     */
    public String getCharacteristicType() {
        return (String) get(PROPERTY_CHARACTERISTICTYPE);
    }
    /**
     * @see Characteristic#PROPERTY_CHARACTERISTICTYPE
     * 
     */
    public void setCharacteristicType(String characteristicType) {
        set(PROPERTY_CHARACTERISTICTYPE, characteristicType);
    }

    /**
     * @see Characteristic#PROPERTY_RELEVANTCHARACTERISTIC
     * 
     */
    public String getRelevantCharacteristic() {
        return (String) get(PROPERTY_RELEVANTCHARACTERISTIC);
    }
    /**
     * @see Characteristic#PROPERTY_RELEVANTCHARACTERISTIC
     * 
     */
    public void setRelevantCharacteristic(String relevantCharacteristic) {
        set(PROPERTY_RELEVANTCHARACTERISTIC, relevantCharacteristic);
    }

    /**
     * @see CharacteristicSubset
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CharacteristicSubset> getCharacteristicSubsetList() {
      return (List<CharacteristicSubset>) get(PROPERTY_CHARACTERISTICSUBSETLIST);
    }

    /**
     * @see CharacteristicSubset
     * 
     */
    public void setCharacteristicSubsetList(List<CharacteristicSubset> characteristicSubsetList) {
        set(PROPERTY_CHARACTERISTICSUBSETLIST, characteristicSubsetList);
    }

    /**
     * @see CharacteristicTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CharacteristicTrl> getCharacteristicTrlList() {
      return (List<CharacteristicTrl>) get(PROPERTY_CHARACTERISTICTRLLIST);
    }

    /**
     * @see CharacteristicTrl
     * 
     */
    public void setCharacteristicTrlList(List<CharacteristicTrl> characteristicTrlList) {
        set(PROPERTY_CHARACTERISTICTRLLIST, characteristicTrlList);
    }

    /**
     * @see CharacteristicValue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<CharacteristicValue> getCharacteristicValueList() {
      return (List<CharacteristicValue>) get(PROPERTY_CHARACTERISTICVALUELIST);
    }

    /**
     * @see CharacteristicValue
     * 
     */
    public void setCharacteristicValueList(List<CharacteristicValue> characteristicValueList) {
        set(PROPERTY_CHARACTERISTICVALUELIST, characteristicValueList);
    }

    /**
     * Help: {@literal Used to select the product characteristics related to the Price Adjustment.}<br>
     * @see org.openbravo.model.pricing.priceadjustment.Characteristic
     * 
     */
    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.pricing.priceadjustment.Characteristic> getPricingAdjustmentCharacteristicList() {
      return (List<org.openbravo.model.pricing.priceadjustment.Characteristic>) get(PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST);
    }

    /**
     * Help: {@literal Used to select the product characteristics related to the Price Adjustment.}<br>
     * @see org.openbravo.model.pricing.priceadjustment.Characteristic
     * 
     */
    public void setPricingAdjustmentCharacteristicList(List<org.openbravo.model.pricing.priceadjustment.Characteristic> pricingAdjustmentCharacteristicList) {
        set(PROPERTY_PRICINGADJUSTMENTCHARACTERISTICLIST, pricingAdjustmentCharacteristicList);
    }

    /**
     * @see ProductCharacteristicValue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCharacteristicValue> getProductCharacteristicValueList() {
      return (List<ProductCharacteristicValue>) get(PROPERTY_PRODUCTCHARACTERISTICVALUELIST);
    }

    /**
     * @see ProductCharacteristicValue
     * 
     */
    public void setProductCharacteristicValueList(List<ProductCharacteristicValue> productCharacteristicValueList) {
        set(PROPERTY_PRODUCTCHARACTERISTICVALUELIST, productCharacteristicValueList);
    }

}
