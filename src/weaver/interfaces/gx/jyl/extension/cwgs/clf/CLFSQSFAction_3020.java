package weaver.interfaces.gx.jyl.extension.cwgs.clf;

import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF;
import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF_RETURN;
import net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_CLFSFModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.Map;

public class CLFSQSFAction_3020 extends BaseBean implements Action {

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
		// 资金凭证编号（对公）-值
		String zjpzbh1_value = "";
		// 资金凭证编号（对公）-字段
		String zjpzbh1_column = "fzjpzh1";
		// 系统字段-值
		String xtzd_value = "";
		// 系统字段-字段
		String xtzd_column = "sysid";
		// 支付类别
		String zflb_value = "";
		String zflb_column = "zflb";
		// 对私支付金额-值
		String dszfje_value = "";
		// 对私支付金额-字段
		String dszfje_column = "dszfje";
		// 对公支付金额-值
		String dgzfje_value = "";
		// 对公支付金额-字段
		String dgzfje_column = "dgzfje";

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
			if (name.equals(zjpzbh1_column)) {
				zjpzbh1_value = value;
			}
			if (name.equals(xtzd_column)) {
				xtzd_value = value;
			}
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
			if (name.equals(dszfje_column)) {
				dszfje_value = value;
			}
			if (name.equals(dgzfje_column)) {
				dgzfje_value = value;
			}
		}
		writeLog("系统字段：" + xtzd_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("资金凭证编号（对私）：" + zjpzbh_value);
		writeLog("资金凭证编号（对公）：" + zjpzbh1_value);
		writeLog("支付类别：" + zflb_value);
		writeLog("对私支付金额：" + dszfje_value);
		writeLog("对公支付金额：" + dgzfje_value);

		if (zflb_value.equals("1")) {// 对私
			String xmlstring = "";
			JTFYBX_CLFSFModel model = new JTFYBX_CLFSFModel(gsdm_value, zjpzbh_value, "Y", dszfje_value);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTFYBX_CLFSFModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			writeLog("差旅费报销释放（对私）传入xml参数：" + xmlstring);

			SI_1029_ALL2ERP_ZJYSSF_OUTProxy proxy = new SI_1029_ALL2ERP_ZJYSSF_OUTProxy();
			DT_1029_ALL2ERP_ZJYSSF DT_1029_ALL2ERP_ZJYSSF = new DT_1029_ALL2ERP_ZJYSSF();
			DT_1029_ALL2ERP_ZJYSSF.setOUTPUT(xmlstring);
			DT_1029_ALL2ERP_ZJYSSF.setSYSTEM(xtzd_value);
			DT_1029_ALL2ERP_ZJYSSF_RETURN DT_1029_ALL2ERP_ZJYSSF_RETURN = null;
			try {
				DT_1029_ALL2ERP_ZJYSSF_RETURN = proxy.SI_1029_ALL2ERP_ZJYSSF_OUT(DT_1029_ALL2ERP_ZJYSSF);
				String returnmessage = DT_1029_ALL2ERP_ZJYSSF_RETURN.getINPUT();
				writeLog("差旅费报销释放（对私）返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForSF(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if (!"E".equalsIgnoreCase(type)) {
						updateJTCLFBXSFDS(tablename,requestid, type, code, message, "JTFYBX_CLFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed",
								"差旅费报销释放（对私）失败：TYPE：" + type + " code：" + code + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销释放（对私）接口异常：" + e);
				return SUCCESS;
			}
		}
		if (zflb_value.equals("2") || zflb_value.equals("4")) {// 对公
			String xmlstring = "";
			JTFYBX_CLFSFModel model = new JTFYBX_CLFSFModel(gsdm_value, zjpzbh1_value, "Y", dgzfje_value);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTFYBX_CLFSFModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			writeLog("差旅费报销释放（对公）传入xml参数：" + xmlstring);

			SI_1029_ALL2ERP_ZJYSSF_OUTProxy proxy = new SI_1029_ALL2ERP_ZJYSSF_OUTProxy();
			DT_1029_ALL2ERP_ZJYSSF DT_1029_ALL2ERP_ZJYSSF = new DT_1029_ALL2ERP_ZJYSSF();
			DT_1029_ALL2ERP_ZJYSSF.setOUTPUT(xmlstring);
			DT_1029_ALL2ERP_ZJYSSF.setSYSTEM(xtzd_value);
			DT_1029_ALL2ERP_ZJYSSF_RETURN DT_1029_ALL2ERP_ZJYSSF_RETURN = null;
			try {
				DT_1029_ALL2ERP_ZJYSSF_RETURN = proxy.SI_1029_ALL2ERP_ZJYSSF_OUT(DT_1029_ALL2ERP_ZJYSSF);
				String returnmessage = DT_1029_ALL2ERP_ZJYSSF_RETURN.getINPUT();
				writeLog("差旅费报销释放（对公）返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForSF(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if (!"E".equalsIgnoreCase(type)) {
						updateJTCLFBXSFDG(tablename,requestid, type, code, message, "JTFYBX_CLFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed",
								"差旅费报销释放（对公）失败：TYPE：" + type + " code：" + code + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销释放（对公）接口异常：" + e);
				return SUCCESS;
			}
		}
		if (zflb_value.equals("0")) {// 对私 对公
			String xmlstring = "";
			JTFYBX_CLFSFModel model = new JTFYBX_CLFSFModel(gsdm_value, zjpzbh_value, "Y", dszfje_value);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTFYBX_CLFSFModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			writeLog("差旅费报销释放（对私）传入xml参数：" + xmlstring);

			SI_1029_ALL2ERP_ZJYSSF_OUTProxy proxy = new SI_1029_ALL2ERP_ZJYSSF_OUTProxy();
			DT_1029_ALL2ERP_ZJYSSF DT_1029_ALL2ERP_ZJYSSF = new DT_1029_ALL2ERP_ZJYSSF();
			DT_1029_ALL2ERP_ZJYSSF.setOUTPUT(xmlstring);
			DT_1029_ALL2ERP_ZJYSSF.setSYSTEM(xtzd_value);
			DT_1029_ALL2ERP_ZJYSSF_RETURN DT_1029_ALL2ERP_ZJYSSF_RETURN = null;
			try {
				DT_1029_ALL2ERP_ZJYSSF_RETURN = proxy.SI_1029_ALL2ERP_ZJYSSF_OUT(DT_1029_ALL2ERP_ZJYSSF);
				String returnmessage = DT_1029_ALL2ERP_ZJYSSF_RETURN.getINPUT();
				writeLog("差旅费报销释放（对私）返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForSF(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if (!"E".equalsIgnoreCase(type)) {
						updateJTCLFBXSFDS(tablename,requestid, type, code, message, "JTFYBX_CLFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed",
								"差旅费报销释放（对私）失败：TYPE：" + type + " code：" + code + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销释放（对私）接口异常：" + e);
				return SUCCESS;
			}

			String xmlstring1 = "";
			JTFYBX_CLFSFModel model1 = new JTFYBX_CLFSFModel(gsdm_value, zjpzbh1_value, "Y", dgzfje_value);
			try {
				xmlstring1 = XMLUtil.beanToXml(model1, JTFYBX_CLFSFModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			writeLog("差旅费报销释放（对公）传入xml参数：" + xmlstring1);

			SI_1029_ALL2ERP_ZJYSSF_OUTProxy proxy1 = new SI_1029_ALL2ERP_ZJYSSF_OUTProxy();
			DT_1029_ALL2ERP_ZJYSSF DT_1029_ALL2ERP_ZJYSSF1 = new DT_1029_ALL2ERP_ZJYSSF();
			DT_1029_ALL2ERP_ZJYSSF1.setOUTPUT(xmlstring1);
			DT_1029_ALL2ERP_ZJYSSF1.setSYSTEM(xtzd_value);
			DT_1029_ALL2ERP_ZJYSSF_RETURN DT_1029_ALL2ERP_ZJYSSF_RETURN1 = null;
			try {
				DT_1029_ALL2ERP_ZJYSSF_RETURN1 = proxy1.SI_1029_ALL2ERP_ZJYSSF_OUT(DT_1029_ALL2ERP_ZJYSSF1);
				String returnmessage = DT_1029_ALL2ERP_ZJYSSF_RETURN1.getINPUT();
				writeLog("差旅费报销释放（对公）返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForSF(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if (!"E".equalsIgnoreCase(type)) {
						updateJTCLFBXSFDG(tablename,requestid, type, code, message, "JTFYBX_CLFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed",
								"差旅费报销释放（对公）失败：TYPE：" + type + " code：" + code + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销释放（对公）接口异常：" + e);
				return SUCCESS;
			}
		}
		return SUCCESS;
	}

	public void updateJTCLFBXSFDS(String tablename, String requestid,
								  String type,
								  String code,
								  String message,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}

	public void updateJTCLFBXSFDG(String tablename, String requestid,
								  String type,
								  String code,
								  String message,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set scode1 = '"+code+"', smessage1 = '"+message+"',stype1 = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
