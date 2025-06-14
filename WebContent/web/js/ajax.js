
var xmlreq=false;var paramXMLRequest=null;function getXMLHttpRequest(){var XMLHttpRequestObj=null;try{XMLHttpRequestObj=new XMLHttpRequest();}catch(e){XMLHttpRequestObj=false;}
return XMLHttpRequestObj;}
function getReadyStateHandler(req,responseXmlHandler,notifyError){if(req===null){return false;}
if(notifyError===null||typeof notifyError==='undefined'){notifyError=true;}
if(req.readyState==4){if(req.status==200){return true;}else{if(notifyError){alert("HTTP error "+req.status+": "+req.statusText);}
return false;}
return false;}
return false;}
function submitXmlHttpRequestUrl(callbackFunction,url,debug,paramXMLReq){var XMLHttpRequestObj=null;XMLHttpRequestObj=getXMLHttpRequest();if(!paramXMLReq){paramXMLReq=paramXMLRequest;}
if(!XMLHttpRequestObj){XMLHttpRequestObj=getXMLHttpRequest();}
if(debug===null){debug=false;}
if(!XMLHttpRequestObj){alert("Your browser doesn't support this technology");return false;}
if(debug){if(!debugXmlHttpRequest(url)){return false;}}
XMLHttpRequestObj.open("GET",url);var paramXMLParticular=paramXMLReq;xmlreq=XMLHttpRequestObj;XMLHttpRequestObj.onreadystatechange=function(){return callbackFunction(paramXMLParticular,XMLHttpRequestObj);};xmlreq=null;paramXMLRequest=null;XMLHttpRequestObj.send(null);return true;}
function submitXmlHttpRequestWithParams(callbackFunction,formObject,Command,Action,debug,extraParams,paramXMLReq){var XMLHttpRequestObj=null;XMLHttpRequestObj=getXMLHttpRequest();if(!paramXMLReq){paramXMLReq=paramXMLRequest;}
if(formObject===null){formObject=document.forms[0];}
if(debug===null){debug=false;}
if(Action===null){Action=formObject.action;}
if(!XMLHttpRequestObj){alert("Your browser doesn't support this technology");return false;}
var sendText="Command="+encodeURIComponent(Command);sendText+="&IsAjaxCall=1";var length=formObject.elements.length;for(var i=0;i<length;i++){if(formObject.elements[i].type){var text=inputValueForms(formObject.elements[i].name,formObject.elements[i]);if(text&&text.indexOf('=')!==0){sendText+="&"+text;}}}
if(extraParams!==null&&extraParams!==""&&extraParams!=="null"){sendText+=extraParams;}
if(debug){if(!debugXmlHttpRequest(Command)){return false;}}
XMLHttpRequestObj.open("POST",Action);try{XMLHttpRequestObj.setRequestHeader("Content-Type","application/x-www-form-urlencoded");}catch(e){}
var paramXMLParticular=paramXMLReq;xmlreq=XMLHttpRequestObj;XMLHttpRequestObj.onreadystatechange=function(){return callbackFunction(paramXMLParticular,XMLHttpRequestObj);};xmlreq=null;paramXMLRequest=null;XMLHttpRequestObj.send(sendText);return true;}
function submitXmlHttpRequest(callbackFunction,formObject,Command,Action,debug,extraParams,paramXMLReq){extraParams=null;submitXmlHttpRequestWithParams(callbackFunction,formObject,Command,Action,debug,extraParams,paramXMLReq);}
function lockField(inputField){if(inputField===null){return false;}
if(!inputField.type){return false;}
inputField.disabled=true;return true;}
function unlockField(inputField){if(inputField===null){return false;}
if(!inputField.type){return false;}
inputField.disabled=false;return true;}