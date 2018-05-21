package weaver.interfaces.gx.jyl.wl;

import java.rmi.RemoteException;
import java.util.List;

import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.Materials;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsID;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUpdate;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALViProxy;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 物料冻结、解冻
 */
public class WZLBFrozenAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethod = new PublicMethod();
    private WLPublicMethod publicmethod = new WLPublicMethod();
    
    public String execute(RequestInfo request) {
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("物料退回操作，不执行接口.");
            return SUCCESS;
        }
        //物料编号-值
        String wlbh_value = "";
        //物料编号-字段
        String wlbh_column = "wzbm";
        //冻结标识-值
        String djbs_value = "";
        //冻结标识-字段
        String djbs_column = "djbs";
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
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(wlbh_column)) {
                wlbh_value = value;
            }
            if (name.equals(djbs_column)) {
                djbs_value = value;
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
        }
        writeLog("物料编码:"+wlbh_value);
        writeLog("审批状态代码:"+spzt_value);
        writeLog("申请人:"+sqr_value);
        writeLog("操作标识:"+czbs_value);
        writeLog("公司代码:"+gsdm_value);
        writeLog("冻结标识:"+djbs_value);
        writeLog("人事范围:"+gsdm_value);
        
        JSGX_MDM_MATERIALViProxy proxy = new JSGX_MDM_MATERIALViProxy();
        UpdateConfigurationParameters CreateConfigurationParameters = new UpdateConfigurationParameters();
        MaterialsUpdate[] MaterialsCreates = new MaterialsUpdate[1];
        MaterialsUpdate MaterialsCreate = new MaterialsUpdate();
        MaterialsQuery MaterialsQuery = new MaterialsQuery();
        MaterialsCriteria MaterialsCriteria = new MaterialsCriteria();
        MaterialsCriteria.setMATNR(publicmethod.setTextCriteria(wlbh_value));
        MaterialsQuery.setCriteria(MaterialsCriteria);
        MaterialsResultSet MaterialsResultSet = null;
        try {
            MaterialsResultSet = proxy.searchMaterials(MaterialsQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        if(null != MaterialsResultSet) {
            Materials[] Materials = MaterialsResultSet.getMaterials();
            if(null != Materials && Materials.length > 0) {
                MaterialsID MaterialsID = new MaterialsID();
                MaterialsID.setInternalID(Materials[0].getRecordIdentification().getInternalID());
                MaterialsCreate.setRecordIdentification(MaterialsID);
            }
        }
        MaterialsCreate.setMATNR(wlbh_value);
        if("0".equals(djbs_value)) {
            MaterialsCreate.setLVOMA(true);
        }
        if("1".equals(djbs_value)) {
            MaterialsCreate.setLVOMA(false);
        }
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        MaterialsCreate.setUpdateBy(applicant_chinese_value);
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == ApprovalStatusLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找审批状态代码："+spzt_value + " 失败");
            return SUCCESS;
        } else {
            ApprovalStatusLookup.setDisplayValue("0");
            MaterialsCreate.setAPCOD(ApprovalStatusLookup);
        }

        List<FFXTMode> list = PublicMethod.getFFXT(gsdm_value, "物料");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm, proxy);
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = MaterialsResultSet.getMaterials()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                ClientLookup ClientLookup = service.getCLIENT_SYSTEM();
                String clientsystem = "";
                if(null != ClientLookup) {
                    clientsystem = ClientLookup.getDisplayValue();
                    if(clientsystem.equals(ffxtdm)) {
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        MaterialsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup OperationLookup = publicmethod.lookOperation(czbs_value, proxy);
        MaterialsCreate.setOperation(OperationLookup);
        MaterialsCreates[0] = MaterialsCreate;
        ExecutionStatus[] ExecutionStatus = null;
        try {
            ExecutionStatus = proxy.updateMaterials(MaterialsCreates, publicmethod.setReposInfo(), CreateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethod.setFailedMessage(request, "failed", "冻结或者解冻MDM失败");
        }
        if(null != ExecutionStatus && ExecutionStatus.length > 0) {
            String status = ExecutionStatus[0].getStatus();
            String message = ExecutionStatus[0].getDescription();
            if(!"OK".equalsIgnoreCase(status)) {
                PublicMethod.setFailedMessage(request, "failed", ExecutionStatus[0].getFault()[0].getText());
            } else {
                publicmethod.updateReturnMsg(status, message, request.getRequestid());
            }
        }
        return SUCCESS;
    }
}
