
var serverip = "192.168.0.17" ;
var LocalPath="C:\\test\\";

//下载 (targetNameStr:存放文件,SourceNameStr:源文件)
/*-- var flag=Test_HTTPDownloadFile("C:\\test\\1183076427.doc","http://192.167.0.128/filesystem/201210/D/1183076427.doc");   --*/

function Test_HTTPDownloadFile(targetNameStr,SourceNameStr) 
 {   
	var nRet, strErrMessage;
	var objAspCom  = new ActiveXObject("ASPCom.PostRecv");
	nRet = objAspCom.HTTPDownloadFile(targetNameStr,SourceNameStr);

	if (nRet != 0) 
	{
		strErrMessage = objAspCom.GetErrorMessage();
		alert("下载失败失败!调用组件返回值:" + nRet+ "失败原因:" + strErrMessage );
		delete objAspCom;
		return false;
	}
	else
	{
		delete objAspCom;
		return true;
	}
  
}


//上传 (localNameStr:本地文件,UrlNameStr:上传jsp)
/*-- var flag=Test_HTTPDownloadFile("C:\\test\\1183076427.ceb","http://192.167.0.128/gwceb/upload.jsp?filename=1183076427.ceb");   --*/

function Test_HTTPUploadFile(localNameStr,UrlNameStr) 
 {   
	
	var nRet, strErrMessage,strXmlFileName,g_UploadXMLInfoURL;
       
	
	var objAspCom  = new ActiveXObject("ASPCom.PostRecv");  //
	
	nRet = objAspCom.HTTPUploadFile(localNameStr,UrlNameStr);
		
	
      if (nRet==0)
  	{
	   //alert ("上传成功!");
        }
       else 
        {
           var nReterr= objAspCom.GetErrorMessage();
  	   alert ("上传失败，原因："+nReterr);
	   delete objAspCom;
	   return false;
	}
 
   delete objAspCom;
	
	return true;
}


//doc文件转换ceb文件
/*-- makerceb("C:\\test\\1183076427.doc","C:\\test\\1183076427.ceb");   --*/
function makerceb(docnames,cebnames){

	  var hzif = false;
	
	  var flagceb=true;
      var objMakercom ;
      var objMakercom = new ActiveXObject("MakerCom.MakerExt");
      var nRet1,nRet2,nRet3,nRet4;
      // 创建新文件 
      var docname =  docnames;
	  var cebname = cebnames;
		
	  var names = docname.split("."); 

	  //判断是否有文件
	  if (docname.length == 0) {
    	  alert("请选择文件！");
		  return false;
  	  } else {		
            if( names[names.length -1].toUpperCase() == "DOC" || names[names.length -1].toUpperCase() == "WPS" || names[names.length -1].toUpperCase() == "DOCX" || names[names.length -1].toUpperCase() == "XLS" || names[names.length -1].toUpperCase() == "XLSX" || names[names.length -1].toUpperCase() == "PPT" || names[names.length -1].toUpperCase() == "JPG" || names[names.length -1].toUpperCase() == "TXT" || names[names.length -1].toUpperCase() == "PDF"){
			
				hzif = true;
			}else{
				hzif = false;
			}

    	     //判断是否为doc或wps文件	
	    	 if (names.length <2 || !hzif) {
	           alert("请选择正确的需要转换的文件格式！");
			   return false;
	         }else {
				 //1' 打开Maker
				nRet1 = objMakercom.BeginMaker("");
				if (nRet1 !=0 ){
	           		var gem1 = objMakercom.GetErrorMessage(nRet1);
					    alert (gem1);
					flagzh=false;
		        }
  			   //2'  单文件转化

				  nRet2 = objMakercom.SingleFileConvert(docname,cebname,"标准模板","","");
				  // alert("转换文件");
				 // flagceb=true;
				  if (nRet2 !=0){
					  var gem2 = objMakercom.GetErrorMessage(nRet2);
					   alert (gem2);
					   flagzh=false;
				  }
				  //flagceb=true;
				   //3'  关闭maker		
				  // alert("关闭maker");
				  nRet3 = objMakercom.EndMaker();
				  if (nRet3 !=0){
						var gem3 = objMakercom.GetErrorMessage(nRet3);
						 alert (gem3);
				  }  
			   }
 		return flagceb;
	}
		
}

