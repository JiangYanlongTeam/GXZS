package weaver.interfaces.gx.jyl.gdzc;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 固定资产拆分
 */
public class GDZCCgCFAction extends BaseBean implements Action {

	public String execute(RequestInfo request) {
		// 取主表数据
		String requestid = request.getRequestid();
		// 测试机 formtable_main_788
		String mainsql = "select b.* from formtable_main_864 a,formtable_main_864_dt2 b where a.id = b.mainid and a.requestid = '"
				+ requestid + "'";
		RecordSet rs = new RecordSet();
		writeLog("根据requestid：" + requestid + " 获取主表信息SQL：" + mainsql);
		rs.execute(mainsql);
		while (rs.next()) {
			String id = rs.getString("mainid");
			String ZCMC = rs.getString("ZCMC");
			String ANLHTXT = rs.getString("ANLHTXT");
			String MENGE = rs.getString("MENGE");
			String NETWR = rs.getString("NETWR");
			insert(id, ZCMC, ANLHTXT, MENGE, NETWR);
		}
		return Action.SUCCESS;
	}

	/*
	 * 固定资产 无形资产采购-拆分,插入到明细表中
	 */
	public void insert(String id, String zcmc, String ppjggxh, String sl, String dj) {
		RecordSet rs = new RecordSet();
		if ("".equals(sl)) {
			sl = "0";
		}
		int sltotal = Integer.parseInt(sl);
		if (!"".equals(zcmc) && sltotal > 0) {
			for (int i = 0; i < sltotal; i++) {
				String sql = "insert into formtable_main_864_dt1 (mainid,ZCMC,ANLHTXT,MENGE,NETWR) " + "values ('" + id
						+ "','" + zcmc + "','" + ppjggxh + "','1'," + dj + ")";
				writeLog("固定资产 无形资产采购-拆分SQL：" + sql);
				rs.execute(sql);
			}
		}
	}
}
