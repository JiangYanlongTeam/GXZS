package weaver.interfaces.gx.jyl.yh;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUpdate;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup;
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
 * 银行修改主数据接口
 * @author lvc
 */
public class YHModifyAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private YHPublicMethod publicmethod = new YHPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("银行退回操作，不执行接口.");
            return SUCCESS;
        }
        //银行国家（子表）-值
        String yhgj_value = "";
        //银行国家（子表）-字段
        String yhgj_column = "gj";
        //银行码（子表）-值
        String yhm_value = "";
        //银行码（子表）-字段
        String yhm_column = "yhdm";
        //银行名称-值
        String yhmc_value = "";
        //银行名称-字段
        String yhmc_column = "yhmc";
        //地区-值
        String dq_value = "";
        //地区-字段
        String dq_column = "dq";
        //街道-值
        String jd_value = "";
        //街道-字段
        String jd_column = "jd";
        //城市-值
        String chengshi_value = "";
        //城市-字段
        String chengshi_column = "cs";
        //分行-值
        String fenhang_value = "";
        //分行-字段
        String fenhang_column = "fh";
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
            if (name.equals(yhgj_column)) {
                yhgj_value = value;
            }
            if (name.equals(yhm_column)) {
                yhm_value = value;
            }
            if (name.equals(yhmc_column)) {
                yhmc_value = value;
            }
            if (name.equals(dq_column)) {
            	dq_value = value;
            }
            if (name.equals(jd_column)) {
                jd_value = value;
            }
            if (name.equals(chengshi_column)) {
                chengshi_value = value;
            }
            if (name.equals(fenhang_column)) {
                fenhang_value = value;
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
        
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        UpdateConfigurationParameters createConfigurationParameters = new UpdateConfigurationParameters();
        BanksUpdate[] banksCreates = new BanksUpdate[1];
        BanksUpdate banksCreate = new BanksUpdate();
        writeLog("银行国家："+yhgj_value);
        writeLog("银行码 ："+yhm_value);
        writeLog("银行名称："+yhmc_value);
        writeLog("地区："+dq_value);
        writeLog("街道："+jd_value);
        writeLog("城市："+chengshi_value);
        writeLog("分行："+fenhang_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("申请人："+sqr_value);
        writeLog("操作标识："+czbs_value);
        writeLog("公司代码："+gsdm_value);
        BanksQuery banksQuery = new BanksQuery();
        BanksCriteria banksCriteria = new BanksCriteria();
        banksCriteria.setBANKL(publicmethod.setTextCriteria(yhm_value));
        banksQuery.setCriteria(banksCriteria);
        BanksResultSet BanksResultSet = null;
        try {
            BanksResultSet = proxy.searchBanks(banksQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        if(null != BanksResultSet && BanksResultSet.getBanks().length > 0) {
            banksCreate.setRecordIdentification(BanksResultSet.getBanks()[0].getRecordIdentification());
        } else {
            PublicMethods.setFailedMessage(request, "failed", "查找银行代码："+yhm_value+" 内部码失败");
            return SUCCESS;
        }
        banksCreate.setBANKL(yhm_value);
        CountriesLookup countriesLookup = publicmethod.lookCountriesLookup(yhgj_value, proxy);
        if(null == countriesLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找银行国家："+yhgj_value+" 失败");
            return SUCCESS;
        }
        banksCreate.setBANKS(countriesLookup);
        banksCreate.setBANKA(yhmc_value);
        RegionsLookup regionsLookup = publicmethod.lookRegionsLookup(dq_value, proxy);
        if(null == regionsLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找地区："+dq_value+" 失败");
            return SUCCESS;
        }
        banksCreate.setPROVZ(regionsLookup);
        banksCreate.setSTRAS(jd_value);
        banksCreate.setORT01(chengshi_value);
        banksCreate.setBRNCH(fenhang_value);
        ApprovalStatusLookup approvalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == approvalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查找审批状态代码："+spzt_value+" 失败");
            return SUCCESS;
        }
        banksCreate.setAPCOD(approvalStatusLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        banksCreate.setUpdateBy(applicant_chinese_value);
        
        List<FFXTMode> list = PublicMethods.getFFXT(gsdm_value, "银行");
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
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = BanksResultSet.getBanks()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                String clientsytem = "";
                ClientSystemsLookup ClientSystemsLookup = service.getCLIENT_SYSTEM();
                if(null != ClientSystemsLookup) {
                    clientsytem = ClientSystemsLookup.getDisplayValue();
                    if(clientsytem.equals(ffxtdm)) {
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        banksCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup operationLookup = publicmethod.lookOperation(czbs_value, proxy);
        if(null == operationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询操作标识："+czbs_value+" 失败");
            return SUCCESS;
        }
        banksCreate.setOperation(operationLookup);
        banksCreates[0] = banksCreate;
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.updateBanks(banksCreates, publicmethod.setReposInfo(), createConfigurationParameters);
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
        YHPublicMethod publicmethod = new YHPublicMethod();
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        UpdateConfigurationParameters createConfigurationParameters = new UpdateConfigurationParameters();
        BanksUpdate[] banksCreates = new BanksUpdate[1];
        BanksUpdate banksCreate = new BanksUpdate();
        BanksQuery banksQuery = new BanksQuery();
        BanksCriteria banksCriteria = new BanksCriteria();
        banksCriteria.setBANKL(publicmethod.setTextCriteria("MM"));
        banksQuery.setCriteria(banksCriteria);
        BanksResultSet BanksResultSet = null;
        try {
            BanksResultSet = proxy.searchBanks(banksQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        if(null != BanksResultSet && BanksResultSet.getBanks().length > 0) {
            banksCreate.setRecordIdentification(BanksResultSet.getBanks()[0].getRecordIdentification());
        }
        banksCreate.setBANKL("MM");
        CountriesLookup countriesLookup = publicmethod.lookCountriesLookup("CN", proxy);
        banksCreate.setBANKS(countriesLookup);
        banksCreate.setBANKA("MM-修改");
        RegionsLookup regionsLookup = publicmethod.lookRegionsLookup("010", proxy);
        banksCreate.setPROVZ(regionsLookup);
        banksCreate.setSTRAS("修改");
        banksCreate.setORT01("修改");
        banksCreate.setBRNCH("修改");
        ApprovalStatusLookup approvalStatusLookup = publicmethod.getAPCODCode("0", proxy);
        banksCreate.setAPCOD(approvalStatusLookup);
        banksCreate.setUpdateBy("14646");
        
        List<FFXTMode> list = new ArrayList<FFXTMode>();
        FFXTMode f1 = new FFXTMode();
        f1.setFfxtdm("ECC_NY");
        f1.setFfxtmc("SAP_能源");
        list.add(f1);
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm, proxy);
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        banksCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup operationLookup = publicmethod.lookOperation("11", proxy);
        banksCreate.setOperation(operationLookup);
        banksCreates[0] = banksCreate;
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.updateBanks(banksCreates, publicmethod.setReposInfo(), createConfigurationParameters);
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