//doc文件转换cebx文件
/*-- makercebx("C:\\test\\1183076427.doc","C:\\test\\1183076427.cebx");   --*/
function makercebx(docnames,cebxnames){
	//alert("gos");

	  var hzif = false;

	  var flagcebx=true;
      var objMakercom ;
      var objMakercom = new ActiveXObject("MakerCom.MakerExt");
      var nRet1,nRet2,nRet3,nRet4;
      // 创建新文件 

	  var docname =  docnames;
	  var cebxname = cebxnames;
		
	  var names = docname.split("."); 

	    //判断是否有文件
	  if (docname.length == 0) {
    	  alert("请选择文件！");
		  return false;
  	  } else {
		    
			if( names[names.length -1].toUpperCase() == "DOC" || names[names.length -1].toUpperCase() == "WPS" || names[names.length -1].toUpperCase() == "DOCX" || names[names.length -1].toUpperCase() == "XLS" || names[names.length -1].toUpperCase() == "XLSX" || names[names.length -1].toUpperCase() == "PPT" || names[names.length -1].toUpperCase() == "JPG" || names[names.length -1].toUpperCase() == "TXT" || names[names.length -1].toUpperCase() == "PDF"){
			
				hzif = true;
			}else{
				hzif = false;
			}
		    
    	     //判断是否为doc或wps文件	
	    	 if (names.length <2 || !hzif) {
				alert("请选择正确的需要转换的文件格式！");
				return false;
	         }else {
				 //1' 打开Maker
					//alert(" 打开Maker");
					   nRet1 = objMakercom.BeginMaker("");
					   if (nRet1 !=0 ){
						var gem1 = objMakercom.GetErrorMessage(nRet1);
							alert (gem1);
						  flagcebx=false;
					   }
				   //2'  单文件转化

					nRet2 = objMakercom.SingleFileConvert(docname,cebxname,"CEBX(1)","","");
				  // alert("转换文件");
					if (nRet2 !=0){
					  var gem2 = objMakercom.GetErrorMessage(nRet2);
						   alert (gem2);
						   flagcebx=false;
				   }
				   //3'  关闭maker		
				  // alert("关闭maker");
					 nRet3 = objMakercom.EndMaker();
				   if (nRet3 !=0){
				   var gem3 = objMakercom.GetErrorMessage(nRet3);
						   alert (gem3);
				   }  
 			  }
			return flagcebx;
		}
		
}


//签章
/*-- visualstampclient("C:\\test\\1183076427.ceb");   --*/
function visualstampclient(cebnames) {
    var lID = 0;
    var nNum = 0;
    var obj = new ActiveXObject("VisualSealStampCom.PDFSeal");

    var lRet = obj.PDFVisualSeal(pdfFile.value, pdfFile.value, affixUrl.value, "<DeviceStyle>28</DeviceStyle>", Location.value, Reason.value, "");

    if (lRet != 0)
    {
        alert(obj.GetErrorMsg());
    }
    else
        alert("Success");
}

//取出ceb文档id
/*-- var ret=GetCEBID("C:\\test\\1183076427.ceb");   --*/
function GetCEBID(cebnames){
	var objGetCEBID, ret1, ret2,strCebFileName;
	strCebFileName = cebnames;	
	var objGetCEBID = new ActiveXObject("PrintURLChangeSvr.ChangePrintURL");
	ret1 = objGetCEBID.ChangeURL(strCebFileName, "");
	// 判断成功与否
	var nErrorMsg = objGetCEBID.GetErrorMessage();
	var StringObject = new String(nErrorMsg);
	if (StringObject != ("S_OK"))
		alert(StringObject);
	else
		//alert(ret1);
	delete objGetCEBID;
	return ret1;
}

