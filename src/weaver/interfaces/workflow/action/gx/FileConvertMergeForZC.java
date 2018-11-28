package weaver.interfaces.workflow.action.gx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.file.FtpCEBX;

import weaver.conn.RecordSet;
import weaver.docs.proce.CebFileUtil;
import weaver.docs.proce.DocFileInfo;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.swfa.BillFieldUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;
import weaver.system.ceb.RequestFileCMInfo;
import weaver.system.ceb.workflowFile;
import weaver.system.ceb.WorkflowFileCMInfo;
import weaver.file.FileUploadCEBX;
import weaver.interfaces.ceb.webservices.ReportResultImp;

/**
 * 流程提交文件合并Action
 * @author Administrator
 *
 */
public class
FileConvertMergeForZC extends BaseBean implements Action{

	
	public String execute(RequestInfo request) {
		// TODO Auto-generated method stub
		
		int requestid = Util.getIntValue(request.getRequestid(),0);//请求id
		int workflowid = Util.getIntValue(request.getWorkflowid(),0);//流程id
		//int formid = Util.getIntValue(request.getRequestManager().getFormid()+"",0);//表单id
		RecordSet recordsets = new RecordSet();
		recordsets.execute("select formid from workflow_base where id = '"+workflowid+"'");
		recordsets.next();
		int formid = Integer.parseInt(recordsets.getString("formid"));
		int nodeid = 1999;//流程的节点id
		//int userid = Util.getIntValue(request.getLastoperator(),0);//当前操作人
		//int nodeid3 = request.getRequestManager().getNodeid();
		recordsets.execute("select userid,nodeid from workflow_currentoperator where requestid = '"+requestid+"' and rownum =1 order by receivedate , receivetime desc");
		recordsets.next();
		int userid = Integer.parseInt(recordsets.getString("userid"));
		int nodeid3 = Integer.parseInt(recordsets.getString("nodeid"));
		String ewfid = getPropValue("cebxMerge", "workflowid");
		String fieldname = getPropValue("cebxMerge", "fieldname");
		
		writeLog("requestid:"+requestid);
		writeLog("workflowid:"+workflowid);
		writeLog("formid:"+formid);
		writeLog("nodeid:"+nodeid3);
		writeLog("userid:"+userid);
		
		workflowFile wkFile = new workflowFile();
		CebFileUtil cebutil=new CebFileUtil();
		RequestFileCMInfo fileCMInfo = new RequestFileCMInfo(workflowid, nodeid3, requestid, formid);
		fileCMInfo.init();
		WorkflowFileCMInfo wfileCMInfo = fileCMInfo.getWfcmInfo();
		
		String hzname="";   //正文后缀
		String fileHname=""; //正文文件名称
		String fileTrueName=""; //正文相对路径
		String fileRealPath=""; //正文绝对路径

		String hzname2=""; //附件后缀
		String fileHname2=""; //附件文件名称
		String fileTrueName2=""; //附件相对路径
		String fileRealPath2=""; //附件绝对路径

		String srcurlTrueName = "";  //需转换文件下载路径
		String localurlTrueName = ""; //需转换文件本地路径
		int wjsize = 0; //文件大小;
		
		String cebxurl = ""; //文件路径
		
		String LocalPath = "D:\\\\test\\\\";

	    boolean Qflag = wfileCMInfo.isQflag(); //判断该节点是否有合并

		boolean ifQflag = true;
		String url = "10.254.45.3:8080";
		//int Qnodeid = wkFile.getNodeid(workflowid+"");
		int buttonid = 0;

		if(Qflag){

			//buttonid = wkFile.getButtonid(workflowid+""); //合并按钮id

			boolean Cflag = wfileCMInfo.isCflag(); //是否初始化
			ifQflag = fileCMInfo.isIfQflag(); //签批文件是否存在

			if(Cflag && !ifQflag){//cebx文件初始化
			    
				DocFileInfo zw = new DocFileInfo(Util.getIntValue(fileCMInfo.getMainwejid(),0)); //获取正文信息
				hzname = zw.getHzname();
				fileHname = zw.getFileHname();
				fileTrueName = zw.getFileTrueName();
				fileRealPath = zw.getFileRealPath();
				fileTrueName = fileTrueName.replace("\\","/");
				wjsize = zw.getSize();

				cebutil.UnZip(fileRealPath,hzname); //解压文件

				String [] othernames = Util.TokenizerString2(fileCMInfo.getOwjids(),",");
				int fcou = 0;
				for (int i = 0; i < othernames.length; i++) {
					
					DocFileInfo wj = new DocFileInfo(Util.getIntValue(othernames[i],0)); //获取文件信息
					
					if(!"".equals(wj.getHzname())){ 
						if(fcou==0){
							srcurlTrueName += "http://"+url+"/"+wj.getFileTrueName();
							
						}else{
							srcurlTrueName += "|"+"http://"+url+"/"+wj.getFileTrueName();
							
						}
						fcou ++;
					}

					cebutil.UnZip(wj.getFileRealPath(),wj.getHzname());	 //解压文件
					
				}


				if(srcurlTrueName.length()>0){
				
					srcurlTrueName = "http://"+url+"/"+fileTrueName + "|" +srcurlTrueName;
					//localurlTrueName += "|"+LocalPath+fileHname+".cebx";
				}else{
					srcurlTrueName = "http://"+url+"/"+fileTrueName;
					//srcurlTrueName = "";
				}

			}else{ //其他节点信息插入
			
				DocFileInfo zw = new DocFileInfo(Util.getIntValue(fileCMInfo.getQpwjid()+"",0)); //获取正文信息
				hzname = zw.getHzname();
				fileHname = zw.getFileHname();
				fileTrueName = zw.getFileTrueName();
				fileRealPath = zw.getFileRealPath();
				fileTrueName = fileTrueName.replace("\\","/");
				wjsize = zw.getSize();

				cebutil.UnZip(fileRealPath,hzname); //解压文件
				//二次合并处理
				if(workflowid==Util.getIntValue(ewfid, 0)){
					
					int num = Util.getIntValue(wkFile.getFieldValue(requestid+"", "hbnum", formid+""),0);
					if(num==1){
					
						String fjids = wkFile.getFieldValue(requestid+"", fieldname, formid+"");
						
						String [] othernames = Util.TokenizerString2(fjids,",");
						int fcou = 0;
						for (int i = 0; i < othernames.length; i++) {
							
							DocFileInfo wj = new DocFileInfo(Util.getIntValue(othernames[i],0)); //获取文件信息
							
							if(!"".equals(wj.getHzname())){ 
								if(fcou==0){
									srcurlTrueName += "http://"+url+"/"+wj.getFileTrueName();
									
								}else{
									srcurlTrueName += "|"+"http://"+url+"/"+wj.getFileTrueName();
									
								}
								fcou ++;
							}
	
							cebutil.UnZip(wj.getFileRealPath(),wj.getHzname());	 //解压文件
							
						}
	
	
						if(srcurlTrueName.length()>0){
						
							srcurlTrueName = "http://"+url+"/"+fileTrueName + "|" +srcurlTrueName;
							//localurlTrueName += "|"+LocalPath+fileHname+".cebx";
						}else{
							srcurlTrueName = "http://"+url+"/"+fileTrueName;
							//srcurlTrueName = "";
						}
					
					}
					
				}
				
			}
			
			//20140225 衍 添加
	        //List insrtlist = wkFile.getInsertText(requestid+"",workflowid+"",formid+"",nodeid+""); //获取某个流程某个节点需要插入的信息内容。
			//if(insrtlist.size()>1){
			//	insertstr = insrtlist.get(0).toString();  //文本信息
			//	dowstr = insrtlist.get(1).toString();    //图片下载
			//}
			String fileurl = "";
			
			if(srcurlTrueName.equals("")){//没有附件
				
				srcurlTrueName = "http://"+url+"/"+fileTrueName;
			}
			
			String jobid = wkFile.ConcatFiles_JobID(srcurlTrueName, 2, wjsize);
			if(Util.getIntValue(jobid, 0)>0){
				
				boolean ff = workflowFile.UpdateCebjobresult(requestid, Util.getIntValue(jobid), wfileCMInfo.getId(),wfileCMInfo.getQfieldname(),fileCMInfo.getFormid(),userid);
				if(!ff){
					
					request.getRequestManager().setMessageid("11111111");
					request.getRequestManager().setMessagecontent("文件合并任务提交失败1");
					return Action.SUCCESS;
				}
				RecordSet rs = new RecordSet();
				rs.executeSql("update formtable_main_"+(formid*-1)+" set hbnum = hbnum+1 where requestid="+requestid);
			}else{
				
				
				request.getRequestManager().setMessageid("11111111");
				request.getRequestManager().setMessagecontent("文件合并任务提交失败2");
				return Action.SUCCESS;
			}
			
			
			/*
			if(cebxurl.length()>0){
				int indxx = cebxurl.lastIndexOf("/");
				cebxurl = cebxurl.substring(indxx+1);
			
				String filename=cebxurl;  //文件名称
				String filenamepath="/app/ecology/hbcebx/"+cebxurl; //文件存放目录
		
				RecordSet rs = new RecordSet();
				
				String maintable = "";
		        String sql = "select tablename from workflow_bill where id="+formid;
		        rs.executeSql(sql);
		        while(rs.next()){
		        	maintable = rs.getString("tablename"); //流程主表名称
		        } 
		        
		        String filedname=""; //文件中文名称
		        
		        
		      //查询流程标题
		        rs.executeSql("select requestname,requestid from workflow_requestbase where requestid="+requestid);
		        if(rs.next()){
		        	filedname = rs.getString("requestname");
		        }
		        
		        try {
		        	
		        	FtpCEBX ts=new FtpCEBX(); //从合并服务器取回文件
		            ts.myget(filename,filenamepath);
		            
		            //文件名称
		            if(!"".equals(filedname)){
		            	filename=filedname+".cebx";
		            }
		            
		            //bb.writeLog("创建人"+creaid);
		            FileUploadCEBX flcebx=new FileUploadCEBX();
					flcebx.saveRequestBase64FileContent_sw(requestid,userid,filenamepath,maintable,filename,"fjsc");
					//bb.writeLog("创建人"+creaid);
					
					String docid="0";
					String fwh="0";
					
					rs.executeSql("select "+wfileCMInfo.getQfieldname()+" from "+maintable+" where requestid="+requestid);
					if(rs.next()){
						docid=rs.getString(""+wfileCMInfo.getQfieldname());
					}
					//更新目录
					//rs.executeSql("update docdetail set maincategory=370,subcategory=708,seccategory=1142 where id="+Util.getIntValue(docid,0));
					
		        } catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}else{
				
				request.getRequestManager().setMessageid("11111111");
				request.getRequestManager().setMessagecontent("文件合并失败");
				return Action.SUCCESS;
			}*/
		}
		
		return Action.SUCCESS;
	}
	
	
	public String execute(int requestid,int workflowid,int formid,int nodeid,int userid) {
		

		// TODO Auto-generated method stub
		
//		int requestid = Util.getIntValue(request.getRequestid(),0);//请求id
//		int workflowid = Util.getIntValue(request.getWorkflowid(),0);//流程id
//		int formid = Util.getIntValue(request.getRequestManager().getFormid()+"",0);//表单id
//		int nodeid = 1999;//流程的节点id
//		int userid = Util.getIntValue(request.getLastoperator(),0);//当前操作人
//		int nodeid3 = request.getRequestManager().getNodeid();
		
		writeLog("requestid:"+requestid);
		writeLog("workflowid:"+workflowid);
		writeLog("formid:"+formid);
		writeLog("nodeid:"+nodeid);
		writeLog("userid:"+userid);
		
		workflowFile wkFile = new workflowFile();
		CebFileUtil cebutil=new CebFileUtil();
		RequestFileCMInfo fileCMInfo = new RequestFileCMInfo(workflowid, nodeid, requestid, formid);
		fileCMInfo.init();
		WorkflowFileCMInfo wfileCMInfo = fileCMInfo.getWfcmInfo();
		
		String hzname="";   //正文后缀
		String fileHname=""; //正文文件名称
		String fileTrueName=""; //正文相对路径
		String fileRealPath=""; //正文绝对路径

		String hzname2=""; //附件后缀
		String fileHname2=""; //附件文件名称
		String fileTrueName2=""; //附件相对路径
		String fileRealPath2=""; //附件绝对路径

		String srcurlTrueName = "";  //需转换文件下载路径
		String localurlTrueName = ""; //需转换文件本地路径
		int wjsize = 0; //文件大小;
		
		String cebxurl = ""; //文件路径
		
		String LocalPath = "D:\\\\test\\\\";

	    boolean Qflag = wfileCMInfo.isQflag(); //判断该节点是否有合并

		boolean ifQflag = true;
		String url = "10.254.45.3";
		//int Qnodeid = wkFile.getNodeid(workflowid+"");
		int buttonid = 0;

		
		writeLog("Qflag:"+Qflag);
		if(Qflag){

			//buttonid = wkFile.getButtonid(workflowid+""); //合并按钮id

			boolean Cflag = wfileCMInfo.isCflag(); //是否初始化
			ifQflag = fileCMInfo.isIfQflag(); //签批文件是否存在
			
			writeLog("Cflag:"+Cflag);
			writeLog("ifQflag:"+ifQflag);

			if(Cflag && !ifQflag){//cebx文件初始化
			    
				DocFileInfo zw = new DocFileInfo(Util.getIntValue(fileCMInfo.getMainwejid(),0)); //获取正文信息
				hzname = zw.getHzname();
				fileHname = zw.getFileHname();
				fileTrueName = zw.getFileTrueName();
				fileRealPath = zw.getFileRealPath();
				fileTrueName = fileTrueName.replace("\\","/");
				wjsize = zw.getSize();

				cebutil.UnZip(fileRealPath,hzname); //解压文件

				String [] othernames = Util.TokenizerString2(fileCMInfo.getOwjids(),",");
				int fcou = 0;
				for (int i = 0; i < othernames.length; i++) {
					
					DocFileInfo wj = new DocFileInfo(Util.getIntValue(othernames[i],0)); //获取文件信息
					
					if(!"".equals(wj.getHzname())){ 
						if(fcou==0){
							srcurlTrueName += "http://"+url+"/"+wj.getFileTrueName();
							
						}else{
							srcurlTrueName += "|"+"http://"+url+"/"+wj.getFileTrueName();
							
						}
						fcou ++;
					}

					cebutil.UnZip(wj.getFileRealPath(),wj.getHzname());	 //解压文件
					
				}


				if(srcurlTrueName.length()>0){
				
					srcurlTrueName = "http://"+url+"/"+fileTrueName + "|" +srcurlTrueName;
					//localurlTrueName += "|"+LocalPath+fileHname+".cebx";
				}else{
					srcurlTrueName = "http://"+url+"/"+fileTrueName;
					//srcurlTrueName = "";
				}

			}else{ //其他节点信息插入
			
				DocFileInfo zw = new DocFileInfo(Util.getIntValue(fileCMInfo.getQpwjid()+"",0)); //获取正文信息
				hzname = zw.getHzname();
				fileHname = zw.getFileHname();
				fileTrueName = zw.getFileTrueName();
				fileRealPath = zw.getFileRealPath();
				fileTrueName = fileTrueName.replace("\\","/");
				wjsize = zw.getSize();

				cebutil.UnZip(fileRealPath,hzname); //解压文件
			}
			
			//20140225 衍 添加
	        //List insrtlist = wkFile.getInsertText(requestid+"",workflowid+"",formid+"",nodeid+""); //获取某个流程某个节点需要插入的信息内容。
			//if(insrtlist.size()>1){
			//	insertstr = insrtlist.get(0).toString();  //文本信息
			//	dowstr = insrtlist.get(1).toString();    //图片下载
			//}
			String fileurl = "";
			
			if(srcurlTrueName.equals("")){//没有附件
				
				srcurlTrueName = "http://"+url+"/"+fileTrueName;
			}
			
			String jobid = wkFile.ConcatFiles_JobID(srcurlTrueName, 2, wjsize);
			if(Util.getIntValue(jobid, 0)>0){
				
				writeLog("文件合并任务id:"+jobid);
				
				boolean ff = workflowFile.UpdateCebjobresult(requestid, Util.getIntValue(jobid), wfileCMInfo.getId(),wfileCMInfo.getQfieldname(),fileCMInfo.getFormid(),userid);
				if(!ff){
					writeLog("文件合并任务提交失败2");
					//request.getRequestManager().setMessageid("11111111");
					//request.getRequestManager().setMessagecontent("文件合并任务提交失败1");
					return Action.SUCCESS;
				}
			}else{
				
				writeLog("文件合并任务提交失败1");
				//request.getRequestManager().setMessageid("11111111");
				//request.getRequestManager().setMessagecontent("文件合并任务提交失败2");
				return Action.SUCCESS;
			}
			
			
			/*
			if(cebxurl.length()>0){
				int indxx = cebxurl.lastIndexOf("/");
				cebxurl = cebxurl.substring(indxx+1);
			
				String filename=cebxurl;  //文件名称
				String filenamepath="/app/ecology/hbcebx/"+cebxurl; //文件存放目录
		
				RecordSet rs = new RecordSet();
				
				String maintable = "";
		        String sql = "select tablename from workflow_bill where id="+formid;
		        rs.executeSql(sql);
		        while(rs.next()){
		        	maintable = rs.getString("tablename"); //流程主表名称
		        } 
		        
		        String filedname=""; //文件中文名称
		        
		        
		      //查询流程标题
		        rs.executeSql("select requestname,requestid from workflow_requestbase where requestid="+requestid);
		        if(rs.next()){
		        	filedname = rs.getString("requestname");
		        }
		        
		        try {
		        	
		        	FtpCEBX ts=new FtpCEBX(); //从合并服务器取回文件
		            ts.myget(filename,filenamepath);
		            
		            //文件名称
		            if(!"".equals(filedname)){
		            	filename=filedname+".cebx";
		            }
		            
		            //bb.writeLog("创建人"+creaid);
		            FileUploadCEBX flcebx=new FileUploadCEBX();
					flcebx.saveRequestBase64FileContent_sw(requestid,userid,filenamepath,maintable,filename,"fjsc");
					//bb.writeLog("创建人"+creaid);
					
					String docid="0";
					String fwh="0";
					
					rs.executeSql("select "+wfileCMInfo.getQfieldname()+" from "+maintable+" where requestid="+requestid);
					if(rs.next()){
						docid=rs.getString(""+wfileCMInfo.getQfieldname());
					}
					//更新目录
					//rs.executeSql("update docdetail set maincategory=370,subcategory=708,seccategory=1142 where id="+Util.getIntValue(docid,0));
					
		        } catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}else{
				
				request.getRequestManager().setMessageid("11111111");
				request.getRequestManager().setMessagecontent("文件合并失败");
				return Action.SUCCESS;
			}*/
		}
		
		return Action.SUCCESS;
	
		
		
	}
	

}
