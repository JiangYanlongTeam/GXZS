package weaver.interfaces.gx.jyl.gys;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCreate;
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
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.CreateConfigurationParameters;
import beans.ws.mdm.sap.com.ExecutionStatus;

/**
 * 供应商创建主数据接口
 * @author lvc
 */
public class GYSCreateAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private GYSPublicMethod publicmethod = new GYSPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("供应商退回操作，不执行接口.");
            return SUCCESS;
        }
        //申请单号-值
        String sqdh_value = "";
        //申请单号-字段
        String sqdh_column  = "sqdh";
        //账户组-值
        String zhz_value = "";
        //账户组-字段
        String zhz_column = "zhz";
        //称谓-值
        String 	cw_value = "";
        //称谓-字段
        String 	cw_column = "cw";
        //供应商简称-值
        String gysjc_value = "";
        //供应商简称-字段
        String gysjc_column = "gysjc";
        //供应商全称-值
        String 	gysmc_value = "";
        //供应商全称-字段
        String 	gysmc_column = "gysmc";
        //税号\统一社会信用代码-值
        String 	sh_value = "";
        //税号\统一社会信用代码-字段
        String 	sh_column = "sh";
        //工商登记证号-值
        String gsdjzh_value = "";
        //工商登记证号-字段
        String gsdjzh_column = "gsdjzh";
        //全国组织机构代码-值
        String qgzzjgdm_value = "";
        //全国组织机构代码-字段
        String qgzzjgdm_column = "qgzzjgdm";
        //注册资本-值
        String zczb_value = "";
        //注册资本-字段
        String zczb_column = "zczb";
        //国家-值
        String 	gj_value = "";
        //国家-字段
        String 	gj_column = "gj";
        //语种-值
        String yz_value = "";
        //语种-字段
        String yz_column = "yz";
        //地区-值
        String dq_value = "";
        //地区-字段
        String dq_column = "dq";
        //地区城市-值
        String dqcs_value = "";
        //地区城市-字段
        String dqcs_column = "dqcs";
        //街道/门牌号-值
        String jdmph_value = "";
        //街道/门牌号-字段
        String jdmph_column = "jdmph";
        //邮政编码-值
        String yzbm_value = "";
        //邮政编码-字段
        String yzbm_column = "yzbm";
        //电话号码-值
        String dhhm_value = "";
        //电话号码-字段
        String dhhm_column = "dhhm";
        //电话分机号-值
        String dhfjh_value = "";
        //电话分机号-字段
        String dhfjh_column = "dhfjh";
        //传真号-值
        String czh_value = "";
        //传真号-字段
        String czh_column = "czh";       
        //传真分机号-值
        String 	czfjh_value = "";
        //传真分机号-字段
        String 	czfjh_column = "czfjh";
        //电子邮件地址-值
        String dzyjdz_value = "";
        //电子邮件地址-字段
        String dzyjdz_column = "dzyjdz";
        //贸易伙伴-值
        String myhb_value = "";
        //贸易伙伴-字段
        String myhb_column = "myhb";
        //冻结标识-值
        String djbs_value = "";
        //冻结标识-字段
        String djbs_column = "djbs";
        //银行国家（子表）-值
        String yhgj_value = "";
        //银行国家（子表）-字段
        String yhgj_column = "yhgj";
        //银行码（子表）-值
        String yhm_value = "";
        //银行码（子表）-字段
        String yhm_column = "yhdm";
        //账户持有人（子表）-值
        String zhcyr_value = "";
        //账户持有人（子表）-字段
        String zhcyr_column = "zhcyr";
        //账户持有人（子表）-值
        String yhzh_value = "";
        //账户持有人（子表）-字段
        String yhzh_column = "yhzh";
        //审批状态代码-值
        String spzt_value = "";
        //审批状态代码-字段
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
            if (name.equals(sqdh_column)) {
            	sqdh_value = value;
            }
            if (name.equals(zhz_column)) {
            	zhz_value = value;
            }
            if (name.equals(cw_column)) {
            	cw_value = value;
            }
            if (name.equals(gysjc_column)) {
            	gysjc_value = value;
            }
            if (name.equals(gysmc_column)) {
            	gysmc_value = value;
            }
            if (name.equals(sh_column)) {
            	sh_value = value;
            }
            if (name.equals(gsdjzh_column)) {
            	gsdjzh_value = value;
            }
            if (name.equals(qgzzjgdm_column)) {
            	qgzzjgdm_value = value;
            }
            if (name.equals(zczb_column)) {
            	zczb_value = value;
            }
            if (name.equals(gj_column)) {
            	gj_value = value;
            }
            if (name.equals(yz_column)) {
            	yz_value = value;
            }
            if (name.equals(dq_column)) {
            	dq_value = value;
            }
            if (name.equals(dqcs_column)) {
            	dqcs_value = value;
            }
            if (name.equals(jdmph_column)) {
            	jdmph_value = value;
            }
            if (name.equals(yzbm_column)) {
            	yzbm_value = value;
            }
            if (name.equals(dhhm_column)) {
            	dhhm_value = value;
            }
            if (name.equals(dhfjh_column)) {
            	dhfjh_value = value;
            }
            if (name.equals(czh_column)) {
            	czh_value = value;
            }
            if (name.equals(czfjh_column)) {
            	czfjh_value = value;
            }
            if (name.equals(dzyjdz_column)) {
            	dzyjdz_value = value;
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
            if (name.equals(sqrq_column)) {
            	sqrq_value = value;
            }
            if (name.equals(sqsj_column)) {
            	sqsj_value = value;
            }
            if (name.equals(myhb_column)) {
                myhb_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
        }
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        CreateConfigurationParameters createConfigurationParameters = new CreateConfigurationParameters();
        VendorsCreate[] vendorsCreates = new VendorsCreate[1];
        VendorsCreate vendorsCreate = new VendorsCreate();
        DetailTable[] detailtable = request.getDetailTableInfo().getDetailTable();// 获取所有明细表
        DetailTable dt = detailtable[0];// 指定明细表 0表示明细表1
        Row[] s = dt.getRow();// 当前明细表的所有数据,按行存储
        BankAccountsTuple[] bankAccountsTuples = new BankAccountsTuple[s.length];
        for (int j = 0; j < s.length; j++) {
            Row r = s[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (yhgj_column.equals(name)) {
                    yhgj_value = value;
                }
                if (yhm_column.equals(name)) {
                    yhm_value = value;
                }
                if (zhcyr_column.equals(name)) {
                    zhcyr_value = value;
                }
                if (yhzh_column.equals(name)) {
                    yhzh_value = value;
                }
            }
            BankAccountsTuple bankAccountsTuple = new BankAccountsTuple();
            CountriesLookup countriesLookup = publicmethod.lookCountriesLookup(yhgj_value, proxy);
            if(null == countriesLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找银行国家："+yhgj_value+" 失败");
                return SUCCESS;
            }
            bankAccountsTuple.setBANKS(countriesLookup);
            BanksLookup banksLookup = publicmethod.lookBanksLookup(yhm_value, proxy);
            if(null == banksLookup) {
                PublicMethods.setFailedMessage(request, "failed", "查找银行码："+yhm_value+" 失败");
                return SUCCESS;
            }
            bankAccountsTuple.setBANKL(banksLookup);
            bankAccountsTuple.setKOINH(zhcyr_value);
            bankAccountsTuple.setBANKN(yhzh_value);
            bankAccountsTuples[j] = bankAccountsTuple;
        }
        
        
        writeLog("申请号："+sqdh_value);
        writeLog("账户组："+zhz_value);
        writeLog("称谓："+cw_value);
        writeLog("供应商简称："+gysjc_value);
        writeLog("供应商全称："+gysmc_value);
        writeLog("税号、统一社会信用代码："+sh_value);
        writeLog("工商登记证号："+gsdjzh_value);
        writeLog("全国组织机构代码："+qgzzjgdm_value);
        writeLog("注册资本："+zczb_value);
        writeLog("国家："+gj_value);
        writeLog("语种："+yz_value);
        writeLog("地区："+dq_value);
        writeLog("地区城市："+dqcs_value);
        writeLog("街道/门牌号："+jdmph_value);
        writeLog("邮政编码："+yzbm_value);
        writeLog("电话号码："+dhhm_value);
        writeLog("电话分机号："+dhfjh_value);
        writeLog("传真号："+czh_value);
        writeLog("传真分机号："+czfjh_value);
        writeLog("电子邮件地址："+dzyjdz_value);
        writeLog("冻结标识："+djbs_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("申请人："+sqr_value);
        writeLog("申请日期："+sqrq_value);
        writeLog("申请时间："+sqsj_value);
        writeLog("贸易伙伴："+myhb_value);
        writeLog("操作标识："+czbs_value);
        
        vendorsCreate.setApplyNumber(sqdh_value);
        VendorAccountGroupsLookup vendorAccountGroupsLookup = publicmethod.lookVendorAccountGroupsLookup(zhz_value, proxy);
        if(null == vendorAccountGroupsLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找账户组："+zhz_value+" 失败");
            return SUCCESS;
        }
        vendorsCreate.setKTOKK(vendorAccountGroupsLookup);
        TitlesLookup titlesLookup = publicmethod.lookTitlesLookup(cw_value, proxy);
        if(null == titlesLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找称谓："+cw_value+" 失败");
            return SUCCESS;
        }
        vendorsCreate.setANRED(titlesLookup);
        vendorsCreate.setSORT1(gysjc_value);
        vendorsCreate.setFULL_NAME(gysmc_value);
        vendorsCreate.setSTCEG(sh_value);
        vendorsCreate.setSTCD1(gsdjzh_value);
        vendorsCreate.setSTCD2(qgzzjgdm_value);
        vendorsCreate.setSTCD3(zczb_value);
        CountriesLookup countriesLookup = publicmethod.lookCountriesLookup(gj_value, proxy);
        if(null == countriesLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找国家："+gj_value+" 失败");
            return SUCCESS;
        }
        vendorsCreate.setLAND1(countriesLookup);
        LanguagesLookup languagesLookup = publicmethod.lookLanguagesLookup(yz_value, proxy);
        if(null == languagesLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找语种："+yz_value+" 失败");
            return SUCCESS;
        }
        vendorsCreate.setSPRAS(languagesLookup);
        RegionsLookup regionsLookup = publicmethod.lookRegionsLookup(dq_value, proxy);
        vendorsCreate.setREGIO(regionsLookup);
        vendorsCreate.setORT01(dqcs_value);
        vendorsCreate.setSTREET(jdmph_value);
        vendorsCreate.setPSTLZ(yzbm_value);
        vendorsCreate.setTEL_NUMBER(dhhm_value);
        vendorsCreate.setTEL_EXTENS(dhfjh_value);
        vendorsCreate.setFAX_NUMBER(czh_value);
        vendorsCreate.setFAX_EXTENS(czfjh_value);
        vendorsCreate.setSMTP_ADDR(dzyjdz_value);
        TradePartnersLookup tradePartnersLookup = publicmethod.lookTradePartnersLookup(myhb_value, proxy);
        if(null != tradePartnersLookup) {
            vendorsCreate.setVBUND(tradePartnersLookup);
        }
        vendorsCreate.setSPERM(false);
        vendorsCreate.setBankDetails(bankAccountsTuples);
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
        vendorsCreate.setApplicant(applicant_chinese_value);
        Calendar cal = Calendar.getInstance();
        sqrq_value = publicmethod.toyyyyMMdd(sqrq_value);
        try {
            cal.add(Calendar.HOUR_OF_DAY, +8);
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqrq_value+"000000"));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        vendorsCreate.setApplyDate(cal);
        Calendar cal1 = Calendar.getInstance();
        sqsj_value = publicmethod.toyyyyMMdd(sqrq_value,sqsj_value + ":00");
        try {
            cal1.add(Calendar.HOUR_OF_DAY, +8);
            cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqsj_value));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        vendorsCreate.setApplyTime(cal1);
        List<FFXTMode> list = PublicMethods.getFFXT(gsdm_value, "供应商");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
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
            executionStatus = proxy.createVendors(vendorsCreates, publicmethod.setReposInfo(), createConfigurationParameters);
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
    
    public static void main(String[] args) {
        GYSPublicMethod publicmethod = new GYSPublicMethod();
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        CreateConfigurationParameters createConfigurationParameters = new CreateConfigurationParameters();
        VendorsCreate[] vendorsCreates = new VendorsCreate[1];
        VendorsCreate vendorsCreate = new VendorsCreate();
        
        BankAccountsTuple[] bankAccountsTuples = new BankAccountsTuple[1];
        for (int j = 0; j < 1; j++) {
            BankAccountsTuple bankAccountsTuple = new BankAccountsTuple();
            CountriesLookup countriesLookup = publicmethod.lookCountriesLookup("CN", proxy);
            bankAccountsTuple.setBANKS(countriesLookup);
            BanksLookup banksLookup = publicmethod.lookBanksLookup("C001", proxy);
            bankAccountsTuple.setBANKL(banksLookup);
            bankAccountsTuple.setKOINH("12334567788900");
            bankAccountsTuple.setBANKN("12334567788900");
            bankAccountsTuples[j] = bankAccountsTuple;
        }
        
        vendorsCreate.setApplyNumber("aaaaaaaaabbb");
        VendorAccountGroupsLookup vendorAccountGroupsLookup = publicmethod.lookVendorAccountGroupsLookup("GX10", proxy);
        vendorsCreate.setKTOKK(vendorAccountGroupsLookup);
        TitlesLookup titlesLookup = publicmethod.lookTitlesLookup("0001", proxy);
        vendorsCreate.setANRED(titlesLookup);
        vendorsCreate.setSORT1("测试aaaaaaa");
        vendorsCreate.setFULL_NAME("测试aaaaaaaa");
        vendorsCreate.setSTCEG("测试");
        vendorsCreate.setSTCD1("测试");
        vendorsCreate.setSTCD2("测试");
        vendorsCreate.setSTCD3("测试");
        CountriesLookup countriesLookup = publicmethod.lookCountriesLookup("CN", proxy);
        vendorsCreate.setLAND1(countriesLookup);
        LanguagesLookup languagesLookup = publicmethod.lookLanguagesLookup("EN", proxy);
        vendorsCreate.setSPRAS(languagesLookup);
        RegionsLookup regionsLookup = publicmethod.lookRegionsLookup("010", proxy);
        vendorsCreate.setREGIO(regionsLookup);
        vendorsCreate.setORT01("测试");
        vendorsCreate.setSTREET("测试");
        vendorsCreate.setPSTLZ("测试");
        vendorsCreate.setTEL_NUMBER("测试");
        vendorsCreate.setTEL_EXTENS("测试");
        vendorsCreate.setFAX_NUMBER("测试");
        vendorsCreate.setFAX_EXTENS("测试");
        vendorsCreate.setSMTP_ADDR("测试");
        TradePartnersLookup tradePartnersLookup = publicmethod.lookTradePartnersLookup("1000", proxy);
        vendorsCreate.setVBUND(tradePartnersLookup);
        vendorsCreate.setSPERM(false);
        vendorsCreate.setBankDetails(bankAccountsTuples);
        ApprovalStatusLookup approvalStatusLookup = publicmethod.getAPCODCode("0", proxy);
        approvalStatusLookup.setDisplayValue("0");
        vendorsCreate.setAPCOD(approvalStatusLookup);
        vendorsCreate.setApplicant("14164");
        String sqrq_value = "2016-09-26";
        Calendar cal = Calendar.getInstance();
        sqrq_value = publicmethod.toyyyyMMdd(sqrq_value);
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqrq_value+"000000"));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        vendorsCreate.setApplyDate(cal);
        String sqsj_value = "23:59:00";
        sqsj_value = publicmethod.toyyyyMMdd(sqrq_value,sqsj_value);
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqsj_value));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        vendorsCreate.setApplyTime(cal);
        List<FFXTMode> list = new ArrayList<FFXTMode>();
        FFXTMode f1 = new FFXTMode();
        f1.setFfxtdm("ECC_NY");
        f1.setFfxtmc("SAP_能源");
        FFXTMode f2 = new FFXTMode();
        f2.setFfxtdm("MIS");
        f2.setFfxtmc("MIS");
        list.add(f1);
        list.add(f2);
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm, proxy);
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        vendorsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup operationLookup = publicmethod.lookOperation("11", proxy);
        vendorsCreate.setOperation(operationLookup);
        vendorsCreates[0] = vendorsCreate;
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.createVendors(vendorsCreates, publicmethod.setReposInfo(), createConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if(null != executionStatus && executionStatus.length > 0){
            String status = executionStatus[0].getStatus();
            if(!"OK".equalsIgnoreCase(status)){
            } else {
            }
        } else {
        }
    }
    
}
