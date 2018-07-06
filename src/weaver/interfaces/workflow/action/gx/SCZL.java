package weaver.interfaces.workflow.action.gx;
import java.util.HashMap;
import java.util.Map;
import weaver.conn.RecordSet;
import weaver.conn.RecordSetDataSource;
import weaver.general.BaseBean;
import weaver.general.TimeUtil;
import weaver.interfaces.workflow.action.Action;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import weaver.general.Util;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;

public class SCZL extends BaseBean implements Action {
	public String execute(RequestInfo request) {
     RecordSet rs = new RecordSet();	
		//取主表数据
		String requestid=request.getRequestid();
		String sql = "";
		String filed11s = "";
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		String filed10= "";
        String workflowrequestid = "";
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals("filed10")) {
				filed10 = value;
			}
			if (name.equals("workflowrequestid")) {
				workflowrequestid = value;
				rs.executeSql("select filed11 from  formtable_main_32 where requestId=" + workflowrequestid );
				rs.next();
				filed11s = Util.null2String(rs.getString("filed11"));
				writeLog("从formtable_main_32中获取的filed11为："+filed11s);
			}
		}
		writeLog("从formtable_main_33中获取的filed10为："+filed10);
		if ("".equals(filed11s)) {
		     sql ="update formtable_main_32  set filed11='" + filed10 + "'  where requestid="+workflowrequestid;
			 rs.execute(sql);
		} else {
			String filed10_2 = filed11s +","+ filed10 ;
            sql ="update formtable_main_32  set filed11='" + filed10_2 + "'  where requestid="+workflowrequestid;
			rs.execute(sql);
		}
		writeLog("最终执行的更新sql为："+sql);
		return Action.SUCCESS;
	}
}
