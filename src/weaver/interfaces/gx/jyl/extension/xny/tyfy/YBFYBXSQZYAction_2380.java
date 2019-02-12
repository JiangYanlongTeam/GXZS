package weaver.interfaces.gx.jyl.extension.xny.tyfy;

import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY;
import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY_RETURN;
import net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JSTZGL_YBFYBXSQZYModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.Map;

public class YBFYBXSQZYAction_2380 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		String tablename = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("一般费用报销占用接口退回操作，不执行接口.");
			return SUCCESS;
		}
		// 公司代码-值
		String gsdm_value = "";
		// 公司代码-字段
		String gsdm_column = "gsdm";
		// 成本中心-值
		String cbzx_value = "";
		// 成本中心-字段
		String cbzx_column = "cbzx";
		// 财年-值
		String cn_value = "";
		// 财年-字段
		String cn_column = "cn";
		// 会计期间-值
		String kjqj_value = "";
		// 会计期间-字段
		String kjqj_column = "kjqj";
		// 原始申请单号-值
		String yssqh_value = "";
		// 原始申请单号-字段
		String yssqh_column = "sqbh";
		// 申请金额-值
		String sqje_value = "";
		// 申请金额-字段
		String sqje_column = "sbje";
		// 预算码-值
		String ysm_value = "";
		// 预算码-字段
		String ysm_column = "zjysm";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "bxsy";
		// 系统字段-值
		String xtzd_value = "";
		// 系统字段-字段
		String xtzd_column = "sysid";
		// 实报金额-值
		String sbje_value = "";
		// 实报金额-字段
		String sbje_column = "sbje";
		// 报销方式-值
		String bxfs_value = "";
		// 报销方式-字段
		String bxfs_column = "bxfs";

		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(gsdm_column)) {
				gsdm_value = value;
			}
			if (name.equals(cn_column)) {
				cn_value = value;
			}
			if (name.equals(kjqj_column)) {
				kjqj_value = value;
			}
			if (name.equals(cbzx_column)) {
				cbzx_value = value;
			}
			if (name.equals(yssqh_column)) {
				yssqh_value = value;
			}
			if (name.equals(sqje_column)) {
				sqje_value = value;
			}
			if (name.equals(ysm_column)) {
				ysm_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(xtzd_column)) {
				xtzd_value = value;
			}
			if (name.equals(sbje_column)) {
				sbje_value = value;
			}
			if (name.equals(bxfs_column)) {
				bxfs_value = value;
			}
		}
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("成本中心：" + cbzx_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("预算码：" + ysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("申请金额：" + sqje_value);
		writeLog("实报金额:" + sbje_value);
		writeLog("报销方式:" + bxfs_value);
		writeLog("系统字段:" + xtzd_value);

		if (("2".equals(bxfs_value)) || ("0".equals(bxfs_value) && Double.parseDouble(sbje_value) > 0)) {
			String xmlstring = "";
			JSTZGL_YBFYBXSQZYModel model = new JSTZGL_YBFYBXSQZYModel(gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value,
					sqje_value, ysm_value, zy_value, "");
			try {
				xmlstring = XMLUtil.beanToXml(model, JSTZGL_YBFYBXSQZYModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			writeLog("一般费用报销占用传入xml参数：" + xmlstring);

			SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
			DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY = new DT_1030_ALL2ERP_ZJYSZY();
			DT_1030_ALL2ERP_ZJYSZY.setOUTPUT(xmlstring);
			DT_1030_ALL2ERP_ZJYSZY.setSYSTEM(xtzd_value);
			DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN = null;
			try {
				DT_1030_ALL2ERP_ZJYSZY_RETURN = proxy.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY);
				String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN.getINPUT();
				writeLog("一般费用报销占用返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String no = (String) map.get("ZJPZH");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if (!"E".equalsIgnoreCase(type)) {
						updateHJTYBFYBXZY(tablename,requestid, type, code, message, no,"JTFYBX_YBFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed", "一般费用报销占用失败：TYPE：" + type + " code：" + code
								+ " zjpzh：" + no + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销占用接口异常：" + e);
				return SUCCESS;
			}
		}
		return SUCCESS;
	}

	/**
	 * 更新集团一般费用报销占用
	 *
	 * @param requestid
	 * @param type
	 * @param code
	 * @param message
	 */
	public void updateHJTYBFYBXZY(String tablename , String requestid,
								  String type,
								  String code,
								  String message,String no,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
