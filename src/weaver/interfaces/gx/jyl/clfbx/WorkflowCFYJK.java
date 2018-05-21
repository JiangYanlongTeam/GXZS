package weaver.interfaces.gx.jyl.clfbx;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;


public class WorkflowCFYJK extends BaseBean implements Action{

  public String execute(RequestInfo request)
  {
    try{
		String requestid = Util.null2String(request.getRequestid());
 		//int workflowid = Util.getIntValue(request.getWorkflowid());
		String getid = "";
		String getsfcjk = "";
		double getcxje =0;
		double gethkje =0;
		double bchkje =0;//本次还款金额=本次冲销金额+还款金额
		String getjkdh = "";
		RecordSet rs = new RecordSet();    
		RecordSet mxrs = new RecordSet(); 
		RecordSet rsjk = new RecordSet(); 
		String tablename = getPropValue("GXBX", "CW_CLF");
		String tablename1 = getPropValue("GXBX", "CW_FYJK");
		//差旅费用报销流程
		String sql = " select * from "+tablename+" where requestid= "+requestid;
		rs.executeSql(sql);
		if(rs.next()){
			getid = Util.null2String(rs.getString("id"));//主表ID
			getsfcjk = Util.null2String(rs.getString("sfcjk"));//是否冲销借款
		}
		
		 //付款方式=冲借款，提交更新冲借款流程
		if(getsfcjk.equals("0")){
			mxrs.executeSql(" select * from "+tablename+"_dt4 where mainid='"+getid+"' ");
						while(mxrs.next()){
							getjkdh = Util.null2String(mxrs.getString("jkdh"));
						    getcxje = Util.getDoubleValue(mxrs.getString("cxje"),0);
							gethkje = Util.getDoubleValue(mxrs.getString("hkje"),0);
							bchkje = getcxje+gethkje;
							writeLog("本次还款金额=本次冲销金额+还款金额===="+bchkje);
							rsjk.executeSql(" update "+tablename1+" set hkztje=nvl(hkztje,0)+'"+bchkje+"' where id='"+getjkdh+"' ");
							writeLog("update 成功！！！");
			}
		}
    }
    catch (Exception e)
    {
		writeLog("=========");
    }
    return Action.SUCCESS;
  }

}