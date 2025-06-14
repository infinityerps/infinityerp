
function utilsJSDirectExecution(){if(navigator.userAgent.toUpperCase().indexOf("EDGE")!==-1){isEdge=true;}
isWindowInMDIPopup=checkWindowInMDIPopup();isWindowInMDITab=checkWindowInMDITab();isWindowInMDIPage=checkWindowInMDIPage();isWindowInMDIContext=checkWindowInMDIContext();isRTL=checkWindowInRTLMode();if(isWindowInMDIPage){adaptSkinToMDIEnvironment();}}
var isIE9Strict=false;var isEdge=false;var isRTL=false;var isWindowInMDIPopup=false;var isWindowInMDITab=false;var isWindowInMDIPage=false;var isWindowInMDIContext=false;var isMDIEnvironmentSet=false;var MDIPopupId=null;var baseFrameServlet="../security/Login_FS.html";var gColorSelected="#c0c0c0";var gWhiteColor="#F2EEEE";var arrGeneralChange=[];var dateFormat;var defaultDateFormat="%d-%m-%Y";var mainFrame_windowObj="";var LayoutMDI_windowObj="";var daysOfMonth=[[0,31,28,31,30,31,30,31,31,30,31,30,31],[0,31,29,31,30,31,30,31,31,30,31,30,31]];var gByDefaultAction;var gSubmitted=false;var keyArray=null;var gWaitingCallOut=false;var isKeyboardLocked=false;var isPopupLoadingWindowLoaded=false;var isCtrlPressed=null;var isAltPressed=null;var isShiftPressed=null;var isTabBlocked=false;var pressedKeyCode=null;var isInputFile=false;var ExternalKeyDownFunction;var ExternalKeyUpFunction;var isPageLoading=true;var isUserChanges=false;var isTabClick=false;var isButtonClick=false;var calloutProcessedObj=null;var debugMode=false;function isDebugEnabled(){return debugMode&&typeof window.console==='object';}
function getCurrentRevision(){var number='35328';return number;}
function revisionControl(number){var current=getCurrentRevision();if(current!=number){return false;}else{return true;}}
function getBrowserInfo(param){var navUserAgent=navigator.userAgent.toUpperCase();var browserName="Unknown";var browserVersion="";var browserMajorVersion="";var i=0
if(navUserAgent.indexOf("EDGE")>=0){browserName="Microsoft Edge";i=navUserAgent.indexOf("EDGE")+5;}
else if(navUserAgent.indexOf("MSIE")>=0){browserName="Microsoft Internet Explorer";i=navUserAgent.indexOf("MSIE")+5;}else if(navUserAgent.indexOf("TRIDENT")>=0&&navUserAgent.indexOf("RV:")>=0){browserName="Microsoft Internet Explorer";i=navUserAgent.indexOf("RV:")+3;}else if(navUserAgent.indexOf("FIREFOX")>=0){browserName="Mozilla Firefox";i=navUserAgent.indexOf("FIREFOX")+8;}else if(navUserAgent.indexOf("ICEWEASEL")>=0){browserName="IceWeasel";i=navUserAgent.indexOf("ICEWEASEL")+10;}else if(navUserAgent.indexOf("CHROME")>=0){browserName="Google Chrome";i=navUserAgent.indexOf("CHROME")+7;}else if(navUserAgent.indexOf("OPERA")>=0){browserName="Opera";if(navUserAgent.indexOf("VERSION")!=-1){i=navUserAgent.indexOf("VERSION")+8;}else{i=navUserAgent.indexOf("OPERA")+6;}}else if(navUserAgent.indexOf("SAFARI")>=0){browserName="Apple Safari";if(navUserAgent.indexOf("VERSION")!=-1){i=navUserAgent.indexOf("VERSION")+8;}else{i=navUserAgent.indexOf("SAFARI")+7;}}else if(navUserAgent.indexOf("NETSCAPE")>=0){browserName="Netscape";i=navUserAgent.indexOf("NETSCAPE")+9;}else if(navUserAgent.indexOf("KONQUEROR")>=0){browserName="Konqueror";i=navUserAgent.indexOf("KONQUEROR")+10;}
if(i!=0){while(navUserAgent.substring(i,i+1)!=" "&&navUserAgent.substring(i,i+1)!=";"&&navUserAgent.substring(i,i+1)!=")"&&i<navUserAgent.length){browserVersion+=navUserAgent.substring(i,i+1);i++;}}
var browserNameAndVersion=browserName+" "+browserVersion;browserMajorVersion=browserVersion;if(browserMajorVersion.indexOf(".")!=-1){browserMajorVersion=browserMajorVersion.substring(0,browserVersion.indexOf("."));browserMajorVersion=parseInt(browserMajorVersion);}
if(param=="name"){return browserName;}else if(param=="version"){return browserVersion;}else if(param=="majorVersion"){return browserMajorVersion;}else if(param=="nameAndVersion"||typeof param=="undefined"||param==""||param==null){return browserNameAndVersion;}else if(param=="documentMode"){if(document.documentMode){return document.documentMode;}else{return null;}}else{return false;}}
function getObjAttribute(obj,attribute){attribute=attribute.toLowerCase();var attribute_text="";attribute_text=obj.getAttribute(attribute);attribute_text=attribute_text.replace(/^(\s|\&nbsp;)*|(\s|\&nbsp;)*$/g,"");return attribute_text;}
function setObjAttribute(obj,attribute,attribute_text){attribute=attribute.toLowerCase();attribute_text=attribute_text.toString();attribute_text=attribute_text.replace(/^(\s|\&nbsp;)*|(\s|\&nbsp;)*$/g,"");obj.setAttribute(attribute,attribute_text);}
function getElementsByName(name,tag){var resultArray=[];if(!tag||tag==""||tag==null||typeof tag=="undefined"){resultArray=document.getElementsByName(name);}else{tag=tag.toLowerCase()
var inputs=document.getElementsByTagName(tag);for(var i=0;i<inputs.length;i++){if(inputs.item(i).getAttribute('name')==name){resultArray.push(inputs.item(i));}}}
return resultArray;}
function getElementsByClassName(className,tag){var resultArray=[],classAttributeName;classAttributeName='class';if(!tag){resultArray=document.getElementsByClassName(className);}else{tag=tag.toLowerCase()
var inputs=document.getElementsByTagName(tag);for(var i=0;i<inputs.length;i++){if(inputs.item(i).getAttribute(classAttributeName)===className){resultArray.push(inputs.item(i));}}}
return resultArray;}
function setFocusFirstControl(form,field){var found=false;if(form==null)form=document.forms[0];var total=form.length;for(var i=0;i<total;i++)
{if((form.elements[i].type!="hidden")&&(form.elements[i].type!="button")&&(form.elements[i].type!="submit")&&(form.elements[i].type!="image")&&(form.elements[i].type!="reset"))
{if(field!=null){if(field==form.elements[i].name&&!form.elements[i].readonly&&!form.elements[i].disabled){form.elements[i].focus();found=true;break;}}else if(!form.elements[i].readonly&&!form.elements[i].disabled){try{form.elements[i].focus();found=true;break;}catch(ignore){}}}}
if(found&&form.elements[i].type&&form.elements[i].type.indexOf("select")==-1)
form.elements[i].select();}
function clearForm(form){if(form==null)
form=document.forms[0];var total=form.length;for(var i=0;i<total;i++){if(form.elements[i].type=="text"||form.elements[i].type=="password")
form.elements[i].value="";}}
function confirmAction(action){switch(action)
{case'DELETE':return showJSMessage(2);case'DELETE_RELATION':return showJSMessage(2);case'GUARDAR':return showJSMessage(3);default:return true;}}
function submitFormGetParams(Command,action){var frm=document.forms[0];frm.action=action+"?Command="+Command;var params="";for(var i=2;arguments[i]!=null;i++){params+="&"+arguments[i]+((arguments[i+1]!=null)?("="+arguments[i+1]):"");i++;}
if(params!="")frm.action+=params;frm.target="_self";removeOnUnloadHandler(frm);frm.submit();return true;}
function getParamsScript(form){if(form==null)return"";var script="";var total=form.length;for(var i=0;i<total;i++){if(form.elements[i].type&&(form.elements[i].type!="button")&&(form.elements[i].type!="submit")&&(form.elements[i].type!="image")&&(form.elements[i].type!="reset")&&(form.elements[i].readonly!="true")&&(form.elements[i].name!="Command")&&(form.elements[i].name!="")&&!form.elements[i].disabled){if(form.elements[i].type.toUpperCase().indexOf("SELECT")!=-1&&form.elements[i].selectedIndex!=-1){script+=((script=="")?"":"&")+form.elements[i].name+"="+escape(form.elements[i].options[form.elements[i].selectedIndex].value);}else if(form.elements[i].type.toUpperCase().indexOf("CHECKBOX")!=-1||form.elements[i].type.toUpperCase().indexOf("RADIO")!=-1){if(radioValue(form.elements[i])!=null)script+=((script=="")?"":"&")+form.elements[i].name+"="+escape(radioValue(form.elements[i]));}else if(form.elements[i].value!=null&&form.elements[i].value!=""){script+=((script=="")?"":"&")+form.elements[i].name+"="+escape(form.elements[i].value);}}}
return script;}
function submitForm(field,value,form,bolOneFormSubmission,isCallOut,frameName){if(form==null)form=document.forms[0];if(isCallOut==null)isCallOut=false;if(bolOneFormSubmission!=null&&bolOneFormSubmission){if(gSubmitted==1){showJSMessage(16);return false;}else{gSubmitted=1;if(isCallOut)setGWaitingCallOut(true,frameName);field.value=value;removeOnUnloadHandler(form);form.submit();}}else{if(isCallOut)setGWaitingCallOut(true,frameName);field.value=value;removeOnUnloadHandler(form);form.submit();}
return true;}
function reloadFunction(text){return setTimeout(text,1000);}
function setChangedField(field,form){if(form==null||!form)form=document.forms[0];if(form.inpLastFieldChanged==null)return false;if(field.type.toUpperCase().indexOf("SELECT")!=-1){if(field.selectedIndex==-1||field.options[field.selectedIndex].defaultSelected)
return false;}
form.inpLastFieldChanged.value=field.name;return true;}
function isAutosaveEnabled(){var autosave=getFrame('frameMenu').autosave;return autosave;}
function logClick(hiddenInput){var autosave=isAutosaveEnabled();if(typeof autosave=="undefined"||!autosave){return;}
if(hiddenInput!=null){logChanges(hiddenInput);isButtonClick=true;return;}
isTabClick=true;}
function reloadOpener(){if(top.opener){var f=getFrame('appFrame');if(f==null){f=top.opener;}
if(isDebugEnabled()){console.info("getFrame - f: %o",f);}
var buttonRefresh=f.document.getElementById('buttonRefresh');if(buttonRefresh!==null){buttonRefresh.onclick();}}}
function removeOnUnload(){window.onunload=null;}
function removeOnUnloadHandler(form){var f=form;if(typeof f==='undefined'||f===null){f=document.forms[0];}
if(typeof f.IsPopUpCall!=='undefined'&&f.IsPopUpCall.value==='1'){if(typeof window.onunload==='function'){if(isDebugEnabled()){console.log("Removing onUnload handler");}
removeOnUnload();}}}
function checkForChanges(f){var form=f;if(form===null){form=getFrame('appFrame').document.forms[0];}
if(typeof form==='undefined'){return true;}
var autosave=isAutosaveEnabled();if(typeof autosave==='undefined'||!autosave){if(inputValue(form.inpLastFieldChanged)!==""){if(!showJSMessage(26))
return false;}
if(form.autosave){form.autosave.value='N';}
return true;}
else{if(typeof parent.appFrame==='undefined'){return true;}
try{var promptConfirmation=typeof parent.appFrame.confirmOnChanges==='undefined'?true:parent.appFrame.confirmOnChanges;}catch(e){if(isDebugEnabled()){console.error("%o",e);}}
try{var hasUserChanges=typeof parent.appFrame.isUserChanges==='undefined'?false:parent.appFrame.isUserChanges;}catch(e){if(isDebugEnabled()){console.error("%o",e);}}
if(typeof promptConfirmation==='undefined'||typeof hasUserChanges==='undefined'){return true;}
if(form.inpLastFieldChanged&&(hasUserChanges||isButtonClick||isTabClick)){var autoSaveFlag=autosave;if(promptConfirmation&&hasUserChanges){autoSaveFlag=showJSMessage(25);if(typeof parent.appFrame.confirmOnChanges!=='undefined'&&autoSaveFlag){parent.appFrame.confirmOnChanges=false;}}
if(autoSaveFlag){if(form.autosave){form.autosave.value='Y';}}}
return true;}}
function sendDirectLink(form,columnName,parentKey,url,keyId,tableId,newTarget,bolCheckChanges){if(form==null)form=document.forms[0];var frmDebug=document.forms[0];var action="DEFAULT";var autosave=isAutosaveEnabled();if(autosave&&isUserChanges){try{initialize_MessageBox('messageBoxID');}catch(ignored){}
if(!depurar_validate_wrapper(action,form,""))return false;}
if(bolCheckChanges==null)bolCheckChanges=false;if(arrGeneralChange!=null&&arrGeneralChange.length>0&&bolCheckChanges){var strFunction="sendDirectLink('"+form.name+"', '"+columnName+"', '"+parentKey+"', '"+url+"', '"+keyId+"', '"+tableId+"', "+((newTarget==null)?"null":"'"+newTarget+"'")+", "+bolCheckChanges+")";reloadFunction(strFunction);return false;}
if(bolCheckChanges&&!checkForChanges(frmDebug))return false;if(confirmAction(action)){form.action=url;if(newTarget!=null)form.target=newTarget;form.inpKeyReferenceColumnName.value=columnName;form.inpSecondKey.value=parentKey;form.inpKeyReferenceId.value=keyId;form.inpTableReferenceId.value=tableId;if(isWindowInMDIContext){var LayoutMDI=getFrame('LayoutMDI');if(typeof LayoutMDI.OB.Layout.ClassicOBCompatibility.sendDirectLink==="function"){action="JSON";LayoutMDI.OB.Layout.ClassicOBCompatibility.sendDirectLink(action,form);}}else{submitForm(form.Command,action,form,false,false);}}
return true;}
function dispatchEventChange(target){if(!target)return true;if(!target.type)return true;if(target.onchange&&target.defaultValue&&target.defaultValue!=inputValue(target))target.onchange();else if(target.onblur)target.onblur();return true;}
function depurar_validate_wrapper(action,form,value){if(typeof validate==="function"){return validate(action,form,value);}else{return depurar(action,form,value);}}
function submitCommandForm(action,bolValidation,form,newAction,newTarget,bolOneFormSubmission,bolCheckChanges,isCallOut,controlEvt,evt){var f=form||document.forms[0];if(bolValidation!=null&&bolValidation==true){try{initialize_MessageBox('messageBoxID');}catch(ignored){}
if(!depurar_validate_wrapper(action,f,""))return false;}
if(bolCheckChanges==null)bolCheckChanges=false;if(isCallOut==null)isCallOut=false;if(controlEvt==null)controlEvt=false;if(controlEvt){if(!evt)evt=window.event;var target=(document.layers)?evt.target:evt.srcElement;dispatchEventChange(target);}
if(gWaitingCallOut||(arrGeneralChange!=null&&arrGeneralChange.length>0&&bolCheckChanges)){var strFunction="submitCommandForm('"+action+"', "+bolValidation+", "+f.name+", "+((newAction!=null)?("'"+newAction+"'"):"null")+", "+((newTarget!=null)?("'"+newTarget+"'"):"null")+", "+bolOneFormSubmission+", "+bolCheckChanges+")";reloadFunction(strFunction);return false;}
if(bolCheckChanges&&!checkForChanges(f))return false;if(confirmAction(action)){if(action==='EXCEL'&&newTarget==='_blank'){newTarget=null;}
if(newAction!=null)f.action=newAction;if((newTarget!=null)&&(newTarget=='frameAplicacion')){newTarget='appFrame';}
if((newTarget!=null)&&(newTarget=='frameOculto')){newTarget='hiddenFrame';}
if(newTarget!=null)f.target=newTarget;submitForm(f.Command,action,f,bolOneFormSubmission,isCallOut);}
return true;}
function submitCommandFormParameter(action,field,value,bolValidation,form,formAction,newTarget,bolOneFormSubmission,bolCheckChanges,isCallOut,controlEvt,evt){if(form==null)form=document.forms[0];if(bolValidation!=null&&bolValidation==true){try{initialize_MessageBox('messageBoxID');}catch(ignored){}
if(!depurar_validate_wrapper(action,form,value))return false;}
if(bolCheckChanges==null)bolCheckChanges=false;if(isCallOut==null)isCallOut=false;if(controlEvt==null)controlEvt=false;if(controlEvt){if(!evt)evt=window.event;var target=(document.layers)?evt.target:evt.srcElement;dispatchEventChange(target);}
if(gWaitingCallOut||(arrGeneralChange!=null&&arrGeneralChange.length>0&&bolCheckChanges)){var strFunction="submitCommandFormParameter('"+action+"', "+field.form.name+"."+field.name+", '"+value+"', "+bolValidation+", "+form.name+", "+((formAction!=null)?("'"+formAction+"'"):"null")+", "+((newTarget!=null)?("'"+newTarget+"'"):"null")+", "+bolOneFormSubmission+", "+bolCheckChanges+", "+isCallOut+")";reloadFunction(strFunction);return false;}
if(bolCheckChanges&&!checkForChanges(form))return false;if(confirmAction(action)){field.value=value;if(action==='EXCEL'&&newTarget==='_blank'){newTarget=null;}
if(formAction!=null)form.action=formAction;if((newTarget!=null)&&(newTarget=='frameAplicacion')){newTarget='appFrame';}
if((newTarget!=null)&&(newTarget=='frameOculto')){newTarget='hiddenFrame';}
if(newTarget!=null)form.target=newTarget;submitForm(form.Command,action,form,bolOneFormSubmission,isCallOut);}
return true;}
function validateNumber(strValue,isFloatAllowed,isNegativeAllowed){var isComma=false;var isNegative=false;var i=0;if(strValue==null||strValue=="")return true;var decSeparator=getGlobalDecSeparator();var groupSeparator=getGlobalGroupSeparator();strValue=returnFormattedToCalc(strValue,decSeparator,groupSeparator);if(strValue.substring(i,i+1)=="-"){if(isNegativeAllowed!=null&&isNegativeAllowed){isNegative=true;i++;}else{return false;}}else if(strValue.substring(i,i+1)=="+")
i++;var total=strValue.length;for(i=i;i<total;i++){if(isNaN(strValue.substring(i,i+1))){if(isFloatAllowed&&strValue.substring(i,i+1)=="."&&!isComma)
isComma=true;else
return false;}}
return true;}
function validateNumberField(field,isFloatAllowed,isNegativeAllowed){if(!validateNumber(field.value,isFloatAllowed,isNegativeAllowed))
{showJSMessage(4);field.focus();field.select();return false;}
return true;}
function getArrayValue(data,name,defaultValue){if(data==null||data.length<=0)return((defaultValue!=null)?defaultValue:"");var total=data.length;for(var i=0;i<total;i++){if(data[i][0]==name)return data[i][1];}
return((defaultValue!=null)?defaultValue:"");}
function addArrayValue(data,name,value,isUrlParameter){if(isUrlParameter==null)isUrlParameter=false;if(data==null||data.length<=0){data=new Array();data[0]=new Array(name,value,(isUrlParameter?"true":"false"));return data;}
var total=data.length;for(var i=0;i<total;i++){if(data[i][0]==name){data[i][1]=value;return data;}}
data[total]=new Array(name,value,(isUrlParameter?"true":"false"));return data;}
function addUrlParameters(data){if(data==null||data.length<=0)return"";var total=data.length;var text="";for(var i=0;i<total;i++){if(data[i][2]=="true")text+=((text!=null&&text!="")?"&":"")+data[i][0]+"="+escape(data[i][1]);}
if(text!=null&&text!="")text="?"+text;return text;}
var openPopUpMDICheck=false;function openPopUp(url,_name,height,width,top,left,checkChanges,target,doSubmit,closeControl,parameters,hasLoading,openInMDIPopup){var appUrl=getAppUrl();var adds="";var isPopup=null;_name=_name.replace(/ /g,"_");if(_name!='appFrame'&&_name!='frameAplicacion'&&_name!='frameMenu')isPopup=true;else isPopup=false;if(height==null)height=screen.height-50;if(width==null)width=screen.width;if(height.toString().indexOf("%")!=-1){height=height.replace('%','');height=parseInt(height);height=screen.height*(height/100);}
if(width.toString().indexOf("%")!=-1){width=width.replace('%','');width=parseInt(width);width=screen.width*(width/100);}
if(top==null)top=(screen.height-height)/2;if(left==null)left=(screen.width-width)/2;if(checkChanges==null)checkChanges=false;if(closeControl==null)closeControl=false;if(doSubmit==null)doSubmit=false;if(checkChanges&&!checkForChanges())return false;if(url!=null&&url!="")url+=addUrlParameters(parameters);if(target!=null&&target!=""&&target.indexOf("_")!=0){var objFrame=eval("parent."+target);objFrame.location.href=url;return true;}
if(hasLoading==null)hasLoading=true;adds="height="+height+", width="+width+", left="+left+", top="+top;if(navigator.appName.indexOf("Netscape")){adds+=", alwaysRaised="+getArrayValue(parameters,"alwaysRaised","1");adds+=", dependent="+getArrayValue(parameters,"dependent","1");adds+=", directories="+getArrayValue(parameters,"directories","0");adds+=", hotkeys="+getArrayValue(parameters,"hotkeys","0");}
adds+=", location="+getArrayValue(parameters,"location","0");adds+=", scrollbars="+getArrayValue(parameters,"scrollbars","0");adds+=", status="+getArrayValue(parameters,"status","1");adds+=", menubar="+getArrayValue(parameters,"menubar","0");adds+=", toolbar="+getArrayValue(parameters,"toolbar","0");adds+=", resizable="+getArrayValue(parameters,"resizable","1");if(doSubmit&&(getArrayValue(parameters,"debug",false)==true)){if(!depurar_validate_wrapper(getArrayValue(parameters,"Command","DEFAULT"),null,""))return false;}
if(isWindowInMDIPage&&openInMDIPopup&&isPopup==true){if(getFrame('LayoutMDI')&&getFrame('LayoutMDI').OB&&getFrame('LayoutMDI').OB.Layout&&getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility&&getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup&&getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup.open){if(!openPopUpMDICheck){getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup.open(_name,width,height,"","",window);openPopUpMDICheck=true;}
if(!getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup.isLoaded(_name)){setTimeout(function(){openPopUp(url,_name,height,width,top,left,checkChanges,target,doSubmit,closeControl,parameters,hasLoading,openInMDIPopup);},50);return true;}
openPopUpMDICheck=false;}}
if(isPopup==true&&hasLoading==true){isPopupLoadingWindowLoaded=false;var urlLoading=appUrl+'/utility/PopupLoading.html';var winPopUp=window.open((doSubmit?urlLoading:url),_name,adds);}else{var winPopUp=window.open((doSubmit?"":url),_name,adds);}
winPopUp.onunload=function(){if(winPopUp.location.href!="about:blank"&&winPopUp.location.href.indexOf("utility/PopupLoading.html")==-1){putFocusOnMenu();}}
if(closeControl)window.onunload=function(){winPopUp.close();}
if(doSubmit){if(isPopup==true&&hasLoading==true)synchronizedSubmitCommandForm(getArrayValue(parameters,"Command","DEFAULT"),(getArrayValue(parameters,"debug",false)==true),null,url,_name,target,checkChanges);else submitCommandForm(getArrayValue(parameters,"Command","DEFAULT"),(getArrayValue(parameters,"debug",false)==true),null,url,_name,target,checkChanges);}
winPopUp.focus();return winPopUp;}
function synchronizedSubmitCommandForm(action,bolValidation,form,newAction,newTarget,bolOneFormSubmission,bolCheckChanges,isCallOut,controlEvt,evt){if(isPopupLoadingWindowLoaded==false){setTimeout(function(){synchronizedSubmitCommandForm(action,bolValidation,form,newAction,newTarget,bolOneFormSubmission,bolCheckChanges,isCallOut,controlEvt,evt);},50);return;}else{submitCommandForm(action,bolValidation,form,newAction,newTarget,bolOneFormSubmission,bolCheckChanges,isCallOut,controlEvt,evt);}}
function setPopupLoadingWindowLoaded(value){if(value==''||value=='null'||value==null)value=true;isPopupLoadingWindowLoaded=value;}
function openNewLink(url,_name,height,width,top,left,checkChanges,target,doSubmit,closeControl,parameters){parameters=addArrayValue(parameters,"location","1");parameters=addArrayValue(parameters,"scrollbars","1");parameters=addArrayValue(parameters,"status","1");parameters=addArrayValue(parameters,"menubar","1");parameters=addArrayValue(parameters,"toolbar","1");parameters=addArrayValue(parameters,"resizable","1");return openPopUp(url,_name,height,width,top,left,checkChanges,target,doSubmit,closeControl,parameters);}
function openNewBrowser(url,_name,height,width,top,left){return openNewLink(url,_name,height,width,top,left,null,null,null,true,null);}
function openExcel(url,_name,checkChanges){return openPopUp(url,_name,null,null,null,null,checkChanges,null,null,false,null);}
function openPDF(url,_name,checkChanges){return openPopUp(url,_name,null,null,null,null,checkChanges,null,null,false,null);}
function openPDFFiltered(url,_name,checkChanges){return openPopUp(url,_name,null,null,null,null,checkChanges,null,true,false,null);}
function openPDFSession(strPage,strDirectPrinting,strHiddenKey,strHiddenValue,bolCheckChanges){var appUrl=getAppUrl();var direct=(strDirectPrinting!="")?"Y":"N";return submitCommandForm("DEFAULT",false,null,appUrl+"/businessUtility/PrinterReports.html?inppdfpath="+escape(strPage)+"&inpdirectprint="+escape(direct)+"&inphiddenkey="+escape(strHiddenKey)+((strHiddenValue!=null)?"&inphiddenvalue="+escape(strHiddenValue):""),"hiddenFrame",null,bolCheckChanges);}
function openSearchWindow(url,_name,tabId,windowName,windowId,checkChanges){var parameters=new Array();parameters=addArrayValue(parameters,"inpTabId",tabId,true);parameters=addArrayValue(parameters,"inpWindow",windowName,true);parameters=addArrayValue(parameters,"inpWindowId",windowId,true);return openPopUp(url,_name,450,600,null,null,checkChanges,null,null,true,parameters);}
function openHelp(windowId,url,_name,checkChanges,height,width,windowType,windowName,openInMDIPopup){if(height==null)height=450;if(width==null)width=700;var parameters=new Array();parameters=addArrayValue(parameters,"inpwindowId",windowId,true);parameters=addArrayValue(parameters,"inpwindowType",windowType,true);parameters=addArrayValue(parameters,"inpwindowName",windowName,true);return openPopUp(url,_name,height,width,null,null,checkChanges,null,null,true,parameters,null,openInMDIPopup);}
function openServletNewWindow(Command,bolValidation,url,_name,processId,checkChanges,height,width,resizable,hasStatus,closeControl,hasLoading,openInMDIPopup){if(height==null)height=350;if(width==null)width=500;if(closeControl==null)closeControl=true;var parameters=new Array();parameters=addArrayValue(parameters,"scrollbars","1");parameters=addArrayValue(parameters,"debug",bolValidation,false);if(processId!=null&&processId!="")parameters=addArrayValue(parameters,"inpProcessId",processId,true);if(Command!=null&&Command!="")parameters=addArrayValue(parameters,"Command",Command,false);return openPopUp(url,_name,height,width,null,null,checkChanges,null,true,closeControl,parameters,hasLoading,openInMDIPopup);}
function openLink(url,_name,height,width){return openNewLink(url,((_name.indexOf("_")==0)?"":_name),height,width,null,null,null,((_name.indexOf("_")==0)?_name:""),false,false,null);}
function editHelp(url,type,id,value,height,width,openInMDIPopup){if(height==null)height=500;if(width==null)width=600;var parameters=new Array();parameters=addArrayValue(parameters,"Command",type,true);parameters=addArrayValue(parameters,"inpClave",value,true);parameters=addArrayValue(parameters,"IsPopUpCall","1",true);return openPopUp(url,"HELP_EDIT",height,width,null,null,null,null,false,true,parameters,null,openInMDIPopup);}
function keyPress(keyCode){if(gByDefaultAction!=null)
{var tecla=(!keyCode)?window.event.keyCode:keyCode.which;if(tecla==13)
{eval(gByDefaultAction);return false;}}
return true;}
function byDefaultAction(action){gByDefaultAction=action;if(!document.all)
{document.captureEvents(Event.KEYDOWN);}
document.onkeydown=keyPress;return true;}
var previousOnKeyPress="";function stopKeyPressEvent(evt){previousOnKeyPress=document.onkeypress;document.onkeypress=stopKeyPressPropagation;return true;}
function stopKeyPressPropagation(evt){try{if(evt.ctrlKey){evt.cancelBubble=true;evt.returnValue=false;if(evt.stopPropagation){evt.preventDefault();}}else if(evt.altKey){evt.cancelBubble=true;evt.returnValue=false;if(evt.stopPropagation){evt.preventDefault();}}}catch(e){}
document.onkeypress=previousOnKeyPress;}
function startKeyPressEvent(evt){return true;}
function keyArrayItem(key,evalfunc,field,auxKey,propagateKey,event){this.key=key;this.evalfunc=evalfunc;this.field=field;this.auxKey=auxKey;this.propagateKey=propagateKey;this.eventShotter=event;}
function obtainKeyCode(code){if(code==null)return 0;else if(code.length==1)return code.toUpperCase().charCodeAt(0);switch(code.toUpperCase()){case"BACKSPACE":return 8;case"TAB":return 9;case"ENTER":return 13;case"SPACE":return 32;case"DELETE":return 46;case"INSERT":return 45;case"END":return 35;case"HOME":return 36;case"REPAGE":return 33;case"AVPAGE":return 34;case"LEFTARROW":return 37;case"RIGHTARROW":return 39;case"UPARROW":return 38;case"DOWNARROW":return 40;case"NUMBERPOSITIVE":return 107;case"NUMBERNEGATIVE":return 109;case"NEGATIVE":return 189;case"DECIMAL":return 190;case"NUMBERDECIMAL":return 110;case"ESCAPE":return 27;case"F1":return 112;case"F2":return 113;case"F3":return 114;case"F4":return 115;case"F5":return 116;case"F6":return 117;case"F7":return 118;case"F8":return 119;case"F9":return 120;case"F10":return 121;case"F11":return 122;case"F12":return 123;case"P":return 80;default:return 0;}}
function keyControl(pushedKey){try{if(keyArray==null||keyArray.length==0)return true;}catch(e){return true;}
if(!pushedKey)pushedKey=window.event;var thereIsShortcut=false;isCtrlPressed=false;isAltPressed=false;isShiftPressed=false;if(pushedKey.ctrlKey)isCtrlPressed=true;if(pushedKey.altKey)isAltPressed=true;if(pushedKey.shiftKey)isShiftPressed=true;pressedKeyCode=pushedKey.keyCode;if(isTabPressed==true&&isInputFile==true){return true;}
if(pressedKeyCode===8&&!pushedKey.ctrlKey&&!pushedKey.altKey&&!pushedKey.shiftKey){if(document.activeElement&&document.activeElement.tagName.toLowerCase()!=='input'&&document.activeElement.tagName.toLowerCase()!=='textarea'){return false;}else if(document.activeElement&&document.activeElement.tagName.toLowerCase()==='input'&&(document.activeElement.type.toLowerCase()==='button'||document.activeElement.type.toLowerCase()==='checkbox'||document.activeElement.type.toLowerCase()==='radio'||document.activeElement.type.toLowerCase()==='file'||document.activeElement.type.toLowerCase()==='submit')){return false;}}
var keyCode=pushedKey.keyCode?pushedKey.keyCode:pushedKey.which?pushedKey.which:pushedKey.charCode;if(isKeyboardLocked==false){var keyTarget=pushedKey.target?pushedKey.target:pushedKey.srcElement;var total=keyArray.length;for(var i=0;i<total;i++){if(keyArray[i]!=null&&keyArray[i]&&keyArray[i].eventShotter!='onkeyup'&&pushedKey.type=='keydown'){if(keyCode==obtainKeyCode(keyArray[i].key)){if(keyArray[i].auxKey==null||keyArray[i].auxKey==""||keyArray[i].auxKey=="null"){if(!pushedKey.ctrlKey&&!pushedKey.altKey&&!pushedKey.shiftKey){if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false)){if(window.event&&window.event.keyCode==116){window.event.keyCode=8;keyCode=8;}
if(window.event&&window.event.keyCode==121){window.event.keyCode=8;keyCode=8;}
if(window.event&&window.event.keyCode==27){window.event.keyCode=8;keyCode=8;}}
if(keyArray[i].field==null||(keyTarget!=null&&keyTarget.name!=null&&isIdenticalField(keyArray[i].field,keyTarget.name))){if(keyArray[i].key!==null&&keyArray[i].key!==''&&keyArray[i].key!=='null'&&typeof keyArray[i].key!=='undefined'){var evalfuncTrl=replaceEventString(keyArray[i].evalfunc,keyTarget.name,keyArray[i].field);try{if(!isWindowInMDIContext||typeof keyArray[i].evalfunc!=="object"){eval(evalfuncTrl);}else{var LayoutMDI=getFrame('LayoutMDI');LayoutMDI.OB.Layout.ClassicOBCompatibility.Keyboard.executeKSFunction(keyArray[i].evalfunc[0],keyArray[i].evalfunc[1]);}
thereIsShortcut=true;if(propagateEnter==false&&keyArray[i].key=='ENTER'){propagateEnter=true;return false;}
if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false)){return false;}else{}}catch(e){return true;}}}}}else if(keyArray[i].field==null||(keyTarget!=null&&keyTarget.name!=null&&isIdenticalField(keyArray[i].field,keyTarget.name))){var evalfuncTrl=replaceEventString(keyArray[i].evalfunc,keyTarget.name,keyArray[i].field);if((keyArray[i].auxKey=="ctrlKey"&&pushedKey.ctrlKey&&!pushedKey.altKey&&!pushedKey.shiftKey)||(keyArray[i].auxKey=="altKey"&&!pushedKey.ctrlKey&&pushedKey.altKey&&!pushedKey.shiftKey)){if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false)){stopKeyPressEvent();}}
if((keyArray[i].auxKey=="ctrlKey"&&pushedKey.ctrlKey&&!pushedKey.altKey&&!pushedKey.shiftKey)||(keyArray[i].auxKey=="altKey"&&!pushedKey.ctrlKey&&pushedKey.altKey&&!pushedKey.shiftKey)||(keyArray[i].auxKey=="shiftKey"&&!pushedKey.ctrlKey&&!pushedKey.altKey&&pushedKey.shiftKey)||(keyArray[i].auxKey=="ctrlKey+shiftKey"&&pushedKey.ctrlKey&&!pushedKey.altKey&&pushedKey.shiftKey)||(keyArray[i].auxKey=="ctrlKey+altKey"&&pushedKey.ctrlKey&&pushedKey.altKey&&!pushedKey.shiftKey)||(keyArray[i].auxKey=="altKey+shiftKey"&&!pushedKey.ctrlKey&&pushedKey.altKey&&pushedKey.shiftKey)||(keyArray[i].auxKey=="ctrlKey+altKey+shiftKey"&&pushedKey.ctrlKey&&pushedKey.altKey&&pushedKey.shiftKey)){try{if(!isWindowInMDIContext||typeof keyArray[i].evalfunc!=="object"){eval(evalfuncTrl);}else{var LayoutMDI=getFrame('LayoutMDI');LayoutMDI.OB.Layout.ClassicOBCompatibility.Keyboard.executeKSFunction(keyArray[i].evalfunc[0],keyArray[i].evalfunc[1]);}
thereIsShortcut=true;startKeyPressEvent();if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false)){return false;}else{return true;}}catch(e){startKeyPressEvent();return true;}
startKeyPressEvent();return true;}}}}else if(keyArray[i]!=null&&keyArray[i]&&keyArray[i].eventShotter=='onkeyup'&&pushedKey.type=='keyup'){if(keyCode==obtainKeyCode(keyArray[i].key)){if(keyArray[i].auxKey==null||keyArray[i].auxKey==""||keyArray[i].auxKey=="null"){if(!pushedKey.ctrlKey&&!pushedKey.altKey&&!pushedKey.shiftKey){if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false)){if(window.event&&window.event.keyCode==116){window.event.keyCode=8;keyCode=8;}
if(window.event&&window.event.keyCode==121){window.event.keyCode=8;keyCode=8;}
if(window.event&&window.event.keyCode==27){window.event.keyCode=8;keyCode=8;}}
if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false))
if(keyArray[i].field==null||(keyTarget!=null&&keyTarget.name!=null&&isIdenticalField(keyArray[i].field,keyTarget.name))){if(keyArray[i].key!==null&&keyArray[i].key!==''&&keyArray[i].key!=='null'&&typeof keyArray[i].key!=='undefined'){var evalfuncTrl=replaceEventString(keyArray[i].evalfunc,keyTarget.name,keyArray[i].field);try{if(!isWindowInMDIContext||typeof keyArray[i].evalfunc!=="object"){eval(evalfuncTrl);}else{var LayoutMDI=getFrame('LayoutMDI');LayoutMDI.OB.Layout.ClassicOBCompatibility.Keyboard.executeKSFunction(keyArray[i].evalfunc[0],keyArray[i].evalfunc[1]);}
thereIsShortcut=true;if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false)){return false;}else{return true;}}catch(e){startKeyPressEvent();return true;}
startKeyPressEvent();return true;}}}}else if(keyArray[i].field==null||(keyTarget!=null&&keyTarget.name!=null&&isIdenticalField(keyArray[i].field,keyTarget.name))){var evalfuncTrl=replaceEventString(keyArray[i].evalfunc,keyTarget.name,keyArray[i].field);if((keyArray[i].auxKey=="ctrlKey"&&pushedKey.ctrlKey&&!pushedKey.altKey&&!pushedKey.shiftKey)||(keyArray[i].auxKey=="altKey"&&!pushedKey.ctrlKey&&pushedKey.altKey&&!pushedKey.shiftKey)||(keyArray[i].auxKey=="shiftKey"&&!pushedKey.ctrlKey&&!pushedKey.altKey&&pushedKey.shiftKey)||(keyArray[i].auxKey=="ctrlKey+shiftKey"&&pushedKey.ctrlKey&&!pushedKey.altKey&&pushedKey.shiftKey)||(keyArray[i].auxKey=="ctrlKey+altKey"&&pushedKey.ctrlKey&&pushedKey.altKey&&!pushedKey.shiftKey)||(keyArray[i].auxKey=="altKey+shiftKey"&&!pushedKey.ctrlKey&&pushedKey.altKey&&pushedKey.shiftKey)||(keyArray[i].auxKey=="ctrlKey+altKey+shiftKey"&&pushedKey.ctrlKey&&pushedKey.altKey&&pushedKey.shiftKey)){try{if(!isWindowInMDIContext||typeof keyArray[i].evalfunc!=="object"){eval(evalfuncTrl);}else{var LayoutMDI=getFrame('LayoutMDI');LayoutMDI.OB.Layout.ClassicOBCompatibility.Keyboard.executeKSFunction(keyArray[i].evalfunc[0],keyArray[i].evalfunc[1]);}
thereIsShortcut=true;startKeyPressEvent();if((!keyArray[i].propagateKey||isGridFocused)&&!(keyArray[i].key=='TAB'&&isOBTabBehavior==false)){return false;}else{return true;}}catch(e){startKeyPressEvent();return true;}
startKeyPressEvent();return true;}}}}}}else{return false;}
if(isKeyboardLocked==false&&!isCtrlPressed&&!isAltPressed&&pushedKey.type=='keydown'&&pressedKeyCode!='16'&&pressedKeyCode!='17'&&pressedKeyCode!='18'){if(typeof focusedWindowElement!="undefined"&&focusedWindowElement!=null){if(focusedWindowElement.tagName=='SELECT'){if(focusedWindowElement.getAttribute('onchange'))setTimeout("focusedWindowElement.onchange();",50);}}}
return true;}
function putFocusOnMenu(){if(isWindowInMDIPage){return false;}else{if(parent&&parent.appFrame&&parent.appFrame.selectedArea=='tabs'){parent.appFrame.swichSelectedArea();}
if(parent&&parent.frameMenu){parent.frameMenu.focus();}
return true;}}
function putFocusOnWindow(){try{parent.frameMenu.onBlurMenu();parent.appFrame.selectedArea='window'
parent.appFrame.focus();parent.appFrame.setWindowElementFocus(parent.appFrame.focusedWindowElement);}catch(e){console.log(e);}
return true;}
function enableShortcuts(type){if(type!=null&&type!='null'&&type!=''){try{this.keyArray=new Array();if(type=='menu'){getShortcuts('applicationCommonKeys');getShortcuts('menuSpecificKeys');}else if(type=='edition'){getShortcuts('applicationCommonKeys');getShortcuts('windowCommonKeys');getShortcuts('editionSpecificKeys');getShortcuts('genericTreeKeys');enableDefaultAction();}else if(type=='relation'){getShortcuts('applicationCommonKeys');getShortcuts('windowCommonKeys');getShortcuts('relationSpecificKeys');getShortcuts('gridKeys');}else if(type=='popup'){getShortcuts('applicationCommonKeys');getShortcuts('windowCommonKeys');getShortcuts('editionSpecificKeys');getShortcuts('popupSpecificKeys');getShortcuts('genericTreeKeys');getShortcuts('gridKeys');enableDefaultAction();}}catch(e){}}
keyDownManagement();keyUpManagement();}
function keyDownManagement(){if(document.onkeydown){ExternalKeyDownFunction=document.onkeydown;}
document.onkeydown=keyDownExecution;}
function keyDownExecution(evt){if(!evt)evt=window.event;var response=keyControl(evt);if(typeof ExternalKeyDownFunction=="function"){var responseExternal=ExternalKeyDownFunction(evt);}
return response;}
function keyUpManagement(){if(document.onkeyup){ExternalKeyUpFunction=document.onkeyup;}
document.onkeyup=keyUpExecution;}
function keyUpExecution(evt){if(!evt)evt=window.event;var response=keyControl(evt);if(typeof ExternalKeyUpFunction=="function"){var responseExternal=ExternalKeyUpFunction(evt);}
return response;}
function lockKeyboard(){isKeyboardLocked=true;return true;}
function unlockKeyboard(){isKeyboardLocked=false;return true;}
function setBrowserAutoComplete(state){if(state!=false&&state!=true&&state!='false'&&state!='true')state=true;for(var i=0;i<document.forms.length;i++){document.forms[i].setAttribute('autocomplete','off');}
return true;}
function isIdenticalField(arrayName,actualName){if(arrayName.substring(arrayName.length-1)=="%")return(actualName.indexOf(arrayName.substring(0,arrayName.length-1))==0);else return(arrayName==actualName);}
function replaceEventString(eventJS,inputname,arrayName){eventJS=ReplaceText(eventJS,"@inputname@",inputname);if(arrayName!=null&&arrayName!=""&&arrayName.substring(arrayName.length-1)=="%"){var endname=inputname.substring(arrayName.length-1);eventJS=ReplaceText(eventJS,"@endinputname@",endname);}
return eventJS;}
function layer(node,text,isId,isAppend){if(text==null)
text="";if(isAppend==null)isAppend=false;if(document.layers)
{if(isId!=null&&isId)
node=document.layers[node];if(node==null)return;node.document.write(text);node.document.close();}
else if(document.all)
{if(isId!=null&&isId)
node=document.all[node];if(node==null)return;try{if(isAppend){text=((node.innerHTML==null)?"":node.innerHTML)+text;isAppend=false;}
node.innerHTML=text;}catch(e){if(isAppend){text=((node.outterHTML==null)?"":node.outterHTML)+text;isAppend=false;}
node.outterHTML=text;}
node=null;}
else if(document.getElementById)
{if(isId!=null&&isId)
node=document.getElementById(node);if(node==null)return;var range=document.createRange();range.setStartBefore(node);var domfrag=range.createContextualFragment(text);while(node.hasChildNodes())
{node.removeChild(node.lastChild);}
node.appendChild(domfrag);node=null;}}
function readLayer(node,isId){if(document.layers){if(isId!=null&&isId)node=document.layers[node];if(node==null)return"";return getChildText(node);}else if(document.all){if(isId!=null&&isId)node=document.all[node];if(node==null)return"";try{return node.innerHTML;}catch(e){return node.outterHTML;}}else if(document.getElementById){if(isId!=null&&isId)node=document.getElementById(node);if(node==null)return"";return getChildText(node);}
return"";}
function getChildText(nodo){if(nodo==null)return"";if(nodo.data)return nodo.data;else return getChildText(nodo.firstChild);}
function getObjChild(obj){try{obj=obj.firstChild;for(;;){if(obj.nodeType!='1'){obj=obj.nextSibling;}else{break;}}
return obj;}catch(e){return false;}}
function getObjParent(obj){try{obj=obj.parentNode;for(;;){if(obj.nodeType!='1'){obj=obj.parentNode;}else{break;}}
return obj;}catch(e){return false;}}
function fillCombo(combo,dataArray,bolSelected,withoutBlankOption){var i,value="";for(i=combo.options.length;i>=0;i--)
combo.options[i]=null;i=0;if(withoutBlankOption==null||!withoutBlankOption)
combo.options[i++]=new Option("","");if(dataArray==null)return"";var total=dataArray.length;for(var j=0;j<total;j++){combo.options[i]=new Option(dataArray[j][1],dataArray[j][0]);if(bolSelected!=null&&bolSelected&&dataArray[j][2]=="true"){value=dataArray[j][0];combo.options[i].selected=true;}
i++;}
return value;}
function selectDefaultValueFromArray(dataArray,bolSelected){var value="";if(dataArray==null)return"";value=dataArray[0][0];var total=dataArray.length;for(var j=0;j<total;j++){if(bolSelected!=null&&bolSelected&&dataArray[j][2]=="true"){value=dataArray[j][0];}}
return value;}
function addList(sourceList,destinationList,selectAll){if(sourceList==null||destinationList==null)return false;if(selectAll==null)selectAll=false;var sourceListLength=sourceList.length;var i=0;for(var j=0;j<sourceListLength;j++){if(selectAll||sourceList.options[i].selected==true){var text=sourceList.options[i].text;var value=sourceList.options[i].value;destinationList.options[destinationList.length]=new Option(text,value);sourceList.options[i]=null;}else{i=i+1;}}
return true;}
function moveElementInList(list,incr){if(list==null)return false;else if(list.length<2)return false;if(incr==null)incr=1;if(incr>0){for(var i=list.length-2;i>=0;i--){if(list.options[i].selected==true&&((i+incr)>=0||(i+incr)<list.length)){list.options[i].selected=false;var text=list.options[i+incr].text;var value=list.options[i+incr].value;list.options[i+incr].value=list.options[i].value;list.options[i+incr].text=list.options[i].text;list.options[i+incr].selected=true;list.options[i].value=value;list.options[i].text=text;}}}else{var total=list.length;for(var i=1;i<total;i++){if(list.options[i].selected==true&&((i+incr)>=0||(i+incr)<list.length)){list.options[i].selected=false;var text=list.options[i+incr].text;var value=list.options[i+incr].value;list.options[i+incr].value=list.options[i].value;list.options[i+incr].text=list.options[i].text;list.options[i+incr].selected=true;list.options[i].value=value;list.options[i].text=text;}}}
return true;}
function searchArray(dataArray,searchKey,valueIndex)
{if(dataArray==null)return"";else if(searchKey==null)return"";if(valueIndex==null)valueIndex=1;var total=dataArray.length;for(var i=0;i<total;i++){if(dataArray[i][0]==searchKey){return dataArray[i][valueIndex];}}
return"";}
function radioValue(radio)
{if(!radio)return null;else if(!radio.length)
return((radio.checked)?radio.value:null);var total=radio.length;for(var i=0;i<total;i++)
{if(radio[i].checked)
return radio[i].value;}
return null;}
function markAll(chk,bolMark)
{if(bolMark==null)bolMark=false;if(!chk)return false;else if(!chk.length)chk.checked=bolMark;else{var total=chk.length;for(var i=0;i<total;i++)chk[i].checked=bolMark;}
return true;}
function changeComboData(combo,dataArray,key,withBlankOption){var i;var n=0;if(combo.options.length!=null){for(i=combo.options.length;i>=0;i--)
combo.options[i]=null;}
if(withBlankOption)
combo.options[n++]=new Option("","");if(dataArray==null)return false;var total=dataArray.length;for(i=0;i<total;i++){if(dataArray[i][0]==key)
combo.options[n++]=new Option(dataArray[i][2],dataArray[i][1]);}}
function clearList(field){if(field==null)return false;for(var i=field.options.length-1;i>=0;i--)field.options[i]=null;return true;}
function clearSelectedElements(field){if(field==null)return false;for(var i=field.options.length-1;i>=0;i--){if(field.options[i].selected)field.options[i]=null;}
return true;}
function comboContains(combo,searchKey){if(combo==null||searchKey==null)return false;var total=combo.options.length;for(var i=0;i<total;i++){if(combo.options[i].value==searchKey)return true;}
return false;}
function addElementsToList(destList,arrayNewValues){if(destList==null||arrayNewValues==null)return false;var i=destList.options.length;var total=arrayNewValues.length;for(var j=0;j<total;j++){if(!comboContains(destList,arrayNewValues[j][0]))
destList.options[i++]=new Option(arrayNewValues[j][1],arrayNewValues[j][0]);}
return true;}
function markCheckedAllElements(field){if(field==null||field==null)return false;var total=field.options.length;for(var i=0;i<total;i++){field.options[i].selected=true;}
return true;}
function selectCombo(combo,key){if(!combo||combo==null)return false;var total=combo.length;for(var i=0;i<total;i++){combo.options[i].selected=(combo.options[i].value==key);}
return true;}
function hideMenuIcon(id){var imgTag=document.getElementById(id);var aTag=getObjParent(imgTag);if(parent.frameMenu){getFrame('main').isMenuBlock=true;}
if(aTag&&aTag.className&&aTag.className.indexOf("Main_LeftTabsBar_ButtonLeft_hidden")==-1){aTag.className="Main_LeftTabsBar_ButtonLeft_hidden";imgTag.className="Main_LeftTabsBar_ButtonLeft_Icon";disableAttributeWithFunction(aTag,'obj','onclick');}}
function showMenuIcon(id){var imgTag=document.getElementById(id);var aTag=getObjParent(imgTag);if(parent.frameMenu){getFrame('main').isMenuBlock=false;}
if(aTag.className.indexOf("Main_LeftTabsBar_ButtonLeft_hidden")!=-1){aTag.className="Main_LeftTabsBar_ButtonLeft";imgTag.className="Main_LeftTabsBar_ButtonLeft_Icon Main_LeftTabsBar_ButtonLeft_Icon_arrow_hide";enableAttributeWithFunction(aTag,'obj','onclick');updateMenuIcon(id);}}
function updateMenuIcon(id){if(!parent.frameMenu){hideMenuIcon(id);return false;}
else{var frameContainer=getFrame('main');var framesetMenu=frameContainer.document.getElementById("framesetMenu");if(!framesetMenu)return false;try{if(frameContainer.isMenuBlock==true){menuHide(id,false);hideMenuIcon(id);}else{showMenuIcon(id);}}catch(ignored){}
try{if(frameContainer.isMenuHide==true&&frameContainer.isMenuBlock==false){changeClass(id,"_hide","_show",true);}else{changeClass(id,"_show","_hide",true);}}catch(ignored){}
return true;}}
function menuShowHide(id){if(!parent.frameMenu){window.open(baseFrameServlet,"_blank");}else{var frameContainer=getFrame('main');if(frameContainer.isMenuHide==true){menuShow(id);}else{menuHide(id);}
return true;}}
function menuShow(id,updateIcon){if(typeof updateIcon==="undefined"||updateIcon===null||updateIcon==="null"||updateIcon===""){updateIcon=true;}
if(!parent.frameMenu){window.open(baseFrameServlet,"_blank");}else{if(id==null){id='buttonMenu';}
var frameContainer=getFrame('main');var framesetMenu=frameContainer.document.getElementById("framesetMenu");if(!framesetMenu){return false;}
if(frameContainer.isRTL==true){framesetMenu.cols="*,"+frameContainer.menuWidth+",0%";}else{framesetMenu.cols="0%,"+frameContainer.menuWidth+",*";}
frameContainer.isMenuHide=false;try{putFocusOnMenu();}catch(e){}
if(updateIcon!=false){try{updateMenuIcon(id);}catch(e){}}
return true;}}
function menuHide(id,updateIcon){if(typeof updateIcon==="undefined"||updateIcon===null||updateIcon==="null"||updateIcon===""){updateIcon=true;}
if(!parent.frameMenu){window.open(baseFrameServlet,"_blank");}else{if(id==null){id='buttonMenu';}
var frameContainer=getFrame('main');var framesetMenu=frameContainer.document.getElementById("framesetMenu");if(!framesetMenu){return false;}
if(frameContainer.isRTL==true){framesetMenu.cols="*,0%,0%";}else{framesetMenu.cols="0%,0%,*";}
frameContainer.isMenuHide=true;try{putFocusOnWindow();}catch(e){}
if(updateIcon!=false){try{updateMenuIcon(id);}catch(e){}}
return true;}}
function isVisibleElement(obj,appWindow){if(appWindow==null||appWindow=='null'||appWindow==''){appWindow=getFrame('main');}
var parentElement=obj;try{for(;;){if(parentElement.style.display=='none'){return false;}else if(parentElement==appWindow.document.getElementsByTagName('BODY')[0]){break;}
parentElement=parentElement.parentNode;}}catch(e){return false;}
return true;}
function executeWindowButton(id,focus){var appWindow=parent,theDocument;if(focus==null)focus=false;try{if(parent.frames['appFrame']||parent.frames['frameMenu']){appWindow=parent.frames['appFrame'];}else if(parent.frames['superior']){appWindow=parent.frames['superior'];}else if(parent.frames['frameSuperior']){appWindow=parent.frames['frameSuperior'];}else if(parent.frames['frameButton']){appWindow=parent.frames['frameButton'];}else if(parent.frames['mainframe']){appWindow=parent.frames['mainframe'];}
theDocument=appWindow.document;}catch(e){appWindow=window;theDocument=window.document;}
if(theDocument.getElementById(id)&&isVisibleElement(theDocument.getElementById(id),appWindow)){if(focus==true)theDocument.getElementById(id).focus();theDocument.getElementById(id).onclick();if(focus==true)putWindowElementFocus(focusedWindowElement);}}
function executeMenuButton(id){var appWindow=parent;if(parent.frames['appFrame']||parent.frames['frameMenu']){appWindow=parent.frames['frameMenu'];}
if(appWindow.document.getElementById(id)&&isVisibleElement(appWindow.document.getElementById(id),appWindow)){appWindow.document.getElementById(id).onclick();}}
function getAppUrl(){var menuFrame=getFrame('frameMenu');var LayoutMDI=getFrame('LayoutMDI');var appUrl=null;if(typeof menuFrame.getAppUrlFromMenu==="function"||typeof menuFrame.getAppUrlFromMenu==="object"){appUrl=menuFrame.getAppUrlFromMenu();}else if(LayoutMDI){appUrl=LayoutMDI.OB.Application.contextUrl;}
return appUrl;}
function changeClass(id,class1,class2,forced){if(forced==null)forced=false;var element=document.getElementById(id);if(!element)return false;if(element.className.indexOf(class1)!=-1)element.className=element.className.replace(class1,class2);else if(!forced&&element.className.indexOf(class2)!=-1)element.className=element.className.replace(class2,class1);return true;}
function getReference(id){if(document.getElementById)return document.getElementById(id);else if(document.all)return document.all[id];else if(document.layers)return document.layers[id];else return null;}
function getStyle(id){var ref=getReference(id);if(ref==null||!ref)return null;return((document.layers)?ref:ref.style);}
function idName(name){return(name.substring(0,9)+name.substring(10));}
function findElementPosition(form,name){var total=form.length;for(var i=0;i<total;i++){if(form.elements[i].name==name)return i;}
return null;}
function deselectActual(form,field){if(field==null||field.value==null||field.value=="")return null;var i=findElementPosition(form,"inpRecordW"+field.value);if(i==null)return null;recordSelectExplicit("inpRecord"+field.value,false);field.value="";return i;}
function findFirstElement(form){if(form==null)return null;var n=null;var total=form.length;for(var i=0;i<total;i++){if(form.elements[i].name.indexOf("inpRecordW")==0){n=i;break;}}
return n;}
function findLastElement(form){if(form==null)return null;var n=null;for(var i=form.length-1;i>=0;i--){if(form.elements[i].name.indexOf("inpRecordW")==0){n=i;break;}}
return n;}
function nextElement(form,field){var i=deselectActual(form,field);if(i==null){i=findFirstElement(form);if(i==null)return;}else if(i<findLastElement(form))i++;field.value=form.elements[i].name.substring(10);recordSelectExplicit("inpRecord"+form.elements[i].name.substring(10),true);form.elements[i].focus();return true;}
function previousElement(form,field){var i=deselectActual(form,field);var minor=findFirstElement(form);if(minor==null)return;else if(i==null){i=minor;if(i==null)return;}if(i>minor)i--;field.value=form.elements[i].name.substring(10);recordSelectExplicit("inpRecord"+form.elements[i].name.substring(10),true);form.elements[i].focus();return true;}
function firstElement(form,field){var i=deselectActual(form,field);i=findFirstElement(form);if(i==null)return;field.value=form.elements[i].name.substring(10);recordSelectExplicit("inpRecord"+form.elements[i].name.substring(10),true);form.elements[i].focus();return true;}
function lastElement(form,field){var i=deselectActual(form,field);i=findLastElement(form);if(i==null)return;field.value=form.elements[i].name.substring(10);recordSelectExplicit("inpRecord"+form.elements[i].name.substring(10),true);form.elements[i].focus();return true;}
function recordSelectExplicit(name,highlight){var obj=getStyle(name);if(obj==null)return false;if(document.layers){if(highlight)obj.bgColor=gColorSelected;else obj.bgColor=gWhiteColor;}else{if(highlight)obj.backgroundColor=gColorSelected;else obj.backgroundColor=gWhiteColor;}
return highlight;}
function selectRadioButton(radio,Value){if(!radio)return false;else if(!radio.length)radio.checked=true;else{var total=radio.length;for(var i=0;i<total;i++)radio[i].checked=(radio[i].value==Value);}
return true;}
function selectCheckbox(obj,Value){if(!obj)return false;else{obj.checked=(obj.value==Value);}
return true;}
function formElementValue(form,ElementName,Value){var bolReadOnly=false;var onChangeFunction="";if(form==null){form=document.forms[0];if(form==null)return false;}else if(ElementName==null)return false;if(ElementName=="MESSAGE"){initialize_MessageBox("messageBoxID");try{if(Value!=null&&Value!="")setValues_MessageBox('messageBoxID',"INFO","",Value);}catch(err){alert(Value);}}else if(ElementName=="ERROR"||ElementName=="SUCCESS"||ElementName=="WARNING"||ElementName=="INFO"){try{setValues_MessageBox('messageBoxID',ElementName,"",Value);}catch(err){alert(Value);}}else if(ElementName=="EXECUTE"){eval(Value);}else if(ElementName=="DISPLAY"){displayLogicElement(Value,true);}else if(ElementName=="HIDE"){displayLogicElement(Value,false);}else if(ElementName=="CURSOR_FIELD"){var obj=eval("document."+form.name+"."+Value+";");if(obj==null||!obj||!obj.type||obj.type.toUpperCase()=="HIDDEN")return false;setWindowElementFocus(obj);if(obj.type.toUpperCase().indexOf("SELECT")==-1)obj.select();}else{if(ElementName.toUpperCase().indexOf("_BTN")!=-1){if(Value==null||Value=="null")Value="";layer(ElementName,Value,true);return true;}else if(ElementName.toUpperCase().indexOf("_LBL")!=-1){if(Value==null||Value=="null")Value="";document.getElementById(ElementName).innerHTML=Value;return true;}
var obj=eval("document."+form.name+"."+ElementName+";");if(obj==null||!obj||!obj.type)return false;if(obj.getAttribute("readonly")=="true"||obj.readOnly||(obj.getAttribute("readonly")==""))bolReadOnly=true;if(bolReadOnly){if(obj.getAttribute("onChange")){onChangeFunction=obj.getAttribute("onChange").toString();onChangeFunction=onChangeFunction.replace("function anonymous()\n","");onChangeFunction=onChangeFunction.replace("function onchange()\n","");onChangeFunction=onChangeFunction.replace("{\n","");onChangeFunction=onChangeFunction.replace("\n}","");}else{onChangeFunction="";}
obj.setAttribute("onChange","");obj.readOnly=false;}
if(obj.type.toUpperCase().indexOf("SELECT")!=-1){if(Value!=null&&typeof Value!="object"){var total=obj.length;var index=-1;var hasMultiSelect=false;var selectedOption=false;if((Value==null||Value=="")&&total>0)Value=obj.options[0].value;for(var i=0;i<total;i++){selectedOption=(obj.options[i].value==Value);obj.options[i].selected=selectedOption;if(selectedOption){if(index!=-1)hasMultiSelect=true;index=i;}}
if(!hasMultiSelect)obj.selectedIndex=index;}else Value=fillCombo(obj,Value,true,((obj.className.toUpperCase().indexOf("REQUIRED")!=-1)||obj.className.toUpperCase().indexOf("KEY")!=-1));}else if(obj.type.toUpperCase().indexOf("CHECKBOX")!=-1){selectCheckbox(obj,Value);}else if(obj.type.toUpperCase().indexOf("RADIO")!=-1||obj.type.toUpperCase().indexOf("CHECK")!=-1){selectRadioButton(obj,Value);}else{if(Value==null||Value=="null"){Value="";}
if(typeof Value!="object"){var decSeparator=getGlobalDecSeparator();var groupSeparator=getGlobalGroupSeparator();var groupInterval=getGlobalGroupInterval();var outputformat=obj.getAttribute("outputformat");if(outputformat!=null||typeof Value==="number"){maskNumeric=formatNameToMask(outputformat);var formattedValue=returnCalcToFormatted(Value,maskNumeric,decSeparator,groupSeparator,groupInterval);if(focusedWindowElement!==obj||returnFormattedToCalc(formattedValue,decSeparator,groupSeparator)!==returnFormattedToCalc(obj.value,decSeparator,groupSeparator)){obj.value=formattedValue;}}else{obj.value=Value;}}else{obj.value=selectDefaultValueFromArray(Value,true);}}
if(bolReadOnly&&onChangeFunction){var i=onChangeFunction.toString().indexOf("selectCombo(this,");var search="\"";if(i!=-1){var first=onChangeFunction.toString().indexOf(search,i+1);if(first==-1){search="'";first=onChangeFunction.toString().indexOf(search,i+1);}
if(first!=-1){var end=onChangeFunction.toString().indexOf(search,first+1);if(end!=-1){onChangeFunction=onChangeFunction.toString().substring(0,first+1)+Value+onChangeFunction.toString().substring(end);onChangeFunction=onChangeFunction.toString().replace("function anonymous()","");}}
obj.setAttribute("onChange",onChangeFunction);}else{obj.setAttribute("onChange",onChangeFunction);}
obj.readOnly=true;}}
return true;}
function getFrame(frameName){var targetFrame;if(frameName=='main'){if(mainFrame_windowObj!==""){targetFrame=mainFrame_windowObj;}else{var success=false;try{if(parent.frameMenu){targetFrame=window.parent;success=true;}else if(top.opener.parent.frameMenu){targetFrame=window.top.opener.parent;success=true;}else if(top.opener.top.opener.parent.frameMenu){targetFrame=window.top.opener.top.opener.parent;success=true;}}catch(e){success=false;}
if(success==false){try{if(opener&&opener.parent&&opener.parent.frameMenu){targetFrame=window.opener.parent;success=true;}else if(parent&&parent.opener&&parent.opener.parent&&parent.opener.parent.frameMenu){targetFrame=window.parent.opener.parent;success=true;}else if(opener&&opener.opener&&opener.opener.parent&&opener.opener.parent.frameMenu){targetFrame=window.opener.opener.parent;success=true;}else if(opener&&opener.opener&&opener.opener.opener&&opener.opener.opener.parent&&opener.opener.opener.parent.frameMenu){targetFrame=window.opener.opener.opener.parent;success=true;}else if(opener&&opener.opener&&opener.opener.opener&&opener.opener.opener.opener&&opener.opener.opener.opener.parent&&opener.opener.opener.opener.parent.frameMenu){targetFrame=window.opener.opener.opener.opener.parent;success=true;}}catch(e){success=false;}}
if(success==false){targetFrame='window';var targetFrame_parent='window.parent';var targetFrame_opener='window.opener';var securityEscape=0;var securityEscapeLimit=50;try{while(eval(targetFrame)!==eval(targetFrame_opener)){while(eval(targetFrame)!==eval(targetFrame_parent)){if(eval(targetFrame).document.getElementById('paramFrameMenuLoading')||securityEscape>securityEscapeLimit){success=true;break;}
targetFrame=targetFrame+'.parent';targetFrame_parent=targetFrame+'.parent';securityEscape=securityEscape+1;}
if(eval(targetFrame).document.getElementById('paramFrameMenuLoading')||securityEscape>securityEscapeLimit){success=true;break;}
targetFrame=targetFrame+'.opener';targetFrame_opener=targetFrame+'.opener';securityEscape=securityEscape+1;if(typeof eval(targetFrame)==='undefined'||eval(targetFrame)===null||eval(targetFrame)==='null'||eval(targetFrame)===''){break;}}}catch(e){}
targetFrame=eval(targetFrame);}
if(success==false){targetFrame=null;}
mainFrame_windowObj=targetFrame;}}else if(frameName==='mainParent'){var main=getFrame('main');var check=true;try{var dummy=main.parent.document;}catch(e){check=false;}
if(check){if(main.document===main.parent.document){check=false;}}
if(check){targetFrame=main.parent;}else{targetFrame=null;}}else if(frameName==='LayoutMDI'){if(LayoutMDI_windowObj!==""){targetFrame=LayoutMDI_windowObj;}else{var mainParent=getFrame('mainParent');targetFrame=null;if(mainParent!==null){if(LayoutMDICheck(mainParent)){targetFrame=mainParent;}else{targetFrame=null;}}else{if(targetFrame===null){try{targetFrame=top.opener;while(targetFrame!==null&&!LayoutMDICheck(targetFrame)){targetFrame=targetFrame.top.opener;}}catch(e){targetFrame=null;}}
if(targetFrame===null){try{targetFrame=parent;while(targetFrame!==null&&targetFrame!==targetFrame.parent&&!LayoutMDICheck(targetFrame)){var dummy=targetFrame.parent.document;targetFrame=targetFrame.parent;}}catch(e){targetFrame=null;}}
if(!LayoutMDICheck(targetFrame)){targetFrame=null;}}
LayoutMDI_windowObj=targetFrame;}}else{if(getFrame('main')&&getFrame('main').frames[frameName]){targetFrame=getFrame('main').frames[frameName];}else{targetFrame=null;}}
return targetFrame;}
function getOpenbravoERPStyleSheet(){var stylesheet;for(var i=0;i<document.styleSheets.length;i++){if(document.styleSheets[i].href&&document.styleSheets[i].href.indexOf("print")===-1&&document.styleSheets[i].href.indexOf("Openbravo_ERP")!==-1){stylesheet=document.styleSheets[i];}}
return stylesheet;}
function addStyleRule(selector,declaration){var stylesheet=getOpenbravoERPStyleSheet();if(typeof stylesheet==="object"){stylesheet.insertRule(selector+' { '+declaration+' }',stylesheet.cssRules.length);}}
function removeStyleRule(selectorIndex){var stylesheet=getOpenbravoERPStyleSheet();if(typeof stylesheet==="object"){stylesheet.deleteRule(selectorIndex);}}
function getStyleRulePosition(selector){var stylesheet=getOpenbravoERPStyleSheet();var position=new Array();var i;if(typeof stylesheet==="object"){for(i=0;i<stylesheet.cssRules.length;i++){if(typeof stylesheet.cssRules[i].selectorText!=="undefined"&&stylesheet.cssRules[i].selectorText.toLowerCase()===selector.toLowerCase()){position.push(i);}}}
return position;}
function adaptSkinToMDIEnvironment(){if(isWindowInMDITab){addStyleRule(".Main_NavBar_bg_left","height: 1px;");addStyleRule(".Main_NavBar_bg_right","height: 1px;");addStyleRule(".Main_ContentPane_LeftTabsBar","display: none;");addStyleRule(".Main_ContentPane_NavBar","height: 0px;");addStyleRule(".Main_ContentPane_NavBar#tdtopNavButtons","display: none;");addStyleRule(".tabTitle_background","display: none;");}else if(isWindowInMDIPopup){addStyleRule(".Popup_ContentPane_NavBar","display: none;");addStyleRule(".Popup_ContentPane_SeparatorBar","display: none;");addStyleRule(".Popup_ContentPane_CircleLogo","display: none;");}}
function setClass(id,selectClass){var obj=getReference(id);if(obj==null)return null;obj.className=selectClass;}
function getObjectClass(id,previousClass){var obj=getReference(id);if(obj==null)return previousClass;return(obj.className);}
function formElementEvent(form,ElementName,calloutName){if(form==null)form=document.forms[0].name;else if(ElementName==null)return false;var isReload=false;if(ElementName!="MESSAGE"&&ElementName!="CURSOR_FIELD"&&ElementName!="EXECUTE"&&ElementName!="DISPLAY"&&ElementName!="HIDE"&&ElementName.indexOf("_BTN")==-1){var obj=eval("document."+form+"."+ElementName+";");if(obj==null||!obj||!obj.type)return false;calloutProcessedObj=obj;if(obj.type.toUpperCase().indexOf("RADIO")!=-1){if(obj.onclick!=null&&obj.onclick.toString().indexOf(calloutName)==-1){if(obj.onclick.toString().indexOf("callout")!=-1||obj.onclick.toString().indexOf("reload")!=-1)isReload=true;obj.onclick();}}else{var bolReadOnly=false;if(obj.onchange!=null&&obj.onchange.toString().indexOf(calloutName)==-1){if(obj.onchange.toString().indexOf("callout")!=-1||obj.onchange.toString().indexOf("reload")!=-1)isReload=true;if(obj.getAttribute("readonly")=="true"||obj.readOnly==true||(obj.getAttribute("readonly")=="")){bolReadOnly=true;obj.readOnly=false;}
if(obj.className.indexOf("Combo")!=-1){if(obj.getAttribute("onChange")){var onchange_combo=obj.getAttribute("onChange").toString();onchange_combo=onchange_combo.replace("function anonymous()\n","");onchange_combo=onchange_combo.replace("function onchange()\n","");onchange_combo=onchange_combo.replace("{\n","");onchange_combo=onchange_combo.replace("\n}","");}else{var onchange_combo="";}
if(onchange_combo.indexOf("selectCombo")!=-1){onchange_combo=onchange_combo.substring(0,onchange_combo.indexOf("selectCombo"))+onchange_combo.substring(onchange_combo.indexOf(";",onchange_combo.indexOf("selectCombo"))+1,onchange_combo.length);var onchange_combo2=onchange_combo;onchange_combo=onchange_combo.replace("return true; tmp_water_mark; ","");onchange_combo=onchange_combo.substring(0,onchange_combo.indexOf("return"))+onchange_combo.substring(onchange_combo.indexOf(";",onchange_combo.indexOf("return"))+1,onchange_combo.length);onchange_combo=onchange_combo.replace("(this)","(obj)");onchange_combo=onchange_combo.replace("(this,","(obj,");onchange_combo=onchange_combo.replace("(this ","(obj ");onchange_combo=onchange_combo.replace(",this)",",obj)");onchange_combo=onchange_combo.replace(" this)"," obj)");eval(onchange_combo);obj.setAttribute("onChange","selectCombo(this, '"+obj.value+"');"+onchange_combo2);}else{obj.onchange();}}else{if(obj.getAttribute('onchange')!=''&&obj.getAttribute('onchange')!=null&&obj.getAttribute('onchange')!='null'){obj.onchange();}}
if(bolReadOnly)obj.readOnly=true;}}
calloutProcessedObj=null;}
return(isReload);}
function fillElements(frm,name,callout){this.formName=frm;this.name=name;this.callout=callout;}
function setGWaitingCallOut(state){if(state==true){try{setCalloutProcessing(true);}
catch(e){}
gWaitingCallOut=true;}else if(state==false){try{setCalloutProcessing(false);}
catch(e){}
gWaitingCallOut=false;}else{return false;}
return true;}
function fillElementsFromArray(arrElements,calloutName,form){if(arrElements==null&&arrGeneralChange==null)return false;if(form==null||!form)form=document.forms[0];if(arrElements!=null){var total=arrElements.length;for(var x=0;x<total;x++){formElementValue(form,arrElements[x][0],arrElements[x][1]);}}
if(arrGeneralChange==null)arrGeneralChange=new Array();if(arrElements!=null){var n=arrGeneralChange.length;var total=arrElements.length;for(var x=0;x<total;x++){arrGeneralChange[x+n]=new fillElements(form.name,arrElements[x][0],calloutName);}}
while(arrGeneralChange!=null&&arrGeneralChange.length>0){var obj=arrGeneralChange[0].formName;var name=arrGeneralChange[0].name;var callout=arrGeneralChange[0].callout;{if(arrGeneralChange==null||arrGeneralChange.length==0)return true;var arrDataNew=new Array();var total=arrGeneralChange.length;for(var i=1;i<total;i++){arrDataNew[i-1]=new fillElements(arrGeneralChange[i].formName,arrGeneralChange[i].name,arrGeneralChange[i].callout);}
arrGeneralChange=null;arrGeneralChange=new Array();total=arrDataNew.length;for(var i=0;i<total;i++){arrGeneralChange[i]=new fillElements(arrDataNew[i].formName,arrDataNew[i].name,arrDataNew[i].callout);}}
if(formElementEvent(obj,name,callout))return true;}
return true;}
function inputValueForms(name,field){var result="";if(field==null||!field)return"";if(!field.type&&field.length>1)field=field[0];if(field.type){if(field.type.toUpperCase().indexOf("SELECT")!=-1){if(field.selectedIndex==-1)return"";else{var length=field.options.length;for(var fieldsCount=0;fieldsCount<length;fieldsCount++){if(field.options[fieldsCount].selected){if(result!="")result+="&";result+=name+"="+encodeURIComponent(field.options[fieldsCount].value);}}
return result;}}else if(field.type.toUpperCase().indexOf("RADIO")!=-1||field.type.toUpperCase().indexOf("CHECK")!=-1){if(!field.length){if(field.checked)return(name+"="+encodeURIComponent(field.value));else return"";}else{var total=field.length;for(var i=0;i<total;i++){if(field[i].checked){if(result!="")result+="&";result+=name+"="+encodeURIComponent(field[i].value);}}
return result;}}else return name+"="+encodeURIComponent(field.value);}
return"";}
function setFocus(field){if(field==null||!field)return"";if(!field.type&&field.length>1)field=field[0];try{field.focus();}catch(ignored){}
return"";}
function inputValue(field){if(field==null||!field)return"";if(!field.type&&field.length>1)field=field[0];if(field.type){if(field.type.toUpperCase().indexOf("SELECT")!=-1){if(field.selectedIndex==-1)return"";else return field.options[field.selectedIndex].value;}else if(field.type.toUpperCase().indexOf("RADIO")!=-1||field.type.toUpperCase().indexOf("CHECK")!=-1){if(!field.length)
return((field.checked)?field.value:"N");var total=field.length;for(var i=0;i<total;i++){if(field[i].checked)return field[i].value;}
return"N";}else return field.value;}
return"";}
function setInputValue(field,myvalue){if(field==null||field=="")return false;var obj=document.forms[0].elements[field];if(obj==null)return false;if(obj.length>1){var total=obj.length;for(var i=0;i<total;i++)obj[i].value=myvalue;}else obj.value=myvalue;return true;}
function displayLogicElement(id,display){var obj=getStyle(id);if(obj==null)return false;if(id.indexOf("_td")!=-1){obj=getReference(id);if(display)obj.className=obj.className.replace("_Nothing","");else{obj.className=obj.className.replace("_Nothing","");obj.className=obj.className+"_Nothing";}}else{if(display)obj.display="";else obj.display="none";}
return true;}
function readOnlyLogicElement(id,readonly){obj=getStyle(id);if(obj==null)return false;obj=getReference(id);className=obj.className;var onchange_combo=null;var newOnChange_combo=null;if(readonly){obj.className=className.replace("ReadOnly","");obj.readOnly=true;if(obj.setReadOnly){obj.setReadOnly(true);}
if(obj.getAttribute('type')=="checkbox"){var onclickTextA=getObjAttribute(obj,'onclick');var checkPatternA="^[return false;]";var checkRegExpA=new RegExp(checkPatternA);if(!onclickTextA.match(checkRegExpA)){onclickTextA='return false;'+onclickTextA;}
setObjAttribute(obj,'onclick',onclickTextA);}
if(className.indexOf("Combo ")!=-1||className.indexOf("ComboKey ")!=-1){if(className.indexOf("Combo ")!=-1)obj.className=className.replace("Combo","ComboReadOnly");else if(className.indexOf("ComboKey ")!=-1)obj.className=className.replace("ComboKey","ComboKeyReadOnly");disableAttributeWithFunction(obj,'obj','onChange');if(obj.getAttribute("onChange")){onchange_combo=getObjAttribute(obj,'onChange');}else{onchange_combo="";}
newOnChange_combo="selectCombo(this, '"+obj.value+"');"+onchange_combo;setObjAttribute(obj,'onChange',newOnChange_combo);}
if(className.indexOf("LabelText ")!=-1)
obj.className=className.replace("LabelText","LabelTextReadOnly");if((className.indexOf("TextBox_")!=-1)||(className.indexOf("TextArea_")!=-1)){if(className.indexOf("readonly")==-1)changeClass(id,'readonly ','');disableFieldButton(getAssociatedFieldButton(obj,'window'));}}else{obj.className=obj.className.replace("ReadOnly","");obj.className=obj.className.replace("readonly","");setObjAttribute(obj,'readOnly',"false");obj.readOnly=false;obj.removeAttribute('readOnly');if(obj.setReadOnly){obj.setReadOnly(false);}
if(obj.getAttribute('type')=="checkbox"){var onclickTextB=getObjAttribute(obj,'onclick');var checkPatternB="^[return false;]";var checkRegExpB=new RegExp(checkPatternB);if(onclickTextB.match(checkRegExpB)){onclickTextB=onclickTextB.substring(13,onclickTextB.length);}
onclickTextB=onclickTextB.replace('return false','return true');setObjAttribute(obj,'onclick',onclickTextB);}
if(obj.className.indexOf("Combo")!=-1){obj.className=obj.className.replace("NoUpdatable","");enableAttributeWithFunction(obj,'obj','onChange');if(obj.getAttribute("onChange")){onchange_combo=getObjAttribute(obj,'onChange');}else{onchange_combo="";}
if(onchange_combo.indexOf("selectCombo")!=-1){newOnChange_combo=onchange_combo.substring(0,onchange_combo.indexOf("selectCombo"))+onchange_combo.substring(onchange_combo.indexOf(";",onchange_combo.indexOf("selectCombo"))+1,onchange_combo.length);setObjAttribute(obj,'onChange',newOnChange_combo);}}
if((obj.className.indexOf("TextBox_")!=-1)||(obj.className.indexOf("TextArea_")!=-1)){enableFieldButton(getAssociatedFieldButton(obj,'window'));}}
return true;}
function autoCompleteNumber(obj,isFloatAllowed,isNegativeAllowed,evt){if(!evt)evt=window.event;var number=evt.keyCode?evt.keyCode:evt.which?evt.which:evt.charCode;if(number!=obtainKeyCode("ENTER")&&number!=obtainKeyCode("LEFTARROW")&&number!=obtainKeyCode("RIGHTARROW")&&number!=obtainKeyCode("UPARROW")&&number!=obtainKeyCode("DOWNARROW")&&number!=obtainKeyCode("DELETE")&&number!=obtainKeyCode("BACKSPACE")&&number!=obtainKeyCode("END")&&number!=obtainKeyCode("HOME")&&!evt["ctrlKey"]){if(number>95&&number<106){number=number-96;if(isNaN(number)){if(document.all)evt.returnValue=false;return false;}}else if(number!=obtainKeyCode("DECIMAL")&&number!=obtainKeyCode("NUMBERDECIMAL")&&number!=obtainKeyCode("NEGATIVE")&&number!=obtainKeyCode("NUMBERNEGATIVE")){number=String.fromCharCode(number);if(isNaN(number)){if(document.all)evt.returnValue=false;return false;}}else if(number==obtainKeyCode("DECIMAL")||number==obtainKeyCode("NUMBERDECIMAL")){if(isFloatAllowed){if(obj.value==null||obj.value=="")return true;else{var point=obj.value.indexOf(".");if(point!=-1){point=obj.value.indexOf(".",point+1);if(point==-1)return true;}else return true;}}
if(document.all)evt.returnValue=false;return false;}else{if(isNegativeAllowed&&(obj.value==null||obj.value.indexOf("-")==-1))return true;if(document.all)evt.returnValue=false;return false;}}
return true;}
function getObjFeatures(obj){if(typeof obj=="string"){obj=document.getElementById(obj);}
var objType=""
if(obj.tagName.toLowerCase()=='input'){objType+="input";objType+=" ";objType+=obj.getAttribute('type');objType+=" ";}
if(obj.getAttribute('readonly')=='true'||obj.readOnly){objType+="readonly";objType+=" ";}
if(obj.getAttribute('disabled')=='true'||obj.disabled){objType+="disabled";objType+=" ";}
return objType;}
function setPageLoading(status){if(status==false){isPageLoading=false;}else{isPageLoading=true;}}
function logChanges(field){if(field==null||!field)return false;return setChangedField(field,field.form);}
function changeToEditingMode(special,field){try{if(field&&field==calloutProcessedObj)return false;isContextMenuOpened=false;if(special=='force'){setWindowEditing(true);return true;}
if(mustBeIgnored(focusedWindowElement))return false;if(special=='oncut'||special=='onpaste'){checkFieldChange();}else if(special=='oncontextmenu'){var elementToCheck=focusedWindowElement;isContextMenuOpened=true;checkContextMenu(elementToCheck);}else if(special=='onkeydown'){setTimeout('checkIE7DelSuprKeys();',100);}else if(special=='onkeypress'){if(!isTabPressed&&focusedWindowElement.tagName.toUpperCase().indexOf("SELECT")!=-1&&focusedWindowElement&&!isCtrlPressed&&!isAltPressed&&isKeyboardLocked==false){setWindowEditing(true);}else if(!isTabPressed&&focusedWindowElement.tagName.toUpperCase().indexOf("SELECT")==-1&&!isCtrlPressed&&!isAltPressed&&isKeyboardLocked==false&&pressedKeyCode!='33'&&pressedKeyCode!='34'&&pressedKeyCode!='35'&&pressedKeyCode!='36'&&pressedKeyCode!='37'&&pressedKeyCode!='38'&&pressedKeyCode!='39'&&pressedKeyCode!='40'){setWindowEditing(true);}else if(isCtrlPressed&&isAltPressed&&isKeyboardLocked==false){checkFieldChange();}}else if(special=='onchange'){if(!isTabPressed&&focusedWindowElement.tagName.toUpperCase().indexOf("SELECT")!=-1&&focusedWindowElement==field&&!isCtrlPressed&&!isAltPressed&&isKeyboardLocked==false){setWindowEditing(true);}}}catch(e){}}
function checkIE7DelSuprKeys(){if(focusedWindowElement.tagName.toUpperCase().indexOf("SELECT")==-1&&getBrowserInfo('name').indexOf("Firefox")==-1&&getBrowserInfo('name').indexOf("IceWeasel")==-1){if(pressedKeyCode=='46'||pressedKeyCode=='8'){setWindowEditing(true);}}}
function checkContextMenu(elementToCheck){if(isContextMenuOpened==true){checkFieldChange(elementToCheck);setTimeout(function(){checkContextMenu(elementToCheck);},50);}}
function checkFieldChange(elementToCheck){if(elementToCheck==null||elementToCheck=='null'||elementToCheck==''){elementToCheck=focusedWindowElement;}
var beforeShortcutValue=null;var afterShortcutValue=null;try{beforeShortcutValue=elementToCheck.value;}catch(e){}
setTimeout(function(){try{afterShortcutValue=elementToCheck.value;}catch(e){}if(afterShortcutValue!=beforeShortcutValue){setWindowEditing(true);}},50);}
function windowUndo(form){form.reset();for(var i=0;i<form.elements.length;i++){var element=form.elements[i];if(element.doReset){element.doReset();}
try{if(element.onchange){var onchangecode=element.onchange.toString();if(onchangecode.indexOf('selectCombo')!==-1){var indSel=onchangecode.indexOf('selectCombo');var afterselect=onchangecode.substring(indSel,onchangecode.length);var selectComboCode=afterselect.substring(0,afterselect.indexOf(');')+2).replace('this','document.getElementById("'+element.id+'")');eval(selectComboCode);}}}catch(e){}}
form.inpLastFieldChanged.value='';setWindowEditing(false);displayLogic();}
function round(number,X){X=(!X?2:X);if(!number||isNaN(number))return 0;return Math.round(number*Math.pow(10,X))/Math.pow(10,X);}
function ReplaceText(text,replaceWhat,replaceWith){if(text==null||text.length==0)return"";text+="";var i=text.indexOf(replaceWhat);var j=0;while(i!=-1){var partial=text.substring(0,i);text=text.substring(i+replaceWhat.length);text=partial+replaceWith+text;j=i+replaceWith.length;i=text.indexOf(replaceWhat,j);}
return text;}
function updateOnChange(field){if(field==null)return false;try{var lastChanged=inputValue(document.forms[0].inpLastFieldChanged);field.onchange();setInputValue(document.forms[0].inpLastFieldChanged,lastChanged);}catch(e){}
return true;}
function xx()
{return true;}
function selected(cal,date){cal.sel.value=date;if(cal.dateClicked&&(cal.sel.id=="sel1"||cal.sel.id=="sel3"))
cal.callCloseHandler();}
function closeHandler(cal){if(typeof(cal.sel.onchange)!="undefined"&&cal.sel.onchange!=null){cal.sel.onchange();}
cal.sel.focus();cal.hide();_dynarch_popupCalendar=null;}
function getDateFormat(str_format){var format="";str_format=str_format.replace("mm","MM").replace("dd","DD").replace("yyyy","YYYY").replace("yy","YY");str_format=str_format.replace("%D","%d").replace("%M","%m");if(str_format!=null&&str_format!=""&&str_format!="null"){format=str_format;format=format.replace("YYYY","%Y");format=format.replace("YY","%y");format=format.replace("MM","%m");format=format.replace("DD","%d");format=format.substring(0,8);}
str_format=str_format.replace("hh","HH").replace("HH24","HH").replace("mi","MI").replace("ss","SS");str_format=str_format.replace("%H","HH").replace("HH:%m","HH:MI").replace("HH.%m","HH.MI").replace("%S","SS");str_format=str_format.replace("HH:mm","HH:MI").replace("HH.mm","HH.MI");str_format=str_format.replace("HH:MM","HH:MI").replace("HH.MM","HH.MI");if(str_format==null||str_format==""||str_format=="null")str_format=defaultDateFormat;else if(str_format.indexOf(" HH:MI:SS")!=-1)format+=" %H:%M:%S";else if(str_format.indexOf(" HH:MI")!=-1)format+=" %H:%M";else if(str_format.indexOf(" HH.MI.SS")!=-1)format+=" %H.%M.%S";else if(str_format.indexOf(" HH.MI")!=-1)format+=" %H.%M";return format;}
function showCalendar(id,value,debug,format,showsTime,showsOtherMonths){isTabBlocked=true;var el=eval("document."+id);if(showsTime==null)showsTime="";if(showsOtherMonths==null)showsOtherMonths=false;if(format==null||format=="")format=getDateFormat(el.getAttribute("displayformat"));else format=getDateFormat(format);if(format.indexOf(" %H:%M")!=-1)showsTime="24";else if(format.indexOf(" %H.%M")!=-1)showsTime="24";if(_dynarch_popupCalendar!=null){_dynarch_popupCalendar.hide();}else{var cal=new Calendar(1,null,selected,closeHandler);cal.weekNumbers=false;if(typeof showsTime=="string"&&showsTime!=""){cal.showsTime=true;cal.time24=(showsTime=="24");}
if(showsOtherMonths){cal.showsOtherMonths=true;}
_dynarch_popupCalendar=cal;cal.setRange(1900,2070);cal.create();}
dateFormat=format;_dynarch_popupCalendar.setDateFormat(format);_dynarch_popupCalendar.parseDate(el.value);_dynarch_popupCalendar.sel=el;_dynarch_popupCalendar.showAtElement(el,"Br");return false;}
function datecmp(date1,date2,fmt){if(date1==null||date1=="")return null;else if(date2==null||date2=="")return null;var mydate1=getDate(date1,fmt);var mydate2=getDate(date2,fmt);if(mydate1==null||mydate1==""||mydate2==null||mydate2=="")return null;if(mydate1.getFullYear()>mydate2.getFullYear())return 1;else if(mydate1.getFullYear()==mydate2.getFullYear()){if(mydate1.getMonth()>mydate2.getMonth())return 1;else if(mydate1.getMonth()==mydate2.getMonth()){if(mydate1.getDate()>mydate2.getDate())return 1;else if(mydate1.getDate()==mydate2.getDate()){if(mydate1.getHours()>mydate2.getHours())return 1;else if(mydate1.getHours()==mydate2.getHours()){if(mydate1.getMinutes()>mydate2.getMinutes())return 1;else if(mydate1.getMinutes()==mydate2.getMinutes())return 0;else return-1;}else return-1;}else return-1;}else return-1;}else return-1;}
function checkFormat(formatType){switch(formatType){case'Y':return 4;case'm':return 2;case'd':return 2;default:return 2;}
return 0;}
function getSeparators(format){if(format==null||format.length==0)return null;var result=new Array();var pos=format.indexOf("%");var last=0;var i=0;while(pos!=-1){if(pos>last){result[i++]=format.substring(last,pos);}
last=pos+2;pos=format.indexOf("%",last);}
if(last<format.length)result[i]=format.substring(last);return result;}
function isInArray(obj,text){if(obj==null||obj.length==0)return false;if(text==null||text.length==0)return false;var total=obj.length;for(var i=0;i<total;i++){if(obj[i].toUpperCase()==text.toUpperCase())return true;}
return false;}
function about(){var appUrl=getAppUrl();var complementosNS4=""
var strHeight=500;var strWidth=600;var strTop=parseInt((screen.height-strHeight)/2);var strLeft=parseInt((screen.width-strWidth)/2);if(navigator.appName.indexOf("Netscape"))
complementosNS4="alwaysRaised=1, dependent=1, directories=0, hotkeys=0, menubar=0, ";var complementos=complementosNS4+"height="+strHeight+", width="+strWidth+", left="+strLeft+", top="+strTop+", screenX="+strLeft+", screenY="+strTop+", location=0, resizable=yes, scrollbars=yes, status=0, toolbar=0, titlebar=0";var winPopUp=window.open(appUrl+"/ad_forms/about.html","ABOUT",complementos);if(winPopUp!=null){winPopUp.focus();document.onunload=function(){winPopUp.close();};document.onmousedown=function(){winPopUp.close();};}
return winPopUp;}
function buttonEvent(event,obj){if(obj.className.indexOf('ButtonLink_disabled')==-1){if(event=="onkeyup"){obj.className='ButtonLink_focus';}else if(event=="onkeydown"){}else if(event=="onkeypress"){obj.className='ButtonLink_active';}else if(event=="onmouseup"){if(obj.className.indexOf('ButtonLink_active')!=-1){obj.className=obj.className.replace(' xx','');obj.className=obj.className.replace('ButtonLink_active','');}}else if(event=="onmousedown"){if(obj.className.indexOf('ButtonLink_hover')!=-1){obj.className=obj.className.replace(' xx','');obj.className=obj.className.replace('ButtonLink_hover','');}
if(obj.className.indexOf('ButtonLink_active')==-1){obj.className='ButtonLink_active'+' xx'+obj.className;}}else if(event=="onmouseover"){if(obj.className.indexOf('ButtonLink_hover')==-1){obj.className='ButtonLink_hover'+' xx'+obj.className;}}else if(event=="onmouseout"){if(obj.className.indexOf('ButtonLink_active')!=-1){obj.className=obj.className.replace(' xx','');obj.className=obj.className.replace('ButtonLink_active','');}
if(obj.className.indexOf('ButtonLink_hover')!=-1){obj.className=obj.className.replace(' xx','');obj.className=obj.className.replace('ButtonLink_hover','');}
window.status='';}else if(event=="onfocus"){setWindowElementFocus(obj);}else if(event=="onblur"){window.status='';}else if(event=="onclick"){}}
return true;}
function goToPreviousPage(){setMDIEnvironment();if(isWindowInMDIPage){var appFrame=getFrame("appFrame");appFrame.history.back();return;}
var appUrl=getAppUrl();openLink(appUrl+'/secureApp/GoBack.html','appFrame');}
function resizeArea(isOnResize){if(isOnResize==null)isOnResize=false;var mnu=document.getElementById("client");var mleft=document.getElementById("tdLeftTabsBars");var mleftSeparator=document.getElementById("tdleftSeparator");var mright=document.getElementById("tdrightSeparator");var mtop=document.getElementById("tdtopNavButtons");var mtopToolbar=document.getElementById("tdToolBar");var mtopTabs=document.getElementById("tdtopTabs");var mbottombut=document.getElementById("tdbottomButtons");var mbottom=document.getElementById("tdbottomSeparator");var body=document.getElementsByTagName("BODY");var h,w;h=body[0].clientHeight;w=body[0].clientWidth;var mnuWidth=w-((mleft?mleft.clientWidth:0)+(mleftSeparator?mleftSeparator.clientWidth:0)+(mright?mright.clientWidth:0))-2;var mnuHeight=h-((mtop?mtop.clientHeight:0)+(mtopToolbar?mtopToolbar.clientHeight:0)+(mtopTabs?mtopTabs.clientHeight:0)+(mbottom?mbottom.clientHeight:0)+(mbottombut?mbottombut.clientHeight:0))-1;if(mnuWidth<0){mnuWidth=0;}
if(mnuHeight<0){mnuHeight=0;}
mnu.style.width=mnuWidth;mnu.style.height=mnuHeight;var mbottomButtons=document.getElementById("tdbottomButtons");if(mbottomButtons)mbottomButtons.style.width=w-((mleft?mleft.clientWidth:0)+(mleftSeparator?mleftSeparator.clientWidth:0)+(mright?mright.clientWidth:0))-2;try{if(isOnResize)dijit.byId('grid').onResize();}catch(e){}
mnu.style.display="";}
function resizeAreaHelp(){var mnu=document.getElementById("client");var mnuIndex=document.getElementById("clientIndex");var mTopSeparator=document.getElementById("tdSeparator");var mTopNavigation=document.getElementById("tdNavigation");var body=document.getElementsByTagName("BODY");var h,w;h=body[0].clientHeight;w=body[0].clientWidth;var mnuHeight=h-(mTopSeparator.clientHeight+mTopNavigation.clientHeight)-2;if(mnuHeight<0){mnuHeight=0;}
mnu.style.height=mnuHeight;mnuIndex.style.height=mnu.style.height;mnu.style.display="";mnuIndex.style.display="";}
function resizeAreaInfo(isOnResize){if(isOnResize==null)isOnResize=false;var table_header=document.getElementById("table_header");var client_top=document.getElementById("client_top");var client_middle=document.getElementById("client_middle");var client_bottom=document.getElementById("client_bottom");var body=document.getElementsByTagName("BODY");var h,w;h=body[0].clientHeight;w=body[0].clientWidth;var client_middleWidth=w;var client_middleHeight=h-((table_header?table_header.clientHeight:0)+(client_top?client_top.clientHeight:0)+(client_bottom?client_bottom.clientHeight:0))-1;if(client_middleWidth<0){client_middleWidth=0;}
if(client_middleHeight<170){client_middleHeight=170;}
client_middle.style.height=client_middleHeight;client_middle.style.width=client_middleWidth;try{if(document.getElementById("grid_toptext")){document.getElementById('grid_toptext').style.width=w-50;}
if(document.getElementById("grid_bottomtext")){document.getElementById('grid_bottomtext').style.width=w-50;}
if(isOnResize)dijit.byId('grid').onResize();}catch(e){}}
function resizeAreaCreateFrom(isOnResize){if(isOnResize==null)isOnResize=false;var table_header=document.getElementById("table_header");var client_messagebox=document.getElementById("client_messagebox");var client_top=document.getElementById("client_top");var client_middle=document.getElementById("client_middle");var client_bottom=document.getElementById("client_bottom");var body=document.getElementsByTagName("BODY");var h,w;h=body[0].clientHeight;w=body[0].clientWidth;var name=window.navigator.appName;var client_middleWidth=w-0;var client_middleHeight=h-((table_header?table_header.clientHeight:0)+(client_messagebox?client_messagebox.clientHeight:0)+(client_top?client_top.clientHeight:0)+(client_bottom?client_bottom.clientHeight:0))-1;if(client_middleWidth<0){client_middleWidth=0;}
if(client_middleHeight<80){client_middleHeight=80;}
client_middle.style.height=client_middleHeight;client_middle.style.width=client_middleWidth;client_middle.style.display="";try{if(isOnResize)dijit.byId('grid').onResize();}catch(e){}}
function resizeAreaInstallationHistoryGrid(isOnResize){if(isOnResize==null)isOnResize=false;var client=document.getElementById("client");var client_top=document.getElementById("client_top");var installationHistoryGrid=document.getElementById("installationHistoryGrid");installationHistoryGrid.style.height=client.clientHeight-((client_top?client_top.clientHeight:0)-1+8);try{if(isOnResize)dijit.byId('grid').onResize();}catch(e){}}
function resizePopup(){var mnu=document.getElementById("client");var table_header=document.getElementById("table_header");var body=document.getElementsByTagName("BODY");var h,w;h=body[0].clientHeight;w=body[0].clientWidth;var name=window.navigator.appName;var mnuHeight=h-(table_header?table_header.clientHeight:0);var mnuWidth=w;if(mnuWidth<0){mnuWidth=0;}
if(mnuHeight<0){mnuHeight=0;}
mnu.style.height=mnuHeight;mnu.style.width=mnuWidth;mnu.style.display="";}
function calculateMsgBoxWidth(){var client_width=document.getElementById("client").clientWidth;var msgbox_table=document.getElementById("messageBoxID");msgbox_table.style.width=client_width;}
function changeAuditStatus(){var appUrl=getAppUrl();if(strShowAudit=="Y")strShowAudit="N";else strShowAudit="Y";displayLogic();changeAuditIcon(strShowAudit);var paramXMLReq=null;submitXmlHttpRequest(xx,null,'CHANGE',appUrl+"/utility/ChangeAudit",false,null,paramXMLReq);return true;}
function changeAuditStatusRelation(){var appUrl=getAppUrl();var paramXMLReq=null;submitXmlHttpRequest(document.getElementById("buttonRefresh").onclick,null,'CHANGE',appUrl+"/utility/ChangeAudit",false,null,paramXMLReq);return true;}
function changeAuditIcon(newStatus){obj=document.getElementById("linkButtonAudit");if(obj==null)return false;obj.className="Main_ToolBar_Button"+(newStatus=="Y"?"_Selected":"");if(newStatus=="Y")
setTimeout("getDataBaseStandardMessage('hideAudit', changeAuditIconTitle)",100);else
setTimeout("getDataBaseStandardMessage('showAudit', changeAuditIconTitle)",100);}
function changeAuditIconTitle(paramXMLParticular,XMLHttpRequestObj){var obj;object=document.getElementById("buttonAudit");if(getReadyStateHandler(XMLHttpRequestObj)){try{if(XMLHttpRequestObj.responseXML)obj=XMLHttpRequestObj.responseXML.documentElement;}catch(e){}
if(obj&&object){var status=obj.getElementsByTagName('status');if(status.length>0){object.title=status[0].getElementsByTagName('description')[0].firstChild.nodeValue;}}}
return false;}
function goToDivAnchor(div,elementId){div=document.getElementById(div);elementId=document.getElementById(elementId);div.scrollTop=elementId.offsetTop-div.offsetTop;}
function getGlobalDecSeparator(){var m=getFrame('frameMenu');return m.decSeparator_global;}
function getGlobalGroupSeparator(){var m=getFrame('frameMenu');return m.groupSeparator_global;}
function getGlobalGroupInterval(){var m=getFrame('frameMenu');return m.groupInterval_global;}
function isJavaMask(){var isJavaMask=true;return isJavaMask;}
function getDefaultMaskNumeric(){var m=getFrame('frameMenu');var maskNumeric_default=m.maskNumeric_default;if(isJavaMask()){decSeparator=getGlobalDecSeparator();groupSeparator=getGlobalGroupSeparator();maskNumeric_default=returnMaskChange(maskNumeric_default,".",",",decSeparator,groupSeparator);}
return maskNumeric_default;}
function getInputNumberMask(obj){var outputformat=obj.getAttribute('outputformat');outputformat=formatNameToMask(outputformat);return outputformat;}
function formatNameToMask(formatName){var maskNumeric="";var decSeparator="";var groupSeparator="";var F=getFrame('frameMenu').F;if(typeof F==='undefined'){return maskNumeric;}
if(formatName==null||formatName==""||formatName=="null"){formatName="qtyEdition";}
maskNumeric=F.getFormat(formatName);if(isJavaMask()){decSeparator=getGlobalDecSeparator();groupSeparator=getGlobalGroupSeparator();maskNumeric=returnMaskChange(maskNumeric,".",",",decSeparator,groupSeparator);}
return maskNumeric;}
function focusNumberInput(obj,maskNumeric,decSeparator,groupSeparator,groupInterval){if(maskNumeric==null||maskNumeric=="")maskNumeric=getDefaultMaskNumeric();if(decSeparator==null||decSeparator=="")decSeparator=getGlobalDecSeparator();if(groupSeparator==null||groupSeparator=="")groupSeparator=getGlobalGroupSeparator();if(groupInterval==null||groupInterval=="")groupInterval=getGlobalGroupInterval();var isTextSelected=false;if(obj.value.length>0){if(getCaretPosition(obj).start!=getCaretPosition(obj).end&&getCaretPosition(obj).end==obj.value.length){isTextSelected=true;}}
var oldCaretPosition=getCaretPosition(obj).start;var newCaretPosition=returnNewCaretPosition(obj,oldCaretPosition,groupSeparator);var number=obj.value;var isValid=checkNumber(number,maskNumeric,decSeparator,groupSeparator,groupInterval);if(!isValid){return false;}
var plainNumber=returnPlainNumber(number,decSeparator,groupSeparator);obj.value=plainNumber;setCaretToPos(obj,newCaretPosition);if(isTextSelected==true&&selectInputTextOnTab){obj.select();}}
function returnNewCaretPosition(obj,oldCaretPosition,groupSeparator){var newCaretPosition=oldCaretPosition;for(var i=oldCaretPosition;i>0;i--){if(obj.value.substring(i-1,i)==groupSeparator){newCaretPosition=newCaretPosition-1;}}
return newCaretPosition;}
function returnPlainNumber(number,decSeparator,groupSeparator){number=number.toString();var plainNumber=number;var groupRegExp=new RegExp("\\"+groupSeparator,"g");plainNumber=plainNumber.replace(groupRegExp,"");var numberSign="";if(plainNumber.substring(0,1)=="+"){numberSign="";plainNumber=plainNumber.substring(1,number.length);}else if(plainNumber.substring(0,1)=="-"){numberSign="-";plainNumber=plainNumber.substring(1,number.length);}
if(plainNumber.indexOf(decSeparator)!=-1){while(plainNumber.substring(plainNumber.length-1,plainNumber.length)=="0"){plainNumber=plainNumber.substring(0,plainNumber.length-1);}}
while(plainNumber.substring(0,1)=="0"&&plainNumber.substring(1,2)!=decSeparator&&plainNumber.length>1){plainNumber=plainNumber.substring(1,plainNumber.length);}
if(plainNumber.substring(plainNumber.length-1,plainNumber.length)==decSeparator){plainNumber=plainNumber.substring(0,plainNumber.length-1);}
if(plainNumber!="0"){plainNumber=numberSign+plainNumber;}
return plainNumber;}
function returnFormattedToCalc(number,decSeparator,groupSeparator){if(decSeparator==null||decSeparator=="")decSeparator=getGlobalDecSeparator();if(groupSeparator==null||groupSeparator=="")groupSeparator=getGlobalGroupSeparator();var calcNumber=number;calcNumber=returnPlainNumber(calcNumber,decSeparator,groupSeparator);calcNumber=calcNumber.replace(decSeparator,'.');return calcNumber;}
function returnCalcToFormatted(number,maskNumeric,decSeparator,groupSeparator,groupInterval){var formattedNumber=number;formattedNumber=formattedNumber.toString();formattedNumber=formattedNumber.replace(".",decSeparator);formattedNumber=returnFormattedNumber(formattedNumber,maskNumeric,decSeparator,groupSeparator,groupInterval);return formattedNumber;}
function returnMaskChange(maskNumeric,decSeparator_old,groupSeparator_old,decSeparator_new,groupSeparator_new){if(decSeparator_new==null||decSeparator_new=="")decSeparator_new=getGlobalDecSeparator();if(groupSeparator_new==null||groupSeparator_new=="")groupSeparator_new=getGlobalGroupSeparator();var realMask="";for(var i=0;i<maskNumeric.length;i++){if(maskNumeric.substring(i,i+1)==decSeparator_old){realMask=realMask+decSeparator_new;}else if(maskNumeric.substring(i,i+1)==groupSeparator_old){realMask=realMask+groupSeparator_new;}else{realMask=realMask+maskNumeric.substring(i,i+1);}}
return realMask;}
function blurNumberInput(obj,maskNumeric,decSeparator,groupSeparator,groupInterval){if(maskNumeric==null||maskNumeric=="")maskNumeric=getDefaultMaskNumeric();if(decSeparator==null||decSeparator=="")decSeparator=getGlobalDecSeparator();if(groupSeparator==null||groupSeparator=="")groupSeparator=getGlobalGroupSeparator();if(groupInterval==null||groupInterval=="")groupInterval=getGlobalGroupInterval();var number=obj.value;var isValid=checkNumber(number,maskNumeric,decSeparator,groupSeparator,groupInterval);if(obj.getAttribute('maxlength')){if(obj.value.length>obj.getAttribute('maxlength')){isValid=false;}}
updateNumberMiniMB(obj,isValid);if(!isValid){return false;}
var formattedNumber=returnFormattedNumber(number,maskNumeric,decSeparator,groupSeparator,groupInterval);obj.value=formattedNumber;}
function numberInputEvent(command,obj,evt){if(command=="onfocus"){focusNumberInput(obj,getInputNumberMask(obj));return true;}else if(command=="onblur"){blurNumberInput(obj,getInputNumberMask(obj));return true;}else if(command=="onkeydown"){manageDecPoint(obj,null,evt);return true;}else if(command=="onchange"){blurNumberInput(obj,getInputNumberMask(obj));return true;}}
function updateNumberMiniMB(obj,isValid){if(!document.getElementById(obj.id+"invalidSpan")){return true;}
var miniMessageBox_invalid=document.getElementById(obj.id+"invalidSpan");if(!isValid){miniMessageBox_invalid.style.display="";return true;}else{miniMessageBox_invalid.style.display="none";}
if(!document.getElementById(obj.id+"missingSpan")){return true;}
var isRequired=obj.getAttribute("required");if(isRequired=="true")isRequired=true;else if(isRequired=="false")isRequired=false;var isMissing=false;if(obj.value.length==0){isMissing=true;}
var miniMessageBox_missing=document.getElementById(obj.id+"missingSpan");if(isRequired&&isMissing){miniMessageBox_missing.style.display="";return true;}else{miniMessageBox_missing.style.display="none";}
return true;}
function returnFormattedNumber(number,maskNumeric,decSeparator,groupSeparator,groupInterval){if(number==""||number==null){return number;}
if(maskNumeric.indexOf("+")==0||maskNumeric.indexOf("-")==0){maskNumeric=maskNumeric.substring(1,maskNumeric.length);}
if(maskNumeric.indexOf(groupSeparator)!=-1&&maskNumeric.indexOf(decSeparator)!=-1&&maskNumeric.indexOf(groupSeparator)>maskNumeric.indexOf(decSeparator)){var fixRegExp=new RegExp("\\"+groupSeparator,"g");maskNumeric=maskNumeric.replace(fixRegExp,"");}
var maskLength=maskNumeric.length;var decMaskPosition=maskNumeric.indexOf(decSeparator);if(decMaskPosition==-1)decMaskPosition=maskLength;var intMask=maskNumeric.substring(0,decMaskPosition);var decMask=maskNumeric.substring(decMaskPosition+1,maskLength);if(decMask.indexOf(groupSeparator)!=-1||decMask.indexOf(decSeparator)!=-1){var fixRegExp_1=new RegExp("\\"+groupSeparator,"g");decMask=decMask.replace(fixRegExp_1,"");var fixRegExp_2=new RegExp("\\"+decSeparator,"g");decMask=decMask.replace(fixRegExp_2,"");}
number=number.toString();number=returnPlainNumber(number,decSeparator,groupSeparator);var numberSign="";if(number.substring(0,1)=="+"){numberSign="";number=number.substring(1,number.length);}else if(number.substring(0,1)=="-"){numberSign="-";number=number.substring(1,number.length);}
var formattedNumber="";var numberLength=number.length;var decPosition=number.indexOf(decSeparator);if(decPosition==-1)decPosition=numberLength;var intNumber=number.substring(0,decPosition);var decNumber=number.substring(decPosition+1,numberLength);if(decNumber.length>decMask.length){decNumber="0."+decNumber;decNumber=roundNumber(decNumber,decMask.length);decNumber=decNumber.toString();if(decNumber.substring(0,1)=="1"){intNumber=parseFloat(intNumber);intNumber=intNumber+1;intNumber=intNumber.toString();}
decNumber=decNumber.substring(2,decNumber.length);}
if(decNumber.length<decMask.length){var decNumber_temp=""
for(var i=0;i<decMask.length;i++){if(decMask.substring(i,i+1)=="#"){if(decNumber.substring(i,i+1)!=""){decNumber_temp=decNumber_temp+decNumber.substring(i,i+1);}}else if(decMask.substring(i,i+1)=="0"){if(decNumber.substring(i,i+1)!=""){decNumber_temp=decNumber_temp+decNumber.substring(i,i+1);}else{decNumber_temp=decNumber_temp+"0";}}}
decNumber=decNumber_temp;}
var isGroup=false;if(intMask.indexOf(groupSeparator)!=-1){isGroup=true;}
var groupRegExp=new RegExp("\\"+groupSeparator,"g");intMask=intMask.replace(groupRegExp,"");if(intNumber.length<intMask.length){var intNumber_temp="";var diff=intMask.length-intNumber.length;for(var i=intMask.length;i>0;i--){if(intMask.substring(i-1,i)=="#"){if(intNumber.substring(i-1-diff,i-diff)!=""){intNumber_temp=intNumber.substring(i-1-diff,i-diff)+intNumber_temp;}}else if(intMask.substring(i-1,i)=="0"){if(intNumber.substring(i-1-diff,i-diff)!=""){intNumber_temp=intNumber.substring(i-1-diff,i-diff)+intNumber_temp;}else{intNumber_temp="0"+intNumber_temp;}}}
intNumber=intNumber_temp;}
if(isGroup==true){var intNumber_temp="";var groupCounter=0;for(var i=intNumber.length;i>0;i--){intNumber_temp=intNumber.substring(i-1,i)+intNumber_temp;groupCounter++;if(groupCounter==groupInterval&&i!=1){groupCounter=0;intNumber_temp=groupSeparator+intNumber_temp;}}
intNumber=intNumber_temp;}
if(intNumber==""&&decNumber!=""){intNumber="0";}
formattedNumber=numberSign+intNumber;if(decNumber!=""){formattedNumber+=decSeparator+decNumber;}
return formattedNumber;}
function checkNumber(number,maskNumeric,decSeparator,groupSeparator,groupInterval){var bolNegative=true;if(maskNumeric.indexOf("+")==0){bolNegative=false;maskNumeric=maskNumeric.substring(1,maskNumeric.length);}
var bolDecimal=true;if(maskNumeric.indexOf(decSeparator)==-1){bolDecimal=false;}
var checkPattern="";checkPattern+="^";if(bolNegative){checkPattern+="([+]|[-])?";}
checkPattern+="(\\d+)?((\\"+groupSeparator+"\\d{"+groupInterval+"})?)+";if(bolDecimal){checkPattern+="(\\"+decSeparator+"\\d+)?";}
checkPattern+="$";var checkRegExp=new RegExp(checkPattern);if(number.match(checkRegExp)&&number.substring(0,1)!=groupSeparator){return true;}
return false;}
function roundNumber(num,dec){var result=Math.round(num*Math.pow(10,dec))/Math.pow(10,dec);return result;}
function formattedNumberOp(number1,operator,number2,result_maskNumeric,decSeparator,groupSeparator,groupInterval){if(result_maskNumeric==null||result_maskNumeric=="")result_maskNumeric=getDefaultMaskNumeric();if(decSeparator==null||decSeparator=="")decSeparator=getGlobalDecSeparator();if(groupSeparator==null||groupSeparator=="")groupSeparator=getGlobalGroupSeparator();if(groupInterval==null||groupInterval=="")groupInterval=getGlobalGroupInterval();var result;number1=returnFormattedToCalc(number1,decSeparator,groupSeparator);number1=parseFloat(number1);number2=returnFormattedToCalc(number2,decSeparator,groupSeparator);number2=parseFloat(number2);if(operator=="sqrt"){result=Math.sqrt(number1);}else if(operator=="round"){result=roundNumber(number1,number2);}else{result=eval('('+number1+')'+operator+'('+number2+')');}
if(result!=true&&result!=false&&result!=null&&result!=""){result=returnCalcToFormatted(result,result_maskNumeric,decSeparator,groupSeparator,groupInterval)}
return result;}
function CaretPosition(){var start=null;var end=null;}
function getCaretPosition(oField){var oCaretPos=new CaretPosition();if(document.selection){oField.focus();var oSel=document.selection.createRange();var selectionLength=oSel.text.length;oSel.moveStart('character',-oField.value.length);oCaretPos.start=oSel.text.length-selectionLength;oCaretPos.end=oSel.text.length;}
else if(oField.selectionStart||oField.selectionStart=='0')
{oCaretPos.start=oField.selectionStart;oCaretPos.end=oField.selectionEnd;}
return(oCaretPos);}
function setSelectionRange(obj,selectionStart,selectionEnd){if(obj.setSelectionRange){obj.focus();obj.setSelectionRange(selectionStart,selectionEnd);}else if(obj.createTextRange){var range=obj.createTextRange();range.collapse(true);range.moveEnd('character',selectionEnd);range.moveStart('character',selectionStart);range.select();}}
function setCaretToEnd(obj){setSelectionRange(obj,obj.value.length,obj.value.length);}
function setCaretToBegin(obj){setSelectionRange(obj,0,0);}
function setCaretToPos(obj,pos){setSelectionRange(obj,pos,pos);}
function manageDecPoint(obj,decSeparator,evt){if(decSeparator==null||decSeparator=="")decSeparator=getGlobalDecSeparator();if(decSeparator=="."){return true;}
var caretPosition=getCaretPosition(obj).start;if(!evt)evt=window.event;var keyCode=evt.keyCode?evt.keyCode:evt.which?evt.which:evt.charCode;var inpMaxlength=obj.getAttribute("maxlength");var inpLength=obj.value.length;var isInpMaxLength=false;if(inpMaxlength===null){isInpMaxLength=false;}else if(inpLength>=inpMaxlength){isInpMaxLength=true;}
if(getBrowserInfo('name').toUpperCase().indexOf("OPERA")!=-1&&keyCode==78){keyCode=110;}
if(keyCode==110&&!isInpMaxLength){setTimeout(function(){obj.value=replaceAt(obj.value,decSeparator,caretPosition);setCaretToPos(obj,caretPosition+1);},5);}
return true;}
function replaceAt(string,what,ini,end){if(typeof end=="undefined"||end==null||end=="null"||end==""){end=ini;}
if(ini>end){var temp=ini;ini=end;end=temp;}
var newString="";newString=string.substring(0,ini)+what+string.substring(end+1,string.length);return newString;}
function closePage(okEvent){if(isWindowInMDIPopup){setTimeout(function(){getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup.close(MDIPopupId,!okEvent);},10);}else if(isWindowInMDITab){}else{top.window.close();}
return true;}
function popupResizeTo(width,height){if(isWindowInMDIPopup){getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup.resize(MDIPopupId,width,height);}else if(isWindowInMDITab){}else{window.resizeTo(width,height);}
return true;}
function LayoutMDICheck(target){if(target!==null){try{if(typeof target.OB!=="undefined"){if(typeof target.OB.Layout!=="undefined"){if(typeof target.OB.Layout.ViewManager==="object"){return true;}}}}catch(e){return false;}}
return false;}
function setMDIEnvironment(){if(isMDIEnvironmentSet){return;}
isMDIEnvironmentSet=true;try{if(isWindowInMDITab&&typeof sendWindowInfoToMDI==="function"){sendWindowInfoToMDI();}}catch(e){}}
function checkWindowInMDIPopup(target){var result=true;if(!target||target==="null"||target===""){target=window;}
try{while((target.document!==target.parent.document)&&(!target.document.getElementById('MDIPopupContainer'))){target=target.parent;}}catch(e){}
if(!target.document.getElementById('MDIPopupContainer')){result=false;}else{MDIPopupId=target.document.getElementById('MDIPopupContainer').name;}
if(window.name!=='frameMenu'&&window.location.href.indexOf('utility/VerticalMenu.html')===-1){if(result===true&&MDIPopupId!==null&&document.title&&getFrame('LayoutMDI')&&getFrame('LayoutMDI').OB&&getFrame('LayoutMDI').OB.Layout&&getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility&&getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup&&getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup.setTitle){getFrame('LayoutMDI').OB.Layout.ClassicOBCompatibility.Popup.setTitle(MDIPopupId,document.title);}}
return result;}
function checkWindowInMDITab(target){var result=true;if(isWindowInMDIPopup===true){result=false;}else{if(!target||target==="null"||target===""){target=window;}
try{while((target.document!==target.parent.document)&&(!LayoutMDICheck(target))){target=target.parent;}}catch(e){}
if(!LayoutMDICheck(target)){result=false;}}
return result;}
function checkWindowInMDIPage(target){var result=false;if(isWindowInMDIPopup===true||isWindowInMDITab===true){result=true;}
return result;}
function checkWindowInMDIContext(target){var result=true;if(!target||target==="null"||target===""){target=window;}
if(isWindowInMDIPage){result=true;}else{var LayoutMDI=getFrame('LayoutMDI');if(LayoutMDI!==null){result=true;}else{result=false;}}
return result;}
function sendWindowInfoToMDI(){if(!isWindowInMDITab){return false;}
var LayoutMDI=getFrame('LayoutMDI');var windowId=null;var tabId=null;var keyName=null;var recordId=null;var title=null;var mode=null;if(typeof getElementsByName('inpwindowId','input')[0]!=="undefined"){windowId=getElementsByName('inpwindowId','input')[0].value;}
if(typeof getElementsByName('inpTabId','input')[0]!=="undefined"){tabId=getElementsByName('inpTabId','input')[0].value;}
if(typeof getElementsByName('inpKeyName','input')[0]!=="undefined"){keyName=getElementsByName('inpKeyName','input')[0].value;}
if(typeof getElementsByName(keyName,'input')[0]!=="undefined"){recordId=getElementsByName(keyName,'input')[0].value;}
if(document.getElementById('tabTitle_text')!==null){title=document.getElementById('tabTitle_text').innerHTML;}
if(tabId===null&&!document.getElementById('buttonAbout')){mode="error";title="Error";}else if(tabId===null){mode="manual";}else if(document.getElementById("grid_table_dummy_input")){mode="grid";}else if(recordId===""){mode="new";}else{mode="edit";}
var obManualURL=document.location.href;var appUrl=getAppUrl();if(!appUrl){return false;}
obManualURL=obManualURL.replace(appUrl,"");obManualURL=obManualURL.substring(0,obManualURL.indexOf("?"));if(mode!=="manual"){obManualURL=null;}else{windowId=null;tabId=null;recordId=null;}
try{if(document.getElementById('buttonBack')||document.getElementById('buttonAbout')){if(typeof LayoutMDI.OB.Layout.ClassicOBCompatibility.setTabInformation==="function"){LayoutMDI.OB.Layout.ClassicOBCompatibility.setTabInformation(windowId,tabId,recordId,mode,obManualURL,title);}}}catch(e){}}
function checkWindowInRTLMode(){var strDirection='';var htmlTag=document.getElementsByTagName('html')[0];if(htmlTag){if(document.defaultView&&document.defaultView.getComputedStyle){strDirection=document.defaultView.getComputedStyle(htmlTag,'').getPropertyValue('direction');}else if(htmlTag.currentStyle){strDirection=htmlTag.currentStyle['direction'];}}
if(strDirection.toLowerCase()==='rtl'){return true;}else{return false;}}
function moreOnLoadDoFunctions(){setMDIEnvironment();}
function auto_complete_date(field,fmt){autoCompleteDate(field,fmt);}
utilsJSDirectExecution();