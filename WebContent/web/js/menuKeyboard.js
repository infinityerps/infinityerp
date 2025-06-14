<!--Codigo JavaScript
var classOpened="Icon_folderOpened";var classClosed="Icon_folderClosed";var isOpened=false;var focusedMenuElement=null;var selectedMenuElement=null;var isGoingDown=null;var isGoingUp=null;var isTabPressed=null;var isMenuFocused=null;function getReference(id){if(document.getElementById)return document.getElementById(id);else if(document.all)return document.all[id];else if(document.layers)return document.layers[id];else return null;}
function getStyle(id,isId){var ref;if(isId==null||isId)ref=getReference(id);else ref=id;try{return((document.layers)?ref:ref.style);}catch(e){}
return null;}
function changeState(evt,element){if(element==null){element=(!document.all)?evt.target:event.srcElement;}else if(evt==null){element=element.lastChild;for(;;){if(element.nodeType!='1'){element=element.previousSibling;}else{break;}}}
if(element.tagName=='IMG')element=element.parentNode;if(element.parentNode.className.indexOf("NOT_Hover NOT_Selected NOT_Pressed")!=-1){setMenuElementFocus(element.parentNode);}
var index=null;if(document.all)index=element.sourceIndex;var child=null;var total="";try{if(element.id.indexOf("folder")==-1&&element.id.indexOf("folderCell")==-1&&element.id.indexOf("folderImg")==-1&&element.tagName.toLowerCase()!=="a"){if(element.onclick)return element.onclick();else return true;}else if(element.id.indexOf("folderNoChilds")==0)return true;else if(element.id.indexOf("folderCell1")==0)total=element.id.replace("folderCell1_","");else if(element.id.indexOf("folderCell2")==0)total=element.id.replace("folderCell2_","");else if(element.id.indexOf("folderImg")==0)total=element.id.replace("folderImg","");else total=element.id.replace("folder","");}catch(e){}
child=getReference("parent"+total);var actualclass=getObjectClass("folderImg"+total);var selectedClass=getObjectClass("child"+total);if(selectedClass==null)selectedClass="";selectedClass=selectedClass.replace(" Opened"," NOT_Opened");var obj=getStyle(child,false);if(!obj)return;try{if(obj.display=="none"){obj.display="";actualclass=actualclass.replace(classClosed,classOpened);setClass("folderImg"+total,actualclass);selectedClass=selectedClass.replace(" NOT_Opened"," Opened");setClass("child"+total,selectedClass);}else{obj.display="none";actualclass=actualclass.replace(classOpened,classClosed);setClass("folderImg"+total,actualclass);selectedClass=selectedClass.replace(" Opened"," NOT_Opened");setClass("child"+total,selectedClass);}}catch(ignored){}
return false;}
function checkSelected(id){}
document.onclick=changeState;if(document.layers){window.captureEvents(Event.ONCLICK);window.onclick=changeState;}
function onFocusMenu(){isMenuFocused=true;try{parent.appFrame.disableDefaultAction();parent.appFrame.removeWindowElementFocus(parent.appFrame.focusedWindowElement);parent.appFrame.removeTabFocus(parent.appFrame.focusedTab);}catch(e){}
putMenuElementFocus(focusedMenuElement);}
function onBlurMenu(){isMenuFocused=false;removeMenuElementFocus(focusedMenuElement);}
function setMouseOver(obj){var actualclass=obj.className;obj.className=obj.className.replace(' NOT_Hover',' Hover');return true;}
function setMouseOut(obj){var actualclass=obj.className;obj.className=obj.className.replace(' Hover',' NOT_Hover');obj.className=obj.className.replace(' Pressed',' NOT_Pressed');return true;}
function setMouseDown(obj){var actualclass=obj.className;obj.className=obj.className.replace(' Hover',' NOT_Hover');obj.className=obj.className.replace(' NOT_Pressed',' Pressed');return true;}
function setMouseUp(obj){var actualclass=obj.className;obj.className=obj.className.replace(' Pressed',' NOT_Pressed');return true;}
function activateElement(obj){var jump=false;if(obj.className.indexOf(" NOT_Opened")!=-1){changeState(null,obj);}else{setMenuElementFocus(getNextMenuElement(focusedMenuElement));}
return true;}
function desactivateElement(obj){if(obj.className.indexOf(" Opened")!=-1){changeState(null,obj);}else{var obj=getMenuElementParent(focusedMenuElement);setMenuElementFocus(obj);}}
function getFirstMenuElement(){var firstElement;firstElement=document.getElementById('paramMenu');firstElement=firstElement.firstChild;if(!firstElement){return null;}
for(;;){if(firstElement.nodeType!='1'){firstElement=firstElement.nextSibling;}else{break;}}
firstElement=firstElement.firstChild;if(!firstElement){return null;}
for(;;){if(firstElement.nodeType!='1'){firstElement=firstElement.nextSibling;}else{break;}}
firstElement=firstElement.firstChild;if(!firstElement){return null;}
for(;;){if(firstElement.nodeType!='1'){firstElement=firstElement.nextSibling;}else{break;}}
firstElement=firstElement.firstChild;if(!firstElement){return null;}
for(;;){if(firstElement.nodeType!='1'){firstElement=firstElement.nextSibling;}else{break;}}
firstElement=firstElement.firstChild;if(!firstElement){return null;}
for(;;){if(firstElement.nodeType!='1'){firstElement=firstElement.nextSibling;}else{break;}}
firstElement=firstElement.firstChild;if(!firstElement){return null;}
for(;;){if(firstElement.nodeType!='1'){firstElement=firstElement.nextSibling;}else{break;}}
return firstElement;}
function getLastMenuElement(){var lastElement;lastElement=document.getElementById('paramMenu');for(;;){lastElement=lastElement.firstChild;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.nextSibling;}else{break;}}
lastElement=lastElement.lastChild;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.previousSibling;}else{break;}}
for(;;){lastElement=lastElement.firstChild;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.nextSibling;}else{break;}}
if(lastElement.style.display=='none'){lastElement=lastElement.parentNode;lastElement=lastElement.previousSibling;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.previousSibling;}else{break;}}}else{break;}}
if(lastElement.getAttribute('id')){lastElement=lastElement.firstChild;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.nextSibling;}else{break;}}}else{break;}}
lastElement=lastElement.firstChild;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.nextSibling;}else{break;}}
lastElement=lastElement.firstChild;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.nextSibling;}else{break;}}
lastElement=lastElement.firstChild;for(;;){if(lastElement.nodeType!='1'){lastElement=lastElement.nextSibling;}else{break;}}
return lastElement;}
function getNextMenuElement(obj){var error=false;if(obj==null||obj=='null'||obj==''){var firstElementObj=getFirstMenuElement();return firstElementObj;}
var nextElementTmp;var nextElement=obj;nextElement=nextElement.parentNode;nextElement=nextElement.parentNode;nextElement=nextElement.parentNode;if(nextElement.style.display=='none'){nextElement.style.display=='block'}
nextElement=nextElement.parentNode;nextElementTmp=nextElement;for(;;){try{for(;;){nextElement=nextElement.nextSibling;if(nextElement.nodeType=='1'){break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
if(nextElement.style.display!='none'){nextElement=nextElement.parentNode;break;}else{nextElement=nextElement.parentNode;}}catch(e){try{nextElement=nextElementTmp;nextElement=nextElement.parentNode;nextElement=nextElement.parentNode;nextElement=nextElement.parentNode;nextElement=nextElement.parentNode;nextElementTmp=nextElement;}catch(e){error=true;break;}}}
if(error==true){return obj;}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
for(;;){if(nextElement.style.display=='none'){nextElement=nextElement.parentNode;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}}else{if(nextElement.getAttribute('id')){nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}}
for(;;){if(nextElement.style.display=='none'){nextElementTmp=nextElement;try{nextElement=nextElement.parentNode;nextElement=nextElement.nextSibling;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}}catch(e){break;}}else{break;}}
break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
nextElement=nextElement.firstChild;for(;;){if(nextElement.nodeType!='1'){nextElement=nextElement.nextSibling;}else{break;}}
nextElement=nextElement.firstChild;return nextElement;}
function getPreviousMenuElement(obj){var error=false;if(obj==null||obj=='null'||obj==''){var lastElementObj=getLastMenuElement();return lastElementObj;}
var previousElementTmp;var previousElement=obj;previousElement=previousElement.parentNode;previousElement=previousElement.parentNode;previousElement=previousElement.parentNode;if(previousElement.style.display=='none'){previousElement.style.display=='block'}
previousElement=previousElement.parentNode;previousElementTmp=previousElement;for(;;){try{for(;;){previousElement=previousElement.previousSibling;if(previousElement.nodeType=='1'){break;}}
previousElement=previousElement.lastChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.previousSibling;}else{break;}}
if(previousElement.style.display!='none'){previousElement=previousElement.parentNode;break;}else{previousElement=previousElement.parentNode;}}catch(e){previousElement=previousElementTmp;previousElement=previousElement.parentNode;previousElement=previousElement.parentNode;previousElement=previousElement.parentNode;previousElement=previousElement.parentNode;previousElementTmp=previousElement;}}
previousElement=previousElement.firstChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.nextSibling;}else{break;}}
for(;;){if(previousElement.getAttribute('id')){previousElement=previousElement.firstChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.nextSibling;}else{break;}}
previousElement=previousElement.firstChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.nextSibling;}else{break;}}
previousElement=previousElement.lastChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.previousSibling;}else{break;}}
previousElement=previousElement.firstChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.nextSibling;}else{break;}}}
for(;;){if(previousElement.style.display=='none'){previousElementTmp=previousElement;try{previousElement=previousElement.parentNode;previousElement=previousElement.previousSibling;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.previousSibling;}else{break;}}
previousElement=previousElement.firstChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.nextSibling;}else{break;}}}catch(e){break;}}else{break;}}
if(!previousElement.getAttribute('id'))break;}
previousElement=previousElement.firstChild;for(;;){try{if(previousElement.nodeType!='1'){previousElement=previousElement.nextSibling;}else{break;}}catch(e){error=true;break;}}
if(error==true){return obj;}
previousElement=previousElement.firstChild;for(;;){if(previousElement.nodeType!='1'){previousElement=previousElement.nextSibling;}else{break;}}
previousElement=previousElement.firstChild;return previousElement;}
function getMenuElementParent(obj){if(obj==null||obj=='null'||obj==''){return false;}
var parentElement=obj;parentElement=parentElement.parentNode;parentElement=parentElement.parentNode;parentElement=parentElement.parentNode;parentElement=parentElement.parentNode;parentElement=parentElement.parentNode;parentElement=parentElement.parentNode;parentElement=parentElement.parentNode;parentElement=parentElement.parentNode;parentElement=parentElement.previousSibling;for(;;){if(parentElement.nodeType!='1'){parentElement=parentElement.previousSibling;}else{break;}}
parentElement=parentElement.firstChild;for(;;){if(parentElement.nodeType!='1'){parentElement=parentElement.nextSibling;}else{break;}}
parentElement=parentElement.firstChild;for(;;){if(parentElement.nodeType!='1'){parentElement=parentElement.nextSibling;}else{break;}}
parentElement=parentElement.firstChild;for(;;){if(parentElement.nodeType!='1'){parentElement=parentElement.nextSibling;}else{break;}}
parentElement=parentElement.firstChild;for(;;){if(parentElement.nodeType!='1'){parentElement=parentElement.nextSibling;}else{break;}}
return parentElement;}
function putMenuElementFocus(obj){try{var actualclass=obj.className;obj.className=obj.className.replace(' NOT_Focused',' Focused');}catch(e){return false;}
return true;}
function removeMenuElementFocus(obj){if(!obj){return true;}
var actualclass=obj.className;obj.className=obj.className.replace(' Focused',' NOT_Focused');return true;}
function getMenuElementOffsetTop(obj){var menuTopHeight=document.getElementById("MenuTop").clientHeight+document.getElementById("MenuTop2").clientHeight;elementOffsetTop=0;try{while(obj.tagName!="BODY"){elementOffsetTop+=obj.offsetTop;if(obj.offsetParent!=null){obj=obj.offsetParent;}}
elementOffsetTop=elementOffsetTop-menuTopHeight;}catch(e){}
return elementOffsetTop;}
function setMenuElementFocus(obj){if(obj=='firstElement'){obj=getFirstMenuElement();}
if(!obj){return;}
var menuScrollTop=document.getElementById('Menu_Client').scrollTop;var menuScrollHeight=document.getElementById('Menu_Client').scrollHeight;var menuHeight=document.getElementById("Menu_Client").clientHeight;var elementOffsetTop_top=getMenuElementOffsetTop(obj)-menuScrollTop;var elementOffsetTop_bottom=getMenuElementOffsetTop(obj)+obj.clientHeight-menuScrollTop;while(elementOffsetTop_top<0){document.getElementById('Menu_Client').scrollTop-=1;menuScrollTop=document.getElementById('Menu_Client').scrollTop;menuHeight=document.getElementById("Menu_Client").clientHeight;elementOffsetTop_top=getMenuElementOffsetTop(obj)-menuScrollTop;}
while(elementOffsetTop_bottom-1>menuHeight){document.getElementById('Menu_Client').scrollTop+=1;menuScrollTop=document.getElementById('Menu_Client').scrollTop;menuHeight=document.getElementById("Menu_Client").clientHeight;elementOffsetTop_bottom=getMenuElementOffsetTop(obj)+obj.clientHeight-menuScrollTop;}
if(focusedMenuElement!=null&&focusedMenuElement!='null'&&focusedMenuElement!=''){removeMenuElementFocus(focusedMenuElement);}
focusedMenuElement=obj;if(isMenuFocused)putMenuElementFocus(focusedMenuElement);}
function menuUpKey(state){if(navigator.userAgent.indexOf("NT")!=-1&&state==true){setMenuElementFocus(getPreviousMenuElement(focusedMenuElement));}else{if(state){if(!isGoingUp){firstGoingUp=true;isGoingUp=true;menuUpKeyDelay(true);}}else if(!state){isGoingUp=false;return true;}}
return false;}
function menuUpKeyDelay(firstGoingUp){if(isGoingUp){setMenuElementFocus(getPreviousMenuElement(focusedMenuElement));if(firstGoingUp){setTimeout('menuUpKeyDelay(false);',400);}else{setTimeout('menuUpKeyDelay(false);',60);}}else{return false;}}
function menuDownKey(state){if(navigator.userAgent.indexOf("NT")!=-1&&state==true){setMenuElementFocus(getNextMenuElement(focusedMenuElement));}else{if(state){if(!isGoingDown){firstGoingDown=true;isGoingDown=true;menuDownKeyDelay(true);}}else if(!state){isGoingDown=false;return true;}}
return false;}
function menuDownKeyDelay(firstGoingDown){if(isGoingDown){setMenuElementFocus(getNextMenuElement(focusedMenuElement));if(firstGoingDown){setTimeout('menuDownKeyDelay(false);',400);}else{setTimeout('menuDownKeyDelay(false);',60);}}else{return false;}}
function menuLeftKey(){desactivateElement(focusedMenuElement);}
function menuRightKey(){activateElement(focusedMenuElement);}
function menuHomeKey(){var obj=getFirstMenuElement();setMenuElementFocus(obj);}
function menuEndKey(){var obj=getLastMenuElement();setMenuElementFocus(obj);}
function menuHomeKey(){var obj=getFirstMenuElement();setMenuElementFocus(obj);}
function menuEnterKey(){changeState(null,focusedMenuElement);focusedMenuElement.onclick();}
function menuTabKey(state){menuDownKey(state);}
function menuShiftTabKey(state){menuUpKey(state);}