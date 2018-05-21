package weaver.interfaces.gx.jyl.jjzx;

import java.rmi.RemoteException;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 基金中心退回状态变更
 */
public class JJZXTHAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();
    
    private JJZXPublicMethod publicmethod = new JJZXPublicMethod();
    
    public String execute(RequestInfo request) {
        //基金中心编码-值
        String jjzxdm_value = "";
        //基金中心编码-字段
        String jjzxdm_column = "jjzxbm";
        //流程发起人-值
        String applicant_value = "";
        //流程发起人-字段
        String applicant_column = "sqr";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(jjzxdm_column)) {
                jjzxdm_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
        }
        writeLog("基金中心代码："+jjzxdm_value);
        writeLog("申请人："+applicant_value);
        writeLog("审批状态：0");
        writeLog("操作标识：01");
        
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        FundcenterUpdate[] fundcenterUpdates = new FundcenterUpdate[1];
        FundcenterUpdate fundcenterUpdate = new FundcenterUpdate();
        FundcenterQuery query = new FundcenterQuery();
        FundcenterCriteria fundcenterCriteria = new FundcenterCriteria();
        fundcenterCriteria.setFICTR(publicmethod.setTextCriteria(jjzxdm_value));
        query.setCriteria(fundcenterCriteria);
        FundcenterResultSet fres = null;
        try {
            fres = f.searchFundcenter(query, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        
        FundcenterID fundcenterID = new FundcenterID();
        fundcenterID.setInternalID(fres.getFundcenter()[0].getRecordIdentification().getInternalID());
        fundcenterUpdate.setRecordIdentification(fundcenterID);
        
        fundcenterUpdate.setFICTR(jjzxdm_value);//基金中心编码
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        fundcenterUpdate.setUpdateBy(applicant_chinese_value);//申请人
        ApprovalStatusLookup statuslook = publicmethod.getAPCODCode("0", f);
        if(null == statuslook) {
            PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护审批状态值");
            return SUCCESS;
        }
        fundcenterUpdate.setAPCOD(statuslook);//审批状态代码
        OperationLookup operatelook = publicmethod.getOperation("01", f);
        if(null == operatelook) {
            PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护操作标识值");
            return SUCCESS;
        }
        operatelook.setDisplayValue("01");
        fundcenterUpdate.setOperation(operatelook);//操作标识
        fundcenterUpdates[0] = fundcenterUpdate;
        RepositoryInformation reposInfo = publicmethod.setReposInfo();
        UpdateConfigurationParameters configurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = f.updateFundcenter(fundcenterUpdates, reposInfo, configurationParameters);
            for(ExecutionStatus execute : executionStatus) {
                String status = execute.getStatus();
                if (!"OK".equalsIgnoreCase(status)) {
                    request.getRequestManager().setMessageid("failed");
                    request.getRequestManager().setMessagecontent(execute.getFault()[0].getText());
                } else {
                    //publicmethod.updateJJZXReturnMsg(status,returnmessage,requestid);
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethods.setFailedMessage(request, "failed", "调用MDM接口失败："+e.getLocalizedMessage());
        }
        return SUCCESS;
    }
    
    public static void main(String[] args) {
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        FundcenterUpdate[] fundcenterUpdates = new FundcenterUpdate[1];
        FundcenterUpdate fundcenterUpdate = new FundcenterUpdate();
        fundcenterUpdate.setFICTR("10009");//基金中心编码
        fundcenterUpdate.setApplicant("14164");//申请人
        JJZXPublicMethod publicmethod = new JJZXPublicMethod();
        ApprovalStatusLookup statuslook = publicmethod.getAPCODCode("0", f);
        if(null == statuslook) {
        }
        fundcenterUpdate.setAPCOD(statuslook);//审批状态代码
        OperationLookup operatelook = publicmethod.getOperation("01", f);
        if(null == operatelook) {
        }
        operatelook.setDisplayValue("01");
        fundcenterUpdate.setOperation(operatelook);//操作标识
        
        RepositoryInformation reposInfo = publicmethod.setReposInfo();
        UpdateConfigurationParameters configurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = f.updateFundcenter(fundcenterUpdates, reposInfo, configurationParameters);
            for(ExecutionStatus execute : executionStatus) {
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
