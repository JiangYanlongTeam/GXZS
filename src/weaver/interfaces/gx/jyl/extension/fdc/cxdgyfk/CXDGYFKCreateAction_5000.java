package weaver.interfaces.gx.jyl.extension.fdc.cxdgyfk;

import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ;
import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ_RETURN;
import net.jsgx.www.E1D.service.SI_1072_ALL2ERP_KJPZ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTCLFBXCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTCLFBXCreate_HeadModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTCLFBXCreate_ItemModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CXDGYFKCreateAction_5000 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();
	DecimalFormat df = new DecimalFormat("######0.00");

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String workflowid = request.getWorkflowid();
		String src = request.getRequestManager().getSrc();
		String tablename = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("冲销对公预付款创建凭证退回操作，不执行接口.");
			return SUCCESS;
		}
		// 凭证类型-值
		String pzlx_value = "";
		// 凭证类型-字段
		String pzlx_column = "pzlx";
		// 参考凭证编号-值
		String ckpzbh_value = "";
		// 参考凭证编号-字段
		String ckpzbh_column = "sqbh";
		// 公司代码-值
		String gsdm_value = "";
		// 公司代码-字段
		String gsdm_column = "gsdm";
		// 凭证日期-值
		String pzrq_value = "";
		// 凭证日期-字段
		String pzrq_column = "pzrq";
		// 过账日期-值
		String gzrq_value = "";
		// 过账日期-字段
		String gzrq_column = "gzrq";
		// SYSID-值
		String sysid_value = "";
		// SYSID-字段
		String sysid_column = "xtzd";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "zy";
		// 货币吗
		String hbm_column = "hbm";
		String hbm_value = "";
		// 制单人-值
		String pzzdr_value = "";
		// 制单人-字段
		String pzzdr_column = "pzcjr";
		// 供应商账户组-值
		String gyszhz_value = "";
		// 供应商账户组-字段
		String gyszhz_column = "gyszhz";
		// 其他应付款-集团供应商内部往来-值
		String qtyfkjtnb_value = "";
		// 其他应付款-集团供应商内部往来-字段
		String qtyfkjtnb_column = "qtyfkjtnb";
		// 其他应付款-集团供应商外部往来-值
		String qtyfkjtwb_value = "";
		// 其他应付款-集团供应商外部往来-字段
		String qtyfkjtwb_column = "qtyfkjtwb";
		// 供应商编码-值
		String gysbm_value = "";
		// 供应商编码-字段
		String gysbm_colum = "gysbm";
		// 附件张数-值
		String fjzs_value = "";
		// 附件张数-字段
		String fjzs_column = "fjzs";
		// 发票金额-值
		String fpje_value = "";
		// 发票金额-字段
		String fpje_column = "fpje";
		// 冲销金额-值
		String cxje_value = "";
		// 冲销金额-字段
		String cxje_column = "cxje";
		// 退款金额-值
		String tkje_value = "";
		// 退款金额-字段
		String tkje_column = "tkje";
		// 成本中心-值
		String cbzx_value = "";
		// 成本中心-字段
		String cbzx_column = "cbzx";
		// 预付账款-其他
		String yfzkqt_column = "yfzkqt";
		String yfzkqt_value = "";
		// 银行存款
		String yhck_column = "yhck";
		String yhck_value = "";
		// 管理费用-其他
		String glfyqt_column = "glfyqt";
		String glfyqt_value = "";
		String ysm_column = "ysm";
		String ysm_value = "";

		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(pzlx_column)) {
				pzlx_value = value;
			}
			if (name.equals(ckpzbh_column)) {
				ckpzbh_value = value;
			}
			if (name.equals(gsdm_column)) {
				gsdm_value = value;
			}
			if (name.equals(pzrq_column)) {
				pzrq_value = value.replaceAll("-", "");
			}
			if (name.equals(gzrq_column)) {
				gzrq_value = value.replaceAll("-", "");
			}
			if (name.equals(sysid_column)) {
				sysid_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(hbm_column)) {
				hbm_value = value;
			}
			if (name.equals(pzzdr_column)) {
				try {
					pzzdr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(gyszhz_column)) {
				gyszhz_value = value;
			}
			if (name.equals(qtyfkjtnb_column)) {
				qtyfkjtnb_value = value;
			}
			if (name.equals(qtyfkjtwb_column)) {
				qtyfkjtwb_value = value;
			}
			if (name.equals(gysbm_colum)) {
				gysbm_value = value;
			}
			if (name.equals(fjzs_column)) {
				fjzs_value = value;
			}
			if (name.equals(fpje_column)) {
				fpje_value = Util.null2o(value);
			}
			if (name.equals(cxje_column)) {
				cxje_value = Util.null2o(value);
			}
			if (name.equals(tkje_column)) {
				tkje_value = Util.null2o(value);
			}
			if (name.equals(cbzx_column)) {
				cbzx_value = value;
			}
			if (name.equals(yfzkqt_column)) {
				yfzkqt_value = value;
			}
			if (name.equals(yhck_column)) {
				yhck_value = value;
			}
			if (name.equals(glfyqt_column)) {
				glfyqt_value = value;
			}
			if (name.equals(ysm_column)) {
				ysm_value = value;
			}
		}
		writeLog("凭证类型:" + pzlx_value);
		writeLog("参考凭证编号:" + ckpzbh_value);
		writeLog("公司代码:" + gsdm_value);
		writeLog("凭证日期:" + pzrq_value);
		writeLog("过账日期:" + gzrq_value);
		writeLog("SYSID:" + sysid_value);
		writeLog("摘要:" + zy_value);
		writeLog("货币码:" + hbm_value);
		writeLog("凭证制单人:" + pzzdr_value);
		writeLog("供应商账户组:" + gyszhz_value);
		writeLog("其他应付款-集团供应商内部往来:" + qtyfkjtnb_value);
		writeLog("其他应付款-集团供应商外部往来:" + qtyfkjtwb_value);
		writeLog("供应商编码:" + gysbm_value);
		writeLog("附件张数:" + fjzs_value);
		writeLog("发票金额:" + fpje_value);
		writeLog("冲销金额:" + cxje_value);
		writeLog("退款金额:" + tkje_value);
		writeLog("成本中心:" + cbzx_value);
		writeLog("预付账款-其他:" + yfzkqt_value);
		writeLog("银行存款:" + yhck_value);
		writeLog("管理费用-其他:" + glfyqt_value);

		String headZY = ("(冲预付)" + zy_value);
		if (headZY.length() > 25) {
			headZY = headZY.substring(0, 25);
		}

		// 发票金额 = 冲销金额
		if (Double.parseDouble(fpje_value) == Double.parseDouble(cxje_value)) {
			String xmlstring = "";
			List<JTCLFBXCreate_HeadModel> headlist = new ArrayList<JTCLFBXCreate_HeadModel>();
			JTCLFBXCreate_HeadModel headermodel = new JTCLFBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value,
					gzrq_value, headZY, ckpzbh_value, hbm_value, "", pzzdr_value, "OA系统", fjzs_value);
			headlist.add(headermodel);
			List<JTCLFBXCreate_ItemModel> lines = new ArrayList<JTCLFBXCreate_ItemModel>();

			RecordSet rs = new RecordSet();
			String sql = "select b.yskm,b.jxskm,b.fpje,b.se,sfzp,b.sl from " + tablename + " a," + tablename
					+ "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "'";
			rs.execute(sql);
			while (rs.next()) {
				String yskm_value = Util.null2String(rs.getString("yskm"));
				String bxjes_value = Util.null2String(rs.getString("fpje"));
				String se_value = Util.null2String(rs.getString("se"));
				String jxskm_value = Util.null2String(rs.getString("jxskm"));
				String sfzp_value = Util.null2String(rs.getString("sfzp"));
				String sl_value = Util.null2String(rs.getString("sl"));
				double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);

				String AUFNR_VALUE = "";

				if ("0".equals(sfzp_value)) {
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm_value, "", "", sl_value,
							df.format(tol), "", "(冲预付)" + zy_value, "", ckpzbh_value, cbzx_value, AUFNR_VALUE, "", "");
					lines.add(line);

					JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("S", jxskm_value, "", "", sl_value,
							se_value, "", "(冲预付)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, "", "");
					lines.add(line2);
				} else {
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm_value, "", "", "",
							bxjes_value, "", "(冲预付)" + zy_value, "", ckpzbh_value, cbzx_value, AUFNR_VALUE, "", "");
					lines.add(line);
				}
			}

			String yfkdh = getDH(requestid,tablename,workflowid);
			JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", yfzkqt_value, gysbm_value, "", "",
					cxje_value, "", "(冲预付)" + zy_value, "", yfkdh, "", "", "", "");
			lines.add(line2);
			JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist, lines);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			writeLog("冲销对公预付款创建凭证传入xml参数：" + xmlstring);

			SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
			DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
			DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
			DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
			DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
			try {
				DT_1072_ALL2ERP_KJPZ_RETURN = proxy.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
				String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
				writeLog("冲销对公预付款创建凭证返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
				if (null != map && !map.isEmpty()) {
					String RET_ACCNO = (String) map.get("RET_ACCNO");
					String ZSTATU = (String) map.get("MTYPE");
					String MESSAGE = (String) map.get("MESSAGE");
					String pzacdocno = (String) map.get("pzacdocno");
					if ("S".equalsIgnoreCase(ZSTATU)) {
						updateJTYBFBXCJ(tablename,requestid, RET_ACCNO, ZSTATU, MESSAGE, pzacdocno, "GFGS_YBFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed", "冲销对公预付款创建凭证失败：RET_ACCNO：" + RET_ACCNO
								+ " ZSTATU：" + ZSTATU + " ZDESC：" + MESSAGE);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "冲销对公预付款创建凭证异常：" + e);
				return SUCCESS;
			}
		}

		// 发票金额 > 冲销金额
		if (Double.parseDouble(fpje_value) > Double.parseDouble(cxje_value)) {
			String xmlstring = "";
			List<JTCLFBXCreate_HeadModel> headlist = new ArrayList<JTCLFBXCreate_HeadModel>();
			JTCLFBXCreate_HeadModel headermodel = new JTCLFBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value,
					gzrq_value, headZY, ckpzbh_value, hbm_value, "", pzzdr_value, "OA系统", fjzs_value);
			headlist.add(headermodel);
			List<JTCLFBXCreate_ItemModel> lines = new ArrayList<JTCLFBXCreate_ItemModel>();

			RecordSet rs = new RecordSet();
			String sql = "select b.yskm,b.jxskm,b.fpje,b.se,sfzp,b.sl from " + tablename + " a," + tablename
					+ "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "'";
			rs.execute(sql);
			while (rs.next()) {
				String yskm_value = Util.null2String(rs.getString("yskm"));
				String bxjes_value = Util.null2String(rs.getString("fpje"));
				String se_value = Util.null2String(rs.getString("se"));
				String jxskm_value = Util.null2String(rs.getString("jxskm"));
				String sfzp_value = Util.null2String(rs.getString("sfzp"));
				String sl_value = Util.null2String(rs.getString("sl"));
				double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);

				String AUFNR_VALUE = "";

				if ("0".equals(sfzp_value)) {
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm_value, "", "", sl_value,
							df.format(tol), "", "(冲预付)" + zy_value, "", ckpzbh_value, cbzx_value, AUFNR_VALUE, "", "");
					lines.add(line);

					JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("S", jxskm_value, "", "", sl_value,
							se_value, "", "(冲预付)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, "", "");
					lines.add(line2);
				} else {
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm_value, "", "", "",
							bxjes_value, "", "(冲预付)" + zy_value, "", ckpzbh_value, cbzx_value, AUFNR_VALUE, "", "");
					lines.add(line);
				}
			}

			String cx = df.format(Double.parseDouble(fpje_value) - Double.parseDouble(cxje_value));

			String yfkdh = getDH(requestid,tablename,workflowid);
			JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", yfzkqt_value, gysbm_value, "", "",
					cxje_value, "", "(冲预付)" + zy_value, "", yfkdh, "", "", "", "");
			lines.add(line2);

			String gyszh = "";
			if ("GX10".equals(gyszhz_value) || "GX11".equals(gyszhz_value)) {
				gyszh = qtyfkjtnb_value;
			} else {
				gyszh = qtyfkjtwb_value;
			}

			JTCLFBXCreate_ItemModel line3 = new JTCLFBXCreate_ItemModel("H", gyszh, gysbm_value, "", "", cx, "",
					"(冲预付)" + zy_value, "", ckpzbh_value, "", "", "", "");
			lines.add(line3);
			JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist, lines);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			writeLog("冲销对公预付款创建凭证传入xml参数：" + xmlstring);

			SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
			DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
			DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
			DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
			DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
			try {
				DT_1072_ALL2ERP_KJPZ_RETURN = proxy.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
				String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
				writeLog("冲销对公预付款创建凭证返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
				if (null != map && !map.isEmpty()) {
					String RET_ACCNO = (String) map.get("RET_ACCNO");
					String ZSTATU = (String) map.get("MTYPE");
					String MESSAGE = (String) map.get("MESSAGE");
					String pzacdocno = (String) map.get("pzacdocno");
					if ("S".equalsIgnoreCase(ZSTATU)) {
						updateJTYBFBXCJ(tablename,requestid, RET_ACCNO, ZSTATU, MESSAGE, pzacdocno, "GFGS_YBFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed", "冲销对公预付款创建凭证失败：RET_ACCNO：" + RET_ACCNO
								+ " ZSTATU：" + ZSTATU + " ZDESC：" + MESSAGE);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "冲销对公预付款创建凭证异常：" + e);
				return SUCCESS;
			}
		}

		// 发票金额 < 冲销金额
		if (Double.parseDouble(fpje_value) < Double.parseDouble(cxje_value)) {
			String xmlstring = "";
			List<JTCLFBXCreate_HeadModel> headlist = new ArrayList<JTCLFBXCreate_HeadModel>();
			JTCLFBXCreate_HeadModel headermodel = new JTCLFBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value,
					gzrq_value, headZY, ckpzbh_value, hbm_value, "", pzzdr_value, "OA系统", fjzs_value);
			headlist.add(headermodel);
			List<JTCLFBXCreate_ItemModel> lines = new ArrayList<JTCLFBXCreate_ItemModel>();

			RecordSet rs = new RecordSet();
			String sql = "select b.yskm,b.jxskm,b.fpje,b.se,sfzp,b.sl from " + tablename + " a," + tablename
					+ "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "'";
			rs.execute(sql);
			while (rs.next()) {
				String yskm_value = Util.null2String(rs.getString("yskm"));
				String bxjes_value = Util.null2String(rs.getString("fpje"));
				String se_value = Util.null2String(rs.getString("se"));
				String jxskm_value = Util.null2String(rs.getString("jxskm"));
				String sfzp_value = Util.null2String(rs.getString("sfzp"));
				String sl_value = Util.null2String(rs.getString("sl"));
				double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);

				String AUFNR_VALUE = "";

				if ("0".equals(sfzp_value)) {
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm_value, "", "", sl_value,
							df.format(tol), "", "(冲预付)" + zy_value, "", ckpzbh_value, cbzx_value, AUFNR_VALUE, "", "");
					lines.add(line);

					JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("S", jxskm_value, "", "", sl_value,
							se_value, "", "(冲预付)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, "", "");
					lines.add(line2);
				} else {
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm_value, "", "", "",
							bxjes_value, "", "(冲预付)" + zy_value, "", ckpzbh_value, cbzx_value, AUFNR_VALUE, "", "");
					lines.add(line);
				}
			}

			Double cx = Double.parseDouble(cxje_value) - Double.parseDouble(fpje_value);
			
			JTCLFBXCreate_ItemModel line0 = new JTCLFBXCreate_ItemModel("S", yhck_value, "", "", "",
					df.format(cx), "", "(冲预付)" + zy_value, "", ckpzbh_value, cbzx_value, "", "", ysm_value);
			lines.add(line0);

			String yfkdh = getDH(requestid,tablename,workflowid);
			JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", yfzkqt_value, gysbm_value, "", "",
					cxje_value, "", "(冲预付)" + zy_value, "", yfkdh, "", "", "", "");
			lines.add(line2);

			JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist, lines);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			writeLog("冲销对公预付款创建凭证传入xml参数：" + xmlstring);

			SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
			DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
			DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
			DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
			DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
			try {
				DT_1072_ALL2ERP_KJPZ_RETURN = proxy.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
				String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
				writeLog("冲销对公预付款创建凭证返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
				if (null != map && !map.isEmpty()) {
					String RET_ACCNO = (String) map.get("RET_ACCNO");
					String ZSTATU = (String) map.get("MTYPE");
					String MESSAGE = (String) map.get("MESSAGE");
					String pzacdocno = (String) map.get("pzacdocno");
					if ("S".equalsIgnoreCase(ZSTATU)) {
						updateJTYBFBXCJ(tablename,requestid, RET_ACCNO, ZSTATU, MESSAGE, pzacdocno, "GFGS_YBFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed", "冲销对公预付款创建凭证失败：RET_ACCNO：" + RET_ACCNO
								+ " ZSTATU：" + ZSTATU + " ZDESC：" + MESSAGE);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "冲销对公预付款创建凭证异常：" + e);
				return SUCCESS;
			}
		}

		return SUCCESS;
	}

	public String getDH(String requestid, String tablename,String workflowid) {
		String dgyfktablename = getPropValue("fna_extension","dgykf_"+workflowid);
		RecordSet rs = new RecordSet();
		String sql2 = "select sqbh from "+dgyfktablename+" where id in (select b.yfkdh from "+tablename+" a, "+tablename+"_dt2 b where a.id = b.mainid and a.requestid = '"
				+ requestid + "')";
		rs.execute(sql2);
		rs.next();
		String jkdh = Util.null2String(rs.getString("sqbh"));
		return jkdh;
	}
	
    /**
     * 更新凭证信息
     * 
     * @param requestid
     * @param RET_ACCNO
     * @param ZSTATU
     * @param ZDESC
     */
    public void updateJTYBFBXCJ(String tablename, String requestid,
                             String RET_ACCNO,
                             String ZSTATU,
                             String ZDESC,String pzacdocno,String bs) {
        RecordSet rs = new RecordSet();
        String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"',pzacdocno = '"+pzacdocno+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("######0.00");
    	String cx = df.format(Double.parseDouble("60.00") - Double.parseDouble("50.00"));
//    		Double cx = Double.parseDouble("60.00") - Double.parseDouble("50.00");
    		System.out.println(df.format(cx));
    		
	}
}
