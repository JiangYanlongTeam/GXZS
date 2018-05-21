package weaver.interfaces.gx.jyl.cwpz;

import java.rmi.RemoteException;
import java.util.Map;

import net.jsgx.www.E5D.service.DT_1057_OA2ERP_KJPZ;
import net.jsgx.www.E5D.service.DT_1057_OA2ERP_KJPZ_RETURN;
import net.jsgx.www.E5D.service.SI_1057_OA2ERP_KJPZ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 一般费用报销凭证支付申请创建
 */
public class ZJPZSQYBCreateAction extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if (!"submit".equals(src)) {
            new weaver.general.BaseBean().writeLog("一般费用报销退回操作，不执行接口.");
            return SUCCESS;
        }
        //凭证创建人-值
        String jbr_value = "";
        //凭证创建人-字段
        String jbr_column = "pzcjr";
        //凭证抬头文本-值
        String pzttwb_value = "";
        //凭证抬头文本-字段
        String pzttwb_column = "bxsy";
        //凭证类型-值
        String pzlx_value = "";
        //凭证类型-字段
        String pzlx_column = "pzlx";
        //参考凭证编号-值
        String ckpzbh_value = "";
        //参考凭证编号-字段
        String ckpzbh_column = "sqbh";
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //凭证日期-值
        String pzrq_value = "";
        //凭证日期-字段
        String pzrq_column = "pzrq";
        //过账日期-值
        String gzrq_value = "";
        //过账日期-字段
        String gzrq_column = "gzrq";
        //报销方式-值
        String sfcxjk_value = "";
        //报销方式-字段
        String sfcxjk_column = "bxfs";
        //货币码-值
        String hbm_value = "";
        //货币码-字段
        String hbm_column = "hbm";
        //SYSID-值
        String sysid_value = "";
        //SYSID-字段
        String sysid_column = "sysid";
        //实报金额-值
        String sbje_value = "";
        //实报金额-字段
        String sbje_column = "sbje";
        //员工编号-值
        String ygbh_value = "";
        //员工编号-字段
        String ygbh_column = "ygbh";
        //报销金额-值
        String bxje_value = "";
        //报销金额-字段
        String bxje_column = "bxje";
        //应收款-其他-值
        String qtyszk_value = "";
        //应收款-其他-字段
        String qtyszk_column = "qtyszk";
        //预付账款-其他-值
        String qtyfzk_value = "";
        //预付账款-其他-字段
        String qtyfzk_column = "qtyfzk";
        //现金科目-值
        String xjkm_value = "";
        //现金科目-字段
        String xjkm_column = "xjkm";
        //冲销借款金额-值
        String cjkje_value = "";
        //冲销借款金额-字段
        String cjkje_column = "cjkje";
        //还款金额-值
        String hkje_value = "";
        //还款金额-字段
        String hkje_column = "hkje";
        //冲预付款金额-值
        String cfykje_value = "";
        //
        String cfykje_column = "cfykje";
        //贷方科目-值
        String dfkm_value = "";
        //贷方科目-字段
        String dfkm_column = "dfkm";
        String khgys_column = "khgys";
        String khgys_value = "";
        //资金预算码-值
        String zjysm_value = "";
        //资金预算码-字段
        String zjysm_column = "zjysm";
        //成本中心-值
        String cbzx_value = "";
        //成本中心-字段
        String cbzx_column = "cbzx";
        //摘要-值
        String zy_value = "";
        //摘要-字段
        String zy_column = "zy";
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if(name.equals(jbr_column)) {
            	try {
					jbr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
            	
            }
            if(name.equals(pzttwb_column)) {
            	pzttwb_value = value;
            }
            if(name.equals(pzlx_column)) {
            	pzlx_value = value;
            }
            if(name.equals(ckpzbh_column)) {
            	ckpzbh_value = value;
            }
            if(name.equals(gsdm_column)) {
            	gsdm_value = value;
            }
            if(name.equals(pzrq_column)) {
            	pzrq_value = value.replaceAll("-", "");
            }
            if(name.equals(gzrq_column)) {
            	gzrq_value = value.replaceAll("-", "");
            }
            if(name.equals(sfcxjk_column)) {
            	sfcxjk_value = value;
            }
            if(name.equals(hbm_column)) {
            	hbm_value = value;
            }
            if(name.equals(sysid_column)) {
            	sysid_value = value;
            }
            if(name.equals(sbje_column)) {
            	sbje_value = value;
            }
            if(name.equals(ygbh_column)) {
            	ygbh_value = value;
            }
            if(name.equals(bxje_column)) {
            	bxje_value = value;
            }
            if(name.equals(qtyszk_column)) {
            	qtyszk_value = value;
            }
            if(name.equals(xjkm_column)) {
            	xjkm_value = value;
            }
            if(name.equals(cjkje_column)) {
            	cjkje_value = value;
            }
            if(name.equals(hkje_column)) {
            	hkje_value = value;
            }
            if(name.equals(cfykje_column)) {
            	cfykje_value = value;
            }
            if(name.equals(dfkm_column)) {
            	dfkm_value = value;
            }
            if(name.equals(khgys_column)) {
            	khgys_value = value;
            }
            if(name.equals(qtyfzk_column)) {
            	qtyfzk_value = value;
            }
            if(name.equals(zjysm_column)) {
            	zjysm_value = value;
            }
            if(name.equals(cbzx_column)) {
            	cbzx_value = value;
            }
            if(name.equals(zy_column)) {
            	zy_value = value;
            }
        }
        writeLog("凭证创建人:"+jbr_value);
        writeLog("凭证抬头文本:"+pzttwb_value);
        writeLog("凭证类型:"+pzlx_value);
        writeLog("参考凭证编号:"+ckpzbh_value);
        writeLog("公司代码:"+gsdm_value);
        writeLog("凭证日期:"+pzrq_value);
        writeLog("过账日期:"+gzrq_value);
        writeLog("是否冲销借款:"+sfcxjk_value);
        writeLog("货币码:"+hbm_value);
        writeLog("SYSID:"+sysid_value);
        writeLog("实报金额:"+sbje_value);
        writeLog("员工编号:"+ygbh_value);
        writeLog("报销金额:"+bxje_value);
        writeLog("应收款-其他:"+qtyszk_value);
        writeLog("现金科目:"+xjkm_value);
        writeLog("冲销借款金额:"+cjkje_value);
        writeLog("还款金额:"+hkje_value);
        writeLog("冲预付款金额:"+cfykje_value);
        writeLog("贷方科目:"+dfkm_value);
        writeLog("khgys_value:"+khgys_value);
        writeLog("其他应付账款:"+qtyfzk_value);
        writeLog("资金预算码:"+zjysm_value);
        writeLog("成本中心:"+cbzx_value);
        writeLog("摘要:"+zy_value);
        
        String tablename = getPropValue("GXBX", "CW_YBFY");
        
        //此场景条件：报销方式为“非冲销报销”。冲销借款和冲销预付款明细都为只读。
        if("2".equals(sfcxjk_value)){
            //创建根节点ROOT
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        	xmlstring = addRootHeadElement(xmlstring, "XERP");
        	xmlstring = addRootHeadElement(xmlstring, "HEAD");
        	xmlstring = addElement(xmlstring, "USERNAME", jbr_value);
        	xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
        	xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
        	xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
        	xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
        	xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
        	xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
        	xmlstring = addRootFooterElement(xmlstring, "HEAD");
        	
        	RecordSet rs = new RecordSet();
        	String sql = "select b.bxje,b.yskm,b.fysm,b.cbzx,b.se from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"'";
        	rs.execute(sql);
        	while(rs.next()) {
        		String yskm_value = Util.null2o(rs.getString("yskm"));
        		String bxjes_value = Util.null2o(rs.getString("bxje"));
        		String se_value = Util.null2o(rs.getString("se"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", yskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
            	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	String sql1 = "select b.jxskm,b.fysm,b.cbzx,b.se,b.sl from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and b.sfzp = '0' and a.requestid = '"+requestid+"'";
        	rs.execute(sql1);
        	while(rs.next()) {
        		String jxskm_value = Util.null2o(rs.getString("jxskm"));
        		String se_value = Util.null2o(rs.getString("se"));
        		String sl_value = Util.null2o(rs.getString("sl"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se_value);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
    		xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "50");
        	xmlstring = addElement(xmlstring, "HKONT", dfkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", "");
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("一般费用报销创建传入xml参数：" + xmlstring);
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("一般费用报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateYBFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        
        //此场景条件：报销方式为“冲销借款”且实报金额为0。冲销借款明细必填，只能录入一条数据，冲预付款明细只读，支付明细只读。
        if("0".equals(sfcxjk_value) && "0".equals(sbje_value)){
        	//创建根节点ROOT
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        	xmlstring = addRootHeadElement(xmlstring, "XERP");
        	xmlstring = addRootHeadElement(xmlstring, "HEAD");
        	xmlstring = addElement(xmlstring, "USERNAME", jbr_value);
        	xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
        	xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
        	xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
        	xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
        	xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
        	xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
        	xmlstring = addRootFooterElement(xmlstring, "HEAD");
        	
        	RecordSet rs = new RecordSet();
        	String sql = "select b.bxje,b.yskm,b.fysm,b.cbzx,b.se from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"'";
        	rs.execute(sql);
        	while(rs.next()) {
        		String yskm_value = Util.null2o(rs.getString("yskm"));
        		String bxjes_value = Util.null2o(rs.getString("bxje"));
        		String se_value = Util.null2o(rs.getString("se"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", yskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
            	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	String sql1 = "select b.jxskm,b.fysm,b.cbzx,b.se,b.sl from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and b.sfzp = '0' and a.requestid = '"+requestid+"'";
        	rs.execute(sql1);
        	while(rs.next()) {
        		String jxskm_value = Util.null2o(rs.getString("jxskm"));
        		String se_value = Util.null2o(rs.getString("se"));
        		String sl_value = Util.null2o(rs.getString("sl"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se_value);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
    		xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("一般费用报销创建传入xml参数：" + xmlstring);
            
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("一般费用报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateYBFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        
        //此场景条件：报销方式为“冲销借款”且实报金额小于0。冲销借款明细必填，只能录入一条数据，冲预付款明细只读，支付明细只读。
        if("0".equals(sfcxjk_value) && sbje_value.contains("-")){
        	//创建根节点ROOT
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        	xmlstring = addRootHeadElement(xmlstring, "XERP");
        	xmlstring = addRootHeadElement(xmlstring, "HEAD");
        	xmlstring = addElement(xmlstring, "USERNAME", jbr_value);
        	xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
        	xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
        	xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
        	xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
        	xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
        	xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
        	xmlstring = addRootFooterElement(xmlstring, "HEAD");
        	
        	RecordSet rs = new RecordSet();
        	String sql = "select b.bxje,b.yskm,b.fysm,b.cbzx,b.se from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"'";
        	rs.execute(sql);
        	while(rs.next()) {
        		String yskm_value = Util.null2o(rs.getString("yskm"));
        		String bxjes_value = Util.null2o(rs.getString("bxje"));
        		String se_value = Util.null2o(rs.getString("se"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", yskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
            	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	String sql1 = "select b.jxskm,b.fysm,b.cbzx,b.se,b.sl from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and b.sfzp = '0' and a.requestid = '"+requestid+"'";
        	rs.execute(sql1);
        	while(rs.next()) {
        		String jxskm_value = Util.null2o(rs.getString("jxskm"));
        		String se_value = Util.null2o(rs.getString("se"));
        		String sl_value = Util.null2o(rs.getString("sl"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se_value);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "40");
        	xmlstring = addElement(xmlstring, "HKONT", xjkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(Math.abs(Double.parseDouble(sbje_value))));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
			xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	Double dou = Double.parseDouble(cjkje_value)+ Double.parseDouble(hkje_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(dou));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("一般费用报销创建传入xml参数：" + xmlstring);
            
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("一般费用报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateYBFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        
        //此场景条件：报销方式为“冲销借款”且实报金额大于0。冲销借款明细必填，只能录入一条数据，冲预付款明细只读。
        if("0".equals(sfcxjk_value) && Double.parseDouble(sbje_value) > 0){
        	//创建根节点ROOT
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        	xmlstring = addRootHeadElement(xmlstring, "XERP");
        	xmlstring = addRootHeadElement(xmlstring, "HEAD");
        	xmlstring = addElement(xmlstring, "USERNAME", jbr_value);
        	xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
        	xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
        	xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
        	xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
        	xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
        	xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
        	xmlstring = addRootFooterElement(xmlstring, "HEAD");
        	
        	RecordSet rs = new RecordSet();
        	String sql = "select b.bxje,b.yskm,b.fysm,b.cbzx,b.se from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"'";
        	rs.execute(sql);
        	while(rs.next()) {
        		String yskm_value = Util.null2o(rs.getString("yskm"));
        		String bxjes_value = Util.null2o(rs.getString("bxje"));
        		String se_value = Util.null2o(rs.getString("se"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", yskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
            	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	String sql1 = "select b.jxskm,b.fysm,b.cbzx,b.se,b.sl from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and b.sfzp = '0' and a.requestid = '"+requestid+"'";
        	rs.execute(sql1);
        	while(rs.next()) {
        		String jxskm_value = Util.null2o(rs.getString("jxskm"));
        		String se_value = Util.null2o(rs.getString("se"));
        		String sl_value = Util.null2o(rs.getString("sl"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se_value);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	Double dou = Double.parseDouble(cjkje_value) + Double.parseDouble(hkje_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(dou));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "50");
        	xmlstring = addElement(xmlstring, "HKONT", dfkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", sbje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("一般费用报销创建传入xml参数：" + xmlstring);
            
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("一般费用报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateYBFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        
        //此场景条件：报销方式为“冲销预付款”此时冲借款明细只读，实报金额为0。同时支付明细也为只读。
        if("1".equals(sfcxjk_value) && "0".equals(sbje_value)){
        	//创建根节点ROOT
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        	xmlstring = addRootHeadElement(xmlstring, "XERP");
        	xmlstring = addRootHeadElement(xmlstring, "HEAD");
        	xmlstring = addElement(xmlstring, "USERNAME", jbr_value);
        	xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
        	xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
        	xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
        	xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
        	xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
        	xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
        	xmlstring = addRootFooterElement(xmlstring, "HEAD");
        	
        	RecordSet rs = new RecordSet();
        	String sql = "select b.bxje,b.yskm,b.fysm,b.cbzx,b.se from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"'";
        	rs.execute(sql);
        	while(rs.next()) {
        		String yskm_value = Util.null2o(rs.getString("yskm"));
        		String bxjes_value = Util.null2o(rs.getString("bxje"));
        		String se_value = Util.null2o(rs.getString("se"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", yskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
            	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	String sql1 = "select b.jxskm,b.fysm,b.cbzx,b.se,b.sl from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and b.sfzp = '0' and a.requestid = '"+requestid+"'";
        	rs.execute(sql1);
        	while(rs.next()) {
        		String jxskm_value = Util.null2o(rs.getString("jxskm"));
        		String se_value = Util.null2o(rs.getString("se"));
        		String sl_value = Util.null2o(rs.getString("sl"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se_value);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	String sql2 = "select b.gysbm from "+tablename+" a,"+tablename+"_dt4 b where a.id = b.mainid and a.requestid = '"+requestid+"'";
        	rs.execute(sql2);
        	rs.next();
        	String gysbm = Util.null2String(rs.getString("gysbm"));
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyfzk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", gysbm);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);//TODO 讨论
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("一般费用报销创建传入xml参数：" + xmlstring);
            
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("一般费用报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateYBFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        
        //此场景条件：报销方式为“冲销预付款”此时冲借款明细只读，实报金额大于0。
        if("1".equals(sfcxjk_value) && Double.parseDouble(sbje_value) > 0){
        	//创建根节点ROOT
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        	xmlstring = addRootHeadElement(xmlstring, "XERP");
        	xmlstring = addRootHeadElement(xmlstring, "HEAD");
        	xmlstring = addElement(xmlstring, "USERNAME", jbr_value);
        	xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
        	xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
        	xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
        	xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
        	xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
        	xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
        	xmlstring = addRootFooterElement(xmlstring, "HEAD");
        	
        	RecordSet rs = new RecordSet();
        	String sql = "select b.bxje,b.yskm,b.fysm,b.cbzx,b.se from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"'";
        	rs.execute(sql);
        	while(rs.next()) {
        		String yskm_value = Util.null2o(rs.getString("yskm"));
        		String bxjes_value = Util.null2o(rs.getString("bxje"));
        		String se_value = Util.null2o(rs.getString("se"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", yskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	double tol = Util.getDoubleValue(bxjes_value) - Util.getDoubleValue(se_value);
            	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	String sql1 = "select b.jxskm,b.fysm,b.cbzx,b.se,b.sl from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and b.sfzp = '0' and a.requestid = '"+requestid+"'";
        	rs.execute(sql1);
        	while(rs.next()) {
        		String jxskm_value = Util.null2o(rs.getString("jxskm"));
        		String se_value = Util.null2o(rs.getString("se"));
        		String sl_value = Util.null2o(rs.getString("sl"));
            	xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
            	xmlstring = addElement(xmlstring, "LIFNR", khgys_value);
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se_value);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
            	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "50");
        	xmlstring = addElement(xmlstring, "HKONT", dfkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", khgys_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", sbje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyfzk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", khgys_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", cfykje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", "");
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("一般费用报销创建传入xml参数：" + xmlstring);
            
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("一般费用报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateYBFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "一般费用报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        
        return SUCCESS;
    }
    
    
    
    /**
     * 增加ROOT头
     * 
     * @param xmlstring
     * @param elementNodeName
     * @return
     */
    public static String addRootHeadElement(String xmlstring, String elementNodeName) {
		return xmlstring + "<" + elementNodeName + ">";
	}
    
    /**
     * 增加ROOT尾
     * 
     * @param xmlstring
     * @param elementNodeName
     * @return
     */
    public static String addRootFooterElement(String xmlstring, String elementNodeName) {
		return xmlstring +  "</" + elementNodeName + ">";
	}
    
    /**
     * 增加元素
     * 
     * @param xmlstring
     * @param elementNodeName
     * @param text
     * @return
     */
    public static String addElement(String xmlstring,
                                     String elementNodeName,
                                     String text) {
    	return xmlstring + "<" + elementNodeName + ">" + text + "</" + elementNodeName + ">";
    }
}
