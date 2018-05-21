package weaver.interfaces.gx.jyl.gys;

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
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Vendors;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.BooleanConstraint;
import beans.ws.mdm.sap.com.BooleanCriteria;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class GYSServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private GYSPublicMethod publicmethod = new GYSPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String gysbh = Util.null2String(request.getParameter("gysbh"));
        String flag = Util.null2String(request.getParameter("flag"));
        String gysqc = Util.null2String(request.getParameter("gysqc"));
        String djbs = Util.null2String(request.getParameter("djbz"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String shxydms = Util.null2String(request.getParameter("shxydm"));
        String start = Util.null2String(request.getParameter("start"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            VendorsQuery vendorsQuery = new VendorsQuery();
            VendorsCriteria vendorsCriteria = new VendorsCriteria();
            //供应商代码 查询条件
            if(!"".equals(gysbh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(gysbh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                vendorsCriteria.setLIFNR(textCriteria);
            }
            //供应商全称 查询条件
            if(!"".equals(gysqc)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(gysqc);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                vendorsCriteria.setFULL_NAME(textCriteria);
            }
            if(!"".equals(sqdh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(sqdh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                vendorsCriteria.setApplyNumber(textCriteria);
            }
            if(!"".equals(djbs)){
                BooleanCriteria BooleanCriteria = new BooleanCriteria();
                BooleanConstraint[] BooleanConstraints = new BooleanConstraint[1];
                BooleanConstraint BooleanConstraint = new BooleanConstraint();
                BooleanConstraint.setValue(false);
                BooleanConstraints[0] = BooleanConstraint;
                BooleanCriteria.setConstraint(BooleanConstraints);
                vendorsCriteria.setSPERM(BooleanCriteria);
            }
            if(!"".equals(shxydms)){
            	TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(shxydms);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                vendorsCriteria.setSTCEG(textCriteria);
            }
            vendorsQuery.setCriteria(vendorsCriteria);
            VendorsResultSet vendorsResultSet = null;
            try {
                vendorsResultSet = f.searchVendors(vendorsQuery, publicmethod.setReposInfo());
                Vendors[] vendors = vendorsResultSet.getVendors();
                JSONArray jsonArray = new JSONArray();
                if(null == vendors) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = vendors.length < end ? vendors.length : end;
                
                
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //供应商编号
                    String gysbh_value = vendors[i].getLIFNR();
                    //申请号
                    String applyNumber_value = vendors[i].getApplyNumber();
                    //账户组
                    VendorAccountGroupsLookup vendorAccountGroupsLookup = vendors[i].getKTOKK();
                    String zhz_value = "";
                    if(null != vendorAccountGroupsLookup){
                        zhz_value = vendorAccountGroupsLookup.getDisplayValue();
                    }
                    //称谓
                    TitlesLookup titlesLookup = vendors[i].getANRED();
                    String chengwei_value = "";
                    if(null != titlesLookup) {
                        chengwei_value = titlesLookup.getDisplayValue();
                    }
                    //供应商简称
                    String gysjc_value = vendors[i].getSORT1();
                    //供应商全称
                    String gysqc_value = vendors[i].getFULL_NAME();
                    //税号\统一社会信用代码
                    String shxydm = vendors[i].getSTCEG();
                    //工商登记证号
                    String gsdjzh = vendors[i].getSTCD1();
                    //全国组织机构代码
                    String qgzzjgdm = vendors[i].getSTCD2();
                    //贸易伙伴
                    TradePartnersLookup myhb = vendors[i].getVBUND();
                    String myhb_value = "";
                    if(null != myhb){
                        myhb_value = myhb.getDisplayValue();
                    }
                    //注册资本
                    String zczb = vendors[i].getSTCD3();
                    //国家
                    CountriesLookup countriesLookup = vendors[i].getLAND1();
                    String gj_value = "";
                    if(null != countriesLookup) {
                        gj_value = countriesLookup.getDisplayValue();
                    }
                    //语种
                    LanguagesLookup languagesLookup = vendors[i].getSPRAS();
                    String yz_value = "";
                    if(null != languagesLookup) {
                        yz_value = languagesLookup.getDisplayValue();
                    }
                    //地区
                    RegionsLookup cus = vendors[i].getREGIO();
                    String region_value = "";
                    if(null != cus) {
                        region_value = cus.getDisplayValue();
                    }
                    //地区城市
                    String dqcs_value = vendors[i].getORT01();
                    //街道/门牌号
                    String jdmp_value = vendors[i].getSTREET();
                    //邮政编码
                    String yzbm_value = vendors[i].getPSTLZ();
                    //电话号码
                    String dhhm_value = vendors[i].getTEL_NUMBER();
                    //电话分机号
                    String dhfj_value = vendors[i].getTEL_EXTENS();
                    //传真号
                    String czhm_value = vendors[i].getFAX_NUMBER();
                    //传真分机号
                    String czfj_value = vendors[i].getFAX_EXTENS();
                    //电子邮件
                    String dzyj_value = vendors[i].getSMTP_ADDR();
                    //冻结标识
                    boolean djbz_value = vendors[i].getSPERM();
                    //银行字表
                    BankAccountsTuple[] bankAccountsTuples = vendors[i].getBankDetails();
                    if(null != bankAccountsTuples && bankAccountsTuples.length > 0){
                        JSONArray array = new JSONArray();
                        for(BankAccountsTuple bankAccount : bankAccountsTuples) {
                            JSONObject ob = new JSONObject();
                            CountriesLookup countries = bankAccount.getBANKS();
                            String countries_value = "";
                            if(null != countries) {
                                countries_value = countries.getDisplayValue();
                            }
                            String banks_value = "";
                            BanksLookup banksLookup = bankAccount.getBANKL();
                            if(null != banksLookup) {
                                banks_value = banksLookup.getDisplayValue();
                            }
                            String zhcyr = bankAccount.getKOINH();
                            String bankaccount = bankAccount.getBANKN();
                            ob.put("countries_value", countries_value);
                            ob.put("banks_value", banks_value);
                            ob.put("zhcyr", zhcyr);
                            ob.put("bankaccount", bankaccount);
                            array.add(ob);
                        }
                        jo.put("banks", array);
                    }
                    ApprovalStatusLookup approvalStatusLookup = vendors[i].getAPCOD();
                    String spzt = "";
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = vendors[i].getApplicant();
                    String update_value = vendors[i].getUpdateBy();
                    Calendar sqrq = vendors[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = vendors[i].getApplyTime();
                    if(null != sqsj) {
                        sqsj.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = vendors[i].getServiceRelationshipsTuple();
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
                            ob.put("clientmessage", clientmessage);
                            ob.put("clientSystem", clientSystem);
                            ob.put("status", status);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    OperationLookup operationLookup = vendors[i].getOperation();
                    String operation = "";
                    if(null != operationLookup) {
                        operation = operationLookup.getDisplayValue();
                    }
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+gysbh_value+"')\">"+gysbh_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("gysbh", jjzxdm_val);
                    } else {
                        jo.put("gysbh", gysbh_value);
                    }
                    jo.put("applyNumber_value", applyNumber_value);
                    jo.put("zhz_value", zhz_value);
                    String zhz_value_chinese = getZHZChineseName(zhz_value);
                    jo.put("zhz_value_chinese", zhz_value_chinese);
                    jo.put("chengwei_value", chengwei_value);
                    String chengwei_value_chinese = getCWChineseName(chengwei_value);
                    jo.put("chengwei_value_chinese", chengwei_value_chinese);
                    jo.put("gysjc_value", gysjc_value);
                    jo.put("gysqc_value", gysqc_value);
                    jo.put("shxydm", shxydm);
                    jo.put("gsdjzh", gsdjzh);
                    jo.put("yz_value", yz_value);
                    String yz_value_chinese = getYzChineseName(yz_value);
                    jo.put("yz_value_chinese", yz_value_chinese);
                    jo.put("gj_value", gj_value);
                    String gj_value_chinese = getGjChineseName(gj_value);
                    jo.put("gj_value_chinese", gj_value_chinese);
                    jo.put("region_value", region_value);
                    String region_value_chinese = getResionChineseName(region_value);
                    jo.put("region_value_chinese", region_value_chinese);
                    jo.put("dqcs_value", dqcs_value);
                    jo.put("jdmp_value", jdmp_value);
                    jo.put("yzbm_value", yzbm_value);
                    jo.put("dhhm_value", dhhm_value);
                    jo.put("dhfj_value", dhfj_value);
                    jo.put("czhm_value", czhm_value);
                    jo.put("czfj_value", czfj_value);
                    jo.put("dzyj_value", dzyj_value);
                    jo.put("myhb_value", myhb_value);
                    String myhb_value_chinese = getMyhbChineseName(myhb_value);
                    jo.put("myhb_value_chinese", myhb_value_chinese);
                    jo.put("djbz_value", djbz_value);
                    jo.put("spzt", spzt);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("operation", operation);
                    jo.put("zczb", zczb);
                    jo.put("qgzzjgdm", qgzzjgdm);
                    jo.put("update_value", update_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", vendors.length);
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
     * 根据供应商编号查询数据-供基本信息和服务关系用
     * 
     * @param gysbh
     * @return
     */
    public Map<String,Object> getdata(String gysbh) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            VendorsQuery vendorsQuery = new VendorsQuery();
            VendorsCriteria vendorsCriteria = new VendorsCriteria();
            //供应商代码 查询条件
            if(!"".equals(gysbh)){
                vendorsCriteria.setLIFNR(publicmethod.setTextCriteria(gysbh));
            }
            vendorsQuery.setCriteria(vendorsCriteria);
            VendorsResultSet vendorsResultSet = null;
            try {
                vendorsResultSet = f.searchVendors(vendorsQuery, publicmethod.setReposInfo());
                Vendors[] vendors = vendorsResultSet.getVendors();
                if(null == vendors) {
                    return new HashMap<String,Object>();
                }
                
                for(int i = 0 ; i < 1; i++){
                    //供应商编号
                    String gysbh_value = vendors[i].getLIFNR();
                    //申请号
                    String applyNumber_value = vendors[i].getApplyNumber();
                    //账户组
                    VendorAccountGroupsLookup vendorAccountGroupsLookup = vendors[i].getKTOKK();
                    String zhz_value = "";
                    if(null != vendorAccountGroupsLookup){
                        zhz_value = vendorAccountGroupsLookup.getDisplayValue();
                    }
                    //称谓
                    TitlesLookup titlesLookup = vendors[i].getANRED();
                    String chengwei_value = "";
                    if(null != titlesLookup) {
                        chengwei_value = titlesLookup.getDisplayValue();
                    }
                    //供应商简称
                    String gysjc_value = vendors[i].getSORT1();
                    //供应商全称
                    String gysqc_value = vendors[i].getFULL_NAME();
                    //税号\统一社会信用代码
                    String shxydm = vendors[i].getSTCEG();
                    //工商登记证号
                    String gsdjzh = vendors[i].getSTCD1();
                    //全国组织机构代码
                    String qgzzjgdm = vendors[i].getSTCD2();
                    //贸易伙伴
                    TradePartnersLookup myhb = vendors[i].getVBUND();
                    String myhb_value = "";
                    if(null != myhb){
                        myhb_value = myhb.getDisplayValue();
                    }
                    //注册资本
                    String zczb = vendors[i].getSTCD3();
                    //国家
                    CountriesLookup countriesLookup = vendors[i].getLAND1();
                    String gj_value = "";
                    if(null != countriesLookup) {
                        gj_value = countriesLookup.getDisplayValue();
                    }
                    //语种
                    LanguagesLookup languagesLookup = vendors[i].getSPRAS();
                    String yz_value = "";
                    if(null != languagesLookup) {
                        yz_value = languagesLookup.getDisplayValue();
                    }
                    //地区
                    RegionsLookup cus = vendors[i].getREGIO();
                    String region_value = "";
                    if(null != cus) {
                        region_value = cus.getDisplayValue();
                    }
                    //地区城市
                    String dqcs_value = vendors[i].getORT01();
                    //街道/门牌号
                    String jdmp_value = vendors[i].getSTREET();
                    //邮政编码
                    String yzbm_value = vendors[i].getPSTLZ();
                    //电话号码
                    String dhhm_value = vendors[i].getTEL_NUMBER();
                    //电话分机号
                    String dhfj_value = vendors[i].getTEL_EXTENS();
                    //传真号
                    String czhm_value = vendors[i].getFAX_NUMBER();
                    //传真分机号
                    String czfj_value = vendors[i].getFAX_EXTENS();
                    //电子邮件
                    String dzyj_value = vendors[i].getSMTP_ADDR();
                    //冻结标识
                    boolean djbz_value = vendors[i].getSPERM();
                    //银行字表
                    BankAccountsTuple[] bankAccountsTuples = vendors[i].getBankDetails();
                    if(null != bankAccountsTuples && bankAccountsTuples.length > 0){
                        List<Map<String,String>> array = new ArrayList<Map<String,String>>();
                        for(BankAccountsTuple bankAccount : bankAccountsTuples) {
                            Map<String,String> ob = new HashMap<String,String>();
                            CountriesLookup countries = bankAccount.getBANKS();
                            String countries_value = "";
                            if(null != countries) {
                                countries_value = countries.getDisplayValue();
                            }
                            String banks_value = "";
                            BanksLookup banksLookup = bankAccount.getBANKL();
                            if(null != banksLookup) {
                                banks_value = banksLookup.getDisplayValue();
                            }
                            String zhcyr = bankAccount.getKOINH();
                            String bankaccount = bankAccount.getBANKN();
                            ob.put("countries_value", countries_value);
                            ob.put("banks_value", banks_value);
                            ob.put("zhcyr", zhcyr);
                            ob.put("bankaccount", bankaccount);
                            array.add(ob);
                        }
                        map.put("banks", array);
                    }
                    ApprovalStatusLookup approvalStatusLookup = vendors[i].getAPCOD();
                    String spzt = "";
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = vendors[i].getApplicant();
                    String update_value = vendors[i].getUpdateBy();
                    Calendar sqrq = vendors[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = vendors[i].getApplyTime();
                    if(null != sqsj) {
                        sqsj.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = vendors[i].getServiceRelationshipsTuple();
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
                            ob.put("clientmessage", clientmessage);
                            ob.put("clientSystem", clientSystem);
                            ob.put("status", status);
                            array.add(ob);
                        }
                        map.put("client", array);
                    }
                    OperationLookup operationLookup = vendors[i].getOperation();
                    String operation = "";
                    if(null != operationLookup) {
                        operation = operationLookup.getDisplayValue();
                    }
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+gysbh_value+"')\">"+gysbh_value+"</a>";
                    if(!"".equals("")){
                        map.put("gysbh", jjzxdm_val);
                    } else {
                        map.put("gysbh", gysbh_value);
                    }
                    map.put("applyNumber_value", applyNumber_value);
                    map.put("zhz_value", zhz_value);
                    String zhz_value_chinese = getZHZChineseName(zhz_value);
                    map.put("zhz_value_chinese", zhz_value_chinese);
                    map.put("chengwei_value", chengwei_value);
                    String chengwei_value_chinese = getCWChineseName(chengwei_value);
                    map.put("chengwei_value_chinese", chengwei_value_chinese);
                    map.put("gysjc_value", gysjc_value);
                    map.put("gysqc_value", gysqc_value);
                    map.put("shxydm", shxydm);
                    map.put("gsdjzh", gsdjzh);
                    map.put("yz_value", yz_value);
                    String yz_value_chinese = getYzChineseName(yz_value);
                    map.put("yz_value_chinese", yz_value_chinese);
                    map.put("gj_value", gj_value);
                    String gj_value_chinese = getGjChineseName(gj_value);
                    map.put("gj_value_chinese", gj_value_chinese);
                    map.put("region_value", region_value);
                    String region_value_chinese = getResionChineseName(region_value);
                    map.put("region_value_chinese", region_value_chinese);
                    map.put("dqcs_value", dqcs_value);
                    map.put("jdmp_value", jdmp_value);
                    map.put("yzbm_value", yzbm_value);
                    map.put("dhhm_value", dhhm_value);
                    map.put("dhfj_value", dhfj_value);
                    map.put("czhm_value", czhm_value);
                    map.put("czfj_value", czfj_value);
                    map.put("dzyj_value", dzyj_value);
                    map.put("myhb_value", myhb_value);
                    String myhb_value_chinese = getMyhbChineseName(myhb_value);
                    map.put("myhb_value_chinese", myhb_value_chinese);
                    map.put("djbz_value", djbz_value);
                    map.put("spzt", spzt);
                    map.put("sqr_value", sqr_value);
                    map.put("sqrq_value", sqrq_value);
                    map.put("sqsj_value", sqsj_value);
                    map.put("operation", operation);
                    map.put("zczb", zczb);
                    map.put("qgzzjgdm", qgzzjgdm);
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
     * 根据贸易伙伴code查询中文显示名字 TODO
     * 
     * @param yzcode
     * @return
     */
    public String getMyhbChineseName(String mycode) {
        String sql = "select mc from uf_myhb where zt='0' and dm = '"+mycode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("mc"));
        return gj_name;
    }
    
    /**
     * 根据语种code查询中文显示名字
     * 
     * @param yzcode
     * @return
     */
    public String getYzChineseName(String yzcode) {
        String sql = "select mc from uf_yzmc where zt='0' and dm = '"+yzcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("mc"));
        return gj_name;
    }
    
    /**
     * 根据地区code查询中文显示名字
     * 
     * @param regioncode
     * @return
     */
    public String getResionChineseName(String regioncode) {
        String sql = "select dqmc from uf_dq where zt='0' and dqdm = '"+regioncode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("dqmc"));
        return gj_name;
    }
    
    /**
     * 根据国家code查询中文显示名字
     * 
     * @param gjcode
     * @return
     */
    public String getGjChineseName(String gjcode) {
        String sql = "select mc from uf_gj where dm = '"+gjcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("mc"));
        return gj_name;
    }
    
    /**
     * 根据账户组code查询中文显示名字
     * 
     * @param zhzcode
     * @return
     */
    public String getZHZChineseName(String zhzcode) {
        String sql = "select mc from uf_zhz where zt='0' and dm = '"+zhzcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String zhz_name = Util.null2o(rs.getString("mc"));
        return zhz_name;
    }
    
    /**
     * 根据称谓code查询中文显示名字
     * 
     * @param cwcode
     * @return
     */
    public String getCWChineseName(String cwcode) {
        String sql = "select mc from uf_cw where zt='0' and dm = '"+cwcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String cw_name = Util.null2o(rs.getString("mc"));
        return cw_name;
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
        GYSPublicMethod GYSPublicMethod = new GYSPublicMethod();
        JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        VendorsQuery vendorsQuery = new VendorsQuery();
        VendorsCriteria vendorsCriteria = new VendorsCriteria();
        vendorsCriteria.setLIFNR(GYSPublicMethod.setTextCriteria("AAAABBBB"));
        vendorsQuery.setCriteria(vendorsCriteria);
        VendorsResultSet vendorsResultSet = null;
        try {
            vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println(vendorsResultSet.getExecutionStatus().getDescription());
    }
}
