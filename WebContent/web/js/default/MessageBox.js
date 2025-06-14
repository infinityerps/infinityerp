
setMessage_MessageBox=function(id,title,message){var span=document.getElementById(id+"Content").getElementsByTagName("span")[0];var div1=document.createElement("div");div1.appendChild(document.createTextNode(title));div1.className="MessageBox_TextTitle";div1.id="messageBoxIDTitle";var div2=document.createElement("div");div2.innerHTML=message;div2.className="MessageBox_TextDescription";div2.id="messageBoxIDMessage";var div3=document.createElement("div");div3.className="MessageBox_TextSeparator";span.appendChild(div1);span.appendChild(div2);span.appendChild(div3);}
initialize_MessageBox=function(id){setType_MessageBox(id,"HIDDEN");var label=document.getElementById(id+"Content").getElementsByTagName("span")[0];while(label.hasChildNodes()){label.removeChild(label.lastChild);}}
setValues_MessageBox=function(id,type,title,message){var maxLevel_MessageBox=document.getElementById(id).className.toUpperCase().replace("MESSAGEBOX","");var strType=type.toUpperCase();if(maxLevel_MessageBox=="ERROR"){}
else if(maxLevel_MessageBox=="WARNING"){if(strType=="ERROR"){maxLevel_MessageBox=strType;}}
else if(maxLevel_MessageBox=="INFO"){if(strType=="ERROR"||strType=="WARNING"){maxLevel_MessageBox=strType;}}
else if(maxLevel_MessageBox=="SUCCESS"){if(strType=="ERROR"||strType=="WARNING"||strType=="INFO"){maxLevel_MessageBox=strType;}}
else if(maxLevel_MessageBox=="HIDDEN"){if(strType=="ERROR"||strType=="WARNING"||strType=="INFO"||strType=="SUCCESS"){maxLevel_MessageBox=strType;}}
setType_MessageBox(id,maxLevel_MessageBox);setMessage_MessageBox(id,title,message);}
setType_MessageBox=function(id,type){document.getElementById(id).className="MessageBox"+type.toUpperCase();}