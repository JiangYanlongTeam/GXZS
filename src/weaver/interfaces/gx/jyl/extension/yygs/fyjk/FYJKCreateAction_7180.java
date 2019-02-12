package weaver.interfaces.gx.jyl.extension.yygs.fyjk;

import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ;
import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN;
import net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JSTZGL_FYJKCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JSTZGL_FYJKCreate_HeadModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FYJKCreateAction_7180 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		String tableName = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("投资管理公司-费用借款-创建退回操作，不执行接口.");
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
		String cbzx_column = "cbzx";
		// 资金占用凭证编号-值
		String zjzypzbh_value = "";
		// 资金占用凭证编号-字段
		String zjzypzbh_column = "";
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
		String jbr_column = "jkr";
		// 申请金额-值
		String sqje_value = "";
		// 申请金额-字段
		String sqje_column = "jkje";
		// 货币码-值
		String hbm_value = "";
		// 货币码-字段
		String hbm_column = "hbm";
		// 汇率-值
		String hl_value = "";
		// 汇率-字段
		String hl_column = "";
		// 按本位币计的金额-值
		String abwbjje_value = "";
		// 按本位币计的金额-字段
		String abwbjje_column = "";
		// 对公对私-值
		String dgds_value = "";
		// 对公对私-字段
		String dgds_column = "";
		// 付款日期-值
		String fkrq_value = "";
		// 付款日期-字段
		String fkrq_column = "qwfkrq";
		// 收款方开户行CNAPS号-值
		String khh_value = "";
		// 收款方开户行CNAPS号-字段
		String khh_column = "lhh";
		// 收款方账号-值
		String skfzh_value = "";
		// 收款方账号-字段
		String skfzh_column = "yhzh";
		// 预算码-值
		String ysm_value = "";
		// 预算码-字段
		String ysm_column = "ysm";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "zy";
		// 系统字段-值
		String xtzd_value = "";
		// 系统字段-字段
		String xtzd_column = "xtzd";
		// 支付方式-值
		String zffs_value = "";
		// 支付方式-字段
		String zffs_column = "zffs";
		// 申请人编码
		String skrbm_value = "";
		String skrbm_column = "skrbm";
		// 员工编号
		String ygbh_value = "";
		String ygbh_column = "skrbm";
		// 员工编号
		String skr_value = "";
		String skr_column = "skr";
		String fjzs_value = "";
		String fjzs_column = "fjzs";
		
		String qtyskgrwl_value = "";
		String qtyskgrwl_column = "qtyskgrwl"; //个人应收往来
		
		// 付款方联行号
		String fkflhh_column = "fkflhh";
		String fkflhh_value = "";
		// 付款方银行账号
		String fkfyhzh_column = "fkfyhzh";
		String fkfyhzh_value = "";
		// 资金凭证编号
		String fzjpzh_column = "fzjpzh";
		String fzjpzh_value = "";

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
			if (name.equals(hl_column)) {
				hl_value = value;
			}
			if (name.equals(abwbjje_column)) {
				abwbjje_value = value;
			}
			if (name.equals(dgds_column)) {
				dgds_value = value;
			}
			if (name.equals(fkflhh_column)) {
				fkflhh_value = value;
			}
			if (name.equals(fkfyhzh_column)) {
				fkfyhzh_value = value;
			}
			if (name.equals(fkrq_column)) {
				fkrq_value = value;
				if (!"".equals(fkrq_value)) {
					fkrq_value = fkrq_value.replaceAll("-", "");
				}
			}
			if (name.equals(skfzh_column)) {
				skfzh_value = value;
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
			if (name.equals(zffs_column)) {
				zffs_value = value;
			}
			if (name.equals(skrbm_column)) {
				skrbm_value = value;
			}
			if (name.equals(ygbh_column)) {
				ygbh_value = value;
			}
			if (name.equals(khh_column)) {
				khh_value = value;
			}
			if (name.equals(fjzs_column)) {
				fjzs_value = value;
			}
			if (name.equals(qtyskgrwl_column)) {
				qtyskgrwl_value = value;
			}
			if (name.equals(fzjpzh_column)) {
				fzjpzh_value = value;
			}
			
		}
		writeLog("单据类型：" + djlx_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("成本中心：" + cbzx_value);
		writeLog("资金占用凭证编号：" + zjzypzbh_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("付款类型：" + fklx_value);
		writeLog("收款人编码：" + skrbm_value);
		writeLog("申请日期：" + sqrq_value);
		writeLog("经办人：" + jbr_value);
		writeLog("申请金额：" + sqje_value);
		writeLog("货币码：" + hbm_value);
		writeLog("汇率：" + hl_value);
		writeLog("按本位币计的金额：" + abwbjje_value);
		writeLog("对公对私：" + dgds_value);
		writeLog("付款方开户行CNAPS号：" + fkflhh_value);
		writeLog("付款方银行账号：" + fkfyhzh_value);
		writeLog("付款日期：" + fkrq_value);
		writeLog("收款方账号：" + skfzh_value);
		writeLog("预算码：" + ysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("支付方式：" + zffs_value);
		writeLog("员工编号：" + ygbh_value);
		writeLog("收款人：" + skr_value);
		writeLog("开户行：" + khh_value);
		writeLog("附件张数：" + fjzs_value);
		writeLog("其他应收款-个人往来：" + qtyskgrwl_value);
		writeLog("资金凭证编号：" + fzjpzh_value);
		
		String xmlstring = "";
		String RECE_ACC_NAME_VALUE = "";
		RECE_ACC_NAME_VALUE = skr_value;
		String RECE_CNAPS_VALUE = "";
		String RECE_ACC_NO_VALUE = "";
		if(zffs_value.equals("0")){// 银行是0 现金 是1
			RECE_CNAPS_VALUE = khh_value;
			RECE_ACC_NO_VALUE = skfzh_value;
			zffs_value = "T";
		} else {
			zffs_value = "E";
		}
		List<JSTZGL_FYJKCreate_HeadModel> hEAD = new ArrayList<JSTZGL_FYJKCreate_HeadModel>();
		JSTZGL_FYJKCreate_HeadModel model = new JSTZGL_FYJKCreate_HeadModel(djlx_value, gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value,
				fklx_value, ygbh_value, RECE_ACC_NAME_VALUE, sqrq_value, jbr_value, sqje_value, hbm_value, RECE_CNAPS_VALUE, RECE_ACC_NO_VALUE, 
				fkrq_value, ysm_value, zy_value, zffs_value,fjzs_value,qtyskgrwl_value,fkflhh_value,fkfyhzh_value,fzjpzh_value);
		hEAD.add(model);
		JSTZGL_FYJKCreateModel header = new JSTZGL_FYJKCreateModel(hEAD);
		try {
			xmlstring = XMLUtil.beanToXml(header, JSTZGL_FYJKCreateModel.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		writeLog("投资管理公司-费用借款-创建傳入xml参数：" + xmlstring);
		SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
		DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
		DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
		DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
		DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
		try {
			DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy
					.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
			String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
			writeLog("投资管理公司-费用借款-创建返回消息：" + returnmessage);
			Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
			if (null != map && !map.isEmpty()) {
				String type = (String) map.get("TYPE");
				String no = (String) map.get("APPLYNO");
				String code = (String) map.get("CODE");
				String message = (String) map.get("MESSAGE");
				if ("S".equalsIgnoreCase(type)) {
					updateJTFYJKSQ(tableName,requestid, type, code, message,
							no,"JTFYBX_FYJK");
				} else {
					publicmethod.setFailMessage(request, "failed",
							"投资管理公司-费用借款-创建失败：TYPE：" + type + " code：" + code
									+ " applyno：" + no + " message：" + message);
					return SUCCESS;
				}
			}
		} catch (RemoteException e) {
			publicmethod.setFailMessage(request, "failed", "投资管理公司-费用借款-创建接口异常："
					+ e);
			return SUCCESS;
		}
		return SUCCESS;
	}

	/**
	 * 更新集团财务创建返回信息
	 *
	 * @param requestid
	 * @param type
	 * @param code
	 * @param message
	 */
	public void updateJTFYJKSQ(String tablename,String requestid,
							   String type,
							   String code,
							   String message,String no,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
