package weaver.interfaces.gx.jyl.jtfybx.ybfybx;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ;
import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ_RETURN;
import net.jsgx.www.E1D.service.SI_1072_ALL2ERP_KJPZ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.gfgs.model.JTCLFBXCreateModel;
import weaver.interfaces.gx.jyl.gfgs.model.JTCLFBXCreate_HeadModel;
import weaver.interfaces.gx.jyl.gfgs.model.JTCLFBXCreate_ItemModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 股份公司-差旅费报销创建生成凭证
 */
public class JTCLFBXCreateAction extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();
	DecimalFormat df = new DecimalFormat("######0.00");
	
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("资金凭证单退回操作，不执行接口.");
			return SUCCESS;
		}
		// 凭证创建人-值
		String jbr_value = "";
		// 凭证创建人-字段
		String jbr_column = "pzcjr";
		// 凭证抬头文本-值
		String pzttwb_value = "";
		// 凭证抬头文本-字段
		String pzttwb_column = "bxsy";
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
		// 是否冲销借款-值
		String sfcxjk_value = "";
		// 是否冲销借款-字段
		String sfcxjk_column = "sfcjk";
		// 报销金额-值
		String bxje_value = "";
		// 报销金额-字段
		String bxje_column = "bxje";
		// 税额合计-值
		String sehj_value = "";
		// 税额合计-字段
		String sehj_column = "sehj";
		// 总帐科目-值
		String zzkm_value = "";
		// 总账科目-字段
		String zzkm_column = "fyyskm";
		// 其他应收款-值
		String qtyszk_value = "";
		// 其他应收款-字段
		String qtyszk_column = "qtyszk";
		// 成本中心-值
		String cbzx_value = "";
		// 成本中心-字段
		String cbzx_column = "fycdbm";
		// 货币码-值
		String hbm_value = "";
		// 货币码-字段
		String hbm_column = "hbm";
		// 实报金额-值
		String sbje_value = "";
		// 实报金额-字段
		String sbje_column = "sbje";
		// 员工编号-值 TODO
		String ygbh_value = "";
		// 员工编号-字段
		String ygbh_column = "ygbh";
		// sysid-值
		String sysid_value = "";
		// sysid-字段
		String sysid_column = "sysid";
		// 值
		String cxjkje_value = "";
		// 字段
		String cxjkje_column = "cxjkje";
		// 值
		String dfkm_value = "";
		// 字段
		String dfkm_column = "qtyszk";
		// 资金预算码-值
		String zjysm_value = "";
		// 资金预算码-字段
		String zjysm_column = "zjysm";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "zy";
		// gsxm-值
		String gsxm_value = "";
		// gsxm-字段
		String gsxm_column = "gsxm";
		// 制单人-值
		String pzzdr_value = "";
		// 制单人-字段
		String pzzdr_column = "pzcjr";
		// 附件张数-值
		String fjzs_column = "fjzs";
		// 附件张数-字段
		String fjzs_value = "";
		// 支付类别-值
		String zflb_value = "";
		// 支付类别-字段
		String zflb_column = "zflb";
		// 其他应付款-个人往来
		String qtyfkgr_value = "";
		String qtyfkgr_column = "qtyfkgr";
		// 其他应付款-集团供应商内部往来
		String qtyfkjtnb_value = "";
		String qtyfkjtnb_column = "qtyfkjtnb";
		// 其他应付款-集团供应商外部往来
		String qtyfkjtwb_value = "";
		String qtyfkjtwb_column = "qtyfkjtwb";
		// 供应商账户组
		String gyszhz_column = "gyszhz";
		String gyszhz_value = "";
		// 供应商编码
		String gysbm_value = "";
		String gysbm_column = "gysbm";
		// 对私支付金额
		String dszfje_column = "dszfje";
		String dszfje_value = "";
		// 对公支付金额
		String dgzfje_column = "dgzfje";
		String dgzfje_value = "";
		// 报销人
		String bxr_column = "bxr";
		String bxr_value = "";
		
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(jbr_column)) {
				try {
					jbr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(pzttwb_column)) {
				pzttwb_value = value;
			}
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
			if (name.equals(sfcxjk_column)) {
				sfcxjk_value = value;
			}
			if (name.equals(bxje_column)) {
				bxje_value = value;
			}
			if (name.equals(zzkm_column)) {
				zzkm_value = value;
			}
			if (name.equals(cbzx_column)) {
				cbzx_value = value;
			}
			if (name.equals(hbm_column)) {
				hbm_value = value;
			}
			if (name.equals(sbje_column)) {
				sbje_value = value;
			}
			if (name.equals(ygbh_column)) {
				ygbh_value = value;
			}
			if (name.equals(sysid_column)) {
				sysid_value = value;
			}
			if (name.equals(qtyszk_column)) {
				qtyszk_value = value;
			}
			if (name.equals(cxjkje_column)) {
				cxjkje_value = value;
			}
			if (name.equals(dfkm_column)) {
				dfkm_value = value;
			}
			if (name.equals(zjysm_column)) {
				zjysm_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(sehj_column)) {
				sehj_value = value;
			}
			if (name.equals(gsxm_column)) {
				gsxm_value = value;
			}
			if (name.equals(pzzdr_column)) {
				try {
					pzzdr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(fjzs_column)) {
				fjzs_value = value;
			}
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
			if (name.equals(qtyfkgr_column)) {
				qtyfkgr_value = value;
			}
			if (name.equals(qtyfkjtnb_column)) {
				qtyfkjtnb_value = value;
			}
			if (name.equals(qtyfkjtwb_column)) {
				qtyfkjtwb_value = value;
			}
			if (name.equals(gyszhz_column)) {
				gyszhz_value = value;
			}
			if (name.equals(gysbm_column)) {
				gysbm_value = value;
			}
			if (name.equals(dszfje_column)) {
				dszfje_value = value;
			}
			if (name.equals(dgzfje_column)) {
				dgzfje_value = value;
			}
			if (name.equals(bxr_column)) {
				bxr_value = value;
			}
			
		}
		String username = "";
		try {
			username = new ResourceComInfo().getLastname(bxr_value);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		writeLog("凭证创建人:" + jbr_value);
		writeLog("凭证抬头文本:" + pzttwb_value);
		writeLog("凭证类型:" + pzlx_value);
		writeLog("参考凭证编号:" + ckpzbh_value);
		writeLog("公司代码:" + gsdm_value);
		writeLog("凭证日期:" + pzrq_value);
		writeLog("过账日期:" + gzrq_value);
		writeLog("是否冲销借款:" + sfcxjk_value);
		writeLog("报销金额:" + bxje_value);
		writeLog("总账科目:" + zzkm_value);
		writeLog("成本中心:" + cbzx_value);
		writeLog("货币码:" + hbm_value);
		writeLog("实报金额:" + sbje_value);
		writeLog("员工编号:" + ygbh_value);
		writeLog("SYSID:" + sysid_value);
		writeLog("其他应收款:" + qtyszk_value);
		writeLog("cxjkje:" + cxjkje_value);
		writeLog("dfkm_value:" + dfkm_value);
		writeLog("资金预算码:" + zjysm_value);
		writeLog("摘要:" + zy_value);
		writeLog("税额合计:" + sehj_value);
		writeLog("凭证制单人:" + pzzdr_value);
		writeLog("附件张数:" + fjzs_value);
		writeLog("支付类别:" + zflb_value);
		writeLog("其他应付款-个人往来:" + qtyfkgr_value);
		writeLog("其他应付款-集团供应商内部往来:" + qtyfkjtnb_value);
		writeLog("其他应付款-集团供应商外部往来:" + qtyfkjtwb_value);
		writeLog("供应商账户组："+gyszhz_value);
		writeLog("供应商编码："+gysbm_value);
		writeLog("对私支付金额："+dszfje_value);
		writeLog("对公支付金额："+dgzfje_value);
		writeLog("报销人："+bxr_value);
		
		String tablename = getPropValue("GXBX", "GFGS_CLFYBX");
		
		String headZY = ("(挂帐)" + zy_value);
		if(headZY.length() > 25) {
			headZY = headZY.substring(0, 25);
		}
		
		// 此场景条件：是否冲销借款为“否”
		if ("1".equals(sfcxjk_value)) {
			String xmlstring = "";
			List<JTCLFBXCreate_HeadModel> headlist = new ArrayList<JTCLFBXCreate_HeadModel>();
			
			JTCLFBXCreate_HeadModel headermodel = new JTCLFBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value, gzrq_value, 
					headZY, ckpzbh_value, "", "", pzzdr_value, "OA系统",fjzs_value);
			headlist.add(headermodel);
			List<JTCLFBXCreate_ItemModel> lines = new ArrayList<JTCLFBXCreate_ItemModel>();
			//对私
			if ("1".equals(zflb_value)) {
				
				String sql = "select b.fyxl,b.bxje,a.fyyskm yskm,b.jxskm,b.se,b.sl,b.sfzp from "
						+ tablename
						+ " a, "
						+ tablename
						+ "_dt1 b where a.id = b.mainid and a.requestid = '"
						+ requestid + "'";
				RecordSet rs = new RecordSet();
				rs.execute(sql);
				while (rs.next()) {
					String yskm = rs.getString("yskm");
					String jxskm = rs.getString("jxskm");
					String se = Util.null2String(rs.getString("se"));
					if("".equals(se)) {
						se = "0";
					}
					String sl = rs.getString("sl");
					String sfzp = Util.null2String(rs.getString("sfzp"));
					String fyxl = rs.getString("fyxl");
					String bxje = rs.getString("bxje");
					double tol = Util.getDoubleValue(bxje)
							- Util.getDoubleValue(se);
					
					//TODO 拼接摘要
					String selectvalue = getZYINFO(fyxl);
					String zy = username + "报" + selectvalue;
					
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm, "", "", sl, df.format(tol), 
							"", "(挂帐)" + zy, "", ckpzbh_value, cbzx_value, gsxm_value, "", "");
					lines.add(line);
					
					if ("0".equals(sfzp)) {
						JTCLFBXCreate_ItemModel line1 = new JTCLFBXCreate_ItemModel("S", jxskm, "", "", sl, se, 
								"", "(挂帐)" + zy , "", ckpzbh_value, "", gsxm_value, "", "");
						lines.add(line1);
					}
				}

				JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", qtyfkgr_value, ygbh_value, "", "", bxje_value, 
						"", "(挂帐)" + zy_value, "", ckpzbh_value, "", gsxm_value, "", "");
				lines.add(line2);
				JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist,lines);
				try {
					xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
				writeLog("股份公司-差旅费报销创建生成凭证创建传入xml参数：" + xmlstring);
				SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
				DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
				DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
				DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
				DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
				try {
					DT_1072_ALL2ERP_KJPZ_RETURN = proxy
							.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
					String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
					writeLog("股份公司-差旅费报销创建生成凭证创建返回消息：" + returnmessage);
					Map<String, String> map = publicmethod
							.readXMLForCLFBXSQAA(returnmessage);
					if (null != map && !map.isEmpty()) {
						String RET_ACCNO = (String) map.get("RET_ACCNO");
						String ZSTATU = (String) map.get("MTYPE");
						String MESSAGE = (String) map.get("MESSAGE");
						String pzacdocno = (String) map.get("pzacdocno");
						if ("S".equalsIgnoreCase(ZSTATU)) {
							publicmethod.updateJTCLFBXCJ(requestid, RET_ACCNO,
									ZSTATU, MESSAGE,pzacdocno,"GFGS_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed",
									"股份公司-差旅费报销创建生成凭证创建失败：RET_ACCNO：" + RET_ACCNO
											+ " MTYPE：" + ZSTATU + " MESSAGE："
											+ MESSAGE);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed",
							"股份公司-差旅费报销创建生成凭证创建接口异常：" + e);
					return SUCCESS;
				}
			}
			
			// 对公
			if ("2".equals(zflb_value)) {
				
				String sql = "select b.fyxl,b.bxje,a.fyyskm yskm,b.jxskm,b.se,b.sl,b.sfzp from "
						+ tablename
						+ " a, "
						+ tablename
						+ "_dt1 b where a.id = b.mainid and a.requestid = '"
						+ requestid + "'";
				RecordSet rs = new RecordSet();
				rs.execute(sql);
				while (rs.next()) {
					String yskm = rs.getString("yskm");
					String jxskm = rs.getString("jxskm");
					String se = Util.null2String(rs.getString("se"));
					if("".equals(se)) {
						se = "0";
					}
					String sl = rs.getString("sl");
					String sfzp = Util.null2String(rs.getString("sfzp"));
					
					String bxje = rs.getString("bxje");
					double tol = Util.getDoubleValue(bxje)
							- Util.getDoubleValue(se);
					
					String fyxl = Util.null2String(rs.getString("fyxl"));
					String selectvalue = getZYINFO(fyxl);
					String zy = username + "报" + selectvalue;
					
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm, "", "", sl, df.format(tol), 
							"", "(挂帐)" + zy , "", ckpzbh_value, cbzx_value, gsxm_value, "", "");
					lines.add(line);
					
					if("0".equals(sfzp)) {
						JTCLFBXCreate_ItemModel line1 = new JTCLFBXCreate_ItemModel("S", jxskm, "", "", sl, se, 
								"", "(挂帐)" + zy, "", ckpzbh_value, "", gsxm_value, "", "");
						lines.add(line1);
					}
				}
				String gyszh = "";
				if ("GX10".equals(gyszhz_value) || "GX11".equals(gyszhz_value)) {
					gyszh = qtyfkjtnb_value;
				} else {
					gyszh = qtyfkjtwb_value;
				}
				JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", gyszh, gysbm_value, "", "", bxje_value, 
						"", "(挂帐)" + zy_value, "", ckpzbh_value, "", gsxm_value, "", "");
				lines.add(line2);
				JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist,lines);
				try {
					xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
				writeLog("股份公司-差旅费报销创建生成凭证创建传入xml参数：" + xmlstring);
				SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
				DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
				DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
				DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
				DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
				try {
					DT_1072_ALL2ERP_KJPZ_RETURN = proxy
							.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
					String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
					writeLog("股份公司-差旅费报销创建生成凭证创建返回消息：" + returnmessage);
					Map<String, String> map = publicmethod
							.readXMLForCLFBXSQAA(returnmessage);
					if (null != map && !map.isEmpty()) {
						String RET_ACCNO = (String) map.get("RET_ACCNO");
						String ZSTATU = (String) map.get("MTYPE");
						String MESSAGE = (String) map.get("MESSAGE");
						String pzacdocno = (String) map.get("pzacdocno");
						if ("S".equalsIgnoreCase(ZSTATU)) {
							publicmethod.updateJTCLFBXCJ(requestid, RET_ACCNO,
									ZSTATU, MESSAGE,pzacdocno,"GFGS_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed",
									"股份公司-差旅费报销创建生成凭证创建失败：RET_ACCNO：" + RET_ACCNO
											+ " MTYPE：" + ZSTATU + " MESSAGE："
											+ MESSAGE);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed",
							"股份公司-差旅费报销创建生成凭证创建接口异常：" + e);
					return SUCCESS;
				}
			}
			// 对私 对公
			if ("0".equals(zflb_value)) {
				
				
				String sql = "select b.fyxl,b.bxje,a.fyyskm yskm,b.sfzp,b.jxskm,b.se,b.sl from "
						+ tablename
						+ " a, "
						+ tablename
						+ "_dt1 b where a.id = b.mainid and a.requestid = '"
						+ requestid + "'";
				RecordSet rs = new RecordSet();
				rs.execute(sql);
				while (rs.next()) {
					String jxskm = rs.getString("jxskm");
					String se = Util.null2String(rs.getString("se"));
					if("".equals(se)) {
						se = "0";
					}
					String sl = rs.getString("sl");
					String yskm = rs.getString("yskm");
					String spzp = Util.null2String(rs.getString("sfzp"));
					
					String bxje = rs.getString("bxje");
					double tol = Util.getDoubleValue(bxje)
							- Util.getDoubleValue(se);
					
					String fyxl = Util.null2String(rs.getString("fyxl"));
					String selectvalue = getZYINFO(fyxl);
					String zy = username + "报" + selectvalue;
					
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm, "", "", sl, df.format(tol), 
							"", "(挂帐)" + zy, "", ckpzbh_value, cbzx_value, gsxm_value, "", "");
					lines.add(line);
					if("0".equals(spzp)) {
						JTCLFBXCreate_ItemModel line1 = new JTCLFBXCreate_ItemModel("S", jxskm, "", "", sl, se, 
								"", "(挂帐)" + zy , "", ckpzbh_value, "", gsxm_value, "", "");
						lines.add(line1);
					}
					
				}
				String gyszh = "";
				if ("GX10".equals(gyszhz_value) || "GX11".equals(gyszhz_value)) {
					gyszh = qtyfkjtnb_value;
				} else {
					gyszh = qtyfkjtwb_value;
				}
				JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", gyszh, gysbm_value, "", "", dgzfje_value, 
						"", "(挂帐)" + zy_value, "", ckpzbh_value, "", gsxm_value, "", "");
				lines.add(line2);
				
				JTCLFBXCreate_ItemModel line3 = new JTCLFBXCreate_ItemModel("H", qtyfkgr_value, ygbh_value, "", "", dszfje_value, 
						"", "(挂帐)" + zy_value, "", ckpzbh_value, "", gsxm_value, "", "");
				lines.add(line3);
				
				JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist,lines);
				try {
					xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
				writeLog("股份公司-差旅费报销创建生成凭证创建传入xml参数：" + xmlstring);
				SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
				DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
				DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
				DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
				DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
				try {
					DT_1072_ALL2ERP_KJPZ_RETURN = proxy
							.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
					String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
					writeLog("股份公司-差旅费报销创建生成凭证创建返回消息：" + returnmessage);
					Map<String, String> map = publicmethod
							.readXMLForCLFBXSQAA(returnmessage);
					if (null != map && !map.isEmpty()) {
						String RET_ACCNO = (String) map.get("RET_ACCNO");
						String ZSTATU = (String) map.get("MTYPE");
						String MESSAGE = (String) map.get("MESSAGE");
						String pzacdocno = (String) map.get("pzacdocno");
						if ("S".equalsIgnoreCase(ZSTATU)) {
							publicmethod.updateJTCLFBXCJ(requestid, RET_ACCNO,
									ZSTATU, MESSAGE,pzacdocno,"GFGS_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed",
									"股份公司-差旅费报销创建生成凭证创建失败：RET_ACCNO：" + RET_ACCNO
											+ " MTYPE：" + ZSTATU + " MESSAGE："
											+ MESSAGE);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed",
							"股份公司-差旅费报销创建生成凭证创建接口异常：" + e);
					return SUCCESS;
				}
			}
		}
		

		// 此场景条件：冲借款，为“是”，实报金额为0
		if ("0".equals(sfcxjk_value) && sbje_value.equals("0")) {
			String xmlstring = "";
			List<JTCLFBXCreate_HeadModel> headlist = new ArrayList<JTCLFBXCreate_HeadModel>();
			JTCLFBXCreate_HeadModel headermodel = new JTCLFBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value, gzrq_value, 
					headZY, ckpzbh_value, "", "", pzzdr_value, "OA系统",fjzs_value);//TODO 附件张数
			headlist.add(headermodel);
			List<JTCLFBXCreate_ItemModel> lines = new ArrayList<JTCLFBXCreate_ItemModel>();
			

			String sql = "select b.fyxl,b.bxje,a.fyyskm yskm,b.sfzp,b.jxskm,b.se,b.sl from "
					+ tablename
					+ " a, "
					+ tablename
					+ "_dt1 b where a.id = b.mainid and a.requestid = '"
					+ requestid + "'";
			RecordSet rs = new RecordSet();
			rs.execute(sql);
			while (rs.next()) {
				String jxskm = rs.getString("jxskm");
				String se = Util.null2String(rs.getString("se"));
				if("".equals(se)) {
					se = "0";
				}
				String sl = rs.getString("sl");
				String yskm = rs.getString("yskm");
				String sfzp = Util.null2String(rs.getString("sfzp"));
				
				String bxje = rs.getString("bxje");
				double tol = Util.getDoubleValue(bxje)
						- Util.getDoubleValue(se);
				
				String fyxl = Util.null2String(rs.getString("fyxl"));
				String selectvalue = getZYINFO(fyxl);
				String zy = username + "报" + selectvalue;
				
				JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm, "", "", sl, df.format(tol), 
						"", "(挂帐)" + zy, "", ckpzbh_value, cbzx_value, gsxm_value, "", "");
				lines.add(line);
				if("0".equals(sfzp)) {
					JTCLFBXCreate_ItemModel line1 = new JTCLFBXCreate_ItemModel("S", jxskm, "", "", sl, se, 
							"", "(挂帐)" + zy , "", ckpzbh_value, "", gsxm_value, "", "");
					lines.add(line1);
				}
				
			}
			
			String jktable = getPropValue("GXBX", "GFGS_FYJK");
			String cltable = getPropValue("GXBX", "GFGS_CLFYBX");
			String sql1 = "select sqbh from "+jktable+" where id in (select b.jkdh from "+cltable+" a,"+cltable+"_dt4 b where a.id = b.mainid and a.requestid = '"+requestid+"')";
			rs.execute(sql1);
			rs.next();
			String jkdh = Util.null2String(rs.getString("sqbh"));
			
			JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", qtyszk_value, ygbh_value, "", "", bxje_value, 
					"", "(挂帐)" + zy_value, "", jkdh, "", gsxm_value, "", "");
			lines.add(line2);
			JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist,lines);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			
			writeLog("股份公司-差旅费报销创建生成凭证创建传入xml参数：" + xmlstring);
			SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
			DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
			DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
			DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
			DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
			try {
				DT_1072_ALL2ERP_KJPZ_RETURN = proxy
						.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
				String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
				writeLog("股份公司-差旅费报销创建生成凭证创建返回消息：" + returnmessage);
				Map<String, String> map = publicmethod
						.readXMLForCLFBXSQAA(returnmessage);
				if (null != map && !map.isEmpty()) {
					String RET_ACCNO = (String) map.get("RET_ACCNO");
					String ZSTATU = (String) map.get("MTYPE");
					String MESSAGE = (String) map.get("MESSAGE");
					String pzacdocno = (String) map.get("pzacdocno");
					if ("S".equalsIgnoreCase(ZSTATU)) {
						publicmethod.updateJTCLFBXCJ(requestid, RET_ACCNO,
								ZSTATU, MESSAGE,pzacdocno,"GFGS_CLFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed",
								"股份公司-差旅费报销创建生成凭证创建失败：RET_ACCNO：" + RET_ACCNO
										+ " MTYPE：" + ZSTATU + " MESSAGE："
										+ MESSAGE);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed",
						"股份公司-差旅费报销创建生成凭证创建接口异常：" + e);
				return SUCCESS;
			}
		}

		// 冲借款，为“是”，实报金额为大于0
		if ("0".equals(sfcxjk_value) && Double.parseDouble(sbje_value) > 0) {
			// 对私
			if ("1".equals(zflb_value)) {
				String xmlstring = "";
				List<JTCLFBXCreate_HeadModel> headlist = new ArrayList<JTCLFBXCreate_HeadModel>();
				JTCLFBXCreate_HeadModel headermodel = new JTCLFBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value, gzrq_value, 
						headZY, ckpzbh_value, "", "", pzzdr_value, "OA系统",fjzs_value);//TODO 附件张数
				headlist.add(headermodel);
				List<JTCLFBXCreate_ItemModel> lines = new ArrayList<JTCLFBXCreate_ItemModel>();

				String sql = "select b.fyxl,b.bxje,b.sfzp,a.fyyskm yskm,b.jxskm,b.se,b.sl from "
						+ tablename
						+ " a, "
						+ tablename
						+ "_dt1 b where a.id = b.mainid and a.requestid = '"
						+ requestid + "'";
				RecordSet rs = new RecordSet();
				rs.execute(sql);
				while (rs.next()) {
					String jxskm = rs.getString("jxskm");
					String se = Util.null2String(rs.getString("se"));
					if("".equals(se)) {
						se = "0";
					}
					String sl = rs.getString("sl");
					String yskm = rs.getString("yskm");
					String sfzp = Util.null2String(rs.getString("sfzp"));
					String bxje = rs.getString("bxje");
					
					double tol = Util.getDoubleValue(bxje)
							- Util.getDoubleValue(se);
					
					String fyxl = Util.null2String(rs.getString("fyxl"));
					String selectvalue = getZYINFO(fyxl);
					String zy = username + "报" + selectvalue;
					
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm, "", "", sl, df.format(tol), 
							"", "(挂帐)" + zy, "", ckpzbh_value, cbzx_value, gsxm_value, "", "");
					lines.add(line);
					if("0".equals(sfzp)) {
						JTCLFBXCreate_ItemModel line1 = new JTCLFBXCreate_ItemModel("S", jxskm, "", "", sl, se, 
								"", "(挂帐)" + zy , "", ckpzbh_value, "", gsxm_value, "", "");
						lines.add(line1);
					}
				}
				
				String jktable = getPropValue("GXBX", "GFGS_FYJK");
				String cltable = getPropValue("GXBX", "GFGS_CLFYBX");
				String sql1 = "select sqbh from "+jktable+" where id in (select b.jkdh from "+cltable+" a,"+cltable+"_dt4 b where a.id = b.mainid and a.requestid = '"+requestid+"')";
				rs.execute(sql1);
				rs.next();
				String jkdh = Util.null2String(rs.getString("sqbh"));
				
				JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", qtyfkgr_value, ygbh_value, "", "", sbje_value, 
						"", "(挂帐)" + zy_value, "", ckpzbh_value, "", gsxm_value, "", "");
				lines.add(line2);
				JTCLFBXCreate_ItemModel line3 = new JTCLFBXCreate_ItemModel("H", qtyszk_value, ygbh_value, "", "", cxjkje_value, 
						"", "(挂帐)" + zy_value, "", jkdh, "", gsxm_value, "", "");
				lines.add(line3);
				JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist,lines);
				try {
					xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
				
				writeLog("股份公司-差旅费报销创建生成凭证创建传入xml参数：" + xmlstring);
				SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
				DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
				DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
				DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
				DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
				try {
					DT_1072_ALL2ERP_KJPZ_RETURN = proxy
							.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
					String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
					writeLog("股份公司-差旅费报销创建生成凭证创建返回消息：" + returnmessage);
					Map<String, String> map = publicmethod
							.readXMLForCLFBXSQAA(returnmessage);
					if (null != map && !map.isEmpty()) {
						String RET_ACCNO = (String) map.get("RET_ACCNO");
						String ZSTATU = (String) map.get("MTYPE");
						String MESSAGE = (String) map.get("MESSAGE");
						String pzacdocno = (String) map.get("pzacdocno");
						if ("S".equalsIgnoreCase(ZSTATU)) {
							publicmethod.updateJTCLFBXCJ(requestid, RET_ACCNO,
									ZSTATU, MESSAGE,pzacdocno,"GFGS_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed",
									"股份公司-差旅费报销创建生成凭证创建失败：RET_ACCNO：" + RET_ACCNO
											+ " MTYPE：" + ZSTATU + " MESSAGE："
											+ MESSAGE);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed",
							"股份公司-差旅费报销创建生成凭证创建接口异常：" + e);
					return SUCCESS;
				}
			}
			if ("0".equals(zflb_value)) {
				String xmlstring = "";
				List<JTCLFBXCreate_HeadModel> headlist = new ArrayList<JTCLFBXCreate_HeadModel>();
				JTCLFBXCreate_HeadModel headermodel = new JTCLFBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value, gzrq_value, 
						headZY, ckpzbh_value, "", "", pzzdr_value, "OA系统",fjzs_value);//TODO 附件张数
				headlist.add(headermodel);
				List<JTCLFBXCreate_ItemModel> lines = new ArrayList<JTCLFBXCreate_ItemModel>();

				String sql = "select b.fyxl,b.bxje,b.sfzp,a.fyyskm yskm,b.jxskm,b.se,b.sl from "
						+ tablename
						+ " a, "
						+ tablename
						+ "_dt1 b where a.id = b.mainid and a.requestid = '"
						+ requestid + "'";
				RecordSet rs = new RecordSet();
				rs.execute(sql);
				while (rs.next()) {
					String jxskm = rs.getString("jxskm");
					String se = Util.null2String(rs.getString("se"));
					if("".equals(se)) {
						se = "0";
					}
					String sl = rs.getString("sl");
					String yskm = rs.getString("yskm");
					String sfzp = Util.null2String(rs.getString("sfzp"));
					String bxje = rs.getString("bxje");
					
					double tol = Util.getDoubleValue(bxje)
							- Util.getDoubleValue(se);
					
					String fyxl = Util.null2String(rs.getString("fyxl"));
					String selectvalue = getZYINFO(fyxl);
					String zy = username + "报" + selectvalue;
					
					JTCLFBXCreate_ItemModel line = new JTCLFBXCreate_ItemModel("S", yskm, "", "", sl, df.format(tol), 
							"", "(挂帐)" + zy, "", ckpzbh_value, cbzx_value, gsxm_value, "", "");
					lines.add(line);
					if("0".equals(sfzp)) {
						JTCLFBXCreate_ItemModel line1 = new JTCLFBXCreate_ItemModel("S", jxskm, "", "", sl, se, 
								"", "(挂帐)" + zy , "", ckpzbh_value, "", gsxm_value, "", "");
						lines.add(line1);
					}
				}
				
				String jktable = getPropValue("GXBX", "GFGS_FYJK");
				String cltable = getPropValue("GXBX", "GFGS_CLFYBX");
				String sql1 = "select sqbh from "+jktable+" where id in (select b.jkdh from "+cltable+" a,"+cltable+"_dt4 b where a.id = b.mainid and a.requestid = '"+requestid+"')";
				rs.execute(sql1);
				rs.next();
				String jkdh = Util.null2String(rs.getString("sqbh"));
				
				JTCLFBXCreate_ItemModel line2 = new JTCLFBXCreate_ItemModel("H", qtyszk_value, ygbh_value, "", "", cxjkje_value, 
						"", "(挂帐)" + zy_value, "", jkdh, "", gsxm_value, "", "");
				lines.add(line2);
				
				JTCLFBXCreate_ItemModel line4 = new JTCLFBXCreate_ItemModel("H", qtyfkgr_value, ygbh_value, "", "", dszfje_value, 
						"", "(挂帐)" + zy_value, "", ckpzbh_value, "", gsxm_value, "", "");
				lines.add(line4);
				
				String gyszh = "";
				if ("GX10".equals(gyszhz_value) || "GX11".equals(gyszhz_value)) {
					gyszh = qtyfkjtnb_value;
				} else {
					gyszh = qtyfkjtwb_value;
				}
				JTCLFBXCreate_ItemModel line3 = new JTCLFBXCreate_ItemModel("H", gyszh, gysbm_value, "", "", dgzfje_value, 
						"", "(挂帐)" + zy_value, "", ckpzbh_value, "", gsxm_value, "", "");
				lines.add(line3);
				
				JTCLFBXCreateModel model = new JTCLFBXCreateModel(headlist,lines);
				try {
					xmlstring = XMLUtil.beanToXml(model, JTCLFBXCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
				
				writeLog("股份公司-差旅费报销创建生成凭证创建传入xml参数：" + xmlstring);
				SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
				DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
				DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
				DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
				DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
				try {
					DT_1072_ALL2ERP_KJPZ_RETURN = proxy
							.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
					String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
					writeLog("股份公司-差旅费报销创建生成凭证创建返回消息：" + returnmessage);
					Map<String, String> map = publicmethod
							.readXMLForCLFBXSQAA(returnmessage);
					if (null != map && !map.isEmpty()) {
						String RET_ACCNO = (String) map.get("RET_ACCNO");
						String ZSTATU = (String) map.get("MTYPE");
						String MESSAGE = (String) map.get("MESSAGE");
						String pzacdocno = (String) map.get("pzacdocno");
						if ("S".equalsIgnoreCase(ZSTATU)) {
							publicmethod.updateJTCLFBXCJ(requestid, RET_ACCNO,
									ZSTATU, MESSAGE,pzacdocno,"GFGS_CLFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed",
									"股份公司-差旅费报销创建生成凭证创建失败：RET_ACCNO：" + RET_ACCNO
											+ " MTYPE：" + ZSTATU + " MESSAGE："
											+ MESSAGE);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed",
							"股份公司-差旅费报销创建生成凭证创建接口异常：" + e);
					return SUCCESS;
				}
			}
			
		}
		return SUCCESS;
	}
	
	public String getZYINFO(String fyxl) {
		RecordSet rs = new RecordSet();
		String fieldid = getPropValue("GXBX", "GFGS_FYXL_FIELDID");
		String sql = "select selectname from WORKFLOW_SELECTITEM where fieldid = '"+fieldid+"' and SELECTVALUE = '"+fyxl+"'";
		rs.execute(sql);
		rs.next();
		String name = Util.null2String(rs.getString("selectname"));
		return name;
	}
	
	public static void main(String[] args) {
		String zy_value = "aaaaaaaaaaaaaaaaaaaa";
		String headZY = ("(挂帐)" + zy_value);
		if(headZY.length() > 25) {
			headZY = headZY.substring(0, 25);
		}
		System.out.println(headZY);
		System.out.println(headZY.length());
	}
}
