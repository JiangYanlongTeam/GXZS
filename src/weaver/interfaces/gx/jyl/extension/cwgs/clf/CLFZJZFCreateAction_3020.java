package weaver.interfaces.gx.jyl.extension.cwgs.clf;

import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ;
import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN;
import net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_CLFZJZFCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_CLFZJZFCreate_HeadModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CLFZJZFCreateAction_3020 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		String tablename = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("差旅费用报销-资金支付-创建退回操作，不执行接口.");
			return SUCCESS;
		}
		// 单据类型-值
		String djlx_value = "";
		// 单据类型-字段
		String djlx_column = "djlx";
		// 公司代码-值
		String gsdm_value = "";
		// 公司代码-字段
		String gsdm_column = "gsdm";
		// 财年-值
		String cn_value = "";
		// 财年-字段
		String cn_column = "cn";
		// 会计期间-值
		String kjqj_value = "";
		// 会计期间-字段
		String kjqj_column = "kjqj";
		// 成本中心-值
		String cbzx_value = "";
		// 成本中心-字段
		String cbzx_column = "fycdbm";
		// 资金占用凭证编号（对私）-值
		String zjzypzbh_value = "";
		// 资金占用凭证编号（对私）-字段
		String zjzypzbh_column = "fzjpzh";
		// 资金占用凭证编号（对公）-值
		String zjzypzbh1_value = "";
		// 资金占用凭证编号（对公）-字段
		String zjzypzbh1_column = "fzjpzh1";
		// 原始申请单号-值
		String yssqh_value = "";
		// 原始申请单号-字段
		String yssqh_column = "sqbh";
		// 付款类型-值
		String fklx_value = "";
		// 付款类型-字段
		String fklx_column = "fklx";
		// 申请日期-值
		String sqrq_value = "";
		// 申请日期-字段
		String sqrq_column = "sqrq";
		// 经办人-值
		String jbr_value = "";
		// 经办人-字段
		String jbr_column = "jbr";
		// 申请金额-值
		String sqje_value = "";
		// 申请金额-字段
		String sqje_column = "sbje";
		// 货币码-值
		String hbm_value = "";
		// 货币码-字段
		String hbm_column = "hbm";
		// 付款日期-值
		String fkrq_value = "";
		// 付款日期-字段
		String fkrq_column = "jhfkrq";
		// 对私支付方式-值
		String dszffs_value = "";
		// 对私支付方式-字段
		String dszffs_column = "dgzffs";
		// 员工编号-值
		String ygbh_value = "";
		// 员工编号-字段
		String ygbh_column = "ygbh";
		// 资金预算码-值
		String zjysm_value = "";
		// 资金预算码-字段
		String zjysm_column = "zjysm";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "zy";
		// 摘要-值
		String xtzd_value = "";
		// 摘要-字段
		String xtzd_column = "sysid";
		// 报销方式-值
		String bxfs_value = "";
		// 报销方式-字段
		String bxfs_column = "sfcjk";
		String skr_column = "skr";
		String skr_value = "";
		String gysmc_value = "";
		String gysmc_column = "gysmc";
		String skrkhh_value = "";
		String skrkhh_column = "skrkhh";
		String gyskhh_value = "";
		String gyskhh_column = "lhh";
		String skrzh_value = "";
		String skrzh_column = "skrzh";// 收款人账号
		String gyskhzh_value = "";
		String gyskhzh_column = "gysyhzh";// 供应商银行账号
		String zflb_column = "zflb";
		String zflb_value = "";
		// 其他应付款个人往来
		String qtyfkgr_column = "qtyfkgr";
		String qtyfkgr_value = "";
		// 附件张数
		String fjzs_column = "zjzfdfjzs";
		String fjzs_value = "";
		// 账户组
		String zhz_column = "gyszhz";
		String zhz_value = "";
		// 供应商编码
		String gysbm_column = "gysbm";
		String gysbm_value = "";
		// 其他应付款-集团供应商内部往来
		String qtyfkjtnb_column = "qtyfkjtnb";
		String qtyfkjtnb_value = "";
		// 其他应付款-集团供应商外部往来
		String qtyfkjtwb_column = "qtyfkjtwb";
		String qtyfkjtwb_value = "";
		// 付款方帐号
		String fkflhh_column = "fkflhh";
		String fkflhh_value = "";
		// 付款方银行帐号
		String fkfyhzh_column = "fkfyhzh";
		String fkfyhzh_value = "";
		// 收款人联行号
		String skrlhh_column = "skrlhh";
		String skrlhh_value = "";
		// 对私支付金额
		String dszfje_column = "dszfje";
		String dszfje_value = "";
		// 对公支付金额
		String dgzfje_column = "dgzfje";
		String dgzfje_value = "";

		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(djlx_column)) {
				djlx_value = value;
			}
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
			if (name.equals(zjzypzbh_column)) {
				zjzypzbh_value = value;
			}
			if (name.equals(yssqh_column)) {
				yssqh_value = value;
			}
			if (name.equals(ygbh_column)) {
				ygbh_value = value;
			}
			if (name.equals(fklx_column)) {
				fklx_value = value;
			}
			if (name.equals(sqrq_column)) {
				sqrq_value = value;
				if (!"".equals(sqrq_value)) {
					sqrq_value = sqrq_value.replaceAll("-", "");
				}
			}
			if (name.equals(jbr_column)) {
				try {
					jbr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(skr_column)) {
				try {
					skr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(sqje_column)) {
				sqje_value = value;
			}
			if (name.equals(hbm_column)) {
				hbm_value = value;
			}
			if (name.equals(fkrq_column)) {
				fkrq_value = value;
				if (!"".equals(fkrq_value)) {
					fkrq_value = fkrq_value.replaceAll("-", "");
				}
			}
			if (name.equals(zjysm_column)) {
				zjysm_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(xtzd_column)) {
				xtzd_value = value;
			}
			if (name.equals(bxfs_column)) {
				bxfs_value = value;
			}
			if (name.equals(zjzypzbh1_column)) {
				zjzypzbh1_value = value;
			}
			if (name.equals(dszffs_column)) {
				dszffs_value = value;
			}
			if (name.equals(gysmc_column)) {
				gysmc_value = value;
			}
			if (name.equals(skrkhh_column)) {
				skrkhh_value = value;
			}
			if (name.equals(gyskhh_column)) {
				gyskhh_value = value;
			}
			if (name.equals(skrzh_column)) {
				skrzh_value = value;
			}
			if (name.equals(gyskhzh_column)) {
				gyskhzh_value = value;
			}
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
			if (name.equals(qtyfkgr_column)) {
				qtyfkgr_value = value;
			}
			if (name.equals(fjzs_column)) {
				fjzs_value = value;
			}
			if (name.equals(zhz_column)) {
				zhz_value = value;
			}
			if (name.equals(gysbm_column)) {
				gysbm_value = value;
			}
			if (name.equals(qtyfkjtnb_column)) {
				qtyfkjtnb_value = value;
			}
			if (name.equals(qtyfkjtwb_column)) {
				qtyfkjtwb_value = value;
			}
			if (name.equals(fkflhh_column)) {
				fkflhh_value = value;
			}
			if (name.equals(fkfyhzh_column)) {
				fkfyhzh_value = value;
			}
			if (name.equals(skrlhh_column)) {
				skrlhh_value = value;
			}
			if (name.equals(dszfje_column)) {
				dszfje_value = value;
			}
			if (name.equals(dgzfje_column)) {
				dgzfje_value = value;
			}
		}
		writeLog("付款方帐号:"+fkflhh_value);
		writeLog("付款方银行帐号:"+fkfyhzh_value);
		writeLog("单据类型：" + djlx_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("成本中心：" + cbzx_value);
		writeLog("资金占用凭证编号（对私）：" + zjzypzbh_value);
		writeLog("资金占用凭证编号（对公）：" + zjzypzbh1_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("付款类型：" + fklx_value);
		writeLog("员工编码：" + ygbh_value);
		writeLog("申请日期：" + sqrq_value);
		writeLog("经办人：" + jbr_value);
		writeLog("申请金额：" + sqje_value);
		writeLog("货币码：" + hbm_value);
		writeLog("付款日期：" + fkrq_value);
		writeLog("资金预算码：" + zjysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("系统字段：" + xtzd_value);
		writeLog("报销方式：" + bxfs_value);
		writeLog("对私支付方式：" + dszffs_value);
		writeLog("收款人：" + skr_value);
		writeLog("供应商名称：" + gysmc_value);
		writeLog("收款人开户行：" + skrkhh_value);
		writeLog("供应商开户银行：" + gyskhh_value);
		writeLog("收款人账号：" + skrzh_value);
		writeLog("供应商开户账号：" + gyskhzh_value);
		writeLog("支付类别：" + zflb_value);
		writeLog("其他应付款-个人往来：" + qtyfkgr_value);
		writeLog("附件张数：" + fjzs_value);
		writeLog("账户组：" + zhz_value);
		writeLog("供应商编码：" + gysbm_value);
		writeLog("其他应付款-集团供应商内部往来：" + qtyfkjtnb_value);
		writeLog("其他应付款-集团供应商外部往来：" + qtyfkjtwb_value);
		writeLog("收款人联行号："+skrlhh_value);
		writeLog("对私支付金额："+dszfje_value);
		writeLog("对公支付金额："+dgzfje_value);

		if (Double.parseDouble(sqje_value) == 0) {
			return SUCCESS;
		}
		if ("0".equals(sqje_value)) {
			return SUCCESS;
		}

		if (("1".equals(bxfs_value) || ("0".equals(bxfs_value) && Double.parseDouble(sqje_value) > 0))) {
			String qt = "";
			if (zflb_value.equals("1")) {// 对私
				String xmlstring = "";
				if (dszffs_value.equals("0")) {
					dszffs_value = "E";
				} else {
					dszffs_value = "T";
				}
				qt = qtyfkgr_value;
				List<JTFYBX_CLFZJZFCreate_HeadModel> hEAD = new ArrayList<JTFYBX_CLFZJZFCreate_HeadModel>();
				if (dszffs_value.equals("E")) { // 现金 不穿 RECE_CNAPS RECE_ACC_NO PAYER_CNAPS PAYBANK_NO
					JTFYBX_CLFZJZFCreate_HeadModel model = new JTFYBX_CLFZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
							kjqj_value, cbzx_value, zjzypzbh_value, yssqh_value, fklx_value, ygbh_value, qt, sqrq_value,
							jbr_value, sqje_value, hbm_value, fkrq_value, dszffs_value, skr_value, "",
							"", zjysm_value, "(付款)" + zy_value, fjzs_value,"","");
					hEAD.add(model);
				} else {
					JTFYBX_CLFZJZFCreate_HeadModel model = new JTFYBX_CLFZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
							kjqj_value, cbzx_value, zjzypzbh_value, yssqh_value, fklx_value, ygbh_value, qt, sqrq_value,
							jbr_value, sqje_value, hbm_value, fkrq_value, dszffs_value, skr_value, skrlhh_value,
							skrzh_value, zjysm_value, "(付款)" + zy_value, fjzs_value,fkflhh_value,fkfyhzh_value);
					hEAD.add(model);
				}
				
				JTFYBX_CLFZJZFCreateModel head = new JTFYBX_CLFZJZFCreateModel(hEAD);
				try {
					xmlstring = XMLUtil.beanToXml(head, JTFYBX_CLFZJZFCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
				writeLog("差旅费用报销-资金支付（对私）傳入xml参数：" + xmlstring);
				SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
				DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
				DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
				DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
				DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
				try {
					DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
					String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
					writeLog("差旅费用报销-资金支付（对私）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("APPLYNO");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if ("S".equalsIgnoreCase(type)) {
							updateJTCLFXBXZJZFDDS(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对私）失败：TYPE：" + type
									+ " code：" + code + " applyno：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对私）接口异常：" + e);
					return SUCCESS;
				}
			}
			if (zflb_value.equals("2") || "4".equals(zflb_value)) {// 对公
				String xmlstring = "";
				if ("GX10".equals(zhz_value) || "GX11".equals(zhz_value)) {
					qt = qtyfkjtnb_value;
				} else {
					qt = qtyfkjtwb_value;
				}
				List<JTFYBX_CLFZJZFCreate_HeadModel> hEAD = new ArrayList<JTFYBX_CLFZJZFCreate_HeadModel>();
				JTFYBX_CLFZJZFCreate_HeadModel model = new JTFYBX_CLFZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
						kjqj_value, cbzx_value, zjzypzbh1_value, yssqh_value, fklx_value, gysbm_value, qt, sqrq_value,
						jbr_value, sqje_value, hbm_value, fkrq_value, "T", gysmc_value, gyskhh_value,
						gyskhzh_value, zjysm_value, "(付款)" + zy_value, fjzs_value,fkflhh_value,fkfyhzh_value);
				hEAD.add(model);
				JTFYBX_CLFZJZFCreateModel head = new JTFYBX_CLFZJZFCreateModel(hEAD);
				try {
					xmlstring = XMLUtil.beanToXml(head, JTFYBX_CLFZJZFCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}

				writeLog("差旅费用报销-资金支付（对公）傳入xml参数：" + xmlstring);
				SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
				DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
				DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
				DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
				DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
				try {
					DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
					String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
					writeLog("差旅费用报销-资金支付（对公）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("APPLYNO");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if ("S".equalsIgnoreCase(type)) {
							updateJTCLFXBXZJZFDDG(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对公）失败：TYPE：" + type
									+ " code：" + code + " applyno：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对公）接口异常：" + e);
					return SUCCESS;
				}
			}
			if (zflb_value.equals("0")) {// 对私 对公
				String xmlstring = "";
				if (dszffs_value.equals("0")) {
					dszffs_value = "E";
				} else {
					dszffs_value = "T";
				}
				qt = qtyfkgr_value;
				List<JTFYBX_CLFZJZFCreate_HeadModel> hEAD = new ArrayList<JTFYBX_CLFZJZFCreate_HeadModel>();
				if (dszffs_value.equals("E")) { // 现金 不穿 RECE_CNAPS RECE_ACC_NO PAYER_CNAPS PAYBANK_NO
					JTFYBX_CLFZJZFCreate_HeadModel model = new JTFYBX_CLFZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
							kjqj_value, cbzx_value, zjzypzbh_value, yssqh_value, fklx_value, ygbh_value, qt, sqrq_value,
							jbr_value, dszfje_value, hbm_value, fkrq_value, dszffs_value, skr_value, "",
							"", zjysm_value, "(付款)" + zy_value, fjzs_value,"","");
					hEAD.add(model);
				} else {
					JTFYBX_CLFZJZFCreate_HeadModel model = new JTFYBX_CLFZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
							kjqj_value, cbzx_value, zjzypzbh_value, yssqh_value, fklx_value, ygbh_value, qt, sqrq_value,
							jbr_value, dszfje_value, hbm_value, fkrq_value, dszffs_value, skr_value, skrlhh_value,
							skrzh_value, zjysm_value, "(付款)" + zy_value, fjzs_value,fkflhh_value,fkfyhzh_value);
					hEAD.add(model);
				}
				JTFYBX_CLFZJZFCreateModel head = new JTFYBX_CLFZJZFCreateModel(hEAD);
				try {
					xmlstring = XMLUtil.beanToXml(head, JTFYBX_CLFZJZFCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}

				writeLog("差旅费用报销-资金支付（对私）傳入xml参数：" + xmlstring);
				SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
				DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
				DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
				DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
				DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
				try {
					DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
					String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
					writeLog("差旅费用报销-资金支付（对私）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("APPLYNO");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if ("S".equalsIgnoreCase(type)) {
							updateJTCLFXBXZJZFDDS(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对私）失败：TYPE：" + type
									+ " code：" + code + " applyno：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对私）接口异常：" + e);
					return SUCCESS;
				}

				String xmlstring1 = "";
				if ("GX10".equals(zhz_value) || "GX11".equals(zhz_value)) {
					qt = qtyfkjtnb_value;
				} else {
					qt = qtyfkjtwb_value;
				}
				List<JTFYBX_CLFZJZFCreate_HeadModel> hEAD1 = new ArrayList<JTFYBX_CLFZJZFCreate_HeadModel>();
				JTFYBX_CLFZJZFCreate_HeadModel model1 = new JTFYBX_CLFZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
						kjqj_value, cbzx_value, zjzypzbh1_value, yssqh_value, fklx_value, gysbm_value, qt, sqrq_value,
						jbr_value, dgzfje_value, hbm_value, fkrq_value, "T", gysmc_value, gyskhh_value,
						gyskhzh_value, zjysm_value, "(付款)" + zy_value, fjzs_value,fkflhh_value,fkfyhzh_value);
				hEAD1.add(model1);
				JTFYBX_CLFZJZFCreateModel head1 = new JTFYBX_CLFZJZFCreateModel(hEAD1);
				try {
					xmlstring1 = XMLUtil.beanToXml(head1, JTFYBX_CLFZJZFCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
				//gysgetforcw_yhxx_clf gysgetforcw_clf
				writeLog("差旅费用报销-资金支付（对公）傳入xml参数：" + xmlstring1);
				SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy1 = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
				DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ1 = new DT_1049_ALL2ERP_ZJZFSQ();
				DT_1049_ALL2ERP_ZJZFSQ1.setOUTPUT(xmlstring1);
				DT_1049_ALL2ERP_ZJZFSQ1.setSYSTEM(xtzd_value);
				DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN1 = null;
				try {
					DT_1049_ALL2ERP_ZJZFSQ_RETURN1 = proxy1.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ1);
					String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN1.getINPUT();
					writeLog("差旅费用报销-资金支付（对公）返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
					if (null != map && !map.isEmpty()) {
						String type = (String) map.get("TYPE");
						String no = (String) map.get("APPLYNO");
						String code = (String) map.get("CODE");
						String message = (String) map.get("MESSAGE");
						if ("S".equalsIgnoreCase(type)) {
							updateJTCLFXBXZJZFDDG(tablename,requestid, type, code, message, no, "JTFYBX_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对公）失败：TYPE：" + type
									+ " code：" + code + " applyno：" + no + " message：" + message);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "差旅费用报销-资金支付（对公）接口异常：" + e);
					return SUCCESS;
				}
			}
		}
		return SUCCESS;
	}

	public void updateJTCLFXBXZJZFDDS(String tablename,String requestid,
									  String type,
									  String code,
									  String message,String no,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}

	public void updateJTCLFXBXZJZFDDG(String tablename , String requestid,
									  String type,
									  String code,
									  String message,String no,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set capplyno1 = '"+no+"', ccode1 = '"+code+"', cmessage1 = '"+message+"',ctype1 = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
