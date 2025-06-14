
validateNumberBox=function(id){isValidNumberBox(id);var required=document.getElementById(id).getAttribute("required");if(required=="true")isMissingNumberBox(id);}
isValidNumberBox=function(id){var isValid=isNumber(document.getElementById(id).value,true,true);var element=document.getElementById(id+"invalidSpan");if(isValid)
element.style.display="none";else
element.style.display="";}
isMissingNumberBox=function(id){var isMissing=document.getElementById(id).value.length==0;var element=document.getElementById(id+"missingSpan");if(isMissing)
element.style.display="";else
element.style.display="none";}
isNumber=function(strValorNumerico,bolDecimales,bolNegativo){var bolComa=false;var esNegativo=false;var i=0;if(strValorNumerico==null||strValorNumerico=="")return true;if(strValorNumerico.substring(i,i+1)=="-"){if(bolNegativo!=null&&bolNegativo){esNegativo=true;i++;}else{return false;}}else if(strValorNumerico.substring(i,i+1)=="+")
i++;var total=strValorNumerico.length;for(i=i;i<total;i++){if(isNaN(strValorNumerico.substring(i,i+1))){if(bolDecimales&&strValorNumerico.substring(i,i+1)=="."&&!bolComa)
bolComa=true;else
return false;}}
return true;}