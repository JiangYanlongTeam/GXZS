package weaver.interfaces.gx.jyl.kh;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersID;
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
 * 客户创建
 */
public class KHFFAction extends BaseBean implements Action {
    
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
        //申请人-值
        String applicant_value = "";
        //申请人-字段
        String applicant_column = "sqr";
        //操作标识-值
        String operation_value = "";
        //操作标识-字段
        String operation_column = "czbs";

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
        }
        JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();

        CustomersUpdate[] updates = new CustomersUpdate[1];
        CustomersUpdate update = new CustomersUpdate();
        CustomersQuery query = new CustomersQuery();
        CustomersCriteria vendorsCriteria = new CustomersCriteria();
        vendorsCriteria.setKUNNR(KHPublicMethods.setTextCriteria(khbh_value));
        query.setCriteria(vendorsCriteria);
        CustomersResultSet fres = null;
        try {
            fres = f.searchCustomers(query, KHPublicMethods.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        CustomersID fundcenterId = new CustomersID();
        fundcenterId.setInternalID(fres.getCustomers()[0].getRecordIdentification().getInternalID());
        update.setRecordIdentification(fundcenterId);
        update.setKUNNR(khbh_value);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人：" + applicant_value + "失败。不存在该人员编号。");
        }
        update.setUpdateBy(applicant_chinese_value);
        OperationLookup operatelook = KHPublicMethods.lookOperation(operation_value, f);
        operatelook.setDisplayValue(operation_value);
        update.setOperation(operatelook);//操作标识
        List<FFXTMode> list = PublicMethod.getFFXT(gsdm_value, "客户");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KHPublicMethods.getFFXTDM(ffxtdm, f);
            if (null == serviceRelationshipsTupleTuple) {
                PublicMethod.setFailedMessage(request, "failed", "获取分发系统代码内部码：" + ffxtdm + " 失败");
                return SUCCESS;
            }
            serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
            DistributionStatusLookup distributionStatusLookup = KHPublicMethods.getFFZT("0", f);
            if (null == distributionStatusLookup) {
                PublicMethod.setFailedMessage(request, "failed", "获取分发状态代码：0 失败");
                return SUCCESS;
            }
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = fres.getCustomers()[0].getServiceRelationshipsTuple();
            for (ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                String clientsystem = "";
                ClientSystemsLookup ClientSystemsLookup = service.getCLIENT_SYSTEM();
                if (null != ClientSystemsLookup) {
                    clientsystem = ClientSystemsLookup.getDisplayValue();
                    if (clientsystem.equals(ffxtdm)) {
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        update.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        updates[0] = update;
        UpdateConfigurationParameters updateConfigurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = f.updateCustomers(updates, KHPublicMethods.setReposInfo(), updateConfigurationParameters);
            if (null != executionStatus && executionStatus.length > 0) {
                String status = executionStatus[0].getStatus();
                String description = executionStatus[0].getDescription();
                for (int m = 0; m < executionStatus.length; m++) {
                    if (null != executionStatus[m].getFault() && !"OK".equals(executionStatus[m].getStatus())) {
                        PublicMethod.setFailedMessage(request, "failed", "分发失败：" + executionStatus[m].getFault()[0].getText());
                        return SUCCESS;
                    }
                }
                KHPublicMethods.updateReturnMsg(status, description, requestid);
            } else {
                PublicMethod.setFailedMessage(request, "failed", "连接MDM失败.");
                return SUCCESS;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethod.setFailedMessage(request, "failed", "连接MDM失败.");
            return SUCCESS;
        }
        return SUCCESS;
    }

    public static void main(String[] args){
        System.out.println("222");
    }
}
