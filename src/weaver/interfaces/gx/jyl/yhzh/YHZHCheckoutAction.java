package weaver.interfaces.gx.jyl.yhzh;

import java.rmi.RemoteException;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;

/**
 * 银行账号验证银行账号号码是否存在 
 */
public class YHZHCheckoutAction extends BaseBean implements Action {

    private YHZHPublicMethod publicmethod = new YHZHPublicMethod();
    private PublicMethod PublicMethod = new PublicMethod();
    
    //银行账户号码-值
    String yhzhhm_value = "";
    //银行账户号码-字段
    String yhzhhm_column = "yhzhhm";
    
	@Override
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(yhzhhm_column)) {
                yhzhhm_value = value;
            }
        }
        writeLog("银行账户号码："+yhzhhm_value);
        JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        BankAccountQuery banksQuery = new BankAccountQuery();
        BankAccountCriteria banksCriteria = new BankAccountCriteria();
        if(!"".equals(yhzhhm_value)){
            banksCriteria.setBANKN(setTextCriteria(yhzhhm_value));
            banksQuery.setCriteria(banksCriteria);
            BankAccountResultSet BankAccountResultSet = null;
    		try {
    			BankAccountResultSet = f.searchBankAccount(banksQuery, publicmethod.setReposInfo());
    			BankAccount[] BankAccounts = BankAccountResultSet.getBankAccount();
    			if(null != BankAccounts) {
    				PublicMethod.setFailedMessage(request, "failed", "银行账号号码：" + yhzhhm_value + " 在MDM中已经存在。");
    				return SUCCESS;
    			}
    		} catch (RemoteException e) {
    			e.printStackTrace();
    		}
        } else {
        	writeLog("流程ID："+requestid+",银行账户号码："+yhzhhm_value + "为空。");
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
}
