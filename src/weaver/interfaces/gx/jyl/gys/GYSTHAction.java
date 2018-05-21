package weaver.interfaces.gx.jyl.gys;

import java.rmi.RemoteException;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUpdate;
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
 * 供应商提交状态变更
 */
public class GYSTHAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private GYSPublicMethod publicmethod = new GYSPublicMethod();
    
    public String execute(RequestInfo request) {
        //供应商编号-值
        String gysbh_value = "";
        //供应商编号_字段
        String gysbh_column = "gysbh";
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
            if (name.equals(gysbh_column)) {
                gysbh_value = value;
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
        UpdateConfigurationParameters updateConfigurationParameters = new UpdateConfigurationParameters();
        VendorsUpdate[] vendorsCreates = new VendorsUpdate[1];
        VendorsUpdate vendorsCreate = new VendorsUpdate();
        
        VendorsQuery vendorsQuery = new VendorsQuery();
        VendorsCriteria vendorsCriteria = new VendorsCriteria();
        vendorsCriteria.setLIFNR(publicmethod.setTextCriteria(gysbh_value));
        vendorsQuery.setCriteria(vendorsCriteria);
        VendorsResultSet vendorsResultSet = null;
        try {
            vendorsResultSet = proxy.searchVendors(vendorsQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
            PublicMethods.setFailedMessage(request, "failed", "查找供应商编号内部码："+gysbh_value+" 失败");
            return SUCCESS;
        }
        if(null != vendorsResultSet && vendorsResultSet.getVendors().length > 0) {
            vendorsCreate.setRecordIdentification(vendorsResultSet.getVendors()[0].getRecordIdentification());
        } else {
            PublicMethods.setFailedMessage(request, "failed", "查找供应商编号内部码："+gysbh_value+" 失败");
            return SUCCESS;
        }
        
        writeLog("供应商编号："+gysbh_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("更新者："+sqr_value);
        writeLog("操作标识："+czbs_value);
        
        vendorsCreate.setLIFNR(gysbh_value);
        ApprovalStatusLookup approvalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == approvalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找审批状态代码："+spzt_value+" 失败");
            return SUCCESS;
        }
        approvalStatusLookup.setDisplayValue(spzt_value);
        vendorsCreate.setAPCOD(approvalStatusLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        vendorsCreate.setUpdateBy(applicant_chinese_value);
        
        OperationLookup operationLookup = publicmethod.lookOperation(czbs_value, proxy);
        if(null == operationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询操作标识："+czbs_value+" 失败");
            return SUCCESS;
        }
        vendorsCreate.setOperation(operationLookup);
        vendorsCreates[0] = vendorsCreate;
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.updateVendors(vendorsCreates, publicmethod.setReposInfo(), updateConfigurationParameters);
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
