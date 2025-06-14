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
 * All portions are Copyright (C) 2023 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
 */
package org.openbravo.client.application.attachment;

import java.util.Optional;

import org.hibernate.criterion.Restrictions;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBDal;
import org.openbravo.model.ad.utility.ReprintableDocument;

/**
 * Represents a document used as the source to generate the data of a {@link ReprintableDocument}
 */
public abstract class ReprintableSourceDocument<D extends BaseOBObject & ClientEnabled & OrganizationEnabled> {
  private String id;

  /**
   * Supported document types that can be linked to a {@link ReprintableDocument}
   */
  public enum DocumentType {
    INVOICE, ORDER;
  }

  /**
   * Retrieves a {@link ReprintableSourceDocument} instance with the information of the document
   * identified by the provided ID and document type.
   *
   * @param id
   *          The ID of the BaseOBObject of the source document
   * @param documentType
   *          The type of source document
   *
   * @return the source document with the information of the document referenced by the given
   *         parameters
   */
  public static ReprintableSourceDocument<?> newSourceDocument(String id,
      DocumentType documentType) {
    switch (documentType) {
      case INVOICE:
        return new ReprintableInvoice(id);
      case ORDER:
        return new ReprintableOrder(id);
      default:
        throw new IllegalArgumentException("Unknown document type");
    }
  }

  /**
   * @return the DAL property that references to the source document in the
   *         {@link ReprintableDocument} model
   */
  abstract String getProperty();

  /**
   * @return the BaseOBObject of the source document, obtained based on its type
   */
  abstract D getBaseDocument();

  /**
   * @return a name that identifies the document
   */
  protected abstract String getName();

  /**
   * Builds a new source document for a {@link ReprintableDocument}
   * 
   * @param id
   *          the ID of the source document
   */
  protected ReprintableSourceDocument(String id) {
    this.id = id;
  }

  protected String getId() {
    return id;
  }

  /**
   * @return a name that can be safely used as the file name of a {@link ReprintableDocument} linked
   *         to this document. By default is the value returned by {@link #getName()} method with
   *         the slashes ("/"), considered as path delimiters, replaced with hyphens ("-").
   */
  String getSafeName() {
    return getName().replace("/", "-");
  }

  /**
   * @return true if the document exists in the database or false otherwise
   */
  public boolean exists() {
    try {
      return OBDal.getInstance()
          .createCriteria(getBaseDocument().getEntity().getName())
          .add(Restrictions.eq("id", id))
          .setFilterOnReadableClients(false)
          .setFilterOnReadableOrganization(false)
          .setFilterOnActive(false)
          .count() > 0;
    } catch (Exception ex) {
      return false;
    }
  }

  /**
   * @return an Optional representing the ReprintableDocument linked to the document. If the
   *         document does not have a ReprintableDocument linked to it, an empty Optional is
   *         returned.
   */
  public Optional<ReprintableDocument> getReprintableDocument() {
    // use admin mode because the ReprintableDocument entity is not readable by default
    try {
      OBContext.setAdminMode(true);
      ReprintableDocument document = (ReprintableDocument) OBDal.getInstance()
          .createCriteria(ReprintableDocument.class)
          .add(Restrictions.eq(getProperty(), getBaseDocument()))
          .setMaxResults(1)
          .uniqueResult();
      return Optional.ofNullable(document);
    } finally {
      OBContext.restorePreviousMode();
    }
  }
}