//封装xml后进行份数入库
/*-- var ret=GetCEBID("C:\\test\\1183076427.ceb");   
		checkin(ret);
--*/
function checkin(ret) {   
	var nRet, strErrMessage,strXmlFileName,g_UploadXMLInfoURL;	
	var objAspCom  = new ActiveXObject("ASPCom.postrecv");
	var xmlFile = '<?xml version = "1.0" encoding="gb2312"?>'
              + '<Doc>'
              + '<DocumentID>'+ret+'</DocumentID>'
              + '<Receivers>上海紫金大酒店;江苏省国信资产管理集团有限公司</Receivers>'
              + '<PrnNums>10;10</PrnNums>' 
              + '<SendType>2</SendType>' 
              + '<Count>2</Count>'
              + '</Doc>';
  var objGetPrintXML  = new ActiveXObject("StampPubCom.StampPubFuncCom");
  objGetPrintXML.BSTR2File(xmlFile,"C:\\WINDOWS\\Temp\\xml.xml");
	nRet = objAspCom.SendFile("http://"+serverip+"/stampserver/extend/interfaces/PrintLic2DB.aspx","C:\\WINDOWS\\Temp\\xml.xml");

	if (nRet != 200) {
		strErrMessage = objAspCom.GetErrorMessage();
		alert("上载打印控制信息失败!调用组件返回值:" + nRet+ "失败原因:" + strErrMessage );
  }	
  delete objAspCom;
	return true;
}

//封装xml后进行份数入库
/*-- var ret=GetCEBID("C:\\test\\1183076427.ceb");   
		checkin(ret);
--*/
function checkins(ret,names,cous,counts) {   
	var nRet, strErrMessage,strXmlFileName,g_UploadXMLInfoURL;	
	var objAspCom  = new ActiveXObject("ASPCom.postrecv");
	var xmlFile = '<?xml version = "1.0" encoding="gb2312"?>'
              + '<Doc>'
              + '<DocumentID>'+ret+'</DocumentID>'
              + '<Receivers>'+names+'</Receivers>'
              + '<PrnNums>'+cous+'</PrnNums>' 
              + '<SendType>2</SendType>' 
              + '<Count>'+counts+'</Count>'
              + '</Doc>';
  var objGetPrintXML  = new ActiveXObject("StampPubCom.StampPubFuncCom");
  objGetPrintXML.BSTR2File(xmlFile,"C:\\WINDOWS\\Temp\\xml.xml");
	nRet = objAspCom.SendFile("http://"+serverip+"/stampserver/extend/interfaces/PrintLic2DB.aspx","C:\\WINDOWS\\Temp\\xml.xml");

	if (nRet != 200) {
		strErrMessage = objAspCom.GetErrorMessage();
		alert("上载打印控制信息失败!调用组件返回值:" + nRet+ "失败原因:" + strErrMessage );
  }	
  delete objAspCom;
	return true;
}


