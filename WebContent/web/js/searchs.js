
var winSelector=null;var gForm=null;var gFieldKey=null;var gFieldText=null;var gValidate=false;var gIsMultiLineSearch=false;var baseImage="Question.jpg";function selGetRef(id)
{if(document.getElementById)return document.getElementById(id);if(document.all)return document.all[id];if(document.layers)return document.layers[id];}
function SearchElements(campo,esRef,valor){this.campo=campo;this.esRef=esRef;this.valor=valor;}
function valorCombo(combo)
{if(combo.selectedIndex==-1)
return null;else
return combo.options[combo.selectedIndex].value;}
function textoCombo(combo)
{if(combo.selectedIndex==-1)
return"";else
return combo.options[combo.selectedIndex].text;}
function windowSearch(strPage,strHeight,strWidth,strTop,strLeft,strWindow,parameters,strValueID){var complementsNS4=""
var auxField="";closeWindowSearch();winSelector=null;if(strHeight==null)
strHeight=(screen.height-100);if(strWidth==null)
strWidth=(screen.width-10);if(strTop==null)
strTop=parseInt((screen.height-strHeight)/2);if(strLeft==null)
strLeft=parseInt((screen.width-strWidth)/2);if(strWindow==null)
strWindow="SELECTOR";if(strValueID!=null&&strValueID!=""){auxField="inpNameValue="+encodeURIComponent(strValueID);}
var hidden;if(parameters!=null){var total=parameters.length;for(var i=0;i<total;i++){if(auxField!="")auxField+="&";if(parameters[i]=="isMultiLine"&&parameters[i+1]=="Y")gIsMultiLineSearch=true;auxField+=parameters[i]+"="+((parameters[i+1]!=null)?encodeURIComponent(parameters[i+1]):"");if(parameters[i]=="Command")hidden=true;i++;}}
if(navigator.appName.indexOf("Netscape"))
complementsNS4="alwaysRaised=1, dependent=1, directories=0, hotkeys=0, menubar=0, ";var complements=complementsNS4+"height="+strHeight+", width="+strWidth+", left="+strLeft+", top="+strTop+", screenX="+strLeft+", screenY="+strTop+", location=0, resizable=1, scrollbars=1, status=0, toolbar=0, titlebar=0";winSelector=window.open(strPage+((auxField=="")?"":"?"+auxField),strWindow,complements);if(winSelector!=null){winSelector.focus();enableEvents();}}
function closeWindowSearch(){if(winSelector&&!winSelector.closed){winSelector.close();winSelector=null;disableEvents();}}
function openSearch(strTop,strLeft,strSelectorName,strWindowName,validate,strForm,strItem,strSpanId,strValueID)
{if(strSelectorName!=null){gForm=(strForm==null)?"forms[0]":strForm;gFieldKey=strItem;gFieldText=strSpanId;strValueId=(strValueID==null)?"":strValueID;gValidate=(validate==null)?false:validate;var parameters=new Array();for(var i=9;arguments[i]!=null;i++){parameters[i-9]=arguments[i];}
if(strSelectorName.indexOf("Location")!=-1)windowSearch(strSelectorName,300,600,strTop,strLeft,strWindowName,parameters,strValueID);else windowSearch(strSelectorName,null,900,strTop,strLeft,strWindowName,parameters,strValueID);}}
function openMultiSearch(strTop,strLeft,strSelectorName,strWindowName,validate,strForm,strItem)
{if(strSelectorName!=null){gForm=(strForm==null)?"forms[0]":strForm;gFieldKey=strItem;gValidate=(validate==null)?false:validate;var parameters=new Array();for(var i=7;arguments[i]!=null;i++){parameters[i-7]=arguments[i];}
windowSearch(strSelectorName,null,900,strTop,strLeft,strWindowName,parameters,null);}}
function openPAttribute(strTop,strLeft,strSelectorName,strWindowName,validate,strForm,strItem,strSpanId,strValueID)
{if(strSelectorName!=null){gForm=(strForm==null)?"forms[0]":strForm;gFieldKey=strItem;gFieldText=strSpanId;strValueId=(strValueID==null)?"":strValueID;gValidate=(validate==null)?false:validate;var parameters=new Array();for(var i=9;arguments[i]!=null;i++){parameters[i-9]=arguments[i];}
windowSearch(strSelectorName,450,650,strTop,strLeft,strWindowName,parameters,strValueID);}}
function getField(fieldName){if(gIsMultiLineSearch){return buscarHijo(gFilaActual,"name",fieldName);}else{return eval("document."+gForm+"."+fieldName);}}
function closeSearch(action,strKey,strText,parameters,wait){if(wait!=false){setTimeout(function(){closeSearch(action,strKey,strText,parameters,false);},100);return;}else{if(winSelector==null)return true;if(gForm!=null&&gFieldKey!=null&&gFieldText!=null){var key=getField(gFieldKey);if(key!=null){if(action=="SAVE"){if(strKey==null||strKey==""){showJSMessage(31);winSelector.focus();return false;}
key.value=strKey;var text=getField(gFieldText);if(text!=null)text.value=strText;if(parameters!=null&&parameters.length>0){var total=parameters.length;for(var i=0;i<total;i++){var obj=getField(((parameters[i].esRef)?gFieldKey:"")+parameters[i].campo);if(obj!=null&&obj.type)obj.value=parameters[i].valor;}}
if(key.onchange)key.onchange();try{changeToEditingMode('force');}catch(e){}}else if(action=="CLEAR"){strKey="";strText="";key.value="";var text=getField(gFieldText);text.value="";if(parameters!=null&&parameters.length>0){var total=parameters.length;for(var i=0;i<total;i++){var obj=getField(((parameters[i].esRef)?gFieldKey:"")+parameters[i].campo);if(obj!=null&&obj.type)obj.value="";}}
if(key.onchange)key.onchange();try{changeToEditingMode('force');}catch(e){}}else if(action=="SAVE_IMAGE"){if(strKey==null||strKey==""){showJSMessage(31);winSelector.focus();return false;}
key.value=strKey;if(typeof baseDirectory!="unknown"){eval("document.images['"+gFieldText+"'].src=\""+baseDirectory+"images/"+strText+"\"");}else{eval("document.images['"+gFieldText+"'].src=\""+baseDirection+"images/"+strText+"\"");}
if(parameters!=null&&parameters.length>0){var total=parameters.length;for(var i=0;i<total;i++){var obj=getField(((parameters[i].esRef)?gFieldKey:"")+parameters[i].campo);if(obj!=null&&obj.type)obj.value=parameters[i].valor;}}
if(key.onchange)key.onchange();try{changeToEditingMode('force');}catch(e){}}else if(action=="CLEAR_IMAGE"){strKey="";strText="";key.value="";var text=getField(gFieldText);if(typeof baseDirectory!="unknown"){text.src=baseDirectory+"images/"+baseImage;}else{text.src=baseDirection+"images/"+baseImage;}
if(parameters!=null&&parameters.length>0){var total=parameters.length;for(var i=0;i<total;i++){var obj=getField(((parameters[i].esRef)?gFieldKey:"")+parameters[i].campo);if(obj!=null&&obj.type)obj.value="";}}
if(key.onchange)key.onchange();try{changeToEditingMode('force');}catch(e){}}}}
closeWindowSearch();if(gValidate){if(!debugSearch(strKey,strText,gFieldKey,parameters)){return false;}}
window.focus();return true;}}
function closeMultiSearch(action,data,parameters){if(winSelector==null)return true;if(gForm!=null&&gFieldKey!=null){var key=eval("document."+gForm+"."+gFieldKey);if(key!=null){if(action=="SAVE"){if(data==null||data.length==0){showJSMessage(31);winSelector.focus();return false;}
addElementsToList(key,data);if(parameters!=null&&parameters.length>0){var total=parameters.length;for(var i=0;i<total;i++){var obj=eval("document."+gForm+"."+((parameters[i].esRef)?gFieldKey:"")+parameters[i].campo);if(obj!=null&&obj.type)obj.value=parameters[i].valor;}}}else if(action=="CLEAR"){clearList(key);if(parameters!=null&&parameters.length>0){var total=parameters.length;for(var i=0;i<total;i++){var obj=eval("document."+gForm+"."+((parameters[i].esRef)?gFieldKey:"")+parameters[i].campo);if(obj!=null&&obj.type)obj.value="";}}}}}
closeWindowSearch();if(gValidate){if(!debugSearch(data,gFieldKey)){return false;}}
window.focus();return true;}
function toLayer(strHtml,strLayer){var ref=selGetRef(strLayer);if(strHtml==null)
strHtml="";if(document.layers)
{ref.document.write(strHtml);ref.document.close();}
else if(document.all)
{ref.innerHTML=strHtml;}
else if(document.getElementById)
{range=document.createRange();range.setStartBefore(ref);domfrag=range.createContextualFragment(strHtml);while(ref.hasChildNodes())
{ref.removeChild(ref.lastChild);}
ref.appendChild(domfrag);}}
function enableEvents(){if(document.layers){document.captureEvents(Event.UNLOAD);}
window.onunload=function(){closeSearch();};hasCloseWindowSearch=true;}
function disableEvents(){if(document.layers){window.releaseEvents(Event.UNLOAD);}
window.onunload=function(){};hasCloseWindowSearch=false;}
function infoSelectFilters(params,type){if(!type){type='Search';}
setGridFilters(params);updateGridDataAfterFilter();if(type==='Search'){dijit.byId('grid').requestParams["newFilter"]="0";}else if(type==='Save'){dijit.byId('grid').requestParams["newFilter"]="1";}
return true;}
function updateHeader(liveGrid,offset){return true;}
function depurarSelector_validateSelector_wrapper(action){if(typeof validateSelector=="function"){return validateSelector(action);}else{return depurarSelector(action);}}
function onRowDblClick(cell){var value=dijit.byId('grid').getSelectedRows();if(value==null||value==""||value.length>1)return false;depurarSelector_validateSelector_wrapper('SAVE');}
function getSelectedValues(){var value=dijit.byId('grid').getSelectedRows();if(value==null||value.length==0)return"";return value[0];}
function getSelectdText(){var value=dijit.byId('grid').getSelectedRows();if(value==null||value.length==0)return"";return value[0];}
function getSelectedPos(){var value=dijit.byId('grid').getSelectedRowsPos();if(value==null||value.length==0)return"";return value[0];}
function isMultipleSelected(){var value=dijit.byId('grid').getSelectedRows();if(value==null||value=="")return false;return(value.length>1);}
function onGridLoadDo(){if(selectedRow==null)return true;if(selectedRow<=0)dijit.byId('grid').goToFirstRow();else dijit.byId('grid').goToRow(selectedRow);var params=new Array();params["newFilter"]="0";dijit.byId('grid').setRequestParams(params);return true;}
function setGridFilters(newparams){var params=[];params["newFilter"]="1";if(newparams!=null&&newparams.length>0){var total=newparams.length;for(var i=0;i<total;i++){params[newparams[i][0]]=newparams[i][1];}}
dijit.byId('grid').setRequestParams(params);return true;}
function updateGridData(){dijit.byId('grid').refreshGridData();return true;}
function updateGridDataAfterFilter(){dijit.byId('grid').refreshGridDataAfterFilter();return true;}
function setFilters(type){if(!type){type='Search';}
var frm=document.forms[0];var paramsData=new Array();var count=0;paramsData[count++]=new Array("clear","true");var tags=frm.getElementsByTagName('INPUT');for(var i=0;i<tags.length;i++){if(!tags[i].name){continue;}
if(tags[i].name.toUpperCase()!="COMMAND"&&tags[i].name.toUpperCase()!="ISPOPUPCALL"){if(tags[i].type.toUpperCase()=="RADIO"){if(tags[i].checked)
paramsData[count++]=new Array(tags[i].name,tags[i].value);}else if(tags[i].type.toUpperCase()=="CHECKBOX"){if(tags[i].checked)paramsData[count++]=new Array(tags[i].name,tags[i].value);else paramsData[count++]=new Array(tags[i].name,"N");}
else
paramsData[count++]=new Array(tags[i].name,tags[i].value);}}
var selects=frm.getElementsByTagName('SELECT');for(var i=0;i<selects.length;i++){if((selects[i].selectedIndex)!=-1){paramsData[count++]=new Array(selects[i].name,selects[i].options[selects[i].selectedIndex].value);};}
infoSelectFilters(paramsData,type);}
function calculateNumRows(){resizeAreaInfo();document.getElementById("grid_sample").style.display="block";var grid_header=document.getElementById("grid_sample_header");var grid_row=document.getElementById("grid_sample_row");var grid_header_height,grid_row_height;grid_header_height=grid_header.clientHeight+1;grid_row_height=grid_row.clientHeight+1;if(getBrowserInfo('name').toUpperCase().indexOf("CHROME")!=-1||getBrowserInfo('name').toUpperCase().indexOf("SAFARI")!=-1){grid_header_height=grid_header_height+1;grid_row_height=grid_row_height-1;}
var messagebox_cont=document.getElementById("messageBoxID");var related_info_cont=document.getElementById("related_info_cont");var client_height=document.getElementById("client_middle").clientHeight;var grid_bookmark_height=0;var grid_toptext_height=0;var grid_bottomtext_height=0;if(document.getElementById("grid_bookmark")){grid_bookmark_height=document.getElementById("grid_bookmark").clientHeight;}
if(document.getElementById("grid_toptext")){grid_toptext_height=document.getElementById("grid_toptext").clientHeight;}
if(document.getElementById("grid_bottomtext")){grid_bottomtext_height=document.getElementById("grid_bottomtext").clientHeight;}
client_height=client_height-grid_bookmark_height-grid_header_height-grid_toptext_height-grid_bottomtext_height-(related_info_cont?related_info_cont.clientHeight:0)-(messagebox_cont?messagebox_cont.clientHeight:0);client_height=client_height-20;var numRows=(client_height)/(grid_row_height);numRows=parseInt(numRows);if(numRows>1){numRows-=1;}
document.getElementById("grid_sample").style.display="none";return numRows;}