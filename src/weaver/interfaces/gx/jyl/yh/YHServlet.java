package weaver.interfaces.gx.jyl.yh;

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
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Banks;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
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

public class YHServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private YHPublicMethod publicmethod = new YHPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String flag = Util.null2String(request.getParameter("flag"));
        String yhgjmc = Util.null2String(request.getParameter("yhgjmc"));
        String yhmc_search = Util.null2String(request.getParameter("yhmc"));
        String yhdm = Util.null2String(request.getParameter("yhdm"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String start = Util.null2String(request.getParameter("start"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            BanksQuery banksQuery = new BanksQuery();
            BanksCriteria banksCriteria = new BanksCriteria();
            if(!"".equals(yhgjmc)){
                PicklistCriteria PicklistCriteria =  new PicklistCriteria();
                PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                PicklistConstraint PicklistConstraint = new PicklistConstraint();
                PicklistConstraint.setExpressionOperator("EQUALS");
                RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                CountriesQuery cQuery = new CountriesQuery();
                CountriesCriteria criteria = new CountriesCriteria();
                criteria.setCode(publicmethod.setTextCriteria(yhgjmc));
                cQuery.setCriteria(criteria);
                CountriesResultSet cres = f.searchCountries(cQuery, publicmethod.setReposInfo());
                RecordIdentifierConstraint.setInternalID(cres.getCountries()[0].getRecordIdentification().getInternalID());
                RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                PicklistConstraint.setValue(RecordIdentifierConstraints);
                PicklistConstraints[0] = PicklistConstraint;
                PicklistCriteria.setConstraint(PicklistConstraints);
                banksCriteria.setBANKS(PicklistCriteria);
            }
            if(!"".equals(yhdm)){
                banksCriteria.setBANKL(setTextCriteria(yhdm));
            }
            if(!"".equals(sqdh)){
                banksCriteria.setApplyNumber(setTextCriteria(sqdh));
            }
            if(!"".equals(yhmc_search)){
                banksCriteria.setBANKA(setTextCriteria(yhmc_search));
            }
            banksQuery.setCriteria(banksCriteria);
            try {
                BanksResultSet  BanksResultSet  = f.searchBanks(banksQuery, publicmethod.setReposInfo());
                Banks[] banks = BanksResultSet.getBanks();
                JSONArray jsonArray = new JSONArray();
                if(null == banks) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = banks.length < end ? banks.length : end;
                
                
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //银行代码
                    String khbh_value = banks[i].getBANKL();
                    //申请号
                    String applyNumber_value = banks[i].getApplyNumber();
                    //银行国家
                    CountriesLookup countriesLookup = banks[i].getBANKS();
                    String yhgj_value = "";
                    if(null != countriesLookup){
                        yhgj_value = countriesLookup.getDisplayValue();
                    }
                    //银行名称 
                    String yhmc = banks[i].getBANKA();
                    //地区 
                    String dq = "";
                    RegionsLookup regionsLookup = banks[i].getPROVZ();
                    if(null != regionsLookup) {
                        dq = regionsLookup.getDisplayValue();
                    }
                    //街道 
                    String jd = banks[i].getSTRAS();
                    //城市 
                    String chengshi = banks[i].getORT01();
                    //分行
                    String fh = banks[i].getHBKID();
                    String spzt = "";
                    ApprovalStatusLookup approvalStatusLookup = banks[i].getAPCOD();
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    //申请人
                    String sqr = banks[i].getApplicant();
                    String update_value = banks[i].getUpdateBy();
                    //申请日期
                    String sqrq = "";
                    Calendar cal = banks[i].getApplyDate();
                    if(null != cal){
                        sqrq = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    //申请时间
                    String sqsj = "";
                    Calendar caltime = banks[i].getApplyTime();
                    if(null != caltime){
                        caltime.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj = new SimpleDateFormat("HH:mm").format(caltime.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = banks[i].getServiceRelationshipsTuple();
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
                    String czbz = "";
                    OperationLookup operationLookup = banks[i].getOperation();
                    if(null != operationLookup) {
                        czbz = operationLookup.getDisplayValue();
                    }
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+khbh_value+"')\">"+khbh_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("yhdm", jjzxdm_val);
                    } else {
                        jo.put("yhdm", khbh_value);
                    }
                    jo.put("applyNumber_value", applyNumber_value);
                    jo.put("yhgj_value", yhgj_value);
                    jo.put("yhmc", yhmc);
                    jo.put("dq", dq);
                    jo.put("jd", jd);
                    jo.put("chengshi", chengshi);
                    jo.put("fh", fh);
                    jo.put("spzt", spzt);
                    jo.put("sqr", sqr);
                    jo.put("sqrq", sqrq);
                    jo.put("sqsj", sqsj);
                    jo.put("czbz", czbz);
                    jo.put("update_value", update_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", banks.length);
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
     * 根据银行代码查询数据-供基本信息和服务关系用
     * 
     * @param gysbh
     * @return
     */
    public Map<String,Object> getdata(String yhdm) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            BanksQuery banksQuery = new BanksQuery();
            BanksCriteria banksCriteria = new BanksCriteria();
            if(!"".equals(yhdm)){
                banksCriteria.setBANKL(setTextCriteria(yhdm));
            }
            banksQuery.setCriteria(banksCriteria);
            try {
                BanksResultSet  BanksResultSet  = f.searchBanks(banksQuery, publicmethod.setReposInfo());
                Banks[] banks = BanksResultSet.getBanks();
                if(null == banks) {
                    return new HashMap<String,Object>();
                }
                for(int i = 0 ; i < 1; i++){
                    //银行代码
                    String khbh_value = banks[i].getBANKL();
                    //申请号
                    String applyNumber_value = banks[i].getApplyNumber();
                    //银行国家
                    CountriesLookup countriesLookup = banks[i].getBANKS();
                    String yhgj_value = "";
                    if(null != countriesLookup){
                        yhgj_value = countriesLookup.getDisplayValue();
                    }
                    //银行名称 
                    String yhmc = banks[i].getBANKA();
                    //地区 
                    String dq = "";
                    RegionsLookup regionsLookup = banks[i].getPROVZ();
                    if(null != regionsLookup) {
                        dq = regionsLookup.getDisplayValue();
                    }
                    //街道 
                    String jd = banks[i].getSTRAS();
                    //城市 
                    String chengshi = banks[i].getORT01();
                    //分行
                    String fh = banks[i].getHBKID();
                    String spzt = "";
                    ApprovalStatusLookup approvalStatusLookup = banks[i].getAPCOD();
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    //申请人
                    String sqr = banks[i].getApplicant();
                    String update_value = banks[i].getUpdateBy();
                    //申请日期
                    String sqrq = "";
                    Calendar cal = banks[i].getApplyDate();
                    if(null != cal){
                        sqrq = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    //申请时间
                    String sqsj = "";
                    Calendar caltime = banks[i].getApplyTime();
                    if(null != caltime){
                        caltime.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj = new SimpleDateFormat("HH:mm").format(caltime.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = banks[i].getServiceRelationshipsTuple();
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
                    String czbz = "";
                    OperationLookup operationLookup = banks[i].getOperation();
                    if(null != operationLookup) {
                        czbz = operationLookup.getDisplayValue();
                    }
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+khbh_value+"')\">"+khbh_value+"</a>";
                    if(!"".equals("")){
                        map.put("yhdm", jjzxdm_val);
                    } else {
                        map.put("yhdm", khbh_value);
                    }
                    map.put("applyNumber_value", applyNumber_value);
                    map.put("yhgj_value", yhgj_value);
                    map.put("yhmc", yhmc);
                    map.put("dq", dq);
                    map.put("jd", jd);
                    map.put("chengshi", chengshi);
                    map.put("fh", fh);
                    map.put("spzt", spzt);
                    map.put("sqr", sqr);
                    map.put("sqrq", sqrq);
                    map.put("sqsj", sqsj);
                    map.put("czbz", czbz);
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
        YHPublicMethod publicmethod = new YHPublicMethod();
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            BanksQuery banksQuery = new BanksQuery();
            BanksCriteria banksCriteria = new BanksCriteria();
            if(!"".equals("")){
                PicklistCriteria PicklistCriteria =  new PicklistCriteria();
                PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                PicklistConstraint PicklistConstraint = new PicklistConstraint();
                PicklistConstraint.setExpressionOperator("EQUALS");
                RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                CountriesQuery cQuery = new CountriesQuery();
                CountriesCriteria criteria = new CountriesCriteria();
                criteria.setCode(publicmethod.setTextCriteria("AD"));
                cQuery.setCriteria(criteria);
                CountriesResultSet cres = f.searchCountries(cQuery, publicmethod.setReposInfo());
                RecordIdentifierConstraint.setInternalID(cres.getCountries()[0].getRecordIdentification().getInternalID());
                RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                PicklistConstraint.setValue(RecordIdentifierConstraints);
                PicklistConstraints[0] = PicklistConstraint;
                PicklistCriteria.setConstraint(PicklistConstraints);
                banksCriteria.setBANKS(PicklistCriteria);
            }
//            if(!"".equals("0001")){
//                banksCriteria.setBANKL(publicmethod.setTextCriteria("0001"));
//            }
            banksQuery.setCriteria(banksCriteria);
            
            try {
                BanksResultSet  BanksResultSet  = f.searchBanks(banksQuery, publicmethod.setReposInfo());
                Banks[] banks = BanksResultSet.getBanks();
                int endtotal = banks.length;
                
                JSONArray jsonArray = new JSONArray();
                for(int i = 0 ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //银行代码
                    String khbh_value = banks[i].getBANKL();
                    //申请号
                    String applyNumber_value = banks[i].getApplyNumber();
                    //银行国家
                    CountriesLookup countriesLookup = banks[i].getBANKS();
                    String yhgj_value = "";
                    if(null != countriesLookup){
                        yhgj_value = countriesLookup.getDisplayValue();
                    }
                    //银行名称 
                    String yhmc = banks[i].getBANKA();
                    //地区 
                    String dq = "";
                    String s = banks[i].getHBKID();
                    System.out.println(s);
                    RegionsLookup regionsLookup = banks[i].getPROVZ();
                    if(null != regionsLookup) {
                        dq = regionsLookup.getDisplayValue();
                    }
                    //街道 
                    String jd = banks[i].getSTRAS();
                    //城市 
                    String chengshi = banks[i].getORT01();
                    //分行
                    String fh = banks[i].getHBKID();
                    String spzt = "";
                    ApprovalStatusLookup approvalStatusLookup = banks[i].getAPCOD();
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    //申请人
                    String sqr = banks[i].getApplicant();
                    //申请日期
                    String sqrq = "";
                    Calendar cal = banks[i].getApplyDate();
                    if(null != cal){
                        sqrq = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    //申请时间
                    String sqsj = "";
                    Calendar caltime = banks[i].getApplyTime();
                    if(null != cal){
                        sqsj = new SimpleDateFormat("HH:mm").format(caltime.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = banks[i].getServiceRelationshipsTuple();
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
                            ob.put("clientSystem", clientSystem);
                            ob.put("status", status);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    String czbz = "";
                    OperationLookup operationLookup = banks[i].getOperation();
                    if(null != operationLookup) {
                        czbz = operationLookup.getDisplayValue();
                    }
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+khbh_value+"')\">"+khbh_value+"</a>";
                    if(!"".equals("")){
                        jo.put("yhdm", jjzxdm_val);
                    } else {
                        jo.put("yhdm", khbh_value);
                    }
                    jo.put("applyNumber_value", applyNumber_value);
                    jo.put("yhgj_value", yhgj_value);
                    jo.put("yhmc", yhmc);
                    jo.put("dq", dq);
                    jo.put("jd", jd);
                    jo.put("chengshi", chengshi);
                    jo.put("fh", fh);
                    jo.put("spzt", spzt);
                    jo.put("sqr", sqr);
                    jo.put("sqrq", sqrq);
                    jo.put("sqsj", sqsj);
                    jo.put("czbz", czbz);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", banks.length);
                jsonresult.put("result", jsonArray);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
