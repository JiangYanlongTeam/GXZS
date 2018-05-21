package weaver.interfaces.gx.jyl.yh;

import java.rmi.RemoteException;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUpdate;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
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
 * 银行提交状态变更 退回
 * @author lvc
 */
public class YHTHAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private YHPublicMethod publicmethod = new YHPublicMethod();
    
    public String execute(RequestInfo request) {
        //银行码（子表）-值
        String yhm_value = "";
        //银行码（子表）-字段
        String yhm_column = "yhdm";
        //审批状态代码-值
        String spzt_value = "";
        //审批状态代码-字段
        String spzt_column = "spzt";
        //申请人-值
        String sqr_value = "";
        //申请人-字段
        String sqr_column = "sqr";
        //操作标识-值
        String czbs_value = "";
        //操作标识-字段
        String czbs_column = "czbs";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(yhm_column)) {
                yhm_value = value;
            }
            if (name.equals(spzt_column)) {
            	spzt_value = value;
            }
            if (name.equals(sqr_column)) {
            	sqr_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
        }
        
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        UpdateConfigurationParameters createConfigurationParameters = new UpdateConfigurationParameters();
        BanksUpdate[] banksCreates = new BanksUpdate[1];
        BanksUpdate banksCreate = new BanksUpdate();
        writeLog("银行码 ："+yhm_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("申请人："+sqr_value);
        writeLog("操作标识："+czbs_value);
        BanksQuery banksQuery = new BanksQuery();
        BanksCriteria banksCriteria = new BanksCriteria();
        banksCriteria.setBANKL(publicmethod.setTextCriteria(yhm_value));
        banksQuery.setCriteria(banksCriteria);
        BanksResultSet BanksResultSet = null;
        try {
            BanksResultSet = proxy.searchBanks(banksQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        if(null != BanksResultSet && BanksResultSet.getBanks().length > 0) {
            banksCreate.setRecordIdentification(BanksResultSet.getBanks()[0].getRecordIdentification());
        } else {
            PublicMethods.setFailedMessage(request, "failed", "查找银行代码："+yhm_value+" 内部码失败");
            return SUCCESS;
        }
        banksCreate.setBANKL(yhm_value);
        ApprovalStatusLookup approvalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == approvalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找审批状态代码："+spzt_value+" 失败");
            return SUCCESS;
        }
        banksCreate.setAPCOD(approvalStatusLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        banksCreate.setUpdateBy(applicant_chinese_value);
        OperationLookup operationLookup = publicmethod.lookOperation(czbs_value, proxy);
        if(null == operationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询操作标识："+czbs_value+" 失败");
            return SUCCESS;
        }
        banksCreate.setOperation(operationLookup);
        banksCreates[0] = banksCreate;
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.updateBanks(banksCreates, publicmethod.setReposInfo(), createConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("连接MDM失败："+e.getLocalizedMessage());
            PublicMethods.setFailedMessage(request, "failed", "连接MDM接口失败:"+e.getStackTrace());
        }
        if(null != executionStatus && executionStatus.length > 0){
            String status = executionStatus[0].getStatus();
            if(!"OK".equalsIgnoreCase(status)){
                PublicMethods.setFailedMessage(request, "failed", "连接MDM接口失败:"+executionStatus[0].getFault()[0].getText());
            } else {
                //publicmethod.updateReturnMsg(status, description, requestid);
            }
        } else {
            PublicMethods.setFailedMessage(request, "failed", "连接MDM接口失败");
        }
        return SUCCESS;
    }
}
