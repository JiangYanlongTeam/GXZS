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
 * 差旅费报销凭证支付申请创建
 */
public class ZJPZSQCreateAction extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if (!"submit".equals(src)) {
            new weaver.general.BaseBean().writeLog("资金凭证单退回操作，不执行接口.");
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
        //是否冲销借款-值
        String sfcxjk_value = "";
        //是否冲销借款-字段
        String sfcxjk_column = "sfcjk";
        //报销金额-值
        String bxje_value = "";
        //报销金额-字段
        String bxje_column = "bxje";
        //税额合计-值
        String sehj_value = "";
        //税额合计-字段
        String sehj_column = "sehj";
        //总帐科目-值
        String zzkm_value = "";
        //总账科目-字段
        String zzkm_column = "fyyskm";
        //其他应收款-值
        String qtyszk_value = "";
        //其他应收款-字段
        String qtyszk_column = "qtyszk";
        //供应商-值
        String gys_value = "";
        //供应商-字段
        String gys_column = "";
        //成本中心-值
        String cbzx_value = "";
        //成本中心-字段
        String cbzx_column = "fycdbm";
        //货币码-值
        String hbm_value = "";
        //货币码-字段
        String hbm_column = "hbm";
        //实报金额-值
        String sbje_value = "";
        //实报金额-字段
        String sbje_column = "sbje";
        //员工编号-值
        String ygbh_value = "";
        //员工编号-字段
        String ygbh_column = "ygbh";
        //sysid-值
        String sysid_value = "";
        //sysid-字段
        String sysid_column = "sysid";
        //现金/银行-值
        String xjkm_value = "";
        //现金/银行-字段
        String xjkm_column = "xjkm";
        //值
        String cxjkje_value = "";
        //字段
        String cxjkje_column = "cxjkje";
        //值
        String hkje_value = "";
        //字段
        String hkje_column = "hkje";
        //值
        String dfkm_value = "";
        //字段
        String dfkm_column = "dfkm";
        //资金预算码-值
        String zjysm_value = "";
        //资金预算码-字段
        String zjysm_column = "zjysm";
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
            if(name.equals(bxje_column)) {
            	bxje_value = value;
            }
            if(name.equals(zzkm_column)) {
            	zzkm_value = value;
            }
            if(name.equals(cbzx_column)) {
            	cbzx_value = value;
            }
            if(name.equals(hbm_column)) {
            	hbm_value = value;
            }
            if(name.equals(sbje_column)) {
            	sbje_value = value;
            }
            if(name.equals(ygbh_column)) {
            	ygbh_value = value;
            }
            if(name.equals(sysid_column)) {
            	sysid_value = value;
            }
            if(name.equals(qtyszk_column)) {
            	qtyszk_value = value;
            }
            if(name.equals(xjkm_column)) {
            	xjkm_value = value;
            }
            if(name.equals(cxjkje_column)) {
            	cxjkje_value = value;
            }
            if(name.equals(hkje_column)) {
            	hkje_value = value;
            }
            if(name.equals(dfkm_column)) {
            	dfkm_value = value;
            }
            if(name.equals(zjysm_column)) {
            	zjysm_value = value;
            }
            if(name.equals(zy_column)) {
            	zy_value = value;
            }
            if(name.equals(sehj_column)) {
            	sehj_value = value;
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
        writeLog("报销金额:"+bxje_value);
        writeLog("总账科目:"+zzkm_value);
        writeLog("成本中心:"+cbzx_value);
        writeLog("货币码:"+hbm_value);
        writeLog("实报金额:"+sbje_value);
        writeLog("员工编号:"+ygbh_value);
        writeLog("SYSID:"+sysid_value);
        writeLog("其他应收款:"+qtyszk_value);
        writeLog("现金/银行:"+xjkm_value);
        writeLog("cxjkje:"+cxjkje_value);
        writeLog("hkje:"+hkje_value);
        writeLog("dfkm_value:"+dfkm_value);
        writeLog("资金预算码:"+zjysm_value);
        writeLog("摘要:"+zy_value);
        writeLog("税额合计:"+sehj_value);
        String tablename = getPropValue("GXBX", "CW_CLF");
        
        //此场景条件：是否冲销借款为“否”
        if("1".equals(sfcxjk_value)){
            //创建根节点ROOT
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        	xmlstring = addRootHeadElement(xmlstring, "XERP");
        	xmlstring = addRootHeadElement(xmlstring, "HEAD");
        	xmlstring = addElement(xmlstring, "USERNAME", jbr_value);
        	xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
        	xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
        	xmlstring = addElement(xmlstring, "REF_DOC_NO", "");
        	xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
        	xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
        	xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
        	xmlstring = addRootFooterElement(xmlstring, "HEAD");
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "40");
        	xmlstring = addElement(xmlstring, "HKONT", zzkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", "");
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	double tol = Util.getDoubleValue(bxje_value) - Util.getDoubleValue(sehj_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	//xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	String sql = "select b.jxskm,b.se,b.sl from "+tablename+" a, "+tablename+"_dt1 b where a.id = b.mainid and sfzp = '0' and a.requestid = '"+requestid+"'";
        	RecordSet rs = new RecordSet();
        	rs.execute(sql);
        	while(rs.next()) {
        		String jxskm = rs.getString("jxskm");
        		String se = rs.getString("se");
        		String sl = rs.getString("sl");
        		xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", "");
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "50");
        	xmlstring = addElement(xmlstring, "HKONT", dfkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", "");
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("差旅费报销创建传入xml参数：" + xmlstring);
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("差旅费报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateCLFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "差旅费报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        //此场景条件：冲借款，为“是”，实报金额为0
        if("0".equals(sfcxjk_value) && sbje_value.equals("0")){
        	
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
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "40");
        	xmlstring = addElement(xmlstring, "HKONT", zzkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	double tol = Util.getDoubleValue(bxje_value) - Util.getDoubleValue(sehj_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	String sql = "select b.jxskm,b.se,b.sl from "+tablename+" a, "+tablename+"_dt1 b where a.id = b.mainid and sfzp = '0' and a.requestid = '"+requestid+"'";
        	RecordSet rs = new RecordSet();
        	rs.execute(sql);
        	while(rs.next()) {
        		String jxskm = rs.getString("jxskm");
        		String se = rs.getString("se");
        		String sl = rs.getString("sl");
        		xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", "");
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("差旅费报销创建传入xml参数：" + xmlstring);
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("差旅费报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateCLFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "差旅费报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        //冲借款，为“是”，实报金额小于0
        if("0".equals(sfcxjk_value) && sbje_value.contains("-")){
        	
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
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "40");
        	xmlstring = addElement(xmlstring, "HKONT", zzkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	double tol = Util.getDoubleValue(bxje_value) - Util.getDoubleValue(sehj_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "40");
        	xmlstring = addElement(xmlstring, "HKONT", xjkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(Math.abs(Double.parseDouble(sbje_value))));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
		    xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	String sql = "select b.jxskm,b.se,b.sl from "+tablename+" a, "+tablename+"_dt1 b where a.id = b.mainid and sfzp = '0' and a.requestid = '"+requestid+"'";
        	RecordSet rs = new RecordSet();
        	rs.execute(sql);
        	while(rs.next()) {
        		String jxskm = rs.getString("jxskm");
        		String se = rs.getString("se");
        		String sl = rs.getString("sl");
        		xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", "");
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	Double dou = Double.parseDouble(cxjkje_value) + Double.parseDouble(hkje_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(dou));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("差旅费报销创建传入xml参数：" + xmlstring);
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("差旅费报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateCLFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "差旅费报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销创建接口异常：" + e);
	            return SUCCESS;
			}
        }
        //冲借款，为“是”，实报金额为大于0
        if("0".equals(sfcxjk_value) && Double.parseDouble(sbje_value)> 0){
        	
        	
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
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "40");
        	xmlstring = addElement(xmlstring, "HKONT", zzkm_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	double tol = Util.getDoubleValue(bxje_value) - Util.getDoubleValue(sehj_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	String sql = "select b.jxskm,b.se,b.sl from "+tablename+" a, "+tablename+"_dt1 b where a.id = b.mainid and sfzp = '0' and a.requestid = '"+requestid+"'";
        	RecordSet rs = new RecordSet();
        	rs.execute(sql);
        	while(rs.next()) {
        		String jxskm = rs.getString("jxskm");
        		String se = rs.getString("se");
        		String sl = rs.getString("sl");
        		xmlstring = addRootHeadElement(xmlstring, "ITEM");
            	xmlstring = addElement(xmlstring, "BSCHL", "40");
            	xmlstring = addElement(xmlstring, "HKONT", jxskm);
            	xmlstring = addElement(xmlstring, "LIFNR", "");
            	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            	xmlstring = addElement(xmlstring, "WRBTR", se);
            	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            	xmlstring = addElement(xmlstring, "KOSTL", "");
            	xmlstring = addElement(xmlstring, "ZUONR", "");
            	xmlstring = addElement(xmlstring, "MWSKZ", sl);
            	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	}
        	
        	xmlstring = addRootHeadElement(xmlstring, "ITEM");
        	xmlstring = addElement(xmlstring, "BSCHL", "31");
        	xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
        	xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
        	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
        	Double dou = Double.parseDouble(cxjkje_value) + Double.parseDouble(hkje_value);
        	xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(dou));
        	xmlstring = addElement(xmlstring, "SGTXT", zy_value);
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
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
        	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
        	xmlstring = addElement(xmlstring, "ZUONR", "");
        	xmlstring = addElement(xmlstring, "ZZ00003", zjysm_value);
        	xmlstring = addRootFooterElement(xmlstring, "ITEM");
        	
        	xmlstring = addRootFooterElement(xmlstring, "XERP");
        	
            writeLog("差旅费报销创建传入xml参数：" + xmlstring);
            
            SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new SI_1057_OA2ERP_KJPZ_OUTProxy();
            DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
            DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            try {
            	DT_1057_OA2ERP_KJPZ_RETURN = proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            	String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            	writeLog("差旅费报销创建返回消息：" + returnmessage);
            	Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("ZSTATU");
                    String ZDESC = (String) map.get("ZDESC");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateCLFBXCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "差旅费报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU + " ZDESC：" + ZDESC);
                        return SUCCESS;
                    }
                }
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "差旅费报销创建接口异常：" + e);
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
