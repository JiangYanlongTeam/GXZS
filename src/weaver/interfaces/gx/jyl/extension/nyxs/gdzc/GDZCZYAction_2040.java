package weaver.interfaces.gx.jyl.extension.nyxs.gdzc;

import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY;
import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY_RETURN;
import net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.GDZCZYMode;
import weaver.interfaces.gx.jyl.util.ECUtil;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class GDZCZYAction_2040 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();
	DecimalFormat df = new DecimalFormat("######0.00");

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		int formid = request.getRequestManager().getFormid();
		String tablename = request.getRequestManager().getBillTableName();
		String src = request.getRequestManager().getSrc();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("固定资产占用退回，不执行接口.");
			return SUCCESS;
		}
		Map<String, Object> requestDataMap = ECUtil.getrequestdatamap(requestid, formid);
		Map<String, String> mainDataMap = (Map<String, String>) requestDataMap.get("maindatamap");
		List<Map<String, String>> dt1List = (List<Map<String, String>>) requestDataMap.get("dt1");

		// 公司代码-值
		String gsdm_value = Util.null2String(mainDataMap.get("gsdm"));
		// 财年-值
		String cn_value = Util.null2String(mainDataMap.get("cn"));
		// 会计期间-值
		String kjqj_value = Util.null2String(mainDataMap.get("kjqj"));
		// 原始申请单号-值
		String yssqh_value = Util.null2String(mainDataMap.get("sqdh"));
		// 资金预算码-值
		String zjysm_value = Util.null2String(mainDataMap.get("zjysm"));
		// 摘要-值
		String zy_value = Util.null2String(mainDataMap.get("zy"));
		String xtzd_value = Util.null2String(mainDataMap.get("sysid"));
		String cbzx_value = dt1List.get(0).get("kostl");
		Double jetotal = 0d;
		for(int i = 0; i < dt1List.size(); i++) {
			jetotal += Double.parseDouble(Util.null2o(dt1List.get(i).get("netwr")));
		}
		String jet = df.format(jetotal);

		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("预算码：" + zjysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("系统字段:" + xtzd_value);
		writeLog("成本中心:" + cbzx_value);

		String xmlstring = "";
		GDZCZYMode model = new GDZCZYMode(gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value, jet,
				zjysm_value, zy_value, "");
		try {
			xmlstring = XMLUtil.beanToXml(model, GDZCZYMode.class);
		} catch (JAXBException e1) {
			e1.printStackTrace();
		}
		writeLog("固定资产资金占用传入xml参数：" + xmlstring);
		SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
		DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY = new DT_1030_ALL2ERP_ZJYSZY();
		DT_1030_ALL2ERP_ZJYSZY.setOUTPUT(xmlstring);
		DT_1030_ALL2ERP_ZJYSZY.setSYSTEM(xtzd_value);
		DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN = null;
		try {
			DT_1030_ALL2ERP_ZJYSZY_RETURN = proxy.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY);
			String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN.getINPUT();
			writeLog("固定资产资金占用返回消息：" + returnmessage);
			Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
			if (null != map && !map.isEmpty()) {
				String type = (String) map.get("TYPE");
				String no = (String) map.get("ZJPZH");
				String code = (String) map.get("CODE");
				String message = (String) map.get("MESSAGE");
				if (!"E".equalsIgnoreCase(type)) {
					updateJTCLFFYBXZYDS(tablename,requestid, type, code, message, no, "");
				} else {
					setFailMessage(request, "failed",
							"固定资产资金占用失败：TYPE：" + type + " code：" + code + " zjpzh：" + no + " message：" + message);
					return SUCCESS;
				}
			}
		} catch (RemoteException e) {
			setFailMessage(request, "failed", "固定资产资金占用接口异常：" + e);
			return SUCCESS;
		}

		return SUCCESS;
	}

	/**
	 * 更新对公付款信息
	 * 
	 * @param requestid
	 * @param type
	 * @param code
	 * @param message
	 */
	public void updateJTCLFFYBXZYDS(String tablename, String requestid, String type, String code, String message, String no, String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set fzjpzh = '" + no + "', fcode = '" + code + "', fmessage = '"
				+ message + "',ftype = '" + type + "' where requestid = '" + requestid + "'";
		rs.execute(sql);
	}

	/**
	 * 设置失败消息
	 * 
	 * @param request
	 * @param failedid
	 * @param failedmessage
	 */
	public void setFailMessage(RequestInfo request, String failedid, String failedmessage) {
		request.getRequestManager().setMessageid(failedid);
		request.getRequestManager().setMessagecontent(failedmessage);
	}
}
