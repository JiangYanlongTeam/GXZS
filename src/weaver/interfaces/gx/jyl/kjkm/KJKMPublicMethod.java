package weaver.interfaces.gx.jyl.kjkm;

import java.rmi.RemoteException;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet;
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

public class KJKMPublicMethod extends BaseBean {


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
     * 查找科目组
     * 
     * @param displayvalue
     * @param proxy
     * @return
     */
    public AccountGroupLookup lookAccountGroup(String displayvalue, JSGX_MDM_FICOTRViProxy proxy){
        AccountGroupQuery query = new AccountGroupQuery();
        AccountGroupCriteria accountGroupCriteria = new AccountGroupCriteria();
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(displayvalue);
        textConstraints[0] = textConstraint;
        textCriteria.setConstraint(textConstraints);
        accountGroupCriteria.setCode(textCriteria);
        query.setCriteria(accountGroupCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        AccountGroupLookup accountGroupLookup = new AccountGroupLookup();
        accountGroupLookup.setDisplayValue(displayvalue);
        BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
        try {
            AccountGroupResultSet accountGroupResultSet = proxy.searchAccountGroup(query, reposInfo);
            ExecutionStatus executionStatus = accountGroupResultSet.getExecutionStatus();
            String status = executionStatus.getStatus();
            //判断status 是否为OK，如果不为OK，说明查询不到数据
            if("OK".equalsIgnoreCase(status)){
                AccountGroup[] accountGroups = accountGroupResultSet.getAccountGroup();
                //判断accountGroups 是否为null，如果为null，说明查询不到数据
                if(null != accountGroups && accountGroups.length > 0) {
                    AccountGroupID accountGroupID = accountGroups[0].getRecordIdentification();
                    basicRecordIdentification.setInternalID(accountGroupID.getInternalID());
                    accountGroupLookup.setRecordIdentification(basicRecordIdentification);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (RemoteException e) {
            log("查找科目组异常信息："+e.getMessage());
            return null;
        }
        return accountGroupLookup;
    }
    
    /**
     * 搜索科目类型
     * 
     * @param displayvalue
     * @param proxy
     * @return
     */
    public AccountTypeLookup lookAccountTypeLookup(String displayvalue, JSGX_MDM_FICOTRViProxy proxy){
        AccountTypeQuery query = new AccountTypeQuery();
        AccountTypeCriteria accountTypeCriteria = new AccountTypeCriteria();
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(displayvalue);
        textConstraints[0] = textConstraint;
        textCriteria.setConstraint(textConstraints);
        accountTypeCriteria.setCode(textCriteria);
        query.setCriteria(accountTypeCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        AccountTypeLookup accountTypeLookup = new AccountTypeLookup();
        accountTypeLookup.setDisplayValue(displayvalue);
        BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
        try {
            AccountTypeResultSet accountTypeResultSet = proxy.searchAccountType(query, reposInfo);
            ExecutionStatus executionStatus = accountTypeResultSet.getExecutionStatus();
            String status = executionStatus.getStatus();
            //判断status 是否为OK，如果不为OK，说明查询不到数据
            if("OK".equalsIgnoreCase(status)){
                AccountType[] accountTypes = accountTypeResultSet.getAccountType();
                //判断accountTypes 是否为null，如果为null，说明查询不到数据
                if(null != accountTypes && accountTypes.length > 0) {
                    AccountTypeID accountGroupID = accountTypes[0].getRecordIdentification();
                    basicRecordIdentification.setInternalID(accountGroupID.getInternalID());
                    accountTypeLookup.setRecordIdentification(basicRecordIdentification);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (RemoteException e) {
            log("获取科目类型异常："+e.getMessage());
            return null;
        }
        return accountTypeLookup;
    }
    
    /**
     * 审批状态代码
     * @param value 固定值
     */
    public ApprovalStatusLookup getAPCODCode(String value, JSGX_MDM_FICOTRViProxy f) {
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
            writeLog("获取审批状态异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = approvalStatusResultSet.getExecutionStatus();
        String status = executionStatus.getStatus();
        //判断status 是否为OK，如果不为OK，说明查询不到数据
        ApprovalStatusLookup approvalStatusLookup = null;
        if("OK".equalsIgnoreCase(status)){
            ApprovalStatus[] approvalStatus = approvalStatusResultSet.getApprovalStatus();
            //判断approvalStatus 是否为null，如果为null，说明查询不到数据
            if(null != approvalStatus && approvalStatus.length > 0) {
                ApprovalStatus results = approvalStatus[0];
                ApprovalStatusID approvalStatusID = results.getRecordIdentification();
                approvalStatusLookup = new ApprovalStatusLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(approvalStatusID.getInternalID());
                approvalStatusLookup.setRecordIdentification(basicRecordIdentification);
                approvalStatusLookup.setDisplayValue(value);
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
    public OperationLookup getOperation(String value, JSGX_MDM_FICOTRViProxy f) {
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
            writeLog("获取操作标识异常："+e1.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = operateres.getExecutionStatus();
        String status = executionStatus.getStatus();
        OperationLookup operatelook = null;
        if("OK".equalsIgnoreCase(status)){
            Operation[] operations = operateres.getOperation();
            if(null != operations && operations.length > 0) {
                Operation operat = operateres.getOperation()[0];
                OperationID identi = operat.getRecordIdentification();
                operatelook = new OperationLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(identi.getInternalID());
                operatelook.setRecordIdentification(basicRecordIdentification);
                operatelook.setDisplayValue(value);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return operatelook;
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
                if(null != clients && clients.length > 0) {
                    ClientID clientId = clients[0].getRecordIdentification();
                    serviceRelationshipsTupleTuple = new ServiceRelationshipsTupleTuple();
                    ClientLookup clientLookup = new ClientLookup();
                    clientLookup.setDisplayValue(value);
                    BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                    basicRecordIdentification.setInternalID(clientId.getInternalID());
                    clientLookup.setRecordIdentification(basicRecordIdentification);
                    serviceRelationshipsTupleTuple.setCLIENT_SYSTEM(clientLookup);
                    serviceRelationshipsTupleTuple.setDisplayValue(value);
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
            writeLog("获取分发状态代码异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus execution = approvalStatusResultSet.getExecutionStatus();
        String status = execution.getStatus();
        DistributionStatusLookup distributionStatusLookup = null;
        if("OK".equalsIgnoreCase(status)){
            DistributionStatus[] distributionStatus = approvalStatusResultSet.getDistributionStatus();
            if(null != distributionStatus && distributionStatus.length > 0) {
                DistributionStatus results = distributionStatus[0];
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
     * 处理时间字符串
     * @param date
     * @return
     */
    public String dealDateTime(String date) {
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
    public String dealDateTime2(String date,String time) {
        String[] strs1 = date.split("-");
        StringBuffer sb = new StringBuffer();
        for(String s : strs1) {
            sb.append(s);
        }
        String[] strs = time.split(":");
        for(String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
    
    /**
     * 更新创建成功标识字段
     * 
     * @param status
     * @param message
     * @param requestid
     */
    public void updateKJKMReturnMsg(String status,String message,String requestid) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("MDM", "MDM_KJKM_TABLE");
        String sql = "update "+tablename+" set fhzt = '"+status+"', fhxx = '"+message+"' where requestid = '"+requestid+"'";
        writeLog("处理SAP返回消息和状态SQL："+sql);
        rs.execute(sql);
    }
    
    /**
     * 更新创建成功标识字段
     * 
     * @param status
     * @param message
     * @param requestid
     */
    public void updateKJKMReturnMsgForYHZH(String status,String message,String requestid) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("MDM", "MDM_YHZH_TABLE");
        String sql = "update "+tablename+" set kmfhzt = '"+status+"', kmfhxx = '"+message+"' where requestid = '"+requestid+"'";
        writeLog("处理SAP返回消息和状态SQL："+sql);
        rs.execute(sql);
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
     * 打印日志
     * @param o
     */
    public void log(Object o) {
        writeLog(o);
    }
}
