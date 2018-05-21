package weaver.interfaces.gx.jyl.yhzh;

import java.rmi.RemoteException;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUpdate;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 银行账号提交状态变更
 * @author lvc
 */
public class YHZHTJAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private YHZHPublicMethod publicmethod = new YHZHPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm1";
        //开户行-值
        String khh_value = "";
        //开户行-字段
        String khh_column = "khh";
        //账户标识-值
        String zhbs_value = "";
        //账户标识-字段
        String zhbs_column = "zhbs";
        //申请人-值
        String sqr_value = "";
        //申请人-字段
        String sqr_column = "sqr";
        //操作标识-值
        String czbs_value = "";
        //操作标识-字段
        String czbs_column = "czbs";
        //审批状态代码-值
        String spzt_value = "";
        //审批状态代码-字段
        String spzt_column = "spzt";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(khh_column)) {
                khh_value = value;
            }
            if (name.equals(zhbs_column)) {
                zhbs_value = value;
            }
            if (name.equals(sqr_column)) {
                sqr_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
        }
        writeLog("公司代码："+gsdm_value);
        writeLog("开户行："+khh_value);
        writeLog("账户标识："+zhbs_value);
        writeLog("申请人："+sqr_value);
        writeLog("操作标识："+czbs_value);
        writeLog("审批状态："+spzt_value);
        
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        UpdateConfigurationParameters UpdateConfigurationParameters = new UpdateConfigurationParameters();
        BankAccountUpdate[] BankAccountUpdates = new BankAccountUpdate[1];
        BankAccountUpdate BankAccountUpdate = new BankAccountUpdate();
        
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == ApprovalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取审批状态代码："+spzt_value +" 失败");
            return SUCCESS;
        } else {
            ApprovalStatusLookup.setDisplayValue(spzt_value);
            BankAccountUpdate.setAPCOD(ApprovalStatusLookup);
        }
        TradePartnersLookup TradePartnersLookup = publicmethod.lookTradePartnersLookup(gsdm_value, proxy);
        if(null == TradePartnersLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取公司代码："+gsdm_value +" 失败");
            return SUCCESS;
        } else {
            BankAccountUpdate.setBUKRS(TradePartnersLookup);
        }
        BankAccountUpdate.setHBKID(khh_value);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        BankAccountUpdate.setUpdateBy(applicant_chinese_value);
        
        OperationLookup OperationLookup = publicmethod.lookOperation(czbs_value, proxy);
        if(null == OperationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取操作标识："+czbs_value +" 失败");
            return SUCCESS;
        } else {
            BankAccountUpdate.setOperation(OperationLookup);
        }
        BankAccountUpdates[0] = BankAccountUpdate;
        ExecutionStatus[] ExecutionStatus = null;
        try {
            ExecutionStatus = proxy.updateBankAccount(BankAccountUpdates, publicmethod.setReposInfo(), UpdateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethods.setFailedMessage(request, "failed", "修改银行账户失败，连接MDM失败。");
            return SUCCESS;
        }
        if(null != ExecutionStatus && ExecutionStatus.length > 0) {
            String status = ExecutionStatus[0].getStatus();
            String messge = ExecutionStatus[0].getDescription();
            if(!"OK".equalsIgnoreCase(status)){
                PublicMethods.setFailedMessage(request, "failed", ExecutionStatus[0].getFault()[0].getText());
                return SUCCESS;
            } else {
                publicmethod.updateReturnMsg(status, messge, requestid);
            }
        } else {
            PublicMethods.setFailedMessage(request, "failed", "修改银行账户失败，连接MDM失败。");
        }
        return SUCCESS;
    }
}
