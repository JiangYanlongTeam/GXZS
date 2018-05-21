package weaver.interfaces.gx.jyl.jjzx;

import java.rmi.RemoteException;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatus;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Client;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatus;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Operation;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.BasicRecordIdentification;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

/**
 * 基金中心公共方法
 */
public class JJZXPublicMethod extends BaseBean {

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
    
    /**
     * 审批状态代码
     * @param value 固定值
     */
    public ApprovalStatusLookup getAPCODCode(String value,
                                             JSGX_MDM_FICOTRViProxy f) {
        ApprovalStatusQuery approvalStatusQuery = new ApprovalStatusQuery();
        ApprovalStatusCriteria approvalStatusCriteria = new ApprovalStatusCriteria();
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(value);
        textCriteria.setConstraint(new TextConstraint[] { textConstraint });
        approvalStatusCriteria.setCode(textCriteria);
        approvalStatusQuery.setCriteria(approvalStatusCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        ApprovalStatusResultSet approvalStatusResultSet = null;
        try {
            approvalStatusResultSet = f.searchApprovalStatus(approvalStatusQuery, reposInfo);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            writeLog("调用MDM查询审批状态代码异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = approvalStatusResultSet.getExecutionStatus();
        String status = executionStatus.getStatus();
        ApprovalStatusLookup approvalStatusLookup = null;
        if("OK".equalsIgnoreCase(status) && null != executionStatus.getStatus() && executionStatus.getStatus().length() > 0){
            ApprovalStatus[] approvalStatus = approvalStatusResultSet.getApprovalStatus();
            if(null != approvalStatus) {
                ApprovalStatus results = approvalStatus[0];
                ApprovalStatusID approvalStatusID = results.getRecordIdentification();
                approvalStatusLookup = new ApprovalStatusLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(approvalStatusID.getInternalID());
                approvalStatusLookup.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return approvalStatusLookup;
    }

    /**
     * 获取操作标识
     * 
     * @param value
     */
    public OperationLookup getOperation(String value,
                                        JSGX_MDM_FICOTRViProxy f) {
        OperationQuery operationQuery = new OperationQuery();
        OperationCriteria operationCriteria = new OperationCriteria();
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(value);
        textCriteria.setConstraint(new TextConstraint[] { textConstraint });
        operationCriteria.setCode(textCriteria);
        operationQuery.setCriteria(operationCriteria);
        OperationResultSet operateres = null;
        RepositoryInformation reposInfo = setReposInfo();
        try {
            operateres = f.searchOperation(operationQuery, reposInfo);
        } catch (RemoteException e1) {
            e1.printStackTrace();
            writeLog("调用MDM查询操作标识异常："+e1.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = operateres.getExecutionStatus();
        String status = executionStatus.getStatus();
        OperationLookup operatelook = null;
        if("OK".equalsIgnoreCase(status) && null != operateres.getOperation() && operateres.getOperation().length > 0) {
            Operation[] operation = operateres.getOperation();
            if(null != operation) {
                Operation operat = operation[0];
                OperationID identi = operat.getRecordIdentification();
                operatelook = new OperationLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(identi.getInternalID());
                operatelook.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return operatelook;
    }

    /**
     * 获取分发状态代码
     * 
     * @param value 状态0
     * @param f
     * @return
     */
    public DistributionStatusLookup getFFZT(String value,JSGX_MDM_FICOTRViProxy f){
        
        DistributionStatusQuery distributionStatusQuery = new DistributionStatusQuery();
        DistributionStatusCriteria distributionStatusCriteria = new DistributionStatusCriteria();
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(value);
        textCriteria.setConstraint(new TextConstraint[] { textConstraint });
        distributionStatusCriteria.setCode(textCriteria);
        
        distributionStatusQuery.setCriteria(distributionStatusCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        DistributionStatusResultSet approvalStatusResultSet = null;
        try {
            approvalStatusResultSet  = f.searchDistributionStatus(distributionStatusQuery, reposInfo);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            writeLog("调用MDM查询分发状态代码异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = approvalStatusResultSet.getExecutionStatus();
        String status = executionStatus.getStatus();
        DistributionStatusLookup distributionStatusLookup = null;
        if("OK".equalsIgnoreCase(status) && null != executionStatus.getStatus() && executionStatus.getStatus().length() > 0){
            DistributionStatus[] distributionStatus = approvalStatusResultSet.getDistributionStatus();
            if(null != distributionStatus) {
                DistributionStatus results = approvalStatusResultSet.getDistributionStatus()[0];
                DistributionStatusID approvalStatusID = results.getRecordIdentification();
                distributionStatusLookup = new DistributionStatusLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(approvalStatusID.getInternalID());
                distributionStatusLookup.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return distributionStatusLookup;
    }
    
    
    /**
     * 设置RepositoryInformation对象
     * 
     * @return
     */
    public RepositoryInformation setReposInfo() {
        RepositoryInformation reposInfo = new RepositoryInformation();
        reposInfo.setDataLang("Chinese [CN]");
        reposInfo.setRepositoryName("JSGX_MDM_FICOTR_Dev");
        reposInfo.setServerName("MDP");
        return reposInfo;
    }
    
    /**
     * 更新创建成功标识字段
     * 
     * @param status
     * @param message
     * @param requestid
     */
    public void updateJJZXReturnMsg(String status,String message,String requestid) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("MDM", "MDM_JJZX_TABLE");
        String sql = "update "+tablename+" set fhzt = '"+status+"', fhxx = '"+message+"' where requestid = '"+requestid+"'";
        writeLog("处理SAP返回消息和状态SQL："+sql);
        rs.execute(sql);
    }
    
    /**
     * 查询公司代码
     * 
     * @param disvalue
     * @param f
     * @return
     */
    public CompanyCodeLookup lookCompanyCode(String disvalue, JSGX_MDM_FICOTRViProxy f) {
        CompanyCodeLookup companyCodeLookup = new CompanyCodeLookup();
        companyCodeLookup.setDisplayValue(disvalue);
        CompanyCodeQuery companyCodeQuery = new CompanyCodeQuery();
        CompanyCodeCriteria companyCodeCriteria = new CompanyCodeCriteria();
        companyCodeCriteria.setCode(setTextCriteria(disvalue));
        companyCodeQuery.setCriteria(companyCodeCriteria);
        CompanyCodeResultSet companyCodeResultSet = null;
        try {
            companyCodeResultSet = f.searchCompanyCode(companyCodeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("调用MDM查询分发状态代码异常："+e.getMessage());
            return null;
        }
        if(null != companyCodeResultSet && null != companyCodeResultSet.getCompanyCode() && companyCodeResultSet.getCompanyCode().length > 0) {
            BasicRecordIdentification base = new BasicRecordIdentification();
            base.setInternalID(companyCodeResultSet.getCompanyCode()[0].getRecordIdentification().getInternalID());
            companyCodeLookup.setRecordIdentification(base);
        } else {
            return null;
        }
        return companyCodeLookup;
    }
    
    /**
     * 处理时间字符串
     * @param date
     * @return
     */
    public String toyyyyMMdd(String date) {
        String[] strs = date.split("-");
        StringBuffer sb = new StringBuffer();
        for(String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
    
    /**
     * 处理时间字符串
     * @param date
     * @return
     */
    public String toyyyyMMdd(String date,String time) {
        String[] strs = time.split(":");
        StringBuffer sb = new StringBuffer();
        for(String s : strs) {
            sb.append(s);
        }
        return date + sb.toString();
    }
    
    
    /**
     * 获取分发系统代码内部码
     * 
     * @param value
     * @param f
     * @return
     */
    public ServiceRelationshipsTupleTuple getFFXTDM(String value,JSGX_MDM_FICOTRViProxy f) {
        ClientQuery clientQuery = new ClientQuery();
        ClientCriteria clientCriteria = new ClientCriteria();
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(value);
        textConstraints[0] = textConstraint;
        textCriteria.setConstraint(textConstraints);
        clientCriteria.setCode(textCriteria);
        clientQuery.setCriteria(clientCriteria);
        ClientResultSet clientResultSet = null;
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = null;
        try {
            clientResultSet = f.searchClient(clientQuery, setReposInfo());
            ExecutionStatus execution = clientResultSet.getExecutionStatus();
            String status = execution.getStatus();
            if("OK".equalsIgnoreCase(status)){
                Client[] clients = clientResultSet.getClient();
                if(null != clients) {
                    ClientID clientId = clients[0].getRecordIdentification();
                    serviceRelationshipsTupleTuple = new ServiceRelationshipsTupleTuple();
                    ClientLookup clientLookup = new ClientLookup();
                    clientLookup.setDisplayValue(value);
                    BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                    basicRecordIdentification.setInternalID(clientId.getInternalID());
                    clientLookup.setRecordIdentification(basicRecordIdentification);
                    serviceRelationshipsTupleTuple.setCLIENT_SYSTEM(clientLookup);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("获取分发系统代码异常："+e.getMessage());
            return null;
        }
        return serviceRelationshipsTupleTuple;
    }
}
