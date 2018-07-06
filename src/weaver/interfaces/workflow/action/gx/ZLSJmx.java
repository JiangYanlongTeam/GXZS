package weaver.interfaces.workflow.action.gx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;

public class ZLSJmx implements Action {
	public String execute(RequestInfo request) {
     RecordSet rs = new RecordSet();	
		//取主表数据
		String requestid=request.getRequestid();
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		String detailfield01 = "";
        String detailfield02 = "";
		String detailfield03 = "";
		String detailfield04 = "";
 		String detailfield05 = "";
        String workflowrequestid = "";
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals("filed10")) {
				detailfield01 = value;
			}
			if (name.equals("filed11")) {
				detailfield02 = value;
			}
			if (name.equals("filed12")) {
				detailfield03 = value;
			}
			if (name.equals("filed13")) {
				detailfield04 = value;
			}
			if (name.equals("filed14")) {
				detailfield05 = value;
			}
			if (name.equals("workflowrequestid")) {
				workflowrequestid = value;
			}
		}
       rs.executeSql("select id from  formtable_main_32 where requestId="
				+ workflowrequestid );
				rs.next();
		     String mainid = Util.null2String(rs.getString("id"));																       
		    String sql ="INSERT INTO formtable_main_32_dt2 (mainid,detailfield01,detailfield02,detailfield03,detailfield04,detailfield05) VALUES('" + mainid + "','" + detailfield01 + "','" + detailfield02 + "','" + detailfield03 + "','" + detailfield04 + "','" + detailfield05 + "')";
			rs.executeSql(sql);
					
				
		
		
		return Action.SUCCESS;
	}
}