//打印预览(本地文件)
/*-- PreviewCebXml_Local("C:\\test\\1183076427.ceb");   --*/
function PreviewCebXml_Local(cebnames){
	var strErrMessage, lRet, strCEBFileUrl, ctrlXml, verReader, left, right, top, bottom;
	var opUINavigation, opUISelect, opUISaveAs;
	var opUIFile, opUIZoom, opUILayout;
	var opPluginAttachment, opPluginForm, opPluginVisualStamp, opPluginAnnot;
	var verReader = 3304;
	 strErrMessage = "";
	 strCEBFileUrl ="";
   var strlocalcebfile = cebnames;

	ctrlXml = "<?xml version='1.0' encoding='GB2312'?><CPreviewCEBParam><PreviewCEBParamXMLVer></PreviewCEBParamXMLVer>" ;
	ctrlXml += "<ApabiReaderVer>" + verReader + "</ApabiReaderVer>";
	ctrlXml += "<CEBURL>" + strCEBFileUrl + "</CEBURL>";      //预览服务器端文件时传入
	ctrlXml += "<CEBEncypted>0<CEBEncypted>";                 //ceb文件是否加密,1表示是;0表示否
	ctrlXml += "<CEBFileID></CEBFileID>";                      
	ctrlXml += "<CEBFilePathAndName>" + strlocalcebfile + "</CEBFilePathAndName>";  //预览本地文件时传入
	ctrlXml += "<Left>0</Left>";       //<!-- 打开reader左边框位置 -->
	ctrlXml += "<Right>1</Right>";    //<!-- 打开reader后边框位置 -->
	ctrlXml += "<Top>0</Top>";          //<!-- 打开reader上边框位置 -->
	ctrlXml += "<Bottom>1</Bottom>";  //<!-- 打开reader下边框位置 -->
	ctrlXml += "<ReaderPlugInVisualStamp>0</ReaderPlugInVisualStamp>"; //<!-- 是否显示盖章按钮:1表示显示;0表示不显示-->
	ctrlXml += "<ReaderPlugInForm>0</ReaderPlugInForm>";        			//<!-- 是否显示打印按钮,此参数暂时无效 -->
	ctrlXml += "<ReaderPlugInAttachment>0</ReaderPlugInAttachment>";  //<!-- 是否显示附件按钮,此参数暂时无效 -->
	ctrlXml += "<ReaderPlugInAnnotator>1</ReaderPlugInAnnotator>";   //<!-- 是否显示注释按钮 -->
	ctrlXml += "<ReaderEmbeddingUIFile>0</ReaderEmbeddingUIFile>";   //<!-- 是否显示File工具栏 -->
	ctrlXml += "<ReaderEmbeddingUINavigation>1</ReaderEmbeddingUINavigation>";  //<!-- 是否显示Navigation工具栏 -->
	ctrlXml += "<ReaderEmbeddingUISelect>1</ReaderEmbeddingUISelect>";     //<!-- 是否显示Select工具栏 -->
	ctrlXml += "<ReaderEmbeddingUILayout>1</ReaderEmbeddingUILayout>";     //<!-- 是否显示Layout(分页显示)工具栏 -->
	ctrlXml += "<ReaderEmbeddingUISaveAs>1</ReaderEmbeddingUISaveAs>";     //<!-- 是否显示SaveAs工具栏,此参数暂时无效 -->
	ctrlXml += "<ReaderEmbeddingUIZoom>1</ReaderEmbeddingUIZoom>";         //<!-- 是否显示Zoom工具栏 -->
	ctrlXml += "</CPreviewCEBParam>" ;
	
	var  objSealStampCom  = new ActiveXObject("SealStampComSvr.SealStampCom");

	// 预览ceb文件by xml字符串	
	lRet = objSealStampCom.PreviewCEBByXML("", ctrlXml);
	
}

