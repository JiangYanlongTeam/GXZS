package weaver.interfaces.gx.jyl.wl;

import java.rmi.RemoteException;

import jsgx_mdm_material.beans.ws.mdm.sap.com.Materials;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALViProxy;

/**
 * 物料查重
 */
public class WZLBCheckoutAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethod = new PublicMethod();
    private WLPublicMethod publicmethod = new WLPublicMethod();
    
    public String execute(RequestInfo request) {
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("物料退回操作，不执行接口.");
            return SUCCESS;
        }
        //物资描述-值
        String wzms_value = "";
        //物资描述-字段
        String wzms_column = "wzms";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(wzms_column)) {
                wzms_value = value;
            }
        }
        writeLog("物资描述:"+wzms_value);
        JSGX_MDM_MATERIALViProxy f = new JSGX_MDM_MATERIALViProxy();
        MaterialsQuery banksQuery = new MaterialsQuery();
        MaterialsResultSet materialsResultSet = null;
        if(!"".equals(wzms_value)) {
        	MaterialsCriteria banksCriteria = new MaterialsCriteria();
            banksCriteria.setMAKTX(publicmethod.setTextCriteria(wzms_value));
            banksQuery.setCriteria(banksCriteria);
        }
        try {
        	materialsResultSet = f.searchMaterials(banksQuery, publicmethod.setReposInfo());
        	if(null != materialsResultSet) {
        		Materials[] materials = materialsResultSet.getMaterials();
        		if(materials != null) {
			    	if(materials.length > 0) {
			    		PublicMethod.setFailedMessage(request, "failed", "物料描述："+wzms_value+" 已经存在。");
			            return SUCCESS;
					}
		    	}
        	}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
        return SUCCESS;
    }
}
