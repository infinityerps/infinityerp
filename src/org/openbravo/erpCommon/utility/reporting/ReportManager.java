/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo Public License
 * Version 1.1 (the "License"), being the Mozilla Public License
 * Version 1.1 with a permitted attribution clause; you may not use this
 * file except in compliance with the License. You may obtain a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Business Momentum b.v.
 * All portions are Copyright (C) 2007-2024 Openbravo SLU
 * All Rights Reserved. 
 * Contributor(s):  Business Momentum b.v. (http://www.businessmomentum.eu).
 *************************************************************************
 */
package org.openbravo.erpCommon.utility.reporting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.openbravo.base.exception.OBException;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.base.weld.WeldUtils;
import org.openbravo.client.application.attachment.AttachImplementationManager;
import org.openbravo.client.application.attachment.DocumentNotFoundException;
import org.openbravo.client.application.attachment.ReprintableDocumentManager;
import org.openbravo.client.application.attachment.ReprintableDocumentManager.Format;
import org.openbravo.client.application.attachment.ReprintableInvoice;
import org.openbravo.client.application.attachment.ReprintableOrder;
import org.openbravo.client.application.attachment.ReprintableSourceDocument;
import org.openbravo.client.application.attachment.TransformerNotFoundException;
import org.openbravo.client.application.report.ReportingUtils;
import org.openbravo.client.application.report.ReportingUtils.ExportType;
import org.openbravo.client.application.report.language.ReportLanguageHandler;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBDal;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.erpCommon.utility.OBMessageUtils;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.model.ad.ui.Tab;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.common.order.Order;
import org.openbravo.service.db.DalConnectionProvider;
import org.openbravo.utils.Replace;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

public class ReportManager {
  private static Logger log4j = LogManager.getLogger();
  private static final String TEMP_REPORT_DIR = "tmp";
  public static final String GENERATED_BY_PRINTING = "Generated by printing ";
  public static final String GENERATED_BY_EMAILING = "Generated by e-mailing ";

  private ConnectionProvider _connectionProvider;
  private String _strBaseDesignPath;
  private String _strDefaultDesignPath;
  private String language;
  private String _strBaseWeb; // BASE WEB!!!!!!
  private String _prefix;
  private String _strAttachmentPath;

  public ReportManager(String ftpDirectory, String replaceWithFull, String baseDesignPath,
      String defaultDesignPath, String prefix, boolean multiReport) {
    this(new DalConnectionProvider(false), ftpDirectory, replaceWithFull, baseDesignPath,
        defaultDesignPath, prefix, multiReport);
  }

  public ReportManager(ConnectionProvider connectionProvider, String ftpDirectory,
      String replaceWithFull, String baseDesignPath, String defaultDesignPath, String prefix,
      boolean multiReport) {
    _connectionProvider = connectionProvider;
    _strBaseWeb = replaceWithFull;
    _strBaseDesignPath = baseDesignPath;
    _strDefaultDesignPath = defaultDesignPath;
    _strAttachmentPath = ftpDirectory;
    _prefix = prefix;

    // Strip of ending slash character
    if (_strBaseDesignPath.endsWith("/")) {
      _strBaseDesignPath = _strBaseDesignPath.substring(0, _strBaseDesignPath.length() - 1);
    }
    if (_strDefaultDesignPath.endsWith("/")) {
      _strDefaultDesignPath = _strDefaultDesignPath.substring(0,
          _strDefaultDesignPath.length() - 1);
    }
  }

  public JasperPrint processReport(Report report, VariablesSecureApp variables)
      throws ReportingException {
    return processReport(report, variables, Collections.emptyMap());
  }

  public JasperPrint processReport(Report report, VariablesSecureApp variables,
      Map<String, Object> extraDesignParameters) throws ReportingException {

    setTargetDirectory(report);
    language = variables.getLanguage();
    final String baseDesignPath = _prefix + "/" + _strBaseDesignPath + "/" + _strDefaultDesignPath;

    String templateLocation = report.getTemplateInfo().getTemplateLocation();
    templateLocation = Replace.replace(
        Replace.replace(templateLocation, "@basedesign@", baseDesignPath), "@baseattach@",
        _strAttachmentPath);
    templateLocation = Replace.replace(templateLocation, "//", "/");
    final String templateFile = templateLocation + report.getTemplateInfo().getTemplateFilename();

    final HashMap<String, Object> designParameters = populateDesignParameters(variables, report);
    designParameters.put("TEMPLATE_LOCATION", templateLocation);
    designParameters.putAll(extraDesignParameters);
    JasperPrint jasperPrint = null;

    String salesOrder = report.getCheckSalesOrder();
    if (salesOrder != null && salesOrder.equals("Y")) {
      designParameters.put("DOCUMENT_NAME",
          Utility.messageBD(_connectionProvider, "Sales", language) + " "
              + Utility.messageBD(_connectionProvider, "Invoice", language));
    } else {
      designParameters.put("DOCUMENT_NAME",
          Utility.messageBD(_connectionProvider, "Purchase", language) + " "
              + Utility.messageBD(_connectionProvider, "Invoice", language));
    }
    try {
      jasperPrint = ReportingUtils.generateJasperPrint(templateFile, designParameters,
          _connectionProvider, null);
    } catch (final Exception exception) {
      log4j.error(exception.getMessage());
      exception.getStackTrace();
      throw new ReportingException(exception);
    }

    return jasperPrint;
  }

  private String getAttachmentPath() {
    return _strAttachmentPath;
  }

  private String getTempReportDir() {
    return TEMP_REPORT_DIR;
  }

  public void setTargetDirectory(Report report) {
    final File targetDirectory = new File(getAttachmentPath() + "/" + getTempReportDir());
    if (!targetDirectory.exists()) {
      targetDirectory.mkdirs();
    }
    report.setTargetDirectory(targetDirectory);
  }

  public void saveTempReport(Report report, VariablesSecureApp vars) {
    try {
      if (!canReprint(report, vars)) {
        JasperPrint jasperPrint = processReport(report, vars);
        saveReport(report, jasperPrint);
        return;
      }
      ReprintableDocumentManager reprintableManager = WeldUtils
          .getInstanceFromStaticBeanManager(ReprintableDocumentManager.class);
      String documentId = report.getDocumentId();
      DocumentType documentType = report.getDocumentType();
      try {
        ReprintableSourceDocument<?> reprintableSource = DocumentType.SALESORDER.equals(
            documentType) ? new ReprintableOrder(documentId) : new ReprintableInvoice(documentId);
        reprintableManager.findReprintableDocument(reprintableSource);
        File reprintable = new File(
            report.getTargetDirectory().toString() + '/' + report.getFilename());
        try (OutputStream outputStream = new FileOutputStream(reprintable)) {
          reprintableManager.download(reprintableSource, outputStream, Format.PDF);
        } catch (IOException ex) {
          throw new OBException("Error reading reprintable for document " + report.getDocumentId(),
              ex);
        } catch (TransformerNotFoundException ex) {
          throw new OBException(OBMessageUtils.messageBD("UnsupportedReprintDocumentFormat"));
        }
      } catch (DocumentNotFoundException dex) {
        JasperPrint jasperPrint = processReport(report, vars);
        saveReport(report, jasperPrint);
        Path tmp = null;
        try {
          JasperPrint jasperPrintForDuplicate = processReport(report, vars,
              Map.of("IS_DUPLICATE", true));
          tmp = Files.createTempFile("jasper", ".tmp");
          ReportingUtils.saveReport(jasperPrintForDuplicate, ExportType.PDF, Collections.emptyMap(),
              tmp.toFile());
          JSONObject jsonReprintable = new JSONObject();
          jsonReprintable.put("documentData",
              Base64.getEncoder().encodeToString(Files.readAllBytes(tmp)));
          jsonReprintable.put("documentId", documentId);
          jsonReprintable.put("documentType",
              documentType.equals(DocumentType.SALESORDER) ? "ORDER" : "INVOICE");
          jsonReprintable.put("documentFormat", "PDF");
          reprintableManager.upload(jsonReprintable);
        } catch (IOException | JSONException | JRException ex) {
          throw new OBException("Error creating reprintable for document " + report.getDocumentId(),
              ex);
        } finally {
          try {
            if (tmp != null) {
              Files.deleteIfExists(tmp);
            }
          } catch (IOException ex) {
            log4j.error("Error deleting file {}", tmp);
          }
        }
      }
    } catch (final ReportingException e) {
      log4j.error(e.getMessage());
      e.printStackTrace();
    }
  }

  public boolean canReprint(Report report, VariablesSecureApp vars) {
    ReprintableDocumentManager reprintableManager = WeldUtils
        .getInstanceFromStaticBeanManager(ReprintableDocumentManager.class);
    try {
      OBContext.setAdminMode(true);
      Tab tab = OBDal.getInstance().get(Tab.class, vars.getSessionValue("inpTabId"));
      if (!reprintableManager.isReprintableDocumentsWindow(tab.getWindow().getId())) {
        return false;
      }
      String documentId = report.getDocumentId();
      DocumentType documentType = report.getDocumentType();
      String orgId = null;
      if (DocumentType.SALESORDER.equals(documentType)) {
        orgId = OBDal.getInstance().get(Order.class, documentId).getOrganization().getId();
      } else if (DocumentType.SALESINVOICE.equals(documentType)) {
        orgId = OBDal.getInstance().get(Invoice.class, documentId).getOrganization().getId();
      }
      return orgId != null && reprintableManager.isReprintDocumentsEnabled(orgId);
    } finally {
      OBContext.restorePreviousMode();
    }
  }

  private void saveReport(Report report, JasperPrint jasperPrint) {
    String separator = "";
    if (!report.getTargetDirectory().toString().endsWith("/")) {
      separator = "/";
    }
    final String target = report.getTargetDirectory() + separator + report.getFilename();
    try {
      ReportingUtils.saveReport(jasperPrint, ExportType.PDF, null, new File(target));
    } catch (final JRException e) {
      e.printStackTrace();
    }
  }

  public File createAttachmentForReport(ConnectionProvider connectionProvider, Report report,
      String tableId, VariablesSecureApp vars) throws ReportingException, IOException {
    return createAttachmentForReport(connectionProvider, report, tableId, vars,
        GENERATED_BY_PRINTING);
  }

  public File createAttachmentForReport(ConnectionProvider connectionProvider, Report report,
      String tableId, VariablesSecureApp vars, String textForAttachment)
      throws ReportingException, IOException {
    if (report.isAttached()) {
      throw new ReportingException(
          Utility.messageBD(connectionProvider, "AttachmentExists", vars.getLanguage()));
    }

    final JasperPrint jasperPrint = processReport(report, vars);
    saveReport(report, jasperPrint);

    final File sourceFile = new File(report.getTargetLocation());

    // We create a copy of the original file which will be the one used by the upload process. This
    // is because the default attach implementation handler is deleting the file after completing
    // the upload process and this way we prevent the deletion of the original file.
    final File temporaryAttachFolder = new File(ReportingUtils.getTempFolder());
    if (!temporaryAttachFolder.exists()) {
      temporaryAttachFolder.mkdirs();
    }
    FileUtils.copyFileToDirectory(sourceFile, temporaryAttachFolder, true);
    final File attachFile = new File(
        temporaryAttachFolder.getAbsolutePath() + File.separator + sourceFile.getName());

    AttachImplementationManager aim = WeldUtils
        .getInstanceFromStaticBeanManager(AttachImplementationManager.class);

    // Add Core's default desc parameter id with textForAttachment for backwards compatibility
    Map<String, String> requestParams = new HashMap<String, String>();
    requestParams.put("E22E8E3B737D4A47A691A073951BBF16", textForAttachment);

    aim.upload(requestParams, vars.getSessionValue("inpTabId"), report.getDocumentId(),
        vars.getOrg(), attachFile);

    report.setAttached(true);

    return sourceFile;
  }

  private HashMap<String, Object> populateDesignParameters(VariablesSecureApp variables,
      Report report) {
    final String baseDesignPath = _prefix + "/" + _strBaseDesignPath + "/" + _strDefaultDesignPath;
    final HashMap<String, Object> designParameters = new HashMap<String, Object>();

    designParameters.put("DOCUMENT_ID", report.getDocumentId());

    designParameters.put("BASE_ATTACH", _strAttachmentPath);
    designParameters.put("BASE_WEB", _strBaseWeb);
    designParameters.put("BASE_DESIGN", baseDesignPath);
    designParameters.put("IS_IGNORE_PAGINATION", false);
    designParameters.put("USER_CLIENT",
        Utility.getContext(_connectionProvider, variables, "#User_Client", ""));
    designParameters.put("USER_ORG",
        Utility.getContext(_connectionProvider, variables, "#User_Org", ""));
    designParameters.put("REPORT_QUALIFIER",
        Map.of("QUALIFIER_TYPE", ReportLanguageHandler.ReportType.DOCUMENT, "QUALIFIER_VALUE",
            report.getDocumentType().toString()));
    designParameters.put("REPORT_PARAMETERS", report);

    final DecimalFormatSymbols dfs = new DecimalFormatSymbols();
    dfs.setDecimalSeparator(variables.getSessionValue("#AD_ReportDecimalSeparator").charAt(0));
    dfs.setGroupingSeparator(variables.getSessionValue("#AD_ReportGroupingSeparator").charAt(0));
    final DecimalFormat NumberFormat = new DecimalFormat(
        variables.getSessionValue("#AD_ReportNumberFormat"), dfs);
    designParameters.put("NUMBERFORMAT", NumberFormat);

    if (report.getTemplateInfo() != null) {
      designParameters.put("SHOW_LOGO", report.getTemplateInfo().getShowLogo());
      designParameters.put("SHOW_COMPANYDATA", report.getTemplateInfo().getShowCompanyData());
      designParameters.put("HEADER_MARGIN", report.getTemplateInfo().getHeaderMargin());
    }

    return designParameters;
  }

}
