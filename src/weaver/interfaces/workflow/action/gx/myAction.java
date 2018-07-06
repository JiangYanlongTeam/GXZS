package weaver.interfaces.workflow.action.gx;

import weaver.general.BaseBean;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import weaver.conn.RecordSet;

public class myAction  extends BaseBean implements Action{

	
	public String execute(RequestInfo request) {
		// TODO Auto-generated method stub
		
		
		writeLog("myAction≤‚ ‘");
		
		RecordSet rs = new RecordSet();
		rs.executeSql("insert into cebjobresult(jobid,requestid,wsid,qfieldname,formid,userid) values(1,2,3,'55',6,7)");
		
		return Action.SUCCESS;
	}

}
