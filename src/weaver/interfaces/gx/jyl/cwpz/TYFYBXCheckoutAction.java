package weaver.interfaces.gx.jyl.cwpz;

import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 通用费用报销检查，当支付方式为对公时，供应商不能为空
 */
public class TYFYBXCheckoutAction extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String src = request.getRequestManager().getSrc();
        if (!"submit".equals(src)) {
            new weaver.general.BaseBean().writeLog("通用费用报销退回操作，不执行接口.");
            return SUCCESS;
        }
        //支付类别-值
        String zflb_value = "";
        //支付类别-字段
        String zflb_column = "zflb";
        //供应商-值
        String khgys_value = "";
        //供应商-字段
        String khgys_column = "khgys";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if(name.equals(zflb_column)) {
            	zflb_value = value;
            }
            if(name.equals(khgys_column)) {
            	khgys_value = value;
            }
        }
        writeLog("支付类别:"+zflb_value);
        writeLog("供应商:"+khgys_value);
        
        //此场景条件：报销方式为“非冲销报销”。冲销借款和冲销预付款明细都为只读。
        if("1".equals(zflb_value)){
        	if("".equals(khgys_value)) {
        		publicmethod.setFailMessage(request, "failed", "当支付类别为对公时供应商不能为空");
	            return SUCCESS;
        	}
        }
        return SUCCESS;
    }
}
