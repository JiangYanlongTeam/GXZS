package weaver.interfaces.gx.jyl.jtfybx.fyjk;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

public class JTFYBX_UpdateJKAction extends BaseBean implements Action {

	@Override
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String table = "formtable_main_" + Math.abs(request.getRequestManager().getFormid());
		// 支付方式
		String zffs_column = "zffs";
		String zffs_value = "";
		// 开户行
		String khh_column = "khh";
		// 联行号
		String lhh_column = "lhh";
		// 银行帐号
		String yhzh_column = "yhzh";
		
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(zffs_column)) {
				zffs_value = value;
			}
		}
		
		RecordSet rs = new RecordSet();
		// 支付方式为E 现金 晴空开户行 联行号 银行帐号
		if(zffs_value.equals("1")) {
			String sql = "update " + table + " set "+khh_column+" = '' ,"+lhh_column+" = '', "+yhzh_column+" = '' "
					+ "where requestid = '"+requestid+"'";
			writeLog("支付方式为E 现金 清空开户行 联行号 银行帐号SQL：" + sql);
			rs.execute(sql);
		}
		return SUCCESS;
	}
}
