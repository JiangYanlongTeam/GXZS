package weaver.interfaces.gx.jyl.jjzx;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.KeyMapping;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 基金中心修改
 */
public class JJZXModifyAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();
    
    private JJZXPublicMethod publicmethod = new JJZXPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("基金中心退回操作，不执行接口.");
            return SUCCESS;
        }
        //基金中心编码-值
        String jjzxdm_value = "";
        //基金中心编码-字段
        String jjzxdm_column = "jjzxbm";
        //基金中心名称-值
        String jjzxmc_value = "";
        //基金中心名称-字段
        String jjzxmc_column = "jjzxmc";
        //基金中心说明-值
        String jjzxsm_value = "";
        //基金中心说明-字段
        String jjzxsm_column = "jjzxsm";
        //有效期始于-值
        String datab_value = "";
        //有效期始于-字段
        String datab_column = "yxksrq";
        //有效期终于-值
        String datbis_value = "";
        //有效期终于-字段
        String datbis_column = "yxjsrq";
        //流程发起人-值
        String applicant_value = "";
        //流程发起人-字段
        String applicant_column = "sqr";
        //审批状态-值
        String spzt_value = "";
        //审批状态-字段
        String spzt_column = "spzt";
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
            if (name.equals(jjzxdm_column)) {
                jjzxdm_value = value;
            }
            if (name.equals(jjzxmc_column)) {
                jjzxmc_value = value;
            }
            if (name.equals(jjzxsm_column)) {
                jjzxsm_value = value;
            }
            if (name.equals(datab_column)) {
                datab_value = value;
            }
            if (name.equals(datbis_column)) {
                datbis_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
        }
        writeLog("基金中心代码："+jjzxdm_value);
        writeLog("基金中心名称："+jjzxmc_value);
        writeLog("基金中心说明："+jjzxsm_value);
        writeLog("有效期始于："+datab_value);
        writeLog("有效期终于："+datbis_value);
        writeLog("申请人："+applicant_value);
        writeLog("审批状态："+spzt_value);
        writeLog("操作标识："+czbs_value);
        writeLog("公司代码："+gsdm_value);
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
        fundcenterUpdate.setFIKRS("JSGX");//JSGX
        fundcenterUpdate.setFICTR(jjzxdm_value);//基金中心编码
        fundcenterUpdate.setBEZEICH(jjzxmc_value);//基金中心名称
        fundcenterUpdate.setBESCHR(jjzxsm_value);//基金中心说明
        Calendar cal = Calendar.getInstance();
        datab_value = publicmethod.toyyyyMMdd(datab_value);
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datab_value+"000000"));
            cal.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        fundcenterUpdate.setDATAB(cal);//有效期始于
        Calendar cal1 = Calendar.getInstance();
        datbis_value = publicmethod.toyyyyMMdd(datbis_value);
        try {
            cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datbis_value+"000000"));
            cal1.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        fundcenterUpdate.setDATBIS(cal1);//有效期终于
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        fundcenterUpdate.setUpdateBy(applicant_chinese_value);//申请人
        ApprovalStatusLookup statuslook = publicmethod.getAPCODCode(spzt_value, f);
        if(null == statuslook) {
            PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护审批状态值。");
            return SUCCESS;
        }
        statuslook.setDisplayValue(spzt_value);
        fundcenterUpdate.setAPCOD(statuslook);//审批状态代码
        OperationLookup operatelook = publicmethod.getOperation(czbs_value, f);
        if(null == operatelook) {
            PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护操作标识值。");
            return SUCCESS;
        }
        operatelook.setDisplayValue(czbs_value);
        fundcenterUpdate.setOperation(operatelook);//操作标识
        //获取分发系统 开始
        List<FFXTMode> ffxtList = PublicMethods.getFFXT(gsdm_value, "基金中心");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
        for(int i = 0; i < ffxtList.size(); i++) {
            String ffxtdm = ffxtList.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm,f);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethods.setFailedMessage(request, "failed", "查询分发系统代码"+ffxtdm+"失败，可能MDM没有维护值。");
                return SUCCESS;
            } else {
                serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
            }
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0",f);
            if(null == distributionStatusLookup) {
                PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护分发系统代码状态值。");
                return SUCCESS;
            } else {
                distributionStatusLookup.setDisplayValue("0");
            }
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = fres.getFundcenter()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                String clientsystem = "";
                ClientLookup client = service.getCLIENT_SYSTEM();
                if(null != client) {
                    clientsystem = client.getDisplayValue();
                    if(clientsystem.equals(ffxtdm)){
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        fundcenterUpdate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        fundcenterUpdates[0] = fundcenterUpdate;
        //获取分发系统 结束
        RepositoryInformation reposInfo = publicmethod.setReposInfo();
        UpdateConfigurationParameters configurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = f.updateFundcenter(fundcenterUpdates, reposInfo, configurationParameters);
            if(null != executionStatus && executionStatus.length > 0) {
                    String status = executionStatus[0].getStatus();
                    String returnmessage = executionStatus[0].getDescription();
                    if (!"OK".equalsIgnoreCase(status)) {
                        request.getRequestManager().setMessageid("failed");
                        request.getRequestManager().setMessagecontent("原因："+executionStatus[0].getFault()[0].getText());
                        return SUCCESS;
                    } else {
                        publicmethod.updateJJZXReturnMsg(status,returnmessage,requestid);
                    }
            } else {
                PublicMethods.setFailedMessage(request, "failed", "原因：" + executionStatus[0].getDescription());
                return SUCCESS;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("基金中心冻结，接口异常："+e.getLocalizedMessage());
            PublicMethods.setFailedMessage(request, "failed", "原因："+e.getLocalizedMessage());
            return SUCCESS;
        }
        
        return SUCCESS;
    }
    
    public static void main(String[] args) {
        JJZXPublicMethod publicmethod = new JJZXPublicMethod();
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        FundcenterUpdate[] fundcenterUpdates = new FundcenterUpdate[1];
        FundcenterUpdate fundcenterUpdate = new FundcenterUpdate();
        fundcenterUpdate.setFIKRS("JSGX");//JSGX
        fundcenterUpdate.setFICTR("10009");//基金中心编码
        fundcenterUpdate.setBEZEICH("qqqqqqqsssssssss");//基金中心名称
        fundcenterUpdate.setBESCHR("qqqqqqqsssssssss");//基金中心说明
//        Calendar cal = Calendar.getInstance();
//        String datab_value = publicmethod.toyyyyMMdd("2016-09-19");
//        try {
//            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datab_value+"000000"));
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        fundcenterUpdate.setDATAB(cal);//有效期始于
//        String datbis_value = publicmethod.toyyyyMMdd("2016-09-19");
//        try {
//            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datbis_value+"000000"));
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        fundcenterUpdate.setDATBIS(cal);//有效期终于
//        fundcenterUpdate.setUpdateBy("14164");//申请人
//        ApprovalStatusLookup statuslook = publicmethod.getAPCODCode("0", f);
//        statuslook.setDisplayValue("0");
//        fundcenterUpdate.setAPCOD(statuslook);//审批状态代码
//        OperationLookup operatelook = publicmethod.getOperation("12", f);
//        operatelook.setDisplayValue("12");
//        fundcenterUpdate.setOperation(operatelook);//操作标识
//        //获取分发系统 开始
//        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[3];
//        
//        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM("ECC_NY",f);
//        serviceRelationshipsTupleTuple.setDisplayValue("ECC_NY");
//        DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0",f);
//        distributionStatusLookup.setDisplayValue("0");
//        serviceRelationshipsTupleTuple.setDistrbution(distributionStatusLookup);
//        serviceRelationshipsTupleTuples[0] = serviceRelationshipsTupleTuple;
//        
//        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple1 = publicmethod.getFFXTDM("MIS",f);
//        serviceRelationshipsTupleTuple1.setDisplayValue("MIS");
//        serviceRelationshipsTupleTuple1.setDistrbution(distributionStatusLookup);
//        serviceRelationshipsTupleTuples[1] = serviceRelationshipsTupleTuple1;
//        
//        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple2 = publicmethod.getFFXTDM("JIUQI",f);
//        serviceRelationshipsTupleTuple2.setDisplayValue("JIUQI");
//        serviceRelationshipsTupleTuple2.setDistrbution(distributionStatusLookup);
//        serviceRelationshipsTupleTuples[2] = serviceRelationshipsTupleTuple2;
//        
//        fundcenterUpdate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        
        KeyMapping[] KeyMappings = new KeyMapping[1];
        fundcenterUpdate.setKeyMapping(KeyMappings);
        
        KeyMapping key = new KeyMapping ();
        key.setRemoteKey("10009");
        key.setRemoteSystem("OA");
        fundcenterUpdate.setKeyMapping(0, key);
        
        FundcenterID fundcenterID = new FundcenterID();
        fundcenterID.setKeyMapping(key);
        fundcenterUpdate.setRecordIdentification(fundcenterID);
        
        fundcenterUpdates[0] = fundcenterUpdate;
        //获取分发系统 结束
        RepositoryInformation reposInfo = publicmethod.setReposInfo();
        UpdateConfigurationParameters configurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = f.updateFundcenter(fundcenterUpdates, reposInfo, configurationParameters);
            for(ExecutionStatus execute : executionStatus) {
                String status = execute.getStatus();
                if (!"OK".equalsIgnoreCase(status)) {
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
