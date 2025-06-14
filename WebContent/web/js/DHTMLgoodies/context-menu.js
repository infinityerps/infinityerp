
DHTMLGoodies_menuModel=function()
{var menuItems;this.menuItems=new Array();}
DHTMLGoodies_menuModel.prototype={addItem:function(id,itemText,itemIcon,url,parentId,jsFunction)
{this.menuItems[id]=new Array();this.menuItems[id]['id']=id;this.menuItems[id]['itemText']=itemText;this.menuItems[id]['itemIcon']=itemIcon;this.menuItems[id]['url']=url;this.menuItems[id]['parentId']=parentId;this.menuItems[id]['separator']=false;this.menuItems[id]['jsFunction']=jsFunction;},addSeparator:function(id,parentId)
{this.menuItems[id]=new Array();this.menuItems[id]['parentId']=parentId;this.menuItems[id]['separator']=true;},init:function()
{this.__getDepths();},getItems:function()
{return this.menuItems;},__getDepths:function()
{for(var no in this.menuItems){this.menuItems[no]['depth']=1;if(this.menuItems[no]['parentId']){this.menuItems[no]['depth']=this.menuItems[this.menuItems[no]['parentId']]['depth']+1;}}},__hasSubs:function(id)
{for(var no in this.menuItems){if(this.menuItems[no]['parentId']==id)return true;}
return false;}}
var referenceToDHTMLSuiteContextMenu;DHTMLGoodies_contextMenu=function()
{var menuModels;var menuItems;var menuObject;var layoutCSS;var menuUls;var width;var srcElement;var indexCurrentlyDisplayedMenuModel;var imagePath;this.menuModels=new Array();this.menuObject=false;this.menuUls=new Array();this.width=100;this.srcElement=false;this.indexCurrentlyDisplayedMenuModel=false;this.imagePath='images/';}
DHTMLGoodies_contextMenu.prototype={setWidth:function(newWidth)
{this.width=newWidth;},setLayoutCss:function(cssFileName)
{this.layoutCSS=cssFileName;},attachToElement:function(element,elementId,menuModel)
{window.refToThisContextMenu=this;if(!element&&elementId)element=document.getElementById(elementId);if(!element.id){element.id='context_menu'+Math.random();element.id=element.id.replace('.','');}
this.menuModels[element.id]=menuModel;element.oncontextmenu=this.__displayContextMenu;document.documentElement.onclick=this.__hideContextMenu;},__setReference:function(obj)
{referenceToDHTMLSuiteContextMenu=obj;},__displayContextMenu:function(e)
{if(document.all)e=event;var ref=referenceToDHTMLSuiteContextMenu;ref.srcElement=ref.getSrcElement(e);if(!ref.indexCurrentlyDisplayedMenuModel||ref.indexCurrentlyDisplayedMenuModel!=this.id){if(ref.indexCurrentlyDisplayedMenuModel){ref.menuObject.innerHTML='';}else{ref.__createDivs();}
ref.menuItems=ref.menuModels[this.id].getItems();ref.__createMenuItems();}
ref.indexCurrentlyDisplayedMenuModel=this.id;ref.menuObject.style.left=(e.clientX+Math.max(document.body.scrollLeft,document.documentElement.scrollLeft))+'px';ref.menuObject.style.top=(e.clientY+Math.max(document.body.scrollTop,document.documentElement.scrollTop))+'px';ref.menuObject.style.display='block';return false;},__hideContextMenu:function()
{var ref=referenceToDHTMLSuiteContextMenu;if(ref.menuObject)ref.menuObject.style.display='none';},__createDivs:function()
{this.menuObject=document.createElement('DIV');this.menuObject.className='DHTMLSuite_contextMenu';this.menuObject.style.backgroundImage='url(\''+this.imagePath+'context-menu-gradient.gif'+'\')';this.menuObject.style.backgroundRepeat='repeat-y';if(this.width)this.menuObject.style.width=this.width+'px';document.body.appendChild(this.menuObject);},__mouseOver:function()
{this.className='DHTMLSuite_item_mouseover';if(!document.all){this.style.backgroundPosition='left center';}},__mouseOut:function()
{this.className='';if(!document.all){this.style.backgroundPosition='1px center';}},__evalUrl:function()
{var js=this.getAttribute('jsFunction');if(!js)js=this.jsFunction;if(js)eval(js);},__createMenuItems:function()
{window.refToContextMenu=this;this.menuUls=new Array();for(var no in this.menuItems){if(!this.menuUls[0]){this.menuUls[0]=document.createElement('UL');this.menuObject.appendChild(this.menuUls[0]);}
if(this.menuItems[no]['depth']==1){if(this.menuItems[no]['separator']){var li=document.createElement('DIV');li.className='DHTMLSuite_contextMenu_separator';}else{var li=document.createElement('LI');if(this.menuItems[no]['jsFunction']){this.menuItems[no]['url']=this.menuItems[no]['jsFunction']+'(this,referenceToDHTMLSuiteContextMenu.srcElement)';}
if(this.menuItems[no]['itemIcon']){li.style.backgroundImage='url(\''+this.menuItems[no]['itemIcon']+'\')';if(!document.all)li.style.backgroundPosition='1px center';}
if(this.menuItems[no]['url']){var url=this.menuItems[no]['url']+'';var tmpUrl=url+'';li.setAttribute('jsFunction',url);li.jsFunction=url;li.onclick=this.__evalUrl;}
li.innerHTML='<a href="#" onclick="return false">'+this.menuItems[no]['itemText']+'</a>';li.onmouseover=this.__mouseOver;li.onmouseout=this.__mouseOut;}
this.menuUls[0].appendChild(li);}}},getSrcElement:function(e)
{var el;if(e.target)el=e.target;else if(e.srcElement)el=e.srcElement;if(el.nodeType==3)
el=el.parentNode;return el;}}