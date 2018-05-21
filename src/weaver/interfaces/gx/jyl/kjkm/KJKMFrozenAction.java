package weaver.interfaces.gx.jyl.kjkm;

import java.rmi.RemoteException;
import java.util.List;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 会计科目修改
 */
public class KJKMFrozenAction extends BaseBean implements Action {

    private PublicMethod PublicMethods = new PublicMethod();
    private KJKMPublicMethod KJKMPublicMethods = new KJKMPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("会计科目退回操作，不执行接口.");
            return SUCCESS;
        }
        //总账科目编码-值
        String zzkmdm_value = "";
        //总账科目编码-字段
        String zzkmdm_column = "zzkm";
        //审批状态-值
        String spzt_value = "";
        //审批状态-字段
        String spzt_column = "spzt";
        //操作标识-值
        String czbs_value = "";
        //操作标识-字段
        String czbs_column = "czbs";
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //公司代码-值
        String djbz_value = "";
        //公司代码-字段
        String djbz_column = "sqlb";
        //流程发起人-值
        String applicant_value = "";
        //流程发起人-字段
        String applicant_column = "sqr";

        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(zzkmdm_column)) {
                zzkmdm_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(djbz_column)) {
                djbz_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
        }
        writeLog("总帐科目：" + zzkmdm_value);
        writeLog("审批状态：" + spzt_value);
        writeLog("操作标识：" + czbs_value);
        writeLog("公司代码：" + gsdm_value);
        writeLog("冻结标识：" + djbz_value);
        writeLog("申请人：" + applicant_value);

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
        if("0".equals(djbz_value)){
            accountsCreate.setXSPEB(true);
        } else {
            accountsCreate.setXSPEB(false);
        }
        ApprovalStatusLookup approvalStatusLookup = KJKMPublicMethods.getAPCODCode(spzt_value, proxy);
        approvalStatusLookup.setDisplayValue(spzt_value);
        accountsCreate.setAPCOD(approvalStatusLookup);
        OperationLookup operationLookup = KJKMPublicMethods.getOperation(czbs_value, proxy);
        operationLookup.setDisplayValue(czbs_value);
        accountsCreate.setOperation(operationLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        accountsCreate.setUpdateBy(applicant_chinese_value);
        //根据关系查找系统代码 
        List<FFXTMode> ffxtList = PublicMethods.getFFXT(gsdm_value,"科目");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
        for(int i = 0; i < ffxtList.size(); i++) {
            String ffxtdm = ffxtList.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KJKMPublicMethods.getFFXTDM(ffxtdm,proxy);
            if(null == serviceRelationshipsTupleTuple) {
                request.getRequestManager().setMessageid("failed");
                request.getRequestManager().setMessagecontent("查询分发系统代码"+ffxtdm+"失败，可能OA中维护的科目类型和MDM维护信息不一致。");
                return SUCCESS;
            } else {
                serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
            }
            DistributionStatusLookup distributionStatusLookup = KJKMPublicMethods.getFFZT("0",proxy);
            if(null == distributionStatusLookup) {
                request.getRequestManager().setMessageid("failed");
                request.getRequestManager().setMessagecontent("查询分发系统代码状态0失败，可能OA中维护的科目类型和MDM维护信息不一致。");
                return SUCCESS;
            } else {
                distributionStatusLookup.setDisplayValue("0");
            }
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = fres.getAccounts()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                String clientsystem = "";
                ClientLookup ClientLookup = service.getCLIENT_SYSTEM();
                if(null != ClientLookup) {
                    clientsystem = ClientLookup.getDisplayValue();
                    if(clientsystem.equals(ffxtdm)) {
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        accountsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        accountsCreates[0] = accountsCreate;
        UpdateConfigurationParameters createConfigurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = proxy.updateAccounts(accountsCreates, KJKMPublicMethods.setReposInfo(), createConfigurationParameters);
            for (ExecutionStatus execute : executionStatus) {
                String status = execute.getStatus();
                String messag = execute.getDescription();
                if (!"OK".equalsIgnoreCase(status)) {
                    request.getRequestManager().setMessageid("failed");
                    request.getRequestManager().setMessagecontent(execute.getFault()[0].getText());
                } else {
                    KJKMPublicMethods.updateKJKMReturnMsg(status, messag, requestid);//FIXME
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("调用SAP异常信息：" + e.getMessage());
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
        accountsCreate.setUpdateBy("1");
        accountsCreate.setXSPEB(true);
        OperationLookup operationLookup = KJKMPublicMethods.getOperation("12", proxy);
        accountsCreate.setOperation(operationLookup);
        ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[2];
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KJKMPublicMethods.getFFXTDM("ECC_NY", proxy);
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple1 = KJKMPublicMethods.getFFXTDM("JIUQI", proxy);
        ServiceRelationshipsTupleTuples[0] = serviceRelationshipsTupleTuple;
        ServiceRelationshipsTupleTuples[1] = serviceRelationshipsTupleTuple1;
        accountsCreate.setServiceRelationshipsTuple(ServiceRelationshipsTupleTuples);
        
        accountsCreates[0] = accountsCreate;
        UpdateConfigurationParameters createConfigurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = proxy.updateAccounts (accountsCreates, KJKMPublicMethods.setReposInfo(), createConfigurationParameters);
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
