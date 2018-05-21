package weaver.interfaces.gx.jyl.gys;

import java.rmi.RemoteException;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUpdate;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 供应商冻结主数据接口
 */
public class GYSFrozenAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private GYSPublicMethod publicmethod = new GYSPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("供应商退回操作，不执行接口.");
            return SUCCESS;
        }
        //供应商编号-值
        String gysbh_value = "";
        //供应商编号_字段
        String gysbh_column = "gysbh";
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
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
        //冻结标识-值
        String djbz_value = "";
        //冻结标识-字段
        String djbz_column = "djbs";
        
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
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(djbz_column)) {
                djbz_value = value;
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
        writeLog("冻结标识："+djbz_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("更新者："+sqr_value);
        writeLog("操作标识："+czbs_value);
        
        vendorsCreate.setLIFNR(gysbh_value);
        if("0".equals(djbz_value)){
            vendorsCreate.setSPERM(true);
        } else {
            vendorsCreate.setSPERM(false);
        }
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
        List<FFXTMode> list = PublicMethods.getFFXT(gsdm_value, "供应商");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            writeLog("分发系统代码："+ffxtdm);
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm, proxy);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethods.setFailedMessage(request, "failed", "查询分发系统代码内部码："+ffxtdm+" 失败");
                return SUCCESS;
            }
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
            if(null == distributionStatusLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查询分发状态代码：0 失败");
                return SUCCESS;
            }
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = vendorsResultSet.getVendors()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                String clientsystem = "";
                ClientSystemsLookup client = service.getCLIENT_SYSTEM();
                if(null != client) {
                    clientsystem = client.getDisplayValue();
                    if(clientsystem.equals(ffxtdm)){
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        vendorsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
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
            String description = executionStatus[0].getDescription();
            if(!"OK".equalsIgnoreCase(status)){
                PublicMethods.setFailedMessage(request, "failed", "连接MDM接口失败:"+executionStatus[0].getFault()[0].getText());
            } else {
                publicmethod.updateReturnMsg(status, description, requestid);
            }
        } else {
            PublicMethods.setFailedMessage(request, "failed", "连接MDM接口失败");
        }
        return SUCCESS;
    }
}
