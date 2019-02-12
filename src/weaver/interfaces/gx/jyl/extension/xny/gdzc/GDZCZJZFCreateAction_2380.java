package weaver.interfaces.gx.jyl.extension.xny.gdzc;

import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ;
import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN;
import net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTCLFBXZJZFGDZCCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTCLFBXZJZFGFZCCreate_HeadModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.GYSINFO;
import weaver.interfaces.gx.jyl.util.ECUtil;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GDZCZJZFCreateAction_2380 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();
	DecimalFormat df = new DecimalFormat("######0.00");

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String tablename = request.getRequestManager().getBillTableName();
		int formid = request.getRequestManager().getFormid();
		String src = request.getRequestManager().getSrc();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("固定资产生成资金支付单退回操作，不执行接口.");
			return SUCCESS;
		}

		Map<String, Object> requestDataMap = ECUtil.getrequestdatamap(requestid, formid);
		Map<String, String> mainDataMap = (Map<String, String>) requestDataMap.get("maindatamap");
		List<Map<String, String>> dt1List = (List<Map<String, String>>) requestDataMap.get("dt1");

		String id_value = Util.null2String(mainDataMap.get("id"));
		// 单据类型-值
		String djlx_value = Util.null2String(mainDataMap.get("djlx"));
		// 公司代码-值
		String gsdm_value = Util.null2String(mainDataMap.get("gsdm"));
		// 财年-值
		String cn_value = Util.null2String(mainDataMap.get("cn"));
		// 会计期间-值
		String kjqj_value = Util.null2String(mainDataMap.get("kjqj"));
		// 原始申请单号-值
		String yssqh_value = Util.null2String(mainDataMap.get("sqdh"));
		// 付款类型-值
		String fklx_value = Util.null2String(mainDataMap.get("fklx"));
		// 申请日期-值
		String sqrq_value = Util.null2String(mainDataMap.get("sqrq"));
		if (!"".equals(sqrq_value)) {
			sqrq_value = sqrq_value.replaceAll("-", "");
		}
		// 经办人-值
		String jbr_value = Util.null2String(mainDataMap.get("sqr"));
		try {
			jbr_value = new ResourceComInfo().getLastname(jbr_value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 货币码-值
		String hbm_value = Util.null2String(mainDataMap.get("hbm"));
		// 付款日期-值
		String fkrq_value = Util.null2String(mainDataMap.get("jhfkrq"));
		if (!"".equals(fkrq_value)) {
			fkrq_value = fkrq_value.replaceAll("-", "");
		}
		// 资金预算码-值
		String zjysm_value = Util.null2String(mainDataMap.get("zjysm"));
		// 摘要-值
		String zy_value = Util.null2String(mainDataMap.get("zy"));
		String fkflhh_value = Util.null2String(mainDataMap.get("fkflhh"));
		String fkfyhzh_value = Util.null2String(mainDataMap.get("fkfyhzh"));
		String qtyfkjtnb_value = Util.null2String(mainDataMap.get("qtyfkjtnb"));
		String qtyfkjtwb_value = Util.null2String(mainDataMap.get("qtyfkjtwb"));
		String xtzd_value = Util.null2String(mainDataMap.get("sysid"));
		String fjzs_value = Util.null2String(mainDataMap.get("zjzfdfjzs"));
		String zjzypzbh_value = Util.null2String(mainDataMap.get("fzjpzh"));

		writeLog("付款方帐号:" + fkflhh_value);
		writeLog("付款方银行帐号:" + fkfyhzh_value);
		writeLog("单据类型：" + djlx_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("付款类型：" + fklx_value);
		writeLog("申请日期：" + sqrq_value);
		writeLog("经办人：" + jbr_value);
		writeLog("货币码：" + hbm_value);
		writeLog("付款日期：" + fkrq_value);
		writeLog("资金预算码：" + zjysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("系统字段：" + xtzd_value);
		writeLog("附件张数：" + fjzs_value);

		Map<String, GYSINFO> gysMap = new HashMap<String, GYSINFO>();
		for (int i = 0; i < dt1List.size(); i++) {
			Map<String, String> map = dt1List.get(i);
			String gysbm_value = Util.null2String(map.get("liefe"));
			String gyskhh_value = Util.null2String(map.get("lhh")); // TODO 明细表1
			String gyskhzh_value = Util.null2String(map.get("gysyhzh")); // TODO 明细表1
			String zhz_value = Util.null2String(map.get("gyszhz")); // TODO 明细表1
			String gysmc_value = Util.null2String(map.get("gysmc")); // TODO 明细表1
			String cbzx_value = Util.null2String(map.get("kostl")); // TODO 明细表1
			String skfhm_value = Util.null2String(map.get("skfhm")); // TODO 明细表1
			Double NETWR_value = Double.parseDouble(Util.null2o(map.get("netwr")));
			String EBELN_val = Util.null2String(map.get("ebeln"));

			writeLog("供应商名称：" + gysbm_value);

			GYSINFO info = new GYSINFO();
			info.setGysmc_value(skfhm_value);
			info.setGyskhh_value(gyskhh_value);
			info.setGyskhzh_value(gyskhzh_value);
			info.setZhz_value(zhz_value);
			info.setGysbm_value(gysbm_value);
			info.setCbzx_value(cbzx_value);
			info.setNETWR_value(NETWR_value);
			info.setEbeln_value(EBELN_val);

			if (gysMap.containsKey(gysbm_value)) {
				GYSINFO in = gysMap.get(gysbm_value);
				Double tol = in.getNETWR_value() + NETWR_value;
				in.setNETWR_value(tol);
				gysMap.put(gysbm_value, in);
			} else {
				gysMap.put(gysbm_value, info);
			}
		}
		writeLog("gysMap:"+gysMap.toString());
		for (Entry<String, GYSINFO> entry : gysMap.entrySet()) {
			GYSINFO gysinfo = entry.getValue();
			writeLog("gysinfo:"+gysinfo.toString());
			String cbzx_value = gysinfo.getCbzx_value();
			String gysbm_value = gysinfo.getGysbm_value();
			String gyskhh_value = gysinfo.getGyskhh_value();
			String gyskhzh_value = gysinfo.getGyskhzh_value();
			String gysmc_value = gysinfo.getGysmc_value();
			Double cx = gysinfo.getNETWR_value();
			String zhz_value = gysinfo.getZhz_value();
			String ebeln_value = gysinfo.getEbeln_value();
			String xmlstring = "";
			String qt = "";
			if ("GX10".equals(zhz_value) || "GX11".equals(zhz_value)) {
				qt = qtyfkjtnb_value;
			} else {
				qt = qtyfkjtwb_value;
			}

			List<JTCLFBXZJZFGFZCCreate_HeadModel> hEAD = new ArrayList<JTCLFBXZJZFGFZCCreate_HeadModel>();
			JTCLFBXZJZFGFZCCreate_HeadModel model = new JTCLFBXZJZFGFZCCreate_HeadModel(djlx_value, gsdm_value, cn_value,
					kjqj_value, cbzx_value, zjzypzbh_value, yssqh_value, fklx_value, gysbm_value,ebeln_value, qt, sqrq_value,
					jbr_value, df.format(cx), hbm_value, fkrq_value, "T", gysmc_value, gyskhh_value, gyskhzh_value,
					zjysm_value, "(付款)" + zy_value, fjzs_value, fkfyhzh_value, fkflhh_value);
			hEAD.add(model);
			JTCLFBXZJZFGDZCCreateModel head = new JTCLFBXZJZFGDZCCreateModel(hEAD);
			try {
				xmlstring = XMLUtil.beanToXml(head, JTCLFBXZJZFGDZCCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
				setFailMessage(request, "failed", "转换为XML失败：" + e.getMessage());
				return SUCCESS;
			}

			writeLog("固定资产资金支付单傳入xml参数：" + xmlstring);
			SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
			DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
			DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
			DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
			DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
			try {
				DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
				String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
				writeLog("固定资产资金支付单返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String no = (String) map.get("APPLYNO");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if ("S".equalsIgnoreCase(type)) {
						updateJTCLFXBXZJZFDDG(tablename,id_value, type, code, message, no, "GFGS_CLFYBX", gysbm_value);
					} else {
						setFailMessage(request, "failed", "固定资产资金支付单失败：TYPE：" + type + " code：" + code
								+ " applyno：" + no + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				setFailMessage(request, "failed", "固定资产资金支付单接口异常：" + e);
				return SUCCESS;
			}
		}
		return SUCCESS;
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

	/**
	 * 更新对公付款资金支付单信息
	 * 
	 * @param requestid
	 * @param type
	 * @param code
	 * @param message
	 */
	public void updateJTCLFXBXZJZFDDG(String tablename,String requestid, String type, String code, String message, String no, String bs,
			String gysbm_value) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+"_dt1 set capplyno = '" + no + "', ccode = '" + code + "', cmessage = '"
				+ message + "',ctype = '" + type + "' where mainid = '" + requestid + "' and LIEFE = '" + gysbm_value
				+ "' ";
		rs.execute(sql);
	}

	public static void main(String[] args) {
		List<JTCLFBXZJZFGFZCCreate_HeadModel> hEAD = new ArrayList<JTCLFBXZJZFGFZCCreate_HeadModel>();
		JTCLFBXZJZFGFZCCreate_HeadModel model = new JTCLFBXZJZFGFZCCreate_HeadModel("", "", "",
				"", "", "", "", "", "","", "", "",
				"", "", "", "", "T", "", "", "",
				"", "(付款)" + "", "", "", "");
		hEAD.add(model);
		JTCLFBXZJZFGDZCCreateModel head = new JTCLFBXZJZFGDZCCreateModel(hEAD);
		try {
			String xmlstring = XMLUtil.beanToXml(head, JTCLFBXZJZFGDZCCreateModel.class);
			System.out.println(xmlstring);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
