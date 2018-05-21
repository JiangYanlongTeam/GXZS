package weaver.interfaces.gx.jyl.yhzh;

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

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.PicklistConstraint;
import beans.ws.mdm.sap.com.PicklistCriteria;
import beans.ws.mdm.sap.com.RecordIdentifierConstraint;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class YHZHServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private YHZHPublicMethod publicmethod = new YHZHPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String flag = Util.null2String(request.getParameter("flag"));
        String yhzhhm = Util.null2String(request.getParameter("yhzhhm"));
        String zhbs = Util.null2String(request.getParameter("zhbs"));
        String ms_search = Util.null2String(request.getParameter("ms"));
        String khh = Util.null2String(request.getParameter("khh"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String fwgx_search = Util.null2String(request.getParameter("fwgx"));
        String start = Util.null2String(request.getParameter("start"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSONArray jsonArray = new JSONArray();
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            BankAccountQuery banksQuery = new BankAccountQuery();
            BankAccountCriteria banksCriteria = new BankAccountCriteria();
            if(!"".equals(yhzhhm)){
                banksCriteria.setBANKN(setTextCriteria(yhzhhm));
            }
            if(!"".equals(zhbs)){
                banksCriteria.setHKTID(setTextCriteria(zhbs));
            }
            if(!"".equals(khh)){
                banksCriteria.setHBKID(setTextCriteria(khh));
            }
            if(!"".equals(sqdh)){
                banksCriteria.setApplyNumber(setTextCriteria(sqdh));
            }
            if(!"".equals(ms_search)){
                banksCriteria.setTEXT1(setTextCriteria(ms_search));
            }
            if(!"".equals(fwgx_search)){
                ClientSystemsQuery ClientSystemsQuery = new ClientSystemsQuery();
                ClientSystemsCriteria ClientSystemsCriteria = new ClientSystemsCriteria();
                ClientSystemsCriteria.setCode(publicmethod.setTextCriteria(fwgx_search));
                ClientSystemsQuery.setCriteria(ClientSystemsCriteria);
                ClientSystemsResultSet ClientSystemsResultSet = f.searchClientSystems(ClientSystemsQuery, publicmethod.setReposInfo());
                if(null != ClientSystemsResultSet) {
                    ClientSystems[] ClientSystems = ClientSystemsResultSet.getClientSystems();
                    if(null != ClientSystems && ClientSystems.length > 0) {
                        PicklistCriteria PicklistCriteria = new PicklistCriteria();
                        PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                        PicklistConstraint PicklistConstraint = new PicklistConstraint();
                        PicklistConstraint.setExpressionOperator("EQUALS");
                        RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                        RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                        RecordIdentifierConstraint.setInternalID(ClientSystems[0].getRecordIdentification().getInternalID());
                        RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                        PicklistConstraint.setValue(RecordIdentifierConstraints);
                        PicklistConstraints[0] = PicklistConstraint;
                        PicklistCriteria.setConstraint(PicklistConstraints);
                        banksCriteria.setServiceRelationshipsTupleCLIENT_SYSTEM(PicklistCriteria);
                    } else {
                        JSONObject jsonresult = new JSONObject();
                        jsonresult.put("totalcount", "0");
                        jsonresult.put("result", jsonArray);
                        response.setContentType("application/json; charset=utf-8");
                        response.getWriter().print(jsonresult.toString());
                        return;
                    }
                } else {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
            }
            banksQuery.setCriteria(banksCriteria);
            try {
                BankAccountResultSet BankAccountResultSet = f.searchBankAccount(banksQuery, publicmethod.setReposInfo());
                BankAccount[] BankAccounts = BankAccountResultSet.getBankAccount();
                if(null == BankAccounts) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = BankAccounts.length < end ? BankAccounts.length : end;
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //申请号
                    String sqdh_value = BankAccounts[i].getApplyNumber();
                    //公司代码
                    String gsdm_value = "";
                    TradePartnersLookup TradePartnersLookup = BankAccounts[i].getBUKRS();
                    if(null != TradePartnersLookup) {
                        gsdm_value = TradePartnersLookup.getDisplayValue();
                    }
                    //开户行
                    String khh_value = BankAccounts[i].getHBKID();
                    CountriesLookup countriesLookup = BankAccounts[i].getBANKS();
                    String yhgj_value = "";
                    if(null != countriesLookup){
                        yhgj_value = countriesLookup.getDisplayValue();
                    }
                    //银行代码
                    String yhdm_value = "";
                    BanksLookup BanksLookup = BankAccounts[i].getBANKL();
                    if(null != BanksLookup) {
                        yhdm_value = BanksLookup.getDisplayValue();
                    }
                    //账户标识
                    String zhbs_value = BankAccounts[i].getHKTID();
                    //描述
                    String ms_value = BankAccounts[i].getTEXT1();
                    //银行账户号码
                    String yhzhhm_value = BankAccounts[i].getBANKN();
                    //币种
                    String bz_value = "";
                    String bz_value_chinese = "";
                    CurrencyLookup CurrencyLookup = BankAccounts[i].getWAERS();
                    if(null != CurrencyLookup) {
                        bz_value = CurrencyLookup.getDisplayValue();
                        bz_value_chinese = getBzChinese(bz_value);
                    }
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = BankAccounts[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = BankAccounts[i].getApplicant();
                    String update_value = BankAccounts[i].getUpdateBy();
                    Calendar cal = BankAccounts[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != cal) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    String sqsj_value = "";
                    Calendar cal1 = BankAccounts[i].getApplyTime();
                    if(null != cal1) {
                        cal1.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(cal1.getTime());
                    }
                    String czbs_value ="";
                    OperationLookup operation = BankAccounts[i].getOperation();
                    if(null != operation) {
                        czbs_value = operation.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = BankAccounts[i].getServiceRelationshipsTuple();
                    if(null != serviceRelationshipsTupleTuples && serviceRelationshipsTupleTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(ServiceRelationshipsTupleTuple service : serviceRelationshipsTupleTuples) {
                            JSONObject ob = new JSONObject();
                            ClientSystemsLookup clientSystemsLookup = service.getCLIENT_SYSTEM();
                            String clientSystem = "";
                            if(null != clientSystemsLookup) {
                                clientSystem = clientSystemsLookup.getDisplayValue();
                            }
                            DistributionStatusLookup distributionStatusLookup = service.getDISTUS();
                            String status = "";
                            if(null != distributionStatusLookup) {
                                status = distributionStatusLookup.getDisplayValue();
                            }
                            String clientmessage = service.getRETURN();
                            ob.put("clientSystem", clientSystem);
                            ob.put("status", status);
                            ob.put("clientmessage", clientmessage);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+yhzhhm_value+"')\">"+yhzhhm_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("yhzhhm_value", jjzxdm_val);
                    } else {
                        jo.put("yhzhhm_value", yhzhhm_value);
                    }
                    jo.put("sqdh_value", sqdh_value);
                    jo.put("gsdm_value", gsdm_value);
                    jo.put("khh_value", khh_value);
                    jo.put("yhgj_value", yhgj_value);
                    jo.put("yhdm_value", yhdm_value);
                    jo.put("zhbs_value", zhbs_value);
                    jo.put("ms_value", ms_value);
                    jo.put("bz_value", bz_value);
                    jo.put("bz_value_chinese", bz_value_chinese);
                    jo.put("spzt_value", spzt_value);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("czbs_value", czbs_value);
                    jo.put("update_value", update_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", BankAccounts.length);
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
     * 根据银行账号代码查询数据-供基本信息和服务关系用
     * 
     * @param yhzhhm
     * @return
     */
    public Map<String,Object> getdata(String yhzhhm) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            BankAccountQuery banksQuery = new BankAccountQuery();
            BankAccountCriteria banksCriteria = new BankAccountCriteria();
            if(!"".equals(yhzhhm)){
                banksCriteria.setBANKN(setTextCriteria(yhzhhm));
            }
            banksQuery.setCriteria(banksCriteria);
            try {
                BankAccountResultSet BankAccountResultSet = f.searchBankAccount(banksQuery, publicmethod.setReposInfo());
                BankAccount[] BankAccounts = BankAccountResultSet.getBankAccount();
                if(null == BankAccounts) {
                    return new HashMap<String,Object>();
                }
                
                for(int i = 0 ; i < 1; i++){
                    //申请号
                    String sqdh_value = BankAccounts[i].getApplyNumber();
                    //公司代码
                    String gsdm_value = "";
                    TradePartnersLookup TradePartnersLookup = BankAccounts[i].getBUKRS();
                    if(null != TradePartnersLookup) {
                        gsdm_value = TradePartnersLookup.getDisplayValue();
                    }
                    //开户行
                    String khh_value = BankAccounts[i].getHBKID();
                    CountriesLookup countriesLookup = BankAccounts[i].getBANKS();
                    String yhgj_value = "";
                    if(null != countriesLookup){
                        yhgj_value = countriesLookup.getDisplayValue();
                    }
                    //银行代码
                    String yhdm_value = "";
                    BanksLookup BanksLookup = BankAccounts[i].getBANKL();
                    if(null != BanksLookup) {
                        yhdm_value = BanksLookup.getDisplayValue();
                    }
                    //账户标识
                    String zhbs_value = BankAccounts[i].getHKTID();
                    //描述
                    String ms_value = BankAccounts[i].getTEXT1();
                    //银行账户号码
                    String yhzhhm_value = BankAccounts[i].getBANKN();
                    //币种
                    String bz_value = "";
                    String bz_value_chinese = "";
                    CurrencyLookup CurrencyLookup = BankAccounts[i].getWAERS();
                    if(null != CurrencyLookup) {
                        bz_value = CurrencyLookup.getDisplayValue();
                        bz_value_chinese = getBzChinese(bz_value);
                    }
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = BankAccounts[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = BankAccounts[i].getApplicant();
                    String update_value = BankAccounts[i].getUpdateBy();
                    Calendar cal = BankAccounts[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != cal) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    String sqsj_value = "";
                    Calendar cal1 = BankAccounts[i].getApplyTime();
                    if(null != cal1) {
                        cal1.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(cal1.getTime());
                    }
                    String czbs_value ="";
                    OperationLookup operation = BankAccounts[i].getOperation();
                    if(null != operation) {
                        czbs_value = operation.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = BankAccounts[i].getServiceRelationshipsTuple();
                    if(null != serviceRelationshipsTupleTuples && serviceRelationshipsTupleTuples.length > 0) {
                        List<Map<String,String>> array = new ArrayList<Map<String,String>>();
                        for(ServiceRelationshipsTupleTuple service : serviceRelationshipsTupleTuples) {
                            Map<String,String> ob = new HashMap<String,String>();
                            ClientSystemsLookup clientSystemsLookup = service.getCLIENT_SYSTEM();
                            String clientSystem = "";
                            if(null != clientSystemsLookup) {
                                clientSystem = clientSystemsLookup.getDisplayValue();
                            }
                            DistributionStatusLookup distributionStatusLookup = service.getDISTUS();
                            String status = "";
                            if(null != distributionStatusLookup) {
                                status = distributionStatusLookup.getDisplayValue();
                            }
                            String clientmessage = service.getRETURN();
                            ob.put("clientSystem", clientSystem);
                            ob.put("status", status);
                            ob.put("clientmessage", clientmessage);
                            array.add(ob);
                        }
                        map.put("client", array);
                    }
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+yhzhhm_value+"')\">"+yhzhhm_value+"</a>";
                    if(!"".equals("")){
                        map.put("yhzhhm_value", jjzxdm_val);
                    } else {
                        map.put("yhzhhm_value", yhzhhm_value);
                    }
                    map.put("sqdh_value", sqdh_value);
                    map.put("gsdm_value", gsdm_value);
                    map.put("khh_value", khh_value);
                    map.put("yhgj_value", yhgj_value);
                    map.put("yhdm_value", yhdm_value);
                    map.put("zhbs_value", zhbs_value);
                    map.put("ms_value", ms_value);
                    map.put("bz_value", bz_value);
                    map.put("bz_value_chinese", bz_value_chinese);
                    map.put("spzt_value", spzt_value);
                    map.put("sqr_value", sqr_value);
                    map.put("sqrq_value", sqrq_value);
                    map.put("sqsj_value", sqsj_value);
                    map.put("czbs_value", czbs_value);
                    map.put("update_value", update_value);
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
     * 设置CustomerAccountGroupsCriteria 对象
     * 
     * @param disvalue 默认值
     * @return
     */
    public TextCriteria setTextCriteria(String disvalue){
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("CONTAINS");
        textConstraint.setValue(disvalue);
        textConstraints[0] = textConstraint;
        textCriteria.setConstraint(textConstraints);
        return textCriteria;
    }
    
    /**
     * 获取币种中文
     * 
     * @param code
     * @return
     */
    public static String getBzChinese(String code) {
        String sql = "select mc from uf_bz where zt='0' and dm = '"+code+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
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
    
    private static int getInt(String strValue,int defValue){
        try {
            return Integer.parseInt(strValue);
        } catch (Exception ex) {
            return defValue;
        }
    }
    
    public static void main(String[] args) {
        YHZHPublicMethod publicmethod = new YHZHPublicMethod();
        int pageNo;
        String flag = "flag";
        String yhzhhm = "";
        String zhbs = "";
        String khh = "";
        String start = "0";
        int limit = getInt("20",20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            BankAccountQuery banksQuery = new BankAccountQuery();
            BankAccountCriteria banksCriteria = new BankAccountCriteria();
            if(!"".equals(yhzhhm)){
                banksCriteria.setBANKN(publicmethod.setTextCriteria(yhzhhm));
            }
            if(!"".equals(zhbs)){
                banksCriteria.setHKTID(publicmethod.setTextCriteria(zhbs));
            }
            if(!"".equals(khh)){
                banksCriteria.setHBKID(publicmethod.setTextCriteria(khh));
            }
            banksQuery.setCriteria(banksCriteria);
            try {
                BankAccountResultSet BankAccountResultSet = f.searchBankAccount(banksQuery, publicmethod.setReposInfo());
                BankAccount[] BankAccounts = BankAccountResultSet.getBankAccount();
                JSONArray jsonArray = new JSONArray();
                if(null == BankAccounts) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = BankAccounts.length < end ? BankAccounts.length : end;
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //申请号
                    String sqdh_value = BankAccounts[i].getApplyNumber();
                    //公司代码
                    String gsdm_value = "";
                    TradePartnersLookup TradePartnersLookup = BankAccounts[i].getBUKRS();
                    if(null != TradePartnersLookup) {
                        gsdm_value = TradePartnersLookup.getDisplayValue();
                    }
                    //开户行
                    String khh_value = BankAccounts[i].getHBKID();
                    CountriesLookup countriesLookup = BankAccounts[i].getBANKS();
                    String yhgj_value = "";
                    if(null != countriesLookup){
                        yhgj_value = countriesLookup.getDisplayValue();
                    }
                    //银行代码
                    String yhdm_value = "";
                    BanksLookup BanksLookup = BankAccounts[i].getBANKL();
                    if(null != BanksLookup) {
                        yhdm_value = BanksLookup.getDisplayValue();
                    }
                    //账户标识
                    String zhbs_value = BankAccounts[i].getHKTID();
                    //描述
                    String ms_value = BankAccounts[i].getTEXT1();
                    //银行账户号码
                    String yhzhhm_value = BankAccounts[i].getBANKN();
                    //币种
                    String bz_value = "";
                    String bz_value_chinese = "";
                    CurrencyLookup CurrencyLookup = BankAccounts[i].getWAERS();
                    if(null != CurrencyLookup) {
                        bz_value = CurrencyLookup.getDisplayValue();
                        //bz_value_chinese = getBzChinese(bz_value);
                    }
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = BankAccounts[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = BankAccounts[i].getApplicant();
                    Calendar cal = BankAccounts[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != cal) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime());
                    }
                    String sqsj_value = "";
                    Calendar cal1 = BankAccounts[i].getApplyTime();
                    if(null != cal) {
                        sqsj_value = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal1.getTime());
                    }
                    String czbs_value ="";
                    OperationLookup operation = BankAccounts[i].getOperation();
                    if(null != operation) {
                        czbs_value = operation.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = BankAccounts[i].getServiceRelationshipsTuple();
                    if(null != serviceRelationshipsTupleTuples && serviceRelationshipsTupleTuples.length > 0) {
                        JSONArray array = new JSONArray();
                        for(ServiceRelationshipsTupleTuple service : serviceRelationshipsTupleTuples) {
                            JSONObject ob = new JSONObject();
                            ClientSystemsLookup clientSystemsLookup = service.getCLIENT_SYSTEM();
                            String clientSystem = "";
                            if(null != clientSystemsLookup) {
                                clientSystem = clientSystemsLookup.getDisplayValue();
                            }
                            DistributionStatusLookup distributionStatusLookup = service.getDISTUS();
                            String status = "";
                            if(null != distributionStatusLookup) {
                                status = distributionStatusLookup.getDisplayValue();
                            }
                            String clientmessage = service.getRETURN();
                            ob.put("clientSystem", clientSystem);
                            ob.put("status", status);
                            ob.put("clientmessage", clientmessage);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+yhzhhm_value+"')\">"+yhzhhm_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("yhzhhm_value", jjzxdm_val);
                    } else {
                        jo.put("yhzhhm_value", yhzhhm_value);
                    }
                    jo.put("sqdh_value", sqdh_value);
                    jo.put("gsdm_value", gsdm_value);
                    jo.put("khh_value", khh_value);
                    jo.put("yhgj_value", yhgj_value);
                    jo.put("yhdm_value", yhdm_value);
                    jo.put("zhbs_value", zhbs_value);
                    jo.put("ms_value", ms_value);
                    jo.put("bz_value", bz_value);
                    jo.put("bz_value_chinese", bz_value_chinese);
                    jo.put("spzt_value", spzt_value);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("czbs_value", czbs_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", BankAccounts.length);
                jsonresult.put("result", jsonArray);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
}
