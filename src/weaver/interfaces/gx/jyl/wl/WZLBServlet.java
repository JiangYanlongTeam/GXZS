package weaver.interfaces.gx.jyl.wl;

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

import jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Criteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Query;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.Materials;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCriteria;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery;
import jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet;
import jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup;
import jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALViProxy;

import beans.ws.mdm.sap.com.BooleanConstraint;
import beans.ws.mdm.sap.com.BooleanCriteria;
import beans.ws.mdm.sap.com.PicklistConstraint;
import beans.ws.mdm.sap.com.PicklistCriteria;
import beans.ws.mdm.sap.com.RecordIdentifierConstraint;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class WZLBServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private WLPublicMethod publicmethod = new WLPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String flag = Util.null2String(request.getParameter("flag"));
        String wlbh = Util.null2String(request.getParameter("wlbh"));
        String djbs = Util.null2String(request.getParameter("djbz"));
        String wzz = Util.null2String(request.getParameter("wzz"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String wzms_search = Util.null2String(request.getParameter("ms"));
        String hyly_search = Util.null2String(request.getParameter("hyly"));
        String start = Util.null2String(request.getParameter("start"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSONArray jsonArray = new JSONArray();
            JSGX_MDM_MATERIALViProxy f = new JSGX_MDM_MATERIALViProxy();
            MaterialsQuery banksQuery = new MaterialsQuery();
            MaterialsCriteria banksCriteria = new MaterialsCriteria();
            if(!"".equals(wzz)){
                MATKL__Query MATKL__Query = new MATKL__Query();
                MATKL__Criteria MATKL__Criteria = new MATKL__Criteria();
                MATKL__Criteria.setCode(publicmethod.setTextCriteria(wzz));
                MATKL__Query.setCriteria(MATKL__Criteria);
                MATKL__ResultSet MATKL__ResultSet = null;
                try {
                    MATKL__ResultSet = f.searchMATKL(MATKL__Query, publicmethod.setReposInfo());
                } catch (RemoteException e1) {
                    e1.printStackTrace();
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                if(null != MATKL__ResultSet){
                    MATKL[] MATKLs = MATKL__ResultSet.getMATKL();
                    if(null != MATKLs && MATKLs.length > 0) {
                        PicklistCriteria PicklistCriteria = new PicklistCriteria();
                        PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                        PicklistConstraint PicklistConstraint = new PicklistConstraint();
                        PicklistConstraint.setExpressionOperator("EQUALS");
                        RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                        RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                        RecordIdentifierConstraint.setInternalID(MATKL__ResultSet.getMATKL()[0].getRecordIdentification().getInternalID());
                        RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                        PicklistConstraint.setValue(RecordIdentifierConstraints);
                        PicklistConstraints[0] = PicklistConstraint;
                        PicklistCriteria.setConstraint(PicklistConstraints);
                        banksCriteria.setMATKL(PicklistCriteria);
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
            if(!"".equals(wlbh)){
                banksCriteria.setMATNR(setTextCriteria(wlbh));
            }
            if(!"".equals(sqdh)){
                banksCriteria.setApplyNumber(setTextCriteria(sqdh));
            }
            if(!"".equals(wzms_search)){
                banksCriteria.setMAKTX(setTextCriteria(wzms_search));
            }
            if(!"".equals(djbs)) {
                BooleanCriteria BooleanCriteria = new BooleanCriteria();
                BooleanConstraint[] BooleanConstraints = new BooleanConstraint[1];
                BooleanConstraint BooleanConstraint = new BooleanConstraint();
                BooleanConstraint.setValue(false);
                BooleanConstraints[0] = BooleanConstraint;
                BooleanCriteria.setConstraint(BooleanConstraints);
                banksCriteria.setLVOMA(BooleanCriteria);
            }
            if(!"".equals(hyly_search)){
                IndustrySectorQuery IndustrySectorQuery = new IndustrySectorQuery();
                IndustrySectorCriteria IndustrySectorCriteria = new IndustrySectorCriteria();
                IndustrySectorCriteria.setCode(publicmethod.setTextCriteria(hyly_search));
                IndustrySectorQuery.setCriteria(IndustrySectorCriteria);
                IndustrySectorResultSet IndustrySectorResultSet = f.searchIndustrySector(IndustrySectorQuery, publicmethod.setReposInfo());
                if(null != IndustrySectorResultSet) {
                    IndustrySector[] IndustrySectors = IndustrySectorResultSet.getIndustrySector();
                    if(null != IndustrySectors && IndustrySectors.length > 0) {
                        PicklistCriteria PicklistCriteria = new PicklistCriteria();
                        PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                        PicklistConstraint PicklistConstraint = new PicklistConstraint();
                        PicklistConstraint.setExpressionOperator("EQUALS");
                        RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                        RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                        RecordIdentifierConstraint.setInternalID(IndustrySectors[0].getRecordIdentification().getInternalID());
                        RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                        PicklistConstraint.setValue(RecordIdentifierConstraints);
                        PicklistConstraints[0] = PicklistConstraint;
                        PicklistCriteria.setConstraint(PicklistConstraints);
                        banksCriteria.setMBRSH(PicklistCriteria);
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
                MaterialsResultSet BankAccountResultSet = f.searchMaterials(banksQuery, publicmethod.setReposInfo());
                Materials[] BankAccounts = BankAccountResultSet.getMaterials();
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
                    //物资组
                    String wzz_value = "";
                    MATKL__Lookup TradePartnersLookup = BankAccounts[i].getMATKL();
                    if(null != TradePartnersLookup) {
                        wzz_value = TradePartnersLookup.getDisplayValue();
                    }
                    //物料编号
                    String wzbh_value = BankAccounts[i].getMATNR();
                    //基本计量单位
                    MEINS__Lookup countriesLookup = BankAccounts[i].getMEINS();
                    String jbjldw_value = "";
                    if(null != countriesLookup){
                        jbjldw_value = countriesLookup.getDisplayValue();
                    }
                    //物资描述
                    String wzms_value = BankAccounts[i].getMAKTX();
                    //特征描述
                    String tzms_value = BankAccounts[i].get_char();
                    //行业领域
                    String hyly_value = "";
                    IndustrySectorLookup IndustrySectorLookup = BankAccounts[i].getMBRSH();
                    if(null != IndustrySectorLookup) {
                        hyly_value = IndustrySectorLookup.getDisplayValue();
                    }
                    //物资类型
                    String wzlx_value = "";
                    MaterialTypeLookup MaterialTypeLookup = BankAccounts[i].getMTART();
                    if(null != MaterialTypeLookup) {
                        wzlx_value = MaterialTypeLookup.getDisplayValue();
                    }
                    //产品组
                    String cpz_value = "";
                    ProductGroupLookup CurrencyLookup = BankAccounts[i].getSPART();
                    if(null != CurrencyLookup) {
                        cpz_value = CurrencyLookup.getDisplayValue();
                    }
                    //普通项目类别组
                    String ptxmlbz_value = "";
                    MTPOS__Lookup ApprovalStatusLookup = BankAccounts[i].getMTPOS();
                    if(null != ApprovalStatusLookup) {
                        ptxmlbz_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbs_value = BankAccounts[i].getLVOMA();
                    //审批状态
                    String spzt_value = "";
                    ApprovalStatusLookup app = BankAccounts[i].getAPCOD();
                    if(null != app) {
                        spzt_value = app.getDisplayValue();
                    }
                    //申请人
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
                            ClientLookup clientSystemsLookup = service.getCLIENT_SYSTEM();
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
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+wzbh_value+"')\">"+wzbh_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("wzbh_value", jjzxdm_val);
                    } else {
                        jo.put("wzbh_value", wzbh_value);
                    }
                    jo.put("sqdh_value", sqdh_value);
                    jo.put("wzz_value", wzz_value);
                    String wzz_value_chinese = getWzzChinese(wzz_value);
                    jo.put("wzz_value_chinese", wzz_value_chinese);
                    jo.put("jbjldw_value", jbjldw_value);
                    String jbjldw_value_chinese = getJbjldwChinese(jbjldw_value);
                    jo.put("jbjldw_value_chinese", jbjldw_value_chinese);
                    jo.put("wzms_value", wzms_value);
                    jo.put("tzms_value", tzms_value);
                    jo.put("hyly_value", hyly_value);
                    String hyly_value_chinese = getHylyChinese(hyly_value);
                    jo.put("hyly_value_chinese", hyly_value_chinese);
                    jo.put("wzlx_value", wzlx_value);
                    String wzlx_value_chinese = getWzlxChinese(wzlx_value);
                    jo.put("wzlx_value_chinese", wzlx_value_chinese);
                    jo.put("cpz_value", cpz_value);
                    String cpz_value_chinese = getCpzChinese(cpz_value);
                    jo.put("cpz_value_chinese", cpz_value_chinese);
                    jo.put("ptxmlbz_value", ptxmlbz_value);
                    String ptxmlbz_value_chinese = getPtxmlbzChinese(ptxmlbz_value);
                    jo.put("ptxmlbz_value_chinese", ptxmlbz_value_chinese);
                    jo.put("djbs_value", djbs_value);
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
     * 根据物料编号查询数据-供基本信息和服务关系用
     * 
     * @param gysbh
     * @return
     */
    public Map<String,Object> getdata(String wlbh) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_MATERIALViProxy f = new JSGX_MDM_MATERIALViProxy();
            MaterialsQuery banksQuery = new MaterialsQuery();
            MaterialsCriteria banksCriteria = new MaterialsCriteria();
            if(!"".equals(wlbh)){
                banksCriteria.setMATNR(publicmethod.setTextCriteria(wlbh));
            }
            banksQuery.setCriteria(banksCriteria);
            try {
                MaterialsResultSet BankAccountResultSet = f.searchMaterials(banksQuery, publicmethod.setReposInfo());
                Materials[] BankAccounts = BankAccountResultSet.getMaterials();
                if(null == BankAccounts) {
                    return new HashMap<String,Object>();
                }
                for(int i = 0 ; i < 1; i++){
                    //申请号
                    String sqdh_value = BankAccounts[i].getApplyNumber();
                    //物资组
                    String wzz_value = "";
                    MATKL__Lookup TradePartnersLookup = BankAccounts[i].getMATKL();
                    if(null != TradePartnersLookup) {
                        wzz_value = TradePartnersLookup.getDisplayValue();
                    }
                    //物料编号
                    String wzbh_value = BankAccounts[i].getMATNR();
                    //基本计量单位
                    MEINS__Lookup countriesLookup = BankAccounts[i].getMEINS();
                    String jbjldw_value = "";
                    if(null != countriesLookup){
                        jbjldw_value = countriesLookup.getDisplayValue();
                    }
                    //物资描述
                    String wzms_value = BankAccounts[i].getMAKTX();
                    //特征描述
                    String tzms_value = BankAccounts[i].get_char();
                    //行业领域
                    String hyly_value = "";
                    IndustrySectorLookup IndustrySectorLookup = BankAccounts[i].getMBRSH();
                    if(null != IndustrySectorLookup) {
                        hyly_value = IndustrySectorLookup.getDisplayValue();
                    }
                    //物资类型
                    String wzlx_value = "";
                    MaterialTypeLookup MaterialTypeLookup = BankAccounts[i].getMTART();
                    if(null != MaterialTypeLookup) {
                        wzlx_value = MaterialTypeLookup.getDisplayValue();
                    }
                    //产品组
                    String cpz_value = "";
                    ProductGroupLookup CurrencyLookup = BankAccounts[i].getSPART();
                    if(null != CurrencyLookup) {
                        cpz_value = CurrencyLookup.getDisplayValue();
                    }
                    //普通项目类别组
                    String ptxmlbz_value = "";
                    MTPOS__Lookup ApprovalStatusLookup = BankAccounts[i].getMTPOS();
                    if(null != ApprovalStatusLookup) {
                        ptxmlbz_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbs_value = BankAccounts[i].getLVOMA();
                    //审批状态
                    String spzt_value = "";
                    ApprovalStatusLookup app = BankAccounts[i].getAPCOD();
                    if(null != app) {
                        spzt_value = app.getDisplayValue();
                    }
                    //申请人
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
                            ClientLookup clientSystemsLookup = service.getCLIENT_SYSTEM();
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
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+wzbh_value+"')\">"+wzbh_value+"</a>";
                    if(!"".equals("")){
                        map.put("wzbh_value", jjzxdm_val);
                    } else {
                        map.put("wzbh_value", wzbh_value);
                    }
                    map.put("sqdh_value", sqdh_value);
                    map.put("wzz_value", wzz_value);
                    String wzz_value_chinese = getWzzChinese(wzz_value);
                    map.put("wzz_value_chinese", wzz_value_chinese);
                    map.put("jbjldw_value", jbjldw_value);
                    String jbjldw_value_chinese = getJbjldwChinese(jbjldw_value);
                    map.put("jbjldw_value_chinese", jbjldw_value_chinese);
                    map.put("wzms_value", wzms_value);
                    map.put("tzms_value", tzms_value);
                    map.put("hyly_value", hyly_value);
                    String hyly_value_chinese = getHylyChinese(hyly_value);
                    map.put("hyly_value_chinese", hyly_value_chinese);
                    map.put("wzlx_value", wzlx_value);
                    String wzlx_value_chinese = getWzlxChinese(wzlx_value);
                    map.put("wzlx_value_chinese", wzlx_value_chinese);
                    map.put("cpz_value", cpz_value);
                    String cpz_value_chinese = getCpzChinese(cpz_value);
                    map.put("cpz_value_chinese", cpz_value_chinese);
                    map.put("ptxmlbz_value", ptxmlbz_value);
                    String ptxmlbz_value_chinese = getPtxmlbzChinese(ptxmlbz_value);
                    map.put("ptxmlbz_value_chinese", ptxmlbz_value_chinese);
                    map.put("djbs_value", djbs_value);
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
     * 获取普通项目类别组中文名
     * 
     * @param ptxmlbz
     * @return
     */
    public String getPtxmlbzChinese(String ptxmlbz) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_xmlb where zt='0' and dm = '"+ptxmlbz+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 获取产品组中文名
     * 
     * @param cpz
     * @return
     */
    public String getCpzChinese(String cpz) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_cpz where zt='0' and dm = '"+cpz+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 获取物资类型中文名
     * 
     * @param wzlx
     * @return
     */
    public String getWzlxChinese(String wzlx) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_wllx where zt='0' and dm = '"+wzlx+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 获取行业领域中文名
     * 
     * @param hyly
     * @return
     */
    public String getHylyChinese(String hyly) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_hyly  where zt='0' and dm = '"+hyly+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 获取基本计量单位名称
     * 
     * @param jbjldw
     * @return
     */
    public String getJbjldwChinese(String jbjldw) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_jldw  where zt='0' and dm = '"+jbjldw+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 获取物资组中文名
     * 
     * @param wzzvalue
     * @return
     */
    public String getWzzChinese(String wzzvalue) {
        RecordSet rs = new RecordSet();
        rs.execute("select wzlbmc from uf_materialkind where zt='0' and wzlbbm = '"+wzzvalue+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("wzlbmc"));
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
    
    private int getInt(String strValue,int defValue){
        try {
            return Integer.parseInt(strValue);
        } catch (Exception ex) {
            return defValue;
        }
    }
    
    public static void main(String[] args) {
        WLPublicMethod publicmethod = new WLPublicMethod();
        JSGX_MDM_MATERIALViProxy f = new JSGX_MDM_MATERIALViProxy();
        MATKL__Query MATKL__Query = new MATKL__Query();
        MATKL__Criteria MATKL__Criteria = new MATKL__Criteria();
        MATKL__Criteria.setCode(publicmethod.setTextCriteria("N110305"));
        MATKL__Query.setCriteria(MATKL__Criteria);
        MATKL__ResultSet MATKL__ResultSet = null;
        try {
            MATKL__ResultSet = f.searchMATKL(MATKL__Query, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        MaterialsQuery banksQuery = new MaterialsQuery();
        MaterialsCriteria banksCriteria = new MaterialsCriteria();
        if(!"".equals("D01")){
            PicklistCriteria PicklistCriteria = new PicklistCriteria();
            PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
            PicklistConstraint PicklistConstraint = new PicklistConstraint();
            PicklistConstraint.setExpressionOperator("EQUALS");
            RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
            RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
            RecordIdentifierConstraint.setInternalID(MATKL__ResultSet.getMATKL()[0].getRecordIdentification().getInternalID());
            RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
            PicklistConstraint.setValue(RecordIdentifierConstraints);
            PicklistConstraints[0] = PicklistConstraint;
            PicklistCriteria.setConstraint(PicklistConstraints);
            banksCriteria.setMATKL(PicklistCriteria);
        }
        banksQuery.setCriteria(banksCriteria);
        MaterialsResultSet BankAccountResultSet = null;
        try {
            BankAccountResultSet = f.searchMaterials(banksQuery, publicmethod.setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        Materials[] BankAccounts = BankAccountResultSet.getMaterials();
        for(Materials s : BankAccounts) {
            System.out.println(s.getMATNR());
        }
    }
    
}