//打印预览(服务器文件)
/*-- PreviewCebXml("http://192.167.0.128/gwceb/1183076427.ceb");   --*/
function PreviewCebXml(urlcebnames){
	var strErrMessage, lRet, strCEBFileUrl, ctrlXml, verReader, left, right, top, bottom;
	var opUINavigation, opUISelect, opUISaveAs;
	var opUIFile, opUIZoom, opUILayout;
	var opPluginAttachment, opPluginForm, opPluginVisualStamp, opPluginAnnot;
	var verReader = 3304;
	 strErrMessage = "";
	 strCEBFileUrl = urlcebnames;
   var strlocalcebfile = "";

	ctrlXml = "<?xml version='1.0' encoding='GB2312'?><CPreviewCEBParam><PreviewCEBParamXMLVer></PreviewCEBParamXMLVer>" ;
	ctrlXml += "<ApabiReaderVer>" + verReader + "</ApabiReaderVer>";
	ctrlXml += "<CEBURL>" + strCEBFileUrl + "</CEBURL>";      //预览服务器端文件时传入
	ctrlXml += "<CEBEncypted>0<CEBEncypted>";                 //ceb文件是否加密,1表示是;0表示否
	ctrlXml += "<CEBFileID></CEBFileID>";                      
	ctrlXml += "<CEBFilePathAndName>" + strlocalcebfile + "</CEBFilePathAndName>";  //预览本地文件时传入
	ctrlXml += "<Left>0</Left>";       //<!-- 打开reader左边框位置 -->
	ctrlXml += "<Right>1</Right>";    //<!-- 打开reader后边框位置 -->
	ctrlXml += "<Top>0</Top>";          //<!-- 打开reader上边框位置 -->
	ctrlXml += "<Bottom>1</Bottom>";  //<!-- 打开reader下边框位置 -->
	ctrlXml += "<ReaderPlugInVisualStamp>0</ReaderPlugInVisualStamp>"; //<!-- 是否显示盖章按钮:1表示显示;0表示不显示-->
	ctrlXml += "<ReaderPlugInForm>0</ReaderPlugInForm>";        			//<!-- 是否显示打印按钮,此参数暂时无效 -->
	ctrlXml += "<ReaderPlugInAttachment>0</ReaderPlugInAttachment>";  //<!-- 是否显示附件按钮,此参数暂时无效 -->
	ctrlXml += "<ReaderPlugInAnnotator>1</ReaderPlugInAnnotator>";   //<!-- 是否显示注释按钮 -->
	ctrlXml += "<ReaderEmbeddingUIFile>0</ReaderEmbeddingUIFile>";   //<!-- 是否显示File工具栏 -->
	ctrlXml += "<ReaderEmbeddingUINavigation>1</ReaderEmbeddingUINavigation>";  //<!-- 是否显示Navigation工具栏 -->
	ctrlXml += "<ReaderEmbeddingUISelect>1</ReaderEmbeddingUISelect>";     //<!-- 是否显示Select工具栏 -->
	ctrlXml += "<ReaderEmbeddingUILayout>1</ReaderEmbeddingUILayout>";     //<!-- 是否显示Layout(分页显示)工具栏 -->
	ctrlXml += "<ReaderEmbeddingUISaveAs>1</ReaderEmbeddingUISaveAs>";     //<!-- 是否显示SaveAs工具栏,此参数暂时无效 -->
	ctrlXml += "<ReaderEmbeddingUIZoom>1</ReaderEmbeddingUIZoom>";         //<!-- 是否显示Zoom工具栏 -->
	ctrlXml += "</CPreviewCEBParam>" ;
	
	var  objSealStampCom  = new ActiveXObject("SealStampComSvr.SealStampCom");

	// 预览ceb文件by xml字符串	
	lRet = objSealStampCom.PreviewCEBByXML("", ctrlXml);
	
}


//发文打印(本地文件)
/*-- visualprint_Local("C:\\test\\1183076427.ceb");   --*/
function visualprint_Local(cebnames){

	//alert(fnames);
	var objautoprint,department, ret,file,printtype;
	file = cebnames;
	var url="";
	department =  "";
	
    printtype =  "http://" + serverip + "/stampserver/extend/interfaces/SendPrint.aspx";
	ret = 0;
	objautoprint = new ActiveXObject("AutoPrintsvr.AutoPrint");
	//可视化打印本地文件
	//ret = objautoprint.VisualPrintCEB(url,department,printtype);

	ret = objautoprint.VisualPrintLocalCEB(file,department,printtype);
	//<a href="#" onclick="visualprint_b()">正文打印预览</a>
}

