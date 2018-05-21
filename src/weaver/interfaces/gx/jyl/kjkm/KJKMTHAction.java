package weaver.interfaces.gx.jyl.kjkm;

import java.rmi.RemoteException;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 会计科目提交状态变更
 */
public class KJKMTHAction extends BaseBean implements Action {
    private PublicMethod PublicMethod = new PublicMethod();
    private KJKMPublicMethod KJKMPublicMethods = new KJKMPublicMethod();
    
    public String execute(RequestInfo request) {
        //总账科目编码-值
        String zzkmdm_value = "";
        //总账科目编码-字段
        String zzkmdm_column = "zzkm";
        //流程发起人-值
        String applicant_value = "";
        //流程发起人-字段
        String applicant_column = "sqr";
        //操作标识-值
        String czbs_value = "";
        //操作标识-字段
        String czbs_column = "czbs";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(zzkmdm_column)) {
                zzkmdm_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
        }
        writeLog("总帐科目：" + zzkmdm_value);
        writeLog("申请人：" + applicant_value);
        writeLog("审批状态：0");
        writeLog("操作标识：" + czbs_value);
        
      //CREATE OR REPLACE DIRECTORY ecology_dump as '/oa/oracle/dump'
        JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();

        AccountsUpdate[] accountsCreates = new AccountsUpdate[1];
        AccountsUpdate accountsCreate = new AccountsUpdate();
        
        AccountsQuery query = new AccountsQuery();
        AccountsCriteria accountsCriteria = new AccountsCriteria();
        accountsCriteria.setSAKNR(KJKMPublicMethods.setTextCriteria(zzkmdm_value));
        query.setCriteria(accountsCriteria);
        AccountsResultSet fres = null;
        try {
            fres = proxy.searchAccounts(query, KJKMPublicMethods.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        AccountsID fid = new AccountsID();
        fid.setInternalID(fres.getAccounts()[0].getRecordIdentification().getInternalID());
        accountsCreate.setRecordIdentification(fid);
        
        accountsCreate.setSAKNR(zzkmdm_value);
        ApprovalStatusLookup approvalStatusLookup = KJKMPublicMethods.getAPCODCode("0", proxy);
        if(null == approvalStatusLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查询审批状态代码0失败。");
            return SUCCESS;
        }
        accountsCreate.setAPCOD(approvalStatusLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        accountsCreate.setApplicant(applicant_chinese_value);
        OperationLookup operationLookup = KJKMPublicMethods.getOperation(czbs_value, proxy);
        if(null == operationLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查询操作标识："+czbs_value+" 失败。");
            return SUCCESS;
        }
        accountsCreate.setOperation(operationLookup);
        accountsCreates[0] = accountsCreate;
        UpdateConfigurationParameters createConfigurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = proxy.updateAccounts(accountsCreates, KJKMPublicMethods.setReposInfo(), createConfigurationParameters);
            for (ExecutionStatus execute : executionStatus) {
                String status = execute.getStatus();
                if (!"OK".equalsIgnoreCase(status)) {
                    request.getRequestManager().setMessageid("failed");
                    request.getRequestManager().setMessagecontent(execute.getFault()[0].getText());
                } else {
                    //KJKMPublicMethods.updateKJKMReturnMsg(status, messag, requestid);
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("调用SAP异常信息：" + e.getMessage());
            PublicMethod.setFailedMessage(request, "failed", "调用MDM接口失败："+e.getLocalizedMessage());
        }
        return SUCCESS;
    }

    public static void main(String[] args) {
        JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();
        KJKMPublicMethod KJKMPublicMethods = new KJKMPublicMethod();
        AccountsUpdate[] accountsCreates = new AccountsUpdate[1];
        AccountsUpdate accountsCreate = new AccountsUpdate();
        
        accountsCreate.setSAKNR("ceshi3");
        ApprovalStatusLookup approvalStatusLookup = KJKMPublicMethods.getAPCODCode("0", proxy);
        accountsCreate.setAPCOD(approvalStatusLookup);
        accountsCreate.setApplicant("1");
        OperationLookup operationLookup = KJKMPublicMethods.getOperation("01", proxy);
        accountsCreate.setOperation(operationLookup);
        
        accountsCreates[0] = accountsCreate;
        UpdateConfigurationParameters createConfigurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = proxy.updateAccounts(accountsCreates, KJKMPublicMethods.setReposInfo(), createConfigurationParameters);
            for (ExecutionStatus execute : executionStatus) {
                String status = execute.getStatus();
                if (!"OK".equalsIgnoreCase(status)) {
                } else {
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
