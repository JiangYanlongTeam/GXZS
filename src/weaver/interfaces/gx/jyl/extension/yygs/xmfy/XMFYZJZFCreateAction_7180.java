package weaver.interfaces.gx.jyl.extension.yygs.xmfy;

import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ;
import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN;
import net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_YBFYBXZJZFCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_YBFYBXZJZFCreate_HeadModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class XMFYZJZFCreateAction_7180 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		String tablename = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("通用费用报销-资金支付-创建退回操作，不执行接口.");
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
		String zjzypzbh_column = "fzjpzh";
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
		// 支付方式-值
		String zffs_value = "";
		// 支付方式-字段
		String zffs_column = "zffs";
		// 员工编号-值
		String ygbh_value = "";
		// 员工编号-字段
		String ygbh_column = "ygbh";
		// 收款人-值
		String skr_value = "";
		// 收款人-字段
		String skr_column = "skr";
		// 供应商编码-值
		String gysbm_value = "";
		// 供应商编码-字段
		String gysbm_column = "gysbm";
		// 供应商名称-值
		String khgys_value = "";
		// 供应商名称-字段
		String khgys_column = "gysmc";
		// 开户行-值
		String khh_value = "";
		// 开户行-字段
		String khh_column = "khh";
		// 银行账户-值
		String zh_value = "";
		// 银行账户
		String zh_column = "zh";
		// 供应商开户行-值
		String gyskhh_value = "";
		// 供应商开户行-字段
		String gyskhh_column = "lhh";
		// 供应商银行账号-值
		String gyszh_value = "";
		// 供应商银行账号
		String gyszh_column = "gysyhzh";
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
		// 摘要-值
		String zflb_value = "";
		// 摘要-字段
		String zflb_column = "zflb";
		// 报销方式-值
		String bxfs_value = "";
		// 报销方式-字段
		String bxfs_column = "bxfs";
		String dgzffs_column = "dgzffs";
		String dgzffs_value = "";// 对公支付方式
		String gglhh_column = "gglhh";
		String gglhh_value = "";
		String ycxgysmc_column = "ycxgysmc";
		String ycxgysmc_value = "";
		String ycxgyslhh_column = "ycxgyslhh";
		String ycxgyslhh_value = "";
		String ycxgysyhzh_value = "";
		String ycxgysyhzh_column = "ycxgysyhzh";
		String qtyfkgr_value = "";
		String qtyfkgr_column = "qtyfkgr";
		String qtyfkjtnb_value = "";
		String qtyfkjtnb_column = "qtyfkjtnb";
		String qtyfkjtwb_value = "";
		String qtyfkjtwb_column = "qtyfkjtwb";
		String gyszhz_value = "";
		String gyszhz_column = "gyszhz";
		String zs_column = "zjzfdfjzs"; //附件张数 zjzfdfjzs
		String zs_value = "";
		// 付款方行号
		String fkflhh_column = "fkflhh";
		String fkflhh_value = "";
		// 付款方银行帐号
		String fkfyhzh_column = "fkfyhzh";
		String fkfyhzh_value = "";
		// 一次供应商编码
		String ycxgysbm_column = "ycxgysbm";
		String ycxgysbm_value = "";

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
			if (name.equals(gysbm_column)) {
				gysbm_value = value;
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
			if (name.equals(khh_column)) {
				khh_value = value;
			}
			if (name.equals(zh_column)) {
				zh_value = value;
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
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
			if (name.equals(dgzffs_column)) {
				dgzffs_value = value;
			}
			if (name.equals(bxfs_column)) {
				bxfs_value = value;
			}
			if (name.equals(zffs_column)) {
				zffs_value = value;
			}
			if (name.equals(skr_column)) {
				try {
					skr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(khgys_column)) {
				khgys_value = value;
			}
			if (name.equals(gyszh_column)) {
				gyszh_value = value;
			}
			if (name.equals(gyskhh_column)) {
				gyskhh_value = value;
			}
			if (name.equals(gglhh_column)) {
				gglhh_value = value;
			}
			if (name.equals(ycxgysmc_column)) {
				ycxgysmc_value = value;
			}
			if (name.equals(ycxgyslhh_column)) {
				ycxgyslhh_value = value;
			}
			if (name.equals(ycxgysyhzh_column)) {
				ycxgysyhzh_value = value;
			}
			if (name.equals(qtyfkgr_column)) {
				qtyfkgr_value = value;
			}
			if (name.equals(gyszhz_column)) {
				gyszhz_value = value;
			}
			if (name.equals(zs_column)) {
				zs_value = value;
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
			if (name.equals(ycxgysbm_column)) {
				ycxgysbm_value = value;
			}
			
		}
		
		writeLog("付款方行号"+fkflhh_value);
		writeLog("付款方银行帐号"+fkfyhzh_value);
		writeLog("单据类型：" + djlx_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("成本中心：" + cbzx_value);
		writeLog("资金占用凭证编号：" + zjzypzbh_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("付款类型：" + fklx_value);
		writeLog("员工编码：" + ygbh_value);
		writeLog("供应商编码：" + gysbm_value);
		writeLog("申请日期：" + sqrq_value);
		writeLog("经办人：" + jbr_value);
		writeLog("申请金额：" + sqje_value);
		writeLog("货币码：" + hbm_value);
		writeLog("付款日期：" + fkrq_value);
		writeLog("收款方开户行CNAPS号：" + zh_value);
		writeLog("开户行：" + khh_value);
		writeLog("资金预算码：" + zjysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("系统字段：" + xtzd_value);
		writeLog("支付类别：" + zflb_value);
		writeLog("报销方式：" + bxfs_value);
		writeLog("支付方式：" + zffs_value);
		writeLog("收款人：" + skr_value);
		writeLog("客户供应商：" + khgys_value);
		writeLog("供应商开户行：" + gyskhh_value);
		writeLog("供应商开户账号：" + gyszh_value);
		writeLog("个人联行号：" + gglhh_value);
		writeLog("一次性供应商名称：" + ycxgysmc_value);
		writeLog("一次性供应商联行号：" + ycxgyslhh_value);
		writeLog("一次性供应商联行号：" + ycxgysyhzh_value);
		writeLog("其他应付款-个人往来：" + qtyfkgr_value);
		writeLog("其他应付款-集团供应商内部往来：" + qtyfkjtnb_value);
		writeLog("其他应付款-集团供应商外部往来：" + qtyfkjtwb_value);
		writeLog("账户组：" + gyszhz_value);
		writeLog("附件张数：" + zs_value);
		writeLog("一次性供应商编码：" + ycxgysbm_value);
		

		if (Double.parseDouble(sqje_value) == 0) {
			return SUCCESS;
		}
		
		if (("2".equals(bxfs_value) || ("0".equals(bxfs_value) && Double.parseDouble(sqje_value) > 0))) {
			String xmlstring = "";
			String TR_TYPE_VALUE = "";
			String RECE_ACC_NAME_VALUE = "";
			String RECE_CNAPS_VALUE = "";
			String RECE_ACC_NO_VALUE = "";
			String qtyfkgr = "";
			String linf = "";
			if (zflb_value.equals("0")) {//个人
				if (zffs_value.equals("0")) {
					TR_TYPE_VALUE = "E";
					RECE_ACC_NAME_VALUE = skr_value;//个人-现金  传收款人
					qtyfkgr = qtyfkgr_value;
				}
				if (zffs_value.equals("1")) {
					TR_TYPE_VALUE = "T"; // 个人-银行 传收款人 联行号 银行帐号
					RECE_ACC_NAME_VALUE = skr_value;
					RECE_CNAPS_VALUE = gglhh_value;
					RECE_ACC_NO_VALUE = zh_value;
					qtyfkgr = qtyfkgr_value;
				}
				linf = ygbh_value;
			}
			if (zflb_value.equals("1") || zflb_value.equals("4")) {//对公非一次性供应商
				TR_TYPE_VALUE = dgzffs_value;
				RECE_ACC_NAME_VALUE = khgys_value;
				RECE_CNAPS_VALUE = gyskhh_value;
				RECE_ACC_NO_VALUE = gyszh_value;
				if(gyszhz_value.equals("GX10") || gyszhz_value.equals("GX11")) {
					qtyfkgr = qtyfkjtnb_value;
				} else {
					qtyfkgr = qtyfkjtwb_value;
				}
				linf = gysbm_value;
			}
			if (zflb_value.equals("3")) {//对公一次性供应商
				TR_TYPE_VALUE = dgzffs_value;
				RECE_ACC_NAME_VALUE = ycxgysmc_value;
				RECE_CNAPS_VALUE = ycxgyslhh_value;
				RECE_ACC_NO_VALUE = ycxgysyhzh_value;
				qtyfkgr = qtyfkjtwb_value;
				linf = ycxgysbm_value;
			}
			if (zflb_value.equals("2")) {//不需支付
				return SUCCESS;
			}
			List<JTFYBX_YBFYBXZJZFCreate_HeadModel> hEAD = new ArrayList<JTFYBX_YBFYBXZJZFCreate_HeadModel>();
			JTFYBX_YBFYBXZJZFCreate_HeadModel model = new JTFYBX_YBFYBXZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
					kjqj_value, cbzx_value, zjzypzbh_value, yssqh_value, fklx_value, linf, qtyfkgr, sqrq_value, jbr_value,
					sqje_value, hbm_value, fkrq_value, TR_TYPE_VALUE, RECE_ACC_NAME_VALUE, RECE_CNAPS_VALUE,
					RECE_ACC_NO_VALUE, zjysm_value, "(付款)" + zy_value,zs_value,fkflhh_value,fkfyhzh_value);
			hEAD.add(model);
			JTFYBX_YBFYBXZJZFCreateModel head = new JTFYBX_YBFYBXZJZFCreateModel(hEAD);
			try {
				xmlstring = XMLUtil.beanToXml(head, JTFYBX_YBFYBXZJZFCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			writeLog("通用费用报销-资金支付傳入xml参数：" + xmlstring);
			SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
			DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
			DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
			DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
			DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
			try {
				DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
				String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
				writeLog("通用费用报销-资金支付返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String no = (String) map.get("APPLYNO");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if ("S".equalsIgnoreCase(type)) {
						updateJTYBFYBXZJZFD(tablename,requestid, type, code, message, no, "JTFYBX_YBFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed", "通用费用报销-资金支付失败：TYPE：" + type + " code："
								+ code + " applyno：" + no + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "通用费用报销-资金支付接口异常：" + e);
				return SUCCESS;
			}
		}
		return SUCCESS;
	}

	public void updateJTYBFYBXZJZFD(String tablename, String requestid,
									String type,
									String code,
									String message,String no,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
