package weaver.interfaces.gx.jyl.kjkm;

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

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Client;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.ws.mdm.sap.com.BooleanConstraint;
import beans.ws.mdm.sap.com.BooleanCriteria;
import beans.ws.mdm.sap.com.PicklistConstraint;
import beans.ws.mdm.sap.com.PicklistCriteria;
import beans.ws.mdm.sap.com.RecordIdentifierConstraint;
import beans.ws.mdm.sap.com.ResultDefinition;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class KJKMServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private KJKMPublicMethod publicmethod = new KJKMPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String jjzxdm = Util.null2String(request.getParameter("kjkmdm"));
        String userid = Util.null2String(request.getParameter("userid"));
        String flag = Util.null2String(request.getParameter("flag"));
        String jjzxmc = Util.null2String(request.getParameter("kjkmmc"));
        String djbs = Util.null2String(request.getParameter("djbz"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String start = Util.null2String(request.getParameter("start"));
        String fwgx_search = Util.null2String(request.getParameter("fwgx"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSONArray jsonArray = new JSONArray();
            JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();
            AccountsQuery accountsQuery  = new AccountsQuery();
            AccountsCriteria accountsCriteria = new AccountsCriteria();
            if(!"".equals(jjzxdm)){
                TextCriteria criteria = setTextcriteria(jjzxdm);
                accountsCriteria.setSAKNR(criteria);
            }
            if(!"".equals(jjzxmc)){
                TextCriteria criteria = setTextcriteria(jjzxmc);
                accountsCriteria.setTXT20_ML(criteria);
            }
            if(!"".equals(userid)){
                TextCriteria criteria = setTextcriteria(userid);
                accountsCriteria.setApplicant(criteria);
            }
            if(!"".equals(sqdh)){
                TextCriteria criteria = setTextcriteria(sqdh);
                accountsCriteria.setApplyNumber(criteria);
            }
            if(!"".equals(fwgx_search)) {
                ClientQuery ClientQuery = new ClientQuery();
                ClientCriteria ClientCriteria = new ClientCriteria();
                ClientCriteria.setCode(publicmethod.setTextCriteria(fwgx_search));
                ClientQuery.setCriteria(ClientCriteria);
                ClientResultSet ClientResultSet = proxy.searchClient(ClientQuery, publicmethod.setReposInfo());
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
                        accountsCriteria.setServiceRelationshipsTupleCLIENT_SYSTEM(PicklistCriteria);
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
            if(!"".equals(djbs)) {
                BooleanCriteria BooleanCriteria = new BooleanCriteria();
                BooleanConstraint[] BooleanConstraints = new BooleanConstraint[1];
                BooleanConstraint BooleanConstraint = new BooleanConstraint();
                if("true".equals(djbs)) {
                    BooleanConstraint.setValue(true);
                }
                if("false".equals(djbs)) {
                    BooleanConstraint.setValue(false);
                }
                BooleanConstraints[0] = BooleanConstraint;
                BooleanCriteria.setConstraint(BooleanConstraints);
                accountsCriteria.setXSPEB(BooleanCriteria);
            }
            accountsQuery.setCriteria(accountsCriteria);
            AccountsResultSet accountsResultSet = null;
            try {
                accountsResultSet = proxy.searchAccounts(accountsQuery, publicmethod.setReposInfo());
                Accounts[] accounts = accountsResultSet.getAccounts();
                if(null == accounts) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = accounts.length < end ? accounts.length : end;
                
                //TODO 调用webservice接口获取数据,把数据放在LinkedList里面，根据分页的数量显示对应的内容
                
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //总帐科目
                    String kjkmdm_value = accounts[i].getSAKNR();
                    //科目组
                    AccountGroupLookup kmzdm = accounts[i].getKTOKS();
                    String kmzdm_value = "";
                    if(null != kmzdm) {
                        kmzdm_value = kmzdm.getDisplayValue();
                    }
                    //科目类型
                    AccountTypeLookup account_type = accounts[i].getAccountType();
                    String account_type_value = "";
                    if(null != account_type) {
                        account_type_value = account_type.getDisplayValue();
                    }
                    //会计科目名称
                    String kjkmmc_value = accounts[i].getTXT20_ML();
                    //会计科目说明
                    String kjkmsm_value = accounts[i].getTXT50_ML();
                    //冻结标识
                    boolean djbz = accounts[i].getXSPEB();
                    //审批状态代码
                    ApprovalStatusLookup code = accounts[i].getAPCOD();
                    String code_value = "";
                    if(null != code) {
                        code_value = code.getDisplayValue();
                    }
                    //申请人
                    String sqr = accounts[i].getApplicant();
                    //申请日期
                    Calendar yxqsy_value = accounts[i].getApplyDate();
                    String yxqsy_str = "";
                    if(null == yxqsy_value) {
                        yxqsy_str = "";
                    } else {
                        yxqsy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqsy_value.getTime());
                    }
                    //申请时间
                    Calendar yxqzy_value = accounts[i].getApplyTime();
                    String yxqzy_str = "";
                    if(null == yxqzy_value) {
                        yxqzy_str = "";
                    } else {
                        yxqzy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqzy_value.getTime());
                    }
                    //申请号
                    String sqh_value = accounts[i].getApplyNumber();
                    //创建日期
                    String createdate_value = "";
                    Calendar createdate = accounts[i].getCreateDate();
                    if(null == createdate) {
                        createdate_value = "";
                    } else {
                        createdate_value = new SimpleDateFormat("yyyy-MM-dd").format(createdate.getTime());
                    }
                    //更新者
                    String updater = accounts[i].getUpdateBy();
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = accounts[i].getServiceRelationshipsTuple();
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
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+kjkmdm_value+"')\">"+kjkmdm_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("jjzxdm", jjzxdm_val);
                    } else {
                        jo.put("jjzxdm", kjkmdm_value);
                    }
                    jo.put("kjkmmc", kjkmmc_value);
                    jo.put("kmzdm_value", kmzdm_value);
                    String kmzdmChinese_value = getKmzdmChinese(kmzdm_value);
                    jo.put("kmzdmChinese_value", kmzdmChinese_value);
                    jo.put("accounttype", account_type_value);
                    String account_type_chinese_value = getAccountTypeChinese(account_type_value);
                    jo.put("account_type_chinese_value", account_type_chinese_value);
                    jo.put("kjkmsm", kjkmsm_value);
                    jo.put("sqrq", yxqsy_str);
                    jo.put("sqsj", yxqzy_str);
                    jo.put("sqh", sqh_value);
                    jo.put("createdate", createdate_value);
                    jo.put("creater", sqr);
                    jo.put("updater", updater);
                    jo.put("spzt", code_value);
                    jo.put("djbz", djbz);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", accounts.length);
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
     * 根据会计科目编号查询数据-供基本信息和服务关系用
     * 
     * @param kjkmbh
     * @return
     */
    public Map<String,Object> getdata(String kjkmbh) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();
            AccountsQuery accountsQuery  = new AccountsQuery();
            AccountsCriteria accountsCriteria = new AccountsCriteria();
            if(!"".equals(kjkmbh)){
                accountsCriteria.setSAKNR(publicmethod.setTextCriteria(kjkmbh));
            }
            accountsQuery.setCriteria(accountsCriteria);
            AccountsResultSet accountsResultSet = null;
            try {
                accountsResultSet = proxy.searchAccounts(accountsQuery, publicmethod.setReposInfo());
                Accounts[] accounts = accountsResultSet.getAccounts();
                if(null == accounts) {
                    return new HashMap<String,Object>();
                }
                for(int i = 0 ; i < 1; i++){
                    //总帐科目
                    String kjkmdm_value = accounts[i].getSAKNR();
                    //科目组
                    AccountGroupLookup kmzdm = accounts[i].getKTOKS();
                    String kmzdm_value = "";
                    if(null != kmzdm) {
                        kmzdm_value = kmzdm.getDisplayValue();
                    }
                    //科目类型
                    AccountTypeLookup account_type = accounts[i].getAccountType();
                    String account_type_value = "";
                    if(null != account_type) {
                        account_type_value = account_type.getDisplayValue();
                    }
                    //会计科目名称
                    String kjkmmc_value = accounts[i].getTXT20_ML();
                    //会计科目说明
                    String kjkmsm_value = accounts[i].getTXT50_ML();
                    //冻结标识
                    boolean djbz = accounts[i].getXSPEB();
                    //审批状态代码
                    ApprovalStatusLookup code = accounts[i].getAPCOD();
                    String code_value = "";
                    if(null != code) {
                        code_value = code.getDisplayValue();
                    }
                    //申请人
                    String sqr = accounts[i].getApplicant();
                    //申请日期
                    Calendar yxqsy_value = accounts[i].getApplyDate();
                    String yxqsy_str = "";
                    if(null == yxqsy_value) {
                        yxqsy_str = "";
                    } else {
                        yxqsy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqsy_value.getTime());
                    }
                    //申请时间
                    Calendar yxqzy_value = accounts[i].getApplyTime();
                    String yxqzy_str = "";
                    if(null == yxqzy_value) {
                        yxqzy_str = "";
                    } else {
                        yxqzy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqzy_value.getTime());
                    }
                    //申请号
                    String sqh_value = accounts[i].getApplyNumber();
                    //创建日期
                    String createdate_value = "";
                    Calendar createdate = accounts[i].getCreateDate();
                    if(null == createdate) {
                        createdate_value = "";
                    } else {
                        createdate_value = new SimpleDateFormat("yyyy-MM-dd").format(createdate.getTime());
                    }
                    //更新者
                    String updater = accounts[i].getUpdateBy();
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = accounts[i].getServiceRelationshipsTuple();
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
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+kjkmdm_value+"')\">"+kjkmdm_value+"</a>";
                    if(!"".equals("")){
                        map.put("jjzxdm", jjzxdm_val);
                    } else {
                        map.put("jjzxdm", kjkmdm_value);
                    }
                    map.put("kjkmmc", kjkmmc_value);
                    map.put("kmzdm_value", kmzdm_value);
                    String kmzdmChinese_value = getKmzdmChinese(kmzdm_value);
                    map.put("kmzdmChinese_value", kmzdmChinese_value);
                    map.put("accounttype", account_type_value);
                    String account_type_chinese_value = getAccountTypeChinese(account_type_value);
                    map.put("account_type_chinese_value", account_type_chinese_value);
                    map.put("kjkmsm", kjkmsm_value);
                    map.put("sqrq", yxqsy_str);
                    map.put("sqsj", yxqzy_str);
                    map.put("sqh", sqh_value);
                    map.put("createdate", createdate_value);
                    map.put("creater", sqr);
                    map.put("updater", updater);
                    map.put("spzt", code_value);
                    map.put("djbz", djbz);
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
     * 获取类型
     * 
     * @param accountype
     * @return
     */
    public String getAccountTypeChinese(String accountype) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_kmlx where zt='0' and dm = '"+accountype+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 获取科目组代码中文名
     * 
     * @param kmzdm
     * @return
     */
    public String getKmzdmChinese(String kmzdm) {
        RecordSet rs = new RecordSet();
        rs.execute("select mc from uf_kmz where zt='0' and dm = '"+kmzdm+"'");
        rs.next();
        String mc = Util.null2o(rs.getString("mc"));
        return mc;
    }
    
    /**
     * 设置查询参数
     * 
     * @param value
     * @return
     */
    public TextCriteria setTextcriteria(String value){
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("CONTAINS");
        textConstraint.setValue(value);
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
        JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();
        KJKMPublicMethod pub = new KJKMPublicMethod();
        AccountsQuery accountsQuery  = new AccountsQuery();
        AccountsCriteria criteria = new AccountsCriteria();
        accountsQuery.setCriteria(criteria);
        
        try {
            AccountsResultSet accountsResultSet = proxy.searchAccounts(accountsQuery, pub.setReposInfo());
            Accounts[] Accounts = accountsResultSet.getAccounts();
            for(Accounts account : Accounts) {
                System.out.println(account.getTXT20_ML());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
