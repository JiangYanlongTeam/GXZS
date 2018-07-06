package weaver.interfaces.gx.jyl.convert;

import weaver.conn.RecordSet;
import weaver.docs.proce.CebFileUtil;
import weaver.docs.proce.DocFileInfo;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;
import weaver.system.ceb.RequestFileCMInfo;
import weaver.system.ceb.WorkflowFileCMInfo;
import weaver.system.ceb.workflowFile;

/**
 * 流程提交文件合并Action
 * @author Administrator
 *
 */
public class FileConvertMergePDF extends BaseBean implements Action{

	public String execute(RequestInfo request) {
		int requestid = Util.getIntValue(request.getRequestid(),0);//请求id
		int workflowid = Util.getIntValue(request.getWorkflowid(),0);//流程id
		int formid = Util.getIntValue(request.getRequestManager().getFormid()+"",0);//表单id
		int nodeid = 1999;//流程的节点id
		int userid = Util.getIntValue(request.getLastoperator(),0);//当前操作人
		int nodeid3 = request.getRequestManager().getNodeid();
		String ewfid = getPropValue("cebxMerge", "workflowid"); // 41
		String fieldname = getPropValue("cebxMerge", "fieldname"); // filed09
		
		writeLog("requestid:"+requestid);
		writeLog("workflowid:"+workflowid);
		writeLog("formid:"+formid);
		writeLog("nodeid:"+nodeid3);
		writeLog("userid:"+userid);
		
		WorkflowFilePDF wkFile = new WorkflowFilePDF();
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
		
	    boolean Qflag = wfileCMInfo.isQflag(); //判断该节点是否有合并

		boolean ifQflag = true;
		String url = "10.254.45.3:8080";
		int buttonid = 0;

		if(Qflag){

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
						}else{
							srcurlTrueName = "http://"+url+"/"+fileTrueName;
							//srcurlTrueName = "";
						}
					
					}
					
				}
				
			}
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
				try {
					RecordSet rs = new RecordSet();
					rs.executeSql("update formtable_main_"+(formid*-1)+" set hbnum = hbnum+1 where requestid="+requestid);
				}catch (Exception e) {

				}
			}else{
				request.getRequestManager().setMessageid("11111111");
				request.getRequestManager().setMessagecontent("文件合并任务提交失败2");
				return Action.SUCCESS;
			}
		}
		
		return Action.SUCCESS;
	}
}
