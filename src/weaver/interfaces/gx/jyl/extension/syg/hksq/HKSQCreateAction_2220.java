package weaver.interfaces.gx.jyl.extension.syg.hksq;

import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ;
import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ_RETURN;
import net.jsgx.www.E1D.service.SI_1072_ALL2ERP_KJPZ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JSTZGL_HKSQCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JSTZGL_HKSQCreate_HeadModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JSTZGL_HKSQCreate_ItemModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HKSQCreateAction_2220 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String workflowid = request.getWorkflowid();
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		String tablename1 = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("一般费用报销退回操作，不执行接口.");
			return SUCCESS;
		}

		// 凭证抬头文本
		String hksm_value = "";
		String hksm_column = "hksm";
		// 凭证类型
		String pzlx_value = "";
		String pzlx_column = "pzlx";
		// 参考凭证编号
		String hkbh_value = "";
		String hkbh_column = "hkbh";
		// 公司代码
		String gsdm_value = "";
		String gsdm_column = "gsdm";
		// 凭证中凭证日期
		String pzrq_value = "";
		String pzrq_column = "pzrq";
		// 凭证中过账日期
		String gzrq_value = "";
		String gzrq_column = "gzrq";
		// 报销人员工号
		String ygbh_value = "";
		String ygbh_column = "yggys";
		// 现金-银行
		String xjyh_value = "";
		String xjyh_column = "xjyh";
		// 应收账款-其他
		String qtysk_value = "";
		String qtysk_column = "qtysk";
		// 还款金额
		String hkje_value = "";
		String hkje_column = "hkje";
		// 摘要
		String zy_value = "";
		String zy_column = "zy";
		// 成本中心
		String cbzx_value = "";
		String cbzx_column = "cbzx";
		// 系统字段
		String sysid_value = "";
		String sysid_column = "sysid";
		// 反记账
		String fjz_value = "";
		String fjz_column = "fjz";
		//资金预算码
		String zjysm_value = "";
		String zjysm_column = "zjysm";
		// 制单人-值
		String pzzdr_value = "";
		// 制单人-字段
		String pzzdr_column = "pzzdr";
		// 附件张数
		String fjzs_column = "fjzs";
		String fjzs_value = "";
		// hexiao
		String hxjkdh_column = "hxjkdh";
		String hxjkdh_value = "";
		
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(ygbh_column)) {
				ygbh_value = value;
			}
			if (name.equals(hksm_column)) {
				hksm_value = value;
			}
			if (name.equals(pzlx_column)) {
				pzlx_value = value;
			}
			if (name.equals(hkbh_column)) {
				hkbh_value = value;
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
			if (name.equals(xjyh_column)) {
				xjyh_value = value;
			}
			if (name.equals(qtysk_column)) {
				qtysk_value = value;
			}
			if (name.equals(sysid_column)) {
				sysid_value = value;
			}
			if (name.equals(sysid_column)) {
				sysid_value = value;
			}
			if (name.equals(hkje_column)) {
				hkje_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(cbzx_column)) {
				cbzx_value = value;
			}
			if (name.equals(fjz_column)) {
				fjz_value = value;
			}
			if (name.equals(zjysm_column)) {
				zjysm_value = value;
			}
			if (name.equals(fjzs_column)) {
				fjzs_value = value;
			}
			if (name.equals(hxjkdh_column)) {
				hxjkdh_value = value;
			}
			if (name.equals(pzzdr_column)) {
				try {
					pzzdr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		writeLog("凭证抬头文本:" + hksm_value);
		writeLog("凭证类型:" + pzlx_value);
		writeLog("参考凭证编号:" + hkbh_value);
		writeLog("公司代码:" + gsdm_value);
		writeLog("凭证日期:" + pzrq_value);
		writeLog("过账日期:" + gzrq_value);
		writeLog("现金-银行:" + xjyh_value);
		writeLog("SYSID:" + sysid_value);
		writeLog("应收帐款-其他:" + qtysk_value);
		writeLog("员工编号:" + ygbh_value);
		writeLog("还款金额:" + hkje_value);
		writeLog("成本中心:" + cbzx_value);
		writeLog("摘要:" + zy_value);
		writeLog("反记账:" + fjz_value);
		writeLog("资金预算码:" + zjysm_value);
		writeLog("凭证制单人:" + pzzdr_value);
		writeLog("附件张数:" + fjzs_value);
		writeLog("核销借款单号:" + hxjkdh_value);

		String tablename = getPropValue("fna_extension", "fyjk_"+workflowid);
		String sql = "select sqbh from " + tablename + " where id = '"+hxjkdh_value+"'";
		RecordSet rs = new RecordSet();
		rs.execute(sql);
		rs.next();
		String sqbh = Util.null2String(rs.getString("sqbh"));
		
		String xmlstring = "";
		if(hksm_value.length() > 25) {
			hksm_value = hksm_value.substring(0, 25);
		}
		List<JSTZGL_HKSQCreate_HeadModel> headlist = new ArrayList<JSTZGL_HKSQCreate_HeadModel>();
		JSTZGL_HKSQCreate_HeadModel headermodel = new JSTZGL_HKSQCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value, gzrq_value,
				hksm_value, hkbh_value, "", "", pzzdr_value, "OA系统",fjzs_value);//TODO 附件张数
		headlist.add(headermodel);
		List<JSTZGL_HKSQCreate_ItemModel> lines = new ArrayList<JSTZGL_HKSQCreate_ItemModel>();
		JSTZGL_HKSQCreate_ItemModel line = new JSTZGL_HKSQCreate_ItemModel("S", xjyh_value, "", "", "", hkje_value,
				"", zy_value, fjz_value, hkbh_value, cbzx_value, "", "", zjysm_value);
		lines.add(line);

		JSTZGL_HKSQCreate_ItemModel line2 = new JSTZGL_HKSQCreate_ItemModel("H", qtysk_value, ygbh_value, "", "", hkje_value,
				"", zy_value, fjz_value, sqbh, "", "", "", zjysm_value);
		lines.add(line2);
		JSTZGL_HKSQCreateModel model = new JSTZGL_HKSQCreateModel(headlist,lines);
		try {
			xmlstring = XMLUtil.beanToXml(model, JSTZGL_HKSQCreateModel.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		writeLog("投资管理公司-还款申请传入xml参数：" + xmlstring);

		SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
		DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
		DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
		DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
		DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
		try {
			DT_1072_ALL2ERP_KJPZ_RETURN = proxy
					.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
			String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
			writeLog("投资管理公司-还款申请创建返回消息：" + returnmessage);
			Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
			if (null != map && !map.isEmpty()) {
				String RET_ACCNO = (String) map.get("RET_ACCNO");
                String ZSTATU = (String) map.get("MTYPE");
                String MESSAGE = (String) map.get("MESSAGE");
                String pzacdocno = (String) map.get("pzacdocno");
                if ("S".equalsIgnoreCase(ZSTATU)) {
                	updateJTHKSQCJ(tablename1,requestid, RET_ACCNO, ZSTATU,MESSAGE,pzacdocno,"JTFYBX_HKSQ");
                } else {
                    publicmethod.setFailMessage(request, "failed", "投资管理公司-还款申请创建失败：RET_ACCNO：" + RET_ACCNO + " MTYPE：" + ZSTATU + " MESSAGE：" + MESSAGE);
                    return SUCCESS;
                }
			}
		} catch (RemoteException e) {
			publicmethod
					.setFailMessage(request, "failed", "投资管理公司-还款申请创建接口异常：" + e);
			return SUCCESS;
		}
		return SUCCESS;
	}

	/**
	 * 更新集团-还款申请创建流程信息
	 *
	 * @param requestid
	 * @param RET_ACCNO
	 * @param ZSTATU
	 * @param ZDESC
	 */
	public void updateJTHKSQCJ(String tablename ,String requestid,
							   String RET_ACCNO,
							   String ZSTATU,
							   String ZDESC,String pzacdocno,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"',pzacdocno = '"+pzacdocno+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
