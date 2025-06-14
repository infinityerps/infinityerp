
var showErrors=false;function HandleErrors(aMessage,aURL,aLine,evt){if(navigator.appName=="Netscape")document.routeEvent(evt);if(showErrors)alert("Error: \n"+aMessage+"\n\nURL: \n"+aURL+"\n\n\nLine: "+aLine);return true;}
if(!document.all)document.captureEvents(Event.ONERROR);window.onerror=HandleErrors;