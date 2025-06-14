
validateTextBox=function(id){var required=document.getElementById(id).getAttribute("required");if(required=="true")isMissingTextBox(id);}
isMissingTextBox=function(id){var isMissing=document.getElementById(id).value.length==0;var element=document.getElementById(id+"missingSpan");if(isMissing)
element.style.display="";else
element.style.display="none";}