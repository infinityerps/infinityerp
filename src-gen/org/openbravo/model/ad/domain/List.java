
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
package org.openbravo.model.ad.domain;

import java.util.ArrayList;
import java.util.Date;

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
 * Entity class for entity ADList (stored in table AD_Ref_List).
 * <br>
 * Help: {@literal The List Validation Tab defines lists to validate data}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class List extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Ref_List";
    public static final String ENTITY_NAME = "ADList";

    /**
     * Property id stored in column AD_Ref_List_ID in table AD_Ref_List<br>
     * Help: {@literal The Reference List field indicates a list of reference values from a database tables. 
     *       Reference lists populate drop down list boxes in data entry screens}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Ref_List 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Ref_List 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Ref_List 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Ref_List 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Ref_List 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Ref_List 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Ref_List 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table AD_Ref_List<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table AD_Ref_List 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Ref_List<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property reference stored in column AD_Reference_ID in table AD_Ref_List<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_REFERENCE = "reference";

    /**
     * Property validFromDate stored in column ValidFrom in table AD_Ref_List<br>
     * Help: {@literal The Valid From date indicates the first day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDFROMDATE = "validFromDate";

    /**
     * Property validToDate stored in column ValidTo in table AD_Ref_List<br>
     * Help: {@literal The Valid To date indicates the last day of a date range}
     * 
     */
    public static final String PROPERTY_VALIDTODATE = "validToDate";

    /**
     * Property module stored in column AD_Module_ID in table AD_Ref_List<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property sequenceNumber stored in column Seqno in table AD_Ref_List<br>
     * Help: {@literal The Sequence indicates the order of records}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBER = "sequenceNumber";

    /**
     * Property aDListTrlList stored in table AD_Ref_List
     * 
     */
    public static final String PROPERTY_ADLISTTRLLIST = "aDListTrlList";


    public List() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ADLISTTRLLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see List#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see List#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see List#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see List#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see List#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see List#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see List#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see List#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see List#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see List#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see List#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see List#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see List#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see List#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see List#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see List#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see List#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see List#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see List#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see List#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see List#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see List#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see List#PROPERTY_REFERENCE
     * 
     */
    public Reference getReference() {
        return (Reference) get(PROPERTY_REFERENCE);
    }
    /**
     * @see List#PROPERTY_REFERENCE
     * 
     */
    public void setReference(Reference reference) {
        set(PROPERTY_REFERENCE, reference);
    }

    /**
     * @see List#PROPERTY_VALIDFROMDATE
     * 
     */
    public Date getValidFromDate() {
        return (Date) get(PROPERTY_VALIDFROMDATE);
    }
    /**
     * @see List#PROPERTY_VALIDFROMDATE
     * 
     */
    public void setValidFromDate(Date validFromDate) {
        set(PROPERTY_VALIDFROMDATE, validFromDate);
    }

    /**
     * @see List#PROPERTY_VALIDTODATE
     * 
     */
    public Date getValidToDate() {
        return (Date) get(PROPERTY_VALIDTODATE);
    }
    /**
     * @see List#PROPERTY_VALIDTODATE
     * 
     */
    public void setValidToDate(Date validToDate) {
        set(PROPERTY_VALIDTODATE, validToDate);
    }

    /**
     * @see List#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see List#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see List#PROPERTY_SEQUENCENUMBER
     * 
     */
    public Long getSequenceNumber() {
        return (Long) get(PROPERTY_SEQUENCENUMBER);
    }
    /**
     * @see List#PROPERTY_SEQUENCENUMBER
     * 
     */
    public void setSequenceNumber(Long sequenceNumber) {
        set(PROPERTY_SEQUENCENUMBER, sequenceNumber);
    }

    /**
     * Help: {@literal Allows the translation of any reference list of the application. After performing any
     *       edits, the window must be regenerated.}<br>
     * @see ListTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public java.util.List<ListTrl> getADListTrlList() {
      return (java.util.List<ListTrl>) get(PROPERTY_ADLISTTRLLIST);
    }

    /**
     * Help: {@literal Allows the translation of any reference list of the application. After performing any
     *       edits, the window must be regenerated.}<br>
     * @see ListTrl
     * 
     */
    public void setADListTrlList(java.util.List<ListTrl> aDListTrlList) {
        set(PROPERTY_ADLISTTRLLIST, aDListTrlList);
    }

}
