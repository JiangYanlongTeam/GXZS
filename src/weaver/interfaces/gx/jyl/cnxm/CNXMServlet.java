package weaver.interfaces.gx.jyl.cnxm;

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

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Client;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Commitmentltem;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.ws.mdm.sap.com.PicklistConstraint;
import beans.ws.mdm.sap.com.PicklistCriteria;
import beans.ws.mdm.sap.com.RecordIdentifierConstraint;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class CNXMServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private CNXMPublicMethod publicmethod = new CNXMPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String cnxmbm = Util.null2String(request.getParameter("cnxmbm"));
        String cnxmmc = Util.null2String(request.getParameter("cnxmmc"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String flag = Util.null2String(request.getParameter("flag"));
        String start = Util.null2String(request.getParameter("start"));
        String fwgx_search = Util.null2String(request.getParameter("fwgx"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
            JSONArray jsonArray = new JSONArray();
            CommitmentltemQuery CommitmentltemQuery = new CommitmentltemQuery();
            CommitmentltemCriteria CommitmentltemCriteria = new CommitmentltemCriteria();
            //承诺项目编码 查询条件
            if(!"".equals(cnxmbm)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(cnxmbm);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                CommitmentltemCriteria.setFIPOS(textCriteria);
            }
            if(!"".equals(fwgx_search)) {
                ClientQuery ClientQuery = new ClientQuery();
                ClientCriteria ClientCriteria = new ClientCriteria();
                ClientCriteria.setCode(publicmethod.setTextCriteria(fwgx_search));
                ClientQuery.setCriteria(ClientCriteria);
                ClientResultSet ClientResultSet = f.searchClient(ClientQuery, publicmethod.setReposInfo());
                if(null != ClientResultSet) {
                    Client[] Clients = ClientResultSet.getClient();
                    if(null != Clients && Clients.length > 0) {
                        PicklistCriteria PicklistCriteria = new PicklistCriteria();
                        PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                        PicklistConstraint PicklistConstraint = new PicklistConstraint();
                        PicklistConstraint.setExpressionOperator("EQUALS");
                        RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                        RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                        RecordIdentifierConstraint.setInternalID(Clients[0].getRecordIdentification().getInternalID());
                        RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                        PicklistConstraint.setValue(RecordIdentifierConstraints);
                        PicklistConstraints[0] = PicklistConstraint;
                        PicklistCriteria.setConstraint(PicklistConstraints);
                        CommitmentltemCriteria.setServiceRelationshipsTupleCLIENT_SYSTEM(PicklistCriteria);
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
            //承诺项目名称 查询条件
            if(!"".equals(cnxmmc)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(cnxmmc);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                CommitmentltemCriteria.setBEZEICH(textCriteria);
            }
            if(!"".equals(sqdh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(sqdh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                CommitmentltemCriteria.setApplyNumber(textCriteria);
            }
            CommitmentltemQuery.setCriteria(CommitmentltemCriteria);
            CommitmentltemResultSet CommitmentltemResultSet ;
            try {
                CommitmentltemResultSet  = f.searchCommitmentltem(CommitmentltemQuery, publicmethod.setReposInfo());
                Commitmentltem[] Commitmentltems = CommitmentltemResultSet.getCommitmentltem();
                if(null == Commitmentltems) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = Commitmentltems.length < end ? Commitmentltems.length : end;
                
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    String sqdh_value = Commitmentltems[i].getApplyNumber();
                    String cwglfw_value = Commitmentltems[i].getFIKRS();
                    String cnxmbm_value = Commitmentltems[i].getFIPOS();
                    String cnxmmc_value = Commitmentltems[i].getBEZEICH();
                    String cnxmms_value = Commitmentltems[i].getBESCHR();
                    String cwyw_value = "";
                    FinanciaTransactionLookup FinanciaTransactionLookup = Commitmentltems[i].getFIVOR();
                    if(null != FinanciaTransactionLookup) {
                        cwyw_value = FinanciaTransactionLookup.getDisplayValue();
                    }
                    String cnxmlb_value = "";
                    CommitmentItemCategoryLookup CommitmentItemCategoryLookup = Commitmentltems[i].getKNZAEPO();
                    if(null != CommitmentItemCategoryLookup) {
                        cnxmlb_value = CommitmentItemCategoryLookup.getDisplayValue();
                    }
                    String sccnxm_value = "";
                    CommitmentltemLookup CommitmentltemLookup = Commitmentltems[i].getFICPOS();
                    if(null != CommitmentltemLookup) {
                        sccnxm_value = CommitmentltemLookup.getDisplayValue();
                    }
                    String mxcnxmbs_value = "";
                    Boolean mx = Commitmentltems[i].getCOMCAT();
                    if(mx == true) {
                        mxcnxmbs_value = "可直接记账";
                    } else {
                        mxcnxmbs_value = "不可直接记账";
                    }
                    String tjcnxm_value = "";
                    Boolean tj = Commitmentltems[i].getSTATS();
                    if(tj == true) {
                        tjcnxm_value = "是";
                    } else {
                        tjcnxm_value = "否";
                    }
                    Boolean djbs_value = Commitmentltems[i].getLVOMA();
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = Commitmentltems[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = Commitmentltems[i].getApplicant();
                    Calendar cal = Commitmentltems[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != cal) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    Calendar caltime = Commitmentltems[i].getApplyTime();
                    String sqsj_value = "";
                    if(null != caltime) {
                        caltime.add(Calendar.HOUR_OF_DAY, -8);
                        sqrq_value = new SimpleDateFormat("HH:mm").format(caltime.getTime());
                    }
                    String czbs_value = "";
                    OperationLookup OperationLookup = Commitmentltems[i].getOperation();
                    if(null != OperationLookup) {
                        czbs_value = OperationLookup.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = Commitmentltems[i].getServiceRelationshipsTuple();
                    if(null != serviceRelationshipsTuple && serviceRelationshipsTuple.length >0) {
                        JSONArray array = new JSONArray();
                        for(ServiceRelationshipsTupleTuple relation : serviceRelationshipsTuple) {
                            JSONObject ob = new JSONObject();
                            ClientLookup lookup = relation.getCLIENT_SYSTEM();
                            String client_value = "";
                            if(null != lookup) {
                                client_value = lookup.getDisplayValue();
                            }
                            String clientmessage_value = relation.getRETURN();
                            
                            DistributionStatusLookup dis = relation.getDISTUS();
                            String clientstatus_value = "";
                            if(null != dis) {
                                clientstatus_value = dis.getDisplayValue();
                            }
                            if(null == clientmessage_value) {
                                clientmessage_value = "";
                            }
                            if(null == clientstatus_value) {
                                clientstatus_value = "";
                            }
                            if(null == client_value) {
                                client_value = "";
                            }
                            ob.put("client", client_value);
                            ob.put("clientstatus", clientstatus_value);
                            ob.put("clientmessage", clientmessage_value);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    
                    String cnxmbm_val = "<a href=\"javascript:openwlbh('"+cnxmbm_value+"')\">"+cnxmbm_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("cnxmbm_value", cnxmbm_val);
                    } else {
                        jo.put("cnxmbm_value", cnxmbm_value);
                    }
                    jo.put("sqdh_value", sqdh_value);
                    jo.put("cwglfw_value", cwglfw_value);
                    jo.put("cnxmmc_value", cnxmmc_value);
                    jo.put("cnxmms_value", cnxmms_value);
                    jo.put("cwyw_value", cwyw_value);
                    String cwyw_chinese_value = getCwywChinese(cwyw_value);
                    jo.put("cwyw_chinese_value", cwyw_chinese_value);
                    jo.put("cnxmlb_value", cnxmlb_value);
                    String cnxmlb_chinese_value = getCnxmlbChinese(cnxmlb_value);
                    jo.put("cnxmlb_chinese_value", cnxmlb_chinese_value);
                    jo.put("sccnxm_value", sccnxm_value);
                    jo.put("mxcnxmbs_value", mxcnxmbs_value);
                    jo.put("tjcnxm_value", tjcnxm_value);
                    jo.put("djbs_value", djbs_value);
                    jo.put("spzt_value", spzt_value);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("czbs_value", czbs_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", Commitmentltems.length);
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
     * 获取财务业务中文名
     * 
     * @param value
     * @return
     */
    public String getCwywChinese(String value) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_cwyw where zt='0' and dm = '"+value+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 获取承诺项目类别中文名
     * 
     * @param value
     * @return
     */
    public String getCnxmlbChinese(String value) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_xmlb where zt='0' and dm = '"+value+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 根据承诺项目编号查询数据-供基本信息和服务关系用
     * 
     * @param gysbh
     * @return
     */
    public Map<String,Object> getdata(String cnxmbm) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
            CommitmentltemQuery CommitmentltemQuery = new CommitmentltemQuery();
            CommitmentltemCriteria CommitmentltemCriteria = new CommitmentltemCriteria();
            //承诺项目编码 查询条件
            if(!"".equals(cnxmbm)){
                CommitmentltemCriteria.setFIPOS(publicmethod.setTextCriteria(cnxmbm));
            }
            CommitmentltemQuery.setCriteria(CommitmentltemCriteria);
            CommitmentltemResultSet CommitmentltemResultSet ;
            try {
                CommitmentltemResultSet  = f.searchCommitmentltem(CommitmentltemQuery, publicmethod.setReposInfo());
                Commitmentltem[] Commitmentltems = CommitmentltemResultSet.getCommitmentltem();
                if(null == Commitmentltems) {
                    return new HashMap<String,Object>();
                }
                for(int i = 0 ; i < 1; i++){
                    String sqdh_value = Commitmentltems[i].getApplyNumber();
                    String cwglfw_value = Commitmentltems[i].getFIKRS();
                    String cnxmbm_value = Commitmentltems[i].getFIPOS();
                    String cnxmmc_value = Commitmentltems[i].getBEZEICH();
                    String cnxmms_value = Commitmentltems[i].getBESCHR();
                    String cwyw_value = "";
                    FinanciaTransactionLookup FinanciaTransactionLookup = Commitmentltems[i].getFIVOR();
                    if(null != FinanciaTransactionLookup) {
                        cwyw_value = FinanciaTransactionLookup.getDisplayValue();
                    }
                    String cnxmlb_value = "";
                    CommitmentItemCategoryLookup CommitmentItemCategoryLookup = Commitmentltems[i].getKNZAEPO();
                    if(null != CommitmentItemCategoryLookup) {
                        cnxmlb_value = CommitmentItemCategoryLookup.getDisplayValue();
                    }
                    String sccnxm_value = "";
                    CommitmentltemLookup CommitmentltemLookup = Commitmentltems[i].getFICPOS();
                    if(null != CommitmentltemLookup) {
                        sccnxm_value = CommitmentltemLookup.getDisplayValue();
                    }
                    String mxcnxmbs_value = "";
                    Boolean mx = Commitmentltems[i].getCOMCAT();
                    if(mx == true) {
                        mxcnxmbs_value = "可直接记账";
                    } else {
                        mxcnxmbs_value = "不可直接记账";
                    }
                    String tjcnxm_value = "";
                    Boolean tj = Commitmentltems[i].getSTATS();
                    if(tj == true) {
                        tjcnxm_value = "是";
                    } else {
                        tjcnxm_value = "否";
                    }
                    Boolean djbs_value = Commitmentltems[i].getLVOMA();
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = Commitmentltems[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = Commitmentltems[i].getApplicant();
                    Calendar cal = Commitmentltems[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != cal) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    Calendar caltime = Commitmentltems[i].getApplyTime();
                    String sqsj_value = "";
                    if(null != caltime) {
                        caltime.add(Calendar.HOUR_OF_DAY, -8);
                        sqrq_value = new SimpleDateFormat("HH:mm").format(caltime.getTime());
                    }
                    String czbs_value = "";
                    OperationLookup OperationLookup = Commitmentltems[i].getOperation();
                    if(null != OperationLookup) {
                        czbs_value = OperationLookup.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = Commitmentltems[i].getServiceRelationshipsTuple();
                    if(null != serviceRelationshipsTuple && serviceRelationshipsTuple.length >0) {
                        List<Map<String,String>> array = new ArrayList<Map<String,String>>();
                        for(ServiceRelationshipsTupleTuple relation : serviceRelationshipsTuple) {
                            Map<String,String> ob = new HashMap<String,String>();
                            ClientLookup lookup = relation.getCLIENT_SYSTEM();
                            String client_value = "";
                            if(null != lookup) {
                                client_value = lookup.getDisplayValue();
                            }
                            String clientmessage_value = relation.getRETURN();
                            
                            DistributionStatusLookup dis = relation.getDISTUS();
                            String clientstatus_value = "";
                            if(null != dis) {
                                clientstatus_value = dis.getDisplayValue();
                            }
                            if(null == clientmessage_value) {
                                clientmessage_value = "";
                            }
                            if(null == clientstatus_value) {
                                clientstatus_value = "";
                            }
                            if(null == client_value) {
                                client_value = "";
                            }
                            ob.put("client", client_value);
                            ob.put("clientstatus", clientstatus_value);
                            ob.put("clientmessage", clientmessage_value);
                            array.add(ob);
                        }
                        map.put("client", array);
                    }
                    
                    String cnxmbm_val = "<a href=\"javascript:openwlbh('"+cnxmbm_value+"')\">"+cnxmbm_value+"</a>";
                    if(!"".equals("")){
                        map.put("cnxmbm_value", cnxmbm_val);
                    } else {
                        map.put("cnxmbm_value", cnxmbm_value);
                    }
                    map.put("sqdh_value", sqdh_value);
                    map.put("cwglfw_value", cwglfw_value);
                    map.put("cnxmmc_value", cnxmmc_value);
                    map.put("cnxmms_value", cnxmms_value);
                    map.put("cwyw_value", cwyw_value);
                    String cwyw_chinese_value = getCwywChinese(cwyw_value);
                    map.put("cwyw_chinese_value", cwyw_chinese_value);
                    map.put("cnxmlb_value", cnxmlb_value);
                    String cnxmlb_chinese_value = getCnxmlbChinese(cnxmlb_value);
                    map.put("cnxmlb_chinese_value", cnxmlb_chinese_value);
                    map.put("cnxmlb_value", cnxmlb_value);
                    map.put("sccnxm_value", sccnxm_value);
                    map.put("mxcnxmbs_value", mxcnxmbs_value);
                    map.put("tjcnxm_value", tjcnxm_value);
                    map.put("djbs_value", djbs_value);
                    map.put("spzt_value", spzt_value);
                    map.put("sqr_value", sqr_value);
                    map.put("sqrq_value", sqrq_value);
                    map.put("sqsj_value", sqsj_value);
                    map.put("czbs_value", czbs_value);
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
        CNXMPublicMethod publicmethod = new CNXMPublicMethod();
        try {
            JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
            JSONArray jsonArray = new JSONArray();
            CommitmentltemQuery CommitmentltemQuery = new CommitmentltemQuery();
            CommitmentltemCriteria CommitmentltemCriteria = new CommitmentltemCriteria();
            //承诺项目编码 查询条件
//            if(!"".equals(cnxmbm)){
//                TextCriteria textCriteria = new TextCriteria();
//                TextConstraint[] textConstraints = new TextConstraint[1];
//                TextConstraint textConstraint = new TextConstraint();
//                textConstraint.setExpressionOperator("CONTAINS");
//                textConstraint.setValue(cnxmbm);
//                textConstraints[0] = textConstraint;
//                textCriteria.setConstraint(textConstraints);
//                CommitmentltemCriteria.setFIPOS(textCriteria);
//            }
//            //承诺项目名称 查询条件
//            if(!"".equals(cnxmmc)){
//                TextCriteria textCriteria = new TextCriteria();
//                TextConstraint[] textConstraints = new TextConstraint[1];
//                TextConstraint textConstraint = new TextConstraint();
//                textConstraint.setExpressionOperator("CONTAINS");
//                textConstraint.setValue(cnxmmc);
//                textConstraints[0] = textConstraint;
//                textCriteria.setConstraint(textConstraints);
//                CommitmentltemCriteria.setBEZEICH(textCriteria);
//            }
//            if(!"".equals(sqdh)){
//                TextCriteria textCriteria = new TextCriteria();
//                TextConstraint[] textConstraints = new TextConstraint[1];
//                TextConstraint textConstraint = new TextConstraint();
//                textConstraint.setExpressionOperator("CONTAINS");
//                textConstraint.setValue(sqdh);
//                textConstraints[0] = textConstraint;
//                textCriteria.setConstraint(textConstraints);
//                CommitmentltemCriteria.setApplyNumber(textCriteria);
//            }
            CommitmentltemQuery.setCriteria(CommitmentltemCriteria);
            CommitmentltemResultSet CommitmentltemResultSet ;
            try {
                CommitmentltemResultSet  = f.searchCommitmentltem(CommitmentltemQuery, publicmethod.setReposInfo());
                Commitmentltem[] Commitmentltems = CommitmentltemResultSet.getCommitmentltem();
                if(null == Commitmentltems) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    return;
                }
                int endtotal = Commitmentltems.length;
                
                for(int i = 0 ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    String sqdh_value = Commitmentltems[i].getApplyNumber();
                    String cwglfw_value = Commitmentltems[i].getFIKRS();
                    String cnxmbm_value = Commitmentltems[i].getFIPOS();
                    String cnxmmc_value = Commitmentltems[i].getBEZEICH();
                    String cnxmms_value = Commitmentltems[i].getBESCHR();
                    String cwyw_value = "";
                    FinanciaTransactionLookup FinanciaTransactionLookup = Commitmentltems[i].getFIVOR();
                    if(null != FinanciaTransactionLookup) {
                        cwyw_value = FinanciaTransactionLookup.getDisplayValue();
                    }
                    String cnxmlb_value = "";
                    CommitmentItemCategoryLookup CommitmentItemCategoryLookup = Commitmentltems[i].getKNZAEPO();
                    if(null != CommitmentItemCategoryLookup) {
                        cnxmlb_value = CommitmentItemCategoryLookup.getDisplayValue();
                    }
                    String sccnxm_value = "";
                    CommitmentltemLookup CommitmentltemLookup = Commitmentltems[i].getFICPOS();
                    if(null != CommitmentltemLookup) {
                        sccnxm_value = CommitmentltemLookup.getDisplayValue();
                    }
                    String mxcnxmbs_value = "";
                    Boolean mx = Commitmentltems[i].getCOMCAT();
                    if(mx == true) {
                        mxcnxmbs_value = "可直接记账";
                    } else {
                        mxcnxmbs_value = "不可直接记账";
                    }
                    String tjcnxm_value = "";
                    Boolean tj = Commitmentltems[i].getSTATS();
                    if(tj == true) {
                        tjcnxm_value = "是";
                    } else {
                        tjcnxm_value = "否";
                    }
                    Boolean djbs_value = Commitmentltems[i].getLVOMA();
                    String spzt_value = "";
                    ApprovalStatusLookup ApprovalStatusLookup = Commitmentltems[i].getAPCOD();
                    if(null != ApprovalStatusLookup) {
                        spzt_value = ApprovalStatusLookup.getDisplayValue();
                    }
                    String sqr_value = Commitmentltems[i].getApplicant();
                    Calendar cal = Commitmentltems[i].getApplyDate();
                    String sqrq_value = "";
                    if(null != cal) {
                        sqrq_value = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
                    }
                    Calendar caltime = Commitmentltems[i].getApplyTime();
                    String sqsj_value = "";
                    if(null != cal) {
                        sqrq_value = new SimpleDateFormat("HH:mm").format(caltime.getTime());
                    }
                    String czbs_value = "";
                    OperationLookup OperationLookup = Commitmentltems[i].getOperation();
                    if(null != OperationLookup) {
                        czbs_value = OperationLookup.getDisplayValue();
                    }
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = Commitmentltems[i].getServiceRelationshipsTuple();
                    if(null != serviceRelationshipsTuple && serviceRelationshipsTuple.length >0) {
                        JSONArray array = new JSONArray();
                        for(ServiceRelationshipsTupleTuple relation : serviceRelationshipsTuple) {
                            JSONObject ob = new JSONObject();
                            ClientLookup lookup = relation.getCLIENT_SYSTEM();
                            String client_value = "";
                            if(null != lookup) {
                                client_value = lookup.getDisplayValue();
                            }
                            String clientmessage_value = relation.getRETURN();
                            
                            DistributionStatusLookup dis = relation.getDISTUS();
                            String clientstatus_value = "";
                            if(null != dis) {
                                clientstatus_value = dis.getDisplayValue();
                            }
                            if(null == clientmessage_value) {
                                clientmessage_value = "";
                            }
                            if(null == clientstatus_value) {
                                clientstatus_value = "";
                            }
                            if(null == client_value) {
                                client_value = "";
                            }
                            ob.put("client", client_value);
                            ob.put("clientstatus", clientstatus_value);
                            ob.put("clientmessage", clientmessage_value);
                            array.add(ob);
                        }
                        jo.put("client", array);
                    }
                    String cnxmbm_val = "<a href=\"javascript:openwlbh('"+cnxmbm_value+"')\">"+cnxmbm_value+"</a>";
                    if(!"".equals("")){
                        jo.put("cnxmbm_value", cnxmbm_val);
                    } else {
                        jo.put("cnxmbm_value", cnxmbm_value);
                    }
                    jo.put("sqdh_value", sqdh_value);
                    jo.put("cwglfw_value", cwglfw_value);
                    jo.put("cnxmmc_value", cnxmmc_value);
                    jo.put("cnxmms_value", cnxmms_value);
                    jo.put("cwyw_value", cwyw_value);
                    jo.put("cnxmlb_value", cnxmlb_value);
                    jo.put("sccnxm_value", sccnxm_value);
                    jo.put("mxcnxmbs_value", mxcnxmbs_value);
                    jo.put("tjcnxm_value", tjcnxm_value);
                    jo.put("djbs_value", djbs_value);
                    jo.put("spzt_value", spzt_value);
                    jo.put("spzt", spzt_value);
                    jo.put("sqr_value", sqr_value);
                    jo.put("sqrq_value", sqrq_value);
                    jo.put("sqsj_value", sqsj_value);
                    jo.put("czbs_value", czbs_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", Commitmentltems.length);
                jsonresult.put("result", jsonArray);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
}
