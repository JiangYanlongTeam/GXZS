package weaver.interfaces.gx.jyl.kh;

import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.BooleanConstraint;
import beans.ws.mdm.sap.com.BooleanCriteria;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.*;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;

public class KHServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private KHPublicMethod publicmethod = new KHPublicMethod();
    private PublicMethod PublicMethod = new PublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String khbh = Util.null2String(request.getParameter("khbh"));
        String userid = Util.null2String(request.getParameter("userid"));
        String flag = Util.null2String(request.getParameter("flag"));
        String khqc = Util.null2String(request.getParameter("khqc"));
        String start = Util.null2String(request.getParameter("start"));
        String djbs = Util.null2String(request.getParameter("djbz"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String shxydms = Util.null2String(request.getParameter("shxydm"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            CustomersQuery customersQuery = new CustomersQuery();
            CustomersCriteria customersCriteria = new CustomersCriteria();
            if(!"".equals(userid)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("EQUALS");
                if(!"".equals(flag) && !"系统管理员".equals(userid.trim())){
                    userid = getUserId(userid);
                }
                if(!"".equals(flag) && "系统管理员".equals(userid.trim())){
                    userid = "1";
                }
                textConstraint.setValue(userid);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                customersCriteria.setApplicant(textCriteria);
            }
            //基金中心代码 查询条件
            if(!"".equals(khbh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(khbh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                customersCriteria.setKUNNR(textCriteria);
            }
            if(!"".equals(sqdh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(sqdh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                customersCriteria.setApplyNumber(textCriteria);
            }
            if(!"".equals(djbs)) {
                BooleanCriteria BooleanCriteria = new BooleanCriteria();
                BooleanConstraint[] BooleanConstraints = new BooleanConstraint[1];
                BooleanConstraint BooleanConstraint = new BooleanConstraint();
                BooleanConstraint.setValue(false);
                BooleanConstraints[0] = BooleanConstraint;
                BooleanCriteria.setConstraint(BooleanConstraints);
                customersCriteria.setSPERM(BooleanCriteria);
            }
            //基金中心名称 查询条件
            if(!"".equals(khqc)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(khqc);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                customersCriteria.setFULL_NAME(textCriteria);
            }
            if(!"".equals(shxydms)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(shxydms);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                customersCriteria.setSTCEG(textCriteria);
            }
            customersQuery.setCriteria(customersCriteria);
            CustomersResultSet fundcenterResultSet = null;
            try {
                fundcenterResultSet = f.searchCustomers(customersQuery, publicmethod.setReposInfo());
                Customers[] customers = fundcenterResultSet.getCustomers();
                JSONArray jsonArray = new JSONArray();
                if(null == customers) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = customers.length < end ? customers.length : end;
                
                
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //客户编号
                    String khbh_value = customers[i].getKUNNR();
                    //申请号
                    String applyNumber_value = customers[i].getApplyNumber();
                    //账户组
                    CustomerAccountGroupsLookup customerAccountGroupsLookup = customers[i].getKTOKD();
                    String zhz_value = "";
                    if(null != customerAccountGroupsLookup){
                        zhz_value = customerAccountGroupsLookup.getDisplayValue();
                    }
                    //称谓
                    TitlesLookup titlesLookup = customers[i].getANRED();
                    String chengwei_value = "";
                    if(null != titlesLookup) {
                        chengwei_value = titlesLookup.getDisplayValue();
                    }
                    //客户简称
                    String khjc_value = customers[i].getNAME1();
                    //客户全称
                    String khqc_value = customers[i].getFULL_NAME();
                    //客户类型
                    String khlx_value = "";
                    CustomerTypeLookup customerTypeLookup = customers[i].getKUKLA();
                    if(null != customerTypeLookup) {
                        khlx_value = customerTypeLookup.getDisplayValue();
                    }
                    //税号\统一社会信用代码
                    String shxydm = customers[i].getSTCEG();
                    //工商登记证号
                    String gsdjzh = customers[i].getSTCD1();
                    //全国组织机构代码
                    String qgzzjgdm = customers[i].getSTCD5();
                    //关键词1
                    String gjc1 = customers[i].getSORT1();
                    //关键词2
                    String gjc2 = customers[i].getSORT2();
                    //语种
                    LanguagesLookup languagesLookup = customers[i].getSPRAS();
                    String yz_value = "";
                    if(null != languagesLookup) {
                        yz_value = languagesLookup.getDisplayValue();
                    }
                    //国家
                    CountriesLookup countriesLookup = customers[i].getLAND1();
                    String gj_value = "";
                    if(null != countriesLookup) {
                        gj_value = countriesLookup.getDisplayValue();
                    }
                    //地区
                    RegionsLookup cus = customers[i].getREGIO();
                    String region_value = "";
                    if(null != cus) {
                        region_value = cus.getDisplayValue();
                    }
                    //地区城市
                    String dqcs_value = customers[i].getORT01();
                    //街道/门牌号
                    String jdmp_value = customers[i].getSTREET();
                    //邮政编码
                    String yzbm_value = customers[i].getPSTLZ();
                    //电话号码
                    String dhhm_value = customers[i].getTEL_NUMBER();
                    //电话分机号
                    String dhfj_value = customers[i].getTEL_EXTENS();
                    //传真号
                    String czhm_value = customers[i].getFAX_NUMBER();
                    //传真分机号
                    String czfj_value = customers[i].getFAX_EXTENS();
                    //电子邮件
                    String dzyj_value = customers[i].getSMTP_ADDR();
                    //贸易伙伴
                    String myhb_value = "";
                    TradePartnersLookup hb = customers[i].getVBUND();
                    if(null != hb){
                        myhb_value = hb.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbz_value = customers[i].getSPERM();
                    //供应商编号
                    String gys_value = customers[i].getLIFNR();
                    //纳税人意见
                    String nsr_str = "";
                    boolean nsr_value = customers[i].getSTKZU();
                    if(nsr_value){
                        nsr_str = "有纳税人资格";
                    }else{
                        nsr_str = "无纳税人资格";
                    }
                    //银行字表
                    BankAccountsTuple[] bankAccountsTuples = customers[i].getBankDetails();
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
                    ApprovalStatusLookup approvalStatusLookup = customers[i].getAPCOD();
                    String spzt = "";
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = customers[i].getApplicant();
                    String update_value = customers[i].getUpdateBy();
                    Calendar sqrq = customers[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = customers[i].getApplyTime();
                    if(null != sqsj) {
                        sqsj.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    OperationLookup operationLookup = customers[i].getOperation();
                    String operation = "";
                    if(null != operationLookup) {
                        operation = operationLookup.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = customers[i].getServiceRelationshipsTuple();
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
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+khbh_value+"')\">"+khbh_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("khbh", jjzxdm_val);
                    } else {
                        jo.put("khbh", khbh_value);
                    }
                    jo.put("applyNumber_value", applyNumber_value);
                    jo.put("zhz_value", zhz_value);
                    String zhz_value_chinese = PublicMethod.getZHZChineseName(zhz_value);
                    jo.put("zhz_value_chinese", zhz_value_chinese);
                    jo.put("chengwei_value", chengwei_value);
                    String chengwei_value_chinese = PublicMethod.getCWChineseName(chengwei_value);
                    jo.put("chengwei_value_chinese", chengwei_value_chinese);
                    jo.put("khjc_value", khjc_value);
                    jo.put("khqc_value", khqc_value);
                    jo.put("khlx_value", khlx_value);
                    String khlx_value_chinese = PublicMethod.getKhlxChineseName(khlx_value);
                    jo.put("khlx_value_chinese", khlx_value_chinese);
                    jo.put("shxydm", shxydm);
                    jo.put("gjc1", gjc1);
                    jo.put("gjc2", gjc2);
                    jo.put("yz_value", yz_value);
                    String yzbm_value_chinese = PublicMethod.getYzChineseName(yz_value);
                    jo.put("yzbm_value_chinese", yzbm_value_chinese);
                    jo.put("gj_value", gj_value);
                    String gj_value_chinese = PublicMethod.getGjChineseName(gj_value);
                    jo.put("gj_value_chinese", gj_value_chinese);
                    jo.put("region_value", region_value);
                    String region_value_chinese = PublicMethod.getResionChineseName(region_value);
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
                    String myhb_value_chinese = PublicMethod.getMyhbChineseName(myhb_value);
                    jo.put("myhb_value_chinese", myhb_value_chinese);
                    jo.put("djbz_value", djbz_value);
                    jo.put("nsr_value", nsr_str);
                    jo.put("spzt", spzt);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("operation", operation);
                    jo.put("gys_value", gys_value);
                    jo.put("gsdjzh", gsdjzh);
                    jo.put("qgzzjgdm", qgzzjgdm);
                    jo.put("update_value", update_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", customers.length);
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
     * 根据客户编号查询数据-供基本信息和服务关系用
     * 
     * @param gysbh
     * @return
     */
    public Map<String,Object> getdata(String khbh) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            CustomersQuery customersQuery = new CustomersQuery();
            CustomersCriteria customersCriteria = new CustomersCriteria();
            //基金中心代码 查询条件
            if(!"".equals(khbh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(khbh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                customersCriteria.setKUNNR(textCriteria);
            }
            customersQuery.setCriteria(customersCriteria);
            CustomersResultSet fundcenterResultSet = null;
            try {
                fundcenterResultSet = f.searchCustomers(customersQuery, publicmethod.setReposInfo());
                Customers[] customers = fundcenterResultSet.getCustomers();
                if(null == customers) {
                    return new HashMap<String,Object>();
                }
                
                for(int i = 0 ; i < 1; i++){
                    //客户编号
                    String khbh_value = customers[i].getKUNNR();
                    //申请号
                    String applyNumber_value = customers[i].getApplyNumber();
                    //账户组
                    CustomerAccountGroupsLookup customerAccountGroupsLookup = customers[i].getKTOKD();
                    String zhz_value = "";
                    if(null != customerAccountGroupsLookup){
                        zhz_value = customerAccountGroupsLookup.getDisplayValue();
                    }
                    //称谓
                    TitlesLookup titlesLookup = customers[i].getANRED();
                    String chengwei_value = "";
                    if(null != titlesLookup) {
                        chengwei_value = titlesLookup.getDisplayValue();
                    }
                    //客户简称
                    String khjc_value = customers[i].getNAME1();
                    //客户全称
                    String khqc_value = customers[i].getFULL_NAME();
                    //客户类型
                    String khlx_value = "";
                    CustomerTypeLookup customerTypeLookup = customers[i].getKUKLA();
                    if(null != customerTypeLookup) {
                        khlx_value = customerTypeLookup.getDisplayValue();
                    }
                    //税号\统一社会信用代码
                    String shxydm = customers[i].getSTCEG();
                    //工商登记证号
                    String gsdjzh = customers[i].getSTCD1();
                    //全国组织机构代码
                    String qgzzjgdm = customers[i].getSTCD5();
                    //关键词1
                    String gjc1 = customers[i].getSORT1();
                    //关键词2
                    String gjc2 = customers[i].getSORT2();
                    //语种
                    LanguagesLookup languagesLookup = customers[i].getSPRAS();
                    String yz_value = "";
                    if(null != languagesLookup) {
                        yz_value = languagesLookup.getDisplayValue();
                    }
                    //国家
                    CountriesLookup countriesLookup = customers[i].getLAND1();
                    String gj_value = "";
                    if(null != countriesLookup) {
                        gj_value = countriesLookup.getDisplayValue();
                    }
                    //地区
                    RegionsLookup cus = customers[i].getREGIO();
                    String region_value = "";
                    if(null != cus) {
                        region_value = cus.getDisplayValue();
                    }
                    //地区城市
                    String dqcs_value = customers[i].getORT01();
                    //街道/门牌号
                    String jdmp_value = customers[i].getSTREET();
                    //邮政编码
                    String yzbm_value = customers[i].getPSTLZ();
                    //电话号码
                    String dhhm_value = customers[i].getTEL_NUMBER();
                    //电话分机号
                    String dhfj_value = customers[i].getTEL_EXTENS();
                    //传真号
                    String czhm_value = customers[i].getFAX_NUMBER();
                    //传真分机号
                    String czfj_value = customers[i].getFAX_EXTENS();
                    //电子邮件
                    String dzyj_value = customers[i].getSMTP_ADDR();
                    //贸易伙伴
                    String myhb_value = "";
                    TradePartnersLookup hb = customers[i].getVBUND();
                    if(null != hb){
                        myhb_value = hb.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbz_value = customers[i].getSPERM();
                    //供应商编号
                    String gys_value = customers[i].getLIFNR();
                    //纳税人意见
                    String nsr_str = "";
                    boolean nsr_value = customers[i].getSTKZU();
                    if(nsr_value){
                        nsr_str = "有纳税人资格";
                    }else{
                        nsr_str = "无纳税人资格";
                    }
                    //银行字表
                    BankAccountsTuple[] bankAccountsTuples = customers[i].getBankDetails();
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
                    ApprovalStatusLookup approvalStatusLookup = customers[i].getAPCOD();
                    String spzt = "";
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = customers[i].getApplicant();
                    String update_value = customers[i].getUpdateBy();
                    Calendar sqrq = customers[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = customers[i].getApplyTime();
                    if(null != sqsj) {
                        sqsj.add(Calendar.HOUR_OF_DAY, -8);
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    OperationLookup operationLookup = customers[i].getOperation();
                    String operation = "";
                    if(null != operationLookup) {
                        operation = operationLookup.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = customers[i].getServiceRelationshipsTuple();
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
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+khbh_value+"')\">"+khbh_value+"</a>";
                    if(!"".equals("")){
                        map.put("khbh", jjzxdm_val);
                    } else {
                        map.put("khbh", khbh_value);
                    }
                    map.put("applyNumber_value", applyNumber_value);
                    map.put("zhz_value", zhz_value);
                    String zhz_value_chinese = PublicMethod.getZHZChineseName(zhz_value);
                    map.put("zhz_value_chinese", zhz_value_chinese);
                    map.put("chengwei_value", chengwei_value);
                    String chengwei_value_chinese = PublicMethod.getCWChineseName(chengwei_value);
                    map.put("chengwei_value_chinese", chengwei_value_chinese);
                    map.put("khjc_value", khjc_value);
                    map.put("khqc_value", khqc_value);
                    map.put("khlx_value", khlx_value);
                    String khlx_value_chinese = PublicMethod.getKhlxChineseName(khlx_value);
                    map.put("khlx_value_chinese", khlx_value_chinese);
                    map.put("shxydm", shxydm);
                    map.put("gjc1", gjc1);
                    map.put("gjc2", gjc2);
                    map.put("yz_value", yz_value);
                    String yzbm_value_chinese = PublicMethod.getYzChineseName(yz_value);
                    map.put("yzbm_value_chinese", yzbm_value_chinese);
                    map.put("gj_value", gj_value);
                    String gj_value_chinese = PublicMethod.getGjChineseName(gj_value);
                    map.put("gj_value_chinese", gj_value_chinese);
                    map.put("region_value", region_value);
                    String region_value_chinese = PublicMethod.getResionChineseName(region_value);
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
                    String myhb_value_chinese = PublicMethod.getMyhbChineseName(myhb_value);
                    map.put("myhb_value_chinese", myhb_value_chinese);
                    map.put("djbz_value", djbz_value);
                    map.put("nsr_value", nsr_str);
                    map.put("spzt", spzt);
                    map.put("sqr_value", sqr_value);
                    map.put("sqrq_value", sqrq_value);
                    map.put("sqsj_value", sqsj_value);
                    map.put("operation", operation);
                    map.put("gys_value", gys_value);
                    map.put("gsdjzh", gsdjzh);
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
        KHPublicMethod publicmethod = new KHPublicMethod();
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
            CustomersQuery customersQuery = new CustomersQuery();
            CustomersCriteria customersCriteria = new CustomersCriteria();
            //基金中心代码 查询条件
            if(!"".equals("")){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue("200000011");
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                customersCriteria.setKUNNR(textCriteria);
            }
            customersQuery.setCriteria(customersCriteria);
            CustomersResultSet fundcenterResultSet = null;
            try {
                fundcenterResultSet = f.searchCustomers(customersQuery, publicmethod.setReposInfo());
                Customers[] customers = fundcenterResultSet.getCustomers();
                
                for(int i = 0 ; i < 1; i++){
                    //客户编号
                    String khbh_value = customers[i].getKUNNR();
                    //申请号
                    String applyNumber_value = customers[i].getApplyNumber();
                    //账户组
                    CustomerAccountGroupsLookup customerAccountGroupsLookup = customers[i].getKTOKD();
                    String zhz_value = "";
                    if(null != customerAccountGroupsLookup){
                        zhz_value = customerAccountGroupsLookup.getDisplayValue();
                    }
                    //称谓
                    TitlesLookup titlesLookup = customers[i].getANRED();
                    String chengwei_value = "";
                    if(null != titlesLookup) {
                        chengwei_value = titlesLookup.getDisplayValue();
                    }
                    //客户简称
                    String khjc_value = customers[i].getNAME1();
                    //客户全称
                    String khqc_value = customers[i].getFULL_NAME();
                    //客户类型
                    String khlx_value = "";
                    CustomerTypeLookup customerTypeLookup = customers[i].getKUKLA();
                    if(null != customerTypeLookup) {
                        khlx_value = customerTypeLookup.getDisplayValue();
                    }
                    //税号\统一社会信用代码
                    String shxydm = customers[i].getSTCEG();
                    //工商登记证号
                    String gsdjzh = customers[i].getSTCD1();
                    //全国组织机构代码
                    String qgzzjgdm = customers[i].getSTCEG();
                    //关键词1
                    String gjc1 = customers[i].getSORT1();
                    //关键词2
                    String gjc2 = customers[i].getSORT2();
                    //语种
                    LanguagesLookup languagesLookup = customers[i].getSPRAS();
                    String yz_value = "";
                    if(null != languagesLookup) {
                        yz_value = languagesLookup.getDisplayValue();
                    }
                    //国家
                    CountriesLookup countriesLookup = customers[i].getLAND1();
                    String gj_value = "";
                    if(null != countriesLookup) {
                        gj_value = countriesLookup.getDisplayValue();
                    }
                    //地区
                    RegionsLookup cus = customers[i].getREGIO();
                    String region_value = "";
                    if(null != cus) {
                        region_value = cus.getDisplayValue();
                    }
                    //地区城市
                    String dqcs_value = customers[i].getORT01();
                    //街道/门牌号
                    String jdmp_value = customers[i].getSTREET();
                    //邮政编码
                    String yzbm_value = customers[i].getPSTLZ();
                    //电话号码
                    String dhhm_value = customers[i].getTEL_NUMBER();
                    //电话分机号
                    String dhfj_value = customers[i].getTEL_EXTENS();
                    //传真号
                    String czhm_value = customers[i].getFAX_NUMBER();
                    //传真分机号
                    String czfj_value = customers[i].getFAX_EXTENS();
                    //电子邮件
                    String dzyj_value = customers[i].getSMTP_ADDR();
                    //贸易伙伴
                    String myhb_value = "";
                    TradePartnersLookup hb = customers[i].getVBUND();
                    if(null != hb){
                        myhb_value = hb.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbz_value = customers[i].getSPERM();
                    //供应商编号
                    String gys_value = customers[i].getLIFNR();
                    //纳税人意见
                    String nsr_str = "";
                    boolean nsr_value = customers[i].getSTKZU();
                    if(nsr_value){
                        nsr_str = "有纳税人资格";
                    }else{
                        nsr_str = "无纳税人资格";
                    }
                    //银行字表
                    BankAccountsTuple[] bankAccountsTuples = customers[i].getBankDetails();
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
                    ApprovalStatusLookup approvalStatusLookup = customers[i].getAPCOD();
                    String spzt = "";
                    if(null != approvalStatusLookup) {
                        spzt = approvalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = customers[i].getApplicant();
                    String update_value = customers[i].getUpdateBy();
                    Calendar sqrq = customers[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != sqrq) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(sqrq.getTime());
                    }
                    String sqsj_value = "";
                    Calendar sqsj = customers[i].getApplyTime();
                    if(null != sqsj) {
                        sqsj_value = new SimpleDateFormat("HH:mm").format(sqsj.getTime());
                    }
                    OperationLookup operationLookup = customers[i].getOperation();
                    String operation = "";
                    if(null != operationLookup) {
                        operation = operationLookup.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = customers[i].getServiceRelationshipsTuple();
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
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+khbh_value+"')\">"+khbh_value+"</a>";
                    if(!"".equals("")){
                        map.put("khbh", jjzxdm_val);
                    } else {
                        map.put("khbh", khbh_value);
                    }
                    map.put("applyNumber_value", applyNumber_value);
                    map.put("zhz_value", zhz_value);
                    map.put("chengwei_value", chengwei_value);
                    map.put("khjc_value", khjc_value);
                    map.put("khqc_value", khqc_value);
                    map.put("khlx_value", khlx_value);
                    map.put("shxydm", shxydm);
                    map.put("gjc1", gjc1);
                    map.put("gjc2", gjc2);
                    map.put("yz_value", yz_value);
                    map.put("gj_value", gj_value);
                    map.put("region_value", region_value);
                    map.put("dqcs_value", dqcs_value);
                    map.put("jdmp_value", jdmp_value);
                    map.put("yzbm_value", yzbm_value);
                    map.put("dhhm_value", dhhm_value);
                    map.put("dhfj_value", dhfj_value);
                    map.put("czhm_value", czhm_value);
                    map.put("czfj_value", czfj_value);
                    map.put("dzyj_value", dzyj_value);
                    map.put("myhb_value", myhb_value);
                    map.put("djbz_value", djbz_value);
                    map.put("nsr_value", nsr_str);
                    map.put("spzt", spzt);
                    map.put("sqr_value", sqr_value);
                    map.put("sqrq_value", sqrq_value);
                    map.put("sqsj_value", sqsj_value);
                    map.put("operation", operation);
                    map.put("gys_value", gys_value);
                    map.put("gsdjzh", gsdjzh);
                    map.put("qgzzjgdm", qgzzjgdm);
                    map.put("update_value", update_value);
                    System.out.println(map.get("client").toString());
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
}
