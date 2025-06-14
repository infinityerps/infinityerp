
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
package org.openbravo.model.ad.module;

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
 * Entity class for entity ModuleDependency (stored in table AD_Module_Dependency).
 * <br>
 * Help: {@literal This table defines the dependencies among modules, in case the module is a template the
     *       dependencies defined in this table will be used to calculate the modules included in the template.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ModuleDependency extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Module_Dependency";
    public static final String ENTITY_NAME = "ModuleDependency";

    /**
     * Property id stored in column AD_Module_Dependency_ID in table AD_Module_Dependency 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Module_Dependency 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Module_Dependency 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Module_Dependency 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Module_Dependency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Module_Dependency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Module_Dependency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Module_Dependency 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property module stored in column AD_Module_ID in table AD_Module_Dependency<br>
     * Help: {@literal Indicates the module the element forms part of.}
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property dependentModule stored in column AD_Dependent_Module_ID in table AD_Module_Dependency 
     * 
     */
    public static final String PROPERTY_DEPENDENTMODULE = "dependentModule";

    /**
     * Property firstVersion stored in column StartVersion in table AD_Module_Dependency 
     * 
     */
    public static final String PROPERTY_FIRSTVERSION = "firstVersion";

    /**
     * Property lastVersion stored in column EndVersion in table AD_Module_Dependency<br>
     * Help: {@literal It is the last compatible version to define the dependency.}
     * 
     */
    public static final String PROPERTY_LASTVERSION = "lastVersion";

    /**
     * Property isIncluded stored in column IsIncluded in table AD_Module_Dependency<br>
     * Help: {@literal A dependency can include other modules in case it is a dependency for packages.}
     * 
     */
    public static final String PROPERTY_ISINCLUDED = "isIncluded";

    /**
     * Property dependantModuleName stored in column Dependant_Module_Name in table AD_Module_Dependency<br>
     * Help: {@literal The name of the dependent module is stored here because the dependent module can have been
     *       removed. In that case it is still relevant to show the module name to detect a broken dependency. }
     * 
     */
    public static final String PROPERTY_DEPENDANTMODULENAME = "dependantModuleName";

    /**
     * Property dependencyEnforcement stored in column Dependency_Enforcement in table AD_Module_Dependency<br>
     * Help: {@literal Dependency enforcement defines which are the versions of the dependent module that are
     *       compatible with the parent one.
     *       
     *       The values it can contain are:
     *       
     *       *Major Version (default). The
     *       compatible versions are all the minor version within the same major version. If "Last Version" is
     *       defined being a different major version than "From Version", "Last Version" defines the highest
     *       compatible minor version; if "Last Version" is in the same major version than "From Version" this
     *       value is not taken into account. It is the default value.
     *       *Minor Version. Defines a strict
     *       dependency to the exact minor version. In case no "Last Version" is set, "From Version" is the only
     *       compatible version. Other case the compatible versions are all between "From" and "Last Version"
     *       values.
     *       *None. "From Version" is the only field taken into account, there is no restriction on
     *       different major versions.}
     * 
     */
    public static final String PROPERTY_DEPENDENCYENFORCEMENT = "dependencyEnforcement";

    /**
     * Property userEditableEnforcement stored in column User_Editable_Enforcement in table AD_Module_Dependency<br>
     * Help: {@literal When a dependency/inclusion is "User Editable Enforcement", the enforcement defined for
     *       that dependency can be overwritten at instance level.}
     * 
     */
    public static final String PROPERTY_USEREDITABLEENFORCEMENT = "userEditableEnforcement";

    /**
     * Property instanceEnforcement stored in column Instance_Enforcement in table AD_Module_Dependency<br>
     * Help: {@literal In case the dependency is set as "User Editable", this value overwrites the Instance
     *       Enforcement one.}
     * 
     */
    public static final String PROPERTY_INSTANCEENFORCEMENT = "instanceEnforcement";


    public ModuleDependency() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_DEPENDENCYENFORCEMENT, "MAJOR");
        setDefaultValue(PROPERTY_USEREDITABLEENFORCEMENT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ModuleDependency#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ModuleDependency#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ModuleDependency#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ModuleDependency#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ModuleDependency#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ModuleDependency#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ModuleDependency#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ModuleDependency#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ModuleDependency#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ModuleDependency#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ModuleDependency#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ModuleDependency#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ModuleDependency#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ModuleDependency#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ModuleDependency#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ModuleDependency#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ModuleDependency#PROPERTY_MODULE
     * 
     */
    public Module getModule() {
        return (Module) get(PROPERTY_MODULE);
    }
    /**
     * @see ModuleDependency#PROPERTY_MODULE
     * 
     */
    public void setModule(Module module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ModuleDependency#PROPERTY_DEPENDENTMODULE
     * 
     */
    public Module getDependentModule() {
        return (Module) get(PROPERTY_DEPENDENTMODULE);
    }
    /**
     * @see ModuleDependency#PROPERTY_DEPENDENTMODULE
     * 
     */
    public void setDependentModule(Module dependentModule) {
        set(PROPERTY_DEPENDENTMODULE, dependentModule);
    }

    /**
     * @see ModuleDependency#PROPERTY_FIRSTVERSION
     * 
     */
    public String getFirstVersion() {
        return (String) get(PROPERTY_FIRSTVERSION);
    }
    /**
     * @see ModuleDependency#PROPERTY_FIRSTVERSION
     * 
     */
    public void setFirstVersion(String firstVersion) {
        set(PROPERTY_FIRSTVERSION, firstVersion);
    }

    /**
     * @see ModuleDependency#PROPERTY_LASTVERSION
     * 
     */
    public String getLastVersion() {
        return (String) get(PROPERTY_LASTVERSION);
    }
    /**
     * @see ModuleDependency#PROPERTY_LASTVERSION
     * 
     */
    public void setLastVersion(String lastVersion) {
        set(PROPERTY_LASTVERSION, lastVersion);
    }

    /**
     * @see ModuleDependency#PROPERTY_ISINCLUDED
     * 
     */
    public Boolean isIncluded() {
        return (Boolean) get(PROPERTY_ISINCLUDED);
    }
    /**
     * @see ModuleDependency#PROPERTY_ISINCLUDED
     * 
     */
    public void setIncluded(Boolean isIncluded) {
        set(PROPERTY_ISINCLUDED, isIncluded);
    }

    /**
     * @see ModuleDependency#PROPERTY_DEPENDANTMODULENAME
     * 
     */
    public String getDependantModuleName() {
        return (String) get(PROPERTY_DEPENDANTMODULENAME);
    }
    /**
     * @see ModuleDependency#PROPERTY_DEPENDANTMODULENAME
     * 
     */
    public void setDependantModuleName(String dependantModuleName) {
        set(PROPERTY_DEPENDANTMODULENAME, dependantModuleName);
    }

    /**
     * @see ModuleDependency#PROPERTY_DEPENDENCYENFORCEMENT
     * 
     */
    public String getDependencyEnforcement() {
        return (String) get(PROPERTY_DEPENDENCYENFORCEMENT);
    }
    /**
     * @see ModuleDependency#PROPERTY_DEPENDENCYENFORCEMENT
     * 
     */
    public void setDependencyEnforcement(String dependencyEnforcement) {
        set(PROPERTY_DEPENDENCYENFORCEMENT, dependencyEnforcement);
    }

    /**
     * @see ModuleDependency#PROPERTY_USEREDITABLEENFORCEMENT
     * 
     */
    public Boolean isUserEditableEnforcement() {
        return (Boolean) get(PROPERTY_USEREDITABLEENFORCEMENT);
    }
    /**
     * @see ModuleDependency#PROPERTY_USEREDITABLEENFORCEMENT
     * 
     */
    public void setUserEditableEnforcement(Boolean userEditableEnforcement) {
        set(PROPERTY_USEREDITABLEENFORCEMENT, userEditableEnforcement);
    }

    /**
     * @see ModuleDependency#PROPERTY_INSTANCEENFORCEMENT
     * 
     */
    public String getInstanceEnforcement() {
        return (String) get(PROPERTY_INSTANCEENFORCEMENT);
    }
    /**
     * @see ModuleDependency#PROPERTY_INSTANCEENFORCEMENT
     * 
     */
    public void setInstanceEnforcement(String instanceEnforcement) {
        set(PROPERTY_INSTANCEENFORCEMENT, instanceEnforcement);
    }

}
