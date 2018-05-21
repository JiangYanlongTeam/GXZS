package weaver.interfaces.gx.jyl.gys;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Vendors;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;

/**
 * 供应商创建查重，长度验证
 * @author lvc
 */
public class GYSCheckoutAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();
    public String execute(RequestInfo request) {
    	
    	String workflowid = request.getWorkflowid();
    	String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("供应商退回操作，不执行接口.");
            return SUCCESS;
        }
        //供应商简称-值
        String gysjc_value = "";
        //供应商简称-字段
        String gysjc_column = "gysjc";
        //供应商全称-值
        String 	gysmc_value = "";
        //供应商全称-字段
        String 	gysmc_column = "gysmc";
        //税号\统一社会信用代码-值
        String 	sh_value = "";
        //税号\统一社会信用代码-字段
        String 	sh_column = "sh";
        //工商登记证号-值
        String gsdjzh_value = "";
        //工商登记证号-字段
        String gsdjzh_column = "gsdjzh";
        //全国组织机构代码-值
        String qgzzjgdm_value = "";
        //全国组织机构代码-字段
        String qgzzjgdm_column = "qgzzjgdm";
        //账户组
        String zhz_value = "";
        String zhz_column = "zhz";
        //贸易伙伴
        String myhb_value = "";
        String myhb_column = "myhb";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gysmc_column)) {
            	gysmc_value = value;
            }
            if (name.equals(sh_column)) {
            	sh_value = value;
            }
            if (name.equals(gsdjzh_column)) {
            	gsdjzh_value = value;
            }
            if (name.equals(qgzzjgdm_column)) {
            	qgzzjgdm_value = value;
            }
            if (name.equals(gysjc_column)) {
            	gysjc_value = value;
            }
            if (name.equals(zhz_column)) {
            	zhz_value = value;
            }
            if (name.equals(myhb_column)) {
            	myhb_value = value;
            }
        }
        
        writeLog("供应商简称："+gysjc_value);
        writeLog("供应商全称："+gysmc_value);
        writeLog("税号、统一社会信用代码："+sh_value);
        writeLog("工商登记证号："+gsdjzh_value);
        writeLog("全国组织机构代码："+qgzzjgdm_value);
        writeLog("账户组："+zhz_value);
        writeLog("贸易伙伴："+myhb_value);
        
        if(zhz_value.equals("GX10") || zhz_value.equals("GX11")) {
        	if("".equals(myhb_value)) {
        		PublicMethods.setFailedMessage(request, "failed", "账户组为："+zhz_value+"时，贸易伙伴不能为空。");
	            return SUCCESS;
        	}
        }
        
        GYSPublicMethod GYSPublicMethod = new GYSPublicMethod();
		JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
		VendorsQuery vendorsQuery = new VendorsQuery();
		VendorsResultSet vendorsResultSet = null;
		if(!"".equals(gysmc_value)) {
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			vendorsCriteria.setFULL_NAME(GYSPublicMethod.setTextCriteria(gysmc_value));
			vendorsQuery.setCriteria(vendorsCriteria);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		PublicMethods.setFailedMessage(request, "failed", "供应商全称："+gysmc_value+" 已经存在。");
				            return SUCCESS;
						}
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		if(!"".equals(sh_value)) {
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			vendorsCriteria.setSTCEG(GYSPublicMethod.setTextCriteria(sh_value));
			vendorsQuery.setCriteria(vendorsCriteria);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		PublicMethods.setFailedMessage(request, "failed", "税号："+sh_value+" 已经存在。");
				            return SUCCESS;
						}
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		if(!"".equals(gsdjzh_value)) {
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			vendorsCriteria.setSTCD1(GYSPublicMethod.setTextCriteria(gsdjzh_value));
			vendorsQuery.setCriteria(vendorsCriteria);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		PublicMethods.setFailedMessage(request, "failed", "工商登记号："+gsdjzh_value+" 已经存在。");
				            return SUCCESS;
						}
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		if(!"".equals(qgzzjgdm_value)) {
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			vendorsCriteria.setSTCD2(GYSPublicMethod.setTextCriteria(qgzzjgdm_value));
			vendorsQuery.setCriteria(vendorsCriteria);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		PublicMethods.setFailedMessage(request, "failed", "全国组织机构代码："+qgzzjgdm_value+" 已经存在。");
				            return SUCCESS;
						}
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		
		String sfkq = getPropValue("MDMCheckout", "MDM_GYS_SFKQ");
		if("0".equals(sfkq)) {
			String tablename = getFormTable(workflowid);
			writeLog("获取流程表单名：" + tablename);
			String sql = "select length(gysjc) gysjclen,length(sh) shlen,length(gsdjzh) gsdjzhlen,length(qgzzjgdm) qgzzjgdmlen from "+tablename+" where requestid = '"+requestid+"'";
			RecordSet rs = new RecordSet();
			rs.execute(sql);
			rs.next();
			String gysjc = Util.null2o(rs.getString("gysjclen"));
			String sh = Util.null2o(rs.getString("shlen"));
			String gsdjzh = Util.null2o(rs.getString("gsdjzhlen"));
			String qgzzjgdm = Util.null2o(rs.getString("qgzzjgdmlen"));
			
			
			writeLog("供应商简称长度："+gysjc);
			writeLog("税号长度："+sh);
			writeLog("工商登记证号长度："+gsdjzh);
			writeLog("全国组织机构代码长度："+qgzzjgdm);
			
			String gysjclen = getPropValue("MDMCheckout", "MDM_GYS_GYSJC");
			String shlen = getPropValue("MDMCheckout", "MDM_GYS_SH");
			String gsdjzhlen = getPropValue("MDMCheckout", "MDM_GYS_GSDJZH");
			String qgzzjgdmlen = getPropValue("MDMCheckout", "MDM_GYS_QGZZJGDM");
			
			writeLog("供应商简称标准长度："+gysjclen);
			writeLog("税号标准长度："+shlen);
			writeLog("工商登记证号标准长度："+gsdjzhlen);
			writeLog("全国组织机构代码标准长度："+qgzzjgdmlen);
			
			if(Integer.parseInt(gysjc) > Integer.parseInt(gysjclen)) {
				PublicMethods.setFailedMessage(request, "failed", "供应商简称："+gysjc_value+" 长度过长。");
	            return SUCCESS;
			}
			if(Integer.parseInt(sh) > Integer.parseInt(shlen)) {
				PublicMethods.setFailedMessage(request, "failed", "税号："+sh_value+" 长度过长。");
	            return SUCCESS;
			}
			if(Integer.parseInt(gsdjzh) > Integer.parseInt(gsdjzhlen)) {
				PublicMethods.setFailedMessage(request, "failed", "工商登记证号："+gsdjzh_value+" 长度过长。");
	            return SUCCESS;
			}
			if(Integer.parseInt(qgzzjgdm) > Integer.parseInt(qgzzjgdmlen)) {
				PublicMethods.setFailedMessage(request, "failed", "全国组织机构代码："+qgzzjgdm_value+" 长度过长。");
	            return SUCCESS;
			}
		}
		
		String searchsql = "select id from  formtable_main_704 where gysmc = '"+gysmc_value+"' and sqlx = '0' and requestid != '"+requestid+"'";
		RecordSet rs = new RecordSet();
		rs.execute(searchsql);
		rs.next();
		String s_id = rs.getString("id");
		if(!"".equals(s_id) && null != s_id) {
			PublicMethods.setFailedMessage(request, "failed", "供应商已经被申请："+gysmc_value+" 。");
            return SUCCESS;
		}
		String searchsql1 = "select id from  formtable_main_704 where sh = '"+sh_value+"' and sqlx = '0' and requestid != '"+requestid+"'";
		rs.execute(searchsql1);
		rs.next();
		String s_id1 = rs.getString("id");
		if(!"".equals(s_id1) && null != s_id1) {
			PublicMethods.setFailedMessage(request, "failed", "税号已经被申请："+sh_value+" 。");
		    return SUCCESS;
		}
		String searchsql2 = "select id from  formtable_main_704 where qgzzjgdm = '"+qgzzjgdm_value+"' and sqlx = '0' and requestid != '"+requestid+"'";
		rs.execute(searchsql2);
		rs.next();
		String s_id2 = rs.getString("id");
		if(!"".equals(s_id2) && null != s_id2) {
			PublicMethods.setFailedMessage(request, "failed", "全国组织机构代码已经被申请："+qgzzjgdm_value+" 。");
		    return SUCCESS;
		}
		String searchsql3 = "select id from  formtable_main_704 where gsdjzh = '"+gsdjzh_value+"' and sqlx = '0' and requestid != '"+requestid+"'";
		rs.execute(searchsql3);
		rs.next();
		String s_id3 = rs.getString("id");
		if(!"".equals(s_id3) && null != s_id3) {
			PublicMethods.setFailedMessage(request, "failed", "工商登记号已经被申请："+gsdjzh_value+" 。");
		    return SUCCESS;
		}
        return SUCCESS;
    }
    
    /**
     * 根据WORKFLOWID获取流程表单名
     * 
     * @param workflowid
     * @return
     */
    public String getFormTable(String workflowid) {
    	RecordSet rs = new RecordSet();
    	rs.execute("select formid from workflow_base where id = '"+workflowid+"'");
    	rs.next();
    	String formid = rs.getString("formid");
    	return "formtable_main_" + Math.abs(Integer.parseInt(formid));
    }
}
