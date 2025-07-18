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
 * All portions are Copyright (C) 2011-2012 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
 */

// Styling properties for the help/about navigation bar component
isc.OBHelpAbout.changeDefaults("icon", {
  src: OB.Styles.skinsPath + 'Blue/org.openbravo.client.application/images/navbar/iconOpenDropDown.png'
});

isc.OBUserProfile.changeDefaults("icon", {
  src: OB.Styles.skinsPath + 'Blue/org.openbravo.client.application/images/navbar/iconOpenDropDown.png'
});

// Styling properties for the quick launch and quick create components
// See also isc.OBQuickRun styling properties
isc.OBQuickLaunch.addProperties({
  createNew_src: OB.Styles.skinsPath + 'Blue/org.openbravo.client.application/images/navbar/iconCreateNew.png',
  quickLaunch_src: OB.Styles.skinsPath + 'Blue/org.openbravo.client.application/images/navbar/iconQuickLaunch.png'
});

// Styling properties for the logout button in the navbar
isc.OBLogout.addProperties({
  src: OB.Styles.skinsPath + 'Blue/org.openbravo.client.application/images/navbar/iconClose.png'
});