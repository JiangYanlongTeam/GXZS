package weaver.interfaces.gx.jyl.jtfybx.ybfybx;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 集团通用费用报销-流程提交后根据支付类别更新不同分类的值
 * 
 * @author jiangyanlong
 *
 */
public class JTFYBX_UpdateTYFYAction extends BaseBean implements Action {

	@Override
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String table = "formtable_main_" + Math.abs(request.getRequestManager().getFormid());
		// 支付类别 0 个人 1 对公 2 不需支付 3 对公一次性供应商
		String zflb_column = "zflb";
		String zflb_value = "";
		// 收款人
		String skr_column = "skr";
		// 个人支付方式
		String zffs_column = "zffs";
		String zffs_value = "";
		// 供应商名称
		String gysmc_column = "gysmc";
		// 联行号
		String lhh_column = "lhh";
		// 供应商开户行名称
		String khh_column = "gyskhh";
		// 供应商银行账号
		String gysyhzh_column = "gysyhzh";

		// 一次性供应商名称
		String ycxgysmc_column = "ycxgysmc";
		String ycxgysbm_column = "ycxgysbm";
		String ycxgysyhzh_column = "ycxgysyhzh";
		String ycxgyskhh_column = "ycxgyskhh";
		String zh_column = "zh";
		String gglhh_column = "gglhh";
		String akhh_column = "khh";

		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
			if (name.equals(zffs_column)) {
				zffs_value = value;
			}
		}
		RecordSet rs = new RecordSet();
		// 个人
		if (zflb_value.equals("0")) {
			String sql = "";
			if ("0".equals(zffs_value)) {
				sql = "update " + table + " set " + gysmc_column + " = '', fkflhh = '',fkfyhzh = '', gglhh = '', khh = '', zh = '', " + lhh_column + " = ''," + khh_column
						+ " = ''," + gysyhzh_column + " = ''," + ycxgysmc_column + " = ''," + ycxgysbm_column + " = '',"
						+ ycxgysyhzh_column + " = ''," + ycxgyskhh_column + " = '' where requestid = '" + requestid + "'";
			} else {
				sql = "update " + table + " set " + gysmc_column + " = '', " + lhh_column + " = ''," + khh_column
						+ " = ''," + gysyhzh_column + " = ''," + ycxgysmc_column + " = ''," + ycxgysbm_column + " = '',"
						+ ycxgysyhzh_column + " = ''," + ycxgyskhh_column + " = '' where requestid = '" + requestid + "'";
			}
			writeLog("集团费用报销_通用费用，支付类别为个人，清空对公／一次性供应商 信息SQL：" + sql);
			rs.execute(sql);
		}
		// 对公
		if (zflb_value.equals("1") || zflb_value.equals("4") ) {
			String sql = "update " + table + " set " + skr_column + " = ''," + zffs_column + " = '', "+zh_column+" = '', "+gglhh_column+" = '', "+akhh_column+" = '', " + ""
					+ ycxgysmc_column + " = ''," + ycxgysbm_column + " = ''," + ycxgysyhzh_column + " = '',"
					+ ycxgyskhh_column + " = '' where requestid = '" + requestid + "'";
			writeLog("集团费用报销_通用费用，支付类别为对公，清空个人／一次性供应商 信息SQL：" + sql);
			rs.execute(sql);
		}
		// 不需要支付
		if (zflb_value.equals("2")) {
			String sql = "update " + table + " set " + gysmc_column + " = ''," + lhh_column + " = ''," + khh_column
					+ " = ''," + gysyhzh_column + " = ''," + skr_column + " = ''," + zffs_column + " = '',"
					+ ycxgysmc_column + " = ''," + ycxgysbm_column + " = ''," + ycxgysyhzh_column + " = '',"
					+ ycxgyskhh_column + " = '' where requestid = '" + requestid + "'";
			writeLog("集团费用报销_通用费用，支付类别为不需支付，清空个人／对公／一次性供应商 信息SQL：" + sql);
			rs.execute(sql);
		}
		// 一次性供应商
		if (zflb_value.equals("3")) {
			String sql = "update " + table + " set " + gysmc_column + " = '', "+gglhh_column+" = '', "+zh_column+" = '', "+akhh_column+" = '', " + lhh_column + " = ''," + khh_column
					+ " = ''," + gysyhzh_column + " = '', " + skr_column + " = ''," + zffs_column
					+ " = '' where requestid = '" + requestid + "'";
			writeLog("集团费用报销_通用费用，支付类别为不需支付，清空个人／对公／一次性供应商 信息SQL：" + sql);
			rs.execute(sql);
		}

		return SUCCESS;
	}

}
