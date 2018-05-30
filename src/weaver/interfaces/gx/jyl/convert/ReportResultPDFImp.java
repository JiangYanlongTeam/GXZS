package weaver.interfaces.gx.jyl.convert;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.system.ceb.workflowFile;

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
					//更新流程签批文件信息
					WorkflowFilePDF file = new WorkflowFilePDF();
					file.CEBXJobResultMerge(jobResult, requestid, wsid, qfieldname, formid, userid);
				}
				if(Util.getIntValue(jobstatus,0)==1){
					//更新流程签批文件信息
					workflowFile file = new workflowFile();
					file.JobResultMerge(jobResult, requestid, wsid, qfieldname, formid, userid);
				}
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

}
