package weaver.interfaces.gx.jyl.yhzh;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.kjkm.KJKMPublicMethod;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.ws.mdm.sap.com.CreateConfigurationParameters;
import beans.ws.mdm.sap.com.ExecutionStatus;

/**
 * 会计科目创建
 */
public class YHKJKMCreateAction extends BaseBean implements Action {

    private KJKMPublicMethod KJKMPublicMethods = new KJKMPublicMethod();
    private PublicMethod PublicMethods = new PublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("会计科目退回操作，不执行接口.");
            return SUCCESS;
        }
        //申请单号-值
        String sqdh_value = "";
        //申请单号-字段
        String sqdh_column = "sqdh";
        //总账科目编码-值
        String zzkmdm_value = "";
        //总账科目编码-字段
        String zzkmdm_column = "zzkm";
        //科目组编码-值
        String kmzdm_value = "";
        //科目组编码-字段
        String kmzdm_column = "kmz";
        //科目类型编码-值
        String kmlxdm_value = "";
        //科目类型编码-字段
        String kmlxdm_column = "kmlx";
        //会计科目名称-值
        String kjkmmc_value = "";
        //会计科目名称-字段
        String kjkmmc_column = "kjkmmc";
        //会计科目描述-值
        String kjkmsm_value = "";
        //会计科目描述-字段
        String kjkmsm_column = "kjkmms";
        //审批状态-值
        String spzt_value = "";
        //审批状态-字段
        String spzt_column = "spzt";
        //流程发起人-值
        String applicant_value = "";
        //流程发起人-字段
        String applicant_column = "sqr";
        //申请日期-值
        String applydate_value = "";
        //申请日期-字段
        String applydate_column = "sqrq";
        //申请时间-值
        String applytime_value = "";
        //申请时间-字段
        String applytime_column = "sqsj";
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
            if (name.equals(zzkmdm_column)) {
                zzkmdm_value = value;
            }
            if (name.equals(kmzdm_column)) {
                kmzdm_value = value;
            }
            if (name.equals(kmlxdm_column)) {
                kmlxdm_value = value;
            }
            if (name.equals(kjkmmc_column)) {
                kjkmmc_value = value;
            }
            if (name.equals(kjkmsm_column)) {
                kjkmsm_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
            if (name.equals(applydate_column)) {
                applydate_value = value;
            }
            if (name.equals(applytime_column)) {
                applytime_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(sqdh_column)) {
                sqdh_value = value;
            }
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
        }
        writeLog("会计科目描述：" + kjkmsm_value);
        writeLog("会计科目名称：" + kjkmmc_value);
        writeLog("科目类型：" + kmlxdm_value);
        writeLog("科目组：" + kmzdm_value);
        writeLog("总帐科目：" + zzkmdm_value);
        writeLog("申请人：" + applicant_value);
        writeLog("申请日期：" + applydate_value);
        writeLog("申请时间：" + applytime_value);
        writeLog("审批状态：" + spzt_value);
        writeLog("操作标识：" + czbs_value);
        writeLog("申请编号：" + sqdh_value);
        writeLog("公司代码：" + gsdm_value);

        JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();

        AccountsCreate[] accountsCreates = new AccountsCreate[1];
        AccountsCreate accountsCreate = new AccountsCreate();

        accountsCreate.setApplyNumber(sqdh_value);
        accountsCreate.setSAKNR(zzkmdm_value);
        AccountGroupLookup accountGroupLookup = KJKMPublicMethods.lookAccountGroup(kmzdm_value, proxy);
        if(null == accountGroupLookup) {
            request.getRequestManager().setMessageid("failed");
            request.getRequestManager().setMessagecontent("查询科目组"+kmzdm_value+"失败，可能OA中维护的科目组和MDM维护信息不一致。");
            return SUCCESS;
        } else {
            accountGroupLookup.setDisplayValue(kmzdm_value);
            accountsCreate.setKTOKS(accountGroupLookup);
        }
        AccountTypeLookup accountType = KJKMPublicMethods.lookAccountTypeLookup(kmlxdm_value, proxy);
        if(null == accountType) {
            request.getRequestManager().setMessageid("failed");
            request.getRequestManager().setMessagecontent("查询科目类型"+kmlxdm_value+"失败，可能OA中维护的科目类型和MDM维护信息不一致。");
            return SUCCESS;
        } else {
            accountType.setDisplayValue(kmlxdm_value);
            accountsCreate.setAccountType(accountType);
        }
        accountsCreate.setTXT20_ML(kjkmmc_value);
        accountsCreate.setTXT50_ML(kjkmsm_value);
        accountsCreate.setXSPEB(false);
        ApprovalStatusLookup approvalStatusLookup = KJKMPublicMethods.getAPCODCode(spzt_value, proxy);
        if(null == approvalStatusLookup) {
            request.getRequestManager().setMessageid("failed");
            request.getRequestManager().setMessagecontent("查询科目类型"+spzt_value+"失败，可能OA中维护的科目类型和MDM维护信息不一致。");
            return SUCCESS;
        } else {
            approvalStatusLookup.setDisplayValue(spzt_value);
            accountsCreate.setAPCOD(approvalStatusLookup);
        }
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        accountsCreate.setApplicant(applicant_chinese_value);
        Calendar cal = Calendar.getInstance();
        String applydate_values = KJKMPublicMethods.dealDateTime(applydate_value) ;
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applydate_values+ "000000"));
            cal.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        accountsCreate.setApplyDate(cal);
        Calendar cal1 = Calendar.getInstance();
        String applytime_values = KJKMPublicMethods.dealDateTime2(applydate_value, applytime_value+":00");
        try {
            cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applytime_values));
            cal1.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        accountsCreate.setApplyTime(cal1);
        OperationLookup operationLookup = KJKMPublicMethods.getOperation(czbs_value, proxy);
        if(null == operationLookup) {
            request.getRequestManager().setMessageid("failed");
            request.getRequestManager().setMessagecontent("查询操作标识"+czbs_value+"失败，可能OA中维护的科目类型和MDM维护信息不一致。");
            return SUCCESS;
        } else {
            accountsCreate.setOperation(operationLookup);
        }
        //根据关系查找系统代码 
        List<FFXTMode> ffxtList = PublicMethods.getFFXT(gsdm_value,"科目");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
        for(int i = 0; i < ffxtList.size(); i++) {
            String ffxtdm = ffxtList.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KJKMPublicMethods.getFFXTDM(ffxtdm,proxy);
            if(null == serviceRelationshipsTupleTuple) {
                request.getRequestManager().setMessageid("failed");
                request.getRequestManager().setMessagecontent("查询分发系统代码"+ffxtdm+"失败，可能OA中维护的科目类型和MDM维护信息不一致。");
                return SUCCESS;
            } else {
                serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
            }
            DistributionStatusLookup distributionStatusLookup = KJKMPublicMethods.getFFZT("0",proxy);
            if(null == distributionStatusLookup) {
                request.getRequestManager().setMessageid("failed");
                request.getRequestManager().setMessagecontent("查询分发系统代码状态0失败，可能OA中维护的科目类型和MDM维护信息不一致。");
                return SUCCESS;
            } else {
                distributionStatusLookup.setDisplayValue("0");
            }
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        accountsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        accountsCreates[0] = accountsCreate;
        CreateConfigurationParameters createConfigurationParameters = new CreateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = proxy.createAccounts(accountsCreates, KJKMPublicMethods.setReposInfo(), createConfigurationParameters);
            if(null != executionStatus && executionStatus.length > 0) {
                String status = executionStatus[0].getStatus();
                String messag = executionStatus[0].getDescription();
                if (!"OK".equalsIgnoreCase(status)) {
                    request.getRequestManager().setMessageid("failed");
                    request.getRequestManager().setMessagecontent(executionStatus[0].getFault()[0].getText());
                    return SUCCESS;
                } else {
                    KJKMPublicMethods.updateKJKMReturnMsgForYHZH(status, messag, requestid);
                }
            } else {
                request.getRequestManager().setMessageid("failed");
                request.getRequestManager().setMessagecontent("调用MDM接口失败，连接异常.");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("调用SAP异常信息：" + e.getMessage());
            request.getRequestManager().setMessageid("failed");
            request.getRequestManager().setMessagecontent("调用MDM接口失败，异常信息："+e.getLocalizedMessage());
            return SUCCESS;
        }
        return SUCCESS;
    }
    
    public static void main(String[] args) {
        KJKMPublicMethod KJKMPublicMethods = new KJKMPublicMethod();
        JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();

        AccountsCreate[] accountsCreates = new AccountsCreate[1];
        AccountsCreate accountsCreate = new AccountsCreate();

        accountsCreate.setApplyNumber("20160920");
        accountsCreate.setSAKNR("asdasd1234");
        AccountGroupLookup accountGroupLookup = KJKMPublicMethods.lookAccountGroup("ZCL1", proxy);
        accountGroupLookup.setDisplayValue("ZCL1");
        accountsCreate.setKTOKS(accountGroupLookup);
        AccountTypeLookup accountType = KJKMPublicMethods.lookAccountTypeLookup("0", proxy);
        accountType.setDisplayValue("0");
        accountsCreate.setAccountType(accountType);
        accountsCreate.setTXT20_ML("ceshi3");
        accountsCreate.setTXT50_ML("ceshi3");
        accountsCreate.setXSPEB(false);
        ApprovalStatusLookup approvalStatusLookup = KJKMPublicMethods.getAPCODCode("0", proxy);
        approvalStatusLookup.setDisplayValue("0");
        accountsCreate.setAPCOD(approvalStatusLookup);
        accountsCreate.setApplicant("14164");
        Calendar cal = Calendar.getInstance();
        String applydate_values = KJKMPublicMethods.dealDateTime("2016-09-13") + "000000";
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applydate_values));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        accountsCreate.setApplyDate(cal);
        String applytime_values = KJKMPublicMethods.dealDateTime2("2016-09-13", "10:20:00");
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applytime_values));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        accountsCreate.setApplyTime(cal);
        OperationLookup operationLookup = KJKMPublicMethods.getOperation("11", proxy);
        accountsCreate.setOperation(operationLookup);
        //根据关系查找系统代码 
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[1];
        String ffxtdm = "JIUQI";
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KJKMPublicMethods.getFFXTDM(ffxtdm,proxy);
        serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
        DistributionStatusLookup distributionStatusLookup = KJKMPublicMethods.getFFZT("0",proxy);
        distributionStatusLookup.setDisplayValue("0");
        serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
        serviceRelationshipsTupleTuples[0] = serviceRelationshipsTupleTuple;
        
