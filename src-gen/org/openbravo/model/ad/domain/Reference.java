
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
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.application.Parameter;
import org.openbravo.client.application.RefWindow;
import org.openbravo.client.kernel.ReferencedMask;
import org.openbravo.client.kernel.UserInterfaceDefinition;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.datamodel.Column;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADReference (stored in table AD_Reference).
 * <br>
 * Help: {@literal The Reference Tab defines the references that are used to validate data}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Reference extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Reference";
    public static final String ENTITY_NAME = "ADReference";

    /**
     * Property id stored in column AD_Reference_ID in table AD_Reference<br>
     * Help: {@literal The Reference indicates the type of reference field}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Reference 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Reference 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Reference 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Reference 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Reference 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Reference<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property helpComment stored in column Help in table AD_Reference<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property validationType stored in column ValidationType in table AD_Reference<br>
     * Help: {@literal The Validation Type indicates the validation method to use.  These include list, table or
     *       data type validation.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_VALIDATIONTYPE = "validationType";

    /**
     * Property valueFormat stored in column VFormat in table AD_Reference<br>
     * Help: {@literal Value Format is the format the value will be displayed with.}
     * 
     */
    public static final String PROPERTY_VALUEFORMAT = "valueFormat";

    /**
     * Property module stored in column AD_Module_ID in table AD_Reference<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property isBaseReference stored in column IsBaseReference in table AD_Reference<br>
     * Help: {@literal Base References are the ones that can be directly applied to a column. Base references can
     *       define subreferences.}
     * 
     */
    public static final String PROPERTY_ISBASEREFERENCE = "isBaseReference";

    /**
     * Property parentReference stored in column ParentReference_ID in table AD_Reference<br>
     * Help: {@literal When the reference is set as non base reference, it is necessary to indicate which is its
     *       parent reference. }
     * 
     */
    public static final String PROPERTY_PARENTREFERENCE = "parentReference";

    /**
     * Property modelImpl stored in column Model_Impl in table AD_Reference<br>
     * Help: {@literal Java class implementing Model. It is the java class used to generate DAL classes.}
     * 
     */
    public static final String PROPERTY_MODELIMPL = "modelImpl";

    /**
     * Property wADImpl stored in column WAD_Impl in table AD_Reference<br>
     * Help: {@literal Java class implementing WAD}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_WADIMPL = "wADImpl";

    /**
     * Property impl stored in column UI_Impl in table AD_Reference<br>
     * Help: {@literal Java class implementing runtime UI.}
     * 
     */
    public static final String PROPERTY_IMPL = "impl";

    /**
     * Property displayedValue stored in column IsValueDisplayed in table AD_Reference<br>
     * Help: {@literal The Display Value checkbox indicates if the value column will display with the display
     *       column.}
     * 
     */
    public static final String PROPERTY_DISPLAYEDVALUE = "displayedValue";

    /**
     * Property aDColumnReferenceSearchKeyList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_ADCOLUMNREFERENCESEARCHKEYLIST = "aDColumnReferenceSearchKeyList";

    /**
     * Property aDListList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_ADLISTLIST = "aDListList";

    /**
     * Property aDModelImplementationList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_ADMODELIMPLEMENTATIONLIST = "aDModelImplementationList";

    /**
     * Property aDReferenceTrlList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_ADREFERENCETRLLIST = "aDReferenceTrlList";

    /**
     * Property aDReferencedTableList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_ADREFERENCEDTABLELIST = "aDReferencedTableList";

    /**
     * Property aDReferencedTreeList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_ADREFERENCEDTREELIST = "aDReferencedTreeList";

    /**
     * Property aDSelectorList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_ADSELECTORLIST = "aDSelectorList";

    /**
     * Property oBCLKERREFMASKList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_OBCLKERREFMASKLIST = "oBCLKERREFMASKList";

    /**
     * Property oBCLKERUIDefinitionList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_OBCLKERUIDEFINITIONLIST = "oBCLKERUIDefinitionList";

    /**
     * Property oBUIAPPParameterReferenceSearchKeyList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_OBUIAPPPARAMETERREFERENCESEARCHKEYLIST = "oBUIAPPParameterReferenceSearchKeyList";

    /**
     * Property oBUIAPPRefWindowList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_OBUIAPPREFWINDOWLIST = "oBUIAPPRefWindowList";

    /**
     * Property oBUISELSelectorList stored in table AD_Reference
     * 
     */
    public static final String PROPERTY_OBUISELSELECTORLIST = "oBUISELSelectorList";


    public Reference() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_ISBASEREFERENCE, false);
        setDefaultValue(PROPERTY_DISPLAYEDVALUE, false);
        setDefaultValue(PROPERTY_ADCOLUMNREFERENCESEARCHKEYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADLISTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADMODELIMPLEMENTATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADREFERENCETRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADREFERENCEDTABLELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADREFERENCEDTREELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ADSELECTORLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBCLKERREFMASKLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBCLKERUIDEFINITIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPPARAMETERREFERENCESEARCHKEYLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPREFWINDOWLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUISELSELECTORLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Reference#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Reference#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Reference#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Reference#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Reference#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Reference#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Reference#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Reference#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Reference#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Reference#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Reference#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Reference#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Reference#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Reference#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Reference#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Reference#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Reference#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Reference#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Reference#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Reference#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Reference#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Reference#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Reference#PROPERTY_VALIDATIONTYPE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getValidationType() {
        return (String) get(PROPERTY_VALIDATIONTYPE);
    }
    /**
     * @see Reference#PROPERTY_VALIDATIONTYPE
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setValidationType(String validationType) {
        set(PROPERTY_VALIDATIONTYPE, validationType);
    }

    /**
     * @see Reference#PROPERTY_VALUEFORMAT
     * 
     */
    public String getValueFormat() {
        return (String) get(PROPERTY_VALUEFORMAT);
    }
    /**
     * @see Reference#PROPERTY_VALUEFORMAT
     * 
     */
    public void setValueFormat(String valueFormat) {
        set(PROPERTY_VALUEFORMAT, valueFormat);
    }

    /**
     * @see Reference#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see Reference#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see Reference#PROPERTY_ISBASEREFERENCE
     * 
     */
    public Boolean isBaseReference() {
        return (Boolean) get(PROPERTY_ISBASEREFERENCE);
    }
    /**
     * @see Reference#PROPERTY_ISBASEREFERENCE
     * 
     */
    public void setBaseReference(Boolean isBaseReference) {
        set(PROPERTY_ISBASEREFERENCE, isBaseReference);
    }

    /**
     * @see Reference#PROPERTY_PARENTREFERENCE
     * 
     */
    public Reference getParentReference() {
        return (Reference) get(PROPERTY_PARENTREFERENCE);
    }
    /**
     * @see Reference#PROPERTY_PARENTREFERENCE
     * 
     */
    public void setParentReference(Reference parentReference) {
        set(PROPERTY_PARENTREFERENCE, parentReference);
    }

    /**
     * @see Reference#PROPERTY_MODELIMPL
     * 
     */
    public String getModelImpl() {
        return (String) get(PROPERTY_MODELIMPL);
    }
    /**
     * @see Reference#PROPERTY_MODELIMPL
     * 
     */
    public void setModelImpl(String modelImpl) {
        set(PROPERTY_MODELIMPL, modelImpl);
    }

    /**
     * @see Reference#PROPERTY_WADIMPL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getWADImpl() {
        return (String) get(PROPERTY_WADIMPL);
    }
    /**
     * @see Reference#PROPERTY_WADIMPL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setWADImpl(String wADImpl) {
        set(PROPERTY_WADIMPL, wADImpl);
    }

    /**
     * @see Reference#PROPERTY_IMPL
     * 
     */
    public String getImpl() {
        return (String) get(PROPERTY_IMPL);
    }
    /**
     * @see Reference#PROPERTY_IMPL
     * 
     */
    public void setImpl(String impl) {
        set(PROPERTY_IMPL, impl);
    }

    /**
     * @see Reference#PROPERTY_DISPLAYEDVALUE
     * 
     */
    public Boolean isDisplayedValue() {
        return (Boolean) get(PROPERTY_DISPLAYEDVALUE);
    }
    /**
     * @see Reference#PROPERTY_DISPLAYEDVALUE
     * 
     */
    public void setDisplayedValue(Boolean displayedValue) {
        set(PROPERTY_DISPLAYEDVALUE, displayedValue);
    }

    /**
     * Help: {@literal Defines the columns of a table
     *       The Used in Column Tab defines the table and column this
     *       element resides in.}<br>
     * @see Column
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Column> getADColumnReferenceSearchKeyList() {
      return (List<Column>) get(PROPERTY_ADCOLUMNREFERENCESEARCHKEYLIST);
    }

    /**
     * Help: {@literal Defines the columns of a table
     *       The Used in Column Tab defines the table and column this
     *       element resides in.}<br>
     * @see Column
     * 
     */
    public void setADColumnReferenceSearchKeyList(List<Column> aDColumnReferenceSearchKeyList) {
        set(PROPERTY_ADCOLUMNREFERENCESEARCHKEYLIST, aDColumnReferenceSearchKeyList);
    }

    /**
     * Help: {@literal The List Validation Tab defines lists to validate data}<br>
     * @see org.openbravo.model.ad.domain.List
     * 
     */
    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.ad.domain.List> getADListList() {
      return (List<org.openbravo.model.ad.domain.List>) get(PROPERTY_ADLISTLIST);
    }

    /**
     * Help: {@literal The List Validation Tab defines lists to validate data}<br>
     * @see org.openbravo.model.ad.domain.List
     * 
     */
    public void setADListList(List<org.openbravo.model.ad.domain.List> aDListList) {
        set(PROPERTY_ADLISTLIST, aDListList);
    }

    /**
     * @see ModelImplementation
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ModelImplementation> getADModelImplementationList() {
      return (List<ModelImplementation>) get(PROPERTY_ADMODELIMPLEMENTATIONLIST);
    }

    /**
     * @see ModelImplementation
     * 
     */
    public void setADModelImplementationList(List<ModelImplementation> aDModelImplementationList) {
        set(PROPERTY_ADMODELIMPLEMENTATIONLIST, aDModelImplementationList);
    }

    /**
     * @see ReferenceTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReferenceTrl> getADReferenceTrlList() {
      return (List<ReferenceTrl>) get(PROPERTY_ADREFERENCETRLLIST);
    }

    /**
     * @see ReferenceTrl
     * 
     */
    public void setADReferenceTrlList(List<ReferenceTrl> aDReferenceTrlList) {
        set(PROPERTY_ADREFERENCETRLLIST, aDReferenceTrlList);
    }

    /**
     * Help: {@literal The Table Validation Tab defines tables to validate data}<br>
     * @see ReferencedTable
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReferencedTable> getADReferencedTableList() {
      return (List<ReferencedTable>) get(PROPERTY_ADREFERENCEDTABLELIST);
    }

    /**
     * Help: {@literal The Table Validation Tab defines tables to validate data}<br>
     * @see ReferencedTable
     * 
     */
    public void setADReferencedTableList(List<ReferencedTable> aDReferencedTableList) {
        set(PROPERTY_ADREFERENCEDTABLELIST, aDReferencedTableList);
    }

    /**
     * @see ReferencedTree
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReferencedTree> getADReferencedTreeList() {
      return (List<ReferencedTree>) get(PROPERTY_ADREFERENCEDTREELIST);
    }

    /**
     * @see ReferencedTree
     * 
     */
    public void setADReferencedTreeList(List<ReferencedTree> aDReferencedTreeList) {
        set(PROPERTY_ADREFERENCEDTREELIST, aDReferencedTreeList);
    }

    /**
     * @see Selector
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Selector> getADSelectorList() {
      return (List<Selector>) get(PROPERTY_ADSELECTORLIST);
    }

    /**
     * @see Selector
     * 
     */
    public void setADSelectorList(List<Selector> aDSelectorList) {
        set(PROPERTY_ADSELECTORLIST, aDSelectorList);
    }

    /**
     * @see ReferencedMask
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ReferencedMask> getOBCLKERREFMASKList() {
      return (List<ReferencedMask>) get(PROPERTY_OBCLKERREFMASKLIST);
    }

    /**
     * @see ReferencedMask
     * 
     */
    public void setOBCLKERREFMASKList(List<ReferencedMask> oBCLKERREFMASKList) {
        set(PROPERTY_OBCLKERREFMASKLIST, oBCLKERREFMASKList);
    }

    /**
     * Help: {@literal Defines user interface properties on reference/type level.}<br>
     * @see UserInterfaceDefinition
     * 
     */
    @SuppressWarnings("unchecked")
    public List<UserInterfaceDefinition> getOBCLKERUIDefinitionList() {
      return (List<UserInterfaceDefinition>) get(PROPERTY_OBCLKERUIDEFINITIONLIST);
    }

    /**
     * Help: {@literal Defines user interface properties on reference/type level.}<br>
     * @see UserInterfaceDefinition
     * 
     */
    public void setOBCLKERUIDefinitionList(List<UserInterfaceDefinition> oBCLKERUIDefinitionList) {
        set(PROPERTY_OBCLKERUIDEFINITIONLIST, oBCLKERUIDefinitionList);
    }

    /**
     * @see Parameter
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Parameter> getOBUIAPPParameterReferenceSearchKeyList() {
      return (List<Parameter>) get(PROPERTY_OBUIAPPPARAMETERREFERENCESEARCHKEYLIST);
    }

    /**
     * @see Parameter
     * 
     */
    public void setOBUIAPPParameterReferenceSearchKeyList(List<Parameter> oBUIAPPParameterReferenceSearchKeyList) {
        set(PROPERTY_OBUIAPPPARAMETERREFERENCESEARCHKEYLIST, oBUIAPPParameterReferenceSearchKeyList);
    }

    /**
     * @see RefWindow
     * 
     */
    @SuppressWarnings("unchecked")
    public List<RefWindow> getOBUIAPPRefWindowList() {
      return (List<RefWindow>) get(PROPERTY_OBUIAPPREFWINDOWLIST);
    }

    /**
     * @see RefWindow
     * 
     */
    public void setOBUIAPPRefWindowList(List<RefWindow> oBUIAPPRefWindowList) {
        set(PROPERTY_OBUIAPPREFWINDOWLIST, oBUIAPPRefWindowList);
    }

    /**
     * Help: {@literal Defines the selector field suggestion box and popup grid.}<br>
     * @see org.openbravo.userinterface.selector.Selector
     * 
     */
    @SuppressWarnings("unchecked")
    public List<org.openbravo.userinterface.selector.Selector> getOBUISELSelectorList() {
      return (List<org.openbravo.userinterface.selector.Selector>) get(PROPERTY_OBUISELSELECTORLIST);
    }

    /**
     * Help: {@literal Defines the selector field suggestion box and popup grid.}<br>
     * @see org.openbravo.userinterface.selector.Selector
     * 
     */
    public void setOBUISELSelectorList(List<org.openbravo.userinterface.selector.Selector> oBUISELSelectorList) {
        set(PROPERTY_OBUISELSELECTORLIST, oBUISELSelectorList);
    }

}
