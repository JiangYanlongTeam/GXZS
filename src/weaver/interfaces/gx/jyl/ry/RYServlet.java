package weaver.interfaces.gx.jyl.ry;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.Employee;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCriteria;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeQuery;
import jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet;
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
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import JSGX_MDM_HRWsd.JSGX_MDM_HRViProxy;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class RYServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private RYPublicMethod publicmethod = new RYPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String gysbh = Util.null2String(request.getParameter("rybh"));
        String flag = Util.null2String(request.getParameter("flag"));
        String gysqc = Util.null2String(request.getParameter("sfzh"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String start = Util.null2String(request.getParameter("start"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSGX_MDM_HRViProxy f = new JSGX_MDM_HRViProxy();
            EmployeeQuery employeeQuery = new EmployeeQuery();
            EmployeeCriteria employeeCriteria = new EmployeeCriteria();
            JSONArray jsonArray = new JSONArray();
            //人员代码 查询条件
            if(!"".equals(gysbh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(gysbh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                employeeCriteria.setPERNR(textCriteria);
            }
            //人员身份证号 查询条件
            if(!"".equals(gysqc)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(gysqc);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                employeeCriteria.setICNUM(textCriteria);
            }
            if(!"".equals(sqdh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(sqdh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                employeeCriteria.setApplyNumber(textCriteria);
            }
            employeeQuery.setCriteria(employeeCriteria);
            EmployeeResultSet employeeResultSet = null;
            try {
                employeeResultSet = f.searchEmployee(employeeQuery, publicmethod.setReposInfo());
                Employee[] employee = employeeResultSet.getEmployee();
                if(null == employee) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = employee.length < end ? employee.length : end;
                
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //人员编号
                    String rybh_value = employee[i].getPERNR();
                    //申请号
                    String applyNumber_value = employee[i].getApplyNumber();
                    //人事事件
                    IncidentLookup incidentLookup = employee[i].getMASSN();
                    String rssj_value = "";
                    if(null != incidentLookup){
                        rssj_value = incidentLookup.getDisplayValue();
                    }
                    //操作原因
                    OperationReasonLookup operationReasonLookup = employee[i].getMASSG();
                    String czyy_value = "";
                    if(null != operationReasonLookup) {
                        czyy_value = operationReasonLookup.getDisplayValue();
                    }
                    //入职时间
                    Calendar rzsj = employee[i].getEINDA();
                    String rzsj_value = "";
                    if(null != rzsj) {
                        rzsj_value = new SimpleDateFormat("yyyy-MM-dd").format(rzsj.getTime());
                    }
                    //姓名
                    String xm_value = employee[i].getNACHN();
                    //性别
                    GenderLookup shxydm = employee[i].getGESCH();
                    String xb_value = "";
                    if(null != shxydm) {
                        xb_value = shxydm.getDisplayValue();
                    }
                    //出生年月日
                    String csnyr_value = "";
                    Calendar gsdjzh = employee[i].getGBDAT();
                    if(null != gsdjzh) {
                        csnyr_value = new SimpleDateFormat("yyyy-MM-dd").format(gsdjzh.getTime());
                    }
                    //国籍
                    NationalityLookup nationalityLookup = employee[i].getNATIO();
                    String gj_value = "";
                    if(null != nationalityLookup) {
                        gj_value = nationalityLookup.getDisplayValue();
                    }
                    //婚姻状况
                    MaritalStatusLookup maritalStatusLookup = employee[i].getFAMST();
                    String hyzk_value = "";
                    if(null != maritalStatusLookup) {
                        hyzk_value = maritalStatusLookup.getDisplayValue();
                    }
                    //劳务关系
                    WorkTypeLookup workTypeLookup = employee[i].getWorkType();
                    String lwgx_value = "";
                    if(null != workTypeLookup) {
                        lwgx_value = workTypeLookup.getDisplayValue();
                    }
                    //员工组
                    EmployeeGroupLookup employeeGroupLookup = employee[i].getPERSG();
                    String ygz_value = "";
                    if(null != employeeGroupLookup) {
                        ygz_value = employeeGroupLookup.getDisplayValue();
                    }
                    //员工子组
                    EmployeeSubgroupLookup employeeSubgroupLookup = employee[i].getPERSK();
                    String ygzz_value = "";
                    if(null != employeeSubgroupLookup) {
                        ygzz_value = employeeSubgroupLookup.getDisplayValue();
                    }
                    //人事范围
                    PersonnelAreaLookup personnelAreaLookup = employee[i].getWERKS();
                    String rsfw_value = "";
                    if(null != personnelAreaLookup) {
                        rsfw_value = personnelAreaLookup.getDisplayValue();
                    }
                    //人事子范围
                    PersonnelSubareasLookup personnelSubareasLookup = employee[i].getBTRTL();
                    String rszfw_value = "";
                    if(null != personnelSubareasLookup) {
                        rszfw_value = personnelSubareasLookup.getDisplayValue();
                    }
                    //工资核算范围
                    PayrollAreaLookup payrollAreaLookup = employee[i].getABKRS();
                    String gzhsfw_value = "";
                    if(null != payrollAreaLookup) {
                        gzhsfw_value = payrollAreaLookup.getDisplayValue();
                    }
                    //职位
                    String zw_value = employee[i].getPLANS();
                    //职位描述
                    String zwms_value = employee[i].getPLANS_NAME();
                    //费用归集（原劳动合同）
                    CostpoolLookup costpoolLookup = employee[i].getANSVH();
                    String fygj_value = "";
                    if(null != costpoolLookup) {
                        fygj_value = costpoolLookup.getDisplayValue();
                    }
                    //证件类型
                    ID_TypeLookup ID_TypeLookup = employee[i].getICTYP();
                    String zjlx_value = "";
                    if(null != ID_TypeLookup) {
                        zjlx_value = ID_TypeLookup.getDisplayValue();
                    }
                    //身份证号
                    String sfzh_value = employee[i].getICNUM();
                    //籍贯
                    String jg_value = employee[i].getZTYE_JG();
                    //民族
                    EthnicGroupsLookup ethnicGroupsLookup = employee[i].getPCN_RACKY();
                    String mz_value = "";
                    if(null != ethnicGroupsLookup) {
                        mz_value = ethnicGroupsLookup.getDisplayValue();
                    }
                    EducationTuple[] educationTuples = employee[i].getEducation();
                    if(null != educationTuples && educationTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int m = 0; m < educationTuples.length; m++) {
                            JSONObject ob = new JSONObject();
                            //教育类型
                            String jylx_value = "";
                            EducationTypeLookup EducationTypeLookup = educationTuples[m].getSLART();
                            if(null != EducationTypeLookup) {
                                jylx_value = EducationTypeLookup.getDisplayValue();
                            }
                            //开始日期
                            String ksrq_value = "";
                            Calendar cal = educationTuples[m].getBEGDA();
                            if(null != cal) {
                                ksrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                            }
                            //结束日期
                            Calendar jsrq = educationTuples[m].getENDDA();
                            String jsrq_value = "";
                            if(null != jsrq) {
                                jsrq_value = new SimpleDateFormat("yyyy-MM-dd").format(jsrq.getTime());
                            }
                            //学习形式
                            String xxxs_value = "";
                            LearningFormLookup LearningFormLookup = educationTuples[m].getINSMO();
                            if(null != LearningFormLookup) {
                                xxxs_value = LearningFormLookup.getDisplayValue();
                            }
                            //学制（数值）
                            String zzsz_value = educationTuples[m].getANZKL();
                            //学制（单位）
                            String zzdw_value = "";
                            EducationSystemUnitLookup EducationSystemUnitLookup = educationTuples[m].getEINHT();
                            if(null != EducationSystemUnitLookup) {
                                zzdw_value = EducationSystemUnitLookup.getDisplayValue();
                            }
                            //毕业时间
                            String bysj_value = "";
                            Calendar bysj = educationTuples[m].getBYSJ();
                            if(null != bysj) {
                                bysj_value = new SimpleDateFormat("yyyy-MM-dd").format(bysj.getTime());
                            }
                            //毕业院校代码
                            String byyxdm_value = "";
                            SchoolLookup SchoolLookup = educationTuples[m].getYXMC();
                            if(null != SchoolLookup) {
                                byyxdm_value = SchoolLookup.getDisplayValue();
                            }
                            //毕业院校名称
                            String byyxmc = educationTuples[m].getYXMCQC();
                            //学校类型
                            String xxlx_value = "";
                            SchoolTypeLookup SchoolTypeLookup = educationTuples[m].getINSAT();
                            if(null != SchoolTypeLookup) {
                                xxlx_value = SchoolTypeLookup.getDisplayValue();
                            }
                            //学院（系）
                            String xyx_value = educationTuples[m].getZTYE_XYX();
                            //所学专业代码
                            String sxzydm_value = "";
                            MajorLookup MajorLookup = educationTuples[m].getSXZY();
                            if(null != MajorLookup) {
                                sxzydm_value = MajorLookup.getDisplayValue();
                            }
                            //所学专业名称 
                            String sxzymc = educationTuples[m].getZYMC();
                            //是否就业学历
                            boolean sfjyxl_value = educationTuples[m].getSFZGXL();
                            //是否最高学历
                            boolean sfzgxl_value = educationTuples[m].getACAQM();
                            ob.put("jylx_value", jylx_value);
                            ob.put("ksrq_value", ksrq_value);
                            ob.put("jsrq_value", jsrq_value);
                            ob.put("xxxs_value", xxxs_value);
                            ob.put("zzsz_value", zzsz_value);
                            ob.put("zzdw_value", zzdw_value);
                            ob.put("bysj_value", bysj_value);
                            ob.put("byyxdm_value", byyxdm_value);
                            ob.put("byyxmc", byyxmc);
                            ob.put("xxlx_value", xxlx_value);
                            ob.put("xyx_value", xyx_value);
                            ob.put("sxzydm_value", sxzydm_value);
                            ob.put("sxzymc", sxzymc);
                            ob.put("sfjyxl_value", sfjyxl_value);
                            ob.put("sfzgxl_value", sfzgxl_value);
                            array.add(ob);
                        }
                        jo.put("education", array);
                    }
                    LanguageCompetenceTuple[] languageCompetenceTuples = employee[i].getLanguage();
                    if(null != languageCompetenceTuples && languageCompetenceTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < languageCompetenceTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String yzmc_value = "";
                            LanguageLookup LanguageLookup = languageCompetenceTuples[j].getYZMC();
                            if(null != LanguageLookup) {
                                yzmc_value = LanguageLookup.getDisplayValue();
                            }
                            String spdj_value = "";
                            LanguageLevelLookup LanguageLevelLookup = languageCompetenceTuples[j].getSPDJ();
                            if(null != LanguageLevelLookup) {
                                spdj_value = LanguageLevelLookup.getDisplayValue();
                            }
                            ob.put("yzmc_value", yzmc_value);
                            ob.put("spdj_value", spdj_value);
                            array.add(ob);
                        }
                        jo.put("language", array);
                    }
                    //地址类型
                    String dzlx_value = "";
                    AddressTypeLookup AddressTypeLookup = employee[i].getANSSA();
                    if(null != AddressTypeLookup) {
                        dzlx_value = AddressTypeLookup.getDisplayValue();
                    }
                    //通讯地址
                    String txdz_value = employee[i].getLOCAT();
                    //邮编
                    String yb_value = employee[i].getPSTLZ();
                    ContactInfoTuple[] ContactInfoTuples = employee[i].getContact();
                    if(null != ContactInfoTuples && ContactInfoTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < ContactInfoTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String dhlx_value = "";
                            ContactTypeLookup ContactTypeLookup = ContactInfoTuples[j].getUSRTY();
                            if(null != ContactTypeLookup) {
                                dhlx_value = ContactTypeLookup.getDisplayValue();
                            }
                            String dh_value = ContactInfoTuples[j].getUSRID();
                            ob.put("dhlx_value", dhlx_value);
                            ob.put("dh_value", dh_value);
                            array.add(ob);
                        }
                        jo.put("contact", array);
                    }
                    PreviousEmployerTuple[] PreviousEmployerTuple = employee[i].getWorkExperience();
                    if(null != PreviousEmployerTuple && PreviousEmployerTuple.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < PreviousEmployerTuple.length; j++) {
                            JSONObject ob = new JSONObject();
                            Calendar ksrq = PreviousEmployerTuple[j].getBEGDA();
                            String ksrq_value = "";
                            if(null != ksrq) {
                                ksrq_value = new SimpleDateFormat("yyyy-MM-dd").format(ksrq.getTime());
                            }
                            Calendar jsrq = PreviousEmployerTuple[j].getENDDA();
                            String jsrq_value = "";
                            if(null != ksrq) {
                                jsrq_value = new SimpleDateFormat("yyyy-MM-dd").format(jsrq.getTime());
                            }
                            String gzdwmc_value = PreviousEmployerTuple[j].getVORAG();
                            String dwhybz_value = "";
                            IndustryLookup industryLookup = PreviousEmployerTuple[j].getBRSCH();
                            if(null != industryLookup) {
                                dwhybz_value = industryLookup.getDisplayValue();
                            }
                            String bm_value = PreviousEmployerTuple[j].getZTYE_BM();
                            String bz_value = PreviousEmployerTuple[j].getZTYE_BZXX();
                            String gw_value = PreviousEmployerTuple[j].getZTYE_GW();
                            ob.put("ksrq_value", ksrq_value);
                            ob.put("jsrq_value", jsrq_value);
                            ob.put("gzdwmc_value", gzdwmc_value);
                            ob.put("dwhybz_value", dwhybz_value);
                            ob.put("bm_value", bm_value);
                            ob.put("bz_value", bz_value);
                            ob.put("gw_value", gw_value);
                            array.add(ob);
                        }
                        jo.put("experience", array);
                    }
                    FamilyMemberTuple[] FamilyMemberTuples = employee[i].getFamilyMembers();
                    if(null != FamilyMemberTuples && FamilyMemberTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < FamilyMemberTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String jtcygx_value = "";
                            RelationshipLookup RelationshipLookup = FamilyMemberTuples[j].getFAMSA();
                            if(null != RelationshipLookup) {
                                jtcygx_value = RelationshipLookup.getDisplayValue();
                            }
                            String jtxm_value = FamilyMemberTuples[j].getPAD_NACHN();
                            String csrq_value = "";
                            Calendar csrq = FamilyMemberTuples[j].getGBDAT();
                            if(null != csrq) {
                                csrq_value = new SimpleDateFormat("yyyy-MM-dd").format(csrq.getTime());
                            }
                            String jtgj_value = "";
                            NationalityLookup NationalityLookup = FamilyMemberTuples[j].getFANAT();
                            if(null != NationalityLookup) {
                                jtgj_value = NationalityLookup.getDisplayValue();
                            }
                            ob.put("jtcygx_value", jtcygx_value);
                            ob.put("jtxm_value", jtxm_value);
                            ob.put("csrq_value", csrq_value);
                            ob.put("jtgj_value", jtgj_value);
                            array.add(ob);
                        }
                        jo.put("family", array);
                    }
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = employee[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = employee[i].getApplicant();
                    String sqrq_value = "";
                    Calendar sqrq = employee[i].getApplyDate();
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = employee[i].getApplyDate();
                    if(null != sqsj) {
                        sqsj.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = employee[i].getServiceRelationshipsTuple();
                    if(null != ServiceRelationshipsTupleTuples && ServiceRelationshipsTupleTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < ServiceRelationshipsTupleTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String client_value = "";
                            ClientLookup ClientLookup = ServiceRelationshipsTupleTuples[j].getCLIENT_SYSTEM();
                            if(null != ClientLookup) {
                                client_value = ClientLookup.getDisplayValue();
                            }
                            String client_status = "";
                            DistributionStatusLookup DistributionStatusLookup = ServiceRelationshipsTupleTuples[j].getDISTUS();
                            if(null != DistributionStatusLookup) {
                                client_status = DistributionStatusLookup.getDisplayValue();
                            }
                            String message = ServiceRelationshipsTupleTuples[j].getRETURN();
                            ob.put("client_value", client_value);
                            ob.put("client_status", client_status);
                            ob.put("message", message);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    
                    String czbz_value = "";
                    OperationLookup OperationLookup = employee[i].getOperation();
                    if(null != OperationLookup) {
                        czbz_value = OperationLookup.getDisplayValue();
                    }
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+rybh_value+"')\">"+rybh_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("rybh", jjzxdm_val);
                    } else {
                        jo.put("rybh", rybh_value);
                    }
                    jo.put("applyNumber_value", applyNumber_value);
                    jo.put("rssj_value", rssj_value);
                    jo.put("czyy_value", czyy_value);
                    jo.put("rzsj_value", rzsj_value);
                    jo.put("xm_value", xm_value);
                    jo.put("xb_value", xb_value);
                    jo.put("csnyr_value", csnyr_value);
                    jo.put("gj_value", gj_value);
                    jo.put("hyzk_value", hyzk_value);
                    jo.put("lwgx_value", lwgx_value);
                    jo.put("ygz_value", ygz_value);
                    jo.put("ygzz_value", ygzz_value);
                    jo.put("rsfw_value", rsfw_value);
                    jo.put("rszfw_value", rszfw_value);
                    jo.put("gzhsfw_value", gzhsfw_value);
                    jo.put("zw_value", zw_value);
                    jo.put("zwms_value", zwms_value);
                    jo.put("fygj_value", fygj_value);
                    jo.put("zjlx_value", zjlx_value);
                    jo.put("sfzh_value", sfzh_value);
                    jo.put("jg_value", jg_value);
                    jo.put("mz_value", mz_value);
                    jo.put("dzlx_value", dzlx_value);
                    jo.put("txdz_value", txdz_value);
                    jo.put("yb_value", yb_value);
                    jo.put("spzt_value", spzt_value);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("czbz_value", czbz_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", employee.length);
                jsonresult.put("result", jsonArray);
                response.setContentType("application/json; charset=utf-8");
                response.getWriter().print(jsonresult.toString());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            bean.writeLog(e.getMessage());
        }
    }
    
    /**
     * 根据人员编号查询数据-供基本信息和服务关系用
     * 
     * @param gysbh
     * @return
     */
    public Map<String,Object> getdata(String rybh) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_HRViProxy f = new JSGX_MDM_HRViProxy();
            EmployeeQuery employeeQuery = new EmployeeQuery();
            EmployeeCriteria employeeCriteria = new EmployeeCriteria();
            //人员代码 查询条件
            if(!"".equals(rybh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(rybh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                employeeCriteria.setPERNR(publicmethod.setTextCriteria(rybh));
            }
            employeeQuery.setCriteria(employeeCriteria);
            EmployeeResultSet employeeResultSet = null;
            try {
                employeeResultSet = f.searchEmployee(employeeQuery, publicmethod.setReposInfo());
                Employee[] employee = employeeResultSet.getEmployee();
                if(null == employee) {
                    return new HashMap<String,Object>();
                }
                for(int i = 0 ; i < 1; i++){
                    //人员编号
                    String rybh_value = employee[i].getPERNR();
                    //申请号
                    String applyNumber_value = employee[i].getApplyNumber();
                    //人事事件
                    IncidentLookup incidentLookup = employee[i].getMASSN();
                    String rssj_value = "";
                    if(null != incidentLookup){
                        rssj_value = incidentLookup.getDisplayValue();
                    }
                    //操作原因
                    OperationReasonLookup operationReasonLookup = employee[i].getMASSG();
                    String czyy_value = "";
                    if(null != operationReasonLookup) {
                        czyy_value = operationReasonLookup.getDisplayValue();
                    }
                    //入职时间
                    Calendar rzsj = employee[i].getEINDA();
                    String rzsj_value = "";
                    if(null != rzsj) {
                        rzsj_value = new SimpleDateFormat("yyyy-MM-dd").format(rzsj.getTime());
                    }
                    //姓名
                    String xm_value = employee[i].getNACHN();
                    //性别
                    GenderLookup shxydm = employee[i].getGESCH();
                    String xb_value = "";
                    if(null != shxydm) {
                        xb_value = shxydm.getDisplayValue();
                    }
                    //出生年月日
                    String csnyr_value = "";
                    Calendar gsdjzh = employee[i].getGBDAT();
                    if(null != gsdjzh) {
                        csnyr_value = new SimpleDateFormat("yyyy-MM-dd").format(gsdjzh.getTime());
                    }
                    //国籍
                    NationalityLookup nationalityLookup = employee[i].getNATIO();
                    String gj_value = "";
                    if(null != nationalityLookup) {
                        gj_value = nationalityLookup.getDisplayValue();
                    }
                    //婚姻状况
                    MaritalStatusLookup maritalStatusLookup = employee[i].getFAMST();
                    String hyzk_value = "";
                    if(null != maritalStatusLookup) {
                        hyzk_value = maritalStatusLookup.getDisplayValue();
                    }
                    //劳务关系
                    WorkTypeLookup workTypeLookup = employee[i].getWorkType();
                    String lwgx_value = "";
                    if(null != workTypeLookup) {
                        lwgx_value = workTypeLookup.getDisplayValue();
                    }
                    //员工组
                    EmployeeGroupLookup employeeGroupLookup = employee[i].getPERSG();
                    String ygz_value = "";
                    if(null != employeeGroupLookup) {
                        ygz_value = employeeGroupLookup.getDisplayValue();
                    }
                    //员工子组
                    EmployeeSubgroupLookup employeeSubgroupLookup = employee[i].getPERSK();
                    String ygzz_value = "";
                    if(null != employeeSubgroupLookup) {
                        ygzz_value = employeeSubgroupLookup.getDisplayValue();
                    }
                    //人事范围
                    PersonnelAreaLookup personnelAreaLookup = employee[i].getWERKS();
                    String rsfw_value = "";
                    if(null != personnelAreaLookup) {
                        rsfw_value = personnelAreaLookup.getDisplayValue();
                    }
                    //人事子范围
                    PersonnelSubareasLookup personnelSubareasLookup = employee[i].getBTRTL();
                    String rszfw_value = "";
                    if(null != personnelSubareasLookup) {
                        rszfw_value = personnelSubareasLookup.getDisplayValue();
                    }
                    //工资核算范围
                    PayrollAreaLookup payrollAreaLookup = employee[i].getABKRS();
                    String gzhsfw_value = "";
                    if(null != payrollAreaLookup) {
                        gzhsfw_value = payrollAreaLookup.getDisplayValue();
                    }
                    //职位
                    String zw_value = employee[i].getPLANS();
                    //职位描述
                    String zwms_value = employee[i].getPLANS_NAME();
                    //费用归集（原劳动合同）
                    CostpoolLookup costpoolLookup = employee[i].getANSVH();
                    String fygj_value = "";
                    if(null != costpoolLookup) {
                        fygj_value = costpoolLookup.getDisplayValue();
                    }
                    //证件类型
                    ID_TypeLookup ID_TypeLookup = employee[i].getICTYP();
                    String zjlx_value = "";
                    if(null != ID_TypeLookup) {
                        zjlx_value = ID_TypeLookup.getDisplayValue();
                    }
                    //身份证号
                    String sfzh_value = employee[i].getICNUM();
                    //籍贯
                    String jg_value = employee[i].getZTYE_JG();
                    //民族
                    EthnicGroupsLookup ethnicGroupsLookup = employee[i].getPCN_RACKY();
                    String mz_value = "";
                    if(null != ethnicGroupsLookup) {
                        mz_value = ethnicGroupsLookup.getDisplayValue();
                    }
                    EducationTuple[] educationTuples = employee[i].getEducation();
                    if(null != educationTuples && educationTuples.length > 0) {
                        List<Map<String,Object>> array = new ArrayList<Map<String,Object>>();
                        for(int m = 0; m < educationTuples.length; m++) {
                            Map<String,Object> ob = new HashMap<String,Object>();
                            //教育类型
                            String jylx_value = "";
                            EducationTypeLookup EducationTypeLookup = educationTuples[m].getSLART();
                            if(null != EducationTypeLookup) {
                                jylx_value = EducationTypeLookup.getDisplayValue();
                            }
                            //开始日期
                            String ksrq_value = "";
                            Calendar cal = educationTuples[m].getBEGDA();
                            if(null != cal) {
                                ksrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                            }
                            //结束日期
                            Calendar jsrq = educationTuples[m].getENDDA();
                            String jsrq_value = "";
                            if(null != jsrq) {
                                jsrq_value = new SimpleDateFormat("yyyy-MM-dd").format(jsrq.getTime());
                            }
                            //学习形式
                            String xxxs_value = "";
                            LearningFormLookup LearningFormLookup = educationTuples[m].getINSMO();
                            if(null != LearningFormLookup) {
                                xxxs_value = LearningFormLookup.getDisplayValue();
                            }
                            //学制（数值）
                            String zzsz_value = educationTuples[m].getANZKL();
                            //学制（单位）
                            String zzdw_value = "";
                            EducationSystemUnitLookup EducationSystemUnitLookup = educationTuples[m].getEINHT();
                            if(null != EducationSystemUnitLookup) {
                                zzdw_value = EducationSystemUnitLookup.getDisplayValue();
                            }
                            //毕业时间
                            String bysj_value = "";
                            Calendar bysj = educationTuples[m].getBYSJ();
                            if(null != bysj) {
                                bysj_value = new SimpleDateFormat("yyyy-MM-dd").format(bysj.getTime());
                            }
                            //毕业院校代码
                            String byyxdm_value = "";
                            SchoolLookup SchoolLookup = educationTuples[m].getYXMC();
                            if(null != SchoolLookup) {
                                byyxdm_value = SchoolLookup.getDisplayValue();
                            }
                            //毕业院校名称
                            String byyxmc = educationTuples[m].getYXMCQC();
                            //学校类型
                            String xxlx_value = "";
                            SchoolTypeLookup SchoolTypeLookup = educationTuples[m].getINSAT();
                            if(null != SchoolTypeLookup) {
                                xxlx_value = SchoolTypeLookup.getDisplayValue();
                            }
                            //学院（系）
                            String xyx_value = educationTuples[m].getZTYE_XYX();
                            //所学专业代码
                            String sxzydm_value = "";
                            MajorLookup MajorLookup = educationTuples[m].getSXZY();
                            if(null != MajorLookup) {
                                sxzydm_value = MajorLookup.getDisplayValue();
                            }
                            //所学专业名称 
                            String sxzymc = educationTuples[m].getZYMC();
                            //是否就业学历
                            boolean sfjyxl_value = educationTuples[m].getSFZGXL();
                            //是否最高学历
                            boolean sfzgxl_value = educationTuples[m].getACAQM();
                            ob.put("jylx_value", jylx_value);
                            ob.put("ksrq_value", ksrq_value);
                            ob.put("jsrq_value", jsrq_value);
                            ob.put("xxxs_value", xxxs_value);
                            ob.put("zzsz_value", zzsz_value);
                            ob.put("zzdw_value", zzdw_value);
                            ob.put("bysj_value", bysj_value);
                            ob.put("byyxdm_value", byyxdm_value);
                            ob.put("byyxmc", byyxmc);
                            ob.put("xxlx_value", xxlx_value);
                            ob.put("xyx_value", xyx_value);
                            ob.put("sxzydm_value", sxzydm_value);
                            ob.put("sxzymc", sxzymc);
                            ob.put("sfjyxl_value", sfjyxl_value);
                            ob.put("sfzgxl_value", sfzgxl_value);
                            array.add(ob);
                        }
                        map.put("education", array);
                    }
                    LanguageCompetenceTuple[] languageCompetenceTuples = employee[i].getLanguage();
                    if(null != languageCompetenceTuples && languageCompetenceTuples.length > 0) {
                        List<Map<String,Object>> array = new ArrayList<Map<String,Object>>();
                        for(int j = 0; j < languageCompetenceTuples.length; j++) {
                            Map<String,Object> ob = new HashMap<String,Object>();
                            String yzmc_value = "";
                            LanguageLookup LanguageLookup = languageCompetenceTuples[j].getYZMC();
                            if(null != LanguageLookup) {
                                yzmc_value = LanguageLookup.getDisplayValue();
                            }
                            String spdj_value = "";
                            LanguageLevelLookup LanguageLevelLookup = languageCompetenceTuples[j].getSPDJ();
                            if(null != LanguageLevelLookup) {
                                spdj_value = LanguageLevelLookup.getDisplayValue();
                            }
                            ob.put("yzmc_value", yzmc_value);
                            ob.put("spdj_value", spdj_value);
                            array.add(ob);
                        }
                        map.put("language", array);
                    }
                    //地址类型
                    String dzlx_value = "";
                    AddressTypeLookup AddressTypeLookup = employee[i].getANSSA();
                    if(null != AddressTypeLookup) {
                        dzlx_value = AddressTypeLookup.getDisplayValue();
                    }
                    //通讯地址
                    String txdz_value = employee[i].getLOCAT();
                    //邮编
                    String yb_value = employee[i].getPSTLZ();
                    ContactInfoTuple[] ContactInfoTuples = employee[i].getContact();
                    if(null != ContactInfoTuples && ContactInfoTuples.length > 0) {
                        List<Map<String,Object>> array = new ArrayList<Map<String,Object>>();
                        for(int j = 0; j < ContactInfoTuples.length; j++) {
                            Map<String,Object> ob = new HashMap<String,Object>();
                            String dhlx_value = "";
                            ContactTypeLookup ContactTypeLookup = ContactInfoTuples[j].getUSRTY();
                            if(null != ContactTypeLookup) {
                                dhlx_value = ContactTypeLookup.getDisplayValue();
                            }
                            String dh_value = ContactInfoTuples[j].getUSRID();
                            ob.put("dhlx_value", dhlx_value);
                            ob.put("dh_value", dh_value);
                            array.add(ob);
                        }
                        map.put("contact", array);
                    }
                    PreviousEmployerTuple[] PreviousEmployerTuple = employee[i].getWorkExperience();
                    if(null != PreviousEmployerTuple && PreviousEmployerTuple.length > 0) {
                        List<Map<String,Object>> array = new ArrayList<Map<String,Object>>();
                        for(int j = 0; j < PreviousEmployerTuple.length; j++) {
                            Map<String,Object> ob = new HashMap<String,Object>();
                            Calendar ksrq = PreviousEmployerTuple[j].getBEGDA();
                            String ksrq_value = "";
                            if(null != ksrq) {
                                ksrq_value = new SimpleDateFormat("yyyy-MM-dd").format(ksrq.getTime());
                            }
                            Calendar jsrq = PreviousEmployerTuple[j].getENDDA();
                            String jsrq_value = "";
                            if(null != ksrq) {
                                jsrq_value = new SimpleDateFormat("yyyy-MM-dd").format(jsrq.getTime());
                            }
                            String gzdwmc_value = PreviousEmployerTuple[j].getVORAG();
                            String dwhybz_value = "";
                            IndustryLookup industryLookup = PreviousEmployerTuple[j].getBRSCH();
                            if(null != industryLookup) {
                                dwhybz_value = industryLookup.getDisplayValue();
                            }
                            String bm_value = PreviousEmployerTuple[j].getZTYE_BM();
                            String bz_value = PreviousEmployerTuple[j].getZTYE_BZXX();
                            String gw_value = PreviousEmployerTuple[j].getZTYE_GW();
                            ob.put("ksrq_value", ksrq_value);
                            ob.put("jsrq_value", jsrq_value);
                            ob.put("gzdwmc_value", gzdwmc_value);
                            ob.put("dwhybz_value", dwhybz_value);
                            ob.put("bm_value", bm_value);
                            ob.put("bz_value", bz_value);
                            ob.put("gw_value", gw_value);
                            array.add(ob);
                        }
                        map.put("experience", array);
                    }
                    FamilyMemberTuple[] FamilyMemberTuples = employee[i].getFamilyMembers();
                    if(null != FamilyMemberTuples && FamilyMemberTuples.length > 0) {
                        List<Map<String,Object>> array = new ArrayList<Map<String,Object>>();
                        for(int j = 0; j < FamilyMemberTuples.length; j++) {
                            Map<String,Object> ob = new HashMap<String,Object>();
                            String jtcygx_value = "";
                            RelationshipLookup RelationshipLookup = FamilyMemberTuples[j].getFAMSA();
                            if(null != RelationshipLookup) {
                                jtcygx_value = RelationshipLookup.getDisplayValue();
                            }
                            String jtxm_value = FamilyMemberTuples[j].getPAD_NACHN();
                            String csrq_value = "";
                            Calendar csrq = FamilyMemberTuples[j].getGBDAT();
                            if(null != csrq) {
                                csrq_value = new SimpleDateFormat("yyyy-MM-dd").format(csrq.getTime());
                            }
                            String jtgj_value = "";
                            NationalityLookup NationalityLookup = FamilyMemberTuples[j].getFANAT();
                            if(null != NationalityLookup) {
                                jtgj_value = NationalityLookup.getDisplayValue();
                            }
                            ob.put("jtcygx_value", jtcygx_value);
                            ob.put("jtxm_value", jtxm_value);
                            ob.put("csrq_value", csrq_value);
                            ob.put("jtgj_value", jtgj_value);
                            array.add(ob);
                        }
                        map.put("family", array);
                    }
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = employee[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = employee[i].getApplicant();
                    String sqrq_value = "";
                    Calendar sqrq = employee[i].getApplyDate();
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = employee[i].getApplyDate();
                    if(null != sqsj) {
                        sqsj.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = employee[i].getServiceRelationshipsTuple();
                    if(null != ServiceRelationshipsTupleTuples && ServiceRelationshipsTupleTuples.length > 0) {
                        List<Map<String,Object>> array = new ArrayList<Map<String,Object>>();
                        for(int j = 0; j < ServiceRelationshipsTupleTuples.length; j++) {
                            Map<String,Object> ob = new HashMap<String,Object>();
                            String client_value = "";
                            ClientLookup ClientLookup = ServiceRelationshipsTupleTuples[j].getCLIENT_SYSTEM();
                            if(null != ClientLookup) {
                                client_value = ClientLookup.getDisplayValue();
                            }
                            String client_status = "";
                            DistributionStatusLookup DistributionStatusLookup = ServiceRelationshipsTupleTuples[j].getDISTUS();
                            if(null != DistributionStatusLookup) {
                                client_status = DistributionStatusLookup.getDisplayValue();
                            }
                            String message = ServiceRelationshipsTupleTuples[j].getRETURN();
                            ob.put("client_value", client_value);
                            ob.put("client_status", client_status);
                            ob.put("message", message);
                            array.add(ob);
                        }
                        map.put("client", array);
                    }
                    
                    String czbz_value = "";
                    OperationLookup OperationLookup = employee[i].getOperation();
                    if(null != OperationLookup) {
                        czbz_value = OperationLookup.getDisplayValue();
                    }
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+rybh_value+"')\">"+rybh_value+"</a>";
                    if(!"".equals("")){
                        map.put("rybh", jjzxdm_val);
                    } else {
                        map.put("rybh", rybh_value);
                    }
                    map.put("applyNumber_value", applyNumber_value);
                    map.put("rssj_value", rssj_value);
                    map.put("czyy_value", czyy_value);
                    map.put("rzsj_value", rzsj_value);
                    map.put("xm_value", xm_value);
                    map.put("xb_value", xb_value);
                    map.put("csnyr_value", csnyr_value);
                    map.put("gj_value", gj_value);
                    map.put("hyzk_value", hyzk_value);
                    map.put("lwgx_value", lwgx_value);
                    map.put("ygz_value", ygz_value);
                    map.put("ygzz_value", ygzz_value);
                    map.put("rsfw_value", rsfw_value);
                    map.put("rszfw_value", rszfw_value);
                    map.put("gzhsfw_value", gzhsfw_value);
                    map.put("zw_value", zw_value);
                    map.put("zwms_value", zwms_value);
                    map.put("fygj_value", fygj_value);
                    map.put("zjlx_value", zjlx_value);
                    map.put("sfzh_value", sfzh_value);
                    map.put("jg_value", jg_value);
                    map.put("mz_value", mz_value);
                    map.put("dzlx_value", dzlx_value);
                    map.put("txdz_value", txdz_value);
                    map.put("yb_value", yb_value);
                    map.put("spzt_value", spzt_value);
                    map.put("sqr_value", sqr_value);
                    map.put("sqrq_value", sqrq_value);
                    map.put("sqsj_value", sqsj_value);
                    map.put("czbz_value", czbz_value);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            bean.writeLog(e.getMessage());
        }
        return map;
    }
    
    /**
     * 根据用户名获取ID
     * @param id 用户名
     * @return
     */
    public String getUserId(String username){
        RecordSet rs = new RecordSet();
        rs.execute("select id from hrmresource where lastname = '"+username+"'");
        rs.next();
        String uid = Util.null2o(rs.getString("id"));
        return uid;
    }
    
    private int getInt(String strValue,int defValue){
        try {
            return Integer.parseInt(strValue);
        } catch (Exception ex) {
            return defValue;
        }
    }
    
    public static void main(String[] args) {
        RYPublicMethod publicmethod = new RYPublicMethod();
        try {
            JSGX_MDM_HRViProxy f = new JSGX_MDM_HRViProxy();
            EmployeeQuery employeeQuery = new EmployeeQuery();
            EmployeeCriteria employeeCriteria = new EmployeeCriteria();
            JSONArray jsonArray = new JSONArray();
            //人员代码 查询条件
            if(!"".equals("")){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue("");
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                employeeCriteria.setPERNR(textCriteria);
            }
            //人员身份证号 查询条件
            if(!"".equals("")){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue("");
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                employeeCriteria.setICNUM(textCriteria);
            }
            if(!"".equals("")){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue("");
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                employeeCriteria.setApplyNumber(textCriteria);
            }
            employeeQuery.setCriteria(employeeCriteria);
            EmployeeResultSet employeeResultSet = null;
            try {
                employeeResultSet = f.searchEmployee(employeeQuery, publicmethod.setReposInfo());
                Employee[] employee = employeeResultSet.getEmployee();
                if(null == employee) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    return;
                }
                
                for(int i = 0 ; i < employee.length; i++){
                    JSONObject jo = new JSONObject();
                    //人员编号
                    String rybh_value = employee[i].getPERNR();
                    //申请号
                    String applyNumber_value = employee[i].getApplyNumber();
                    //人事事件
                    IncidentLookup incidentLookup = employee[i].getMASSN();
                    String rssj_value = "";
                    if(null != incidentLookup){
                        rssj_value = incidentLookup.getDisplayValue();
                    }
                    //操作原因
                    OperationReasonLookup operationReasonLookup = employee[i].getMASSG();
                    String czyy_value = "";
                    if(null != operationReasonLookup) {
                        czyy_value = operationReasonLookup.getDisplayValue();
                    }
                    //入职时间
                    Calendar rzsj = employee[i].getEINDA();
                    String rzsj_value = "";
                    if(null != rzsj) {
                        rzsj_value = new SimpleDateFormat("yyyy-MM-dd").format(rzsj.getTime());
                    }
                    //姓名
                    String xm_value = employee[i].getNACHN();
                    //性别
                    GenderLookup shxydm = employee[i].getGESCH();
                    String xb_value = "";
                    if(null != shxydm) {
                        xb_value = shxydm.getDisplayValue();
                    }
                    //出生年月日
                    String csnyr_value = "";
                    Calendar gsdjzh = employee[i].getGBDAT();
                    if(null != gsdjzh) {
                        csnyr_value = new SimpleDateFormat("yyyy-MM-dd").format(gsdjzh.getTime());
                    }
                    //国籍
                    NationalityLookup nationalityLookup = employee[i].getNATIO();
                    String gj_value = "";
                    if(null != nationalityLookup) {
                        gj_value = nationalityLookup.getDisplayValue();
                    }
                    //婚姻状况
                    MaritalStatusLookup maritalStatusLookup = employee[i].getFAMST();
                    String hyzk_value = "";
                    if(null != maritalStatusLookup) {
                        hyzk_value = maritalStatusLookup.getDisplayValue();
                    }
                    //劳务关系
                    WorkTypeLookup workTypeLookup = employee[i].getWorkType();
                    String lwgx_value = "";
                    if(null != workTypeLookup) {
                        lwgx_value = workTypeLookup.getDisplayValue();
                    }
                    //员工组
                    EmployeeGroupLookup employeeGroupLookup = employee[i].getPERSG();
                    String ygz_value = "";
                    if(null != employeeGroupLookup) {
                        ygz_value = employeeGroupLookup.getDisplayValue();
                    }
                    //员工子组
                    EmployeeSubgroupLookup employeeSubgroupLookup = employee[i].getPERSK();
                    String ygzz_value = "";
                    if(null != employeeSubgroupLookup) {
                        ygzz_value = employeeSubgroupLookup.getDisplayValue();
                    }
                    //人事范围
                    PersonnelAreaLookup personnelAreaLookup = employee[i].getWERKS();
                    String rsfw_value = "";
                    if(null != personnelAreaLookup) {
                        rsfw_value = personnelAreaLookup.getDisplayValue();
                    }
                    //人事子范围
                    PersonnelSubareasLookup personnelSubareasLookup = employee[i].getBTRTL();
                    String rszfw_value = "";
                    if(null != personnelSubareasLookup) {
                        rszfw_value = personnelSubareasLookup.getDisplayValue();
                    }
                    //工资核算范围
                    PayrollAreaLookup payrollAreaLookup = employee[i].getABKRS();
                    String gzhsfw_value = "";
                    if(null != payrollAreaLookup) {
                        gzhsfw_value = payrollAreaLookup.getDisplayValue();
                    }
                    //职位
                    String zw_value = employee[i].getPLANS();
                    //职位描述
                    String zwms_value = employee[i].getPLANS_NAME();
                    //费用归集（原劳动合同）
                    CostpoolLookup costpoolLookup = employee[i].getANSVH();
                    String fygj_value = "";
                    if(null != costpoolLookup) {
                        fygj_value = costpoolLookup.getDisplayValue();
                    }
                    //证件类型
                    ID_TypeLookup ID_TypeLookup = employee[i].getICTYP();
                    String zjlx_value = "";
                    if(null != ID_TypeLookup) {
                        zjlx_value = ID_TypeLookup.getDisplayValue();
                    }
                    //身份证号
                    String sfzh_value = employee[i].getICNUM();
                    //籍贯
                    String jg_value = employee[i].getZTYE_JG();
                    //民族
                    EthnicGroupsLookup ethnicGroupsLookup = employee[i].getPCN_RACKY();
                    String mz_value = "";
                    if(null != ethnicGroupsLookup) {
                        mz_value = ethnicGroupsLookup.getDisplayValue();
                    }
                    EducationTuple[] educationTuples = employee[i].getEducation();
                    if(null != educationTuples && educationTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int m = 0; m < educationTuples.length; m++) {
                            JSONObject ob = new JSONObject();
                            //教育类型
                            String jylx_value = "";
                            EducationTypeLookup EducationTypeLookup = educationTuples[m].getSLART();
                            if(null != EducationTypeLookup) {
                                jylx_value = EducationTypeLookup.getDisplayValue();
                            }
                            //开始日期
                            String ksrq_value = "";
                            Calendar cal = educationTuples[m].getBEGDA();
                            if(null != cal) {
                                ksrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                            }
                            //结束日期
                            Calendar jsrq = educationTuples[m].getENDDA();
                            String jsrq_value = "";
                            if(null != jsrq) {
                                jsrq_value = new SimpleDateFormat("yyyy-MM-dd").format(jsrq.getTime());
                            }
                            //学习形式
                            String xxxs_value = "";
                            LearningFormLookup LearningFormLookup = educationTuples[m].getINSMO();
                            if(null != LearningFormLookup) {
                                xxxs_value = LearningFormLookup.getDisplayValue();
                            }
                            //学制（数值）
                            String zzsz_value = educationTuples[m].getANZKL();
                            //学制（单位）
                            String zzdw_value = "";
                            EducationSystemUnitLookup EducationSystemUnitLookup = educationTuples[m].getEINHT();
                            if(null != EducationSystemUnitLookup) {
                                zzdw_value = EducationSystemUnitLookup.getDisplayValue();
                            }
                            //毕业时间
                            String bysj_value = "";
                            Calendar bysj = educationTuples[m].getBYSJ();
                            if(null != bysj) {
                                bysj_value = new SimpleDateFormat("yyyy-MM-dd").format(bysj.getTime());
                            }
                            //毕业院校代码
                            String byyxdm_value = "";
                            SchoolLookup SchoolLookup = educationTuples[m].getYXMC();
                            if(null != SchoolLookup) {
                                byyxdm_value = SchoolLookup.getDisplayValue();
                            }
                            //毕业院校名称
                            String byyxmc = educationTuples[m].getYXMCQC();
                            //学校类型
                            String xxlx_value = "";
                            SchoolTypeLookup SchoolTypeLookup = educationTuples[m].getINSAT();
                            if(null != SchoolTypeLookup) {
                                xxlx_value = SchoolTypeLookup.getDisplayValue();
                            }
                            //学院（系）
                            String xyx_value = educationTuples[m].getZTYE_XYX();
                            //所学专业代码
                            String sxzydm_value = "";
                            MajorLookup MajorLookup = educationTuples[m].getSXZY();
                            if(null != MajorLookup) {
                                sxzydm_value = MajorLookup.getDisplayValue();
                            }
                            //所学专业名称 
                            String sxzymc = educationTuples[m].getZYMC();
                            //是否就业学历
                            boolean sfjyxl_value = educationTuples[m].getSFZGXL();
                            //是否最高学历
                            boolean sfzgxl_value = educationTuples[m].getACAQM();
                            ob.put("jylx_value", jylx_value);
                            ob.put("ksrq_value", ksrq_value);
                            ob.put("jsrq_value", jsrq_value);
                            ob.put("xxxs_value", xxxs_value);
                            ob.put("zzsz_value", zzsz_value);
                            ob.put("zzdw_value", zzdw_value);
                            ob.put("bysj_value", bysj_value);
                            ob.put("byyxdm_value", byyxdm_value);
                            ob.put("byyxmc", byyxmc);
                            ob.put("xxlx_value", xxlx_value);
                            ob.put("xyx_value", xyx_value);
                            ob.put("sxzydm_value", sxzydm_value);
                            ob.put("sxzymc", sxzymc);
                            ob.put("sfjyxl_value", sfjyxl_value);
                            ob.put("sfzgxl_value", sfzgxl_value);
                            array.add(ob);
                        }
                        jo.put("education", array);
                    }
                    LanguageCompetenceTuple[] languageCompetenceTuples = employee[i].getLanguage();
                    if(null != languageCompetenceTuples && languageCompetenceTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < languageCompetenceTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String yzmc_value = "";
                            LanguageLookup LanguageLookup = languageCompetenceTuples[j].getYZMC();
                            if(null != LanguageLookup) {
                                yzmc_value = LanguageLookup.getDisplayValue();
                            }
                            String spdj_value = "";
                            LanguageLevelLookup LanguageLevelLookup = languageCompetenceTuples[j].getSPDJ();
                            if(null != LanguageLevelLookup) {
                                spdj_value = LanguageLevelLookup.getDisplayValue();
                            }
                            ob.put("yzmc_value", yzmc_value);
                            ob.put("spdj_value", spdj_value);
                            array.add(ob);
                        }
                        jo.put("language", array);
                    }
                    //地址类型
                    String dzlx_value = "";
                    AddressTypeLookup AddressTypeLookup = employee[i].getANSSA();
                    if(null != AddressTypeLookup) {
                        dzlx_value = AddressTypeLookup.getDisplayValue();
                    }
                    //通讯地址
                    String txdz_value = employee[i].getLOCAT();
                    //邮编
                    String yb_value = employee[i].getPSTLZ();
                    ContactInfoTuple[] ContactInfoTuples = employee[i].getContact();
                    if(null != ContactInfoTuples && ContactInfoTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < ContactInfoTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String dhlx_value = "";
                            ContactTypeLookup ContactTypeLookup = ContactInfoTuples[j].getUSRTY();
                            if(null != ContactTypeLookup) {
                                dhlx_value = ContactTypeLookup.getDisplayValue();
                            }
                            String dh_value = ContactInfoTuples[j].getUSRID();
                            ob.put("dhlx_value", dhlx_value);
                            ob.put("dh_value", dh_value);
                            array.add(ob);
                        }
                        jo.put("contact", array);
                    }
                    PreviousEmployerTuple[] PreviousEmployerTuple = employee[i].getWorkExperience();
                    if(null != PreviousEmployerTuple && PreviousEmployerTuple.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < PreviousEmployerTuple.length; j++) {
                            JSONObject ob = new JSONObject();
                            Calendar ksrq = PreviousEmployerTuple[j].getBEGDA();
                            String ksrq_value = "";
                            if(null != ksrq) {
                                ksrq_value = new SimpleDateFormat("yyyy-MM-dd").format(ksrq.getTime());
                            }
                            Calendar jsrq = PreviousEmployerTuple[j].getENDDA();
                            String jsrq_value = "";
                            if(null != ksrq) {
                                jsrq_value = new SimpleDateFormat("yyyy-MM-dd").format(jsrq.getTime());
                            }
                            String gzdwmc_value = PreviousEmployerTuple[j].getVORAG();
                            String dwhybz_value = "";
                            IndustryLookup industryLookup = PreviousEmployerTuple[j].getBRSCH();
                            if(null != industryLookup) {
                                dwhybz_value = industryLookup.getDisplayValue();
                            }
                            String bm_value = PreviousEmployerTuple[j].getZTYE_BM();
                            String bz_value = PreviousEmployerTuple[j].getZTYE_BZXX();
                            String gw_value = PreviousEmployerTuple[j].getZTYE_GW();
                            ob.put("ksrq_value", ksrq_value);
                            ob.put("jsrq_value", jsrq_value);
                            ob.put("gzdwmc_value", gzdwmc_value);
                            ob.put("dwhybz_value", dwhybz_value);
                            ob.put("bm_value", bm_value);
                            ob.put("bz_value", bz_value);
                            ob.put("gw_value", gw_value);
                            array.add(ob);
                        }
                        jo.put("experience", array);
                    }
                    FamilyMemberTuple[] FamilyMemberTuples = employee[i].getFamilyMembers();
                    if(null != FamilyMemberTuples && FamilyMemberTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < FamilyMemberTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String jtcygx_value = "";
                            RelationshipLookup RelationshipLookup = FamilyMemberTuples[j].getFAMSA();
                            if(null != RelationshipLookup) {
                                jtcygx_value = RelationshipLookup.getDisplayValue();
                            }
                            String jtxm_value = FamilyMemberTuples[j].getPAD_NACHN();
                            String csrq_value = "";
                            Calendar csrq = FamilyMemberTuples[j].getGBDAT();
                            if(null != csrq) {
                                csrq_value = new SimpleDateFormat("yyyy-MM-dd").format(csrq.getTime());
                            }
                            String jtgj_value = "";
                            NationalityLookup NationalityLookup = FamilyMemberTuples[j].getFANAT();
                            if(null != NationalityLookup) {
                                jtgj_value = NationalityLookup.getDisplayValue();
                            }
                            ob.put("jtcygx_value", jtcygx_value);
                            ob.put("jtxm_value", jtxm_value);
                            ob.put("csrq_value", csrq_value);
                            ob.put("jtgj_value", jtgj_value);
                            array.add(ob);
                        }
                        jo.put("family", array);
                    }
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = employee[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = employee[i].getApplicant();
                    String sqrq_value = "";
                    Calendar sqrq = employee[i].getApplyDate();
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = employee[i].getApplyDate();
                    if(null != sqsj) {
                        sqsj.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = employee[i].getServiceRelationshipsTuple();
                    if(null != ServiceRelationshipsTupleTuples && ServiceRelationshipsTupleTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(int j = 0; j < ServiceRelationshipsTupleTuples.length; j++) {
                            JSONObject ob = new JSONObject();
                            String client_value = "";
                            ClientLookup ClientLookup = ServiceRelationshipsTupleTuples[j].getCLIENT_SYSTEM();
                            if(null != ClientLookup) {
                                client_value = ClientLookup.getDisplayValue();
                            }
                            String client_status = "";
                            DistributionStatusLookup DistributionStatusLookup = ServiceRelationshipsTupleTuples[j].getDISTUS();
                            if(null != DistributionStatusLookup) {
                                client_status = DistributionStatusLookup.getDisplayValue();
                            }
                            String message = ServiceRelationshipsTupleTuples[j].getRETURN();
                            ob.put("client_value", client_value);
                            ob.put("client_status", client_status);
                            ob.put("message", message);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    
                    String czbz_value = "";
                    OperationLookup OperationLookup = employee[i].getOperation();
                    if(null != OperationLookup) {
                        czbz_value = OperationLookup.getDisplayValue();
                    }
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+rybh_value+"')\">"+rybh_value+"</a>";
                    if(!"".equals("")){
                        jo.put("rybh", jjzxdm_val);
                    } else {
                        jo.put("rybh", rybh_value);
                    }
                    jo.put("applyNumber_value", applyNumber_value);
                    jo.put("rssj_value", rssj_value);
                    jo.put("czyy_value", czyy_value);
                    jo.put("rzsj_value", rzsj_value);
                    jo.put("xm_value", xm_value);
                    jo.put("xb_value", xb_value);
                    jo.put("csnyr_value", csnyr_value);
                    jo.put("gj_value", gj_value);
                    jo.put("hyzk_value", hyzk_value);
                    jo.put("lwgx_value", lwgx_value);
                    jo.put("ygz_value", ygz_value);
                    jo.put("ygzz_value", ygzz_value);
                    jo.put("rsfw_value", rsfw_value);
                    jo.put("rszfw_value", rszfw_value);
                    jo.put("gzhsfw_value", gzhsfw_value);
                    jo.put("zw_value", zw_value);
                    jo.put("zwms_value", zwms_value);
                    jo.put("fygj_value", fygj_value);
                    jo.put("zjlx_value", zjlx_value);
                    jo.put("sfzh_value", sfzh_value);
                    jo.put("jg_value", jg_value);
                    jo.put("mz_value", mz_value);
                    jo.put("dzlx_value", dzlx_value);
                    jo.put("txdz_value", txdz_value);
                    jo.put("yb_value", yb_value);
                    jo.put("spzt_value", spzt_value);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("czbz_value", czbz_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", employee.length);
                jsonresult.put("result", jsonArray);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
}
