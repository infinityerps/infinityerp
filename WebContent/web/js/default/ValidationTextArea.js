
validateTextArea=function(id){var required=document.getElementById(id).getAttribute("required");if(required=="true")isMissingTextArea(id);}
isMissingTextArea=function(id){var isMissing=document.getElementById(id).value.length==0;var element=document.getElementById(id+"missingSpan");if(isMissing)
element.style.display="";else
element.style.display="none";}