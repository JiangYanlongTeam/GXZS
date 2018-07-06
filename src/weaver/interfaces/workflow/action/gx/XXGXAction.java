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

public class XXGXAction extends BaseBean implements Action {

	public String execute(RequestInfo request) {

		
		RecordSet rs = new RecordSet();
		// 取主表数据
		String requestid = request.getRequestid();
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		String hyrq = "";// 会议日期
		String hhyt = "";
		String sfsh = "";
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals("field01")) {
				hyrq = value;
			}
		}
		// 取明细数据
		DetailTable[] detailtable = request.getDetailTableInfo()
				.getDetailTable();// 获取所有明细表
		DetailTable dt = detailtable[0];// 指定明细表 表示明细表1
		Row[] s = dt.getRow();// 当前明细表的所有数据,按行存储
		for (int j = 0; j < s.length; j++) {
			Row r = s[j];// 指定行
			Cell c[] = r.getCell();// 每行数据再按列存储
			for (int k = 0; k < c.length; k++) {
				Cell c1 = c[k];// 指定列
				String name = c1.getName();// 明细字段名称
				String value = c1.getValue();// 明细字段的值
				if (name.equals("detailfield01")) { //会议议题
					hhyt = value;
				}
				if (name.equals("detailfield02")) { //是否上会
					sfsh = value;
				}
			}
			
			String sql = "update formtable_main_25 set field05 = '" + sfsh + "', field03 = '" + hyrq + "', field15 = '" + requestid + "' where requestid = '" + hhyt + "'";
			rs.executeSql(sql);
			writeLog("XXGXAction拼接的更新sql为：" + sql);
			
			//list.add(map);
		}

		
		
		
		return Action.SUCCESS;
	}

}
