package weaver.interfaces.gx.jyl.kh;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Customers;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;

/**
 * 客户创建查重，长度验证
 * @author lvc
 */
public class KHCheckoutAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();
    public String execute(RequestInfo request) {
    	
    	String workflowid = request.getWorkflowid();
    	String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("客户退回操作，不执行接口.");
            return SUCCESS;
        }
        //客户简称-值
        String name_value = "";
        //客户简称-字段
        String name_column = "khjc";
        //客户全称-值
        String khqc_value = "";
        //客户全称-字段
        String khqc_column = "khmc";
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
        //关键词1-值
        String gjc1_value = "";
        //关键词1-字段
        String gjc1_column = "gjc1";
        //关键词2-值
        String gjc2_value = "";
        //关键词2-字段
        String gjc2_column = "gjc2";
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
            if (name.equals(khqc_column)) {
            	khqc_value = value;
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
            if (name.equals(name_column)) {
            	name_value = value;
            }
            if (name.equals(gjc1_column)) {
            	gjc1_value = value;
            }
            if (name.equals(gjc2_column)) {
            	gjc2_value = value;
            }
            if (name.equals(zhz_column)) {
            	zhz_value = value;
            }
            if (name.equals(myhb_column)) {
            	myhb_value = value;
            }
        }
        
        writeLog("客户简称："+name_value);
        writeLog("客户全称："+khqc_value);
        writeLog("税号、统一社会信用代码："+sh_value);
        writeLog("工商登记证号："+gsdjzh_value);
        writeLog("全国组织机构代码："+qgzzjgdm_value);
        writeLog("关键词1："+gjc1_value);
        writeLog("关键词2："+gjc2_value);
        writeLog("账户组："+zhz_value);
        writeLog("贸易伙伴："+myhb_value);
        
        if(zhz_value.equals("G20") || zhz_value.equals("G21")) {
        	if(myhb_value.equals("")) {
        		PublicMethods.setFailedMessage(request, "failed", "当账户组："+zhz_value+" 时，贸易伙伴必填。");
	            return SUCCESS;
        	}
        }
        KHPublicMethod GYSPublicMethod = new KHPublicMethod();
        JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        CustomersQuery customersQuery = new CustomersQuery();
        CustomersResultSet fundcenterResultSet = null;
		if(!"".equals(khqc_value)) {
			CustomersCriteria customersCriteria = new CustomersCriteria();
			customersCriteria.setFULL_NAME(GYSPublicMethod.setTextCriteria(khqc_value));
			customersQuery.setCriteria(customersCriteria);
			try {
				fundcenterResultSet = f.searchCustomers(customersQuery, GYSPublicMethod.setReposInfo());
			    if(null != fundcenterResultSet) {
			    	Customers[] vendors = fundcenterResultSet.getCustomers();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		PublicMethods.setFailedMessage(request, "failed", "客户名称："+khqc_value+" 已经存在。");
				            return SUCCESS;
						}
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		if(!"".equals(sh_value)) {
			CustomersCriteria customersCriteria = new CustomersCriteria();
			customersCriteria.setSTCEG(GYSPublicMethod.setTextCriteria(sh_value));
			customersQuery.setCriteria(customersCriteria);
			try {
				fundcenterResultSet = f.searchCustomers(customersQuery, GYSPublicMethod.setReposInfo());
			    if(null != fundcenterResultSet) {
			    	Customers[] vendors = fundcenterResultSet.getCustomers();
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
			CustomersCriteria customersCriteria = new CustomersCriteria();
			customersCriteria.setSTCD1(GYSPublicMethod.setTextCriteria(gsdjzh_value));
			customersQuery.setCriteria(customersCriteria);
			try {
				fundcenterResultSet = f.searchCustomers(customersQuery, GYSPublicMethod.setReposInfo());
			    if(null != fundcenterResultSet) {
			    	Customers[] vendors = fundcenterResultSet.getCustomers();
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
			CustomersCriteria customersCriteria = new CustomersCriteria();
			customersCriteria.setSTCD5(GYSPublicMethod.setTextCriteria(qgzzjgdm_value));
			customersQuery.setCriteria(customersCriteria);
			try {
				fundcenterResultSet = f.searchCustomers(customersQuery, GYSPublicMethod.setReposInfo());
			    if(null != fundcenterResultSet) {
			    	Customers[] vendors = fundcenterResultSet.getCustomers();
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
		String sfkq = getPropValue("MDMCheckout", "MDM_KH_SFKQ");
		if("0".equals(sfkq)) {
			String tablename = getFormTable(workflowid);
			writeLog("获取流程表单名：" + tablename);
			String sql = "select length(khjc) gysjclen,length(sh) shlen,length(gsdjzh) gsdjzhlen,length(qgzzjgdm) qgzzjgdmlen,length(gjc1) gjc1len," +
					" length(gjc2) gjc2len from "+tablename+" where requestid = '"+requestid+"'";
			RecordSet rs = new RecordSet();
			rs.execute(sql);
			rs.next();
			String gysjc = Util.null2o(rs.getString("gysjclen"));
			String sh = Util.null2o(rs.getString("shlen"));
			String gsdjzh = Util.null2o(rs.getString("gsdjzhlen"));
			String qgzzjgdm = Util.null2o(rs.getString("qgzzjgdmlen"));
			String gjc1 = Util.null2o(rs.getString("gjc1len"));
			String gjc2 = Util.null2o(rs.getString("gjc2len"));
			
			writeLog("客户简称长度："+gysjc);
			writeLog("税号长度："+sh);
			writeLog("工商登记证号长度："+gsdjzh);
			writeLog("全国组织机构代码长度："+qgzzjgdm);
			writeLog("关键词1长度："+gjc1);
			writeLog("关键词2长度："+gjc2);
			
			String gysjclen = getPropValue("MDMCheckout", "MDM_KH_KHJC");
			String shlen = getPropValue("MDMCheckout", "MDM_KH_SH");
			String gsdjzhlen = getPropValue("MDMCheckout", "MDM_KH_GSDJZH");
			String qgzzjgdmlen = getPropValue("MDMCheckout", "MDM_KH_QGZZJGDM");
			String gjc1len = getPropValue("MDMCheckout", "MDM_KH_GJC1");
			String gjc2len = getPropValue("MDMCheckout", "MDM_KH_GJC2");
			
			writeLog("客户简称标准长度："+gysjclen);
			writeLog("税号标准长度："+shlen);
			writeLog("工商登记证号标准长度："+gsdjzhlen);
			writeLog("全国组织机构代码标准长度："+qgzzjgdmlen);
			writeLog("关键词1标准长度："+gjc1len);
			writeLog("关键词2标准长度："+gjc2len);
			
			if(Integer.parseInt(gysjc) > Integer.parseInt(gysjclen)) {
				PublicMethods.setFailedMessage(request, "failed", "客户简称："+name_value+" 长度过长。");
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
			if(Integer.parseInt(gjc1) > Integer.parseInt(gjc1len)) {
				PublicMethods.setFailedMessage(request, "failed", "关键词1："+gjc1_value+" 长度过长。");
	            return SUCCESS;
			}
			if(Integer.parseInt(gjc2) > Integer.parseInt(gjc2len)) {
				PublicMethods.setFailedMessage(request, "failed", "全国组织机构代码："+gjc2_value+" 长度过长。");
	            return SUCCESS;
			}
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
