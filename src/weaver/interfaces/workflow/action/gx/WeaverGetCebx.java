package weaver.interfaces.workflow.action.gx;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

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

public class WeaverGetCebx extends BaseBean implements Action{

	
	public String execute(RequestInfo request) {
		// TODO Auto-generated method stub
		
		int requestid = Util.getIntValue(request.getRequestid(),0);//请求id
		int workflowid = Util.getIntValue(request.getWorkflowid(),0);//流程id
		int formid = Util.getIntValue(request.getRequestManager().getFormid()+"",0);//表单id
		int userid = Util.getIntValue(request.getLastoperator(),0);//当前操作人
		int nodeid = request.getRequestManager().getNodeid();
		
		workflowFile wkFile = new workflowFile();
		
		WorkflowFileCMInfo wfcminfo = new WorkflowFileCMInfo(workflowid, true);
		
		boolean SignFlag = wfcminfo.isSignFlag();
		
		RequestFileCMInfo rfcminfo = new RequestFileCMInfo(workflowid,nodeid,requestid,formid,wfcminfo);
		//rfcminfo.setWfcmInfo(wfcminfo);
		rfcminfo.init();
		CebFileUtil cebutil=new CebFileUtil();
		
		String hzname="";   //正文后缀
		String fileHname=""; //正文文件名称
		String fileTrueName=""; //正文相对路径
		String fileRealPath=""; //正文绝对路径
		String LocalPath = "D:\\\\test\\\\";
		String url = "10.254.45.3:8080";
		int wjsize = 0;

		int buttonid = 0;

		

		if(SignFlag){
				
			buttonid = wfcminfo.getButtonid();
			
			writeLog("[ff:]"+rfcminfo.getQsignattid()+"");
			DocFileInfo zw = new DocFileInfo(Util.getIntValue(rfcminfo.getQsignattid()+"",0)); //获取正文信息
			hzname = zw.getHzname();
			fileHname = zw.getFileHname();
			fileTrueName = zw.getFileTrueName();
			fileRealPath = zw.getFileRealPath();
			fileTrueName = fileTrueName.replace("\\","/");
			wjsize = zw.getSize();
			cebutil.UnZip(fileRealPath,hzname); //解压文件

			String srcurlTrueName = "http://"+url+"/"+fileTrueName;
			String jobid = wkFile.ConvertFile_JobID(srcurlTrueName, 2, wjsize);
			
			RecordSet rs = new RecordSet();
			String sql = "update formtable_main_"+(formid*-1)+" set cebxpdf='' where requestid="+requestid;
			rs.executeSql(sql);
			 
			if(Util.getIntValue(jobid, 0)>0){
				
				workflowFile.UpdateCebxjobresultSign(requestid, Util.getIntValue(jobid), wfcminfo.getId(),"cebxpdf",rfcminfo.getFormid(),userid);
				jobid = wkFile.ConvertFile_JobID(srcurlTrueName, 0, wjsize);
				workflowFile.UpdateCebxjobresultSign(requestid, Util.getIntValue(jobid), wfcminfo.getId(),"cebxpdf",rfcminfo.getFormid(),userid);
			}else{
				
				request.getRequestManager().setMessageid("11111111");
				request.getRequestManager().setMessagecontent("文件转换任务提交失败2");
				return Action.SUCCESS;
			}
		
		}
		
		
		return Action.SUCCESS;
	}
	
	

}
