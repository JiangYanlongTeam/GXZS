package weaver.interfaces.gx.jyl.wl;

import java.rmi.RemoteException;

import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatus;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusID;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.Client;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ClientCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ClientID;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ClientQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatus;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusID;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Criteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Query;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Criteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Query;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Criteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Query;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialType;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.Operation;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationID;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.BasicRecordIdentification;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

/**
 * 物料公共方法
 */
public class WLPublicMethod extends BaseBean {
    
    /**
     * 获取分发系统代码内部码
     * 
     * @param value
     * @param f
     * @return
     */
    public ServiceRelationshipsTupleTuple getFFXTDM(String value,JSGX_MDM_MATERIALViProxy f) {
        ClientQuery clientQuery = new ClientQuery ();
        ClientCriteria clientCriteria = new ClientCriteria();
        clientCriteria.setCode(setTextCriteria(value));
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
     * 查找普通项目类别组
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public MTPOS__Lookup lookMTPOS__Lookup(String disvalue,JSGX_MDM_MATERIALViProxy proxy) {
        MTPOS__Lookup mTPOS__Lookup = new MTPOS__Lookup();
        mTPOS__Lookup.setDisplayValue(disvalue);
        MTPOS__Query mTPOS__Query = new MTPOS__Query();
        MTPOS__Criteria mTPOS__Criteria = new MTPOS__Criteria();
        mTPOS__Criteria.setCode(setTextCriteria(disvalue));
        mTPOS__Query.setCriteria(mTPOS__Criteria);
        MTPOS__ResultSet mTPOS__ResultSet = null;
        try {
            mTPOS__ResultSet = proxy.searchMTPOS(mTPOS__Query, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找普通项目类别组异常："+ e.getLocalizedMessage());
            return null;
        }
        if(null != mTPOS__ResultSet) {
            MTPOS[] MTPOS = mTPOS__ResultSet.getMTPOS();
            if(null != MTPOS && MTPOS.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(MTPOS[0].getRecordIdentification().getInternalID());
                mTPOS__Lookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return mTPOS__Lookup;
    }
    
    /**
     * 查找产品组
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public ProductGroupLookup lookProductGroupLookup(String disvalue,JSGX_MDM_MATERIALViProxy proxy) {
        ProductGroupLookup productGroupLookup = new ProductGroupLookup();
        productGroupLookup.setDisplayValue(disvalue);
        ProductGroupQuery productGroupQuery = new ProductGroupQuery();
        ProductGroupCriteria productGroupCriteria = new ProductGroupCriteria();
        productGroupCriteria.setCode(setTextCriteria(disvalue));
        productGroupQuery.setCriteria(productGroupCriteria);
        ProductGroupResultSet productGroupResultSet = null;
        try {
            productGroupResultSet = proxy.searchProductGroup(productGroupQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找产品组异常：" + e.getLocalizedMessage());
            return null;
        }
        if(null != productGroupResultSet) {
            ProductGroup[] productGroups = productGroupResultSet.getProductGroup();
            if(null != productGroups && productGroups.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(productGroups[0].getRecordIdentification().getInternalID());
                productGroupLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return productGroupLookup;
    }
    
    /**
     * 查找物资类型
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public MaterialTypeLookup lookMaterialTypeLookup(String disvalue,JSGX_MDM_MATERIALViProxy proxy) {
        MaterialTypeLookup materialTypeLookup = new MaterialTypeLookup();
        materialTypeLookup.setDisplayValue(disvalue);
        MaterialTypeQuery materialTypeQuery = new MaterialTypeQuery();
        MaterialTypeCriteria materialTypeCriteria = new MaterialTypeCriteria();
        materialTypeCriteria.setCode(setTextCriteria(disvalue));
        materialTypeQuery.setCriteria(materialTypeCriteria);
        MaterialTypeResultSet materialTypeResultSet = null;
        try {
            materialTypeResultSet = proxy.searchMaterialType(materialTypeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找物资类型异常："+e.getLocalizedMessage());
            return null;
        }
        if(null != materialTypeResultSet) {
            MaterialType[] materialTypes = materialTypeResultSet.getMaterialType();
            if(null != materialTypes && materialTypes.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(materialTypes[0].getRecordIdentification().getInternalID());
                materialTypeLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        }
        return materialTypeLookup;
    }
    
    /**
     * 查找行业领域
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public IndustrySectorLookup lookIndustrySectorLookup(String disvalue,JSGX_MDM_MATERIALViProxy proxy) {
        IndustrySectorLookup industrySectorLookup = new IndustrySectorLookup();
        industrySectorLookup.setDisplayValue(disvalue);
        IndustrySectorQuery industrySectorQuery = new IndustrySectorQuery();
        IndustrySectorCriteria industrySectorCriteria = new IndustrySectorCriteria();
        industrySectorCriteria.setCode(setTextCriteria(disvalue));
        industrySectorQuery.setCriteria(industrySectorCriteria);
        IndustrySectorResultSet industrySectorResultSet = null;
        try {
            industrySectorResultSet = proxy.searchIndustrySector(industrySectorQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找行业领域异常："+ e.getLocalizedMessage());
            return null;
        }
        if(null != industrySectorResultSet) {
            IndustrySector[] industrySectors = industrySectorResultSet.getIndustrySector();
            if(null != industrySectors && industrySectors.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(industrySectors[0].getRecordIdentification().getInternalID());
                industrySectorLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return industrySectorLookup;
    }
    
    /**
     * 查找基本计量单位
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public MEINS__Lookup lookMEINS__Lookup(String disvalue,JSGX_MDM_MATERIALViProxy proxy) {
        MEINS__Lookup mEINS__Lookup = new MEINS__Lookup();
        mEINS__Lookup.setDisplayValue(disvalue);
        MEINS__Query mEINS__Query = new MEINS__Query();
        MEINS__Criteria mEINS__Criteria = new MEINS__Criteria();
        mEINS__Criteria.setCode(setTextCriteria(disvalue));
        mEINS__Query.setCriteria(mEINS__Criteria);
        MEINS__ResultSet mEINS__ResultSet = null;
        try {
            mEINS__ResultSet = proxy.searchMEINS(mEINS__Query, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找基本计量单位异常："+e.getLocalizedMessage());
            return null;
        }
        if(null != mEINS__ResultSet) {
            MEINS[] mEINSs = mEINS__ResultSet.getMEINS();
            if(null != mEINSs && mEINSs.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(mEINSs[0].getRecordIdentification().getInternalID());
                mEINS__Lookup.setRecordIdentification(base);
            }
        } else {
            return null;
        }
        return mEINS__Lookup;
    }
    
    /**
     * 查找物资组
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public MATKL__Lookup lookMATKL__Lookup(String disvalue, JSGX_MDM_MATERIALViProxy proxy) {
        MATKL__Lookup mATKL__Lookup = new MATKL__Lookup();
        mATKL__Lookup.setDisplayValue(disvalue);
        MATKL__Query mATKL__Query = new MATKL__Query();
        MATKL__Criteria mATKL__Criteria = new MATKL__Criteria();
        mATKL__Criteria.setCode(setTextCriteria(disvalue));
        mATKL__Query.setCriteria(mATKL__Criteria);
        MATKL__ResultSet mMATKL__ResultSet = null;
        try {
            mMATKL__ResultSet = proxy.searchMATKL(mATKL__Query, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找物资组异常："+e.getLocalizedMessage());
            return null;
        }
        if(null != mMATKL__ResultSet) {
            MATKL[] mATKLs = mMATKL__ResultSet.getMATKL();
            if(null != mATKLs && mATKLs.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(mATKLs[0].getRecordIdentification().getInternalID());
                mATKL__Lookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return mATKL__Lookup;
    }
    
    /**
     * 获取操作标识
     * 
     * @param value code
     * @param f 代理类
     * @return
     */
    public OperationLookup lookOperation(String value, JSGX_MDM_MATERIALViProxy f) {
        OperationQuery operationQuery = new OperationQuery();
        OperationCriteria operationCriteria = new OperationCriteria();
        operationCriteria.setCode(setTextCriteria(value));
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
        if("OK".equalsIgnoreCase(status)) {
            Operation[] operation = operateres.getOperation();
            if(null != operation && operation.length > 0) {
                Operation operat = operation[0];
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
     * 获取分发状态代码
     * 
     * @param value 状态0
     * @param f
     * @return
     */
    public DistributionStatusLookup getFFZT(String value,JSGX_MDM_MATERIALViProxy f){
        
        DistributionStatusQuery distributionStatusQuery = new DistributionStatusQuery();
        DistributionStatusCriteria distributionStatusCriteria = new DistributionStatusCriteria();
        
        distributionStatusCriteria.setCode(setTextCriteria(value));
        
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
        if("OK".equalsIgnoreCase(status)){
            DistributionStatus[] distributionStatus = approvalStatusResultSet.getDistributionStatus();
            if(null != distributionStatus && distributionStatus.length > 0) {
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
     * 审批状态代码
     * 
     * @param value code
     * @param f 代理类
     * @return
     */
    public ApprovalStatusLookup getAPCODCode(String value, JSGX_MDM_MATERIALViProxy f) {
        ApprovalStatusQuery approvalStatusQuery = new ApprovalStatusQuery();
        ApprovalStatusCriteria approvalStatusCriteria = new ApprovalStatusCriteria();
        approvalStatusCriteria.setCode(setTextCriteria(value));
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
        if("OK".equalsIgnoreCase(status)){
            ApprovalStatus[] approvalStatus = approvalStatusResultSet.getApprovalStatus();
            if(null != approvalStatus && approvalStatus.length > 0) {
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
     * 更新创建成功标识字段
     * 
     * @param status
     * @param message
     * @param requestid
     */
    public void updateReturnMsg(String status,String message,String requestid) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("MDM", "MDM_WL_TABLE");
        String sql = "update "+tablename+" set fhzt = '"+status+"', fhxx = '"+message+"' where requestid = '"+requestid+"'";
        writeLog("处理SAP返回消息和状态SQL："+sql);
        rs.execute(sql);
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
    
    /**
     * 设置RepositoryInformation对象
     * 
     * @return
     */
    public RepositoryInformation setReposInfo() {
        RepositoryInformation reposInfo = new RepositoryInformation();
        reposInfo.setDataLang("");
        reposInfo.setRepositoryName("JSGX_MDM_MATERIAL_Dev");
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