//        List<FFXTMode> ffxtList = PublicMethods.getKJKMFFXT("4000","科目");
//        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
//        for(int i = 0; i < ffxtList.size(); i++) {
//            String ffxtdm = ffxtList.get(i).getFfxtdm();
//            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KJKMPublicMethods.getFFXTDM(ffxtdm,proxy);
//            serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
//            DistributionStatusLookup distributionStatusLookup = KJKMPublicMethods.getFFZT(ffxtdm,proxy);
//            distributionStatusLookup.setDisplayValue(ffxtdm);
//            serviceRelationshipsTupleTuple.setDistrbution(distributionStatusLookup);
//            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
//        }
        accountsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        accountsCreates[0] = accountsCreate;
        CreateConfigurationParameters createConfigurationParameters = new CreateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = proxy.createAccounts(accountsCreates, KJKMPublicMethods.setReposInfo(), createConfigurationParameters);
            for (ExecutionStatus execute : executionStatus) {
                String status = execute.getStatus();
                if (!"OK".equalsIgnoreCase(status)) {
                    //request.getRequestManager().setMessageid("流程提交失败");
                    //request.getRequestManager().setMessagecontent(execute.getFault()[0].getText());
                } else {
                    //KJKMPublicMethods.updateKJKMReturnMsg(status, messag, requestid);
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            //writeLog("调用SAP异常信息：" + e.getMessage());
        }
    }
}
