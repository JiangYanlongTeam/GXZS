package weaver.interfaces.gx.jyl.convert;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.swfa.WorkflowUtil;
import weaver.workflow.webservices.WorkflowRequestInfo;
import weaver.workflow.webservices.WorkflowService;
import weaver.workflow.webservices.WorkflowServiceImpl;

import java.rmi.RemoteException;
import java.util.List;

/**
 * 敏行 报告转换结果 接口 实现类
 * @author Administrator
 *
 */
public class ReportResultPDFImp implements ReportResultPDF {
	
	/**
	 * 接收 任务执行结果
	 * @param nJobid 任务id
	 * @param strXML 结果 xml
	 * @return
	 */
	public int convertResult(int nJobid, String strXML) {
		// TODO Auto-generated method stub
		int status = 0;
		String jobResult = "";
		String jobstatus = "";
		String nodestr = "//root/data/itemList/item";
		BaseBean bean = new BaseBean();
		
		try {
			
			bean.writeLog("返回结果报告开始");
			bean.writeLog("返回结果报告文本："+strXML);
			Document docu=DocumentHelper.parseText(strXML);
			List list = docu.selectNodes(nodestr); //找到某个元素的子元素集合
			
			for (int i = 0; i < list.size(); i++) { //遍历List
				
				Element table=((Element) list.get(i)); //获取某行子元素
				Element filename = table.element("targetName");  //根据元素名 获取元素3
				if(filename!=null){ //判断是否存在该元素
					jobResult += "|"+filename.getText(); //获取元素文本
				}
				
				Element statu = table.element("status");  //根据元素名 获取元素3
				if(statu!=null){ //判断是否存在该元素
					jobstatus = statu.getText(); //获取元素文本
				}
			}
			if(jobResult.indexOf("|")==0){
				jobResult = jobResult.substring(1);
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.writeLog("ReportResultImp.convertResult:"+e.toString());
			status = 3;
		}
		
		bean.writeLog("返回结果报告文本[jobResult]"+jobResult+"   [jobstatus]"+jobstatus);
		
		RecordSet rs = new RecordSet();
		
		rs.executeSql("select * from cebjobresult where jobid="+Util.getIntValue(nJobid+"", 0));
		if(rs.next()){
			
			int requestid = rs.getInt("requestid");
			int wsid = rs.getInt("wsid");
			int formid = rs.getInt("formid");
			int userid = rs.getInt("userid");
			String qfieldname = rs.getString("qfieldname");
			int type = rs.getInt("type");
			
			boolean flag = rs.executeSql("update cebjobresult set jobresult='"+jobResult+"',status='"+Util.getIntValue(jobstatus, 0)+"' where jobid="+nJobid);
			if(!flag){
				status = 3;
			}
			if(type==0){
				if(Util.getIntValue(jobstatus,0)==1){

					// 增加判断是否已经做过合并动作

					if(isHasHB(requestid,qfieldname)) {
						bean.writeLog("已经合并过，返回结果报告结束");
						WorkflowUtil wfUtil = new WorkflowUtil();
						boolean isSubmit = SubmitRequest(requestid,14164);
						new BaseBean().writeLog("isSubmit:"+isSubmit);
//						wfUtil.nextNodeBySubmit(requestid, Util.getIntValue(wfUtil.getCurroperators(requestid),0), "");
						return 0;
					}
					//更新流程签批文件信息
					WorkflowFilePDF file = new WorkflowFilePDF();
					file.CEBXJobResultMerge(jobResult, requestid, wsid, qfieldname, formid, userid);
				}
//				if(Util.getIntValue(jobstatus,0)==1){
//					//更新流程签批文件信息
//					workflowFile file = new workflowFile();
//					file.JobResultMerge(jobResult, requestid, wsid, qfieldname, formid, userid);
//				}
			}else if(type==2){

			}
		}else{
		
			boolean flag = rs.executeSql("insert into cebjobresult(jobid,jobresult,status) values("+nJobid+",'"+jobResult+"',"+Util.getIntValue(jobstatus, 1)+")");
			if(!flag){
				status = 3;
			}
		}
		
		bean.writeLog("返回结果报告结束");
		return status;
	}

	/**
	 * 获得流程的详细信息
	 *
	 * @param requestid
	 * @return
	 * @throws RemoteException
	 */
	public static WorkflowRequestInfo getRequestInfo(int requestid, int userid) {
		WorkflowService WorkflowServicePortTypeProxy = new WorkflowServiceImpl();
		WorkflowRequestInfo WorkflowRequestInfo = WorkflowServicePortTypeProxy.getWorkflowRequest(requestid, userid, 0);// 调用接口获取对应requestid的数据
		return WorkflowRequestInfo;
	}

	/**
	 * 提交流程
	 *
	 * @throws RemoteException
	 */
	public boolean SubmitRequest(int requestid, int userid) {
		WorkflowRequestInfo WorkflowRequestInfo = getRequestInfo(requestid, userid);
		WorkflowService WorkflowServicePortTypeProxy = new WorkflowServiceImpl();
		String str = WorkflowServicePortTypeProxy.submitWorkflowRequest(WorkflowRequestInfo, requestid, userid,
				"submit", "");
		return "success".equals(str);
	}
	
	/**
	 * 获取任务执行结果
	 * @param nJobid 任务id
	 * @return 
	 */
	public String getJobResult(int nJobid) {
		// TODO Auto-generated method stub
		String jobResult = "";
		
		String sql = "select jobid,jobresult,status from cebjobresult where jobid="+nJobid;
		
		RecordSet rs = new RecordSet();
		rs.executeSql(sql);
		if(rs.next()){
			jobResult = rs.getString("jobResult");
			if(jobResult==null || "".equals(jobResult)){
				jobResult = "0";
			}
		}
		
		return jobResult;
	}


	public boolean isHasHB(int requestid,String fieldid) {
		RecordSet recordSet = new RecordSet();
		recordSet.execute("select formid from workflow_base where id in (" +
				"select WORKFLOWID from WORKFLOW_REQUESTBASE where REQUESTID = '"+requestid+"')");
		recordSet.next();
		String formid = Util.null2o(recordSet.getString("formid"));
		String tableName = "formtable_main_"+Math.abs(Integer.parseInt(formid));
		String sql = "select " + fieldid + " from " + tableName + " where requestid = '"+requestid+"'";
		recordSet.execute(sql);
		recordSet.next();
		String value = Util.null2String(recordSet.getString(fieldid));
		if(!value.equals("")) {
			return true;
		}
		return false;
	}

}
