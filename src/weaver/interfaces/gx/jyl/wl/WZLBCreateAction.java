package weaver.interfaces.gx.jyl.wl;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup;
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
import beans.ws.mdm.sap.com.CreateConfigurationParameters;
import beans.ws.mdm.sap.com.ExecutionStatus;

public class WZLBCreateAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethod = new PublicMethod();
    private WLPublicMethod publicmethod = new WLPublicMethod();
    
    public String execute(RequestInfo request) {
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("物料退回操作，不执行接口.");
            return SUCCESS;
        }
        //申请号-值
        String sqdh_value = "";
        //申请号-字段
        String sqdh_column = "sqdh";
        //物资组-值
        String wzz_value = "";
        //物资组-字段
        String wzz_column = "wzz";
        //基本计量单位-值
        String jbjldw_value = "";
        //基本计量单位-字段
        String jbjldw_column = "jbjldw";
        //物资描述-值
        String wzms_value = "";
        //物资描述-字段
        String wzms_column = "wzms";
        //特征描述-值
        String tzms_value = "";
        //特征描述-字段
        String tzms_column = "tzms";
        //行业领域-值
        String hyly_value = "";
        //行业领域-字段
        String hyly_column = "hyly";
        //物资类型-值
        String wzlx_value = "";
        //物资类型-字段
        String wzlx_column = "wzlx";
        //产品组-值
        String cpz_value = "";
        //产品组-字段
        String cpz_column = "cpz";
        //普通项目类别组-值
        String ptxmlbz_value = "";
        //普通项目类别组-字段
        String ptxmlbz_column = "ptxmlb";
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
            if (name.equals(wzz_column)) {
                wzz_value = value;
            }
            if (name.equals(jbjldw_column)) {
                jbjldw_value = value;
            }
            if (name.equals(wzms_column)) {
                wzms_value = value;
            }
            if (name.equals(tzms_column)) {
                tzms_value = value;
            }
            if (name.equals(hyly_column)) {
                hyly_value = value;
            }
            if (name.equals(wzlx_column)) {
                wzlx_value = value;
            }
            if (name.equals(cpz_column)) {
                cpz_value = value;
            }
            if (name.equals(ptxmlbz_column)) {
                ptxmlbz_value = value;
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
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
        }
        writeLog("申请号:"+sqdh_value);
        writeLog("物资组:"+wzz_value);
        writeLog("基本计量单位:"+jbjldw_value);
        writeLog("物资描述:"+wzms_value);
        writeLog("特征描述:"+tzms_value);
        writeLog("行业领域:"+hyly_value);
        writeLog("物资类型:"+wzlx_value);
        writeLog("产品组:"+cpz_value);
        writeLog("普通项目类别组:"+ptxmlbz_value);
        writeLog("审批状态代码:"+spzt_value);
        writeLog("申请人:"+sqr_value);
        writeLog("申请日期:"+sqrq_value);
        writeLog("申请时间:"+sqsj_value);
        writeLog("操作标识:"+czbs_value);
        writeLog("公司代码:"+gsdm_value);
        
        JSGX_MDM_MATERIALViProxy proxy = new JSGX_MDM_MATERIALViProxy();
        CreateConfigurationParameters CreateConfigurationParameters = new CreateConfigurationParameters();
        MaterialsCreate[] MaterialsCreates = new MaterialsCreate[1];
        MaterialsCreate MaterialsCreate = new MaterialsCreate();
        MaterialsCreate.setApplyNumber(sqdh_value);
        MATKL__Lookup MATKL__Lookup = publicmethod.lookMATKL__Lookup(wzz_value, proxy);
        if(null == MATKL__Lookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找物资组："+wzz_value + " 失败");
            return SUCCESS;
        } else {
            MaterialsCreate.setMATKL(MATKL__Lookup);
        }
        MEINS__Lookup MEINS__Lookup = publicmethod.lookMEINS__Lookup(jbjldw_value, proxy);
        if(null == MEINS__Lookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找基本计量单位："+jbjldw_value + " 失败");
            return SUCCESS;
        } else {
            MaterialsCreate.setMEINS(MEINS__Lookup);
        }
        MaterialsCreate.setMAKTX(wzms_value);
        MaterialsCreate.set_char(tzms_value);
        IndustrySectorLookup IndustrySectorLookup = publicmethod.lookIndustrySectorLookup(hyly_value, proxy);
        if(null == IndustrySectorLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找行业领域："+hyly_value + " 失败");
            return SUCCESS;
        } else {
            MaterialsCreate.setMBRSH(IndustrySectorLookup);
        }
        MaterialTypeLookup MaterialTypeLookup = publicmethod.lookMaterialTypeLookup(wzlx_value, proxy);
        if(null == MaterialTypeLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找物资类型："+wzlx_value + " 失败");
            return SUCCESS;
        } else {
            MaterialsCreate.setMTART(MaterialTypeLookup);
        }
        ProductGroupLookup ProductGroupLookup = publicmethod.lookProductGroupLookup(cpz_value, proxy);
        if(null == ProductGroupLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找产品组："+cpz_value + " 失败");
            return SUCCESS;
        } else {
            MaterialsCreate.setSPART(ProductGroupLookup);
        }
        MTPOS__Lookup MTPOS__Lookup = publicmethod.lookMTPOS__Lookup(ptxmlbz_value, proxy);
        if(null == MTPOS__Lookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找普通项目类别组："+ptxmlbz_value + " 失败");
            return SUCCESS;
        } else {
            MaterialsCreate.setMTPOS(MTPOS__Lookup);
        }
        MaterialsCreate.setLVOMA(false);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        MaterialsCreate.setApplicant(applicant_chinese_value);
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == ApprovalStatusLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找审批状态代码："+spzt_value + " 失败");
            return SUCCESS;
        } else {
            ApprovalStatusLookup.setDisplayValue("0");
            MaterialsCreate.setAPCOD(ApprovalStatusLookup);
        }
        Calendar cal = Calendar.getInstance();
        sqrq_value = publicmethod.toyyyyMMdd(sqrq_value);
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqrq_value + "000000"));
            cal.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        MaterialsCreate.setApplyDate(cal);
        sqsj_value = publicmethod.toyyyyMMdd(sqrq_value,sqsj_value+":00");
        Calendar cal1 = Calendar.getInstance();
        try {
            cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqsj_value));
            cal1.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        MaterialsCreate.setApplyTime(cal1);

        List<FFXTMode> list = PublicMethod.getFFXT(gsdm_value, "物料");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm, proxy);
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        MaterialsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup OperationLookup = publicmethod.lookOperation(czbs_value, proxy);
        MaterialsCreate.setOperation(OperationLookup);
        MaterialsCreates[0] = MaterialsCreate;
        ExecutionStatus[] ExecutionStatus = null;
        try {
            ExecutionStatus = proxy.createMaterials(MaterialsCreates, publicmethod.setReposInfo(), CreateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethod.setFailedMessage(request, "failed", "查询MDM失败");
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
    
    
    public static void main(String[] args) {
        JSGX_MDM_MATERIALViProxy proxy = new JSGX_MDM_MATERIALViProxy();
        WLPublicMethod publicmethod = new WLPublicMethod();
        MaterialsCreate[] MaterialsCreates = new MaterialsCreate[1];
        MaterialsCreate MaterialsCreate = new MaterialsCreate();
        MaterialsCreate.setApplyNumber("C12123112");
        MATKL__Lookup MATKL__Lookup = publicmethod.lookMATKL__Lookup("N110305", proxy);
        MaterialsCreate.setMATKL(MATKL__Lookup);
        MEINS__Lookup MEINS__Lookup = publicmethod.lookMEINS__Lookup("KG", proxy);
        MaterialsCreate.setMEINS(MEINS__Lookup);
        MaterialsCreate.setMAKTX("物资描述1");
        MaterialsCreate.set_char("miaoshu1");
        IndustrySectorLookup IndustrySectorLookup = publicmethod.lookIndustrySectorLookup("T", proxy);
        MaterialsCreate.setMBRSH(IndustrySectorLookup);
        MaterialTypeLookup MaterialTypeLookup = publicmethod.lookMaterialTypeLookup("ZM01", proxy);
        MaterialsCreate.setMTART(MaterialTypeLookup);
        ProductGroupLookup ProductGroupLookup = publicmethod.lookProductGroupLookup("00", proxy);
        MaterialsCreate.setSPART(ProductGroupLookup);
        MTPOS__Lookup MTPOS__Lookup = publicmethod.lookMTPOS__Lookup("NORM", proxy);
        MaterialsCreate.setMTPOS(MTPOS__Lookup);
        MaterialsCreate.setLVOMA(false);
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode("0", proxy);
        ApprovalStatusLookup.setDisplayValue("0");
        MaterialsCreate.setAPCOD(ApprovalStatusLookup);
        MaterialsCreate.setApplicant("14164");
        Calendar cal = Calendar.getInstance();
        String sqrq = "2016-09-30";
        String sqsj = "09:51";
        sqrq = publicmethod.toyyyyMMdd(sqrq);
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqrq + "000000"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        MaterialsCreate.setApplyDate(cal);
        sqsj = publicmethod.toyyyyMMdd(sqrq,sqsj+":00");
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(sqsj));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        MaterialsCreate.setApplyTime(cal);

        List<FFXTMode> list = new ArrayList<FFXTMode>();
        FFXTMode f1 = new FFXTMode();
        f1.setFfxtdm("ECC_NY");
        FFXTMode f2 = new FFXTMode();
        f2.setFfxtdm("MIS");
        FFXTMode f3 = new FFXTMode();
        f3.setFfxtdm("ECC_DC");
        FFXTMode f4 = new FFXTMode();
        f4.setFfxtdm("MINGYUAN");
        FFXTMode f5 = new FFXTMode();
        f5.setFfxtdm("ECC_MY");
        FFXTMode f6 = new FFXTMode();
        f6.setFfxtdm("NANBEI");
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm, proxy);
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        MaterialsCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup OperationLookup = publicmethod.lookOperation("11", proxy);
        MaterialsCreate.setOperation(OperationLookup);
        MaterialsCreates[0] = MaterialsCreate;
        CreateConfigurationParameters CreateConfigurationParameters = new CreateConfigurationParameters();
        ExecutionStatus[] ExecutionStatus = null;
        try {
            ExecutionStatus = proxy.createMaterials(MaterialsCreates, publicmethod.setReposInfo(), CreateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if(null != ExecutionStatus) {
           String status = ExecutionStatus[0].getStatus();
           if(!"OK".equalsIgnoreCase(status)) {
               System.out.println(ExecutionStatus[0].getFault()[0].getText());
           }
           System.out.println(status);
        }
    }
}
