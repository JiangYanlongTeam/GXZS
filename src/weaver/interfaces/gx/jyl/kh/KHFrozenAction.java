package weaver.interfaces.gx.jyl.kh;

import java.rmi.RemoteException;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
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
 * 客户冻结
 */
public class KHFrozenAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethod = new PublicMethod();
    
    private KHPublicMethod KHPublicMethods = new KHPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("客户退回操作，不执行接口.");
            return SUCCESS;
        }
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //客户编号-值
        String khbh_value = "";
        //客户编号-字段
        String khbh_column = "khbh";
        //操作标识-值
        String operation_value = "";
        //操作标识-字段
        String operation_column = "czbs";
        //申请人-值
        String applicant_value = "";
        //申请人-字段
        String applicant_column = "sqr";
        //冻结标识-值
        String djbz_value = "";
        //申请人-字段
        String djbz_column = "djbz";
        
        
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(khbh_column)) {
                khbh_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
            if (name.equals(operation_column)) {
                operation_value = value;
            }
            if (name.equals(djbz_column)) {
                djbz_value = value;
            }
        }
        
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        writeLog("公司代码：" + gsdm_value);
        writeLog("客户编码："+khbh_value);
        writeLog("审批状态：0");
        writeLog("申请人：" + applicant_value);
        writeLog("操作标识：" + operation_value);
        writeLog("冻结标识：" + djbz_value);
        
        CustomersUpdate[] customersUpdates = new CustomersUpdate[1];
        CustomersUpdate customersUpdate = new CustomersUpdate();
        CustomersQuery customersQuery = new CustomersQuery();
        CustomersCriteria customersCriteria = new CustomersCriteria();
        customersCriteria.setKUNNR(KHPublicMethods.setTextCriteria(khbh_value));
        customersQuery.setCriteria(customersCriteria);
        CustomersResultSet customersRes = null;
        try {
            customersRes = proxy.searchCustomers(customersQuery, KHPublicMethods.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
            PublicMethod.setFailedMessage(request, "failed", "查找"+khbh_value+"失败.");
            return SUCCESS;
        }
        if(null != customersRes && customersRes.getCustomers().length > 0) {
            customersUpdate.setRecordIdentification(customersRes.getCustomers()[0].getRecordIdentification());
        }
        
        customersUpdate.setKUNNR(khbh_value);
        ApprovalStatusLookup approvalStatusLookup = KHPublicMethods.getAPCODCode("0", proxy);
        if(null == approvalStatusLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找审批状态：0 失败");
            return SUCCESS;
        }
        approvalStatusLookup.setDisplayValue("0");
        customersUpdate.setAPCOD(approvalStatusLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        customersUpdate.setApplicant(applicant_chinese_value);
        if("0".equals(djbz_value)){
            customersUpdate.setSPERM(true);
        } else {
            customersUpdate.setSPERM(false);
        }
        List<FFXTMode> list = PublicMethod.getFFXT(gsdm_value, "客户");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KHPublicMethods.getFFXTDM(ffxtdm, proxy);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethod.setFailedMessage(request, "failed", "查询分发系统代码内部码："+ffxtdm+" 失败");
                return SUCCESS;
            }
            DistributionStatusLookup distributionStatusLookup = KHPublicMethods.getFFZT("0", proxy);
            if(null == distributionStatusLookup) {
                PublicMethod.setFailedMessage(request, "failed", "查询分发状态代码：0 失败");
                return SUCCESS;
            }
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = customersRes.getCustomers()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                String clientsystem = "";
                ClientSystemsLookup ClientSystemsLookup = service.getCLIENT_SYSTEM();
                if(null != ClientSystemsLookup) {
                    clientsystem = ClientSystemsLookup.getDisplayValue();
                    if(clientsystem.equals(ffxtdm)) {
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        customersUpdate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup operationLookup = KHPublicMethods.lookOperation(operation_value, proxy);
        if(null == operationLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查询操作标识："+operation_value+" 失败");
            return SUCCESS;
        }
        customersUpdate.setOperation(operationLookup);
        customersUpdates[0] = customersUpdate;
        UpdateConfigurationParameters updateConfigurationParameters = new UpdateConfigurationParameters();
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.updateCustomers(customersUpdates, KHPublicMethods.setReposInfo(), updateConfigurationParameters);
            if(null != executionStatus && executionStatus.length > 0) {
               String status = executionStatus[0].getStatus();
               String description = executionStatus[0].getDescription();
               if(!"OK".equalsIgnoreCase(status)){
                   PublicMethod.setFailedMessage(request, "failed", "连接MDM接口失败:"+executionStatus[0].getFault()[0].getText());
               } else {
                   KHPublicMethods.updateReturnMsg(status, description, requestid);
               }
            } else {
                PublicMethod.setFailedMessage(request, "failed", "连接MDM接口失败");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("连接MDM失败："+e.getLocalizedMessage());
        }
        return SUCCESS;
    }
    
    public static void main(String[] args) {
//        PublicMethod PublicMethod = new PublicMethod();
//        KHPublicMethod KHPublicMethods = new KHPublicMethod();
//        
//        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
//        
//        CustomersUpdate[] customersUpdates = new CustomersUpdate[1];
//        CustomersUpdate customersUpdate = new CustomersUpdate();
//        CustomersQuery customersQuery = new CustomersQuery();
//        CustomersCriteria customersCriteria = new CustomersCriteria();
//        customersCriteria.setKUNNR(KHPublicMethods.setTextCriteria("200000011"));
//        customersQuery.setCriteria(customersCriteria);
//        CustomersResultSet customersRes = null;
//        try {
//            customersRes = proxy.searchCustomers(customersQuery, KHPublicMethods.setReposInfo());
//        } catch (RemoteException e1) {
//            e1.printStackTrace();
//        }
//        if(null != customersRes && customersRes.getCustomers().length > 0) {
//            customersUpdate.setRecordIdentification(customersRes.getCustomers()[0].getRecordIdentification());
//        }
//        
//        customersUpdate.setKUNNR("200000011");
//        ApprovalStatusLookup approvalStatusLookup = KHPublicMethods.getAPCODCode("0", proxy);
//        approvalStatusLookup.setDisplayValue("0");
//        customersUpdate.setAPCOD(approvalStatusLookup);
//        customersUpdate.setApplicant("自动转换");
//        customersUpdate.setSPERM(true);
//        List<FFXTMode> list = new ArrayList<FFXTMode>();
//        FFXTMode f1 = new FFXTMode();
//        f1.setFfxtdm("ECC_NY");
//        list.add(f1);
//        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
//        for(int i = 0; i < list.size(); i++) {
//            String ffxtdm = list.get(i).getFfxtdm();
//            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KHPublicMethods.getFFXTDM(ffxtdm, proxy);
//            DistributionStatusLookup distributionStatusLookup = KHPublicMethods.getFFZT("0", proxy);
//            distributionStatusLookup.setDisplayValue("0");
//            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
//            
//            Customers[] Customers = customersRes.getCustomers();
//            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = Customers[0].getServiceRelationshipsTuple();
//            for(ServiceRelationshipsTupleTuple tup : ServiceRelationshipsTupleTuples) {
//                String clientsystem = "";
//                ClientSystemsLookup client = tup.getCLIENT_SYSTEM();
//                if(null != client) {
//                    clientsystem = client.getDisplayValue();
//                    if(ffxtdm.equals(clientsystem)) {
//                        serviceRelationshipsTupleTuple.setTupleValueId(tup.getTupleValueId());
//                    }
//                }
//            }
//            
//            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
//        }
//        customersUpdate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
//        OperationLookup operationLookup = KHPublicMethods.lookOperation("13 ", proxy);
//        customersUpdates[0] = customersUpdate;
//        UpdateConfigurationParameters updateConfigurationParameters = new UpdateConfigurationParameters();
//        ExecutionStatus[] executionStatus = null;
//        try {
//            executionStatus = proxy.updateCustomers(customersUpdates, KHPublicMethods.setReposInfo(), updateConfigurationParameters);
//            if(null != executionStatus && executionStatus.length > 0) {
//               String status = executionStatus[0].getStatus();
//               String description = executionStatus[0].getDescription();
//               if(!"OK".equalsIgnoreCase(status)){
//               } else {
//               }
//            } else {
//            }
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
    }
}
