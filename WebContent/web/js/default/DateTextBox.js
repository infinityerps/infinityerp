
validateDateTextBox=function(id){isValidDateTextBox(id);var required=document.getElementById(id).getAttribute("required");if(required=="true")isMissingDateTextBox(id);}
expandDateYear=function(id){var str_dateFormat=document.getElementById(id).getAttribute("displayformat");if(!str_dateFormat)str_dateFormat=defaultDateFormat;if(str_dateFormat.indexOf('YYYY')!=-1){var centuryReference=50;var str_date=document.getElementById(id).value;var dateBlock=new Array();dateBlock[1]=getDateBlock(str_date,1);dateBlock[2]=getDateBlock(str_date,2);dateBlock[3]=getDateBlock(str_date,3);if(!dateBlock[1]||!dateBlock[2]||!dateBlock[3]){return false;}
if(str_dateFormat.substr(1,1)=='Y'){var yearBlock=1;}else if(str_dateFormat.substr(7,1)=='Y'){var yearBlock=3;}else{return false;}
if(dateBlock[yearBlock].length==1){dateBlock[yearBlock]='000'+dateBlock[yearBlock];}else if(dateBlock[yearBlock].length==2){if(dateBlock[yearBlock]<centuryReference){dateBlock[yearBlock]='20'+dateBlock[yearBlock];}else{dateBlock[yearBlock]='19'+dateBlock[yearBlock];}}else if(dateBlock[yearBlock].length==3){dateBlock[yearBlock]='0'+dateBlock[yearBlock];}else if(dateBlock[yearBlock].length==4){return true;}
var dateSeparator=str_dateFormat.replace(/D/g,"").replace(/M/g,"").replace(/Y/g,"").substr(0,1);var normalizedDate=dateBlock[1]+dateSeparator+dateBlock[2]+dateSeparator+dateBlock[3];document.getElementById(id).value=normalizedDate;}else{return false;}
return true;}
getDateBlock=function(str_date,block){var datePattern="^(\\d+)[\\-|\\/|/|:|.|\\.](\\d+)[\\-|\\/|/|:|.|\\.](\\d+)$";var dateRegExp=new RegExp(datePattern);if(!dateRegExp.exec(str_date)){return false;}
var dateBlock=new Array();dateBlock[1]=RegExp.$1;dateBlock[2]=RegExp.$2;dateBlock[3]=RegExp.$3;if(block==1||block=='1')return dateBlock[1];else if(block==2||block=='2')return dateBlock[2];else if(block==3||block=='3')return dateBlock[3];else dateBlock;}
getTimeBlock=function(str_time,block){if(str_time.indexOf(".")==-1&&str_time.indexOf(":")==-1){return false;}
if(str_time.length!=5&&str_time.length!=8){return false;}
var response="";var timeBlock=str_time.match(/(\d+)(\d+)/g);if(block==1||block=='1')response=timeBlock[0];else if(block==2||block=='2')response=timeBlock[1];else if(block==3||block=='3')response=timeBlock[2];else response=timeBlock;if((block==3||block=='3')&&typeof response=='undefined'){response="00";}
return response;}
isValidDateTextBox=function(id){var isValid=this.isValidDate(document.getElementById(id).value,document.getElementById(id).getAttribute("displayformat"));var element=document.getElementById(id+"invalidSpan");if(isValid)
element.style.display="none";else
element.style.display="";}
isMissingDateTextBox=function(id){var isMissing=document.getElementById(id).value.length==0;var element=document.getElementById(id+"missingSpan");if(isMissing)
element.style.display="";else
element.style.display="none";}
isValidDate=function(str_datetime,str_datetimeFormat){var isFourDigits=false;if(str_datetimeFormat.indexOf('YYYY')!=-1||str_datetimeFormat.indexOf('%Y')!=-1){isFourDigits=true;}
var str_date=str_datetime.substring(0,(isFourDigits?10:8));var str_time=str_datetime.substring((isFourDigits?11:9),str_datetime.length);if(str_datetimeFormat.indexOf('%y')!=-1||str_datetimeFormat.indexOf('%Y')!=-1){isFourDigits=false;}
var str_dateFormat=str_datetimeFormat.substring(0,(isFourDigits?10:8));var str_timeFormat=str_datetimeFormat.substring((isFourDigits?11:9),str_datetimeFormat.length);if(str_time==null||str_time=="")str_time="00:00:00";if(str_timeFormat==null||str_timeFormat=="")str_timeFormat="HH24:MI:SS";if(this.getDateTime(str_date,str_dateFormat,str_time,str_timeFormat)){return true}else{return false;}}
purgeDateFormat=function(str_format){str_format=str_format.replace("mm","MM").replace("dd","DD").replace("yyyy","YYYY");str_format=str_format.replace("mm","MM").replace("dd","DD").replace("yy","YY");str_format=str_format.replace("%D","%d").replace("%M","%m");str_format=str_format.replace("/","-").replace("/","-").replace("/","-");str_format=str_format.replace(".","-").replace(".","-").replace(".","-");str_format=str_format.replace(":","-").replace(":","-").replace(":","-");return str_format;}
getDateTime=function(str_date,str_dateFormat,str_time,str_timeFormat){var inputDate=new Date(0,0,0);if(str_date.length==0)return inputDate;if(str_date==null&&str_dateFormat==null){str_date="1999-01-01";str_dateFormat="YYYY-MM-DD";}
var dateBlock=new Array();var fullYear=false;dateBlock[1]=getDateBlock(str_date,1);dateBlock[2]=getDateBlock(str_date,2);dateBlock[3]=getDateBlock(str_date,3);if(!dateBlock[1]||!dateBlock[2]||!dateBlock[3]){return false;}
if(!str_dateFormat)str_dateFormat=defaultDateFormat;str_dateFormat=purgeDateFormat(str_dateFormat);if((str_time==null||str_time=="")&&(str_timeFormat==null||str_timeFormat=="")){str_time="00:00:00";str_timeFormat="HH24:MI:SS";}
var timeBlock=new Array();timeBlock[1]=getTimeBlock(str_time,1);timeBlock[2]=getTimeBlock(str_time,2);timeBlock[3]=getTimeBlock(str_time,3);if(!timeBlock[1]||!timeBlock[2]||!timeBlock[3]){return false;}
if(timeBlock[1]>23||timeBlock[2]>59||timeBlock[3]>59){return false;}
var checkProperDate=function(year,month,day){var tentativeDate;year=parseFloat(year,10);month=parseFloat(month,10);day=parseFloat(day,10);if(day<1||day>31)return false;if(month<1||month>12)return false;if(year<1||year>9999)return false;tentativeDate=new Date(year,month-1,day);if(day!==tentativeDate.getDate()){return false;}
return true;}
switch(str_dateFormat){case"MM-DD-YYYY":case"YY-MM-DDDD":case"DD-MM-YYYY":case"%m-%d-%Y":case"%Y-%m-%d":case"%d-%m-%Y":fullYear=true;}
switch(str_dateFormat){case"MM-DD-YYYY":case"MM-DD-YY":case"%m-%d-%Y":case"%m-%d-%y":if(!checkProperDate(dateBlock[3],dateBlock[1],dateBlock[2])){return false;}
inputDate=new Date(parseFloat(dateBlock[3]),parseFloat(dateBlock[1])-1,parseFloat(dateBlock[2]),timeBlock[1],timeBlock[2],timeBlock[3]);if(fullYear){inputDate.setFullYear(dateBlock[3]);}
return inputDate;case"YYYY-MM-DD":case"YY-MM-DD":case"%Y-%m-%d":case"%y-%m-%d":if(!checkProperDate(dateBlock[1],dateBlock[2],dateBlock[3])){return false;}
inputDate=new Date(parseFloat(dateBlock[1]),parseFloat(dateBlock[2])-1,parseFloat(dateBlock[3]),timeBlock[1],timeBlock[2],timeBlock[3]);if(fullYear){inputDate.setFullYear(dateBlock[1]);}
return inputDate;case"DD-MM-YYYY":case"DD-MM-YY":case"%d-%m-%Y":case"%d-%m-%y":default:if(!checkProperDate(dateBlock[3],dateBlock[2],dateBlock[1])){return false;}
inputDate=new Date(parseFloat(dateBlock[3]),parseFloat(dateBlock[2])-1,parseFloat(dateBlock[1]),timeBlock[1],timeBlock[2],timeBlock[3]);if(fullYear){inputDate.setFullYear(dateBlock[3]);}
return inputDate;}
return false;}
getDate=function(str_date,str_dateFormat){return getDateTime(str_date,str_dateFormat,null,null);}
getTime=function(str_time,str_timeFormat){return getDateTime(null,null,str_time,str_timeFormat);}
function autoCompleteDate(field,fmt){if(!isTabPressed){try{if(getCaretPosition(field).start!=field.value.length)return;}catch(ignored){}
if(fmt==null||fmt=="")fmt=field.getAttribute("displayformat");fmt=getDateFormat(fmt);var strDate=field.value;var b=fmt.match(/%./g);var i=0,j=-1;var text="";var length=0;var pos=fmt.indexOf(b[0])+b[0].length;var separator=fmt.substring(pos,pos+1);var separatorH="";pos=fmt.indexOf("%H");if(pos!=-1)separatorH=fmt.substring(pos+2,pos+3);while(strDate.charAt(i)){if(strDate.charAt(i)==separator||strDate.charAt(i)==separatorH||strDate.charAt(i)==" "){i++;continue;}
if(length<=0){j++;if(j>0){if(b[j]=="%H")text+=" ";else if(b[j]=="%M"||b[j]=="%S")text+=separatorH;else text+=separator;}
switch(b[j]){case"%d":case"%e":text+=strDate.charAt(i);length=2;break;case"%m":text+=strDate.charAt(i);length=2;break;case"%Y":text+=strDate.charAt(i);length=4;break;case"%y":text+=strDate.charAt(i);length=2;break;case"%H":case"%I":case"%k":case"%l":text+=strDate.charAt(i);length=2;break;case"%M":text+=strDate.charAt(i);length=2;break;case"%S":text+=strDate.charAt(i);length=2;break;}}else text+=strDate.charAt(i);length--;i++;}
field.value=text;if(i>7&&(typeof(field.onchange)!="undefined"))field.onchange();}}
function CaretPosition()
{var start=null;var end=null;}
function getCaretPosition(oField)
{var oCaretPos=new CaretPosition();if(document.selection)
{oField.focus();var oSel=document.selection.createRange();var selectionLength=oSel.text.length;oSel.moveStart('character',-oField.value.length);oCaretPos.start=oSel.text.length-selectionLength;oCaretPos.end=oSel.text.length;}
else if(oField.selectionStart||oField.selectionStart=='0')
{oCaretPos.start=oField.selectionStart;oCaretPos.end=oField.selectionEnd;}
return(oCaretPos);}