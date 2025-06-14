
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
package org.openbravo.model.ad.access;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADModuleDependencyInst (stored in table AD_Module_Dependency_Inst).
 * <br>
 * Help: {@literal This temporary table is used to store module dependencies during the update and install
     *       processes}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ModuleDependencyInst extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Module_Dependency_Inst";
    public static final String ENTITY_NAME = "ADModuleDependencyInst";

    /**
     * Property id stored in column AD_Module_Dependency_Inst_ID in table AD_Module_Dependency_Inst 
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Module_Dependency_Inst 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Module_Dependency_Inst 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column Isactive in table AD_Module_Dependency_Inst 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Module_Dependency_Inst 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column Createdby in table AD_Module_Dependency_Inst 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Module_Dependency_Inst 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column Updatedby in table AD_Module_Dependency_Inst 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property moduleDependency stored in column AD_Module_Dependency_ID in table AD_Module_Dependency_Inst<br>
     * Help: {@literal Defines dependencies ammong modules}
     * 
     */
    public static final String PROPERTY_MODULEDEPENDENCY = "moduleDependency";

    /**
     * Property module stored in column AD_Module_ID in table AD_Module_Dependency_Inst 
     * 
     */
    public static final String PROPERTY_MODULE = "module";

    /**
     * Property dependentModule stored in column AD_Dependent_Module_ID in table AD_Module_Dependency_Inst<br>
     * Help: {@literal It is the Dependent Module for the current dependency.}
     * 
     */
    public static final String PROPERTY_DEPENDENTMODULE = "dependentModule";

    /**
     * Property firstVersion stored in column Startversion in table AD_Module_Dependency_Inst<br>
     * Help: {@literal It is the first compatible version for the dependency, in case last version is blank is
     *       will be the only one.}
     * 
     */
    public static final String PROPERTY_FIRSTVERSION = "firstVersion";

    /**
     * Property lastVersion stored in column Endversion in table AD_Module_Dependency_Inst<br>
     * Help: {@literal It is the last compatible version to define the dependency.}
     * 
     */
    public static final String PROPERTY_LASTVERSION = "lastVersion";

    /**
     * Property isIncluded stored in column Isincluded in table AD_Module_Dependency_Inst<br>
     * Help: {@literal A dependency can include other modules in case it is a dependency for packages.}
     * 
     */
    public static final String PROPERTY_ISINCLUDED = "isIncluded";

    /**
     * Property dependantModuleName stored in column Dependant_Module_Name in table AD_Module_Dependency_Inst 
     * 
     */
    public static final String PROPERTY_DEPENDANTMODULENAME = "dependantModuleName";

    /**
     * Property dependencyEnforcement stored in column Dependency_Enforcement in table AD_Module_Dependency_Inst<br>
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
     * Property userEditableEnforcement stored in column User_Editable_Enforcement in table AD_Module_Dependency_Inst<br>
     * Help: {@literal When a dependency/inclusion is "User Editable Enforcement", the enforcement defined for
     *       that dependency can be overwritten at instance level.}
     * 
     */
    public static final String PROPERTY_USEREDITABLEENFORCEMENT = "userEditableEnforcement";


    public ModuleDependencyInst() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ISINCLUDED, false);
        setDefaultValue(PROPERTY_DEPENDENCYENFORCEMENT, "MAJOR");
        setDefaultValue(PROPERTY_USEREDITABLEENFORCEMENT, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_MODULEDEPENDENCY
     * 
     */
    public String getModuleDependency() {
        return (String) get(PROPERTY_MODULEDEPENDENCY);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_MODULEDEPENDENCY
     * 
     */
    public void setModuleDependency(String moduleDependency) {
        set(PROPERTY_MODULEDEPENDENCY, moduleDependency);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_MODULE
     * 
     */
    public String getModule() {
        return (String) get(PROPERTY_MODULE);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_MODULE
     * 
     */
    public void setModule(String module) {
        set(PROPERTY_MODULE, module);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_DEPENDENTMODULE
     * 
     */
    public String getDependentModule() {
        return (String) get(PROPERTY_DEPENDENTMODULE);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_DEPENDENTMODULE
     * 
     */
    public void setDependentModule(String dependentModule) {
        set(PROPERTY_DEPENDENTMODULE, dependentModule);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_FIRSTVERSION
     * 
     */
    public String getFirstVersion() {
        return (String) get(PROPERTY_FIRSTVERSION);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_FIRSTVERSION
     * 
     */
    public void setFirstVersion(String firstVersion) {
        set(PROPERTY_FIRSTVERSION, firstVersion);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_LASTVERSION
     * 
     */
    public String getLastVersion() {
        return (String) get(PROPERTY_LASTVERSION);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_LASTVERSION
     * 
     */
    public void setLastVersion(String lastVersion) {
        set(PROPERTY_LASTVERSION, lastVersion);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_ISINCLUDED
     * 
     */
    public Boolean isIncluded() {
        return (Boolean) get(PROPERTY_ISINCLUDED);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_ISINCLUDED
     * 
     */
    public void setIncluded(Boolean isIncluded) {
        set(PROPERTY_ISINCLUDED, isIncluded);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_DEPENDANTMODULENAME
     * 
     */
    public String getDependantModuleName() {
        return (String) get(PROPERTY_DEPENDANTMODULENAME);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_DEPENDANTMODULENAME
     * 
     */
    public void setDependantModuleName(String dependantModuleName) {
        set(PROPERTY_DEPENDANTMODULENAME, dependantModuleName);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_DEPENDENCYENFORCEMENT
     * 
     */
    public String getDependencyEnforcement() {
        return (String) get(PROPERTY_DEPENDENCYENFORCEMENT);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_DEPENDENCYENFORCEMENT
     * 
     */
    public void setDependencyEnforcement(String dependencyEnforcement) {
        set(PROPERTY_DEPENDENCYENFORCEMENT, dependencyEnforcement);
    }

    /**
     * @see ModuleDependencyInst#PROPERTY_USEREDITABLEENFORCEMENT
     * 
     */
    public Boolean isUserEditableEnforcement() {
        return (Boolean) get(PROPERTY_USEREDITABLEENFORCEMENT);
    }
    /**
     * @see ModuleDependencyInst#PROPERTY_USEREDITABLEENFORCEMENT
     * 
     */
    public void setUserEditableEnforcement(Boolean userEditableEnforcement) {
        set(PROPERTY_USEREDITABLEENFORCEMENT, userEditableEnforcement);
    }

}
