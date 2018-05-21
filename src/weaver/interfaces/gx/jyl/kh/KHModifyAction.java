package weaver.interfaces.gx.jyl.kh;

import java.rmi.RemoteException;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
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
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 客户修改
 */
public class KHModifyAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethod = new PublicMethod();
    
    private KHPublicMethod KHPublicMethods = new KHPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("客户退回操作，不执行接口.");
            return SUCCESS;
        }
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //客户编号-值
        String khbh_value = "";
        //客户编号-字段
        String khbh_column = "khbh";
        //称谓-值
        String anred_value = "";
        //称谓-字段
        String anred_column = "cw";
        //客户简称-值
        String name_value = "";
        //客户简称-字段
        String name_column = "khjc";
        //客户全称-值
        String khqc_value = "";
        //客户全称-字段
        String khqc_column = "khmc";
        //客户类型-值
        String khlx_value = "";
        //客户类型-字段
        String khlx_column = "khlx";
        //税号\统一社会信用代码-值
        String stceg_value = "";
        //税号\统一社会信用代码-字段
        String stceg_column = "sh";
        //工商登记证号-值
        String stcd1_value = "";
        //工商登记证号-字段
        String stcd1_column = "gsdjzh";
        //全国组织机构代码-值
        String stcd5_value = "";
        //全国组织机构代码-字段
        String stcd5_column = "qgzzjgdm";
        //关键词1-值
        String sort1_value = "";
        //关键词1-字段
        String sort1_column = "gjc1";
        //关键词2-值
        String sort2_value = "";
        //关键词2-字段
        String sort2_column = "gjc2";
        //语种-值
        String spras_value = "";
        //语种-字段
        String spras_column = "yz";
        //国家-值
        String land1_value = "";
        //国家-字段
        String land1_column = "gj";
        //地区-值
        String regio_value = "";
        //地区-字段
        String regio_column = "dq";
        //地区城市-值
        String ort01_value = "";
        //地区城市-字段
        String ort01_column = "dqcs";
        //街道/门牌号-值
        String street_value = "";
        //街道/门牌号-字段
        String street_column = "jdmph";
        //邮政编码-值
        String pstlz_value = "";
        //邮政编码-字段
        String pstlz_column = "yzbm";
        //电话号码-值
        String telnumber_value = "";
        //电话号码-字段
        String telnumber_column = "dhhm";
        //电话分机号-值
        String telextens_value = "";
        //电话分机号-字段
        String telextens_column = "dhfjh";
        //传真号-值
        String faxnumber_value = "";
        //传真号-字段
        String faxnumber_column = "czh";
        //传真分机号-值
        String faxextens_value = "";
        //传真分机号-字段
        String faxextens_column = "czfjh";
        //电子邮件地址-值
        String smtpaddr_value = "";
        //电子邮件地址-字段
        String smtpaddr_column = "dzyjdz";
        //贸易伙伴-值
        String vbnud_value = "";
        //贸易伙伴-字段
        String vbnud_column = "myhb";
        //供应商编号-值
        String lifnr_value = "";
        //供应商编号-字段
        String lifnr_column = "gysbh";
        //纳税人资格-值
        String stkzu_value = "";
        //纳税人资格-字段
        String stkzu_column = "nsrzg";
        //操作标识-值
        String operation_value = "";
        //操作标识-字段
        String operation_column = "czbs";
        //银行国家-值
        String banks_value = "";
        //银行国家-字段
        String banks_column = "yhgj";
        //银行码-值
        String bankl_value = "";
        //银行码-字段
        String bankl_column = "yhdm";
        //账户持有人-值
        String koinh_value = "";
        //账户持有人-字段
        String koinh_column = "zhcyr";
        //银行账号-值
        String bankn_value = "";
        //银行账号-字段
        String bankn_column = "yhzh";
        //申请人-值
        String applicant_value = "";
        //申请人-字段
        String applicant_column = "sqr";
        
        
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(khbh_column)) {
                khbh_value = value;
            }
            if (name.equals(anred_column)) {
                anred_value = value;
            }
            if (name.equals(name_column)) {
                name_value = value;
            }
            if (name.equals(khqc_column)) {
                khqc_value = value;
            }
            if (name.equals(khlx_column)) {
                khlx_value = value;
            }
            if (name.equals(stceg_column)) {
                stceg_value = value;
            }
            if (name.equals(stcd1_column)) {
                stcd1_value = value;
            }
            if (name.equals(stcd5_column)) {
                stcd5_value = value;
            }
            if (name.equals(sort1_column)) {
                sort1_value = value;
            }
            if (name.equals(sort2_column)) {
                sort2_value = value;
            }
            if (name.equals(spras_column)) {
                spras_value = value;
            }
            if (name.equals(land1_column)) {
                land1_value = value;
            }
            if (name.equals(regio_column)) {
                regio_value = value;
            }
            if (name.equals(ort01_column)) {
                ort01_value = value;
            }
            if (name.equals(street_column)) {
                street_value = value;
            }
            if (name.equals(pstlz_column)) {
                pstlz_value = value;
            }
            if (name.equals(telnumber_column)) {
                telnumber_value = value;
            }
            if (name.equals(telextens_column)) {
                telextens_value = value;
            }
            if (name.equals(faxnumber_column)) {
                faxnumber_value = value;
            }
            if (name.equals(faxextens_column)) {
                faxextens_value = value;
            }
            if (name.equals(smtpaddr_column)) {
                smtpaddr_value = value;
            }
            if (name.equals(vbnud_column)) {
                vbnud_value = value;
            }
            if (name.equals(lifnr_column)) {
                lifnr_value = value;
            }
            if (name.equals(stkzu_column)) {
                stkzu_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
            if (name.equals(operation_column)) {
                operation_value = value;
            }
        }
        
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        CustomersUpdate customersUpdate = new CustomersUpdate();
        CustomersQuery customersQuery = new CustomersQuery();
        CustomersCriteria customersCriteria = new CustomersCriteria();
        customersCriteria.setKUNNR(KHPublicMethods.setTextCriteria(khbh_value));
        customersQuery.setCriteria(customersCriteria);
        CustomersResultSet customersRes = null;
        try {
            customersRes = proxy.searchCustomers(customersQuery, KHPublicMethods.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
            PublicMethod.setFailedMessage(request, "failed", "查找"+khbh_value+"失败.");
            return SUCCESS;
        }
        if(null != customersRes && customersRes.getCustomers().length > 0) {
            customersUpdate.setRecordIdentification(customersRes.getCustomers()[0].getRecordIdentification());
        }
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
                if (banks_column.equals(name)) {
                    banks_value = value;
                }
                if (bankl_column.equals(name)) {
                    bankl_value = value;
                }
                if (koinh_column.equals(name)) {
                    koinh_value = value;
                }
                if (bankn_column.equals(name)) {
                    bankn_value = value;
                }
            }
            BankAccountsTuple bankAccountsTuple = new BankAccountsTuple();
            CountriesLookup countriesLookup = KHPublicMethods.lookCountriesLookup(banks_value, proxy);
            if(null == countriesLookup) {
                PublicMethod.setFailedMessage(request, "failed", "查找银行国家："+banks_value+" 失败");
                return SUCCESS;
            }
            bankAccountsTuple.setBANKS(countriesLookup);
            BanksLookup banksLookup = KHPublicMethods.lookBanksLookup(bankl_value, proxy);
            if(null == banksLookup) {
                PublicMethod.setFailedMessage(request, "failed", "查找银行码："+bankl_value+" 失败");
                return SUCCESS;
            }
            bankAccountsTuple.setBANKL(banksLookup);
            bankAccountsTuple.setKOINH(koinh_value);
            bankAccountsTuple.setBANKN(bankn_value);
            BankAccountsTuple[] BankAccountsTuples = customersRes.getCustomers()[0].getBankDetails();
            if(null != BankAccountsTuples) {
                for(BankAccountsTuple bank : BankAccountsTuples) {
                    String bankl = "";
                    BanksLookup BanksLookup = bank.getBANKL();
                    if(null != BanksLookup) {
                        bankl = BanksLookup.getDisplayValue();
                    }
                    String bankn = bank.getBANKN();
                    String banks = "";
                    CountriesLookup CountriesLookup = bank.getBANKS();
                    if(null != CountriesLookup) {
                        banks = CountriesLookup.getDisplayValue();
                    }
                    if(banks_value.equals(banks) && bankl_value.equals(bankl) && bankn_value.equals(bankn)) {
                        bankAccountsTuple.setTupleValueId(bank.getTupleValueId());
                    }
                }
            }
            bankAccountsTuples[j] = bankAccountsTuple;
        }
        writeLog("公司代码：" + gsdm_value);
        writeLog("客户编码："+khbh_value);
        writeLog("称谓：" + anred_value);
        writeLog("客户简称：" + name_value);
        writeLog("客户全称：" + khqc_value);
        writeLog("客户类型：" + khlx_value);
        writeLog("税号\\统一社会信用代码-值：" + stceg_value);
        writeLog("工商登记证号：" + stcd1_value);
        writeLog("全国组织机构代码：" + stcd5_value);
        writeLog("关键词1：" + sort1_value);
        writeLog("关键词2：" + sort2_value);
        writeLog("语种：" + spras_value);
        writeLog("国家：" + land1_value);
        writeLog("地区：" + regio_value);
        writeLog("地区城市：" + ort01_value);
        writeLog("街道/门牌号：" + street_value);
        writeLog("邮政编码：" + pstlz_value);
        writeLog("电话号码：" + telnumber_value);
        writeLog("电话分机号：" + telextens_value);
        writeLog("传真号：" + faxnumber_value);
        writeLog("传真分机号：" + faxextens_value);
        writeLog("电子邮件地址：" + smtpaddr_value);
        writeLog("贸易伙伴：" + vbnud_value);
        writeLog("供应商编号：" + lifnr_value);
        writeLog("纳税人资格：" + stkzu_value);
        writeLog("银行国家：" + banks_value);
        writeLog("银行码：" + bankl_value);
        writeLog("账户持有人：" + koinh_value);
        writeLog("银行账号：" + bankn_value);
        writeLog("审批状态：0");
        writeLog("申请人：" + applicant_value);
        writeLog("操作标识：" + operation_value);
        
        CustomersUpdate[] customersUpdates = new CustomersUpdate[1];
        
        
        customersUpdate.setKUNNR(khbh_value);
        TitlesLookup titlesLookup = KHPublicMethods.lookTitlesLookup(anred_value, proxy);
        if(null == titlesLookup) {
            PublicMethod.setFailedMessage(request, "查找称谓失败", "查找称谓失败.");
            return SUCCESS;
        }
        customersUpdate.setANRED(titlesLookup);
        customersUpdate.setNAME1(name_value);
        customersUpdate.setFULL_NAME(khqc_value);
        CustomerTypeLookup customerTypeLookup = KHPublicMethods.lookCustomerTypeLookup(khlx_value, proxy);
        if(null == customerTypeLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找客户类型失败.");
            return SUCCESS;
        }
        customersUpdate.setKUKLA(customerTypeLookup);
        customersUpdate.setSTCEG(stceg_value);
        customersUpdate.setSTCD1(stcd1_value);
        customersUpdate.setSTCD5(stcd5_value);
        customersUpdate.setSORT1(sort1_value);
        customersUpdate.setSORT2(sort2_value);
        LanguagesLookup languagesLookup = KHPublicMethods.lookLanguagesLookup(spras_value, proxy);
        if(null == languagesLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找语种失败.");
            return SUCCESS;
        }
        customersUpdate.setSPRAS(languagesLookup);
        CountriesLookup countriesLookup = KHPublicMethods.lookCountriesLookup(land1_value, proxy);
        if(null == countriesLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找国家失败.");
            return SUCCESS;
        }
        customersUpdate.setLAND1(countriesLookup);
        RegionsLookup regionsLookup = KHPublicMethods.lookRegionsLookup(regio_value, proxy);
        customersUpdate.setREGIO(regionsLookup);
        customersUpdate.setORT01(ort01_value);
        customersUpdate.setSTREET(street_value);
        customersUpdate.setPSTLZ(pstlz_value);
        customersUpdate.setTEL_NUMBER(telnumber_value);
        customersUpdate.setTEL_EXTENS(telextens_value);
        customersUpdate.setFAX_NUMBER(faxnumber_value);
        customersUpdate.setFAX_EXTENS(faxextens_value);
        customersUpdate.setSMTP_ADDR(smtpaddr_value);
        TradePartnersLookup tradePartnersLookup = KHPublicMethods.lookTradePartnersLookup(vbnud_value, proxy);
        if(null != tradePartnersLookup) {
        	customersUpdate.setVBUND(tradePartnersLookup);
        }
        customersUpdate.setLIFNR(lifnr_value);
        if("0".equals(stkzu_value)){
            customersUpdate.setSTKZU(true);
        } else {
            customersUpdate.setSTKZU(false);
        }
        customersUpdate.setBankDetails(bankAccountsTuples);
        ApprovalStatusLookup approvalStatusLookup = KHPublicMethods.getAPCODCode("0", proxy);
        if(null == approvalStatusLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找审批状态：0 失败");
            return SUCCESS;
        }
        approvalStatusLookup.setDisplayValue("0");
        customersUpdate.setAPCOD(approvalStatusLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        customersUpdate.setApplicant(applicant_chinese_value);
        List<FFXTMode> list = PublicMethod.getFFXT(gsdm_value, "客户");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KHPublicMethods.getFFXTDM(ffxtdm, proxy);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethod.setFailedMessage(request, "failed", "查询分发系统代码内部码："+ffxtdm+" 失败");
                return SUCCESS;
            }
            DistributionStatusLookup distributionStatusLookup = KHPublicMethods.getFFZT("0", proxy);
            if(null == distributionStatusLookup) {
                PublicMethod.setFailedMessage(request, "failed", "查询分发状态代码：0 失败");
                return SUCCESS;
            }
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = customersRes.getCustomers()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
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
        customersUpdate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup operationLookup = KHPublicMethods.lookOperation(operation_value, proxy);
        if(null == operationLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查询操作标识："+operation_value+" 失败");
            return SUCCESS;
        }
        customersUpdate.setOperation(operationLookup);
        customersUpdates[0] = customersUpdate;
        UpdateConfigurationParameters updateConfigurationParameters = new UpdateConfigurationParameters();
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.updateCustomers(customersUpdates, KHPublicMethods.setReposInfo(), updateConfigurationParameters);
            if(null != executionStatus && executionStatus.length > 0) {
               String status = executionStatus[0].getStatus();
               String description = executionStatus[0].getDescription();
               if(!"OK".equalsIgnoreCase(status)){
                   PublicMethod.setFailedMessage(request, "failed", "连接MDM接口失败:"+executionStatus[0].getFault()[0].getText());
               } else {
                   KHPublicMethods.updateReturnMsg(status, description, requestid);
               }
            } else {
                PublicMethod.setFailedMessage(request, "failed", "连接MDM接口失败");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("连接MDM失败："+e.getLocalizedMessage());
        }
        return SUCCESS;
    }
}
