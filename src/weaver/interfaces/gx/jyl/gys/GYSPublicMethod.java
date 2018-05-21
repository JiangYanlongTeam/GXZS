package weaver.interfaces.gx.jyl.gys;

import java.rmi.RemoteException;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatus;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Banks;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Languages;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Operation;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationID;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Regions;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Titles;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartners;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.BasicRecordIdentification;
import beans.ws.mdm.sap.com.BasicRecordIdentificationWithKeyMapping;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

/**
 * 供应商公共方法
 */
public class GYSPublicMethod extends BaseBean {
    
    /**
     * 查找银行码
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public BanksLookup lookBanksLookup(String disvalue,JSGX_MDM_BUSINESS_PARTNERViProxy proxy) {
        BanksLookup banksLookup = new BanksLookup();
        banksLookup.setDisplayValue(disvalue);
        BanksQuery banksQuery = new BanksQuery();
        BanksCriteria banksCriteria = new BanksCriteria();
        banksCriteria.setBANKL(setTextCriteria(disvalue));
        banksQuery.setCriteria(banksCriteria);
        BanksResultSet banksResultSet = null;
        try {
            banksResultSet = proxy.searchBanks(banksQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != banksResultSet) {
            Banks[] banks= banksResultSet.getBanks();
            if(null != banks && banks.length > 0) {
                BanksID banksID = banks[0].getRecordIdentification();
                BasicRecordIdentificationWithKeyMapping basicRecordIdentification = new BasicRecordIdentificationWithKeyMapping();
                basicRecordIdentification.setInternalID(banksID.getInternalID());
                banksLookup.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return banksLookup;
    }
    
    /**
     * 获取分发系统代码内部码
     * 
     * @param value
     * @param f
     * @return
     */
    public ServiceRelationshipsTupleTuple getFFXTDM(String value,JSGX_MDM_BUSINESS_PARTNERViProxy f) {
        ClientSystemsQuery clientQuery = new ClientSystemsQuery ();
        ClientSystemsCriteria clientCriteria = new ClientSystemsCriteria();
        clientCriteria.setCode(setTextCriteria(value));
        clientQuery.setCriteria(clientCriteria);
        ClientSystemsResultSet clientResultSet = null;
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = null;
        try {
            clientResultSet = f.searchClientSystems(clientQuery, setReposInfo());
            ExecutionStatus execution = clientResultSet.getExecutionStatus();
            String status = execution.getStatus();
            if("OK".equalsIgnoreCase(status)){
                ClientSystems[] clients = clientResultSet.getClientSystems();
                if(null != clients && clients.length > 0) {
                    ClientSystemsID clientId = clients[0].getRecordIdentification();
                    serviceRelationshipsTupleTuple = new ServiceRelationshipsTupleTuple();
                    ClientSystemsLookup clientLookup = new ClientSystemsLookup();
                    clientLookup.setDisplayValue(value);
                    BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                    basicRecordIdentification.setInternalID(clientId.getInternalID());
                    clientLookup.setRecordIdentification(basicRecordIdentification);
                    serviceRelationshipsTupleTuple.setCLIENT_SYSTEM(clientLookup);
                    serviceRelationshipsTupleTuple.setDisplayValue(value);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("获取分发系统代码异常："+e.getMessage());
            return null;
        }
        return serviceRelationshipsTupleTuple;
    }
    
    /**
     * 查找贸易伙伴
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public TradePartnersLookup lookTradePartnersLookup(String disvalue,JSGX_MDM_BUSINESS_PARTNERViProxy proxy) {
        TradePartnersLookup tradePartnersLookup = new TradePartnersLookup();
        tradePartnersLookup.setDisplayValue(disvalue);
        TradePartnersQuery tradePartnersQuery = new TradePartnersQuery();
        TradePartnersCriteria tradePartnersCriteria = new TradePartnersCriteria();
        tradePartnersCriteria.setCode(setTextCriteria(disvalue));
        tradePartnersQuery.setCriteria(tradePartnersCriteria);
        TradePartnersResultSet tradePartnersResultSet = null;
        try {
            tradePartnersResultSet = proxy.searchTradePartners(tradePartnersQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找贸易伙伴异常："+e.getLocalizedMessage());
            return null;
        }
        TradePartners[] tradePartners = tradePartnersResultSet.getTradePartners();
        if(null != tradePartners && tradePartners.length > 0) {
            BasicRecordIdentification base = new BasicRecordIdentification();
            base.setInternalID(tradePartners[0].getRecordIdentification().getInternalID());
            tradePartnersLookup.setRecordIdentification(base);
        } else {
            return null;
        }
        return tradePartnersLookup;
    }
    
    /**
     * 查找地区
     * 
     * @param disvalue code 
     * @param proxy 代理类
     * @return
     */
    public RegionsLookup lookRegionsLookup(String disvalue,JSGX_MDM_BUSINESS_PARTNERViProxy proxy) {
        RegionsLookup regionsLookup = new RegionsLookup();
        regionsLookup.setDisplayValue(disvalue);
        RegionsQuery regionsQuery = new RegionsQuery();
        RegionsCriteria regionsCriteria = new RegionsCriteria();
        regionsCriteria.setCode(setTextCriteria(disvalue));
        regionsQuery.setCriteria(regionsCriteria);
        RegionsResultSet regionsResultSet = null;
        try {
            regionsResultSet = proxy.searchRegions(regionsQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找地区异常："+e.getLocalizedMessage());
            return null;
        }
        Regions[] Regions = regionsResultSet.getRegions();
        if(null != Regions && Regions.length > 0) {
            BasicRecordIdentification base = new BasicRecordIdentification();
            base.setInternalID(Regions[0].getRecordIdentification().getInternalID());
            regionsLookup.setRecordIdentification(base);
        } else {
            return null;
        }
        return regionsLookup;
    }
    
    /**
     * 查找国家
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public CountriesLookup lookCountriesLookup(String disvalue,JSGX_MDM_BUSINESS_PARTNERViProxy proxy) {
        CountriesLookup countriesLookup = new CountriesLookup();
        countriesLookup.setDisplayValue(disvalue);
        CountriesQuery countriesQuery = new CountriesQuery();
        CountriesCriteria countriesCriteria = new CountriesCriteria();
        countriesCriteria.setCode(setTextCriteria(disvalue));
        countriesQuery.setCriteria(countriesCriteria);
        CountriesResultSet countriesResultSet = null;
        try {
            countriesResultSet = proxy.searchCountries(countriesQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找国家异常："+e.getLocalizedMessage());
            return null;
        }
        Countries[] countries = countriesResultSet.getCountries();
        if(null != countries && countries.length > 0) {
            CountriesID countriesID = countries[0].getRecordIdentification();
            BasicRecordIdentification base = new BasicRecordIdentification();
            base.setInternalID(countriesID.getInternalID());
            countriesLookup.setRecordIdentification(base);
        } else {
            return null;
        }
        return countriesLookup;
    }
    
    /**
     * 查找语种
     * 
     * @param disvalue code 
     * @param proxy 代理类
     * @return
     */
    public LanguagesLookup lookLanguagesLookup(String disvalue,JSGX_MDM_BUSINESS_PARTNERViProxy proxy) {
        LanguagesQuery languagesQuery = new LanguagesQuery();
        LanguagesLookup languagesLookup = new LanguagesLookup();
        LanguagesCriteria languagesCriteria = new LanguagesCriteria();
        languagesCriteria.setCode(setTextCriteria(disvalue));
        languagesQuery.setCriteria(languagesCriteria);
        LanguagesResultSet languagesResultSet = null;
        try {
            languagesResultSet = proxy.searchLanguages(languagesQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找语种异常："+e.getLocalizedMessage());
            return null;
        }
        Languages[] languages = languagesResultSet.getLanguages();
        if(null != languages && languages.length > 0) {
            LanguagesID languagesID = languages[0].getRecordIdentification();
            BasicRecordIdentification base = new BasicRecordIdentification();
            base.setInternalID(languagesID.getInternalID());
            languagesLookup.setDisplayValue(disvalue);
            languagesLookup.setRecordIdentification(base);
        } else {
            return null;
        }
        return languagesLookup;
    }
    
    /**
     * 查找称谓
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public TitlesLookup lookTitlesLookup(String disvalue,JSGX_MDM_BUSINESS_PARTNERViProxy proxy) {
        TitlesLookup titlesLookup = new TitlesLookup();
        TitlesQuery titlesQuery = new TitlesQuery();
        titlesQuery.setCriteria(setTitlesCriteria(disvalue));
        TitlesResultSet titlesResultSet = null;
        try {
            titlesResultSet = proxy.searchTitles(titlesQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找称谓异常："+e.getLocalizedMessage());
            return null;
        }
        Titles[] titles = titlesResultSet.getTitles();
        if(null != titles && titles.length > 0) {
            BasicRecordIdentification base = new BasicRecordIdentification();
            base.setInternalID(titles[0].getRecordIdentification().getInternalID());
            titlesLookup.setDisplayValue(disvalue);
            titlesLookup.setRecordIdentification(base);
        } else {
            return null;
        }
        return titlesLookup;
    }
    
    /**
     * 设置TitlesCriteria
     * 
     * @param disvalue code 
     * @return
     */
    public TitlesCriteria setTitlesCriteria(String disvalue) {
        TitlesCriteria titlesCriteria = new TitlesCriteria();
        TextCriteria textCriteria = setTextCriteria(disvalue);
        titlesCriteria.setCode(textCriteria);
        return titlesCriteria;
    }
    
    /**
     * 查找账户组
     * 
     * @param disvalue code
     * @param proxy 代理类
     * @return
     */
    public VendorAccountGroupsLookup lookVendorAccountGroupsLookup(String disvalue, JSGX_MDM_BUSINESS_PARTNERViProxy proxy) {
        VendorAccountGroupsLookup vendorAccountGroupsLookup = new VendorAccountGroupsLookup();
        vendorAccountGroupsLookup.setDisplayValue(disvalue);
        VendorAccountGroupsQuery vendorAccountGroupsQuery = new VendorAccountGroupsQuery();
        VendorAccountGroupsCriteria vendorAccountGroupsCriteria = new VendorAccountGroupsCriteria();
        vendorAccountGroupsCriteria.setCode(setTextCriteria(disvalue));
        vendorAccountGroupsQuery.setCriteria(vendorAccountGroupsCriteria);
        VendorAccountGroupsResultSet vendorAccountGroupsResultSet = null;
        try {
            vendorAccountGroupsResultSet = proxy.searchVendorAccountGroups(vendorAccountGroupsQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            log("查找账户组异常："+e.getLocalizedMessage());
            return null;
        }
        if(null != vendorAccountGroupsResultSet) {
            VendorAccountGroups[] vendorAccountGroups = vendorAccountGroupsResultSet.getVendorAccountGroups();
            if(null != vendorAccountGroups && vendorAccountGroups.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(vendorAccountGroups[0].getRecordIdentification().getInternalID());
                vendorAccountGroupsLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return vendorAccountGroupsLookup;
    }
    
    /**
     * 获取操作标识
     * 
     * @param value code
     * @param f 代理类
     * @return
     */
    public OperationLookup lookOperation(String value, JSGX_MDM_BUSINESS_PARTNERViProxy f) {
        OperationQuery operationQuery = new OperationQuery();
        OperationCriteria operationCriteria = new OperationCriteria();
        operationCriteria.setCode(setTextCriteria(value));
        operationQuery.setCriteria(operationCriteria);
        OperationResultSet operateres = null;
        RepositoryInformation reposInfo = setReposInfo();
        try {
            operateres = f.searchOperation(operationQuery, reposInfo);
        } catch (RemoteException e1) {
            e1.printStackTrace();
            writeLog("调用MDM查询操作标识异常："+e1.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = operateres.getExecutionStatus();
        String status = executionStatus.getStatus();
        OperationLookup operatelook = null;
        if("OK".equalsIgnoreCase(status)) {
            Operation[] operation = operateres.getOperation();
            if(null != operation && operation.length > 0) {
                Operation operat = operation[0];
                OperationID identi = operat.getRecordIdentification();
                operatelook = new OperationLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(identi.getInternalID());
                operatelook.setRecordIdentification(basicRecordIdentification);
                operatelook.setDisplayValue(value);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return operatelook;
    }
    
    
    /**
     * 获取分发状态代码
     * 
     * @param value 状态0
     * @param f
     * @return
     */
    public DistributionStatusLookup getFFZT(String value,JSGX_MDM_BUSINESS_PARTNERViProxy f){
        
        DistributionStatusQuery distributionStatusQuery = new DistributionStatusQuery();
        DistributionStatusCriteria distributionStatusCriteria = new DistributionStatusCriteria();
        
        distributionStatusCriteria.setCode(setTextCriteria(value));
        
        distributionStatusQuery.setCriteria(distributionStatusCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        DistributionStatusResultSet approvalStatusResultSet = null;
        try {
            approvalStatusResultSet  = f.searchDistributionStatus(distributionStatusQuery, reposInfo);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            writeLog("调用MDM查询分发状态代码异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = approvalStatusResultSet.getExecutionStatus();
        String status = executionStatus.getStatus();
        DistributionStatusLookup distributionStatusLookup = null;
        if("OK".equalsIgnoreCase(status)){
            DistributionStatus[] distributionStatus = approvalStatusResultSet.getDistributionStatus();
            if(null != distributionStatus && distributionStatus.length > 0) {
                DistributionStatus results = approvalStatusResultSet.getDistributionStatus()[0];
                DistributionStatusID approvalStatusID = results.getRecordIdentification();
                distributionStatusLookup = new DistributionStatusLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(approvalStatusID.getInternalID());
                distributionStatusLookup.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return distributionStatusLookup;
    }
    
    /**
     * 处理时间字符串
     * @param date
     * @return
     */
    public String toyyyyMMdd(String date) {
        String[] strs = date.split("-");
        StringBuffer sb = new StringBuffer();
        for(String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
    
    /**
     * 处理时间字符串
     * @param date
     * @return
     */
    public String toyyyyMMdd(String date,String time) {
        String[] strs = time.split(":");
        StringBuffer sb = new StringBuffer();
        for(String s : strs) {
            sb.append(s);
        }
        return date + sb.toString();
    }
    
    /**
     * 审批状态代码
     * 
     * @param value code
     * @param f 代理类
     * @return
     */
    public ApprovalStatusLookup getAPCODCode(String value, JSGX_MDM_BUSINESS_PARTNERViProxy f) {
        ApprovalStatusQuery approvalStatusQuery = new ApprovalStatusQuery();
        ApprovalStatusCriteria approvalStatusCriteria = new ApprovalStatusCriteria();
        approvalStatusCriteria.setCode(setTextCriteria(value));
        approvalStatusQuery.setCriteria(approvalStatusCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        ApprovalStatusResultSet approvalStatusResultSet = null;
        try {
            approvalStatusResultSet = f.searchApprovalStatus(approvalStatusQuery, reposInfo);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            writeLog("调用MDM查询审批状态代码异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = approvalStatusResultSet.getExecutionStatus();
        String status = executionStatus.getStatus();
        ApprovalStatusLookup approvalStatusLookup = null;
        if("OK".equalsIgnoreCase(status)){
            ApprovalStatus[] approvalStatus = approvalStatusResultSet.getApprovalStatus();
            if(null != approvalStatus && approvalStatus.length > 0) {
                ApprovalStatus results = approvalStatus[0];
                ApprovalStatusID approvalStatusID = results.getRecordIdentification();
                approvalStatusLookup = new ApprovalStatusLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(approvalStatusID.getInternalID());
                approvalStatusLookup.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return approvalStatusLookup;
    }
    
    /**
     * 设置CustomerAccountGroupsCriteria 对象
     * 
     * @param disvalue 默认值
     * @return
     */
    public TextCriteria setTextCriteria(String disvalue){
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(disvalue);
        textConstraints[0] = textConstraint;
        textCriteria.setConstraint(textConstraints);
        return textCriteria;
    }
    
    /**
     * 设置RepositoryInformation对象
     * 
     * @return
     */
    public RepositoryInformation setReposInfo() {
        RepositoryInformation reposInfo = new RepositoryInformation();
        reposInfo.setDataLang("Chinese [CN]");
        reposInfo.setRepositoryName("JSGX_MDM_BUSINESS_PARTNER_Dev");
        reposInfo.setServerName("MDP");
        return reposInfo;
    }
    
    /**
     * 打印日志
     * @param o
     */
    public void log(Object o) {
        writeLog(o);
    }
    
    /**
     * 更新创建成功标识字段
     * 
     * @param status
     * @param message
     * @param requestid
     */
    public void updateReturnMsg(String status,String message,String requestid) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("MDM", "MDM_GYS_TABLE");
        String sql = "update "+tablename+" set fhzt = '"+status+"', fhxx = '"+message+"' where requestid = '"+requestid+"'";
        writeLog("处理SAP返回消息和状态SQL："+sql);
        rs.execute(sql);
    }
}
