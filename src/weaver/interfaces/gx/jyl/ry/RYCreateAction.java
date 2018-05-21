package weaver.interfaces.gx.jyl.ry;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeLookup;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;
import JSGX_MDM_HRWsd.JSGX_MDM_HRViProxy;
import beans.ws.mdm.sap.com.CreateConfigurationParameters;
import beans.ws.mdm.sap.com.ExecutionStatus;

/**
 * 银行创建
 */
public class RYCreateAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private RYPublicMethod publicmethod = new RYPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("人员退回操作，不执行接口.");
            return SUCCESS;
        }
        //申请单号-值
        String sqdh_value = "";
        //申请单号-字段
        String sqdh_column = "sqdh";
        //人员事件-值
        String rysj_value = "";
        //人员事件-字段
        String rysj_column = "rssjdm";
        //操作原因-值
        String czyy_value = "";
        //操作原因-字段
        String czyy_column = "czyy";
        //入职时间-值
        String rzsj_value = "";
        //入职时间-字段
        String rzsj_column = "rzsj";
        //姓名-值
        String xm_value = "";
        //姓名-字段
        String xm_column = "xm";
        //性别-值
        String xb_value = "";
        //性别-字段
        String xb_column = "xb";
        //出生年月日-值
        String csnyr_value = "";
        //出生年月日-字段
        String csnyr_column = "csnyr";
        //国籍-值
        String gj_value = "";
        //国籍-字段
        String gj_column = "gj";
        //婚姻状况-值
        String hyzk_value = "";
        //婚姻状况-字段
        String hyzk_column = "hyzk";
        //劳务关系-值
        String lwgx_value = "";
        //劳务关系-字段
        String lwgx_column = "lwgx";
        //员工组-值
        String ygz_value = "";
        //员工组-字段
        String ygz_column = "ygz";
        //员工子组-值
        String ygzz_value = "";
        //员工子组-字段
        String ygzz_column = "ygzz";
        //人事范围-值
        String rsfw_value = "";
        //人事范围-字段
        String rsfw_column = "rsfw";
        //人事子范围-值
        String rszfw_value = "";
        //人事子范围-字段
        String rszfw_column = "rszfw";
        //工资核算范围-值
        String gzhsfw_value = "";
        //工资核算范围-字段
        String gzhsfw_column = "gzhsfwdm";
        //职位-值
        String zw_value = "";
        //职位-字段
        String zw_column = "zw";
        //职位描述-值
        String zwms_value = "";
        //职位描述-字段
        String zwms_column = "zwms";
        //费用归集（原劳动合同）-值
        String fygj_value = "";
        //费用归集（原劳动合同）-字段
        String fygj_column = "fygj";
        //证件类型-值
        String zjlx_value = "";
        //证件类型-字段
        String zjlx_column = "zjlx";
        //身份证号-值
        String sfzh_value = "";
        //身份证号-字段
        String sfzh_column = "sfzh";
        //籍贯-值
        String jg_value = "";
        //籍贯-字段
        String jg_column = "jg";
        //民族-值
        String mz_value = "";
        //民族-字段
        String mz_column = "mz";
        //冻结标识-值
        String djbz_value = "";
        //冻结标识-字段
        String djbz_column = "djbs";
        //审批状态-值
        String spzt_value = "";
        //审批状态-字段
        String spzt_column = "spzt";
        //申请人-值
        String sqr_value = "";
        //申请人-字段
        String sqr_column = "sqr";
        //申请日期-值
        String sqrq_value = "";
        //申请日期-字段
        String sqrq_column = "sqrq";
        //申请时间-值
        String sqsj_value = "";
        //申请时间-字段
        String sqsj_column = "sqsj";
        //操作标识-值
        String czbz_value = "";
        //操作标识-字段
        String czbz_column = "czbs";
        //地址类型-值
        String dzlx_value = "";
        //地址类型-字段
        String dzlx_column = "dzlx";
        //通讯地址-值
        String txdz_value = "";
        //通讯地址-字段
        String txdz_column = "txdz";
        //邮编-值
        String yb_value = "";
        //邮编-字段
        String yb_column = "yb";
        //紧急联系人电话-值
        String jjlxrdh_value = "";
        //紧急联系人电话-字段
        String jjlxrdh_column = "jjlxrdh";
        //紧急联系人-值
        String jjlxr_value = "";
        //紧急联系人-字段
        String jjlxr_column = "jjlxr";
        //与联系人关系-值
        String ylxxgx_value = "";
        //与联系人关系-字段
        String ylxxgx_column = "ylxxgx";
        
        //教育类型-值
        String jylx_value = "";
        //教育类型-字段
        String jylx_column = "jylx";
        //开始日期-值
        String ksrq_value = "";
        //开始日期-字段
        String ksrq_column = "ksrq";
        //结束日期-值
        String jsrq_value = "";
        //结束日期-字段
        String jsrq_column = "jsrq";
        //学习形式-值
        String xxxs_value = "";
        //学习形式-字段
        String xxxs_column = "xxxs";
        //学制（数值）-值
        String xzsz_value = "";
        //学制（数值）-字段
        String xzsz_column = "xzsz";
        //学制（单位）-值
        String xzdw_value = "";
        //学制（单位）-字段
        String xzdw_column = "xzdw";
        //毕业时间-值
        String bysj_value = "";
        //毕业时间-字段
        String bysj_column = "bysj";
        //毕业院校代码-值
        String byyxdm_value = "";
        //毕业院校代码-字段
        String byyxdm_column = "byyxdm";
        //毕业院校名称-值
        String byyxmc_value = "";
        //毕业院校名称-字段
        String byyxmc_column = "byyxmc";
        //学校类型-值
        String xxlx_value = "";
        //学校类型-字段
        String xxlx_column = "xxlx";
        //学院-值
        String xy_value = "";
        //学院-字段
        String xy_column = "xy";
        //所学专业代码-值
        String sxzydm_value = "";
        //所学专业代码-字段
        String sxzydm_column = "sxzydm";
        //所学专业名称-值
        String sxzymc_value = "";
        //所学专业名称-字段
        String sxzymc_column = "sxzymc";
        //是否就业学历-值
        String sfjyxl_value = "";
        //是否就业学历-字段
        String sfjyxl_column = "sfdyxl";
        //是否最高学历-值
        String sfzgxl_value = "";
        //是否最高学历-字段
        String sfzgxl_column = "sfzgxl";
        
        //语种名称-值
        String yzmc_value = "";
        //语种名称-字段
        String yzmc_column = "yzmc";
        //水平等级-值
        String spdj_value = "";
        //水平等级-字段
        String spdj_column = "spdj";

        //电话类型-值
        String dhlx_value = "";
        //电话类型-字段
        String dhlx_column = "dhlx";
        //电话-值
        String dh_value = "";
        //电话-字段
        String dh_column = "dh";
        
        //先前雇主开始日期-值
        String qksrq_value = "";
        //先前雇主开始日期-字段
        String qksrq_column = "ksrq";
        //先前雇主结束日期-值
        String qjsrq_value = "";
        //先前雇主结束日期-字段
        String qjsrq_column = "jsrq";
        //工作单位名称-值
        String gzdwmc_value = "";
        //工作单位名称-字段
        String gzdwmc_column = "gzdwmc";
        //单位行业标识-值
        String dwhybz_value = "";
        //单位行业标识-字段
        String dwhybz_column = "dwhybz";
        //部门-值
        String bm_value = "";
        //部门-字段
        String bm_column = "bm";
        //班组-值
        String bz_value = "";
        //班组-字段
        String bz_column = "bz";
        //岗位-值
        String gw_value = "";
        //岗位-字段
        String gw_column = "gw";
        
        //家庭成员关系-值
        String jtcygx_value = "";
        //家庭成员关系-字段
        String jtcygx_column = "jtcygx";
        //姓名-值
        String jtxm_value = "";
        //姓名-字段
        String jtxm_column = "xm";
        //出生日期-值
        String csrq_value = "";
        //出生日期-字段
        String csrq_column = "csrq";
        //国籍-值
        String jtgj_value = "";
        //国籍-字段
        String jtgj_column = "gj";
        
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(sqdh_column)) {
                sqdh_value = value;
            }
            if (name.equals(rysj_column)) {
                rysj_value = value;
            }
            if (name.equals(czyy_column)) {
                czyy_value = value;
            }
            if (name.equals(rzsj_column)) {
                rzsj_value = value;
            }
            if (name.equals(xm_column)) {
                xm_value = value;
            }
            if (name.equals(xb_column)) {
                xb_value = value;
            }
            if (name.equals(csnyr_column)) {
                csnyr_value = value;
            }
            if (name.equals(gj_column)) {
                gj_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
            if (name.equals(hyzk_column)) {
                hyzk_value = value;
            }
            if (name.equals(sqdh_column)) {
                sqdh_value = value;
            }
            if (name.equals(lwgx_column)) {
                lwgx_value = value;
            }
            if (name.equals(ygz_column)) {
                ygz_value = value;
            }
            if (name.equals(ygzz_column)) {
                ygzz_value = value;
            }
            if (name.equals(rsfw_column)) {
                rsfw_value = value;
            }
            if (name.equals(rszfw_column)) {
                rszfw_value = value;
            }
            if (name.equals(gzhsfw_column)) {
                gzhsfw_value = value;
            }
            if (name.equals(zw_column)) {
                zw_value = value;
            }
            if (name.equals(zwms_column)) {
                zwms_value = value;
            }
            if (name.equals(fygj_column)) {
                fygj_value = value;
            }
            if (name.equals(zjlx_column)) {
                zjlx_value = value;
            }
            if (name.equals(sfzh_column)) {
                sfzh_value = value;
            }
            if (name.equals(jg_column)) {
                jg_value = value;
            }
            if (name.equals(mz_column)) {
                mz_value = value;
            }
            if (name.equals(djbz_column)) {
                djbz_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
            if (name.equals(sqr_column)) {
                sqr_value = value;
            }
            
            if (name.equals(sqrq_column)) {
                sqrq_value = value;
            }
            if (name.equals(sqsj_column)) {
                sqsj_value = value;
            }
            if (name.equals(czbz_column)) {
                czbz_value = value;
            }
            if (name.equals(dzlx_column)) {
                dzlx_value = value;
            }
            if (name.equals(txdz_column)) {
                txdz_value = value;
            }
            if (name.equals(yb_column)) {
                yb_value = value;
            }
            if (name.equals(jjlxrdh_column)) {
                jjlxrdh_value = value;
            }
            if (name.equals(jjlxr_column)) {
                jjlxr_value = value;
            }
            if (name.equals(ylxxgx_column)) {
                ylxxgx_value = value;
            }
        }
        writeLog("申请单号："+sqdh_value);
        writeLog("人员事件："+rysj_value);
        writeLog("操作原因："+czyy_value);
        writeLog("入职时间："+rzsj_value);
        writeLog("姓名："+xm_value);
        writeLog("性别："+xb_value);
        writeLog("出生年月日："+csnyr_value);
        writeLog("国籍："+gj_value);
        writeLog("婚姻状况："+hyzk_value);
        writeLog("劳务关系："+lwgx_value);
        writeLog("员工组："+ygz_value);
        writeLog("员工子组："+ygzz_value);
        writeLog("人事范围："+rsfw_value);
        writeLog("人事子范围："+rszfw_value);
        writeLog("工资核算范围："+gzhsfw_value);
        writeLog("职位："+zw_value);
        writeLog("职位描述："+zwms_value);
        writeLog("费用归集（原劳动合同）："+fygj_value);
        writeLog("证件类型："+zjlx_value);
        writeLog("身份证号："+sfzh_value);
        writeLog("籍贯："+jg_value);
        writeLog("民族："+mz_value);
        writeLog("冻结标识："+djbz_value);
        writeLog("审批状态："+spzt_value);
        writeLog("申请人："+sqr_value);
        writeLog("申请日期："+sqrq_value);
        writeLog("申请时间："+sqsj_value);
        writeLog("操作标识："+czbz_value);
        
        Calendar cal = Calendar.getInstance();
        JSGX_MDM_HRViProxy proxy  = new JSGX_MDM_HRViProxy();
        CreateConfigurationParameters CreateConfigurationParameters = new CreateConfigurationParameters();
        EmployeeCreate[] EmployeeCreates = new EmployeeCreate[1];
        EmployeeCreate EmployeeCreate = new EmployeeCreate();
        DetailTable[] detailtable = request.getDetailTableInfo().getDetailTable();// 获取所有明细表
        DetailTable dt = detailtable[0];// 指定明细表 0表示明细表1
        Row[] s = dt.getRow();// 当前明细表的所有数据,按行存储
        EducationTuple[] EducationTuples = new EducationTuple[s.length];
        for (int j = 0; j < s.length; j++) {
            Row r = s[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            EducationTuple EducationTuple = new EducationTuple();
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (jylx_column.equals(name)) {
                    jylx_value = value;
                }
                if (ksrq_column.equals(name)) {
                    ksrq_value = value;
                }
                if (jsrq_column.equals(name)) {
                    jsrq_value = value;
                }
                if (xxxs_column.equals(name)) {
                    xxxs_value = value;
                }
                if (xzsz_column.equals(name)) {
                    xzsz_value = value;
                }
                if (xzdw_column.equals(name)) {
                    xzdw_value = value;
                }
                if (bysj_column.equals(name)) {
                    bysj_value = value;
                }
                if (byyxdm_column.equals(name)) {
                    byyxdm_value = value;
                }
                if (byyxmc_column.equals(name)) {
                    byyxmc_value = value;
                }
                if (xxlx_column.equals(name)) {
                    xxlx_value = value;
                }
                if (xy_column.equals(name)) {
                    xy_value = value;
                }
                if (sxzydm_column.equals(name)) {
                    sxzydm_value = value;
                }
                if (sxzymc_column.equals(name)) {
                    sxzymc_value = value;
                }
                if (sfjyxl_column.equals(name)) {
                    sfjyxl_value = value;
                }
                if (sfzgxl_column.equals(name)) {
                    sfzgxl_value = value;
                }
            }
            writeLog("教育类型："+jylx_value);
            EducationTypeLookup educationTypeLookup = publicmethod.lookEducationTypeLookup(jylx_value, proxy);
            if(null == educationTypeLookup){
                PublicMethods.setFailedMessage(request, "failed", "查找教育类型："+jylx_value + " 失败.");
                return SUCCESS;
            } else {
                EducationTuple.setSLART(educationTypeLookup);
            }
            writeLog("开始日期："+ksrq_value);
            ksrq_value = publicmethod.toyyyyMMdd(ksrq_value);
            try {
                cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(ksrq_value + "000000"));
                cal.add(Calendar.HOUR_OF_DAY, +8);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
            EducationTuple.setBEGDA(cal);
//            writeLog("结束日期："+jsrq_value);
//            Calendar cal1 = Calendar.getInstance();
//            jsrq_value = publicmethod.toyyyyMMdd(jsrq_value);
//            try {
//                cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(jsrq_value + "000000"));
//                cal1.add(Calendar.HOUR_OF_DAY, +8);
//            } catch (ParseException e1) {
//                e1.printStackTrace();
//            }
//            EducationTuple.setENDDA(cal1);
            writeLog("学习形式："+xxxs_value);
            LearningFormLookup learningFormLookup = publicmethod.lookLearningFormLookup(xxxs_value, proxy);
            if(null == learningFormLookup){
                PublicMethods.setFailedMessage(request, "failed", "查找学习形式："+xxxs_value + " 失败.");
                return SUCCESS;
            } else {
                EducationTuple.setINSMO(learningFormLookup);
            }
            EducationTuple.setANZKL(xzsz_value);
            writeLog("学制（单位）："+xzdw_value);
            EducationSystemUnitLookup educationSystemUnitLookup = publicmethod.lookEducationSystemUnitLookup(xzdw_value, proxy);
            if(null != educationSystemUnitLookup) {
                EducationTuple.setEINHT(educationSystemUnitLookup);
            }
            writeLog("毕业时间："+bysj_value);
            Calendar cal2 = Calendar.getInstance();
            bysj_value = publicmethod.toyyyyMMdd(bysj_value);
            try {
                cal2.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(bysj_value + "000000"));
                cal2.add(Calendar.HOUR_OF_DAY, +8);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
            EducationTuple.setBYSJ(cal2);
            writeLog("毕业院校代码："+byyxdm_value);
            SchoolLookup schoolLookup = publicmethod.lookSchoolLookup(byyxdm_value, proxy);
            if(null == schoolLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找毕业院校代码："+byyxdm_value + " 失败.");
                return SUCCESS;
            }else {
                EducationTuple.setYXMC(schoolLookup);
            }
            EducationTuple.setYXMCQC(byyxmc_value);
            writeLog("学校类型："+xxlx_value);
            SchoolTypeLookup schoolTypeLookup = publicmethod.lookSchoolTypeLookup(xxlx_value, proxy);
            if(null == schoolTypeLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找学校类型："+xxlx_value + " 失败.");
                return SUCCESS;
            }else {
                EducationTuple.setINSAT(schoolTypeLookup);
            }
            EducationTuple.setZTYE_XYX(xy_value);
            writeLog("所学专业代码："+sxzydm_value);
            MajorLookup majorLookup = publicmethod.lookMajorLookup(sxzydm_value, proxy);
            if(null == majorLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找所学专业代码："+sxzydm_value + " 失败.");
                return SUCCESS;
            }else {
                EducationTuple.setSXZY(majorLookup);
            }
            writeLog("所学专业名称："+sxzymc_value);
            EducationTuple.setZYMC(sxzymc_value);
            writeLog("是否就业学历："+sfjyxl_value);
            if("0".equals(sfjyxl_value)) {
                EducationTuple.setSFZGXL(true);
            } else {
                EducationTuple.setSFZGXL(false);
            }
            writeLog("是否最高学历："+sfzgxl_value);
            if("0".equals(sfzgxl_value)){
                EducationTuple.setACAQM(true);
            } else {
                EducationTuple.setACAQM(false);
            }
            EducationTuples[j] = EducationTuple;
        }
        EmployeeCreate.setEducation(EducationTuples);
        
        EmployeeCreate.setZUSRID(jjlxrdh_value);
        EmployeeCreate.setZTYE_LXR(jjlxr_value);
        EmployeeCreate.setZTYE_LXRGX(ylxxgx_value);
        
        DetailTable dt1 = detailtable[1];// 指定明细表 0表示明细表1
        Row[] s1 = dt1.getRow();// 当前明细表的所有数据,按行存储
        LanguageCompetenceTuple[] LanguageCompetenceTuples = new LanguageCompetenceTuple[s1.length];
        for (int j = 0; j < s1.length; j++) {
            Row r = s1[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            LanguageCompetenceTuple LanguageCompetenceTuple = new LanguageCompetenceTuple();
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (yzmc_column.equals(name)) {
                    yzmc_value = value;
                }
                if (spdj_column.equals(name)) {
                    spdj_value = value;
                }
            }
            writeLog("语种名称："+yzmc_value);
            LanguageLookup languageLookup = publicmethod.lookLanguageLookup(yzmc_value, proxy);
            if(null == languageLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找语种名称代码："+yzmc_value+ " 失败.");
                return SUCCESS;
            } else {
                LanguageCompetenceTuple.setYZMC(languageLookup);
            }
            writeLog("水平等级："+spdj_value);
            LanguageLevelLookup languageLevelLookup = publicmethod.lookLanguageLevelLookup(spdj_value, proxy);
            if(null == languageLevelLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找水平等级："+spdj_value+ " 失败.");
                return SUCCESS;
            } else {
                LanguageCompetenceTuple.setSPDJ(languageLevelLookup);
            }
            LanguageCompetenceTuples[j] = LanguageCompetenceTuple;
        }
        EmployeeCreate.setLanguage(LanguageCompetenceTuples);
        
        DetailTable dt2 = detailtable[2];// 指定明细表 0表示明细表1
        Row[] s2 = dt2.getRow();// 当前明细表的所有数据,按行存储
        ContactInfoTuple[] ContactInfoTuples = new ContactInfoTuple[s2.length];
        for (int j = 0; j < s2.length; j++) {
            Row r = s2[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            ContactInfoTuple ContactInfoTuple = new ContactInfoTuple();
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (dhlx_column.equals(name)) {
                    dhlx_value = value;
                }
                if (dh_column.equals(name)) {
                    dh_value = value;
                }
            }
            writeLog("电话类型："+dhlx_value);
            ContactTypeLookup contactTypeLookup = publicmethod.lookContactTypeLookup(dhlx_value, proxy);
            if(null == contactTypeLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找电话类型："+dhlx_value+ " 失败.");
                return SUCCESS;
            } else {
                ContactInfoTuple.setUSRTY(contactTypeLookup);
            }
            writeLog("电话："+dh_value);
            ContactInfoTuple.setUSRID(dh_value);
            ContactInfoTuples[j] = ContactInfoTuple;
        }
        EmployeeCreate.setContact(ContactInfoTuples);
        
        DetailTable dt3 = detailtable[3];// 指定明细表 0表示明细表1
        Row[] s3 = dt3.getRow();// 当前明细表的所有数据,按行存储
        PreviousEmployerTuple[] PreviousEmployerTuples = new PreviousEmployerTuple[s3.length];
        for (int j = 0; j < s3.length; j++) {
            Row r = s3[j];// 指定行
            PreviousEmployerTuple PreviousEmployerTuple = new PreviousEmployerTuple();
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (qksrq_column.equals(name)) {
                    qksrq_value = value;
                }
                if (qjsrq_column.equals(name)) {
                    qjsrq_value = value;
                }
                if (gzdwmc_column.equals(name)) {
                    gzdwmc_value = value;
                }
                if (dwhybz_column.equals(name)) {
                    dwhybz_value = value;
                }
                if (bm_column.equals(name)) {
                    bm_value = value;
                }
                if (bz_column.equals(name)) {
                    bz_value = value;
                }
                if (gw_column.equals(name)) {
                    gw_value = value;
                }
            }
            writeLog("先前雇主开始日期："+qksrq_value);
            qksrq_value = publicmethod.toyyyyMMdd(qksrq_value);
            Calendar cal3 = Calendar.getInstance();
            try {
                cal3.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(qksrq_value + "000000"));
                cal3.add(Calendar.HOUR_OF_DAY, +8);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
            PreviousEmployerTuple.setBEGDA(cal3);
            writeLog("先前雇主结束日期："+qjsrq_value);
            qjsrq_value = publicmethod.toyyyyMMdd(qjsrq_value);
            Calendar cal4 = Calendar.getInstance();
            try {
                cal4.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(qjsrq_value + "000000"));
                cal4.add(Calendar.HOUR_OF_DAY, +8);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
            PreviousEmployerTuple.setENDDA(cal4);
            writeLog("先前雇主工作单位名称："+gzdwmc_value);
            PreviousEmployerTuple.setVORAG(gzdwmc_value);
            writeLog("先前雇主单位行业标识："+dwhybz_value);
            IndustryLookup IndustryLookup = publicmethod.lookIndustryLookup(dwhybz_value, proxy);
            if(null == IndustryLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找单位行业标识："+dwhybz_value+ " 失败.");
                return SUCCESS;
            } else {
                PreviousEmployerTuple.setBRSCH(IndustryLookup);
            }
            writeLog("先前雇主部门："+bm_value);
            PreviousEmployerTuple.setZTYE_BM(bm_value);
            writeLog("先前雇主班组："+bz_value);
            PreviousEmployerTuple.setZTYE_BZXX(bz_value);
            writeLog("先前雇主岗位："+gw_value);
            PreviousEmployerTuple.setZTYE_GW(gw_value);
            PreviousEmployerTuples[j] = PreviousEmployerTuple;
        }
        EmployeeCreate.setWorkExperience(PreviousEmployerTuples);
        
        DetailTable dt4 = detailtable[4];// 指定明细表 0表示明细表1
        Row[] s4 = dt4.getRow();// 当前明细表的所有数据,按行存储
        FamilyMemberTuple[] FamilyMemberTuples = new FamilyMemberTuple[s4.length];
        for (int j = 0; j < s4.length; j++) {
            Row r = s4[j];// 指定行
            FamilyMemberTuple FamilyMemberTuple = new FamilyMemberTuple();
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (jtcygx_column.equals(name)) {
                    jtcygx_value = value;
                }
                if (jtxm_column.equals(name)) {
                    jtxm_value = value;
                }
                if (csrq_column.equals(name)) {
                    csrq_value = value;
                }
                if (jtgj_column.equals(name)) {
                    jtgj_value = value;
                }
            }
            writeLog("家庭成员关系："+jtcygx_value);
            RelationshipLookup RelationshipLookup = publicmethod.lookRelationshipLookup(jtcygx_value, proxy);
            if(null == RelationshipLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找家庭成员关系："+jtcygx_value+ " 失败.");
                return SUCCESS;
            } else {
                FamilyMemberTuple.setFAMSA(RelationshipLookup);
            }
            writeLog("姓名："+jtxm_value);
            FamilyMemberTuple.setPAD_NACHN(jtxm_value);
            writeLog("出生日期："+csrq_value);
            Calendar cal5 = Calendar.getInstance();
            csrq_value = publicmethod.toyyyyMMdd(csrq_value);
            try {
                cal5.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(csrq_value + "000000"));
                cal5.add(Calendar.HOUR_OF_DAY, +8);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
            FamilyMemberTuple.setGBDAT(cal5);
            writeLog("国籍："+jtgj_value);
            NationalityLookup NationalityLookup = publicmethod.lookNationalityLookup(jtgj_value, proxy);
            if(null == NationalityLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找国籍："+jtgj_value+ " 失败.");
                return SUCCESS;
            } else {
                FamilyMemberTuple.setFANAT(NationalityLookup);
            }
            FamilyMemberTuples[j] = FamilyMemberTuple;
        }
        EmployeeCreate.setFamilyMembers(FamilyMemberTuples);
        
        writeLog("地址类型："+dzlx_value);
        AddressTypeLookup AddressTypeLookup = publicmethod.lookAddressTypeLookup(dzlx_value, proxy);
        if(null == AddressTypeLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找地址类型："+dzlx_value+ " 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setANSSA(AddressTypeLookup);
        }
        writeLog("通讯地址："+txdz_value);
        EmployeeCreate.setLOCAT(txdz_value);
        writeLog("邮编："+yb_value);
        EmployeeCreate.setPSTLZ(yb_value);
        
        EmployeeCreate.setApplyNumber(sqdh_value);
        IncidentLookup incidentLookup = publicmethod.lookIncidentLookup(rysj_value, proxy);
        if(null == incidentLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找人员事件："+rysj_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setMASSN(incidentLookup);
        }
        OperationReasonLookup operationReasonLookup = publicmethod.lookOperationReasonLookup(czyy_value, proxy);
        if(null == operationReasonLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找操作原因："+czyy_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setMASSG(operationReasonLookup);
        }
        rzsj_value = publicmethod.toyyyyMMdd(rzsj_value);
        Calendar cal6 = Calendar.getInstance();
        try {
            cal6.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(rzsj_value + "000000"));
            cal6.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        EmployeeCreate.setEINDA(cal6);
        EmployeeCreate.setNACHN(xm_value);
        GenderLookup genderLookup = publicmethod.lookGenderLookup(xb_value, proxy);
        if(null == genderLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找性别："+xb_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setGESCH(genderLookup);
        }
        csnyr_value = publicmethod.toyyyyMMdd(csnyr_value);
        Calendar cal7 = Calendar.getInstance();
        try {
            cal7.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(csnyr_value + "000000"));
            cal7.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        EmployeeCreate.setGBDAT(cal7);
        NationalityLookup nationalityLookup = publicmethod.lookNationalityLookup(gj_value, proxy);
        if(null == nationalityLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找国籍："+gj_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setNATIO(nationalityLookup);
        }
        MaritalStatusLookup maritalStatusLookup = publicmethod.lookMaritalStatusLookup(hyzk_value, proxy);
        if(null == maritalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找婚姻状况："+hyzk_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setFAMST(maritalStatusLookup);
        }
        WorkTypeLookup workTypeLookup = publicmethod.lookWorkTypeLookup(lwgx_value, proxy);
        if(null == workTypeLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找劳务关系："+lwgx_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setWorkType(workTypeLookup);
        }
        EmployeeGroupLookup employeeGroupLookup = publicmethod.lookEmployeeGroupLookup(ygz_value, proxy);
        if(null == employeeGroupLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找员工组："+ygz_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setPERSG(employeeGroupLookup);
        }
        EmployeeSubgroupLookup employeeSubgroupLookup = publicmethod.lookEmployeeSubgroupLookup(ygzz_value, proxy);
        if(null == employeeSubgroupLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找员工子组："+ygzz_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setPERSK(employeeSubgroupLookup);
        }
        PersonnelAreaLookup personnelAreaLookup = publicmethod.lookPersonnelAreaLookup(rsfw_value, proxy);
        if(null == personnelAreaLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找人事范围："+rsfw_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setWERKS(personnelAreaLookup);
        }
        PersonnelSubareasLookup personnelSubareasLookup = publicmethod.lookPersonnelSubareasLookup(rszfw_value, proxy);
        if(null == personnelSubareasLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找人事子范围："+rszfw_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setBTRTL(personnelSubareasLookup);
        }
        PayrollAreaLookup payrollAreaLookup = publicmethod.lookPayrollAreaLookup(gzhsfw_value, proxy);
        if(null == payrollAreaLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找工资核算范围："+gzhsfw_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setABKRS(payrollAreaLookup);
        }
        EmployeeCreate.setPLANS(zw_value);
        EmployeeCreate.setPLANS_NAME(zwms_value);
        CostpoolLookup CostpoolLookup = publicmethod.lookCostpoolLookup(fygj_value, proxy);
        if(null == CostpoolLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找费用归集（原劳动合同）："+fygj_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setANSVH(CostpoolLookup);
        }
        ID_TypeLookup ID_TypeLookup = publicmethod.lookID_TypeLookup(zjlx_value, proxy);
        if(null == ID_TypeLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找证件类型："+zjlx_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setICTYP(ID_TypeLookup);
        }
        EmployeeCreate.setICNUM(sfzh_value);
        EmployeeCreate.setZTYE_JG(jg_value);
        EthnicGroupsLookup ethnicGroupsLookup = publicmethod.lookEthnicGroupsLookup(mz_value, proxy);
        if(null == ethnicGroupsLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找民族："+mz_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setPCN_RACKY(ethnicGroupsLookup);
        }
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == ApprovalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找审批状态："+spzt_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setAPCOD(ApprovalStatusLookup);
        }
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        EmployeeCreate.setApplicant(applicant_chinese_value);
        sqrq_value = publicmethod.toyyyyMMdd(sqrq_value);
        Calendar cal8 = Calendar.getInstance();
        try {
            cal8.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqrq_value + "000000"));
            cal8.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        EmployeeCreate.setApplyDate(cal8);
        Calendar cal9 = Calendar.getInstance();
        sqsj_value = publicmethod.toyyyyMMdd(sqrq_value,sqsj_value+":00");
        try {
            cal9.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqsj_value));
            cal9.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        EmployeeCreate.setApplyTime(cal9);
        OperationLookup operationLookup = publicmethod.lookOperation(czbz_value, proxy);
        if(null == operationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找操作标识："+czbz_value+" 失败.");
            return SUCCESS;
        } else {
            EmployeeCreate.setOperation(operationLookup);
        }
        //获取分发系统 开始
        List<FFXTMode> ffxtList = PublicMethods.getFFXT(rsfw_value, "人员");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
        for(int i = 0; i < ffxtList.size(); i++) {
            String ffxtdm = ffxtList.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm,proxy);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护分发系统代码值。");
                return SUCCESS;
            } else {
                serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
            }
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0",proxy);
            if(null == distributionStatusLookup) {
                PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护分发系统代码状态值。");
                return SUCCESS;
            } else {
                distributionStatusLookup.setDisplayValue("0");
            }
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        EmployeeCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        //获取分发系统 结束
        
        EmployeeCreates[0] = EmployeeCreate;
        try {
            ExecutionStatus[] ExecutionStatus = proxy.createEmployee(EmployeeCreates, publicmethod.setReposInfo(), CreateConfigurationParameters);
            if(null != ExecutionStatus && ExecutionStatus.length > 0) {
                String status = ExecutionStatus[0].getStatus();
                String message = ExecutionStatus[0].getDescription();
                if(!"OK".equalsIgnoreCase(status)){
                    PublicMethods.setFailedMessage(request, "failed", ExecutionStatus[0].getFault()[0].getText());
                    return SUCCESS;
                } else {
                    publicmethod.updateReturnMsg(status, message, requestid);
                }
            } else {
                PublicMethods.setFailedMessage(request, "failed", "调用MDM接口失败。");
                return SUCCESS;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("调用SAP异常信息："+e.getMessage());
            PublicMethods.setFailedMessage(request, "failed", "调用MDM接口失败，原因："+ e.getLocalizedMessage());
        }
        return SUCCESS;
    }
    
    public static void main(String[] args) {
        JSGX_MDM_HRViProxy proxy = new JSGX_MDM_HRViProxy();
        RYPublicMethod publicmethod = new RYPublicMethod();
        SchoolLookup schoolLookup = publicmethod.lookSchoolLookup("1017", proxy);
        if(null == schoolLookup) {
            System.out.println(null == schoolLookup);
        }else {
        }
    }
}
