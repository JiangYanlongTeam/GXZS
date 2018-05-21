package weaver.interfaces.gx.jyl.yh;

import java.rmi.RemoteException;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Banks;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

public class YHCheckoutAction extends BaseBean implements Action {

    private YHPublicMethod publicmethod = new YHPublicMethod();
    private PublicMethod PublicMethod = new PublicMethod();
    
    //银行码（子表）-值
    String yhm_value = "";
    //银行码（子表）-字段
    String yhm_column = "yhdm";
    
    @Override
    public String execute(RequestInfo request) {
    	String requestid = request.getRequestid();
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(yhm_column)) {
                yhm_value = value;
            }
        }
        writeLog("银行码 ："+yhm_value);
        JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        BanksQuery banksQuery = new BanksQuery();
        BanksCriteria banksCriteria = new BanksCriteria();
        if(!"".equals(yhm_value)){
            banksCriteria.setBANKL(setTextCriteria(yhm_value));
            banksQuery.setCriteria(banksCriteria);
            BanksResultSet BanksResultSet = null;
    		try {
    			BanksResultSet = f.searchBanks(banksQuery, publicmethod.setReposInfo());
    			 Banks[] banks = BanksResultSet.getBanks();
    		        if(null != banks) {
    		        	PublicMethod.setFailedMessage(request, "failed", "银行代码：" + yhm_value + " 在MDM中已经存在。");
    					return SUCCESS;
    		        }
    		} catch (RemoteException e) {
    			e.printStackTrace();
    		}
        } else {
        	writeLog("流程ID："+requestid+",银行代码："+yhm_value + "为空。");
        }
    	return SUCCESS;
    }
    
    /**
     * 设置CustomerAccountGroupsCriteria 对象
     * 
     * @param disvalue 默认值
     * @return
     */
    public TextCriteria setTextCriteria(String disvalue){
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(disvalue);
        textConstraints[0] = textConstraint;
        textCriteria.setConstraint(textConstraints);
        return textCriteria;
    }
    
    public static void main(String[] args) {
    	JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        BanksQuery banksQuery = new BanksQuery();
        BanksCriteria banksCriteria = new BanksCriteria();
        if(!"".equals("1591044004")){
        	TextCriteria textCriteria = new TextCriteria();
            TextConstraint[] textConstraints = new TextConstraint[1];
            TextConstraint textConstraint = new TextConstraint();
            textConstraint.setExpressionOperator("EQUALS");
            textConstraint.setValue("15910440041231231");
            textConstraints[0] = textConstraint;
            textCriteria.setConstraint(textConstraints);
            banksCriteria.setBANKL(textCriteria);
            banksQuery.setCriteria(banksCriteria);
            BanksResultSet BanksResultSet = null;
    		try {
    			 RepositoryInformation reposInfo = new RepositoryInformation();
    		     reposInfo.setDataLang("Chinese [CN]");
    		     reposInfo.setRepositoryName("JSGX_MDM_BUSINESS_PARTNER_Dev");
    		     reposInfo.setServerName("MDP");
    		     BanksResultSet = f.searchBanks(banksQuery, reposInfo);
    			 Banks[] banks = BanksResultSet.getBanks();
    		        if(null != banks) {
    		        }
    		} catch (RemoteException e) {
    			e.printStackTrace();
    		}
        }
	}
}