//发文打印(服务器文件)
/*-- visualprint("http://192.167.0.128/gwceb/1183076427.ceb");   --*/
function visualprint(urlcebnames){

	//alert(fnames);
	var objautoprint,department, ret,file,printtype;
	file = "";
	var url= urlcebnames;
	department =  "";
	
    printtype =  "http://" + serverip + "/stampserver/extend/interfaces/SendPrint.aspx";
	ret = 0;
	objautoprint = new ActiveXObject("AutoPrintsvr.AutoPrint");
	//可视化打印本地文件
	ret = objautoprint.VisualPrintCEB(url,department,printtype);

	//ret = objautoprint.VisualPrintLocalCEB(file,department,printtype);
	//<a href="#" onclick="visualprint_b()">正文打印预览</a>
}


//收文打印(本地文件)
/*-- autoprint_Local("C:\\test\\1183076427.ceb");   --*/
function autoprint_Local(cebnames){
	var objautoprint,department, ret,file,printtype;
	file = cebnames;
	department =  "";
  // 收文打印参数
	printtype =  "http://" + serverip + "/stampserver/extend/interfaces/ReceivePrint.aspx";    
	ret = 0;
	objautoprint = new ActiveXObject("AutoPrintsvr.AutoPrint");
	ret = objautoprint.VisualPrintLocalCEB(cebnames,department, printtype);
}

//收文打印(服务器文件)
/*-- autoprint("http://192.167.0.128/gwceb/1183076427.ceb");   --*/
function autoprint(urlcebnames){
	var objautoprint,department, url,ret,file,printtype;
	file = "";
	department =  "";
	url = urlcebnames;
  // 收文打印参数
	printtype =  "http://" + serverip + "/stampserver/extend/interfaces/ReceivePrint.aspx";    
	ret = 0;
	objautoprint = new ActiveXObject("AutoPrintsvr.AutoPrint");
	ret = objautoprint.VisualPrintCEB(url,department,printtype);
}


//脱密 (需要下载到本地，然后再脱密)
/*-- DetachstampMM("C:\\test\\1183076427.ceb");   --*/
function DetachstampMM(cebnames){  
 	var DetachStampImpl = new ActiveXObject("DetachStampSvr.DetachStamp");
	var  cebfile = cebnames;

	//alert(cebfile);
	var nRet = DetachStampImpl.DetachDoc(cebfile,0);
	if (nRet != 0){
		alert("脱密失败");
		return false;
	}
	delete DetachStampImpl;
	alert("脱密成功")	;	
	return true;
}

////合并cebx文件xml
/*-- var xmlstr=pjobstr_sw("C:\\test\\hb1183076427.cebx","C:\\test\\1183076427.cebx","C:\\test\\1183076428.cebx");   --*/
function pjobstr_sw(fileHname,cebxname1,cebxname2){
    
	var jobstr="";

	jobstr+="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>";
	jobstr+="<Merge>";
	jobstr+="<CEBItem>";
	jobstr+="<CEBFile Type=\"CEBX\">"+fileHname+"</CEBFile>";
	jobstr+="<PSFile>"+cebxname2+"</PSFile>";
	jobstr+="<PageNumberStart>1</PageNumberStart>";
	jobstr+="<PageNumberEnd>-1</PageNumberEnd>";
	jobstr+="<PSFile>"+cebxname1+"</PSFile>";
	jobstr+="<PageNumberStart>1</PageNumberStart>";
	jobstr+="<PageNumberEnd>-1</PageNumberEnd>";
	jobstr+="</CEBItem>";
	jobstr+="<PSItem>";
	jobstr+="<PSFile>"+cebxname2+"</PSFile>";
	jobstr+="<JobParameter>CEBX(1)</JobParameter>";
	jobstr+="<PSFile>"+cebxname1+"</PSFile>";
	jobstr+="<JobParameter>CEBX(1)</JobParameter>";
	jobstr+="</PSItem>";
	jobstr+="<AttachmentFiles/>";
	jobstr+="</Merge>";

	return jobstr;
}

