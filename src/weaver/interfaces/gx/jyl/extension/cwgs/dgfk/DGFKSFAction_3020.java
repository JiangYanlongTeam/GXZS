package weaver.interfaces.gx.jyl.extension.cwgs.dgfk;

import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF;
import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF_RETURN;
import net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.DGFKSFMode;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.Map;

public class DGFKSFAction_3020 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String tablename = request.getRequestManager().getBillTableName();
		// 公司代码-值
		String gsdm_value = "";
		// 公司代码-字段
		String gsdm_column = "gsdm";
		// 资金凭证编号（对私）-值
		String zjpzbh_value = "";
		// 资金凭证编号（对私）-字段
		String zjpzbh_column = "fzjpzh";
		// 系统字段-值
		String xtzd_value = "";
		// 系统字段-字段
		String xtzd_column = "xtzd";
		// 对私支付金额-值
		String dszfje_value = "";
		// 对私支付金额-字段
		String dszfje_column = "zfje";

		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(gsdm_column)) {
				gsdm_value = value;
			}
			if (name.equals(zjpzbh_column)) {
				zjpzbh_value = value;
			}
			if (name.equals(xtzd_column)) {
				xtzd_value = value;
			}
			if (name.equals(dszfje_column)) {
				dszfje_value = value;
			}
		}
		writeLog("系统字段：" + xtzd_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("资金凭证编号：" + zjpzbh_value);
		writeLog("对私支付金额：" + dszfje_value);

		String xmlstring = "";
		DGFKSFMode model = new DGFKSFMode(gsdm_value, zjpzbh_value, "Y", dszfje_value);
		try {
			xmlstring = XMLUtil.beanToXml(model, DGFKSFMode.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		writeLog("对公付款传入xml参数：" + xmlstring);

		SI_1029_ALL2ERP_ZJYSSF_OUTProxy proxy = new SI_1029_ALL2ERP_ZJYSSF_OUTProxy();
		DT_1029_ALL2ERP_ZJYSSF DT_1029_ALL2ERP_ZJYSSF = new DT_1029_ALL2ERP_ZJYSSF();
		DT_1029_ALL2ERP_ZJYSSF.setOUTPUT(xmlstring);
		DT_1029_ALL2ERP_ZJYSSF.setSYSTEM(xtzd_value);
		DT_1029_ALL2ERP_ZJYSSF_RETURN DT_1029_ALL2ERP_ZJYSSF_RETURN = null;
		try {
			DT_1029_ALL2ERP_ZJYSSF_RETURN = proxy.SI_1029_ALL2ERP_ZJYSSF_OUT(DT_1029_ALL2ERP_ZJYSSF);
			String returnmessage = DT_1029_ALL2ERP_ZJYSSF_RETURN.getINPUT();
			writeLog("对公付款返回消息：" + returnmessage);
			Map<String, String> map = publicmethod.readXMLForSF(returnmessage);
			if (null != map && !map.isEmpty()) {
				String type = (String) map.get("TYPE");
				String code = (String) map.get("CODE");
				String message = (String) map.get("MESSAGE");
				if (!"E".equalsIgnoreCase(type)) {
					updateJTCLFBXSFDS(tablename,requestid, type, code, message, "GFGS_CLFYBX");
				} else {
					setFailMessage(request, "failed",
							"对公付款失败：TYPE：" + type + " code：" + code + " message：" + message);
					return SUCCESS;
				}
			}
		} catch (RemoteException e) {
			setFailMessage(request, "failed", "对公付款接口异常：" + e);
			return SUCCESS;
		}
		return SUCCESS;
	}

	/**
	 * 更新对公付款-释放信息
	 * 
	 * @param requestid
	 * @param type
	 * @param code
	 * @param message
	 */
	public void updateJTCLFBXSFDS(String tablename ,String requestid, String type, String code, String message, String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set scode = '" + code + "', smessage = '" + message + "',stype = '"
				+ type + "' where requestid = '" + requestid + "'";
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
