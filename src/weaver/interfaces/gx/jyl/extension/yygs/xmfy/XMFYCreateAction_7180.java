package weaver.interfaces.gx.jyl.extension.yygs.xmfy;

import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ;
import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ_RETURN;
import net.jsgx.www.E1D.service.SI_1072_ALL2ERP_KJPZ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_YBFYBXCreateModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_YBFYBXCreate_HeadModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_YBFYBXCreate_ItemModel;
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

public class XMFYCreateAction_7180 extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();
	DecimalFormat df = new DecimalFormat("######0.00");

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String workflowid = request.getWorkflowid();
		String src = request.getRequestManager().getSrc();
		String tablename = request.getRequestManager().getBillTableName();
		if (!"submit".equals(src)) {
			new BaseBean().writeLog("一般费用报销退回操作，不执行接口.");
			return SUCCESS;
		}
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
		// SYSID-值
		String sysid_value = "";
		// SYSID-字段
		String sysid_column = "sysid";
		// 员工编号-值
		String ygbh_value = "";
		// 员工编号-字段
		String ygbh_column = "ygbh";
		// 应收款-其他-值
		String qtyszk_value = "";
		// 应收款-其他-字段
		String qtyszk_column = "qtyszk";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "zy";
		// 报销方式-值
		String bxfs_value = "";
		// 报销方式-字段
		String bxfs_column = "bxfs";
		// 申请人-字段
		String jbr_column = "jbr";
		String jbr_value = "jbr";
		// 货币吗
		String hbm_column = "hbm";
		String hbm_value = "";
		// 报销金额
		String bxje_column = "bxje";
		String bxje_value = "";
		// 实报金额
		String sbje_column = "sbje";
		String sbje_value = "";
		// 归属项目
		String gsxm_value = "";
		String gsxm_column = "gsxm";
		// 费用审批类别
		String fylx_value = "";
		String fylx_column = "fylb";
		// 制单人-值
		String pzzdr_value = "";
		// 制单人-字段
		String pzzdr_column = "pzcjr";
		// 支付类别-值
		String zflb_value = "";
		// 支付类别-字段
		String zflb_column = "zflb";
		// 其他应付款-个人往来-值
		String qtyfkgr_value = "";
		// 其他应付款-个人往来-字段
		String qtyfkgr_column = "qtyfkgr";
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
		// 一次性供应商名称-字段
		String ycxgysmc_column = "ycxgysmc";
		// 一次性供应商名称-值
		String ycxgysmc_value = "";
		// 一次性供应商编码-值
		String ycxgysbm_value = "";
		// 一次性供应商编码-字段
		String ycxgysbm_column = "ycxgysbm";
		// 供应商编码-值
		String gysbm_value = "";
		// 供应商编码-字段
		String gysbm_colum = "gysbm";
		// 附件张数-值
		String fjzs_value = "";
		// 附件张数-字段
		String fjzs_column = "fjzs";
		// 冲借款金额
		String cjkje_column = "cjkje";
		String cjkje_value = "";
		
		
		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
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
			if (name.equals(sysid_column)) {
				sysid_value = value;
			}
			if (name.equals(ygbh_column)) {
				ygbh_value = value;
			}
			if (name.equals(qtyszk_column)) {
				qtyszk_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(bxfs_column)) {
				bxfs_value = value;
			}
			if (name.equals(hbm_column)) {
				hbm_value = value;
			}
			if (name.equals(bxje_column)) {
				bxje_value = value;
			}
			if (name.equals(gsxm_column)) {
				gsxm_value = value;
			}
			if (name.equals(fylx_column)) {
				fylx_value = value;
			}
			if (name.equals(jbr_column)) {
				try {
					jbr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			if (name.equals(sbje_column)) {
				sbje_value = value;
			}
			if (name.equals(pzzdr_column)) {
				try {
					pzzdr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(zflb_column)) {
				zflb_value = value;
			}
			if (name.equals(qtyfkgr_column)) {
				qtyfkgr_value = value;
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
			if (name.equals(ycxgysmc_column)) {
				ycxgysmc_value = value;
			}
			if (name.equals(ycxgysbm_column)) {
				ycxgysbm_value = value;
			}
			if (name.equals(gysbm_colum)) {
				gysbm_value = value;
			}
			if (name.equals(fjzs_column)) {
				fjzs_value = value;
			}
			if (name.equals(cjkje_column)) {
				cjkje_value = value;
			}
		}
		writeLog("凭证抬头文本:" + pzttwb_value);
		writeLog("凭证类型:" + pzlx_value);
		writeLog("参考凭证编号:" + ckpzbh_value);
		writeLog("公司代码:" + gsdm_value);
		writeLog("凭证日期:" + pzrq_value);
		writeLog("过账日期:" + gzrq_value);
		writeLog("SYSID:" + sysid_value);
		writeLog("员工编号:" + ygbh_value);
		writeLog("应收款-其他:" + qtyszk_value);
		writeLog("摘要:" + zy_value);
		writeLog("报销方式:" + bxfs_value);
		writeLog("创建人:" + jbr_value);
		writeLog("货币码:" + hbm_value);
		writeLog("报销金额:" + bxje_value);
		writeLog("实报金额:" + sbje_value);
		writeLog("归属项目:" + gsxm_value);
		writeLog("费用审批类别:" + fylx_value);
		writeLog("凭证制单人:" + pzzdr_value);
		writeLog("支付类别:" + zflb_value);
		writeLog("其他应付款-个人往来:" + qtyfkgr_value);
		writeLog("供应商账户组:" + gyszhz_value);
		writeLog("其他应付款-集团供应商内部往来:" + qtyfkjtnb_value);
		writeLog("其他应付款-集团供应商外部往来:" + qtyfkjtwb_value);
		writeLog("一次性供应商名称:" + ycxgysmc_value);
		writeLog("一次性供应商编码:" + ycxgysbm_value);
		writeLog("供应商编码:" + gysbm_value);
		writeLog("附件张数:" + fjzs_value);
		writeLog("冲借款金额:" + cjkje_value);


		boolean exist = false;
		String cpsql = "select * from formtable_main_1285 where zt='0' and mc like '%挂车牌%' and id = "+fylx_value+"";
		RecordSet recordSet = new RecordSet();
		recordSet.execute(cpsql);
		if(recordSet.next()) {
			exist = true;
		}

		String headZY = ("(挂帐)" + zy_value);
		if(headZY.length() > 25) {
			headZY = headZY.substring(0, 25);
		}
		
		// 此场景条件：报销方式为“直接报销”
		if ("2".equals(bxfs_value)) {
			// 对私 zflb_value 为 0
			if ("0".equals(zflb_value)) {
				String xmlstring = "";
				List<JTFYBX_YBFYBXCreate_HeadModel> headlist = new ArrayList<JTFYBX_YBFYBXCreate_HeadModel>();
				JTFYBX_YBFYBXCreate_HeadModel headermodel = new JTFYBX_YBFYBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value,
						gzrq_value, headZY, ckpzbh_value, hbm_value, "", pzzdr_value, "OA系统",fjzs_value);
				headlist.add(headermodel);
				List<JTFYBX_YBFYBXCreate_ItemModel> lines = new ArrayList<JTFYBX_YBFYBXCreate_ItemModel>();
				RecordSet rs = new RecordSet();
				// select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl,a.cbzx,b.cph,b.jtwbs
				String sql = "select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl,a.cbzx,b.jtwbs from " + tablename + " a," + tablename
						+ "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "'";
				rs.execute(sql);
				while (rs.next()) {
					String jtwbs_value = Util.null2o(rs.getString("jtwbs"));
					String yskm_value = Util.null2o(rs.getString("yskm"));
					String bxjes_value = Util.null2o(rs.getString("bxje"));
					String se_value = Util.null2o(rs.getString("se"));
					String jxskm_value = Util.null2o(rs.getString("jxskm"));
					String sfzp_value = Util.null2o(rs.getString("sfzp"));
					String sl_value = Util.null2o(rs.getString("sl"));
					String cbzx_value = Util.null2o(rs.getString("cbzx"));
					double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
					String AUFNR_VALUE = "";
					if (exist) {
						AUFNR_VALUE = "";
					} else {
						AUFNR_VALUE = gsxm_value;
					}
					if ("0".equals(sfzp_value)) {
						JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", sl_value,
								df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, jtwbs_value, "");
						lines.add(line);
						String AUFNR_VALUES = "";
						if (exist) {
							AUFNR_VALUES = "";
						} else {
							AUFNR_VALUES = gsxm_value;
						}
						// 稅不带成本中心
						JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("S", jxskm_value, "", "",
								sl_value, se_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES, "", "");
						lines.add(line2);
					} else {
						JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", "",
								df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, jtwbs_value, "");
						lines.add(line);
					}
				}
				String AUFNR_VALUES2 = "";
				if (exist) {
					AUFNR_VALUES2 = "";
				} else {
					AUFNR_VALUES2 = gsxm_value;
				}
				//贷方没有成本中心
				JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("H", qtyfkgr_value, ygbh_value, "", "",
						bxje_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES2, "", "");
				lines.add(line2);
				JTFYBX_YBFYBXCreateModel model = new JTFYBX_YBFYBXCreateModel(headlist, lines);
				try {
					xmlstring = XMLUtil.beanToXml(model, JTFYBX_YBFYBXCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}

				writeLog("一般费用报销(直接报销／个人)传入xml参数：" + xmlstring);

				SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
				DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
				DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
				DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
				DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
				try {
					DT_1072_ALL2ERP_KJPZ_RETURN = proxy.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
					String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
					writeLog("一般费用报销(直接报销／个人)创建返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
					if (null != map && !map.isEmpty()) {
						String RET_ACCNO = (String) map.get("RET_ACCNO");
						String ZSTATU = (String) map.get("MTYPE");
						String MESSAGE = (String) map.get("MESSAGE");
						String pzacdocno = (String) map.get("pzacdocno");
						if ("S".equalsIgnoreCase(ZSTATU)) {
							updateJTYBFBXCJ(tablename,requestid, RET_ACCNO, ZSTATU, MESSAGE, pzacdocno, "JTFYBX_YBFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed",
									"一般费用报销(直接报销／个人)创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + MESSAGE);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "一般费用报销(直接报销／个人)创建接口异常：" + e);
					return SUCCESS;
				}
			}
			//  对公
			if ("1".equals(zflb_value) || "4".equals(zflb_value)) {
				String xmlstring = "";
				List<JTFYBX_YBFYBXCreate_HeadModel> headlist = new ArrayList<JTFYBX_YBFYBXCreate_HeadModel>();
				JTFYBX_YBFYBXCreate_HeadModel headermodel = new JTFYBX_YBFYBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value,
						gzrq_value, headZY, ckpzbh_value, hbm_value, "", pzzdr_value, "OA系统",fjzs_value);
				headlist.add(headermodel);
				List<JTFYBX_YBFYBXCreate_ItemModel> lines = new ArrayList<JTFYBX_YBFYBXCreate_ItemModel>();
				RecordSet rs = new RecordSet();
				String sql = "select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl,a.cbzx,b.jtwbs from " + tablename + " a," + tablename
						+ "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "'";
				rs.execute(sql);
				while (rs.next()) {
					String jtwbs_value = Util.null2o(rs.getString("jtwbs"));
					String yskm_value = Util.null2o(rs.getString("yskm"));
					String bxjes_value = Util.null2o(rs.getString("bxje"));
					String se_value = Util.null2o(rs.getString("se"));
					String jxskm_value = Util.null2o(rs.getString("jxskm"));
					String sfzp_value = Util.null2o(rs.getString("sfzp"));
					String sl_value = Util.null2o(rs.getString("sl"));
					String cbzx_value = Util.null2o(rs.getString("cbzx"));
					double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
					String AUFNR_VALUE = "";
					if (exist) {
						AUFNR_VALUE = "";
					} else {
						AUFNR_VALUE = gsxm_value;
					}
					if ("0".equals(sfzp_value)) {
						JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", sl_value,
								df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, jtwbs_value, "");
						lines.add(line);
						String AUFNR_VALUES = "";
						if (exist) {
							AUFNR_VALUES = "";
						} else {
							AUFNR_VALUES = gsxm_value;
						}
						JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("S", jxskm_value, "", "",
								sl_value, se_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES, "", "");
						lines.add(line2);
					} else {
						JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", "",
								df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, jtwbs_value, "");
						lines.add(line);
					}
				}
				String AUFNR_VALUES2 = "";
				if (exist) {
					AUFNR_VALUES2 = "";
				} else {
					AUFNR_VALUES2 = gsxm_value;
				}
				// 判断是否是一次性供应商 3 ： 一次性供应商
				if ("3".equals(zflb_value)) {
					// 传一次性供应商 供应商编码
					JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("H", qtyfkjtwb_value, ycxgysbm_value, ycxgysmc_value, "",
							bxje_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES2, "", "");
					lines.add(line2);
				} else {
					// 不是一次性供应商  判断是否是内部供应商
					if ("GX10".equals(gyszhz_value) || "GX11".equals(gyszhz_value)) {
						JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("H", qtyfkjtnb_value, gysbm_value, "", "",
								bxje_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES2, "", "");
						lines.add(line2);
					} else {
						JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("H", qtyfkjtwb_value, gysbm_value, "", "",
								bxje_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES2, "", "");
						lines.add(line2);
					}
				}
				
				JTFYBX_YBFYBXCreateModel model = new JTFYBX_YBFYBXCreateModel(headlist, lines);
				try {
					xmlstring = XMLUtil.beanToXml(model, JTFYBX_YBFYBXCreateModel.class);
				} catch (JAXBException e) {
					e.printStackTrace();
				}

				writeLog("一般费用报销(直接报销／对公)传入xml参数：" + xmlstring);

				SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
				DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
				DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
				DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
				DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
				try {
					DT_1072_ALL2ERP_KJPZ_RETURN = proxy.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
					String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
					writeLog("一般费用报销(直接报销／对公)创建返回消息：" + returnmessage);
					Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
					if (null != map && !map.isEmpty()) {
						String RET_ACCNO = (String) map.get("RET_ACCNO");
						String ZSTATU = (String) map.get("MTYPE");
						String MESSAGE = (String) map.get("MESSAGE");
						String pzacdocno = (String) map.get("pzacdocno");
						if ("S".equalsIgnoreCase(ZSTATU)) {
							updateJTYBFBXCJ(tablename,requestid, RET_ACCNO, ZSTATU, MESSAGE, pzacdocno, "JTFYBX_YBFYBX");
						} else {
							publicmethod.setFailMessage(request, "failed",
									"一般费用报销(直接报销／对公)创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + MESSAGE);
							return SUCCESS;
						}
					}
				} catch (RemoteException e) {
					publicmethod.setFailMessage(request, "failed", "一般费用报销(直接报销／对公)创建接口异常：" + e);
					return SUCCESS;
				}
			}
		}
		// 冲销借款
		if ("0".equals(bxfs_value) && "0".equals(sbje_value)) {
			String xmlstring = "";
			List<JTFYBX_YBFYBXCreate_HeadModel> headlist = new ArrayList<JTFYBX_YBFYBXCreate_HeadModel>();
			JTFYBX_YBFYBXCreate_HeadModel headermodel = new JTFYBX_YBFYBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value,
					gzrq_value, headZY, ckpzbh_value, hbm_value, "", pzzdr_value, "OA系统",fjzs_value);
			headlist.add(headermodel);
			List<JTFYBX_YBFYBXCreate_ItemModel> lines = new ArrayList<JTFYBX_YBFYBXCreate_ItemModel>();

			RecordSet rs = new RecordSet();
			String sql = "select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl,a.cbzx,b.jtwbs from " + tablename + " a," + tablename
					+ "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "'";
			rs.execute(sql);
			while (rs.next()) {
				String jtwbs_value = Util.null2o(rs.getString("jtwbs"));
				String yskm_value = Util.null2o(rs.getString("yskm"));
				String bxjes_value = Util.null2o(rs.getString("bxje"));
				String se_value = Util.null2o(rs.getString("se"));
				String jxskm_value = Util.null2o(rs.getString("jxskm"));
				String sfzp_value = Util.null2o(rs.getString("sfzp"));
				String sl_value = Util.null2o(rs.getString("sl"));
				String cbzx_value = Util.null2o(rs.getString("cbzx"));
				String cph_value = Util.null2String(rs.getString("cph"));
				double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);

				String AUFNR_VALUE = "";
				if (exist) {
					AUFNR_VALUE = "";
				} else {
					AUFNR_VALUE = gsxm_value;
				}
				if ("0".equals(sfzp_value)) {
					JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", sl_value,
							df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, jtwbs_value, "");
					lines.add(line);
					
					String AUFNR_VALUES = "";
					if (exist) {
						AUFNR_VALUES = "";
					} else {
						AUFNR_VALUES = gsxm_value;
					}

					JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("S", jxskm_value, "", "",
							sl_value, se_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES, "", "");
					lines.add(line2);
				} else {
					JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", "",
							df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, cbzx_value, AUFNR_VALUE, jtwbs_value, "");
					lines.add(line);
				}
			}

			String AUFNR_VALUES2 = "";
			if (exist) {
				AUFNR_VALUES2 = "";
			} else {
				AUFNR_VALUES2 = gsxm_value;
			}

			String jkTable = getPropValue("fna_extension", "fyjk_"+workflowid);
			
			String sql2 = "select sqbh from "+jkTable+" where id in (select b.jkdh from " + tablename + " a, " + tablename + "_dt3 b where a.id = b.mainid and a.requestid = '"+requestid+"')";
			writeLog("获取借款单号SQL："+sql2);
			rs.execute(sql2);
			rs.next();
			String jkdh = Util.null2String(rs.getString("sqbh"));
			writeLog("获取借款单号："+jkdh);
			JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("H", qtyszk_value, ygbh_value, "", "",
					cjkje_value, "", "(挂帐)" + zy_value, "", jkdh, "", AUFNR_VALUES2, "", "");
			lines.add(line2);
			JTFYBX_YBFYBXCreateModel model = new JTFYBX_YBFYBXCreateModel(headlist, lines);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTFYBX_YBFYBXCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			writeLog("一般费用报销(冲销借款/个人 实报金额等于0)传入xml参数：" + xmlstring);

			SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
			DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
			DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
			DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
			DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
			try {
				DT_1072_ALL2ERP_KJPZ_RETURN = proxy.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
				String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
				writeLog("一般费用报销(冲销借款/个人 实报金额等于0)创建返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
				if (null != map && !map.isEmpty()) {
					String RET_ACCNO = (String) map.get("RET_ACCNO");
					String ZSTATU = (String) map.get("MTYPE");
					String MESSAGE = (String) map.get("MESSAGE");
					String pzacdocno = (String) map.get("pzacdocno");
					if ("S".equalsIgnoreCase(ZSTATU)) {
						updateJTYBFBXCJ(tablename,requestid, RET_ACCNO, ZSTATU, MESSAGE, pzacdocno, "JTFYBX_YBFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed",
								"一般费用报销(冲销借款/个人)创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + MESSAGE);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销(冲销借款/个人)创建接口异常：" + e);
				return SUCCESS;
			}
		}
		if ("0".equals(bxfs_value) && Double.parseDouble(sbje_value) > 0) {

			String xmlstring = "";
			List<JTFYBX_YBFYBXCreate_HeadModel> headlist = new ArrayList<JTFYBX_YBFYBXCreate_HeadModel>();
			JTFYBX_YBFYBXCreate_HeadModel headermodel = new JTFYBX_YBFYBXCreate_HeadModel(gsdm_value, pzlx_value, pzrq_value,
					gzrq_value, headZY, ckpzbh_value, hbm_value, "", pzzdr_value, "OA系统",fjzs_value);
			headlist.add(headermodel);
			List<JTFYBX_YBFYBXCreate_ItemModel> lines = new ArrayList<JTFYBX_YBFYBXCreate_ItemModel>();

			RecordSet rs = new RecordSet();
			String sql = "select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl,a.cbzx,b.jtwbs from " + tablename + " a," + tablename
					+ "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "'";
			rs.execute(sql);
			while (rs.next()) {
				String jtwbs_value = Util.null2o(rs.getString("jtwbs"));
				String yskm_value = Util.null2o(rs.getString("yskm"));
				String bxjes_value = Util.null2o(rs.getString("bxje"));
				String se_value = Util.null2o(rs.getString("se"));
				String jxskm_value = Util.null2o(rs.getString("jxskm"));
				String sfzp_value = Util.null2o(rs.getString("sfzp"));
				String sl_value = Util.null2o(rs.getString("sl"));
				String cbzx_value = Util.null2o(rs.getString("cbzx"));
				String cph_value = Util.null2String(rs.getString("cph"));
				double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);

				String AUFNR_VALUE = "";
				if (exist) {
					AUFNR_VALUE = "";
				} else {
					AUFNR_VALUE = gsxm_value;
				}
				if ("0".equals(sfzp_value)) {
					JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", sl_value,
							df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, jtwbs_value, "");
					lines.add(line);
					String AUFNR_VALUES = "";
					if (exist) {
						AUFNR_VALUES = "";
					} else {
						AUFNR_VALUES = gsxm_value;
					}

					JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("S", jxskm_value, "", "",
							sl_value, se_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES, "", "");
					lines.add(line2);
				} else {
					JTFYBX_YBFYBXCreate_ItemModel line = new JTFYBX_YBFYBXCreate_ItemModel("S", yskm_value, "", "", "",
							df.format(tol), "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUE, jtwbs_value, "");
					lines.add(line);
				}
			}

			String AUFNR_VALUES2 = "";
			if (exist) {
				AUFNR_VALUES2 = "";
			} else {
				AUFNR_VALUES2 = gsxm_value;
			}

			String jkTable = getPropValue("fna_extension", "fyjk_"+workflowid);
			
			String sql2 = "select sqbh from "+jkTable+" where id in (select b.jkdh from " + tablename + " a, " + tablename + "_dt3 b where a.id = b.mainid and a.requestid = '"+requestid+"')";
			writeLog("获取借款单号SQL："+sql2);
			rs.execute(sql2);
			rs.next();
			String jkdh = Util.null2String(rs.getString("sqbh"));
			writeLog("获取借款单号："+jkdh);
			
			JTFYBX_YBFYBXCreate_ItemModel line2 = new JTFYBX_YBFYBXCreate_ItemModel("H", qtyszk_value, ygbh_value, "", "",
					cjkje_value, "", "(挂帐)" + zy_value, "", jkdh, "", AUFNR_VALUES2, "", "");//借款单
			lines.add(line2);
			JTFYBX_YBFYBXCreate_ItemModel line3 = new JTFYBX_YBFYBXCreate_ItemModel("H", qtyfkgr_value, ygbh_value, "", "",
					sbje_value, "", "(挂帐)" + zy_value, "", ckpzbh_value, "", AUFNR_VALUES2, "", "");//系统OA单号
			lines.add(line3);
			JTFYBX_YBFYBXCreateModel model = new JTFYBX_YBFYBXCreateModel(headlist, lines);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTFYBX_YBFYBXCreateModel.class);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			writeLog("一般费用报销(冲销借款／个人 实报金额大于0)传入xml参数：" + xmlstring);

			SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
			DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
			DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
			DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
			DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
			try {
				DT_1072_ALL2ERP_KJPZ_RETURN = proxy.SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
				String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
				writeLog("一般费用报销(冲销借款／个人 实报金额大于0)创建返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForCLFBXSQAA(returnmessage);
				if (null != map && !map.isEmpty()) {
					String RET_ACCNO = (String) map.get("RET_ACCNO");
					String ZSTATU = (String) map.get("MTYPE");
					String MESSAGE = (String) map.get("MESSAGE");
					String pzacdocno = (String) map.get("pzacdocno");
					if ("S".equalsIgnoreCase(ZSTATU)) {
						updateJTYBFBXCJ(tablename,requestid, RET_ACCNO, ZSTATU, MESSAGE, pzacdocno,"JTFYBX_YBFYBX");
					} else {
						publicmethod.setFailMessage(request, "failed",
								"一般费用报销(冲销借款／个人)创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + MESSAGE);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销(冲销借款／个人)创建接口异常：" + e);
				return SUCCESS;
			}
		}
		return SUCCESS;
	}

	public void updateJTYBFBXCJ(String tablename, String requestid,
								String RET_ACCNO,
								String ZSTATU,
								String ZDESC,String pzacdocno,String bs) {
		RecordSet rs = new RecordSet();
		String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"',pzacdocno = '"+pzacdocno+"' where requestid = '"+requestid+"'";
		rs.execute(sql);
	}
}
