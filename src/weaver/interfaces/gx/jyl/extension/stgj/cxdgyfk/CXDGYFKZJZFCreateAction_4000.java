package weaver.interfaces.gx.jyl.extension.stgj.cxdgyfk;

import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ;
import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN;
import net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTCLFBXZJZFCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTCLFBXZJZFCreate_HeadModel;
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

public class CXDGYFKZJZFCreateAction_4000 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();
	DecimalFormat df = new DecimalFormat("######0.00");
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		String tablename = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("对公付款资金支付单退回操作，不执行接口.");
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
		// 资金占用凭证编号（对私）-值
		String zjzypzbh_value = "";
		// 资金占用凭证编号（对私）-字段
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
		String sqrq_column = "rq";
		// 经办人-值
		String jbr_value = "";
		// 经办人-字段
		String jbr_column = "sqr";
		// 申请金额-值
		String sqje_value = "";
		// 申请金额-字段
		String sqje_column = "fpje";
		// 冲销金额-值
		String cxje_value = "";
		// 冲销金额-字段
		String cxje_column = "cxje";
		
		// 货币码-值
		String hbm_value = "";
		// 货币码-字段
		String hbm_column = "hbm";
		// 付款日期-值
		String fkrq_value = "";
		// 付款日期-字段
		String fkrq_column = "qwfkrq";
		// 资金预算码-值
		String zjysm_value = "";
		// 资金预算码-字段
		String zjysm_column = "ysm";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "zy";
		// 系统字段-值
		String xtzd_value = "";
		// 系统字段-字段
		String xtzd_column = "xtzd";
		
		String gysmc_value = "";
		String gysmc_column = "gysmc";
		String gyskhh_value = "";
		String gyskhh_column = "lhh";
		String gyskhzh_value = "";
		String gyskhzh_column = "gysyhzh";// 供应商银行账号
		// 附件张数
		String fjzs_column = "fjzs";
		String fjzs_value = "";
		// 账户组
		String zhz_column = "gyszhz";
		String zhz_value = "";
		// 供应商编码
		String gysbm_column = "gysbm";
		String gysbm_value = "";
		// 付款方帐号
		String fkflhh_column = "fkflhh";
		String fkflhh_value = "";
		// 付款方银行帐号
		String fkfyhzh_column = "fkfyhzh";
		String fkfyhzh_value = "";
		// 支付方式
		String zffs_column = "zffs";
		String zffs_value = "";
		// 其他应付款-集团供应商内部往来-值
		String qtyfkjtnb_value = "";
		// 其他应付款-集团供应商内部往来-字段
		String qtyfkjtnb_column = "qtyfkjtnb";
		// 其他应付款-集团供应商外部往来-值
		String qtyfkjtwb_value = "";
		// 其他应付款-集团供应商外部往来-字段
		String qtyfkjtwb_column = "qtyfkjtwb";

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
			if (name.equals(sqje_column)) {
				sqje_value = Util.null2o(value);
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
			if (name.equals(gysmc_column)) {
				gysmc_value = value;
			}
			if (name.equals(gyskhh_column)) {
				gyskhh_value = value;
			}
			if (name.equals(gyskhzh_column)) {
				gyskhzh_value = value;
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
			if (name.equals(fkflhh_column)) {
				fkflhh_value = value;
			}
			if (name.equals(fkfyhzh_column)) {
				fkfyhzh_value = value;
			}
			if (name.equals(cxje_column)) {
				cxje_value = Util.null2o(value);
			}
			if (name.equals(zffs_column)) {
				zffs_value = value;
			}
			if (name.equals(qtyfkjtnb_column)) {
				qtyfkjtnb_value = value;
			}
			if (name.equals(qtyfkjtwb_column)) {
				qtyfkjtwb_value = value;
			}
		}
		writeLog("付款方帐号:"+fkflhh_value);
		writeLog("付款方银行帐号:"+fkfyhzh_value);
		writeLog("单据类型：" + djlx_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("成本中心：" + cbzx_value);
		writeLog("资金占用凭证编号：" + zjzypzbh_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("付款类型：" + fklx_value);
		writeLog("申请日期：" + sqrq_value);
		writeLog("经办人：" + jbr_value);
		writeLog("发票金额：" + sqje_value);
		writeLog("货币码：" + hbm_value);
		writeLog("付款日期：" + fkrq_value);
		writeLog("资金预算码：" + zjysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("系统字段：" + xtzd_value);
		writeLog("供应商名称：" + gysmc_value);
		writeLog("供应商开户银行：" + gyskhh_value);
		writeLog("供应商开户账号：" + gyskhzh_value);
		writeLog("附件张数：" + fjzs_value);
		writeLog("账户组：" + zhz_value);
		writeLog("供应商编码：" + gysbm_value);
		writeLog("冲销金额："+cxje_value);
		writeLog("支付方式："+zffs_value);

		if (Double.parseDouble(sqje_value) == 0) {
			return SUCCESS;
		}
		if ("0".equals(sqje_value)) {
			return SUCCESS;
		}
		Double cx = Double.parseDouble(sqje_value) - Double.parseDouble(cxje_value);
		if(cx <= 0) {
			return SUCCESS;
		}

		String stype = "";
		if("0".equals(zffs_value)) {
			stype = "T";
		}
		if("1".equals(zffs_value)) {
			stype = "E";
		}
		if("2".equals(zffs_value)) {
			stype = "C";
		}
		
		String xmlstring = "";
		String qt = "";
		if ("GX10".equals(zhz_value) || "GX11".equals(zhz_value)) {
			qt = qtyfkjtnb_value;
		} else {
			qt = qtyfkjtwb_value;
		}
		List<JTCLFBXZJZFCreate_HeadModel> hEAD = new ArrayList<JTCLFBXZJZFCreate_HeadModel>();
		JTCLFBXZJZFCreate_HeadModel model = new JTCLFBXZJZFCreate_HeadModel(djlx_value, gsdm_value, cn_value,
				kjqj_value, cbzx_value, zjzypzbh_value, yssqh_value, fklx_value, gysbm_value, qt, sqrq_value,
				jbr_value, df.format(cx), hbm_value, fkrq_value, stype, gysmc_value, gyskhh_value,
				gyskhzh_value, zjysm_value, "(付款)" + zy_value, fjzs_value,fkflhh_value,fkfyhzh_value);
		hEAD.add(model);
		JTCLFBXZJZFCreateModel head = new JTCLFBXZJZFCreateModel(hEAD);
		try {
			xmlstring = XMLUtil.beanToXml(head, JTCLFBXZJZFCreateModel.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		writeLog("对公付款资金支付单傳入xml参数：" + xmlstring);
		SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
		DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
		DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
		DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
		DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
		try {
			DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
			String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
			writeLog("对公付款资金支付单返回消息：" + returnmessage);
			Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
			if (null != map && !map.isEmpty()) {
				String type = (String) map.get("TYPE");
				String no = (String) map.get("APPLYNO");
				String code = (String) map.get("CODE");
				String message = (String) map.get("MESSAGE");
				if ("S".equalsIgnoreCase(type)) {
					updateJTCLFXBXZJZFDDG(tablename,requestid, type, code, message, no, "GFGS_CLFYBX");
				} else {
					setFailMessage(request, "failed", "对公付款资金支付单失败：TYPE：" + type
							+ " code：" + code + " applyno：" + no + " message：" + message);
					return SUCCESS;
				}
			}
		} catch (RemoteException e) {
			setFailMessage(request, "failed", "对公付款资金支付单接口异常：" + e);
			return SUCCESS;
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
    public void setFailMessage(RequestInfo request,
                               String failedid,
                               String failedmessage) {
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
    public void updateJTCLFXBXZJZFDDG(String tablename, String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
}
