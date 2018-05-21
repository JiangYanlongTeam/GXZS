package weaver.interfaces.gx.jyl.rcgs.hk;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 人才公司-费用还款退回释放
 */
public class RCGS_HKTHAction extends BaseBean implements Action {

	public String execute(RequestInfo request) {
		// 还款金额-值
		String hkje_value = "";
		// 还款金额-字段
		String hkje_column = "hkje";
		// 借款单号-值
		String hxjkdh_value = "";
		// 借款单号-字段
		String hxjkdh_column = "hxjkdh";
		RecordSet rs = new RecordSet();
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(hkje_column)) {
				hkje_value = value;
			}
			if (name.equals(hxjkdh_column)) {
				hxjkdh_value = value;
			}
		}
		double dou = Util.getDoubleValue(hkje_value, 0);
		String tablename = getPropValue("RCGSBX", "RCGSBX_FYJK");
		String sql = "update " + tablename + " set hkztje=nvl(hkztje,0)-'" + dou + "' where id='" + hxjkdh_value + "' ";
		rs.execute(sql);
		return SUCCESS;
	}
}
