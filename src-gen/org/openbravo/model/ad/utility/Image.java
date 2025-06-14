
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
package org.openbravo.model.ad.utility;

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
 * Entity class for entity ADImage (stored in table AD_Image).
 * <br>
 * Help: {@literal This table stores images that can be used in different places. An image can be stored as
     *       an URL or as binary data.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Image extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Image";
    public static final String ENTITY_NAME = "ADImage";

    /**
     * Property id stored in column AD_Image_ID in table AD_Image<br>
     * Help: {@literal Defines a system image}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Image 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Image 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Image 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Image 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Image 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Image 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Image 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Image 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property imageURL stored in column ImageURL in table AD_Image<br>
     * Help: {@literal URL of image; The image is not stored in the database, but retrieved at runtime. The image
     *       can be a gif, jpeg or png.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_IMAGEURL = "imageURL";

    /**
     * Property bindaryData stored in column BinaryData in table AD_Image<br>
     * Help: {@literal The Binary field stores binary data.}
     * 
     */
    public static final String PROPERTY_BINDARYDATA = "bindaryData";

    /**
     * Property width stored in column Width in table AD_Image
     * 
     */
    public static final String PROPERTY_WIDTH = "width";

    /**
     * Property height stored in column Height in table AD_Image
     * 
     */
    public static final String PROPERTY_HEIGHT = "height";

    /**
     * Property mimetype stored in column Mimetype in table AD_Image
     * 
     */
    public static final String PROPERTY_MIMETYPE = "mimetype";


    public Image() {
        setDefaultValue(PROPERTY_ACTIVE, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Image#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Image#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Image#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Image#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Image#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Image#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Image#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Image#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Image#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Image#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Image#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Image#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Image#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Image#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Image#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Image#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Image#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Image#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Image#PROPERTY_IMAGEURL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getImageURL() {
        return (String) get(PROPERTY_IMAGEURL);
    }
    /**
     * @see Image#PROPERTY_IMAGEURL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setImageURL(String imageURL) {
        set(PROPERTY_IMAGEURL, imageURL);
    }

    /**
     * @see Image#PROPERTY_BINDARYDATA
     * 
     */
    public byte[] getBindaryData() {
        return (byte[]) get(PROPERTY_BINDARYDATA);
    }
    /**
     * @see Image#PROPERTY_BINDARYDATA
     * 
     */
    public void setBindaryData(byte[] bindaryData) {
        set(PROPERTY_BINDARYDATA, bindaryData);
    }

    /**
     * @see Image#PROPERTY_WIDTH
     * 
     */
    public Long getWidth() {
        return (Long) get(PROPERTY_WIDTH);
    }
    /**
     * @see Image#PROPERTY_WIDTH
     * 
     */
    public void setWidth(Long width) {
        set(PROPERTY_WIDTH, width);
    }

    /**
     * @see Image#PROPERTY_HEIGHT
     * 
     */
    public Long getHeight() {
        return (Long) get(PROPERTY_HEIGHT);
    }
    /**
     * @see Image#PROPERTY_HEIGHT
     * 
     */
    public void setHeight(Long height) {
        set(PROPERTY_HEIGHT, height);
    }

    /**
     * @see Image#PROPERTY_MIMETYPE
     * 
     */
    public String getMimetype() {
        return (String) get(PROPERTY_MIMETYPE);
    }
    /**
     * @see Image#PROPERTY_MIMETYPE
     * 
     */
    public void setMimetype(String mimetype) {
        set(PROPERTY_MIMETYPE, mimetype);
    }

}
