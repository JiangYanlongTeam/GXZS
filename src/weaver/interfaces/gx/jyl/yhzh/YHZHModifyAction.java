package weaver.interfaces.gx.jyl.yhzh;

import java.rmi.RemoteException;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUpdate;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
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
 * 银行账号修改主数据接口
 * @author lvc
 */
public class YHZHModifyAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private YHZHPublicMethod publicmethod = new YHZHPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("银行账户退回操作，不执行接口.");
            return SUCCESS;
        }
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm1";
        //开户行-值
        String khh_value = "";
        //开户行-字段
        String khh_column = "khh";
        //银行国家-值
        String yhgj_value = "";
        //银行国家-字段
        String yhgj_column = "yhgj";
        //银行代码-值
        String yhdm_value = "";
        //银行代码-字段
        String yhdm_column = "yhdm";
        //账户标识-值
        String zhbs_value = "";
        //账户标识-字段
        String zhbs_column = "zhbs";
        //描述-值
        String ms_value = "";
        //描述-字段
        String ms_column = "ms";
        //银行账户号码-值
        String yhzhhm_value = "";
        //银行账户号码-字段
        String yhzhhm_column = "yhzhhm";
        //币种-值
        String bz_value = "";
        //币种-字段
        String bz_column = "bz";
        //人事范围-值
        String rsfw_value = "";
        //人事范围-字段
        String rsfw_column = "gsdm";
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
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(khh_column)) {
                khh_value = value;
            }
            if (name.equals(yhgj_column)) {
                yhgj_value = value;
            }
            if (name.equals(yhdm_column)) {
                yhdm_value = value;
            }
            if (name.equals(zhbs_column)) {
                zhbs_value = value;
            }
            if (name.equals(ms_column)) {
                ms_value = value;
            }
            if (name.equals(yhzhhm_column)) {
                yhzhhm_value = value;
            }
            if (name.equals(yhzhhm_column)) {
                yhzhhm_value = value;
            }
            if (name.equals(bz_column)) {
                bz_value = value;
            }
            if (name.equals(sqr_column)) {
                sqr_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
            if (name.equals(rsfw_column)) {
                rsfw_value = value;
            }
        }
        writeLog("公司代码："+gsdm_value);
        writeLog("开户行："+khh_value);
        writeLog("银行国家 ："+yhgj_value);
        writeLog("银行代码 ："+yhdm_value);
        writeLog("账户标识："+zhbs_value);
        writeLog("描述："+ms_value);
        writeLog("银行账户号码："+yhzhhm_value);
        writeLog("币种："+bz_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("申请人："+sqr_value);
        writeLog("操作标识："+czbs_value);
        writeLog("人事范围："+rsfw_value);
        
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        
        UpdateConfigurationParameters UpdateConfigurationParameters = new UpdateConfigurationParameters();
        BankAccountUpdate[] BankAccountUpdates = new BankAccountUpdate[1];
        BankAccountUpdate BankAccountUpdate = new BankAccountUpdate();
        
        BankAccountQuery BankAccountQuery  = new BankAccountQuery();
        BankAccountCriteria BankAccountCriteria = new BankAccountCriteria();
        BankAccountCriteria.setBANKN(publicmethod.setTextCriteria(yhzhhm_value));
        BankAccountQuery.setCriteria(BankAccountCriteria);
        BankAccountResultSet BankAccountResultSet = null;
        try {
            BankAccountResultSet = proxy.searchBankAccount(BankAccountQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
            PublicMethods.setFailedMessage(request, "failed", "查询银行账号："+yhzhhm_value +" 失败");
            return SUCCESS;
        }
        if(null != BankAccountResultSet) {
            BankAccount[] BankAccounts = BankAccountResultSet.getBankAccount();
            if(null != BankAccounts && BankAccounts.length > 0) {
                BankAccountID BankAccountID = new BankAccountID();
                BankAccountID.setInternalID(BankAccounts[0].getRecordIdentification().getInternalID());
                BankAccountUpdate.setRecordIdentification(BankAccountID);
            } else {
                PublicMethods.setFailedMessage(request, "failed", "查询银行账号："+yhzhhm_value +" 失败");
                return SUCCESS;
            }
        }
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode(spzt_value, proxy);
        if(null == ApprovalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取审批状态代码："+spzt_value +" 失败");
            return SUCCESS;
        } else {
            ApprovalStatusLookup.setDisplayValue(spzt_value);
            BankAccountUpdate.setAPCOD(ApprovalStatusLookup);
        }
        TradePartnersLookup TradePartnersLookup = publicmethod.lookTradePartnersLookup(gsdm_value, proxy);
        if(null == TradePartnersLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取公司代码："+gsdm_value +" 失败");
            return SUCCESS;
        } else {
            BankAccountUpdate.setBUKRS(TradePartnersLookup);
        }
        BankAccountUpdate.setHBKID(khh_value);
        CountriesLookup CountriesLookup = publicmethod.lookCountriesLookup(yhgj_value, proxy);
        if(null == CountriesLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取银行国家："+yhgj_value +" 失败");
            return SUCCESS;
        } else {
            BankAccountUpdate.setBANKS(CountriesLookup);
        }
        BanksLookup BanksLookup = publicmethod.lookBanksLookup(yhdm_value, proxy);
        if(null == BanksLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取银行代码："+yhdm_value +" 失败");
            return SUCCESS;
        } else {
            BankAccountUpdate.setBANKL(BanksLookup);
        }
        BankAccountUpdate.setHKTID(zhbs_value);
        BankAccountUpdate.setTEXT1(ms_value);
        BankAccountUpdate.setBANKN(yhzhhm_value);
        CurrencyLookup CurrencyLookup = publicmethod.lookCurrencyLookup(bz_value, proxy);
        if(null == CurrencyLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取币种："+bz_value +" 失败");
            return SUCCESS;
        } else {
            BankAccountUpdate.setWAERS(CurrencyLookup);
        }
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(sqr_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            new weaver.general.BaseBean().writeLog("查询申请人："+sqr_value+"失败。不存在该人员编号。");
        }
        BankAccountUpdate.setUpdateBy(applicant_chinese_value);
        
        List<FFXTMode> list = PublicMethods.getFFXT(rsfw_value, "银行账户");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm, proxy);
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = BankAccountResultSet.getBankAccount()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service :ServiceRelationshipsTupleTuples) {
                String clientsystem = "";
                ClientSystemsLookup ClientSystemsLookup = service.getCLIENT_SYSTEM();
                if(null != ClientSystemsLookup) {
                    clientsystem = ClientSystemsLookup.getDisplayValue();
                    if(clientsystem.equals(ffxtdm)) {
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        BankAccountUpdate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup OperationLookup = publicmethod.lookOperation(czbs_value, proxy);
        if(null == OperationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "获取操作标识："+czbs_value +" 失败");
            return SUCCESS;
        } else {
            BankAccountUpdate.setOperation(OperationLookup);
        }
        BankAccountUpdates[0] = BankAccountUpdate;
        ExecutionStatus[] ExecutionStatus = null;
        try {
            ExecutionStatus = proxy.updateBankAccount(BankAccountUpdates, publicmethod.setReposInfo(), UpdateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethods.setFailedMessage(request, "failed", "修改银行账户失败，连接MDM失败。");
            return SUCCESS;
        }
        if(null != ExecutionStatus && ExecutionStatus.length > 0) {
            String status = ExecutionStatus[0].getStatus();
            String messge = ExecutionStatus[0].getDescription();
            if(!"OK".equalsIgnoreCase(status)){
                PublicMethods.setFailedMessage(request, "failed", ExecutionStatus[0].getFault()[0].getText());
                return SUCCESS;
            } else {
                publicmethod.updateReturnMsg(status, messge, requestid);
            }
        } else {
            PublicMethods.setFailedMessage(request, "failed", "修改银行账户失败，连接MDM失败。");
        }
        return SUCCESS;
    }
}
