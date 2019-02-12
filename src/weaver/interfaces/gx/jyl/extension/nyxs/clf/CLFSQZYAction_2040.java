package weaver.interfaces.gx.jyl.extension.nyxs.clf;

import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY;
import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY_RETURN;
import net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_CLFBXZYModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.Map;

public class CLFSQZYAction_2040 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		String tablename = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("差旅费报销占用接口退回操作，不执行接口.");
			return SUCCESS;
		}
		// 公司代码-值
		String gsdm_value = "";
		// 公司代码-字段
		String gsdm_column = "gsdm";
		// 成本中心-值
		String cbzx_value = "";
		// 成本中心-字段
		String cbzx_column = "fycdbm";
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
		// 对私支付金额-值
		String dszfje_value = "";
		// 对私支付金额-字段
		String dszfje_column = "dszfje";
		// 对公支付金额-值
		String dgzfje_value = "";
		// 对公支付金额-字段
		String dgzfje_column = "dgzfje";
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
		// 报销方式-值
		String sfcxjk_value = "";
		// 报销方式-字段
		String sfcxjk_column = "bxfs";
		// 实报金额-值
		String sbje_value = "";
		// 实报金额-字段
		String sbje_column = "sbje";
		// 报销方式-值
		String bxfs_value = "";
		// 报销方式-字段
		String bxfs_column = "sfcjk";
		// 支付类别
		String zflb_value = "";
		String zflb_column = "zflb";

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
			if (name.equals(dszfje_column)) {
				dszfje_value = value;
			}
			if (name.equals(dgzfje_column)) {
				dgzfje_value = value;
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
			if (name.equals(sfcxjk_column)) {
				sfcxjk_value = value;
			}
			if (name.equals(sbje_column)) {
				sbje_value = value;
			}
			if (name.equals(bxfs_column)) {
				bxfs_value = value;
			}
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
		}
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("成本中心：" + cbzx_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("预算码：" + ysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("对私支付金额：" + dszfje_value);
		writeLog("对公支付金额：" + dgzfje_value);
		writeLog("是否冲销借款:" + sfcxjk_value);
		writeLog("实报金额:" + sbje_value);
		writeLog("报销方式:" + bxfs_value);
		writeLog("系统字段:" + xtzd_value);
		writeLog("支付类别：" + zflb_value);

		if (("1".equals(bxfs_value)) || ("0".equals(bxfs_value) && Double.parseDouble(sbje_value) > 0)) {
			if (zflb_value.equals("1")) {// 对私
				String xmlstring = "";
				JTFYBX_CLFBXZYModel model = new JTFYBX_CLFBXZYModel(gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value,
						dszfje_value, ysm_value, zy_value, "");
				try {
					xmlstring = XMLUtil.beanToXml(model, JTFYBX_CLFBXZYModel.class);
				} catch (JAXBException e1) {
					e1.printStackTrace();
				}

				writeLog("差旅费报销占用（对私）传入xml参数：" + xmlstring);

				SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
				DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY = new DT_1030_ALL2ERP_ZJYSZY();
				DT_1030_ALL2ERP_ZJYSZY.setOUTPUT(xmlstring);
				DT_1030_ALL2ERP_ZJYSZY.setSYSTEM(xtzd_value);
				DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN = null;
				try {
					DT_1030_ALL2ERP_ZJYSZY_RETURN = proxy.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY);
					String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN.getINPUT();
					writeLog("差旅费报销占用（对私）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("ZJPZH");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if (!"E".equalsIgnoreCase(type)) {
							updateJTCLFFYBXZYDS(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对私）失败：TYPE：" + type + " code："
									+ code + " zjpzh：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对私）接口异常：" + e);
					return SUCCESS;
				}
			}
			if (zflb_value.equals("2") || zflb_value.equals("4")) {// 对公
				String xmlstring = "";
				JTFYBX_CLFBXZYModel model = new JTFYBX_CLFBXZYModel(gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value,
						dgzfje_value, ysm_value, zy_value, "");
				try {
					xmlstring = XMLUtil.beanToXml(model, JTFYBX_CLFBXZYModel.class);
				} catch (JAXBException e1) {
					e1.printStackTrace();
				}

				writeLog("差旅费报销占用（对公）传入xml参数：" + xmlstring);

				SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
				DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY = new DT_1030_ALL2ERP_ZJYSZY();
				DT_1030_ALL2ERP_ZJYSZY.setOUTPUT(xmlstring);
				DT_1030_ALL2ERP_ZJYSZY.setSYSTEM(xtzd_value);
				DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN = null;
				try {
					DT_1030_ALL2ERP_ZJYSZY_RETURN = proxy.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY);
					String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN.getINPUT();
					writeLog("差旅费报销占用（对公）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("ZJPZH");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if (!"E".equalsIgnoreCase(type)) {
							updateJTCLFFYBXZYDG(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对公）失败：TYPE：" + type + " code："
									+ code + " zjpzh：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对公）接口异常：" + e);
					return SUCCESS;
				}
			}
			if (zflb_value.equals("0")) {// 对私 对公
				String xmlstring = "";
				JTFYBX_CLFBXZYModel model = new JTFYBX_CLFBXZYModel(gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value,
						dszfje_value, ysm_value, zy_value, "");
				try {
					xmlstring = XMLUtil.beanToXml(model, JTFYBX_CLFBXZYModel.class);
				} catch (JAXBException e1) {
					e1.printStackTrace();
				}

				writeLog("差旅费报销占用（对私）传入xml参数：" + xmlstring);

				SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
				DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY = new DT_1030_ALL2ERP_ZJYSZY();
				DT_1030_ALL2ERP_ZJYSZY.setOUTPUT(xmlstring);
				DT_1030_ALL2ERP_ZJYSZY.setSYSTEM(xtzd_value);
				DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN = null;
				try {
					DT_1030_ALL2ERP_ZJYSZY_RETURN = proxy.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY);
					String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN.getINPUT();
					writeLog("差旅费报销占用（对私）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("ZJPZH");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if (!"E".equalsIgnoreCase(type)) {
							updateJTCLFFYBXZYDS(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对私）失败：TYPE：" + type + " code："
									+ code + " zjpzh：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对私）接口异常：" + e);
					return SUCCESS;
				}

				String xmlstring1 = "";
				JTFYBX_CLFBXZYModel model1 = new JTFYBX_CLFBXZYModel(gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value,
						dgzfje_value, ysm_value, zy_value, "");
				try {
					xmlstring1 = XMLUtil.beanToXml(model1, JTFYBX_CLFBXZYModel.class);
				} catch (JAXBException e1) {
					e1.printStackTrace();
				}

				writeLog("差旅费报销占用（对公）传入xml参数：" + xmlstring1);

				SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy1 = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
				DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY1 = new DT_1030_ALL2ERP_ZJYSZY();
				DT_1030_ALL2ERP_ZJYSZY1.setOUTPUT(xmlstring1);
				DT_1030_ALL2ERP_ZJYSZY1.setSYSTEM(xtzd_value);
				DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN1 = null;
				try {
					DT_1030_ALL2ERP_ZJYSZY_RETURN1 = proxy1.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY1);
					String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN1.getINPUT();
					writeLog("差旅费报销占用（对公）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("ZJPZH");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if (!"E".equalsIgnoreCase(type)) {
							updateJTCLFFYBXZYDG(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对公）失败：TYPE：" + type + " code："
									+ code + " zjpzh：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费报销占用（对公）接口异常：" + e);
					return SUCCESS;
				}

			}
		}
		return SUCCESS;
	}

	public void updateJTCLFFYBXZYDS(String tablename,String requestid,
									String type,
									String code,
									String message,String no,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}

	public void updateJTCLFFYBXZYDG(String tablename, String requestid,
									String type,
									String code,
									String message,String no,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set fzjpzh1 = '"+no+"', fcode1 = '"+code+"', fmessage1 = '"+message+"',ftype1 = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
