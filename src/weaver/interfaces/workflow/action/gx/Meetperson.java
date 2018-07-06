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

public class Meetperson extends BaseBean implements Action {
	public String execute(RequestInfo request) {
     RecordSet rs = new RecordSet();	
		//取主表数据
		String requestid=request.getRequestid();
		String sql = "";
		String jsr = "";
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        String ids = "";
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals("ids")) {
				ids = value;
				rs.executeSql("select jsr from  formtable_main_20_dt1 where id=" + ids );
				rs.next();
				jsr = Util.null2String(rs.getString("jsr"));
				writeLog("从formtable_main_20_dt1中获取的会议纪要接收人为："+jsr);
			                             }
		
		}
		sql ="update formtable_main_299 set field04='" + jsr + "'  where requestid="+requestid;
	    rs.execute(sql); 
		writeLog("会议资料接收流程最终执行的更新sql为："+sql);
			return Action.SUCCESS;    
	}
}
