package weaver.interfaces.gx.jyl.cnxm;

import java.rmi.RemoteException;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate;
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
 * 承诺项目提交状态变更-退回
 */
public class CNXMTHAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private CNXMPublicMethod publicmethod = new CNXMPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        //承诺项目编码-值
        String cnxmbm_value = "";
        //承诺项目编码-字段
        String cnxmbm_column = "cnxmbm";
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
            if (name.equals(cnxmbm_column)) {
                cnxmbm_value = value;
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
        writeLog("承诺项目编码："+cnxmbm_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("申请人："+sqr_value);
        writeLog("操作标识："+czbs_value);
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        UpdateConfigurationParameters CreateConfigurationParameters = new UpdateConfigurationParameters();
        CommitmentltemUpdate[] CommitmentltemCreates = new CommitmentltemUpdate[1];
        CommitmentltemUpdate CommitmentltemCreate = new CommitmentltemUpdate();
        CommitmentltemQuery CommitmentltemQuery = new CommitmentltemQuery();
        CommitmentltemCriteria CommitmentltemCriteria = new CommitmentltemCriteria();
        CommitmentltemCriteria.setFIPOS(publicmethod.setTextCriteria(cnxmbm_value));
        CommitmentltemQuery.setCriteria(CommitmentltemCriteria);
        CommitmentltemResultSet CommitmentltemResultSet = null;
        try {
            CommitmentltemResultSet = f.searchCommitmentltem(CommitmentltemQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        CommitmentltemID CommitmentltemID = new CommitmentltemID();
        CommitmentltemID.setInternalID(CommitmentltemResultSet.getCommitmentltem()[0].getRecordIdentification().getInternalID());
        CommitmentltemCreate.setRecordIdentification(CommitmentltemID);
        CommitmentltemCreate.setFIPOS(cnxmbm_value);
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode(spzt_value, f);
        if(null == ApprovalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询审批状态："+spzt_value+ " 失败.");
            return SUCCESS;
        }
        CommitmentltemCreate.setAPCOD(ApprovalStatusLookup);
        if(!"".equals(sqr_value)) {
            try {
                sqr_value = new ResourceComInfo().getLastname(sqr_value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        CommitmentltemCreate.setUpdateBy(sqr_value);
        OperationLookup OperationLookup = publicmethod.getOperation(czbs_value, f);
        if(null == OperationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询操作标识："+czbs_value+ " 失败.");
            return SUCCESS;
        }
        CommitmentltemCreate.setOperation(OperationLookup);
        
        CommitmentltemCreates[0] = CommitmentltemCreate;
        ExecutionStatus[]  ExecutionStatus = null;
        try {
            ExecutionStatus = f.updateCommitmentltem(CommitmentltemCreates, publicmethod.setReposInfo(), CreateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethods.setFailedMessage(request, "failed", "创建承诺项目主数据失败："+e.getLocalizedMessage());
            return SUCCESS;
        }
        if(null != ExecutionStatus && ExecutionStatus.length > 0) {
            String status = ExecutionStatus[0].getStatus();
            if(!"OK".equals(status)) {
                String message = ExecutionStatus[0].getFault()[0].getText();
                PublicMethods.setFailedMessage(request, "failed", "创建承诺项目主数据失败：" + message);
                return SUCCESS;
            } else {
                String message = ExecutionStatus[0].getDescription();
                publicmethod.updateCNXMReturnMsg(status, message, requestid);
            }
        } else {
            PublicMethods.setFailedMessage(request, "failed", "创建承诺项目主数据失败");
            return SUCCESS;
        }
        return SUCCESS;
    }
    
    public static void main(String[] args) {
        
    }
}
