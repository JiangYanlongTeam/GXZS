package weaver.interfaces.gx.jyl.jjzx;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate;
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
import beans.ws.mdm.sap.com.CreateConfigurationParameters;
import beans.ws.mdm.sap.com.ExecutionStatus;

/**
 * 基金中心创建主数据接口
 */
public class JJZXCreateAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private JJZXPublicMethod publicmethod = new JJZXPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("基金中心退回操作，不执行接口.");
            return SUCCESS;
        }
        //申请单号-值
        String sqdh_value = "";
        //申请单号-字段
        String sqdh_column = "sqdh";
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
        //申请日期-值
        String applydate_value = "";
        //申请日期-字段
        String applydate_column = "sqrq";
        //申请时间-值
        String applytime_value = "";
        //申请时间-字段
        String applytime_column = "sqsj";
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
        //公司代码-值
        String gsdm1_value = "";
        //公司代码-字段
        String gsdm1_column = "gsdm1";
        //财务管理范围公司代码-值
        String cwglfw_value = "";
        //财务管理范围-字段
        String cwglfw_column = "cwglfw";
        
        
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
            if (name.equals(gsdm1_column)) {
                gsdm1_value = value;
            }
            if (name.equals(cwglfw_column)) {
                cwglfw_value = value;
            }
        }
        writeLog("基金中心代码："+jjzxdm_value);
        writeLog("基金中心名称："+jjzxmc_value);
        writeLog("基金中心说明："+jjzxsm_value);
        writeLog("有效期始于："+datab_value);
        writeLog("有效期终于："+datbis_value);
        writeLog("申请人："+applicant_value);
        writeLog("申请日期："+applydate_value);
        writeLog("申请时间："+applytime_value);
        writeLog("审批状态："+spzt_value);
        writeLog("操作标识："+czbs_value);
        writeLog("申请编号："+sqdh_value);
        writeLog("财务管理范围："+cwglfw_value);
        writeLog("公司代码："+gsdm1_value);
        writeLog("人事范围："+gsdm_value);
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        FundcenterCreate[] creates = new FundcenterCreate[1];
        FundcenterCreate create = new FundcenterCreate();
        //OA创建申请号
        create.setApplyNumber(sqdh_value);
        //JSGX
        create.setFIKRS(cwglfw_value);
        //基金中心编码
        create.setFICTR(jjzxdm_value);
        //基金中心名称
        create.setBEZEICH(jjzxmc_value);
        //基金中心说明
        create.setBESCHR(jjzxsm_value);
        //公司代码
        CompanyCodeLookup companyCodeLookup = publicmethod.lookCompanyCode(gsdm1_value, f);
        if(null == companyCodeLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询公司代码："+gsdm1_value+ " 失败.");
            return SUCCESS;
        }
        create.setBUKRS(companyCodeLookup);
        Calendar cal = Calendar.getInstance();
        //有效期始于 开始
        datab_value = publicmethod.toyyyyMMdd(datab_value);
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datab_value+"000000"));
            cal.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setDATAB(cal);
        //有效期始于 结束
        //有效期终于 开始
        Calendar cal1 = Calendar.getInstance();
        datbis_value = publicmethod.toyyyyMMdd(datbis_value);
        try {
            cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datbis_value + "000000"));
            cal1.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setDATBIS(cal1);
        //有效期终于 结束
        //冻结标识
        create.setLVOMA(false);
        //申请人
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        create.setApplicant(applicant_chinese_value);
        //申请日期 开始
        Calendar cal3 = Calendar.getInstance();
        applydate_value = publicmethod.toyyyyMMdd(applydate_value);
        try {
            cal3.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applydate_value + "000000"));
            cal3.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setApplyData(cal3);
        //申请日期 结束
        //申请时间 开始
        Calendar cal4 = Calendar.getInstance();
        applytime_value = publicmethod.toyyyyMMdd(applydate_value,applytime_value+":00");
        try {
            cal4.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applytime_value));
            cal4.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setApplyTime(cal4);
        //申请时间 结束
        //审批状态代码 开始
        ApprovalStatusLookup statuslook = publicmethod.getAPCODCode(spzt_value, f);
        if(null == statuslook) {
            PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护审批状态值。");
            return SUCCESS;
        }
        create.setAPCOD(statuslook);
        //审批状态代码 结束
        //操作标识 开始
        OperationLookup operatelook = publicmethod.getOperation(czbs_value, f);
        if(null == operatelook) {
            PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护操作标识值。");
            return SUCCESS;
        }
        operatelook.setDisplayValue(czbs_value);
        create.setOperation(operatelook);
        //操作标识 开始
        //获取分发系统 开始
        List<FFXTMode> ffxtList = PublicMethods.getFFXT(gsdm_value, "基金中心");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
        for(int i = 0; i < ffxtList.size(); i++) {
            String ffxtdm = ffxtList.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm,f);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护分发系统代码值。");
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
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        create.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        //获取分发系统 结束
        creates[0] = create;
        try {
            CreateConfigurationParameters parameters = new CreateConfigurationParameters();
            RepositoryInformation info = publicmethod.setReposInfo();
            ExecutionStatus[] res = f.createFundcenter(creates, info, parameters);
            for (ExecutionStatus execute : res) {
                String status = execute.getStatus();
                String returnmessage = execute.getDescription();
                if (!"OK".equalsIgnoreCase(status)) {
                    PublicMethods.setFailedMessage(request, "failed", execute.getFault()[0].getText());
                } else {
                    publicmethod.updateJJZXReturnMsg(status,returnmessage,requestid);
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("调用SAP异常信息："+e.getMessage());
            PublicMethods.setFailedMessage(request, "failed", "调用MDM接口失败，原因："+ e.getLocalizedMessage());
        }
        return SUCCESS;
    }
    
    public static void main(String[] args) {
        JJZXPublicMethod publicmethod = new JJZXPublicMethod();
//        System.setProperty("user.timezone","Asia/Shanghai"); 
//        Calendar cal = Calendar.getInstance();
//        String datab_value = "2016-09-01";
//        //有效期始于 开始
//        datab_value = publicmethod.toyyyyMMdd(datab_value);
//        try {
//            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datab_value+"000000"));
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        System.out.println("datab_value :" + new SimpleDateFormat("yyyyMMddHHmmss").format(cal.getTime()));
//        //有效期始于 结束
//        String datbis_value = "2016-10-20";
//        //有效期终于 开始
//        datbis_value = publicmethod.toyyyyMMdd(datbis_value);
//        try {
//            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(datbis_value + "000000"));
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        System.out.println("datbis_value :" + new SimpleDateFormat("yyyyMMddHHmmss").format(cal.getTime()));
//        //有效期终于 结束
//        //冻结标识
//        String applydate_value = "2016-09-01";
//        //申请日期 开始
//        applydate_value = publicmethod.toyyyyMMdd(applydate_value);
//        try {
//            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applydate_value + "000000"));
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        System.out.println("applydate_value :" + new SimpleDateFormat("yyyyMMddHHmmss").format(cal.getTime()));
//        //申请日期 结束
//        //申请时间 开始
//        String applytime_value = "23:30";
//        applytime_value = publicmethod.toyyyyMMdd(applydate_value,applytime_value+":00");
//        try {
//            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applytime_value));
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        System.out.println("applytime_value :" + new SimpleDateFormat("yyyyMMddHHmmss").format(cal.getTime()));
         
//        Calendar calendar = Calendar.getInstance();        
//        System.out.println("目前时间：" + calendar.getTime());  
//        System.out.println("Calendar时区：：" + calendar.getTimeZone().getID());  
//        System.out.println("user.timezone：" + System.getProperty("user.timezone"));  
//        System.out.println("user.country：" + System.getProperty("user.country"));  
//        System.out.println("默认时区：" + TimeZone.getDefault().getID()); 
        
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        FundcenterCreate[] creates = new FundcenterCreate[1];
        FundcenterCreate create = new FundcenterCreate();
        //OA创建申请号
        create.setApplyNumber("QWERT12196");
        //JSGX
        create.setFIKRS("JSGX");
        //基金中心编码
        create.setFICTR("F205096000");
        //基金中心名称
        create.setBEZEICH("ceshi1");
        //基金中心说明
        create.setBESCHR("ceshi1");
        //公司代码
        CompanyCodeLookup companyCodeLookup = publicmethod.lookCompanyCode("2050", f);
        create.setBUKRS(companyCodeLookup);
        Calendar cal = Calendar.getInstance();
        //有效期始于 开始
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(publicmethod.toyyyyMMdd("2016-10-01")+"000000"));
            cal.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setDATAB(cal);
        //有效期始于 结束
        Calendar cal1 = Calendar.getInstance();
        //有效期终于 开始
        try {
            cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(publicmethod.toyyyyMMdd("2016-10-31") + "000000"));
            cal1.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setDATBIS(cal1);
        Calendar cal2 = Calendar.getInstance();
        //publicmethod.toyyyyMMdd("20161211","08:00"+":00"))
        try {
            cal2.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse("20161220000000"));
            cal2.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setApplyTime(cal2);
        Calendar cal3 = Calendar.getInstance();
        //publicmethod.toyyyyMMdd("20161211","08:00"+":00"))
        try {
            cal3.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse("20161220000000"));
            cal3.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        create.setApplyData(cal3);
        //有效期终于 结束
        //有效期终于 结束
        //冻结标识
        create.setLVOMA(false);
        //申请人
        create.setApplicant("自动转换");
        ApprovalStatusLookup statuslook = publicmethod.getAPCODCode("0", f);
        create.setAPCOD(statuslook);
        OperationLookup operatelook = publicmethod.getOperation("11", f);
        create.setOperation(operatelook);
        creates[0] = create;
        try {
            CreateConfigurationParameters parameters = new CreateConfigurationParameters();
            RepositoryInformation info = publicmethod.setReposInfo();
            ExecutionStatus[] res = f.createFundcenter(creates, info, parameters);
            for (ExecutionStatus execute : res) {
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
