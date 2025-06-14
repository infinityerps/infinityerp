
var gDefaultType=0;if(typeof arrMessages==='undefined'){var arrMessages;var arrTypes;if(typeof getFrame==='function'&&getFrame('frameMenu')){arrMessages=getFrame('frameMenu').arrMessages;arrTypes=getFrame('frameMenu').arrTypes;}else{if(parent&&parent.frameMenu){arrMessages=parent.frameMenu.arrMessages;arrTypes=parent.frameMenu.arrTypes;}else if(top&&top.opener&&top.opener.parent&&top.opener.parent.frameMenu){arrMessages=top.opener.parent.frameMenu.arrMessages;arrTypes=top.opener.parent.frameMenu.arrTypes;}else if(top&&top.opener&&top.opener.top&&top.opener.top.opener&&top.opener.top.opener.parent&&top.opener.top.opener.parent.frameMenu){arrMessages=top.opener.top.opener.parent.frameMenu.arrMessages;arrTypes=top.opener.top.opener.parent.frameMenu.arrTypes;}}}
function messageType(_messageID,_messageType){this.id=_messageID;this.type=_messageType;}
function messagesTexts(_language,_message,_text,_defaultText){this.language=_language;this.message=_message;this.text=_text;this.defaultText=_defaultText;}
function getMessage(index,_language){if(_language==null){if(typeof defaultLang!="undefined"){_language=defaultLang;}else if(typeof LNG_POR_DEFECTO!="undefined"){_language=LNG_POR_DEFECTO;}}
var total=(arrMessages?arrMessages.length:0);for(var i=0;i<total;i++){if(arrMessages[i].language==_language)
if(arrMessages[i].message==index)
return(arrMessages[i].text);}
return null;}
function getDefaultText(index,_language){if(_language==null){if(typeof defaultLang!="undefined"){_language=defaultLang;}else if(typeof LNG_POR_DEFECTO!="undefined"){_language=LNG_POR_DEFECTO;}}
var total=(arrMessages?arrMessages.length:0);for(var i=0;i<total;i++){if(arrMessages[i].language==_language)
if(arrMessages[i].message==index)
return(arrMessages[i].defaultText);}
return null;}
function getType(index){var total=arrTypes.length;for(var i=0;i<total;i++){if(arrTypes[i].id==index)
return(arrTypes[i].type);}
return null;}
function showStdMessage(_text,_type,_defaultValue){switch(_type){case 1:return confirm(_text);break;case 2:return prompt(_text,_defaultValue);break;default:alert(_text);}
return true;}
function showMessage(_text,_type,_defaultValue){return showStdMessage(_text,_type,_defaultValue);}
function mensaje(index,_language)
{showJSMessage(index,_language);}
function showJSMessage(index,_language,clean,params)
{var clearMsgBox=typeof clean=='undefined'||clean==null?true:clean;if(clearMsgBox){try{initialize_MessageBox('messageBoxID');}catch(ignored){}}
var strMessage=getMessage(index,_language);if(strMessage==null)strMessage=getMessage(index,"en_US");if(strMessage==null){getDataBaseMessage(index,null,params);return true;}
var strDefault=getDefaultText(index,_language);if(strDefault==null){strDefault=getDefaultText(index,'en_US');}
var type=getType(index,_language);if(type==null)type=gDefaultType;return showStdMessage(strMessage,type,strDefault);}
function renderMessageBox(type,title,text){try{dojo.widget.byId('messageBoxID').setValues(type,title,text);}catch(err){alert(title+":\n"+text);}
return true;}
function getUrl(){var url=window.location.href;var pos=url.indexOf("://");var pos2=url.indexOf("/",pos+3);if(pos2!=-1){pos2=url.indexOf("/",pos2+1);if(pos2!=-1)url=url.substring(0,pos2);}
return url;}
function getDataBaseMessage(value,responseFunction,params){var appUrl=getAppUrl();var paramXMLReq=null;var msgCode;if(new RegExp("^[0-9]+$").test(value)){msgCode="JS"+value;}else{msgCode=value;}
if(params){submitXmlHttpRequestUrl(((responseFunction==null)?messageResponse:responseFunction),(appUrl+"/businessUtility/MessageJS.html?inpvalue="+escape(msgCode)+"&inpparams="+escape(isc.JSONEncoder.echo(params))),false,paramXMLReq)}else{submitXmlHttpRequestUrl(((responseFunction==null)?messageResponse:responseFunction),(appUrl+"/businessUtility/MessageJS.html?inpvalue="+escape(msgCode)),false,paramXMLReq)}}
function getDataBaseStandardMessage(value,responseFunction){var appUrl=getAppUrl();var paramXMLReq=null;submitXmlHttpRequestUrl(((responseFunction==null)?messageResponse:responseFunction),(appUrl+"/businessUtility/MessageJS.html?inpvalue="+escape(value)),false,paramXMLReq)}
function messageResponse(paramArray,XMLHttpRequestObj){var obj;if(getReadyStateHandler(XMLHttpRequestObj)){try{if(XMLHttpRequestObj.responseXML)obj=XMLHttpRequestObj.responseXML.documentElement;}catch(e){}
if(obj){var status=obj.getElementsByTagName('status');if(status.length>0){var type=status[0].getElementsByTagName('type');var title=status[0].getElementsByTagName('title');var description=status[0].getElementsByTagName('description');try{setValues_MessageBox('messageBoxID',type[0].firstChild.nodeValue.toUpperCase(),title[0].firstChild.nodeValue,description[0].firstChild.nodeValue);}catch(err){alert(title[0].firstChild.nodeValue+":\n"+description[0].firstChild.nodeValue);}}}}
return true;}
function setValidationMessages(){var missing=getMessage("Missing");var missingElements=getElementsByName("missingText","div");for(i=0;i<missingElements.length;i++){missingElements[i].innerHTML=missing;}
var invalid=getMessage("Invalid");var invalidElements=getElementsByName("invalidText","div");for(i=0;i<invalidElements.length;i++){invalidElements[i].innerHTML=invalid;}}