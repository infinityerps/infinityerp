package it.embio.exportdata.utility;

import java.io.File;
import java.io.FileOutputStream;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringEscapeUtils;
import org.openbravo.base.exception.OBException;
import org.openbravo.base.filter.IsIDFilter;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.dal.core.OBContext;
import org.openbravo.data.FieldProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.database.SessionInfo;
import org.openbravo.erpCommon.utility.SQLReturnObject;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.service.db.QueryTimeOutUtil;


public class ControlUtility {
	public static void getresultsetdata(ConnectionProvider connectionProvider, String strmainQuery,
			HttpServletResponse response, String sname, Connection conn) throws ServletException {
		String strSql = strmainQuery;

		//System.out.println("Export data start....");
		PreparedStatement st = null;
		ResultSet result;
		
		try {
			

			if (conn != null) {
				conn.setAutoCommit(false);//To avoid memory heap size error.
				st=conn.prepareStatement(strSql);
				st.setFetchSize(100);//To avoid memory heap size error.
				//st = connectionProvider.getPreparedStatement(conn, strSql);
			} else {
				Connection con1=connectionProvider.getConnection();
				con1.setAutoCommit(false);//To avoid memory heap size error.
				st=con1.prepareStatement(strSql);
				st.setFetchSize(100);//To avoid memory heap size error.
				//st = connectionProvider.getPreparedStatement(strSql);
			}
			 
			
			QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
			result = st.executeQuery();
			
			PrintWriter out = response.getWriter();
			CSVWriter csv= new CSVWriter(out);
			response.setContentType("application/vnd.ms-excel");
			response.setHeader("Content-Disposition", "attachment; filename=" + sname.replace(" ", "_") + ".csv");
			try {
				long start1 = System.nanoTime();
				csv.writeAll(result, true);
				long start2 = System.nanoTime();
				long start3 = start2 - start1;
				System.out.println("Total time to generate excel: "+ sname.replace(" ", "_") + ".csv " +start3);
				result.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, e.getMessage(), language));
		} catch (Exception ex) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, ex.getMessage(), language));
		} finally {
			try {
				connectionProvider.releasePreparedStatement(st);
			} catch (Exception ignore) {
				ignore.printStackTrace();
			}
		}
	}
	public static void getresultsetdatainzip(ConnectionProvider connectionProvider, String strmainQuery,
			HttpServletResponse response, String sname, Connection conn) throws ServletException {
		String strSql = strmainQuery;

		//System.out.println("Export data start....");
		PreparedStatement st = null;
		ResultSet result;
		
		try {
			

			if (conn != null) {
				conn.setAutoCommit(false);//To avoid memory heap size error.
				st=conn.prepareStatement(strSql);
				st.setFetchSize(100);//To avoid memory heap size error.
				//st = connectionProvider.getPreparedStatement(conn, strSql);
			} else {
				Connection con1=connectionProvider.getConnection();
				con1.setAutoCommit(false);//To avoid memory heap size error.
				st=con1.prepareStatement(strSql);
				st.setFetchSize(100);//To avoid memory heap size error.
				//st = connectionProvider.getPreparedStatement(strSql);
			}
			 
			
			QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
			result = st.executeQuery();
			response.setContentType("application/zip");
			response.setHeader("Content-Disposition", "attachment; filename=" + sname.replace(" ", "_") + ".zip");
			//ByteArrayOutputStream baos = new ByteArrayOutputStream();
			// OutputStream outStream = response.getOutputStream();
			ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());
			ZipEntry entry = new ZipEntry(sname.replace(" ", "_") + ".csv");
			CSVWriter csv= new CSVWriter(zos);
			
			zos.putNextEntry(entry);
			zos.flush();
			try {
				long start1 = System.nanoTime();
				csv.writeAllzip(result, true);
				zos.closeEntry();
				zos.finish();
				zos.close();
				long start2 = System.nanoTime();
				long start3 = start2 - start1;
				System.out.println("Total time to generate zip: "+ sname.replace(" ", "_") + ".zip " +start3);
				result.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, e.getMessage(), language));
		} catch (Exception ex) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, ex.getMessage(), language));
		} finally {
			try {
				connectionProvider.releasePreparedStatement(st);
			} catch (Exception ignore) {
				ignore.printStackTrace();
			}
		}
	}
	public static File getresultsetdatainFile(ConnectionProvider connectionProvider, String strmainQuery,
			HttpServletResponse response, String sname, Connection conn) throws ServletException {
		String strSql = strmainQuery;

		PreparedStatement st = null;
		ResultSet result;
		FileOutputStream out = null;
		File file = new File(sname.replace(" ", "_") + ".zip");
		try {

			if (conn != null) {
				conn.setAutoCommit(false);//To avoid memory heap size error.
				st=conn.prepareStatement(strSql);
				st.setFetchSize(100);//To avoid memory heap size error.
				//st = connectionProvider.getPreparedStatement(conn, strSql);
			} else {
				Connection con1=connectionProvider.getConnection();
				con1.setAutoCommit(false);//To avoid memory heap size error.
				st=con1.prepareStatement(strSql);
				st.setFetchSize(100);//To avoid memory heap size error.
				//st = connectionProvider.getPreparedStatement(strSql);
			}
			QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
			result = st.executeQuery();
			out = new FileOutputStream(file);
			ZipOutputStream zos = new ZipOutputStream(out);
			ZipEntry entry = new ZipEntry(sname.replace(" ", "_") + ".csv");
			CSVWriter csv= new CSVWriter(zos);
			zos.putNextEntry(entry);
			zos.flush();
		try {
				long start1 = System.nanoTime();
				csv.writeAllzip(result, true);
				zos.closeEntry();
				zos.finish();
				zos.close();
				out.flush();
				out.close();
				result.close();
				long start2 = System.nanoTime();
				long start3 = start2 - start1;
				System.out.println("Total time to email: "+ sname.replace(" ", "_") + ".csv " +start3);
				
				// System.out.println("exceldatabase.xlsx written successfully");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, e.getMessage(), language));
		} catch (Exception ex) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, ex.getMessage(), language));
		} finally {
			try {
				connectionProvider.releasePreparedStatement(st);
			} catch (Exception ignore) {
				ignore.printStackTrace();
			}
		}
		return file;
	}

	public static String getresultgriddata(ConnectionProvider connectionProvider, String strmainQuery, Connection conn)
			throws ServletException {
		String strSql = strmainQuery;

		PreparedStatement st = null;
		ResultSet result;
		StringBuffer strDynamicgriddetails = new StringBuffer();
		strDynamicgriddetails.append("");
		try {

			if (conn != null) {
				st = connectionProvider.getPreparedStatement(conn, strSql);
			} else {
				st = connectionProvider.getPreparedStatement(strSql);
			}
			QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

			result = st.executeQuery();

			try {
				ResultSetMetaData rsMetaData = result.getMetaData();
				int numberOfColumns = rsMetaData.getColumnCount();
				int currentRow = 0;
				strDynamicgriddetails.append("<tr class=\"DataGrid_Body_Row\"> ");
				for (int i = 0; i < numberOfColumns; i++) {
					String columnName = rsMetaData.getColumnName(i + 1);
					// write first row
					strDynamicgriddetails
							.append("<th width=\"8%\" class=\"DataGrid_Header_Cell\" >" + columnName + "</th>");

				}
				strDynamicgriddetails.append("</tr>");
				currentRow++;

				while (result.next()) {
					strDynamicgriddetails
							.append("<tr class=\"DataGrid_Body_Row DataGrid_Body_Row_yy\" id=\"funcEvenOddRow1"
									+ currentRow++ + "\">");
					for (int j = 0; j < numberOfColumns; j++) {
						strDynamicgriddetails.append(
								"<td class=\"DataGrid_Body_Cell\" width=\"30%\">" + result.getString(j + 1) + "</td>");
						// row.createCell(j).setCellValue(result.getString(j+1));

					}
					strDynamicgriddetails.append(" </tr>");

				}

				result.close();

				// System.out.println("exceldatabase.xlsx written successfully");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, e.getMessage(), language));
		} catch (Exception ex) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, ex.getMessage(), language));
		} finally {

			try {
				connectionProvider.releasePreparedStatement(st);

			} catch (Exception ignore) {
				ignore.printStackTrace();
			}

		}
		return strDynamicgriddetails.toString();
	}

	public static SQLReturnObject[] getHeadergrid(ConnectionProvider connectionProvider, String strmainQuery,
			Connection conn) throws ServletException {
		String strSql = "Select * from (" + strmainQuery + ") a limit 1";

		PreparedStatement st = null;
		ResultSet result;
		SQLReturnObject[] data = null;
		Vector<SQLReturnObject> vAux = new Vector<SQLReturnObject>();
		try {

			if (conn != null) {
				st = connectionProvider.getPreparedStatement(conn, strSql);
			} else {
				st = connectionProvider.getPreparedStatement(strSql);
			}
			QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

			result = st.executeQuery();
			try {
				ResultSetMetaData rsMetaData = result.getMetaData();
				int numberOfColumns = rsMetaData.getColumnCount();

				for (int i = 0; i < numberOfColumns; i++) {
					SQLReturnObject dataAux = new SQLReturnObject();
					String columnName = rsMetaData.getColumnName(i + 1);
					dataAux.setData("columnname", columnName);
					dataAux.setData("gridcolumnname", columnName);
					dataAux.setData("adReferenceId", "AD_Reference_ID");
					dataAux.setData("adReferenceValueId", "AD_ReferenceValue_ID");

					if (i == 0) {
						dataAux.setData("iskey", "true");
						dataAux.setData("isidentifier", "true");
					} else {
						dataAux.setData("iskey", "false");
						dataAux.setData("isidentifier", "false");
					}
					dataAux.setData("isvisible", "true");
					dataAux.setData("name", columnName);
					dataAux.setData("type", "string");
					dataAux.setData("width", "225");
					vAux.addElement(dataAux);

				}
				data = new SQLReturnObject[vAux.size()];
				vAux.copyInto(data);
				result.close();

				// System.out.println("exceldatabase.xlsx written successfully");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, e.getMessage(), language));
		} catch (Exception ex) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, ex.getMessage(), language));
		} finally {

			try {
				connectionProvider.releasePreparedStatement(st);

			} catch (Exception ignore) {
				ignore.printStackTrace();
			}

		}
		return data;
	}

	public static SQLReturnObject[] getgriddata(ConnectionProvider connectionProvider, String strmainQuery,
			Connection conn, String pgLimit) throws ServletException {
		String strSql = strmainQuery;
		strSql = "select * from (" + strSql + ") a where 1=1 ";
		strSql = strSql + ((pgLimit == null || pgLimit.equals("")) ? "" : " LIMIT " + pgLimit);

		PreparedStatement st = null;
		ResultSet result;
		SQLReturnObject[] data = null;
		Vector<SQLReturnObject> vAux = new Vector<SQLReturnObject>();
		try {

			if (conn != null) {
				st = connectionProvider.getPreparedStatement(conn, strSql);
			} else {
				st = connectionProvider.getPreparedStatement(strSql);
			}
			QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

			result = st.executeQuery();

			try {
				ResultSetMetaData rsMetaData = result.getMetaData();
				int numberOfColumns = rsMetaData.getColumnCount();
				while (result.next()) {
					SQLReturnObject dataAux = new SQLReturnObject();
					for (int j = 0; j < numberOfColumns; j++) {
						String columnName = rsMetaData.getColumnName(j + 1);
						dataAux.setData(columnName, result.getString(j + 1));

					}
					vAux.addElement(dataAux);

				}
				data = new SQLReturnObject[vAux.size()];
				vAux.copyInto(data);
				result.close();

				// System.out.println("exceldatabase.xlsx written successfully");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, e.getMessage(), language));
		} catch (Exception ex) {

			String language = OBContext.getOBContext().getLanguage().getLanguage();
			throw new OBException(Utility.messageBD(connectionProvider, ex.getMessage(), language));
		} finally {

			try {
				connectionProvider.releasePreparedStatement(st);

			} catch (Exception ignore) {
				ignore.printStackTrace();
			}

		}
		return data;
	}

	public static String datecontrolformat(String sparaid, String scaption, String sinpname, Integer sSize,
			Boolean isrequired, String sdefaultvalue) {
		sSize = 10;
		StringBuffer text = new StringBuffer();

		text.append("<tr>");
		text.append(" <td class=\"TitleCell\"><span class=\"LabelText\">" + scaption + "</span></td>");
		text.append(" <td class=\"TextBox_btn_ContentCell\"> ");
		text.append(
				"  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" summary=\"\"  style=\"padding-top: 0px;\">");
		text.append("     <tr>");
		text.append("       <td class=\"TextBox_ContentCell\">");
		text.append(
				"         <input dojoType=\"openbravo:DateTextbox\"  displayFormat=\"DD-MM-YYYY\" saveFormat=\"DD-MM-YYYY\"  class=\"TextBox_btn_OneCell_width required\" required=\"true\" type=\"text\" name=\""
						+ sinpname + "\" id=\"" + sparaid + "\" size=\"" + sSize + "\" maxlength=\"10\" value=\""
						+ sdefaultvalue
						+ "\" onkeyup=\"autoCompleteDate(this.textbox, this.displayFormat);return true;\"></input><script>djConfig.searchIds.push(\""
						+ sparaid + "\");</script>");
		text.append("       </td>");
		text.append("       <td class=\"FieldButton_bg\">");
		text.append(
				"         <a class=\"FieldButtonLink\" href=\"#\" onfocus=\"setWindowElementFocus(this); window.status='DD-MM-YYYY'; return true;\" onblur=\"window.status=''; return true;\" onkeypress=\"this.className='FieldButtonLink_active'; return true;\" onkeyup=\"this.className='FieldButtonLink_focus'; return true;\" onclick=\"showCalendar('frmMain."
						+ sinpname + "', document.frmMain." + sinpname + ".value, false);return false;\" >");
		text.append(
				"         <table class=\"FieldButton\" onmouseout=\"this.className='FieldButton';window.status='';return true;\" onmouseover=\"this.className='FieldButton_hover';window.status='Show calendar';return true;\" onmousedown=\"this.className='FieldButton_active';return true;\" onmouseup=\"this.className='FieldButton';return true;\">");
		text.append("           <tr>");
		text.append("             <td class=\"FieldButton_bg\">");
		text.append(
				"               <img alt=\"Calendar\" class=\"FieldButton_Icon FieldButton_Icon_Calendar\" title=\"Calendar\" src=\"../web/images/blank.gif\" border=\"0\"></img>");
		text.append("             </td>");
		text.append("           </tr>");
		text.append("         </table>");
		text.append("         </a>");
		text.append("       </td>");
		text.append("     </tr>");
		text.append("   </table>");
		text.append("</td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String reportname(String sreportname) {
		StringBuffer text = new StringBuffer();

		text.append("<tr>");
		text.append("<td colspan=\"6\">");
		text.append("<table class=\"FieldGroup\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">");
		text.append("<tbody>");
		text.append("<tr class=\"FieldGroup_TopMargin\"/>");
		text.append("<tr>");
		text.append(
				"<td class=\"FieldGroupTitle_Left\"><img class=\"FieldGroupTitle_Left_bg\" border=\"0\" src=\"../web/images/blank.gif\"/></td>");
		text.append("<td class=\"FieldGroupTitle\">" + sreportname + "</td>");
		text.append(
				"<td class=\"FieldGroupTitle_Right\"><img class=\"FieldGroupTitle_Right_bg\" border=\"0\" src=\"../web/images/blank.gif\"/></td>");
		text.append("<td class=\"FieldGroupContent\"/>");
		text.append("</tr>");
		text.append("<tr class=\"FieldGroup_BottomMargin\"/>");
		text.append("</tbody>");
		text.append("</table>");
		text.append("</td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String comboboxcontrolformat(String scaption, String sparaid, String sinpname, String Stroptiondata,
			String sonchangedfunction) {
		StringBuffer text = new StringBuffer();

		text.append("<tr>");
		text.append("<td class=\"TitleCell\"><span class=\"LabelText\">" + scaption + "</span></td>");
		text.append("<td class=\"Combo_ContentCell\" colspan=\"2\"> <select  name=\"" + sinpname + "\" id=\"" + sparaid
				+ "\" onchange=\"" + sonchangedfunction + "\" class=\"Combo Combo_TwoCells_width\">");
		text.append("<option value=\"\"></option>" + Stroptiondata + "");
		text.append("</select></td>");
		text.append("<td class=\"ContentCell\"></td>");
		text.append("<td class=\"TitleCell\"></td>");
		text.append("<td class=\"ContentCell\"></td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String radiobuttoncontrolformat(String scaption, String sparaid, String sinpname,
			String sdefaultvalue) {
		StringBuffer text = new StringBuffer();

		text.append("<td class=\"TitleCell\"><span class=\"LabelText\">" + scaption + "</span></td>");
		text.append(
				"<td class=\"Radio_Check_ContentCell\"><span class=\"Radio_container_NOT_Focused\"><input type=\"radio\" name=\""
						+ sinpname + "\" value=\"\" " + sdefaultvalue + " id=\"" + sparaid + "\"></input></span>");

		return text.toString();
	}

	public static String textboxcontrolformat(String scaption, String sparaid, String sinpname, String sdefaultvalue) {
		StringBuffer text = new StringBuffer();
		text.append("<tr>");
		text.append("<td class=\"TitleCell\"><span class=\"LabelText\">" + scaption + "</span></td>");
		text.append(
				"<td class=\"TextBox_ContentCell\"> <input dojotype=\"openbravo:ValidationTextbox\" class=\"TextBox_OneCell_width\" type=\"text\" name=\""
						+ sinpname + "\" value=\"" + sdefaultvalue + "\" id=\"" + sparaid
						+ "\"></input><script>djConfig.searchIds.push(\"" + sparaid + "\");</script>");
		text.append("<td class=\"TitleCell\"></td>");
		text.append("<td class=\"ContentCell\"></td>");
		text.append("<td class=\"ContentCell\"></td>");
		text.append("<td class=\"ContentCell\"></td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String checkboxcontrolformat(String scaption, String sparaid, String sinpname, String sdefaultvalue) {
		StringBuffer text = new StringBuffer();
		text.append("<tr>");
		text.append("<td class=\"TitleCell\"><span class=\"LabelText\">" + scaption + "</span></td>");
		text.append(
				"<td class=\"Radio_Check_ContentCell\"><span class=\"Checkbox_container_NOT_Focused\"><input type=\"checkbox\" name=\""
						+ sinpname + "\" id=\"" + sparaid + "\" value=\"\" " + sdefaultvalue + "></input></span></td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String parseQuery(String strSQl, VariablesSecureApp vars) {
		if (strSQl.contains("@#ad_org_id@")) {
			strSQl = strSQl.replace("@#ad_org_id@", "'" + vars.getOrg() + "'");
		}
		if (strSQl.contains("@#ad_user_id@")) {
			strSQl = strSQl.replace("@#ad_user_id@", "'" + vars.getUser() + "'");
		}
		if (strSQl.contains("@#ad_role_id@")) {
			strSQl = strSQl.replace("@#ad_role_id@", "'" + vars.getRole() + "'");
		}
		if (strSQl.contains("@#ad_client_id@")) {
			strSQl = strSQl.replace("@#ad_client_id@", "'" + vars.getClient() + "'");
		}
		if (strSQl.contains("@#m_warehouse_id@")) {
			strSQl = strSQl.replace("@#m_warehouse_id@", "'" + vars.getWarehouse() + "'");
		}

		return strSQl;
	}

	public static String parsemainQuery(String strSQl, VariablesSecureApp vars, String scontrolid,
			String scontrolinpname, String scontroltype, HttpServletRequest request) throws Exception {
		if (strSQl.contains("@" + scontrolinpname + "@")) {

			if (scontroltype.equals("DT")) {
				String svalue = vars.getGlobalVariable(scontrolinpname, "exportdatambs|" + scontrolid, "");
				String sdate = new SimpleDateFormat("dd-MM-yyyy").parse(svalue).toString();
				strSQl = strSQl.replace("@" + scontrolinpname + "@", "'" + sdate + "'");
			}
			if (scontroltype.equals("CMB") || scontroltype.equals("TXT") || scontroltype.equals("SLS")) {
				String svalue = vars.getGlobalVariable(scontrolinpname, "exportdatambs|" + scontrolid, "");
				strSQl = strSQl.replace("@" + scontrolinpname + "@", "'" + svalue + "'");
			}
			if (scontroltype.equals("CHK")) {
				String svalue = request.getParameter(scontrolinpname);
				String stryesno = "N";
				if (svalue != null) {
					stryesno = "Y";
				}
				strSQl = strSQl.replace("@" + scontrolinpname + "@", "'" + stryesno + "'");

			}
			if (scontroltype.equals("LST")) {
				String svalue = vars.getInGlobalVariable(scontrolinpname, "exportdatambs|" + scontrolid, "",
						IsIDFilter.instance);
				strSQl = strSQl.replace("@" + scontrolinpname + "@", "" + svalue + "");
			}
		}

		return strSQl;
	}

	public static String arrayDobleEntrada(String strArrayName, FieldProvider[] data) {
		StringBuffer strArray = new StringBuffer();
		if (data.length == 0) {
			strArray.append("null");
			return strArray.toString();
		}
		strArray.append("new Array(");
		for (int i = 0; i < data.length; i++) {
			strArray.append("new Array('");
			strArray.append(StringEscapeUtils.escapeHtml(data[i].getField("valid")) + "','");
			strArray.append(data[i].getField("id") + "','" + data[i].getField("name"));
			strArray.append("')");
			if (i < data.length - 1)
				strArray.append(", ");
		}
		strArray.append(")");
		return strArray.toString();
	}

	public static String generatedbuttonheading(String strheading) {
		StringBuffer text = new StringBuffer();
		text.append("<tr>");
		text.append("<td colspan=\"6\">");
		text.append("<table class=\"FieldGroup\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">");
		text.append("<tbody>");
		text.append("<tr class=\"FieldGroup_TopMargin\"/>");
		text.append("<tr>");
		text.append(
				"<td class=\"FieldGroupTitle_Left\"><img class=\"FieldGroupTitle_Left_bg\" border=\"0\" src=\"../web/images/blank.gif\"/></td>");
		text.append("<td class=\"FieldGroupTitle\">Export Data</td>");
		text.append(
				"<td class=\"FieldGroupTitle_Right\"><img class=\"FieldGroupTitle_Right_bg\" border=\"0\" src=\"../web/images/blank.gif\"/></td>");
		text.append("<td class=\"FieldGroupContent\"/>");
		text.append("</tr>");
		text.append("<tr class=\"FieldGroup_BottomMargin\"/>");
		text.append("</tbody>");
		text.append("</table>");
		text.append("</td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String buttonControlformat(String scaption, String sparaid, String strCommand) {
		StringBuffer text = new StringBuffer();

		text.append("<td class=\"Button_LeftAlign_ContentCell\" colspan=\"0\">");
		text.append("<div>");
		text.append("<button type=\"button\"");
		text.append("id=\"" + sparaid + "\" ");
		text.append("class=\"ButtonLink\" ");
		text.append("onclick=\"submitCommandForm('" + strCommand + "', false, null, null);return false;\" ");
		text.append(
				"onfocus=\"buttonEvent('onfocus', this); window.status='View Results in a New Window'; return true;\" ");
		text.append("onblur=\"buttonEvent('onblur', this);\" ");
		text.append("onkeyup=\"buttonEvent('onkeyup', this);\" ");
		text.append("onkeydown=\"buttonEvent('onkeydown', this);\" ");
		text.append("onkeypress=\"buttonEvent('onkeypress', this);\" ");
		text.append("onmouseup=\"buttonEvent('onmouseup', this);\" ");
		text.append("onmousedown=\"buttonEvent('onmousedown', this);\"");
		text.append(
				"onmouseover=\"buttonEvent('onmouseover', this); window.status='View Results in a New Window'; return true;\"");
		text.append("onmouseout=\"buttonEvent('onmouseout', this);\">");
		text.append("<table class=\"Button\">");
		text.append("<tr>");
		text.append(
				"<td class=\"Button_left\"><img class=\"Button_Icon Button_Icon_html\" alt=\"View Results in a New Window\" title=\"View Results in a New Window\" src=\"../web/images/blank.gif\" border=\"0\" /></td>");
		text.append("<td class=\"Button_text\">" + scaption + "</td>");
		text.append("<td class=\"Button_right\"></td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</button>");
		text.append("</div>");
		text.append("</td>");
		text.append("<td class=\"ContentCell\"></td>");

		return text.toString();
	}

	public static String listControlformat(String sinpname, String scaption, String sparaid, String sdynamicparalist,
			String stroption) {
		StringBuffer text = new StringBuffer();
		text.append("<tr id=\"Filter2\">");
		text.append("<td class=\"TitleCell\"><span class=\"LabelText\">" + scaption + "</span></td>");
		text.append("<td class=\"List_ContentCell\" colspan=\"2\">");
		text.append("<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		text.append("<tr>");
		text.append("<td>");
		text.append("<select class=\"List_width List_height\" name=\"" + sinpname + "\" multiple=\"\" id=\"" + sparaid
				+ "\">" + stroption + "</select>");
		text.append("</td>");
		text.append("<td class=\"List_Button_ContentCell\">");
		text.append("<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		text.append("<tr>");
		text.append("<td>");
		text.append("<a class=\"List_Button_TopLink\" href=\"#\"");
		text.append(
				"onclick=\"openMultiSearch(null, null, '../it.embio.exportdata.ad_forms/MexdlistMultiple.html', 'SELECTOR_LISTMEXD', false, 'frmMain', '"
						+ sinpname + "'" + sdynamicparalist + ");return false;\"");
		text.append(
				"onfocus=\"setWindowElementFocus(this); window.status='Add';var frm=document.frmMain;markCheckedAllElements(frm."
						+ sinpname + "); return true;\"");
		text.append("onblur=\"window.status=''; return true;\"");
		text.append("onkeypress=\"this.className='List_Button_TopLink_active'; return true;\"");
		text.append("onkeyup=\"this.className='List_Button_TopLink_focus'; return true;\">");
		text.append("<table class=\"List_Button_Top\"");
		text.append("onmousedown=\"this.className='List_Button_Top_active'; return true;\"");
		text.append("onmouseup=\"this.className='List_Button_Top'; return true;\"");
		text.append("onmouseover=\"this.className='List_Button_Top_hover'; window.status='Add'; return true;\"");
		text.append("onmouseout=\"this.className='List_Button_Top'; window.status=''; return true;\">");
		text.append("<tr>");
		text.append("<td class=\"List_Button_Top_bg\">");
		text.append(
				"<img class=\"List_Button_Icon List_Button_Icon_Add\" src=\"../web/images/blank.gif\" alt=\"Add\" title=\"Add\"/>");
		text.append("</td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</a>");
		text.append("</td>");
		text.append("</tr>");
		text.append("<tr>");
		text.append("<td class=\"List_Button_Separator\"></td>");
		text.append("</tr>");
		text.append("<tr>");
		text.append("<td>");
		text.append("<a class=\"List_Button_MiddleLink\" href=\"#\"");
		text.append("onclick=\"clearSelectedElements(document.frmMain." + sinpname + ");return false;\"");
		text.append("onfocus=\"setWindowElementFocus(this); window.status='Delete selected elements'; return true;\"");
		text.append("onblur=\"window.status=''; return true;\"");
		text.append("onkeypress=\"this.className='List_Button_MiddleLink_active'; return true;\"");
		text.append("onkeyup=\"this.className='List_Button_MiddleLink_focus'; return true;\">");
		text.append("<table class=\"List_Button_Middle\"");
		text.append("onmousedown=\"this.className='List_Button_Middle_active'; return true;\"");
		text.append("onmouseup=\"this.className='List_Button_Middle'; return true;\"");
		text.append(
				"onmouseover=\"this.className='List_Button_Middle_hover'; window.status='Delete selected elements'; return true;\"");
		text.append("onmouseout=\"this.className='List_Button_Middle'; window.status=''; return true;\">");
		text.append("<tr>");
		text.append("<td class=\"List_Button_Middle_bg\">");
		text.append(
				"<img class=\"List_Button_Icon List_Button_Icon_Delete\" src=\"../web/images/blank.gif\" alt=\"Delete selected elements\" title=\"Delete selected elements\"/>");
		text.append("</td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</a>");
		text.append("</td>");
		text.append("</tr>");
		text.append("<tr>");
		text.append("<td class=\"List_Button_Separator\"></td>");
		text.append("</tr>");
		text.append("<tr>");
		text.append("<td>");
		text.append("<a class=\"List_Button_BottomLink\" href=\"#\"");
		text.append("onclick=\"clearList(document.frmMain." + sinpname + ");return false;\"");
		text.append("onfocus=\"setWindowElementFocus(this); window.status='Delete all elements'; return true;\"");
		text.append("onblur=\"window.status=''; return true;\"");
		text.append("onkeypress=\"this.className='List_Button_BottomLink_active'; return true;\"");
		text.append("onkeyup=\"this.className='List_Button_BottomLink_focus'; return true;\">");
		text.append("<table class=\"List_Button_Bottom\"");
		text.append("onmousedown=\"this.className='List_Button_Bottom_active'; return true;\"");
		text.append("onmouseup=\"this.className='List_Button_Bottom'; return true;\"");
		text.append(
				"onmouseover=\"this.className='List_Button_Bottom_hover'; window.status='Delete all elements'; return true;\"");
		text.append("onmouseout=\"this.className='List_Button_Bottom'; window.status=''; return true;\">");
		text.append("<tr>");
		text.append("<td class=\"List_Button_Bottom_bg\">");
		text.append(
				"<img class=\"List_Button_Icon List_Button_Icon_DeleteAll\" src=\"../web/images/blank.gif\" alt=\"Delete all elements\" title=\"Delete all elements\"/>");
		text.append("</td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</a>");
		text.append("</td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String gridcontrolformat(String strTitle, String dynamicstring) {
		StringBuffer text = new StringBuffer();
		text.append(
				"<table cellspacing=\"0\" cellpadding=\"0\" width=\"88%\" class=\"DataGrid_Header_Table DataGrid_Body_Table\" style=\"table-layout: auto;\">");
		text.append("<tr class=\"DataGrid_Body_Row\">");
		text.append(
				"<th colspan=\"5\" class=\"DataGrid_Header_Cell\"><span>Report :</span>&nbsp;<span id=\"fieldDateacct\">"
						+ strTitle + "</span></th>");
		text.append("</tr>");
		text.append(dynamicstring);
		text.append("</table>");
		return text.toString();
	}

	// not used it is for single select grid
	public static String singleselectgrid(String sinpname, String scaption, String sparaid, String sdynamicparalist,
			String sdefaultvalue, String sdefaulttext, String strfunction) {
		StringBuffer text = new StringBuffer();
		text.append("<tr>");
		text.append("<td class=\"TitleCell\"><span class=\"LabelText\">" + scaption + "</span></td>");
		text.append("<td class=\"TextBox_btn_ContentCell\" colspan=\"2\">");
		text.append(
				"<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" summary=\"\"  style=\"padding-top: 0px;\">");
		text.append("<tr>");
		text.append("<td class=\"TextBox_ContentCell\">");
		text.append("<input type=\"hidden\" name=\"" + sinpname + "\" id=\"" + sparaid + "\" value=\"" + sdefaultvalue
				+ "\" onchange=\"" + strfunction + "\"  ></input>");
		text.append("<input class=\"dojoValidateValid TextBox_btn_TwoCells_width\" type=\"text\"  name=\"" + sinpname
				+ "_D\" maxlength=\"20\" value=\"" + sdefaulttext + "\" ></input>");
		text.append("</td>");
		text.append("<td class=\"FieldButton_ContentCell\">");
		text.append(
				"<a class=\"FieldButtonLink\" href=\"#\" onfocus=\"setWindowElementFocus(this); window.status=''; return true;\" onblur=\"window.status=''; return true;\" onkeypress=\"this.className='FieldButtonLink_active'; return true;\" onkeyup=\"this.className='FieldButtonLink_focus'; return true;\"  onclick=\"openSearch(null, null, '../it.embio.exportdata.ad_forms/mexdListSingle.html', 'SELECTOR_MEXDLISTS', false, 'frmMain', '"
						+ sinpname + "','" + sinpname + "_D',document.frmMain." + sinpname + "_D.value"
						+ sdynamicparalist + ");return false;\">");
		text.append(
				"<table class=\"FieldButton\" onmouseout=\"window.status='';return true;\" onmouseover=\"window.status='Search';return true;\">");
		text.append("<tr>");
		text.append("<td class=\"FieldButton_bg\">");
		text.append("<img alt=\"\" class=\"FieldButton_Icon Popup_WindowLogo_Icon_searchFiltered\" title=\"" + scaption
				+ "\" src=\"../web/images/blank.gif\" border=\"0\"></img>");
		text.append("</td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</a>");
		text.append("</td>");
		text.append("</tr>");
		text.append("</table>");
		text.append("</td>");
		text.append("</tr>");
		return text.toString();
	}

	public static String getdefaultresult(ConnectionProvider connectionProvider, String strSql, Connection conn)
			throws ServletException {

		ResultSet result;
		String strReturn = "";
		PreparedStatement st = null;
		try {
			if (conn != null) {
				st = connectionProvider.getPreparedStatement(conn, strSql);
			} else {
				st = connectionProvider.getPreparedStatement(strSql);
			}
			QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

			result = st.executeQuery();
			if (result.next()) {
				strReturn = UtilSql.getValue(result, "defaultvalue");
			}
			result.close();
		} catch (SQLException e) {

			throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
		} catch (Exception ex) {

			throw new ServletException("@CODE=@" + ex.getMessage());
		} finally {
			try {
				connectionProvider.releasePreparedStatement(st);
			} catch (Exception ignore) {
				ignore.printStackTrace();
			}
		}
		return (strReturn);
	}

	public static Connection getConnection(String strinstance, String strdbPort, String dbname, String drivername,
			String username, String password) throws ServletException {
		String url = "jdbc:postgresql://" + strinstance + ":" + strdbPort + "/" + dbname + "";
		if (drivername == null) {
			drivername = "org.postgresql.Driver";
		}
		Connection con = null;
		try {
			Class.forName(drivername);
			try {

				con = DriverManager.getConnection(url, username, password);
				// DriverManager.setLoginTimeout(60);
			} catch (SQLException ex) {
				// log an exception. fro example:
				throw new ServletException("@CODE=@" + ex.getMessage());
			}
		} catch (ClassNotFoundException ex) {
			// log an exception. for example:
			// System.out.println("Driver not found.");
			ex.printStackTrace();
		}
		return con;
	}

}