//合并cebx文件
/*-- var xmlstr=pjobstr_sw("C:\\test\\hb1183076427.cebx","C:\\test\\1183076427.cebx","C:\\test\\1183076428.cebx");  

	Click_JobFlowConvert(xmlstr);
--*/
function Click_JobFlowConvert(FileDatastr)
{
	var objcebx;
    var nErrorCode;
     //打开Maker
	 objcebx = new ActiveXObject("MakerCom.MakerExt"); 	
    if (objcebx != null)
    	nErrorCode = objcebx.BeginMaker("");
    ShowMessage(nErrorCode);
    
    //检测Maker是否打开
    if (objcebx == null)
    {
    	alert("请先启动Maker！");
	   	return false;
   	}
   
    if (objcebx != null)
    	nErrorCode = objcebx.JobFlowConvert(FileDatastr, "","");
    ShowMessage(nErrorCode);

    //关闭Maker
	if (objcebx != null)
    	nErrorCode = objcebx.EndMaker();
    ShowMessage(nErrorCode);
    objcebx = null;
}

//消息
function ShowMessage(nErrorCode)
{
	if (nErrorCode == 0) {

		return true;
	}	//alert("操作成功");
	else
	{
		var strMsg;
		strMsg = objcebx.GetErrorMessage(nErrorCode);
		alert(strMsg);
		return false;
	}
}


//收发文打印 type 0-收文打印  1-发文打印  sType 来源文件类型 0-url路径  1-文档id
//CEBprint("http://192.167.0.128/gwceb/1183076427.ceb",0,0);
//CEBprint("1189",0,1);
function CEBprint(urlcebnames,type,sType){
	var ceburl = urlcebnames;
	
	if(urlcebnames==""||urlcebnames==null){
		alert("文件不能为空");
		return;
	}
	if(sType=="0"){
		
		if(type=="0"){
			autoprint(ceburl);//收文打印
		}else{
			visualprint(ceburl);//发文打印
		}
	}else{
	
		jQuery.post("/interface/ConvertMerge/html/mark/CEBFileAjax.jsp", {"docid":urlcebnames}, function(resultsg) {
		
				var ruturnstr = eval('('+resultsg+')'); //转换json对象
				var flaghw = ruturnstr.reflag;
		
				if(flaghw=="0"){
					alert("文件获取失败");
				}else{
					ceburl = ruturnstr.cebxurl;
					if(type=="0"){
						autoprint(ceburl);//收文打印
					}else{
						visualprint(ceburl);//发文打印
					}
				}
		});
	
	}
}

//脱密打印 sType 来源文件类型 0-url路径  1-文档id
//tuomi("http://192.167.0.128/gwceb/1183076427.ceb",0);
//tuomi("1189",1);
function tuomi(urlcebnames,sType){
		
	var daft = new Date();
	var localNameCEB=LocalPath+""+daft.getTime()+".ceb";
	
	var ceburl = urlcebnames;
	
	if(urlcebnames==""||urlcebnames==null){
		alert("文件不能为空");
		return;
	}
	if(sType=="0"){
		Test_HTTPDownloadFile(localNameCEB,ceburl);//下载
		DetachstampMM(localNameCEB); //脱密
		autoprint_Local(localNameCEB); //打印
	}else{
	
		jQuery.post("/interface/ConvertMerge/html/mark/CEBFileAjax.jsp", {"docid":urlcebnames}, function(resultsg) {
		
				var ruturnstr = eval('('+resultsg+')'); //转换json对象
				var flaghw = ruturnstr.reflag;
		
				if(flaghw=="0"){
					alert("文件获取失败");
				}else{
					ceburl = ruturnstr.cebxurl;
					Test_HTTPDownloadFile(localNameCEB,ceburl);//下载
					DetachstampMM(localNameCEB); //脱密
					autoprint_Local(localNameCEB); //打印
				}
		});
	
	}
}

