package weaver.interfaces.gx.jyl.extension.syg.clf;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

public class ClearCLFAction_2220 extends BaseBean implements Action {

	@Override
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String table = "formtable_main_" + Math.abs(request.getRequestManager().getFormid());
		//支付类别 0 对私对公 1 对私 2 对公 3 不需支付
		String zflb_column = "zflb";
		String zflb_value = "";
		//收款人
		String skr_column = "skr";
		//对私支付金额
		String dszfje_column = "dszfje";
		
		//对私支付方式
		String dgzffs_column = "dgzffs";
		String dgzffs_value = "";
		//供应商名称
		String gysmc_column = "gysmc";
		//联行号
		String lhh_column = "lhh";
		//开户行名称
		String khh_column = "khh";
		//供应商银行账号
		String gysyhzh_column = "gysyhzh";
		//对公支付金额
		String dgzfje_column = "dgzfje";
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
			if (name.equals(dgzffs_column)) {
				dgzffs_value = value;
			}
		}
		RecordSet rs = new RecordSet();
		//支付类别为对私支付（0）
		if(zflb_value.equals("1")) {
			//对私支付方式为现金（0）清空收款人联航号 收款人开户行 收款人帐号 对公信息
			if ("0".equals(dgzffs_value)) {
				String sql = "update " + table + " set skrkhh = '' ,skrlhh = '', skrzh = '', gysmc = '', dgzfje = '', lhh = '', khh = '', gysyhzh = '',gysbm = '' "
						+ "where requestid = '"+requestid+"'";
				writeLog("差旅费，支付类别为对私(现金)，清空个人收款信息／对公信息SQL：" + sql);
				rs.execute(sql);
			}
			//对私支付方式为银行（1）清空收款人联航号 收款人开户行 收款人帐号
			if ("1".equals(dgzffs_value)) {
				String sql = "update " + table + " set gysmc = '', dgzfje = '', lhh = '', khh = '', gysyhzh = '',gysbm = '' "
						+ "where requestid = '"+requestid+"'";
				writeLog("差旅费，支付类别为对私(现金)，清空个人收款信息／对公信息SQL：" + sql);
				rs.execute(sql);
			}
		}
		//对公 对私
		if(zflb_value.equals("0")) {
			// 0 现金
			if ("0".equals(dgzffs_value)) {
				String sql = "update " + table + " set skrlhh = '',skrkhh = '',skrzh = '' where requestid = '"+requestid+"'";
				writeLog("差旅费，支付类别为对公/对私，清空收款人帐号／收款人开户行／收款人联行号 SQL：" + sql);
				rs.execute(sql);
			}
		}
		//对公 借用人员
		if(zflb_value.equals("2") || zflb_value.equals("4")) {
			String sql = "update " + table + " set " + dgzffs_column + " = ''," + skr_column + " = '',"+ dszfje_column + " = '',skrlhh = '', skrzh = '',skrkhh = '' where requestid = '"+requestid+"'";
			writeLog("差旅费，支付类别为对公，清空对私信息SQL：" + sql);
			rs.execute(sql);
		}
		//不需要支付
		if(zflb_value.equals("3")) {
			String sql = "update " + table + " set " + dgzffs_column + " = ''," + gysmc_column + " = ''," +lhh_column + " = ''," + khh_column + " = '', gysbm = '',skrkhh = '', "
					+ gysyhzh_column + " = ''," + dgzfje_column + " = '',"+ skr_column + " = '',"+ dszfje_column + " = '' ,skrlhh = '', skrzh = ''  where requestid = '"+requestid+"'";
			writeLog("差旅费，支付类别为不需支付，清空对公对私信息SQL：" + sql);
			rs.execute(sql);
		}
		
		return SUCCESS;
	}

}
